package p000a;

import android.database.Cursor;
import android.database.CursorWrapper;
import java.util.ArrayList;
import java.util.HashSet;
import p000a.C0901wd;

/* JADX INFO: renamed from: a.Re */
/* JADX INFO: loaded from: classes.dex */
public final class C0322Re extends CursorWrapper {

    /* JADX INFO: renamed from: a */
    public final int[] f1154a;

    /* JADX INFO: renamed from: b */
    public final int f1155b;

    /* JADX INFO: renamed from: c */
    public int f1156c;

    public C0322Re(Cursor cursor, HashSet hashSet) {
        Object objM2206a;
        Object objM2206a2;
        super(cursor);
        this.f1156c = -1;
        ArrayList arrayList = new ArrayList();
        try {
            objM2206a = Integer.valueOf(cursor.getColumnIndex("talker"));
        } catch (Throwable th) {
            objM2206a = C0920xd.m2206a(th);
        }
        int iIntValue = ((Number) (objM2206a instanceof C0901wd.a ? -1 : objM2206a)).intValue();
        int position = cursor.getPosition();
        int i = 0;
        if (iIntValue >= 0) {
            int count = cursor.getCount();
            while (i < count) {
                if (cursor.moveToPosition(i)) {
                    try {
                        objM2206a2 = cursor.getString(iIntValue);
                    } catch (Throwable th2) {
                        objM2206a2 = C0920xd.m2206a(th2);
                    }
                    String str = (String) (objM2206a2 instanceof C0901wd.a ? null : objM2206a2);
                    if (str == null || !hashSet.contains(str)) {
                        arrayList.add(Integer.valueOf(i));
                    } else {
                        this.f1155b++;
                    }
                }
                i++;
            }
        } else {
            int count2 = cursor.getCount();
            while (i < count2) {
                arrayList.add(Integer.valueOf(i));
                i++;
            }
        }
        cursor.moveToPosition(position);
        this.f1154a = C0834t3.m1958v0(arrayList);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
        return this.f1154a.length;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getPosition() {
        return this.f1156c;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isAfterLast() {
        int[] iArr = this.f1154a;
        return iArr.length == 0 || this.f1156c >= iArr.length;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isBeforeFirst() {
        return this.f1154a.length == 0 || this.f1156c < 0;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isFirst() {
        return !(this.f1154a.length == 0) && this.f1156c == 0;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isLast() {
        int[] iArr = this.f1154a;
        return !(iArr.length == 0) && this.f1156c == iArr.length - 1;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean move(int i) {
        return moveToPosition(this.f1156c + i);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
        return moveToPosition(0);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
        return moveToPosition(this.f1154a.length - 1);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
        return moveToPosition(this.f1156c + 1);
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(int i) {
        if (i < 0) {
            this.f1156c = -1;
            super.moveToPosition(-1);
            return false;
        }
        int[] iArr = this.f1154a;
        if (i < iArr.length) {
            this.f1156c = i;
            return super.moveToPosition(iArr[i]);
        }
        this.f1156c = iArr.length;
        super.moveToPosition(super.getCount());
        return false;
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
        return moveToPosition(this.f1156c - 1);
    }
}
