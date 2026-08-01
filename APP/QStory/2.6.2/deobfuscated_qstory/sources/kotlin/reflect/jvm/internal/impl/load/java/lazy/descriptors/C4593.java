package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4344;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.AbstractC5061;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4434;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4651;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6542;
import p065.C6867;
import p072.C6922;
import p077.C6969;
import p083.C7040;
import p392.AbstractC9124;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4593 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4591 f13399;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13400;

    public /* synthetic */ C4593(C4591 c4591, int i) {
        this.f13400 = i;
        this.f13399 = c4591;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f13400;
        C4591 c4591 = this.f13399;
        switch (i) {
            case 0:
                C0325 c0325 = c4591.f13394;
                C4651 c4651 = ((C7040) c0325.f1095).f18915;
                String str = c4591.f18692.f13692.f13689;
                c4651.getClass();
                str.getClass();
                EmptyList<String> emptyList = EmptyList.INSTANCE;
                ArrayList arrayList = new ArrayList();
                for (String str2 : emptyList) {
                    C4686 c4686 = new C4686(C6867.m12061(str2).f18315.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                    C6969 c6969M10040 = AbstractC5061.m10040(((C7040) c0325.f1095).f18897, new C4687(c4686.m9330(), c4686.f13692.m9328()), c4591.f13395);
                    Pair pair = c6969M10040 != null ? new Pair(str2, c6969M10040) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return AbstractC4338.m8783(arrayList);
            case 1:
                c4591.f13396.getClass();
                EmptyList emptyList2 = EmptyList.INSTANCE;
                ArrayList arrayList2 = new ArrayList(AbstractC4344.m8832(emptyList2, 10));
                Iterator<E> it = emptyList2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C4434) it.next()).f13061);
                }
                return arrayList2;
            default:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) AbstractC9124.m14672(c4591.f13393, C4591.f13389[0])).entrySet()) {
                    String str3 = (String) entry.getKey();
                    C6969 c6969 = (C6969) entry.getValue();
                    C6867 c6867M12061 = C6867.m12061(str3);
                    C6922 c6922 = c6969.f18665;
                    KotlinClassHeader$Kind kotlinClassHeader$Kind = c6922.f18478;
                    int i2 = AbstractC4594.f13401[kotlinClassHeader$Kind.ordinal()];
                    if (i2 == 1) {
                        String str4 = c6922.f18473;
                        if (kotlinClassHeader$Kind != KotlinClassHeader$Kind.MULTIFILE_CLASS_PART) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            map.put(c6867M12061, C6867.m12061(str4));
                        }
                    } else if (i2 == 2) {
                        map.put(c6867M12061, c6867M12061);
                    }
                }
                return map;
        }
    }
}
