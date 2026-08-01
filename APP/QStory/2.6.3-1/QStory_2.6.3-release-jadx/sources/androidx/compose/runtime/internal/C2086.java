package androidx.compose.runtime.internal;

import android.content.Context;
import android.os.Trace;
import androidx.activity.compose.C0851;
import androidx.collection.AbstractC1132;
import androidx.collection.AbstractC1133;
import androidx.collection.C1082;
import androidx.compose.runtime.C2155;
import androidx.compose.runtime.InterfaceC2174;
import androidx.compose.runtime.InterfaceC2205;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.tooling.C2127;
import java.util.Iterator;
import java.util.Set;
import p034.AbstractC7082;
import p068.InterfaceC7372;
import p273.C9069;
import top.suzhelan.plugin.sdk.online.presenter.C6637;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2086 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f3972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f3973;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f3974;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f3975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f3976;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f3977;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Object f3978;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object f3979;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Object f3980;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Object f3981;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object f3982;

    public C2086() {
        C2059 c2059 = new C2059(0, new C2155[16]);
        this.f3975 = c2059;
        C1082 c1082 = AbstractC1132.f1342;
        this.f3979 = new C1082();
        this.f3974 = c2059;
        this.f3973 = new C2059(0, new Object[16]);
        this.f3972 = new C2059(0, new InterfaceC7372[16]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m2737(C2155 c2155, C2059 c2059) {
        Object[] objArr = c2059.f3866;
        int i = c2059.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC2174 interfaceC2174 = ((C2155) objArr[i2]).f4169;
            if (interfaceC2174 instanceof C2085) {
                C2059 c20592 = ((C2085) interfaceC2174).f3970;
                if (c20592.m2615(c2155) || m2737(c2155, c20592)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m2738(C2155 c2155) {
        C2059 c2059 = (C2059) this.f3975;
        if (!((C1082) this.f3979).m1434(c2155)) {
            AbstractC1133 abstractC1133 = (AbstractC1133) this.f3980;
            if (abstractC1133 == null || !abstractC1133.m1434(c2155)) {
                ((C2059) this.f3973).m2607(c2155);
                return;
            }
            return;
        }
        ((C1082) this.f3979).m1306(c2155);
        if (!((C2059) this.f3974).m2615(c2155) && !c2059.m2615(c2155)) {
            m2737(c2155, c2059);
        }
        Set set = (Set) this.f3977;
        if (set == null) {
            return;
        }
        set.add(c2155.f4169);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m2739() {
        C2059 c2059 = (C2059) this.f3972;
        if (c2059.f3865 != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = c2059.f3866;
                int i = c2059.f3865;
                for (int i2 = 0; i2 < i; i2++) {
                    ((InterfaceC7372) objArr[i2]).invoke();
                }
                c2059.m2612();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m2740() {
        C2059 c2059 = (C2059) this.f3975;
        C2059 c20592 = (C2059) this.f3973;
        Set set = (Set) this.f3977;
        if (set == null) {
            return;
        }
        this.f3980 = null;
        int i = 7;
        if (c20592.f3865 != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C1082 c1082 = (C1082) this.f3978;
                int i2 = c20592.f3865;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = c20592.f3866[i2];
                    try {
                        if (obj instanceof C2155) {
                            InterfaceC2174 interfaceC2174 = ((C2155) obj).f4169;
                            set.remove(interfaceC2174);
                            interfaceC2174.mo2735();
                        }
                        if (obj instanceof InterfaceC2205) {
                            if (c1082 == null || !c1082.m1434(obj)) {
                                ((InterfaceC2205) obj).mo3064();
                            } else {
                                ((InterfaceC2205) obj).mo3065();
                            }
                        }
                    } catch (Throwable th) {
                        C2127 c2127 = (C2127) this.f3976;
                        if (c2127 != null) {
                            AbstractC7082.m12296(th, new C0851(c2127, i, obj));
                        }
                        throw th;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (c2059.f3865 != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.f3977;
                if (set2 != null) {
                    Object[] objArr = c2059.f3866;
                    int i3 = c2059.f3865;
                    for (int i4 = 0; i4 < i3; i4++) {
                        C2155 c2155 = (C2155) objArr[i4];
                        InterfaceC2174 interfaceC21742 = c2155.f4169;
                        set2.remove(interfaceC21742);
                        try {
                            interfaceC21742.mo2734();
                        } catch (Throwable th2) {
                            C2127 c21272 = (C2127) this.f3976;
                            if (c21272 != null) {
                                AbstractC7082.m12296(th2, new C0851(c21272, i, c2155));
                            }
                            throw th2;
                        }
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public void m2741() {
        Set set = (Set) this.f3977;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC2174 interfaceC2174 = (InterfaceC2174) it.next();
                it.remove();
                interfaceC2174.mo2736();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m2742() {
        this.f3977 = null;
        this.f3976 = null;
        C2059 c2059 = (C2059) this.f3975;
        c2059.m2612();
        ((C1082) this.f3979).m1300();
        this.f3974 = c2059;
        ((C2059) this.f3973).m2612();
        ((C2059) this.f3972).m2612();
        this.f3978 = null;
        this.f3981 = null;
        this.f3982 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m2743(Set set, C2127 c2127) {
        m2742();
        this.f3977 = set;
        this.f3976 = c2127;
    }

    public C2086(Context context, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f3977 = context;
        this.f3976 = str;
        this.f3975 = str2;
        this.f3974 = new C6637(this);
        this.f3973 = C9069.m14318();
    }
}
