package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.compose.foundation.text.C1850;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.storage.C5680;
import p065.AbstractC7356;
import p095.AbstractC7818;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5667 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f14454;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5680 f14455;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C5665 f14456;

    static {
        C5519 c5519M9878 = AbstractC7356.f18228.m9878();
        f14454 = AbstractC8568.m13614(new C5520(c5519M9878.m9879(), c5519M9878.f14041.m9877()));
    }

    public C5667(C5665 c5665) {
        this.f14456 = c5665;
        this.f14455 = c5665.f14437.m10137(new C1850(this, 15));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC7818 m10126(C5520 c5520, C5663 c5663) {
        c5520.getClass();
        return (AbstractC7818) this.f14455.invoke(new C5666(c5520, c5663));
    }
}
