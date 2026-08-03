package a;

/* JADX INFO: loaded from: classes.dex */
public final class Re extends android.database.CursorWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f249a;
    public final int b;
    public int c;

    public Re(android.database.Cursor r8, java.util.HashSet r9) {
            r7 = this;
            r7.<init>(r8)
            r0 = -1
            r7.c = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "talker"
            int r2 = r8.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L16
            goto L1b
        L16:
            r2 = move-exception
            a.wd$a r2 = a.C0465xd.a(r2)
        L1b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r3 = r2 instanceof a.C0447wd.a
            if (r3 == 0) goto L24
            r2 = r0
        L24:
            java.lang.Number r2 = (java.lang.Number) r2
            int r0 = r2.intValue()
            int r2 = r8.getPosition()
            r3 = 0
            if (r0 < 0) goto L67
            int r4 = r8.getCount()
        L35:
            if (r3 >= r4) goto L77
            boolean r5 = r8.moveToPosition(r3)
            if (r5 == 0) goto L64
            java.lang.String r5 = r8.getString(r0)     // Catch: java.lang.Throwable -> L42
            goto L47
        L42:
            r5 = move-exception
            a.wd$a r5 = a.C0465xd.a(r5)
        L47:
            boolean r6 = r5 instanceof a.C0447wd.a
            if (r6 == 0) goto L4c
            r5 = 0
        L4c:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L5d
            boolean r5 = r9.contains(r5)
            if (r5 == 0) goto L5d
            int r5 = r7.b
            int r5 = r5 + 1
            r7.b = r5
            goto L64
        L5d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r1.add(r5)
        L64:
            int r3 = r3 + 1
            goto L35
        L67:
            int r9 = r8.getCount()
        L6b:
            if (r3 >= r9) goto L77
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r1.add(r0)
            int r3 = r3 + 1
            goto L6b
        L77:
            r8.moveToPosition(r2)
            int[] r8 = a.C0383t3.v0(r1)
            r7.f249a = r8
            return
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getCount() {
            r1 = this;
            int[] r0 = r1.f249a
            int r0 = r0.length
            return r0
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final int getPosition() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isAfterLast() {
            r2 = this;
            int[] r0 = r2.f249a
            int r1 = r0.length
            if (r1 != 0) goto L6
            goto Lb
        L6:
            int r1 = r2.c
            int r0 = r0.length
            if (r1 < r0) goto Ld
        Lb:
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isBeforeFirst() {
            r1 = this;
            int[] r0 = r1.f249a
            int r0 = r0.length
            if (r0 != 0) goto L6
            goto La
        L6:
            int r0 = r1.c
            if (r0 >= 0) goto Lc
        La:
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isFirst() {
            r3 = this;
            int[] r0 = r3.f249a
            int r0 = r0.length
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L9
            r0 = r2
            goto La
        L9:
            r0 = r1
        La:
            if (r0 != 0) goto L11
            int r0 = r3.c
            if (r0 != 0) goto L11
            return r2
        L11:
            return r1
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean isLast() {
            r4 = this;
            int[] r0 = r4.f249a
            int r1 = r0.length
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L9
            r1 = r3
            goto La
        L9:
            r1 = r2
        La:
            if (r1 != 0) goto L13
            int r1 = r4.c
            int r0 = r0.length
            int r0 = r0 - r3
            if (r1 != r0) goto L13
            return r3
        L13:
            return r2
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean move(int r2) {
            r1 = this;
            int r0 = r1.c
            int r0 = r0 + r2
            boolean r2 = r1.moveToPosition(r0)
            return r2
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToFirst() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.moveToPosition(r0)
            return r0
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToLast() {
            r1 = this;
            int[] r0 = r1.f249a
            int r0 = r0.length
            int r0 = r0 + (-1)
            boolean r0 = r1.moveToPosition(r0)
            return r0
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToNext() {
            r1 = this;
            int r0 = r1.c
            int r0 = r0 + 1
            boolean r0 = r1.moveToPosition(r0)
            return r0
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPosition(int r4) {
            r3 = this;
            r0 = 0
            if (r4 >= 0) goto La
            r4 = -1
            r3.c = r4
            super.moveToPosition(r4)
            return r0
        La:
            int[] r1 = r3.f249a
            int r2 = r1.length
            if (r4 < r2) goto L1a
            int r4 = r1.length
            r3.c = r4
            int r4 = super.getCount()
            super.moveToPosition(r4)
            return r0
        L1a:
            r3.c = r4
            r4 = r1[r4]
            boolean r4 = super.moveToPosition(r4)
            return r4
    }

    @Override // android.database.CursorWrapper, android.database.Cursor
    public final boolean moveToPrevious() {
            r1 = this;
            int r0 = r1.c
            int r0 = r0 + (-1)
            boolean r0 = r1.moveToPosition(r0)
            return r0
    }
}
