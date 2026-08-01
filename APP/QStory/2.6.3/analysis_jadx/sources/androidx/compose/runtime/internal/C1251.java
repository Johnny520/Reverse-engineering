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
import p018.AbstractC6253;
import p052.InterfaceC6543;
import p257.C8240;
import top.suzhelan.plugin.sdk.online.presenter.C5807;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1251 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public Object f3627;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object f3628;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public Object f3629;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object f3630;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public Object f3631;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object f3632;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Object f3633;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public Object f3634;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public Object f3635;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public Object f3636;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public Object f3637;

    public C1251() {
        C1224 c1224 = new C1224(0, new C1320[16]);
        this.f3630 = c1224;
        C0235 c0235 = AbstractC0285.f997;
        this.f3634 = new C0235();
        this.f3629 = c1224;
        this.f3628 = new C1224(0, new Object[16]);
        this.f3627 = new C1224(0, new InterfaceC6543[16]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final boolean m2177(C1320 c1320, C1224 c1224) {
        Object[] objArr = c1224.f3521;
        int i = c1224.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC1339 interfaceC1339 = ((C1320) objArr[i2]).f3824;
            if (interfaceC1339 instanceof C1250) {
                C1224 c12242 = ((C1250) interfaceC1339).f3625;
                if (c12242.m2055(c1320) || m2177(c1320, c12242)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public void m2178(C1320 c1320) {
        C1224 c1224 = (C1224) this.f3630;
        if (!((C0235) this.f3634).m874(c1320)) {
            AbstractC0286 abstractC0286 = (AbstractC0286) this.f3635;
            if (abstractC0286 == null || !abstractC0286.m874(c1320)) {
                ((C1224) this.f3628).m2047(c1320);
                return;
            }
            return;
        }
        ((C0235) this.f3634).m746(c1320);
        if (!((C1224) this.f3629).m2055(c1320) && !c1224.m2055(c1320)) {
            m2177(c1320, c1224);
        }
        Set set = (Set) this.f3632;
        if (set == null) {
            return;
        }
        set.add(c1320.f3824);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public void m2179() {
        C1224 c1224 = (C1224) this.f3627;
        if (c1224.f3520 != 0) {
            Trace.beginSection("Compose:sideeffects");
            try {
                Object[] objArr = c1224.f3521;
                int i = c1224.f3520;
                for (int i2 = 0; i2 < i; i2++) {
                    ((InterfaceC6543) objArr[i2]).invoke();
                }
                c1224.m2052();
            } finally {
                Trace.endSection();
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public void m2180() {
        C1224 c1224 = (C1224) this.f3630;
        C1224 c12242 = (C1224) this.f3628;
        Set set = (Set) this.f3632;
        if (set == null) {
            return;
        }
        this.f3635 = null;
        int i = 7;
        if (c12242.f3520 != 0) {
            Trace.beginSection("Compose:onForgotten");
            try {
                C0235 c0235 = (C0235) this.f3633;
                int i2 = c12242.f3520;
                while (true) {
                    i2--;
                    if (-1 >= i2) {
                        break;
                    }
                    Object obj = c12242.f3521[i2];
                    try {
                        if (obj instanceof C1320) {
                            InterfaceC1339 interfaceC1339 = ((C1320) obj).f3824;
                            set.remove(interfaceC1339);
                            interfaceC1339.mo2175();
                        }
                        if (obj instanceof InterfaceC1370) {
                            if (c0235 == null || !c0235.m874(obj)) {
                                ((InterfaceC1370) obj).mo2504();
                            } else {
                                ((InterfaceC1370) obj).mo2505();
                            }
                        }
                    } catch (Throwable th) {
                        C1292 c1292 = (C1292) this.f3631;
                        if (c1292 != null) {
                            AbstractC6253.m11737(th, new C0004(c1292, i, obj));
                        }
                        throw th;
                    }
                }
            } finally {
                Trace.endSection();
            }
        }
        if (c1224.f3520 != 0) {
            Trace.beginSection("Compose:onRemembered");
            try {
                Set set2 = (Set) this.f3632;
                if (set2 != null) {
                    Object[] objArr = c1224.f3521;
                    int i3 = c1224.f3520;
                    for (int i4 = 0; i4 < i3; i4++) {
                        C1320 c1320 = (C1320) objArr[i4];
                        InterfaceC1339 interfaceC13392 = c1320.f3824;
                        set2.remove(interfaceC13392);
                        try {
                            interfaceC13392.mo2174();
                        } catch (Throwable th2) {
                            C1292 c12922 = (C1292) this.f3631;
                            if (c12922 != null) {
                                AbstractC6253.m11737(th2, new C0004(c12922, i, c1320));
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
    public void m2181() {
        Set set = (Set) this.f3632;
        if (set == null || set.isEmpty()) {
            return;
        }
        Trace.beginSection("Compose:abandons");
        try {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                InterfaceC1339 interfaceC1339 = (InterfaceC1339) it.next();
                it.remove();
                interfaceC1339.mo2176();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m2182() {
        this.f3632 = null;
        this.f3631 = null;
        C1224 c1224 = (C1224) this.f3630;
        c1224.m2052();
        ((C0235) this.f3634).m740();
        this.f3629 = c1224;
        ((C1224) this.f3628).m2052();
        ((C1224) this.f3627).m2052();
        this.f3633 = null;
        this.f3636 = null;
        this.f3637 = null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public void m2183(Set set, C1292 c1292) {
        m2182();
        this.f3632 = set;
        this.f3631 = c1292;
    }

    public C1251(Context context, String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f3632 = context;
        this.f3631 = str;
        this.f3630 = str2;
        this.f3629 = new C5807(this);
        this.f3628 = C8240.m13759();
    }
}
