package defpackage;

/* JADX INFO: renamed from: ᛵᛵᛱᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0884 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object f3971;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final int f3972;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3973;

    public RunnableC0884(java.util.List r1, int r2, java.lang.Throwable r3) {
            r0 = this;
            r3 = 0
            r0.f3973 = r3
            r0.<init>()
            java.lang.String r3 = "initCallbacks cannot be null"
            defpackage.C1825.m3220(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            r0.f3971 = r3
            r0.f3972 = r2
            return
    }

    public RunnableC0884(defpackage.C0060 r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f3973 = r0
            r1.<init>()
            r1.f3971 = r2
            r1.f3972 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.f3973
            int r1 = r11.f3972
            java.lang.Object r2 = r11.f3971
            r3 = 0
            r4 = 1
            switch(r0) {
                case 0: goto Ld8;
                default: goto Lb;
            }
        Lb:
            ᛱᛳᲀᛷ r2 = (defpackage.C0060) r2
            ᛳᛸᛳᛸ r0 = r2.f701
            int r5 = defpackage.AbstractC0225.m812(r1)
            r0.f2587 = r5
            ᛱᲇᲁᲈ r5 = r2.f697
            if (r5 != 0) goto L1b
            goto Ld7
        L1b:
            int r1 = defpackage.AbstractC0225.m812(r1)
            if (r1 == 0) goto Lb5
            r5 = 4
            r6 = 2
            r7 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r4) goto L69
            r8 = 3
            r9 = 1073741824(0x40000000, float:2.0)
            if (r1 == r6) goto L4c
            if (r1 == r8) goto L2f
            goto L85
        L2f:
            ᛱᲇᲁᲈ r1 = r2.f697
            int r6 = r1.f1294
            if (r6 != r8) goto L36
            goto L85
        L36:
            if (r6 != r5) goto L43
            r1.m756(r7)
            ᛱᛸᛵᛸ r6 = new ᛱᛸᛵᛸ
            r6.<init>(r1, r5)
            r1.f1288 = r6
            goto L85
        L43:
            android.view.animation.DecelerateInterpolator r5 = new android.view.animation.DecelerateInterpolator
            r5.<init>(r9)
            r1.m757(r8, r5)
            goto L85
        L4c:
            ᛱᲇᲁᲈ r1 = r2.f697
            int r10 = r1.f1294
            if (r10 != r6) goto L53
            goto L85
        L53:
            if (r10 != r5) goto L60
            r1.m756(r7)
            ᛱᛸᛵᛸ r5 = new ᛱᛸᛵᛸ
            r5.<init>(r1, r8)
            r1.f1288 = r5
            goto L85
        L60:
            android.view.animation.AccelerateInterpolator r5 = new android.view.animation.AccelerateInterpolator
            r5.<init>(r9)
            r1.m757(r6, r5)
            goto L85
        L69:
            ᛱᲇᲁᲈ r1 = r2.f697
            int r8 = r1.f1294
            if (r8 != r4) goto L70
            goto L85
        L70:
            if (r8 != r5) goto L7d
            r1.m756(r7)
            ᛱᛸᛵᛸ r5 = new ᛱᛸᛵᛸ
            r5.<init>(r1, r6)
            r1.f1288 = r5
            goto L85
        L7d:
            android.view.animation.AccelerateDecelerateInterpolator r5 = new android.view.animation.AccelerateDecelerateInterpolator
            r5.<init>()
            r1.m757(r4, r5)
        L85:
            android.widget.RelativeLayout r1 = r2.f698
            if (r1 == 0) goto L99
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L99
            ᛱᲇᲁᲈ r0 = r2.f697
            ᛷᛳᛶᛷ r1 = new ᛷᛳᛶᛷ
            r1.<init>(r11, r3)
            r0.f1290 = r1
            goto Ld7
        L99:
            ᲈᲀᛴᛷ r1 = new ᲈᲀᛴᛷ
            r1.<init>()
            r1.m3793()
            r2.m476()
            long r0 = r0.f2589
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto Ld7
            ᛷᛳᛶᛷ r2 = new ᛷᛳᛶᛷ
            r2.<init>(r11, r4)
            com.kongzue.dialogx.interfaces.AbstractC0008.m248(r2, r0)
            goto Ld7
        Lb5:
            ᛱᲇᲁᲈ r11 = r2.f697
            int r0 = r11.f1294
            if (r0 != 0) goto Lbc
            goto Ld7
        Lbc:
            r11.f1298 = r3
            r11.f1287 = r3
            r11.f1297 = r3
            r11.f1299 = r3
            r11.f1294 = r3
            ᛵ r0 = r11.f1304
            if (r0 == 0) goto Lcc
            r0.f3717 = r3
        Lcc:
            ᛵ r0 = r11.f1307
            if (r0 == 0) goto Ld2
            r0.f3717 = r3
        Ld2:
            r11.f1296 = r3
            r11.m759()
        Ld7:
            return
        Ld8:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r11 = r2.size()
            if (r1 == r4) goto Lee
        Le0:
            if (r3 >= r11) goto Lfc
            java.lang.Object r0 = r2.get(r3)
            ᛶᲁᛲᛸ r0 = (defpackage.AbstractC1148) r0
            r0.getClass()
            int r3 = r3 + 1
            goto Le0
        Lee:
            if (r3 >= r11) goto Lfc
            java.lang.Object r0 = r2.get(r3)
            ᛶᲁᛲᛸ r0 = (defpackage.AbstractC1148) r0
            r0.mo1183()
            int r3 = r3 + 1
            goto Lee
        Lfc:
            return
    }
}
