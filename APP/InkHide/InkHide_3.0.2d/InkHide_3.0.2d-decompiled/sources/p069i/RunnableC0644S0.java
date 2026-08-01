package p069i;

import androidx.appcompat.widget.SearchView;
import p008E.AbstractC0099c;

/* JADX INFO: renamed from: i.S0 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0644S0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2202a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SearchView f2203b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0644S0(SearchView searchView, int i2) {
        this.f2202a = i2;
        this.f2203b = searchView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2202a) {
            case 0:
                this.f2203b.m689t();
                break;
            default:
                AbstractC0099c abstractC0099c = this.f2203b.f1040P;
                if (abstractC0099c instanceof ViewOnClickListenerC0667c1) {
                    abstractC0099c.mo243b(null);
                }
                break;
        }
    }
}
