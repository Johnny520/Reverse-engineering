package p241q7;

import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5114x;
import p185m8.AbstractC5116y;
import p228p8.InterfaceC5976f;
import p241q7.AbstractC6301m;
import p281t6.AbstractC8149h0;
import p281t6.InterfaceC8141d0;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8625h0;
import p376zd.C9987e;

/* JADX INFO: renamed from: q7.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6291h extends AbstractC6299l {

    /* JADX INFO: renamed from: a */
    public final String f19714a;

    /* JADX INFO: renamed from: b */
    public final String f19715b;

    public C6291h(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f19714a = str;
        this.f19715b = str2;
        for (int i10 = 0; i10 < str2.length(); i10++) {
            if (str2.charAt(i10) == '/') {
                C9987e.m38645a("Multisegment prefix is not supported");
                throw null;
            }
        }
    }

    @Override // p241q7.AbstractC6299l
    /* JADX INFO: renamed from: a */
    public Object mo24864a(C6294i0 c6294i0, int i10, InterfaceC5976f interfaceC5976f) {
        InterfaceC8141d0 interfaceC8141d0M31621e;
        String str;
        List listM24897e = c6294i0.m24897e();
        int i11 = 0;
        if (this.f19715b.length() > 0 && ((str = (String) AbstractC5081g0.m20579m0(listM24897e, i10)) == null || !AbstractC8611a0.m33075T(str, this.f19715b, false, 2, null))) {
            return AbstractC6301m.f19755b.m24920d();
        }
        if (this.f19714a.length() == 0) {
            interfaceC8141d0M31621e = AbstractC8149h0.m31619c();
        } else {
            String str2 = this.f19714a;
            List listM20565d0 = AbstractC5081g0.m20565d0(listM24897e, i10);
            ArrayList arrayList = new ArrayList(AbstractC5116y.m20814z(listM20565d0, 10));
            for (Object obj : listM20565d0) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    AbstractC5114x.m20810y();
                }
                String strM33176v1 = (String) obj;
                if (i11 == 0) {
                    strM33176v1 = AbstractC8625h0.m33176v1(strM33176v1, this.f19715b.length());
                }
                arrayList.add(strM33176v1);
                i11 = i12;
            }
            interfaceC8141d0M31621e = AbstractC8149h0.m31621e(str2, arrayList);
        }
        return new AbstractC6301m.c(i10 < listM24897e.size() ? 0.1d : 0.2d, interfaceC8141d0M31621e, listM24897e.size() - i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6291h)) {
            return false;
        }
        C6291h c6291h = (C6291h) obj;
        return AbstractC1061t.m3842c(this.f19714a, c6291h.f19714a) && AbstractC1061t.m3842c(this.f19715b, c6291h.f19715b);
    }

    public int hashCode() {
        return (this.f19714a.hashCode() * 31) + this.f19715b.hashCode();
    }

    public String toString() {
        return "{...}";
    }
}
