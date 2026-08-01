package p229r1;

import android.animation.ValueAnimator;
import android.view.View;
import p154e2.C2023b;

/* JADX INFO: renamed from: r1.A */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC3040A implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ View f9722d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C3046G f9723e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2023b f9724f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ValueAnimator f9725g;

    public RunnableC3040A(View view, C3046G c3046g, C2023b c2023b, ValueAnimator valueAnimator) {
        this.f9722d = view;
        this.f9723e = c3046g;
        this.f9724f = c2023b;
        this.f9725g = valueAnimator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3042C.m5312i(this.f9722d, this.f9723e, this.f9724f);
        this.f9725g.start();
    }
}
