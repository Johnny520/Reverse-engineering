package org.simpleframework.xml.stream;

import java.io.InputStream;
import java.io.Reader;
import javax.xml.parsers.DocumentBuilderFactory;
import org.xml.sax.InputSource;

/* JADX INFO: loaded from: classes2.dex */
class DocumentProvider implements Provider {
    private final DocumentBuilderFactory factory;

    public DocumentProvider() {
        DocumentBuilderFactory documentBuilderFactoryNewInstance = DocumentBuilderFactory.newInstance();
        this.factory = documentBuilderFactoryNewInstance;
        documentBuilderFactoryNewInstance.setNamespaceAware(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(InputStream inputStream) throws Exception {
        return provide(new InputSource(inputStream));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(Reader reader) throws Exception {
        return provide(new InputSource(reader));
    }

    private EventReader provide(InputSource inputSource) throws Exception {
        return new DocumentReader(this.factory.newDocumentBuilder().parse(inputSource));
    }
}
