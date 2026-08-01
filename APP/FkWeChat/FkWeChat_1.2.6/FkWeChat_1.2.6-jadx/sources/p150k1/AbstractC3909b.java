package p150k1;

import androidx.compose.runtime.AbstractC0539m1;
import androidx.compose.runtime.C0460b;
import androidx.compose.runtime.InterfaceC0572r;
import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1061t;
import p299ub.AbstractC8611a0;
import p314vb.C8897d;

/* JADX INFO: renamed from: k1.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3909b {

    /* JADX INFO: renamed from: a */
    public final List f11371a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final boolean m15565a(int i10, AbstractC0539m1 abstractC0539m1, Object obj) {
        ArrayList arrayListM1923e = abstractC0539m1.m1923e();
        boolean z10 = false;
        if (arrayListM1923e == null) {
            if (!abstractC0539m1.m1920b()) {
                m15566b(i10, abstractC0539m1, null);
                return true;
            }
            int iM1922d = abstractC0539m1.m1922d();
            int iM1921c = abstractC0539m1.m1921c();
            if (obj instanceof Integer) {
                Number number = (Number) obj;
                int iIntValue = number.intValue();
                if ((iM1922d <= iIntValue && iIntValue < iM1921c) || (iM1922d == iM1921c && iM1922d == number.intValue())) {
                    z10 = true;
                }
                if (z10) {
                    m15566b(abstractC0539m1.m1924f(), abstractC0539m1, null);
                }
            }
            return z10;
        }
        int size = arrayListM1923e.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj2 = arrayListM1923e.get(i11);
            if (obj2 instanceof C0460b) {
                if (AbstractC1061t.m3842c(obj2, obj)) {
                    m15566b(abstractC0539m1.m1924f(), abstractC0539m1, obj2);
                    return true;
                }
            } else {
                if (!(obj2 instanceof AbstractC0539m1)) {
                    C8897d.m34134a("Unexpected child source info ", obj2);
                    return false;
                }
                if (m15565a(i10, (AbstractC0539m1) obj2, obj)) {
                    m15566b(abstractC0539m1.m1924f(), abstractC0539m1, obj2);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m15566b(int i10, AbstractC0539m1 abstractC0539m1, Object obj) {
        C3911d c3911dM15567c = m15567c(i10, abstractC0539m1, obj);
        if (c3911dM15567c != null) {
            this.f11371a.add(c3911dM15567c);
        }
    }

    /* JADX INFO: renamed from: c */
    public final C3911d m15567c(int i10, AbstractC0539m1 abstractC0539m1, Object obj) {
        return new C3911d(i10, null, null);
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo15563d(C0460b c0460b);

    /* JADX INFO: renamed from: e */
    public final boolean m15568e(AbstractC0539m1 abstractC0539m1) {
        String strM1925g = abstractC0539m1.m1925g();
        return strM1925g != null && AbstractC8611a0.m33075T(strM1925g, "C", false, 2, null);
    }

    /* JADX INFO: renamed from: f */
    public final void m15569f(int i10, Object obj, AbstractC0539m1 abstractC0539m1, Object obj2) {
        if (AbstractC1061t.m3842c(obj, InterfaceC0572r.f1573a.m2191a())) {
            m15566b(i10, abstractC0539m1, null);
        }
    }

    /* JADX INFO: renamed from: g */
    public abstract AbstractC0539m1 mo15564g(C0460b c0460b);

    /* JADX INFO: renamed from: h */
    public final AbstractC0539m1 m15570h(Object obj) {
        if (obj instanceof C0460b) {
            return mo15564g((C0460b) obj);
        }
        if (obj instanceof AbstractC0539m1) {
            return (AbstractC0539m1) obj;
        }
        C8897d.m34134a("Unexpected child source info ", obj);
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final List m15571i() {
        return this.f11371a;
    }
}
