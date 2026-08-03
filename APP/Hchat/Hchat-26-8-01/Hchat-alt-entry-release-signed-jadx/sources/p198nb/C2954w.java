package p198nb;

import ac.RunnableC0059l;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.text.TextUtils;
import bsh.org.objectweb.asm.Opcodes;
import ca.RunnableC0531r;
import gg.AbstractC1416l;
import gg.C1425u;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.HttpUrl;
import okio.C3193a;
import p000a.AbstractC0000a;
import p014b.C0126e;
import p024b9.SharedPreferencesOnSharedPreferenceChangeListenerC0216b;
import p025bc.AbstractC0255e;
import p063e9.RunnableC0835f;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p099h.Hchat.utils.KavaReflector;
import p136j8.AbstractC2091b;
import p136j8.AbstractC2094e;
import p136j8.C2105p;
import p136j8.C2110u;
import p136j8.C2114y;
import p136j8.InterfaceC2112w;
import p153k8.C2355s;
import p167l8.C2529d;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p300ub.AbstractC4302b;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: nb.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2954w {

    /* JADX INFO: renamed from: A */
    public static final C3147k f9673A = new C3147k("^([A-Za-z0-9_@.\\-]+?):\\n");

    /* JADX INFO: renamed from: a */
    public final Context f9674a;

    /* JADX INFO: renamed from: b */
    public final Handler f9675b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque f9676c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap.KeySetView f9677d;

    /* JADX INFO: renamed from: e */
    public final RunnableC2932e f9678e;

    /* JADX INFO: renamed from: f */
    public TextToSpeech f9679f;

    /* JADX INFO: renamed from: g */
    public boolean f9680g;

    /* JADX INFO: renamed from: h */
    public boolean f9681h;

    /* JADX INFO: renamed from: i */
    public long f9682i;

    /* JADX INFO: renamed from: j */
    public RunnableC0531r f9683j;

    /* JADX INFO: renamed from: k */
    public int f9684k;

    /* JADX INFO: renamed from: l */
    public String f9685l;

    /* JADX INFO: renamed from: m */
    public List f9686m;

    /* JADX INFO: renamed from: n */
    public int f9687n;

    /* JADX INFO: renamed from: o */
    public AbstractC2943l f9688o;

    /* JADX INFO: renamed from: p */
    public String f9689p;

    /* JADX INFO: renamed from: q */
    public int f9690q;

    /* JADX INFO: renamed from: r */
    public boolean f9691r;

    /* JADX INFO: renamed from: s */
    public long f9692s;

    /* JADX INFO: renamed from: t */
    public int f9693t;

    /* JADX INFO: renamed from: u */
    public MediaSession f9694u;

    /* JADX INFO: renamed from: v */
    public C2948q f9695v;

    /* JADX INFO: renamed from: w */
    public C2952u f9696w;

    /* JADX INFO: renamed from: x */
    public Integer f9697x;

    /* JADX INFO: renamed from: y */
    public Runnable f9698y;

    /* JADX INFO: renamed from: z */
    public volatile long f9699z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2954w(Context context) {
        Context applicationContext = context.getApplicationContext();
        context = applicationContext != null ? applicationContext : context;
        this.f9674a = context;
        SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c(context, "Hchat_text_speech_config");
        this.f9675b = new Handler(Looper.getMainLooper());
        this.f9676c = new ArrayDeque();
        this.f9677d = ConcurrentHashMap.newKeySet();
        this.f9678e = new RunnableC2932e(this, 0);
        SharedPreferencesOnSharedPreferenceChangeListenerC0216b sharedPreferencesOnSharedPreferenceChangeListenerC0216b = new SharedPreferencesOnSharedPreferenceChangeListenerC0216b(this, 8);
        this.f9685l = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9686m = C4173t.f13710g;
        this.f9689p = HttpUrl.FRAGMENT_ENCODE_SET;
        sharedPreferencesM8640c.registerOnSharedPreferenceChangeListener(sharedPreferencesOnSharedPreferenceChangeListenerC0216b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static List m6347C(WeChatMessage weChatMessage) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String str = weChatMessage.imagePath;
        if (AbstractC3149m.m6721t0(str)) {
            str = null;
        }
        if (str != null) {
            linkedHashSet.add(str);
        }
        String strBodyContent = weChatMessage.bodyContent();
        List listM6691F0 = AbstractC3149m.m6691F0(AbstractC3149m.m6706U0(strBodyContent, '\n', '\r'), new char[]{':'}, 6);
        if (listM6691F0.size() >= 3 && !AbstractC3149m.m6710i0(strBodyContent, '<')) {
            String string = AbstractC3149m.m6703R0((String) (listM6691F0.size() == 4 ? listM6691F0.get(1) : listM6691F0.get(0))).toString();
            String str2 = AbstractC3149m.m6721t0(string) ? null : string;
            if (str2 != null) {
                linkedHashSet.add(str2);
            }
        }
        WeChatMessage.Companion.getClass();
        for (Object obj : AbstractC0000a.m101y0(C2529d.m5947m(strBodyContent, "filename"), C2529d.m5947m(strBodyContent, "voiceurl"), C2529d.m5949o(strBodyContent, "filename"), C2529d.m5949o(strBodyContent, "voiceurl"))) {
            if (!AbstractC3149m.m6721t0((String) obj)) {
                linkedHashSet.add(obj);
            }
        }
        return AbstractC4166m.m8407P1(linkedHashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m6348a(C2954w c2954w, String str) {
        if (str.length() != 0 && str.equals(c2954w.f9689p) && !c2954w.f9691r && (c2954w.f9688o instanceof C2945n)) {
            c2954w.f9689p = HttpUrl.FRAGMENT_ENCODE_SET;
            c2954w.f9690q = 0;
            c2954w.f9688o = null;
            c2954w.m6366n();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m6349b(C2954w c2954w, C2946o c2946o, String str) {
        if (c2954w.f9688o != c2946o) {
            return;
        }
        c2954w.m6362g();
        if (str != null && !AbstractC3149m.m6721t0(str)) {
            AbstractC1184v0.m3203m("[Hchat:TextSpeech] 原语音播放失败: ".concat(str));
        }
        c2954w.f9688o = null;
        c2954w.f9691r = false;
        c2954w.m6366n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static void m6350d(C2942k c2942k, String str, WeChatMessage weChatMessage) {
        if (weChatMessage == null) {
            return;
        }
        for (String str2 : m6347C(weChatMessage)) {
            LinkedHashMap linkedHashMap = c2942k.f9653g;
            if (linkedHashMap.get(str2) == null || AbstractC1416l.m3825a(linkedHashMap.get(str2), "initial")) {
                linkedHashMap.put(str2, str);
            }
        }
        String strBodyContent = weChatMessage.bodyContent();
        if (AbstractC3149m.m6721t0(strBodyContent)) {
            strBodyContent = null;
        }
        if (strBodyContent != null) {
            c2942k.f9654h.add(strBodyContent);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m6351h(String str) {
        if (AbstractC3149m.m6721t0(str)) {
            return "empty";
        }
        String strReplace = str.replace('\n', ' ');
        strReplace.getClass();
        String strReplace2 = strReplace.replace('\r', ' ');
        strReplace2.getClass();
        return AbstractC3149m.m6701P0(Opcodes.IF_ICMPNE, strReplace2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m6352k(C2957z c2957z) {
        if (!c2957z.m6377b("text_speech_quiet_enable")) {
            return false;
        }
        int iM6353l = m6353l(c2957z.m6379d("text_speech_quiet_start", "23:00"));
        int iM6353l2 = m6353l(c2957z.m6379d("text_speech_quiet_end", "08:00"));
        if (iM6353l < 0 || iM6353l2 < 0) {
            return false;
        }
        if (iM6353l == iM6353l2) {
            return true;
        }
        Calendar calendar = Calendar.getInstance();
        int i9 = calendar.get(12) + (calendar.get(11) * 60);
        return iM6353l < iM6353l2 ? iM6353l <= i9 && i9 < iM6353l2 : i9 >= iM6353l || i9 < iM6353l2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static int m6353l(String str) {
        Integer numM6741e0;
        Integer numM6741e02;
        List listM6692G0 = AbstractC3149m.m6692G0(AbstractC3149m.m6703R0(str).toString(), new String[]{":"});
        String str2 = (String) AbstractC4166m.m8425w1(0, listM6692G0);
        if (str2 == null || (numM6741e0 = AbstractC3156t.m6741e0(10, str2)) == null) {
            return -1;
        }
        int iIntValue = numM6741e0.intValue();
        String str3 = (String) AbstractC4166m.m8425w1(1, listM6692G0);
        if (str3 == null || (numM6741e02 = AbstractC3156t.m6741e0(10, str3)) == null) {
            return -1;
        }
        int iIntValue2 = numM6741e02.intValue();
        if (iIntValue < 0 || iIntValue >= 24 || iIntValue2 < 0 || iIntValue2 >= 60) {
            return -1;
        }
        return (iIntValue * 60) + iIntValue2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2941j m6354q(C2942k c2942k, C2114y c2114y) {
        LinkedHashMap linkedHashMap = c2942k.f9653g;
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Set setEntrySet = linkedHashMap.entrySet();
        setEntrySet.getClass();
        Iterator it = AbstractC4166m.m8402K1(setEntrySet, new C2953v()).iterator();
        while (true) {
            if (!it.hasNext()) {
                return new C2941j(null, AbstractC0921a.m2251n("candidates=[", AbstractC4166m.m8392A1(arrayList, ";", null, null, null, 62), "]"));
            }
            Object next = it.next();
            next.getClass();
            Map.Entry entry = (Map.Entry) next;
            Object key = entry.getKey();
            key.getClass();
            String str = (String) key;
            Object value = entry.getValue();
            value.getClass();
            String str2 = (String) value;
            File file = new File(str);
            if (file.isFile() && file.length() > 0) {
                return new C2941j(m6356s(file, str, c2942k), HttpUrl.FRAGMENT_ENCODE_SET);
            }
            String strM5321q = c2114y.m5321q(str);
            strM5321q.getClass();
            String str3 = !AbstractC3149m.m6721t0(strM5321q) ? strM5321q : null;
            File file2 = str3 != null ? new File(str3) : null;
            if (file2 != null && file2.isFile() && file2.length() > 0) {
                return new C2941j(m6356s(file2, str, c2942k), HttpUrl.FRAGMENT_ENCODE_SET);
            }
            String strM6351h = m6351h(str);
            String str4 = "ready";
            String str5 = !file.isFile() ? "missing" : file.length() > 0 ? "ready" : "empty";
            String strM6351h2 = m6351h(strM5321q);
            if (file2 != null) {
                if (!file2.isFile()) {
                    str4 = "missing";
                } else if (file2.length() <= 0) {
                    str4 = "empty";
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(":");
            sb2.append(strM6351h);
            sb2.append("(direct=");
            sb2.append(str5);
            AbstractC2091b.m5173t(sb2, ",resolved=", strM6351h2, ":", str4);
            sb2.append(")");
            arrayList.add(sb2.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2944m m6355r(C2942k c2942k, int i9) {
        C2114y c2114y;
        Object objValueOf;
        Object objValueOf2;
        C2105p c2105pMedia = WeChatApis.media();
        WeChatMessage weChatMessageM5662d = null;
        if (c2105pMedia == null || (c2114y = c2105pMedia.f7036b) == null) {
            c2942k.f9656j = "voiceApi=false";
            return null;
        }
        C2941j c2941jM6354q = m6354q(c2942k, c2114y);
        C2944m c2944m = c2941jM6354q.f9645a;
        if (c2944m != null) {
            return c2944m;
        }
        boolean z9 = i9 + 1 >= 120;
        boolean z10 = i9 == 0 || i9 % 4 == 0 || z9;
        if (z10) {
            C2355s c2355sMessageStore = WeChatApis.messageStore();
            long j3 = c2942k.f9649c;
            WeChatMessage weChatMessageM5661c = (j3 <= 0 || c2355sMessageStore == null) ? null : c2355sMessageStore.m5661c(j3);
            if (weChatMessageM5661c == null) {
                long j4 = c2942k.f9650d;
                WeChatMessage weChatMessageM5663e = (j4 <= 0 || c2355sMessageStore == null) ? null : c2355sMessageStore.m5663e(j4, c2942k.f9648b);
                if (z9) {
                    long j5 = c2942k.f9650d;
                    if (j5 > 0 && c2355sMessageStore != null) {
                        weChatMessageM5662d = c2355sMessageStore.m5662d(j5);
                    }
                }
                m6350d(c2942k, "msgId", weChatMessageM5661c);
                m6350d(c2942k, "talkerSvrId", weChatMessageM5663e);
                m6350d(c2942k, "globalSvrId", weChatMessageM5662d);
                boolean z11 = c2355sMessageStore != null && c2355sMessageStore.m5665h();
                boolean z12 = c2942k.f9651e != null;
                Object objValueOf3 = "skip";
                if (c2942k.f9649c > 0) {
                    objValueOf = Boolean.valueOf(weChatMessageM5661c != null);
                } else {
                    objValueOf = "skip";
                }
                if (weChatMessageM5661c != null || c2942k.f9650d <= 0) {
                    objValueOf2 = "skip";
                } else {
                    objValueOf2 = Boolean.valueOf(weChatMessageM5663e != null);
                }
                if (z9 && c2942k.f9650d > 0) {
                    objValueOf3 = Boolean.valueOf(weChatMessageM5662d != null);
                }
                c2942k.f9655i = "lookups=[store=" + z11 + ",initial=" + z12 + ",msgId=" + objValueOf + ",talkerSvrId=" + objValueOf2 + ",globalSvrId=" + objValueOf3 + "]";
            }
        }
        if (z10) {
            c2941jM6354q = m6354q(c2942k, c2114y);
        }
        c2942k.f9656j = AbstractC0255e.m1021j("voiceApi=true ", c2942k.f9655i, " ", c2941jM6354q.f9646b);
        return c2941jM6354q.f9645a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static C2944m m6356s(File file, String str, C2942k c2942k) {
        ConcurrentHashMap concurrentHashMap = AbstractC2094e.f6999a;
        int iM5193d = AbstractC2094e.m5193d(null, str, c2942k.f9649c, AbstractC4166m.m8407P1(c2942k.f9654h), 60000);
        if (iM5193d < 1000) {
            iM5193d = 1000;
        }
        String absolutePath = file.getAbsolutePath();
        absolutePath.getClass();
        return new C2944m(absolutePath, iM5193d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public final boolean m6357A() {
        Object c3959f;
        TextToSpeech textToSpeech = this.f9679f;
        if (textToSpeech == null) {
            return false;
        }
        AbstractC2943l abstractC2943l = this.f9688o;
        C2945n c2945n = abstractC2943l instanceof C2945n ? (C2945n) abstractC2943l : null;
        if (c2945n == null) {
            return false;
        }
        String str = c2945n.f9659a;
        m6359c();
        int iM7909r = AbstractC3754e0.m7909r(c2945n.f9660b, 0, str.length());
        String strSubstring = str.substring(iM7909r);
        if (strSubstring.length() == 0) {
            return false;
        }
        this.f9690q = iM7909r;
        long j3 = this.f9692s + 1;
        this.f9692s = j3;
        String strM1018g = AbstractC0255e.m1018g(j3, "hchat_text_speech_");
        this.f9689p = strM1018g;
        try {
            Bundle bundle = new Bundle();
            bundle.putString("streamType", "3");
            c3959f = Integer.valueOf(textToSpeech.speak(strSubstring, 0, bundle, strM1018g));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC1184v0.m3204n("[Hchat:TextSpeech] 播报失败: " + thM8182b.getMessage(), thM8182b);
            c3959f = -1;
        }
        int iIntValue = ((Number) c3959f).intValue();
        if (iIntValue == -1) {
            this.f9689p = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        return iIntValue != -1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public final void m6358B() {
        int i9 = this.f9691r ? 6 : 3;
        try {
            MediaSession mediaSession = this.f9694u;
            if (mediaSession != null) {
                mediaSession.setPlaybackState(new PlaybackState.Builder().setActions(550L).setState(i9, -1L, this.f9691r ? 0.0f : 1.0f).build());
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m6359c() {
        Object c3959f;
        Object c3959f2;
        if (!m6374y().m6377b("text_speech_volume_control")) {
            m6367o();
            return;
        }
        C2952u c2952u = this.f9696w;
        Context context = this.f9674a;
        if (c2952u == null) {
            C2952u c2952u2 = new C2952u(this, 0);
            try {
                IntentFilter intentFilter = new IntentFilter("android.media.VOLUME_CHANGED_ACTION");
                if (Build.VERSION.SDK_INT >= 33) {
                    context.registerReceiver(c2952u2, intentFilter, 2);
                } else {
                    context.registerReceiver(c2952u2, intentFilter);
                }
                c3959f2 = Boolean.TRUE;
            } catch (Throwable th2) {
                c3959f2 = new C3959f(th2);
            }
            Throwable thM8182b = C3960g.m8182b(c3959f2);
            if (thM8182b != null) {
                AbstractC0921a.m2261x("[Hchat:TextSpeech] 后台音量变化监听初始化失败: ", thM8182b.getMessage(), thM8182b);
                c3959f2 = Boolean.FALSE;
            }
            if (((Boolean) c3959f2).booleanValue()) {
                this.f9696w = c2952u2;
            }
        }
        if (this.f9694u == null) {
            Object systemService = context.getSystemService("audio");
            Object obj = null;
            AudioManager audioManager = systemService instanceof AudioManager ? (AudioManager) systemService : null;
            if (audioManager == null) {
                return;
            }
            int streamMaxVolume = audioManager.getStreamMaxVolume(3);
            if (streamMaxVolume < 1) {
                streamMaxVolume = 1;
            }
            C2948q c2948q = new C2948q(streamMaxVolume, AbstractC3754e0.m7909r(audioManager.getStreamVolume(3), 0, streamMaxVolume), this);
            this.f9695v = c2948q;
            try {
                MediaSession mediaSession = new MediaSession(context, "HchatTextSpeech");
                mediaSession.setFlags(3);
                mediaSession.setCallback(new C2947p(), this.f9675b);
                mediaSession.setPlaybackToRemote(c2948q);
                c3959f = mediaSession;
            } catch (Throwable th3) {
                c3959f = new C3959f(th3);
            }
            Throwable thM8182b2 = C3960g.m8182b(c3959f);
            if (thM8182b2 == null) {
                obj = c3959f;
            } else {
                this.f9695v = null;
                AbstractC0921a.m2261x("[Hchat:TextSpeech] 后台音量控制初始化失败: ", thM8182b2.getMessage(), thM8182b2);
            }
            this.f9694u = (MediaSession) obj;
        }
        m6358B();
        MediaSession mediaSession2 = this.f9694u;
        if (mediaSession2 != null) {
            mediaSession2.setActive(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final boolean m6360e() {
        if (!AbstractC3149m.m6721t0(this.f9685l) || this.f9687n + 1 >= this.f9686m.size()) {
            return false;
        }
        this.f9687n++;
        this.f9684k = 0;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final boolean m6361f(C2942k c2942k, long j3) {
        boolean z9 = false;
        if (j3 == this.f9699z && this.f9677d.contains(c2942k.f9647a)) {
            C2957z c2957zM6374y = m6374y();
            if (c2957zM6374y.m6377b("text_speech_enable") && c2957zM6374y.m6377b("text_speech_play_voice_messages") && c2957zM6374y.m6376a().contains(c2942k.f9648b) && !m6352k(c2957zM6374y)) {
                z9 = true;
            }
            if (!z9) {
                this.f9677d.remove(c2942k.f9647a);
            }
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public final void m6362g() {
        Runnable runnable = this.f9698y;
        if (runnable != null) {
            this.f9675b.removeCallbacks(runnable);
        }
        this.f9698y = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public final void m6363i() {
        ArrayList arrayList = new ArrayList();
        ArrayDeque arrayDeque = this.f9676c;
        for (Object obj : arrayDeque) {
            if (!Boolean.valueOf(((AbstractC2943l) obj) instanceof C2945n).booleanValue()) {
                arrayList.add(obj);
            }
        }
        arrayDeque.clear();
        arrayDeque.addAll(arrayList);
        if (this.f9688o instanceof C2945n) {
            this.f9688o = null;
            this.f9691r = false;
            this.f9689p = HttpUrl.FRAGMENT_ENCODE_SET;
            this.f9690q = 0;
        }
        m6367o();
        m6366n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public final void m6364j() {
        final C2954w c2954w;
        if (m6374y().m6377b("text_speech_enable")) {
            if (this.f9680g) {
                m6366n();
                return;
            }
            if (!this.f9681h && this.f9679f == null) {
                this.f9681h = true;
                final long j3 = this.f9682i + 1;
                this.f9682i = j3;
                final String strM6378c = m6374y().m6378c();
                boolean zM3825a = AbstractC1416l.m3825a(this.f9685l, strM6378c);
                Context context = this.f9674a;
                if (!zM3825a || this.f9686m.isEmpty()) {
                    this.f9685l = strM6378c;
                    this.f9686m = C2928c.m6339a(context, strM6378c);
                    this.f9687n = 0;
                }
                String str = (String) AbstractC4166m.m8425w1(this.f9687n, this.f9686m);
                final String str2 = str != null ? str : strM6378c;
                try {
                    c2954w = this;
                } catch (Throwable th2) {
                    th = th2;
                    c2954w = this;
                }
                try {
                    TextToSpeech.OnInitListener onInitListener = new TextToSpeech.OnInitListener() { // from class: nb.i
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // android.speech.tts.TextToSpeech.OnInitListener
                        public final void onInit(int i9) {
                            C2954w c2954w2 = this.f9641a;
                            c2954w2.f9675b.post(new RunnableC2936g(c2954w2, j3, strM6378c, str2, i9));
                        }
                    };
                    c2954w.f9679f = AbstractC3149m.m6721t0(str2) ? new TextToSpeech(context, onInitListener) : new TextToSpeech(context, onInitListener, str2);
                    RunnableC0531r runnableC0531r = c2954w.f9683j;
                    Handler handler = c2954w.f9675b;
                    if (runnableC0531r != null) {
                        handler.removeCallbacks(runnableC0531r);
                    }
                    RunnableC0531r runnableC0531r2 = new RunnableC0531r(j3, this, str2);
                    c2954w.f9683j = runnableC0531r2;
                    handler.postDelayed(runnableC0531r2, 8000L);
                } catch (Throwable th3) {
                    th = th3;
                    c2954w.f9681h = false;
                    m6371v(th);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public final void m6365m() {
        C2114y c2114y;
        if (this.f9691r) {
            return;
        }
        AbstractC2943l abstractC2943l = this.f9688o;
        if (abstractC2943l instanceof C2945n) {
            this.f9691r = true;
            this.f9689p = HttpUrl.FRAGMENT_ENCODE_SET;
            try {
                TextToSpeech textToSpeech = this.f9679f;
                if (textToSpeech != null) {
                    textToSpeech.stop();
                }
            } catch (Throwable unused) {
            }
            m6358B();
            return;
        }
        if (!(abstractC2943l instanceof C2946o)) {
            if (abstractC2943l == null) {
                return;
            }
            C3193a.m6822k();
            return;
        }
        C2105p c2105pMedia = WeChatApis.media();
        if (c2105pMedia == null || (c2114y = c2105pMedia.f7036b) == null || !c2114y.m5322r(new C2110u(c2114y, 1))) {
            return;
        }
        this.f9691r = true;
        m6362g();
        m6358B();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public final void m6366n() {
        final C2114y c2114y;
        if (this.f9691r || this.f9688o != null) {
            return;
        }
        ArrayDeque arrayDeque = this.f9676c;
        AbstractC2943l abstractC2943l = (AbstractC2943l) arrayDeque.peekFirst();
        if (abstractC2943l == null) {
            m6367o();
            return;
        }
        if (abstractC2943l instanceof C2945n) {
            if (!this.f9680g) {
                m6364j();
                return;
            }
            arrayDeque.pollFirst();
            this.f9688o = abstractC2943l;
            if (m6357A()) {
                return;
            }
            this.f9688o = null;
            m6366n();
            return;
        }
        if (!(abstractC2943l instanceof C2946o)) {
            C3193a.m6822k();
            return;
        }
        arrayDeque.pollFirst();
        this.f9688o = abstractC2943l;
        C2946o c2946o = (C2946o) abstractC2943l;
        C2105p c2105pMedia = WeChatApis.media();
        boolean zM5322r = false;
        if (c2105pMedia != null && (c2114y = c2105pMedia.f7036b) != null) {
            m6359c();
            final String str = c2946o.f9661a;
            final C0126e c0126e = new C0126e(this, 28, c2946o);
            if (TextUtils.isEmpty(str) || !AbstractC0921a.m2262y(str)) {
                c2114y.m5317m("播放原语音失败: 文件不存在 ".concat(str));
            } else {
                DexFinder dexFinder = c2114y.f7061a;
                if (dexFinder.voicePlaybackStartMethod == null || dexFinder.voicePlaybackStopMethod == null) {
                    c2114y.m5317m("播放原语音失败: 原生播放器未就绪");
                } else {
                    zM5322r = c2114y.m5322r(new InterfaceC2112w() { // from class: j8.s
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p136j8.InterfaceC2112w
                        public final boolean run() {
                            final long j3;
                            int i9;
                            final int i10;
                            final C2114y c2114y2 = c2114y;
                            String str2 = str;
                            C0126e c0126e2 = c0126e;
                            c2114y2.m5325u();
                            Method method = c2114y2.f7061a.voicePlaybackStartMethod;
                            Object objNewInstance = KavaReflector.newInstance(KavaReflector.findConstructor(method != null ? method.getDeclaringClass() : null, Context.class, Integer.TYPE), c2114y2.f7062b, 0);
                            if (objNewInstance == null) {
                                c2114y2.m5317m("播放原语音失败: 创建原生播放器失败");
                                return false;
                            }
                            synchronized (c2114y2.f7064d) {
                                j3 = c2114y2.f7067g + 1;
                                c2114y2.f7067g = j3;
                                c2114y2.f7065e = objNewInstance;
                                c2114y2.f7066f = c0126e2;
                            }
                            for (Field field : KavaReflector.declaredFields(objNewInstance.getClass())) {
                                Class<?> type = field.getType();
                                if (type.isInterface()) {
                                    Iterator<Method> it = KavaReflector.declaredMethods(type).iterator();
                                    Method method2 = null;
                                    while (true) {
                                        if (!it.hasNext()) {
                                            i9 = 1;
                                            break;
                                        }
                                        Method next = it.next();
                                        i9 = 1;
                                        if (next.getReturnType() == Void.TYPE) {
                                            if (method2 != null) {
                                                method2 = null;
                                                break;
                                            }
                                            method2 = next;
                                        }
                                    }
                                    if (method2 != null) {
                                        final String name = method2.getName();
                                        if ("onCompletion".equals(name)) {
                                            i10 = i9;
                                        } else if ("onStop".equals(name)) {
                                            i10 = 2;
                                        } else if (method2.getParameterTypes().length == 0) {
                                            i10 = 3;
                                        }
                                        ClassLoader classLoader = type.getClassLoader();
                                        if (classLoader == null) {
                                            classLoader = C2114y.class.getClassLoader();
                                        }
                                        KavaReflector.writeField(field, objNewInstance, Proxy.newProxyInstance(classLoader, new Class[]{type}, new InvocationHandler() { // from class: j8.v
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // java.lang.reflect.InvocationHandler
                                            public final Object invoke(Object obj, Method method3, Object[] objArr) {
                                                C2114y c2114y3 = c2114y2;
                                                c2114y3.getClass();
                                                Object obj2 = null;
                                                if (method3.getDeclaringClass() != Object.class) {
                                                    if (name.equals(method3.getName())) {
                                                        C2114y.f7060h.post(new RunnableC0835f(c2114y3, j3, i10));
                                                    }
                                                    Class<?> returnType = method3.getReturnType();
                                                    if (returnType.isPrimitive() && returnType != Void.TYPE) {
                                                        if (returnType == Boolean.TYPE) {
                                                            return Boolean.FALSE;
                                                        }
                                                        if (returnType == Byte.TYPE) {
                                                            return (byte) 0;
                                                        }
                                                        if (returnType == Short.TYPE) {
                                                            return (short) 0;
                                                        }
                                                        if (returnType == Integer.TYPE) {
                                                            return 0;
                                                        }
                                                        if (returnType == Long.TYPE) {
                                                            return 0L;
                                                        }
                                                        if (returnType == Float.TYPE) {
                                                            return Float.valueOf(0.0f);
                                                        }
                                                        if (returnType == Double.TYPE) {
                                                            return Double.valueOf(0.0d);
                                                        }
                                                        if (returnType == Character.TYPE) {
                                                            return (char) 0;
                                                        }
                                                    }
                                                } else {
                                                    if ("hashCode".equals(method3.getName())) {
                                                        return Integer.valueOf(System.identityHashCode(obj));
                                                    }
                                                    if ("equals".equals(method3.getName())) {
                                                        if (objArr != null && objArr.length > 0) {
                                                            obj2 = objArr[0];
                                                        }
                                                        return Boolean.valueOf(obj == obj2);
                                                    }
                                                    if ("toString".equals(method3.getName())) {
                                                        return "HchatVoicePlaybackCallback";
                                                    }
                                                }
                                                return null;
                                            }
                                        }));
                                    }
                                }
                            }
                            try {
                                Boolean bool = Boolean.TRUE;
                                Object objInvokeOrThrow = KavaReflector.invokeOrThrow(method, objNewInstance, str2, bool, bool, -1);
                                if ((objInvokeOrThrow instanceof Boolean) && ((Boolean) objInvokeOrThrow).booleanValue()) {
                                    return true;
                                }
                                c2114y2.m5309c(j3);
                                c2114y2.m5326v(objNewInstance);
                                c2114y2.m5317m("播放原语音失败: 微信原生播放器拒绝播放");
                                return false;
                            } catch (Throwable th2) {
                                c2114y2.m5309c(j3);
                                c2114y2.m5326v(objNewInstance);
                                c2114y2.m5317m("播放原语音异常: " + th2.getMessage());
                                return false;
                            }
                        }
                    });
                }
            }
            if (zM5322r) {
                m6373x(c2946o);
            }
        }
        if (zM5322r) {
            return;
        }
        this.f9688o = null;
        m6366n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final void m6367o() {
        MediaSession mediaSession = this.f9694u;
        this.f9694u = null;
        this.f9695v = null;
        if (mediaSession != null) {
            try {
                mediaSession.setActive(false);
            } catch (Throwable unused) {
            }
        }
        if (mediaSession != null) {
            try {
                mediaSession.release();
            } catch (Throwable unused2) {
            }
        }
        C2952u c2952u = this.f9696w;
        if (c2952u != null) {
            this.f9696w = null;
            this.f9697x = null;
            try {
                this.f9674a.unregisterReceiver(c2952u);
            } catch (Throwable unused3) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m6368p() {
        this.f9685l = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9686m = C4173t.f13710g;
        this.f9687n = 0;
        this.f9684k = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final void m6369t() {
        AbstractC2943l abstractC2943l = this.f9688o;
        if (abstractC2943l instanceof C2946o) {
            try {
                TextToSpeech textToSpeech = this.f9679f;
                if (textToSpeech != null) {
                    textToSpeech.stop();
                }
            } catch (Throwable unused) {
            }
            m6372w();
            m6368p();
            return;
        }
        C2945n c2945n = abstractC2943l instanceof C2945n ? (C2945n) abstractC2943l : null;
        this.f9688o = null;
        this.f9689p = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9690q = 0;
        this.f9691r = false;
        this.f9693t = 0;
        try {
            TextToSpeech textToSpeech2 = this.f9679f;
            if (textToSpeech2 != null) {
                textToSpeech2.stop();
            }
        } catch (Throwable unused2) {
        }
        m6367o();
        m6372w();
        m6368p();
        ArrayDeque arrayDeque = this.f9676c;
        if (c2945n != null) {
            arrayDeque.addFirst(c2945n);
        }
        if (arrayDeque.isEmpty() || !m6374y().m6377b("text_speech_enable")) {
            return;
        }
        m6366n();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public final void m6370u() {
        AbstractC2943l abstractC2943l;
        C2114y c2114y;
        if (!this.f9691r || (abstractC2943l = this.f9688o) == null) {
            return;
        }
        if (abstractC2943l instanceof C2945n) {
            this.f9691r = false;
            if (m6357A()) {
                return;
            }
            this.f9688o = null;
            m6366n();
            return;
        }
        if (!(abstractC2943l instanceof C2946o)) {
            C3193a.m6822k();
            return;
        }
        C2105p c2105pMedia = WeChatApis.media();
        if (c2105pMedia == null || (c2114y = c2105pMedia.f7036b) == null || !c2114y.m5322r(new C2110u(c2114y, 0))) {
            return;
        }
        this.f9691r = false;
        m6373x((C2946o) abstractC2943l);
        m6358B();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public final void m6371v(Throwable th2) {
        m6372w();
        if (m6374y().m6377b("text_speech_enable")) {
            int i9 = this.f9684k + 1;
            this.f9684k = i9;
            Handler handler = this.f9675b;
            if (i9 <= 1) {
                handler.postDelayed(new RunnableC2932e(this, 1), 800L);
                return;
            }
            if (m6360e()) {
                handler.postDelayed(new RunnableC2932e(this, 2), 800L);
                return;
            }
            String strM6378c = m6374y().m6378c();
            if (AbstractC3149m.m6721t0(strM6378c)) {
                strM6378c = "系统默认";
            }
            AbstractC1184v0.m3204n("[Hchat:TextSpeech] 文字转语音引擎初始化失败: ".concat(strM6378c), th2);
            m6368p();
            m6363i();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public final void m6372w() {
        this.f9682i++;
        RunnableC0531r runnableC0531r = this.f9683j;
        if (runnableC0531r != null) {
            this.f9675b.removeCallbacks(runnableC0531r);
        }
        this.f9683j = null;
        try {
            TextToSpeech textToSpeech = this.f9679f;
            if (textToSpeech != null) {
                textToSpeech.shutdown();
            }
        } catch (Throwable unused) {
        }
        this.f9679f = null;
        this.f9680g = false;
        this.f9681h = false;
        this.f9689p = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f9690q = 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public final void m6373x(C2946o c2946o) {
        m6362g();
        long jM7911s = AbstractC3754e0.m7911s(((long) c2946o.f9662b) + 15000, 20000L, 300000L);
        C1425u c1425u = new C1425u();
        RunnableC0059l runnableC0059l = new RunnableC0059l(this, c1425u, c2946o, 21);
        c1425u.f4738g = runnableC0059l;
        this.f9698y = runnableC0059l;
        this.f9675b.postDelayed(runnableC0059l, jM7911s);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public final C2957z m6374y() {
        return new C2957z(this.f9674a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public final void m6375z() {
        C2114y c2114y;
        if (this.f9691r || this.f9688o != null) {
            AbstractC2943l abstractC2943l = this.f9688o;
            this.f9689p = HttpUrl.FRAGMENT_ENCODE_SET;
            this.f9690q = 0;
            this.f9691r = false;
            this.f9688o = null;
            if (abstractC2943l instanceof C2945n) {
                try {
                    TextToSpeech textToSpeech = this.f9679f;
                    if (textToSpeech != null) {
                        textToSpeech.stop();
                    }
                } catch (Throwable unused) {
                }
            } else if (abstractC2943l instanceof C2946o) {
                m6362g();
                C2105p c2105pMedia = WeChatApis.media();
                if (c2105pMedia != null && (c2114y = c2105pMedia.f7036b) != null) {
                    c2114y.m5322r(new C2110u(c2114y, 2));
                }
            } else if (abstractC2943l != null) {
                C3193a.m6822k();
                return;
            }
            m6366n();
        }
    }
}
