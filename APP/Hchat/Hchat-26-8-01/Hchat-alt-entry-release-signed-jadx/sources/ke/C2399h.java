package ke;

import ae.C0077h;
import android.os.Handler;
import bb.C0243e;
import ca.C0518f;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import lb.C2549k;
import ma.C2821a;
import na.C2915c;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.internal.Util;
import p011ab.C0041a;
import p011ab.C0043c;
import p012ah.C0086a;
import p024b9.C0215a;
import p049d9.C0743d;
import p077f8.AbstractC1089i;
import p077f8.C1085e;
import p077f8.InterfaceC1084d;
import p078f9.C1090a;
import p080fb.AbstractC1184v0;
import p097g9.C1372a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p107h9.C1626a;
import p108ha.C1639e0;
import p108ha.C1655o;
import p108ha.C1662v;
import p109hb.C1698u;
import p116i.C1746e0;
import p134j6.AbstractC2084v;
import p134j6.InterfaceC2077o;
import p137j9.C2115a;
import p138ja.C2116a;
import p139jb.C2117a;
import p152k7.AbstractC2331a;
import p153k8.C2352p;
import p165l6.AbstractC2512c;
import p184m9.C2816a;
import p209o7.C3068b;
import p211o9.C3103p;
import p231pb.C3378a;
import p258r8.C3740e;
import p258r8.EnumC3738c;
import p302ud.C4305a;
import p302ud.C4322r;
import p302ud.InterfaceC4318n;
import p379z7.InterfaceC6124t;

/* JADX INFO: renamed from: ke.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2399h implements InterfaceC2395d, InterfaceC1084d, EventListener.Factory, InterfaceC2077o, InterfaceC6124t {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f7867g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f7868h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2399h(Object obj, int i9) {
        this.f7867g = i9;
        this.f7868h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p379z7.InterfaceC6124t
    /* JADX INFO: renamed from: a */
    public void mo5738a(int i9, int i10) {
        C3068b c3068b = (C3068b) this.f7868h;
        AbstractC2331a abstractC2331aM6524Q = c3068b.m6524Q(i9);
        AbstractC2331a abstractC2331aM6524Q2 = c3068b.m6524Q(i10);
        if (abstractC2331aM6524Q != null) {
            abstractC2331aM6524Q.m5546H(i9);
        }
        if (abstractC2331aM6524Q2 != null) {
            abstractC2331aM6524Q2.m5546H(i10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.InterfaceC1084d
    /* JADX INFO: renamed from: b */
    public void mo468b(Object obj) {
        int i9 = this.f7867g;
        EnumC3738c enumC3738c = EnumC3738c.BRIDGE;
        int i10 = 7;
        EnumC3738c enumC3738c2 = EnumC3738c.WARMUP;
        int i11 = 1;
        int i12 = 11;
        int i13 = 4;
        int i14 = 12;
        Object obj2 = this.f7868h;
        switch (i9) {
            case 1:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C0041a((C0043c) obj2, 0), "quote_delete_clear", "删除键清引用", null);
                break;
            case 2:
            case 17:
            case 18:
            case 25:
            case 27:
            default:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C1746e0((C3378a) obj2, i12), "block_typing_report", "拦截正在输入上报", null);
                break;
            case 3:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C0041a((C0215a) obj2, i13), "chat_time_style", "会话时间样式", null);
                break;
            case 4:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C0041a((C0243e) obj2, i10), "real_name_tail", "实名尾字", null);
                break;
            case 5:
                ((C1085e) obj).getClass();
                ((C0518f) obj2).m1533k();
                break;
            case 6:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C0041a((C0215a) obj2, i12), "round_avatar", "圆角头像", null);
                break;
            case 7:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C0041a((C0743d) obj2, i14), "custom_friend_avatar", "自定义好友头像", null);
                break;
            case 8:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C0041a((C1090a) obj2, 19), "edit_message", "修改聊天记录", null);
                break;
            case 9:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C0041a((C1372a) obj2, 23), "emoji_save", "保存表情", null);
                break;
            case 10:
                ((C1085e) obj).getClass();
                Handler handler = C3740e.f12138a;
                C3740e.m7759f(8, new C0041a((C1626a) obj2, 24), "fake_location", "虚拟定位", enumC3738c);
                break;
            case 11:
                ((C1085e) obj).getClass();
                ((C1655o) obj2).m4228k();
                break;
            case 12:
                ((C1085e) obj).getClass();
                ((C1662v) obj2).m4244k();
                break;
            case 13:
                ((C1085e) obj).getClass();
                Handler handler2 = C3740e.f12138a;
                C3740e.m7759f(8, new C0041a((C1639e0) obj2, 27), "moments_upload_tail", "朋友圈上传尾巴", enumC3738c2);
                break;
            case 14:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C0041a((C0215a) obj2, 28), "original_moments_upload", "朋友圈原图上传", null);
                break;
            case 15:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C0041a((C1698u) obj2, 29), "selected_messages", "群发助手", null);
                break;
            case 16:
                ((C1085e) obj).getClass();
                C3740e.m7759f(4, new C1746e0((C0215a) obj2, i11), "fake_scan_camera", "模拟相机扫码", null);
                break;
            case 19:
                ((C1085e) obj).getClass();
                Handler handler3 = C3740e.f12138a;
                C3740e.m7759f(8, new C1746e0((C2115a) obj2, 2), "fake_voice_duration", "伪造语音时长", enumC3738c);
                break;
            case 20:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C1746e0((C2116a) obj2, 3), "multi_recall", "多选撤回", null);
                break;
            case 21:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C1746e0((C2117a) obj2, i13), "finder_media_download", "视频号媒体下载", null);
                break;
            case 22:
                ((C1085e) obj).getClass();
                ((C2549k) obj2).m6000k();
                break;
            case 23:
                ((C1085e) obj).getClass();
                Handler handler4 = C3740e.f12138a;
                C3740e.m7759f(8, new C1746e0((C2816a) obj2, i10), "game_emoji_result", "指定骰子猜拳", enumC3738c2);
                break;
            case 24:
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C1746e0((C2821a) obj2, 9), "disable_pat", "禁止拍一拍", null);
                break;
            case 26:
                C0215a c0215a = (C0215a) obj2;
                ((C1085e) obj).getClass();
                WeChatApis.message().getClass();
                C2352p c2352p = WeChatApis.messageObserveApi;
                if (c2352p != null) {
                    c0215a.m7753j(c2352p.m5640e(new C2915c(c0215a, i11)));
                } else {
                    AbstractC1184v0.m3203m("[Hchat:TextSpeech] 消息观察 API 未就绪");
                }
                break;
            case 28:
                ((C1085e) obj).getClass();
                ((C3103p) obj2).m6607z();
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // ke.InterfaceC2395d
    /* JADX INFO: renamed from: c */
    public boolean mo193c(C4322r c4322r, InterfaceC4318n interfaceC4318n) {
        List<C0077h> list = (List) this.f7868h;
        for (C0077h c0077h : list) {
            C4305a c4305a = c0077h.f249m;
            if (interfaceC4318n.mo8675u().contains(c4305a)) {
                if (!AbstractC2400i.m5739t0(interfaceC4318n, c0077h, c4305a)) {
                    c4322r.m6382K("Can't wrap try/catch for region: ".concat(String.valueOf(interfaceC4318n)));
                }
                list.remove(c0077h);
                return !list.isEmpty();
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.asFactory$lambda$8((EventListener) this.f7868h, call);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p134j6.InterfaceC2077o
    /* JADX INFO: renamed from: d */
    public Object mo4937d() {
        int i9 = this.f7867g;
        Object obj = this.f7868h;
        switch (i9) {
            case 17:
                Constructor constructor = (Constructor) obj;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e6) {
                    AbstractC1089i abstractC1089i = AbstractC2512c.f8137a;
                    C0086a.m457p("Unexpected IllegalAccessException occurred (Gson 2.13.2). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e6);
                    return null;
                } catch (InstantiationException e7) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC2512c.m5900b(constructor) + "' with no args", e7);
                } catch (InvocationTargetException e10) {
                    C0086a.m457p("Failed to invoke constructor '" + AbstractC2512c.m5900b(constructor) + "' with no args", e10.getCause());
                    return null;
                }
            default:
                Class cls = (Class) obj;
                try {
                    return AbstractC2084v.f6989a.mo5140a(cls);
                } catch (Exception e11) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e11);
                }
        }
    }
}
