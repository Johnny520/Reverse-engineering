package kotlinx.serialization.json.internal;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.internal.C1245;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC4344;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.C4397;
import kotlin.text.AbstractC5139;
import kotlinx.serialization.json.JsonDecodingException;
import net.bytebuddy.pool.TypePool;
import p034.AbstractC6347;
import p087.C7088;
import p087.C7127;
import p088.AbstractC7148;
import p088.AbstractC7159;
import p088.AbstractC7168;
import p088.AbstractC7176;
import p088.C7152;
import p088.C7157;
import p088.C7161;
import p088.C7163;
import p088.C7177;
import p088.InterfaceC7178;
import p089.InterfaceC7184;
import p090.InterfaceC7187;
import p090.InterfaceC7189;
import p091.C7192;
import p091.C7193;
import p091.C7196;
import p091.C7198;
import p091.InterfaceC7191;
import p253.AbstractC8190;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5492 implements InterfaceC7178, InterfaceC7187, InterfaceC7189 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C7177 f15177;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f15178;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f15179;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC7159 f15180;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f15181 = new ArrayList();

    public AbstractC5492(AbstractC7159 abstractC7159, String str) {
        this.f15180 = abstractC7159;
        this.f15178 = str;
        this.f15177 = abstractC7159.f19128;
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final boolean mo10652(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return m10695(m10666(interfaceC7191, i));
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final byte mo10653(C7127 c7127, int i) {
        c7127.getClass();
        return m10692(m10666(c7127, i));
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final InterfaceC7187 mo10654(C7127 c7127, int i) {
        c7127.getClass();
        return m10688(m10666(c7127, i), c7127.mo12383(i));
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final double mo10655(C7127 c7127, int i) {
        c7127.getClass();
        return m10685(m10666(c7127, i));
    }

    @Override // p088.InterfaceC7178
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final AbstractC7159 mo10656() {
        return this.f15180;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo10657(p089.InterfaceC7184 r15) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.json.internal.AbstractC5492.mo10657(飘花落叶言世苏兰子楪哲.飘花落叶言子楪世苏哲兰):java.lang.Object");
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean mo10658() {
        return !(m10694() instanceof C7163);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m10659(AbstractC7148 abstractC7148, String str, String str2) {
        String str3 = "Failed to parse literal '" + abstractC7148 + "' as " + (AbstractC5139.m10139(str, "i", false) ? "an " : "a ").concat(str) + " value";
        String strM10667 = m10667(str2);
        String string = this.f15180.f19128.f19161 ? AbstractC5507.m10751(-1, m10694().toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(str3, strM10667, null, -1, string), str3, -1, strM10667, string, null);
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final char mo10660(C7127 c7127, int i) {
        c7127.getClass();
        return m10693(m10666(c7127, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final String m10661() {
        ArrayList arrayList = this.f15181;
        return arrayList.isEmpty() ? "$" : AbstractC4344.m8810(arrayList, ".", "$.", null, null, 60);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final String mo10662() {
        return m10682(m10663());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Object m10663() {
        ArrayList arrayList = this.f15181;
        Object objRemove = arrayList.remove(AbstractC6347.m11901(arrayList));
        this.f15179 = true;
        return objRemove;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract AbstractC7176 mo10664();

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int mo10665() {
        return m10687(m10663());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final String m10666(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        String strMo10683 = mo10683(interfaceC7191, i);
        strMo10683.getClass();
        return strMo10683;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final String m10667(String str) {
        str.getClass();
        return m10661() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str;
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long mo10668() {
        return m10680(m10663());
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final short mo10669(C7127 c7127, int i) {
        c7127.getClass();
        return m10679(m10666(c7127, i));
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final float mo10670(C7127 c7127, int i) {
        c7127.getClass();
        return m10684(m10666(c7127, i));
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int mo10671(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return m10687(m10666(interfaceC7191, i));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final int mo10672(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        String str = (String) m10663();
        str.getClass();
        AbstractC7176 abstractC7176Mo10673 = mo10673(str);
        String strMo12382 = interfaceC7191.mo12382();
        boolean z = abstractC7176Mo10673 instanceof AbstractC7148;
        AbstractC7159 abstractC7159 = this.f15180;
        if (z) {
            return AbstractC5507.m10756(interfaceC7191, abstractC7159, ((AbstractC7148) abstractC7176Mo10673).mo12423(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4397 c4397 = AbstractC4396.f12975;
        sb.append(c4397.mo8917(AbstractC7148.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4397.mo8917(abstractC7176Mo10673.getClass()).getSimpleName());
        String strM151 = AbstractC0053.m151(sb, " as the serialized body of ", strMo12382);
        String strM10667 = m10667(str);
        String string = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176Mo10673.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(strM151, strM10667, null, -1, string), strM151, -1, strM10667, string, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract AbstractC7176 mo10673(String str);

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object mo10674(InterfaceC7191 interfaceC7191, int i, InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7191.getClass();
        interfaceC7184.getClass();
        this.f15181.add(m10666(interfaceC7191, i));
        interfaceC7184.getClass();
        Object objMo10657 = mo10657(interfaceC7184);
        if (!this.f15179) {
            m10663();
        }
        this.f15179 = false;
        return objMo10657;
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo10675(InterfaceC7191 interfaceC7191, int i, InterfaceC7184 interfaceC7184, Object obj) {
        interfaceC7191.getClass();
        interfaceC7184.getClass();
        this.f15181.add(m10666(interfaceC7191, i));
        Object objMo10657 = (interfaceC7184.getDescriptor().mo12410() || mo10658()) ? mo10657(interfaceC7184) : null;
        if (!this.f15179) {
            m10663();
        }
        this.f15179 = false;
        return objMo10657;
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC7189 mo10676(InterfaceC7191 interfaceC7191) {
        String string;
        interfaceC7191.getClass();
        AbstractC7176 abstractC7176M10694 = m10694();
        AbstractC8190 kind = interfaceC7191.getKind();
        boolean zM8907 = AbstractC4395.m8907(kind, C7198.f19210);
        AbstractC7159 abstractC7159 = this.f15180;
        if (zM8907 || (kind instanceof C7193)) {
            String strMo12382 = interfaceC7191.mo12382();
            if (abstractC7176M10694 instanceof C7157) {
                return new C5504(abstractC7159, (C7157) abstractC7176M10694);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            C4397 c4397 = AbstractC4396.f12975;
            sb.append(c4397.mo8917(C7157.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c4397.mo8917(abstractC7176M10694.getClass()).getSimpleName());
            String strM151 = AbstractC0053.m151(sb, " as the serialized body of ", strMo12382);
            String strM10661 = m10661();
            String string2 = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176M10694.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5507.m10758(strM151, strM10661, null, -1, string2), strM151, -1, strM10661, string2, null);
        }
        if (!AbstractC4395.m8907(kind, C7198.f19208)) {
            String strMo123822 = interfaceC7191.mo12382();
            if (abstractC7176M10694 instanceof C7152) {
                return new C5503(abstractC7159, (C7152) abstractC7176M10694, this.f15178, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            C4397 c43972 = AbstractC4396.f12975;
            sb2.append(c43972.mo8917(C7152.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(c43972.mo8917(abstractC7176M10694.getClass()).getSimpleName());
            String strM1512 = AbstractC0053.m151(sb2, " as the serialized body of ", strMo123822);
            String strM106612 = m10661();
            string = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176M10694.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5507.m10758(strM1512, strM106612, null, -1, string), strM1512, -1, strM106612, string, null);
        }
        InterfaceC7191 interfaceC7191M10740 = AbstractC5507.m10740(interfaceC7191.mo12383(0), abstractC7159.f19127);
        AbstractC8190 kind2 = interfaceC7191M10740.getKind();
        if (!(kind2 instanceof C7192) && !AbstractC4395.m8907(kind2, C7196.f19205)) {
            throw AbstractC5507.m10743(interfaceC7191M10740);
        }
        String strMo123823 = interfaceC7191.mo12382();
        if (abstractC7176M10694 instanceof C7152) {
            return new C5501(abstractC7159, (C7152) abstractC7176M10694);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        C4397 c43973 = AbstractC4396.f12975;
        sb3.append(c43973.mo8917(C7152.class).getSimpleName());
        sb3.append(", but had ");
        sb3.append(c43973.mo8917(abstractC7176M10694.getClass()).getSimpleName());
        String strM1513 = AbstractC0053.m151(sb3, " as the serialized body of ", strMo123823);
        String strM106613 = m10661();
        string = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176M10694.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(strM1513, strM106613, null, -1, string), strM1513, -1, strM106613, string, null);
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1245 mo10677() {
        return this.f15180.f19127;
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo10678(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final short m10679(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7176 abstractC7176Mo10673 = mo10673(str);
        if (abstractC7176Mo10673 instanceof AbstractC7148) {
            AbstractC7148 abstractC7148 = (AbstractC7148) abstractC7176Mo10673;
            try {
                long jM12434 = AbstractC7168.m12434(abstractC7148);
                Short shValueOf = (-32768 > jM12434 || jM12434 > 32767) ? null : Short.valueOf((short) jM12434);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                m10659(abstractC7148, "short", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                m10659(abstractC7148, "short", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4397 c4397 = AbstractC4396.f12975;
        sb.append(c4397.mo8917(AbstractC7148.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4397.mo8917(abstractC7176Mo10673.getClass()).getSimpleName());
        sb.append(" as the serialized body of short");
        String string = sb.toString();
        String strM10667 = m10667(str);
        String string2 = this.f15180.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176Mo10673.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(string, strM10667, null, -1, string2), string, -1, strM10667, string2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long m10680(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7176 abstractC7176Mo10673 = mo10673(str);
        if (abstractC7176Mo10673 instanceof AbstractC7148) {
            AbstractC7148 abstractC7148 = (AbstractC7148) abstractC7176Mo10673;
            try {
                return AbstractC7168.m12434(abstractC7148);
            } catch (IllegalArgumentException unused) {
                this.m10659(abstractC7148, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4397 c4397 = AbstractC4396.f12975;
        sb.append(c4397.mo8917(AbstractC7148.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4397.mo8917(abstractC7176Mo10673.getClass()).getSimpleName());
        sb.append(" as the serialized body of long");
        String string = sb.toString();
        String strM10667 = m10667(str);
        String string2 = this.f15180.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176Mo10673.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(string, strM10667, null, -1, string2), string, -1, strM10667, string2, null);
    }

    @Override // p088.InterfaceC7178
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC7176 mo10681() {
        return m10694();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String m10682(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7176 abstractC7176Mo10673 = mo10673(str);
        boolean z = abstractC7176Mo10673 instanceof AbstractC7148;
        AbstractC7159 abstractC7159 = this.f15180;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            C4397 c4397 = AbstractC4396.f12975;
            sb.append(c4397.mo8917(AbstractC7148.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c4397.mo8917(abstractC7176Mo10673.getClass()).getSimpleName());
            sb.append(" as the serialized body of string");
            String string = sb.toString();
            String strM10667 = m10667(str);
            String string2 = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176Mo10673.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5507.m10758(string, strM10667, null, -1, string2), string, -1, strM10667, string2, null);
        }
        AbstractC7148 abstractC7148 = (AbstractC7148) abstractC7176Mo10673;
        if (!(abstractC7148 instanceof C7161)) {
            String strM158 = AbstractC0053.m158("Expected string value for a non-null key '", str, "', got null literal instead");
            String strM106672 = m10667(str);
            String string3 = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, m10694().toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5507.m10758(strM158, strM106672, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", -1, string3), strM158, -1, strM106672, string3, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
        }
        C7161 c7161 = (C7161) abstractC7148;
        if (c7161.f19131 || abstractC7159.f19128.f19155) {
            return c7161.f19130;
        }
        String strM1582 = AbstractC0053.m158("String literal for value of key '", str, "' should be quoted");
        String strM106673 = m10667(str);
        String string4 = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, m10694().toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(strM1582, strM106673, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", -1, string4), strM1582, -1, strM106673, string4, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public String mo10683(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return interfaceC7191.mo12379(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final float m10684(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7176 abstractC7176Mo10673 = mo10673(str);
        boolean z = abstractC7176Mo10673 instanceof AbstractC7148;
        AbstractC7159 abstractC7159 = this.f15180;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            C4397 c4397 = AbstractC4396.f12975;
            sb.append(c4397.mo8917(AbstractC7148.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c4397.mo8917(abstractC7176Mo10673.getClass()).getSimpleName());
            sb.append(" as the serialized body of float");
            String string = sb.toString();
            String strM10667 = m10667(str);
            String string2 = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176Mo10673.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5507.m10758(string, strM10667, null, -1, string2), string, -1, strM10667, string2, null);
        }
        AbstractC7148 abstractC7148 = (AbstractC7148) abstractC7176Mo10673;
        try {
            C7088 c7088 = AbstractC7168.f19137;
            float f = Float.parseFloat(abstractC7148.mo12423());
            C7177 c7177 = abstractC7159.f19128;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            String strM10749 = AbstractC5507.m10749(Float.valueOf(f), str);
            String string3 = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, m10694().toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5507.m10758(strM10749, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", -1, string3), strM10749, -1, null, string3, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        } catch (IllegalArgumentException unused) {
            m10659(abstractC7148, "float", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final double m10685(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7176 abstractC7176Mo10673 = mo10673(str);
        boolean z = abstractC7176Mo10673 instanceof AbstractC7148;
        AbstractC7159 abstractC7159 = this.f15180;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            C4397 c4397 = AbstractC4396.f12975;
            sb.append(c4397.mo8917(AbstractC7148.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c4397.mo8917(abstractC7176Mo10673.getClass()).getSimpleName());
            sb.append(" as the serialized body of double");
            String string = sb.toString();
            String strM10667 = m10667(str);
            String string2 = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176Mo10673.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5507.m10758(string, strM10667, null, -1, string2), string, -1, strM10667, string2, null);
        }
        AbstractC7148 abstractC7148 = (AbstractC7148) abstractC7176Mo10673;
        try {
            C7088 c7088 = AbstractC7168.f19137;
            double d = Double.parseDouble(abstractC7148.mo12423());
            C7177 c7177 = abstractC7159.f19128;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            String strM10749 = AbstractC5507.m10749(Double.valueOf(d), str);
            String string3 = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, m10694().toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5507.m10758(strM10749, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", -1, string3), strM10749, -1, null, string3, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        } catch (IllegalArgumentException unused) {
            m10659(abstractC7148, "double", str);
            throw null;
        }
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String mo10686(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return m10682(m10666(interfaceC7191, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m10687(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7176 abstractC7176Mo10673 = mo10673(str);
        if (abstractC7176Mo10673 instanceof AbstractC7148) {
            AbstractC7148 abstractC7148 = (AbstractC7148) abstractC7176Mo10673;
            try {
                long jM12434 = AbstractC7168.m12434(abstractC7148);
                Integer numValueOf = (-2147483648L > jM12434 || jM12434 > 2147483647L) ? null : Integer.valueOf((int) jM12434);
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                m10659(abstractC7148, "int", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                m10659(abstractC7148, "int", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4397 c4397 = AbstractC4396.f12975;
        sb.append(c4397.mo8917(AbstractC7148.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4397.mo8917(abstractC7176Mo10673.getClass()).getSimpleName());
        sb.append(" as the serialized body of int");
        String string = sb.toString();
        String strM10667 = m10667(str);
        String string2 = this.f15180.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176Mo10673.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(string, strM10667, null, -1, string2), string, -1, strM10667, string2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC7187 m10688(Object obj, InterfaceC7191 interfaceC7191) {
        String str = (String) obj;
        str.getClass();
        interfaceC7191.getClass();
        if (!AbstractC5486.m10643(interfaceC7191)) {
            this.f15181.add(str);
            return this;
        }
        AbstractC7176 abstractC7176Mo10673 = mo10673(str);
        String strMo12382 = interfaceC7191.mo12382();
        boolean z = abstractC7176Mo10673 instanceof AbstractC7148;
        AbstractC7159 abstractC7159 = this.f15180;
        if (z) {
            return new C5509(AbstractC5507.m10742(abstractC7159, ((AbstractC7148) abstractC7176Mo10673).mo12423()), abstractC7159);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4397 c4397 = AbstractC4396.f12975;
        sb.append(c4397.mo8917(AbstractC7148.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4397.mo8917(abstractC7176Mo10673.getClass()).getSimpleName());
        String strM151 = AbstractC0053.m151(sb, " as the serialized body of ", strMo12382);
        String strM10667 = m10667(str);
        String string = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176Mo10673.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(strM151, strM10667, null, -1, string), strM151, -1, strM10667, string, null);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC7187 mo10689(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        if (AbstractC4344.m8812(this.f15181) != null) {
            return m10688(m10663(), interfaceC7191);
        }
        return new C5500(this.f15180, mo10664(), this.f15178).mo10689(interfaceC7191);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final char mo10690() {
        return m10693(m10663());
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo10691() {
        return m10695(m10663());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final byte m10692(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7176 abstractC7176Mo10673 = mo10673(str);
        if (abstractC7176Mo10673 instanceof AbstractC7148) {
            AbstractC7148 abstractC7148 = (AbstractC7148) abstractC7176Mo10673;
            try {
                long jM12434 = AbstractC7168.m12434(abstractC7148);
                Byte bValueOf = (-128 > jM12434 || jM12434 > 127) ? null : Byte.valueOf((byte) jM12434);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                m10659(abstractC7148, "byte", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                m10659(abstractC7148, "byte", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4397 c4397 = AbstractC4396.f12975;
        sb.append(c4397.mo8917(AbstractC7148.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4397.mo8917(abstractC7176Mo10673.getClass()).getSimpleName());
        sb.append(" as the serialized body of byte");
        String string = sb.toString();
        String strM10667 = m10667(str);
        String string2 = this.f15180.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176Mo10673.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(string, strM10667, null, -1, string2), string, -1, strM10667, string2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final char m10693(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7176 abstractC7176Mo10673 = mo10673(str);
        if (!(abstractC7176Mo10673 instanceof AbstractC7148)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C4397 c4397 = AbstractC4396.f12975;
            sb.append(c4397.mo8917(AbstractC7148.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c4397.mo8917(abstractC7176Mo10673.getClass()).getSimpleName());
            sb.append(" as the serialized body of char");
            String string = sb.toString();
            String strM10667 = m10667(str);
            String string2 = this.f15180.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176Mo10673.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC5507.m10758(string, strM10667, null, -1, string2), string, -1, strM10667, string2, null);
        }
        AbstractC7148 abstractC7148 = (AbstractC7148) abstractC7176Mo10673;
        try {
            String strMo12423 = abstractC7148.mo12423();
            strMo12423.getClass();
            int length = strMo12423.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strMo12423.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            m10659(abstractC7148, "char", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC7176 m10694() {
        AbstractC7176 abstractC7176Mo10673;
        String str = (String) AbstractC4344.m8812(this.f15181);
        return (str == null || (abstractC7176Mo10673 = mo10673(str)) == null) ? mo10664() : abstractC7176Mo10673;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m10695(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC7176 abstractC7176Mo10673 = mo10673(str);
        if (abstractC7176Mo10673 instanceof AbstractC7148) {
            AbstractC7148 abstractC7148 = (AbstractC7148) abstractC7176Mo10673;
            try {
                Boolean boolM12430 = AbstractC7168.m12430(abstractC7148);
                if (boolM12430 != null) {
                    return boolM12430.booleanValue();
                }
                m10659(abstractC7148, "boolean", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                m10659(abstractC7148, "boolean", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4397 c4397 = AbstractC4396.f12975;
        sb.append(c4397.mo8917(AbstractC7148.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4397.mo8917(abstractC7176Mo10673.getClass()).getSimpleName());
        sb.append(" as the serialized body of boolean");
        String string = sb.toString();
        String strM10667 = m10667(str);
        String string2 = this.f15180.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176Mo10673.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(string, strM10667, null, -1, string2), string, -1, strM10667, string2, null);
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final double mo10696() {
        return m10685(m10663());
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final float mo10697() {
        return m10684(m10663());
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final short mo10698() {
        return m10679(m10663());
    }

    @Override // p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final long mo10699(InterfaceC7191 interfaceC7191, int i) {
        interfaceC7191.getClass();
        return m10680(m10666(interfaceC7191, i));
    }

    @Override // p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final byte mo10700() {
        return m10692(m10663());
    }
}
