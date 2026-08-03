package p190n2;

import gg.AbstractC1426v;
import okhttp3.HttpUrl;
import p035c8.C0412a;
import p150k5.C2263n;

/* JADX INFO: renamed from: n2.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2869d implements InterfaceC2872g {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p190n2.InterfaceC2872g
    /* JADX INFO: renamed from: a */
    public final void mo2428a(C2263n c2263n) {
        c2263n.m5509f(0, ((C0412a) c2263n.f7510l).m1373b(), HttpUrl.FRAGMENT_ENCODE_SET);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        return obj instanceof C2869d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return AbstractC1426v.m3834a(C2869d.class).hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "DeleteAllCommand()";
    }
}
