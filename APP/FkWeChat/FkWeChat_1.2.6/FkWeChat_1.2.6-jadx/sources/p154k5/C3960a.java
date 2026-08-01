package p154k5;

import bsh.C1259t2;
import java.util.ArrayList;
import p239q5.C6268s;
import p239q5.C6274y;
import p254r5.AbstractC6487a;
import p254r5.AbstractC6514s;
import p254r5.AbstractC6515t;
import p254r5.C6496e0;
import p309v5.AbstractC8826h;
import p309v5.InterfaceC8819a;
import p376zd.C9987e;

/* JADX INFO: renamed from: k5.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3960a extends AbstractC3971f0 {

    /* JADX INFO: renamed from: e */
    public final C3970f f11427e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f11428f;

    /* JADX INFO: renamed from: g */
    public final AbstractC6487a f11429g;

    /* JADX INFO: renamed from: h */
    public final int f11430h;

    /* JADX INFO: renamed from: i */
    public final int f11431i;

    public C3960a(C6274y c6274y, C3970f c3970f, ArrayList arrayList, AbstractC6487a abstractC6487a) {
        super(c6274y, C6268s.f19445s);
        if (c3970f == null) {
            C1259t2.m5095a("user == null");
            throw null;
        }
        if (arrayList == null) {
            C1259t2.m5095a("values == null");
            throw null;
        }
        if (arrayList.size() <= 0) {
            C9987e.m38645a("Illegal number of init values");
            throw null;
        }
        this.f11429g = abstractC6487a;
        if (abstractC6487a == C6496e0.f20387E || abstractC6487a == C6496e0.f20386D) {
            this.f11430h = 1;
        } else if (abstractC6487a == C6496e0.f20393K || abstractC6487a == C6496e0.f20388F) {
            this.f11430h = 2;
        } else if (abstractC6487a == C6496e0.f20392J || abstractC6487a == C6496e0.f20390H) {
            this.f11430h = 4;
        } else {
            if (abstractC6487a != C6496e0.f20391I && abstractC6487a != C6496e0.f20389G) {
                C9987e.m38645a("Unexpected constant type");
                throw null;
            }
            this.f11430h = 8;
        }
        this.f11427e = c3970f;
        this.f11428f = arrayList;
        this.f11431i = arrayList.size();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: a */
    public String mo15678a() {
        StringBuilder sb2 = new StringBuilder(100);
        int size = this.f11428f.size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append("\n    ");
            sb2.append(i10);
            sb2.append(": ");
            sb2.append(((AbstractC6487a) this.f11428f.get(i10)).mo6828g());
        }
        return sb2.toString();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: b */
    public int mo15679b() {
        return (((this.f11431i * this.f11430h) + 1) / 2) + 4;
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: s */
    public String mo15680s(boolean z10) {
        int iM15772h = this.f11427e.m15772h();
        StringBuilder sb2 = new StringBuilder(100);
        int size = this.f11428f.size();
        sb2.append("fill-array-data-payload // for fill-array-data @ ");
        sb2.append(AbstractC8826h.m33898g(iM15772h));
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append("\n  ");
            sb2.append(i10);
            sb2.append(": ");
            sb2.append(((AbstractC6487a) this.f11428f.get(i10)).mo6828g());
        }
        return sb2.toString();
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: y */
    public AbstractC3976j mo15681y(C6268s c6268s) {
        return new C3960a(m15777m(), this.f11427e, this.f11428f, this.f11429g);
    }

    @Override // p154k5.AbstractC3976j
    /* JADX INFO: renamed from: z */
    public void mo15682z(InterfaceC8819a interfaceC8819a) {
        int size = this.f11428f.size();
        interfaceC8819a.writeShort(768);
        interfaceC8819a.writeShort(this.f11430h);
        interfaceC8819a.writeInt(this.f11431i);
        int i10 = this.f11430h;
        if (i10 == 1) {
            for (int i11 = 0; i11 < size; i11++) {
                interfaceC8819a.writeByte((byte) ((AbstractC6514s) ((AbstractC6487a) this.f11428f.get(i11))).mo25796s());
            }
        } else if (i10 == 2) {
            for (int i12 = 0; i12 < size; i12++) {
                interfaceC8819a.writeShort((short) ((AbstractC6514s) ((AbstractC6487a) this.f11428f.get(i12))).mo25796s());
            }
        } else if (i10 == 4) {
            for (int i13 = 0; i13 < size; i13++) {
                interfaceC8819a.writeInt(((AbstractC6514s) ((AbstractC6487a) this.f11428f.get(i13))).mo25796s());
            }
        } else if (i10 == 8) {
            for (int i14 = 0; i14 < size; i14++) {
                interfaceC8819a.writeLong(((AbstractC6515t) ((AbstractC6487a) this.f11428f.get(i14))).mo25797t());
            }
        }
        if (this.f11430h != 1 || size % 2 == 0) {
            return;
        }
        interfaceC8819a.writeByte(0);
    }
}
