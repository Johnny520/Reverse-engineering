package p061;

import com.alibaba.fastjson2.C3775;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC5176;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5318;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C5610;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.text.AbstractC5971;
import kotlin.text.AbstractC5976;
import p034.AbstractC7082;
import p095.AbstractC7818;
import p095.C7817;
import p095.C7833;
import p096.InterfaceC7851;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7296 implements InterfaceC7851 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5318 f18090;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5677 f18091;

    public C7296(C5677 c5677, C7817 c7817) {
        c7817.getClass();
        this.f18091 = c5677;
        this.f18090 = c7817;
    }

    @Override // p096.InterfaceC7851
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC7818 mo9523(C5520 c5520) {
        C5519 c5519;
        C7299 c7299M12550;
        c5520.getClass();
        if (!c5520.f14042 && !c5520.m9887()) {
            String str = c5520.f14043.f14041.f14038;
            if (AbstractC5976.m10735(str, "Function", false) && (c7299M12550 = C7300.f18096.m12550(str, (c5519 = c5520.f14044))) != null) {
                AbstractC7302 abstractC7302 = c7299M12550.f18095;
                int i = c7299M12550.f18094;
                List list = (List) AbstractC7082.m12308(this.f18090.mo9621(c5519).f19156, C7833.f19155[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof C5610) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (AbstractC5176.m9374(arrayList2) == null) {
                    return new C7294(this.f18091, (C5610) AbstractC5176.m9379(arrayList), abstractC7302, i);
                }
                C3775.m6954();
            }
        }
        return null;
    }

    @Override // p096.InterfaceC7851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo9524(C5519 c5519, C5523 c5523) {
        c5519.getClass();
        c5523.getClass();
        String strM9894 = c5523.m9894();
        strM9894.getClass();
        return (AbstractC5971.m10698(strM9894, "Function", false) || AbstractC5971.m10698(strM9894, "KFunction", false) || AbstractC5971.m10698(strM9894, "SuspendFunction", false) || AbstractC5971.m10698(strM9894, "KSuspendFunction", false)) && C7300.f18096.m12550(strM9894, c5519) != null;
    }

    @Override // p096.InterfaceC7851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo9525(C5519 c5519) {
        c5519.getClass();
        return EmptySet.INSTANCE;
    }
}
