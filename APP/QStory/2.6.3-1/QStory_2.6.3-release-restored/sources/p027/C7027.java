package p027;

import androidx.appcompat.app.C0955;
import androidx.compose.foundation.lazy.layout.C1575;
import java.io.IOException;
import p020.C6928;
import p020.C6936;
import p023.C6956;
import p023.C6960;
import p023.InterfaceC6969;
import p023.InterfaceC6970;
import p028.C7050;
import p028.InterfaceC7044;
import p035.C7106;
import p035.C7107;
import p036.C7120;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7027 implements InterfaceC6969 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7027 f17403 = new C7027();

    @Override // p023.InterfaceC6969
    public final C6960 intercept(InterfaceC6970 interfaceC6970) throws IOException {
        InterfaceC7044 c7120;
        C7050 c7050 = (C7050) interfaceC6970;
        C7032 c7032 = c7050.f17493;
        synchronized (c7032) {
            if (!c7032.f17415) {
                throw new IllegalStateException("released");
            }
            if (c7032.f17418 || c7032.f17419 || c7032.f17416 || c7032.f17417) {
                throw new IllegalStateException("Check failed.");
            }
        }
        InterfaceC7039 interfaceC7039 = c7032.f17429;
        interfaceC7039.getClass();
        C7036 c7036Mo11821 = interfaceC7039.mo11821();
        C6956 c6956 = c7032.f17432;
        c7036Mo11821.getClass();
        c6956.getClass();
        int i = c7050.f17495;
        C0955 c0955 = c7036Mo11821.f17464;
        C7106 c7106 = c7036Mo11821.f17468;
        if (c7106 != null) {
            c7120 = new C7107(c6956, c7036Mo11821, c7050, c7106);
        } else {
            c7036Mo11821.f17455.setSoTimeout(i);
            ((C6928) c0955.f665).f17018.mo11492().mo12014(i);
            ((C6936) c0955.f663).f17033.mo11493().mo12014(c7050.f17494);
            c7120 = new C7120(c6956, c7036Mo11821, c0955);
        }
        C1575 c1575 = new C1575(c7032, interfaceC7039, c7120);
        c7032.f17420 = c1575;
        c7032.f17422 = c1575;
        synchronized (c7032) {
            c7032.f17419 = true;
            c7032.f17418 = true;
        }
        if (!c7032.f17423) {
            return C7050.m12231(c7050, 0, c1575, null, 61).m12232(c7050.f17489);
        }
        C6755.m11866("Canceled");
        return null;
    }
}
