package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5088;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.storage.C4845;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p018.AbstractC6253;
import p046.InterfaceC6478;
import p046.InterfaceC6481;
import p052.InterfaceC6543;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C4786 implements InterfaceC6481 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5088[] f13934 = {new PropertyReference1Impl(C4786.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C4847 f13935;

    public C4786(C4845 c4845, InterfaceC6543 interfaceC6543) {
        c4845.getClass();
        this.f13935 = new C4847(c4845, interfaceC6543);
    }

    @Override // p046.InterfaceC6481
    public boolean isEmpty() {
        return ((List) AbstractC6253.m11749(this.f13935, f13934[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) AbstractC6253.m11749(this.f13935, f13934[0])).iterator();
    }

    @Override // p046.InterfaceC6481
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final /* bridge */ InterfaceC6478 mo9517(C4687 c4687) {
        return AbstractC8190.m13684(this, c4687);
    }

    @Override // p046.InterfaceC6481
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo9518(C4687 c4687) {
        return AbstractC8190.m13700(this, c4687);
    }
}
