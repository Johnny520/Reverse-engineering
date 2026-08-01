package p117X2;

import java.io.Serializable;
import p137b3.InterfaceC1853a;

/* JADX INFO: renamed from: X2.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1658c implements InterfaceC1853a, Serializable {

    /* JADX INFO: renamed from: d */
    public transient InterfaceC1853a f5692d;

    /* JADX INFO: renamed from: e */
    public final Object f5693e;

    /* JADX INFO: renamed from: f */
    public final Class f5694f;

    /* JADX INFO: renamed from: g */
    public final String f5695g;

    /* JADX INFO: renamed from: h */
    public final String f5696h;

    /* JADX INFO: renamed from: i */
    public final boolean f5697i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1658c(Object obj, Class cls, String str, String str2, boolean z5) {
        this.f5693e = obj;
        this.f5694f = cls;
        this.f5695g = str;
        this.f5696h = str2;
        this.f5697i = z5;
    }

    /* JADX INFO: renamed from: c */
    public abstract InterfaceC1853a mo2975c();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final InterfaceC1659d m2976d() {
        boolean z5 = this.f5697i;
        Class cls = this.f5694f;
        if (!z5) {
            return AbstractC1676u.m2995a(cls);
        }
        AbstractC1676u.f5711a.getClass();
        return new C1668m(cls);
    }
}
