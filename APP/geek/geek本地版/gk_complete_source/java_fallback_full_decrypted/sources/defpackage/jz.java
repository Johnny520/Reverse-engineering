package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class jz {
    public defpackage.ez a;
    public java.util.ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(defpackage.b00 r2) {
            int r0 = r2.j
            boolean r1 = r2.f()
            if (r1 == 0) goto L9
            goto L15
        L9:
            r0 = r0 & 4
            if (r0 != 0) goto L15
            androidx.recyclerview.widget.RecyclerView r0 = r2.r
            if (r0 != 0) goto L12
            goto L15
        L12:
            r0.F(r2)
        L15:
            return
    }

    public abstract boolean a(defpackage.b00 r1, defpackage.b00 r2, defpackage.lw r3, defpackage.lw r4);

    public final void c(defpackage.b00 r11) {
            r10 = this;
            ez r0 = r10.a
            if (r0 == 0) goto L6a
            androidx.recyclerview.widget.RecyclerView r0 = r0.a
            r1 = 1
            r11.n(r1)
            android.view.View r2 = r11.a
            b00 r3 = r11.h
            r4 = 0
            if (r3 == 0) goto L17
            b00 r3 = r11.i
            if (r3 != 0) goto L17
            r11.h = r4
        L17:
            r11.i = r4
            int r3 = r11.j
            r3 = r3 & 16
            if (r3 == 0) goto L20
            goto L6a
        L20:
            tz r3 = r0.b
            r0.a0()
            r5 r4 = r0.e
            java.lang.Object r5 = r4.c
            fa r5 = (defpackage.fa) r5
            java.lang.Object r6 = r4.b
            ez r6 = (defpackage.ez) r6
            androidx.recyclerview.widget.RecyclerView r7 = r6.a
            int r7 = r7.indexOfChild(r2)
            r8 = -1
            r9 = 0
            if (r7 != r8) goto L3d
            r4.B(r2)
            goto L4e
        L3d:
            boolean r8 = r5.d(r7)
            if (r8 == 0) goto L4d
            r5.f(r7)
            r4.B(r2)
            r6.h(r7)
            goto L4e
        L4d:
            r1 = r9
        L4e:
            if (r1 == 0) goto L5a
            b00 r4 = androidx.recyclerview.widget.RecyclerView.I(r2)
            r3.j(r4)
            r3.g(r4)
        L5a:
            r3 = r1 ^ 1
            r0.b0(r3)
            if (r1 != 0) goto L6a
            boolean r11 = r11.j()
            if (r11 == 0) goto L6a
            r0.removeDetachedView(r2, r9)
        L6a:
            return
    }

    public abstract void d(defpackage.b00 r1);

    public abstract void e();

    public abstract boolean f();
}
