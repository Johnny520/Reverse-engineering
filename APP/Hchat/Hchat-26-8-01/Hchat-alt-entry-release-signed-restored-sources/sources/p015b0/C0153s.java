package p015b0;

import ac.AbstractC0063p;
import android.R;
import android.app.Activity;
import android.app.RemoteAction;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import bsh.ParserConstants;
import ca.RunnableC0537x;
import ci.C0611w;
import gg.C1421q;
import gg.C1422r;
import gg.C1425u;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import okio.C3193a;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p010aa.C0035c;
import p011ab.C0041a;
import p014b.C0126e;
import p020b5.C0192k;
import p025bc.AbstractC0255e;
import p036c9.AbstractC0473o2;
import p036c9.C0414a;
import p036c9.C0419b0;
import p036c9.C0424c1;
import p036c9.C0429d2;
import p036c9.C0443h0;
import p036c9.C0446i;
import p036c9.C0450j;
import p036c9.C0452j1;
import p036c9.C0477p2;
import p036c9.C0502y;
import p057e1.C0808c;
import p065eb.C0859c0;
import p068eh.AbstractC0921a;
import p069f.C0933f0;
import p069f.C0943k0;
import p071f1.AbstractC1027s;
import p071f1.C1005h;
import p071f1.C1024q0;
import p071f1.C1034w;
import p071f1.InterfaceC1031u;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p089g1.C1275d;
import p096g8.C1368i;
import p099h.C1455f;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.hooks.items.script.ScriptWaBridge;
import p099h.Hchat.utils.KavaReflector;
import p100h0.C1511d1;
import p100h0.C1529j1;
import p100h0.C1545q0;
import p100h0.C1549s0;
import p100h0.C1557w0;
import p101h1.AbstractC1566c;
import p101h1.C1569f;
import p101h1.InterfaceC1567d;
import p106h8.C1624a;
import p109hb.C1695r;
import p116i.C1760j;
import p117i0.C1845j1;
import p117i0.InterfaceC1809a1;
import p119i2.AbstractC1923e0;
import p119i2.C1922e;
import p119i2.C1925f0;
import p119i2.C1926g;
import p119i2.C1933j0;
import p119i2.C1935k0;
import p119i2.C1939m0;
import p119i2.C1942o;
import p126ia.RunnableC2018l;
import p136j8.C2093d;
import p136j8.C2104o;
import p136j8.C2105p;
import p153k8.C2354r;
import p153k8.C2355s;
import p158l.AbstractC2412c;
import p158l.C2414e;
import p167l8.C2527b;
import p174m.C2605g3;
import p174m.C2618k;
import p174m.C2629m2;
import p174m.C2637o2;
import p177m2.AbstractC2772p;
import p177m2.C2765i;
import p177m2.C2766j;
import p177m2.C2767k;
import p184m9.C2817b;
import p184m9.C2819d;
import p184m9.C2820e;
import p184m9.EnumC2818c;
import p190n2.C2865a;
import p190n2.C2884s;
import p190n2.C2890y;
import p211o9.C3103p;
import p218og.AbstractC3149m;
import p218og.C3145i;
import p218og.InterfaceC3142f;
import p225p2.C3290b;
import p227p4.C3315t;
import p243q9.C3470f;
import p244qb.C3488i;
import p244qb.C3490k;
import p249qg.InterfaceC3596r0;
import p249qg.InterfaceC3599t;
import p251r.C3623h;
import p254r3.C3654a;
import p254r3.C3657d;
import p259r9.C3766p;
import p266s0.C3874d;
import p267s1.C3914t;
import p269s3.C3923a;
import p269s3.C3927e;
import p276sf.C3967n;
import p280t2.C4085a;
import p280t2.C4096l;
import p280t2.C4098n;
import p280t2.C4100p;
import p280t2.InterfaceC4099o;
import p307v0.C4364d;
import p307v0.C4369i;
import p315v8.C4521a;
import p315v8.C4528h;
import p315v8.C4537q;
import p321w.C4585b1;
import p321w.C4618m1;
import p321w.C4629q0;
import p321w.C4630q1;
import p321w.EnumC4617m0;
import p321w.EnumC4643w0;
import p332wb.AbstractC4855en;
import p332wb.AbstractC4955ho;
import p332wb.AbstractC5193p0;
import p332wb.C4792cp;
import p332wb.C4804d4;
import p332wb.C5026jv;
import p332wb.C5326t1;
import p332wb.C5463x6;
import p355y.C5838a;
import p372z.AbstractC6054b;
import p372z.AbstractC6057e;
import p372z.C6055c;
import p372z.C6056d;
import p372z.C6058f;
import p372z.C6060h;
import p372z.InterfaceC6059g;
import qa.AbstractC3476d;
import qa.C3478f;
import qa.EnumC3474b;
import sh.C4005e2;
import tf.AbstractC4166m;
import tf.C4173t;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: b0.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0153s implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f406g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f407h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f408i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f409j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0153s(Context context, ClassLoader classLoader, String str) {
        this.f406g = 9;
        this.f408i = context;
        this.f407h = classLoader;
        this.f409j = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    private final Object m733e(Object obj) {
        Integer numM4054e;
        Integer numM4053d;
        Integer numM4053d2;
        Integer numM4054e2;
        C1935k0 c1935k0;
        C1935k0 c1935k02;
        C4618m1 c4618m1;
        C4618m1 c4618m12;
        C1935k0 c1935k03;
        C1935k0 c1935k04;
        C4618m1 c4618m13;
        C4618m1 c4618m14;
        Integer numM4053d3;
        Integer numM4054e3;
        Integer numM4054e4;
        Integer numM4053d4;
        C3315t c3315t;
        EnumC4617m0 enumC4617m0 = (EnumC4617m0) this.f407h;
        C4585b1 c4585b1 = (C4585b1) this.f408i;
        C1421q c1421q = (C1421q) this.f409j;
        C1549s0 c1549s0 = (C1549s0) obj;
        int i9 = 14;
        C2884s c2884s = null;
        switch (enumC4617m0.ordinal()) {
            case 0:
                c1549s0.f5169e.f5103a = null;
                if (c1549s0.f5171g.f6529h.length() > 0) {
                    if (!C1939m0.m4813c(c1549s0.f5170f)) {
                        boolean zM4055f = c1549s0.m4055f();
                        long j3 = c1549s0.f5170f;
                        if (!zM4055f) {
                            int iM4815e = C1939m0.m4815e(j3);
                            c1549s0.m4066q(iM4815e, iM4815e);
                        } else {
                            int iM4816f = C1939m0.m4816f(j3);
                            c1549s0.m4066q(iM4816f, iM4816f);
                        }
                    } else {
                        c1549s0.m4058i();
                    }
                }
                break;
            case 1:
                c1549s0.f5169e.f5103a = null;
                if (c1549s0.f5171g.f6529h.length() > 0) {
                    if (!C1939m0.m4813c(c1549s0.f5170f)) {
                        boolean zM4055f2 = c1549s0.m4055f();
                        long j4 = c1549s0.f5170f;
                        if (!zM4055f2) {
                            int iM4816f2 = C1939m0.m4816f(j4);
                            c1549s0.m4066q(iM4816f2, iM4816f2);
                        } else {
                            int iM4815e2 = C1939m0.m4815e(j4);
                            c1549s0.m4066q(iM4815e2, iM4815e2);
                        }
                    } else {
                        c1549s0.m4062m();
                    }
                }
                break;
            case 2:
                C1529j1 c1529j1 = c1549s0.f5169e;
                c1529j1.f5103a = null;
                C1926g c1926g = c1549s0.f5171g;
                String str = c1926g.f6529h;
                String str2 = c1926g.f6529h;
                if (str.length() > 0) {
                    if (!c1549s0.m4055f()) {
                        c1529j1.f5103a = null;
                        if (str2.length() > 0 && (numM4054e = c1549s0.m4054e()) != null) {
                            int iIntValue = numM4054e.intValue();
                            c1549s0.m4066q(iIntValue, iIntValue);
                        }
                    } else {
                        c1529j1.f5103a = null;
                        if (str2.length() > 0 && (numM4053d = c1549s0.m4053d()) != null) {
                            int iIntValue2 = numM4053d.intValue();
                            c1549s0.m4066q(iIntValue2, iIntValue2);
                        }
                    }
                }
                break;
            case 3:
                C1529j1 c1529j12 = c1549s0.f5169e;
                c1529j12.f5103a = null;
                C1926g c1926g2 = c1549s0.f5171g;
                String str3 = c1926g2.f6529h;
                String str4 = c1926g2.f6529h;
                if (str3.length() > 0) {
                    if (!c1549s0.m4055f()) {
                        c1529j12.f5103a = null;
                        if (str4.length() > 0 && (numM4053d2 = c1549s0.m4053d()) != null) {
                            int iIntValue3 = numM4053d2.intValue();
                            c1549s0.m4066q(iIntValue3, iIntValue3);
                        }
                    } else {
                        c1529j12.f5103a = null;
                        if (str4.length() > 0 && (numM4054e2 = c1549s0.m4054e()) != null) {
                            int iIntValue4 = numM4054e2.intValue();
                            c1549s0.m4066q(iIntValue4, iIntValue4);
                        }
                    }
                }
                break;
            case 4:
                c1549s0.m4059j();
                break;
            case 5:
                c1549s0.m4061l();
                break;
            case 6:
                c1549s0.m4064o();
                break;
            case 7:
                c1549s0.m4063n();
                break;
            case 8:
                c1549s0.f5169e.f5103a = null;
                if (c1549s0.f5171g.f6529h.length() > 0) {
                    if (!c1549s0.m4055f()) {
                        c1549s0.m4063n();
                    } else {
                        c1549s0.m4064o();
                    }
                }
                break;
            case 9:
                c1549s0.f5169e.f5103a = null;
                if (c1549s0.f5171g.f6529h.length() > 0) {
                    if (!c1549s0.m4055f()) {
                        c1549s0.m4064o();
                    } else {
                        c1549s0.m4063n();
                    }
                }
                break;
            case 10:
                if (c1549s0.f5171g.f6529h.length() > 0 && (c1935k0 = c1549s0.f5167c) != null) {
                    int iM4056g = c1549s0.m4056g(c1935k0, -1);
                    c1549s0.m4066q(iM4056g, iM4056g);
                }
                break;
            case 11:
                if (c1549s0.f5171g.f6529h.length() > 0 && (c1935k02 = c1549s0.f5167c) != null) {
                    int iM4056g2 = c1549s0.m4056g(c1935k02, 1);
                    c1549s0.m4066q(iM4056g2, iM4056g2);
                }
                break;
            case 12:
            case 48:
                break;
            case 13:
                if (c1549s0.f5171g.f6529h.length() > 0 && (c4618m1 = c1549s0.f5173i) != null) {
                    int iM4057h = c1549s0.m4057h(c4618m1, -1);
                    c1549s0.m4066q(iM4057h, iM4057h);
                }
                break;
            case 14:
                if (c1549s0.f5171g.f6529h.length() > 0 && (c4618m12 = c1549s0.f5173i) != null) {
                    int iM4057h2 = c1549s0.m4057h(c4618m12, 1);
                    c1549s0.m4066q(iM4057h2, iM4057h2);
                }
                break;
            case 15:
                c1549s0.f5169e.f5103a = null;
                if (c1549s0.f5171g.f6529h.length() > 0) {
                    c1549s0.m4066q(0, 0);
                }
                break;
            case 16:
                c1549s0.f5169e.f5103a = null;
                C1926g c1926g3 = c1549s0.f5171g;
                if (c1926g3.f6529h.length() > 0) {
                    int length = c1926g3.f6529h.length();
                    c1549s0.m4066q(length, length);
                }
                break;
            case 17:
                c4585b1.f15102b.m4019d(false);
                break;
            case 18:
                c4585b1.f15102b.m4030p();
                break;
            case 19:
                c4585b1.f15102b.m4020f();
                break;
            case 20:
                List listM4050a = c1549s0.m4050a(new C3766p(20));
                if (listM4050a != null) {
                    c4585b1.m9029a(listM4050a);
                }
                break;
            case 21:
                List listM4050a2 = c1549s0.m4050a(new C3766p(21));
                if (listM4050a2 != null) {
                    c4585b1.m9029a(listM4050a2);
                }
                break;
            case 22:
                List listM4050a3 = c1549s0.m4050a(new C3766p(22));
                if (listM4050a3 != null) {
                    c4585b1.m9029a(listM4050a3);
                }
                break;
            case 23:
                List listM4050a4 = c1549s0.m4050a(new C3766p(23));
                if (listM4050a4 != null) {
                    c4585b1.m9029a(listM4050a4);
                }
                break;
            case 24:
                List listM4050a5 = c1549s0.m4050a(new C3766p(24));
                if (listM4050a5 != null) {
                    c4585b1.m9029a(listM4050a5);
                }
                break;
            case 25:
                List listM4050a6 = c1549s0.m4050a(new C3766p(25));
                if (listM4050a6 != null) {
                    c4585b1.m9029a(listM4050a6);
                }
                break;
            case 26:
                c1549s0.f5169e.f5103a = null;
                C1926g c1926g4 = c1549s0.f5171g;
                if (c1926g4.f6529h.length() > 0) {
                    c1549s0.m4066q(0, c1926g4.f6529h.length());
                }
                break;
            case 27:
                c1549s0.m4058i();
                c1549s0.m4065p();
                break;
            case 28:
                c1549s0.m4062m();
                c1549s0.m4065p();
                break;
            case 29:
                if (c1549s0.f5171g.f6529h.length() > 0 && (c1935k03 = c1549s0.f5167c) != null) {
                    int iM4056g3 = c1549s0.m4056g(c1935k03, -1);
                    c1549s0.m4066q(iM4056g3, iM4056g3);
                }
                c1549s0.m4065p();
                break;
            case 30:
                if (c1549s0.f5171g.f6529h.length() > 0 && (c1935k04 = c1549s0.f5167c) != null) {
                    int iM4056g4 = c1549s0.m4056g(c1935k04, 1);
                    c1549s0.m4066q(iM4056g4, iM4056g4);
                }
                c1549s0.m4065p();
                break;
            case 31:
                if (c1549s0.f5171g.f6529h.length() > 0 && (c4618m13 = c1549s0.f5173i) != null) {
                    int iM4057h3 = c1549s0.m4057h(c4618m13, -1);
                    c1549s0.m4066q(iM4057h3, iM4057h3);
                }
                c1549s0.m4065p();
                break;
            case 32:
                if (c1549s0.f5171g.f6529h.length() > 0 && (c4618m14 = c1549s0.f5173i) != null) {
                    int iM4057h4 = c1549s0.m4057h(c4618m14, 1);
                    c1549s0.m4066q(iM4057h4, iM4057h4);
                }
                c1549s0.m4065p();
                break;
            case 33:
                c1549s0.f5169e.f5103a = null;
                if (c1549s0.f5171g.f6529h.length() > 0) {
                    c1549s0.m4066q(0, 0);
                }
                c1549s0.m4065p();
                break;
            case 34:
                c1549s0.f5169e.f5103a = null;
                C1926g c1926g5 = c1549s0.f5171g;
                if (c1926g5.f6529h.length() > 0) {
                    int length2 = c1926g5.f6529h.length();
                    c1549s0.m4066q(length2, length2);
                }
                c1549s0.m4065p();
                break;
            case 35:
                C1529j1 c1529j13 = c1549s0.f5169e;
                c1529j13.f5103a = null;
                C1926g c1926g6 = c1549s0.f5171g;
                String str5 = c1926g6.f6529h;
                String str6 = c1926g6.f6529h;
                if (str5.length() > 0) {
                    if (c1549s0.m4055f()) {
                        c1529j13.f5103a = null;
                        if (str6.length() > 0 && (numM4054e3 = c1549s0.m4054e()) != null) {
                            int iIntValue5 = numM4054e3.intValue();
                            c1549s0.m4066q(iIntValue5, iIntValue5);
                        }
                    } else {
                        c1529j13.f5103a = null;
                        if (str6.length() > 0 && (numM4053d3 = c1549s0.m4053d()) != null) {
                            int iIntValue6 = numM4053d3.intValue();
                            c1549s0.m4066q(iIntValue6, iIntValue6);
                        }
                    }
                }
                c1549s0.m4065p();
                break;
            case 36:
                C1529j1 c1529j14 = c1549s0.f5169e;
                c1529j14.f5103a = null;
                C1926g c1926g7 = c1549s0.f5171g;
                String str7 = c1926g7.f6529h;
                String str8 = c1926g7.f6529h;
                if (str7.length() > 0) {
                    if (c1549s0.m4055f()) {
                        c1529j14.f5103a = null;
                        if (str8.length() > 0 && (numM4053d4 = c1549s0.m4053d()) != null) {
                            int iIntValue7 = numM4053d4.intValue();
                            c1549s0.m4066q(iIntValue7, iIntValue7);
                        }
                    } else {
                        c1529j14.f5103a = null;
                        if (str8.length() > 0 && (numM4054e4 = c1549s0.m4054e()) != null) {
                            int iIntValue8 = numM4054e4.intValue();
                            c1549s0.m4066q(iIntValue8, iIntValue8);
                        }
                    }
                }
                c1549s0.m4065p();
                break;
            case 37:
                c1549s0.m4059j();
                c1549s0.m4065p();
                break;
            case 38:
                c1549s0.m4061l();
                c1549s0.m4065p();
                break;
            case 39:
                c1549s0.m4064o();
                c1549s0.m4065p();
                break;
            case 40:
                c1549s0.m4063n();
                c1549s0.m4065p();
                break;
            case 41:
                c1549s0.f5169e.f5103a = null;
                if (c1549s0.f5171g.f6529h.length() > 0) {
                    if (c1549s0.m4055f()) {
                        c1549s0.m4064o();
                    } else {
                        c1549s0.m4063n();
                    }
                }
                c1549s0.m4065p();
                break;
            case 42:
                c1549s0.f5169e.f5103a = null;
                if (c1549s0.f5171g.f6529h.length() > 0) {
                    if (c1549s0.m4055f()) {
                        c1549s0.m4063n();
                    } else {
                        c1549s0.m4064o();
                    }
                }
                c1549s0.m4065p();
                break;
            case 43:
                c1549s0.f5169e.f5103a = null;
                if (c1549s0.f5171g.f6529h.length() > 0) {
                    long j5 = c1549s0.f5170f;
                    int i10 = C1939m0.f6574c;
                    int i11 = (int) (j5 & 4294967295L);
                    c1549s0.m4066q(i11, i11);
                }
                break;
            case 44:
                if (!c4585b1.f15105e) {
                    c4585b1.m9029a(AbstractC0000a.m99x0(new C2865a("\n", 1)));
                } else {
                    c1421q.f4734g = c4585b1.f15101a.f15349x.f15415h.f15343r.m795M(c4585b1.f15112l);
                }
                break;
            case ParserConstants.PROTECTED /* 45 */:
                if (!c4585b1.f15105e) {
                    c4585b1.m9029a(AbstractC0000a.m99x0(new C2865a("\t", 1)));
                } else {
                    c1421q.f4734g = false;
                }
                break;
            case 46:
                C4630q1 c4630q1 = c4585b1.f15108h;
                if (c4630q1 != null) {
                    c4630q1.m9054a(C2884s.m6290a(c1549s0.f5172h, c1549s0.f5171g, c1549s0.f5170f, 4));
                }
                C4630q1 c4630q12 = c4585b1.f15108h;
                if (c4630q12 != null) {
                    C3315t c3315t2 = c4630q12.f15352a;
                    if (c3315t2 != null && (c3315t = (C3315t) c3315t2.f10677h) != null) {
                        c4630q12.f15352a = c3315t;
                        c4630q12.f15354c -= ((C2884s) c3315t2.f10678i).f9316a.f6529h.length();
                        c4630q12.f15353b = new C3315t(c4630q12.f15353b, i9, (C2884s) c3315t2.f10678i);
                        c2884s = (C2884s) c3315t.f10678i;
                    }
                    if (c2884s != null) {
                        c4585b1.f15111k.invoke(c2884s);
                    }
                }
                break;
            case 47:
                C4630q1 c4630q13 = c4585b1.f15108h;
                if (c4630q13 != null) {
                    C3315t c3315t3 = c4630q13.f15353b;
                    if (c3315t3 != null) {
                        c4630q13.f15353b = (C3315t) c3315t3.f10677h;
                        C2884s c2884s2 = (C2884s) c3315t3.f10678i;
                        c4630q13.f15352a = new C3315t(c4630q13.f15352a, i9, c2884s2);
                        c4630q13.f15354c = c2884s2.f9316a.f6529h.length() + c4630q13.f15354c;
                        c2884s = (C2884s) c3315t3.f10678i;
                    }
                    if (c2884s != null) {
                        c4585b1.f15111k.invoke(c2884s);
                    }
                }
                break;
            default:
                C3193a.m6822k();
                return null;
        }
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v33, resolved type: s0.d */
    /* JADX DEBUG: Multi-variable search result rejected for r11v4, resolved type: s0.d */
    /* JADX DEBUG: Multi-variable search result rejected for r11v5, resolved type: s0.d */
    /* JADX DEBUG: Multi-variable search result rejected for r12v10, resolved type: s0.d */
    /* JADX DEBUG: Multi-variable search result rejected for r12v54, resolved type: s0.d */
    /* JADX DEBUG: Multi-variable search result rejected for r12v9, resolved type: s0.d */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: s0.d */
    /* JADX DEBUG: Multi-variable search result rejected for r3v73, resolved type: s0.d */
    /* JADX DEBUG: Multi-variable search result rejected for r3v74, resolved type: s0.d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0b6c  */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z9;
        C4629q0 c4629q0;
        String str;
        InterfaceC1031u interfaceC1031u;
        C1922e c1922e;
        Map mapSingletonMap;
        int i9 = this.f406g;
        List list = C4173t.f13710g;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        char c10 = ' ';
        InterfaceC5557c interfaceC5557c = null;
        C3967n c3967n = C3967n.f12976a;
        Object obj2 = this.f408i;
        ?? r14 = this.f409j;
        Object obj3 = this.f407h;
        switch (i9) {
            case 0:
                Context context = (Context) obj2;
                InterfaceC6059g interfaceC6059g = (InterfaceC6059g) r14;
                C2414e c2414e = (C2414e) obj;
                ?? r2 = ((C6055c) obj3).f24520a;
                int size = r2.size();
                int i10 = 0;
                while (i10 < size) {
                    AbstractC6054b abstractC6054b = (AbstractC6054b) r2.get(i10);
                    if (abstractC6054b instanceof C6056d) {
                        C6056d c6056d = (C6056d) abstractC6054b;
                        int i11 = 0;
                        C2414e.m5751b(c2414e, new C0154t(c6056d, i11), c6056d.f24522c == 0 ? interfaceC5557c : new C3874d(-1930700965, new C0155u(c6056d, i11), true), new C0035c(c6056d, 3, interfaceC6059g), 6);
                    } else {
                        if (abstractC6054b instanceof C6060h) {
                            if (Build.VERSION.SDK_INT >= 28) {
                                C6060h c6060h = (C6060h) abstractC6054b;
                                if (context != null) {
                                    int i12 = c6060h.f24531c;
                                    TextClassification textClassification = c6060h.f24530b;
                                    if (i12 < 0) {
                                        C0154t c0154t = new C0154t(textClassification, i);
                                        Drawable icon = textClassification.getIcon();
                                        C2414e.m5751b(c2414e, c0154t, icon != null ? new C3874d(-1123224187, new C0155u(icon, i), true) : interfaceC5557c, new C0035c(context, 4, textClassification), 6);
                                    } else {
                                        RemoteAction remoteAction = (RemoteAction) textClassification.getActions().get(i12);
                                        boolean z10 = i12 == 0;
                                        int i13 = 2;
                                        C0154t c0154t2 = new C0154t(remoteAction, i13);
                                        if (!z10) {
                                            C3874d c3874d = interfaceC5557c;
                                            if (remoteAction.shouldShowIcon()) {
                                                c3874d = new C3874d(-1261173016, new C0155u(remoteAction, i13), true);
                                            }
                                            C2414e.m5751b(c2414e, c0154t2, c3874d, new C0041a(remoteAction, 3), 6);
                                        }
                                    }
                                }
                            }
                        } else if (abstractC6054b instanceof C6058f) {
                            c2414e.f7893a.add(AbstractC2412c.f7887b);
                        }
                        i10++;
                        interfaceC5557c = null;
                    }
                    i10++;
                    interfaceC5557c = null;
                }
                return c3967n;
            case 1:
                ArrayList arrayList = (ArrayList) r14;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.getClass();
                C2355s c2355sMessageStore = WeChatApis.messageStore();
                Handler handler = C0419b0.f1202a;
                Set setM8412U1 = AbstractC4166m.m8412U1(C0419b0.m1403a((Activity) obj3, (String) obj2));
                C1624a c1624aConversations = WeChatApis.conversations();
                ArrayList arrayListM4144c = c1624aConversations != null ? c1624aConversations.m4144c() : null;
                if (arrayListM4144c != null) {
                    list = arrayListM4144c;
                }
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hashSet.add(((C2527b) it.next()).f8167a);
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : arrayList) {
                    String str3 = (String) obj4;
                    if (setM8412U1.contains(str3) && hashSet.contains(str3) && !C0429d2.m1438q(str3)) {
                        arrayList2.add(obj4);
                    }
                }
                int size2 = 0;
                for (List<String> list2 : AbstractC4166m.m8416n1(50, arrayList2)) {
                    if (!atomicBoolean.get()) {
                        if (c2355sMessageStore != null) {
                            DexFinder dexFinder = c2355sMessageStore.f7740c;
                            if (list2 != null && !list2.isEmpty()) {
                                ArrayList arrayList3 = new ArrayList();
                                for (String str4 : list2) {
                                    String strTrim = str4 != null ? str4.trim() : HttpUrl.FRAGMENT_ENCODE_SET;
                                    if (!TextUtils.isEmpty(strTrim) && !arrayList3.contains(strTrim)) {
                                        arrayList3.add(strTrim);
                                    }
                                }
                                if (!arrayList3.isEmpty()) {
                                    Method method = dexFinder.messageClearBatchMethod;
                                    if (method == null || method.getParameterTypes().length < 2) {
                                        c2355sMessageStore.m5666i("原生消息清理API尚未就绪");
                                    } else {
                                        Class<?> cls = method.getParameterTypes()[1];
                                        if (cls.isInterface()) {
                                            Object objNewProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C2354r());
                                            try {
                                                if (method.getParameterTypes().length == 3) {
                                                    KavaReflector.invokeOrThrow(method, null, arrayList3, objNewProxyInstance, Long.MAX_VALUE);
                                                } else {
                                                    KavaReflector.invokeOrThrow(method, null, arrayList3, objNewProxyInstance);
                                                }
                                                size2 += list2.size();
                                            } catch (Throwable th2) {
                                                c2355sMessageStore.m5666i("原生消息清理提交失败: " + th2.getMessage() + " count=" + arrayList3.size());
                                            }
                                        } else {
                                            c2355sMessageStore.m5666i("原生消息清理回调类型异常: ".concat(cls.getName()));
                                        }
                                    }
                                }
                            }
                        }
                        if (!atomicBoolean.get()) {
                            Thread.sleep(300L);
                        }
                    }
                }
                return new C0502y("清理请求提交", size2, arrayList.size(), false);
            case 2:
                Activity activity = (Activity) obj3;
                ArrayList arrayList4 = (ArrayList) obj2;
                C5026jv c5026jv = (C5026jv) r14;
                if (((Boolean) obj).booleanValue()) {
                    Handler handler2 = C0419b0.f1202a;
                    C0419b0.m1406d(activity, "发送群聊邀请", "正在提交群聊邀请...", new C0446i(arrayList4, i, c5026jv), new C0450j(activity, i));
                }
                return c3967n;
            case 3:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) obj3;
                Activity activity2 = (Activity) obj2;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) r14;
                C0477p2 c0477p2 = (C0477p2) obj;
                c0477p2.getClass();
                String str5 = c0477p2.f1414a;
                if (!AbstractC3149m.m6721t0(str5)) {
                    C0452j1.m1455p(activity2, str5);
                }
                if (c0477p2.f1415b) {
                    C0452j1.m1453n(interfaceC1220a2);
                }
                interfaceC1220a.invoke();
                return c3967n;
            case 4:
                Set set = (Set) obj2;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) r14;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                for (C0424c1 c0424c1 : (List) obj3) {
                    String str6 = c0424c1.f1216a;
                    if (str6 == null) {
                        str6 = "__wechat_home__";
                    }
                    C3623h.m7604a(c3623h, str6, new C3874d(881632116, new C0443h0(c0424c1, set, interfaceC1231l, i), true), 2);
                }
                return c3967n;
            case 5:
                C0414a c0414a = (C0414a) obj;
                c0414a.getClass();
                String strM1492p = AbstractC0473o2.m1492p((LinkedHashMap) obj2, (LinkedHashSet) r14, c0414a.f1181c);
                List list3 = c0414a.f1183e;
                List list4 = (List) ((LinkedHashMap) obj3).get(c0414a.f1179a);
                if (list4 != null) {
                    list = list4;
                }
                List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(AbstractC4166m.m8397F1(list3, list)));
                List list5 = c0414a.f1184f;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj5 : list5) {
                    if (list3.contains((String) obj5)) {
                        arrayList5.add(obj5);
                    }
                }
                return C0414a.m1401a(c0414a, null, null, strM1492p, 0, listM8407P1, arrayList5, false, null, false, false, false, 4043);
            case 6:
                return Boolean.valueOf(ScriptWaBridge.sendMediaMsg$lambda$0((String) obj3, obj2, (String) r14, (C2105p) obj));
            case 7:
                C1545q0 c1545q0 = (C1545q0) obj3;
                C1275d c1275d = (C1275d) obj2;
                C1421q c1421q = (C1421q) r14;
                C3914t c3914t = (C3914t) obj;
                long j3 = c3914t.f12836c;
                C1511d1 c1511d1 = (C1511d1) c1545q0.f5154d;
                if (!c1511d1.m4025k() || c1511d1.m4028n().f9316a.f6529h.length() == 0 || (c4629q0 = c1511d1.f5032d) == null || c4629q0.m9051d() == null) {
                    z9 = false;
                } else {
                    c1545q0.m4045f(c1511d1.m4028n(), j3, false, c1275d);
                    z9 = true;
                }
                if (z9) {
                    c3914t.m8118a();
                    c1421q.f4734g = true;
                }
                return c3967n;
            case 8:
                final C1511d1 c1511d12 = (C1511d1) obj3;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) r14;
                Context context2 = (Context) obj2;
                C5838a c5838a = (C5838a) obj;
                C0933f0 c0933f0 = c5838a.f23757a;
                C0933f0 c0933f02 = c5838a.f23757a;
                C6058f c6058f = C6058f.f24529b;
                c0933f0.m2286a(c6058f);
                EnumC4643w0[] enumC4643w0Arr = EnumC4643w0.f15416h;
                boolean z11 = (C1939m0.m4813c(c1511d12.m4028n().f9317b) || !c1511d12.m4024j() || c1511d12.f5035g == null) ? false : true;
                C0035c c0035c = new C0035c(interfaceC3599t, new C1557w0(c1511d12, interfaceC5557c, i));
                Resources resources = context2.getResources();
                C0446i c0446i = new C0446i(c0035c, 12, interfaceC5557c);
                if (z11) {
                    c0933f02.m2286a(new C6056d(AbstractC6057e.f24524a, resources.getString(R.string.cut), R.attr.actionModeCutDrawable, c0446i));
                }
                EnumC4643w0[] enumC4643w0Arr2 = EnumC4643w0.f15416h;
                boolean z12 = (C1939m0.m4813c(c1511d12.m4028n().f9317b) || c1511d12.f5035g == null) ? false : true;
                C0035c c0035c2 = new C0035c(interfaceC3599t, new C1557w0(c1511d12, interfaceC5557c, 2));
                Resources resources2 = context2.getResources();
                C0446i c0446i2 = new C0446i(c0035c2, 12, interfaceC5557c);
                if (z12) {
                    c0933f02.m2286a(new C6056d(AbstractC6057e.f24525b, resources2.getString(R.string.copy), R.attr.actionModeCopyDrawable, c0446i2));
                }
                EnumC4643w0[] enumC4643w0Arr3 = EnumC4643w0.f15416h;
                boolean z13 = c1511d12.m4024j() && ((Boolean) c1511d12.f5051w.getValue()).booleanValue() && c1511d12.f5035g != null;
                C0035c c0035c3 = new C0035c(interfaceC3599t, new C1557w0(c1511d12, interfaceC5557c, 3));
                Resources resources3 = context2.getResources();
                C0446i c0446i3 = new C0446i(c0035c3, 12, interfaceC5557c);
                if (z13) {
                    c0933f02.m2286a(new C6056d(AbstractC6057e.f24526c, resources3.getString(R.string.paste), R.attr.actionModePasteDrawable, c0446i3));
                }
                EnumC4643w0[] enumC4643w0Arr4 = EnumC4643w0.f15416h;
                boolean z14 = C1939m0.m4814d(c1511d12.m4028n().f9317b) != c1511d12.m4028n().f9316a.f6529h.length();
                final int i14 = 0;
                InterfaceC1220a interfaceC1220a3 = new InterfaceC1220a() { // from class: h0.i1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1220a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                break;
                            case 1:
                                C1511d1 c1511d13 = c1511d12;
                                C2884s c2884sM4018e = C1511d1.m4018e(c1511d13.m4028n().f9316a, AbstractC1923e0.m4784b(0, c1511d13.m4028n().f9316a.f6529h.length()));
                                c1511d13.f5031c.invoke(c2884sM4018e);
                                long j4 = c2884sM4018e.f9317b;
                                c1511d13.f5050v = new C1939m0(j4);
                                c1511d13.f5048t = C2884s.m6290a(c1511d13.f5048t, null, j4, 5);
                                c1511d13.m4022h(true);
                                break;
                            default:
                                InterfaceC1220a interfaceC1220a4 = c1511d12.f5034f;
                                if (interfaceC1220a4 != null) {
                                    interfaceC1220a4.invoke();
                                }
                                break;
                        }
                        return C3967n.f12976a;
                    }
                };
                InterfaceC1220a interfaceC1220a4 = new InterfaceC1220a() { // from class: h0.i1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1220a
                    public final Object invoke() {
                        switch (i) {
                            case 0:
                                break;
                            case 1:
                                C1511d1 c1511d13 = c1511d12;
                                C2884s c2884sM4018e = C1511d1.m4018e(c1511d13.m4028n().f9316a, AbstractC1923e0.m4784b(0, c1511d13.m4028n().f9316a.f6529h.length()));
                                c1511d13.f5031c.invoke(c2884sM4018e);
                                long j4 = c2884sM4018e.f9317b;
                                c1511d13.f5050v = new C1939m0(j4);
                                c1511d13.f5048t = C2884s.m6290a(c1511d13.f5048t, null, j4, 5);
                                c1511d13.m4022h(true);
                                break;
                            default:
                                InterfaceC1220a interfaceC1220a42 = c1511d12.f5034f;
                                if (interfaceC1220a42 != null) {
                                    interfaceC1220a42.invoke();
                                }
                                break;
                        }
                        return C3967n.f12976a;
                    }
                };
                Resources resources4 = context2.getResources();
                C0446i c0446i4 = new C0446i(interfaceC1220a4, 12, interfaceC1220a3);
                if (z14) {
                    c0933f02.m2286a(new C6056d(AbstractC6057e.f24527d, resources4.getString(R.string.selectAll), R.attr.actionModeSelectAllDrawable, c0446i4));
                }
                EnumC4643w0[] enumC4643w0Arr5 = EnumC4643w0.f15416h;
                i = (c1511d12.m4024j() && C1939m0.m4813c(c1511d12.m4028n().f9317b)) ? 1 : 0;
                final int i15 = 2;
                InterfaceC1220a interfaceC1220a5 = new InterfaceC1220a() { // from class: h0.i1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1220a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                break;
                            case 1:
                                C1511d1 c1511d13 = c1511d12;
                                C2884s c2884sM4018e = C1511d1.m4018e(c1511d13.m4028n().f9316a, AbstractC1923e0.m4784b(0, c1511d13.m4028n().f9316a.f6529h.length()));
                                c1511d13.f5031c.invoke(c2884sM4018e);
                                long j4 = c2884sM4018e.f9317b;
                                c1511d13.f5050v = new C1939m0(j4);
                                c1511d13.f5048t = C2884s.m6290a(c1511d13.f5048t, null, j4, 5);
                                c1511d13.m4022h(true);
                                break;
                            default:
                                InterfaceC1220a interfaceC1220a42 = c1511d12.f5034f;
                                if (interfaceC1220a42 != null) {
                                    interfaceC1220a42.invoke();
                                }
                                break;
                        }
                        return C3967n.f12976a;
                    }
                };
                Resources resources5 = context2.getResources();
                C0446i c0446i5 = new C0446i(interfaceC1220a5, 12, interfaceC5557c);
                if (i != 0) {
                    c0933f02.m2286a(new C6056d(AbstractC6057e.f24528e, resources5.getString(R.string.autofill), 0, c0446i5));
                }
                c0933f02.m2286a(c6058f);
                return c3967n;
            case 9:
                String str7 = (String) obj;
                str7.getClass();
                ConcurrentHashMap concurrentHashMap = C2093d.f6997a;
                return C2093d.m5186j((Context) obj2, (ClassLoader) obj3, str7, "Hchat_fav_preview", (String) r14);
            case 10:
                C2618k c2618k = (C2618k) obj3;
                InterfaceC3596r0 interfaceC3596r0 = (InterfaceC3596r0) obj2;
                C2629m2 c2629m2 = (C2629m2) r14;
                float fFloatValue = ((Float) obj).floatValue();
                float f3 = c2618k.f8518w ? 1.0f : -1.0f;
                C2637o2 c2637o2 = c2618k.f8517v;
                long jM6092e = c2637o2.m6092e(c2637o2.m6095h(f3 * fFloatValue));
                C2637o2 c2637o22 = c2629m2.f8556a;
                float fM6094g = c2637o2.m6094g(c2637o2.m6092e(c2637o22.m6090c(c2637o22.f8598k, jM6092e, 1))) * f3;
                if (Math.abs(fM6094g) < Math.abs(fFloatValue)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fM6094g + " < " + fFloatValue + ')');
                    cancellationException.initCause(null);
                    interfaceC3596r0.mo7485a(cancellationException);
                }
                return c3967n;
            case 11:
                C2820e c2820e = (C2820e) obj3;
                EnumC2818c enumC2818c = (EnumC2818c) obj2;
                C2819d c2819d = (C2819d) r14;
                int iIntValue = ((Integer) obj).intValue();
                c2820e.getClass();
                C2817b c2817b = (C2817b) AbstractC4166m.m8425w1(iIntValue, enumC2818c == EnumC2818c.DICE ? C2820e.f9102j : C2820e.f9101i);
                if (c2817b != null) {
                    c2820e.m6222c(c2819d, c2817b);
                }
                return c3967n;
            case 12:
                C3103p c3103p = (C3103p) obj2;
                InterfaceC3142f interfaceC3142f = (InterfaceC3142f) obj;
                interfaceC3142f.getClass();
                String strM6678c = ((C3145i) interfaceC3142f).m6678c();
                String str8 = (String) ((Map) obj3).get(strM6678c);
                if (str8 == null) {
                    String str9 = (String) r14.get(strM6678c);
                    if (str9 != null) {
                        str2 = str9;
                    }
                    return C3103p.m6581k(str2);
                }
                String string = c3103p.f10026b.getString("group_leave_monitor_wxid_color", "#576B95");
                String strM245i = AbstractC0018a.m245i(string != null ? AbstractC3149m.m6698M0(string, ',') : null);
                str = strM245i.length() != 0 ? strM245i : "#576B95";
                return AbstractC0921a.m2255r(AbstractC0255e.m1027p("<_wc_custom_link_ color=\"", str, "\" href=\"", C3103p.m6581k("weixin://weixinhongbao/hchat/group_leave_profile/" + Uri.encode(str8)), "\">"), C3103p.m6581k(str8), "</_wc_custom_link_>");
            case 13:
                ArrayList arrayList6 = (ArrayList) obj3;
                C3103p c3103p2 = (C3103p) obj2;
                String str10 = (String) r14;
                InterfaceC3142f interfaceC3142f2 = (InterfaceC3142f) obj;
                interfaceC3142f2.getClass();
                String str11 = (String) AbstractC4166m.m8425w1(1, ((C3145i) interfaceC3142f2).m6676a());
                String string2 = str11 != null ? AbstractC3149m.m6703R0(str11).toString() : null;
                if (string2 == null) {
                    string2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                if (AbstractC3149m.m6721t0(string2)) {
                    return HttpUrl.FRAGMENT_ENCODE_SET;
                }
                arrayList6.add(string2);
                c3103p2.getClass();
                if (string2.equals("notify@all")) {
                    string2 = "所有人";
                } else {
                    C1368i c1368iM9259c = AbstractC4855en.m9259c();
                    WeChatContact weChatContactM3725n = c1368iM9259c != null ? c1368iM9259c.m3725n(string2) : null;
                    String[] strArr = {c1368iM9259c != null ? c1368iM9259c.m3733v(str10, string2) : null, weChatContactM3725n != null ? weChatContactM3725n.nickname : null, weChatContactM3725n != null ? weChatContactM3725n.customWxId : null, string2};
                    int i16 = 0;
                    while (true) {
                        if (i16 < 4) {
                            String str12 = strArr[i16];
                            if (str12 == null || AbstractC3149m.m6721t0(str12)) {
                                i16++;
                                c10 = c10;
                            } else {
                                str2 = str12;
                            }
                        }
                    }
                    char c11 = c10;
                    String strReplace = str2.replace('\n', c11);
                    strReplace.getClass();
                    String strReplace2 = strReplace.replace('\r', c11);
                    strReplace2.getClass();
                    String string3 = AbstractC3149m.m6703R0(strReplace2).toString();
                    if (!AbstractC3149m.m6721t0(string3)) {
                        string2 = string3;
                    }
                }
                return AbstractC0921a.m2251n("@", string2, "\u2005");
            case 14:
                C1695r c1695r = (C1695r) obj3;
                C3470f c3470f = (C3470f) obj2;
                InterfaceC3142f interfaceC3142f3 = (InterfaceC3142f) obj;
                interfaceC3142f3.getClass();
                C3145i c3145i = (C3145i) interfaceC3142f3;
                if (!c3145i.m6678c().equals("%userWxid%")) {
                    String str13 = (String) r14.get(c3145i.m6678c());
                    if (str13 != null) {
                        str2 = str13;
                    }
                    return C1695r.m4313h(str2);
                }
                String str14 = c3470f.f11245a;
                String string4 = ((SharedPreferences) c1695r.f5638c).getString("group_rename_wxid_color", "#576B95");
                String strM245i2 = AbstractC0018a.m245i(string4 != null ? AbstractC3149m.m6698M0(string4, ',') : null);
                str = strM245i2.length() != 0 ? strM245i2 : "#576B95";
                str14.getClass();
                return AbstractC0921a.m2255r(AbstractC0255e.m1027p("<_wc_custom_link_ color=\"", str, "\" href=\"", C1695r.m4313h("weixin://weixinhongbao/hchat/group_leave_profile/" + Uri.encode(str14)), "\">"), C1695r.m4313h(str14), "</_wc_custom_link_>");
            case 15:
                C1421q c1421q2 = (C1421q) obj3;
                C1421q c1421q3 = (C1421q) obj2;
                C1421q c1421q4 = (C1421q) r14;
                String str15 = (String) obj;
                str15.getClass();
                EnumC3474b enumC3474bM7283r = C3478f.m7283r(str15);
                int i17 = enumC3474bM7283r == null ? -1 : AbstractC3476d.f11276a[enumC3474bM7283r.ordinal()];
                if (i17 != -1) {
                    if (i17 == 1) {
                        c1421q2.f4734g = true;
                    } else if (i17 == 2) {
                        c1421q3.f4734g = true;
                    } else {
                        if (i17 != 3) {
                            C3193a.m6822k();
                            return null;
                        }
                        c1421q4.f4734g = true;
                    }
                }
                return c3967n;
            case 16:
                C3490k c3490k = (C3490k) obj3;
                Activity activity3 = (Activity) obj2;
                C3488i c3488i = (C3488i) r14;
                List list6 = (List) obj;
                list6.getClass();
                if (!list6.isEmpty()) {
                    c3490k.f11346q.execute(new RunnableC0537x(list6, (Object) new Handler(Looper.getMainLooper()), (Object) c3490k, (Object) c3488i, activity3, 11));
                }
                return c3967n;
            case 17:
                C3927e c3927e = (C3927e) obj3;
                C3923a c3923a = (C3923a) obj2;
                C3654a c3654a = (C3654a) r14;
                if (c3927e.f12905e != null) {
                    throw new IllegalArgumentException(("NavigationEventState '" + c3927e + "' is already registered with a NavigationEventHandler '" + c3923a + "'.").toString());
                }
                c3927e.f12905e = c3923a;
                c3654a.getClass();
                c3923a.getClass();
                if (c3654a.f11850a) {
                    C2104o.m5276A("This NavigationEventDispatcher has already been disposed and cannot be used.");
                    return null;
                }
                if (c3654a.f11853d.add(c3923a)) {
                    C3657d c3657d = c3654a.f11851b;
                    c3657d.getClass();
                    if (c3923a.f12883f != null) {
                        C3193a.m6819h(c3923a, "Handler '", "' is already registered with a dispatcher");
                        return null;
                    }
                    c3657d.f11860c.addFirst(c3923a);
                    c3923a.f12883f = c3654a;
                    c3657d.m7636a();
                }
                return new C0611w(c3923a, 7, c3927e);
            case 18:
                C1422r c1422r = (C1422r) obj3;
                C4005e2 c4005e2 = (C4005e2) obj2;
                C1760j c1760j = (C1760j) obj;
                c1760j.getClass();
                C1845j1 c1845j1 = c1760j.f5880e;
                float fFloatValue2 = ((Number) c1845j1.getValue()).floatValue() - c1422r.f4735g;
                float fM4488g = c4005e2.f13117c.m4488g();
                c4005e2.m8229b(fM4488g + fFloatValue2);
                float fAbs = Math.abs(fM4488g - c4005e2.f13117c.m4488g());
                c1422r.f4735g = ((Number) c1845j1.getValue()).floatValue();
                ((C1422r) r14).f4735g = ((Number) c1760j.f5876a.f5913b.invoke(c1760j.f5881f)).floatValue();
                if (Math.abs(fFloatValue2 - fAbs) > 0.5f) {
                    c1760j.m4409a();
                }
                return c3967n;
            case 19:
                C4364d c4364d = (C4364d) obj3;
                C4369i c4369i = (C4369i) r14;
                C0943k0 c0943k0 = c4364d.f14569h;
                if (c0943k0.m2315b(obj2)) {
                    C3193a.m6819h(obj2, "Key ", " was used multiple times ");
                    return null;
                }
                c4364d.f14568g.remove(obj2);
                c0943k0.m2326m(obj2, c4369i);
                return new C1455f(c4364d, obj2, c4369i, i);
            case 20:
                String str16 = (String) obj2;
                C4528h c4528h = (C4528h) r14;
                C4521a c4521a = (C4521a) obj;
                c4521a.getClass();
                return Boolean.valueOf(((Map) obj3).containsKey(c4521a.f14897a) && c4521a.f14903g.contains(str16) && C4537q.m8953n(c4521a, c4528h.f14941b, c4528h.f14946g, c4528h.f14947h, c4528h.f14948i, c4528h.f14949j, c4528h.f14950k));
            case 21:
                C4629q0 c4629q02 = (C4629q0) obj3;
                C2884s c2884s = (C2884s) obj2;
                C0192k c0192k = (C0192k) r14;
                InterfaceC1567d interfaceC1567d = (InterfaceC1567d) obj;
                C4618m1 c4618m1M9051d = c4629q02.m9051d();
                if (c4618m1M9051d != null) {
                    InterfaceC1031u interfaceC1031uM819p = interfaceC1567d.mo4081z0().m819p();
                    long j4 = ((C1939m0) c4629q02.f15324A.getValue()).f6575a;
                    long j5 = ((C1939m0) c4629q02.f15325B.getValue()).f6575a;
                    C1935k0 c1935k0 = c4618m1M9051d.f15293a;
                    C1942o c1942o = c1935k0.f6562b;
                    C1933j0 c1933j0 = c1935k0.f6561a;
                    C1005h c1005h = c4629q02.f15350y;
                    long j10 = c4629q02.f15351z;
                    if (!C1939m0.m4813c(j4)) {
                        c1005h.m2588w(j10);
                        int iM4816f = C1939m0.m4816f(j4);
                        c0192k.m859l(iM4816f);
                        int iM4815e = C1939m0.m4815e(j4);
                        c0192k.m859l(iM4815e);
                        if (iM4816f != iM4815e) {
                            interfaceC1031uM819p.mo2492j(c1935k0.m4809i(iM4816f, iM4815e), c1005h);
                        }
                    } else if (!C1939m0.m4813c(j5)) {
                        long jM4820a = c1933j0.f6550b.m4820a();
                        C1034w c1034w = jM4820a != 16 ? new C1034w(jM4820a) : null;
                        long j11 = c1034w != null ? c1034w.f3265a : C1034w.f3258b;
                        c1005h.m2588w(C1034w.m2634b(j11, C1034w.m2636d(j11) * 0.2f));
                        int iM4816f2 = C1939m0.m4816f(j5);
                        c0192k.m859l(iM4816f2);
                        int iM4815e2 = C1939m0.m4815e(j5);
                        c0192k.m859l(iM4815e2);
                        if (iM4816f2 != iM4815e2) {
                            interfaceC1031uM819p.mo2492j(c1935k0.m4809i(iM4816f2, iM4815e2), c1005h);
                        }
                    } else if (!C1939m0.m4813c(c2884s.f9317b)) {
                        c1005h.m2588w(j10);
                        long j12 = c2884s.f9317b;
                        int iM4816f3 = C1939m0.m4816f(j12);
                        c0192k.m859l(iM4816f3);
                        int iM4815e3 = C1939m0.m4815e(j12);
                        c0192k.m859l(iM4815e3);
                        if (iM4816f3 != iM4815e3) {
                            interfaceC1031uM819p.mo2492j(c1935k0.m4809i(iM4816f3, iM4815e3), c1005h);
                        }
                    }
                    boolean z15 = c1935k0.m4804d() && c1933j0.f6554f != 3;
                    if (z15) {
                        long j13 = c1935k0.f6563c;
                        C0808c c0808cM408a = AbstractC0063p.m408a(0L, (((long) Float.floatToRawIntBits((int) (j13 >> 32))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((int) (j13 & 4294967295L)))));
                        interfaceC1031uM819p.mo2487e();
                        InterfaceC1031u.m2630k(interfaceC1031uM819p, c0808cM408a);
                    }
                    C1925f0 c1925f0 = c1933j0.f6550b.f6580a;
                    C4096l c4096l = c1925f0.f6525m;
                    InterfaceC4099o interfaceC4099o = c1925f0.f6513a;
                    if (c4096l == null) {
                        c4096l = C4096l.f13558b;
                    }
                    C4096l c4096l2 = c4096l;
                    C1024q0 c1024q0 = c1925f0.f6526n;
                    if (c1024q0 == null) {
                        c1024q0 = C1024q0.f3233d;
                    }
                    C1024q0 c1024q02 = c1024q0;
                    AbstractC1566c abstractC1566c = c1925f0.f6527o;
                    if (abstractC1566c == null) {
                        abstractC1566c = C1569f.f5225b;
                    }
                    AbstractC1566c abstractC1566c2 = abstractC1566c;
                    try {
                        AbstractC1027s abstractC1027sMo8269c = interfaceC4099o.mo8269c();
                        C4098n c4098n = C4098n.f13563a;
                        try {
                            if (abstractC1027sMo8269c != null) {
                                interfaceC1031u = interfaceC1031uM819p;
                                C1942o.m4823j(c1942o, interfaceC1031u, abstractC1027sMo8269c, interfaceC4099o != c4098n ? interfaceC4099o.mo8267a() : 1.0f, c1024q02, c4096l2, abstractC1566c2);
                            } else {
                                interfaceC1031u = interfaceC1031uM819p;
                                C1942o.m4822i(c1942o, interfaceC1031u, interfaceC4099o != c4098n ? interfaceC4099o.mo8268b() : C1034w.f3258b, c1024q02, c4096l2, abstractC1566c2);
                            }
                            if (z15) {
                                interfaceC1031u.mo2497p();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            if (z15) {
                                interfaceC1031uM819p.mo2497p();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                    }
                }
                return c3967n;
            case 22:
                C1421q c1421q5 = (C1421q) obj3;
                C1922e c1922e2 = (C1922e) obj2;
                C1925f0 c1925f02 = (C1925f0) r14;
                C1922e c1922e3 = (C1922e) obj;
                if (c1421q5.f4734g) {
                    Object obj6 = c1922e3.f6503a;
                    int i18 = c1922e3.f6505c;
                    int i19 = c1922e3.f6504b;
                    if ((obj6 instanceof C1925f0) && i19 == c1922e2.f6504b && i18 == c1922e2.f6505c) {
                        if (c1925f02 == null) {
                            c1925f02 = new C1925f0(0L, 0L, (C2767k) null, (C2765i) null, (C2766j) null, (AbstractC2772p) null, (String) null, 0L, (C4085a) null, (C4100p) null, (C3290b) null, 0L, (C4096l) null, (C1024q0) null, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                        }
                        c1922e = new C1922e(i19, i18, c1925f02);
                    } else {
                        c1922e = c1922e3;
                    }
                }
                c1421q5.f4734g = c1922e2.equals(c1922e3);
                return c1922e;
            case 23:
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) obj2;
                C2890y c2890y = (C2890y) ((C1425u) r14).f4738g;
                C2884s c2884sM634l = ((C0126e) obj3).m634l((List) obj);
                if (c2890y != null) {
                    c2890y.m6292a(null, c2884sM634l);
                }
                interfaceC1231l2.invoke(c2884sM634l);
                return c3967n;
            case 24:
                return m733e(obj);
            case 25:
                InterfaceC1220a interfaceC1220a6 = (InterfaceC1220a) obj3;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19786i2, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(1775559574, new C5326t1(12, (InterfaceC1809a1) obj2, (InterfaceC1809a1) r14), true), 3);
                if (interfaceC1220a6 != null) {
                    C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19794j2, 3);
                    C3623h.m7604a(c3623h2, null, new C3874d(-1285655119, new C5463x6(interfaceC1220a6, 21), true), 3);
                }
                return c3967n;
            case 26:
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19898w5, 3);
                C3623h.m7604a(c3623h3, null, new C3874d(1699434894, new C0443h0((List) obj3, (List) obj2, (InterfaceC1231l) r14, 15), true), 3);
                return c3967n;
            case 27:
                List list7 = (List) obj;
                list7.getClass();
                ((C4804d4) obj3).f16500c.invoke(AbstractC4955ho.m9316D5(list7));
                AbstractC4855en.m9271o("已选择 ", list7.size(), " 个群成员", (Context) obj2, 0);
                ((InterfaceC1809a1) r14).setValue(null);
                return c3967n;
            case 28:
                C3623h c3623h4 = (C3623h) obj;
                c3623h4.getClass();
                C3623h.m7604a(c3623h4, null, AbstractC5193p0.f19790i6, 3);
                C3623h.m7604a(c3623h4, null, new C3874d(2141381618, new C0443h0((C4792cp) obj3, (InterfaceC1809a1) obj2, (InterfaceC1231l) r14, 17), true), 3);
                return c3967n;
            default:
                C0859c0 c0859c0 = (C0859c0) obj3;
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) r14;
                Context context3 = (Context) obj2;
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                Map map = (Map) interfaceC1809a1.getValue();
                Map map2 = (Map) interfaceC1809a1.getValue();
                String str17 = c0859c0.f2626a;
                map2.getClass();
                if (map2.isEmpty()) {
                    mapSingletonMap = Collections.singletonMap(str17, bool);
                    mapSingletonMap.getClass();
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
                    linkedHashMap.put(str17, bool);
                    mapSingletonMap = linkedHashMap;
                }
                interfaceC1809a1.setValue(mapSingletonMap);
                new Thread(new RunnableC2018l(context3, c0859c0, zBooleanValue, map, interfaceC1809a1, 3), "Hchat-Script-".concat(str17)).start();
                return c3967n;
        }
    }

    public /* synthetic */ C0153s(int i9, Context context, Object obj, Object obj2) {
        this.f406g = i9;
        this.f407h = obj;
        this.f409j = obj2;
        this.f408i = context;
    }

    public /* synthetic */ C0153s(Object obj, Object obj2, Object obj3, int i9) {
        this.f406g = i9;
        this.f407h = obj;
        this.f408i = obj2;
        this.f409j = obj3;
    }

    public /* synthetic */ C0153s(Map map, String str, C4537q c4537q, C4528h c4528h) {
        this.f406g = 20;
        this.f407h = map;
        this.f408i = str;
        this.f409j = c4528h;
    }

    public /* synthetic */ C0153s(C2618k c2618k, C2605g3 c2605g3, InterfaceC3596r0 interfaceC3596r0, C2629m2 c2629m2) {
        this.f406g = 10;
        this.f407h = c2618k;
        this.f408i = interfaceC3596r0;
        this.f409j = c2629m2;
    }

    public /* synthetic */ C0153s(C3478f c3478f, C1421q c1421q, C1421q c1421q2, C1421q c1421q3) {
        this.f406g = 15;
        this.f407h = c1421q;
        this.f408i = c1421q2;
        this.f409j = c1421q3;
    }
}
