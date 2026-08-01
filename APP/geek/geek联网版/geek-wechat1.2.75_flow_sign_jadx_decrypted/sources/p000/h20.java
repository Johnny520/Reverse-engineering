package p000;

import androidx.appcompat.widget.SearchView;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: loaded from: classes.dex */
public final class h20 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2092a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SearchView f2093b;

    public /* synthetic */ h20(SearchView searchView, int i) {
        this.f2092a = i;
        this.f2093b = searchView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2092a) {
            case Base64.DEFAULT /* 0 */:
                this.f2093b.m161s();
                break;
            default:
                AbstractC0890xe abstractC0890xe = this.f2093b.f282O;
                if (abstractC0890xe instanceof l50) {
                    abstractC0890xe.mo1739b(null);
                }
                break;
        }
    }
}
