package io.sentry.android.replay.capture;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: io.sentry.android.replay.capture.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1765c {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f6421a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC1767e f6422b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC1767e f6423c;

    public C1765c(AbstractC1767e r1, AbstractC1767e r2, int r3) {
        switch(r3) {
            case 2: goto L11;
            case 3: goto L9;
            case 4: goto L7;
            case 5: goto L5;
            default: goto L3;
        };
    L3:
        this.f6422b = r1;
        this.f6423c = r2;
        this.f6421a = new AtomicReference(-1);
        return;
    L5:
        this.f6422b = r1;
        this.f6423c = r2;
        this.f6421a = new AtomicReference(null);
        return;
    L7:
        this.f6422b = r1;
        this.f6423c = r2;
        this.f6421a = new AtomicReference(null);
        return;
    L9:
        this.f6422b = r1;
        this.f6423c = r2;
        this.f6421a = new AtomicReference(null);
        return;
    L11:
        this.f6422b = r1;
        this.f6423c = r2;
        this.f6421a = new AtomicReference(null);
    }

    public C1765c(Object r1, AbstractC1767e r2, AbstractC1767e r3) {
        this.f6422b = r2;
        this.f6423c = r3;
        this.f6421a = new AtomicReference(r1);
    }
}
