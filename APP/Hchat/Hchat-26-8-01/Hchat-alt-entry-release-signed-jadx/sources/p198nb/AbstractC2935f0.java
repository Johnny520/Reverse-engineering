package p198nb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import gg.C1423s;
import gg.C1424t;
import gg.C1425u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import ng.C3004b;
import ng.C3011i;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p023b8.C0205c;
import p036c9.C0467n0;
import p054dg.C0795n;
import p085fg.InterfaceC1231l;
import p119i2.C1955z;
import p174m.C2571a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p332wb.AbstractC4855en;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;
import tf.C4175v;

/* JADX INFO: renamed from: nb.f0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2935f0 {

    /* JADX INFO: renamed from: a */
    public static final Handler f9623a = new Handler(Looper.getMainLooper());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static C2571a m6342a(Context context, String str, InterfaceC1231l interfaceC1231l) {
        context.getClass();
        str.getClass();
        Context applicationContext = context.getApplicationContext();
        Context context2 = applicationContext != null ? applicationContext : context;
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        List listM6339a = C2928c.m6339a(context2, str);
        String strM6340c = C2928c.m6340c(context2);
        ArrayList arrayList = new ArrayList();
        C1425u c1425u = new C1425u();
        C1423s c1423s = new C1423s();
        C1424t c1424t = new C1424t();
        C1425u c1425u2 = new C1425u();
        C1425u c1425u3 = new C1425u();
        c1425u3.f4738g = new C2925a0(atomicBoolean, listM6339a, c1423s, c1424t, c1425u, str, context2, arrayList, interfaceC1231l, c1425u2, strM6340c, c1425u3);
        f9623a.post(new RunnableC2927b0(c1425u3, 0));
        return new C2571a(new C0467n0(atomicBoolean, c1424t, c1425u2, c1425u, 6), 6);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m6343b(long j3, Context context, InterfaceC1231l interfaceC1231l, C1423s c1423s, C1424t c1424t, C1425u c1425u, C1425u c1425u2, C1425u c1425u3, String str, String str2, String str3, ArrayList arrayList, List list, AtomicBoolean atomicBoolean) {
        if (j3 != c1424t.f4737g || atomicBoolean.get()) {
            return;
        }
        c1424t.f4737g++;
        arrayList.add(((Object) (AbstractC3149m.m6721t0(str2) ? "系统默认" : str2)) + "：" + str3);
        m6345d(c1425u, c1425u2);
        if (c1423s.f4736g < list.size()) {
            f9623a.postDelayed(new RunnableC2927b0(c1425u3, 1), 300L);
        } else {
            m6344c(str, context, arrayList, c1424t, atomicBoolean, interfaceC1231l, c1425u, c1425u2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m6344c(String str, Context context, ArrayList arrayList, C1424t c1424t, AtomicBoolean atomicBoolean, InterfaceC1231l interfaceC1231l, C1425u c1425u, C1425u c1425u2) {
        String strConcat = !AbstractC3149m.m6721t0(str) ? "所选 TTS 引擎初始化失败：".concat(str) : C2928c.f9573a.m6341b(context).isEmpty() ? "系统默认 TTS 初始化失败，未发现其它可用引擎" : "系统默认及其它可用 TTS 引擎均初始化失败";
        String strM8392A1 = AbstractC4166m.m8392A1(AbstractC4166m.m8404M1(3, arrayList), "；", null, null, null, 62);
        if (!AbstractC3149m.m6721t0(strM8392A1)) {
            strConcat = AbstractC4855en.m9265i(strConcat, "（", strM8392A1, "）");
        }
        C2937g0 c2937g0 = new C2937g0(C4173t.f13710g, strConcat, null, false, 12);
        c1424t.f4737g++;
        m6345d(c1425u, c1425u2);
        if (atomicBoolean.get()) {
            return;
        }
        interfaceC1231l.invoke(c2937g0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final void m6345d(C1425u c1425u, C1425u c1425u2) {
        Runnable runnable = (Runnable) c1425u.f4738g;
        if (runnable != null) {
            f9623a.removeCallbacks(runnable);
        }
        c1425u.f4738g = null;
        TextToSpeech textToSpeech = (TextToSpeech) c1425u2.f4738g;
        c1425u2.f4738g = null;
        if (textToSpeech != null) {
            try {
                textToSpeech.shutdown();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static ArrayList m6346e(TextToSpeech textToSpeech) {
        Iterable iterableM99x0;
        Set<Voice> voices = textToSpeech.getVoices();
        if (voices == null) {
            voices = C4175v.f13712g;
        }
        C3004b c3004b = new C3004b(new C3011i(new C0795n(voices, 6), true, new C1955z(26)).iterator(), new C1955z(27));
        if (c3004b.hasNext()) {
            Object next = c3004b.next();
            if (c3004b.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (c3004b.hasNext()) {
                    arrayList.add(c3004b.next());
                }
                iterableM99x0 = arrayList;
            } else {
                iterableM99x0 = AbstractC0000a.m99x0(next);
            }
        } else {
            iterableM99x0 = C4173t.f13710g;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = iterableM99x0.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next2 = it.next();
            Locale locale = ((Voice) next2).getLocale();
            if (AbstractC3156t.m6734X(locale != null ? locale.getLanguage() : null, Locale.CHINESE.getLanguage())) {
                arrayList2.add(next2);
            }
        }
        if (!arrayList2.isEmpty()) {
            iterableM99x0 = arrayList2;
        }
        List<Voice> listM8402K1 = AbstractC4166m.m8402K1(iterableM99x0, new C0205c(8));
        ArrayList arrayList3 = new ArrayList(AbstractC4167n.m8429e1(listM8402K1));
        for (Voice voice : listM8402K1) {
            Locale locale2 = voice.getLocale();
            String displayName = locale2 != null ? locale2.getDisplayName(Locale.SIMPLIFIED_CHINESE) : null;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            if (displayName == null) {
                displayName = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (AbstractC3149m.m6721t0(displayName)) {
                Locale locale3 = voice.getLocale();
                String languageTag = locale3 != null ? locale3.toLanguageTag() : null;
                if (languageTag != null) {
                    str = languageTag;
                }
                displayName = str;
            }
            List listM101y0 = AbstractC0000a.m101y0(displayName, voice.isNetworkConnectionRequired() ? "联网" : "本地");
            ArrayList arrayList4 = new ArrayList();
            for (Object obj : listM101y0) {
                if (!AbstractC3149m.m6721t0((String) obj)) {
                    arrayList4.add(obj);
                }
            }
            String strM8392A1 = AbstractC4166m.m8392A1(arrayList4, " · ", null, null, null, 62);
            String name = voice.getName();
            name.getClass();
            int length = strM8392A1.length();
            String name2 = voice.getName();
            if (length != 0) {
                name2 = AbstractC4855en.m9265i(name2, "（", strM8392A1, "）");
            }
            name2.getClass();
            arrayList3.add(new C2939h0(name, name2));
        }
        return arrayList3;
    }
}
