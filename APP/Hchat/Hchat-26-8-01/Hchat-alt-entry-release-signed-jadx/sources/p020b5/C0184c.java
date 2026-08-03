package p020b5;

import ac.C0058k;
import ae.C0074e;
import ae.C0075f;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaMetadataRetriever;
import android.os.Bundle;
import android.os.LocaleList;
import android.speech.tts.TextToSpeech;
import android.speech.tts.Voice;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import be.AbstractC0283h;
import bsh.C0353j;
import ca.C0508a;
import ca.C0512c;
import ca.C0514d;
import gg.AbstractC1416l;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import md.C2825b;
import md.C2829f;
import md.EnumC2824a;
import na.C2923k;
import ng.AbstractC3015m;
import ng.C3010h;
import ng.C3011i;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p003a2.C0014a;
import p005a5.C0016a;
import p011ab.C0045e;
import p012ah.C0086a;
import p018b3.AbstractC0172b;
import p019b4.C0178b;
import p023b8.AbstractC0214l;
import p023b8.C0208f;
import p024b9.C0219e;
import p025bc.AbstractC0255e;
import p036c9.C0456k1;
import p038ce.C0562o;
import p041d1.C0670p;
import p041d1.InterfaceC0666l;
import p046d6.C0710g;
import p061e5.C0826a;
import p068eh.AbstractC0921a;
import p069f.AbstractC0957r0;
import p069f.C0943k0;
import p071f1.InterfaceC1031u;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p092g4.AbstractC1341a;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.utils.KavaReflector;
import p101h1.C1565b;
import p109hb.C1671c;
import p109hb.C1695r;
import p117i0.InterfaceC1854l2;
import p121i4.AbstractC1978s;
import p121i4.C1960b0;
import p121i4.C1973n;
import p121i4.C1979t;
import p121i4.C1984y;
import p122i5.AbstractC1986a;
import p126ia.C2008b;
import p126ia.C2009c;
import p126ia.C2010d;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p136j8.InterfaceC2101l;
import p136j8.InterfaceC2106q;
import p149k4.C2239a;
import p150k5.C2264o;
import p150k5.C2275z;
import p162l3.C2450d;
import p162l3.C2458l;
import p162l3.C2466t;
import p162l3.C2467u;
import p162l3.C2469w;
import p162l3.InterfaceC2461o;
import p164l5.C2492i;
import p170le.C2553a;
import p170le.C2555c;
import p174m.C2571a;
import p177m2.C2774r;
import p178m3.C2775a;
import p199nd.C2970f;
import p199nd.C2988t;
import p199nd.C2989u;
import p207o5.AbstractC3065t;
import p212oa.AbstractC3107b;
import p213ob.AbstractC3123p;
import p213ob.C3108a;
import p213ob.C3109b;
import p213ob.C3110c;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p225p2.C3289a;
import p225p2.C3290b;
import p233pd.EnumC3400k;
import p246qd.C3514r;
import p258r8.C3742g;
import p258r8.C3744i;
import p266s0.AbstractC3879i;
import p266s0.AbstractC3881k;
import p266s0.C3880j;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3963j;
import p283t5.InterfaceC4121d;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p300ub.AbstractC4302b;
import p302ud.C4305a;
import p302ud.C4310f;
import p302ud.C4320p;
import p302ud.C4322r;
import p304uf.C4329c;
import p307v0.InterfaceC4365e;
import p312v5.C4478a;
import p315v8.C4523c;
import p315v8.C4525e;
import p315v8.C4528h;
import p315v8.C4537q;
import p321w.C4623o0;
import p332wb.AbstractC4855en;
import p339x1.C5584a2;
import p339x1.C5602f0;
import p339x1.EnumC5642s;
import p343x6.AbstractC5700d;
import p350xd.AbstractC5774a;
import p350xd.C5775b;
import p351xe.AbstractC5792m;
import p357y1.C5892i1;
import p357y1.InterfaceC5885g2;
import p369yd.C6028b;
import p376z4.C6093g;
import p383zd.C6138c;
import p384ze.C6141c;
import sa.InterfaceC3950d;
import tf.AbstractC4166m;
import tf.C4173t;

/* JADX INFO: renamed from: b5.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0184c implements InterfaceC4365e, InterfaceC2106q {

    /* JADX INFO: renamed from: a */
    public Object f469a;

    /* JADX INFO: renamed from: b */
    public Object f470b;

    /* JADX INFO: renamed from: c */
    public Object f471c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0184c(C0016a c0016a, C2264o c2264o) {
        C0058k c0058kM5527i1;
        this.f469a = c0016a;
        this.f471c = new C0014a(7);
        HashSet hashSet = new HashSet();
        for (C2275z c2275z : c2264o.m5515f1(true)) {
            if (c2275z.getName().equals("<clinit>") && (c0058kM5527i1 = c2275z.m5527i1()) != null) {
                Iterator it = c0058kM5527i1.m365p().iterator();
                while (true) {
                    AbstractC3065t abstractC3065t = (AbstractC3065t) it;
                    if (abstractC3065t.hasNext()) {
                        InterfaceC4121d interfaceC4121d = (InterfaceC4121d) abstractC3065t.next();
                        switch (interfaceC4121d.mo5878i().ordinal()) {
                            case 97:
                            case 98:
                            case 99:
                            case 100:
                            case 101:
                            case 102:
                            case 103:
                                AbstractC1986a abstractC1986a = (AbstractC1986a) ((C2492i) interfaceC4121d).mo5888a();
                                try {
                                    abstractC1986a.mo105a();
                                    if (abstractC1986a.mo4927f1().equals(c2264o.getType())) {
                                        hashSet.add(((C0014a) this.f471c).m194h(abstractC1986a));
                                    }
                                } catch (C4478a unused) {
                                }
                                break;
                        }
                    }
                }
            }
        }
        this.f470b = hashSet;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static boolean m777B(String str) {
        if (!TextUtils.isEmpty(str)) {
            str.getClass();
            if (AbstractC3156t.m6733W(str, "@chatroom", false) || AbstractC3156t.m6733W(str, "@im.chatroom", false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static void m778I(LinkedHashMap linkedHashMap, String str, C2009c c2009c) {
        if (c2009c.m4963c()) {
            linkedHashMap.remove(str);
        } else {
            linkedHashMap.put(str, c2009c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static List m779W(JSONArray jSONArray) {
        if (jSONArray == null) {
            return C4173t.f13710g;
        }
        C4329c c4329cM7E = AbstractC0000a.m7E();
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
            if (jSONObjectOptJSONObject != null) {
                String strM9266j = AbstractC4855en.m9266j("id", jSONObjectOptJSONObject);
                if (strM9266j.length() == 0) {
                    strM9266j = UUID.randomUUID().toString();
                    strM9266j.getClass();
                }
                String str = strM9266j;
                String strM9266j2 = AbstractC4855en.m9266j("author", jSONObjectOptJSONObject);
                String strM9266j3 = AbstractC4855en.m9266j("authorName", jSONObjectOptJSONObject);
                String str2 = strM9266j3.length() == 0 ? strM9266j2 : strM9266j3;
                String strM9266j4 = AbstractC4855en.m9266j("content", jSONObjectOptJSONObject);
                long jOptLong = jSONObjectOptJSONObject.optLong("time", 0L);
                if (strM9266j2.length() > 0 && strM9266j4.length() > 0 && jOptLong > 0) {
                    c4329cM7E.add(new C2008b(str, strM9266j2, str2, strM9266j4, jOptLong));
                }
            }
        }
        return AbstractC0000a.m90t(c4329cM7E);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static JSONObject m780X(C2008b c2008b) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("id", c2008b.f6773a).put("author", c2008b.f6774b).put("authorName", c2008b.f6775c).put("content", c2008b.f6776d).put("time", c2008b.f6777e);
        jSONObjectPut.getClass();
        return jSONObjectPut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Y */
    public static List m781Y(JSONArray jSONArray) {
        String string;
        String strOptString;
        if (jSONArray == null) {
            return C4173t.f13710g;
        }
        C4329c c4329cM7E = AbstractC0000a.m7E();
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            Object objOpt = jSONArray.opt(i9);
            boolean z9 = objOpt instanceof JSONObject;
            String str = HttpUrl.FRAGMENT_ENCODE_SET;
            String string2 = null;
            if (z9) {
                string = AbstractC4855en.m9266j("wxId", (JSONObject) objOpt);
            } else {
                String string3 = objOpt != null ? objOpt.toString() : null;
                if (string3 == null) {
                    string3 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                string = AbstractC3149m.m6703R0(string3).toString();
            }
            if (string.length() != 0) {
                JSONObject jSONObject = z9 ? (JSONObject) objOpt : null;
                if (jSONObject != null && (strOptString = jSONObject.optString("displayName")) != null) {
                    string2 = AbstractC3149m.m6703R0(strOptString).toString();
                }
                if (string2 != null) {
                    str = string2;
                }
                if (str.length() == 0) {
                    str = string;
                }
                c4329cM7E.add(new C2010d(string, str));
            }
        }
        return AbstractC0000a.m90t(c4329cM7E);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static String m782e(String str) {
        String strM2790s0 = AbstractC1089i.m2790s0(str);
        if (!TextUtils.isEmpty(strM2790s0)) {
            str = "sendid_".concat(strM2790s0);
        }
        return AbstractC4855en.m9263g("hb_amount_", str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static C3963j m783h(C2008b c2008b) {
        return new C3963j(c2008b.f6773a, c2008b.f6774b, c2008b.f6776d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static void m784z(C2988t c2988t) {
        C4305a c4305a = c2988t.f9756b;
        List<C4305a> list = c4305a.f14352m;
        if (list.size() <= 1) {
            return;
        }
        HashSet hashSetM6396b = c2988t.m6396b();
        for (C4305a c4305a2 : list) {
            if (c4305a2.f9217g.mo6235a(EnumC2824a.f9159m)) {
                EnumC3400k enumC3400k = EnumC3400k.f10969U;
                if (!AbstractC0000a.m94v(c4305a2, enumC3400k)) {
                    List list2 = c4305a2.f14352m;
                    if (!list2.isEmpty()) {
                        C4305a c4305a3 = (C4305a) list2.get(0);
                        if (!c4305a3.f9217g.mo6235a(EnumC2824a.f9173z) && !c4305a.f14355p.get(c4305a3.f14349j) && !hashSetM6396b.contains(c4305a3)) {
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                if (!((C4305a) it.next()).f14355p.get(c4305a3.f14349j)) {
                                    Iterator it2 = hashSetM6396b.iterator();
                                    while (true) {
                                        if (!it2.hasNext()) {
                                            break;
                                        }
                                        if (AbstractC0000a.m89s0(c4305a3, (C4305a) it2.next())) {
                                            c4305a2.f14351l.add(new C4320p(enumC3400k, 0));
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009e  */
    /* JADX INFO: renamed from: A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m785A(C2555c c2555c, C2988t c2988t, C4305a c4305a, C4310f c4310f) {
        C2988t c2988t2;
        C4310f c4310f2;
        boolean z9;
        C4305a c4305a2;
        C4322r c4322r = (C4322r) this.f469a;
        C4305a c4305a3 = c4310f.f14388b;
        C2829f c2829f = AbstractC0000a.m19K(c4305a3).f9217g;
        C2825b c2825b = C2825b.f9211z;
        Iterator it = c2829f.mo6238d(c2825b).iterator();
        loop0: while (true) {
            c2988t2 = null;
            if (!it.hasNext()) {
                c4310f2 = null;
                z9 = false;
                break;
            }
            C2988t c2988t3 = (C2988t) it.next();
            if (c2988t3 != c2988t) {
                for (C2988t c2988t4 = c2988t.f9759e; c2988t4 != null; c2988t4 = c2988t4.f9759e) {
                    if (c2988t4 == c2988t3) {
                        c4310f2 = c4310f;
                        z9 = true;
                        break loop0;
                    }
                }
            }
        }
        if (!z9) {
            BitSet bitSet = new BitSet(c4322r.f14425z.size());
            c4305a2 = c4305a3;
            C4305a c4305a4 = null;
            while (true) {
                if (c4305a2 == null || bitSet.get(c4305a2.f14349j)) {
                    break;
                }
                bitSet.set(c4305a2.f14349j);
                if (c4305a4 == null || !AbstractC0000a.m89s0(c4305a, c4305a2)) {
                    List list = c4305a2.f14354o;
                    C4305a c4305a5 = list.size() == 1 ? (C4305a) list.get(0) : null;
                    c4305a4 = c4305a2;
                    c4305a2 = c4305a5;
                } else if (!AbstractC0000a.m0A(c4305a4)) {
                    List listM92u = AbstractC0000a.m92u(c4305a4);
                    if (!listM92u.isEmpty()) {
                        C4305a c4305a6 = (C4305a) listM92u.get(listM92u.size() - 1);
                        if (!c4305a6.f9217g.mo6235a(EnumC2824a.f9149h)) {
                            if (!c4305a6.f9217g.mo6235a(EnumC2824a.f9161n) && !c4322r.m8700Y(c4305a6)) {
                                Iterator it2 = AbstractC0000a.m29P(c4322r.f14402B, c4305a4).iterator();
                                while (it2.hasNext()) {
                                    if (AbstractC0000a.m94v((C4305a) it2.next(), EnumC3400k.f10993w)) {
                                        break;
                                    }
                                }
                                c4310f2 = new C4310f(c4305a4, (C4305a) c4305a4.f14353n.get(0));
                                z9 = true;
                            }
                        }
                    }
                }
            }
            return false;
        }
        c4305a2 = c4305a3;
        if (z9) {
            C4320p c4320p = new C4320p(EnumC3400k.f10968T, 0);
            c4320p.m6232x(c2825b, c2988t);
            C4305a c4305a7 = c4310f2.f14387a;
            C4305a c4305a8 = c4310f2.f14388b;
            C2970f c2970f = new C2970f(c4305a7, c4305a8, c4320p);
            C2829f c2829f2 = c4305a7.f9217g;
            C2825b c2825b2 = C2825b.f9174A;
            if (!c2829f2.mo6238d(c2825b2).contains(c2970f)) {
                c4305a7.m6232x(c2825b2, c2970f);
            }
            if (!c4305a8.f9217g.mo6238d(c2825b2).contains(c2970f)) {
                c4305a8.m6232x(c2825b2, c2970f);
            }
            c2555c.m6011a(c4305a2);
            C4305a c4305aM60d0 = AbstractC0000a.m60d0(c4305a3);
            if (c4305aM60d0 != null && c4322r.m8693R(c4305aM60d0).isEmpty()) {
                List listM8693R = c4322r.m8693R(c4310f.f14387a);
                if (listM8693R.size() >= 2) {
                    Iterator it3 = listM8693R.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        C2988t c2988t5 = (C2988t) it3.next();
                        if (c2988t5.f9759e == null) {
                            c2988t2 = c2988t5;
                            break;
                        }
                    }
                    if (c2988t2 != null && c2988t2.f9756b != c4305a2 && !c2988t2.m6396b().contains(c4305a2)) {
                        C2989u c2989u = new C2989u(c2988t2);
                        c4320p.m6233y(c2989u);
                        c2988t2.f9755a.m6233y(c2989u);
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public boolean m786C() {
        return !(((C5584a2) ((C2571a) this.f469a).f8339h).isEmpty() && ((C5584a2) ((C2571a) this.f471c).f8339h).isEmpty() && ((C5584a2) ((C2571a) this.f470b).f8339h).isEmpty());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public boolean m787D() {
        if (((InterfaceC1854l2) this.f469a).getValue() != this.f471c) {
            return true;
        }
        C0184c c0184c = (C0184c) this.f470b;
        return c0184c != null && c0184c.m787D();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public File m788E() {
        Context context = (Context) this.f469a;
        File file = null;
        try {
            File[] externalMediaDirs = context.getExternalMediaDirs();
            if (externalMediaDirs != null) {
                int length = externalMediaDirs.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    File file2 = externalMediaDirs[i9];
                    if (Boolean.valueOf(file2 != null).booleanValue()) {
                        file = file2;
                        break;
                    }
                    i9++;
                }
            }
        } catch (Throwable unused) {
        }
        if (file == null) {
            file = new File(AbstractC4855en.m9263g("/storage/emulated/0/Android/media/", context.getPackageName()));
        }
        return new File(file, "Hchat/抓包日志");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public C0184c m789F(int i9, int i10, C0184c c0184c) {
        C6093g c6093g = (C6093g) this.f471c;
        AbstractC1978s abstractC1978s = (AbstractC1978s) this.f469a;
        C1979t c1979tMo4898r = abstractC1978s.mo4898r((AbstractC1978s) c0184c.f469a, i10);
        C1973n c1973n = (C1973n) this.f470b;
        C1973n c1973n2 = (C1973n) c0184c.f470b;
        c1973n.getClass();
        try {
            C1973n c1973nM10257N = AbstractC5700d.m10257N(c1973n, c1973n2);
            C6093g c6093gM10847p = ((C6093g) c0184c.f471c).m10847p();
            c6093gM10847p.m10844l(i9);
            c6093gM10847p.f24613g = false;
            if (c1979tMo4898r == abstractC1978s && c1973nM10257N == c1973n && c6093g.equals(c6093gM10847p)) {
                return this;
            }
            if (!c6093g.equals(c6093gM10847p)) {
                if (c6093g.f24610i <= c6093gM10847p.f24610i) {
                    c6093g = c6093gM10847p;
                    c6093gM10847p = c6093g;
                }
                int i11 = c6093g.f24610i;
                int i12 = c6093gM10847p.f24610i;
                for (int i13 = i12 - 1; i13 >= 0; i13--) {
                    if (c6093gM10847p.m10846n(i13) != c6093g.m10846n((i11 - i12) + i13)) {
                        C0353j.m1309g("Incompatible merged subroutines");
                        return null;
                    }
                }
            }
            return new C0184c((AbstractC1978s) c1979tMo4898r, c1973nM10257N, c6093g);
        } catch (C1960b0 e6) {
            e6.m2687a("underlay stack:");
            c1973n.m4883l(e6);
            e6.m2687a("overlay stack:");
            c1973n2.m4883l(e6);
            throw e6;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public Object m790G(CharSequence charSequence, int i9, int i10, int i11, boolean z9, InterfaceC2461o interfaceC2461o) {
        int i12;
        char c10;
        C2239a c2239a = new C2239a((C2466t) ((C1671c) this.f470b).f5522i);
        int iCodePointAt = Character.codePointAt(charSequence, i9);
        int i13 = 0;
        boolean zMo624a = true;
        int iCharCount = i9;
        loop0: while (true) {
            i12 = iCharCount;
            while (iCharCount < i10 && i13 < i11 && zMo624a) {
                SparseArray sparseArray = ((C2466t) c2239a.f7413e).f8092a;
                C2466t c2466t = sparseArray == null ? null : (C2466t) sparseArray.get(iCodePointAt);
                if (c2239a.f7409a == 2) {
                    if (c2466t != null) {
                        c2239a.f7413e = c2466t;
                        c2239a.f7411c++;
                    } else {
                        if (iCodePointAt == 65038) {
                            c2239a.m5475b();
                        } else if (iCodePointAt != 65039) {
                            C2466t c2466t2 = (C2466t) c2239a.f7413e;
                            if (c2466t2.f8093b != null) {
                                if (c2239a.f7411c != 1) {
                                    c2239a.f7414f = c2466t2;
                                    c2239a.m5475b();
                                } else if (c2239a.m5476c()) {
                                    c2239a.f7414f = (C2466t) c2239a.f7413e;
                                    c2239a.m5475b();
                                } else {
                                    c2239a.m5475b();
                                }
                                c10 = 3;
                            } else {
                                c2239a.m5475b();
                            }
                        }
                        c10 = 1;
                    }
                    c10 = 2;
                } else if (c2466t == null) {
                    c2239a.m5475b();
                    c10 = 1;
                } else {
                    c2239a.f7409a = 2;
                    c2239a.f7413e = c2466t;
                    c2239a.f7411c = 1;
                    c10 = 2;
                }
                c2239a.f7410b = iCodePointAt;
                if (c10 == 1) {
                    iCharCount = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                    if (iCharCount < i10) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount);
                    }
                } else if (c10 == 2) {
                    int iCharCount2 = Character.charCount(iCodePointAt) + iCharCount;
                    if (iCharCount2 < i10) {
                        iCodePointAt = Character.codePointAt(charSequence, iCharCount2);
                    }
                    iCharCount = iCharCount2;
                } else if (c10 == 3) {
                    if (z9 || !m826w(charSequence, i12, iCharCount, ((C2466t) c2239a.f7414f).f8093b)) {
                        zMo624a = interfaceC2461o.mo624a(charSequence, i12, iCharCount, ((C2466t) c2239a.f7414f).f8093b);
                        i13++;
                    }
                }
            }
            break loop0;
        }
        if (c2239a.f7409a == 2 && ((C2466t) c2239a.f7413e).f8093b != null && ((c2239a.f7411c > 1 || c2239a.m5476c()) && i13 < i11 && zMo624a && (z9 || !m826w(charSequence, i12, iCharCount, ((C2466t) c2239a.f7413e).f8093b)))) {
            interfaceC2461o.mo624a(charSequence, i12, iCharCount, ((C2466t) c2239a.f7413e).f8093b);
        }
        return interfaceC2461o.mo627e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0423  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x024e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126  */
    /* JADX INFO: renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C4305a m791H(C5775b c5775b, C2988t c2988t, C2555c c2555c) {
        C2825b c2825b;
        C1984y c1984y;
        C4305a c4305a;
        ArrayList arrayList;
        C2825b c2825b2;
        C6138c c6138c;
        C4305a c4305a2;
        C4305a c4305aM4324j;
        C4305a c4305aM19K;
        C4305a c4305aM60d0;
        C4320p c4320pM57c0;
        boolean z9;
        C6138c c6138c2;
        boolean z10;
        boolean z11;
        Iterator it;
        boolean z12;
        ArrayList arrayList2 = c5775b.f23507k;
        C4322r c4322r = (C4322r) this.f469a;
        C1984y c1984y2 = (C1984y) this.f470b;
        C6141c c6141c = (C6141c) c1984y2.f6719g;
        C4305a c4305a3 = c2988t.f9755a;
        C4305a c4305a4 = c2988t.f9756b;
        HashSet hashSetM6396b = c2988t.m6396b();
        ArrayList arrayList3 = new ArrayList(hashSetM6396b.size());
        C4305a c4305aM60d02 = AbstractC0000a.m60d0(c4305a3);
        if (c4305aM60d02 != null && hashSetM6396b.remove(c4305aM60d02)) {
            arrayList3.add(c4305aM60d02);
        }
        if (hashSetM6396b.remove(c4305a3)) {
            arrayList3.add(c4305a3);
        }
        if (hashSetM6396b.remove(c4305a4)) {
            arrayList3.add(c4305a4);
        }
        arrayList3.addAll(hashSetM6396b);
        Iterator it2 = arrayList3.iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            C2825b c2825b3 = C2825b.f9178E;
            c2825b = C2825b.f9211z;
            if (!zHasNext) {
                c1984y = c1984y2;
                c4305a = c4305a4;
                arrayList = arrayList3;
                c2825b2 = c2825b3;
                c6138c = null;
                break;
            }
            C4305a c4305a5 = (C4305a) it2.next();
            if (!c4305a5.f9217g.mo6236b(c2825b3) && (c4320pM57c0 = AbstractC0000a.m57c0(c4305a5)) != null) {
                Iterator it3 = it2;
                if (c4320pM57c0.f14396k == EnumC3400k.f10992v) {
                    List listMo6238d = c4305a5.f9217g.mo6238d(c2825b);
                    if (listMo6238d.isEmpty() || listMo6238d.get(0) == c2988t) {
                        C4305a c4305a6 = c2988t.f9755a;
                        if (c4305a5 == c4305a4 || (!(c4305a6.f14351l.isEmpty() && AbstractC0283h.m1125E(c4305a6.f14353n, c4305a5)) && c4305a4.f14351l.isEmpty() && AbstractC0283h.m1125E(c4305a4.f14352m, c4305a5))) {
                            arrayList = arrayList3;
                            z9 = true;
                        } else {
                            arrayList = arrayList3;
                            z9 = false;
                        }
                        C6138c c6138c3 = new C6138c(c5775b, c2988t, c4305a5, z9);
                        boolean z13 = z9;
                        if (c4305a5 == c4305a6 || z13) {
                            c1984y = c1984y2;
                            c4305a = c4305a4;
                            c6138c2 = c6138c3;
                            c2825b2 = c2825b3;
                        } else {
                            if (c4305a6 == c4305a5 && c4305a6.f14351l.isEmpty()) {
                                c4305a = c4305a4;
                                c2825b2 = c2825b3;
                            } else {
                                if (c4305a6.f14351l.isEmpty()) {
                                    c2825b2 = c2825b3;
                                    if (c4305a6.f14354o.size() == 1) {
                                        C4305a c4305aM60d03 = AbstractC0000a.m60d0(c4305a6);
                                        while (c4305aM60d03 != null && c4305aM60d03 != c4305a5) {
                                            c4305a = c4305a4;
                                            if (c4305aM60d03.f14354o.size() >= 2 || c4305aM60d03.f14352m.size() != 1 || !c4305aM60d03.f14351l.isEmpty()) {
                                                break;
                                            }
                                            c4305aM60d03 = AbstractC0000a.m60d0(c4305aM60d03);
                                            c4305a4 = c4305a;
                                        }
                                        c4305a = c4305a4;
                                        if (c4305aM60d03 != c4305a5) {
                                        }
                                    }
                                    if (c4305a5.f14352m.contains(c4305a6)) {
                                        c6138c3.f24727p = c4305a6;
                                        ArrayList arrayList4 = c4305a6.f14351l;
                                        if (!arrayList4.isEmpty()) {
                                            C6028b c6028b = c6138c3.f24475k;
                                            if (c6028b != null) {
                                                ArrayList arrayListM10795J = c6028b.m10795J();
                                                if (!arrayListM10795J.isEmpty()) {
                                                    int size = arrayList4.size();
                                                    int i9 = 0;
                                                    while (i9 < size) {
                                                        c6138c2 = c6138c3;
                                                        C3514r c3514r = ((C4320p) arrayList4.get(i9)).f14397l;
                                                        if (c3514r == null) {
                                                            c1984y = c1984y2;
                                                        } else {
                                                            c1984y = c1984y2;
                                                            if (c3514r.f11440m.f11445j.size() <= 1) {
                                                                int i10 = i9 + 1;
                                                                boolean z14 = false;
                                                                while (i10 < size) {
                                                                    int i11 = i10;
                                                                    List list = ((C4320p) arrayList4.get(i9)).f14398m;
                                                                    if (list.size() == 0 ? false : AbstractC5792m.m10485b(list, c3514r)) {
                                                                        z14 = true;
                                                                    }
                                                                    i10 = i11 + 1;
                                                                }
                                                                if (!z14 && AbstractC5792m.m10485b(arrayListM10795J, c3514r)) {
                                                                    z14 = true;
                                                                }
                                                                if (z14) {
                                                                    c1984y2 = c1984y;
                                                                    c6138c3 = c6138c2;
                                                                    i9 = i10;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                                z10 = false;
                                                if (z10 && c4322r.m8693R(c4305a5).size() >= 2) {
                                                    it = c4305a5.f14354o.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            z12 = true;
                                                            break;
                                                        }
                                                        List listM8693R = c4322r.m8693R((C4305a) it.next());
                                                        listM8693R.remove(c2988t);
                                                        if (!listM8693R.isEmpty()) {
                                                            z12 = false;
                                                            break;
                                                        }
                                                    }
                                                    if (z12) {
                                                        z10 = false;
                                                    }
                                                }
                                                if (z10) {
                                                    ArrayList<C4310f> arrayListM6395a = c2988t.m6395a();
                                                    if (arrayListM6395a.size() >= 2) {
                                                        Optional optionalFindFirst = arrayListM6395a.stream().filter(new C0562o(c4305a5, 3)).findFirst();
                                                        if (!optionalFindFirst.isPresent()) {
                                                            C0086a.m452k("Not found exit edge by exit block: ".concat(String.valueOf(c4305a5)));
                                                            return null;
                                                        }
                                                        C4310f c4310f = (C4310f) optionalFindFirst.get();
                                                        C4305a c4305a7 = c4310f.f14388b;
                                                        for (C4310f c4310f2 : arrayListM6395a) {
                                                            if (c4310f2 != c4310f) {
                                                                C4305a c4305a8 = c4310f2.f14388b;
                                                                if (!AbstractC0000a.m81o0(c4305a7, c4305a8) && AbstractC0000a.m67h0(c4322r, c4305a7, c4305a8) != null) {
                                                                    z11 = false;
                                                                    break;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    z11 = true;
                                                    if (!z11) {
                                                        z10 = false;
                                                    }
                                                }
                                                if (!z10) {
                                                    c6138c = c6138c2;
                                                    break;
                                                }
                                                it2 = it3;
                                                arrayList3 = arrayList;
                                                c4305a4 = c4305a;
                                                c1984y2 = c1984y;
                                            }
                                        }
                                    }
                                    c1984y = c1984y2;
                                    c6138c2 = c6138c3;
                                    z10 = false;
                                    if (z10) {
                                        it = c4305a5.f14354o.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                            }
                                        }
                                        if (z12) {
                                        }
                                    }
                                    if (z10) {
                                    }
                                    if (!z10) {
                                    }
                                } else {
                                    c2825b2 = c2825b3;
                                }
                                c4305a = c4305a4;
                                if (c4305a5.f14352m.contains(c4305a6)) {
                                }
                                c1984y = c1984y2;
                                c6138c2 = c6138c3;
                                z10 = false;
                                if (z10) {
                                }
                                if (z10) {
                                }
                                if (!z10) {
                                }
                            }
                            c1984y = c1984y2;
                            c6138c2 = c6138c3;
                        }
                        z10 = true;
                        if (z10) {
                        }
                        if (z10) {
                        }
                        if (!z10) {
                        }
                    }
                }
                it2 = it3;
            }
        }
        if (c6138c == null) {
            C6138c c6138c4 = new C6138c(c5775b, c2988t, null, false);
            arrayList2.add(c6138c4);
            c4305a3.m6228E(c2825b);
            c6141c.f24738h.clear(c4305a3.f14349j);
            c2555c.m6013c(c6138c4);
            ArrayList<C4310f> arrayListM6395a2 = c2988t.m6395a();
            if (arrayListM6395a2.size() == 1) {
                C4310f c4310f3 = (C4310f) arrayListM6395a2.get(0);
                C4305a c4305a9 = c4310f3.f14388b;
                if (!m785A(c2555c, c2988t, c4305a9, c4310f3) || (c4305aM60d0 = AbstractC0000a.m60d0(c4305a9)) == null) {
                    c4305aM60d0 = null;
                } else {
                    c2555c.m6011a(c4305aM60d0);
                }
            } else {
                C4305a c4305a10 = null;
                for (C4310f c4310f4 : arrayListM6395a2) {
                    C4305a c4305a11 = c4310f4.f14388b;
                    for (C4305a c4305a12 : AbstractC0000a.m84q(c4322r, c4305a11.f14357r)) {
                        if (AbstractC0000a.m89s0(c4305a11, c4305a12)) {
                            c2555c.m6011a(c4305a12);
                            m785A(c2555c, c2988t, c4305a12, c4310f4);
                            c4305a10 = c4305a12;
                        } else {
                            m785A(c2555c, c2988t, c4305a11, c4310f4);
                        }
                    }
                }
                c4305aM60d0 = c4305a10;
            }
            C5775b c5775bM4910b = c1984y.m4910b(c4305a3);
            C4305a c4305a13 = c4305a;
            if (!AbstractC1089i.m2755Z(c4305a13, c5775bM4910b) && !c4305a13.f9217g.mo6236b(c2825b2)) {
                if (c4322r.f14405E.size() == 0) {
                    c5775bM4910b.f23507k.add(c4305a13);
                } else {
                    Iterator it4 = c4322r.f14405E.iterator();
                    while (it4.hasNext()) {
                        if (((C0075f) it4.next()).f235d.contains(c4305a13)) {
                            break;
                        }
                    }
                    c5775bM4910b.f23507k.add(c4305a13);
                }
            }
            c6138c4.f24728q = c5775bM4910b;
            if (c4305aM60d0 == null) {
                C4305a c4305aM60d04 = AbstractC0000a.m60d0(c4305a13);
                if (AbstractC1089i.m2755Z(c4305aM60d04, c5775bM4910b)) {
                    c4305aM60d04 = null;
                }
                c4305aM60d0 = c4305aM60d04;
            }
            c2555c.m6012b();
            c4305a3.m6232x(c2825b, c2988t);
            m784z(c2988t);
            return c4305aM60d0;
        }
        C4305a c4305a14 = c4305a;
        C1984y c1984y3 = c1984y;
        arrayList2.add(c6138c);
        AbstractC5774a abstractC5774a = c2555c.f8287b.f8285b;
        c2555c.m6013c(c6138c);
        C1695r c1695rM6007g = C2553a.m6007g(((C2553a) this.f471c).f8282a, c6138c.f24726o);
        C1695r c1695rM6008h = C2553a.m6008h(c1695rM6007g);
        if (c1695rM6008h != null) {
            c1695rM6007g = c1695rM6008h;
        }
        C2553a.m6001a(c1695rM6007g);
        if (!c2988t.f9757c.contains((C4305a) c1695rM6007g.f5640e)) {
            c1695rM6007g = C1695r.m4315l(c1695rM6007g);
        }
        C4305a c4305a15 = (C4305a) c1695rM6007g.f5640e;
        C6141c c6141c2 = (C6141c) c1695rM6007g.f5639d;
        C4305a c4305a16 = (C4305a) c1695rM6007g.f5641f;
        c6138c.f24475k = (C6028b) c1695rM6007g.f5638c;
        c6138c.f24476l = c6141c2.m10909c();
        c6141c2.forEach(new C0074e(22));
        ArrayList arrayList5 = arrayList;
        arrayList5.removeAll(c6141c2.m10909c());
        if (!arrayList5.isEmpty() && c4305a16 != null) {
            for (C4310f c4310f5 : c2988t.m6395a()) {
                C1695r c1695r = c1695rM6007g;
                if (arrayList5.contains(c4310f5.f14387a)) {
                    m785A(c2555c, c2988t, c4305a16, c4310f5);
                }
                c1695rM6007g = c1695r;
            }
        }
        C1695r c1695r2 = c1695rM6007g;
        boolean z15 = c6138c.f24725n;
        EnumC2824a enumC2824a = EnumC2824a.f9173z;
        if (z15) {
            if (c4305a15 == c4305a14 || c4305a15 == c4305a3) {
                c4305a15 = c4305a16;
            }
            c4305aM19K = AbstractC0000a.m19K(c4305a15);
            c4305a3.m6228E(c2825b);
            c4305a14.m6231w(enumC2824a);
            c2555c.m6011a(c4305a14);
            c6141c.f24738h.clear(c4305a3.f14349j);
            c6138c.f24728q = c1984y3.m4910b(c4305a3);
            c4305a3.m6232x(c2825b, c2988t);
            c4305a14.m6227D(enumC2824a);
        } else if (abstractC5774a == null || c4305a16 == null) {
            c4305a2 = c4305a16;
            c2555c.m6011a(c4305a2);
            C5775b c5775b2 = !Objects.equals(c4305a15, c4305a3) ? new C5775b(c6138c) : c1984y3.m4910b(c4305a15);
            c4305aM4324j = c1695r2.m4324j();
            if (c4305a3 != c4305aM4324j) {
                HashSet<C4305a> hashSetM29P = AbstractC0000a.m29P(c4305a3, c4305aM4324j);
                hashSetM29P.remove(c4305aM4324j);
                for (C4305a c4305a17 : hashSetM29P) {
                    if (c4305a17.f14351l.isEmpty() && !c4305a17.f9217g.mo6235a(enumC2824a) && !AbstractC1089i.m2755Z(c4305a17, c5775b2)) {
                        c5775b2.m10464H(c4305a17);
                    }
                }
            }
            c6138c.f24728q = c5775b2;
            c4305aM19K = c4305a2;
        } else {
            if (c4305a16.f9217g.mo6235a(EnumC2824a.f9155k) && !c4305a16.f9217g.mo6238d(c2825b).contains(c2988t) && AbstractC1089i.m2755Z(c4305a16, abstractC5774a)) {
                c4305a2 = null;
            }
            c2555c.m6011a(c4305a2);
            if (!Objects.equals(c4305a15, c4305a3)) {
            }
            c4305aM4324j = c1695r2.m4324j();
            if (c4305a3 != c4305aM4324j) {
            }
            c6138c.f24728q = c5775b2;
            c4305aM19K = c4305a2;
        }
        c2555c.m6012b();
        m784z(c2988t);
        return c4305aM19K;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public LinkedHashMap m792J() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.f469a;
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        String string = sharedPreferences.getString("entries_v1", HttpUrl.FRAGMENT_ENCODE_SET);
        if (string != null) {
            str = string;
        }
        if (str.equals((String) this.f470b)) {
            return (LinkedHashMap) this.f471c;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!AbstractC3149m.m6721t0(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    next.getClass();
                    String string2 = AbstractC3149m.m6703R0(next).toString();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(string2);
                    if (jSONObjectOptJSONObject != null) {
                        List listM781Y = m781Y(jSONObjectOptJSONObject.optJSONArray("likes"));
                        List listM779W = m779W(jSONObjectOptJSONObject.optJSONArray("comments"));
                        List listM781Y2 = m781Y(jSONObjectOptJSONObject.optJSONArray("pendingLikes"));
                        List listM779W2 = m779W(jSONObjectOptJSONObject.optJSONArray("pendingComments"));
                        HashSet hashSet = new HashSet();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : listM781Y) {
                            if (hashSet.add(((C2010d) obj).f6782a)) {
                                arrayList.add(obj);
                            }
                        }
                        HashSet hashSet2 = new HashSet();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj2 : listM779W) {
                            if (hashSet2.add(((C2008b) obj2).f6773a)) {
                                arrayList2.add(obj2);
                            }
                        }
                        HashSet hashSet3 = new HashSet();
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj3 : listM781Y2) {
                            if (hashSet3.add(((C2010d) obj3).f6782a)) {
                                arrayList3.add(obj3);
                            }
                        }
                        HashSet hashSet4 = new HashSet();
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : listM779W2) {
                            if (hashSet4.add(m783h((C2008b) obj4))) {
                                arrayList4.add(obj4);
                            }
                        }
                        C2009c c2009c = new C2009c(arrayList, arrayList2, arrayList3, arrayList4);
                        if (string2.length() > 0 && !c2009c.m4963c()) {
                            linkedHashMap.put(string2, c2009c);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        this.f470b = str;
        this.f471c = linkedHashMap;
        return linkedHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public String m793K(String str, String str2) {
        String str3 = !TextUtils.isEmpty(str) ? (String) ((C2923k) this.f469a).f9543f.get(str) : HttpUrl.FRAGMENT_ENCODE_SET;
        if (TextUtils.isEmpty(str3) || m777B(str3)) {
            String strM6615e = AbstractC3107b.m6615e(str2, "fromusername");
            if (!TextUtils.isEmpty(strM6615e) && !m777B(strM6615e)) {
                str3 = strM6615e;
            }
        }
        String strM6617g = AbstractC3107b.m6617g(str3);
        strM6617g.getClass();
        return strM6617g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:183:0x01ec */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:88:0x01dd */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Type inference failed for r11v6. Raw type applied. Possible types: java.util.Iterator<T>, java.util.Iterator */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0270 A[Catch: all -> 0x024d, TryCatch #7 {all -> 0x024d, blocks: (B:118:0x022b, B:120:0x0236, B:122:0x023c, B:127:0x0248, B:131:0x0251, B:133:0x025b, B:135:0x0261, B:137:0x0268, B:139:0x0270, B:141:0x0276, B:147:0x0288, B:153:0x0299), top: B:187:0x022b }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0288 A[Catch: all -> 0x024d, TryCatch #7 {all -> 0x024d, blocks: (B:118:0x022b, B:120:0x0236, B:122:0x023c, B:127:0x0248, B:131:0x0251, B:133:0x025b, B:135:0x0261, B:137:0x0268, B:139:0x0270, B:141:0x0276, B:147:0x0288, B:153:0x0299), top: B:187:0x022b }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02c5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01db  */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [int] */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v49 */
    /* JADX WARN: Type inference failed for: r5v50 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX INFO: renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C0508a m794L(Object obj, long j3) {
        int i9;
        long j4;
        char c10;
        InputStream inputStream;
        ?? r5;
        Object c3959f;
        ?? r52;
        String str;
        char c11;
        long j5;
        Object next;
        String absolutePath;
        ?? r53;
        C0514d c0514d;
        Object c3959f2;
        String strExtractMetadata;
        long jLongValue;
        ?? IntValue;
        String strExtractMetadata2;
        long j10;
        ?? r16;
        Integer numM6741e0;
        Long lM6743g0;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Class<?> superclass = obj.getClass();
        while (true) {
            i9 = 1;
            if (superclass == null || superclass.equals(Object.class)) {
                break;
            }
            C3010h c3010h = new C3010h(new C3011i(AbstractC3015m.m6413W(AbstractC3015m.m6414X(new C3011i(AbstractC4166m.m8415m1(KavaReflector.declaredMethods(superclass)), true, new C0178b(8)), new C0456k1(obj, 3)), new C0178b(9)), true, new C0512c(j3, 0)));
            while (c3010h.hasNext()) {
                linkedHashSet.add((String) c3010h.next());
            }
            superclass = superclass.getSuperclass();
        }
        Iterator it = linkedHashSet.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next2 = it.next();
            next2.getClass();
            String str2 = (String) next2;
            C3742g c3742g = (C3742g) this.f469a;
            File file = new File(str2);
            long j11 = 0;
            if (!file.isFile() || file.length() <= 0) {
                File file2 = new File(c3742g.f12143a.getCacheDir(), "Hchat_live_photo");
                if (file2.isDirectory() || file2.mkdirs()) {
                    File file3 = new File(file2, "live_" + j3 + "_" + Integer.toHexString(str2.hashCode()) + ".mp4");
                    if (!file3.isFile() || file3.length() <= 0) {
                        String[] strArr = {"com.tencent.mm.vfs.w6", "com.tencent.mm.vfs.p6"};
                        int i10 = 0;
                        while (true) {
                            if (i10 >= 2) {
                                j4 = j11;
                                c10 = 0;
                                inputStream = null;
                                break;
                            }
                            j4 = j11;
                            Class<?> clsLoadClass = KavaReflector.loadClass(strArr[i10], c3742g.f12145c);
                            if (clsLoadClass != null) {
                                String[] strArr2 = {"E", "F"};
                                c10 = 0;
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= 2) {
                                        Iterator it2 = KavaReflector.declaredMethods(clsLoadClass).iterator();
                                        while (true) {
                                            if (!it2.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it2.next();
                                            Method method = (Method) next;
                                            Class<?>[] parameterTypes = method.getParameterTypes();
                                            if (Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), InputStream.class) && parameterTypes.length == i9 && AbstractC1416l.m3825a(parameterTypes[c10], String.class)) {
                                                break;
                                            }
                                        }
                                        Method method2 = (Method) next;
                                        if (method2 != null) {
                                            Object objInvoke = KavaReflector.invoke(method2, null, str2);
                                            InputStream inputStream2 = objInvoke instanceof InputStream ? (InputStream) objInvoke : null;
                                            if (inputStream2 != null) {
                                                inputStream = inputStream2;
                                                break;
                                            }
                                        }
                                        j5 = j4;
                                    } else {
                                        Method methodFindMethod = KavaReflector.findMethod(clsLoadClass, strArr2[i11], String.class);
                                        if (methodFindMethod != null && Modifier.isStatic(methodFindMethod.getModifiers())) {
                                            Object objInvoke2 = KavaReflector.invoke(methodFindMethod, null, str2);
                                            inputStream = objInvoke2 instanceof InputStream ? (InputStream) objInvoke2 : null;
                                            if (inputStream != null) {
                                                break;
                                            }
                                        }
                                        i11++;
                                        c10 = c10;
                                        j4 = j4;
                                        i9 = 1;
                                    }
                                }
                            } else {
                                j5 = j4;
                            }
                            i10++;
                            j11 = j5;
                            i9 = 1;
                        }
                        if (inputStream != null) {
                            try {
                                r5 = c10;
                            } catch (Throwable th2) {
                                th = th2;
                                r5 = c10;
                            }
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file3, (boolean) r5);
                                try {
                                    AbstractC1341a.m3594j(inputStream, fileOutputStream);
                                    fileOutputStream.close();
                                    try {
                                        inputStream.close();
                                        c3959f = file3.getAbsolutePath();
                                    } catch (Throwable th3) {
                                        c3959f = new C3959f(th3);
                                        r52 = r5;
                                    }
                                    if (file3.isFile()) {
                                        r52 = r5;
                                        if (file3.length() <= j4) {
                                            c3959f = null;
                                            r52 = r5;
                                        }
                                        if (C3960g.m8182b(c3959f) != null) {
                                            file3.delete();
                                        }
                                        if (c3959f instanceof C3959f) {
                                            c3959f = null;
                                        }
                                        str = (String) c3959f;
                                        r53 = r52;
                                    }
                                    if (str != null) {
                                        File file4 = new File(str);
                                        if (!file4.isFile() || file4.length() <= j4) {
                                            c0514d = null;
                                        } else {
                                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                            try {
                                                mediaMetadataRetriever.setDataSource(str);
                                                strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                                            } catch (Throwable th4) {
                                                c3959f2 = new C3959f(th4);
                                            }
                                            if (strExtractMetadata == null || (lM6743g0 = AbstractC3156t.m6743g0(strExtractMetadata)) == null) {
                                                jLongValue = j4;
                                                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(18);
                                                IntValue = (strExtractMetadata3 != null || (numM6741e0 = AbstractC3156t.m6741e0(10, strExtractMetadata3)) == null) ? r53 : numM6741e0.intValue();
                                                strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                                                ?? IntValue2 = r53;
                                                if (strExtractMetadata2 != null) {
                                                    Integer numM6741e02 = AbstractC3156t.m6741e0(10, strExtractMetadata2);
                                                    IntValue2 = r53;
                                                    if (numM6741e02 != null) {
                                                        IntValue2 = numM6741e02.intValue();
                                                    }
                                                }
                                                j10 = j4;
                                                r16 = IntValue2;
                                                if (jLongValue <= j10 || IntValue > 0 || r16 > 0) {
                                                    if (jLongValue < 1) {
                                                        jLongValue = 1;
                                                    }
                                                    if (jLongValue > 2147483647L) {
                                                        jLongValue = 2147483647L;
                                                    }
                                                    c3959f2 = new C0514d((int) jLongValue, IntValue, file4.length(), r16 == true ? 1 : 0);
                                                } else {
                                                    c3959f2 = null;
                                                }
                                                c0514d = (C0514d) (!(c3959f2 instanceof C3959f) ? null : c3959f2);
                                                try {
                                                    mediaMetadataRetriever.release();
                                                } catch (Throwable unused) {
                                                }
                                            } else {
                                                if (lM6743g0.longValue() <= j4) {
                                                    lM6743g0 = null;
                                                }
                                                if (lM6743g0 != null) {
                                                    jLongValue = lM6743g0.longValue();
                                                }
                                                String strExtractMetadata32 = mediaMetadataRetriever.extractMetadata(18);
                                                if (strExtractMetadata32 != null) {
                                                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                                                    ?? IntValue22 = r53;
                                                    if (strExtractMetadata2 != null) {
                                                    }
                                                    j10 = j4;
                                                    r16 = IntValue22;
                                                    if (jLongValue <= j10) {
                                                        if (jLongValue < 1) {
                                                        }
                                                        if (jLongValue > 2147483647L) {
                                                        }
                                                        c3959f2 = new C0514d((int) jLongValue, IntValue, file4.length(), r16 == true ? 1 : 0);
                                                        c0514d = (C0514d) (!(c3959f2 instanceof C3959f) ? null : c3959f2);
                                                        mediaMetadataRetriever.release();
                                                    }
                                                }
                                            }
                                        }
                                        if (c0514d != null) {
                                            return new C0508a(c0514d.f1568a, c0514d.f1569b, str, c0514d.f1571d, c0514d.f1570c);
                                        }
                                    }
                                    i9 = 1;
                                } catch (Throwable th5) {
                                    try {
                                        throw th5;
                                    } catch (Throwable th6) {
                                        AbstractC2043a.m5035i(fileOutputStream, th5);
                                        throw th6;
                                    }
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                Throwable th8 = th;
                                try {
                                    throw th8;
                                } catch (Throwable th9) {
                                    AbstractC2043a.m5035i(inputStream, th8);
                                    throw th9;
                                }
                            }
                        } else {
                            c11 = c10;
                        }
                    } else {
                        absolutePath = file3.getAbsolutePath();
                    }
                } else {
                    j4 = 0;
                    c11 = 0;
                }
                str = null;
                r53 = c11;
                if (str != null) {
                }
                i9 = 1;
            } else {
                absolutePath = file.getAbsolutePath();
            }
            str = absolutePath;
            j4 = 0;
            r53 = 0;
            if (str != null) {
            }
            i9 = 1;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public boolean m795M(int i9) {
        InterfaceC5885g2 interfaceC5885g2;
        if (i9 == 7 || i9 == 2 || i9 == 6 || i9 == 5 || i9 == 3 || i9 == 4) {
            m823t();
        } else if (i9 != 1 && i9 != 0) {
            C2104o.m5276A("invalid ImeAction");
            return false;
        }
        if (i9 == 6) {
            InterfaceC0666l interfaceC0666l = (InterfaceC0666l) this.f471c;
            if (interfaceC0666l != null) {
                ((C0670p) interfaceC0666l).m1849g(1, true);
                return true;
            }
            AbstractC1416l.m3831g("focusManager");
            throw null;
        }
        if (i9 != 5) {
            if (i9 != 7 || (interfaceC5885g2 = (InterfaceC5885g2) this.f469a) == null) {
                return false;
            }
            ((C5892i1) interfaceC5885g2).m10612a();
            return true;
        }
        InterfaceC0666l interfaceC0666l2 = (InterfaceC0666l) this.f471c;
        if (interfaceC0666l2 != null) {
            ((C0670p) interfaceC0666l2).m1849g(2, true);
            return true;
        }
        AbstractC1416l.m3831g("focusManager");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public void m796N(LinkedHashMap linkedHashMap) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str = (String) entry.getKey();
            C2009c c2009c = (C2009c) entry.getValue();
            if (!c2009c.m4963c()) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                for (C2010d c2010d : c2009c.f6778a) {
                    jSONArray.put(new JSONObject().put("wxId", c2010d.f6782a).put("displayName", c2010d.f6783b));
                }
                jSONObject2.put("likes", jSONArray);
                JSONArray jSONArray2 = new JSONArray();
                Iterator it = c2009c.f6779b.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(m780X((C2008b) it.next()));
                }
                jSONObject2.put("comments", jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                for (C2010d c2010d2 : c2009c.f6780c) {
                    jSONArray3.put(new JSONObject().put("wxId", c2010d2.f6782a).put("displayName", c2010d2.f6783b));
                }
                jSONObject2.put("pendingLikes", jSONArray3);
                JSONArray jSONArray4 = new JSONArray();
                Iterator it2 = c2009c.f6781d.iterator();
                while (it2.hasNext()) {
                    jSONArray4.put(m780X((C2008b) it2.next()));
                }
                jSONObject2.put("pendingComments", jSONArray4);
                jSONObject.put(str, jSONObject2);
            }
        }
        String string = jSONObject.toString();
        string.getClass();
        ((SharedPreferences) this.f469a).edit().putString("entries_v1", string).commit();
        this.f470b = string;
        this.f471c = new LinkedHashMap(linkedHashMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public void m797O(Object obj) {
        long jM8069c = AbstractC3879i.m8069c();
        if (jM8069c == AbstractC3881k.f12739a) {
            this.f471c = obj;
            return;
        }
        synchronized (this.f470b) {
            C3880j c3880j = (C3880j) ((AtomicReference) this.f469a).get();
            int iM8073a = c3880j.m8073a(jM8069c);
            if (iM8073a < 0) {
                ((AtomicReference) this.f469a).set(c3880j.m8074b(obj, jM8069c));
            } else {
                c3880j.f12738c[iM8073a] = obj;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public void m798P(InterfaceC1031u interfaceC1031u) {
        ((C1565b) this.f471c).f5219g.f5217c = interfaceC1031u;
    }

    /* JADX DEBUG: Class process forced to load method for inline: ia.c.b(ia.c, java.util.List, java.util.List, java.util.ArrayList, java.util.ArrayList, int):ia.c */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public synchronized void m799Q(String str, List list) {
        C2008b c2008bM4960a;
        try {
            str.getClass();
            LinkedHashMap linkedHashMapM792J = m792J();
            C2009c c2009c = (C2009c) linkedHashMapM792J.get(str);
            List list2 = null;
            if (c2009c == null) {
                c2009c = new C2009c(15, list2, list2);
            }
            C2009c c2009c2 = c2009c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2008b c2008b = (C2008b) it.next();
                String string = AbstractC3149m.m6703R0(c2008b.f6774b).toString();
                String string2 = AbstractC3149m.m6703R0(c2008b.f6776d).toString();
                if (string.length() == 0 || string2.length() == 0) {
                    c2008bM4960a = null;
                } else {
                    String string3 = AbstractC3149m.m6703R0(c2008b.f6775c).toString();
                    String str2 = string3.length() == 0 ? string : string3;
                    long j3 = c2008b.f6777e;
                    if (j3 < 1) {
                        j3 = 1;
                    }
                    c2008bM4960a = C2008b.m4960a(c2008b, string, str2, string2, j3, 1);
                }
                if (c2008bM4960a != null) {
                    arrayList.add(c2008bM4960a);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((C2008b) obj).f6773a)) {
                    arrayList2.add(obj);
                }
            }
            HashSet hashSet2 = new HashSet();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                hashSet2.add(m783h((C2008b) it2.next()));
            }
            ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(c2009c2.f6781d, c2009c2.f6779b);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayListM8397F1) {
                if (!hashSet2.contains(m783h((C2008b) obj2))) {
                    arrayList3.add(obj2);
                }
            }
            HashSet hashSet3 = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (hashSet3.add(m783h((C2008b) obj3))) {
                    arrayList4.add(obj3);
                }
            }
            m778I(linkedHashMapM792J, str, C2009c.m4962b(c2009c2, null, arrayList2, null, arrayList4, 5));
            m796N(linkedHashMapM792J);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public void m800R(InterfaceC4233c interfaceC4233c) {
        ((C1565b) this.f471c).f5219g.f5215a = interfaceC4233c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S */
    public void m801S(EnumC4243m enumC4243m) {
        ((C1565b) this.f471c).f5219g.f5216b = enumC4243m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public synchronized void m802T(String str, List list) {
        C2010d c2010d;
        try {
            str.getClass();
            LinkedHashMap linkedHashMapM792J = m792J();
            C2009c c2009c = (C2009c) linkedHashMapM792J.get(str);
            List list2 = null;
            if (c2009c == null) {
                c2009c = new C2009c(15, list2, list2);
            }
            C2009c c2009c2 = c2009c;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C2010d c2010d2 = (C2010d) it.next();
                String string = AbstractC3149m.m6703R0(c2010d2.f6782a).toString();
                if (string.length() == 0) {
                    c2010d = null;
                } else {
                    String string2 = AbstractC3149m.m6703R0(c2010d2.f6783b).toString();
                    if (string2.length() == 0) {
                        string2 = string;
                    }
                    c2010d = new C2010d(string, string2);
                }
                if (c2010d != null) {
                    arrayList.add(c2010d);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((C2010d) obj).f6782a)) {
                    arrayList2.add(obj);
                }
            }
            HashSet hashSet2 = new HashSet();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                hashSet2.add(((C2010d) it2.next()).f6782a);
            }
            ArrayList arrayListM8397F1 = AbstractC4166m.m8397F1(c2009c2.f6780c, c2009c2.f6778a);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayListM8397F1) {
                if (!hashSet2.contains(((C2010d) obj2).f6782a)) {
                    arrayList3.add(obj2);
                }
            }
            HashSet hashSet3 = new HashSet();
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (hashSet3.add(((C2010d) obj3).f6782a)) {
                    arrayList4.add(obj3);
                }
            }
            m778I(linkedHashMapM792J, str, C2009c.m4962b(c2009c2, arrayList2, null, arrayList4, null, 10));
            m796N(linkedHashMapM792J);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public void m803U(long j3) {
        ((C1565b) this.f471c).f5219g.f5218d = j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: java.io.File */
    /* JADX DEBUG: Multi-variable search result rejected for r8v2, resolved type: java.io.File */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: java.io.File */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public void m804V(Context context, String str, String str2, String str3, float f3, boolean z9, File file, long j3) {
        File file2;
        boolean zAwait;
        Object obj;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        Set set = (Set) this.f470b;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicInteger atomicInteger = new AtomicInteger(-1);
        C3108a c3108a = new C3108a(atomicInteger, countDownLatch, 0);
        try {
            TextToSpeech textToSpeech = AbstractC3149m.m6721t0(str2) ? new TextToSpeech(context, c3108a) : new TextToSpeech(context, c3108a, str2);
            set.getClass();
            Set set2 = set;
            set2.add(textToSpeech);
            try {
                m814k(j3);
                zAwait = countDownLatch.await(15L, timeUnit);
                obj = null;
            } catch (Throwable th2) {
                th = th2;
                file2 = file;
            }
            try {
                if (!zAwait) {
                    throw new C3109b("连接超时", null);
                }
                m814k(j3);
                if (atomicInteger.get() != 0) {
                    throw new C3109b("状态 " + atomicInteger.get(), null);
                }
                Object field = KavaReflector.readField(textToSpeech, "mCurrentEngine");
                String str4 = field instanceof String ? (String) field : null;
                if (str4 == null) {
                    str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                String string = AbstractC3149m.m6703R0(str4).toString();
                if (!AbstractC3149m.m6721t0(str2) && !AbstractC3149m.m6721t0(string) && !string.equals(str2)) {
                    throw new C3109b("系统回退到 ".concat(string), null);
                }
                if (!AbstractC3149m.m6721t0(str3)) {
                    Set<Voice> voices = textToSpeech.getVoices();
                    if (voices != null) {
                        Iterator<T> it = voices.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Object next = it.next();
                            if (AbstractC1416l.m3825a(((Voice) next).getName(), str3)) {
                                obj = next;
                                break;
                            }
                        }
                        Voice voice = (Voice) obj;
                        if (voice != null) {
                            if (textToSpeech.setVoice(voice) == -1) {
                                throw new IllegalStateException("TTS 角色设置失败");
                            }
                        }
                    }
                    throw new IllegalStateException("所选 TTS 角色已不可用");
                }
                textToSpeech.setLanguage(z9 ? Locale.US : Locale.SIMPLIFIED_CHINESE);
                if (textToSpeech.setSpeechRate(AbstractC3123p.m6631a(f3)) == -1) {
                    throw new IllegalStateException("TTS 语速设置失败");
                }
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.isDirectory() && !parentFile.mkdirs()) {
                    throw new IllegalStateException("无法创建语音缓存目录");
                }
                file.delete();
                String str5 = "hchat_" + UUID.randomUUID();
                CountDownLatch countDownLatch2 = new CountDownLatch(1);
                AtomicReference atomicReference = new AtomicReference();
                textToSpeech.setOnUtteranceProgressListener(new C3110c(str5, countDownLatch2, atomicReference));
                if (textToSpeech.synthesizeToFile(str, new Bundle(), file, str5) == -1) {
                    throw new IllegalStateException("TTS 引擎拒绝合成");
                }
                if (!countDownLatch2.await(60L, timeUnit)) {
                    throw new IllegalStateException("TTS 合成超时");
                }
                String str6 = (String) atomicReference.get();
                if (str6 != null) {
                    throw new IllegalStateException(str6.toString());
                }
                if (!file.isFile() || file.length() <= 0) {
                    throw new IllegalStateException("TTS 未生成语音文件");
                }
                if (file.length() > 16777216) {
                    throw new IllegalStateException("语音文件超过 16 MiB");
                }
                set2.remove(textToSpeech);
                try {
                    textToSpeech.stop();
                } catch (Throwable unused) {
                }
                try {
                    textToSpeech.shutdown();
                } catch (Throwable unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
                file2 = zAwait;
                try {
                    file2.delete();
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th4) {
            throw new C3109b("创建失败", th4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public void m805Z() {
        C0943k0 c0943k0 = (C0943k0) this.f469a;
        String str = (String) this.f470b;
        List list = (List) c0943k0.m2324k(str);
        if (list != null) {
            list.remove((InterfaceC1220a) this.f471c);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        c0943k0.m2326m(str, list);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public synchronized void m806a(String str, C2009c c2009c) {
        try {
            str.getClass();
            LinkedHashMap linkedHashMapM792J = m792J();
            C2009c c2009c2 = (C2009c) linkedHashMapM792J.get(str);
            if (c2009c2 != null) {
                List list = c2009c.f6780c;
                HashSet hashSet = new HashSet();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    hashSet.add(((C2010d) it.next()).f6782a);
                }
                List list2 = c2009c.f6781d;
                HashSet hashSet2 = new HashSet();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    hashSet2.add(m783h((C2008b) it2.next()));
                }
                List list3 = c2009c2.f6780c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : list3) {
                    if (!hashSet.contains(((C2010d) obj).f6782a)) {
                        arrayList.add(obj);
                    }
                }
                List list4 = c2009c2.f6781d;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list4) {
                    if (!hashSet2.contains(m783h((C2008b) obj2))) {
                        arrayList2.add(obj2);
                    }
                }
                m778I(linkedHashMapM792J, str, C2009c.m4962b(c2009c2, null, null, arrayList, arrayList2, 3));
                m796N(linkedHashMapM792J);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public void m807b(C5602f0 c5602f0, EnumC5642s enumC5642s) {
        C2571a c2571a = (C2571a) this.f469a;
        C2571a c2571a2 = (C2571a) this.f470b;
        C2571a c2571a3 = (C2571a) this.f471c;
        int iOrdinal = enumC5642s.ordinal();
        if (iOrdinal == 0) {
            c2571a.m6026f(c5602f0);
            c2571a3.m6026f(c5602f0);
            return;
        }
        if (iOrdinal == 1) {
            c2571a2.m6026f(c5602f0);
            c2571a3.m6026f(c5602f0);
            return;
        }
        if (iOrdinal == 2) {
            if (c5602f0.f22797n != null) {
                c2571a3.m6026f(c5602f0);
                return;
            } else {
                c2571a.m6026f(c5602f0);
                return;
            }
        }
        if (iOrdinal != 3) {
            C3193a.m6822k();
        } else if (c5602f0.f22797n != null) {
            c2571a3.m6026f(c5602f0);
        } else {
            c2571a2.m6026f(c5602f0);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p136j8.InterfaceC2106q
    /* JADX INFO: renamed from: c */
    public void mo808c(String str) {
        C4537q c4537q = (C4537q) this.f470b;
        C4528h c4528h = (C4528h) this.f471c;
        c4537q.m8956b(c4528h, null, new C0045e(c4528h, str, c4537q, 14));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public synchronized LinkedHashSet m809d() {
        return new LinkedHashSet(m792J().keySet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public String m810f() {
        String str;
        Calendar calendar = Calendar.getInstance(Locale.US);
        calendar.setTime(new Date());
        calendar.setTimeInMillis((calendar.getTimeInMillis() / 300000) * 300000);
        synchronized (((SimpleDateFormat) this.f471c)) {
            str = ((SimpleDateFormat) this.f471c).format(calendar.getTime());
        }
        return AbstractC0255e.m1020i(str, ".log");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public synchronized void m811g() {
        new LinkedHashSet(m792J().keySet());
        ((SharedPreferences) this.f469a).edit().remove("entries_v1").commit();
        this.f470b = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f471c = new LinkedHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public boolean m812i(C5602f0 c5602f0) {
        return !(c5602f0.f22797n == null) && (((C5584a2) ((C2571a) this.f469a).f8339h).contains(c5602f0) || ((C5584a2) ((C2571a) this.f470b).f8339h).contains(c5602f0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public void m813j(String str) {
        C0208f c0208f = (C0208f) this.f470b;
        if (c0208f == null) {
            C2104o.m5299y(AbstractC4855en.m9263g("Invalid state endTag ", str));
            return;
        }
        boolean zEquals = false;
        if (str != null) {
            int i9 = AbstractC0214l.f522a;
            int iIndexOf = str.indexOf(58);
            String strSubstring = iIndexOf > 0 ? str.substring(0, iIndexOf) : null;
            if (strSubstring == null || strSubstring.equals(null)) {
                zEquals = str.equals(c0208f.f512l);
            }
        } else if (c0208f.f512l == null) {
            zEquals = true;
        }
        if (zEquals) {
            this.f470b = c0208f.m884r();
            this.f471c = null;
        } else {
            StringBuilder sbM1026o = AbstractC0255e.m1026o("Mismatch end: ", str, ", expect = ");
            sbM1026o.append(c0208f.f512l);
            throw new IOException(sbM1026o.toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public void m814k(long j3) throws InterruptedException {
        if (j3 != ((AtomicLong) this.f471c).get() || Thread.currentThread().isInterrupted()) {
            throw new InterruptedException("TTS 合成已取消");
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public synchronized C2009c m815l(String str) {
        C2009c c2009c;
        try {
            str.getClass();
            C2009c c2009c2 = (C2009c) m792J().get(str);
            if (c2009c2 != null) {
                c2009c = C2009c.m4961a(AbstractC4166m.m8407P1(c2009c2.f6778a), AbstractC4166m.m8407P1(c2009c2.f6779b), AbstractC4166m.m8407P1(c2009c2.f6780c), AbstractC4166m.m8407P1(c2009c2.f6781d));
            } else {
                List list = null;
                c2009c = new C2009c(15, list, list);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c2009c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public void m816m(String str) {
        InterfaceC2101l interfaceC2101l = (InterfaceC2101l) this.f469a;
        if (interfaceC2101l == null || !((AtomicBoolean) this.f471c).compareAndSet(false, true)) {
            return;
        }
        try {
            interfaceC2101l.mo597c(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0023  */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m817n(String str, String str2, String str3, String str4) {
        String strM6737a0;
        String strM3729r;
        InterfaceC3950d interfaceC3950d = (InterfaceC3950d) this.f471c;
        String strM3729r2 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (TextUtils.isEmpty(str2)) {
            strM6737a0 = "未知";
        } else {
            str2.getClass();
            strM6737a0 = AbstractC3156t.m6737a0(str2, "元", HttpUrl.FRAGMENT_ENCODE_SET, false);
        }
        if (TextUtils.isEmpty(str3)) {
            strM3729r = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            try {
                WeChatApis.contact().getClass();
                C1368i c1368i = WeChatApis.contactApi;
                strM3729r = (c1368i == null || !c1368i.m3704G()) ? str3 != null ? str3 : HttpUrl.FRAGMENT_ENCODE_SET : c1368i.m3729r(str3);
                strM3729r.getClass();
            } catch (Throwable th2) {
                interfaceC3950d.mo3415a("解析会话名失败: " + th2.getMessage());
                if (str3 != null) {
                    strM3729r = str3;
                }
            }
        }
        if (TextUtils.isEmpty(strM3729r)) {
            strM3729r = "未知会话";
        }
        String strM793K = m793K(str4, !TextUtils.isEmpty(str4) ? (String) ((C2923k) this.f469a).f9544g.get(str4) : HttpUrl.FRAGMENT_ENCODE_SET);
        if (!TextUtils.isEmpty(strM793K)) {
            try {
                WeChatApis.contact().getClass();
                C1368i c1368i2 = WeChatApis.contactApi;
                if (c1368i2 == null || !c1368i2.m3704G()) {
                    strM3729r2 = strM793K;
                } else {
                    strM3729r2 = (TextUtils.isEmpty(str3) || !C1368i.m3686I(str3)) ? c1368i2.m3729r(strM793K) : c1368i2.m3731t(str3, strM793K);
                }
                strM3729r2.getClass();
            } catch (Throwable th3) {
                interfaceC3950d.mo3415a("解析成员名失败: " + th3.getMessage());
                strM3729r2 = strM793K;
            }
        }
        if (TextUtils.isEmpty(strM3729r2)) {
            strM3729r2 = "未知成员";
        }
        String strM2251n = AbstractC0921a.m2251n("@", strM3729r2, "\u2005");
        return AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(AbstractC3156t.m6737a0(str, "{amount}", strM6737a0, false), "{金额}", strM6737a0, false), "{talker}", strM3729r, false), "{会话}", strM3729r, false), "{@发红包的人}", strM2251n, false), "{@sender}", strM2251n, false), "{@成员}", strM2251n, false), "{sender}", strM3729r2, false), "{成员}", strM3729r2, false), "{time}", AbstractC0000a.m23M(System.currentTimeMillis(), ((C2458l) this.f470b).m5855d("hb_time_format", "yyyy-MM-dd HH:mm:ss")), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public Object m818o() {
        long jM8069c = AbstractC3879i.m8069c();
        if (jM8069c == AbstractC3881k.f12739a) {
            return this.f471c;
        }
        C3880j c3880j = (C3880j) ((AtomicReference) this.f469a).get();
        int iM8073a = c3880j.m8073a(jM8069c);
        if (iM8073a >= 0) {
            return c3880j.f12738c[iM8073a];
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p136j8.InterfaceC2106q
    public void onSuccess(File file) {
        C4528h c4528h = (C4528h) this.f471c;
        C4537q c4537q = (C4537q) this.f470b;
        long j3 = ((C4525e) this.f469a).f14927e;
        if (j3 <= 0 || file.length() >= j3) {
            c4537q.m8956b(c4528h, new C4523c(c4537q, c4528h, file), new C4523c(c4528h, file, c4537q));
            return;
        }
        StringBuilder sbM6842o = AbstractC3199a.m6842o(file.length(), "视频下载文件不完整: ", "/");
        sbM6842o.append(j3);
        c4537q.m8956b(c4528h, null, new C0045e(c4528h, sbM6842o.toString(), c4537q, 14));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public InterfaceC1031u m819p() {
        return ((C1565b) this.f471c).f5219g.f5217c;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public C0826a m820q(C0826a c0826a) {
        return new C0826a(new C0185d((C0710g) c0826a.f11157g), null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public C3290b m821r() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((C2469w) this.f471c)) {
            try {
                C3290b c3290b = (C3290b) this.f470b;
                if (c3290b != null && localeList == ((LocaleList) this.f469a)) {
                    return c3290b;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i9 = 0; i9 < size; i9++) {
                    arrayList.add(new C3289a(localeList.get(i9)));
                }
                C3290b c3290b2 = new C3290b(arrayList);
                this.f469a = localeList;
                this.f470b = c3290b2;
                return c3290b2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public InterfaceC4233c m822s() {
        return ((C1565b) this.f471c).f5219g.f5215a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public C4623o0 m823t() {
        C4623o0 c4623o0 = (C4623o0) this.f470b;
        if (c4623o0 != null) {
            return c4623o0;
        }
        AbstractC1416l.m3831g("keyboardActions");
        throw null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public EnumC4243m m824u() {
        return ((C1565b) this.f471c).f5219g.f5216b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public long m825v() {
        return ((C1565b) this.f471c).f5219g.f5218d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public boolean m826w(CharSequence charSequence, int i9, int i10, C2467u c2467u) {
        if ((c2467u.f8097c & 3) == 0) {
            C2450d c2450d = (C2450d) this.f471c;
            C2775a c2775aM5863b = c2467u.m5863b();
            int iM6155a = c2775aM5863b.m6155a(8);
            if (iM6155a != 0) {
                ((ByteBuffer) c2775aM5863b.f9018j).getShort(iM6155a + c2775aM5863b.f9015g);
            }
            c2450d.getClass();
            ThreadLocal threadLocal = C2450d.f8052b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i9 < i10) {
                sb2.append(charSequence.charAt(i9));
                i9++;
            }
            TextPaint textPaint = c2450d.f8053a;
            String string = sb2.toString();
            int i11 = AbstractC0172b.f449a;
            boolean zHasGlyph = textPaint.hasGlyph(string);
            int i12 = c2467u.f8097c & 4;
            c2467u.f8097c = zHasGlyph ? i12 | 2 : i12 | 1;
        }
        return (c2467u.f8097c & 3) == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public boolean m827x(Method method) {
        Object c3959f;
        Set set = (Set) this.f471c;
        if (Modifier.isAbstract(method.getModifiers()) || method.getDeclaringClass().isInterface()) {
            set.remove(method);
            return false;
        }
        try {
            C3744i.f12154b.m7763b(method, new C0219e(this));
            c3959f = Boolean.TRUE;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            set.remove(method);
            AbstractC0921a.m2261x("[Hchat:HideChatMenu] 安装聊天长按菜单 Hook 失败: ", method.toGenericString(), thM8182b);
            c3959f = Boolean.FALSE;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    /* JADX INFO: renamed from: y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m828y(String str) {
        boolean zAdd;
        C2923k c2923k = (C2923k) this.f470b;
        if (!TextUtils.isEmpty(str) && str != null) {
            String strM2790s0 = AbstractC1089i.m2790s0(str);
            zAdd = (TextUtils.isEmpty(strM2790s0) || c2923k.f9539b.add(strM2790s0)) ? c2923k.f9538a.add(str) : false;
        }
        if (!zAdd) {
            return false;
        }
        try {
            SharedPreferences sharedPreferencesM8640c = AbstractC4302b.m8640c((Context) this.f469a, "Hchat_redpacket_config");
            sharedPreferencesM8640c.edit().putInt("hb_stats_count", sharedPreferencesM8640c.getInt("hb_stats_count", 0) + 1).putInt("hb_stats_today", sharedPreferencesM8640c.getInt("hb_stats_today", 0) + 1).apply();
        } catch (Throwable unused) {
        }
        return true;
    }

    public C0184c(int i9) {
        switch (i9) {
            case 18:
                this.f469a = new WeakHashMap();
                this.f470b = new WeakHashMap();
                this.f471c = new WeakHashMap();
                break;
            case 21:
                long[] jArr = AbstractC0957r0.f3015a;
                this.f469a = new C0943k0();
                break;
            case 22:
                this.f469a = new AtomicReference(AbstractC3879i.f12735b);
                this.f470b = new Object();
                break;
            case 29:
                this.f469a = new C2571a(28);
                this.f470b = new C2571a(28);
                this.f471c = new C2571a(28);
                break;
            default:
                this.f471c = new C2469w(17);
                break;
        }
    }

    public C0184c(Context context, int i9) {
        switch (i9) {
            case 13:
                this.f469a = context;
                this.f470b = AbstractC2091b.m5168o();
                this.f471c = new AtomicLong(0L);
                break;
            case 28:
                Context applicationContext = context.getApplicationContext();
                this.f469a = applicationContext != null ? applicationContext : context;
                Locale locale = Locale.US;
                this.f470b = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", locale);
                this.f471c = new SimpleDateFormat("yyyy-MM-dd_HH-mm", locale);
                break;
            default:
                this.f469a = AbstractC4302b.m8640c(context, "Hchat_moments_fake_interaction_config");
                this.f471c = new LinkedHashMap();
                break;
        }
    }

    public /* synthetic */ C0184c(Object obj, Object obj2, Object obj3) {
        this.f469a = obj;
        this.f470b = obj2;
        this.f471c = obj3;
    }

    public C0184c(AbstractC1978s abstractC1978s, C1973n c1973n, C6093g c6093g) {
        if (abstractC1978s == null) {
            C0353j.m1305c("locals == null");
            throw null;
        }
        if (c1973n != null) {
            c6093g.m10856k();
            this.f469a = abstractC1978s;
            this.f470b = c1973n;
            this.f471c = c6093g;
            return;
        }
        C0353j.m1305c("stack == null");
        throw null;
    }

    public C0184c(C2774r c2774r, C0184c c0184c) {
        this.f469a = c2774r;
        this.f470b = c0184c;
        this.f471c = c2774r.f9013g;
    }
}
