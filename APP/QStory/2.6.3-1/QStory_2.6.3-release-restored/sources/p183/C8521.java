package p183;

import android.os.Build;
import androidx.appcompat.app.C0955;
import androidx.compose.animation.core.C1171;
import androidx.compose.foundation.draganddrop.AbstractC1298;
import androidx.viewpager2.widget.RunnableC3381;
import androidx.window.area.AbstractC3400;
import java.util.ArrayList;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8521 extends AbstractC1298 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ C8520 f21221;

    public C8521(C8520 c8520) {
        this.f21221 = c8520;
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo1739(Throwable th) {
        this.f21221.f21220.m13570(th);
    }

    @Override // androidx.compose.foundation.draganddrop.AbstractC1298
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo1740(C1171 c1171) {
        C8520 c8520 = this.f21221;
        c8520.f21218 = c1171;
        C1171 c11712 = c8520.f21218;
        C8542 c8542 = c8520.f21220;
        c8520.f21219 = new C0955(c11712, c8542.f21271, c8542.f21272, Build.VERSION.SDK_INT >= 34 ? AbstractC8532.m13561() : AbstractC3400.m5638());
        C8542 c85422 = c8520.f21220;
        ArrayList arrayList = new ArrayList();
        c85422.f21269.writeLock().lock();
        try {
            c85422.f21267 = 1;
            arrayList.addAll(c85422.f21268);
            c85422.f21268.clear();
            c85422.f21269.writeLock().unlock();
            c85422.f21266.post(new RunnableC3381(arrayList, c85422.f21267, (Throwable) null));
        } catch (Throwable th) {
            c85422.f21269.writeLock().unlock();
            throw th;
        }
    }
}
