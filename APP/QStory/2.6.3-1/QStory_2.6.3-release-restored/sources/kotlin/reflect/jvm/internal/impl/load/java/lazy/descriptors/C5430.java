package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.collections.AbstractC5179;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5264;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5278;
import kotlin.sequences.AbstractC5954;
import kotlin.sequences.C5947;
import p068.InterfaceC7372;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5430 implements InterfaceC7372 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5422 f13756;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13757;

    public /* synthetic */ C5430(C5422 c5422, int i) {
        this.f13757 = i;
        this.f13756 = c5422;
    }

    @Override // p068.InterfaceC7372
    public final Object invoke() {
        int i = this.f13757;
        C5422 c5422 = this.f13756;
        switch (i) {
            case 0:
                Class<?>[] declaredClasses = c5422.f13734.f13428.getDeclaredClasses();
                declaredClasses.getClass();
                return AbstractC5176.m9347(AbstractC5954.m10669(AbstractC5954.m10671(new C5947(AbstractC5179.m9397(declaredClasses), false, C5264.f13402), C5264.f13401)));
            case 1:
                List listM9550 = c5422.f13734.m9550();
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM9550) {
                    if (((C5278) obj).f13419.isEnumConstant()) {
                        arrayList.add(obj);
                    }
                }
                int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(arrayList, 10));
                if (iM9331 < 16) {
                    iM9331 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((C5278) obj2).m9543(), obj2);
                }
                return linkedHashMap;
            default:
                return AbstractC8568.m13613(c5422.mo9727(), c5422.mo9731());
        }
    }
}
