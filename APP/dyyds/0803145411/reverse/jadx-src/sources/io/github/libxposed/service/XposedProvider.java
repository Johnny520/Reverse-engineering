package io.github.libxposed.service;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.util.Log;
import com.p000ss.android.ugc.awemes.MainActivity;
import com.p000ss.android.ugc.awemes.MainApp;
import java.util.HashSet;
import java.util.concurrent.CopyOnWriteArraySet;
import yyds.AbstractBinderC1466;
import yyds.AbstractC1174;
import yyds.AbstractC2328;
import yyds.AbstractSharedPreferencesC0923;
import yyds.C0532;
import yyds.C1416;
import yyds.C1922;
import yyds.InterfaceC1106;
import yyds.InterfaceC2324;
import yyds.RunnableC2696;

/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class XposedProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final Bundle call(String str, String str2, Bundle bundle) {
        InterfaceC1106 interfaceC1106;
        if (!str.equals("SendBinder") || bundle == null) {
            return null;
        }
        IBinder binder = bundle.getBinder("binder");
        if (binder != null) {
            Log.d("XposedProvider", "binder received: " + binder);
            HashSet hashSet = AbstractC1174.f5382;
            synchronized (hashSet) {
                try {
                    int i = AbstractBinderC1466.f6974;
                    IInterface iInterfaceQueryLocalInterface = binder.queryLocalInterface("io.github.libxposed.service.IXposedService");
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1106)) {
                        C1922 c1922 = new C1922();
                        c1922.f9681 = binder;
                        interfaceC1106 = c1922;
                    } else {
                        interfaceC1106 = (InterfaceC1106) iInterfaceQueryLocalInterface;
                    }
                    C1416 c1416 = new C1416(interfaceC1106);
                    if (AbstractC1174.f5383 == null) {
                        hashSet.add(c1416);
                    } else {
                        binder.linkToDeath(new C0532(c1416, 1), 0);
                        AbstractC1174.f5383.getClass();
                        AbstractC2328.m4341(-1297380343972718L);
                        MainApp.f486 = c1416;
                        CopyOnWriteArraySet<InterfaceC2324> copyOnWriteArraySet = MainApp.f487;
                        AbstractC2328.m4341(-1297234315084654L);
                        for (InterfaceC2324 interfaceC2324 : copyOnWriteArraySet) {
                            if (copyOnWriteArraySet.contains(interfaceC2324)) {
                                MainActivity mainActivity = (MainActivity) interfaceC2324;
                                mainActivity.getClass();
                                mainActivity.runOnUiThread(new RunnableC2696(mainActivity, 7, c1416));
                            }
                        }
                    }
                } finally {
                }
            }
        }
        return new Bundle();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        if (getContext().getApplicationInfo().targetSdkVersion < 30) {
            return true;
        }
        int i = AbstractSharedPreferencesC0923.f4233;
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
