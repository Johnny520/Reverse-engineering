package io.ktor.util.debug;

import androidx.window.area.C3391;
import java.lang.management.ManagementFactory;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.text.AbstractC5976;

/* JADX INFO: renamed from: io.ktor.util.debug.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5019 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC6016 f13000 = AbstractC6019.m10773(new C3391(7));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final boolean m9112() {
        try {
            return AbstractC5976.m10735(ManagementFactory.getRuntimeMXBean().getInputArguments().toString(), "jdwp", false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m9113() {
        return ((Boolean) f13000.getValue()).booleanValue();
    }
}
