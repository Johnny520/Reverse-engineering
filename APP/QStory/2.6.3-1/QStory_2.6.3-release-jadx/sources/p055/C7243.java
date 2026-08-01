package p055;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.p001ui.platform.RunnableC2733;
import com.davemorrissey.labs.subscaleview.C0328R;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import lin.xposed.hook.javaplugin.dialog.ViewOnClickListenerC6365;
import p026.AbstractC7014;
import p042.AbstractC7140;
import p052.AbstractC7187;
import p054.C7210;
import p303.AbstractC9234;

/* JADX INFO: renamed from: 飘花落叶言世哲楪苏子兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7243 extends AbstractC7140 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static BitmapDrawable f17937;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C7244 f17940 = new C7244(this);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final String f17939 = AbstractC4765.m8874().concat(AbstractC9234.m14532("喵呜喵呜呜呜喵喵~喵喵呜喵喵喵呜呜~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵喵呜喵喵呜~喵呜喵喵呜呜呜喵"));

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final String f17938 = AbstractC4765.m8874().concat(AbstractC9234.m14531(104));

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static Drawable m12529() {
        BitmapDrawable bitmapDrawable = f17937;
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        String str = f17938;
        if (new File(str).exists()) {
            f17937 = AbstractC4765.m8862(AbstractC7187.f17852, str);
        } else {
            AbstractC4765.m8876(AbstractC7187.f17852.getDrawable(C0328R.drawable.voice_icon), str, Bitmap.CompressFormat.PNG);
            f17937 = AbstractC4765.m8862(AbstractC7187.f17852, str);
            AbstractC7014.m12151(AbstractC9234.m14531(99));
        }
        return f17937;
    }

    @Override // p042.AbstractC7143
    public final void loadHook(ClassLoader classLoader) {
        new Thread(new RunnableC2733(10)).start();
        C7210.addOnChatShowListener(this.f17940);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo11794() {
        return AbstractC9234.m14531(100) + f17939 + AbstractC9234.m14531(101);
    }

    @Override // p042.AbstractC7140
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final View.OnClickListener mo11806() {
        return new ViewOnClickListenerC6365(12);
    }
}
