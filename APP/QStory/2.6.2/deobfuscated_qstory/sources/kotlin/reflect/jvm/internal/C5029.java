package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.C5084;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.km.C4526;
import kotlin.reflect.jvm.internal.impl.km.C4533;
import kotlin.reflect.jvm.internal.impl.km.KmVariance;
import p033.AbstractC6325;
import p052.InterfaceC6542;
import p052.InterfaceC6553;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5029 implements InterfaceC6553 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Ref$ObjectRef f14504;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5069 f14505;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6542 f14506;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ClassLoader f14507;

    public C5029(ClassLoader classLoader, C5069 c5069, InterfaceC6542 interfaceC6542, Ref$ObjectRef ref$ObjectRef) {
        this.f14507 = classLoader;
        this.f14505 = c5069;
        this.f14506 = interfaceC6542;
        this.f14504 = ref$ObjectRef;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        C4526 c4526 = (C4526) obj2;
        c4526.getClass();
        C5033 c5033 = this.f14506 == null ? null : new C5033(new C5011(this.f14504, 1), iIntValue, 0);
        if (c4526.equals(C4526.f13185)) {
            return C5084.f14636;
        }
        KmVariance kmVariance = c4526.f13187;
        KVariance kVarianceM11842 = kmVariance != null ? AbstractC6325.m11842(kmVariance) : null;
        C4533 c4533 = c4526.f13186;
        return new C5084(c4533 != null ? AbstractC6325.m11846(c4533, this.f14507, this.f14505, c5033) : null, kVarianceM11842);
    }
}
