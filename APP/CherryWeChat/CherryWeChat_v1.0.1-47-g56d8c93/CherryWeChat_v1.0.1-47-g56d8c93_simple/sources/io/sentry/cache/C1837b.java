package io.sentry.cache;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: io.sentry.cache.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1837b implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File r1, String r2) {
        return r2.endsWith(".envelope");
    }
}
