package c9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r8.g f1324a;

    public /* synthetic */ q1(r8.g r1) {
            r0 = this;
            r0.<init>()
            r0.f1324a = r1
            return
    }

    public final void a(b.e r9) {
            r8 = this;
            r8.g r0 = r8.f1324a
            android.content.Context r1 = r0.f11620a
            java.util.List r1 = c9.o2.i(r1)
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.lang.Object r3 = r9.f333i
            l8.b r3 = (l8.b) r3
            if (r3 == 0) goto L1e
            java.lang.String r3 = r3.f7898a
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L1e
            r2.add(r3)
        L1e:
            java.lang.Object r9 = r9.f332h
            l8.a r9 = (l8.a) r9
            android.content.ContentValues r3 = r9.f7895d
            java.lang.String r4 = "username"
            java.lang.String r3 = h8.b.b(r3, r4)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L33
            r2.add(r3)
        L33:
            java.lang.String r3 = r9.f7896e
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            r6 = 0
            if (r5 != 0) goto L5e
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r3 = r3.toLowerCase(r5)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto L5e
            java.lang.String[] r9 = r9.f7897f
            if (r9 == 0) goto L5e
            int r3 = r9.length
            r4 = r6
        L4e:
            if (r4 >= r3) goto L5e
            r5 = r9[r4]
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L5b
            r2.add(r5)
        L5b:
            int r4 = r4 + 1
            goto L4e
        L5e:
            java.lang.String[] r9 = new java.lang.String[r6]
            java.lang.Object[] r9 = r2.toArray(r9)
            java.lang.String[] r9 = (java.lang.String[]) r9
            if (r9 == 0) goto L6d
            java.util.List r9 = tf.l.L0(r9)
            goto L6e
        L6d:
            r9 = 0
        L6e:
            if (r9 != 0) goto L72
            tf.t r9 = tf.t.f13167g
        L72:
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L79
            goto L9d
        L79:
            java.util.Iterator r9 = r9.iterator()
        L7d:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L9d
            java.lang.Object r2 = r9.next()
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            boolean r3 = og.m.t0(r2)
            if (r3 != 0) goto L7d
            java.lang.String r2 = c9.o2.d(r2, r1)
            if (r2 == 0) goto L7d
            android.content.Context r9 = r0.f11620a
            c9.d2.y(r9)
        L9d:
            return
    }
}
