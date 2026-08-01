package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import p081.InterfaceC7025;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4442 extends AbstractC4444 implements InterfaceC7025 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Constructor f13071;

    public C4442(Constructor constructor) {
        this.f13071 = constructor;
    }

    @Override // p081.InterfaceC7025
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f13071.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C4438(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC4444
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Member mo8979() {
        return this.f13071;
    }
}
