package p011;

import androidx.appcompat.app.C0108;
import androidx.compose.foundation.lazy.layout.C0734;
import java.io.IOException;
import p004.C6099;
import p004.C6107;
import p007.C6127;
import p007.C6131;
import p007.InterfaceC6140;
import p007.InterfaceC6141;
import p012.C6221;
import p012.InterfaceC6215;
import p019.C6277;
import p019.C6278;
import p020.C6291;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲子苏.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6198 implements InterfaceC6140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C6198 f17058 = new C6198();

    @Override // p007.InterfaceC6140
    public final C6131 intercept(InterfaceC6141 interfaceC6141) throws IOException {
        InterfaceC6215 c6291;
        C6221 c6221 = (C6221) interfaceC6141;
        C6203 c6203 = c6221.f17148;
        synchronized (c6203) {
            if (!c6203.f17070) {
                throw new IllegalStateException("released");
            }
            if (c6203.f17073 || c6203.f17074 || c6203.f17071 || c6203.f17072) {
                throw new IllegalStateException("Check failed.");
            }
        }
        InterfaceC6210 interfaceC6210 = c6203.f17084;
        interfaceC6210.getClass();
        C6207 c6207Mo11262 = interfaceC6210.mo11262();
        C6127 c6127 = c6203.f17087;
        c6207Mo11262.getClass();
        c6127.getClass();
        int i = c6221.f17150;
        C0108 c0108 = c6207Mo11262.f17119;
        C6277 c6277 = c6207Mo11262.f17123;
        if (c6277 != null) {
            c6291 = new C6278(c6127, c6207Mo11262, c6221, c6277);
        } else {
            c6207Mo11262.f17110.setSoTimeout(i);
            ((C6099) c0108.f320).f16673.mo10933().mo11455(i);
            ((C6107) c0108.f318).f16688.mo10934().mo11455(c6221.f17149);
            c6291 = new C6291(c6127, c6207Mo11262, c0108);
        }
        C0734 c0734 = new C0734(c6203, interfaceC6210, c6291);
        c6203.f17075 = c0734;
        c6203.f17077 = c0734;
        synchronized (c6203) {
            c6203.f17074 = true;
            c6203.f17073 = true;
        }
        if (!c6203.f17078) {
            return C6221.m11672(c6221, 0, c0734, null, 61).m11673(c6221.f17144);
        }
        C5925.m11307("Canceled");
        return null;
    }
}
