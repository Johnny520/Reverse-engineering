package p095;

import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5329;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import p062.C7311;
import p117.C8094;

/* JADX INFO: renamed from: 飘花落叶言世楪子苏兰哲.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7833 extends AbstractC7838 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f19155 = {new PropertyReference1Impl(C7833.class, "fragments", "getFragments()Ljava/util/List;", 0), new PropertyReference1Impl(C7833.class, "empty", "getEmpty()Z", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C5679 f19156;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C5519 f19157;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C5679 f19158;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C8094 f19159;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7817 f19160;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7833(C7817 c7817, C5519 c5519, C5677 c5677) {
        c5519.getClass();
        c5677.getClass();
        C5518 c5518 = c5519.f14041;
        super(C7311.f18113, c5518.m9873() ? C5518.f14034 : c5518.m9877());
        this.f19160 = c7817;
        this.f19157 = c5519;
        this.f19156 = new C5679(c5677, new C7836(this, 0));
        this.f19158 = new C5679(c5677, new C7836(this, 1));
        this.f19159 = new C8094(c5677, new C7836(this, 2));
    }

    public final boolean equals(Object obj) {
        C7833 c7833 = obj instanceof C7833 ? (C7833) obj : null;
        return c7833 != null && AbstractC5227.m9466(this.f19157, c7833.f19157) && AbstractC5227.m9466(this.f19160, c7833.f19160);
    }

    public final int hashCode() {
        return this.f19157.hashCode() + (this.f19160.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final Object mo9586(InterfaceC5329 interfaceC5329, Object obj) {
        return interfaceC5329.mo844(this, obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5331
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final InterfaceC5331 mo9587() {
        C5519 c5519 = this.f19157;
        if (c5519.f14041.m9873()) {
            return null;
        }
        return this.f19160.mo9621(c5519.m9879());
    }
}
