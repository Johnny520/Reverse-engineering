package bsh;

import bsh.BSHBlock;
import bsh.This;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import p332wb.AbstractC4855en;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class ClassGenerator {

    /* JADX INFO: renamed from: cg */
    private static ClassGenerator f976cg;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public enum Type {
        CLASS,
        INTERFACE,
        ENUM
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Class<?> generateClassImpl(String str, Modifiers modifiers, Class<?>[] clsArr, Class<?> cls, BSHBlock bSHBlock, Type type, CallStack callStack, Interpreter interpreter) {
        String str2;
        NameSpace pVar = callStack.top();
        String str3 = pVar.getPackage();
        if (pVar.isClass) {
            str2 = pVar.getName() + "$" + str;
        } else {
            str2 = str;
        }
        String strM9264h = str3 == null ? str2 : AbstractC4855en.m9264h(str3, ".", str2);
        BshClassManager classManager = interpreter.getClassManager();
        NameSpace nameSpace = new NameSpace(pVar, str2);
        nameSpace.isClass = true;
        callStack.push(nameSpace);
        bSHBlock.evalBlock(callStack, interpreter, Boolean.TRUE, ClassNodeFilter.CLASSCLASSES);
        Variable[] declaredVariables = getDeclaredVariables(bSHBlock, callStack, interpreter, str3);
        DelayedEvalBshMethod[] declaredMethods = getDeclaredMethods(bSHBlock, callStack, interpreter, str3, cls);
        callStack.pop();
        nameSpace.getThis(interpreter);
        ClassGeneratorUtil classGeneratorUtil = new ClassGeneratorUtil(modifiers, str2, str3, cls, clsArr, declaredVariables, declaredMethods, nameSpace, type);
        classGeneratorUtil.initStaticNameSpace(nameSpace, bSHBlock);
        Class<?> associatedClass = classManager.getAssociatedClass(strM9264h);
        if (associatedClass == null) {
            byte[] bArrGenerateClass = classGeneratorUtil.generateClass();
            if (Interpreter.getSaveClasses()) {
                saveClasses(str2, bArrGenerateClass);
            }
            associatedClass = classManager.defineClass(strM9264h, bArrGenerateClass);
            Interpreter.debug("Define ", strM9264h, " as ", associatedClass);
        }
        pVar.importClass(strM9264h.replace('$', '.'));
        nameSpace.setClassStatic(associatedClass);
        Interpreter.debug(nameSpace);
        if (interpreter.getStrictJava()) {
            ClassGeneratorUtil.checkAbstractMethodImplementation(associatedClass);
        }
        return associatedClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ClassGenerator getClassGenerator() {
        if (f976cg == null) {
            f976cg = new ClassGenerator();
        }
        return f976cg;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static DelayedEvalBshMethod[] getDeclaredMethods(BSHBlock bSHBlock, CallStack callStack, Interpreter interpreter, String str, Class<?> cls) {
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        if (callStack.top().getName().indexOf("$anon") > -1) {
            String baseName = Types.getBaseName(callStack.top().getName());
            arrayList.add(new DelayedEvalBshMethod(baseName, BshClassManager.memberCache.get(cls).findMethod(cls.getName(), This.CONTEXT_ARGS.get().get(baseName)), callStack.top()));
        }
        int i9 = 0;
        while (i9 < bSHBlock.jjtGetNumChildren()) {
            Node nodeJjtGetChild = bSHBlock.jjtGetChild(i9);
            if (nodeJjtGetChild instanceof BSHMethodDeclaration) {
                BSHMethodDeclaration bSHMethodDeclaration = (BSHMethodDeclaration) nodeJjtGetChild;
                bSHMethodDeclaration.insureNodesParsed();
                Modifiers modifiers = bSHMethodDeclaration.modifiers;
                String str3 = bSHMethodDeclaration.name;
                String returnTypeDescriptor = bSHMethodDeclaration.getReturnTypeDescriptor(callStack, interpreter, str2);
                BSHReturnType returnTypeNode = bSHMethodDeclaration.getReturnTypeNode();
                BSHFormalParameters bSHFormalParameters = bSHMethodDeclaration.paramsNode;
                DelayedEvalBshMethod delayedEvalBshMethod = new DelayedEvalBshMethod(str3, returnTypeDescriptor, returnTypeNode, bSHMethodDeclaration.paramsNode.getParamNames(), bSHFormalParameters.getTypeDescriptors(callStack, interpreter, str2), bSHFormalParameters, bSHMethodDeclaration.blockNode, null, modifiers, bSHMethodDeclaration.isVarArgs, callStack, interpreter);
                boolean z9 = bSHMethodDeclaration.isExtension;
                delayedEvalBshMethod.isExtension = z9;
                if (z9) {
                    delayedEvalBshMethod.receiverType = bSHMethodDeclaration.evalReceiverType(callStack, interpreter);
                }
                arrayList.add(delayedEvalBshMethod);
            }
            i9++;
            str2 = str;
        }
        return (DelayedEvalBshMethod[]) arrayList.toArray(new DelayedEvalBshMethod[arrayList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Variable[] getDeclaredVariables(BSHBlock bSHBlock, CallStack callStack, Interpreter interpreter, String str) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < bSHBlock.jjtGetNumChildren(); i9++) {
            Node nodeJjtGetChild = bSHBlock.jjtGetChild(i9);
            if (nodeJjtGetChild instanceof BSHEnumConstant) {
                BSHEnumConstant bSHEnumConstant = (BSHEnumConstant) nodeJjtGetChild;
                try {
                    arrayList.add(new Variable(bSHEnumConstant.getName(), bSHEnumConstant.getType(), (Object) null, bSHEnumConstant.mods));
                } catch (UtilEvalError unused) {
                }
            } else if (nodeJjtGetChild instanceof BSHTypedVariableDeclaration) {
                BSHTypedVariableDeclaration bSHTypedVariableDeclaration = (BSHTypedVariableDeclaration) nodeJjtGetChild;
                Modifiers modifiers = bSHTypedVariableDeclaration.modifiers;
                for (BSHVariableDeclarator bSHVariableDeclarator : bSHTypedVariableDeclaration.getDeclarators()) {
                    try {
                        arrayList.add(new Variable(bSHVariableDeclarator.name, bSHTypedVariableDeclaration.evalType(callStack, interpreter), (Object) null, modifiers));
                    } catch (EvalError | UtilEvalError unused2) {
                    }
                }
            }
        }
        return (Variable[]) arrayList.toArray(new Variable[arrayList.size()]);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Object invokeSuperclassMethodImpl(BshClassManager bshClassManager, Object obj, Class<?> cls, String str, Object[] objArr) {
        Class<? super Object> superclass = cls.getSuperclass();
        Invocable invocableResolveJavaMethod = Reflect.resolveJavaMethod(obj.getClass(), This.Keys.BSHSUPER + superclass.getSimpleName() + str, Types.getTypes(objArr), false);
        return invocableResolveJavaMethod != null ? invocableResolveJavaMethod.invoke(obj, objArr) : Reflect.resolveExpectedJavaMethod(bshClassManager, superclass, obj, str, objArr, false).invoke(obj, objArr);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private static void saveClasses(String str, byte[] bArr) {
        String saveClassesDir = Interpreter.getSaveClassesDir();
        if (saveClassesDir != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(saveClassesDir + "/" + str + ".class");
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.close();
                } finally {
                }
            } catch (IOException e6) {
                e6.printStackTrace();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> generateClass(String str, Modifiers modifiers, Class<?>[] clsArr, Class<?> cls, BSHBlock bSHBlock, Type type, CallStack callStack, Interpreter interpreter) {
        return generateClassImpl(str, modifiers, clsArr, cls, bSHBlock, type, callStack, interpreter);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Object invokeSuperclassMethod(BshClassManager bshClassManager, Object obj, Class<?> cls, String str, Object[] objArr) {
        return invokeSuperclassMethodImpl(bshClassManager, obj, cls, str, objArr);
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static class ClassNodeFilter implements BSHBlock.NodeFilter {
        public static ClassNodeFilter CLASSCLASSES;
        public static ClassNodeFilter CLASSINSTANCEFIELDS;
        public static ClassNodeFilter CLASSINSTANCEMETHODS;
        public static ClassNodeFilter CLASSSTATICFIELDS;
        public static ClassNodeFilter CLASSSTATICMETHODS;
        Context context;
        Types types;

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum Context {
            STATIC,
            INSTANCE,
            CLASSES
        }

        /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
        public enum Types {
            ALL,
            METHODS,
            FIELDS
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        static {
            Context context = Context.STATIC;
            Types types = Types.FIELDS;
            CLASSSTATICFIELDS = new ClassNodeFilter(context, types);
            Types types2 = Types.METHODS;
            CLASSSTATICMETHODS = new ClassNodeFilter(context, types2);
            Context context2 = Context.INSTANCE;
            CLASSINSTANCEFIELDS = new ClassNodeFilter(context2, types);
            CLASSINSTANCEMETHODS = new ClassNodeFilter(context2, types2);
            CLASSCLASSES = new ClassNodeFilter(Context.CLASSES);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private ClassNodeFilter(Context context) {
            this.types = Types.ALL;
            this.context = context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private boolean isInstanceMethod(Node node) {
            if (node instanceof BSHMethodDeclaration) {
                return !((BSHMethodDeclaration) node).modifiers.hasModifier("static");
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private boolean isNonStatic(Node node) {
            if (node instanceof BSHMethodDeclaration) {
                return false;
            }
            return !isStatic(node);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private boolean isStatic(Node node) {
            if ((node.jjtGetParent().jjtGetParent() instanceof BSHClassDeclaration) && ((BSHClassDeclaration) node.jjtGetParent().jjtGetParent()).type == Type.INTERFACE) {
                return true;
            }
            if (node instanceof BSHTypedVariableDeclaration) {
                return ((BSHTypedVariableDeclaration) node).modifiers.hasModifier("static");
            }
            if (node instanceof BSHBlock) {
                return ((BSHBlock) node).isStatic;
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        private boolean isStaticMethod(Node node) {
            if (node instanceof BSHMethodDeclaration) {
                return ((BSHMethodDeclaration) node).modifiers.hasModifier("static");
            }
            return false;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // bsh.BSHBlock.NodeFilter
        public boolean isVisible(Node node) {
            Context context = this.context;
            if (context == Context.CLASSES) {
                return node instanceof BSHClassDeclaration;
            }
            if (node instanceof BSHClassDeclaration) {
                return false;
            }
            Context context2 = Context.STATIC;
            Types types = this.types;
            return context == context2 ? types == Types.METHODS ? isStaticMethod(node) : isStatic(node) : types == Types.METHODS ? isInstanceMethod(node) : isNonStatic(node);
        }

        private ClassNodeFilter(Context context, Types types) {
            Types types2 = Types.ALL;
            this.context = context;
            this.types = types;
        }
    }
}
