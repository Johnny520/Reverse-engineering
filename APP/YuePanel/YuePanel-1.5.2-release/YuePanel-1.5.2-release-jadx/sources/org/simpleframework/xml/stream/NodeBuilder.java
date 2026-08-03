package org.simpleframework.xml.stream;

import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

/* JADX INFO: loaded from: classes2.dex */
public final class NodeBuilder {
    private static Provider PROVIDER = ProviderFactory.getInstance();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static InputNode read(InputStream inputStream) throws Exception {
        return read(PROVIDER.provide(inputStream));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static OutputNode write(Writer writer) throws Exception {
        return write(writer, new Format());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static InputNode read(Reader reader) throws Exception {
        return read(PROVIDER.provide(reader));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public static OutputNode write(Writer writer, Format format) throws Exception {
        return new NodeWriter(writer, format).writeRoot();
    }

    private static InputNode read(EventReader eventReader) throws Exception {
        return new NodeReader(eventReader).readRoot();
    }
}
