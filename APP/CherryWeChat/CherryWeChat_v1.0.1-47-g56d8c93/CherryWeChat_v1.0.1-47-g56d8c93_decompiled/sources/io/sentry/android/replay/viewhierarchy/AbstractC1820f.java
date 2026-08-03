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

    public AbstractC1820f(int i, int i2, float f, AbstractC1820f abstractC1820f, boolean z, Rect rect) {
        this.f6583a = i;
        this.f6584b = i2;
        this.f6585c = f;
        this.f6586d = z;
        this.f6587e = rect;
    }

    /* JADX INFO: renamed from: a */
    public final void m3992a(C1799t c1799t) {
        ArrayList arrayList;
        if (!((Boolean) c1799t.mo90g(this)).booleanValue() || (arrayList = this.f6588f) == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC1820f) it.next()).m3992a(c1799t);
        }
    }
}
