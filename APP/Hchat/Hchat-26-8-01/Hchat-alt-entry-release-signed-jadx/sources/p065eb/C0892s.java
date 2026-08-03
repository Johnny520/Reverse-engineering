package p065eb;

import android.content.Context;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicInteger;
import p036c9.C0434f;
import p036c9.C0438g;
import p077f8.C1085e;
import p077f8.C1086f;
import p077f8.InterfaceC1084d;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p153k8.C2351o;
import p167l8.C2529d;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;
import p346x9.AbstractC5737d;

/* JADX INFO: renamed from: eb.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0892s implements InterfaceC1084d {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2770g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C3742g f2771h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0892s(C3742g c3742g) {
        this.f2770g = 2;
        this.f2771h = c3742g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    @Override // p077f8.InterfaceC1084d
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo468b(Object obj) {
        int iM5940f;
        boolean z9;
        Integer numM6741e0;
        int i9 = this.f2770g;
        EnumC3738c enumC3738c = EnumC3738c.WARMUP;
        C3742g c3742g = this.f2771h;
        switch (i9) {
            case 0:
                ((C1085e) obj).getClass();
                C0438g.m1451k(c3742g);
                ScriptPluginRuntime.INSTANCE.loadEnabledPluginsWhenReady(c3742g.f12143a);
                break;
            case 1:
                ((C1085e) obj).getClass();
                Handler handler = C3740e.f12138a;
                C3740e.m7759f(8, new C0434f(c3742g, 5), "shared:send_button", "聊天发送按钮", enumC3738c);
                break;
            case 2:
                C1086f c1086f = (C1086f) obj;
                c1086f.getClass();
                AtomicInteger atomicInteger = AbstractC5737d.f23377a;
                Context context = c3742g.f12143a;
                String str = c1086f.f3478c;
                String str2 = c1086f.f3477b;
                String str3 = c1086f.f3479d;
                if (!AbstractC3149m.m6721t0(str) && !AbstractC3149m.m6721t0(str2) && !AbstractC3149m.m6721t0(str3)) {
                    String str4 = c1086f.f3480e;
                    if (str4 == null || (numM6741e0 = AbstractC3156t.m6741e0(10, str4)) == null) {
                        WeChatMessage.Companion.getClass();
                        iM5940f = C2529d.m5940f(str3);
                    } else {
                        iM5940f = numM6741e0.intValue();
                    }
                    int i10 = iM5940f;
                    C2529d c2529d = WeChatMessage.Companion;
                    long j3 = c1086f.f3481f;
                    long jCurrentTimeMillis = j3 > 0 ? j3 * 1000 : System.currentTimeMillis();
                    long j4 = c1086f.f3482g;
                    String str5 = c1086f.f3483h;
                    String str6 = c1086f.f3484i;
                    c2529d.getClass();
                    WeChatMessage weChatMessageM5945k = C2529d.m5945k(str, str2, str3, jCurrentTimeMillis, false, i10, j4, str5, str6);
                    String strM10424h = AbstractC5737d.m10424h(weChatMessageM5945k);
                    String str7 = c1086f.f3476a;
                    String str8 = c1086f.f3485j;
                    if (!weChatMessageM5945k.isGroupChat()) {
                        z9 = AbstractC3156t.m6733W(str, "@chatroom", false) || AbstractC3156t.m6733W(str, "@im.chatroom", false);
                    }
                    AbstractC5737d.m10419c(context, new C2351o("message_block", strM10424h, str, str2, str3, str7, str8, z9, false, null, weChatMessageM5945k));
                    break;
                }
                break;
            default:
                ((C1085e) obj).getClass();
                Handler handler2 = C3740e.f12138a;
                C3740e.m7759f(8, new C0434f(c3742g, 10), "shared:send_button", "聊天发送按钮", enumC3738c);
                break;
        }
    }

    public /* synthetic */ C0892s(AbstractC3736a abstractC3736a, C3742g c3742g, int i9) {
        this.f2770g = i9;
        this.f2771h = c3742g;
    }
}
