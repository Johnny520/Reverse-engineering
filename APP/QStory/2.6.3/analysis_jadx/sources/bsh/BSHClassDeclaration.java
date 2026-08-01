package bsh;

import androidx.activity.AbstractC0053;
import bsh.security.SecurityError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p281.C8372;
import p281.C8373;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
class BSHClassDeclaration extends SimpleNode {
    static final String CLASSINITNAME = "_bshClassInit";
    boolean extend;
    private Class<?> generatedClass;
    Modifiers modifiers;
    String name;
    int numInterfaces;
    ClassGenerator$Type type;

    public BSHClassDeclaration(int i) {
        super(i);
        this.modifiers = new Modifiers(0);
    }

    private Class<?> generateClass(CallStack callStack, Interpreter interpreter) throws EvalError {
        int i;
        Class<?> cls;
        BshMethod bshMethodM5450;
        int i2 = 0;
        ArrayList<BshMethod> arrayList = new ArrayList(0);
        if (this.extend) {
            Class<?> cls2 = ((BSHAmbiguousName) jjtGetChild(0)).toClass(callStack, interpreter);
            try {
                Iterator it = Interpreter.mainSecurityGuard.f23117.iterator();
                while (it.hasNext()) {
                    ((C8373) it.next()).getClass();
                }
                if (AbstractC2667.m5432(cls2)) {
                    if (AbstractC2667.m5457(cls2).hasModifier("final")) {
                        throw new EvalException("Cannot inherit from final class ".concat(cls2.getName()), null, null);
                    }
                    arrayList.addAll((Collection) Stream.of((Object[]) AbstractC2667.m5460(cls2)).filter(new C2642(i2)).collect(Collectors.toList()));
                }
                cls = cls2;
                i = 1;
            } catch (UtilEvalError e) {
                throw e.toEvalError(this, callStack);
            }
        } else {
            i = 0;
            cls = null;
        }
        Class[] clsArr = new Class[this.numInterfaces];
        while (i2 < this.numInterfaces) {
            int i3 = i + 1;
            BSHAmbiguousName bSHAmbiguousName = (BSHAmbiguousName) jjtGetChild(i);
            Class<?> cls3 = bSHAmbiguousName.toClass(callStack, interpreter);
            clsArr[i2] = cls3;
            if (!cls3.isInterface()) {
                throw new EvalException(AbstractC0053.m151(new StringBuilder("Type: "), bSHAmbiguousName.text, " is not an interface!"), this, callStack);
            }
            try {
                C8372 c8372 = Interpreter.mainSecurityGuard;
                Class cls4 = clsArr[i2];
                Iterator it2 = c8372.f23117.iterator();
                while (it2.hasNext()) {
                    ((C8373) it2.next()).getClass();
                    if (cls4 == C8373.class) {
                        throw SecurityError.cantImplements(cls4);
                    }
                }
                i2++;
                i = i3;
            } catch (UtilEvalError e2) {
                throw e2.toEvalError(this, callStack);
            }
        }
        BSHBlock bSHBlock = (BSHBlock) jjtGetChild(i);
        if (this.type == ClassGenerator$Type.INTERFACE) {
            this.modifiers.changeContext(1);
        }
        if (C2653.f7944 == null) {
            C2653.f7944 = new C2653();
        }
        C2653 c2653 = C2653.f7944;
        String str = this.name;
        Modifiers modifiers = this.modifiers;
        ClassGenerator$Type classGenerator$Type = this.type;
        c2653.getClass();
        Class<?> clsM5359 = C2653.m5359(str, modifiers, clsArr, cls, bSHBlock, classGenerator$Type, callStack, interpreter);
        for (BshMethod bshMethod : arrayList) {
            String name = bshMethod.getName();
            Class<?>[] parameterTypes = bshMethod.getParameterTypes();
            if (AbstractC2667.m5432(clsM5359)) {
                bshMethodM5450 = AbstractC2667.m5450(AbstractC2667.m5445(clsM5359), name, parameterTypes, true);
                if (bshMethodM5450 == null && !clsM5359.isInterface()) {
                    bshMethodM5450 = AbstractC2667.m5450(AbstractC2667.m5444(AbstractC2667.m5454(clsM5359)), name, parameterTypes, true);
                }
            } else {
                bshMethodM5450 = null;
            }
            if (bshMethodM5450 != null) {
                throw new EvalException("Cannot override " + bshMethod.getName() + "() in " + AbstractC2629.m5325(cls) + " overridden method is final", null, null);
            }
        }
        return clsM5359;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$generateClass$0(BshMethod bshMethod) {
        return bshMethod.hasModifier("final") && !bshMethod.hasModifier("private");
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2619
    public synchronized Object eval(CallStack callStack, Interpreter interpreter) {
        try {
            if (this.generatedClass == null) {
                this.generatedClass = generateClass(callStack, interpreter);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.generatedClass;
    }

    @Override // bsh.SimpleNode
    public String toString() {
        return super.toString() + ": " + this.name;
    }
}
