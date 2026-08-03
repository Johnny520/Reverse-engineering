package p018J0;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import p001A0.AbstractC0040p;
import p014H0.InterfaceC0202a;
import p016I0.EnumC0209a;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: J0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0231a implements InterfaceC0202a, Serializable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0202a f471a;

    public AbstractC0231a(InterfaceC0202a r1) {
        this.f471a = r1;
    }

    @Override // p014H0.InterfaceC0202a
    /* JADX INFO: renamed from: a */
    public final void mo587a(Object r4) {
        InterfaceC0202a r02 = this;
    L3:
        AbstractC0231a r03 = (AbstractC0231a) r02;
        InterfaceC0202a r1 = r03.f471a;
        AbstractC0307g.m700b(r1);
        r4 = r03.mo520f(r4);     // Catch: Throwable -> L7
        if (r4 == EnumC0209a.f425a) goto L6;
    L9:
        r03.mo591g();
        if ((r1 instanceof AbstractC0231a) == false) goto L12;
        r02 = r1;
        goto L3
    L12:
        r1.mo587a(r4);
        return;
    L6:
        return;
    L7:
        th = move-exception;
        r4 = AbstractC0040p.m116u(th);
        goto L9
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC0202a mo519d(Object r1, InterfaceC0202a r2) {
        AbstractC0307g.m703e(r2, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX INFO: renamed from: e */
    public final StackTraceElement m631e() {
        InterfaceC0233c r02 = (InterfaceC0233c) getClass().getAnnotation(InterfaceC0233c.class);
        String r1 = null;
        if (r02 == null) goto L58;
        int r2 = r02.m636v();
        if (r2 > 1) goto L53;
        int r22 = -1;
        Field r4 = getClass().getDeclaredField("label");     // Catch: Exception -> L17
        r4.setAccessible(true);     // Catch: Exception -> L17
        Object r42 = r4.get(this);     // Catch: Exception -> L17
        if ((r42 instanceof Integer) == false) goto L11;
        Integer r43 = (Integer) r42;     // Catch: Exception -> L17
    L12:
        if (r43 == null) goto L15;
        int r44 = r43.intValue();     // Catch: Exception -> L17
    L16:
        int r45 = r44 - 1;
    L18:
        if (r45 < 0) goto L21;
        r22 = r02.m634l()[r45];
    L21:
        C0234d r3 = AbstractC0235e.f478b;
        C0234d r46 = AbstractC0235e.f477a;
        if (r3 == null) goto L56;
    L26:
        if (r3 == r46) goto L47;
        Method r47 = (Method) r3.f474b;
        if (r47 == null) goto L31;
        Object r48 = r47.invoke(getClass(), null);
    L32:
        if (r48 == null) goto L47;
        Method r5 = (Method) r3.f475c;
        if (r5 == null) goto L37;
        Object r49 = r5.invoke(r48, null);
    L38:
        if (r49 == null) goto L47;
        Method r32 = (Method) r3.f476d;
        if (r32 == null) goto L43;
        Object r33 = r32.invoke(r49, null);
    L45:
        if ((r33 instanceof String) == false) goto L47;
        r1 = (String) r33;
        goto L47
    L43:
        r33 = null;
        goto L45
    L37:
        r49 = null;
        goto L38
    L31:
        r48 = null;
    L47:
        if (r1 != null) goto L49;
        String r12 = r02.m632c();
    L51:
        return new StackTraceElement(r12, r02.m635m(), r02.m633f(), r22);
    L49:
        r12 = r1 + '/' + r02.m632c();
        goto L51
    L56:
        C0234d r7 = new C0234d(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));     // Catch: Exception -> L25
        AbstractC0235e.f478b = r7;     // Catch: Exception -> L25
        r3 = r7;
    L25:
        AbstractC0235e.f478b = r46;
        r3 = r46;
        goto L26
    L15:
        r44 = 0;
        goto L16
    L11:
        r43 = null;
    L17:
        r45 = -1;
        goto L18
    L53:
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + r2 + ". Please update the Kotlin standard library.").toString());
    L58:
        return null;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo520f(Object r1);

    /* JADX INFO: renamed from: g */
    public void mo591g() {
    }

    public String toString() {
        StringBuilder r02 = new StringBuilder("Continuation at ");
        Object r1 = m631e();
        if (r1 != null) goto L6;
        r1 = getClass().getName();
    L6:
        r02.append(r1);
        return r02.toString();
    }
}
