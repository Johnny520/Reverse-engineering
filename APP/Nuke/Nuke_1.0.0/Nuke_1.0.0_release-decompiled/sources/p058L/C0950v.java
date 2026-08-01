package p058L;

import p000A.AbstractC0070k0;
import p029F0.C0363A;
import p092S0.AbstractC1251D;
import p092S0.C1257J;

/* JADX INFO: renamed from: L.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0950v implements InterfaceC0936h {

    /* JADX INFO: renamed from: b */
    public static final C0950v f2987b = new C0950v(0);

    /* JADX INFO: renamed from: c */
    public static final C0950v f2988c = new C0950v(1);

    /* JADX INFO: renamed from: d */
    public static final C0363A f2989d = new C0363A(3);

    /* JADX INFO: renamed from: e */
    public static final C0363A f2990e = new C0363A(4);

    /* JADX INFO: renamed from: f */
    public static final C0363A f2991f = new C0363A(5);

    /* JADX INFO: renamed from: g */
    public static final C0363A f2992g = new C0363A(6);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2993a;

    public /* synthetic */ C0950v(int i5) {
        this.f2993a = i5;
    }

    @Override // p058L.InterfaceC0936h
    /* JADX INFO: renamed from: a */
    public long mo1946a(C0946r c0946r, int i5) {
        switch (this.f2993a) {
            case 0:
                String str = ((C1257J) c0946r.f2978e).f4526a.f4516a.f4563e;
                return AbstractC1251D.m2313b(AbstractC0070k0.m87n(str, i5), AbstractC0070k0.m86m(str, i5));
            default:
                return ((C1257J) c0946r.f2978e).m2332i(i5);
        }
    }
}
