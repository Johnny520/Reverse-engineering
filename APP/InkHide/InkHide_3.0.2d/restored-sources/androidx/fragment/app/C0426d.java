package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.fragment.app.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0426d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewGroup f1317a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f1318b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f1319c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0420K f1320d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0428f f1321e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0426d(ViewGroup viewGroup, View view, boolean z2, C0420K c0420k, C0428f c0428f) {
        this.f1317a = viewGroup;
        this.f1318b = view;
        this.f1319c = z2;
        this.f1320d = c0420k;
        this.f1321e = c0428f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f1317a;
        View view = this.f1318b;
        viewGroup.endViewTransition(view);
        if (this.f1319c) {
            AbstractC0421L.m813a(view, this.f1320d.f1274a);
        }
        this.f1321e.m826d();
    }
}
