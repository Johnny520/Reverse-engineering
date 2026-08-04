package yyds;

import io.github.libxposed.api.XposedInterface;
import java.util.ArrayDeque;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᲀᛷᲈᲀ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2043 implements XposedInterface.Hooker {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f10160;

    public final Object intercept(XposedInterface.Chain chain) {
        switch (this.f10160) {
            case 0:
                ThreadLocal threadLocal = C1680.f8567;
                AbstractC2328.m4341(-957287653606254L);
                C1509.f7142.getClass();
                if (!C1509.m3104()) {
                    List args = chain.getArgs();
                    AbstractC2328.m4341(-957313423410030L);
                    return chain.proceed(args.toArray(new Object[0]));
                }
                Integer num = (Integer) threadLocal.get();
                threadLocal.set(Integer.valueOf((num != null ? num.intValue() : 0) + 1));
                try {
                    List args2 = chain.getArgs();
                    AbstractC2328.m4341(-957369257984878L);
                    return chain.proceed(args2.toArray(new Object[0]));
                } finally {
                    Integer num2 = (Integer) threadLocal.get();
                    int iIntValue = (num2 != null ? num2.intValue() : 1) - 1;
                    if (iIntValue <= 0) {
                        threadLocal.remove();
                    } else {
                        threadLocal.set(Integer.valueOf(iIntValue));
                    }
                }
            case 1:
                ThreadLocal threadLocal2 = C2651.f13049;
                AbstractC2328.m4341(-974806825206638L);
                C1509.f7142.getClass();
                if (!C1509.m3117()) {
                    List args3 = chain.getArgs();
                    AbstractC2328.m4341(-974832595010414L);
                    return chain.proceed(args3.toArray(new Object[0]));
                }
                Integer num3 = (Integer) threadLocal2.get();
                threadLocal2.set(Integer.valueOf((num3 != null ? num3.intValue() : 0) + 1));
                try {
                    List args4 = chain.getArgs();
                    AbstractC2328.m4341(-974888429585262L);
                    return chain.proceed(args4.toArray(new Object[0]));
                } finally {
                    Integer num4 = (Integer) threadLocal2.get();
                    int iIntValue2 = (num4 != null ? num4.intValue() : 1) - 1;
                    if (iIntValue2 <= 0) {
                        threadLocal2.remove();
                    } else {
                        threadLocal2.set(Integer.valueOf(iIntValue2));
                    }
                }
            default:
                ThreadLocal threadLocal3 = C1900.f9619;
                AbstractC2328.m4341(-915553456391022L);
                List args5 = chain.getArgs();
                AbstractC2328.m4341(-915579226194798L);
                Object objM3281 = AbstractC1595.m3281(args5);
                if (objM3281 == null) {
                    List args6 = chain.getArgs();
                    AbstractC2328.m4341(-915635060769646L);
                    return chain.proceed(args6.toArray(new Object[0]));
                }
                ArrayDeque arrayDeque = (ArrayDeque) threadLocal3.get();
                if (arrayDeque == null) {
                    arrayDeque = new ArrayDeque();
                    threadLocal3.set(arrayDeque);
                }
                arrayDeque.addLast(objM3281);
                try {
                    List args7 = chain.getArgs();
                    AbstractC2328.m4341(-915690895344494L);
                    return chain.proceed(args7.toArray(new Object[0]));
                } finally {
                    if (!arrayDeque.isEmpty()) {
                        arrayDeque.removeLast();
                    }
                    if (arrayDeque.isEmpty()) {
                        threadLocal3.remove();
                    }
                }
        }
    }
}
