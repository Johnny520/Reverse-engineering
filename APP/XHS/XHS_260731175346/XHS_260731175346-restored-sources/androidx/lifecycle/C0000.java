package androidx.lifecycle;

/* JADX INFO: renamed from: androidx.lifecycle.ᛷᛵᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0000 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public xhss.EnumC0064 f64;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.ref.WeakReference f65;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public boolean f66;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public xhss.C0758 f67;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final java.util.ArrayList f68;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public int f69;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public boolean f70;

    public C0000(xhss.InterfaceC0386 r2) {
            r1 = this;
            r1.<init>()
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            xhss.ᛸᛴᲀᛵ r0 = new xhss.ᛸᛴᲀᛵ
            r0.<init>()
            r1.f67 = r0
            xhss.ᛱᛷᛸᲁ r0 = xhss.EnumC0064.f352
            r1.f64 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f68 = r0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r2)
            r1.f65 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final xhss.EnumC0064 m23(xhss.InterfaceC0084 r4) {
            r3 = this;
            xhss.ᛸᛴᲀᛵ r0 = r3.f67
            java.util.HashMap r0 = r0.f2535
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 == 0) goto L14
            java.lang.Object r4 = r0.get(r4)
            xhss.ᛴᛴᲁᲈ r4 = (xhss.C0359) r4
            xhss.ᛴᛴᲁᲈ r4 = r4.f1324
            goto L15
        L14:
            r4 = r2
        L15:
            if (r4 == 0) goto L1e
            java.lang.Object r4 = r4.f1323
            xhss.ᛵᛸᛱᛵ r4 = (xhss.C0502) r4
            xhss.ᛱᛷᛸᲁ r4 = r4.f1820
            goto L1f
        L1e:
            r4 = r2
        L1f:
            java.util.ArrayList r0 = r3.f68
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L34
            int r1 = r0.size()
            int r1 = r1 + (-1)
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            xhss.ᛱᛷᛸᲁ r2 = (xhss.EnumC0064) r2
        L34:
            xhss.ᛱᛷᛸᲁ r3 = r3.f64
            if (r4 == 0) goto L3f
            int r0 = r4.compareTo(r3)
            if (r0 >= 0) goto L3f
            goto L40
        L3f:
            r4 = r3
        L40:
            if (r2 == 0) goto L49
            int r3 = r2.compareTo(r4)
            if (r3 >= 0) goto L49
            return r2
        L49:
            return r4
    }

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final void m24(java.lang.String r2) {
            r1 = this;
            xhss.ᛴᲇᲇᲈ r1 = xhss.C0420.m811()
            r1.getClass()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            if (r1 != r0) goto L16
            return
        L16:
            java.lang.String r1 = "Method "
            java.lang.String r0 = " must be called on the main thread"
            java.lang.String r1 = xhss.AbstractC0390.m781(r1, r2, r0)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final void m25(xhss.EnumC0064 r4) {
            r3 = this;
            xhss.ᛱᛷᛸᲁ r0 = r3.f64
            if (r0 != r4) goto L5
            goto L55
        L5:
            xhss.ᛱᛷᛸᲁ r1 = xhss.EnumC0064.f352
            xhss.ᛱᛷᛸᲁ r2 = xhss.EnumC0064.f351
            if (r0 != r1) goto L36
            if (r4 == r2) goto Le
            goto L36
        Le:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "no event down from "
            r4.<init>(r0)
            xhss.ᛱᛷᛸᲁ r0 = r3.f64
            r4.append(r0)
            java.lang.ref.WeakReference r3 = r3.f65
            java.lang.Object r3 = r3.get()
            java.lang.String r0 = " in component "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L36:
            r3.f64 = r4
            boolean r4 = r3.f66
            r0 = 1
            if (r4 != 0) goto L56
            int r4 = r3.f69
            if (r4 == 0) goto L42
            goto L56
        L42:
            r3.f66 = r0
            r3.m27()
            r4 = 0
            r3.f66 = r4
            xhss.ᛱᛷᛸᲁ r4 = r3.f64
            if (r4 != r2) goto L55
            xhss.ᛸᛴᲀᛵ r4 = new xhss.ᛸᛴᲀᛵ
            r4.<init>()
            r3.f67 = r4
        L55:
            return
        L56:
            r3.f70 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m26(xhss.InterfaceC0084 r10) {
            r9 = this;
            java.lang.String r0 = "addObserver"
            r9.m24(r0)
            xhss.ᛱᛷᛸᲁ r0 = r9.f64
            xhss.ᛱᛷᛸᲁ r1 = xhss.EnumC0064.f351
            if (r0 != r1) goto Lc
            goto Le
        Lc:
            xhss.ᛱᛷᛸᲁ r1 = xhss.EnumC0064.f352
        Le:
            xhss.ᛵᛸᛱᛵ r0 = new xhss.ᛵᛸᛱᛵ
            r0.<init>()
            java.util.HashMap r2 = xhss.AbstractC1163.f3762
            boolean r2 = r10 instanceof xhss.InterfaceC0712
            boolean r3 = r10 instanceof xhss.InterfaceC0610
            r4 = 2
            r5 = 0
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L2d
            if (r3 == 0) goto L2d
            androidx.lifecycle.DefaultLifecycleObserverAdapter r2 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            r3 = r10
            xhss.ᛶᲇᲈᲈ r3 = (xhss.InterfaceC0610) r3
            r8 = r10
            xhss.ᛷᲁᲇᲀ r8 = (xhss.InterfaceC0712) r8
            r2.<init>(r3, r8)
            goto L7d
        L2d:
            if (r3 == 0) goto L38
            androidx.lifecycle.DefaultLifecycleObserverAdapter r2 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            r3 = r10
            xhss.ᛶᲇᲈᲈ r3 = (xhss.InterfaceC0610) r3
            r2.<init>(r3, r5)
            goto L7d
        L38:
            if (r2 == 0) goto L3e
            r2 = r10
            xhss.ᛷᲁᲇᲀ r2 = (xhss.InterfaceC0712) r2
            goto L7d
        L3e:
            java.lang.Class r2 = r10.getClass()
            int r3 = xhss.AbstractC1163.m1859(r2)
            if (r3 != r4) goto L78
            java.util.HashMap r3 = xhss.AbstractC1163.f3761
            java.lang.Object r2 = r3.get(r2)
            java.util.List r2 = (java.util.List) r2
            int r3 = r2.size()
            if (r3 == r7) goto L6e
            int r3 = r2.size()
            xhss.ᛲᛴᛷᛴ[] r8 = new xhss.InterfaceC0154[r3]
            if (r3 > 0) goto L64
            androidx.lifecycle.CompositeGeneratedAdaptersObserver r2 = new androidx.lifecycle.CompositeGeneratedAdaptersObserver
            r2.<init>(r8)
            goto L7d
        L64:
            java.lang.Object r9 = r2.get(r6)
            java.lang.reflect.Constructor r9 = (java.lang.reflect.Constructor) r9
            xhss.AbstractC1163.m1860(r9, r10)
            throw r5
        L6e:
            java.lang.Object r9 = r2.get(r6)
            java.lang.reflect.Constructor r9 = (java.lang.reflect.Constructor) r9
            xhss.AbstractC1163.m1860(r9, r10)
            throw r5
        L78:
            androidx.lifecycle.ReflectiveGenericLifecycleObserver r2 = new androidx.lifecycle.ReflectiveGenericLifecycleObserver
            r2.<init>(r10)
        L7d:
            r0.f1819 = r2
            r0.f1820 = r1
            xhss.ᛸᛴᲀᛵ r1 = r9.f67
            xhss.ᛴᛴᲁᲈ r2 = r1.mo1301(r10)
            if (r2 == 0) goto L8c
            java.lang.Object r1 = r2.f1323
            goto Lab
        L8c:
            java.util.HashMap r2 = r1.f2535
            xhss.ᛴᛴᲁᲈ r3 = new xhss.ᛴᛴᲁᲈ
            r3.<init>(r10, r0)
            int r8 = r1.f3799
            int r8 = r8 + r7
            r1.f3799 = r8
            xhss.ᛴᛴᲁᲈ r8 = r1.f3798
            if (r8 != 0) goto La1
            r1.f3797 = r3
            r1.f3798 = r3
            goto La7
        La1:
            r8.f1325 = r3
            r3.f1324 = r8
            r1.f3798 = r3
        La7:
            r2.put(r10, r3)
            r1 = r5
        Lab:
            xhss.ᛵᛸᛱᛵ r1 = (xhss.C0502) r1
            if (r1 == 0) goto Lb0
            goto Lba
        Lb0:
            java.lang.ref.WeakReference r1 = r9.f65
            java.lang.Object r1 = r1.get()
            xhss.ᛴᛷᲀᲁ r1 = (xhss.InterfaceC0386) r1
            if (r1 != 0) goto Lbb
        Lba:
            return
        Lbb:
            int r2 = r9.f69
            if (r2 != 0) goto Lc3
            boolean r2 = r9.f66
            if (r2 == 0) goto Lc4
        Lc3:
            r6 = r7
        Lc4:
            xhss.ᛱᛷᛸᲁ r2 = r9.m23(r10)
            int r3 = r9.f69
            int r3 = r3 + r7
            r9.f69 = r3
        Lcd:
            xhss.ᛱᛷᛸᲁ r3 = r0.f1820
            int r2 = r3.compareTo(r2)
            if (r2 >= 0) goto L11c
            xhss.ᛸᛴᲀᛵ r2 = r9.f67
            java.util.HashMap r2 = r2.f2535
            boolean r2 = r2.containsKey(r10)
            if (r2 == 0) goto L11c
            xhss.ᛱᛷᛸᲁ r2 = r0.f1820
            java.util.ArrayList r3 = r9.f68
            r3.add(r2)
            xhss.ᲇᲈᲁᲈ r2 = xhss.EnumC1174.Companion
            xhss.ᛱᛷᛸᲁ r8 = r0.f1820
            r2.getClass()
            int r2 = r8.ordinal()
            if (r2 == r7) goto L100
            if (r2 == r4) goto Lfd
            r8 = 3
            if (r2 == r8) goto Lfa
            r2 = r5
            goto L102
        Lfa:
            xhss.ᲈᲀᛵᛸ r2 = xhss.EnumC1174.ON_RESUME
            goto L102
        Lfd:
            xhss.ᲈᲀᛵᛸ r2 = xhss.EnumC1174.ON_START
            goto L102
        L100:
            xhss.ᲈᲀᛵᛸ r2 = xhss.EnumC1174.ON_CREATE
        L102:
            if (r2 == 0) goto L114
            r0.m908(r1, r2)
            int r2 = r3.size()
            int r2 = r2 - r7
            r3.remove(r2)
            xhss.ᛱᛷᛸᲁ r2 = r9.m23(r10)
            goto Lcd
        L114:
            java.lang.String r9 = "no event up from "
            xhss.ᛱᛷᛸᲁ r10 = r0.f1820
            xhss.C0532.m949(r10, r9)
            return
        L11c:
            if (r6 != 0) goto L121
            r9.m27()
        L121:
            int r10 = r9.f69
            int r10 = r10 + (-1)
            r9.f69 = r10
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final void m27() {
            r11 = this;
            java.lang.ref.WeakReference r0 = r11.f65
            java.lang.Object r0 = r0.get()
            xhss.ᛴᛷᲀᲁ r0 = (xhss.InterfaceC0386) r0
            if (r0 == 0) goto L14a
        La:
            xhss.ᛸᛴᲀᛵ r1 = r11.f67
            int r2 = r1.f3799
            r3 = 0
            if (r2 != 0) goto L12
            goto L28
        L12:
            xhss.ᛴᛴᲁᲈ r2 = r1.f3797
            java.lang.Object r2 = r2.f1323
            xhss.ᛵᛸᛱᛵ r2 = (xhss.C0502) r2
            xhss.ᛱᛷᛸᲁ r2 = r2.f1820
            xhss.ᛴᛴᲁᲈ r1 = r1.f3798
            java.lang.Object r1 = r1.f1323
            xhss.ᛵᛸᛱᛵ r1 = (xhss.C0502) r1
            xhss.ᛱᛷᛸᲁ r1 = r1.f1820
            if (r2 != r1) goto L2b
            xhss.ᛱᛷᛸᲁ r4 = r11.f64
            if (r4 != r1) goto L2b
        L28:
            r11.f70 = r3
            return
        L2b:
            r11.f70 = r3
            xhss.ᛱᛷᛸᲁ r1 = r11.f64
            int r1 = r1.compareTo(r2)
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            java.util.ArrayList r6 = r11.f68
            if (r1 >= 0) goto Lba
            xhss.ᛸᛴᲀᛵ r1 = r11.f67
            xhss.ᛷᛷᲀ r7 = new xhss.ᛷᛷᲀ
            xhss.ᛴᛴᲁᲈ r8 = r1.f3798
            xhss.ᛴᛴᲁᲈ r9 = r1.f3797
            r7.<init>(r8, r9, r5)
            java.util.WeakHashMap r1 = r1.f3800
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.put(r7, r8)
        L4d:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lba
            boolean r1 = r11.f70
            if (r1 != 0) goto Lba
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r8 = r1.getKey()
            xhss.ᛱᲀᛲᲁ r8 = (xhss.InterfaceC0084) r8
            java.lang.Object r1 = r1.getValue()
            xhss.ᛵᛸᛱᛵ r1 = (xhss.C0502) r1
        L69:
            xhss.ᛱᛷᛸᲁ r9 = r1.f1820
            xhss.ᛱᛷᛸᲁ r10 = r11.f64
            int r9 = r9.compareTo(r10)
            if (r9 <= 0) goto L4d
            boolean r9 = r11.f70
            if (r9 != 0) goto L4d
            xhss.ᛸᛴᲀᛵ r9 = r11.f67
            java.util.HashMap r9 = r9.f2535
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto L4d
            xhss.ᲇᲈᲁᲈ r9 = xhss.EnumC1174.Companion
            xhss.ᛱᛷᛸᲁ r10 = r1.f1820
            r9.getClass()
            int r9 = r10.ordinal()
            if (r9 == r4) goto L9b
            if (r9 == r3) goto L98
            r10 = 4
            if (r9 == r10) goto L95
            r9 = r2
            goto L9d
        L95:
            xhss.ᲈᲀᛵᛸ r9 = xhss.EnumC1174.ON_PAUSE
            goto L9d
        L98:
            xhss.ᲈᲀᛵᛸ r9 = xhss.EnumC1174.ON_STOP
            goto L9d
        L9b:
            xhss.ᲈᲀᛵᛸ r9 = xhss.EnumC1174.ON_DESTROY
        L9d:
            if (r9 == 0) goto Lb2
            xhss.ᛱᛷᛸᲁ r10 = r9.m1864()
            r6.add(r10)
            r1.m908(r0, r9)
            int r9 = r6.size()
            int r9 = r9 - r5
            r6.remove(r9)
            goto L69
        Lb2:
            java.lang.String r11 = "no event down from "
            xhss.ᛱᛷᛸᲁ r0 = r1.f1820
            xhss.C0532.m949(r0, r11)
            return
        Lba:
            xhss.ᛸᛴᲀᛵ r1 = r11.f67
            xhss.ᛴᛴᲁᲈ r1 = r1.f3798
            boolean r7 = r11.f70
            if (r7 != 0) goto La
            if (r1 == 0) goto La
            xhss.ᛱᛷᛸᲁ r7 = r11.f64
            java.lang.Object r1 = r1.f1323
            xhss.ᛵᛸᛱᛵ r1 = (xhss.C0502) r1
            xhss.ᛱᛷᛸᲁ r1 = r1.f1820
            int r1 = r7.compareTo(r1)
            if (r1 <= 0) goto La
            xhss.ᛸᛴᲀᛵ r1 = r11.f67
            xhss.ᛲᲁᛸᛶ r7 = new xhss.ᛲᲁᛸᛶ
            r7.<init>(r1)
            java.util.WeakHashMap r1 = r1.f3800
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            r1.put(r7, r8)
        Le0:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto La
            boolean r1 = r11.f70
            if (r1 != 0) goto La
            java.lang.Object r1 = r7.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r8 = r1.getKey()
            xhss.ᛱᲀᛲᲁ r8 = (xhss.InterfaceC0084) r8
            java.lang.Object r1 = r1.getValue()
            xhss.ᛵᛸᛱᛵ r1 = (xhss.C0502) r1
        Lfc:
            xhss.ᛱᛷᛸᲁ r9 = r1.f1820
            xhss.ᛱᛷᛸᲁ r10 = r11.f64
            int r9 = r9.compareTo(r10)
            if (r9 >= 0) goto Le0
            boolean r9 = r11.f70
            if (r9 != 0) goto Le0
            xhss.ᛸᛴᲀᛵ r9 = r11.f67
            java.util.HashMap r9 = r9.f2535
            boolean r9 = r9.containsKey(r8)
            if (r9 == 0) goto Le0
            xhss.ᛱᛷᛸᲁ r9 = r1.f1820
            r6.add(r9)
            xhss.ᲇᲈᲁᲈ r9 = xhss.EnumC1174.Companion
            xhss.ᛱᛷᛸᲁ r10 = r1.f1820
            r9.getClass()
            int r9 = r10.ordinal()
            if (r9 == r5) goto L132
            if (r9 == r4) goto L12f
            if (r9 == r3) goto L12c
            r9 = r2
            goto L134
        L12c:
            xhss.ᲈᲀᛵᛸ r9 = xhss.EnumC1174.ON_RESUME
            goto L134
        L12f:
            xhss.ᲈᲀᛵᛸ r9 = xhss.EnumC1174.ON_START
            goto L134
        L132:
            xhss.ᲈᲀᛵᛸ r9 = xhss.EnumC1174.ON_CREATE
        L134:
            if (r9 == 0) goto L142
            r1.m908(r0, r9)
            int r9 = r6.size()
            int r9 = r9 - r5
            r6.remove(r9)
            goto Lfc
        L142:
            java.lang.String r11 = "no event up from "
            xhss.ᛱᛷᛸᲁ r0 = r1.f1820
            xhss.C0532.m949(r0, r11)
            return
        L14a:
            java.lang.String r11 = "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."
            xhss.C0532.m950(r11)
            return
    }

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final void m28(xhss.EnumC1174 r2) {
            r1 = this;
            java.lang.String r0 = "handleLifecycleEvent"
            r1.m24(r0)
            xhss.ᛱᛷᛸᲁ r2 = r2.m1864()
            r1.m25(r2)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final void m29(xhss.InterfaceC0084 r2) {
            r1 = this;
            java.lang.String r0 = "removeObserver"
            r1.m24(r0)
            xhss.ᛸᛴᲀᛵ r1 = r1.f67
            r1.mo1300(r2)
            return
    }
}
