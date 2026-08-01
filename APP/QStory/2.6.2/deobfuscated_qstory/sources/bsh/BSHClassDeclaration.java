package bsh;

import androidx.activity.AbstractC0053;
import bsh.security.SecurityError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p281.C8371;
import p281.C8372;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
        BshMethod bshMethodM5405;
        int i2 = 0;
        ArrayList<BshMethod> arrayList = new ArrayList(0);
        if (this.extend) {
            Class<?> cls2 = ((BSHAmbiguousName) jjtGetChild(0)).toClass(callStack, interpreter);
            try {
                Iterator it = Interpreter.mainSecurityGuard.f23118.iterator();
                while (it.hasNext()) {
                    ((C8372) it.next()).getClass();
                }
                if (AbstractC2666.m5387(cls2)) {
                    if (AbstractC2666.m5412(cls2).hasModifier("final")) {
                        throw new EvalException("Cannot inherit from final class ".concat(cls2.getName()), null, null);
                    }
                    arrayList.addAll((Collection) Stream.of((Object[]) AbstractC2666.m5415(cls2)).filter(new C2641(i2)).collect(Collectors.toList()));
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
                throw new EvalException(AbstractC0053.m146(new StringBuilder("Type: "), bSHAmbiguousName.text, " is not an interface!"), this, callStack);
            }
            try {
                C8371 c8371 = Interpreter.mainSecurityGuard;
                Class cls4 = clsArr[i2];
                Iterator it2 = c8371.f23118.iterator();
                while (it2.hasNext()) {
                    ((C8372) it2.next()).getClass();
                    if (cls4 == C8372.class) {
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
        if (C2652.f7942 == null) {
            C2652.f7942 = new C2652();
        }
        C2652 c2652 = C2652.f7942;
        String str = this.name;
        Modifiers modifiers = this.modifiers;
        ClassGenerator$Type classGenerator$Type = this.type;
        c2652.getClass();
        Class<?> clsM5314 = C2652.m5314(str, modifiers, clsArr, cls, bSHBlock, classGenerator$Type, callStack, interpreter);
        for (BshMethod bshMethod : arrayList) {
            String name = bshMethod.getName();
            Class<?>[] parameterTypes = bshMethod.getParameterTypes();
            if (AbstractC2666.m5387(clsM5314)) {
                bshMethodM5405 = AbstractC2666.m5405(AbstractC2666.m5400(clsM5314), name, parameterTypes, true);
                if (bshMethodM5405 == null && !clsM5314.isInterface()) {
                    bshMethodM5405 = AbstractC2666.m5405(AbstractC2666.m5399(AbstractC2666.m5409(clsM5314)), name, parameterTypes, true);
                }
            } else {
                bshMethodM5405 = null;
            }
            if (bshMethodM5405 != null) {
                throw new EvalException("Cannot override " + bshMethod.getName() + "() in " + AbstractC2628.m5280(cls) + " overridden method is final", null, null);
            }
        }
        return clsM5314;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$generateClass$0(BshMethod bshMethod) {
        return bshMethod.hasModifier("final") && !bshMethod.hasModifier("private");
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC2618
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
