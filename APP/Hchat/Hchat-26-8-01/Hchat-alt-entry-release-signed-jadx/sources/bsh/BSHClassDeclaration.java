package bsh;

import bsh.ClassGenerator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p068eh.AbstractC0921a;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
class BSHClassDeclaration extends SimpleNode {
    static final String CLASSINITNAME = "_bshClassInit";
    private static final long serialVersionUID = 1;
    boolean extend;
    private Class<?> generatedClass;
    Modifiers modifiers;
    String name;
    int numInterfaces;
    ClassGenerator.Type type;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public BSHClassDeclaration(int i9) {
        super(i9);
        this.modifiers = new Modifiers(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private Class<?> generateClass(CallStack callStack, Interpreter interpreter) throws EvalError {
        int i9;
        Class<?> cls;
        int i10 = 0;
        ArrayList<BshMethod> arrayList = new ArrayList(0);
        if (this.extend) {
            Class<?> cls2 = ((BSHAmbiguousName) jjtGetChild(0)).toClass(callStack, interpreter);
            try {
                Interpreter.mainSecurityGuard.canExtends(cls2);
                if (Reflect.isGeneratedClass(cls2)) {
                    if (Reflect.getClassModifiers(cls2).hasModifier("final")) {
                        throw new EvalException("Cannot inherit from final class ".concat(cls2.getName()), null, null);
                    }
                    arrayList.addAll((Collection) Stream.of((Object[]) Reflect.getDeclaredMethods(cls2)).filter(new C0341a(0)).collect(Collectors.toList()));
                }
                cls = cls2;
                i9 = 1;
            } catch (UtilEvalError e6) {
                throw e6.toEvalError(this, callStack);
            }
        } else {
            i9 = 0;
            cls = null;
        }
        Class<?>[] clsArr = new Class[this.numInterfaces];
        while (i10 < this.numInterfaces) {
            int i11 = i9 + 1;
            BSHAmbiguousName bSHAmbiguousName = (BSHAmbiguousName) jjtGetChild(i9);
            Class<?> cls3 = bSHAmbiguousName.toClass(callStack, interpreter);
            clsArr[i10] = cls3;
            if (!cls3.isInterface()) {
                throw new EvalException(AbstractC0921a.m2255r(new StringBuilder("Type: "), bSHAmbiguousName.text, " is not an interface!"), this, callStack);
            }
            try {
                Interpreter.mainSecurityGuard.canImplements(clsArr[i10]);
                i10++;
                i9 = i11;
            } catch (UtilEvalError e7) {
                throw e7.toEvalError(this, callStack);
            }
        }
        BSHBlock bSHBlock = (BSHBlock) jjtGetChild(i9);
        if (this.type == ClassGenerator.Type.INTERFACE) {
            this.modifiers.changeContext(1);
        }
        Class<?> clsGenerateClass = ClassGenerator.getClassGenerator().generateClass(this.name, this.modifiers, clsArr, cls, bSHBlock, this.type, callStack, interpreter);
        for (BshMethod bshMethod : arrayList) {
            if (Reflect.getDeclaredMethod(clsGenerateClass, bshMethod.getName(), bshMethod.getParameterTypes()) != null) {
                throw new EvalException("Cannot override " + bshMethod.getName() + "() in " + StringUtil.typeString(cls) + " overridden method is final", null, null);
            }
        }
        return clsGenerateClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$generateClass$0(BshMethod bshMethod) {
        return bshMethod.hasModifier("final") && !bshMethod.hasModifier("private");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode, bsh.Node
    public synchronized Object eval(CallStack callStack, Interpreter interpreter) {
        try {
            if (this.generatedClass == null) {
                this.generatedClass = generateClass(callStack, interpreter);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.generatedClass;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name;
    }
}
