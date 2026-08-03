package p049b0;

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

    public C0562l(ClassLoader r2, DexKitBridge r3, Context r4, String r5) {
        AbstractC0307g.m703e(r2, "classLoader");
        AbstractC0307g.m703e(r4, "appContext");
        this.f1660a = r2;
        this.f1661b = r3;
        this.f1662c = r4;
        this.f1663d = r5;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m1372a(String... r4) {
        DexKitBridge r1 = this.f1661b;
        if (r1 != null) goto L5;
        return false;
    L5:
        AtomicBoolean r2 = AbstractC0553c.f1646a;
        String[] r42 = (String[]) Arrays.copyOf(r4, r4.length);
        if (AbstractC0553c.m1364c(r1, this.f1660a, r42) == null) goto L9;
        return true;
    L9:
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1373b(String r3) {
        AbstractC0307g.m703e(r3, "name");
        ClassLoader r02 = this.f1660a;
        AbstractC0307g.m703e(r02, "cl");
        Object r32 = Class.forName(r3, false, r02);     // Catch: Throwable -> L5
    L8:
        if ((r32 instanceof C0140f) == false) goto L11;
        r32 = null;
    L11:
        if (((Class) r32) == null) goto L16;
        return true;
    L16:
        return false;
    L5:
        th = move-exception;
        r32 = AbstractC0040p.m116u(th);
        goto L8
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1374c(String... r7) {
        if (this.f1661b != null) goto L28;
        return false;
    L28:
        FindMethod r3 = new FindMethod();     // Catch: Throwable -> L8
        MethodMatcher r4 = new MethodMatcher();     // Catch: Throwable -> L8
        r4.usingStrings((String[]) Arrays.copyOf(r7, r7.length));     // Catch: Throwable -> L8
        r3.matcher(r4);     // Catch: Throwable -> L8
        Object r32 = Boolean.valueOf(!r1.findMethod(r3).isEmpty());     // Catch: Throwable -> L8
    L10:
        Object r42 = Boolean.FALSE;
        if ((r32 instanceof C0140f) == false) goto L14;
        r32 = r42;
    L14:
        if (((Boolean) r32).booleanValue() == true) goto L25;
        FindMethod r33 = new FindMethod();     // Catch: Throwable -> L17
        MethodMatcher r43 = new MethodMatcher();     // Catch: Throwable -> L17
        r43.usingEqStrings((String[]) Arrays.copyOf(r7, r7.length));     // Catch: Throwable -> L17
        r33.matcher(r43);     // Catch: Throwable -> L17
        Object r72 = Boolean.valueOf(!r1.findMethod(r33).isEmpty());     // Catch: Throwable -> L17
    L19:
        Object r1 = Boolean.FALSE;
        if ((r72 instanceof C0140f) == false) goto L23;
        r72 = r1;
    L23:
        if (((Boolean) r72).booleanValue() == true) goto L25;
        return false;
    L17:
        th = move-exception;
        r72 = AbstractC0040p.m116u(th);
    L25:
        return true;
    L8:
        th = move-exception;
        r32 = AbstractC0040p.m116u(th);
        goto L10
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C0562l) == true) goto L8;
        return false;
    L8:
        C0562l r52 = (C0562l) r5;
        ClassLoader r1 = r52.f1660a;
        if (AbstractC0307g.m699a(this.f1660a, r1) == true) goto L12;
        return false;
    L12:
        if (AbstractC0307g.m699a(this.f1661b, r52.f1661b) == true) goto L15;
        return false;
    L15:
        if (AbstractC0307g.m699a(this.f1662c, r52.f1662c) == true) goto L18;
        return false;
    L18:
        if (AbstractC0307g.m699a(this.f1663d, r52.f1663d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int hashCode() {
        int r02 = this.f1660a.hashCode() * 31;
        int r1 = 0;
        DexKitBridge r2 = this.f1661b;
        if (r2 != null) goto L5;
        int r22 = 0;
    L6:
        int r23 = (this.f1662c.hashCode() + ((r02 + r22) * 31)) * 31;
        String r03 = this.f1663d;
        if (r03 == null) goto L11;
        r1 = r03.hashCode();
    L11:
        return r23 + r1;
    L5:
        r22 = r2.hashCode();
        goto L6
    }

    public final String toString() {
        return "ProbeContext(classLoader=" + this.f1660a + ", bridge=" + this.f1661b + ", appContext=" + this.f1662c + ", modulePath=" + this.f1663d + ")";
    }
}
