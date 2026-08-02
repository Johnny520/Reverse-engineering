package p000;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: m5 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0449m5 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f6474a;

    public C0449m5(Object obj) {
        obj.getClass();
        this.f6474a = new WeakReference(obj);
    }

    /* JADX INFO: renamed from: a */
    public final Object m3031a() {
        return this.f6474a.get();
    }
}
