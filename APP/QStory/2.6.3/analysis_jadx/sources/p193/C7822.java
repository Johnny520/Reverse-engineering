package p193;

import android.graphics.Typeface;
import androidx.appcompat.app.C0108;
import androidx.compose.ui.text.font.AbstractC1993;
import androidx.compose.ui.text.font.C1969;
import androidx.compose.ui.text.font.C1987;
import androidx.compose.ui.text.font.C1988;
import androidx.compose.ui.text.font.C1990;
import androidx.compose.ui.text.font.C1994;
import p052.InterfaceC6552;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7822 implements InterfaceC6552 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C7821 f21360;

    public /* synthetic */ C7822(C7821 c7821) {
        this.f21360 = c7821;
    }

    @Override // p052.InterfaceC6552
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C7821 c7821 = this.f21360;
        C1969 c1969M3703 = ((C1994) c7821.f21351).m3703((AbstractC1993) obj, (C1988) obj2, ((C1990) obj3).f5880, ((C1987) obj4).f5870);
        if (c1969M3703 instanceof C1969) {
            Object obj5 = c1969M3703.f5852;
            obj5.getClass();
            return (Typeface) obj5;
        }
        C0108 c0108 = new C0108(c1969M3703, c7821.f21350);
        c7821.f21350 = c0108;
        Object obj6 = c0108.f318;
        obj6.getClass();
        return (Typeface) obj6;
    }
}
