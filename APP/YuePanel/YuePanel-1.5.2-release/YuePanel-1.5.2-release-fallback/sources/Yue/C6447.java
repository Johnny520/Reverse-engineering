package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۢۡۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C6447 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.Map<java.lang.String, java.lang.Object> f22708;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    @android.annotation.SuppressLint({"UnknownNullness"})
    public android.view.View f22709;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.ArrayList<Yue.AbstractC6398> f22710;

    @java.lang.Deprecated
    public C6447() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f22708 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f22710 = r0
            return
    }

    public C6447(@Yue.InterfaceC4410 android.view.View r2) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f22708 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f22710 = r0
            r1.f22709 = r2
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof Yue.C6447
            if (r0 == 0) goto L18
            android.view.View r0 = r2.f22709
            Yue.ۥۢۢۡۤ r3 = (Yue.C6447) r3
            android.view.View r1 = r3.f22709
            if (r0 != r1) goto L18
            java.util.Map<java.lang.String, java.lang.Object> r0 = r2.f22708
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f22708
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L18
            r3 = 1
            return r3
        L18:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            android.view.View r0 = r2.f22709
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.Map<java.lang.String, java.lang.Object> r1 = r2.f22708
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Yue.InterfaceC4410
    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "TransitionValues@"
            r0.append(r1)
            int r1 = r5.hashCode()
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = ":\n"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "    view = "
            r1.append(r0)
            android.view.View r0 = r5.f22709
            r1.append(r0)
            java.lang.String r0 = "\n"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "    values:"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.util.Map<java.lang.String, java.lang.Object> r2 = r5.f22708
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L54:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L86
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r1)
            java.lang.String r1 = "    "
            r4.append(r1)
            r4.append(r3)
            java.lang.String r1 = ": "
            r4.append(r1)
            java.util.Map<java.lang.String, java.lang.Object> r1 = r5.f22708
            java.lang.Object r1 = r1.get(r3)
            r4.append(r1)
            r4.append(r0)
            java.lang.String r1 = r4.toString()
            goto L54
        L86:
            return r1
    }
}
