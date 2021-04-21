package prodlike.impl;

import prodlike.PublicationService;
import prodlike.model.Publication;

/**
 * Получение публиукации из базы
 */
public class DbPublicationService implements PublicationService {
    @Override
    public Publication getHotPublication() {
        return new Publication();
    }
}
