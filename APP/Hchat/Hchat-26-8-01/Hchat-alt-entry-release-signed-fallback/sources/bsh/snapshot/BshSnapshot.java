package bsh.snapshot;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class BshSnapshot implements java.io.Serializable {
    public static final int FORMAT_VERSION = 1;
    private static final long serialVersionUID = 1;
    private final int formatVersion;
    private final bsh.Node[] nodes;

    public BshSnapshot(bsh.Node[] r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.formatVersion = r0
            r1.nodes = r2
            return
    }

    public int getFormatVersion() {
            r1 = this;
            int r0 = r1.formatVersion
            return r0
    }

    public bsh.Node[] getNodes() {
            r1 = this;
            bsh.Node[] r0 = r1.nodes
            return r0
    }
}
