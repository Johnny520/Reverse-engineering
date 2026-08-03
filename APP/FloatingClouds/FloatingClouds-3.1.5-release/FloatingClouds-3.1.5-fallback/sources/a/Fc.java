package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Fc implements a.D7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f89a;
    public final /* synthetic */ int b;
    public final /* synthetic */ java.util.ArrayList c;

    public /* synthetic */ Fc(float r1, int r2, java.util.ArrayList r3) {
            r0 = this;
            r0.<init>()
            r0.f89a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    @Override // a.D7
    public final java.lang.Object f(java.lang.Object r3) {
            r2 = this;
            android.widget.TextView r3 = (android.widget.TextView) r3
            java.lang.String r0 = "v"
            a.C0193i9.e(r3, r0)
            int r0 = r3.getVisibility()
            if (r0 != 0) goto L45
            int r0 = r3.getHeight()
            if (r0 <= 0) goto L45
            float r0 = r3.getTextSize()
            float r1 = r2.f89a
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L45
            java.lang.CharSequence r0 = r3.getText()
            if (r0 == 0) goto L28
            int r0 = r0.length()
            goto L29
        L28:
            r0 = 0
        L29:
            r1 = 1
            if (r1 > r0) goto L45
            r1 = 7
            if (r0 >= r1) goto L45
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r1 = r3.getGlobalVisibleRect(r0)
            if (r1 == 0) goto L45
            int r0 = r0.top
            int r1 = r2.b
            if (r0 >= r1) goto L45
            java.util.ArrayList r0 = r2.c
            r0.add(r3)
        L45:
            a.Wf r3 = a.Wf.f330a
            return r3
    }
}
