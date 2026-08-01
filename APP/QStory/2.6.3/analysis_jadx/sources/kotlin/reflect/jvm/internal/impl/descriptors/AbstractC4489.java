package kotlin.reflect.jvm.internal.impl.descriptors;

import io.ktor.util.C4211;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.collections.AbstractC4347;
import p066.AbstractC6870;
import p079.C6983;
import p100.InterfaceC7244;
import p104.C7289;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4489 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4490 f13115;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4490 f13116;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4490 f13117;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4490 f13118;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4490 f13119;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4490 f13120;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C7289 f13121;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C4461 f13122;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final HashMap f13123;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4490 f13124;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4490 f13125;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C4461 f13126;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C4461 f13127;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C4490 f13128;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4490 f13129;

    static {
        C4503 c4503 = C4503.f13142;
        C4490 c4490 = new C4490(c4503, 0);
        f13120 = c4490;
        C4502 c4502 = C4502.f13141;
        C4490 c44902 = new C4490(c4502, 1);
        f13119 = c44902;
        C4506 c4506 = C4506.f13145;
        C4490 c44903 = new C4490(c4506, 2);
        f13118 = c44903;
        C4457 c4457 = C4457.f13086;
        C4490 c44904 = new C4490(c4457, 3);
        f13117 = c44904;
        C4507 c4507 = C4507.f13146;
        C4490 c44905 = new C4490(c4507, 4);
        f13116 = c44905;
        C4454 c4454 = C4454.f13085;
        C4490 c44906 = new C4490(c4454, 5);
        f13115 = c44906;
        C4458 c4458 = C4458.f13087;
        C4490 c44907 = new C4490(c4458, 6);
        f13125 = c44907;
        C4453 c4453 = C4453.f13084;
        C4490 c44908 = new C4490(c4453, 7);
        f13124 = c44908;
        C4504 c4504 = C4504.f13143;
        C4490 c44909 = new C4490(c4504, 8);
        f13128 = c44909;
        Collections.unmodifiableSet(AbstractC4347.m8845(new C4490[]{c4490, c44902, c44904, c44906}));
        HashMap map = new HashMap(6);
        map.put(c44902, 0);
        map.put(c4490, 0);
        map.put(c44904, 1);
        map.put(c44903, 1);
        map.put(c44905, 2);
        Collections.unmodifiableMap(map);
        f13129 = c44905;
        f13126 = new C4461(2);
        f13127 = new C4461(3);
        f13122 = new C4461(4);
        try {
            Iterator it = Arrays.asList(new C7289[0]).iterator();
            f13121 = it.hasNext() ? (C7289) it.next() : C7289.f19393;
            HashMap map2 = new HashMap();
            f13123 = map2;
            map2.put(c4503, c4490);
            map2.put(c4502, c44902);
            map2.put(c4506, c44903);
            map2.put(c4457, c44904);
            map2.put(c4507, c44905);
            map2.put(c4454, c44906);
            map2.put(c4458, c44907);
            map2.put(c4453, c44908);
            map2.put(c4504, c44909);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m9066(InterfaceC4480 interfaceC4480, InterfaceC4499 interfaceC4499) {
        if (interfaceC4480 == null) {
            m9071(2);
            throw null;
        }
        if (interfaceC4499 != null) {
            return m9069(f13127, interfaceC4480, interfaceC4499) == null;
        }
        m9071(3);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m9067(C4490 c4490) {
        if (c4490 != null) {
            return c4490 == f13120 || c4490 == f13119;
        }
        m9071(14);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m9068(InterfaceC4498 interfaceC4498, InterfaceC4499 interfaceC4499) {
        if (interfaceC4499 != null) {
            C4461 c4461M12102 = AbstractC6870.m12102(interfaceC4499);
            return c4461M12102 != C4461.f13088 && c4461M12102 == AbstractC6870.m12102(interfaceC4498);
        }
        m9071(7);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC4498 m9069(InterfaceC7244 interfaceC7244, InterfaceC4498 interfaceC4498, InterfaceC4499 interfaceC4499) {
        InterfaceC4498 interfaceC4498M9069;
        if (interfaceC4498 == null) {
            m9071(8);
            throw null;
        }
        if (interfaceC4499 == null) {
            m9071(9);
            throw null;
        }
        for (InterfaceC4498 interfaceC44982 = (InterfaceC4498) interfaceC4498.mo9002(); interfaceC44982 != null && interfaceC44982.getVisibility() != f13115; interfaceC44982 = (InterfaceC4498) AbstractC6870.m12113(interfaceC44982, InterfaceC4498.class, true)) {
            if (!interfaceC44982.getVisibility().m9073(interfaceC7244, interfaceC44982, interfaceC4499)) {
                return interfaceC44982;
            }
        }
        if (!(interfaceC4498 instanceof C6983) || (interfaceC4498M9069 = m9069(interfaceC7244, ((C6983) interfaceC4498).f18681, interfaceC4499)) == null) {
            return null;
        }
        return interfaceC4498M9069;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Integer m9070(C4490 c4490, C4490 c44902) {
        if (c4490 == null) {
            m9071(12);
            throw null;
        }
        AbstractC4501 abstractC4501 = c4490.f13131;
        if (c44902 == null) {
            m9071(13);
            throw null;
        }
        AbstractC4501 abstractC45012 = c44902.f13131;
        Integer numMo9100 = abstractC4501.mo9100(abstractC45012);
        if (numMo9100 != null) {
            return numMo9100;
        }
        Integer numMo91002 = abstractC45012.mo9100(abstractC4501);
        if (numMo91002 != null) {
            return Integer.valueOf(-numMo91002.intValue());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m9071(int r8) {
        /*
            r0 = 16
            if (r8 == r0) goto L7
            java.lang.String r1 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L9
        L7:
            java.lang.String r1 = "@NotNull method %s.%s must not return null"
        L9:
            r2 = 3
            r3 = 2
            if (r8 == r0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r3
        L10:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "kotlin/reflect/jvm/internal/impl/descriptors/DescriptorVisibilities"
            r6 = 1
            r7 = 0
            if (r8 == r6) goto L3a
            if (r8 == r2) goto L3a
            r2 = 5
            if (r8 == r2) goto L3a
            r2 = 7
            if (r8 == r2) goto L3a
            switch(r8) {
                case 9: goto L3a;
                case 10: goto L35;
                case 11: goto L30;
                case 12: goto L35;
                case 13: goto L30;
                case 14: goto L2b;
                case 15: goto L2b;
                case 16: goto L28;
                default: goto L23;
            }
        L23:
            java.lang.String r2 = "what"
            r4[r7] = r2
            goto L3e
        L28:
            r4[r7] = r5
            goto L3e
        L2b:
            java.lang.String r2 = "visibility"
            r4[r7] = r2
            goto L3e
        L30:
            java.lang.String r2 = "second"
            r4[r7] = r2
            goto L3e
        L35:
            java.lang.String r2 = "first"
            r4[r7] = r2
            goto L3e
        L3a:
            java.lang.String r2 = "from"
            r4[r7] = r2
        L3e:
            java.lang.String r2 = "toDescriptorVisibility"
            if (r8 == r0) goto L45
            r4[r6] = r5
            goto L47
        L45:
            r4[r6] = r2
        L47:
            switch(r8) {
                case 2: goto L70;
                case 3: goto L70;
                case 4: goto L6b;
                case 5: goto L6b;
                case 6: goto L66;
                case 7: goto L66;
                case 8: goto L61;
                case 9: goto L61;
                case 10: goto L5c;
                case 11: goto L5c;
                case 12: goto L57;
                case 13: goto L57;
                case 14: goto L52;
                case 15: goto L4f;
                case 16: goto L74;
                default: goto L4a;
            }
        L4a:
            java.lang.String r2 = "isVisible"
            r4[r3] = r2
            goto L74
        L4f:
            r4[r3] = r2
            goto L74
        L52:
            java.lang.String r2 = "isPrivate"
            r4[r3] = r2
            goto L74
        L57:
            java.lang.String r2 = "compare"
            r4[r3] = r2
            goto L74
        L5c:
            java.lang.String r2 = "compareLocal"
            r4[r3] = r2
            goto L74
        L61:
            java.lang.String r2 = "findInvisibleMember"
            r4[r3] = r2
            goto L74
        L66:
            java.lang.String r2 = "inSameFile"
            r4[r3] = r2
            goto L74
        L6b:
            java.lang.String r2 = "isVisibleWithAnyReceiver"
            r4[r3] = r2
            goto L74
        L70:
            java.lang.String r2 = "isVisibleIgnoringReceiver"
            r4[r3] = r2
        L74:
            java.lang.String r1 = java.lang.String.format(r1, r4)
            if (r8 == r0) goto L80
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>(r1)
            goto L85
        L80:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>(r1)
        L85:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4489.m9071(int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C4490 m9072(AbstractC4501 abstractC4501) {
        if (abstractC4501 == null) {
            m9071(15);
            throw null;
        }
        C4490 c4490 = (C4490) f13123.get(abstractC4501);
        if (c4490 != null) {
            return c4490;
        }
        C4211.m8604(abstractC4501, "Inapplicable visibility: ");
        return null;
    }
}
