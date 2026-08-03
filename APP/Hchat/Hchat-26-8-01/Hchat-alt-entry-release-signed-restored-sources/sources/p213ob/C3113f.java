package p213ob;

import android.os.Handler;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import okhttp3.HttpUrl;
import p024b9.RunnableC0217c;
import p036c9.C0434f;
import p063e9.C0830a;
import p065eb.C0881m0;
import p065eb.InterfaceC0873i0;
import p068eh.AbstractC0921a;
import p077f8.C1085e;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p108ha.C1651k0;
import p116i.C1746e0;
import p126ia.C2026t;
import p218og.AbstractC3149m;
import p242q8.C3458m;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;

/* JADX INFO: renamed from: ob.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3113f extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public C3121n f10092e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "text_voice";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C1651k0("text_voice", "文本转语音", "把输入文字合成为微信语音，或长按文字消息在线合成播放", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        final C3121n c3121n = new C3121n(c3742g, new C2026t(2, this, AbstractC0921a.m2246i(C3113f.class), "logFeatureError", "logFeatureError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 15));
        this.f10092e = c3121n;
        C0881m0 c0881m0 = C0881m0.f2707a;
        m7753j(C0881m0.m2200j("text_voice", new InterfaceC0873i0() { // from class: ob.e
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p065eb.InterfaceC0873i0
            /* JADX INFO: renamed from: b */
            public final boolean mo2174b(String str) {
                str.getClass();
                C3121n c3121n2 = c3121n;
                ConcurrentHashMap concurrentHashMap = c3121n2.f10117h;
                if (!c3121n2.m6627i()) {
                    return false;
                }
                C3458m c3458mChatPage = WeChatApis.chatPage();
                String strM7258a = c3458mChatPage != null ? c3458mChatPage.m7258a() : null;
                if (strM7258a == null) {
                    strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String string = AbstractC3149m.m6703R0(strM7258a).toString();
                String lowerCase = AbstractC3149m.m6703R0(str).toString().toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                if (!lowerCase.equals("#tts") && !lowerCase.equals("#tts e")) {
                    EnumC3117j enumC3117j = (EnumC3117j) concurrentHashMap.get(string);
                    if (enumC3117j == null || AbstractC3149m.m6721t0(str)) {
                        return false;
                    }
                    try {
                        c3121n2.f10120k.execute(new RunnableC0217c(c3121n2, c3121n2.m6628j(enumC3117j), str, string));
                        return true;
                    } catch (RejectedExecutionException unused) {
                        C0881m0 c0881m02 = C0881m0.f2707a;
                        C0881m0.m2201k(string, str);
                        c3121n2.m6630l("待处理语音过多，请稍后重试");
                        return true;
                    }
                }
                if (AbstractC3149m.m6721t0(string)) {
                    c3121n2.m6630l("当前聊天不可用");
                    return true;
                }
                boolean zEquals = lowerCase.equals("#tts e");
                EnumC3117j enumC3117j2 = EnumC3117j.f10100h;
                EnumC3117j enumC3117j3 = zEquals ? enumC3117j2 : EnumC3117j.f10099g;
                EnumC3117j enumC3117j4 = (EnumC3117j) concurrentHashMap.get(string);
                if (enumC3117j4 == enumC3117j3 || (lowerCase.equals("#tts") && enumC3117j4 != null)) {
                    concurrentHashMap.remove(string);
                    c3121n2.m6630l("当前聊天文字转语音已关闭");
                    return true;
                }
                concurrentHashMap.put(string, enumC3117j3);
                c3121n2.m6630l(enumC3117j3 == enumC3117j2 ? "当前聊天英文转语音已开启" : "当前聊天文字转语音已开启");
                return true;
            }
        }));
        Handler handler = C3740e.f12138a;
        C3740e.m7759f(8, new C0434f(c3742g, 6), "shared:send_button", "聊天发送按钮", EnumC3738c.WARMUP);
        C3740e.m7759f(12, new C1746e0(this, 10), "text_voice", "文本转语音", null);
        m7752i(C1085e.class, new C0830a(this, 4, c3742g));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "文本转语音";
    }
}
