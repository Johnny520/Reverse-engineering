package p271y4;

import java.lang.ref.WeakReference;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: y4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3499a {

    /* JADX INFO: renamed from: a */
    public final WeakReference f10906a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3499a(Object obj) {
        AbstractC1665j.m2985e(obj, "v");
        this.f10906a = new WeakReference(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m5752a() {
        return this.f10906a.get();
    }
}
