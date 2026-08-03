package p024b9;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Handler;
import android.view.KeyEvent;
import ba.C0233m;
import de.robv.android.xposed.XC_MethodHook;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import ke.C2399h;
import p010aa.C0035c;
import p010aa.C0039g;
import p011ab.C0041a;
import p020b5.C0184c;
import p037cb.C0543d;
import p037cb.C0545f;
import p050da.C0762h;
import p063e9.C0830a;
import p064ea.C0851c;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p077f8.C1085e;
import p080fb.AbstractC1184v0;
import p099h.Hchat.utils.KavaReflector;
import p108ha.C1643g0;
import p108ha.C1651k0;
import p116i.C1746e0;
import p127ib.C2033a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p198nb.C2954w;
import p243q9.C3465a;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.C3744i;
import p258r8.EnumC3738c;
import p274s8.C3944d;
import p275s9.C3946b;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import qa.C3478f;

/* JADX INFO: renamed from: b9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0215a extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f523e;

    /* JADX INFO: renamed from: f */
    public Object f524f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [h.Hchat.ModuleEntry.lambda$initModule$4(de.robv.android.xposed.callbacks.XC_LoadPackage$LoadPackageParam, android.content.Context, android.content.Context, ub.a):void] */
    public /* synthetic */ C0215a(int i9) {
        this.f523e = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        switch (this.f523e) {
            case 0:
                return "chat_time_style";
            case 1:
                return "message_bubble";
            case 2:
                return "round_avatar";
            case 3:
                return "message_text_color";
            case 4:
                return "original_moments_upload";
            case 5:
                return "fake_scan_camera";
            case 6:
                return "auto_redpacket";
            case 7:
                return "text_speech";
            case 8:
                return "fake_wallet_balance";
            case 9:
                return "hide_chat_avatar";
            case 10:
                return "hide_chat_menu";
            default:
                return "auto_message_forward";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        int i9 = this.f523e;
        c3742g.getClass();
        switch (i9) {
            case 0:
                m7751h(new C0039g("chat_time_style", "会话时间样式", "自定义或隐藏聊天记录中的微信时间", "practical"));
                break;
            case 1:
                m7751h(new C0039g("message_bubble", "消息气泡", "分别替换聊天左右侧气泡并适配深色模式", "practical"));
                break;
            case 2:
                m7751h(new C0039g("round_avatar", "圆角头像", "统一设置微信头像的圆角弧度", "practical"));
                break;
            case 3:
                m7751h(new C0039g("message_text_color", "消息文本颜色", "自定义聊天文本消息左右侧颜色", "practical"));
                break;
            case 4:
                m7751h(new C0039g("original_moments_upload", "朋友圈原图上传", "发布朋友圈图片和视频时尽量保留原始文件", "practical"));
                break;
            case 5:
                m7751h(new C1651k0("fake_scan_camera", "模拟相机扫码", "让相册识别二维码按相机扫码来源处理", "practical"));
                break;
            case 6:
                m7751h(new C2033a(2));
                m7752i(AbstractC1089i.class, new C2104o());
                break;
            case 7:
                m7751h(new C1651k0("text_speech", "文字转语音播报", "自动播报允许名单内收到的文字或语音消息", "enhance"));
                break;
            case 8:
                m7751h(new C1651k0("fake_wallet_balance", "伪造零钱", "自定义零钱、零钱通和经营账户显示", "practical"));
                break;
            case 9:
                m7751h(new C3944d("hide_chat_avatar", "隐藏头像", "分别隐藏聊天中自己或对方的头像", "practical"));
                break;
            case 10:
                m7751h(new C3944d("hide_chat_menu", "隐藏聊天菜单", "隐藏聊天消息长按菜单中的指定项目", "practical"));
                break;
            default:
                m7751h(new C3944d("auto_message_forward", "消息自动转发", "按会话、消息类型和关键词自动转发收到的消息", "enhance"));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        XC_MethodHook.Unhook c3959f;
        XC_MethodHook.Unhook c3959f2;
        XC_MethodHook.Unhook c3959f3;
        int i9 = this.f523e;
        c3742g.getClass();
        switch (i9) {
            case 0:
                this.f524f = new C0220f(c3742g);
                C3740e.m7759f(12, new C0041a(this, 4), "chat_time_style", "会话时间样式", null);
                m7752i(C1085e.class, new C2399h(this, 3));
                break;
            case 1:
                this.f524f = new C0233m(c3742g);
                C3740e.m7759f(12, new C0041a(this, 5), "message_bubble", "消息气泡", null);
                break;
            case 2:
                C0545f c0545f = new C0545f(c3742g);
                ConcurrentHashMap.KeySetView keySetView = (ConcurrentHashMap.KeySetView) c0545f.f1723f;
                Method methodFindMethod = KavaReflector.findMethod(Notification.Builder.class, "setLargeIcon", Bitmap.class);
                if (methodFindMethod != null && keySetView.add(methodFindMethod)) {
                    try {
                        c3959f2 = C3744i.f12154b.m7763b(methodFindMethod, new C0543d(c0545f, 0));
                    } catch (Throwable th2) {
                        c3959f2 = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f2);
                    if (thM8182b != null) {
                        keySetView.remove(methodFindMethod);
                        AbstractC0921a.m2261x("[Hchat:RoundAvatar] 安装通知 Bitmap 头像 Hook 失败: ", thM8182b.getMessage(), thM8182b);
                    }
                }
                Method methodFindMethod2 = KavaReflector.findMethod(Notification.Builder.class, "setLargeIcon", Icon.class);
                if (methodFindMethod2 != null && keySetView.add(methodFindMethod2)) {
                    try {
                        c3959f = C3744i.f12154b.m7763b(methodFindMethod2, new C0543d(c0545f, 1));
                    } catch (Throwable th3) {
                        c3959f = new C3959f(th3);
                    }
                    Throwable thM8182b2 = C3960g.m8182b(c3959f);
                    if (thM8182b2 != null) {
                        keySetView.remove(methodFindMethod2);
                        AbstractC0921a.m2261x("[Hchat:RoundAvatar] 安装通知 Icon 头像 Hook 失败: ", thM8182b2.getMessage(), thM8182b2);
                    }
                }
                Class cls = Integer.TYPE;
                cls.getClass();
                c0545f.m1547e(KavaReflector.findMethod(NotificationManager.class, "notify", cls, Notification.class));
                c0545f.m1547e(KavaReflector.findMethod(NotificationManager.class, "notify", String.class, cls, Notification.class));
                this.f524f = c0545f;
                C3740e.m7759f(12, new C0041a(this, 11), "round_avatar", "圆角头像", null);
                m7752i(C1085e.class, new C2399h(this, 6));
                break;
            case 3:
                this.f524f = new C0762h(c3742g);
                C3740e.m7759f(12, new C0041a(this, 13), "message_text_color", "消息文本颜色", null);
                break;
            case 4:
                C1643g0 c1643g0 = new C1643g0(c3742g);
                this.f524f = c1643g0;
                if (!c1643g0.m4173b(false)) {
                    C3740e.m7759f(12, new C0041a(this, 28), "original_moments_upload", "朋友圈原图上传", null);
                }
                m7752i(C1085e.class, new C2399h(this, 14));
                break;
            case 5:
                C0851c c0851c = new C0851c(c3742g);
                this.f524f = c0851c;
                if (!c0851c.m2156a(false)) {
                    C3740e.m7759f(4, new C1746e0(this, 1), "fake_scan_camera", "模拟相机扫码", null);
                }
                m7752i(C1085e.class, new C2399h(this, 16));
                break;
            case 6:
                Handler handler = C3740e.f12138a;
                C3740e.m7759f(8, new C0035c(this, 22, c3742g), "auto_redpacket", "自动抢红包", EnumC3738c.WARMUP);
                m7752i(C1085e.class, new C0830a(this, 2, c3742g));
                break;
            case 7:
                this.f524f = new C2954w(c3742g.f12143a);
                Method methodFindDeclaredMethod = KavaReflector.findDeclaredMethod(Activity.class, "dispatchKeyEvent", KeyEvent.class);
                if (methodFindDeclaredMethod == null) {
                    AbstractC1184v0.m3203m("[Hchat:TextSpeech] 未找到 Activity.dispatchKeyEvent");
                } else {
                    try {
                        c3959f3 = C3744i.f12154b.m7763b(methodFindDeclaredMethod, new C0219e(this, 19));
                    } catch (Throwable th4) {
                        c3959f3 = new C3959f(th4);
                    }
                    Throwable thM8182b3 = C3960g.m8182b(c3959f3);
                    if (thM8182b3 != null) {
                        AbstractC0921a.m2261x("[Hchat:TextSpeech] 音量键 Hook 安装失败: ", thM8182b3.getMessage(), thM8182b3);
                    }
                }
                m7752i(C1085e.class, new C2399h(this, 26));
                break;
            case 8:
                this.f524f = new C3478f(c3742g);
                C3740e.m7759f(12, new C1746e0(this, 12), "fake_wallet_balance", "伪造零钱", null);
                break;
            case 9:
                this.f524f = new C3946b(c3742g);
                C3740e.m7759f(12, new C1746e0(this, 20), "hide_chat_avatar", "隐藏头像", null);
                m7752i(C1085e.class, new C3465a(this, 6));
                break;
            case 10:
                c3742g.getClass();
                C0184c c0184c = new C0184c();
                c0184c.f469a = c3742g;
                c0184c.f470b = AbstractC4302b.m8640c(c3742g.f12143a, "Hchat_hide_chat_menu_config");
                c0184c.f471c = AbstractC2091b.m5168o();
                this.f524f = c0184c;
                C3740e.m7759f(12, new C1746e0(this, 24), "hide_chat_menu", "隐藏长按菜单", null);
                m7752i(C1085e.class, new C3465a(this, 7));
                break;
            default:
                m7752i(C1085e.class, new C0830a(this, 11, c3742g));
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        switch (this.f523e) {
            case 0:
                return "会话时间样式";
            case 1:
                return "消息气泡";
            case 2:
                return "圆角头像";
            case 3:
                return "消息文本颜色";
            case 4:
                return "朋友圈原图上传";
            case 5:
                return "模拟相机扫码";
            case 6:
                return "自动抢红包";
            case 7:
                return "文字转语音播报";
            case 8:
                return "伪造零钱";
            case 9:
                return "隐藏头像";
            case 10:
                return "隐藏长按菜单";
            default:
                return "消息自动转发";
        }
    }
}
