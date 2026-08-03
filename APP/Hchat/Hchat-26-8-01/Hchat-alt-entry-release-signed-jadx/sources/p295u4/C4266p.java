package p295u4;

import java.util.BitSet;
import p326w4.C4683c;
import p326w4.InterfaceC4685e;
import p376z4.AbstractC6091e;

/* JADX INFO: renamed from: u4.p */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4266p extends AbstractC6091e implements InterfaceC4685e {

    /* JADX INFO: renamed from: i */
    public static final C4266p f13968i = new C4266p(0);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public static C4266p m8567p(C4265o c4265o) {
        C4266p c4266p = new C4266p(1);
        c4266p.m10841m(0, c4265o);
        return c4266p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: q */
    public static C4266p m8568q(C4265o c4265o, C4265o c4265o2) {
        C4266p c4266p = new C4266p(2);
        c4266p.m10841m(0, c4265o);
        c4266p.m10841m(1, c4265o2);
        return c4266p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4685e
    /* JADX INFO: renamed from: d */
    public final InterfaceC4685e mo354d(C4683c c4683c) {
        throw new UnsupportedOperationException("unsupported");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.AbstractC6091e, p326w4.InterfaceC4685e
    public final C4683c getType(int i9) {
        C4683c type = ((C4265o) m10840l(i9)).f13966h.getType();
        type.getClass();
        return type;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m8569o() {
        int length = this.f24601h.length;
        int iM9188i = 0;
        for (int i9 = 0; i9 < length; i9++) {
            iM9188i += getType(i9).m9188i();
        }
        return iM9188i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r */
    public final C4266p m8570r(boolean z9, BitSet bitSet) {
        Object[] objArr = this.f24601h;
        int length = objArr.length;
        if (length == 0) {
            return this;
        }
        C4266p c4266p = new C4266p(objArr.length);
        int i9 = 0;
        int iM8561j = 0;
        while (i9 < length) {
            C4265o c4265oM8565o = (C4265o) m10840l(i9);
            if (bitSet == null || !bitSet.get(i9)) {
                c4265oM8565o = c4265oM8565o.m8565o(iM8561j);
                if (!z9) {
                    iM8561j += c4265oM8565o.m8561j();
                }
            }
            c4266p.m10841m(i9, c4265oM8565o);
            i9++;
            z9 = false;
        }
        if (!this.f24613g) {
            c4266p.f24613g = false;
        }
        return c4266p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s */
    public final C4266p m8571s(int i9) {
        int length = this.f24601h.length;
        if (length == 0) {
            return this;
        }
        C4266p c4266p = new C4266p(length);
        for (int i10 = 0; i10 < length; i10++) {
            C4265o c4265oM8565o = (C4265o) m10840l(i10);
            if (i9 != 0) {
                c4265oM8565o = c4265oM8565o.m8565o(c4265oM8565o.f13965g + i9);
            }
            c4266p.m10841m(i10, c4265oM8565o);
        }
        if (!this.f24613g) {
            c4266p.f24613g = false;
        }
        return c4266p;
    }
}
