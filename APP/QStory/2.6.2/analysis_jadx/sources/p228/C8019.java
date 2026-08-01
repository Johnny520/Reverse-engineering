package p228;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2961;
import com.bumptech.glide.load.data.InterfaceC2962;
import io.ktor.client.plugins.AbstractC3932;
import java.io.IOException;
import java.io.InputStream;
import p167.C7711;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8019 implements InterfaceC2961 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f22148;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f22149;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Resources f22150;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7711 f22151;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Resources.Theme f22152;

    public C8019(Resources.Theme theme, Resources resources, C7711 c7711, int i) {
        this.f22152 = theme;
        this.f22150 = resources;
        this.f22151 = c7711;
        this.f22149 = i;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6372(Priority priority, InterfaceC2962 interfaceC2962) {
        Object objOpenRawResourceFd;
        try {
            C7711 c7711 = this.f22151;
            Resources.Theme theme = this.f22152;
            Resources resources = this.f22150;
            int i = this.f22149;
            switch (c7711.f20921) {
                case 3:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 4:
                    Context context = c7711.f20920;
                    objOpenRawResourceFd = AbstractC3932.m8320(context, context, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.f22148 = objOpenRawResourceFd;
            interfaceC2962.mo6376(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            interfaceC2962.mo6377(e);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6373() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6374() {
        Object obj = this.f22148;
        if (obj != null) {
            try {
                switch (this.f22151.f20921) {
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

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6375() {
        switch (this.f22151.f20921) {
            case 3:
                return AssetFileDescriptor.class;
            case 4:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2961
    public final void cancel() {
    }
}
