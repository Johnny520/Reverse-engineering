package androidx.compose.runtime.internal;

import androidx.compose.animation.core.C1202;
import androidx.compose.foundation.layout.C1432;
import androidx.compose.foundation.lazy.layout.C1536;
import androidx.compose.p001ui.C2958;
import androidx.compose.runtime.C2159;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2208;
import java.util.ArrayList;
import kotlin.InterfaceC6000;
import kotlin.jvm.internal.AbstractC5220;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7367;
import p068.InterfaceC7368;
import p068.InterfaceC7370;
import p068.InterfaceC7371;
import p068.InterfaceC7373;
import p068.InterfaceC7374;
import p068.InterfaceC7375;
import p068.InterfaceC7376;
import p068.InterfaceC7377;
import p068.InterfaceC7378;
import p068.InterfaceC7379;
import p068.InterfaceC7380;
import p068.InterfaceC7381;
import p068.InterfaceC7383;
import p068.InterfaceC7384;
import p068.InterfaceC7385;
import p068.InterfaceC7386;
import p068.InterfaceC7388;
import p068.InterfaceC7389;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2077 implements InterfaceC7383, InterfaceC7380, InterfaceC7381, InterfaceC7374, InterfaceC7373, InterfaceC7376, InterfaceC7377, InterfaceC7375, InterfaceC7371, InterfaceC7370, InterfaceC7368, InterfaceC7367, InterfaceC7385, InterfaceC7384, InterfaceC7388, InterfaceC7389, InterfaceC7386, InterfaceC7379, InterfaceC7378 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public ArrayList f3943;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public C2224 f3944;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f3945;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public Object f3946;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f3947;

    public C2077(int i, boolean z, InterfaceC6000 interfaceC6000) {
        this.f3947 = i;
        this.f3945 = z;
        this.f3946 = interfaceC6000;
    }

    @Override // p068.InterfaceC7377
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        return m2705(obj2, (Boolean) obj3, obj4, obj5, obj6, (InterfaceC2208) obj7, ((Number) obj8).intValue());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Object m2702(Object obj, Object obj2, Object obj3, Object obj4, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(this.f3947);
        m2708(c2159);
        int iM2752 = c2159.m2920(this) ? AbstractC2089.m2752(2, 4) : AbstractC2089.m2752(1, 4);
        Object obj5 = this.f3946;
        obj5.getClass();
        AbstractC5220.m9447(6, obj5);
        Object objInvoke = ((InterfaceC7373) obj5).invoke(obj, obj2, obj3, obj4, c2159, Integer.valueOf(iM2752 | i));
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1432(this, obj, obj2, obj3, obj4, i);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m2703(Object obj, Object obj2, Object obj3, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(this.f3947);
        m2708(c2159);
        int iM2752 = c2159.m2920(this) ? AbstractC2089.m2752(2, 3) : AbstractC2089.m2752(1, 3);
        Object obj4 = this.f3946;
        obj4.getClass();
        AbstractC5220.m9447(5, obj4);
        Object objInvoke = ((InterfaceC7374) obj4).invoke(obj, obj2, obj3, c2159, Integer.valueOf(iM2752 | i));
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C2079(this, obj, obj2, obj3, i, 0);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object m2704(Object obj, Object obj2, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(this.f3947);
        m2708(c2159);
        int iM2752 = c2159.m2920(this) ? AbstractC2089.m2752(2, 2) : AbstractC2089.m2752(1, 2);
        Object obj3 = this.f3946;
        obj3.getClass();
        AbstractC5220.m9447(4, obj3);
        Object objInvoke = ((InterfaceC7381) obj3).invoke(obj, obj2, c2159, Integer.valueOf(iM2752 | i));
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1536(this, obj, obj2, i, 5);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m2705(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(this.f3947);
        m2708(c2159);
        int iM2752 = c2159.m2920(this) ? AbstractC2089.m2752(2, 6) : AbstractC2089.m2752(1, 6);
        Object obj5 = this.f3946;
        obj5.getClass();
        AbstractC5220.m9447(8, obj5);
        Object objInvoke = ((InterfaceC7377) obj5).invoke(C2958.f6621, obj, bool, obj2, obj3, obj4, c2159, Integer.valueOf(i | iM2752));
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C2078(this, obj, bool, obj2, obj3, obj4, i);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m2706(Object obj, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(this.f3947);
        m2708(c2159);
        int iM2752 = c2159.m2920(this) ? AbstractC2089.m2752(2, 1) : AbstractC2089.m2752(1, 1);
        Object obj2 = this.f3946;
        obj2.getClass();
        AbstractC5220.m9447(3, obj2);
        Object objInvoke = ((InterfaceC7380) obj2).invoke(obj, c2159, Integer.valueOf(iM2752 | i));
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C1202(i, 3, this, obj);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m2707(InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(this.f3947);
        m2708(c2159);
        int iM2752 = i | (c2159.m2920(this) ? AbstractC2089.m2752(2, 0) : AbstractC2089.m2752(1, 0));
        Object obj = this.f3946;
        obj.getClass();
        AbstractC5220.m9447(2, obj);
        Object objInvoke = ((InterfaceC7383) obj).invoke(c2159, Integer.valueOf(iM2752));
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new ComposableLambdaImpl$invoke$1(this);
        }
        return objInvoke;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final void m2708(InterfaceC2208 interfaceC2208) {
        C2224 c2224M2929;
        if (!this.f3945 || (c2224M2929 = ((C2159) interfaceC2208).m2929()) == null) {
            return;
        }
        c2224M2929.f4381 |= 1;
        C2224 c2224 = this.f3944;
        if (c2224 == null || !c2224.m3090() || c2224 == c2224M2929 || AbstractC5227.m9466(c2224.f4380, c2224M2929.f4380)) {
            this.f3944 = c2224M2929;
            return;
        }
        ArrayList arrayList = this.f3943;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            this.f3943 = arrayList2;
            arrayList2.add(c2224M2929);
            return;
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C2224 c22242 = (C2224) arrayList.get(i);
            if (c22242 == null || !c22242.m3090() || c22242 == c2224M2929 || AbstractC5227.m9466(c22242.f4380, c2224M2929.f4380)) {
                arrayList.set(i, c2224M2929);
                return;
            }
        }
        arrayList.add(c2224M2929);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Object m2709(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC2208 interfaceC2208, int i) {
        C2159 c2159 = (C2159) interfaceC2208;
        c2159.m2951(this.f3947);
        m2708(c2159);
        int iM2752 = c2159.m2920(this) ? AbstractC2089.m2752(2, 5) : AbstractC2089.m2752(1, 5);
        Object obj6 = this.f3946;
        obj6.getClass();
        AbstractC5220.m9447(7, obj6);
        Object objInvoke = ((InterfaceC7376) obj6).invoke(obj, obj2, obj3, obj4, obj5, c2159, Integer.valueOf(i | iM2752));
        C2224 c2224M2935 = c2159.m2935();
        if (c2224M2935 != null) {
            c2224M2935.f4379 = new C2078(this, obj, obj2, obj3, obj4, obj5, i);
        }
        return objInvoke;
    }

    @Override // p068.InterfaceC7380
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m2706(obj, (InterfaceC2208) obj2, ((Number) obj3).intValue());
    }

    @Override // p068.InterfaceC7381
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m2704(obj, obj2, (InterfaceC2208) obj3, ((Number) obj4).intValue());
    }

    @Override // p068.InterfaceC7374
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return m2703(obj, obj2, obj3, (InterfaceC2208) obj4, ((Number) obj5).intValue());
    }

    @Override // p068.InterfaceC7373
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return m2702(obj, obj2, obj3, obj4, (InterfaceC2208) obj5, ((Number) obj6).intValue());
    }

    @Override // p068.InterfaceC7376
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return m2709(obj, obj2, obj3, obj4, obj5, (InterfaceC2208) obj6, ((Number) obj7).intValue());
    }

    @Override // p068.InterfaceC7383
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m2707((InterfaceC2208) obj, ((Number) obj2).intValue());
    }
}
