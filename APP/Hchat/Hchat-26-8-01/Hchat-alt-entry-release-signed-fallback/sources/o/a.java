package o;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public android.os.Parcel f9467a;

    public long a() {
            r6 = this;
            int r0 = f1.w.f3132h
            android.os.Parcel r0 = r6.f9467a
            long r0 = r0.readLong()
            r2 = 63
            long r2 = r2 & r0
            r4 = 16
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 >= 0) goto L12
            return r0
        L12:
            r4 = -64
            long r0 = r0 & r4
            r4 = 1
            long r2 = r2 + r4
            long r0 = r0 | r2
            return r0
    }

    public long b() {
            r5 = this;
            android.os.Parcel r0 = r5.f9467a
            byte r1 = r0.readByte()
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L11
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            goto L1b
        L11:
            r2 = 2
            if (r1 != r2) goto L1a
            r1 = 8589934592(0x200000000, double:4.243991582E-314)
            goto L1b
        L1a:
            r1 = r3
        L1b:
            boolean r3 = u2.p.a(r1, r3)
            if (r3 == 0) goto L24
            long r0 = u2.o.f13359c
            return r0
        L24:
            float r0 = r0.readFloat()
            long r0 = x6.d.R(r1, r0)
            return r0
    }

    public void c(byte r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f9467a
            r0.writeByte(r2)
            return
    }

    public void d(float r2) {
            r1 = this;
            android.os.Parcel r0 = r1.f9467a
            r0.writeFloat(r2)
            return
    }

    public void e(long r9) {
            r8 = this;
            long r0 = u2.o.b(r9)
            r2 = 0
            boolean r4 = u2.p.a(r0, r2)
            r5 = 0
            if (r4 == 0) goto Le
            goto L27
        Le:
            r6 = 4294967296(0x100000000, double:2.121995791E-314)
            boolean r4 = u2.p.a(r0, r6)
            if (r4 == 0) goto L1b
            r5 = 1
            goto L27
        L1b:
            r6 = 8589934592(0x200000000, double:4.243991582E-314)
            boolean r0 = u2.p.a(r0, r6)
            if (r0 == 0) goto L27
            r5 = 2
        L27:
            r8.c(r5)
            long r0 = u2.o.b(r9)
            boolean r0 = u2.p.a(r0, r2)
            if (r0 != 0) goto L3b
            float r9 = u2.o.c(r9)
            r8.d(r9)
        L3b:
            return
    }
}
