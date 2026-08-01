package xhss;

/* JADX INFO: renamed from: xhss.ᛵᛶᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0481 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final int f1741;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.Object f1742;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1743;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public java.lang.Object f1744;

    public C0481(int r2, xhss.C0985 r3) {
            r1 = this;
            r0 = 3
            r1.f1743 = r0
            r1.<init>()
            r1.f1741 = r2
            r1.f1742 = r3
            return
    }

    public C0481(int r2, xhss.C0985 r3, xhss.C0481 r4) {
            r1 = this;
            r0 = 1
            r1.f1743 = r0
            r1.<init>()
            r1.f1741 = r2
            r1.f1742 = r3
            r1.f1744 = r4
            return
    }

    public C0481(java.lang.Integer r2, java.lang.Integer r3, int r4) {
            r1 = this;
            r0 = 0
            r1.f1743 = r0
            r1.<init>()
            r1.f1742 = r2
            r1.f1744 = r3
            r1.f1741 = r4
            return
    }

    public C0481(xhss.EnumC1122 r2, int r3, java.lang.String r4) {
            r1 = this;
            r0 = 2
            r1.f1743 = r0
            r1.<init>()
            r1.f1742 = r2
            r1.f1741 = r3
            r1.f1744 = r4
            return
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f1743
            java.lang.Object r1 = r3.f1742
            switch(r0) {
                case 0: goto L3b;
                case 1: goto L7;
                case 2: goto Lc;
                default: goto L7;
            }
        L7:
            java.lang.String r3 = super.toString()
            return r3
        Lc:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            xhss.ᲈᛲᛵᛴ r1 = (xhss.EnumC1122) r1
            xhss.ᲈᛲᛵᛴ r2 = xhss.EnumC1122.f3614
            if (r1 != r2) goto L1d
            java.lang.String r1 = "HTTP/1.0"
            r0.append(r1)
            goto L22
        L1d:
            java.lang.String r1 = "HTTP/1.1"
            r0.append(r1)
        L22:
            r1 = 32
            r0.append(r1)
            int r2 = r3.f1741
            r0.append(r2)
            r0.append(r1)
            java.lang.Object r3 = r3.f1744
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L3b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "["
            r0.<init>(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            java.lang.String r2 = ""
            if (r1 != 0) goto L4a
            r1 = r2
            goto L4e
        L4a:
            java.lang.String r1 = r1.toString()
        L4e:
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            java.lang.Object r3 = r3.f1744
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 != 0) goto L5d
            goto L61
        L5d:
            java.lang.String r2 = r3.toString()
        L61:
            r0.append(r2)
            java.lang.String r3 = "]"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
