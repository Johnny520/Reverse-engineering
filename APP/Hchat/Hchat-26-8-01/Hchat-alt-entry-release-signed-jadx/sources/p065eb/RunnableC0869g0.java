package p065eb;

import android.view.View;
import okhttp3.HttpUrl;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p136j8.C2105p;
import p211o9.C3103p;
import p242q8.C3458m;

/* JADX INFO: renamed from: eb.g0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0869g0 implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2668g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f2669h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ String f2670i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0869g0(String str, String str2) {
        this.f2669h = str;
        this.f2670i = str2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f2668g) {
            case 0:
                String str = this.f2669h;
                String str2 = this.f2670i;
                C3458m c3458mChatPage = WeChatApis.chatPage();
                String strM7258a = c3458mChatPage != null ? c3458mChatPage.m7258a() : null;
                if (strM7258a == null) {
                    strM7258a = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (strM7258a.equals(str) && (obj = C0881m0.f2716j.get()) != null) {
                    C0881m0 c0881m0 = C0881m0.f2707a;
                    Object objM2195d = C0881m0.m2195d(obj);
                    if (objM2195d != null) {
                        View view = objM2195d instanceof View ? (View) objM2195d : null;
                        if (view == null) {
                            View view2 = obj instanceof View ? (View) obj : null;
                            if (view2 != null) {
                                view = view2;
                            }
                        }
                        if (view.isAttachedToWindow() && C0881m0.m2199i(obj).length() <= 0) {
                            C0881m0.m2202l(objM2195d, str2);
                            break;
                        }
                    }
                }
                break;
            default:
                String str3 = this.f2669h;
                String str4 = this.f2670i;
                try {
                    C2105p c2105pMedia = WeChatApis.media();
                    if (c2105pMedia != null) {
                        c2105pMedia.f7036b.m5324t(str3, str4);
                    }
                } catch (Throwable unused) {
                    return;
                }
                break;
        }
    }

    public /* synthetic */ RunnableC0869g0(C3103p c3103p, String str, String str2) {
        this.f2669h = str;
        this.f2670i = str2;
    }
}
