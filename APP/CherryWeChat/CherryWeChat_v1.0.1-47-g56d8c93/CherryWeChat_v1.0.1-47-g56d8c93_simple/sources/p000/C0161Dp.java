package p000;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: Dp */
/* JADX INFO: loaded from: classes.dex */
public class C0161Dp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f437a;

    /* JADX INFO: renamed from: b */
    public int f438b;

    /* JADX INFO: renamed from: c */
    public int f439c;

    /* JADX INFO: renamed from: d */
    public int f440d;

    /* JADX INFO: renamed from: e */
    public int f441e;

    /* JADX INFO: renamed from: f */
    public final Object f442f;

    /* JADX INFO: renamed from: g */
    public final Object f443g;

    public C0161Dp(int r2) {
        this.f437a = 0;
        this.f438b = r2;
        if (r2 <= 0) goto L7;
        this.f442f = new C1017Xm(2);
        this.f443g = new C0668Pg(16);
        return;
    L7:
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX INFO: renamed from: a */
    public void m302a() {
        View r0 = (View) ((ArrayList) this.f442f).get(r0.size() - 1);
        C0771Ry r1 = (C0771Ry) r0.getLayoutParams();
        this.f439c = ((StaggeredGridLayoutManager) this.f443g).f3991c.mo5251b(r0);
        r1.getClass();
    }

    /* JADX INFO: renamed from: b */
    public void m303b() {
        ((ArrayList) this.f442f).clear();
        this.f438b = Integer.MIN_VALUE;
        this.f439c = Integer.MIN_VALUE;
        this.f440d = 0;
    }

    /* JADX INFO: renamed from: c */
    public int m304c() {
        ArrayList r0 = (ArrayList) this.f442f;
        if (((StaggeredGridLayoutManager) this.f443g).f3996h == false) goto L7;
        return m306e(r0.size() - 1, -1);
    L7:
        return m306e(0, r0.size());
    }

    /* JADX INFO: renamed from: d */
    public int m305d() {
        ArrayList r0 = (ArrayList) this.f442f;
        if (((StaggeredGridLayoutManager) this.f443g).f3996h == false) goto L7;
        return m306e(0, r0.size());
    L7:
        return m306e(r0.size() - 1, -1);
    }

    /* JADX INFO: renamed from: e */
    public int m306e(int r12, int r13) {
        StaggeredGridLayoutManager r0 = (StaggeredGridLayoutManager) this.f443g;
        int r1 = r0.f3991c.mo5260k();
        int r2 = r0.f3991c.mo5256g();
        if (r13 <= r12) goto L5;
        int r5 = 1;
    L6:
        if (r12 == r13) goto L20;
        View r6 = (View) ((ArrayList) this.f442f).get(r12);
        int r7 = r0.f3991c.mo5254e(r6);
        int r8 = r0.f3991c.mo5251b(r6);
        boolean r9 = false;
        if (r7 > r2) goto L10;
        boolean r10 = true;
    L11:
        if (r8 < r1) goto L13;
        r9 = true;
    L13:
        if (r10 == false) goto L19;
        if (r9 == false) goto L19;
        if (r7 < r1) goto L18;
        if (r8 <= r2) goto L19;
    L18:
        return r0.getPosition(r6);
    L19:
        r12 = r12 + r5;
        goto L6
    L10:
        r10 = false;
        goto L11
    L20:
        return -1;
    L5:
        r5 = -1;
        goto L6
    }

    /* JADX INFO: renamed from: f */
    public Object m307f(Object r3) {
        C0668Pg r0 = (C0668Pg) this.f443g;
        monitor-enter(r0);
        Object r32 = ((LinkedHashMap) ((C1017Xm) this.f442f).f3226b).get(r3);     // Catch: Throwable -> L9
        if (r32 == null) goto L11;
        this.f440d++;
        monitor-exit(r0);
        return r32;
    L11:
        this.f441e++;
        monitor-exit(r0);
        return null;
    L9:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: g */
    public int m308g(int r3) {
        int r0 = this.f439c;
        if (r0 == Integer.MIN_VALUE) goto L6;
        return r0;
    L6:
        if (((ArrayList) this.f442f).size() != 0) goto L8;
        return r3;
    L8:
        m302a();
        return this.f439c;
    }

    /* JADX INFO: renamed from: h */
    public View m309h(int r7, int r8) {
        StaggeredGridLayoutManager r0 = (StaggeredGridLayoutManager) this.f443g;
        ArrayList r1 = (ArrayList) this.f442f;
        View r3 = null;
        if (r8 != (-1)) goto L19;
        int r82 = r1.size();
        int r2 = 0;
    L5:
        if (r2 >= r82) goto L18;
        View r4 = (View) r1.get(r2);
        if (r0.f3996h == false) goto L11;
        if (r0.getPosition(r4) <= r7) goto L18;
    L11:
        if (r0.f3996h == true) goto L16;
        if (r0.getPosition(r4) >= r7) goto L18;
    L16:
        if (r4.hasFocusable() == false) goto L18;
        r2 = r2 + 1;
        r3 = r4;
    L18:
        return r3;
    L19:
        int r83 = r1.size() - 1;
    L20:
        if (r83 < 0) goto L33;
        View r22 = (View) r1.get(r83);
        if (r0.f3996h == false) goto L26;
        if (r0.getPosition(r22) >= r7) goto L33;
    L26:
        if (r0.f3996h == true) goto L31;
        if (r0.getPosition(r22) <= r7) goto L33;
    L31:
        if (r22.hasFocusable() == false) goto L33;
        r83 = r83 - 1;
        r3 = r22;
    L33:
        return r3;
    }

    /* JADX INFO: renamed from: i */
    public int m310i(int r4) {
        ArrayList r0 = (ArrayList) this.f442f;
        int r1 = this.f438b;
        if (r1 == Integer.MIN_VALUE) goto L6;
        return r1;
    L6:
        if (r0.size() != 0) goto L8;
        return r4;
    L8:
        View r42 = (View) r0.get(0);
        C0771Ry r02 = (C0771Ry) r42.getLayoutParams();
        this.f438b = ((StaggeredGridLayoutManager) this.f443g).f3991c.mo5254e(r42);
        r02.getClass();
        return this.f438b;
    }

    /* JADX INFO: renamed from: j */
    public Object m311j(Object r5, Object r6) {
        C0668Pg r0 = (C0668Pg) this.f443g;
        monitor-enter(r0);
        this.f439c++;
        Object r52 = ((LinkedHashMap) ((C1017Xm) this.f442f).f3226b).put(r5, r6);     // Catch: Throwable -> L8
        if (r52 == null) goto L10;
        this.f439c--;
    L10:
        monitor-exit(r0);
        int r62 = this.f438b;
    L12:
        C0668Pg r02 = (C0668Pg) this.f443g;
        monitor-enter(r02);
    L21:
        th = move-exception;
        throw th;
    L15:
        if (this.f439c < 0) goto L48;
        if (((LinkedHashMap) ((C1017Xm) this.f442f).f3226b).isEmpty() == false) goto L24;
        if (this.f439c != 0) goto L48;
    L24:
        if (this.f439c <= r62) goto L45;
        if (((LinkedHashMap) ((C1017Xm) this.f442f).f3226b).isEmpty() == true) goto L45;
        Set r1 = ((LinkedHashMap) ((C1017Xm) this.f442f).f3226b).entrySet();     // Catch: Throwable -> L21
        Object r3 = null;
        if ((r1 instanceof List) == false) goto L34;
        List r12 = (List) r1;     // Catch: Throwable -> L21
        if (r12.isEmpty() == true) goto L38;
        r3 = r12.get(0);     // Catch: Throwable -> L21
    L38:
        Map.Entry r32 = (Map.Entry) r3;     // Catch: Throwable -> L21
        if (r32 == null) goto L40;
        Object r13 = r32.getKey();     // Catch: Throwable -> L21
        r32.getValue();     // Catch: Throwable -> L21
        ((LinkedHashMap) ((C1017Xm) this.f442f).f3226b).remove(r13);     // Catch: Throwable -> L21
        this.f439c--;
        monitor-exit(r02);
        goto L12
    L40:
        monitor-exit(r02);
        return r52;
    L34:
        Iterator r14 = r1.iterator();     // Catch: Throwable -> L21
        if (r14.hasNext() == false) goto L38;
        r3 = r14.next();     // Catch: Throwable -> L21
    L45:
        monitor-exit(r02);
        return r52;
    L48:
        throw new IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");     // Catch: Throwable -> L21
    L8:
        th = move-exception;
        throw th;
    }

    public String toString() {
        switch(this.f437a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        C0668Pg r1 = (C0668Pg) this.f443g;
        monitor-enter(r1);
        int r2 = this.f440d;     // Catch: Throwable -> L11
        int r3 = this.f441e + r2;     // Catch: Throwable -> L11
        if (r3 == 0) goto L13;
        int r22 = (r2 * 100) / r3;     // Catch: Throwable -> L11
    L14:
        String r0 = "LruCache[maxSize=" + this.f438b + ",hits=" + this.f440d + ",misses=" + this.f441e + ",hitRate=" + r22 + "%]";     // Catch: Throwable -> L11
        monitor-exit(r1);
        return r0;
    L13:
        r22 = 0;
    L11:
        th = move-exception;
        throw th;
    L5:
        return super.toString();
    }

    public C0161Dp(StaggeredGridLayoutManager r2, int r3) {
        this.f437a = 1;
        this.f443g = r2;
        this.f442f = new ArrayList();
        this.f438b = Integer.MIN_VALUE;
        this.f439c = Integer.MIN_VALUE;
        this.f440d = 0;
        this.f441e = r3;
    }
}
