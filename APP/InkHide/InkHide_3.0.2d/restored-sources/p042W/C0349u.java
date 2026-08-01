package p042W;

import p037T.AbstractC0274y;
import p037T.C0261l;
import p037T.InterfaceC0275z;
import p049a0.C0367a;

/* JADX INFO: renamed from: W.u */
/* JADX INFO: loaded from: classes.dex */
public final class C0349u implements InterfaceC0275z {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Class f794a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Class f795b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0274y f796c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0349u(Class cls, Class cls2, AbstractC0274y abstractC0274y) {
        this.f794a = cls;
        this.f795b = cls2;
        this.f796c = abstractC0274y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p037T.InterfaceC0275z
    /* JADX INFO: renamed from: a */
    public final AbstractC0274y mo493a(C0261l c0261l, C0367a c0367a) {
        Class cls = this.f794a;
        Class cls2 = c0367a.f860a;
        if (cls2 == cls || cls2 == this.f795b) {
            return this.f796c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Factory[type=" + this.f795b.getName() + "+" + this.f794a.getName() + ",adapter=" + this.f796c + "]";
    }
}
