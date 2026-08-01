package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.compose.foundation.text.C0966;
import com.alibaba.fastjson2.reader.AbstractC2761;
import com.alibaba.fastjson2.reader.C2703;
import com.alibaba.fastjson2.reader.C2771;
import com.alibaba.fastjson2.reader.C2801;
import com.alibaba.fastjson2.reader.InterfaceC2787;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2848;
import com.alibaba.fastjson2.util.AbstractC2853;
import com.alibaba.fastjson2.util.AbstractC2865;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.alibaba.fastjson2.util.C2828;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Collection;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.pool.TypePool;
import p007.AbstractC6136;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2898 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final boolean[] f9177;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f9178;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f9179;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public short f9180;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public short f9181;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public byte f9182;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f9183;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f9184;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public Object f9185;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public String f9186;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f9187;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f9188;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f9189;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f9190;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public char f9191;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9192;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f9193;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f9194;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f9195;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f9196;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f9197;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ArrayList f9198;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2942 f9199;

    static {
        boolean[] zArr = new boolean[256];
        f9177 = zArr;
        Arrays.fill(zArr, true);
        char[] cArr = {TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, 'e', 'E', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, 'f', 'n', '{', TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH, '0', '1', '2', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < 19; i++) {
            f9177[cArr[i]] = false;
        }
    }

    public AbstractC2898(C2942 c2942, boolean z) {
        this.f9199 = c2942;
        this.f9197 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public static AbstractC2898 m6046(String str) {
        return m6047(str, AbstractC2932.m6331());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static AbstractC2898 m6047(String str, C2942 c2942) {
        ToIntFunction toIntFunction;
        if (str == null || c2942 == null) {
            throw null;
        }
        Function function = AbstractC2853.f8925;
        if (function != null && (toIntFunction = AbstractC2853.f8924) != null) {
            try {
                if (toIntFunction.applyAsInt(str) == 0) {
                    byte[] bArr = (byte[]) function.apply(str);
                    return new C2902(c2942, str, bArr, bArr.length);
                }
            } catch (Exception unused) {
                C0276.m849("unsafe get String.coder error");
                return null;
            }
        }
        return new C2900(c2942, str, AbstractC2853.f8916 == 8 ? AbstractC2853.m5725(str) : str.toCharArray(), str.length());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public static JSONException m6048(int i, int i2) {
        StringBuilder sbM148 = AbstractC0053.m148(i, "illegal number, offset ", ", char ");
        sbM148.append((char) i2);
        return new JSONException(sbM148.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static void m6049(int i, int i2) {
        StringBuilder sbM148 = AbstractC0053.m148(i, "error, offset ", ", char ");
        sbM148.append((char) i2);
        throw new JSONValidException(sbM148.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static char m6050(int i, int i2) {
        int[] iArr = AbstractC2932.f9298;
        return (char) ((iArr[i] * 16) + iArr[i2]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static boolean m6051(int i) {
        if (i >= 65 && i <= 90) {
            return true;
        }
        if ((i >= 97 && i <= 122) || i == 95 || i == 36) {
            return true;
        }
        return (i >= 48 && i <= 57) || i > 127;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏世兰哲子, reason: contains not printable characters */
    public static String m6052(long j, String str) {
        if ((16384 & j) != 0) {
            str = str.trim();
        }
        if ((j & 134217728) == 0 || !str.isEmpty()) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲子世兰, reason: contains not printable characters */
    public static JSONException m6053(int i, int i2) {
        StringBuilder sbM148 = AbstractC0053.m148(i, "syntax error, offset ", ", char ");
        sbM148.append((char) i2);
        return new JSONException(sbM148.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final InterfaceC2787 m6054(long j, long j2, Class cls) {
        C2942 c2942 = this.f9199;
        InterfaceC2787 interfaceC2787M5585 = ((C2801) c2942.f9316).m5585(j);
        if (interfaceC2787M5585 != null) {
            return interfaceC2787M5585;
        }
        return ((C2801) c2942.f9316).m5584(mo6055(), cls, c2942.f9318 | j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public abstract String mo6055();

    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final InterfaceC2787 m6056(Type type) {
        C2942 c2942 = this.f9199;
        return ((C2801) c2942.f9316).m5588(type, (c2942.f9318 & 1) != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Number m6057() {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2898.m6057():java.lang.Number");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public abstract String mo6058();

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final double m6059() {
        int i;
        byte b = this.f9182;
        C2942 c2942 = this.f9199;
        switch (b) {
            case 1:
            case 9:
            case 10:
                if (this.f9190 == 0 && this.f9189 == 0 && (i = this.f9188) != Integer.MIN_VALUE) {
                    return this.f9183 ? -i : i;
                }
                Number numberM6057 = m6057();
                if (!(numberM6057 instanceof BigInteger)) {
                    return numberM6057.doubleValue();
                }
                BigInteger bigInteger = (BigInteger) numberM6057;
                if ((c2942.f9318 & JSONReader$Feature.NonErrorOnNumberOverflow.mask) != 0) {
                    return bigInteger.longValue();
                }
                try {
                    return bigInteger.longValueExact();
                } catch (ArithmeticException unused) {
                    throw m6092();
                }
            case 2:
            case 11:
            case 12:
            case 13:
                return m6057().doubleValue();
            case 3:
                try {
                    return AbstractC2866.m5872(this.f9186);
                } catch (NumberFormatException e) {
                    C0276.m849(mo6124(e.getMessage()));
                    return 0.0d;
                }
            case 4:
                return this.f9184 ? 1.0d : 0.0d;
            case 5:
                if ((c2942.f9318 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    C0276.m849(mo6124("long value not support input null"));
                    return 0.0d;
                }
            case 6:
                Map map = (Map) this.f9185;
                if (map != null && !map.isEmpty()) {
                    return AbstractC2866.m5872(map);
                }
                this.f9194 = true;
                return 0.0d;
            case 7:
                Collection collection = (Collection) this.f9185;
                if (collection != null && !collection.isEmpty()) {
                    return AbstractC2866.m5872(this.f9185);
                }
                this.f9194 = true;
                return 0.0d;
            case 8:
                try {
                    return m6111().doubleValue();
                } catch (ArithmeticException unused2) {
                    throw m6092();
                }
            case 14:
                return Double.NaN;
            default:
                C0276.m843(this.f9182, "TODO : ");
                return 0.0d;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public abstract long mo6060();

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final void m6061() {
        this.f9199.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public abstract boolean mo6062();

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public char mo6063() {
        String strMo6139 = mo6139();
        if (strMo6139 != null && !strMo6139.isEmpty()) {
            return strMo6139.charAt(0);
        }
        this.f9194 = true;
        return (char) 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public BigInteger mo6064() {
        mo6150();
        Number numberM6057 = m6057();
        if (numberM6057 == null) {
            return null;
        }
        return numberM6057 instanceof BigInteger ? (BigInteger) numberM6057 : BigInteger.valueOf(numberM6057.longValue());
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public abstract BigDecimal mo6065();

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public Boolean mo6066() {
        if (mo6087()) {
            return null;
        }
        this.f9194 = false;
        boolean zMo6062 = mo6062();
        if (zMo6062 || !this.f9194) {
            return Boolean.valueOf(zMo6062);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public byte[] mo6067() {
        if (this.f9191 == 'x') {
            return mo6069();
        }
        if (mo6133()) {
            String strMo6139 = mo6139();
            if (strMo6139.isEmpty()) {
                return null;
            }
            if ((this.f9199.f9318 & JSONReader$Feature.Base64StringAsByteArray.mask) != 0) {
                return Base64.getDecoder().decode(strMo6139);
            }
            C0276.m849(mo6124("not support input ".concat(strMo6139)));
            return null;
        }
        if (!mo6095()) {
            C0276.m849(mo6124("not support read binary"));
            return null;
        }
        byte[] bArrCopyOf = new byte[64];
        int i = 0;
        while (this.f9191 != ']') {
            if (i == bArrCopyOf.length) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, length + (length >> 1));
            }
            bArrCopyOf[i] = (byte) mo6167();
            i++;
        }
        mo6127();
        mo6099();
        return Arrays.copyOf(bArrCopyOf, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public abstract float mo6068();

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public abstract byte[] mo6069();

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final String m6070() {
        if (this.f9191 == '/') {
            mo6190();
        }
        mo6082();
        String strMo6058 = mo6058();
        if (strMo6058 != null && !strMo6058.isEmpty()) {
            return strMo6058;
        }
        C0276.m849(mo6124("illegal input"));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public Float mo6071() {
        if (mo6087()) {
            return null;
        }
        this.f9194 = false;
        float fMo6068 = mo6068();
        if (this.f9194) {
            return null;
        }
        return Float.valueOf(fMo6068);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public Instant mo6072() {
        if (mo6087()) {
            return null;
        }
        if (mo6132()) {
            long jMo6164 = mo6164();
            this.f9199.getClass();
            return Instant.ofEpochMilli(jMo6164);
        }
        if (mo6131()) {
            return (Instant) m6056(Instant.class).mo5462(mo6149(), 0L);
        }
        ZonedDateTime zonedDateTimeMo6196 = mo6196();
        if (zonedDateTimeMo6196 == null) {
            return null;
        }
        return Instant.ofEpochSecond(zonedDateTimeMo6196.toEpochSecond(), zonedDateTimeMo6196.toLocalTime().getNano());
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public abstract boolean mo6073();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0235  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo6074(java.util.Map r20, long r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2898.mo6074(java.util.Map, long):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m6075(JSONArray jSONArray) {
        if (!mo6095()) {
            C2941.m6335(this.f9192, this.f9191, "illegal input, offset ");
            return;
        }
        int i = this.f9187 + 1;
        this.f9187 = i;
        this.f9199.getClass();
        if (i >= 2048) {
            C0276.m843(this.f9187, "level too large : ");
            return;
        }
        while (!this.mo6096()) {
            AbstractC2898 abstractC2898 = this;
            jSONArray.add(C2703.f8206.mo5418(abstractC2898, null, null, 0L));
            abstractC2898.mo6099();
            this = abstractC2898;
        }
        this.f9187--;
        this.mo6099();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public List mo6076(Type type) {
        AbstractC2898 abstractC2898;
        AbstractC2898 abstractC28982;
        Object objMo5418;
        char c;
        if (mo6087()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char c2 = this.f9191;
        if (c2 == '[') {
            mo6127();
            C2942 c2942 = this.f9199;
            InterfaceC2787 interfaceC2787M5588 = ((C2801) c2942.f9316).m5588(type, (c2942.f9318 & JSONReader$Feature.FieldBased.mask) != 0);
            int i = 0;
            while (!this.mo6096()) {
                int i2 = this.f9192;
                if (this.mo6134()) {
                    String strMo6144 = this.mo6144();
                    if ("..".equals(strMo6144)) {
                        objMo5418 = arrayList;
                    } else {
                        this.m6108(arrayList, i, AbstractC2921.m6320(strMo6144));
                        objMo5418 = null;
                    }
                    abstractC28982 = this;
                } else {
                    abstractC28982 = this;
                    objMo5418 = interfaceC2787M5588.mo5418(abstractC28982, null, null, 0L);
                }
                arrayList.add(objMo5418);
                if (i2 == abstractC28982.f9192 || (c = abstractC28982.f9191) == '}' || c == 26) {
                    throw new JSONException("illegal input : " + abstractC28982.f9191 + ", offset " + abstractC28982.f9192);
                }
                i++;
                this = abstractC28982;
            }
            abstractC2898 = this;
        } else {
            abstractC2898 = this;
            if (c2 != '\"' && c2 != '\'' && c2 != '{') {
                C0276.m849(abstractC2898.mo6124("syntax error"));
                return null;
            }
            String strMo6139 = abstractC2898.mo6139();
            if (strMo6139 != null && !strMo6139.isEmpty()) {
                arrayList.add(strMo6139);
            }
        }
        boolean z = abstractC2898.f9191 == ',';
        abstractC2898.f9195 = z;
        if (z) {
            abstractC2898.mo6127();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public byte[] mo6077() {
        int iIndexOf;
        int i;
        int iIndexOf2;
        String strMo6139 = mo6139();
        if (strMo6139 != null && strMo6139.startsWith("data:image/") && (iIndexOf = strMo6139.indexOf(59, 12)) != -1 && (iIndexOf2 = strMo6139.indexOf(44, (i = iIndexOf + 1))) != -1 && strMo6139.regionMatches(i, "base64", 0, 6)) {
            strMo6139 = strMo6139.substring(iIndexOf2 + 1);
        }
        return strMo6139.isEmpty() ? new byte[0] : Base64.getDecoder().decode(strMo6139);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public Object mo6078() {
        return mo6094(Object.class);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f1  */
    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List mo6079() {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2898.mo6079():java.util.List");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public abstract String mo6080();

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public abstract double mo6081();

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public abstract long mo6082();

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public abstract long mo6083();

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public Date mo6084() throws IOException {
        long jM6159;
        if (mo6135()) {
            return new Date(mo6164());
        }
        if (mo6073() || mo6105()) {
            return null;
        }
        if (this.f9191 == 'n') {
            return mo6148();
        }
        if (this.f9178 && mo6090()) {
            mo6098(':');
            jM6159 = mo6164();
            mo6106();
            this.f9178 = false;
        } else {
            if (mo6131()) {
                JSONObject jSONObject = new JSONObject();
                mo6074(jSONObject, 0L);
                Object obj = jSONObject.get("$date");
                if (!(obj instanceof String)) {
                    return AbstractC2866.m5874(jSONObject);
                }
                long jM5850 = AbstractC2865.m5850((String) obj, this.f9199.m6351());
                if (jM5850 == 0) {
                    return null;
                }
                return new Date(jM5850);
            }
            jM6159 = m6159();
        }
        if (jM6159 == 0 && this.f9194) {
            return null;
        }
        return new Date(jM6159);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final Double m6085() {
        if (mo6087()) {
            return null;
        }
        this.f9194 = false;
        double dMo6081 = mo6081();
        if (this.f9194) {
            return null;
        }
        return Double.valueOf(dMo6081);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public boolean mo6086() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public abstract boolean mo6087();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public abstract boolean mo6088(char c, char c2, char c3, char c4);

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public abstract boolean mo6089();

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public abstract boolean mo6090();

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public abstract boolean mo6091(char c, char c2, char c3, char c4, char c5, char c6);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final JSONException m6092() {
        return new JSONException("illegal number, offset " + this.f9192 + ", char " + this.f9191);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public Object mo6093(Type type) {
        C2942 c2942 = this.f9199;
        return ((C2801) c2942.f9316).m5588(type, (c2942.f9318 & JSONReader$Feature.FieldBased.mask) != 0).mo5418(this, null, null, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public Object mo6094(Class cls) {
        C2942 c2942 = this.f9199;
        return ((C2801) c2942.f9316).m5588(cls, (c2942.f9318 & JSONReader$Feature.FieldBased.mask) != 0).mo5418(this, null, null, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public abstract boolean mo6095();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public abstract boolean mo6096();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public boolean mo6097(byte b) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public abstract boolean mo6098(char c);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public abstract boolean mo6099();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public abstract boolean mo6100();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public abstract boolean mo6101();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public abstract boolean mo6102();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final JSONException m6103() {
        return new JSONException(mo6124("not support unquoted name"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public void mo6104() {
        mo6127();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public abstract boolean mo6105();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public abstract boolean mo6106();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m6107(Map map, Object obj, AbstractC2921 abstractC2921) {
        if (this.f9198 == null) {
            this.f9198 = new ArrayList();
        }
        if (map instanceof LinkedHashMap) {
            map.put(obj, null);
        }
        this.f9198.add(new C2899(null, map, obj, abstractC2921));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m6108(Collection collection, int i, AbstractC2921 abstractC2921) {
        if (this.f9198 == null) {
            this.f9198 = new ArrayList();
        }
        this.f9198.add(new C2899(null, collection, Integer.valueOf(i), abstractC2921));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m6109(ArrayList arrayList, int i, Object obj) {
        if (!(obj instanceof AbstractC2921)) {
            arrayList.add(obj);
        } else {
            m6108(arrayList, i, (AbstractC2921) obj);
            arrayList.add(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final long m6110(long j) {
        return this.f9199.f9318 | j;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.math.BigDecimal m6111() {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2898.m6111():java.math.BigDecimal");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void m6112(Class cls) {
        if ((this.f9199.f9318 & 4) == 0 || Serializable.class.isAssignableFrom(cls)) {
            return;
        }
        C0276.m849("not support none-Serializable, class ".concat(cls.getName()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final JSONException m6113(String str) {
        return new JSONException(mo6124(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m6114() {
        throw new JSONValidException("error, offset " + this.f9192 + ", char " + this.f9191);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final char m6115(int i) {
        if (i != 34 && i != 35) {
            switch (i) {
                case 32:
                case 44:
                case 64:
                case 95:
                case 126:
                    break;
                case 70:
                case 102:
                    return '\f';
                case 98:
                    return '\b';
                case 110:
                    return '\n';
                case 114:
                    return '\r';
                case 116:
                    return '\t';
                case 118:
                    return (char) 11;
                default:
                    switch (i) {
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                            break;
                        default:
                            switch (i) {
                                case 46:
                                case 47:
                                    break;
                                case 48:
                                    return (char) 0;
                                case 49:
                                    return (char) 1;
                                case 50:
                                    return (char) 2;
                                case 51:
                                    return (char) 3;
                                case 52:
                                    return (char) 4;
                                case 53:
                                    return (char) 5;
                                case 54:
                                    return (char) 6;
                                case 55:
                                    return (char) 7;
                                default:
                                    switch (i) {
                                        case 91:
                                        case 92:
                                        case 93:
                                            break;
                                        default:
                                            C0276.m849(mo6124("unclosed.str '\\" + ((char) i)));
                                            break;
                                    }
                                    return (char) 0;
                            }
                            break;
                    }
                    break;
            }
        }
        return (char) i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final boolean m6116(int i) {
        long j = this.f9199.f9318;
        if (i == 39 && (2147483648L & j) != 0) {
            throw m6103();
        }
        if (i == 34 || i == 39) {
            return false;
        }
        if ((j & 131072) == 0) {
            throw m6103();
        }
        mo6082();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final BigDecimal m6117(JSONObject jSONObject) {
        BigDecimal bigDecimal = jSONObject.getBigDecimal("value");
        if (bigDecimal == null) {
            bigDecimal = jSONObject.getBigDecimal("$numberDecimal");
        }
        if (bigDecimal != null) {
            return bigDecimal;
        }
        throw m6113("can not cast to decimal " + jSONObject);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC2787 mo6118(long j, long j2, Class cls) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public boolean mo6119() {
        return this.f9191 == 26;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean m6120(JSONReader$Feature jSONReader$Feature) {
        return (jSONReader$Feature.mask & this.f9199.f9318) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public boolean mo6121() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public boolean mo6122() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public boolean mo6123() {
        return this.f9191 == '[';
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public String mo6124(String str) {
        if (str == null || str.isEmpty()) {
            return "offset " + this.f9192;
        }
        StringBuilder sbM11553 = AbstractC6136.m11553(str, ", offset ");
        sbM11553.append(this.f9192);
        return sbM11553.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final boolean m6125(long j) {
        return ((this.f9199.f9318 | j) & 64) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final boolean m6126(long j) {
        return ((this.f9199.f9318 | j) & 8) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public abstract void mo6127();

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public C0966 mo6128() {
        return new C0966(this.f9192, this.f9191);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final boolean m6129(long j) {
        return ((this.f9199.f9318 | j) & 32) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final boolean m6130() {
        return (this.f9199.f9318 & 8) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public boolean mo6131() {
        return this.f9191 == '{';
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean mo6132() {
        char c = this.f9191;
        if (c == '+' || c == '-') {
            return true;
        }
        switch (c) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰世楪, reason: contains not printable characters */
    public boolean mo6133() {
        char c = this.f9191;
        return c == '\"' || c == '\'';
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public abstract boolean mo6134();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public boolean mo6135() {
        char c = this.f9191;
        if (c == '-' || c == '+') {
            return true;
        }
        return c >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public abstract int mo6136();

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m6137(Object obj) {
        ArrayList<C2899> arrayList = this.f9198;
        if (arrayList == null) {
            return;
        }
        Object objMo5903 = null;
        for (C2899 c2899 : arrayList) {
            AbstractC2921 abstractC2921 = c2899.f9200;
            AbstractC2761 abstractC2761 = c2899.f9203;
            abstractC2921.getClass();
            if (!(abstractC2921 instanceof C2917)) {
                if (!abstractC2921.mo5901()) {
                    C2941.m6346(abstractC2921, "reference path invalid : ");
                    return;
                }
                if ((this.f9199.f9318 & JSONReader$Feature.FieldBased.mask) != 0) {
                    C2894 c2894 = new C2894(AbstractC2932.f9292);
                    c2894.f9151 |= JSONWriter$Feature.FieldBased.mask;
                    abstractC2921.f9262 = c2894;
                }
                objMo5903 = abstractC2921.mo5903(obj);
            }
            Object obj2 = c2899.f9201;
            Object obj3 = c2899.f9202;
            if (obj2 != null) {
                if (obj3 instanceof Map) {
                    Map map = (Map) obj3;
                    if (!(obj2 instanceof C2828)) {
                        map.put(obj2, objMo5903);
                    } else if (map instanceof LinkedHashMap) {
                        int size = map.size();
                        if (size != 0) {
                            Object[] objArr = new Object[size];
                            Object[] objArr2 = new Object[size];
                            int i = 0;
                            for (Map.Entry entry : map.entrySet()) {
                                Object key = entry.getKey();
                                if (obj2 == key) {
                                    objArr[i] = objMo5903;
                                } else {
                                    objArr[i] = key;
                                }
                                objArr2[i] = entry.getValue();
                                i++;
                            }
                            map.clear();
                            for (int i2 = 0; i2 < size; i2++) {
                                map.put(objArr[i2], objArr2[i2]);
                            }
                        }
                    } else {
                        map.put(objMo5903, map.remove(obj2));
                    }
                } else if (obj2 instanceof Integer) {
                    if (obj3 instanceof List) {
                        int iIntValue = ((Integer) obj2).intValue();
                        List list = (List) obj3;
                        if (iIntValue == list.size()) {
                            list.add(objMo5903);
                        } else if (iIntValue >= list.size() || list.get(iIntValue) != null) {
                            list.add(iIntValue, objMo5903);
                        } else {
                            list.set(iIntValue, objMo5903);
                        }
                    } else if (obj3 instanceof Object[]) {
                        ((Object[]) obj3)[((Integer) obj2).intValue()] = objMo5903;
                    } else if (obj3 instanceof Collection) {
                        ((Collection) obj3).add(objMo5903);
                    }
                }
            }
            abstractC2761.mo5426(obj3, objMo5903);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public byte mo6138() {
        return (byte) -128;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏, reason: contains not printable characters */
    public abstract String mo6139();

    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲苏子, reason: contains not printable characters */
    public String[] mo6140() {
        if (this.f9191 != 'n' || !mo6087()) {
            if (mo6095()) {
                int i = 0;
                String[] strArr = null;
                while (!mo6096()) {
                    if (mo6119()) {
                        C0276.m849(mo6124("input end"));
                        return null;
                    }
                    if (strArr == null) {
                        strArr = new String[16];
                    } else if (i == strArr.length) {
                        strArr = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
                    }
                    strArr[i] = mo6139();
                    i++;
                }
                if (strArr == null) {
                    strArr = new String[0];
                }
                return strArr.length == i ? strArr : (String[]) Arrays.copyOf(strArr, i);
            }
            char c = this.f9191;
            if (c != '\"' && c != '\'') {
                C0276.m849(mo6124("not support input"));
                return null;
            }
            String strMo6139 = mo6139();
            if (!strMo6139.isEmpty()) {
                C0276.m849(mo6124("not support input ".concat(strMo6139)));
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏, reason: contains not printable characters */
    public abstract String mo6141();

    /* JADX INFO: renamed from: 飘花落叶言楪世兰子苏哲, reason: contains not printable characters */
    public abstract OffsetTime mo6142();

    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏哲子, reason: contains not printable characters */
    public boolean mo6143(int i, Collection collection) {
        if (!mo6134()) {
            return false;
        }
        String strMo6144 = mo6144();
        if ("..".equals(strMo6144)) {
            collection.add(collection);
            return true;
        }
        m6108(collection, i, AbstractC2921.m6320(strMo6144));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏子哲, reason: contains not printable characters */
    public abstract String mo6144();

    /* JADX INFO: renamed from: 飘花落叶言楪世哲兰子苏, reason: contains not printable characters */
    public final void m6145(Map map, long j) throws IOException {
        if (map == null) {
            C0276.m849("object is null");
            return;
        }
        Class<?> cls = map.getClass();
        C2942 c2942 = this.f9199;
        InterfaceC2787 interfaceC2787M5588 = ((C2801) c2942.f9316).m5588(cls, ((c2942.f9318 | j) & JSONReader$Feature.FieldBased.mask) != 0);
        if (!(interfaceC2787M5588 instanceof C2771)) {
            mo6074(map, j);
            return;
        }
        C2771 c2771 = (C2771) interfaceC2787M5588;
        if (mo6087()) {
            mo6099();
            return;
        }
        if (!mo6102()) {
            C0276.m849(mo6124(null));
            return;
        }
        while (!mo6106()) {
            AbstractC2761 abstractC2761Mo5420 = c2771.mo5420(mo6083());
            if (abstractC2761Mo5420 == null && m6125(c2771.f8445 | j)) {
                abstractC2761Mo5420 = c2771.mo5419(mo6060());
            }
            if (abstractC2761Mo5420 == null) {
                c2771.m5536(this, map);
            } else {
                abstractC2761Mo5420.mo5427(this, map);
            }
        }
        mo6099();
        JSONSchema jSONSchema = c2771.f8463;
        if (jSONSchema != null) {
            jSONSchema.m5611(map);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子, reason: contains not printable characters */
    public abstract OffsetDateTime mo6146();

    /* JADX INFO: renamed from: 飘花落叶言楪世哲子兰苏, reason: contains not printable characters */
    public Number mo6147() {
        mo6150();
        return m6057();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世哲子苏兰, reason: contains not printable characters */
    public abstract Date mo6148();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0189  */
    /* JADX INFO: renamed from: 飘花落叶言楪世哲苏兰子, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Map mo6149() {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2898.mo6149():java.util.Map");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰, reason: contains not printable characters */
    public abstract void mo6150();

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏, reason: contains not printable characters */
    public abstract LocalTime mo6151();

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲, reason: contains not printable characters */
    public abstract LocalTime mo6152();

    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏, reason: contains not printable characters */
    public abstract LocalTime mo6153();

    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰, reason: contains not printable characters */
    public abstract LocalTime mo6154();

    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲, reason: contains not printable characters */
    public abstract LocalTime mo6155();

    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰, reason: contains not printable characters */
    public abstract LocalTime mo6156();

    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子, reason: contains not printable characters */
    public abstract void mo6157();

    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰子哲, reason: contains not printable characters */
    public double mo6158() {
        throw new JSONException("not support");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子, reason: contains not printable characters */
    public final long m6159() {
        LocalDateTime localDateTimeOf;
        ZonedDateTime zonedDateTimeM5835;
        Function function;
        long j;
        int i;
        this.f9194 = false;
        C2942 c2942 = this.f9199;
        c2942.getClass();
        int iMo6136 = mo6136();
        ZonedDateTime zonedDateTimeOfLocal = null;
        switch (iMo6136) {
            case 8:
                LocalDate localDateMo6183 = mo6183();
                if (localDateMo6183 == null) {
                    C0276.m840(mo6139(), "TODO : ");
                    return 0L;
                }
                localDateTimeOf = LocalDateTime.of(localDateMo6183, LocalTime.MIN);
                break;
                break;
            case 9:
                LocalDate localDateMo6184 = mo6184();
                localDateTimeOf = localDateMo6184 == null ? null : LocalDateTime.of(localDateMo6184, LocalTime.MIN);
                break;
            case 10:
                LocalDate localDateMo6185 = mo6185();
                if (localDateMo6185 == null) {
                    String strMo6139 = mo6139();
                    if ("0000-00-00".equals(strMo6139)) {
                        this.f9194 = true;
                        return 0L;
                    }
                    if (AbstractC2848.m5643(strMo6139)) {
                        return Long.parseLong(strMo6139);
                    }
                    C0276.m849("TODO : ".concat(strMo6139));
                    return 0L;
                }
                localDateTimeOf = LocalDateTime.of(localDateMo6185, LocalTime.MIN);
                break;
            case 11:
                LocalDate localDateMo6186 = mo6186();
                localDateTimeOf = localDateMo6186 == null ? null : LocalDateTime.of(localDateMo6186, LocalTime.MIN);
                break;
            case 12:
                localDateTimeOf = mo6175();
                break;
            case 13:
            case 15:
            default:
                localDateTimeOf = null;
                break;
            case 14:
                localDateTimeOf = mo6179();
                break;
            case 16:
                localDateTimeOf = mo6180();
                break;
            case 17:
                localDateTimeOf = mo6177();
                break;
            case 18:
                localDateTimeOf = mo6178();
                break;
            case 19:
                long jMo6160 = mo6160();
                if (jMo6160 != 0 || !this.f9194) {
                    return jMo6160;
                }
                localDateTimeOf = mo6170();
                break;
                break;
            case 20:
                localDateTimeOf = mo6169();
                break;
        }
        if (localDateTimeOf != null) {
            zonedDateTimeOfLocal = ZonedDateTime.ofLocal(localDateTimeOf, c2942.m6351(), null);
        } else if (iMo6136 >= 20) {
            ZonedDateTime zonedDateTimeMo6197 = mo6197(iMo6136);
            if (zonedDateTimeMo6197 != null || iMo6136 < 32 || iMo6136 > 35) {
                zonedDateTimeOfLocal = zonedDateTimeMo6197;
            } else {
                String strMo61392 = mo6139();
                ZoneId zoneId = AbstractC2865.f9025;
                if (strMo61392 != null && strMo61392.length() != 0) {
                    ToIntFunction toIntFunction = AbstractC2853.f8924;
                    if (toIntFunction == null || (function = AbstractC2853.f8925) == null || toIntFunction.applyAsInt(strMo61392) != 0) {
                        char[] cArrM5725 = AbstractC2853.m5725(strMo61392);
                        zonedDateTimeM5835 = AbstractC2865.m5835(cArrM5725, 0, cArrM5725.length, null);
                    } else {
                        byte[] bArr = (byte[]) function.apply(strMo61392);
                        zonedDateTimeM5835 = AbstractC2865.m5836(bArr, 0, bArr.length, null);
                    }
                    if (zonedDateTimeM5835 == null) {
                        switch (strMo61392) {
                            case "0":
                            case "null":
                            case "0000-00-00":
                                break;
                            default:
                                throw new DateTimeParseException(strMo61392, strMo61392, 0);
                        }
                    } else {
                        zonedDateTimeOfLocal = zonedDateTimeM5835;
                    }
                }
            }
        }
        if (zonedDateTimeOfLocal != null) {
            long epochSecond = zonedDateTimeOfLocal.toEpochSecond();
            int nano = zonedDateTimeOfLocal.toLocalTime().getNano();
            if (epochSecond >= 0 || nano <= 0) {
                j = epochSecond * 1000;
                i = nano / 1000000;
            } else {
                j = (epochSecond + 1) * 1000;
                i = (nano / 1000000) - 1000;
            }
            return j + ((long) i);
        }
        String strMo61393 = mo6139();
        if (strMo61393.isEmpty() || "null".equals(strMo61393)) {
            this.f9194 = true;
            return 0L;
        }
        if (!"0000-00-00T00:00:00".equals(strMo61393) && !"0001-01-01T00:00:00+08:00".equals(strMo61393)) {
            if (strMo61393.startsWith("/Date(") && strMo61393.endsWith(")/")) {
                String strM160 = AbstractC0053.m160(2, 6, strMo61393);
                int iIndexOf = strM160.indexOf(43);
                if (iIndexOf == -1) {
                    iIndexOf = strM160.indexOf(45);
                }
                if (iIndexOf != -1) {
                    strM160 = strM160.substring(0, iIndexOf);
                }
                return Long.parseLong(strM160);
            }
            if (AbstractC2848.m5643(strMo61393)) {
                return Long.parseLong(strMo61393);
            }
            C0276.m849(mo6124("format null not support, input ".concat(strMo61393)));
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲子兰, reason: contains not printable characters */
    public abstract long mo6160();

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲, reason: contains not printable characters */
    public abstract LocalTime mo6161();

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰, reason: contains not printable characters */
    public abstract LocalTime mo6162();

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
    public long[] mo6163() {
        if (!mo6087()) {
            if (mo6095()) {
                long[] jArrCopyOf = new long[8];
                int i = 0;
                while (!mo6096()) {
                    if (mo6119()) {
                        C0276.m849(mo6124("input end"));
                        return null;
                    }
                    if (i == jArrCopyOf.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, jArrCopyOf.length << 1);
                    }
                    jArrCopyOf[i] = mo6164();
                    i++;
                }
                return i == jArrCopyOf.length ? jArrCopyOf : Arrays.copyOf(jArrCopyOf, i);
            }
            if (!mo6133()) {
                C0276.m849(mo6124("TODO"));
                return null;
            }
            String strMo6139 = mo6139();
            if (!strMo6139.isEmpty()) {
                throw m6113("not support input ".concat(strMo6139));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
    public abstract long mo6164();

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
    public abstract Long mo6165();

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00de, code lost:
    
        if (r10 >= 0) goto L60;
     */
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m6166() {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2898.m6166():int");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public abstract int mo6167();

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public abstract Integer mo6168();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
    public abstract LocalDateTime mo6169();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
    public abstract LocalDateTime mo6170();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏, reason: contains not printable characters */
    public abstract LocalTime mo6171();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世, reason: contains not printable characters */
    public abstract LocalTime mo6172();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲, reason: contains not printable characters */
    public abstract LocalDateTime mo6173(int i);

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
    public LocalTime mo6174() {
        if (!mo6087()) {
            boolean zMo6135 = mo6135();
            C2942 c2942 = this.f9199;
            if (zMo6135) {
                return Instant.ofEpochMilli(mo6164()).atZone(c2942.m6351()).toLocalTime();
            }
            switch (mo6136()) {
                case 5:
                    return mo6153();
                case 6:
                    return mo6152();
                case 7:
                    return mo6151();
                case 8:
                    return mo6162();
                case 9:
                    return mo6161();
                case 10:
                    return mo6171();
                case 11:
                    return mo6172();
                case 12:
                    return mo6156();
                case 13:
                case 14:
                case 16:
                case 17:
                default:
                    String strMo6139 = mo6139();
                    if (!strMo6139.isEmpty() && !"null".equals(strMo6139)) {
                        if (AbstractC2848.m5643(strMo6139)) {
                            return Instant.ofEpochMilli(Long.parseLong(strMo6139)).atZone(c2942.m6351()).toLocalTime();
                        }
                        C0276.m849("not support len : ".concat(strMo6139));
                    }
                    break;
                case 15:
                    return mo6155();
                case 18:
                    return mo6154();
                case 19:
                    return mo6170().toLocalTime();
                case 20:
                    return mo6169().toLocalTime();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏, reason: contains not printable characters */
    public abstract LocalDateTime mo6175();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /* JADX WARN: Type inference failed for: r6v19, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.time.LocalDateTime] */
    /* JADX INFO: renamed from: 飘花落叶言楪子哲世苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.time.LocalDateTime mo6176() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2898.mo6176():java.time.LocalDateTime");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
    public abstract LocalDateTime mo6177();

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世, reason: contains not printable characters */
    public abstract LocalDateTime mo6178();

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰, reason: contains not printable characters */
    public abstract LocalDateTime mo6179();

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
    public abstract LocalDateTime mo6180();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.time.LocalDate mo6181() {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2898.mo6181():java.time.LocalDate");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰, reason: contains not printable characters */
    public final long m6182() {
        mo6150();
        byte b = this.f9182;
        C2942 c2942 = this.f9199;
        switch (b) {
            case 1:
            case 9:
            case 10:
                if (this.f9190 == 0 && this.f9189 == 0) {
                    boolean z = this.f9183;
                    int i = this.f9188;
                    if (z) {
                        if (i == Integer.MIN_VALUE) {
                            return i;
                        }
                        if (i >= 0) {
                            return -i;
                        }
                    } else if (i >= 0) {
                        return i;
                    }
                }
                Number numberM6057 = m6057();
                if (!(numberM6057 instanceof BigInteger)) {
                    return numberM6057.longValue();
                }
                BigInteger bigInteger = (BigInteger) numberM6057;
                if ((c2942.f9318 & JSONReader$Feature.NonErrorOnNumberOverflow.mask) != 0) {
                    return bigInteger.longValue();
                }
                try {
                    return bigInteger.longValueExact();
                } catch (ArithmeticException unused) {
                    throw m6092();
                }
            case 2:
            case 11:
            case 12:
            case 13:
                return m6057().longValue();
            case 3:
                return m6192(this.f9186);
            case 4:
                return this.f9184 ? 1L : 0L;
            case 5:
                if ((c2942.f9318 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    C0276.m849(mo6124("long value not support input null"));
                    return 0L;
                }
            case 6:
                Map map = (Map) this.f9185;
                if (map.get("val") instanceof Number) {
                    return ((Number) r1).intValue();
                }
                throw m6113("parseLong error, value : " + map);
            case 7:
                return m6193((List) this.f9185);
            case 8:
                try {
                    return m6111().longValueExact();
                } catch (ArithmeticException unused2) {
                    throw m6092();
                }
            default:
                C0276.m843(this.f9182, "TODO : ");
                return 0L;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
    public abstract LocalDate mo6183();

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世, reason: contains not printable characters */
    public abstract LocalDate mo6184();

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰, reason: contains not printable characters */
    public abstract LocalDate mo6185();

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
    public abstract LocalDate mo6186();

    /* JADX INFO: renamed from: 飘花落叶言楪苏世兰子哲, reason: contains not printable characters */
    public int mo6187() {
        if (mo6095()) {
            return Integer.MAX_VALUE;
        }
        C0276.m849(mo6124("illegal input, expect '[', but " + this.f9191));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲兰子, reason: contains not printable characters */
    public abstract void mo6188();

    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰, reason: contains not printable characters */
    public abstract void mo6189();

    /* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲, reason: contains not printable characters */
    public abstract void mo6190();

    /* JADX INFO: renamed from: 飘花落叶言楪苏世子哲兰, reason: contains not printable characters */
    public void mo6191(C0966 c0966) {
        this.f9192 = c0966.f2755;
        this.f9191 = (char) c0966.f2754;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲世子兰, reason: contains not printable characters */
    public final long m6192(String str) {
        if (AbstractC2848.m5643(str) || str.lastIndexOf(44) == str.length() - 4) {
            return AbstractC2866.m5860(str);
        }
        if (str.length() > 10 && str.length() < 40) {
            try {
                return AbstractC2865.m5850(str, (ZoneId) this.f9199.f9317);
            } catch (JSONException | NullPointerException | DateTimeException unused) {
            }
        }
        throw this.m6113("parseLong error, value : ".concat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲子兰世, reason: contains not printable characters */
    public final int m6193(List list) {
        if (list.size() == 1) {
            Object obj = list.get(0);
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
        }
        throw m6113("parseLong error, field : value " + list);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏子世兰哲, reason: contains not printable characters */
    public long mo6194() {
        return mo6199();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏子世哲兰, reason: contains not printable characters */
    public final String m6195() {
        char c = this.f9191;
        if (c != '+' && c != '-') {
            if (c == '[') {
                List listMo6079 = mo6079();
                if (listMo6079.size() == 1) {
                    Object obj = listMo6079.get(0);
                    if (obj == null) {
                        return null;
                    }
                    if ((this.f9199.f9318 & JSONReader$Feature.DisableStringArrayUnwrapping.mask) == 0 && (obj instanceof String)) {
                        return obj.toString();
                    }
                }
                AbstractC2896 abstractC2896M6012 = AbstractC2896.m6012();
                abstractC2896M6012.m6039(listMo6079);
                abstractC2896M6012.mo5953(listMo6079);
                return abstractC2896M6012.toString();
            }
            if (c != 'f') {
                if (c == 'n') {
                    mo6157();
                    return null;
                }
                if (c != 't') {
                    if (c == '{') {
                        Map mapMo6149 = mo6149();
                        AbstractC2896 abstractC2896M60122 = AbstractC2896.m6012();
                        abstractC2896M60122.m6039(mapMo6149);
                        abstractC2896M60122.mo5951(mapMo6149);
                        return abstractC2896M60122.toString();
                    }
                    switch (c) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            break;
                        default:
                            C0276.m849(mo6124("illegal input : " + this.f9191));
                            return null;
                    }
                }
            }
            boolean zMo6062 = mo6062();
            this.f9184 = zMo6062;
            return zMo6062 ? "true" : "false";
        }
        mo6150();
        return m6057().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.time.ZonedDateTime mo6196() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2898.mo6196():java.time.ZonedDateTime");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世, reason: contains not printable characters */
    public abstract ZonedDateTime mo6197(int i);

    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰, reason: contains not printable characters */
    public abstract UUID mo6198();

    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲兰世, reason: contains not printable characters */
    public abstract long mo6199();
}
