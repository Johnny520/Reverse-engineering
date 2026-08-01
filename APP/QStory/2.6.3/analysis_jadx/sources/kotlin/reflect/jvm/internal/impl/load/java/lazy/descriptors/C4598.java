package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.collections.AbstractC4347;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4432;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4446;
import kotlin.sequences.AbstractC5122;
import kotlin.sequences.C5115;
import p052.InterfaceC6543;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4598 implements InterfaceC6543 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4590 f13411;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13412;

    public /* synthetic */ C4598(C4590 c4590, int i) {
        this.f13412 = i;
        this.f13411 = c4590;
    }

    @Override // p052.InterfaceC6543
    public final Object invoke() {
        int i = this.f13412;
        C4590 c4590 = this.f13411;
        switch (i) {
            case 0:
                Class<?>[] declaredClasses = c4590.f13389.f13083.getDeclaredClasses();
                declaredClasses.getClass();
                return AbstractC4344.m8788(AbstractC5122.m10110(AbstractC5122.m10112(new C5115(AbstractC4347.m8838(declaredClasses), false, C4432.f13057), C4432.f13056)));
            case 1:
                List listM8991 = c4590.f13389.m8991();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM8991) {
                    if (((C4446) obj).f13074.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(arrayList, 10));
                if (iM8772 < 16) {
                    iM8772 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((C4446) obj2).m8984(), obj2);
                }
                return linkedHashMap;
            default:
                return AbstractC7739.m13054(c4590.mo9168(), c4590.mo9172());
        }
    }
}
