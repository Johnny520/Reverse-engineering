package bsh;

import androidx.activity.AbstractC0900;
import bsh.security.SecurityError;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p297.C9201;
import p297.C9202;

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
        BshMethod bshMethodM6010;
        int i2 = 0;
        ArrayList<BshMethod> arrayList = new ArrayList(0);
        if (this.extend) {
            Class<?> cls2 = ((BSHAmbiguousName) jjtGetChild(0)).toClass(callStack, interpreter);
            try {
                Iterator it = Interpreter.mainSecurityGuard.f23462.iterator();
                while (it.hasNext()) {
                    ((C9202) it.next()).getClass();
                }
                if (AbstractC3500.m5992(cls2)) {
                    if (AbstractC3500.m6017(cls2).hasModifier("final")) {
                        throw new EvalException("Cannot inherit from final class ".concat(cls2.getName()), null, null);
                    }
                    arrayList.addAll((Collection) Stream.of((Object[]) AbstractC3500.m6020(cls2)).filter(new C3475(i2)).collect(Collectors.toList()));
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
                throw new EvalException(AbstractC0900.m711(new StringBuilder("Type: "), bSHAmbiguousName.text, " is not an interface!"), this, callStack);
            }
            try {
                C9201 c9201 = Interpreter.mainSecurityGuard;
                Class cls4 = clsArr[i2];
                Iterator it2 = c9201.f23462.iterator();
                while (it2.hasNext()) {
                    ((C9202) it2.next()).getClass();
                    if (cls4 == C9202.class) {
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
        if (C3486.f8289 == null) {
            C3486.f8289 = new C3486();
        }
        C3486 c3486 = C3486.f8289;
        String str = this.name;
        Modifiers modifiers = this.modifiers;
        ClassGenerator$Type classGenerator$Type = this.type;
        c3486.getClass();
        Class<?> clsM5919 = C3486.m5919(str, modifiers, clsArr, cls, bSHBlock, classGenerator$Type, callStack, interpreter);
        for (BshMethod bshMethod : arrayList) {
            String name = bshMethod.getName();
            Class<?>[] parameterTypes = bshMethod.getParameterTypes();
            if (AbstractC3500.m5992(clsM5919)) {
                bshMethodM6010 = AbstractC3500.m6010(AbstractC3500.m6005(clsM5919), name, parameterTypes, true);
                if (bshMethodM6010 == null && !clsM5919.isInterface()) {
                    bshMethodM6010 = AbstractC3500.m6010(AbstractC3500.m6004(AbstractC3500.m6014(clsM5919)), name, parameterTypes, true);
                }
            } else {
                bshMethodM6010 = null;
            }
            if (bshMethodM6010 != null) {
                throw new EvalException("Cannot override " + bshMethod.getName() + "() in " + AbstractC3462.m5885(cls) + " overridden method is final", null, null);
            }
        }
        return clsM5919;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$generateClass$0(BshMethod bshMethod) {
        return bshMethod.hasModifier("final") && !bshMethod.hasModifier("private");
    }

    @Override // bsh.SimpleNode, bsh.InterfaceC3452
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
