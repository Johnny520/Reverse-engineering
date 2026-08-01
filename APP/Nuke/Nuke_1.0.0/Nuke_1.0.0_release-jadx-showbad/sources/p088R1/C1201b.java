package p088R1;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import p078P1.InterfaceC1144f;
import p195l2.AbstractC2503g;

/* JADX INFO: renamed from: R1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1201b extends WeakReference {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1144f f3946a;

    /* JADX INFO: renamed from: b */
    public final boolean f3947b;

    /* JADX INFO: renamed from: c */
    public InterfaceC1194D f3948c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1201b(InterfaceC1144f interfaceC1144f, C1222w c1222w, ReferenceQueue referenceQueue) {
        super(c1222w, referenceQueue);
        AbstractC2503g.m4445c(interfaceC1144f, "Argument must not be null");
        this.f3946a = interfaceC1144f;
        boolean z5 = c1222w.f4079d;
        this.f3948c = null;
        this.f3947b = z5;
    }
}
