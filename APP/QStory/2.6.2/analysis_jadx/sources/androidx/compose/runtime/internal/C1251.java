package androidx.compose.runtime.internal;

import android.content.Context;
import android.os.Trace;
import androidx.activity.compose.C0004;
import androidx.collection.AbstractC0285;
import androidx.collection.AbstractC0286;
import androidx.collection.C0235;
import androidx.compose.runtime.C1320;
import androidx.compose.runtime.InterfaceC1339;
import androidx.compose.runtime.InterfaceC1370;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.tooling.C1292;
import java.util.Iterator;
import java.util.Set;
import p000.AbstractC6087;
import p052.InterfaceC6542;
import p257.C8239;
import top.suzhelan.plugin.sdk.online.presenter.C5806;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f3626;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f3627;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f3628;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f3629;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f3630;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f3631;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Object f3632;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object f3633;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Object f3634;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Object f3635;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object f3636;

    public C1251() {
        C1224 c1224 = new C1224(0, new C1320[16]);
        this.f3629 = c1224;
        C0235 c0235 = AbstractC0285.f997;
        this.f3633 = new C0235();
        this.f3628 = c1224;
        this.f3627 = new C1224(0, new Object[16]);
        this.f3626 = new C1224(0, new InterfaceC6542[16]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m2167(C1320 c1320, C1224 c1224) {
        Object[] objArr = c1224.f3520;
        int i = c1224.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC1339 interfaceC1339 = ((C1320) objArr[i2]).f3823;
            if (interfaceC1339 instanceof C1250) {
                C1224 c12242 = ((C1250) interfaceC1339).f3624;
                if (c12242.m2045(c1320) || m2167(c1320, c12242)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m2168(C1320 c1320) {
        C1224 c1224 = (C1224) this.f3629;
        if (!((C0235) this.f3633).m873(c1320)) {
            AbstractC0286 abstractC0286 = (AbstractC0286) this.f3634;
            if (abstractC0286 == null || !abstractC0286.m873(c1320)) {
                ((C1224) this.f3627).m2037(c1320);
                return;
            }
            return;
        }
        ((C0235) this.f3633).m745(c1320);
        if (!((C1224) this.f3628).m2045(c1320) && !c1224.m2045(c1320)) {
            m2167(c1320, c1224);
        }
        Set set = (Set) this.f3631;
        if (set == null) {
            return;
        }
        set.add(c1320.f3823);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m2169() {
        C1224 c1224 = (C1224) this.f3626;
        if (c1224.f3519 != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = c1224.f3520;
                int i = c1224.f3519;
                for (int i2 = 0; i2 < i; i2++) {
                    ((InterfaceC6542) objArr[i2]).invoke();
                }
                c1224.m2042();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m2170() {
        C1224 c1224 = (C1224) this.f3629;
        C1224 c12242 = (C1224) this.f3627;
        Set set = (Set) this.f3631;
        if (set == null) {
            return;
        }
        this.f3634 = null;
        int i = 7;
        if (c12242.f3519 != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C0235 c0235 = (C0235) this.f3632;
                int i2 = c12242.f3519;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = c12242.f3520[i2];
                    try {
                        if (obj instanceof C1320) {
                            InterfaceC1339 interfaceC1339 = ((C1320) obj).f3823;
                            set.remove(interfaceC1339);
                            interfaceC1339.mo2165();
                        }
                        if (obj instanceof InterfaceC1370) {
                            if (c0235 == null || !c0235.m873(obj)) {
                                ((InterfaceC1370) obj).mo2494();
                            } else {
                                ((InterfaceC1370) obj).mo2495();
                            }
                        }
                    } catch (Throwable th) {
                        C1292 c1292 = (C1292) this.f3630;
                        if (c1292 != null) {
                            AbstractC6087.m11423(th, new C0004(c1292, i, obj));
                        }
                        throw th;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (c1224.f3519 != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.f3631;
                if (set2 != null) {
                    Object[] objArr = c1224.f3520;
                    int i3 = c1224.f3519;
                    for (int i4 = 0; i4 < i3; i4++) {
                        C1320 c1320 = (C1320) objArr[i4];
                        InterfaceC1339 interfaceC13392 = c1320.f3823;
                        set2.remove(interfaceC13392);
                        try {
                            interfaceC13392.mo2164();
                        } catch (Throwable th2) {
                            C1292 c12922 = (C1292) this.f3630;
                            if (c12922 != null) {
                                AbstractC6087.m11423(th2, new C0004(c12922, i, c1320));
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
    public void m2171() {
        Set set = (Set) this.f3631;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC1339 interfaceC1339 = (InterfaceC1339) it.next();
                it.remove();
                interfaceC1339.mo2166();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m2172() {
        this.f3631 = null;
        this.f3630 = null;
        C1224 c1224 = (C1224) this.f3629;
        c1224.m2042();
        ((C0235) this.f3633).m739();
        this.f3628 = c1224;
        ((C1224) this.f3627).m2042();
        ((C1224) this.f3626).m2042();
        this.f3632 = null;
        this.f3635 = null;
        this.f3636 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m2173(Set set, C1292 c1292) {
        m2172();
        this.f3631 = set;
        this.f3630 = c1292;
    }

    public C1251(Context context, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f3631 = context;
        this.f3630 = str;
        this.f3629 = str2;
        this.f3628 = new C5806(this);
        this.f3627 = C8239.m13743();
    }
}
