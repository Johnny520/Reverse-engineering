package defpackage;

/* JADX INFO: renamed from: ᲁᛸᲁᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1904 implements defpackage.InterfaceC1872 {

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.util.LinkedHashSet f8265;

    public C1904(defpackage.C1020 r4) {
            r3 = this;
            r3.<init>()
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            r3.f8265 = r0
            java.lang.Object r4 = r4.f4553
            ᛸᛱᛴᲀ r4 = (defpackage.C1418) r4
            java.lang.String r0 = "androidx.savedstate.Restarter"
            ᛴᛵᛳ r1 = r4.mo2601(r0)
            r2 = 0
            if (r1 == 0) goto L1a
            java.lang.Object r3 = r1.f3254
            goto L35
        L1a:
            ᛴᛵᛳ r1 = new ᛴᛵᛳ
            r1.<init>(r0, r3)
            int r3 = r4.f6210
            int r3 = r3 + 1
            r4.f6210 = r3
            ᛴᛵᛳ r3 = r4.f6208
            if (r3 != 0) goto L2e
            r4.f6209 = r1
            r4.f6208 = r1
            goto L34
        L2e:
            r3.f3253 = r1
            r1.f3256 = r3
            r4.f6208 = r1
        L34:
            r3 = r2
        L35:
            ᲁᛶᛵᛵ r3 = (defpackage.InterfaceC1872) r3
            if (r3 != 0) goto L3a
            return
        L3a:
            java.lang.String r3 = "SavedStateProvider with the given key is already registered"
            defpackage.C2264.m3684(r3)
            throw r2
    }

    @Override // defpackage.InterfaceC1872
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final android.os.Bundle mo2688() {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.LinkedHashSet r2 = r2.f8265
            r1.<init>(r2)
            java.lang.String r2 = "classes_to_restore"
            r0.putStringArrayList(r2, r1)
            return r0
    }
}
