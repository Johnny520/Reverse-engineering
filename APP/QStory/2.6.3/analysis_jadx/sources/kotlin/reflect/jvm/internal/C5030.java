package kotlin.reflect.jvm.internal;

import io.ktor.client.plugins.AbstractC3933;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.C5085;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.km.C4527;
import kotlin.reflect.jvm.internal.impl.km.C4534;
import kotlin.reflect.jvm.internal.impl.km.KmVariance;
import p052.InterfaceC6543;
import p052.InterfaceC6554;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5030 implements InterfaceC6554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Ref$ObjectRef f14506;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5070 f14507;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6543 f14508;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ClassLoader f14509;

    public C5030(ClassLoader classLoader, C5070 c5070, InterfaceC6543 interfaceC6543, Ref$ObjectRef ref$ObjectRef) {
        this.f14509 = classLoader;
        this.f14507 = c5070;
        this.f14508 = interfaceC6543;
        this.f14506 = ref$ObjectRef;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        C4527 c4527 = (C4527) obj2;
        c4527.getClass();
        C5034 c5034 = this.f14508 == null ? null : new C5034(new C5012(this.f14506, 1), iIntValue, 0);
        if (c4527.equals(C4527.f13189)) {
            return C5085.f14636;
        }
        KmVariance kmVariance = c4527.f13191;
        KVariance kVarianceM8293 = kmVariance != null ? AbstractC3933.m8293(kmVariance) : null;
        C4534 c4534 = c4527.f13190;
        return new C5085(c4534 != null ? AbstractC3933.m8290(c4534, this.f14509, this.f14507, c5034) : null, kVarianceM8293);
    }
}
