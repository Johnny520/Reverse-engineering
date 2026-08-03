package Yue;

/* JADX INFO: renamed from: Yue.ۥۡۨۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C5751 {
    @android.annotation.SuppressLint({"ApplySharedPref"})
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final void m21484(@Yue.InterfaceC4418 android.content.SharedPreferences r0, boolean r1, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.content.SharedPreferences.Editor, Yue.C6593> r2) {
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r2.invoke(r0)
            if (r1 == 0) goto Ld
            r0.commit()
            goto L10
        Ld:
            r0.apply()
        L10:
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static /* synthetic */ void m21485(android.content.SharedPreferences r0, boolean r1, Yue.InterfaceC2825 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L5
            r1 = 0
        L5:
            android.content.SharedPreferences$Editor r0 = r0.edit()
            r2.invoke(r0)
            if (r1 == 0) goto L12
            r0.commit()
            goto L15
        L12:
            r0.apply()
        L15:
            return
    }
}
