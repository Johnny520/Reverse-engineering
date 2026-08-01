package p103;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.AbstractC5171;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.AbstractC5227;
import p047.InterfaceC7155;
import p068.InterfaceC7372;
import p105.InterfaceC8013;
import p107.C8027;
import p107.InterfaceC8020;
import p269.AbstractC9019;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏世楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C7958 implements InterfaceC8020, InterfaceC7949 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final List[] f19411;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String[] f19412;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f19413 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f19414;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC7908 f19415;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f19416;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public Map f19417;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean[] f19418;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final InterfaceC6016 f19419;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final InterfaceC6016 f19420;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final InterfaceC6016 f19421;

    public C7958(String str, InterfaceC7908 interfaceC7908, int i) {
        this.f19416 = str;
        this.f19415 = interfaceC7908;
        this.f19414 = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.f19412 = strArr;
        int i4 = this.f19414;
        this.f19411 = new List[i4];
        this.f19418 = new boolean[i4];
        this.f19417 = AbstractC5171.m9335();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.f19420 = AbstractC6019.m10774(lazyThreadSafetyMode, new InterfaceC7372(this) { // from class: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7958 f19450;

            {
                this.f19450 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                InterfaceC8013[] interfaceC8013ArrChildSerializers;
                ArrayList arrayList;
                InterfaceC8013[] interfaceC8013ArrTypeParametersSerializers;
                int i5 = i2;
                C7958 c7958 = this.f19450;
                switch (i5) {
                    case 0:
                        InterfaceC7908 interfaceC79082 = c7958.f19415;
                        return (interfaceC79082 == null || (interfaceC8013ArrChildSerializers = interfaceC79082.childSerializers()) == null) ? AbstractC7973.f19448 : interfaceC8013ArrChildSerializers;
                    case 1:
                        InterfaceC7908 interfaceC79083 = c7958.f19415;
                        if (interfaceC79083 == null || (interfaceC8013ArrTypeParametersSerializers = interfaceC79083.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC8013ArrTypeParametersSerializers.length);
                            for (InterfaceC8013 interfaceC8013 : interfaceC8013ArrTypeParametersSerializers) {
                                arrayList.add(interfaceC8013.getDescriptor());
                            }
                        }
                        return AbstractC7973.m12973(arrayList);
                    default:
                        return Integer.valueOf(AbstractC7973.m12971(c7958, (InterfaceC8020[]) c7958.f19421.getValue()));
                }
            }
        });
        final int i5 = 1;
        this.f19421 = AbstractC6019.m10774(lazyThreadSafetyMode, new InterfaceC7372(this) { // from class: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7958 f19450;

            {
                this.f19450 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                InterfaceC8013[] interfaceC8013ArrChildSerializers;
                ArrayList arrayList;
                InterfaceC8013[] interfaceC8013ArrTypeParametersSerializers;
                int i52 = i5;
                C7958 c7958 = this.f19450;
                switch (i52) {
                    case 0:
                        InterfaceC7908 interfaceC79082 = c7958.f19415;
                        return (interfaceC79082 == null || (interfaceC8013ArrChildSerializers = interfaceC79082.childSerializers()) == null) ? AbstractC7973.f19448 : interfaceC8013ArrChildSerializers;
                    case 1:
                        InterfaceC7908 interfaceC79083 = c7958.f19415;
                        if (interfaceC79083 == null || (interfaceC8013ArrTypeParametersSerializers = interfaceC79083.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC8013ArrTypeParametersSerializers.length);
                            for (InterfaceC8013 interfaceC8013 : interfaceC8013ArrTypeParametersSerializers) {
                                arrayList.add(interfaceC8013.getDescriptor());
                            }
                        }
                        return AbstractC7973.m12973(arrayList);
                    default:
                        return Integer.valueOf(AbstractC7973.m12971(c7958, (InterfaceC8020[]) c7958.f19421.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.f19419 = AbstractC6019.m10774(lazyThreadSafetyMode, new InterfaceC7372(this) { // from class: 飘花落叶言世苏兰哲子楪.飘花落叶言子苏楪兰哲世

            /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
            public final /* synthetic */ C7958 f19450;

            {
                this.f19450 = this;
            }

            @Override // p068.InterfaceC7372
            public final Object invoke() {
                InterfaceC8013[] interfaceC8013ArrChildSerializers;
                ArrayList arrayList;
                InterfaceC8013[] interfaceC8013ArrTypeParametersSerializers;
                int i52 = i6;
                C7958 c7958 = this.f19450;
                switch (i52) {
                    case 0:
                        InterfaceC7908 interfaceC79082 = c7958.f19415;
                        return (interfaceC79082 == null || (interfaceC8013ArrChildSerializers = interfaceC79082.childSerializers()) == null) ? AbstractC7973.f19448 : interfaceC8013ArrChildSerializers;
                    case 1:
                        InterfaceC7908 interfaceC79083 = c7958.f19415;
                        if (interfaceC79083 == null || (interfaceC8013ArrTypeParametersSerializers = interfaceC79083.typeParametersSerializers()) == null) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(interfaceC8013ArrTypeParametersSerializers.length);
                            for (InterfaceC8013 interfaceC8013 : interfaceC8013ArrTypeParametersSerializers) {
                                arrayList.add(interfaceC8013.getDescriptor());
                            }
                        }
                        return AbstractC7973.m12973(arrayList);
                    default:
                        return Integer.valueOf(AbstractC7973.m12971(c7958, (InterfaceC8020[]) c7958.f19421.getValue()));
                }
            }
        });
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7958) {
            InterfaceC8020 interfaceC8020 = (InterfaceC8020) obj;
            if (this.f19416.equals(interfaceC8020.mo12941()) && Arrays.equals((InterfaceC8020[]) this.f19421.getValue(), (InterfaceC8020[]) ((C7958) obj).f19421.getValue())) {
                int iMo12939 = interfaceC8020.mo12939();
                int i = this.f19414;
                if (i == iMo12939) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (AbstractC5227.m9466(mo12942(i2).mo12941(), interfaceC8020.mo12942(i2).mo12941()) && AbstractC5227.m9466(mo12942(i2).getKind(), interfaceC8020.mo12942(i2).getKind())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p107.InterfaceC8020
    public final List getAnnotations() {
        return EmptyList.INSTANCE;
    }

    @Override // p107.InterfaceC8020
    public AbstractC9019 getKind() {
        return C8027.f19554;
    }

    public int hashCode() {
        return ((Number) this.f19419.getValue()).intValue();
    }

    public String toString() {
        return AbstractC7973.m12978(this);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public final String mo12938(int i) {
        return this.f19412[i];
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final int mo12939() {
        return this.f19414;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo12940(String str) {
        str.getClass();
        Integer num = (Integer) this.f19417.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // p103.InterfaceC7949
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Set mo12964() {
        return this.f19417.keySet();
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final String mo12941() {
        return this.f19416;
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public InterfaceC8020 mo12942(int i) {
        return ((InterfaceC8013[]) this.f19420.getValue())[i].getDescriptor();
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final List mo12943(int i) {
        List list = this.f19411[i];
        return list == null ? EmptyList.INSTANCE : list;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final void m12967(InterfaceC7155 interfaceC7155) {
        int i = this.f19413;
        List[] listArr = this.f19411;
        List arrayList = listArr[i];
        if (arrayList == null) {
            arrayList = new ArrayList(1);
            listArr[this.f19413] = arrayList;
        }
        arrayList.add(interfaceC7155);
    }

    @Override // p107.InterfaceC8020
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo12944(int i) {
        return this.f19418[i];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final void m12968(String str, boolean z) {
        str.getClass();
        int i = this.f19413 + 1;
        this.f19413 = i;
        String[] strArr = this.f19412;
        strArr[i] = str;
        this.f19418[i] = z;
        this.f19411[i] = null;
        if (i == this.f19414 - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.f19417 = map;
        }
    }
}
