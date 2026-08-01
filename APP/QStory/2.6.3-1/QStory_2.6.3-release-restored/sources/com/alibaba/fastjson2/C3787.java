package com.alibaba.fastjson2;

import androidx.activity.AbstractC0900;
import androidx.collection.C1123;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.pool.TypePool;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public AbstractC3785 f9691;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public AbstractC3785 f9692;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f9693;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f9694;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final AbstractC3732 f9695;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f9696;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public int f9697;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public ArrayList f9698;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f9699;

    public C3787(String str) {
        this.f9696 = str;
        AbstractC3732 abstractC3732M6652 = AbstractC3732.m6652(str, AbstractC3755.f9606);
        this.f9695 = abstractC3732M6652;
        if ((abstractC3732M6652.f9538 != 'l' || !abstractC3732M6652.mo6695()) && abstractC3732M6652.f9538 == 's') {
            abstractC3732M6652.mo6697(Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL, 'i', 'c', Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL);
        }
        if (abstractC3732M6652.f9538 == '-') {
            abstractC3732M6652.mo6733();
            this.f9699 = true;
        }
        if (abstractC3732M6652.f9538 == '$') {
            abstractC3732M6652.mo6733();
            this.f9694 = true;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC3785 m6976() {
        Object objMo6744;
        AbstractC3732 abstractC3732 = this.f9695;
        if (abstractC3732.mo6704('@')) {
            if (abstractC3732.mo6704(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)) {
                objMo6744 = abstractC3732.mo6738() ? abstractC3732.mo6752() : abstractC3732.m6676();
            } else if (abstractC3732.mo6701()) {
                if (abstractC3732.mo6738()) {
                    objMo6744 = abstractC3732.mo6752();
                } else {
                    if (!abstractC3732.mo6739()) {
                        C1123.m1410(abstractC3732.mo6730("jsonpath syntax error"));
                        return null;
                    }
                    objMo6744 = abstractC3732.mo6744();
                }
                if (!abstractC3732.mo6702()) {
                    C1123.m1410(abstractC3732.mo6730("jsonpath syntax error"));
                    return null;
                }
            } else {
                objMo6744 = null;
            }
            if (objMo6744 instanceof String) {
                String str = (String) objMo6744;
                return new C3780(str, AbstractC3693.m6334(str));
            }
            if (objMo6744 instanceof Integer) {
                return new C3781(((Integer) objMo6744).intValue());
            }
        }
        C1123.m1410(abstractC3732.mo6730("jsonpath syntax error"));
        return null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final AbstractC3785 m6977() {
        AbstractC3785 c3705;
        int length;
        AbstractC3732 abstractC3732 = this.f9695;
        char c = abstractC3732.f9538;
        if (c == '*') {
            abstractC3732.mo6733();
            return C3786.f9689;
        }
        if (c == '.') {
            abstractC3732.mo6733();
            if (abstractC3732.f9538 != '*') {
                return new C3788(abstractC3732.mo6664(), abstractC3732.mo6688());
            }
            abstractC3732.mo6733();
            return new C3788(Marker.ANY_MARKER, AbstractC3693.m6334(Marker.ANY_MARKER));
        }
        boolean zMo6738 = abstractC3732.mo6738();
        long jMo6688 = abstractC3732.mo6688();
        String strMo6664 = abstractC3732.mo6664();
        byte b = 9;
        int i = 0;
        if (zMo6738 && (length = strMo6664.length()) <= 9) {
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = strMo6664.charAt(i2);
                if (cCharAt < '0' || cCharAt > '9') {
                    break;
                }
            }
        }
        if (abstractC3732.f9538 != '(') {
            return new C3780(strMo6664, jMo6688);
        }
        abstractC3732.mo6733();
        strMo6664.getClass();
        int i3 = 1;
        switch (strMo6664.hashCode()) {
            case -2093674864:
                b = strMo6664.equals("entrySet") ? (byte) 0 : (byte) -1;
                break;
            case -1325958191:
                b = strMo6664.equals("double") ? (byte) 1 : (byte) -1;
                break;
            case -1106363674:
                b = strMo6664.equals("length") ? (byte) 2 : (byte) -1;
                break;
            case -823812830:
                b = strMo6664.equals("values") ? (byte) 3 : (byte) -1;
                break;
            case 96370:
                b = strMo6664.equals("abs") ? (byte) 4 : (byte) -1;
                break;
            case 107876:
                b = strMo6664.equals("max") ? (byte) 5 : (byte) -1;
                break;
            case 108114:
                b = strMo6664.equals("min") ? (byte) 6 : (byte) -1;
                break;
            case 114251:
                b = strMo6664.equals("sum") ? (byte) 7 : (byte) -1;
                break;
            case 3049733:
                b = strMo6664.equals("ceil") ? (byte) 8 : (byte) -1;
                break;
            case 3288564:
                if (!strMo6664.equals("keys")) {
                    b = -1;
                }
                break;
            case 3314326:
                b = strMo6664.equals("last") ? (byte) 10 : (byte) -1;
                break;
            case 3530753:
                b = strMo6664.equals("size") ? (byte) 11 : (byte) -1;
                break;
            case 3568674:
                b = strMo6664.equals("trim") ? (byte) 12 : (byte) -1;
                break;
            case 3575610:
                b = strMo6664.equals("type") ? (byte) 13 : (byte) -1;
                break;
            case 97440432:
                b = strMo6664.equals("first") ? (byte) 14 : (byte) -1;
                break;
            case 97526796:
                b = strMo6664.equals("floor") ? (byte) 15 : (byte) -1;
                break;
            case 100346066:
                b = strMo6664.equals("index") ? (byte) 16 : (byte) -1;
                break;
            case 103164673:
                b = strMo6664.equals("lower") ? (byte) 17 : (byte) -1;
                break;
            case 111499426:
                b = strMo6664.equals("upper") ? (byte) 18 : (byte) -1;
                break;
            case 660387005:
                b = strMo6664.equals("ceiling") ? (byte) 19 : (byte) -1;
                break;
            case 921111605:
                b = strMo6664.equals("negative") ? (byte) 20 : (byte) -1;
                break;
            default:
                b = -1;
                break;
        }
        String str = this.f9696;
        switch (b) {
            case 0:
                c3705 = C3789.f9708;
                break;
            case 1:
                c3705 = C3705.f9425;
                break;
            case 2:
            case 11:
                c3705 = C3789.f9706;
                break;
            case 3:
                c3705 = C3789.f9709;
                break;
            case 4:
                c3705 = C3705.f9422;
                break;
            case 5:
                c3705 = C3789.f9705;
                break;
            case 6:
                c3705 = C3789.f9704;
                break;
            case 7:
                c3705 = C3789.f9710;
                break;
            case 8:
            case 19:
                c3705 = C3705.f9423;
                break;
            case 9:
                c3705 = C3789.f9707;
                break;
            case 10:
                c3705 = C3705.f9427;
                break;
            case 12:
                c3705 = C3705.f9430;
                break;
            case 13:
                c3705 = C3705.f9426;
                break;
            case 14:
                c3705 = C3705.f9431;
                break;
            case 15:
                c3705 = C3705.f9424;
                break;
            case 16:
                if (!abstractC3732.mo6738()) {
                    if (abstractC3732.mo6739()) {
                        c3705 = new C3705(new C3708(abstractC3732.mo6744(), i3));
                        break;
                    }
                    C1123.m1410(AbstractC0900.m717("not support syntax, path : ", str));
                    return null;
                }
                Number numberMo6752 = abstractC3732.mo6752();
                boolean z = numberMo6752 instanceof BigDecimal;
                Number numberValueOf = numberMo6752;
                if (z) {
                    BigDecimal bigDecimal = (BigDecimal) numberMo6752;
                    BigDecimal bigDecimal2 = bigDecimal.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimal.stripTrailingZeros();
                    if (bigDecimal2.scale() != 0) {
                        c3705 = new C3705(new C3708(bigDecimal2, i));
                    } else {
                        BigInteger bigIntegerUnscaledValue = bigDecimal2.unscaledValue();
                        int iCompareTo = bigIntegerUnscaledValue.compareTo(AbstractC3700.f9380);
                        numberValueOf = bigIntegerUnscaledValue;
                        if (iCompareTo >= 0) {
                            int iCompareTo2 = bigIntegerUnscaledValue.compareTo(AbstractC3700.f9379);
                            numberValueOf = bigIntegerUnscaledValue;
                            if (iCompareTo2 <= 0) {
                                numberValueOf = Long.valueOf(bigIntegerUnscaledValue.longValue());
                            }
                        }
                    }
                    break;
                }
                if ((numberValueOf instanceof Integer) || (numberValueOf instanceof Long)) {
                    c3705 = new C3705(new C3704(numberValueOf.longValue()));
                    break;
                }
                C1123.m1410(AbstractC0900.m717("not support syntax, path : ", str));
                return null;
            case 17:
                c3705 = C3705.f9432;
                break;
            case 18:
                c3705 = C3705.f9433;
                break;
            case 20:
                c3705 = C3705.f9429;
                break;
            default:
                C1123.m1410(AbstractC0900.m717("not support syntax, path : ", str));
                return null;
        }
        if (abstractC3732.mo6704(')')) {
            return c3705;
        }
        C1123.m1410(AbstractC0900.m717("not support syntax, path : ", str));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C3717 m6978(AbstractC3785 abstractC3785) {
        String strM6676;
        AbstractC3732 abstractC3732 = this.f9695;
        char c = abstractC3732.f9538;
        boolean z = true;
        if (c == '&') {
            abstractC3732.mo6733();
            if (!abstractC3732.mo6704('&')) {
                C1123.m1410(abstractC3732.mo6730("jsonpath syntax error"));
                return null;
            }
        } else if (c == 'A') {
            strM6676 = abstractC3732.m6676();
            if (!"and".equalsIgnoreCase(strM6676)) {
                C1123.m1410("syntax error : ".concat(strM6676));
                return null;
            }
        } else if (c == 'O') {
            String strM66762 = abstractC3732.m6676();
            if (!"or".equalsIgnoreCase(strM66762)) {
                C1123.m1410("syntax error : ".concat(strM66762));
                return null;
            }
            z = false;
        } else {
            if (c != 'a') {
                if (c != 'o') {
                    if (c != '|') {
                        C1123.m1402(abstractC3732.f9538, "TODO : ");
                        return null;
                    }
                    abstractC3732.mo6733();
                    if (!abstractC3732.mo6704('|')) {
                        C1123.m1410(abstractC3732.mo6730("jsonpath syntax error"));
                        return null;
                    }
                }
                z = false;
            }
            strM6676 = abstractC3732.m6676();
            if (!"and".equalsIgnoreCase(strM6676)) {
            }
        }
        AbstractC3785 abstractC3785M6979 = m6979();
        if (abstractC3785 instanceof C3717) {
            C3717 c3717 = (C3717) abstractC3785;
            ArrayList arrayList = c3717.f9463;
            AbstractC3711 abstractC3711 = (AbstractC3711) abstractC3785M6979;
            abstractC3711.f9446 = z;
            arrayList.add(abstractC3711);
            return c3717;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((AbstractC3711) abstractC3785);
        if (abstractC3785M6979 instanceof C3717) {
            ArrayList arrayList3 = ((C3717) abstractC3785M6979).f9463;
            if (arrayList3.size() > 0) {
                for (int i = 0; i < arrayList3.size(); i++) {
                    AbstractC3711 abstractC37112 = (AbstractC3711) arrayList3.get(i);
                    if (i == 0) {
                        abstractC37112.f9446 = z;
                    }
                    arrayList2.add(abstractC37112);
                }
            }
        } else {
            AbstractC3711 abstractC37113 = (AbstractC3711) abstractC3785M6979;
            abstractC37113.f9446 = z;
            arrayList2.add(abstractC37113);
        }
        return new C3717(arrayList2);
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
    */
    public final AbstractC3785 m6979() {
        String str;
        C3722 c3722;
        int i;
        ?? Mo6664;
        long jMo6688;
        Object objMo6664;
        Object c3703;
        Object objM6937;
        ?? r6;
        int i2;
        String strMo6746;
        boolean zMo6704;
        AbstractC3785 c3723;
        C3720 c3720;
        boolean z;
        ?? r29;
        ?? r30;
        ?? r31;
        String str2;
        String[] strArr;
        AbstractC3785 c3719;
        JSONPathFilter$Operator jSONPathFilter$Operator;
        AbstractC3785 abstractC3785M6978;
        char c;
        ?? r2;
        ?? r62;
        char c2;
        JSONPathFilter$Operator jSONPathFilter$OperatorM6937;
        AbstractC3785 c3718;
        int i3;
        AbstractC3732 abstractC3732 = this.f9695;
        boolean zMo67042 = abstractC3732.mo6704('(');
        if (zMo67042 && (i3 = this.f9697) > 0) {
            this.f9697 = i3 + 1;
        }
        boolean z2 = abstractC3732.f9538 == '@';
        if (z2) {
            abstractC3732.mo6733();
            str = "jsonpath syntax error";
            c3722 = null;
        } else {
            str = "jsonpath syntax error";
            c3722 = null;
            if (abstractC3732.mo6697('e', 'x', 'i', Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL)) {
                if (!abstractC3732.mo6704('(')) {
                    C1123.m1410(abstractC3732.mo6730("exists"));
                    return null;
                }
                if (abstractC3732.mo6704('@') && abstractC3732.mo6704(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)) {
                    abstractC3732.mo6688();
                    String strMo6664 = abstractC3732.mo6664();
                    if (abstractC3732.mo6704(')')) {
                        if (!zMo67042 || abstractC3732.mo6704(')')) {
                            return new C3714(strMo6664);
                        }
                        C1123.m1410(abstractC3732.mo6730(str));
                        return null;
                    }
                    if (abstractC3732.f9538 == '.') {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(strMo6664);
                        do {
                            abstractC3732.mo6733();
                            arrayList.add(abstractC3732.m6676());
                        } while (abstractC3732.f9538 == '.');
                        if (!abstractC3732.mo6704(')') || !zMo67042 || abstractC3732.mo6704(')')) {
                            return new C3714(arrayList);
                        }
                        C1123.m1410(abstractC3732.mo6730(str));
                        return null;
                    }
                }
                C1123.m1410(abstractC3732.mo6730(str));
                return null;
            }
        }
        boolean zMo6697 = this.f9695.mo6697(Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, 'a', Advice.OffsetMapping.ForOrigin.Renderer.ForReturnTypeName.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL);
        boolean z3 = !zMo6697 && abstractC3732.mo6694('e', 'n', Advice.OffsetMapping.ForOrigin.Renderer.ForDescriptor.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL);
        if (z2 && (zMo6697 || z3)) {
            i = 2;
        } else {
            char c3 = abstractC3732.f9538;
            i = 2;
            if (c3 == '.' || c3 == '[' || c3 == '=' || c3 == '<' || c3 == '>' || c3 == '!' || AbstractC3732.m6656(c3)) {
                long j = 0;
                if (z2) {
                    char c4 = abstractC3732.f9538;
                    if (c4 == '[') {
                        AbstractC3785 abstractC3785M6980 = m6980();
                        if (!(abstractC3785M6980 instanceof C3780)) {
                            JSONPathFilter$Operator jSONPathFilter$OperatorM69372 = AbstractC3755.m6937(abstractC3732);
                            if (abstractC3732.f9538 == '@') {
                                AbstractC3785 abstractC3785M6976 = m6976();
                                if (zMo67042) {
                                    abstractC3732.mo6704(')');
                                }
                                return new C3709(abstractC3785M6980, jSONPathFilter$OperatorM69372, abstractC3785M6976);
                            }
                            Object objMo6684 = abstractC3732.mo6684();
                            if (zMo67042) {
                                abstractC3732.mo6704(')');
                            }
                            return abstractC3785M6980 instanceof C3769 ? new C3710((C3769) abstractC3785M6980, jSONPathFilter$OperatorM69372, objMo6684) : new C3712(abstractC3785M6980, jSONPathFilter$OperatorM69372, objMo6684);
                        }
                        C3780 c3780 = (C3780) abstractC3785M6980;
                        String str3 = c3780.f9676;
                        jMo6688 = c3780.f9675;
                        Mo6664 = str3;
                    } else if (c4 == '=' || c4 == '<' || c4 == '>' || c4 == '!') {
                        JSONPathFilter$Operator jSONPathFilter$OperatorM69373 = AbstractC3755.m6937(abstractC3732);
                        char c5 = abstractC3732.f9538;
                        C3784 c3784 = C3784.f9687;
                        if (c5 == '@') {
                            AbstractC3785 abstractC3785M69762 = m6976();
                            if (zMo67042) {
                                abstractC3732.mo6704(')');
                            }
                            return new C3709(c3784, jSONPathFilter$OperatorM69373, abstractC3785M69762);
                        }
                        AbstractC3785 c3712 = new C3712(c3784, jSONPathFilter$OperatorM69373, abstractC3732.mo6684());
                        if (!zMo67042) {
                            return c3712;
                        }
                        while (true) {
                            char c6 = abstractC3732.f9538;
                            if (c6 != '&' && c6 != '|' && c6 != 'a' && c6 != 'o') {
                                abstractC3732.mo6704(')');
                                return c3712;
                            }
                            this.f9697--;
                            c3712 = m6978(c3712);
                        }
                    } else {
                        abstractC3732.mo6733();
                        Mo6664 = c3722;
                        jMo6688 = 0;
                    }
                } else {
                    Mo6664 = c3722;
                    jMo6688 = 0;
                }
                if (Mo6664 == 0) {
                    jMo6688 = abstractC3732.mo6688();
                    Mo6664 = abstractC3732.mo6664();
                }
                if (zMo67042 && abstractC3732.mo6704(')')) {
                    int i4 = this.f9697;
                    if (i4 > 0) {
                        this.f9697 = i4 - 1;
                    }
                    return new C3714((String) Mo6664);
                }
                ?? CopyOf = c3722;
                ?? r7 = CopyOf;
                while (true) {
                    if (abstractC3732.f9538 != '.') {
                        objMo6664 = c3722;
                        break;
                    }
                    abstractC3732.mo6733();
                    long jMo66882 = abstractC3732.mo6688();
                    objMo6664 = abstractC3732.mo6664();
                    if (abstractC3732.f9538 == '(') {
                        break;
                    }
                    if (CopyOf == 0) {
                        CopyOf = new long[]{jMo66882};
                        r7 = new String[]{objMo6664};
                    } else {
                        CopyOf = Arrays.copyOf((long[]) CopyOf, CopyOf.length + 1);
                        CopyOf[CopyOf.length - 1] = jMo66882;
                        r7 = (String[]) Arrays.copyOf((Object[]) r7, r7.length + 1);
                        r7[r7.length - 1] = objMo6664;
                    }
                }
                if (r7 == 0 && !zMo67042 && ((c2 = abstractC3732.f9538) == ']' || c2 == '|' || c2 == '&')) {
                    return new C3714((String) Mo6664);
                }
                if (abstractC3732.f9538 == '(') {
                    if (objMo6664 == null) {
                        r2 = c3722;
                        r62 = Mo6664;
                    } else {
                        r2 = Mo6664;
                        r62 = objMo6664;
                    }
                    r62.getClass();
                    switch (r62) {
                        case "contains":
                            objM6937 = JSONPathFilter$Operator.CONTAINS;
                            c3703 = c3722;
                            if (c3703 != null) {
                                abstractC3732.mo6733();
                                if (!abstractC3732.mo6704(')')) {
                                    C1123.m1410("syntax error, function ".concat(r62));
                                    return c3722;
                                }
                            }
                            r6 = r2;
                            break;
                        case "size":
                            c3703 = C3706.f9435;
                            objM6937 = c3722;
                            if (c3703 != null) {
                            }
                            r6 = r2;
                            break;
                        case "type":
                            c3703 = C3706.f9436;
                            objM6937 = c3722;
                            if (c3703 != null) {
                            }
                            r6 = r2;
                            break;
                        default:
                            C1123.m1410(AbstractC0900.m717("syntax error, function not support ", r2));
                            return c3722;
                    }
                } else {
                    j = jMo6688;
                    c3703 = c3722;
                    objM6937 = c3703;
                    r6 = Mo6664;
                }
                if (c3703 == null && abstractC3732.f9538 == '[') {
                    i2 = -1;
                    abstractC3732.mo6733();
                    if (abstractC3732.f9538 == '?') {
                        abstractC3732.mo6733();
                        c3703 = new C3706(2);
                    } else {
                        c3703 = new C3703(abstractC3732.mo6772());
                    }
                    if (!abstractC3732.mo6704(']')) {
                        C1123.m1410("syntax error");
                        return c3722;
                    }
                } else {
                    i2 = -1;
                }
                ?? r312 = c3703;
                if (objM6937 == null) {
                    if (zMo67042 && abstractC3732.mo6704(')')) {
                        return new C3714((String) r6);
                    }
                    objM6937 = AbstractC3755.m6937(abstractC3732);
                }
                ?? r32 = objM6937;
                switch (AbstractC3702.f9418[r32.ordinal()]) {
                    case 3:
                    case 4:
                    case 5:
                        long j2 = j;
                        ?? r26 = r6;
                        if (abstractC3732.mo6739()) {
                            strMo6746 = abstractC3732.mo6744();
                            zMo6704 = false;
                        } else {
                            strMo6746 = abstractC3732.mo6746();
                            zMo6704 = abstractC3732.mo6704('i');
                        }
                        AbstractC3785 c37232 = new C3723(r26, j2, zMo6704 ? Pattern.compile(strMo6746, 2) : Pattern.compile(strMo6746), r32 == JSONPathFilter$Operator.NOT_RLIKE, 1);
                        char c7 = abstractC3732.f9538;
                        if (c7 == '&' || c7 == '|' || c7 == 'a' || c7 == 'o') {
                            this.f9697--;
                            c37232 = m6978(c37232);
                        }
                        if (abstractC3732.mo6704(')')) {
                            return c37232;
                        }
                        C1123.m1410(abstractC3732.mo6730(str));
                        return c3722;
                    case 6:
                    case 7:
                        ?? r302 = CopyOf;
                        ?? r292 = r7;
                        long j3 = j;
                        ?? r262 = r6;
                        if (abstractC3732.f9538 != '(') {
                            C1123.m1410(abstractC3732.mo6730(str));
                            return c3722;
                        }
                        abstractC3732.mo6733();
                        if (abstractC3732.mo6739()) {
                            ArrayList arrayList2 = new ArrayList();
                            while (abstractC3732.mo6739()) {
                                arrayList2.add(abstractC3732.mo6744());
                            }
                            ?? r9 = new String[arrayList2.size()];
                            arrayList2.toArray((Object[]) r9);
                            c3723 = new C3723(r262, j3, r9, r32 == JSONPathFilter$Operator.NOT_IN, 2);
                        } else {
                            if (!abstractC3732.mo6738()) {
                                C1123.m1410(abstractC3732.mo6730(str));
                                return c3722;
                            }
                            ArrayList arrayList3 = new ArrayList();
                            while (abstractC3732.mo6738()) {
                                arrayList3.add(abstractC3732.mo6752());
                            }
                            long[] jArr = new long[arrayList3.size()];
                            for (int i5 = 0; i5 < arrayList3.size(); i5++) {
                                jArr[i5] = ((Number) arrayList3.get(i5)).longValue();
                            }
                            c3723 = new C3723(r262, j3, r292, r302, r312, jArr, r32 == JSONPathFilter$Operator.NOT_IN);
                        }
                        if (!abstractC3732.mo6704(')')) {
                            C1123.m1410(abstractC3732.mo6730(str));
                            return c3722;
                        }
                        char c8 = abstractC3732.f9538;
                        if (c8 == '&' || c8 == '|' || c8 == 'a' || c8 == 'o') {
                            this.f9697--;
                            c3723 = m6978(c3723);
                        }
                        if (abstractC3732.mo6704(')')) {
                            return c3723;
                        }
                        C1123.m1410(abstractC3732.mo6730(str));
                        return c3722;
                    case 8:
                        ?? r303 = CopyOf;
                        ?? r293 = r7;
                        long j4 = j;
                        ?? r263 = r6;
                        if (abstractC3732.f9538 != '(') {
                            C1123.m1410(abstractC3732.mo6730(str));
                            return c3722;
                        }
                        abstractC3732.mo6733();
                        if (abstractC3732.mo6739()) {
                            ArrayList arrayList4 = new ArrayList();
                            while (abstractC3732.mo6739()) {
                                arrayList4.add(abstractC3732.mo6744());
                            }
                            String[] strArr2 = new String[arrayList4.size()];
                            arrayList4.toArray(strArr2);
                            c3720 = new C3720(r263, j4, r293, r303, strArr2, 1);
                        } else {
                            if (!abstractC3732.mo6738()) {
                                C1123.m1410(abstractC3732.mo6730(str));
                                return c3722;
                            }
                            ArrayList arrayList5 = new ArrayList();
                            while (abstractC3732.mo6738()) {
                                arrayList5.add(abstractC3732.mo6752());
                            }
                            long[] jArr2 = new long[arrayList5.size()];
                            for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                                jArr2[i6] = ((Number) arrayList5.get(i6)).longValue();
                            }
                            c3720 = new C3720(r263, j4, r293, r303, jArr2, 0);
                        }
                        if (!abstractC3732.mo6704(')')) {
                            C1123.m1410(abstractC3732.mo6730(str));
                            return c3722;
                        }
                        if (abstractC3732.mo6704(')')) {
                            return c3720;
                        }
                        C1123.m1410(abstractC3732.mo6730(str));
                        return c3722;
                    case 9:
                    case 10:
                        long j5 = j;
                        ?? r264 = r6;
                        if (!abstractC3732.mo6738()) {
                            C1123.m1410(abstractC3732.mo6730(str));
                            return c3722;
                        }
                        Number numberMo6752 = abstractC3732.mo6752();
                        String strM6676 = abstractC3732.m6676();
                        if (!"and".equalsIgnoreCase(strM6676)) {
                            C1123.m1410("syntax error, ".concat(strM6676));
                            return c3722;
                        }
                        C3724 c3724 = new C3724(r264, j5, numberMo6752.longValue(), abstractC3732.mo6752().longValue(), r32 == JSONPathFilter$Operator.NOT_BETWEEN);
                        if (!zMo67042 || abstractC3732.mo6704(')')) {
                            return c3724;
                        }
                        C1123.m1410(abstractC3732.mo6730(str));
                        return c3722;
                    default:
                        char c9 = abstractC3732.f9538;
                        if (c9 != '\"' && c9 != '\'') {
                            if (c9 == '+' || c9 == '-') {
                                ?? r304 = CopyOf;
                                ?? r294 = r7;
                                long j6 = j;
                                Number numberMo67522 = abstractC3732.mo6752();
                                if ((numberMo67522 instanceof Integer) || (numberMo67522 instanceof Long)) {
                                    c3719 = new C3722(r6, j6, r294, r304, r312, r32, numberMo67522.longValue());
                                } else if (numberMo67522 instanceof BigDecimal) {
                                    c3719 = new C3716(r6, j6, r32, (BigDecimal) numberMo67522);
                                } else {
                                    ?? r265 = r6;
                                    if (!(numberMo67522 instanceof Float) && !(numberMo67522 instanceof Double)) {
                                        C1123.m1410(abstractC3732.mo6730(str));
                                        return c3722;
                                    }
                                    c3719 = new C3715(r265, j6, r32, Double.valueOf(numberMo67522.doubleValue()));
                                }
                            } else if (c9 == '@') {
                                long j7 = j;
                                abstractC3732.mo6733();
                                if (!abstractC3732.mo6704(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)) {
                                    C1123.m1410(abstractC3732.mo6730(str));
                                    return c3722;
                                }
                                String strM66762 = abstractC3732.m6676();
                                AbstractC3693.m6334(strM66762);
                                abstractC3785M6978 = new C3718(r6, strM66762, j7);
                            } else if (c9 == '[') {
                                c3719 = new C3716(r6, j, r7, CopyOf, r312, r32, (JSONArray) abstractC3732.mo6700(JSONArray.class), 0);
                            } else if (c9 == 'f') {
                                ?? r305 = CopyOf;
                                ?? r295 = r7;
                                long j8 = j;
                                ?? r266 = r6;
                                if ("false".equalsIgnoreCase(abstractC3732.m6676())) {
                                    c3719 = new C3722(r266, j8, r295, r305, r312, r32, 0L);
                                }
                                abstractC3785M6978 = c3722;
                            } else if (c9 == 'n') {
                                ?? r306 = CopyOf;
                                ?? r296 = r7;
                                long j9 = j;
                                ?? r267 = r6;
                                if (!abstractC3732.mo6693()) {
                                    C1123.m1410(abstractC3732.mo6730(str));
                                    return c3722;
                                }
                                c3719 = new C3721(r267, j9, r296, r306, r312);
                            } else if (c9 == 't') {
                                ?? r307 = CopyOf;
                                ?? r297 = r7;
                                long j10 = j;
                                ?? r268 = r6;
                                if ("true".equalsIgnoreCase(abstractC3732.m6676())) {
                                    c3719 = new C3722(r268, j10, r297, r307, r312, r32, 1L);
                                }
                                abstractC3785M6978 = c3722;
                            } else if (c9 != '{') {
                                switch (c9) {
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
                                        C1123.m1410(abstractC3732.mo6730(str));
                                        return c3722;
                                }
                            } else {
                                c3719 = new C3716(r6, j, r7, CopyOf, r312, r32, (JSONObject) abstractC3732.mo6700(JSONObject.class), 2);
                            }
                            c = abstractC3732.f9538;
                            if (c == '&') {
                                this.f9697--;
                                abstractC3785M6978 = m6978(abstractC3785M6978);
                            }
                            if (zMo67042) {
                            }
                            return abstractC3785M6978;
                        }
                        ?? r308 = CopyOf;
                        ?? r298 = r7;
                        long j11 = j;
                        ?? r11 = r32;
                        ?? r269 = r6;
                        String strMo6744 = abstractC3732.mo6744();
                        int iIndexOf = strMo6744.indexOf(37);
                        ?? r112 = r11;
                        if (iIndexOf == i2) {
                            if (r11 == JSONPathFilter$Operator.LIKE) {
                                jSONPathFilter$Operator = JSONPathFilter$Operator.EQ;
                            } else {
                                r112 = r11;
                                if (r11 == JSONPathFilter$Operator.NOT_LIKE) {
                                    jSONPathFilter$Operator = JSONPathFilter$Operator.NE;
                                }
                            }
                            r112 = jSONPathFilter$Operator;
                        }
                        if (r112 == JSONPathFilter$Operator.LIKE || r112 == JSONPathFilter$Operator.NOT_LIKE) {
                            String[] strArrSplit = strMo6744.split("%");
                            if (iIndexOf != 0) {
                                z = false;
                                if (strMo6744.charAt(strMo6744.length() - 1) == '%') {
                                    if (strArrSplit.length == 1) {
                                        str2 = strArrSplit[0];
                                    } else {
                                        strArr = strArrSplit;
                                        C3722 c37222 = c3722;
                                        r30 = c37222;
                                        r29 = c37222;
                                        r31 = strArr;
                                        c3719 = new C3719(r269, j11, r29, r30, r31, r112 == JSONPathFilter$Operator.NOT_LIKE ? true : z);
                                    }
                                } else if (strArrSplit.length == 1) {
                                    str2 = strArrSplit[0];
                                } else {
                                    if (strArrSplit.length == 2) {
                                        r29 = strArrSplit[0];
                                        r30 = strArrSplit[1];
                                        r31 = c3722;
                                    } else {
                                        String str4 = strArrSplit[0];
                                        String str5 = strArrSplit[strArrSplit.length - 1];
                                        int length = strArrSplit.length - 2;
                                        String[] strArr3 = new String[length];
                                        System.arraycopy(strArrSplit, 1, strArr3, 0, length);
                                        r29 = str4;
                                        r30 = str5;
                                        r31 = strArr3;
                                    }
                                    c3719 = new C3719(r269, j11, r29, r30, r31, r112 == JSONPathFilter$Operator.NOT_LIKE ? true : z);
                                }
                                r29 = str2;
                                C3722 c37223 = c3722;
                                r31 = c37223;
                                r30 = c37223;
                                c3719 = new C3719(r269, j11, r29, r30, r31, r112 == JSONPathFilter$Operator.NOT_LIKE ? true : z);
                            } else if (strMo6744.charAt(strMo6744.length() - 1) == '%') {
                                int length2 = strArrSplit.length - 1;
                                String[] strArr4 = new String[length2];
                                z = false;
                                System.arraycopy(strArrSplit, 1, strArr4, 0, length2);
                                strArr = strArr4;
                                C3722 c372222 = c3722;
                                r30 = c372222;
                                r29 = c372222;
                                r31 = strArr;
                                c3719 = new C3719(r269, j11, r29, r30, r31, r112 == JSONPathFilter$Operator.NOT_LIKE ? true : z);
                            } else {
                                z = false;
                                String str6 = strArrSplit[strArrSplit.length - 1];
                                if (strArrSplit.length > 2) {
                                    int length3 = strArrSplit.length - 2;
                                    String[] strArr5 = new String[length3];
                                    System.arraycopy(strArrSplit, 1, strArr5, 0, length3);
                                    r30 = str6;
                                    r31 = strArr5;
                                    r29 = c3722;
                                } else {
                                    r30 = str6;
                                    C3722 c37224 = c3722;
                                    r31 = c37224;
                                    r29 = c37224;
                                }
                                c3719 = new C3719(r269, j11, r29, r30, r31, r112 == JSONPathFilter$Operator.NOT_LIKE ? true : z);
                            }
                            c = abstractC3732.f9538;
                            if (c == '&' || c == '|' || c == 'a' || c == 'o') {
                                this.f9697--;
                                abstractC3785M6978 = m6978(abstractC3785M6978);
                            }
                            if (zMo67042 || abstractC3732.mo6704(')')) {
                                return abstractC3785M6978;
                            }
                            C1123.m1410(abstractC3732.mo6730(str));
                            return c3722;
                        }
                        c3719 = new C3716(r269, j11, r298, r308, r312, r112, strMo6744, 3);
                        abstractC3785M6978 = c3719;
                        c = abstractC3732.f9538;
                        if (c == '&') {
                        }
                        if (zMo67042) {
                        }
                        return abstractC3785M6978;
                }
            }
        }
        if (abstractC3732.mo6704('(')) {
            this.f9697 += 2;
            return m6979();
        }
        if (!z2) {
            C1123.m1410(abstractC3732.mo6730(str));
            return c3722;
        }
        if (zMo6697 || z3) {
            abstractC3732.mo6688();
            String strMo66642 = abstractC3732.mo6664();
            if (!"with".equalsIgnoreCase(strMo66642)) {
                C1123.m1410(AbstractC0900.m717("not support operator : ", strMo66642));
                return c3722;
            }
            jSONPathFilter$OperatorM6937 = zMo6697 ? JSONPathFilter$Operator.STARTS_WITH : JSONPathFilter$Operator.ENDS_WITH;
        } else {
            jSONPathFilter$OperatorM6937 = AbstractC3755.m6937(abstractC3732);
        }
        JSONPathFilter$Operator jSONPathFilter$Operator2 = jSONPathFilter$OperatorM6937;
        if (abstractC3732.mo6738()) {
            Number numberMo67523 = abstractC3732.mo6752();
            c3718 = ((numberMo67523 instanceof Integer) || (numberMo67523 instanceof Long)) ? new C3722(null, 0L, null, null, null, jSONPathFilter$Operator2, numberMo67523.longValue()) : c3722;
        } else if (abstractC3732.mo6739()) {
            String strMo67442 = abstractC3732.mo6744();
            int i7 = AbstractC3702.f9418[jSONPathFilter$Operator2.ordinal()];
            if (i7 == 1) {
                c3718 = new C3718(strMo67442, i);
            } else {
                if (i7 != i) {
                    C1123.m1410(AbstractC0900.m717("syntax error, ", strMo67442));
                    return c3722;
                }
                c3718 = new C3718(strMo67442, 0);
            }
        } else {
            c3718 = c3722;
        }
        while (true) {
            char c10 = abstractC3732.f9538;
            if (c10 != '&' && c10 != '|') {
                break;
            }
            this.f9697--;
            c3718 = m6978(c3718);
        }
        if (c3718 == null) {
            C1123.m1410(abstractC3732.mo6730(str));
            return c3722;
        }
        if (!zMo67042 || abstractC3732.mo6704(')')) {
            return c3718;
        }
        C1123.m1410(abstractC3732.mo6730(str));
        return c3722;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a1  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC3785 m6980() {
        AbstractC3785 c3771;
        boolean zMo6694;
        AbstractC3732 abstractC3732 = this.f9695;
        abstractC3732.mo6733();
        char c = abstractC3732.f9538;
        if (c == '\"') {
            String strMo6744 = abstractC3732.mo6744();
            if (abstractC3732.f9538 == ']') {
                c3771 = new C3780(strMo6744, AbstractC3693.m6334(strMo6744));
            } else {
                if (!abstractC3732.mo6739()) {
                    C1123.m1402(abstractC3732.f9538, "TODO : ");
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(strMo6744);
                do {
                    arrayList.add(abstractC3732.mo6744());
                } while (abstractC3732.mo6739());
                String[] strArr = new String[arrayList.size()];
                arrayList.toArray(strArr);
                c3771 = new C3771(strArr);
            }
        } else if (c != '*') {
            if (c == '-') {
                int iMo6772 = abstractC3732.mo6772();
                if (abstractC3732.f9538 == ':') {
                    abstractC3732.mo6733();
                    c3771 = abstractC3732.f9538 == ']' ? new C3769(iMo6772, iMo6772 >= 0 ? Integer.MAX_VALUE : 0) : new C3769(iMo6772, abstractC3732.mo6772());
                } else {
                    if (abstractC3732.mo6738()) {
                        zMo6694 = false;
                    } else {
                        zMo6694 = abstractC3732.mo6694('l', 'a', Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL);
                        if (!zMo6694) {
                            c3771 = C3781.m6974(iMo6772);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(Integer.valueOf(iMo6772));
                    if (zMo6694) {
                        arrayList2.add(-1);
                        abstractC3732.mo6705();
                    }
                    while (true) {
                        if (abstractC3732.mo6738()) {
                            arrayList2.add(Integer.valueOf(abstractC3732.mo6772()));
                        } else if (abstractC3732.mo6694('l', 'a', Advice.OffsetMapping.ForOrigin.Renderer.ForJavaSignature.SYMBOL, Advice.OffsetMapping.ForOrigin.Renderer.ForTypeName.SYMBOL)) {
                            arrayList2.add(-1);
                            abstractC3732.mo6705();
                        } else {
                            int[] iArr = new int[arrayList2.size()];
                            while (i < arrayList2.size()) {
                                iArr[i] = ((Integer) arrayList2.get(i)).intValue();
                                i++;
                            }
                            c3771 = new C3772(iArr);
                        }
                    }
                }
            } else if (c == '?') {
                abstractC3732.mo6733();
                c3771 = m6979();
            } else if (c == 'l') {
                String strM6676 = abstractC3732.m6676();
                if (!"last".equals(strM6676)) {
                    C1123.m1410("not support : ".concat(strM6676));
                    return null;
                }
                c3771 = C3781.m6974(-1);
            } else if (c == 'r') {
                String strM66762 = abstractC3732.m6676();
                if (!"randomIndex".equals(strM66762) || !abstractC3732.mo6704('(') || !abstractC3732.mo6704(')') || abstractC3732.f9538 != ']') {
                    C1123.m1410("not support : ".concat(strM66762));
                    return null;
                }
                c3771 = C3770.f9656;
            } else if (c != '\'') {
                if (c != '(') {
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
                        case ':':
                            abstractC3732.mo6733();
                            int iMo67722 = abstractC3732.f9538 == ']' ? 0 : abstractC3732.mo6772();
                            c3771 = iMo67722 <= 0 ? new C3769(Integer.MIN_VALUE, iMo67722) : new C3769(0, iMo67722);
                            break;
                        default:
                            C1123.m1402(abstractC3732.f9538, "TODO : ");
                            return null;
                    }
                } else {
                    abstractC3732.mo6733();
                    boolean zMo6704 = abstractC3732.mo6704('@');
                    String str = this.f9696;
                    if (!zMo6704 || !abstractC3732.mo6704(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH)) {
                        C1123.m1410(AbstractC0900.m717("not support : ", str));
                        return null;
                    }
                    String strM66763 = abstractC3732.m6676();
                    if (!strM66763.equals("length") && !strM66763.equals("size")) {
                        C1123.m1410(AbstractC0900.m717("not support : ", str));
                        return null;
                    }
                    int iMo67723 = abstractC3732.mo6772();
                    if (!abstractC3732.mo6704(')')) {
                        C1123.m1410("not support : ".concat(strM66763));
                        return null;
                    }
                    if (iMo67723 > 0) {
                        C1123.m1410("not support : ".concat(strM66763));
                        return null;
                    }
                    c3771 = C3781.m6974(iMo67723);
                }
            }
        } else {
            abstractC3732.mo6733();
            c3771 = C3786.f9688;
        }
        while (true) {
            char c2 = abstractC3732.f9538;
            if (c2 != '&' && c2 != '|' && c2 != 'a' && c2 != 'o') {
                while (this.f9697 > 0) {
                    abstractC3732.mo6733();
                    this.f9697--;
                }
                if (abstractC3732.mo6702()) {
                    return c3771;
                }
                C1123.m1410(abstractC3732.mo6730("jsonpath syntax error"));
                return null;
            }
            this.f9697--;
            c3771 = m6978(c3771);
        }
    }
}
