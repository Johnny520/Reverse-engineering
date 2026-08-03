package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤۦۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public class C6907 {

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final java.util.ArrayList<Yue.C6904> f24150;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public long f24151;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public android.view.animation.Interpolator f24152;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.InterfaceC6909 f24153;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public boolean f24154;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final Yue.C6910 f24155;

    /* JADX INFO: renamed from: Yue.ۥۢۤۦۧ$ۥ, reason: contains not printable characters */
    public class C6908 extends Yue.C6910 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public boolean f24156;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int f24157;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ Yue.C6907 f24158;

        public C6908(Yue.C6907 r1) {
                r0 = this;
                r0.f24158 = r1
                r0.<init>()
                r1 = 0
                r0.f24156 = r1
                r0.f24157 = r1
                return
        }

        @Override // Yue.C6910, Yue.InterfaceC6909
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo300(android.view.View r2) {
                r1 = this;
                int r2 = r1.f24157
                int r2 = r2 + 1
                r1.f24157 = r2
                Yue.ۥۢۤۦۧ r0 = r1.f24158
                java.util.ArrayList<Yue.ۥۢۤۦۦ> r0 = r0.f24150
                int r0 = r0.size()
                if (r2 != r0) goto L1d
                Yue.ۥۢۤۦۧ r2 = r1.f24158
                Yue.ۥۢۤۦۨ r2 = r2.f24153
                if (r2 == 0) goto L1a
                r0 = 0
                r2.mo300(r0)
            L1a:
                r1.m26767()
            L1d:
                return
        }

        @Override // Yue.C6910, Yue.InterfaceC6909
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo301(android.view.View r2) {
                r1 = this;
                boolean r2 = r1.f24156
                if (r2 == 0) goto L5
                return
            L5:
                r2 = 1
                r1.f24156 = r2
                Yue.ۥۢۤۦۧ r2 = r1.f24158
                Yue.ۥۢۤۦۨ r2 = r2.f24153
                if (r2 == 0) goto L12
                r0 = 0
                r2.mo301(r0)
            L12:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public void m26767() {
                r1 = this;
                r0 = 0
                r1.f24157 = r0
                r1.f24156 = r0
                Yue.ۥۢۤۦۧ r0 = r1.f24158
                r0.m26760()
                return
        }
    }

    public C6907() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.f24151 = r0
            Yue.ۥۢۤۦۧ$ۥ r0 = new Yue.ۥۢۤۦۧ$ۥ
            r0.<init>(r2)
            r2.f24155 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f24150 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m26759() {
            r2 = this;
            boolean r0 = r2.f24154
            if (r0 != 0) goto L5
            return
        L5:
            java.util.ArrayList<Yue.ۥۢۤۦۦ> r0 = r2.f24150
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1b
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۤۦۦ r1 = (Yue.C6904) r1
            r1.m26719()
            goto Lb
        L1b:
            r0 = 0
            r2.f24154 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m26760() {
            r1 = this;
            r0 = 0
            r1.f24154 = r0
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public Yue.C6907 m26761(Yue.C6904 r2) {
            r1 = this;
            boolean r0 = r1.f24154
            if (r0 != 0) goto L9
            java.util.ArrayList<Yue.ۥۢۤۦۦ> r0 = r1.f24150
            r0.add(r2)
        L9:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public Yue.C6907 m26762(Yue.C6904 r3, Yue.C6904 r4) {
            r2 = this;
            java.util.ArrayList<Yue.ۥۢۤۦۦ> r0 = r2.f24150
            r0.add(r3)
            long r0 = r3.m26720()
            r4.m26737(r0)
            java.util.ArrayList<Yue.ۥۢۤۦۦ> r3 = r2.f24150
            r3.add(r4)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public Yue.C6907 m26763(long r2) {
            r1 = this;
            boolean r0 = r1.f24154
            if (r0 != 0) goto L6
            r1.f24151 = r2
        L6:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public Yue.C6907 m26764(android.view.animation.Interpolator r2) {
            r1 = this;
            boolean r0 = r1.f24154
            if (r0 != 0) goto L6
            r1.f24152 = r2
        L6:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public Yue.C6907 m26765(Yue.InterfaceC6909 r2) {
            r1 = this;
            boolean r0 = r1.f24154
            if (r0 != 0) goto L6
            r1.f24153 = r2
        L6:
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m26766() {
            r6 = this;
            boolean r0 = r6.f24154
            if (r0 == 0) goto L5
            return
        L5:
            java.util.ArrayList<Yue.ۥۢۤۦۦ> r0 = r6.f24150
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()
            Yue.ۥۢۤۦۦ r1 = (Yue.C6904) r1
            long r2 = r6.f24151
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L22
            r1.m26733(r2)
        L22:
            android.view.animation.Interpolator r2 = r6.f24152
            if (r2 == 0) goto L29
            r1.m26734(r2)
        L29:
            Yue.ۥۢۤۦۨ r2 = r6.f24153
            if (r2 == 0) goto L32
            Yue.ۥۢۤۧ r2 = r6.f24155
            r1.m26735(r2)
        L32:
            r1.m26739()
            goto Lb
        L36:
            r0 = 1
            r6.f24154 = r0
            return
    }
}
