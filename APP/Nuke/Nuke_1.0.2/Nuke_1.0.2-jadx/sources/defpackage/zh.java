package defpackage;

import android.app.Activity;
import android.view.InputDevice;
import android.view.KeyEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zh implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ zh(int i, Object obj, Object obj2) {
        this.h = i;
        this.j = obj;
        this.i = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    @Override // defpackage.in0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Object obj) {
        boolean z;
        long j;
        Object x92Var;
        bj0 bj0Var;
        Object x92Var2;
        bj0 bj0Var2;
        boolean zG;
        int i = 23;
        int i2 = 22;
        int i3 = 6;
        int i4 = 2;
        int i5 = 4;
        int i6 = 3;
        int i7 = 5;
        int i8 = 1;
        switch (this.h) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = ((s62) this.j).a;
                xk1 xk1Var = (xk1) this.i;
                xk1Var.setValue(zBooleanValue ? np2.d0((Set) xk1Var.getValue(), str) : np2.a0((Set) xk1Var.getValue(), str));
                return a83.a;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                String str2 = ((g33) this.j).a;
                xk1 xk1Var2 = (xk1) this.i;
                xk1Var2.setValue(zBooleanValue2 ? np2.d0((Set) xk1Var2.getValue(), str2) : np2.a0((Set) xk1Var2.getValue(), str2));
                return a83.a;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                return ((ye) this.j).g(Integer.valueOf(iIntValue), ((List) this.i).get(iIntValue));
            case 3:
                KeyEvent keyEvent = ((d51) obj).a;
                if (((t91) this.j).a() == tr0.i && keyEvent.getKeyCode() == 4 && qp0.C(keyEvent) == 1) {
                    ((b03) this.i).g(null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                bs2 bs2Var = (bs2) obj;
                synchronized (ds2.c) {
                    j = ds2.e;
                    ds2.e = 1 + j;
                }
                return new wk1(j, bs2Var, (in0) this.j, (in0) this.i);
            case 5:
                int iIntValue2 = ((Number) obj).intValue();
                return ((ye) this.j).g(Integer.valueOf(iIntValue2), ((List) this.i).get(iIntValue2));
            case AIChatConfig.DefaultContextRounds /* 6 */:
                f90 f90Var = (f90) this.j;
                Object obj2 = f90Var.b;
                mp mpVar = (mp) this.i;
                synchronized (obj2) {
                    ((ArrayList) f90Var.c).remove(mpVar);
                }
                return a83.a;
            case 7:
                Class cls = (Class) obj;
                sg1 sg1Var = (sg1) ((zf1) this.j);
                yf1 yf1Var = (yf1) this.i;
                yf1Var.getClass();
                i51 i51Var = tl.e;
                try {
                    x92Var = mg.t0(cls.getDeclaredMethods());
                    break;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                Throwable thA = y92.a(x92Var);
                if (thA != null) {
                    tp0.S("Failed to get declared methods in " + i51Var + " because got an exception.", thA);
                }
                if (x92Var instanceof x92) {
                    x92Var = null;
                }
                Object obj3 = (List) x92Var;
                if (obj3 == null) {
                    obj3 = be0.h;
                }
                int i9 = 7;
                int i10 = 8;
                int i11 = 9;
                bj0 bj0VarY = tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(new bj0(tl.i(new ng(1, obj3), sg1Var, yf1Var), gg1.i, 1), yf1Var, "parameters", sg1Var.g, new cg1(yf1Var, i4)), yf1Var, "parametersNot", sg1Var.h, new cg1(yf1Var, i7)), yf1Var, "parametersCondition", sg1Var.i, new z81(i2)), yf1Var, "parameterCount", sg1Var.l, new z81(i)), yf1Var, "parameterCountCondition", null, new z81(24)), yf1Var, "typeParameters", sg1Var.j, new z81(25)), yf1Var, "typeParametersNot", sg1Var.k, new z81(26)), yf1Var, "exceptionTypes", sg1Var.m, new cg1(yf1Var, i3)), yf1Var, "exceptionTypesNot", sg1Var.n, new cg1(yf1Var, i9)), yf1Var, "genericExceptionTypes", sg1Var.o, new z81(28)), yf1Var, "genericExceptionTypesNot", sg1Var.p, new z81(i9)), yf1Var, "genericParameters", sg1Var.q, new z81(i10)), yf1Var, "genericParametersNot", sg1Var.r, new z81(i11));
                int i12 = 11;
                int i13 = 12;
                int i14 = 10;
                byte b = 0;
                bj0 bj0Var3 = new bj0(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(new bj0(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(bj0VarY, yf1Var, "isVarArgs", null, new z81(i12)), yf1Var, "isVarArgsNot", null, new z81(i13)), yf1Var, "parameterAnnotations", sg1Var.s, new cg1(yf1Var, i6)), yf1Var, "parameterAnnotationsNot", sg1Var.t, new cg1(yf1Var, i5)), yf1Var, "annotatedReturnType", sg1Var.u, new z81(13)), yf1Var, "annotatedReturnTypeNot", sg1Var.v, new z81(14)), yf1Var, "annotatedReceiverType", sg1Var.w, new z81(15)), yf1Var, "annotatedReceiverTypeNot", sg1Var.x, new z81(16)), yf1Var, "annotatedParameterTypes", sg1Var.y, new z81(17)), yf1Var, "annotatedParameterTypesNot", sg1Var.z, new z81(19)), yf1Var, "annotatedExceptionTypes", sg1Var.A, new z81(20)), yf1Var, "annotatedExceptionTypesNot", sg1Var.B, new z81(21)), gg1.k, 1), yf1Var, "returnType", sg1Var.C, new cg1(yf1Var, 0)), yf1Var, "returnTypeCondition", sg1Var.D, new z81(i14)), yf1Var, "genericReturnType", null, new z81(18)), yf1Var, "genericReturnTypeCondition", null, new z81(27)), yf1Var, "isBridge", null, new eg1(b, i7)), yf1Var, "isBridgeNot", null, new eg1(b, i10)), yf1Var, "isDefault", null, new eg1(b, i11)), yf1Var, "isDefaultNot", null, new eg1(b, i14)), yf1Var, "defaultValue", null, new eg1(b, i12)), yf1Var, "defaultValueCondition", null, new eg1(b, i13)), new nx0(25), 1);
                bt btVarA = d72.a(Method.class);
                if (btVarA.equals(d72.a(Method.class))) {
                    bj0Var = new bj0(bj0Var3, new hg1(yf1Var, 3), 1);
                } else if (btVarA.equals(d72.a(Constructor.class))) {
                    bj0Var = new bj0(bj0Var3, new hg1(yf1Var, 4), 1);
                } else {
                    if (!btVarA.equals(d72.a(Field.class))) {
                        c80.u("Unsupported member type: ", bj0Var3);
                        return null;
                    }
                    bj0Var = new bj0(bj0Var3, new hg1(yf1Var, 5), 1);
                }
                return wo2.T(bj0Var);
            case 8:
                Class cls2 = (Class) obj;
                hi0 hi0Var = (hi0) this.j;
                yf1 yf1Var2 = (yf1) this.i;
                yf1Var2.getClass();
                i51 i51Var2 = tl.e;
                try {
                    x92Var2 = mg.t0(cls2.getDeclaredFields());
                    break;
                } catch (Throwable th2) {
                    x92Var2 = new x92(th2);
                }
                Throwable thA2 = y92.a(x92Var2);
                if (thA2 != null) {
                    tp0.S("Failed to get declared fields in " + i51Var2 + " because got an exception.", thA2);
                }
                if (x92Var2 instanceof x92) {
                    x92Var2 = null;
                }
                Object obj4 = (List) x92Var2;
                if (obj4 == null) {
                    obj4 = be0.h;
                }
                bj0 bj0Var4 = new bj0(tl.y(tl.y(tl.y(tl.y(tl.y(tl.y(new bj0(tl.i(new ng(1, obj4), hi0Var, yf1Var2), gg1.j, 1), yf1Var2, "isEnumConstant", null, new z81(i4)), yf1Var2, "isEnumConstantNot", null, new z81(i6)), yf1Var2, "type", hi0Var.g, new cg1(yf1Var2, i8)), yf1Var2, "typeCondition", hi0Var.h, new z81(i5)), yf1Var2, "genericType", null, new z81(i7)), yf1Var2, "genericTypeCondition", null, new z81(i3)), new nx0(25), 1);
                bt btVarA2 = d72.a(Field.class);
                if (btVarA2.equals(d72.a(Method.class))) {
                    bj0Var2 = new bj0(bj0Var4, new hg1(yf1Var2, 0), 1);
                } else if (btVarA2.equals(d72.a(Constructor.class))) {
                    bj0Var2 = new bj0(bj0Var4, new hg1(yf1Var2, 1), 1);
                } else {
                    if (!btVarA2.equals(d72.a(Field.class))) {
                        c80.u("Unsupported member type: ", bj0Var4);
                        return null;
                    }
                    bj0Var2 = new bj0(bj0Var4, new hg1(yf1Var2, 2), 1);
                }
                return wo2.T(bj0Var2);
            case 9:
                ((Activity) this.j).runOnUiThread(new y4(3, (o72) this.i));
                return a83.a;
            case 10:
                mp mpVar2 = (mp) this.i;
                if (((AtomicBoolean) this.j).compareAndSet(false, true) && mpVar2.y()) {
                    mpVar2.h(obj);
                }
                return a83.a;
            case 11:
                KeyEvent keyEvent2 = ((d51) obj).a;
                yk0 yk0Var = (yk0) this.j;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && qp0.C(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (sp0.l(19, keyEvent2)) {
                        zG = ((bl0) yk0Var).g(5, true);
                    } else if (sp0.l(20, keyEvent2)) {
                        zG = ((bl0) yk0Var).g(6, true);
                    } else if (sp0.l(21, keyEvent2)) {
                        zG = ((bl0) yk0Var).g(3, true);
                    } else if (sp0.l(22, keyEvent2)) {
                        zG = ((bl0) yk0Var).g(4, true);
                    } else if (sp0.l(23, keyEvent2)) {
                        bt2 bt2Var = ((t91) this.i).c;
                        if (bt2Var != null) {
                            ((v60) bt2Var).b();
                        }
                        zG = true;
                    } else {
                        zG = false;
                    }
                }
                return Boolean.valueOf(zG);
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                String str3 = ((jc3) this.j).a;
                xk1 xk1Var3 = (xk1) this.i;
                xk1Var3.setValue(zBooleanValue3 ? np2.d0((Set) xk1Var3.getValue(), str3) : np2.a0((Set) xk1Var3.getValue(), str3));
                return a83.a;
        }
    }
}
