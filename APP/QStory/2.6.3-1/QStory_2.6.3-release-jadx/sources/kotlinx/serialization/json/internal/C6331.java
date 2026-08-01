package kotlinx.serialization.json.internal;

import androidx.collection.C1123;
import androidx.compose.foundation.C1905;
import androidx.compose.runtime.internal.C2080;
import io.ktor.util.C5043;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.collections.AbstractC5176;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.AbstractC5894;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import p050.AbstractC7176;
import p068.InterfaceC7387;
import p103.C7917;
import p103.C7956;
import p104.AbstractC7988;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7986;
import p104.C7990;
import p104.C7992;
import p104.C8006;
import p104.InterfaceC7998;
import p105.C8011;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8017;
import p107.C8021;
import p107.C8022;
import p107.C8025;
import p107.C8027;
import p107.InterfaceC8020;
import p269.AbstractC9019;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6331 implements InterfaceC7998, InterfaceC8015, InterfaceC8017 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public String f15550;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final C8006 f15551;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public Object f15552;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public String f15553;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final /* synthetic */ int f15554;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final AbstractC7988 f15555;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC7387 f15556;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final ArrayList f15557;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C6331(AbstractC7988 abstractC7988, InterfaceC7387 interfaceC7387, int i) {
        this(abstractC7988, interfaceC7387, (char) 0);
        this.f15554 = i;
        abstractC7988.getClass();
        interfaceC7387.getClass();
        switch (i) {
            case 1:
                this(abstractC7988, interfaceC7387, (char) 0);
                this.f15552 = new LinkedHashMap();
                break;
            case 2:
                this(abstractC7988, interfaceC7387, (char) 0);
                this.f15552 = new ArrayList();
                break;
            default:
                this.f15557.add("primitive");
                break;
        }
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲楪苏 */
    public final void mo11204(int i) {
        String str = (String) m11286();
        str.getClass();
        mo11287(str, AbstractC7997.m12992(Integer.valueOf(i)));
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子世哲兰楪苏, reason: contains not printable characters */
    public final void mo11278(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        this.f15557.add(m11289(interfaceC8020, i));
        mo11264(interfaceC8013, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo11264(InterfaceC8013 interfaceC8013, Object obj) {
        String strM11312;
        InterfaceC8013 interfaceC8013M10603;
        interfaceC8013.getClass();
        Object objM9371 = AbstractC5176.m9371(this.f15557);
        AbstractC7988 abstractC7988 = this.f15555;
        if (objM9371 == null) {
            InterfaceC8020 interfaceC8020M11299 = AbstractC6339.m11299(interfaceC8013.getDescriptor(), abstractC7988.f19472);
            if ((interfaceC8020M11299.getKind() instanceof C8021) || interfaceC8020M11299.getKind() == C8025.f19550) {
                new C6331(abstractC7988, this.f15556, 0).mo11264(interfaceC8013, obj);
                return;
            }
        }
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
            this.f15550 = strM11312;
            this.f15553 = strMo12941;
        }
        interfaceC8013M10603.serialize(this, obj);
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: contains not printable characters */
    public final void mo11279(C7956 c7956, int i, char c) {
        c7956.getClass();
        mo11287(m11289(c7956, i), AbstractC7997.m12991(String.valueOf(c)));
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
    public final void mo11280(C7956 c7956, int i, byte b) {
        c7956.getClass();
        mo11287(m11289(c7956, i), AbstractC7997.m12992(Byte.valueOf(b)));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final void mo11265(InterfaceC8020 interfaceC8020, int i) {
        interfaceC8020.getClass();
        String str = (String) m11286();
        str.getClass();
        mo11287(str, AbstractC7997.m12991(interfaceC8020.mo12938(i)));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final void mo11266(char c) {
        String str = (String) m11286();
        str.getClass();
        mo11287(str, AbstractC7997.m12991(String.valueOf(c)));
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
    public final void mo11281(InterfaceC8020 interfaceC8020, int i, long j) {
        interfaceC8020.getClass();
        mo11287(m11289(interfaceC8020, i), AbstractC7997.m12992(Long.valueOf(j)));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final void mo11268() {
        String str = (String) AbstractC5176.m9371(this.f15557);
        if (str == null) {
            this.f15556.invoke(C7992.INSTANCE);
        } else {
            mo11287(str, C7992.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m11282(Object obj, double d) {
        String str = (String) obj;
        str.getClass();
        mo11287(str, AbstractC7997.m12992(Double.valueOf(d)));
        this.f15551.getClass();
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw AbstractC6339.m11303(Double.valueOf(d), str);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m11283(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        interfaceC8020.getClass();
        interfaceC8013.getClass();
        this.f15557.add(m11289(interfaceC8020, i));
        m12995(interfaceC8013, obj);
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8017 mo11269(InterfaceC8020 interfaceC8020) {
        C6331 c6331;
        interfaceC8020.getClass();
        InterfaceC7387 c1905 = AbstractC5176.m9371(this.f15557) == null ? this.f15556 : new C1905(this, 25);
        AbstractC9019 kind = interfaceC8020.getKind();
        boolean zM9466 = AbstractC5227.m9466(kind, C8027.f19555);
        AbstractC7988 abstractC7988 = this.f15555;
        if (zM9466 || (kind instanceof C8022)) {
            c6331 = new C6331(abstractC7988, c1905, 2);
        } else if (AbstractC5227.m9466(kind, C8027.f19553)) {
            InterfaceC8020 interfaceC8020M11299 = AbstractC6339.m11299(interfaceC8020.mo12942(0), abstractC7988.f19472);
            AbstractC9019 kind2 = interfaceC8020M11299.getKind();
            if (!(kind2 instanceof C8021) && !AbstractC5227.m9466(kind2, C8025.f19550)) {
                throw AbstractC6339.m11302(interfaceC8020M11299);
            }
            c1905.getClass();
            C6334 c6334 = new C6334(abstractC7988, c1905, 1);
            c6334.f15563 = true;
            c6331 = c6334;
        } else {
            c6331 = new C6331(abstractC7988, c1905, 1);
        }
        String str = this.f15550;
        if (str != null) {
            if (c6331 instanceof C6334) {
                C6334 c63342 = (C6334) c6331;
                c63342.mo11287("key", AbstractC7997.m12991(str));
                String strMo12941 = this.f15553;
                if (strMo12941 == null) {
                    strMo12941 = interfaceC8020.mo12941();
                }
                c63342.mo11287("value", AbstractC7997.m12991(strMo12941));
            } else {
                String strMo129412 = this.f15553;
                if (strMo129412 == null) {
                    strMo129412 = interfaceC8020.mo12941();
                }
                c6331.mo11287(str, AbstractC7997.m12991(strMo129412));
            }
            this.f15550 = null;
            this.f15553 = null;
        }
        return c6331;
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final C2080 mo11205() {
        return this.f15555.f19472;
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final void mo11270(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        if (!this.f15557.isEmpty()) {
            m11286();
        }
        this.f15556.invoke(mo11290());
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final void mo11284(C7956 c7956, int i, short s) {
        c7956.getClass();
        mo11287(m11289(c7956, i), AbstractC7997.m12992(Short.valueOf(s)));
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final void mo11285(C7956 c7956, int i, float f) {
        c7956.getClass();
        m11292(m11289(c7956, i), f);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final Object m11286() {
        ArrayList arrayList = this.f15557;
        if (arrayList.isEmpty()) {
            throw new SerializationException("No tag in stack for requested element");
        }
        return arrayList.remove(AbstractC7176.m12460(arrayList));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public void mo11287(String str, AbstractC8005 abstractC8005) {
        int i = this.f15554;
        str.getClass();
        abstractC8005.getClass();
        switch (i) {
            case 0:
                if (str != "primitive") {
                    C6755.m11869("This output can only consume primitives with 'primitive' tag");
                } else if (((AbstractC8005) this.f15552) != null) {
                    C6755.m11869("Primitive element was already recorded. Does call to .encodeXxx happen more than once?");
                } else {
                    this.f15552 = abstractC8005;
                    this.f15556.invoke(abstractC8005);
                }
                break;
            case 1:
                ((LinkedHashMap) this.f15552).put(str, abstractC8005);
                break;
            default:
                ((ArrayList) this.f15552).add(Integer.parseInt(str), abstractC8005);
                break;
        }
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo11271(float f) {
        m11292(m11286(), f);
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final boolean mo11272(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        return this.f15551.f19502;
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final void mo11288(int i, int i2, InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        mo11287(m11289(interfaceC8020, i), AbstractC7997.m12992(Integer.valueOf(i2)));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰 */
    public final void mo11273(boolean z) {
        String str = (String) m11286();
        str.getClass();
        Boolean boolValueOf = Boolean.valueOf(z);
        C7917 c7917 = AbstractC7997.f19482;
        mo11287(str, new C7990(boolValueOf, false, null));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final String m11289(InterfaceC8020 interfaceC8020, int i) {
        String strValueOf;
        interfaceC8020.getClass();
        int i2 = this.f15554;
        interfaceC8020.getClass();
        switch (i2) {
            case 2:
                strValueOf = String.valueOf(i);
                break;
            default:
                AbstractC7988 abstractC7988 = this.f15555;
                abstractC7988.getClass();
                AbstractC6339.m11311(abstractC7988, interfaceC8020);
                strValueOf = interfaceC8020.mo12938(i);
                break;
        }
        strValueOf.getClass();
        return strValueOf;
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public void mo11274(InterfaceC8020 interfaceC8020, int i, InterfaceC8013 interfaceC8013, Object obj) {
        switch (this.f15554) {
            case 1:
                interfaceC8020.getClass();
                interfaceC8013.getClass();
                if (obj != null || this.f15551.f19498) {
                    m11283(interfaceC8020, i, interfaceC8013, obj);
                }
                break;
            default:
                m11283(interfaceC8020, i, interfaceC8013, obj);
                break;
        }
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final InterfaceC8015 mo11275(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        if (AbstractC5176.m9371(this.f15557) == null) {
            return new C6331(this.f15555, this.f15556, 0).mo11275(interfaceC8020);
        }
        if (this.f15550 != null) {
            this.f15553 = interfaceC8020.mo12941();
        }
        return m11291(m11286(), interfaceC8020);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public AbstractC8005 mo11290() {
        switch (this.f15554) {
            case 0:
                AbstractC8005 abstractC8005 = (AbstractC8005) this.f15552;
                if (abstractC8005 != null) {
                    return abstractC8005;
                }
                C6755.m11869("Primitive element has not been recorded. Is call to .encodeXxx is missing in serializer?");
                return null;
            case 1:
                return new C7981((LinkedHashMap) this.f15552);
            default:
                return new C7986((ArrayList) this.f15552);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final InterfaceC8015 m11291(Object obj, InterfaceC8020 interfaceC8020) {
        String str = (String) obj;
        str.getClass();
        interfaceC8020.getClass();
        if (AbstractC6318.m11202(interfaceC8020)) {
            return new C6323(this, str);
        }
        if (interfaceC8020.isInline() && interfaceC8020.equals(AbstractC7997.f19482)) {
            return new C6323(this, str, interfaceC8020);
        }
        this.f15557.add(str);
        return this;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final void m11292(Object obj, float f) {
        String str = (String) obj;
        str.getClass();
        mo11287(str, AbstractC7997.m12992(Float.valueOf(f)));
        this.f15551.getClass();
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw AbstractC6339.m11303(Float.valueOf(f), str);
        }
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC8015 mo11293(C7956 c7956, int i) {
        c7956.getClass();
        return m11291(m11289(c7956, i), c7956.mo12942(i));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世 */
    public final void mo11206(byte b) {
        String str = (String) m11286();
        str.getClass();
        mo11287(str, AbstractC7997.m12992(Byte.valueOf(b)));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final void mo11276(double d) {
        m11282(m11286(), d);
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世 */
    public final void mo11207(short s) {
        String str = (String) m11286();
        str.getClass();
        mo11287(str, AbstractC7997.m12992(Short.valueOf(s)));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo11208(String str) {
        str.getClass();
        String str2 = (String) m11286();
        str2.getClass();
        mo11287(str2, AbstractC7997.m12991(str));
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲, reason: contains not printable characters */
    public final void mo11294(InterfaceC8020 interfaceC8020, int i, String str) {
        interfaceC8020.getClass();
        str.getClass();
        mo11287(m11289(interfaceC8020, i), AbstractC7997.m12991(str));
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
    public final void mo11295(C7956 c7956, int i, double d) {
        c7956.getClass();
        m11282(m11289(c7956, i), d);
    }

    @Override // p106.InterfaceC8017
    /* JADX INFO: renamed from: 飘花落叶言子苏楪兰哲世, reason: contains not printable characters */
    public final void mo11296(InterfaceC8020 interfaceC8020, int i, boolean z) {
        interfaceC8020.getClass();
        String strM11289 = m11289(interfaceC8020, i);
        Boolean boolValueOf = Boolean.valueOf(z);
        C7917 c7917 = AbstractC7997.f19482;
        mo11287(strM11289, new C7990(boolValueOf, false, null));
    }

    @Override // p106.InterfaceC8015
    /* JADX INFO: renamed from: 飘花落叶言子苏楪哲世兰 */
    public final void mo11210(long j) {
        String str = (String) m11286();
        str.getClass();
        mo11287(str, AbstractC7997.m12992(Long.valueOf(j)));
    }

    public C6331(AbstractC7988 abstractC7988, InterfaceC7387 interfaceC7387, char c) {
        this.f15557 = new ArrayList();
        this.f15555 = abstractC7988;
        this.f15556 = interfaceC7387;
        this.f15551 = abstractC7988.f19473;
    }
}
