package p111ha;

import la.C4723c;
import p024b9.AbstractC1043k;
import p037cb.InterfaceC1461a0;
import p081fa.InterfaceC2379g;
import p213oa.C5691b;

/* JADX INFO: renamed from: ha.v */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2935v extends InterfaceC1461a0 {
    /* JADX INFO: renamed from: a */
    a mo10726a(C5691b c5691b, C4723c c4723c);

    /* JADX INFO: renamed from: b */
    a mo10727b(InterfaceC2379g interfaceC2379g, C4723c c4723c);

    /* JADX INFO: renamed from: ha.v$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static abstract class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC2937x m10728a() {
            C10095a c10095a = this instanceof C10095a ? (C10095a) this : null;
            if (c10095a != null) {
                return c10095a.m10729b();
            }
            return null;
        }

        public a() {
        }

        /* JADX INFO: renamed from: ha.v$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
        public static final class C10095a extends a {

            /* JADX INFO: renamed from: a */
            public final InterfaceC2937x f7766a;

            /* JADX INFO: renamed from: b */
            public final byte[] f7767b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10095a(InterfaceC2937x interfaceC2937x, byte[] bArr) {
                super(null);
                interfaceC2937x.getClass();
                this.f7766a = interfaceC2937x;
                this.f7767b = bArr;
            }

            /* JADX INFO: renamed from: b */
            public final InterfaceC2937x m10729b() {
                return this.f7766a;
            }

            public /* synthetic */ C10095a(InterfaceC2937x interfaceC2937x, byte[] bArr, int i10, AbstractC1043k abstractC1043k) {
                this(interfaceC2937x, (i10 & 2) != 0 ? null : bArr);
            }
        }
    }
}
