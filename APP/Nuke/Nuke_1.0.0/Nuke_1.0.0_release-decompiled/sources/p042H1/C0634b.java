package p042H1;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import p000A.C0066i0;

/* JADX INFO: renamed from: H1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0634b {

    /* JADX INFO: renamed from: a */
    public final C0066i0 f2011a;

    /* JADX INFO: renamed from: b */
    public final byte[] f2012b;

    /* JADX INFO: renamed from: c */
    public final File f2013c;

    /* JADX INFO: renamed from: d */
    public final String f2014d;

    /* JADX INFO: renamed from: e */
    public boolean f2015e = false;

    /* JADX INFO: renamed from: f */
    public C0635c[] f2016f;

    /* JADX INFO: renamed from: g */
    public byte[] f2017g;

    public C0634b(AssetManager assetManager, ExecutorC0637e executorC0637e, C0066i0 c0066i0, String str, File file) {
        byte[] bArr;
        this.f2011a = c0066i0;
        this.f2014d = str;
        this.f2013c = file;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 31) {
            switch (i5) {
                case 27:
                    bArr = AbstractC0638f.f2031e;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0638f.f2030d;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = AbstractC0638f.f2029c;
        }
        this.f2012b = bArr;
    }

    /* JADX INFO: renamed from: a */
    public final FileInputStream m1086a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e5) {
            String message = e5.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1087b(final int i5, final Serializable serializable) {
        new Runnable() { // from class: H1.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f2008d.f2011a.m71k(i5, serializable);
            }
        }.run();
    }
}
