package io.ktor.server.engine;

import bsh.classpath.C2606;
import java.io.Closeable;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.ktor.server.engine.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4095 extends ClassLoader implements Closeable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final C2606 f12436;

    public C4095(ArrayList arrayList, ClassLoader classLoader) {
        super(classLoader);
        URL[] urlArr = (URL[]) arrayList.toArray(new URL[0]);
        ClassLoader parent = getParent();
        parent.getClass();
        this.f12436 = new C2606(urlArr, parent);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f12436.close();
    }

    @Override // java.lang.ClassLoader
    public final synchronized Class loadClass(String str, boolean z) {
        Class clsLoadClass;
        str.getClass();
        try {
            clsLoadClass = this.f12436.findClass(str);
        } catch (ClassNotFoundException unused) {
            clsLoadClass = super.loadClass(str, z);
        }
        return clsLoadClass;
    }
}
