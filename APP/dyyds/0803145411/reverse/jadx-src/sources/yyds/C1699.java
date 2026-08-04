package yyds;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: yyds.ᛸᛱᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1699 extends AbstractC0850 {

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final int f8633;

    public C1699(C0574 c0574, String str, int i) {
        super(c0574, str);
        this.f8633 = i;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f3912 = true;
    }

    @Override // yyds.InterfaceC1212
    public final int getColumnCount() {
        m1931();
        return 0;
    }

    @Override // yyds.InterfaceC1212
    public final String getColumnName(int i) {
        m1931();
        AbstractC2328.m4346(21, "no row");
        throw null;
    }

    @Override // yyds.InterfaceC1212
    public final long getLong(int i) {
        m1931();
        AbstractC2328.m4346(21, "no row");
        throw null;
    }

    @Override // yyds.InterfaceC1212
    public final boolean isNull(int i) {
        m1931();
        AbstractC2328.m4346(21, "no row");
        throw null;
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final String mo430(int i) {
        m1931();
        AbstractC2328.m4346(21, "no row");
        throw null;
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo432(int i) {
        m1931();
        AbstractC2328.m4346(25, "column index out of range");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛵᲀᛵᛸ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo433() throws IllegalAccessException, InvocationTargetException {
        int iM4012 = AbstractC2104.m4012(this.f8633);
        C0574 c0574 = this.f3913;
        if (iM4012 == 0) {
            c0574.m1443();
            c0574.m1445();
        } else if (iM4012 == 1) {
            c0574.m1445();
        } else if (iM4012 == 2) {
            c0574.m1442();
        } else if (iM4012 == 3) {
            c0574.m1447();
        } else {
            if (iM4012 != 4) {
                C0188.m801();
                return false;
            }
            SQLiteDatabase sQLiteDatabase = c0574.f2765;
            InterfaceC0826 interfaceC0826 = C0574.f2763;
            if (((Method) interfaceC0826.getValue()) != null) {
                InterfaceC0826 interfaceC08262 = C0574.f2762;
                if (((Method) interfaceC08262.getValue()) != null) {
                    Method method = (Method) interfaceC0826.getValue();
                    Object objInvoke = ((Method) interfaceC08262.getValue()).invoke(sQLiteDatabase, null);
                    if (objInvoke != null) {
                        method.invoke(objInvoke, 0, null, 0, null);
                    } else {
                        C0188.m800("Required value was null.");
                    }
                } else {
                    c0574.m1442();
                }
            }
        }
        return false;
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ */
    public final void mo434(int i, String str) {
        m1931();
        AbstractC2328.m4346(25, "column index out of range");
        throw null;
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo435(int i, long j) {
        m1931();
        AbstractC2328.m4346(25, "column index out of range");
        throw null;
    }
}
