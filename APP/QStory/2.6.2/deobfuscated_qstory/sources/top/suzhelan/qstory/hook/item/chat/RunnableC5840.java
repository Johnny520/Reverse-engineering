package top.suzhelan.qstory.hook.item.chat;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.AbstractC3056;
import io.ktor.client.plugins.AbstractC3932;
import java.io.File;
import p010.AbstractC6154;
import p035.AbstractC6340;
import p392.AbstractC9124;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5840 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Drawable drawableM11189;
        File file = new File(AbstractC3932.m8313().concat("/+1.png"));
        if (!file.exists() && (drawableM11189 = C5837.m11189()) != null) {
            AbstractC9124.m14677(drawableM11189, file.getAbsolutePath(), Bitmap.CompressFormat.PNG);
            AbstractC6154.m11561("+1\u56fe\u6807\u521d\u59cb\u5316\u5b8c\u6bd5");
        }
        AbstractC9124.m14665(AbstractC6340.f17460, file.getAbsolutePath());
    }
}
