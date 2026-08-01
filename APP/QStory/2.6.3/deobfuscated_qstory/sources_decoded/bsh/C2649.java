package bsh;

import androidx.activity.AbstractC0053;
import androidx.collection.C0268;
import bsh.This;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import p280.C8371;
import p283.C8378;
import p283.C8379;
import p283.C8381;
import p283.C8382;
import p283.C8383;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2649 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f7921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Class f7922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f7923;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f7924;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f7925;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f7926;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Variable[] f7927;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Class[] f7928;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final DelayedEvalBshMethod[] f7929;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final DelayedEvalBshMethod[] f7930;

    public C2649(Modifiers modifiers, String str, String str2, Class cls, Class[] clsArr, Variable[] variableArr, DelayedEvalBshMethod[] delayedEvalBshMethodArr, NameSpace nameSpace, ClassGenerator$Type classGenerator$Type) {
        this.f7926 = str;
        if (str2 != null) {
            this.f7924 = str2.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + "/" + str;
        } else {
            this.f7924 = str;
        }
        this.f7925 = "L" + this.f7924.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ";";
        Class cls2 = cls == null ? classGenerator$Type == ClassGenerator$Type.ENUM ? Enum.class : Object.class : cls;
        this.f7922 = cls2;
        this.f7921 = cls2.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        this.f7928 = clsArr == null ? AbstractC2667.f8001 : clsArr;
        this.f7927 = variableArr;
        nameSpace.isInterface = classGenerator$Type == ClassGenerator$Type.INTERFACE;
        nameSpace.isEnum = classGenerator$Type == ClassGenerator$Type.ENUM;
        Map<String, NameSpace> map = This.contextStore;
        String string = UUID.randomUUID().toString();
        this.f7923 = string;
        map.put(string, nameSpace);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM5392 = AbstractC2662.m5392(str);
        for (DelayedEvalBshMethod delayedEvalBshMethod : delayedEvalBshMethodArr) {
            if (delayedEvalBshMethod.getName().equals(strM5392)) {
                if (!delayedEvalBshMethod.modifiers.isAppliedContext(5)) {
                    delayedEvalBshMethod.modifiers.changeContext(5);
                }
                arrayList.add(delayedEvalBshMethod);
            } else {
                arrayList2.add(delayedEvalBshMethod);
            }
        }
        this.f7929 = (DelayedEvalBshMethod[]) arrayList.toArray(new DelayedEvalBshMethod[arrayList.size()]);
        this.f7930 = (DelayedEvalBshMethod[]) arrayList2.toArray(new DelayedEvalBshMethod[arrayList2.size()]);
        Interpreter.debug("Generate class ", classGenerator$Type, " ", this.f7924, " cons:", Integer.valueOf(arrayList.size()), " meths:", Integer.valueOf(arrayList2.size()), " vars:", Integer.valueOf(variableArr.length));
        if (classGenerator$Type == ClassGenerator$Type.INTERFACE && !modifiers.hasModifier("abstract")) {
            modifiers.addModifier("abstract");
        }
        if (classGenerator$Type != ClassGenerator$Type.ENUM || modifiers.hasModifier("static")) {
            return;
        }
        modifiers.addModifier("static");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m5345(String str, C8378 c8378) {
        if (str.equals("V")) {
            c8378.m13901(177);
        } else if (str.length() == 1) {
            c8378.m13901(str.equals("D") ? 175 : str.equals("F") ? 174 : str.equals("J") ? 173 : 172);
        } else {
            c8378.m13897(192, m5349(str));
            c8378.m13901(176);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m5346(String[] strArr, boolean z, C8378 c8378) {
        c8378.m13900(17, strArr.length);
        c8378.m13897(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
        int i = !z ? 1 : 0;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            c8378.m13901(89);
            c8378.m13900(17, i2);
            if (str.length() == 1) {
                int i3 = str.equals("F") ? 23 : str.equals("D") ? 24 : str.equals("J") ? 22 : 21;
                c8378.m13897(187, "bsh/Primitive");
                c8378.m13901(89);
                c8378.m13899(i3, i);
                c8378.m13898(183, "bsh/Primitive", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, AbstractC0053.m151(new StringBuilder("("), str, ")V"));
                c8378.m13901(83);
            } else {
                c8378.m13899(25, i);
                C8379 c8379 = new C8379();
                c8378.m13904(199, c8379);
                c8378.m13893(178, "bsh/Primitive", "NULL", "Lbsh/Primitive;");
                c8378.m13901(83);
                C8379 c83792 = new C8379();
                c8378.m13904(167, c83792);
                c8378.m13905(c8379);
                c8378.m13899(25, i);
                c8378.m13901(83);
                c8378.m13905(c83792);
            }
            i += (str.equals("D") || str.equals("J")) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m5347(String str, String str2, int i, String str3, C8381 c8381) {
        C0268 c0268 = new C0268(c8381.f23190, i, str, str2, str3);
        if (c8381.f23193 == null) {
            c8381.f23193 = c0268;
        } else {
            c8381.f23197.f963 = c0268;
        }
        c8381.f23197 = c0268;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m5348(int i, String str, String[] strArr, C8379 c8379, C8379[] c8379Arr, int i2, C8378 c8378) {
        c8378.m13905(c8379Arr[i]);
        c8378.m13899(25, 0);
        for (String str2 : strArr) {
            String str3 = str2.equals("Z") ? "getBoolean" : str2.equals("B") ? "getByte" : str2.equals("C") ? "getChar" : str2.equals("S") ? "getShort" : str2.equals("I") ? "getInt" : str2.equals("J") ? "getLong" : str2.equals("D") ? "getDouble" : str2.equals("F") ? "getFloat" : "getObject";
            c8378.m13899(25, i2);
            c8378.m13898(182, "bsh/This$ConstructorArgs", str3, "()".concat(str3.equals("getObject") ? TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR : str2));
            if (str3.equals("getObject")) {
                c8378.m13897(192, m5349(str2));
            }
        }
        c8378.m13898(183, str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, m5350("V", strArr));
        c8378.m13904(167, c8379);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m5349(String str) {
        return (str.startsWith("[") || !str.startsWith("L")) ? str : AbstractC0053.m161(1, 1, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static String m5350(String str, String[] strArr) {
        StringBuilder sb = new StringBuilder("(");
        for (String str2 : strArr) {
            sb.append(str2);
        }
        sb.append(')');
        sb.append(str);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static int m5351(Modifiers modifiers) {
        boolean zHasModifier = modifiers.hasModifier(1);
        ?? r1 = zHasModifier;
        if (modifiers.hasModifier(2)) {
            r1 = (zHasModifier ? 1 : 0) | 2;
        }
        ?? r12 = r1;
        if (modifiers.hasModifier(4)) {
            r12 = (r1 == true ? 1 : 0) | 4;
        }
        ?? r13 = r12;
        if (modifiers.hasModifier(8)) {
            r13 = (r12 == true ? 1 : 0) | 8;
        }
        ?? r14 = r13;
        if (modifiers.hasModifier(32)) {
            r14 = (r13 == true ? 1 : 0) | 32;
        }
        ?? r15 = r14;
        if (modifiers.hasModifier(1024)) {
            r15 = (r14 == true ? 1 : 0) | 1024;
        }
        if ((modifiers.getModifiers() & 7) != 0) {
            return r15;
        }
        int i = r15 | 1;
        modifiers.addModifier(1);
        return i;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static void m5352(String str, String str2, C8378 c8378) {
        c8378.m13893(178, str, This.Keys.BSHSTATIC + str2, "Lbsh/This;");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5353(int i, String[] strArr, int i2, C8381 c8381) {
        int length = strArr.length + 1;
        int length2 = strArr.length + 2;
        C8378 c8378M13930 = c8381.m13930(i2, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, m5350("V", strArr));
        m5346(strArr, false, c8378M13930);
        c8378M13930.m13899(58, length);
        C8379 c8379 = new C8379();
        C8379 c83792 = new C8379();
        C8371 c8371 = C2660.f7960;
        Class cls = this.f7922;
        List listM5361 = ((C2656) c8371.m13870(cls)).m5361(cls.getName());
        int size = listM5361.size();
        DelayedEvalBshMethod[] delayedEvalBshMethodArr = this.f7929;
        int length3 = size + delayedEvalBshMethodArr.length;
        C8379[] c8379Arr = new C8379[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            c8379Arr[i3] = new C8379();
        }
        String typeDescriptor = BSHType.getTypeDescriptor(cls);
        c8378M13930.m13902(C8383.m13941(0, typeDescriptor.length(), typeDescriptor));
        String str = this.f7924;
        String str2 = this.f7926;
        m5352(str, str2, c8378M13930);
        c8378M13930.m13899(25, length);
        c8378M13930.m13900(16, i);
        c8378M13930.m13898(184, "bsh/This", "getConstructorArgs", "(Ljava/lang/Class;Lbsh/This;[Ljava/lang/Object;I)Lbsh/This$ConstructorArgs;");
        c8378M13930.m13899(58, length2);
        c8378M13930.m13899(25, length2);
        c8378M13930.m13893(180, "bsh/This$ConstructorArgs", "selector", "I");
        C8382 c8382 = c8378M13930.f23162;
        c8378M13930.f23138 = c8382.f23199;
        c8382.m13934(170);
        c8382.m13933(null, (4 - (c8382.f23199 % 4)) % 4);
        boolean z = true;
        c8379.m13907(c8382, c8378M13930.f23138, true);
        c8382.m13940(0);
        c8382.m13940(length3 - 1);
        int i4 = 0;
        while (i4 < length3) {
            c8379Arr[i4].m13907(c8382, c8378M13930.f23138, z);
            i4++;
            z = true;
        }
        C8379 c83793 = c8378M13930.f23147;
        if (c83793 != null) {
            int i5 = c8378M13930.f23157;
            if (i5 == 4) {
                int i6 = 0;
                c83793.f23171.m13916(171, 0, null, null);
                c8378M13930.m13896(0, c8379);
                C8379 c8379M13909 = c8379.m13909();
                c8379M13909.f23170 = (short) (c8379M13909.f23170 | 2);
                int i7 = 0;
                while (i7 < length3) {
                    C8379 c83794 = c8379Arr[i7];
                    c8378M13930.m13896(i6, c83794);
                    C8379 c8379M139092 = c83794.m13909();
                    c8379M139092.f23170 = (short) (c8379M139092.f23170 | 2);
                    i7++;
                    i6 = 0;
                }
            } else if (i5 == 1) {
                int i8 = c8378M13930.f23146 - 1;
                c8378M13930.f23146 = i8;
                c8378M13930.m13896(i8, c8379);
                for (int i9 = 0; i9 < length3; i9++) {
                    c8378M13930.m13896(c8378M13930.f23146, c8379Arr[i9]);
                }
            }
            c8378M13930.m13895();
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < listM5361.size()) {
            m5348(i11, this.f7921, ((AbstractC2625) listM5361.get(i10)).m5311(), c83792, c8379Arr, length2, c8378M13930);
            i10++;
            i11++;
            str2 = str2;
        }
        String str3 = str2;
        int i12 = 0;
        while (i12 < delayedEvalBshMethodArr.length) {
            m5348(i11, this.f7924, delayedEvalBshMethodArr[i12].getParamTypeDescriptors(), c83792, c8379Arr, length2, c8378M13930);
            i12++;
            i11++;
        }
        c8378M13930.m13905(c8379);
        c8378M13930.m13899(25, 0);
        c8378M13930.m13898(183, this.f7921, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
        c8378M13930.m13905(c83792);
        c8378M13930.m13899(25, 0);
        c8378M13930.m13902(str3);
        c8378M13930.m13899(25, length);
        c8378M13930.m13898(184, "bsh/This", "initInstance", "(Lbsh/GeneratedClass;Ljava/lang/String;[Ljava/lang/Object;)V");
        c8378M13930.m13901(177);
        c8378M13930.m13903();
    }
}
