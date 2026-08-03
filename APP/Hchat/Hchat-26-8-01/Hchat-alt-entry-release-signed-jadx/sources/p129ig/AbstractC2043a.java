package p129ig;

import ac.AbstractC0063p;
import ac.C0058k;
import ae.C0076g;
import ag.AbstractC0085a;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import bg.AbstractC0311a;
import bi.AbstractC0316d;
import bi.AbstractC0323k;
import bi.AbstractC0325m;
import bi.C0314b;
import bi.C0321i;
import bi.C0322j;
import bi.C0324l;
import bsh.org.objectweb.asm.Opcodes;
import ci.C0593l;
import ci.C0608t;
import com.alibaba.fastjson2.JSONB;
import gf.C1402a;
import gg.AbstractC1416l;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import java.util.regex.Pattern;
import mc.InterfaceC2823a;
import nc.C2958a;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import okio.Utf8;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p012ah.C0086a;
import p025bc.AbstractC0255e;
import p027c0.C0368m;
import p054dg.AbstractC0793l;
import p057e1.C0807b;
import p065eb.C0893s0;
import p068eh.AbstractC0921a;
import p069f.C0929d0;
import p069f.C0933f0;
import p069f.C0943k0;
import p071f1.AbstractC0996c0;
import p071f1.C1032u0;
import p071f1.C1034w;
import p072f2.AbstractC1049l;
import p072f2.AbstractC1058u;
import p072f2.C1046i;
import p072f2.C1050m;
import p072f2.C1061x;
import p080fb.AbstractC1184v0;
import p080fb.C1183v;
import p080fb.C1186w;
import p080fb.C1187w0;
import p080fb.C1190x0;
import p084ff.C1219e;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p085fg.InterfaceC1236q;
import p090g2.C1293b;
import p092g4.AbstractC1341a;
import p099h.Hchat.dexkit.DexFinder;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p099h.Hchat.utils.KavaReflector;
import p102h2.EnumC1571a;
import p104h4.C1593g;
import p104h4.C1594h;
import p104h4.C1597k;
import p104h4.C1598l;
import p104h4.C1599m;
import p104h4.C1600n;
import p104h4.C1601o;
import p104h4.C1602p;
import p104h4.C1606t;
import p104h4.C1607u;
import p115hh.C1727l;
import p115hh.C1732q;
import p116i.AbstractC1742d;
import p116i.C1739c;
import p117i0.AbstractC1855m;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1858m2;
import p117i0.C1873q1;
import p117i0.C1876r1;
import p117i0.InterfaceC1809a1;
import p119i2.C1926g;
import p119i2.C1939m0;
import p119i2.C1941n0;
import p129ig.AbstractC2043a;
import p131j0.C2046b;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p141jf.C2132h;
import p143jh.C2137a;
import p143jh.C2151o;
import p144k.AbstractC2191m1;
import p144k.AbstractC2192n;
import p144k.AbstractC2217v0;
import p159l0.AbstractC2428j;
import p159l0.C2420b;
import p159l0.C2429k;
import p162l3.C2469w;
import p163l4.InterfaceC2473b;
import p174m.C2571a;
import p177m2.C2757a;
import p177m2.C2761e;
import p177m2.C2768l;
import p190n2.C2884s;
import p215od.C3128a;
import p215od.C3131d;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.AbstractC3241o;
import p222p.C3200a0;
import p222p.C3202b;
import p222p.C3205c;
import p222p.C3255s1;
import p230p8.C3373y;
import p233pd.C3393d;
import p233pd.C3402m;
import p233pd.C3403n;
import p245qc.C3491a;
import p245qc.C3494d;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p249qg.InterfaceC3599t;
import p254r3.C3658e;
import p255r4.AbstractC3665d;
import p259r9.AbstractC3754e0;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p266s0.C3878h;
import p267s1.AbstractC3898h0;
import p269s3.C3927e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p282t4.C4114a;
import p282t4.C4115b;
import p282t4.C4116c;
import p282t4.C4117d;
import p293u2.AbstractC4232b;
import p293u2.AbstractC4239i;
import p293u2.C4231a;
import p293u2.C4240j;
import p293u2.C4241k;
import p293u2.C4242l;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;
import p300ub.AbstractC4302b;
import p302ud.C4309e;
import p302ud.C4322r;
import p302ud.C4325u;
import p304uf.C4333g;
import p308v1.AbstractC4377b1;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4412n0;
import p308v1.InterfaceC4418p0;
import p311v4.AbstractC4446a;
import p311v4.C4450c;
import p311v4.C4451c0;
import p311v4.C4452d;
import p311v4.C4453d0;
import p311v4.C4466o;
import p311v4.C4469r;
import p326w4.C4682b;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;
import p331wa.C4690a;
import p332wb.AbstractC4855en;
import p332wb.C4960ht;
import p332wb.C5086lp;
import p338x0.C5571a;
import p338x0.C5572b;
import p338x0.C5576f;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5602f0;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p347xa.C5745f;
import p354xh.C5831p;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5845g;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5883g0;
import p357y1.AbstractC5888h1;
import p357y1.C5896j1;
import p357y1.C5944v1;
import p357y1.InterfaceC5917o2;
import p373z0.C6064d;
import p373z0.C6066f;
import p373z0.C6072l;
import p373z0.C6074n;
import p373z0.InterfaceC6073m;
import p376z4.C6098l;
import sc.InterfaceC3952a;
import sh.AbstractC4045s;
import sh.C3999d0;
import sh.C4007f0;
import sh.C4063y;
import sh.EnumC4010g0;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.C4173t;
import tf.C4174u;
import ua.C4292c;
import ua.C4298i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: ig.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2043a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static final Object m4995A(DexFinder dexFinder, Class cls) {
        Method method;
        Object objInvoke;
        Object obj = null;
        if (dexFinder == null || (method = dexFinder.serviceGetterMethod) == null || cls == null) {
            return null;
        }
        try {
            if (KavaReflector.isStatic(method) && (objInvoke = KavaReflector.invoke(method, null, cls)) != null) {
                if (cls.isInstance(objInvoke)) {
                    obj = objInvoke;
                }
            }
        } catch (Throwable unused) {
        }
        if (obj != null) {
            return obj;
        }
        Method method2 = dexFinder.serviceGetterMethod;
        method2.getClass();
        return m5046t(method2, cls, cls, new HashSet());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final C1926g m4996B(C2884s c2884s, int i9) {
        C1926g c1926g = c2884s.f9316a;
        C1926g c1926g2 = c2884s.f9316a;
        long j3 = c2884s.f9317b;
        int iM4815e = C1939m0.m4815e(j3);
        int iM4815e2 = C1939m0.m4815e(j3);
        int length = iM4815e2 + i9;
        if (((i9 ^ length) & (iM4815e2 ^ length)) < 0) {
            length = c1926g2.f6529h.length();
        }
        return c1926g.subSequence(iM4815e, Math.min(length, c1926g2.f6529h.length()));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static final C1926g m4997C(C2884s c2884s, int i9) {
        C1926g c1926g = c2884s.f9316a;
        long j3 = c2884s.f9317b;
        int iM4816f = C1939m0.m4816f(j3);
        int i10 = iM4816f - i9;
        if (((iM4816f ^ i10) & (i9 ^ iM4816f)) < 0) {
            i10 = 0;
        }
        return c1926g.subSequence(Math.max(0, i10), C1939m0.m4816f(j3));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static void m4998D(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i9) {
        if (!m5003I(b11)) {
            if ((((b11 + 112) + (b10 << 28)) >> 30) == 0 && !m5003I(b12) && !m5003I(b13)) {
                int i10 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
                cArr[i9] = (char) ((i10 >>> 10) + Utf8.HIGH_SURROGATE_HEADER);
                cArr[i9 + 1] = (char) ((i10 & 1023) + Utf8.LOG_SURROGATE_HEADER);
                return;
            }
        }
        C2104o.m5294t("Invalid UTF-8");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static void m4999E(byte b10, byte b11, byte b12, char[] cArr, int i9) {
        if (m5003I(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || m5003I(b12)))) {
            C2104o.m5294t("Invalid UTF-8");
        } else {
            cArr[i9] = (char) (((b10 & 15) << 12) | ((b11 & 63) << 6) | (b12 & 63));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static void m5000F(byte b10, byte b11, char[] cArr, int i9) {
        if (b10 < -62) {
            C2104o.m5294t("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
        } else if (m5003I(b11)) {
            C2104o.m5294t("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
        } else {
            cArr[i9] = (char) (((b10 & 31) << 6) | (b11 & 63));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static C4333g m5001G(C1183v c1183v) {
        String string = AbstractC3149m.m6703R0(c1183v.f3978c).toString();
        String str = c1183v.f3986k;
        if (AbstractC1416l.m3825a(str, "anthropic")) {
            C4333g c4333g = new C4333g();
            c4333g.put("anthropic-version", "2023-06-01");
            if (!AbstractC3149m.m6721t0(string)) {
                c4333g.put("x-api-key", string);
            }
            return c4333g.m8780c();
        }
        if (AbstractC1416l.m3825a(str, "gemini")) {
            C4333g c4333g2 = new C4333g();
            if (!AbstractC3149m.m6721t0(string)) {
                c4333g2.put("x-goog-api-key", string);
            }
            return c4333g2.m8780c();
        }
        C4333g c4333g3 = new C4333g();
        if (!AbstractC3149m.m6721t0(string)) {
            c4333g3.put("Authorization", "Bearer ".concat(string));
        }
        return c4333g3.m8780c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static C1187w0 m5002H(String str) {
        boolean z9 = true;
        if (AbstractC3156t.m6740d0(str, "data:", false)) {
            int iM6719r0 = AbstractC3149m.m6719r0(str, ",", 0, false, 6);
            if (iM6719r0 <= 5 || !AbstractC3156t.m6733W(str.substring(5, iM6719r0), ";base64", false)) {
                return null;
            }
            return new C1187w0(AbstractC3149m.m6687B0(str.substring(5, iM6719r0), ";base64"), str.substring(iM6719r0 + 1), true);
        }
        if (!AbstractC3156t.m6740d0(str, "http://", false) && !AbstractC3156t.m6740d0(str, "https://", false)) {
            z9 = false;
        }
        if (!z9) {
            str = null;
        }
        if (str != null) {
            return new C1187w0(HttpUrl.FRAGMENT_ENCODE_SET, str, false);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static boolean m5003I(byte b10) {
        return b10 > -65;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static boolean m5004J(Class cls, Method method) {
        if (method != null && AbstractC1416l.m3825a(method.getDeclaringClass(), cls)) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            if (!Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 1 && List.class.isAssignableFrom(parameterTypes[0])) {
                return true;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static JSONObject m5005K(String str) {
        Object c3959f;
        try {
            c3959f = new JSONObject(str);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (C3960g.m8182b(c3959f) != null) {
            c3959f = new JSONObject();
        }
        return (JSONObject) c3959f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static boolean m5006L(File file) {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:29:0x0084 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX INFO: renamed from: M */
    public static String m5007M(C1183v c1183v) {
        int iNextIndex;
        String str = c1183v.f3976a;
        String str2 = c1183v.f3986k;
        String strM3232p = C1186w.m3232p(str, str2, c1183v.f3977b);
        if (!AbstractC3149m.m6721t0(strM3232p)) {
            Uri uri = Uri.parse(strM3232p);
            boolean zEquals = str2.equals("anthropic");
            String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            if (zEquals) {
                String encodedPath = uri.getEncodedPath();
                if (encodedPath != null) {
                    str3 = encodedPath;
                }
                List listM6691F0 = AbstractC3149m.m6691F0(str3, new char[]{'/'}, 6);
                ?? arrayList = new ArrayList();
                for (Object obj : listM6691F0) {
                    if (!AbstractC3149m.m6721t0((String) obj)) {
                        arrayList.add(obj);
                    }
                }
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                        break;
                    }
                    if (AbstractC3156t.m6734X((String) listIterator.previous(), "messages")) {
                        iNextIndex = listIterator.nextIndex();
                        break;
                    }
                }
                Integer numValueOf = iNextIndex >= 0 ? Integer.valueOf(iNextIndex) : null;
                if (numValueOf != null) {
                    arrayList = AbstractC4166m.m8403L1(numValueOf.intValue(), arrayList);
                }
                return uri.buildUpon().encodedPath("/".concat(AbstractC4166m.m8392A1(AbstractC4166m.m8398G1(arrayList, "models"), "/", null, null, null, 62))).clearQuery().appendQueryParameter("limit", "1000").build().toString();
            }
            if (str2.equals("gemini")) {
                Uri.Builder builderBuildUpon = uri.buildUpon();
                String encodedPath2 = uri.getEncodedPath();
                if (encodedPath2 != null) {
                    str3 = encodedPath2;
                }
                return builderBuildUpon.encodedPath(AbstractC3149m.m6706U0(str3, '/') + "/models").clearQuery().appendQueryParameter("pageSize", "1000").build().toString();
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static final long m5008N(long j3, float f3) {
        return (Float.isNaN(f3) || f3 >= 1.0f) ? j3 : C1034w.m2634b(j3, C1034w.m2636d(j3) * f3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static List m5009O(C2429k c2429k, int i9, C2429k c2429k2, boolean z9, boolean z10, boolean z11) {
        List list;
        boolean z12;
        int i10;
        int i11;
        int iM5835u = c2429k.m5835u(i9);
        int i12 = i9 + iM5835u;
        int iM5821f = c2429k.m5821f(i9);
        int iM5821f2 = c2429k.m5821f(i12);
        int i13 = iM5821f2 - iM5821f;
        boolean z13 = i9 >= 0 && (c2429k.f7964b[(c2429k.m5832r(i9) * 5) + 1] & 201326592) != 0;
        c2429k2.m5837w(iM5835u);
        c2429k2.m5838x(i13, c2429k2.f7982t);
        if (c2429k.f7969g < i12) {
            c2429k.m5796B(i12);
        }
        if (c2429k.f7973k < iM5821f2) {
            c2429k.m5797C(iM5821f2, i12);
        }
        int[] iArr = c2429k2.f7964b;
        int i14 = c2429k2.f7982t;
        int i15 = i14 * 5;
        AbstractC4165l.m8381p0(c2429k.f7964b, iArr, i15, i9 * 5, i12 * 5);
        Object[] objArr = c2429k2.f7965c;
        int i16 = c2429k2.f7971i;
        System.arraycopy(c2429k.f7965c, iM5821f, objArr, i16, i13);
        int i17 = c2429k2.f7984v;
        iArr[i15 + 2] = i17;
        int i18 = i14 - i9;
        int i19 = i14 + iM5835u;
        int iM5822g = i16 - c2429k2.m5822g(iArr, i14);
        int i20 = c2429k2.f7975m;
        int i21 = c2429k2.f7974l;
        int length = objArr.length;
        boolean z14 = z13;
        int i22 = i20;
        int i23 = i14;
        while (i23 < i19) {
            if (i23 != i14) {
                int i24 = (i23 * 5) + 2;
                iArr[i24] = iArr[i24] + i18;
            }
            int[] iArr2 = iArr;
            int iM5822g2 = c2429k2.m5822g(iArr, i23) + iM5822g;
            if (i22 < i23) {
                i10 = i14;
                i11 = 0;
            } else {
                i10 = i14;
                i11 = c2429k2.f7973k;
            }
            iArr2[(i23 * 5) + 4] = C2429k.m5793i(iM5822g2, i11, i21, length);
            if (i23 == i22) {
                i22++;
            }
            i23++;
            i14 = i10;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        c2429k2.f7975m = i22;
        int iM5787a = AbstractC2428j.m5787a(c2429k.f7966d, i9, c2429k.m5830p());
        int iM5787a2 = AbstractC2428j.m5787a(c2429k.f7966d, i12, c2429k.m5830p());
        if (iM5787a < iM5787a2) {
            ArrayList arrayList = c2429k.f7966d;
            ArrayList arrayList2 = new ArrayList(iM5787a2 - iM5787a);
            for (int i25 = iM5787a; i25 < iM5787a2; i25++) {
                C2420b c2420b = (C2420b) arrayList.get(i25);
                c2420b.f7923a += i18;
                arrayList2.add(c2420b);
            }
            c2429k2.f7966d.addAll(AbstractC2428j.m5787a(c2429k2.f7966d, c2429k2.f7982t, c2429k2.m5830p()), arrayList2);
            arrayList.subList(iM5787a, iM5787a2).clear();
            list = arrayList2;
        } else {
            list = C4173t.f13710g;
        }
        if (!list.isEmpty()) {
            HashMap map = c2429k.f7967e;
            HashMap map2 = c2429k2.f7967e;
            if (map != null && map2 != null) {
                int size = list.size();
                for (int i26 = 0; i26 < size; i26++) {
                }
            }
        }
        int i27 = c2429k2.f7984v;
        c2429k2.m5809O(i17);
        int iM5799E = c2429k.m5799E(c2429k.f7964b, i9);
        if (!z11) {
            z12 = false;
        } else if (z9) {
            boolean z15 = iM5799E >= 0;
            if (z15) {
                c2429k.m5810P();
                c2429k.m5816a(iM5799E - c2429k.f7982t);
                c2429k.m5810P();
            }
            c2429k.m5816a(i9 - c2429k.f7982t);
            boolean zM5802H = c2429k.m5802H();
            if (z15) {
                c2429k.m5807M();
                c2429k.m5824j();
                c2429k.m5807M();
                c2429k.m5824j();
            }
            z12 = zM5802H;
        } else {
            boolean zM5803I = c2429k.m5803I(i9, iM5835u);
            c2429k.m5804J(iM5821f, i13, i9 - 1);
            z12 = zM5803I;
        }
        if (z12) {
            AbstractC1855m.m4573a("Unexpectedly removed anchors");
        }
        int i28 = c2429k2.f7977o;
        int i29 = iArr3[i15 + 1];
        c2429k2.f7977o = i28 + ((1073741824 & i29) != 0 ? 1 : i29 & 67108863);
        if (z10) {
            c2429k2.f7982t = i19;
            c2429k2.f7971i = i16 + i13;
        }
        if (z14) {
            c2429k2.m5814T(i17);
        }
        return list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static Field m5010P(Class cls, String str, Class cls2) {
        Field fieldFindFieldRecursive = KavaReflector.findFieldRecursive(cls, str);
        if (fieldFindFieldRecursive == null) {
            return null;
        }
        if (!Modifier.isStatic(fieldFindFieldRecursive.getModifiers()) && AbstractC1416l.m3825a(fieldFindFieldRecursive.getType(), cls2)) {
            return fieldFindFieldRecursive;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:69:0x009a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m5011Q(JSONObject jSONObject, byte[] bArr, int i9, int i10) throws JSONException {
        int i11;
        int i12;
        boolean zEquals;
        Object objValueOf;
        JSONArray jSONArray;
        int i13 = 0;
        while (i13 < i9 && i10 < 12) {
            C4690a c4690aM5016V = m5016V(bArr, i13, i9);
            int i14 = c4690aM5016V.f15663b;
            long j3 = c4690aM5016V.f15662a;
            long j4 = 0;
            if (j3 == 0) {
                return;
            }
            int i15 = (int) (j3 >>> 3);
            int i16 = (int) (j3 & 7);
            if (i16 == 0) {
                C4690a c4690aM5016V2 = m5016V(bArr, i14, i9);
                i11 = c4690aM5016V2.f15663b;
                objValueOf = Long.valueOf(c4690aM5016V2.f15662a);
            } else if (i16 == 1) {
                i11 = i14 + 8;
                if (i11 > i9) {
                    return;
                }
                for (int i17 = 0; i17 < 8; i17++) {
                    j4 |= ((long) (bArr[i14 + i17] & 255)) << (i17 * 8);
                }
                objValueOf = Long.valueOf(j4);
            } else if (i16 == 2) {
                C4690a c4690aM5016V3 = m5016V(bArr, i14, i9);
                int i18 = c4690aM5016V3.f15663b;
                int i19 = (int) c4690aM5016V3.f15662a;
                if (i19 < 0 || (i12 = i18 + i19) > i9) {
                    return;
                }
                byte[] bArr2 = new byte[i19];
                System.arraycopy(bArr, i18, bArr2, 0, i19);
                int i20 = i10 + 1;
                C2571a c2571a = null;
                if (i20 < 12) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        m5011Q(jSONObject2, bArr2, bArr2.length, i20);
                        if (Arrays.equals(m5043q(jSONObject2), bArr2)) {
                            c2571a = new C2571a(jSONObject2, 27);
                        }
                    } catch (Throwable unused) {
                    }
                }
                if (c2571a != null) {
                    JSONObject jSONObject3 = (JSONObject) c2571a.f8339h;
                    int length = jSONObject3.length();
                    Object string = jSONObject3;
                    if (length <= 0) {
                        try {
                            Charset charset = StandardCharsets.UTF_8;
                            String str = new String(bArr2, charset);
                            zEquals = Arrays.equals(str.getBytes(charset), bArr2);
                            string = str;
                        } catch (Throwable unused2) {
                        }
                        if (!zEquals) {
                            StringBuilder sb2 = new StringBuilder("hex->");
                            StringBuilder sb3 = new StringBuilder();
                            for (byte b10 : bArr2) {
                                sb3.append(String.format("%02X", Integer.valueOf(b10 & 255)));
                            }
                            sb2.append(sb3.toString());
                            string = sb2.toString();
                        }
                    }
                    i11 = i12;
                    objValueOf = string;
                }
            } else {
                if (i16 != 5 || (i11 = i14 + 4) > i9) {
                    return;
                }
                int i21 = 0;
                for (int i22 = 0; i22 < 4; i22++) {
                    i21 |= (bArr[i14 + i22] & 255) << (i22 * 8);
                }
                objValueOf = Integer.valueOf(i21);
            }
            String strValueOf = String.valueOf(i15);
            if (jSONObject.has(strValueOf)) {
                Object obj = jSONObject.get(strValueOf);
                if (obj instanceof JSONArray) {
                    jSONArray = (JSONArray) obj;
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    jSONArray2.put(obj);
                    jSONObject.put(strValueOf, jSONArray2);
                    jSONArray = jSONArray2;
                }
                jSONArray.put(objValueOf);
            } else {
                jSONObject.put(strValueOf, objValueOf);
            }
            i13 = i11;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static final long m5012R(long j3, long j4) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 >> 32)) + ((int) (j4 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j3 & 4294967295L)) + ((int) (j4 & 4294967295L)))) & 4294967295L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v17, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:255:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0173 A[PHI: r6 r20 r21 r22 r23 r24 r25 r26 r27 r28 r29
  0x0173: PHI (r6v14 z0.d) = (r6v13 z0.d), (r6v15 z0.d) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r20v6 boolean) = (r20v5 boolean), (r20v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r21v8 h2.a) = (r21v7 h2.a), (r21v9 h2.a) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r22v5 i2.g) = (r22v4 i2.g), (r22v6 i2.g) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r23v5 z0.f) = (r23v4 z0.f), (r23v6 z0.f) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r24v6 z0.m) = (r24v5 z0.m), (r24v7 z0.m) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r25v6 java.lang.Boolean) = (r25v5 java.lang.Boolean), (r25v7 java.lang.Boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r26v8 f2.i) = (r26v7 f2.i), (r26v9 f2.i) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r27v6 boolean) = (r27v5 boolean), (r27v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r28v6 boolean) = (r28v5 boolean), (r28v7 boolean) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]
  0x0173: PHI (r29v6 java.lang.Integer) = (r29v5 java.lang.Integer), (r29v7 java.lang.Integer) binds: [B:10:0x004d, B:66:0x0171] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5013S(ViewStructure viewStructure, C5602f0 c5602f0, AutofillId autofillId, String str, C1293b c1293b) {
        int i9;
        long j3;
        long j4;
        char c10;
        long j5;
        boolean zBooleanValue;
        EnumC1571a enumC1571a;
        C1926g c1926g;
        C6066f c6066f;
        C1046i c1046i;
        C6064d c6064d;
        boolean z9;
        InterfaceC6073m interfaceC6073m;
        Boolean bool;
        boolean z10;
        Integer num;
        int i10;
        List list;
        Integer numValueOf;
        String[] strArrM3604t;
        boolean z11;
        String strM10606v;
        String[] strArrM3604t2;
        String[] strArrM3604t3;
        C0943k0 c0943k0;
        long[] jArr;
        Object[] objArr;
        int i11;
        long[] jArr2;
        Object[] objArr2;
        C0943k0 c0943k02;
        EnumC1571a enumC1571a2;
        C1926g c1926g2;
        C6066f c6066f2;
        C1046i c1046i2;
        C1061x c1061x = AbstractC1058u.f3376a;
        C1061x c1061x2 = AbstractC1049l.f3315a;
        C1050m c1050mM10051w = c5602f0.m10051w();
        int i12 = 8;
        if (c1050mM10051w == null || (c0943k02 = c1050mM10051w.f3341g) == null) {
            i9 = 2;
            j3 = 128;
            j4 = 255;
            c10 = 7;
            j5 = -9187201950435737472L;
            zBooleanValue = true;
            enumC1571a = null;
            c1926g = null;
            c6066f = null;
            c1046i = null;
            c6064d = null;
            z9 = false;
            interfaceC6073m = null;
            bool = null;
            z10 = false;
            num = null;
        } else {
            Object[] objArr3 = c0943k02.f2969b;
            j3 = 128;
            Object[] objArr4 = c0943k02.f2970c;
            long[] jArr3 = c0943k02.f2968a;
            int length = jArr3.length - 2;
            i9 = 2;
            if (length >= 0) {
                zBooleanValue = true;
                int i13 = 0;
                c6064d = null;
                j4 = 255;
                z9 = false;
                enumC1571a2 = null;
                c1926g2 = null;
                c6066f2 = null;
                interfaceC6073m = null;
                bool = null;
                c1046i2 = null;
                z10 = false;
                num = null;
                c10 = 7;
                while (true) {
                    long j10 = jArr3[i13];
                    j5 = -9187201950435737472L;
                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        for (int i15 = 0; i15 < i14; i15++) {
                            if ((j10 & 255) < 128) {
                                int i16 = (i13 << 3) + i15;
                                Object obj = objArr3[i16];
                                Object obj2 = objArr4[i16];
                                C1061x c1061x3 = (C1061x) obj;
                                if (AbstractC1416l.m3825a(c1061x3, AbstractC1058u.f3393r)) {
                                    obj2.getClass();
                                    c6064d = (C6064d) obj2;
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1058u.f3376a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) AbstractC4166m.m8424v1((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1058u.f3392q)) {
                                    obj2.getClass();
                                    interfaceC6073m = (InterfaceC6073m) obj2;
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1058u.f3394s)) {
                                    obj2.getClass();
                                    c6066f2 = (C6066f) obj2;
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1058u.f3365F)) {
                                    obj2.getClass();
                                    c1926g2 = (C1926g) obj2;
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1058u.f3387l)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1058u.f3374O)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1058u.f3370K)) {
                                    z10 = true;
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1058u.f3389n)) {
                                    obj2.getClass();
                                    zBooleanValue = ((Boolean) obj2).booleanValue();
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1058u.f3400y)) {
                                    obj2.getClass();
                                    c1046i2 = (C1046i) obj2;
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1058u.f3368I)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1058u.f3369J)) {
                                    obj2.getClass();
                                    enumC1571a2 = (EnumC1571a) obj2;
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1049l.f3316b)) {
                                    viewStructure.setClickable(true);
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1049l.f3317c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1049l.f3337w)) {
                                    viewStructure.setFocusable(true);
                                } else if (AbstractC1416l.m3825a(c1061x3, AbstractC1049l.f3325k)) {
                                    z9 = true;
                                }
                            }
                            j10 >>= 8;
                        }
                        if (i14 != 8) {
                            break;
                        } else if (i13 == length) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                }
            } else {
                j4 = 255;
                c10 = 7;
                j5 = -9187201950435737472L;
                zBooleanValue = true;
                c6064d = null;
                z9 = false;
                enumC1571a2 = null;
                c1926g2 = null;
                c6066f2 = null;
                interfaceC6073m = null;
                bool = null;
                c1046i2 = null;
                z10 = false;
                num = null;
            }
            enumC1571a = enumC1571a2;
            c1926g = c1926g2;
            c6066f = c6066f2;
            c1046i = c1046i2;
        }
        C1050m c1050mM10051w2 = c5602f0.m10051w();
        if (c1050mM10051w2 != null && c1050mM10051w2.f3343i && !c1050mM10051w2.f3344j) {
            c1050mM10051w2 = c1050mM10051w2.m2645c();
            C0933f0 c0933f0 = new C0933f0(((C2046b) ((C0929d0) c5602f0.m10042n()).f2909h).f6893i);
            c0933f0.m2288c(c5602f0.m10042n());
            while (c0933f0.m2294i()) {
                C5602f0 c5602f02 = (C5602f0) c0933f0.m2296k(c0933f0.f2924b - 1);
                C1050m c1050mM10051w3 = c5602f02.m10051w();
                if (c1050mM10051w3 != null && !c1050mM10051w3.f3343i) {
                    c1050mM10051w2.m2647e(c1050mM10051w3);
                    if (!c1050mM10051w3.f3344j) {
                        c0933f0.m2288c(c5602f02.m10042n());
                    }
                }
            }
        }
        if (c1050mM10051w2 == null || (c0943k0 = c1050mM10051w2.f3341g) == null) {
            i10 = 1;
        } else {
            Object[] objArr5 = c0943k0.f2969b;
            Object[] objArr6 = c0943k0.f2970c;
            long[] jArr4 = c0943k0.f2968a;
            int length2 = jArr4.length - 2;
            i10 = 1;
            if (length2 >= 0) {
                int i17 = 0;
                list = null;
                while (true) {
                    long j11 = jArr4[i17];
                    int i18 = i12;
                    int i19 = i17;
                    if ((((~j11) << c10) & j11 & j5) != j5) {
                        int i20 = 8 - ((~(i19 - length2)) >>> 31);
                        int i21 = 0;
                        while (i21 < i20) {
                            if ((j11 & j4) < j3) {
                                int i22 = (i19 << 3) + i21;
                                Object obj3 = objArr5[i22];
                                Object obj4 = objArr6[i22];
                                jArr2 = jArr4;
                                C1061x c1061x4 = (C1061x) obj3;
                                objArr2 = objArr5;
                                if (AbstractC1416l.m3825a(c1061x4, AbstractC1058u.f3385j)) {
                                    viewStructure.setEnabled(false);
                                } else if (AbstractC1416l.m3825a(c1061x4, AbstractC1058u.f3361B)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                jArr2 = jArr4;
                                objArr2 = objArr5;
                            }
                            j11 >>= i18;
                            i21++;
                            objArr5 = objArr2;
                            jArr4 = jArr2;
                        }
                        jArr = jArr4;
                        objArr = objArr5;
                        i11 = i18;
                        if (i20 != i11) {
                            break;
                        }
                    } else {
                        jArr = jArr4;
                        objArr = objArr5;
                        i11 = i18;
                    }
                    if (i19 == length2) {
                        break;
                    }
                    i17 = i19 + 1;
                    i12 = i11;
                    objArr5 = objArr;
                    jArr4 = jArr;
                }
            }
            Integer numValueOf2 = Integer.valueOf(c5602f0.f22791h);
            if (c5602f0.m10049u() == null) {
                numValueOf2 = null;
            }
            int iIntValue = numValueOf2 == null ? numValueOf2.intValue() : -1;
            viewStructure.setAutofillId(autofillId, iIntValue);
            viewStructure.setId(iIntValue, str, null, null);
            numValueOf = c6064d == null ? Integer.valueOf(c6064d.f24545a) : z9 ? Integer.valueOf(i10) : enumC1571a != null ? Integer.valueOf(i9) : null;
            if (numValueOf != null) {
                viewStructure.setAutofillType(numValueOf.intValue());
            }
            if (c1926g != null) {
                String strM6701P0 = c1926g.f6529h;
                if (strM6701P0.length() >= 5000) {
                    strM6701P0 = (Character.isHighSurrogate(strM6701P0.charAt(4999)) && Character.isLowSurrogate(strM6701P0.charAt(5000))) ? AbstractC3149m.m6701P0(4999, strM6701P0) : AbstractC3149m.m6701P0(5000, strM6701P0);
                }
                viewStructure.setAutofillValue(AutofillValue.forText(strM6701P0));
            }
            if (c6066f != null) {
                viewStructure.setAutofillValue(c6066f.f24547a);
            }
            if (interfaceC6073m != null && (strArrM3604t3 = AbstractC1341a.m3604t(interfaceC6073m)) != null) {
                viewStructure.setAutofillHints(strArrM3604t3);
            }
            c1293b.f4315b.m350P(c5602f0.f22791h, new C6074n(viewStructure));
            if (bool != null) {
                viewStructure.setSelected(bool.booleanValue());
            }
            if (enumC1571a == null) {
                viewStructure.setCheckable(i10);
                viewStructure.setChecked(enumC1571a == EnumC1571a.f5230g);
            } else if (bool != null && (c1046i == null || c1046i.f3287a != 4)) {
                viewStructure.setCheckable(true);
                viewStructure.setChecked(bool.booleanValue());
            }
            InterfaceC6073m.f24556a.getClass();
            strArrM3604t = AbstractC1341a.m3604t(C6072l.f24553b);
            strArrM3604t.getClass();
            if (strArrM3604t.length != 0) {
                C2104o.m5287l("Array is empty.");
                return;
            }
            String str2 = strArrM3604t[0];
            if (interfaceC6073m != null && (strArrM3604t2 = AbstractC1341a.m3604t(interfaceC6073m)) != null) {
                boolean zM8378m0 = AbstractC4165l.m8378m0(strArrM3604t2, str2);
                z11 = true;
                boolean z12 = zM8378m0;
                boolean z13 = (!z10 || z12) ? z11 : false;
                viewStructure.setDataIsSensitive((!z13 || zBooleanValue) ? z11 : false);
                viewStructure.setVisibility(c5602f0.f22778L.f22717d.m10114z1() ? 4 : 0);
                if (list != null) {
                    int size = list.size();
                    String strM2254q = HttpUrl.FRAGMENT_ENCODE_SET;
                    for (int i23 = 0; i23 < size; i23++) {
                        C1926g c1926g3 = (C1926g) list.get(i23);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(strM2254q);
                        strM2254q = AbstractC0921a.m2254q(sb2, c1926g3.f6529h, '\n');
                    }
                    viewStructure.setText(strM2254q);
                    viewStructure.setClassName("android.widget.TextView");
                }
                if (((C0929d0) c5602f0.m10042n()).isEmpty() && c1046i != null && (strM10606v = AbstractC5883g0.m10606v(c1046i.f3287a)) != null) {
                    viewStructure.setClassName(strM10606v);
                }
                if (z9) {
                    return;
                }
                viewStructure.setClassName("android.widget.EditText");
                if (Build.VERSION.SDK_INT >= 28 && num != null) {
                    viewStructure.setMaxTextLength(num.intValue());
                }
                if (z13) {
                    viewStructure.setInputType(129);
                    return;
                }
                return;
            }
            z11 = true;
            if (z10) {
            }
            viewStructure.setDataIsSensitive((!z13 || zBooleanValue) ? z11 : false);
            viewStructure.setVisibility(c5602f0.f22778L.f22717d.m10114z1() ? 4 : 0);
            if (list != null) {
            }
            if (((C0929d0) c5602f0.m10042n()).isEmpty()) {
                viewStructure.setClassName(strM10606v);
            }
            if (z9) {
            }
        }
        list = null;
        Integer numValueOf22 = Integer.valueOf(c5602f0.f22791h);
        if (c5602f0.m10049u() == null) {
        }
        if (numValueOf22 == null) {
        }
        viewStructure.setAutofillId(autofillId, iIntValue);
        viewStructure.setId(iIntValue, str, null, null);
        if (c6064d == null) {
        }
        if (numValueOf != null) {
        }
        if (c1926g != null) {
        }
        if (c6066f != null) {
        }
        if (interfaceC6073m != null) {
            viewStructure.setAutofillHints(strArrM3604t3);
        }
        c1293b.f4315b.m350P(c5602f0.f22791h, new C6074n(viewStructure));
        if (bool != null) {
        }
        if (enumC1571a == null) {
        }
        InterfaceC6073m.f24556a.getClass();
        strArrM3604t = AbstractC1341a.m3604t(C6072l.f24553b);
        strArrM3604t.getClass();
        if (strArrM3604t.length != 0) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x098f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0113  */
    /* JADX INFO: renamed from: T */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1190x0 m5014T(C1183v c1183v, JSONObject jSONObject, boolean z9, boolean z10) throws JSONException {
        JSONObject jSONObject2;
        Object c3959f;
        JSONObject jSONObject3;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject4;
        Object obj;
        String str;
        String str2;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONArray jSONArray3;
        String str3;
        int i9;
        HashMap map;
        int i10;
        HashMap map2;
        String str4;
        String str5;
        String str6;
        String str7;
        JSONArray jSONArray4;
        HashMap map3;
        JSONArray jSONArrayPut;
        int i11;
        String str8;
        String str9;
        String str10;
        int i12;
        String str11;
        HashMap map4;
        HashMap map5;
        String str12;
        JSONArray jSONArray5;
        int i13;
        int i14;
        String str13;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectPut;
        JSONObject jSONObjectOptJSONObject4;
        Object c3959f2;
        boolean z11;
        Object obj2;
        String str14;
        String str15;
        String str16;
        JSONObject jSONObjectOptJSONObject5;
        int i15;
        String str17;
        JSONArray jSONArrayOptJSONArray;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        String str23;
        String str24;
        String str25;
        String str26;
        JSONArray jSONArray6;
        JSONArray jSONArray7;
        String str27;
        String str28;
        String str29;
        String str30;
        String str31;
        JSONArray jSONArray8;
        JSONArray jSONArray9;
        String str32;
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        JSONArray jSONArrayPut2;
        String str38;
        int i16;
        String str39;
        String str40;
        int i17;
        String str41;
        Object c3959f3;
        JSONArray jSONArrayOptJSONArray2;
        JSONArray jSONArrayOptJSONArray3;
        JSONObject jSONObject5 = jSONObject;
        boolean z12 = z9;
        String str42 = c1183v.f3986k;
        String str43 = "type";
        String str44 = "content";
        if (AbstractC1416l.m3825a(str42, "deepseek") && (jSONArrayOptJSONArray2 = jSONObject5.optJSONArray("messages")) != null) {
            int length = jSONArrayOptJSONArray2.length();
            for (int i18 = 0; i18 < length; i18++) {
                JSONObject jSONObjectOptJSONObject6 = jSONArrayOptJSONArray2.optJSONObject(i18);
                if (jSONObjectOptJSONObject6 != null && (jSONArrayOptJSONArray3 = jSONObjectOptJSONObject6.optJSONArray("content")) != null) {
                    int length2 = jSONArrayOptJSONArray3.length();
                    for (int i19 = 0; i19 < length2; i19++) {
                        JSONObject jSONObjectOptJSONObject7 = jSONArrayOptJSONArray3.optJSONObject(i19);
                        if (AbstractC1416l.m3825a(jSONObjectOptJSONObject7 != null ? jSONObjectOptJSONObject7.optString("type") : null, "image_url")) {
                            C2104o.m5294t("DeepSeek 原生 Chat Completions 不支持图片输入");
                            return null;
                        }
                    }
                }
            }
        }
        String str45 = "hchat_cache_control";
        String str46 = "data";
        String str47 = "url";
        String str48 = "image_url";
        String str49 = "{}";
        String str50 = "stream";
        Object obj3 = "developer";
        String str51 = "role";
        String str52 = "arguments";
        String str53 = "assistant";
        String str54 = "model";
        String str55 = "tool_call_id";
        String str56 = "temperature";
        String str57 = "tool";
        String str58 = "system";
        Object obj4 = "object";
        String str59 = "parameters";
        String str60 = "name";
        String str61 = "description";
        String str62 = "id";
        if (AbstractC1416l.m3825a(str42, "anthropic")) {
            JSONArray jSONArrayOptJSONArray4 = jSONObject5.optJSONArray("messages");
            if (jSONArrayOptJSONArray4 == null) {
                jSONArrayOptJSONArray4 = new JSONArray();
            }
            JSONArray jSONArray10 = jSONArrayOptJSONArray4;
            String str63 = "tool_calls";
            JSONArray jSONArray11 = new JSONArray();
            String str64 = "function";
            JSONArray jSONArray12 = new JSONArray();
            String str65 = "tools";
            if (z10) {
                String str66 = c1183v.f3985j;
                boolean z13 = (AbstractC1416l.m3825a(str42, "anthropic") && !AbstractC1416l.m3825a(str66, "off")) ? AbstractC1416l.m3825a(str66, "force") ? true : AbstractC3156t.m6734X(Uri.parse(C1186w.m3232p(c1183v.f3976a, str42, c1183v.f3977b)).getHost(), "api.anthropic.com") : false;
                int length3 = jSONArray10.length();
                int i20 = 0;
                while (true) {
                    z11 = z13;
                    if (i20 >= length3) {
                        break;
                    }
                    String str67 = str44;
                    String str68 = str43;
                    String str69 = str65;
                    String str70 = str61;
                    Object obj5 = obj4;
                    int i21 = length3;
                    JSONArray jSONArray13 = jSONArray10;
                    String str71 = str60;
                    String str72 = str50;
                    String str73 = str59;
                    String str74 = str54;
                    String str75 = str64;
                    JSONObject jSONObjectOptJSONObject8 = jSONArray13.optJSONObject(i20);
                    int i22 = i20;
                    if (jSONObjectOptJSONObject8 != null) {
                        String str76 = str51;
                        jSONArray6 = jSONArray13;
                        String strOptString = jSONObjectOptJSONObject8.optString(str76);
                        if (AbstractC1416l.m3825a(strOptString, str58)) {
                            str18 = str58;
                        } else {
                            str18 = str58;
                            Object obj6 = obj3;
                            if (AbstractC1416l.m3825a(strOptString, obj6)) {
                                obj3 = obj6;
                            } else {
                                obj3 = obj6;
                                String str77 = str57;
                                if (AbstractC1416l.m3825a(strOptString, str77)) {
                                    JSONArray jSONArray14 = new JSONArray();
                                    str57 = str77;
                                    JSONObject jSONObjectM9267k = AbstractC4855en.m9267k(str68, "tool_result");
                                    str22 = str76;
                                    String str78 = str55;
                                    str26 = str69;
                                    jSONObjectM9267k.put("tool_use_id", jSONObjectOptJSONObject8.optString(str78));
                                    str28 = str67;
                                    jSONObjectM9267k.put(str28, m5034h(jSONObjectOptJSONObject8.opt(str28)));
                                    try {
                                        str24 = str78;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        str24 = str78;
                                    }
                                    try {
                                        JSONObject jSONObject6 = new JSONObject(m5034h(jSONObjectOptJSONObject8.opt(str28)));
                                        str29 = str56;
                                        try {
                                            c3959f3 = Boolean.valueOf(jSONObject6.optBoolean("isError", false) || jSONObject6.optBoolean("error", false));
                                        } catch (Throwable th3) {
                                            th = th3;
                                            c3959f3 = new C3959f(th);
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        str29 = str56;
                                        c3959f3 = new C3959f(th);
                                        Object obj7 = Boolean.FALSE;
                                        if (c3959f3 instanceof C3959f) {
                                        }
                                        jSONObjectM9267k.put("is_error", ((Boolean) c3959f3).booleanValue());
                                        jSONArrayPut2 = jSONArray14.put(jSONObjectM9267k);
                                        str38 = str53;
                                        if (AbstractC1416l.m3825a(strOptString, str38)) {
                                        }
                                        str19 = str75;
                                        String str79 = str52;
                                        str25 = str62;
                                        if (!AbstractC1416l.m3825a(strOptString, str38)) {
                                        }
                                        jSONArrayPut2.getClass();
                                        m5029e(jSONArray11, str, jSONArrayPut2);
                                        str27 = str38;
                                        str23 = str79;
                                        str20 = str63;
                                        str21 = str45;
                                        str30 = str47;
                                        str31 = str49;
                                        jSONArray7 = jSONArray11;
                                        i20 = i22 + 1;
                                        str44 = str28;
                                        str43 = str68;
                                        str60 = str71;
                                        str50 = str72;
                                        z12 = z9;
                                        z13 = z11;
                                        str53 = str27;
                                        str45 = str21;
                                        str62 = str25;
                                        jSONArray11 = jSONArray7;
                                        str49 = str31;
                                        length3 = i21;
                                        str54 = str74;
                                        obj4 = obj5;
                                        str59 = str73;
                                        str61 = str70;
                                        str58 = str18;
                                        str64 = str19;
                                        str52 = str23;
                                        str63 = str20;
                                        str47 = str30;
                                        str65 = str26;
                                        str56 = str29;
                                        str55 = str24;
                                        jSONArray10 = jSONArray6;
                                        str51 = str22;
                                    }
                                    Object obj72 = Boolean.FALSE;
                                    if (c3959f3 instanceof C3959f) {
                                        c3959f3 = obj72;
                                    }
                                    jSONObjectM9267k.put("is_error", ((Boolean) c3959f3).booleanValue());
                                    jSONArrayPut2 = jSONArray14.put(jSONObjectM9267k);
                                } else {
                                    str22 = str76;
                                    str57 = str77;
                                    str24 = str55;
                                    str26 = str69;
                                    str28 = str67;
                                    str29 = str56;
                                    Object objOpt = jSONObjectOptJSONObject8.opt(str28);
                                    if (objOpt instanceof JSONArray) {
                                        jSONArray8 = new JSONArray();
                                        JSONArray jSONArray15 = (JSONArray) objOpt;
                                        int length4 = jSONArray15.length();
                                        int i23 = 0;
                                        while (i23 < length4) {
                                            String str80 = str52;
                                            String str81 = strOptString;
                                            String str82 = str49;
                                            int i24 = length4;
                                            String str83 = str63;
                                            JSONArray jSONArray16 = jSONArray11;
                                            String str84 = str75;
                                            String str85 = str62;
                                            JSONObject jSONObjectOptJSONObject9 = jSONArray15.optJSONObject(i23);
                                            int i25 = i23;
                                            if (jSONObjectOptJSONObject9 != null) {
                                                String strOptString2 = jSONObjectOptJSONObject9.optString(str68);
                                                if (AbstractC1416l.m3825a(strOptString2, WeChatSnsPost.TYPE_TEXT)) {
                                                    String strOptString3 = jSONObjectOptJSONObject9.optString(WeChatSnsPost.TYPE_TEXT);
                                                    strOptString3.getClass();
                                                    if (AbstractC3149m.m6721t0(strOptString3)) {
                                                        strOptString3 = null;
                                                    }
                                                    if (strOptString3 != null) {
                                                        jSONArray8.put(new JSONObject().put(str68, WeChatSnsPost.TYPE_TEXT).put(WeChatSnsPost.TYPE_TEXT, strOptString3));
                                                    }
                                                    jSONArray9 = jSONArray15;
                                                    str32 = str80;
                                                    str33 = str83;
                                                    str34 = str46;
                                                    str35 = str47;
                                                    str36 = str82;
                                                } else {
                                                    jSONArray9 = jSONArray15;
                                                    String str86 = str48;
                                                    if (AbstractC1416l.m3825a(strOptString2, str86)) {
                                                        JSONObject jSONObjectOptJSONObject10 = jSONObjectOptJSONObject9.optJSONObject(str86);
                                                        str35 = str47;
                                                        String strOptString4 = jSONObjectOptJSONObject10 != null ? jSONObjectOptJSONObject10.optString(str35) : null;
                                                        if (strOptString4 == null) {
                                                            strOptString4 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                        }
                                                        C1187w0 c1187w0M5002H = m5002H(strOptString4);
                                                        str48 = str86;
                                                        if (c1187w0M5002H != null) {
                                                            String str87 = c1187w0M5002H.f3994c;
                                                            str36 = str82;
                                                            boolean z14 = c1187w0M5002H.f3992a;
                                                            JSONObject jSONObjectM9267k2 = AbstractC4855en.m9267k(str68, WeChatSnsPost.TYPE_IMAGE);
                                                            str32 = str80;
                                                            JSONObject jSONObject7 = new JSONObject();
                                                            if (z14) {
                                                                str33 = str83;
                                                                str37 = "base64";
                                                            } else {
                                                                str33 = str83;
                                                                str37 = str35;
                                                            }
                                                            jSONObject7.put(str68, str37);
                                                            if (z14) {
                                                                jSONObject7.put("media_type", c1187w0M5002H.f3993b);
                                                                str34 = str46;
                                                                jSONObject7.put(str34, str87);
                                                            } else {
                                                                str34 = str46;
                                                                jSONObject7.put(str35, str87);
                                                            }
                                                            jSONObjectM9267k2.put("source", jSONObject7);
                                                            jSONArray8.put(jSONObjectM9267k2);
                                                        } else {
                                                            str36 = str82;
                                                            str32 = str80;
                                                            str33 = str83;
                                                            str34 = str46;
                                                        }
                                                    } else {
                                                        str48 = str86;
                                                        str32 = str80;
                                                        str33 = str83;
                                                        str34 = str46;
                                                        str35 = str47;
                                                        str36 = str82;
                                                    }
                                                }
                                            } else {
                                                jSONArray9 = jSONArray15;
                                                str32 = str80;
                                                str33 = str83;
                                                str34 = str46;
                                                str35 = str47;
                                                str36 = str82;
                                            }
                                            i23 = i25 + 1;
                                            str46 = str34;
                                            str62 = str85;
                                            jSONArray11 = jSONArray16;
                                            length4 = i24;
                                            strOptString = str81;
                                            jSONArray15 = jSONArray9;
                                            str75 = str84;
                                            str52 = str32;
                                            str63 = str33;
                                            str49 = str36;
                                            str47 = str35;
                                        }
                                    } else {
                                        String strM5034h = m5034h(objOpt);
                                        jSONArray8 = new JSONArray();
                                        if (!AbstractC3149m.m6721t0(strM5034h)) {
                                            jSONArray8.put(new JSONObject().put(str68, WeChatSnsPost.TYPE_TEXT).put(WeChatSnsPost.TYPE_TEXT, strM5034h));
                                        }
                                    }
                                    jSONArrayPut2 = jSONArray8;
                                }
                                str38 = str53;
                                if (AbstractC1416l.m3825a(strOptString, str38)) {
                                    String str88 = str63;
                                    JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject8.optJSONArray(str88);
                                    if (jSONArrayOptJSONArray5 != null) {
                                        int length5 = jSONArrayOptJSONArray5.length();
                                        int i26 = 0;
                                        while (i26 < length5) {
                                            String str89 = str88;
                                            JSONObject jSONObjectOptJSONObject11 = jSONArrayOptJSONArray5.optJSONObject(i26);
                                            JSONArray jSONArray17 = jSONArrayOptJSONArray5;
                                            if (jSONObjectOptJSONObject11 != null) {
                                                JSONObject jSONObjectOptJSONObject12 = jSONObjectOptJSONObject11.optJSONObject(str75);
                                                i16 = length5;
                                                if (jSONObjectOptJSONObject12 != null) {
                                                    str39 = str75;
                                                    str40 = str62;
                                                    String strOptString5 = jSONObjectOptJSONObject11.optString(str40, "toolu_" + i26);
                                                    String strOptString6 = jSONObjectOptJSONObject12.optString(str71);
                                                    i17 = i26;
                                                    JSONObject jSONObjectM9268l = AbstractC4855en.m9268l(str68, "tool_use", str40, strOptString5);
                                                    jSONObjectM9268l.put(str71, strOptString6);
                                                    str41 = str52;
                                                    String strOptString7 = jSONObjectOptJSONObject12.optString(str41, str49);
                                                    strOptString7.getClass();
                                                    jSONObjectM9268l.put("input", m5005K(strOptString7));
                                                    jSONArrayPut2.put(jSONObjectM9268l);
                                                }
                                                int i27 = i17 + 1;
                                                str52 = str41;
                                                str62 = str40;
                                                jSONArrayOptJSONArray5 = jSONArray17;
                                                length5 = i16;
                                                str75 = str39;
                                                i26 = i27;
                                                str88 = str89;
                                            } else {
                                                i16 = length5;
                                            }
                                            str39 = str75;
                                            str40 = str62;
                                            i17 = i26;
                                            str41 = str52;
                                            int i272 = i17 + 1;
                                            str52 = str41;
                                            str62 = str40;
                                            jSONArrayOptJSONArray5 = jSONArray17;
                                            length5 = i16;
                                            str75 = str39;
                                            i26 = i272;
                                            str88 = str89;
                                        }
                                    }
                                    str63 = str88;
                                }
                                str19 = str75;
                                String str792 = str52;
                                str25 = str62;
                                String str90 = !AbstractC1416l.m3825a(strOptString, str38) ? str38 : "user";
                                jSONArrayPut2.getClass();
                                m5029e(jSONArray11, str90, jSONArrayPut2);
                                str27 = str38;
                                str23 = str792;
                                str20 = str63;
                                str21 = str45;
                                str30 = str47;
                                str31 = str49;
                                jSONArray7 = jSONArray11;
                            }
                        }
                        str22 = str76;
                        str19 = str75;
                        str20 = str63;
                        String str91 = str46;
                        str23 = str52;
                        str27 = str53;
                        str24 = str55;
                        str25 = str62;
                        str26 = str69;
                        jSONArray7 = jSONArray11;
                        str28 = str67;
                        str29 = str56;
                        str30 = str47;
                        str31 = str49;
                        String strM5034h2 = m5034h(jSONObjectOptJSONObject8.opt(str28));
                        if (AbstractC3149m.m6721t0(strM5034h2)) {
                            str46 = str91;
                            str21 = str45;
                        } else {
                            JSONObject jSONObjectM9268l2 = AbstractC4855en.m9268l(str68, WeChatSnsPost.TYPE_TEXT, WeChatSnsPost.TYPE_TEXT, strM5034h2);
                            str46 = str91;
                            str21 = str45;
                            if (jSONObjectOptJSONObject8.optBoolean(str21, false) && z11) {
                                jSONObjectM9268l2.put("cache_control", new JSONObject().put(str68, "ephemeral"));
                            }
                            jSONArray12.put(jSONObjectM9268l2);
                        }
                    } else {
                        str18 = str58;
                        str19 = str75;
                        str20 = str63;
                        str21 = str45;
                        str22 = str51;
                        str23 = str52;
                        str24 = str55;
                        str25 = str62;
                        str26 = str69;
                        jSONArray6 = jSONArray13;
                        jSONArray7 = jSONArray11;
                        str27 = str53;
                        str28 = str67;
                        str29 = str56;
                        str30 = str47;
                        str31 = str49;
                    }
                    i20 = i22 + 1;
                    str44 = str28;
                    str43 = str68;
                    str60 = str71;
                    str50 = str72;
                    z12 = z9;
                    z13 = z11;
                    str53 = str27;
                    str45 = str21;
                    str62 = str25;
                    jSONArray11 = jSONArray7;
                    str49 = str31;
                    length3 = i21;
                    str54 = str74;
                    obj4 = obj5;
                    str59 = str73;
                    str61 = str70;
                    str58 = str18;
                    str64 = str19;
                    str52 = str23;
                    str63 = str20;
                    str47 = str30;
                    str65 = str26;
                    str56 = str29;
                    str55 = str24;
                    jSONArray10 = jSONArray6;
                    str51 = str22;
                }
                if (z11) {
                    int length6 = jSONArray11.length() - 1;
                    loop5: while (true) {
                        if (-1 >= length6) {
                            break;
                        }
                        JSONObject jSONObjectOptJSONObject13 = jSONArray11.optJSONObject(length6);
                        if (jSONObjectOptJSONObject13 == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject13.optJSONArray(str44)) == null) {
                            i15 = length6;
                            str17 = str44;
                        } else {
                            i15 = length6;
                            str17 = str44;
                            for (int length7 = jSONArrayOptJSONArray.length() - 1; -1 < length7; length7--) {
                                JSONObject jSONObjectOptJSONObject14 = jSONArrayOptJSONArray.optJSONObject(length7);
                                if (jSONObjectOptJSONObject14 != null) {
                                    jSONObjectOptJSONObject14.put("cache_control", new JSONObject().put(str43, "ephemeral"));
                                    break loop5;
                                }
                            }
                        }
                        length6 = i15 - 1;
                        str44 = str17;
                    }
                }
                JSONObject jSONObject8 = new JSONObject();
                jSONObject8.put(str54, jSONObject5.optString(str54));
                jSONObject8.put("max_tokens", 16384);
                String str92 = str43;
                jSONObject8.put(str56, jSONObject5.optDouble(str56, 0.2d));
                jSONObject8.put(str50, z12);
                int length8 = jSONArray12.length();
                Object string = jSONArray12;
                if (length8 > 0) {
                    if (!z11) {
                        StringBuilder sb2 = new StringBuilder();
                        int length9 = jSONArray12.length();
                        for (int i28 = 0; i28 < length9; i28++) {
                            if (sb2.length() > 0) {
                                sb2.append("\n\n");
                            }
                            JSONObject jSONObjectOptJSONObject15 = jSONArray12.optJSONObject(i28);
                            String strOptString8 = jSONObjectOptJSONObject15 != null ? jSONObjectOptJSONObject15.optString(WeChatSnsPost.TYPE_TEXT) : null;
                            if (strOptString8 == null) {
                                strOptString8 = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            sb2.append(strOptString8);
                        }
                        string = sb2.toString();
                    }
                    jSONObject8.put(str58, string);
                }
                jSONObject8.put("messages", jSONArray11);
                String str93 = str65;
                JSONArray jSONArrayOptJSONArray6 = jSONObject5.optJSONArray(str93);
                jSONObject2 = jSONObject8;
                if (jSONArrayOptJSONArray6 != null) {
                    JSONArray jSONArray18 = new JSONArray();
                    int length10 = jSONArrayOptJSONArray6.length();
                    int i29 = 0;
                    while (i29 < length10) {
                        String str94 = str92;
                        JSONObject jSONObjectOptJSONObject16 = jSONArrayOptJSONArray6.optJSONObject(i29);
                        String str95 = str64;
                        if (jSONObjectOptJSONObject16 == null || (jSONObjectOptJSONObject5 = jSONObjectOptJSONObject16.optJSONObject(str95)) == null) {
                            obj2 = obj4;
                            str14 = str59;
                            str15 = str60;
                            str16 = str61;
                        } else {
                            JSONObject jSONObject9 = new JSONObject();
                            str15 = str60;
                            jSONObject9.put(str15, jSONObjectOptJSONObject5.optString(str15));
                            str16 = str61;
                            jSONObject9.put(str16, jSONObjectOptJSONObject5.optString(str16));
                            str14 = str59;
                            JSONObject jSONObjectOptJSONObject17 = jSONObjectOptJSONObject5.optJSONObject(str14);
                            if (jSONObjectOptJSONObject17 != null) {
                                obj2 = obj4;
                            } else {
                                obj2 = obj4;
                                jSONObjectOptJSONObject17 = new JSONObject().put(str94, obj2);
                            }
                            jSONObject9.put("input_schema", jSONObjectOptJSONObject17);
                            jSONArray18.put(jSONObject9);
                        }
                        i29++;
                        str92 = str94;
                        str64 = str95;
                        str60 = str15;
                        str61 = str16;
                        str59 = str14;
                        obj4 = obj2;
                    }
                    jSONObject8.put(str93, jSONArray18);
                    jSONObject8.put("tool_choice", new JSONObject().put(str92, "auto").put("disable_parallel_tool_use", false));
                    jSONObject2 = jSONObject8;
                }
            }
        } else {
            String str96 = "type";
            String str97 = "function";
            String str98 = "tool_calls";
            String str99 = str51;
            String str100 = str52;
            String str101 = str55;
            String str102 = str59;
            String str103 = str61;
            Object obj8 = obj4;
            if (AbstractC1416l.m3825a(str42, "gemini")) {
                JSONArray jSONArrayOptJSONArray7 = jSONObject5.optJSONArray("messages");
                if (jSONArrayOptJSONArray7 == null) {
                    jSONArrayOptJSONArray7 = new JSONArray();
                }
                JSONArray jSONArray19 = jSONArrayOptJSONArray7;
                JSONArray jSONArray20 = new JSONArray();
                JSONArray jSONArray21 = new JSONArray();
                HashMap map6 = new HashMap();
                HashMap map7 = new HashMap();
                int length11 = jSONArray19.length();
                String str104 = str47;
                int i30 = 0;
                while (i30 < length11) {
                    Object obj9 = obj8;
                    String str105 = str103;
                    String str106 = str97;
                    JSONObject jSONObjectOptJSONObject18 = jSONArray19.optJSONObject(i30);
                    if (jSONObjectOptJSONObject18 != null) {
                        jSONArray = jSONArray19;
                        i9 = i30;
                        String str107 = str99;
                        String strOptString9 = jSONObjectOptJSONObject18.optString(str107);
                        str6 = str107;
                        if (AbstractC1416l.m3825a(strOptString9, "system")) {
                            str97 = str106;
                            jSONArray2 = jSONArray20;
                            str3 = str96;
                            map = map6;
                            i10 = length11;
                            map2 = map7;
                            str4 = str104;
                            str5 = str46;
                            str7 = str98;
                            jSONArray3 = jSONArray21;
                            jSONArray3.put(new JSONObject().put(WeChatSnsPost.TYPE_TEXT, m5034h(jSONObjectOptJSONObject18.opt("content"))));
                        } else {
                            Object obj10 = obj3;
                            if (AbstractC1416l.m3825a(strOptString9, obj10)) {
                                obj3 = obj10;
                                str97 = str106;
                                jSONArray2 = jSONArray20;
                                str3 = str96;
                                map = map6;
                                i10 = length11;
                                map2 = map7;
                                str4 = str104;
                                str5 = str46;
                                str7 = str98;
                                jSONArray3 = jSONArray21;
                                jSONArray3.put(new JSONObject().put(WeChatSnsPost.TYPE_TEXT, m5034h(jSONObjectOptJSONObject18.opt("content"))));
                            } else {
                                obj3 = obj10;
                                String str108 = str57;
                                if (AbstractC1416l.m3825a(strOptString9, str108)) {
                                    str57 = str108;
                                    JSONArray jSONArray22 = new JSONArray();
                                    i10 = length11;
                                    JSONObject jSONObject10 = new JSONObject();
                                    jSONArray4 = jSONArray21;
                                    JSONObject jSONObject11 = new JSONObject();
                                    jSONArray2 = jSONArray20;
                                    str3 = str96;
                                    String str109 = str101;
                                    String strOptString10 = jSONObjectOptJSONObject18.optString(str109);
                                    String str110 = (String) map7.get(strOptString10);
                                    if (str110 != null) {
                                        str101 = str109;
                                        String str111 = !AbstractC3149m.m6721t0(str110) ? str110 : null;
                                        if (str111 != null) {
                                            jSONObject11.put(str62, str111);
                                        }
                                    } else {
                                        str101 = str109;
                                    }
                                    String str112 = (String) map6.get(strOptString10);
                                    if (str112 == null) {
                                        str112 = HttpUrl.FRAGMENT_ENCODE_SET;
                                    }
                                    if (AbstractC3149m.m6721t0(str112)) {
                                        str112 = str57;
                                    }
                                    jSONObject11.put(str60, str112);
                                    map3 = map7;
                                    jSONObject11.put("response", new JSONObject().put("result", m5034h(jSONObjectOptJSONObject18.opt("content"))));
                                    jSONArrayPut = jSONArray22.put(jSONObject10.put("functionResponse", jSONObject11));
                                } else {
                                    str57 = str108;
                                    jSONArray2 = jSONArray20;
                                    jSONArray4 = jSONArray21;
                                    str3 = str96;
                                    i10 = length11;
                                    map3 = map7;
                                    Object objOpt2 = jSONObjectOptJSONObject18.opt("content");
                                    if (objOpt2 instanceof JSONArray) {
                                        JSONArray jSONArray23 = new JSONArray();
                                        JSONArray jSONArray24 = (JSONArray) objOpt2;
                                        int length12 = jSONArray24.length();
                                        int i31 = 0;
                                        while (i31 < length12) {
                                            HashMap map8 = map6;
                                            HashMap map9 = map3;
                                            String str113 = str106;
                                            String str114 = str98;
                                            JSONObject jSONObjectOptJSONObject19 = jSONArray24.optJSONObject(i31);
                                            JSONArray jSONArray25 = jSONArray24;
                                            if (jSONObjectOptJSONObject19 != null) {
                                                String str115 = str3;
                                                String strOptString11 = jSONObjectOptJSONObject19.optString(str115);
                                                if (AbstractC1416l.m3825a(strOptString11, WeChatSnsPost.TYPE_TEXT)) {
                                                    jSONArray23.put(new JSONObject().put(WeChatSnsPost.TYPE_TEXT, jSONObjectOptJSONObject19.optString(WeChatSnsPost.TYPE_TEXT)));
                                                    str3 = str115;
                                                } else {
                                                    str3 = str115;
                                                    String str116 = str48;
                                                    if (AbstractC1416l.m3825a(strOptString11, str116)) {
                                                        JSONObject jSONObjectOptJSONObject20 = jSONObjectOptJSONObject19.optJSONObject(str116);
                                                        str9 = str104;
                                                        String strOptString12 = jSONObjectOptJSONObject20 != null ? jSONObjectOptJSONObject20.optString(str9) : null;
                                                        if (strOptString12 == null) {
                                                            strOptString12 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                        }
                                                        C1187w0 c1187w0M5002H2 = m5002H(strOptString12);
                                                        str48 = str116;
                                                        if (c1187w0M5002H2 == null) {
                                                            i12 = length12;
                                                            i11 = i31;
                                                            str8 = strOptString9;
                                                            str10 = str46;
                                                        } else {
                                                            if (!c1187w0M5002H2.f3992a) {
                                                                c1187w0M5002H2 = null;
                                                            }
                                                            if (c1187w0M5002H2 != null) {
                                                                JSONObject jSONObject12 = new JSONObject();
                                                                i12 = length12;
                                                                JSONObject jSONObject13 = new JSONObject();
                                                                i11 = i31;
                                                                str8 = strOptString9;
                                                                jSONObject13.put("mimeType", c1187w0M5002H2.f3993b);
                                                                str10 = str46;
                                                                jSONObject13.put(str10, c1187w0M5002H2.f3994c);
                                                                jSONArray23.put(jSONObject12.put("inlineData", jSONObject13));
                                                            }
                                                        }
                                                    } else {
                                                        str48 = str116;
                                                    }
                                                }
                                                i11 = i31;
                                                str8 = strOptString9;
                                                str9 = str104;
                                                str10 = str46;
                                                i12 = length12;
                                            } else {
                                                i11 = i31;
                                                str8 = strOptString9;
                                                str9 = str104;
                                                str10 = str46;
                                                i12 = length12;
                                            }
                                            map6 = map8;
                                            map3 = map9;
                                            str46 = str10;
                                            str98 = str114;
                                            length12 = i12;
                                            jSONArray24 = jSONArray25;
                                            strOptString9 = str8;
                                            i31 = i11 + 1;
                                            str104 = str9;
                                            str106 = str113;
                                        }
                                        jSONArrayPut = jSONArray23;
                                    } else {
                                        jSONArrayPut = new JSONArray().put(new JSONObject().put(WeChatSnsPost.TYPE_TEXT, m5034h(objOpt2)));
                                        jSONArrayPut.getClass();
                                    }
                                }
                                if (AbstractC1416l.m3825a(strOptString9, str53)) {
                                    str7 = str98;
                                    JSONArray jSONArrayOptJSONArray8 = jSONObjectOptJSONObject18.optJSONArray(str7);
                                    if (jSONArrayOptJSONArray8 != null) {
                                        int length13 = jSONArrayOptJSONArray8.length();
                                        int i32 = 0;
                                        while (i32 < length13) {
                                            JSONObject jSONObjectOptJSONObject21 = jSONArrayOptJSONArray8.optJSONObject(i32);
                                            if (jSONObjectOptJSONObject21 == null || (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject21.optJSONObject(str106)) == null) {
                                                HashMap map10 = map6;
                                                map4 = map3;
                                                map5 = map10;
                                                str12 = str106;
                                                jSONArray5 = jSONArrayOptJSONArray8;
                                                i13 = length13;
                                                i14 = i32;
                                                str13 = str100;
                                            } else {
                                                str12 = str106;
                                                String strOptString13 = jSONObjectOptJSONObject21.optString(str62);
                                                jSONArray5 = jSONArrayOptJSONArray8;
                                                String strOptString14 = jSONObjectOptJSONObject3.optString(str60);
                                                map6.put(strOptString13, strOptString14);
                                                String strOptString15 = jSONObjectOptJSONObject21.optString("provider_metadata");
                                                strOptString15.getClass();
                                                if (AbstractC3149m.m6721t0(strOptString15)) {
                                                    strOptString15 = null;
                                                }
                                                if (strOptString15 != null) {
                                                    i13 = length13;
                                                    try {
                                                        c3959f2 = new JSONObject(strOptString15).optJSONObject("part");
                                                    } catch (Throwable th5) {
                                                        c3959f2 = new C3959f(th5);
                                                    }
                                                    if (c3959f2 instanceof C3959f) {
                                                        c3959f2 = null;
                                                    }
                                                    jSONObjectPut = (JSONObject) c3959f2;
                                                } else {
                                                    i13 = length13;
                                                    jSONObjectPut = null;
                                                }
                                                i14 = i32;
                                                String strOptString16 = (jSONObjectPut == null || (jSONObjectOptJSONObject4 = jSONObjectPut.optJSONObject("functionCall")) == null) ? null : jSONObjectOptJSONObject4.optString(str62);
                                                if (strOptString16 == null) {
                                                    HashMap map11 = map6;
                                                    map4 = map3;
                                                    map5 = map11;
                                                    strOptString16 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                } else {
                                                    HashMap map12 = map6;
                                                    map4 = map3;
                                                    map5 = map12;
                                                }
                                                map4.put(strOptString13, strOptString16);
                                                if (jSONObjectPut != null) {
                                                    str13 = str100;
                                                } else {
                                                    JSONObject jSONObject14 = new JSONObject();
                                                    JSONObject jSONObjectM9267k3 = AbstractC4855en.m9267k(str60, strOptString14);
                                                    str13 = str100;
                                                    String strOptString17 = jSONObjectOptJSONObject3.optString(str13, str49);
                                                    strOptString17.getClass();
                                                    jSONObjectM9267k3.put("args", m5005K(strOptString17));
                                                    jSONObjectPut = jSONObject14.put("functionCall", jSONObjectM9267k3);
                                                }
                                                jSONArrayPut.put(jSONObjectPut);
                                            }
                                            HashMap map13 = map4;
                                            map6 = map5;
                                            map3 = map13;
                                            str100 = str13;
                                            jSONArrayOptJSONArray8 = jSONArray5;
                                            length13 = i13;
                                            str106 = str12;
                                            i32 = i14 + 1;
                                        }
                                    }
                                    HashMap map14 = map6;
                                    map2 = map3;
                                    map = map14;
                                    str97 = str106;
                                    str11 = str100;
                                } else {
                                    HashMap map15 = map6;
                                    map2 = map3;
                                    map = map15;
                                    str97 = str106;
                                    str11 = str100;
                                    str7 = str98;
                                }
                                String str117 = AbstractC1416l.m3825a(strOptString9, str53) ? "model" : "user";
                                jSONArrayPut.getClass();
                                m5029e(jSONArray2, str117, jSONArrayPut);
                                str100 = str11;
                                str4 = str104;
                                str5 = str46;
                                jSONArray3 = jSONArray4;
                            }
                        }
                    } else {
                        str97 = str106;
                        jSONArray = jSONArray19;
                        jSONArray2 = jSONArray20;
                        jSONArray3 = jSONArray21;
                        str3 = str96;
                        i9 = i30;
                        map = map6;
                        i10 = length11;
                        map2 = map7;
                        str4 = str104;
                        str5 = str46;
                        str6 = str99;
                        str7 = str98;
                    }
                    i30 = i9 + 1;
                    jSONArray19 = jSONArray;
                    jSONArray21 = jSONArray3;
                    str46 = str5;
                    str98 = str7;
                    str104 = str4;
                    length11 = i10;
                    str99 = str6;
                    jSONArray20 = jSONArray2;
                    str103 = str105;
                    str96 = str3;
                    jSONObject5 = jSONObject;
                    map7 = map2;
                    obj8 = obj9;
                    map6 = map;
                }
                JSONObject jSONObject15 = new JSONObject();
                if (jSONArray21.length() > 0) {
                    jSONObject15.put("systemInstruction", new JSONObject().put("parts", jSONArray21));
                }
                jSONObject15.put("contents", jSONArray20);
                JSONObject jSONObject16 = new JSONObject();
                jSONObject16.put("temperature", jSONObject5.optDouble("temperature", 0.2d));
                if (jSONObject5.has("response_format")) {
                    jSONObject16.put("responseMimeType", "application/json");
                }
                jSONObject15.put("generationConfig", jSONObject16);
                JSONArray jSONArrayOptJSONArray9 = jSONObject5.optJSONArray("tools");
                if (jSONArrayOptJSONArray9 != null) {
                    JSONArray jSONArray26 = new JSONArray();
                    JSONObject jSONObject17 = new JSONObject();
                    JSONArray jSONArray27 = new JSONArray();
                    int length14 = jSONArrayOptJSONArray9.length();
                    int i33 = 0;
                    while (i33 < length14) {
                        JSONObject jSONObjectOptJSONObject22 = jSONArrayOptJSONArray9.optJSONObject(i33);
                        String str118 = str97;
                        if (jSONObjectOptJSONObject22 == null || (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject22.optJSONObject(str118)) == null) {
                            jSONObject4 = jSONObject15;
                            obj = obj8;
                            str = str102;
                            str2 = str103;
                        } else {
                            JSONObject jSONObject18 = new JSONObject();
                            jSONObject18.put(str60, jSONObjectOptJSONObject2.optString(str60));
                            str2 = str103;
                            jSONObject18.put(str2, jSONObjectOptJSONObject2.optString(str2));
                            str = str102;
                            JSONObject jSONObjectOptJSONObject23 = jSONObjectOptJSONObject2.optJSONObject(str);
                            if (jSONObjectOptJSONObject23 != null) {
                                obj = obj8;
                            } else {
                                obj = obj8;
                                jSONObjectOptJSONObject23 = new JSONObject().put(str96, obj);
                            }
                            jSONObject4 = jSONObject15;
                            jSONObject18.put("parametersJsonSchema", jSONObjectOptJSONObject23);
                            jSONArray27.put(jSONObject18);
                        }
                        i33++;
                        jSONObject15 = jSONObject4;
                        str97 = str118;
                        str103 = str2;
                        str102 = str;
                        obj8 = obj;
                    }
                    jSONObject15.put("tools", jSONArray26.put(jSONObject17.put("functionDeclarations", jSONArray27)));
                    jSONObject15.put("toolConfig", new JSONObject().put("functionCallingConfig", new JSONObject().put("mode", "AUTO")));
                }
                jSONObject2 = jSONObject15;
            } else {
                JSONObject jSONObjectPut2 = new JSONObject(jSONObject.toString()).put("stream", z9);
                JSONArray jSONArrayOptJSONArray10 = jSONObjectPut2.optJSONArray("messages");
                if (jSONArrayOptJSONArray10 != null) {
                    int length15 = jSONArrayOptJSONArray10.length();
                    for (int i34 = 0; i34 < length15; i34++) {
                        JSONObject jSONObjectOptJSONObject24 = jSONArrayOptJSONArray10.optJSONObject(i34);
                        if (jSONObjectOptJSONObject24 != null) {
                            jSONObjectOptJSONObject24.remove(str45);
                            jSONObjectOptJSONObject24.remove("reasoning_content");
                            JSONArray jSONArrayOptJSONArray11 = jSONObjectOptJSONObject24.optJSONArray(str98);
                            if (jSONArrayOptJSONArray11 != null) {
                                int length16 = jSONArrayOptJSONArray11.length();
                                for (int i35 = 0; i35 < length16; i35++) {
                                    JSONObject jSONObjectOptJSONObject25 = jSONArrayOptJSONArray11.optJSONObject(i35);
                                    if (jSONObjectOptJSONObject25 != null) {
                                        String strOptString18 = jSONObjectOptJSONObject25.optString("provider_metadata");
                                        strOptString18.getClass();
                                        if (AbstractC3149m.m6721t0(strOptString18)) {
                                            strOptString18 = null;
                                        }
                                        if (strOptString18 != null) {
                                            try {
                                                c3959f = new JSONObject(strOptString18);
                                            } catch (Throwable th6) {
                                                c3959f = new C3959f(th6);
                                            }
                                            if (c3959f instanceof C3959f) {
                                                c3959f = null;
                                            }
                                            jSONObject3 = (JSONObject) c3959f;
                                        } else {
                                            jSONObject3 = null;
                                        }
                                        jSONObjectOptJSONObject25.remove("provider_metadata");
                                        if (jSONObject3 != null && (jSONObjectOptJSONObject = jSONObject3.optJSONObject("extra_content")) != null) {
                                            jSONObjectOptJSONObject25.put("extra_content", jSONObjectOptJSONObject);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                jSONObject2 = jSONObjectPut2;
            }
        }
        return new C1190x0(jSONObject2, m5001G(c1183v));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static void m5015U(File file, byte[] bArr, int i9) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i10 = 0;
        while (i10 < i9) {
            try {
                int i11 = randomAccessFile.read(bArr, i10, i9 - i10);
                if (i11 < 0) {
                    break;
                } else {
                    i10 += i11;
                }
            } finally {
                m5036j(randomAccessFile);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static C4690a m5016V(byte[] bArr, int i9, int i10) {
        long j3 = 0;
        int i11 = 0;
        while (i9 < i10 && i11 < 64) {
            int i12 = i9 + 1;
            byte b10 = bArr[i9];
            j3 |= ((long) (b10 & JSONB.Constants.BC_SYMBOL)) << i11;
            if ((b10 & 128) == 0) {
                return new C4690a(j3, i12);
            }
            i11 += 7;
            i9 = i12;
        }
        C2104o.m5294t("bad varint");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static final long m5017W(long j3) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j3 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j3 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static int m5018X(float f3) {
        if (!Float.isNaN(f3)) {
            return Math.round(f3);
        }
        C2104o.m5294t("Cannot round NaN value.");
        return 0;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: Y */
    public static String m5019Y(Context context, String str, Uri uri) {
        Object c3959f;
        FileOutputStream fileOutputStream;
        Pattern patternCompile = Pattern.compile("[^A-Za-z0-9_-]");
        patternCompile.getClass();
        String strReplaceAll = patternCompile.matcher(str).replaceAll("_");
        strReplaceAll.getClass();
        String strM6701P0 = AbstractC3149m.m6701P0(96, strReplaceAll);
        String absolutePath = null;
        if (strM6701P0.length() != 0) {
            try {
                c3959f = m5038l(context, uri);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            Bitmap bitmap = (Bitmap) c3959f;
            if (bitmap != null) {
                File file = new File(AbstractC4302b.m8641d(context), "FloatingShortcut/icons");
                file.mkdirs();
                File file2 = new File(file, strM6701P0.concat(".png"));
                StringBuilder sbM2259v = AbstractC0921a.m2259v(".", strM6701P0, "-", System.nanoTime());
                sbM2259v.append(".tmp");
                File file3 = new File(file, sbM2259v.toString());
                try {
                    fileOutputStream = new FileOutputStream(file3);
                } catch (Throwable unused) {
                    file3.delete();
                }
                try {
                    try {
                        if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream)) {
                            throw new IllegalStateException("Check failed.");
                        }
                        fileOutputStream.getFD().sync();
                        fileOutputStream.close();
                        if (file2.exists() && !file2.delete()) {
                            throw new IllegalStateException("无法替换旧图标");
                        }
                        if (!file3.renameTo(file2)) {
                            AbstractC0793l.m2021a0(file3, file2);
                            file3.delete();
                        }
                        absolutePath = file2.getAbsolutePath();
                        return absolutePath;
                    } finally {
                    }
                } finally {
                    bitmap.recycle();
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z */
    public static JSONObject m5020Z(byte[] bArr) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (bArr == null) {
                bArr = new byte[0];
            } else {
                if (bArr.length >= 4 && (bArr[0] & 255) == 0) {
                    int length = bArr.length - 4;
                    byte[] bArr2 = new byte[length];
                    System.arraycopy(bArr, 4, bArr2, 0, length);
                    bArr = bArr2;
                }
            }
            m5011Q(jSONObject, bArr, bArr.length, 0);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0474  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0482 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0496  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x04f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0505  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0526  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05a5  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x05ab  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x05cc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05d9  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0642  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0655  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x065a  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x065e  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x068a  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5021a(final boolean z9, final C3874d c3874d, final C4063y c4063y, final EnumC4010g0 enumC4010g0, final InterfaceC1220a interfaceC1220a, final InterfaceC1220a interfaceC1220a2, final float f3, final C3874d c3874d2, C1836h0 c1836h0, final int i9) {
        int i10;
        final C3874d c3874d3;
        C5850l c5850l;
        InterfaceC1809a1 interfaceC1809a1;
        C1739c c1739c;
        C1739c c1739c2;
        C1739c c1739c3;
        int i11;
        boolean z10;
        boolean z11;
        Object objM4514P;
        int i12;
        long j3;
        C4241k c4241k;
        C5944v1 c5944v1;
        long j4;
        boolean zM4530d;
        Object objM4514P2;
        EnumC4243m enumC4243m;
        int i13;
        boolean zM4534f;
        Object objM4514P3;
        long j5;
        long j10;
        boolean zM4532e;
        long jM8258a;
        C4241k c4241k2;
        long j11;
        Object c4240j;
        boolean zM4532e2;
        boolean z12;
        boolean z13;
        boolean zM4532e3;
        Object objM4514P4;
        C1823e c1823e;
        EnumC4243m enumC4243m2;
        C4241k c4241k3;
        long j12;
        C4007f0 c4007f0;
        boolean zM4532e4;
        Object objM4514P5;
        boolean z14;
        boolean z15;
        int i14;
        float f10;
        long jM8256t;
        boolean zM4534f2;
        Object objM4514P6;
        boolean z16;
        Object objM4514P7;
        C5896j1 c5896j1;
        C1836h0 c1836h02 = c1836h0;
        c1836h02.m4527b0(-225084053);
        if ((i9 & 6) == 0) {
            i10 = (c1836h02.m4536g(z9) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= c1836h02.m4538h(c3874d) ? 32 : 16;
        }
        int i15 = i9 & 384;
        C5850l c5850l2 = C5850l.f23787a;
        if (i15 == 0) {
            i10 |= c1836h02.m4534f(c5850l2) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i10 |= c1836h02.m4534f(c4063y) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i9 & 24576) == 0) {
            i10 |= c1836h02.m4530d(enumC4010g0.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i9) == 0) {
            i10 |= c1836h02.m4536g(true) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((1572864 & i9) == 0) {
            i10 |= c1836h02.m4538h(interfaceC1220a) ? 1048576 : 524288;
        }
        if ((12582912 & i9) == 0) {
            i10 |= c1836h02.m4538h(interfaceC1220a2) ? 8388608 : 4194304;
        }
        if ((100663296 & i9) == 0) {
            i10 |= c1836h02.m4534f(null) ? 67108864 : 33554432;
        }
        if ((805306368 & i9) == 0) {
            i10 |= c1836h02.m4528c(f3) ? 536870912 : 268435456;
        }
        int i16 = i10;
        if (c1836h02.m4516S(i16 & 1, (i16 & 306783379) != 306783378)) {
            Object objM4514P8 = c1836h02.m4514P();
            C1823e c1823e2 = C1851l.f6155a;
            if (objM4514P8 == c1823e2) {
                objM4514P8 = AbstractC1742d.m4365a(0.0f, 0.01f);
                c1836h02.m4545k0(objM4514P8);
            }
            C1739c c1739c4 = (C1739c) objM4514P8;
            Object objM4514P9 = c1836h02.m4514P();
            if (objM4514P9 == c1823e2) {
                objM4514P9 = AbstractC1742d.m4365a(0.0f, 0.01f);
                c1836h02.m4545k0(objM4514P9);
            }
            C1739c c1739c5 = (C1739c) objM4514P9;
            Object objM4514P10 = c1836h02.m4514P();
            if (objM4514P10 == c1823e2) {
                objM4514P10 = AbstractC1742d.m4365a(0.0f, 0.01f);
                c1836h02.m4545k0(objM4514P10);
            }
            C1739c c1739c6 = (C1739c) objM4514P10;
            final InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(interfaceC1220a, c1836h02);
            InterfaceC1809a1 interfaceC1809a1M4643y2 = AbstractC1874r.m4643y(interfaceC1220a2, c1836h02);
            Object objM4514P11 = c1836h02.m4514P();
            if (objM4514P11 == c1823e2) {
                objM4514P11 = AbstractC1874r.m4632n(c1836h02);
                c1836h02.m4545k0(objM4514P11);
            }
            final InterfaceC3599t interfaceC3599t = (InterfaceC3599t) objM4514P11;
            Object objM4514P12 = c1836h02.m4514P();
            if (objM4514P12 == c1823e2) {
                objM4514P12 = AbstractC1874r.m4639u(Boolean.FALSE);
                c1836h02.m4545k0(objM4514P12);
            }
            InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) objM4514P12;
            Boolean boolValueOf = Boolean.valueOf(z9);
            boolean zM4538h = ((i16 & 14) == 4) | c1836h02.m4538h(c1739c4) | c1836h02.m4538h(c1739c5) | c1836h02.m4538h(c1739c6) | c1836h02.m4534f(interfaceC1809a1M4643y2);
            Object objM4514P13 = c1836h02.m4514P();
            if (zM4538h || objM4514P13 == c1823e2) {
                c5850l = c5850l2;
                C5831p c5831p = new C5831p(z9, interfaceC1809a12, c1739c5, c1739c4, c1739c6, interfaceC1809a1M4643y2, null);
                interfaceC1809a1 = interfaceC1809a12;
                c1739c = c1739c5;
                c1739c2 = c1739c4;
                c1739c3 = c1739c6;
                c1836h02.m4545k0(c5831p);
                objM4514P13 = c5831p;
            } else {
                c1739c2 = c1739c4;
                c1739c = c1739c5;
                c5850l = c5850l2;
                c1739c3 = c1739c6;
                interfaceC1809a1 = interfaceC1809a12;
            }
            AbstractC1874r.m4624f((InterfaceC1235p) objM4514P13, c1836h02, boolValueOf);
            if (!z9 && !((Boolean) interfaceC1809a1.getValue()).booleanValue()) {
                C1876r1 c1876r1M4557t = c1836h02.m4557t();
                if (c1876r1M4557t != null) {
                    final int i17 = 0;
                    c1876r1M4557t.f6241d = new InterfaceC1235p() { // from class: xh.j
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i17) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    AbstractC2043a.m5021a(z9, c3874d, c4063y, enumC4010g0, interfaceC1220a, interfaceC1220a2, f3, c3874d2, (C1836h0) obj, AbstractC1874r.m4617C(i9 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    AbstractC2043a.m5021a(z9, c3874d, c4063y, enumC4010g0, interfaceC1220a, interfaceC1220a2, f3, c3874d2, (C1836h0) obj, AbstractC1874r.m4617C(i9 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    AbstractC2043a.m5021a(z9, c3874d, c4063y, enumC4010g0, interfaceC1220a, interfaceC1220a2, f3, c3874d2, (C1836h0) obj, AbstractC1874r.m4617C(i9 | 1));
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    };
                    return;
                }
                return;
            }
            Object objM4514P14 = c1836h02.m4514P();
            C4241k c4241k4 = C4241k.f13913e;
            if (objM4514P14 == c1823e2) {
                objM4514P14 = AbstractC1874r.m4639u(c4241k4);
                c1836h02.m4545k0(objM4514P14);
            }
            final InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) objM4514P14;
            Object objM4514P15 = c1836h02.m4514P();
            if (objM4514P15 == c1823e2) {
                objM4514P15 = new C5086lp(interfaceC1809a13, 29);
                c1836h02.m4545k0(objM4514P15);
            }
            AbstractC3208d.m6873c(c1836h02, AbstractC4434w.m8889m(c5850l, (InterfaceC1231l) objM4514P15));
            if (AbstractC1416l.m3825a((C4241k) interfaceC1809a13.getValue(), c4241k4)) {
                C1876r1 c1876r1M4557t2 = c1836h02.m4557t();
                if (c1876r1M4557t2 != null) {
                    final int i18 = 1;
                    c1876r1M4557t2.f6241d = new InterfaceC1235p() { // from class: xh.j
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (i18) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    AbstractC2043a.m5021a(z9, c3874d, c4063y, enumC4010g0, interfaceC1220a, interfaceC1220a2, f3, c3874d2, (C1836h0) obj, AbstractC1874r.m4617C(i9 | 1));
                                    break;
                                case 1:
                                    ((Integer) obj2).getClass();
                                    AbstractC2043a.m5021a(z9, c3874d, c4063y, enumC4010g0, interfaceC1220a, interfaceC1220a2, f3, c3874d2, (C1836h0) obj, AbstractC1874r.m4617C(i9 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    AbstractC2043a.m5021a(z9, c3874d, c4063y, enumC4010g0, interfaceC1220a, interfaceC1220a2, f3, c3874d2, (C1836h0) obj, AbstractC1874r.m4617C(i9 | 1));
                                    break;
                            }
                            return C3967n.f12976a;
                        }
                    };
                    return;
                }
                return;
            }
            EnumC4010g0 enumC4010g02 = enumC4010g0;
            Object objM4514P16 = c1836h02.m4514P();
            if (objM4514P16 == c1823e2) {
                objM4514P16 = AbstractC1874r.m4639u(new C4242l(0L));
                c1836h02.m4545k0(objM4514P16);
            }
            final InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) objM4514P16;
            C4241k c4241k5 = (C4241k) interfaceC1809a13.getValue();
            long j13 = ((C4242l) interfaceC1809a14.getValue()).f13918a;
            int i19 = ((i16 >> 12) & 14) | ((i16 >> 6) & 112);
            c4063y.getClass();
            c4241k5.getClass();
            int i20 = c4241k5.f13915b;
            int i21 = c4241k5.f13916c;
            int i22 = c4241k5.f13914a;
            InterfaceC4233c interfaceC4233c = (InterfaceC4233c) c1836h02.m4542j(AbstractC5888h1.f23926h);
            InterfaceC5917o2 interfaceC5917o2 = (InterfaceC5917o2) c1836h02.m4542j(AbstractC5888h1.f23939u);
            EnumC4243m enumC4243m3 = (EnumC4243m) c1836h02.m4542j(AbstractC5888h1.f23932n);
            WeakHashMap weakHashMap = C3255s1.f10360v;
            C3202b c3202b = C3205c.m6868e(c1836h02).f10362b;
            C3202b c3202b2 = C3205c.m6868e(c1836h02).f10366f;
            C3202b c3202b3 = C3205c.m6868e(c1836h02).f10365e;
            C3202b c3202b4 = C3205c.m6868e(c1836h02).f10361a;
            boolean zM4530d2 = c1836h02.m4530d(enumC4243m3.ordinal()) | c1836h02.m4534f(interfaceC4233c);
            int i23 = (i19 & 112) ^ 48;
            if (i23 <= 32 || !c1836h02.m4534f(c4063y)) {
                i11 = i19;
                if ((i11 & 48) != 32) {
                    z10 = false;
                }
                z11 = zM4530d2 | z10;
                objM4514P = c1836h02.m4514P();
                if (!z11 || objM4514P == c1823e2) {
                    i12 = i23;
                    j3 = j13;
                    objM4514P = new C4241k(interfaceC4233c.mo1590G0(c4063y.m8259b().mo6925d(enumC4243m3)), interfaceC4233c.mo1590G0(c4063y.m8259b().f10418b), interfaceC4233c.mo1590G0(c4063y.m8259b().mo6923b(enumC4243m3)), interfaceC4233c.mo1590G0(c4063y.m8259b().f10420d));
                    c1836h02.m4545k0(objM4514P);
                } else {
                    j3 = j13;
                    i12 = i23;
                }
                c4241k = (C4241k) objM4514P;
                c5944v1 = (C5944v1) interfaceC5917o2;
                if (c5944v1.f24165b == null) {
                    InterfaceC1220a interfaceC1220a3 = c5944v1.f24164a;
                    if (interfaceC1220a3 == null || (c5896j1 = (C5896j1) interfaceC1220a3.invoke()) == null) {
                        c5896j1 = C5896j1.f23959c;
                    }
                    c5944v1.f24165b = AbstractC1874r.m4639u(c5896j1);
                    c5944v1.f24164a = null;
                }
                C1845j1 c1845j1 = c5944v1.f24165b;
                c1845j1.getClass();
                j4 = ((C5896j1) c1845j1.getValue()).f23960a;
                zM4530d = c1836h02.m4530d(enumC4243m3.ordinal()) | c1836h02.m4534f(interfaceC4233c) | c1836h02.m4534f(c3202b) | c1836h02.m4534f(c3202b2) | c1836h02.m4534f(c3202b3) | c1836h02.m4534f(c3202b4) | c1836h02.m4532e(j4);
                objM4514P2 = c1836h02.m4514P();
                if (!zM4530d || objM4514P2 == c1823e2) {
                    int i24 = c3202b.m6858e().f445a;
                    int i25 = c3202b2.m6858e().f446b;
                    int i26 = ((int) (j4 >> 32)) - c3202b.m6858e().f447c;
                    enumC4243m = enumC4243m3;
                    objM4514P2 = new C4241k(i24, i25, i26, (((int) (j4 & 4294967295L)) - c3202b3.m6858e().f448d) - c3202b4.m6858e().f448d);
                    c1836h02.m4545k0(objM4514P2);
                } else {
                    enumC4243m = enumC4243m3;
                }
                C4241k c4241k6 = (C4241k) objM4514P2;
                i13 = (i11 & 14) ^ 6;
                zM4534f = c1836h02.m4534f(c4241k) | ((i13 <= 4 && c1836h02.m4530d(enumC4010g02.ordinal())) || (i11 & 6) == 4) | c1836h02.m4534f(c4241k5) | c1836h02.m4530d(enumC4243m.ordinal()) | c1836h02.m4532e(j4);
                objM4514P3 = c1836h02.m4514P();
                if (zM4534f || objM4514P3 == c1823e2) {
                    int iOrdinal = AbstractC4045s.m8255s(enumC4010g02, enumC4243m).ordinal();
                    int i27 = (iOrdinal != 1 || iOrdinal == 3 || iOrdinal == 5) ? i21 - c4241k.f13916c : i22 + c4241k.f13914a;
                    int iOrdinal2 = AbstractC4045s.m8255s(enumC4010g02, enumC4243m).ordinal();
                    j5 = j4;
                    objM4514P3 = new C1032u0(AbstractC4045s.m8256t(i27 / ((int) (j5 >> 32)), ((iOrdinal2 != 4 || iOrdinal2 == 5) ? i20 - c4241k.f13917d : c4241k5.f13917d + c4241k.f13917d) / ((int) (j5 & 4294967295L))));
                    c1836h02.m4545k0(objM4514P3);
                } else {
                    j5 = j4;
                }
                long j14 = ((C1032u0) objM4514P3).f3256a;
                j10 = j3;
                int i28 = i12;
                zM4532e = c1836h02.m4532e(j10) | c1836h02.m4534f(c4241k6) | c1836h02.m4534f(c4241k5) | ((i13 <= 4 && c1836h02.m4530d(enumC4010g02.ordinal())) || (i11 & 6) == 4) | c1836h02.m4530d(enumC4243m.ordinal()) | c1836h02.m4534f(c4241k) | ((i28 > 32 && c1836h02.m4534f(c4063y)) || (i11 & 48) == 32);
                Object objM4514P17 = c1836h02.m4514P();
                if (zM4532e || objM4514P17 == c1823e2) {
                    if (C4242l.m8534a(j10, 0L)) {
                        EnumC4243m enumC4243m4 = enumC4243m;
                        jM8258a = c4063y.m8258a(c4241k5, c4241k6, enumC4243m4, j10, c4241k, enumC4010g02);
                        enumC4243m = enumC4243m4;
                        c4241k2 = c4241k;
                        j11 = j10;
                        enumC4010g02 = enumC4010g02;
                    } else {
                        c4241k2 = c4241k;
                        j11 = j10;
                        jM8258a = 0;
                    }
                    c4240j = new C4240j(jM8258a);
                    c1836h02 = c1836h0;
                    c1836h02.m4545k0(c4240j);
                } else {
                    c4240j = objM4514P17;
                    c4241k2 = c4241k;
                    j11 = j10;
                }
                long j15 = ((C4240j) c4240j).f13912a;
                zM4532e2 = c1836h02.m4532e(j11) | c1836h02.m4534f(c4241k6) | c1836h02.m4534f(c4241k5);
                if (i13 > 4 || !c1836h02.m4530d(enumC4010g02.ordinal())) {
                    z12 = zM4532e2;
                    if ((i11 & 6) != 4) {
                        z13 = false;
                    }
                    zM4532e3 = z12 | z13 | c1836h02.m4532e(j15) | c1836h02.m4530d(enumC4243m.ordinal());
                    objM4514P4 = c1836h02.m4514P();
                    if (zM4532e3 || objM4514P4 == c1823e2) {
                        c1823e = c1823e2;
                        if (C4242l.m8534a(j11, 0L)) {
                            enumC4243m2 = enumC4243m;
                            c4241k3 = c4241k5;
                            int i29 = (((int) (j11 & 4294967295L)) / 2) + ((int) (j15 & 4294967295L));
                            int iM8532a = (c4241k3.m8532a() / 2) + i20;
                            boolean z17 = i29 > iM8532a;
                            boolean z18 = i29 < iM8532a;
                            j12 = j15;
                            int i30 = (int) (j12 >> 32);
                            objM4514P4 = new C4007f0(z17, z18, Math.abs((i30 + ((int) (j11 >> 32))) - i21) < Math.abs(i30 - i22));
                        } else {
                            int iOrdinal3 = AbstractC4045s.m8255s(enumC4010g02, enumC4243m).ordinal();
                            enumC4243m2 = enumC4243m;
                            j12 = j15;
                            objM4514P4 = new C4007f0(false, false, iOrdinal3 == 1 || iOrdinal3 == 3 || iOrdinal3 == 5);
                            c4241k3 = c4241k5;
                        }
                        c1836h02.m4545k0(objM4514P4);
                    } else {
                        enumC4243m2 = enumC4243m;
                        j12 = j15;
                        c1823e = c1823e2;
                        c4241k3 = c4241k5;
                    }
                    c4007f0 = (C4007f0) objM4514P4;
                    boolean zM4532e5 = c1836h02.m4532e(j11) | ((i13 <= 4 && c1836h02.m4530d(enumC4010g0.ordinal())) || (i11 & 6) == 4) | c1836h02.m4530d(enumC4243m2.ordinal()) | c1836h02.m4534f(c4241k2) | c1836h02.m4534f(c4241k3) | c1836h02.m4534f(c4241k6);
                    long j16 = j12;
                    zM4532e4 = zM4532e5 | ((i28 > 32 && c1836h02.m4534f(c4063y)) || (i11 & 48) == 32) | c1836h02.m4532e(j16) | c1836h02.m4534f(c4007f0) | c1836h02.m4532e(j5);
                    objM4514P5 = c1836h02.m4514P();
                    if (zM4532e4 || objM4514P5 == c1823e) {
                        if (C4242l.m8534a(j11, 0L)) {
                            boolean z19 = c4007f0.f13120a;
                            boolean z20 = c4007f0.f13121b;
                            if (c4007f0.f13122c) {
                                z14 = z19;
                                z15 = z20;
                                i14 = ((int) (j16 >> 32)) + ((int) (j11 >> 32));
                            } else {
                                z14 = z19;
                                z15 = z20;
                                i14 = (int) (j16 >> 32);
                            }
                            float f11 = i14;
                            int i31 = (int) (j16 & 4294967295L);
                            if ((z14 || z15) ? false : true) {
                                f10 = (((int) (j11 & 4294967295L)) / 2.0f) + i31;
                            } else {
                                if (!z14 && z15) {
                                    i31 += (int) (j11 & 4294967295L);
                                }
                                f10 = i31;
                            }
                            jM8256t = AbstractC4045s.m8256t(f11 / ((int) (r10 >> 32)), f10 / ((int) (r10 & 4294967295L)));
                        } else {
                            jM8256t = j14;
                        }
                        objM4514P5 = new C1032u0(jM8256t);
                        c1836h02.m4545k0(objM4514P5);
                    }
                    long j17 = ((C1032u0) objM4514P5).f3256a;
                    zM4534f2 = c1836h02.m4534f(c4007f0);
                    objM4514P6 = c1836h02.m4514P();
                    if (!zM4534f2 || objM4514P6 == c1823e) {
                        boolean z21 = c4007f0.f13120a;
                        boolean z22 = c4007f0.f13121b;
                        boolean z23 = c4007f0.f13122c;
                        z16 = z21 && !z22;
                        float f12 = 1.0f;
                        float f13 = !z23 ? 1.0f : 0.0f;
                        if (!z16) {
                            f12 = 0.5f;
                        } else if (z21 || !z22) {
                            f12 = 0.0f;
                        }
                        C1032u0 c1032u0 = new C1032u0(AbstractC0996c0.m2511g(f13, f12));
                        c1836h02.m4545k0(c1032u0);
                        objM4514P6 = c1032u0;
                    }
                    final C3999d0 c3999d0 = new C3999d0(c4241k6, c4241k2, j17, ((C1032u0) objM4514P6).f3256a, c4007f0);
                    objM4514P7 = c1836h02.m4514P();
                    if (objM4514P7 == c1823e) {
                        objM4514P7 = AbstractC1874r.m4639u(new C0807b(0L));
                        c1836h02.m4545k0(objM4514P7);
                    }
                    final InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) objM4514P7;
                    final C1739c c1739c7 = c1739c2;
                    final C1739c c1739c8 = c1739c;
                    final C1739c c1739c9 = c1739c3;
                    c3874d3 = c3874d;
                    c3874d3.mo3355c(interfaceC1809a1.getValue(), AbstractC3879i.m8071e(-297060143, new InterfaceC1235p() { // from class: xh.m
                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                        @Override // p085fg.InterfaceC1235p
                        public final Object invoke(Object obj, Object obj2) {
                            final C1739c c1739c10;
                            C1739c c1739c11;
                            C1739c c1739c12;
                            InterfaceC1809a1 interfaceC1809a16;
                            C1739c c1739c13;
                            C3999d0 c3999d02;
                            C1836h0 c1836h03 = (C1836h0) obj;
                            int iIntValue = ((Integer) obj2).intValue();
                            boolean zM4516S = c1836h03.m4516S(iIntValue & 1, (iIntValue & 3) != 2);
                            C3967n c3967n = C3967n.f12976a;
                            if (!zM4516S) {
                                c1836h03.m4519V();
                                return c3967n;
                            }
                            C3927e c3927eM16I0 = AbstractC0000a.m16I0(c1836h03);
                            InterfaceC3599t interfaceC3599t2 = interfaceC3599t;
                            boolean zM4538h2 = c1836h03.m4538h(interfaceC3599t2);
                            C1739c c1739c14 = c1739c7;
                            boolean zM4538h3 = zM4538h2 | c1836h03.m4538h(c1739c14);
                            C1739c c1739c15 = c1739c8;
                            boolean zM4538h4 = zM4538h3 | c1836h03.m4538h(c1739c15);
                            C1739c c1739c16 = c1739c9;
                            boolean zM4538h5 = zM4538h4 | c1836h03.m4538h(c1739c16);
                            Object objM4514P18 = c1836h03.m4514P();
                            C1823e c1823e3 = C1851l.f6155a;
                            if (zM4538h5 || objM4514P18 == c1823e3) {
                                objM4514P18 = new C5745f(interfaceC3599t2, c1739c14, c1739c15, c1739c16, 1);
                                c1739c10 = c1739c14;
                                c1739c11 = c1739c15;
                                c1739c12 = c1739c16;
                                c1836h03.m4545k0(objM4514P18);
                            } else {
                                c1739c10 = c1739c14;
                                c1739c11 = c1739c15;
                                c1739c12 = c1739c16;
                            }
                            InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P18;
                            InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a1M4643y;
                            boolean zM4534f3 = c1836h03.m4534f(interfaceC1809a17);
                            Object objM4514P19 = c1836h03.m4514P();
                            if (zM4534f3 || objM4514P19 == c1823e3) {
                                objM4514P19 = new C4960ht(interfaceC1809a17, 3);
                                c1836h03.m4545k0(objM4514P19);
                            }
                            AbstractC5700d.m10272d(c3927eM16I0, z9, interfaceC1220a4, (InterfaceC1220a) objM4514P19, c1836h03, 0, 0);
                            C3658e c3658e = (C3658e) c3927eM16I0.f12901a.getValue();
                            boolean zM4534f4 = c1836h03.m4534f(c3927eM16I0) | c1836h03.m4538h(c1739c10) | c1836h03.m4538h(c1739c11);
                            Object objM4514P20 = c1836h03.m4514P();
                            InterfaceC5557c interfaceC5557c = null;
                            if (zM4534f4 || objM4514P20 == c1823e3) {
                                interfaceC1809a16 = interfaceC1809a17;
                                C0368m c0368m = new C0368m(c3927eM16I0, c1739c10, c1739c11, interfaceC5557c, 23);
                                c1836h03.m4545k0(c0368m);
                                objM4514P20 = c0368m;
                            } else {
                                interfaceC1809a16 = interfaceC1809a17;
                            }
                            AbstractC1874r.m4624f((InterfaceC1235p) objM4514P20, c1836h03, c3658e);
                            C3200a0 c3200a0 = AbstractC3222h1.f10289c;
                            C5845g c5845g = C5840b.f23761g;
                            InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(c5845g, false);
                            int iHashCode = Long.hashCode(c1836h03.f6095T);
                            C3878h c3878hM4546l = c1836h03.m4546l();
                            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h03, c3200a0);
                            InterfaceC5605g.f22815f.getClass();
                            C5660y c5660y = C5601f.f22758b;
                            c1836h03.m4531d0();
                            if (c1836h03.f6094S) {
                                c1836h03.m4544k(c5660y);
                            } else {
                                c1836h03.m4551n0();
                            }
                            C5597e c5597e = C5601f.f22761e;
                            AbstractC1874r.m4615A(c5597e, c1836h03, interfaceC4412n0M6930d);
                            C5597e c5597e2 = C5601f.f22760d;
                            AbstractC1874r.m4615A(c5597e2, c1836h03, c3878hM4546l);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            C5597e c5597e3 = C5601f.f22762f;
                            AbstractC1874r.m4638t(c1836h03, numValueOf, c5597e3);
                            C5593d c5593d = C5601f.f22763g;
                            AbstractC1874r.m4641w(c5593d, c1836h03);
                            C5597e c5597e4 = C5601f.f22759c;
                            AbstractC1874r.m4615A(c5597e4, c1836h03, interfaceC5853oM10543c);
                            c1836h03.m4525a0(-1037832510);
                            boolean zM4538h6 = c1836h03.m4538h(c1739c12);
                            Object objM4514P21 = c1836h03.m4514P();
                            if (zM4538h6 || objM4514P21 == c1823e3) {
                                c1739c13 = c1739c11;
                                objM4514P21 = new C5816a(c1739c12, 1);
                                c1836h03.m4545k0(objM4514P21);
                            } else {
                                c1739c13 = c1739c11;
                            }
                            AbstractC3241o.m6927a(AbstractC2192n.m5430g(AbstractC0996c0.m2516m(c3200a0, (InterfaceC1231l) objM4514P21), ((C0314b) c1836h03.m4542j(AbstractC0316d.f944a)).m1245o(), AbstractC0996c0.f3162b), c1836h03, 0);
                            c1836h03.m4553p(false);
                            Object objM4514P22 = c1836h03.m4514P();
                            final InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a15;
                            if (objM4514P22 == c1823e3) {
                                objM4514P22 = new C5829n(interfaceC1809a18, 0);
                                c1836h03.m4545k0(objM4514P22);
                            }
                            InterfaceC5853o interfaceC5853oM8889m = AbstractC4434w.m8889m(c3200a0, (InterfaceC1231l) objM4514P22);
                            boolean zM4534f5 = c1836h03.m4534f(interfaceC1809a16);
                            Object objM4514P23 = c1836h03.m4514P();
                            if (zM4534f5 || objM4514P23 == c1823e3) {
                                objM4514P23 = new C5822g(interfaceC1809a16, 1);
                                c1836h03.m4545k0(objM4514P23);
                            }
                            InterfaceC5853o interfaceC5853oM8090a = AbstractC3898h0.m8090a(interfaceC5853oM8889m, c3967n, (PointerInputEventHandler) objM4514P23);
                            final C3999d0 c3999d03 = c3999d0;
                            boolean zM4534f6 = c1836h03.m4534f(null) | c1836h03.m4534f(c3999d03);
                            final float f14 = f3;
                            boolean zM4528c = zM4534f6 | c1836h03.m4528c(f14);
                            final C4063y c4063y2 = c4063y;
                            boolean zM4534f7 = zM4528c | c1836h03.m4534f(c4063y2);
                            final EnumC4010g0 enumC4010g03 = enumC4010g0;
                            boolean zM4530d3 = zM4534f7 | c1836h03.m4530d(enumC4010g03.ordinal());
                            Object objM4514P24 = c1836h03.m4514P();
                            if (zM4530d3 || objM4514P24 == c1823e3) {
                                final InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a13;
                                objM4514P24 = new InterfaceC1236q() { // from class: xh.o
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p085fg.InterfaceC1236q
                                    /* JADX INFO: renamed from: b */
                                    public final Object mo734b(Object obj3, Object obj4, Object obj5) {
                                        InterfaceC4418p0 interfaceC4418p0 = (InterfaceC4418p0) obj3;
                                        InterfaceC4409m0 interfaceC4409m0 = (InterfaceC4409m0) obj4;
                                        C4231a c4231a = (C4231a) obj5;
                                        interfaceC4418p0.getClass();
                                        interfaceC4409m0.getClass();
                                        C3999d0 c3999d04 = c3999d03;
                                        C4241k c4241k7 = c3999d04.f13087a;
                                        C4241k c4241k8 = c3999d04.f13088b;
                                        int iM8532a2 = (c4241k7.m8532a() - c4241k8.f13915b) - c4241k8.f13917d;
                                        int iMo1590G0 = interfaceC4418p0.mo1590G0(50);
                                        if (iM8532a2 < iMo1590G0) {
                                            iM8532a2 = iMo1590G0;
                                        }
                                        float f15 = 50;
                                        int iMo1590G02 = interfaceC4418p0.mo1590G0(f15);
                                        long j18 = c4231a.f13903a;
                                        int iMo1590G03 = iMo1590G02 <= C4231a.m8503g(j18) ? interfaceC4418p0.mo1590G0(f15) : C4231a.m8503g(j18);
                                        int iM8504h = C4231a.m8504h(j18);
                                        int iMo1590G04 = interfaceC4418p0.mo1590G0(f14);
                                        int iM8504h2 = C4231a.m8504h(j18);
                                        if (iMo1590G04 > iM8504h2) {
                                            iMo1590G04 = iM8504h2;
                                        }
                                        if (iM8504h < iMo1590G04 || iM8532a2 < iMo1590G03 || iMo1590G04 < 0 || iMo1590G03 < 0) {
                                            AbstractC4239i.m8525a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
                                        }
                                        AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(AbstractC4232b.m8515h(iMo1590G04, iM8504h, iMo1590G03, iM8532a2));
                                        long jM8258a2 = c4063y2.m8258a((C4241k) interfaceC1809a19.getValue(), c4241k7, interfaceC4418p0.getLayoutDirection(), (((long) abstractC4377b1Mo8831Q.f14593g) << 32) | (((long) abstractC4377b1Mo8831Q.f14594h) & 4294967295L), c4241k8, enumC4010g03);
                                        InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a18;
                                        return interfaceC4418p0.mo8010z(C4231a.m8504h(j18), C4231a.m8503g(j18), C4174u.f13711g, new C0893s0(abstractC4377b1Mo8831Q, (((long) (((int) (jM8258a2 & 4294967295L)) - ((int) Float.intBitsToFloat((int) (((C0807b) interfaceC1809a110.getValue()).f2414a & 4294967295L))))) & 4294967295L) | (((long) (((int) (jM8258a2 >> 32)) - ((int) Float.intBitsToFloat((int) (((C0807b) interfaceC1809a110.getValue()).f2414a >> 32))))) << 32), 4));
                                    }
                                };
                                c3999d02 = c3999d03;
                                c1836h03.m4545k0(objM4514P24);
                            } else {
                                c3999d02 = c3999d03;
                            }
                            InterfaceC5853o interfaceC5853oM8887k = AbstractC4434w.m8887k(interfaceC5853oM8090a, (InterfaceC1236q) objM4514P24);
                            InterfaceC4412n0 interfaceC4412n0M6930d2 = AbstractC3241o.m6930d(c5845g, false);
                            int iHashCode2 = Long.hashCode(c1836h03.f6095T);
                            C3878h c3878hM4546l2 = c1836h03.m4546l();
                            InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h03, interfaceC5853oM8887k);
                            c1836h03.m4531d0();
                            if (c1836h03.f6094S) {
                                c1836h03.m4544k(c5660y);
                            } else {
                                c1836h03.m4551n0();
                            }
                            AbstractC1874r.m4615A(c5597e, c1836h03, interfaceC4412n0M6930d2);
                            AbstractC1874r.m4615A(c5597e2, c1836h03, c3878hM4546l2);
                            AbstractC1874r.m4638t(c1836h03, Integer.valueOf(iHashCode2), c5597e3);
                            AbstractC1874r.m4641w(c5593d, c1836h03);
                            AbstractC1874r.m4615A(c5597e4, c1836h03, interfaceC5853oM10543c2);
                            InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a14;
                            long j18 = ((C4242l) interfaceC1809a110.getValue()).f13918a;
                            Object objM4514P25 = c1836h03.m4514P();
                            if (objM4514P25 == c1823e3) {
                                objM4514P25 = new C5086lp(interfaceC1809a110, 28);
                                c1836h03.m4545k0(objM4514P25);
                            }
                            InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P25;
                            boolean zM4538h7 = c1836h03.m4538h(c1739c10);
                            Object objM4514P26 = c1836h03.m4514P();
                            if (zM4538h7 || objM4514P26 == c1823e3) {
                                final int i32 = 0;
                                objM4514P26 = new InterfaceC1220a() { // from class: xh.k
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p085fg.InterfaceC1220a
                                    public final Object invoke() {
                                        float fFloatValue;
                                        switch (i32) {
                                            case 0:
                                                fFloatValue = ((Number) c1739c10.m4360d()).floatValue();
                                                break;
                                            default:
                                                fFloatValue = ((Number) c1739c10.m4360d()).floatValue();
                                                break;
                                        }
                                        return Float.valueOf(fFloatValue);
                                    }
                                };
                                c1836h03.m4545k0(objM4514P26);
                            }
                            InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P26;
                            final C1739c c1739c17 = c1739c13;
                            boolean zM4538h8 = c1836h03.m4538h(c1739c17);
                            Object objM4514P27 = c1836h03.m4514P();
                            if (zM4538h8 || objM4514P27 == c1823e3) {
                                final int i33 = 1;
                                objM4514P27 = new InterfaceC1220a() { // from class: xh.k
                                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                    @Override // p085fg.InterfaceC1220a
                                    public final Object invoke() {
                                        float fFloatValue;
                                        switch (i33) {
                                            case 0:
                                                fFloatValue = ((Number) c1739c17.m4360d()).floatValue();
                                                break;
                                            default:
                                                fFloatValue = ((Number) c1739c17.m4360d()).floatValue();
                                                break;
                                        }
                                        return Float.valueOf(fFloatValue);
                                    }
                                };
                                c1836h03.m4545k0(objM4514P27);
                            }
                            AbstractC4045s.m8244h(j18, interfaceC1231l, interfaceC1220a5, (InterfaceC1220a) objM4514P27, c3999d02.f13091e, c3999d02.f13090d, null, AbstractC3879i.m8071e(1949680412, new C5827l(interfaceC1809a16, c3874d2, 0), c1836h03), c1836h03, 12582960);
                            c1836h03.m4553p(true);
                            c1836h03.m4553p(true);
                            return c3967n;
                        }
                    }, c1836h02), c1836h02, Integer.valueOf(((i16 << 3) & 896) | 48));
                } else {
                    z12 = zM4532e2;
                }
                z13 = true;
                zM4532e3 = z12 | z13 | c1836h02.m4532e(j15) | c1836h02.m4530d(enumC4243m.ordinal());
                objM4514P4 = c1836h02.m4514P();
                if (zM4532e3) {
                    c1823e = c1823e2;
                    if (C4242l.m8534a(j11, 0L)) {
                    }
                    c1836h02.m4545k0(objM4514P4);
                    c4007f0 = (C4007f0) objM4514P4;
                    if (i13 <= 4) {
                        boolean zM4532e52 = c1836h02.m4532e(j11) | ((i13 <= 4 && c1836h02.m4530d(enumC4010g0.ordinal())) || (i11 & 6) == 4) | c1836h02.m4530d(enumC4243m2.ordinal()) | c1836h02.m4534f(c4241k2) | c1836h02.m4534f(c4241k3) | c1836h02.m4534f(c4241k6);
                        if (i28 > 32) {
                            long j162 = j12;
                            zM4532e4 = zM4532e52 | ((i28 > 32 && c1836h02.m4534f(c4063y)) || (i11 & 48) == 32) | c1836h02.m4532e(j162) | c1836h02.m4534f(c4007f0) | c1836h02.m4532e(j5);
                            objM4514P5 = c1836h02.m4514P();
                            if (zM4532e4) {
                                if (C4242l.m8534a(j11, 0L)) {
                                }
                                objM4514P5 = new C1032u0(jM8256t);
                                c1836h02.m4545k0(objM4514P5);
                                long j172 = ((C1032u0) objM4514P5).f3256a;
                                zM4534f2 = c1836h02.m4534f(c4007f0);
                                objM4514P6 = c1836h02.m4514P();
                                if (!zM4534f2) {
                                    boolean z212 = c4007f0.f13120a;
                                    boolean z222 = c4007f0.f13121b;
                                    boolean z232 = c4007f0.f13122c;
                                    if (z212) {
                                        float f122 = 1.0f;
                                        if (!z232) {
                                        }
                                        if (!z16) {
                                        }
                                        C1032u0 c1032u02 = new C1032u0(AbstractC0996c0.m2511g(f13, f122));
                                        c1836h02.m4545k0(c1032u02);
                                        objM4514P6 = c1032u02;
                                        final C3999d0 c3999d02 = new C3999d0(c4241k6, c4241k2, j172, ((C1032u0) objM4514P6).f3256a, c4007f0);
                                        objM4514P7 = c1836h02.m4514P();
                                        if (objM4514P7 == c1823e) {
                                        }
                                        final InterfaceC1809a1 interfaceC1809a152 = (InterfaceC1809a1) objM4514P7;
                                        final C1739c c1739c72 = c1739c2;
                                        final C1739c c1739c82 = c1739c;
                                        final C1739c c1739c92 = c1739c3;
                                        c3874d3 = c3874d;
                                        c3874d3.mo3355c(interfaceC1809a1.getValue(), AbstractC3879i.m8071e(-297060143, new InterfaceC1235p() { // from class: xh.m
                                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                            @Override // p085fg.InterfaceC1235p
                                            public final Object invoke(Object obj, Object obj2) {
                                                final C1739c c1739c10;
                                                C1739c c1739c11;
                                                C1739c c1739c12;
                                                InterfaceC1809a1 interfaceC1809a16;
                                                C1739c c1739c13;
                                                C3999d0 c3999d022;
                                                C1836h0 c1836h03 = (C1836h0) obj;
                                                int iIntValue = ((Integer) obj2).intValue();
                                                boolean zM4516S = c1836h03.m4516S(iIntValue & 1, (iIntValue & 3) != 2);
                                                C3967n c3967n = C3967n.f12976a;
                                                if (!zM4516S) {
                                                    c1836h03.m4519V();
                                                    return c3967n;
                                                }
                                                C3927e c3927eM16I0 = AbstractC0000a.m16I0(c1836h03);
                                                InterfaceC3599t interfaceC3599t2 = interfaceC3599t;
                                                boolean zM4538h2 = c1836h03.m4538h(interfaceC3599t2);
                                                C1739c c1739c14 = c1739c72;
                                                boolean zM4538h3 = zM4538h2 | c1836h03.m4538h(c1739c14);
                                                C1739c c1739c15 = c1739c82;
                                                boolean zM4538h4 = zM4538h3 | c1836h03.m4538h(c1739c15);
                                                C1739c c1739c16 = c1739c92;
                                                boolean zM4538h5 = zM4538h4 | c1836h03.m4538h(c1739c16);
                                                Object objM4514P18 = c1836h03.m4514P();
                                                C1823e c1823e3 = C1851l.f6155a;
                                                if (zM4538h5 || objM4514P18 == c1823e3) {
                                                    objM4514P18 = new C5745f(interfaceC3599t2, c1739c14, c1739c15, c1739c16, 1);
                                                    c1739c10 = c1739c14;
                                                    c1739c11 = c1739c15;
                                                    c1739c12 = c1739c16;
                                                    c1836h03.m4545k0(objM4514P18);
                                                } else {
                                                    c1739c10 = c1739c14;
                                                    c1739c11 = c1739c15;
                                                    c1739c12 = c1739c16;
                                                }
                                                InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P18;
                                                InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a1M4643y;
                                                boolean zM4534f3 = c1836h03.m4534f(interfaceC1809a17);
                                                Object objM4514P19 = c1836h03.m4514P();
                                                if (zM4534f3 || objM4514P19 == c1823e3) {
                                                    objM4514P19 = new C4960ht(interfaceC1809a17, 3);
                                                    c1836h03.m4545k0(objM4514P19);
                                                }
                                                AbstractC5700d.m10272d(c3927eM16I0, z9, interfaceC1220a4, (InterfaceC1220a) objM4514P19, c1836h03, 0, 0);
                                                C3658e c3658e = (C3658e) c3927eM16I0.f12901a.getValue();
                                                boolean zM4534f4 = c1836h03.m4534f(c3927eM16I0) | c1836h03.m4538h(c1739c10) | c1836h03.m4538h(c1739c11);
                                                Object objM4514P20 = c1836h03.m4514P();
                                                InterfaceC5557c interfaceC5557c = null;
                                                if (zM4534f4 || objM4514P20 == c1823e3) {
                                                    interfaceC1809a16 = interfaceC1809a17;
                                                    C0368m c0368m = new C0368m(c3927eM16I0, c1739c10, c1739c11, interfaceC5557c, 23);
                                                    c1836h03.m4545k0(c0368m);
                                                    objM4514P20 = c0368m;
                                                } else {
                                                    interfaceC1809a16 = interfaceC1809a17;
                                                }
                                                AbstractC1874r.m4624f((InterfaceC1235p) objM4514P20, c1836h03, c3658e);
                                                C3200a0 c3200a0 = AbstractC3222h1.f10289c;
                                                C5845g c5845g = C5840b.f23761g;
                                                InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(c5845g, false);
                                                int iHashCode = Long.hashCode(c1836h03.f6095T);
                                                C3878h c3878hM4546l = c1836h03.m4546l();
                                                InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h03, c3200a0);
                                                InterfaceC5605g.f22815f.getClass();
                                                C5660y c5660y = C5601f.f22758b;
                                                c1836h03.m4531d0();
                                                if (c1836h03.f6094S) {
                                                    c1836h03.m4544k(c5660y);
                                                } else {
                                                    c1836h03.m4551n0();
                                                }
                                                C5597e c5597e = C5601f.f22761e;
                                                AbstractC1874r.m4615A(c5597e, c1836h03, interfaceC4412n0M6930d);
                                                C5597e c5597e2 = C5601f.f22760d;
                                                AbstractC1874r.m4615A(c5597e2, c1836h03, c3878hM4546l);
                                                Integer numValueOf = Integer.valueOf(iHashCode);
                                                C5597e c5597e3 = C5601f.f22762f;
                                                AbstractC1874r.m4638t(c1836h03, numValueOf, c5597e3);
                                                C5593d c5593d = C5601f.f22763g;
                                                AbstractC1874r.m4641w(c5593d, c1836h03);
                                                C5597e c5597e4 = C5601f.f22759c;
                                                AbstractC1874r.m4615A(c5597e4, c1836h03, interfaceC5853oM10543c);
                                                c1836h03.m4525a0(-1037832510);
                                                boolean zM4538h6 = c1836h03.m4538h(c1739c12);
                                                Object objM4514P21 = c1836h03.m4514P();
                                                if (zM4538h6 || objM4514P21 == c1823e3) {
                                                    c1739c13 = c1739c11;
                                                    objM4514P21 = new C5816a(c1739c12, 1);
                                                    c1836h03.m4545k0(objM4514P21);
                                                } else {
                                                    c1739c13 = c1739c11;
                                                }
                                                AbstractC3241o.m6927a(AbstractC2192n.m5430g(AbstractC0996c0.m2516m(c3200a0, (InterfaceC1231l) objM4514P21), ((C0314b) c1836h03.m4542j(AbstractC0316d.f944a)).m1245o(), AbstractC0996c0.f3162b), c1836h03, 0);
                                                c1836h03.m4553p(false);
                                                Object objM4514P22 = c1836h03.m4514P();
                                                final InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a152;
                                                if (objM4514P22 == c1823e3) {
                                                    objM4514P22 = new C5829n(interfaceC1809a18, 0);
                                                    c1836h03.m4545k0(objM4514P22);
                                                }
                                                InterfaceC5853o interfaceC5853oM8889m = AbstractC4434w.m8889m(c3200a0, (InterfaceC1231l) objM4514P22);
                                                boolean zM4534f5 = c1836h03.m4534f(interfaceC1809a16);
                                                Object objM4514P23 = c1836h03.m4514P();
                                                if (zM4534f5 || objM4514P23 == c1823e3) {
                                                    objM4514P23 = new C5822g(interfaceC1809a16, 1);
                                                    c1836h03.m4545k0(objM4514P23);
                                                }
                                                InterfaceC5853o interfaceC5853oM8090a = AbstractC3898h0.m8090a(interfaceC5853oM8889m, c3967n, (PointerInputEventHandler) objM4514P23);
                                                final C3999d0 c3999d03 = c3999d02;
                                                boolean zM4534f6 = c1836h03.m4534f(null) | c1836h03.m4534f(c3999d03);
                                                final float f14 = f3;
                                                boolean zM4528c = zM4534f6 | c1836h03.m4528c(f14);
                                                final C4063y c4063y2 = c4063y;
                                                boolean zM4534f7 = zM4528c | c1836h03.m4534f(c4063y2);
                                                final EnumC4010g0 enumC4010g03 = enumC4010g0;
                                                boolean zM4530d3 = zM4534f7 | c1836h03.m4530d(enumC4010g03.ordinal());
                                                Object objM4514P24 = c1836h03.m4514P();
                                                if (zM4530d3 || objM4514P24 == c1823e3) {
                                                    final InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a13;
                                                    objM4514P24 = new InterfaceC1236q() { // from class: xh.o
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                        @Override // p085fg.InterfaceC1236q
                                                        /* JADX INFO: renamed from: b */
                                                        public final Object mo734b(Object obj3, Object obj4, Object obj5) {
                                                            InterfaceC4418p0 interfaceC4418p0 = (InterfaceC4418p0) obj3;
                                                            InterfaceC4409m0 interfaceC4409m0 = (InterfaceC4409m0) obj4;
                                                            C4231a c4231a = (C4231a) obj5;
                                                            interfaceC4418p0.getClass();
                                                            interfaceC4409m0.getClass();
                                                            C3999d0 c3999d04 = c3999d03;
                                                            C4241k c4241k7 = c3999d04.f13087a;
                                                            C4241k c4241k8 = c3999d04.f13088b;
                                                            int iM8532a2 = (c4241k7.m8532a() - c4241k8.f13915b) - c4241k8.f13917d;
                                                            int iMo1590G0 = interfaceC4418p0.mo1590G0(50);
                                                            if (iM8532a2 < iMo1590G0) {
                                                                iM8532a2 = iMo1590G0;
                                                            }
                                                            float f15 = 50;
                                                            int iMo1590G02 = interfaceC4418p0.mo1590G0(f15);
                                                            long j18 = c4231a.f13903a;
                                                            int iMo1590G03 = iMo1590G02 <= C4231a.m8503g(j18) ? interfaceC4418p0.mo1590G0(f15) : C4231a.m8503g(j18);
                                                            int iM8504h = C4231a.m8504h(j18);
                                                            int iMo1590G04 = interfaceC4418p0.mo1590G0(f14);
                                                            int iM8504h2 = C4231a.m8504h(j18);
                                                            if (iMo1590G04 > iM8504h2) {
                                                                iMo1590G04 = iM8504h2;
                                                            }
                                                            if (iM8504h < iMo1590G04 || iM8532a2 < iMo1590G03 || iMo1590G04 < 0 || iMo1590G03 < 0) {
                                                                AbstractC4239i.m8525a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
                                                            }
                                                            AbstractC4377b1 abstractC4377b1Mo8831Q = interfaceC4409m0.mo8831Q(AbstractC4232b.m8515h(iMo1590G04, iM8504h, iMo1590G03, iM8532a2));
                                                            long jM8258a2 = c4063y2.m8258a((C4241k) interfaceC1809a19.getValue(), c4241k7, interfaceC4418p0.getLayoutDirection(), (((long) abstractC4377b1Mo8831Q.f14593g) << 32) | (((long) abstractC4377b1Mo8831Q.f14594h) & 4294967295L), c4241k8, enumC4010g03);
                                                            InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a18;
                                                            return interfaceC4418p0.mo8010z(C4231a.m8504h(j18), C4231a.m8503g(j18), C4174u.f13711g, new C0893s0(abstractC4377b1Mo8831Q, (((long) (((int) (jM8258a2 & 4294967295L)) - ((int) Float.intBitsToFloat((int) (((C0807b) interfaceC1809a110.getValue()).f2414a & 4294967295L))))) & 4294967295L) | (((long) (((int) (jM8258a2 >> 32)) - ((int) Float.intBitsToFloat((int) (((C0807b) interfaceC1809a110.getValue()).f2414a >> 32))))) << 32), 4));
                                                        }
                                                    };
                                                    c3999d022 = c3999d03;
                                                    c1836h03.m4545k0(objM4514P24);
                                                } else {
                                                    c3999d022 = c3999d03;
                                                }
                                                InterfaceC5853o interfaceC5853oM8887k = AbstractC4434w.m8887k(interfaceC5853oM8090a, (InterfaceC1236q) objM4514P24);
                                                InterfaceC4412n0 interfaceC4412n0M6930d2 = AbstractC3241o.m6930d(c5845g, false);
                                                int iHashCode2 = Long.hashCode(c1836h03.f6095T);
                                                C3878h c3878hM4546l2 = c1836h03.m4546l();
                                                InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h03, interfaceC5853oM8887k);
                                                c1836h03.m4531d0();
                                                if (c1836h03.f6094S) {
                                                    c1836h03.m4544k(c5660y);
                                                } else {
                                                    c1836h03.m4551n0();
                                                }
                                                AbstractC1874r.m4615A(c5597e, c1836h03, interfaceC4412n0M6930d2);
                                                AbstractC1874r.m4615A(c5597e2, c1836h03, c3878hM4546l2);
                                                AbstractC1874r.m4638t(c1836h03, Integer.valueOf(iHashCode2), c5597e3);
                                                AbstractC1874r.m4641w(c5593d, c1836h03);
                                                AbstractC1874r.m4615A(c5597e4, c1836h03, interfaceC5853oM10543c2);
                                                InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a14;
                                                long j18 = ((C4242l) interfaceC1809a110.getValue()).f13918a;
                                                Object objM4514P25 = c1836h03.m4514P();
                                                if (objM4514P25 == c1823e3) {
                                                    objM4514P25 = new C5086lp(interfaceC1809a110, 28);
                                                    c1836h03.m4545k0(objM4514P25);
                                                }
                                                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P25;
                                                boolean zM4538h7 = c1836h03.m4538h(c1739c10);
                                                Object objM4514P26 = c1836h03.m4514P();
                                                if (zM4538h7 || objM4514P26 == c1823e3) {
                                                    final int i32 = 0;
                                                    objM4514P26 = new InterfaceC1220a() { // from class: xh.k
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                        @Override // p085fg.InterfaceC1220a
                                                        public final Object invoke() {
                                                            float fFloatValue;
                                                            switch (i32) {
                                                                case 0:
                                                                    fFloatValue = ((Number) c1739c10.m4360d()).floatValue();
                                                                    break;
                                                                default:
                                                                    fFloatValue = ((Number) c1739c10.m4360d()).floatValue();
                                                                    break;
                                                            }
                                                            return Float.valueOf(fFloatValue);
                                                        }
                                                    };
                                                    c1836h03.m4545k0(objM4514P26);
                                                }
                                                InterfaceC1220a interfaceC1220a5 = (InterfaceC1220a) objM4514P26;
                                                final C1739c c1739c17 = c1739c13;
                                                boolean zM4538h8 = c1836h03.m4538h(c1739c17);
                                                Object objM4514P27 = c1836h03.m4514P();
                                                if (zM4538h8 || objM4514P27 == c1823e3) {
                                                    final int i33 = 1;
                                                    objM4514P27 = new InterfaceC1220a() { // from class: xh.k
                                                        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                                        @Override // p085fg.InterfaceC1220a
                                                        public final Object invoke() {
                                                            float fFloatValue;
                                                            switch (i33) {
                                                                case 0:
                                                                    fFloatValue = ((Number) c1739c17.m4360d()).floatValue();
                                                                    break;
                                                                default:
                                                                    fFloatValue = ((Number) c1739c17.m4360d()).floatValue();
                                                                    break;
                                                            }
                                                            return Float.valueOf(fFloatValue);
                                                        }
                                                    };
                                                    c1836h03.m4545k0(objM4514P27);
                                                }
                                                AbstractC4045s.m8244h(j18, interfaceC1231l, interfaceC1220a5, (InterfaceC1220a) objM4514P27, c3999d022.f13091e, c3999d022.f13090d, null, AbstractC3879i.m8071e(1949680412, new C5827l(interfaceC1809a16, c3874d2, 0), c1836h03), c1836h03, 12582960);
                                                c1836h03.m4553p(true);
                                                c1836h03.m4553p(true);
                                                return c3967n;
                                            }
                                        }, c1836h02), c1836h02, Integer.valueOf(((i16 << 3) & 896) | 48));
                                    }
                                }
                            }
                        } else {
                            long j1622 = j12;
                            zM4532e4 = zM4532e52 | ((i28 > 32 && c1836h02.m4534f(c4063y)) || (i11 & 48) == 32) | c1836h02.m4532e(j1622) | c1836h02.m4534f(c4007f0) | c1836h02.m4532e(j5);
                            objM4514P5 = c1836h02.m4514P();
                            if (zM4532e4) {
                            }
                        }
                    } else {
                        boolean zM4532e522 = c1836h02.m4532e(j11) | ((i13 <= 4 && c1836h02.m4530d(enumC4010g0.ordinal())) || (i11 & 6) == 4) | c1836h02.m4530d(enumC4243m2.ordinal()) | c1836h02.m4534f(c4241k2) | c1836h02.m4534f(c4241k3) | c1836h02.m4534f(c4241k6);
                    }
                }
            } else {
                i11 = i19;
            }
            z10 = true;
            z11 = zM4530d2 | z10;
            objM4514P = c1836h02.m4514P();
            if (z11) {
                i12 = i23;
                j3 = j13;
                objM4514P = new C4241k(interfaceC4233c.mo1590G0(c4063y.m8259b().mo6925d(enumC4243m3)), interfaceC4233c.mo1590G0(c4063y.m8259b().f10418b), interfaceC4233c.mo1590G0(c4063y.m8259b().mo6923b(enumC4243m3)), interfaceC4233c.mo1590G0(c4063y.m8259b().f10420d));
                c1836h02.m4545k0(objM4514P);
                c4241k = (C4241k) objM4514P;
                c5944v1 = (C5944v1) interfaceC5917o2;
                if (c5944v1.f24165b == null) {
                }
                C1845j1 c1845j12 = c5944v1.f24165b;
                c1845j12.getClass();
                j4 = ((C5896j1) c1845j12.getValue()).f23960a;
                zM4530d = c1836h02.m4530d(enumC4243m3.ordinal()) | c1836h02.m4534f(interfaceC4233c) | c1836h02.m4534f(c3202b) | c1836h02.m4534f(c3202b2) | c1836h02.m4534f(c3202b3) | c1836h02.m4534f(c3202b4) | c1836h02.m4532e(j4);
                objM4514P2 = c1836h02.m4514P();
                if (zM4530d) {
                    int i242 = c3202b.m6858e().f445a;
                    int i252 = c3202b2.m6858e().f446b;
                    int i262 = ((int) (j4 >> 32)) - c3202b.m6858e().f447c;
                    enumC4243m = enumC4243m3;
                    objM4514P2 = new C4241k(i242, i252, i262, (((int) (j4 & 4294967295L)) - c3202b3.m6858e().f448d) - c3202b4.m6858e().f448d);
                    c1836h02.m4545k0(objM4514P2);
                    C4241k c4241k62 = (C4241k) objM4514P2;
                    i13 = (i11 & 14) ^ 6;
                    if (i13 <= 4) {
                        zM4534f = c1836h02.m4534f(c4241k) | ((i13 <= 4 && c1836h02.m4530d(enumC4010g02.ordinal())) || (i11 & 6) == 4) | c1836h02.m4534f(c4241k5) | c1836h02.m4530d(enumC4243m.ordinal()) | c1836h02.m4532e(j4);
                        objM4514P3 = c1836h02.m4514P();
                        if (zM4534f) {
                            int iOrdinal4 = AbstractC4045s.m8255s(enumC4010g02, enumC4243m).ordinal();
                            if (iOrdinal4 != 1) {
                                int iOrdinal22 = AbstractC4045s.m8255s(enumC4010g02, enumC4243m).ordinal();
                                if (iOrdinal22 != 4) {
                                    j5 = j4;
                                    objM4514P3 = new C1032u0(AbstractC4045s.m8256t(i27 / ((int) (j5 >> 32)), ((iOrdinal22 != 4 || iOrdinal22 == 5) ? i20 - c4241k.f13917d : c4241k5.f13917d + c4241k.f13917d) / ((int) (j5 & 4294967295L))));
                                    c1836h02.m4545k0(objM4514P3);
                                    long j142 = ((C1032u0) objM4514P3).f3256a;
                                    j10 = j3;
                                    if (i13 <= 4) {
                                        int i282 = i12;
                                        if (i282 > 32) {
                                            zM4532e = c1836h02.m4532e(j10) | c1836h02.m4534f(c4241k62) | c1836h02.m4534f(c4241k5) | ((i13 <= 4 && c1836h02.m4530d(enumC4010g02.ordinal())) || (i11 & 6) == 4) | c1836h02.m4530d(enumC4243m.ordinal()) | c1836h02.m4534f(c4241k) | ((i282 > 32 && c1836h02.m4534f(c4063y)) || (i11 & 48) == 32);
                                            Object objM4514P172 = c1836h02.m4514P();
                                            if (zM4532e) {
                                                if (C4242l.m8534a(j10, 0L)) {
                                                }
                                                c4240j = new C4240j(jM8258a);
                                                c1836h02 = c1836h0;
                                                c1836h02.m4545k0(c4240j);
                                                long j152 = ((C4240j) c4240j).f13912a;
                                                zM4532e2 = c1836h02.m4532e(j11) | c1836h02.m4534f(c4241k62) | c1836h02.m4534f(c4241k5);
                                                if (i13 > 4) {
                                                    z12 = zM4532e2;
                                                    if ((i11 & 6) != 4) {
                                                        z13 = true;
                                                    }
                                                    zM4532e3 = z12 | z13 | c1836h02.m4532e(j152) | c1836h02.m4530d(enumC4243m.ordinal());
                                                    objM4514P4 = c1836h02.m4514P();
                                                    if (zM4532e3) {
                                                    }
                                                }
                                            }
                                        } else {
                                            zM4532e = c1836h02.m4532e(j10) | c1836h02.m4534f(c4241k62) | c1836h02.m4534f(c4241k5) | ((i13 <= 4 && c1836h02.m4530d(enumC4010g02.ordinal())) || (i11 & 6) == 4) | c1836h02.m4530d(enumC4243m.ordinal()) | c1836h02.m4534f(c4241k) | ((i282 > 32 && c1836h02.m4534f(c4063y)) || (i11 & 48) == 32);
                                            Object objM4514P1722 = c1836h02.m4514P();
                                            if (zM4532e) {
                                            }
                                        }
                                    } else {
                                        int i2822 = i12;
                                    }
                                }
                            }
                        }
                    } else {
                        zM4534f = c1836h02.m4534f(c4241k) | ((i13 <= 4 && c1836h02.m4530d(enumC4010g02.ordinal())) || (i11 & 6) == 4) | c1836h02.m4534f(c4241k5) | c1836h02.m4530d(enumC4243m.ordinal()) | c1836h02.m4532e(j4);
                        objM4514P3 = c1836h02.m4514P();
                        if (zM4534f) {
                        }
                    }
                }
            }
        } else {
            c3874d3 = c3874d;
            c1836h02.m4519V();
        }
        C1876r1 c1876r1M4557t3 = c1836h02.m4557t();
        if (c1876r1M4557t3 != null) {
            final int i32 = 2;
            c1876r1M4557t3.f6241d = new InterfaceC1235p() { // from class: xh.j
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj, Object obj2) {
                    switch (i32) {
                        case 0:
                            ((Integer) obj2).getClass();
                            AbstractC2043a.m5021a(z9, c3874d3, c4063y, enumC4010g0, interfaceC1220a, interfaceC1220a2, f3, c3874d2, (C1836h0) obj, AbstractC1874r.m4617C(i9 | 1));
                            break;
                        case 1:
                            ((Integer) obj2).getClass();
                            AbstractC2043a.m5021a(z9, c3874d3, c4063y, enumC4010g0, interfaceC1220a, interfaceC1220a2, f3, c3874d2, (C1836h0) obj, AbstractC1874r.m4617C(i9 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            AbstractC2043a.m5021a(z9, c3874d3, c4063y, enumC4010g0, interfaceC1220a, interfaceC1220a2, f3, c3874d2, (C1836h0) obj, AbstractC1874r.m4617C(i9 | 1));
                            break;
                    }
                    return C3967n.f12976a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a0 */
    public static C4115b m5022a0(C4453d0 c4453d0, C1607u c1607u, boolean z9) {
        C1594h c1594h = (C1594h) c1607u.m4125o("InnerClasses");
        if (c1594h != null) {
            C1607u c1607u2 = c1594h.f5266b;
            int length = c1607u2.f24601h.length;
            ArrayList arrayList = new ArrayList();
            C1606t c1606t = null;
            for (int i9 = 0; i9 < length; i9++) {
                C1606t c1606t2 = (C1606t) c1607u2.m10840l(i9);
                C4453d0 c4453d02 = c1606t2.f5276a;
                if (c4453d02.equals(c4453d0)) {
                    c1606t = c1606t2;
                } else if (c4453d0.equals(c1606t2.f5277b)) {
                    arrayList.add(c4453d02.f14784g);
                }
            }
            int size = arrayList.size();
            if (c1606t != null || size != 0) {
                C4115b c4115b = new C4115b();
                if (c1606t != null) {
                    AbstractC4446a abstractC4446a = c1606t.f5278c;
                    int i10 = c1606t.f5279d;
                    C4114a c4114a = new C4114a(AbstractC3665d.f11908d, 3);
                    if (abstractC4446a == null) {
                        abstractC4446a = C4469r.f14816g;
                    }
                    c4114a.m8311n(new C4117d(AbstractC3665d.f11914j, abstractC4446a));
                    c4114a.m8311n(new C4117d(AbstractC3665d.f11913i, C4466o.m8909o(i10)));
                    c4114a.f24613g = false;
                    c4115b.m8313l(c4114a);
                    if (z9) {
                        C4453d0 c4453d03 = c1606t.f5277b;
                        if (c4453d03 == null) {
                            throw new C6098l("Ignoring InnerClasses attribute for an anonymous inner class\n(" + c4453d0.f14784g.mo4901a() + ") that doesn't come with an\nassociated EnclosingMethod attribute. This class was probably produced by a\ncompiler that did not target the modern .class file format. The recommended\nsolution is to recompile the class from source, using an up-to-date compiler\nand without specifying any \"-target\" type options. The consequence of ignoring\nthis warning is that reflective operations on this class will incorrectly\nindicate that it is *not* an inner class.");
                        }
                        C4114a c4114a2 = new C4114a(AbstractC3665d.f11906b, 3);
                        c4114a2.m8311n(new C4117d(AbstractC3665d.f11915k, c4453d03));
                        c4114a2.f24613g = false;
                        c4115b.m8313l(c4114a2);
                    }
                }
                if (size != 0) {
                    C4682b c4682b = new C4682b(size);
                    for (int i11 = 0; i11 < size; i11++) {
                        c4682b.m10841m(i11, (C4683c) arrayList.get(i11));
                    }
                    c4682b.f24613g = false;
                    C4452d c4452dM7647a = AbstractC3665d.m7647a(c4682b);
                    C4114a c4114a3 = new C4114a(AbstractC3665d.f11909e, 3);
                    c4114a3.m8311n(new C4117d(AbstractC3665d.f11915k, c4452dM7647a));
                    c4114a3.f24613g = false;
                    c4115b.m8313l(c4114a3);
                }
                c4115b.f24613g = false;
                return c4115b;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final void m5023b(C0314b c0314b, C0324l c0324l, boolean z9, C3874d c3874d, C1836h0 c1836h0, int i9) {
        int i10;
        int i11;
        C3874d c3874d2;
        C1836h0 c1836h02;
        C0324l c0324l2;
        boolean z10;
        C0324l c0324l3;
        C1845j1 c1845j1;
        C0324l c0324l4;
        C1845j1 c1845j12 = c0314b.f891B;
        C1845j1 c1845j13 = c0314b.f890A;
        C1845j1 c1845j14 = c0314b.f942z;
        C1845j1 c1845j15 = c0314b.f941y;
        C1845j1 c1845j16 = c0314b.f940x;
        C1845j1 c1845j17 = c0314b.f938v;
        C1845j1 c1845j18 = c0314b.f937u;
        C1845j1 c1845j19 = c0314b.f936t;
        C1845j1 c1845j110 = c0314b.f933q;
        C1845j1 c1845j111 = c0314b.f932p;
        C1845j1 c1845j112 = c0314b.f931o;
        C1845j1 c1845j113 = c0314b.f930n;
        C1845j1 c1845j114 = c0314b.f929m;
        C1845j1 c1845j115 = c0314b.f928l;
        C1845j1 c1845j116 = c0314b.f927k;
        C1845j1 c1845j117 = c0314b.f925i;
        C1845j1 c1845j118 = c0314b.f924h;
        C1845j1 c1845j119 = c0314b.f923g;
        C1845j1 c1845j120 = c0314b.f922f;
        C1845j1 c1845j121 = c0314b.f921e;
        C1845j1 c1845j122 = c0314b.f920d;
        C1845j1 c1845j123 = c0314b.f919c;
        c1836h0.m4527b0(5539040);
        if ((i9 & 6) == 0) {
            i10 = (c1836h0.m4534f(c0314b) ? 4 : 2) | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 48) == 0) {
            i10 |= 16;
        }
        int i12 = i10 | 384;
        if ((i9 & 3072) == 0) {
            i11 = i12 | (c1836h0.m4538h(c3874d) ? Opcodes.ACC_STRICT : 1024);
        } else {
            i11 = i12;
        }
        boolean z11 = true;
        if (c1836h0.m4516S(i11 & 1, (i11 & 1171) != 1170)) {
            c1836h0.m4521X();
            if ((i9 & 1) == 0 || c1836h0.m4500B()) {
                c0324l3 = (C0324l) c1836h0.m4542j(AbstractC0325m.f972a);
            } else {
                c1836h0.m4519V();
                c0324l3 = c0324l;
                z11 = z9;
            }
            c1836h0.m4554q();
            Object objM4514P = c1836h0.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (objM4514P == c1823e) {
                c1845j1 = c1845j113;
                objM4514P = new C0314b(c0314b.m1240j(), c0314b.m1235e(), ((C1034w) c1845j123.getValue()).f3265a, ((C1034w) c1845j122.getValue()).f3265a, ((C1034w) c1845j121.getValue()).f3265a, ((C1034w) c1845j120.getValue()).f3265a, ((C1034w) c1845j119.getValue()).f3265a, ((C1034w) c1845j118.getValue()).f3265a, ((C1034w) c1845j117.getValue()).f3265a, c0314b.m1232b(), ((C1034w) c1845j116.getValue()).f3265a, ((C1034w) c1845j115.getValue()).f3265a, ((C1034w) c1845j114.getValue()).f3265a, ((C1034w) c1845j1.getValue()).f3265a, ((C1034w) c1845j112.getValue()).f3265a, ((C1034w) c1845j111.getValue()).f3265a, ((C1034w) c1845j110.getValue()).f3265a, c0314b.m1241k(), c0314b.m1236f(), ((C1034w) c1845j19.getValue()).f3265a, ((C1034w) c1845j18.getValue()).f3265a, ((C1034w) c1845j17.getValue()).f3265a, c0314b.m1233c(), ((C1034w) c1845j16.getValue()).f3265a, ((C1034w) c1845j15.getValue()).f3265a, ((C1034w) c1845j14.getValue()).f3265a, ((C1034w) c1845j13.getValue()).f3265a, ((C1034w) c1845j12.getValue()).f3265a, ((C1034w) c0314b.f892C.getValue()).f3265a, ((C1034w) c0314b.f893D.getValue()).f3265a, c0314b.m1231a(), c0314b.m1234d(), ((C1034w) c0314b.f896G.getValue()).f3265a, c0314b.m1242l(), c0314b.m1237g(), c0314b.m1244n(), ((C1034w) c0314b.f900K.getValue()).f3265a, c0314b.m1238h(), ((C1034w) c0314b.f902M.getValue()).f3265a, ((C1034w) c0314b.f903N.getValue()).f3265a, c0314b.m1243m(), ((C1034w) c0314b.f905P.getValue()).f3265a, ((C1034w) c0314b.f906Q.getValue()).f3265a, ((C1034w) c0314b.f907R.getValue()).f3265a, ((C1034w) c0314b.f908S.getValue()).f3265a, ((C1034w) c0314b.f909T.getValue()).f3265a, ((C1034w) c0314b.f910U.getValue()).f3265a, c0314b.m1239i(), ((C1034w) c0314b.f912W.getValue()).f3265a, c0314b.m1245o(), ((C1034w) c0314b.f914Y.getValue()).f3265a, ((C1034w) c0314b.f915Z.getValue()).f3265a, ((C1034w) c0314b.f917a0.getValue()).f3265a);
                c1836h0.m4545k0(objM4514P);
            } else {
                c1845j1 = c1845j113;
            }
            C0314b c0314b2 = (C0314b) objM4514P;
            C1858m2 c1858m2 = AbstractC0316d.f944a;
            c0314b2.getClass();
            C0324l c0324l5 = c0324l3;
            c0314b2.f916a.setValue(new C1034w(c0314b.m1240j()));
            c0314b2.f925i.setValue(new C1034w(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(c0314b.m1235e(), c0314b2.f918b, c1845j123)).f3265a, c0314b2.f919c, c1845j122)).f3265a, c0314b2.f920d, c1845j121)).f3265a, c0314b2.f921e, c1845j120)).f3265a, c0314b2.f922f, c1845j119)).f3265a, c0314b2.f923g, c1845j118)).f3265a, c0314b2.f924h, c1845j117)).f3265a));
            c0314b2.f933q.setValue(new C1034w(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(c0314b.m1232b(), c0314b2.f926j, c1845j116)).f3265a, c0314b2.f927k, c1845j115)).f3265a, c0314b2.f928l, c1845j114)).f3265a, c0314b2.f929m, c1845j1)).f3265a, c0314b2.f930n, c1845j112)).f3265a, c0314b2.f931o, c1845j111)).f3265a, c0314b2.f932p, c1845j110)).f3265a));
            c0314b2.f934r.setValue(new C1034w(c0314b.m1241k()));
            c0314b2.f938v.setValue(new C1034w(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(c0314b.m1236f(), c0314b2.f935s, c1845j19)).f3265a, c0314b2.f936t, c1845j18)).f3265a, c0314b2.f937u, c1845j17)).f3265a));
            c0314b2.f891B.setValue(new C1034w(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(((C1034w) AbstractC0255e.m1016e(c0314b.m1233c(), c0314b2.f939w, c1845j16)).f3265a, c0314b2.f940x, c1845j15)).f3265a, c0314b2.f941y, c1845j14)).f3265a, c0314b2.f942z, c1845j13)).f3265a, c0314b2.f890A, c1845j12)).f3265a));
            c0314b2.f892C.setValue(new C1034w(((C1034w) c0314b.f892C.getValue()).f3265a));
            c0314b2.f893D.setValue(new C1034w(((C1034w) c0314b.f893D.getValue()).f3265a));
            c0314b2.f894E.setValue(new C1034w(c0314b.m1231a()));
            c0314b2.f895F.setValue(new C1034w(c0314b.m1234d()));
            c0314b2.f896G.setValue(new C1034w(((C1034w) c0314b.f896G.getValue()).f3265a));
            c0314b2.f897H.setValue(new C1034w(c0314b.m1242l()));
            c0314b2.f898I.setValue(new C1034w(c0314b.m1237g()));
            c0314b2.f899J.setValue(new C1034w(c0314b.m1244n()));
            c0314b2.f900K.setValue(new C1034w(((C1034w) c0314b.f900K.getValue()).f3265a));
            c0314b2.f901L.setValue(new C1034w(c0314b.m1238h()));
            c0314b2.f902M.setValue(new C1034w(((C1034w) c0314b.f902M.getValue()).f3265a));
            c0314b2.f903N.setValue(new C1034w(((C1034w) c0314b.f903N.getValue()).f3265a));
            c0314b2.f904O.setValue(new C1034w(c0314b.m1243m()));
            c0314b2.f905P.setValue(new C1034w(((C1034w) c0314b.f905P.getValue()).f3265a));
            c0314b2.f906Q.setValue(new C1034w(((C1034w) c0314b.f906Q.getValue()).f3265a));
            c0314b2.f907R.setValue(new C1034w(((C1034w) c0314b.f907R.getValue()).f3265a));
            c0314b2.f908S.setValue(new C1034w(((C1034w) c0314b.f908S.getValue()).f3265a));
            c0314b2.f909T.setValue(new C1034w(((C1034w) c0314b.f909T.getValue()).f3265a));
            c0314b2.f910U.setValue(new C1034w(((C1034w) c0314b.f910U.getValue()).f3265a));
            c0314b2.f911V.setValue(new C1034w(c0314b.m1239i()));
            c0314b2.f912W.setValue(new C1034w(((C1034w) c0314b.f912W.getValue()).f3265a));
            c0314b2.f913X.setValue(new C1034w(c0314b.m1245o()));
            c0314b2.f914Y.setValue(new C1034w(((C1034w) c0314b.f914Y.getValue()).f3265a));
            c0314b2.f915Z.setValue(new C1034w(((C1034w) c0314b.f915Z.getValue()).f3265a));
            c0314b2.f917a0.setValue(new C1034w(((C1034w) c0314b.f917a0.getValue()).f3265a));
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == c1823e) {
                c0324l4 = c0324l5;
                C1941n0 c1941n0 = (C1941n0) c0324l4.f958a.getValue();
                C1941n0 c1941n02 = (C1941n0) c0324l4.f959b.getValue();
                C1941n0 c1941n03 = (C1941n0) c0324l4.f960c.getValue();
                C1941n0 c1941n04 = (C1941n0) c0324l4.f961d.getValue();
                C1941n0 c1941n05 = (C1941n0) c0324l4.f962e.getValue();
                C1941n0 c1941n06 = (C1941n0) c0324l4.f963f.getValue();
                C1941n0 c1941n07 = (C1941n0) c0324l4.f964g.getValue();
                C1941n0 c1941n08 = (C1941n0) c0324l4.f965h.getValue();
                C1941n0 c1941n09 = (C1941n0) c0324l4.f966i.getValue();
                C1941n0 c1941n010 = (C1941n0) c0324l4.f967j.getValue();
                C1941n0 c1941n011 = (C1941n0) c0324l4.f968k.getValue();
                C1941n0 c1941n012 = (C1941n0) c0324l4.f969l.getValue();
                C1941n0 c1941n013 = (C1941n0) c0324l4.f970m.getValue();
                C1941n0 c1941n014 = (C1941n0) c0324l4.f971n.getValue();
                c1941n0.getClass();
                c1941n02.getClass();
                c1941n03.getClass();
                c1941n04.getClass();
                c1941n05.getClass();
                c1941n06.getClass();
                c1941n07.getClass();
                c1941n08.getClass();
                c1941n09.getClass();
                c1941n010.getClass();
                c1941n011.getClass();
                c1941n012.getClass();
                c1941n013.getClass();
                c1941n014.getClass();
                c1836h02 = c1836h0;
                objM4514P2 = new C0324l(c1941n0, c1941n02, c1941n03, c1941n04, c1941n05, c1941n06, c1941n07, c1941n08, c1941n09, c1941n010, c1941n011, c1941n012, c1941n013, c1941n014);
                c1836h02.m4545k0(objM4514P2);
            } else {
                c0324l4 = c0324l5;
                c1836h02 = c1836h0;
            }
            C0324l c0324l6 = (C0324l) objM4514P2;
            C1858m2 c1858m22 = AbstractC0325m.f972a;
            c0324l6.getClass();
            c0324l4.getClass();
            C1941n0 c1941n015 = (C1941n0) c0324l4.f958a.getValue();
            c1941n015.getClass();
            c0324l6.f958a.setValue(c1941n015);
            C1941n0 c1941n016 = (C1941n0) c0324l4.f959b.getValue();
            c1941n016.getClass();
            c0324l6.f959b.setValue(c1941n016);
            C1941n0 c1941n017 = (C1941n0) c0324l4.f960c.getValue();
            c1941n017.getClass();
            c0324l6.f960c.setValue(c1941n017);
            C1941n0 c1941n018 = (C1941n0) c0324l4.f961d.getValue();
            c1941n018.getClass();
            c0324l6.f961d.setValue(c1941n018);
            C1941n0 c1941n019 = (C1941n0) c0324l4.f962e.getValue();
            c1941n019.getClass();
            c0324l6.f962e.setValue(c1941n019);
            C1941n0 c1941n020 = (C1941n0) c0324l4.f963f.getValue();
            c1941n020.getClass();
            c0324l6.f963f.setValue(c1941n020);
            C1941n0 c1941n021 = (C1941n0) c0324l4.f964g.getValue();
            c1941n021.getClass();
            c0324l6.f964g.setValue(c1941n021);
            C1941n0 c1941n022 = (C1941n0) c0324l4.f965h.getValue();
            c1941n022.getClass();
            c0324l6.f965h.setValue(c1941n022);
            C1941n0 c1941n023 = (C1941n0) c0324l4.f966i.getValue();
            c1941n023.getClass();
            c0324l6.f966i.setValue(c1941n023);
            C1941n0 c1941n024 = (C1941n0) c0324l4.f967j.getValue();
            c1941n024.getClass();
            c0324l6.f967j.setValue(c1941n024);
            C1941n0 c1941n025 = (C1941n0) c0324l4.f968k.getValue();
            c1941n025.getClass();
            c0324l6.f968k.setValue(c1941n025);
            C1941n0 c1941n026 = (C1941n0) c0324l4.f969l.getValue();
            c1941n026.getClass();
            c0324l6.f969l.setValue(c1941n026);
            C1941n0 c1941n027 = (C1941n0) c0324l4.f970m.getValue();
            c1941n027.getClass();
            c0324l6.f970m.setValue(c1941n027);
            C1941n0 c1941n028 = (C1941n0) c0324l4.f971n.getValue();
            c1941n028.getClass();
            c0324l6.f971n.setValue(c1941n028);
            boolean zM4532e = c1836h02.m4532e(c0314b2.m1234d());
            Object objM4514P3 = c1836h02.m4514P();
            if (zM4532e || objM4514P3 == c1823e) {
                objM4514P3 = new C0593l(c0314b2.m1234d());
                c1836h02.m4545k0(objM4514P3);
            }
            C1873q1[] c1873q1Arr = {AbstractC0316d.f944a.mo4582a(c0314b2), AbstractC0325m.f972a.mo4582a(c0324l6), AbstractC2217v0.f7345a.mo4582a((C0593l) objM4514P3), AbstractC2191m1.f7270a.mo4582a(C0608t.f1912a), AbstractC0323k.f957a.mo4582a(Boolean.valueOf(z11))};
            c3874d2 = c3874d;
            AbstractC1874r.m4620b(c1873q1Arr, AbstractC3879i.m8071e(-1475504096, new C0321i(c3874d2, 0), c1836h02), c1836h02, 56);
            c0324l2 = c0324l4;
            z10 = z11;
        } else {
            c3874d2 = c3874d;
            c1836h02 = c1836h0;
            c1836h02.m4519V();
            c0324l2 = c0324l;
            z10 = z9;
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new C0322j(i9, 0, c0314b, c0324l2, c3874d2, z10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b0 */
    public static final boolean m5024b0(Throwable th2, InterfaceC1220a interfaceC1220a) {
        List listAsList;
        Object objInvoke;
        th2.getClass();
        Integer num = AbstractC0311a.f888a;
        C5576f c5576f = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th2.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = AbstractC0085a.f251b;
            if (method == null || (objInvoke = method.invoke(th2, null)) == null) {
                listAsList = C4173t.f13710g;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z9 = false;
        for (int i9 = 0; i9 < size; i9++) {
            if (((Throwable) listAsList.get(i9)) instanceof C5576f) {
                return false;
            }
        }
        try {
            C5571a c5571a = (C5571a) interfaceC1220a.invoke();
            if (c5571a != null) {
                boolean z10 = c5571a.f22697b;
                List list = c5571a.f22696a;
                if (z10) {
                    int size2 = list.size();
                    for (int i10 = 0; i10 < size2; i10++) {
                        ((C5572b) list.get(i10)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z9 = true;
                }
            }
            if (z9) {
                c5571a.getClass();
                c5576f = new C5576f(c5571a);
            }
        } catch (Throwable th3) {
            c5576f = th3;
        }
        if (c5576f != null) {
            AbstractC0063p.m412e(th2, c5576f);
        }
        return z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final boolean m5025c(Method method) {
        Class<?>[] parameterTypes = method.getParameterTypes();
        return !Modifier.isAbstract(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && AbstractC1416l.m3825a(method.getName(), "onLocationChanged") && AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && parameterTypes.length == 3 && AbstractC3149m.m6709h0(parameterTypes[0].getName(), "TencentLocation", false) && AbstractC1416l.m3825a(parameterTypes[1], Integer.TYPE) && AbstractC1416l.m3825a(parameterTypes[2], String.class);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public static int m5026c0(int i9) {
        int i10 = i9 >> 7;
        int i11 = 0;
        while (i10 != 0) {
            i10 >>= 7;
            i11++;
        }
        return i11 + 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final C4292c m5027d(C4298i c4298i, String str, C4292c c4292c) {
        boolean z9;
        boolean z10;
        String str2 = AbstractC3149m.m6721t0(str) ? c4298i.f14301b : str;
        boolean z11 = c4298i.f14302c;
        int i9 = c4298i.f14303d;
        long j3 = c4298i.f14304e;
        long j4 = c4298i.f14305f;
        long j5 = c4298i.f14306g;
        String str3 = c4298i.f14307h;
        int i10 = c4298i.f14308i;
        String str4 = c4298i.f14309j;
        String str5 = c4298i.f14310k;
        boolean z12 = c4298i.f14311l;
        int i11 = c4298i.f14312m;
        String str6 = c4298i.f14313n;
        int i12 = c4298i.f14314o;
        int i13 = c4298i.f14315p;
        String str7 = c4298i.f14316q;
        boolean z13 = c4298i.f14317r;
        int i14 = c4298i.f14318s;
        int i15 = c4298i.f14319t;
        boolean z14 = c4298i.f14320u;
        List list = c4298i.f14321v;
        boolean z15 = c4298i.f14322w;
        if (z15) {
            z9 = z15;
            z10 = c4298i.f14323x;
        } else {
            z9 = z15;
            z10 = c4292c.f14264v;
        }
        return new C4292c(str2, z11, i9, j3, j4, j5, str3, i10, str4, str5, z12, i11, str6, i12, i13, str7, z13, i14, i15, z14, list, z10, z9 ? c4298i.f14324y : c4292c.f14265w, z9 ? c4298i.f14325z : c4292c.f14266x, z9 ? c4298i.f14293A : c4292c.f14267y, z9 ? c4298i.f14294B : c4292c.f14268z, z9 ? c4298i.f14295C : c4292c.f14238A, z9 ? c4298i.f14296D : c4292c.f14239B, z9 ? c4298i.f14297E : c4292c.f14240C, z9 ? c4298i.f14298F : c4292c.f14241D, z9 ? c4298i.f14299G : c4292c.f14242E);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d0 */
    public static void m5028d0(ByteArrayOutputStream byteArrayOutputStream, int i9, byte[] bArr) {
        m5032f0(byteArrayOutputStream, (i9 << 3) | 2);
        m5032f0(byteArrayOutputStream, bArr == null ? 0L : bArr.length);
        if (bArr != null) {
            byteArrayOutputStream.write(bArr, 0, bArr.length);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m5029e(JSONArray jSONArray, String str, JSONArray jSONArray2) {
        JSONObject jSONObjectOptJSONObject;
        if (jSONArray2.length() == 0) {
            return;
        }
        JSONObject jSONObjectOptJSONObject2 = jSONArray.optJSONObject(jSONArray.length() - 1);
        String str2 = "parts";
        if (AbstractC1416l.m3825a(jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("role") : null, str)) {
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("content");
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("parts");
            }
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArray2.length();
                for (int i9 = 0; i9 < length; i9++) {
                    jSONArrayOptJSONArray.put(jSONArray2.opt(i9));
                }
                return;
            }
        }
        if (!str.equals("model") && (str.equals("assistant") || ((jSONObjectOptJSONObject = jSONArray2.optJSONObject(0)) != null && jSONObjectOptJSONObject.has("type")))) {
            str2 = "content";
        }
        jSONArray.put(new JSONObject().put("role", str).put(str2, jSONArray2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e0 */
    public static void m5030e0(ByteArrayOutputStream byteArrayOutputStream, int i9, Object obj) {
        int i10 = 0;
        if (obj instanceof JSONArray) {
            JSONArray jSONArray = (JSONArray) obj;
            while (i10 < jSONArray.length()) {
                m5030e0(byteArrayOutputStream, i9, jSONArray.get(i10));
                i10++;
            }
            return;
        }
        if (obj instanceof JSONObject) {
            m5028d0(byteArrayOutputStream, i9, m5043q((JSONObject) obj));
            return;
        }
        if (obj instanceof Number) {
            m5032f0(byteArrayOutputStream, i9 << 3);
            m5032f0(byteArrayOutputStream, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Boolean) {
            m5032f0(byteArrayOutputStream, i9 << 3);
            m5032f0(byteArrayOutputStream, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        if (obj == null || !obj.toString().startsWith("hex->")) {
            if (obj != null) {
                m5028d0(byteArrayOutputStream, i9, obj.toString().getBytes(StandardCharsets.UTF_8));
                return;
            }
            return;
        }
        String strReplaceAll = obj.toString().substring(5).replaceAll("[^0-9A-Fa-f]", HttpUrl.FRAGMENT_ENCODE_SET);
        int length = strReplaceAll.length() / 2;
        byte[] bArr = new byte[length];
        while (i10 < length) {
            int i11 = i10 * 2;
            bArr[i10] = (byte) Integer.parseInt(strReplaceAll.substring(i11, i11 + 2), 16);
            i10++;
        }
        m5028d0(byteArrayOutputStream, i9, bArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C3402m m5031f(C4322r c4322r, C1402a c1402a, boolean z9, ArrayList arrayList) {
        C3494d c3494d = (C3494d) ((C2958a) arrayList.get(0)).f9705h;
        String str = (String) ((C2958a) arrayList.get(1)).f9705h;
        InterfaceC2823a interfaceC2823a = (InterfaceC2823a) ((C2958a) arrayList.get(2)).f9705h;
        int size = arrayList.size();
        ArrayList arrayList2 = new ArrayList(size);
        C4309e c4309e = c4322r.f14411l;
        C4325u c4325u = c4309e.f14371k;
        arrayList2.add(AbstractC0018a.m242f(c4325u));
        for (int i9 = 1; i9 < size; i9++) {
            C2958a c2958a = (C2958a) arrayList.get(i9);
            try {
                arrayList2.add(AbstractC0018a.m251o(c4325u, c2958a));
            } catch (Exception e6) {
                c4322r.m6384M("Failed to build arg in invoke-custom insn: ".concat(String.valueOf(c2958a)), e6);
                arrayList2.add(AbstractC3508l.m7372Z(new C3393d(c2958a.toString())));
            }
        }
        if (AbstractC2091b.m5154a(c3494d.m7337b())) {
            C0086a.m452k("Field handle not yet supported");
            return null;
        }
        C4325u c4325u2 = c4309e.f14371k;
        C3403n c3403n = new C3403n(C3131d.m6659d(c4325u2, c3494d.m7336a()), AbstractC3754e0.m7916w(c3494d.m7337b()), arrayList2.size());
        arrayList2.forEach(new C0076g(c3403n, 18));
        C3402m c3402m = new C3402m(c3403n, C3131d.m6658c(c4325u2, C3128a.m6637e(c4325u2, AbstractC3506j.f11394k), str, interfaceC2823a), c1402a, z9);
        c3402m.f11003r = arrayList;
        return c3402m;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f0 */
    public static void m5032f0(ByteArrayOutputStream byteArrayOutputStream, long j3) {
        while (((-128) & j3) != 0) {
            byteArrayOutputStream.write((int) ((127 & j3) | 128));
            j3 >>>= 7;
        }
        byteArrayOutputStream.write((int) j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C3373y m5033g(Class cls, Class cls2, Method method) {
        Field fieldM5010P;
        Field fieldM5010P2;
        if (m5004J(cls, method) && cls2 != null) {
            Class cls3 = Integer.TYPE;
            cls3.getClass();
            Constructor<?> constructorFindConstructor = KavaReflector.findConstructor(cls2, String.class, cls3);
            if (constructorFindConstructor != null) {
                ArrayList arrayList = new ArrayList();
                for (Class superclass = cls2; superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                    List<Field> listDeclaredFields = KavaReflector.declaredFields(superclass);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj : listDeclaredFields) {
                        if (!Modifier.isStatic(((Field) obj).getModifiers())) {
                            arrayList2.add(obj);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList.add((Field) it.next());
                    }
                }
                Iterator it2 = arrayList.iterator();
                boolean z9 = false;
                Object obj2 = null;
                while (true) {
                    if (it2.hasNext()) {
                        Object next = it2.next();
                        if (AbstractC1416l.m3825a(((Field) next).getType(), cls2)) {
                            if (z9) {
                                break;
                            }
                            z9 = true;
                            obj2 = next;
                        }
                    } else if (!z9) {
                        break;
                    }
                }
                obj2 = null;
                Field field = (Field) obj2;
                if (field != null && (fieldM5010P = m5010P(cls2, "m", String.class)) != null && (fieldM5010P2 = m5010P(cls2, "p", cls3)) != null) {
                    Class cls4 = Long.TYPE;
                    cls4.getClass();
                    Field fieldM5010P3 = m5010P(cls2, "t", cls4);
                    if (fieldM5010P3 != null && method != null) {
                        return new C3373y(method, constructorFindConstructor, field, fieldM5010P, fieldM5010P2, fieldM5010P3);
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static String m5034h(Object obj) {
        if (obj == null || obj.equals(JSONObject.NULL)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (!(obj instanceof JSONArray)) {
            return obj.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        JSONArray jSONArray = (JSONArray) obj;
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
            if (AbstractC1416l.m3825a(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optString("type") : null, WeChatSnsPost.TYPE_TEXT)) {
                sb2.append(jSONObjectOptJSONObject.optString(WeChatSnsPost.TYPE_TEXT));
            }
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static final void m5035i(Closeable closeable, Throwable th2) {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                AbstractC0063p.m412e(th2, th3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static void m5036j(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static final C2761e m5037k(Context context) {
        C2469w c2469w = new C2469w(3);
        context.getApplicationContext();
        return new C2761e(c2469w, new C2757a(Build.VERSION.SDK_INT >= 31 ? C2768l.f9004a.m6154a(context) : 0));
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: l */
    public static Bitmap m5038l(Context context, Uri uri) throws IOException {
        ContentResolver contentResolver = context.getContentResolver();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
        if (inputStreamOpenInputStream != null) {
            try {
                BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                inputStreamOpenInputStream.close();
            } finally {
            }
        }
        if (options.outWidth > 0 && options.outHeight > 0) {
            int i9 = 1;
            while (Math.max(options.outWidth / i9, options.outHeight / i9) > 512) {
                i9 *= 2;
            }
            inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream != null) {
                try {
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = i9;
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options2);
                    inputStreamOpenInputStream.close();
                    if (bitmapDecodeStream != null) {
                        int iMax = Math.max(bitmapDecodeStream.getWidth(), bitmapDecodeStream.getHeight());
                        if (iMax <= 256) {
                            return bitmapDecodeStream;
                        }
                        float f3 = 256.0f / iMax;
                        int width = (int) (bitmapDecodeStream.getWidth() * f3);
                        if (width < 1) {
                            width = 1;
                        }
                        int height = (int) (bitmapDecodeStream.getHeight() * f3);
                        if (height < 1) {
                            height = 1;
                        }
                        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeStream, width, height, true);
                        bitmapCreateScaledBitmap.getClass();
                        if (bitmapCreateScaledBitmap != bitmapDecodeStream) {
                            bitmapDecodeStream.recycle();
                        }
                        return bitmapCreateScaledBitmap;
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m5039m(Context context, String str) {
        Object c3959f;
        Object c3959f2;
        context.getClass();
        if (str != null) {
            if (AbstractC3149m.m6721t0(str)) {
                str = null;
            }
            if (str != null) {
                File file = new File(str);
                try {
                    c3959f = new File(AbstractC4302b.m8641d(context), "FloatingShortcut/icons").getCanonicalFile();
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                File file2 = (File) c3959f;
                if (file2 != null) {
                    try {
                        c3959f2 = file.getCanonicalFile();
                    } catch (Throwable th3) {
                        c3959f2 = new C3959f(th3);
                    }
                    File file3 = (File) (c3959f2 instanceof C3959f ? null : c3959f2);
                    if (file3 == null || !AbstractC1416l.m3825a(file3.getParentFile(), file2)) {
                        return;
                    }
                    try {
                        file3.delete();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static void m5040n(File file) {
        try {
            if (file.exists()) {
                m5041o(file);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static void m5041o(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                m5041o(file2);
            }
        }
        file.delete();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static C1732q m5042p(DexKitBridge dexKitBridge, C2137a c2137a) {
        dexKitBridge.getClass();
        C2151o c2151o = new C2151o();
        int iM3645b = c2137a.m3645b(4);
        if (iM3645b != 0) {
            int iM3644a = c2137a.m3644a(iM3645b + c2137a.f4499a);
            ByteBuffer byteBuffer = c2137a.f4500b;
            byteBuffer.getClass();
            c2151o.m3646c(iM3644a, byteBuffer);
        } else {
            c2151o = null;
        }
        c2151o.getClass();
        C1727l c1727lM3208r = AbstractC1184v0.m3208r(dexKitBridge, c2151o);
        int iM3645b2 = c2137a.m3645b(6);
        byte b10 = iM3645b2 != 0 ? c2137a.f4500b.get(iM3645b2 + c2137a.f4499a) : (byte) 0;
        int i9 = 1;
        if (b10 != 1) {
            i9 = 2;
            if (b10 != 2) {
                int iM3645b3 = c2137a.m3645b(6);
                throw new IllegalArgumentException(AbstractC0921a.m2249l(iM3645b3 != 0 ? c2137a.f4500b.get(iM3645b3 + c2137a.f4499a) : (byte) 0, "Unknown using type: "));
            }
        }
        return new C1732q(c1727lM3208r, i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static byte[] m5043q(JSONObject jSONObject) throws JSONException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames == null) {
            return new byte[0];
        }
        for (int i9 = 0; i9 < jSONArrayNames.length(); i9++) {
            String string = jSONArrayNames.getString(i9);
            m5030e0(byteArrayOutputStream, Integer.parseInt(string), jSONObject.get(string));
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static JSONObject m5044r(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        String strConcat;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("error");
        if (jSONObjectOptJSONObject2 != null) {
            String strOptString = jSONObjectOptJSONObject2.optString("message");
            if (AbstractC3149m.m6721t0(strOptString)) {
                strOptString = "Gemini 请求失败";
            }
            C2104o.m5276A(strOptString);
            return null;
        }
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("promptFeedback");
        String str = HttpUrl.FRAGMENT_ENCODE_SET;
        if (jSONObjectOptJSONObject3 != null) {
            String strOptString2 = jSONObjectOptJSONObject3.optString("blockReason");
            strOptString2.getClass();
            if (!AbstractC3149m.m6721t0(strOptString2)) {
                String strOptString3 = jSONObjectOptJSONObject3.optString("blockReasonMessage");
                strOptString3.getClass();
                if (AbstractC3149m.m6721t0(strOptString3)) {
                    strOptString3 = null;
                }
                strConcat = strOptString3 != null ? " - ".concat(strOptString3) : null;
                if (strConcat != null) {
                    str = strConcat;
                }
                C2104o.m5276A(AbstractC0921a.m2251n("Gemini 已拦截请求: ", strOptString2, str));
                return null;
            }
        }
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("candidates");
        if (jSONArrayOptJSONArray == null || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) == null) {
            return null;
        }
        String strOptString4 = jSONObjectOptJSONObject.optString("finishReason");
        strOptString4.getClass();
        if (AbstractC3149m.m6721t0(strOptString4) || AbstractC4156d0.m8355W("STOP", "MAX_TOKENS").contains(strOptString4)) {
            return jSONObjectOptJSONObject;
        }
        String strOptString5 = jSONObjectOptJSONObject.optString("finishMessage");
        strOptString5.getClass();
        if (AbstractC3149m.m6721t0(strOptString5)) {
            strOptString5 = null;
        }
        strConcat = strOptString5 != null ? " - ".concat(strOptString5) : null;
        if (strConcat != null) {
            str = strConcat;
        }
        C2104o.m5276A(AbstractC0921a.m2251n("Gemini 生成失败: ", strOptString4, str));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static C4115b m5045s(C1607u c1607u) {
        C4115b c4115bM8312n;
        C4114a c4114a;
        C1599m c1599m = (C1599m) c1607u.m4125o("RuntimeVisibleAnnotations");
        C1597k c1597k = (C1597k) c1607u.m4125o("RuntimeInvisibleAnnotations");
        if (c1599m == null) {
            c4115bM8312n = c1597k == null ? C4115b.f13616i : (C4115b) c1597k.f5274d;
        } else {
            c4115bM8312n = (C4115b) c1599m.f5274d;
            if (c1597k != null) {
                C4115b c4115b = (C4115b) c1597k.f5274d;
                C4115b c4115b2 = new C4115b();
                c4115b2.m8314m(c4115bM8312n);
                c4115b2.m8314m(c4115b);
                c4115b2.f24613g = false;
                c4115bM8312n = c4115b2;
            }
        }
        C1601o c1601o = (C1601o) c1607u.m4125o("Signature");
        C4114a c4114a2 = null;
        if (c1601o == null) {
            c4114a = null;
        } else {
            C4451c0 c4451c0 = c1601o.f5269b;
            c4114a = new C4114a(AbstractC3665d.f11910f, 3);
            String str = c4451c0.f14760g;
            int length = str.length();
            ArrayList arrayList = new ArrayList(20);
            int i9 = 0;
            while (i9 < length) {
                int i10 = i9 + 1;
                if (str.charAt(i9) == 'L') {
                    while (true) {
                        if (i10 >= length) {
                            break;
                        }
                        char cCharAt = str.charAt(i10);
                        if (cCharAt == ';') {
                            i10++;
                            break;
                        }
                        if (cCharAt == '<') {
                            break;
                        }
                        i10++;
                    }
                } else {
                    while (i10 < length && str.charAt(i10) != 'L') {
                        i10++;
                    }
                }
                arrayList.add(str.substring(i9, i10));
                i9 = i10;
            }
            int size = arrayList.size();
            C4450c c4450c = new C4450c(size);
            for (int i11 = 0; i11 < size; i11++) {
                c4450c.m10841m(i11, new C4451c0((String) arrayList.get(i11)));
            }
            c4450c.f24613g = false;
            c4114a.m8311n(new C4117d(AbstractC3665d.f11915k, new C4452d(c4450c)));
            c4114a.f24613g = false;
        }
        C1602p c1602p = (C1602p) c1607u.m4125o("SourceDebugExtension");
        if (c1602p != null) {
            C4451c0 c4451c02 = c1602p.f5270b;
            c4114a2 = new C4114a(AbstractC3665d.f11911g, 3);
            c4114a2.m8311n(new C4117d(AbstractC3665d.f11915k, c4451c02));
            c4114a2.f24613g = false;
        }
        if (c4114a != null) {
            c4115bM8312n = C4115b.m8312n(c4115bM8312n, c4114a);
        }
        return c4114a2 != null ? C4115b.m8312n(c4115bM8312n, c4114a2) : c4115bM8312n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static Object m5046t(Method method, Class cls, Class cls2, HashSet hashSet) {
        Object objInvoke;
        if (cls2 == null || cls2.equals(Object.class) || !hashSet.add(cls2)) {
            return null;
        }
        Class<?>[] interfaces = cls2.getInterfaces();
        interfaces.getClass();
        for (Class<?> cls3 : interfaces) {
            cls3.getClass();
            if (!KavaReflector.isStatic(method) || (objInvoke = KavaReflector.invoke(method, null, cls3)) == null || !cls.isInstance(objInvoke)) {
                objInvoke = null;
            }
            if (objInvoke != null) {
                return objInvoke;
            }
            Object objM5046t = m5046t(method, cls, cls3, hashSet);
            if (objM5046t != null) {
                return objM5046t;
            }
        }
        return m5046t(method, cls, cls2.getSuperclass(), hashSet);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static byte[] m5047u(File file) {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) != 0) {
            C2104o.m5298x(file.getPath(), "file too large, path:");
            return null;
        }
        int i9 = (int) length;
        byte[] bArr = new byte[i9];
        m5015U(file, bArr, i9);
        return bArr;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static C3491a m5048v(C1402a c1402a) {
        if (c1402a.f4662d.f4710d != 6) {
            return null;
        }
        InterfaceC3952a interfaceC3952a = c1402a.f4672n;
        if (interfaceC3952a != null) {
            return (C3491a) interfaceC3952a;
        }
        C0058k c0058k = c1402a.f4660b;
        int i9 = c1402a.f4671m;
        C0058k c0058k2 = c1402a.f4661c;
        c0058k.m351a((i9 * 4) + ((C1219e) c0058k.f178j).f4087d.f7104h);
        c0058k.m351a(((ByteBuffer) c0058k.f177i).getInt());
        return new C3491a(AbstractC0018a.m220H(c0058k, c0058k2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static C4115b m5049w(InterfaceC2473b interfaceC2473b) {
        C4115b c4115bM5045s = m5045s(interfaceC2473b.getAttributes());
        C1593g c1593g = (C1593g) interfaceC2473b.getAttributes().m4125o("Exceptions");
        InterfaceC4685e interfaceC4685e = c1593g == null ? C4682b.f15591i : c1593g.f5265b;
        if (interfaceC4685e.size() == 0) {
            return c4115bM5045s;
        }
        C4452d c4452dM7647a = AbstractC3665d.m7647a(interfaceC4685e);
        C4114a c4114a = new C4114a(AbstractC3665d.f11912h, 3);
        c4114a.m8311n(new C4117d(AbstractC3665d.f11915k, c4452dM7647a));
        c4114a.f24613g = false;
        return C4115b.m8312n(c4115bM5045s, c4114a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static C2132h m5050x(C1402a c1402a) {
        if (c1402a.f4662d.f4710d != 5) {
            return null;
        }
        InterfaceC3952a interfaceC3952a = c1402a.f4672n;
        if (interfaceC3952a != null) {
            return (C2132h) interfaceC3952a;
        }
        C0058k c0058k = c1402a.f4660b;
        int i9 = c1402a.f4671m;
        C2132h c2132h = new C2132h();
        c2132h.f7114a = ((((C1219e) c0058k.f178j).f4084a & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 16) | (65535 & i9);
        c2132h.f7119f = i9;
        c2132h.f7120g = c0058k;
        return c2132h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static C4116c m5051y(InterfaceC2473b interfaceC2473b) {
        C1607u attributes = interfaceC2473b.getAttributes();
        C1600n c1600n = (C1600n) attributes.m4125o("RuntimeVisibleParameterAnnotations");
        C1598l c1598l = (C1598l) attributes.m4125o("RuntimeInvisibleParameterAnnotations");
        if (c1600n == null) {
            return c1598l == null ? C4116c.f13618i : (C4116c) c1598l.f5274d;
        }
        C4116c c4116c = (C4116c) c1600n.f5274d;
        if (c1598l == null) {
            return c4116c;
        }
        C4116c c4116c2 = (C4116c) c1598l.f5274d;
        C4116c c4116c3 = C4116c.f13618i;
        int length = c4116c.f24601h.length;
        if (length != c4116c2.f24601h.length) {
            C2104o.m5294t("list1.size() != list2.size()");
            return null;
        }
        C4116c c4116c4 = new C4116c(length);
        for (int i9 = 0; i9 < length; i9++) {
            C4115b c4115b = (C4115b) c4116c.m10840l(i9);
            C4115b c4115b2 = (C4115b) c4116c2.m10840l(i9);
            C4115b c4115b3 = new C4115b();
            c4115b3.m8314m(c4115b);
            c4115b3.m8314m(c4115b2);
            c4115b3.f24613g = false;
            c4115b3.m10856k();
            c4116c4.m10841m(i9, c4115b3);
        }
        c4116c4.f24613g = false;
        return c4116c4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static final C1926g m5052z(C2884s c2884s) {
        C1926g c1926g = c2884s.f9316a;
        long j3 = c2884s.f9317b;
        c1926g.getClass();
        return c1926g.subSequence(C1939m0.m4816f(j3), C1939m0.m4815e(j3));
    }
}
