package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import io.ktor.client.plugins.AbstractC3932;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5087;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.storage.C4844;
import kotlin.reflect.jvm.internal.impl.storage.C4846;
import p046.InterfaceC6477;
import p046.InterfaceC6480;
import p052.InterfaceC6542;
import p392.AbstractC9124;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C4785 implements InterfaceC6480 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5087[] f13930 = {new PropertyReference1Impl(C4785.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4846 f13931;

    public C4785(C4844 c4844, InterfaceC6542 interfaceC6542) {
        c4844.getClass();
        this.f13931 = new C4846(c4844, interfaceC6542);
    }

    @Override // p046.InterfaceC6480
    public boolean isEmpty() {
        return ((List) AbstractC9124.m14672(this.f13931, f13930[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) AbstractC9124.m14672(this.f13931, f13930[0])).iterator();
    }

    @Override // p046.InterfaceC6480
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final /* bridge */ InterfaceC6477 mo9527(C4686 c4686) {
        return AbstractC3932.m8318(this, c4686);
    }

    @Override // p046.InterfaceC6480
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final /* bridge */ boolean mo9528(C4686 c4686) {
        return AbstractC3932.m8314(this, c4686);
    }
}
