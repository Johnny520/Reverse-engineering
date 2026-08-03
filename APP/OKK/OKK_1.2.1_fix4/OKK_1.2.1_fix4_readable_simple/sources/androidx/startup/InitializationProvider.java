package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import p007D0.C0137c;
import p041W.C0414a;

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
        Context r02 = getContext();
        if (r02 == null) goto L19;
        if (r02.getApplicationContext() == null) goto L16;
        C0414a r03 = C0414a.m996c(r02);
        Context r1 = r03.f920c;
        Trace.beginSection("Startup");     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        ComponentName r2 = new ComponentName(r1.getPackageName(), InitializationProvider.class.getName());     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        r03.m997a(r1.getPackageManager().getProviderInfo(r2, 128).metaData);     // Catch: Throwable -> L9 PackageManager.NameNotFoundException -> L11
        Trace.endSection();
        return true;
    L9:
        th = move-exception;
        Trace.endSection();
        throw th;
    L11:
        e = move-exception;
        throw new C0137c(e);     // Catch: Throwable -> L9
    L16:
        return true;
    L19:
        throw new C0137c("Context cannot be null");
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
