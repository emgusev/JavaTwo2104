package prodlike;

import prodlike.model.Publication;

public interface PublicationService {
    /**
     * Дай самую горячую публикацию
     */
    Publication getHotPublication();
}
