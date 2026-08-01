package kotlinx.serialization.json.internal;

import androidx.appcompat.app.C0064;
import androidx.appcompat.app.C0107;
import androidx.compose.runtime.internal.C1245;
import com.bumptech.glide.AbstractC3064;
import p088.AbstractC7158;
import p088.AbstractC7167;
import p088.C7176;
import p088.InterfaceC7168;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7187;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5495 extends AbstractC3064 implements InterfaceC7168 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public String f15187;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC7168[] f15188;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final WriteMode f15189;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f15190;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public String f15191;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1245 f15192;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C7176 f15193;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0064 f15194;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC7158 f15195;

    public C5495(C0064 c0064, AbstractC7158 abstractC7158, WriteMode writeMode, InterfaceC7168[] interfaceC7168Arr) {
        c0064.getClass();
        this.f15194 = c0064;
        this.f15195 = abstractC7158;
        this.f15189 = writeMode;
        this.f15188 = interfaceC7168Arr;
        this.f15192 = abstractC7158.f19132;
        this.f15193 = abstractC7158.f19133;
        int iOrdinal = writeMode.ordinal();
        if (interfaceC7168Arr != null) {
            InterfaceC7168 interfaceC7168 = interfaceC7168Arr[iOrdinal];
            if (interfaceC7168 == null && interfaceC7168 == this) {
                return;
            }
            interfaceC7168Arr[iOrdinal] = this;
        }
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final void mo6790(int i) {
        if (this.f15190) {
            mo6813(String.valueOf(i));
        } else {
            this.f15194.mo199(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo10670(p089.InterfaceC7183 r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.getClass()
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪世苏兰哲 r0 = r4.f15195
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪苏哲世兰 r1 = r0.f19133
            boolean r2 = r5 instanceof p089.C7181
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.f19165
            if (r2 == 0) goto L12
            kotlinx.serialization.json.ClassDiscriminatorMode r3 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r1 == r3) goto L48
            goto L3b
        L12:
            int[] r3 = kotlinx.serialization.json.internal.AbstractC5492.f15182
            int r1 = r1.ordinal()
            r1 = r3[r1]
            r3 = 1
            if (r1 == r3) goto L48
            r3 = 2
            if (r1 == r3) goto L48
            r3 = 3
            if (r1 != r3) goto L44
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r1 = r5.getDescriptor()
            kotlin.reflect.jvm.internal.types.飘花落叶言子楪世兰苏哲 r1 = r1.getKind()
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪苏哲世兰 r3 = p091.C7197.f19213
            boolean r3 = kotlin.jvm.internal.AbstractC4394.m8917(r1, r3)
            if (r3 != 0) goto L3b
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪苏哲世兰 r3 = p091.C7197.f19214
            boolean r1 = kotlin.jvm.internal.AbstractC4394.m8917(r1, r3)
            if (r1 == 0) goto L48
        L3b:
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r1 = r5.getDescriptor()
            java.lang.String r1 = kotlinx.serialization.json.internal.AbstractC5506.m10696(r0, r1)
            goto L49
        L44:
            io.ktor.util.C4210.m8621()
            return
        L48:
            r1 = 0
        L49:
            if (r2 == 0) goto L61
            r2 = r5
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世哲苏兰 r2 = (p089.C7181) r2
            if (r6 == 0) goto L55
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰 r2 = com.alibaba.fastjson2.AbstractC2904.m6258(r2, r4, r6)
            goto L62
        L55:
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r4 = r2.getDescriptor()
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r6 = "Value for serializer "
            androidx.collection.C0276.m848(r4, r6, r5)
            return
        L61:
            r2 = r5
        L62:
            if (r1 == 0) goto L7e
            kotlinx.serialization.json.internal.AbstractC5506.m10684(r0, r5, r2, r1)
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r5 = r2.getDescriptor()
            kotlin.reflect.jvm.internal.types.飘花落叶言子楪世兰苏哲 r5 = r5.getKind()
            kotlinx.serialization.json.internal.AbstractC5506.m10697(r5)
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r5 = r2.getDescriptor()
            java.lang.String r5 = r5.mo12355()
            r4.f15191 = r1
            r4.f15187 = r5
        L7e:
            r2.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C5495.mo10670(飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰, java.lang.Object):void");
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo6794(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        mo6813(interfaceC7190.mo12352(i));
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo6795(char c) {
        mo6813(String.valueOf(c));
    }

    @Override // com.bumptech.glide.AbstractC3064
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final void mo6798(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        int i2 = AbstractC5494.f15186[this.f15189.ordinal()];
        C0064 c0064 = this.f15194;
        boolean z = true;
        if (i2 == 1) {
            if (!c0064.f138) {
                c0064.m202(',');
            }
            c0064.mo198();
            return;
        }
        if (i2 == 2) {
            if (c0064.f138) {
                this.f15190 = true;
                c0064.mo198();
                return;
            }
            if (i % 2 == 0) {
                c0064.m202(',');
                c0064.mo198();
            } else {
                c0064.m202(':');
                c0064.mo193();
                z = false;
            }
            this.f15190 = z;
            return;
        }
        if (i2 != 3) {
            if (!c0064.f138) {
                c0064.m202(',');
            }
            c0064.mo198();
            AbstractC5506.m10695(this.f15195, interfaceC7190);
            mo6813(interfaceC7190.mo12352(i));
            c0064.m202(':');
            c0064.mo193();
            return;
        }
        if (i == 0) {
            this.f15190 = true;
        }
        if (i == 1) {
            c0064.m202(',');
            c0064.mo193();
            this.f15190 = false;
        }
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6799() {
        C0064 c0064 = this.f15194;
        c0064.getClass();
        ((C0107) c0064.f139).m344("null");
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7187 mo6800(InterfaceC7190 interfaceC7190) {
        InterfaceC7168 interfaceC7168;
        interfaceC7190.getClass();
        AbstractC7158 abstractC7158 = this.f15195;
        WriteMode writeModeM10689 = AbstractC5506.m10689(abstractC7158, interfaceC7190);
        char c = writeModeM10689.begin;
        C0064 c0064 = this.f15194;
        if (c != 0) {
            c0064.m202(c);
            c0064.mo186();
        }
        String str = this.f15191;
        if (str != null) {
            String strMo12355 = this.f15187;
            if (strMo12355 == null) {
                strMo12355 = interfaceC7190.mo12355();
            }
            c0064.mo198();
            c0064.mo191(str);
            c0064.m202(':');
            c0064.mo193();
            mo6813(strMo12355);
            this.f15191 = null;
            this.f15187 = null;
        }
        if (this.f15189 == writeModeM10689) {
            return this;
        }
        InterfaceC7168[] interfaceC7168Arr = this.f15188;
        return (interfaceC7168Arr == null || (interfaceC7168 = interfaceC7168Arr[writeModeM10689.ordinal()]) == null) ? new C5495(c0064, abstractC7158, writeModeM10689, interfaceC7168Arr) : interfaceC7168;
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C1245 mo10641() {
        return this.f15192;
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6801(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        WriteMode writeMode = this.f15189;
        if (writeMode.end != 0) {
            C0064 c0064 = this.f15194;
            c0064.mo194();
            c0064.mo197();
            c0064.m202(writeMode.end);
        }
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6804(float f) {
        if (this.f15190) {
            mo6813(String.valueOf(f));
        } else {
            ((C0107) this.f15194.f139).m344(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw AbstractC5506.m10687(Float.valueOf(f), null);
        }
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean mo10671(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        return this.f15193.f19162;
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo6806(boolean z) {
        if (this.f15190) {
            mo6813(String.valueOf(z));
        } else {
            ((C0107) this.f15194.f139).m344(String.valueOf(z));
        }
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo6807(InterfaceC7190 interfaceC7190, int i, InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7190.getClass();
        interfaceC7183.getClass();
        if (obj != null || this.f15193.f19158) {
            super.mo6807(interfaceC7190, i, interfaceC7183, obj);
        }
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC7185 mo6808(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        boolean zM10639 = AbstractC5485.m10639(interfaceC7190);
        WriteMode writeMode = this.f15189;
        AbstractC7158 abstractC7158 = this.f15195;
        C0064 c5486 = this.f15194;
        if (zM10639) {
            if (!(c5486 instanceof C5505)) {
                c5486 = new C5505((C0107) c5486.f139, this.f15190);
            }
            return new C5495(c5486, abstractC7158, writeMode, null);
        }
        if (interfaceC7190.isInline() && interfaceC7190.equals(AbstractC7167.f19142)) {
            if (!(c5486 instanceof C5486)) {
                c5486 = new C5486((C0107) c5486.f139, this.f15190);
            }
            return new C5495(c5486, abstractC7158, writeMode, null);
        }
        if (this.f15191 != null) {
            this.f15187 = interfaceC7190.mo12355();
        }
        return this;
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo6810(byte b) {
        if (this.f15190) {
            mo6813(String.valueOf((int) b));
        } else {
            this.f15194.mo201(b);
        }
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo6811(double d) {
        if (this.f15190) {
            mo6813(String.valueOf(d));
        } else {
            ((C0107) this.f15194.f139).m344(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw AbstractC5506.m10687(Double.valueOf(d), null);
        }
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo6812(short s) {
        if (this.f15190) {
            mo6813(String.valueOf((int) s));
        } else {
            this.f15194.mo192(s);
        }
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo6813(String str) {
        str.getClass();
        this.f15194.mo191(str);
    }

    @Override // com.bumptech.glide.AbstractC3064, p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo6817(long j) {
        if (this.f15190) {
            mo6813(String.valueOf(j));
        } else {
            this.f15194.mo200(j);
        }
    }
}
