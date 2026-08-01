package p121Y1;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.io.File;
import me.dartcv.nuke.BuildConfig;
import p078P1.C1147i;
import p078P1.InterfaceC1149k;
import p088R1.InterfaceC1194D;
import p131a2.C1799c;

/* JADX INFO: renamed from: Y1.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1737E implements InterfaceC1149k {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5998a;

    public /* synthetic */ C1737E(int i5) {
        this.f5998a = i5;
    }

    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: a */
    public final InterfaceC1194D mo2202a(Object obj, int i5, int i6, C1147i c1147i) {
        switch (this.f5998a) {
            case 0:
                return new C1736D(0, (Bitmap) obj);
            case BuildConfig.VERSION_CODE /* 1 */:
                Drawable drawable = (Drawable) obj;
                if (drawable != null) {
                    return new C1799c(drawable, 0);
                }
                return null;
            default:
                return new C1736D((File) obj);
        }
    }

    @Override // p078P1.InterfaceC1149k
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo2203b(Object obj, C1147i c1147i) {
        switch (this.f5998a) {
            case 0:
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                break;
            default:
                break;
        }
        return true;
    }
}
