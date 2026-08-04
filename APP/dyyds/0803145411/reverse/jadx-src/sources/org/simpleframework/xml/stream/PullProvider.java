package org.simpleframework.xml.stream;

import java.io.InputStream;
import java.io.Reader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
class PullProvider implements Provider {
    private final XmlPullParserFactory factory;

    public PullProvider() throws XmlPullParserException {
        XmlPullParserFactory xmlPullParserFactoryNewInstance = XmlPullParserFactory.newInstance();
        this.factory = xmlPullParserFactoryNewInstance;
        xmlPullParserFactoryNewInstance.setNamespaceAware(true);
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(InputStream inputStream) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = this.factory.newPullParser();
        if (inputStream != null) {
            xmlPullParserNewPullParser.setInput(inputStream, null);
        }
        return new PullReader(xmlPullParserNewPullParser);
    }

    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(Reader reader) throws XmlPullParserException {
        XmlPullParser xmlPullParserNewPullParser = this.factory.newPullParser();
        if (reader != null) {
            xmlPullParserNewPullParser.setInput(reader);
        }
        return new PullReader(xmlPullParserNewPullParser);
    }
}
