package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.lang.reflect.Member;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class ReflectJavaClass$fields$1 extends FunctionReferenceImpl implements InterfaceC6558 {
    public static final ReflectJavaClass$fields$1 INSTANCE = new ReflectJavaClass$fields$1();

    public ReflectJavaClass$fields$1() {
        super(1, Member.class, "isSynthetic", "isSynthetic()Z", 0);
    }

    @Override // p052.InterfaceC6558
    public final Boolean invoke(Member member) {
        member.getClass();
        return Boolean.valueOf(member.isSynthetic());
    }
}
