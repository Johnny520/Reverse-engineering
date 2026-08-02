package p000;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ic1 implements f40 {

    /* JADX INFO: renamed from: h */
    public final boolean f4552h;

    /* JADX INFO: renamed from: i */
    public final Uri f4553i;

    /* JADX INFO: renamed from: j */
    public final ContentResolver f4554j;

    /* JADX INFO: renamed from: k */
    public Object f4555k;

    public ic1(ContentResolver contentResolver, Uri uri, boolean z) {
        this.f4554j = contentResolver;
        this.f4553i = uri;
        this.f4552h = z;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: b */
    public final void mo1372b() {
        Object obj = this.f4555k;
        if (obj != null) {
            try {
                mo2324d(obj);
            } catch (IOException unused) {
            }
        }
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: c */
    public final void mo1373c(i32 i32Var, e40 e40Var) {
        try {
            Object objMo2325f = mo2325f(this.f4554j, this.f4553i);
            this.f4555k = objMo2325f;
            e40Var.mo636h(objMo2325f);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            e40Var.mo635d(e);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2324d(Object obj);

    @Override // p000.f40
    /* JADX INFO: renamed from: e */
    public final int mo1374e() {
        return 1;
    }

    /* JADX INFO: renamed from: f */
    public abstract Object mo2325f(ContentResolver contentResolver, Uri uri);

    @Override // p000.f40
    public final void cancel() {
    }
}
