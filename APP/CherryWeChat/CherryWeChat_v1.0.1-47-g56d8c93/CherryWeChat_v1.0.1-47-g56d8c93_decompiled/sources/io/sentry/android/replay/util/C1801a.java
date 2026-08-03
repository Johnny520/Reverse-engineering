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
        int i = TextLayoutResult.$stable;
    }

    public C1801a(TextLayoutResult textLayoutResult, boolean z) {
        this.f6528a = textLayoutResult;
        this.f6529b = z;
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: a */
    public final int mo3590a(int i) {
        return this.f6528a.getLineStart(i);
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
    public final int mo3593d(int i) {
        return this.f6528a.getLineEnd(i, true);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: e */
    public final int mo3594e(int i) {
        return AbstractC0148Dc.m283q(this.f6528a.getLineTop(i));
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: f */
    public final float mo3595f(int i, int i2) {
        float horizontalPosition = this.f6528a.getHorizontalPosition(i2, true);
        return (this.f6529b || mo3591b() != 1) ? horizontalPosition : horizontalPosition - this.f6528a.getLineLeft(i);
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: g */
    public final int mo3596g(int i) {
        return this.f6528a.isLineEllipsized(i) ? 1 : 0;
    }

    @Override // io.sentry.android.replay.util.InterfaceC1809i
    /* JADX INFO: renamed from: h */
    public final int mo3597h(int i) {
        return AbstractC0148Dc.m283q(this.f6528a.getLineBottom(i));
    }
}
