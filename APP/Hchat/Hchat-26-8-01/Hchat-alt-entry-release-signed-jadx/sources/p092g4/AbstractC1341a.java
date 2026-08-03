package p092g4;

import ac.AbstractC0063p;
import ac.SharedPreferencesC0062o;
import ae.C0073d;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.widget.ListView;
import androidx.compose.p013ui.input.pointer.PointerInputEventHandler;
import be.C0294m0;
import bi.AbstractC0316d;
import bi.AbstractC0323k;
import bi.AbstractC0325m;
import bi.C0314b;
import bi.C0324l;
import bsh.org.objectweb.asm.Opcodes;
import gf.C1402a;
import gg.AbstractC1416l;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.function.IntConsumer;
import mc.InterfaceC2823a;
import md.EnumC2824a;
import me.C2833a;
import nc.C2958a;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import org.json.JSONObject;
import org.luckypray.dexkit.DexKitBridge;
import p000a.AbstractC0000a;
import p007a7.AbstractC0018a;
import p012ah.C0086a;
import p015b0.C0141g;
import p028c1.AbstractC0378h;
import p057e1.C0807b;
import p068eh.AbstractC0921a;
import p069f.C0933f0;
import p069f.C0964v;
import p069f.C0965w;
import p071f1.AbstractC0996c0;
import p071f1.InterfaceC0998d0;
import p071f1.InterfaceC1026r0;
import p077f8.AbstractC1089i;
import p080fb.C1136j0;
import p080fb.C1152n0;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p092g4.AbstractC1341a;
import p096g8.C1368i;
import p099h.Hchat.dexkit.DexBridgeHolder;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p099h.Hchat.utils.KavaReflector;
import p115hh.C1730o;
import p116i.AbstractC1742d;
import p116i.C1739c;
import p117i0.AbstractC1855m;
import p117i0.AbstractC1863o;
import p117i0.AbstractC1874r;
import p117i0.C1823e;
import p117i0.C1824e0;
import p117i0.C1829f1;
import p117i0.C1833g1;
import p117i0.C1836h0;
import p117i0.C1848k0;
import p117i0.C1851l;
import p117i0.C1876r1;
import p117i0.InterfaceC1809a1;
import p117i0.InterfaceC1810a2;
import p119i2.C1941n0;
import p136j8.AbstractC2091b;
import p136j8.C2104o;
import p141jf.C2132h;
import p143jh.C2152p;
import p144k.AbstractC2192n;
import p154k9.C2366j;
import p154k9.EnumC2359c;
import p159l0.C2420b;
import p159l0.C2425g;
import p159l0.C2429k;
import p174m.C2571a;
import p174m.C2595e3;
import p177m2.C2767k;
import p215od.C3128a;
import p215od.C3131d;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.AbstractC3226j;
import p222p.AbstractC3241o;
import p222p.AbstractC3253s;
import p222p.C3200a0;
import p222p.C3202b;
import p222p.C3205c;
import p222p.C3250r;
import p222p.C3255s1;
import p222p.C3256t;
import p233pd.C3401l;
import p233pd.C3403n;
import p245qc.C3494d;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p246qd.C3512p;
import p249qg.InterfaceC3599t;
import p254r3.C3658e;
import p256r6.C3709c;
import p256r6.EnumC3708b;
import p259r9.AbstractC3754e0;
import p266s0.AbstractC3879i;
import p266s0.C3874d;
import p266s0.C3878h;
import p267s1.AbstractC3898h0;
import p267s1.AbstractC3913s;
import p267s1.C3887c;
import p267s1.C3914t;
import p269s3.C3927e;
import p276sf.C3959f;
import p276sf.C3967n;
import p279t1.C4081a;
import p279t1.C4082b;
import p279t1.C4084d;
import p280t2.C4095k;
import p292u1.AbstractC4229a;
import p293u2.C4236f;
import p293u2.C4238h;
import p293u2.InterfaceC4233c;
import p302ud.C4305a;
import p302ud.C4309e;
import p302ud.C4322r;
import p302ud.C4325u;
import p304uf.C4329c;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4412n0;
import p311v4.AbstractC4457f0;
import p311v4.C4449b0;
import p311v4.C4451c0;
import p311v4.C4453d0;
import p311v4.C4456f;
import p311v4.C4458g;
import p311v4.C4461j;
import p311v4.C4462k;
import p311v4.C4465n;
import p311v4.C4466o;
import p311v4.C4469r;
import p311v4.C4473v;
import p321w.C4639u0;
import p332wb.AbstractC4855en;
import p332wb.C4960ht;
import p332wb.C5040kc;
import p332wb.C5086lp;
import p332wb.C5475xi;
import p332wb.C5539zi;
import p332wb.C5546zp;
import p338x0.C5580j;
import p339x1.C5593d;
import p339x1.C5597e;
import p339x1.C5601f;
import p339x1.C5660y;
import p339x1.InterfaceC5605g;
import p343x6.AbstractC5700d;
import p351xe.AbstractC5798s;
import p351xe.C5786g;
import p354xh.AbstractC5824i;
import p354xh.C5816a;
import p354xh.C5822g;
import p354xh.C5823h;
import p356y0.AbstractC5839a;
import p356y0.C5840b;
import p356y0.C5850l;
import p356y0.InterfaceC5841c;
import p356y0.InterfaceC5853o;
import p357y1.AbstractC5888h1;
import p357y1.AbstractC5891i0;
import p357y1.C5944v1;
import p357y1.InterfaceC5885g2;
import p357y1.InterfaceC5917o2;
import p373z0.C6065e;
import p373z0.InterfaceC6073m;
import p376z4.C6090d;
import sh.AbstractC4045s;
import sh.C3987a0;
import td.C4145a;
import tf.AbstractC4165l;
import tf.AbstractC4166m;
import tf.AbstractC4178y;
import tf.C4173t;
import ua.C4297h;
import ua.C4298i;

/* JADX INFO: renamed from: g4.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1341a {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A */
    public static boolean m3570A(ArrayList arrayList) {
        if (arrayList.size() >= 6) {
            C2958a c2958a = (C2958a) arrayList.get(0);
            if (c2958a.f9704g == 16) {
                C3494d c3494d = (C3494d) c2958a.f9705h;
                if (c3494d.m7337b() == 5) {
                    C2132h c2132hM7336a = c3494d.m7336a();
                    if (c2132hM7336a.f7116c.equals("Ljava/lang/invoke/LambdaMetafactory;")) {
                        String str = c2132hM7336a.f7115b;
                        if (str.equals("metafactory") || str.equals("altMetafactory")) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B */
    public static final long m3571B(Object obj) {
        if (obj == null) {
            return 0L;
        }
        String[] strArr = {"field_localId", "localId", "id"};
        for (int i9 = 0; i9 < 3; i9++) {
            Object field = KavaReflector.readField(obj, strArr[i9]);
            Number number = field instanceof Number ? (Number) field : null;
            if (number != null) {
                Long lValueOf = Long.valueOf(number.longValue());
                Long l10 = Boolean.valueOf((lValueOf.longValue() > 0L ? 1 : (lValueOf.longValue() == 0L ? 0 : -1)) > 0).booleanValue() ? lValueOf : null;
                if (l10 != null) {
                    return l10.longValue();
                }
            }
        }
        return 0L;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: C */
    public static List m3572C(String str) {
        Object c3959f;
        C4173t c4173t = C4173t.f13710g;
        if (str == null) {
            return c4173t;
        }
        try {
            if (AbstractC3149m.m6721t0(str)) {
                return c4173t;
            }
            JSONArray jSONArray = new JSONArray(str);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("targetId");
                    strOptString.getClass();
                    String string = AbstractC3149m.m6703R0(strOptString).toString();
                    if (!AbstractC3149m.m6721t0(string)) {
                        String strOptString2 = jSONObjectOptJSONObject.optString("label");
                        String str2 = AbstractC3149m.m6721t0(strOptString2) ? string : strOptString2;
                        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", false);
                        String strOptString3 = jSONObjectOptJSONObject.optString("templateId");
                        strOptString3.getClass();
                        linkedHashMap.put(string, new C4297h(string, string, str2, strOptString3, zOptBoolean));
                    }
                }
            }
            Collection collectionValues = linkedHashMap.values();
            collectionValues.getClass();
            c3959f = AbstractC4166m.m8407P1(collectionValues);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = c4173t;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: D */
    public static C4298i m3573D(String str, JSONObject jSONObject) {
        String strOptString = jSONObject.optString("notifyText", "已收款 {amount} 元");
        String strOptString2 = jSONObject.optString("id");
        if (AbstractC3149m.m6721t0(strOptString2)) {
            strOptString2 = String.valueOf(System.currentTimeMillis());
        }
        String str2 = strOptString2;
        str2.getClass();
        String strOptString3 = jSONObject.optString("name");
        String str3 = AbstractC3149m.m6721t0(strOptString3) ? str : strOptString3;
        boolean zOptBoolean = jSONObject.optBoolean("enabled", false);
        int iOptInt = jSONObject.optInt("delayMode", 0);
        long jOptLong = jSONObject.optLong("delayMs", 0L);
        long jOptLong2 = jSONObject.optLong("randomMinMs", 0L);
        long jOptLong3 = jSONObject.optLong("randomMaxMs", 0L);
        String strOptString4 = jSONObject.optString("receiveAccount", "default");
        strOptString4.getClass();
        int iOptInt2 = jSONObject.optInt("listMode", 0);
        String strOptString5 = jSONObject.optString("whitelist");
        strOptString5.getClass();
        String strOptString6 = jSONObject.optString("blacklist");
        strOptString6.getClass();
        boolean zOptBoolean2 = jSONObject.optBoolean("amountEnabled", false);
        int iOptInt3 = jSONObject.optInt("amountCondition", 1);
        String strOptString7 = jSONObject.optString("amountValue", "0");
        strOptString7.getClass();
        int iOptInt4 = jSONObject.optInt("amountAction", 0);
        int iOptInt5 = jSONObject.optInt("keywordMode", 0);
        String strOptString8 = jSONObject.optString("keywords");
        strOptString8.getClass();
        boolean zOptBoolean3 = jSONObject.optBoolean("quietEnabled", false);
        int iOptInt6 = jSONObject.optInt("quietStartSecond", 0);
        int iOptInt7 = jSONObject.optInt("quietEndSecond", 0);
        boolean zOptBoolean4 = jSONObject.optBoolean("refundRejected", false);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("replySteps");
        List listM222J = AbstractC0018a.m222J(jSONArrayOptJSONArray != null ? jSONArrayOptJSONArray.toString() : null);
        boolean zOptBoolean5 = jSONObject.optBoolean("notificationConfigured", jSONObject.has("notifySystemEnabled"));
        boolean zOptBoolean6 = jSONObject.optBoolean("notifySystemEnabled", false);
        boolean zOptBoolean7 = jSONObject.optBoolean("notifyToastEnabled", false);
        boolean zOptBoolean8 = jSONObject.optBoolean("notifySoundEnabled", false);
        int iOptInt8 = jSONObject.optInt("notifySoundMode", 0);
        boolean zOptBoolean9 = jSONObject.optBoolean("notifyVibrateEnabled", false);
        String strOptString9 = jSONObject.optString("notifySoundUri");
        strOptString9.getClass();
        strOptString.getClass();
        String strOptString10 = jSONObject.optString("notifyToastText", strOptString);
        strOptString10.getClass();
        boolean zOptBoolean10 = jSONObject.optBoolean("announceEnabled", false);
        String strOptString11 = jSONObject.optString("announceText", "收到转账 {amount} 元");
        strOptString11.getClass();
        return new C4298i(str2, str3, zOptBoolean, iOptInt, jOptLong, jOptLong2, jOptLong3, strOptString4, iOptInt2, strOptString5, strOptString6, zOptBoolean2, iOptInt3, strOptString7, iOptInt4, iOptInt5, strOptString8, zOptBoolean3, iOptInt6, iOptInt7, zOptBoolean4, listM222J, zOptBoolean5, zOptBoolean6, zOptBoolean7, zOptBoolean8, iOptInt8, zOptBoolean9, strOptString9, strOptString, strOptString10, zOptBoolean10, strOptString11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E */
    public static List m3574E(String str) {
        Object c3959f;
        C4173t c4173t = C4173t.f13710g;
        if (str == null) {
            return c4173t;
        }
        try {
            if (AbstractC3149m.m6721t0(str)) {
                return c4173t;
            }
            JSONArray jSONArray = new JSONArray(str);
            C4329c c4329cM7E = AbstractC0000a.m7E();
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i9);
                if (jSONObjectOptJSONObject != null) {
                    c4329cM7E.add(m3573D("模板 " + (i9 + 1), jSONObjectOptJSONObject));
                }
            }
            c3959f = AbstractC0000a.m90t(c4329cM7E);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = c4173t;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: F */
    public static final void m3575F(float[] fArr, float[] fArr2, int i9, float[] fArr3) {
        if (i9 == 0) {
            AbstractC4229a.m8493a("At least one point must be provided");
        }
        int i10 = 2 >= i9 ? i9 - 1 : 2;
        int i11 = i10 + 1;
        float[][] fArr4 = new float[i11][];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr4[i12] = new float[i9];
        }
        for (int i13 = 0; i13 < i9; i13++) {
            fArr4[0][i13] = 1.0f;
            for (int i14 = 1; i14 < i11; i14++) {
                fArr4[i14][i13] = fArr4[i14 - 1][i13] * fArr[i13];
            }
        }
        float[][] fArr5 = new float[i11][];
        for (int i15 = 0; i15 < i11; i15++) {
            fArr5[i15] = new float[i9];
        }
        float[][] fArr6 = new float[i11][];
        for (int i16 = 0; i16 < i11; i16++) {
            fArr6[i16] = new float[i11];
        }
        int i17 = 0;
        while (i17 < i11) {
            float[] fArr7 = fArr5[i17];
            float[] fArr8 = fArr4[i17];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i9);
            for (int i18 = 0; i18 < i17; i18++) {
                float[] fArr9 = fArr5[i18];
                float fM3596l = m3596l(fArr7, fArr9);
                for (int i19 = 0; i19 < i9; i19++) {
                    fArr7[i19] = fArr7[i19] - (fArr9[i19] * fM3596l);
                }
            }
            float fSqrt = (float) Math.sqrt(m3596l(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f3 = 1.0f / fSqrt;
            for (int i20 = 0; i20 < i9; i20++) {
                fArr7[i20] = fArr7[i20] * f3;
            }
            float[] fArr10 = fArr6[i17];
            int i21 = 0;
            while (i21 < i11) {
                fArr10[i21] = i21 < i17 ? 0.0f : m3596l(fArr7, fArr4[i21]);
                i21++;
            }
            i17++;
        }
        for (int i22 = i10; -1 < i22; i22--) {
            float fM3596l2 = m3596l(fArr5[i22], fArr2);
            float[] fArr11 = fArr6[i22];
            int i23 = i22 + 1;
            if (i23 <= i10) {
                int i24 = i10;
                while (true) {
                    fM3596l2 -= fArr11[i24] * fArr3[i24];
                    if (i24 != i23) {
                        i24--;
                    }
                }
            }
            fArr3[i22] = fM3596l2 / fArr11[i22];
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G */
    public static final byte[] m3576G(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m3594j(inputStream, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        byteArray.getClass();
        return byteArray;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H */
    public static Object m3577H(Object obj, LinkedHashSet linkedHashSet) {
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(AbstractC4178y.m8438a0(1));
        AbstractC4165l.m8373J0(new Integer[]{0}, linkedHashSet2);
        for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
            Iterator<Field> it = KavaReflector.declaredFields(superclass).iterator();
            while (it.hasNext()) {
                Object field = KavaReflector.readField(it.next(), obj);
                if (field != null) {
                    if (field instanceof ListView) {
                        linkedHashSet2.add(Integer.valueOf(((ListView) field).getHeaderViewsCount()));
                    } else if (AbstractC0921a.m2263z("com.tencent.mm.plugin.fav.ui.adapter.", field, false)) {
                        arrayList.add(field);
                    }
                }
            }
        }
        for (Object obj2 : arrayList) {
            List<Method> listDeclaredMethods = KavaReflector.declaredMethods(obj2.getClass());
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : listDeclaredMethods) {
                Method method = (Method) obj3;
                if (!Modifier.isStatic(method.getModifiers()) && method.getParameterTypes().length == 1 && AbstractC1416l.m3825a(method.getParameterTypes()[0], Integer.TYPE) && !AbstractC1416l.m3825a(method.getReturnType(), Void.TYPE) && !method.getReturnType().isPrimitive()) {
                    arrayList2.add(obj3);
                }
            }
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                int iIntValue = ((Number) it2.next()).intValue();
                Iterator it3 = linkedHashSet2.iterator();
                while (it3.hasNext()) {
                    int iIntValue2 = iIntValue - ((Number) it3.next()).intValue();
                    int[] iArr = {iIntValue2 - 1, iIntValue2, iIntValue - 1, iIntValue};
                    LinkedHashSet linkedHashSet3 = new LinkedHashSet(AbstractC4178y.m8438a0(4));
                    for (int i9 = 0; i9 < 4; i9++) {
                        linkedHashSet3.add(Integer.valueOf(iArr[i9]));
                    }
                    Iterator it4 = AbstractC4166m.m8407P1(linkedHashSet3).iterator();
                    while (it4.hasNext()) {
                        int iIntValue3 = ((Number) it4.next()).intValue();
                        if (iIntValue3 >= 0) {
                            Iterator it5 = arrayList2.iterator();
                            while (it5.hasNext()) {
                                Object objInvoke = KavaReflector.invoke((Method) it5.next(), obj2, Integer.valueOf(iIntValue3));
                                if (m3610z(objInvoke)) {
                                    return objInvoke;
                                }
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: I */
    public static Object m3578I(int i9, Object obj, Set set) {
        Object field;
        Object obj2 = null;
        if (obj != null && i9 <= 4 && set.add(obj)) {
            if (m3610z(obj)) {
                return obj;
            }
            if (obj instanceof Object[]) {
                for (Object obj3 : (Object[]) obj) {
                    Object objM3578I = m3578I(i9 + 1, obj3, set);
                    if (objM3578I != null) {
                        return objM3578I;
                    }
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    Object objM3578I2 = m3578I(i9 + 1, it.next(), set);
                    if (objM3578I2 != null) {
                        return objM3578I2;
                    }
                }
            } else {
                if (obj instanceof View) {
                    return m3578I(i9 + 1, ((View) obj).getTag(), set);
                }
                String name = obj.getClass().getName();
                if (!AbstractC3156t.m6740d0(name, "java.", false) && !AbstractC3156t.m6740d0(name, "android.", false)) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    ArrayList arrayList = new ArrayList();
                    for (Class<?> superclass = obj.getClass(); superclass != null && !superclass.equals(Object.class); superclass = superclass.getSuperclass()) {
                        Iterator<Field> it2 = KavaReflector.declaredFields(superclass).iterator();
                        while (it2.hasNext()) {
                            Object field2 = KavaReflector.readField(it2.next(), obj);
                            if (field2 != null) {
                                if (field2 instanceof Number) {
                                    linkedHashSet.add(Integer.valueOf(((Number) field2).intValue()));
                                } else if (AbstractC0921a.m2263z("com.tencent.mm.plugin.fav.ui.", field2, false)) {
                                    arrayList.add(field2);
                                }
                            }
                        }
                    }
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object objM3577H = m3577H(it3.next(), linkedHashSet);
                        if (objM3577H != null) {
                            obj2 = objM3577H;
                            break;
                        }
                    }
                    if (obj2 != null) {
                        return obj2;
                    }
                    for (Class<?> superclass2 = obj.getClass(); superclass2 != null && !superclass2.equals(Object.class); superclass2 = superclass2.getSuperclass()) {
                        for (Field field3 : KavaReflector.declaredFields(superclass2)) {
                            if (!field3.getType().isPrimitive() && !AbstractC1416l.m3825a(field3.getType(), String.class) && (field = KavaReflector.readField(field3, obj)) != null) {
                                if (m3610z(field)) {
                                    return field;
                                }
                                Object objM3578I3 = m3578I(i9 + 1, field, set);
                                if (objM3578I3 != null) {
                                    return objM3578I3;
                                }
                            }
                        }
                    }
                    LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                    for (Class<?> superclass3 = obj.getClass(); superclass3 != null && !superclass3.equals(Object.class); superclass3 = superclass3.getSuperclass()) {
                        Iterator<Field> it4 = KavaReflector.declaredFields(superclass3).iterator();
                        while (it4.hasNext()) {
                            Object field4 = KavaReflector.readField(it4.next(), obj);
                            if (field4 != null && (field4 instanceof Number)) {
                                linkedHashSet2.add(Integer.valueOf(((Number) field4).intValue()));
                            }
                        }
                    }
                    return m3577H(obj, linkedHashSet2);
                }
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: J */
    public static final Object m3579J(Object obj) {
        Set setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        setNewSetFromMap.getClass();
        return m3578I(0, obj, setNewSetFromMap);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K */
    public static C2571a m3580K(Class cls) {
        return new C2571a(new C3709c(cls, EnumC3708b.f12060g), 10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: L */
    public static final int m3581L(C0964v c0964v) {
        int iM2371c;
        int i9 = c0964v.f3036b;
        int iM2371c2 = c0964v.m2371c(0);
        while (c0964v.f3036b != 0 && c0964v.m2371c(0) == iM2371c2) {
            int i10 = c0964v.f3036b;
            if (i10 == 0) {
                C2104o.m5287l("IntList is empty.");
                return 0;
            }
            c0964v.m2373e(0, c0964v.f3035a[i10 - 1]);
            c0964v.m2372d(c0964v.f3036b - 1);
            int i11 = c0964v.f3036b;
            int i12 = i11 >>> 1;
            int i13 = 0;
            while (i13 < i12) {
                int iM2371c3 = c0964v.m2371c(i13);
                int i14 = (i13 + 1) * 2;
                int i15 = i14 - 1;
                int iM2371c4 = c0964v.m2371c(i15);
                if (i14 >= i11 || (iM2371c = c0964v.m2371c(i14)) <= iM2371c4) {
                    if (iM2371c4 > iM2371c3) {
                        c0964v.m2373e(i13, iM2371c4);
                        c0964v.m2373e(i15, iM2371c3);
                        i13 = i15;
                    }
                } else if (iM2371c > iM2371c3) {
                    c0964v.m2373e(i13, iM2371c);
                    c0964v.m2373e(i14, iM2371c3);
                    i13 = i14;
                }
            }
        }
        return iM2371c2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x000d */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:19:0x000d */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [f1.n0, x0.j] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: M */
    public static final ArrayList m3582M(C2425g c2425g, int i9, Integer num) {
        ?? c5580j = new C5580j(c2425g);
        int iM5776q = c2425g.m5776q(i9);
        C2420b c2420bM5760a = c2425g.m5760a(i9);
        while (i9 >= 0) {
            c5580j.m2624m(c2425g.m5768i(i9), c2425g.m5770k(i9) ? c2425g.m5775p(c2425g.f7936b, i9) : C1851l.f6155a, c2425g.f7935a.m5786g(i9), num);
            if (iM5776q >= 0) {
                C2420b c2420b = c2420bM5760a;
                c2420bM5760a = c2425g.m5760a(iM5776q);
                i9 = iM5776q;
                iM5776q = c2425g.m5776q(iM5776q);
                num = c2420b;
            } else {
                i9 = iM5776q;
                num = c2420bM5760a;
            }
        }
        return (ArrayList) c5580j.f3204g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N */
    public static void m3583N(C6090d c6090d, int i9, long j3) {
        int iNumberOfTrailingZeros = 64 - Long.numberOfTrailingZeros(j3);
        if (iNumberOfTrailingZeros == 0) {
            iNumberOfTrailingZeros = 1;
        }
        int i10 = (iNumberOfTrailingZeros + 7) >> 3;
        long j4 = j3 >> (64 - (i10 * 8));
        c6090d.m10834j(i9 | ((i10 - 1) << 5));
        while (i10 > 0) {
            c6090d.m10834j((byte) j4);
            j4 >>= 8;
            i10--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public static void m3584O(C6090d c6090d, int i9, long j3) {
        int iNumberOfLeadingZeros = 64 - Long.numberOfLeadingZeros(j3);
        if (iNumberOfLeadingZeros == 0) {
            iNumberOfLeadingZeros = 1;
        }
        int i10 = (iNumberOfLeadingZeros + 7) >> 3;
        c6090d.m10834j(i9 | ((i10 - 1) << 5));
        while (i10 > 0) {
            c6090d.m10834j((byte) j3);
            j3 >>= 8;
            i10--;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C6065e m3585a(String str) {
        return new C6065e(AbstractC0063p.m404N(str));
    }

    /* JADX DEBUG: Class process forced to load method for inline: p.h1.g(y0.o, float, float, int):y0.o */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r11v41, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r12v0, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r16v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r17v2, resolved type: boolean */
    /* JADX DEBUG: Multi-variable search result rejected for r6v43, resolved type: java.lang.Object[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3586b(final String str, final long j3, final long j4, final long j5, final long j10, final long j11, final boolean z9, final C1739c c1739c, final InterfaceC1809a1 interfaceC1809a1, final InterfaceC1220a interfaceC1220a, final InterfaceC5853o interfaceC5853o, final C4236f c4236f, C3874d c3874d, C1836h0 c1836h0, final int i9) {
        C3874d c3874d2;
        int i10;
        float f3;
        int dimensionPixelSize;
        RoundedCorner roundedCorner;
        float f10;
        InterfaceC5853o interfaceC5853oM2516m;
        boolean z10;
        boolean z11;
        C1836h0 c1836h02 = c1836h0;
        c1739c.getClass();
        interfaceC1809a1.getClass();
        c1836h02.m4527b0(-482094145);
        int i11 = i9 | (c1836h02.m4534f(str) ? 4 : 2) | (c1836h02.m4532e(j3) ? 32 : 16) | (c1836h02.m4534f(null) ? 256 : 128) | (c1836h02.m4532e(j4) ? Opcodes.ACC_STRICT : 1024) | (c1836h02.m4532e(j5) ? 16384 : 8192) | (c1836h02.m4532e(j10) ? Opcodes.ACC_DEPRECATED : 65536) | (c1836h02.m4532e(j11) ? 1048576 : 524288) | (c1836h02.m4536g(z9) ? 8388608 : 4194304) | (c1836h02.m4538h(c1739c) ? 67108864 : 33554432);
        if (c1836h02.m4516S(i11 & 1, ((i11 & 306783379) == 306783378 && ((((3072 | (c1836h02.m4538h(interfaceC1220a) ? (char) 4 : (char) 2) ? 1 : 0) | (c1836h02.m4534f(interfaceC5853o) ? ' ' : (char) 16) ? 1 : 0) | (c1836h02.m4534f(c4236f) ? (char) 256 : (char) 128) ? 1 : 0) & 1171) == 1170) ? false : true)) {
            float fM8523a = C4238h.m8523a(((C5944v1) ((InterfaceC5917o2) c1836h02.m4542j(AbstractC5888h1.f23939u))).m10670a());
            boolean zM10539a = AbstractC5824i.m10539a(c1836h02);
            boolean zM4536g = c1836h02.m4536g(zM10539a);
            Object objM4514P = c1836h02.m4514P();
            C1823e c1823e = C1851l.f6155a;
            if (zM4536g || objM4514P == c1823e) {
                objM4514P = zM10539a ? C5840b.f23765k : C5840b.f23768n;
                c1836h02.m4545k0(objM4514P);
            }
            InterfaceC5841c interfaceC5841c = (InterfaceC5841c) objM4514P;
            Context context = (Context) c1836h02.m4542j(AbstractC5891i0.f23946b);
            float fMo1333d = ((InterfaceC4233c) c1836h02.m4542j(AbstractC5888h1.f23926h)).mo1333d();
            WindowInsets rootWindowInsets = ((View) c1836h02.m4542j(AbstractC5891i0.f23950f)).getRootWindowInsets();
            boolean zM4534f = c1836h02.m4534f(context) | c1836h02.m4534f(rootWindowInsets);
            Object objM4514P2 = c1836h02.m4514P();
            if (zM4534f || objM4514P2 == c1823e) {
                i10 = i11;
                f3 = fM8523a;
                if (Build.VERSION.SDK_INT < 31) {
                    context.getClass();
                    int identifier = context.getResources().getIdentifier("rounded_corner_radius_bottom", "dimen", "android");
                    if (identifier > 0) {
                        dimensionPixelSize = context.getResources().getDimensionPixelSize(identifier);
                    }
                    objM4514P2 = Integer.valueOf(dimensionPixelSize);
                    c1836h02.m4545k0(objM4514P2);
                } else if (rootWindowInsets == null || (roundedCorner = rootWindowInsets.getRoundedCorner(3)) == null) {
                    context.getClass();
                    int identifier2 = context.getResources().getIdentifier("rounded_corner_radius_bottom", "dimen", "android");
                    dimensionPixelSize = identifier2 > 0 ? context.getResources().getDimensionPixelSize(identifier2) : 0;
                    objM4514P2 = Integer.valueOf(dimensionPixelSize);
                    c1836h02.m4545k0(objM4514P2);
                } else {
                    int radius = roundedCorner.getRadius();
                    Integer numValueOf = Integer.valueOf(radius);
                    if (radius <= 0) {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        dimensionPixelSize = numValueOf.intValue();
                    }
                    objM4514P2 = Integer.valueOf(dimensionPixelSize);
                    c1836h02.m4545k0(objM4514P2);
                }
            } else {
                i10 = i11;
                f3 = fM8523a;
            }
            float fIntValue = ((Number) objM4514P2).intValue() / fMo1333d;
            boolean zM4528c = c1836h02.m4528c(C4238h.m8524b(j10)) | c1836h02.m4528c(fIntValue) | c1836h02.m4536g(zM10539a);
            Object objM4514P3 = c1836h02.m4514P();
            if (zM4528c || objM4514P3 == c1823e) {
                C4236f c4236f2 = new C4236f(fIntValue - (zM10539a ? 0 : C4238h.m8524b(j10)));
                C4236f c4236f3 = new C4236f(32);
                if (c4236f2.compareTo(c4236f3) < 0) {
                    c4236f2 = c4236f3;
                }
                objM4514P3 = new C4236f(c4236f2.f13909g);
                c1836h02.m4545k0(objM4514P3);
            }
            InterfaceC1026r0 interfaceC1026r0M1249b = AbstractC0323k.m1249b(((C4236f) objM4514P3).f13909g, c1836h02, 0);
            InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(interfaceC1220a, c1836h02);
            if (c4236f != null) {
                c1836h02.m4525a0(305135435);
                c1836h02.m4553p(false);
                f10 = c4236f.f13909g;
            } else {
                c1836h02.m4525a0(305174774);
                WeakHashMap weakHashMap = C3255s1.f10360v;
                float fMo6924c = AbstractC3208d.m6874d(C3205c.m6868e(c1836h02).f10366f, c1836h02).mo6924c();
                float fMo6924c2 = AbstractC3208d.m6874d(C3205c.m6868e(c1836h02).f10361a, c1836h02).mo6924c();
                float fMo6924c3 = AbstractC3208d.m6874d(C3205c.m6868e(c1836h02).f10362b, c1836h02).mo6924c();
                C4236f c4236f4 = new C4236f(fMo6924c);
                C4236f c4236f5 = new C4236f(fMo6924c2);
                C4236f c4236f6 = new C4236f(fMo6924c3);
                if (c4236f5.compareTo(c4236f6) < 0) {
                    c4236f5 = c4236f6;
                }
                if (c4236f4.compareTo(c4236f5) < 0) {
                    c4236f4 = c4236f5;
                }
                c1836h02.m4553p(false);
                f10 = c4236f4.f13909g;
            }
            float f11 = f10;
            InterfaceC5853o interfaceC5853oM6904g = AbstractC3222h1.m6904g(AbstractC3222h1.m6912o(interfaceC5853o, 420), 0.0f, zM10539a ? f3 * 0.6666667f : Float.NaN, 1);
            Object objM4514P4 = c1836h02.m4514P();
            if (objM4514P4 == c1823e) {
                objM4514P4 = new C5086lp(interfaceC1809a1, 26);
                c1836h02.m4545k0(objM4514P4);
            }
            InterfaceC5853o interfaceC5853oM8889m = AbstractC4434w.m8889m(interfaceC5853oM6904g, (InterfaceC1231l) objM4514P4);
            C5850l c5850l = C5850l.f23787a;
            if (zM10539a) {
                c1836h02.m4525a0(305865330);
                boolean z12 = (i10 & 234881024) == 67108864 || c1836h02.m4538h(c1739c);
                Object objM4514P5 = c1836h02.m4514P();
                if (z12 || objM4514P5 == c1823e) {
                    z11 = false;
                    objM4514P5 = new C5816a(c1739c, null == true ? 1 : 0);
                    c1836h02.m4545k0(objM4514P5);
                } else {
                    z11 = false;
                }
                interfaceC5853oM2516m = AbstractC0996c0.m2516m(c5850l, (InterfaceC1231l) objM4514P5);
                c1836h02.m4553p(z11);
            } else {
                c1836h02.m4525a0(306126536);
                WeakHashMap weakHashMap2 = C3255s1.f10360v;
                float fMo6922a = AbstractC3208d.m6874d(C3205c.m6868e(c1836h02).f10361a, c1836h02).mo6922a() + AbstractC3208d.m6874d(C3205c.m6868e(c1836h02).f10365e, c1836h02).mo6922a();
                boolean zM4528c2 = c1836h02.m4528c(fMo6922a) | c1836h02.m4528c(C4238h.m8523a(j10));
                Object objM4514P6 = c1836h02.m4514P();
                if (zM4528c2 || objM4514P6 == c1823e) {
                    objM4514P6 = new C4236f(C4238h.m8523a(j10) + fMo6922a);
                    c1836h02.m4545k0(objM4514P6);
                }
                float f12 = ((C4236f) objM4514P6).f13909g;
                boolean zM4528c3 = ((i10 & 234881024) == 67108864 || c1836h02.m4538h(c1739c)) | c1836h02.m4528c(f12);
                Object objM4514P7 = c1836h02.m4514P();
                if (zM4528c3 || objM4514P7 == c1823e) {
                    objM4514P7 = new C2595e3(interfaceC1809a1, f12, c1739c, 3);
                    c1836h02.m4545k0(objM4514P7);
                }
                interfaceC5853oM2516m = AbstractC0996c0.m2516m(c5850l, (InterfaceC1231l) objM4514P7);
                c1836h02.m4553p(false);
            }
            InterfaceC5853o interfaceC5853oMo10549d = interfaceC5853oM8889m.mo10549d(interfaceC5853oM2516m);
            Object objM4514P8 = c1836h02.m4514P();
            if (objM4514P8 == c1823e) {
                objM4514P8 = C5823h.f23661a;
                c1836h02.m4545k0(objM4514P8);
            }
            C3967n c3967n = C3967n.f12976a;
            InterfaceC5853o interfaceC5853oM6883m = AbstractC3208d.m6883m(AbstractC2192n.m5430g(AbstractC0378h.m1337b(AbstractC3898h0.m8090a(interfaceC5853oMo10549d, c3967n, (PointerInputEventHandler) objM4514P8), interfaceC1026r0M1249b), j5, AbstractC0996c0.f3162b), C4238h.m8524b(j11), C4238h.m8523a(j11));
            InterfaceC5853o interfaceC5853oMo10549d2 = (z9 ? AbstractC3208d.m6890t(AbstractC3208d.m6890t(AbstractC3208d.m6890t(c5850l, AbstractC3208d.f10250e), AbstractC3208d.f10251f), AbstractC3208d.f10252g) : c5850l).mo10549d(AbstractC3222h1.f10289c);
            boolean zM4534f2 = c1836h02.m4534f(interfaceC1809a1M4643y);
            Object objM4514P9 = c1836h02.m4514P();
            if (zM4534f2 || objM4514P9 == c1823e) {
                objM4514P9 = new C5822g(interfaceC1809a1M4643y, 0);
                c1836h02.m4545k0(objM4514P9);
            }
            InterfaceC5853o interfaceC5853oM6886p = AbstractC3208d.m6886p(AbstractC3208d.m6884n(AbstractC3898h0.m8090a(interfaceC5853oMo10549d2, c3967n, (PointerInputEventHandler) objM4514P9), C4238h.m8524b(j10), 0.0f, 2), 0.0f, f11, 0.0f, C4238h.m8523a(j10), 5);
            InterfaceC4412n0 interfaceC4412n0M6930d = AbstractC3241o.m6930d(C5840b.f23761g, false);
            int iHashCode = Long.hashCode(c1836h02.f6095T);
            C3878h c3878hM4546l = c1836h02.m4546l();
            InterfaceC5853o interfaceC5853oM10543c = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6886p);
            InterfaceC5605g.f22815f.getClass();
            C5660y c5660y = C5601f.f22758b;
            c1836h02.m4531d0();
            if (c1836h02.f6094S) {
                c1836h02.m4544k(c5660y);
            } else {
                c1836h02.m4551n0();
            }
            C5597e c5597e = C5601f.f22761e;
            AbstractC1874r.m4615A(c5597e, c1836h02, interfaceC4412n0M6930d);
            C5597e c5597e2 = C5601f.f22760d;
            AbstractC1874r.m4615A(c5597e2, c1836h02, c3878hM4546l);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            C5597e c5597e3 = C5601f.f22762f;
            AbstractC1874r.m4638t(c1836h02, numValueOf2, c5597e3);
            C5593d c5593d = C5601f.f22763g;
            AbstractC1874r.m4641w(c5593d, c1836h02);
            C5597e c5597e4 = C5601f.f22759c;
            AbstractC1874r.m4615A(c5597e4, c1836h02, interfaceC5853oM10543c);
            InterfaceC5853o interfaceC5853oM6933a = C3250r.m6933a(interfaceC5853oM6883m, interfaceC5841c);
            C3256t c3256tM6935a = AbstractC3253s.m6935a(AbstractC3226j.f10300c, C5840b.f23773s, c1836h02, 0);
            int iHashCode2 = Long.hashCode(c1836h02.f6095T);
            C3878h c3878hM4546l2 = c1836h02.m4546l();
            InterfaceC5853o interfaceC5853oM10543c2 = AbstractC5839a.m10543c(c1836h02, interfaceC5853oM6933a);
            c1836h02.m4531d0();
            if (c1836h02.f6094S) {
                c1836h02.m4544k(c5660y);
            } else {
                c1836h02.m4551n0();
            }
            AbstractC1874r.m4615A(c5597e, c1836h02, c3256tM6935a);
            AbstractC1874r.m4615A(c5597e2, c1836h02, c3878hM4546l2);
            AbstractC1874r.m4638t(c1836h02, Integer.valueOf(iHashCode2), c5597e3);
            AbstractC1874r.m4641w(c5593d, c1836h02);
            AbstractC1874r.m4615A(c5597e4, c1836h02, interfaceC5853oM10543c2);
            if (str == null) {
                c1836h02.m4525a0(-573316736);
                z10 = false;
                c1836h02.m4553p(false);
            } else {
                c1836h02.m4525a0(-573316735);
                AbstractC4045s.m8250n(str, AbstractC3208d.m6886p(AbstractC3222h1.m6901d(c5850l, 1.0f), 0.0f, 0.0f, 0.0f, 12, 7), j3, ((C1941n0) ((C0324l) c1836h02.m4542j(AbstractC0325m.f972a)).f971n.getValue()).f6580a.f6514b, C2767k.f9000j, null, 0L, new C4095k(3), 0L, 0, false, 0, 0, null, null, c1836h0, ((i10 << 3) & 896) | 1572912, 0, 261032);
                c1836h02 = c1836h0;
                z10 = false;
                c1836h02.m4553p(false);
            }
            c1836h02.m4525a0(-572917549);
            c1836h02.m4553p(z10);
            c3874d2 = c3874d;
            c3874d2.invoke(c1836h02, 6);
            c1836h02.m4553p(true);
            c1836h02.m4553p(true);
        } else {
            c3874d2 = c3874d;
            c1836h02.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h02.m4557t();
        if (c1876r1M4557t != null) {
            final C3874d c3874d3 = c3874d2;
            c1876r1M4557t.f6241d = new InterfaceC1235p(str, j3, j4, j5, j10, j11, z9, c1739c, interfaceC1809a1, interfaceC1220a, interfaceC5853o, c4236f, c3874d3, i9) { // from class: xh.b

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ String f23605g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ long f23606h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ long f23607i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ long f23608j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ long f23609k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ long f23610l;

                /* JADX INFO: renamed from: m */
                public final /* synthetic */ boolean f23611m;

                /* JADX INFO: renamed from: n */
                public final /* synthetic */ C1739c f23612n;

                /* JADX INFO: renamed from: o */
                public final /* synthetic */ InterfaceC1809a1 f23613o;

                /* JADX INFO: renamed from: p */
                public final /* synthetic */ InterfaceC1220a f23614p;

                /* JADX INFO: renamed from: q */
                public final /* synthetic */ InterfaceC5853o f23615q;

                /* JADX INFO: renamed from: r */
                public final /* synthetic */ C4236f f23616r;

                /* JADX INFO: renamed from: s */
                public final /* synthetic */ C3874d f23617s;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM4617C = AbstractC1874r.m4617C(939524097);
                    AbstractC1341a.m3586b(this.f23605g, this.f23606h, this.f23607i, this.f23608j, this.f23609k, this.f23610l, this.f23611m, this.f23612n, this.f23613o, this.f23614p, this.f23615q, this.f23616r, this.f23617s, (C1836h0) obj, iM4617C);
                    return C3967n.f12976a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static final void m3587c(final long j3, final long j4, final long j5, final long j10, final long j11, final C3874d c3874d, final InterfaceC5853o interfaceC5853o, final String str, final boolean z9, final InterfaceC1220a interfaceC1220a, final boolean z10, final C4236f c4236f, final C3874d c3874d2, C1836h0 c1836h0, final int i9, final int i10) {
        int i11;
        int i12;
        C1739c c1739c;
        C1739c c1739c2;
        boolean z11;
        c1836h0.m4527b0(1907584495);
        if ((i9 & 6) == 0) {
            i11 = (c1836h0.m4536g(true) ? 4 : 2) | i9;
        } else {
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            i11 |= c1836h0.m4532e(j3) ? 32 : 16;
        }
        if ((i9 & 384) == 0) {
            i11 |= c1836h0.m4532e(j4) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i9 & 3072) == 0) {
            i11 |= c1836h0.m4532e(j5) ? 2048 : 1024;
        }
        if ((i9 & 24576) == 0) {
            i11 |= c1836h0.m4532e(j10) ? 16384 : 8192;
        }
        if ((i9 & 196608) == 0) {
            i11 |= c1836h0.m4532e(j11) ? 131072 : 65536;
        }
        if ((i9 & 1572864) == 0) {
            i11 |= c1836h0.m4538h(c3874d) ? 1048576 : 524288;
        }
        if ((i9 & 12582912) == 0) {
            i11 |= c1836h0.m4534f(interfaceC5853o) ? 8388608 : 4194304;
        }
        if ((i9 & 100663296) == 0) {
            i11 |= c1836h0.m4534f(str) ? 67108864 : 33554432;
        }
        if ((i9 & 805306368) == 0) {
            i11 |= c1836h0.m4534f(null) ? 536870912 : 268435456;
        }
        if ((i10 & 6) == 0) {
            i12 = i10 | (c1836h0.m4536g(z9) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c1836h0.m4538h(interfaceC1220a) ? 32 : 16;
        }
        int i13 = i11;
        if ((i10 & 384) == 0) {
            i12 |= c1836h0.m4538h(null) ? Opcodes.ACC_NATIVE : 128;
        }
        if ((i10 & 3072) == 0) {
            i12 |= c1836h0.m4536g(z10) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c1836h0.m4534f(c4236f) ? 16384 : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c1836h0.m4538h(c3874d2) ? 131072 : 65536;
        }
        if (c1836h0.m4516S(i13 & 1, ((i13 & 306783379) == 306783378 && (i12 & 74899) == 74898) ? false : true)) {
            Object objM4514P = c1836h0.m4514P();
            Object obj = C1851l.f6155a;
            if (objM4514P == obj) {
                objM4514P = AbstractC1742d.m4365a(0.0f, 1.0E-4f);
                c1836h0.m4545k0(objM4514P);
            }
            C1739c c1739c3 = (C1739c) objM4514P;
            Object objM4514P2 = c1836h0.m4514P();
            if (objM4514P2 == obj) {
                objM4514P2 = AbstractC1742d.m4365a(0.0f, 0.01f);
                c1836h0.m4545k0(objM4514P2);
            }
            C1739c c1739c4 = (C1739c) objM4514P2;
            InterfaceC1809a1 interfaceC1809a1M4643y = AbstractC1874r.m4643y(null, c1836h0);
            Object objM4514P3 = c1836h0.m4514P();
            if (objM4514P3 == obj) {
                objM4514P3 = AbstractC1874r.m4639u(Boolean.FALSE);
                c1836h0.m4545k0(objM4514P3);
            }
            InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) objM4514P3;
            InterfaceC4233c interfaceC4233c = (InterfaceC4233c) c1836h0.m4542j(AbstractC5888h1.f23926h);
            WeakHashMap weakHashMap = C3255s1.f10360v;
            C3202b c3202b = C3205c.m6868e(c1836h0).f10363c;
            InterfaceC5885g2 interfaceC5885g2 = (InterfaceC5885g2) c1836h0.m4542j(AbstractC5888h1.f23935q);
            boolean zM10539a = AbstractC5824i.m10539a(c1836h0);
            Boolean bool = Boolean.TRUE;
            boolean zM4538h = ((i13 & 14) == 4) | c1836h0.m4538h(c1739c4) | c1836h0.m4538h(c1739c3) | c1836h0.m4536g(zM10539a) | c1836h0.m4534f(c3202b) | c1836h0.m4534f(interfaceC4233c) | c1836h0.m4534f(interfaceC5885g2) | c1836h0.m4534f(interfaceC1809a1M4643y);
            Object objM4514P4 = c1836h0.m4514P();
            if (zM4538h || objM4514P4 == obj) {
                c1739c = c1739c3;
                c1739c2 = c1739c4;
                z11 = zM10539a;
                objM4514P4 = new C5546zp(interfaceC1809a1, c1739c, z11, c3202b, interfaceC4233c, interfaceC5885g2, c1739c2, interfaceC1809a1M4643y, null);
                c1836h0.m4545k0(objM4514P4);
            } else {
                c1739c = c1739c3;
                c1739c2 = c1739c4;
                z11 = zM10539a;
            }
            AbstractC1874r.m4624f((InterfaceC1235p) objM4514P4, c1836h0, bool);
            Object objM4514P5 = c1836h0.m4514P();
            if (objM4514P5 == obj) {
                objM4514P5 = AbstractC1874r.m4632n(c1836h0);
                c1836h0.m4545k0(objM4514P5);
            }
            final InterfaceC3599t interfaceC3599t = (InterfaceC3599t) objM4514P5;
            Object objM4514P6 = c1836h0.m4514P();
            if (objM4514P6 == obj) {
                objM4514P6 = new C1829f1(1.0f);
                c1836h0.m4545k0(objM4514P6);
            }
            final C1829f1 c1829f1 = (C1829f1) objM4514P6;
            Object objM4514P7 = c1836h0.m4514P();
            if (objM4514P7 == obj) {
                objM4514P7 = new C1833g1(0);
                c1836h0.m4545k0(objM4514P7);
            }
            final C1833g1 c1833g1 = (C1833g1) objM4514P7;
            Object objM4514P8 = c1836h0.m4514P();
            if (objM4514P8 == obj) {
                objM4514P8 = AbstractC1742d.m4365a(0.0f, 0.01f);
                c1836h0.m4545k0(objM4514P8);
            }
            final C1739c c1739c5 = (C1739c) objM4514P8;
            InterfaceC1809a1 interfaceC1809a1M4643y2 = AbstractC1874r.m4643y(interfaceC1220a, c1836h0);
            final float fMo1601x0 = interfaceC4233c.mo1601x0(C4238h.m8523a(((C5944v1) ((InterfaceC5917o2) c1836h0.m4542j(AbstractC5888h1.f23939u))).m10670a()));
            boolean zM4534f = c1836h0.m4534f(interfaceC1809a1M4643y2);
            Object objM4514P9 = c1836h0.m4514P();
            if (zM4534f || objM4514P9 == obj) {
                objM4514P9 = new C4960ht(interfaceC1809a1M4643y2, 1);
                c1836h0.m4545k0(objM4514P9);
            }
            final InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P9;
            boolean zM4538h2 = c1836h0.m4538h(c1739c5);
            Object objM4514P10 = c1836h0.m4514P();
            if (zM4538h2 || objM4514P10 == obj) {
                objM4514P10 = new C0141g(c1739c5, c1829f1, null, 2);
                c1836h0.m4545k0(objM4514P10);
            }
            final InterfaceC1231l interfaceC1231l = (InterfaceC1231l) objM4514P10;
            final C1739c c1739c6 = c1739c;
            final boolean z12 = z11;
            final C1739c c1739c7 = c1739c2;
            c3874d.mo3355c(interfaceC1809a1.getValue(), AbstractC3879i.m8071e(-1052785207, new InterfaceC1235p() { // from class: xh.c
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj2, Object obj3) {
                    InterfaceC1220a interfaceC1220a3;
                    C1739c c1739c8;
                    C1836h0 c1836h02 = (C1836h0) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    if (c1836h02.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                        C3927e c3927eM16I0 = AbstractC0000a.m16I0(c1836h02);
                        InterfaceC3599t interfaceC3599t2 = interfaceC3599t;
                        boolean zM4538h3 = c1836h02.m4538h(interfaceC3599t2);
                        InterfaceC1231l interfaceC1231l2 = interfaceC1231l;
                        boolean zM4538h4 = zM4538h3 | c1836h02.m4538h(interfaceC1231l2);
                        Object objM4514P11 = c1836h02.m4514P();
                        C1823e c1823e = C1851l.f6155a;
                        if (zM4538h4 || objM4514P11 == c1823e) {
                            objM4514P11 = new C5475xi(interfaceC3599t2, interfaceC1231l2, 27);
                            c1836h02.m4545k0(objM4514P11);
                        }
                        InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P11;
                        InterfaceC1220a interfaceC1220a5 = interfaceC1220a2;
                        boolean zM4534f2 = c1836h02.m4534f(interfaceC1220a5);
                        Object objM4514P12 = c1836h02.m4514P();
                        if (zM4534f2 || objM4514P12 == c1823e) {
                            objM4514P12 = new C5040kc(interfaceC1220a5, 29);
                            c1836h02.m4545k0(objM4514P12);
                        }
                        AbstractC5700d.m10272d(c3927eM16I0, true, interfaceC1220a4, (InterfaceC1220a) objM4514P12, c1836h02, 0, 0);
                        C3658e c3658e = (C3658e) c3927eM16I0.f12901a.getValue();
                        boolean zM4534f3 = c1836h02.m4534f(c3927eM16I0);
                        C1739c c1739c9 = c1739c5;
                        boolean zM4538h5 = zM4534f3 | c1836h02.m4538h(c1739c9);
                        Object objM4514P13 = c1836h02.m4514P();
                        C1829f1 c1829f12 = c1829f1;
                        if (zM4538h5 || objM4514P13 == c1823e) {
                            interfaceC1220a3 = interfaceC1220a5;
                            c1739c8 = c1739c9;
                            C4639u0 c4639u0 = new C4639u0(c3927eM16I0, c1739c8, c1829f12, null, 9);
                            c1836h02.m4545k0(c4639u0);
                            objM4514P13 = c4639u0;
                        } else {
                            interfaceC1220a3 = interfaceC1220a5;
                            c1739c8 = c1739c9;
                        }
                        AbstractC1874r.m4624f((InterfaceC1235p) objM4514P13, c1836h02, c3658e);
                        if (z9) {
                            c1836h02.m4525a0(-1671960998);
                            long jM1245o = ((C0314b) c1836h02.m4542j(AbstractC0316d.f944a)).m1245o();
                            C3200a0 c3200a0 = AbstractC3222h1.f10289c;
                            boolean zM4532e = c1836h02.m4532e(jM1245o);
                            C1739c c1739c10 = c1739c7;
                            boolean zM4538h6 = zM4532e | c1836h02.m4538h(c1739c10);
                            Object objM4514P14 = c1836h02.m4514P();
                            if (zM4538h6 || objM4514P14 == c1823e) {
                                objM4514P14 = new C3987a0(jM1245o, c1829f12, c1739c10);
                                c1836h02.m4545k0(objM4514P14);
                            }
                            AbstractC3241o.m6927a(AbstractC0378h.m1339d(c3200a0, (InterfaceC1231l) objM4514P14), c1836h02, 0);
                            c1836h02.m4553p(false);
                        } else {
                            c1836h02.m4525a0(-1671623687);
                            c1836h02.m4553p(false);
                        }
                        final C1739c c1739c11 = c1739c6;
                        boolean zM4538h7 = c1836h02.m4538h(c1739c11);
                        final boolean z13 = z12;
                        boolean zM4536g = zM4538h7 | c1836h02.m4536g(z13);
                        final float f3 = fMo1601x0;
                        boolean zM4528c = zM4536g | c1836h02.m4528c(f3);
                        Object objM4514P15 = c1836h02.m4514P();
                        if (zM4528c || objM4514P15 == c1823e) {
                            objM4514P15 = new InterfaceC1231l() { // from class: xh.e
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1231l
                                public final Object invoke(Object obj4) {
                                    InterfaceC0998d0 interfaceC0998d0 = (InterfaceC0998d0) obj4;
                                    interfaceC0998d0.getClass();
                                    float fFloatValue = ((Number) c1739c11.m4360d()).floatValue();
                                    if (z13) {
                                        float f10 = (0.2f * fFloatValue) + 0.8f;
                                        interfaceC0998d0.mo2547q(f10);
                                        interfaceC0998d0.mo2541i(f10);
                                        interfaceC0998d0.mo2544n(fFloatValue);
                                    } else {
                                        interfaceC0998d0.mo2539g((1.0f - fFloatValue) * f3);
                                        interfaceC0998d0.mo2544n(1.0f);
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h02.m4545k0(objM4514P15);
                        }
                        InterfaceC5853o interfaceC5853oM2516m = AbstractC0996c0.m2516m(interfaceC5853o, (InterfaceC1231l) objM4514P15);
                        boolean zM4534f4 = c1836h02.m4534f(interfaceC1220a3);
                        Object objM4514P16 = c1836h02.m4514P();
                        if (zM4534f4 || objM4514P16 == c1823e) {
                            objM4514P16 = new C5821f(interfaceC1220a3, 0);
                            c1836h02.m4545k0(objM4514P16);
                        }
                        C3874d c3874dM8071e = AbstractC3879i.m8071e(856405757, new C5539zi(interfaceC1220a3, 11, c3874d2), c1836h02);
                        AbstractC1341a.m3586b(str, j3, j4, j5, j10, j11, z10, c1739c8, c1833g1, (InterfaceC1220a) objM4514P16, interfaceC5853oM2516m, c4236f, c3874dM8071e, c1836h02, 939524096);
                    } else {
                        c1836h02.m4519V();
                    }
                    return C3967n.f12976a;
                }
            }, c1836h0), c1836h0, Integer.valueOf(((i13 >> 12) & 896) | 48));
        } else {
            c1836h0.m4519V();
        }
        C1876r1 c1876r1M4557t = c1836h0.m4557t();
        if (c1876r1M4557t != null) {
            c1876r1M4557t.f6241d = new InterfaceC1235p() { // from class: xh.d
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // p085fg.InterfaceC1235p
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iM4617C = AbstractC1874r.m4617C(i9 | 1);
                    int iM4617C2 = AbstractC1874r.m4617C(i10);
                    AbstractC1341a.m3587c(j3, j4, j5, j10, j11, c3874d, interfaceC5853o, str, z9, interfaceC1220a, z10, c4236f, c3874d2, (C1836h0) obj2, iM4617C, iM4617C2);
                    return C3967n.f12976a;
                }
            };
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public static final long m3588d(float f3, float f10) {
        return (((long) Float.floatToRawIntBits(f10)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static final void m3589e(C0964v c0964v, int i9) {
        if (c0964v.f3036b == 0 || !(c0964v.m2371c(0) == i9 || c0964v.m2371c(c0964v.f3036b - 1) == i9)) {
            int i10 = c0964v.f3036b;
            c0964v.m2369a(i9);
            while (i10 > 0) {
                int i11 = ((i10 + 1) >>> 1) - 1;
                int iM2371c = c0964v.m2371c(i11);
                if (i9 <= iM2371c) {
                    break;
                }
                c0964v.m2373e(i10, iM2371c);
                i10 = i11;
            }
            c0964v.m2373e(i10, i9);
        }
    }

    /* JADX DEBUG: Class process forced to load method for inline: tf.l.x0(java.lang.String, java.lang.Object[]):void */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public static final void m3590f(C2571a c2571a, C3914t c3914t, long j3) {
        C4082b c4082b = (C4082b) c2571a.f8339h;
        c4082b.getClass();
        C4084d c4084d = c4082b.f13524b;
        C4084d c4084d2 = c4082b.f13523a;
        boolean zM8109b = AbstractC3913s.m8109b(c3914t);
        long j4 = c3914t.f12835b;
        if (zM8109b) {
            C4081a[] c4081aArr = c4084d2.f13532d;
            AbstractC4165l.m8387v0(0, c4081aArr.length, null, c4081aArr);
            c4084d2.f13533e = 0;
            C4081a[] c4081aArr2 = c4084d.f13532d;
            AbstractC4165l.m8387v0(0, c4081aArr2.length, null, c4081aArr2);
            c4084d.f13533e = 0;
            c4082b.f13525c = 0L;
        }
        if (!AbstractC3913s.m8111d(c3914t)) {
            List list = c3914t.f12846m;
            if (list == null) {
                list = C4173t.f13710g;
            }
            int i9 = 0;
            for (int size = list.size(); i9 < size; size = size) {
                C3887c c3887c = (C3887c) list.get(i9);
                c4082b.m8264a(c3887c.f12748a, C0807b.m2042e(c3887c.f12752e, j3));
                i9++;
            }
            c4082b.m8264a(j4, C0807b.m2042e(c3914t.f12847n, j3));
        }
        if (AbstractC3913s.m8111d(c3914t) && j4 - c4082b.f13525c > 40) {
            C4081a[] c4081aArr3 = c4084d2.f13532d;
            AbstractC4165l.m8387v0(0, c4081aArr3.length, null, c4081aArr3);
            c4084d2.f13533e = 0;
            C4081a[] c4081aArr4 = c4084d.f13532d;
            AbstractC4165l.m8387v0(0, c4081aArr4.length, null, c4081aArr4);
            c4084d.f13533e = 0;
            c4082b.f13525c = 0L;
        }
        c4082b.f13525c = j4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static C3401l m3591g(C4322r c4322r, C1402a c1402a, boolean z9, ArrayList arrayList) {
        AbstractC3506j abstractC3506j;
        C4309e c4309e = c4322r.f14411l;
        C3494d c3494d = (C3494d) ((C2958a) arrayList.get(4)).f9705h;
        if (AbstractC2091b.m5154a(c3494d.m7337b())) {
            C0086a.m452k("Not yet supported");
            return null;
        }
        C4325u c4325u = c4309e.f14371k;
        C3131d c3131dM6658c = C3131d.m6658c(c4325u, c4309e.f14373m, HttpUrl.FRAGMENT_ENCODE_SET, (InterfaceC2823a) ((C2958a) arrayList.get(2)).f9705h);
        int iM7337b = c3494d.m7337b();
        C3401l c3401l = new C3401l(c3131dM6658c, c1402a, 7, false, z9);
        c3401l.f10998r = iM7337b;
        c3401l.f10997q = C3131d.m6658c(c4325u, C3128a.m6637e(c4325u, c3131dM6658c.f10151h), (String) ((C2958a) arrayList.get(1)).f9705h, (InterfaceC2823a) ((C2958a) arrayList.get(3)).f9705h);
        C3131d c3131dM6659d = C3131d.m6659d(c4325u, c3494d.m7336a());
        int iM7916w = AbstractC3754e0.m7916w(iM7337b);
        List list = c3131dM6659d.f10152i;
        int size = list.size();
        boolean z10 = iM7916w != 1;
        if (z10) {
            size++;
        }
        C3403n c3403n = new C3403n(c3131dM6659d, iM7916w, size);
        List list2 = c3401l.f14398m;
        int size2 = list2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            c3403n.mo7178I(c3401l.mo7179S(i9).mo7374H());
        }
        if (size > size2) {
            int i10 = z10 ? size2 - 1 : size2;
            while (size2 < size) {
                if (i10 < 0) {
                    abstractC3506j = c3131dM6659d.f10153j.f10138g;
                } else {
                    abstractC3506j = (AbstractC3506j) list.get(i10);
                    i10++;
                }
                c3403n.mo7178I(new C3512p(AbstractC0921a.m2249l(size2, "v"), abstractC3506j));
                size2++;
            }
        }
        if (iM7337b == 8) {
            c3401l.f10999s = new C4145a(c4322r, c3403n, c3403n.f11005p);
        } else {
            c3401l.f10999s = c3403n;
        }
        C4322r c4322rM8718i = c4325u.m8718i(c3131dM6659d);
        if (c4322rM8718i != null) {
            c3401l.f10999s.m6233y(c4322rM8718i);
            if (c4322rM8718i.f14412m.m857i() && c4322rM8718i.f14411l.equals(c4309e)) {
                c4322rM8718i.m6231w(EnumC2824a.f9166s);
                c3401l.f11000t = true;
            }
        }
        if (!c3401l.f11000t) {
            c3401l.f11001u = AbstractC5798s.m10509c(((InterfaceC2823a) ((C2958a) arrayList.get(5)).f9705h).mo5353c(), new C2833a(6)).equals(list);
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((AbstractC3508l) it.next()).m6231w(EnumC2824a.f9164q);
        }
        return c3401l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Duplicate block (B:35:0x0092) to fix multi-entry loop: BACK_EDGE: B:35:0x0092 -> B:27:0x0061 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:12:0x0020 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:48:? */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [f1.n0, x0.j] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [l0.b] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Integer] */
    /* JADX INFO: renamed from: h */
    public static final List m3592h(C2429k c2429k, Integer num, int i9, Integer num2) {
        int iM5799E;
        int iM5833s;
        C0933f0 c0933f0;
        if (c2429k.f7985w || c2429k.m5830p() == 0) {
            return C4173t.f13710g;
        }
        ?? c5580j = new C5580j(c2429k);
        if (num2 != null) {
            iM5799E = num2.intValue();
        } else {
            iM5799E = c2429k.f7984v;
            if (iM5799E < 0) {
                iM5799E = c2429k.m5799E(c2429k.f7964b, i9);
            }
        }
        if (num == 0) {
            int iM5808N = c2429k.f7971i - c2429k.m5808N(c2429k.f7964b, c2429k.m5832r(i9));
            C0965w c0965w = c2429k.f7981s;
            num = Integer.valueOf(iM5808N + ((c0965w == null || (c0933f0 = (C0933f0) c0965w.m2313b(i9)) == null) ? 0 : c0933f0.f2924b));
        }
        int iM5832r = c2429k.m5832r(i9) * 5;
        int[] iArr = c2429k.f7964b;
        if (iM5832r < iArr.length) {
            iM5833s = c2429k.m5833s(i9);
        } else {
            int iM5799E2 = iM5799E >= 0 ? c2429k.m5799E(iArr, iM5799E) : iM5799E;
            iM5833s = c2429k.m5833s(iM5799E);
            int i10 = iM5799E;
            iM5799E = iM5799E2;
            i9 = i10;
        }
        while (i9 >= 0) {
            c5580j.m2624m(iM5833s, (c2429k.f7964b[(c2429k.m5832r(i9) * 5) + 1] & 536870912) != 0 ? c2429k.m5834t(i9) : C1851l.f6155a, c2429k.m5809O(i9), num);
            num = c2429k.m5817b(i9);
            if (iM5799E >= 0) {
                int iM5799E3 = c2429k.m5799E(c2429k.f7964b, iM5799E);
                iM5833s = c2429k.m5833s(iM5799E);
                int i11 = iM5799E;
                iM5799E = iM5799E3;
                i9 = i11;
            } else {
                i9 = iM5799E;
            }
        }
        return (ArrayList) c5580j.f3204g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static void m3593i(C4322r c4322r) {
        try {
            if (c4322r.f9217g.mo6235a(EnumC2824a.f9158l0)) {
                try {
                    int size = c4322r.f14425z.size();
                    ArrayList arrayList = new ArrayList(size);
                    AbstractC0000a.m61d1(c4322r, c4322r.f14403C, new C0073d(27), new C0294m0(3, arrayList));
                    int size2 = arrayList.size();
                    final int[] iArr = new int[size];
                    int size3 = 0;
                    for (int i9 = 0; i9 < size2; i9++) {
                        iArr[i9] = ((C4305a) arrayList.get(i9)).f14349j;
                    }
                    int size4 = arrayList.size();
                    for (int i10 = 0; i10 < size4; i10++) {
                        ((C4305a) arrayList.get(i10)).f14349j = i10;
                    }
                    C4305a[] c4305aArrM2769h = AbstractC1089i.m2769h(arrayList, new C0073d(28));
                    C4305a c4305a = (C4305a) arrayList.get(0);
                    c4305a.f14356q = C5786g.f23528g;
                    c4305a.f14359t = null;
                    for (int i11 = 1; i11 < size2; i11++) {
                        C4305a c4305a2 = (C4305a) arrayList.get(i11);
                        C4305a c4305a3 = c4305aArrM2769h[i11];
                        c4305a2.f14359t = c4305a3;
                        BitSet bitSet = new BitSet(c4305aArrM2769h.length);
                        while (true) {
                            int i12 = c4305a3.f14349j;
                            if (bitSet.get(i12)) {
                                break;
                            }
                            bitSet.set(i12);
                            BitSet bitSet2 = c4305a3.f14355p;
                            if (bitSet2 != null) {
                                bitSet.or(bitSet2);
                                break;
                            }
                            c4305a3 = c4305aArrM2769h[i12];
                        }
                        c4305a2.f14356q = bitSet;
                    }
                    for (int i13 = 1; i13 < size2; i13++) {
                        C4305a c4305a4 = (C4305a) arrayList.get(i13);
                        final BitSet bitSet3 = new BitSet(size2);
                        c4305a4.f14356q.stream().forEach(new IntConsumer() { // from class: ce.q
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // java.util.function.IntConsumer
                            public final void accept(int i14) {
                                bitSet3.set(iArr[i14]);
                            }
                        });
                        bitSet3.clear(iArr[i13]);
                        c4305a4.f14356q = bitSet3;
                    }
                    int i14 = size - size2;
                    if (i14 != 0) {
                        for (C4305a c4305a5 : c4322r.f14425z) {
                            if (c4305a5.f14356q == null) {
                                c4305a5.f14356q = C5786g.f23528g;
                                c4305a5.f14359t = null;
                                size3 += c4305a5.f14351l.size();
                            }
                        }
                        c4322r.m6381J("Infinite loop detected, blocks: " + i14 + ", insns: " + size3);
                    }
                    c4322r.m8707f0();
                } catch (Exception e6) {
                    e = e6;
                    c4322r.m6384M("Failed to build post-dominance tree", e);
                    c4322r.m8707f0();
                } catch (StackOverflowError e7) {
                    e = e7;
                    c4322r.m6384M("Failed to build post-dominance tree", e);
                    c4322r.m8707f0();
                }
            }
        } catch (Throwable th2) {
            c4322r.m8707f0();
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j */
    public static final long m3594j(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[8192];
        int i9 = inputStream.read(bArr);
        long j3 = 0;
        while (i9 >= 0) {
            outputStream.write(bArr, 0, i9);
            j3 += (long) i9;
            i9 = inputStream.read(bArr);
        }
        return j3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static String m3595k(String str) {
        Object c3959f;
        str.getClass();
        if (AbstractC3149m.m6721t0(str)) {
            return HttpUrl.FRAGMENT_ENCODE_SET;
        }
        C1368i c1368iM9259c = AbstractC4855en.m9259c();
        if (c1368iM9259c == null) {
            return str;
        }
        try {
            c3959f = c1368iM9259c.m3725n(str);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        WeChatContact weChatContact = (WeChatContact) c3959f;
        if (weChatContact != null && !weChatContact.isOfficialAccount()) {
            String str2 = weChatContact.remarkName;
            if (AbstractC3149m.m6721t0(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                return str2;
            }
            String str3 = weChatContact.nickname;
            String str4 = AbstractC3149m.m6721t0(str3) ? null : str3;
            if (str4 != null) {
                return str4;
            }
        }
        String strM3729r = c1368iM9259c.m3729r(str);
        return AbstractC3149m.m6721t0(strM3729r) ? str : strM3729r;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static final float m3596l(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f3 = 0.0f;
        for (int i9 = 0; i9 < length; i9++) {
            f3 += fArr[i9] * fArr2[i9];
        }
        return f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static void m3597m(SharedPreferencesC0062o sharedPreferencesC0062o, String str) {
        Log.e("FastKV", sharedPreferencesC0062o.f192b + " " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static final Integer m3598n(C2425g c2425g, AbstractC1863o abstractC1863o, int i9, int i10) {
        Integer numM3598n;
        int[] iArr = c2425g.f7936b;
        while (true) {
            if (i9 >= i10) {
                return null;
            }
            int i11 = iArr[(i9 * 5) + 3] + i9;
            if (c2425g.m5769j(i9) && c2425g.m5768i(i9) == 206 && AbstractC1416l.m3825a(c2425g.m5775p(iArr, i9), AbstractC1855m.f6173e)) {
                Object objM5767h = c2425g.m5767h(i9, 0);
                C1848k0 c1848k0 = objM5767h instanceof C1848k0 ? (C1848k0) objM5767h : null;
                InterfaceC1810a2 interfaceC1810a2 = c1848k0 != null ? c1848k0.f6147a : null;
                C1824e0 c1824e0 = interfaceC1810a2 instanceof C1824e0 ? (C1824e0) interfaceC1810a2 : null;
                if (c1824e0 != null && c1824e0.f6054g.equals(abstractC1863o)) {
                    return Integer.valueOf(i9);
                }
            }
            if (c2425g.m5763d(i9) && (numM3598n = m3598n(c2425g, abstractC1863o, i9 + 1, i11)) != null) {
                return Integer.valueOf(numM3598n.intValue());
            }
            i9 = i11;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public static EnumC2359c m3599o(C2366j c2366j) {
        c2366j.getClass();
        String str = c2366j.f7772a;
        if (AbstractC1416l.m3825a(c2366j.f7774c, "module_settings")) {
            return EnumC2359c.f7749h;
        }
        String lowerCase = c2366j.f7775d.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return (AbstractC1416l.m3825a(str, "scan") || AbstractC3149m.m6709h0(lowerCase, "scanner", false)) ? EnumC2359c.f7750i : (AbstractC1416l.m3825a(str, "moments") || AbstractC3149m.m6709h0(lowerCase, ".sns.", false)) ? EnumC2359c.f7751j : (AbstractC1416l.m3825a(str, "finder") || AbstractC3149m.m6709h0(lowerCase, ".finder.", false)) ? EnumC2359c.f7752k : (AbstractC1416l.m3825a(str, "favorite") || AbstractC3149m.m6709h0(lowerCase, ".fav.", false)) ? EnumC2359c.f7753l : (AbstractC1416l.m3825a(str, "wallet") || AbstractC3149m.m6709h0(lowerCase, ".mall.", false) || AbstractC3149m.m6709h0(lowerCase, ".wallet", false)) ? EnumC2359c.f7754m : EnumC2359c.f7755n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static C1730o m3600p(DexKitBridge dexKitBridge, C2152p c2152p) {
        dexKitBridge.getClass();
        int iM3645b = c2152p.m3645b(10);
        int i9 = iM3645b != 0 ? c2152p.f4500b.getInt(iM3645b + c2152p.f4499a) : 0;
        if ((i9 & Opcodes.ACC_DEPRECATED) > 0) {
            i9 = (i9 ^ Opcodes.ACC_DEPRECATED) | 32;
        }
        int i10 = i9;
        int iM3645b2 = c2152p.m3645b(4);
        int i11 = iM3645b2 != 0 ? c2152p.f4500b.getInt(iM3645b2 + c2152p.f4499a) : 0;
        int iM3645b3 = c2152p.m3645b(6);
        int i12 = iM3645b3 != 0 ? c2152p.f4500b.getInt(iM3645b3 + c2152p.f4499a) : 0;
        int iM3645b4 = c2152p.m3645b(8);
        int i13 = iM3645b4 != 0 ? c2152p.f4500b.getInt(iM3645b4 + c2152p.f4499a) : 0;
        int iM3645b5 = c2152p.m3645b(12);
        String strM3647d = iM3645b5 != 0 ? c2152p.m3647d(iM3645b5 + c2152p.f4499a) : null;
        if (strM3647d == null) {
            strM3647d = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str = strM3647d;
        int iM3645b6 = c2152p.m3645b(14);
        int i14 = iM3645b6 != 0 ? c2152p.f4500b.getInt(iM3645b6 + c2152p.f4499a) : 0;
        ArrayList arrayList = new ArrayList();
        int iM3645b7 = c2152p.m3645b(16);
        int iM3649f = iM3645b7 != 0 ? c2152p.m3649f(iM3645b7) : 0;
        for (int i15 = 0; i15 < iM3649f; i15++) {
            int iM3645b8 = c2152p.m3645b(16);
            arrayList.add(Integer.valueOf(iM3645b8 != 0 ? c2152p.f4500b.getInt((i15 * 4) + c2152p.m3648e(iM3645b8)) : 0));
        }
        return new C1730o(dexKitBridge, i11, i12, i13, i10, str, i14, arrayList);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static final int m3601q(C2767k c2767k, int i9) {
        boolean z9 = AbstractC1416l.m3827c(c2767k.f9003g, C2767k.f8998h.f9003g) >= 0;
        boolean z10 = i9 == 1;
        if (z10 && z9) {
            return 3;
        }
        if (z9) {
            return 1;
        }
        return z10 ? 2 : 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public static C0314b m3602r(C1836h0 c1836h0) {
        return (C0314b) c1836h0.m4542j(AbstractC0316d.f944a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public static AbstractC4457f0 m3603s(Object obj) {
        if (obj == null) {
            return C4469r.f14816g;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue() ? C4456f.f14790i : C4456f.f14789h;
        }
        if (obj instanceof Byte) {
            return new C4458g(((Byte) obj).byteValue());
        }
        if (obj instanceof Character) {
            return new C4461j(((Character) obj).charValue());
        }
        if (obj instanceof Double) {
            return new C4462k(Double.doubleToLongBits(((Double) obj).doubleValue()));
        }
        if (obj instanceof Float) {
            return new C4465n(Float.floatToIntBits(((Float) obj).floatValue()));
        }
        if (obj instanceof Integer) {
            return C4466o.m8909o(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return new C4473v(((Long) obj).longValue());
        }
        if (obj instanceof Short) {
            return new C4449b0(((Short) obj).shortValue());
        }
        if (obj instanceof String) {
            return new C4451c0((String) obj);
        }
        if (obj instanceof Class) {
            return new C4453d0(C1350j.m3626a((Class) obj).f4480b);
        }
        if (obj instanceof C1350j) {
            return new C4453d0(((C1350j) obj).f4480b);
        }
        throw new UnsupportedOperationException("Not a constant: " + obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public static final String[] m3604t(InterfaceC6073m interfaceC6073m) {
        interfaceC6073m.getClass();
        return (String[]) ((C6065e) interfaceC6073m).f24546b.toArray(new String[0]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static String m3605u(ClassLoader classLoader, Class cls) {
        try {
            Field declaredField = cls.getDeclaredField("path");
            declaredField.setAccessible(true);
            return (String) declaredField.get(classLoader);
        } catch (ClassCastException | IllegalAccessException | NoSuchFieldException unused) {
            String string = classLoader.toString();
            if (!string.contains("DexPathList")) {
                int iLastIndexOf = string.lastIndexOf(91);
                if (iLastIndexOf != -1) {
                    string = string.substring(iLastIndexOf + 1);
                }
                int iIndexOf = string.indexOf(93);
                return iIndexOf == -1 ? string : string.substring(0, iIndexOf);
            }
            int iIndexOf2 = string.indexOf("DexPathList");
            int i9 = iIndexOf2 + 11;
            if (string.length() <= iIndexOf2 + 15) {
                return string;
            }
            String strSubstring = string.substring(i9);
            int iIndexOf3 = strSubstring.indexOf(93);
            if (strSubstring.charAt(0) != '[' || strSubstring.charAt(1) != '[' || iIndexOf3 < 0) {
                return string;
            }
            String[] strArrSplit = strSubstring.substring(2, iIndexOf3).split(",");
            for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                int iIndexOf4 = strArrSplit[i10].indexOf(34);
                int iLastIndexOf2 = strArrSplit[i10].lastIndexOf(34);
                if (iIndexOf4 > 0 && iIndexOf4 < iLastIndexOf2) {
                    strArrSplit[i10] = strArrSplit[i10].substring(iIndexOf4 + 1, iLastIndexOf2);
                }
            }
            StringBuilder sb2 = new StringBuilder();
            for (String str : strArrSplit) {
                if (sb2.length() > 0) {
                    sb2.append(':');
                }
                sb2.append(str);
            }
            return sb2.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static File[] m3606v(String str) {
        int iLastIndexOf;
        int iLastIndexOf2;
        int iLastIndexOf3;
        int iIndexOf;
        Integer num;
        ArrayList arrayList = new ArrayList();
        if (str.startsWith("dexPath=")) {
            int iIndexOf2 = str.indexOf(44);
            str = iIndexOf2 == -1 ? str.substring(8) : str.substring(8, iIndexOf2);
        }
        for (String str2 : str.split(":")) {
            if (str2.startsWith("/data/app/") && (iLastIndexOf = str2.lastIndexOf(".apk")) == str2.length() - 4 && (iLastIndexOf2 = str2.lastIndexOf("/", iLastIndexOf)) != 9 && (iLastIndexOf3 = str2.lastIndexOf("/", iLastIndexOf2 - 1)) != -1 && (iIndexOf = str2.indexOf("-", iLastIndexOf3)) != -1) {
                String strSubstring = str2.substring(iLastIndexOf3 + 1, iIndexOf);
                File file = new File("/data/data/".concat(strSubstring));
                File file2 = null;
                if (!file.isDirectory() || !file.canWrite()) {
                    file = null;
                }
                if (file == null) {
                    try {
                        num = (Integer) Class.forName("android.os.Process").getMethod("myUid", null).invoke(null, null);
                    } catch (Exception unused) {
                        num = null;
                    }
                    if (num != null) {
                        File file3 = new File(String.format("/data/user/%d/%s", Integer.valueOf(num.intValue() / 100000), strSubstring));
                        if (file3.isDirectory() && file3.canWrite()) {
                            file2 = file3;
                        }
                    }
                    file = file2;
                }
                if (file != null) {
                    File file4 = new File(file, "cache");
                    if ((file4.exists() || file4.mkdir()) && file4.isDirectory() && file4.canWrite()) {
                        arrayList.add(file4);
                    }
                }
            }
        }
        return (File[]) arrayList.toArray(new File[arrayList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static C1136j0 m3607w(DexBridgeHolder dexBridgeHolder, Context context) {
        Object c3959f;
        try {
            c3959f = new File(dexBridgeHolder.getApkPath()).getCanonicalFile();
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object file = new File(dexBridgeHolder.getApkPath());
        if (c3959f instanceof C3959f) {
            c3959f = file;
        }
        File file2 = (File) c3959f;
        DexKitBridge dexKitBridge = dexBridgeHolder.getDexKitBridge();
        dexKitBridge.getClass();
        String path = file2.getPath();
        path.getClass();
        Set set = C1152n0.f3803a;
        return new C1136j0(context, dexKitBridge, path, C1152n0.m2945c0(file2), "current_wechat_apk", dexBridgeHolder.getHostClassLoader().toString(), false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static final int m3608x(int i9, int i10) {
        return (i9 >> i10) & 31;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m3609y(SharedPreferencesC0062o sharedPreferencesC0062o, String str) {
        Log.i("FastKV", sharedPreferencesC0062o.f192b + " " + str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z */
    public static boolean m3610z(Object obj) {
        int iIntValue;
        if (obj != null && m3571B(obj) > 0) {
            Object field = KavaReflector.readField(obj, "field_type");
            Number number = field instanceof Number ? (Number) field : null;
            if (number != null) {
                iIntValue = number.intValue();
            } else {
                Object field2 = KavaReflector.readField(obj, "type");
                Number number2 = field2 instanceof Number ? (Number) field2 : null;
                iIntValue = number2 != null ? number2.intValue() : 0;
            }
            if (iIntValue > 0 && KavaReflector.readField(obj, "field_favProto") != null) {
                return true;
            }
        }
        return false;
    }
}
