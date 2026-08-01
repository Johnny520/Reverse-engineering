package top.suzhelan.qstory.hook.item.chat;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import io.ktor.client.plugins.AbstractC3933;
import java.io.File;
import p010.AbstractC6185;
import p036.AbstractC6358;
import p287.AbstractC8405;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5841 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Drawable drawableM11243;
        File file = new File(AbstractC3933.m8315().concat(AbstractC8405.m13973("喵呜喵呜呜呜喵喵~喵呜喵呜呜呜呜喵~喵呜喵喵呜喵呜呜~喵呜喵喵喵呜呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵喵呜喵~喵喵喵喵喵呜呜喵")));
        if (!file.exists() && (drawableM11243 = C5834.m11243()) != null) {
            AbstractC3933.m8317(drawableM11243, file.getAbsolutePath(), Bitmap.CompressFormat.PNG);
            AbstractC6185.m11592(AbstractC8405.m13972(2218));
        }
        AbstractC3933.m8303(AbstractC6358.f17507, file.getAbsolutePath());
    }
}
