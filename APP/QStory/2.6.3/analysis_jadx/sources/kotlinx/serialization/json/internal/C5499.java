package kotlinx.serialization.json.internal;

import androidx.compose.foundation.C1067;
import androidx.compose.runtime.internal.C1245;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlinx.serialization.SerializationException;
import p034.AbstractC6347;
import p052.InterfaceC6558;
import p087.C7088;
import p087.C7127;
import p088.AbstractC7159;
import p088.AbstractC7168;
import p088.AbstractC7176;
import p088.C7152;
import p088.C7157;
import p088.C7161;
import p088.C7163;
import p088.C7177;
import p088.InterfaceC7169;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7188;
import p091.C7192;
import p091.C7193;
import p091.C7196;
import p091.C7198;
import p091.InterfaceC7191;
import p253.AbstractC8190;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5499 implements InterfaceC7169, InterfaceC7186, InterfaceC7188 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f15205;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7177 f15206;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Object f15207;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f15208;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ int f15209;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC7159 f15210;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6558 f15211;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f15212;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5499(AbstractC7159 abstractC7159, InterfaceC6558 interfaceC6558, int i) {
        this(abstractC7159, interfaceC6558, (char) 0);
        this.f15209 = i;
        abstractC7159.getClass();
        interfaceC6558.getClass();
        switch (i) {
            case 1:
                this(abstractC7159, interfaceC6558, (char) 0);
                this.f15207 = new LinkedHashMap();
                break;
            case 2:
                this(abstractC7159, interfaceC6558, (char) 0);
                this.f15207 = new ArrayList();
                break;
            default:
                this.f15212.add("primitive");
                break;
        }
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final void mo10645(int i) {
        String str = (String) m10727();
        str.getClass();
        mo10728(str, AbstractC7168.m12433(Integer.valueOf(i)));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void mo10719(InterfaceC7191 interfaceC7191, int i, InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7191.getClass();
        interfaceC7184.getClass();
        this.f15212.add(m10730(interfaceC7191, i));
        mo10705(interfaceC7184, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo10705(p089.InterfaceC7184 r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.getClass()
            java.util.ArrayList r0 = r4.f15212
            java.lang.Object r0 = kotlin.collections.AbstractC4344.m8812(r0)
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪世苏兰哲 r1 = r4.f15210
            if (r0 != 0) goto L33
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r0 = r5.getDescriptor()
            androidx.compose.runtime.internal.飘花落叶言子楪世苏兰哲 r2 = r1.f19127
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r0 = kotlinx.serialization.json.internal.AbstractC5507.m10740(r0, r2)
            飘花落叶言楪兰苏哲世子.飘花落叶言子楪世苏哲兰 r2 = r0.getKind()
            boolean r2 = r2 instanceof p091.C7192
            if (r2 != 0) goto L27
            飘花落叶言楪兰苏哲世子.飘花落叶言子楪世苏哲兰 r0 = r0.getKind()
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪苏世兰哲 r2 = p091.C7196.f19205
            if (r0 != r2) goto L33
        L27:
            kotlinx.serialization.json.internal.飘花落叶言子楪哲世兰苏 r0 = new kotlinx.serialization.json.internal.飘花落叶言子楪哲世兰苏
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r4 = r4.f15211
            r2 = 0
            r0.<init>(r1, r4, r2)
            r0.mo10705(r5, r6)
            return
        L33:
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪苏哲世兰 r0 = r1.f19128
            boolean r2 = r5 instanceof p089.C7182
            kotlinx.serialization.json.ClassDiscriminatorMode r0 = r0.f19160
            if (r2 == 0) goto L40
            kotlinx.serialization.json.ClassDiscriminatorMode r3 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r0 == r3) goto L76
            goto L69
        L40:
            int[] r3 = kotlinx.serialization.json.internal.AbstractC5493.f15182
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 1
            if (r0 == r3) goto L76
            r3 = 2
            if (r0 == r3) goto L76
            r3 = 3
            if (r0 != r3) goto L72
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r0 = r5.getDescriptor()
            飘花落叶言楪兰苏哲世子.飘花落叶言子楪世苏哲兰 r0 = r0.getKind()
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪苏哲世兰 r3 = p091.C7198.f19209
            boolean r3 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r3)
            if (r3 != 0) goto L69
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪苏哲世兰 r3 = p091.C7198.f19207
            boolean r0 = kotlin.jvm.internal.AbstractC4395.m8907(r0, r3)
            if (r0 == 0) goto L76
        L69:
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r0 = r5.getDescriptor()
            java.lang.String r0 = kotlinx.serialization.json.internal.AbstractC5507.m10753(r1, r0)
            goto L77
        L72:
            io.ktor.util.C4211.m8611()
            return
        L76:
            r0 = 0
        L77:
            if (r2 == 0) goto L8f
            r2 = r5
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世哲苏兰 r2 = (p089.C7182) r2
            if (r6 == 0) goto L83
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰 r2 = kotlin.reflect.jvm.internal.AbstractC5062.m10044(r2, r4, r6)
            goto L90
        L83:
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r4 = r2.getDescriptor()
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r6 = "Value for serializer "
            androidx.collection.C0276.m849(r4, r6, r5)
            return
        L8f:
            r2 = r5
        L90:
            if (r0 == 0) goto Lac
            kotlinx.serialization.json.internal.AbstractC5507.m10741(r1, r5, r2, r0)
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r5 = r2.getDescriptor()
            飘花落叶言楪兰苏哲世子.飘花落叶言子楪世苏哲兰 r5 = r5.getKind()
            kotlinx.serialization.json.internal.AbstractC5507.m10754(r5)
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r5 = r2.getDescriptor()
            java.lang.String r5 = r5.mo12382()
            r4.f15205 = r0
            r4.f15208 = r5
        Lac:
            r2.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C5499.mo10705(飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰, java.lang.Object):void");
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void mo10720(C7127 c7127, int i, char c) {
        c7127.getClass();
        mo10728(m10730(c7127, i), AbstractC7168.m12432(String.valueOf(c)));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void mo10721(C7127 c7127, int i, byte b) {
        c7127.getClass();
        mo10728(m10730(c7127, i), AbstractC7168.m12433(Byte.valueOf(b)));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo10706(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        String str = (String) m10727();
        str.getClass();
        mo10728(str, AbstractC7168.m12432(interfaceC7191.mo12379(i)));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo10707(char c) {
        String str = (String) m10727();
        str.getClass();
        mo10728(str, AbstractC7168.m12432(String.valueOf(c)));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void mo10722(InterfaceC7191 interfaceC7191, int i, long j) {
        interfaceC7191.getClass();
        mo10728(m10730(interfaceC7191, i), AbstractC7168.m12433(Long.valueOf(j)));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo10709() {
        String str = (String) AbstractC4344.m8812(this.f15212);
        if (str == null) {
            this.f15211.invoke(C7163.INSTANCE);
        } else {
            mo10728(str, C7163.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m10723(Object obj, double d) {
        String str = (String) obj;
        str.getClass();
        mo10728(str, AbstractC7168.m12433(Double.valueOf(d)));
        this.f15206.getClass();
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw AbstractC5507.m10744(Double.valueOf(d), str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m10724(InterfaceC7191 interfaceC7191, int i, InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7191.getClass();
        interfaceC7184.getClass();
        this.f15212.add(m10730(interfaceC7191, i));
        m12436(interfaceC7184, obj);
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7188 mo10710(InterfaceC7191 interfaceC7191) {
        C5499 c5499;
        interfaceC7191.getClass();
        InterfaceC6558 c1067 = AbstractC4344.m8812(this.f15212) == null ? this.f15211 : new C1067(this, 25);
        AbstractC8190 kind = interfaceC7191.getKind();
        boolean zM8907 = AbstractC4395.m8907(kind, C7198.f19210);
        AbstractC7159 abstractC7159 = this.f15210;
        if (zM8907 || (kind instanceof C7193)) {
            c5499 = new C5499(abstractC7159, c1067, 2);
        } else if (AbstractC4395.m8907(kind, C7198.f19208)) {
            InterfaceC7191 interfaceC7191M10740 = AbstractC5507.m10740(interfaceC7191.mo12383(0), abstractC7159.f19127);
            AbstractC8190 kind2 = interfaceC7191M10740.getKind();
            if (!(kind2 instanceof C7192) && !AbstractC4395.m8907(kind2, C7196.f19205)) {
                throw AbstractC5507.m10743(interfaceC7191M10740);
            }
            c1067.getClass();
            C5502 c5502 = new C5502(abstractC7159, c1067, 1);
            c5502.f15218 = true;
            c5499 = c5502;
        } else {
            c5499 = new C5499(abstractC7159, c1067, 1);
        }
        String str = this.f15205;
        if (str != null) {
            if (c5499 instanceof C5502) {
                C5502 c55022 = (C5502) c5499;
                c55022.mo10728("key", AbstractC7168.m12432(str));
                String strMo12382 = this.f15208;
                if (strMo12382 == null) {
                    strMo12382 = interfaceC7191.mo12382();
                }
                c55022.mo10728("value", AbstractC7168.m12432(strMo12382));
            } else {
                String strMo123822 = this.f15208;
                if (strMo123822 == null) {
                    strMo123822 = interfaceC7191.mo12382();
                }
                c5499.mo10728(str, AbstractC7168.m12432(strMo123822));
            }
            this.f15205 = null;
            this.f15208 = null;
        }
        return c5499;
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C1245 mo10646() {
        return this.f15210.f19127;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo10711(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        if (!this.f15212.isEmpty()) {
            m10727();
        }
        this.f15211.invoke(mo10731());
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void mo10725(C7127 c7127, int i, short s) {
        c7127.getClass();
        mo10728(m10730(c7127, i), AbstractC7168.m12433(Short.valueOf(s)));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void mo10726(C7127 c7127, int i, float f) {
        c7127.getClass();
        m10733(m10730(c7127, i), f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Object m10727() {
        ArrayList arrayList = this.f15212;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(AbstractC6347.m11901(arrayList));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void mo10728(String str, AbstractC7176 abstractC7176) {
        int i = this.f15209;
        str.getClass();
        abstractC7176.getClass();
        switch (i) {
            case 0:
                if (str != "primitive") {
                    C5925.m11310("This output can only consume primitives with 'primitive' tag");
                } else if (((AbstractC7176) this.f15207) != null) {
                    C5925.m11310("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                } else {
                    this.f15207 = abstractC7176;
                    this.f15211.invoke(abstractC7176);
                }
                break;
            case 1:
                ((LinkedHashMap) this.f15207).put(str, abstractC7176);
                break;
            default:
                ((ArrayList) this.f15207).add(Integer.parseInt(str), abstractC7176);
                break;
        }
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo10712(float f) {
        m10733(m10727(), f);
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final boolean mo10713(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        return this.f15206.f19157;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo10729(int i, int i2, InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        mo10728(m10730(interfaceC7191, i), AbstractC7168.m12433(Integer.valueOf(i2)));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo10714(boolean z) {
        String str = (String) m10727();
        str.getClass();
        Boolean boolValueOf = Boolean.valueOf(z);
        C7088 c7088 = AbstractC7168.f19137;
        mo10728(str, new C7161(boolValueOf, false, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String m10730(InterfaceC7191 interfaceC7191, int i) {
        String strValueOf;
        interfaceC7191.getClass();
        int i2 = this.f15209;
        interfaceC7191.getClass();
        switch (i2) {
            case 2:
                strValueOf = String.valueOf(i);
                break;
            default:
                AbstractC7159 abstractC7159 = this.f15210;
                abstractC7159.getClass();
                AbstractC5507.m10752(abstractC7159, interfaceC7191);
                strValueOf = interfaceC7191.mo12379(i);
                break;
        }
        strValueOf.getClass();
        return strValueOf;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public void mo10715(InterfaceC7191 interfaceC7191, int i, InterfaceC7184 interfaceC7184, Object obj) {
        switch (this.f15209) {
            case 1:
                interfaceC7191.getClass();
                interfaceC7184.getClass();
                if (obj != null || this.f15206.f19153) {
                    m10724(interfaceC7191, i, interfaceC7184, obj);
                }
                break;
            default:
                m10724(interfaceC7191, i, interfaceC7184, obj);
                break;
        }
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC7186 mo10716(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        if (AbstractC4344.m8812(this.f15212) == null) {
            return new C5499(this.f15210, this.f15211, 0).mo10716(interfaceC7191);
        }
        if (this.f15205 != null) {
            this.f15208 = interfaceC7191.mo12382();
        }
        return m10732(m10727(), interfaceC7191);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC7176 mo10731() {
        switch (this.f15209) {
            case 0:
                AbstractC7176 abstractC7176 = (AbstractC7176) this.f15207;
                if (abstractC7176 != null) {
                    return abstractC7176;
                }
                C5925.m11310("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            case 1:
                return new C7152((LinkedHashMap) this.f15207);
            default:
                return new C7157((ArrayList) this.f15207);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC7186 m10732(Object obj, InterfaceC7191 interfaceC7191) {
        String str = (String) obj;
        str.getClass();
        interfaceC7191.getClass();
        if (AbstractC5486.m10643(interfaceC7191)) {
            return new C5491(this, str);
        }
        if (interfaceC7191.isInline() && interfaceC7191.equals(AbstractC7168.f19137)) {
            return new C5491(this, str, interfaceC7191);
        }
        this.f15212.add(str);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m10733(Object obj, float f) {
        String str = (String) obj;
        str.getClass();
        mo10728(str, AbstractC7168.m12433(Float.valueOf(f)));
        this.f15206.getClass();
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw AbstractC5507.m10744(Float.valueOf(f), str);
        }
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC7186 mo10734(C7127 c7127, int i) {
        c7127.getClass();
        return m10732(m10730(c7127, i), c7127.mo12383(i));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo10647(byte b) {
        String str = (String) m10727();
        str.getClass();
        mo10728(str, AbstractC7168.m12433(Byte.valueOf(b)));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo10717(double d) {
        m10723(m10727(), d);
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo10648(short s) {
        String str = (String) m10727();
        str.getClass();
        mo10728(str, AbstractC7168.m12433(Short.valueOf(s)));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo10649(String str) {
        str.getClass();
        String str2 = (String) m10727();
        str2.getClass();
        mo10728(str2, AbstractC7168.m12432(str));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void mo10735(InterfaceC7191 interfaceC7191, int i, String str) {
        interfaceC7191.getClass();
        str.getClass();
        mo10728(m10730(interfaceC7191, i), AbstractC7168.m12432(str));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void mo10736(C7127 c7127, int i, double d) {
        c7127.getClass();
        m10723(m10730(c7127, i), d);
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void mo10737(InterfaceC7191 interfaceC7191, int i, boolean z) {
        interfaceC7191.getClass();
        String strM10730 = m10730(interfaceC7191, i);
        Boolean boolValueOf = Boolean.valueOf(z);
        C7088 c7088 = AbstractC7168.f19137;
        mo10728(strM10730, new C7161(boolValueOf, false, null));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo10651(long j) {
        String str = (String) m10727();
        str.getClass();
        mo10728(str, AbstractC7168.m12433(Long.valueOf(j)));
    }

    public C5499(AbstractC7159 abstractC7159, InterfaceC6558 interfaceC6558, char c) {
        this.f15212 = new ArrayList();
        this.f15210 = abstractC7159;
        this.f15211 = interfaceC6558;
        this.f15206 = abstractC7159.f19128;
    }
}
