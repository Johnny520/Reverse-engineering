package p253r4;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p117i.C3036a;
import p280t5.C8130u;

/* JADX INFO: renamed from: r4.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6484a {

    /* JADX INFO: renamed from: a */
    public final C3036a f20363a;

    /* JADX INFO: renamed from: b */
    public final C3036a f20364b;

    /* JADX INFO: renamed from: c */
    public final C3036a f20365c;

    public AbstractC6484a(C3036a c3036a, C3036a c3036a2, C3036a c3036a3) {
        this.f20363a = c3036a;
        this.f20364b = c3036a2;
        this.f20365c = c3036a3;
    }

    /* JADX INFO: renamed from: A */
    public abstract void mo25686A(byte[] bArr);

    /* JADX INFO: renamed from: B */
    public void m25687B(byte[] bArr, int i10) {
        mo25722w(i10);
        mo25686A(bArr);
    }

    /* JADX INFO: renamed from: C */
    public abstract void mo25688C(CharSequence charSequence);

    /* JADX INFO: renamed from: D */
    public void m25689D(CharSequence charSequence, int i10) {
        mo25722w(i10);
        mo25688C(charSequence);
    }

    /* JADX INFO: renamed from: E */
    public abstract void mo25690E(int i10);

    /* JADX INFO: renamed from: F */
    public void m25691F(int i10, int i11) {
        mo25722w(i11);
        mo25690E(i10);
    }

    /* JADX INFO: renamed from: G */
    public abstract void mo25692G(Parcelable parcelable);

    /* JADX INFO: renamed from: H */
    public void m25693H(Parcelable parcelable, int i10) {
        mo25722w(i10);
        mo25692G(parcelable);
    }

    /* JADX INFO: renamed from: I */
    public abstract void mo25694I(String str);

    /* JADX INFO: renamed from: J */
    public void m25695J(String str, int i10) {
        mo25722w(i10);
        mo25694I(str);
    }

    /* JADX INFO: renamed from: K */
    public void m25696K(InterfaceC6486c interfaceC6486c, AbstractC6484a abstractC6484a) {
        try {
            m25704e(interfaceC6486c.getClass()).invoke(null, interfaceC6486c, abstractC6484a);
        } catch (ClassNotFoundException e10) {
            C8130u.m31512a("VersionedParcel encountered ClassNotFoundException", e10);
        } catch (IllegalAccessException e11) {
            C8130u.m31512a("VersionedParcel encountered IllegalAccessException", e11);
        } catch (NoSuchMethodException e12) {
            C8130u.m31512a("VersionedParcel encountered NoSuchMethodException", e12);
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            C8130u.m31512a("VersionedParcel encountered InvocationTargetException", e13);
        }
    }

    /* JADX INFO: renamed from: L */
    public void m25697L(InterfaceC6486c interfaceC6486c) {
        if (interfaceC6486c == null) {
            mo25694I(null);
            return;
        }
        m25699N(interfaceC6486c);
        AbstractC6484a abstractC6484aMo25701b = mo25701b();
        m25696K(interfaceC6486c, abstractC6484aMo25701b);
        abstractC6484aMo25701b.mo25700a();
    }

    /* JADX INFO: renamed from: M */
    public void m25698M(InterfaceC6486c interfaceC6486c, int i10) {
        mo25722w(i10);
        m25697L(interfaceC6486c);
    }

    /* JADX INFO: renamed from: N */
    public final void m25699N(InterfaceC6486c interfaceC6486c) {
        try {
            mo25694I(m25702c(interfaceC6486c.getClass()).getName());
        } catch (ClassNotFoundException e10) {
            C8130u.m31512a(interfaceC6486c.getClass().getSimpleName().concat(" does not have a Parcelizer"), e10);
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo25700a();

    /* JADX INFO: renamed from: b */
    public abstract AbstractC6484a mo25701b();

    /* JADX INFO: renamed from: c */
    public final Class m25702c(Class cls) throws ClassNotFoundException {
        Class cls2 = (Class) this.f20365c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f20365c.put(cls.getName(), cls3);
        return cls3;
    }

    /* JADX INFO: renamed from: d */
    public final Method m25703d(String str) throws NoSuchMethodException {
        Method method = (Method) this.f20363a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, AbstractC6484a.class.getClassLoader()).getDeclaredMethod("read", AbstractC6484a.class);
        this.f20363a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: e */
    public final Method m25704e(Class cls) throws NoSuchMethodException, ClassNotFoundException {
        Method method = (Method) this.f20364b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class clsM25702c = m25702c(cls);
        System.currentTimeMillis();
        Method declaredMethod = clsM25702c.getDeclaredMethod("write", cls, AbstractC6484a.class);
        this.f20364b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* JADX INFO: renamed from: f */
    public boolean m25705f() {
        return false;
    }

    /* JADX INFO: renamed from: g */
    public abstract boolean mo25706g();

    /* JADX INFO: renamed from: h */
    public boolean m25707h(boolean z10, int i10) {
        return !mo25712m(i10) ? z10 : mo25706g();
    }

    /* JADX INFO: renamed from: i */
    public abstract byte[] mo25708i();

    /* JADX INFO: renamed from: j */
    public byte[] m25709j(byte[] bArr, int i10) {
        return !mo25712m(i10) ? bArr : mo25708i();
    }

    /* JADX INFO: renamed from: k */
    public abstract CharSequence mo25710k();

    /* JADX INFO: renamed from: l */
    public CharSequence m25711l(CharSequence charSequence, int i10) {
        return !mo25712m(i10) ? charSequence : mo25710k();
    }

    /* JADX INFO: renamed from: m */
    public abstract boolean mo25712m(int i10);

    /* JADX INFO: renamed from: n */
    public InterfaceC6486c m25713n(String str, AbstractC6484a abstractC6484a) {
        try {
            return (InterfaceC6486c) m25703d(str).invoke(null, abstractC6484a);
        } catch (ClassNotFoundException e10) {
            C8130u.m31512a("VersionedParcel encountered ClassNotFoundException", e10);
            return null;
        } catch (IllegalAccessException e11) {
            C8130u.m31512a("VersionedParcel encountered IllegalAccessException", e11);
            return null;
        } catch (NoSuchMethodException e12) {
            C8130u.m31512a("VersionedParcel encountered NoSuchMethodException", e12);
            return null;
        } catch (InvocationTargetException e13) {
            if (e13.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e13.getCause());
            }
            C8130u.m31512a("VersionedParcel encountered InvocationTargetException", e13);
            return null;
        }
    }

    /* JADX INFO: renamed from: o */
    public abstract int mo25714o();

    /* JADX INFO: renamed from: p */
    public int m25715p(int i10, int i11) {
        return !mo25712m(i11) ? i10 : mo25714o();
    }

    /* JADX INFO: renamed from: q */
    public abstract Parcelable mo25716q();

    /* JADX INFO: renamed from: r */
    public Parcelable m25717r(Parcelable parcelable, int i10) {
        return !mo25712m(i10) ? parcelable : mo25716q();
    }

    /* JADX INFO: renamed from: s */
    public abstract String mo25718s();

    /* JADX INFO: renamed from: t */
    public String m25719t(String str, int i10) {
        return !mo25712m(i10) ? str : mo25718s();
    }

    /* JADX INFO: renamed from: u */
    public InterfaceC6486c m25720u() {
        String strMo25718s = mo25718s();
        if (strMo25718s == null) {
            return null;
        }
        return m25713n(strMo25718s, mo25701b());
    }

    /* JADX INFO: renamed from: v */
    public InterfaceC6486c m25721v(InterfaceC6486c interfaceC6486c, int i10) {
        return !mo25712m(i10) ? interfaceC6486c : m25720u();
    }

    /* JADX INFO: renamed from: w */
    public abstract void mo25722w(int i10);

    /* JADX INFO: renamed from: y */
    public abstract void mo25724y(boolean z10);

    /* JADX INFO: renamed from: z */
    public void m25725z(boolean z10, int i10) {
        mo25722w(i10);
        mo25724y(z10);
    }

    /* JADX INFO: renamed from: x */
    public void m25723x(boolean z10, boolean z11) {
    }
}
