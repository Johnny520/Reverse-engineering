package p002a1;

import ac.ExecutorC0064q;
import ac.SharedPreferencesC0062o;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import ba.C0224d;
import ba.C0235o;
import ba.C0236p;
import ba.C0238r;
import ba.EnumC0234n;
import ba.RunnableC0225e;
import bb.C0245g;
import bb.C0250l;
import be.C0276d0;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p014b.C0126e;
import p024b9.RunnableC0217c;
import p025bc.AbstractC0255e;
import p049d9.AbstractC0754o;
import p049d9.C0744e;
import p065eb.C0859c0;
import p065eb.C0901w0;
import p068eh.AbstractC0921a;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.items.script.ScriptPluginBridge;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p099h.Hchat.utils.KavaReflector;
import p108ha.C1632b;
import p108ha.C1633b0;
import p108ha.C1635c0;
import p108ha.C1636d;
import p108ha.C1648j;
import p108ha.C1650k;
import p109hb.C1676e0;
import p109hb.C1683i;
import p109hb.C1687k;
import p129ig.AbstractC2043a;
import p139jb.C2121e;
import p142jg.AbstractC2136d;
import p154k9.C2374r;
import p196n8.C2911c;
import p213ob.C3118k;
import p213ob.C3121n;
import p218og.AbstractC3149m;
import p219oh.AbstractC3165h;
import p230p8.C3351d0;
import p242q8.C3463r;
import p258r8.C3739d;
import p258r8.C3740e;
import p258r8.C3742g;
import p259r9.AbstractC3754e0;
import p260ra.C3784h;
import p260ra.ViewTreeObserverOnGlobalLayoutListenerC3780d;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3962i;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p302ud.C4322r;
import p302ud.InterfaceC4316l;
import p332wb.AbstractC4855en;
import p381zb.AbstractC6133b;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: a1.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0006d implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f15g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f16h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f17i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0006d(Object obj, int i9, Object obj2) {
        this.f15g = i9;
        this.f16h = obj;
        this.f17i = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m143a() {
        C1635c0 c1635c0M6799z;
        boolean z9;
        boolean z10;
        long jMo5362e;
        C1636d c1636d = (C1636d) this.f16h;
        Object obj = this.f17i;
        C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
        if (c3351d0SnsApi == null || (c1635c0M6799z = AbstractC3165h.m6799z(obj, c3351d0SnsApi)) == null) {
            return;
        }
        if (c1636d.m4161a().length() == 0) {
            c1636d.m4162c("跳过 " + C1636d.m4160b(c1635c0M6799z.f5352c) + "：评论内容为空");
            return;
        }
        String str = c1635c0M6799z.f5350a;
        synchronized (c1636d.f5361d) {
            try {
                c1636d.m4163d();
                if (c1636d.f5364g.contains(str)) {
                    z9 = true;
                } else {
                    C1632b c1632b = (C1632b) c1636d.f5363f.get(str);
                    if ((c1632b != null ? c1632b.f5337a : 0L) <= System.currentTimeMillis()) {
                        z9 = false;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z9) {
            return;
        }
        String strM4165f = c1636d.m4165f(c1635c0M6799z);
        String str2 = c1635c0M6799z.f5350a;
        if (strM4165f != null) {
            c1636d.m4166g(System.currentTimeMillis() + 3600000, str2);
            c1636d.m4162c("跳过 " + C1636d.m4160b(c1635c0M6799z.f5352c) + "：" + strM4165f);
            return;
        }
        synchronized (c1636d.f5361d) {
            try {
                c1636d.m4163d();
                if (c1636d.f5364g.contains(str2)) {
                    z10 = false;
                } else {
                    C1632b c1632b2 = (C1632b) c1636d.f5363f.get(str2);
                    if ((c1632b2 != null ? c1632b2.f5337a : 0L) > System.currentTimeMillis()) {
                        z10 = false;
                    } else {
                        c1636d.f5363f.put(str2, new C1632b(Long.MAX_VALUE));
                        z10 = true;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z10) {
            SharedPreferences sharedPreferences = c1636d.f5359b;
            if (sharedPreferences.getInt("comment_delay_mode", 1) == 0) {
                int i9 = sharedPreferences.getInt("comment_fixed_delay_seconds", 300);
                jMo5362e = i9 >= 0 ? i9 : 0;
            } else {
                int i10 = sharedPreferences.getInt("comment_random_min_seconds", 60);
                long j3 = i10 >= 0 ? i10 : 0;
                long j4 = sharedPreferences.getInt("comment_random_max_seconds", 3600);
                if (j4 < j3) {
                    j4 = j3;
                }
                jMo5362e = j3 == j4 ? j3 : AbstractC2136d.f7122g.mo5362e(j3, j4 + 1);
            }
            StringBuilder sbM1027p = AbstractC0255e.m1027p("已捕捉 ", C1636d.m4160b(c1635c0M6799z.f5352c), " 的", c1635c0M6799z.f5354e.f5374g, "朋友圈，");
            sbM1027p.append(jMo5362e);
            sbM1027p.append("秒后评论");
            c1636d.m4162c(sbM1027p.toString());
            ScheduledFuture<?> scheduledFutureSchedule = c1636d.f5360c.schedule(new RunnableC0006d(c1636d, 12, c1635c0M6799z), jMo5362e, TimeUnit.SECONDS);
            c1636d.f5365h.put(c1635c0M6799z.f5350a, scheduledFutureSchedule);
            if (scheduledFutureSchedule.isDone()) {
                c1636d.f5365h.remove(c1635c0M6799z.f5350a, scheduledFutureSchedule);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void m144b() {
        C1635c0 c1635c0M6799z;
        boolean z9;
        boolean z10;
        long jMo5362e;
        C1650k c1650k = (C1650k) this.f16h;
        Object obj = this.f17i;
        C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
        if (c3351d0SnsApi == null || (c1635c0M6799z = AbstractC3165h.m6799z(obj, c3351d0SnsApi)) == null) {
            return;
        }
        String str = c1635c0M6799z.f5350a;
        synchronized (c1650k.f5431d) {
            try {
                c1650k.m4222c();
                if (c1650k.f5434g.contains(str)) {
                    z9 = true;
                } else {
                    C1648j c1648j = (C1648j) c1650k.f5433f.get(str);
                    if ((c1648j != null ? c1648j.f5410a : 0L) <= System.currentTimeMillis()) {
                        z9 = false;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z9) {
            return;
        }
        String strM4224e = c1650k.m4224e(c1635c0M6799z);
        String str2 = c1635c0M6799z.f5350a;
        if (strM4224e != null) {
            c1650k.m4225f(System.currentTimeMillis() + 3600000, str2);
            c1650k.m4221b("跳过 " + C1650k.m4220a(c1635c0M6799z.f5352c) + "：" + strM4224e);
            return;
        }
        synchronized (c1650k.f5431d) {
            try {
                c1650k.m4222c();
                if (c1650k.f5434g.contains(str2)) {
                    z10 = false;
                } else {
                    C1648j c1648j2 = (C1648j) c1650k.f5433f.get(str2);
                    if ((c1648j2 != null ? c1648j2.f5410a : 0L) > System.currentTimeMillis()) {
                        z10 = false;
                    } else {
                        c1650k.f5433f.put(str2, new C1648j(Long.MAX_VALUE));
                        z10 = true;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z10) {
            SharedPreferences sharedPreferences = c1650k.f5429b;
            if (sharedPreferences.getInt("delay_mode", 1) == 0) {
                int i9 = sharedPreferences.getInt("fixed_delay_seconds", 300);
                jMo5362e = i9 >= 0 ? i9 : 0;
            } else {
                int i10 = sharedPreferences.getInt("random_min_seconds", 60);
                long j3 = i10 >= 0 ? i10 : 0;
                long j4 = sharedPreferences.getInt("random_max_seconds", 3600);
                if (j4 < j3) {
                    j4 = j3;
                }
                jMo5362e = j3 == j4 ? j3 : AbstractC2136d.f7122g.mo5362e(j3, j4 + 1);
            }
            StringBuilder sbM1027p = AbstractC0255e.m1027p("已捕捉 ", C1650k.m4220a(c1635c0M6799z.f5352c), " 的", c1635c0M6799z.f5354e.f5374g, "朋友圈，");
            sbM1027p.append(jMo5362e);
            sbM1027p.append("秒后点赞");
            c1650k.m4221b(sbM1027p.toString());
            ScheduledFuture<?> scheduledFutureSchedule = c1650k.f5430c.schedule(new RunnableC0006d(c1650k, 14, c1635c0M6799z), jMo5362e, TimeUnit.SECONDS);
            c1650k.f5435h.put(c1635c0M6799z.f5350a, scheduledFutureSchedule);
            if (scheduledFutureSchedule.isDone()) {
                c1650k.f5435h.remove(c1635c0M6799z.f5350a, scheduledFutureSchedule);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    private final void m145c() {
        String str;
        ConcurrentHashMap concurrentHashMap;
        String strM4224e;
        C1650k c1650k = (C1650k) this.f16h;
        C1635c0 c1635c0 = (C1635c0) this.f17i;
        try {
            strM4224e = c1650k.m4224e(c1635c0);
        } finally {
            try {
                concurrentHashMap = c1650k.f5435h;
                str = c1635c0.f5350a;
            } catch (Throwable th2) {
            }
        }
        if (strM4224e != null) {
            c1650k.m4225f(System.currentTimeMillis() + 3600000, c1635c0.f5350a);
            c1650k.m4221b("取消 " + C1650k.m4220a(c1635c0.f5352c) + "：" + strM4224e);
            concurrentHashMap = c1650k.f5435h;
            str = c1635c0.f5350a;
        } else {
            C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
            if (c3351d0SnsApi == null || !c3351d0SnsApi.m7078k(c1635c0.f5356g)) {
                c1650k.m4225f(System.currentTimeMillis() + 600000, c1635c0.f5350a);
                c1650k.m4221b("点赞失败 " + C1650k.m4220a(c1635c0.f5352c) + "，稍后允许重试");
            } else {
                c1650k.m4223d(c1635c0.f5352c);
                String str2 = c1635c0.f5350a;
                synchronized (c1650k.f5431d) {
                    c1650k.f5433f.remove(str2);
                    c1650k.f5434g.add(str2);
                }
                c1650k.m4226g();
                c1650k.m4221b("点赞成功 " + C1650k.m4220a(c1635c0.f5352c) + " · " + c1635c0.f5354e.f5374g);
            }
            concurrentHashMap = c1650k.f5435h;
            str = c1635c0.f5350a;
        }
        concurrentHashMap.remove(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    private final void m146d() {
        C1635c0 c1635c0M6799z;
        Object c3959f;
        WeChatContact weChatContactM3725n;
        String strDisplayName;
        C1633b0 c1633b0 = (C1633b0) this.f16h;
        Object obj = this.f17i;
        C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
        if (c3351d0SnsApi == null || (c1635c0M6799z = AbstractC3165h.m6799z(obj, c3351d0SnsApi)) == null) {
            return;
        }
        long j3 = c1633b0.f5340c.getLong("enabled_at_seconds", 0L);
        long j4 = c1635c0M6799z.f5353d;
        if (j4 <= 0 || j3 <= 0 || j4 < j3 || !AbstractC3754e0.m7876S(c1633b0.f5340c.getString("targets", HttpUrl.FRAGMENT_ENCODE_SET)).contains(c1635c0M6799z.f5352c)) {
            return;
        }
        String str = c1635c0M6799z.f5350a;
        synchronized (c1633b0.f5343f) {
            if (c1633b0.f5343f.add(str)) {
                List listM8407P1 = AbstractC4166m.m8407P1(c1633b0.f5343f);
                JSONArray jSONArray = new JSONArray();
                Iterator it = listM8407P1.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                c1633b0.f5340c.edit().putString("notified_ids", jSONArray.toString()).commit();
                String str2 = c1635c0M6799z.f5352c;
                C1368i c1368iM9259c = AbstractC4855en.m9259c();
                if (c1368iM9259c != null && (weChatContactM3725n = c1368iM9259c.m3725n(str2)) != null && (strDisplayName = weChatContactM3725n.displayName()) != null) {
                    if (AbstractC3149m.m6721t0(strDisplayName)) {
                        strDisplayName = str2;
                    }
                    if (strDisplayName != null) {
                        str2 = strDisplayName;
                    }
                }
                String string = c1633b0.f5340c.getString("title_template", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string == null) {
                    string = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String strM4156a = C1633b0.m4156a(c1635c0M6799z, string, str2);
                if (AbstractC3149m.m6721t0(strM4156a)) {
                    strM4156a = "📣 指定好友发布朋友圈";
                }
                String string2 = c1633b0.f5340c.getString("body_template", HttpUrl.FRAGMENT_ENCODE_SET);
                if (string2 == null) {
                    string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String strM4156a2 = C1633b0.m4156a(c1635c0M6799z, string2, str2);
                if (AbstractC3149m.m6721t0(strM4156a2)) {
                    strM4156a2 = AbstractC4855en.m9265i(str2, " 发布了", c1635c0M6799z.f5354e.f5374g, "朋友圈");
                    String str3 = c1635c0M6799z.f5355f;
                    if (!AbstractC3149m.m6721t0(str3)) {
                        strM4156a2 = AbstractC4855en.m9264h(strM4156a2, "：", str3);
                    }
                }
                if (c1633b0.f5340c.getBoolean("system_notification", true)) {
                    try {
                        c1633b0.m4158c(c1635c0M6799z, strM4156a, strM4156a2);
                        c3959f = C3967n.f12976a;
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    Throwable thM8182b = C3960g.m8182b(c3959f);
                    if (thM8182b != null) {
                        c1633b0.f5338a.invoke("发送朋友圈发布通知失败", thM8182b);
                    }
                }
                if (c1633b0.f5340c.getBoolean("toast", true)) {
                    String string3 = c1633b0.f5340c.getString("toast_template", HttpUrl.FRAGMENT_ENCODE_SET);
                    if (string3 == null) {
                        string3 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    String strM4156a3 = C1633b0.m4156a(c1635c0M6799z, string3, str2);
                    if (AbstractC3149m.m6721t0(strM4156a3)) {
                        strM4156a3 = AbstractC0255e.m1022k("📣 ", str2, " 发布了", c1635c0M6799z.f5354e.f5374g, "朋友圈");
                    }
                    c1633b0.f5341d.post(new RunnableC0006d(c1633b0, 16, strM4156a3));
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final void m147e() {
        TextView textView = (TextView) this.f16h;
        int[] iArr = (int[]) this.f17i;
        float width = (textView.getWidth() - textView.getTotalPaddingLeft()) - textView.getTotalPaddingRight();
        if (width < 1.0f) {
            width = 1.0f;
        }
        float fM7907q = AbstractC3754e0.m7907q(textView.getPaint().measureText(textView.getText().toString()), 1.0f, width);
        float totalPaddingLeft = textView.getTotalPaddingLeft();
        textView.getPaint().setShader(new LinearGradient(totalPaddingLeft, 0.0f, totalPaddingLeft + fM7907q, 0.0f, iArr[0], iArr[1], Shader.TileMode.CLAMP));
        textView.invalidate();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    private final void m148f() {
        FrameLayout frameLayout = (FrameLayout) this.f16h;
        ViewGroup viewGroup = (ViewGroup) this.f17i;
        C2374r c2374r = C2374r.f7799a;
        ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 != null) {
            Context context = frameLayout.getContext();
            context.getClass();
            if (C2374r.m5673b(context, layoutParams2, viewGroup.getWidth(), viewGroup.getHeight(), frameLayout.getWidth(), frameLayout.getHeight())) {
                frameLayout.setLayoutParams(layoutParams2);
            }
        }
        frameLayout.setVisibility(0);
        frameLayout.bringToFront();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    private final void m149g() {
        File file;
        C3121n c3121n = (C3121n) this.f16h;
        String str = (String) this.f17i;
        C3118k c3118kM6628j = c3121n.m6628j(null);
        AtomicBoolean atomicBoolean = c3121n.f10116g;
        File fileM6624c = c3121n.m6624c(c3118kM6628j);
        boolean z9 = false;
        try {
            c3121n.m6629k(str, c3118kM6628j, fileM6624c);
            if (atomicBoolean.get() && c3121n.m6625d()) {
                z9 = true;
                c3121n.f10113d.post(new RunnableC0006d(c3121n, 26, fileM6624c));
                file = new File(fileM6624c.getParentFile(), AbstractC0255e.m1020i(fileM6624c.getName(), ".part"));
            } else {
                fileM6624c.delete();
                file = new File(fileM6624c.getParentFile(), AbstractC0255e.m1020i(fileM6624c.getName(), ".part"));
            }
        } catch (Throwable th2) {
            try {
                if (atomicBoolean.get()) {
                    c3121n.f10111b.invoke("文字转语音播放失败", th2);
                    c3121n.m6630l(C3121n.m6622m("文字转语音播放失败", th2));
                }
                if (!z9) {
                    fileM6624c.delete();
                }
                file = new File(fileM6624c.getParentFile(), AbstractC0255e.m1020i(fileM6624c.getName(), ".part"));
            } catch (Throwable th3) {
                if (!z9) {
                    fileM6624c.delete();
                }
                new File(fileM6624c.getParentFile(), AbstractC0255e.m1020i(fileM6624c.getName(), ".part")).delete();
                throw th3;
            }
        }
        file.delete();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    private final void m150h() {
        Object c3959f;
        final C3121n c3121n = (C3121n) this.f16h;
        File file = (File) this.f17i;
        if (!c3121n.f10116g.get() || !c3121n.m6625d() || !file.isFile()) {
            file.delete();
            return;
        }
        c3121n.m6626g();
        final long j3 = c3121n.f10123n + 1;
        c3121n.f10123n = j3;
        MediaPlayer mediaPlayer = new MediaPlayer();
        c3121n.f10121l = mediaPlayer;
        c3121n.f10122m = file;
        try {
            mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(1).setUsage(1).build());
            mediaPlayer.setDataSource(file.getAbsolutePath());
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: ob.g
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    C3121n c3121n2 = c3121n;
                    if (j3 == c3121n2.f10123n && c3121n2.f10116g.get()) {
                        mediaPlayer2.start();
                    }
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ob.h
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    C3121n c3121n2 = c3121n;
                    if (j3 == c3121n2.f10123n) {
                        c3121n2.m6626g();
                    }
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: ob.i
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i9, int i10) {
                    C3121n c3121n2 = c3121n;
                    if (j3 == c3121n2.f10123n) {
                        c3121n2.m6630l("语音播放失败");
                        c3121n2.m6626g();
                    }
                    return true;
                }
            });
            mediaPlayer.prepareAsync();
            c3959f = C3967n.f12976a;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            c3121n.f10111b.invoke("启动文字转语音播放器失败", thM8182b);
            c3121n.m6630l("语音播放失败");
            c3121n.m6626g();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    private final void m151i() {
        C3463r c3463r = (C3463r) this.f16h;
        try {
            Toast.makeText(c3463r.f11231a, (String) this.f17i, 0).show();
        } catch (Throwable th2) {
            c3463r.m7267b("Toast失败: " + th2.getMessage());
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[IGET, IGET, INVOKE, MOVE_EXCEPTION, IGET, INVOKE, ARITH, INVOKE, IGET, CONST_STR, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:374:0x07bc  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x07bd A[Catch: all -> 0x07f6, TryCatch #14 {, blocks: (B:298:0x068c, B:372:0x07b6, B:376:0x07e4, B:375:0x07bd, B:371:0x07b0), top: B:419:0x068c }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ea  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        EnumC0234n enumC0234n;
        Object c3959f;
        Throwable thM8182b;
        Object obj;
        InputStream inputStreamOpenInputStream;
        Throwable th2;
        Throwable th3;
        byte[] bArr;
        long j3;
        Object c3959f2;
        List<Map.Entry> listM8407P1;
        Object c3959f3;
        Object obj2;
        Bitmap bitmap;
        Object c3959f4;
        String str;
        ConcurrentHashMap concurrentHashMap;
        String strM4165f;
        String strM5334h;
        String str2;
        File fileM10898d;
        Object c3959f5;
        HttpUrl.Builder builderNewBuilder;
        HttpUrl.Builder queryParameter;
        HttpUrl httpUrlBuild;
        Object c3959f6;
        int i9 = 2;
        int i10 = 1;
        boolean zBooleanValue = false;
        switch (this.f15g) {
            case 0:
                AbstractC0018a.m252p((ViewOnAttachStateChangeListenerC0011i) this.f16h, (LongSparseArray) this.f17i);
                return;
            case 1:
                SharedPreferencesC0062o sharedPreferencesC0062o = (SharedPreferencesC0062o) this.f16h;
                AbstractC2043a.m5040n(new File(sharedPreferencesC0062o.f191a + sharedPreferencesC0062o.f192b, (String) this.f17i));
                return;
            case 2:
                ExecutorC0064q executorC0064q = (ExecutorC0064q) this.f16h;
                try {
                    ((Runnable) this.f17i).run();
                    return;
                } finally {
                    executorC0064q.m434a();
                }
            case 3:
                C0224d c0224d = (C0224d) this.f16h;
                Uri uri = (Uri) this.f17i;
                Activity activity = c0224d.f556a;
                EnumC0234n enumC0234n2 = c0224d.f557b;
                C0238r c0238r = C0238r.f632a;
                synchronized (C0238r.class) {
                    enumC0234n2.getClass();
                    C0238r c0238r2 = C0238r.f632a;
                    File fileM947a = C0238r.m947a(activity, enumC0234n2);
                    File file = new File(fileM947a.getParentFile(), fileM947a.getName() + ".tmp");
                    try {
                        File parentFile = fileM947a.getParentFile();
                        if (parentFile != null) {
                            parentFile.mkdirs();
                        }
                        inputStreamOpenInputStream = activity.getContentResolver().openInputStream(uri);
                        try {
                        } catch (Throwable th4) {
                            th = th4;
                            c3959f = new C3959f(th);
                            thM8182b = C3960g.m8182b(c3959f);
                            if (thM8182b != null) {
                            }
                            c0224d.f556a.runOnUiThread(new RunnableC0225e(c0224d, ((Boolean) obj).booleanValue(), false ? 1 : 0));
                            return;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        enumC0234n = enumC0234n2;
                        c3959f = new C3959f(th);
                    }
                    if (inputStreamOpenInputStream == null) {
                        throw new IllegalStateException("无法读取气泡文件");
                    }
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        try {
                            bArr = new byte[8192];
                            j3 = 0;
                        } catch (Throwable th6) {
                            th = th6;
                            enumC0234n = enumC0234n2;
                        }
                        while (true) {
                            int i11 = inputStreamOpenInputStream.read(bArr);
                            if (i11 >= 0) {
                                enumC0234n = enumC0234n2;
                                j3 += (long) i11;
                                if (j3 > 33554432) {
                                    throw new IllegalStateException("气泡文件不能超过 32 MB");
                                }
                                try {
                                    fileOutputStream.write(bArr, 0, i11);
                                    enumC0234n2 = enumC0234n;
                                    i9 = 2;
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                                th = th7;
                                th3 = th;
                                throw th3;
                            }
                            try {
                                fileOutputStream.getFD().sync();
                                try {
                                    fileOutputStream.close();
                                    inputStreamOpenInputStream.close();
                                    if (!file.isFile() || file.length() <= 0) {
                                        throw new IllegalStateException("气泡文件为空");
                                    }
                                    C0235o c0235oM948b = C0238r.m948b(file);
                                    if (c0235oM948b == null) {
                                        throw new IllegalStateException("无法解析气泡图片");
                                    }
                                    try {
                                        Path path = file.toPath();
                                        Path path2 = fileM947a.toPath();
                                        CopyOption[] copyOptionArr = new CopyOption[i9];
                                        copyOptionArr[0] = StandardCopyOption.ATOMIC_MOVE;
                                        copyOptionArr[1] = StandardCopyOption.REPLACE_EXISTING;
                                        c3959f2 = Files.move(path, path2, copyOptionArr);
                                    } catch (Throwable th8) {
                                        c3959f2 = new C3959f(th8);
                                    }
                                    if (C3960g.m8182b(c3959f2) != null) {
                                        if (fileM947a.exists() && !fileM947a.delete()) {
                                            throw new IllegalStateException("旧气泡文件删除失败");
                                        }
                                        if (!file.renameTo(fileM947a)) {
                                            throw new IllegalStateException("气泡文件替换失败");
                                        }
                                    }
                                    C0238r.f633b.put(enumC0234n2, new C0236p(fileM947a.lastModified(), fileM947a.length(), c0235oM948b));
                                    enumC0234n = enumC0234n2;
                                    c3959f = Boolean.TRUE;
                                    break;
                                } catch (Throwable th9) {
                                    th2 = th9;
                                    enumC0234n = enumC0234n2;
                                    try {
                                        throw th2;
                                    } catch (Throwable th10) {
                                        AbstractC2043a.m5035i(inputStreamOpenInputStream, th2);
                                        throw th10;
                                    }
                                }
                            } catch (Throwable th11) {
                                th3 = th11;
                                enumC0234n = enumC0234n2;
                                try {
                                    throw th3;
                                } catch (Throwable th12) {
                                    try {
                                        AbstractC2043a.m5035i(fileOutputStream, th3);
                                        throw th12;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        th2 = th;
                                        throw th2;
                                    }
                                }
                            }
                        }
                        thM8182b = C3960g.m8182b(c3959f);
                        if (thM8182b != null) {
                            obj = c3959f;
                        } else {
                            file.delete();
                            AbstractC1184v0.m3204n("[Hchat:MessageBubble] 保存" + enumC0234n.f615h + "失败: " + thM8182b.getMessage(), thM8182b);
                            obj = Boolean.FALSE;
                        }
                    } catch (Throwable th14) {
                        th = th14;
                        enumC0234n = enumC0234n2;
                    }
                }
                c0224d.f556a.runOnUiThread(new RunnableC0225e(c0224d, ((Boolean) obj).booleanValue(), false ? 1 : 0));
                return;
            case 4:
                C0245g c0245g = (C0245g) this.f16h;
                String str3 = (String) this.f17i;
                Map map = c0245g.f657g;
                map.getClass();
                synchronized (map) {
                    listM8407P1 = AbstractC4166m.m8407P1(c0245g.f657g.entrySet());
                }
                for (Map.Entry entry : listM8407P1) {
                    TextView textView = (TextView) entry.getKey();
                    if (AbstractC1416l.m3825a((String) entry.getValue(), str3)) {
                        textView.getClass();
                        C0250l c0250l = c0245g.f652b;
                        if (c0250l.f694a.getBoolean("enable", false)) {
                            c0245g.m980c(textView, str3, c0250l.m1001a(str3));
                        } else {
                            C0245g.m976j(textView);
                        }
                        if (c0245g.f653c.f6870a.getBoolean("enable", false)) {
                            c0245g.m979b(textView);
                        } else {
                            C0245g.m975i(textView);
                        }
                    }
                }
                return;
            case 5:
                C0276d0.m1113i((InterfaceC4316l) this.f16h, (C4322r) this.f17i);
                return;
            case 6:
                C0744e c0744e = (C0744e) this.f16h;
                Uri uri2 = (Uri) this.f17i;
                Activity activity2 = c0744e.f2212a;
                String str4 = c0744e.f2213b;
                boolean z9 = c0744e.f2214c;
                ConcurrentHashMap concurrentHashMap2 = AbstractC0754o.f2253a;
                synchronized (AbstractC0754o.class) {
                    activity2.getClass();
                    str4.getClass();
                    String string = AbstractC3149m.m6703R0(str4).toString();
                    if (string.length() != 0) {
                        try {
                            Bitmap bitmapM1946c = AbstractC0754o.m1946c(activity2, uri2);
                            if (bitmapM1946c == null) {
                                throw new IllegalStateException("无法解析图片");
                            }
                            int iMin = Math.min(bitmapM1946c.getWidth(), bitmapM1946c.getHeight());
                            if (bitmapM1946c.getWidth() == iMin && bitmapM1946c.getHeight() == iMin) {
                                bitmap = bitmapM1946c;
                            } else {
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapM1946c, (bitmapM1946c.getWidth() - iMin) / 2, (bitmapM1946c.getHeight() - iMin) / 2, iMin, iMin);
                                bitmapCreateBitmap.getClass();
                                bitmap = bitmapCreateBitmap;
                            }
                            File fileM1944a = AbstractC0754o.m1944a(activity2, string);
                            File parentFile2 = fileM1944a.getParentFile();
                            if (parentFile2 != null) {
                                parentFile2.mkdirs();
                            }
                            File file2 = new File(fileM1944a.getParentFile(), fileM1944a.getName() + ".tmp");
                            FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
                            try {
                                if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream2)) {
                                    throw new IllegalStateException("头像写入失败");
                                }
                                fileOutputStream2.getFD().sync();
                                fileOutputStream2.close();
                                if (!file2.isFile() || file2.length() <= 0) {
                                    throw new IllegalStateException("头像文件为空");
                                }
                                try {
                                    c3959f4 = Files.move(file2.toPath(), fileM1944a.toPath(), StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
                                } catch (Throwable th15) {
                                    c3959f4 = new C3959f(th15);
                                }
                                if (C3960g.m8182b(c3959f4) != null) {
                                    if (fileM1944a.exists() && !fileM1944a.delete()) {
                                        throw new IllegalStateException("旧头像删除失败");
                                    }
                                    if (!file2.renameTo(fileM1944a)) {
                                        throw new IllegalStateException("头像替换失败");
                                    }
                                }
                                if (z9) {
                                    Set<String> setM8411T1 = AbstractC4166m.m8411T1(AbstractC0754o.m1945b(activity2));
                                    setM8411T1.add(string);
                                    AbstractC4302b.m8640c(activity2, "Hchat_custom_friend_avatar_config").edit().putStringSet("configured_friends", setM8411T1).apply();
                                }
                                AbstractC0754o.f2253a.remove(string);
                                c3959f3 = Boolean.TRUE;
                            } finally {
                            }
                        } catch (Throwable th16) {
                            c3959f3 = new C3959f(th16);
                        }
                        Throwable thM8182b2 = C3960g.m8182b(c3959f3);
                        if (thM8182b2 == null) {
                            obj2 = c3959f3;
                        } else {
                            AbstractC1184v0.m3204n("[Hchat:CustomFriendAvatar] 保存自定义好友头像失败: wxid=" + string + ", error=" + thM8182b2.getMessage(), thM8182b2);
                            obj2 = Boolean.FALSE;
                        }
                        zBooleanValue = ((Boolean) obj2).booleanValue();
                        break;
                    }
                }
                c0744e.f2212a.runOnUiThread(new RunnableC0225e(c0744e, zBooleanValue, i10));
                return;
            case 7:
                ScriptPluginRuntime.reloadPluginFromFileChange$lambda$0$1((Context) this.f16h, (C0859c0) this.f17i);
                return;
            case 8:
                ScriptPluginRuntime.installAppBrandProcess$lambda$0((Context) this.f16h, (ScriptPluginBridge) this.f17i);
                return;
            case 9:
                ScriptWaBridge.delay$lambda$0((ScriptWaBridge) this.f16h, (Runnable) this.f17i);
                return;
            case 10:
                ScriptWaBridge.downloadVideoInternal$lambda$4((ScriptWaBridge) this.f16h, (C0901w0) this.f17i);
                return;
            case 11:
                m143a();
                return;
            case 12:
                C1636d c1636d = (C1636d) this.f16h;
                C1635c0 c1635c0 = (C1635c0) this.f17i;
                try {
                    strM4165f = c1636d.m4165f(c1635c0);
                } finally {
                    try {
                        concurrentHashMap = c1636d.f5365h;
                        str = c1635c0.f5350a;
                    } catch (Throwable th17) {
                    }
                }
                if (strM4165f == null) {
                    String strM4167h = c1636d.m4167h();
                    if (strM4167h.length() == 0) {
                        c1636d.m4166g(System.currentTimeMillis() + 3600000, c1635c0.f5350a);
                        c1636d.m4162c("取消 " + C1636d.m4160b(c1635c0.f5352c) + "：评论内容为空");
                    } else {
                        C3351d0 c3351d0SnsApi = WeChatApis.snsApi();
                        if (c3351d0SnsApi == null || !c3351d0SnsApi.m7074e(c1635c0.f5356g, strM4167h)) {
                            c1636d.m4166g(System.currentTimeMillis() + 600000, c1635c0.f5350a);
                            c1636d.m4162c("评论失败 " + C1636d.m4160b(c1635c0.f5352c) + "，稍后允许重试");
                        } else {
                            c1636d.m4164e(c1635c0.f5352c);
                            String str5 = c1635c0.f5350a;
                            synchronized (c1636d.f5361d) {
                                c1636d.f5363f.remove(str5);
                                c1636d.f5364g.add(str5);
                            }
                            c1636d.m4168i();
                            c1636d.m4162c("评论已提交 " + C1636d.m4160b(c1635c0.f5352c) + " · " + c1635c0.f5354e.f5374g);
                        }
                        concurrentHashMap = c1636d.f5365h;
                        str = c1635c0.f5350a;
                    }
                    concurrentHashMap.remove(str);
                    return;
                }
                c1636d.m4166g(System.currentTimeMillis() + 3600000, c1635c0.f5350a);
                c1636d.m4162c("取消 " + C1636d.m4160b(c1635c0.f5352c) + "：" + strM4165f);
                concurrentHashMap = c1636d.f5365h;
                str = c1635c0.f5350a;
                concurrentHashMap.remove(str);
                return;
            case 13:
                m144b();
                return;
            case 14:
                m145c();
                return;
            case 15:
                m146d();
                return;
            case 16:
                Toast.makeText(((C1633b0) this.f16h).f5339b, (String) this.f17i, 0).show();
                return;
            case 17:
                C1687k c1687k = (C1687k) this.f16h;
                String str6 = (String) this.f17i;
                C1683i c1683i = c1687k.f5606g;
                if (!AbstractC1416l.m3825a(c1683i != null ? c1683i.f5576a : null, str6)) {
                    Iterator it = c1687k.f5604e.iterator();
                    it.getClass();
                    while (it.hasNext()) {
                        C1683i c1683i2 = (C1683i) it.next();
                        if (c1683i2.f5576a.equals(str6)) {
                            it.remove();
                            InterfaceC1236q interfaceC1236q = c1683i2.f5579d;
                            if (interfaceC1236q != null) {
                                interfaceC1236q.mo734b(0, Integer.valueOf(c1683i2.f5578c), Boolean.TRUE);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                RunnableC0217c runnableC0217c = c1687k.f5608i;
                if (runnableC0217c != null) {
                    c1687k.f5602c.removeCallbacks(runnableC0217c);
                }
                c1687k.f5608i = null;
                Object obj3 = c1687k.f5607h;
                if (obj3 != null) {
                    KavaReflector.invokeMethod(obj3, "cancel", new Object[0]);
                }
                c1687k.f5607h = null;
                c1687k.f5606g = null;
                InterfaceC1236q interfaceC1236q2 = c1683i.f5579d;
                if (interfaceC1236q2 != null) {
                    interfaceC1236q2.mo734b(Integer.valueOf(c1683i.f5581f), Integer.valueOf(c1683i.f5578c), Boolean.TRUE);
                }
                c1687k.m4304n();
                return;
            case 18:
                Activity activity3 = (Activity) this.f16h;
                C1676e0 c1676e0 = (C1676e0) this.f17i;
                if (activity3.isFinishing() || activity3.isDestroyed()) {
                    return;
                }
                c1676e0.invoke();
                return;
            case 19:
                C2121e c2121e = (C2121e) this.f16h;
                JSONObject jSONObject = (JSONObject) this.f17i;
                c2121e.getClass();
                String strM5334h2 = C2121e.m5334h(jSONObject, "decodeKey", "decode_key");
                C3742g c3742g = c2121e.f7078a;
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("spec");
                if (jSONArrayOptJSONArray != null) {
                    int length = jSONArrayOptJSONArray.length();
                    for (int i12 = 0; i12 < length; i12++) {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i12);
                        if (jSONObjectOptJSONObject != null) {
                            String strM5334h3 = C2121e.m5334h(jSONObjectOptJSONObject, "codingFormat", "coding_format");
                            if (strM5334h3.equalsIgnoreCase("h265") || strM5334h3.equalsIgnoreCase("hevc")) {
                                strM5334h = C2121e.m5334h(jSONObjectOptJSONObject, "fileFormat", "file_format");
                                if (AbstractC3149m.m6721t0(strM5334h)) {
                                    strM5334h = null;
                                }
                                if (strM5334h != null) {
                                }
                            }
                        }
                    }
                    strM5334h = null;
                } else {
                    strM5334h = null;
                }
                if (strM5334h != null) {
                    String strConcat = C2121e.m5334h(jSONObject, "url").concat(C2121e.m5334h(jSONObject, "url_token", "urlToken"));
                    if (AbstractC3149m.m6721t0(strConcat)) {
                        strConcat = null;
                    }
                    if (strConcat != null) {
                        try {
                            HttpUrl httpUrl = HttpUrl.Companion.parse(strConcat);
                            c3959f5 = (httpUrl != null && (builderNewBuilder = httpUrl.newBuilder()) != null && (queryParameter = builderNewBuilder.setQueryParameter("X-snsvideoflag", strM5334h)) != null && (httpUrlBuild = queryParameter.build()) != null) ? httpUrlBuild.toString() : null;
                        } catch (Throwable th18) {
                            c3959f5 = new C3959f(th18);
                        }
                        boolean z10 = c3959f5 instanceof C3959f;
                        Object obj4 = c3959f5;
                        if (z10) {
                            obj4 = null;
                        }
                        str2 = (String) obj4;
                    } else {
                        str2 = null;
                    }
                    break;
                }
                String strM5335i = C2121e.m5335i(jSONObject);
                if (str2 != null && !AbstractC3149m.m6721t0(str2) && !AbstractC3149m.m6721t0(strM5334h2)) {
                    fileM10898d = AbstractC6133b.m10898d(c3742g.f12143a, str2, strM5334h2, "finder_video_" + System.currentTimeMillis() + ".mp4");
                } else if (AbstractC3149m.m6721t0(strM5335i)) {
                    fileM10898d = AbstractC6133b.m10898d(c3742g.f12143a, C2121e.m5330d(jSONObject), strM5334h2, "finder_video_" + System.currentTimeMillis() + ".mp4");
                } else {
                    Context context = c3742g.f12143a;
                    String str7 = "finder_video_" + System.currentTimeMillis() + ".mp4";
                    C3962i c3962i = AbstractC6133b.f24713a;
                    fileM10898d = AbstractC3149m.m6721t0(strM5335i) ? null : AbstractC6133b.m10901g(new File(AbstractC6133b.m10903i(context, "Finder"), AbstractC6133b.m10895a(str7, "finder_video", "mp4")), strM5335i, false);
                }
                c2121e.m5339k(fileM10898d != null ? "已下载视频到 Hchat/Finder" : "视频下载失败");
                return;
            case 20:
                ArrayList arrayList = (ArrayList) this.f16h;
                C2121e c2121e2 = (C2121e) this.f17i;
                int i13 = 0;
                int i14 = 0;
                for (Object obj5 : arrayList) {
                    int i15 = i13 + 1;
                    if (i13 < 0) {
                        AbstractC0000a.m32Q0();
                        throw null;
                    }
                    c2121e2.getClass();
                    String strM5330d = C2121e.m5330d((JSONObject) obj5);
                    if (strM5330d != null) {
                        Context context2 = c2121e2.f7078a.f12143a;
                        String str8 = "finder_image_" + System.currentTimeMillis() + "_" + i15 + ".png";
                        C3962i c3962i2 = AbstractC6133b.f24713a;
                        if ((AbstractC3149m.m6721t0(strM5330d) ? null : AbstractC6133b.m10901g(new File(AbstractC6133b.m10903i(context2, "Finder"), AbstractC6133b.m10895a(str8, "finder_image", AbstractC6133b.m10902h(strM5330d))), strM5330d, false)) != null) {
                            i14++;
                        }
                    }
                    i13 = i15;
                }
                c2121e2.m5339k(i14 > 0 ? AbstractC0921a.m2250m(i14, "已下载 ", " 张图片到 Hchat/Finder") : "图片下载失败");
                return;
            case 21:
                C0126e c0126e = (C0126e) this.f16h;
                Method method = (Method) c0126e.f333i;
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f17i;
                try {
                    c3959f6 = KavaReflector.invokeOrThrow(method, c0126e.f332h, new Object[0]);
                    break;
                } catch (Throwable th19) {
                    c3959f6 = new C3959f(th19);
                }
                Throwable thM8182b3 = C3960g.m8182b(c3959f6);
                if (thM8182b3 != null) {
                    interfaceC1235p.invoke("退出多选状态失败: " + method.toGenericString(), thM8182b3);
                    return;
                }
                return;
            case 22:
                m147e();
                return;
            case 23:
                m148f();
                return;
            case 24:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) ((C2911c) this.f16h).f9407d.remove(this.f17i);
                if (interfaceC1231l != null) {
                    interfaceC1231l.invoke(null);
                    return;
                }
                return;
            case 25:
                m149g();
                return;
            case 26:
                m150h();
                return;
            case 27:
                m151i();
                return;
            case 28:
                C3739d c3739d = (C3739d) this.f16h;
                String str9 = (String) this.f17i;
                c3739d.f12136g.set(false);
                Handler handler = C3740e.f12138a;
                if (C3740e.m7755b(c3739d.f12131b)) {
                    C3740e.m7757d(str9, c3739d);
                    return;
                }
                return;
            default:
                C3784h c3784h = (C3784h) this.f16h;
                View view = (View) this.f17i;
                view.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3780d(c3784h, view));
                return;
        }
    }
}
