package p108ha;

import ac.AbstractC0063p;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import com.alibaba.fastjson2.JSONB;
import gg.AbstractC1416l;
import gg.AbstractC1428x;
import gg.C1406b;
import java.io.ByteArrayOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import ng.C3018p;
import okhttp3.HttpUrl;
import p007a7.AbstractC0018a;
import p025bc.AbstractC0255e;
import p036c9.C0425c2;
import p068eh.AbstractC0921a;
import p088g0.C1271o;
import p099h.Hchat.utils.KavaReflector;
import p136j8.AbstractC2091b;
import p172lg.C2563c;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p218og.C3147k;
import p218og.EnumC3148l;
import p258r8.C3742g;
import p258r8.C3744i;
import p259r9.AbstractC3754e0;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p332wb.AbstractC4855en;
import tf.AbstractC4156d0;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: ha.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1649j0 {

    /* JADX INFO: renamed from: f */
    public static final String[] f5411f = {"h", "m"};

    /* JADX INFO: renamed from: g */
    public static final String[] f5412g = {"i", "n"};

    /* JADX INFO: renamed from: h */
    public static final String[] f5413h = {"j", "m", "o", "n", "p"};

    /* JADX INFO: renamed from: i */
    public static final String[] f5414i = {"r", "u", "q", "t"};

    /* JADX INFO: renamed from: j */
    public static final Set f5415j = AbstractC4156d0.m8355W(1, 2, 3, 4, 5, 9, 10, 12, 13, 14, 15, 18, 19, 26, 28, 30, 34, 36, 41, 42, 47, 54);

    /* JADX INFO: renamed from: k */
    public static final C3147k f5416k;

    /* JADX INFO: renamed from: l */
    public static final C3147k f5417l;

    /* JADX INFO: renamed from: m */
    public static final C3147k f5418m;

    /* JADX INFO: renamed from: n */
    public static final C3147k f5419n;

    /* JADX INFO: renamed from: o */
    public static final C3147k f5420o;

    /* JADX INFO: renamed from: p */
    public static final C3147k f5421p;

    /* JADX INFO: renamed from: a */
    public final C3742g f5422a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f5423b;

    /* JADX INFO: renamed from: c */
    public final SharedPreferences f5424c;

    /* JADX INFO: renamed from: d */
    public final Set f5425d;

    /* JADX INFO: renamed from: e */
    public final ThreadLocal f5426e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        EnumC3148l enumC3148l = EnumC3148l.IGNORE_CASE;
        f5416k = new C3147k("select\\s+\\*,\\s*rowid\\s+from\\s+SnsInfo", AbstractC0063p.m404N(enumC3148l));
        f5417l = new C3147k("\\bWHERE\\b[\\s\\S]*?(?:SnsInfo\\.)?userName\\s*=", AbstractC0063p.m404N(enumC3148l));
        f5418m = new C3147k("\\(\\s*(?:SnsInfo\\.)?sourceType\\s*&\\s*2\\s*!=\\s*0\\s*\\)", AbstractC0063p.m404N(enumC3148l));
        f5419n = new C3147k("\\(\\s*(?:SnsInfo\\.)?sourceType\\s*&\\s*128\\s*!=\\s*0\\s*\\)", AbstractC0063p.m404N(enumC3148l));
        f5420o = new C3147k("\\(\\s*snsId\\s*>=", AbstractC0063p.m404N(enumC3148l));
        f5421p = new C3147k("\\(\\s*((?:SnsInfo\\.)?sourceType)\\s+in\\s*\\(([^)]*)\\)\\s*\\)", AbstractC0063p.m404N(enumC3148l));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1649j0(C3742g c3742g) {
        c3742g.getClass();
        this.f5422a = c3742g;
        Context context = c3742g.f12143a;
        this.f5423b = AbstractC4302b.m8640c(context, "Hchat_sns_anti_recall_config");
        this.f5424c = AbstractC4302b.m8640c(context, "Hchat_sns_anti_recall_method_cache");
        this.f5425d = AbstractC2091b.m5168o();
        this.f5426e = ThreadLocal.withInitial(new C1656p(1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final void m4195a(C1649j0 c1649j0, Object[] objArr) {
        String strM6685f;
        String strM6685f2;
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        for (int i9 = 0; i9 < length; i9++) {
            Object obj = objArr[i9];
            String str = obj instanceof String ? (String) obj : null;
            if (str != null) {
                if (f5416k.m6682a(str)) {
                    if (f5417l.m6682a(str)) {
                        strM6685f = f5419n.m6685f(f5421p.m6684e(str, new C1271o(8)), "(1=1)");
                        if (!AbstractC3149m.m6709h0(strM6685f, "1=1 or snsId", true)) {
                            strM6685f = f5420o.m6685f(strM6685f, "(1=1 or snsId >=");
                        }
                    } else {
                        strM6685f = str;
                    }
                    strM6685f2 = f5418m.m6685f(strM6685f, "(1=1)");
                } else {
                    strM6685f2 = str;
                }
                if (!strM6685f2.equals(str)) {
                    objArr[i9] = strM6685f2;
                    return;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0297  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0159 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0220 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0223 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:247:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093 A[PHI: r0
  0x0093: PHI (r0v24 java.lang.String) = (r0v22 java.lang.String), (r0v23 java.lang.String) binds: [B:48:0x0091, B:51:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m4196b(C1649j0 c1649j0, Object obj, Object[] objArr, boolean z9) {
        ContentValues contentValues;
        String str;
        String str2;
        Integer numM4199i;
        Integer numValueOf;
        int iIntValue;
        Long lM4203n;
        String strM4208x;
        Integer numM4199i2;
        Object c3959f;
        byte[] bArrM4218s;
        byte[] bArr;
        Object objM4217r;
        Object objM4217r2;
        boolean z10;
        Iterator it;
        LinkedHashSet linkedHashSet;
        boolean zWriteField;
        Object next;
        SharedPreferences sharedPreferences = c1649j0.f5423b;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (objArr != null && objArr.length != 0) {
            Object obj2 = objArr[0];
            String str4 = obj2 instanceof String ? (String) obj2 : null;
            if (str4 != null) {
                str3 = str4;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : objArr) {
                    if (obj3 instanceof String) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (AbstractC3156t.m6734X((String) next, "SnsInfo")) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                String str5 = (String) next;
                if (str5 != null) {
                    str3 = str5;
                }
            }
        }
        if (AbstractC3156t.m6734X(str3, "SnsInfo")) {
            if (objArr == null) {
                contentValues = null;
            } else {
                for (Object obj4 : objArr) {
                    contentValues = obj4 instanceof ContentValues ? (ContentValues) obj4 : null;
                    if (contentValues != null) {
                        break;
                    }
                }
                contentValues = null;
            }
            if (contentValues != null) {
                String str6 = " LIMIT 1";
                if (sharedPreferences.getBoolean("sns_comment_anti_recall_enable", false)) {
                    String str7 = "attrBuf";
                    if (contentValues.containsKey("attrBuf")) {
                        String str8 = str7;
                        try {
                            c3959f = contentValues.getAsByteArray(str8);
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        if (c3959f instanceof C3959f) {
                            c3959f = null;
                        }
                        byte[] bArr2 = (byte[]) c3959f;
                        if (bArr2 != null) {
                            if (obj == null || objArr == null) {
                                str = "rowid";
                            } else {
                                Long lM4203n2 = m4203n(contentValues, "snsId", "field_snsId");
                                if (lM4203n2 != null) {
                                    String[] strArr = {"snsId", "field_snsId"};
                                    str = "rowid";
                                    int i9 = 0;
                                    while (i9 < 2) {
                                        String str9 = strArr[i9];
                                        int i10 = i9;
                                        Long l10 = lM4203n2;
                                        bArrM4218s = c1649j0.m4218s(obj, AbstractC0921a.m2251n("SELECT attrBuf FROM SnsInfo WHERE ", str9, "=? LIMIT 1"), new String[]{String.valueOf(lM4203n2.longValue())});
                                        if (bArrM4218s != null || (bArrM4218s = c1649j0.m4218s(obj, AbstractC0921a.m2251n("SELECT field_attrBuf FROM SnsInfo WHERE ", str9, "=? LIMIT 1"), new String[]{String.valueOf(l10.longValue())})) != null) {
                                            break;
                                        }
                                        i9 = i10 + 1;
                                        lM4203n2 = l10;
                                    }
                                } else {
                                    str = "rowid";
                                }
                                Long lM4203n3 = m4203n(contentValues, str);
                                if (lM4203n3 == null || (bArrM4218s = c1649j0.m4218s(obj, "SELECT attrBuf FROM SnsInfo WHERE rowid=? LIMIT 1", new String[]{String.valueOf(lM4203n3.longValue())})) == null) {
                                    String strM4208x2 = m4208x(objArr);
                                    if (AbstractC3149m.m6721t0(strM4208x2)) {
                                        strM4208x2 = null;
                                    }
                                    if (strM4208x2 != null) {
                                        String[] strArrM4206v = m4206v(objArr);
                                        byte[] bArrM4218s2 = c1649j0.m4218s(obj, AbstractC0921a.m2251n("SELECT attrBuf FROM SnsInfo WHERE ", strM4208x2, " LIMIT 1"), strArrM4206v);
                                        bArrM4218s = bArrM4218s2 != null ? bArrM4218s2 : c1649j0.m4218s(obj, AbstractC0921a.m2251n("SELECT field_attrBuf FROM SnsInfo WHERE ", strM4208x2, " LIMIT 1"), strArrM4206v);
                                    }
                                }
                                if (bArrM4218s == null) {
                                    try {
                                        objM4217r = c1649j0.m4217r(bArrM4218s);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str2 = str6;
                                    }
                                    if (objM4217r == null || (objM4217r2 = c1649j0.m4217r(bArr2)) == null) {
                                        str2 = " LIMIT 1";
                                        if (bArr != null) {
                                            contentValues.put(str8, bArr);
                                        }
                                    } else {
                                        Object field = KavaReflector.readField(objM4217r, "CommentUserList");
                                        List linkedList = AbstractC1428x.m3840e(field) ? (List) field : null;
                                        if (linkedList == null) {
                                            linkedList = new LinkedList();
                                        }
                                        Object field2 = KavaReflector.readField(objM4217r2, "CommentUserList");
                                        List linkedList2 = AbstractC1428x.m3840e(field2) ? (List) field2 : null;
                                        if (linkedList2 == null) {
                                            linkedList2 = new LinkedList();
                                        }
                                        if (!linkedList.isEmpty()) {
                                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                            Iterator it3 = linkedList2.iterator();
                                            while (it3.hasNext()) {
                                                linkedHashSet2.add(c1649j0.m4211e(it3.next()));
                                            }
                                            ArrayList arrayList2 = new ArrayList();
                                            Iterator it4 = linkedList.iterator();
                                            while (it4.hasNext()) {
                                                Object next2 = it4.next();
                                                next2.getClass();
                                                if (AbstractC0018a.m262z(2, next2) || linkedHashSet2.contains(c1649j0.m4211e(next2))) {
                                                    it = it4;
                                                    linkedHashSet = linkedHashSet2;
                                                    str2 = str6;
                                                } else {
                                                    String strM4197c = m4197c(next2);
                                                    z10 = true;
                                                    if (strM4197c != null) {
                                                        it = it4;
                                                        String strM4207w = m4207w(next2, strM4197c);
                                                        linkedHashSet = linkedHashSet2;
                                                        String strM4210d = c1649j0.m4210d();
                                                        str2 = str6;
                                                        zWriteField = AbstractC3149m.m6709h0(strM4207w, strM4210d, false) ? true : KavaReflector.writeField(next2, strM4197c, m4204p(strM4207w, strM4210d));
                                                    } else {
                                                        it = it4;
                                                        linkedHashSet = linkedHashSet2;
                                                        str2 = str6;
                                                        zWriteField = false;
                                                    }
                                                    if (!zWriteField) {
                                                    }
                                                    if (!z10) {
                                                        try {
                                                            arrayList2.add(next2);
                                                        } catch (Throwable th4) {
                                                            th = th4;
                                                            AbstractC0921a.m2261x("[Hchat:SnsAntiRecall] 合并朋友圈评论失败: ", th.getMessage(), th);
                                                            if (bArr != null) {
                                                            }
                                                            if (z9) {
                                                                numM4199i = m4199i(contentValues, "type", "field_type");
                                                                if (numM4199i == null) {
                                                                }
                                                                if (f5415j.contains(Integer.valueOf(iIntValue))) {
                                                                    contentValues.remove("sourceType");
                                                                    contentValues.remove("field_sourceType");
                                                                    c1649j0.m4216q(contentValues, "contentDesc");
                                                                    c1649j0.m4216q(contentValues, "field_contentDesc");
                                                                    c1649j0.m4215o(contentValues, "content");
                                                                    c1649j0.m4215o(contentValues, "field_content");
                                                                }
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                    }
                                                    it4 = it;
                                                    linkedHashSet2 = linkedHashSet;
                                                    str6 = str2;
                                                }
                                                z10 = false;
                                                if (!z10) {
                                                }
                                                it4 = it;
                                                linkedHashSet2 = linkedHashSet;
                                                str6 = str2;
                                            }
                                            str2 = str6;
                                            if (!arrayList2.isEmpty()) {
                                                linkedList2.addAll(arrayList2);
                                                int size = linkedList2.size();
                                                KavaReflector.writeField(objM4217r2, "CommentCount", Integer.valueOf(size));
                                                KavaReflector.writeField(objM4217r2, "CommentUserListCount", Integer.valueOf(size));
                                                Object objInvokeMethod = KavaReflector.invokeMethod(objM4217r2, "toByteArray", new Object[0]);
                                                bArr = objInvokeMethod instanceof byte[] ? (byte[]) objInvokeMethod : null;
                                                if (bArr != null) {
                                                }
                                            }
                                        }
                                        if (bArr != null) {
                                        }
                                    }
                                }
                            }
                            bArrM4218s = null;
                            if (bArrM4218s == null) {
                            }
                        } else {
                            str = "rowid";
                        }
                        str2 = " LIMIT 1";
                    } else {
                        str7 = "field_attrBuf";
                        if (contentValues.containsKey("field_attrBuf")) {
                        }
                    }
                }
                if (z9 && sharedPreferences.getBoolean("sns_anti_recall_enable", false)) {
                    numM4199i = m4199i(contentValues, "type", "field_type");
                    if (numM4199i == null) {
                        iIntValue = numM4199i.intValue();
                    } else {
                        String[] strArr2 = {"type", "field_type"};
                        if (obj == null || objArr == null) {
                            numValueOf = null;
                            if (numValueOf != null) {
                                return;
                            } else {
                                iIntValue = numValueOf.intValue();
                            }
                        } else {
                            Long lM4203n4 = m4203n(contentValues, "snsId", "field_snsId");
                            if (lM4203n4 != null) {
                                String[] strArr3 = {"snsId", "field_snsId"};
                                int i11 = 0;
                                loop3: while (true) {
                                    if (i11 >= 2) {
                                        break;
                                    }
                                    String str10 = strArr3[i11];
                                    int i12 = 0;
                                    for (int i13 = 2; i12 < i13; i13 = 2) {
                                        Integer numM4219t = c1649j0.m4219t(obj, AbstractC0255e.m1022k("SELECT ", strArr2[i12], " FROM SnsInfo WHERE ", str10, "=? LIMIT 1"), new String[]{String.valueOf(lM4203n4.longValue())});
                                        if (numM4219t != null) {
                                            numValueOf = Integer.valueOf(numM4219t.intValue());
                                            break loop3;
                                        }
                                        i12++;
                                    }
                                    i11++;
                                }
                                lM4203n = m4203n(contentValues, str);
                                if (lM4203n == null) {
                                    for (int i14 = 0; i14 < 2; i14++) {
                                        Integer numM4219t2 = c1649j0.m4219t(obj, AbstractC0921a.m2251n("SELECT ", strArr2[i14], " FROM SnsInfo WHERE rowid=? LIMIT 1"), new String[]{String.valueOf(lM4203n.longValue())});
                                        if (numM4219t2 != null) {
                                            numValueOf = Integer.valueOf(numM4219t2.intValue());
                                            break;
                                        }
                                    }
                                    strM4208x = m4208x(objArr);
                                    if (AbstractC3149m.m6721t0(strM4208x)) {
                                        strM4208x = null;
                                    }
                                    if (strM4208x == null) {
                                        String[] strArrM4206v2 = m4206v(objArr);
                                        int i15 = 0;
                                        while (i15 < 2) {
                                            String str11 = str2;
                                            Integer numM4219t3 = c1649j0.m4219t(obj, AbstractC0255e.m1022k("SELECT ", strArr2[i15], " FROM SnsInfo WHERE ", strM4208x, str11), strArrM4206v2);
                                            if (numM4219t3 != null) {
                                                numValueOf = Integer.valueOf(numM4219t3.intValue());
                                                break;
                                            } else {
                                                i15++;
                                                str2 = str11;
                                            }
                                        }
                                        numValueOf = null;
                                        if (numValueOf != null) {
                                        }
                                    }
                                } else {
                                    strM4208x = m4208x(objArr);
                                    if (AbstractC3149m.m6721t0(strM4208x)) {
                                    }
                                    if (strM4208x == null) {
                                    }
                                }
                            } else {
                                lM4203n = m4203n(contentValues, str);
                                if (lM4203n == null) {
                                }
                            }
                        }
                    }
                    if (f5415j.contains(Integer.valueOf(iIntValue)) && (numM4199i2 = m4199i(contentValues, "sourceType", "field_sourceType")) != null && numM4199i2.intValue() == 0) {
                        contentValues.remove("sourceType");
                        contentValues.remove("field_sourceType");
                        c1649j0.m4216q(contentValues, "contentDesc");
                        c1649j0.m4216q(contentValues, "field_contentDesc");
                        c1649j0.m4215o(contentValues, "content");
                        c1649j0.m4215o(contentValues, "field_content");
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static String m4197c(Object obj) {
        for (int i9 = 0; i9 < 2; i9++) {
            String str = f5411f[i9];
            if (KavaReflector.readField(obj, str) instanceof String) {
                return str;
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g */
    public static int m4198g(Iterable iterable, Object obj) {
        Integer num;
        Iterator it = iterable.iterator();
        do {
            num = null;
            if (!it.hasNext()) {
                break;
            }
            Object field = KavaReflector.readField(obj, (String) it.next());
            Number number = field instanceof Number ? (Number) field : null;
            int iIntValue = number != null ? number.intValue() : 0;
            Integer numValueOf = Integer.valueOf(iIntValue);
            if (iIntValue > 0) {
                num = numValueOf;
            }
        } while (num == null);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i */
    public static Integer m4199i(ContentValues contentValues, String... strArr) {
        Object c3959f;
        Object c3959f2;
        Integer numM6741e0;
        int length = strArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                return null;
            }
            String str = strArr[i9];
            if (contentValues.containsKey(str)) {
                try {
                    c3959f = contentValues.getAsInteger(str);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                Integer num = (Integer) c3959f;
                if (num != null) {
                    return Integer.valueOf(num.intValue());
                }
                try {
                    c3959f2 = contentValues.get(str);
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                Object obj = c3959f2 instanceof C3959f ? null : c3959f2;
                if (obj instanceof Number) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
                if ((obj instanceof String) && (numM6741e0 = AbstractC3156t.m6741e0(10, (String) obj)) != null) {
                    return Integer.valueOf(numM6741e0.intValue());
                }
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k */
    public static boolean m4200k(Method method) {
        String name = method.getName();
        if (AbstractC1416l.m3825a(name, "rawQuery") || AbstractC1416l.m3825a(name, "rawQueryWithFactory")) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            for (Class<?> cls : parameterTypes) {
                if (AbstractC1416l.m3825a(cls, String.class)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l */
    public static boolean m4201l(Method method) {
        if (AbstractC1416l.m3825a(method.getReturnType(), Integer.TYPE) && (AbstractC1416l.m3825a(method.getName(), "update") || AbstractC1416l.m3825a(method.getName(), "updateWithOnConflict"))) {
            Class<?>[] parameterTypes = method.getParameterTypes();
            parameterTypes.getClass();
            for (Class<?> cls : parameterTypes) {
                if (ContentValues.class.isAssignableFrom(cls)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m */
    public static boolean m4202m(Method method) {
        if (m4201l(method)) {
            return true;
        }
        if (AbstractC1416l.m3825a(method.getReturnType(), Long.TYPE)) {
            String name = method.getName();
            if (AbstractC1416l.m3825a(name, "insert") || AbstractC1416l.m3825a(name, "insertWithOnConflict") || AbstractC1416l.m3825a(name, "replace") || AbstractC1416l.m3825a(name, "replaceOrThrow")) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                for (Class<?> cls : parameterTypes) {
                    if (ContentValues.class.isAssignableFrom(cls)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: n */
    public static Long m4203n(ContentValues contentValues, String... strArr) {
        Object c3959f;
        Object c3959f2;
        Long lM6743g0;
        int length = strArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                return null;
            }
            String str = strArr[i9];
            if (contentValues.containsKey(str)) {
                try {
                    c3959f = contentValues.getAsLong(str);
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                if (c3959f instanceof C3959f) {
                    c3959f = null;
                }
                Long l10 = (Long) c3959f;
                if (l10 != null) {
                    return Long.valueOf(l10.longValue());
                }
                try {
                    c3959f2 = contentValues.get(str);
                } catch (Throwable th3) {
                    c3959f2 = new C3959f(th3);
                }
                Object obj = c3959f2 instanceof C3959f ? null : c3959f2;
                if (obj instanceof Number) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                if ((obj instanceof String) && (lM6743g0 = AbstractC3156t.m6743g0((String) obj)) != null) {
                    return Long.valueOf(lM6743g0.longValue());
                }
            }
            i9++;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static String m4204p(String str, String str2) {
        return AbstractC3149m.m6709h0(str, str2, false) ? str : AbstractC3149m.m6721t0(str) ? str2 : AbstractC4855en.m9264h(str2, " ", str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u */
    public static C1647i0 m4205u(byte[] bArr, int i9) {
        long j3 = 0;
        for (int i10 = 0; i9 < bArr.length && i10 < 64; i10 += 7) {
            byte b10 = bArr[i9];
            i9++;
            j3 |= ((long) (b10 & JSONB.Constants.BC_SYMBOL)) << i10;
            if ((b10 & 128) == 0) {
                return new C1647i0(j3, i9);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v */
    public static String[] m4206v(Object[] objArr) {
        Object obj;
        int length = objArr.length;
        int i9 = 0;
        while (true) {
            if (i9 >= length) {
                obj = null;
                break;
            }
            obj = objArr[i9];
            if ((obj instanceof Object[]) && AbstractC1416l.m3825a(obj.getClass().getComponentType(), String.class)) {
                break;
            }
            i9++;
        }
        if (obj instanceof String[]) {
            return (String[]) obj;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: w */
    public static String m4207w(Object obj, String str) {
        Object field = KavaReflector.readField(obj, str);
        String str2 = field instanceof String ? (String) field : null;
        return str2 != null ? str2 : HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x */
    public static String m4208x(Object[] objArr) {
        boolean z9 = false;
        for (Object obj : objArr) {
            if (obj instanceof ContentValues) {
                z9 = true;
            } else if (z9 && (obj instanceof String)) {
                return (String) obj;
            }
        }
        return HttpUrl.FRAGMENT_ENCODE_SET;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: y */
    public static void m4209y(ByteArrayOutputStream byteArrayOutputStream, long j3) {
        while (((-128) & j3) != 0) {
            byteArrayOutputStream.write((int) ((127 & j3) | 128));
            j3 >>>= 7;
        }
        byteArrayOutputStream.write((int) j3);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final String m4210d() {
        SharedPreferences sharedPreferences = this.f5423b;
        if (!sharedPreferences.getBoolean("sns_comment_custom_mark_enable", false)) {
            return "[已删除]";
        }
        String string = sharedPreferences.getString("sns_comment_custom_mark_text", "[已删除]");
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string2 = AbstractC3149m.m6703R0(string).toString();
        return AbstractC3149m.m6721t0(string2) ? "[已删除]" : string2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final String m4211e(Object obj) {
        Long lValueOf;
        String strM4197c = m4197c(obj);
        C1406b c1406b = new C1406b(f5414i);
        while (true) {
            if (!c1406b.hasNext()) {
                lValueOf = null;
                break;
            }
            Object field = KavaReflector.readField(obj, (String) c1406b.next());
            Number number = field instanceof Number ? (Number) field : null;
            long jLongValue = number != null ? number.longValue() : 0L;
            lValueOf = Long.valueOf(jLongValue);
            if (jLongValue <= 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                break;
            }
        }
        long jLongValue2 = lValueOf != null ? lValueOf.longValue() : 0L;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < 5; i9++) {
            String str = f5413h[i9];
            if (!AbstractC1416l.m3825a(str, strM4197c)) {
                arrayList.add(str);
            }
        }
        int iM4198g = m4198g(arrayList, obj);
        int iM4198g2 = m4198g(new C3018p(f5412g, 1), obj);
        String strM4207w = m4207w(obj, "d");
        String strM4207w2 = strM4197c != null ? m4207w(obj, strM4197c) : null;
        if (strM4207w2 == null) {
            strM4207w2 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string = AbstractC3149m.m6707V0(AbstractC3149m.m6686A0(strM4207w2, m4210d())).toString();
        if (jLongValue2 > 0) {
            return AbstractC0255e.m1018g(jLongValue2, "svr:");
        }
        if (iM4198g > 0) {
            return AbstractC0921a.m2249l(iM4198g, "local:");
        }
        StringBuilder sbM2258u = AbstractC0921a.m2258u(iM4198g2, "fallback:", strM4207w, ":", ":");
        sbM2258u.append(string);
        return sbM2258u.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final String m4212f() {
        SharedPreferences sharedPreferences = this.f5423b;
        if (!sharedPreferences.getBoolean("sns_custom_mark_enable", false)) {
            return "[已删除]";
        }
        String string = sharedPreferences.getString("sns_custom_mark_text", "[已删除]");
        if (string == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String string2 = AbstractC3149m.m6703R0(string).toString();
        return AbstractC3149m.m6721t0(string2) ? "[已删除]" : string2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h */
    public final int m4213h(Class cls) {
        int i9 = 0;
        if (cls == null) {
            return 0;
        }
        for (Method method : KavaReflector.declaredMethods(cls)) {
            if (m4202m(method) || m4200k(method)) {
                if (this.f5425d.add(method)) {
                    C3744i.f12154b.m7763b(method, new C0425c2(this, 4, method));
                    i9++;
                }
            }
        }
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.io.Serializable[] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public final Cursor m4214j(Object obj, String str, String[] strArr) {
        Serializable[] serializableArr = {str, strArr};
        Method methodFindCompatibleMethod = KavaReflector.findCompatibleMethod(obj.getClass(), "rawQuery", Arrays.copyOf(serializableArr, 2));
        Cursor cursor = null;
        if (methodFindCompatibleMethod == null && (methodFindCompatibleMethod = KavaReflector.findCompatibleMethod(obj.getClass(), "rawQueryWithFactory", null, str, strArr, null)) == null) {
            return null;
        }
        ThreadLocal threadLocal = this.f5426e;
        Boolean bool = (Boolean) threadLocal.get();
        threadLocal.set(Boolean.TRUE);
        try {
            if (AbstractC1416l.m3825a(methodFindCompatibleMethod.getName(), "rawQueryWithFactory")) {
                Object objInvoke = KavaReflector.invoke(methodFindCompatibleMethod, obj, null, str, strArr, null);
                if (objInvoke instanceof Cursor) {
                    cursor = (Cursor) objInvoke;
                }
            } else {
                Object objInvoke2 = KavaReflector.invoke(methodFindCompatibleMethod, obj, Arrays.copyOf(serializableArr, 2));
                if (objInvoke2 instanceof Cursor) {
                    cursor = (Cursor) objInvoke2;
                }
            }
            threadLocal.set(bool);
            return cursor;
        } catch (Throwable th2) {
            threadLocal.set(bool);
            throw th2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00dd, code lost:
    
        if (r7 != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00df, code lost:
    
        m4209y(r3, 42);
        m4209y(r3, r1.length);
        r3.write(r1);
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ed, code lost:
    
        if (r8 == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ef, code lost:
    
        r2 = r3.toByteArray();
     */
    /* JADX INFO: renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4215o(ContentValues contentValues, String str) {
        Object c3959f;
        int i9;
        if (contentValues.containsKey(str)) {
            try {
                c3959f = contentValues.getAsByteArray(str);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            byte[] bArr = (byte[]) c3959f;
            if (bArr != null) {
                try {
                    String strM4212f = m4212f();
                    Charset charset = StandardCharsets.UTF_8;
                    charset.getClass();
                    byte[] bytes = strM4212f.getBytes(charset);
                    bytes.getClass();
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length + bytes.length + 8);
                    int i10 = 0;
                    boolean z9 = false;
                    boolean z10 = false;
                    while (true) {
                        if (i10 >= bArr.length) {
                            break;
                        }
                        C1647i0 c1647i0M4205u = m4205u(bArr, i10);
                        if (c1647i0M4205u == null) {
                            break;
                        }
                        int i11 = c1647i0M4205u.f5409b;
                        long j3 = c1647i0M4205u.f5408a;
                        int i12 = (int) (j3 >>> 3);
                        int i13 = (int) (7 & j3);
                        m4209y(byteArrayOutputStream, j3);
                        if (i13 == 0) {
                            C1647i0 c1647i0M4205u2 = m4205u(bArr, i11);
                            if (c1647i0M4205u2 == null) {
                                break;
                            }
                            i10 = c1647i0M4205u2.f5409b;
                            m4209y(byteArrayOutputStream, c1647i0M4205u2.f5408a);
                        } else if (i13 == 1) {
                            int i14 = i11 + 8;
                            if (i14 > bArr.length) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, i11, 8);
                            i10 = i14;
                        } else if (i13 == 2) {
                            C1647i0 c1647i0M4205u3 = m4205u(bArr, i11);
                            if (c1647i0M4205u3 == null) {
                                break;
                            }
                            int i15 = c1647i0M4205u3.f5409b;
                            long j4 = c1647i0M4205u3.f5408a;
                            int i16 = (int) j4;
                            if (i16 < 0 || (i9 = i15 + i16) > bArr.length) {
                                break;
                            }
                            if (i12 == 5) {
                                Charset charset2 = StandardCharsets.UTF_8;
                                charset2.getClass();
                                byte[] bytes2 = m4204p(new String(bArr, i15, i16, charset2), m4212f()).getBytes(charset2);
                                bytes2.getClass();
                                m4209y(byteArrayOutputStream, bytes2.length);
                                byteArrayOutputStream.write(bytes2);
                                z10 = (!z10 && bytes2.length == i16 && Arrays.equals(bytes2, AbstractC4165l.m8385t0(bArr, i15, i9))) ? false : true;
                                z9 = true;
                            } else {
                                m4209y(byteArrayOutputStream, j4);
                                byteArrayOutputStream.write(bArr, i15, i16);
                            }
                            i10 = i9;
                        } else if (i13 != 5 || (i10 = i11 + 4) > bArr.length) {
                            break;
                        } else {
                            byteArrayOutputStream.write(bArr, i11, 4);
                        }
                    }
                } catch (Throwable unused) {
                }
                byte[] byteArray = null;
                if (byteArray != null) {
                    contentValues.put(str, byteArray);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public final void m4216q(ContentValues contentValues, String str) {
        Object c3959f;
        if (contentValues.containsKey(str)) {
            try {
                c3959f = contentValues.getAsString(str);
            } catch (Throwable th2) {
                c3959f = new C3959f(th2);
            }
            if (c3959f instanceof C3959f) {
                c3959f = null;
            }
            String str2 = (String) c3959f;
            if (str2 == null) {
                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String strM4204p = m4204p(str2, m4212f());
            if (strM4204p.equals(str2)) {
                return;
            }
            contentValues.put(str, strM4204p);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final Object m4217r(byte[] bArr) {
        Constructor<?> constructorFindConstructor;
        Object objNewInstance;
        Method methodFindCompatibleMethod;
        Class<?> clsLoadClass = KavaReflector.loadClass("com.tencent.mm.protocal.protobuf.SnsObject", this.f5422a.f12145c);
        if (clsLoadClass == null || (constructorFindConstructor = KavaReflector.findConstructor(clsLoadClass, new Class[0])) == null || (objNewInstance = KavaReflector.newInstance(constructorFindConstructor, new Object[0])) == null || (methodFindCompatibleMethod = KavaReflector.findCompatibleMethod(objNewInstance.getClass(), "parseFrom", bArr)) == null || !KavaReflector.invokeSuccessfully(methodFindCompatibleMethod, objNewInstance, bArr)) {
            return null;
        }
        return objNewInstance;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final byte[] m4218s(Object obj, String str, String[] strArr) {
        Cursor cursorM4214j;
        Object next;
        Object c3959f;
        byte[] blob = null;
        try {
            cursorM4214j = m4214j(obj, str, strArr);
        } catch (Throwable unused) {
            cursorM4214j = null;
        }
        if (cursorM4214j != null) {
            try {
                if (cursorM4214j.moveToFirst()) {
                    Iterator it = AbstractC3754e0.m7910r0(0, cursorM4214j.getColumnCount()).iterator();
                    while (true) {
                        if (!((C2563c) it).f8317i) {
                            next = null;
                            break;
                        }
                        next = ((C2563c) it).next();
                        try {
                            c3959f = cursorM4214j.getColumnName(((Number) next).intValue());
                        } catch (Throwable th2) {
                            c3959f = new C3959f(th2);
                        }
                        if (c3959f instanceof C3959f) {
                            c3959f = null;
                        }
                        String str2 = (String) c3959f;
                        if (str2 == null) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        if (str2.equalsIgnoreCase("attrBuf") || str2.equalsIgnoreCase("field_attrBuf")) {
                            break;
                        }
                    }
                    Integer num = (Integer) next;
                    blob = cursorM4214j.getBlob(num != null ? num.intValue() : 0);
                }
            } catch (Throwable unused2) {
                if (cursorM4214j != null) {
                }
                return blob;
            }
            try {
                cursorM4214j.close();
            } catch (Throwable unused3) {
            }
            return blob;
        }
        if (cursorM4214j != null) {
            try {
                cursorM4214j.close();
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t */
    public final Integer m4219t(Object obj, String str, String[] strArr) {
        Cursor cursorM4214j;
        Integer numValueOf = null;
        try {
            cursorM4214j = m4214j(obj, str, strArr);
        } catch (Throwable unused) {
            cursorM4214j = null;
        }
        if (cursorM4214j != null) {
            try {
                if (cursorM4214j.moveToFirst()) {
                    if (cursorM4214j.isNull(0)) {
                        try {
                            cursorM4214j.close();
                        } catch (Throwable unused2) {
                        }
                        return null;
                    }
                    numValueOf = Integer.valueOf(cursorM4214j.getInt(0));
                }
            } catch (Throwable unused3) {
                if (cursorM4214j != null) {
                }
                return numValueOf;
            }
            try {
                cursorM4214j.close();
            } catch (Throwable unused4) {
            }
            return numValueOf;
        }
        if (cursorM4214j != null) {
            try {
                cursorM4214j.close();
            } catch (Throwable unused5) {
            }
        }
        return null;
    }
}
