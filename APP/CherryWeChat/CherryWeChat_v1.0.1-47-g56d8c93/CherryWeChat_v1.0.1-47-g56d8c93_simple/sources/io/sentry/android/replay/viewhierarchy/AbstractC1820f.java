package io.sentry.android.replay.viewhierarchy;

import android.graphics.Rect;
import io.sentry.android.replay.C1799t;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.f */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1820f {

    /* JADX INFO: renamed from: a */
    public final int f6583a;

    /* JADX INFO: renamed from: b */
    public final int f6584b;

    /* JADX INFO: renamed from: c */
    public final float f6585c;

    /* JADX INFO: renamed from: d */
    public final boolean f6586d;

    /* JADX INFO: renamed from: e */
    public final Rect f6587e;

    /* JADX INFO: renamed from: f */
    public ArrayList f6588f;

    public AbstractC1820f(int r1, int r2, float r3, AbstractC1820f r4, boolean r5, Rect r6) {
        this.f6583a = r1;
        this.f6584b = r2;
        this.f6585c = r3;
        this.f6586d = r5;
        this.f6587e = r6;
    }

    /* JADX INFO: renamed from: a */
    public final void m3992a(C1799t r3) {
        if (((Boolean) r3.mo90g(this)).booleanValue() == false) goto L10;
        ArrayList r0 = this.f6588f;
        if (r0 == null) goto L12;
        Iterator r02 = r0.iterator();
    L8:
        if (r02.hasNext() == false) goto L13;
        ((AbstractC1820f) r02.next()).m3992a(r3);
        goto L8
    L13:
        return;
    L12:
        return;
    }
}
