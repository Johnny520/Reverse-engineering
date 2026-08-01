package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import defpackage.pb;
import defpackage.r5;

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
        r5 r02 = r5.q(r0);
        Context r1 = (Context) r02.d;
        Trace.beginSection("Startup");     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        ComponentName r2 = new ComponentName(r1.getPackageName(), InitializationProvider.class.getName());     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        r02.e(r1.getPackageManager().getProviderInfo(r2, 128).metaData);     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        Trace.endSection();
        return true;
    L9:
        th = move-exception;
        Trace.endSection();
        throw th;
    L11:
        e = move-exception;
        throw new pb(e);     // Catch: Throwable -> L9
    L16:
        return true;
    L19:
        throw new pb("Context cannot be null");
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
