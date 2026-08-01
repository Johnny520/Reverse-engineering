package kotlinx.serialization.json.internal;

import androidx.appcompat.app.C0911;
import androidx.appcompat.app.C0954;
import androidx.collection.C1123;
import androidx.compose.runtime.internal.C2080;
import io.ktor.util.C5043;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import p069.AbstractC7390;
import p104.AbstractC7988;
import p104.AbstractC7997;
import p104.C8006;
import p104.InterfaceC7998;
import p105.C8011;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8017;
import p107.C8027;
import p107.InterfaceC8020;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6328 extends AbstractC7390 implements InterfaceC7998 {

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public String f15532;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final InterfaceC7998[] f15533;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final WriteMode f15534;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public boolean f15535;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public String f15536;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C2080 f15537;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final C8006 f15538;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C0911 f15539;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC7988 f15540;

    public C6328(C0911 c0911, AbstractC7988 abstractC7988, WriteMode writeMode, InterfaceC7998[] interfaceC7998Arr) {
        c0911.getClass();
        this.f15539 = c0911;
        this.f15540 = abstractC7988;
        this.f15534 = writeMode;
        this.f15533 = interfaceC7998Arr;
        this.f15537 = abstractC7988.f19472;
        this.f15538 = abstractC7988.f19473;
        int iOrdinal = writeMode.ordinal();
        if (interfaceC7998Arr != null) {
            InterfaceC7998 interfaceC7998 = interfaceC7998Arr[iOrdinal];
            if (interfaceC7998 == null && interfaceC7998 == this) {
                return;
            }
            interfaceC7998Arr[iOrdinal] = this;
        }
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final void mo11204(int i) {
        if (this.f15535) {
            mo11208(String.valueOf(i));
        } else {
            this.f15539.mo760(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo11264(InterfaceC8013 interfaceC8013, Object obj) {
        String strM11312;
        InterfaceC8013 interfaceC8013M10603;
        interfaceC8013.getClass();
        AbstractC7988 abstractC7988 = this.f15540;
        boolean z = interfaceC8013 instanceof C8011;
        ClassDiscriminatorMode classDiscriminatorMode = abstractC7988.f19473.f19505;
        if (z) {
            strM11312 = classDiscriminatorMode != ClassDiscriminatorMode.NONE ? AbstractC6339.m11312(abstractC7988, interfaceC8013.getDescriptor()) : null;
        } else {
            int i = AbstractC6325.f15527[classDiscriminatorMode.ordinal()];
            if (i != 1 && i != 2) {
                if (i != 3) {
                    C5043.m9170();
                    return;
                } else {
                    AbstractC9019 kind = interfaceC8013.getDescriptor().getKind();
                    if (AbstractC5227.m9466(kind, C8027.f19554) || AbstractC5227.m9466(kind, C8027.f19552)) {
                    }
                }
            }
        }
        if (z) {
            C8011 c8011 = (C8011) interfaceC8013;
            if (obj == null) {
                C1123.m1409(c8011.getDescriptor(), "Value for serializer ", " should always be non-null. Please report issue to the kotlinx.serialization tracker.");
                return;
            }
            interfaceC8013M10603 = AbstractC5894.m10603(c8011, this, obj);
        } else {
            interfaceC8013M10603 = interfaceC8013;
        }
        if (strM11312 != null) {
            AbstractC6339.m11300(abstractC7988, interfaceC8013, interfaceC8013M10603, strM11312);
            AbstractC6339.m11313(interfaceC8013M10603.getDescriptor().getKind());
            String strMo12941 = interfaceC8013M10603.getDescriptor().mo12941();
            this.f15536 = strM11312;
            this.f15532 = strMo12941;
        }
        interfaceC8013M10603.serialize(this, obj);
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final void mo11265(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        mo11208(interfaceC8020.mo12938(i));
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public final void mo11266(char c) {
        mo11208(String.valueOf(c));
    }

    @Override // p069.AbstractC7390
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final void mo11267(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        int i2 = AbstractC6327.f15531[this.f15534.ordinal()];
        C0911 c0911 = this.f15539;
        boolean z = true;
        if (i2 == 1) {
            if (!c0911.f483) {
                c0911.m763(',');
            }
            c0911.mo759();
            return;
        }
        if (i2 == 2) {
            if (c0911.f483) {
                this.f15535 = true;
                c0911.mo759();
                return;
            }
            if (i % 2 == 0) {
                c0911.m763(',');
                c0911.mo759();
            } else {
                c0911.m763(':');
                c0911.mo754();
                z = false;
            }
            this.f15535 = z;
            return;
        }
        if (i2 != 3) {
            if (!c0911.f483) {
                c0911.m763(',');
            }
            c0911.mo759();
            AbstractC6339.m11311(this.f15540, interfaceC8020);
            mo11208(interfaceC8020.mo12938(i));
            c0911.m763(':');
            c0911.mo754();
            return;
        }
        if (i == 0) {
            this.f15535 = true;
        }
        if (i == 1) {
            c0911.m763(',');
            c0911.mo754();
            this.f15535 = false;
        }
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void mo11268() {
        C0911 c0911 = this.f15539;
        c0911.getClass();
        ((C0954) c0911.f484).m905("null");
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final InterfaceC8017 mo11269(InterfaceC8020 interfaceC8020) {
        InterfaceC7998 interfaceC7998;
        interfaceC8020.getClass();
        AbstractC7988 abstractC7988 = this.f15540;
        WriteMode writeModeM11305 = AbstractC6339.m11305(abstractC7988, interfaceC8020);
        char c = writeModeM11305.begin;
        C0911 c0911 = this.f15539;
        if (c != 0) {
            c0911.m763(c);
            c0911.mo747();
        }
        String str = this.f15536;
        if (str != null) {
            String strMo12941 = this.f15532;
            if (strMo12941 == null) {
                strMo12941 = interfaceC8020.mo12941();
            }
            c0911.mo759();
            c0911.mo752(str);
            c0911.m763(':');
            c0911.mo754();
            mo11208(strMo12941);
            this.f15536 = null;
            this.f15532 = null;
        }
        if (this.f15534 == writeModeM11305) {
            return this;
        }
        InterfaceC7998[] interfaceC7998Arr = this.f15533;
        return (interfaceC7998Arr == null || (interfaceC7998 = interfaceC7998Arr[writeModeM11305.ordinal()]) == null) ? new C6328(c0911, abstractC7988, writeModeM11305, interfaceC7998Arr) : interfaceC7998;
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C2080 mo11205() {
        return this.f15537;
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo11270(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        WriteMode writeMode = this.f15534;
        if (writeMode.end != 0) {
            C0911 c0911 = this.f15539;
            c0911.mo755();
            c0911.mo758();
            c0911.m763(writeMode.end);
        }
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final void mo11271(float f) {
        if (this.f15535) {
            mo11208(String.valueOf(f));
        } else {
            ((C0954) this.f15539.f484).m905(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw AbstractC6339.m11303(Float.valueOf(f), null);
        }
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final boolean mo11272(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        return this.f15538.f19502;
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final void mo11273(boolean z) {
        if (this.f15535) {
            mo11208(String.valueOf(z));
        } else {
            ((C0954) this.f15539.f484).m905(String.valueOf(z));
        }
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo11274(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        if (obj != null || this.f15538.f19498) {
            super.mo11274(interfaceC8020, i, interfaceC8013, obj);
        }
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC8015 mo11275(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        boolean zM11202 = AbstractC6318.m11202(interfaceC8020);
        WriteMode writeMode = this.f15534;
        AbstractC7988 abstractC7988 = this.f15540;
        C0911 c6319 = this.f15539;
        if (zM11202) {
            if (!(c6319 instanceof C6338)) {
                c6319 = new C6338((C0954) c6319.f484, this.f15535);
            }
            return new C6328(c6319, abstractC7988, writeMode, null);
        }
        if (interfaceC8020.isInline() && interfaceC8020.equals(AbstractC7997.f19482)) {
            if (!(c6319 instanceof C6319)) {
                c6319 = new C6319((C0954) c6319.f484, this.f15535);
            }
            return new C6328(c6319, abstractC7988, writeMode, null);
        }
        if (this.f15536 != null) {
            this.f15532 = interfaceC8020.mo12941();
        }
        return this;
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo11206(byte b) {
        if (this.f15535) {
            mo11208(String.valueOf((int) b));
        } else {
            this.f15539.mo762(b);
        }
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final void mo11276(double d) {
        if (this.f15535) {
            mo11208(String.valueOf(d));
        } else {
            ((C0954) this.f15539.f484).m905(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw AbstractC6339.m11303(Double.valueOf(d), null);
        }
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo11207(short s) {
        if (this.f15535) {
            mo11208(String.valueOf((int) s));
        } else {
            this.f15539.mo753(s);
        }
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo11208(String str) {
        str.getClass();
        this.f15539.mo752(str);
    }

    @Override // p069.AbstractC7390, p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo11210(long j) {
        if (this.f15535) {
            mo11208(String.valueOf(j));
        } else {
            this.f15539.mo761(j);
        }
    }
}
