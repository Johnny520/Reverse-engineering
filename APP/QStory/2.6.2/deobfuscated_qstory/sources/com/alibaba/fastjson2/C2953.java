package com.alibaba.fastjson2;

import androidx.activity.AbstractC0053;
import androidx.collection.C0276;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.pool.TypePool;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2953 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC2951 f9344;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public AbstractC2951 f9345;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f9346;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f9347;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC2898 f9348;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f9349;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f9350;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ArrayList f9351;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f9352;

    public C2953(String str) {
        this.f9349 = str;
        AbstractC2898 abstractC2898M6047 = AbstractC2898.m6047(str, AbstractC2921.f9259);
        this.f9348 = abstractC2898M6047;
        if ((abstractC2898M6047.f9191 != 'l' || !abstractC2898M6047.mo6089()) && abstractC2898M6047.f9191 == 's') {
            abstractC2898M6047.mo6091(Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL, 'i', 'c', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL);
        }
        if (abstractC2898M6047.f9191 == '-') {
            abstractC2898M6047.mo6127();
            this.f9352 = true;
        }
        if (abstractC2898M6047.f9191 == '$') {
            abstractC2898M6047.mo6127();
            this.f9347 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC2951 m6358() {
        Object objMo6139;
        AbstractC2898 abstractC2898 = this.f9348;
        if (abstractC2898.mo6098('@')) {
            if (abstractC2898.mo6098(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)) {
                objMo6139 = abstractC2898.mo6132() ? abstractC2898.mo6147() : abstractC2898.m6070();
            } else if (abstractC2898.mo6095()) {
                if (abstractC2898.mo6132()) {
                    objMo6139 = abstractC2898.mo6147();
                } else {
                    if (!abstractC2898.mo6133()) {
                        C0276.m849(abstractC2898.mo6124("jsonpath syntax error"));
                        return null;
                    }
                    objMo6139 = abstractC2898.mo6139();
                }
                if (!abstractC2898.mo6096()) {
                    C0276.m849(abstractC2898.mo6124("jsonpath syntax error"));
                    return null;
                }
            } else {
                objMo6139 = null;
            }
            if (objMo6139 instanceof String) {
                String str = (String) objMo6139;
                return new C2946(str, AbstractC2859.m5729(str));
            }
            if (objMo6139 instanceof Integer) {
                return new C2947(((Integer) objMo6139).intValue());
            }
        }
        C0276.m849(abstractC2898.mo6124("jsonpath syntax error"));
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC2951 m6359() {
        AbstractC2951 c2871;
        int length;
        AbstractC2898 abstractC2898 = this.f9348;
        char c = abstractC2898.f9191;
        if (c == '*') {
            abstractC2898.mo6127();
            return C2952.f9342;
        }
        if (c == '.') {
            abstractC2898.mo6127();
            if (abstractC2898.f9191 != '*') {
                return new C2954(abstractC2898.mo6058(), abstractC2898.mo6082());
            }
            abstractC2898.mo6127();
            return new C2954(Marker.ANY_MARKER, AbstractC2859.m5729(Marker.ANY_MARKER));
        }
        boolean zMo6132 = abstractC2898.mo6132();
        long jMo6082 = abstractC2898.mo6082();
        String strMo6058 = abstractC2898.mo6058();
        byte b = 9;
        int i = 0;
        if (zMo6132 && (length = strMo6058.length()) <= 9) {
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = strMo6058.charAt(i2);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
            }
        }
        if (abstractC2898.f9191 != '(') {
            return new C2946(strMo6058, jMo6082);
        }
        abstractC2898.mo6127();
        strMo6058.getClass();
        int i3 = 1;
        switch (strMo6058.hashCode()) {
            case -2093674864:
                b = strMo6058.equals("entrySet") ? (byte) 0 : (byte) -1;
                break;
            case -1325958191:
                b = strMo6058.equals("double") ? (byte) 1 : (byte) -1;
                break;
            case -1106363674:
                b = strMo6058.equals("length") ? (byte) 2 : (byte) -1;
                break;
            case -823812830:
                b = strMo6058.equals("values") ? (byte) 3 : (byte) -1;
                break;
            case 96370:
                b = strMo6058.equals("abs") ? (byte) 4 : (byte) -1;
                break;
            case 107876:
                b = strMo6058.equals("max") ? (byte) 5 : (byte) -1;
                break;
            case 108114:
                b = strMo6058.equals("min") ? (byte) 6 : (byte) -1;
                break;
            case 114251:
                b = strMo6058.equals("sum") ? (byte) 7 : (byte) -1;
                break;
            case 3049733:
                b = strMo6058.equals("ceil") ? (byte) 8 : (byte) -1;
                break;
            case 3288564:
                if (!strMo6058.equals("keys")) {
                    b = -1;
                }
                break;
            case 3314326:
                b = strMo6058.equals("last") ? (byte) 10 : (byte) -1;
                break;
            case 3530753:
                b = strMo6058.equals("size") ? (byte) 11 : (byte) -1;
                break;
            case 3568674:
                b = strMo6058.equals("trim") ? (byte) 12 : (byte) -1;
                break;
            case 3575610:
                b = strMo6058.equals("type") ? (byte) 13 : (byte) -1;
                break;
            case 97440432:
                b = strMo6058.equals("first") ? (byte) 14 : (byte) -1;
                break;
            case 97526796:
                b = strMo6058.equals("floor") ? (byte) 15 : (byte) -1;
                break;
            case 100346066:
                b = strMo6058.equals("index") ? (byte) 16 : (byte) -1;
                break;
            case 103164673:
                b = strMo6058.equals("lower") ? (byte) 17 : (byte) -1;
                break;
            case 111499426:
                b = strMo6058.equals("upper") ? (byte) 18 : (byte) -1;
                break;
            case 660387005:
                b = strMo6058.equals("ceiling") ? (byte) 19 : (byte) -1;
                break;
            case 921111605:
                b = strMo6058.equals("negative") ? (byte) 20 : (byte) -1;
                break;
            default:
                b = -1;
                break;
        }
        String str = this.f9349;
        switch (b) {
            case 0:
                c2871 = C2955.f9361;
                break;
            case 1:
                c2871 = C2871.f9078;
                break;
            case 2:
            case 11:
                c2871 = C2955.f9359;
                break;
            case 3:
                c2871 = C2955.f9362;
                break;
            case 4:
                c2871 = C2871.f9075;
                break;
            case 5:
                c2871 = C2955.f9358;
                break;
            case 6:
                c2871 = C2955.f9357;
                break;
            case 7:
                c2871 = C2955.f9363;
                break;
            case 8:
            case 19:
                c2871 = C2871.f9076;
                break;
            case 9:
                c2871 = C2955.f9360;
                break;
            case 10:
                c2871 = C2871.f9080;
                break;
            case 12:
                c2871 = C2871.f9083;
                break;
            case 13:
                c2871 = C2871.f9079;
                break;
            case 14:
                c2871 = C2871.f9084;
                break;
            case 15:
                c2871 = C2871.f9077;
                break;
            case 16:
                if (!abstractC2898.mo6132()) {
                    if (abstractC2898.mo6133()) {
                        c2871 = new C2871(new C2874(abstractC2898.mo6139(), i3));
                        break;
                    }
                    C0276.m849(AbstractC0053.m152("not support syntax, path : ", str));
                    return null;
                }
                Number numberMo6147 = abstractC2898.mo6147();
                boolean z = numberMo6147 instanceof BigDecimal;
                Number numberValueOf = numberMo6147;
                if (z) {
                    BigDecimal bigDecimal = (BigDecimal) numberMo6147;
                    BigDecimal bigDecimal2 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
                    if (bigDecimal2.scale() != 0) {
                        c2871 = new C2871(new C2874(bigDecimal2, i));
                    } else {
                        BigInteger bigIntegerUnscaledValue = bigDecimal2.unscaledValue();
                        int iCompareTo = bigIntegerUnscaledValue.compareTo(AbstractC2866.f9033);
                        numberValueOf = bigIntegerUnscaledValue;
                        if (iCompareTo >= 0) {
                            int iCompareTo2 = bigIntegerUnscaledValue.compareTo(AbstractC2866.f9032);
                            numberValueOf = bigIntegerUnscaledValue;
                            if (iCompareTo2 <= 0) {
                                numberValueOf = Long.valueOf(bigIntegerUnscaledValue.longValue());
                            }
                        }
                    }
                    break;
                }
                if ((numberValueOf instanceof Integer) || (numberValueOf instanceof Long)) {
                    c2871 = new C2871(new C2870(numberValueOf.longValue()));
                    break;
                }
                C0276.m849(AbstractC0053.m152("not support syntax, path : ", str));
                return null;
            case 17:
                c2871 = C2871.f9085;
                break;
            case 18:
                c2871 = C2871.f9086;
                break;
            case 20:
                c2871 = C2871.f9082;
                break;
            default:
                C0276.m849(AbstractC0053.m152("not support syntax, path : ", str));
                return null;
        }
        if (abstractC2898.mo6098(')')) {
            return c2871;
        }
        C0276.m849(AbstractC0053.m152("not support syntax, path : ", str));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.alibaba.fastjson2.C2883 m6360(com.alibaba.fastjson2.AbstractC2951 r9) {
        /*
            r8 = this;
            com.alibaba.fastjson2.飘花落叶言子哲楪世兰苏 r0 = r8.f9348
            char r1 = r0.f9191
            r2 = 0
            java.lang.String r3 = "jsonpath syntax error"
            r4 = 1
            r5 = 0
            r6 = 38
            if (r1 == r6) goto L68
            r6 = 65
            java.lang.String r7 = "syntax error : "
            if (r1 == r6) goto L53
            r6 = 79
            if (r1 == r6) goto L3e
            r6 = 97
            if (r1 == r6) goto L53
            r4 = 111(0x6f, float:1.56E-43)
            if (r1 == r4) goto L3e
            r4 = 124(0x7c, float:1.74E-43)
            if (r1 != r4) goto L36
            r0.mo6127()
            boolean r1 = r0.mo6098(r4)
            if (r1 == 0) goto L2e
        L2c:
            r4 = r5
            goto L71
        L2e:
            java.lang.String r8 = r0.mo6124(r3)
            androidx.collection.C0276.m849(r8)
            return r2
        L36:
            java.lang.String r8 = "TODO : "
            char r9 = r0.f9191
            androidx.collection.C0276.m841(r9, r8)
            return r2
        L3e:
            java.lang.String r0 = r0.m6070()
            java.lang.String r1 = "or"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L4b
            goto L2c
        L4b:
            java.lang.String r8 = r7.concat(r0)
            androidx.collection.C0276.m849(r8)
            return r2
        L53:
            java.lang.String r0 = r0.m6070()
            java.lang.String r1 = "and"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L60
            goto L71
        L60:
            java.lang.String r8 = r7.concat(r0)
            androidx.collection.C0276.m849(r8)
            return r2
        L68:
            r0.mo6127()
            boolean r1 = r0.mo6098(r6)
            if (r1 == 0) goto Lc0
        L71:
            com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世 r8 = r8.m6361()
            boolean r0 = r9 instanceof com.alibaba.fastjson2.C2883
            if (r0 == 0) goto L85
            com.alibaba.fastjson2.飘花落叶言子世楪苏兰哲 r9 = (com.alibaba.fastjson2.C2883) r9
            java.util.ArrayList r0 = r9.f9116
            com.alibaba.fastjson2.飘花落叶言子世哲苏兰楪 r8 = (com.alibaba.fastjson2.AbstractC2877) r8
            r8.f9099 = r4
            r0.add(r8)
            return r9
        L85:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.alibaba.fastjson2.飘花落叶言子世哲苏兰楪 r9 = (com.alibaba.fastjson2.AbstractC2877) r9
            r0.add(r9)
            boolean r9 = r8 instanceof com.alibaba.fastjson2.C2883
            if (r9 == 0) goto Lb3
            com.alibaba.fastjson2.飘花落叶言子世楪苏兰哲 r8 = (com.alibaba.fastjson2.C2883) r8
            java.util.ArrayList r8 = r8.f9116
            int r9 = r8.size()
            if (r9 <= 0) goto Lba
        L9d:
            int r9 = r8.size()
            if (r5 >= r9) goto Lba
            java.lang.Object r9 = r8.get(r5)
            com.alibaba.fastjson2.飘花落叶言子世哲苏兰楪 r9 = (com.alibaba.fastjson2.AbstractC2877) r9
            if (r5 != 0) goto Lad
            r9.f9099 = r4
        Lad:
            r0.add(r9)
            int r5 = r5 + 1
            goto L9d
        Lb3:
            com.alibaba.fastjson2.飘花落叶言子世哲苏兰楪 r8 = (com.alibaba.fastjson2.AbstractC2877) r8
            r8.f9099 = r4
            r0.add(r8)
        Lba:
            com.alibaba.fastjson2.飘花落叶言子世楪苏兰哲 r8 = new com.alibaba.fastjson2.飘花落叶言子世楪苏兰哲
            r8.<init>(r0)
            return r8
        Lc0:
            java.lang.String r8 = r0.mo6124(r3)
            androidx.collection.C0276.m849(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2953.m6360(com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世):com.alibaba.fastjson2.飘花落叶言子世楪苏兰哲");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:374:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0626  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0634  */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r29v12 */
    /* JADX WARN: Type inference failed for: r29v13, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r29v16, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r29v17, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r29v18, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r29v19, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r29v20, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r29v21 */
    /* JADX WARN: Type inference failed for: r29v22 */
    /* JADX WARN: Type inference failed for: r29v5, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r29v6 */
    /* JADX WARN: Type inference failed for: r29v7 */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r29v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Type inference failed for: r30v0, types: [long[]] */
    /* JADX WARN: Type inference failed for: r30v1, types: [long[]] */
    /* JADX WARN: Type inference failed for: r30v10, types: [long[]] */
    /* JADX WARN: Type inference failed for: r30v14, types: [long[]] */
    /* JADX WARN: Type inference failed for: r30v15, types: [long[]] */
    /* JADX WARN: Type inference failed for: r30v16, types: [long[]] */
    /* JADX WARN: Type inference failed for: r30v17, types: [long[]] */
    /* JADX WARN: Type inference failed for: r30v18, types: [long[]] */
    /* JADX WARN: Type inference failed for: r30v19 */
    /* JADX WARN: Type inference failed for: r30v2, types: [long[]] */
    /* JADX WARN: Type inference failed for: r30v3 */
    /* JADX WARN: Type inference failed for: r30v4 */
    /* JADX WARN: Type inference failed for: r30v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r30v7 */
    /* JADX WARN: Type inference failed for: r30v8 */
    /* JADX WARN: Type inference failed for: r30v9 */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.util.function.Function] */
    /* JADX WARN: Type inference failed for: r31v1 */
    /* JADX WARN: Type inference failed for: r31v10 */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v5, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r31v7 */
    /* JADX WARN: Type inference failed for: r31v8 */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.alibaba.fastjson2.JSONPathFilter$Operator, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r32v5, types: [com.alibaba.fastjson2.JSONPathFilter$Operator] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v41, types: [long[]] */
    /* JADX WARN: Type inference failed for: r3v42 */
    /* JADX WARN: Type inference failed for: r3v43, types: [long[]] */
    /* JADX WARN: Type inference failed for: r3v5, types: [long[]] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v31 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.io.Serializable, java.lang.Object[], java.lang.String[]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.alibaba.fastjson2.AbstractC2951 m6361() {
        /*
            Method dump skipped, instruction units count: 2294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2953.m6361():com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世");
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a1  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.alibaba.fastjson2.AbstractC2951 m6362() {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.fastjson2.C2953.m6362():com.alibaba.fastjson2.飘花落叶言子苏哲楪兰世");
    }
}
