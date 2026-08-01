package bsh;

import androidx.activity.AbstractC0900;
import androidx.compose.p001ui.graphics.vector.C2397;
import bsh.This;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Map;
import net.bytebuddy.description.method.MethodDescription;
import net.bytebuddy.dynamic.ClassFileLocator;
import net.bytebuddy.implementation.auxiliary.TypeProxy;
import net.bytebuddy.pool.TypePool;
import p299.C9207;
import p299.C9210;
import p299.C9212;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3486 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3486 f8289;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Class m5919(String str, Modifiers modifiers, Class[] clsArr, Class cls, BSHBlock bSHBlock, ClassGenerator$Type classGenerator$Type, CallStack callStack, Interpreter interpreter) {
        NameSpace nameSpace;
        int i;
        String str2;
        C3493 c3493;
        DelayedEvalBshMethod[] delayedEvalBshMethodArr;
        C3482 c3482;
        ClassGenerator$Type classGenerator$Type2;
        String str3;
        Variable[] variableArr;
        String saveClassesDir;
        DelayedEvalBshMethod[] delayedEvalBshMethodArr2;
        int i2;
        int i3;
        String str4;
        String str5;
        String str6;
        Method method;
        String str7;
        C9210 c9210;
        String str8;
        C3482 c34822;
        Variable[] variableArr2;
        int i4;
        int i5;
        int i6;
        String str9;
        int i7;
        String str10;
        String str11;
        C3493 c34932;
        NameSpace nameSpace2;
        NameSpace nameSpace3;
        ArrayList arrayList;
        C3493 c34933;
        NameSpace nameSpace4;
        BSHBlock bSHBlock2 = bSHBlock;
        NameSpace pVar = callStack.top();
        String str12 = pVar.getPackage();
        String str13 = pVar.isClass ? pVar.getName() + "$" + str : str;
        String str14 = str12 == null ? str13 : str12 + "." + str13;
        C3493 classManager = interpreter.getClassManager();
        NameSpace nameSpace5 = new NameSpace(pVar, str13);
        nameSpace5.isClass = true;
        callStack.push(nameSpace5);
        bSHBlock2.evalBlock(callStack, interpreter, Boolean.TRUE, C3485.f8286);
        ArrayList arrayList2 = new ArrayList();
        int i8 = 0;
        while (i8 < bSHBlock2.jjtGetNumChildren()) {
            InterfaceC3452 interfaceC3452JjtGetChild = bSHBlock2.jjtGetChild(i8);
            if (interfaceC3452JjtGetChild instanceof BSHEnumConstant) {
                BSHEnumConstant bSHEnumConstant = (BSHEnumConstant) interfaceC3452JjtGetChild;
                try {
                    arrayList2.add(new Variable(bSHEnumConstant.getName(), bSHEnumConstant.getType(), (Object) null, bSHEnumConstant.mods));
                } catch (UtilEvalError unused) {
                }
            } else if (interfaceC3452JjtGetChild instanceof BSHTypedVariableDeclaration) {
                BSHTypedVariableDeclaration bSHTypedVariableDeclaration = (BSHTypedVariableDeclaration) interfaceC3452JjtGetChild;
                Modifiers modifiers2 = bSHTypedVariableDeclaration.modifiers;
                BSHVariableDeclarator[] declarators = bSHTypedVariableDeclaration.getDeclarators();
                int length = declarators.length;
                int i9 = 0;
                while (i9 < length) {
                    String str15 = str13;
                    String str16 = str14;
                    try {
                        c34933 = classManager;
                        try {
                            nameSpace4 = nameSpace5;
                            try {
                                arrayList2.add(new Variable(declarators[i9].name, bSHTypedVariableDeclaration.evalType(callStack, interpreter), (Object) null, modifiers2));
                            } catch (EvalError | UtilEvalError unused2) {
                            }
                        } catch (EvalError | UtilEvalError unused3) {
                            nameSpace4 = nameSpace5;
                        }
                    } catch (EvalError | UtilEvalError unused4) {
                        c34933 = classManager;
                    }
                    i9++;
                    str13 = str15;
                    str14 = str16;
                    classManager = c34933;
                    nameSpace5 = nameSpace4;
                }
            }
            i8++;
            str13 = str13;
            str14 = str14;
            classManager = classManager;
            nameSpace5 = nameSpace5;
        }
        String str17 = str13;
        String str18 = str14;
        C3493 c34934 = classManager;
        NameSpace nameSpace6 = nameSpace5;
        Object obj = null;
        Variable[] variableArr3 = (Variable[]) arrayList2.toArray(new Variable[arrayList2.size()]);
        ArrayList arrayList3 = new ArrayList();
        byte b = -1;
        if (callStack.top().getName().indexOf("$anon") > -1) {
            String strM5952 = AbstractC3495.m5952(callStack.top().getName());
            arrayList3.add(new DelayedEvalBshMethod(strM5952, ((C3489) C3493.f8305.m14429(cls)).m5923(cls.getName(), AbstractC3495.m5956(This.CONTEXT_ARGS.get().get(strM5952))), callStack.top()));
        }
        int i10 = 0;
        while (i10 < bSHBlock2.jjtGetNumChildren()) {
            InterfaceC3452 interfaceC3452JjtGetChild2 = bSHBlock2.jjtGetChild(i10);
            if (interfaceC3452JjtGetChild2 instanceof BSHMethodDeclaration) {
                BSHMethodDeclaration bSHMethodDeclaration = (BSHMethodDeclaration) interfaceC3452JjtGetChild2;
                bSHMethodDeclaration.insureNodesParsed();
                Modifiers modifiers3 = bSHMethodDeclaration.modifiers;
                int i11 = i10;
                String str19 = bSHMethodDeclaration.name;
                String returnTypeDescriptor = bSHMethodDeclaration.getReturnTypeDescriptor(callStack, interpreter, str12);
                BSHReturnType returnTypeNode = bSHMethodDeclaration.getReturnTypeNode();
                BSHFormalParameters bSHFormalParameters = bSHMethodDeclaration.paramsNode;
                String[] typeDescriptors = bSHFormalParameters.getTypeDescriptors(callStack, interpreter, str12);
                i7 = i11;
                str10 = str12;
                str11 = str18;
                c34932 = c34934;
                nameSpace2 = nameSpace6;
                nameSpace3 = pVar;
                arrayList = arrayList3;
                DelayedEvalBshMethod delayedEvalBshMethod = new DelayedEvalBshMethod(str19, returnTypeDescriptor, returnTypeNode, bSHMethodDeclaration.paramsNode.getParamNames(), typeDescriptors, bSHFormalParameters, bSHMethodDeclaration.blockNode, null, modifiers3, bSHMethodDeclaration.isVarArgs, callStack, interpreter);
                boolean z = bSHMethodDeclaration.isExtension;
                delayedEvalBshMethod.isExtension = z;
                if (z) {
                    delayedEvalBshMethod.receiverType = bSHMethodDeclaration.evalReceiverType(callStack, interpreter);
                }
                arrayList.add(delayedEvalBshMethod);
            } else {
                i7 = i10;
                str10 = str12;
                str11 = str18;
                c34932 = c34934;
                nameSpace2 = nameSpace6;
                nameSpace3 = pVar;
                arrayList = arrayList3;
            }
            i10 = i7 + 1;
            bSHBlock2 = bSHBlock;
            arrayList3 = arrayList;
            nameSpace6 = nameSpace2;
            pVar = nameSpace3;
            str12 = str10;
            str18 = str11;
            c34934 = c34932;
            b = -1;
            obj = null;
        }
        String str20 = str12;
        String str21 = str18;
        C3493 c34935 = c34934;
        NameSpace nameSpace7 = nameSpace6;
        NameSpace nameSpace8 = pVar;
        ArrayList arrayList4 = arrayList3;
        DelayedEvalBshMethod[] delayedEvalBshMethodArr3 = (DelayedEvalBshMethod[]) arrayList4.toArray(new DelayedEvalBshMethod[arrayList4.size()]);
        callStack.pop();
        nameSpace7.getThis(interpreter);
        ClassGenerator$Type classGenerator$Type3 = classGenerator$Type;
        C3482 c34823 = new C3482(modifiers, str17, str20, cls, clsArr, variableArr3, delayedEvalBshMethodArr3, nameSpace7, classGenerator$Type3);
        DelayedEvalBshMethod[] delayedEvalBshMethodArr4 = c34823.f8274;
        try {
            nameSpace7.setLocalVariable("" + This.Keys.BSHCLASSMODIFIERS, modifiers, false);
            nameSpace7.setLocalVariable("" + This.Keys.BSHCONSTRUCTORS, delayedEvalBshMethodArr4, false);
            nameSpace7.setLocalVariable("" + This.Keys.BSHINIT, bSHBlock, false);
            C3493 c34936 = c34935;
            String str22 = str21;
            Class clsMo5700 = (Class) c34936.f8312.get(str22);
            char c = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            if (clsMo5700 == null) {
                Map<String, NameSpace> map = This.contextStore;
                String str23 = c34823.f8268;
                NameSpace nameSpace9 = map.get(str23);
                int iM5911 = C3482.m5911(modifiers);
                if (classGenerator$Type3 == ClassGenerator$Type.INTERFACE) {
                    i = iM5911 | 1537;
                } else if (classGenerator$Type3 == ClassGenerator$Type.ENUM) {
                    i = iM5911 | 16433;
                } else {
                    i = iM5911 | 33;
                    if ((i & 1024) > 0) {
                        i -= 1024;
                    }
                }
                int i12 = i;
                Class[] clsArr2 = c34823.f8273;
                String[] strArr = new String[clsArr2.length + 1];
                int i13 = 0;
                while (i13 < clsArr2.length) {
                    strArr[i13] = clsArr2[i13].getName().replace(c, '/');
                    if (AbstractC3500.m5992(clsArr2[i13])) {
                        Variable[] variableArrM6008 = AbstractC3500.m6008(AbstractC3500.m6005(clsArr2[i13]));
                        int length2 = variableArrM6008.length;
                        int i14 = 0;
                        while (i14 < length2) {
                            Variable[] variableArr4 = variableArrM6008;
                            nameSpace9.setVariableImpl(variableArr4[i14]);
                            i14++;
                            variableArrM6008 = variableArr4;
                        }
                    }
                    i13++;
                    c = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
                }
                strArr[clsArr2.length] = GeneratedClass.class.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
                C9210 c92102 = new C9210();
                ClassGenerator$Type classGenerator$Type4 = ClassGenerator$Type.ENUM;
                String str24 = c34823.f8270;
                c92102.m14490(i12, c34823.f8269, classGenerator$Type3 == classGenerator$Type4 ? AbstractC0900.m718("Ljava/lang/Enum<", str24, ">;") : null, c34823.f8266, strArr);
                C9210 c92103 = c92102;
                if (classGenerator$Type3 != ClassGenerator$Type.INTERFACE) {
                    str2 = null;
                    C3482.m5907(This.Keys.BSHTHIS + str17, "Lbsh/This;", 1, null, c92103);
                } else {
                    str2 = null;
                }
                C3482.m5907(This.Keys.BSHSTATIC + str17, "Lbsh/This;", 25, str2, c92103);
                C3482.m5907("UUID", "Ljava/lang/String;", 25, str23, c92103);
                Variable[] variableArr5 = c34823.f8272;
                int length3 = variableArr5.length;
                nameSpace = nameSpace7;
                int i15 = 0;
                while (true) {
                    c3493 = c34936;
                    if (i15 >= length3) {
                        break;
                    }
                    int i16 = i15;
                    Variable variable = variableArr5[i16];
                    if (variable.hasModifier("private")) {
                        i5 = length3;
                    } else {
                        String typeDescriptor = variable.getTypeDescriptor();
                        int iM59112 = C3482.m5911(variable.getModifiers());
                        i5 = length3;
                        if (classGenerator$Type3 == ClassGenerator$Type.INTERFACE) {
                            variable.setConstant();
                            nameSpace9.setVariableImpl(variable);
                        } else {
                            if (classGenerator$Type3 == ClassGenerator$Type.ENUM && variable.hasModifier("enum")) {
                                i6 = iM59112 | 16400;
                                str9 = str24;
                            } else {
                                i6 = iM59112;
                                str9 = typeDescriptor;
                            }
                            C3482.m5907(variable.getName(), str9, i6, null, c92103);
                        }
                    }
                    i15 = i16 + 1;
                    c34936 = c3493;
                    length3 = i5;
                }
                ClassGenerator$Type classGenerator$Type5 = ClassGenerator$Type.ENUM;
                String str25 = "private";
                String str26 = c34823.f8269;
                if (classGenerator$Type3 == classGenerator$Type5) {
                    c3482 = c34823;
                    delayedEvalBshMethodArr = delayedEvalBshMethodArr4;
                    str3 = "enum";
                    C9207 c9207M14489 = c92103.m14489(9, "values", "()[" + str24);
                    C3482.m5912(str26, str17, c9207M14489);
                    variableArr = variableArr5;
                    c9207M14489.m14457(182, "bsh/This", "enumValues", "()[Ljava/lang/Object;");
                    C3482.m5905("[" + str24, c9207M14489);
                    c9207M14489.m14462();
                    C9207 c9207M144892 = c92103.m14489(9, "valueOf", "(Ljava/lang/String;)" + str24);
                    c9207M144892.m14461(C9212.m14500(0, str24.length(), str24));
                    c9207M144892.m14458(25, 0);
                    classGenerator$Type2 = classGenerator$Type5;
                    c9207M144892.m14457(184, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;");
                    C3482.m5905(str24, c9207M144892);
                    c9207M144892.m14462();
                    C9207 c9207M144893 = c92103.m14489(2, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V");
                    c9207M144893.m14458(25, 0);
                    c9207M144893.m14458(25, 1);
                    c9207M144893.m14458(21, 2);
                    c9207M144893.m14457(183, "java/lang/Enum", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V");
                    c9207M144893.m14458(25, 0);
                    c9207M144893.m14461(str17);
                    C3482.m5906(new String[0], false, c9207M144893);
                    c9207M144893.m14457(184, "bsh/This", "initInstance", "(Lbsh/GeneratedClass;Ljava/lang/String;[Ljava/lang/Object;)V");
                    c9207M144893.m14460(177);
                    c9207M144893.m14462();
                } else {
                    delayedEvalBshMethodArr = delayedEvalBshMethodArr4;
                    c3482 = c34823;
                    classGenerator$Type2 = classGenerator$Type5;
                    str3 = "enum";
                    variableArr = variableArr5;
                }
                C9207 c9207M144894 = c92103.m14489(8, MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME, "()V");
                c9207M144894.m14452(178, str26, "UUID", "Ljava/lang/String;");
                c9207M144894.m14457(184, "bsh/This", "pullBshStatic", "(Ljava/lang/String;)Lbsh/This;");
                c9207M144894.m14452(179, str26, This.Keys.BSHSTATIC + str17, "Lbsh/This;");
                if (classGenerator$Type3 == classGenerator$Type2) {
                    Variable[] variableArr6 = variableArr;
                    int length4 = variableArr6.length;
                    int i17 = 3;
                    int i18 = 0;
                    while (i18 < length4) {
                        Variable variable2 = variableArr6[i18];
                        String str27 = str3;
                        if (variable2.hasModifier(str27)) {
                            variableArr2 = variableArr6;
                            c9207M144894.m14456(187, str26);
                            c9207M144894.m14460(89);
                            c9207M144894.m14461(variable2.getName());
                            if (8 >= i17) {
                                i4 = i17 + 1;
                                c9207M144894.m14460(i17);
                            } else {
                                i4 = i17 + 1;
                                c9207M144894.m14459(16, i17 - 3);
                            }
                            i17 = i4;
                            c9207M144894.m14457(183, str26, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V");
                            c9207M144894.m14452(179, str26, variable2.getName(), str24);
                        } else {
                            variableArr2 = variableArr6;
                        }
                        i18++;
                        variableArr6 = variableArr2;
                        str3 = str27;
                    }
                }
                c9207M144894.m14461(C9212.m14500(0, str24.length(), str24));
                c9207M144894.m14457(184, "bsh/This", "initStatic", "(Ljava/lang/Class;)V");
                c9207M144894.m14460(177);
                c9207M144894.m14462();
                DelayedEvalBshMethod[] delayedEvalBshMethodArr5 = delayedEvalBshMethodArr;
                boolean z2 = false;
                int i19 = 0;
                while (i19 < delayedEvalBshMethodArr5.length) {
                    String str28 = str25;
                    if (delayedEvalBshMethodArr5[i19].hasModifier(str28)) {
                        c34822 = c3482;
                    } else {
                        int iM59113 = C3482.m5911(delayedEvalBshMethodArr5[i19].getModifiers());
                        if (delayedEvalBshMethodArr5[i19].isVarArgs()) {
                            iM59113 |= 128;
                        }
                        c34822 = c3482;
                        c34822.m5913(i19, delayedEvalBshMethodArr5[i19].getParamTypeDescriptors(), iM59113, c92103);
                        z2 = true;
                    }
                    i19++;
                    str25 = str28;
                    c3482 = c34822;
                }
                String str29 = str25;
                C3482 c34824 = c3482;
                if (classGenerator$Type3 == ClassGenerator$Type.CLASS && !z2) {
                    c34824.m5913(-1, new String[0], 1, c92103);
                }
                DelayedEvalBshMethod[] delayedEvalBshMethodArr6 = c34824.f8275;
                int length5 = delayedEvalBshMethodArr6.length;
                int i20 = 0;
                while (i20 < length5) {
                    DelayedEvalBshMethod delayedEvalBshMethod2 = delayedEvalBshMethodArr6[i20];
                    if (delayedEvalBshMethod2.isExtension || delayedEvalBshMethod2.hasModifier(str29)) {
                        delayedEvalBshMethodArr2 = delayedEvalBshMethodArr6;
                        i2 = length5;
                        str7 = str26;
                        c9210 = c92103;
                        i3 = i20;
                        str4 = str29;
                    } else {
                        ClassGenerator$Type classGenerator$Type6 = ClassGenerator$Type.INTERFACE;
                        if (classGenerator$Type3 == classGenerator$Type6 && !delayedEvalBshMethod2.hasModifier("static") && !delayedEvalBshMethod2.hasModifier("default") && !delayedEvalBshMethod2.hasModifier("abstract")) {
                            delayedEvalBshMethod2.getModifiers().addModifier("abstract");
                        }
                        int iM59114 = C3482.m5911(delayedEvalBshMethod2.getModifiers());
                        if (delayedEvalBshMethod2.isVarArgs()) {
                            iM59114 |= 128;
                        }
                        int i21 = iM59114 & 8;
                        boolean z3 = i21 > 0;
                        delayedEvalBshMethodArr2 = delayedEvalBshMethodArr6;
                        String name = delayedEvalBshMethod2.getName();
                        String returnTypeDescriptor2 = delayedEvalBshMethod2.getReturnTypeDescriptor();
                        i2 = length5;
                        String[] paramTypeDescriptors = delayedEvalBshMethod2.getParamTypeDescriptors();
                        boolean z4 = i21 != 0;
                        String str30 = returnTypeDescriptor2 == null ? TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR : returnTypeDescriptor2;
                        i3 = i20;
                        C9207 c9207M144895 = c92103.m14489(iM59114, name, C3482.m5910(str30, paramTypeDescriptors));
                        str4 = str29;
                        if ((iM59114 & 1024) == 0) {
                            if (z4 || classGenerator$Type3 == classGenerator$Type6) {
                                C3482.m5912(str26, str17, c9207M144895);
                            } else {
                                c9207M144895.m14458(25, 0);
                                c9207M144895.m14452(180, str26, This.Keys.BSHTHIS + str17, "Lbsh/This;");
                            }
                            c9207M144895.m14461(name);
                            C3482.m5906(paramTypeDescriptors, z4, c9207M144895);
                            c9207M144895.m14460(4);
                            c9207M144895.m14457(182, "bsh/This", "invokeMethod", "(Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/Object;");
                            if (str30.equals("V")) {
                                c9207M144895.m14460(87);
                                c9207M144895.m14460(177);
                            } else if (str30.length() == 1) {
                                int i22 = 172;
                                if (str30.equals("Z")) {
                                    str5 = "java/lang/Boolean";
                                    str6 = "booleanValue";
                                } else if (str30.equals("C")) {
                                    str5 = "java/lang/Character";
                                    str6 = "charValue";
                                } else if (str30.equals("B")) {
                                    str5 = "java/lang/Byte";
                                    str6 = "byteValue";
                                } else if (str30.equals("S")) {
                                    str5 = "java/lang/Short";
                                    str6 = "shortValue";
                                } else if (str30.equals("F")) {
                                    i22 = 174;
                                    str5 = "java/lang/Float";
                                    str6 = "floatValue";
                                } else if (str30.equals("J")) {
                                    i22 = 173;
                                    str5 = "java/lang/Long";
                                    str6 = "longValue";
                                } else if (str30.equals("D")) {
                                    i22 = 175;
                                    str5 = "java/lang/Double";
                                    str6 = "doubleValue";
                                } else {
                                    str5 = "java/lang/Integer";
                                    str6 = "intValue";
                                }
                                c9207M144895.m14456(192, str5);
                                c9207M144895.m14457(182, str5, str6, "()".concat(str30));
                                c9207M144895.m14460(i22);
                            } else {
                                c9207M144895.m14456(192, C3482.m5909(str30));
                                c9207M144895.m14460(176);
                            }
                            c9207M144895.m14462();
                        }
                        String name2 = delayedEvalBshMethod2.getName();
                        String[] paramTypeDescriptors2 = delayedEvalBshMethod2.getParamTypeDescriptors();
                        Class cls2 = c34824.f8267;
                        Class superclass = cls2;
                        while (true) {
                            if (superclass == null) {
                                method = null;
                                break;
                            }
                            Method[] declaredMethods = superclass.getDeclaredMethods();
                            int length6 = declaredMethods.length;
                            int i23 = 0;
                            while (i23 < length6) {
                                Method method2 = declaredMethods[i23];
                                int i24 = i23;
                                if (method2.getName().equals(name2)) {
                                    str8 = name2;
                                    if (paramTypeDescriptors2.length == method2.getParameterCount()) {
                                        Class<?>[] parameterTypes = method2.getParameterTypes();
                                        int length7 = parameterTypes.length;
                                        String[] strArr2 = new String[length7];
                                        for (int i25 = 0; i25 < length7; i25++) {
                                            strArr2[i25] = BSHType.getTypeDescriptor(parameterTypes[i25]);
                                        }
                                        int i26 = 0;
                                        boolean zEquals = true;
                                        while (i26 < paramTypeDescriptors2.length) {
                                            int i27 = i26;
                                            zEquals = paramTypeDescriptors2[i26].equals(strArr2[i27]);
                                            if (!zEquals) {
                                                break;
                                            }
                                            i26 = i27 + 1;
                                        }
                                        if (zEquals) {
                                            method = method2;
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                } else {
                                    str8 = name2;
                                }
                                i23 = i24 + 1;
                                name2 = str8;
                            }
                            superclass = superclass.getSuperclass();
                        }
                        if (method == null || z3) {
                            str7 = str26;
                            c9210 = c92103;
                        } else {
                            String name3 = delayedEvalBshMethod2.getName();
                            String returnTypeDescriptor3 = delayedEvalBshMethod2.getReturnTypeDescriptor();
                            String[] paramTypeDescriptors3 = delayedEvalBshMethod2.getParamTypeDescriptors();
                            if (returnTypeDescriptor3 == null) {
                                returnTypeDescriptor3 = TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR;
                            }
                            String strM5910 = C3482.m5910(returnTypeDescriptor3, paramTypeDescriptors3);
                            C9207 c9207M144896 = c92103.m14489(1, "_bshSuper" + cls2.getSimpleName() + name3, strM5910);
                            c9207M144896.m14458(25, 0);
                            int length8 = paramTypeDescriptors3.length;
                            int i28 = 1;
                            int i29 = 0;
                            while (i29 < length8) {
                                String str31 = str26;
                                String str32 = paramTypeDescriptors3[i29];
                                String[] strArr3 = paramTypeDescriptors3;
                                C9210 c92104 = c92103;
                                if (str32.length() == 1) {
                                    c9207M144896.m14458(21, i28);
                                } else {
                                    c9207M144896.m14458(25, i28);
                                }
                                i28 += (str32.equals("D") || str32.equals("J")) ? 2 : 1;
                                i29++;
                                str26 = str31;
                                paramTypeDescriptors3 = strArr3;
                                c92103 = c92104;
                            }
                            str7 = str26;
                            c9210 = c92103;
                            c9207M144896.m14457(183, c34824.f8266, name3, strM5910);
                            C3482.m5905(returnTypeDescriptor3, c9207M144896);
                            c9207M144896.m14462();
                        }
                    }
                    i20 = i3 + 1;
                    classGenerator$Type3 = classGenerator$Type;
                    delayedEvalBshMethodArr6 = delayedEvalBshMethodArr2;
                    length5 = i2;
                    str26 = str7;
                    str29 = str4;
                    c92103 = c9210;
                }
                byte[] bArrM14491 = c92103.m14491();
                if (Interpreter.getSaveClasses() && (saveClassesDir = Interpreter.getSaveClassesDir()) != null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(saveClassesDir + "/" + str17 + ClassFileLocator.CLASS_FILE_EXTENSION);
                        try {
                            fileOutputStream.write(bArrM14491);
                            fileOutputStream.close();
                        } finally {
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                str22 = str22;
                clsMo5700 = c3493.mo5700(str22, bArrM14491);
                Interpreter.debug("Define ", str22, " as ", clsMo5700);
            } else {
                nameSpace = nameSpace7;
            }
            nameSpace8.importClass(str22.replace('$', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
            NameSpace nameSpace10 = nameSpace;
            nameSpace10.setClassStatic(clsMo5700);
            Interpreter.debug(nameSpace10);
            if (interpreter.getStrictJava()) {
                ArrayList arrayList5 = new ArrayList();
                new C2397(arrayList5).m3405(clsMo5700);
                arrayList5.stream().filter(new C3475(3)).forEach(new C3478(arrayList5, clsMo5700));
            }
            return clsMo5700;
        } catch (UtilEvalError e2) {
            C3466.m5898("Unable to init class static block: ", e2);
            return null;
        }
    }
}
