package io.sentry.android.replay.util;

import androidx.compose.ui.text.TextLayoutResult;
import p000.AbstractC0148Dc;

/* JADX INFO: renamed from: io.sentry.android.replay.util.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1801a implements InterfaceC1809i {

    /* JADX INFO: renamed from: a */
    public final TextLayoutResult f6528a;

    /* JADX INFO: renamed from: b */
    public final boolean f6529b;

    static {
        int r0 = TextLayoutResult.$stable;
    }

    public C1801a(TextLayoutResult r1, boolean r2) {
        this.f6528a = r1;
        this.f6529b = r2;
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: a */
    public final int mo3590a(int r2) {
        return this.f6528a.getLineStart(r2);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: b */
    public final int mo3591b() {
        return this.f6528a.getLineCount();
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: c */
    public final Integer mo3592c() {
        return null;
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: d */
    public final int mo3593d(int r3) {
        return this.f6528a.getLineEnd(r3, true);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: e */
    public final int mo3594e(int r2) {
        return AbstractC0148Dc.m283q(this.f6528a.getLineTop(r2));
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: f */
    public final float mo3595f(int r3, int r4) {
        float r42 = this.f6528a.getHorizontalPosition(r4, true);
        if (this.f6529b == false) goto L5;
        return r42;
    L5:
        if (mo3591b() == 1) goto L7;
        return r42;
    L7:
        return r42 - this.f6528a.getLineLeft(r3);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: g */
    public final int mo3596g(int r2) {
        return this.f6528a.isLineEllipsized(r2) ? 1 : 0;
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: h */
    public final int mo3597h(int r2) {
        return AbstractC0148Dc.m283q(this.f6528a.getLineBottom(r2));
    }
}
