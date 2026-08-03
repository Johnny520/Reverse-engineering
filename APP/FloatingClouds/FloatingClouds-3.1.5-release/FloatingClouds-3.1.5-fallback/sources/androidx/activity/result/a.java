package androidx.activity.result;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f801a;
    public final java.util.HashMap b;
    public final java.util.HashMap c;
    public java.util.ArrayList<java.lang.String> d;
    public final transient java.util.HashMap e;
    public final java.util.HashMap f;
    public final android.os.Bundle g;

    /* JADX INFO: renamed from: androidx.activity.result.a$a, reason: collision with other inner class name */
    public static class C0008a<O> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a.X<O> f802a;
        public final a.Y<?, O> b;

        public C0008a(a.Y r1, a.X r2) {
                r0 = this;
                r0.<init>()
                r0.f802a = r2
                r0.b = r1
                return
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.lifecycle.e f803a;
        public final java.util.ArrayList<androidx.lifecycle.g> b;

        public b(androidx.lifecycle.e r1) {
                r0 = this;
                r0.<init>()
                r0.f803a = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.b = r1
                return
        }
    }

    public a() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f801a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.b = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.d = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.e = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f = r0
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.g = r0
            return
    }

    public final boolean a(int r4, int r5, android.content.Intent r6) {
            r3 = this;
            java.util.HashMap r0 = r3.f801a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L10
            r4 = 0
            return r4
        L10:
            java.util.HashMap r0 = r3.e
            java.lang.Object r0 = r0.get(r4)
            androidx.activity.result.a$a r0 = (androidx.activity.result.a.C0008a) r0
            if (r0 == 0) goto L35
            a.X<O> r1 = r0.f802a
            if (r1 == 0) goto L35
            java.util.ArrayList<java.lang.String> r2 = r3.d
            boolean r2 = r2.contains(r4)
            if (r2 == 0) goto L35
            a.Y<?, O> r0 = r0.b
            java.lang.Object r5 = r0.c(r6, r5)
            r1.a(r5)
            java.util.ArrayList<java.lang.String> r5 = r3.d
            r5.remove(r4)
            goto L44
        L35:
            java.util.HashMap r0 = r3.f
            r0.remove(r4)
            a.W r0 = new a.W
            r0.<init>(r6, r5)
            android.os.Bundle r5 = r3.g
            r5.putParcelable(r4, r0)
        L44:
            r4 = 1
            return r4
    }

    public abstract void b(int r1, a.Y r2, @android.annotation.SuppressLint({"UnknownNullness"}) android.os.Parcelable r3);

    public final a.C0076c0 c(java.lang.String r4, androidx.activity.ComponentActivity r5, a.Y r6, a.X r7) {
            r3 = this;
            androidx.lifecycle.e r0 = r5.getLifecycle()
            androidx.lifecycle.e$b r1 = r0.b()
            androidx.lifecycle.e$b r2 = androidx.lifecycle.e.b.d
            int r1 = r1.compareTo(r2)
            if (r1 >= 0) goto L3a
            r3.e(r4)
            java.util.HashMap r5 = r3.c
            java.lang.Object r1 = r5.get(r4)
            androidx.activity.result.a$b r1 = (androidx.activity.result.a.b) r1
            if (r1 != 0) goto L22
            androidx.activity.result.a$b r1 = new androidx.activity.result.a$b
            r1.<init>(r0)
        L22:
            androidx.activity.result.ActivityResultRegistry$1 r0 = new androidx.activity.result.ActivityResultRegistry$1
            r0.<init>(r3, r4, r7, r6)
            androidx.lifecycle.e r6 = r1.f803a
            r6.a(r0)
            java.util.ArrayList<androidx.lifecycle.g> r6 = r1.b
            r6.add(r0)
            r5.put(r4, r1)
            a.c0 r4 = new a.c0
            r4.<init>()
            return r4
        L3a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "LifecycleOwner "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = " is attempting to register while current state is "
            r6.append(r5)
            androidx.lifecycle.e$b r5 = r0.b()
            r6.append(r5)
            java.lang.String r5 = ". LifecycleOwners must call register before they are STARTED."
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5)
            throw r4
    }

    public final a.C0094d0 d(java.lang.String r3, a.Y r4, a.X r5) {
            r2 = this;
            r2.e(r3)
            java.util.HashMap r0 = r2.e
            androidx.activity.result.a$a r1 = new androidx.activity.result.a$a
            r1.<init>(r4, r5)
            r0.put(r3, r1)
            java.util.HashMap r0 = r2.f
            boolean r1 = r0.containsKey(r3)
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.get(r3)
            r0.remove(r3)
            r5.a(r1)
        L1f:
            android.os.Bundle r0 = r2.g
            android.os.Parcelable r1 = r0.getParcelable(r3)
            a.W r1 = (a.W) r1
            if (r1 == 0) goto L37
            r0.remove(r3)
            int r0 = r1.f311a
            android.content.Intent r1 = r1.b
            java.lang.Object r0 = r4.c(r1, r0)
            r5.a(r0)
        L37:
            a.d0 r5 = new a.d0
            r5.<init>(r2, r3, r4)
            return r5
    }

    public final void e(java.lang.String r7) {
            r6 = this;
            java.util.HashMap r0 = r6.b
            java.lang.Object r1 = r0.get(r7)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lb
            return
        Lb:
            a.Nc$a r1 = a.Nc.f186a
            r1.getClass()
            a.y r1 = a.Nc.b
            java.util.Random r1 = r1.a()
            r2 = 2147418112(0x7fff0000, float:NaN)
            int r1 = r1.nextInt(r2)
            r3 = 65536(0x10000, float:9.1835E-41)
        L1e:
            int r1 = r1 + r3
            java.util.HashMap r4 = r6.f801a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            boolean r5 = r4.containsKey(r5)
            if (r5 == 0) goto L3b
            a.Nc$a r1 = a.Nc.f186a
            r1.getClass()
            a.y r1 = a.Nc.b
            java.util.Random r1 = r1.a()
            int r1 = r1.nextInt(r2)
            goto L1e
        L3b:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r4.put(r2, r7)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r7, r1)
            return
    }

    public final void f(java.lang.String r7) {
            r6 = this;
            java.util.ArrayList<java.lang.String> r0 = r6.d
            boolean r0 = r0.contains(r7)
            if (r0 != 0) goto L17
            java.util.HashMap r0 = r6.b
            java.lang.Object r0 = r0.remove(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto L17
            java.util.HashMap r1 = r6.f801a
            r1.remove(r0)
        L17:
            java.util.HashMap r0 = r6.e
            r0.remove(r7)
            java.util.HashMap r0 = r6.f
            boolean r1 = r0.containsKey(r7)
            java.lang.String r2 = ": "
            java.lang.String r3 = "Dropping pending result for request "
            java.lang.String r4 = "ActivityResultRegistry"
            if (r1 == 0) goto L46
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r7)
            r1.append(r2)
            java.lang.Object r5 = r0.get(r7)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r4, r1)
            r0.remove(r7)
        L46:
            android.os.Bundle r0 = r6.g
            boolean r1 = r0.containsKey(r7)
            if (r1 == 0) goto L6a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r3)
            r1.append(r7)
            r1.append(r2)
            android.os.Parcelable r2 = r0.getParcelable(r7)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            android.util.Log.w(r4, r1)
            r0.remove(r7)
        L6a:
            java.util.HashMap r0 = r6.c
            java.lang.Object r1 = r0.get(r7)
            androidx.activity.result.a$b r1 = (androidx.activity.result.a.b) r1
            if (r1 == 0) goto L92
            java.util.ArrayList<androidx.lifecycle.g> r2 = r1.b
            java.util.Iterator r3 = r2.iterator()
        L7a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L8c
            java.lang.Object r4 = r3.next()
            androidx.lifecycle.g r4 = (androidx.lifecycle.g) r4
            androidx.lifecycle.e r5 = r1.f803a
            r5.c(r4)
            goto L7a
        L8c:
            r2.clear()
            r0.remove(r7)
        L92:
            return
    }
}
