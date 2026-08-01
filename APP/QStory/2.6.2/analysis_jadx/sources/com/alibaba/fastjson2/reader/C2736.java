package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2898;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p144.C7546;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2736 implements InterfaceC2787 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Enum[] f8360;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Class f8361;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Member f8362;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8363;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Method f8364;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long[] f8365;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Enum[] f8366;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String[] f8367;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long[] f8368;

    /* JADX WARN: Multi-variable type inference failed */
    public C2736(Class cls, Method method, Member member, Enum[] enumArr, Enum[] enumArr2, long[] jArr) {
        this.f8361 = cls;
        this.f8364 = method;
        if (member instanceof AccessibleObject) {
            ((AccessibleObject) member).setAccessible(true);
        }
        this.f8362 = member;
        Class<?> cls2 = null;
        Class<?> type = member instanceof Field ? ((Field) member).getType() : member instanceof Method ? ((Method) member).getReturnType() : null;
        if (type != null) {
            this.f8367 = new String[enumArr.length];
            if (type != String.class) {
                this.f8368 = new long[enumArr.length];
            }
            for (int i = 0; i < enumArr.length; i++) {
                Enum r9 = enumArr[i];
                try {
                    Object objInvoke = member instanceof Field ? ((Field) member).get(r9) : ((Method) member).invoke(r9, null);
                    String[] strArr = this.f8367;
                    if (type == String.class) {
                        strArr[i] = (String) objInvoke;
                    } else {
                        strArr[i] = objInvoke == null ? null : objInvoke.toString();
                        if (objInvoke instanceof Number) {
                            this.f8368[i] = ((Number) objInvoke).longValue();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (method != null && method.getParameterCount() == 1) {
            cls2 = method.getParameterTypes()[0];
        }
        this.f8363 = cls2;
        AbstractC2859.m5729(AbstractC2866.m5898(cls));
        this.f8360 = enumArr;
        this.f8366 = enumArr2;
        this.f8365 = jArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m5489(Type type) {
        if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
            C0276.m849(C2736.class.getSimpleName().concat(" parses error, JSONReader not forward when field type belongs to collection to avoid OOM"));
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5418(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Enum enumM5490;
        int i;
        int i2 = abstractC2898.f9192;
        Enum r3 = null;
        Class cls = this.f8361;
        Class cls2 = this.f8363;
        if (cls2 != null) {
            Object objMo6093 = abstractC2898.mo6093(cls2);
            try {
                return this.f8364.invoke(null, objMo6093);
            } catch (IllegalAccessException | InvocationTargetException e) {
                C0276.m842(abstractC2898.mo6124("create enum error, enumClass " + cls.getName() + ", paramValue " + objMo6093), e);
                return null;
            }
        }
        boolean zMo6135 = abstractC2898.mo6135();
        Enum[] enumArr = this.f8366;
        Enum[] enumArr2 = this.f8360;
        int i3 = 0;
        Member member = this.f8362;
        long[] jArr = this.f8368;
        if (zMo6135) {
            int iMo6167 = abstractC2898.mo6167();
            if (member == null) {
                if (iMo6167 < 0 || iMo6167 >= enumArr.length) {
                    C7546.m12737(iMo6167, cls.getCanonicalName(), ".", "No enum ordinal ");
                    return null;
                }
                r3 = enumArr[iMo6167];
            } else if (jArr != null) {
                while (i3 < jArr.length) {
                    if (jArr[i3] == iMo6167) {
                        enumM5490 = enumArr2[i3];
                        break;
                    }
                    i3++;
                }
                enumM5490 = null;
                if (enumM5490 == null && abstractC2898.m6120(JSONReader$Feature.ErrorOnEnumNotMatch)) {
                    C0276.m849(abstractC2898.mo6124("parse enum error, class " + cls.getName() + ", " + member.getName() + " " + iMo6167));
                    return null;
                }
                r3 = enumM5490;
            } else {
                enumM5490 = null;
                if (enumM5490 == null) {
                    C0276.m849(abstractC2898.mo6124("parse enum error, class " + cls.getName() + ", " + member.getName() + " " + iMo6167));
                    return null;
                }
                r3 = enumM5490;
            }
        } else if (!abstractC2898.mo6105()) {
            String[] strArr = this.f8367;
            if (strArr != null && abstractC2898.mo6133()) {
                String strMo6139 = abstractC2898.mo6139();
                while (true) {
                    if (i3 >= strArr.length) {
                        enumM5490 = null;
                        break;
                    }
                    if (strMo6139.equals(strArr[i3])) {
                        enumM5490 = enumArr2[i3];
                        break;
                    }
                    i3++;
                }
                if (enumM5490 == null && member != null) {
                    try {
                        enumM5490 = Enum.valueOf(cls, strMo6139);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            } else if (jArr != null && abstractC2898.mo6135()) {
                int iMo61672 = abstractC2898.mo6167();
                while (true) {
                    if (i3 >= jArr.length) {
                        enumM5490 = null;
                        break;
                    }
                    if (jArr[i3] == iMo61672) {
                        enumM5490 = enumArr2[i3];
                        break;
                    }
                    i3++;
                }
            } else {
                long jMo6199 = abstractC2898.mo6199();
                if (jMo6199 == -3750763034362895579L) {
                    return null;
                }
                enumM5490 = m5490(jMo6199);
                if (enumM5490 == null) {
                    enumM5490 = m5490(abstractC2898.mo6060());
                }
                if (enumM5490 == null) {
                    String strMo6055 = abstractC2898.mo6055();
                    if (AbstractC2866.m5894(strMo6055) && (i = Integer.parseInt(strMo6055)) >= 0 && i < enumArr.length) {
                        enumM5490 = enumArr[i];
                    }
                }
            }
            if (enumM5490 == null && abstractC2898.m6120(JSONReader$Feature.ErrorOnEnumNotMatch)) {
                C0276.m849(abstractC2898.mo6124("parse enum error, class " + cls.getName() + ", value " + abstractC2898.mo6055()));
                return null;
            }
            r3 = enumM5490;
        }
        if (r3 == null && abstractC2898.f9192 == i2) {
            m5489(type);
        }
        return r3;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5453() {
        return this.f8361;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2787
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5422(AbstractC2898 abstractC2898, Type type, Object obj, long j) {
        Class cls;
        Enum enumM5490;
        int i = abstractC2898.f9192;
        int iMo6138 = abstractC2898.mo6138();
        Class cls2 = this.f8361;
        if (iMo6138 == -110) {
            InterfaceC2787 interfaceC2787Mo6118 = abstractC2898.mo6118(0L, j, cls2);
            cls = cls2;
            if (interfaceC2787Mo6118 != null) {
                if (interfaceC2787Mo6118 != this) {
                    return interfaceC2787Mo6118.mo5422(abstractC2898, type, obj, j);
                }
            } else if (abstractC2898.m6120(JSONReader$Feature.ErrorOnNotSupportAutoType)) {
                C0276.m849(abstractC2898.mo6124("not support enumType : " + abstractC2898.mo6055()));
                return null;
            }
        } else {
            cls = cls2;
        }
        if (iMo6138 >= -16 && iMo6138 <= 72) {
            if (iMo6138 <= 47) {
                abstractC2898.mo6127();
            } else {
                iMo6138 = abstractC2898.mo6167();
            }
            if (iMo6138 >= 0) {
                Enum[] enumArr = this.f8366;
                if (iMo6138 < enumArr.length) {
                    enumM5490 = enumArr[iMo6138];
                }
            }
            C7546.m12737(iMo6138, cls.getCanonicalName(), ".", "No enum ordinal ");
            return null;
        }
        if (abstractC2898.mo6105()) {
            return null;
        }
        Enum enumM54902 = m5490(abstractC2898.mo6199());
        enumM5490 = enumM54902 == null ? m5490(abstractC2898.mo6060()) : enumM54902;
        if (enumM5490 == null && abstractC2898.f9192 == i) {
            m5489(type);
        }
        return enumM5490;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Enum m5490(long j) {
        int iBinarySearch;
        Enum[] enumArr = this.f8360;
        if (enumArr != null && (iBinarySearch = Arrays.binarySearch(this.f8365, j)) >= 0) {
            return enumArr[iBinarySearch];
        }
        return null;
    }
}
