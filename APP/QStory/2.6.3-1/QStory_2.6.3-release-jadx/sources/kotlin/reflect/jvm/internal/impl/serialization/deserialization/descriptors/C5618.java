package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import p034.AbstractC7082;
import p062.InterfaceC7307;
import p062.InterfaceC7310;
import p068.InterfaceC7372;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5618 implements InterfaceC7310 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f14279 = {new PropertyReference1Impl(C5618.class, "annotations", "getAnnotations()Ljava/util/List;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C5679 f14280;

    public C5618(C5677 c5677, InterfaceC7372 interfaceC7372) {
        c5677.getClass();
        this.f14280 = new C5679(c5677, interfaceC7372);
    }

    @Override // p062.InterfaceC7310
    public boolean isEmpty() {
        return ((List) AbstractC7082.m12308(this.f14280, f14279[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) AbstractC7082.m12308(this.f14280, f14279[0])).iterator();
    }

    @Override // p062.InterfaceC7310
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final /* bridge */ InterfaceC7307 mo10076(C5519 c5519) {
        return AbstractC9019.m14243(this, c5519);
    }

    @Override // p062.InterfaceC7310
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final /* bridge */ boolean mo10077(C5519 c5519) {
        return AbstractC9019.m14259(this, c5519);
    }
}
