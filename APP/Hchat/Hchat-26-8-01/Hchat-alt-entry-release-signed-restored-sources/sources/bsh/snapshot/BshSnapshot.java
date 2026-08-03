package bsh.snapshot;

import bsh.Node;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class BshSnapshot implements Serializable {
    public static final int FORMAT_VERSION = 1;
    private static final long serialVersionUID = 1;
    private final int formatVersion = 1;
    private final Node[] nodes;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BshSnapshot(Node[] nodeArr) {
        this.nodes = nodeArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int getFormatVersion() {
        return this.formatVersion;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Node[] getNodes() {
        return this.nodes;
    }
}
