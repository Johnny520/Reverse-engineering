package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4346;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4431;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C4445;
import kotlin.sequences.AbstractC5121;
import kotlin.sequences.C5114;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4597 implements InterfaceC6542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C4589 f13407;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13408;

    public /* synthetic */ C4597(C4589 c4589, int i) {
        this.f13408 = i;
        this.f13407 = c4589;
    }

    @Override // p052.InterfaceC6542
    public final Object invoke() {
        int i = this.f13408;
        C4589 c4589 = this.f13407;
        switch (i) {
            case 0:
                Class<?>[] declaredClasses = c4589.f13385.f13079.getDeclaredClasses();
                declaredClasses.getClass();
                return AbstractC4343.m8800(AbstractC5121.m10106(AbstractC5121.m10107(new C5114(AbstractC4346.m8841(declaredClasses), false, C4431.f13053), C4431.f13052)));
            case 1:
                List listM9001 = c4589.f13385.m9001();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM9001) {
                    if (((C4445) obj).f13070.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(arrayList, 10));
                if (iM8779 < 16) {
                    iM8779 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((C4445) obj2).m8994(), obj2);
                }
                return linkedHashMap;
            default:
                return AbstractC0455.m1156(c4589.mo9178(), c4589.mo9182());
        }
    }
}
