package Yue;

import Yue.InterfaceC5597;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,697:1\n1#2:698\n*E\n"})
public final class C5926<K, V> implements Map<K, V>, Serializable, InterfaceC5597 {

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0903 f14851 = new C0903(null);

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public static final int f14852 = -1640531527;

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public static final int f14853 = 8;

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public static final int f14854 = 2;

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public static final int f14855 = -1;

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C5926 f14856;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public K[] f14857;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6489
    public V[] f14858;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    @InterfaceC6399
    public int[] f14859;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    @InterfaceC6399
    public int[] f14860;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f14861;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public int f14862;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int f14863;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public int f14864;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    @InterfaceC6489
    public C5932<K> f14865;

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    @InterfaceC6489
    public C5933<V> f14866;

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    @InterfaceC6489
    public C5931<K, V> f14867;

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean f14868;

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ$ۥ */
    public static final class C0903 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۨۦۨ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0903(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final int m18537(int i) {
            return Integer.highestOneBit(C7007.m21661(i, 1) * 3);
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m18538(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final C5926 m18539() {
            return C5926.f14856;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0903() {
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ$ۥ۟ */
    public static final class C0904<K, V> extends C5928<K, V> implements Iterator<Map.Entry<K, V>>, InterfaceC5594 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0904(@InterfaceC6399 C5926<K, V> c5926) {
            super(c5926);
            C5499.m17103(c5926, "map");
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public C5927<K, V> next() {
            if (m2599() >= m18543().f14862) {
                throw new NoSuchElementException();
            }
            int iM2599 = m2599();
            m18545(iM2599 + 1);
            m18546(iM2599);
            C5927<K, V> c5927 = new C5927<>(m18543(), m2600());
            m18544();
            return c5927;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
        public final void m18541(@InterfaceC6399 StringBuilder sb) {
            C5499.m17103(sb, "sb");
            if (m2599() >= m18543().f14862) {
                throw new NoSuchElementException();
            }
            int iM2599 = m2599();
            m18545(iM2599 + 1);
            m18546(iM2599);
            Object obj = m18543().f14857[m2600()];
            if (C5499.m17094(obj, m18543())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj);
            }
            sb.append(SignatureVisitor.INSTANCEOF);
            Object[] objArr = m18543().f14858;
            C5499.m17100(objArr);
            Object obj2 = objArr[m2600()];
            if (C5499.m17094(obj2, m18543())) {
                sb.append("(this Map)");
            } else {
                sb.append(obj2);
            }
            m18544();
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
        public final int m18542() {
            if (m2599() >= m18543().f14862) {
                throw new NoSuchElementException();
            }
            int iM2599 = m2599();
            m18545(iM2599 + 1);
            m18546(iM2599);
            Object obj = m18543().f14857[m2600()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object[] objArr = m18543().f14858;
            C5499.m17100(objArr);
            Object obj2 = objArr[m2600()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            m18544();
            return iHashCode2;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ$ۥ۟۟, reason: contains not printable characters */
    public static final class C5927<K, V> implements Map.Entry<K, V>, InterfaceC5597.InterfaceC0801 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C5926<K, V> f14869;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final int f14870;

        public C5927(@InterfaceC6399 C5926<K, V> c5926, int i) {
            C5499.m17103(c5926, "map");
            this.f14869 = c5926;
            this.f14870 = i;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@InterfaceC6489 Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                if (C5499.m17094(entry.getKey(), getKey()) && C5499.m17094(entry.getValue(), getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) this.f14869.f14857[this.f14870];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            Object[] objArr = this.f14869.f14858;
            C5499.m17100(objArr);
            return (V) objArr[this.f14870];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            this.f14869.m18509();
            Object[] objArrM18507 = this.f14869.m18507();
            int i = this.f14870;
            V v2 = (V) objArrM18507[i];
            objArrM18507[i] = v;
            return v2;
        }

        /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: (wrap:K:INVOKE), (wrap:char:SGET), (wrap:V:INVOKE) */
        @InterfaceC6399
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append(SignatureVisitor.INSTANCEOF);
            sb.append(getValue());
            return sb.toString();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ$ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC7507({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,697:1\n1#2:698\n*E\n"})
    public static class C5928<K, V> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final C5926<K, V> f14871;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f14872;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public int f14873;

        public C5928(@InterfaceC6399 C5926<K, V> c5926) {
            C5499.m17103(c5926, "map");
            this.f14871 = c5926;
            this.f14873 = -1;
            m18544();
        }

        public final boolean hasNext() {
            return this.f14872 < this.f14871.f14862;
        }

        public final void remove() {
            if (this.f14873 == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
            }
            this.f14871.m18509();
            this.f14871.m18533(this.f14873);
            this.f14873 = -1;
        }

        /* JADX INFO: renamed from: ۥ */
        public final int m2599() {
            return this.f14872;
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public final int m2600() {
            return this.f14873;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C5926<K, V> m18543() {
            return this.f14871;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m18544() {
            while (this.f14872 < this.f14871.f14862) {
                int[] iArr = this.f14871.f14859;
                int i = this.f14872;
                if (iArr[i] >= 0) {
                    return;
                } else {
                    this.f14872 = i + 1;
                }
            }
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m18545(int i) {
            this.f14872 = i;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m18546(int i) {
            this.f14873 = i;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ$ۥ۟۟۟۟, reason: contains not printable characters */
    public static final class C5929<K, V> extends C5928<K, V> implements Iterator<K>, InterfaceC5594 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5929(@InterfaceC6399 C5926<K, V> c5926) {
            super(c5926);
            C5499.m17103(c5926, "map");
        }

        @Override // java.util.Iterator
        public K next() {
            if (m2599() >= m18543().f14862) {
                throw new NoSuchElementException();
            }
            int iM2599 = m2599();
            m18545(iM2599 + 1);
            m18546(iM2599);
            K k = (K) m18543().f14857[m2600()];
            m18544();
            return k;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠ۨۦۨ$ۥ۟۟۟۠, reason: contains not printable characters */
    public static final class C5930<K, V> extends C5928<K, V> implements Iterator<V>, InterfaceC5594 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5930(@InterfaceC6399 C5926<K, V> c5926) {
            super(c5926);
            C5499.m17103(c5926, "map");
        }

        @Override // java.util.Iterator
        public V next() {
            if (m2599() >= m18543().f14862) {
                throw new NoSuchElementException();
            }
            int iM2599 = m2599();
            m18545(iM2599 + 1);
            m18546(iM2599);
            Object[] objArr = m18543().f14858;
            C5499.m17100(objArr);
            V v = (V) objArr[m2600()];
            m18544();
            return v;
        }
    }

    static {
        C5926 c5926 = new C5926(0);
        c5926.f14868 = true;
        f14856 = c5926;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5926(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.f14857 = kArr;
        this.f14858 = vArr;
        this.f14859 = iArr;
        this.f14860 = iArr2;
        this.f14861 = i;
        this.f14862 = i2;
        this.f14863 = f14851.m18538(m18519());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    private final void m18503(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        }
        if (i > m18517()) {
            int iM18517 = (m18517() * 3) / 2;
            if (i <= iM18517) {
                i = iM18517;
            }
            this.f14857 = (K[]) C5724.m17718(this.f14857, i);
            V[] vArr = this.f14858;
            this.f14858 = vArr != null ? (V[]) C5724.m17718(vArr, i) : null;
            int[] iArrCopyOf = Arrays.copyOf(this.f14859, i);
            C5499.m17102(iArrCopyOf, "copyOf(this, newSize)");
            this.f14859 = iArrCopyOf;
            int iM18537 = f14851.m18537(i);
            if (iM18537 > m18519()) {
                m18529(iM18537);
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    private final void m18504(int i) {
        if (m18535(i)) {
            m18529(m18519());
        } else {
            m18503(this.f14862 + i);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    private final Object m18505() throws NotSerializableException {
        if (this.f14868) {
            return new C7373(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    @Override // java.util.Map
    public void clear() {
        m18509();
        AbstractC5455 it = new C5458(0, this.f14862 - 1).iterator();
        while (it.hasNext()) {
            int iMo471 = it.mo471();
            int[] iArr = this.f14859;
            int i = iArr[iMo471];
            if (i >= 0) {
                this.f14860[i] = 0;
                iArr[iMo471] = -1;
            }
        }
        C5724.m17720(this.f14857, 0, this.f14862);
        V[] vArr = this.f14858;
        if (vArr != null) {
            C5724.m17720(vArr, 0, this.f14862);
        }
        this.f14864 = 0;
        this.f14862 = 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return m18515(obj) >= 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return m18516(obj) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return m18518();
    }

    @Override // java.util.Map
    public boolean equals(@InterfaceC6489 Object obj) {
        return obj == this || ((obj instanceof Map) && m18513((Map) obj));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @InterfaceC6489
    public V get(Object obj) {
        int iM18515 = m18515(obj);
        if (iM18515 < 0) {
            return null;
        }
        V[] vArr = this.f14858;
        C5499.m17100(vArr);
        return vArr[iM18515];
    }

    @Override // java.util.Map
    public int hashCode() {
        C0904<K, V> c0904M18514 = m18514();
        int iM18542 = 0;
        while (c0904M18514.hasNext()) {
            iM18542 += c0904M18514.m18542();
        }
        return iM18542;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return m18520();
    }

    @Override // java.util.Map
    @InterfaceC6489
    public V put(K k, V v) {
        m18509();
        int iM18506 = m18506(k);
        V[] vArrM18507 = m18507();
        if (iM18506 >= 0) {
            vArrM18507[iM18506] = v;
            return null;
        }
        int i = (-iM18506) - 1;
        V v2 = vArrM18507[i];
        vArrM18507[i] = v;
        return v2;
    }

    @Override // java.util.Map
    public void putAll(@InterfaceC6399 Map<? extends K, ? extends V> map) {
        C5499.m17103(map, "from");
        m18509();
        m18526(map.entrySet());
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    @InterfaceC6489
    public V remove(Object obj) {
        int iM18532 = m18532(obj);
        if (iM18532 < 0) {
            return null;
        }
        V[] vArr = this.f14858;
        C5499.m17100(vArr);
        V v = vArr[iM18532];
        C5724.m17719(vArr, iM18532);
        return v;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m18521();
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C0904<K, V> c0904M18514 = m18514();
        int i = 0;
        while (c0904M18514.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            c0904M18514.m18541(sb);
            i++;
        }
        sb.append("}");
        String string = sb.toString();
        C5499.m17102(string, "sb.toString()");
        return string;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return m18522();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final int m18506(K k) {
        m18509();
        while (true) {
            int iM18523 = m18523(k);
            int iM21668 = C7007.m21668(this.f14861 * 2, m18519() / 2);
            int i = 0;
            while (true) {
                int i2 = this.f14860[iM18523];
                if (i2 <= 0) {
                    if (this.f14862 < m18517()) {
                        int i3 = this.f14862;
                        int i4 = i3 + 1;
                        this.f14862 = i4;
                        this.f14857[i3] = k;
                        this.f14859[i3] = iM18523;
                        this.f14860[iM18523] = i4;
                        this.f14864 = size() + 1;
                        if (i > this.f14861) {
                            this.f14861 = i;
                        }
                        return i3;
                    }
                    m18504(1);
                } else {
                    if (C5499.m17094(this.f14857[i2 - 1], k)) {
                        return -i2;
                    }
                    i++;
                    if (i > iM21668) {
                        m18529(m18519() * 2);
                        break;
                    }
                    iM18523 = iM18523 == 0 ? m18519() - 1 : iM18523 - 1;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final V[] m18507() {
        V[] vArr = this.f14858;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) C5724.m17717(m18517());
        this.f14858 = vArr2;
        return vArr2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final Map<K, V> m18508() {
        m18509();
        this.f14868 = true;
        if (size() > 0) {
            return this;
        }
        C5926 c5926 = f14856;
        C5499.m17101(c5926, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>");
        return c5926;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m18509() {
        if (this.f14868) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public final void m18510() {
        int i;
        V[] vArr = this.f14858;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.f14862;
            if (i2 >= i) {
                break;
            }
            if (this.f14859[i2] >= 0) {
                K[] kArr = this.f14857;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        C5724.m17720(this.f14857, i3, i);
        if (vArr != null) {
            C5724.m17720(vArr, i3, this.f14862);
        }
        this.f14862 = i3;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final boolean m18511(@InterfaceC6399 Collection<?> collection) {
        C5499.m17103(collection, C6597.f2164);
        for (Object obj : collection) {
            if (obj != null) {
                try {
                    if (!m18512((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final boolean m18512(@InterfaceC6399 Map.Entry<? extends K, ? extends V> entry) {
        C5499.m17103(entry, "entry");
        int iM18515 = m18515(entry.getKey());
        if (iM18515 < 0) {
            return false;
        }
        V[] vArr = this.f14858;
        C5499.m17100(vArr);
        return C5499.m17094(vArr[iM18515], entry.getValue());
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public final boolean m18513(Map<?, ?> map) {
        return size() == map.size() && m18511(map.entrySet());
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public final C0904<K, V> m18514() {
        return new C0904<>(this);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final int m18515(K k) {
        int iM18523 = m18523(k);
        int i = this.f14861;
        while (true) {
            int i2 = this.f14860[iM18523];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C5499.m17094(this.f14857[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            iM18523 = iM18523 == 0 ? m18519() - 1 : iM18523 - 1;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public final int m18516(V v) {
        int i = this.f14862;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.f14859[i] >= 0) {
                V[] vArr = this.f14858;
                C5499.m17100(vArr);
                if (C5499.m17094(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public final int m18517() {
        return this.f14857.length;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Set<Map.Entry<K, V>> m18518() {
        C5931<K, V> c5931 = this.f14867;
        if (c5931 != null) {
            return c5931;
        }
        C5931<K, V> c59312 = new C5931<>(this);
        this.f14867 = c59312;
        return c59312;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public final int m18519() {
        return this.f14860.length;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Set<K> m18520() {
        C5932<K> c5932 = this.f14865;
        if (c5932 != null) {
            return c5932;
        }
        C5932<K> c59322 = new C5932<>(this);
        this.f14865 = c59322;
        return c59322;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public int m18521() {
        return this.f14864;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public Collection<V> m18522() {
        C5933<V> c5933 = this.f14866;
        if (c5933 != null) {
            return c5933;
        }
        C5933<V> c59332 = new C5933<>(this);
        this.f14866 = c59332;
        return c59332;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public final int m18523(K k) {
        return ((k != null ? k.hashCode() : 0) * (-1640531527)) >>> this.f14863;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public final boolean m18524() {
        return this.f14868;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public final C5929<K, V> m18525() {
        return new C5929<>(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public final boolean m18526(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        m18504(collection.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = collection.iterator();
        while (it.hasNext()) {
            if (m18527(it.next())) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public final boolean m18527(Map.Entry<? extends K, ? extends V> entry) {
        int iM18506 = m18506(entry.getKey());
        V[] vArrM18507 = m18507();
        if (iM18506 >= 0) {
            vArrM18507[iM18506] = entry.getValue();
            return true;
        }
        int i = (-iM18506) - 1;
        if (C5499.m17094(entry.getValue(), vArrM18507[i])) {
            return false;
        }
        vArrM18507[i] = entry.getValue();
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public final boolean m18528(int i) {
        int iM18523 = m18523(this.f14857[i]);
        int i2 = this.f14861;
        while (true) {
            int[] iArr = this.f14860;
            if (iArr[iM18523] == 0) {
                iArr[iM18523] = i + 1;
                this.f14859[i] = iM18523;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            iM18523 = iM18523 == 0 ? m18519() - 1 : iM18523 - 1;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public final void m18529(int i) {
        if (this.f14862 > size()) {
            m18510();
        }
        int i2 = 0;
        if (i != m18519()) {
            this.f14860 = new int[i];
            this.f14863 = f14851.m18538(i);
        } else {
            C3404.m7190(this.f14860, 0, 0, m18519());
        }
        while (i2 < this.f14862) {
            int i3 = i2 + 1;
            if (!m18528(i2)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i2 = i3;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public final boolean m18530(@InterfaceC6399 Map.Entry<? extends K, ? extends V> entry) {
        C5499.m17103(entry, "entry");
        m18509();
        int iM18515 = m18515(entry.getKey());
        if (iM18515 < 0) {
            return false;
        }
        V[] vArr = this.f14858;
        C5499.m17100(vArr);
        if (!C5499.m17094(vArr[iM18515], entry.getValue())) {
            return false;
        }
        m18533(iM18515);
        return true;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public final void m18531(int i) {
        int iM21668 = C7007.m21668(this.f14861 * 2, m18519() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            i = i == 0 ? m18519() - 1 : i - 1;
            i2++;
            if (i2 > this.f14861) {
                this.f14860[i3] = 0;
                return;
            }
            int[] iArr = this.f14860;
            int i4 = iArr[i];
            if (i4 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i4 < 0) {
                iArr[i3] = -1;
            } else {
                int i5 = i4 - 1;
                if (((m18523(this.f14857[i5]) - i) & (m18519() - 1)) >= i2) {
                    this.f14860[i3] = i4;
                    this.f14859[i5] = i3;
                }
                iM21668--;
            }
            i3 = i;
            i2 = 0;
            iM21668--;
        } while (iM21668 >= 0);
        this.f14860[i3] = -1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public final int m18532(K k) {
        m18509();
        int iM18515 = m18515(k);
        if (iM18515 < 0) {
            return -1;
        }
        m18533(iM18515);
        return iM18515;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public final void m18533(int i) {
        C5724.m17719(this.f14857, i);
        m18531(this.f14859[i]);
        this.f14859[i] = -1;
        this.f14864 = size() - 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public final boolean m18534(V v) {
        m18509();
        int iM18516 = m18516(v);
        if (iM18516 < 0) {
            return false;
        }
        m18533(iM18516);
        return true;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final boolean m18535(int i) {
        int iM18517 = m18517();
        int i2 = this.f14862;
        int i3 = iM18517 - i2;
        int size = i2 - size();
        return i3 < i && i3 + size >= i && size >= m18517() / 4;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public final C5930<K, V> m18536() {
        return new C5930<>(this);
    }

    public C5926() {
        this(8);
    }

    public C5926(int i) {
        this(C5724.m17717(i), null, new int[i], new int[f14851.m18537(i)], 2, 0);
    }
}
