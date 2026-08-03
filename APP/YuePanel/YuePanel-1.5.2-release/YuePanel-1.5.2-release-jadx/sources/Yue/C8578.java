package Yue;

import Yue.C6618;
import Yue.C7060;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۢۦۣۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7507({"SMAP\nZipFiles.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,459:1\n1045#2:460\n*S KotlinDebug\n*F\n+ 1 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n156#1:460\n*E\n"})
public final class C8578 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f3561 = 67324752;

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f3562 = 33639248;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final int f25459 = 101010256;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final int f25460 = 117853008;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int f25461 = 101075792;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final int f25462 = 8;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int f25463 = 0;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int f25464 = 1;

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final int f25465 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final long f25466 = 4294967295L;

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final int f25467 = 1;

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final int f25468 = 21589;

    /* JADX INFO: renamed from: Yue.ۥۢۦۣۨ$ۥ */
    @InterfaceC7507({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 ZipFiles.kt\nokio/internal/ZipFilesKt\n*L\n1#1,328:1\n156#2:329\n*E\n"})
    public static final class C1554<T> implements Comparator {
        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: T */
        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: T */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return C4033.m11389(((C8576) t).m4545(), ((C8576) t2).m4545());
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۣۨ$ۥ۟ */
    public static final class C1555 extends AbstractC5673 implements InterfaceC5124<C8576, Boolean> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final C1555 f25469 = new C1555();

        public C1555() {
            super(1);
        }

        /* JADX DEBUG: Method merged with bridge method: invoke(Ljava/lang/Object;)Ljava/lang/Object; */
        @Override // Yue.InterfaceC5124
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters and merged with bridge method [inline-methods] */
        public final Boolean invoke(@InterfaceC6399 C8576 c8576) {
            C5499.m17103(c8576, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۣۨ$ۥ۟۟, reason: contains not printable characters */
    public static final class C8579 extends AbstractC5673 implements InterfaceC5138<Integer, Long, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ C7060.C1153 f25470;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ long f25471;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7065 f25472;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC3604 f25473;

        /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7065 f25474;

        /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7065 f25475;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8579(C7060.C1153 c1153, long j, C7060.C7065 c7065, InterfaceC3604 interfaceC3604, C7060.C7065 c70652, C7060.C7065 c70653) {
            super(2);
            this.f25470 = c1153;
            this.f25471 = j;
            this.f25472 = c7065;
            this.f25473 = interfaceC3604;
            this.f25474 = c70652;
            this.f25475 = c70653;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5138
        public /* bridge */ /* synthetic */ C8107 invoke(Integer num, Long l) throws IOException {
            m28584(num.intValue(), l.longValue());
            return C8107.f3222;
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m28584(int i, long j) throws IOException {
            if (i == 1) {
                C7060.C1153 c1153 = this.f25470;
                if (c1153.f21346) {
                    throw new IOException("bad zip: zip64 extra repeated");
                }
                c1153.f21346 = true;
                if (j < this.f25471) {
                    throw new IOException("bad zip: zip64 extra too short");
                }
                C7060.C7065 c7065 = this.f25472;
                long jMo9667 = c7065.f21352;
                if (jMo9667 == C8578.f25466) {
                    jMo9667 = this.f25473.mo9667();
                }
                c7065.f21352 = jMo9667;
                C7060.C7065 c70652 = this.f25474;
                c70652.f21352 = c70652.f21352 == C8578.f25466 ? this.f25473.mo9667() : 0L;
                C7060.C7065 c70653 = this.f25475;
                c70653.f21352 = c70653.f21352 == C8578.f25466 ? this.f25473.mo9667() : 0L;
            }
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۦۣۨ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C8580 extends AbstractC5673 implements InterfaceC5138<Integer, Long, C8107> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ InterfaceC3604 f25476;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066<Long> f25477;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066<Long> f25478;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ C7060.C7066<Long> f25479;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C8580(InterfaceC3604 interfaceC3604, C7060.C7066<Long> c7066, C7060.C7066<Long> c70662, C7060.C7066<Long> c70663) {
            super(2);
            this.f25476 = interfaceC3604;
            this.f25477 = c7066;
            this.f25478 = c70662;
            this.f25479 = c70663;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // Yue.InterfaceC5138
        public /* bridge */ /* synthetic */ C8107 invoke(Integer num, Long l) throws IOException {
            m28585(num.intValue(), l.longValue());
            return C8107.f3222;
        }

        /* JADX WARN: Type inference failed for: r0v13, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r10v11, types: [T, java.lang.Long] */
        /* JADX WARN: Type inference failed for: r11v3, types: [T, java.lang.Long] */
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m28585(int i, long j) throws IOException {
            if (i == 21589) {
                if (j < 1) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                byte b = this.f25476.readByte();
                boolean z = (b & 1) == 1;
                boolean z2 = (b & 2) == 2;
                boolean z3 = (b & 4) == 4;
                InterfaceC3604 interfaceC3604 = this.f25476;
                long j2 = z ? 5L : 1L;
                if (z2) {
                    j2 += 4;
                }
                if (z3) {
                    j2 += 4;
                }
                if (j < j2) {
                    throw new IOException("bad zip: extended timestamp extra too short");
                }
                if (z) {
                    this.f25477.f21353 = Long.valueOf(((long) interfaceC3604.mo9657()) * 1000);
                }
                if (z2) {
                    this.f25478.f21353 = Long.valueOf(((long) this.f25476.mo9657()) * 1000);
                }
                if (z3) {
                    this.f25479.f21353 = Long.valueOf(((long) this.f25476.mo9657()) * 1000);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static final Map<C6618, C8576> m4548(List<C8576> list) {
        C6618 c6618M21047 = C6618.C1032.m21047(C6618.f16986, "/", false, 1, null);
        Map<C6618, C8576> mapM18620 = C5943.m18620(C8003.m4014(c6618M21047, new C8576(c6618M21047, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null)));
        for (C8576 c8576 : C3888.m11035(list, new C1554())) {
            if (mapM18620.put(c8576.m4545(), c8576) == null) {
                while (true) {
                    C6618 c6618M21035 = c8576.m4545().m21035();
                    if (c6618M21035 != null) {
                        C8576 c85762 = mapM18620.get(c6618M21035);
                        if (c85762 != null) {
                            c85762.m4546().add(c8576.m4545());
                            break;
                        }
                        C8576 c85763 = new C8576(c6618M21035, true, null, 0L, 0L, 0L, 0, null, 0L, 508, null);
                        mapM18620.put(c6618M21035, c85763);
                        c85763.m4546().add(c8576.m4545());
                        c8576 = c85763;
                    }
                }
            }
        }
        return mapM18620;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static final Long m4549(int i, int i2) {
        if (i2 == -1) {
            return null;
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(((i >> 9) & 127) + 1980, ((i >> 5) & 15) - 1, i & 31, (i2 >> 11) & 31, (i2 >> 5) & 63, (i2 & 31) << 1);
        return Long.valueOf(gregorianCalendar.getTime().getTime());
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final String m28573(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("0x");
        String string = Integer.toString(i, C3791.m836(16));
        C5499.m17102(string, "toString(this, checkRadix(radix))");
        sb.append(string);
        return sb.toString();
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[GOTO]}, finally: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[INVOKE] complete} */
    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX DEBUG: Incorrect finally slice size: {[GOTO] complete}, expected: {[GOTO, THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX WARN: Finally extract failed */
    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final C8577 m28574(@InterfaceC6399 C6618 c6618, @InterfaceC6399 AbstractC4819 abstractC4819, @InterfaceC6399 InterfaceC5124<? super C8576, Boolean> interfaceC5124) throws IOException {
        long jM14569;
        long j;
        InterfaceC3604 interfaceC3604M20831;
        C5499.m17103(c6618, "zipPath");
        C5499.m17103(abstractC4819, "fileSystem");
        C5499.m17103(interfaceC5124, "predicate");
        AbstractC4809 abstractC4809Mo14658 = abstractC4819.mo14658(c6618);
        try {
            jM14569 = abstractC4809Mo14658.m14569() - ((long) 22);
        } finally {
        }
        if (jM14569 < 0) {
            throw new IOException("not a zip: size=" + abstractC4809Mo14658.m14569());
        }
        long jMax = Math.max(jM14569 - 65536, 0L);
        do {
            InterfaceC3604 interfaceC3604M208312 = C6542.m20831(abstractC4809Mo14658.m14570(jM14569));
            try {
                if (interfaceC3604M208312.mo9657() == 101010256) {
                    C4659 c4659M28577 = m28577(interfaceC3604M208312);
                    String strMo9609 = interfaceC3604M208312.mo9609(c4659M28577.m1613());
                    interfaceC3604M208312.close();
                    long j2 = jM14569 - ((long) 20);
                    if (j2 > 0) {
                        InterfaceC3604 interfaceC3604M208313 = C6542.m20831(abstractC4809Mo14658.m14570(j2));
                        try {
                            if (interfaceC3604M208313.mo9657() == 117853008) {
                                int iMo9657 = interfaceC3604M208313.mo9657();
                                long jMo9667 = interfaceC3604M208313.mo9667();
                                if (interfaceC3604M208313.mo9657() != 1 || iMo9657 != 0) {
                                    throw new IOException("unsupported zip: spanned");
                                }
                                interfaceC3604M20831 = C6542.m20831(abstractC4809Mo14658.m14570(jMo9667));
                                try {
                                    int iMo96572 = interfaceC3604M20831.mo9657();
                                    if (iMo96572 != 101075792) {
                                        throw new IOException("bad zip: expected " + m28573(f25461) + " but was " + m28573(iMo96572));
                                    }
                                    c4659M28577 = m28581(interfaceC3604M20831, c4659M28577);
                                    C8107 c8107 = C8107.f3222;
                                    C3849.m904(interfaceC3604M20831, null);
                                } finally {
                                }
                            }
                            C8107 c81072 = C8107.f3222;
                            C3849.m904(interfaceC3604M208313, null);
                        } finally {
                        }
                    }
                    ArrayList arrayList = new ArrayList();
                    interfaceC3604M20831 = C6542.m20831(abstractC4809Mo14658.m14570(c4659M28577.m1612()));
                    try {
                        long jM14002 = c4659M28577.m14002();
                        for (j = 0; j < jM14002; j++) {
                            C8576 c8576M28576 = m28576(interfaceC3604M20831);
                            if (c8576M28576.m28567() >= c4659M28577.m1612()) {
                                throw new IOException("bad zip: local file header offset >= central directory offset");
                            }
                            if (interfaceC5124.invoke(c8576M28576).booleanValue()) {
                                arrayList.add(c8576M28576);
                            }
                        }
                        C8107 c81073 = C8107.f3222;
                        C3849.m904(interfaceC3604M20831, null);
                        C8577 c8577 = new C8577(c6618, abstractC4819, m4548(arrayList), strMo9609);
                        C3849.m904(abstractC4809Mo14658, null);
                        return c8577;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } finally {
                            C3849.m904(interfaceC3604M20831, th);
                        }
                    }
                }
                interfaceC3604M208312.close();
                jM14569--;
            } finally {
                interfaceC3604M208312.close();
            }
        } while (jM14569 >= jMax);
        throw new IOException("not a zip: end of central directory signature not found");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ C8577 m28575(C6618 c6618, AbstractC4819 abstractC4819, InterfaceC5124 interfaceC5124, int i, Object obj) throws IOException {
        if ((i & 4) != 0) {
            interfaceC5124 = C1555.f25469;
        }
        return m28574(c6618, abstractC4819, interfaceC5124);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final C8576 m28576(@InterfaceC6399 InterfaceC3604 interfaceC3604) throws IOException {
        C5499.m17103(interfaceC3604, "<this>");
        int iMo9657 = interfaceC3604.mo9657();
        if (iMo9657 != 33639248) {
            throw new IOException("bad zip: expected " + m28573(f3562) + " but was " + m28573(iMo9657));
        }
        interfaceC3604.skip(4L);
        short sMo9666 = interfaceC3604.mo9666();
        int i = sMo9666 & C8080.f23970;
        if ((sMo9666 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m28573(i));
        }
        int iMo9666 = interfaceC3604.mo9666() & C8080.f23970;
        Long lM4549 = m4549(interfaceC3604.mo9666() & C8080.f23970, interfaceC3604.mo9666() & C8080.f23970);
        long jMo9657 = ((long) interfaceC3604.mo9657()) & f25466;
        C7060.C7065 c7065 = new C7060.C7065();
        c7065.f21352 = ((long) interfaceC3604.mo9657()) & f25466;
        C7060.C7065 c70652 = new C7060.C7065();
        c70652.f21352 = ((long) interfaceC3604.mo9657()) & f25466;
        int iMo96662 = interfaceC3604.mo9666() & C8080.f23970;
        int iMo96663 = interfaceC3604.mo9666() & C8080.f23970;
        int iMo96664 = interfaceC3604.mo9666() & C8080.f23970;
        interfaceC3604.skip(8L);
        C7060.C7065 c70653 = new C7060.C7065();
        c70653.f21352 = ((long) interfaceC3604.mo9657()) & f25466;
        String strMo9609 = interfaceC3604.mo9609(iMo96662);
        if (C7628.m24034(strMo9609, (char) 0, false, 2, null)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        long j = c70652.f21352 == f25466 ? 8 : 0L;
        long j2 = c7065.f21352 == f25466 ? j + ((long) 8) : j;
        if (c70653.f21352 == f25466) {
            j2 += (long) 8;
        }
        long j3 = j2;
        C7060.C1153 c1153 = new C7060.C1153();
        m28578(interfaceC3604, iMo96663, new C8579(c1153, j3, c70652, interfaceC3604, c7065, c70653));
        if (j3 <= 0 || c1153.f21346) {
            return new C8576(C6618.C1032.m21047(C6618.f16986, "/", false, 1, null).m21041(strMo9609), C7627.m23973(strMo9609, "/", false, 2, null), interfaceC3604.mo9609(iMo96664), jMo9657, c7065.f21352, c70652.f21352, iMo9666, lM4549, c70653.f21352);
        }
        throw new IOException("bad zip: zip64 extra required but absent");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final C4659 m28577(InterfaceC3604 interfaceC3604) throws IOException {
        int iMo9666 = interfaceC3604.mo9666() & C8080.f23970;
        int iMo96662 = interfaceC3604.mo9666() & C8080.f23970;
        long jMo9666 = interfaceC3604.mo9666() & C8080.f23970;
        if (jMo9666 != (interfaceC3604.mo9666() & C8080.f23970) || iMo9666 != 0 || iMo96662 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC3604.skip(4L);
        return new C4659(jMo9666, f25466 & ((long) interfaceC3604.mo9657()), interfaceC3604.mo9666() & C8080.f23970);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final void m28578(InterfaceC3604 interfaceC3604, int i, InterfaceC5138<? super Integer, ? super Long, C8107> interfaceC5138) throws IOException {
        long j = i;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iMo9666 = interfaceC3604.mo9666() & C8080.f23970;
            long jMo9666 = ((long) interfaceC3604.mo9666()) & C8417.f25173;
            long j2 = j - ((long) 4);
            if (j2 < jMo9666) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            interfaceC3604.mo9670(jMo9666);
            long jM9684 = interfaceC3604.mo9605().m9684();
            interfaceC5138.invoke(Integer.valueOf(iMo9666), Long.valueOf(jMo9666));
            long jM96842 = (interfaceC3604.mo9605().m9684() + jMo9666) - jM9684;
            if (jM96842 < 0) {
                throw new IOException("unsupported zip: too many bytes processed for " + iMo9666);
            }
            if (jM96842 > 0) {
                interfaceC3604.mo9605().skip(jM96842);
            }
            j = j2 - jMo9666;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final C4811 m28579(@InterfaceC6399 InterfaceC3604 interfaceC3604, @InterfaceC6399 C4811 c4811) throws IOException {
        C5499.m17103(interfaceC3604, "<this>");
        C5499.m17103(c4811, "basicMetadata");
        C4811 c4811M28580 = m28580(interfaceC3604, c4811);
        C5499.m17100(c4811M28580);
        return c4811M28580;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v5, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: T */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: T */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final C4811 m28580(InterfaceC3604 interfaceC3604, C4811 c4811) throws IOException {
        C7060.C7066 c7066 = new C7060.C7066();
        c7066.f21353 = c4811 != null ? c4811.m14594() : 0;
        C7060.C7066 c70662 = new C7060.C7066();
        C7060.C7066 c70663 = new C7060.C7066();
        int iMo9657 = interfaceC3604.mo9657();
        if (iMo9657 != 67324752) {
            throw new IOException("bad zip: expected " + m28573(f3561) + " but was " + m28573(iMo9657));
        }
        interfaceC3604.skip(2L);
        short sMo9666 = interfaceC3604.mo9666();
        int i = sMo9666 & C8080.f23970;
        if ((sMo9666 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + m28573(i));
        }
        interfaceC3604.skip(18L);
        long jMo9666 = ((long) interfaceC3604.mo9666()) & C8417.f25173;
        int iMo9666 = interfaceC3604.mo9666() & C8080.f23970;
        interfaceC3604.skip(jMo9666);
        if (c4811 == null) {
            interfaceC3604.skip(iMo9666);
            return null;
        }
        m28578(interfaceC3604, iMo9666, new C8580(interfaceC3604, c7066, c70662, c70663));
        return new C4811(c4811.m14598(), c4811.m14597(), null, c4811.m14595(), (Long) c70663.f21353, (Long) c7066.f21353, (Long) c70662.f21353, null, 128, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final C4659 m28581(InterfaceC3604 interfaceC3604, C4659 c4659) throws IOException {
        interfaceC3604.skip(12L);
        int iMo9657 = interfaceC3604.mo9657();
        int iMo96572 = interfaceC3604.mo9657();
        long jMo9667 = interfaceC3604.mo9667();
        if (jMo9667 != interfaceC3604.mo9667() || iMo9657 != 0 || iMo96572 != 0) {
            throw new IOException("unsupported zip: spanned");
        }
        interfaceC3604.skip(8L);
        return new C4659(jMo9667, interfaceC3604.mo9667(), c4659.m1613());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m28582(@InterfaceC6399 InterfaceC3604 interfaceC3604) throws IOException {
        C5499.m17103(interfaceC3604, "<this>");
        m28580(interfaceC3604, null);
    }
}
