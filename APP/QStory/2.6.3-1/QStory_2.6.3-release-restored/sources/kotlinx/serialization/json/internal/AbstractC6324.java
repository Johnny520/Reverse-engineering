package kotlinx.serialization.json.internal;

import androidx.activity.AbstractC0900;
import androidx.compose.runtime.internal.C2080;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlin.text.AbstractC5971;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.JsonDecodingException;
import net.bytebuddy.pool.TypePool;
import p050.AbstractC7176;
import p103.C7917;
import p103.C7956;
import p104.AbstractC7977;
import p104.AbstractC7988;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7986;
import p104.C7990;
import p104.C7992;
import p104.C8006;
import p104.InterfaceC8007;
import p105.C8011;
import p105.InterfaceC8013;
import p106.InterfaceC8016;
import p106.InterfaceC8018;
import p107.C8021;
import p107.C8022;
import p107.C8025;
import p107.C8027;
import p107.InterfaceC8020;
import p269.AbstractC9019;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6324 implements InterfaceC8007, InterfaceC8016, InterfaceC8018 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final C8006 f15522;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final String f15523;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public boolean f15524;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC7988 f15525;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f15526 = new ArrayList();

    public AbstractC6324(AbstractC7988 abstractC7988, String str) {
        this.f15525 = abstractC7988;
        this.f15523 = str;
        this.f15522 = abstractC7988.f19473;
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
    public final boolean mo11211(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return m11254(m11225(interfaceC8020, i));
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪哲苏, reason: contains not printable characters */
    public final byte mo11212(C7956 c7956, int i) {
        c7956.getClass();
        return m11251(m11225(c7956, i));
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世兰楪苏哲, reason: contains not printable characters */
    public final InterfaceC8016 mo11213(C7956 c7956, int i) {
        c7956.getClass();
        return m11247(m11225(c7956, i), c7956.mo12942(i));
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪, reason: contains not printable characters */
    public final double mo11214(C7956 c7956, int i) {
        c7956.getClass();
        return m11244(m11225(c7956, i));
    }

    @Override // p104.InterfaceC8007
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏楪哲, reason: contains not printable characters */
    public final AbstractC7988 mo11215() {
        return this.f15525;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0093  */
    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo11216(InterfaceC8013 interfaceC8013) {
        String strMo12982;
        interfaceC8013.getClass();
        if (!(interfaceC8013 instanceof C8011)) {
            return interfaceC8013.deserialize(this);
        }
        AbstractC7988 abstractC7988 = this.f15525;
        C8006 c8006 = abstractC7988.f19473;
        C8011 c8011 = (C8011) interfaceC8013;
        String strM11312 = AbstractC6339.m11312(abstractC7988, c8011.getDescriptor());
        AbstractC8005 abstractC8005M11253 = m11253();
        String strMo12941 = c8011.getDescriptor().mo12941();
        if (!(abstractC8005M11253 instanceof C7981)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C5229 c5229 = AbstractC5228.f13320;
            sb.append(c5229.mo9476(C7981.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c5229.mo9476(abstractC8005M11253.getClass()).getSimpleName());
            String strM711 = AbstractC0900.m711(sb, " as the serialized body of ", strMo12941);
            String strM11220 = m11220();
            String string = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005M11253.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC6339.m11317(strM711, strM11220, null, -1, string), strM711, -1, strM11220, string, null);
        }
        C7981 c7981 = (C7981) abstractC8005M11253;
        AbstractC8005 abstractC8005 = (AbstractC8005) c7981.get(strM11312);
        if (abstractC8005 != null) {
            AbstractC7977 abstractC7977M12987 = AbstractC7997.m12987(abstractC8005);
            strMo12982 = abstractC7977M12987 instanceof C7992 ? null : abstractC7977M12987.mo12982();
        }
        try {
            return AbstractC6339.m11309(abstractC7988, strM11312, c7981, AbstractC5894.m10604((C8011) interfaceC8013, this, strMo12982));
        } catch (SerializationException e) {
            String message = e.getMessage();
            message.getClass();
            String string2 = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, c7981.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC6339.m11317(message, null, null, -1, string2), message, -1, null, string2, null);
        }
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏, reason: contains not printable characters */
    public boolean mo11217() {
        return !(m11253() instanceof C7992);
    }

    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
    public final void m11218(AbstractC7977 abstractC7977, String str, String str2) {
        String str3 = "Failed to parse literal '" + abstractC7977 + "' as " + (AbstractC5971.m10698(str, "i", false) ? "an " : "a ").concat(str) + " value";
        String strM11226 = m11226(str2);
        String string = this.f15525.f19473.f19506 ? AbstractC6339.m11310(-1, m11253().toString()).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(str3, strM11226, null, -1, string), str3, -1, strM11226, string, null);
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏兰楪, reason: contains not printable characters */
    public final char mo11219(C7956 c7956, int i) {
        c7956.getClass();
        return m11252(m11225(c7956, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final String m11220() {
        ArrayList arrayList = this.f15526;
        return arrayList.isEmpty() ? "$" : AbstractC5176.m9369(arrayList, ".", "$.", null, null, 60);
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
    public final String mo11221() {
        return m11241(m11222());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏, reason: contains not printable characters */
    public final Object m11222() {
        ArrayList arrayList = this.f15526;
        Object objRemove = arrayList.remove(AbstractC7176.m12460(arrayList));
        this.f15524 = true;
        return objRemove;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
    public abstract AbstractC8005 mo11223();

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
    public final int mo11224() {
        return m11246(m11222());
    }

    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
    public final String m11225(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        String strMo11242 = mo11242(interfaceC8020, i);
        strMo11242.getClass();
        return strMo11242;
    }

    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final String m11226(String str) {
        str.getClass();
        return m11220() + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH + str;
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
    public final long mo11227() {
        return m11239(m11222());
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
    public final short mo11228(C7956 c7956, int i) {
        c7956.getClass();
        return m11238(m11225(c7956, i));
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public final float mo11229(C7956 c7956, int i) {
        c7956.getClass();
        return m11243(m11225(c7956, i));
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final int mo11230(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return m11246(m11225(interfaceC8020, i));
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
    public final int mo11231(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        String str = (String) m11222();
        str.getClass();
        AbstractC8005 abstractC8005Mo11232 = mo11232(str);
        String strMo12941 = interfaceC8020.mo12941();
        boolean z = abstractC8005Mo11232 instanceof AbstractC7977;
        AbstractC7988 abstractC7988 = this.f15525;
        if (z) {
            return AbstractC6339.m11315(interfaceC8020, abstractC7988, ((AbstractC7977) abstractC8005Mo11232).mo12982(), "");
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C5229 c5229 = AbstractC5228.f13320;
        sb.append(c5229.mo9476(AbstractC7977.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c5229.mo9476(abstractC8005Mo11232.getClass()).getSimpleName());
        String strM711 = AbstractC0900.m711(sb, " as the serialized body of ", strMo12941);
        String strM11226 = m11226(str);
        String string = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11232.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(strM711, strM11226, null, -1, string), strM711, -1, strM11226, string, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public abstract AbstractC8005 mo11232(String str);

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object mo11233(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        this.f15526.add(m11225(interfaceC8020, i));
        interfaceC8013.getClass();
        Object objMo11216 = mo11216(interfaceC8013);
        if (!this.f15524) {
            m11222();
        }
        this.f15524 = false;
        return objMo11216;
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Object mo11234(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        this.f15526.add(m11225(interfaceC8020, i));
        Object objMo11216 = (interfaceC8013.getDescriptor().mo12969() || mo11217()) ? mo11216(interfaceC8013) : null;
        if (!this.f15524) {
            m11222();
        }
        this.f15524 = false;
        return objMo11216;
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public InterfaceC8018 mo11235(InterfaceC8020 interfaceC8020) {
        String string;
        interfaceC8020.getClass();
        AbstractC8005 abstractC8005M11253 = m11253();
        AbstractC9019 kind = interfaceC8020.getKind();
        boolean zM9466 = AbstractC5227.m9466(kind, C8027.f19555);
        AbstractC7988 abstractC7988 = this.f15525;
        if (zM9466 || (kind instanceof C8022)) {
            String strMo12941 = interfaceC8020.mo12941();
            if (abstractC8005M11253 instanceof C7986) {
                return new C6336(abstractC7988, (C7986) abstractC8005M11253);
            }
            StringBuilder sb = new StringBuilder("Expected ");
            C5229 c5229 = AbstractC5228.f13320;
            sb.append(c5229.mo9476(C7986.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c5229.mo9476(abstractC8005M11253.getClass()).getSimpleName());
            String strM711 = AbstractC0900.m711(sb, " as the serialized body of ", strMo12941);
            String strM11220 = m11220();
            String string2 = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005M11253.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC6339.m11317(strM711, strM11220, null, -1, string2), strM711, -1, strM11220, string2, null);
        }
        if (!AbstractC5227.m9466(kind, C8027.f19553)) {
            String strMo129412 = interfaceC8020.mo12941();
            if (abstractC8005M11253 instanceof C7981) {
                return new C6335(abstractC7988, (C7981) abstractC8005M11253, this.f15523, 8);
            }
            StringBuilder sb2 = new StringBuilder("Expected ");
            C5229 c52292 = AbstractC5228.f13320;
            sb2.append(c52292.mo9476(C7981.class).getSimpleName());
            sb2.append(", but had ");
            sb2.append(c52292.mo9476(abstractC8005M11253.getClass()).getSimpleName());
            String strM7112 = AbstractC0900.m711(sb2, " as the serialized body of ", strMo129412);
            String strM112202 = m11220();
            string = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005M11253.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC6339.m11317(strM7112, strM112202, null, -1, string), strM7112, -1, strM112202, string, null);
        }
        InterfaceC8020 interfaceC8020M11299 = AbstractC6339.m11299(interfaceC8020.mo12942(0), abstractC7988.f19472);
        AbstractC9019 kind2 = interfaceC8020M11299.getKind();
        if (!(kind2 instanceof C8021) && !AbstractC5227.m9466(kind2, C8025.f19550)) {
            throw AbstractC6339.m11302(interfaceC8020M11299);
        }
        String strMo129413 = interfaceC8020.mo12941();
        if (abstractC8005M11253 instanceof C7981) {
            return new C6333(abstractC7988, (C7981) abstractC8005M11253);
        }
        StringBuilder sb3 = new StringBuilder("Expected ");
        C5229 c52293 = AbstractC5228.f13320;
        sb3.append(c52293.mo9476(C7981.class).getSimpleName());
        sb3.append(", but had ");
        sb3.append(c52293.mo9476(abstractC8005M11253.getClass()).getSimpleName());
        String strM7113 = AbstractC0900.m711(sb3, " as the serialized body of ", strMo129413);
        String strM112203 = m11220();
        string = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005M11253.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(strM7113, strM112203, null, -1, string), strM7113, -1, strM112203, string, null);
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2080 mo11236() {
        return this.f15525.f19472;
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void mo11237(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final short m11238(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC8005 abstractC8005Mo11232 = mo11232(str);
        if (abstractC8005Mo11232 instanceof AbstractC7977) {
            AbstractC7977 abstractC7977 = (AbstractC7977) abstractC8005Mo11232;
            try {
                long jM12993 = AbstractC7997.m12993(abstractC7977);
                Short shValueOf = (-32768 > jM12993 || jM12993 > 32767) ? null : Short.valueOf((short) jM12993);
                if (shValueOf != null) {
                    return shValueOf.shortValue();
                }
                m11218(abstractC7977, "short", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                m11218(abstractC7977, "short", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C5229 c5229 = AbstractC5228.f13320;
        sb.append(c5229.mo9476(AbstractC7977.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c5229.mo9476(abstractC8005Mo11232.getClass()).getSimpleName());
        sb.append(" as the serialized body of short");
        String string = sb.toString();
        String strM11226 = m11226(str);
        String string2 = this.f15525.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11232.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(string, strM11226, null, -1, string2), string, -1, strM11226, string2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final long m11239(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC8005 abstractC8005Mo11232 = mo11232(str);
        if (abstractC8005Mo11232 instanceof AbstractC7977) {
            AbstractC7977 abstractC7977 = (AbstractC7977) abstractC8005Mo11232;
            try {
                return AbstractC7997.m12993(abstractC7977);
            } catch (IllegalArgumentException unused) {
                this.m11218(abstractC7977, "long", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C5229 c5229 = AbstractC5228.f13320;
        sb.append(c5229.mo9476(AbstractC7977.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c5229.mo9476(abstractC8005Mo11232.getClass()).getSimpleName());
        sb.append(" as the serialized body of long");
        String string = sb.toString();
        String strM11226 = m11226(str);
        String string2 = this.f15525.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11232.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(string, strM11226, null, -1, string2), string, -1, strM11226, string2, null);
    }

    @Override // p104.InterfaceC8007
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final AbstractC8005 mo11240() {
        return m11253();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final String m11241(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC8005 abstractC8005Mo11232 = mo11232(str);
        boolean z = abstractC8005Mo11232 instanceof AbstractC7977;
        AbstractC7988 abstractC7988 = this.f15525;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            C5229 c5229 = AbstractC5228.f13320;
            sb.append(c5229.mo9476(AbstractC7977.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c5229.mo9476(abstractC8005Mo11232.getClass()).getSimpleName());
            sb.append(" as the serialized body of string");
            String string = sb.toString();
            String strM11226 = m11226(str);
            String string2 = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11232.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC6339.m11317(string, strM11226, null, -1, string2), string, -1, strM11226, string2, null);
        }
        AbstractC7977 abstractC7977 = (AbstractC7977) abstractC8005Mo11232;
        if (!(abstractC7977 instanceof C7990)) {
            String strM718 = AbstractC0900.m718("Expected string value for a non-null key '", str, "', got null literal instead");
            String strM112262 = m11226(str);
            String string3 = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, m11253().toString()).toString() : null;
            throw new JsonDecodingException(AbstractC6339.m11317(strM718, strM112262, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", -1, string3), strM718, -1, strM112262, string3, "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.");
        }
        C7990 c7990 = (C7990) abstractC7977;
        if (c7990.f19476 || abstractC7988.f19473.f19500) {
            return c7990.f19475;
        }
        String strM7182 = AbstractC0900.m718("String literal for value of key '", str, "' should be quoted");
        String strM112263 = m11226(str);
        String string4 = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, m11253().toString()).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(strM7182, strM112263, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", -1, string4), strM7182, -1, strM112263, string4, "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public String mo11242(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return interfaceC8020.mo12938(i);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final float m11243(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC8005 abstractC8005Mo11232 = mo11232(str);
        boolean z = abstractC8005Mo11232 instanceof AbstractC7977;
        AbstractC7988 abstractC7988 = this.f15525;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            C5229 c5229 = AbstractC5228.f13320;
            sb.append(c5229.mo9476(AbstractC7977.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c5229.mo9476(abstractC8005Mo11232.getClass()).getSimpleName());
            sb.append(" as the serialized body of float");
            String string = sb.toString();
            String strM11226 = m11226(str);
            String string2 = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11232.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC6339.m11317(string, strM11226, null, -1, string2), string, -1, strM11226, string2, null);
        }
        AbstractC7977 abstractC7977 = (AbstractC7977) abstractC8005Mo11232;
        try {
            C7917 c7917 = AbstractC7997.f19482;
            float f = Float.parseFloat(abstractC7977.mo12982());
            C8006 c8006 = abstractC7988.f19473;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            String strM11308 = AbstractC6339.m11308(Float.valueOf(f), str);
            String string3 = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, m11253().toString()).toString() : null;
            throw new JsonDecodingException(AbstractC6339.m11317(strM11308, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", -1, string3), strM11308, -1, null, string3, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        } catch (IllegalArgumentException unused) {
            m11218(abstractC7977, "float", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final double m11244(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC8005 abstractC8005Mo11232 = mo11232(str);
        boolean z = abstractC8005Mo11232 instanceof AbstractC7977;
        AbstractC7988 abstractC7988 = this.f15525;
        if (!z) {
            StringBuilder sb = new StringBuilder("Expected ");
            C5229 c5229 = AbstractC5228.f13320;
            sb.append(c5229.mo9476(AbstractC7977.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c5229.mo9476(abstractC8005Mo11232.getClass()).getSimpleName());
            sb.append(" as the serialized body of double");
            String string = sb.toString();
            String strM11226 = m11226(str);
            String string2 = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11232.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC6339.m11317(string, strM11226, null, -1, string2), string, -1, strM11226, string2, null);
        }
        AbstractC7977 abstractC7977 = (AbstractC7977) abstractC8005Mo11232;
        try {
            C7917 c7917 = AbstractC7997.f19482;
            double d = Double.parseDouble(abstractC7977.mo12982());
            C8006 c8006 = abstractC7988.f19473;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            String strM11308 = AbstractC6339.m11308(Double.valueOf(d), str);
            String string3 = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, m11253().toString()).toString() : null;
            throw new JsonDecodingException(AbstractC6339.m11317(strM11308, null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", -1, string3), strM11308, -1, null, string3, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        } catch (IllegalArgumentException unused) {
            m11218(abstractC7977, "double", str);
            throw null;
        }
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String mo11245(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return m11241(m11225(interfaceC8020, i));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final int m11246(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC8005 abstractC8005Mo11232 = mo11232(str);
        if (abstractC8005Mo11232 instanceof AbstractC7977) {
            AbstractC7977 abstractC7977 = (AbstractC7977) abstractC8005Mo11232;
            try {
                long jM12993 = AbstractC7997.m12993(abstractC7977);
                Integer numValueOf = (-2147483648L > jM12993 || jM12993 > 2147483647L) ? null : Integer.valueOf((int) jM12993);
                if (numValueOf != null) {
                    return numValueOf.intValue();
                }
                m11218(abstractC7977, "int", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                m11218(abstractC7977, "int", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C5229 c5229 = AbstractC5228.f13320;
        sb.append(c5229.mo9476(AbstractC7977.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c5229.mo9476(abstractC8005Mo11232.getClass()).getSimpleName());
        sb.append(" as the serialized body of int");
        String string = sb.toString();
        String strM11226 = m11226(str);
        String string2 = this.f15525.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11232.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(string, strM11226, null, -1, string2), string, -1, strM11226, string2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final InterfaceC8016 m11247(Object obj, InterfaceC8020 interfaceC8020) {
        String str = (String) obj;
        str.getClass();
        interfaceC8020.getClass();
        if (!AbstractC6318.m11202(interfaceC8020)) {
            this.f15526.add(str);
            return this;
        }
        AbstractC8005 abstractC8005Mo11232 = mo11232(str);
        String strMo12941 = interfaceC8020.mo12941();
        boolean z = abstractC8005Mo11232 instanceof AbstractC7977;
        AbstractC7988 abstractC7988 = this.f15525;
        if (z) {
            return new C6341(AbstractC6339.m11301(abstractC7988, ((AbstractC7977) abstractC8005Mo11232).mo12982()), abstractC7988);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C5229 c5229 = AbstractC5228.f13320;
        sb.append(c5229.mo9476(AbstractC7977.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c5229.mo9476(abstractC8005Mo11232.getClass()).getSimpleName());
        String strM711 = AbstractC0900.m711(sb, " as the serialized body of ", strMo12941);
        String strM11226 = m11226(str);
        String string = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11232.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(strM711, strM11226, null, -1, string), strM711, -1, strM11226, string, null);
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final InterfaceC8016 mo11248(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        if (AbstractC5176.m9371(this.f15526) != null) {
            return m11247(m11222(), interfaceC8020);
        }
        return new C6332(this.f15525, mo11223(), this.f15523).mo11248(interfaceC8020);
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final char mo11249() {
        return m11252(m11222());
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean mo11250() {
        return m11254(m11222());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final byte m11251(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC8005 abstractC8005Mo11232 = mo11232(str);
        if (abstractC8005Mo11232 instanceof AbstractC7977) {
            AbstractC7977 abstractC7977 = (AbstractC7977) abstractC8005Mo11232;
            try {
                long jM12993 = AbstractC7997.m12993(abstractC7977);
                Byte bValueOf = (-128 > jM12993 || jM12993 > 127) ? null : Byte.valueOf((byte) jM12993);
                if (bValueOf != null) {
                    return bValueOf.byteValue();
                }
                m11218(abstractC7977, "byte", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                m11218(abstractC7977, "byte", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C5229 c5229 = AbstractC5228.f13320;
        sb.append(c5229.mo9476(AbstractC7977.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c5229.mo9476(abstractC8005Mo11232.getClass()).getSimpleName());
        sb.append(" as the serialized body of byte");
        String string = sb.toString();
        String strM11226 = m11226(str);
        String string2 = this.f15525.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11232.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(string, strM11226, null, -1, string2), string, -1, strM11226, string2, null);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final char m11252(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC8005 abstractC8005Mo11232 = mo11232(str);
        if (!(abstractC8005Mo11232 instanceof AbstractC7977)) {
            StringBuilder sb = new StringBuilder("Expected ");
            C5229 c5229 = AbstractC5228.f13320;
            sb.append(c5229.mo9476(AbstractC7977.class).getSimpleName());
            sb.append(", but had ");
            sb.append(c5229.mo9476(abstractC8005Mo11232.getClass()).getSimpleName());
            sb.append(" as the serialized body of char");
            String string = sb.toString();
            String strM11226 = m11226(str);
            String string2 = this.f15525.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11232.toString()).toString() : null;
            throw new JsonDecodingException(AbstractC6339.m11317(string, strM11226, null, -1, string2), string, -1, strM11226, string2, null);
        }
        AbstractC7977 abstractC7977 = (AbstractC7977) abstractC8005Mo11232;
        try {
            String strMo12982 = abstractC7977.mo12982();
            strMo12982.getClass();
            int length = strMo12982.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strMo12982.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            m11218(abstractC7977, "char", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final AbstractC8005 m11253() {
        AbstractC8005 abstractC8005Mo11232;
        String str = (String) AbstractC5176.m9371(this.f15526);
        return (str == null || (abstractC8005Mo11232 = mo11232(str)) == null) ? mo11223() : abstractC8005Mo11232;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean m11254(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC8005 abstractC8005Mo11232 = mo11232(str);
        if (abstractC8005Mo11232 instanceof AbstractC7977) {
            AbstractC7977 abstractC7977 = (AbstractC7977) abstractC8005Mo11232;
            try {
                Boolean boolM12989 = AbstractC7997.m12989(abstractC7977);
                if (boolM12989 != null) {
                    return boolM12989.booleanValue();
                }
                m11218(abstractC7977, "boolean", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                m11218(abstractC7977, "boolean", str);
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C5229 c5229 = AbstractC5228.f13320;
        sb.append(c5229.mo9476(AbstractC7977.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c5229.mo9476(abstractC8005Mo11232.getClass()).getSimpleName());
        sb.append(" as the serialized body of boolean");
        String string = sb.toString();
        String strM11226 = m11226(str);
        String string2 = this.f15525.f19473.f19506 ? AbstractC6339.m11310(-1, abstractC8005Mo11232.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC6339.m11317(string, strM11226, null, -1, string2), string, -1, strM11226, string2, null);
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
    public final double mo11255() {
        return m11244(m11222());
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲楪兰, reason: contains not printable characters */
    public final float mo11256() {
        return m11243(m11222());
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏世楪兰哲, reason: contains not printable characters */
    public final short mo11257() {
        return m11238(m11222());
    }

    @Override // p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰世哲, reason: contains not printable characters */
    public final long mo11258(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        return m11239(m11225(interfaceC8020, i));
    }

    @Override // p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲兰世, reason: contains not printable characters */
    public final byte mo11259() {
        return m11251(m11222());
    }
}
