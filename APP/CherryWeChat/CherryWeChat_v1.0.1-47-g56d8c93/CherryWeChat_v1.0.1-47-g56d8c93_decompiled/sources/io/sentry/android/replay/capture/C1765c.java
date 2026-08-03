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

    public C1765c(AbstractC1767e abstractC1767e, AbstractC1767e abstractC1767e2, int i) {
        switch (i) {
            case 2:
                this.f6422b = abstractC1767e;
                this.f6423c = abstractC1767e2;
                this.f6421a = new AtomicReference(null);
                break;
            case 3:
                this.f6422b = abstractC1767e;
                this.f6423c = abstractC1767e2;
                this.f6421a = new AtomicReference(null);
                break;
            case 4:
                this.f6422b = abstractC1767e;
                this.f6423c = abstractC1767e2;
                this.f6421a = new AtomicReference(null);
                break;
            case 5:
                this.f6422b = abstractC1767e;
                this.f6423c = abstractC1767e2;
                this.f6421a = new AtomicReference(null);
                break;
            default:
                this.f6422b = abstractC1767e;
                this.f6423c = abstractC1767e2;
                this.f6421a = new AtomicReference(-1);
                break;
        }
    }

    public C1765c(Object obj, AbstractC1767e abstractC1767e, AbstractC1767e abstractC1767e2) {
        this.f6422b = abstractC1767e;
        this.f6423c = abstractC1767e2;
        this.f6421a = new AtomicReference(obj);
    }
}
