package p000A;

import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.ViewGroup;
import android.view.textclassifier.TextClassification;
import com.bumptech.glide.AbstractC1923e;
import com.bumptech.glide.AbstractC1926h;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import me.dartcv.nuke.BuildConfig;
import nuke.data.cipher.NativeCrypto;
import p016C3.C0245b;
import p018D.C0255d;
import p018D.InterfaceC0258g;
import p027E4.C0330q;
import p029F0.AbstractC0387Z;
import p029F0.InterfaceC0430v;
import p040H.InterfaceC0546d;
import p041H0.AbstractC0601k;
import p041H0.C0566K;
import p044H3.AbstractC0648c;
import p047I0.C0755p0;
import p049I2.SharedPreferencesC0796n;
import p056K2.C0891q;
import p058L.AbstractC0922Y;
import p058L.C0920W;
import p061L2.AbstractC0973m;
import p061L2.AbstractC0984x;
import p061L2.C0981u;
import p061L2.C0982v;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1184i;
import p090R3.C1228a;
import p092S0.C1257J;
import p092S0.C1259L;
import p092S0.C1269g;
import p092S0.C1277o;
import p095T.AbstractC1322K0;
import p095T.C1308D0;
import p095T.C1316H0;
import p095T.C1318I0;
import p095T.C1383r;
import p095T.C1390u0;
import p095T.C1397y;
import p095T.InterfaceC1347Y;
import p108V3.C1544Q;
import p108V3.C1548a;
import p108V3.C1551d;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1601c;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p117X2.C1675t;
import p133a4.C1807c;
import p136b0.C1839a;
import p139c.C1882e;
import p149d3.AbstractC1976d;
import p152e0.C1997d;
import p152e0.InterfaceC1999f;
import p153e1.C2014j;
import p153e1.C2016l;
import p156e4.C2036C;
import p156e4.C2053p;
import p156e4.C2054q;
import p156e4.C2062y;
import p156e4.EnumC2039b;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p163g0.C2169a;
import p163g0.C2172d;
import p163g0.C2177i;
import p172h3.InterfaceC2247g;
import p173h4.AbstractC2263d;
import p186k.C2409F;
import p204n0.C2683b;
import p216p.C2811D;
import p216p.C2857n;
import p225q3.C2935f;
import p225q3.InterfaceC2933d;
import p242t3.AbstractC3214c;
import p242t3.C3216e;
import p242t3.C3217f;
import p242t3.InterfaceC3220i;
import p248u3.AbstractC3341e;
import p260x.C3408N;
import p264x3.C3450b;

/* JADX INFO: renamed from: A.m */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0073m implements InterfaceC1599a {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f310d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f311e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f312f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0073m(int i5, Object obj, Object obj2) {
        this.f310d = i5;
        this.f311e = obj;
        this.f312f = obj2;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE, MOVE_EXCEPTION, CONST_STR, INVOKE, CONSTRUCTOR, INVOKE, CONST_STR, INVOKE, INVOKE, INVOKE, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01dc  */
    /* JADX WARN: Type inference failed for: r2v24, types: [Q2.i, W2.c] */
    @Override // p112W2.InterfaceC1599a
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo6a() throws PendingIntent.CanceledException {
        long jFloatToRawIntBits;
        long j5;
        C0036S0 c0036s0M123d;
        C0078o0 c0078o0;
        C1269g c1269g;
        long jM3734a;
        List listM2019Z;
        String[] strArrNames;
        C2062y[] c2062yArr = null;
        C2177i c2177i = null;
        c2062yArr = null;
        switch (this.f310d) {
            case 0:
                C1646u c1646u = (C1646u) this.f311e;
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) this.f312f;
                if (!C1259L.m2334b(c1646u.f5651b, ((C1646u) interfaceC1347Y.getValue()).f5651b) || !AbstractC1665j.m2981a(c1646u.f5652c, ((C1646u) interfaceC1347Y.getValue()).f5652c)) {
                    interfaceC1347Y.setValue(c1646u);
                }
                return C0891q.f2780a;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0245b c0245b = (C0245b) this.f311e;
                ConcurrentHashMap.KeySetView keySetView = c0245b.f823e;
                String str = (String) this.f312f;
                try {
                    SharedPreferencesC0796n sharedPreferencesC0796n = c0245b.f819a;
                    ConcurrentHashMap concurrentHashMap = c0245b.f822d;
                    String strConfKeyName = (String) concurrentHashMap.get(str);
                    if (strConfKeyName == null) {
                        AbstractC1665j.m2985e(str, "key");
                        strConfKeyName = NativeCrypto.INSTANCE.confKeyName(str);
                        concurrentHashMap.put(str, strConfKeyName);
                    }
                    String string = sharedPreferencesC0796n.getString(strConfKeyName, null);
                    if (string != null) {
                        c0245b.f821c.put(str, NativeCrypto.INSTANCE.confDecrypt(string));
                        break;
                    }
                } finally {
                    try {
                    } finally {
                    }
                    break;
                }
                return C0891q.f2780a;
            case 2:
                ((C1675t) this.f311e).f5710e = ((InterfaceC1599a) this.f312f).mo6a();
                return C0891q.f2780a;
            case 3:
                return new C2014j(AbstractC1923e.m3457Q(((InterfaceC0546d) this.f311e).mo744l((InterfaceC0430v) ((InterfaceC1599a) this.f312f).mo6a())));
            case 4:
                ((C0255d) this.f311e).f844d.mo1h((InterfaceC0258g) this.f312f);
                return C0891q.f2780a;
            case 5:
                Context context = (Context) this.f311e;
                TextClassification textClassification = (TextClassification) this.f312f;
                String text = textClassification.getText();
                PendingIntent activity = PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592);
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        activity.send(ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
                    } catch (PendingIntent.CanceledException e5) {
                        Log.e("TextClassification", "error sending pendingIntent: " + activity + " error: " + e5);
                    }
                    break;
                } else {
                    activity.send();
                }
                return C0891q.f2780a;
            case 6:
                ((InterfaceC1601c) this.f311e).mo1h(this.f312f);
                return C0891q.f2780a;
            case 7:
                return NativeCrypto.m4769f((byte[]) this.f311e, (String) this.f312f);
            case 8:
                AbstractC2162v.m3994p((InterfaceC2160t) this.f311e, null, new C0098y0((InterfaceC1601c) this.f312f, (InterfaceC1046d) null), 1);
                return C0891q.f2780a;
            case 9:
                C0920W c0920w = (C0920W) this.f311e;
                long j6 = ((C2016l) ((InterfaceC1347Y) this.f312f).getValue()).f6741a;
                C2683b c2683bM1934i = c0920w.m1934i();
                if (c2683bM1934i != null) {
                    long j7 = c2683bM1934i.f8556a;
                    C1269g c1269gM1938m = c0920w.m1938m();
                    if (c1269gM1938m == null || c1269gM1938m.f4563e.length() == 0) {
                        jFloatToRawIntBits = 9205357640488583168L;
                    } else {
                        EnumC0050a0 enumC0050a0 = (EnumC0050a0) c0920w.f2881q.getValue();
                        int i5 = enumC0050a0 == null ? -1 : AbstractC0922Y.f2893a[enumC0050a0.ordinal()];
                        if (i5 != -1) {
                            if (i5 == 1 || i5 == 2) {
                                long j8 = c0920w.m1939n().f5651b;
                                int i6 = C1259L.f4537c;
                                j5 = j8 >> 32;
                            } else {
                                if (i5 != 3) {
                                    throw new C0330q();
                                }
                                long j9 = c0920w.m1939n().f5651b;
                                int i7 = C1259L.f4537c;
                                j5 = j9 & 4294967295L;
                            }
                            int i8 = (int) j5;
                            C0078o0 c0078o02 = c0920w.f2868d;
                            if (c0078o02 != null && (c0036s0M123d = c0078o02.m123d()) != null && (c0078o0 = c0920w.f2868d) != null && (c1269g = c0078o0.f337a.f402a) != null) {
                                c0920w.f2866b.m57a(i8);
                                int iM3568k = AbstractC1926h.m3568k(i8, 0, c1269g.f4563e.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (c0036s0M123d.m23d(j7) >> 32));
                                C1257J c1257j = c0036s0M123d.f161a;
                                C1277o c1277o = c1257j.f4527b;
                                int iM2363d = c1277o.m2363d(iM3568k);
                                float fM2327d = c1257j.m2327d(iM2363d);
                                float fM2328e = c1257j.m2328e(iM2363d);
                                float fM3567j = AbstractC1926h.m3567j(fIntBitsToFloat, Math.min(fM2327d, fM2328e), Math.max(fM2327d, fM2328e));
                                if (C2016l.m3704a(j6, 0L) || Math.abs(fIntBitsToFloat - fM3567j) <= ((int) (j6 >> 32)) / 2) {
                                    float fM2365f = c1277o.m2365f(iM2363d);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM3567j)) << 32) | (((long) Float.floatToRawIntBits(((c1277o.m2361b(iM2363d) - fM2365f) / 2) + fM2365f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new C2683b(jFloatToRawIntBits);
            case 10:
                C1675t c1675t = (C1675t) this.f311e;
                ViewGroup viewGroup = (ViewGroup) this.f312f;
                C0755p0 c0755p0 = (C0755p0) c1675t.f5710e;
                if (c0755p0 != null && c0755p0.getParent() == viewGroup) {
                    viewGroup.removeView(c0755p0);
                }
                return C0891q.f2780a;
            case 11:
                Long l3 = (Long) this.f311e;
                C0010F c0010f = (C0010F) this.f312f;
                if (l3 != null) {
                    c0010f.mo1h(l3);
                }
                return C0891q.f2780a;
            case 12:
                C0072l0 c0072l0 = (C0072l0) this.f311e;
                C1390u0 c1390u0 = (C1390u0) this.f312f;
                if (((C1839a) c0072l0.f307e).get() == 0) {
                    c1390u0.mo6a();
                }
                return C0891q.f2780a;
            case 13:
                C2409F c2409f = (C2409F) this.f311e;
                C1397y c1397y = (C1397y) this.f312f;
                Object[] objArr = c2409f.f7794b;
                long[] jArr = c2409f.f7793a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i9 = 0;
                    while (true) {
                        long j10 = jArr[i9];
                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i10 = 8 - ((~(i9 - length)) >>> 31);
                            for (int i11 = 0; i11 < i10; i11++) {
                                if ((255 & j10) < 128) {
                                    c1397y.m2645A(objArr[(i9 << 3) + i11]);
                                }
                                j10 >>= 8;
                            }
                            if (i10 == 8) {
                                if (i9 != length) {
                                    i9++;
                                }
                            }
                        }
                    }
                }
                return C0891q.f2780a;
            case 14:
                ((InterfaceC1347Y) this.f312f).setValue(new C1551d("https://github.com/" + AbstractC1976d.m3647o0(((C1548a) this.f311e).f5387c).toString()));
                return C0891q.f2780a;
            case 15:
                ((InterfaceC1601c) this.f311e).mo1h((AbstractC0648c) this.f312f);
                return C0891q.f2780a;
            case 16:
                ((InterfaceC1601c) this.f311e).mo1h((C1544Q) this.f312f);
                return C0891q.f2780a;
            case 17:
                ((InterfaceC1601c) this.f311e).mo1h((C1228a) this.f312f);
                return C0891q.f2780a;
            case 18:
                InterfaceC1601c interfaceC1601c = (InterfaceC1601c) this.f311e;
                ((InterfaceC1347Y) this.f312f).setValue(Boolean.FALSE);
                interfaceC1601c.mo1h(Boolean.TRUE);
                return C0891q.f2780a;
            case 19:
                ((C1882e) this.f311e).f6404c = (InterfaceC1599a) this.f312f;
                return C0891q.f2780a;
            case 20:
                C2054q c2054q = (C2054q) this.f311e;
                C2062y c2062y = (C2062y) this.f312f;
                try {
                    c2054q.f6846d.mo3359c(c2062y);
                    break;
                } catch (IOException e6) {
                    AbstractC2263d abstractC2263d = AbstractC2263d.f7404a;
                    AbstractC2263d.f7404a.mo4116h("Http2Connection.Listener failure for " + c2054q.f6848f, 4, e6);
                    try {
                        c2062y.m3771c(EnumC2039b.f6785g, e6);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return C0891q.f2780a;
            case 21:
                C2053p c2053p = (C2053p) this.f311e;
                C2036C c2036c = (C2036C) this.f312f;
                C1675t c1675t2 = new C1675t();
                C2054q c2054q2 = c2053p.f6842e;
                synchronized (c2054q2.f6868z) {
                    synchronized (c2054q2) {
                        try {
                            C2036C c2036c2 = c2054q2.f6863u;
                            C2036C c2036c3 = new C2036C();
                            c2036c3.m3735b(c2036c2);
                            c2036c3.m3735b(c2036c);
                            c1675t2.f5710e = c2036c3;
                            jM3734a = ((long) c2036c3.m3734a()) - ((long) c2036c2.m3734a());
                            if (jM3734a != 0 && !c2054q2.f6847e.isEmpty()) {
                                c2062yArr = (C2062y[]) c2054q2.f6847e.values().toArray(new C2062y[0]);
                            }
                            C2036C c2036c4 = (C2036C) c1675t2.f5710e;
                            AbstractC1665j.m2985e(c2036c4, "<set-?>");
                            c2054q2.f6863u = c2036c4;
                            C1807c.m3275b(c2054q2.f6855m, c2054q2.f6848f + " onSettings", new C0073m(22, c2054q2, c1675t2));
                        } finally {
                        }
                    }
                    try {
                        c2054q2.f6868z.m3778b((C2036C) c1675t2.f5710e);
                    } catch (IOException e7) {
                        EnumC2039b enumC2039b = EnumC2039b.f6785g;
                        c2054q2.m3752b(enumC2039b, enumC2039b, e7);
                    }
                    break;
                }
                if (c2062yArr != null) {
                    int length2 = c2062yArr.length;
                    while (i < length2) {
                        C2062y c2062y2 = c2062yArr[i];
                        synchronized (c2062y2) {
                            c2062y2.f6901h += jM3734a;
                            if (jM3734a > 0) {
                                c2062y2.notifyAll();
                            }
                        }
                        i++;
                    }
                }
                return C0891q.f2780a;
            case 22:
                C2054q c2054q3 = (C2054q) this.f311e;
                c2054q3.f6846d.mo3358a(c2054q3, (C2036C) ((C1675t) this.f312f).f5710e);
                return C0891q.f2780a;
            case 23:
                C2172d c2172d = (C2172d) this.f311e;
                Object obj = this.f312f;
                C1383r c1383r = c2172d.f7132d;
                C1318I0 c1318i0 = c1383r.f4886c;
                C1316H0 c1316h0M2438c = c1318i0.m2438c();
                int i12 = 0;
                while (i12 < c1318i0.f4706e) {
                    try {
                        if (c1316h0M2438c.m2426l(i12)) {
                            Object objM2428n = c1316h0M2438c.m2428n(i12);
                            if (objM2428n != obj) {
                                C1308D0 c1308d0 = objM2428n instanceof C1308D0 ? (C1308D0) objM2428n : null;
                                if ((c1308d0 != null ? c1308d0.f4672a : null) == obj) {
                                }
                            }
                            C2177i c2177i2 = new C2177i(i12, null);
                            c1316h0M2438c.m2417c();
                            c2177i = c2177i2;
                            if (c2177i != null) {
                                int i13 = c2177i.f7136a;
                                Integer num = c2177i.f7137b;
                                C1316H0 c1316h0M2438c2 = c1318i0.m2438c();
                                try {
                                    ArrayList arrayListM3461U = AbstractC1923e.m3461U(c1316h0M2438c2, i13, num);
                                    c1316h0M2438c2.m2417c();
                                    listM2019Z = AbstractC0973m.m2019Z(arrayListM3461U, c1383r.m2551E());
                                } finally {
                                }
                            } else {
                                listM2019Z = C0981u.f3047d;
                            }
                            return new C2169a(listM2019Z);
                        }
                        int[] iArr = c1316h0M2438c.f4692b;
                        int i14 = i12 + 1;
                        int iM2444c = (i14 < c1316h0M2438c.f4693c ? iArr[(i14 * 5) + 4] : c1316h0M2438c.f4695e) - AbstractC1322K0.m2444c(iArr, i12);
                        for (int i15 = 0; i15 < iM2444c; i15++) {
                            Object objM2422h = c1316h0M2438c.m2422h(i12, i15);
                            if (objM2422h != obj) {
                                C1308D0 c1308d02 = objM2422h instanceof C1308D0 ? (C1308D0) objM2422h : null;
                                if ((c1308d02 != null ? c1308d02.f4672a : null) != obj) {
                                }
                            }
                            c2177i = new C2177i(i12, Integer.valueOf(i15));
                            if (c2177i != null) {
                            }
                            return new C2169a(listM2019Z);
                        }
                        i12 = i14;
                    } finally {
                    }
                }
                if (c2177i != null) {
                }
                return new C2169a(listM2019Z);
            case 24:
                ((InterfaceC2247g) this.f311e).mo4090o(this.f312f);
                return C0891q.f2780a;
            case 25:
                C2857n c2857n = (C2857n) this.f311e;
                C0566K c0566k = (C0566K) this.f312f;
                c2857n.f8998z = c2857n.f8993u.mo1116a(c0566k.f1742d.mo859c(), c0566k.getLayoutDirection(), c0566k);
                return C0891q.f2780a;
            case 26:
                ((C1675t) this.f311e).f5710e = AbstractC0601k.m1032h((C2811D) this.f312f, AbstractC0387Z.f1202a);
                return C0891q.f2780a;
            case 27:
                InterfaceC2933d interfaceC2933d = (InterfaceC2933d) this.f311e;
                AbstractC3214c abstractC3214c = (AbstractC3214c) this.f312f;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                C3216e c3216e = abstractC3214c.f9997a;
                AbstractC3341e.m5587f(interfaceC2933d, abstractC3214c);
                int iMo5133d = interfaceC2933d.mo5133d();
                for (int i16 = 0; i16 < iMo5133d; i16++) {
                    List listMo5137i = interfaceC2933d.mo5137i(i16);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listMo5137i) {
                        if (obj2 instanceof InterfaceC3220i) {
                            arrayList.add(obj2);
                        }
                    }
                    InterfaceC3220i interfaceC3220i = (InterfaceC3220i) (arrayList.size() == 1 ? arrayList.get(0) : null);
                    if (interfaceC3220i != null && (strArrNames = interfaceC3220i.names()) != null) {
                        for (String str2 : strArrNames) {
                            String str3 = AbstractC1665j.m2981a(interfaceC2933d.mo5132c(), C2935f.f9255h) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str2)) {
                                String str4 = "The suggested name '" + str2 + "' for " + str3 + ' ' + interfaceC2933d.mo5134e(i16) + " is already one of the names for " + str3 + ' ' + interfaceC2933d.mo5134e(((Number) AbstractC0984x.m2033E(str2, linkedHashMap)).intValue()) + " in " + interfaceC2933d;
                                AbstractC1665j.m2985e(str4, "shortMessage");
                                throw new C3217f(0, AbstractC3341e.m5584c(-1, str4, null, null, null), str4);
                            }
                            linkedHashMap.put(str2, Integer.valueOf(i16));
                        }
                    }
                }
                return linkedHashMap.isEmpty() ? C0982v.f3048d : linkedHashMap;
            case 28:
                return new C3408N((InterfaceC1999f) this.f311e, C0982v.f3048d, (C1997d) this.f312f);
            default:
                ((InterfaceC1601c) this.f311e).mo1h((C3450b) this.f312f);
                return C0891q.f2780a;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: W2.c */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C0073m(InterfaceC2160t interfaceC2160t, InterfaceC1601c interfaceC1601c) {
        this.f310d = 8;
        this.f311e = interfaceC2160t;
        this.f312f = (AbstractC1184i) interfaceC1601c;
    }
}
