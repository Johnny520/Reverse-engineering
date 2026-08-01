package p265;

import com.android.dx.io.Opcodes;
import com.materialkolor.dynamiccolor.AbstractC3803;
import com.materialkolor.dynamiccolor.C3795;
import com.materialkolor.dynamiccolor.C3805;
import com.materialkolor.dynamiccolor.ColorSpec$SpecVersion;
import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.util.C4210;
import java.util.HashMap;
import p000.AbstractC6087;
import p052.InterfaceC6557;
import p053.AbstractC6560;
import p263.C8254;
import p266.C8262;

/* JADX INFO: renamed from: 飘花落叶言楪哲兰苏世子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8259 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8262 f22864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8262 f22865;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8262 f22866;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f22867;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Variant f22868;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8254 f22869;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8262 f22870;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8262 f22871;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ColorSpec$SpecVersion f22872;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C3795 f22873;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final DynamicScheme$Platform f22874;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C8262 f22875;

    public C8259(C8254 c8254, Variant variant, boolean z, C8262 c8262, C8262 c82622, C8262 c82623, C8262 c82624, C8262 c82625, DynamicScheme$Platform dynamicScheme$Platform, ColorSpec$SpecVersion colorSpec$SpecVersion, C8262 c82626) {
        c8254.getClass();
        variant.getClass();
        c8262.getClass();
        c82622.getClass();
        c82623.getClass();
        c82624.getClass();
        c82625.getClass();
        dynamicScheme$Platform.getClass();
        colorSpec$SpecVersion.getClass();
        c82626.getClass();
        this.f22869 = c8254;
        this.f22868 = variant;
        this.f22867 = z;
        this.f22866 = c8262;
        this.f22865 = c82622;
        this.f22864 = c82623;
        this.f22871 = c82624;
        this.f22870 = c82625;
        this.f22874 = dynamicScheme$Platform;
        this.f22875 = c82626;
        switch (AbstractC8261.f22876[variant.ordinal()]) {
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
                C4210.m8621();
                throw null;
        }
        this.f22872 = colorSpec$SpecVersion;
        this.f22873 = new C3795();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m13810(C3805 c3805) {
        InterfaceC6557 interfaceC6557 = c3805.f11990;
        HashMap map = c3805.f11988;
        C8254 c8254Mo8165 = (C8254) map.get(this);
        if (c8254Mo8165 == null) {
            c8254Mo8165 = (this.f22872 == ColorSpec$SpecVersion.SPEC_2025 ? AbstractC3803.f11968 : AbstractC3803.f11969).mo8165(this, c3805);
            if (map.size() > 4) {
                map.clear();
            }
            map.put(this, c8254Mo8165);
        }
        int i = c8254Mo8165.f22858;
        Double d = interfaceC6557 != null ? (Double) interfaceC6557.invoke(this) : null;
        if (interfaceC6557 == null || d == null) {
            return i;
        }
        return (AbstractC6087.m11420((int) Math.rint(d.doubleValue() * 255.0d), 0, Opcodes.CONST_METHOD_TYPE) << 24) | (i & 16777215);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8259(C8254 c8254, Variant variant, boolean z, DynamicScheme$Platform dynamicScheme$Platform, ColorSpec$SpecVersion colorSpec$SpecVersion, C8262 c8262, C8262 c82622, C8262 c82623, C8262 c82624, C8262 c82625, C8262 c82626) {
        this(c8254, variant, z, c8262, c82622, c82623, c82624, c82625, dynamicScheme$Platform, colorSpec$SpecVersion, c82626 == null ? AbstractC6560.m12032(25.0d, 84.0d) : c82626);
        variant.getClass();
        c8262.getClass();
        c82622.getClass();
        c82623.getClass();
        c82624.getClass();
        c82625.getClass();
    }
}
