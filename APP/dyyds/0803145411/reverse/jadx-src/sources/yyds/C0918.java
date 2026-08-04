package yyds;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: yyds.ᛴᛸᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0918 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public byte[] f4210;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final String f4211;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Executor f4212;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC0535 f4213;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C2265[] f4214;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final byte[] f4215;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public boolean f4216 = false;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final File f4217;

    public C0918(AssetManager assetManager, Executor executor, InterfaceC0535 interfaceC0535, String str, File file) {
        this.f4212 = executor;
        this.f4213 = interfaceC0535;
        this.f4211 = str;
        this.f4217 = file;
        int i = Build.VERSION.SDK_INT;
        this.f4215 = i >= 31 ? AbstractC0024.f8170 : i != 30 ? null : AbstractC0024.f8172;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final FileInputStream m2035(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            this.f4213.mo1275();
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m2036(int i, Serializable serializable) {
        this.f4212.execute(new RunnableC1671(this, i, serializable));
    }
}
