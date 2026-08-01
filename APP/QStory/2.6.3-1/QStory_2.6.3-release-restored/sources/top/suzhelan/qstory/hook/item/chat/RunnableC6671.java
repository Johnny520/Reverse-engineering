package top.suzhelan.qstory.hook.item.chat;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import io.ktor.client.plugins.AbstractC4765;
import java.io.File;
import p026.AbstractC7014;
import p052.AbstractC7187;

/* JADX INFO: renamed from: top.suzhelan.qstory.hook.item.chat.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC6671 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Drawable drawableM11802;
        File file = new File(AbstractC4765.m8874().concat("/+1.png"));
        if (!file.exists() && (drawableM11802 = C6664.m11802()) != null) {
            AbstractC4765.m8876(drawableM11802, file.getAbsolutePath(), Bitmap.CompressFormat.PNG);
            AbstractC7014.m12151("+1图标初始化完毕");
        }
        AbstractC4765.m8862(AbstractC7187.f17852, file.getAbsolutePath());
    }
}
