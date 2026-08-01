package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class n4 {
    public static void a(android.widget.ThemedSpinnerAdapter r1, android.content.res.Resources.Theme r2) {
            android.content.res.Resources$Theme r0 = r1.getDropDownViewTheme()
            boolean r0 = defpackage.pw.a(r0, r2)
            if (r0 != 0) goto Ld
            r1.setDropDownViewTheme(r2)
        Ld:
            return
    }
}
