package Yue;

import Yue.AbstractC4662;
import Yue.C4483;
import Yue.C7615;
import Yue.InterfaceC6382;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import net.bytebuddy.pool.TypePool;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۥۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4605 extends AbstractC6381 {

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public static final List<C4605> f9881 = Collections.emptyList();

    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public static final Pattern f9882 = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public static final String f9883 = C3456.m9184("baseUri");

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public C7719 f9884;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public WeakReference<List<C4605>> f9885;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public List<AbstractC6381> f9886;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public C3456 f9887;

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۥۥ$ۥ */
    public static final class C0448 extends AbstractC3706<AbstractC6381> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final C4605 f9888;

        public C0448(C4605 c4605, int i) {
            super(i);
            this.f9888 = c4605;
        }

        @Override // Yue.AbstractC3706
        /* JADX INFO: renamed from: ۥ۟۟ */
        public void mo10156() {
            this.f9888.mo13699();
        }
    }

    /* JADX INFO: renamed from: Yue.ۥ۠۠ۥۥ$ۥ۟ */
    public static class C0449 implements InterfaceC6387 {

        /* JADX INFO: renamed from: ۥ */
        public final StringBuilder f994;

        public C0449(StringBuilder sb) {
            this.f994 = sb;
        }

        @Override // Yue.InterfaceC6387
        /* JADX INFO: renamed from: ۥ */
        public void mo891(AbstractC6381 abstractC6381, int i) {
            if (abstractC6381 instanceof C7755) {
                C4605.m13674(this.f994, (C7755) abstractC6381);
            } else if (abstractC6381 instanceof C4605) {
                C4605 c4605 = (C4605) abstractC6381;
                if (this.f994.length() > 0) {
                    if ((c4605.m13781() || c4605.m19913("br")) && !C7755.m24628(this.f994)) {
                        this.f994.append(' ');
                    }
                }
            }
        }

        @Override // Yue.InterfaceC6387
        /* JADX INFO: renamed from: ۥ۟ */
        public void mo892(AbstractC6381 abstractC6381, int i) {
            if (abstractC6381 instanceof C4605) {
                C4605 c4605 = (C4605) abstractC6381;
                AbstractC6381 abstractC6381M19914 = abstractC6381.m19914();
                if (c4605.m13781()) {
                    if (((abstractC6381M19914 instanceof C7755) || ((abstractC6381M19914 instanceof C4605) && !((C4605) abstractC6381M19914).f9884.m24548())) && !C7755.m24628(this.f994)) {
                        this.f994.append(' ');
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4605(String str, String str2) {
        this(C7719.m24546(str, str2, C6616.f16979), (String) null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ, reason: contains not printable characters */
    public static void m13674(StringBuilder sb, C7755 c7755) {
        String strM24631 = c7755.m24631();
        if (m13680(c7755.f16148) || (c7755 instanceof C3632)) {
            sb.append(strM24631);
        } else {
            C7615.m3764(sb, strM24631, C7755.m24628(sb));
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۡ, reason: contains not printable characters */
    public static void m13675(AbstractC6381 abstractC6381, StringBuilder sb) {
        if (abstractC6381 instanceof C7755) {
            sb.append(((C7755) abstractC6381).m24631());
        } else if (abstractC6381.m19913("br")) {
            sb.append("\n");
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۨ, reason: contains not printable characters */
    public static <E extends C4605> int m13676(C4605 c4605, List<E> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == c4605) {
                return i;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۥ, reason: contains not printable characters */
    public static /* synthetic */ void m13677(StringBuilder sb, AbstractC6381 abstractC6381, int i) {
        if (abstractC6381 instanceof C4299) {
            sb.append(((C4299) abstractC6381).m12417());
        } else if (abstractC6381 instanceof C3929) {
            sb.append(((C3929) abstractC6381).m11195());
        } else if (abstractC6381 instanceof C3632) {
            sb.append(((C3632) abstractC6381).m24631());
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۦ, reason: contains not printable characters */
    public static /* synthetic */ InterfaceC6382.EnumC0967 m13678(AtomicBoolean atomicBoolean, AbstractC6381 abstractC6381, int i) {
        if (!(abstractC6381 instanceof C7755) || ((C7755) abstractC6381).m24632()) {
            return InterfaceC6382.EnumC0967.CONTINUE;
        }
        atomicBoolean.set(true);
        return InterfaceC6382.EnumC0967.STOP;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۡ, reason: contains not printable characters */
    public static boolean m13680(AbstractC6381 abstractC6381) {
        if (abstractC6381 instanceof C4605) {
            C4605 c4605Mo13701 = (C4605) abstractC6381;
            int i = 0;
            while (!c4605Mo13701.f9884.m24559()) {
                c4605Mo13701 = c4605Mo13701.mo13701();
                i++;
                if (i >= 6 || c4605Mo13701 == null) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۧ, reason: contains not printable characters */
    public static String m13681(C4605 c4605, String str) {
        while (c4605 != null) {
            C3456 c3456 = c4605.f9887;
            if (c3456 != null && c3456.m9200(str)) {
                return c4605.f9887.m9195(str);
            }
            c4605 = c4605.mo13701();
        }
        return "";
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public C3456 mo13685() {
        if (this.f9887 == null) {
            this.f9887 = new C3456();
        }
        return this.f9887;
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public String mo13686() {
        return m13681(this, f9883);
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public int mo13689() {
        return this.f9886.size();
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public void mo13692(String str) {
        mo13685().m9208(f9883, str);
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public List<AbstractC6381> mo13694() {
        if (this.f9886 == AbstractC6381.f16146) {
            this.f9886 = new C0448(this, 4);
        }
        return this.f9886;
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public boolean mo13697() {
        return this.f9887 != null;
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public <T extends Appendable> T mo13698(T t) {
        int size = this.f9886.size();
        for (int i = 0; i < size; i++) {
            this.f9886.get(i).m19917(t);
        }
        return t;
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public String mo9885() {
        return this.f9884.m24549();
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void mo13699() {
        super.mo13699();
        this.f9885 = null;
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String mo13700() {
        return this.f9884.m24558();
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣۣ۟۟ */
    public void mo9886(Appendable appendable, int i, C4483.C0414 c0414) throws IOException {
        if (m13810(c0414) && (!(appendable instanceof StringBuilder) || ((StringBuilder) appendable).length() > 0)) {
            m19910(appendable, i, c0414);
        }
        appendable.append(C8039.f23875).append(m13816());
        C3456 c3456 = this.f9887;
        if (c3456 != null) {
            c3456.m9203(appendable, c0414);
        }
        if (!this.f9886.isEmpty() || !this.f9884.m24556()) {
            appendable.append(C8039.f23876);
        } else if (c0414.m13028() == C4483.C0414.EnumC4484.html && this.f9884.m24551()) {
            appendable.append(C8039.f23876);
        } else {
            appendable.append(" />");
        }
    }

    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟ۤ */
    public void mo9887(Appendable appendable, int i, C4483.C0414 c0414) throws IOException {
        if (this.f9886.isEmpty() && this.f9884.m24556()) {
            return;
        }
        if (c0414.m13027() && !this.f9886.isEmpty() && ((this.f9884.m24548() && !m13680(this.f16148)) || (c0414.m13024() && (this.f9886.size() > 1 || (this.f9886.size() == 1 && (this.f9886.get(0) instanceof C4605)))))) {
            m19910(appendable, i, c0414);
        }
        appendable.append("</").append(m13816()).append(C8039.f23876);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۡ, reason: contains not printable characters */
    public C4605 m13706(String str) {
        C8159.m26910(str);
        Set<String> setM13727 = m13727();
        setM13727.add(str);
        m13726(setM13727);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟ۡ(LYue/ۥۣۡۢۤ;)LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۦۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13682(AbstractC6381 abstractC6381) {
        return (C4605) super.mo13682(abstractC6381);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟ۢ(Ljava/lang/String;)LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۦۣ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13683(String str) {
        return (C4605) super.mo13683(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۤ, reason: contains not printable characters */
    public C4605 m13709(String str) {
        C8159.m26910(str);
        m19899((AbstractC6381[]) C6386.m2838(this).m21008(str, this, mo13686()).toArray(new AbstractC6381[0]));
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۥ, reason: contains not printable characters */
    public C4605 m13710(AbstractC6381 abstractC6381) {
        C8159.m26910(abstractC6381);
        m19925(abstractC6381);
        mo13694();
        this.f9886.add(abstractC6381);
        abstractC6381.m19930(this.f9886.size() - 1);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۦ, reason: contains not printable characters */
    public C4605 m13711(Collection<? extends AbstractC6381> collection) {
        m13777(-1, collection);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۧ, reason: contains not printable characters */
    public C4605 m13712(String str) {
        return m13713(str, this.f9884.m24557());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۦۨ, reason: contains not printable characters */
    public C4605 m13713(String str, String str2) {
        C4605 c4605 = new C4605(C7719.m24546(str, str2, C6386.m2838(this).m21014()), mo13686());
        m13710(c4605);
        return c4605;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۟, reason: contains not printable characters */
    public C4605 m13714(String str) {
        C8159.m26910(str);
        m13710(new C7755(str));
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧ۠, reason: contains not printable characters */
    public C4605 m13715(C4605 c4605) {
        C8159.m26910(c4605);
        c4605.m13710(this);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟۟(Ljava/lang/String;Ljava/lang/String;)LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۧۢ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13684(String str, String str2) {
        super.mo13684(str, str2);
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۧ, reason: contains not printable characters */
    public C4605 m13717(String str, boolean z) {
        mo13685().m9209(str, z);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۤ, reason: contains not printable characters */
    public C3454 m13718(String str) {
        if (mo13697()) {
            return mo13685().m9190(str);
        }
        return null;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۟ۨ(LYue/ۥۣۡۢۤ;)LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۧۥ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13687(AbstractC6381 abstractC6381) {
        return (C4605) super.mo13687(abstractC6381);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠۟(Ljava/lang/String;)LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۧۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13688(String str) {
        return (C4605) super.mo13688(str);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۧ, reason: contains not printable characters */
    public C4605 m13721(int i) {
        return m13722().get(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۧۨ, reason: contains not printable characters */
    public List<C4605> m13722() {
        List<C4605> list;
        if (mo13689() == 0) {
            return f9881;
        }
        WeakReference<List<C4605>> weakReference = this.f9885;
        if (weakReference != null && (list = weakReference.get()) != null) {
            return list;
        }
        int size = this.f9886.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            AbstractC6381 abstractC6381 = this.f9886.get(i);
            if (abstractC6381 instanceof C4605) {
                arrayList.add((C4605) abstractC6381);
            }
        }
        this.f9885 = new WeakReference<>(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ, reason: contains not printable characters */
    public C4607 m13723() {
        return new C4607(m13722());
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۟, reason: contains not printable characters */
    public int m13724() {
        return m13722().size();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨ۠, reason: contains not printable characters */
    public String m13725() {
        return mo17594(Name.LABEL).trim();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۡ, reason: contains not printable characters */
    public C4605 m13726(Set<String> set) {
        C8159.m26910(set);
        if (set.isEmpty()) {
            mo13685().m9212(Name.LABEL);
        } else {
            mo13685().m9208(Name.LABEL, C7615.m23819(set, " "));
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۢ, reason: contains not printable characters */
    public Set<String> m13727() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(f9882.split(m13725())));
        linkedHashSet.remove("");
        return linkedHashSet;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟۠ۧ()LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۟ۨ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13690() {
        if (this.f9887 != null) {
            super.mo13690();
            if (this.f9887.size() == 0) {
                this.f9887 = null;
            }
        }
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡ۟()LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۟ۨۤ, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public C4605 mo12984() {
        return (C4605) super.mo12984();
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۥ, reason: contains not printable characters */
    public C4605 m13729(AbstractC4662 abstractC4662) {
        C8159.m26910(abstractC4662);
        C4605 c4605Mo13703 = mo13703();
        C4605 c4605Mo13701 = this;
        while (!abstractC4662.m14004(c4605Mo13703, c4605Mo13701)) {
            c4605Mo13701 = c4605Mo13701.mo13701();
            if (c4605Mo13701 == null) {
                return null;
            }
        }
        return c4605Mo13701;
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۦ, reason: contains not printable characters */
    public C4605 m13730(String str) {
        return m13729(C6851.m21597(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0039, code lost:
    
        if (r2.get(0) == r5) goto L10;
     */
    /* JADX INFO: renamed from: ۥ۟۟ۨۧ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String m13731() {
        if (m13776().length() > 0) {
            String str = "#" + C7863.m24975(m13776());
            C4483 c4483M19918 = m19918();
            if (c4483M19918 != null) {
                C4607 c4607M13805 = c4483M19918.m13805(str);
                if (c4607M13805.size() == 1) {
                }
            }
            return str;
        }
        StringBuilder sbM3765 = C7615.m3765();
        for (C4605 c4605Mo13701 = this; c4605Mo13701 != null && !(c4605Mo13701 instanceof C4483); c4605Mo13701 = c4605Mo13701.mo13701()) {
            sbM3765.insert(0, c4605Mo13701.m13732());
        }
        return C7615.m23825(sbM3765);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۨۨ, reason: contains not printable characters */
    public final String m13732() {
        String strReplace = C7863.m24975(m13816()).replace("\\:", "|");
        StringBuilder sbM3765 = C7615.m3765();
        sbM3765.append(strReplace);
        C7615.C1307 c1307 = new C7615.C1307(".");
        Iterator<String> it = m13727().iterator();
        while (it.hasNext()) {
            c1307.m3766(C7863.m24975(it.next()));
        }
        String strM23830 = c1307.m23830();
        if (strM23830.length() > 0) {
            sbM3765.append(TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
            sbM3765.append(strM23830);
        }
        if (mo13701() == null || (mo13701() instanceof C4483)) {
            return C7615.m23825(sbM3765);
        }
        sbM3765.insert(0, " > ");
        if (mo13701().m13805(sbM3765.toString()).size() > 1) {
            sbM3765.append(String.format(":nth-child(%d)", Integer.valueOf(m13738() + 1)));
        }
        return C7615.m23825(sbM3765);
    }

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public String m13733() {
        final StringBuilder sbM3765 = C7615.m3765();
        mo13704(new InterfaceC6387() { // from class: Yue.ۥ۠۠ۥۢ
            @Override // Yue.InterfaceC6387
            /* JADX INFO: renamed from: ۥ */
            public final void mo891(AbstractC6381 abstractC6381, int i) {
                C4605.m13677(sbM3765, abstractC6381, i);
            }
        });
        return C7615.m23825(sbM3765);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟, reason: contains not printable characters */
    public List<C4299> m13734() {
        return m13743(C4299.class);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟۟, reason: contains not printable characters */
    public Map<String, String> m13735() {
        return mo13685().m9193();
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡ۠(LYue/ۥۣۡۢۤ;)LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۠۟۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13691(AbstractC6381 abstractC6381) {
        C4605 c4605 = (C4605) super.mo13691(abstractC6381);
        C3456 c3456 = this.f9887;
        c4605.f9887 = c3456 != null ? c3456.clone() : null;
        C0448 c0448 = new C0448(c4605, this.f9886.size());
        c4605.f9886 = c0448;
        c0448.addAll(this.f9886);
        return c4605;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۡ, reason: contains not printable characters */
    public boolean m13737(String str, String str2) {
        return this.f9884.m24558().equals(str) && this.f9884.m24557().equals(str2);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۢ, reason: contains not printable characters */
    public int m13738() {
        if (mo13701() == null) {
            return 0;
        }
        return m13676(this, mo13701().m13722());
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡۢ()LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13693() {
        Iterator<AbstractC6381> it = this.f9886.iterator();
        while (it.hasNext()) {
            it.next().f16148 = null;
        }
        this.f9886.clear();
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۤ, reason: contains not printable characters */
    public C7003 m13740() {
        return C7003.m21629(this, false);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۥ, reason: contains not printable characters */
    public C4605 m13741(String str) {
        return (C4605) C8159.m26898(C7293.m22787(str, this), mo13701() != null ? "No elements matched the query '%s' on element '%s'." : "No elements matched the query '%s' in the document.", str, m13816());
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡۤ(LYue/ۥۣۡۢۥ;)LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۠۟ۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13695(InterfaceC6382 interfaceC6382) {
        return (C4605) super.mo13695(interfaceC6382);
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۧ, reason: contains not printable characters */
    public final <T> List<T> m13743(final Class<T> cls) {
        Stream<AbstractC6381> stream = this.f9886.stream();
        Objects.requireNonNull(cls);
        return (List) stream.filter(new Predicate() { // from class: Yue.ۥ۠۠ۥ۟
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return cls.isInstance((AbstractC6381) obj);
            }
        }).map(new Function() { // from class: Yue.ۥ۠۠ۥ۠
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return cls.cast((AbstractC6381) obj);
            }
        }).collect(Collectors.collectingAndThen(Collectors.toList(), new Function() { // from class: Yue.ۥ۠۠ۥۡ
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return Collections.unmodifiableList((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: ۥ۟۠۟ۨ, reason: contains not printable characters */
    public C4605 m13744() {
        for (AbstractC6381 abstractC6381M19906 = m19906(); abstractC6381M19906 != null; abstractC6381M19906 = abstractC6381M19906.m19914()) {
            if (abstractC6381M19906 instanceof C4605) {
                return (C4605) abstractC6381M19906;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠۠, reason: contains not printable characters */
    public C4605 m13745() {
        return mo13701() != null ? mo13701().m13744() : this;
    }

    @Deprecated
    /* JADX INFO: renamed from: ۥ۟۠۠۟, reason: contains not printable characters */
    public C4605 m13746(Consumer<? super C4605> consumer) {
        m13812().forEach(consumer);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۡۦ(Ljava/util/function/Consumer;)LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۠۠۠, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13696(Consumer<? super AbstractC6381> consumer) {
        return (C4605) super.mo13696(consumer);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۡ, reason: contains not printable characters */
    public C4607 m13748() {
        return C3892.m919(new AbstractC4662.C0466(), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۢ, reason: contains not printable characters */
    public C4605 m13749(String str) {
        C8159.m26907(str);
        C4607 c4607M919 = C3892.m919(new AbstractC4662.C4678(str), this);
        if (c4607M919.size() > 0) {
            return c4607M919.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public C4607 m13750(String str) {
        C8159.m26907(str);
        return C3892.m919(new AbstractC4662.C0467(str.trim()), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۤ, reason: contains not printable characters */
    public C4607 m13751(String str) {
        C8159.m26907(str);
        return C3892.m919(new AbstractC4662.C4664(str.trim()), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۥ, reason: contains not printable characters */
    public C4607 m13752(String str, String str2) {
        return C3892.m919(new AbstractC4662.C4665(str, str2), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۦ, reason: contains not printable characters */
    public C4607 m13753(String str, String str2) {
        return C3892.m919(new AbstractC4662.C4666(str, str2), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۧ, reason: contains not printable characters */
    public C4607 m13754(String str, String str2) {
        return C3892.m919(new AbstractC4662.C4667(str, str2), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠۠ۨ, reason: contains not printable characters */
    public C4607 m13755(String str, String str2) {
        try {
            return m13756(str, Pattern.compile(str2));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Pattern syntax error: " + str2, e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ, reason: contains not printable characters */
    public C4607 m13756(String str, Pattern pattern) {
        return C3892.m919(new AbstractC4662.C4668(str, pattern), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۟, reason: contains not printable characters */
    public C4607 m13757(String str, String str2) {
        return C3892.m919(new AbstractC4662.C4669(str, str2), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡ۠, reason: contains not printable characters */
    public C4607 m13758(String str, String str2) {
        return C3892.m919(new AbstractC4662.C4670(str, str2), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۡ, reason: contains not printable characters */
    public C4607 m13759(String str) {
        C8159.m26907(str);
        return C3892.m919(new AbstractC4662.C4671(str), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۢ, reason: contains not printable characters */
    public C4607 m13760(int i) {
        return C3892.m919(new AbstractC4662.C4679(i), this);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public C4607 m13761(int i) {
        return C3892.m919(new AbstractC4662.C4681(i), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۤ, reason: contains not printable characters */
    public C4607 m13762(int i) {
        return C3892.m919(new AbstractC4662.C4682(i), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۥ, reason: contains not printable characters */
    public C4607 m13763(String str) {
        C8159.m26907(str);
        return C3892.m919(new AbstractC4662.C4700(C6396.m2840(str)), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۦ, reason: contains not printable characters */
    public C4607 m13764(String str) {
        return C3892.m919(new AbstractC4662.C4673(str), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۧ, reason: contains not printable characters */
    public C4607 m13765(String str) {
        return C3892.m919(new AbstractC4662.C4674(str), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۡۨ, reason: contains not printable characters */
    public C4607 m13766(String str) {
        try {
            return m13767(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ, reason: contains not printable characters */
    public C4607 m13767(Pattern pattern) {
        return C3892.m919(new AbstractC4662.C4697(pattern), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۟, reason: contains not printable characters */
    public C4607 m13768(String str) {
        try {
            return m13769(Pattern.compile(str));
        } catch (PatternSyntaxException e) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e);
        }
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢ۠, reason: contains not printable characters */
    public C4607 m13769(Pattern pattern) {
        return C3892.m919(new AbstractC4662.C4696(pattern), this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۡ, reason: contains not printable characters */
    public boolean m13770() {
        return this.f9886 != AbstractC6381.f16146;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۢ, reason: contains not printable characters */
    public boolean m13771(String str) {
        C3456 c3456 = this.f9887;
        if (c3456 == null) {
            return false;
        }
        String strM9196 = c3456.m9196(Name.LABEL);
        int length = strM9196.length();
        int length2 = str.length();
        if (length != 0 && length >= length2) {
            if (length == length2) {
                return str.equalsIgnoreCase(strM9196);
            }
            boolean z = false;
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (Character.isWhitespace(strM9196.charAt(i2))) {
                    if (!z) {
                        continue;
                    } else {
                        if (i2 - i == length2 && strM9196.regionMatches(true, i, str, 0, length2)) {
                            return true;
                        }
                        z = false;
                    }
                } else if (!z) {
                    i = i2;
                    z = true;
                }
            }
            if (z && length - i == length2) {
                return strM9196.regionMatches(true, i, str, 0, length2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public boolean m13772() {
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        mo13695(new InterfaceC6382() { // from class: Yue.ۥ۠۠ۥۤ
            @Override // Yue.InterfaceC6382
            /* JADX INFO: renamed from: ۥ */
            public final InterfaceC6382.EnumC0967 mo1559(AbstractC6381 abstractC6381, int i) {
                return C4605.m13678(atomicBoolean, abstractC6381, i);
            }
        });
        return atomicBoolean.get();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۤ, reason: contains not printable characters */
    public C4605 m13773(String str) {
        mo13693();
        m13709(str);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۥ, reason: contains not printable characters */
    public String m13774() {
        StringBuilder sbM3765 = C7615.m3765();
        mo13698(sbM3765);
        String strM23825 = C7615.m23825(sbM3765);
        return C6386.m2837(this).m13027() ? strM23825.trim() : strM23825;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۦ, reason: contains not printable characters */
    public C4605 m13775(String str) {
        C8159.m26910(str);
        mo13684(Name.MARK, str);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۢۧ, reason: contains not printable characters */
    public String m13776() {
        C3456 c3456 = this.f9887;
        return c3456 != null ? c3456.m9196(Name.MARK) : "";
    }

    /* JADX INFO: renamed from: ۥۣ۟۠, reason: contains not printable characters */
    public C4605 m13777(int i, Collection<? extends AbstractC6381> collection) {
        C8159.m26911(collection, "Children collection to be inserted must not be null.");
        int iMo13689 = mo13689();
        if (i < 0) {
            i += iMo13689 + 1;
        }
        C8159.m26904(i >= 0 && i <= iMo13689, "Insert position out of bounds.");
        m19898(i, (AbstractC6381[]) new ArrayList(collection).toArray(new AbstractC6381[0]));
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۟, reason: contains not printable characters */
    public C4605 m13778(int i, AbstractC6381... abstractC6381Arr) {
        C8159.m26911(abstractC6381Arr, "Children collection to be inserted must not be null.");
        int iMo13689 = mo13689();
        if (i < 0) {
            i += iMo13689 + 1;
        }
        C8159.m26904(i >= 0 && i <= iMo13689, "Insert position out of bounds.");
        m19898(i, abstractC6381Arr);
        return this;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠۠, reason: contains not printable characters */
    public boolean m13779(AbstractC4662 abstractC4662) {
        return abstractC4662.m14004(mo13703(), this);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۡ, reason: contains not printable characters */
    public boolean m13780(String str) {
        return m13779(C6851.m21597(str));
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۢ, reason: contains not printable characters */
    public boolean m13781() {
        return this.f9884.m24550();
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۠, reason: contains not printable characters */
    public final boolean m13782(C4483.C0414 c0414) {
        return this.f9884.m24550() || (mo13701() != null && mo13701().m13813().m24548()) || c0414.m13024();
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public final boolean m13783(C4483.C0414 c0414) {
        if (this.f9884.m24554()) {
            return ((mo13701() != null && !mo13701().m13781()) || m19911() || c0414.m13024() || m19913("br")) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۨ, reason: contains not printable characters */
    public C4605 m13784() {
        for (AbstractC6381 abstractC6381M19912 = m19912(); abstractC6381M19912 != null; abstractC6381M19912 = abstractC6381M19912.m19922()) {
            if (abstractC6381M19912 instanceof C4605) {
                return (C4605) abstractC6381M19912;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ, reason: contains not printable characters */
    public C4605 m13785() {
        return mo13701() != null ? mo13701().m13784() : this;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ۟, reason: contains not printable characters */
    public C4605 m13786() {
        AbstractC6381 abstractC6381M19914 = this;
        do {
            abstractC6381M19914 = abstractC6381M19914.m19914();
            if (abstractC6381M19914 == null) {
                return null;
            }
        } while (!(abstractC6381M19914 instanceof C4605));
        return (C4605) abstractC6381M19914;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤ۠, reason: contains not printable characters */
    public C4607 m13787() {
        return m13788(true);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۡ, reason: contains not printable characters */
    public final C4607 m13788(boolean z) {
        C4607 c4607 = new C4607();
        if (this.f16148 == null) {
            return c4607;
        }
        c4607.add(this);
        return z ? c4607.m13852() : c4607.m13860();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۢ, reason: contains not printable characters */
    public String m13789() {
        StringBuilder sbM3765 = C7615.m3765();
        m13790(sbM3765);
        return C7615.m23825(sbM3765).trim();
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۤ, reason: contains not printable characters */
    public final void m13790(StringBuilder sb) {
        for (int i = 0; i < mo13689(); i++) {
            AbstractC6381 abstractC6381 = this.f9886.get(i);
            if (abstractC6381 instanceof C7755) {
                m13674(sb, (C7755) abstractC6381);
            } else if (abstractC6381.m19913("br") && !C7755.m24628(sb)) {
                sb.append(" ");
            }
        }
    }

    /* JADX DEBUG: Method merged with bridge method: ۥۣ۟۟ۦ()LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۠ۤۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C4605 mo13701() {
        return (C4605) this.f16148;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۥ, reason: contains not printable characters */
    public C4607 m13792() {
        C4607 c4607 = new C4607();
        for (C4605 c4605Mo13701 = mo13701(); c4605Mo13701 != null && !c4605Mo13701.m19913("#root"); c4605Mo13701 = c4605Mo13701.mo13701()) {
            c4607.add(c4605Mo13701);
        }
        return c4607;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۦ, reason: contains not printable characters */
    public C4605 m13793(String str) {
        C8159.m26910(str);
        m19898(0, (AbstractC6381[]) C6386.m2838(this).m21008(str, this, mo13686()).toArray(new AbstractC6381[0]));
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۧ, reason: contains not printable characters */
    public C4605 m13794(AbstractC6381 abstractC6381) {
        C8159.m26910(abstractC6381);
        m19898(0, abstractC6381);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۤۨ, reason: contains not printable characters */
    public C4605 m13795(Collection<? extends AbstractC6381> collection) {
        m13777(0, collection);
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ, reason: contains not printable characters */
    public C4605 m13796(String str) {
        return m13797(str, this.f9884.m24557());
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ۟, reason: contains not printable characters */
    public C4605 m13797(String str, String str2) {
        C4605 c4605 = new C4605(C7719.m24546(str, str2, C6386.m2838(this).m21014()), mo13686());
        m13794(c4605);
        return c4605;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥ۠, reason: contains not printable characters */
    public C4605 m13798(String str) {
        C8159.m26910(str);
        m13794(new C7755(str));
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۢ, reason: contains not printable characters */
    public C4605 m13799() {
        AbstractC6381 abstractC6381M19922 = this;
        do {
            abstractC6381M19922 = abstractC6381M19922.m19922();
            if (abstractC6381M19922 == null) {
                return null;
            }
        } while (!(abstractC6381M19922 instanceof C4605));
        return (C4605) abstractC6381M19922;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۣ, reason: contains not printable characters */
    public C4607 m13800() {
        return m13788(false);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۤۢ(Ljava/lang/String;)LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۠ۥۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13702(String str) {
        return (C4605) super.mo13702(str);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۥ, reason: contains not printable characters */
    public C4605 m13802(String str) {
        C8159.m26910(str);
        Set<String> setM13727 = m13727();
        setM13727.remove(str);
        m13726(setM13727);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۤۧ()LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۠ۥۦ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13703() {
        return (C4605) super.mo13703();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۥۨ, reason: contains not printable characters */
    public C4607 m13804(AbstractC4662 abstractC4662) {
        return C7293.m3551(abstractC4662, this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦ, reason: contains not printable characters */
    public C4607 m13805(String str) {
        return C7293.m22785(str, this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦ۟, reason: contains not printable characters */
    public C4605 m13806(AbstractC4662 abstractC4662) {
        return C3892.m920(abstractC4662, this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦ۠, reason: contains not printable characters */
    public C4605 m13807(String str) {
        return C7293.m22787(str, this);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۡ, reason: contains not printable characters */
    public C4607 m13808(String str) {
        return new C4607((List<C4605>) C6386.m19941(str, this, C4605.class));
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۢ, reason: contains not printable characters */
    public <T extends AbstractC6381> List<T> m13809(String str, Class<T> cls) {
        return C6386.m19941(str, this, cls);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۥ۠()LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۠ۦۣ */
    public C4605 mo12985() {
        String strMo13686 = mo13686();
        if (strMo13686.isEmpty()) {
            strMo13686 = null;
        }
        C7719 c7719 = this.f9884;
        C3456 c3456 = this.f9887;
        return new C4605(c7719, strMo13686, c3456 != null ? c3456.clone() : null);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۤ, reason: contains not printable characters */
    public boolean m13810(C4483.C0414 c0414) {
        return c0414.m13027() && m13782(c0414) && !m13783(c0414) && !m13680(this.f16148);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۥ, reason: contains not printable characters */
    public C4607 m13811() {
        if (this.f16148 == null) {
            return new C4607(0);
        }
        List<C4605> listM13722 = mo13701().m13722();
        C4607 c4607 = new C4607(listM13722.size() - 1);
        for (C4605 c4605 : listM13722) {
            if (c4605 != this) {
                c4607.add(c4605);
            }
        }
        return c4607;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۦ, reason: contains not printable characters */
    public Stream<C4605> m13812() {
        return C6386.m19943(this, C4605.class);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۧ, reason: contains not printable characters */
    public C7719 m13813() {
        return this.f9884;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۦۨ, reason: contains not printable characters */
    public C4605 m13814(String str) {
        return m13815(str, this.f9884.m24557());
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧ, reason: contains not printable characters */
    public C4605 m13815(String str, String str2) {
        C8159.m26909(str, "tagName");
        C8159.m26909(str2, "namespace");
        this.f9884 = C7719.m24546(str, str2, C6386.m2838(this).m21014());
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧ۟, reason: contains not printable characters */
    public String m13816() {
        return this.f9884.m24549();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧ۠ */
    public C4605 mo12986(String str) {
        C8159.m26910(str);
        mo13693();
        C4483 c4483M19918 = m19918();
        if (c4483M19918 == null || !c4483M19918.m13004().m21004(mo13700())) {
            m13710(new C7755(str));
        } else {
            m13710(new C4299(str));
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۡ, reason: contains not printable characters */
    public String m13817() {
        StringBuilder sbM3765 = C7615.m3765();
        C6385.m19940(new C0449(sbM3765), this);
        return C7615.m23825(sbM3765).trim();
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۢ, reason: contains not printable characters */
    public List<C7755> m13818() {
        return m13743(C7755.class);
    }

    /* JADX INFO: renamed from: ۥۣ۟۠ۧ, reason: contains not printable characters */
    public C4605 m13819(String str) {
        C8159.m26910(str);
        Set<String> setM13727 = m13727();
        if (setM13727.contains(str)) {
            setM13727.remove(str);
        } else {
            setM13727.add(str);
        }
        m13726(setM13727);
        return this;
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۥۤ(LYue/ۥۡۢۤ۟;)LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۠ۧۤ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13704(InterfaceC6387 interfaceC6387) {
        return (C4605) super.mo13704(interfaceC6387);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۥ, reason: contains not printable characters */
    public C4605 m13821(String str) {
        if (m13737("textarea", C6617.f16980)) {
            mo12986(str);
        } else {
            mo13684("value", str);
        }
        return this;
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۦ, reason: contains not printable characters */
    public String m13822() {
        return m13737("textarea", C6617.f16980) ? m13817() : mo17594("value");
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۧ, reason: contains not printable characters */
    public String m13823() {
        StringBuilder sbM3765 = C7615.m3765();
        int iMo13689 = mo13689();
        for (int i = 0; i < iMo13689; i++) {
            m13675(this.f9886.get(i), sbM3765);
        }
        return C7615.m23825(sbM3765);
    }

    /* JADX INFO: renamed from: ۥ۟۠ۧۨ, reason: contains not printable characters */
    public String m13824() {
        final StringBuilder sbM3765 = C7615.m3765();
        m19915().forEach(new Consumer() { // from class: Yue.ۥ۠۠ۥۣ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                C4605.m13675((AbstractC6381) obj, sbM3765);
            }
        });
        return C7615.m23825(sbM3765);
    }

    /* JADX DEBUG: Method merged with bridge method: ۥ۟۟ۥۦ(Ljava/lang/String;)LYue/ۥۣۡۢۤ; */
    @Override // Yue.AbstractC6381
    /* JADX INFO: renamed from: ۥ۟۠ۨ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public C4605 mo13705(String str) {
        return (C4605) super.mo13705(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C4605(String str) {
        this(C7719.m24546(str, C6617.f16980, C6616.f16979), "", null);
    }

    public C4605(C7719 c7719, String str, C3456 c3456) {
        C8159.m26910(c7719);
        this.f9886 = AbstractC6381.f16146;
        this.f9887 = c3456;
        this.f9884 = c7719;
        if (str != null) {
            m19928(str);
        }
    }

    public C4605(C7719 c7719, String str) {
        this(c7719, str, null);
    }
}
