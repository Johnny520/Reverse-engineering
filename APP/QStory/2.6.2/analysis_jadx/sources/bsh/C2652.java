package bsh;

import androidx.activity.AbstractC0053;
import androidx.compose.ui.graphics.vector.C1562;
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
import p283.C8377;
import p283.C8380;
import p283.C8382;

/* JADX INFO: renamed from: bsh.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2652 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2652 f7942;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Class m5314(String str, Modifiers modifiers, Class[] clsArr, Class cls, BSHBlock bSHBlock, ClassGenerator$Type classGenerator$Type, CallStack callStack, Interpreter interpreter) {
        NameSpace nameSpace;
        int i;
        String str2;
        C2659 c2659;
        DelayedEvalBshMethod[] delayedEvalBshMethodArr;
        C2648 c2648;
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
        C8380 c8380;
        String str8;
        C2648 c26482;
        Variable[] variableArr2;
        int i4;
        int i5;
        int i6;
        String str9;
        int i7;
        String str10;
        String str11;
        C2659 c26592;
        NameSpace nameSpace2;
        NameSpace nameSpace3;
        ArrayList arrayList;
        C2659 c26593;
        NameSpace nameSpace4;
        BSHBlock bSHBlock2 = bSHBlock;
        NameSpace pVar = callStack.top();
        String str12 = pVar.getPackage();
        String str13 = pVar.isClass ? pVar.getName() + "$" + str : str;
        String str14 = str12 == null ? str13 : str12 + "." + str13;
        C2659 classManager = interpreter.getClassManager();
        NameSpace nameSpace5 = new NameSpace(pVar, str13);
        nameSpace5.isClass = true;
        callStack.push(nameSpace5);
        bSHBlock2.evalBlock(callStack, interpreter, Boolean.TRUE, C2651.f7939);
        ArrayList arrayList2 = new ArrayList();
        int i8 = 0;
        while (i8 < bSHBlock2.jjtGetNumChildren()) {
            InterfaceC2618 interfaceC2618JjtGetChild = bSHBlock2.jjtGetChild(i8);
            if (interfaceC2618JjtGetChild instanceof BSHEnumConstant) {
                BSHEnumConstant bSHEnumConstant = (BSHEnumConstant) interfaceC2618JjtGetChild;
                try {
                    arrayList2.add(new Variable(bSHEnumConstant.getName(), bSHEnumConstant.getType(), (Object) null, bSHEnumConstant.mods));
                } catch (UtilEvalError unused) {
                }
            } else if (interfaceC2618JjtGetChild instanceof BSHTypedVariableDeclaration) {
                BSHTypedVariableDeclaration bSHTypedVariableDeclaration = (BSHTypedVariableDeclaration) interfaceC2618JjtGetChild;
                Modifiers modifiers2 = bSHTypedVariableDeclaration.modifiers;
                BSHVariableDeclarator[] declarators = bSHTypedVariableDeclaration.getDeclarators();
                int length = declarators.length;
                int i9 = 0;
                while (i9 < length) {
                    String str15 = str13;
                    String str16 = str14;
                    try {
                        c26593 = classManager;
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
                        c26593 = classManager;
                    }
                    i9++;
                    str13 = str15;
                    str14 = str16;
                    classManager = c26593;
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
        C2659 c26594 = classManager;
        NameSpace nameSpace6 = nameSpace5;
        Object obj = null;
        Variable[] variableArr3 = (Variable[]) arrayList2.toArray(new Variable[arrayList2.size()]);
        ArrayList arrayList3 = new ArrayList();
        byte b = -1;
        if (callStack.top().getName().indexOf("$anon") > -1) {
            String strM5347 = AbstractC2661.m5347(callStack.top().getName());
            arrayList3.add(new DelayedEvalBshMethod(strM5347, ((C2655) C2659.f7958.m13853(cls)).m5318(cls.getName(), AbstractC2661.m5351(This.CONTEXT_ARGS.get().get(strM5347))), callStack.top()));
        }
        int i10 = 0;
        while (i10 < bSHBlock2.jjtGetNumChildren()) {
            InterfaceC2618 interfaceC2618JjtGetChild2 = bSHBlock2.jjtGetChild(i10);
            if (interfaceC2618JjtGetChild2 instanceof BSHMethodDeclaration) {
                BSHMethodDeclaration bSHMethodDeclaration = (BSHMethodDeclaration) interfaceC2618JjtGetChild2;
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
                c26592 = c26594;
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
                c26592 = c26594;
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
            c26594 = c26592;
            b = -1;
            obj = null;
        }
        String str20 = str12;
        String str21 = str18;
        C2659 c26595 = c26594;
        NameSpace nameSpace7 = nameSpace6;
        NameSpace nameSpace8 = pVar;
        ArrayList arrayList4 = arrayList3;
        DelayedEvalBshMethod[] delayedEvalBshMethodArr3 = (DelayedEvalBshMethod[]) arrayList4.toArray(new DelayedEvalBshMethod[arrayList4.size()]);
        callStack.pop();
        nameSpace7.getThis(interpreter);
        ClassGenerator$Type classGenerator$Type3 = classGenerator$Type;
        C2648 c26483 = new C2648(modifiers, str17, str20, cls, clsArr, variableArr3, delayedEvalBshMethodArr3, nameSpace7, classGenerator$Type3);
        DelayedEvalBshMethod[] delayedEvalBshMethodArr4 = c26483.f7927;
        try {
            nameSpace7.setLocalVariable("" + This.Keys.BSHCLASSMODIFIERS, modifiers, false);
            nameSpace7.setLocalVariable("" + This.Keys.BSHCONSTRUCTORS, delayedEvalBshMethodArr4, false);
            nameSpace7.setLocalVariable("" + This.Keys.BSHINIT, bSHBlock, false);
            C2659 c26596 = c26595;
            String str22 = str21;
            Class clsMo5095 = (Class) c26596.f7965.get(str22);
            char c = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
            if (clsMo5095 == null) {
                Map<String, NameSpace> map = This.contextStore;
                String str23 = c26483.f7921;
                NameSpace nameSpace9 = map.get(str23);
                int iM5306 = C2648.m5306(modifiers);
                if (classGenerator$Type3 == ClassGenerator$Type.INTERFACE) {
                    i = iM5306 | 1537;
                } else if (classGenerator$Type3 == ClassGenerator$Type.ENUM) {
                    i = iM5306 | 16433;
                } else {
                    i = iM5306 | 33;
                    if ((i & 1024) > 0) {
                        i -= 1024;
                    }
                }
                int i12 = i;
                Class[] clsArr2 = c26483.f7926;
                String[] strArr = new String[clsArr2.length + 1];
                int i13 = 0;
                while (i13 < clsArr2.length) {
                    strArr[i13] = clsArr2[i13].getName().replace(c, '/');
                    if (AbstractC2666.m5387(clsArr2[i13])) {
                        Variable[] variableArrM5403 = AbstractC2666.m5403(AbstractC2666.m5400(clsArr2[i13]));
                        int length2 = variableArrM5403.length;
                        int i14 = 0;
                        while (i14 < length2) {
                            Variable[] variableArr4 = variableArrM5403;
                            nameSpace9.setVariableImpl(variableArr4[i14]);
                            i14++;
                            variableArrM5403 = variableArr4;
                        }
                    }
                    i13++;
                    c = TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH;
                }
                strArr[clsArr2.length] = GeneratedClass.class.getName().replace(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH, '/');
                C8380 c83802 = new C8380();
                ClassGenerator$Type classGenerator$Type4 = ClassGenerator$Type.ENUM;
                String str24 = c26483.f7923;
                c83802.m13914(i12, c26483.f7922, classGenerator$Type3 == classGenerator$Type4 ? AbstractC0053.m156("Ljava/lang/Enum<", str24, ">;") : null, c26483.f7919, strArr);
                C8380 c83803 = c83802;
                if (classGenerator$Type3 != ClassGenerator$Type.INTERFACE) {
                    str2 = null;
                    C2648.m5302(This.Keys.BSHTHIS + str17, "Lbsh/This;", 1, null, c83803);
                } else {
                    str2 = null;
                }
                C2648.m5302(This.Keys.BSHSTATIC + str17, "Lbsh/This;", 25, str2, c83803);
                C2648.m5302("UUID", "Ljava/lang/String;", 25, str23, c83803);
                Variable[] variableArr5 = c26483.f7925;
                int length3 = variableArr5.length;
                nameSpace = nameSpace7;
                int i15 = 0;
                while (true) {
                    c2659 = c26596;
                    if (i15 >= length3) {
                        break;
                    }
                    int i16 = i15;
                    Variable variable = variableArr5[i16];
                    if (variable.hasModifier("private")) {
                        i5 = length3;
                    } else {
                        String typeDescriptor = variable.getTypeDescriptor();
                        int iM53062 = C2648.m5306(variable.getModifiers());
                        i5 = length3;
                        if (classGenerator$Type3 == ClassGenerator$Type.INTERFACE) {
                            variable.setConstant();
                            nameSpace9.setVariableImpl(variable);
                        } else {
                            if (classGenerator$Type3 == ClassGenerator$Type.ENUM && variable.hasModifier("enum")) {
                                i6 = iM53062 | 16400;
                                str9 = str24;
                            } else {
                                i6 = iM53062;
                                str9 = typeDescriptor;
                            }
                            C2648.m5302(variable.getName(), str9, i6, null, c83803);
                        }
                    }
                    i15 = i16 + 1;
                    c26596 = c2659;
                    length3 = i5;
                }
                ClassGenerator$Type classGenerator$Type5 = ClassGenerator$Type.ENUM;
                String str25 = "private";
                String str26 = c26483.f7922;
                if (classGenerator$Type3 == classGenerator$Type5) {
                    c2648 = c26483;
                    delayedEvalBshMethodArr = delayedEvalBshMethodArr4;
                    str3 = "enum";
                    C8377 c8377M13913 = c83803.m13913(9, "values", "()[" + str24);
                    C2648.m5307(str26, str17, c8377M13913);
                    variableArr = variableArr5;
                    c8377M13913.m13881(182, "bsh/This", "enumValues", "()[Ljava/lang/Object;");
                    C2648.m5300("[" + str24, c8377M13913);
                    c8377M13913.m13886();
                    C8377 c8377M139132 = c83803.m13913(9, "valueOf", "(Ljava/lang/String;)" + str24);
                    c8377M139132.m13885(C8382.m13924(0, str24.length(), str24));
                    c8377M139132.m13882(25, 0);
                    classGenerator$Type2 = classGenerator$Type5;
                    c8377M139132.m13881(184, "java/lang/Enum", "valueOf", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;");
                    C2648.m5300(str24, c8377M139132);
                    c8377M139132.m13886();
                    C8377 c8377M139133 = c83803.m13913(2, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V");
                    c8377M139133.m13882(25, 0);
                    c8377M139133.m13882(25, 1);
                    c8377M139133.m13882(21, 2);
                    c8377M139133.m13881(183, "java/lang/Enum", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V");
                    c8377M139133.m13882(25, 0);
                    c8377M139133.m13885(str17);
                    C2648.m5301(new String[0], false, c8377M139133);
                    c8377M139133.m13881(184, "bsh/This", "initInstance", "(Lbsh/GeneratedClass;Ljava/lang/String;[Ljava/lang/Object;)V");
                    c8377M139133.m13884(177);
                    c8377M139133.m13886();
                } else {
                    delayedEvalBshMethodArr = delayedEvalBshMethodArr4;
                    c2648 = c26483;
                    classGenerator$Type2 = classGenerator$Type5;
                    str3 = "enum";
                    variableArr = variableArr5;
                }
                C8377 c8377M139134 = c83803.m13913(8, MethodDescription.TYPE_INITIALIZER_INTERNAL_NAME, "()V");
                c8377M139134.m13876(178, str26, "UUID", "Ljava/lang/String;");
                c8377M139134.m13881(184, "bsh/This", "pullBshStatic", "(Ljava/lang/String;)Lbsh/This;");
                c8377M139134.m13876(179, str26, This.Keys.BSHSTATIC + str17, "Lbsh/This;");
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
                            c8377M139134.m13880(187, str26);
                            c8377M139134.m13884(89);
                            c8377M139134.m13885(variable2.getName());
                            if (8 >= i17) {
                                i4 = i17 + 1;
                                c8377M139134.m13884(i17);
                            } else {
                                i4 = i17 + 1;
                                c8377M139134.m13883(16, i17 - 3);
                            }
                            i17 = i4;
                            c8377M139134.m13881(183, str26, MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Ljava/lang/String;I)V");
                            c8377M139134.m13876(179, str26, variable2.getName(), str24);
                        } else {
                            variableArr2 = variableArr6;
                        }
                        i18++;
                        variableArr6 = variableArr2;
                        str3 = str27;
                    }
                }
                c8377M139134.m13885(C8382.m13924(0, str24.length(), str24));
                c8377M139134.m13881(184, "bsh/This", "initStatic", "(Ljava/lang/Class;)V");
                c8377M139134.m13884(177);
                c8377M139134.m13886();
                DelayedEvalBshMethod[] delayedEvalBshMethodArr5 = delayedEvalBshMethodArr;
                boolean z2 = false;
                int i19 = 0;
                while (i19 < delayedEvalBshMethodArr5.length) {
                    String str28 = str25;
                    if (delayedEvalBshMethodArr5[i19].hasModifier(str28)) {
                        c26482 = c2648;
                    } else {
                        int iM53063 = C2648.m5306(delayedEvalBshMethodArr5[i19].getModifiers());
                        if (delayedEvalBshMethodArr5[i19].isVarArgs()) {
                            iM53063 |= 128;
                        }
                        c26482 = c2648;
                        c26482.m5308(i19, delayedEvalBshMethodArr5[i19].getParamTypeDescriptors(), iM53063, c83803);
                        z2 = true;
                    }
                    i19++;
                    str25 = str28;
                    c2648 = c26482;
                }
                String str29 = str25;
                C2648 c26484 = c2648;
                if (classGenerator$Type3 == ClassGenerator$Type.CLASS && !z2) {
                    c26484.m5308(-1, new String[0], 1, c83803);
                }
                DelayedEvalBshMethod[] delayedEvalBshMethodArr6 = c26484.f7928;
                int length5 = delayedEvalBshMethodArr6.length;
                int i20 = 0;
                while (i20 < length5) {
                    DelayedEvalBshMethod delayedEvalBshMethod2 = delayedEvalBshMethodArr6[i20];
                    if (delayedEvalBshMethod2.isExtension || delayedEvalBshMethod2.hasModifier(str29)) {
                        delayedEvalBshMethodArr2 = delayedEvalBshMethodArr6;
                        i2 = length5;
                        str7 = str26;
                        c8380 = c83803;
                        i3 = i20;
                        str4 = str29;
                    } else {
                        ClassGenerator$Type classGenerator$Type6 = ClassGenerator$Type.INTERFACE;
                        if (classGenerator$Type3 == classGenerator$Type6 && !delayedEvalBshMethod2.hasModifier("static") && !delayedEvalBshMethod2.hasModifier("default") && !delayedEvalBshMethod2.hasModifier("abstract")) {
                            delayedEvalBshMethod2.getModifiers().addModifier("abstract");
                        }
                        int iM53064 = C2648.m5306(delayedEvalBshMethod2.getModifiers());
                        if (delayedEvalBshMethod2.isVarArgs()) {
                            iM53064 |= 128;
                        }
                        int i21 = iM53064 & 8;
                        boolean z3 = i21 > 0;
                        delayedEvalBshMethodArr2 = delayedEvalBshMethodArr6;
                        String name = delayedEvalBshMethod2.getName();
                        String returnTypeDescriptor2 = delayedEvalBshMethod2.getReturnTypeDescriptor();
                        i2 = length5;
                        String[] paramTypeDescriptors = delayedEvalBshMethod2.getParamTypeDescriptors();
                        boolean z4 = i21 != 0;
                        String str30 = returnTypeDescriptor2 == null ? TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR : returnTypeDescriptor2;
                        i3 = i20;
                        C8377 c8377M139135 = c83803.m13913(iM53064, name, C2648.m5305(str30, paramTypeDescriptors));
                        str4 = str29;
                        if ((iM53064 & 1024) == 0) {
                            if (z4 || classGenerator$Type3 == classGenerator$Type6) {
                                C2648.m5307(str26, str17, c8377M139135);
                            } else {
                                c8377M139135.m13882(25, 0);
                                c8377M139135.m13876(180, str26, This.Keys.BSHTHIS + str17, "Lbsh/This;");
                            }
                            c8377M139135.m13885(name);
                            C2648.m5301(paramTypeDescriptors, z4, c8377M139135);
                            c8377M139135.m13884(4);
                            c8377M139135.m13881(182, "bsh/This", "invokeMethod", "(Ljava/lang/String;[Ljava/lang/Object;Z)Ljava/lang/Object;");
                            if (str30.equals("V")) {
                                c8377M139135.m13884(87);
                                c8377M139135.m13884(177);
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
                                c8377M139135.m13880(192, str5);
                                c8377M139135.m13881(182, str5, str6, "()".concat(str30));
                                c8377M139135.m13884(i22);
                            } else {
                                c8377M139135.m13880(192, C2648.m5304(str30));
                                c8377M139135.m13884(176);
                            }
                            c8377M139135.m13886();
                        }
                        String name2 = delayedEvalBshMethod2.getName();
                        String[] paramTypeDescriptors2 = delayedEvalBshMethod2.getParamTypeDescriptors();
                        Class cls2 = c26484.f7920;
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
                            c8380 = c83803;
                        } else {
                            String name3 = delayedEvalBshMethod2.getName();
                            String returnTypeDescriptor3 = delayedEvalBshMethod2.getReturnTypeDescriptor();
                            String[] paramTypeDescriptors3 = delayedEvalBshMethod2.getParamTypeDescriptors();
                            if (returnTypeDescriptor3 == null) {
                                returnTypeDescriptor3 = TypeProxy.SilentConstruction.Appender.JAVA_LANG_OBJECT_DESCRIPTOR;
                            }
                            String strM5305 = C2648.m5305(returnTypeDescriptor3, paramTypeDescriptors3);
                            C8377 c8377M139136 = c83803.m13913(1, "_bshSuper" + cls2.getSimpleName() + name3, strM5305);
                            c8377M139136.m13882(25, 0);
                            int length8 = paramTypeDescriptors3.length;
                            int i28 = 1;
                            int i29 = 0;
                            while (i29 < length8) {
                                String str31 = str26;
                                String str32 = paramTypeDescriptors3[i29];
                                String[] strArr3 = paramTypeDescriptors3;
                                C8380 c83804 = c83803;
                                if (str32.length() == 1) {
                                    c8377M139136.m13882(21, i28);
                                } else {
                                    c8377M139136.m13882(25, i28);
                                }
                                i28 += (str32.equals("D") || str32.equals("J")) ? 2 : 1;
                                i29++;
                                str26 = str31;
                                paramTypeDescriptors3 = strArr3;
                                c83803 = c83804;
                            }
                            str7 = str26;
                            c8380 = c83803;
                            c8377M139136.m13881(183, c26484.f7919, name3, strM5305);
                            C2648.m5300(returnTypeDescriptor3, c8377M139136);
                            c8377M139136.m13886();
                        }
                    }
                    i20 = i3 + 1;
                    classGenerator$Type3 = classGenerator$Type;
                    delayedEvalBshMethodArr6 = delayedEvalBshMethodArr2;
                    length5 = i2;
                    str26 = str7;
                    str29 = str4;
                    c83803 = c8380;
                }
                byte[] bArrM13915 = c83803.m13915();
                if (Interpreter.getSaveClasses() && (saveClassesDir = Interpreter.getSaveClassesDir()) != null) {
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(saveClassesDir + "/" + str17 + ClassFileLocator.CLASS_FILE_EXTENSION);
                        try {
                            fileOutputStream.write(bArrM13915);
                            fileOutputStream.close();
                        } finally {
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                str22 = str22;
                clsMo5095 = c2659.mo5095(str22, bArrM13915);
                Interpreter.debug("Define ", str22, " as ", clsMo5095);
            } else {
                nameSpace = nameSpace7;
            }
            nameSpace8.importClass(str22.replace('$', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH));
            NameSpace nameSpace10 = nameSpace;
            nameSpace10.setClassStatic(clsMo5095);
            Interpreter.debug(nameSpace10);
            if (interpreter.getStrictJava()) {
                ArrayList arrayList5 = new ArrayList();
                new C1562(arrayList5).m2835(clsMo5095);
                arrayList5.stream().filter(new C2641(3)).forEach(new C2644(arrayList5, clsMo5095));
            }
            return clsMo5095;
        } catch (UtilEvalError e2) {
            C2632.m5293("Unable to init class static block: ", e2);
            return null;
        }
    }
}
