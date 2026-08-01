package p157k8;

import p024b9.AbstractC1043k;
import p375zc.AbstractC9957l;

/* JADX INFO: renamed from: k8.p2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4129p2 extends Exception {

    /* JADX INFO: renamed from: q */
    public final int f12110q;

    /* JADX INFO: renamed from: r */
    public final AbstractC9957l f12111r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4129p2(int i10, String str, AbstractC9957l abstractC9957l, Throwable th) {
        super("MCP error " + i10 + ": " + str, th);
        str.getClass();
        this.f12110q = i10;
        this.f12111r = abstractC9957l;
    }

    public /* synthetic */ C4129p2(int i10, String str, AbstractC9957l abstractC9957l, Throwable th, int i11, AbstractC1043k abstractC1043k) {
        this(i10, str, (i11 & 4) != 0 ? null : abstractC9957l, (i11 & 8) != 0 ? null : th);
    }
}
