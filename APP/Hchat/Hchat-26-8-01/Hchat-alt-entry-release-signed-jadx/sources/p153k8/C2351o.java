package p153k8;

import android.text.TextUtils;
import okhttp3.HttpUrl;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.hooks.api.model.WeChatPatMsg;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.hooks.api.model.WeChatTransferMsg;

/* JADX INFO: renamed from: k8.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2351o {

    /* JADX INFO: renamed from: a */
    public final String f7713a;

    /* JADX INFO: renamed from: b */
    public final String f7714b;

    /* JADX INFO: renamed from: c */
    public final String f7715c;

    /* JADX INFO: renamed from: d */
    public final String f7716d;

    /* JADX INFO: renamed from: e */
    public final String f7717e;

    /* JADX INFO: renamed from: f */
    public final String f7718f;

    /* JADX INFO: renamed from: g */
    public final String f7719g;

    /* JADX INFO: renamed from: h */
    public final boolean f7720h;

    /* JADX INFO: renamed from: i */
    public final boolean f7721i;

    /* JADX INFO: renamed from: j */
    public final WeChatMessage f7722j;

    /* JADX INFO: renamed from: k */
    public final WeChatMessage f7723k;

    /* JADX INFO: renamed from: l */
    public final String f7724l;

    /* JADX INFO: renamed from: m */
    public final String f7725m;

    /* JADX INFO: renamed from: n */
    public final String f7726n;

    /* JADX INFO: renamed from: o */
    public final long f7727o;

    /* JADX INFO: renamed from: p */
    public final WeChatTransferMsg f7728p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2351o(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z9, boolean z10, WeChatMessage weChatMessage, WeChatMessage weChatMessage2, String str8, String str9, String str10, long j3) {
        this.f7713a = str == null ? HttpUrl.FRAGMENT_ENCODE_SET : str;
        this.f7714b = str2;
        this.f7715c = str3 != null ? str3 : HttpUrl.FRAGMENT_ENCODE_SET;
        this.f7716d = str4 != null ? str4 : HttpUrl.FRAGMENT_ENCODE_SET;
        this.f7717e = str5 != null ? str5 : HttpUrl.FRAGMENT_ENCODE_SET;
        this.f7718f = str6 != null ? str6 : HttpUrl.FRAGMENT_ENCODE_SET;
        this.f7719g = str7 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str7;
        this.f7720h = z9;
        this.f7721i = z10;
        WeChatMessage weChatMessageFromTransient = weChatMessage;
        this.f7722j = weChatMessageFromTransient;
        weChatMessageFromTransient = weChatMessage2 != null ? weChatMessage2 : weChatMessageFromTransient;
        if (weChatMessageFromTransient == null) {
            weChatMessageFromTransient = WeChatMessage.fromTransient(str3, str4, !TextUtils.isEmpty(str5) ? str5 : str6, System.currentTimeMillis(), z10);
        }
        this.f7723k = weChatMessageFromTransient;
        this.f7724l = str8;
        this.f7725m = str9;
        this.f7726n = str10;
        this.f7727o = j3;
        this.f7728p = weChatMessageFromTransient != null ? weChatMessageFromTransient.getTransferMsg() : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m5614a() {
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null ? weChatMessage.getContent() : this.f7717e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final WeChatPatMsg m5615b() {
        if (!m5628o()) {
            return null;
        }
        if (!TextUtils.isEmpty(this.f7724l) || !TextUtils.isEmpty(this.f7725m)) {
            return new WeChatPatMsg(this.f7715c, this.f7724l, this.f7725m, this.f7726n, this.f7727o);
        }
        WeChatMessage weChatMessage = this.f7723k;
        if (weChatMessage != null) {
            return weChatMessage.getPatMsg();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final String m5616c() {
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null ? weChatMessage.getSendTalker() : this.f7716d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m5617d() {
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null ? weChatMessage.getTalker() : this.f7715c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m5618e() {
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isAnnounceAll();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m5619f() {
        if ("app".equals(this.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isApp();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final boolean m5620g() {
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isAtMe();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final boolean m5621h() {
        if ("emoji".equals(this.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isEmoji();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final boolean m5622i() {
        if ("file".equals(this.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isFile();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final boolean m5623j() {
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isGroupChat();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public final boolean m5624k() {
        if (WeChatSnsPost.TYPE_IMAGE.equals(this.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isImage();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public final boolean m5625l() {
        if ("link".equals(this.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isLink();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final boolean m5626m() {
        if ("location".equals(this.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isLocation();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final boolean m5627n() {
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isNotifyAll();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final boolean m5628o() {
        if ("pat".equals(this.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isPat();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final boolean m5629p() {
        if ("quote".equals(this.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isQuote();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final boolean m5630q() {
        if (this.f7721i) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isSend();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final boolean m5631r() {
        if ("share_card".equals(this.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isShareCard();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final boolean m5632s() {
        if ("system".equals(this.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isSystem();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final boolean m5633t() {
        if (WeChatSnsPost.TYPE_VIDEO.equals(this.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isVideo();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final boolean m5634u() {
        if ("voice".equals(this.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isVoice();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final boolean m5635v() {
        if ("voip".equals(this.f7714b)) {
            return true;
        }
        WeChatMessage weChatMessage = this.f7723k;
        return weChatMessage != null && weChatMessage.isVoip();
    }

    public C2351o(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z9, boolean z10, WeChatMessage weChatMessage, WeChatMessage weChatMessage2) {
        this(str, str2, str3, str4, str5, str6, str7, z9, z10, weChatMessage, weChatMessage2, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, 0L);
    }
}
