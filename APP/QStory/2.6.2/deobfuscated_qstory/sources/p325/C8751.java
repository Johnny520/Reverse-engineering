package p325;

import androidx.profileinstaller.AbstractC2442;
import com.bumptech.glide.AbstractC3056;
import kotlin.C5175;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: 飘花落叶言苏世哲兰子楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8751 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final /* synthetic */ String f24659;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final /* synthetic */ String f24660;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f24661;

    public /* synthetic */ C8751(int i, String str, String str2) {
        this.f24661 = i;
        this.f24659 = str;
        this.f24660 = str2;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        int i = this.f24661;
        C5175 c5175 = C5175.f14739;
        String str = this.f24660;
        String str2 = this.f24659;
        C8758 c8758 = (C8758) obj;
        switch (i) {
            case 0:
                c8758.m14434(str2, AbstractC2442.m4573(-3937791360413992359L, c8758, -3937597717518484903L));
                c8758.m14434("boolean", "type");
                c8758.m14434(str, "description");
                break;
            case 1:
                c8758.m14434(str2, AbstractC2442.m4573(-3937791360413992359L, c8758, -3937597717518484903L));
                c8758.m14434("integer", "type");
                c8758.m14434(str, "description");
                break;
            case 2:
                c8758.m14434(str2, AbstractC2442.m4573(-3937791360413992359L, c8758, -3937597717518484903L));
                c8758.m14434("number", "type");
                c8758.m14434(str, "description");
                break;
            case 3:
                c8758.m14434(str2, AbstractC2442.m4573(-3937791360413992359L, c8758, -3937597717518484903L));
                c8758.m14434("object", "type");
                c8758.m14434(str, "description");
                break;
            default:
                c8758.m14434(str2, AbstractC2442.m4573(-3937791360413992359L, c8758, -3937597717518484903L));
                c8758.m14434("string", "type");
                c8758.m14434(str, "description");
                break;
        }
        return c5175;
    }
}
