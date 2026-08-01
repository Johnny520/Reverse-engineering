package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import java.util.Collection;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.reflect.InterfaceC5920;
import kotlin.reflect.jvm.internal.C5860;
import kotlin.reflect.jvm.internal.impl.name.C5518;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.storage.C5677;
import kotlin.reflect.jvm.internal.impl.storage.C5679;
import p034.AbstractC7082;
import p065.AbstractC7355;
import p065.AbstractC7356;
import p068.InterfaceC7387;
import p095.AbstractC7818;
import p095.C7817;
import p095.C7845;
import p096.InterfaceC7851;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.builtins.jvm.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5254 implements InterfaceC7851 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C5520 f13377;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C5523 f13378;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5679 f13379;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7387 f13380 = C5240.f13324;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7817 f13381;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ InterfaceC5920[] f13375 = {new PropertyReference1Impl(C5254.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0)};

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5241 f13376 = new C5241();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C5519 f13374 = AbstractC7355.f18198;

    static {
        C5518 c5518 = AbstractC7356.f18228;
        f13378 = c5518.m9877();
        C5519 c5519M9878 = c5518.m9878();
        f13377 = new C5520(c5519M9878.m9879(), c5519M9878.f14041.m9877());
    }

    public C5254(C5677 c5677, C7817 c7817) {
        this.f13381 = c7817;
        this.f13379 = new C5679(c5677, new C5860(this, 3, c5677));
    }

    @Override // p096.InterfaceC7851
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final AbstractC7818 mo9523(C5520 c5520) {
        c5520.getClass();
        if (!c5520.equals(f13377)) {
            return null;
        }
        return (C7845) AbstractC7082.m12308(this.f13379, f13375[0]);
    }

    @Override // p096.InterfaceC7851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean mo9524(C5519 c5519, C5523 c5523) {
        c5519.getClass();
        c5523.getClass();
        return c5523.equals(f13378) && c5519.equals(f13374);
    }

    @Override // p096.InterfaceC7851
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Collection mo9525(C5519 c5519) {
        c5519.getClass();
        if (!c5519.equals(f13374)) {
            return EmptySet.INSTANCE;
        }
        return AbstractC8568.m13614((C7845) AbstractC7082.m12308(this.f13379, f13375[0]));
    }
}
