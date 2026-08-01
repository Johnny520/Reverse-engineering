package androidx.compose.p001ui.graphics;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.AbstractC2961;
import androidx.compose.p001ui.node.AbstractC2571;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2629;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.jar.asm.Opcodes;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m151d2 = {"Landroidx/compose/ui/graphics/飘花落叶言子世楪哲苏兰;", "Landroidx/compose/ui/node/飘花落叶言子世兰哲楪苏;", "Landroidx/compose/ui/graphics/飘花落叶言子世兰苏楪哲;", "ui"}, m152k = 1, m153mv = {2, 1, 0}, m155xi = 48)
final /* data */ class C2417 extends AbstractC2571 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final boolean f5009;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final InterfaceC2404 f5010;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long f5011;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final long f5012;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final float f5013;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final long f5014;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final float f5015;

    public C2417(float f, float f2, long j, InterfaceC2404 interfaceC2404, boolean z, long j2, long j3) {
        this.f5015 = f;
        this.f5013 = f2;
        this.f5014 = j;
        this.f5010 = interfaceC2404;
        this.f5009 = z;
        this.f5011 = j2;
        this.f5012 = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2417)) {
            return false;
        }
        C2417 c2417 = (C2417) obj;
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.f5015, c2417.f5015) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.f5013, c2417.f5013) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && C2450.m3545(this.f5014, c2417.f5014) && AbstractC5227.m9466(this.f5010, c2417.f5010) && this.f5009 == c2417.f5009 && C2434.m3509(this.f5011, c2417.f5011) && C2434.m3509(this.f5012, c2417.f5012);
    }

    public final int hashCode() {
        int iM705 = AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(AbstractC0900.m705(Float.hashCode(1.0f) * 31, 1.0f, 31), this.f5015, 31), 0.0f, 31), 0.0f, 31), this.f5013, 31), 0.0f, 31), 0.0f, 31), 0.0f, 31), 8.0f, 31);
        int i = C2450.f5071;
        int iM701 = AbstractC0900.m701((this.f5010.hashCode() + AbstractC0900.m702(iM705, 31, this.f5014)) * 31, 961, this.f5009);
        int i2 = C2434.f5044;
        return AbstractC0900.m704(3, AbstractC0900.m704(0, AbstractC0900.m702(AbstractC0900.m702(iM701, 31, this.f5011), 31, this.f5012), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.f5015);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.f5013);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) C2450.m3544(this.f5014));
        sb.append(", shape=");
        sb.append(this.f5010);
        sb.append(", clip=");
        sb.append(this.f5009);
        sb.append(", renderEffect=null, ambientShadowColor=");
        AbstractC0900.m698(this.f5011, sb, ", spotShadowColor=");
        sb.append((Object) C2434.m3514(this.f5012));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) AbstractC2416.m3438(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo1656(AbstractC2961 abstractC2961) {
        AbstractC2629 abstractC2629;
        C2407 c2407 = (C2407) abstractC2961;
        c2407.f4971 = 1.0f;
        c2407.f4977 = 1.0f;
        c2407.f4976 = this.f5015;
        c2407.f4975 = this.f5013;
        c2407.f4974 = 8.0f;
        c2407.f4973 = this.f5014;
        c2407.f4972 = this.f5010;
        c2407.f4968 = this.f5009;
        c2407.f4967 = this.f5011;
        c2407.f4970 = this.f5012;
        c2407.f4969 = 3;
        InterfaceC7387 interfaceC7387 = c2407.f4966;
        if (c2407.f6637.f6624 && (abstractC2629 = AbstractC2620.m3908(c2407, 2).f5602) != null) {
            abstractC2629.m3971(interfaceC7387, true);
        }
    }

    @Override // androidx.compose.p001ui.node.AbstractC2571
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final AbstractC2961 mo1657() {
        final C2407 c2407 = new C2407();
        c2407.f4971 = 1.0f;
        c2407.f4977 = 1.0f;
        c2407.f4976 = this.f5015;
        c2407.f4975 = this.f5013;
        c2407.f4974 = 8.0f;
        c2407.f4973 = this.f5014;
        c2407.f4972 = this.f5010;
        c2407.f4968 = this.f5009;
        c2407.f4967 = this.f5011;
        c2407.f4970 = this.f5012;
        c2407.f4969 = 3;
        c2407.f4966 = new InterfaceC7387() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            public final void invoke(InterfaceC2415 interfaceC2415) {
                C2408 c2408 = (C2408) interfaceC2415;
                c2408.m3425(c2407.f4971);
                c2408.m3426(c2407.f4977);
                c2408.m3415(c2407.f4976);
                c2407.getClass();
                c2408.m3417(0.0f);
                c2407.getClass();
                c2408.m3418(0.0f);
                c2408.m3419(c2407.f4975);
                c2407.getClass();
                c2408.m3423(0.0f);
                c2407.getClass();
                c2408.m3427(0.0f);
                c2407.getClass();
                c2408.m3413(c2407.f4974);
                c2408.m3421(c2407.f4973);
                c2408.m3422(c2407.f4972);
                c2408.m3412(c2407.f4968);
                c2407.getClass();
                c2408.m3424(null);
                c2408.m3414(c2407.f4967);
                c2408.m3420(c2407.f4970);
                c2407.getClass();
                C2407 c24072 = c2407;
                int i = c24072.f4969;
                if (c2408.f4985 != i) {
                    c2408.f4998 |= Opcodes.ASM8;
                    c2408.f4985 = i;
                }
                c24072.getClass();
            }

            @Override // p068.InterfaceC7387
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((InterfaceC2415) obj);
                return C6008.f15084;
            }
        };
        return c2407;
    }
}
