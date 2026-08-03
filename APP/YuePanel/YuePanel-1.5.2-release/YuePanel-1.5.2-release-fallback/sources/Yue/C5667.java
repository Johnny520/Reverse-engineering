package Yue;

/* JADX INFO: renamed from: Yue.ۥۣۡۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5667 implements java.io.Externalizable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public static final Yue.C5667.C5668 f20825 = null;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final long f20826 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @Yue.InterfaceC4418
    public java.util.Map<?, ?> f20827;

    /* JADX INFO: renamed from: Yue.ۥۣۡۨ۠$ۥ, reason: contains not printable characters */
    public static final class C5668 {
        public C5668() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ C5668(Yue.C1769 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            Yue.ۥۣۡۨ۠$ۥ r0 = new Yue.ۥۣۡۨ۠$ۥ
            r1 = 0
            r0.<init>(r1)
            Yue.C5667.f20825 = r0
            return
    }

    public C5667() {
            r1 = this;
            java.util.Map r0 = Yue.C3901.m15738()
            r1.<init>(r0)
            return
    }

    public C5667(@Yue.InterfaceC4418 java.util.Map<?, ?> r2) {
            r1 = this;
            java.lang.String r0 = "map"
            Yue.C3329.m13906(r2, r0)
            r1.<init>()
            r1.f20827 = r2
            return
    }

    @Override // java.io.Externalizable
    public void readExternal(@Yue.InterfaceC4418 java.io.ObjectInput r6) {
            r5 = this;
            java.lang.String r0 = "input"
            Yue.C3329.m13906(r6, r0)
            byte r0 = r6.readByte()
            if (r0 != 0) goto L49
            int r0 = r6.readInt()
            if (r0 < 0) goto L2d
            java.util.Map r1 = Yue.C3900.m15720(r0)
            r2 = 0
        L16:
            if (r2 >= r0) goto L26
            java.lang.Object r3 = r6.readObject()
            java.lang.Object r4 = r6.readObject()
            r1.put(r3, r4)
            int r2 = r2 + 1
            goto L16
        L26:
            java.util.Map r6 = Yue.C3900.m15716(r1)
            r5.f20827 = r6
            return
        L2d:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Illegal size value: "
            r1.append(r2)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
        L49:
            java.io.InvalidObjectException r6 = new java.io.InvalidObjectException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported flags value: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r6.<init>(r0)
            throw r6
    }

    @Override // java.io.Externalizable
    public void writeExternal(@Yue.InterfaceC4418 java.io.ObjectOutput r4) {
            r3 = this;
            java.lang.String r0 = "output"
            Yue.C3329.m13906(r4, r0)
            r0 = 0
            r4.writeByte(r0)
            java.util.Map<?, ?> r0 = r3.f20827
            int r0 = r0.size()
            r4.writeInt(r0)
            java.util.Map<?, ?> r0 = r3.f20827
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            r4.writeObject(r2)
            java.lang.Object r1 = r1.getValue()
            r4.writeObject(r1)
            goto L1c
        L37:
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.lang.Object m21233() {
            r1 = this;
            java.util.Map<?, ?> r0 = r1.f20827
            return r0
    }
}
