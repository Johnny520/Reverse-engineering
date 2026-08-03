package Yue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۥۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4607 extends ArrayList<C4605> {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4607() {
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m13863();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public boolean removeIf(Predicate<? super C4605> predicate) {
        Iterator<C4605> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.List
    public void replaceAll(UnaryOperator<C4605> unaryOperator) {
        for (int i = 0; i < size(); i++) {
            set(i, (C4605) unaryOperator.apply(get(i)));
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        Iterator<C4605> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return m13855();
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public C4607 m13826(String str) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().m13706(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public C4607 m13827(String str) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().mo13683(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public C4607 m13828(String str) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().m13709(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public C4607 m13829(String str, String str2) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().mo13684(str, str2);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public String m13830(String str) {
        for (C4605 c4605 : this) {
            if (c4605.mo17595(str)) {
                return c4605.mo17594(str);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public C4607 m13831(String str) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().mo13688(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final <T extends AbstractC6381> List<T> m13832(Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        for (C4605 c4605 : this) {
            for (int i = 0; i < c4605.mo13689(); i++) {
                AbstractC6381 abstractC6381M19902 = c4605.m19902(i);
                if (cls.isInstance(abstractC6381M19902)) {
                    arrayList.add(cls.cast(abstractC6381M19902));
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // java.util.ArrayList
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4607 clone() {
        C4607 c4607 = new C4607(size());
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            c4607.add(it.next().mo12984());
        }
        return c4607;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public List<C3929> m13834() {
        return m13832(C3929.class);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public List<C4299> m13835() {
        return m13832(C4299.class);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public List<String> m13836(String str) {
        ArrayList arrayList = new ArrayList(size());
        for (C4605 c4605 : this) {
            if (c4605.mo17595(str)) {
                arrayList.add(c4605.mo17594(str));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public List<String> m13837() {
        ArrayList arrayList = new ArrayList(size());
        for (C4605 c4605 : this) {
            if (c4605.m13772()) {
                arrayList.add(c4605.m13817());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public C4607 m13838() {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().mo13693();
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public C4607 m13839(int i) {
        return size() > i ? new C4607(get(i)) : new C4607();
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public C4607 m13840(InterfaceC6382 interfaceC6382) {
        C6385.m2836(interfaceC6382, this);
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C4605 m13841() {
        if (isEmpty()) {
            return null;
        }
        return get(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public List<C5063> m13842() {
        ArrayList arrayList = new ArrayList();
        for (C4605 c4605 : this) {
            if (c4605 instanceof C5063) {
                arrayList.add((C5063) c4605);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public boolean m13843(String str) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            if (it.next().mo17595(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public boolean m13844(String str) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            if (it.next().m13771(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean m13845() {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            if (it.next().m13772()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public C4607 m13846(String str) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().m13773(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public String m13847() {
        StringBuilder sbM3765 = C7615.m3765();
        for (C4605 c4605 : this) {
            if (sbM3765.length() != 0) {
                sbM3765.append("\n");
            }
            sbM3765.append(c4605.m13774());
        }
        return C7615.m23825(sbM3765);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public boolean m13848(String str) {
        AbstractC4662 abstractC4662M21597 = C6851.m21597(str);
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            if (it.next().m13779(abstractC4662M21597)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public C4605 m13849() {
        if (isEmpty()) {
            return null;
        }
        return get(size() - 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public C4607 m13850() {
        return m13868(null, true, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public C4607 m13851(String str) {
        return m13868(str, true, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public C4607 m13852() {
        return m13868(null, true, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public C4607 m13853(String str) {
        return m13868(str, true, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public C4607 m13854(String str) {
        return C7293.m3550(this, C7293.m22786(str, this));
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public String m13855() {
        StringBuilder sbM3765 = C7615.m3765();
        for (C4605 c4605 : this) {
            if (sbM3765.length() != 0) {
                sbM3765.append("\n");
            }
            sbM3765.append(c4605.mo12982());
        }
        return C7615.m23825(sbM3765);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public C4607 m13856() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(it.next().m13792());
        }
        return new C4607(linkedHashSet);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public C4607 m13857(String str) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().m13793(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public C4607 m13858() {
        return m13868(null, false, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public C4607 m13859(String str) {
        return m13868(str, false, false);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public C4607 m13860() {
        return m13868(null, false, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public C4607 m13861(String str) {
        return m13868(str, false, true);
    }

    /* JADX DEBUG: Method merged with bridge method: remove(I)Ljava/lang/Object; */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 remove(int i) {
        C4605 c4605 = (C4605) super.remove(i);
        c4605.m19924();
        return c4605;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public C4607 m13863() {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().m19924();
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public C4607 m13864(String str) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().mo13702(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public C4607 m13865(String str) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().m13802(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public C4607 m13866(String str) {
        return C7293.m22786(str, this);
    }

    /* JADX DEBUG: Method merged with bridge method: set(ILjava/lang/Object;)Ljava/lang/Object; */
    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 set(int i, C4605 c4605) {
        C8159.m26910(c4605);
        C4605 c46052 = (C4605) super.set(i, c4605);
        c46052.m19927(c4605);
        return c46052;
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public final C4607 m13868(String str, boolean z, boolean z2) {
        C4607 c4607 = new C4607();
        AbstractC4662 abstractC4662M21597 = str != null ? C6851.m21597(str) : null;
        for (C4605 c4605M13786 : this) {
            do {
                c4605M13786 = z ? c4605M13786.m13786() : c4605M13786.m13799();
                if (c4605M13786 != null) {
                    if (abstractC4662M21597 == null) {
                        c4607.add(c4605M13786);
                    } else if (c4605M13786.m13779(abstractC4662M21597)) {
                        c4607.add(c4605M13786);
                    }
                }
            } while (z2);
        }
        return c4607;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public C4607 m13869(String str) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().m13814(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public String m13870() {
        StringBuilder sbM3765 = C7615.m3765();
        for (C4605 c4605 : this) {
            if (sbM3765.length() != 0) {
                sbM3765.append(" ");
            }
            sbM3765.append(c4605.m13817());
        }
        return C7615.m23825(sbM3765);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public List<C7755> m13871() {
        return m13832(C7755.class);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public C4607 m13872(String str) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().m13819(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public C4607 m13873(InterfaceC6387 interfaceC6387) {
        C6385.m19939(interfaceC6387, this);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public C4607 m13874() {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().m19934();
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public C4607 m13875(String str) {
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().m13821(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public String m13876() {
        return size() > 0 ? m13841().m13822() : "";
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ, reason: contains not printable characters */
    public C4607 m13877(String str) {
        C8159.m26907(str);
        Iterator<C4605> it = iterator();
        while (it.hasNext()) {
            it.next().mo13705(str);
        }
        return this;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4607(int i) {
        super(i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        int iIndexOf = super.indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        remove(iIndexOf);
        return true;
    }

    public C4607(Collection<C4605> collection) {
        super(collection);
    }

    public C4607(List<C4605> list) {
        super(list);
    }

    public C4607(C4605... c4605Arr) {
        super(Arrays.asList(c4605Arr));
    }
}
