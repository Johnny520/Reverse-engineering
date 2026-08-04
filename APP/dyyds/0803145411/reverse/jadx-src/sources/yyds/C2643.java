package yyds;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.util.Arrays;

/* JADX INFO: renamed from: yyds.ᲈᛴᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2643 extends AbstractC0850 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public double[] f13030;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public String[] f13031;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public long[] f13032;

    /* JADX INFO: renamed from: ᛷᛲᲈᛱ, reason: contains not printable characters */
    public Cursor f13033;

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public byte[][] f13034;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public int[] f13035;

    public C2643(C0574 c0574, String str) {
        super(c0574, str);
        this.f13035 = new int[0];
        this.f13032 = new long[0];
        this.f13030 = new double[0];
        this.f13031 = new String[0];
        this.f13034 = new byte[0][];
    }

    /* JADX INFO: renamed from: ᛷᲈᲈᲁ, reason: contains not printable characters */
    public static void m4748(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            AbstractC2328.m4346(25, "column index out of range");
            throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f3912) {
            mo431();
            reset();
        }
        this.f3912 = true;
    }

    @Override // yyds.InterfaceC1212
    public final int getColumnCount() {
        m1931();
        m4749();
        Cursor cursor = this.f13033;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // yyds.InterfaceC1212
    public final String getColumnName(int i) {
        m1931();
        m4749();
        Cursor cursor = this.f13033;
        if (cursor != null) {
            m4748(cursor, i);
            return cursor.getColumnName(i);
        }
        C0188.m800("Required value was null.");
        return null;
    }

    @Override // yyds.InterfaceC1212
    public final long getLong(int i) {
        m1931();
        Cursor cursor = this.f13033;
        if (cursor != null) {
            m4748(cursor, i);
            return cursor.getLong(i);
        }
        AbstractC2328.m4346(21, "no row");
        throw null;
    }

    @Override // yyds.InterfaceC1212
    public final boolean isNull(int i) {
        m1931();
        Cursor cursor = this.f13033;
        if (cursor != null) {
            m4748(cursor, i);
            return cursor.isNull(i);
        }
        AbstractC2328.m4346(21, "no row");
        throw null;
    }

    @Override // yyds.AbstractC0850, yyds.InterfaceC1212
    public final void reset() {
        m1931();
        Cursor cursor = this.f13033;
        if (cursor != null) {
            cursor.close();
        }
        this.f13033 = null;
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final String mo430(int i) {
        m1931();
        Cursor cursor = this.f13033;
        if (cursor != null) {
            m4748(cursor, i);
            return cursor.getString(i);
        }
        AbstractC2328.m4346(21, "no row");
        throw null;
    }

    @Override // yyds.AbstractC0850, yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo431() {
        m1931();
        this.f13035 = new int[0];
        this.f13032 = new long[0];
        this.f13030 = new double[0];
        this.f13031 = new String[0];
        this.f13034 = new byte[0][];
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo432(int i) {
        m1931();
        m4750(5, i);
        this.f13035[i] = 5;
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᛵᲀᛵᛸ */
    public final boolean mo433() {
        m1931();
        m4749();
        Cursor cursor = this.f13033;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        C0188.m800("Required value was null.");
        return false;
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final void m4749() {
        if (this.f13033 == null) {
            C2014 c2014 = new C2014(19, this);
            C0574 c0574 = this.f3913;
            c0574.getClass();
            final C0744 c0744 = new C0744(c2014);
            this.f13033 = c0574.f2765.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: yyds.ᲇᛶᛵ
                @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
                public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                    return (Cursor) c0744.mo1697(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
                }
            }, ((C2643) c2014.f10074).f3914, C0574.f2764, null);
        }
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᲀᛲᛲᲇ */
    public final void mo434(int i, String str) {
        m1931();
        m4750(3, i);
        this.f13035[i] = 3;
        this.f13031[i] = str;
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final void m4750(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.f13035;
        if (iArr.length < i3) {
            this.f13035 = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.f13032;
            if (jArr.length < i3) {
                this.f13032 = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f13030;
            if (dArr.length < i3) {
                this.f13030 = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.f13031;
            if (strArr.length < i3) {
                this.f13031 = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.f13034;
        if (bArr.length < i3) {
            this.f13034 = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // yyds.InterfaceC1212
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final void mo435(int i, long j) {
        m1931();
        m4750(1, i);
        this.f13035[i] = 1;
        this.f13032[i] = j;
    }
}
