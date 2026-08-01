package io.github.libxposed.service;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import java.util.HashSet;
import java.util.Objects;
import p000.AbstractBinderC0412kz;
import p000.C0373jz;
import p000.InterfaceC0449lz;
import p000.lf1;
import p000.mf1;
import p000.of1;
import p000.ou0;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class XposedProvider extends ContentProvider {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 0, expect 1 */
    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        InterfaceC0449lz interfaceC0449lz;
        if (!str.equals("SendBinder") || bundle == null) {
            return null;
        }
        IBinder binder = bundle.getBinder("binder");
        if (binder != null) {
            Log.d("XposedProvider", "binder received: " + binder);
            HashSet hashSet = of1.f4553a;
            synchronized (hashSet) {
                try {
                    int i = AbstractBinderC0412kz.f3288a;
                    IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("io.github.libxposed.service.IXposedService");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC0449lz)) {
                        C0373jz c0373jz = new C0373jz();
                        c0373jz.f2960a = binder;
                        interfaceC0449lz = c0373jz;
                    } else {
                        interfaceC0449lz = (InterfaceC0449lz) iInterfaceQueryLocalInterface;
                    }
                    lf1 lf1Var = new lf1(interfaceC0449lz);
                    if (of1.f4554b == null) {
                        hashSet.add(lf1Var);
                    } else {
                        binder.linkToDeath(new mf1(lf1Var, 1), 0);
                        of1.f4554b.mo2700a(lf1Var);
                    }
                } finally {
                }
            }
        }
        return new Bundle();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Context context = getContext();
        Objects.requireNonNull(context);
        if (context.getApplicationInfo().targetSdkVersion < 30) {
            return true;
        }
        int i = ou0.f4661a;
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
