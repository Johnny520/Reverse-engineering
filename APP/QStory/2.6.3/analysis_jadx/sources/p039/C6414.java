package p039;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.ui.platform.RunnableC1898;
import com.davemorrissey.labs.subscaleview.R;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC5533;
import p010.AbstractC6185;
import p026.AbstractC6311;
import p036.AbstractC6358;
import p038.C6381;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6414 extends AbstractC6311 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static BitmapDrawable f17592;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C6415 f17595 = new C6415(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String f17594 = AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵喵呜喵喵喵呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵喵呜~喵呜喵喵呜呜呜喵"));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String f17593 = AbstractC3933.m8315().concat(AbstractC8405.m13972(104));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Drawable m11970() {
        BitmapDrawable bitmapDrawable = f17592;
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        String str = f17593;
        if (new File(str).exists()) {
            f17592 = AbstractC3933.m8303(AbstractC6358.f17507, str);
        } else {
            AbstractC3933.m8317(AbstractC6358.f17507.getDrawable(R.drawable.voice_icon), str, Bitmap.CompressFormat.PNG);
            f17592 = AbstractC3933.m8303(AbstractC6358.f17507, str);
            AbstractC6185.m11592(AbstractC8405.m13972(99));
        }
        return f17592;
    }

    @Override // p026.AbstractC6314
    public final void loadHook(ClassLoader classLoader) {
        new Thread(new RunnableC1898(10)).start();
        C6381.addOnChatShowListener(this.f17595);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11235() {
        return AbstractC8405.m13972(100) + f17594 + AbstractC8405.m13972(101);
    }

    @Override // p026.AbstractC6311
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11247() {
        return new ViewOnClickListenerC5533(12);
    }
}
