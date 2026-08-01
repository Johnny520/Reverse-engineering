package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class a8 {
    public java.lang.Object a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;

    public a8(int r2) {
            r1 = this;
            switch(r2) {
                case 4: goto L25;
                default: goto L3;
            }
        L3:
            r1.<init>()
            sx r2 = new sx
            r0 = 10
            r2.<init>(r0)
            r1.a = r2
            u30 r2 = new u30
            r2.<init>()
            r1.b = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.c = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r1.d = r2
            return
        L25:
            r1.<init>()
            n6 r2 = new n6
            r2.<init>()
            r1.a = r2
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r1.b = r2
            bs r2 = new bs
            r2.<init>()
            r1.c = r2
            n6 r2 = new n6
            r2.<init>()
            r1.d = r2
            return
    }

    public a8(android.graphics.Typeface r8, defpackage.wv r9) {
            r7 = this;
            r7.<init>()
            r7.d = r8
            r7.a = r9
            xv r8 = new xv
            r0 = 1024(0x400, float:1.435E-42)
            r8.<init>(r0)
            r7.c = r8
            r8 = 6
            int r0 = r9.a(r8)
            r1 = 0
            if (r0 == 0) goto L2d
            int r2 = r9.a
            int r0 = r0 + r2
            java.lang.Object r2 = r9.d
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r0)
            int r2 = r2 + r0
            java.lang.Object r0 = r9.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt(r2)
            goto L2e
        L2d:
            r0 = r1
        L2e:
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r7.b = r0
            int r8 = r9.a(r8)
            if (r8 == 0) goto L4f
            int r0 = r9.a
            int r8 = r8 + r0
            java.lang.Object r0 = r9.d
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt(r8)
            int r0 = r0 + r8
            java.lang.Object r8 = r9.d
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            int r8 = r8.getInt(r0)
            goto L50
        L4f:
            r8 = r1
        L50:
            r9 = r1
        L51:
            if (r9 >= r8) goto Ld1
            ni r0 = new ni
            r0.<init>(r7, r9)
            vv r2 = r0.b()
            r3 = 4
            int r3 = r2.a(r3)
            if (r3 == 0) goto L6f
            java.lang.Object r4 = r2.d
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r2 = r2.a
            int r3 = r3 + r2
            int r2 = r4.getInt(r3)
            goto L70
        L6f:
            r2 = r1
        L70:
            java.lang.Object r3 = r7.b
            char[] r3 = (char[]) r3
            int r4 = r9 * 2
            java.lang.Character.toChars(r2, r3, r4)
            vv r2 = r0.b()
            r3 = 16
            int r4 = r2.a(r3)
            if (r4 == 0) goto L9a
            int r5 = r2.a
            int r4 = r4 + r5
            java.lang.Object r5 = r2.d
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r5 = r5.getInt(r4)
            int r5 = r5 + r4
            java.lang.Object r2 = r2.d
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r5)
            goto L9b
        L9a:
            r2 = r1
        L9b:
            r4 = 1
            if (r2 <= 0) goto La0
            r2 = r4
            goto La1
        La0:
            r2 = r1
        La1:
            java.lang.String r5 = "invalid metadata codepoint length"
            defpackage.zt.d(r5, r2)
            java.lang.Object r2 = r7.c
            xv r2 = (defpackage.xv) r2
            vv r5 = r0.b()
            int r3 = r5.a(r3)
            if (r3 == 0) goto Lc9
            int r6 = r5.a
            int r3 = r3 + r6
            java.lang.Object r6 = r5.d
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            int r6 = r6.getInt(r3)
            int r6 = r6 + r3
            java.lang.Object r3 = r5.d
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r6)
            goto Lca
        Lc9:
            r3 = r1
        Lca:
            int r3 = r3 - r4
            r2.a(r0, r1, r3)
            int r9 = r9 + 1
            goto L51
        Ld1:
            return
    }

    public void a(java.lang.Object r5, java.util.ArrayList r6, java.util.HashSet r7) {
            r4 = this;
            boolean r0 = r6.contains(r5)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r7.contains(r5)
            if (r0 != 0) goto L35
            r7.add(r5)
            java.lang.Object r0 = r4.b
            u30 r0 = (defpackage.u30) r0
            r1 = 0
            java.lang.Object r0 = r0.getOrDefault(r5, r1)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L2e
            int r1 = r0.size()
            r2 = 0
        L22:
            if (r2 >= r1) goto L2e
            java.lang.Object r3 = r0.get(r2)
            r4.a(r3, r6, r7)
            int r2 = r2 + 1
            goto L22
        L2e:
            r7.remove(r5)
            r6.add(r5)
            return
        L35:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r6 = "This graph contains cyclic dependencies"
            r5.<init>(r6)
            throw r5
    }

    public defpackage.h50 b(defpackage.n1 r6) {
            r5 = this;
            java.lang.Object r0 = r5.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L1b
            java.lang.Object r3 = r0.get(r2)
            h50 r3 = (defpackage.h50) r3
            if (r3 == 0) goto L18
            n1 r4 = r3.b
            if (r4 != r6) goto L18
            return r3
        L18:
            int r2 = r2 + 1
            goto L9
        L1b:
            h50 r1 = new h50
            java.lang.Object r2 = r5.b
            android.content.Context r2 = (android.content.Context) r2
            r1.<init>(r2, r6)
            r0.add(r1)
            return r1
    }

    public boolean c(defpackage.n1 r4, android.view.MenuItem r5) {
            r3 = this;
            java.lang.Object r0 = r3.a
            android.view.ActionMode$Callback r0 = (android.view.ActionMode.Callback) r0
            h50 r4 = r3.b(r4)
            su r1 = new su
            java.lang.Object r2 = r3.b
            android.content.Context r2 = (android.content.Context) r2
            l50 r5 = (defpackage.l50) r5
            r1.<init>(r2, r5)
            boolean r4 = r0.onActionItemClicked(r4, r1)
            return r4
    }

    public boolean d(defpackage.n1 r6, android.view.Menu r7) {
            r5 = this;
            java.lang.Object r0 = r5.a
            android.view.ActionMode$Callback r0 = (android.view.ActionMode.Callback) r0
            h50 r6 = r5.b(r6)
            java.lang.Object r1 = r5.d
            u30 r1 = (defpackage.u30) r1
            r2 = 0
            java.lang.Object r2 = r1.getOrDefault(r7, r2)
            android.view.Menu r2 = (android.view.Menu) r2
            if (r2 != 0) goto L24
            gv r2 = new gv
            java.lang.Object r3 = r5.b
            android.content.Context r3 = (android.content.Context) r3
            r4 = r7
            ku r4 = (defpackage.ku) r4
            r2.<init>(r3, r4)
            r1.put(r7, r2)
        L24:
            boolean r6 = r0.onCreateActionMode(r6, r2)
            return r6
    }
}
