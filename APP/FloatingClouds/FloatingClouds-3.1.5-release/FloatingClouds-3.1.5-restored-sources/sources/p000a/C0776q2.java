package p000a;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: renamed from: a.q2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0776q2 extends FloatingActionButton.AbstractC1294a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3066a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BottomAppBar f3067b;

    /* JADX INFO: renamed from: a.q2$a */
    public class a extends FloatingActionButton.AbstractC1294a {
        public a() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC1294a
        /* JADX INFO: renamed from: b */
        public final void mo1820b() {
            BottomAppBar bottomAppBar = C0776q2.this.f3067b;
            int i = BottomAppBar.f5410i0;
        }
    }

    public C0776q2(BottomAppBar bottomAppBar, int i) {
        this.f3067b = bottomAppBar;
        this.f3066a = i;
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.AbstractC1294a
    /* JADX INFO: renamed from: a */
    public final void mo1819a(FloatingActionButton floatingActionButton) {
        floatingActionButton.setTranslationX(this.f3067b.m3090B(this.f3066a));
        floatingActionButton.m3238j(new a(), true);
    }
}
