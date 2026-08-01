package p027N0;

import java.io.Serializable;
import p036S0.InterfaceC0248a;

/* JADX INFO: renamed from: N0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0218b implements InterfaceC0248a, Serializable {

    /* JADX INFO: renamed from: a */
    public transient InterfaceC0248a f554a;

    /* JADX INFO: renamed from: b */
    public final Object f555b;

    /* JADX INFO: renamed from: c */
    public final Class f556c;

    /* JADX INFO: renamed from: d */
    public final String f557d;

    /* JADX INFO: renamed from: e */
    public final String f558e;

    /* JADX INFO: renamed from: f */
    public final boolean f559f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC0218b(Object obj, Class cls, String str, String str2, boolean z2) {
        this.f555b = obj;
        this.f556c = cls;
        this.f557d = str;
        this.f558e = str2;
        this.f559f = z2;
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC0248a mo411a();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final InterfaceC0219c m412b() {
        Class cls = this.f556c;
        if (this.f559f) {
            AbstractC0229m.f569a.getClass();
            return new C0226j(cls);
        }
        AbstractC0229m.f569a.getClass();
        return new C0220d(cls);
    }
}
