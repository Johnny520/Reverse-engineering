package p010aa;

import android.os.Handler;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Set;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p136j8.AbstractC2091b;
import p167l8.C2530e;
import p258r8.AbstractC3736a;
import p258r8.C3740e;
import p258r8.C3742g;
import p258r8.EnumC3738c;

/* JADX INFO: renamed from: aa.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0037e extends AbstractC3736a {

    /* JADX INFO: renamed from: e */
    public volatile boolean f130e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m295k(C0033a c0033a, LinkedHashMap linkedHashMap) {
        Set set = c0033a.f109g;
        if (set.isEmpty()) {
            return c0033a.f110h;
        }
        Set set2 = set;
        if ((set2 instanceof Collection) && set2.isEmpty()) {
            return false;
        }
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            if (linkedHashMap.containsKey((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x004d. Please report as an issue. */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0299  */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m296l(boolean z9, Set set, String str, C2530e c2530e, WeChatMessage weChatMessage) {
        boolean zIsSystem;
        String str2 = c2530e.f8178e;
        if (z9) {
            return !weChatMessage.isText() || AbstractC0038f.m302c(str2, str);
        }
        if (!weChatMessage.isText() || AbstractC0038f.m302c(str2, str)) {
            Set<String> set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                for (String str3 : set2) {
                    Locale locale = Locale.US;
                    String strM5165l = AbstractC2091b.m5165l(locale, str3, locale);
                    switch (strM5165l.hashCode()) {
                        case -1708154212:
                            if (!strM5165l.equals("mini_program")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isMiniProgram();
                            break;
                        case -1411060288:
                            if (strM5165l.equals("appmsg")) {
                                int i9 = weChatMessage.type;
                                if (i9 > 0) {
                                    int i10 = i9 & 255;
                                    int i11 = 65535 & i9;
                                    if ((i9 >>> 16) != 0) {
                                        if (i11 == 10000 || i11 == 10002) {
                                            i9 = i11;
                                        } else if (i10 != 0 && i11 == i10) {
                                            i9 = i10;
                                        }
                                    }
                                }
                                if (i9 != 49) {
                                    zIsSystem = false;
                                }
                                zIsSystem = true;
                            } else {
                                zIsSystem = false;
                            }
                            break;
                        case -1135566263:
                            if (!strM5165l.equals("视频/语音聊天")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVoip();
                            break;
                        case -1046338480:
                            if (!strM5165l.equals("视频语音聊天")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVoip();
                            break;
                        case -887328209:
                            if (!strM5165l.equals("system")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isSystem();
                            break;
                        case -828210691:
                            if (strM5165l.equals("文章/链接")) {
                                if (!weChatMessage.isLink() && !weChatMessage.isFile() && !weChatMessage.isNote()) {
                                    zIsSystem = false;
                                }
                                zIsSystem = true;
                            } else {
                                zIsSystem = false;
                            }
                            break;
                        case -707675571:
                            if (!strM5165l.equals("miniprogram")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isMiniProgram();
                            break;
                        case -601741005:
                            if (!strM5165l.equals("视频号链接")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVideoNumberVideo();
                            break;
                        case -137702515:
                            if (!strM5165l.equals("video_number")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVideoNumberVideo();
                            break;
                        case 96801:
                            if (!strM5165l.equals("app")) {
                                zIsSystem = false;
                            }
                            break;
                        case 110755:
                            if (!strM5165l.equals("pat")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isPat();
                            break;
                        case 661953:
                            if (!strM5165l.equals("位置")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isLocation();
                            break;
                        case 696282:
                            if (!strM5165l.equals("名片")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isShareCard();
                            break;
                        case 714190:
                            if (!strM5165l.equals("地图")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isLocation();
                            break;
                        case 719625:
                            if (!strM5165l.equals("图片")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isImage();
                            break;
                        case 825935:
                            if (!strM5165l.equals("文件")) {
                                zIsSystem = false;
                            }
                            break;
                        case 829104:
                            if (!strM5165l.equals("文字")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isText();
                            break;
                        case 832133:
                            if (!strM5165l.equals("文本")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isText();
                            break;
                        case 837177:
                            if (!strM5165l.equals("文章")) {
                                zIsSystem = false;
                            }
                            break;
                        case 1024324:
                            if (!strM5165l.equals("系统")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isSystem();
                            break;
                        case 1026211:
                            if (!strM5165l.equals("红包")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isRedPacket();
                            break;
                        case 1107293:
                            if (!strM5165l.equals("表情")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isEmoji();
                            break;
                        case 1132427:
                            if (!strM5165l.equals("视频")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVideo();
                            break;
                        case 1149350:
                            if (!strM5165l.equals("语音")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVoice();
                            break;
                        case 1174330:
                            if (!strM5165l.equals("转账")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isTransfer();
                            break;
                        case 1179395:
                            if (!strM5165l.equals("通话")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVoip();
                            break;
                        case 1207911:
                            if (!strM5165l.equals("链接")) {
                                zIsSystem = false;
                            }
                            break;
                        case 1225917:
                            if (!strM5165l.equals("音乐")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isMusic();
                            break;
                        case 3046160:
                            if (!strM5165l.equals(WeChatSnsPost.TYPE_CARD)) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isShareCard();
                            break;
                        case 3321850:
                            if (!strM5165l.equals("link")) {
                                zIsSystem = false;
                            }
                            break;
                        case 3556653:
                            if (!strM5165l.equals(WeChatSnsPost.TYPE_TEXT)) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isText();
                            break;
                        case 3625376:
                            if (!strM5165l.equals("voip")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVoip();
                            break;
                        case 23640627:
                            if (!strM5165l.equals("小程序")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isMiniProgram();
                            break;
                        case 23780314:
                            if (!strM5165l.equals("小视频")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVideo();
                            break;
                        case 24950874:
                            if (!strM5165l.equals("拍一拍")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isPat();
                            break;
                        case 35126732:
                            if (!strM5165l.equals("视频号")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVideoNumberVideo();
                            break;
                        case 96632902:
                            if (!strM5165l.equals("emoji")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isEmoji();
                            break;
                        case 100313435:
                            if (!strM5165l.equals(WeChatSnsPost.TYPE_IMAGE)) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isImage();
                            break;
                        case 104263205:
                            if (!strM5165l.equals("music")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isMusic();
                            break;
                        case 112202875:
                            if (!strM5165l.equals(WeChatSnsPost.TYPE_VIDEO)) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVideo();
                            break;
                        case 112386354:
                            if (!strM5165l.equals("voice")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVoice();
                            break;
                        case 660325424:
                            if (!strM5165l.equals("动画表情")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isEmoji();
                            break;
                        case 686998543:
                            if (!strM5165l.equals("地图位置")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isLocation();
                            break;
                        case 1089303274:
                            if (!strM5165l.equals("视频聊天")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVoip();
                            break;
                        case 1102969846:
                            if (!strM5165l.equals("red_packet")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isRedPacket();
                            break;
                        case 1105566277:
                            if (!strM5165l.equals("语音聊天")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isVoip();
                            break;
                        case 1280882667:
                            if (!strM5165l.equals("transfer")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isTransfer();
                            break;
                        case 1893962841:
                            if (!strM5165l.equals("redpacket")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isRedPacket();
                            break;
                        case 1901043637:
                            if (!strM5165l.equals("location")) {
                                zIsSystem = false;
                            }
                            zIsSystem = weChatMessage.isLocation();
                            break;
                        default:
                            zIsSystem = false;
                            break;
                    }
                    if (zIsSystem) {
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    /* JADX INFO: renamed from: a */
    public final String mo297a() {
        return "message_block";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: f */
    public final void mo298f(C3742g c3742g) {
        c3742g.getClass();
        m7751h(new C0039g("message_block", "屏蔽消息", "拦截指定成员或会话的消息，不显示也不弹通知", "practical"));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.AbstractC3736a
    /* JADX INFO: renamed from: g */
    public final void mo299g(C3742g c3742g) {
        c3742g.getClass();
        Handler handler = C3740e.f12138a;
        C3740e.m7759f(8, new C0035c(this, 0, c3742g), "message_block", "屏蔽消息", EnumC3738c.WARMUP);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p258r8.InterfaceC3741f
    public final String name() {
        return "屏蔽消息";
    }
}
