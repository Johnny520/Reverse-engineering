package io.sentry;

import io.sentry.protocol.C1949F;

/* JADX INFO: renamed from: io.sentry.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1654a {

    /* JADX INFO: renamed from: a */
    public final byte[] f5899a;

    /* JADX INFO: renamed from: b */
    public final C1949F f5900b;

    /* JADX INFO: renamed from: c */
    public final CallableC1600K1 f5901c;

    /* JADX INFO: renamed from: d */
    public final String f5902d;

    /* JADX INFO: renamed from: e */
    public final String f5903e;

    /* JADX INFO: renamed from: f */
    public final String f5904f;

    public C1654a(byte[] r1) {
        this.f5899a = r1;
        this.f5900b = null;
        this.f5901c = null;
        this.f5902d = "thread-dump.txt";
        this.f5903e = "text/plain";
        this.f5904f = "event.attachment";
    }

    public C1654a(C1949F r2) {
        this.f5899a = null;
        this.f5900b = r2;
        this.f5901c = null;
        this.f5902d = "view-hierarchy.json";
        this.f5903e = "application/json";
        this.f5904f = "event.view_hierarchy";
    }

    public C1654a(CallableC1600K1 r2) {
        this.f5899a = null;
        this.f5900b = null;
        this.f5901c = r2;
        this.f5902d = "screenshot.png";
        this.f5903e = "image/png";
        this.f5904f = "event.attachment";
    }
}
