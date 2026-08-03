package p000;

import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: Ic */
/* JADX INFO: loaded from: classes.dex */
public final class C0363Ic {

    /* JADX INFO: renamed from: a */
    public final Class f1229a;

    /* JADX INFO: renamed from: b */
    public final List f1230b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2819zw f1231c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC1024Xt f1232d;

    /* JADX INFO: renamed from: e */
    public final String f1233e;

    public C0363Ic(Class cls, Class cls2, Class cls3, List list, InterfaceC2819zw interfaceC2819zw, InterfaceC1024Xt interfaceC1024Xt) {
        this.f1229a = cls;
        this.f1230b = list;
        this.f1231c = interfaceC2819zw;
        this.f1232d = interfaceC1024Xt;
        this.f1233e = "Failed DecodePath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw m804a(int i, int i2, C0307H5 c0307h5, InterfaceC2713xc interfaceC2713xc, C2644vt c2644vt) {
        InterfaceC2389pw interfaceC2389pwMo145a;
        InterfaceC0098CB interfaceC0098CB;
        int iMo893f;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Object c2455rc;
        InterfaceC1024Xt interfaceC1024Xt = this.f1232d;
        List list = (List) interfaceC1024Xt.mo1935c();
        AbstractC0714Qj.m1488j("Argument must not be null", list);
        try {
            InterfaceC2389pw interfaceC2389pwM805b = m805b(interfaceC2713xc, i, i2, c2644vt, list);
            interfaceC1024Xt.mo1934a(list);
            RunnableC0320Hc runnableC0320Hc = (RunnableC0320Hc) c0307h5.f1021b;
            int i3 = c0307h5.f1020a;
            C0234Fc c0234Fc = runnableC0320Hc.f1062a;
            Class<?> cls = interfaceC2389pwM805b.get().getClass();
            InterfaceC2647vw interfaceC2647vwM1540a = null;
            if (i3 != 4) {
                InterfaceC0098CB interfaceC0098CBM477e = c0234Fc.m477e(cls);
                interfaceC0098CB = interfaceC0098CBM477e;
                interfaceC2389pwMo145a = interfaceC0098CBM477e.mo145a(runnableC0320Hc.f1069h, interfaceC2389pwM805b, runnableC0320Hc.f1073l, runnableC0320Hc.f1074m);
            } else {
                interfaceC2389pwMo145a = interfaceC2389pwM805b;
                interfaceC0098CB = null;
            }
            if (!interfaceC2389pwM805b.equals(interfaceC2389pwMo145a)) {
                interfaceC2389pwM805b.mo118e();
            }
            if (c0234Fc.f735c.m1544a().f2185d.m1540a(interfaceC2389pwMo145a.mo117d()) != null) {
                interfaceC2647vwM1540a = c0234Fc.f735c.m1544a().f2185d.m1540a(interfaceC2389pwMo145a.mo117d());
                if (interfaceC2647vwM1540a == null) {
                    throw new C0597Nv(interfaceC2389pwMo145a.mo117d());
                }
                iMo893f = interfaceC2647vwM1540a.mo893f(runnableC0320Hc.f1076o);
            } else {
                iMo893f = 3;
            }
            InterfaceC2647vw interfaceC2647vw = interfaceC2647vwM1540a;
            InterfaceC0802Sm interfaceC0802Sm = runnableC0320Hc.f1083v;
            ArrayList arrayListM474b = c0234Fc.m474b();
            int size = arrayListM474b.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    z = false;
                    break;
                }
                if (((C1108Zr) arrayListM474b.get(i4)).f3501a.equals(interfaceC0802Sm)) {
                    z = true;
                    break;
                }
                i4++;
            }
            switch (runnableC0320Hc.f1075n.f2882a) {
                case 0:
                    z2 = (i3 == 4 || i3 == 5) ? false : true;
                    break;
                default:
                    z2 = true;
                    if (((z || i3 != 3) && i3 != 1) || iMo893f != 2) {
                    }
                case 1:
                case 2:
                    z2 = false;
                    break;
            }
            if (z2) {
                if (interfaceC2647vw == null) {
                    throw new C0597Nv(interfaceC2389pwMo145a.get().getClass());
                }
                int iM424v = AbstractC0213Ey.m424v(iMo893f);
                if (iM424v == 0) {
                    z3 = false;
                    z4 = true;
                    c2455rc = new C2455rc(runnableC0320Hc.f1083v, runnableC0320Hc.f1070i);
                } else {
                    if (iM424v != 1) {
                        throw new IllegalArgumentException("Unknown strategy: ".concat(iMo893f != 1 ? iMo893f != 2 ? iMo893f != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE"));
                    }
                    z3 = false;
                    z4 = true;
                    c2455rc = new C2475rw(c0234Fc.f735c.f2396a, runnableC0320Hc.f1083v, runnableC0320Hc.f1070i, runnableC0320Hc.f1073l, runnableC0320Hc.f1074m, interfaceC0098CB, cls, runnableC0320Hc.f1076o);
                }
                C1466gp c1466gp = (C1466gp) C1466gp.f5197e.mo1935c();
                c1466gp.f5201d = z3;
                c1466gp.f5200c = z4;
                c1466gp.f5199b = interfaceC2389pwMo145a;
                C2656w4 c2656w4 = runnableC0320Hc.f1067f;
                c2656w4.f9196b = c2455rc;
                c2656w4.f9197c = interfaceC2647vw;
                c2656w4.f9198d = c1466gp;
                interfaceC2389pwMo145a = c1466gp;
            }
            return this.f1231c.mo660i(interfaceC2389pwMo145a, c2644vt);
        } catch (Throwable th) {
            interfaceC1024Xt.mo1934a(list);
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2389pw m805b(InterfaceC2713xc interfaceC2713xc, int i, int i2, C2644vt c2644vt, List list) throws C0842Tj {
        List list2 = this.f1230b;
        int size = list2.size();
        InterfaceC2389pw interfaceC2389pwMo749a = null;
        for (int i3 = 0; i3 < size; i3++) {
            InterfaceC2518sw interfaceC2518sw = (InterfaceC2518sw) list2.get(i3);
            try {
                if (interfaceC2518sw.mo750b(interfaceC2713xc.mo237j(), c2644vt)) {
                    interfaceC2389pwMo749a = interfaceC2518sw.mo749a(interfaceC2713xc.mo237j(), i, i2, c2644vt);
                }
            } catch (IOException | OutOfMemoryError | RuntimeException e) {
                if (Log.isLoggable("DecodePath", 2)) {
                    Objects.toString(interfaceC2518sw);
                }
                list.add(e);
            }
            if (interfaceC2389pwMo749a != null) {
                break;
            }
        }
        if (interfaceC2389pwMo749a != null) {
            return interfaceC2389pwMo749a;
        }
        throw new C0842Tj(this.f1233e, new ArrayList(list));
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f1229a + ", decoders=" + this.f1230b + ", transcoder=" + this.f1231c + '}';
    }
}
