package p000;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
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
    private static Map<Object, AbstractC2634vj> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C1001XC unknownFields;

    public AbstractC2634vj() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C1001XC.f3195f;
    }

    /* JADX INFO: renamed from: g */
    public static void m5145g(AbstractC2634vj abstractC2634vj) throws C0673Pl {
        if (!m5148m(abstractC2634vj, true)) {
            throw new C0673Pl(new C0743RC().getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    public static AbstractC2634vj m5146j(Class cls) {
        AbstractC2634vj abstractC2634vj = defaultInstanceMap.get(cls);
        if (abstractC2634vj == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2634vj = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC2634vj != null) {
            return abstractC2634vj;
        }
        AbstractC2634vj abstractC2634vjMo1a = ((AbstractC2634vj) AbstractC2092jD.m4262b(cls)).mo1a();
        if (abstractC2634vjMo1a == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC2634vjMo1a);
        return abstractC2634vjMo1a;
    }

    /* JADX INFO: renamed from: l */
    public static Object m5147l(Method method, AbstractC2634vj abstractC2634vj, Object... objArr) {
        try {
            return method.invoke(abstractC2634vj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* JADX INFO: renamed from: m */
    public static final boolean m5148m(AbstractC2634vj abstractC2634vj, boolean z) {
        byte bByteValue = ((Byte) abstractC2634vj.mo44i(1)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        C0338Hu c0338Hu = C0338Hu.f1144c;
        c0338Hu.getClass();
        boolean zMo1076f = c0338Hu.m725a(abstractC2634vj.getClass()).mo1076f(abstractC2634vj);
        if (z) {
            abstractC2634vj.mo44i(2);
        }
        return zMo1076f;
    }

    /* JADX INFO: renamed from: r */
    public static AbstractC2634vj m5149r(AbstractC2634vj abstractC2634vj, AbstractC2744y6 abstractC2744y6, C0839Tg c0839Tg) throws C0673Pl {
        C2701x6 c2701x6 = (C2701x6) abstractC2744y6;
        C1539ia c1539iaM4323h = AbstractC2140ka.m4323h(c2701x6.f9275d, c2701x6.mo5222h(), c2701x6.size(), true);
        AbstractC2634vj abstractC2634vjM5150s = m5150s(abstractC2634vj, c1539iaM4323h, c0839Tg);
        c1539iaM4323h.mo2936b(0);
        m5145g(abstractC2634vjM5150s);
        return abstractC2634vjM5150s;
    }

    /* JADX INFO: renamed from: s */
    public static AbstractC2634vj m5150s(AbstractC2634vj abstractC2634vj, AbstractC2140ka abstractC2140ka, C0839Tg c0839Tg) throws C0673Pl {
        AbstractC2634vj abstractC2634vjM5157q = abstractC2634vj.m5157q();
        try {
            C0338Hu c0338Hu = C0338Hu.f1144c;
            c0338Hu.getClass();
            InterfaceC2253mx interfaceC2253mxM725a = c0338Hu.m725a(abstractC2634vjM5157q.getClass());
            C2187la c2187la = (C2187la) abstractC2140ka.f7486b;
            if (c2187la == null) {
                c2187la = new C2187la(abstractC2140ka);
            }
            interfaceC2253mxM725a.mo1079i(abstractC2634vjM5157q, c2187la, c0839Tg);
            interfaceC2253mxM725a.mo1074d(abstractC2634vjM5157q);
            return abstractC2634vjM5157q;
        } catch (C0673Pl e) {
            if (e.f2146a) {
                throw new C0673Pl(e.getMessage(), e);
            }
            throw e;
        } catch (C0743RC e2) {
            throw new C0673Pl(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof C0673Pl) {
                throw ((C0673Pl) e3.getCause());
            }
            throw new C0673Pl(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C0673Pl) {
                throw ((C0673Pl) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m5151t(Class cls, AbstractC2634vj abstractC2634vj) {
        abstractC2634vj.m5155o();
        defaultInstanceMap.put(cls, abstractC2634vj);
    }

    @Override // p000.AbstractC0043B
    /* JADX INFO: renamed from: b */
    public final int mo63b(InterfaceC2253mx interfaceC2253mx) {
        int iMo1075e;
        int iMo1075e2;
        if (m5154n()) {
            if (interfaceC2253mx == null) {
                C0338Hu c0338Hu = C0338Hu.f1144c;
                c0338Hu.getClass();
                iMo1075e2 = c0338Hu.m725a(getClass()).mo1075e(this);
            } else {
                iMo1075e2 = interfaceC2253mx.mo1075e(this);
            }
            if (iMo1075e2 >= 0) {
                return iMo1075e2;
            }
            throw new IllegalStateException(AbstractC2374ph.m4812i(iMo1075e2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (interfaceC2253mx == null) {
            C0338Hu c0338Hu2 = C0338Hu.f1144c;
            c0338Hu2.getClass();
            iMo1075e = c0338Hu2.m725a(getClass()).mo1075e(this);
        } else {
            iMo1075e = interfaceC2253mx.mo1075e(this);
        }
        m5158u(iMo1075e);
        return iMo1075e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0338Hu c0338Hu = C0338Hu.f1144c;
        c0338Hu.getClass();
        return c0338Hu.m725a(getClass()).mo1078h(this, (AbstractC2634vj) obj);
    }

    @Override // p000.AbstractC0043B
    /* JADX INFO: renamed from: f */
    public final void mo67f(C2230ma c2230ma) {
        C0338Hu c0338Hu = C0338Hu.f1144c;
        c0338Hu.getClass();
        InterfaceC2253mx interfaceC2253mxM725a = c0338Hu.m725a(getClass());
        C0132D2 c0132d2 = c2230ma.f7799f;
        if (c0132d2 == null) {
            c0132d2 = new C0132D2(c2230ma);
        }
        interfaceC2253mxM725a.mo1071a(this, c0132d2);
    }

    /* JADX INFO: renamed from: h */
    public final AbstractC2548tj m5152h() {
        return (AbstractC2548tj) mo44i(5);
    }

    public final int hashCode() {
        if (m5154n()) {
            C0338Hu c0338Hu = C0338Hu.f1144c;
            c0338Hu.getClass();
            return c0338Hu.m725a(getClass()).mo1072b(this);
        }
        if (this.memoizedHashCode == 0) {
            C0338Hu c0338Hu2 = C0338Hu.f1144c;
            c0338Hu2.getClass();
            this.memoizedHashCode = c0338Hu2.m725a(getClass()).mo1072b(this);
        }
        return this.memoizedHashCode;
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo44i(int i);

    @Override // p000.InterfaceC0464Kr
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final AbstractC2634vj mo1a() {
        return (AbstractC2634vj) mo44i(6);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m5154n() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: o */
    public final void m5155o() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // p000.AbstractC0043B
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final AbstractC2548tj mo65d() {
        return (AbstractC2548tj) mo44i(5);
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC2634vj m5157q() {
        return (AbstractC2634vj) mo44i(4);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = AbstractC0507Lr.f1661a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0507Lr.m991c(this, sb, 0);
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final void m5158u(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC2374ph.m4812i(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC2548tj m5159v() {
        AbstractC2548tj abstractC2548tj = (AbstractC2548tj) mo44i(5);
        if (!abstractC2548tj.f8870a.equals(this)) {
            abstractC2548tj.m5038e();
            AbstractC2548tj.m5034f(abstractC2548tj.f8871b, this);
        }
        return abstractC2548tj;
    }
}
