package p024b9;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import okhttp3.HttpUrl;
import p002a1.RunnableC0003a;
import p036c9.C0429d2;
import p108ha.C1632b;
import p108ha.C1633b0;
import p108ha.C1636d;
import p108ha.C1642g;
import p108ha.C1644h;
import p108ha.C1648j;
import p108ha.C1650k;
import p108ha.C1653m;
import p108ha.C1666z;
import p198nb.C2954w;
import p198nb.RunnableC2932e;
import p213ob.C3121n;
import p258r8.C3742g;
import p276sf.C3958e;
import p299u9.C4287f;
import p299u9.C4289h;
import p332wb.RunnableC4794cr;
import p347xa.C5752m;
import tf.AbstractC4166m;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: b9.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SharedPreferencesOnSharedPreferenceChangeListenerC0216b implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f525a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f526b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC0216b(Object obj, int i9) {
        this.f525a = i9;
        this.f526b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    private final void m893a(SharedPreferences sharedPreferences, String str) {
        C1633b0 c1633b0 = (C1633b0) this.f526b;
        if (str != null && str.hashCode() == -1298848381 && str.equals("enable")) {
            boolean z9 = c1633b0.f5340c.getBoolean("enable", false);
            if (z9 && !c1633b0.f5346i) {
                synchronized (c1633b0.f5343f) {
                    c1633b0.f5343f.clear();
                }
                c1633b0.f5340c.edit().putLong("enabled_at_seconds", System.currentTimeMillis() / 1000).putString("notified_ids", HttpUrl.PATH_SEGMENT_ENCODE_SET_URI).apply();
            } else if (!z9) {
                synchronized (c1633b0.f5343f) {
                    c1633b0.f5343f.clear();
                }
                c1633b0.f5340c.edit().putLong("enabled_at_seconds", 0L).remove("notified_ids").apply();
            }
            c1633b0.f5346i = z9;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    private final void m894b(SharedPreferences sharedPreferences, String str) {
        List<View> listM8407P1;
        C4289h c4289h = (C4289h) this.f526b;
        if (str != null && str.hashCode() == 707705159 && str.equals("hide_wechat_bottom_bar_enable")) {
            boolean z9 = c4289h.f14221e.getBoolean("hide_wechat_bottom_bar_enable", false);
            Map map = c4289h.f14223g;
            map.getClass();
            synchronized (map) {
                listM8407P1 = AbstractC4166m.m8407P1(c4289h.f14223g.keySet());
            }
            for (View view : listM8407P1) {
                view.getClass();
                C4287f c4287f = new C4287f(c4289h, view, z9);
                if (AbstractC1416l.m3825a(Looper.myLooper(), Looper.getMainLooper())) {
                    c4287f.invoke();
                } else {
                    view.post(new RunnableC0003a(c4287f, 28));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        ArrayList<C3958e> arrayList;
        switch (this.f525a) {
            case 0:
                C0220f c0220f = (C0220f) this.f526b;
                if (str != null) {
                    int iHashCode = str.hashCode();
                    if (iHashCode != 1230870446) {
                        if (iHashCode != 1550516034 || !str.equals("chat_time_format")) {
                            return;
                        }
                    } else if (!str.equals("chat_time_mode")) {
                        return;
                    }
                    String string = c0220f.f539c.getString("chat_time_mode", "original");
                    String str2 = AbstractC1416l.m3825a(string, "custom") ? "custom" : AbstractC1416l.m3825a(string, "hidden") ? "hidden" : "original";
                    Map map = c0220f.f538b;
                    map.getClass();
                    synchronized (map) {
                        Set<Map.Entry> setEntrySet = c0220f.f538b.entrySet();
                        arrayList = new ArrayList(AbstractC4167n.m8429e1(setEntrySet));
                        for (Map.Entry entry : setEntrySet) {
                            arrayList.add(new C3958e(entry.getKey(), entry.getValue()));
                            break;
                        }
                    }
                    for (C3958e c3958e : arrayList) {
                        TextView textView = (TextView) c3958e.f12961g;
                        textView.post(new RunnableC0217c(textView, c0220f, (C0218d) c3958e.f12962h, str2, 0));
                    }
                    return;
                }
                return;
            case 1:
                C3742g c3742g = (C3742g) this.f526b;
                if (str != null) {
                    int iHashCode2 = str.hashCode();
                    if (iHashCode2 != -1609594047) {
                        if (iHashCode2 != -1482073914 || !str.equals("groups_v1")) {
                            return;
                        }
                    } else if (!str.equals("enabled")) {
                        return;
                    }
                    C0429d2.m1445y(c3742g.f12143a);
                    return;
                }
                return;
            case 2:
                C1636d c1636d = (C1636d) this.f526b;
                if (str != null && str.hashCode() == -335078557 && str.equals("comment_enable")) {
                    boolean z9 = c1636d.f5359b.getBoolean("comment_enable", false);
                    if (!z9 || c1636d.f5366i) {
                        if (!z9) {
                            c1636d.f5359b.edit().putLong("comment_enabled_at_seconds", 0L).apply();
                            Set setKeySet = c1636d.f5365h.keySet();
                            setKeySet.getClass();
                            List<String> listM8407P1 = AbstractC4166m.m8407P1(setKeySet);
                            Collection collectionValues = c1636d.f5365h.values();
                            collectionValues.getClass();
                            Iterator it = collectionValues.iterator();
                            while (it.hasNext()) {
                                ((ScheduledFuture) it.next()).cancel(false);
                            }
                            c1636d.f5365h.clear();
                            synchronized (c1636d.f5361d) {
                                for (String str3 : listM8407P1) {
                                    C1632b c1632b = (C1632b) c1636d.f5363f.get(str3);
                                    if (c1632b != null && c1632b.f5337a == Long.MAX_VALUE) {
                                        c1636d.f5363f.remove(str3);
                                    }
                                }
                            }
                        }
                        break;
                    } else {
                        c1636d.f5359b.edit().putLong("comment_enabled_at_seconds", System.currentTimeMillis() / 1000).apply();
                    }
                    c1636d.f5366i = z9;
                    return;
                }
                return;
            case 3:
                C1644h c1644h = (C1644h) this.f526b;
                if (str != null && str.hashCode() == -1298848381 && str.equals("enable")) {
                    boolean z10 = c1644h.f5396b.getBoolean("enable", false);
                    synchronized (c1644h.f5399e) {
                        try {
                            if (z10 != c1644h.f5404j) {
                                c1644h.f5405k++;
                                c1644h.f5404j = z10;
                                Collection<C1642g> collectionValues2 = c1644h.f5403i.values();
                                collectionValues2.getClass();
                                for (C1642g c1642g : collectionValues2) {
                                    c1642g.f5385e.set(true);
                                    ScheduledFuture scheduledFuture = c1642g.f5387g;
                                    if (scheduledFuture != null) {
                                        scheduledFuture.cancel(true);
                                    }
                                }
                                c1644h.f5403i.clear();
                                if (z10) {
                                    c1644h.m4179a();
                                } else if (!c1644h.f5396b.edit().putLong("enabled_at_seconds", 0L).commit()) {
                                    c1644h.f5395a.invoke("保存朋友圈自动转发关闭状态失败", null);
                                }
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
                return;
            case 4:
                C1650k c1650k = (C1650k) this.f526b;
                if (str != null && str.hashCode() == -1298848381 && str.equals("enable")) {
                    boolean z11 = c1650k.f5429b.getBoolean("enable", false);
                    if (!z11 || c1650k.f5436i) {
                        if (!z11) {
                            c1650k.f5429b.edit().putLong("enabled_at_seconds", 0L).apply();
                            Set setKeySet2 = c1650k.f5435h.keySet();
                            setKeySet2.getClass();
                            List<String> listM8407P12 = AbstractC4166m.m8407P1(setKeySet2);
                            Collection collectionValues3 = c1650k.f5435h.values();
                            collectionValues3.getClass();
                            Iterator it2 = collectionValues3.iterator();
                            while (it2.hasNext()) {
                                ((ScheduledFuture) it2.next()).cancel(false);
                            }
                            c1650k.f5435h.clear();
                            synchronized (c1650k.f5431d) {
                                for (String str4 : listM8407P12) {
                                    C1648j c1648j = (C1648j) c1650k.f5433f.get(str4);
                                    if (c1648j != null && c1648j.f5410a == Long.MAX_VALUE) {
                                        c1650k.f5433f.remove(str4);
                                    }
                                }
                            }
                        }
                        break;
                    } else {
                        c1650k.f5429b.edit().putLong("enabled_at_seconds", System.currentTimeMillis() / 1000).apply();
                    }
                    c1650k.f5436i = z11;
                    return;
                }
                return;
            case 5:
                C1653m c1653m = (C1653m) this.f526b;
                if (str != null && str.hashCode() == -1298848381 && str.equals("enable")) {
                    c1653m.m4227a();
                    return;
                }
                return;
            case 6:
                C1666z c1666z = (C1666z) this.f526b;
                Handler handler = c1666z.f5480e;
                if (str != null) {
                    int iHashCode3 = str.hashCode();
                    if (iHashCode3 != -340980866) {
                        if (iHashCode3 != 94664279 || !str.equals("moments_keyword_block_enable")) {
                            return;
                        }
                    } else if (!str.equals("moments_keyword_block_keywords")) {
                        return;
                    }
                    RunnableC0003a runnableC0003a = c1666z.f5487l;
                    handler.removeCallbacks(runnableC0003a);
                    handler.post(runnableC0003a);
                    return;
                }
                return;
            case 7:
                m893a(sharedPreferences, str);
                return;
            case 8:
                C2954w c2954w = (C2954w) this.f526b;
                Handler handler2 = c2954w.f9675b;
                if (str != null) {
                    switch (str.hashCode()) {
                        case -1669064967:
                            if (!str.equals("text_speech_tts_engine")) {
                                return;
                            }
                            break;
                        case -1592445789:
                            if (str.equals("text_speech_volume_control")) {
                                handler2.post(new RunnableC2932e(c2954w, 6));
                                return;
                            }
                            return;
                        case -1443382290:
                            if (str.equals("text_speech_enable") && !c2954w.m6374y().m6377b("text_speech_enable")) {
                                handler2.post(new RunnableC2932e(c2954w, 4));
                                return;
                            }
                            return;
                        case -256733799:
                            if (str.equals("text_speech_play_voice_messages") && !c2954w.m6374y().m6377b("text_speech_play_voice_messages")) {
                                handler2.post(new RunnableC2932e(c2954w, 5));
                                return;
                            }
                            return;
                        case 654627227:
                            if (!str.equals("text_speech_tts_voice")) {
                                return;
                            }
                            break;
                        default:
                            return;
                    }
                    RunnableC2932e runnableC2932e = c2954w.f9678e;
                    handler2.removeCallbacks(runnableC2932e);
                    handler2.post(runnableC2932e);
                    return;
                }
                return;
            case 9:
                C3121n c3121n = (C3121n) this.f526b;
                if (!AbstractC1416l.m3825a(str, "text_voice_send_enable") || c3121n.m6627i()) {
                    return;
                }
                c3121n.f10117h.clear();
                return;
            case 10:
                m894b(sharedPreferences, str);
                return;
            default:
                C5752m c5752m = (C5752m) this.f526b;
                if (!AbstractC1416l.m3825a(str, "quick_contact_edit_enable") || c5752m.m10445b()) {
                    return;
                }
                c5752m.f23416d.post(new RunnableC4794cr(c5752m, 5));
                return;
        }
    }
}
