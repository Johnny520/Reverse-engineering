package p000;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: m0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0322m0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f542a;

    /* JADX INFO: renamed from: b */
    public WeakReference f543b;

    /* JADX INFO: renamed from: c */
    public WeakReference f544c;

    /* JADX INFO: renamed from: d */
    public WeakReference f545d;

    /* JADX INFO: renamed from: e */
    public C0290k0 f546e;

    /* JADX INFO: renamed from: f */
    public boolean f547f;

    /* JADX INFO: renamed from: g */
    public int f548g;

    /* JADX INFO: renamed from: h */
    public String f549h;

    /* JADX INFO: renamed from: i */
    public C0397p0 f550i;

    /* JADX INFO: renamed from: j */
    public final ViewOnAttachStateChangeListenerC0306l0 f551j = new ViewOnAttachStateChangeListenerC0306l0(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0322m0(Object obj, Object obj2, ViewGroup viewGroup, ViewGroup viewGroup2, C0290k0 c0290k0, C0338n0 c0338n0) {
        this.f542a = new WeakReference(viewGroup);
        this.f543b = new WeakReference(viewGroup2);
        this.f544c = new WeakReference(obj);
        this.f545d = new WeakReference(obj2);
        this.f546e = c0290k0;
        this.f547f = c0338n0.f584b;
        this.f548g = c0338n0.f583a;
        this.f549h = (String) c0338n0.f585c;
    }
}
