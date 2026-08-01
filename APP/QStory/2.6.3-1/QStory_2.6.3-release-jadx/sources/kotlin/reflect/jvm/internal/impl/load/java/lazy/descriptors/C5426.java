package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.animation.core.C1171;
import com.bumptech.glide.AbstractC3889;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5177;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5267;
import kotlin.reflect.jvm.internal.impl.load.kotlin.C5484;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import net.bytebuddy.pool.TypePool;
import p034.AbstractC7082;
import p068.InterfaceC7372;
import p081.C7697;
import p088.C7752;
import p093.C7799;
import p099.C7870;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5426 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5424 f13748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13749;

    public /* synthetic */ C5426(C5424 c5424, int i) {
        this.f13749 = i;
        this.f13748 = c5424;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f13749;
        C5424 c5424 = this.f13748;
        switch (i) {
            case 0:
                C1171 c1171 = c5424.f13743;
                C5484 c5484 = ((C7870) c1171.f1440).f19255;
                String str = c5424.f19032.f14041.f14038;
                c5484.getClass();
                str.getClass();
                EmptyList<String> emptyList = EmptyList.INSTANCE;
                ArrayList arrayList = new ArrayList();
                for (String str2 : emptyList) {
                    C5519 c5519 = new C5519(C7697.m12648(str2).f18655.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
                    C7799 c7799M7314 = AbstractC3889.m7314(((C7870) c1171.f1440).f19237, new C5520(c5519.m9879(), c5519.f14041.m9877()), c5424.f13744);
                    Pair pair = c7799M7314 != null ? new Pair(str2, c7799M7314) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                return AbstractC5171.m9330(arrayList);
            case 1:
                c5424.f13745.getClass();
                EmptyList emptyList2 = EmptyList.INSTANCE;
                ArrayList arrayList2 = new ArrayList(AbstractC5177.m9381(emptyList2, 10));
                Iterator<E> it = emptyList2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((C5267) it.next()).f13410);
                }
                return arrayList2;
            default:
                HashMap map = new HashMap();
                for (Map.Entry entry : ((Map) AbstractC7082.m12308(c5424.f13742, C5424.f13738[0])).entrySet()) {
                    String str3 = (String) entry.getKey();
                    C7799 c7799 = (C7799) entry.getValue();
                    C7697 c7697M12648 = C7697.m12648(str3);
                    C7752 c7752 = c7799.f19005;
                    KotlinClassHeader$Kind kotlinClassHeader$Kind = c7752.f18818;
                    int i2 = AbstractC5427.f13750[kotlinClassHeader$Kind.ordinal()];
                    if (i2 == 1) {
                        String str4 = c7752.f18813;
                        if (kotlinClassHeader$Kind != KotlinClassHeader$Kind.MULTIFILE_CLASS_PART) {
                            str4 = null;
                        }
                        if (str4 != null) {
                            map.put(c7697M12648, C7697.m12648(str4));
                        }
                    } else if (i2 == 2) {
                        map.put(c7697M12648, c7697M12648);
                    }
                }
                return map;
        }
    }
}
