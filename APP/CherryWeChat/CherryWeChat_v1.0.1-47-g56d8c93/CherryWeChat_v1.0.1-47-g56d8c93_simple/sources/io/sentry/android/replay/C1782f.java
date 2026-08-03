package io.sentry.android.replay;

import io.sentry.rrweb.AbstractC1986b;
import java.util.Comparator;
import p000.AbstractC0671Pj;

/* JADX INFO: renamed from: io.sentry.android.replay.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1782f implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6479a;

    public /* synthetic */ C1782f(int r1) {
        this.f6479a = r1;
    }

    @Override // java.util.Comparator
    public final int compare(Object r3, Object r4) {
        switch(this.f6479a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return AbstractC0671Pj.m1346d(Long.valueOf(((AbstractC1986b) r3).f7116b), Long.valueOf(((AbstractC1986b) r4).f7116b));
    L7:
        return AbstractC0671Pj.m1346d(Long.valueOf(((C1790k) r3).f6509b), Long.valueOf(((C1790k) r4).f6509b));
    }
}
