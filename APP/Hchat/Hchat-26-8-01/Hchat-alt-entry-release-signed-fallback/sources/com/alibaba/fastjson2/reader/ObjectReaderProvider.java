package com.alibaba.fastjson2.reader;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderProvider {
    static com.alibaba.fastjson2.reader.ObjectReaderProvider.ObjectReaderCachePair readerCache;
    private long[] acceptHashCodes;
    private com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler;
    private java.util.function.Consumer<java.lang.Class> autoTypeHandler;
    final com.alibaba.fastjson2.reader.ObjectReaderProvider.LRUAutoTypeCache autoTypeList;
    final java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> cache;
    final java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> cacheFieldBased;
    public final com.alibaba.fastjson2.reader.ObjectReaderCreator creator;
    private long[] denyHashCodes;
    final java.util.concurrent.ConcurrentMap<java.lang.Long, com.alibaba.fastjson2.reader.ObjectReader> hashCache;
    final java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> mixInCache;
    private java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.util.Map<java.lang.reflect.Type, java.util.function.Function>> typeConverts;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class LRUAutoTypeCache extends java.util.LinkedHashMap<java.lang.String, java.util.Date> {
        private final int maxSize;

        public LRUAutoTypeCache(int r4) {
                r3 = this;
                r0 = 1061158912(0x3f400000, float:0.75)
                r1 = 0
                r2 = 16
                r3.<init>(r2, r0, r1)
                r3.maxSize = r4
                return
        }

        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(java.util.Map.Entry<java.lang.String, java.util.Date> r2) {
                r1 = this;
                int r2 = r1.size()
                int r0 = r1.maxSize
                if (r2 <= r0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class ObjectReaderCachePair {
        final long hashCode;
        volatile int missCount;
        final com.alibaba.fastjson2.reader.ObjectReader reader;

        public ObjectReaderCachePair(long r1, com.alibaba.fastjson2.reader.ObjectReader r3) {
                r0 = this;
                r0.<init>()
                r0.hashCode = r1
                r0.reader = r3
                return
        }
    }

    public ObjectReaderProvider() {
            r5 = this;
            r5.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r5.cache = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r5.cacheFieldBased = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r5.hashCache = r0
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r5.mixInCache = r1
            com.alibaba.fastjson2.reader.ObjectReaderProvider$LRUAutoTypeCache r1 = new com.alibaba.fastjson2.reader.ObjectReaderProvider$LRUAutoTypeCache
            r2 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2)
            r5.autoTypeList = r1
            r1 = 162(0xa2, float:2.27E-43)
            long[] r1 = new long[r1]
            r1 = {x006a: FILL_ARRAY_DATA , data: [-9164606388214699518, -8754006975464705441, -8720046426850100497, -8649961213709896794, -8614556368991373401, -8382625455832334425, -8165637398350707645, -8109300701639721088, -7966123100503199569, -7921218830998286408, -7775351613326101303, -7768608037458185275, -7766605818834748097, -6835437086156813536, -6316154655839304624, -6179589609550493385, -6149130139291498841, -6149093380703242441, -6088208984980396913, -6025144546313590215, -5939269048541779808, -5885964883385605994, -5767141746063564198, -5764804792063216819, -5472097725414717105, -5194641081268104286, -5076846148177416215, -4837536971810737970, -4836620931940850535, -4733542790109620528, -4703320437989596122, -4608341446948126581, -4537258998789938600, -4438775680185074100, -4314457471973557243, -4150995715611818742, -4082057040235125754, -3975378478825053783, -3967588558552655563, -3935185854875733362, -3319207949486691020, -3077205613010077203, -3053747177772160511, -2995060141064716555, -2825378362173150292, -2533039401923731906, -2439930098895578154, -2378990704010641148, -2364987994247679115, -2262244760619952081, -2192804397019347313, -2095516571388852610, -1872417015366588117, -1650485814983027158, -1589194880214235129, -965955008570215305, -905177026366752536, -831789045734283466, -803541446955902575, -731978084025273882, -666475508176557463, -582813228520337988, -254670111376247151, -219577392946377768, -190281065685395680, -26639035867733124, -9822483067882491, 4750336058574309, 33238344207745342, 156405680656087946, 218512992947536312, 313864100207897507, 386461436234701831, 744602970950881621, 823641066473609950, 1073634739308289776, 1153291637701043748, 1203232727967308606, 1214780596910349029, 1268707909007641340, 1459860845934817624, 1502845958873959152, 1534439610567445754, 1698504441317515818, 1818089308493370394, 2078113382421334967, 2164696723069287854, 2622551729063269307, 2653453629929770569, 2660670623866180977, 2731823439467737506, 2836431254737891113, 2930861374593775110, 3058452313624178956, 3085473968517218653, 3089451460101527857, 3114862868117605599, 3129395579983849527, 3256258368248066264, 3452379460455804429, 3547627781654598988, 3637939656440441093, 3688179072722109200, 3718352661124136681, 3730752432285826863, 3740226159580918099, 3794316665763266033, 3977090344859527316, 4000049462512838776, 4046190361520671643, 4147696707147271408, 4193204392725694463, 4215053018660518963, 4241163808635564644, 4254584350247334433, 4814658433570175913, 4841947709850912914, 4904007817188630457, 5100336081510080343, 5120543992130540564, 5274044858141538265, 5347909877633654828, 5450448828334921485, 5474268165959054640, 5545425291794704408, 5596129856135573697, 5688200883751798389, 5751393439502795295, 5916409771425455946, 5944107969236155580, 6007332606592876737, 6090377589998869205, 6280357960959217660, 6456855723474196908, 6511035576063254270, 6534946468240507089, 6584624952928234050, 6734240326434096246, 6742705432718011780, 6800727078373023163, 6854854816081053523, 7045245923763966215, 7123326897294507060, 7164889056054194741, 7179336928365889465, 7240293012336844478, 7347653049056829645, 7375862386996623731, 7442624256860549330, 7617522210483516279, 7658177784286215602, 8055461369741094911, 8064026652676081192, 8389032537095247355, 8488266005336625107, 8537233257283452655, 8735538376409180149, 8838294710098435315, 8861402923078831179, 9140390920032557669, 9140416208800006522, 9144212112462101475} // fill-array
            r5.denyHashCodes = r1
            r1 = 1
            long[] r1 = new long[r1]
            r2 = -6293031534589903644(0xa8aaa929446ffce4, double:-8.660931078614971E-113)
            r4 = 0
            r1[r4] = r2
            r5.acceptHashCodes = r1
            long r1 = com.alibaba.fastjson2.reader.ObjectArrayReader.TYPE_HASH_CODE
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.alibaba.fastjson2.reader.ObjectArrayReader r2 = com.alibaba.fastjson2.reader.ObjectArrayReader.INSTANCE
            r0.put(r1, r2)
            r1 = -4834614249632438472(0xbce7fff4709de738, double:-2.6645156755451724E-15)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplString r2 = com.alibaba.fastjson2.reader.ObjectReaderImplString.INSTANCE
            r0.put(r1, r2)
            r1 = 77
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r2 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.INSTANCE
            r0.put(r1, r2)
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = com.alibaba.fastjson2.reader.ObjectReaderCreator.INSTANCE
            r5.creator = r0
            r5.init()
            return
    }

    public ObjectReaderProvider(com.alibaba.fastjson2.reader.ObjectReaderCreator r6) {
            r5 = this;
            r5.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r5.cache = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r5.cacheFieldBased = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r5.hashCache = r0
            java.util.concurrent.ConcurrentHashMap r1 = new java.util.concurrent.ConcurrentHashMap
            r1.<init>()
            r5.mixInCache = r1
            com.alibaba.fastjson2.reader.ObjectReaderProvider$LRUAutoTypeCache r1 = new com.alibaba.fastjson2.reader.ObjectReaderProvider$LRUAutoTypeCache
            r2 = 1024(0x400, float:1.435E-42)
            r1.<init>(r2)
            r5.autoTypeList = r1
            r1 = 162(0xa2, float:2.27E-43)
            long[] r1 = new long[r1]
            r1 = {x0068: FILL_ARRAY_DATA , data: [-9164606388214699518, -8754006975464705441, -8720046426850100497, -8649961213709896794, -8614556368991373401, -8382625455832334425, -8165637398350707645, -8109300701639721088, -7966123100503199569, -7921218830998286408, -7775351613326101303, -7768608037458185275, -7766605818834748097, -6835437086156813536, -6316154655839304624, -6179589609550493385, -6149130139291498841, -6149093380703242441, -6088208984980396913, -6025144546313590215, -5939269048541779808, -5885964883385605994, -5767141746063564198, -5764804792063216819, -5472097725414717105, -5194641081268104286, -5076846148177416215, -4837536971810737970, -4836620931940850535, -4733542790109620528, -4703320437989596122, -4608341446948126581, -4537258998789938600, -4438775680185074100, -4314457471973557243, -4150995715611818742, -4082057040235125754, -3975378478825053783, -3967588558552655563, -3935185854875733362, -3319207949486691020, -3077205613010077203, -3053747177772160511, -2995060141064716555, -2825378362173150292, -2533039401923731906, -2439930098895578154, -2378990704010641148, -2364987994247679115, -2262244760619952081, -2192804397019347313, -2095516571388852610, -1872417015366588117, -1650485814983027158, -1589194880214235129, -965955008570215305, -905177026366752536, -831789045734283466, -803541446955902575, -731978084025273882, -666475508176557463, -582813228520337988, -254670111376247151, -219577392946377768, -190281065685395680, -26639035867733124, -9822483067882491, 4750336058574309, 33238344207745342, 156405680656087946, 218512992947536312, 313864100207897507, 386461436234701831, 744602970950881621, 823641066473609950, 1073634739308289776, 1153291637701043748, 1203232727967308606, 1214780596910349029, 1268707909007641340, 1459860845934817624, 1502845958873959152, 1534439610567445754, 1698504441317515818, 1818089308493370394, 2078113382421334967, 2164696723069287854, 2622551729063269307, 2653453629929770569, 2660670623866180977, 2731823439467737506, 2836431254737891113, 2930861374593775110, 3058452313624178956, 3085473968517218653, 3089451460101527857, 3114862868117605599, 3129395579983849527, 3256258368248066264, 3452379460455804429, 3547627781654598988, 3637939656440441093, 3688179072722109200, 3718352661124136681, 3730752432285826863, 3740226159580918099, 3794316665763266033, 3977090344859527316, 4000049462512838776, 4046190361520671643, 4147696707147271408, 4193204392725694463, 4215053018660518963, 4241163808635564644, 4254584350247334433, 4814658433570175913, 4841947709850912914, 4904007817188630457, 5100336081510080343, 5120543992130540564, 5274044858141538265, 5347909877633654828, 5450448828334921485, 5474268165959054640, 5545425291794704408, 5596129856135573697, 5688200883751798389, 5751393439502795295, 5916409771425455946, 5944107969236155580, 6007332606592876737, 6090377589998869205, 6280357960959217660, 6456855723474196908, 6511035576063254270, 6534946468240507089, 6584624952928234050, 6734240326434096246, 6742705432718011780, 6800727078373023163, 6854854816081053523, 7045245923763966215, 7123326897294507060, 7164889056054194741, 7179336928365889465, 7240293012336844478, 7347653049056829645, 7375862386996623731, 7442624256860549330, 7617522210483516279, 7658177784286215602, 8055461369741094911, 8064026652676081192, 8389032537095247355, 8488266005336625107, 8537233257283452655, 8735538376409180149, 8838294710098435315, 8861402923078831179, 9140390920032557669, 9140416208800006522, 9144212112462101475} // fill-array
            r5.denyHashCodes = r1
            r1 = 1
            long[] r1 = new long[r1]
            r2 = -6293031534589903644(0xa8aaa929446ffce4, double:-8.660931078614971E-113)
            r4 = 0
            r1[r4] = r2
            r5.acceptHashCodes = r1
            long r1 = com.alibaba.fastjson2.reader.ObjectArrayReader.TYPE_HASH_CODE
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.alibaba.fastjson2.reader.ObjectArrayReader r2 = com.alibaba.fastjson2.reader.ObjectArrayReader.INSTANCE
            r0.put(r1, r2)
            r1 = -4834614249632438472(0xbce7fff4709de738, double:-2.6645156755451724E-15)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplString r2 = com.alibaba.fastjson2.reader.ObjectReaderImplString.INSTANCE
            r0.put(r1, r2)
            r1 = 77
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            com.alibaba.fastjson2.reader.ObjectReaderImplMap r2 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.INSTANCE
            r0.put(r1, r2)
            r5.creator = r6
            r5.init()
            return
    }

    public static /* synthetic */ void a(com.alibaba.fastjson2.reader.ObjectReaderProvider r0, java.lang.annotation.Annotation r1, com.alibaba.fastjson2.codec.BeanInfo r2, java.lang.reflect.Method r3) {
            r0.lambda$getBeanInfo1x$9(r1, r2, r3)
            return
    }

    public static /* synthetic */ void b(long r0, java.util.concurrent.atomic.AtomicReference r2, java.lang.reflect.Method r3) {
            lambda$createFieldReader$4(r0, r2, r3)
            return
    }

    public static java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.util.Map<java.lang.reflect.Type, java.util.function.Function>> buildInitTypeConverts() {
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r1 = 0
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            com.alibaba.fastjson2.reader.l r3 = new com.alibaba.fastjson2.reader.l
            r4 = 8
            r3.<init>(r4)
            java.lang.Class<java.lang.Character> r4 = java.lang.Character.class
            java.lang.Class r5 = java.lang.Character.TYPE
            registerTypeConvert(r2, r4, r5, r3)
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r16 = java.util.concurrent.atomic.AtomicInteger.class
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r17 = java.util.concurrent.atomic.AtomicLong.class
            java.lang.Class<java.lang.Boolean> r6 = java.lang.Boolean.class
            java.lang.Class<java.lang.Byte> r7 = java.lang.Byte.class
            java.lang.Class<java.lang.Short> r8 = java.lang.Short.class
            java.lang.Class<java.lang.Integer> r9 = java.lang.Integer.class
            java.lang.Class<java.lang.Long> r10 = java.lang.Long.class
            java.lang.Class<java.lang.Number> r11 = java.lang.Number.class
            java.lang.Class<java.lang.Float> r12 = java.lang.Float.class
            java.lang.Class<java.lang.Double> r13 = java.lang.Double.class
            java.lang.Class<java.math.BigInteger> r14 = java.math.BigInteger.class
            java.lang.Class<java.math.BigDecimal> r15 = java.math.BigDecimal.class
            java.lang.Class[] r3 = new java.lang.Class[]{r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17}
            com.alibaba.fastjson2.function.impl.ToAny r6 = new com.alibaba.fastjson2.function.impl.ToAny
            java.lang.Class<java.lang.Boolean> r7 = java.lang.Boolean.class
            r8 = 0
            r6.<init>(r7, r8)
            r9 = 0
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
            java.lang.Short r11 = java.lang.Short.valueOf(r9)
            java.lang.Byte r12 = java.lang.Byte.valueOf(r9)
            r13 = r9
        L51:
            r14 = 12
            if (r13 >= r14) goto L5d
            r14 = r3[r13]
            registerTypeConvert(r2, r14, r7, r6)
            int r13 = r13 + 1
            goto L51
        L5d:
            com.alibaba.fastjson2.function.impl.ToAny r6 = new com.alibaba.fastjson2.function.impl.ToAny
            java.lang.Boolean r13 = java.lang.Boolean.FALSE
            r6.<init>(r7, r13)
            r13 = r9
        L65:
            java.lang.Class r15 = java.lang.Boolean.TYPE
            if (r13 >= r14) goto L72
            r9 = r3[r13]
            registerTypeConvert(r2, r9, r15, r6)
            int r13 = r13 + 1
            r9 = 0
            goto L65
        L72:
            com.alibaba.fastjson2.function.impl.ToAny r6 = new com.alibaba.fastjson2.function.impl.ToAny
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r6.<init>(r9)
            r13 = 0
        L7a:
            if (r13 >= r14) goto L85
            r8 = r3[r13]
            registerTypeConvert(r2, r8, r9, r6)
            int r13 = r13 + 1
            r8 = 0
            goto L7a
        L85:
            com.alibaba.fastjson2.function.impl.ToAny r6 = new com.alibaba.fastjson2.function.impl.ToAny
            java.lang.Class<java.math.BigDecimal> r8 = java.math.BigDecimal.class
            r6.<init>(r8)
            r13 = 0
        L8d:
            if (r13 >= r14) goto L99
            r14 = r3[r13]
            registerTypeConvert(r2, r14, r8, r6)
            int r13 = r13 + 1
            r14 = 12
            goto L8d
        L99:
            com.alibaba.fastjson2.function.impl.ToAny r6 = new com.alibaba.fastjson2.function.impl.ToAny
            java.lang.Class<java.math.BigInteger> r13 = java.math.BigInteger.class
            r6.<init>(r13)
            r18 = r3
            r14 = 0
        La3:
            r3 = 12
            if (r14 >= r3) goto Laf
            r3 = r18[r14]
            registerTypeConvert(r2, r3, r13, r6)
            int r14 = r14 + 1
            goto La3
        Laf:
            com.alibaba.fastjson2.function.impl.ToAny r3 = new com.alibaba.fastjson2.function.impl.ToAny
            java.lang.Class<java.lang.Byte> r6 = java.lang.Byte.class
            r3.<init>(r6)
            r19 = r13
            r14 = 0
        Lb9:
            r13 = 12
            if (r14 >= r13) goto Lc5
            r13 = r18[r14]
            registerTypeConvert(r2, r13, r6, r3)
            int r14 = r14 + 1
            goto Lb9
        Lc5:
            com.alibaba.fastjson2.function.impl.ToAny r3 = new com.alibaba.fastjson2.function.impl.ToAny
            r3.<init>(r6, r12)
            r13 = 0
        Lcb:
            java.lang.Class r14 = java.lang.Byte.TYPE
            r21 = r8
            r8 = 12
            if (r13 >= r8) goto Ldd
            r8 = r18[r13]
            registerTypeConvert(r2, r8, r14, r3)
            int r13 = r13 + 1
            r8 = r21
            goto Lcb
        Ldd:
            com.alibaba.fastjson2.function.impl.ToAny r3 = new com.alibaba.fastjson2.function.impl.ToAny
            java.lang.Class<java.lang.Short> r8 = java.lang.Short.class
            r3.<init>(r8)
            r20 = r6
            r13 = 0
        Le7:
            r6 = 12
            if (r13 >= r6) goto Lf3
            r6 = r18[r13]
            registerTypeConvert(r2, r6, r8, r3)
            int r13 = r13 + 1
            goto Le7
        Lf3:
            com.alibaba.fastjson2.function.impl.ToAny r3 = new com.alibaba.fastjson2.function.impl.ToAny
            r3.<init>(r8, r11)
            r6 = 0
        Lf9:
            java.lang.Class r13 = java.lang.Short.TYPE
            r23 = r8
            r8 = 12
            if (r6 >= r8) goto L10b
            r8 = r18[r6]
            registerTypeConvert(r2, r8, r13, r3)
            int r6 = r6 + 1
            r8 = r23
            goto Lf9
        L10b:
            com.alibaba.fastjson2.function.impl.ToAny r3 = new com.alibaba.fastjson2.function.impl.ToAny
            java.lang.Class<java.lang.Integer> r6 = java.lang.Integer.class
            r3.<init>(r6)
            r22 = r7
            r8 = 0
        L115:
            r7 = 12
            if (r8 >= r7) goto L121
            r7 = r18[r8]
            registerTypeConvert(r2, r7, r6, r3)
            int r8 = r8 + 1
            goto L115
        L121:
            com.alibaba.fastjson2.function.impl.ToAny r3 = new com.alibaba.fastjson2.function.impl.ToAny
            r3.<init>(r6, r10)
            r7 = 0
        L127:
            java.lang.Class r8 = java.lang.Integer.TYPE
            r25 = r6
            r6 = 12
            if (r7 >= r6) goto L139
            r6 = r18[r7]
            registerTypeConvert(r2, r6, r8, r3)
            int r7 = r7 + 1
            r6 = r25
            goto L127
        L139:
            com.alibaba.fastjson2.function.impl.ToAny r3 = new com.alibaba.fastjson2.function.impl.ToAny
            java.lang.Class<java.lang.Long> r6 = java.lang.Long.class
            r3.<init>(r6)
            r24 = r4
            r7 = 0
        L143:
            r4 = 12
            if (r7 >= r4) goto L14f
            r4 = r18[r7]
            registerTypeConvert(r2, r4, r6, r3)
            int r7 = r7 + 1
            goto L143
        L14f:
            com.alibaba.fastjson2.function.impl.ToAny r3 = new com.alibaba.fastjson2.function.impl.ToAny
            r3.<init>(r6, r0)
            r4 = 0
        L155:
            r7 = 12
            if (r4 >= r7) goto L165
            r7 = r18[r4]
            r27 = r4
            java.lang.Class r4 = java.lang.Long.TYPE
            registerTypeConvert(r2, r7, r4, r3)
            int r4 = r27 + 1
            goto L155
        L165:
            com.alibaba.fastjson2.function.impl.ToAny r3 = new com.alibaba.fastjson2.function.impl.ToAny
            java.lang.Class<java.lang.Float> r4 = java.lang.Float.class
            r3.<init>(r4)
            r26 = r6
            r7 = 0
        L16f:
            r6 = 12
            if (r7 >= r6) goto L17b
            r6 = r18[r7]
            registerTypeConvert(r2, r6, r4, r3)
            int r7 = r7 + 1
            goto L16f
        L17b:
            com.alibaba.fastjson2.function.impl.ToAny r3 = new com.alibaba.fastjson2.function.impl.ToAny
            r6 = 0
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
            r3.<init>(r4, r6)
            r6 = 0
        L186:
            r7 = 12
            if (r6 >= r7) goto L196
            r7 = r18[r6]
            r28 = r6
            java.lang.Class r6 = java.lang.Float.TYPE
            registerTypeConvert(r2, r7, r6, r3)
            int r6 = r28 + 1
            goto L186
        L196:
            com.alibaba.fastjson2.function.impl.ToAny r3 = new com.alibaba.fastjson2.function.impl.ToAny
            java.lang.Class<java.lang.Double> r6 = java.lang.Double.class
            r3.<init>(r6)
            r27 = r4
            r7 = 0
        L1a0:
            r4 = 12
            if (r7 >= r4) goto L1ac
            r4 = r18[r7]
            registerTypeConvert(r2, r4, r6, r3)
            int r7 = r7 + 1
            goto L1a0
        L1ac:
            com.alibaba.fastjson2.function.impl.ToAny r3 = new com.alibaba.fastjson2.function.impl.ToAny
            r3.<init>(r6, r1)
            r4 = 0
        L1b2:
            r7 = 12
            if (r4 >= r7) goto L1c2
            r7 = r18[r4]
            r29 = r4
            java.lang.Class r4 = java.lang.Double.TYPE
            registerTypeConvert(r2, r7, r4, r3)
            int r4 = r29 + 1
            goto L1b2
        L1c2:
            com.alibaba.fastjson2.function.impl.ToAny r3 = new com.alibaba.fastjson2.function.impl.ToAny
            java.lang.Class<java.lang.Number> r4 = java.lang.Number.class
            r3.<init>(r4, r1)
            r16 = r6
            r7 = 0
        L1cc:
            r6 = 12
            if (r7 >= r6) goto L1d8
            r6 = r18[r7]
            registerTypeConvert(r2, r6, r4, r3)
            int r7 = r7 + 1
            goto L1cc
        L1d8:
            com.alibaba.fastjson2.function.impl.StringToAny r3 = new com.alibaba.fastjson2.function.impl.StringToAny
            r6 = 48
            java.lang.Character r6 = java.lang.Character.valueOf(r6)
            r3.<init>(r5, r6)
            registerTypeConvert(r2, r9, r5, r3)
            com.alibaba.fastjson2.function.impl.StringToAny r3 = new com.alibaba.fastjson2.function.impl.StringToAny
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            r3.<init>(r15, r5)
            registerTypeConvert(r2, r9, r15, r3)
            com.alibaba.fastjson2.function.impl.StringToAny r3 = new com.alibaba.fastjson2.function.impl.StringToAny
            r5 = 0
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.Class r6 = java.lang.Float.TYPE
            r3.<init>(r6, r5)
            registerTypeConvert(r2, r9, r6, r3)
            com.alibaba.fastjson2.function.impl.StringToAny r3 = new com.alibaba.fastjson2.function.impl.StringToAny
            java.lang.Class r5 = java.lang.Double.TYPE
            r3.<init>(r5, r1)
            registerTypeConvert(r2, r9, r5, r3)
            com.alibaba.fastjson2.function.impl.StringToAny r1 = new com.alibaba.fastjson2.function.impl.StringToAny
            r1.<init>(r14, r12)
            registerTypeConvert(r2, r9, r14, r1)
            com.alibaba.fastjson2.function.impl.StringToAny r1 = new com.alibaba.fastjson2.function.impl.StringToAny
            r1.<init>(r13, r11)
            registerTypeConvert(r2, r9, r13, r1)
            com.alibaba.fastjson2.function.impl.StringToAny r1 = new com.alibaba.fastjson2.function.impl.StringToAny
            r1.<init>(r8, r10)
            registerTypeConvert(r2, r9, r8, r1)
            com.alibaba.fastjson2.function.impl.StringToAny r1 = new com.alibaba.fastjson2.function.impl.StringToAny
            java.lang.Class r3 = java.lang.Long.TYPE
            r1.<init>(r3, r0)
            registerTypeConvert(r2, r9, r3, r1)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            r1 = r24
            r3 = 0
            r0.<init>(r1, r3)
            registerTypeConvert(r2, r9, r1, r0)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            r1 = r22
            r0.<init>(r1, r3)
            registerTypeConvert(r2, r9, r1, r0)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            r5 = r16
            r0.<init>(r5, r3)
            registerTypeConvert(r2, r9, r5, r0)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            r5 = r27
            r0.<init>(r5, r3)
            registerTypeConvert(r2, r9, r5, r0)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            r5 = r20
            r0.<init>(r5, r3)
            registerTypeConvert(r2, r9, r5, r0)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            r5 = r23
            r0.<init>(r5, r3)
            registerTypeConvert(r2, r9, r5, r0)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            r5 = r25
            r0.<init>(r5, r3)
            registerTypeConvert(r2, r9, r5, r0)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            r5 = r26
            r0.<init>(r5, r3)
            registerTypeConvert(r2, r9, r5, r0)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            r5 = r21
            r0.<init>(r5, r3)
            registerTypeConvert(r2, r9, r5, r0)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            r6 = r19
            r0.<init>(r6, r3)
            registerTypeConvert(r2, r9, r6, r0)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            r0.<init>(r5, r3)
            registerTypeConvert(r2, r9, r4, r0)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            r0.<init>(r4, r3)
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            registerTypeConvert(r2, r9, r4, r0)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            java.lang.Class<java.util.List> r4 = java.util.List.class
            r0.<init>(r4, r3)
            java.lang.Class<java.util.List> r4 = java.util.List.class
            registerTypeConvert(r2, r9, r4, r0)
            com.alibaba.fastjson2.function.impl.StringToAny r0 = new com.alibaba.fastjson2.function.impl.StringToAny
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r4 = com.alibaba.fastjson2.JSONArray.class
            r0.<init>(r4, r3)
            java.lang.Class<com.alibaba.fastjson2.JSONArray> r3 = com.alibaba.fastjson2.JSONArray.class
            registerTypeConvert(r2, r9, r3, r0)
            com.alibaba.fastjson2.reader.l r0 = new com.alibaba.fastjson2.reader.l
            r3 = 9
            r0.<init>(r3)
            registerTypeConvert(r2, r1, r15, r0)
            com.alibaba.fastjson2.reader.l r0 = new com.alibaba.fastjson2.reader.l
            r1 = 10
            r0.<init>(r1)
            java.lang.Class<java.util.UUID> r1 = java.util.UUID.class
            registerTypeConvert(r2, r9, r1, r0)
            return r2
    }

    public static /* synthetic */ void c(com.alibaba.fastjson2.reader.ObjectReaderProvider r0, com.alibaba.fastjson2.codec.BeanInfo r1, java.lang.Class r2, java.lang.reflect.Method r3) {
            r0.lambda$getBeanInfo$7(r1, r2, r3)
            return
    }

    public static /* synthetic */ java.nio.charset.Charset d(java.lang.String r0) {
            java.nio.charset.Charset r0 = lambda$getObjectReaderModule$15(r0)
            return r0
    }

    public static /* synthetic */ void e(com.alibaba.fastjson2.codec.BeanInfo r0, java.lang.annotation.Annotation r1, java.lang.reflect.Method r2) {
            lambda$getCreator$13(r1, r0, r2)
            return
    }

    public static /* synthetic */ void f(java.lang.annotation.Annotation r0, com.alibaba.fastjson2.codec.FieldInfo r1, java.lang.reflect.Method r2) {
            lambda$processJSONField1x$11(r0, r1, r2)
            return
    }

    public static /* synthetic */ void g(com.alibaba.fastjson2.codec.BeanInfo r0, java.lang.annotation.Annotation r1, java.lang.reflect.Method r2) {
            lambda$getCreator$14(r1, r0, r2)
            return
    }

    private void getBeanInfo(com.alibaba.fastjson2.codec.BeanInfo r5, java.lang.annotation.Annotation[] r6) {
            r4 = this;
            int r0 = r6.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L19
            r2 = r6[r1]
            r2.annotationType()
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONType> r3 = com.alibaba.fastjson2.annotation.JSONType.class
            java.lang.annotation.Annotation r3 = com.alibaba.fastjson2.util.BeanUtils.findAnnotation(r2, r3)
            com.alibaba.fastjson2.annotation.JSONType r3 = (com.alibaba.fastjson2.annotation.JSONType) r3
            if (r3 == 0) goto L16
            r4.getBeanInfo1x(r5, r2)
        L16:
            int r1 = r1 + 1
            goto L2
        L19:
            return
    }

    private void getBeanInfo1xJSONPOJOBuilder(com.alibaba.fastjson2.codec.BeanInfo r3, java.lang.Class<?> r4, java.lang.annotation.Annotation r5, java.lang.Class<? extends java.lang.annotation.Annotation> r6) {
            r2 = this;
            com.alibaba.fastjson2.reader.k r0 = new com.alibaba.fastjson2.reader.k
            r1 = 0
            r0.<init>(r5, r3, r4, r1)
            com.alibaba.fastjson2.util.BeanUtils.annotationMethods(r6, r0)
            return
    }

    private void getCreator(com.alibaba.fastjson2.codec.BeanInfo r10, java.lang.Class<?> r11, java.lang.reflect.Constructor r12) {
            r9 = this;
            boolean r0 = r11.isEnum()
            if (r0 == 0) goto L7
            goto L5f
        L7:
            java.lang.annotation.Annotation[] r0 = r12.getDeclaredAnnotations()
            int r1 = r0.length
            r2 = 0
            r3 = r2
        Le:
            if (r2 >= r1) goto L4e
            r4 = r0[r2]
            java.lang.Class r5 = r4.annotationType()
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONCreator> r6 = com.alibaba.fastjson2.annotation.JSONCreator.class
            java.lang.annotation.Annotation r6 = com.alibaba.fastjson2.util.BeanUtils.findAnnotation(r4, r6)
            com.alibaba.fastjson2.annotation.JSONCreator r6 = (com.alibaba.fastjson2.annotation.JSONCreator) r6
            r7 = 1
            if (r6 == 0) goto L2e
            java.lang.String[] r3 = r6.parameterNames()
            int r8 = r3.length
            if (r8 == 0) goto L2a
            r10.createParameterNames = r3
        L2a:
            r3 = r7
            if (r6 != r4) goto L2e
            goto L4b
        L2e:
            java.lang.String r6 = r5.getName()
            java.lang.String r8 = "com.alibaba.fastjson.annotation.JSONCreator"
            boolean r8 = r6.equals(r8)
            if (r8 != 0) goto L42
            java.lang.String r8 = "com.alibaba.fastjson2.annotation.JSONCreator"
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L4b
        L42:
            com.alibaba.fastjson2.reader.g r3 = new com.alibaba.fastjson2.reader.g
            r3.<init>(r4, r10, r7)
            com.alibaba.fastjson2.util.BeanUtils.annotationMethods(r5, r3)
            r3 = r7
        L4b:
            int r2 = r2 + 1
            goto Le
        L4e:
            if (r3 != 0) goto L51
            goto L5f
        L51:
            java.lang.Class[] r12 = r12.getParameterTypes()     // Catch: java.lang.NoSuchMethodException -> L5a
            java.lang.reflect.Constructor r11 = r11.getDeclaredConstructor(r12)     // Catch: java.lang.NoSuchMethodException -> L5a
            goto L5b
        L5a:
            r11 = 0
        L5b:
            if (r11 == 0) goto L5f
            r10.creatorConstructor = r11
        L5f:
            return
    }

    private void getCreator(com.alibaba.fastjson2.codec.BeanInfo r13, java.lang.Class<?> r14, java.lang.reflect.Method r15) {
            r12 = this;
            java.lang.Class r0 = r15.getDeclaringClass()
            java.lang.Class<java.lang.Enum> r1 = java.lang.Enum.class
            if (r0 != r1) goto La
            goto L6f
        La:
            java.lang.String r0 = r15.getName()
            boolean r1 = r14.isEnum()
            if (r1 == 0) goto L1d
            java.lang.String r1 = "values"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L1d
            goto L6f
        L1d:
            java.lang.annotation.Annotation[] r1 = r15.getDeclaredAnnotations()
            int r2 = r1.length
            r3 = 0
            r4 = 0
            r6 = r3
            r5 = r4
        L26:
            r7 = 1
            if (r4 >= r2) goto L54
            r6 = r1[r4]
            java.lang.Class r8 = r6.annotationType()
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONCreator> r9 = com.alibaba.fastjson2.annotation.JSONCreator.class
            java.lang.annotation.Annotation r9 = com.alibaba.fastjson2.util.BeanUtils.findAnnotation(r6, r9)
            com.alibaba.fastjson2.annotation.JSONCreator r9 = (com.alibaba.fastjson2.annotation.JSONCreator) r9
            if (r9 != r6) goto L3a
            goto L50
        L3a:
            java.lang.String r10 = r8.getName()
            java.lang.String r11 = "com.alibaba.fastjson.annotation.JSONCreator"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L50
            com.alibaba.fastjson2.reader.g r5 = new com.alibaba.fastjson2.reader.g
            r10 = 2
            r5.<init>(r6, r13, r10)
            com.alibaba.fastjson2.util.BeanUtils.annotationMethods(r8, r5)
            r5 = r7
        L50:
            int r4 = r4 + 1
            r6 = r9
            goto L26
        L54:
            if (r6 == 0) goto L60
            java.lang.String[] r1 = r6.parameterNames()
            int r2 = r1.length
            if (r2 == 0) goto L5f
            r13.createParameterNames = r1
        L5f:
            r5 = r7
        L60:
            if (r5 != 0) goto L63
            goto L6f
        L63:
            java.lang.Class[] r15 = r15.getParameterTypes()     // Catch: java.lang.NoSuchMethodException -> L6b
            java.lang.reflect.Method r3 = r14.getDeclaredMethod(r0, r15)     // Catch: java.lang.NoSuchMethodException -> L6b
        L6b:
            if (r3 == 0) goto L6f
            r13.createMethod = r3
        L6f:
            return
    }

    private void getFieldInfo(com.alibaba.fastjson2.codec.FieldInfo r11, com.alibaba.fastjson2.annotation.JSONField r12) {
            r10 = this;
            if (r12 != 0) goto L4
            goto L11c
        L4:
            java.lang.String r0 = r12.name()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L10
            r11.fieldName = r0
        L10:
            java.lang.String r0 = r12.format()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L37
            java.lang.String r0 = r0.trim()
            r1 = 84
            int r1 = r0.indexOf(r1)
            r2 = -1
            if (r1 == r2) goto L35
            java.lang.String r1 = "'T'"
            boolean r2 = r0.contains(r1)
            if (r2 != 0) goto L35
            java.lang.String r2 = "T"
            java.lang.String r0 = r0.replaceAll(r2, r1)
        L35:
            r11.format = r0
        L37:
            java.lang.String r0 = r12.label()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L47
            java.lang.String r0 = r0.trim()
            r11.label = r0
        L47:
            java.lang.String r0 = r12.defaultValue()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L53
            r11.defaultValue = r0
        L53:
            java.lang.String r0 = r12.locale()
            boolean r1 = r0.isEmpty()
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L74
            java.lang.String r1 = "_"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r4 = 2
            if (r1 != r4) goto L74
            java.util.Locale r1 = new java.util.Locale
            r4 = r0[r2]
            r0 = r0[r3]
            r1.<init>(r4, r0)
            r11.locale = r1
        L74:
            java.lang.String[] r0 = r12.alternateNames()
            int r1 = r0.length
            if (r1 == 0) goto La1
            java.lang.String[] r1 = r11.alternateNames
            if (r1 != 0) goto L82
            r11.alternateNames = r0
            goto La1
        L82:
            java.util.LinkedHashSet r1 = new java.util.LinkedHashSet
            r1.<init>()
            java.util.Collections.addAll(r1, r0)
            java.lang.String[] r0 = r11.alternateNames
            java.util.List r0 = java.util.Arrays.asList(r0)
            r1.addAll(r0)
            int r0 = r1.size()
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r11.alternateNames = r0
        La1:
            boolean r0 = r11.ignore
            if (r0 != 0) goto Lac
            boolean r0 = r12.deserialize()
            r0 = r0 ^ r3
            r11.ignore = r0
        Lac:
            com.alibaba.fastjson2.JSONReader$Feature[] r0 = r12.deserializeFeatures()
            int r1 = r0.length
            r4 = r2
        Lb2:
            if (r4 >= r1) goto Lca
            r5 = r0[r4]
            long r6 = r11.features
            long r8 = r5.mask
            long r6 = r6 | r8
            r11.features = r6
            boolean r6 = r11.ignore
            if (r6 == 0) goto Lc7
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            if (r5 != r6) goto Lc7
            r11.ignore = r2
        Lc7:
            int r4 = r4 + 1
            goto Lb2
        Lca:
            int r0 = r12.ordinal()
            if (r0 == 0) goto Ld2
            r11.ordinal = r0
        Ld2:
            boolean r0 = r12.value()
            if (r0 == 0) goto Ldf
            long r0 = r11.features
            r4 = 281474976710656(0x1000000000000, double:1.390671161567E-309)
            long r0 = r0 | r4
            r11.features = r0
        Ldf:
            boolean r0 = r12.unwrapped()
            if (r0 == 0) goto Lec
            long r0 = r11.features
            r4 = 562949953421312(0x2000000000000, double:2.781342323134E-309)
            long r0 = r0 | r4
            r11.features = r0
        Lec:
            boolean r0 = r12.required()
            if (r0 == 0) goto Lf4
            r11.required = r3
        Lf4:
            java.lang.Class r0 = r12.deserializeUsing()
            java.lang.Class<com.alibaba.fastjson2.reader.ObjectReader> r1 = com.alibaba.fastjson2.reader.ObjectReader.class
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 == 0) goto L102
            r11.readUsing = r0
        L102:
            java.lang.String r0 = r12.arrayToMapKey()
            java.lang.String r0 = r0.trim()
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto L112
            r11.arrayToMapKey = r0
        L112:
            java.lang.Class r12 = r12.arrayToMapDuplicateHandler()
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            if (r12 == r0) goto L11c
            r11.arrayToMapDuplicateHandler = r12
        L11c:
            return
    }

    private com.alibaba.fastjson2.reader.ObjectReader getPreviousObjectReader(boolean r1, java.lang.reflect.Type r2, com.alibaba.fastjson2.reader.ObjectReader r3) {
            r0 = this;
            if (r1 == 0) goto Lb
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r1 = r0.cacheFieldBased
            java.lang.Object r1 = r1.put(r2, r3)
            com.alibaba.fastjson2.reader.ObjectReader r1 = (com.alibaba.fastjson2.reader.ObjectReader) r1
            return r1
        Lb:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r1 = r0.cache
            java.lang.Object r1 = r1.put(r2, r3)
            com.alibaba.fastjson2.reader.ObjectReader r1 = (com.alibaba.fastjson2.reader.ObjectReader) r1
            return r1
    }

    public static /* synthetic */ java.time.ZoneId h(java.lang.String r0) {
            java.time.ZoneId r0 = lambda$getObjectReaderModule$18(r0)
            return r0
    }

    public static /* synthetic */ java.io.File i(java.lang.String r0) {
            java.io.File r0 = lambda$getObjectReaderModule$16(r0)
            return r0
    }

    public static /* synthetic */ void j(com.alibaba.fastjson2.reader.ObjectReaderProvider r0, com.alibaba.fastjson2.codec.BeanInfo r1, java.lang.Class r2, java.lang.reflect.Constructor r3) {
            r0.lambda$getBeanInfo$8(r1, r2, r3)
            return
    }

    public static /* synthetic */ java.lang.Object k(java.lang.Object r0) {
            java.lang.Object r0 = lambda$buildInitTypeConverts$2(r0)
            return r0
    }

    public static /* synthetic */ void l(long r0, java.util.concurrent.atomic.AtomicReference r2, java.lang.reflect.Field r3) {
            lambda$createFieldReader$3(r0, r2, r3)
            return
    }

    private static /* synthetic */ java.lang.Object lambda$buildInitTypeConverts$0(java.lang.Object r0) {
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$buildInitTypeConverts$1(java.lang.Object r0) {
            return r0
    }

    private static /* synthetic */ java.lang.Object lambda$buildInitTypeConverts$2(java.lang.Object r1) {
            if (r1 == 0) goto L1a
            java.lang.String r0 = "null"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1a
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L13
            goto L1a
        L13:
            java.lang.String r1 = (java.lang.String) r1
            java.util.UUID r1 = java.util.UUID.fromString(r1)
            return r1
        L1a:
            r1 = 0
            return r1
    }

    private static /* synthetic */ void lambda$createFieldReader$3(long r2, java.util.concurrent.atomic.AtomicReference r4, java.lang.reflect.Field r5) {
            java.lang.String r0 = r5.getName()
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64LCase(r0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto Lf
            r4.set(r5)
        Lf:
            return
    }

    private static /* synthetic */ void lambda$createFieldReader$4(long r2, java.util.concurrent.atomic.AtomicReference r4, java.lang.reflect.Method r5) {
            java.lang.String r0 = r5.getName()
            com.alibaba.fastjson2.PropertyNamingStrategy r1 = com.alibaba.fastjson2.PropertyNamingStrategy.CamelCase
            java.lang.String r1 = r1.name()
            java.lang.String r0 = com.alibaba.fastjson2.util.BeanUtils.setterName(r0, r1)
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64LCase(r0)
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 != 0) goto L19
            r4.set(r5)
        L19:
            return
    }

    private /* synthetic */ void lambda$getBeanInfo$5(com.alibaba.fastjson2.codec.BeanInfo r1, java.lang.Class r2, java.lang.reflect.Method r3) {
            r0 = this;
            r0.getCreator(r1, r2, r3)
            return
    }

    private /* synthetic */ void lambda$getBeanInfo$6(com.alibaba.fastjson2.codec.BeanInfo r1, java.lang.Class r2, java.lang.reflect.Constructor r3) {
            r0 = this;
            r0.getCreator(r1, r2, r3)
            return
    }

    private /* synthetic */ void lambda$getBeanInfo$7(com.alibaba.fastjson2.codec.BeanInfo r1, java.lang.Class r2, java.lang.reflect.Method r3) {
            r0 = this;
            r0.getCreator(r1, r2, r3)
            return
    }

    private /* synthetic */ void lambda$getBeanInfo$8(com.alibaba.fastjson2.codec.BeanInfo r1, java.lang.Class r2, java.lang.reflect.Constructor r3) {
            r0 = this;
            r0.getCreator(r1, r2, r3)
            return
    }

    private /* synthetic */ void lambda$getBeanInfo1x$9(java.lang.annotation.Annotation r7, com.alibaba.fastjson2.codec.BeanInfo r8, java.lang.reflect.Method r9) {
            r6 = this;
            java.lang.String r0 = r9.getName()
            r1 = 0
            java.lang.Object r7 = r9.invoke(r7, r1)     // Catch: java.lang.Throwable -> L1f5
            int r9 = r0.hashCode()     // Catch: java.lang.Throwable -> L1f5
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            java.lang.Class<com.alibaba.fastjson2.reader.ObjectReader> r2 = com.alibaba.fastjson2.reader.ObjectReader.class
            r3 = 0
            switch(r9) {
                case -1678076717: goto L1e3;
                case -1073807344: goto L189;
                case -1052827512: goto L178;
                case -1008770331: goto L168;
                case -853109563: goto L155;
                case -676507419: goto L142;
                case -618447321: goto L132;
                case -432515134: goto L11b;
                case -167039347: goto L108;
                case 230944667: goto L9d;
                case 1053501509: goto L8a;
                case 1401959644: goto L71;
                case 1706529099: goto L67;
                case 1752415457: goto L57;
                case 1970571962: goto L17;
                default: goto L15;
            }
        L15:
            goto L1f5
        L17:
            java.lang.String r9 = "seeAlso"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            java.lang.Class[] r7 = (java.lang.Class[]) r7     // Catch: java.lang.Throwable -> L1f5
            int r9 = r7.length     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            r8.seeAlso = r7     // Catch: java.lang.Throwable -> L1f5
            int r9 = r7.length     // Catch: java.lang.Throwable -> L1f5
            java.lang.String[] r9 = new java.lang.String[r9]     // Catch: java.lang.Throwable -> L1f5
            r8.seeAlsoNames = r9     // Catch: java.lang.Throwable -> L1f5
        L2b:
            int r9 = r7.length     // Catch: java.lang.Throwable -> L1f5
            if (r3 >= r9) goto L4d
            r9 = r7[r3]     // Catch: java.lang.Throwable -> L1f5
            com.alibaba.fastjson2.codec.BeanInfo r0 = new com.alibaba.fastjson2.codec.BeanInfo     // Catch: java.lang.Throwable -> L1f5
            r0.<init>()     // Catch: java.lang.Throwable -> L1f5
            r6.processSeeAlsoAnnotation(r0, r9)     // Catch: java.lang.Throwable -> L1f5
            java.lang.String r0 = r0.typeName     // Catch: java.lang.Throwable -> L1f5
            if (r0 == 0) goto L42
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L1f5
            if (r1 == 0) goto L46
        L42:
            java.lang.String r0 = r9.getSimpleName()     // Catch: java.lang.Throwable -> L1f5
        L46:
            java.lang.String[] r9 = r8.seeAlsoNames     // Catch: java.lang.Throwable -> L1f5
            r9[r3] = r0     // Catch: java.lang.Throwable -> L1f5
            int r3 = r3 + 1
            goto L2b
        L4d:
            long r0 = r8.readerFeatures     // Catch: java.lang.Throwable -> L1f5
            com.alibaba.fastjson2.JSONReader$Feature r7 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType     // Catch: java.lang.Throwable -> L1f5
            long r2 = r7.mask     // Catch: java.lang.Throwable -> L1f5
            long r0 = r0 | r2
            r8.readerFeatures = r0     // Catch: java.lang.Throwable -> L1f5
            return
        L57:
            java.lang.String r9 = "ignores"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch: java.lang.Throwable -> L1f5
            int r9 = r7.length     // Catch: java.lang.Throwable -> L1f5
            if (r9 <= 0) goto L1f5
            r8.ignores = r7     // Catch: java.lang.Throwable -> L1f5
            return
        L67:
            java.lang.String r9 = "autoTypeCheckHandler"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            goto L123
        L71:
            java.lang.String r9 = "deserializeFeatures"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            com.alibaba.fastjson2.JSONReader$Feature[] r7 = (com.alibaba.fastjson2.JSONReader.Feature[]) r7     // Catch: java.lang.Throwable -> L1f5
        L7b:
            int r9 = r7.length     // Catch: java.lang.Throwable -> L1f5
            if (r3 >= r9) goto L1f5
            long r0 = r8.readerFeatures     // Catch: java.lang.Throwable -> L1f5
            r9 = r7[r3]     // Catch: java.lang.Throwable -> L1f5
            long r4 = r9.mask     // Catch: java.lang.Throwable -> L1f5
            long r0 = r0 | r4
            r8.readerFeatures = r0     // Catch: java.lang.Throwable -> L1f5
            int r3 = r3 + 1
            goto L7b
        L8a:
            java.lang.String r9 = "deserializeUsing"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            java.lang.Class r7 = (java.lang.Class) r7     // Catch: java.lang.Throwable -> L1f5
            boolean r9 = r2.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            r8.deserializer = r7     // Catch: java.lang.Throwable -> L1f5
            return
        L9d:
            java.lang.String r9 = "builder"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            java.lang.Class r7 = (java.lang.Class) r7     // Catch: java.lang.Throwable -> L1f5
            java.lang.Class r9 = java.lang.Void.TYPE     // Catch: java.lang.Throwable -> L1f5
            if (r7 == r9) goto L1f5
            if (r7 == r1) goto L1f5
            r8.builder = r7     // Catch: java.lang.Throwable -> L1f5
            java.lang.annotation.Annotation[] r9 = r7.getDeclaredAnnotations()     // Catch: java.lang.Throwable -> L1f5
            int r0 = r9.length     // Catch: java.lang.Throwable -> L1f5
        Lb4:
            if (r3 >= r0) goto Lef
            r1 = r9[r3]     // Catch: java.lang.Throwable -> L1f5
            java.lang.Class r2 = r1.annotationType()     // Catch: java.lang.Throwable -> L1f5
            java.lang.String r4 = r2.getName()     // Catch: java.lang.Throwable -> L1f5
            java.lang.String r5 = "com.alibaba.fastjson.annotation.JSONPOJOBuilder"
            boolean r4 = r4.equals(r5)     // Catch: java.lang.Throwable -> L1f5
            if (r4 == 0) goto Lcc
            r6.getBeanInfo1xJSONPOJOBuilder(r8, r7, r1, r2)     // Catch: java.lang.Throwable -> L1f5
            goto Lec
        Lcc:
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONBuilder> r1 = com.alibaba.fastjson2.annotation.JSONBuilder.class
            java.lang.annotation.Annotation r1 = com.alibaba.fastjson2.util.BeanUtils.findAnnotation(r7, r1)     // Catch: java.lang.Throwable -> L1f5
            com.alibaba.fastjson2.annotation.JSONBuilder r1 = (com.alibaba.fastjson2.annotation.JSONBuilder) r1     // Catch: java.lang.Throwable -> L1f5
            if (r1 == 0) goto Lec
            java.lang.String r2 = r1.buildMethod()     // Catch: java.lang.Throwable -> L1f5
            java.lang.reflect.Method r2 = com.alibaba.fastjson2.util.BeanUtils.buildMethod(r7, r2)     // Catch: java.lang.Throwable -> L1f5
            r8.buildMethod = r2     // Catch: java.lang.Throwable -> L1f5
            java.lang.String r1 = r1.withPrefix()     // Catch: java.lang.Throwable -> L1f5
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1f5
            if (r2 != 0) goto Lec
            r8.builderWithPrefix = r1     // Catch: java.lang.Throwable -> L1f5
        Lec:
            int r3 = r3 + 1
            goto Lb4
        Lef:
            java.lang.reflect.Method r9 = r8.buildMethod     // Catch: java.lang.Throwable -> L1f5
            if (r9 != 0) goto Lfb
            java.lang.String r9 = "build"
            java.lang.reflect.Method r9 = com.alibaba.fastjson2.util.BeanUtils.buildMethod(r7, r9)     // Catch: java.lang.Throwable -> L1f5
            r8.buildMethod = r9     // Catch: java.lang.Throwable -> L1f5
        Lfb:
            java.lang.reflect.Method r9 = r8.buildMethod     // Catch: java.lang.Throwable -> L1f5
            if (r9 != 0) goto L1f5
            java.lang.String r9 = "create"
            java.lang.reflect.Method r7 = com.alibaba.fastjson2.util.BeanUtils.buildMethod(r7, r9)     // Catch: java.lang.Throwable -> L1f5
            r8.buildMethod = r7     // Catch: java.lang.Throwable -> L1f5
            return
        L108:
            java.lang.String r9 = "rootName"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L1f5
            boolean r9 = r7.isEmpty()     // Catch: java.lang.Throwable -> L1f5
            if (r9 != 0) goto L1f5
            r8.rootName = r7     // Catch: java.lang.Throwable -> L1f5
            return
        L11b:
            java.lang.String r9 = "autoTypeBeforeHandler"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
        L123:
            java.lang.Class r7 = (java.lang.Class) r7     // Catch: java.lang.Throwable -> L1f5
            java.lang.Class<com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler> r9 = com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler.class
            if (r7 == r9) goto L1f5
            boolean r9 = r9.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            r8.autoTypeBeforeHandler = r7     // Catch: java.lang.Throwable -> L1f5
            return
        L132:
            java.lang.String r9 = "seeAlsoDefault"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            r9 = r7
            java.lang.Class r9 = (java.lang.Class) r9     // Catch: java.lang.Throwable -> L1f5
            if (r9 == r1) goto L15d
            r8.seeAlsoDefault = r9     // Catch: java.lang.Throwable -> L1f5
            goto L15d
        L142:
            java.lang.String r9 = "typeName"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L1f5
            boolean r9 = r7.isEmpty()     // Catch: java.lang.Throwable -> L1f5
            if (r9 != 0) goto L1f5
            r8.typeName = r7     // Catch: java.lang.Throwable -> L1f5
            return
        L155:
            java.lang.String r9 = "typeKey"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
        L15d:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L1f5
            boolean r9 = r7.isEmpty()     // Catch: java.lang.Throwable -> L1f5
            if (r9 != 0) goto L1f5
            r8.typeKey = r7     // Catch: java.lang.Throwable -> L1f5
            return
        L168:
            java.lang.String r9 = "orders"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            java.lang.String[] r7 = (java.lang.String[]) r7     // Catch: java.lang.Throwable -> L1f5
            int r9 = r7.length     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            r8.orders = r7     // Catch: java.lang.Throwable -> L1f5
            return
        L178:
            java.lang.String r9 = "naming"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            java.lang.Enum r7 = (java.lang.Enum) r7     // Catch: java.lang.Throwable -> L1f5
            java.lang.String r7 = r7.name()     // Catch: java.lang.Throwable -> L1f5
            r8.namingStrategy = r7     // Catch: java.lang.Throwable -> L1f5
            return
        L189:
            java.lang.String r9 = "parseFeatures"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            java.lang.Enum[] r7 = (java.lang.Enum[]) r7     // Catch: java.lang.Throwable -> L1f5
        L193:
            int r9 = r7.length     // Catch: java.lang.Throwable -> L1f5
            if (r3 >= r9) goto L1f5
            r9 = r7[r3]     // Catch: java.lang.Throwable -> L1f5
            java.lang.String r9 = r9.name()     // Catch: java.lang.Throwable -> L1f5
            int r0 = r9.hashCode()     // Catch: java.lang.Throwable -> L1f5
            switch(r0) {
                case -1604251670: goto L1da;
                case -894003883: goto L1c8;
                case -200815016: goto L1b6;
                case 2005790178: goto L1a4;
                default: goto L1a3;
            }     // Catch: java.lang.Throwable -> L1f5
        L1a3:
            goto L1e0
        L1a4:
            java.lang.String r0 = "InitStringFieldAsEmpty"
            boolean r9 = r9.equals(r0)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1e0
            long r0 = r8.readerFeatures     // Catch: java.lang.Throwable -> L1f5
            com.alibaba.fastjson2.JSONReader$Feature r9 = com.alibaba.fastjson2.JSONReader.Feature.InitStringFieldAsEmpty     // Catch: java.lang.Throwable -> L1f5
            long r4 = r9.mask     // Catch: java.lang.Throwable -> L1f5
            long r0 = r0 | r4
            r8.readerFeatures = r0     // Catch: java.lang.Throwable -> L1f5
            goto L1e0
        L1b6:
            java.lang.String r0 = "SupportAutoType"
            boolean r9 = r9.equals(r0)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1e0
            long r0 = r8.readerFeatures     // Catch: java.lang.Throwable -> L1f5
            com.alibaba.fastjson2.JSONReader$Feature r9 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType     // Catch: java.lang.Throwable -> L1f5
            long r4 = r9.mask     // Catch: java.lang.Throwable -> L1f5
            long r0 = r0 | r4
            r8.readerFeatures = r0     // Catch: java.lang.Throwable -> L1f5
            goto L1e0
        L1c8:
            java.lang.String r0 = "SupportArrayToBean"
            boolean r9 = r9.equals(r0)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1e0
            long r0 = r8.readerFeatures     // Catch: java.lang.Throwable -> L1f5
            com.alibaba.fastjson2.JSONReader$Feature r9 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean     // Catch: java.lang.Throwable -> L1f5
            long r4 = r9.mask     // Catch: java.lang.Throwable -> L1f5
            long r0 = r0 | r4
            r8.readerFeatures = r0     // Catch: java.lang.Throwable -> L1f5
            goto L1e0
        L1da:
            java.lang.String r0 = "TrimStringFieldValue"
            boolean r9 = r9.equals(r0)     // Catch: java.lang.Throwable -> L1f5
        L1e0:
            int r3 = r3 + 1
            goto L193
        L1e3:
            java.lang.String r9 = "deserializer"
            boolean r9 = r0.equals(r9)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            java.lang.Class r7 = (java.lang.Class) r7     // Catch: java.lang.Throwable -> L1f5
            boolean r9 = r2.isAssignableFrom(r7)     // Catch: java.lang.Throwable -> L1f5
            if (r9 == 0) goto L1f5
            r8.deserializer = r7     // Catch: java.lang.Throwable -> L1f5
        L1f5:
            return
    }

    private static /* synthetic */ void lambda$getBeanInfo1xJSONPOJOBuilder$12(java.lang.annotation.Annotation r4, com.alibaba.fastjson2.codec.BeanInfo r5, java.lang.Class r6, java.lang.reflect.Method r7) {
            java.lang.String r0 = r7.getName()     // Catch: java.lang.Throwable -> L3f
            int r1 = r0.hashCode()     // Catch: java.lang.Throwable -> L3f
            r2 = 2068281583(0x7b4778ef, float:1.0357199E36)
            r3 = 0
            if (r1 == r2) goto L2b
            r6 = 2092901112(0x7cbf22f8, float:7.9395036E36)
            if (r1 == r6) goto L14
            goto L3f
        L14:
            java.lang.String r6 = "withPrefix"
            boolean r6 = r0.equals(r6)     // Catch: java.lang.Throwable -> L3f
            if (r6 == 0) goto L3f
            java.lang.Object r4 = r7.invoke(r4, r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L3f
            boolean r6 = r4.isEmpty()     // Catch: java.lang.Throwable -> L3f
            if (r6 != 0) goto L3f
            r5.builderWithPrefix = r4     // Catch: java.lang.Throwable -> L3f
            return
        L2b:
            java.lang.String r1 = "buildMethod"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L3f
            java.lang.Object r4 = r7.invoke(r4, r3)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L3f
            java.lang.reflect.Method r4 = com.alibaba.fastjson2.util.BeanUtils.buildMethod(r6, r4)     // Catch: java.lang.Throwable -> L3f
            r5.buildMethod = r4     // Catch: java.lang.Throwable -> L3f
        L3f:
            return
    }

    private static /* synthetic */ void lambda$getCreator$13(java.lang.annotation.Annotation r3, com.alibaba.fastjson2.codec.BeanInfo r4, java.lang.reflect.Method r5) {
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Throwable -> L22
            int r1 = r0.hashCode()     // Catch: java.lang.Throwable -> L22
            r2 = 1117066527(0x4295151f, float:74.54125)
            if (r1 == r2) goto Le
            goto L22
        Le:
            java.lang.String r1 = "parameterNames"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L22
            r0 = 0
            java.lang.Object r3 = r5.invoke(r3, r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch: java.lang.Throwable -> L22
            int r5 = r3.length     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto L22
            r4.createParameterNames = r3     // Catch: java.lang.Throwable -> L22
        L22:
            return
    }

    private static /* synthetic */ void lambda$getCreator$14(java.lang.annotation.Annotation r3, com.alibaba.fastjson2.codec.BeanInfo r4, java.lang.reflect.Method r5) {
            java.lang.String r0 = r5.getName()     // Catch: java.lang.Throwable -> L22
            int r1 = r0.hashCode()     // Catch: java.lang.Throwable -> L22
            r2 = 1117066527(0x4295151f, float:74.54125)
            if (r1 == r2) goto Le
            goto L22
        Le:
            java.lang.String r1 = "parameterNames"
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L22
            if (r0 == 0) goto L22
            r0 = 0
            java.lang.Object r3 = r5.invoke(r3, r0)     // Catch: java.lang.Throwable -> L22
            java.lang.String[] r3 = (java.lang.String[]) r3     // Catch: java.lang.Throwable -> L22
            int r5 = r3.length     // Catch: java.lang.Throwable -> L22
            if (r5 == 0) goto L22
            r4.createParameterNames = r3     // Catch: java.lang.Throwable -> L22
        L22:
            return
    }

    private static /* synthetic */ java.nio.charset.Charset lambda$getObjectReaderModule$15(java.lang.String r0) {
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            return r0
    }

    private static /* synthetic */ java.io.File lambda$getObjectReaderModule$16(java.lang.String r1) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            return r0
    }

    private static /* synthetic */ java.net.URL lambda$getObjectReaderModule$17(java.lang.String r1) {
            java.net.URL r0 = new java.net.URL     // Catch: java.net.MalformedURLException -> L6
            r0.<init>(r1)     // Catch: java.net.MalformedURLException -> L6
            return r0
        L6:
            r1 = move-exception
            java.lang.String r0 = "read URL error"
            ah.a.x(r0, r1)
            r1 = 0
            return r1
    }

    private static /* synthetic */ java.time.ZoneId lambda$getObjectReaderModule$18(java.lang.String r0) {
            java.time.ZoneId r0 = java.time.ZoneId.of(r0)
            return r0
    }

    private static /* synthetic */ java.util.TimeZone lambda$getObjectReaderModule$19(java.lang.String r0) {
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            return r0
    }

    private static /* synthetic */ java.net.InetAddress lambda$getObjectReaderModule$20(java.lang.String r1) {
            java.net.InetAddress r1 = java.net.InetAddress.getByName(r1)     // Catch: java.net.UnknownHostException -> L5
            return r1
        L5:
            r1 = move-exception
            java.lang.String r0 = "create address error"
            ah.a.x(r0, r1)
            r1 = 0
            return r1
    }

    private static /* synthetic */ void lambda$processJSONField1x$11(java.lang.annotation.Annotation r5, com.alibaba.fastjson2.codec.FieldInfo r6, java.lang.reflect.Method r7) {
            java.lang.String r0 = "'T'"
            java.lang.String r1 = r7.getName()
            r2 = 0
            java.lang.Object r5 = r7.invoke(r5, r2)     // Catch: java.lang.Throwable -> L150
            int r7 = r1.hashCode()     // Catch: java.lang.Throwable -> L150
            switch(r7) {
                case -1268779017: goto L125;
                case -1206994319: goto L10e;
                case -1073807344: goto Lae;
                case -659125328: goto L9b;
                case -224599314: goto L63;
                case 3373707: goto L50;
                case 102727412: goto L3d;
                case 1053501509: goto L28;
                case 1746983807: goto L14;
                default: goto L12;
            }     // Catch: java.lang.Throwable -> L150
        L12:
            goto L150
        L14:
            java.lang.String r7 = "deserialize"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> L150
            if (r7 == 0) goto L150
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L150
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L150
            if (r5 != 0) goto L150
            r5 = 1
            r6.ignore = r5     // Catch: java.lang.Throwable -> L150
            return
        L28:
            java.lang.String r7 = "deserializeUsing"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> L150
            if (r7 == 0) goto L150
            java.lang.Class r5 = (java.lang.Class) r5     // Catch: java.lang.Throwable -> L150
            java.lang.Class<com.alibaba.fastjson2.reader.ObjectReader> r7 = com.alibaba.fastjson2.reader.ObjectReader.class
            boolean r7 = r7.isAssignableFrom(r5)     // Catch: java.lang.Throwable -> L150
            if (r7 == 0) goto L150
            r6.readUsing = r5     // Catch: java.lang.Throwable -> L150
            return
        L3d:
            java.lang.String r7 = "label"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> L150
            if (r7 == 0) goto L150
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L150
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> L150
            if (r7 != 0) goto L150
            r6.label = r5     // Catch: java.lang.Throwable -> L150
            return
        L50:
            java.lang.String r7 = "name"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> L150
            if (r7 == 0) goto L150
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L150
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> L150
            if (r7 != 0) goto L150
            r6.fieldName = r5     // Catch: java.lang.Throwable -> L150
            return
        L63:
            java.lang.String r7 = "alternateNames"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> L150
            if (r7 == 0) goto L150
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L150
            int r7 = r5.length     // Catch: java.lang.Throwable -> L150
            if (r7 == 0) goto L150
            java.lang.String[] r7 = r6.alternateNames     // Catch: java.lang.Throwable -> L150
            if (r7 != 0) goto L77
            r6.alternateNames = r5     // Catch: java.lang.Throwable -> L150
            return
        L77:
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet     // Catch: java.lang.Throwable -> L150
            r7.<init>()     // Catch: java.lang.Throwable -> L150
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L150
            r7.addAll(r5)     // Catch: java.lang.Throwable -> L150
            java.lang.String[] r5 = r6.alternateNames     // Catch: java.lang.Throwable -> L150
            java.util.List r5 = java.util.Arrays.asList(r5)     // Catch: java.lang.Throwable -> L150
            r7.addAll(r5)     // Catch: java.lang.Throwable -> L150
            int r5 = r7.size()     // Catch: java.lang.Throwable -> L150
            java.lang.String[] r5 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L150
            java.lang.Object[] r5 = r7.toArray(r5)     // Catch: java.lang.Throwable -> L150
            java.lang.String[] r5 = (java.lang.String[]) r5     // Catch: java.lang.Throwable -> L150
            r6.alternateNames = r5     // Catch: java.lang.Throwable -> L150
            return
        L9b:
            java.lang.String r7 = "defaultValue"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> L150
            if (r7 == 0) goto L150
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L150
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> L150
            if (r7 != 0) goto L150
            r6.defaultValue = r5     // Catch: java.lang.Throwable -> L150
            return
        Lae:
            java.lang.String r7 = "parseFeatures"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> L150
            if (r7 == 0) goto L150
            java.lang.Enum[] r5 = (java.lang.Enum[]) r5     // Catch: java.lang.Throwable -> L150
            int r7 = r5.length     // Catch: java.lang.Throwable -> L150
            r0 = 0
        Lba:
            if (r0 >= r7) goto L150
            r1 = r5[r0]     // Catch: java.lang.Throwable -> L150
            java.lang.String r1 = r1.name()     // Catch: java.lang.Throwable -> L150
            int r2 = r1.hashCode()     // Catch: java.lang.Throwable -> L150
            r3 = -894003883(0xffffffffcab69555, float:-5982890.5)
            if (r2 == r3) goto Lfa
            r3 = -200815016(0xfffffffff407ce58, float:-4.303865E31)
            if (r2 == r3) goto Le8
            r3 = 2005790178(0x778dede2, float:5.7573335E33)
            if (r2 == r3) goto Ld6
            goto L10b
        Ld6:
            java.lang.String r2 = "InitStringFieldAsEmpty"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L150
            if (r1 == 0) goto L10b
            long r1 = r6.features     // Catch: java.lang.Throwable -> L150
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.InitStringFieldAsEmpty     // Catch: java.lang.Throwable -> L150
            long r3 = r3.mask     // Catch: java.lang.Throwable -> L150
            long r1 = r1 | r3
            r6.features = r1     // Catch: java.lang.Throwable -> L150
            goto L10b
        Le8:
            java.lang.String r2 = "SupportAutoType"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L150
            if (r1 == 0) goto L10b
            long r1 = r6.features     // Catch: java.lang.Throwable -> L150
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType     // Catch: java.lang.Throwable -> L150
            long r3 = r3.mask     // Catch: java.lang.Throwable -> L150
            long r1 = r1 | r3
            r6.features = r1     // Catch: java.lang.Throwable -> L150
            goto L10b
        Lfa:
            java.lang.String r2 = "SupportArrayToBean"
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L150
            if (r1 == 0) goto L10b
            long r1 = r6.features     // Catch: java.lang.Throwable -> L150
            com.alibaba.fastjson2.JSONReader$Feature r3 = com.alibaba.fastjson2.JSONReader.Feature.SupportArrayToBean     // Catch: java.lang.Throwable -> L150
            long r3 = r3.mask     // Catch: java.lang.Throwable -> L150
            long r1 = r1 | r3
            r6.features = r1     // Catch: java.lang.Throwable -> L150
        L10b:
            int r0 = r0 + 1
            goto Lba
        L10e:
            java.lang.String r7 = "ordinal"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> L150
            if (r7 == 0) goto L150
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.Throwable -> L150
            int r7 = r5.intValue()     // Catch: java.lang.Throwable -> L150
            if (r7 == 0) goto L150
            int r5 = r5.intValue()     // Catch: java.lang.Throwable -> L150
            r6.ordinal = r5     // Catch: java.lang.Throwable -> L150
            return
        L125:
            java.lang.String r7 = "format"
            boolean r7 = r1.equals(r7)     // Catch: java.lang.Throwable -> L150
            if (r7 == 0) goto L150
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L150
            boolean r7 = r5.isEmpty()     // Catch: java.lang.Throwable -> L150
            if (r7 != 0) goto L150
            java.lang.String r5 = r5.trim()     // Catch: java.lang.Throwable -> L150
            r7 = 84
            int r7 = r5.indexOf(r7)     // Catch: java.lang.Throwable -> L150
            r1 = -1
            if (r7 == r1) goto L14e
            boolean r7 = r5.contains(r0)     // Catch: java.lang.Throwable -> L150
            if (r7 != 0) goto L14e
            java.lang.String r7 = "T"
            java.lang.String r5 = r5.replaceAll(r7, r0)     // Catch: java.lang.Throwable -> L150
        L14e:
            r6.format = r5     // Catch: java.lang.Throwable -> L150
        L150:
            return
    }

    private static /* synthetic */ void lambda$processSeeAlsoAnnotation$10(java.lang.annotation.Annotation r2, com.alibaba.fastjson2.codec.BeanInfo r3, java.lang.reflect.Method r4) {
            java.lang.String r0 = r4.getName()
            r1 = 0
            java.lang.Object r2 = r4.invoke(r2, r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.String r4 = "typeName"
            boolean r4 = r0.equals(r4)     // Catch: java.lang.Throwable -> L1b
            if (r4 == 0) goto L1b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L1b
            boolean r4 = r2.isEmpty()     // Catch: java.lang.Throwable -> L1b
            if (r4 != 0) goto L1b
            r3.typeName = r2     // Catch: java.lang.Throwable -> L1b
        L1b:
            return
    }

    public static /* synthetic */ void m(com.alibaba.fastjson2.reader.ObjectReaderProvider r0, com.alibaba.fastjson2.codec.BeanInfo r1, java.lang.Class r2, java.lang.reflect.Method r3) {
            r0.lambda$getBeanInfo$5(r1, r2, r3)
            return
    }

    public static boolean match(java.lang.reflect.Type r5, com.alibaba.fastjson2.reader.ObjectReader r6, java.lang.ClassLoader r7) {
            java.lang.Class r0 = com.alibaba.fastjson2.util.TypeUtils.getClass(r5)
            r1 = 1
            if (r0 == 0) goto Le
            java.lang.ClassLoader r0 = r0.getClassLoader()
            if (r0 != r7) goto Le
            return r1
        Le:
            boolean r0 = r5 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            if (r0 == 0) goto L34
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r0 = r5.getRawType()
            boolean r0 = match(r0, r6, r7)
            if (r0 == 0) goto L20
            return r1
        L20:
            java.lang.reflect.Type[] r5 = r5.getActualTypeArguments()
            r0 = r2
        L25:
            int r3 = r5.length
            if (r0 >= r3) goto L34
            r3 = r5[r0]
            boolean r3 = match(r3, r6, r7)
            if (r3 == 0) goto L31
            return r1
        L31:
            int r0 = r0 + 1
            goto L25
        L34:
            boolean r5 = r6 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped
            if (r5 == 0) goto L55
            com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped r6 = (com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped) r6
            java.lang.Class r5 = r6.valueClass
            if (r5 == 0) goto L45
            java.lang.ClassLoader r5 = r5.getClassLoader()
            if (r5 != r7) goto L45
            return r1
        L45:
            java.lang.reflect.Type r5 = r6.keyType
            java.lang.Class r5 = com.alibaba.fastjson2.util.TypeUtils.getClass(r5)
            if (r5 == 0) goto L54
            java.lang.ClassLoader r5 = r5.getClassLoader()
            if (r5 != r7) goto L54
            return r1
        L54:
            return r2
        L55:
            boolean r5 = r6 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplList
            if (r5 == 0) goto L67
            com.alibaba.fastjson2.reader.ObjectReaderImplList r6 = (com.alibaba.fastjson2.reader.ObjectReaderImplList) r6
            java.lang.Class r5 = r6.itemClass
            if (r5 == 0) goto L66
            java.lang.ClassLoader r5 = r5.getClassLoader()
            if (r5 != r7) goto L66
            return r1
        L66:
            return r2
        L67:
            boolean r5 = r6 instanceof com.alibaba.fastjson2.reader.ObjectReaderImplOptional
            if (r5 == 0) goto L79
            com.alibaba.fastjson2.reader.ObjectReaderImplOptional r6 = (com.alibaba.fastjson2.reader.ObjectReaderImplOptional) r6
            java.lang.Class r5 = r6.itemClass
            if (r5 == 0) goto L78
            java.lang.ClassLoader r5 = r5.getClassLoader()
            if (r5 != r7) goto L78
            return r1
        L78:
            return r2
        L79:
            boolean r5 = r6 instanceof com.alibaba.fastjson2.reader.ObjectReaderAdapter
            if (r5 == 0) goto La3
            com.alibaba.fastjson2.reader.ObjectReaderAdapter r6 = (com.alibaba.fastjson2.reader.ObjectReaderAdapter) r6
            com.alibaba.fastjson2.reader.FieldReader[] r5 = r6.fieldReaders
            int r6 = r5.length
            r0 = r2
        L83:
            if (r0 >= r6) goto La3
            r3 = r5[r0]
            java.lang.Class r4 = r3.fieldClass
            if (r4 == 0) goto L92
            java.lang.ClassLoader r4 = r4.getClassLoader()
            if (r4 != r7) goto L92
            return r1
        L92:
            java.lang.reflect.Type r3 = r3.fieldType
            boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto La0
            r4 = 0
            boolean r3 = match(r3, r4, r7)
            if (r3 == 0) goto La0
            return r1
        La0:
            int r0 = r0 + 1
            goto L83
        La3:
            return r2
    }

    public static /* synthetic */ java.net.URL n(java.lang.String r0) {
            java.net.URL r0 = lambda$getObjectReaderModule$17(r0)
            return r0
    }

    public static /* synthetic */ void o(com.alibaba.fastjson2.codec.BeanInfo r0, java.lang.annotation.Annotation r1, java.lang.reflect.Method r2) {
            lambda$processSeeAlsoAnnotation$10(r1, r0, r2)
            return
    }

    public static /* synthetic */ java.net.InetAddress p(java.lang.String r0) {
            java.net.InetAddress r0 = lambda$getObjectReaderModule$20(r0)
            return r0
    }

    private void processAnnotation(com.alibaba.fastjson2.codec.FieldInfo r6, java.lang.annotation.Annotation[] r7) {
            r5 = this;
            int r0 = r7.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L2c
            r2 = r7[r1]
            java.lang.Class r3 = r2.annotationType()
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONField> r4 = com.alibaba.fastjson2.annotation.JSONField.class
            java.lang.annotation.Annotation r4 = com.alibaba.fastjson2.util.BeanUtils.findAnnotation(r2, r4)
            com.alibaba.fastjson2.annotation.JSONField r4 = (com.alibaba.fastjson2.annotation.JSONField) r4
            if (r4 == 0) goto L1a
            r5.getFieldInfo(r6, r4)
            if (r4 != r2) goto L1a
            goto L29
        L1a:
            java.lang.String r3 = r3.getName()
            java.lang.String r4 = "com.alibaba.fastjson.annotation.JSONField"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L29
            r5.processJSONField1x(r6, r2)
        L29:
            int r1 = r1 + 1
            goto L2
        L2c:
            return
    }

    private void processJSONField1x(com.alibaba.fastjson2.codec.FieldInfo r4, java.lang.annotation.Annotation r5) {
            r3 = this;
            java.lang.Class r0 = r5.getClass()
            be.w r1 = new be.w
            r2 = 6
            r1.<init>(r5, r2, r4)
            com.alibaba.fastjson2.util.BeanUtils.annotationMethods(r0, r1)
            return
    }

    private void processSeeAlsoAnnotation(com.alibaba.fastjson2.codec.BeanInfo r3, java.lang.Class<?> r4) {
            r2 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r2.mixInCache
            java.lang.Object r0 = r0.get(r4)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L16
            if (r0 == r4) goto L16
            r1 = 1
            r3.mixIn = r1
            java.lang.annotation.Annotation[] r0 = r0.getDeclaredAnnotations()
            r2.processSeeAlsoAnnotation(r3, r0)
        L16:
            java.lang.annotation.Annotation[] r4 = r4.getDeclaredAnnotations()
            r2.processSeeAlsoAnnotation(r3, r4)
            return
    }

    private void processSeeAlsoAnnotation(com.alibaba.fastjson2.codec.BeanInfo r7, java.lang.annotation.Annotation[] r8) {
            r6 = this;
            int r0 = r8.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L16
            r2 = r8[r1]
            java.lang.Class r3 = r2.annotationType()
            com.alibaba.fastjson2.reader.g r4 = new com.alibaba.fastjson2.reader.g
            r5 = 0
            r4.<init>(r2, r7, r5)
            com.alibaba.fastjson2.util.BeanUtils.annotationMethods(r3, r4)
            int r1 = r1 + 1
            goto L2
        L16:
            return
    }

    public static /* synthetic */ void q(java.lang.annotation.Annotation r0, com.alibaba.fastjson2.codec.BeanInfo r1, java.lang.Class r2, java.lang.reflect.Method r3) {
            lambda$getBeanInfo1xJSONPOJOBuilder$12(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ java.lang.Object r(java.lang.Object r0) {
            java.lang.Object r0 = lambda$buildInitTypeConverts$0(r0)
            return r0
    }

    public static java.util.function.Function registerTypeConvert(java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.util.Map<java.lang.reflect.Type, java.util.function.Function>> r1, java.lang.reflect.Type r2, java.lang.reflect.Type r3, java.util.function.Function r4) {
            java.lang.Object r0 = r1.get(r2)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L17
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.put(r2, r0)
            java.lang.Object r1 = r1.get(r2)
            r0 = r1
            java.util.Map r0 = (java.util.Map) r0
        L17:
            java.lang.Object r1 = r0.put(r3, r4)
            java.util.function.Function r1 = (java.util.function.Function) r1
            return r1
    }

    public static /* synthetic */ java.util.TimeZone s(java.lang.String r0) {
            java.util.TimeZone r0 = lambda$getObjectReaderModule$19(r0)
            return r0
    }

    public static /* synthetic */ void t(com.alibaba.fastjson2.reader.ObjectReaderProvider r0, com.alibaba.fastjson2.codec.BeanInfo r1, java.lang.Class r2, java.lang.reflect.Constructor r3) {
            r0.lambda$getBeanInfo$6(r1, r2, r3)
            return
    }

    public static com.alibaba.fastjson2.reader.ObjectReader typedMap(java.lang.Class r10, java.lang.Class r11, java.lang.reflect.Type r12, java.lang.reflect.Type r13) {
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            if (r12 == 0) goto L6
            if (r12 != r0) goto L10
        L6:
            if (r13 != r0) goto L10
            com.alibaba.fastjson2.reader.ObjectReaderImplMapString r12 = new com.alibaba.fastjson2.reader.ObjectReaderImplMapString
            r0 = 0
            r12.<init>(r10, r11, r0)
            return r12
        L10:
            com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped r2 = new com.alibaba.fastjson2.reader.ObjectReaderImplMapTyped
            r7 = 0
            r9 = 0
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r2.<init>(r3, r4, r5, r6, r7, r9)
            return r2
    }

    public static /* synthetic */ java.lang.Object u(java.lang.Object r0) {
            java.lang.Object r0 = lambda$buildInitTypeConverts$1(r0)
            return r0
    }

    public void addAutoTypeAccept(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L27
            int r0 = r5.length()
            if (r0 == 0) goto L27
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r5)
            long[] r5 = r4.acceptHashCodes
            int r5 = java.util.Arrays.binarySearch(r5, r0)
            if (r5 >= 0) goto L27
            long[] r5 = r4.acceptHashCodes
            int r2 = r5.length
            int r3 = r2 + 1
            long[] r3 = new long[r3]
            r3[r2] = r0
            int r0 = r5.length
            r1 = 0
            java.lang.System.arraycopy(r5, r1, r3, r1, r0)
            java.util.Arrays.sort(r3)
            r4.acceptHashCodes = r3
        L27:
            return
    }

    public void addAutoTypeDeny(java.lang.String r5) {
            r4 = this;
            if (r5 == 0) goto L27
            int r0 = r5.length()
            if (r0 == 0) goto L27
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64(r5)
            long[] r5 = r4.denyHashCodes
            int r5 = java.util.Arrays.binarySearch(r5, r0)
            if (r5 >= 0) goto L27
            long[] r5 = r4.denyHashCodes
            int r2 = r5.length
            int r3 = r2 + 1
            long[] r3 = new long[r3]
            r3[r2] = r0
            int r0 = r5.length
            r1 = 0
            java.lang.System.arraycopy(r5, r1, r3, r1, r0)
            java.util.Arrays.sort(r3)
            r4.denyHashCodes = r3
        L27:
            return
    }

    public final void afterAutoType(java.lang.String r3, java.lang.Class r4) {
            r2 = this;
            java.util.function.Consumer<java.lang.Class> r0 = r2.autoTypeHandler
            if (r0 == 0) goto L7
            r0.accept(r4)
        L7:
            com.alibaba.fastjson2.reader.ObjectReaderProvider$LRUAutoTypeCache r4 = r2.autoTypeList
            monitor-enter(r4)
            com.alibaba.fastjson2.reader.ObjectReaderProvider$LRUAutoTypeCache r0 = r2.autoTypeList     // Catch: java.lang.Throwable -> L16
            java.util.Date r1 = new java.util.Date     // Catch: java.lang.Throwable -> L16
            r1.<init>()     // Catch: java.lang.Throwable -> L16
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L16
            throw r3
    }

    public java.lang.Class<?> checkAutoType(java.lang.String r26, java.lang.Class<?> r27, long r28) {
            r25 = this;
            r0 = r25
            r1 = r26
            r2 = r27
            r3 = r28
            r5 = 0
            if (r1 == 0) goto L11
            boolean r6 = r1.isEmpty()
            if (r6 == 0) goto L15
        L11:
            r18 = r5
            goto L1a2
        L15:
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r6 = r0.autoTypeBeforeHandler
            if (r6 == 0) goto L23
            java.lang.Class r6 = r6.apply(r1, r2, r3)
            if (r6 == 0) goto L23
            r0.afterAutoType(r1, r6)
            return r6
        L23:
            int r6 = r1.length()
            r7 = 192(0xc0, float:2.69E-43)
            java.lang.String r8 = "autoType is not support. "
            if (r6 >= r7) goto L199
            r7 = 0
            char r9 = r1.charAt(r7)
            r10 = 91
            r11 = 1
            if (r9 != r10) goto L3e
            java.lang.String r9 = r1.substring(r11)
            r0.checkAutoType(r9, r5, r3)
        L3e:
            if (r2 == 0) goto L4e
            java.lang.String r9 = r2.getName()
            boolean r9 = r9.equals(r1)
            if (r9 == 0) goto L4e
            r25.afterAutoType(r26, r27)
            return r2
        L4e:
            com.alibaba.fastjson2.JSONReader$Feature r9 = com.alibaba.fastjson2.JSONReader.Feature.SupportAutoType
            long r9 = r9.mask
            long r9 = r9 & r3
            r12 = 0
            int r9 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r9 == 0) goto L5a
            goto L5b
        L5a:
            r11 = r7
        L5b:
            r14 = 46
            r15 = 36
            r16 = -3750763034362895579(0xcbf29ce484222325, double:-7.302176725335867E57)
            r18 = r5
            java.lang.String r5 = " -> "
            java.lang.String r7 = "type not match. "
            if (r11 == 0) goto Lcd
            r21 = r16
            r9 = 0
            r19 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
        L74:
            if (r9 >= r6) goto Lca
            char r10 = r1.charAt(r9)
            if (r10 != r15) goto L7d
            r10 = r14
        L7d:
            r23 = r12
            long r12 = (long) r10
            long r12 = r21 ^ r12
            long r12 = r12 * r19
            long[] r10 = r0.acceptHashCodes
            int r10 = java.util.Arrays.binarySearch(r10, r12)
            if (r10 < 0) goto Lac
            java.lang.Class r10 = com.alibaba.fastjson2.util.TypeUtils.loadClass(r1)
            if (r10 == 0) goto Lac
            if (r2 == 0) goto La8
            boolean r3 = r2.isAssignableFrom(r10)
            if (r3 == 0) goto L9b
            goto La8
        L9b:
            java.lang.StringBuilder r1 = bc.e.o(r7, r1, r5)
            java.lang.String r2 = r2.getName()
            ah.a.r(r1, r2)
        La6:
            r1 = 0
            return r1
        La8:
            r0.afterAutoType(r1, r10)
            return r10
        Lac:
            long[] r10 = r0.denyHashCodes
            int r10 = java.util.Arrays.binarySearch(r10, r12)
            if (r10 < 0) goto Lc3
            java.lang.Class r10 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r1)
            if (r10 == 0) goto Lbb
            goto Lc3
        Lbb:
            java.lang.String r1 = r8.concat(r1)
            ah.a.w(r1)
            goto La6
        Lc3:
            int r9 = r9 + 1
            r21 = r12
            r12 = r23
            goto L74
        Lca:
            r23 = r12
            goto Ld3
        Lcd:
            r19 = 1099511628211(0x100000001b3, double:5.43230922702E-312)
            goto Lca
        Ld3:
            if (r11 != 0) goto L120
            r9 = 0
        Ld6:
            if (r9 >= r6) goto L120
            char r10 = r1.charAt(r9)
            if (r10 != r15) goto Ldf
            r10 = r14
        Ldf:
            long r12 = (long) r10
            long r12 = r16 ^ r12
            long r12 = r12 * r19
            long[] r10 = r0.denyHashCodes
            int r10 = java.util.Arrays.binarySearch(r10, r12)
            if (r10 >= 0) goto L118
            long[] r10 = r0.acceptHashCodes
            int r10 = java.util.Arrays.binarySearch(r10, r12)
            if (r10 < 0) goto L113
            java.lang.Class r3 = com.alibaba.fastjson2.util.TypeUtils.loadClass(r1)
            if (r3 == 0) goto L10f
            if (r2 == 0) goto L10f
            boolean r4 = r2.isAssignableFrom(r3)
            if (r4 == 0) goto L103
            goto L10f
        L103:
            java.lang.StringBuilder r1 = bc.e.o(r7, r1, r5)
            java.lang.String r2 = r2.getName()
            ah.a.r(r1, r2)
            goto La6
        L10f:
            r0.afterAutoType(r1, r3)
            return r3
        L113:
            int r9 = r9 + 1
            r16 = r12
            goto Ld6
        L118:
            java.lang.String r1 = r8.concat(r1)
            ah.a.w(r1)
            goto La6
        L120:
            if (r11 != 0) goto L123
            return r18
        L123:
            java.lang.Class r6 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r1)
            if (r6 == 0) goto L14b
            if (r2 == 0) goto L147
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r2 == r3) goto L147
            java.lang.Class<java.util.HashMap> r3 = java.util.HashMap.class
            if (r6 == r3) goto L147
            boolean r3 = r2.isAssignableFrom(r6)
            if (r3 == 0) goto L13a
            goto L147
        L13a:
            java.lang.StringBuilder r1 = bc.e.o(r7, r1, r5)
            java.lang.String r2 = r2.getName()
            ah.a.r(r1, r2)
            goto La6
        L147:
            r0.afterAutoType(r1, r6)
            return r6
        L14b:
            java.lang.Class r6 = com.alibaba.fastjson2.util.TypeUtils.loadClass(r1)
            if (r6 == 0) goto L195
            java.lang.Class<java.lang.ClassLoader> r9 = java.lang.ClassLoader.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 != 0) goto L18c
            java.lang.Class<javax.sql.DataSource> r9 = javax.sql.DataSource.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 != 0) goto L18c
            java.lang.Class<javax.sql.RowSet> r9 = javax.sql.RowSet.class
            boolean r9 = r9.isAssignableFrom(r6)
            if (r9 != 0) goto L18c
            if (r2 == 0) goto L195
            boolean r8 = r2.isAssignableFrom(r6)
            if (r8 == 0) goto L175
            r0.afterAutoType(r1, r6)
            return r6
        L175:
            com.alibaba.fastjson2.JSONReader$Feature r6 = com.alibaba.fastjson2.JSONReader.Feature.IgnoreAutoTypeNotMatch
            long r8 = r6.mask
            long r3 = r3 & r8
            int r3 = (r3 > r23 ? 1 : (r3 == r23 ? 0 : -1))
            if (r3 == 0) goto L17f
            return r2
        L17f:
            java.lang.StringBuilder r1 = bc.e.o(r7, r1, r5)
            java.lang.String r2 = r2.getName()
            ah.a.r(r1, r2)
            goto La6
        L18c:
            java.lang.String r1 = r8.concat(r1)
            ah.a.w(r1)
            goto La6
        L195:
            r0.afterAutoType(r1, r6)
            return r6
        L199:
            java.lang.String r1 = r8.concat(r1)
            ah.a.w(r1)
            goto La6
        L1a2:
            return r18
    }

    public void cleanup(java.lang.Class r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r1.mixInCache
            r0.remove(r2)
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r0 = r1.cache
            r0.remove(r2)
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r0 = r1.cacheFieldBased
            r0.remove(r2)
            com.alibaba.fastjson2.util.BeanUtils.cleanupCache(r2)
            return
    }

    public void cleanup(java.lang.ClassLoader r4) {
            r3 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r3.mixInCache
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            java.lang.Class r1 = (java.lang.Class) r1
            java.lang.ClassLoader r1 = r1.getClassLoader()
            if (r1 != r4) goto La
            r0.remove()
            goto La
        L26:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r0 = r3.cache
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L30:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L52
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.Object r1 = r1.getValue()
            com.alibaba.fastjson2.reader.ObjectReader r1 = (com.alibaba.fastjson2.reader.ObjectReader) r1
            boolean r1 = match(r2, r1, r4)
            if (r1 == 0) goto L30
            r0.remove()
            goto L30
        L52:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r0 = r3.cacheFieldBased
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L5c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L7e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            java.lang.Object r1 = r1.getValue()
            com.alibaba.fastjson2.reader.ObjectReader r1 = (com.alibaba.fastjson2.reader.ObjectReader) r1
            boolean r1 = match(r2, r1, r4)
            if (r1 == 0) goto L5c
            r0.remove()
            goto L5c
        L7e:
            com.alibaba.fastjson2.util.BeanUtils.cleanupCache(r4)
            return
    }

    public void cleanupMixIn() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r1.mixInCache
            r0.clear()
            return
    }

    public void clear() {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r1.mixInCache
            r0.clear()
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r0 = r1.cache
            r0.clear()
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r0 = r1.cacheFieldBased
            r0.clear()
            return
    }

    public com.alibaba.fastjson2.reader.FieldReader createFieldReader(java.lang.Class r8, java.lang.String r9, long r10) {
            r7 = this;
            com.alibaba.fastjson2.JSONReader$Feature r0 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r0 = r0.mask
            long r10 = r10 & r0
            r0 = 0
            int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r10 == 0) goto L14
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r10 = r7.cacheFieldBased
            java.lang.Object r10 = r10.get(r8)
            com.alibaba.fastjson2.reader.ObjectReader r10 = (com.alibaba.fastjson2.reader.ObjectReader) r10
            goto L1c
        L14:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r10 = r7.cache
            java.lang.Object r10 = r10.get(r8)
            com.alibaba.fastjson2.reader.ObjectReader r10 = (com.alibaba.fastjson2.reader.ObjectReader) r10
        L1c:
            if (r10 == 0) goto L23
            com.alibaba.fastjson2.reader.FieldReader r8 = r10.getFieldReader(r9)
            return r8
        L23:
            java.util.concurrent.atomic.AtomicReference r10 = new java.util.concurrent.atomic.AtomicReference
            r10.<init>()
            long r0 = com.alibaba.fastjson2.util.Fnv.hashCode64LCase(r9)
            com.alibaba.fastjson2.reader.h r11 = new com.alibaba.fastjson2.reader.h
            r2 = 0
            r11.<init>(r0, r10, r2)
            com.alibaba.fastjson2.util.BeanUtils.fields(r8, r11)
            java.lang.Object r10 = r10.get()
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            r11 = 0
            if (r10 == 0) goto L49
            com.alibaba.fastjson2.reader.ObjectReaderCreator r8 = r7.creator
            java.lang.Class r0 = r10.getType()
            com.alibaba.fastjson2.reader.FieldReader r8 = r8.createFieldReader(r9, r11, r0, r10)
            return r8
        L49:
            java.util.concurrent.atomic.AtomicReference r10 = new java.util.concurrent.atomic.AtomicReference
            r10.<init>()
            com.alibaba.fastjson2.reader.h r2 = new com.alibaba.fastjson2.reader.h
            r3 = 1
            r2.<init>(r0, r10, r3)
            com.alibaba.fastjson2.util.BeanUtils.setters(r8, r2)
            java.lang.Object r10 = r10.get()
            r6 = r10
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            if (r6 == 0) goto L72
            java.lang.Class[] r10 = r6.getParameterTypes()
            r11 = 0
            r4 = r10[r11]
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = r7.creator
            r3 = 0
            r5 = r4
            r1 = r8
            r2 = r9
            com.alibaba.fastjson2.reader.FieldReader r8 = r0.createFieldReaderMethod(r1, r2, r3, r4, r5, r6)
            return r8
        L72:
            return r11
    }

    public com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler getAutoTypeBeforeHandler() {
            r1 = this;
            com.alibaba.fastjson2.JSONReader$AutoTypeBeforeHandler r0 = r1.autoTypeBeforeHandler
            return r0
    }

    public java.util.function.Consumer<java.lang.Class> getAutoTypeHandler() {
            r1 = this;
            java.util.function.Consumer<java.lang.Class> r0 = r1.autoTypeHandler
            return r0
    }

    public java.util.Map<java.lang.String, java.util.Date> getAutoTypeList() {
            r1 = this;
            com.alibaba.fastjson2.reader.ObjectReaderProvider$LRUAutoTypeCache r0 = r1.autoTypeList
            return r0
    }

    public void getBeanInfo(com.alibaba.fastjson2.codec.BeanInfo r8, java.lang.Class<?> r9) {
            r7 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r7.mixInCache
            java.lang.Object r0 = r0.get(r9)
            java.lang.Class r0 = (java.lang.Class) r0
            r1 = 0
            if (r0 == 0) goto L27
            if (r0 == r9) goto L27
            r2 = 1
            r8.mixIn = r2
            java.lang.annotation.Annotation[] r3 = r0.getDeclaredAnnotations()
            r7.getBeanInfo(r8, r3)
            com.alibaba.fastjson2.reader.m r3 = new com.alibaba.fastjson2.reader.m
            r3.<init>(r7, r8, r9, r1)
            com.alibaba.fastjson2.util.BeanUtils.staticMethod(r0, r3)
            com.alibaba.fastjson2.reader.m r3 = new com.alibaba.fastjson2.reader.m
            r3.<init>(r7, r8, r9, r2)
            com.alibaba.fastjson2.util.BeanUtils.constructor(r0, r3)
        L27:
            java.lang.Class r0 = r9.getSuperclass()
            r2 = 0
        L2c:
            if (r0 == 0) goto L55
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            if (r0 == r3) goto L55
            java.lang.Class<java.lang.Enum> r3 = java.lang.Enum.class
            if (r0 != r3) goto L37
            goto L55
        L37:
            com.alibaba.fastjson2.codec.BeanInfo r3 = new com.alibaba.fastjson2.codec.BeanInfo
            r3.<init>()
            r7.getBeanInfo(r3, r0)
            java.lang.Class[] r3 = r3.seeAlso
            if (r3 == 0) goto L50
            int r4 = r3.length
            r5 = r1
        L45:
            if (r5 >= r4) goto L4f
            r6 = r3[r5]
            if (r6 != r9) goto L4c
            goto L50
        L4c:
            int r5 = r5 + 1
            goto L45
        L4f:
            r2 = r0
        L50:
            java.lang.Class r0 = r0.getSuperclass()
            goto L2c
        L55:
            if (r2 == 0) goto L5a
            r7.getBeanInfo(r8, r2)
        L5a:
            java.lang.annotation.Annotation[] r0 = r9.getDeclaredAnnotations()
            r7.getBeanInfo(r8, r0)
            int r2 = r0.length
        L62:
            if (r1 >= r2) goto L7d
            r3 = r0[r1]
            java.lang.Class r4 = r3.annotationType()
            java.lang.String r4 = r4.getName()
            java.lang.String r5 = "com.alibaba.fastjson.annotation.JSONType"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L77
            goto L7a
        L77:
            r7.getBeanInfo1x(r8, r3)
        L7a:
            int r1 = r1 + 1
            goto L62
        L7d:
            com.alibaba.fastjson2.reader.m r0 = new com.alibaba.fastjson2.reader.m
            r1 = 2
            r0.<init>(r7, r8, r9, r1)
            com.alibaba.fastjson2.util.BeanUtils.staticMethod(r9, r0)
            com.alibaba.fastjson2.reader.m r0 = new com.alibaba.fastjson2.reader.m
            r1 = 3
            r0.<init>(r7, r8, r9, r1)
            com.alibaba.fastjson2.util.BeanUtils.constructor(r9, r0)
            java.lang.reflect.Constructor r0 = r8.creatorConstructor
            if (r0 != 0) goto Lad
            long r0 = r8.readerFeatures
            com.alibaba.fastjson2.JSONReader$Feature r2 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r2 = r2.mask
            long r0 = r0 & r2
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto Lad
            boolean r0 = r8.kotlin
            if (r0 == 0) goto Lad
            com.alibaba.fastjson2.util.BeanUtils.getKotlinConstructor(r9, r8)
            java.lang.String[] r9 = com.alibaba.fastjson2.util.BeanUtils.getKotlinConstructorParameters(r9)
            r8.createParameterNames = r9
        Lad:
            return
    }

    public void getBeanInfo1x(com.alibaba.fastjson2.codec.BeanInfo r3, java.lang.annotation.Annotation r4) {
            r2 = this;
            java.lang.Class r0 = r4.getClass()
            com.alibaba.fastjson2.reader.k r1 = new com.alibaba.fastjson2.reader.k
            r1.<init>(r2, r4, r3)
            com.alibaba.fastjson2.util.BeanUtils.annotationMethods(r0, r1)
            return
    }

    public com.alibaba.fastjson2.reader.ObjectReaderCreator getCreator() {
            r1 = this;
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = r1.creator
            return r0
    }

    public void getFieldInfo(com.alibaba.fastjson2.codec.FieldInfo r3, java.lang.Class r4, java.lang.reflect.Constructor r5, int r6, java.lang.annotation.Annotation[][] r7) {
            r2 = this;
            r0 = 0
            if (r4 == 0) goto L24
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r1 = r2.mixInCache
            java.lang.Object r1 = r1.get(r4)
            java.lang.Class r1 = (java.lang.Class) r1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L24
            java.lang.Class[] r4 = r5.getParameterTypes()     // Catch: java.lang.NoSuchMethodException -> L18
            java.lang.reflect.Constructor r4 = r1.getDeclaredConstructor(r4)     // Catch: java.lang.NoSuchMethodException -> L18
            goto L19
        L18:
            r4 = r0
        L19:
            if (r4 == 0) goto L24
            java.lang.annotation.Annotation[][] r4 = r4.getParameterAnnotations()
            r4 = r4[r6]
            r2.processAnnotation(r3, r4)
        L24:
            if (r7 != 0) goto L2a
            java.lang.annotation.Annotation[][] r7 = r5.getParameterAnnotations()
        L2a:
            int r4 = r7.length
            int r5 = r5.getParameterCount()
            if (r4 != r5) goto L32
            goto L34
        L32:
            int r6 = r6 + (-1)
        L34:
            if (r6 < 0) goto L3b
            int r4 = r7.length
            if (r6 >= r4) goto L3b
            r0 = r7[r6]
        L3b:
            if (r0 == 0) goto L43
            int r4 = r0.length
            if (r4 <= 0) goto L43
            r2.processAnnotation(r3, r0)
        L43:
            return
    }

    public void getFieldInfo(com.alibaba.fastjson2.codec.FieldInfo r2, java.lang.Class r3, java.lang.reflect.Field r4) {
            r1 = this;
            if (r3 == 0) goto L1d
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r1.mixInCache
            java.lang.Object r0 = r0.get(r3)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L1d
            java.lang.String r3 = r4.getName()     // Catch: java.lang.Exception -> L17
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Exception -> L17
            goto L18
        L17:
            r3 = 0
        L18:
            if (r3 == 0) goto L1d
            r1.getFieldInfo(r2, r0, r3)
        L1d:
            java.lang.annotation.Annotation[] r3 = r4.getDeclaredAnnotations()
            int r4 = r3.length
            if (r4 <= 0) goto L27
            r1.processAnnotation(r2, r3)
        L27:
            return
    }

    public void getFieldInfo(com.alibaba.fastjson2.codec.FieldInfo r13, java.lang.Class r14, java.lang.reflect.Method r15) {
            r12 = this;
            java.lang.String r0 = r15.getName()
            r1 = 0
            r2 = 0
            if (r14 == 0) goto L53
            java.lang.Class r3 = r14.getSuperclass()
            java.lang.Class<java.lang.Object> r4 = java.lang.Object.class
            if (r3 == r4) goto L1b
            if (r3 == 0) goto L1b
            java.lang.reflect.Method r4 = com.alibaba.fastjson2.util.BeanUtils.getMethod(r3, r15)
            if (r4 == 0) goto L1b
            r12.getFieldInfo(r13, r3, r4)
        L1b:
            java.lang.Class[] r4 = r14.getInterfaces()
            r5 = r2
        L20:
            int r6 = r4.length
            if (r5 >= r6) goto L38
            r6 = r4[r5]
            java.lang.Class<java.io.Serializable> r7 = java.io.Serializable.class
            if (r6 != r7) goto L2a
            goto L35
        L2a:
            java.lang.reflect.Method r6 = com.alibaba.fastjson2.util.BeanUtils.getMethod(r6, r15)
            if (r6 == 0) goto L35
            if (r3 == 0) goto L35
            r12.getFieldInfo(r13, r3, r6)
        L35:
            int r5 = r5 + 1
            goto L20
        L38:
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r3 = r12.mixInCache
            java.lang.Object r3 = r3.get(r14)
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 == 0) goto L53
            if (r3 == r14) goto L53
            java.lang.Class[] r4 = r15.getParameterTypes()     // Catch: java.lang.Exception -> L4d
            java.lang.reflect.Method r4 = r3.getDeclaredMethod(r0, r4)     // Catch: java.lang.Exception -> L4d
            goto L4e
        L4d:
            r4 = r1
        L4e:
            if (r4 == 0) goto L53
            r12.getFieldInfo(r13, r3, r4)
        L53:
            java.lang.annotation.Annotation[] r15 = r15.getDeclaredAnnotations()
            int r3 = r15.length
            r5 = r1
            r4 = r2
        L5a:
            if (r4 >= r3) goto L88
            r6 = r15[r4]
            java.lang.Class r7 = r6.annotationType()
            java.lang.Class<com.alibaba.fastjson2.annotation.JSONField> r8 = com.alibaba.fastjson2.annotation.JSONField.class
            java.lang.annotation.Annotation r8 = com.alibaba.fastjson2.util.BeanUtils.findAnnotation(r6, r8)
            com.alibaba.fastjson2.annotation.JSONField r8 = (com.alibaba.fastjson2.annotation.JSONField) r8
            if (r8 == 0) goto L76
            r12.getFieldInfo(r13, r8)
            java.lang.String r5 = r8.name()
            if (r8 != r6) goto L76
            goto L85
        L76:
            java.lang.String r7 = r7.getName()
            java.lang.String r8 = "com.alibaba.fastjson.annotation.JSONField"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L85
            r12.processJSONField1x(r13, r6)
        L85:
            int r4 = r4 + 1
            goto L5a
        L88:
            java.lang.String r15 = "set"
            boolean r15 = r0.startsWith(r15, r2)
            if (r15 == 0) goto L96
            java.lang.String r15 = com.alibaba.fastjson2.util.BeanUtils.setterName(r0, r1)
        L94:
            r9 = r15
            goto L9b
        L96:
            java.lang.String r15 = com.alibaba.fastjson2.util.BeanUtils.getterName(r0, r1)
            goto L94
        L9b:
            int r15 = r9.length()
            r0 = 1
            if (r15 <= r0) goto Le0
            char r15 = r9.charAt(r2)
            r3 = 65
            if (r15 < r3) goto Le0
            r4 = 90
            if (r15 > r4) goto Le0
            char r15 = r9.charAt(r0)
            if (r15 < r3) goto Le0
            if (r15 > r4) goto Le0
            if (r5 == 0) goto Lbe
            boolean r15 = r5.isEmpty()
            if (r15 == 0) goto Le0
        Lbe:
            char[] r15 = r9.toCharArray()
            char r1 = r15[r2]
            int r1 = r1 + 32
            char r1 = (char) r1
            r15[r2] = r1
            java.lang.String r1 = new java.lang.String
            r1.<init>(r15)
            char r2 = r15[r0]
            int r2 = r2 + 32
            char r2 = (char) r2
            r15[r0] = r2
            java.lang.String r0 = new java.lang.String
            r0.<init>(r15)
            r11 = r0
            r10 = r1
        Ldc:
            r8 = r12
            r7 = r13
            r6 = r14
            goto Le3
        Le0:
            r10 = r1
            r11 = r10
            goto Ldc
        Le3:
            com.alibaba.fastjson2.util.BeanUtils.getFieldInfo(r6, r7, r8, r9, r10, r11)
            r1 = r10
            r0 = r11
            if (r1 == 0) goto Lf8
            java.lang.String r13 = r7.fieldName
            if (r13 != 0) goto Lf8
            java.lang.String[] r13 = r7.alternateNames
            if (r13 != 0) goto Lf8
            java.lang.String[] r13 = new java.lang.String[]{r1, r0}
            r7.alternateNames = r13
        Lf8:
            return
    }

    public void getFieldInfo(com.alibaba.fastjson2.codec.FieldInfo r3, java.lang.Class r4, java.lang.reflect.Method r5, int r6) {
            r2 = this;
            if (r4 == 0) goto L27
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r2.mixInCache
            java.lang.Object r0 = r0.get(r4)
            java.lang.Class r0 = (java.lang.Class) r0
            if (r0 == 0) goto L27
            if (r0 == r4) goto L27
            java.lang.String r4 = r5.getName()     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.Class[] r1 = r5.getParameterTypes()     // Catch: java.lang.NoSuchMethodException -> L1b
            java.lang.reflect.Method r4 = r0.getMethod(r4, r1)     // Catch: java.lang.NoSuchMethodException -> L1b
            goto L1c
        L1b:
            r4 = 0
        L1c:
            if (r4 == 0) goto L27
            java.lang.annotation.Annotation[][] r4 = r4.getParameterAnnotations()
            r4 = r4[r6]
            r2.processAnnotation(r3, r4)
        L27:
            java.lang.annotation.Annotation[][] r4 = r5.getParameterAnnotations()
            r4 = r4[r6]
            r2.processAnnotation(r3, r4)
            return
    }

    public java.lang.Class getMixIn(java.lang.Class r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r1.mixInCache
            java.lang.Object r2 = r0.get(r2)
            java.lang.Class r2 = (java.lang.Class) r2
            return r2
    }

    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(long r4) {
            r3 = this;
            com.alibaba.fastjson2.reader.ObjectReaderProvider$ObjectReaderCachePair r0 = com.alibaba.fastjson2.reader.ObjectReaderProvider.readerCache
            if (r0 == 0) goto L1a
            long r1 = r0.hashCode
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 != 0) goto Ld
            com.alibaba.fastjson2.reader.ObjectReader r4 = r0.reader
            return r4
        Ld:
            int r1 = r0.missCount
            int r2 = r1 + 1
            r0.missCount = r2
            r0 = 16
            if (r1 <= r0) goto L1a
            r0 = 0
            com.alibaba.fastjson2.reader.ObjectReaderProvider.readerCache = r0
        L1a:
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r4)
            java.util.concurrent.ConcurrentMap<java.lang.Long, com.alibaba.fastjson2.reader.ObjectReader> r1 = r3.hashCache
            java.lang.Object r0 = r1.get(r0)
            com.alibaba.fastjson2.reader.ObjectReader r0 = (com.alibaba.fastjson2.reader.ObjectReader) r0
            if (r0 == 0) goto L34
            com.alibaba.fastjson2.reader.ObjectReaderProvider$ObjectReaderCachePair r1 = com.alibaba.fastjson2.reader.ObjectReaderProvider.readerCache
            if (r1 != 0) goto L34
            com.alibaba.fastjson2.reader.ObjectReaderProvider$ObjectReaderCachePair r1 = new com.alibaba.fastjson2.reader.ObjectReaderProvider$ObjectReaderCachePair
            r1.<init>(r4, r0)
            com.alibaba.fastjson2.reader.ObjectReaderProvider.readerCache = r1
        L34:
            return r0
    }

    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(java.lang.String r4, java.lang.Class<?> r5, long r6) {
            r3 = this;
            java.lang.Class r0 = r3.checkAutoType(r4, r5, r6)
            if (r0 != 0) goto L8
            r4 = 0
            return r4
        L8:
            com.alibaba.fastjson2.JSONReader$Feature r1 = com.alibaba.fastjson2.JSONReader.Feature.FieldBased
            long r1 = r1.mask
            long r6 = r6 & r1
            r1 = 0
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 == 0) goto L15
            r6 = 1
            goto L16
        L15:
            r6 = 0
        L16:
            com.alibaba.fastjson2.reader.ObjectReader r6 = r3.getObjectReader(r0, r6)
            if (r0 == r5) goto L23
            long r4 = com.alibaba.fastjson2.util.Fnv.hashCode64(r4)
            r3.registerIfAbsent(r4, r6)
        L23:
            return r6
    }

    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(java.lang.reflect.Type r2) {
            r1 = this;
            r0 = 0
            com.alibaba.fastjson2.reader.ObjectReader r2 = r1.getObjectReader(r2, r0)
            return r2
    }

    public com.alibaba.fastjson2.reader.ObjectReader getObjectReader(java.lang.reflect.Type r8, boolean r9) {
            r7 = this;
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r8 != 0) goto L5
            r8 = r0
        L5:
            if (r9 == 0) goto L10
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r1 = r7.cacheFieldBased
            java.lang.Object r1 = r1.get(r8)
            com.alibaba.fastjson2.reader.ObjectReader r1 = (com.alibaba.fastjson2.reader.ObjectReader) r1
            goto L18
        L10:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r1 = r7.cache
            java.lang.Object r1 = r1.get(r8)
            com.alibaba.fastjson2.reader.ObjectReader r1 = (com.alibaba.fastjson2.reader.ObjectReader) r1
        L18:
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L3a
            boolean r4 = r8 instanceof java.lang.reflect.WildcardType
            if (r4 == 0) goto L3a
            r4 = r8
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            java.lang.reflect.Type[] r4 = r4.getUpperBounds()
            int r5 = r4.length
            if (r5 != r3) goto L3a
            r1 = r4[r2]
            if (r9 == 0) goto L37
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r4 = r7.cacheFieldBased
        L30:
            java.lang.Object r1 = r4.get(r1)
            com.alibaba.fastjson2.reader.ObjectReader r1 = (com.alibaba.fastjson2.reader.ObjectReader) r1
            goto L3a
        L37:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r4 = r7.cache
            goto L30
        L3a:
            if (r1 == 0) goto L3d
            return r1
        L3d:
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.getObjectReaderModule(r8)
            if (r1 == 0) goto L5a
            if (r9 == 0) goto L4e
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r9 = r7.cacheFieldBased
            java.lang.Object r8 = r9.put(r8, r1)
            com.alibaba.fastjson2.reader.ObjectReader r8 = (com.alibaba.fastjson2.reader.ObjectReader) r8
            goto L56
        L4e:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r9 = r7.cache
            java.lang.Object r8 = r9.put(r8, r1)
            com.alibaba.fastjson2.reader.ObjectReader r8 = (com.alibaba.fastjson2.reader.ObjectReader) r8
        L56:
            if (r8 == 0) goto L59
            return r8
        L59:
            return r1
        L5a:
            boolean r1 = r8 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L7c
            r1 = r8
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.reflect.Type[] r1 = r1.getBounds()
            int r4 = r1.length
            if (r4 <= 0) goto L7c
            r1 = r1[r2]
            boolean r4 = r1 instanceof java.lang.Class
            if (r4 == 0) goto L7c
            com.alibaba.fastjson2.reader.ObjectReader r1 = r7.getObjectReader(r1, r9)
            if (r1 == 0) goto L7c
            com.alibaba.fastjson2.reader.ObjectReader r8 = r7.getPreviousObjectReader(r9, r8, r1)
            if (r8 == 0) goto L7b
            return r8
        L7b:
            return r1
        L7c:
            boolean r1 = r8 instanceof java.lang.reflect.ParameterizedType
            if (r1 == 0) goto Ld8
            r1 = r8
            java.lang.reflect.ParameterizedType r1 = (java.lang.reflect.ParameterizedType) r1
            java.lang.reflect.Type r4 = r1.getRawType()
            java.lang.reflect.Type[] r1 = r1.getActualTypeArguments()
            boolean r5 = r4 instanceof java.lang.Class
            if (r5 == 0) goto Ld8
            java.lang.Class r4 = (java.lang.Class) r4
            r5 = r4
        L92:
            if (r5 == r0) goto La2
            java.lang.reflect.TypeVariable[] r6 = r5.getTypeParameters()
            int r6 = r6.length
            if (r6 <= 0) goto L9d
            r2 = r3
            goto La2
        L9d:
            java.lang.Class r5 = r5.getSuperclass()
            goto L92
        La2:
            int r0 = r1.length
            if (r0 == 0) goto La7
            if (r2 != 0) goto Lb5
        La7:
            com.alibaba.fastjson2.reader.ObjectReader r0 = r7.getObjectReader(r4, r9)
            if (r0 == 0) goto Lb5
            com.alibaba.fastjson2.reader.ObjectReader r8 = r7.getPreviousObjectReader(r9, r8, r0)
            if (r8 == 0) goto Lb4
            return r8
        Lb4:
            return r0
        Lb5:
            int r0 = r1.length
            r5 = 0
            if (r0 != r3) goto Lc7
            java.lang.Class<java.util.ArrayList> r0 = java.util.ArrayList.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto Lc7
            com.alibaba.fastjson2.reader.ObjectReader r8 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r8, r4, r5)
            return r8
        Lc7:
            int r0 = r1.length
            r1 = 2
            if (r0 != r1) goto Ld8
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            boolean r0 = r0.isAssignableFrom(r4)
            if (r0 == 0) goto Ld8
            com.alibaba.fastjson2.reader.ObjectReader r8 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.of(r8, r4, r5)
            return r8
        Ld8:
            com.alibaba.fastjson2.reader.ObjectReaderCreator r0 = r7.getCreator()
            java.lang.Class r1 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r8)
            com.alibaba.fastjson2.reader.ObjectReader r0 = r0.createObjectReader(r1, r8, r9, r7)
            com.alibaba.fastjson2.reader.ObjectReader r8 = r7.getPreviousObjectReader(r9, r8, r0)
            if (r8 == 0) goto Leb
            return r8
        Leb:
            return r0
    }

    public com.alibaba.fastjson2.reader.ObjectReader getObjectReaderModule(java.lang.reflect.Type r46) {
            r45 = this;
            r0 = r46
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            if (r0 == r2) goto La
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            if (r0 != r3) goto Le
        La:
            r4 = r45
            goto L75d
        Le:
            java.lang.Class r3 = java.lang.Character.TYPE
            if (r0 == r3) goto L16
            java.lang.Class<java.lang.Character> r3 = java.lang.Character.class
            if (r0 != r3) goto L1a
        L16:
            r4 = r45
            goto L75a
        L1a:
            java.lang.Class r3 = java.lang.Boolean.TYPE
            if (r0 == r3) goto L22
            java.lang.Class<java.lang.Boolean> r3 = java.lang.Boolean.class
            if (r0 != r3) goto L26
        L22:
            r4 = r45
            goto L757
        L26:
            java.lang.Class r3 = java.lang.Byte.TYPE
            if (r0 == r3) goto L2e
            java.lang.Class<java.lang.Byte> r3 = java.lang.Byte.class
            if (r0 != r3) goto L32
        L2e:
            r4 = r45
            goto L754
        L32:
            java.lang.Class r3 = java.lang.Short.TYPE
            if (r0 == r3) goto L3a
            java.lang.Class<java.lang.Short> r3 = java.lang.Short.class
            if (r0 != r3) goto L3e
        L3a:
            r4 = r45
            goto L751
        L3e:
            java.lang.Class r3 = java.lang.Integer.TYPE
            if (r0 == r3) goto L46
            java.lang.Class<java.lang.Integer> r4 = java.lang.Integer.class
            if (r0 != r4) goto L4a
        L46:
            r4 = r45
            goto L74e
        L4a:
            java.lang.Class r4 = java.lang.Long.TYPE
            if (r0 == r4) goto L52
            java.lang.Class<java.lang.Long> r4 = java.lang.Long.class
            if (r0 != r4) goto L56
        L52:
            r4 = r45
            goto L74b
        L56:
            java.lang.Class r5 = java.lang.Float.TYPE
            if (r0 == r5) goto L5e
            java.lang.Class<java.lang.Float> r5 = java.lang.Float.class
            if (r0 != r5) goto L62
        L5e:
            r4 = r45
            goto L748
        L62:
            java.lang.Class r5 = java.lang.Double.TYPE
            if (r0 == r5) goto L6a
            java.lang.Class<java.lang.Double> r5 = java.lang.Double.class
            if (r0 != r5) goto L6e
        L6a:
            r4 = r45
            goto L745
        L6e:
            java.lang.Class<java.math.BigInteger> r5 = java.math.BigInteger.class
            if (r0 != r5) goto L75
            com.alibaba.fastjson2.reader.ObjectReaderImplBigInteger r0 = com.alibaba.fastjson2.reader.ObjectReaderImplBigInteger.INSTANCE
            return r0
        L75:
            java.lang.Class<java.math.BigDecimal> r5 = java.math.BigDecimal.class
            if (r0 != r5) goto L7c
            com.alibaba.fastjson2.reader.ObjectReaderImplBigDecimal r0 = com.alibaba.fastjson2.reader.ObjectReaderImplBigDecimal.INSTANCE
            return r0
        L7c:
            java.lang.Class<java.lang.Number> r5 = java.lang.Number.class
            if (r0 != r5) goto L83
            com.alibaba.fastjson2.reader.ObjectReaderImplNumber r0 = com.alibaba.fastjson2.reader.ObjectReaderImplNumber.INSTANCE
            return r0
        L83:
            java.lang.Class<java.util.OptionalInt> r5 = java.util.OptionalInt.class
            if (r0 != r5) goto L8a
            com.alibaba.fastjson2.reader.ObjectReaderImplOptionalInt r0 = com.alibaba.fastjson2.reader.ObjectReaderImplOptionalInt.INSTANCE
            return r0
        L8a:
            java.lang.Class<java.util.OptionalLong> r5 = java.util.OptionalLong.class
            if (r0 != r5) goto L91
            com.alibaba.fastjson2.reader.ObjectReaderImplOptionalLong r0 = com.alibaba.fastjson2.reader.ObjectReaderImplOptionalLong.INSTANCE
            return r0
        L91:
            java.lang.Class<java.util.OptionalDouble> r5 = java.util.OptionalDouble.class
            if (r0 != r5) goto L98
            com.alibaba.fastjson2.reader.ObjectReaderImplOptionalDouble r0 = com.alibaba.fastjson2.reader.ObjectReaderImplOptionalDouble.INSTANCE
            return r0
        L98:
            java.lang.Class<java.util.Optional> r5 = java.util.Optional.class
            if (r0 != r5) goto L9f
            com.alibaba.fastjson2.reader.ObjectReaderImplOptional r0 = com.alibaba.fastjson2.reader.ObjectReaderImplOptional.INSTANCE
            return r0
        L9f:
            java.lang.Class<java.util.UUID> r6 = java.util.UUID.class
            if (r0 != r6) goto La6
            com.alibaba.fastjson2.reader.ObjectReaderImplUUID r0 = com.alibaba.fastjson2.reader.ObjectReaderImplUUID.INSTANCE
            return r0
        La6:
            java.lang.Class<java.time.Duration> r6 = java.time.Duration.class
            if (r0 != r6) goto Lb7
            com.alibaba.fastjson2.reader.ObjectReaderImplFromString r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromString
            com.alibaba.fastjson2.reader.f r2 = new com.alibaba.fastjson2.reader.f
            r3 = 23
            r2.<init>(r3)
            r0.<init>(r6, r2)
            return r0
        Lb7:
            java.lang.Class<java.time.Period> r6 = java.time.Period.class
            r7 = 0
            if (r0 != r6) goto Lc7
            com.alibaba.fastjson2.reader.ObjectReaderImplFromString r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromString
            com.alibaba.fastjson2.reader.l r2 = new com.alibaba.fastjson2.reader.l
            r2.<init>(r7)
            r0.<init>(r6, r2)
            return r0
        Lc7:
            java.lang.Class<java.util.concurrent.atomic.AtomicBoolean> r6 = java.util.concurrent.atomic.AtomicBoolean.class
            r8 = 1
            if (r0 != r6) goto Ld7
            com.alibaba.fastjson2.reader.ObjectReaderImplFromBoolean r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromBoolean
            com.alibaba.fastjson2.reader.l r2 = new com.alibaba.fastjson2.reader.l
            r2.<init>(r8)
            r0.<init>(r6, r2)
            return r0
        Ld7:
            r6 = 2
            java.lang.Class<java.net.URI> r9 = java.net.URI.class
            if (r0 != r9) goto Le7
            com.alibaba.fastjson2.reader.ObjectReaderImplFromString r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromString
            com.alibaba.fastjson2.reader.l r2 = new com.alibaba.fastjson2.reader.l
            r2.<init>(r6)
            r0.<init>(r9, r2)
            return r0
        Le7:
            r9 = 3
            java.lang.Class<java.nio.charset.Charset> r10 = java.nio.charset.Charset.class
            if (r0 != r10) goto Lf7
            com.alibaba.fastjson2.reader.ObjectReaderImplFromString r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromString
            com.alibaba.fastjson2.reader.l r2 = new com.alibaba.fastjson2.reader.l
            r2.<init>(r9)
            r0.<init>(r10, r2)
            return r0
        Lf7:
            r10 = 4
            java.lang.Class<java.io.File> r11 = java.io.File.class
            if (r0 != r11) goto L107
            com.alibaba.fastjson2.reader.ObjectReaderImplFromString r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromString
            com.alibaba.fastjson2.reader.l r2 = new com.alibaba.fastjson2.reader.l
            r2.<init>(r10)
            r0.<init>(r11, r2)
            return r0
        L107:
            r11 = 5
            java.lang.Class<java.net.URL> r12 = java.net.URL.class
            if (r0 != r12) goto L117
            com.alibaba.fastjson2.reader.ObjectReaderImplFromString r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromString
            com.alibaba.fastjson2.reader.l r2 = new com.alibaba.fastjson2.reader.l
            r2.<init>(r11)
            r0.<init>(r12, r2)
            return r0
        L117:
            r12 = 6
            java.lang.Class<java.util.regex.Pattern> r13 = java.util.regex.Pattern.class
            if (r0 != r13) goto L127
            com.alibaba.fastjson2.reader.ObjectReaderImplFromString r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromString
            com.alibaba.fastjson2.reader.l r2 = new com.alibaba.fastjson2.reader.l
            r2.<init>(r12)
            r0.<init>(r13, r2)
            return r0
        L127:
            r13 = 29
            java.lang.Class<java.text.SimpleDateFormat> r14 = java.text.SimpleDateFormat.class
            if (r0 != r14) goto L138
            com.alibaba.fastjson2.reader.ObjectReaderImplFromString r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromString
            com.alibaba.fastjson2.reader.f r2 = new com.alibaba.fastjson2.reader.f
            r2.<init>(r13)
            r0.<init>(r14, r2)
            return r0
        L138:
            java.lang.Class<java.lang.Class> r14 = java.lang.Class.class
            if (r0 != r14) goto L13f
            com.alibaba.fastjson2.reader.ObjectReaderImplClass r0 = com.alibaba.fastjson2.reader.ObjectReaderImplClass.INSTANCE
            return r0
        L13f:
            java.lang.Class<java.lang.reflect.Method> r14 = java.lang.reflect.Method.class
            if (r0 != r14) goto L149
            com.alibaba.fastjson2.reader.ObjectReaderImplMethod r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplMethod
            r0.<init>()
            return r0
        L149:
            java.lang.Class<java.lang.reflect.Field> r14 = java.lang.reflect.Field.class
            if (r0 != r14) goto L153
            com.alibaba.fastjson2.reader.ObjectReaderImplField r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplField
            r0.<init>()
            return r0
        L153:
            java.lang.Class<java.lang.reflect.Type> r14 = java.lang.reflect.Type.class
            if (r0 != r14) goto L15a
            com.alibaba.fastjson2.reader.ObjectReaderImplClass r0 = com.alibaba.fastjson2.reader.ObjectReaderImplClass.INSTANCE
            return r0
        L15a:
            boolean r14 = r0 instanceof java.lang.Class
            if (r14 == 0) goto L168
            r15 = r0
            java.lang.Class r15 = (java.lang.Class) r15
            java.lang.String r15 = r15.getName()
        L165:
            r16 = r7
            goto L16b
        L168:
            java.lang.String r15 = ""
            goto L165
        L16b:
            java.lang.Class<java.util.Map> r7 = java.util.Map.class
            if (r0 == r7) goto L173
            java.lang.Class<java.util.AbstractMap> r12 = java.util.AbstractMap.class
            if (r0 != r12) goto L178
        L173:
            r4 = r45
            r5 = 0
            goto L73c
        L178:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r13 = java.util.concurrent.ConcurrentMap.class
            r17 = r8
            java.lang.Class<java.util.concurrent.ConcurrentHashMap> r8 = java.util.concurrent.ConcurrentHashMap.class
            java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
            if (r0 == r13) goto L184
            if (r0 != r8) goto L189
        L184:
            r4 = r45
            r5 = 0
            goto L735
        L189:
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r9 = java.util.concurrent.ConcurrentNavigableMap.class
            java.lang.Class<java.util.concurrent.ConcurrentSkipListMap> r10 = java.util.concurrent.ConcurrentSkipListMap.class
            if (r0 == r9) goto L191
            if (r0 != r10) goto L197
        L191:
            r4 = r45
            r7 = r10
            r5 = 0
            goto L72e
        L197:
            java.lang.Class<java.util.SortedMap> r11 = java.util.SortedMap.class
            r19 = r14
            java.lang.Class<java.util.TreeMap> r14 = java.util.TreeMap.class
            if (r0 == r11) goto L1a5
            java.lang.Class<java.util.NavigableMap> r11 = java.util.NavigableMap.class
            if (r0 == r11) goto L1a5
            if (r0 != r14) goto L1aa
        L1a5:
            r4 = r45
            r7 = r14
            goto L726
        L1aa:
            java.lang.Class<java.util.Calendar> r11 = java.util.Calendar.class
            if (r0 != r11) goto L1b1
            com.alibaba.fastjson2.reader.ObjectReaderImplCalendar r0 = com.alibaba.fastjson2.reader.ObjectReaderImplCalendar.INSTANCE
            return r0
        L1b1:
            java.lang.Class<java.util.Date> r11 = java.util.Date.class
            if (r0 != r11) goto L1b8
            com.alibaba.fastjson2.reader.ObjectReaderImplDate r0 = com.alibaba.fastjson2.reader.ObjectReaderImplDate.INSTANCE
            return r0
        L1b8:
            java.lang.Class<java.time.LocalDate> r11 = java.time.LocalDate.class
            if (r0 != r11) goto L1bf
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate r0 = com.alibaba.fastjson2.reader.ObjectReaderImplLocalDate.INSTANCE
            return r0
        L1bf:
            java.lang.Class<java.time.LocalTime> r11 = java.time.LocalTime.class
            if (r0 != r11) goto L1c6
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalTime r0 = com.alibaba.fastjson2.reader.ObjectReaderImplLocalTime.INSTANCE
            return r0
        L1c6:
            java.lang.Class<java.time.LocalDateTime> r11 = java.time.LocalDateTime.class
            if (r0 != r11) goto L1cd
            com.alibaba.fastjson2.reader.ObjectReaderImplLocalDateTime r0 = com.alibaba.fastjson2.reader.ObjectReaderImplLocalDateTime.INSTANCE
            return r0
        L1cd:
            java.lang.Class<java.time.ZonedDateTime> r11 = java.time.ZonedDateTime.class
            if (r0 != r11) goto L1d4
            com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime r0 = com.alibaba.fastjson2.reader.ObjectReaderImplZonedDateTime.INSTANCE
            return r0
        L1d4:
            java.lang.Class<java.time.OffsetDateTime> r11 = java.time.OffsetDateTime.class
            if (r0 != r11) goto L1db
            com.alibaba.fastjson2.reader.ObjectReaderImplOffsetDateTime r0 = com.alibaba.fastjson2.reader.ObjectReaderImplOffsetDateTime.INSTANCE
            return r0
        L1db:
            java.lang.Class<java.time.OffsetTime> r11 = java.time.OffsetTime.class
            if (r0 != r11) goto L1e2
            com.alibaba.fastjson2.reader.ObjectReaderImplOffsetTime r0 = com.alibaba.fastjson2.reader.ObjectReaderImplOffsetTime.INSTANCE
            return r0
        L1e2:
            java.lang.Class<java.time.ZoneOffset> r11 = java.time.ZoneOffset.class
            if (r0 != r11) goto L1f2
            com.alibaba.fastjson2.reader.ObjectReaderImplFromString r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromString
            com.alibaba.fastjson2.reader.l r2 = new com.alibaba.fastjson2.reader.l
            r3 = 7
            r2.<init>(r3)
            r0.<init>(r11, r2)
            return r0
        L1f2:
            r20 = 7
            java.lang.Class<java.time.Instant> r11 = java.time.Instant.class
            if (r0 != r11) goto L1fb
            com.alibaba.fastjson2.reader.ObjectReaderImplInstant r0 = com.alibaba.fastjson2.reader.ObjectReaderImplInstant.INSTANCE
            return r0
        L1fb:
            java.lang.Class<java.util.Locale> r11 = java.util.Locale.class
            if (r0 != r11) goto L202
            com.alibaba.fastjson2.reader.ObjectReaderImplLocale r0 = com.alibaba.fastjson2.reader.ObjectReaderImplLocale.INSTANCE
            return r0
        L202:
            java.lang.Class<java.util.Currency> r11 = java.util.Currency.class
            if (r0 != r11) goto L209
            com.alibaba.fastjson2.reader.ObjectReaderImplCurrency r0 = com.alibaba.fastjson2.reader.ObjectReaderImplCurrency.INSTANCE
            return r0
        L209:
            java.lang.Class<java.time.ZoneId> r11 = java.time.ZoneId.class
            if (r0 != r11) goto L21a
            com.alibaba.fastjson2.reader.ObjectReaderImplFromString r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromString
            com.alibaba.fastjson2.reader.f r2 = new com.alibaba.fastjson2.reader.f
            r3 = 24
            r2.<init>(r3)
            r0.<init>(r11, r2)
            return r0
        L21a:
            java.lang.Class<java.util.TimeZone> r11 = java.util.TimeZone.class
            if (r0 != r11) goto L22b
            com.alibaba.fastjson2.reader.ObjectReaderImplFromString r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromString
            com.alibaba.fastjson2.reader.f r2 = new com.alibaba.fastjson2.reader.f
            r3 = 25
            r2.<init>(r3)
            r0.<init>(r11, r2)
            return r0
        L22b:
            java.lang.Class<char[]> r11 = char[].class
            if (r0 != r11) goto L232
            com.alibaba.fastjson2.reader.ObjectReaderImplCharValueArray r0 = com.alibaba.fastjson2.reader.ObjectReaderImplCharValueArray.INSTANCE
            return r0
        L232:
            java.lang.Class<float[]> r11 = float[].class
            if (r0 != r11) goto L239
            com.alibaba.fastjson2.reader.ObjectReaderImplFloatValueArray r0 = com.alibaba.fastjson2.reader.ObjectReaderImplFloatValueArray.INSTANCE
            return r0
        L239:
            java.lang.Class<double[]> r11 = double[].class
            if (r0 != r11) goto L240
            com.alibaba.fastjson2.reader.ObjectReaderImplDoubleValueArray r0 = com.alibaba.fastjson2.reader.ObjectReaderImplDoubleValueArray.INSTANCE
            return r0
        L240:
            java.lang.Class<boolean[]> r11 = boolean[].class
            if (r0 != r11) goto L247
            com.alibaba.fastjson2.reader.ObjectReaderImplBoolValueArray r0 = com.alibaba.fastjson2.reader.ObjectReaderImplBoolValueArray.INSTANCE
            return r0
        L247:
            java.lang.Class<byte[]> r11 = byte[].class
            if (r0 != r11) goto L24e
            com.alibaba.fastjson2.reader.ObjectReaderImplInt8ValueArray r0 = com.alibaba.fastjson2.reader.ObjectReaderImplInt8ValueArray.INSTANCE
            return r0
        L24e:
            java.lang.Class<short[]> r11 = short[].class
            if (r0 != r11) goto L255
            com.alibaba.fastjson2.reader.ObjectReaderImplInt16ValueArray r0 = com.alibaba.fastjson2.reader.ObjectReaderImplInt16ValueArray.INSTANCE
            return r0
        L255:
            java.lang.Class<int[]> r11 = int[].class
            if (r0 != r11) goto L25c
            com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray r0 = com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray.INSTANCE
            return r0
        L25c:
            java.lang.Class<long[]> r11 = long[].class
            if (r0 != r11) goto L263
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray r0 = com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray.INSTANCE
            return r0
        L263:
            java.lang.Class<java.lang.Byte[]> r11 = java.lang.Byte[].class
            if (r0 != r11) goto L26a
            com.alibaba.fastjson2.reader.ObjectReaderImplInt8Array r0 = com.alibaba.fastjson2.reader.ObjectReaderImplInt8Array.INSTANCE
            return r0
        L26a:
            java.lang.Class<java.lang.Short[]> r11 = java.lang.Short[].class
            if (r0 != r11) goto L271
            com.alibaba.fastjson2.reader.ObjectReaderImplInt16Array r0 = com.alibaba.fastjson2.reader.ObjectReaderImplInt16Array.INSTANCE
            return r0
        L271:
            java.lang.Class<java.lang.Integer[]> r11 = java.lang.Integer[].class
            if (r0 != r11) goto L278
            com.alibaba.fastjson2.reader.ObjectReaderImplInt32Array r0 = com.alibaba.fastjson2.reader.ObjectReaderImplInt32Array.INSTANCE
            return r0
        L278:
            java.lang.Class<java.lang.Long[]> r11 = java.lang.Long[].class
            if (r0 != r11) goto L27f
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64Array r0 = com.alibaba.fastjson2.reader.ObjectReaderImplInt64Array.INSTANCE
            return r0
        L27f:
            java.lang.Class<java.lang.Float[]> r11 = java.lang.Float[].class
            if (r0 != r11) goto L286
            com.alibaba.fastjson2.reader.ObjectReaderImplFloatArray r0 = com.alibaba.fastjson2.reader.ObjectReaderImplFloatArray.INSTANCE
            return r0
        L286:
            java.lang.Class<java.lang.Double[]> r11 = java.lang.Double[].class
            if (r0 != r11) goto L28d
            com.alibaba.fastjson2.reader.ObjectReaderImplDoubleArray r0 = com.alibaba.fastjson2.reader.ObjectReaderImplDoubleArray.INSTANCE
            return r0
        L28d:
            java.lang.Class<java.lang.Number[]> r11 = java.lang.Number[].class
            if (r0 != r11) goto L294
            com.alibaba.fastjson2.reader.ObjectReaderImplNumberArray r0 = com.alibaba.fastjson2.reader.ObjectReaderImplNumberArray.INSTANCE
            return r0
        L294:
            java.lang.Class<java.lang.String[]> r11 = java.lang.String[].class
            if (r0 != r11) goto L29b
            com.alibaba.fastjson2.reader.ObjectReaderImplStringArray r0 = com.alibaba.fastjson2.reader.ObjectReaderImplStringArray.INSTANCE
            return r0
        L29b:
            java.lang.Class<java.util.concurrent.atomic.AtomicInteger> r11 = java.util.concurrent.atomic.AtomicInteger.class
            if (r0 != r11) goto L2aa
            com.alibaba.fastjson2.reader.ObjectReaderImplFromInt r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromInt
            com.alibaba.fastjson2.reader.i r2 = new com.alibaba.fastjson2.reader.i
            r2.<init>()
            r0.<init>(r11, r2)
            return r0
        L2aa:
            java.lang.Class<java.util.concurrent.atomic.AtomicLong> r11 = java.util.concurrent.atomic.AtomicLong.class
            if (r0 != r11) goto L2b9
            com.alibaba.fastjson2.reader.ObjectReaderImplFromLong r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplFromLong
            com.alibaba.fastjson2.reader.j r2 = new com.alibaba.fastjson2.reader.j
            r2.<init>()
            r0.<init>(r11, r2)
            return r0
        L2b9:
            java.lang.Class<java.util.concurrent.atomic.AtomicIntegerArray> r11 = java.util.concurrent.atomic.AtomicIntegerArray.class
            if (r0 != r11) goto L2ca
            com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt32ValueArray
            com.alibaba.fastjson2.reader.f r2 = new com.alibaba.fastjson2.reader.f
            r3 = 26
            r2.<init>(r3)
            r0.<init>(r11, r2)
            return r0
        L2ca:
            java.lang.Class<java.util.concurrent.atomic.AtomicLongArray> r11 = java.util.concurrent.atomic.AtomicLongArray.class
            if (r0 != r11) goto L2db
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplInt64ValueArray
            com.alibaba.fastjson2.reader.f r2 = new com.alibaba.fastjson2.reader.f
            r3 = 27
            r2.<init>(r3)
            r0.<init>(r11, r2)
            return r0
        L2db:
            java.lang.Class<java.util.concurrent.atomic.AtomicReference> r11 = java.util.concurrent.atomic.AtomicReference.class
            if (r0 != r11) goto L2e2
            com.alibaba.fastjson2.reader.ObjectReaderImplAtomicReference r0 = com.alibaba.fastjson2.reader.ObjectReaderImplAtomicReference.INSTANCE
            return r0
        L2e2:
            r21 = r15
            boolean r15 = r0 instanceof com.alibaba.fastjson2.util.MultiType
            if (r15 == 0) goto L2f0
            com.alibaba.fastjson2.reader.ObjectArrayReaderMultiType r2 = new com.alibaba.fastjson2.reader.ObjectArrayReaderMultiType
            com.alibaba.fastjson2.util.MultiType r0 = (com.alibaba.fastjson2.util.MultiType) r0
            r2.<init>(r0)
            return r2
        L2f0:
            boolean r15 = r0 instanceof com.alibaba.fastjson2.util.MapMultiValueType
            if (r15 == 0) goto L2fc
            com.alibaba.fastjson2.reader.ObjectReaderImplMapMultiValueType r2 = new com.alibaba.fastjson2.reader.ObjectReaderImplMapMultiValueType
            com.alibaba.fastjson2.util.MapMultiValueType r0 = (com.alibaba.fastjson2.util.MapMultiValueType) r0
            r2.<init>(r0)
            return r2
        L2fc:
            java.lang.Class<java.lang.StringBuffer> r15 = java.lang.StringBuffer.class
            if (r0 == r15) goto L304
            java.lang.Class<java.lang.StringBuilder> r15 = java.lang.StringBuilder.class
            if (r0 != r15) goto L308
        L304:
            r4 = r45
            goto L704
        L308:
            java.lang.Class<java.lang.Iterable> r15 = java.lang.Iterable.class
            if (r0 == r15) goto L328
            r22 = r4
            java.lang.Class<java.util.Collection> r4 = java.util.Collection.class
            if (r0 == r4) goto L328
            java.lang.Class<java.util.List> r1 = java.util.List.class
            if (r0 == r1) goto L328
            r23 = r11
            java.lang.Class<java.util.AbstractCollection> r11 = java.util.AbstractCollection.class
            if (r0 == r11) goto L328
            r24 = r5
            java.lang.Class<java.util.AbstractList> r5 = java.util.AbstractList.class
            if (r0 == r5) goto L328
            r25 = r5
            java.lang.Class<java.util.ArrayList> r5 = java.util.ArrayList.class
            if (r0 != r5) goto L32f
        L328:
            r4 = r45
            r5 = 0
            r14 = 0
            goto L6ff
        L32f:
            r26 = r5
            java.lang.Class<java.util.Queue> r5 = java.util.Queue.class
            if (r0 == r5) goto L347
            r27 = r5
            java.lang.Class<java.util.Deque> r5 = java.util.Deque.class
            if (r0 == r5) goto L347
            r28 = r5
            java.lang.Class<java.util.AbstractSequentialList> r5 = java.util.AbstractSequentialList.class
            if (r0 == r5) goto L347
            r29 = r5
            java.lang.Class<java.util.LinkedList> r5 = java.util.LinkedList.class
            if (r0 != r5) goto L34e
        L347:
            r4 = r45
            r5 = 0
            r14 = 0
            goto L6fa
        L34e:
            r30 = r5
            java.lang.Class<java.util.Set> r5 = java.util.Set.class
            if (r0 == r5) goto L360
            r31 = r5
            java.lang.Class<java.util.AbstractSet> r5 = java.util.AbstractSet.class
            if (r0 == r5) goto L360
            r32 = r5
            java.lang.Class<java.util.EnumSet> r5 = java.util.EnumSet.class
            if (r0 != r5) goto L367
        L360:
            r4 = r45
            r5 = 0
            r14 = 0
            goto L6f5
        L367:
            r33 = r5
            java.lang.Class<java.util.NavigableSet> r5 = java.util.NavigableSet.class
            if (r0 == r5) goto L373
            r34 = r5
            java.lang.Class<java.util.SortedSet> r5 = java.util.SortedSet.class
            if (r0 != r5) goto L37a
        L373:
            r4 = r45
            r5 = 0
            r14 = 0
            goto L6f0
        L37a:
            r35 = r5
            java.lang.Class<java.util.concurrent.ConcurrentLinkedQueue> r5 = java.util.concurrent.ConcurrentLinkedQueue.class
            if (r0 == r5) goto L39e
            r36 = r5
            java.lang.Class<java.util.concurrent.ConcurrentSkipListSet> r5 = java.util.concurrent.ConcurrentSkipListSet.class
            if (r0 == r5) goto L39e
            r37 = r5
            java.lang.Class<java.util.LinkedHashSet> r5 = java.util.LinkedHashSet.class
            if (r0 == r5) goto L39e
            r38 = r5
            java.lang.Class<java.util.HashSet> r5 = java.util.HashSet.class
            if (r0 == r5) goto L39e
            r39 = r5
            java.lang.Class<java.util.TreeSet> r5 = java.util.TreeSet.class
            if (r0 == r5) goto L39e
            r40 = r5
            java.lang.Class<java.util.concurrent.CopyOnWriteArrayList> r5 = java.util.concurrent.CopyOnWriteArrayList.class
            if (r0 != r5) goto L3a5
        L39e:
            r4 = r45
            r5 = 0
            r14 = 0
            goto L6eb
        L3a5:
            r41 = r5
            java.lang.Class r5 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_EMPTY_SET
            if (r0 == r5) goto L3c7
            java.lang.Class r5 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_EMPTY_LIST
            if (r0 == r5) goto L3c7
            java.lang.Class r5 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_SINGLETON
            if (r0 == r5) goto L3c7
            java.lang.Class r5 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_SINGLETON_LIST
            if (r0 == r5) goto L3c7
            java.lang.Class r5 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_ARRAYS_LIST
            if (r0 == r5) goto L3c7
            java.lang.Class r5 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_COLLECTION
            if (r0 == r5) goto L3c7
            java.lang.Class r5 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_LIST
            if (r0 == r5) goto L3c7
            java.lang.Class r5 = com.alibaba.fastjson2.reader.ObjectReaderImplList.CLASS_UNMODIFIABLE_SET
            if (r0 != r5) goto L3ce
        L3c7:
            r4 = r45
            r5 = 0
            r14 = 0
            goto L6e6
        L3ce:
            java.lang.Class r5 = com.alibaba.fastjson2.util.TypeUtils.CLASS_SINGLE_SET
            if (r0 != r5) goto L3da
            r5 = 0
            r14 = 0
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r0, r5, r14)
            return r0
        L3da:
            r43 = r14
            r42 = r15
            if (r0 == r6) goto L3f0
            java.lang.Class<java.lang.Cloneable> r5 = java.lang.Cloneable.class
            if (r0 == r5) goto L3f0
            java.lang.Class<java.io.Closeable> r5 = java.io.Closeable.class
            if (r0 == r5) goto L3f0
            java.lang.Class<java.io.Serializable> r5 = java.io.Serializable.class
            if (r0 == r5) goto L3f0
            java.lang.Class<java.lang.Comparable> r5 = java.lang.Comparable.class
            if (r0 != r5) goto L3f4
        L3f0:
            r4 = r45
            goto L6e3
        L3f4:
            java.lang.Class<java.util.Map$Entry> r5 = java.util.Map.Entry.class
            if (r0 != r5) goto L3ff
            com.alibaba.fastjson2.reader.ObjectReaderImplMapEntry r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplMapEntry
            r14 = 0
            r0.<init>(r14, r14)
            return r0
        L3ff:
            r14 = 0
            if (r19 == 0) goto L459
            r15 = r0
            java.lang.Class r15 = (java.lang.Class) r15
            boolean r18 = r7.isAssignableFrom(r15)
            if (r18 == 0) goto L412
            r10 = 0
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.of(r14, r15, r10)
            return r0
        L412:
            r19 = r10
            r44 = r11
            r10 = 0
            boolean r14 = r4.isAssignableFrom(r15)
            if (r14 == 0) goto L423
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r15, r15, r10)
            return r0
        L423:
            boolean r10 = r15.isArray()
            if (r10 == 0) goto L438
            java.lang.Class r0 = r15.getComponentType()
            if (r0 != r6) goto L432
            com.alibaba.fastjson2.reader.ObjectArrayReader r0 = com.alibaba.fastjson2.reader.ObjectArrayReader.INSTANCE
            return r0
        L432:
            com.alibaba.fastjson2.reader.ObjectArrayTypedReader r0 = new com.alibaba.fastjson2.reader.ObjectArrayTypedReader
            r0.<init>(r15)
            return r0
        L438:
            com.alibaba.fastjson2.reader.ObjectReaderProvider r6 = com.alibaba.fastjson2.JSONFactory.defaultObjectReaderProvider
            com.alibaba.fastjson2.reader.ObjectReaderCreator r6 = r6.creator
            java.lang.Class<java.lang.StackTraceElement> r10 = java.lang.StackTraceElement.class
            if (r15 != r10) goto L45d
            java.lang.Class[] r3 = new java.lang.Class[]{r2, r2, r2, r3}     // Catch: java.lang.Throwable -> L45d
            java.lang.reflect.Constructor r3 = r15.getConstructor(r3)     // Catch: java.lang.Throwable -> L45d
            java.lang.String r10 = "className"
            java.lang.String r11 = "methodName"
            java.lang.String r14 = "fileName"
            java.lang.String r15 = "lineNumber"
            java.lang.String[] r10 = new java.lang.String[]{r10, r11, r14, r15}     // Catch: java.lang.Throwable -> L45d
            com.alibaba.fastjson2.reader.ObjectReader r0 = r6.createObjectReaderNoneDefaultConstructor(r3, r10)     // Catch: java.lang.Throwable -> L45d
            return r0
        L459:
            r19 = r10
            r44 = r11
        L45d:
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L5f5
            r3 = r0
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r6 = r3.getRawType()
            java.lang.reflect.Type[] r3 = r3.getActualTypeArguments()
            int r10 = r3.length
            r11 = 2
            if (r10 != r11) goto L4ba
            r10 = r3[r16]
            r11 = r3[r17]
            java.lang.Class<java.util.HashMap> r14 = java.util.HashMap.class
            if (r6 == r7) goto L4b3
            if (r6 == r12) goto L4b3
            if (r6 != r14) goto L47d
            goto L4b3
        L47d:
            if (r6 == r13) goto L4ac
            if (r6 != r8) goto L482
            goto L4ac
        L482:
            r7 = r19
            if (r6 == r9) goto L4a5
            if (r6 != r7) goto L489
            goto L4a5
        L489:
            java.lang.Class<java.util.LinkedHashMap> r7 = java.util.LinkedHashMap.class
            if (r6 == r7) goto L49e
            r7 = r43
            if (r6 == r7) goto L49e
            java.lang.Class<java.util.EnumMap> r7 = java.util.EnumMap.class
            if (r6 != r7) goto L496
            goto L49e
        L496:
            if (r6 != r5) goto L4ba
            com.alibaba.fastjson2.reader.ObjectReaderImplMapEntry r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplMapEntry
            r0.<init>(r10, r11)
            return r0
        L49e:
            java.lang.Class r6 = (java.lang.Class) r6
            com.alibaba.fastjson2.reader.ObjectReader r0 = typedMap(r6, r6, r10, r11)
            return r0
        L4a5:
            java.lang.Class r6 = (java.lang.Class) r6
            com.alibaba.fastjson2.reader.ObjectReader r0 = typedMap(r6, r7, r10, r11)
            return r0
        L4ac:
            java.lang.Class r6 = (java.lang.Class) r6
            com.alibaba.fastjson2.reader.ObjectReader r0 = typedMap(r6, r8, r10, r11)
            return r0
        L4b3:
            java.lang.Class r6 = (java.lang.Class) r6
            com.alibaba.fastjson2.reader.ObjectReader r0 = typedMap(r6, r14, r10, r11)
            return r0
        L4ba:
            int r5 = r3.length
            r7 = r17
            if (r5 != r7) goto L556
            r3 = r3[r16]
            java.lang.Class r5 = com.alibaba.fastjson2.util.TypeUtils.getMapping(r3)
            r7 = r42
            if (r6 == r7) goto L5d3
            if (r6 == r4) goto L5d3
            if (r6 == r1) goto L5d3
            r1 = r44
            if (r6 == r1) goto L5d3
            r1 = r25
            if (r6 == r1) goto L5d3
            r1 = r26
            if (r6 == r1) goto L4dd
            java.lang.Class<java.util.Stack> r4 = java.util.Stack.class
            if (r6 != r4) goto L4e3
        L4dd:
            r4 = r45
            r7 = r22
            goto L5d9
        L4e3:
            r4 = r27
            if (r6 == r4) goto L5b1
            r1 = r28
            if (r6 == r1) goto L5b1
            r1 = r29
            if (r6 == r1) goto L5b1
            r1 = r30
            if (r6 != r1) goto L4f9
            r4 = r45
            r7 = r22
            goto L5b7
        L4f9:
            r4 = r31
            if (r6 == r4) goto L505
            r1 = r32
            if (r6 == r1) goto L505
            r1 = r33
            if (r6 != r1) goto L50d
        L505:
            r4 = r45
            r7 = r22
            r1 = r39
            goto L595
        L50d:
            r1 = r34
            if (r6 == r1) goto L515
            r1 = r35
            if (r6 != r1) goto L51c
        L515:
            r4 = r45
            r7 = r22
            r1 = r40
            goto L579
        L51c:
            r1 = r36
            if (r6 == r1) goto L534
            r1 = r37
            if (r6 == r1) goto L534
            r1 = r38
            if (r6 == r1) goto L534
            r1 = r39
            if (r6 == r1) goto L534
            r1 = r40
            if (r6 == r1) goto L534
            r1 = r41
            if (r6 != r1) goto L537
        L534:
            r4 = r45
            goto L55b
        L537:
            r1 = r24
            if (r6 != r1) goto L541
            r14 = 0
            com.alibaba.fastjson2.reader.ObjectReaderImplOptional r0 = com.alibaba.fastjson2.reader.ObjectReaderImplOptional.of(r0, r14, r14)
            return r0
        L541:
            r0 = r23
            if (r6 != r0) goto L54b
            com.alibaba.fastjson2.reader.ObjectReaderImplAtomicReference r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplAtomicReference
            r0.<init>(r3)
            return r0
        L54b:
            boolean r0 = r3 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L556
            r4 = r45
            com.alibaba.fastjson2.reader.ObjectReader r0 = r4.getObjectReaderModule(r6)
            return r0
        L556:
            r4 = r45
        L558:
            r5 = 0
            goto L69e
        L55b:
            if (r3 != r2) goto L565
            com.alibaba.fastjson2.reader.ObjectReaderImplListStr r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplListStr
            java.lang.Class r6 = (java.lang.Class) r6
            r0.<init>(r6, r6)
            return r0
        L565:
            r7 = r22
            if (r5 != r7) goto L571
            com.alibaba.fastjson2.reader.ObjectReaderImplListInt64 r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplListInt64
            java.lang.Class r6 = (java.lang.Class) r6
            r0.<init>(r6, r6)
            return r0
        L571:
            r5 = 0
            r14 = 0
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r0, r5, r14)
            return r0
        L579:
            if (r3 != r2) goto L583
            com.alibaba.fastjson2.reader.ObjectReaderImplListStr r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplListStr
            java.lang.Class r6 = (java.lang.Class) r6
            r0.<init>(r6, r1)
            return r0
        L583:
            if (r5 != r7) goto L58d
            com.alibaba.fastjson2.reader.ObjectReaderImplListInt64 r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplListInt64
            java.lang.Class r6 = (java.lang.Class) r6
            r0.<init>(r6, r1)
            return r0
        L58d:
            r5 = 0
            r14 = 0
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r0, r5, r14)
            return r0
        L595:
            if (r5 != r2) goto L59f
            com.alibaba.fastjson2.reader.ObjectReaderImplListStr r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplListStr
            java.lang.Class r6 = (java.lang.Class) r6
            r0.<init>(r6, r1)
            return r0
        L59f:
            if (r5 != r7) goto L5a9
            com.alibaba.fastjson2.reader.ObjectReaderImplListInt64 r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplListInt64
            java.lang.Class r6 = (java.lang.Class) r6
            r0.<init>(r6, r1)
            return r0
        L5a9:
            r5 = 0
            r14 = 0
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r0, r5, r14)
            return r0
        L5b1:
            r4 = r45
            r7 = r22
            r1 = r30
        L5b7:
            if (r5 != r2) goto L5c1
            com.alibaba.fastjson2.reader.ObjectReaderImplListStr r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplListStr
            java.lang.Class r6 = (java.lang.Class) r6
            r0.<init>(r6, r1)
            return r0
        L5c1:
            if (r5 != r7) goto L5cb
            com.alibaba.fastjson2.reader.ObjectReaderImplListInt64 r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplListInt64
            java.lang.Class r6 = (java.lang.Class) r6
            r0.<init>(r6, r1)
            return r0
        L5cb:
            r5 = 0
            r14 = 0
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r0, r5, r14)
            return r0
        L5d3:
            r4 = r45
            r7 = r22
            r1 = r26
        L5d9:
            if (r5 != r2) goto L5e3
            com.alibaba.fastjson2.reader.ObjectReaderImplListStr r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplListStr
            java.lang.Class r6 = (java.lang.Class) r6
            r0.<init>(r6, r1)
            return r0
        L5e3:
            if (r5 != r7) goto L5ed
            com.alibaba.fastjson2.reader.ObjectReaderImplListInt64 r0 = new com.alibaba.fastjson2.reader.ObjectReaderImplListInt64
            java.lang.Class r6 = (java.lang.Class) r6
            r0.<init>(r6, r1)
            return r0
        L5ed:
            r5 = 0
            r14 = 0
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r0, r5, r14)
            return r0
        L5f5:
            r4 = r45
            r11 = 2
            boolean r1 = r0 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L604
            com.alibaba.fastjson2.reader.ObjectReaderImplGenericArray r1 = new com.alibaba.fastjson2.reader.ObjectReaderImplGenericArray
            java.lang.reflect.GenericArrayType r0 = (java.lang.reflect.GenericArrayType) r0
            r1.<init>(r0)
            return r1
        L604:
            boolean r1 = r0 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L61a
            r1 = r0
            java.lang.reflect.WildcardType r1 = (java.lang.reflect.WildcardType) r1
            java.lang.reflect.Type[] r1 = r1.getUpperBounds()
            int r3 = r1.length
            r7 = 1
            if (r3 != r7) goto L61b
            r0 = r1[r16]
            com.alibaba.fastjson2.reader.ObjectReader r0 = r4.getObjectReader(r0)
            return r0
        L61a:
            r7 = 1
        L61b:
            java.lang.Class<java.lang.reflect.ParameterizedType> r1 = java.lang.reflect.ParameterizedType.class
            if (r0 != r1) goto L626
            java.lang.Class<com.alibaba.fastjson2.util.ParameterizedTypeImpl> r0 = com.alibaba.fastjson2.util.ParameterizedTypeImpl.class
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaders.ofReflect(r0)
            return r0
        L626:
            int r1 = r21.hashCode()
            r3 = -1
            switch(r1) {
                case -1410806254: goto L68c;
                case -720123389: goto L681;
                case 1087757882: goto L674;
                case 1088242009: goto L667;
                case 1252880906: goto L65a;
                case 1539653772: goto L64d;
                case 1585284048: goto L640;
                case 1829465637: goto L631;
                default: goto L62e;
            }
        L62e:
            r7 = r3
            goto L699
        L631:
            java.lang.String r1 = "java.util.RegularEnumSet"
            r15 = r21
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L63c
            goto L62e
        L63c:
            r7 = r20
            goto L699
        L640:
            r15 = r21
            java.lang.String r1 = "java.net.InetSocketAddress"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L64b
            goto L62e
        L64b:
            r7 = 6
            goto L699
        L64d:
            r15 = r21
            java.lang.String r1 = "java.text.SimpleDateFormat"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L658
            goto L62e
        L658:
            r7 = 5
            goto L699
        L65a:
            r15 = r21
            java.lang.String r1 = "java.sql.Timestamp"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L665
            goto L62e
        L665:
            r7 = 4
            goto L699
        L667:
            r15 = r21
            java.lang.String r1 = "java.sql.Time"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L672
            goto L62e
        L672:
            r7 = 3
            goto L699
        L674:
            r15 = r21
            java.lang.String r1 = "java.sql.Date"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L67f
            goto L62e
        L67f:
            r7 = r11
            goto L699
        L681:
            r15 = r21
            java.lang.String r1 = "java.net.InetAddress"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L699
            goto L62e
        L68c:
            r15 = r21
            java.lang.String r1 = "java.util.JumboEnumSet"
            boolean r1 = r15.equals(r1)
            if (r1 != 0) goto L697
            goto L62e
        L697:
            r7 = r16
        L699:
            switch(r7) {
                case 0: goto L6d8;
                case 1: goto L6ca;
                case 2: goto L6c3;
                case 3: goto L6bc;
                case 4: goto L6b5;
                case 5: goto L6a7;
                case 6: goto L69f;
                case 7: goto L6d8;
                default: goto L69c;
            }
        L69c:
            goto L558
        L69e:
            return r5
        L69f:
            com.alibaba.fastjson2.reader.ObjectReaderMisc r1 = new com.alibaba.fastjson2.reader.ObjectReaderMisc
            java.lang.Class r0 = (java.lang.Class) r0
            r1.<init>(r0)
            return r1
        L6a7:
            java.lang.Class r0 = (java.lang.Class) r0
            com.alibaba.fastjson2.reader.f r1 = new com.alibaba.fastjson2.reader.f
            r3 = 29
            r1.<init>(r3)
            com.alibaba.fastjson2.reader.ObjectReaderImplValue r0 = com.alibaba.fastjson2.reader.ObjectReaderImplValue.of(r0, r2, r1)
            return r0
        L6b5:
            r5 = 0
            com.alibaba.fastjson2.util.JdbcSupport$TimestampReader r0 = new com.alibaba.fastjson2.util.JdbcSupport$TimestampReader
            r0.<init>(r5, r5)
            return r0
        L6bc:
            r5 = 0
            com.alibaba.fastjson2.util.JdbcSupport$TimeReader r0 = new com.alibaba.fastjson2.util.JdbcSupport$TimeReader
            r0.<init>(r5, r5)
            return r0
        L6c3:
            r5 = 0
            com.alibaba.fastjson2.util.JdbcSupport$DateReader r0 = new com.alibaba.fastjson2.util.JdbcSupport$DateReader
            r0.<init>(r5, r5)
            return r0
        L6ca:
            java.lang.Class r0 = (java.lang.Class) r0
            com.alibaba.fastjson2.reader.f r1 = new com.alibaba.fastjson2.reader.f
            r3 = 28
            r1.<init>(r3)
            com.alibaba.fastjson2.reader.ObjectReaderImplValue r0 = com.alibaba.fastjson2.reader.ObjectReaderImplValue.of(r0, r2, r1)
            return r0
        L6d8:
            java.lang.Class r1 = com.alibaba.fastjson2.util.TypeUtils.getClass(r0)
            r14 = 0
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r0, r1, r14)
            return r0
        L6e3:
            com.alibaba.fastjson2.reader.ObjectReaderImplObject r0 = com.alibaba.fastjson2.reader.ObjectReaderImplObject.INSTANCE
            return r0
        L6e6:
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r0, r5, r14)
            return r0
        L6eb:
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r0, r5, r14)
            return r0
        L6f0:
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r0, r5, r14)
            return r0
        L6f5:
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r0, r5, r14)
            return r0
        L6fa:
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r0, r5, r14)
            return r0
        L6ff:
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplList.of(r0, r5, r14)
            return r0
        L704:
            r6 = r0
            java.lang.Class r6 = (java.lang.Class) r6     // Catch: java.lang.NoSuchMethodException -> L71f
            com.alibaba.fastjson2.reader.ObjectReaderImplValue r5 = new com.alibaba.fastjson2.reader.ObjectReaderImplValue     // Catch: java.lang.NoSuchMethodException -> L71f
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.Class[] r0 = new java.lang.Class[]{r2}     // Catch: java.lang.NoSuchMethodException -> L71f
            java.lang.reflect.Constructor r13 = r6.getConstructor(r0)     // Catch: java.lang.NoSuchMethodException -> L71f
            r14 = 0
            r15 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r5.<init>(r6, r7, r8, r9, r11, r12, r13, r14, r15)     // Catch: java.lang.NoSuchMethodException -> L71f
            return r5
        L71f:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L726:
            java.lang.Class r0 = (java.lang.Class) r0
            r5 = 0
            com.alibaba.fastjson2.reader.ObjectReader r0 = typedMap(r0, r7, r5, r6)
            return r0
        L72e:
            java.lang.Class r0 = (java.lang.Class) r0
            com.alibaba.fastjson2.reader.ObjectReader r0 = typedMap(r0, r7, r5, r6)
            return r0
        L735:
            java.lang.Class r0 = (java.lang.Class) r0
            com.alibaba.fastjson2.reader.ObjectReader r0 = typedMap(r0, r8, r5, r6)
            return r0
        L73c:
            java.lang.Class r0 = (java.lang.Class) r0
            r14 = 0
            com.alibaba.fastjson2.reader.ObjectReader r0 = com.alibaba.fastjson2.reader.ObjectReaderImplMap.of(r5, r0, r14)
            return r0
        L745:
            com.alibaba.fastjson2.reader.ObjectReaderImplDouble r0 = com.alibaba.fastjson2.reader.ObjectReaderImplDouble.INSTANCE
            return r0
        L748:
            com.alibaba.fastjson2.reader.ObjectReaderImplFloat r0 = com.alibaba.fastjson2.reader.ObjectReaderImplFloat.INSTANCE
            return r0
        L74b:
            com.alibaba.fastjson2.reader.ObjectReaderImplInt64 r0 = com.alibaba.fastjson2.reader.ObjectReaderImplInt64.INSTANCE
            return r0
        L74e:
            com.alibaba.fastjson2.reader.ObjectReaderImplInteger r0 = com.alibaba.fastjson2.reader.ObjectReaderImplInteger.INSTANCE
            return r0
        L751:
            com.alibaba.fastjson2.reader.ObjectReaderImplShort r0 = com.alibaba.fastjson2.reader.ObjectReaderImplShort.INSTANCE
            return r0
        L754:
            com.alibaba.fastjson2.reader.ObjectReaderImplByte r0 = com.alibaba.fastjson2.reader.ObjectReaderImplByte.INSTANCE
            return r0
        L757:
            com.alibaba.fastjson2.reader.ObjectReaderImplBoolean r0 = com.alibaba.fastjson2.reader.ObjectReaderImplBoolean.INSTANCE
            return r0
        L75a:
            com.alibaba.fastjson2.reader.ObjectReaderImplCharacter r0 = com.alibaba.fastjson2.reader.ObjectReaderImplCharacter.INSTANCE
            return r0
        L75d:
            com.alibaba.fastjson2.reader.ObjectReaderImplString r0 = com.alibaba.fastjson2.reader.ObjectReaderImplString.INSTANCE
            return r0
    }

    public java.util.function.Function getTypeConvert(java.lang.reflect.Type r2, java.lang.reflect.Type r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, java.util.Map<java.lang.reflect.Type, java.util.function.Function>> r0 = r1.typeConverts
            if (r0 != 0) goto La
            java.util.concurrent.ConcurrentMap r0 = buildInitTypeConverts()
            r1.typeConverts = r0
        La:
            java.lang.Object r2 = r0.get(r2)
            java.util.Map r2 = (java.util.Map) r2
            if (r2 != 0) goto L14
            r2 = 0
            return r2
        L14:
            java.lang.Object r2 = r2.get(r3)
            java.util.function.Function r2 = (java.util.function.Function) r2
            return r2
    }

    public void init() {
            r0 = this;
            return
    }

    public void mixIn(java.lang.Class r2, java.lang.Class r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Class, java.lang.Class> r0 = r1.mixInCache
            if (r3 != 0) goto L8
            r0.remove(r2)
            goto Lb
        L8:
            r0.put(r2, r3)
        Lb:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r3 = r1.cache
            r3.remove(r2)
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r3 = r1.cacheFieldBased
            r3.remove(r2)
            return
    }

    public com.alibaba.fastjson2.reader.ObjectReader register(java.lang.reflect.Type r2, com.alibaba.fastjson2.reader.ObjectReader r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r0 = r1.cache
            if (r3 != 0) goto Lb
            java.lang.Object r2 = r0.remove(r2)
            com.alibaba.fastjson2.reader.ObjectReader r2 = (com.alibaba.fastjson2.reader.ObjectReader) r2
            return r2
        Lb:
            java.lang.Object r2 = r0.put(r2, r3)
            com.alibaba.fastjson2.reader.ObjectReader r2 = (com.alibaba.fastjson2.reader.ObjectReader) r2
            return r2
    }

    public com.alibaba.fastjson2.reader.ObjectReader registerIfAbsent(java.lang.reflect.Type r3, com.alibaba.fastjson2.reader.ObjectReader r4) {
            r2 = this;
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r0 = r2.cache
            boolean r0 = r0.containsKey(r3)
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r1 = r2.cache
            if (r0 == 0) goto L11
            java.lang.Object r3 = r1.get(r3)
            com.alibaba.fastjson2.reader.ObjectReader r3 = (com.alibaba.fastjson2.reader.ObjectReader) r3
            return r3
        L11:
            java.lang.Object r3 = r1.put(r3, r4)
            com.alibaba.fastjson2.reader.ObjectReader r3 = (com.alibaba.fastjson2.reader.ObjectReader) r3
            return r3
    }

    public void registerIfAbsent(long r2, com.alibaba.fastjson2.reader.ObjectReader r4) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.Long, com.alibaba.fastjson2.reader.ObjectReader> r0 = r1.hashCache
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r0.put(r2, r4)
            return
    }

    public void registerSeeAlsoSubType(java.lang.Class r2) {
            r1 = this;
            r0 = 0
            r1.registerSeeAlsoSubType(r2, r0)
            return
    }

    public void registerSeeAlsoSubType(java.lang.Class r4, java.lang.String r5) {
            r3 = this;
            java.lang.Class r0 = r4.getSuperclass()
            if (r0 == 0) goto L2a
            com.alibaba.fastjson2.reader.ObjectReader r1 = r3.getObjectReader(r0)
            boolean r2 = r1 instanceof com.alibaba.fastjson2.reader.ObjectReaderSeeAlso
            if (r2 == 0) goto L29
            com.alibaba.fastjson2.reader.ObjectReaderSeeAlso r1 = (com.alibaba.fastjson2.reader.ObjectReaderSeeAlso) r1
            com.alibaba.fastjson2.reader.ObjectReaderSeeAlso r5 = r1.addSubType(r4, r5)
            if (r5 == r1) goto L29
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r1 = r3.cache
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L24
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r4 = r3.cache
            r4.put(r0, r5)
            return
        L24:
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r0 = r3.cacheFieldBased
            r0.put(r4, r5)
        L29:
            return
        L2a:
            java.lang.String r4 = "superclass is null"
            ah.a.w(r4)
            return
    }

    public void setAutoTypeBeforeHandler(com.alibaba.fastjson2.JSONReader.AutoTypeBeforeHandler r1) {
            r0 = this;
            r0.autoTypeBeforeHandler = r1
            return
    }

    public void setAutoTypeHandler(java.util.function.Consumer<java.lang.Class> r1) {
            r0 = this;
            r0.autoTypeHandler = r1
            return
    }

    public com.alibaba.fastjson2.reader.ObjectReader unregisterObjectReader(java.lang.reflect.Type r2) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r0 = r1.cache
            java.lang.Object r2 = r0.remove(r2)
            com.alibaba.fastjson2.reader.ObjectReader r2 = (com.alibaba.fastjson2.reader.ObjectReader) r2
            return r2
    }

    public boolean unregisterObjectReader(java.lang.reflect.Type r2, com.alibaba.fastjson2.reader.ObjectReader r3) {
            r1 = this;
            java.util.concurrent.ConcurrentMap<java.lang.reflect.Type, com.alibaba.fastjson2.reader.ObjectReader> r0 = r1.cache
            boolean r2 = r0.remove(r2, r3)
            return r2
    }
}
