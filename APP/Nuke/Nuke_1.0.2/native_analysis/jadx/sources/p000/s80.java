package p000;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class s80 implements f40 {

    /* JADX INFO: renamed from: h */
    public final Resources.Theme f9971h;

    /* JADX INFO: renamed from: i */
    public final Resources f9972i;

    /* JADX INFO: renamed from: j */
    public final r80 f9973j;

    /* JADX INFO: renamed from: k */
    public final int f9974k;

    /* JADX INFO: renamed from: l */
    public Object f9975l;

    public s80(Resources.Theme theme, Resources resources, r80 r80Var, int i) {
        this.f9971h = theme;
        this.f9972i = resources;
        this.f9973j = r80Var;
        this.f9974k = i;
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: a */
    public final Class mo1371a() {
        switch (this.f9973j.f9425h) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: b */
    public final void mo1372b() {
        Object obj = this.f9975l;
        if (obj != null) {
            try {
                switch (this.f9973j.f9425h) {
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

    @Override // p000.f40
    /* JADX INFO: renamed from: c */
    public final void mo1373c(i32 i32Var, e40 e40Var) {
        Object objOpenRawResourceFd;
        try {
            r80 r80Var = this.f9973j;
            Resources.Theme theme = this.f9971h;
            Resources resources = this.f9972i;
            int i = this.f9974k;
            switch (r80Var.f9425h) {
                case 0:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 1:
                    Context context = r80Var.f9426i;
                    objOpenRawResourceFd = sc0.m4790a(context, context, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.f9975l = objOpenRawResourceFd;
            e40Var.mo636h(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            e40Var.mo635d(e);
        }
    }

    @Override // p000.f40
    /* JADX INFO: renamed from: e */
    public final int mo1374e() {
        return 1;
    }

    @Override // p000.f40
    public final void cancel() {
    }
}
