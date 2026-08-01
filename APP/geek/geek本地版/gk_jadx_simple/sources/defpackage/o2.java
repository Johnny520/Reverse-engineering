package defpackage;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o2 implements Choreographer.FrameCallback {
    public final /* synthetic */ r5 a;

    public o2(r5 r1) {
        this.a = r1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r29) {
        p2 r1 = (p2) ((l0) this.a.b).b;
        long r2 = SystemClock.uptimeMillis();
        ArrayList r4 = r1.b;
        long r5 = SystemClock.uptimeMillis();
        int r8 = 0;
    L4:
        if (r8 >= r4.size()) goto L32;
        h40 r9 = (h40) r4.get(r8);
        if (r9 != null) goto L8;
    L7:
        int r15 = r8;
    L30:
        r8 = r15 + 1;
        goto L4
    L8:
        u30 r11 = r1.a;
        Long r12 = (Long) r11.getOrDefault(r9, null);
        if (r12 != null) goto L12;
    L14:
        long r112 = r9.f;
        if (r112 != 0) goto L17;
        r9.f = r2;
        r9.g(r9.b);
        goto L7
    L17:
        long r16 = r2 - r112;
        r9.f = r2;
        if (r9.k == Float.MAX_VALUE) goto L20;
        i40 r113 = r9.j;
        double r13 = r113.i;
        boolean r292 = true;
        long r23 = r16 / 2;
        rh r10 = r113.c(r9.b, r9.a, r23);
        i40 r114 = r9.j;
        r114.i = r9.k;
        r9.k = Float.MAX_VALUE;
        rh r102 = r114.c(r10.a, r10.b, r23);
        r9.b = r102.a;
        r9.a = r102.b;
        float r103 = Float.MAX_VALUE;
    L21:
        float r115 = Math.max(r9.b, -3.4028235E38f);
        r9.b = r115;
        r9.b = Math.min(r115, r103);
        float r132 = r9.a;
        i40 r14 = r9.j;
        r14.getClass();
        r15 = r8;
        if (Math.abs(r132) < r14.e) goto L24;
    L26:
        boolean r7 = false;
    L27:
        float r82 = Math.min(r9.b, r103);
        r9.b = r82;
        float r83 = Math.max(r82, -3.4028235E38f);
        r9.b = r83;
        r9.g(r83);
        if (r7 == false) goto L30;
        r9.d(false);
        goto L30
    L24:
        if (Math.abs(r11 - ((float) r14.i)) >= r14.d) goto L26;
        r9.b = (float) r9.j.i;
        r9.a = 0.0f;
        r7 = r292;
        goto L27
    L20:
        r292 = true;
        r103 = Float.MAX_VALUE;
        rh r116 = r9.j.c(r9.b, r9.a, r16);
        r9.b = r116.a;
        r9.a = r116.b;
        goto L21
    L12:
        if (r12.longValue() >= r5) goto L7;
        r11.remove(r9);
        goto L14
    L32:
        if (r1.e == false) goto L41;
        int r22 = r4.size() - 1;
    L34:
        if (r22 < 0) goto L39;
        if (r4.get(r22) != null) goto L38;
        r4.remove(r22);
    L38:
        r22 = r22 - 1;
        goto L34
    L39:
        r1.e = false;
    L41:
        if (r4.size() > 0) goto L43;
        return;
    L43:
        if (r1.d != null) goto L45;
        r1.d = new r5(r1.c);
    L45:
        r5 r17 = r1.d;
        ((Choreographer) r17.c).postFrameCallback((o2) r17.d);
    }
}
