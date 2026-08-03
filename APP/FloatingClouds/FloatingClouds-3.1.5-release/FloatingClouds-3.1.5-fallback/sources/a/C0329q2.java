package a;

/* JADX INFO: renamed from: a.q2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0329q2 extends com.google.android.material.floatingactionbutton.FloatingActionButton.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f648a;
    public final /* synthetic */ com.google.android.material.bottomappbar.BottomAppBar b;

    /* JADX INFO: renamed from: a.q2$a */
    public class a extends com.google.android.material.floatingactionbutton.FloatingActionButton.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ a.C0329q2 f649a;

        public a(a.C0329q2 r1) {
                r0 = this;
                r0.<init>()
                r0.f649a = r1
                return
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
        public final void b() {
                r1 = this;
                a.q2 r0 = r1.f649a
                com.google.android.material.bottomappbar.BottomAppBar r0 = r0.b
                int r0 = com.google.android.material.bottomappbar.BottomAppBar.i0
                return
        }
    }

    public C0329q2(com.google.android.material.bottomappbar.BottomAppBar r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.f648a = r2
            return
    }

    @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.a
    public final void a(com.google.android.material.floatingactionbutton.FloatingActionButton r3) {
            r2 = this;
            com.google.android.material.bottomappbar.BottomAppBar r0 = r2.b
            int r1 = r2.f648a
            float r0 = r0.B(r1)
            r3.setTranslationX(r0)
            a.q2$a r0 = new a.q2$a
            r0.<init>(r2)
            r1 = 1
            r3.j(r0, r1)
            return
    }
}
