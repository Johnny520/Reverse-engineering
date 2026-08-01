package androidx.compose.runtime.internal;

import androidx.compose.animation.core.C0356;
import androidx.compose.foundation.layout.C0591;
import androidx.compose.foundation.lazy.layout.C0695;
import androidx.compose.runtime.C1324;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1373;
import androidx.compose.ui.C2125;
import java.util.ArrayList;
import kotlin.InterfaceC5167;
import kotlin.jvm.internal.AbstractC4387;
import kotlin.jvm.internal.AbstractC4394;
import p052.InterfaceC6537;
import p052.InterfaceC6538;
import p052.InterfaceC6540;
import p052.InterfaceC6541;
import p052.InterfaceC6543;
import p052.InterfaceC6544;
import p052.InterfaceC6545;
import p052.InterfaceC6546;
import p052.InterfaceC6547;
import p052.InterfaceC6548;
import p052.InterfaceC6549;
import p052.InterfaceC6550;
import p052.InterfaceC6551;
import p052.InterfaceC6553;
import p052.InterfaceC6554;
import p052.InterfaceC6555;
import p052.InterfaceC6556;
import p052.InterfaceC6558;
import p052.InterfaceC6559;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1242 implements InterfaceC6553, InterfaceC6550, InterfaceC6551, InterfaceC6544, InterfaceC6543, InterfaceC6546, InterfaceC6547, InterfaceC6545, InterfaceC6541, InterfaceC6540, InterfaceC6538, InterfaceC6537, InterfaceC6555, InterfaceC6554, InterfaceC6558, InterfaceC6559, InterfaceC6556, InterfaceC6549, InterfaceC6548 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ArrayList f3597;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C1389 f3598;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f3599;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f3600;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f3601;

    public C1242(int i, boolean z, InterfaceC5167 interfaceC5167) {
        this.f3601 = i;
        this.f3599 = z;
        this.f3600 = interfaceC5167;
    }

    @Override // p052.InterfaceC6547
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return m2135(obj2, (Boolean) obj3, obj4, obj5, obj6, (InterfaceC1373) obj7, ((Number) obj8).intValue());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m2132(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(this.f3601);
        m2138(c1324);
        int iM2182 = c1324.m2350(this) ? AbstractC1254.m2182(2, 4) : AbstractC1254.m2182(1, 4);
        Object obj5 = this.f3600;
        obj5.getClass();
        AbstractC4387.m8898(6, obj5);
        Object objInvoke = ((InterfaceC6543) obj5).invoke(obj, obj2, obj3, obj4, c1324, Integer.valueOf(iM2182 | i));
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0591(this, obj, obj2, obj3, obj4, i);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m2133(Object obj, Object obj2, Object obj3, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(this.f3601);
        m2138(c1324);
        int iM2182 = c1324.m2350(this) ? AbstractC1254.m2182(2, 3) : AbstractC1254.m2182(1, 3);
        Object obj4 = this.f3600;
        obj4.getClass();
        AbstractC4387.m8898(5, obj4);
        Object objInvoke = ((InterfaceC6544) obj4).invoke(obj, obj2, obj3, c1324, Integer.valueOf(iM2182 | i));
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C1244(this, obj, obj2, obj3, i, 0);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m2134(Object obj, Object obj2, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(this.f3601);
        m2138(c1324);
        int iM2182 = c1324.m2350(this) ? AbstractC1254.m2182(2, 2) : AbstractC1254.m2182(1, 2);
        Object obj3 = this.f3600;
        obj3.getClass();
        AbstractC4387.m8898(4, obj3);
        Object objInvoke = ((InterfaceC6551) obj3).invoke(obj, obj2, c1324, Integer.valueOf(iM2182 | i));
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0695(this, obj, obj2, i, 5);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m2135(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(this.f3601);
        m2138(c1324);
        int iM2182 = c1324.m2350(this) ? AbstractC1254.m2182(2, 6) : AbstractC1254.m2182(1, 6);
        Object obj5 = this.f3600;
        obj5.getClass();
        AbstractC4387.m8898(8, obj5);
        Object objInvoke = ((InterfaceC6547) obj5).invoke(C2125.f6275, obj, bool, obj2, obj3, obj4, c1324, Integer.valueOf(i | iM2182));
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C1243(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m2136(Object obj, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(this.f3601);
        m2138(c1324);
        int iM2182 = c1324.m2350(this) ? AbstractC1254.m2182(2, 1) : AbstractC1254.m2182(1, 1);
        Object obj2 = this.f3600;
        obj2.getClass();
        AbstractC4387.m8898(3, obj2);
        Object objInvoke = ((InterfaceC6550) obj2).invoke(obj, c1324, Integer.valueOf(iM2182 | i));
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C0356(i, 3, this, obj);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m2137(InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(this.f3601);
        m2138(c1324);
        int iM2182 = i | (c1324.m2350(this) ? AbstractC1254.m2182(2, 0) : AbstractC1254.m2182(1, 0));
        Object obj = this.f3600;
        obj.getClass();
        AbstractC4387.m8898(2, obj);
        Object objInvoke = ((InterfaceC6553) obj).invoke(c1324, Integer.valueOf(iM2182));
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new ComposableLambdaImpl$invoke$1(this);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m2138(InterfaceC1373 interfaceC1373) {
        C1389 c1389M2359;
        if (!this.f3599 || (c1389M2359 = ((C1324) interfaceC1373).m2359()) == null) {
            return;
        }
        c1389M2359.f4035 |= 1;
        C1389 c1389 = this.f3598;
        if (c1389 == null || !c1389.m2520() || c1389 == c1389M2359 || AbstractC4394.m8917(c1389.f4034, c1389M2359.f4034)) {
            this.f3598 = c1389M2359;
            return;
        }
        ArrayList arrayList = this.f3597;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f3597 = arrayList2;
            arrayList2.add(c1389M2359);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1389 c13892 = (C1389) arrayList.get(i);
            if (c13892 == null || !c13892.m2520() || c13892 == c1389M2359 || AbstractC4394.m8917(c13892.f4034, c1389M2359.f4034)) {
                arrayList.set(i, c1389M2359);
                return;
            }
        }
        arrayList.add(c1389M2359);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m2139(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC1373 interfaceC1373, int i) {
        C1324 c1324 = (C1324) interfaceC1373;
        c1324.m2381(this.f3601);
        m2138(c1324);
        int iM2182 = c1324.m2350(this) ? AbstractC1254.m2182(2, 5) : AbstractC1254.m2182(1, 5);
        Object obj6 = this.f3600;
        obj6.getClass();
        AbstractC4387.m8898(7, obj6);
        Object objInvoke = ((InterfaceC6546) obj6).invoke(obj, obj2, obj3, obj4, obj5, c1324, Integer.valueOf(i | iM2182));
        C1389 c1389M2365 = c1324.m2365();
        if (c1389M2365 != null) {
            c1389M2365.f4033 = new C1243(this, obj, obj2, obj3, obj4, obj5, i);
        }
        return objInvoke;
    }

    @Override // p052.InterfaceC6550
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m2136(obj, (InterfaceC1373) obj2, ((Number) obj3).intValue());
    }

    @Override // p052.InterfaceC6551
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m2134(obj, obj2, (InterfaceC1373) obj3, ((Number) obj4).intValue());
    }

    @Override // p052.InterfaceC6544
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m2133(obj, obj2, obj3, (InterfaceC1373) obj4, ((Number) obj5).intValue());
    }

    @Override // p052.InterfaceC6543
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m2132(obj, obj2, obj3, obj4, (InterfaceC1373) obj5, ((Number) obj6).intValue());
    }

    @Override // p052.InterfaceC6546
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m2139(obj, obj2, obj3, obj4, obj5, (InterfaceC1373) obj6, ((Number) obj7).intValue());
    }

    @Override // p052.InterfaceC6553
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m2137((InterfaceC1373) obj, ((Number) obj2).intValue());
    }
}
