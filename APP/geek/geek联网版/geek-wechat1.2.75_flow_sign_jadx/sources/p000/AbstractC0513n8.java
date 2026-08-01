package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: n8 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0513n8 implements InterfaceC0077bq, Serializable {

    /* JADX INFO: renamed from: a */
    public transient InterfaceC0077bq f3239a;

    /* JADX INFO: renamed from: b */
    public final Object f3240b;

    /* JADX INFO: renamed from: c */
    public final Class f3241c;

    /* JADX INFO: renamed from: d */
    public final String f3242d;

    /* JADX INFO: renamed from: e */
    public final String f3243e;

    /* JADX INFO: renamed from: f */
    public final boolean f3244f;

    public AbstractC0513n8(Object obj, Class cls, String str, String str2, boolean z) {
        this.f3240b = obj;
        this.f3241c = cls;
        this.f3242d = str;
        this.f3243e = str2;
        this.f3244f = z;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC0737ta m1928c() {
        boolean z = this.f3244f;
        Class cls = this.f3241c;
        if (z) {
            q00.f3767a.getClass();
            return new C0538nx(cls);
        }
        q00.f3767a.getClass();
        return new C0774ua(cls);
    }
}
