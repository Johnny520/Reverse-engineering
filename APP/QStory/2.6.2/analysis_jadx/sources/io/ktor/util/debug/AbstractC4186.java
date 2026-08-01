package io.ktor.util.debug;

import androidx.window.area.C2558;
import java.lang.management.ManagementFactory;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.text.AbstractC5143;

/* JADX INFO: renamed from: io.ktor.util.debug.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4186 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5183 f12651 = AbstractC5186.m10210(new C2558(7));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m8563() {
        try {
            return AbstractC5143.m10171(ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), "jdwp", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m8564() {
        return ((Boolean) f12651.getValue()).booleanValue();
    }
}
