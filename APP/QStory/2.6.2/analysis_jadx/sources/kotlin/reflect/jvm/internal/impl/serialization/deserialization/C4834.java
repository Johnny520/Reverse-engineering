package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.compose.foundation.text.C1012;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.C4686;
import kotlin.reflect.jvm.internal.impl.name.C4687;
import kotlin.reflect.jvm.internal.impl.storage.C4847;
import p049.AbstractC6526;
import p079.AbstractC6988;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.serialization.deserialization.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4834 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f14105;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C4847 f14106;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C4832 f14107;

    static {
        C4686 c4686M9329 = AbstractC6526.f17887.m9329();
        f14105 = AbstractC0455.m1140(new C4687(c4686M9329.m9330(), c4686M9329.f13692.m9328()));
    }

    public C4834(C4832 c4832) {
        this.f14107 = c4832;
        this.f14106 = c4832.f14088.m9588(new C1012(this, 15));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC6988 m9577(C4687 c4687, C4830 c4830) {
        c4687.getClass();
        return (AbstractC6988) this.f14106.invoke(new C4833(c4687, c4830));
    }
}
