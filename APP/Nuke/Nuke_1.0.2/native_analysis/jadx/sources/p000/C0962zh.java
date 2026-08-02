package p000;

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
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: zh */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0962zh implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f13902h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f13903i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f13904j;

    public /* synthetic */ C0962zh(int i, Object obj, Object obj2) {
        this.f13902h = i;
        this.f13904j = obj;
        this.f13903i = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo5j(Object obj) {
        boolean z;
        long j;
        Object x92Var;
        bj0 bj0Var;
        Object x92Var2;
        bj0 bj0Var2;
        boolean zM562g;
        int i = 23;
        int i2 = 22;
        int i3 = 6;
        int i4 = 2;
        int i5 = 4;
        int i6 = 3;
        int i7 = 5;
        int i8 = 1;
        switch (this.f13902h) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = ((s62) this.f13904j).f9944a;
                xk1 xk1Var = (xk1) this.f13903i;
                xk1Var.setValue(zBooleanValue ? np2.m3355d0((Set) xk1Var.getValue(), str) : np2.m3352a0((Set) xk1Var.getValue(), str));
                return a83.f116a;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                String str2 = ((g33) this.f13904j).f3298a;
                xk1 xk1Var2 = (xk1) this.f13903i;
                xk1Var2.setValue(zBooleanValue2 ? np2.m3355d0((Set) xk1Var2.getValue(), str2) : np2.m3352a0((Set) xk1Var2.getValue(), str2));
                return a83.f116a;
            case 2:
                int iIntValue = ((Number) obj).intValue();
                return ((C0920ye) this.f13904j).mo12g(Integer.valueOf(iIntValue), ((List) this.f13903i).get(iIntValue));
            case 3:
                KeyEvent keyEvent = ((d51) obj).f1868a;
                if (((t91) this.f13904j).m5143a() == tr0.f10907i && keyEvent.getKeyCode() == 4 && qp0.m4222C(keyEvent) == 1) {
                    ((b03) this.f13903i).m343g(null);
                    z = true;
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                bs2 bs2Var = (bs2) obj;
                synchronized (ds2.f2181c) {
                    j = ds2.f2183e;
                    ds2.f2183e = 1 + j;
                }
                return new wk1(j, bs2Var, (in0) this.f13904j, (in0) this.f13903i);
            case 5:
                int iIntValue2 = ((Number) obj).intValue();
                return ((C0920ye) this.f13904j).mo12g(Integer.valueOf(iIntValue2), ((List) this.f13903i).get(iIntValue2));
            case AIChatConfig.DefaultContextRounds /* 6 */:
                f90 f90Var = (f90) this.f13904j;
                Object obj2 = f90Var.f2863b;
                C0469mp c0469mp = (C0469mp) this.f13903i;
                synchronized (obj2) {
                    ((ArrayList) f90Var.f2864c).remove(c0469mp);
                }
                return a83.f116a;
            case 7:
                Class cls = (Class) obj;
                sg1 sg1Var = (sg1) ((zf1) this.f13904j);
                yf1 yf1Var = (yf1) this.f13903i;
                yf1Var.getClass();
                i51 i51Var = AbstractC0738tl.f10824e;
                try {
                    x92Var = AbstractC0460mg.m3105t0(cls.getDeclaredMethods());
                    break;
                } catch (Throwable th) {
                    x92Var = new x92(th);
                }
                Throwable thM6237a = y92.m6237a(x92Var);
                if (thM6237a != null) {
                    tp0.m5355S("Failed to get declared methods in " + i51Var + " because got an exception.", thM6237a);
                }
                if (x92Var instanceof x92) {
                    x92Var = null;
                }
                Object obj3 = (List) x92Var;
                if (obj3 == null) {
                    obj3 = be0.f819h;
                }
                int i9 = 7;
                int i10 = 8;
                int i11 = 9;
                bj0 bj0VarM5326y = AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(new bj0(AbstractC0738tl.m5310i(new C0497ng(1, obj3), sg1Var, yf1Var), gg1.f3504i, 1), yf1Var, "parameters", sg1Var.f10115g, new cg1(yf1Var, i4)), yf1Var, "parametersNot", sg1Var.f10116h, new cg1(yf1Var, i7)), yf1Var, "parametersCondition", sg1Var.f10117i, new z81(i2)), yf1Var, "parameterCount", sg1Var.f10120l, new z81(i)), yf1Var, "parameterCountCondition", null, new z81(24)), yf1Var, "typeParameters", sg1Var.f10118j, new z81(25)), yf1Var, "typeParametersNot", sg1Var.f10119k, new z81(26)), yf1Var, "exceptionTypes", sg1Var.f10121m, new cg1(yf1Var, i3)), yf1Var, "exceptionTypesNot", sg1Var.f10122n, new cg1(yf1Var, i9)), yf1Var, "genericExceptionTypes", sg1Var.f10123o, new z81(28)), yf1Var, "genericExceptionTypesNot", sg1Var.f10124p, new z81(i9)), yf1Var, "genericParameters", sg1Var.f10125q, new z81(i10)), yf1Var, "genericParametersNot", sg1Var.f10126r, new z81(i11));
                int i12 = 11;
                int i13 = 12;
                int i14 = 10;
                byte b = 0;
                bj0 bj0Var3 = new bj0(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(new bj0(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(bj0VarM5326y, yf1Var, "isVarArgs", null, new z81(i12)), yf1Var, "isVarArgsNot", null, new z81(i13)), yf1Var, "parameterAnnotations", sg1Var.f10127s, new cg1(yf1Var, i6)), yf1Var, "parameterAnnotationsNot", sg1Var.f10128t, new cg1(yf1Var, i5)), yf1Var, "annotatedReturnType", sg1Var.f10129u, new z81(13)), yf1Var, "annotatedReturnTypeNot", sg1Var.f10130v, new z81(14)), yf1Var, "annotatedReceiverType", sg1Var.f10131w, new z81(15)), yf1Var, "annotatedReceiverTypeNot", sg1Var.f10132x, new z81(16)), yf1Var, "annotatedParameterTypes", sg1Var.f10133y, new z81(17)), yf1Var, "annotatedParameterTypesNot", sg1Var.f10134z, new z81(19)), yf1Var, "annotatedExceptionTypes", sg1Var.f10111A, new z81(20)), yf1Var, "annotatedExceptionTypesNot", sg1Var.f10112B, new z81(21)), gg1.f3506k, 1), yf1Var, "returnType", sg1Var.f10113C, new cg1(yf1Var, 0)), yf1Var, "returnTypeCondition", sg1Var.f10114D, new z81(i14)), yf1Var, "genericReturnType", null, new z81(18)), yf1Var, "genericReturnTypeCondition", null, new z81(27)), yf1Var, "isBridge", null, new eg1(b, i7)), yf1Var, "isBridgeNot", null, new eg1(b, i10)), yf1Var, "isDefault", null, new eg1(b, i11)), yf1Var, "isDefaultNot", null, new eg1(b, i14)), yf1Var, "defaultValue", null, new eg1(b, i12)), yf1Var, "defaultValueCondition", null, new eg1(b, i13)), new nx0(25), 1);
                C0067bt c0067btM967a = d72.m967a(Method.class);
                if (c0067btM967a.equals(d72.m967a(Method.class))) {
                    bj0Var = new bj0(bj0Var3, new hg1(yf1Var, 3), 1);
                } else if (c0067btM967a.equals(d72.m967a(Constructor.class))) {
                    bj0Var = new bj0(bj0Var3, new hg1(yf1Var, 4), 1);
                } else {
                    if (!c0067btM967a.equals(d72.m967a(Field.class))) {
                        c80.m677u("Unsupported member type: ", bj0Var3);
                        return null;
                    }
                    bj0Var = new bj0(bj0Var3, new hg1(yf1Var, 5), 1);
                }
                return wo2.m5947T(bj0Var);
            case 8:
                Class cls2 = (Class) obj;
                hi0 hi0Var = (hi0) this.f13904j;
                yf1 yf1Var2 = (yf1) this.f13903i;
                yf1Var2.getClass();
                i51 i51Var2 = AbstractC0738tl.f10824e;
                try {
                    x92Var2 = AbstractC0460mg.m3105t0(cls2.getDeclaredFields());
                    break;
                } catch (Throwable th2) {
                    x92Var2 = new x92(th2);
                }
                Throwable thM6237a2 = y92.m6237a(x92Var2);
                if (thM6237a2 != null) {
                    tp0.m5355S("Failed to get declared fields in " + i51Var2 + " because got an exception.", thM6237a2);
                }
                if (x92Var2 instanceof x92) {
                    x92Var2 = null;
                }
                Object obj4 = (List) x92Var2;
                if (obj4 == null) {
                    obj4 = be0.f819h;
                }
                bj0 bj0Var4 = new bj0(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(AbstractC0738tl.m5326y(new bj0(AbstractC0738tl.m5310i(new C0497ng(1, obj4), hi0Var, yf1Var2), gg1.f3505j, 1), yf1Var2, "isEnumConstant", null, new z81(i4)), yf1Var2, "isEnumConstantNot", null, new z81(i6)), yf1Var2, "type", hi0Var.f4030g, new cg1(yf1Var2, i8)), yf1Var2, "typeCondition", hi0Var.f4031h, new z81(i5)), yf1Var2, "genericType", null, new z81(i7)), yf1Var2, "genericTypeCondition", null, new z81(i3)), new nx0(25), 1);
                C0067bt c0067btM967a2 = d72.m967a(Field.class);
                if (c0067btM967a2.equals(d72.m967a(Method.class))) {
                    bj0Var2 = new bj0(bj0Var4, new hg1(yf1Var2, 0), 1);
                } else if (c0067btM967a2.equals(d72.m967a(Constructor.class))) {
                    bj0Var2 = new bj0(bj0Var4, new hg1(yf1Var2, 1), 1);
                } else {
                    if (!c0067btM967a2.equals(d72.m967a(Field.class))) {
                        c80.m677u("Unsupported member type: ", bj0Var4);
                        return null;
                    }
                    bj0Var2 = new bj0(bj0Var4, new hg1(yf1Var2, 2), 1);
                }
                return wo2.m5947T(bj0Var2);
            case 9:
                ((Activity) this.f13904j).runOnUiThread(new RunnableC0910y4(3, (o72) this.f13903i));
                return a83.f116a;
            case 10:
                C0469mp c0469mp2 = (C0469mp) this.f13903i;
                if (((AtomicBoolean) this.f13904j).compareAndSet(false, true) && c0469mp2.m3155y()) {
                    c0469mp2.mo2509h(obj);
                }
                return a83.f116a;
            case 11:
                KeyEvent keyEvent2 = ((d51) obj).f1868a;
                yk0 yk0Var = (yk0) this.f13904j;
                InputDevice device = keyEvent2.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent2.getSource() == 33554433) && qp0.m4222C(keyEvent2) == 2 && keyEvent2.getSource() != 257)) {
                    if (sp0.m4950l(19, keyEvent2)) {
                        zM562g = ((bl0) yk0Var).m562g(5, true);
                    } else if (sp0.m4950l(20, keyEvent2)) {
                        zM562g = ((bl0) yk0Var).m562g(6, true);
                    } else if (sp0.m4950l(21, keyEvent2)) {
                        zM562g = ((bl0) yk0Var).m562g(3, true);
                    } else if (sp0.m4950l(22, keyEvent2)) {
                        zM562g = ((bl0) yk0Var).m562g(4, true);
                    } else if (sp0.m4950l(23, keyEvent2)) {
                        bt2 bt2Var = ((t91) this.f13903i).f10624c;
                        if (bt2Var != null) {
                            ((v60) bt2Var).m5626b();
                        }
                        zM562g = true;
                    } else {
                        zM562g = false;
                    }
                }
                return Boolean.valueOf(zM562g);
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                String str3 = ((jc3) this.f13904j).f4964a;
                xk1 xk1Var3 = (xk1) this.f13903i;
                xk1Var3.setValue(zBooleanValue3 ? np2.m3355d0((Set) xk1Var3.getValue(), str3) : np2.m3352a0((Set) xk1Var3.getValue(), str3));
                return a83.f116a;
        }
    }
}
