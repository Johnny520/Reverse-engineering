package p310v6;

import p097g8.AbstractC2544c;
import p097g8.AbstractC2545d;
import p097g8.InterfaceC2546e;

/* JADX INFO: renamed from: v6.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8845f {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2546e f29393a;

    /* JADX INFO: renamed from: v6.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC2545d {
        @Override // p097g8.InterfaceC2546e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public char[] mo9064B() {
            return new char[2048];
        }
    }

    /* JADX INFO: renamed from: v6.f$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC2544c {
        public b() {
            super(4096);
        }

        @Override // p097g8.AbstractC2544c
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public char[] mo9061f() {
            return new char[2048];
        }
    }

    static {
        f29393a = AbstractC8844e.m33967a() ? new a() : new b();
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC2546e m33968a() {
        return f29393a;
    }
}
