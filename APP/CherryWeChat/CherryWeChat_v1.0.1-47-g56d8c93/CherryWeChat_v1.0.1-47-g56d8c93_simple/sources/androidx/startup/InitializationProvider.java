package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import p000.AbstractC0628Oj;
import p000.C0232Fa;
import p000.C2656w4;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    public InitializationProvider() {
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri r1, String r2, String[] r3) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri r2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri r1, ContentValues r2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context r0 = getContext();
        if (r0 == null) goto L19;
        if (r0.getApplicationContext() == null) goto L16;
        C2656w4 r02 = C2656w4.m5192u(r0);
        Context r1 = (Context) r02.f9198d;
        AbstractC0628Oj.m1239c("Startup");     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        ComponentName r2 = new ComponentName(r1.getPackageName(), InitializationProvider.class.getName());     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        r02.m5207m(r1.getPackageManager().getProviderInfo(r2, 128).metaData);     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        Trace.endSection();
        return true;
    L9:
        th = move-exception;
        Trace.endSection();
        throw th;
    L11:
        e = move-exception;
        throw new C0232Fa(e);     // Catch: Throwable -> L9
    L16:
        return true;
    L19:
        throw new C0232Fa("Context cannot be null");
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri r1, String[] r2, String r3, String[] r4, String r5) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(Uri r1, ContentValues r2, String r3, String[] r4) {
        throw new IllegalStateException("Not allowed.");
    }
}
