package p013;

import androidx.appcompat.app.C0108;
import androidx.compose.foundation.lazy.layout.C0734;
import java.io.IOException;
import p005.C6108;
import p005.C6116;
import p015.C6200;
import p015.C6204;
import p015.InterfaceC6213;
import p015.InterfaceC6214;
import p020.C6252;
import p021.C6259;
import p021.InterfaceC6253;
import p022.C6281;
import p022.C6282;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6173 implements InterfaceC6213 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6173 f16854 = new C6173();

    @Override // p015.InterfaceC6213
    public final C6204 intercept(InterfaceC6214 interfaceC6214) throws IOException {
        InterfaceC6253 c6252;
        C6259 c6259 = (C6259) interfaceC6214;
        C6177 c6177 = c6259.f17234;
        synchronized (c6177) {
            if (!c6177.f16865) {
                throw new IllegalStateException("released");
            }
            if (c6177.f16868 || c6177.f16869 || c6177.f16866 || c6177.f16867) {
                throw new IllegalStateException("Check failed.");
            }
        }
        InterfaceC6184 interfaceC6184 = c6177.f16879;
        interfaceC6184.getClass();
        C6181 c6181Mo11200 = interfaceC6184.mo11200();
        C6200 c6200 = c6177.f16882;
        c6181Mo11200.getClass();
        c6200.getClass();
        int i = c6259.f17236;
        C0108 c0108 = c6181Mo11200.f16911;
        C6281 c6281 = c6181Mo11200.f16915;
        if (c6281 != null) {
            c6252 = new C6282(c6200, c6181Mo11200, c6259, c6281);
        } else {
            c6181Mo11200.f16902.setSoTimeout(i);
            ((C6108) c0108.f320).f16683.mo10875().mo11462(i);
            ((C6116) c0108.f318).f16698.mo10878().mo11462(c6259.f17235);
            c6252 = new C6252(c6200, c6181Mo11200, c0108);
        }
        C0734 c0734 = new C0734(c6177, interfaceC6184, c6252);
        c6177.f16870 = c0734;
        c6177.f16872 = c0734;
        synchronized (c6177) {
            c6177.f16869 = true;
            c6177.f16868 = true;
        }
        if (!c6177.f16873) {
            return C6259.m11742(c6259, 0, c0734, null, 61).m11743(c6259.f17230);
        }
        C5919.m11246("Canceled");
        return null;
    }
}
