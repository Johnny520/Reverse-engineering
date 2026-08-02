package defpackage;

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ic1 implements f40 {
    public final boolean h;
    public final Uri i;
    public final ContentResolver j;
    public Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ic1(ContentResolver contentResolver, Uri uri, boolean z) {
        this.j = contentResolver;
        this.i = uri;
        this.h = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void b() {
        Object obj = this.k;
        if (obj != null) {
            try {
                d(obj);
            } catch (IOException unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void c(i32 i32Var, e40 e40Var) {
        try {
            Object objF = f(this.j, this.i);
            this.k = objF;
            e40Var.h(objF);
        } catch (FileNotFoundException e) {
            if (Log.isLoggable("LocalUriFetcher", 3)) {
                Log.d("LocalUriFetcher", "Failed to open Uri", e);
            }
            e40Var.d(e);
        }
    }

    public abstract void d(Object obj);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final int e() {
        return 1;
    }

    public abstract Object f(ContentResolver contentResolver, Uri uri);

    @Override // defpackage.f40
    public final void cancel() {
    }
}
