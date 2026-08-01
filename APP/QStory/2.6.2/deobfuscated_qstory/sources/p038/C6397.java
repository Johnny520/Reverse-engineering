package p038;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.ui.platform.RunnableC1898;
import com.bumptech.glide.AbstractC3056;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5532;
import p010.AbstractC6154;
import p026.AbstractC6293;
import p035.AbstractC6340;
import p037.C6364;
import p392.AbstractC9124;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C6397 extends AbstractC6293 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static BitmapDrawable f17547;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6398 f17550 = new C6398(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String f17549 = AbstractC3932.m8313().concat("/Voice/");

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String f17548 = AbstractC3932.m8313().concat("/voice_icon.png");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Drawable m11922() {
        BitmapDrawable bitmapDrawable = f17547;
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        String str = f17548;
        if (new File(str).exists()) {
            f17547 = AbstractC9124.m14665(AbstractC6340.f17460, str);
        } else {
            AbstractC9124.m14677(AbstractC6340.f17460.getDrawable(R.drawable.voice_icon), str, Bitmap.CompressFormat.PNG);
            f17547 = AbstractC9124.m14665(AbstractC6340.f17460, str);
            AbstractC6154.m11561("\u8bed\u97f3\u56fe\u6807\u521d\u59cb\u5316\u5b8c\u6210");
        }
        return f17547;
    }

    @Override // p026.AbstractC6296
    public final void loadHook(ClassLoader classLoader) {
        new Thread(new RunnableC1898(10)).start();
        C6364.addOnChatShowListener(this.f17550);
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11178() {
        return "\u8bed\u97f3\u4fdd\u5b58\u5728" + f17549 + "\u5355\u51fb\u53ef\u4ee5\u590d\u5236";
    }

    @Override // p026.AbstractC6293
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11193() {
        return new ViewOnClickListenerC5532(11);
    }
}
