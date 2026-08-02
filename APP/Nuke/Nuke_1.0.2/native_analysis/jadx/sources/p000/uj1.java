package p000;

import java.io.EOFException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class uj1 extends o82 {

    /* JADX INFO: renamed from: f */
    public static final vf1 f11325f;

    /* JADX INFO: renamed from: g */
    public static final vf1 f11326g;

    /* JADX INFO: renamed from: h */
    public static final byte[] f11327h;

    /* JADX INFO: renamed from: i */
    public static final byte[] f11328i;

    /* JADX INFO: renamed from: j */
    public static final byte[] f11329j;

    /* JADX INFO: renamed from: b */
    public final C0505no f11330b;

    /* JADX INFO: renamed from: c */
    public final List f11331c;

    /* JADX INFO: renamed from: d */
    public final vf1 f11332d;

    /* JADX INFO: renamed from: e */
    public long f11333e;

    static {
        o72 o72Var = vf1.f11926d;
        f11325f = AbstractC0731te.m5175C("multipart/mixed");
        AbstractC0731te.m5175C("multipart/alternative");
        AbstractC0731te.m5175C("multipart/digest");
        AbstractC0731te.m5175C("multipart/parallel");
        f11326g = AbstractC0731te.m5175C("multipart/form-data");
        f11327h = new byte[]{58, 32};
        f11328i = new byte[]{13, 10};
        f11329j = new byte[]{45, 45};
    }

    public uj1(C0505no c0505no, vf1 vf1Var, List list) {
        c0505no.getClass();
        vf1Var.getClass();
        this.f11330b = c0505no;
        this.f11331c = list;
        o72 o72Var = vf1.f11926d;
        this.f11332d = AbstractC0731te.m5175C(vf1Var + "; boundary=" + c0505no.m3331j());
        this.f11333e = -1L;
    }

    @Override // p000.o82
    /* JADX INFO: renamed from: a */
    public final long mo3042a() throws EOFException {
        long j = this.f11333e;
        if (j != -1) {
            return j;
        }
        long jM5508e = m5508e(null, true);
        this.f11333e = jM5508e;
        return jM5508e;
    }

    @Override // p000.o82
    /* JADX INFO: renamed from: b */
    public final vf1 mo3043b() {
        return this.f11332d;
    }

    @Override // p000.o82
    /* JADX INFO: renamed from: c */
    public final boolean mo3540c() {
        List list = this.f11331c;
        if (list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((tj1) it.next()).f10795b.mo3540c()) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.o82
    /* JADX INFO: renamed from: d */
    public final void mo3044d(InterfaceC0504nn interfaceC0504nn) throws EOFException {
        m5508e(interfaceC0504nn, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public final long m5508e(InterfaceC0504nn interfaceC0504nn, boolean z) throws EOFException {
        C0209fn c0209fn;
        InterfaceC0504nn c0209fn2;
        if (z) {
            c0209fn2 = new C0209fn();
            c0209fn = c0209fn2;
        } else {
            c0209fn = 0;
            c0209fn2 = interfaceC0504nn;
        }
        List list = this.f11331c;
        int size = list.size();
        long j = 0;
        int i = 0;
        while (true) {
            C0505no c0505no = this.f11330b;
            byte[] bArr = f11329j;
            byte[] bArr2 = f11328i;
            if (i >= size) {
                c0209fn2.getClass();
                c0209fn2.write(bArr);
                c0209fn2.mo1697z(c0505no);
                c0209fn2.write(bArr);
                c0209fn2.write(bArr2);
                if (!z) {
                    return j;
                }
                c0209fn.getClass();
                long j2 = j + c0209fn.f3068i;
                c0209fn.m1679g();
                return j2;
            }
            tj1 tj1Var = (tj1) list.get(i);
            js0 js0Var = tj1Var.f10794a;
            o82 o82Var = tj1Var.f10795b;
            c0209fn2.getClass();
            c0209fn2.write(bArr);
            c0209fn2.mo1697z(c0505no);
            c0209fn2.write(bArr2);
            int size2 = js0Var.size();
            for (int i2 = 0; i2 < size2; i2++) {
                c0209fn2.mo1696y(js0Var.m2558b(i2)).write(f11327h).mo1696y(js0Var.m2560d(i2)).write(bArr2);
            }
            vf1 vf1VarMo3043b = o82Var.mo3043b();
            if (vf1VarMo3043b != null) {
                c0209fn2.mo1696y("Content-Type: ").mo1696y(vf1VarMo3043b.f11928a).write(bArr2);
            }
            long jMo3042a = o82Var.mo3042a();
            if (jMo3042a == -1 && z) {
                c0209fn.getClass();
                c0209fn.m1679g();
                return -1L;
            }
            c0209fn2.write(bArr2);
            if (z) {
                j += jMo3042a;
            } else {
                o82Var.mo3044d(c0209fn2);
            }
            c0209fn2.write(bArr2);
            i++;
        }
    }
}
