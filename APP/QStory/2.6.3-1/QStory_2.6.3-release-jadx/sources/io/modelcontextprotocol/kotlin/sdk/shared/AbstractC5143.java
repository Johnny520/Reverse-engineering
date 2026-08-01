package io.modelcontextprotocol.kotlin.sdk.shared;

import androidx.window.area.C3391;
import kotlin.AbstractC6019;
import kotlin.C6008;
import kotlin.InterfaceC6016;
import kotlin.reflect.jvm.internal.impl.descriptors.C5317;
import kotlin.text.AbstractC5976;
import kotlin.time.AbstractC5992;
import kotlin.time.C5989;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.C6270;
import p072.AbstractC7432;
import p104.AbstractC7988;
import p246.C8878;
import p265.InterfaceC8989;
import p321.C9452;
import p414.AbstractC9968;
import p414.InterfaceC9970;

/* JADX INFO: renamed from: io.modelcontextprotocol.kotlin.sdk.shared.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5143 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C6270 f13233;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final long f13234;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final InterfaceC6016 f13235;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final InterfaceC8989 f13236;

    static {
        InterfaceC8989 c8878;
        String name = AbstractC7432.class.getName();
        if (AbstractC5976.m10735(name, "Kt$", false)) {
            name = AbstractC5976.m10713(name, "Kt$");
        } else if (AbstractC5976.m10735(name, "$", false)) {
            name = AbstractC5976.m10713(name, "$");
        }
        if (System.getProperty("kotlin-logging-to-android-native") != null) {
            c8878 = new C5317(name, 5);
        } else {
            InterfaceC9970 interfaceC9970M15262 = AbstractC9968.m15262(name);
            interfaceC9970M15262.getClass();
            c8878 = new C8878(interfaceC9970M15262, 2);
        }
        f13236 = c8878;
        f13235 = AbstractC6019.m10773(new C3391(15));
        C9452 c9452 = C5989.f15057;
        f13234 = AbstractC5992.m10765(60000, DurationUnit.MILLISECONDS);
        C6270 c6270 = new C6270(null);
        C6008 c6008 = C6008.f15084;
        c6270.m11147(c6008);
        c6270.m11147(c6008);
        f13233 = c6270;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final AbstractC7988 m9302() {
        return (AbstractC7988) f13235.getValue();
    }
}
