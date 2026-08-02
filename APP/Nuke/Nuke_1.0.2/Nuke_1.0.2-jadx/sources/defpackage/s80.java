package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s80 implements f40 {
    public final Resources.Theme h;
    public final Resources i;
    public final r80 j;
    public final int k;
    public Object l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public s80(Resources.Theme theme, Resources resources, r80 r80Var, int i) {
        this.h = theme;
        this.i = resources;
        this.j = r80Var;
        this.k = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final Class a() {
        switch (this.j.h) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void b() {
        Object obj = this.l;
        if (obj != null) {
            try {
                switch (this.j.h) {
                    case 0:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 1:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final void c(i32 i32Var, e40 e40Var) {
        Object objOpenRawResourceFd;
        try {
            r80 r80Var = this.j;
            Resources.Theme theme = this.h;
            Resources resources = this.i;
            int i = this.k;
            switch (r80Var.h) {
                case 0:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 1:
                    Context context = r80Var.i;
                    objOpenRawResourceFd = sc0.a(context, context, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.l = objOpenRawResourceFd;
            e40Var.h(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            e40Var.d(e);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.f40
    public final int e() {
        return 1;
    }

    @Override // defpackage.f40
    public final void cancel() {
    }
}
