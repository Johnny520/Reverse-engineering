package a;

/* JADX INFO: renamed from: a.wf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnClickListenerC0449wf implements android.view.View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a.O f754a;
    public final /* synthetic */ androidx.appcompat.widget.d b;

    public ViewOnClickListenerC0449wf(androidx.appcompat.widget.d r4) {
            r3 = this;
            r3.<init>()
            r3.b = r4
            a.O r0 = new a.O
            androidx.appcompat.widget.Toolbar r1 = r4.f856a
            android.content.Context r1 = r1.getContext()
            java.lang.CharSequence r4 = r4.h
            r0.<init>()
            r2 = 4096(0x1000, float:5.74E-42)
            r0.e = r2
            r0.g = r2
            r2 = 0
            r0.l = r2
            r0.m = r2
            r2 = 0
            r0.n = r2
            r0.o = r2
            r2 = 16
            r0.p = r2
            r0.i = r1
            r0.f191a = r4
            r3.f754a = r0
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r3) {
            r2 = this;
            androidx.appcompat.widget.d r3 = r2.b
            android.view.Window$Callback r0 = r3.k
            if (r0 == 0) goto L10
            boolean r3 = r3.l
            if (r3 == 0) goto L10
            r3 = 0
            a.O r1 = r2.f754a
            r0.onMenuItemSelected(r3, r1)
        L10:
            return
    }
}
