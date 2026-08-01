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
import p280.C8370;
import p283.C8377;
import p283.C8378;
import p283.C8380;
import p283.C8381;
import p283.C8382;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2648 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f7919;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Class f7920;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f7921;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f7922;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f7923;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f7924;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Variable[] f7925;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Class[] f7926;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final DelayedEvalBshMethod[] f7927;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final DelayedEvalBshMethod[] f7928;

    public C2648(Modifiers modifiers, String str, String str2, Class cls, Class[] clsArr, Variable[] variableArr, DelayedEvalBshMethod[] delayedEvalBshMethodArr, NameSpace nameSpace, ClassGenerator$Type classGenerator$Type) {
        this.f7924 = str;
        if (str2 != null) {
            this.f7922 = str2.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + "/" + str;
        } else {
            this.f7922 = str;
        }
        this.f7923 = "L" + this.f7922.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ";";
        Class cls2 = cls == null ? classGenerator$Type == ClassGenerator$Type.ENUM ? Enum.class : Object.class : cls;
        this.f7920 = cls2;
        this.f7919 = cls2.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        this.f7926 = clsArr == null ? AbstractC2666.f7999 : clsArr;
        this.f7925 = variableArr;
        nameSpace.isInterface = classGenerator$Type == ClassGenerator$Type.INTERFACE;
        nameSpace.isEnum = classGenerator$Type == ClassGenerator$Type.ENUM;
        Map<String, NameSpace> map = This.contextStore;
        String string = UUID.randomUUID().toString();
        this.f7921 = string;
        map.put(string, nameSpace);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM5347 = AbstractC2661.m5347(str);
        for (DelayedEvalBshMethod delayedEvalBshMethod : delayedEvalBshMethodArr) {
            if (delayedEvalBshMethod.getName().equals(strM5347)) {
                if (!delayedEvalBshMethod.modifiers.isAppliedContext(5)) {
                    delayedEvalBshMethod.modifiers.changeContext(5);
                }
                arrayList.add(delayedEvalBshMethod);
            } else {
                arrayList2.add(delayedEvalBshMethod);
            }
        }
        this.f7927 = (DelayedEvalBshMethod[]) arrayList.toArray(new DelayedEvalBshMethod[arrayList.size()]);
        this.f7928 = (DelayedEvalBshMethod[]) arrayList2.toArray(new DelayedEvalBshMethod[arrayList2.size()]);
        Interpreter.debug("Generate class ", classGenerator$Type, " ", this.f7922, " cons:", Integer.valueOf(arrayList.size()), " meths:", Integer.valueOf(arrayList2.size()), " vars:", Integer.valueOf(variableArr.length));
        if (classGenerator$Type == ClassGenerator$Type.INTERFACE && !modifiers.hasModifier("abstract")) {
            modifiers.addModifier("abstract");
        }
        if (classGenerator$Type != ClassGenerator$Type.ENUM || modifiers.hasModifier("static")) {
            return;
        }
        modifiers.addModifier("static");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m5300(String str, C8377 c8377) {
        if (str.equals("V")) {
            c8377.m13884(177);
        } else if (str.length() == 1) {
            c8377.m13884(str.equals("D") ? 175 : str.equals("F") ? 174 : str.equals("J") ? 173 : 172);
        } else {
            c8377.m13880(192, m5304(str));
            c8377.m13884(176);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m5301(String[] strArr, boolean z, C8377 c8377) {
        c8377.m13883(17, strArr.length);
        c8377.m13880(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
        int i = !z ? 1 : 0;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            c8377.m13884(89);
            c8377.m13883(17, i2);
            if (str.length() == 1) {
                int i3 = str.equals("F") ? 23 : str.equals("D") ? 24 : str.equals("J") ? 22 : 21;
                c8377.m13880(187, "bsh/Primitive");
                c8377.m13884(89);
                c8377.m13882(i3, i);
                c8377.m13881(183, "bsh/Primitive", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, AbstractC0053.m146(new StringBuilder("("), str, ")V"));
                c8377.m13884(83);
            } else {
                c8377.m13882(25, i);
                C8378 c8378 = new C8378();
                c8377.m13887(199, c8378);
                c8377.m13876(178, "bsh/Primitive", "NULL", "Lbsh/Primitive;");
                c8377.m13884(83);
                C8378 c83782 = new C8378();
                c8377.m13887(167, c83782);
                c8377.m13888(c8378);
                c8377.m13882(25, i);
                c8377.m13884(83);
                c8377.m13888(c83782);
            }
            i += (str.equals("D") || str.equals("J")) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m5302(String str, String str2, int i, String str3, C8380 c8380) {
        C0268 c0268 = new C0268(c8380.f23191, i, str, str2, str3);
        if (c8380.f23194 == null) {
            c8380.f23194 = c0268;
        } else {
            c8380.f23198.f963 = c0268;
        }
        c8380.f23198 = c0268;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m5303(int i, String str, String[] strArr, C8378 c8378, C8378[] c8378Arr, int i2, C8377 c8377) {
        c8377.m13888(c8378Arr[i]);
        c8377.m13882(25, 0);
        for (String str2 : strArr) {
            String str3 = str2.equals("Z") ? "getBoolean" : str2.equals("B") ? "getByte" : str2.equals("C") ? "getChar" : str2.equals("S") ? "getShort" : str2.equals("I") ? "getInt" : str2.equals("J") ? "getLong" : str2.equals("D") ? "getDouble" : str2.equals("F") ? "getFloat" : "getObject";
            c8377.m13882(25, i2);
            c8377.m13881(182, "bsh/This$ConstructorArgs", str3, "()".concat(str3.equals("getObject") ? TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR : str2));
            if (str3.equals("getObject")) {
                c8377.m13880(192, m5304(str2));
            }
        }
        c8377.m13881(183, str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, m5305("V", strArr));
        c8377.m13887(167, c8378);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m5304(String str) {
        return (str.startsWith("[") || !str.startsWith("L")) ? str : AbstractC0053.m160(1, 1, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static String m5305(String str, String[] strArr) {
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
    public static int m5306(Modifiers modifiers) {
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
    public static void m5307(String str, String str2, C8377 c8377) {
        c8377.m13876(178, str, This.Keys.BSHSTATIC + str2, "Lbsh/This;");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5308(int i, String[] strArr, int i2, C8380 c8380) {
        int length = strArr.length + 1;
        int length2 = strArr.length + 2;
        C8377 c8377M13913 = c8380.m13913(i2, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, m5305("V", strArr));
        m5301(strArr, false, c8377M13913);
        c8377M13913.m13882(58, length);
        C8378 c8378 = new C8378();
        C8378 c83782 = new C8378();
        C8370 c8370 = C2659.f7958;
        Class cls = this.f7920;
        List listM5316 = ((C2655) c8370.m13853(cls)).m5316(cls.getName());
        int size = listM5316.size();
        DelayedEvalBshMethod[] delayedEvalBshMethodArr = this.f7927;
        int length3 = size + delayedEvalBshMethodArr.length;
        C8378[] c8378Arr = new C8378[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            c8378Arr[i3] = new C8378();
        }
        String typeDescriptor = BSHType.getTypeDescriptor(cls);
        c8377M13913.m13885(C8382.m13924(0, typeDescriptor.length(), typeDescriptor));
        String str = this.f7922;
        String str2 = this.f7924;
        m5307(str, str2, c8377M13913);
        c8377M13913.m13882(25, length);
        c8377M13913.m13883(16, i);
        c8377M13913.m13881(184, "bsh/This", "getConstructorArgs", "(Ljava/lang/Class;Lbsh/This;[Ljava/lang/Object;I)Lbsh/This$ConstructorArgs;");
        c8377M13913.m13882(58, length2);
        c8377M13913.m13882(25, length2);
        c8377M13913.m13876(180, "bsh/This$ConstructorArgs", "selector", "I");
        C8381 c8381 = c8377M13913.f23163;
        c8377M13913.f23139 = c8381.f23200;
        c8381.m13917(170);
        c8381.m13916(null, (4 - (c8381.f23200 % 4)) % 4);
        boolean z = true;
        c8378.m13890(c8381, c8377M13913.f23139, true);
        c8381.m13923(0);
        c8381.m13923(length3 - 1);
        int i4 = 0;
        while (i4 < length3) {
            c8378Arr[i4].m13890(c8381, c8377M13913.f23139, z);
            i4++;
            z = true;
        }
        C8378 c83783 = c8377M13913.f23148;
        if (c83783 != null) {
            int i5 = c8377M13913.f23158;
            if (i5 == 4) {
                int i6 = 0;
                c83783.f23172.m13899(171, 0, null, null);
                c8377M13913.m13879(0, c8378);
                C8378 c8378M13892 = c8378.m13892();
                c8378M13892.f23171 = (short) (c8378M13892.f23171 | 2);
                int i7 = 0;
                while (i7 < length3) {
                    C8378 c83784 = c8378Arr[i7];
                    c8377M13913.m13879(i6, c83784);
                    C8378 c8378M138922 = c83784.m13892();
                    c8378M138922.f23171 = (short) (c8378M138922.f23171 | 2);
                    i7++;
                    i6 = 0;
                }
            } else if (i5 == 1) {
                int i8 = c8377M13913.f23147 - 1;
                c8377M13913.f23147 = i8;
                c8377M13913.m13879(i8, c8378);
                for (int i9 = 0; i9 < length3; i9++) {
                    c8377M13913.m13879(c8377M13913.f23147, c8378Arr[i9]);
                }
            }
            c8377M13913.m13878();
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < listM5316.size()) {
            m5303(i11, this.f7919, ((AbstractC2624) listM5316.get(i10)).m5266(), c83782, c8378Arr, length2, c8377M13913);
            i10++;
            i11++;
            str2 = str2;
        }
        String str3 = str2;
        int i12 = 0;
        while (i12 < delayedEvalBshMethodArr.length) {
            m5303(i11, this.f7922, delayedEvalBshMethodArr[i12].getParamTypeDescriptors(), c83782, c8378Arr, length2, c8377M13913);
            i12++;
            i11++;
        }
        c8377M13913.m13888(c8378);
        c8377M13913.m13882(25, 0);
        c8377M13913.m13881(183, this.f7919, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
        c8377M13913.m13888(c83782);
        c8377M13913.m13882(25, 0);
        c8377M13913.m13885(str3);
        c8377M13913.m13882(25, length);
        c8377M13913.m13881(184, "bsh/This", "initInstance", "(Lbsh/GeneratedClass;Ljava/lang/String;[Ljava/lang/Object;)V");
        c8377M13913.m13884(177);
        c8377M13913.m13886();
    }
}
