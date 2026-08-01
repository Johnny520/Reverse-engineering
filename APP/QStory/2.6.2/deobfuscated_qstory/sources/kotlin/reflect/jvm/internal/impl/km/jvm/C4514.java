package kotlin.reflect.jvm.internal.impl.km.jvm;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.km.C4548;
import kotlin.reflect.jvm.internal.impl.km.internal.AbstractC4507;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import p067.C6884;
import p067.C6892;
import p175.AbstractC7738;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.km.jvm.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4514 extends AbstractC7738 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4548 f13155;

    public C4514(Metadata metadata) {
        Pair pairM12138 = C6892.m12138(AbstractC7738.m13025(metadata), metadata.d2());
        C4548 c4548M9114 = AbstractC4507.m9114((ProtoBuf$Class) pairM12138.component2(), (C6884) pairM12138.component1(), new C4516(metadata.mv()).compareTo(new C4516(1, 4, 0)) < 0, 4);
        new C4516(metadata.mv());
        metadata.xi();
        this.f13155 = c4548M9114;
    }
}
