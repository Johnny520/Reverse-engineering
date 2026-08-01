package com.esotericsoftware.asm;

/* JADX INFO: loaded from: classes.dex */
final class Item {
    int a;
    int b;
    int c;
    long d;
    String g;
    String h;
    String i;
    int j;
    Item k;

    public Item(int i, Item item) {
        this.a = i;
        this.b = item.b;
        this.c = item.c;
        this.d = item.d;
        this.g = item.g;
        this.h = item.h;
        this.i = item.i;
        this.j = item.j;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(com.esotericsoftware.asm.Item r9) {
        /*
            r8 = this;
            int r0 = r8.b
            r1 = 1
            if (r0 == r1) goto L90
            r2 = 12
            r3 = 0
            if (r0 == r2) goto L7a
            r2 = 16
            if (r0 == r2) goto L90
            r2 = 18
            if (r0 == r2) goto L5c
            switch(r0) {
                case 3: goto L54;
                case 4: goto L54;
                case 5: goto L4a;
                case 6: goto L4a;
                case 7: goto L90;
                case 8: goto L90;
                default: goto L15;
            }
        L15:
            switch(r0) {
                case 30: goto L90;
                case 31: goto L38;
                case 32: goto L4a;
                default: goto L18;
            }
        L18:
            java.lang.String r0 = r9.g
            java.lang.String r2 = r8.g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L37
            java.lang.String r0 = r9.h
            java.lang.String r2 = r8.h
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L37
            java.lang.String r9 = r9.i
            java.lang.String r8 = r8.i
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L37
            return r1
        L37:
            return r3
        L38:
            int r0 = r9.c
            int r2 = r8.c
            if (r0 != r2) goto L49
            java.lang.String r9 = r9.g
            java.lang.String r8 = r8.g
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L49
            return r1
        L49:
            return r3
        L4a:
            long r4 = r9.d
            long r8 = r8.d
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 != 0) goto L53
            return r1
        L53:
            return r3
        L54:
            int r9 = r9.c
            int r8 = r8.c
            if (r9 != r8) goto L5b
            return r1
        L5b:
            return r3
        L5c:
            long r4 = r9.d
            long r6 = r8.d
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L79
            java.lang.String r0 = r9.g
            java.lang.String r2 = r8.g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L79
            java.lang.String r9 = r9.h
            java.lang.String r8 = r8.h
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L79
            return r1
        L79:
            return r3
        L7a:
            java.lang.String r0 = r9.g
            java.lang.String r2 = r8.g
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L8f
            java.lang.String r9 = r9.h
            java.lang.String r8 = r8.h
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L8f
            return r1
        L8f:
            return r3
        L90:
            java.lang.String r9 = r9.g
            java.lang.String r8 = r8.g
            boolean r8 = r9.equals(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.asm.Item.a(com.esotericsoftware.asm.Item):boolean");
    }

    public Item(int i) {
        this.a = i;
    }

    public Item() {
    }

    public void a(float f) {
        this.b = 4;
        this.c = Float.floatToRawIntBits(f);
        this.j = Integer.MAX_VALUE & (this.b + ((int) f));
    }

    public void a(int i) {
        this.b = 3;
        this.c = i;
        this.j = (3 + i) & Integer.MAX_VALUE;
    }

    public void a(int i, int i2) {
        this.b = 33;
        this.c = i;
        this.j = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
        /*
            r2 = this;
            r2.b = r3
            r2.g = r4
            r2.h = r5
            r2.i = r6
            r0 = 1
            r1 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r0) goto L46
            r0 = 12
            if (r3 == r0) goto L39
            r0 = 16
            if (r3 == r0) goto L46
            r0 = 30
            if (r3 == r0) goto L46
            r0 = 7
            if (r3 == r0) goto L35
            r0 = 8
            if (r3 == r0) goto L46
            int r4 = r4.hashCode()
            int r5 = r5.hashCode()
            int r5 = r5 * r4
            int r4 = r6.hashCode()
            int r4 = r4 * r5
        L2f:
            int r4 = r4 + r3
            r3 = r4 & r1
        L32:
            r2.j = r3
            return
        L35:
            r5 = 0
            r2.c = r5
            goto L46
        L39:
            int r4 = r4.hashCode()
            int r5 = r5.hashCode()
            int r5 = r5 * r4
            int r5 = r5 + r3
            r3 = r5 & r1
            goto L32
        L46:
            int r4 = r4.hashCode()
            goto L2f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.esotericsoftware.asm.Item.a(int, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void a(long j) {
        this.b = 5;
        this.d = j;
        this.j = Integer.MAX_VALUE & (5 + ((int) j));
    }

    public void a(String str, String str2, int i) {
        this.b = 18;
        this.d = i;
        this.g = str;
        this.h = str2;
        this.j = Integer.MAX_VALUE & ((this.h.hashCode() * str.hashCode() * i) + 18);
    }

    public void a(double d) {
        this.b = 6;
        this.d = Double.doubleToRawLongBits(d);
        this.j = Integer.MAX_VALUE & (this.b + ((int) d));
    }
}
