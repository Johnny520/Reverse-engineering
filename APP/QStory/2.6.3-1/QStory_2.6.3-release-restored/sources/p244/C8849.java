package p244;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC3794;
import com.bumptech.glide.load.data.InterfaceC3795;
import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p183.C8541;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8849 implements InterfaceC3794 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f22490;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f22491;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Resources f22492;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C8541 f22493;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Resources.Theme f22494;

    public C8849(Resources.Theme theme, Resources resources, C8541 c8541, int i) {
        this.f22494 = theme;
        this.f22492 = resources;
        this.f22493 = c8541;
        this.f22491 = i;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6990(Priority priority, InterfaceC3795 interfaceC3795) {
        Object objOpenRawResourceFd;
        try {
            C8541 c8541 = this.f22493;
            Resources.Theme theme = this.f22494;
            Resources resources = this.f22492;
            int i = this.f22491;
            switch (c8541.f21261) {
                case 3:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 4:
                    Context context = c8541.f21260;
                    objOpenRawResourceFd = AbstractC5754.m10443(context, context, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.f22490 = objOpenRawResourceFd;
            interfaceC3795.mo6994(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            interfaceC3795.mo6995(e);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6991() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6992() {
        Object obj = this.f22490;
        if (obj != null) {
            try {
                switch (this.f22493.f21261) {
                    case 3:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 4:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6993() {
        switch (this.f22493.f21261) {
            case 3:
                return AssetFileDescriptor.class;
            case 4:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC3794
    public final void cancel() {
    }
}
