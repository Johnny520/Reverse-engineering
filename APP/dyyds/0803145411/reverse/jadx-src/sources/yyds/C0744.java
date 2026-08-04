package yyds;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* JADX INFO: renamed from: yyds.ᛳᲈᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0744 implements InterfaceC1540 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final /* synthetic */ C2014 f3442;

    public /* synthetic */ C0744(C2014 c2014) {
        this.f3442 = c2014;
    }

    @Override // yyds.InterfaceC1540
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public final Object mo1697(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
        String str = (String) obj3;
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        C1907 c1907 = new C1907(sQLiteQuery);
        C2643 c2643 = (C2643) this.f3442.f10074;
        int length = c2643.f13035.length;
        for (int i = 1; i < length; i++) {
            int i2 = c2643.f13035[i];
            if (i2 == 1) {
                c1907.mo3152(i, c2643.f13032[i]);
            } else if (i2 == 2) {
                c1907.mo3151(i, c2643.f13030[i]);
            } else if (i2 == 3) {
                c1907.mo3148(i, c2643.f13031[i]);
            } else if (i2 == 4) {
                c1907.mo3153(i, c2643.f13034[i]);
            } else if (i2 == 5) {
                c1907.mo3150(i);
            }
        }
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }
}
