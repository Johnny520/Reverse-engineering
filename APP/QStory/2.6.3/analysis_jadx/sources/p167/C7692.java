package p167;

import android.os.Build;
import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.viewpager2.widget.RunnableC2548;
import androidx.window.area.AbstractC2567;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7692 extends AbstractC0455 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C7691 f20876;

    public C7692(C7691 c7691) {
        this.f20876 = c7691;
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo1179(Throwable th) {
        this.f20876.f20875.m13011(th);
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC0455
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1180(C0325 c0325) {
        C7691 c7691 = this.f20876;
        c7691.f20873 = c0325;
        C0325 c03252 = c7691.f20873;
        C7713 c7713 = c7691.f20875;
        c7691.f20874 = new C0108(c03252, c7713.f20926, c7713.f20927, Build.VERSION.SDK_INT >= 34 ? AbstractC7703.m13002() : AbstractC2567.m5078());
        C7713 c77132 = c7691.f20875;
        ArrayList arrayList = new ArrayList();
        c77132.f20924.writeLock().lock();
        try {
            c77132.f20922 = 1;
            arrayList.addAll(c77132.f20923);
            c77132.f20923.clear();
            c77132.f20924.writeLock().unlock();
            c77132.f20921.post(new RunnableC2548(arrayList, c77132.f20922, (Throwable) null));
        } catch (Throwable th) {
            c77132.f20924.writeLock().unlock();
            throw th;
        }
    }
}
