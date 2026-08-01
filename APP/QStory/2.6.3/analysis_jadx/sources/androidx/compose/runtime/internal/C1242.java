package androidx.compose.runtime.internal;

import androidx.compose.animation.core.C0356;
import androidx.compose.foundation.layout.C0591;
import androidx.compose.foundation.lazy.layout.C0695;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2125;
import java.util.ArrayList;
import kotlin.InterfaceC5168;
import kotlin.jvm.internal.AbstractC4388;
import kotlin.jvm.internal.AbstractC4395;
import p052.InterfaceC6538;
import p052.InterfaceC6539;
import p052.InterfaceC6541;
import p052.InterfaceC6542;
import p052.InterfaceC6544;
import p052.InterfaceC6545;
import p052.InterfaceC6546;
import p052.InterfaceC6547;
import p052.InterfaceC6548;
import p052.InterfaceC6549;
import p052.InterfaceC6550;
import p052.InterfaceC6551;
import p052.InterfaceC6552;
import p052.InterfaceC6554;
import p052.InterfaceC6555;
import p052.InterfaceC6556;
import p052.InterfaceC6557;
import p052.InterfaceC6559;
import p052.InterfaceC6560;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1242 implements InterfaceC6554, InterfaceC6551, InterfaceC6552, InterfaceC6545, InterfaceC6544, InterfaceC6547, InterfaceC6548, InterfaceC6546, InterfaceC6542, InterfaceC6541, InterfaceC6539, InterfaceC6538, InterfaceC6556, InterfaceC6555, InterfaceC6559, InterfaceC6560, InterfaceC6557, InterfaceC6550, InterfaceC6549 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ArrayList f3598;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1389 f3599;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f3600;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f3601;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f3602;

    public C1242(int i, boolean z, InterfaceC5168 interfaceC5168) {
        this.f3602 = i;
        this.f3600 = z;
        this.f3601 = interfaceC5168;
    }

    @Override // p052.InterfaceC6548
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return m2145(obj2, (Boolean) obj3, obj4, obj5, obj6, (InterfaceC1373) obj7, ((Number) obj8).intValue());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m2142(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(this.f3602);
        m2148(c1324);
        int iM2192 = c1324.m2360(this) ? AbstractC1254.m2192(2, 4) : AbstractC1254.m2192(1, 4);
        Object obj5 = this.f3601;
        obj5.getClass();
        AbstractC4388.m8888(6, obj5);
        Object objInvoke = ((InterfaceC6544) obj5).invoke(obj, obj2, obj3, obj4, c1324, Integer.valueOf(iM2192 | i));
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0591(this, obj, obj2, obj3, obj4, i);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m2143(Object obj, Object obj2, Object obj3, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(this.f3602);
        m2148(c1324);
        int iM2192 = c1324.m2360(this) ? AbstractC1254.m2192(2, 3) : AbstractC1254.m2192(1, 3);
        Object obj4 = this.f3601;
        obj4.getClass();
        AbstractC4388.m8888(5, obj4);
        Object objInvoke = ((InterfaceC6545) obj4).invoke(obj, obj2, obj3, c1324, Integer.valueOf(iM2192 | i));
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C1244(this, obj, obj2, obj3, i, 0);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m2144(Object obj, Object obj2, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(this.f3602);
        m2148(c1324);
        int iM2192 = c1324.m2360(this) ? AbstractC1254.m2192(2, 2) : AbstractC1254.m2192(1, 2);
        Object obj3 = this.f3601;
        obj3.getClass();
        AbstractC4388.m8888(4, obj3);
        Object objInvoke = ((InterfaceC6552) obj3).invoke(obj, obj2, c1324, Integer.valueOf(iM2192 | i));
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0695(this, obj, obj2, i, 5);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m2145(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(this.f3602);
        m2148(c1324);
        int iM2192 = c1324.m2360(this) ? AbstractC1254.m2192(2, 6) : AbstractC1254.m2192(1, 6);
        Object obj5 = this.f3601;
        obj5.getClass();
        AbstractC4388.m8888(8, obj5);
        Object objInvoke = ((InterfaceC6548) obj5).invoke(C2125.f6276, obj, bool, obj2, obj3, obj4, c1324, Integer.valueOf(i | iM2192));
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C1243(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m2146(Object obj, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(this.f3602);
        m2148(c1324);
        int iM2192 = c1324.m2360(this) ? AbstractC1254.m2192(2, 1) : AbstractC1254.m2192(1, 1);
        Object obj2 = this.f3601;
        obj2.getClass();
        AbstractC4388.m8888(3, obj2);
        Object objInvoke = ((InterfaceC6551) obj2).invoke(obj, c1324, Integer.valueOf(iM2192 | i));
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C0356(i, 3, this, obj);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m2147(InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(this.f3602);
        m2148(c1324);
        int iM2192 = i | (c1324.m2360(this) ? AbstractC1254.m2192(2, 0) : AbstractC1254.m2192(1, 0));
        Object obj = this.f3601;
        obj.getClass();
        AbstractC4388.m8888(2, obj);
        Object objInvoke = ((InterfaceC6554) obj).invoke(c1324, Integer.valueOf(iM2192));
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new ComposableLambdaImpl$invoke$1(this);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m2148(InterfaceC1373 interfaceC1373) {
        C1389 c1389M2369;
        if (!this.f3600 || (c1389M2369 = ((C1324) interfaceC1373).m2369()) == null) {
            return;
        }
        c1389M2369.f4036 |= 1;
        C1389 c1389 = this.f3599;
        if (c1389 == null || !c1389.m2530() || c1389 == c1389M2369 || AbstractC4395.m8907(c1389.f4035, c1389M2369.f4035)) {
            this.f3599 = c1389M2369;
            return;
        }
        ArrayList arrayList = this.f3598;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f3598 = arrayList2;
            arrayList2.add(c1389M2369);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1389 c13892 = (C1389) arrayList.get(i);
            if (c13892 == null || !c13892.m2530() || c13892 == c1389M2369 || AbstractC4395.m8907(c13892.f4035, c1389M2369.f4035)) {
                arrayList.set(i, c1389M2369);
                return;
            }
        }
        arrayList.add(c1389M2369);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m2149(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2391(this.f3602);
        m2148(c1324);
        int iM2192 = c1324.m2360(this) ? AbstractC1254.m2192(2, 5) : AbstractC1254.m2192(1, 5);
        Object obj6 = this.f3601;
        obj6.getClass();
        AbstractC4388.m8888(7, obj6);
        Object objInvoke = ((InterfaceC6547) obj6).invoke(obj, obj2, obj3, obj4, obj5, c1324, Integer.valueOf(i | iM2192));
        C1389 c1389M2375 = c1324.m2375();
        if (c1389M2375 != null) {
            c1389M2375.f4034 = new C1243(this, obj, obj2, obj3, obj4, obj5, i);
        }
        return objInvoke;
    }

    @Override // p052.InterfaceC6551
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m2146(obj, (InterfaceC1373) obj2, ((Number) obj3).intValue());
    }

    @Override // p052.InterfaceC6552
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m2144(obj, obj2, (InterfaceC1373) obj3, ((Number) obj4).intValue());
    }

    @Override // p052.InterfaceC6545
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m2143(obj, obj2, obj3, (InterfaceC1373) obj4, ((Number) obj5).intValue());
    }

    @Override // p052.InterfaceC6544
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m2142(obj, obj2, obj3, obj4, (InterfaceC1373) obj5, ((Number) obj6).intValue());
    }

    @Override // p052.InterfaceC6547
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m2149(obj, obj2, obj3, obj4, obj5, (InterfaceC1373) obj6, ((Number) obj7).intValue());
    }

    @Override // p052.InterfaceC6554
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m2147((InterfaceC1373) obj, ((Number) obj2).intValue());
    }
}
