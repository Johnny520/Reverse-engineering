package a;

/* JADX INFO: renamed from: a.h7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0173h7 implements a.X<a.W> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.AbstractC0119e7 f494a;

    public C0173h7(a.AbstractC0119e7 r1) {
            r0 = this;
            r0.<init>()
            r0.f494a = r1
            return
    }

    @Override // a.X
    public final void a(a.W r5) {
            r4 = this;
            a.W r5 = (a.W) r5
            a.e7 r0 = r4.f494a
            java.util.ArrayDeque<a.e7$g> r1 = r0.E
            java.lang.Object r1 = r1.pollFirst()
            a.e7$g r1 = (a.AbstractC0119e7.g) r1
            java.lang.String r2 = "FragmentManager"
            if (r1 != 0) goto L22
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "No IntentSenders were started for "
            r5.<init>(r0)
            r5.append(r4)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r2, r5)
            return
        L22:
            a.A2 r0 = r0.c
            java.lang.String r3 = r1.f455a
            androidx.fragment.app.b r0 = r0.d(r3)
            if (r0 != 0) goto L3e
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Intent Sender result delivered for unknown Fragment "
            r5.<init>(r0)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r2, r5)
            return
        L3e:
            int r2 = r5.f311a
            int r1 = r1.b
            android.content.Intent r5 = r5.b
            r0.m(r1, r2, r5)
            return
    }
}
