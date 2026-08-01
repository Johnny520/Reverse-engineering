package p255w;

import java.util.List;
import java.util.Map;
import p011B4.AbstractC0231b;
import p029F0.InterfaceC0378P;
import p061L2.AbstractC0973m;
import p112W2.InterfaceC1601c;
import p153e1.InterfaceC2007c;
import p160f3.InterfaceC2160t;
import p227r.EnumC2983d0;

/* JADX INFO: renamed from: w.k */
/* JADX INFO: loaded from: classes.dex */
public final class C3380k implements InterfaceC0378P {

    /* JADX INFO: renamed from: a */
    public final C3381l f10518a;

    /* JADX INFO: renamed from: b */
    public final int f10519b;

    /* JADX INFO: renamed from: c */
    public final boolean f10520c;

    /* JADX INFO: renamed from: d */
    public final float f10521d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0378P f10522e;

    /* JADX INFO: renamed from: f */
    public final float f10523f;

    /* JADX INFO: renamed from: g */
    public final boolean f10524g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2160t f10525h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC2007c f10526i;

    /* JADX INFO: renamed from: j */
    public final long f10527j;

    /* JADX INFO: renamed from: k */
    public final Object f10528k;

    /* JADX INFO: renamed from: l */
    public final int f10529l;

    /* JADX INFO: renamed from: m */
    public final int f10530m;

    /* JADX INFO: renamed from: n */
    public final int f10531n;

    /* JADX INFO: renamed from: o */
    public final EnumC2983d0 f10532o;

    /* JADX INFO: renamed from: p */
    public final int f10533p;

    /* JADX INFO: renamed from: q */
    public final int f10534q;

    public C3380k(C3381l c3381l, int i5, boolean z5, float f2, InterfaceC0378P interfaceC0378P, float f5, boolean z6, InterfaceC2160t interfaceC2160t, InterfaceC2007c interfaceC2007c, long j5, List list, int i6, int i7, int i8, EnumC2983d0 enumC2983d0, int i9, int i10) {
        this.f10518a = c3381l;
        this.f10519b = i5;
        this.f10520c = z5;
        this.f10521d = f2;
        this.f10522e = interfaceC0378P;
        this.f10523f = f5;
        this.f10524g = z6;
        this.f10525h = interfaceC2160t;
        this.f10526i = interfaceC2007c;
        this.f10527j = j5;
        this.f10528k = list;
        this.f10529l = i6;
        this.f10530m = i7;
        this.f10531n = i8;
        this.f10532o = enumC2983d0;
        this.f10533p = i9;
        this.f10534q = i10;
    }

    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: a */
    public final Map mo607a() {
        return this.f10522e.mo607a();
    }

    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: b */
    public final void mo608b() {
        this.f10522e.mo608b();
    }

    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: c */
    public final int mo609c() {
        return this.f10522e.mo609c();
    }

    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: d */
    public final InterfaceC1601c mo610d() {
        return this.f10522e.mo610d();
    }

    @Override // p029F0.InterfaceC0378P
    /* JADX INFO: renamed from: e */
    public final int mo611e() {
        return this.f10522e.mo611e();
    }

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX INFO: renamed from: f */
    public final C3380k m5614f(int i5, boolean z5) {
        C3381l c3381l;
        if (this.f10524g) {
            return null;
        }
        ?? r15 = this.f10528k;
        if (r15.isEmpty() || (c3381l = this.f10518a) == null) {
            return null;
        }
        int i6 = c3381l.f10546l;
        int i7 = this.f10519b - i5;
        if (i7 < 0 || i7 >= i6) {
            return null;
        }
        C3381l c3381l2 = (C3381l) AbstractC0973m.m2012S(r15);
        C3381l c3381l3 = (C3381l) AbstractC0973m.m2017X(r15);
        if (c3381l2.f10548n || c3381l3.f10548n) {
            return null;
        }
        int i8 = this.f10530m;
        int i9 = this.f10529l;
        if (i5 < 0) {
            if (Math.min((c3381l2.f10544j + c3381l2.f10546l) - i9, (c3381l3.f10544j + c3381l3.f10546l) - i8) <= (-i5)) {
                return null;
            }
        } else if (Math.min(i9 - c3381l2.f10544j, i8 - c3381l3.f10544j) <= i5) {
            return null;
        }
        int size = r15.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3381l c3381l4 = (C3381l) r15.get(i10);
            c3381l4.getClass();
            int[] iArr = c3381l4.f10550p;
            if (!c3381l4.f10548n) {
                c3381l4.f10544j += i5;
                int length = iArr.length;
                for (int i11 = 0; i11 < length; i11++) {
                    if ((i11 & 1) != 0) {
                        iArr[i11] = iArr[i11] + i5;
                    }
                }
                if (z5) {
                    int size2 = c3381l4.f10536b.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        AbstractC0231b.m408s(c3381l4.f10543i.f10726a.m4272g(c3381l4.f10541g));
                    }
                }
            }
        }
        return new C3380k(this.f10518a, i7, this.f10520c || i5 > 0, i5, this.f10522e, this.f10523f, this.f10524g, this.f10525h, this.f10526i, this.f10527j, r15, this.f10529l, this.f10530m, this.f10531n, this.f10532o, this.f10533p, this.f10534q);
    }

    /* JADX INFO: renamed from: g */
    public final long m5615g() {
        InterfaceC0378P interfaceC0378P = this.f10522e;
        return (((long) interfaceC0378P.mo611e()) << 32) | (((long) interfaceC0378P.mo609c()) & 4294967295L);
    }
}
