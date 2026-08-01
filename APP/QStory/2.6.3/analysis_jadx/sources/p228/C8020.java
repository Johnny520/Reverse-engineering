package p228;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.InterfaceC2962;
import com.bumptech.glide.load.data.InterfaceC2963;
import java.io.IOException;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p167.C7712;

/* JADX INFO: renamed from: 飘花落叶言楪世子哲兰苏.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8020 implements InterfaceC2962 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public Object f22145;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final int f22146;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final Resources f22147;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final C7712 f22148;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Resources.Theme f22149;

    public C8020(Resources.Theme theme, Resources resources, C7712 c7712, int i) {
        this.f22149 = theme;
        this.f22147 = resources;
        this.f22148 = c7712;
        this.f22146 = i;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final void mo6430(Priority priority, InterfaceC2963 interfaceC2963) {
        Object objOpenRawResourceFd;
        try {
            C7712 c7712 = this.f22148;
            Resources.Theme theme = this.f22149;
            Resources resources = this.f22147;
            int i = this.f22146;
            switch (c7712.f20916) {
                case 3:
                    objOpenRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 4:
                    Context context = c7712.f20915;
                    objOpenRawResourceFd = AbstractC4922.m9884(context, context, i, theme);
                    break;
                default:
                    objOpenRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.f22145 = objOpenRawResourceFd;
            interfaceC2963.mo6434(objOpenRawResourceFd);
        } catch (Resources.NotFoundException e) {
            interfaceC2963.mo6435(e);
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final DataSource mo6431() {
        return DataSource.LOCAL;
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo6432() {
        Object obj = this.f22145;
        if (obj != null) {
            try {
                switch (this.f22148.f20916) {
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

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final Class mo6433() {
        switch (this.f22148.f20916) {
            case 3:
                return AssetFileDescriptor.class;
            case 4:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.bumptech.glide.load.data.InterfaceC2962
    public final void cancel() {
    }
}
