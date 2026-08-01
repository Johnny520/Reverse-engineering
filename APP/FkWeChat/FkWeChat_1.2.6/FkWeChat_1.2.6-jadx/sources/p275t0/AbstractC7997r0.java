package p275t0;

import java.util.List;
import p073f2.AbstractC2234c0;
import p073f2.AbstractC2264r0;
import p073f2.C2236d0;
import p073f2.C2261q;
import p121i3.C3179i;
import p179m2.InterfaceC4862j3;
import p228p8.InterfaceC5976f;
import p257r8.AbstractC6535d;

/* JADX INFO: renamed from: t0.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7997r0 {

    /* JADX INFO: renamed from: a */
    public static final float f26580a;

    /* JADX INFO: renamed from: b */
    public static final float f26581b;

    /* JADX INFO: renamed from: c */
    public static final float f26582c;

    /* JADX INFO: renamed from: t0.r0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6535d {

        /* JADX INFO: renamed from: q */
        public Object f26583q;

        /* JADX INFO: renamed from: r */
        public Object f26584r;

        /* JADX INFO: renamed from: s */
        public Object f26585s;

        /* JADX INFO: renamed from: t */
        public Object f26586t;

        /* JADX INFO: renamed from: u */
        public float f26587u;

        /* JADX INFO: renamed from: v */
        public float f26588v;

        /* JADX INFO: renamed from: w */
        public /* synthetic */ Object f26589w;

        /* JADX INFO: renamed from: x */
        public int f26590x;

        public a(InterfaceC5976f interfaceC5976f) {
            super(interfaceC5976f);
        }

        @Override // p257r8.AbstractC6532a
        public final Object invokeSuspend(Object obj) {
            this.f26589w = obj;
            this.f26590x |= Integer.MIN_VALUE;
            return AbstractC7997r0.m30771a(null, 0L, 0, null, this);
        }
    }

    static {
        float fM12003k = C3179i.m12003k((float) 0.125d);
        f26580a = fM12003k;
        float fM12003k2 = C3179i.m12003k(18);
        f26581b = fM12003k2;
        f26582c = fM12003k / fM12003k2;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0172 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0122 -> B:47:0x012a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x016a -> B:54:0x016c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0187 -> B:47:0x012a). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m30771a(p073f2.InterfaceC2230b r20, long r21, int r23, p010a9.InterfaceC0188p r24, p228p8.InterfaceC5976f r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p275t0.AbstractC7997r0.m30771a(f2.b, long, int, a9.p, p8.f):java.lang.Object");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m30772b(C2261q c2261q, long j10) {
        Object obj;
        List listM8216c = c2261q.m8216c();
        int size = listM8216c.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = listM8216c.get(i10);
            if (AbstractC2234c0.m8064b(((C2236d0) obj).m8075f(), j10)) {
                break;
            }
            i10++;
        }
        C2236d0 c2236d0 = (C2236d0) obj;
        if (c2236d0 != null && c2236d0.m8078i()) {
            z10 = true;
        }
        return true ^ z10;
    }

    /* JADX INFO: renamed from: c */
    public static final float m30773c(InterfaceC4862j3 interfaceC4862j3, int i10) {
        return AbstractC2264r0.m8244g(i10, AbstractC2264r0.f6219a.m8248b()) ? interfaceC4862j3.mo17981g() * f26582c : interfaceC4862j3.mo17981g();
    }
}
