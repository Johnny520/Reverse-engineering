package io.sentry.android.replay.util;

import androidx.compose.ui.graphics.Color;
import p000.AbstractC0585Nj;

/* JADX INFO: renamed from: io.sentry.android.replay.util.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1808h {

    /* JADX INFO: renamed from: a */
    public final Color f6539a;

    /* JADX INFO: renamed from: b */
    public final boolean f6540b;

    public C1808h(Color r1, boolean r2) {
        this.f6539a = r1;
        this.f6540b = r2;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof C1808h) == true) goto L8;
        return false;
    L8:
        C1808h r52 = (C1808h) r5;
        if (AbstractC0585Nj.m1134a(this.f6539a, r52.f6539a) == true) goto L12;
        return false;
    L12:
        if (this.f6540b == r52.f6540b) goto L14;
        return false;
    L14:
        return true;
    }

    public final int hashCode() {
        Color r0 = this.f6539a;
        if (r0 != null) goto L5;
        int r02 = 0;
    L6:
        int r1 = Boolean.hashCode(this.f6540b);
        return r1 + (r02 * 31);
    L5:
        r02 = Color.hashCode-impl(r0.unbox-impl());
        goto L6
    }

    public final String toString() {
        return "TextAttributes(color=" + this.f6539a + ", hasFillModifier=" + this.f6540b + ')';
    }
}
