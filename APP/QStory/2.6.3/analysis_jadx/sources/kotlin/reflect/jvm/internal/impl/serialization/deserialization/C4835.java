package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.compose.foundation.text.C1012;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.name.C4688;
import kotlin.reflect.jvm.internal.impl.storage.C4848;
import p049.AbstractC6527;
import p079.AbstractC6989;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4835 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f14109;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4848 f14110;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4833 f14111;

    static {
        C4687 c4687M9319 = AbstractC6527.f17883.m9319();
        f14109 = AbstractC7739.m13055(new C4688(c4687M9319.m9320(), c4687M9319.f13696.m9318()));
    }

    public C4835(C4833 c4833) {
        this.f14111 = c4833;
        this.f14110 = c4833.f14092.m9578(new C1012(this, 15));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC6989 m9567(C4688 c4688, C4831 c4831) {
        c4688.getClass();
        return (AbstractC6989) this.f14110.invoke(new C4834(c4688, c4831));
    }
}
