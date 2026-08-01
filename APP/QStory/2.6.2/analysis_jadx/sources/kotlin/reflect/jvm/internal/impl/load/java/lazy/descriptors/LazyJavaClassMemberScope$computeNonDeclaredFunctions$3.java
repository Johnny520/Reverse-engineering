package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.name.C4690;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$3 extends FunctionReferenceImpl implements InterfaceC6557 {
    public LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(Object obj) {
        super(1, obj, C4589.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
    }

    @Override // p052.InterfaceC6557
    public final Collection<InterfaceC4470> invoke(C4690 c4690) {
        c4690.getClass();
        C4589 c4589 = (C4589) this.receiver;
        int i = C4589.f13378;
        return c4589.m9208(c4690);
    }
}
