package com.alibaba.fastjson2.reader;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3732;
import com.alibaba.fastjson2.JSONReader$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import p160.C8376;

/* JADX INFO: renamed from: com.alibaba.fastjson2.reader.飘花落叶言子哲苏世兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3570 implements InterfaceC3621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Enum[] f8707;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Class f8708;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Member f8709;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f8710;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Method f8711;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long[] f8712;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Enum[] f8713;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String[] f8714;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final long[] f8715;

    /* JADX WARN: Multi-variable type inference failed */
    public C3570(Class cls, Method method, Member member, Enum[] enumArr, Enum[] enumArr2, long[] jArr) {
        this.f8708 = cls;
        this.f8711 = method;
        if (member instanceof AccessibleObject) {
            ((AccessibleObject) member).setAccessible(true);
        }
        this.f8709 = member;
        Class<?> cls2 = null;
        Class<?> type = member instanceof Field ? ((Field) member).getType() : member instanceof Method ? ((Method) member).getReturnType() : null;
        if (type != null) {
            this.f8714 = new String[enumArr.length];
            if (type != String.class) {
                this.f8715 = new long[enumArr.length];
            }
            for (int i = 0; i < enumArr.length; i++) {
                Enum r9 = enumArr[i];
                try {
                    Object objInvoke = member instanceof Field ? ((Field) member).get(r9) : ((Method) member).invoke(r9, null);
                    String[] strArr = this.f8714;
                    if (type == String.class) {
                        strArr[i] = (String) objInvoke;
                    } else {
                        strArr[i] = objInvoke == null ? null : objInvoke.toString();
                        if (objInvoke instanceof Number) {
                            this.f8715[i] = ((Number) objInvoke).longValue();
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        if (method != null && method.getParameterCount() == 1) {
            cls2 = method.getParameterTypes()[0];
        }
        this.f8710 = cls2;
        AbstractC3693.m6334(AbstractC3700.m6503(cls));
        this.f8707 = enumArr;
        this.f8713 = enumArr2;
        this.f8712 = jArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static void m6094(Type type) {
        if ((type instanceof ParameterizedType) && List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
            C1123.m1410(C3570.class.getSimpleName().concat(" parses error, JSONReader not forward when field type belongs to collection to avoid OOM"));
        }
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6023(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Enum enumM6095;
        int i;
        int i2 = abstractC3732.f9539;
        Enum r3 = null;
        Class cls = this.f8708;
        Class cls2 = this.f8710;
        if (cls2 != null) {
            Object objMo6699 = abstractC3732.mo6699(cls2);
            try {
                return this.f8711.invoke(null, objMo6699);
            } catch (IllegalAccessException | InvocationTargetException e) {
                C1123.m1403(abstractC3732.mo6730("create enum error, enumClass " + cls.getName() + ", paramValue " + objMo6699), e);
                return null;
            }
        }
        boolean zMo6741 = abstractC3732.mo6741();
        Enum[] enumArr = this.f8713;
        Enum[] enumArr2 = this.f8707;
        int i3 = 0;
        Member member = this.f8709;
        long[] jArr = this.f8715;
        if (zMo6741) {
            int iMo6772 = abstractC3732.mo6772();
            if (member == null) {
                if (iMo6772 < 0 || iMo6772 >= enumArr.length) {
                    C8376.m13325(iMo6772, cls.getCanonicalName(), ".", "No enum ordinal ");
                    return null;
                }
                r3 = enumArr[iMo6772];
            } else if (jArr != null) {
                while (i3 < jArr.length) {
                    if (jArr[i3] == iMo6772) {
                        enumM6095 = enumArr2[i3];
                        break;
                    }
                    i3++;
                }
                enumM6095 = null;
                if (enumM6095 == null && abstractC3732.m6726(JSONReader$Feature.ErrorOnEnumNotMatch)) {
                    C1123.m1410(abstractC3732.mo6730("parse enum error, class " + cls.getName() + ", " + member.getName() + " " + iMo6772));
                    return null;
                }
                r3 = enumM6095;
            } else {
                enumM6095 = null;
                if (enumM6095 == null) {
                    C1123.m1410(abstractC3732.mo6730("parse enum error, class " + cls.getName() + ", " + member.getName() + " " + iMo6772));
                    return null;
                }
                r3 = enumM6095;
            }
        } else if (!abstractC3732.mo6711()) {
            String[] strArr = this.f8714;
            if (strArr != null && abstractC3732.mo6739()) {
                String strMo6744 = abstractC3732.mo6744();
                while (true) {
                    if (i3 >= strArr.length) {
                        enumM6095 = null;
                        break;
                    }
                    if (strMo6744.equals(strArr[i3])) {
                        enumM6095 = enumArr2[i3];
                        break;
                    }
                    i3++;
                }
                if (enumM6095 == null && member != null) {
                    try {
                        enumM6095 = Enum.valueOf(cls, strMo6744);
                    } catch (IllegalArgumentException unused) {
                    }
                }
            } else if (jArr != null && abstractC3732.mo6741()) {
                int iMo67722 = abstractC3732.mo6772();
                while (true) {
                    if (i3 >= jArr.length) {
                        enumM6095 = null;
                        break;
                    }
                    if (jArr[i3] == iMo67722) {
                        enumM6095 = enumArr2[i3];
                        break;
                    }
                    i3++;
                }
            } else {
                long jMo6804 = abstractC3732.mo6804();
                if (jMo6804 == -3750763034362895579L) {
                    return null;
                }
                enumM6095 = m6095(jMo6804);
                if (enumM6095 == null) {
                    enumM6095 = m6095(abstractC3732.mo6666());
                }
                if (enumM6095 == null) {
                    String strMo6660 = abstractC3732.mo6660();
                    if (AbstractC3700.m6499(strMo6660) && (i = Integer.parseInt(strMo6660)) >= 0 && i < enumArr.length) {
                        enumM6095 = enumArr[i];
                    }
                }
            }
            if (enumM6095 == null && abstractC3732.m6726(JSONReader$Feature.ErrorOnEnumNotMatch)) {
                C1123.m1410(abstractC3732.mo6730("parse enum error, class " + cls.getName() + ", value " + abstractC3732.mo6660()));
                return null;
            }
            r3 = enumM6095;
        }
        if (r3 == null && abstractC3732.f9539 == i2) {
            m6094(type);
        }
        return r3;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Class mo6058() {
        return this.f8708;
    }

    @Override // com.alibaba.fastjson2.reader.InterfaceC3621
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final Object mo6027(AbstractC3732 abstractC3732, Type type, Object obj, long j) {
        Class cls;
        Enum enumM6095;
        int i = abstractC3732.f9539;
        int iMo6743 = abstractC3732.mo6743();
        Class cls2 = this.f8708;
        if (iMo6743 == -110) {
            InterfaceC3621 interfaceC3621Mo6724 = abstractC3732.mo6724(0L, j, cls2);
            cls = cls2;
            if (interfaceC3621Mo6724 != null) {
                if (interfaceC3621Mo6724 != this) {
                    return interfaceC3621Mo6724.mo6027(abstractC3732, type, obj, j);
                }
            } else if (abstractC3732.m6726(JSONReader$Feature.ErrorOnNotSupportAutoType)) {
                C1123.m1410(abstractC3732.mo6730("not support enumType : " + abstractC3732.mo6660()));
                return null;
            }
        } else {
            cls = cls2;
        }
        if (iMo6743 >= -16 && iMo6743 <= 72) {
            if (iMo6743 <= 47) {
                abstractC3732.mo6733();
            } else {
                iMo6743 = abstractC3732.mo6772();
            }
            if (iMo6743 >= 0) {
                Enum[] enumArr = this.f8713;
                if (iMo6743 < enumArr.length) {
                    enumM6095 = enumArr[iMo6743];
                }
            }
            C8376.m13325(iMo6743, cls.getCanonicalName(), ".", "No enum ordinal ");
            return null;
        }
        if (abstractC3732.mo6711()) {
            return null;
        }
        Enum enumM60952 = m6095(abstractC3732.mo6804());
        enumM6095 = enumM60952 == null ? m6095(abstractC3732.mo6666()) : enumM60952;
        if (enumM6095 == null && abstractC3732.f9539 == i) {
            m6094(type);
        }
        return enumM6095;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final Enum m6095(long j) {
        int iBinarySearch;
        Enum[] enumArr = this.f8707;
        if (enumArr != null && (iBinarySearch = Arrays.binarySearch(this.f8712, j)) >= 0) {
            return enumArr[iBinarySearch];
        }
        return null;
    }
}
