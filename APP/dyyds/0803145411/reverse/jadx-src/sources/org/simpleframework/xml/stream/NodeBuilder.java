package org.simpleframework.xml.stream;

import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class NodeBuilder {
    private static Provider PROVIDER = ProviderFactory.getInstance();

    public static InputNode read(InputStream inputStream) {
        return read(PROVIDER.provide(inputStream));
    }

    public static OutputNode write(Writer writer) {
        return write(writer, new Format());
    }

    public static OutputNode write(Writer writer, Format format) {
        return new NodeWriter(writer, format).writeRoot();
    }

    public static InputNode read(Reader reader) {
        return read(PROVIDER.provide(reader));
    }

    private static InputNode read(EventReader eventReader) {
        return new NodeReader(eventReader).readRoot();
    }
}
