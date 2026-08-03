package androidx.startup;

import Yue.C3362;
import Yue.C7581;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@InterfaceC6391 Uri uri, @InterfaceC6490 String str, @InterfaceC6490 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @InterfaceC6490
    public final String getType(@InterfaceC6391 Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    @InterfaceC6490
    public final Uri insert(@InterfaceC6391 Uri uri, @InterfaceC6490 ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        if (context == null) {
            throw new C7581("Context cannot be null");
        }
        if (context.getApplicationContext() == null) {
            return true;
        }
        C3362.m6886(context).m439();
        return true;
    }

    @Override // android.content.ContentProvider
    @InterfaceC6490
    public final Cursor query(@InterfaceC6391 Uri uri, @InterfaceC6490 String[] strArr, @InterfaceC6490 String str, @InterfaceC6490 String[] strArr2, @InterfaceC6490 String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(@InterfaceC6391 Uri uri, @InterfaceC6490 ContentValues contentValues, @InterfaceC6490 String str, @InterfaceC6490 String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
