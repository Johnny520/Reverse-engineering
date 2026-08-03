package p007a7;

import ac.C0058k;
import af.C0081d;
import af.C0084g;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationResponse;
import android.widget.FrameLayout;
import androidx.lifecycle.C0114s;
import androidx.lifecycle.EnumC0107l;
import bsh.org.objectweb.asm.Opcodes;
import com.alibaba.fastjson2.JSONB;
import de.robv.android.xposed.XC_MethodHook;
import de.robv.android.xposed.XposedBridge;
import gd.C1399b;
import gg.AbstractC1416l;
import gg.C1421q;
import gg.C1425u;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import mc.InterfaceC2823a;
import md.C2829f;
import md.EnumC2824a;
import me.C2833a;
import na.C2920h;
import na.C2921i;
import na.C2922j;
import nc.C2958a;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Settings;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p002a1.AbstractC0005c;
import p002a1.RunnableC0003a;
import p002a1.ViewOnAttachStateChangeListenerC0011i;
import p007a7.AbstractC0018a;
import p011ab.C0045e;
import p012ah.C0086a;
import p015b0.C0144j;
import p020b5.C0184c;
import p022b7.C0202a;
import p025bc.C0257g;
import p025bc.InterfaceC0254d;
import p036c9.C0416a1;
import p049d9.EnumC0740a;
import p068eh.AbstractC0921a;
import p069f.C0956r;
import p071f1.InterfaceC1037z;
import p072f2.AbstractC1049l;
import p072f2.C1038a;
import p072f2.C1054q;
import p072f2.C1055r;
import p081fc.C1202e;
import p082fd.C1204a;
import p082fd.CallableC1205b;
import p084ff.C1219e;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p099h.Hchat.R;
import p099h.Hchat.utils.KavaReflector;
import p109hb.C1671c;
import p117i0.AbstractC1850k2;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1833g1;
import p117i0.C1836h0;
import p117i0.C1845j1;
import p117i0.C1851l;
import p117i0.C1876r1;
import p117i0.C1892x;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1854l2;
import p119i2.C1933j0;
import p119i2.C1935k0;
import p119i2.C1942o;
import p126ia.C2028v;
import p126ia.C2029w;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p141jf.C2128d;
import p141jf.C2132h;
import p144k.AbstractC2192n;
import p144k.InterfaceC2185k1;
import p148k3.C2238a;
import p172lg.C2562b;
import p172lg.C2563c;
import p174m.C2638p;
import p174m.EnumC2640p1;
import p215od.C3128a;
import p215od.C3130c;
import p215od.C3131d;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3145i;
import p218og.C3147k;
import p222p.AbstractC3199a;
import p222p.InterfaceC3217g;
import p222p.InterfaceC3223i;
import p222p.InterfaceC3268x0;
import p233pd.C3392c;
import p233pd.C3393d;
import p233pd.C3399j;
import p233pd.C3403n;
import p233pd.EnumC3400k;
import p245qc.C3494d;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3503g;
import p246qd.C3509m;
import p246qd.C3510n;
import p249qg.InterfaceC3599t;
import p251r.C3619d;
import p251r.C3621f;
import p251r.C3622g;
import p251r.C3627l;
import p251r.C3630o;
import p251r.C3641z;
import p265s.AbstractC3847o;
import p265s.C3826e1;
import p265s.C3833h;
import p266s0.C3874d;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p280t2.EnumC4094j;
import p281t3.AbstractC4106c;
import p300ub.AbstractC4302b;
import p302ud.C4309e;
import p302ud.C4320p;
import p302ud.C4325u;
import p304uf.C4329c;
import p332wb.AbstractC4855en;
import p332wb.AbstractC4955ho;
import p332wb.AbstractC5459x2;
import p332wb.C4871f6;
import p332wb.C5067l6;
import p332wb.C5166o6;
import p332wb.C5199p6;
import p332wb.C5232q6;
import p332wb.C5360u2;
import p332wb.EnumC5329t4;
import p343x6.AbstractC5700d;
import p351xe.AbstractC5798s;
import p356y0.C5843e;
import p356y0.C5844f;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import p357y1.C5868c1;
import p357y1.C5928r1;
import p363y7.AbstractC5999a;
import p365y9.C6010f;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: a7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0018a {

    /* JADX INFO: renamed from: a */
    public static C0202a f58a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m215A(int i9) {
        int i10;
        if (i9 < -1) {
            return false;
        }
        return i9 == -1 || (i10 = i9 & 255) == 0 || i10 == 255 || (i9 & 65280) == 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final List m216B(int i9, long j3, String str, boolean z9) {
        str.getClass();
        C4173t c4173t = C4173t.f13710g;
        if (i9 == 0 || AbstractC3149m.m6721t0(str)) {
            return c4173t;
        }
        return AbstractC0000a.m99x0(new C2920h(String.valueOf(System.currentTimeMillis()), i9, str, j3 < 0 ? 0L : j3, z9));
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, INVOKE, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: C */
    public static MappedByteBuffer m217C(Context context, Uri uri) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        try {
            parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            if (parcelFileDescriptorOpenFileDescriptor != null) {
                parcelFileDescriptorOpenFileDescriptor.close();
                return null;
            }
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                fileInputStream.close();
                parcelFileDescriptorOpenFileDescriptor.close();
                return map;
            } finally {
            }
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final List m218F(String str) {
        C2922j c2922jM224L;
        if (!AbstractC3149m.m6721t0(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int length = jSONArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                    if (jSONObjectOptJSONObject != null) {
                        String strOptString = jSONObjectOptJSONObject.optString("targetId");
                        strOptString.getClass();
                        String string = AbstractC3149m.m6703R0(strOptString).toString();
                        if (string.length() != 0) {
                            String string2 = AbstractC3149m.m6703R0(string).toString();
                            String strOptString2 = jSONObjectOptJSONObject.optString("label");
                            String str2 = AbstractC3149m.m6721t0(strOptString2) ? string : strOptString2;
                            boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", false);
                            String strOptString3 = jSONObjectOptJSONObject.optString("templateId");
                            strOptString3.getClass();
                            boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("customRules", false);
                            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("overrideRule");
                            if (jSONObjectOptJSONObject2 != null) {
                                String strOptString4 = jSONObjectOptJSONObject.optString("label");
                                if (AbstractC3149m.m6721t0(strOptString4)) {
                                    strOptString4 = string;
                                }
                                c2922jM224L = m224L(strOptString4, jSONObjectOptJSONObject2);
                            } else {
                                c2922jM224L = null;
                            }
                            linkedHashMap.put(string2, new C2921i(string2, string, str2, zOptBoolean, strOptString3, zOptBoolean2, c2922jM224L));
                        }
                    }
                }
                Collection collectionValues = linkedHashMap.values();
                collectionValues.getClass();
                return AbstractC4166m.m8407P1(collectionValues);
            } catch (Throwable unused) {
            }
        }
        return C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static C6010f m219G(String str) {
        Object c3959f;
        Integer num;
        String strM246j = m246j(str);
        if (strM246j.length() != 0) {
            List listM6691F0 = AbstractC3149m.m6691F0(strM246j, new char[]{','}, 6);
            ArrayList arrayList = new ArrayList();
            Iterator it = listM6691F0.iterator();
            while (it.hasNext()) {
                String strM245i = m245i((String) it.next());
                if (strM245i.length() == 0) {
                    num = null;
                } else {
                    try {
                        c3959f = Integer.valueOf(Color.parseColor(strM245i));
                    } catch (Throwable th2) {
                        c3959f = new C3959f(th2);
                    }
                    if (c3959f instanceof C3959f) {
                        c3959f = null;
                    }
                    num = (Integer) c3959f;
                }
                if (num != null) {
                    arrayList.add(num);
                }
            }
            List listM8403L1 = AbstractC4166m.m8403L1(2, arrayList);
            if (!listM8403L1.isEmpty()) {
                if (listM8403L1.size() != 1) {
                    return new C6010f(((Number) listM8403L1.get(0)).intValue(), ((Number) listM8403L1.get(1)).intValue());
                }
                int iIntValue = ((Number) listM8403L1.get(0)).intValue();
                return new C6010f(iIntValue, iIntValue);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static ArrayList m220H(C0058k c0058k, C0058k c0058k2) {
        int iM14H0 = AbstractC0000a.m14H0(c0058k);
        ArrayList arrayList = new ArrayList(iM14H0);
        for (int i9 = 0; i9 < iM14H0; i9++) {
            arrayList.add(m226N(c0058k, c0058k2));
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static long m221I(C0058k c0058k, int i9, boolean z9, int i10) {
        long j3 = 0;
        long jM345K = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            jM345K = c0058k.m345K();
            j3 |= jM345K << (i11 * 8);
        }
        if (i10 != 0) {
            while (i9 < i10) {
                j3 <<= 8;
                i9++;
            }
            return j3;
        }
        if (z9 && (128 & jM345K) != 0) {
            while (i9 < 8) {
                j3 |= 255 << (i9 * 8);
                i9++;
            }
        }
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static final List m222J(String str) {
        if (str != null && !AbstractC3149m.m6721t0(str)) {
            try {
                return m223K(new JSONArray(str));
            } catch (Throwable unused) {
            }
        }
        return C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static List m223K(JSONArray jSONArray) {
        int iOptInt;
        if (jSONArray == null) {
            return C4173t.f13710g;
        }
        C4329c c4329cM7E = AbstractC0000a.m7E();
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
            if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("mode", 0)) != 0) {
                String strOptString = jSONObjectOptJSONObject.optString("content");
                strOptString.getClass();
                if (!AbstractC3149m.m6721t0(strOptString)) {
                    String strOptString2 = jSONObjectOptJSONObject.optString("id");
                    if (AbstractC3149m.m6721t0(strOptString2)) {
                        strOptString2 = System.currentTimeMillis() + "_" + i9;
                    }
                    c4329cM7E.add(new C2920h(strOptString2, iOptInt, strOptString, jSONObjectOptJSONObject.optLong("delayMs", 0L), jSONObjectOptJSONObject.optBoolean("random", false)));
                }
            }
        }
        return AbstractC0000a.m90t(c4329cM7E);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r49v0, resolved type: org.json.JSONObject */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX INFO: renamed from: L */
    public static C2922j m224L(String str, JSONObject jSONObject) {
        List listM216B;
        boolean z9;
        int iOptInt;
        int i9;
        ?? r14;
        int iOptInt2;
        int iOptInt3 = jSONObject.optInt("replyMode", 0);
        String strOptString = jSONObject.optString("replyText", "谢谢老板");
        long jOptLong = jSONObject.optLong("replyDelayMs", 0L);
        boolean zOptBoolean = jSONObject.optBoolean("replyRandom", false);
        if (jSONObject.has("replySteps")) {
            listM216B = m223K(jSONObject.optJSONArray("replySteps"));
        } else {
            strOptString.getClass();
            listM216B = m216B(iOptInt3, jOptLong, strOptString, zOptBoolean);
        }
        List list = listM216B;
        List listM223K = jSONObject.has("groupReplySteps") ? m223K(jSONObject.optJSONArray("groupReplySteps")) : null;
        boolean z10 = jSONObject.has("notificationConfigured") || jSONObject.has("notifySystemEnabled") || jSONObject.has("notifyToastEnabled") || jSONObject.has("notifySoundEnabled") || jSONObject.has("notifyVibrateEnabled") || jSONObject.has("notifySoundUri") || jSONObject.has("notifyText") || jSONObject.has("notifyToastText") || jSONObject.has("notifyFailedSystemEnabled") || jSONObject.has("notifyFailedToastEnabled") || jSONObject.has("notifyFailedText") || jSONObject.has("notifyFailedToastText") || jSONObject.has("announceEnabled") || jSONObject.has("announceText");
        String strOptString2 = jSONObject.optString("notifyText", "抢到红包 {amount} 元");
        String strOptString3 = jSONObject.optString("notifyFailedText", "未抢到红包");
        String strOptString4 = jSONObject.optString("id");
        if (AbstractC3149m.m6721t0(strOptString4)) {
            strOptString4 = String.valueOf(System.currentTimeMillis());
        }
        strOptString4.getClass();
        String str2 = strOptString4;
        String strOptString5 = jSONObject.optString("name");
        if (!AbstractC3149m.m6721t0(strOptString5)) {
            str = strOptString5;
        }
        boolean zOptBoolean2 = jSONObject.optBoolean("enabled", false);
        int iOptInt4 = jSONObject.optInt("grabMode", 1);
        int iOptInt5 = jSONObject.optInt("delayMode", 0);
        long jOptLong2 = jSONObject.optLong("delayMs", 0L);
        long jOptLong3 = jSONObject.optLong("randomMinMs", 0L);
        long jOptLong4 = jSONObject.optLong("randomMaxMs", 0L);
        boolean zOptBoolean3 = jSONObject.optBoolean("skipSelf", false);
        int iOptInt6 = jSONObject.optInt("listMode", 0);
        String strOptString6 = jSONObject.optString("whitelist");
        strOptString6.getClass();
        String strOptString7 = jSONObject.optString("blacklist");
        strOptString7.getClass();
        int iOptInt7 = jSONObject.optInt("keywordMode", 0);
        String strOptString8 = jSONObject.optString("keywords");
        strOptString8.getClass();
        boolean zOptBoolean4 = jSONObject.optBoolean("quietEnabled", false);
        if (jSONObject.has("quietStartSecond")) {
            z9 = zOptBoolean4;
            iOptInt = jSONObject.optInt("quietStartSecond", 0);
        } else {
            z9 = zOptBoolean4;
            iOptInt = jSONObject.optInt("quietStartMinute", 0) * 60;
        }
        if (jSONObject.has("quietEndSecond")) {
            i9 = iOptInt;
            r14 = 0;
            iOptInt2 = jSONObject.optInt("quietEndSecond", 0);
        } else {
            i9 = iOptInt;
            r14 = 0;
            iOptInt2 = jSONObject.optInt("quietEndMinute", 0) * 60;
        }
        strOptString.getClass();
        boolean zOptBoolean5 = jSONObject.optBoolean("notificationConfigured", z10);
        boolean zOptBoolean6 = jSONObject.optBoolean("notifySystemEnabled", r14);
        boolean zOptBoolean7 = jSONObject.optBoolean("notifyToastEnabled", r14);
        boolean zOptBoolean8 = jSONObject.optBoolean("notifySoundEnabled", r14);
        int iOptInt8 = jSONObject.optInt("notifySoundMode", r14);
        boolean zOptBoolean9 = jSONObject.optBoolean("notifyVibrateEnabled", r14);
        String strOptString9 = jSONObject.optString("notifySoundUri");
        strOptString9.getClass();
        strOptString2.getClass();
        String strOptString10 = jSONObject.optString("notifyToastText", strOptString2);
        strOptString10.getClass();
        boolean zOptBoolean10 = jSONObject.optBoolean("notifyFailedSystemEnabled", r14);
        boolean zOptBoolean11 = jSONObject.optBoolean("notifyFailedToastEnabled", r14);
        String strM5162i = AbstractC2091b.m5162i(strOptString3, "notifyFailedToastText", strOptString3, jSONObject);
        boolean zOptBoolean12 = jSONObject.optBoolean("announceEnabled", r14);
        String strOptString11 = jSONObject.optString("announceText", "抢到红包 {amount} 元");
        strOptString11.getClass();
        return new C2922j(str2, str, zOptBoolean2, iOptInt4, iOptInt5, jOptLong2, jOptLong3, jOptLong4, zOptBoolean3, iOptInt6, strOptString6, strOptString7, iOptInt7, strOptString8, z9, i9, iOptInt2, iOptInt3, strOptString, jOptLong, zOptBoolean, list, listM223K, zOptBoolean5, zOptBoolean6, zOptBoolean7, zOptBoolean8, iOptInt8, zOptBoolean9, strOptString9, strOptString2, strOptString10, zOptBoolean10, zOptBoolean11, strOptString3, strM5162i, zOptBoolean12, strOptString11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: M */
    public static final List m225M(String str) {
        if (!AbstractC3149m.m6721t0(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                C4329c c4329cM7E = AbstractC0000a.m7E();
                int length = jSONArray.length();
                for (int i9 = 0; i9 < length; i9++) {
                    JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                    if (jSONObjectOptJSONObject != null) {
                        c4329cM7E.add(m224L("模板 " + (i9 + 1), jSONObjectOptJSONObject));
                    }
                }
                return AbstractC0000a.m90t(c4329cM7E);
            } catch (Throwable unused) {
            }
        }
        return C4173t.f13710g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static C2958a m226N(C0058k c0058k, C0058k c0058k2) {
        C3494d c3494d;
        int iM345K = c0058k.m345K();
        int i9 = iM345K & 31;
        int i10 = 5;
        int i11 = (iM345K & 224) >> 5;
        int i12 = i11 + 1;
        if (i9 == 0) {
            return new C2958a(3, Byte.valueOf(((ByteBuffer) c0058k.f177i).get()));
        }
        if (i9 == 6) {
            return new C2958a(7, Long.valueOf(m221I(c0058k, i12, true, 0)));
        }
        if (i9 == 2) {
            return new C2958a(4, Short.valueOf((short) m221I(c0058k, i12, true, 0)));
        }
        if (i9 == 3) {
            return new C2958a(5, Character.valueOf((char) m221I(c0058k, i12, false, 0)));
        }
        if (i9 == 4) {
            return new C2958a(6, Integer.valueOf((int) m221I(c0058k, i12, true, 0)));
        }
        if (i9 == 16) {
            return new C2958a(8, Float.valueOf(Float.intBitsToFloat((int) m221I(c0058k, i12, false, 4))));
        }
        if (i9 == 17) {
            return new C2958a(9, Double.valueOf(Double.longBitsToDouble(m221I(c0058k, i12, false, 8))));
        }
        switch (i9) {
            case 21:
                return new C2958a(15, c0058k2.m368s((int) m221I(c0058k, i12, false, 0)));
            case 22:
                c0058k2.m351a((((int) m221I(c0058k, i12, false, 0)) * 8) + ((C1219e) c0058k2.f178j).f4087d.f7105i);
                int iM346L = c0058k2.m346L();
                switch (iM346L) {
                    case 0:
                        i10 = 1;
                        break;
                    case 1:
                        i10 = 2;
                        break;
                    case 2:
                        i10 = 3;
                        break;
                    case 3:
                        i10 = 4;
                        break;
                    case 4:
                        break;
                    case 5:
                        i10 = 6;
                        break;
                    case 6:
                        i10 = 8;
                        break;
                    case 7:
                        i10 = 7;
                        break;
                    case 8:
                        i10 = 9;
                        break;
                    default:
                        C2104o.m5294t(AbstractC4855en.m9263g("Unknown method handle type: 0x", Integer.toHexString(iM346L)));
                        return null;
                }
                c0058k2.m347M(2);
                int iM346L2 = c0058k2.m346L();
                if (AbstractC2091b.m5154a(i10)) {
                    C2128d c2128d = new C2128d(null);
                    c2128d.f7091b = c0058k2.m373y(c0058k2.m359j(c2128d, iM346L2));
                    c3494d = new C3494d(i10, 0, c2128d);
                } else {
                    C2132h c2132h = new C2132h();
                    c2132h.f7114a = ((((C1219e) c0058k2.f178j).f4084a & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 16) | (iM346L2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                    c2132h.f7119f = iM346L2;
                    c2132h.f7120g = c0058k2;
                    c3494d = new C3494d(i10, 1, c2132h);
                }
                return new C2958a(16, c3494d);
            case 23:
                return new C2958a(10, c0058k2.m371v((int) m221I(c0058k, i12, false, 0)));
            case 24:
                return new C2958a(11, c0058k2.m373y((int) m221I(c0058k, i12, false, 0)));
            case 25:
            case 27:
                int iM221I = (int) m221I(c0058k, i12, false, 0);
                c0058k2.getClass();
                C2128d c2128d2 = new C2128d(null);
                c2128d2.f7091b = c0058k2.m373y(c0058k2.m359j(c2128d2, iM221I));
                return new C2958a(13, c2128d2);
            case 26:
                int iM221I2 = (int) m221I(c0058k, i12, false, 0);
                C2132h c2132h2 = new C2132h();
                c2132h2.f7114a = ((((C1219e) c0058k2.f178j).f4084a & Settings.DEFAULT_INITIAL_WINDOW_SIZE) << 16) | (iM221I2 & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                c2132h2.f7119f = iM221I2;
                c2132h2.f7120g = c0058k2;
                return new C2958a(14, c2132h2);
            case 28:
                return new C2958a(17, m220H(c0058k, c0058k2));
            case 29:
                return new C2958a(18, C0956r.m2350c(c0058k, c0058k2, false));
            case 30:
                return C2958a.f9703i;
            case 31:
                return new C2958a(2, Boolean.valueOf(i11 == 1));
            default:
                throw new C0081d(AbstractC4855en.m9263g("Unknown encoded value type: 0x", Integer.toHexString(i9)));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0039 A[ADDED_TO_REGION, EDGE_INSN: B:58:0x0039->B:20:0x0039 BREAK  A[LOOP:0: B:8:0x0019->B:60:?], REMOVE, SYNTHETIC] */
    /* JADX INFO: renamed from: O */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C2028v m227O(Object obj) {
        String str;
        C2029w c2029wM228P;
        int i9;
        int i10;
        obj.getClass();
        int i11 = 0;
        Object objInvokeMethod = KavaReflector.invokeMethod(obj, "toByteArray", new Object[0]);
        byte[] bArr = objInvokeMethod instanceof byte[] ? (byte[]) objInvokeMethod : null;
        if (bArr != null) {
            while (i11 < bArr.length && (c2029wM228P = m228P(bArr, i11)) != null) {
                int i12 = c2029wM228P.f6859b;
                long j3 = c2029wM228P.f6858a;
                int i13 = (int) (j3 >>> 3);
                int i14 = (int) (j3 & 7);
                if (i14 == 0) {
                    C2029w c2029wM228P2 = m228P(bArr, i12);
                    if (c2029wM228P2 == null) {
                        break;
                    }
                    i11 = c2029wM228P2.f6859b;
                    if (i11 >= 0) {
                    }
                } else {
                    if (i14 == 1) {
                        i9 = i12 + 8;
                    } else if (i14 == 2) {
                        C2029w c2029wM228P3 = m228P(bArr, i12);
                        if (c2029wM228P3 == null) {
                            break;
                        }
                        int i15 = c2029wM228P3.f6859b;
                        int i16 = (int) c2029wM228P3.f6858a;
                        if (i16 < 0 || (i10 = i15 + i16) > bArr.length) {
                            break;
                        }
                        if (i13 == 1) {
                            Charset charset = StandardCharsets.UTF_8;
                            charset.getClass();
                            str = new String(bArr, i15, i16, charset);
                            break;
                        }
                        i11 = i10;
                        if (i11 >= 0 || i11 > bArr.length) {
                            break;
                        }
                    } else {
                        if (i14 != 5) {
                            break;
                        }
                        i9 = i12 + 4;
                    }
                    i11 = i9;
                    if (i11 >= 0) {
                        break;
                    }
                    break;
                    break;
                }
            }
            str = null;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Long lM229Q = m229Q(bArr, 4);
            if (lM229Q != null) {
                int iLongValue = (int) lM229Q.longValue();
                Long lM229Q2 = m229Q(bArr, 7);
                if (lM229Q2 != null) {
                    return new C2028v(str, iLongValue, (int) lM229Q2.longValue());
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: P */
    public static C2029w m228P(byte[] bArr, int i9) {
        long j3 = 0;
        for (int i10 = 0; i9 < bArr.length && i10 < 64; i10 += 7) {
            byte b10 = bArr[i9];
            i9++;
            j3 |= ((long) (b10 & JSONB.Constants.BC_SYMBOL)) << i10;
            if ((b10 & 128) == 0) {
                return new C2029w(j3, i9);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Q */
    public static Long m229Q(byte[] bArr, int i9) {
        C2029w c2029wM228P;
        int i10;
        int i11 = 0;
        while (i11 < bArr.length && (c2029wM228P = m228P(bArr, i11)) != null) {
            int i12 = c2029wM228P.f6859b;
            long j3 = c2029wM228P.f6858a;
            int i13 = (int) (j3 >>> 3);
            int i14 = (int) (j3 & 7);
            if (i14 != 0) {
                if (i14 == 1) {
                    i10 = i12 + 8;
                } else if (i14 == 2) {
                    C2029w c2029wM228P2 = m228P(bArr, i12);
                    if (c2029wM228P2 == null) {
                        return null;
                    }
                    i10 = c2029wM228P2.f6859b + ((int) c2029wM228P2.f6858a);
                } else {
                    if (i14 != 5) {
                        return null;
                    }
                    i10 = i12 + 4;
                }
                i11 = i10;
            } else {
                C2029w c2029wM228P3 = m228P(bArr, i12);
                if (c2029wM228P3 == null) {
                    return null;
                }
                if (i13 == i9) {
                    return Long.valueOf(c2029wM228P3.f6858a);
                }
                i11 = c2029wM228P3.f6859b;
            }
            if (i11 < 0 || i11 > bArr.length) {
                return null;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: R */
    public static String m230R(String str) {
        if (AbstractC5999a.m10743f(str)) {
            return null;
        }
        char[] charArray = str.replace('\\', '/').toCharArray();
        int length = charArray.length;
        StringBuilder sb2 = new StringBuilder(length);
        int i9 = length - 1;
        StringBuilder sb3 = null;
        boolean z9 = false;
        for (int i10 = 0; i10 < length; i10++) {
            char c10 = charArray[i10];
            if (z9) {
                sb2.append(c10);
            } else if (c10 == '.') {
                if (sb3 == null) {
                    sb3 = new StringBuilder(5);
                }
                sb3.append(c10);
            } else if (c10 == '/') {
                if (i10 == i9) {
                    sb2.append(c10);
                }
                sb3 = null;
            } else {
                sb2 = new StringBuilder(length);
                if (sb3 != null) {
                    sb2.append(sb3.toString());
                    sb3 = null;
                }
                sb2.append(c10);
                z9 = true;
            }
        }
        if (sb3 == null) {
            return sb2.toString();
        }
        String string = sb3.toString();
        if (string.length() > 2) {
            return string;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b8  */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [boolean] */
    /* JADX INFO: renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m231S(Context context, C5360u2 c5360u2, boolean z9) {
        C1845j1 c1845j1;
        int i9;
        ?? r12;
        boolean z10;
        ?? r13;
        Object obj;
        int i10;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            return;
        }
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return;
        }
        C2562b c2562b = new C2562b(viewGroup.getChildCount() - 1, 0, -1);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(c2562b));
        Iterator it = c2562b.iterator();
        while (true) {
            C2563c c2563c = (C2563c) it;
            if (!c2563c.f8317i) {
                break;
            } else {
                arrayList.add(viewGroup.getChildAt(((Number) c2563c.next()).intValue()));
            }
        }
        ArrayList<View> arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (AbstractC1416l.m3825a(((View) obj2).getTag(), "Hchat:MiuixSettingsPage")) {
                arrayList2.add(obj2);
            }
        }
        for (View view : arrayList2) {
            Object tag = view.getTag(R.id.hchat_settings_page_host);
            C5166o6 c5166o6 = tag instanceof C5166o6 ? (C5166o6) tag : null;
            C4871f6 c4871f6 = c5166o6 != null ? c5166o6.f19318b : null;
            if (c4871f6 != null) {
                c4871f6.invoke();
            } else {
                viewGroup.removeView(view);
            }
        }
        C5166o6 c5166o62 = new C5166o6(z9);
        C0416a1 c0416a1 = new C0416a1(2);
        C1845j1 c1845j1M4639u = AbstractC1874r.m4639u(c5360u2);
        C1845j1 c1845j1M4639u2 = AbstractC1874r.m4639u(null);
        C1845j1 c1845j1M4639u3 = AbstractC1874r.m4639u(0);
        C1425u c1425u = new C1425u();
        ArrayList arrayList3 = new ArrayList();
        C1421q c1421q = new C1421q();
        C1421q c1421q2 = new C1421q();
        C1425u c1425u2 = new C1425u();
        ViewGroup viewGroup2 = viewGroup;
        C4871f6 c4871f62 = new C4871f6(c1421q2, c5166o62, c1425u2, arrayList3, c1425u, viewGroup2, c0416a1, 0);
        C1421q c1421q3 = c1421q2;
        C1425u c1425u3 = c1425u;
        c5166o62.f19318b = c4871f62;
        if (z9) {
            C4871f6 c4871f63 = new C4871f6(c1421q3, c5166o62, c1425u2, arrayList3, c1425u3, viewGroup2, c0416a1, 1);
            c1421q3 = c1421q3;
            c1425u3 = c1425u3;
            c5166o62.f19319c = c4871f63;
        }
        C1421q c1421q4 = c1421q3;
        C1425u c1425u4 = c1425u3;
        C5199p6 c5199p6 = new C5199p6(activity, c1421q, c1845j1M4639u, c1425u2, c1425u4, c1421q4, c5166o62, arrayList3, viewGroup2, c0416a1);
        c5199p6.setTag("Hchat:MiuixSettingsPage");
        c5199p6.setTag(R.id.hchat_settings_page_host, c5166o62);
        C3147k c3147k = AbstractC4955ho.f17686a;
        c5199p6.setBackgroundColor((activity.getResources().getConfiguration().uiMode & 48) == 32 ? -16777216 : -1);
        c5199p6.setClickable(true);
        c5199p6.setFocusable(true);
        c5199p6.setFocusableInTouchMode(true);
        c5199p6.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        c1425u4.f4738g = c5199p6;
        AbstractC5700d.m10251H(viewGroup2, c0416a1, c0416a1, c0416a1, c0416a1);
        Object obj3 = c1425u4.f4738g;
        if (obj3 == null) {
            AbstractC1416l.m3831g("page");
            throw null;
        }
        AbstractC5700d.m10251H((FrameLayout) obj3, c0416a1, c0416a1, c0416a1, c0416a1);
        if (!c0416a1.f1198l) {
            c0416a1.f1195i.m7017F(Bundle.EMPTY);
            c0416a1.f1198l = true;
        }
        C0114s c0114s = c0416a1.f1194h;
        c0114s.m554c("setCurrentState");
        c0114s.m556e(EnumC0107l.f291i);
        c0114s.m554c("setCurrentState");
        c0114s.m556e(EnumC0107l.f292j);
        c0114s.m554c("setCurrentState");
        c0114s.m556e(EnumC0107l.f293k);
        C1845j1 c1845j1M4639u4 = AbstractC1874r.m4639u(EnumC5329t4.f20745g);
        try {
            c1845j1 = c1845j1M4639u2;
            i9 = 0;
        } catch (Throwable unused) {
            c1845j1 = c1845j1M4639u2;
            i9 = 0;
        }
        try {
            r12 = AbstractC4302b.m8640c(activity, "Hchat_global_config").getBoolean("terms_accepted", false);
        } catch (Throwable unused2) {
            r12 = i9;
        }
        if (r12 != 0) {
            try {
                i10 = AbstractC4302b.m8640c(activity, "Hchat_global_config").getInt("terms_version", i9);
            } catch (Throwable unused3) {
                i10 = i9;
            }
            z10 = true;
            if (i10 == 1) {
                r13 = 1;
            }
            C1845j1 c1845j1M4639u5 = AbstractC1874r.m4639u(Boolean.valueOf((boolean) r13));
            C5868c1 c5868c1 = new C5868c1(activity);
            c5868c1.setId(android.R.id.content);
            AbstractC5700d.m10251H(c5868c1, c0416a1, c0416a1, c0416a1, c0416a1);
            c5868c1.setViewCompositionStrategy(C5928r1.f24042h);
            Activity activity2 = activity;
            C5067l6 c5067l6 = new C5067l6(c1845j1M4639u, c0416a1, activity2, c1845j1, c1845j1M4639u5, c1421q4, c5166o62, c1425u2, arrayList3, c1425u4, viewGroup2, c1845j1M4639u4, c1845j1M4639u3, z9);
            C1425u c1425u5 = c1425u4;
            c5868c1.setContent(new C3874d(-541130442, c5067l6, z10));
            obj = c1425u5.f4738g;
            if (obj != null) {
                AbstractC1416l.m3831g("page");
                throw null;
            }
            ((FrameLayout) obj).addView(c5868c1, new FrameLayout.LayoutParams(-1, -1));
            Object obj4 = c1425u5.f4738g;
            if (obj4 == null) {
                AbstractC1416l.m3831g("page");
                throw null;
            }
            viewGroup2.addView((FrameLayout) obj4);
            if (arrayList3.isEmpty()) {
                C5232q6 c5232q6 = new C5232q6(c1425u5, c1421q, c1845j1M4639u, c1425u2, c1421q4, c5166o62, arrayList3, viewGroup2, c0416a1, 0);
                C5232q6 c5232q62 = new C5232q6(c1425u5, c1421q, c1845j1M4639u, c1425u2, c1421q4, c5166o62, arrayList3, viewGroup2, c0416a1, 1);
                c1425u5 = c1425u5;
                for (Class cls : AbstractC0000a.m101y0(Activity.class, activity2.getClass())) {
                    try {
                        arrayList3.addAll(XposedBridge.hookAllMethods(cls, "dispatchKeyEvent", c5232q6));
                    } catch (Throwable unused4) {
                    }
                    try {
                        arrayList3.addAll(XposedBridge.hookAllMethods(cls, "onKeyDown", c5232q6));
                    } catch (Throwable unused5) {
                    }
                    try {
                        arrayList3.addAll(XposedBridge.hookAllMethods(cls, "onKeyUp", c5232q6));
                    } catch (Throwable unused6) {
                    }
                    try {
                        arrayList3.addAll(XposedBridge.hookAllMethods(cls, "onBackPressed", c5232q62));
                    } catch (Throwable unused7) {
                    }
                }
            }
            Object obj5 = c1425u5.f4738g;
            if (obj5 != null) {
                ((FrameLayout) obj5).requestFocus();
                return;
            } else {
                AbstractC1416l.m3831g("page");
                throw null;
            }
        }
        z10 = true;
        r13 = i9;
        C1845j1 c1845j1M4639u52 = AbstractC1874r.m4639u(Boolean.valueOf((boolean) r13));
        C5868c1 c5868c12 = new C5868c1(activity);
        c5868c12.setId(android.R.id.content);
        AbstractC5700d.m10251H(c5868c12, c0416a1, c0416a1, c0416a1, c0416a1);
        c5868c12.setViewCompositionStrategy(C5928r1.f24042h);
        Activity activity22 = activity;
        C5067l6 c5067l62 = new C5067l6(c1845j1M4639u, c0416a1, activity22, c1845j1, c1845j1M4639u52, c1421q4, c5166o62, c1425u2, arrayList3, c1425u4, viewGroup2, c1845j1M4639u4, c1845j1M4639u3, z9);
        C1425u c1425u52 = c1425u4;
        c5868c12.setContent(new C3874d(-541130442, c5067l62, z10));
        obj = c1425u52.f4738g;
        if (obj != null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T */
    public static final void m232T(C1421q c1421q, C5166o6 c5166o6, C1425u c1425u, ArrayList arrayList, C1425u c1425u2, ViewGroup viewGroup, C0416a1 c0416a1) {
        Object c3959f;
        Object c3959f2;
        Object c3959f3;
        Object obj;
        Object obj2;
        Object c3959f4 = C3967n.f12976a;
        if (c1421q.f4734g) {
            return;
        }
        c1421q.f4734g = true;
        c5166o6.f19318b = null;
        c5166o6.f19319c = null;
        c1425u.f4738g = null;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((XC_MethodHook.Unhook) it.next()).unhook();
            } catch (Throwable unused) {
            }
        }
        arrayList.clear();
        try {
            obj2 = c1425u2.f4738g;
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (obj2 == null) {
            AbstractC1416l.m3831g("page");
            throw null;
        }
        C5868c1 c5868c1 = (C5868c1) ((FrameLayout) obj2).findViewById(android.R.id.content);
        if (c5868c1 != null) {
            c5868c1.m10555f();
            c3959f = c3959f4;
        } else {
            c3959f = null;
        }
        Throwable thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
            AbstractC0921a.m2261x("[Hchat:MiuixSettings] 销毁页面 Composition 失败: ", thM8182b.getMessage(), thM8182b);
        }
        try {
            obj = c1425u2.f4738g;
        } catch (Throwable th3) {
            c3959f2 = new C3959f(th3);
        }
        if (obj == null) {
            AbstractC1416l.m3831g("page");
            throw null;
        }
        if (((FrameLayout) obj).getParent() == viewGroup) {
            Object obj3 = c1425u2.f4738g;
            if (obj3 == null) {
                AbstractC1416l.m3831g("page");
                throw null;
            }
            viewGroup.removeView((FrameLayout) obj3);
        }
        c3959f2 = c3959f4;
        Throwable thM8182b2 = C3960g.m8182b(c3959f2);
        if (thM8182b2 != null) {
            AbstractC0921a.m2261x("[Hchat:MiuixSettings] 移除页面失败: ", thM8182b2.getMessage(), thM8182b2);
        }
        try {
            c0416a1.getClass();
            viewGroup.getClass();
            AbstractC5700d.m10289p(viewGroup);
            c3959f3 = c3959f4;
        } catch (Throwable th4) {
            c3959f3 = new C3959f(th4);
        }
        Throwable thM8182b3 = C3960g.m8182b(c3959f3);
        if (thM8182b3 != null) {
            AbstractC0921a.m2261x("[Hchat:MiuixSettings] 清理页面 Owner 失败: ", thM8182b3.getMessage(), thM8182b3);
        }
        try {
            C0114s c0114s = c0416a1.f1194h;
            EnumC0107l enumC0107l = c0114s.f300c;
            EnumC0107l enumC0107l2 = EnumC0107l.f289g;
            if (enumC0107l != enumC0107l2) {
                c0114s.m554c("setCurrentState");
                c0114s.m556e(enumC0107l2);
            }
            c0416a1.f1197k.m7634a();
            c0416a1.f1196j.m545a();
        } catch (Throwable th5) {
            c3959f4 = new C3959f(th5);
        }
        Throwable thM8182b4 = C3960g.m8182b(c3959f4);
        if (thM8182b4 != null) {
            AbstractC0921a.m2261x("[Hchat:MiuixSettings] 销毁页面 Owner 失败: ", thM8182b4.getMessage(), thM8182b4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: U */
    public static JSONObject m233U(C2922j c2922j) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", c2922j.f9512a);
        jSONObject.put("name", c2922j.f9513b);
        jSONObject.put("enabled", c2922j.f9514c);
        jSONObject.put("grabMode", c2922j.f9515d);
        jSONObject.put("delayMode", c2922j.f9516e);
        jSONObject.put("delayMs", c2922j.f9517f);
        jSONObject.put("randomMinMs", c2922j.f9518g);
        jSONObject.put("randomMaxMs", c2922j.f9519h);
        jSONObject.put("skipSelf", c2922j.f9520i);
        jSONObject.put("listMode", c2922j.f9521j);
        jSONObject.put("whitelist", c2922j.f9522k);
        jSONObject.put("blacklist", c2922j.f9523l);
        jSONObject.put("keywordMode", c2922j.f9524m);
        jSONObject.put("keywords", c2922j.f9525n);
        jSONObject.put("quietEnabled", c2922j.f9526o);
        jSONObject.put("quietStartSecond", c2922j.f9527p);
        jSONObject.put("quietEndSecond", c2922j.f9528q);
        jSONObject.put("replyMode", c2922j.f9529r);
        jSONObject.put("replyText", c2922j.f9530s);
        jSONObject.put("replyDelayMs", c2922j.f9531t);
        jSONObject.put("replyRandom", c2922j.f9532u);
        jSONObject.put("replySteps", new JSONArray(m254r(c2922j.f9533v)));
        List list = c2922j.f9534w;
        if (list != null) {
            jSONObject.put("groupReplySteps", new JSONArray(m254r(list)));
        }
        jSONObject.put("notificationConfigured", c2922j.f9535x);
        jSONObject.put("notifySystemEnabled", c2922j.f9536y);
        jSONObject.put("notifyToastEnabled", c2922j.f9537z);
        jSONObject.put("notifySoundEnabled", c2922j.f9500A);
        jSONObject.put("notifySoundMode", c2922j.f9501B);
        jSONObject.put("notifyVibrateEnabled", c2922j.f9502C);
        jSONObject.put("notifySoundUri", c2922j.f9503D);
        jSONObject.put("notifyText", c2922j.f9504E);
        jSONObject.put("notifyToastText", c2922j.f9505F);
        jSONObject.put("notifyFailedSystemEnabled", c2922j.f9506G);
        jSONObject.put("notifyFailedToastEnabled", c2922j.f9507H);
        jSONObject.put("notifyFailedText", c2922j.f9508I);
        jSONObject.put("notifyFailedToastText", c2922j.f9509J);
        jSONObject.put("announceEnabled", c2922j.f9510K);
        jSONObject.put("announceText", c2922j.f9511L);
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: V */
    public static final String m234V(float f3) {
        if (Float.isNaN(f3)) {
            return "NaN";
        }
        if (Float.isInfinite(f3)) {
            return f3 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0f, iMax);
        float f10 = f3 * fPow;
        int i9 = (int) f10;
        if (f10 - i9 >= 0.5f) {
            i9++;
        }
        float f11 = i9 / fPow;
        return iMax > 0 ? String.valueOf(f11) : String.valueOf((int) f11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W */
    public static final boolean m235W(Context context) {
        context.getClass();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            return false;
        }
        Window window = activity.getWindow();
        View decorView = window != null ? window.getDecorView() : null;
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup == null) {
            return false;
        }
        View viewM255s = m255s(viewGroup);
        Object tag = viewM255s != null ? viewM255s.getTag(R.id.hchat_settings_page_host) : null;
        C5166o6 c5166o6 = tag instanceof C5166o6 ? (C5166o6) tag : null;
        if (c5166o6 == null || !c5166o6.f19317a) {
            m231S(activity, new C5360u2(null), true);
            return true;
        }
        InterfaceC1220a interfaceC1220a = c5166o6.f19319c;
        if (interfaceC1220a == null) {
            interfaceC1220a = c5166o6.f19318b;
        }
        if (interfaceC1220a != null) {
            interfaceC1220a.invoke();
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: X */
    public static Object m236X(C4309e c4309e, Callable callable) {
        try {
            return callable.call();
        } catch (Exception e6) {
            C2829f c2829f = c4309e.f9217g;
            EnumC2824a enumC2824a = EnumC2824a.f9146f0;
            if (!c2829f.mo6235a(enumC2824a)) {
                throw new C0084g("Code generation error", e6);
            }
            c4309e.m6227D(enumC2824a);
            try {
                return callable.call();
            } catch (Exception e7) {
                throw new C0084g("Code generation error after restart", e7);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0261 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:246:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0413  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:277:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m237a(final InterfaceC5853o interfaceC5853o, C3641z c3641z, final InterfaceC3268x0 interfaceC3268x0, final boolean z9, final C2638p c2638p, final boolean z10, final InterfaceC2185k1 interfaceC2185k1, C5843e c5843e, InterfaceC3223i interfaceC3223i, C5844f c5844f, InterfaceC3217g interfaceC3217g, final InterfaceC1231l interfaceC1231l, C1836h0 c1836h0, final int i9, final int i10, final int i11) {
        int i12;
        C5843e c5843e2;
        final InterfaceC3223i interfaceC3223i2;
        int i13;
        int i14;
        C3641z c3641z2;
        final C5844f c5844f2;
        InterfaceC3217g interfaceC3217g2;
        C1876r1 c1876r1M4557t;
        int i15;
        InterfaceC3217g interfaceC3217g3;
        C5844f c5844f3;
        int i16;
        InterfaceC3223i interfaceC3223i3;
        C5843e c5843e3;
        InterfaceC1809a1 interfaceC1809a1M4643y;
        boolean z11;
        Object objM4514P;
        Object obj;
        C3627l c3627l;
        boolean z12;
        Object objM4514P2;
        Object objM4514P3;
        InterfaceC3599t interfaceC3599t;
        InterfaceC1037z interfaceC1037z;
        C3833h c3833h;
        boolean zM4530d;
        Object objM4514P4;
        Object obj2;
        int i17;
        C3627l c3627l2;
        InterfaceC5853o interfaceC5853oM8020g;
        c1836h0.m4527b0(924924659);
        if ((i9 & 6) == 0) {
            i12 = (c1836h0.m4534f(interfaceC5853o) ? 4 : 2) | i9;
        } else {
            i12 = i9;
        }
        if ((i9 & 48) == 0) {
            i12 |= c1836h0.m4534f(c3641z) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i12 |= c1836h0.m4534f(interfaceC3268x0) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i12 |= c1836h0.m4536g(false) ? Opcodes.ACC_STRICT : 1024;
        }
        if ((i9 & 24576) == 0) {
            i12 |= c1836h0.m4536g(z9) ? 16384 : 8192;
        }
        if ((196608 & i9) == 0) {
            i12 |= c1836h0.m4534f(c2638p) ? Opcodes.ACC_DEPRECATED : 65536;
        }
        if ((i9 & 1572864) == 0) {
            i12 |= c1836h0.m4536g(z10) ? 1048576 : 524288;
        }
        if ((i9 & 12582912) == 0) {
            i12 |= c1836h0.m4534f(interfaceC2185k1) ? 8388608 : 4194304;
        }
        if ((i9 & 100663296) == 0) {
            i12 |= 33554432;
        }
        int i18 = i11 & Opcodes.ACC_INTERFACE;
        if (i18 != 0) {
            i12 |= 805306368;
            c5843e2 = c5843e;
        } else {
            c5843e2 = c5843e;
            if ((i9 & 805306368) == 0) {
                i12 |= c1836h0.m4534f(c5843e2) ? 536870912 : 268435456;
            }
        }
        int i19 = i11 & 1024;
        if (i19 != 0) {
            i13 = i10 | 6;
            interfaceC3223i2 = interfaceC3223i;
        } else {
            interfaceC3223i2 = interfaceC3223i;
            if ((i10 & 6) == 0) {
                i13 = i10 | (c1836h0.m4534f(interfaceC3223i2) ? 4 : 2);
            } else {
                i13 = i10;
            }
        }
        int i20 = i12;
        int i21 = i11 & Opcodes.ACC_STRICT;
        if (i21 != 0) {
            i13 |= 48;
            i14 = i21;
        } else if ((i10 & 48) == 0) {
            i14 = i21;
            i13 |= c1836h0.m4534f(c5844f) ? 32 : 16;
        } else {
            i14 = i21;
        }
        int i22 = i13;
        int i23 = i11 & 4096;
        if (i23 == 0) {
            if ((i10 & 384) == 0) {
                i22 |= c1836h0.m4534f(interfaceC3217g) ? Opcodes.ACC_NATIVE : 128;
            }
            if ((i10 & 3072) == 0) {
                i22 |= c1836h0.m4538h(interfaceC1231l) ? Opcodes.ACC_STRICT : 1024;
            }
            if (c1836h0.m4516S(i20 & 1, (i20 & 306783379) == 306783378 || (i22 & 1171) != 1170)) {
                c3641z2 = c3641z;
                c1836h0.m4519V();
                c5844f2 = c5844f;
                interfaceC3217g2 = interfaceC3217g;
            } else {
                c1836h0.m4521X();
                if ((i9 & 1) == 0 || c1836h0.m4500B()) {
                    i15 = i20 & (-234881025);
                    if (i18 != 0) {
                        c5843e2 = null;
                    }
                    if (i19 != 0) {
                        interfaceC3223i2 = null;
                    }
                    C5844f c5844f4 = i14 != 0 ? null : c5844f;
                    if (i23 != 0) {
                        c5844f3 = c5844f4;
                        i16 = i22;
                        interfaceC3223i3 = interfaceC3223i2;
                        c5843e3 = c5843e2;
                        interfaceC3217g3 = null;
                        c1836h0.m4554q();
                        int i24 = i15 >> 3;
                        int i25 = i24 & 14;
                        int i26 = ((i16 >> 6) & 112) | i25;
                        int i27 = i15;
                        interfaceC1809a1M4643y = AbstractC1874r.m4643y(interfaceC1231l, c1836h0);
                        int i28 = i16;
                        z11 = (((i26 & 14) ^ 6) <= 4 && c1836h0.m4534f(c3641z)) || (i26 & 6) == 4;
                        objM4514P = c1836h0.m4514P();
                        obj = C1851l.f6155a;
                        if (z11 || objM4514P == obj) {
                            C3619d c3619d = new C3619d();
                            c3619d.f11675a = new C1833g1(Integer.MAX_VALUE);
                            c3619d.f11676b = new C1833g1(Integer.MAX_VALUE);
                            C0144j c0144j = new C0144j(interfaceC1809a1M4643y, 11);
                            C1823e c1823e = C1823e.f6050k;
                            C0184c c0184c = AbstractC1850k2.f6153a;
                            objM4514P = new C3627l(0, 0, InterfaceC1854l2.class, new C1892x(new C0045e(new C1892x(c0144j, c1823e), c3641z, c3619d, 11), c1823e), "value", "getValue()Ljava/lang/Object;");
                            c1836h0.m4545k0(objM4514P);
                        }
                        c3627l = (C3627l) objM4514P;
                        int i29 = i27 >> 9;
                        int i30 = i25 | (i29 & 112);
                        z12 = ((((i30 & 112) ^ 48) > 32 && c1836h0.m4536g(z9)) || (i30 & 48) == 32) | ((((i30 & 14) ^ 6) <= 4 && c1836h0.m4534f(c3641z)) || (i30 & 6) == 4);
                        objM4514P2 = c1836h0.m4514P();
                        if (z12 || objM4514P2 == obj) {
                            objM4514P2 = new C3621f(c3641z, z9);
                            c1836h0.m4545k0(objM4514P2);
                        }
                        C3621f c3621f = (C3621f) objM4514P2;
                        objM4514P3 = c1836h0.m4514P();
                        if (objM4514P3 == obj) {
                            objM4514P3 = AbstractC1874r.m4632n(c1836h0);
                            c1836h0.m4545k0(objM4514P3);
                        }
                        interfaceC3599t = (InterfaceC3599t) objM4514P3;
                        interfaceC1037z = (InterfaceC1037z) c1836h0.m4542j(AbstractC5888h1.f23925g);
                        c3833h = ((Boolean) c1836h0.m4542j(AbstractC5888h1.f23941w)).booleanValue() ? null : C3826e1.f12544a;
                        int i31 = i28 << 18;
                        int i32 = (i27 & 65520) | (i29 & 3670016) | (i31 & 29360128) | (i31 & 234881024) | ((i28 << 27) & 1879048192);
                        zM4530d = ((((i32 & 112) ^ 48) <= 32 && c1836h0.m4534f(c3641z)) || (i32 & 48) == 32) | ((((i32 & 896) ^ 384) > 256 && c1836h0.m4534f(interfaceC3268x0)) || (i32 & 384) == 256) | ((((i32 & 7168) ^ 3072) > 2048 && c1836h0.m4536g(false)) || (i32 & 3072) == 2048) | ((((57344 & i32) ^ 24576) > 16384 && c1836h0.m4536g(z9)) || (i32 & 24576) == 16384) | c1836h0.m4530d(0) | ((((i32 & 3670016) ^ 1572864) > 1048576 && c1836h0.m4534f(c5843e3)) || (i32 & 1572864) == 1048576) | ((((i32 & 29360128) ^ 12582912) > 8388608 && c1836h0.m4534f(c5844f3)) || (i32 & 12582912) == 8388608) | ((((i32 & 234881024) ^ 100663296) > 67108864 && c1836h0.m4534f(interfaceC3217g3)) || (i32 & 100663296) == 67108864) | ((((i32 & 1879048192) ^ 805306368) > 536870912 && c1836h0.m4534f(interfaceC3223i3)) || (i32 & 805306368) == 536870912) | c1836h0.m4534f(interfaceC1037z) | c1836h0.m4534f(c3833h);
                        objM4514P4 = c1836h0.m4514P();
                        if (zM4530d || objM4514P4 == obj) {
                            obj2 = obj;
                            i17 = 4;
                            Object c3630o = new C3630o(c3641z, z9, interfaceC3268x0, c3627l, interfaceC3223i3, interfaceC3217g3, interfaceC3599t, interfaceC1037z, c3833h, c5843e3, c5844f3);
                            c3627l2 = c3627l;
                            interfaceC3223i2 = interfaceC3223i3;
                            interfaceC3217g2 = interfaceC3217g3;
                            c1836h0.m4545k0(c3630o);
                            objM4514P4 = c3630o;
                        } else {
                            c3627l2 = c3627l;
                            interfaceC3223i2 = interfaceC3223i3;
                            interfaceC3217g2 = interfaceC3217g3;
                            obj2 = obj;
                            i17 = 4;
                        }
                        C3630o c3630o2 = (C3630o) objM4514P4;
                        EnumC2640p1 enumC2640p1 = !z9 ? EnumC2640p1.f8622g : EnumC2640p1.f8623h;
                        if (z10) {
                            c1836h0.m4525a0(-2076718545);
                            c1836h0.m4553p(false);
                            interfaceC5853oM8020g = C5850l.f23787a;
                        } else {
                            c1836h0.m4525a0(-2077147368);
                            boolean zM4530d2 = ((((i24 & 14) ^ 6) > i17 && c1836h0.m4534f(c3641z)) || (i24 & 6) == i17) | c1836h0.m4530d(0);
                            Object objM4514P5 = c1836h0.m4514P();
                            if (zM4530d2 || objM4514P5 == obj2) {
                                objM4514P5 = new C3622g(c3641z);
                                c1836h0.m4545k0(objM4514P5);
                            }
                            interfaceC5853oM8020g = AbstractC3847o.m8020g((C3622g) objM4514P5, c3641z.f11812p, enumC2640p1);
                            c1836h0.m4553p(false);
                        }
                        c3641z2 = c3641z;
                        AbstractC3847o.m8014a(c3627l2, AbstractC2192n.m5442s(AbstractC3847o.m8021h(interfaceC5853o.mo10549d(c3641z.f11809m).mo10549d(c3641z.f11810n), c3627l2, c3621f, enumC2640p1, z10).mo10549d(interfaceC5853oM8020g).mo10549d(c3641z.f11811o.f12694k), c3641z, enumC2640p1, interfaceC2185k1, z10, c2638p, c3641z.f11803g), c3641z2.f11813q, c3630o2, c1836h0, 0);
                        c5843e2 = c5843e3;
                        c5844f2 = c5844f3;
                    } else {
                        interfaceC3217g3 = interfaceC3217g;
                        c5844f3 = c5844f4;
                    }
                } else {
                    c1836h0.m4519V();
                    i15 = i20 & (-234881025);
                    c5844f3 = c5844f;
                    interfaceC3217g3 = interfaceC3217g;
                }
                i16 = i22;
                interfaceC3223i3 = interfaceC3223i2;
                c5843e3 = c5843e2;
                c1836h0.m4554q();
                int i242 = i15 >> 3;
                int i252 = i242 & 14;
                int i262 = ((i16 >> 6) & 112) | i252;
                int i272 = i15;
                interfaceC1809a1M4643y = AbstractC1874r.m4643y(interfaceC1231l, c1836h0);
                int i282 = i16;
                if (((i262 & 14) ^ 6) <= 4) {
                    objM4514P = c1836h0.m4514P();
                    obj = C1851l.f6155a;
                    if (z11) {
                        C3619d c3619d2 = new C3619d();
                        c3619d2.f11675a = new C1833g1(Integer.MAX_VALUE);
                        c3619d2.f11676b = new C1833g1(Integer.MAX_VALUE);
                        C0144j c0144j2 = new C0144j(interfaceC1809a1M4643y, 11);
                        C1823e c1823e2 = C1823e.f6050k;
                        C0184c c0184c2 = AbstractC1850k2.f6153a;
                        objM4514P = new C3627l(0, 0, InterfaceC1854l2.class, new C1892x(new C0045e(new C1892x(c0144j2, c1823e2), c3641z, c3619d2, 11), c1823e2), "value", "getValue()Ljava/lang/Object;");
                        c1836h0.m4545k0(objM4514P);
                        c3627l = (C3627l) objM4514P;
                        int i292 = i272 >> 9;
                        int i302 = i252 | (i292 & 112);
                        if (((i302 & 14) ^ 6) <= 4) {
                            if (((i302 & 112) ^ 48) > 32) {
                                z12 = ((((i302 & 112) ^ 48) > 32 && c1836h0.m4536g(z9)) || (i302 & 48) == 32) | ((((i302 & 14) ^ 6) <= 4 && c1836h0.m4534f(c3641z)) || (i302 & 6) == 4);
                                objM4514P2 = c1836h0.m4514P();
                                if (z12) {
                                    objM4514P2 = new C3621f(c3641z, z9);
                                    c1836h0.m4545k0(objM4514P2);
                                    C3621f c3621f2 = (C3621f) objM4514P2;
                                    objM4514P3 = c1836h0.m4514P();
                                    if (objM4514P3 == obj) {
                                    }
                                    interfaceC3599t = (InterfaceC3599t) objM4514P3;
                                    interfaceC1037z = (InterfaceC1037z) c1836h0.m4542j(AbstractC5888h1.f23925g);
                                    c3833h = ((Boolean) c1836h0.m4542j(AbstractC5888h1.f23941w)).booleanValue() ? null : C3826e1.f12544a;
                                    int i312 = i282 << 18;
                                    int i322 = (i272 & 65520) | (i292 & 3670016) | (i312 & 29360128) | (i312 & 234881024) | ((i282 << 27) & 1879048192);
                                    if (((i322 & 112) ^ 48) <= 32) {
                                        if (((i322 & 896) ^ 384) > 256) {
                                            if (((i322 & 7168) ^ 3072) > 2048) {
                                                if (((57344 & i322) ^ 24576) > 16384) {
                                                    if (((i322 & 3670016) ^ 1572864) > 1048576) {
                                                        if (((i322 & 29360128) ^ 12582912) > 8388608) {
                                                            if (((i322 & 234881024) ^ 100663296) > 67108864) {
                                                                if (((i322 & 1879048192) ^ 805306368) > 536870912) {
                                                                    zM4530d = ((((i322 & 112) ^ 48) <= 32 && c1836h0.m4534f(c3641z)) || (i322 & 48) == 32) | ((((i322 & 896) ^ 384) > 256 && c1836h0.m4534f(interfaceC3268x0)) || (i322 & 384) == 256) | ((((i322 & 7168) ^ 3072) > 2048 && c1836h0.m4536g(false)) || (i322 & 3072) == 2048) | ((((57344 & i322) ^ 24576) > 16384 && c1836h0.m4536g(z9)) || (i322 & 24576) == 16384) | c1836h0.m4530d(0) | ((((i322 & 3670016) ^ 1572864) > 1048576 && c1836h0.m4534f(c5843e3)) || (i322 & 1572864) == 1048576) | ((((i322 & 29360128) ^ 12582912) > 8388608 && c1836h0.m4534f(c5844f3)) || (i322 & 12582912) == 8388608) | ((((i322 & 234881024) ^ 100663296) > 67108864 && c1836h0.m4534f(interfaceC3217g3)) || (i322 & 100663296) == 67108864) | ((((i322 & 1879048192) ^ 805306368) > 536870912 && c1836h0.m4534f(interfaceC3223i3)) || (i322 & 805306368) == 536870912) | c1836h0.m4534f(interfaceC1037z) | c1836h0.m4534f(c3833h);
                                                                    objM4514P4 = c1836h0.m4514P();
                                                                    if (zM4530d) {
                                                                        obj2 = obj;
                                                                        i17 = 4;
                                                                        Object c3630o3 = new C3630o(c3641z, z9, interfaceC3268x0, c3627l, interfaceC3223i3, interfaceC3217g3, interfaceC3599t, interfaceC1037z, c3833h, c5843e3, c5844f3);
                                                                        c3627l2 = c3627l;
                                                                        interfaceC3223i2 = interfaceC3223i3;
                                                                        interfaceC3217g2 = interfaceC3217g3;
                                                                        c1836h0.m4545k0(c3630o3);
                                                                        objM4514P4 = c3630o3;
                                                                        C3630o c3630o22 = (C3630o) objM4514P4;
                                                                        EnumC2640p1 enumC2640p12 = !z9 ? EnumC2640p1.f8622g : EnumC2640p1.f8623h;
                                                                        if (z10) {
                                                                        }
                                                                        c3641z2 = c3641z;
                                                                        AbstractC3847o.m8014a(c3627l2, AbstractC2192n.m5442s(AbstractC3847o.m8021h(interfaceC5853o.mo10549d(c3641z.f11809m).mo10549d(c3641z.f11810n), c3627l2, c3621f2, enumC2640p12, z10).mo10549d(interfaceC5853oM8020g).mo10549d(c3641z.f11811o.f12694k), c3641z, enumC2640p12, interfaceC2185k1, z10, c2638p, c3641z.f11803g), c3641z2.f11813q, c3630o22, c1836h0, 0);
                                                                        c5843e2 = c5843e3;
                                                                        c5844f2 = c5844f3;
                                                                    }
                                                                } else {
                                                                    zM4530d = ((((i322 & 112) ^ 48) <= 32 && c1836h0.m4534f(c3641z)) || (i322 & 48) == 32) | ((((i322 & 896) ^ 384) > 256 && c1836h0.m4534f(interfaceC3268x0)) || (i322 & 384) == 256) | ((((i322 & 7168) ^ 3072) > 2048 && c1836h0.m4536g(false)) || (i322 & 3072) == 2048) | ((((57344 & i322) ^ 24576) > 16384 && c1836h0.m4536g(z9)) || (i322 & 24576) == 16384) | c1836h0.m4530d(0) | ((((i322 & 3670016) ^ 1572864) > 1048576 && c1836h0.m4534f(c5843e3)) || (i322 & 1572864) == 1048576) | ((((i322 & 29360128) ^ 12582912) > 8388608 && c1836h0.m4534f(c5844f3)) || (i322 & 12582912) == 8388608) | ((((i322 & 234881024) ^ 100663296) > 67108864 && c1836h0.m4534f(interfaceC3217g3)) || (i322 & 100663296) == 67108864) | ((((i322 & 1879048192) ^ 805306368) > 536870912 && c1836h0.m4534f(interfaceC3223i3)) || (i322 & 805306368) == 536870912) | c1836h0.m4534f(interfaceC1037z) | c1836h0.m4534f(c3833h);
                                                                    objM4514P4 = c1836h0.m4514P();
                                                                    if (zM4530d) {
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
                            } else {
                                z12 = ((((i302 & 112) ^ 48) > 32 && c1836h0.m4536g(z9)) || (i302 & 48) == 32) | ((((i302 & 14) ^ 6) <= 4 && c1836h0.m4534f(c3641z)) || (i302 & 6) == 4);
                                objM4514P2 = c1836h0.m4514P();
                                if (z12) {
                                }
                            }
                        }
                    }
                } else {
                    objM4514P = c1836h0.m4514P();
                    obj = C1851l.f6155a;
                    if (z11) {
                    }
                }
            }
            c1876r1M4557t = c1836h0.m4557t();
            if (c1876r1M4557t == null) {
                final C3641z c3641z3 = c3641z2;
                final C5843e c5843e4 = c5843e2;
                final InterfaceC3217g interfaceC3217g4 = interfaceC3217g2;
                c1876r1M4557t.f6241d = new InterfaceC1235p() { // from class: r.m
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // p085fg.InterfaceC1235p
                    public final Object invoke(Object obj3, Object obj4) {
                        ((Integer) obj4).getClass();
                        int iM4617C = AbstractC1874r.m4617C(i9 | 1);
                        int iM4617C2 = AbstractC1874r.m4617C(i10);
                        AbstractC0018a.m237a(interfaceC5853o, c3641z3, interfaceC3268x0, z9, c2638p, z10, interfaceC2185k1, c5843e4, interfaceC3223i2, c5844f2, interfaceC3217g4, interfaceC1231l, (C1836h0) obj3, iM4617C, iM4617C2, i11);
                        return C3967n.f12976a;
                    }
                };
                return;
            }
            return;
        }
        i22 |= 384;
        if ((i10 & 3072) == 0) {
        }
        if (c1836h0.m4516S(i20 & 1, (i20 & 306783379) == 306783378 || (i22 & 1171) != 1170)) {
        }
        c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t == null) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static final C3145i m238b(Matcher matcher, int i9, CharSequence charSequence) {
        if (matcher.find(i9)) {
            return new C3145i(matcher, charSequence);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m239c(C1421q c1421q, C1845j1 c1845j1, C1425u c1425u, C1425u c1425u2, C1421q c1421q2, C5166o6 c5166o6, ArrayList arrayList, ViewGroup viewGroup, C0416a1 c0416a1) {
        C1425u c1425u3;
        Object obj;
        if (c1421q.f4734g) {
            return;
        }
        c1421q.f4734g = true;
        AbstractC5459x2 abstractC5459x2 = (AbstractC5459x2) c1845j1.getValue();
        if ((abstractC5459x2 instanceof C5360u2) && (obj = c1425u.f4738g) != null) {
            ((InterfaceC1220a) obj).invoke();
            c1425u3 = c1425u2;
        } else if (abstractC5459x2 == null) {
            c1425u3 = c1425u2;
            m232T(c1421q2, c5166o6, c1425u, arrayList, c1425u3, viewGroup, c0416a1);
        } else {
            c1425u3 = c1425u2;
            c1845j1.setValue(AbstractC4955ho.m9307C4(abstractC5459x2));
        }
        Object obj2 = c1425u3.f4738g;
        if (obj2 != null) {
            ((FrameLayout) obj2).post(new RunnableC0003a(c1421q, 29));
        } else {
            AbstractC1416l.m3831g("page");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final double m240d(double d10, double d11, double d12, double d13) {
        double d14 = d10 * d10;
        double d15 = (((d12 * 3.0d) / d10) - ((d11 * d11) / d14)) / 3.0d;
        double d16 = (((d13 * 27.0d) / d10) + (((((d11 * 2.0d) * d11) * d11) / (d14 * d10)) - (((9.0d * d11) * d12) / d14))) / 27.0d;
        double dSqrt = Math.sqrt((((d15 * d15) * d15) / 27.0d) + ((d16 * d16) / 4.0d));
        double d17 = (-d16) / 2.0d;
        return (Math.cbrt(d17 - dSqrt) + Math.cbrt(d17 + dSqrt)) - (d11 / (d10 * 3.0d));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final String m241e(String str) {
        return AbstractC3199a.m6839l(str, str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static C3509m m242f(C4325u c4325u) {
        return AbstractC3508l.m7372Z(new C3403n(C3131d.m6657b(c4325u, C3128a.m6637e(c4325u, AbstractC3506j.m7360x("java.lang.invoke.MethodHandles")), "lookup", Collections.EMPTY_LIST, AbstractC3506j.m7360x("java.lang.invoke.MethodHandles.Lookup")), 1, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C3403n m243g(C4325u c4325u, InterfaceC2823a interfaceC2823a) {
        C4320p c3392c;
        AbstractC3506j abstractC3506jM7362z = AbstractC3506j.m7362z(interfaceC2823a.mo5354e());
        List listM10509c = AbstractC5798s.m10509c(interfaceC2823a.mo5353c(), new C2833a(6));
        ArrayList<AbstractC3506j> arrayList = new ArrayList(listM10509c.size() + 1);
        arrayList.add(abstractC3506jM7362z);
        arrayList.addAll(listM10509c);
        AbstractC3506j abstractC3506jM7360x = AbstractC3506j.m7360x("java.lang.invoke.MethodType");
        C3403n c3403n = new C3403n(C3131d.m6657b(c4325u, C3128a.m6637e(c4325u, abstractC3506jM7360x), "methodType", arrayList, abstractC3506jM7360x), 1, arrayList.size());
        for (AbstractC3506j abstractC3506j : arrayList) {
            abstractC3506j.getClass();
            if (abstractC3506j instanceof C3503g) {
                AbstractC3506j abstractC3506j2 = abstractC3506j.mo7343o().f11438i;
                c3392c = new C3399j(EnumC3400k.f10961M, c4325u.f14439e.m1199h(new C3130c(C3128a.m6637e(c4325u, abstractC3506j2), "TYPE", abstractC3506j2)), 0);
            } else {
                c3392c = new C3392c(abstractC3506j);
            }
            c3403n.mo7178I(AbstractC3508l.m7372Z(c3392c));
        }
        return c3403n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public static EnumC0740a m244h(ArrayList arrayList) {
        String lowerCase = AbstractC4166m.m8392A1(arrayList, " ", null, null, null, 62).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return AbstractC3149m.m6709h0(lowerCase, "chatting", false) ? EnumC0740a.f2200g : AbstractC3149m.m6709h0(lowerCase, "conversation", false) ? EnumC0740a.f2201h : (AbstractC3149m.m6709h0(lowerCase, "addressui", false) || AbstractC3149m.m6709h0(lowerCase, "contact", false)) ? EnumC0740a.f2202i : AbstractC3149m.m6709h0(lowerCase, "profile", false) ? EnumC0740a.f2203j : (AbstractC3149m.m6709h0(lowerCase, "sns", false) || AbstractC3149m.m6709h0(lowerCase, "moments", false)) ? EnumC0740a.f2204k : EnumC0740a.f2205l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static String m245i(String str) {
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (string.length() != 0) {
            if (!AbstractC3156t.m6740d0(string, "#", false)) {
                string = "#".concat(string);
            }
            String strSubstring = string.substring(1);
            if (strSubstring.length() == 6 || strSubstring.length() == 8) {
                for (int i9 = 0; i9 < strSubstring.length(); i9++) {
                    char cCharAt = strSubstring.charAt(i9);
                    if (('0' <= cCharAt && cCharAt < ':') || ('a' <= cCharAt && cCharAt < 'g') || ('A' <= cCharAt && cCharAt < 'G')) {
                    }
                }
                String upperCase = strSubstring.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return "#".concat(upperCase);
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static String m246j(String str) {
        String string = str != null ? AbstractC3149m.m6703R0(str).toString() : null;
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (string.length() != 0) {
            List listM6691F0 = AbstractC3149m.m6691F0(string, new char[]{',', '-', 65292}, 6);
            ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
            Iterator it = listM6691F0.iterator();
            while (it.hasNext()) {
                arrayList.add(m245i((String) it.next()));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((String) obj).length() > 0) {
                    arrayList2.add(obj);
                }
            }
            List listM8403L1 = AbstractC4166m.m8403L1(2, arrayList2);
            if (!listM8403L1.isEmpty()) {
                return AbstractC4166m.m8392A1(listM8403L1, ",", null, null, null, 62);
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m247k(String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String strReplace = str.replace('\n', ' ');
        strReplace.getClass();
        String strReplace2 = strReplace.replace('\r', ' ');
        strReplace2.getClass();
        String strReplace3 = strReplace2.replace('\t', ' ');
        strReplace3.getClass();
        return AbstractC3149m.m6701P0(8, AbstractC3149m.m6703R0(strReplace3).toString());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final void m248l(Context context) {
        View viewM255s;
        context.getClass();
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity != null) {
            Window window = activity.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
            if (viewGroup == null || (viewM255s = m255s(viewGroup)) == null) {
                return;
            }
            Object tag = viewM255s.getTag(R.id.hchat_settings_page_host);
            C5166o6 c5166o6 = tag instanceof C5166o6 ? (C5166o6) tag : null;
            if (c5166o6 == null || !c5166o6.f19317a) {
                return;
            }
            InterfaceC1220a interfaceC1220a = c5166o6.f19319c;
            if (interfaceC1220a == null) {
                interfaceC1220a = c5166o6.f19318b;
            }
            if (interfaceC1220a != null) {
                interfaceC1220a.invoke();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static int m249m(Comparable comparable, Comparable comparable2) {
        if (comparable == null) {
            return comparable2 == null ? 0 : -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static Object m250n(C2958a c2958a) {
        if (c2958a == null) {
            return null;
        }
        Object obj = c2958a.f9705h;
        switch (AbstractC4106c.m8279b(c2958a.f9704g)) {
            case 0:
                return AbstractC3508l.m7368S(0L, AbstractC3506j.f11394k);
            case 1:
                return Boolean.TRUE.equals(obj) ? new C3510n(1L, AbstractC3506j.f11386c) : new C3510n(0L, AbstractC3506j.f11386c);
            case 2:
                return AbstractC3508l.m7368S(((Byte) obj).byteValue(), AbstractC3506j.f11387d);
            case 3:
                return AbstractC3508l.m7368S(((Short) obj).shortValue(), AbstractC3506j.f11388e);
            case 4:
                return AbstractC3508l.m7368S(((Character) obj).charValue(), AbstractC3506j.f11389f);
            case 5:
                return AbstractC3508l.m7368S(((Integer) obj).intValue(), AbstractC3506j.f11385b);
            case 6:
                return AbstractC3508l.m7368S(((Long) obj).longValue(), AbstractC3506j.f11392i);
            case 7:
                return AbstractC3508l.m7368S(Float.floatToIntBits(((Float) obj).floatValue()), AbstractC3506j.f11390g);
            case 8:
                return AbstractC3508l.m7368S(Double.doubleToLongBits(((Double) obj).doubleValue()), AbstractC3506j.f11391h);
            case 9:
                return (String) obj;
            case 10:
                return AbstractC3506j.m7362z((String) obj);
            default:
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static AbstractC3508l m251o(C4325u c4325u, C2958a c2958a) {
        String strM2251n;
        C4320p c3393d;
        Object obj = c2958a.f9705h;
        int i9 = c2958a.f9704g;
        int iM8279b = AbstractC4106c.m8279b(i9);
        if (iM8279b == 14) {
            return AbstractC3508l.m7372Z(m243g(c4325u, (InterfaceC2823a) obj));
        }
        C2128d c2128d = null;
        if (iM8279b != 15) {
            switch (iM8279b) {
                case 0:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    return (AbstractC3508l) m250n(c2958a);
                case 1:
                    return AbstractC3508l.m7368S(((Boolean) obj).booleanValue() ? 0L : 1L, AbstractC3506j.f11386c);
                case 9:
                    return AbstractC3508l.m7372Z(new C3393d((String) obj));
                case 10:
                    return AbstractC3508l.m7372Z(new C3392c(AbstractC3506j.m7362z((String) obj)));
                default:
                    C0086a.m452k("Unsupported type for raw invoke-custom: ".concat(AbstractC2091b.m5176w(i9)));
                    return null;
            }
        }
        C3494d c3494d = (C3494d) obj;
        if (AbstractC2091b.m5154a(c3494d.m7337b())) {
            switch (c3494d.f11356a) {
                case 0:
                    c2128d = (C2128d) c3494d.f11358c;
                    break;
            }
            c3393d = new C3393d("FIELD:".concat(String.valueOf(c2128d)));
        } else {
            C2132h c2132hM7336a = c3494d.m7336a();
            c2132hM7336a.m5355a();
            C3128a c3128aM6637e = C3128a.m6637e(c4325u, AbstractC3506j.m7360x("java.lang.invoke.MethodHandles.Lookup"));
            int iM7337b = c3494d.m7337b();
            switch (AbstractC4106c.m8279b(iM7337b)) {
                case 4:
                    strM2251n = "findStatic";
                    break;
                case 5:
                case 6:
                case 8:
                    strM2251n = "findVirtual";
                    break;
                case 7:
                    strM2251n = "findConstructor";
                    break;
                default:
                    strM2251n = AbstractC0921a.m2251n("<", AbstractC2091b.m5175v(iM7337b), ">");
                    break;
            }
            C3403n c3403n = new C3403n(C3131d.m6657b(c4325u, c3128aM6637e, strM2251n, Arrays.asList(AbstractC3506j.f11395l, AbstractC3506j.f11396m, AbstractC3506j.m7360x("java.lang.invoke.MethodType")), AbstractC3506j.m7360x("java.lang.invoke.MethodHandle")), 2, 4);
            c3403n.mo7178I(m242f(c4325u));
            c3403n.mo7178I(AbstractC3508l.m7372Z(new C3392c(AbstractC3506j.m7360x(c2132hM7336a.f7116c))));
            c3403n.mo7178I(AbstractC3508l.m7372Z(new C3393d(c2132hM7336a.f7115b)));
            c3403n.mo7178I(AbstractC3508l.m7372Z(m243g(c4325u, c2132hM7336a)));
            c3393d = c3403n;
        }
        return AbstractC3508l.m7372Z(c3393d);
    }

    /* JADX DEBUG: Class process forced to load method for inline: a1.c.r(java.lang.Object):android.view.translation.ViewTranslationResponse */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static void m252p(ViewOnAttachStateChangeListenerC0011i viewOnAttachStateChangeListenerC0011i, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        C1055r c1055r;
        C1054q c1054q;
        InterfaceC1231l interfaceC1231l;
        int size = longSparseArray.size();
        for (int i9 = 0; i9 < size; i9++) {
            long jKeyAt = longSparseArray.keyAt(i9);
            ViewTranslationResponse viewTranslationResponseM134r = AbstractC0005c.m134r(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseM134r != null && (value = viewTranslationResponseM134r.getValue("android:text")) != null && (text = value.getText()) != null && (c1055r = (C1055r) viewOnAttachStateChangeListenerC0011i.m157h().m2313b((int) jKeyAt)) != null && (c1054q = c1055r.f3353a) != null) {
                Object objM2320g = c1054q.f3350d.f3341g.m2320g(AbstractC1049l.f3326l);
                if (objM2320g == null) {
                    objM2320g = null;
                }
                C1038a c1038a = (C1038a) objM2320g;
                if (c1038a != null && (interfaceC1231l = (InterfaceC1231l) c1038a.f3270b) != null) {
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final String m253q(List list) throws JSONException {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2921i c2921i = (C2921i) it.next();
            String string = AbstractC3149m.m6703R0(c2921i.f9494b).toString();
            if (string.length() > 0) {
                linkedHashMap.put(AbstractC3149m.m6703R0(string).toString(), C2921i.m6338a(c2921i, AbstractC3149m.m6703R0(string).toString(), string, null, false, null, 124));
            }
        }
        Collection<C2921i> collectionValues = linkedHashMap.values();
        collectionValues.getClass();
        for (C2921i c2921i2 : collectionValues) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("id", m241e(c2921i2.f9494b));
            jSONObject.put("targetId", c2921i2.f9494b);
            jSONObject.put("label", c2921i2.f9495c);
            jSONObject.put("enabled", c2921i2.f9496d);
            jSONObject.put("templateId", c2921i2.f9497e);
            jSONObject.put("customRules", c2921i2.f9498f);
            C2922j c2922j = c2921i2.f9499g;
            if (c2922j != null) {
                jSONObject.put("overrideRule", m233U(c2922j));
            }
            jSONArray.put(jSONObject);
        }
        String string2 = jSONArray.toString();
        string2.getClass();
        return string2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static final String m254r(List list) throws JSONException {
        list.getClass();
        JSONArray jSONArray = new JSONArray();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C2920h c2920h = (C2920h) it.next();
            if (c2920h.f9489b != 0) {
                JSONObject jSONObject = new JSONObject();
                String strValueOf = c2920h.f9488a;
                if (AbstractC3149m.m6721t0(strValueOf)) {
                    strValueOf = String.valueOf(System.currentTimeMillis());
                }
                jSONObject.put("id", strValueOf);
                jSONObject.put("mode", c2920h.f9489b);
                jSONObject.put("content", c2920h.f9490c);
                long j3 = c2920h.f9491d;
                if (j3 < 0) {
                    j3 = 0;
                }
                jSONObject.put("delayMs", j3);
                jSONObject.put("random", c2920h.f9492e);
                jSONArray.put(jSONObject);
            }
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:3:0x0006 */
    /* JADX INFO: renamed from: s */
    public static View m255s(ViewGroup viewGroup) {
        View childAt;
        int childCount = viewGroup.getChildCount();
        do {
            childCount--;
            if (-1 >= childCount) {
                return null;
            }
            childAt = viewGroup.getChildAt(childCount);
        } while (!AbstractC1416l.m3825a(childAt.getTag(), "Hchat:MiuixSettingsPage"));
        return childAt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static EnumC0740a m256t(Object obj) {
        if (obj == null) {
            return EnumC0740a.f2205l;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(obj.getClass().getName());
        Class<?> superclass = obj.getClass();
        for (int i9 = 0; superclass != null && !superclass.equals(Object.class) && i9 < 3; i9++) {
            for (Field field : KavaReflector.declaredFields(superclass)) {
                arrayList.add(field.getType().getName());
                Object field2 = KavaReflector.readField(field, obj);
                if (field2 != null) {
                    arrayList.add(field2.getClass().getName());
                }
            }
            superclass = superclass.getSuperclass();
        }
        return m244h(arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static int m257u(byte b10) {
        if (b10 == 1) {
            return 1;
        }
        if (b10 == 2) {
            return 2;
        }
        if (b10 == 3) {
            return 3;
        }
        if (b10 == 4) {
            return 4;
        }
        if (b10 == 5) {
            return 5;
        }
        if (b10 == 6) {
            return 6;
        }
        if (b10 == 7) {
            return 7;
        }
        if (b10 == 8) {
            return 8;
        }
        if (b10 == 9) {
            return 9;
        }
        if (b10 == 10) {
            return 10;
        }
        if (b10 == 11) {
            return 11;
        }
        if (b10 == 12) {
            return 12;
        }
        if (b10 == 13) {
            return 13;
        }
        if (b10 == 14) {
            return 14;
        }
        if (b10 == 15) {
            return 15;
        }
        C2104o.m5294t(AbstractC4855en.m9263g("Unknown AnnotationEncodeValueType: ", String.valueOf(b10 & 255)));
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static InterfaceC0254d m258v(C4309e c4309e) {
        if (c4309e.f9217g.mo6235a(EnumC2824a.f9166s)) {
            return InterfaceC0254d.f707a;
        }
        C0257g c0257g = c4309e.f14371k.f14435a;
        int iM8279b = AbstractC4106c.m8279b(c0257g.f735U);
        if (iM8279b == 0) {
            return (InterfaceC0254d) m236X(c4309e, new CallableC1205b(new C1204a(c4309e, c0257g), 1));
        }
        if (iM8279b == 1) {
            return new C1202e((String) m236X(c4309e, new CallableC1205b(new C1399b(c4309e), 0)));
        }
        C0086a.m452k("Unknown output format");
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static final C2238a m259w(View view) {
        C2238a c2238a = (C2238a) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (c2238a != null) {
            return c2238a;
        }
        C2238a c2238a2 = new C2238a();
        view.setTag(R.id.pooling_container_listener_holder_tag, c2238a2);
        return c2238a2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final Bundle m260x(String str, Bundle bundle) {
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        C2104o.m5294t(AbstractC0921a.m2251n("No valid saved state was found for the key '", str, "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."));
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static final EnumC4094j m261y(C1935k0 c1935k0, int i9) {
        C1933j0 c1933j0 = c1935k0.f6561a;
        C1942o c1942o = c1935k0.f6562b;
        if (c1933j0.f6549a.f6529h.length() != 0) {
            int iM4827d = c1942o.m4827d(i9);
            if ((i9 != 0 && iM4827d == c1942o.m4827d(i9 - 1)) || (i9 != c1933j0.f6549a.f6529h.length() && iM4827d == c1942o.m4827d(i9 + 1))) {
                return c1935k0.m4801a(i9);
            }
        }
        return c1935k0.m4808h(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m262z(int i9, Object obj) {
        C2028v c2028vM227O = m227O(obj);
        return c2028vM227O != null && c2028vM227O.f6856b == i9 && (c2028vM227O.f6857c & (-1073741824)) == Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: D */
    public abstract void mo263D(Throwable th2);

    /* JADX INFO: renamed from: E */
    public abstract void mo264E(C1671c c1671c);
}
