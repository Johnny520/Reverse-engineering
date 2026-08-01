package com.kongzue.dialogx.util;

import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import p033.AbstractC6325;

/* JADX INFO: renamed from: com.kongzue.dialogx.util.飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3762 extends ClassLoader {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f11705;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3762(ClassLoader classLoader) {
        super(classLoader);
        this.f11705 = 2;
        classLoader.getClass();
    }

    @Override // java.lang.ClassLoader
    public Class findClass(String str) {
        switch (this.f11705) {
            case 0:
                return C3762.class.getClassLoader().loadClass(str);
            case 3:
                return AbstractC6325.class.getClassLoader().loadClass(str);
            default:
                return super.findClass(str);
        }
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str) {
        switch (this.f11705) {
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
                    if (!str.startsWith("com.airbnb.lottie")) {
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
    public ArrayList m8101() {
        Package[] packages = getPackages();
        packages.getClass();
        ArrayList arrayList = new ArrayList(packages.length);
        for (Package r0 : packages) {
            arrayList.add(r0.getName());
        }
        return arrayList;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3762(ClassLoader classLoader, int i) {
        super(classLoader);
        this.f11705 = i;
    }

    public C3762() {
        this.f11705 = 1;
    }

    @Override // java.lang.ClassLoader
    public Class loadClass(String str, boolean z) {
        switch (this.f11705) {
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
                    if (!str.startsWith("com.airbnb.lottie")) {
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
