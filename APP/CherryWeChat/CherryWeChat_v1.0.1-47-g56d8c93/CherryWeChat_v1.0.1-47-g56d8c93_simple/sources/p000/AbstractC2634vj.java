package p000;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: vj */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2634vj extends AbstractC0043B {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC2634vj> defaultInstanceMap;
    private int memoizedSerializedSize;
    protected C1001XC unknownFields;

    static {
        defaultInstanceMap = new ConcurrentHashMap();
    }

    public AbstractC2634vj() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C1001XC.f3195f;
    }

    /* JADX INFO: renamed from: g */
    public static void m5145g(AbstractC2634vj r1) {
        if (m5148m(r1, true) == false) goto L6;
        return;
    L6:
        throw new C0673Pl(new C0743RC().getMessage());
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC2634vj m5146j(Class r3) {
        AbstractC2634vj r0 = defaultInstanceMap.get(r3);
        if (r0 == null) goto L17;
    L9:
        if (r0 != null) goto L16;
        AbstractC2634vj r02 = ((AbstractC2634vj) AbstractC2092jD.m4262b(r3)).m5153k();
        if (r02 == null) goto L15;
        defaultInstanceMap.put(r3, r02);
        return r02;
    L15:
        throw new IllegalStateException();
    L16:
        return r0;
    L17:
        Class.forName(r3.getName(), true, r3.getClassLoader());     // Catch: ClassNotFoundException -> L6
        r0 = defaultInstanceMap.get(r3);
    L6:
        e = move-exception;
        throw new IllegalStateException("Class initialization cannot fail.", e);
    }

    /* JADX INFO: renamed from: l */
    public static Object m5147l(Method r0, AbstractC2634vj r1, Object... r2) {
        return r0.invoke(r1, r2);
    L15:
        e = move-exception;
        throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
    L4:
        e = move-exception;
        Throwable r02 = e.getCause();
        if ((r02 instanceof RuntimeException) == true) goto L14;
        if ((r02 instanceof Error) == false) goto L12;
        throw ((Error) r02);
    L12:
        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", r02);
    L14:
        throw ((RuntimeException) r02);
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m5148m(AbstractC2634vj r2, boolean r3) {
        byte r1 = ((Byte) r2.mo44i(1)).byteValue();
        if (r1 != 1) goto L5;
        return true;
    L5:
        if (r1 != 0) goto L8;
        return false;
    L8:
        C0338Hu r0 = C0338Hu.f1144c;
        r0.getClass();
        boolean r02 = r0.m725a(r2.getClass()).mo1076f(r2);
        if (r3 == false) goto L11;
        r2.mo44i(2);
    L11:
        return r02;
    }

    /* JADX INFO: renamed from: r */
    public static AbstractC2634vj m5149r(AbstractC2634vj r3, AbstractC2744y6 r4, C0839Tg r5) {
        C2701x6 r42 = (C2701x6) r4;
        C1539ia r43 = AbstractC2140ka.m4323h(r42.f9275d, r42.mo5222h(), r42.size(), true);
        AbstractC2634vj r32 = m5150s(r3, r43, r5);
        r43.mo2936b(0);
        m5145g(r32);
        return r32;
    }

    /* JADX INFO: renamed from: s */
    public static AbstractC2634vj m5150s(AbstractC2634vj r2, AbstractC2140ka r3, C0839Tg r4) {
        AbstractC2634vj r22 = r2.m5157q();
        C0338Hu r0 = C0338Hu.f1144c;     // Catch: RuntimeException -> L9 IOException -> L15 C0743RC -> L22 C0673Pl -> L25
        r0.getClass();     // Catch: RuntimeException -> L9 IOException -> L15 C0743RC -> L22 C0673Pl -> L25
        InterfaceC2253mx r02 = r0.m725a(r22.getClass());     // Catch: RuntimeException -> L9 IOException -> L15 C0743RC -> L22 C0673Pl -> L25
        C2187la r1 = (C2187la) r3.f7486b;     // Catch: RuntimeException -> L9 IOException -> L15 C0743RC -> L22 C0673Pl -> L25
        if (r1 != null) goto L7;
        r1 = new C2187la(r3);     // Catch: RuntimeException -> L9 IOException -> L15 C0743RC -> L22 C0673Pl -> L25
    L7:
        r02.mo1079i(r22, r1, r4);     // Catch: RuntimeException -> L9 IOException -> L15 C0743RC -> L22 C0673Pl -> L25
        r02.mo1074d(r22);     // Catch: RuntimeException -> L9 IOException -> L15 C0743RC -> L22 C0673Pl -> L25
        return r22;
    L25:
        e = move-exception;
        if (e.f2146a == true) goto L29;
        throw e;
    L29:
        throw new C0673Pl(e.getMessage(), e);
    L22:
        e = move-exception;
        throw new C0673Pl(e.getMessage());
    L15:
        e = move-exception;
        if ((e.getCause() instanceof C0673Pl) == false) goto L21;
        throw ((C0673Pl) e.getCause());
    L21:
        throw new C0673Pl(e.getMessage(), e);
    L9:
        e = move-exception;
        if ((e.getCause() instanceof C0673Pl) == true) goto L13;
        throw e;
    L13:
        throw ((C0673Pl) e.getCause());
    }

    /* JADX INFO: renamed from: t */
    public static void m5151t(Class r1, AbstractC2634vj r2) {
        r2.m5155o();
        defaultInstanceMap.put(r1, r2);
    }

    @Override // p000.InterfaceC0464Kr
    /* JADX INFO: renamed from: a */
    public /* bridge */ /* synthetic */ AbstractC2634vj mo1a() {
        return m5153k();
    }

    @Override // p000.AbstractC0043B
    /* JADX INFO: renamed from: b */
    public final int mo63b(InterfaceC2253mx r4) {
        if (m5154n() == false) goto L11;
        if (r4 != null) goto L6;
        C0338Hu r42 = C0338Hu.f1144c;
        r42.getClass();
        int r43 = r42.m725a(getClass()).mo1075e(this);
    L7:
        if (r43 < 0) goto L10;
        return r43;
    L10:
        throw new IllegalStateException(AbstractC2374ph.m4812i(r43, "serialized size must be non-negative, was "));
    L6:
        r43 = r4.mo1075e(this);
        goto L7
    L11:
        int r0 = this.memoizedSerializedSize;
        if ((r0 & Integer.MAX_VALUE) != Integer.MAX_VALUE) goto L14;
        if (r4 != null) goto L17;
        C0338Hu r44 = C0338Hu.f1144c;
        r44.getClass();
        int r45 = r44.m725a(getClass()).mo1075e(this);
    L18:
        m5158u(r45);
        return r45;
    L17:
        r45 = r4.mo1075e(this);
        goto L18
    L14:
        return r0 & Integer.MAX_VALUE;
    }

    @Override // p000.AbstractC0043B
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ AbstractC2548tj mo65d() {
        return m5156p();
    }

    public final boolean equals(Object r3) {
        if (this != r3) goto L5;
        return true;
    L5:
        if (r3 != null) goto L8;
        return false;
    L8:
        if (getClass() == r3.getClass()) goto L11;
        return false;
    L11:
        C0338Hu r0 = C0338Hu.f1144c;
        r0.getClass();
        return r0.m725a(getClass()).mo1078h(this, (AbstractC2634vj) r3);
    }

    @Override // p000.AbstractC0043B
    /* JADX INFO: renamed from: f */
    public final void mo67f(C2230ma r3) {
        C0338Hu r0 = C0338Hu.f1144c;
        r0.getClass();
        InterfaceC2253mx r02 = r0.m725a(getClass());
        C0132D2 r1 = r3.f7799f;
        if (r1 != null) goto L6;
        r1 = new C0132D2(r3);
    L6:
        r02.mo1071a(this, r1);
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC2548tj m5152h() {
        return (AbstractC2548tj) mo44i(5);
    }

    public final int hashCode() {
        if (m5154n() == false) goto L7;
        C0338Hu r0 = C0338Hu.f1144c;
        r0.getClass();
        return r0.m725a(getClass()).mo1072b(this);
    L7:
        if (this.memoizedHashCode != 0) goto L10;
        C0338Hu r02 = C0338Hu.f1144c;
        r02.getClass();
        this.memoizedHashCode = r02.m725a(getClass()).mo1072b(this);
    L10:
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo44i(int r1);

    /* JADX INFO: renamed from: k */
    public final AbstractC2634vj m5153k() {
        return (AbstractC2634vj) mo44i(6);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m5154n() {
        if ((this.memoizedSerializedSize & Integer.MIN_VALUE) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m5155o() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: p */
    public final AbstractC2548tj m5156p() {
        return (AbstractC2548tj) mo44i(5);
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC2634vj m5157q() {
        return (AbstractC2634vj) mo44i(4);
    }

    public final String toString() {
        String r0 = super.toString();
        char[] r1 = AbstractC0507Lr.f1661a;
        StringBuilder r12 = new StringBuilder();
        r12.append("# ");
        r12.append(r0);
        AbstractC0507Lr.m991c(this, r12, 0);
        return r12.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m5158u(int r3) {
        if (r3 < 0) goto L6;
        int r32 = r3 & Integer.MAX_VALUE;
        this.memoizedSerializedSize = r32 | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        return;
    L6:
        throw new IllegalStateException(AbstractC2374ph.m4812i(r3, "serialized size must be non-negative, was "));
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC2548tj m5159v() {
        AbstractC2548tj r0 = (AbstractC2548tj) mo44i(5);
        if (r0.f8870a.equals(this) == true) goto L6;
        r0.m5038e();
        AbstractC2548tj.m5034f(r0.f8871b, this);
    L6:
        return r0;
    }
}
