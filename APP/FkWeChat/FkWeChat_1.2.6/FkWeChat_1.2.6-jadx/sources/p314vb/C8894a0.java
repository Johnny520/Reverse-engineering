package p314vb;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: vb.a0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8894a0 {

    /* JADX INFO: renamed from: h */
    public static final a f29476h = new a(null);

    /* JADX INFO: renamed from: a */
    public final int f29477a;

    /* JADX INFO: renamed from: b */
    public final int f29478b;

    /* JADX INFO: renamed from: c */
    public final int f29479c;

    /* JADX INFO: renamed from: d */
    public final int f29480d;

    /* JADX INFO: renamed from: e */
    public final int f29481e;

    /* JADX INFO: renamed from: f */
    public final int f29482f;

    /* JADX INFO: renamed from: g */
    public final int f29483g;

    public C8894a0(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f29477a = i10;
        this.f29478b = i11;
        this.f29479c = i12;
        this.f29480d = i13;
        this.f29481e = i14;
        this.f29482f = i15;
        this.f29483g = i16;
    }

    /* JADX INFO: renamed from: a */
    public final int m34079a() {
        return this.f29479c;
    }

    /* JADX INFO: renamed from: b */
    public final int m34080b() {
        return this.f29480d;
    }

    /* JADX INFO: renamed from: c */
    public final int m34081c() {
        return this.f29481e;
    }

    /* JADX INFO: renamed from: d */
    public final int m34082d() {
        return this.f29478b;
    }

    /* JADX INFO: renamed from: e */
    public final int m34083e() {
        return this.f29483g;
    }

    /* JADX INFO: renamed from: f */
    public final int m34084f() {
        return this.f29482f;
    }

    /* JADX INFO: renamed from: g */
    public final int m34085g() {
        return this.f29477a;
    }

    public String toString() {
        return "UnboundLocalDateTime(" + this.f29477a + '-' + this.f29478b + '-' + this.f29479c + ' ' + this.f29480d + ':' + this.f29481e + ':' + this.f29482f + '.' + this.f29483g + ')';
    }

    /* JADX INFO: renamed from: vb.a0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C8894a0 m34086a(C8904k c8904k) {
            long j10;
            c8904k.getClass();
            long jM34175h = c8904k.m34175h();
            long j11 = jM34175h / 86400;
            if ((jM34175h ^ 86400) < 0 && j11 * 86400 != jM34175h) {
                j11--;
            }
            long j12 = jM34175h % 86400;
            int i10 = (int) (j12 + (86400 & (((j12 ^ 86400) & ((-j12) | j12)) >> 63)));
            long j13 = (j11 + ((long) 719528)) - ((long) 60);
            if (j13 < 0) {
                long j14 = 146097;
                long j15 = ((j13 + 1) / j14) - 1;
                j10 = ((long) 400) * j15;
                j13 += (-j15) * j14;
            } else {
                j10 = 0;
            }
            long j16 = 400;
            long j17 = ((j16 * j13) + ((long) 591)) / ((long) 146097);
            long j18 = 365;
            long j19 = 4;
            long j20 = 100;
            long j21 = j13 - ((((j18 * j17) + (j17 / j19)) - (j17 / j20)) + (j17 / j16));
            if (j21 < 0) {
                j17--;
                j21 = j13 - ((((j18 * j17) + (j17 / j19)) - (j17 / j20)) + (j17 / j16));
            }
            long j22 = j17 + j10;
            int i11 = (int) j21;
            int i12 = ((i11 * 5) + 2) / Opcodes.IFEQ;
            int i13 = i10 / 3600;
            int i14 = i10 - (i13 * 3600);
            int i15 = i14 / 60;
            return new C8894a0((int) (j22 + ((long) (i12 / 10))), ((i12 + 2) % 12) + 1, (i11 - (((i12 * 306) + 5) / 10)) + 1, i13, i15, i14 - (i15 * 60), c8904k.m34176i());
        }

        public a() {
        }
    }
}
