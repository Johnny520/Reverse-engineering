package kotlinx.serialization.json.internal;

import androidx.activity.AbstractC0053;
import androidx.activity.compose.C0004;
import androidx.compose.foundation.draganddrop.AbstractC0455;
import androidx.core.view.C2242;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC4338;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.jvm.internal.C4396;
import kotlinx.serialization.json.JsonDecodingException;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p088.AbstractC7158;
import p088.AbstractC7175;
import p088.C7151;
import p090.InterfaceC7188;
import p091.C7192;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C5502 extends AbstractC5491 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f15220;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f15221;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C7151 f15222;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC7190 f15223;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5502(AbstractC7158 abstractC7158, C7151 c7151, String str, InterfaceC7190 interfaceC7190) {
        super(abstractC7158, str);
        abstractC7158.getClass();
        c7151.getClass();
        this.f15222 = c7151;
        this.f15223 = interfaceC7190;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5491, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final boolean mo6865() {
        return !this.f15221 && super.mo6865();
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5491
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: merged with bridge method [inline-methods] */
    public C7151 mo10648() {
        return this.f15222;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5491
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public AbstractC7175 mo10651(String str) {
        str.getClass();
        return (AbstractC7175) AbstractC4338.m8780(str, mo10648());
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5491, p090.InterfaceC7186
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC7188 mo6876(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        InterfaceC7190 interfaceC71902 = this.f15223;
        if (interfaceC7190 != interfaceC71902) {
            return super.mo6876(interfaceC7190);
        }
        AbstractC7175 abstractC7175M10664 = m10664();
        String strMo12355 = interfaceC71902.mo12355();
        boolean z = abstractC7175M10664 instanceof C7151;
        AbstractC7158 abstractC7158 = this.f15180;
        if (z) {
            return new C5502(abstractC7158, (C7151) abstractC7175M10664, this.f15178, interfaceC71902);
        }
        StringBuilder sb = new StringBuilder("Expected ");
        C4396 c4396 = AbstractC4395.f12971;
        sb.append(c4396.mo8927(C7151.class).getSimpleName());
        sb.append(", but had ");
        sb.append(c4396.mo8927(abstractC7175M10664.getClass()).getSimpleName());
        String strM146 = AbstractC0053.m146(sb, " as the serialized body of ", strMo12355);
        String strM10646 = m10646();
        String string = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, abstractC7175M10664.toString()).toString() : null;
        throw new JsonDecodingException(AbstractC5506.m10701(strM146, strM10646, null, -1, string), strM146, -1, strM10646, string, null);
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5491, p090.InterfaceC7188
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo6877(InterfaceC7190 interfaceC7190) {
        Set setM1156;
        interfaceC7190.getClass();
        AbstractC7158 abstractC7158 = this.f15180;
        if (AbstractC5506.m10691(abstractC7158, interfaceC7190) || (interfaceC7190.getKind() instanceof C7192)) {
            return;
        }
        AbstractC5506.m10695(abstractC7158, interfaceC7190);
        if (this.f15177.f19163) {
            Set setM12388 = AbstractC7143.m12388(interfaceC7190);
            C2242 c2242 = abstractC7158.f19131;
            c2242.getClass();
            Map map = (Map) ((ConcurrentHashMap) c2242.f6536).get(interfaceC7190);
            Object obj = map != null ? map.get(AbstractC5506.f15230) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = EmptySet.INSTANCE;
            }
            setM1156 = AbstractC0455.m1156(setM12388, setKeySet);
        } else {
            setM1156 = AbstractC7143.m12388(interfaceC7190);
        }
        for (String str : mo10648().f19121.keySet()) {
            if (!setM1156.contains(str) && !AbstractC4394.m8917(str, this.f15178)) {
                String strM11558 = AbstractC6136.m11558('\'', "Encountered an unknown key '", str);
                String strM10646 = m10646();
                String string = abstractC7158.f19133.f19166 ? AbstractC5506.m10694(-1, mo10648().toString()).toString() : null;
                throw new JsonDecodingException(AbstractC5506.m10701(strM11558, strM10646, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", -1, string), strM11558, -1, strM10646, string, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo10672(InterfaceC7190 interfaceC7190) {
        interfaceC7190.getClass();
        while (this.f15220 < interfaceC7190.mo12353()) {
            int i = this.f15220;
            this.f15220 = i + 1;
            String strM10649 = m10649(interfaceC7190, i);
            int i2 = this.f15220 - 1;
            this.f15221 = false;
            if (!mo10648().containsKey(strM10649)) {
                boolean z = (this.f15180.f19133.f19158 || interfaceC7190.mo12358(i2) || !interfaceC7190.mo12356(i2).mo12383()) ? false : true;
                this.f15221 = z;
                if (z) {
                }
            }
            this.f15177.getClass();
            return i2;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC5491
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public String mo10657(InterfaceC7190 interfaceC7190, int i) throws NoSuchMethodException {
        interfaceC7190.getClass();
        AbstractC7158 abstractC7158 = this.f15180;
        AbstractC5506.m10695(abstractC7158, interfaceC7190);
        String strMo12352 = interfaceC7190.mo12352(i);
        if (this.f15177.f19163 && !mo10648().f19121.keySet().contains(strMo12352)) {
            C2242 c2242 = abstractC7158.f19131;
            C0004 c0004 = new C0004(interfaceC7190, 9, abstractC7158);
            c2242.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c2242.f6536;
            Map map = (Map) concurrentHashMap.get(interfaceC7190);
            Object obj = null;
            C5507 c5507 = AbstractC5506.f15230;
            Object objInvoke = map != null ? map.get(c5507) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = c0004.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(interfaceC7190);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(interfaceC7190, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(c5507, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            Iterator it = mo10648().f19121.keySet().iterator();
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
        return strMo12352;
    }

    public /* synthetic */ C5502(AbstractC7158 abstractC7158, C7151 c7151, String str, int i) {
        this(abstractC7158, c7151, (i & 4) != 0 ? null : str, (InterfaceC7190) null);
    }
}
