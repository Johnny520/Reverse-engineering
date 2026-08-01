package kotlinx.serialization.json.internal;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.internal.C1245;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC4343;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.C4396;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import kotlin.text.AbstractC5138;
import kotlinx.serialization.json.JsonDecodingException;
import net.bytebuddy.pool.TypePool;
import p087.C7087;
import p087.C7126;
import p088.AbstractC7147;
import p088.AbstractC7158;
import p088.AbstractC7167;
import p088.AbstractC7175;
import p088.C7151;
import p088.C7156;
import p088.C7160;
import p088.C7162;
import p088.C7176;
import p088.InterfaceC7177;
import p089.InterfaceC7183;
import p090.InterfaceC7186;
import p090.InterfaceC7188;
import p091.C7191;
import p091.C7192;
import p091.C7195;
import p091.C7197;
import p091.InterfaceC7190;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5491 implements InterfaceC7177, InterfaceC7186, InterfaceC7188 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C7176 f15177;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f15178;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f15179;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC7158 f15180;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f15181 = new ArrayList();

    public AbstractC5491(AbstractC7158 abstractC7158, String str) {
        this.f15180 = abstractC7158;
        this.f15178 = str;
        this.f15177 = abstractC7158.f19133;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final boolean mo6861(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return m10665(m10649(interfaceC7190, i));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏 */
    public final byte mo6862(C7126 c7126, int i) {
        c7126.getClass();
        return m10662(m10649(c7126, i));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲 */
    public final InterfaceC7186 mo6863(C7126 c7126, int i) {
        c7126.getClass();
        return m10661(m10649(c7126, i), c7126.mo12356(i));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final double mo6864(C7126 c7126, int i) {
        c7126.getClass();
        return m10659(m10649(c7126, i));
    }

    @Override // p088.InterfaceC7177
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final AbstractC7158 mo10643() {
        return this.f15180;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo10644(p089.InterfaceC7183 r15) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractC5491.mo10644(飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰):java.lang.Object");
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public boolean mo6865() {
        return !(m10664() instanceof C7162);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m10645(AbstractC7147 abstractC7147, String str, String str2) {
        String str3 = "Failed to parse literal '" + abstractC7147 + "' as " + (AbstractC5138.m10125(str, "i", false) ? "an " : "a ").concat(str) + " value";
        String strM10650 = m10650(str2);
        String string = this.f15180.f19133.f19166 ? AbstractC5506.m10694(-1, m10664().toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5506.m10701(str3, strM10650, null, -1, string), str3, -1, strM10650, string, null);
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪 */
    public final char mo6866(C7126 c7126, int i) {
        c7126.getClass();
        return m10663(m10649(c7126, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final String m10646() {
        ArrayList arrayList = this.f15181;
        return arrayList.isEmpty() ? "$" : AbstractC4343.m8813(arrayList, ".", "$.", null, null, 60);
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final String mo6867() {
        return m10656(m10647());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Object m10647() {
        ArrayList arrayList = this.f15181;
        Object objRemove = arrayList.remove(AbstractC8189.m13673(arrayList));
        this.f15179 = true;
        return objRemove;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract AbstractC7175 mo10648();

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo6868() {
        return m10660(m10647());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final String m10649(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        String strMo10657 = mo10657(interfaceC7190, i);
        strMo10657.getClass();
        return strMo10657;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final String m10650(String str) {
        str.getClass();
        return m10646() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str;
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲 */
    public final long mo6869() {
        return m10654(m10647());
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪 */
    public final short mo6870(C7126 c7126, int i) {
        c7126.getClass();
        return m10653(m10649(c7126, i));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰 */
    public final float mo6871(C7126 c7126, int i) {
        c7126.getClass();
        return m10658(m10649(c7126, i));
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final int mo6872(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return m10660(m10649(interfaceC7190, i));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final int mo6873(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        String str = (String) m10647();
        str.getClass();
        AbstractC7175 abstractC7175Mo10651 = mo10651(str);
        String strMo12355 = interfaceC7190.mo12355();
        boolean z = abstractC7175Mo10651 instanceof AbstractC7147;
        AbstractC7158 abstractC7158 = this.f15180;
        if (z) {
            return AbstractC5506.m10699(interfaceC7190, abstractC7158, ((AbstractC7147) abstractC7175Mo10651).mo12396(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4396 c4396 = AbstractC4395.f12971;
        sb.append(c4396.mo8927(AbstractC7147.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4396.mo8927(abstractC7175Mo10651.getClass()).getSimpleName());
        String strM146 = AbstractC0053.m146(sb, " as the serialized body of ", strMo12355);
        String strM10650 = m10650(str);
        String string = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175Mo10651.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5506.m10701(strM146, strM10650, null, -1, string), strM146, -1, strM10650, string, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract AbstractC7175 mo10651(String str);

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final Object mo6874(InterfaceC7190 interfaceC7190, int i, InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7190.getClass();
        interfaceC7183.getClass();
        this.f15181.add(m10649(interfaceC7190, i));
        interfaceC7183.getClass();
        Object objMo10644 = mo10644(interfaceC7183);
        if (!this.f15179) {
            m10647();
        }
        this.f15179 = false;
        return objMo10644;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final Object mo6875(InterfaceC7190 interfaceC7190, int i, InterfaceC7183 interfaceC7183, Object obj) {
        interfaceC7190.getClass();
        interfaceC7183.getClass();
        this.f15181.add(m10649(interfaceC7190, i));
        Object objMo10644 = (interfaceC7183.getDescriptor().mo12383() || mo6865()) ? mo10644(interfaceC7183) : null;
        if (!this.f15179) {
            m10647();
        }
        this.f15179 = false;
        return objMo10644;
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public InterfaceC7188 mo6876(InterfaceC7190 interfaceC7190) {
        String string;
        interfaceC7190.getClass();
        AbstractC7175 abstractC7175M10664 = m10664();
        AbstractC4921 kind = interfaceC7190.getKind();
        boolean zM8917 = AbstractC4394.m8917(kind, C7197.f19212);
        AbstractC7158 abstractC7158 = this.f15180;
        if (zM8917 || (kind instanceof C7192)) {
            String strMo12355 = interfaceC7190.mo12355();
            if (abstractC7175M10664 instanceof C7156) {
                return new C5503(abstractC7158, (C7156) abstractC7175M10664);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            C4396 c4396 = AbstractC4395.f12971;
            sb.append(c4396.mo8927(C7156.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c4396.mo8927(abstractC7175M10664.getClass()).getSimpleName());
            String strM146 = AbstractC0053.m146(sb, " as the serialized body of ", strMo12355);
            String strM10646 = m10646();
            String string2 = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175M10664.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5506.m10701(strM146, strM10646, null, -1, string2), strM146, -1, strM10646, string2, null);
        }
        if (!AbstractC4394.m8917(kind, C7197.f19215)) {
            String strMo123552 = interfaceC7190.mo12355();
            if (abstractC7175M10664 instanceof C7151) {
                return new C5502(abstractC7158, (C7151) abstractC7175M10664, this.f15178, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            C4396 c43962 = AbstractC4395.f12971;
            sb2.append(c43962.mo8927(C7151.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(c43962.mo8927(abstractC7175M10664.getClass()).getSimpleName());
            String strM1462 = AbstractC0053.m146(sb2, " as the serialized body of ", strMo123552);
            String strM106462 = m10646();
            string = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175M10664.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5506.m10701(strM1462, strM106462, null, -1, string), strM1462, -1, strM106462, string, null);
        }
        InterfaceC7190 interfaceC7190M10683 = AbstractC5506.m10683(interfaceC7190.mo12356(0), abstractC7158.f19132);
        AbstractC4921 kind2 = interfaceC7190M10683.getKind();
        if (!(kind2 instanceof C7191) && !AbstractC4394.m8917(kind2, C7195.f19210)) {
            throw AbstractC5506.m10686(interfaceC7190M10683);
        }
        String strMo123553 = interfaceC7190.mo12355();
        if (abstractC7175M10664 instanceof C7151) {
            return new C5500(abstractC7158, (C7151) abstractC7175M10664);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        C4396 c43963 = AbstractC4395.f12971;
        sb3.append(c43963.mo8927(C7151.class).getSimpleName());
        sb3.append(", but had ");
        sb3.append(c43963.mo8927(abstractC7175M10664.getClass()).getSimpleName());
        String strM1463 = AbstractC0053.m146(sb3, " as the serialized body of ", strMo123553);
        String strM106463 = m10646();
        string = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175M10664.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5506.m10701(strM1463, strM106463, null, -1, string), strM1463, -1, strM106463, string, null);
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1245 mo10652() {
        return this.f15180.f19132;
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo6877(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final short m10653(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7175 abstractC7175Mo10651 = mo10651(str);
        if (abstractC7175Mo10651 instanceof AbstractC7147) {
            AbstractC7147 abstractC7147 = (AbstractC7147) abstractC7175Mo10651;
            try {
                long jM12407 = AbstractC7167.m12407(abstractC7147);
                Short shValueOf = (-32768 > jM12407 || jM12407 > 32767) ? null : Short.valueOf((short) jM12407);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                m10645(abstractC7147, "short", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                m10645(abstractC7147, "short", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4396 c4396 = AbstractC4395.f12971;
        sb.append(c4396.mo8927(AbstractC7147.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4396.mo8927(abstractC7175Mo10651.getClass()).getSimpleName());
        sb.append(" as the serialized body of short");
        String string = sb.toString();
        String strM10650 = m10650(str);
        String string2 = this.f15180.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175Mo10651.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5506.m10701(string, strM10650, null, -1, string2), string, -1, strM10650, string2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long m10654(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7175 abstractC7175Mo10651 = mo10651(str);
        if (abstractC7175Mo10651 instanceof AbstractC7147) {
            AbstractC7147 abstractC7147 = (AbstractC7147) abstractC7175Mo10651;
            try {
                return AbstractC7167.m12407(abstractC7147);
            } catch (IllegalArgumentException unused) {
                this.m10645(abstractC7147, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4396 c4396 = AbstractC4395.f12971;
        sb.append(c4396.mo8927(AbstractC7147.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4396.mo8927(abstractC7175Mo10651.getClass()).getSimpleName());
        sb.append(" as the serialized body of long");
        String string = sb.toString();
        String strM10650 = m10650(str);
        String string2 = this.f15180.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175Mo10651.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5506.m10701(string, strM10650, null, -1, string2), string, -1, strM10650, string2, null);
    }

    @Override // p088.InterfaceC7177
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC7175 mo10655() {
        return m10664();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String m10656(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7175 abstractC7175Mo10651 = mo10651(str);
        boolean z = abstractC7175Mo10651 instanceof AbstractC7147;
        AbstractC7158 abstractC7158 = this.f15180;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            C4396 c4396 = AbstractC4395.f12971;
            sb.append(c4396.mo8927(AbstractC7147.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c4396.mo8927(abstractC7175Mo10651.getClass()).getSimpleName());
            sb.append(" as the serialized body of string");
            String string = sb.toString();
            String strM10650 = m10650(str);
            String string2 = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175Mo10651.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5506.m10701(string, strM10650, null, -1, string2), string, -1, strM10650, string2, null);
        }
        AbstractC7147 abstractC7147 = (AbstractC7147) abstractC7175Mo10651;
        if (!(abstractC7147 instanceof C7160)) {
            String strM156 = AbstractC0053.m156("Expected string value for a non-null key '", str, "', got null literal instead");
            String strM106502 = m10650(str);
            String string3 = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, m10664().toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5506.m10701(strM156, strM106502, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", -1, string3), strM156, -1, strM106502, string3, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
        }
        C7160 c7160 = (C7160) abstractC7147;
        if (c7160.f19136 || abstractC7158.f19133.f19160) {
            return c7160.f19135;
        }
        String strM1562 = AbstractC0053.m156("String literal for value of key '", str, "' should be quoted");
        String strM106503 = m10650(str);
        String string4 = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, m10664().toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5506.m10701(strM1562, strM106503, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", -1, string4), strM1562, -1, strM106503, string4, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public String mo10657(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return interfaceC7190.mo12352(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final float m10658(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7175 abstractC7175Mo10651 = mo10651(str);
        boolean z = abstractC7175Mo10651 instanceof AbstractC7147;
        AbstractC7158 abstractC7158 = this.f15180;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            C4396 c4396 = AbstractC4395.f12971;
            sb.append(c4396.mo8927(AbstractC7147.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c4396.mo8927(abstractC7175Mo10651.getClass()).getSimpleName());
            sb.append(" as the serialized body of float");
            String string = sb.toString();
            String strM10650 = m10650(str);
            String string2 = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175Mo10651.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5506.m10701(string, strM10650, null, -1, string2), string, -1, strM10650, string2, null);
        }
        AbstractC7147 abstractC7147 = (AbstractC7147) abstractC7175Mo10651;
        try {
            C7087 c7087 = AbstractC7167.f19142;
            float f = Float.parseFloat(abstractC7147.mo12396());
            C7176 c7176 = abstractC7158.f19133;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            String strM10692 = AbstractC5506.m10692(Float.valueOf(f), str);
            String string3 = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, m10664().toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5506.m10701(strM10692, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", -1, string3), strM10692, -1, null, string3, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        } catch (IllegalArgumentException unused) {
            m10645(abstractC7147, "float", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final double m10659(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7175 abstractC7175Mo10651 = mo10651(str);
        boolean z = abstractC7175Mo10651 instanceof AbstractC7147;
        AbstractC7158 abstractC7158 = this.f15180;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            C4396 c4396 = AbstractC4395.f12971;
            sb.append(c4396.mo8927(AbstractC7147.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c4396.mo8927(abstractC7175Mo10651.getClass()).getSimpleName());
            sb.append(" as the serialized body of double");
            String string = sb.toString();
            String strM10650 = m10650(str);
            String string2 = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175Mo10651.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5506.m10701(string, strM10650, null, -1, string2), string, -1, strM10650, string2, null);
        }
        AbstractC7147 abstractC7147 = (AbstractC7147) abstractC7175Mo10651;
        try {
            C7087 c7087 = AbstractC7167.f19142;
            double d = Double.parseDouble(abstractC7147.mo12396());
            C7176 c7176 = abstractC7158.f19133;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            String strM10692 = AbstractC5506.m10692(Double.valueOf(d), str);
            String string3 = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, m10664().toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5506.m10701(strM10692, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", -1, string3), strM10692, -1, null, string3, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        } catch (IllegalArgumentException unused) {
            m10645(abstractC7147, "double", str);
            throw null;
        }
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final String mo6878(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return m10656(m10649(interfaceC7190, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m10660(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7175 abstractC7175Mo10651 = mo10651(str);
        if (abstractC7175Mo10651 instanceof AbstractC7147) {
            AbstractC7147 abstractC7147 = (AbstractC7147) abstractC7175Mo10651;
            try {
                long jM12407 = AbstractC7167.m12407(abstractC7147);
                Integer numValueOf = (-2147483648L > jM12407 || jM12407 > 2147483647L) ? null : Integer.valueOf((int) jM12407);
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                m10645(abstractC7147, "int", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                m10645(abstractC7147, "int", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4396 c4396 = AbstractC4395.f12971;
        sb.append(c4396.mo8927(AbstractC7147.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4396.mo8927(abstractC7175Mo10651.getClass()).getSimpleName());
        sb.append(" as the serialized body of int");
        String string = sb.toString();
        String strM10650 = m10650(str);
        String string2 = this.f15180.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175Mo10651.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5506.m10701(string, strM10650, null, -1, string2), string, -1, strM10650, string2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC7186 m10661(Object obj, InterfaceC7190 interfaceC7190) {
        String str = (String) obj;
        str.getClass();
        interfaceC7190.getClass();
        if (!AbstractC5485.m10639(interfaceC7190)) {
            this.f15181.add(str);
            return this;
        }
        AbstractC7175 abstractC7175Mo10651 = mo10651(str);
        String strMo12355 = interfaceC7190.mo12355();
        boolean z = abstractC7175Mo10651 instanceof AbstractC7147;
        AbstractC7158 abstractC7158 = this.f15180;
        if (z) {
            return new C5508(AbstractC5506.m10685(abstractC7158, ((AbstractC7147) abstractC7175Mo10651).mo12396()), abstractC7158);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4396 c4396 = AbstractC4395.f12971;
        sb.append(c4396.mo8927(AbstractC7147.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4396.mo8927(abstractC7175Mo10651.getClass()).getSimpleName());
        String strM146 = AbstractC0053.m146(sb, " as the serialized body of ", strMo12355);
        String strM10650 = m10650(str);
        String string = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175Mo10651.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5506.m10701(strM146, strM10650, null, -1, string), strM146, -1, strM10650, string, null);
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final InterfaceC7186 mo6880(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        if (AbstractC4343.m8810(this.f15181) != null) {
            return m10661(m10647(), interfaceC7190);
        }
        return new C5499(this.f15180, mo10648(), this.f15178).mo6880(interfaceC7190);
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final char mo6881() {
        return m10663(m10647());
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final boolean mo6882() {
        return m10665(m10647());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final byte m10662(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7175 abstractC7175Mo10651 = mo10651(str);
        if (abstractC7175Mo10651 instanceof AbstractC7147) {
            AbstractC7147 abstractC7147 = (AbstractC7147) abstractC7175Mo10651;
            try {
                long jM12407 = AbstractC7167.m12407(abstractC7147);
                Byte bValueOf = (-128 > jM12407 || jM12407 > 127) ? null : Byte.valueOf((byte) jM12407);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                m10645(abstractC7147, "byte", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                m10645(abstractC7147, "byte", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4396 c4396 = AbstractC4395.f12971;
        sb.append(c4396.mo8927(AbstractC7147.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4396.mo8927(abstractC7175Mo10651.getClass()).getSimpleName());
        sb.append(" as the serialized body of byte");
        String string = sb.toString();
        String strM10650 = m10650(str);
        String string2 = this.f15180.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175Mo10651.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5506.m10701(string, strM10650, null, -1, string2), string, -1, strM10650, string2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final char m10663(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7175 abstractC7175Mo10651 = mo10651(str);
        if (!(abstractC7175Mo10651 instanceof AbstractC7147)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C4396 c4396 = AbstractC4395.f12971;
            sb.append(c4396.mo8927(AbstractC7147.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c4396.mo8927(abstractC7175Mo10651.getClass()).getSimpleName());
            sb.append(" as the serialized body of char");
            String string = sb.toString();
            String strM10650 = m10650(str);
            String string2 = this.f15180.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175Mo10651.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5506.m10701(string, strM10650, null, -1, string2), string, -1, strM10650, string2, null);
        }
        AbstractC7147 abstractC7147 = (AbstractC7147) abstractC7175Mo10651;
        try {
            String strMo12396 = abstractC7147.mo12396();
            strMo12396.getClass();
            int length = strMo12396.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strMo12396.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            m10645(abstractC7147, "char", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC7175 m10664() {
        AbstractC7175 abstractC7175Mo10651;
        String str = (String) AbstractC4343.m8810(this.f15181);
        return (str == null || (abstractC7175Mo10651 = mo10651(str)) == null) ? mo10648() : abstractC7175Mo10651;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m10665(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7175 abstractC7175Mo10651 = mo10651(str);
        if (abstractC7175Mo10651 instanceof AbstractC7147) {
            AbstractC7147 abstractC7147 = (AbstractC7147) abstractC7175Mo10651;
            try {
                Boolean boolM12403 = AbstractC7167.m12403(abstractC7147);
                if (boolM12403 != null) {
                    return boolM12403.booleanValue();
                }
                m10645(abstractC7147, "boolean", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                m10645(abstractC7147, "boolean", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4396 c4396 = AbstractC4395.f12971;
        sb.append(c4396.mo8927(AbstractC7147.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4396.mo8927(abstractC7175Mo10651.getClass()).getSimpleName());
        sb.append(" as the serialized body of boolean");
        String string = sb.toString();
        String strM10650 = m10650(str);
        String string2 = this.f15180.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175Mo10651.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5506.m10701(string, strM10650, null, -1, string2), string, -1, strM10650, string2, null);
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final double mo6883() {
        return m10659(m10647());
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰 */
    public final float mo6884() {
        return m10658(m10647());
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲 */
    public final short mo6885() {
        return m10653(m10647());
    }

    @Override // p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲 */
    public final long mo6886(InterfaceC7190 interfaceC7190, int i) {
        interfaceC7190.getClass();
        return m10654(m10649(interfaceC7190, i));
    }

    @Override // p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世 */
    public final byte mo6887() {
        return m10662(m10647());
    }
}
