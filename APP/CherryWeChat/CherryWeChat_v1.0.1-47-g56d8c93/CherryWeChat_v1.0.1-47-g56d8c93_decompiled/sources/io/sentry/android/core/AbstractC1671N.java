package io.sentry.android.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import io.sentry.C1563B0;

/* JADX INFO: renamed from: io.sentry.android.core.N */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1671N extends ContentProvider {

    /* JADX INFO: renamed from: a */
    public final C1563B0 f5990a = new C1563B0(2, false);

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        this.f5990a.m3598i(this);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        this.f5990a.m3598i(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        this.f5990a.m3598i(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        this.f5990a.m3598i(this);
        return 0;
    }
}
