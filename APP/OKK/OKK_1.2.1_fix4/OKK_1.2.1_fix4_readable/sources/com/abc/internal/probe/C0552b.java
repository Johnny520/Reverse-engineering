package com.abc.internal.probe;

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

    public /* synthetic */ C0552b(ClassLoader classLoader, String[] strArr, int i2) {
        this.f1643a = i2;
        this.f1645c = classLoader;
        this.f1644b = strArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v4, types: [D0.f] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // p029P0.InterfaceC0286l
    public final Object invoke(Object obj) {
        ?? M116u;
        Object objM116u;
        String[] strArr = this.f1644b;
        ClassLoader classLoader = this.f1645c;
        DexKitBridge dexKitBridge = (DexKitBridge) obj;
        switch (this.f1643a) {
            case 0:
                AbstractC0307g.m703e(classLoader, "$classLoader");
                AbstractC0307g.m703e(strArr, "$strings");
                AbstractC0307g.m703e(dexKitBridge, "bridge");
                AtomicBoolean atomicBoolean = DexKitManager.f1646a;
                return DexKitManager.m1364c(dexKitBridge, classLoader, (String[]) Arrays.copyOf(strArr, strArr.length));
            case 1:
                AbstractC0307g.m703e(strArr, "$strings");
                AbstractC0307g.m703e(classLoader, "$classLoader");
                AbstractC0307g.m703e(dexKitBridge, "bridge");
                AtomicBoolean atomicBoolean2 = DexKitManager.f1646a;
                try {
                    FindClass findClass = new FindClass();
                    ClassMatcher classMatcher = new ClassMatcher();
                    classMatcher.usingStrings((String[]) Arrays.copyOf(strArr, strArr.length));
                    findClass.matcher(classMatcher);
                    ClassDataList classDataListFindClass = dexKitBridge.findClass(findClass);
                    ArrayList arrayList = new ArrayList();
                    Iterator<ClassData> it = classDataListFindClass.iterator();
                    while (it.hasNext()) {
                        String name = it.next().getName();
                        if (name != null) {
                            arrayList.add(name);
                        }
                    }
                    M116u = new ArrayList();
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        Class clsM1366e = DexKitManager.m1366e(classLoader, (String) it2.next());
                        if (clsM1366e != null) {
                            M116u.add(clsM1366e);
                        }
                        break;
                    }
                } catch (Throwable th) {
                    M116u = AbstractC0040p.m116u(th);
                }
                C0190u c0190u = C0190u.f401a;
                boolean z2 = M116u instanceof C0140f;
                ?? r7 = M116u;
                if (z2) {
                    r7 = c0190u;
                }
                return (List) r7;
            default:
                AbstractC0307g.m703e(classLoader, "$classLoader");
                AbstractC0307g.m703e(strArr, "$strings");
                AbstractC0307g.m703e(dexKitBridge, "bridge");
                try {
                    FindMethod findMethod = new FindMethod();
                    MethodMatcher methodMatcher = new MethodMatcher();
                    methodMatcher.usingStrings((String[]) Arrays.copyOf(strArr, strArr.length));
                    findMethod.matcher(methodMatcher);
                    MethodData methodDataFirstOrNull = dexKitBridge.findMethod(findMethod).firstOrNull();
                    objM116u = methodDataFirstOrNull != null ? methodDataFirstOrNull.getMethodInstance(classLoader) : null;
                    break;
                } catch (Throwable th2) {
                    objM116u = AbstractC0040p.m116u(th2);
                }
                return (Method) (objM116u instanceof C0140f ? null : objM116u);
        }
    }

    public /* synthetic */ C0552b(String[] strArr, ClassLoader classLoader) {
        this.f1643a = 1;
        this.f1644b = strArr;
        this.f1645c = classLoader;
    }
}
