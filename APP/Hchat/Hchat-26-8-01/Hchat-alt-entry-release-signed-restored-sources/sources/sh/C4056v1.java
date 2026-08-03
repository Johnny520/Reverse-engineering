package sh;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.widget.Toast;
import be.C0285i;
import ca.C0512c;
import gg.AbstractC1416l;
import gg.AbstractC1426v;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import na.C2921i;
import na.C2922j;
import okhttp3.HttpUrl;
import okio.C3193a;
import p007a7.AbstractC0018a;
import p010aa.C0033a;
import p020b5.C0184c;
import p036c9.C0438g;
import p036c9.C0467n0;
import p036c9.C0482r0;
import p036c9.RunnableC0496w;
import p063e9.C0832c;
import p065eb.C0859c0;
import p080fb.AbstractC1184v0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p092g4.AbstractC1341a;
import p096g8.C1360a;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.items.script.ScriptPluginRuntime;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1854l2;
import p119i2.AbstractC1938m;
import p119i2.C1922e;
import p119i2.C1926g;
import p119i2.C1936l;
import p119i2.C1939m0;
import p126ia.C2026t;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p142jg.AbstractC2136d;
import p153k8.C2351o;
import p153k8.C2352p;
import p153k8.InterfaceC2350n;
import p154k9.C2366j;
import p190n2.C2884s;
import p218og.AbstractC3149m;
import p218og.AbstractC3155s;
import p218og.AbstractC3156t;
import p219oh.AbstractC3165h;
import p227p4.C3315t;
import p258r8.C3742g;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3963j;
import p276sf.C3967n;
import p300ub.AbstractC4302b;
import p315v8.C4521a;
import p317vb.InterfaceC4544a;
import p321w.C4621n1;
import p321w.C4641v0;
import p322w0.C4665p;
import p331wa.AbstractC4699j;
import p331wa.C4696g;
import p332wb.AbstractC4955ho;
import p332wb.AbstractC5065l4;
import p332wb.C4770c3;
import p332wb.C4803d3;
import p332wb.C4895fu;
import p332wb.C4935h4;
import p332wb.C4968i4;
import p332wb.C5229q3;
import p332wb.C5259r0;
import p332wb.C5475xi;
import p345x8.C5709b;
import p346x9.C5739f;
import p357y1.C5919p0;
import tf.AbstractC4156d0;
import tf.AbstractC4167n;
import tf.C4173t;
import tf.C4175v;
import ua.C4291b;
import ua.C4296g;
import ua.C4297h;
import ua.C4298i;
import ua.C4300k;

/* JADX INFO: renamed from: sh.v1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4056v1 implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f13413g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f13414h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f13415i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4056v1(C4621n1 c4621n1, C1922e c1922e, C5919p0 c5919p0) {
        this.f13413g = 4;
        this.f13414h = c1922e;
        this.f13415i = c5919p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        C4005e2 c4005e2;
        C4005e2 c4005e22;
        boolean zM9229m;
        Object obj;
        String message;
        switch (this.f13413g) {
            case 0:
                C4060x c4060x = (C4060x) this.f13414h;
                InterfaceC1854l2 interfaceC1854l2 = (InterfaceC1854l2) this.f13415i;
                Float fValueOf = (c4060x == null || (c4005e22 = c4060x.f13436a) == null) ? null : Float.valueOf(c4005e22.f13115a);
                float f3 = -((Number) interfaceC1854l2.getValue()).floatValue();
                if ((fValueOf == null || fValueOf.floatValue() != f3) && c4060x != null && (c4005e2 = c4060x.f13436a) != null) {
                    c4005e2.f13115a = -((Number) interfaceC1854l2.getValue()).floatValue();
                }
                return C3967n.f12976a;
            case 1:
                final C3742g c3742g = (C3742g) this.f13414h;
                final C4291b c4291b = (C4291b) this.f13415i;
                boolean z9 = false;
                try {
                    C4296g c4296g = C4296g.f14286a;
                    Class clsMo3818a = AbstractC1426v.m3834a(C4291b.class).mo3818a();
                    clsMo3818a.getClass();
                    c4296g.m8631e(c3742g, new C2026t(2, c4291b, clsMo3818a, "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 25));
                    if (c4291b.f14237h == null) {
                        Context context = c3742g.f12143a;
                        Class clsMo3818a2 = AbstractC1426v.m3834a(C4291b.class).mo3818a();
                        clsMo3818a2.getClass();
                        c4291b.f14237h = new C4300k(context, new C2026t(2, c4291b, clsMo3818a2, "logError", "logError(Ljava/lang/String;Ljava/lang/Throwable;)V", 0, 0, 26));
                    }
                    if (c4291b.f14236g) {
                        z9 = true;
                    } else {
                        WeChatApis.message().getClass();
                        C2352p c2352p = WeChatApis.messageObserveApi;
                        if (c2352p != null && c2352p.m5638c()) {
                            c4291b.m7753j(c2352p.m5640e(new InterfaceC2350n() { // from class: ua.a
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                /* JADX WARN: Code restructure failed: missing block: B:308:0x050e, code lost:
                                
                                    if (r8 == false) goto L340;
                                 */
                                /* JADX WARN: Removed duplicated region for block: B:168:0x02b4  */
                                /* JADX WARN: Removed duplicated region for block: B:171:0x02c6  */
                                /* JADX WARN: Removed duplicated region for block: B:174:0x02ce  */
                                /* JADX WARN: Removed duplicated region for block: B:180:0x02dc  */
                                /* JADX WARN: Removed duplicated region for block: B:183:0x02fa  */
                                /* JADX WARN: Removed duplicated region for block: B:186:0x0302  */
                                /* JADX WARN: Removed duplicated region for block: B:190:0x0351  */
                                /* JADX WARN: Removed duplicated region for block: B:211:0x03a7  */
                                /* JADX WARN: Removed duplicated region for block: B:229:0x03ea  */
                                /* JADX WARN: Removed duplicated region for block: B:232:0x03f3  */
                                /* JADX WARN: Removed duplicated region for block: B:251:0x0457  */
                                /* JADX WARN: Removed duplicated region for block: B:282:0x04cb  */
                                /* JADX WARN: Removed duplicated region for block: B:306:0x050b  */
                                /* JADX WARN: Removed duplicated region for block: B:335:0x0584  */
                                /* JADX WARN: Removed duplicated region for block: B:342:0x0596  */
                                /* JADX WARN: Removed duplicated region for block: B:346:0x05a1  */
                                /* JADX WARN: Removed duplicated region for block: B:358:0x05cb  */
                                /* JADX WARN: Removed duplicated region for block: B:360:0x05d1  */
                                /* JADX WARN: Removed duplicated region for block: B:383:0x02ad A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:389:0x02d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:397:0x039f A[SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:412:? A[RETURN, SYNTHETIC] */
                                /* JADX WARN: Removed duplicated region for block: B:81:0x017e  */
                                /* JADX WARN: Removed duplicated region for block: B:83:0x018e  */
                                @Override // p153k8.InterfaceC2350n
                                /* JADX INFO: renamed from: a */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void mo973a(C2351o c2351o) {
                                    C4293d c4293d;
                                    List listM216B;
                                    int i9;
                                    long j3;
                                    long j4;
                                    long j5;
                                    int i10;
                                    int i11;
                                    int i12;
                                    int i13;
                                    int i14;
                                    int i15;
                                    int i16;
                                    int i17;
                                    int i18;
                                    Iterator it;
                                    long j10;
                                    Object next;
                                    C4297h c4297h;
                                    C4292c c4292cM6793t;
                                    C4292c c4292c;
                                    boolean z10;
                                    boolean z11;
                                    String str;
                                    long jMo5362e;
                                    long j11;
                                    int i19;
                                    boolean z12;
                                    Object next2;
                                    String string;
                                    int iM3181H;
                                    int iIntValue;
                                    String strM3186M;
                                    String str2 = c2351o.f7715c;
                                    String str3 = c2351o.f7716d;
                                    String strSubstring = c2351o.f7717e;
                                    if (AbstractC3149m.m6721t0(strSubstring)) {
                                        strSubstring = c2351o.f7718f;
                                    }
                                    if (c2351o.f7721i) {
                                        return;
                                    }
                                    C3315t c3315t = new C3315t(c3742g.f12143a);
                                    SharedPreferences sharedPreferences = (SharedPreferences) c3315t.f10678i;
                                    if (!c3315t.m7029w("transfer_auto_enable")) {
                                        return;
                                    }
                                    if (strSubstring == null || AbstractC3149m.m6721t0(strSubstring)) {
                                        strSubstring = HttpUrl.FRAGMENT_ENCODE_SET;
                                    } else {
                                        int iM6719r0 = AbstractC3149m.m6719r0(strSubstring, ":\n", 0, false, 6);
                                        if (iM6719r0 > 0 && AbstractC3149m.m6719r0(strSubstring, "<", iM6719r0, false, 4) > iM6719r0) {
                                            strSubstring = strSubstring.substring(iM6719r0 + 2);
                                        }
                                    }
                                    String str4 = null;
                                    if (!AbstractC3149m.m6721t0(strSubstring)) {
                                        Locale locale = Locale.US;
                                        String strM5165l = AbstractC2091b.m5165l(locale, strSubstring, locale);
                                        if (AbstractC3149m.m6709h0(strM5165l, "<wcpayinfo", false) && (AbstractC3149m.m6709h0(strM5165l, "<transferid", false) || AbstractC3149m.m6709h0(strM5165l, "<transfer_id", false) || AbstractC3149m.m6709h0(strM5165l, "<trans_id", false) || AbstractC3149m.m6709h0(strM5165l, "<transcationid", false) || AbstractC3149m.m6709h0(strM5165l, "<transactionid", false) || AbstractC3149m.m6709h0(strM5165l, "<transaction_id", false))) {
                                            String strM3186M2 = AbstractC1184v0.m3186M(strSubstring, "transcationid");
                                            if (AbstractC3149m.m6721t0(strM3186M2)) {
                                                strM3186M2 = AbstractC1184v0.m3186M(strSubstring, "transactionid");
                                            }
                                            if (AbstractC3149m.m6721t0(strM3186M2)) {
                                                strM3186M2 = AbstractC1184v0.m3186M(strSubstring, "transaction_id");
                                            }
                                            String str5 = strM3186M2;
                                            String strM3186M3 = AbstractC1184v0.m3186M(strSubstring, "transferid");
                                            if (AbstractC3149m.m6721t0(strM3186M3)) {
                                                strM3186M3 = AbstractC1184v0.m3186M(strSubstring, "transfer_id");
                                            }
                                            if (AbstractC3149m.m6721t0(strM3186M3)) {
                                                strM3186M3 = AbstractC1184v0.m3186M(strSubstring, "trans_id");
                                            }
                                            String str6 = strM3186M3;
                                            String strM3186M4 = AbstractC1184v0.m3186M(strSubstring, "payer_username");
                                            if (AbstractC3149m.m6721t0(strM3186M4)) {
                                                strM3186M4 = AbstractC1184v0.m3186M(strSubstring, "payerusername");
                                            }
                                            if (AbstractC3149m.m6721t0(strM3186M4)) {
                                                strM3186M4 = AbstractC1184v0.m3186M(strSubstring, "fromusername");
                                            }
                                            if (AbstractC3149m.m6721t0(strM3186M4)) {
                                                strM3186M4 = str3 == null ? HttpUrl.FRAGMENT_ENCODE_SET : str3;
                                            }
                                            String str7 = strM3186M4;
                                            String strM3186M5 = AbstractC1184v0.m3186M(strSubstring, "receiver_username");
                                            if (AbstractC3149m.m6721t0(strM3186M5)) {
                                                strM3186M5 = AbstractC1184v0.m3186M(strSubstring, "receiverusername");
                                            }
                                            if (AbstractC3149m.m6721t0(strM3186M5)) {
                                                strM3186M5 = AbstractC1184v0.m3186M(strSubstring, "tousername");
                                            }
                                            String str8 = strM3186M5;
                                            Integer numM6741e0 = AbstractC3156t.m6741e0(10, AbstractC1184v0.m3186M(strSubstring, "invalidtime"));
                                            int iIntValue2 = numM6741e0 != null ? numM6741e0.intValue() : 0;
                                            Integer numM6741e02 = AbstractC3156t.m6741e0(10, AbstractC1184v0.m3186M(strSubstring, "total_fee"));
                                            if (numM6741e02 != null) {
                                                iIntValue = numM6741e02.intValue();
                                            } else {
                                                Integer numM6741e03 = AbstractC3156t.m6741e0(10, AbstractC1184v0.m3186M(strSubstring, "feederval"));
                                                if (numM6741e03 != null) {
                                                    iIntValue = numM6741e03.intValue();
                                                } else {
                                                    iM3181H = (int) (AbstractC1184v0.m3181H(strSubstring) * 100.0d);
                                                    String strM3186M6 = AbstractC1184v0.m3186M(strSubstring, "paysubtype");
                                                    double dM3181H = AbstractC1184v0.m3181H(strSubstring);
                                                    strM3186M = AbstractC1184v0.m3186M(strSubstring, "transfer_attach");
                                                    if (AbstractC3149m.m6721t0(strM3186M)) {
                                                        strM3186M = AbstractC1184v0.m3186M(strSubstring, "transferattach");
                                                    }
                                                    c4293d = new C4293d(str5, str6, str7, str8, iIntValue2, iM3181H, dM3181H, strM3186M6, strM3186M, strSubstring);
                                                }
                                            }
                                            iM3181H = iIntValue;
                                            String strM3186M62 = AbstractC1184v0.m3186M(strSubstring, "paysubtype");
                                            double dM3181H2 = AbstractC1184v0.m3181H(strSubstring);
                                            strM3186M = AbstractC1184v0.m3186M(strSubstring, "transfer_attach");
                                            if (AbstractC3149m.m6721t0(strM3186M)) {
                                            }
                                            c4293d = new C4293d(str5, str6, str7, str8, iIntValue2, iM3181H, dM3181H2, strM3186M62, strM3186M, strSubstring);
                                        } else {
                                            c4293d = null;
                                        }
                                    }
                                    if (c4293d == null) {
                                        return;
                                    }
                                    String str9 = c4293d.f14272d;
                                    String str10 = c4293d.f14271c;
                                    String str11 = c4293d.f14276h;
                                    if (!AbstractC3149m.m6721t0(str11) && !AbstractC4294e.f14279a.contains(str11)) {
                                        return;
                                    }
                                    WeChatApis.contact().getClass();
                                    C1360a c1360a = WeChatApis.accountApi;
                                    String strM3652c = c1360a != null ? c1360a.m3652c() : null;
                                    if (strM3652c == null) {
                                        strM3652c = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    if (!AbstractC3149m.m6721t0(str9) && !AbstractC3149m.m6721t0(strM3652c) && !str9.equals(strM3652c)) {
                                        return;
                                    }
                                    if (!AbstractC3149m.m6721t0(strM3652c) && str10.equals(strM3652c)) {
                                        return;
                                    }
                                    String str12 = AbstractC3149m.m6721t0(str10) ? str3 : str10;
                                    String strM7031y = c3315t.m7031y("transfer_reply_items_v1", HttpUrl.FRAGMENT_ENCODE_SET);
                                    if (AbstractC3149m.m6721t0(strM7031y)) {
                                        strM7031y = null;
                                    }
                                    if (strM7031y == null || (listM216B = AbstractC0018a.m222J(strM7031y)) == null) {
                                        listM216B = c3315t.m7029w("transfer_reply_enable") ? AbstractC0018a.m216B(1, 1000L, c3315t.m7031y("transfer_reply_text", "谢谢老板"), false) : C4173t.f13710g;
                                    }
                                    List list = listM216B;
                                    boolean zM7029w = c3315t.m7029w("transfer_auto_enable");
                                    if (sharedPreferences != null) {
                                        try {
                                            i9 = sharedPreferences.getInt("transfer_delay_mode", 2);
                                        } catch (Throwable unused) {
                                            i9 = 2;
                                        }
                                    } else {
                                        i9 = 2;
                                    }
                                    long j12 = 0;
                                    if (sharedPreferences != null) {
                                        try {
                                            j3 = sharedPreferences.getLong("transfer_delay_ms", 0L);
                                        } catch (Throwable unused2) {
                                            j3 = 0;
                                        }
                                    } else {
                                        j3 = 0;
                                    }
                                    if (sharedPreferences != null) {
                                        try {
                                            j4 = sharedPreferences.getLong("transfer_delay_random_min", 0L);
                                        } catch (Throwable unused3) {
                                            j4 = 0;
                                        }
                                    } else {
                                        j4 = 0;
                                    }
                                    if (sharedPreferences != null) {
                                        try {
                                            j5 = sharedPreferences.getLong("transfer_delay_random_max", 0L);
                                        } catch (Throwable unused4) {
                                            j5 = 0;
                                        }
                                    } else {
                                        j5 = 0;
                                    }
                                    String strM7031y2 = c3315t.m7031y("transfer_receive_account", "default");
                                    if (sharedPreferences != null) {
                                        try {
                                            i10 = sharedPreferences.getInt("transfer_mode", 0);
                                        } catch (Throwable unused5) {
                                            i10 = 0;
                                        }
                                    } else {
                                        i10 = 0;
                                    }
                                    String strM7031y3 = c3315t.m7031y("transfer_whitelist", HttpUrl.FRAGMENT_ENCODE_SET);
                                    String strM7031y4 = c3315t.m7031y("transfer_blacklist", HttpUrl.FRAGMENT_ENCODE_SET);
                                    boolean zM7029w2 = c3315t.m7029w("transfer_amount_enable");
                                    if (sharedPreferences != null) {
                                        try {
                                            i11 = sharedPreferences.getInt("transfer_amount_cond", 1);
                                        } catch (Throwable unused6) {
                                            i11 = 1;
                                        }
                                    } else {
                                        i11 = 1;
                                    }
                                    String strM7031y5 = c3315t.m7031y("transfer_amount_value", "0");
                                    if (sharedPreferences != null) {
                                        i12 = 0;
                                        try {
                                            i13 = sharedPreferences.getInt("transfer_amount_action", 0);
                                        } catch (Throwable unused7) {
                                            i13 = i12;
                                        }
                                        if (sharedPreferences == null) {
                                            try {
                                                i14 = sharedPreferences.getInt("transfer_keyword_mode", i12);
                                            } catch (Throwable unused8) {
                                                i14 = 0;
                                            }
                                        } else {
                                            i14 = 0;
                                        }
                                        String strM7031y6 = c3315t.m7031y("transfer_keywords", HttpUrl.FRAGMENT_ENCODE_SET);
                                        boolean zM7029w3 = c3315t.m7029w("transfer_quiet_enable");
                                        if (sharedPreferences == null) {
                                            i15 = 0;
                                            try {
                                                i16 = sharedPreferences.getInt("transfer_quiet_start_second", 0);
                                            } catch (Throwable unused9) {
                                                i16 = i15;
                                            }
                                            if (sharedPreferences != null) {
                                                try {
                                                    i17 = sharedPreferences.getInt("transfer_quiet_end_second", i15);
                                                } catch (Throwable unused10) {
                                                    i17 = 0;
                                                }
                                            } else {
                                                i17 = 0;
                                            }
                                            boolean zM7029w4 = c3315t.m7029w("transfer_refund_rejected");
                                            boolean zM7029w5 = c3315t.m7029w("transfer_notify_system_enable");
                                            boolean zM7029w6 = c3315t.m7029w("transfer_notify_toast_enable");
                                            boolean zM7029w7 = c3315t.m7029w("transfer_notify_sound_enable");
                                            if (sharedPreferences != null) {
                                                try {
                                                    i18 = sharedPreferences.getInt("transfer_notify_sound_mode", 0);
                                                } catch (Throwable unused11) {
                                                    i18 = 0;
                                                }
                                            } else {
                                                i18 = 0;
                                            }
                                            C4292c c4292c2 = new C4292c("旧版全局设置", zM7029w, i9, j3, j4, j5, strM7031y2, i10, strM7031y3, strM7031y4, zM7029w2, i11, strM7031y5, i13, i14, strM7031y6, zM7029w3, i16, i17, zM7029w4, list, zM7029w5, zM7029w6, zM7029w7, i18, c3315t.m7029w("transfer_notify_vibrate_enable"), c3315t.m7031y("transfer_notify_sound_uri", HttpUrl.FRAGMENT_ENCODE_SET), c3315t.m7031y("transfer_notify_text", "已收款 {amount} 元"), c3315t.m7031y("transfer_notify_toast_text", "已收款 {amount} 元"), c3315t.m7029w("transfer_announce_enable"), c3315t.m7031y("transfer_announce_text", "收到转账 {amount} 元"));
                                            List listM3574E = AbstractC1341a.m3574E(c3315t.m7031y("transfer_rule_templates_v1", HttpUrl.FRAGMENT_ENCODE_SET));
                                            it = AbstractC1341a.m3572C(c3315t.m7031y("transfer_rule_bindings_v1", HttpUrl.FRAGMENT_ENCODE_SET)).iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    j10 = j12;
                                                    next = null;
                                                    break;
                                                }
                                                next = it.next();
                                                String str13 = ((C4297h) next).f14289b;
                                                if (str13 != null && !AbstractC3149m.m6721t0(str13)) {
                                                    String string2 = AbstractC3149m.m6703R0(str13).toString();
                                                    if (str2 != null) {
                                                        long j13 = j12;
                                                        string = AbstractC3149m.m6703R0(str2).toString();
                                                        j10 = j13;
                                                    } else {
                                                        j10 = j12;
                                                        string = null;
                                                    }
                                                    if (AbstractC1416l.m3825a(string2, string)) {
                                                        break;
                                                    }
                                                    if (AbstractC1416l.m3825a(string2, str12 != null ? AbstractC3149m.m6703R0(str12).toString() : null)) {
                                                        break;
                                                    }
                                                } else {
                                                    j10 = j12;
                                                }
                                                j12 = j10;
                                            }
                                            c4297h = (C4297h) next;
                                            if (c4297h != null) {
                                                String str14 = c4297h.f14290c;
                                                String str15 = c4297h.f14292e;
                                                if (!c4297h.f14291d) {
                                                    c4292cM6793t = C4292c.m8621a(c4292c2, str14);
                                                } else if (AbstractC3149m.m6721t0(str15)) {
                                                    c4292cM6793t = AbstractC3165h.m6793t(c3315t, listM3574E, c4292c2);
                                                } else {
                                                    Iterator it2 = listM3574E.iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            next2 = it2.next();
                                                            if (((C4298i) next2).f14300a.equals(str15)) {
                                                                break;
                                                            }
                                                        } else {
                                                            next2 = null;
                                                            break;
                                                        }
                                                    }
                                                    C4298i c4298i = (C4298i) next2;
                                                    c4292cM6793t = c4298i != null ? AbstractC2043a.m5027d(c4298i, str14, c4292c2) : C4292c.m8621a(c4292c2, str14);
                                                }
                                            } else {
                                                c4292cM6793t = AbstractC3165h.m6793t(c3315t, listM3574E, c4292c2);
                                            }
                                            c4292c = c4292cM6793t;
                                            if (!c4292c.f14244b) {
                                                return;
                                            }
                                            C4291b c4291b2 = c4291b;
                                            ConcurrentHashMap concurrentHashMap = c4291b2.f14235f;
                                            String strM8618n = C4291b.m8618n(c4293d);
                                            if (!strM8618n.equals("::")) {
                                                if (concurrentHashMap.size() >= 64) {
                                                    concurrentHashMap.entrySet().removeIf(new C0285i(new C0512c(System.currentTimeMillis() - 3600000, 13), 27));
                                                }
                                                if (concurrentHashMap.putIfAbsent(strM8618n, Long.valueOf(System.currentTimeMillis())) != null) {
                                                    return;
                                                }
                                            }
                                            double d10 = c4293d.f14275g;
                                            if (!AbstractC3149m.m6721t0(str10)) {
                                                str3 = str10;
                                            }
                                            if (!c2351o.f7720h) {
                                                str2.getClass();
                                                z10 = AbstractC3156t.m6733W(str2, "@chatroom", false);
                                            }
                                            boolean z13 = c4292c.f14259q;
                                            String str16 = c4292c.f14251i;
                                            String str17 = c4292c.f14252j;
                                            if (z13) {
                                                Calendar calendar = Calendar.getInstance();
                                                int i20 = calendar.get(13) + (calendar.get(12) * 60) + (calendar.get(11) * 3600);
                                                z11 = false;
                                                int iM7909r = AbstractC3754e0.m7909r(c4292c.f14260r, 0, 86399);
                                                int iM7909r2 = AbstractC3754e0.m7909r(c4292c.f14261s, 0, 86399);
                                                if (iM7909r > iM7909r2 ? i20 >= iM7909r || i20 <= iM7909r2 : iM7909r <= i20 && i20 <= iM7909r2) {
                                                    str4 = "当前处于禁收时段";
                                                }
                                                str = str4;
                                                if (c4292c.f14245c == 1) {
                                                    jMo5362e = c4292c.f14246d;
                                                    if (jMo5362e < j10) {
                                                        j11 = j10;
                                                    }
                                                    RunnableC0496w runnableC0496w = new RunnableC0496w(str, c2351o, c3315t, c4291b2, c4292c, c4293d);
                                                    if (j11 > j10) {
                                                        c4291b2.f14234e.postDelayed(runnableC0496w, j11);
                                                        return;
                                                    } else {
                                                        runnableC0496w.run();
                                                        return;
                                                    }
                                                }
                                                jMo5362e = c4292c.f14247e;
                                                if (jMo5362e < j10) {
                                                    jMo5362e = j10;
                                                }
                                                long j14 = c4292c.f14248f;
                                                if (j14 < jMo5362e) {
                                                    j14 = jMo5362e;
                                                }
                                                if (j14 > jMo5362e) {
                                                    jMo5362e = AbstractC2136d.f7122g.mo5362e(jMo5362e, j14 + 1);
                                                }
                                                j11 = jMo5362e;
                                                RunnableC0496w runnableC0496w2 = new RunnableC0496w(str, c2351o, c3315t, c4291b2, c4292c, c4293d);
                                                if (j11 > j10) {
                                                }
                                            } else {
                                                z11 = false;
                                            }
                                            int i21 = c4292c.f14250h;
                                            if (i21 != 1) {
                                                if (i21 == 2 && (C4291b.m8617l(str3, str17) || (z10 && C4291b.m8617l(str2, str17)))) {
                                                    str4 = "黑名单";
                                                } else {
                                                    if (c4292c.f14253k) {
                                                        Double dM6731U = AbstractC3155s.m6731U(c4292c.f14255m);
                                                        double dDoubleValue = dM6731U != null ? dM6731U.doubleValue() : 0.0d;
                                                        int i22 = c4292c.f14254l;
                                                        boolean z14 = (i22 == 0 ? d10 <= dDoubleValue : i22 == 2 ? Math.abs(d10 - dDoubleValue) >= 0.01d : d10 >= dDoubleValue) ? z11 : true;
                                                        int i23 = c4292c.f14256n;
                                                        str = "金额规则";
                                                        if (i23 != 0) {
                                                            if (i23 == 1) {
                                                            }
                                                        } else if (!z14) {
                                                        }
                                                    }
                                                    int i24 = c4292c.f14257o;
                                                    String str18 = c4293d.f14278j;
                                                    String str19 = c4292c.f14258p;
                                                    if (AbstractC3149m.m6721t0(str18) || AbstractC3149m.m6721t0(str19)) {
                                                        i19 = 1;
                                                        z12 = z11;
                                                        if (i24 != i19 && !z12) {
                                                            str4 = "缺少关键词";
                                                        } else if (i24 == 2 && z12) {
                                                            str4 = "关键词规则";
                                                        }
                                                    } else {
                                                        List listM6692G0 = AbstractC3149m.m6692G0(str19, new String[]{"|", ",", "，"});
                                                        ArrayList<String> arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6692G0));
                                                        Iterator it3 = listM6692G0.iterator();
                                                        while (it3.hasNext()) {
                                                            AbstractC2091b.m5171r((String) it3.next(), arrayList);
                                                        }
                                                        if (arrayList.isEmpty()) {
                                                            z12 = z11;
                                                            i19 = 1;
                                                        } else {
                                                            for (String str20 : arrayList) {
                                                                if (str20.length() > 0) {
                                                                    i19 = 1;
                                                                    if (AbstractC3149m.m6709h0(str18, str20, true)) {
                                                                        z12 = true;
                                                                        break;
                                                                    }
                                                                }
                                                            }
                                                            i19 = 1;
                                                            z12 = z11;
                                                        }
                                                        if (i24 != i19) {
                                                            if (i24 == 2) {
                                                                str4 = "关键词规则";
                                                            }
                                                        }
                                                    }
                                                }
                                                str = str4;
                                            } else {
                                                if (!C4291b.m8617l(str3, str16) && (!z10 || !C4291b.m8617l(str2, str16))) {
                                                    str4 = "非白名单";
                                                }
                                                str = str4;
                                            }
                                            if (c4292c.f14245c == 1) {
                                            }
                                            j11 = jMo5362e;
                                            RunnableC0496w runnableC0496w22 = new RunnableC0496w(str, c2351o, c3315t, c4291b2, c4292c, c4293d);
                                            if (j11 > j10) {
                                            }
                                        } else {
                                            i15 = 0;
                                        }
                                        i16 = i15;
                                        if (sharedPreferences != null) {
                                        }
                                        boolean zM7029w42 = c3315t.m7029w("transfer_refund_rejected");
                                        boolean zM7029w52 = c3315t.m7029w("transfer_notify_system_enable");
                                        boolean zM7029w62 = c3315t.m7029w("transfer_notify_toast_enable");
                                        boolean zM7029w72 = c3315t.m7029w("transfer_notify_sound_enable");
                                        if (sharedPreferences != null) {
                                        }
                                        C4292c c4292c22 = new C4292c("旧版全局设置", zM7029w, i9, j3, j4, j5, strM7031y2, i10, strM7031y3, strM7031y4, zM7029w2, i11, strM7031y5, i13, i14, strM7031y6, zM7029w3, i16, i17, zM7029w42, list, zM7029w52, zM7029w62, zM7029w72, i18, c3315t.m7029w("transfer_notify_vibrate_enable"), c3315t.m7031y("transfer_notify_sound_uri", HttpUrl.FRAGMENT_ENCODE_SET), c3315t.m7031y("transfer_notify_text", "已收款 {amount} 元"), c3315t.m7031y("transfer_notify_toast_text", "已收款 {amount} 元"), c3315t.m7029w("transfer_announce_enable"), c3315t.m7031y("transfer_announce_text", "收到转账 {amount} 元"));
                                        List listM3574E2 = AbstractC1341a.m3574E(c3315t.m7031y("transfer_rule_templates_v1", HttpUrl.FRAGMENT_ENCODE_SET));
                                        it = AbstractC1341a.m3572C(c3315t.m7031y("transfer_rule_bindings_v1", HttpUrl.FRAGMENT_ENCODE_SET)).iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                            }
                                            j12 = j10;
                                        }
                                        c4297h = (C4297h) next;
                                        if (c4297h != null) {
                                        }
                                        c4292c = c4292cM6793t;
                                        if (!c4292c.f14244b) {
                                        }
                                    } else {
                                        i12 = 0;
                                    }
                                    i13 = i12;
                                    if (sharedPreferences == null) {
                                    }
                                    String strM7031y62 = c3315t.m7031y("transfer_keywords", HttpUrl.FRAGMENT_ENCODE_SET);
                                    boolean zM7029w32 = c3315t.m7029w("transfer_quiet_enable");
                                    if (sharedPreferences == null) {
                                    }
                                    i16 = i15;
                                    if (sharedPreferences != null) {
                                    }
                                    boolean zM7029w422 = c3315t.m7029w("transfer_refund_rejected");
                                    boolean zM7029w522 = c3315t.m7029w("transfer_notify_system_enable");
                                    boolean zM7029w622 = c3315t.m7029w("transfer_notify_toast_enable");
                                    boolean zM7029w722 = c3315t.m7029w("transfer_notify_sound_enable");
                                    if (sharedPreferences != null) {
                                    }
                                    C4292c c4292c222 = new C4292c("旧版全局设置", zM7029w, i9, j3, j4, j5, strM7031y2, i10, strM7031y3, strM7031y4, zM7029w2, i11, strM7031y5, i13, i14, strM7031y62, zM7029w32, i16, i17, zM7029w422, list, zM7029w522, zM7029w622, zM7029w722, i18, c3315t.m7029w("transfer_notify_vibrate_enable"), c3315t.m7031y("transfer_notify_sound_uri", HttpUrl.FRAGMENT_ENCODE_SET), c3315t.m7031y("transfer_notify_text", "已收款 {amount} 元"), c3315t.m7031y("transfer_notify_toast_text", "已收款 {amount} 元"), c3315t.m7029w("transfer_announce_enable"), c3315t.m7031y("transfer_announce_text", "收到转账 {amount} 元"));
                                    List listM3574E22 = AbstractC1341a.m3574E(c3315t.m7031y("transfer_rule_templates_v1", HttpUrl.FRAGMENT_ENCODE_SET));
                                    it = AbstractC1341a.m3572C(c3315t.m7031y("transfer_rule_bindings_v1", HttpUrl.FRAGMENT_ENCODE_SET)).iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                        }
                                        j12 = j10;
                                    }
                                    c4297h = (C4297h) next;
                                    if (c4297h != null) {
                                    }
                                    c4292c = c4292cM6793t;
                                    if (!c4292c.f14244b) {
                                    }
                                }
                            }));
                            c4291b.f14236g = true;
                            z9 = true;
                        }
                        c4291b.m7750e("消息观察不可用，自动收款未安装", null);
                    }
                } catch (Throwable th2) {
                    c4291b.m7750e("自动收款安装失败", th2);
                }
                return Boolean.valueOf(z9);
            case 2:
                C2884s c2884s = (C2884s) this.f13414h;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f13415i;
                if (!C1939m0.m4812b(c2884s.f9317b, ((C2884s) interfaceC1809a1.getValue()).f9317b) || !AbstractC1416l.m3825a(c2884s.f9318c, ((C2884s) interfaceC1809a1.getValue()).f9318c)) {
                    interfaceC1809a1.setValue(c2884s);
                }
                return C3967n.f12976a;
            case 3:
                C4621n1 c4621n1 = (C4621n1) this.f13414h;
                C1926g c1926g = (C1926g) this.f13415i;
                if (c4621n1 == null) {
                    return c1926g;
                }
                C4665p c4665p = c4621n1.f15301c;
                boolean zIsEmpty = c4665p.isEmpty();
                C1926g c1926g2 = c4621n1.f15300b;
                if (!zIsEmpty) {
                    C4641v0 c4641v0 = new C4641v0(c1926g2);
                    int size = c4665p.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        ((InterfaceC1231l) c4665p.get(i9)).invoke(c4641v0);
                    }
                    c1926g2 = c4641v0.f15413b;
                }
                c4621n1.f15300b = c1926g2;
                return c1926g2 == null ? c1926g : c1926g2;
            case 4:
                C1922e c1922e = (C1922e) this.f13414h;
                C5919p0 c5919p0 = (C5919p0) this.f13415i;
                AbstractC1938m abstractC1938m = (AbstractC1938m) c1922e.f6503a;
                if (abstractC1938m instanceof C1936l) {
                    try {
                        c5919p0.m10630a(((C1936l) abstractC1938m).f6567a);
                        break;
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return C3967n.f12976a;
            case 5:
                C3742g c3742g2 = (C3742g) this.f13414h;
                C0438g c0438g = (C0438g) this.f13415i;
                try {
                    C4696g c4696g = new C4696g(c3742g2.f12145c, c3742g2.f12147e, AbstractC4302b.m8640c(c3742g2.f12143a, "Hchat_protobuf_packet_config"), new C0184c(c3742g2.f12143a, 28), new C3193a(23));
                    zM9229m = c4696g.m9229m();
                    if (zM9229m) {
                        AbstractC4699j.f15695a = c4696g;
                    }
                    break;
                } catch (Throwable th3) {
                    c0438g.m7750e("Protobuf 安装失败", th3);
                    zM9229m = false;
                }
                return Boolean.valueOf(zM9229m);
            case 6:
                C0467n0 c0467n0 = (C0467n0) this.f13414h;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f13415i;
                if (((Boolean) c0467n0.invoke()).booleanValue()) {
                    interfaceC1220a.invoke();
                }
                return C3967n.f12976a;
            case 7:
                C5475xi c5475xi = (C5475xi) this.f13414h;
                C0482r0 c0482r0 = (C0482r0) this.f13415i;
                c5475xi.invoke();
                c0482r0.invoke();
                break;
            case 8:
                C1845j1 c1845j1 = (C1845j1) this.f13414h;
                Activity activity = (Activity) this.f13415i;
                c1845j1.setValue(Boolean.TRUE);
                Toast.makeText(activity, "已同意协议，重启微信后完整启用模块功能", 1).show();
                break;
            case 9:
                List list = (List) this.f13414h;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f13415i;
                if (((Set) interfaceC1809a12.getValue()).size() == list.size()) {
                    obj = C4175v.f13712g;
                } else {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        linkedHashSet.add((String) ((C3963j) it.next()).f12971g);
                    }
                    obj = linkedHashSet;
                }
                interfaceC1809a12.setValue(obj);
                break;
            case 10:
                InterfaceC1235p interfaceC1235p = (InterfaceC1235p) this.f13414h;
                C4803d3 c4803d3 = (C4803d3) this.f13415i;
                interfaceC1235p.invoke(c4803d3.f16495a, c4803d3.f16496b);
                break;
            case 11:
                ((InterfaceC1231l) this.f13414h).invoke((InterfaceC4544a) this.f13415i);
                break;
            case 12:
                Activity activity2 = (Activity) this.f13414h;
                Context context2 = (Context) this.f13415i;
                if (activity2 != null) {
                    C5259r0 c5259r0 = C5259r0.f20316a;
                    synchronized (c5259r0) {
                        C5259r0.f20319d = activity2;
                        c5259r0.m9740a(activity2.getClass());
                        c5259r0.m9740a(Activity.class);
                        String str = "Hchat_config_" + new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US).format(new Date()) + ".json";
                        Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
                        intent.addCategory("android.intent.category.OPENABLE");
                        intent.setType("application/json");
                        intent.putExtra("android.intent.extra.TITLE", str);
                        intent.addFlags(2);
                        AbstractC4955ho.m9299B4(activity2, intent);
                        try {
                            activity2.startActivityForResult(intent, 1212371544);
                        } catch (Throwable unused2) {
                            Toast.makeText(activity2, "当前系统不支持创建配置文件", 0).show();
                        }
                        break;
                    }
                } else {
                    Toast.makeText(context2, "当前页面无法打开文件管理器", 0).show();
                }
                return C3967n.f12976a;
            case 13:
                C0859c0 c0859c0 = (C0859c0) this.f13414h;
                Context context3 = (Context) this.f13415i;
                Object objM10922callOpenSettingsIoAF18A = ScriptPluginRuntime.INSTANCE.m10922callOpenSettingsIoAF18A(c0859c0.f2626a);
                if (objM10922callOpenSettingsIoAF18A instanceof C3959f) {
                    Throwable thM8182b = C3960g.m8182b(objM10922callOpenSettingsIoAF18A);
                    if (thM8182b == null || (message = thM8182b.getMessage()) == null) {
                        message = "打开设置失败";
                    }
                    Toast.makeText(context3, message, 0).show();
                }
                return C3967n.f12976a;
            case 14:
                ((InterfaceC1231l) this.f13414h).invoke((C4770c3) this.f13415i);
                break;
            case 15:
                C2366j c2366j = (C2366j) this.f13414h;
                ((InterfaceC1809a1) this.f13415i).setValue(new C5229q3(c2366j, c2366j));
                break;
            case 16:
                ((InterfaceC1231l) this.f13414h).invoke(((C4298i) this.f13415i).f14300a);
                break;
            case 17:
                ((InterfaceC1809a1) this.f13415i).setValue(((C2922j) this.f13414h).f9512a);
                break;
            case 18:
                C2921i c2921i = (C2921i) this.f13414h;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f13415i;
                Set set = (Set) interfaceC1809a13.getValue();
                String str2 = c2921i.f9493a;
                interfaceC1809a13.setValue(set.contains(str2) ? AbstractC4156d0.m8351S((Set) interfaceC1809a13.getValue(), str2) : AbstractC4156d0.m8354V((Set) interfaceC1809a13.getValue(), str2));
                break;
            case 19:
                C0832c c0832c = (C0832c) this.f13414h;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f13415i;
                Set set2 = (Set) interfaceC1809a14.getValue();
                String str3 = c0832c.f2511b;
                interfaceC1809a14.setValue(set2.contains(str3) ? AbstractC4156d0.m8351S((Set) interfaceC1809a14.getValue(), str3) : AbstractC4156d0.m8354V((Set) interfaceC1809a14.getValue(), str3));
                break;
            case 20:
                ((InterfaceC1231l) this.f13414h).invoke(((C0832c) this.f13415i).f2511b);
                break;
            case 21:
                C0033a c0033a = (C0033a) this.f13414h;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f13415i;
                Set set3 = (Set) interfaceC1809a15.getValue();
                String str4 = c0033a.f103a;
                interfaceC1809a15.setValue(set3.contains(str4) ? AbstractC4156d0.m8351S((Set) interfaceC1809a15.getValue(), str4) : AbstractC4156d0.m8354V((Set) interfaceC1809a15.getValue(), str4));
                break;
            case 22:
                ((InterfaceC1809a1) this.f13415i).setValue(((C4298i) this.f13414h).f14300a);
                break;
            case 23:
                C4297h c4297h = (C4297h) this.f13414h;
                InterfaceC1809a1 interfaceC1809a16 = (InterfaceC1809a1) this.f13415i;
                Set set4 = (Set) interfaceC1809a16.getValue();
                String str5 = c4297h.f14288a;
                interfaceC1809a16.setValue(set4.contains(str5) ? AbstractC4156d0.m8351S((Set) interfaceC1809a16.getValue(), str5) : AbstractC4156d0.m8354V((Set) interfaceC1809a16.getValue(), str5));
                break;
            case 24:
                ((InterfaceC1231l) this.f13414h).invoke((C5739f) this.f13415i);
                break;
            case 25:
                C4521a c4521a = (C4521a) this.f13414h;
                InterfaceC1809a1 interfaceC1809a17 = (InterfaceC1809a1) this.f13415i;
                Set set5 = (Set) interfaceC1809a17.getValue();
                String str6 = c4521a.f14897a;
                interfaceC1809a17.setValue(set5.contains(str6) ? AbstractC4156d0.m8351S((Set) interfaceC1809a17.getValue(), str6) : AbstractC4156d0.m8354V((Set) interfaceC1809a17.getValue(), str6));
                break;
            case 26:
                ((InterfaceC1231l) this.f13414h).invoke(((C4895fu) this.f13415i).f17307a);
                break;
            case 27:
                C5709b c5709b = (C5709b) this.f13414h;
                InterfaceC1809a1 interfaceC1809a18 = (InterfaceC1809a1) this.f13415i;
                Set set6 = (Set) interfaceC1809a18.getValue();
                String str7 = c5709b.f23199a;
                interfaceC1809a18.setValue(set6.contains(str7) ? AbstractC4156d0.m8351S((Set) interfaceC1809a18.getValue(), str7) : AbstractC4156d0.m8354V((Set) interfaceC1809a18.getValue(), str7));
                break;
            case 28:
                ((InterfaceC1809a1) this.f13415i).setValue(((C4968i4) ((AbstractC5065l4) this.f13414h)).f17770b ? C4935h4.f17524c : C4935h4.f17523b);
                break;
            default:
                AbstractC4955ho.m9690v6((Context) this.f13414h, (String) this.f13415i);
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4056v1(Object obj, int i9, Object obj2) {
        this.f13413g = i9;
        this.f13414h = obj;
        this.f13415i = obj2;
    }
}
