package io.modelcontextprotocol.kotlin.sdk.shared;

import androidx.window.area.C2558;
import kotlin.AbstractC5186;
import kotlin.C5175;
import kotlin.InterfaceC5183;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import kotlin.text.AbstractC5143;
import kotlin.time.AbstractC5159;
import kotlin.time.C5156;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.C5437;
import p056.AbstractC6602;
import p088.AbstractC7158;
import p230.C8048;
import p249.InterfaceC8159;
import p305.C8631;
import p400.AbstractC9154;
import p400.InterfaceC9156;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4310 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5437 f12884;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f12885;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC5183 f12886;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC8159 f12887;

    static {
        InterfaceC8159 c8048;
        String name = AbstractC6602.class.getName();
        if (AbstractC5143.m10171(name, "Kt$", false)) {
            name = AbstractC5143.m10138(name, "Kt$");
        } else if (AbstractC5143.m10171(name, "$", false)) {
            name = AbstractC5143.m10138(name, "$");
        }
        if (System.getProperty("kotlin-logging-to-android-native") != null) {
            c8048 = new C4484(name, 5);
        } else {
            InterfaceC9156 interfaceC9156M14712 = AbstractC9154.m14712(name);
            interfaceC9156M14712.getClass();
            c8048 = new C8048(interfaceC9156M14712, 2);
        }
        f12887 = c8048;
        f12886 = AbstractC5186.m10210(new C2558(15));
        C8631 c8631 = C5156.f14712;
        f12885 = AbstractC5159.m10202(60000, DurationUnit.MILLISECONDS);
        C5437 c5437 = new C5437(null);
        C5175 c5175 = C5175.f14739;
        c5437.m10585(c5175);
        c5437.m10585(c5175);
        f12884 = c5437;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC7158 m8753() {
        return (AbstractC7158) f12886.getValue();
    }
}
