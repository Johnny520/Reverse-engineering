package p087;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC4339;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC4395;
import p031.InterfaceC6326;
import p052.InterfaceC6543;
import p089.InterfaceC7184;
import p091.C7198;
import p091.InterfaceC7191;
import p253.AbstractC8190;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7129 implements InterfaceC7191, InterfaceC7120 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List[] f19066;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String[] f19067;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f19068 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f19069;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7079 f19070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f19071;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Map f19072;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean[] f19073;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC5184 f19074;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC5184 f19075;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC5184 f19076;

    public C7129(String str, InterfaceC7079 interfaceC7079, int i) {
        this.f19071 = str;
        this.f19070 = interfaceC7079;
        this.f19069 = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.f19067 = strArr;
        int i4 = this.f19069;
        this.f19066 = new List[i4];
        this.f19073 = new boolean[i4];
        this.f19072 = AbstractC4339.m8776();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f19075 = AbstractC5187.m10215(lazyThreadSafetyMode, new InterfaceC6543(this) { // from class: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7129 f19105;

            {
                this.f19105 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                InterfaceC7184[] interfaceC7184ArrChildSerializers;
                ArrayList arrayList;
                InterfaceC7184[] interfaceC7184ArrTypeParametersSerializers;
                int i5 = i2;
                C7129 c7129 = this.f19105;
                switch (i5) {
                    case 0:
                        InterfaceC7079 interfaceC70792 = c7129.f19070;
                        return (interfaceC70792 == null || (interfaceC7184ArrChildSerializers = interfaceC70792.childSerializers()) == null) ? AbstractC7144.f19103 : interfaceC7184ArrChildSerializers;
                    case 1:
                        InterfaceC7079 interfaceC70793 = c7129.f19070;
                        if (interfaceC70793 == null || (interfaceC7184ArrTypeParametersSerializers = interfaceC70793.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC7184ArrTypeParametersSerializers.length);
                            for (InterfaceC7184 interfaceC7184 : interfaceC7184ArrTypeParametersSerializers) {
                                arrayList.add(interfaceC7184.getDescriptor());
                            }
                        }
                        return AbstractC7144.m12414(arrayList);
                    default:
                        return Integer.valueOf(AbstractC7144.m12412(c7129, (InterfaceC7191[]) c7129.f19076.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.f19076 = AbstractC5187.m10215(lazyThreadSafetyMode, new InterfaceC6543(this) { // from class: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7129 f19105;

            {
                this.f19105 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                InterfaceC7184[] interfaceC7184ArrChildSerializers;
                ArrayList arrayList;
                InterfaceC7184[] interfaceC7184ArrTypeParametersSerializers;
                int i52 = i5;
                C7129 c7129 = this.f19105;
                switch (i52) {
                    case 0:
                        InterfaceC7079 interfaceC70792 = c7129.f19070;
                        return (interfaceC70792 == null || (interfaceC7184ArrChildSerializers = interfaceC70792.childSerializers()) == null) ? AbstractC7144.f19103 : interfaceC7184ArrChildSerializers;
                    case 1:
                        InterfaceC7079 interfaceC70793 = c7129.f19070;
                        if (interfaceC70793 == null || (interfaceC7184ArrTypeParametersSerializers = interfaceC70793.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC7184ArrTypeParametersSerializers.length);
                            for (InterfaceC7184 interfaceC7184 : interfaceC7184ArrTypeParametersSerializers) {
                                arrayList.add(interfaceC7184.getDescriptor());
                            }
                        }
                        return AbstractC7144.m12414(arrayList);
                    default:
                        return Integer.valueOf(AbstractC7144.m12412(c7129, (InterfaceC7191[]) c7129.f19076.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.f19074 = AbstractC5187.m10215(lazyThreadSafetyMode, new InterfaceC6543(this) { // from class: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7129 f19105;

            {
                this.f19105 = this;
            }

            @Override // p052.InterfaceC6543
            public final Object invoke() {
                InterfaceC7184[] interfaceC7184ArrChildSerializers;
                ArrayList arrayList;
                InterfaceC7184[] interfaceC7184ArrTypeParametersSerializers;
                int i52 = i6;
                C7129 c7129 = this.f19105;
                switch (i52) {
                    case 0:
                        InterfaceC7079 interfaceC70792 = c7129.f19070;
                        return (interfaceC70792 == null || (interfaceC7184ArrChildSerializers = interfaceC70792.childSerializers()) == null) ? AbstractC7144.f19103 : interfaceC7184ArrChildSerializers;
                    case 1:
                        InterfaceC7079 interfaceC70793 = c7129.f19070;
                        if (interfaceC70793 == null || (interfaceC7184ArrTypeParametersSerializers = interfaceC70793.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC7184ArrTypeParametersSerializers.length);
                            for (InterfaceC7184 interfaceC7184 : interfaceC7184ArrTypeParametersSerializers) {
                                arrayList.add(interfaceC7184.getDescriptor());
                            }
                        }
                        return AbstractC7144.m12414(arrayList);
                    default:
                        return Integer.valueOf(AbstractC7144.m12412(c7129, (InterfaceC7191[]) c7129.f19076.getValue()));
                }
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7129) {
            InterfaceC7191 interfaceC7191 = (InterfaceC7191) obj;
            if (this.f19071.equals(interfaceC7191.mo12382()) && Arrays.equals((InterfaceC7191[]) this.f19076.getValue(), (InterfaceC7191[]) ((C7129) obj).f19076.getValue())) {
                int iMo12380 = interfaceC7191.mo12380();
                int i = this.f19069;
                if (i == iMo12380) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (AbstractC4395.m8907(mo12383(i2).mo12382(), interfaceC7191.mo12383(i2).mo12382()) && AbstractC4395.m8907(mo12383(i2).getKind(), interfaceC7191.mo12383(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p091.InterfaceC7191
    public final List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    @Override // p091.InterfaceC7191
    public AbstractC8190 getKind() {
        return C7198.f19209;
    }

    public int hashCode() {
        return ((Number) this.f19074.getValue()).intValue();
    }

    public String toString() {
        return AbstractC7144.m12419(this);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12379(int i) {
        return this.f19067[i];
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12380() {
        return this.f19069;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12381(String str) {
        str.getClass();
        Integer num = (Integer) this.f19072.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p087.InterfaceC7120
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo12405() {
        return this.f19072.keySet();
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12382() {
        return this.f19071;
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public InterfaceC7191 mo12383(int i) {
        return ((InterfaceC7184[]) this.f19075.getValue())[i].getDescriptor();
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12384(int i) {
        List list = this.f19066[i];
        return list == null ? EmptyList.INSTANCE : list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m12408(InterfaceC6326 interfaceC6326) {
        int i = this.f19068;
        List[] listArr = this.f19066;
        List arrayList = listArr[i];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            listArr[this.f19068] = arrayList;
        }
        arrayList.add(interfaceC6326);
    }

    @Override // p091.InterfaceC7191
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12385(int i) {
        return this.f19073[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m12409(String str, boolean z) {
        str.getClass();
        int i = this.f19068 + 1;
        this.f19068 = i;
        String[] strArr = this.f19067;
        strArr[i] = str;
        this.f19073[i] = z;
        this.f19066[i] = null;
        if (i == this.f19069 - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.f19072 = map;
        }
    }
}
