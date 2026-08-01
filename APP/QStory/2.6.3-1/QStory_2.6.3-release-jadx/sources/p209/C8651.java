package p209;

import android.graphics.Typeface;
import androidx.appcompat.app.C0955;
import androidx.compose.p001ui.text.font.AbstractC2827;
import androidx.compose.p001ui.text.font.C2803;
import androidx.compose.p001ui.text.font.C2821;
import androidx.compose.p001ui.text.font.C2822;
import androidx.compose.p001ui.text.font.C2824;
import androidx.compose.p001ui.text.font.C2828;
import p068.InterfaceC7381;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C8651 implements InterfaceC7381 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C8650 f21705;

    public /* synthetic */ C8651(C8650 c8650) {
        this.f21705 = c8650;
    }

    @Override // p068.InterfaceC7381
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C8650 c8650 = this.f21705;
        C2803 c2803M4263 = ((C2828) c8650.f21696).m4263((AbstractC2827) obj, (C2822) obj2, ((C2824) obj3).f6225, ((C2821) obj4).f6215);
        if (c2803M4263 instanceof C2803) {
            Object obj5 = c2803M4263.f6197;
            obj5.getClass();
            return (Typeface) obj5;
        }
        C0955 c0955 = new C0955(c2803M4263, c8650.f21695);
        c8650.f21695 = c0955;
        Object obj6 = c0955.f663;
        obj6.getClass();
        return (Typeface) obj6;
    }
}
