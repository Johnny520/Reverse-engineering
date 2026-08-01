package bsh.classpath;

import bsh.C1281x0;
import bsh.classpath.C1157n;
import java.util.HashMap;
import p308v4.AbstractC8816g;

/* JADX INFO: renamed from: bsh.classpath.p */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1159p extends C1144a {

    /* JADX INFO: renamed from: s */
    public static C1159p f3515s;

    /* JADX INFO: renamed from: r */
    public a f3516r;

    /* JADX INFO: renamed from: bsh.classpath.p$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a extends HashMap {
        private static final long serialVersionUID = 1;

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C1157n.b get(Object obj) {
            return (C1157n.b) super.get(obj);
        }

        @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C1157n.b put(String str, C1157n.b bVar) {
            return (C1157n.b) super.put(str, bVar);
        }
    }

    public C1159p(C1281x0 c1281x0, a aVar) {
        super(c1281x0);
        this.f3516r = aVar;
    }

    /* JADX INFO: renamed from: d */
    public static C1159p m4265d() {
        return f3515s;
    }

    /* JADX INFO: renamed from: e */
    public static void m4266e(C1281x0 c1281x0, a aVar) {
        f3515s = new C1159p(c1281x0, aVar);
    }

    @Override // bsh.classpath.C1144a, java.net.URLClassLoader, java.lang.ClassLoader
    public Class findClass(String str) {
        C1157n.b bVar = this.f3516r.get(str);
        return bVar != null ? AbstractC8816g.m33812f(str, bVar.mo4260a(str)) : super.findClass(str);
    }

    public String toString() {
        return super.toString() + "for files: " + this.f3516r;
    }
}
