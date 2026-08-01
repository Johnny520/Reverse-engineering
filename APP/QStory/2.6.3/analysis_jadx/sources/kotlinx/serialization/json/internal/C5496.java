package kotlinx.serialization.json.internal;

import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0107;
import androidx.compose.runtime.internal.C1245;
import p053.AbstractC6561;
import p088.AbstractC7159;
import p088.AbstractC7168;
import p088.C7177;
import p088.InterfaceC7169;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7188;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5496 extends AbstractC6561 implements InterfaceC7169 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public String f15187;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC7169[] f15188;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final WriteMode f15189;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f15190;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public String f15191;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1245 f15192;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C7177 f15193;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0064 f15194;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC7159 f15195;

    public C5496(C0064 c0064, AbstractC7159 abstractC7159, WriteMode writeMode, InterfaceC7169[] interfaceC7169Arr) {
        c0064.getClass();
        this.f15194 = c0064;
        this.f15195 = abstractC7159;
        this.f15189 = writeMode;
        this.f15188 = interfaceC7169Arr;
        this.f15192 = abstractC7159.f19127;
        this.f15193 = abstractC7159.f19128;
        int iOrdinal = writeMode.ordinal();
        if (interfaceC7169Arr != null) {
            InterfaceC7169 interfaceC7169 = interfaceC7169Arr[iOrdinal];
            if (interfaceC7169 == null && interfaceC7169 == this) {
                return;
            }
            interfaceC7169Arr[iOrdinal] = this;
        }
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final void mo10645(int i) {
        if (this.f15190) {
            mo10649(String.valueOf(i));
        } else {
            this.f15194.mo200(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo10705(p089.InterfaceC7184 r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.getClass()
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪世苏兰哲 r0 = r4.f15195
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪苏哲世兰 r1 = r0.f19128
            boolean r2 = r5 instanceof p089.C7182
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f19160
            if (r2 == 0) goto L12
            kotlinx.serialization.json.ClassDiscriminatorMode r3 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r1 == r3) goto L48
            goto L3b
        L12:
            int[] r3 = kotlinx.serialization.json.internal.AbstractC5493.f15182
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            if (r1 == r3) goto L48
            r3 = 2
            if (r1 == r3) goto L48
            r3 = 3
            if (r1 != r3) goto L44
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r1 = r5.getDescriptor()
            飘花落叶言楪兰苏哲世子.飘花落叶言子楪世苏哲兰 r1 = r1.getKind()
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪苏哲世兰 r3 = p091.C7198.f19209
            boolean r3 = kotlin.jvm.internal.AbstractC4395.m8907(r1, r3)
            if (r3 != 0) goto L3b
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪苏哲世兰 r3 = p091.C7198.f19207
            boolean r1 = kotlin.jvm.internal.AbstractC4395.m8907(r1, r3)
            if (r1 == 0) goto L48
        L3b:
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r1 = r5.getDescriptor()
            java.lang.String r1 = kotlinx.serialization.json.internal.AbstractC5507.m10753(r0, r1)
            goto L49
        L44:
            io.ktor.util.C4211.m8611()
            return
        L48:
            r1 = 0
        L49:
            if (r2 == 0) goto L61
            r2 = r5
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世哲苏兰 r2 = (p089.C7182) r2
            if (r6 == 0) goto L55
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰 r2 = kotlin.reflect.jvm.internal.AbstractC5062.m10044(r2, r4, r6)
            goto L62
        L55:
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r4 = r2.getDescriptor()
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r6 = "Value for serializer "
            androidx.collection.C0276.m849(r4, r6, r5)
            return
        L61:
            r2 = r5
        L62:
            if (r1 == 0) goto L7e
            kotlinx.serialization.json.internal.AbstractC5507.m10741(r0, r5, r2, r1)
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r5 = r2.getDescriptor()
            飘花落叶言楪兰苏哲世子.飘花落叶言子楪世苏哲兰 r5 = r5.getKind()
            kotlinx.serialization.json.internal.AbstractC5507.m10754(r5)
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r5 = r2.getDescriptor()
            java.lang.String r5 = r5.mo12382()
            r4.f15191 = r1
            r4.f15187 = r5
        L7e:
            r2.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C5496.mo10705(飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰, java.lang.Object):void");
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void mo10706(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        mo10649(interfaceC7191.mo12379(i));
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void mo10707(char c) {
        mo10649(String.valueOf(c));
    }

    @Override // p053.AbstractC6561
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void mo10708(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        int i2 = AbstractC5495.f15186[this.f15189.ordinal()];
        C0064 c0064 = this.f15194;
        boolean z = true;
        if (i2 == 1) {
            if (!c0064.f138) {
                c0064.m203(',');
            }
            c0064.mo199();
            return;
        }
        if (i2 == 2) {
            if (c0064.f138) {
                this.f15190 = true;
                c0064.mo199();
                return;
            }
            if (i % 2 == 0) {
                c0064.m203(',');
                c0064.mo199();
            } else {
                c0064.m203(':');
                c0064.mo194();
                z = false;
            }
            this.f15190 = z;
            return;
        }
        if (i2 != 3) {
            if (!c0064.f138) {
                c0064.m203(',');
            }
            c0064.mo199();
            AbstractC5507.m10752(this.f15195, interfaceC7191);
            mo10649(interfaceC7191.mo12379(i));
            c0064.m203(':');
            c0064.mo194();
            return;
        }
        if (i == 0) {
            this.f15190 = true;
        }
        if (i == 1) {
            c0064.m203(',');
            c0064.mo194();
            this.f15190 = false;
        }
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo10709() {
        C0064 c0064 = this.f15194;
        c0064.getClass();
        ((C0107) c0064.f139).m345("null");
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC7188 mo10710(InterfaceC7191 interfaceC7191) {
        InterfaceC7169 interfaceC7169;
        interfaceC7191.getClass();
        AbstractC7159 abstractC7159 = this.f15195;
        WriteMode writeModeM10746 = AbstractC5507.m10746(abstractC7159, interfaceC7191);
        char c = writeModeM10746.begin;
        C0064 c0064 = this.f15194;
        if (c != 0) {
            c0064.m203(c);
            c0064.mo187();
        }
        String str = this.f15191;
        if (str != null) {
            String strMo12382 = this.f15187;
            if (strMo12382 == null) {
                strMo12382 = interfaceC7191.mo12382();
            }
            c0064.mo199();
            c0064.mo192(str);
            c0064.m203(':');
            c0064.mo194();
            mo10649(strMo12382);
            this.f15191 = null;
            this.f15187 = null;
        }
        if (this.f15189 == writeModeM10746) {
            return this;
        }
        InterfaceC7169[] interfaceC7169Arr = this.f15188;
        return (interfaceC7169Arr == null || (interfaceC7169 = interfaceC7169Arr[writeModeM10746.ordinal()]) == null) ? new C5496(c0064, abstractC7159, writeModeM10746, interfaceC7169Arr) : interfaceC7169;
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C1245 mo10646() {
        return this.f15192;
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo10711(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        WriteMode writeMode = this.f15189;
        if (writeMode.end != 0) {
            C0064 c0064 = this.f15194;
            c0064.mo195();
            c0064.mo198();
            c0064.m203(writeMode.end);
        }
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void mo10712(float f) {
        if (this.f15190) {
            mo10649(String.valueOf(f));
        } else {
            ((C0107) this.f15194.f139).m345(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw AbstractC5507.m10744(Float.valueOf(f), null);
        }
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean mo10713(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        return this.f15193.f19157;
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo10714(boolean z) {
        if (this.f15190) {
            mo10649(String.valueOf(z));
        } else {
            ((C0107) this.f15194.f139).m345(String.valueOf(z));
        }
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo10715(InterfaceC7191 interfaceC7191, int i, InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7191.getClass();
        interfaceC7184.getClass();
        if (obj != null || this.f15193.f19153) {
            super.mo10715(interfaceC7191, i, interfaceC7184, obj);
        }
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC7186 mo10716(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        boolean zM10643 = AbstractC5486.m10643(interfaceC7191);
        WriteMode writeMode = this.f15189;
        AbstractC7159 abstractC7159 = this.f15195;
        C0064 c5487 = this.f15194;
        if (zM10643) {
            if (!(c5487 instanceof C5506)) {
                c5487 = new C5506((C0107) c5487.f139, this.f15190);
            }
            return new C5496(c5487, abstractC7159, writeMode, null);
        }
        if (interfaceC7191.isInline() && interfaceC7191.equals(AbstractC7168.f19137)) {
            if (!(c5487 instanceof C5487)) {
                c5487 = new C5487((C0107) c5487.f139, this.f15190);
            }
            return new C5496(c5487, abstractC7159, writeMode, null);
        }
        if (this.f15191 != null) {
            this.f15187 = interfaceC7191.mo12382();
        }
        return this;
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo10647(byte b) {
        if (this.f15190) {
            mo10649(String.valueOf((int) b));
        } else {
            this.f15194.mo202(b);
        }
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo10717(double d) {
        if (this.f15190) {
            mo10649(String.valueOf(d));
        } else {
            ((C0107) this.f15194.f139).m345(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw AbstractC5507.m10744(Double.valueOf(d), null);
        }
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo10648(short s) {
        if (this.f15190) {
            mo10649(String.valueOf((int) s));
        } else {
            this.f15194.mo193(s);
        }
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo10649(String str) {
        str.getClass();
        this.f15194.mo192(str);
    }

    @Override // p053.AbstractC6561, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo10651(long j) {
        if (this.f15190) {
            mo10649(String.valueOf(j));
        } else {
            this.f15194.mo201(j);
        }
    }
}
