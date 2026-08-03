package p339x1;

import java.util.Arrays;
import p183m8.C2815c;
import p293u2.InterfaceC4233c;
import p308v1.C4405l;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: x1.k0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5619k0 implements InterfaceC4233c {

    /* JADX INFO: renamed from: g */
    public boolean f22895g;

    /* JADX INFO: renamed from: h */
    public long f22896h = 9223372034707292159L;

    /* JADX INFO: renamed from: i */
    public long f22897i = 0;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ AbstractC5628n0 f22898j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5619k0(AbstractC5628n0 abstractC5628n0) {
        this.f22898j = abstractC5628n0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f22898j.mo1333d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final void m10171e(C4405l c4405l, float f3) {
        AbstractC5628n0 abstractC5628n0 = this.f22898j;
        C2815c c2815c = abstractC5628n0.f22926s;
        if (c2815c == null) {
            c2815c = new C2815c();
            abstractC5628n0.f22926s = c2815c;
        }
        int iM8367D0 = AbstractC4165l.m8367D0((C4405l[]) c2815c.f9081b, c4405l);
        if (iM8367D0 >= 0) {
            float[] fArr = (float[]) c2815c.f9082c;
            if (fArr[iM8367D0] != f3) {
                fArr[iM8367D0] = f3;
                ((byte[]) c2815c.f9083d)[iM8367D0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) c2815c.f9083d;
                if (bArr[iM8367D0] == 2) {
                    bArr[iM8367D0] = 0;
                    return;
                }
                return;
            }
        }
        int i9 = c2815c.f9080a;
        C4405l[] c4405lArr = (C4405l[]) c2815c.f9081b;
        if (i9 == c4405lArr.length) {
            int i10 = i9 * 2;
            c2815c.f9081b = (C4405l[]) Arrays.copyOf(c4405lArr, i10);
            c2815c.f9082c = Arrays.copyOf((float[]) c2815c.f9082c, i10);
            c2815c.f9083d = Arrays.copyOf((byte[]) c2815c.f9083d, i10);
        }
        ((C4405l[]) c2815c.f9081b)[i9] = c4405l;
        ((byte[]) c2815c.f9083d)[i9] = 3;
        ((float[]) c2815c.f9082c)[i9] = f3;
        c2815c.f9080a++;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f22898j.mo1335q0();
    }
}
