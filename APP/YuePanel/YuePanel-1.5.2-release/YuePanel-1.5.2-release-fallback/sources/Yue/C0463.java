package Yue;

/* JADX INFO: renamed from: Yue.ۥ۟ۡۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C0463 {
    public C0463() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static android.view.inputmethod.InputConnection m1704(android.view.inputmethod.InputConnection r1, android.view.inputmethod.EditorInfo r2, android.view.View r3) {
            if (r1 == 0) goto L20
            java.lang.CharSequence r0 = r2.hintText
            if (r0 != 0) goto L20
            android.view.ViewParent r3 = r3.getParent()
        La:
            boolean r0 = r3 instanceof android.view.View
            if (r0 == 0) goto L20
            boolean r0 = r3 instanceof Yue.InterfaceC7128
            if (r0 == 0) goto L1b
            Yue.ۥۢۦ۟ۥ r3 = (Yue.InterfaceC7128) r3
            java.lang.CharSequence r3 = r3.m27447()
            r2.hintText = r3
            goto L20
        L1b:
            android.view.ViewParent r3 = r3.getParent()
            goto La
        L20:
            return r1
    }
}
