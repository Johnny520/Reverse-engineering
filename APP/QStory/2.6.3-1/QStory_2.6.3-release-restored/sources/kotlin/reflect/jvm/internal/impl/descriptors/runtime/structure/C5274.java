package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import p097.InterfaceC7854;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5274 extends AbstractC5276 implements InterfaceC7854 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Constructor f13416;

    public C5274(Constructor constructor) {
        this.f13416 = constructor;
    }

    @Override // p097.InterfaceC7854
    public final ArrayList getTypeParameters() {
        TypeVariable[] typeParameters = this.f13416.getTypeParameters();
        typeParameters.getClass();
        ArrayList arrayList = new ArrayList(typeParameters.length);
        for (TypeVariable typeVariable : typeParameters) {
            arrayList.add(new C5270(typeVariable));
        }
        return arrayList;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5276
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Member mo9538() {
        return this.f13416;
    }
}
