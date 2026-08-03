package p049b0;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.luckypray.dexkit.DexKitBridge;
import org.luckypray.dexkit.query.FindClass;
import org.luckypray.dexkit.query.FindMethod;
import org.luckypray.dexkit.query.matchers.ClassMatcher;
import org.luckypray.dexkit.query.matchers.MethodMatcher;
import org.luckypray.dexkit.result.ClassData;
import org.luckypray.dexkit.result.ClassDataList;
import org.luckypray.dexkit.result.MethodData;
import p001A0.AbstractC0040p;
import p007D0.C0140f;
import p009E0.C0190u;
import p029P0.InterfaceC0286l;
import p031Q0.AbstractC0307g;

/* JADX INFO: renamed from: b0.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0552b implements InterfaceC0286l {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1643a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String[] f1644b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ClassLoader f1645c;

    public /* synthetic */ C0552b(ClassLoader r1, String[] r2, int r3) {
        this.f1643a = r3;
        this.f1645c = r1;
        this.f1644b = r2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v4, types: [D0.f] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object r7) {
        String[] r2 = this.f1644b;
        ClassLoader r4 = this.f1645c;
        DexKitBridge r72 = (DexKitBridge) r7;
        switch(this.f1643a) {
            case 0: goto L41;
            case 1: goto L19;
            default: goto L4;
        };
    L4:
        AbstractC0307g.m703e(r4, "$classLoader");
        AbstractC0307g.m703e(r2, "$strings");
        AbstractC0307g.m703e(r72, "bridge");
        Object r02 = null;
        FindMethod r1 = new FindMethod();     // Catch: Throwable -> L9
        MethodMatcher r3 = new MethodMatcher();     // Catch: Throwable -> L9
        r3.usingStrings((String[]) Arrays.copyOf(r2, r2.length));     // Catch: Throwable -> L9
        r1.matcher(r3);     // Catch: Throwable -> L9
        MethodData r73 = r72.findMethod(r1).firstOrNull();     // Catch: Throwable -> L9
        if (r73 == null) goto L11;
        Object r74 = r73.getMethodInstance(r4);     // Catch: Throwable -> L9
    L14:
        if ((r74 instanceof C0140f) == true) goto L18;
        r02 = r74;
    L18:
        return (Method) r02;
    L11:
        r74 = null;
    L9:
        th = move-exception;
        r74 = AbstractC0040p.m116u(th);
        goto L14
    L19:
        AbstractC0307g.m703e(r2, "$strings");
        AbstractC0307g.m703e(r4, "$classLoader");
        AbstractC0307g.m703e(r72, "bridge");
        AtomicBoolean r03 = AbstractC0553c.f1646a;
        FindClass r04 = new FindClass();     // Catch: Throwable -> L26
        ClassMatcher r12 = new ClassMatcher();     // Catch: Throwable -> L26
        r12.usingStrings((String[]) Arrays.copyOf(r2, r2.length));     // Catch: Throwable -> L26
        r04.matcher(r12);     // Catch: Throwable -> L26
        ClassDataList r75 = r72.findClass(r04);     // Catch: Throwable -> L26
        ArrayList r05 = new ArrayList();     // Catch: Throwable -> L26
        Iterator<ClassData> r76 = r75.iterator();     // Catch: Throwable -> L26
    L22:
        if (r76.hasNext() == false) goto L28;
        String r13 = r76.next().getName();     // Catch: Throwable -> L26
        if (r13 == null) goto L22;
        r05.add(r13);     // Catch: Throwable -> L26
        goto L22
    L28:
        ?? r77 = new ArrayList();     // Catch: Throwable -> L26
        Iterator r06 = r05.iterator();     // Catch: Throwable -> L26
    L29:
        if (r06.hasNext() == false) goto L36;
        Class r14 = AbstractC0553c.m1366e(r4, (String) r06.next());     // Catch: Throwable -> L26
        if (r14 == null) goto L29;
        r77.add(r14);     // Catch: Throwable -> L26
    L36:
        C0190u r07 = C0190u.f401a;
        boolean r15 = r77 instanceof C0140f;
        ?? r78 = r77;
        if (r15 == false) goto L40;
        r78 = r07;
    L40:
        return (List) r78;
    L26:
        th = move-exception;
        r77 = AbstractC0040p.m116u(th);
        goto L36
    L41:
        AbstractC0307g.m703e(r4, "$classLoader");
        AbstractC0307g.m703e(r2, "$strings");
        AbstractC0307g.m703e(r72, "bridge");
        AtomicBoolean r08 = AbstractC0553c.f1646a;
        return AbstractC0553c.m1364c(r72, r4, (String[]) Arrays.copyOf(r2, r2.length));
    }

    public /* synthetic */ C0552b(String[] r2, ClassLoader r3) {
        this.f1643a = 1;
        this.f1644b = r2;
        this.f1645c = r3;
    }
}
