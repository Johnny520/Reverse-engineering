package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C0325;
import com.bumptech.glide.AbstractC3057;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4345;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4435;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C4652;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import net.bytebuddy.pool.TypePool;
import p018.AbstractC6253;
import p052.InterfaceC6543;
import p065.C6868;
import p072.C6923;
import p077.C6970;
import p083.C7041;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4594 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4592 f13403;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13404;

    public /* synthetic */ C4594(C4592 c4592, int i) {
        this.f13404 = i;
        this.f13403 = c4592;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f13404;
        C4592 c4592 = this.f13403;
        switch (i) {
            case 0:
                C0325 c0325 = c4592.f13398;
                C4652 c4652 = ((C7041) c0325.f1095).f18910;
                String str = c4592.f18687.f13696.f13693;
                c4652.getClass();
                str.getClass();
                EmptyList<String> emptyList = EmptyList.INSTANCE;
                ArrayList arrayList = new ArrayList();
                for (String str2 : emptyList) {
                    C4687 c4687 = new C4687(C6868.m12089(str2).f18310.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                    C6970 c6970M6754 = AbstractC3057.m6754(((C7041) c0325.f1095).f18892, new C4688(c4687.m9320(), c4687.f13696.m9318()), c4592.f13399);
                    Pair pair = c6970M6754 != null ? new Pair(str2, c6970M6754) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return AbstractC4339.m8771(arrayList);
            case 1:
                c4592.f13400.getClass();
                EmptyList emptyList2 = EmptyList.INSTANCE;
                ArrayList arrayList2 = new ArrayList(AbstractC4345.m8822(emptyList2, 10));
                Iterator<E> it = emptyList2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C4435) it.next()).f13065);
                }
                return arrayList2;
            default:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) AbstractC6253.m11749(c4592.f13397, C4592.f13393[0])).entrySet()) {
                    String str3 = (String) entry.getKey();
                    C6970 c6970 = (C6970) entry.getValue();
                    C6868 c6868M12089 = C6868.m12089(str3);
                    C6923 c6923 = c6970.f18660;
                    KotlinClassHeader$Kind kotlinClassHeader$Kind = c6923.f18473;
                    int i2 = AbstractC4595.f13405[kotlinClassHeader$Kind.ordinal()];
                    if (i2 == 1) {
                        String str4 = c6923.f18468;
                        if (kotlinClassHeader$Kind != KotlinClassHeader$Kind.MULTIFILE_CLASS_PART) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            map.put(c6868M12089, C6868.m12089(str4));
                        }
                    } else if (i2 == 2) {
                        map.put(c6868M12089, c6868M12089);
                    }
                }
                return map;
        }
    }
}
