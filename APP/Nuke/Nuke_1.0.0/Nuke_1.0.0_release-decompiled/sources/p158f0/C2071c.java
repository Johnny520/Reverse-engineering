package p158f0;

import java.util.Arrays;
import java.util.HashMap;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p186k.C2409F;

/* JADX INFO: renamed from: f0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2071c extends C2070b {

    /* JADX INFO: renamed from: o */
    public final C2070b f6939o;

    /* JADX INFO: renamed from: p */
    public boolean f6940p;

    public C2071c(long j5, C2080l c2080l, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2, C2070b c2070b) {
        super(j5, c2080l, interfaceC1601c, interfaceC1601c2);
        this.f6939o = c2070b;
        c2070b.mo3793k();
    }

    @Override // p158f0.C2070b, p158f0.AbstractC2074f
    /* JADX INFO: renamed from: c */
    public final void mo3787c() {
        if (this.f6947c) {
            return;
        }
        super.mo3787c();
        if (this.f6940p) {
            return;
        }
        this.f6940p = true;
        this.f6939o.mo3794l();
    }

    @Override // p158f0.C2070b
    /* JADX INFO: renamed from: w */
    public final AbstractC2086r mo3800w() throws Throwable {
        C2071c c2071c;
        C2070b c2070b = this.f6939o;
        if (c2070b.f6938m || c2070b.f6947c) {
            return new C2076h(this);
        }
        C2409F c2409f = this.f6933h;
        long j5 = this.f6946b;
        HashMap mapM3826b = c2409f != null ? AbstractC2082n.m3826b(c2070b.mo3791g(), this, this.f6939o.mo3788d()) : null;
        Object obj = AbstractC2082n.f6972c;
        synchronized (obj) {
            try {
                AbstractC2082n.m3827c(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (c2409f == null || c2409f.f7796d == 0) {
                    c2071c = this;
                    m3812a();
                } else {
                    c2071c = this;
                    AbstractC2086r abstractC2086rM3810z = c2071c.m3810z(this.f6939o.mo3791g(), c2409f, mapM3826b, this.f6939o.mo3788d());
                    if (!abstractC2086rM3810z.equals(C2077i.f6950b)) {
                        return abstractC2086rM3810z;
                    }
                    C2409F c2409fMo3808x = c2071c.f6939o.mo3808x();
                    if (c2409fMo3808x != null) {
                        c2409fMo3808x.m4289k(c2409f);
                    } else {
                        c2071c.f6939o.mo3802B(c2409f);
                        c2071c.f6933h = null;
                    }
                }
                if (AbstractC1665j.m2988h(c2071c.f6939o.mo3791g(), j5) < 0) {
                    c2071c.f6939o.m3807v();
                }
                C2070b c2070b2 = c2071c.f6939o;
                c2070b2.mo3815r(c2070b2.mo3788d().m3821b(j5).m3820a(c2071c.f6935j));
                c2071c.f6939o.m3801A(j5);
                C2070b c2070b3 = c2071c.f6939o;
                int i5 = c2071c.f6948d;
                c2071c.f6948d = -1;
                if (i5 >= 0) {
                    int[] iArr = c2070b3.f6936k;
                    AbstractC1665j.m2985e(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i5;
                    c2070b3.f6936k = iArrCopyOf;
                } else {
                    c2070b3.getClass();
                }
                C2070b c2070b4 = c2071c.f6939o;
                C2080l c2080l = c2071c.f6935j;
                c2070b4.getClass();
                synchronized (obj) {
                    c2070b4.f6935j = c2070b4.f6935j.m3823d(c2080l);
                    C2070b c2070b5 = c2071c.f6939o;
                    int[] iArr2 = c2071c.f6936k;
                    c2070b5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c2070b5.f6936k;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            AbstractC1665j.m2982b(iArrCopyOf2);
                            iArr2 = iArrCopyOf2;
                        }
                        c2070b5.f6936k = iArr2;
                    }
                }
                c2071c.f6938m = true;
                if (!c2071c.f6940p) {
                    c2071c.f6940p = true;
                    c2071c.f6939o.mo3794l();
                }
                return C2077i.f6950b;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
