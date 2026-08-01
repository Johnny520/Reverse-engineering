package com.kongzue.dialogx.util;

import java.util.ArrayList;
import p050.AbstractC7173;
import p303.AbstractC9234;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4595 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f12055;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4595(ClassLoader classLoader) {
        super(classLoader);
        this.f12055 = 2;
        classLoader.getClass();
    }

    @Override // java.lang.ClassLoader
    public Class findClass(String str) {
        switch (this.f12055) {
            case 0:
                return C4595.class.getClassLoader().loadClass(str);
            case 3:
                return AbstractC7173.class.getClassLoader().loadClass(str);
            default:
                return super.findClass(str);
        }
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str) {
        switch (this.f12055) {
            case 0:
                try {
                    if (!str.startsWith("com.airbnb.lottie")) {
                        Class<?> clsLoadClass = super.loadClass(str);
                        if (clsLoadClass != null) {
                            return clsLoadClass;
                        }
                    }
                } catch (Throwable unused) {
                }
                return findClass(str);
            case 3:
                try {
                    if (!str.startsWith(AbstractC9234.m14531(354))) {
                        Class<?> clsLoadClass2 = super.loadClass(str);
                        if (clsLoadClass2 != null) {
                            return clsLoadClass2;
                        }
                    }
                } catch (Throwable unused2) {
                }
                return findClass(str);
            default:
                return super.loadClass(str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public ArrayList m8647() {
        Package[] packages = getPackages();
        packages.getClass();
        ArrayList arrayList = new ArrayList(packages.length);
        for (Package r0 : packages) {
            arrayList.add(r0.getName());
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4595(ClassLoader classLoader, int i) {
        super(classLoader);
        this.f12055 = i;
    }

    public C4595() {
        this.f12055 = 1;
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) {
        switch (this.f12055) {
            case 0:
                try {
                    if (!str.startsWith("com.airbnb.lottie")) {
                        Class<?> clsLoadClass = super.loadClass(str, z);
                        if (clsLoadClass != null) {
                            return clsLoadClass;
                        }
                    }
                } catch (Throwable unused) {
                }
                return findClass(str);
            case 3:
                try {
                    if (!str.startsWith(AbstractC9234.m14531(354))) {
                        Class<?> clsLoadClass2 = super.loadClass(str, z);
                        if (clsLoadClass2 != null) {
                            return clsLoadClass2;
                        }
                    }
                } catch (Throwable unused2) {
                }
                return findClass(str);
            default:
                return super.loadClass(str, z);
        }
    }
}
