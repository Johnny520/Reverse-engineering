package defpackage;

/* JADX INFO: renamed from: ᲈᛸᛲᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C2301 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f9728;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f9729;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f9730;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f9731;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public int f9732;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final java.lang.Object f9733;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final java.lang.Object f9734;

    public C2301(int r2) {
            r1 = this;
            r0 = 0
            r1.f9731 = r0
            r1.<init>()
            r1.f9732 = r2
            if (r2 <= 0) goto L1a
            ᛳᛴᛱᲀ r2 = new ᛳᛴᛱᲀ
            r0 = 0
            r2.<init>(r0)
            r1.f9733 = r2
            ᲈᛴᛵᲈ r2 = new ᲈᛴᛵᲈ
            r2.<init>(r0)
            r1.f9734 = r2
            return
        L1a:
            java.lang.String r1 = "maxSize <= 0"
            defpackage.AbstractC2279.m3697(r1)
            r1 = 0
            throw r1
    }

    public C2301(androidx.recyclerview.widget.StaggeredGridLayoutManager r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f9731 = r0
            r1.<init>()
            r1.f9734 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9733 = r2
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f9732 = r2
            r1.f9730 = r2
            r2 = 0
            r1.f9729 = r2
            r1.f9728 = r3
            return
    }

    public java.lang.String toString() {
            r4 = this;
            int r0 = r4.f9731
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r4 = super.toString()
            return r4
        La:
            java.lang.String r0 = "LruCache[maxSize="
            java.lang.Object r1 = r4.f9734
            ᲈᛴᛵᲈ r1 = (defpackage.C2223) r1
            monitor-enter(r1)
            int r2 = r4.f9729     // Catch: java.lang.Throwable -> L1c
            int r3 = r4.f9728     // Catch: java.lang.Throwable -> L1c
            int r3 = r3 + r2
            if (r3 == 0) goto L1e
            int r2 = r2 * 100
            int r2 = r2 / r3
            goto L1f
        L1c:
            r4 = move-exception
            goto L50
        L1e:
            r2 = 0
        L1f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L1c
            int r0 = r4.f9732     // Catch: java.lang.Throwable -> L1c
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = ",hits="
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            int r0 = r4.f9729     // Catch: java.lang.Throwable -> L1c
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r0 = ",misses="
            r3.append(r0)     // Catch: java.lang.Throwable -> L1c
            int r4 = r4.f9728     // Catch: java.lang.Throwable -> L1c
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = ",hitRate="
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            r3.append(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "%]"
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r3.toString()     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r1)
            return r4
        L50:
            monitor-exit(r1)
            throw r4
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public java.lang.Object m3732(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = r4.f9734
            ᲈᛴᛵᲈ r0 = (defpackage.C2223) r0
            monitor-enter(r0)
            java.lang.Object r1 = r4.f9733     // Catch: java.lang.Throwable -> L19
            ᛳᛴᛱᲀ r1 = (defpackage.C0448) r1     // Catch: java.lang.Throwable -> L19
            java.util.LinkedHashMap r1 = r1.f2205     // Catch: java.lang.Throwable -> L19
            java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Throwable -> L19
            if (r1 == 0) goto L1b
            int r5 = r4.f9729     // Catch: java.lang.Throwable -> L19
            int r5 = r5 + 1
            r4.f9729 = r5     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            return r1
        L19:
            r4 = move-exception
            goto L5b
        L1b:
            int r1 = r4.f9728     // Catch: java.lang.Throwable -> L19
            int r1 = r1 + 1
            r4.f9728 = r1     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            java.lang.Object r0 = r4.mo2079(r5)
            if (r0 != 0) goto L2a
            r4 = 0
            return r4
        L2a:
            java.lang.Object r1 = r4.f9734
            ᲈᛴᛵᲈ r1 = (defpackage.C2223) r1
            monitor-enter(r1)
            java.lang.Object r2 = r4.f9733     // Catch: java.lang.Throwable -> L58
            ᛳᛴᛱᲀ r2 = (defpackage.C0448) r2     // Catch: java.lang.Throwable -> L58
            java.util.LinkedHashMap r2 = r2.f2205     // Catch: java.lang.Throwable -> L58
            java.lang.Object r2 = r2.put(r5, r0)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L45
            java.lang.Object r3 = r4.f9733     // Catch: java.lang.Throwable -> L58
            ᛳᛴᛱᲀ r3 = (defpackage.C0448) r3     // Catch: java.lang.Throwable -> L58
            java.util.LinkedHashMap r3 = r3.f2205     // Catch: java.lang.Throwable -> L58
            r3.put(r5, r2)     // Catch: java.lang.Throwable -> L58
            goto L4b
        L45:
            int r3 = r4.f9730     // Catch: java.lang.Throwable -> L58
            int r3 = r3 + 1
            r4.f9730 = r3     // Catch: java.lang.Throwable -> L58
        L4b:
            monitor-exit(r1)
            if (r2 == 0) goto L52
            r4.mo2078(r5, r0, r2)
            return r2
        L52:
            int r5 = r4.f9732
            r4.m3737(r5)
            return r0
        L58:
            r4 = move-exception
            monitor-exit(r1)
            throw r4
        L5b:
            monitor-exit(r0)
            throw r4
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int m3733(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f9733
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r3.f9732
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r2) goto Lb
            return r1
        Lb:
            int r1 = r0.size()
            if (r1 != 0) goto L12
            return r4
        L12:
            r4 = 0
            java.lang.Object r4 = r0.get(r4)
            android.view.View r4 = (android.view.View) r4
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            ᛱᲇᛲ r0 = (defpackage.C0193) r0
            java.lang.Object r1 = r3.f9734
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            ᲇᲁᛱᛱ r1 = r1.f333
            int r4 = r1.mo1943(r4)
            r3.f9732 = r4
            r0.getClass()
            int r3 = r3.f9732
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public java.lang.Object m3734(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            java.lang.Object r0 = r3.f9734
            ᲈᛴᛵᲈ r0 = (defpackage.C2223) r0
            monitor-enter(r0)
            int r1 = r3.f9730     // Catch: java.lang.Throwable -> L1e
            int r1 = r1 + 1
            r3.f9730 = r1     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r3.f9733     // Catch: java.lang.Throwable -> L1e
            ᛳᛴᛱᲀ r1 = (defpackage.C0448) r1     // Catch: java.lang.Throwable -> L1e
            java.util.LinkedHashMap r1 = r1.f2205     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r1 = r1.put(r4, r5)     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            int r2 = r3.f9730     // Catch: java.lang.Throwable -> L1e
            int r2 = r2 + (-1)
            r3.f9730 = r2     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            monitor-exit(r0)
            if (r1 == 0) goto L26
            r3.mo2078(r4, r1, r5)
        L26:
            int r4 = r3.f9732
            r3.m3737(r4)
            return r1
        L2c:
            monitor-exit(r0)
            throw r3
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public int m3735(int r3) {
            r2 = this;
            int r0 = r2.f9730
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r1) goto L7
            return r0
        L7:
            java.lang.Object r0 = r2.f9733
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 != 0) goto L12
            return r3
        L12:
            r2.m3738()
            int r2 = r2.f9730
            return r2
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int m3736() {
            r2 = this;
            java.lang.Object r0 = r2.f9734
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            boolean r0 = r0.f328
            java.lang.Object r1 = r2.f9733
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r0 == 0) goto L18
            int r0 = r1.size()
            int r0 = r0 + (-1)
            r1 = -1
            int r2 = r2.m3742(r0, r1)
            return r2
        L18:
            r0 = 0
            int r1 = r1.size()
            int r2 = r2.m3742(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public void m3737(int r6) {
            r5 = this;
        L0:
            java.lang.Object r0 = r5.f9734
            ᲈᛴᛵᲈ r0 = (defpackage.C2223) r0
            monitor-enter(r0)
            int r1 = r5.f9730     // Catch: java.lang.Throwable -> L1a
            if (r1 < 0) goto L80
            java.lang.Object r1 = r5.f9733     // Catch: java.lang.Throwable -> L1a
            ᛳᛴᛱᲀ r1 = (defpackage.C0448) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f2205     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L1d
            int r1 = r5.f9730     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L80
            goto L1d
        L1a:
            r5 = move-exception
            goto L88
        L1d:
            int r1 = r5.f9730     // Catch: java.lang.Throwable -> L1a
            if (r1 <= r6) goto L7e
            java.lang.Object r1 = r5.f9733     // Catch: java.lang.Throwable -> L1a
            ᛳᛴᛱᲀ r1 = (defpackage.C0448) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f2205     // Catch: java.lang.Throwable -> L1a
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r1 == 0) goto L2e
            goto L7e
        L2e:
            java.lang.Object r1 = r5.f9733     // Catch: java.lang.Throwable -> L1a
            ᛳᛴᛱᲀ r1 = (defpackage.C0448) r1     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r1 = r1.f2205     // Catch: java.lang.Throwable -> L1a
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L1a
            r3 = 0
            if (r2 == 0) goto L4d
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L47
        L45:
            r1 = r3
            goto L5c
        L47:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L1a
            goto L5c
        L4d:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1a
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1a
            if (r2 != 0) goto L58
            goto L45
        L58:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L1a
        L5c:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L1a
            if (r1 != 0) goto L62
            monitor-exit(r0)
            return
        L62:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r4 = r5.f9733     // Catch: java.lang.Throwable -> L1a
            ᛳᛴᛱᲀ r4 = (defpackage.C0448) r4     // Catch: java.lang.Throwable -> L1a
            java.util.LinkedHashMap r4 = r4.f2205     // Catch: java.lang.Throwable -> L1a
            r4.remove(r2)     // Catch: java.lang.Throwable -> L1a
            int r4 = r5.f9730     // Catch: java.lang.Throwable -> L1a
            int r4 = r4 + (-1)
            r5.f9730 = r4     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)
            r5.mo2078(r2, r1, r3)
            goto L0
        L7e:
            monitor-exit(r0)
            return
        L80:
            java.lang.String r5 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L1a
            throw r6     // Catch: java.lang.Throwable -> L1a
        L88:
            monitor-exit(r0)
            throw r5
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public void mo2078(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public java.lang.Object mo2079(java.lang.Object r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void m3738() {
            r3 = this;
            java.lang.Object r0 = r3.f9733
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            android.view.View r0 = (android.view.View) r0
            android.view.ViewGroup$LayoutParams r1 = r0.getLayoutParams()
            ᛱᲇᛲ r1 = (defpackage.C0193) r1
            java.lang.Object r2 = r3.f9734
            androidx.recyclerview.widget.StaggeredGridLayoutManager r2 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r2
            ᲇᲁᛱᛱ r2 = r2.f333
            int r0 = r2.mo1937(r0)
            r3.f9730 = r0
            r1.getClass()
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public android.view.View m3739(int r6, int r7) {
            r5 = this;
            java.lang.Object r0 = r5.f9734
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            java.lang.Object r5 = r5.f9733
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r1 = 0
            r2 = -1
            if (r7 != r2) goto L39
            int r7 = r5.size()
            r2 = 0
        L11:
            if (r2 >= r7) goto L38
            java.lang.Object r3 = r5.get(r2)
            android.view.View r3 = (android.view.View) r3
            boolean r4 = r0.f328
            if (r4 == 0) goto L23
            int r4 = defpackage.AbstractC1270.m2371(r3)
            if (r4 <= r6) goto L38
        L23:
            boolean r4 = r0.f328
            if (r4 != 0) goto L2e
            int r4 = defpackage.AbstractC1270.m2371(r3)
            if (r4 < r6) goto L2e
            goto L38
        L2e:
            boolean r4 = r3.hasFocusable()
            if (r4 == 0) goto L38
            int r2 = r2 + 1
            r1 = r3
            goto L11
        L38:
            return r1
        L39:
            int r7 = r5.size()
            int r7 = r7 + (-1)
        L3f:
            if (r7 < 0) goto L66
            java.lang.Object r2 = r5.get(r7)
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r0.f328
            if (r3 == 0) goto L51
            int r3 = defpackage.AbstractC1270.m2371(r2)
            if (r3 >= r6) goto L66
        L51:
            boolean r3 = r0.f328
            if (r3 != 0) goto L5c
            int r3 = defpackage.AbstractC1270.m2371(r2)
            if (r3 > r6) goto L5c
            goto L66
        L5c:
            boolean r3 = r2.hasFocusable()
            if (r3 == 0) goto L66
            int r7 = r7 + (-1)
            r1 = r2
            goto L3f
        L66:
            return r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void m3740() {
            r1 = this;
            java.lang.Object r0 = r1.f9733
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.clear()
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.f9732 = r0
            r1.f9730 = r0
            r0 = 0
            r1.f9729 = r0
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int m3741() {
            r2 = this;
            java.lang.Object r0 = r2.f9734
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            boolean r0 = r0.f328
            java.lang.Object r1 = r2.f9733
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            if (r0 == 0) goto L16
            r0 = 0
            int r1 = r1.size()
            int r2 = r2.m3742(r0, r1)
            return r2
        L16:
            int r0 = r1.size()
            int r0 = r0 + (-1)
            r1 = -1
            int r2 = r2.m3742(r0, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public int m3742(int r12, int r13) {
            r11 = this;
            java.lang.Object r0 = r11.f9734
            androidx.recyclerview.widget.StaggeredGridLayoutManager r0 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r0
            ᲇᲁᛱᛱ r1 = r0.f333
            int r1 = r1.mo1936()
            ᲇᲁᛱᛱ r2 = r0.f333
            int r2 = r2.mo1933()
            r3 = -1
            r4 = 1
            if (r13 <= r12) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r3
        L17:
            if (r12 == r13) goto L47
            java.lang.Object r6 = r11.f9733
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r6 = r6.get(r12)
            android.view.View r6 = (android.view.View) r6
            ᲇᲁᛱᛱ r7 = r0.f333
            int r7 = r7.mo1943(r6)
            ᲇᲁᛱᛱ r8 = r0.f333
            int r8 = r8.mo1937(r6)
            r9 = 0
            if (r7 > r2) goto L34
            r10 = r4
            goto L35
        L34:
            r10 = r9
        L35:
            if (r8 < r1) goto L38
            r9 = r4
        L38:
            if (r10 == 0) goto L45
            if (r9 == 0) goto L45
            if (r7 < r1) goto L40
            if (r8 <= r2) goto L45
        L40:
            int r11 = defpackage.AbstractC1270.m2371(r6)
            return r11
        L45:
            int r12 = r12 + r5
            goto L17
        L47:
            return r3
    }
}
