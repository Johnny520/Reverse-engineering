package p087;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC5186;
import kotlin.InterfaceC5183;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4338;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.reflect.jvm.internal.types.AbstractC4921;
import p030.InterfaceC6307;
import p052.InterfaceC6542;
import p089.InterfaceC7183;
import p091.C7197;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C7128 implements InterfaceC7190, InterfaceC7119 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List[] f19071;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String[] f19072;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f19073 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f19074;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7078 f19075;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f19076;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Map f19077;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean[] f19078;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC5183 f19079;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC5183 f19080;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC5183 f19081;

    public C7128(String str, InterfaceC7078 interfaceC7078, int i) {
        this.f19076 = str;
        this.f19075 = interfaceC7078;
        this.f19074 = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.f19072 = strArr;
        int i4 = this.f19074;
        this.f19071 = new List[i4];
        this.f19078 = new boolean[i4];
        this.f19077 = AbstractC4338.m8781();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f19080 = AbstractC5186.m10211(lazyThreadSafetyMode, new InterfaceC6542(this) { // from class: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7128 f19110;

            {
                this.f19110 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                InterfaceC7183[] interfaceC7183ArrChildSerializers;
                ArrayList arrayList;
                InterfaceC7183[] interfaceC7183ArrTypeParametersSerializers;
                int i5 = i2;
                C7128 c7128 = this.f19110;
                switch (i5) {
                    case 0:
                        InterfaceC7078 interfaceC70782 = c7128.f19075;
                        return (interfaceC70782 == null || (interfaceC7183ArrChildSerializers = interfaceC70782.childSerializers()) == null) ? AbstractC7143.f19108 : interfaceC7183ArrChildSerializers;
                    case 1:
                        InterfaceC7078 interfaceC70783 = c7128.f19075;
                        if (interfaceC70783 == null || (interfaceC7183ArrTypeParametersSerializers = interfaceC70783.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC7183ArrTypeParametersSerializers.length);
                            for (InterfaceC7183 interfaceC7183 : interfaceC7183ArrTypeParametersSerializers) {
                                arrayList.add(interfaceC7183.getDescriptor());
                            }
                        }
                        return AbstractC7143.m12387(arrayList);
                    default:
                        return Integer.valueOf(AbstractC7143.m12385(c7128, (InterfaceC7190[]) c7128.f19081.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.f19081 = AbstractC5186.m10211(lazyThreadSafetyMode, new InterfaceC6542(this) { // from class: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7128 f19110;

            {
                this.f19110 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                InterfaceC7183[] interfaceC7183ArrChildSerializers;
                ArrayList arrayList;
                InterfaceC7183[] interfaceC7183ArrTypeParametersSerializers;
                int i52 = i5;
                C7128 c7128 = this.f19110;
                switch (i52) {
                    case 0:
                        InterfaceC7078 interfaceC70782 = c7128.f19075;
                        return (interfaceC70782 == null || (interfaceC7183ArrChildSerializers = interfaceC70782.childSerializers()) == null) ? AbstractC7143.f19108 : interfaceC7183ArrChildSerializers;
                    case 1:
                        InterfaceC7078 interfaceC70783 = c7128.f19075;
                        if (interfaceC70783 == null || (interfaceC7183ArrTypeParametersSerializers = interfaceC70783.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC7183ArrTypeParametersSerializers.length);
                            for (InterfaceC7183 interfaceC7183 : interfaceC7183ArrTypeParametersSerializers) {
                                arrayList.add(interfaceC7183.getDescriptor());
                            }
                        }
                        return AbstractC7143.m12387(arrayList);
                    default:
                        return Integer.valueOf(AbstractC7143.m12385(c7128, (InterfaceC7190[]) c7128.f19081.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.f19079 = AbstractC5186.m10211(lazyThreadSafetyMode, new InterfaceC6542(this) { // from class: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7128 f19110;

            {
                this.f19110 = this;
            }

            @Override // p052.InterfaceC6542
            public final Object invoke() {
                InterfaceC7183[] interfaceC7183ArrChildSerializers;
                ArrayList arrayList;
                InterfaceC7183[] interfaceC7183ArrTypeParametersSerializers;
                int i52 = i6;
                C7128 c7128 = this.f19110;
                switch (i52) {
                    case 0:
                        InterfaceC7078 interfaceC70782 = c7128.f19075;
                        return (interfaceC70782 == null || (interfaceC7183ArrChildSerializers = interfaceC70782.childSerializers()) == null) ? AbstractC7143.f19108 : interfaceC7183ArrChildSerializers;
                    case 1:
                        InterfaceC7078 interfaceC70783 = c7128.f19075;
                        if (interfaceC70783 == null || (interfaceC7183ArrTypeParametersSerializers = interfaceC70783.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC7183ArrTypeParametersSerializers.length);
                            for (InterfaceC7183 interfaceC7183 : interfaceC7183ArrTypeParametersSerializers) {
                                arrayList.add(interfaceC7183.getDescriptor());
                            }
                        }
                        return AbstractC7143.m12387(arrayList);
                    default:
                        return Integer.valueOf(AbstractC7143.m12385(c7128, (InterfaceC7190[]) c7128.f19081.getValue()));
                }
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7128) {
            InterfaceC7190 interfaceC7190 = (InterfaceC7190) obj;
            if (this.f19076.equals(interfaceC7190.mo12355()) && Arrays.equals((InterfaceC7190[]) this.f19081.getValue(), (InterfaceC7190[]) ((C7128) obj).f19081.getValue())) {
                int iMo12353 = interfaceC7190.mo12353();
                int i = this.f19074;
                if (i == iMo12353) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (AbstractC4394.m8917(mo12356(i2).mo12355(), interfaceC7190.mo12356(i2).mo12355()) && AbstractC4394.m8917(mo12356(i2).getKind(), interfaceC7190.mo12356(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p091.InterfaceC7190
    public final List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    @Override // p091.InterfaceC7190
    public AbstractC4921 getKind() {
        return C7197.f19213;
    }

    public int hashCode() {
        return ((Number) this.f19079.getValue()).intValue();
    }

    public String toString() {
        return AbstractC7143.m12392(this);
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12352(int i) {
        return this.f19072[i];
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12353() {
        return this.f19074;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12354(String str) {
        str.getClass();
        Integer num = (Integer) this.f19077.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p087.InterfaceC7119
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo12378() {
        return this.f19077.keySet();
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12355() {
        return this.f19076;
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public InterfaceC7190 mo12356(int i) {
        return ((InterfaceC7183[]) this.f19080.getValue())[i].getDescriptor();
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12357(int i) {
        List list = this.f19071[i];
        return list == null ? EmptyList.INSTANCE : list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m12381(InterfaceC6307 interfaceC6307) {
        int i = this.f19073;
        List[] listArr = this.f19071;
        List arrayList = listArr[i];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            listArr[this.f19073] = arrayList;
        }
        arrayList.add(interfaceC6307);
    }

    @Override // p091.InterfaceC7190
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12358(int i) {
        return this.f19078[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m12382(String str, boolean z) {
        str.getClass();
        int i = this.f19073 + 1;
        this.f19073 = i;
        String[] strArr = this.f19072;
        strArr[i] = str;
        this.f19078[i] = z;
        this.f19071[i] = null;
        if (i == this.f19074 - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.f19077 = map;
        }
    }
}
