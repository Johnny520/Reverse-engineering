package p266y;

import p041H0.AbstractC0582a0;
import p117X2.AbstractC1665j;
import p169h0.AbstractC2206o;

/* JADX INFO: renamed from: y.a */
/* JADX INFO: loaded from: classes.dex */
final class C3471a extends AbstractC0582a0 {

    /* JADX INFO: renamed from: a */
    public final C3473c f10780a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3471a(C3473c c3473c) {
        this.f10780a = c3473c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: e */
    public final AbstractC2206o mo140e() {
        C3475e c3475e = new C3475e();
        c3475e.f10789r = this.f10780a;
        return c3475e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3471a) {
            return AbstractC1665j.m2981a(this.f10780a, ((C3471a) obj).f10780a);
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041H0.AbstractC0582a0
    /* JADX INFO: renamed from: f */
    public final void mo141f(AbstractC2206o abstractC2206o) {
        C3475e c3475e = (C3475e) abstractC2206o;
        C3473c c3473c = c3475e.f10789r;
        if (c3473c != null) {
            c3473c.f10788a.m2761j(c3475e);
        }
        C3473c c3473c2 = this.f10780a;
        if (c3473c2 != null) {
            c3473c2.f10788a.m2753b(c3475e);
        }
        c3475e.f10789r = c3473c2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10780a.hashCode();
    }
}
