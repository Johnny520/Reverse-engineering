package p358y9;

import java.util.Arrays;
import java.util.Set;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p081fa.InterfaceC2379g;
import p081fa.InterfaceC2393u;
import p213oa.C5691b;
import p213oa.C5692c;

/* JADX INFO: renamed from: y9.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC9649u {
    /* JADX INFO: renamed from: a */
    Set mo32981a(C5692c c5692c);

    /* JADX INFO: renamed from: b */
    InterfaceC2379g mo32982b(a aVar);

    /* JADX INFO: renamed from: c */
    InterfaceC2393u mo32983c(C5692c c5692c, boolean z10);

    /* JADX INFO: renamed from: y9.u$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C5691b f32874a;

        /* JADX INFO: renamed from: b */
        public final byte[] f32875b;

        /* JADX INFO: renamed from: c */
        public final InterfaceC2379g f32876c;

        public /* synthetic */ a(C5691b c5691b, byte[] bArr, InterfaceC2379g interfaceC2379g, int i10, AbstractC1043k abstractC1043k) {
            this(c5691b, (i10 & 2) != 0 ? null : bArr, (i10 & 4) != 0 ? null : interfaceC2379g);
        }

        /* JADX INFO: renamed from: a */
        public final C5691b m37749a() {
            return this.f32874a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC1061t.m3842c(this.f32874a, aVar.f32874a) && AbstractC1061t.m3842c(this.f32875b, aVar.f32875b) && AbstractC1061t.m3842c(this.f32876c, aVar.f32876c);
        }

        public int hashCode() {
            int iHashCode = this.f32874a.hashCode() * 31;
            byte[] bArr = this.f32875b;
            int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
            InterfaceC2379g interfaceC2379g = this.f32876c;
            return iHashCode2 + (interfaceC2379g != null ? interfaceC2379g.hashCode() : 0);
        }

        public String toString() {
            return "Request(classId=" + this.f32874a + ", previouslyFoundClassFileContent=" + Arrays.toString(this.f32875b) + ", outerClass=" + this.f32876c + ')';
        }

        public a(C5691b c5691b, byte[] bArr, InterfaceC2379g interfaceC2379g) {
            c5691b.getClass();
            this.f32874a = c5691b;
            this.f32875b = bArr;
            this.f32876c = interfaceC2379g;
        }
    }
}
