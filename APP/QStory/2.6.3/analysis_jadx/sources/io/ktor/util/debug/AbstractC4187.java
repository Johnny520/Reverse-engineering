package io.ktor.util.debug;

import androidx.window.area.C2558;
import java.lang.management.ManagementFactory;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.text.AbstractC5144;

/* JADX INFO: renamed from: io.ktor.util.debug.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4187 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC5184 f12655 = AbstractC5187.m10214(new C2558(7));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m8553() {
        try {
            return AbstractC5144.m10176(ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), "jdwp", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m8554() {
        return ((Boolean) f12655.getValue()).booleanValue();
    }
}
