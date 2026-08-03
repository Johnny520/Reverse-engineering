package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: u5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2571u5 implements InterfaceC0190Eb, InterfaceC1497hc, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0190Eb f8918a;

    public AbstractC2571u5(InterfaceC0190Eb r1) {
        this.f8918a = r1;
    }

    @Override // p000.InterfaceC1497hc
    /* JADX INFO: renamed from: c */
    public final InterfaceC1497hc mo1012c() {
        InterfaceC0190Eb r0 = this.f8918a;
        if ((r0 instanceof InterfaceC1497hc) == true) goto L5;
        return null;
    L5:
        return (InterfaceC1497hc) r0;
    }

    @Override // p000.InterfaceC0190Eb
    /* JADX INFO: renamed from: f */
    public final void mo264f(Object r4) {
        InterfaceC0190Eb r0 = this;
    L3:
        AbstractC2571u5 r02 = (AbstractC2571u5) r0;
        InterfaceC0190Eb r1 = r02.f8918a;
        r4 = r02.mo448i(r4);     // Catch: Throwable -> L7
        if (r4 == EnumC1453gc.f5148a) goto L6;
    L9:
        r02.mo472j();
        if ((r1 instanceof AbstractC2571u5) == false) goto L12;
        r0 = r1;
        goto L3
    L12:
        r1.mo264f(r4);
        return;
    L6:
        return;
    L7:
        th = move-exception;
        r4 = new C0297Gw(th);
        goto L9
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC0190Eb mo447h(InterfaceC0190Eb r1, Object r2) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo448i(Object r1);

    /* JADX INFO: renamed from: j */
    public void mo472j() {
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder("Continuation at ");
        InterfaceC0105Cc r1 = (InterfaceC0105Cc) getClass().getAnnotation(InterfaceC0105Cc.class);
        Object r2 = null;
        String r22 = null;
        r22 = null;
        r22 = null;
        r22 = null;
        r22 = null;
        r22 = null;
        if (r1 == null) goto L49;
        int r3 = r1.m157v();
        if (r3 > 1) goto L54;
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
        r32 = r1.m155l()[r55];
    L21:
        C2656w4 r4 = AbstractC0585Nj.f1898c;
        C2656w4 r56 = AbstractC0585Nj.f1899d;
        if (r56 == null) goto L55;
    L26:
        if (r56 == r4) goto L45;
        Method r42 = (Method) r56.f9196b;
        if (r42 == null) goto L45;
        Object r43 = r42.invoke(getClass(), null);
        if (r43 == null) goto L45;
        Method r6 = (Method) r56.f9197c;
        if (r6 == null) goto L45;
        Object r44 = r6.invoke(r43, null);
        if (r44 == null) goto L45;
        Method r57 = (Method) r56.f9198d;
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
        String r23 = r1.m153c();
    L48:
        r2 = new StackTraceElement(r23, r1.m156m(), r1.m154f(), r32);
        goto L49
    L47:
        r23 = r22 + '/' + r1.m153c();
        goto L48
    L55:
        C2656w4 r8 = new C2656w4(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 20);     // Catch: Exception -> L25
        AbstractC0585Nj.f1899d = r8;     // Catch: Exception -> L25
        r56 = r8;
    L25:
        AbstractC0585Nj.f1899d = r4;
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
    L54:
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + r3 + ". Please update the Kotlin standard library.").toString());
    L49:
        if (r2 != null) goto L51;
        r2 = getClass().getName();
    L51:
        r0.append(r2);
        return r0.toString();
    }
}
