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

    public C1808h(Color color, boolean z) {
        this.f6539a = color;
        this.f6540b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1808h)) {
            return false;
        }
        C1808h c1808h = (C1808h) obj;
        return AbstractC0585Nj.m1134a(this.f6539a, c1808h.f6539a) && this.f6540b == c1808h.f6540b;
    }

    public final int hashCode() {
        Color color = this.f6539a;
        return Boolean.hashCode(this.f6540b) + ((color == null ? 0 : Color.hashCode-impl(color.unbox-impl())) * 31);
    }

    public final String toString() {
        return "TextAttributes(color=" + this.f6539a + ", hasFillModifier=" + this.f6540b + ')';
    }
}
