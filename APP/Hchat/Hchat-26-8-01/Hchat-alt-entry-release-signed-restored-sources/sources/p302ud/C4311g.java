package p302ud;

import java.util.Collections;
import java.util.List;
import p020b5.C0192k;
import p025bc.AbstractC0255e;
import p025bc.C0263m;
import p199nd.AbstractC2963b0;
import p215od.C3130c;
import p246qd.AbstractC3506j;

/* JADX INFO: renamed from: ud.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4311g extends AbstractC2963b0 implements InterfaceC4316l {

    /* JADX INFO: renamed from: k */
    public final C4309e f14389k;

    /* JADX INFO: renamed from: l */
    public final C3130c f14390l;

    /* JADX INFO: renamed from: m */
    public C0192k f14391m;

    /* JADX INFO: renamed from: n */
    public AbstractC3506j f14392n;

    /* JADX INFO: renamed from: o */
    public List f14393o = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: p */
    public C0263m f14394p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4311g(C4309e c4309e, C3130c c3130c, int i9) {
        this.f14389k = c4309e;
        this.f14390l = c3130c;
        this.f14392n = c3130c.f10148i;
        this.f14391m = new C0192k(i9, 2, 3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p199nd.AbstractC2963b0
    /* JADX INFO: renamed from: O */
    public final C0192k mo6386O() {
        return this.f14391m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p199nd.AbstractC2963b0
    /* JADX INFO: renamed from: P */
    public final C4309e mo6387P() {
        return this.f14389k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p199nd.AbstractC2963b0
    /* JADX INFO: renamed from: Q */
    public final void mo6388Q(C0192k c0192k) {
        this.f14391m = c0192k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4311g.class != obj.getClass()) {
            return false;
        }
        return this.f14390l.equals(((C4311g) obj).f14390l);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4316l
    /* JADX INFO: renamed from: f */
    public final C3130c mo6656f() {
        return this.f14390l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f14390l.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p110hc.InterfaceC1704a
    /* JADX INFO: renamed from: j */
    public final int mo4336j() {
        return 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4315k
    /* JADX INFO: renamed from: m */
    public final String mo8666m() {
        return this.f14389k.f14379s;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4315k
    /* JADX INFO: renamed from: n */
    public final C4325u mo8668n() {
        return this.f14389k.f14371k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        C3130c c3130c = this.f14390l;
        return AbstractC0255e.m1033v(String.valueOf(c3130c.f10146g), ".", c3130c.f10147h, " :", String.valueOf(this.f14392n));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4315k
    public final String typeName() {
        return "field";
    }
}
