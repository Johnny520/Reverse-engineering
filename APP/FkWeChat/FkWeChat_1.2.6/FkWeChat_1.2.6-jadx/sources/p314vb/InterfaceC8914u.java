package p314vb;

import p314vb.C8904k;

/* JADX INFO: renamed from: vb.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC8914u {

    /* JADX INFO: renamed from: vb.u$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC8914u {

        /* JADX INFO: renamed from: a */
        public final String f29515a;

        /* JADX INFO: renamed from: b */
        public final CharSequence f29516b;

        public a(String str, CharSequence charSequence) {
            str.getClass();
            charSequence.getClass();
            this.f29515a = str;
            this.f29516b = charSequence;
        }

        @Override // p314vb.InterfaceC8914u
        public C8904k toInstant() {
            throw new C8905l(this.f29515a + " when parsing an Instant from \"" + AbstractC8913t.m34203r(this.f29516b, 64) + '\"');
        }
    }

    /* JADX INFO: renamed from: vb.u$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC8914u {

        /* JADX INFO: renamed from: a */
        public final long f29517a;

        /* JADX INFO: renamed from: b */
        public final int f29518b;

        public b(long j10, int i10) {
            this.f29517a = j10;
            this.f29518b = i10;
        }

        @Override // p314vb.InterfaceC8914u
        public C8904k toInstant() {
            long j10 = this.f29517a;
            C8904k.a aVar = C8904k.f29505s;
            if (j10 >= aVar.m34182e().m34175h() && this.f29517a <= aVar.m34181d().m34175h()) {
                return aVar.m34179b(this.f29517a, this.f29518b);
            }
            throw new C8905l("The parsed date is outside the range representable by Instant (Unix epoch second " + this.f29517a + ')');
        }
    }

    C8904k toInstant();
}
