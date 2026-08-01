package io.ktor.server.engine;

import bsh.classpath.C3440;
import java.io.Closeable;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4928 extends ClassLoader implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C3440 f12785;

    public C4928(ArrayList arrayList, ClassLoader classLoader) {
        super(classLoader);
        URL[] urlArr = (URL[]) arrayList.toArray(new URL[0]);
        ClassLoader parent = getParent();
        parent.getClass();
        this.f12785 = new C3440(urlArr, parent);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12785.close();
    }

    @Override // java.lang.ClassLoader
    public final synchronized Class loadClass(String str, boolean z) {
        Class clsLoadClass;
        str.getClass();
        try {
            clsLoadClass = this.f12785.findClass(str);
        } catch (ClassNotFoundException unused) {
            clsLoadClass = super.loadClass(str, z);
        }
        return clsLoadClass;
    }
}
