package p102h1;

import androidx.compose.runtime.AbstractC0468c0;
import androidx.compose.runtime.AbstractC0473c5;
import androidx.compose.runtime.AbstractC0497g1;
import androidx.compose.runtime.AbstractC0537m;
import androidx.compose.runtime.InterfaceC0466b5;
import androidx.compose.runtime.InterfaceC0512i2;
import androidx.compose.runtime.InterfaceC0572r;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.util.Arrays;
import p010a9.InterfaceC0173a;
import p010a9.InterfaceC0184l;
import p010a9.InterfaceC0188p;
import p119i1.InterfaceC3116b0;
import p172l8.C4700i0;
import p299ub.AbstractC8610a;
import p376zd.C9987e;

/* JADX INFO: renamed from: h1.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2825f {

    /* JADX INFO: renamed from: a */
    public static final int f7369a = 36;

    /* JADX INFO: renamed from: e */
    public static final String m10046e(Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    /* JADX INFO: renamed from: f */
    public static final InterfaceC2843x m10047f(final InterfaceC2843x interfaceC2843x) {
        interfaceC2843x.getClass();
        return AbstractC2819a0.m10035c(new InterfaceC0188p() { // from class: h1.c
            @Override // p010a9.InterfaceC0188p
            public final Object invoke(Object obj, Object obj2) {
                return AbstractC2825f.m10048g(interfaceC2843x, (InterfaceC2821b0) obj, (InterfaceC0512i2) obj2);
            }
        }, new InterfaceC0184l() { // from class: h1.d
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return AbstractC2825f.m10049h(interfaceC2843x, (InterfaceC0512i2) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static final InterfaceC0512i2 m10048g(InterfaceC2843x interfaceC2843x, InterfaceC2821b0 interfaceC2821b0, InterfaceC0512i2 interfaceC0512i2) {
        if (!(interfaceC0512i2 instanceof InterfaceC3116b0)) {
            C9987e.m38645a("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
            return null;
        }
        InterfaceC3116b0 interfaceC3116b0 = (InterfaceC3116b0) interfaceC0512i2;
        Object objMo10038b = interfaceC2843x.mo10038b(interfaceC2821b0, interfaceC3116b0.getValue());
        if (objMo10038b == null) {
            return null;
        }
        InterfaceC0466b5 interfaceC0466b5Mo1518c = interfaceC3116b0.mo1518c();
        interfaceC0466b5Mo1518c.getClass();
        return AbstractC0473c5.m1570i(objMo10038b, interfaceC0466b5Mo1518c);
    }

    /* JADX INFO: renamed from: h */
    public static final InterfaceC0512i2 m10049h(InterfaceC2843x interfaceC2843x, InterfaceC0512i2 interfaceC0512i2) {
        Object objMo10037a;
        if (!(interfaceC0512i2 instanceof InterfaceC3116b0)) {
            C9987e.m38645a("Failed requirement.");
            return null;
        }
        InterfaceC3116b0 interfaceC3116b0 = (InterfaceC3116b0) interfaceC0512i2;
        if (interfaceC3116b0.getValue() != null) {
            Object value = interfaceC3116b0.getValue();
            value.getClass();
            objMo10037a = interfaceC2843x.mo10037a(value);
        } else {
            objMo10037a = null;
        }
        InterfaceC0466b5 interfaceC0466b5Mo1518c = interfaceC3116b0.mo1518c();
        interfaceC0466b5Mo1518c.getClass();
        InterfaceC0512i2 interfaceC0512i2M1570i = AbstractC0473c5.m1570i(objMo10037a, interfaceC0466b5Mo1518c);
        interfaceC0512i2M1570i.getClass();
        return interfaceC0512i2M1570i;
    }

    /* JADX INFO: renamed from: i */
    public static final InterfaceC0512i2 m10050i(Object[] objArr, InterfaceC2843x interfaceC2843x, InterfaceC0173a interfaceC0173a, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(-746165481, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:208)");
        }
        InterfaceC0512i2 interfaceC0512i2 = (InterfaceC0512i2) m10053l(Arrays.copyOf(objArr, objArr.length), m10047f(interfaceC2843x), null, interfaceC0173a, interfaceC0572r, ((i10 << 3) & 7168) | 384, 0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return interfaceC0512i2;
    }

    /* JADX INFO: renamed from: j */
    public static final Object m10051j(Object[] objArr, InterfaceC0173a interfaceC0173a, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(1564532345, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:135)");
        }
        Object objM10053l = m10053l(Arrays.copyOf(objArr, objArr.length), AbstractC2819a0.m10036d(), null, interfaceC0173a, interfaceC0572r, ((i10 << 6) & 7168) | 384, 0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return objM10053l;
    }

    /* JADX INFO: renamed from: k */
    public static final Object m10052k(Object[] objArr, InterfaceC2843x interfaceC2843x, InterfaceC0173a interfaceC0173a, InterfaceC0572r interfaceC0572r, int i10) {
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(674689872, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:180)");
        }
        Object objM10053l = m10053l(Arrays.copyOf(objArr, objArr.length), interfaceC2843x, null, interfaceC0173a, interfaceC0572r, (i10 & Opcodes.IREM) | 384 | ((i10 << 3) & 7168), 0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return objM10053l;
    }

    /* JADX INFO: renamed from: l */
    public static final Object m10053l(Object[] objArr, InterfaceC2843x interfaceC2843x, String str, InterfaceC0173a interfaceC0173a, InterfaceC0572r interfaceC0572r, int i10, int i11) {
        Object[] objArr2;
        final Object obj;
        Object objMo1348c;
        if ((i11 & 2) != 0) {
            interfaceC2843x = AbstractC2819a0.m10036d();
        }
        final InterfaceC2843x interfaceC2843x2 = interfaceC2843x;
        int i12 = i11 & 4;
        Object objInvoke = null;
        if (i12 != 0) {
            str = null;
        }
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1559m(441892779, i10, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:79)");
        }
        long jM1915b = AbstractC0537m.m1915b(interfaceC0572r, 0);
        if (str == null || str.length() == 0) {
            str = Long.toString(jM1915b, AbstractC8610a.m33053a(f7369a));
            str.getClass();
        }
        final String str2 = str;
        interfaceC2843x2.getClass();
        final InterfaceC2837r interfaceC2837r = (InterfaceC2837r) interfaceC0572r.mo2142A(AbstractC2840u.m10083f());
        Object objMo2170f = interfaceC0572r.mo2170f();
        InterfaceC0572r.a aVar = InterfaceC0572r.f1573a;
        if (objMo2170f == aVar.m2191a()) {
            if (interfaceC2837r != null && (objMo1348c = interfaceC2837r.mo1348c(str2)) != null) {
                objInvoke = interfaceC2843x2.mo10037a(objMo1348c);
            }
            if (objInvoke == null) {
                objInvoke = interfaceC0173a.invoke();
            }
            objArr2 = objArr;
            Object c2827h = new C2827h(interfaceC2843x2, interfaceC2837r, str2, objInvoke, objArr2);
            interfaceC0572r.mo2153L(c2827h);
            objMo2170f = c2827h;
        } else {
            objArr2 = objArr;
        }
        final C2827h c2827h2 = (C2827h) objMo2170f;
        Object objM10057d = c2827h2.m10057d(objArr2);
        if (objM10057d == null) {
            objM10057d = interfaceC0173a.invoke();
        }
        boolean zMo2175k = interfaceC0572r.mo2175k(c2827h2) | ((((i10 & Opcodes.IREM) ^ 48) > 32 && interfaceC0572r.mo2175k(interfaceC2843x2)) || (i10 & 48) == 32) | interfaceC0572r.mo2175k(interfaceC2837r) | interfaceC0572r.mo2162U(str2) | interfaceC0572r.mo2175k(objM10057d) | interfaceC0572r.mo2175k(objArr2);
        Object objMo2170f2 = interfaceC0572r.mo2170f();
        if (zMo2175k || objMo2170f2 == aVar.m2191a()) {
            final Object[] objArr3 = objArr2;
            obj = objM10057d;
            Object obj2 = new InterfaceC0173a() { // from class: h1.e
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return AbstractC2825f.m10054m(c2827h2, interfaceC2843x2, interfaceC2837r, str2, obj, objArr3);
                }
            };
            interfaceC0572r.mo2153L(obj2);
            objMo2170f2 = obj2;
        } else {
            obj = objM10057d;
        }
        AbstractC0497g1.m1683g((InterfaceC0173a) objMo2170f2, interfaceC0572r, 0);
        if (AbstractC0468c0.m1556j()) {
            AbstractC0468c0.m1558l();
        }
        return obj;
    }

    /* JADX INFO: renamed from: m */
    public static final C4700i0 m10054m(C2827h c2827h, InterfaceC2843x interfaceC2843x, InterfaceC2837r interfaceC2837r, String str, Object obj, Object[] objArr) {
        c2827h.m10059f(interfaceC2843x, interfaceC2837r, str, obj, objArr);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: n */
    public static final void m10055n(InterfaceC2837r interfaceC2837r, Object obj) {
        String strM10046e;
        if (obj == null || interfaceC2837r.mo1346a(obj)) {
            return;
        }
        if (obj instanceof InterfaceC3116b0) {
            InterfaceC3116b0 interfaceC3116b0 = (InterfaceC3116b0) obj;
            if (interfaceC3116b0.mo1518c() == AbstractC0473c5.m1572k() || interfaceC3116b0.mo1518c() == AbstractC0473c5.m1579r() || interfaceC3116b0.mo1518c() == AbstractC0473c5.m1576o()) {
                strM10046e = "MutableState containing " + interfaceC3116b0.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                strM10046e = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            strM10046e = m10046e(obj);
        }
        throw new IllegalArgumentException(strM10046e);
    }
}
