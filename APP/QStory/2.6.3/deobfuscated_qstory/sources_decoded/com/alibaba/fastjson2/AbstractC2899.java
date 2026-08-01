package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import androidx.compose.foundation.text.C0966;
import com.alibaba.fastjson2.reader.AbstractC2762;
import com.alibaba.fastjson2.reader.C2704;
import com.alibaba.fastjson2.reader.C2772;
import com.alibaba.fastjson2.reader.C2802;
import com.alibaba.fastjson2.reader.InterfaceC2788;
import com.alibaba.fastjson2.schema.JSONSchema;
import com.alibaba.fastjson2.util.AbstractC2849;
import com.alibaba.fastjson2.util.AbstractC2854;
import com.alibaba.fastjson2.util.AbstractC2866;
import com.alibaba.fastjson2.util.AbstractC2867;
import com.alibaba.fastjson2.util.C2829;
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
import p009.AbstractC6183;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2899 implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public static final boolean[] f9179;

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public boolean f9180;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public int f9181;

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public short f9182;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public short f9183;

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public byte f9184;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public boolean f9185;

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public boolean f9186;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public Object f9187;

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public String f9188;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public int f9189;

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public int f9190;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public int f9191;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public int f9192;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public char f9193;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f9194;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f9195;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f9196;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public boolean f9197;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public boolean f9198;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f9199;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public ArrayList f9200;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2943 f9201;

    static {
        boolean[] zArr = new boolean[256];
        f9179 = zArr;
        Arrays.fill(zArr, true);
        char[] cArr = {TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, 'e', 'E', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, 'f', 'n', '{', TypePool.Default.LazyTypeDescription.GenericTypeToken.COMPONENT_TYPE_PATH, '0', '1', '2', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < 19; i++) {
            f9179[cArr[i]] = false;
        }
    }

    public AbstractC2899(C2943 c2943, boolean z) {
        this.f9201 = c2943;
        this.f9199 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世楪苏, reason: contains not printable characters */
    public static AbstractC2899 m6091(String str) {
        return m6092(str, AbstractC2933.m6389());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰世苏楪, reason: contains not printable characters */
    public static AbstractC2899 m6092(String str, C2943 c2943) {
        ToIntFunction toIntFunction;
        if (str == null || c2943 == null) {
            throw null;
        }
        Function function = AbstractC2854.f8927;
        if (function != null && (toIntFunction = AbstractC2854.f8926) != null) {
            try {
                if (toIntFunction.applyAsInt(str) == 0) {
                    byte[] bArr = (byte[]) function.apply(str);
                    return new C2903(c2943, str, bArr, bArr.length);
                }
            } catch (Exception unused) {
                C0276.m850("unsafe get String.coder error");
                return null;
            }
        }
        return new C2901(c2943, str, AbstractC2854.f8918 == 8 ? AbstractC2854.m5770(str) : str.toCharArray(), str.length());
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪苏世, reason: contains not printable characters */
    public static JSONException m6093(int i, int i2) {
        StringBuilder sbM150 = AbstractC0053.m150(i, "illegal number, offset ", ", char ");
        sbM150.append((char) i2);
        return new JSONException(sbM150.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static void m6094(int i, int i2) {
        StringBuilder sbM150 = AbstractC0053.m150(i, "error, offset ", ", char ");
        sbM150.append((char) i2);
        throw new JSONValidException(sbM150.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static char m6095(int i, int i2) {
        int[] iArr = AbstractC2933.f9300;
        return (char) ((iArr[i] * 16) + iArr[i2]);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰, reason: contains not printable characters */
    public static boolean m6096(int i) {
        if (i >= 65 && i <= 90) {
            return true;
        }
        if ((i >= 97 && i <= 122) || i == 95 || i == 36) {
            return true;
        }
        return (i >= 48 && i <= 57) || i > 127;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏世兰哲子, reason: contains not printable characters */
    public static String m6097(long j, String str) {
        if ((16384 & j) != 0) {
            str = str.trim();
        }
        if ((j & 134217728) == 0 || !str.isEmpty()) {
            return str;
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲子世兰, reason: contains not printable characters */
    public static JSONException m6098(int i, int i2) {
        StringBuilder sbM150 = AbstractC0053.m150(i, "syntax error, offset ", ", char ");
        sbM150.append((char) i2);
        return new JSONException(sbM150.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public abstract int mo6099();

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public abstract String mo6100();

    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final InterfaceC2788 m6101(long j, long j2, Class cls) {
        C2943 c2943 = this.f9201;
        InterfaceC2788 interfaceC2788M5630 = ((C2802) c2943.f9318).m5630(j);
        if (interfaceC2788M5630 != null) {
            return interfaceC2788M5630;
        }
        return ((C2802) c2943.f9318).m5629(mo6100(), cls, c2943.f9320 | j2);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final InterfaceC2788 m6102(Type type) {
        C2943 c2943 = this.f9201;
        return ((C2802) c2943.f9318).m5633(type, (c2943.f9320 & 1) != 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Number m6103() {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2899.m6103():java.lang.Number");
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract String mo6104();

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final double m6105() {
        int i;
        byte b = this.f9184;
        C2943 c2943 = this.f9201;
        switch (b) {
            case 1:
            case 9:
            case 10:
                if (this.f9192 == 0 && this.f9191 == 0 && (i = this.f9190) != Integer.MIN_VALUE) {
                    return this.f9185 ? -i : i;
                }
                Number numberM6103 = m6103();
                if (!(numberM6103 instanceof BigInteger)) {
                    return numberM6103.doubleValue();
                }
                BigInteger bigInteger = (BigInteger) numberM6103;
                if ((c2943.f9320 & JSONReader$Feature.NonErrorOnNumberOverflow.mask) != 0) {
                    return bigInteger.longValue();
                }
                try {
                    return bigInteger.longValueExact();
                } catch (ArithmeticException unused) {
                    throw m6138();
                }
            case 2:
            case 11:
            case 12:
            case 13:
                return m6103().doubleValue();
            case 3:
                try {
                    return AbstractC2867.m5917(this.f9188);
                } catch (NumberFormatException e) {
                    C0276.m850(mo6170(e.getMessage()));
                    return 0.0d;
                }
            case 4:
                return this.f9186 ? 1.0d : 0.0d;
            case 5:
                if ((c2943.f9320 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    C0276.m850(mo6170("long value not support input null"));
                    return 0.0d;
                }
            case 6:
                Map map = (Map) this.f9187;
                if (map != null && !map.isEmpty()) {
                    return AbstractC2867.m5917(map);
                }
                this.f9196 = true;
                return 0.0d;
            case 7:
                Collection collection = (Collection) this.f9187;
                if (collection != null && !collection.isEmpty()) {
                    return AbstractC2867.m5917(this.f9187);
                }
                this.f9196 = true;
                return 0.0d;
            case 8:
                try {
                    return m6158().doubleValue();
                } catch (ArithmeticException unused2) {
                    throw m6138();
                }
            case 14:
                return Double.NaN;
            default:
                C0276.m844(this.f9184, "TODO : ");
                return 0.0d;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public abstract long mo6106();

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final void m6107() {
        this.f9201.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏, reason: contains not printable characters */
    public abstract boolean mo6108();

    /* JADX INFO: renamed from: 飘花落叶言子兰世哲苏楪, reason: contains not printable characters */
    public char mo6109() {
        String strMo6184 = mo6184();
        if (strMo6184 != null && !strMo6184.isEmpty()) {
            return strMo6184.charAt(0);
        }
        this.f9196 = true;
        return (char) 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪哲苏, reason: contains not printable characters */
    public BigInteger mo6110() {
        mo6195();
        Number numberM6103 = m6103();
        if (numberM6103 == null) {
            return null;
        }
        return numberM6103 instanceof BigInteger ? (BigInteger) numberM6103 : BigInteger.valueOf(numberM6103.longValue());
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世楪苏哲, reason: contains not printable characters */
    public abstract BigDecimal mo6111();

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏哲楪, reason: contains not printable characters */
    public Boolean mo6112() {
        if (mo6133()) {
            return null;
        }
        this.f9196 = false;
        boolean zMo6108 = mo6108();
        if (zMo6108 || !this.f9196) {
            return Boolean.valueOf(zMo6108);
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰世苏楪哲, reason: contains not printable characters */
    public byte[] mo6113() {
        if (this.f9193 == 'x') {
            return mo6115();
        }
        if (mo6179()) {
            String strMo6184 = mo6184();
            if (strMo6184.isEmpty()) {
                return null;
            }
            if ((this.f9201.f9320 & JSONReader$Feature.Base64StringAsByteArray.mask) != 0) {
                return Base64.getDecoder().decode(strMo6184);
            }
            C0276.m850(mo6170("not support input ".concat(strMo6184)));
            return null;
        }
        if (!mo6141()) {
            C0276.m850(mo6170("not support read binary"));
            return null;
        }
        byte[] bArrCopyOf = new byte[64];
        int i = 0;
        while (this.f9193 != ']') {
            if (i == bArrCopyOf.length) {
                int length = bArrCopyOf.length;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, length + (length >> 1));
            }
            bArrCopyOf[i] = (byte) mo6212();
            i++;
        }
        mo6173();
        mo6145();
        return Arrays.copyOf(bArrCopyOf, i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世楪苏, reason: contains not printable characters */
    public abstract float mo6114();

    /* JADX INFO: renamed from: 飘花落叶言子兰哲世苏楪, reason: contains not printable characters */
    public abstract byte[] mo6115();

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪世苏, reason: contains not printable characters */
    public final String m6116() {
        if (this.f9193 == '/') {
            mo6235();
        }
        mo6128();
        String strMo6104 = mo6104();
        if (strMo6104 != null && !strMo6104.isEmpty()) {
            return strMo6104;
        }
        C0276.m850(mo6170("illegal input"));
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲楪苏世, reason: contains not printable characters */
    public Float mo6117() {
        if (mo6133()) {
            return null;
        }
        this.f9196 = false;
        float fMo6114 = mo6114();
        if (this.f9196) {
            return null;
        }
        return Float.valueOf(fMo6114);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏世楪, reason: contains not printable characters */
    public Instant mo6118() {
        if (mo6133()) {
            return null;
        }
        if (mo6178()) {
            long jMo6209 = mo6209();
            this.f9201.getClass();
            return Instant.ofEpochMilli(jMo6209);
        }
        if (mo6177()) {
            return (Instant) m6102(Instant.class).mo5507(mo6194(), 0L);
        }
        ZonedDateTime zonedDateTimeMo6241 = mo6241();
        if (zonedDateTimeMo6241 == null) {
            return null;
        }
        return Instant.ofEpochSecond(zonedDateTimeMo6241.toEpochSecond(), zonedDateTimeMo6241.toLocalTime().getNano());
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰哲苏楪世, reason: contains not printable characters */
    public abstract boolean mo6119();

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
    public void mo6120(java.util.Map r20, long r21) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2899.mo6120(java.util.Map, long):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪世苏哲, reason: contains not printable characters */
    public final void m6121(JSONArray jSONArray) {
        if (!mo6141()) {
            C2942.m6393(this.f9194, this.f9193, "illegal input, offset ");
            return;
        }
        int i = this.f9189 + 1;
        this.f9189 = i;
        this.f9201.getClass();
        if (i >= 2048) {
            C0276.m844(this.f9189, "level too large : ");
            return;
        }
        while (!this.mo6142()) {
            AbstractC2899 abstractC2899 = this;
            jSONArray.add(C2704.f8208.mo5463(abstractC2899, null, null, 0L));
            abstractC2899.mo6145();
            this = abstractC2899;
        }
        this.f9189--;
        this.mo6145();
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲世苏, reason: contains not printable characters */
    public List mo6122(Type type) {
        AbstractC2899 abstractC2899;
        AbstractC2899 abstractC28992;
        Object objMo5463;
        char c;
        if (mo6133()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char c2 = this.f9193;
        if (c2 == '[') {
            mo6173();
            C2943 c2943 = this.f9201;
            InterfaceC2788 interfaceC2788M5633 = ((C2802) c2943.f9318).m5633(type, (c2943.f9320 & JSONReader$Feature.FieldBased.mask) != 0);
            int i = 0;
            while (!this.mo6142()) {
                int i2 = this.f9194;
                if (this.mo6180()) {
                    String strMo6189 = this.mo6189();
                    if ("..".equals(strMo6189)) {
                        objMo5463 = arrayList;
                    } else {
                        this.m6154(arrayList, i, AbstractC2922.m6378(strMo6189));
                        objMo5463 = null;
                    }
                    abstractC28992 = this;
                } else {
                    abstractC28992 = this;
                    objMo5463 = interfaceC2788M5633.mo5463(abstractC28992, null, null, 0L);
                }
                arrayList.add(objMo5463);
                if (i2 == abstractC28992.f9194 || (c = abstractC28992.f9193) == '}' || c == 26) {
                    throw new JSONException("illegal input : " + abstractC28992.f9193 + ", offset " + abstractC28992.f9194);
                }
                i++;
                this = abstractC28992;
            }
            abstractC2899 = this;
        } else {
            abstractC2899 = this;
            if (c2 != '\"' && c2 != '\'' && c2 != '{') {
                C0276.m850(abstractC2899.mo6170("syntax error"));
                return null;
            }
            String strMo6184 = abstractC2899.mo6184();
            if (strMo6184 != null && !strMo6184.isEmpty()) {
                arrayList.add(strMo6184);
            }
        }
        boolean z = abstractC2899.f9193 == ',';
        abstractC2899.f9197 = z;
        if (z) {
            abstractC2899.mo6173();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪哲苏世, reason: contains not printable characters */
    public byte[] mo6123() {
        int iIndexOf;
        int i;
        int iIndexOf2;
        String strMo6184 = mo6184();
        if (strMo6184 != null && strMo6184.startsWith("data:image/") && (iIndexOf = strMo6184.indexOf(59, 12)) != -1 && (iIndexOf2 = strMo6184.indexOf(44, (i = iIndexOf + 1))) != -1 && strMo6184.regionMatches(i, "base64", 0, 6)) {
            strMo6184 = strMo6184.substring(iIndexOf2 + 1);
        }
        return strMo6184.isEmpty() ? new byte[0] : Base64.getDecoder().decode(strMo6184);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰楪苏世哲, reason: contains not printable characters */
    public Object mo6124() {
        return mo6140(Object.class);
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
    public java.util.List mo6125() {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2899.mo6125():java.util.List");
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世哲楪, reason: contains not printable characters */
    public abstract String mo6126();

    /* JADX INFO: renamed from: 飘花落叶言子兰苏世楪哲, reason: contains not printable characters */
    public abstract double mo6127();

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪, reason: contains not printable characters */
    public abstract long mo6128();

    /* JADX INFO: renamed from: 飘花落叶言子兰苏哲楪世, reason: contains not printable characters */
    public abstract long mo6129();

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪世哲, reason: contains not printable characters */
    public Date mo6130() throws IOException {
        long jM6204;
        if (mo6181()) {
            return new Date(mo6209());
        }
        if (mo6119() || mo6151()) {
            return null;
        }
        if (this.f9193 == 'n') {
            return mo6193();
        }
        if (this.f9180 && mo6136()) {
            mo6144(':');
            jM6204 = mo6209();
            mo6152();
            this.f9180 = false;
        } else {
            if (mo6177()) {
                JSONObject jSONObject = new JSONObject();
                mo6120(jSONObject, 0L);
                Object obj = jSONObject.get("$date");
                if (!(obj instanceof String)) {
                    return AbstractC2867.m5919(jSONObject);
                }
                long jM5895 = AbstractC2866.m5895((String) obj, this.f9201.m6409());
                if (jM5895 == 0) {
                    return null;
                }
                return new Date(jM5895);
            }
            jM6204 = m6204();
        }
        if (jM6204 == 0 && this.f9196) {
            return null;
        }
        return new Date(jM6204);
    }

    /* JADX INFO: renamed from: 飘花落叶言子兰苏楪哲世, reason: contains not printable characters */
    public final Double m6131() {
        if (mo6133()) {
            return null;
        }
        this.f9196 = false;
        double dMo6127 = mo6127();
        if (this.f9196) {
            return null;
        }
        return Double.valueOf(dMo6127);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰楪苏, reason: contains not printable characters */
    public boolean mo6132() {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲世兰苏楪, reason: contains not printable characters */
    public abstract boolean mo6133();

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪兰苏, reason: contains not printable characters */
    public abstract boolean mo6134(char c, char c2, char c3, char c4);

    /* JADX INFO: renamed from: 飘花落叶言子哲世楪苏兰, reason: contains not printable characters */
    public abstract boolean mo6135();

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏兰楪, reason: contains not printable characters */
    public abstract boolean mo6136();

    /* JADX INFO: renamed from: 飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
    public abstract boolean mo6137(char c, char c2, char c3, char c4, char c5, char c6);

    /* JADX INFO: renamed from: 飘花落叶言子哲兰楪世苏, reason: contains not printable characters */
    public final JSONException m6138() {
        return new JSONException("illegal number, offset " + this.f9194 + ", char " + this.f9193);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏世楪, reason: contains not printable characters */
    public Object mo6139(Type type) {
        C2943 c2943 = this.f9201;
        return ((C2802) c2943.f9318).m5633(type, (c2943.f9320 & JSONReader$Feature.FieldBased.mask) != 0).mo5463(this, null, null, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲兰苏楪世, reason: contains not printable characters */
    public Object mo6140(Class cls) {
        C2943 c2943 = this.f9201;
        return ((C2802) c2943.f9318).m5633(cls, (c2943.f9320 & JSONReader$Feature.FieldBased.mask) != 0).mo5463(this, null, null, 0L);
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世兰苏, reason: contains not printable characters */
    public abstract boolean mo6141();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪世苏兰, reason: contains not printable characters */
    public abstract boolean mo6142();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰世苏, reason: contains not printable characters */
    public boolean mo6143(byte b) {
        throw new JSONException("UnsupportedOperation");
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲楪兰苏世, reason: contains not printable characters */
    public abstract boolean mo6144(char c);

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏世兰, reason: contains not printable characters */
    public abstract boolean mo6145();

    /* JADX INFO: renamed from: 飘花落叶言子哲楪苏兰世, reason: contains not printable characters */
    public abstract boolean mo6146();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
    public abstract boolean mo6147();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏世楪兰, reason: contains not printable characters */
    public abstract boolean mo6148();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰世楪, reason: contains not printable characters */
    public final JSONException m6149() {
        return new JSONException(mo6170("not support unquoted name"));
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世, reason: contains not printable characters */
    public void mo6150() {
        mo6173();
    }

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪世兰, reason: contains not printable characters */
    public abstract boolean mo6151();

    /* JADX INFO: renamed from: 飘花落叶言子哲苏楪兰世, reason: contains not printable characters */
    public abstract boolean mo6152();

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m6153(Map map, Object obj, AbstractC2922 abstractC2922) {
        if (this.f9200 == null) {
            this.f9200 = new ArrayList();
        }
        if (map instanceof LinkedHashMap) {
            map.put(obj, null);
        }
        this.f9200.add(new C2900(null, map, obj, abstractC2922));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m6154(Collection collection, int i, AbstractC2922 abstractC2922) {
        if (this.f9200 == null) {
            this.f9200 = new ArrayList();
        }
        this.f9200.add(new C2900(null, collection, Integer.valueOf(i), abstractC2922));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m6155(ArrayList arrayList, int i, Object obj) {
        if (!(obj instanceof AbstractC2922)) {
            arrayList.add(obj);
        } else {
            m6154(arrayList, i, (AbstractC2922) obj);
            arrayList.add(null);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void m6156(Class cls) {
        if ((this.f9201.f9320 & 4) == 0 || Serializable.class.isAssignableFrom(cls)) {
            return;
        }
        C0276.m850("not support none-Serializable, class ".concat(cls.getName()));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final long m6157(long j) {
        return this.f9201.f9320 | j;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f9  */
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.math.BigDecimal m6158() {
        /*
            Method dump skipped, instruction units count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2899.m6158():java.math.BigDecimal");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final JSONException m6159(String str) {
        return new JSONException(mo6170(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final void m6160() {
        throw new JSONValidException("error, offset " + this.f9194 + ", char " + this.f9193);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final char m6161(int i) {
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
                                            C0276.m850(mo6170("unclosed.str '\\" + ((char) i)));
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
    public final boolean m6162(int i) {
        long j = this.f9201.f9320;
        if (i == 39 && (2147483648L & j) != 0) {
            throw m6149();
        }
        if (i == 34 || i == 39) {
            return false;
        }
        if ((j & 131072) == 0) {
            throw m6149();
        }
        mo6128();
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final BigDecimal m6163(JSONObject jSONObject) {
        BigDecimal bigDecimal = jSONObject.getBigDecimal("value");
        if (bigDecimal == null) {
            bigDecimal = jSONObject.getBigDecimal("$numberDecimal");
        }
        if (bigDecimal != null) {
            return bigDecimal;
        }
        throw m6159("can not cast to decimal " + jSONObject);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public InterfaceC2788 mo6164(long j, long j2, Class cls) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰哲楪, reason: contains not printable characters */
    public boolean mo6165() {
        return this.f9193 == 26;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final boolean m6166(JSONReader$Feature jSONReader$Feature) {
        return (jSONReader$Feature.mask & this.f9201.f9320) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
    public boolean mo6167() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public boolean mo6168() {
        return false;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public boolean mo6169() {
        return this.f9193 == '[';
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
    public String mo6170(String str) {
        if (str == null || str.isEmpty()) {
            return "offset " + this.f9194;
        }
        StringBuilder sbM11584 = AbstractC6183.m11584(str, ", offset ");
        sbM11584.append(this.f9194);
        return sbM11584.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
    public final boolean m6171(long j) {
        return ((this.f9201.f9320 | j) & 64) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰世楪哲, reason: contains not printable characters */
    public final boolean m6172(long j) {
        return ((this.f9201.f9320 | j) & 8) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲世楪, reason: contains not printable characters */
    public abstract void mo6173();

    /* JADX INFO: renamed from: 飘花落叶言子苏兰哲楪世, reason: contains not printable characters */
    public C0966 mo6174() {
        return new C0966(this.f9194, this.f9193);
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪世哲, reason: contains not printable characters */
    public final boolean m6175(long j) {
        return ((this.f9201.f9320 | j) & 32) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    public final boolean m6176() {
        return (this.f9201.f9320 & 8) != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪, reason: contains not printable characters */
    public boolean mo6177() {
        return this.f9193 == '{';
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰, reason: contains not printable characters */
    public boolean mo6178() {
        char c = this.f9193;
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
    public boolean mo6179() {
        char c = this.f9193;
        return c == '\"' || c == '\'';
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
    public abstract boolean mo6180();

    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世, reason: contains not printable characters */
    public boolean mo6181() {
        char c = this.f9193;
        if (c == '-' || c == '+') {
            return true;
        }
        return c >= '0' && c <= '9';
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void m6182(Object obj) {
        ArrayList<C2900> arrayList = this.f9200;
        if (arrayList == null) {
            return;
        }
        Object objMo5948 = null;
        for (C2900 c2900 : arrayList) {
            AbstractC2922 abstractC2922 = c2900.f9202;
            AbstractC2762 abstractC2762 = c2900.f9205;
            abstractC2922.getClass();
            if (!(abstractC2922 instanceof C2918)) {
                if (!abstractC2922.mo5946()) {
                    C2942.m6404(abstractC2922, "reference path invalid : ");
                    return;
                }
                if ((this.f9201.f9320 & JSONReader$Feature.FieldBased.mask) != 0) {
                    C2895 c2895 = new C2895(AbstractC2933.f9294);
                    c2895.f9153 |= JSONWriter$Feature.FieldBased.mask;
                    abstractC2922.f9264 = c2895;
                }
                objMo5948 = abstractC2922.mo5948(obj);
            }
            Object obj2 = c2900.f9203;
            Object obj3 = c2900.f9204;
            if (obj2 != null) {
                if (obj3 instanceof Map) {
                    Map map = (Map) obj3;
                    if (!(obj2 instanceof C2829)) {
                        map.put(obj2, objMo5948);
                    } else if (map instanceof LinkedHashMap) {
                        int size = map.size();
                        if (size != 0) {
                            Object[] objArr = new Object[size];
                            Object[] objArr2 = new Object[size];
                            int i = 0;
                            for (Map.Entry entry : map.entrySet()) {
                                Object key = entry.getKey();
                                if (obj2 == key) {
                                    objArr[i] = objMo5948;
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
                        map.put(objMo5948, map.remove(obj2));
                    }
                } else if (obj2 instanceof Integer) {
                    if (obj3 instanceof List) {
                        int iIntValue = ((Integer) obj2).intValue();
                        List list = (List) obj3;
                        if (iIntValue == list.size()) {
                            list.add(objMo5948);
                        } else if (iIntValue >= list.size() || list.get(iIntValue) != null) {
                            list.add(iIntValue, objMo5948);
                        } else {
                            list.set(iIntValue, objMo5948);
                        }
                    } else if (obj3 instanceof Object[]) {
                        ((Object[]) obj3)[((Integer) obj2).intValue()] = objMo5948;
                    } else if (obj3 instanceof Collection) {
                        ((Collection) obj3).add(objMo5948);
                    }
                }
            }
            abstractC2762.mo5471(obj3, objMo5948);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public byte mo6183() {
        return (byte) -128;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲子苏, reason: contains not printable characters */
    public abstract String mo6184();

    /* JADX INFO: renamed from: 飘花落叶言楪世兰哲苏子, reason: contains not printable characters */
    public String[] mo6185() {
        if (this.f9193 != 'n' || !mo6133()) {
            if (mo6141()) {
                int i = 0;
                String[] strArr = null;
                while (!mo6142()) {
                    if (mo6165()) {
                        C0276.m850(mo6170("input end"));
                        return null;
                    }
                    if (strArr == null) {
                        strArr = new String[16];
                    } else if (i == strArr.length) {
                        strArr = (String[]) Arrays.copyOf(strArr, strArr.length << 1);
                    }
                    strArr[i] = mo6184();
                    i++;
                }
                if (strArr == null) {
                    strArr = new String[0];
                }
                return strArr.length == i ? strArr : (String[]) Arrays.copyOf(strArr, i);
            }
            char c = this.f9193;
            if (c != '\"' && c != '\'') {
                C0276.m850(mo6170("not support input"));
                return null;
            }
            String strMo6184 = mo6184();
            if (!strMo6184.isEmpty()) {
                C0276.m850(mo6170("not support input ".concat(strMo6184)));
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世兰子哲苏, reason: contains not printable characters */
    public abstract String mo6186();

    /* JADX INFO: renamed from: 飘花落叶言楪世兰子苏哲, reason: contains not printable characters */
    public abstract OffsetTime mo6187();

    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏哲子, reason: contains not printable characters */
    public boolean mo6188(int i, Collection collection) {
        if (!mo6180()) {
            return false;
        }
        String strMo6189 = mo6189();
        if ("..".equals(strMo6189)) {
            collection.add(collection);
            return true;
        }
        m6154(collection, i, AbstractC2922.m6378(strMo6189));
        return true;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世兰苏子哲, reason: contains not printable characters */
    public abstract String mo6189();

    /* JADX INFO: renamed from: 飘花落叶言楪世哲兰子苏, reason: contains not printable characters */
    public final void m6190(Map map, long j) throws IOException {
        if (map == null) {
            C0276.m850("object is null");
            return;
        }
        Class<?> cls = map.getClass();
        C2943 c2943 = this.f9201;
        InterfaceC2788 interfaceC2788M5633 = ((C2802) c2943.f9318).m5633(cls, ((c2943.f9320 | j) & JSONReader$Feature.FieldBased.mask) != 0);
        if (!(interfaceC2788M5633 instanceof C2772)) {
            mo6120(map, j);
            return;
        }
        C2772 c2772 = (C2772) interfaceC2788M5633;
        if (mo6133()) {
            mo6145();
            return;
        }
        if (!mo6148()) {
            C0276.m850(mo6170(null));
            return;
        }
        while (!mo6152()) {
            AbstractC2762 abstractC2762Mo5465 = c2772.mo5465(mo6129());
            if (abstractC2762Mo5465 == null && m6171(c2772.f8447 | j)) {
                abstractC2762Mo5465 = c2772.mo5464(mo6106());
            }
            if (abstractC2762Mo5465 == null) {
                c2772.m5581(this, map);
            } else {
                abstractC2762Mo5465.mo5472(this, map);
            }
        }
        mo6145();
        JSONSchema jSONSchema = c2772.f8465;
        if (jSONSchema != null) {
            jSONSchema.m5656(map);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世哲兰苏子, reason: contains not printable characters */
    public abstract OffsetDateTime mo6191();

    /* JADX INFO: renamed from: 飘花落叶言楪世哲子兰苏, reason: contains not printable characters */
    public Number mo6192() {
        mo6195();
        return m6103();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世哲子苏兰, reason: contains not printable characters */
    public abstract Date mo6193();

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
    public java.util.Map mo6194() {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2899.mo6194():java.util.Map");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世哲苏子兰, reason: contains not printable characters */
    public abstract void mo6195();

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰哲苏, reason: contains not printable characters */
    public abstract LocalTime mo6196();

    /* JADX INFO: renamed from: 飘花落叶言楪世子兰苏哲, reason: contains not printable characters */
    public abstract LocalTime mo6197();

    /* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏, reason: contains not printable characters */
    public abstract LocalTime mo6198();

    /* JADX INFO: renamed from: 飘花落叶言楪世子哲苏兰, reason: contains not printable characters */
    public abstract LocalTime mo6199();

    /* JADX INFO: renamed from: 飘花落叶言楪世子苏兰哲, reason: contains not printable characters */
    public abstract LocalTime mo6200();

    /* JADX INFO: renamed from: 飘花落叶言楪世子苏哲兰, reason: contains not printable characters */
    public abstract LocalTime mo6201();

    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子, reason: contains not printable characters */
    public abstract void mo6202();

    /* JADX INFO: renamed from: 飘花落叶言楪世苏兰子哲, reason: contains not printable characters */
    public double mo6203() {
        throw new JSONException("not support");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲兰子, reason: contains not printable characters */
    public final long m6204() {
        LocalDateTime localDateTimeOf;
        ZonedDateTime zonedDateTimeM5880;
        Function function;
        long j;
        int i;
        this.f9196 = false;
        C2943 c2943 = this.f9201;
        c2943.getClass();
        int iMo6099 = mo6099();
        ZonedDateTime zonedDateTimeOfLocal = null;
        switch (iMo6099) {
            case 8:
                LocalDate localDateMo6228 = mo6228();
                if (localDateMo6228 == null) {
                    C0276.m841(mo6184(), "TODO : ");
                    return 0L;
                }
                localDateTimeOf = LocalDateTime.of(localDateMo6228, LocalTime.MIN);
                break;
                break;
            case 9:
                LocalDate localDateMo6229 = mo6229();
                localDateTimeOf = localDateMo6229 == null ? null : LocalDateTime.of(localDateMo6229, LocalTime.MIN);
                break;
            case 10:
                LocalDate localDateMo6230 = mo6230();
                if (localDateMo6230 == null) {
                    String strMo6184 = mo6184();
                    if ("0000-00-00".equals(strMo6184)) {
                        this.f9196 = true;
                        return 0L;
                    }
                    if (AbstractC2849.m5688(strMo6184)) {
                        return Long.parseLong(strMo6184);
                    }
                    C0276.m850("TODO : ".concat(strMo6184));
                    return 0L;
                }
                localDateTimeOf = LocalDateTime.of(localDateMo6230, LocalTime.MIN);
                break;
            case 11:
                LocalDate localDateMo6231 = mo6231();
                localDateTimeOf = localDateMo6231 == null ? null : LocalDateTime.of(localDateMo6231, LocalTime.MIN);
                break;
            case 12:
                localDateTimeOf = mo6220();
                break;
            case 13:
            case 15:
            default:
                localDateTimeOf = null;
                break;
            case 14:
                localDateTimeOf = mo6224();
                break;
            case 16:
                localDateTimeOf = mo6225();
                break;
            case 17:
                localDateTimeOf = mo6222();
                break;
            case 18:
                localDateTimeOf = mo6223();
                break;
            case 19:
                long jMo6205 = mo6205();
                if (jMo6205 != 0 || !this.f9196) {
                    return jMo6205;
                }
                localDateTimeOf = mo6215();
                break;
                break;
            case 20:
                localDateTimeOf = mo6214();
                break;
        }
        if (localDateTimeOf != null) {
            zonedDateTimeOfLocal = ZonedDateTime.ofLocal(localDateTimeOf, c2943.m6409(), null);
        } else if (iMo6099 >= 20) {
            ZonedDateTime zonedDateTimeMo6242 = mo6242(iMo6099);
            if (zonedDateTimeMo6242 != null || iMo6099 < 32 || iMo6099 > 35) {
                zonedDateTimeOfLocal = zonedDateTimeMo6242;
            } else {
                String strMo61842 = mo6184();
                ZoneId zoneId = AbstractC2866.f9027;
                if (strMo61842 != null && strMo61842.length() != 0) {
                    ToIntFunction toIntFunction = AbstractC2854.f8926;
                    if (toIntFunction == null || (function = AbstractC2854.f8927) == null || toIntFunction.applyAsInt(strMo61842) != 0) {
                        char[] cArrM5770 = AbstractC2854.m5770(strMo61842);
                        zonedDateTimeM5880 = AbstractC2866.m5880(cArrM5770, 0, cArrM5770.length, null);
                    } else {
                        byte[] bArr = (byte[]) function.apply(strMo61842);
                        zonedDateTimeM5880 = AbstractC2866.m5881(bArr, 0, bArr.length, null);
                    }
                    if (zonedDateTimeM5880 == null) {
                        switch (strMo61842) {
                            case "0":
                            case "null":
                            case "0000-00-00":
                                break;
                            default:
                                throw new DateTimeParseException(strMo61842, strMo61842, 0);
                        }
                    } else {
                        zonedDateTimeOfLocal = zonedDateTimeM5880;
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
        String strMo61843 = mo6184();
        if (strMo61843.isEmpty() || "null".equals(strMo61843)) {
            this.f9196 = true;
            return 0L;
        }
        if (!"0000-00-00T00:00:00".equals(strMo61843) && !"0001-01-01T00:00:00+08:00".equals(strMo61843)) {
            if (strMo61843.startsWith("/Date(") && strMo61843.endsWith(")/")) {
                String strM161 = AbstractC0053.m161(2, 6, strMo61843);
                int iIndexOf = strM161.indexOf(43);
                if (iIndexOf == -1) {
                    iIndexOf = strM161.indexOf(45);
                }
                if (iIndexOf != -1) {
                    strM161 = strM161.substring(0, iIndexOf);
                }
                return Long.parseLong(strM161);
            }
            if (AbstractC2849.m5688(strMo61843)) {
                return Long.parseLong(strMo61843);
            }
            C0276.m850(mo6170("format null not support, input ".concat(strMo61843)));
        }
        return 0L;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪世苏哲子兰, reason: contains not printable characters */
    public abstract long mo6205();

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子兰哲, reason: contains not printable characters */
    public abstract LocalTime mo6206();

    /* JADX INFO: renamed from: 飘花落叶言楪世苏子哲兰, reason: contains not printable characters */
    public abstract LocalTime mo6207();

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰哲苏, reason: contains not printable characters */
    public long[] mo6208() {
        if (!mo6133()) {
            if (mo6141()) {
                long[] jArrCopyOf = new long[8];
                int i = 0;
                while (!mo6142()) {
                    if (mo6165()) {
                        C0276.m850(mo6170("input end"));
                        return null;
                    }
                    if (i == jArrCopyOf.length) {
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, jArrCopyOf.length << 1);
                    }
                    jArrCopyOf[i] = mo6209();
                    i++;
                }
                return i == jArrCopyOf.length ? jArrCopyOf : Arrays.copyOf(jArrCopyOf, i);
            }
            if (!mo6179()) {
                C0276.m850(mo6170("TODO"));
                return null;
            }
            String strMo6184 = mo6184();
            if (!strMo6184.isEmpty()) {
                throw m6159("not support input ".concat(strMo6184));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世兰苏哲, reason: contains not printable characters */
    public abstract long mo6209();

    /* JADX INFO: renamed from: 飘花落叶言楪子世哲兰苏, reason: contains not printable characters */
    public abstract Long mo6210();

    /* JADX WARN: Code restructure failed: missing block: B:59:0x00de, code lost:
    
        if (r10 >= 0) goto L60;
     */
    /* JADX INFO: renamed from: 飘花落叶言楪子世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m6211() {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2899.m6211():int");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏兰哲, reason: contains not printable characters */
    public abstract int mo6212();

    /* JADX INFO: renamed from: 飘花落叶言楪子世苏哲兰, reason: contains not printable characters */
    public abstract Integer mo6213();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世哲苏, reason: contains not printable characters */
    public abstract LocalDateTime mo6214();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰世苏哲, reason: contains not printable characters */
    public abstract LocalDateTime mo6215();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲世苏, reason: contains not printable characters */
    public abstract LocalTime mo6216();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰哲苏世, reason: contains not printable characters */
    public abstract LocalTime mo6217();

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏世哲, reason: contains not printable characters */
    public abstract LocalDateTime mo6218(int i);

    /* JADX INFO: renamed from: 飘花落叶言楪子兰苏哲世, reason: contains not printable characters */
    public LocalTime mo6219() {
        if (!mo6133()) {
            boolean zMo6181 = mo6181();
            C2943 c2943 = this.f9201;
            if (zMo6181) {
                return Instant.ofEpochMilli(mo6209()).atZone(c2943.m6409()).toLocalTime();
            }
            switch (mo6099()) {
                case 5:
                    return mo6198();
                case 6:
                    return mo6197();
                case 7:
                    return mo6196();
                case 8:
                    return mo6207();
                case 9:
                    return mo6206();
                case 10:
                    return mo6216();
                case 11:
                    return mo6217();
                case 12:
                    return mo6201();
                case 13:
                case 14:
                case 16:
                case 17:
                default:
                    String strMo6184 = mo6184();
                    if (!strMo6184.isEmpty() && !"null".equals(strMo6184)) {
                        if (AbstractC2849.m5688(strMo6184)) {
                            return Instant.ofEpochMilli(Long.parseLong(strMo6184)).atZone(c2943.m6409()).toLocalTime();
                        }
                        C0276.m850("not support len : ".concat(strMo6184));
                    }
                    break;
                case 15:
                    return mo6200();
                case 18:
                    return mo6199();
                case 19:
                    return mo6215().toLocalTime();
                case 20:
                    return mo6214().toLocalTime();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲世兰苏, reason: contains not printable characters */
    public abstract LocalDateTime mo6220();

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
    public java.time.LocalDateTime mo6221() {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2899.mo6221():java.time.LocalDateTime");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏, reason: contains not printable characters */
    public abstract LocalDateTime mo6222();

    /* JADX INFO: renamed from: 飘花落叶言楪子哲兰苏世, reason: contains not printable characters */
    public abstract LocalDateTime mo6223();

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏世兰, reason: contains not printable characters */
    public abstract LocalDateTime mo6224();

    /* JADX INFO: renamed from: 飘花落叶言楪子哲苏兰世, reason: contains not printable characters */
    public abstract LocalDateTime mo6225();

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX INFO: renamed from: 飘花落叶言楪子苏世兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.time.LocalDate mo6226() {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2899.mo6226():java.time.LocalDate");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏世哲兰, reason: contains not printable characters */
    public final long m6227() {
        mo6195();
        byte b = this.f9184;
        C2943 c2943 = this.f9201;
        switch (b) {
            case 1:
            case 9:
            case 10:
                if (this.f9192 == 0 && this.f9191 == 0) {
                    boolean z = this.f9185;
                    int i = this.f9190;
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
                Number numberM6103 = m6103();
                if (!(numberM6103 instanceof BigInteger)) {
                    return numberM6103.longValue();
                }
                BigInteger bigInteger = (BigInteger) numberM6103;
                if ((c2943.f9320 & JSONReader$Feature.NonErrorOnNumberOverflow.mask) != 0) {
                    return bigInteger.longValue();
                }
                try {
                    return bigInteger.longValueExact();
                } catch (ArithmeticException unused) {
                    throw m6138();
                }
            case 2:
            case 11:
            case 12:
            case 13:
                return m6103().longValue();
            case 3:
                return m6237(this.f9188);
            case 4:
                return this.f9186 ? 1L : 0L;
            case 5:
                if ((c2943.f9320 & JSONReader$Feature.ErrorOnNullForPrimitives.mask) != 0) {
                    C0276.m850(mo6170("long value not support input null"));
                    return 0L;
                }
            case 6:
                Map map = (Map) this.f9187;
                if (map.get("val") instanceof Number) {
                    return ((Number) r1).intValue();
                }
                throw m6159("parseLong error, value : " + map);
            case 7:
                return m6238((List) this.f9187);
            case 8:
                try {
                    return m6158().longValueExact();
                } catch (ArithmeticException unused2) {
                    throw m6138();
                }
            default:
                C0276.m844(this.f9184, "TODO : ");
                return 0L;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲, reason: contains not printable characters */
    public abstract LocalDate mo6228();

    /* JADX INFO: renamed from: 飘花落叶言楪子苏兰哲世, reason: contains not printable characters */
    public abstract LocalDate mo6229();

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲世兰, reason: contains not printable characters */
    public abstract LocalDate mo6230();

    /* JADX INFO: renamed from: 飘花落叶言楪子苏哲兰世, reason: contains not printable characters */
    public abstract LocalDate mo6231();

    /* JADX INFO: renamed from: 飘花落叶言楪苏世兰子哲, reason: contains not printable characters */
    public int mo6232() {
        if (mo6141()) {
            return Integer.MAX_VALUE;
        }
        C0276.m850(mo6170("illegal input, expect '[', but " + this.f9193));
        return 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲兰子, reason: contains not printable characters */
    public abstract void mo6233();

    /* JADX INFO: renamed from: 飘花落叶言楪苏世哲子兰, reason: contains not printable characters */
    public abstract void mo6234();

    /* JADX INFO: renamed from: 飘花落叶言楪苏世子兰哲, reason: contains not printable characters */
    public abstract void mo6235();

    /* JADX INFO: renamed from: 飘花落叶言楪苏世子哲兰, reason: contains not printable characters */
    public void mo6236(C0966 c0966) {
        this.f9194 = c0966.f2756;
        this.f9193 = (char) c0966.f2755;
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲世子兰, reason: contains not printable characters */
    public final long m6237(String str) {
        if (AbstractC2849.m5688(str) || str.lastIndexOf(44) == str.length() - 4) {
            return AbstractC2867.m5905(str);
        }
        if (str.length() > 10 && str.length() < 40) {
            try {
                return AbstractC2866.m5895(str, (ZoneId) this.f9201.f9319);
            } catch (JSONException | NullPointerException | DateTimeException unused) {
            }
        }
        throw this.m6159("parseLong error, value : ".concat(str));
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏哲子兰世, reason: contains not printable characters */
    public final int m6238(List list) {
        if (list.size() == 1) {
            Object obj = list.get(0);
            if (obj instanceof Number) {
                return ((Number) obj).intValue();
            }
            if (obj instanceof String) {
                return Integer.parseInt((String) obj);
            }
        }
        throw m6159("parseLong error, field : value " + list);
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏子世兰哲, reason: contains not printable characters */
    public long mo6239() {
        return mo6244();
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏子世哲兰, reason: contains not printable characters */
    public final String m6240() {
        char c = this.f9193;
        if (c != '+' && c != '-') {
            if (c == '[') {
                List listMo6125 = mo6125();
                if (listMo6125.size() == 1) {
                    Object obj = listMo6125.get(0);
                    if (obj == null) {
                        return null;
                    }
                    if ((this.f9201.f9320 & JSONReader$Feature.DisableStringArrayUnwrapping.mask) == 0 && (obj instanceof String)) {
                        return obj.toString();
                    }
                }
                AbstractC2897 abstractC2897M6057 = AbstractC2897.m6057();
                abstractC2897M6057.m6085(listMo6125);
                abstractC2897M6057.mo5998(listMo6125);
                return abstractC2897M6057.toString();
            }
            if (c != 'f') {
                if (c == 'n') {
                    mo6202();
                    return null;
                }
                if (c != 't') {
                    if (c == '{') {
                        Map mapMo6194 = mo6194();
                        AbstractC2897 abstractC2897M60572 = AbstractC2897.m6057();
                        abstractC2897M60572.m6085(mapMo6194);
                        abstractC2897M60572.mo5996(mapMo6194);
                        return abstractC2897M60572.toString();
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
                            C0276.m850(mo6170("illegal input : " + this.f9193));
                            return null;
                    }
                }
            }
            boolean zMo6108 = mo6108();
            this.f9186 = zMo6108;
            return zMo6108 ? "true" : "false";
        }
        mo6195();
        return m6103().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰世哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.time.ZonedDateTime mo6241() {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.AbstractC2899.mo6241():java.time.ZonedDateTime");
    }

    /* JADX INFO: renamed from: 飘花落叶言楪苏子兰哲世, reason: contains not printable characters */
    public abstract ZonedDateTime mo6242(int i);

    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲世兰, reason: contains not printable characters */
    public abstract UUID mo6243();

    /* JADX INFO: renamed from: 飘花落叶言楪苏子哲兰世, reason: contains not printable characters */
    public abstract long mo6244();
}
