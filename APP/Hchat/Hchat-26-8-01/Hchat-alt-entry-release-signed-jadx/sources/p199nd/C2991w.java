package p199nd;

import md.C2825b;
import p214oc.AbstractC3127d;
import p214oc.InterfaceC3124a;
import p302ud.C4320p;

/* JADX INFO: renamed from: nd.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2991w extends AbstractC3127d {

    /* JADX INFO: renamed from: i */
    public static final C2991w f9762i = new C2991w(null, null);

    /* JADX INFO: renamed from: g */
    public final C4320p f9763g;

    /* JADX INFO: renamed from: h */
    public final int[] f9764h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2991w(C4320p c4320p, int[] iArr) {
        this.f9763g = c4320p;
        this.f9764h = iArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9199n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C4320p c4320p = this.f9763g;
        return c4320p == null ? "INLINE_NOT_NEEDED" : "INLINE: ".concat(String.valueOf(c4320p));
    }
}
