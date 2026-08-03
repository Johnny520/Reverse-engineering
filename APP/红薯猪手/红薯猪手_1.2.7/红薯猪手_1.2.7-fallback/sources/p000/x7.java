package p000;

/* JADX INFO: loaded from: classes.dex */
public final class x7 extends p000.o4 implements p000.f3<p000.a3> {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final /* synthetic */ android.content.Context f1170;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final /* synthetic */ p000.t7 f1171;

    public x7(android.app.Activity r1, p000.t7 r2) {
            r0 = this;
            r0.f1170 = r1
            r0.f1171 = r2
            r0.<init>()
            return
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000.f3
    /* JADX INFO: renamed from: ۥ */
    public final p000.a3 mo11() {
            r4 = this;
            ۟.a3 r0 = new ۟.a3
            android.content.Context r1 = r4.f1170
            r0.<init>(r1)
            ۟.t7 r1 = r4.f1171
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r0.setLayoutParams(r2)
            r2 = 0
            r0.setBackgroundColor(r2)
            ۟.kb r2 = r1.f1046
            java.lang.Object r2 = r2.m238()
            ۟.t7$a r2 = (۟.t7.a) r2
            r0.setAdapter(r2)
            int r2 = r1.f1044
            r0.setCurrentItem(r2)
            ۟.w7 r2 = new ۟.w7
            r2.<init>(r1)
            r0.setOnPageChangeListener(r2)
            return r0
    }
}
