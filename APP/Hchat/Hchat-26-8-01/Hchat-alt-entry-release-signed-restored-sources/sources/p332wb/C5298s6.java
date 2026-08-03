package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import na.C2920h;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p259r9.AbstractC3754e0;
import p276sf.C3967n;
import p345x8.C5725r;
import tf.AbstractC4166m;

/* JADX INFO: renamed from: wb.s6 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5298s6 implements InterfaceC1220a {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Object f20572A;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20573g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f20574h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ InterfaceC1809a1 f20575i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20576j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20577k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f20578l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20579m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f20580n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f20581o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f20582p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f20583q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f20584r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f20585s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f20586t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f20587u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ InterfaceC1809a1 f20588v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC1809a1 f20589w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC1809a1 f20590x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC1809a1 f20591y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f20592z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5298s6(Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117, InterfaceC1809a1 interfaceC1809a118) {
        this.f20574h = context;
        this.f20592z = sharedPreferences;
        this.f20575i = interfaceC1809a1;
        this.f20576j = interfaceC1809a12;
        this.f20577k = interfaceC1809a13;
        this.f20578l = interfaceC1809a14;
        this.f20579m = interfaceC1809a15;
        this.f20580n = interfaceC1809a16;
        this.f20581o = interfaceC1809a17;
        this.f20582p = interfaceC1809a18;
        this.f20583q = interfaceC1809a19;
        this.f20584r = interfaceC1809a110;
        this.f20585s = interfaceC1809a111;
        this.f20586t = interfaceC1809a112;
        this.f20587u = interfaceC1809a113;
        this.f20588v = interfaceC1809a114;
        this.f20589w = interfaceC1809a115;
        this.f20590x = interfaceC1809a116;
        this.f20591y = interfaceC1809a117;
        this.f20572A = interfaceC1809a118;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0119  */
    @Override // p085fg.InterfaceC1220a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        String string;
        Integer numM6742f0;
        Object next;
        int i9 = this.f20573g;
        C3967n c3967n = C3967n.f12976a;
        Object obj = this.f20572A;
        Object obj2 = this.f20592z;
        switch (i9) {
            case 0:
                SharedPreferences sharedPreferences = (SharedPreferences) obj2;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) obj;
                InterfaceC1809a1 interfaceC1809a12 = this.f20575i;
                boolean zM93u0 = AbstractC0000a.m93u0((String) interfaceC1809a12.getValue());
                Context context = this.f20574h;
                if (!zM93u0) {
                    Toast.makeText(context, "时间格式无效", 0).show();
                    break;
                } else {
                    String strM10F0 = AbstractC0000a.m10F0((String) interfaceC1809a12.getValue());
                    InterfaceC1809a1 interfaceC1809a13 = this.f20576j;
                    ArrayList arrayListM9475X4 = AbstractC4955ho.m9475X4((List) interfaceC1809a13.getValue());
                    InterfaceC1809a1 interfaceC1809a14 = this.f20577k;
                    ArrayList arrayListM9475X42 = AbstractC4955ho.m9475X4((List) interfaceC1809a14.getValue());
                    C2920h c2920h = (C2920h) AbstractC4166m.m8424v1(arrayListM9475X4);
                    String str = c2920h != null ? c2920h.f9490c : null;
                    String string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    if (str == null) {
                        str = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    int i10 = c2920h != null ? c2920h.f9489b : 0;
                    if (c2920h != null) {
                        long j3 = c2920h.f9491d;
                        if (j3 < 0) {
                            j3 = 0;
                        }
                        Integer numM6742f02 = AbstractC3156t.m6742f0((String) this.f20578l.getValue());
                        long j4 = j3;
                        int iM7909r = numM6742f02 != null ? AbstractC3754e0.m7909r(numM6742f02.intValue(), 0, 600000) : 0;
                        Integer numM6742f03 = AbstractC3156t.m6742f0((String) this.f20579m.getValue());
                        int iM7909r2 = numM6742f03 != null ? AbstractC3754e0.m7909r(numM6742f03.intValue(), iM7909r, 600000) : iM7909r;
                        SharedPreferences.Editor editorPutString = sharedPreferences.edit().putString("hb_keywords", ((Number) this.f20580n.getValue()).intValue() == 0 ? HttpUrl.FRAGMENT_ENCODE_SET : (String) this.f20581o.getValue()).putString("hb_auto_whitelist", (String) this.f20582p.getValue()).putString("hb_auto_blacklist", (String) this.f20583q.getValue()).putString("hb_wish_text", (String) this.f20584r.getValue()).putInt("hb_reply_type", i10).putString("hb_reply_templates", AbstractC4955ho.m9373K6(i10) ? str : HttpUrl.FRAGMENT_ENCODE_SET);
                        if (AbstractC4955ho.m9373K6(i10)) {
                            Iterator it = AbstractC3149m.m6691F0(str, new char[]{'|'}, 6).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    next = it.next();
                                    if (AbstractC3149m.m6703R0((String) next).toString().length() > 0) {
                                    }
                                } else {
                                    next = null;
                                }
                            }
                            String str2 = (String) next;
                            if (str2 == null || (string = AbstractC3149m.m6703R0(str2).toString()) == null) {
                                string = AbstractC3149m.m6703R0(str).toString();
                            }
                        } else {
                            string = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        SharedPreferences.Editor editorPutString2 = editorPutString.putString("hb_reply_text", string);
                        if (i10 != 0 && !AbstractC4955ho.m9373K6(i10)) {
                            string2 = AbstractC3149m.m6703R0(str).toString();
                        }
                        SharedPreferences.Editor editorPutString3 = editorPutString2.putString("hb_reply_media_paths", string2).putString("hb_reply_items_v1", AbstractC0018a.m254r(arrayListM9475X4)).putString("hb_reply_group_items_v1", AbstractC0018a.m254r(arrayListM9475X42)).putString("hb_notify_text", (String) this.f20585s.getValue()).putString("hb_notify_toast_text", (String) this.f20586t.getValue()).putString("hb_notify_failed_text", (String) this.f20587u.getValue()).putString("hb_notify_failed_toast_text", (String) this.f20588v.getValue()).putString("hb_announce_text", (String) this.f20589w.getValue()).putString("hb_time_format", strM10F0).putString("hb_notify_sound_uri", AbstractC3149m.m6703R0((String) this.f20590x.getValue()).toString());
                        InterfaceC1809a1 interfaceC1809a15 = this.f20591y;
                        SharedPreferences.Editor editorPutInt = editorPutString3.putInt("hb_auto_delay_mode", ((Number) interfaceC1809a15.getValue()).intValue()).putInt("hb_auto_delay_value", (((Number) interfaceC1809a15.getValue()).intValue() != 2 || (numM6742f0 = AbstractC3156t.m6742f0((String) interfaceC1809a1.getValue())) == null) ? 0 : AbstractC3754e0.m7909r(numM6742f0.intValue(), 0, 10000)).putInt("hb_auto_delay_random_min", iM7909r).putInt("hb_auto_delay_random_max", iM7909r2);
                        long j5 = j4 / 1000;
                        if (j5 > 2147483647L) {
                            j5 = 2147483647L;
                        }
                        editorPutInt.putInt("hb_reply_delay_value", (int) j5).putInt("hb_reply_delay_unit", 1).putBoolean("hb_reply_custom_enable", j4 > 0).putBoolean("hb_reply_random", c2920h != null ? c2920h.f9492e : false).apply();
                        interfaceC1809a13.setValue(arrayListM9475X4);
                        interfaceC1809a14.setValue(arrayListM9475X42);
                        interfaceC1809a12.setValue(strM10F0);
                        Toast.makeText(context, "设置已保存", 0).show();
                        break;
                    }
                }
                break;
            default:
                C5725r c5725r = (C5725r) obj2;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
                Context context2 = this.f20574h;
                InterfaceC1809a1 interfaceC1809a16 = this.f20575i;
                InterfaceC1809a1 interfaceC1809a17 = this.f20576j;
                if (!AbstractC4955ho.m9683v(context2, interfaceC1809a16, interfaceC1809a17)) {
                    InterfaceC1809a1 interfaceC1809a18 = this.f20577k;
                    String string3 = AbstractC3149m.m6703R0((String) interfaceC1809a18.getValue()).toString();
                    if (!AbstractC3149m.m6721t0(string3)) {
                        InterfaceC1809a1 interfaceC1809a19 = this.f20578l;
                        InterfaceC1809a1 interfaceC1809a110 = this.f20579m;
                        InterfaceC1809a1 interfaceC1809a111 = this.f20580n;
                        InterfaceC1809a1 interfaceC1809a112 = this.f20581o;
                        InterfaceC1809a1 interfaceC1809a113 = this.f20582p;
                        InterfaceC1809a1 interfaceC1809a114 = this.f20583q;
                        InterfaceC1809a1 interfaceC1809a115 = this.f20584r;
                        InterfaceC1809a1 interfaceC1809a116 = this.f20585s;
                        InterfaceC1809a1 interfaceC1809a117 = this.f20586t;
                        InterfaceC1809a1 interfaceC1809a118 = this.f20587u;
                        InterfaceC1809a1 interfaceC1809a119 = this.f20588v;
                        InterfaceC1809a1 interfaceC1809a120 = this.f20589w;
                        InterfaceC1809a1 interfaceC1809a121 = this.f20590x;
                        InterfaceC1809a1 interfaceC1809a122 = this.f20591y;
                        c5725r.m10393m(AbstractC4955ho.m9638q(interfaceC1809a19, interfaceC1809a110, interfaceC1809a111, interfaceC1809a112, interfaceC1809a16, interfaceC1809a18, interfaceC1809a113, interfaceC1809a114, interfaceC1809a115, interfaceC1809a116, interfaceC1809a117, interfaceC1809a118, interfaceC1809a119, interfaceC1809a120, interfaceC1809a121, interfaceC1809a122));
                        interfaceC1809a17.setValue("正在保存到小智控制台...");
                        AbstractC3603v.m7563q(interfaceC3599t, null, new C5018jn(string3, interfaceC1809a16, interfaceC1809a113, interfaceC1809a114, c5725r, context2, interfaceC1809a18, interfaceC1809a19, interfaceC1809a110, interfaceC1809a111, interfaceC1809a112, interfaceC1809a115, interfaceC1809a116, interfaceC1809a117, interfaceC1809a118, interfaceC1809a119, interfaceC1809a120, interfaceC1809a121, interfaceC1809a122, interfaceC1809a17, null), 3);
                    } else {
                        Toast.makeText(context2, "请先选择智能体", 0).show();
                    }
                }
                break;
        }
        return c3967n;
    }

    public /* synthetic */ C5298s6(Context context, C5725r c5725r, InterfaceC3599t interfaceC3599t, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117) {
        this.f20574h = context;
        this.f20592z = c5725r;
        this.f20572A = interfaceC3599t;
        this.f20575i = interfaceC1809a1;
        this.f20576j = interfaceC1809a12;
        this.f20577k = interfaceC1809a13;
        this.f20578l = interfaceC1809a14;
        this.f20579m = interfaceC1809a15;
        this.f20580n = interfaceC1809a16;
        this.f20581o = interfaceC1809a17;
        this.f20582p = interfaceC1809a18;
        this.f20583q = interfaceC1809a19;
        this.f20584r = interfaceC1809a110;
        this.f20585s = interfaceC1809a111;
        this.f20586t = interfaceC1809a112;
        this.f20587u = interfaceC1809a113;
        this.f20588v = interfaceC1809a114;
        this.f20589w = interfaceC1809a115;
        this.f20590x = interfaceC1809a116;
        this.f20591y = interfaceC1809a117;
    }
}
