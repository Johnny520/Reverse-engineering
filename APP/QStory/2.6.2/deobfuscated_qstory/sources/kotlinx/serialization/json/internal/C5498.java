package kotlinx.serialization.json.internal;

import androidx.compose.foundation.C1067;
import androidx.compose.runtime.internal.C1245;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlinx.serialization.SerializationException;
import p052.InterfaceC6557;
import p087.C7087;
import p087.C7126;
import p088.AbstractC7158;
import p088.AbstractC7167;
import p088.AbstractC7175;
import p088.C7151;
import p088.C7156;
import p088.C7160;
import p088.C7162;
import p088.C7176;
import p088.InterfaceC7168;
import p089.InterfaceC7183;
import p090.InterfaceC7185;
import p090.InterfaceC7187;
import p091.C7191;
import p091.C7192;
import p091.C7195;
import p091.C7197;
import p091.InterfaceC7190;
import p253.AbstractC8189;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5498 implements InterfaceC7168, InterfaceC7185, InterfaceC7187 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f15205;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C7176 f15206;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Object f15207;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f15208;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ int f15209;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC7158 f15210;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC6557 f15211;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f15212;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5498(AbstractC7158 abstractC7158, InterfaceC6557 interfaceC6557, int i) {
        this(abstractC7158, interfaceC6557, (char) 0);
        this.f15209 = i;
        abstractC7158.getClass();
        interfaceC6557.getClass();
        switch (i) {
            case 1:
                this(abstractC7158, interfaceC6557, (char) 0);
                this.f15207 = new LinkedHashMap();
                break;
            case 2:
                this(abstractC7158, interfaceC6557, (char) 0);
                this.f15207 = new ArrayList();
                break;
            default:
                this.f15212.add("primitive");
                break;
        }
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final void mo6790(int i) {
        String str = (String) m10675();
        str.getClass();
        mo10676(str, AbstractC7167.m12406(Integer.valueOf(i)));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏 */
    public final void mo6791(InterfaceC7190 interfaceC7190, int i, InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7190.getClass();
        interfaceC7183.getClass();
        this.f15212.add(m10677(interfaceC7190, i));
        mo10670(interfaceC7183, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mo10670(p089.InterfaceC7183 r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.getClass()
            java.util.ArrayList r0 = r4.f15212
            java.lang.Object r0 = kotlin.collections.AbstractC4343.m8810(r0)
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪世苏兰哲 r1 = r4.f15210
            if (r0 != 0) goto L33
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r0 = r5.getDescriptor()
            androidx.compose.runtime.internal.飘花落叶言子楪世苏兰哲 r2 = r1.f19132
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r0 = kotlinx.serialization.json.internal.AbstractC5506.m10683(r0, r2)
            kotlin.reflect.jvm.internal.types.飘花落叶言子楪世兰苏哲 r2 = r0.getKind()
            boolean r2 = r2 instanceof p091.C7191
            if (r2 != 0) goto L27
            kotlin.reflect.jvm.internal.types.飘花落叶言子楪世兰苏哲 r0 = r0.getKind()
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪苏世兰哲 r2 = p091.C7195.f19210
            if (r0 != r2) goto L33
        L27:
            kotlinx.serialization.json.internal.飘花落叶言子楪哲世兰苏 r0 = new kotlinx.serialization.json.internal.飘花落叶言子楪哲世兰苏
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪苏兰哲世 r4 = r4.f15211
            r2 = 0
            r0.<init>(r1, r4, r2)
            r0.mo10670(r5, r6)
            return
        L33:
            飘花落叶言世苏兰哲楪子.飘花落叶言子楪苏哲世兰 r0 = r1.f19133
            boolean r2 = r5 instanceof p089.C7181
            kotlinx.serialization.json.ClassDiscriminatorMode r0 = r0.f19165
            if (r2 == 0) goto L40
            kotlinx.serialization.json.ClassDiscriminatorMode r3 = kotlinx.serialization.json.ClassDiscriminatorMode.NONE
            if (r0 == r3) goto L76
            goto L69
        L40:
            int[] r3 = kotlinx.serialization.json.internal.AbstractC5492.f15182
            int r0 = r0.ordinal()
            r0 = r3[r0]
            r3 = 1
            if (r0 == r3) goto L76
            r3 = 2
            if (r0 == r3) goto L76
            r3 = 3
            if (r0 != r3) goto L72
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r0 = r5.getDescriptor()
            kotlin.reflect.jvm.internal.types.飘花落叶言子楪世兰苏哲 r0 = r0.getKind()
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪苏哲世兰 r3 = p091.C7197.f19213
            boolean r3 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r3)
            if (r3 != 0) goto L69
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪苏哲世兰 r3 = p091.C7197.f19214
            boolean r0 = kotlin.jvm.internal.AbstractC4394.m8917(r0, r3)
            if (r0 == 0) goto L76
        L69:
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r0 = r5.getDescriptor()
            java.lang.String r0 = kotlinx.serialization.json.internal.AbstractC5506.m10696(r1, r0)
            goto L77
        L72:
            io.ktor.util.C4210.m8621()
            return
        L76:
            r0 = 0
        L77:
            if (r2 == 0) goto L8f
            r2 = r5
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世哲苏兰 r2 = (p089.C7181) r2
            if (r6 == 0) goto L83
            飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰 r2 = com.alibaba.fastjson2.AbstractC2904.m6258(r2, r4, r6)
            goto L90
        L83:
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r4 = r2.getDescriptor()
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r6 = "Value for serializer "
            androidx.collection.C0276.m848(r4, r6, r5)
            return
        L8f:
            r2 = r5
        L90:
            if (r0 == 0) goto Lac
            kotlinx.serialization.json.internal.AbstractC5506.m10684(r1, r5, r2, r0)
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r5 = r2.getDescriptor()
            kotlin.reflect.jvm.internal.types.飘花落叶言子楪世兰苏哲 r5 = r5.getKind()
            kotlinx.serialization.json.internal.AbstractC5506.m10697(r5)
            飘花落叶言世苏兰楪子哲.飘花落叶言子楪世兰苏哲 r5 = r2.getDescriptor()
            java.lang.String r5 = r5.mo12355()
            r4.f15205 = r0
            r4.f15208 = r5
        Lac:
            r2.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.C5498.mo10670(飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰, java.lang.Object):void");
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰 */
    public final void mo6792(C7126 c7126, int i, char c) {
        c7126.getClass();
        mo10676(m10677(c7126, i), AbstractC7167.m12405(String.valueOf(c)));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final void mo6793(C7126 c7126, int i, byte b) {
        c7126.getClass();
        mo10676(m10677(c7126, i), AbstractC7167.m12406(Byte.valueOf(b)));
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo6794(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        String str = (String) m10675();
        str.getClass();
        mo10676(str, AbstractC7167.m12405(interfaceC7190.mo12352(i)));
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo6795(char c) {
        String str = (String) m10675();
        str.getClass();
        mo10676(str, AbstractC7167.m12405(String.valueOf(c)));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final void mo6796(InterfaceC7190 interfaceC7190, int i, long j) {
        interfaceC7190.getClass();
        mo10676(m10677(interfaceC7190, i), AbstractC7167.m12406(Long.valueOf(j)));
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo6799() {
        String str = (String) AbstractC4343.m8810(this.f15212);
        if (str == null) {
            this.f15211.invoke(C7162.INSTANCE);
        } else {
            mo10676(str, C7162.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m10673(Object obj, double d) {
        String str = (String) obj;
        str.getClass();
        mo10676(str, AbstractC7167.m12406(Double.valueOf(d)));
        this.f15206.getClass();
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw AbstractC5506.m10687(Double.valueOf(d), str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m10674(InterfaceC7190 interfaceC7190, int i, InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7190.getClass();
        interfaceC7183.getClass();
        this.f15212.add(m10677(interfaceC7190, i));
        m12409(interfaceC7183, obj);
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7187 mo6800(InterfaceC7190 interfaceC7190) {
        C5498 c5498;
        interfaceC7190.getClass();
        InterfaceC6557 c1067 = AbstractC4343.m8810(this.f15212) == null ? this.f15211 : new C1067(this, 25);
        AbstractC4921 kind = interfaceC7190.getKind();
        boolean zM8917 = AbstractC4394.m8917(kind, C7197.f19212);
        AbstractC7158 abstractC7158 = this.f15210;
        if (zM8917 || (kind instanceof C7192)) {
            c5498 = new C5498(abstractC7158, c1067, 2);
        } else if (AbstractC4394.m8917(kind, C7197.f19215)) {
            InterfaceC7190 interfaceC7190M10683 = AbstractC5506.m10683(interfaceC7190.mo12356(0), abstractC7158.f19132);
            AbstractC4921 kind2 = interfaceC7190M10683.getKind();
            if (!(kind2 instanceof C7191) && !AbstractC4394.m8917(kind2, C7195.f19210)) {
                throw AbstractC5506.m10686(interfaceC7190M10683);
            }
            c1067.getClass();
            C5501 c5501 = new C5501(abstractC7158, c1067, 1);
            c5501.f15218 = true;
            c5498 = c5501;
        } else {
            c5498 = new C5498(abstractC7158, c1067, 1);
        }
        String str = this.f15205;
        if (str != null) {
            if (c5498 instanceof C5501) {
                C5501 c55012 = (C5501) c5498;
                c55012.mo10676("key", AbstractC7167.m12405(str));
                String strMo12355 = this.f15208;
                if (strMo12355 == null) {
                    strMo12355 = interfaceC7190.mo12355();
                }
                c55012.mo10676("value", AbstractC7167.m12405(strMo12355));
            } else {
                String strMo123552 = this.f15208;
                if (strMo123552 == null) {
                    strMo123552 = interfaceC7190.mo12355();
                }
                c5498.mo10676(str, AbstractC7167.m12405(strMo123552));
            }
            this.f15205 = null;
            this.f15208 = null;
        }
        return c5498;
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C1245 mo10641() {
        return this.f15210.f19132;
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo6801(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        if (!this.f15212.isEmpty()) {
            m10675();
        }
        this.f15211.invoke(mo10678());
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public final void mo6802(C7126 c7126, int i, short s) {
        c7126.getClass();
        mo10676(m10677(c7126, i), AbstractC7167.m12406(Short.valueOf(s)));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final void mo6803(C7126 c7126, int i, float f) {
        c7126.getClass();
        m10680(m10677(c7126, i), f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Object m10675() {
        ArrayList arrayList = this.f15212;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(AbstractC8189.m13673(arrayList));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void mo10676(String str, AbstractC7175 abstractC7175) {
        int i = this.f15209;
        str.getClass();
        abstractC7175.getClass();
        switch (i) {
            case 0:
                if (str != "primitive") {
                    C5919.m11249("This output can only consume primitives with 'primitive' tag");
                } else if (((AbstractC7175) this.f15207) != null) {
                    C5919.m11249("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                } else {
                    this.f15207 = abstractC7175;
                    this.f15211.invoke(abstractC7175);
                }
                break;
            case 1:
                ((LinkedHashMap) this.f15207).put(str, abstractC7175);
                break;
            default:
                ((ArrayList) this.f15207).add(Integer.parseInt(str), abstractC7175);
                break;
        }
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6804(float f) {
        m10680(m10675(), f);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final boolean mo10671(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        return this.f15206.f19162;
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    public final void mo6805(int i, int i2, InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        mo10676(m10677(interfaceC7190, i), AbstractC7167.m12406(Integer.valueOf(i2)));
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo6806(boolean z) {
        String str = (String) m10675();
        str.getClass();
        Boolean boolValueOf = Boolean.valueOf(z);
        C7087 c7087 = AbstractC7167.f19142;
        mo10676(str, new C7160(boolValueOf, false, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String m10677(InterfaceC7190 interfaceC7190, int i) {
        String strValueOf;
        interfaceC7190.getClass();
        int i2 = this.f15209;
        interfaceC7190.getClass();
        switch (i2) {
            case 2:
                strValueOf = String.valueOf(i);
                break;
            default:
                AbstractC7158 abstractC7158 = this.f15210;
                abstractC7158.getClass();
                AbstractC5506.m10695(abstractC7158, interfaceC7190);
                strValueOf = interfaceC7190.mo12352(i);
                break;
        }
        strValueOf.getClass();
        return strValueOf;
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public void mo6807(InterfaceC7190 interfaceC7190, int i, InterfaceC7183 interfaceC7183, Object obj) {
        switch (this.f15209) {
            case 1:
                interfaceC7190.getClass();
                interfaceC7183.getClass();
                if (obj != null || this.f15206.f19158) {
                    m10674(interfaceC7190, i, interfaceC7183, obj);
                }
                break;
            default:
                m10674(interfaceC7190, i, interfaceC7183, obj);
                break;
        }
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC7185 mo6808(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        if (AbstractC4343.m8810(this.f15212) == null) {
            return new C5498(this.f15210, this.f15211, 0).mo6808(interfaceC7190);
        }
        if (this.f15205 != null) {
            this.f15208 = interfaceC7190.mo12355();
        }
        return m10679(m10675(), interfaceC7190);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC7175 mo10678() {
        switch (this.f15209) {
            case 0:
                AbstractC7175 abstractC7175 = (AbstractC7175) this.f15207;
                if (abstractC7175 != null) {
                    return abstractC7175;
                }
                C5919.m11249("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            case 1:
                return new C7151((LinkedHashMap) this.f15207);
            default:
                return new C7156((ArrayList) this.f15207);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC7185 m10679(Object obj, InterfaceC7190 interfaceC7190) {
        String str = (String) obj;
        str.getClass();
        interfaceC7190.getClass();
        if (AbstractC5485.m10639(interfaceC7190)) {
            return new C5490(this, str);
        }
        if (interfaceC7190.isInline() && interfaceC7190.equals(AbstractC7167.f19142)) {
            return new C5490(this, str, interfaceC7190);
        }
        this.f15212.add(str);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m10680(Object obj, float f) {
        String str = (String) obj;
        str.getClass();
        mo10676(str, AbstractC7167.m12406(Float.valueOf(f)));
        this.f15206.getClass();
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw AbstractC5506.m10687(Float.valueOf(f), str);
        }
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final InterfaceC7185 mo6809(C7126 c7126, int i) {
        c7126.getClass();
        return m10679(m10677(c7126, i), c7126.mo12356(i));
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo6810(byte b) {
        String str = (String) m10675();
        str.getClass();
        mo10676(str, AbstractC7167.m12406(Byte.valueOf(b)));
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo6811(double d) {
        m10673(m10675(), d);
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo6812(short s) {
        String str = (String) m10675();
        str.getClass();
        mo10676(str, AbstractC7167.m12406(Short.valueOf(s)));
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo6813(String str) {
        str.getClass();
        String str2 = (String) m10675();
        str2.getClass();
        mo10676(str2, AbstractC7167.m12405(str));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final void mo6814(InterfaceC7190 interfaceC7190, int i, String str) {
        interfaceC7190.getClass();
        str.getClass();
        mo10676(m10677(interfaceC7190, i), AbstractC7167.m12405(str));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰 */
    public final void mo6815(C7126 c7126, int i, double d) {
        c7126.getClass();
        m10673(m10677(c7126, i), d);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世 */
    public final void mo6816(InterfaceC7190 interfaceC7190, int i, boolean z) {
        interfaceC7190.getClass();
        String strM10677 = m10677(interfaceC7190, i);
        Boolean boolValueOf = Boolean.valueOf(z);
        C7087 c7087 = AbstractC7167.f19142;
        mo10676(strM10677, new C7160(boolValueOf, false, null));
    }

    @Override // p090.InterfaceC7185
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo6817(long j) {
        String str = (String) m10675();
        str.getClass();
        mo10676(str, AbstractC7167.m12406(Long.valueOf(j)));
    }

    public C5498(AbstractC7158 abstractC7158, InterfaceC6557 interfaceC6557, char c) {
        this.f15212 = new ArrayList();
        this.f15210 = abstractC7158;
        this.f15211 = interfaceC6557;
        this.f15206 = abstractC7158.f19133;
    }
}
