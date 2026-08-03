package ua;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import bb.C0240b;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;
import na.C2920h;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p068eh.AbstractC0921a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p126ia.C2026t;
import p136j8.AbstractC2091b;
import p136j8.C2097h;
import p136j8.C2105p;
import p142jg.AbstractC2133a;
import p142jg.AbstractC2136d;
import p153k8.C2343g;
import p153k8.C2351o;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p227p4.C3315t;
import p276sf.C3959f;
import p276sf.C3960g;
import sa.C3949c;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: ua.k */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4300k {

    /* JADX INFO: renamed from: j */
    public static final List f14335j = AbstractC0000a.m101y0("{@转账的人}", "{@sender}", "{@成员}");

    /* JADX INFO: renamed from: a */
    public final Context f14336a;

    /* JADX INFO: renamed from: b */
    public final C2026t f14337b;

    /* JADX INFO: renamed from: d */
    public final C3949c f14339d;

    /* JADX INFO: renamed from: f */
    public final C3315t f14341f;

    /* JADX INFO: renamed from: g */
    public TextToSpeech f14342g;

    /* JADX INFO: renamed from: h */
    public boolean f14343h;

    /* JADX INFO: renamed from: c */
    public final Handler f14338c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e */
    public final ConcurrentHashMap.KeySetView f14340e = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: i */
    public final ArrayDeque f14344i = new ArrayDeque();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4300k(Context context, C2026t c2026t) {
        this.f14336a = context;
        this.f14337b = c2026t;
        this.f14339d = new C3949c(context, "[Hchat:TransferNotifier]", "Hchat_transfer_notify_manual_v1", "Hchat 自动收款提醒");
        this.f14341f = new C3315t(context);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0027 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m8634a(String str, C2351o c2351o, C4293d c4293d, long j3) {
        Object c3959f;
        Object c3959f2;
        String str2 = c2351o.f7715c;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        String str4 = c4293d.f14271c;
        if (AbstractC3149m.m6721t0(str4)) {
            str4 = c2351o.f7716d;
        }
        str2.getClass();
        try {
            WeChatApis.contact().getClass();
            C1368i c1368i = WeChatApis.contactApi;
            String strM3729r = c1368i != null ? c1368i.m3729r(str2) : null;
            if (strM3729r == null) {
                strM3729r = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            boolean zM6721t0 = AbstractC3149m.m6721t0(strM3729r);
            c3959f = strM3729r;
            if (zM6721t0) {
                c3959f = str2;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        boolean z9 = c3959f instanceof C3959f;
        Object obj = c3959f;
        if (z9) {
            obj = str2;
        }
        String str5 = (String) obj;
        str2.getClass();
        str4.getClass();
        try {
            WeChatApis.contact().getClass();
            C1368i c1368i2 = WeChatApis.contactApi;
            if (AbstractC3156t.m6733W(str2, "@chatroom", false)) {
                c3959f2 = c1368i2 != null ? c1368i2.m3731t(str2, str4) : null;
            } else if (c1368i2 != null) {
                c3959f2 = c1368i2.m3729r(str4);
            }
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        String str6 = (String) (c3959f2 instanceof C3959f ? null : c3959f2);
        if (str6 != null) {
            str3 = str6;
        }
        if (!AbstractC3149m.m6721t0(str3)) {
            str4 = str3;
        }
        String str7 = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(c4293d.f14275g)}, 1));
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "{amount}", str7, false), "{金额}", str7, false), "{talker}", str5, false), "{会话}", str5, false), "{sender}", str4, false), "{成员}", str4, false), "{@sender}", AbstractC0921a.m2251n("@", str4, "\u2005"), false), "{@成员}", AbstractC0921a.m2251n("@", str4, "\u2005"), false), "{@转账的人}", AbstractC0921a.m2251n("@", str4, "\u2005"), false), "{time}", AbstractC0000a.m23M(j3, this.f14341f.m7031y("transfer_time_format", "yyyy-MM-dd HH:mm:ss")), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final void m8635b(final String str, final String str2, final C2351o c2351o, final C4293d c4293d, final List list, final long j3, final int i9) {
        if (AbstractC3149m.m6721t0(str) || i9 < 0 || i9 >= list.size()) {
            return;
        }
        final C2920h c2920h = (C2920h) list.get(i9);
        long jMo5362e = c2920h.f9491d;
        if (jMo5362e < 0) {
            jMo5362e = 0;
        }
        if (c2920h.f9492e) {
            jMo5362e += AbstractC2136d.f7122g.mo5362e(0L, 2001L);
        }
        this.f14338c.postDelayed(new Runnable() { // from class: ua.j
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.lang.Runnable
            public final void run() {
                Object c3959f;
                C4300k c4300k = this.f14326g;
                String str3 = str;
                String str4 = str2;
                C2351o c2351o2 = c2351o;
                C4293d c4293d2 = c4293d;
                long j4 = j3;
                try {
                    c3959f = Boolean.valueOf(c4300k.m8636c(str3, str4, c2351o2, c4293d2, c2920h, j4));
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    c4300k.f14337b.invoke("自动收款回复失败", thM8182b);
                }
                c4300k.m8635b(str3, str4, c2351o2, c4293d2, list, j4, i9 + 1);
            }
        }, jMo5362e < 0 ? 0L : jMo5362e);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0148 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0149 A[RETURN] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8636c(String str, String str2, C2351o c2351o, C4293d c4293d, C2920h c2920h, long j3) {
        String string;
        boolean z9;
        C0240b c0240b;
        C2097h c2097h;
        String str3 = c2920h.f9490c;
        int i9 = c2920h.f9489b;
        List listM6691F0 = AbstractC3149m.m6691F0(str3, new char[]{'|'}, 6);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
        Iterator it = listM6691F0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            string = AbstractC3149m.m6703R0(str3).toString();
        } else {
            AbstractC2133a abstractC2133a = AbstractC2136d.f7122g;
            string = (String) arrayList2.get(AbstractC2136d.f7122g.m5360g(arrayList2.size()));
        }
        String str4 = string;
        String strM8634a = (i9 == 1 || i9 == 2 || i9 == 8) ? m8634a(str4, c2351o, c4293d, j3) : str4;
        List list = f14335j;
        if (i9 == 2) {
            z9 = true;
            break;
        }
        if (list == null || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (AbstractC3149m.m6709h0(str4, (String) it2.next(), false)) {
                    z9 = true;
                    break;
                }
            }
        }
        z9 = false;
        Iterator it3 = list.iterator();
        String strM6737a0 = strM8634a;
        while (it3.hasNext()) {
            strM6737a0 = AbstractC3156t.m6737a0(strM6737a0, (String) it3.next(), HttpUrl.FRAGMENT_ENCODE_SET, false);
        }
        String string2 = AbstractC3149m.m6703R0(strM6737a0).toString();
        C2343g c2343gM6844q = AbstractC3199a.m6844q();
        C2105p c2105pMedia = WeChatApis.media();
        switch (i9) {
            case 1:
            case 2:
                return !z9 || AbstractC3149m.m6721t0(str2) ? !(c2343gM6844q == null || !c2343gM6844q.m5601x(str, string2)) : !(c2343gM6844q == null || !c2343gM6844q.m5602y(str, string2, AbstractC0000a.m99x0(str2)));
            case 3:
                if (c2105pMedia == null || !c2105pMedia.m5301a(str, str4)) {
                }
                break;
            case 4:
                if (c2105pMedia == null || !c2105pMedia.f7036b.m5324t(str, str4)) {
                }
                break;
            case 5:
                if (c2105pMedia == null || (c0240b = c2105pMedia.f7037c) == null || !c0240b.m972q(str, str4)) {
                }
                break;
            case 6:
                if (c2105pMedia == null || !c2105pMedia.f7038d.m5219v(str, str4)) {
                }
                break;
            case 7:
                if (c2105pMedia == null || !c2105pMedia.f7039e.m588T(str, str4, HttpUrl.FRAGMENT_ENCODE_SET)) {
                }
                break;
            case 8:
                if (c2343gM6844q == null || !c2343gM6844q.m5603z(str, strM8634a)) {
                }
                break;
            case 9:
                if (c2105pMedia == null || (c2097h = c2105pMedia.f7040f) == null || !c2097h.m5236A(str, str4)) {
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final void m8637d(String str) {
        Object c3959f;
        try {
            TextToSpeech textToSpeech = this.f14342g;
            if (textToSpeech != null) {
                c3959f = Integer.valueOf(textToSpeech.speak(str, 1, new Bundle(), "hchat_transfer_" + System.currentTimeMillis()));
            } else {
                c3959f = null;
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            this.f14337b.invoke("自动收款播报失败", thM8182b);
        }
    }
}
