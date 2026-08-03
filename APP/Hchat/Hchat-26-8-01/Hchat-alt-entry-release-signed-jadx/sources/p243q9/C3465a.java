package p243q9;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import gg.AbstractC1416l;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import okhttp3.HttpUrl;
import p024b9.C0215a;
import p036c9.C0438g;
import p065eb.C0879l0;
import p065eb.RunnableC0900w;
import p077f8.C1085e;
import p077f8.C1087g;
import p077f8.InterfaceC1084d;
import p085fg.InterfaceC1235p;
import p099h.Hchat.hooks.api.model.WeChatMessage;
import p109hb.C1695r;
import p116i.C1746e0;
import p167l8.C2529d;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p244qb.C3480a;
import p258r8.C3740e;
import p259r9.C3745a;
import p261rb.C3786b;
import p274s8.C3943c;
import p276sf.C3959f;
import p276sf.C3960g;
import p287ta.C4140c;
import p299u9.C4284c;
import p307v0.C4361a;
import p322w0.AbstractC4662m;
import p331wa.InterfaceC4697h;
import p347xa.C5742c;
import p365y9.C6007c;
import p380z8.C6125a;
import p380z8.C6129e;
import sa.InterfaceC3950d;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: q9.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3465a implements InterfaceC1084d, InterfaceC3950d, InterfaceC4697h {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f11233g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f11234h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C3465a(SharedPreferences sharedPreferences, C0438g c0438g) {
        this.f11233g = 16;
        this.f11234h = sharedPreferences;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // sa.InterfaceC3950d, p183m8.InterfaceC2814b
    /* JADX INFO: renamed from: a */
    public void mo3415a(String str) {
        ((C4140c) this.f11234h).m8330b(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p077f8.InterfaceC1084d
    /* JADX INFO: renamed from: b */
    public void mo468b(Object obj) {
        String str;
        Integer numM6741e0;
        switch (this.f11233g) {
            case 0:
                C1695r c1695r = (C1695r) this.f11234h;
                ((C1085e) obj).getClass();
                c1695r.m4327p();
                break;
            case 1:
                C3480a c3480a = (C3480a) this.f11234h;
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C1746e0(c3480a, 13), "voice_forward", "语音转发保存", null);
                break;
            case 2:
                C3745a c3745a = (C3745a) this.f11234h;
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C1746e0(c3745a, 15), "hchat_extra", "分支扩展功能", null);
                break;
            case 3:
                C3786b c3786b = (C3786b) this.f11234h;
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C1746e0(c3786b, 16), "zombie_check", "僵尸粉检测", null);
                break;
            case 4:
            case 8:
            case 10:
            case 11:
            default:
                C6129e c6129e = (C6129e) this.f11234h;
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C4361a(c6129e, 12), "call_ringtone_block", "屏蔽通话铃声", null);
                break;
            case 5:
                C3943c c3943c = (C3943c) this.f11234h;
                C1087g c1087g = (C1087g) obj;
                if (c1087g != null) {
                    if (c1087g.f3492g > 0 && (str = c1087g.f3488c) != null && !AbstractC3149m.m6721t0(str)) {
                        C2529d c2529d = WeChatMessage.Companion;
                        String str2 = c1087g.f3488c;
                        String str3 = c1087g.f3487b;
                        String str4 = c1087g.f3489d;
                        long j3 = c1087g.f3491f;
                        long j4 = j3 > 0 ? j3 * 1000 : 0L;
                        boolean z9 = c1087g.f3496k;
                        String str5 = c1087g.f3490e;
                        int iIntValue = (str5 == null || (numM6741e0 = AbstractC3156t.m6741e0(10, str5)) == null) ? 0 : numM6741e0.intValue();
                        long j5 = c1087g.f3492g;
                        String str6 = c1087g.f3493h;
                        String str7 = c1087g.f3494i;
                        c2529d.getClass();
                        c3943c.m8161N(C2529d.m5945k(str2, str3, str4, j4, z9, iIntValue, j5, str6, str7));
                        break;
                    }
                }
                break;
            case 6:
                C0215a c0215a = (C0215a) this.f11234h;
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C1746e0(c0215a, 20), "hide_chat_avatar", "隐藏头像", null);
                break;
            case 7:
                C0215a c0215a2 = (C0215a) this.f11234h;
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C1746e0(c0215a2, 24), "hide_chat_menu", "隐藏长按菜单", null);
                break;
            case 9:
                C4284c c4284c = (C4284c) this.f11234h;
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C1746e0(c4284c, 29), "hide_wechat_bottom_bar", "隐藏微信底栏", null);
                break;
            case 12:
                C5742c c5742c = (C5742c) this.f11234h;
                ((C1085e) obj).getClass();
                c5742c.m10440k();
                break;
            case 13:
                C6007c c6007c = (C6007c) this.f11234h;
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C4361a(c6007c, 10), "member_title", "群员头衔", null);
                break;
            case 14:
                C6125a c6125a = (C6125a) this.f11234h;
                ((C1085e) obj).getClass();
                C3740e.m7759f(12, new C4361a(c6125a, 11), "call_media_limit", "移除通话媒体限制", null);
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p331wa.InterfaceC4697h
    /* JADX INFO: renamed from: c */
    public void mo2205c(String str, boolean z9) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0900w((Context) this.f11234h, str, 4));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public C0879l0 m7268d(String str) {
        Object c3959f;
        SharedPreferences sharedPreferences = (SharedPreferences) this.f11234h;
        str.getClass();
        if (sharedPreferences.getBoolean("message_affix_enable", false) && !AbstractC3149m.m6721t0(str)) {
            String string = sharedPreferences.getString("message_affix_text_format", "${sendText}");
            String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (string == null) {
                string = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (AbstractC3149m.m6721t0(string)) {
                string = "${sendText}";
            }
            int i9 = 0;
            int i10 = 0;
            while (true) {
                int iM6719r0 = AbstractC3149m.m6719r0(string, "${sendText}", i9, false, 4);
                if (iM6719r0 < 0) {
                    break;
                }
                i10++;
                i9 = iM6719r0 + 11;
            }
            if (i10 == 1) {
                int iM6719r02 = AbstractC3149m.m6719r0(string, "${sendText}", 0, false, 6);
                String string2 = sharedPreferences.getString("message_affix_time_format", "HH:mm:ss");
                if (string2 != null) {
                    str2 = string2;
                }
                String string3 = AbstractC3149m.m6703R0(str2).toString();
                if (AbstractC3149m.m6721t0(string3)) {
                    string3 = "HH:mm:ss";
                }
                try {
                    c3959f = new SimpleDateFormat(string3, Locale.getDefault()).format(new Date());
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (C3960g.m8182b(c3959f) != null) {
                    c3959f = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
                }
                c3959f.getClass();
                String str3 = (String) c3959f;
                String strM6737a0 = AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(string.substring(0, iM6719r02), "${line}", "\n", false), "${sendTime}", str3, false);
                String strM6737a02 = AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(string.substring(iM6719r02 + 11), "${line}", "\n", false), "${sendTime}", str3, false);
                if (strM6737a0.length() == 0 && strM6737a02.length() == 0) {
                    return null;
                }
                return new C0879l0(strM6737a0, strM6737a02);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX INFO: renamed from: e */
    public void m7269e() {
        InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f11234h;
        synchronized (AbstractC4662m.f15512c) {
            ?? r2 = AbstractC4662m.f15517h;
            r2.getClass();
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(r2));
            boolean z9 = false;
            for (Object obj : r2) {
                boolean z10 = true;
                if (!z9 && AbstractC1416l.m3825a(obj, interfaceC1235p)) {
                    z9 = true;
                    z10 = false;
                }
                if (z10) {
                    arrayList.add(obj);
                }
            }
            AbstractC4662m.f15517h = arrayList;
        }
    }

    public /* synthetic */ C3465a(Object obj, int i9) {
        this.f11233g = i9;
        this.f11234h = obj;
    }
}
