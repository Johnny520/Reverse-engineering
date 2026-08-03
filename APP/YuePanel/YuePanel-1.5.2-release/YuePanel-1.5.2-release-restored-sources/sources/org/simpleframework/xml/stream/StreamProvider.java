package org.simpleframework.xml.stream;

import Yue.AbstractC8553;
import Yue.InterfaceC8549;
import java.io.InputStream;
import java.io.Reader;

/* JADX INFO: loaded from: classes2.dex */
class StreamProvider implements Provider {
    private final AbstractC8553 factory = AbstractC8553.m28451();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(InputStream inputStream) throws Exception {
        return provide(this.factory.mo18435(inputStream));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // org.simpleframework.xml.stream.Provider
    public EventReader provide(Reader reader) throws Exception {
        return provide(this.factory.mo18437(reader));
    }

    private EventReader provide(InterfaceC8549 interfaceC8549) throws Exception {
        return new StreamReader(interfaceC8549);
    }
}
