package mate.academy.service.impl;

import java.time.LocalDate;
import java.util.List;
import mate.academy.dao.MovieSessionDao;
import mate.academy.lib.Inject;
import mate.academy.model.MovieSession;
import mate.academy.service.MovieSessionService;

public class MovieSessionServiceImpl implements MovieSessionService {

    @Inject
    private final MovieSessionDao movieSessionDao;

    public MovieSessionServiceImpl(MovieSessionDao movieSessionDao) {
        this.movieSessionDao = movieSessionDao;
    }

    @Override
    public MovieSession add(MovieSession movieSession) {
        return movieSessionDao.add(movieSession);
    }

    @Override
    public MovieSession get(Long id) {
        return movieSessionDao.get(id).orElse(null);
    }

    @Override
    public List<MovieSession> findAvailableSessions(Long movieId, LocalDate date) {
        return movieSessionDao.findAvailableSessions(movieId, date);
    }
}