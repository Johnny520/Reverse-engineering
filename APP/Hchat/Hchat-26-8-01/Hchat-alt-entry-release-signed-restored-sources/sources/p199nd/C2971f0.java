package p199nd;

import md.C2825b;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p214oc.InterfaceC3124a;
import p214oc.InterfaceC3125b;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: nd.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2971f0 implements InterfaceC3125b {

    /* JADX INFO: renamed from: g */
    public String f9728g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2971f0(AbstractC2963b0 abstractC2963b0) {
        C2971f0 c2971f0 = (C2971f0) abstractC2963b0.f9217g.mo6237c(C2825b.f9187b);
        if (c2971f0 != null) {
            this.f9728g = c2971f0.f9728g;
        } else {
            this.f9728g = HttpUrl.FRAGMENT_ENCODE_SET;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p214oc.InterfaceC3125b
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ InterfaceC3124a mo441a() {
        return C2825b.f9187b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m6390b(String str) {
        boolean zIsEmpty = this.f9728g.isEmpty();
        String str2 = this.f9728g;
        if (zIsEmpty) {
            this.f9728g = AbstractC0255e.m1020i(str2, str);
        } else {
            this.f9728g = AbstractC4855en.m9264h(str2, " and ", str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC4855en.m9263g("RENAME_REASON:", this.f9728g);
    }

    public C2971f0(String str) {
        this.f9728g = str;
    }

    public C2971f0(AbstractC2963b0 abstractC2963b0, boolean z9, boolean z10) {
        this(abstractC2963b0);
        if (z9) {
            m6390b("not valid java name");
        }
        if (z10) {
            m6390b("contains not printable characters");
        }
    }
}
