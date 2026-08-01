package p167;

import android.os.Build;
import androidx.appcompat.app.C0108;
import androidx.compose.animation.core.C0325;
import androidx.viewpager2.widget.RunnableC2548;
import java.util.ArrayList;
import p251.AbstractC8174;
import p253.AbstractC8189;

/* JADX INFO: renamed from: 飘花落叶言子哲苏兰楪世.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7691 extends AbstractC8174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ C7690 f20881;

    public C7691(C7690 c7690) {
        this.f20881 = c7690;
    }

    @Override // p251.AbstractC8174
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void mo12961(C0325 c0325) {
        C7690 c7690 = this.f20881;
        c7690.f20878 = c0325;
        C0325 c03252 = c7690.f20878;
        C7712 c7712 = c7690.f20880;
        c7690.f20879 = new C0108(c03252, c7712.f20931, c7712.f20932, Build.VERSION.SDK_INT >= 34 ? AbstractC7702.m12972() : AbstractC8189.m13680());
        C7712 c77122 = c7690.f20880;
        ArrayList arrayList = new ArrayList();
        c77122.f20929.writeLock().lock();
        try {
            c77122.f20927 = 1;
            arrayList.addAll(c77122.f20928);
            c77122.f20928.clear();
            c77122.f20929.writeLock().unlock();
            c77122.f20926.post(new RunnableC2548(arrayList, c77122.f20927, (Throwable) null));
        } catch (Throwable th) {
            c77122.f20929.writeLock().unlock();
            throw th;
        }
    }

    @Override // p251.AbstractC8174
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final void mo12962(Throwable th) {
        this.f20881.f20880.m12981(th);
    }
}
