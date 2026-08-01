package p045;

import com.alibaba.fastjson2.C2941;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.AbstractC4343;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4485;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins.C4777;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.text.AbstractC5138;
import kotlin.text.AbstractC5143;
import p079.AbstractC6988;
import p079.C6987;
import p079.C7003;
import p080.InterfaceC7021;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世子兰哲楪苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6466 implements InterfaceC7021 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC4485 f17749;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4844 f17750;

    public C6466(C4844 c4844, C6987 c6987) {
        c6987.getClass();
        this.f17750 = c4844;
        this.f17749 = c6987;
    }

    @Override // p080.InterfaceC7021
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final AbstractC6988 mo8974(C4687 c4687) {
        C4686 c4686;
        C6469 c6469M11948;
        c4687.getClass();
        if (!c4687.f13693 && !c4687.m9338()) {
            String str = c4687.f13694.f13692.f13689;
            if (AbstractC5143.m10171(str, "Function", false) && (c6469M11948 = C6470.f17755.m11948(str, (c4686 = c4687.f13695))) != null) {
                AbstractC6472 abstractC6472 = c6469M11948.f17754;
                int i = c6469M11948.f17753;
                List list = (List) AbstractC9124.m14672(this.f17749.mo9072(c4686).f18816, C7003.f18815[0]);
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    if (obj instanceof C4777) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                if (AbstractC4343.m8830(arrayList2) == null) {
                    return new C6464(this.f17750, (C4777) AbstractC4343.m8827(arrayList), abstractC6472, i);
                }
                C2941.m6336();
            }
        }
        return null;
    }

    @Override // p080.InterfaceC7021
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final boolean mo8975(C4686 c4686, C4690 c4690) {
        c4686.getClass();
        c4690.getClass();
        String strM9345 = c4690.m9345();
        strM9345.getClass();
        return (AbstractC5138.m10125(strM9345, "Function", false) || AbstractC5138.m10125(strM9345, "KFunction", false) || AbstractC5138.m10125(strM9345, "SuspendFunction", false) || AbstractC5138.m10125(strM9345, "KSuspendFunction", false)) && C6470.f17755.m11948(strM9345, c4686) != null;
    }

    @Override // p080.InterfaceC7021
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Collection mo8976(C4686 c4686) {
        c4686.getClass();
        return EmptySet.INSTANCE;
    }
}
