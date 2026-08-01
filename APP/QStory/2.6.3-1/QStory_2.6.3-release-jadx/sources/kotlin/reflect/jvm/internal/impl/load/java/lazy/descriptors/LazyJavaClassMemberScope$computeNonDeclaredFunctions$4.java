package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import java.util.Collection;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class LazyJavaClassMemberScope$computeNonDeclaredFunctions$4 extends FunctionReferenceImpl implements InterfaceC7387 {
    public LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(Object obj) {
        super(1, obj, C5422.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0);
    }

    @Override // p068.InterfaceC7387
    public final Collection<InterfaceC5303> invoke(C5523 c5523) {
        c5523.getClass();
        C5422 c5422 = (C5422) this.receiver;
        int i = C5422.f13727;
        return c5422.m9755(c5523);
    }
}
