package p000;

import androidx.appcompat.widget.SearchView;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class a20 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SearchView f15b;

    public /* synthetic */ a20(SearchView searchView, int i) {
        this.f14a = i;
        this.f15b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14a) {
            case Base64.DEFAULT /* 0 */:
                this.f15b.m176s();
                break;
            default:
                AbstractC0853we abstractC0853we = this.f15b.f319O;
                if (abstractC0853we instanceof e50) {
                    abstractC0853we.mo990b(null);
                }
                break;
        }
    }
}
