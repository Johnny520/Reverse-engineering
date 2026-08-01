package kotlin.reflect.jvm.internal;

import io.ktor.client.plugins.AbstractC4765;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.C5917;
import kotlin.reflect.KVariance;
import kotlin.reflect.jvm.internal.impl.p009km.C5359;
import kotlin.reflect.jvm.internal.impl.p009km.C5366;
import kotlin.reflect.jvm.internal.impl.p009km.KmVariance;
import p068.InterfaceC7372;
import p068.InterfaceC7383;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5862 implements InterfaceC7383 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final Ref$ObjectRef f14851;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C5902 f14852;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC7372 f14853;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ClassLoader f14854;

    public C5862(ClassLoader classLoader, C5902 c5902, InterfaceC7372 interfaceC7372, Ref$ObjectRef ref$ObjectRef) {
        this.f14854 = classLoader;
        this.f14852 = c5902;
        this.f14853 = interfaceC7372;
        this.f14851 = ref$ObjectRef;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(Object obj, Object obj2) {
        int iIntValue = ((Number) obj).intValue();
        C5359 c5359 = (C5359) obj2;
        c5359.getClass();
        C5866 c5866 = this.f14853 == null ? null : new C5866(new C5844(this.f14851, 1), iIntValue, 0);
        if (c5359.equals(C5359.f13534)) {
            return C5917.f14981;
        }
        KmVariance kmVariance = c5359.f13536;
        KVariance kVarianceM8852 = kmVariance != null ? AbstractC4765.m8852(kmVariance) : null;
        C5366 c5366 = c5359.f13535;
        return new C5917(c5366 != null ? AbstractC4765.m8849(c5366, this.f14854, this.f14852, c5866) : null, kVarianceM8852);
    }
}
