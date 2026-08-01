package p000;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: p0 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final class C0397p0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f676a;

    /* JADX INFO: renamed from: b */
    public final WeakReference f677b;

    /* JADX INFO: renamed from: c */
    public final WeakReference f678c;

    /* JADX INFO: renamed from: d */
    public final boolean f679d;

    /* JADX INFO: renamed from: e */
    public final FrameLayout f680e;

    /* JADX INFO: renamed from: f */
    public final TextView f681f;

    /* JADX INFO: renamed from: g */
    public final TextView f682g;

    /* JADX INFO: renamed from: h */
    public final ViewOnLayoutChangeListenerC0354o0 f683h;

    /* JADX INFO: renamed from: j */
    public int f685j = -1;

    /* JADX INFO: renamed from: k */
    public int f686k = -1;

    /* JADX INFO: renamed from: l */
    public int f687l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: m */
    public int f688m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n */
    public int f689n = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: o */
    public float f690o = Float.NaN;

    /* JADX INFO: renamed from: i */
    public boolean f684i = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0397p0(C0322m0 c0322m0, ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, boolean z, FrameLayout frameLayout, TextView textView, TextView textView2) {
        this.f676a = new WeakReference(viewGroup);
        this.f677b = new WeakReference(viewGroup2);
        this.f678c = new WeakReference(viewGroup3);
        this.f679d = z;
        this.f680e = frameLayout;
        this.f681f = textView;
        this.f682g = textView2;
        this.f683h = new ViewOnLayoutChangeListenerC0354o0(this, c0322m0);
    }
}
