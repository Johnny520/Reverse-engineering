package p114hd;

import android.content.ContentValues;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import cd.C1517b;
import md.AbstractC5161p;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.loader.api.HookEngine;
import okhttp3.internal.url._UrlKt;
import org.json.JSONObject;
import p053dd.C1951c;
import p053dd.C1952d;
import p068ed.AbstractC2212a;
import p084fd.AbstractC2429i;

/* JADX INFO: renamed from: hd.l */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C3014l extends AbstractC2212a {

    /* JADX INFO: renamed from: e */
    public static Class f7985e;

    /* JADX INFO: renamed from: f */
    public static Class f7986f;

    public C3014l() {
        this.f6040c = "RedPacketHook";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m11114q(InterfaceC5154i interfaceC5154i) {
        if (m7973i()) {
            if (m11116p(interfaceC5154i.getThisObject(), (JSONObject) interfaceC5154i.getArgs()[2])) {
                m11117r(AbstractC5161p.newInstance(f7985e, Integer.valueOf(C1952d.f5435l), Integer.valueOf(C1952d.f5434k), C1952d.f5425b, C1952d.f5426c, null, null, C1952d.f5430g, "v1.0", C1952d.f5432i, _UrlKt.FRAGMENT_ENCODE_SET));
            }
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        f7985e = C1517b.findClass().pkg("com.tencent.mm.plugin.luckymoney.model").usingStrings("/cgi-bin/mmpay-bin/openwxhb").get();
        f7986f = C1517b.findClass().pkg("com.tencent.mm.plugin.luckymoney.model").usingStrings("/cgi-bin/mmpay-bin/receivewxhb").get();
        return f7985e != null;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        HookEngine.hookAfter(AbstractC5161p.findMethodExact(f7986f, "onGYNetEnd", Integer.TYPE, String.class, JSONObject.class), new InterfaceC5156k() { // from class: hd.j
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f7983a.m11114q(interfaceC5154i);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m11115o(ContentValues contentValues) {
        if (m7973i()) {
            try {
                C1951c c1951c = new C1951c(contentValues);
                if (c1951c.isRedPacket()) {
                    String nativeUrl = c1951c.getNativeUrl();
                    Uri uri = Uri.parse(nativeUrl);
                    int i10 = Integer.parseInt(uri.getQueryParameter("msgtype"));
                    int i11 = Integer.parseInt(uri.getQueryParameter("channelid"));
                    String queryParameter = uri.getQueryParameter("sendid");
                    String str = c1951c.talker;
                    String strM7970f = m7970f("redPacket_blacklist_objects", _UrlKt.FRAGMENT_ENCODE_SET);
                    if (!strM7970f.isEmpty()) {
                        for (String str2 : strM7970f.split(",")) {
                            if (str.equals(str2.trim())) {
                                return;
                            }
                        }
                    }
                    Object objNewInstance = AbstractC5161p.newInstance(f7986f, Integer.valueOf(i10), Integer.valueOf(i11), queryParameter, nativeUrl, 1, "v1.0", str);
                    C1952d.m7071a(queryParameter, nativeUrl, str, _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, str, "v1.0", _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET, i11, i10, 1);
                    m11117r(objNewInstance);
                }
            } catch (Throwable th) {
                m7965a("handleDbInsert error", th);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public boolean m11116p(Object obj, JSONObject jSONObject) {
        if (jSONObject != null && obj != null) {
            String strOptString = jSONObject.optString("timingIdentifier");
            if (strOptString.isEmpty()) {
                return false;
            }
            try {
                String str = (String) AbstractC5161p.getObjectField(obj, "m");
                String str2 = (String) AbstractC5161p.getObjectField(obj, "n");
                Integer num = (Integer) AbstractC5161p.getObjectField(obj, "i");
                Integer num2 = (Integer) AbstractC5161p.getObjectField(obj, "h");
                C1952d.f5432i = strOptString;
                C1952d.f5425b = str;
                C1952d.f5426c = str2;
                C1952d.f5434k = num.intValue();
                C1952d.f5435l = num2.intValue();
                C1952d.f5430g = C1952d.f5427d;
                return true;
            } catch (Throwable th) {
                m7965a("handleNetworkResponse error", th);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public final void m11117r(final Object obj) {
        int iM7969e = m7969e("redPacket_delay", 0);
        if (iM7969e > 0) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: hd.k
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC2429i.m8778c(obj);
                }
            }, iM7969e);
        } else {
            AbstractC2429i.m8778c(obj);
        }
    }
}
