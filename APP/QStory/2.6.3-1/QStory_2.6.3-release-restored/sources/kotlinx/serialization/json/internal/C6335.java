package kotlinx.serialization.json.internal;

import androidx.activity.AbstractC0900;
import androidx.activity.compose.C0851;
import androidx.core.view.C3075;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.AbstractC5171;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlinx.serialization.json.JsonDecodingException;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p104.AbstractC7988;
import p104.AbstractC8005;
import p104.C7981;
import p106.InterfaceC8018;
import p107.C8022;
import p107.InterfaceC8020;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C6335 extends AbstractC6324 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public int f15565;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public boolean f15566;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C7981 f15567;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC8020 f15568;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6335(AbstractC7988 abstractC7988, C7981 c7981, String str, InterfaceC8020 interfaceC8020) {
        super(abstractC7988, str);
        abstractC7988.getClass();
        c7981.getClass();
        this.f15567 = c7981;
        this.f15568 = interfaceC8020;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6324, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final boolean mo11217() {
        return !this.f15566 && super.mo11217();
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6324
    /* JADX INFO: renamed from: 飘花落叶言子世哲苏楪兰, reason: merged with bridge method [inline-methods] */
    public C7981 mo11223() {
        return this.f15567;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6324
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public AbstractC8005 mo11232(String str) {
        str.getClass();
        return (AbstractC8005) AbstractC5171.m9332(str, mo11223());
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6324, p106.InterfaceC8016
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final InterfaceC8018 mo11235(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        InterfaceC8020 interfaceC80202 = this.f15568;
        if (interfaceC8020 != interfaceC80202) {
            return super.mo11235(interfaceC8020);
        }
        AbstractC8005 abstractC8005M11253 = m11253();
        String strMo12941 = interfaceC80202.mo12941();
        boolean z = abstractC8005M11253 instanceof C7981;
        AbstractC7988 abstractC7988 = this.f15525;
        if (z) {
            return new C6335(abstractC7988, (C7981) abstractC8005M11253, this.f15523, interfaceC80202);
        }
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

    @Override // kotlinx.serialization.json.internal.AbstractC6324, p106.InterfaceC8018
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public void mo11237(InterfaceC8020 interfaceC8020) {
        Set setM13613;
        interfaceC8020.getClass();
        AbstractC7988 abstractC7988 = this.f15525;
        if (AbstractC6339.m11307(abstractC7988, interfaceC8020) || (interfaceC8020.getKind() instanceof C8022)) {
            return;
        }
        AbstractC6339.m11311(abstractC7988, interfaceC8020);
        if (this.f15522.f19503) {
            Set setM12974 = AbstractC7973.m12974(interfaceC8020);
            C3075 c3075 = abstractC7988.f19471;
            c3075.getClass();
            Map map = (Map) ((ConcurrentHashMap) c3075.f6882).get(interfaceC8020);
            Object obj = map != null ? map.get(AbstractC6339.f15575) : null;
            if (obj == null) {
                obj = null;
            }
            Map map2 = (Map) obj;
            Set setKeySet = map2 != null ? map2.keySet() : null;
            if (setKeySet == null) {
                setKeySet = EmptySet.INSTANCE;
            }
            setM13613 = AbstractC8568.m13613(setM12974, setKeySet);
        } else {
            setM13613 = AbstractC7973.m12974(interfaceC8020);
        }
        for (String str : mo11223().f19461.keySet()) {
            if (!setM13613.contains(str) && !AbstractC5227.m9466(str, this.f15523)) {
                String strM12149 = AbstractC7012.m12149('\'', "Encountered an unknown key '", str);
                String strM11220 = m11220();
                String string = abstractC7988.f19473.f19506 ? AbstractC6339.m11310(-1, mo11223().toString()).toString() : null;
                throw new JsonDecodingException(AbstractC6339.m11317(strM12149, strM11220, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", -1, string), strM12149, -1, strM11220, string, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public int mo11277(InterfaceC8020 interfaceC8020) {
        interfaceC8020.getClass();
        while (this.f15565 < interfaceC8020.mo12939()) {
            int i = this.f15565;
            this.f15565 = i + 1;
            String strM11225 = m11225(interfaceC8020, i);
            int i2 = this.f15565 - 1;
            this.f15566 = false;
            if (!mo11223().containsKey(strM11225)) {
                boolean z = (this.f15525.f19473.f19498 || interfaceC8020.mo12944(i2) || !interfaceC8020.mo12942(i2).mo12969()) ? false : true;
                this.f15566 = z;
                if (z) {
                }
            }
            this.f15522.getClass();
            return i2;
        }
        return -1;
    }

    @Override // kotlinx.serialization.json.internal.AbstractC6324
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public String mo11242(InterfaceC8020 interfaceC8020, int i) throws NoSuchMethodException {
        interfaceC8020.getClass();
        AbstractC7988 abstractC7988 = this.f15525;
        AbstractC6339.m11311(abstractC7988, interfaceC8020);
        String strMo12938 = interfaceC8020.mo12938(i);
        if (this.f15522.f19503 && !mo11223().f19461.keySet().contains(strMo12938)) {
            C3075 c3075 = abstractC7988.f19471;
            C0851 c0851 = new C0851(interfaceC8020, 9, abstractC7988);
            c3075.getClass();
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) c3075.f6882;
            Map map = (Map) concurrentHashMap.get(interfaceC8020);
            Object obj = null;
            C6340 c6340 = AbstractC6339.f15575;
            Object objInvoke = map != null ? map.get(c6340) : null;
            if (objInvoke == null) {
                objInvoke = null;
            }
            if (objInvoke == null) {
                objInvoke = c0851.invoke();
                Object concurrentHashMap2 = concurrentHashMap.get(interfaceC8020);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(interfaceC8020, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(c6340, objInvoke);
            }
            Map map2 = (Map) objInvoke;
            Iterator it = mo11223().f19461.keySet().iterator();
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
        return strMo12938;
    }

    public /* synthetic */ C6335(AbstractC7988 abstractC7988, C7981 c7981, String str, int i) {
        this(abstractC7988, c7981, (i & 4) != 0 ? null : str, (InterfaceC8020) null);
    }
}
