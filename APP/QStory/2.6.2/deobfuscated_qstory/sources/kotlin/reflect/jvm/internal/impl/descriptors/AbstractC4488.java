package kotlin.reflect.jvm.internal.impl.descriptors;

import io.ktor.util.C4210;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import kotlin.collections.AbstractC4346;
import p066.AbstractC6869;
import p079.C6982;
import p100.InterfaceC7243;
import p104.C7288;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.descriptors.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4488 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C4489 f13111;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C4489 f13112;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C4489 f13113;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C4489 f13114;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C4489 f13115;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4489 f13116;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final C7288 f13117;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final C4460 f13118;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public static final HashMap f13119;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C4489 f13120;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C4489 f13121;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final C4460 f13122;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final C4460 f13123;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public static final C4489 f13124;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public static final C4489 f13125;

    static {
        C4502 c4502 = C4502.f13138;
        C4489 c4489 = new C4489(c4502, 0);
        f13116 = c4489;
        C4501 c4501 = C4501.f13137;
        C4489 c44892 = new C4489(c4501, 1);
        f13115 = c44892;
        C4505 c4505 = C4505.f13141;
        C4489 c44893 = new C4489(c4505, 2);
        f13114 = c44893;
        C4456 c4456 = C4456.f13082;
        C4489 c44894 = new C4489(c4456, 3);
        f13113 = c44894;
        C4506 c4506 = C4506.f13142;
        C4489 c44895 = new C4489(c4506, 4);
        f13112 = c44895;
        C4453 c4453 = C4453.f13081;
        C4489 c44896 = new C4489(c4453, 5);
        f13111 = c44896;
        C4457 c4457 = C4457.f13083;
        C4489 c44897 = new C4489(c4457, 6);
        f13121 = c44897;
        C4452 c4452 = C4452.f13080;
        C4489 c44898 = new C4489(c4452, 7);
        f13120 = c44898;
        C4503 c4503 = C4503.f13139;
        C4489 c44899 = new C4489(c4503, 8);
        f13124 = c44899;
        Collections.unmodifiableSet(AbstractC4346.m8852(new C4489[]{c4489, c44892, c44894, c44896}));
        HashMap map = new HashMap(6);
        map.put(c44892, 0);
        map.put(c4489, 0);
        map.put(c44894, 1);
        map.put(c44893, 1);
        map.put(c44895, 2);
        Collections.unmodifiableMap(map);
        f13125 = c44895;
        f13122 = new C4460(2);
        f13123 = new C4460(3);
        f13118 = new C4460(4);
        try {
            Iterator it = Arrays.asList(new C7288[0]).iterator();
            f13117 = it.hasNext() ? (C7288) it.next() : C7288.f19398;
            HashMap map2 = new HashMap();
            f13119 = map2;
            map2.put(c4502, c4489);
            map2.put(c4501, c44892);
            map2.put(c4505, c44893);
            map2.put(c4456, c44894);
            map2.put(c4506, c44895);
            map2.put(c4453, c44896);
            map2.put(c4457, c44897);
            map2.put(c4452, c44898);
            map2.put(c4503, c44899);
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static boolean m9076(InterfaceC4479 interfaceC4479, InterfaceC4498 interfaceC4498) {
        if (interfaceC4479 == null) {
            m9081(2);
            throw null;
        }
        if (interfaceC4498 != null) {
            return m9079(f13123, interfaceC4479, interfaceC4498) == null;
        }
        m9081(3);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static boolean m9077(C4489 c4489) {
        if (c4489 != null) {
            return c4489 == f13116 || c4489 == f13115;
        }
        m9081(14);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static boolean m9078(InterfaceC4497 interfaceC4497, InterfaceC4498 interfaceC4498) {
        if (interfaceC4498 != null) {
            C4460 c4460M12074 = AbstractC6869.m12074(interfaceC4498);
            return c4460M12074 != C4460.f13084 && c4460M12074 == AbstractC6869.m12074(interfaceC4497);
        }
        m9081(7);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static InterfaceC4497 m9079(InterfaceC7243 interfaceC7243, InterfaceC4497 interfaceC4497, InterfaceC4498 interfaceC4498) {
        InterfaceC4497 interfaceC4497M9079;
        if (interfaceC4497 == null) {
            m9081(8);
            throw null;
        }
        if (interfaceC4498 == null) {
            m9081(9);
            throw null;
        }
        for (InterfaceC4497 interfaceC44972 = (InterfaceC4497) interfaceC4497.mo9012(); interfaceC44972 != null && interfaceC44972.getVisibility() != f13111; interfaceC44972 = (InterfaceC4497) AbstractC6869.m12085(interfaceC44972, InterfaceC4497.class, true)) {
            if (!interfaceC44972.getVisibility().m9083(interfaceC7243, interfaceC44972, interfaceC4498)) {
                return interfaceC44972;
            }
        }
        if (!(interfaceC4497 instanceof C6982) || (interfaceC4497M9079 = m9079(interfaceC7243, ((C6982) interfaceC4497).f18686, interfaceC4498)) == null) {
            return null;
        }
        return interfaceC4497M9079;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static Integer m9080(C4489 c4489, C4489 c44892) {
        if (c4489 == null) {
            m9081(12);
            throw null;
        }
        AbstractC4500 abstractC4500 = c4489.f13127;
        if (c44892 == null) {
            m9081(13);
            throw null;
        }
        AbstractC4500 abstractC45002 = c44892.f13127;
        Integer numMo9110 = abstractC4500.mo9110(abstractC45002);
        if (numMo9110 != null) {
            return numMo9110;
        }
        Integer numMo91102 = abstractC45002.mo9110(abstractC4500);
        if (numMo91102 != null) {
            return Integer.valueOf(-numMo91102.intValue());
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m9081(int r8) {
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.descriptors.AbstractC4488.m9081(int):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static C4489 m9082(AbstractC4500 abstractC4500) {
        if (abstractC4500 == null) {
            m9081(15);
            throw null;
        }
        C4489 c4489 = (C4489) f13119.get(abstractC4500);
        if (c4489 != null) {
            return c4489;
        }
        C4210.m8614(abstractC4500, "Inapplicable visibility: ");
        return null;
    }
}
