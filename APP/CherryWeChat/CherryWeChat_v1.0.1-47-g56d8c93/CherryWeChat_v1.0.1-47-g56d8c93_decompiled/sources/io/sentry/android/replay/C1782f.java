package io.sentry.android.replay;

import io.sentry.rrweb.AbstractC1986b;
import java.util.Comparator;
import p000.AbstractC0671Pj;

/* JADX INFO: renamed from: io.sentry.android.replay.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1782f implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6479a;

    public /* synthetic */ C1782f(int i) {
        this.f6479a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f6479a) {
            case 0:
                return AbstractC0671Pj.m1346d(Long.valueOf(((C1790k) obj).f6509b), Long.valueOf(((C1790k) obj2).f6509b));
            default:
                return AbstractC0671Pj.m1346d(Long.valueOf(((AbstractC1986b) obj).f7116b), Long.valueOf(((AbstractC1986b) obj2).f7116b));
        }
    }
}
