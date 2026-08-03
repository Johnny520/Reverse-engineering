package com.abc.internal.probe;

import android.content.Context;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: b0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0562l {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f1660a;

    /* JADX INFO: renamed from: b */
    public final DexKitBridge f1661b;

    /* JADX INFO: renamed from: c */
    public final Context f1662c;

    /* JADX INFO: renamed from: d */
    public final String f1663d;

    public C0562l(ClassLoader classLoader, DexKitBridge dexKitBridge, Context context, String str) {
        AbstractC0307g.m703e(classLoader, "classLoader");
        AbstractC0307g.m703e(context, "appContext");
        this.f1660a = classLoader;
        this.f1661b = dexKitBridge;
        this.f1662c = context;
        this.f1663d = str;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1372a(String... strArr) {
        DexKitBridge dexKitBridge = this.f1661b;
        if (dexKitBridge == null) {
            return false;
        }
        AtomicBoolean atomicBoolean = DexKitManager.f1646a;
        return DexKitManager.m1364c(dexKitBridge, this.f1660a, (String[]) Arrays.copyOf(strArr, strArr.length)) != null;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1373b(String str) {
        Object objM116u;
        AbstractC0307g.m703e(str, "name");
        ClassLoader classLoader = this.f1660a;
        AbstractC0307g.m703e(classLoader, "cl");
        try {
            objM116u = Class.forName(str, false, classLoader);
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        if (objM116u instanceof C0140f) {
            objM116u = null;
        }
        return ((Class) objM116u) != null;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1374c(String... strArr) {
        Object objM116u;
        Object objM116u2;
        if (this.f1661b == null) {
            return false;
        }
        try {
            FindMethod findMethod = new FindMethod();
            MethodMatcher methodMatcher = new MethodMatcher();
            methodMatcher.usingStrings((String[]) Arrays.copyOf(strArr, strArr.length));
            findMethod.matcher(methodMatcher);
            objM116u = Boolean.valueOf(!r1.findMethod(findMethod).isEmpty());
        } catch (Throwable th) {
            objM116u = AbstractC0040p.m116u(th);
        }
        Object obj = Boolean.FALSE;
        if (objM116u instanceof C0140f) {
            objM116u = obj;
        }
        if (!((Boolean) objM116u).booleanValue()) {
            try {
                FindMethod findMethod2 = new FindMethod();
                MethodMatcher methodMatcher2 = new MethodMatcher();
                methodMatcher2.usingEqStrings((String[]) Arrays.copyOf(strArr, strArr.length));
                findMethod2.matcher(methodMatcher2);
                objM116u2 = Boolean.valueOf(!r1.findMethod(findMethod2).isEmpty());
            } catch (Throwable th2) {
                objM116u2 = AbstractC0040p.m116u(th2);
            }
            Object obj2 = Boolean.FALSE;
            if (objM116u2 instanceof C0140f) {
                objM116u2 = obj2;
            }
            if (!((Boolean) objM116u2).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0562l)) {
            return false;
        }
        C0562l c0562l = (C0562l) obj;
        return AbstractC0307g.m699a(this.f1660a, c0562l.f1660a) && AbstractC0307g.m699a(this.f1661b, c0562l.f1661b) && AbstractC0307g.m699a(this.f1662c, c0562l.f1662c) && AbstractC0307g.m699a(this.f1663d, c0562l.f1663d);
    }

    public final int hashCode() {
        int iHashCode = this.f1660a.hashCode() * 31;
        DexKitBridge dexKitBridge = this.f1661b;
        int iHashCode2 = (this.f1662c.hashCode() + ((iHashCode + (dexKitBridge == null ? 0 : dexKitBridge.hashCode())) * 31)) * 31;
        String str = this.f1663d;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ProbeContext(classLoader=" + this.f1660a + ", bridge=" + this.f1661b + ", appContext=" + this.f1662c + ", modulePath=" + this.f1663d + ")";
    }
}
