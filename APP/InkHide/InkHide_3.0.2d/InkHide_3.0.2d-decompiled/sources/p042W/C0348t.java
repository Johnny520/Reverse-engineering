package p042W;

import p037T.AbstractC0274y;
import p037T.C0261l;
import p037T.InterfaceC0275z;
import p049a0.C0367a;

/* JADX INFO: renamed from: W.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0348t implements InterfaceC0275z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f791a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f792b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0274y f793c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0348t(Class cls, AbstractC0274y abstractC0274y, int i2) {
        this.f791a = i2;
        this.f792b = cls;
        this.f793c = abstractC0274y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.InterfaceC0275z
    /* JADX INFO: renamed from: a */
    public final AbstractC0274y mo493a(C0261l c0261l, C0367a c0367a) {
        switch (this.f791a) {
            case 0:
                if (c0367a.f860a == this.f792b) {
                    return this.f793c;
                }
                return null;
            default:
                Class cls = this.f792b;
                Class<?> cls2 = c0367a.f860a;
                if (cls.isAssignableFrom(cls2)) {
                    return new C0330b(this, cls2);
                }
                return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        switch (this.f791a) {
            case 0:
                return "Factory[type=" + this.f792b.getName() + ",adapter=" + this.f793c + "]";
            default:
                return "Factory[typeHierarchy=" + this.f792b.getName() + ",adapter=" + this.f793c + "]";
        }
    }
}
