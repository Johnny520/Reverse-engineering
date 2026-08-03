package Yue;

import Yue.C4483;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

/* JADX INFO: renamed from: Yue.ۥۣۡۢۤ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6381 implements Cloneable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final List<AbstractC6381> f16146 = Collections.emptyList();

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public static final String f16147 = "";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public AbstractC6381 f16148;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public int f16149;

    /* JADX INFO: renamed from: Yue.ۥۣۡۢۤ$ۥ */
    public static class C0966 implements InterfaceC6387 {

        /* JADX INFO: renamed from: ۥ */
        public final Appendable f2048;

        /* JADX INFO: renamed from: ۥ۟ */
        public final C4483.C0414 f2049;

        public C0966(Appendable appendable, C4483.C0414 c0414) {
            this.f2048 = appendable;
            this.f2049 = c0414;
            c0414.m13025();
        }

        @Override // Yue.InterfaceC6387
        /* JADX INFO: renamed from: ۥ */
        public void mo891(AbstractC6381 abstractC6381, int i) {
            try {
                abstractC6381.mo9886(this.f2048, i, this.f2049);
            } catch (IOException e) {
                throw new C7370(e);
            }
        }

        @Override // Yue.InterfaceC6387
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo892(AbstractC6381 abstractC6381, int i) {
            if (abstractC6381.mo9885().equals("#text")) {
                return;
            }
            try {
                abstractC6381.mo9887(this.f2048, i, this.f2049);
            } catch (IOException e) {
                throw new C7370(e);
            }
        }
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        return mo12982();
    }

    /* JADX INFO: renamed from: ۥ۟۟ */
    public String mo17593(String str) {
        C8159.m26907(str);
        return (mo13697() && mo13685().m9201(str)) ? C7615.m23826(mo13686(), mo13685().m9196(str)) : "";
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m19898(int i, AbstractC6381... abstractC6381Arr) {
        C8159.m26910(abstractC6381Arr);
        if (abstractC6381Arr.length == 0) {
            return;
        }
        List<AbstractC6381> listMo13694 = mo13694();
        AbstractC6381 abstractC6381Mo13701 = abstractC6381Arr[0].mo13701();
        if (abstractC6381Mo13701 != null && abstractC6381Mo13701.mo13689() == abstractC6381Arr.length) {
            List<AbstractC6381> listMo136942 = abstractC6381Mo13701.mo13694();
            int length = abstractC6381Arr.length;
            while (true) {
                int i2 = length - 1;
                if (length <= 0) {
                    boolean z = mo13689() == 0;
                    abstractC6381Mo13701.mo13693();
                    listMo13694.addAll(i, Arrays.asList(abstractC6381Arr));
                    int length2 = abstractC6381Arr.length;
                    while (true) {
                        int i3 = length2 - 1;
                        if (length2 <= 0) {
                            break;
                        }
                        abstractC6381Arr[i3].f16148 = this;
                        length2 = i3;
                    }
                    if (z && abstractC6381Arr[0].f16149 == 0) {
                        return;
                    }
                    m19923(i);
                    return;
                }
                if (abstractC6381Arr[i2] != listMo136942.get(i2)) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        C8159.m26905(abstractC6381Arr);
        for (AbstractC6381 abstractC6381 : abstractC6381Arr) {
            m19925(abstractC6381);
        }
        listMo13694.addAll(i, Arrays.asList(abstractC6381Arr));
        m19923(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void m19899(AbstractC6381... abstractC6381Arr) {
        List<AbstractC6381> listMo13694 = mo13694();
        for (AbstractC6381 abstractC6381 : abstractC6381Arr) {
            m19925(abstractC6381);
            listMo13694.add(abstractC6381);
            abstractC6381.m19930(listMo13694.size() - 1);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m19900(int i, String str) {
        C8159.m26910(str);
        C8159.m26910(this.f16148);
        this.f16148.m19898(i, (AbstractC6381[]) C6386.m2838(this).m21008(str, mo13701() instanceof C4605 ? (C4605) mo13701() : null, mo13686()).toArray(new AbstractC6381[0]));
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public AbstractC6381 mo13682(AbstractC6381 abstractC6381) {
        C8159.m26910(abstractC6381);
        C8159.m26910(this.f16148);
        if (abstractC6381.f16148 == this.f16148) {
            abstractC6381.m19924();
        }
        this.f16148.m19898(this.f16149 + 1, abstractC6381);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public AbstractC6381 mo13683(String str) {
        m19900(this.f16149 + 1, str);
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public AbstractC6381 mo13684(String str, String str2) {
        mo13685().m9210(C6386.m2838(this).m21014().m3083(str), str2);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public String mo17594(String str) {
        C8159.m26910(str);
        if (!mo13697()) {
            return "";
        }
        String strM9196 = mo13685().m9196(str);
        return strM9196.length() > 0 ? strM9196 : str.startsWith("abs:") ? mo17593(str.substring(4)) : "";
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
    public abstract C3456 mo13685();

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public int m19901() {
        if (mo13697()) {
            return mo13685().size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public abstract String mo13686();

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public AbstractC6381 mo13687(AbstractC6381 abstractC6381) {
        C8159.m26910(abstractC6381);
        C8159.m26910(this.f16148);
        if (abstractC6381.f16148 == this.f16148) {
            abstractC6381.m19924();
        }
        this.f16148.m19898(this.f16149, abstractC6381);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public AbstractC6381 mo13688(String str) {
        m19900(this.f16149, str);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public AbstractC6381 m19902(int i) {
        return mo13694().get(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public abstract int mo13689();

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public List<AbstractC6381> m19903() {
        if (mo13689() == 0) {
            return f16146;
        }
        List<AbstractC6381> listMo13694 = mo13694();
        ArrayList arrayList = new ArrayList(listMo13694.size());
        arrayList.addAll(listMo13694);
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public AbstractC6381[] m19904() {
        return (AbstractC6381[]) mo13694().toArray(new AbstractC6381[0]);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public List<AbstractC6381> m19905() {
        List<AbstractC6381> listMo13694 = mo13694();
        ArrayList arrayList = new ArrayList(listMo13694.size());
        Iterator<AbstractC6381> it = listMo13694.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().mo12984());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public AbstractC6381 mo13690() {
        if (mo13697()) {
            Iterator<C3454> it = mo13685().iterator();
            while (it.hasNext()) {
                it.next();
                it.remove();
            }
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // 
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public AbstractC6381 mo12984() {
        AbstractC6381 abstractC6381Mo13691 = mo13691(null);
        LinkedList linkedList = new LinkedList();
        linkedList.add(abstractC6381Mo13691);
        while (!linkedList.isEmpty()) {
            AbstractC6381 abstractC6381 = (AbstractC6381) linkedList.remove();
            int iMo13689 = abstractC6381.mo13689();
            for (int i = 0; i < iMo13689; i++) {
                List<AbstractC6381> listMo13694 = abstractC6381.mo13694();
                AbstractC6381 abstractC6381Mo136912 = listMo13694.get(i).mo13691(abstractC6381);
                listMo13694.set(i, abstractC6381Mo136912);
                linkedList.add(abstractC6381Mo136912);
            }
        }
        return abstractC6381Mo13691;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠ */
    public AbstractC6381 mo13691(AbstractC6381 abstractC6381) {
        C4483 c4483M19918;
        try {
            AbstractC6381 abstractC63812 = (AbstractC6381) super.clone();
            abstractC63812.f16148 = abstractC6381;
            abstractC63812.f16149 = abstractC6381 == null ? 0 : this.f16149;
            if (abstractC6381 == null && !(this instanceof C4483) && (c4483M19918 = m19918()) != null) {
                C4483 c4483Mo12983 = c4483M19918.mo12983();
                abstractC63812.f16148 = c4483Mo12983;
                c4483Mo12983.mo13694().add(abstractC63812);
            }
            return abstractC63812;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public abstract void mo13692(String str);

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public abstract AbstractC6381 mo13693();

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public abstract List<AbstractC6381> mo13694();

    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public AbstractC6381 mo13695(InterfaceC6382 interfaceC6382) {
        C8159.m26910(interfaceC6382);
        C6385.m2835(interfaceC6382, this);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public AbstractC6381 m19906() {
        if (mo13689() == 0) {
            return null;
        }
        return mo13694().get(0);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public AbstractC6381 mo13696(Consumer<? super AbstractC6381> consumer) {
        C8159.m26910(consumer);
        m19915().forEach(consumer);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final C4605 m19907(C4605 c4605) {
        C4605 c4605M13744 = c4605.m13744();
        while (true) {
            C4605 c46052 = c4605M13744;
            C4605 c46053 = c4605;
            c4605 = c46052;
            if (c4605 == null) {
                return c46053;
            }
            c4605M13744 = c4605.m13744();
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public boolean mo17595(String str) {
        C8159.m26910(str);
        if (!mo13697()) {
            return false;
        }
        if (str.startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (mo13685().m9201(strSubstring) && !mo17593(strSubstring).isEmpty()) {
                return true;
            }
        }
        return mo13685().m9201(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public abstract boolean mo13697();

    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public boolean m19908() {
        return this.f16148 != null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public boolean m19909(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return mo12982().equals(((AbstractC6381) obj).mo12982());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public <T extends Appendable> T mo13698(T t) {
        m19917(t);
        return t;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void m19910(Appendable appendable, int i, C4483.C0414 c0414) throws IOException {
        appendable.append('\n').append(C7615.m23824(i * c0414.m13019(), c0414.m13021()));
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public final boolean m19911() {
        int i = this.f16149;
        if (i == 0) {
            return true;
        }
        if (i != 1) {
            return false;
        }
        AbstractC6381 abstractC6381M19922 = m19922();
        return (abstractC6381M19922 instanceof C7755) && ((C7755) abstractC6381M19922).m24632();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public AbstractC6381 m19912() {
        int iMo13689 = mo13689();
        if (iMo13689 == 0) {
            return null;
        }
        return mo13694().get(iMo13689 - 1);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public boolean m19913(String str) {
        return mo13700().equals(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public AbstractC6381 m19914() {
        AbstractC6381 abstractC6381 = this.f16148;
        if (abstractC6381 == null) {
            return null;
        }
        List<AbstractC6381> listMo13694 = abstractC6381.mo13694();
        int i = this.f16149 + 1;
        if (listMo13694.size() > i) {
            return listMo13694.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public abstract String mo9885();

    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public Stream<AbstractC6381> m19915() {
        return C6386.m19943(this, AbstractC6381.class);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public <T extends AbstractC6381> Stream<T> m19916(Class<T> cls) {
        return C6386.m19943(this, cls);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo13699() {
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public String mo13700() {
        return mo9885();
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public String mo12982() {
        StringBuilder sbM3765 = C7615.m3765();
        m19917(sbM3765);
        return C7615.m23825(sbM3765);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void m19917(Appendable appendable) {
        C6385.m19940(new C0966(appendable, C6386.m2837(this)), this);
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public abstract void mo9886(Appendable appendable, int i, C4483.C0414 c0414) throws IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public abstract void mo9887(Appendable appendable, int i, C4483.C0414 c0414) throws IOException;

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public C4483 m19918() {
        AbstractC6381 abstractC6381Mo13703 = mo13703();
        if (abstractC6381Mo13703 instanceof C4483) {
            return (C4483) abstractC6381Mo13703;
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ */
    public AbstractC6381 mo13701() {
        return this.f16148;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public boolean m19919(String str, String str2) {
        AbstractC6381 abstractC6381 = this.f16148;
        return abstractC6381 != null && (abstractC6381 instanceof C4605) && ((C4605) abstractC6381).m13737(str, str2);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters */
    public boolean m19920(String str) {
        AbstractC6381 abstractC6381 = this.f16148;
        return abstractC6381 != null && abstractC6381.mo13700().equals(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ, reason: contains not printable characters */
    public final AbstractC6381 m19921() {
        return this.f16148;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۟, reason: contains not printable characters */
    public AbstractC6381 m19922() {
        AbstractC6381 abstractC6381 = this.f16148;
        if (abstractC6381 != null && this.f16149 > 0) {
            return abstractC6381.mo13694().get(this.f16149 - 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤ۠, reason: contains not printable characters */
    public final void m19923(int i) {
        int iMo13689 = mo13689();
        if (iMo13689 == 0) {
            return;
        }
        List<AbstractC6381> listMo13694 = mo13694();
        while (i < iMo13689) {
            listMo13694.get(i).m19930(i);
            i++;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۡ, reason: contains not printable characters */
    public void m19924() {
        AbstractC6381 abstractC6381 = this.f16148;
        if (abstractC6381 != null) {
            abstractC6381.mo15597(this);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۢ */
    public AbstractC6381 mo13702(String str) {
        C8159.m26910(str);
        if (mo13697()) {
            mo13685().m9213(str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo15597(AbstractC6381 abstractC6381) {
        C8159.m26903(abstractC6381.f16148 == this);
        int i = abstractC6381.f16149;
        mo13694().remove(i);
        m19923(i);
        abstractC6381.f16148 = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۤ, reason: contains not printable characters */
    public void m19925(AbstractC6381 abstractC6381) {
        abstractC6381.m19929(this);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۥ, reason: contains not printable characters */
    public void m19926(AbstractC6381 abstractC6381, AbstractC6381 abstractC63812) {
        C8159.m26903(abstractC6381.f16148 == this);
        C8159.m26910(abstractC63812);
        if (abstractC6381 == abstractC63812) {
            return;
        }
        AbstractC6381 abstractC63813 = abstractC63812.f16148;
        if (abstractC63813 != null) {
            abstractC63813.mo15597(abstractC63812);
        }
        int i = abstractC6381.f16149;
        mo13694().set(i, abstractC63812);
        abstractC63812.f16148 = this;
        abstractC63812.m19930(i);
        abstractC6381.f16148 = null;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۦ, reason: contains not printable characters */
    public void m19927(AbstractC6381 abstractC6381) {
        C8159.m26910(abstractC6381);
        C8159.m26910(this.f16148);
        this.f16148.m19926(this, abstractC6381);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۧ */
    public AbstractC6381 mo13703() {
        AbstractC6381 abstractC6381 = this;
        while (true) {
            AbstractC6381 abstractC63812 = abstractC6381.f16148;
            if (abstractC63812 == null) {
                return abstractC6381;
            }
            abstractC6381 = abstractC63812;
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۤۨ, reason: contains not printable characters */
    public void m19928(String str) {
        C8159.m26910(str);
        mo13692(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ, reason: contains not printable characters */
    public void m19929(AbstractC6381 abstractC6381) {
        C8159.m26910(abstractC6381);
        AbstractC6381 abstractC63812 = this.f16148;
        if (abstractC63812 != null) {
            abstractC63812.mo15597(this);
        }
        this.f16148 = abstractC6381;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۟, reason: contains not printable characters */
    public void m19930(int i) {
        this.f16149 = i;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥ۠ */
    public AbstractC6381 mo12985() {
        return mo13691(null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۡ, reason: contains not printable characters */
    public int m19931() {
        return this.f16149;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۢ, reason: contains not printable characters */
    public List<AbstractC6381> m19932() {
        AbstractC6381 abstractC6381 = this.f16148;
        if (abstractC6381 == null) {
            return Collections.emptyList();
        }
        List<AbstractC6381> listMo13694 = abstractC6381.mo13694();
        ArrayList arrayList = new ArrayList(listMo13694.size() - 1);
        for (AbstractC6381 abstractC63812 : listMo13694) {
            if (abstractC63812 != this) {
                arrayList.add(abstractC63812);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۣ, reason: contains not printable characters */
    public C7003 m19933() {
        return C7003.m21629(this, true);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۤ */
    public AbstractC6381 mo13704(InterfaceC6387 interfaceC6387) {
        C8159.m26910(interfaceC6387);
        C6385.m19940(interfaceC6387, this);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۥ, reason: contains not printable characters */
    public AbstractC6381 m19934() {
        C8159.m26910(this.f16148);
        AbstractC6381 abstractC6381M19906 = m19906();
        this.f16148.m19898(this.f16149, m19904());
        m19924();
        return abstractC6381M19906;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۥۦ */
    public AbstractC6381 mo13705(String str) {
        C8159.m26907(str);
        AbstractC6381 abstractC6381 = this.f16148;
        List<AbstractC6381> listM21008 = C6386.m2838(this).m21008(str, (abstractC6381 == null || !(abstractC6381 instanceof C4605)) ? this instanceof C4605 ? (C4605) this : null : (C4605) abstractC6381, mo13686());
        AbstractC6381 abstractC63812 = listM21008.get(0);
        if (!(abstractC63812 instanceof C4605)) {
            return this;
        }
        C4605 c4605 = (C4605) abstractC63812;
        C4605 c4605M19907 = m19907(c4605);
        AbstractC6381 abstractC63813 = this.f16148;
        if (abstractC63813 != null) {
            abstractC63813.m19926(this, c4605);
        }
        c4605M19907.m19899(this);
        if (listM21008.size() > 0) {
            for (int i = 0; i < listM21008.size(); i++) {
                AbstractC6381 abstractC63814 = listM21008.get(i);
                if (c4605 != abstractC63814) {
                    AbstractC6381 abstractC63815 = abstractC63814.f16148;
                    if (abstractC63815 != null) {
                        abstractC63815.mo15597(abstractC63814);
                    }
                    c4605.mo13682(abstractC63814);
                }
            }
        }
        return this;
    }
}
