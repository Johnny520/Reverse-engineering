package bsh;

import androidx.activity.AbstractC0900;
import androidx.collection.C1115;
import bsh.This;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import p296.C9200;
import p299.C9207;
import p299.C9208;
import p299.C9210;
import p299.C9211;
import p299.C9212;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3482 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f8266;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Class f8267;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f8268;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f8269;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f8270;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f8271;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final Variable[] f8272;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final Class[] f8273;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final DelayedEvalBshMethod[] f8274;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final DelayedEvalBshMethod[] f8275;

    public C3482(Modifiers modifiers, String str, String str2, Class cls, Class[] clsArr, Variable[] variableArr, DelayedEvalBshMethod[] delayedEvalBshMethodArr, NameSpace nameSpace, ClassGenerator$Type classGenerator$Type) {
        this.f8271 = str;
        if (str2 != null) {
            this.f8269 = str2.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + "/" + str;
        } else {
            this.f8269 = str;
        }
        this.f8270 = "L" + this.f8269.replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/') + ";";
        Class cls2 = cls == null ? classGenerator$Type == ClassGenerator$Type.ENUM ? Enum.class : Object.class : cls;
        this.f8267 = cls2;
        this.f8266 = cls2.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
        this.f8273 = clsArr == null ? AbstractC3500.f8346 : clsArr;
        this.f8272 = variableArr;
        nameSpace.isInterface = classGenerator$Type == ClassGenerator$Type.INTERFACE;
        nameSpace.isEnum = classGenerator$Type == ClassGenerator$Type.ENUM;
        Map<String, NameSpace> map = This.contextStore;
        String string = UUID.randomUUID().toString();
        this.f8268 = string;
        map.put(string, nameSpace);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        String strM5952 = AbstractC3495.m5952(str);
        for (DelayedEvalBshMethod delayedEvalBshMethod : delayedEvalBshMethodArr) {
            if (delayedEvalBshMethod.getName().equals(strM5952)) {
                if (!delayedEvalBshMethod.modifiers.isAppliedContext(5)) {
                    delayedEvalBshMethod.modifiers.changeContext(5);
                }
                arrayList.add(delayedEvalBshMethod);
            } else {
                arrayList2.add(delayedEvalBshMethod);
            }
        }
        this.f8274 = (DelayedEvalBshMethod[]) arrayList.toArray(new DelayedEvalBshMethod[arrayList.size()]);
        this.f8275 = (DelayedEvalBshMethod[]) arrayList2.toArray(new DelayedEvalBshMethod[arrayList2.size()]);
        Interpreter.debug("Generate class ", classGenerator$Type, " ", this.f8269, " cons:", Integer.valueOf(arrayList.size()), " meths:", Integer.valueOf(arrayList2.size()), " vars:", Integer.valueOf(variableArr.length));
        if (classGenerator$Type == ClassGenerator$Type.INTERFACE && !modifiers.hasModifier("abstract")) {
            modifiers.addModifier("abstract");
        }
        if (classGenerator$Type != ClassGenerator$Type.ENUM || modifiers.hasModifier("static")) {
            return;
        }
        modifiers.addModifier("static");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static void m5905(String str, C9207 c9207) {
        if (str.equals("V")) {
            c9207.m14460(177);
        } else if (str.length() == 1) {
            c9207.m14460(str.equals("D") ? 175 : str.equals("F") ? 174 : str.equals("J") ? 173 : 172);
        } else {
            c9207.m14456(192, m5909(str));
            c9207.m14460(176);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static void m5906(String[] strArr, boolean z, C9207 c9207) {
        c9207.m14459(17, strArr.length);
        c9207.m14456(189, TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_INTERNAL_NAME);
        int i = !z ? 1 : 0;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            String str = strArr[i2];
            c9207.m14460(89);
            c9207.m14459(17, i2);
            if (str.length() == 1) {
                int i3 = str.equals("F") ? 23 : str.equals("D") ? 24 : str.equals("J") ? 22 : 21;
                c9207.m14456(187, "bsh/Primitive");
                c9207.m14460(89);
                c9207.m14458(i3, i);
                c9207.m14457(183, "bsh/Primitive", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, AbstractC0900.m711(new StringBuilder("("), str, ")V"));
                c9207.m14460(83);
            } else {
                c9207.m14458(25, i);
                C9208 c9208 = new C9208();
                c9207.m14463(199, c9208);
                c9207.m14452(178, "bsh/Primitive", "NULL", "Lbsh/Primitive;");
                c9207.m14460(83);
                C9208 c92082 = new C9208();
                c9207.m14463(167, c92082);
                c9207.m14464(c9208);
                c9207.m14458(25, i);
                c9207.m14460(83);
                c9207.m14464(c92082);
            }
            i += (str.equals("D") || str.equals("J")) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static void m5907(String str, String str2, int i, String str3, C9210 c9210) {
        C1115 c1115 = new C1115(c9210.f23535, i, str, str2, str3);
        if (c9210.f23538 == null) {
            c9210.f23538 = c1115;
        } else {
            c9210.f23542.f1308 = c1115;
        }
        c9210.f23542 = c1115;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static void m5908(int i, String str, String[] strArr, C9208 c9208, C9208[] c9208Arr, int i2, C9207 c9207) {
        c9207.m14464(c9208Arr[i]);
        c9207.m14458(25, 0);
        for (String str2 : strArr) {
            String str3 = str2.equals("Z") ? "getBoolean" : str2.equals("B") ? "getByte" : str2.equals("C") ? "getChar" : str2.equals("S") ? "getShort" : str2.equals("I") ? "getInt" : str2.equals("J") ? "getLong" : str2.equals("D") ? "getDouble" : str2.equals("F") ? "getFloat" : "getObject";
            c9207.m14458(25, i2);
            c9207.m14457(182, "bsh/This$ConstructorArgs", str3, "()".concat(str3.equals("getObject") ? TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR : str2));
            if (str3.equals("getObject")) {
                c9207.m14456(192, m5909(str2));
            }
        }
        c9207.m14457(183, str, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, m5910("V", strArr));
        c9207.m14463(167, c9208);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static String m5909(String str) {
        return (str.startsWith("[") || !str.startsWith("L")) ? str : AbstractC0900.m721(1, 1, str);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static String m5910(String str, String[] strArr) {
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
    public static int m5911(Modifiers modifiers) {
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
    public static void m5912(String str, String str2, C9207 c9207) {
        c9207.m14452(178, str, This.Keys.BSHSTATIC + str2, "Lbsh/This;");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5913(int i, String[] strArr, int i2, C9210 c9210) {
        int length = strArr.length + 1;
        int length2 = strArr.length + 2;
        C9207 c9207M14489 = c9210.m14489(i2, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, m5910("V", strArr));
        m5906(strArr, false, c9207M14489);
        c9207M14489.m14458(58, length);
        C9208 c9208 = new C9208();
        C9208 c92082 = new C9208();
        C9200 c9200 = C3493.f8305;
        Class cls = this.f8267;
        List listM5921 = ((C3489) c9200.m14429(cls)).m5921(cls.getName());
        int size = listM5921.size();
        DelayedEvalBshMethod[] delayedEvalBshMethodArr = this.f8274;
        int length3 = size + delayedEvalBshMethodArr.length;
        C9208[] c9208Arr = new C9208[length3];
        for (int i3 = 0; i3 < length3; i3++) {
            c9208Arr[i3] = new C9208();
        }
        String typeDescriptor = BSHType.getTypeDescriptor(cls);
        c9207M14489.m14461(C9212.m14500(0, typeDescriptor.length(), typeDescriptor));
        String str = this.f8269;
        String str2 = this.f8271;
        m5912(str, str2, c9207M14489);
        c9207M14489.m14458(25, length);
        c9207M14489.m14459(16, i);
        c9207M14489.m14457(184, "bsh/This", "getConstructorArgs", "(Ljava/lang/Class;Lbsh/This;[Ljava/lang/Object;I)Lbsh/This$ConstructorArgs;");
        c9207M14489.m14458(58, length2);
        c9207M14489.m14458(25, length2);
        c9207M14489.m14452(180, "bsh/This$ConstructorArgs", "selector", "I");
        C9211 c9211 = c9207M14489.f23507;
        c9207M14489.f23483 = c9211.f23544;
        c9211.m14493(170);
        c9211.m14492(null, (4 - (c9211.f23544 % 4)) % 4);
        boolean z = true;
        c9208.m14466(c9211, c9207M14489.f23483, true);
        c9211.m14499(0);
        c9211.m14499(length3 - 1);
        int i4 = 0;
        while (i4 < length3) {
            c9208Arr[i4].m14466(c9211, c9207M14489.f23483, z);
            i4++;
            z = true;
        }
        C9208 c92083 = c9207M14489.f23492;
        if (c92083 != null) {
            int i5 = c9207M14489.f23502;
            if (i5 == 4) {
                int i6 = 0;
                c92083.f23516.m14475(171, 0, null, null);
                c9207M14489.m14455(0, c9208);
                C9208 c9208M14468 = c9208.m14468();
                c9208M14468.f23515 = (short) (c9208M14468.f23515 | 2);
                int i7 = 0;
                while (i7 < length3) {
                    C9208 c92084 = c9208Arr[i7];
                    c9207M14489.m14455(i6, c92084);
                    C9208 c9208M144682 = c92084.m14468();
                    c9208M144682.f23515 = (short) (c9208M144682.f23515 | 2);
                    i7++;
                    i6 = 0;
                }
            } else if (i5 == 1) {
                int i8 = c9207M14489.f23491 - 1;
                c9207M14489.f23491 = i8;
                c9207M14489.m14455(i8, c9208);
                for (int i9 = 0; i9 < length3; i9++) {
                    c9207M14489.m14455(c9207M14489.f23491, c9208Arr[i9]);
                }
            }
            c9207M14489.m14454();
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < listM5921.size()) {
            m5908(i11, this.f8266, ((AbstractC3458) listM5921.get(i10)).m5871(), c92082, c9208Arr, length2, c9207M14489);
            i10++;
            i11++;
            str2 = str2;
        }
        String str3 = str2;
        int i12 = 0;
        while (i12 < delayedEvalBshMethodArr.length) {
            m5908(i11, this.f8269, delayedEvalBshMethodArr[i12].getParamTypeDescriptors(), c92082, c9208Arr, length2, c9207M14489);
            i12++;
            i11++;
        }
        c9207M14489.m14464(c9208);
        c9207M14489.m14458(25, 0);
        c9207M14489.m14457(183, this.f8266, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "()V");
        c9207M14489.m14464(c92082);
        c9207M14489.m14458(25, 0);
        c9207M14489.m14461(str3);
        c9207M14489.m14458(25, length);
        c9207M14489.m14457(184, "bsh/This", "initInstance", "(Lbsh/GeneratedClass;Ljava/lang/String;[Ljava/lang/Object;)V");
        c9207M14489.m14460(177);
        c9207M14489.m14462();
    }
}
