package p265;

import androidx.window.area.AbstractC2567;
import com.android.dx.io.Opcodes;
import com.materialkolor.dynamiccolor.AbstractC3804;
import com.materialkolor.dynamiccolor.C3796;
import com.materialkolor.dynamiccolor.C3806;
import com.materialkolor.dynamiccolor.ColorSpec$SpecVersion;
import com.materialkolor.scheme.DynamicScheme$Platform;
import com.materialkolor.scheme.Variant;
import io.ktor.util.C4211;
import java.util.HashMap;
import p052.InterfaceC6558;
import p053.AbstractC6561;
import p263.C8255;
import p266.C8263;

/* JADX INFO: renamed from: 飘花落叶言楪哲兰苏世子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8260 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8263 f22863;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8263 f22864;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C8263 f22865;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f22866;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Variant f22867;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8255 f22868;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final C8263 f22869;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final C8263 f22870;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final ColorSpec$SpecVersion f22871;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final C3796 f22872;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final DynamicScheme$Platform f22873;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final C8263 f22874;

    public C8260(C8255 c8255, Variant variant, boolean z, C8263 c8263, C8263 c82632, C8263 c82633, C8263 c82634, C8263 c82635, DynamicScheme$Platform dynamicScheme$Platform, ColorSpec$SpecVersion colorSpec$SpecVersion, C8263 c82636) {
        c8255.getClass();
        variant.getClass();
        c8263.getClass();
        c82632.getClass();
        c82633.getClass();
        c82634.getClass();
        c82635.getClass();
        dynamicScheme$Platform.getClass();
        colorSpec$SpecVersion.getClass();
        c82636.getClass();
        this.f22868 = c8255;
        this.f22867 = variant;
        this.f22866 = z;
        this.f22865 = c8263;
        this.f22864 = c82632;
        this.f22863 = c82633;
        this.f22870 = c82634;
        this.f22869 = c82635;
        this.f22873 = dynamicScheme$Platform;
        this.f22874 = c82636;
        switch (AbstractC8262.f22875[variant.ordinal()]) {
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
                C4211.m8611();
                throw null;
        }
        this.f22871 = colorSpec$SpecVersion;
        this.f22872 = new C3796();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m13827(C3806 c3806) {
        InterfaceC6558 interfaceC6558 = c3806.f11995;
        HashMap map = c3806.f11993;
        C8255 c8255Mo8152 = (C8255) map.get(this);
        if (c8255Mo8152 == null) {
            c8255Mo8152 = (this.f22871 == ColorSpec$SpecVersion.SPEC_2025 ? AbstractC3804.f11973 : AbstractC3804.f11974).mo8152(this, c3806);
            if (map.size() > 4) {
                map.clear();
            }
            map.put(this, c8255Mo8152);
        }
        int i = c8255Mo8152.f22857;
        Double d = interfaceC6558 != null ? (Double) interfaceC6558.invoke(this) : null;
        if (interfaceC6558 == null || d == null) {
            return i;
        }
        return (AbstractC2567.m5090((int) Math.rint(d.doubleValue() * 255.0d), 0, Opcodes.CONST_METHOD_TYPE) << 24) | (i & 16777215);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8260(C8255 c8255, Variant variant, boolean z, DynamicScheme$Platform dynamicScheme$Platform, ColorSpec$SpecVersion colorSpec$SpecVersion, C8263 c8263, C8263 c82632, C8263 c82633, C8263 c82634, C8263 c82635, C8263 c82636) {
        this(c8255, variant, z, c8263, c82632, c82633, c82634, c82635, dynamicScheme$Platform, colorSpec$SpecVersion, c82636 == null ? AbstractC6561.m12048(25.0d, 84.0d) : c82636);
        variant.getClass();
        c8263.getClass();
        c82632.getClass();
        c82633.getClass();
        c82634.getClass();
        c82635.getClass();
    }
}
