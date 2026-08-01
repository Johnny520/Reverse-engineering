package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.name.C4691;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$4 extends FunctionReferenceImpl implements InterfaceC6558 {
    public LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(Object obj) {
        super(1, obj, C4590.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
    }

    @Override // p052.InterfaceC6558
    public final Collection<InterfaceC4471> invoke(C4691 c4691) {
        c4691.getClass();
        C4590 c4590 = (C4590) this.receiver;
        int i = C4590.f13382;
        return c4590.m9196(c4691);
    }
}
