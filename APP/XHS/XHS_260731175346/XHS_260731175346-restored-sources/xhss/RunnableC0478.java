package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛶᛲᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0478 implements java.lang.Runnable {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f1734;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final int f1735;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final java.lang.Object f1736;

    public RunnableC0478(java.util.List r1, int r2, java.lang.Throwable r3) {
            r0 = this;
            r3 = 0
            r0.f1734 = r3
            r0.<init>()
            java.lang.String r3 = "initCallbacks cannot be null"
            xhss.AbstractC0060.m191(r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r1)
            r0.f1736 = r3
            r0.f1735 = r2
            return
    }

    public RunnableC0478(xhss.C0891 r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f1734 = r0
            r1.<init>()
            r1.f1736 = r2
            r1.f1735 = r3
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            int r0 = r11.f1734
            int r1 = r11.f1735
            java.lang.Object r2 = r11.f1736
            r3 = 0
            r4 = 1
            switch(r0) {
                case 0: goto Ld8;
                default: goto Lb;
            }
        Lb:
            xhss.ᲀᲀ r2 = (xhss.C0891) r2
            xhss.ᛳᛴᛵ r0 = r2.f2877
            int r5 = xhss.AbstractC0390.m784(r1)
            r0.f955 = r5
            xhss.ᛵᛲᲇᛴ r5 = r2.f2873
            if (r5 != 0) goto L1b
            goto Ld7
        L1b:
            int r1 = xhss.AbstractC0390.m784(r1)
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
            xhss.ᛵᛲᲇᛴ r1 = r2.f2873
            int r6 = r1.f1612
            if (r6 != r8) goto L36
            goto L85
        L36:
            if (r6 != r5) goto L43
            r1.m831(r7)
            xhss.ᲈᛵᛲᲁ r6 = new xhss.ᲈᛵᛲᲁ
            r6.<init>(r1, r5)
            r1.f1604 = r6
            goto L85
        L43:
            android.view.animation.DecelerateInterpolator r5 = new android.view.animation.DecelerateInterpolator
            r5.<init>(r9)
            r1.m829(r8, r5)
            goto L85
        L4c:
            xhss.ᛵᛲᲇᛴ r1 = r2.f2873
            int r10 = r1.f1612
            if (r10 != r6) goto L53
            goto L85
        L53:
            if (r10 != r5) goto L60
            r1.m831(r7)
            xhss.ᲈᛵᛲᲁ r5 = new xhss.ᲈᛵᛲᲁ
            r5.<init>(r1, r8)
            r1.f1604 = r5
            goto L85
        L60:
            android.view.animation.AccelerateInterpolator r5 = new android.view.animation.AccelerateInterpolator
            r5.<init>(r9)
            r1.m829(r6, r5)
            goto L85
        L69:
            xhss.ᛵᛲᲇᛴ r1 = r2.f2873
            int r8 = r1.f1612
            if (r8 != r4) goto L70
            goto L85
        L70:
            if (r8 != r5) goto L7d
            r1.m831(r7)
            xhss.ᲈᛵᛲᲁ r5 = new xhss.ᲈᛵᛲᲁ
            r5.<init>(r1, r6)
            r1.f1604 = r5
            goto L85
        L7d:
            android.view.animation.AccelerateDecelerateInterpolator r5 = new android.view.animation.AccelerateDecelerateInterpolator
            r5.<init>()
            r1.m829(r4, r5)
        L85:
            android.widget.RelativeLayout r1 = r2.f2879
            if (r1 == 0) goto L99
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L99
            xhss.ᛵᛲᲇᛴ r0 = r2.f2873
            xhss.ᛷᛸᲇᛸ r1 = new xhss.ᛷᛸᲇᛸ
            r1.<init>(r11, r3)
            r0.f1605 = r1
            goto Ld7
        L99:
            xhss.ᲁᛲᛸᛴ r1 = new xhss.ᲁᛲᛸᛴ
            r1.<init>()
            r1.m1529()
            r2.m1455()
            long r0 = r0.f954
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto Ld7
            xhss.ᛷᛸᲇᛸ r2 = new xhss.ᛷᛸᲇᛸ
            r2.<init>(r11, r4)
            com.kongzue.dialogx.interfaces.AbstractC0001.m36(r2, r0)
            goto Ld7
        Lb5:
            xhss.ᛵᛲᲇᛴ r11 = r2.f2873
            int r0 = r11.f1612
            if (r0 != 0) goto Lbc
            goto Ld7
        Lbc:
            r11.f1624 = r3
            r11.f1617 = r3
            r11.f1622 = r3
            r11.f1628 = r3
            r11.f1612 = r3
            xhss.ᛵᛱᛲᛶ r0 = r11.f1625
            if (r0 == 0) goto Lcc
            r0.f1564 = r3
        Lcc:
            xhss.ᛵᛱᛲᛶ r0 = r11.f1611
            if (r0 == 0) goto Ld2
            r0.f1564 = r3
        Ld2:
            r11.f1613 = r3
            r11.m828()
        Ld7:
            return
        Ld8:
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r11 = r2.size()
            if (r1 == r4) goto Lee
        Le0:
            if (r3 >= r11) goto Lfc
            java.lang.Object r0 = r2.get(r3)
            xhss.ᛳᛱᛲᲈ r0 = (xhss.AbstractC0231) r0
            r0.getClass()
            int r3 = r3 + 1
            goto Le0
        Lee:
            if (r3 >= r11) goto Lfc
            java.lang.Object r0 = r2.get(r3)
            xhss.ᛳᛱᛲᲈ r0 = (xhss.AbstractC0231) r0
            r0.mo538()
            int r3 = r3 + 1
            goto Lee
        Lfc:
            return
    }
}
