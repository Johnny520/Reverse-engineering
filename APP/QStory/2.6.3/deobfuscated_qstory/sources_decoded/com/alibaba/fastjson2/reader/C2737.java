package com.alibaba.fastjson2.reader;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2899;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p144.C7547;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2737 implements InterfaceC2788 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Enum[] f8362;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Class f8363;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Member f8364;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8365;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Method f8366;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long[] f8367;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Enum[] f8368;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String[] f8369;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long[] f8370;

    /* JADX WARN: Multi-variable type inference failed */
    public C2737(Class cls, Method method, Member member, Enum[] enumArr, Enum[] enumArr2, long[] jArr) {
        this.f8363 = cls;
        this.f8366 = method;
        if (member instanceof AccessibleObject) {
            ((AccessibleObject) member).setAccessible(true);
        }
        this.f8364 = member;
        Class<?> cls2 = null;
        Class<?> type = member instanceof Field ? ((Field) member).getType() : member instanceof Method ? ((Method) member).getReturnType() : null;
        if (type != null) {
            this.f8369 = new String[enumArr.length];
            if (type != String.class) {
                this.f8370 = new long[enumArr.length];
            }
            for (int i = 0; i < enumArr.length; i++) {
                Enum r9 = enumArr[i];
                try {
                    Object objInvoke = member instanceof Field ? ((Field) member).get(r9) : ((Method) member).invoke(r9, null);
                    String[] strArr = this.f8369;
                    if (type == String.class) {
                        strArr[i] = (String) objInvoke;
                    } else {
                        strArr[i] = objInvoke == null ? null : objInvoke.toString();
                        if (objInvoke instanceof Number) {
                            this.f8370[i] = ((Number) objInvoke).longValue();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (method != null && method.getParameterCount() == 1) {
            cls2 = method.getParameterTypes()[0];
        }
        this.f8365 = cls2;
        AbstractC2860.m5774(AbstractC2867.m5943(cls));
        this.f8362 = enumArr;
        this.f8368 = enumArr2;
        this.f8367 = jArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m5534(Type type) {
        if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
            C0276.m850(C2737.class.getSimpleName().concat(" parses error, JSONReader not forward when field type belongs to collection to avoid OOM"));
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo5463(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Enum enumM5535;
        int i;
        int i2 = abstractC2899.f9194;
        Enum r3 = null;
        Class cls = this.f8363;
        Class cls2 = this.f8365;
        if (cls2 != null) {
            Object objMo6139 = abstractC2899.mo6139(cls2);
            try {
                return this.f8366.invoke(null, objMo6139);
            } catch (IllegalAccessException | InvocationTargetException e) {
                C0276.m843(abstractC2899.mo6170("create enum error, enumClass " + cls.getName() + ", paramValue " + objMo6139), e);
                return null;
            }
        }
        boolean zMo6181 = abstractC2899.mo6181();
        Enum[] enumArr = this.f8368;
        Enum[] enumArr2 = this.f8362;
        int i3 = 0;
        Member member = this.f8364;
        long[] jArr = this.f8370;
        if (zMo6181) {
            int iMo6212 = abstractC2899.mo6212();
            if (member == null) {
                if (iMo6212 < 0 || iMo6212 >= enumArr.length) {
                    C7547.m12766(iMo6212, cls.getCanonicalName(), ".", "No enum ordinal ");
                    return null;
                }
                r3 = enumArr[iMo6212];
            } else if (jArr != null) {
                while (i3 < jArr.length) {
                    if (jArr[i3] == iMo6212) {
                        enumM5535 = enumArr2[i3];
                        break;
                    }
                    i3++;
                }
                enumM5535 = null;
                if (enumM5535 == null && abstractC2899.m6166(JSONReader$Feature.ErrorOnEnumNotMatch)) {
                    C0276.m850(abstractC2899.mo6170("parse enum error, class " + cls.getName() + ", " + member.getName() + " " + iMo6212));
                    return null;
                }
                r3 = enumM5535;
            } else {
                enumM5535 = null;
                if (enumM5535 == null) {
                    C0276.m850(abstractC2899.mo6170("parse enum error, class " + cls.getName() + ", " + member.getName() + " " + iMo6212));
                    return null;
                }
                r3 = enumM5535;
            }
        } else if (!abstractC2899.mo6151()) {
            String[] strArr = this.f8369;
            if (strArr != null && abstractC2899.mo6179()) {
                String strMo6184 = abstractC2899.mo6184();
                while (true) {
                    if (i3 >= strArr.length) {
                        enumM5535 = null;
                        break;
                    }
                    if (strMo6184.equals(strArr[i3])) {
                        enumM5535 = enumArr2[i3];
                        break;
                    }
                    i3++;
                }
                if (enumM5535 == null && member != null) {
                    try {
                        enumM5535 = Enum.valueOf(cls, strMo6184);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            } else if (jArr != null && abstractC2899.mo6181()) {
                int iMo62122 = abstractC2899.mo6212();
                while (true) {
                    if (i3 >= jArr.length) {
                        enumM5535 = null;
                        break;
                    }
                    if (jArr[i3] == iMo62122) {
                        enumM5535 = enumArr2[i3];
                        break;
                    }
                    i3++;
                }
            } else {
                long jMo6244 = abstractC2899.mo6244();
                if (jMo6244 == -3750763034362895579L) {
                    return null;
                }
                enumM5535 = m5535(jMo6244);
                if (enumM5535 == null) {
                    enumM5535 = m5535(abstractC2899.mo6106());
                }
                if (enumM5535 == null) {
                    String strMo6100 = abstractC2899.mo6100();
                    if (AbstractC2867.m5939(strMo6100) && (i = Integer.parseInt(strMo6100)) >= 0 && i < enumArr.length) {
                        enumM5535 = enumArr[i];
                    }
                }
            }
            if (enumM5535 == null && abstractC2899.m6166(JSONReader$Feature.ErrorOnEnumNotMatch)) {
                C0276.m850(abstractC2899.mo6170("parse enum error, class " + cls.getName() + ", value " + abstractC2899.mo6100()));
                return null;
            }
            r3 = enumM5535;
        }
        if (r3 == null && abstractC2899.f9194 == i2) {
            m5534(type);
        }
        return r3;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo5498() {
        return this.f8363;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC2788
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo5467(AbstractC2899 abstractC2899, Type type, Object obj, long j) {
        Class cls;
        Enum enumM5535;
        int i = abstractC2899.f9194;
        int iMo6183 = abstractC2899.mo6183();
        Class cls2 = this.f8363;
        if (iMo6183 == -110) {
            InterfaceC2788 interfaceC2788Mo6164 = abstractC2899.mo6164(0L, j, cls2);
            cls = cls2;
            if (interfaceC2788Mo6164 != null) {
                if (interfaceC2788Mo6164 != this) {
                    return interfaceC2788Mo6164.mo5467(abstractC2899, type, obj, j);
                }
            } else if (abstractC2899.m6166(JSONReader$Feature.ErrorOnNotSupportAutoType)) {
                C0276.m850(abstractC2899.mo6170("not support enumType : " + abstractC2899.mo6100()));
                return null;
            }
        } else {
            cls = cls2;
        }
        if (iMo6183 >= -16 && iMo6183 <= 72) {
            if (iMo6183 <= 47) {
                abstractC2899.mo6173();
            } else {
                iMo6183 = abstractC2899.mo6212();
            }
            if (iMo6183 >= 0) {
                Enum[] enumArr = this.f8368;
                if (iMo6183 < enumArr.length) {
                    enumM5535 = enumArr[iMo6183];
                }
            }
            C7547.m12766(iMo6183, cls.getCanonicalName(), ".", "No enum ordinal ");
            return null;
        }
        if (abstractC2899.mo6151()) {
            return null;
        }
        Enum enumM55352 = m5535(abstractC2899.mo6244());
        enumM5535 = enumM55352 == null ? m5535(abstractC2899.mo6106()) : enumM55352;
        if (enumM5535 == null && abstractC2899.f9194 == i) {
            m5534(type);
        }
        return enumM5535;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Enum m5535(long j) {
        int iBinarySearch;
        Enum[] enumArr = this.f8362;
        if (enumArr != null && (iBinarySearch = Arrays.binarySearch(this.f8367, j)) >= 0) {
            return enumArr[iBinarySearch];
        }
        return null;
    }
}
