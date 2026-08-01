package p281;

import androidx.window.area.AbstractC3400;
import com.android.p002dx.p005io.Opcodes;
import com.materialkolor.dynamiccolor.AbstractC4636;
import com.materialkolor.dynamiccolor.C4628;
import com.materialkolor.dynamiccolor.C4638;
import com.materialkolor.dynamiccolor.ColorSpec$SpecVersion;
import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.util.C5043;
import java.util.HashMap;
import p068.InterfaceC7387;
import p069.AbstractC7390;
import p279.C9084;
import p282.C9092;

/* JADX INFO: renamed from: 飘花落叶言楪哲兰苏世子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9089 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C9092 f23208;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C9092 f23209;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C9092 f23210;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f23211;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Variant f23212;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9084 f23213;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C9092 f23214;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C9092 f23215;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ColorSpec$SpecVersion f23216;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C4628 f23217;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final DynamicScheme$Platform f23218;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C9092 f23219;

    public C9089(C9084 c9084, Variant variant, boolean z, C9092 c9092, C9092 c90922, C9092 c90923, C9092 c90924, C9092 c90925, DynamicScheme$Platform dynamicScheme$Platform, ColorSpec$SpecVersion colorSpec$SpecVersion, C9092 c90926) {
        c9084.getClass();
        variant.getClass();
        c9092.getClass();
        c90922.getClass();
        c90923.getClass();
        c90924.getClass();
        c90925.getClass();
        dynamicScheme$Platform.getClass();
        colorSpec$SpecVersion.getClass();
        c90926.getClass();
        this.f23213 = c9084;
        this.f23212 = variant;
        this.f23211 = z;
        this.f23210 = c9092;
        this.f23209 = c90922;
        this.f23208 = c90923;
        this.f23215 = c90924;
        this.f23214 = c90925;
        this.f23218 = dynamicScheme$Platform;
        this.f23219 = c90926;
        switch (AbstractC9091.f23220[variant.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                colorSpec$SpecVersion = ColorSpec$SpecVersion.SPEC_2021;
                break;
            default:
                C5043.m9170();
                throw null;
        }
        this.f23216 = colorSpec$SpecVersion;
        this.f23217 = new C4628();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m14386(C4638 c4638) {
        InterfaceC7387 interfaceC7387 = c4638.f12340;
        HashMap map = c4638.f12338;
        C9084 c9084Mo8711 = (C9084) map.get(this);
        if (c9084Mo8711 == null) {
            c9084Mo8711 = (this.f23216 == ColorSpec$SpecVersion.SPEC_2025 ? AbstractC4636.f12318 : AbstractC4636.f12319).mo8711(this, c4638);
            if (map.size() > 4) {
                map.clear();
            }
            map.put(this, c9084Mo8711);
        }
        int i = c9084Mo8711.f23202;
        Double d = interfaceC7387 != null ? (Double) interfaceC7387.invoke(this) : null;
        if (interfaceC7387 == null || d == null) {
            return i;
        }
        return (AbstractC3400.m5650((int) Math.rint(d.doubleValue() * 255.0d), 0, Opcodes.CONST_METHOD_TYPE) << 24) | (i & 16777215);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C9089(C9084 c9084, Variant variant, boolean z, DynamicScheme$Platform dynamicScheme$Platform, ColorSpec$SpecVersion colorSpec$SpecVersion, C9092 c9092, C9092 c90922, C9092 c90923, C9092 c90924, C9092 c90925, C9092 c90926) {
        this(c9084, variant, z, c9092, c90922, c90923, c90924, c90925, dynamicScheme$Platform, colorSpec$SpecVersion, c90926 == null ? AbstractC7390.m12607(25.0d, 84.0d) : c90926);
        variant.getClass();
        c9092.getClass();
        c90922.getClass();
        c90923.getClass();
        c90924.getClass();
        c90925.getClass();
    }
}
