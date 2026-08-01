package p193;

import android.graphics.Typeface;
import androidx.appcompat.app.C0108;
import androidx.compose.ui.text.font.AbstractC1993;
import androidx.compose.ui.text.font.C1969;
import androidx.compose.ui.text.font.C1987;
import androidx.compose.ui.text.font.C1988;
import androidx.compose.ui.text.font.C1990;
import androidx.compose.ui.text.font.C1994;
import p052.InterfaceC6551;

/* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7821 implements InterfaceC6551 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ C7820 f21363;

    public /* synthetic */ C7821(C7820 c7820) {
        this.f21363 = c7820;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C7820 c7820 = this.f21363;
        C1969 c1969M3693 = ((C1994) c7820.f21354).m3693((AbstractC1993) obj, (C1988) obj2, ((C1990) obj3).f5879, ((C1987) obj4).f5869);
        if (c1969M3693 instanceof C1969) {
            Object obj5 = c1969M3693.f5851;
            obj5.getClass();
            return (Typeface) obj5;
        }
        C0108 c0108 = new C0108(c1969M3693, c7820.f21353);
        c7820.f21353 = c0108;
        Object obj6 = c0108.f318;
        obj6.getClass();
        return (Typeface) obj6;
    }
}
