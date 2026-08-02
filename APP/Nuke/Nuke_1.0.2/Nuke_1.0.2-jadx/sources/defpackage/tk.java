package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class tk implements g92 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public tk(Context context) {
        this.a = 3;
        this.c = new wk(0);
        this.b = context.getApplicationContext();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 3, expect 1 */
    @Override // defpackage.g92
    public final d92 a(Object obj, int i, int i2, ov1 ov1Var) {
        boolean z;
        r62 r62Var;
        rg0 rg0Var;
        switch (this.a) {
            case 0:
                d92 d92VarA = ((g92) this.b).a(obj, i, i2, ov1Var);
                Resources resources = (Resources) this.c;
                if (d92VarA == null) {
                    return null;
                }
                return new al(resources, d92VarA);
            case 1:
                d92 d92VarC = ((i92) this.b).c((Uri) obj, ov1Var);
                if (d92VarC == null) {
                    return null;
                }
                return rp0.W((zk) this.c, (Drawable) ((zo0) d92VarC).get(), i, i2);
            case 2:
                InputStream inputStream = (InputStream) obj;
                if (inputStream instanceof r62) {
                    r62Var = (r62) inputStream;
                    z = false;
                } else {
                    z = true;
                    r62Var = new r62(inputStream, (td1) this.c);
                }
                ArrayDeque arrayDeque = rg0.j;
                synchronized (arrayDeque) {
                    rg0Var = (rg0) arrayDeque.poll();
                    break;
                }
                if (rg0Var == null) {
                    rg0Var = new rg0();
                }
                rg0 rg0Var2 = rg0Var;
                rg0Var2.h = r62Var;
                ye1 ye1Var = new ye1(rg0Var2);
                dq1 dq1Var = new dq1(15, r62Var, rg0Var2);
                try {
                    xa0 xa0Var = (xa0) this.b;
                    al alVarA = xa0Var.a(new b5(ye1Var, xa0Var.d, xa0Var.c), i, i2, ov1Var, dq1Var);
                    rg0Var2.i = null;
                    rg0Var2.h = null;
                    synchronized (arrayDeque) {
                        arrayDeque.offer(rg0Var2);
                        break;
                    }
                    if (z) {
                        r62Var.c();
                    }
                    return alVarA;
                } catch (Throwable th) {
                    rg0Var2.i = null;
                    rg0Var2.h = null;
                    ArrayDeque arrayDeque2 = rg0.j;
                    synchronized (arrayDeque2) {
                        arrayDeque2.offer(rg0Var2);
                        if (!z) {
                            throw th;
                        }
                        r62Var.c();
                        throw th;
                    }
                }
            default:
                Uri uri = (Uri) obj;
                Context context = (Context) this.b;
                ImageDecoder.Source sourceCreateSource = ImageDecoder.createSource(context.getContentResolver(), uri);
                if (Log.isLoggable("UriBitmapDecoder", 2)) {
                    Log.v("UriBitmapDecoder", "decoding " + uri + ", mimeType: " + context.getContentResolver().getType(uri) + ", [" + i + ", " + i2 + "]");
                }
                return ((wk) this.c).c(sourceCreateSource, i, i2, ov1Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.g92
    public final boolean b(Object obj, ov1 ov1Var) {
        String type;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return ((g92) obj2).b(obj, ov1Var);
            case 1:
                return "android.resource".equals(((Uri) obj).getScheme());
            case 2:
                return true;
            default:
                Uri uri = (Uri) obj;
                String scheme = uri.getScheme();
                return ("content".equals(scheme) || "file".equals(scheme) || "android.resource".equals(scheme)) && ((type = ((Context) obj2).getContentResolver().getType(uri)) == null || !type.equals("image/gif"));
        }
    }

    public /* synthetic */ tk(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public tk(Resources resources, g92 g92Var) {
        this.a = 0;
        this.c = resources;
        this.b = g92Var;
    }
}
