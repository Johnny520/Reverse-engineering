package p150k1;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import p010a9.InterfaceC0173a;
import p172l8.AbstractC4693f;
import p185m8.AbstractC5070c0;
import p185m8.AbstractC5106t;

/* JADX INFO: renamed from: k1.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3912e {
    /* JADX INFO: renamed from: a */
    public static final void m15584a(StringBuilder sb2, C3907a c3907a) {
        List listM15588e = m15588e(c3907a);
        int size = listM15588e.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3911d c3911d = (C3911d) listM15588e.get(i10);
            sb2.append("\tat $$compose.m$");
            sb2.append(c3911d.m15581c());
            sb2.append("(SourceFile:1)");
            sb2.append('\n');
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a A[PHI: r9
  0x003a: PHI (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v13 java.lang.String) binds: [B:7:0x0027, B:12:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00be  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m15585b(java.lang.StringBuilder r12, p150k1.C3907a r13) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p150k1.AbstractC3912e.m15585b(java.lang.StringBuilder, k1.a):void");
    }

    /* JADX INFO: renamed from: c */
    public static final void m15586c(StringBuilder sb2, C3907a c3907a) {
        if (c3907a.m15562b()) {
            m15585b(sb2, c3907a);
        } else {
            m15584a(sb2, c3907a);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final Throwable m15587d(Throwable th, InterfaceC0173a interfaceC0173a) throws IllegalAccessException, InvocationTargetException {
        m15589f(th, interfaceC0173a);
        return th;
    }

    /* JADX INFO: renamed from: e */
    public static final List m15588e(C3907a c3907a) {
        int[] iArr = {201, 202, 204, 206, 207, Opcodes.LUSHR, -127, 126665345, 200};
        int size = c3907a.m15561a().size();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            C3911d c3911d = (C3911d) c3907a.m15561a().get(i10);
            if (!AbstractC5106t.m20700P(iArr, c3911d.m15581c())) {
                if (c3911d.m15581c() == 100) {
                    int i12 = i10 + 2;
                    if (i12 < size && ((C3911d) c3907a.m15561a().get(i12)).m15581c() == 1000) {
                        break;
                    }
                    AbstractC5070c0.m20500M(arrayList);
                } else {
                    arrayList.add(c3911d);
                }
            }
            i10 = i11;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m15589f(Throwable th, InterfaceC0173a interfaceC0173a) throws IllegalAccessException, InvocationTargetException {
        C3922o c3922o;
        List listM18754b = AbstractC4693f.m18754b(th);
        int size = listM18754b.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            if (((Throwable) listM18754b.get(i10)) instanceof C3922o) {
                return false;
            }
        }
        try {
            C3907a c3907a = (C3907a) interfaceC0173a.invoke();
            if (c3907a != null && !c3907a.m15561a().isEmpty()) {
                z10 = true;
            }
            if (z10) {
                c3907a.getClass();
                c3922o = new C3922o(c3907a);
            } else {
                c3922o = null;
            }
        } catch (Throwable th2) {
            c3922o = th2;
        }
        if (c3922o != null) {
            AbstractC4693f.m18753a(th, c3922o);
        }
        return z10;
    }
}
