package p107V1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.EnumC1928j;
import com.bumptech.glide.load.data.InterfaceC1933c;
import com.bumptech.glide.load.data.InterfaceC1934d;
import java.io.IOException;
import java.io.InputStream;
import me.dartcv.nuke.BuildConfig;
import p097T1.C1416e;
import p131a2.AbstractC1798b;

/* JADX INFO: renamed from: V1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1506e implements InterfaceC1934d {

    /* JADX INFO: renamed from: d */
    public final Resources.Theme f5244d;

    /* JADX INFO: renamed from: e */
    public final Resources f5245e;

    /* JADX INFO: renamed from: f */
    public final C1416e f5246f;

    /* JADX INFO: renamed from: g */
    public final int f5247g;

    /* JADX INFO: renamed from: h */
    public Object f5248h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1506e(Resources.Theme theme, Resources resources, C1416e c1416e, int i5) {
        this.f5244d = theme;
        this.f5245e = resources;
        this.f5246f = c1416e;
        this.f5247g = i5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: a */
    public final Class mo2222a() {
        switch (this.f5246f.f5066d) {
            case BuildConfig.VERSION_CODE /* 1 */:
                return AssetFileDescriptor.class;
            case 2:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: b */
    public final void mo2223b() {
        Object obj = this.f5248h;
        if (obj != null) {
            try {
                switch (this.f5246f.f5066d) {
                    case BuildConfig.VERSION_CODE /* 1 */:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 2:
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
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: c */
    public final int mo2224c() {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    /* JADX INFO: renamed from: d */
    public final void mo2225d(EnumC1928j enumC1928j, InterfaceC1933c interfaceC1933c) {
        Object objOpenRawResourceFd;
        try {
            C1416e c1416e = this.f5246f;
            Resources.Theme theme = this.f5244d;
            Resources resources = this.f5245e;
            int i5 = this.f5247g;
            switch (c1416e.f5066d) {
                case BuildConfig.VERSION_CODE /* 1 */:
                    objOpenRawResourceFd = resources.openRawResourceFd(i5);
                    break;
                case 2:
                    Context context = c1416e.f5067e;
                    objOpenRawResourceFd = AbstractC1798b.m3270a(context, context, i5, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i5);
                    break;
            }
            this.f5248h = objOpenRawResourceFd;
            interfaceC1933c.mo43l(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e5) {
            interfaceC1933c.mo36e(e5);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC1934d
    public final void cancel() {
    }
}
