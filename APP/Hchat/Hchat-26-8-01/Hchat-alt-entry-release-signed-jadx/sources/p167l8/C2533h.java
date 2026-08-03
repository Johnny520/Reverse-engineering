package p167l8;

import okhttp3.HttpUrl;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.hooks.api.model.WeChatSnsPrepareResult;
import tf.C4173t;

/* JADX INFO: renamed from: l8.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2533h {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static WeChatSnsPrepareResult m5951a(String str, String str2) {
        str.getClass();
        str2.getClass();
        C4173t c4173t = C4173t.f13710g;
        return new WeChatSnsPrepareResult(false, str2, str, HttpUrl.FRAGMENT_ENCODE_SET, WeChatSnsPost.TYPE_UNKNOWN, c4173t, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, c4173t);
    }
}
