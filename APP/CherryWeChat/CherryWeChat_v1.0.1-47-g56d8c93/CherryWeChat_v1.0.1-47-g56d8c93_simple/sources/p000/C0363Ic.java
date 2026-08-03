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

    public C0363Ic(Class r1, Class r2, Class r3, List r4, InterfaceC2819zw r5, InterfaceC1024Xt r6) {
        this.f1229a = r1;
        this.f1230b = r4;
        this.f1231c = r5;
        this.f1232d = r6;
        this.f1233e = "Failed DecodePath{" + r1.getSimpleName() + "->" + r2.getSimpleName() + "->" + r3.getSimpleName() + "}";
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC2389pw m804a(int r17, int r18, C0307H5 r19, InterfaceC2713xc r20, C2644vt r21) {
        InterfaceC1024Xt r7 = this.f1232d;
        List r6 = (List) r7.mo1935c();
        AbstractC0714Qj.m1488j("Argument must not be null", r6);
        InterfaceC2389pw r2 = m805b(r20, r17, r18, r21, r6);     // Catch: Throwable -> L70
        r7.mo1934a(r6);
        RunnableC0320Hc r3 = (RunnableC0320Hc) r19.f1021b;
        int r0 = r19.f1020a;
        C0234Fc r4 = r3.f1062a;
        Class<?> r13 = r2.get().getClass();
        InterfaceC2647vw r62 = null;
        if (r0 == 4) goto L7;
        InterfaceC0098CB r5 = r4.m477e(r13);
        InterfaceC0098CB r12 = r5;
        InterfaceC2389pw r52 = r5.mo145a(r3.f1069h, r2, r3.f1073l, r3.f1074m);
    L9:
        if (r2.equals(r52) == true) goto L12;
        r2.mo118e();
    L12:
        if (r4.f735c.m1544a().f2185d.m1540a(r52.mo117d()) == null) goto L19;
        r62 = r4.f735c.m1544a().f2185d.m1540a(r52.mo117d());
        if (r62 == null) goto L18;
        int r22 = r62.mo893f(r3.f1076o);
    L16:
        InterfaceC2647vw r15 = r62;
        InterfaceC0802Sm r63 = r3.f1083v;
        ArrayList r72 = r4.m474b();
        int r8 = r72.size();
        int r10 = 0;
    L22:
        if (r10 >= r8) goto L27;
        if (((C1108Zr) r72.get(r10)).f3501a.equals(r63) == true) goto L25;
        r10 = r10 + 1;
        goto L22
    L25:
        boolean r64 = true;
    L29:
        switch(r3.f1075n.f2882a) {
            case 0: goto L40;
            case 1: goto L38;
            case 2: goto L38;
            default: goto L30;
        };
    L30:
        boolean r73 = true;
        if (r64 == false) goto L33;
    L34:
        if (r0 != 1) goto L38;
    L36:
        if (r22 != 2) goto L38;
    L46:
        if (r73 == false) goto L69;
        if (r15 == null) goto L67;
        int r02 = AbstractC0213Ey.m424v(r22);
        if (r02 == 0) goto L64;
        if (r02 != 1) goto L53;
        boolean r03 = false;
        boolean r42 = true;
        Object r65 = new C2475rw(r4.f735c.f2396a, r3.f1083v, r3.f1070i, r3.f1073l, r3.f1074m, r12, r13, r3.f1076o);
    L65:
        C1466gp r23 = (C1466gp) C1466gp.f5197e.mo1935c();
        r23.f5201d = r03;
        r23.f5200c = r42;
        r23.f5199b = r52;
        C2656w4 r04 = r3.f1067f;
        r04.f9196b = r65;
        r04.f9197c = r15;
        r04.f9198d = r23;
        r52 = r23;
        goto L69
    L53:
        if (r22 != 1) goto L55;
        String r24 = "SOURCE";
    L63:
        throw new IllegalArgumentException("Unknown strategy: ".concat(r24));
    L55:
        if (r22 != 2) goto L57;
        r24 = "TRANSFORMED";
        goto L63
    L57:
        if (r22 == 3) goto L59;
        r24 = "null";
        goto L63
    L59:
        r24 = "NONE";
        goto L63
    L64:
        r03 = false;
        r42 = true;
        r65 = new C2455rc(r3.f1083v, r3.f1070i);
        goto L65
    L67:
        throw new C0597Nv(r52.get().getClass());
    L69:
        return this.f1231c.mo660i(r52, r21);
    L33:
        if (r0 == 3) goto L36;
    L38:
        r73 = false;
        goto L46
    L40:
        if (r0 != 4) goto L42;
    L45:
        boolean r05 = false;
    L44:
        r73 = r05;
        goto L46
    L42:
        if (r0 == 5) goto L45;
        r05 = true;
        goto L44
    L27:
        r64 = false;
        goto L29
    L18:
        throw new C0597Nv(r52.mo117d());
    L19:
        r22 = 3;
        goto L16
    L7:
        r52 = r2;
        r12 = null;
    L70:
        th = move-exception;
        r7.mo1934a(r6);
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2389pw m805b(InterfaceC2713xc r9, int r10, int r11, C2644vt r12, List r13) {
        List r0 = this.f1230b;
        int r1 = r0.size();
        InterfaceC2389pw r2 = null;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L21;
        InterfaceC2518sw r4 = (InterfaceC2518sw) r0.get(r3);
        if (r4.mo750b(r9.mo237j(), r12) == false) goto L18;
        r2 = r4.mo749a(r9.mo237j(), r10, r11, r12);     // Catch: Throwable -> L9 RuntimeException -> L11 IOException -> L13
    L18:
        if (r2 != null) goto L21;
        r3 = r3 + 1;
    L9:
        e = move-exception;
        if (Log.isLoggable("DecodePath", 2) == false) goto L17;
        Objects.toString(r4);
    L17:
        r13.add(e);
    L21:
        if (r2 == null) goto L23;
        return r2;
    L23:
        ArrayList r102 = new ArrayList(r13);
        throw new C0842Tj(this.f1233e, r102);
    }

    public final String toString() {
        return "DecodePath{ dataClass=" + this.f1229a + ", decoders=" + this.f1230b + ", transcoder=" + this.f1231c + '}';
    }
}
