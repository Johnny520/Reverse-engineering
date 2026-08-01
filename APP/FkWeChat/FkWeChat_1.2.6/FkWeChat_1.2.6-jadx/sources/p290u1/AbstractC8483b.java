package p290u1;

import p250r1.C6461k;
import p265s1.AbstractC7104l2;
import p265s1.InterfaceC7088i1;
import p265s1.InterfaceC7144t2;

/* JADX INFO: renamed from: u1.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8483b {

    /* JADX INFO: renamed from: u1.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a implements InterfaceC8489h {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC8485d f28338a;

        public a(InterfaceC8485d interfaceC8485d) {
            this.f28338a = interfaceC8485d;
        }

        @Override // p290u1.InterfaceC8489h
        /* JADX INFO: renamed from: a */
        public void mo32638a(float[] fArr) {
            this.f28338a.mo32635i().mo27844q(fArr);
        }

        @Override // p290u1.InterfaceC8489h
        /* JADX INFO: renamed from: b */
        public void mo32639b(InterfaceC7144t2 interfaceC7144t2, int i10) {
            this.f28338a.mo32635i().mo27830b(interfaceC7144t2, i10);
        }

        @Override // p290u1.InterfaceC8489h
        /* JADX INFO: renamed from: c */
        public void mo32640c(float f10, float f11, float f12, float f13, int i10) {
            this.f28338a.mo32635i().mo27831c(f10, f11, f12, f13, i10);
        }

        @Override // p290u1.InterfaceC8489h
        /* JADX INFO: renamed from: d */
        public void mo32641d(float f10, float f11) {
            this.f28338a.mo32635i().mo27832d(f10, f11);
        }

        @Override // p290u1.InterfaceC8489h
        /* JADX INFO: renamed from: g */
        public void mo32642g(float f10, float f11, long j10) {
            InterfaceC7088i1 interfaceC7088i1Mo32635i = this.f28338a.mo32635i();
            int i10 = (int) (j10 >> 32);
            int i11 = (int) (j10 & 4294967295L);
            interfaceC7088i1Mo32635i.mo27832d(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
            interfaceC7088i1Mo32635i.mo27834f(f10, f11);
            interfaceC7088i1Mo32635i.mo27832d(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        }

        @Override // p290u1.InterfaceC8489h
        /* JADX INFO: renamed from: h */
        public void mo32643h(float f10, float f11, float f12, float f13) {
            InterfaceC7088i1 interfaceC7088i1Mo32635i = this.f28338a.mo32635i();
            InterfaceC8485d interfaceC8485d = this.f28338a;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (m32645j() >> 32)) - (f12 + f10);
            long jM25616d = C6461k.m25616d((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (m32645j() & 4294967295L)) - (f13 + f11))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
            if (!(Float.intBitsToFloat((int) (jM25616d >> 32)) >= 0.0f && Float.intBitsToFloat((int) (jM25616d & 4294967295L)) >= 0.0f)) {
                AbstractC7104l2.m27988a("Width and height must be greater than or equal to zero");
            }
            interfaceC8485d.mo32633g(jM25616d);
            interfaceC7088i1Mo32635i.mo27832d(f10, f11);
        }

        @Override // p290u1.InterfaceC8489h
        /* JADX INFO: renamed from: i */
        public void mo32644i(float f10, long j10) {
            InterfaceC7088i1 interfaceC7088i1Mo32635i = this.f28338a.mo32635i();
            int i10 = (int) (j10 >> 32);
            int i11 = (int) (j10 & 4294967295L);
            interfaceC7088i1Mo32635i.mo27832d(Float.intBitsToFloat(i10), Float.intBitsToFloat(i11));
            interfaceC7088i1Mo32635i.mo27836h(f10);
            interfaceC7088i1Mo32635i.mo27832d(-Float.intBitsToFloat(i10), -Float.intBitsToFloat(i11));
        }

        /* JADX INFO: renamed from: j */
        public long m32645j() {
            return this.f28338a.mo32628b();
        }
    }

    /* JADX INFO: renamed from: b */
    public static final InterfaceC8489h m32637b(InterfaceC8485d interfaceC8485d) {
        return new a(interfaceC8485d);
    }
}
