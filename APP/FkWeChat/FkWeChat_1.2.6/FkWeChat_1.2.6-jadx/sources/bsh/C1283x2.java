package bsh;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.url._UrlKt;
import p376zd.C10010p0;

/* JADX INFO: renamed from: bsh.x2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C1283x2 implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: u */
    public static final Map f3871u;

    /* JADX INFO: renamed from: q */
    public String f3872q;

    /* JADX INFO: renamed from: r */
    public int f3873r;

    /* JADX INFO: renamed from: s */
    public int f3874s;

    /* JADX INFO: renamed from: t */
    public int f3875t = 0;

    static {
        HashMap map = new HashMap(17);
        f3871u = map;
        map.put("public", 1);
        map.put("private", 2);
        map.put("protected", 4);
        map.put("static", 8);
        map.put("final", 16);
        map.put("synchronized", 32);
        map.put("volatile", 64);
        map.put("transient", 128);
        map.put("native", 256);
        map.put("interface", 512);
        map.put("abstract", 1024);
        map.put("strict", 2048);
        map.put("synthetic", 4096);
        map.put("annotation", 8192);
        map.put("enum", Integer.valueOf(Http2.INITIAL_MAX_FRAME_SIZE));
        map.put("mandated", 32768);
        map.put("default", 65536);
    }

    public C1283x2(int i10) {
        m5195d(i10);
    }

    /* JADX INFO: renamed from: a */
    public void m5192a(int i10) {
        if ((this.f3873r & i10) != 0) {
            if (i10 < 7) {
                int i11 = this.f3875t;
                if ((i11 & 7) > 0 && (i11 | i10) != i11) {
                    C10010p0.m38820a("public/private/protected cannot be used in combination.");
                    return;
                }
            }
            this.f3875t = i10 | this.f3875t;
            return;
        }
        throw new IllegalStateException(this.f3872q + " cannot be declared '" + m5204n(i10) + "'");
    }

    /* JADX INFO: renamed from: b */
    public void m5193b(String str) {
        m5192a(m5203m(str));
    }

    /* JADX INFO: renamed from: c */
    public void m5194c(int i10) {
        for (int i11 = 1; i11 <= i10; i11 *= 2) {
            if ((i10 & i11) != 0) {
                m5192a(i11);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5195d(int i10) {
        this.f3874s = i10;
        if (i10 == 0) {
            this.f3873r = Modifier.classModifiers();
            this.f3872q = "Class";
            return;
        }
        if (i10 == 1) {
            this.f3873r = Modifier.interfaceModifiers();
            this.f3872q = "Interface";
            return;
        }
        if (i10 == 2) {
            this.f3873r = Modifier.methodModifiers() | ((Integer) f3871u.get("default")).intValue();
            this.f3872q = "Method";
            return;
        }
        if (i10 == 3) {
            this.f3873r = Modifier.fieldModifiers() | ((Integer) f3871u.get("enum")).intValue();
            this.f3872q = "Field";
        } else if (i10 == 4) {
            this.f3873r = Modifier.parameterModifiers();
            this.f3872q = "Parameter";
        } else if (i10 != 5) {
            this.f3873r = 0;
            this.f3872q = "Unknown";
        } else {
            this.f3873r = Modifier.constructorModifiers();
            this.f3872q = "Constructor";
        }
    }

    /* JADX INFO: renamed from: f */
    public void m5196f(int i10) {
        int i11 = this.f3875t;
        this.f3875t = 0;
        m5195d(i10);
        m5194c(i11);
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C1283x2 clone() {
        return (C1283x2) super.clone();
    }

    /* JADX INFO: renamed from: h */
    public int m5198h() {
        return this.f3875t;
    }

    /* JADX INFO: renamed from: i */
    public boolean m5199i(int i10) {
        return (i10 & this.f3875t) != 0;
    }

    /* JADX INFO: renamed from: j */
    public boolean m5200j(String str) {
        return m5199i(m5203m(str));
    }

    /* JADX INFO: renamed from: k */
    public boolean m5201k(int i10) {
        return this.f3874s == i10;
    }

    /* JADX INFO: renamed from: l */
    public void m5202l() {
        this.f3875t = 25;
    }

    /* JADX INFO: renamed from: m */
    public final int m5203m(String str) {
        Integer num = (Integer) f3871u.get(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("Unknown modifier: '" + str + "'");
    }

    /* JADX INFO: renamed from: n */
    public final String m5204n(int i10) {
        for (String str : f3871u.keySet()) {
            if (i10 == ((Integer) f3871u.get(str)).intValue()) {
                return str;
            }
        }
        return String.valueOf(i10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Modifiers: ");
        sb2.append(Modifier.toString(this.f3875t));
        int i10 = this.f3875t;
        Map map = f3871u;
        sb2.append((i10 & ((Integer) map.get("enum")).intValue()) != 0 ? " enum" : (this.f3875t & ((Integer) map.get("default")).intValue()) != 0 ? " default" : _UrlKt.FRAGMENT_ENCODE_SET);
        return sb2.toString();
    }
}
