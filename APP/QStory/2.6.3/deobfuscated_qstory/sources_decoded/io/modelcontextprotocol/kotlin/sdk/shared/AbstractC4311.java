package io.modelcontextprotocol.kotlin.sdk.shared;

import androidx.window.area.C2558;
import kotlin.AbstractC5187;
import kotlin.C5176;
import kotlin.InterfaceC5184;
import kotlin.reflect.jvm.internal.impl.descriptors.C4485;
import kotlin.text.AbstractC5144;
import kotlin.time.AbstractC5160;
import kotlin.time.C5157;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.C5438;
import p056.AbstractC6603;
import p088.AbstractC7159;
import p230.C8049;
import p249.InterfaceC8160;
import p305.C8623;
import p398.AbstractC9139;
import p398.InterfaceC9141;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C5438 f12888;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f12889;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC5184 f12890;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC8160 f12891;

    static {
        InterfaceC8160 c8049;
        String name = AbstractC6603.class.getName();
        if (AbstractC5144.m10176(name, "Kt$", false)) {
            name = AbstractC5144.m10154(name, "Kt$");
        } else if (AbstractC5144.m10176(name, "$", false)) {
            name = AbstractC5144.m10154(name, "$");
        }
        if (System.getProperty("kotlin-logging-to-android-native") != null) {
            c8049 = new C4485(name, 5);
        } else {
            InterfaceC9141 interfaceC9141M14703 = AbstractC9139.m14703(name);
            interfaceC9141M14703.getClass();
            c8049 = new C8049(interfaceC9141M14703, 2);
        }
        f12891 = c8049;
        f12890 = AbstractC5187.m10214(new C2558(15));
        C8623 c8623 = C5157.f14712;
        f12889 = AbstractC5160.m10206(60000, DurationUnit.MILLISECONDS);
        C5438 c5438 = new C5438(null);
        C5176 c5176 = C5176.f14739;
        c5438.m10588(c5176);
        c5438.m10588(c5176);
        f12888 = c5438;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC7159 m8743() {
        return (AbstractC7159) f12890.getValue();
    }
}
