package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class NodeBuilder {
    private static org.simpleframework.xml.stream.Provider PROVIDER;

    static {
            org.simpleframework.xml.stream.Provider r0 = org.simpleframework.xml.stream.ProviderFactory.getInstance()
            org.simpleframework.xml.stream.NodeBuilder.PROVIDER = r0
            return
    }

    public NodeBuilder() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.simpleframework.xml.stream.InputNode read(java.io.InputStream r1) {
            org.simpleframework.xml.stream.Provider r0 = org.simpleframework.xml.stream.NodeBuilder.PROVIDER
            org.simpleframework.xml.stream.EventReader r1 = r0.provide(r1)
            org.simpleframework.xml.stream.InputNode r1 = read(r1)
            return r1
    }

    public static org.simpleframework.xml.stream.InputNode read(java.io.Reader r1) {
            org.simpleframework.xml.stream.Provider r0 = org.simpleframework.xml.stream.NodeBuilder.PROVIDER
            org.simpleframework.xml.stream.EventReader r1 = r0.provide(r1)
            org.simpleframework.xml.stream.InputNode r1 = read(r1)
            return r1
    }

    private static org.simpleframework.xml.stream.InputNode read(org.simpleframework.xml.stream.EventReader r1) {
            org.simpleframework.xml.stream.NodeReader r0 = new org.simpleframework.xml.stream.NodeReader
            r0.<init>(r1)
            org.simpleframework.xml.stream.InputNode r1 = r0.readRoot()
            return r1
    }

    public static org.simpleframework.xml.stream.OutputNode write(java.io.Writer r1) {
            org.simpleframework.xml.stream.Format r0 = new org.simpleframework.xml.stream.Format
            r0.<init>()
            org.simpleframework.xml.stream.OutputNode r1 = write(r1, r0)
            return r1
    }

    public static org.simpleframework.xml.stream.OutputNode write(java.io.Writer r1, org.simpleframework.xml.stream.Format r2) {
            org.simpleframework.xml.stream.NodeWriter r0 = new org.simpleframework.xml.stream.NodeWriter
            r0.<init>(r1, r2)
            org.simpleframework.xml.stream.OutputNode r1 = r0.writeRoot()
            return r1
    }
}
