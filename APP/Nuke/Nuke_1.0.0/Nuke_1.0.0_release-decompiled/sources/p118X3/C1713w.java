package p118X3;

import java.io.EOFException;
import java.util.Iterator;
import java.util.List;
import p049I2.AbstractC0797o;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p208n4.C2706e;
import p208n4.C2709h;
import p208n4.InterfaceC2707f;

/* JADX INFO: renamed from: X3.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1713w extends AbstractC1682D {

    /* JADX INFO: renamed from: f */
    public static final C1711u f5884f;

    /* JADX INFO: renamed from: g */
    public static final C1711u f5885g;

    /* JADX INFO: renamed from: h */
    public static final byte[] f5886h;

    /* JADX INFO: renamed from: i */
    public static final byte[] f5887i;

    /* JADX INFO: renamed from: j */
    public static final byte[] f5888j;

    /* JADX INFO: renamed from: b */
    public final C2709h f5889b;

    /* JADX INFO: renamed from: c */
    public final List f5890c;

    /* JADX INFO: renamed from: d */
    public final C1711u f5891d;

    /* JADX INFO: renamed from: e */
    public long f5892e;

    static {
        C1675t c1675t = C1711u.f5877d;
        f5884f = AbstractC0797o.m1390o("multipart/mixed");
        AbstractC0797o.m1390o("multipart/alternative");
        AbstractC0797o.m1390o("multipart/digest");
        AbstractC0797o.m1390o("multipart/parallel");
        f5885g = AbstractC0797o.m1390o("multipart/form-data");
        f5886h = new byte[]{58, 32};
        f5887i = new byte[]{13, 10};
        f5888j = new byte[]{45, 45};
    }

    public C1713w(C2709h c2709h, C1711u c1711u, List list) {
        AbstractC1665j.m2985e(c2709h, "boundaryByteString");
        AbstractC1665j.m2985e(c1711u, "type");
        this.f5889b = c2709h;
        this.f5890c = list;
        C1675t c1675t = C1711u.f5877d;
        this.f5891d = AbstractC0797o.m1390o(c1711u + "; boundary=" + c2709h.m4741j());
        this.f5892e = -1L;
    }

    @Override // p118X3.AbstractC1682D
    /* JADX INFO: renamed from: a */
    public final long mo519a() throws EOFException {
        long j5 = this.f5892e;
        if (j5 != -1) {
            return j5;
        }
        long jM3054e = m3054e(null, true);
        this.f5892e = jM3054e;
        return jM3054e;
    }

    @Override // p118X3.AbstractC1682D
    /* JADX INFO: renamed from: b */
    public final C1711u mo520b() {
        return this.f5891d;
    }

    @Override // p118X3.AbstractC1682D
    /* JADX INFO: renamed from: c */
    public final boolean mo3002c() {
        List list = this.f5890c;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((C1712v) it.next()).f5883b.mo3002c()) {
                return true;
            }
        }
        return false;
    }

    @Override // p118X3.AbstractC1682D
    /* JADX INFO: renamed from: d */
    public final void mo521d(InterfaceC2707f interfaceC2707f) throws EOFException {
        m3054e(interfaceC2707f, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final long m3054e(InterfaceC2707f interfaceC2707f, boolean z5) throws EOFException {
        C2706e c2706e;
        InterfaceC2707f c2706e2;
        if (z5) {
            c2706e2 = new C2706e();
            c2706e = c2706e2;
        } else {
            c2706e = 0;
            c2706e2 = interfaceC2707f;
        }
        List list = this.f5890c;
        int size = list.size();
        long j5 = 0;
        int i5 = 0;
        while (true) {
            C2709h c2709h = this.f5889b;
            byte[] bArr = f5888j;
            byte[] bArr2 = f5887i;
            if (i5 >= size) {
                AbstractC1665j.m2982b(c2706e2);
                c2706e2.write(bArr);
                c2706e2.mo4713e(c2709h);
                c2706e2.write(bArr);
                c2706e2.write(bArr2);
                if (!z5) {
                    return j5;
                }
                AbstractC1665j.m2982b(c2706e);
                long j6 = j5 + c2706e.f8629e;
                c2706e.m4715h();
                return j6;
            }
            C1712v c1712v = (C1712v) list.get(i5);
            C1707q c1707q = c1712v.f5882a;
            AbstractC1682D abstractC1682D = c1712v.f5883b;
            AbstractC1665j.m2982b(c2706e2);
            c2706e2.write(bArr);
            c2706e2.mo4713e(c2709h);
            c2706e2.write(bArr2);
            int size2 = c1707q.size();
            for (int i6 = 0; i6 < size2; i6++) {
                c2706e2.mo4728v(c1707q.m3039b(i6)).write(f5886h).mo4728v(c1707q.m3041d(i6)).write(bArr2);
            }
            C1711u c1711uMo520b = abstractC1682D.mo520b();
            if (c1711uMo520b != null) {
                c2706e2.mo4728v("Content-Type: ").mo4728v(c1711uMo520b.f5879a).write(bArr2);
            }
            long jMo519a = abstractC1682D.mo519a();
            if (jMo519a == -1 && z5) {
                AbstractC1665j.m2982b(c2706e);
                c2706e.m4715h();
                return -1L;
            }
            c2706e2.write(bArr2);
            if (z5) {
                j5 += jMo519a;
            } else {
                abstractC1682D.mo521d(c2706e2);
            }
            c2706e2.write(bArr2);
            i5++;
        }
    }
}
