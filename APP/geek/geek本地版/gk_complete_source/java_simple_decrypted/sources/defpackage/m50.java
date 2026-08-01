package defpackage;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public abstract class m50 implements an, ld, qe, Serializable {
    public final ld a;
    public final ge b;
    public transient ld c;
    public final int d;

    public m50(ld r2) {
        if (r2 == null) goto L4;
        ge r0 = r2.d();
    L5:
        this.a = r2;
        this.b = r0;
        this.d = 2;
        return;
    L4:
        r0 = null;
        goto L5
    }

    public abstract ld a(ld r1);

    @Override // defpackage.an
    public final int b() {
        return this.d;
    }

    @Override // defpackage.qe
    public final qe c() {
        ld r0 = this.a;
        if ((r0 instanceof qe) == true) goto L5;
        return null;
    L5:
        return (qe) r0;
    }

    @Override // defpackage.ld
    public final ge d() {
        ge r0 = this.b;
        ip.l(r0);
        return r0;
    }

    @Override // defpackage.ld
    public final void f(Object r7) {
        ld r0 = this;
    L3:
        m50 r02 = (m50) r0;
        ld r1 = r02.a;
        ip.l(r1);
        r7 = r02.g(r7);     // Catch: Throwable -> L7
        if (r7 == pe.a) goto L6;
    L9:
        ld r2 = r02.c;
        if (r2 == null) goto L24;
        if (r2 == r02) goto L24;
        ge r3 = r02.b;
        ip.l(r3);
        ee r32 = r3.b(vh.b);
        ip.l(r32);
        md r33 = (md) r32;
        tg r22 = (tg) r2;
        AtomicReferenceFieldUpdater r34 = tg.h;
    L14:
        if (r34.get(r22) == a80.e) goto L14;
        Object r23 = r34.get(r22);
        if ((r23 instanceof i8) == false) goto L18;
        i8 r24 = (i8) r23;
    L19:
        if (r24 == null) goto L24;
        AtomicReferenceFieldUpdater r35 = i8.h;
        zg r4 = (zg) r35.get(r24);
        if (r4 == null) goto L24;
        r4.b();
        r35.set(r24, nw.a);
        goto L24
    L18:
        r24 = null;
    L24:
        r02.c = mb.a;
        if ((r1 instanceof m50) == false) goto L27;
        r0 = r1;
        goto L3
    L27:
        r1.f(r7);
        return;
    L6:
        return;
    L7:
        th = move-exception;
        r7 = ct.f(th);
        goto L9
    }

    public abstract Object g(Object r1);

    public final String h() {
        StringBuilder r0 = new StringBuilder("Continuation at ");
        ef r1 = (ef) getClass().getAnnotation(ef.class);
        Object r2 = null;
        String r22 = null;
        r22 = null;
        r22 = null;
        r22 = null;
        r22 = null;
        r22 = null;
        if (r1 == null) goto L49;
        int r3 = r1.v();
        if (r3 > 1) goto L55;
        int r32 = -1;
        Field r5 = getClass().getDeclaredField("label");     // Catch: Exception -> L17
        r5.setAccessible(true);     // Catch: Exception -> L17
        Object r52 = r5.get(this);     // Catch: Exception -> L17
        if ((r52 instanceof Integer) == false) goto L11;
        Integer r53 = (Integer) r52;     // Catch: Exception -> L17
    L12:
        if (r53 == null) goto L15;
        int r54 = r53.intValue();     // Catch: Exception -> L17
    L16:
        int r55 = r54 - 1;
    L18:
        if (r55 < 0) goto L21;
        r32 = r1.l()[r55];
    L21:
        yv r4 = ip.m;
        yv r56 = ip.n;
        if (r56 == null) goto L56;
    L26:
        if (r56 == r4) goto L45;
        Method r42 = r56.a;
        if (r42 == null) goto L45;
        Object r43 = r42.invoke(getClass(), null);
        if (r43 == null) goto L45;
        Method r6 = r56.b;
        if (r6 == null) goto L45;
        Object r44 = r6.invoke(r43, null);
        if (r44 == null) goto L45;
        Method r57 = r56.c;
        if (r57 == null) goto L41;
        Object r45 = r57.invoke(r44, null);
    L43:
        if ((r45 instanceof String) == false) goto L45;
        r22 = (String) r45;
        goto L45
    L41:
        r45 = null;
    L45:
        if (r22 != null) goto L47;
        String r23 = r1.c();
    L48:
        r2 = new StackTraceElement(r23, r1.m(), r1.f(), r32);
        goto L49
    L47:
        r23 = r22 + '/' + r1.c();
        goto L48
    L56:
        yv r8 = new yv(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));     // Catch: Exception -> L25
        ip.n = r8;     // Catch: Exception -> L25
        r56 = r8;
    L25:
        ip.n = r4;
        r56 = r4;
        goto L26
    L15:
        r54 = 0;
        goto L16
    L11:
        r53 = null;
    L17:
        r55 = -1;
        goto L18
    L55:
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + r3 + ". Please update the Kotlin standard library.").toString());
    L49:
        if (r2 != null) goto L52;
        r2 = getClass().getName();
    L52:
        r0.append(r2);
        return r0.toString();
    }

    public final String toString() {
        if (this.a != null) goto L10;
        j00.a.getClass();
        String r0 = getClass().getGenericInterfaces()[0].toString();
        if (r0.startsWith("kotlin.jvm.functions.") == false) goto L7;
        r0 = r0.substring(21);
    L7:
        ip.n("renderLambdaToString(...)", r0);
        return r0;
    L10:
        return h();
    }
}
