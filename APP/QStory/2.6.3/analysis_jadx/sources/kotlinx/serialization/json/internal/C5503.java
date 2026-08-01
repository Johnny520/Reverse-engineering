package kotlinx.serialization.json.internal;

import androidx.activity.AbstractC0053;
import androidx.activity.compose.C0004;
import androidx.core.view.C2242;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC4339;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.AbstractC4396;
import kotlin.jvm.internal.C4397;
import kotlinx.serialization.json.JsonDecodingException;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p088.AbstractC7159;
import p088.AbstractC7176;
import p088.C7152;
import p090.InterfaceC7189;
import p091.C7193;
import p091.InterfaceC7191;
import p175.AbstractC7739;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5503 extends AbstractC5492 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f15220;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f15221;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C7152 f15222;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC7191 f15223;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5503(AbstractC7159 abstractC7159, C7152 c7152, String str, InterfaceC7191 interfaceC7191) {
        super(abstractC7159, str);
        abstractC7159.getClass();
        c7152.getClass();
        this.f15222 = c7152;
        this.f15223 = interfaceC7191;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5492, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final boolean mo10658() {
        return !this.f15221 && super.mo10658();
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5492
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: merged with bridge method [inline-methods] */
    public C7152 mo10664() {
        return this.f15222;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5492
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public AbstractC7176 mo10673(String str) {
        str.getClass();
        return (AbstractC7176) AbstractC4339.m8773(str, mo10664());
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5492, p090.InterfaceC7187
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7189 mo10676(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        InterfaceC7191 interfaceC71912 = this.f15223;
        if (interfaceC7191 != interfaceC71912) {
            return super.mo10676(interfaceC7191);
        }
        AbstractC7176 abstractC7176M10694 = m10694();
        String strMo12382 = interfaceC71912.mo12382();
        boolean z = abstractC7176M10694 instanceof C7152;
        AbstractC7159 abstractC7159 = this.f15180;
        if (z) {
            return new C5503(abstractC7159, (C7152) abstractC7176M10694, this.f15178, interfaceC71912);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4397 c4397 = AbstractC4396.f12975;
        sb.append(c4397.mo8917(C7152.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4397.mo8917(abstractC7176M10694.getClass()).getSimpleName());
        String strM151 = AbstractC0053.m151(sb, " as the serialized body of ", strMo12382);
        String strM10661 = m10661();
        String string = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, abstractC7176M10694.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5507.m10758(strM151, strM10661, null, -1, string), strM151, -1, strM10661, string, null);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5492, p090.InterfaceC7189
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo10678(InterfaceC7191 interfaceC7191) {
        Set setM13054;
        interfaceC7191.getClass();
        AbstractC7159 abstractC7159 = this.f15180;
        if (AbstractC5507.m10748(abstractC7159, interfaceC7191) || (interfaceC7191.getKind() instanceof C7193)) {
            return;
        }
        AbstractC5507.m10752(abstractC7159, interfaceC7191);
        if (this.f15177.f19158) {
            Set setM12415 = AbstractC7144.m12415(interfaceC7191);
            C2242 c2242 = abstractC7159.f19126;
            c2242.getClass();
            Map map = (Map) ((ConcurrentHashMap) c2242.f6537).get(interfaceC7191);
            Object obj = map != null ? map.get(AbstractC5507.f15230) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = EmptySet.INSTANCE;
            }
            setM13054 = AbstractC7739.m13054(setM12415, setKeySet);
        } else {
            setM13054 = AbstractC7144.m12415(interfaceC7191);
        }
        for (String str : mo10664().f19116.keySet()) {
            if (!setM13054.contains(str) && !AbstractC4395.m8907(str, this.f15178)) {
                String strM11590 = AbstractC6183.m11590('\'', "Encountered an unknown key '", str);
                String strM10661 = m10661();
                String string = abstractC7159.f19128.f19161 ? AbstractC5507.m10751(-1, mo10664().toString()).toString() : null;
                throw new JsonDecodingException(AbstractC5507.m10758(strM11590, strM10661, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", -1, string), strM11590, -1, strM10661, string, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo10718(InterfaceC7191 interfaceC7191) {
        interfaceC7191.getClass();
        while (this.f15220 < interfaceC7191.mo12380()) {
            int i = this.f15220;
            this.f15220 = i + 1;
            String strM10666 = m10666(interfaceC7191, i);
            int i2 = this.f15220 - 1;
            this.f15221 = false;
            if (!mo10664().containsKey(strM10666)) {
                boolean z = (this.f15180.f19128.f19153 || interfaceC7191.mo12385(i2) || !interfaceC7191.mo12383(i2).mo12410()) ? false : true;
                this.f15221 = z;
                if (z) {
                }
            }
            this.f15177.getClass();
            return i2;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5492
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public String mo10683(InterfaceC7191 interfaceC7191, int i) throws NoSuchMethodException {
        interfaceC7191.getClass();
        AbstractC7159 abstractC7159 = this.f15180;
        AbstractC5507.m10752(abstractC7159, interfaceC7191);
        String strMo12379 = interfaceC7191.mo12379(i);
        if (this.f15177.f19158 && !mo10664().f19116.keySet().contains(strMo12379)) {
            C2242 c2242 = abstractC7159.f19126;
            C0004 c0004 = new C0004(interfaceC7191, 9, abstractC7159);
            c2242.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2242.f6537;
            Map map = (Map) concurrentHashMap.get(interfaceC7191);
            Object obj = null;
            C5508 c5508 = AbstractC5507.f15230;
            Object objInvoke = map != null ? map.get(c5508) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = c0004.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(interfaceC7191);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(interfaceC7191, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(c5508, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            Iterator it = mo10664().f19116.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                Integer num = (Integer) map2.get((String) next);
                if (num != null && num.intValue() == i) {
                    obj = next;
                    break;
                }
            }
            String str = (String) obj;
            if (str != null) {
                return str;
            }
        }
        return strMo12379;
    }

    public /* synthetic */ C5503(AbstractC7159 abstractC7159, C7152 c7152, String str, int i) {
        this(abstractC7159, c7152, (i & 4) != 0 ? null : str, (InterfaceC7191) null);
    }
}
