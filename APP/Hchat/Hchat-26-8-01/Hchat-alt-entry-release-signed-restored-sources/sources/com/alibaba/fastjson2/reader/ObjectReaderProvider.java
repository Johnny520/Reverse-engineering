package com.alibaba.fastjson2.reader;

import be.C0305w;
import com.alibaba.fastjson2.JSONArray;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONReader;
import com.alibaba.fastjson2.PropertyNamingStrategy;
import com.alibaba.fastjson2.annotation.JSONBuilder;
import com.alibaba.fastjson2.annotation.JSONCreator;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.function.impl.StringToAny;
import com.alibaba.fastjson2.function.impl.ToAny;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.util.Fnv;
import com.alibaba.fastjson2.util.JdbcSupport;
import com.alibaba.fastjson2.util.MapMultiValueType;
import com.alibaba.fastjson2.util.MultiType;
import com.alibaba.fastjson2.util.ParameterizedTypeImpl;
import com.alibaba.fastjson2.util.TypeUtils;
import java.io.Closeable;
import java.io.File;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Currency;
import java.util.Date;
import java.util.Deque;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.Stack;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.regex.Pattern;
import javax.sql.DataSource;
import javax.sql.RowSet;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p025bc.AbstractC0255e;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class ObjectReaderProvider {
    static ObjectReaderCachePair readerCache;
    private long[] acceptHashCodes;
    private JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler;
    private Consumer<Class> autoTypeHandler;
    final LRUAutoTypeCache autoTypeList;
    final ConcurrentMap<Type, ObjectReader> cache = new ConcurrentHashMap();
    final ConcurrentMap<Type, ObjectReader> cacheFieldBased = new ConcurrentHashMap();
    public final ObjectReaderCreator creator;
    private long[] denyHashCodes;
    final ConcurrentMap<Long, ObjectReader> hashCache;
    final ConcurrentMap<Class, Class> mixInCache;
    private ConcurrentMap<Type, Map<Type, Function>> typeConverts;

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class LRUAutoTypeCache extends LinkedHashMap<String, Date> {
        private final int maxSize;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public LRUAutoTypeCache(int i9) {
            super(16, 0.75f, false);
            this.maxSize = i9;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.LinkedHashMap
        public boolean removeEldestEntry(Map.Entry<String, Date> entry) {
            return size() > this.maxSize;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
    public static final class ObjectReaderCachePair {
        final long hashCode;
        volatile int missCount;
        final ObjectReader reader;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public ObjectReaderCachePair(long j3, ObjectReader objectReader) {
            this.hashCode = j3;
            this.reader = objectReader;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReaderProvider() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.hashCache = concurrentHashMap;
        this.mixInCache = new ConcurrentHashMap();
        this.autoTypeList = new LRUAutoTypeCache(1024);
        this.denyHashCodes = new long[]{-9164606388214699518L, -8754006975464705441L, -8720046426850100497L, -8649961213709896794L, -8614556368991373401L, -8382625455832334425L, -8165637398350707645L, -8109300701639721088L, -7966123100503199569L, -7921218830998286408L, -7775351613326101303L, -7768608037458185275L, -7766605818834748097L, -6835437086156813536L, -6316154655839304624L, -6179589609550493385L, -6149130139291498841L, -6149093380703242441L, -6088208984980396913L, -6025144546313590215L, -5939269048541779808L, -5885964883385605994L, -5767141746063564198L, -5764804792063216819L, -5472097725414717105L, -5194641081268104286L, -5076846148177416215L, -4837536971810737970L, -4836620931940850535L, -4733542790109620528L, -4703320437989596122L, -4608341446948126581L, -4537258998789938600L, -4438775680185074100L, -4314457471973557243L, -4150995715611818742L, -4082057040235125754L, -3975378478825053783L, -3967588558552655563L, -3935185854875733362L, -3319207949486691020L, -3077205613010077203L, -3053747177772160511L, -2995060141064716555L, -2825378362173150292L, -2533039401923731906L, -2439930098895578154L, -2378990704010641148L, -2364987994247679115L, -2262244760619952081L, -2192804397019347313L, -2095516571388852610L, -1872417015366588117L, -1650485814983027158L, -1589194880214235129L, -965955008570215305L, -905177026366752536L, -831789045734283466L, -803541446955902575L, -731978084025273882L, -666475508176557463L, -582813228520337988L, -254670111376247151L, -219577392946377768L, -190281065685395680L, -26639035867733124L, -9822483067882491L, 4750336058574309L, 33238344207745342L, 156405680656087946L, 218512992947536312L, 313864100207897507L, 386461436234701831L, 744602970950881621L, 823641066473609950L, 1073634739308289776L, 1153291637701043748L, 1203232727967308606L, 1214780596910349029L, 1268707909007641340L, 1459860845934817624L, 1502845958873959152L, 1534439610567445754L, 1698504441317515818L, 1818089308493370394L, 2078113382421334967L, 2164696723069287854L, 2622551729063269307L, 2653453629929770569L, 2660670623866180977L, 2731823439467737506L, 2836431254737891113L, 2930861374593775110L, 3058452313624178956L, 3085473968517218653L, 3089451460101527857L, 3114862868117605599L, 3129395579983849527L, 3256258368248066264L, 3452379460455804429L, 3547627781654598988L, 3637939656440441093L, 3688179072722109200L, 3718352661124136681L, 3730752432285826863L, 3740226159580918099L, 3794316665763266033L, 3977090344859527316L, 4000049462512838776L, 4046190361520671643L, 4147696707147271408L, 4193204392725694463L, 4215053018660518963L, 4241163808635564644L, 4254584350247334433L, 4814658433570175913L, 4841947709850912914L, 4904007817188630457L, 5100336081510080343L, 5120543992130540564L, 5274044858141538265L, 5347909877633654828L, 5450448828334921485L, 5474268165959054640L, 5545425291794704408L, 5596129856135573697L, 5688200883751798389L, 5751393439502795295L, 5916409771425455946L, 5944107969236155580L, 6007332606592876737L, 6090377589998869205L, 6280357960959217660L, 6456855723474196908L, 6511035576063254270L, 6534946468240507089L, 6584624952928234050L, 6734240326434096246L, 6742705432718011780L, 6800727078373023163L, 6854854816081053523L, 7045245923763966215L, 7123326897294507060L, 7164889056054194741L, 7179336928365889465L, 7240293012336844478L, 7347653049056829645L, 7375862386996623731L, 7442624256860549330L, 7617522210483516279L, 7658177784286215602L, 8055461369741094911L, 8064026652676081192L, 8389032537095247355L, 8488266005336625107L, 8537233257283452655L, 8735538376409180149L, 8838294710098435315L, 8861402923078831179L, 9140390920032557669L, 9140416208800006522L, 9144212112462101475L};
        this.acceptHashCodes = new long[]{-6293031534589903644L};
        concurrentHashMap.put(Long.valueOf(ObjectArrayReader.TYPE_HASH_CODE), ObjectArrayReader.INSTANCE);
        concurrentHashMap.put(-4834614249632438472L, ObjectReaderImplString.INSTANCE);
        concurrentHashMap.put(77L, ObjectReaderImplMap.INSTANCE);
        this.creator = ObjectReaderCreator.INSTANCE;
        init();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ConcurrentMap<Type, Map<Type, Function>> buildInitTypeConverts() {
        int i9;
        Class cls;
        Class cls2;
        Class<BigDecimal> cls3;
        Class cls4;
        Class<Short> cls5;
        Class cls6;
        Class<Integer> cls7;
        Double dValueOf = Double.valueOf(0.0d);
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        C0633l c0633l = new C0633l(8);
        Class cls8 = Character.TYPE;
        registerTypeConvert(concurrentHashMap, Character.class, cls8, c0633l);
        Class[] clsArr = {Boolean.class, Byte.class, Short.class, Integer.class, Long.class, Number.class, Float.class, Double.class, BigInteger.class, BigDecimal.class, AtomicInteger.class, AtomicLong.class};
        ToAny toAny = new ToAny(Boolean.class, null);
        int i10 = 0;
        while (true) {
            if (i10 >= 12) {
                break;
            }
            registerTypeConvert(concurrentHashMap, clsArr[i10], Boolean.class, toAny);
            i10++;
        }
        ToAny toAny2 = new ToAny(Boolean.class, Boolean.FALSE);
        int i11 = 0;
        while (true) {
            cls = Boolean.TYPE;
            if (i11 >= 12) {
                break;
            }
            registerTypeConvert(concurrentHashMap, clsArr[i11], cls, toAny2);
            i11++;
        }
        ToAny toAny3 = new ToAny(String.class);
        for (int i12 = 0; i12 < 12; i12++) {
            registerTypeConvert(concurrentHashMap, clsArr[i12], String.class, toAny3);
        }
        Class<BigDecimal> cls9 = BigDecimal.class;
        ToAny toAny4 = new ToAny(cls9);
        int i13 = 0;
        for (i9 = 12; i13 < i9; i9 = 12) {
            registerTypeConvert(concurrentHashMap, clsArr[i13], cls9, toAny4);
            i13++;
        }
        ToAny toAny5 = new ToAny(BigInteger.class);
        for (int i14 = 0; i14 < 12; i14++) {
            registerTypeConvert(concurrentHashMap, clsArr[i14], BigInteger.class, toAny5);
        }
        ToAny toAny6 = new ToAny(Byte.class);
        for (int i15 = 0; i15 < 12; i15++) {
            registerTypeConvert(concurrentHashMap, clsArr[i15], Byte.class, toAny6);
        }
        ToAny toAny7 = new ToAny(Byte.class, (byte) 0);
        int i16 = 0;
        while (true) {
            cls2 = Byte.TYPE;
            cls3 = cls9;
            if (i16 >= 12) {
                break;
            }
            registerTypeConvert(concurrentHashMap, clsArr[i16], cls2, toAny7);
            i16++;
            cls9 = cls3;
        }
        Class<Short> cls10 = Short.class;
        ToAny toAny8 = new ToAny(cls10);
        for (int i17 = 0; i17 < 12; i17++) {
            registerTypeConvert(concurrentHashMap, clsArr[i17], cls10, toAny8);
        }
        ToAny toAny9 = new ToAny(cls10, (short) 0);
        int i18 = 0;
        while (true) {
            cls4 = Short.TYPE;
            cls5 = cls10;
            if (i18 >= 12) {
                break;
            }
            registerTypeConvert(concurrentHashMap, clsArr[i18], cls4, toAny9);
            i18++;
            cls10 = cls5;
        }
        Class<Integer> cls11 = Integer.class;
        ToAny toAny10 = new ToAny(cls11);
        for (int i19 = 0; i19 < 12; i19++) {
            registerTypeConvert(concurrentHashMap, clsArr[i19], cls11, toAny10);
        }
        ToAny toAny11 = new ToAny(cls11, 0);
        int i20 = 0;
        while (true) {
            cls6 = Integer.TYPE;
            cls7 = cls11;
            if (i20 >= 12) {
                break;
            }
            registerTypeConvert(concurrentHashMap, clsArr[i20], cls6, toAny11);
            i20++;
            cls11 = cls7;
        }
        ToAny toAny12 = new ToAny(Long.class);
        for (int i21 = 0; i21 < 12; i21++) {
            registerTypeConvert(concurrentHashMap, clsArr[i21], Long.class, toAny12);
        }
        ToAny toAny13 = new ToAny(Long.class, 0L);
        for (int i22 = 0; i22 < 12; i22++) {
            registerTypeConvert(concurrentHashMap, clsArr[i22], Long.TYPE, toAny13);
        }
        ToAny toAny14 = new ToAny(Float.class);
        for (int i23 = 0; i23 < 12; i23++) {
            registerTypeConvert(concurrentHashMap, clsArr[i23], Float.class, toAny14);
        }
        ToAny toAny15 = new ToAny(Float.class, Float.valueOf(0.0f));
        for (int i24 = 0; i24 < 12; i24++) {
            registerTypeConvert(concurrentHashMap, clsArr[i24], Float.TYPE, toAny15);
        }
        ToAny toAny16 = new ToAny(Double.class);
        for (int i25 = 0; i25 < 12; i25++) {
            registerTypeConvert(concurrentHashMap, clsArr[i25], Double.class, toAny16);
        }
        ToAny toAny17 = new ToAny(Double.class, dValueOf);
        for (int i26 = 0; i26 < 12; i26++) {
            registerTypeConvert(concurrentHashMap, clsArr[i26], Double.TYPE, toAny17);
        }
        ToAny toAny18 = new ToAny(Number.class, dValueOf);
        for (int i27 = 0; i27 < 12; i27++) {
            registerTypeConvert(concurrentHashMap, clsArr[i27], Number.class, toAny18);
        }
        registerTypeConvert(concurrentHashMap, String.class, cls8, new StringToAny(cls8, '0'));
        registerTypeConvert(concurrentHashMap, String.class, cls, new StringToAny(cls, Boolean.FALSE));
        Float fValueOf = Float.valueOf(0.0f);
        Class cls12 = Float.TYPE;
        registerTypeConvert(concurrentHashMap, String.class, cls12, new StringToAny(cls12, fValueOf));
        Class cls13 = Double.TYPE;
        registerTypeConvert(concurrentHashMap, String.class, cls13, new StringToAny(cls13, dValueOf));
        registerTypeConvert(concurrentHashMap, String.class, cls2, new StringToAny(cls2, (byte) 0));
        registerTypeConvert(concurrentHashMap, String.class, cls4, new StringToAny(cls4, (short) 0));
        registerTypeConvert(concurrentHashMap, String.class, cls6, new StringToAny(cls6, 0));
        Class cls14 = Long.TYPE;
        registerTypeConvert(concurrentHashMap, String.class, cls14, new StringToAny(cls14, 0L));
        registerTypeConvert(concurrentHashMap, String.class, Character.class, new StringToAny(Character.class, null));
        registerTypeConvert(concurrentHashMap, String.class, Boolean.class, new StringToAny(Boolean.class, null));
        registerTypeConvert(concurrentHashMap, String.class, Double.class, new StringToAny(Double.class, null));
        registerTypeConvert(concurrentHashMap, String.class, Float.class, new StringToAny(Float.class, null));
        registerTypeConvert(concurrentHashMap, String.class, Byte.class, new StringToAny(Byte.class, null));
        registerTypeConvert(concurrentHashMap, String.class, cls5, new StringToAny(cls5, null));
        registerTypeConvert(concurrentHashMap, String.class, cls7, new StringToAny(cls7, null));
        registerTypeConvert(concurrentHashMap, String.class, Long.class, new StringToAny(Long.class, null));
        registerTypeConvert(concurrentHashMap, String.class, cls3, new StringToAny(cls3, null));
        registerTypeConvert(concurrentHashMap, String.class, BigInteger.class, new StringToAny(BigInteger.class, null));
        registerTypeConvert(concurrentHashMap, String.class, Number.class, new StringToAny(cls3, null));
        registerTypeConvert(concurrentHashMap, String.class, Collection.class, new StringToAny(Collection.class, null));
        registerTypeConvert(concurrentHashMap, String.class, List.class, new StringToAny(List.class, null));
        registerTypeConvert(concurrentHashMap, String.class, JSONArray.class, new StringToAny(JSONArray.class, null));
        registerTypeConvert(concurrentHashMap, Boolean.class, cls, new C0633l(9));
        registerTypeConvert(concurrentHashMap, String.class, UUID.class, new C0633l(10));
        return concurrentHashMap;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void getBeanInfo1xJSONPOJOBuilder(BeanInfo beanInfo, Class<?> cls, Annotation annotation, Class<? extends Annotation> cls2) {
        BeanUtils.annotationMethods(cls2, new C0632k(annotation, beanInfo, cls, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void getCreator(BeanInfo beanInfo, Class<?> cls, Method method) {
        if (method.getDeclaringClass() == Enum.class) {
            return;
        }
        String name = method.getName();
        if (cls.isEnum() && name.equals("values")) {
            return;
        }
        Annotation[] declaredAnnotations = method.getDeclaredAnnotations();
        int length = declaredAnnotations.length;
        Method declaredMethod = null;
        int i9 = 0;
        JSONCreator jSONCreator = null;
        boolean z9 = false;
        while (i9 < length) {
            Annotation annotation = declaredAnnotations[i9];
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            JSONCreator jSONCreator2 = (JSONCreator) BeanUtils.findAnnotation(annotation, JSONCreator.class);
            if (jSONCreator2 != annotation && clsAnnotationType.getName().equals("com.alibaba.fastjson.annotation.JSONCreator")) {
                BeanUtils.annotationMethods(clsAnnotationType, new C0628g(annotation, beanInfo, 2));
                z9 = true;
            }
            i9++;
            jSONCreator = jSONCreator2;
        }
        if (jSONCreator != null) {
            String[] strArrParameterNames = jSONCreator.parameterNames();
            if (strArrParameterNames.length != 0) {
                beanInfo.createParameterNames = strArrParameterNames;
            }
            z9 = true;
        }
        if (z9) {
            try {
                declaredMethod = cls.getDeclaredMethod(name, method.getParameterTypes());
            } catch (NoSuchMethodException unused) {
            }
            if (declaredMethod != null) {
                beanInfo.createMethod = declaredMethod;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void getFieldInfo(FieldInfo fieldInfo, JSONField jSONField) {
        if (jSONField == null) {
            return;
        }
        String strName = jSONField.name();
        if (!strName.isEmpty()) {
            fieldInfo.fieldName = strName;
        }
        String str = jSONField.format();
        if (!str.isEmpty()) {
            String strTrim = str.trim();
            if (strTrim.indexOf(84) != -1 && !strTrim.contains("'T'")) {
                strTrim = strTrim.replaceAll("T", "'T'");
            }
            fieldInfo.format = strTrim;
        }
        String strLabel = jSONField.label();
        if (!strLabel.isEmpty()) {
            fieldInfo.label = strLabel.trim();
        }
        String strDefaultValue = jSONField.defaultValue();
        if (!strDefaultValue.isEmpty()) {
            fieldInfo.defaultValue = strDefaultValue;
        }
        String strLocale = jSONField.locale();
        if (!strLocale.isEmpty()) {
            String[] strArrSplit = strLocale.split("_");
            if (strArrSplit.length == 2) {
                fieldInfo.locale = new Locale(strArrSplit[0], strArrSplit[1]);
            }
        }
        String[] strArrAlternateNames = jSONField.alternateNames();
        if (strArrAlternateNames.length != 0) {
            if (fieldInfo.alternateNames == null) {
                fieldInfo.alternateNames = strArrAlternateNames;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                Collections.addAll(linkedHashSet, strArrAlternateNames);
                linkedHashSet.addAll(Arrays.asList(fieldInfo.alternateNames));
                fieldInfo.alternateNames = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
            }
        }
        if (!fieldInfo.ignore) {
            fieldInfo.ignore = !jSONField.deserialize();
        }
        for (JSONReader.Feature feature : jSONField.deserializeFeatures()) {
            fieldInfo.features |= feature.mask;
            if (fieldInfo.ignore && feature == JSONReader.Feature.FieldBased) {
                fieldInfo.ignore = false;
            }
        }
        int iOrdinal = jSONField.ordinal();
        if (iOrdinal != 0) {
            fieldInfo.ordinal = iOrdinal;
        }
        if (jSONField.value()) {
            fieldInfo.features |= FieldInfo.VALUE_MASK;
        }
        if (jSONField.unwrapped()) {
            fieldInfo.features |= FieldInfo.UNWRAPPED_MASK;
        }
        if (jSONField.required()) {
            fieldInfo.required = true;
        }
        Class<?> clsDeserializeUsing = jSONField.deserializeUsing();
        if (ObjectReader.class.isAssignableFrom(clsDeserializeUsing)) {
            fieldInfo.readUsing = clsDeserializeUsing;
        }
        String strTrim2 = jSONField.arrayToMapKey().trim();
        if (!strTrim2.isEmpty()) {
            fieldInfo.arrayToMapKey = strTrim2;
        }
        Class<?> clsArrayToMapDuplicateHandler = jSONField.arrayToMapDuplicateHandler();
        if (clsArrayToMapDuplicateHandler != Void.class) {
            fieldInfo.arrayToMapDuplicateHandler = clsArrayToMapDuplicateHandler;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private ObjectReader getPreviousObjectReader(boolean z9, Type type, ObjectReader objectReader) {
        return z9 ? this.cacheFieldBased.put(type, objectReader) : this.cache.put(type, objectReader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$buildInitTypeConverts$2(Object obj) {
        if (obj == null || "null".equals(obj) || HttpUrl.FRAGMENT_ENCODE_SET.equals(obj)) {
            return null;
        }
        return UUID.fromString((String) obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFieldReader$3(long j3, AtomicReference atomicReference, Field field) {
        if (j3 == Fnv.hashCode64LCase(field.getName())) {
            atomicReference.set(field);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$createFieldReader$4(long j3, AtomicReference atomicReference, Method method) {
        if (j3 == Fnv.hashCode64LCase(BeanUtils.setterName(method.getName(), PropertyNamingStrategy.CamelCase.name()))) {
            atomicReference.set(method);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getBeanInfo$5(BeanInfo beanInfo, Class cls, Method method) {
        getCreator(beanInfo, (Class<?>) cls, method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getBeanInfo$6(BeanInfo beanInfo, Class cls, Constructor constructor) {
        getCreator(beanInfo, (Class<?>) cls, constructor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getBeanInfo$7(BeanInfo beanInfo, Class cls, Method method) {
        getCreator(beanInfo, (Class<?>) cls, method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getBeanInfo$8(BeanInfo beanInfo, Class cls, Constructor constructor) {
        getCreator(beanInfo, (Class<?>) cls, constructor);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0165 A[Catch: all -> 0x01f5, TryCatch #0 {all -> 0x01f5, blocks: (B:3:0x0005, B:7:0x0017, B:9:0x001f, B:11:0x0024, B:12:0x002b, B:14:0x002e, B:16:0x003c, B:19:0x0046, B:18:0x0042, B:20:0x004d, B:22:0x0057, B:24:0x005f, B:26:0x0064, B:28:0x0067, B:74:0x0123, B:77:0x0129, B:79:0x012f, B:31:0x0071, B:33:0x0079, B:34:0x007b, B:36:0x007e, B:37:0x008a, B:39:0x0092, B:41:0x009a, B:43:0x009d, B:45:0x00a5, B:48:0x00ad, B:50:0x00b6, B:52:0x00c8, B:58:0x00ec, B:53:0x00cc, B:55:0x00d6, B:57:0x00ea, B:59:0x00ef, B:61:0x00f3, B:62:0x00fb, B:64:0x00ff, B:66:0x0108, B:68:0x0110, B:70:0x0118, B:72:0x011b, B:81:0x0132, B:83:0x013a, B:85:0x013f, B:94:0x015d, B:96:0x0165, B:86:0x0142, B:88:0x014a, B:90:0x0152, B:92:0x0155, B:98:0x0168, B:100:0x0170, B:102:0x0175, B:104:0x0178, B:106:0x0180, B:108:0x0189, B:110:0x0191, B:111:0x0193, B:113:0x0196, B:114:0x01a0, B:126:0x01e0, B:116:0x01a4, B:118:0x01ac, B:119:0x01b6, B:121:0x01be, B:122:0x01c8, B:124:0x01d0, B:125:0x01da, B:127:0x01e3, B:129:0x01eb, B:131:0x01f3), top: B:134:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ void lambda$getBeanInfo1x$9(Annotation annotation, BeanInfo beanInfo, Method method) {
        String str;
        Class<?> cls;
        Class<? extends JSONReader.AutoTypeBeforeHandler> cls2;
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            int i9 = 0;
            switch (name.hashCode()) {
                case -1678076717:
                    if (name.equals("deserializer")) {
                        Class cls3 = (Class) objInvoke;
                        if (ObjectReader.class.isAssignableFrom(cls3)) {
                            beanInfo.deserializer = cls3;
                        }
                    }
                    break;
                case -1073807344:
                    if (name.equals("parseFeatures")) {
                        Enum[] enumArr = (Enum[]) objInvoke;
                        while (i9 < enumArr.length) {
                            String strName = enumArr[i9].name();
                            switch (strName.hashCode()) {
                                case -1604251670:
                                    strName.equals("TrimStringFieldValue");
                                    break;
                                case -894003883:
                                    if (strName.equals("SupportArrayToBean")) {
                                        beanInfo.readerFeatures |= JSONReader.Feature.SupportArrayToBean.mask;
                                    }
                                    break;
                                case -200815016:
                                    if (strName.equals("SupportAutoType")) {
                                        beanInfo.readerFeatures |= JSONReader.Feature.SupportAutoType.mask;
                                    }
                                    break;
                                case 2005790178:
                                    if (strName.equals("InitStringFieldAsEmpty")) {
                                        beanInfo.readerFeatures |= JSONReader.Feature.InitStringFieldAsEmpty.mask;
                                    }
                                    break;
                            }
                            i9++;
                        }
                    }
                    break;
                case -1052827512:
                    if (name.equals("naming")) {
                        beanInfo.namingStrategy = ((Enum) objInvoke).name();
                    }
                    break;
                case -1008770331:
                    if (name.equals("orders")) {
                        String[] strArr = (String[]) objInvoke;
                        if (strArr.length != 0) {
                            beanInfo.orders = strArr;
                        }
                    }
                    break;
                case -853109563:
                    if (!name.equals("typeKey")) {
                    }
                    str = (String) objInvoke;
                    if (str.isEmpty()) {
                        beanInfo.typeKey = str;
                    }
                    break;
                case -676507419:
                    if (name.equals("typeName")) {
                        String str2 = (String) objInvoke;
                        if (!str2.isEmpty()) {
                            beanInfo.typeName = str2;
                        }
                    }
                    break;
                case -618447321:
                    if (name.equals("seeAlsoDefault")) {
                        Class cls4 = (Class) objInvoke;
                        if (cls4 != Void.class) {
                            beanInfo.seeAlsoDefault = cls4;
                        }
                        str = (String) objInvoke;
                        if (str.isEmpty()) {
                        }
                    }
                    break;
                case -432515134:
                    if (!name.equals("autoTypeBeforeHandler")) {
                    }
                    cls2 = (Class) objInvoke;
                    if (cls2 == JSONReader.AutoTypeBeforeHandler.class && JSONReader.AutoTypeBeforeHandler.class.isAssignableFrom(cls2)) {
                        beanInfo.autoTypeBeforeHandler = cls2;
                        break;
                    }
                    break;
                case -167039347:
                    if (name.equals("rootName")) {
                        String str3 = (String) objInvoke;
                        if (!str3.isEmpty()) {
                            beanInfo.rootName = str3;
                        }
                    }
                    break;
                case 230944667:
                    if (name.equals("builder") && (cls = (Class) objInvoke) != Void.TYPE && cls != Void.class) {
                        beanInfo.builder = cls;
                        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
                        int length = declaredAnnotations.length;
                        while (i9 < length) {
                            Annotation annotation2 = declaredAnnotations[i9];
                            Class<? extends Annotation> clsAnnotationType = annotation2.annotationType();
                            if (clsAnnotationType.getName().equals("com.alibaba.fastjson.annotation.JSONPOJOBuilder")) {
                                getBeanInfo1xJSONPOJOBuilder(beanInfo, cls, annotation2, clsAnnotationType);
                            } else {
                                JSONBuilder jSONBuilder = (JSONBuilder) BeanUtils.findAnnotation(cls, JSONBuilder.class);
                                if (jSONBuilder != null) {
                                    beanInfo.buildMethod = BeanUtils.buildMethod(cls, jSONBuilder.buildMethod());
                                    String strWithPrefix = jSONBuilder.withPrefix();
                                    if (!strWithPrefix.isEmpty()) {
                                        beanInfo.builderWithPrefix = strWithPrefix;
                                    }
                                }
                            }
                            i9++;
                        }
                        if (beanInfo.buildMethod == null) {
                            beanInfo.buildMethod = BeanUtils.buildMethod(cls, "build");
                        }
                        if (beanInfo.buildMethod == null) {
                            beanInfo.buildMethod = BeanUtils.buildMethod(cls, "create");
                        }
                        break;
                    }
                    break;
                case 1053501509:
                    if (name.equals("deserializeUsing")) {
                        Class cls5 = (Class) objInvoke;
                        if (ObjectReader.class.isAssignableFrom(cls5)) {
                            beanInfo.deserializer = cls5;
                        }
                    }
                    break;
                case 1401959644:
                    if (name.equals("deserializeFeatures")) {
                        JSONReader.Feature[] featureArr = (JSONReader.Feature[]) objInvoke;
                        while (i9 < featureArr.length) {
                            beanInfo.readerFeatures |= featureArr[i9].mask;
                            i9++;
                        }
                    }
                    break;
                case 1706529099:
                    if (name.equals("autoTypeCheckHandler")) {
                        cls2 = (Class) objInvoke;
                        if (cls2 == JSONReader.AutoTypeBeforeHandler.class) {
                        }
                    }
                    break;
                case 1752415457:
                    if (name.equals("ignores")) {
                        String[] strArr2 = (String[]) objInvoke;
                        if (strArr2.length > 0) {
                            beanInfo.ignores = strArr2;
                        }
                    }
                    break;
                case 1970571962:
                    if (name.equals("seeAlso")) {
                        Class<?>[] clsArr = (Class[]) objInvoke;
                        if (clsArr.length != 0) {
                            beanInfo.seeAlso = clsArr;
                            beanInfo.seeAlsoNames = new String[clsArr.length];
                            while (i9 < clsArr.length) {
                                Class<?> cls6 = clsArr[i9];
                                BeanInfo beanInfo2 = new BeanInfo();
                                processSeeAlsoAnnotation(beanInfo2, cls6);
                                String simpleName = beanInfo2.typeName;
                                if (simpleName == null || simpleName.isEmpty()) {
                                    simpleName = cls6.getSimpleName();
                                }
                                beanInfo.seeAlsoNames[i9] = simpleName;
                                i9++;
                            }
                            beanInfo.readerFeatures |= JSONReader.Feature.SupportAutoType.mask;
                        }
                    }
                    break;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getBeanInfo1xJSONPOJOBuilder$12(Annotation annotation, BeanInfo beanInfo, Class cls, Method method) {
        try {
            String name = method.getName();
            int iHashCode = name.hashCode();
            if (iHashCode == 2068281583) {
                if (name.equals("buildMethod")) {
                    beanInfo.buildMethod = BeanUtils.buildMethod(cls, (String) method.invoke(annotation, null));
                }
            } else if (iHashCode == 2092901112 && name.equals("withPrefix")) {
                String str = (String) method.invoke(annotation, null);
                if (str.isEmpty()) {
                    return;
                }
                beanInfo.builderWithPrefix = str;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCreator$13(Annotation annotation, BeanInfo beanInfo, Method method) {
        try {
            String name = method.getName();
            if (name.hashCode() == 1117066527 && name.equals("parameterNames")) {
                String[] strArr = (String[]) method.invoke(annotation, null);
                if (strArr.length != 0) {
                    beanInfo.createParameterNames = strArr;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getCreator$14(Annotation annotation, BeanInfo beanInfo, Method method) {
        try {
            String name = method.getName();
            if (name.hashCode() == 1117066527 && name.equals("parameterNames")) {
                String[] strArr = (String[]) method.invoke(annotation, null);
                if (strArr.length != 0) {
                    beanInfo.createParameterNames = strArr;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ File lambda$getObjectReaderModule$16(String str) {
        return new File(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ URL lambda$getObjectReaderModule$17(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e6) {
            C0086a.m465x("read URL error", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ InetAddress lambda$getObjectReaderModule$20(String str) {
        try {
            return InetAddress.getByName(str);
        } catch (UnknownHostException e6) {
            C0086a.m465x("create address error", e6);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static /* synthetic */ void lambda$processJSONField1x$11(Annotation annotation, FieldInfo fieldInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            switch (name.hashCode()) {
                case -1268779017:
                    if (name.equals("format")) {
                        String str = (String) objInvoke;
                        if (!str.isEmpty()) {
                            String strTrim = str.trim();
                            if (strTrim.indexOf(84) != -1 && !strTrim.contains("'T'")) {
                                strTrim = strTrim.replaceAll("T", "'T'");
                            }
                            fieldInfo.format = strTrim;
                        }
                    }
                    break;
                case -1206994319:
                    if (name.equals("ordinal")) {
                        Integer num = (Integer) objInvoke;
                        if (num.intValue() != 0) {
                            fieldInfo.ordinal = num.intValue();
                        }
                    }
                    break;
                case -1073807344:
                    if (name.equals("parseFeatures")) {
                        for (Enum r02 : (Enum[]) objInvoke) {
                            String strName = r02.name();
                            int iHashCode = strName.hashCode();
                            if (iHashCode != -894003883) {
                                if (iHashCode != -200815016) {
                                    if (iHashCode == 2005790178 && strName.equals("InitStringFieldAsEmpty")) {
                                        fieldInfo.features |= JSONReader.Feature.InitStringFieldAsEmpty.mask;
                                    }
                                } else if (strName.equals("SupportAutoType")) {
                                    fieldInfo.features |= JSONReader.Feature.SupportAutoType.mask;
                                }
                            } else if (strName.equals("SupportArrayToBean")) {
                                fieldInfo.features |= JSONReader.Feature.SupportArrayToBean.mask;
                            }
                        }
                    }
                    break;
                case -659125328:
                    if (name.equals("defaultValue")) {
                        String str2 = (String) objInvoke;
                        if (!str2.isEmpty()) {
                            fieldInfo.defaultValue = str2;
                        }
                    }
                    break;
                case -224599314:
                    if (name.equals("alternateNames")) {
                        String[] strArr = (String[]) objInvoke;
                        if (strArr.length != 0) {
                            if (fieldInfo.alternateNames == null) {
                                fieldInfo.alternateNames = strArr;
                            } else {
                                LinkedHashSet linkedHashSet = new LinkedHashSet();
                                linkedHashSet.addAll(Arrays.asList(strArr));
                                linkedHashSet.addAll(Arrays.asList(fieldInfo.alternateNames));
                                fieldInfo.alternateNames = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                            }
                        }
                    }
                    break;
                case 3373707:
                    if (name.equals("name")) {
                        String str3 = (String) objInvoke;
                        if (!str3.isEmpty()) {
                            fieldInfo.fieldName = str3;
                        }
                    }
                    break;
                case 102727412:
                    if (name.equals("label")) {
                        String str4 = (String) objInvoke;
                        if (!str4.isEmpty()) {
                            fieldInfo.label = str4;
                        }
                    }
                    break;
                case 1053501509:
                    if (name.equals("deserializeUsing")) {
                        Class<?> cls = (Class) objInvoke;
                        if (ObjectReader.class.isAssignableFrom(cls)) {
                            fieldInfo.readUsing = cls;
                        }
                    }
                    break;
                case 1746983807:
                    if (name.equals("deserialize") && !((Boolean) objInvoke).booleanValue()) {
                        fieldInfo.ignore = true;
                        break;
                    }
                    break;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processSeeAlsoAnnotation$10(Annotation annotation, BeanInfo beanInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if (name.equals("typeName")) {
                String str = (String) objInvoke;
                if (str.isEmpty()) {
                    return;
                }
                beanInfo.typeName = str;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static boolean match(Type type, ObjectReader objectReader, ClassLoader classLoader) {
        Class<?> cls = TypeUtils.getClass(type);
        if (cls != null && cls.getClassLoader() == classLoader) {
            return true;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (match(parameterizedType.getRawType(), objectReader, classLoader)) {
                return true;
            }
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                if (match(type2, objectReader, classLoader)) {
                    return true;
                }
            }
        }
        if (objectReader instanceof ObjectReaderImplMapTyped) {
            ObjectReaderImplMapTyped objectReaderImplMapTyped = (ObjectReaderImplMapTyped) objectReader;
            Class cls2 = objectReaderImplMapTyped.valueClass;
            if (cls2 != null && cls2.getClassLoader() == classLoader) {
                return true;
            }
            Class<?> cls3 = TypeUtils.getClass(objectReaderImplMapTyped.keyType);
            return cls3 != null && cls3.getClassLoader() == classLoader;
        }
        if (objectReader instanceof ObjectReaderImplList) {
            Class cls4 = ((ObjectReaderImplList) objectReader).itemClass;
            return cls4 != null && cls4.getClassLoader() == classLoader;
        }
        if (objectReader instanceof ObjectReaderImplOptional) {
            Class cls5 = ((ObjectReaderImplOptional) objectReader).itemClass;
            return cls5 != null && cls5.getClassLoader() == classLoader;
        }
        if (objectReader instanceof ObjectReaderAdapter) {
            for (FieldReader fieldReader : ((ObjectReaderAdapter) objectReader).fieldReaders) {
                Class cls6 = fieldReader.fieldClass;
                if (cls6 != null && cls6.getClassLoader() == classLoader) {
                    return true;
                }
                Type type3 = fieldReader.fieldType;
                if ((type3 instanceof ParameterizedType) && match(type3, null, classLoader)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void processAnnotation(FieldInfo fieldInfo, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            JSONField jSONField = (JSONField) BeanUtils.findAnnotation(annotation, JSONField.class);
            if (jSONField != null) {
                getFieldInfo(fieldInfo, jSONField);
                if (jSONField != annotation) {
                    if (clsAnnotationType.getName().equals("com.alibaba.fastjson.annotation.JSONField")) {
                        processJSONField1x(fieldInfo, annotation);
                    }
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void processJSONField1x(FieldInfo fieldInfo, Annotation annotation) {
        BeanUtils.annotationMethods(annotation.getClass(), new C0305w(annotation, 6, fieldInfo));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private void processSeeAlsoAnnotation(BeanInfo beanInfo, Class<?> cls) {
        Class cls2 = this.mixInCache.get(cls);
        if (cls2 != null && cls2 != cls) {
            beanInfo.mixIn = true;
            processSeeAlsoAnnotation(beanInfo, cls2.getDeclaredAnnotations());
        }
        processSeeAlsoAnnotation(beanInfo, cls.getDeclaredAnnotations());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static Function registerTypeConvert(ConcurrentMap<Type, Map<Type, Function>> concurrentMap, Type type, Type type2, Function function) {
        Map<Type, Function> map = concurrentMap.get(type);
        if (map == null) {
            concurrentMap.put(type, new ConcurrentHashMap());
            map = concurrentMap.get(type);
        }
        return map.put(type2, function);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static ObjectReader typedMap(Class cls, Class cls2, Type type, Type type2) {
        return ((type == null || type == String.class) && type2 == String.class) ? new ObjectReaderImplMapString(cls, cls2, 0L) : new ObjectReaderImplMapTyped(cls, cls2, type, type2, 0L, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addAutoTypeAccept(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        long jHashCode64 = Fnv.hashCode64(str);
        if (Arrays.binarySearch(this.acceptHashCodes, jHashCode64) < 0) {
            long[] jArr = this.acceptHashCodes;
            int length = jArr.length;
            long[] jArr2 = new long[length + 1];
            jArr2[length] = jHashCode64;
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            Arrays.sort(jArr2);
            this.acceptHashCodes = jArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void addAutoTypeDeny(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        long jHashCode64 = Fnv.hashCode64(str);
        if (Arrays.binarySearch(this.denyHashCodes, jHashCode64) < 0) {
            long[] jArr = this.denyHashCodes;
            int length = jArr.length;
            long[] jArr2 = new long[length + 1];
            jArr2[length] = jHashCode64;
            System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
            Arrays.sort(jArr2);
            this.denyHashCodes = jArr2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void afterAutoType(String str, Class cls) {
        Consumer<Class> consumer = this.autoTypeHandler;
        if (consumer != null) {
            consumer.accept(cls);
        }
        synchronized (this.autoTypeList) {
            this.autoTypeList.put(str, new Date());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class<?> checkAutoType(String str, Class<?> cls, long j3) {
        long j4;
        Class<?> clsLoadClass;
        Class<?> clsApply;
        if (str == null || str.isEmpty()) {
            return null;
        }
        JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler = this.autoTypeBeforeHandler;
        if (autoTypeBeforeHandler != null && (clsApply = autoTypeBeforeHandler.apply(str, cls, j3)) != null) {
            afterAutoType(str, clsApply);
            return clsApply;
        }
        int length = str.length();
        if (length >= 192) {
            C0086a.m464w("autoType is not support. ".concat(str));
            return null;
        }
        if (str.charAt(0) == '[') {
            checkAutoType(str.substring(1), null, j3);
        }
        if (cls != null && cls.getName().equals(str)) {
            afterAutoType(str, cls);
            return cls;
        }
        long j5 = 0;
        boolean z9 = (JSONReader.Feature.SupportAutoType.mask & j3) != 0;
        long j10 = Fnv.MAGIC_HASH_CODE;
        if (z9) {
            long j11 = -3750763034362895579L;
            int i9 = 0;
            j4 = Fnv.MAGIC_PRIME;
            while (i9 < length) {
                char cCharAt = str.charAt(i9);
                if (cCharAt == '$') {
                    cCharAt = '.';
                }
                long j12 = j5;
                long j13 = (j11 ^ ((long) cCharAt)) * Fnv.MAGIC_PRIME;
                if (Arrays.binarySearch(this.acceptHashCodes, j13) >= 0 && (clsLoadClass = TypeUtils.loadClass(str)) != null) {
                    if (cls == null || cls.isAssignableFrom(clsLoadClass)) {
                        afterAutoType(str, clsLoadClass);
                        return clsLoadClass;
                    }
                    C0086a.m459r(AbstractC0255e.m1026o("type not match. ", str, " -> "), cls.getName());
                    return null;
                }
                if (Arrays.binarySearch(this.denyHashCodes, j13) >= 0 && TypeUtils.getMapping(str) == null) {
                    C0086a.m464w("autoType is not support. ".concat(str));
                    return null;
                }
                i9++;
                j11 = j13;
                j5 = j12;
            }
        } else {
            j4 = Fnv.MAGIC_PRIME;
        }
        long j14 = j5;
        if (!z9) {
            int i10 = 0;
            while (i10 < length) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 == '$') {
                    cCharAt2 = '.';
                }
                long j15 = (j10 ^ ((long) cCharAt2)) * j4;
                if (Arrays.binarySearch(this.denyHashCodes, j15) >= 0) {
                    C0086a.m464w("autoType is not support. ".concat(str));
                    return null;
                }
                if (Arrays.binarySearch(this.acceptHashCodes, j15) >= 0) {
                    Class<?> clsLoadClass2 = TypeUtils.loadClass(str);
                    if (clsLoadClass2 == null || cls == null || cls.isAssignableFrom(clsLoadClass2)) {
                        afterAutoType(str, clsLoadClass2);
                        return clsLoadClass2;
                    }
                    C0086a.m459r(AbstractC0255e.m1026o("type not match. ", str, " -> "), cls.getName());
                    return null;
                }
                i10++;
                j10 = j15;
            }
        }
        if (!z9) {
            return null;
        }
        Class<?> mapping = TypeUtils.getMapping(str);
        if (mapping != null) {
            if (cls == null || cls == Object.class || mapping == HashMap.class || cls.isAssignableFrom(mapping)) {
                afterAutoType(str, mapping);
                return mapping;
            }
            C0086a.m459r(AbstractC0255e.m1026o("type not match. ", str, " -> "), cls.getName());
            return null;
        }
        Class<?> clsLoadClass3 = TypeUtils.loadClass(str);
        if (clsLoadClass3 != null) {
            if (ClassLoader.class.isAssignableFrom(clsLoadClass3) || DataSource.class.isAssignableFrom(clsLoadClass3) || RowSet.class.isAssignableFrom(clsLoadClass3)) {
                C0086a.m464w("autoType is not support. ".concat(str));
                return null;
            }
            if (cls != null) {
                if (cls.isAssignableFrom(clsLoadClass3)) {
                    afterAutoType(str, clsLoadClass3);
                    return clsLoadClass3;
                }
                if ((j3 & JSONReader.Feature.IgnoreAutoTypeNotMatch.mask) != j14) {
                    return cls;
                }
                C0086a.m459r(AbstractC0255e.m1026o("type not match. ", str, " -> "), cls.getName());
                return null;
            }
        }
        afterAutoType(str, clsLoadClass3);
        return clsLoadClass3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void cleanup(ClassLoader classLoader) {
        Iterator<Map.Entry<Class, Class>> it = this.mixInCache.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().getClassLoader() == classLoader) {
                it.remove();
            }
        }
        Iterator<Map.Entry<Type, ObjectReader>> it2 = this.cache.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<Type, ObjectReader> next = it2.next();
            if (match(next.getKey(), next.getValue(), classLoader)) {
                it2.remove();
            }
        }
        Iterator<Map.Entry<Type, ObjectReader>> it3 = this.cacheFieldBased.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry<Type, ObjectReader> next2 = it3.next();
            if (match(next2.getKey(), next2.getValue(), classLoader)) {
                it3.remove();
            }
        }
        BeanUtils.cleanupCache(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void cleanupMixIn() {
        this.mixInCache.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void clear() {
        this.mixInCache.clear();
        this.cache.clear();
        this.cacheFieldBased.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public FieldReader createFieldReader(Class cls, String str, long j3) {
        ObjectReader objectReader = (j3 & JSONReader.Feature.FieldBased.mask) != 0 ? this.cacheFieldBased.get(cls) : this.cache.get(cls);
        if (objectReader != null) {
            return objectReader.getFieldReader(str);
        }
        final AtomicReference atomicReference = new AtomicReference();
        final long jHashCode64LCase = Fnv.hashCode64LCase(str);
        final int i9 = 0;
        BeanUtils.fields(cls, new Consumer() { // from class: com.alibaba.fastjson2.reader.h
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i9) {
                    case 0:
                        ObjectReaderProvider.lambda$createFieldReader$3(jHashCode64LCase, atomicReference, (Field) obj);
                        break;
                    default:
                        ObjectReaderProvider.lambda$createFieldReader$4(jHashCode64LCase, atomicReference, (Method) obj);
                        break;
                }
            }
        });
        Field field = (Field) atomicReference.get();
        if (field != null) {
            return this.creator.createFieldReader(str, null, field.getType(), field);
        }
        final AtomicReference atomicReference2 = new AtomicReference();
        final int i10 = 1;
        BeanUtils.setters(cls, new Consumer() { // from class: com.alibaba.fastjson2.reader.h
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        ObjectReaderProvider.lambda$createFieldReader$3(jHashCode64LCase, atomicReference2, (Field) obj);
                        break;
                    default:
                        ObjectReaderProvider.lambda$createFieldReader$4(jHashCode64LCase, atomicReference2, (Method) obj);
                        break;
                }
            }
        });
        Method method = (Method) atomicReference2.get();
        if (method == null) {
            return null;
        }
        Class<?> cls2 = method.getParameterTypes()[0];
        return this.creator.createFieldReaderMethod(cls, str, null, cls2, cls2, method);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public JSONReader.AutoTypeBeforeHandler getAutoTypeBeforeHandler() {
        return this.autoTypeBeforeHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Consumer<Class> getAutoTypeHandler() {
        return this.autoTypeHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Map<String, Date> getAutoTypeList() {
        return this.autoTypeList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void getBeanInfo(final BeanInfo beanInfo, final Class<?> cls) {
        Class cls2 = this.mixInCache.get(cls);
        final int i9 = 0;
        if (cls2 != null && cls2 != cls) {
            final int i10 = 1;
            beanInfo.mixIn = true;
            getBeanInfo(beanInfo, cls2.getDeclaredAnnotations());
            BeanUtils.staticMethod(cls2, new Consumer(this) { // from class: com.alibaba.fastjson2.reader.m

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ObjectReaderProvider f1975b;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f1975b = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    switch (i9) {
                        case 0:
                            this.f1975b.lambda$getBeanInfo$5(beanInfo, cls, (Method) obj);
                            break;
                        case 1:
                            this.f1975b.lambda$getBeanInfo$6(beanInfo, cls, (Constructor) obj);
                            break;
                        case 2:
                            this.f1975b.lambda$getBeanInfo$7(beanInfo, cls, (Method) obj);
                            break;
                        default:
                            this.f1975b.lambda$getBeanInfo$8(beanInfo, cls, (Constructor) obj);
                            break;
                    }
                }
            });
            BeanUtils.constructor(cls2, new Consumer(this) { // from class: com.alibaba.fastjson2.reader.m

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ObjectReaderProvider f1975b;

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                {
                    this.f1975b = this;
                }

                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    switch (i10) {
                        case 0:
                            this.f1975b.lambda$getBeanInfo$5(beanInfo, cls, (Method) obj);
                            break;
                        case 1:
                            this.f1975b.lambda$getBeanInfo$6(beanInfo, cls, (Constructor) obj);
                            break;
                        case 2:
                            this.f1975b.lambda$getBeanInfo$7(beanInfo, cls, (Method) obj);
                            break;
                        default:
                            this.f1975b.lambda$getBeanInfo$8(beanInfo, cls, (Constructor) obj);
                            break;
                    }
                }
            });
        }
        Class<? super Object> cls3 = null;
        for (Class<? super Object> superclass = cls.getSuperclass(); superclass != null && superclass != Object.class && superclass != Enum.class; superclass = superclass.getSuperclass()) {
            BeanInfo beanInfo2 = new BeanInfo();
            getBeanInfo(beanInfo2, superclass);
            Class<?>[] clsArr = beanInfo2.seeAlso;
            if (clsArr != null) {
                int length = clsArr.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length) {
                        cls3 = superclass;
                        break;
                    } else if (clsArr[i11] == cls) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        if (cls3 != null) {
            getBeanInfo(beanInfo, cls3);
        }
        Annotation[] declaredAnnotations = cls.getDeclaredAnnotations();
        getBeanInfo(beanInfo, declaredAnnotations);
        int length2 = declaredAnnotations.length;
        while (i9 < length2) {
            Annotation annotation = declaredAnnotations[i9];
            if (annotation.annotationType().getName().equals("com.alibaba.fastjson.annotation.JSONType")) {
                getBeanInfo1x(beanInfo, annotation);
            }
            i9++;
        }
        final int i12 = 2;
        BeanUtils.staticMethod(cls, new Consumer(this) { // from class: com.alibaba.fastjson2.reader.m

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ObjectReaderProvider f1975b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f1975b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i12) {
                    case 0:
                        this.f1975b.lambda$getBeanInfo$5(beanInfo, cls, (Method) obj);
                        break;
                    case 1:
                        this.f1975b.lambda$getBeanInfo$6(beanInfo, cls, (Constructor) obj);
                        break;
                    case 2:
                        this.f1975b.lambda$getBeanInfo$7(beanInfo, cls, (Method) obj);
                        break;
                    default:
                        this.f1975b.lambda$getBeanInfo$8(beanInfo, cls, (Constructor) obj);
                        break;
                }
            }
        });
        final int i13 = 3;
        BeanUtils.constructor(cls, new Consumer(this) { // from class: com.alibaba.fastjson2.reader.m

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ ObjectReaderProvider f1975b;

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            {
                this.f1975b = this;
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                switch (i13) {
                    case 0:
                        this.f1975b.lambda$getBeanInfo$5(beanInfo, cls, (Method) obj);
                        break;
                    case 1:
                        this.f1975b.lambda$getBeanInfo$6(beanInfo, cls, (Constructor) obj);
                        break;
                    case 2:
                        this.f1975b.lambda$getBeanInfo$7(beanInfo, cls, (Method) obj);
                        break;
                    default:
                        this.f1975b.lambda$getBeanInfo$8(beanInfo, cls, (Constructor) obj);
                        break;
                }
            }
        });
        if (beanInfo.creatorConstructor == null && (beanInfo.readerFeatures & JSONReader.Feature.FieldBased.mask) == 0 && beanInfo.kotlin) {
            BeanUtils.getKotlinConstructor(cls, beanInfo);
            beanInfo.createParameterNames = BeanUtils.getKotlinConstructorParameters(cls);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void getBeanInfo1x(BeanInfo beanInfo, Annotation annotation) {
        BeanUtils.annotationMethods(annotation.getClass(), new C0632k(this, annotation, beanInfo));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Class getMixIn(Class cls) {
        return this.mixInCache.get(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader getObjectReader(Type type, boolean z9) {
        ObjectReader objectReader;
        ObjectReader objectReader2;
        if (type == null) {
            type = Object.class;
        }
        ObjectReader objectReader3 = z9 ? this.cacheFieldBased.get(type) : this.cache.get(type);
        boolean z10 = false;
        if (objectReader3 == null && (type instanceof WildcardType)) {
            Type[] upperBounds = ((WildcardType) type).getUpperBounds();
            if (upperBounds.length == 1) {
                objectReader3 = (z9 ? this.cacheFieldBased : this.cache).get(upperBounds[0]);
            }
        }
        if (objectReader3 != null) {
            return objectReader3;
        }
        ObjectReader objectReaderModule = getObjectReaderModule(type);
        if (objectReaderModule != null) {
            ObjectReader objectReaderPut = z9 ? this.cacheFieldBased.put(type, objectReaderModule) : this.cache.put(type, objectReaderModule);
            return objectReaderPut != null ? objectReaderPut : objectReaderModule;
        }
        if (type instanceof TypeVariable) {
            Type[] bounds = ((TypeVariable) type).getBounds();
            if (bounds.length > 0) {
                Type type2 = bounds[0];
                if ((type2 instanceof Class) && (objectReader2 = getObjectReader(type2, z9)) != null) {
                    ObjectReader previousObjectReader = getPreviousObjectReader(z9, type, objectReader2);
                    return previousObjectReader != null ? previousObjectReader : objectReader2;
                }
            }
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type rawType = parameterizedType.getRawType();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (rawType instanceof Class) {
                Class cls = (Class) rawType;
                Class superclass = cls;
                while (true) {
                    if (superclass == Object.class) {
                        break;
                    }
                    if (superclass.getTypeParameters().length > 0) {
                        z10 = true;
                        break;
                    }
                    superclass = superclass.getSuperclass();
                }
                if ((actualTypeArguments.length == 0 || !z10) && (objectReader = getObjectReader(cls, z9)) != null) {
                    ObjectReader previousObjectReader2 = getPreviousObjectReader(z9, type, objectReader);
                    return previousObjectReader2 != null ? previousObjectReader2 : objectReader;
                }
                if (actualTypeArguments.length == 1 && ArrayList.class.isAssignableFrom(cls)) {
                    return ObjectReaderImplList.m1726of(type, cls, 0L);
                }
                if (actualTypeArguments.length == 2 && Map.class.isAssignableFrom(cls)) {
                    return ObjectReaderImplMap.m1732of(type, cls, 0L);
                }
            }
        }
        ObjectReader objectReaderCreateObjectReader = getCreator().createObjectReader(TypeUtils.getMapping(type), type, z9, this);
        ObjectReader previousObjectReader3 = getPreviousObjectReader(z9, type, objectReaderCreateObjectReader);
        return previousObjectReader3 != null ? previousObjectReader3 : objectReaderCreateObjectReader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public ObjectReader getObjectReaderModule(Type type) {
        Class cls;
        Type type2;
        byte b10;
        Class<?> cls2;
        Class cls3;
        Class<?> cls4;
        Class cls5;
        if (type == String.class || type == CharSequence.class) {
            return ObjectReaderImplString.INSTANCE;
        }
        if (type == Character.TYPE || type == Character.class) {
            return ObjectReaderImplCharacter.INSTANCE;
        }
        if (type == Boolean.TYPE || type == Boolean.class) {
            return ObjectReaderImplBoolean.INSTANCE;
        }
        if (type == Byte.TYPE || type == Byte.class) {
            return ObjectReaderImplByte.INSTANCE;
        }
        if (type == Short.TYPE || type == Short.class) {
            return ObjectReaderImplShort.INSTANCE;
        }
        Class cls6 = Integer.TYPE;
        if (type == cls6 || type == Integer.class) {
            return ObjectReaderImplInteger.INSTANCE;
        }
        if (type == Long.TYPE || type == Long.class) {
            return ObjectReaderImplInt64.INSTANCE;
        }
        if (type == Float.TYPE || type == Float.class) {
            return ObjectReaderImplFloat.INSTANCE;
        }
        if (type == Double.TYPE || type == Double.class) {
            return ObjectReaderImplDouble.INSTANCE;
        }
        if (type == BigInteger.class) {
            return ObjectReaderImplBigInteger.INSTANCE;
        }
        if (type == BigDecimal.class) {
            return ObjectReaderImplBigDecimal.INSTANCE;
        }
        if (type == Number.class) {
            return ObjectReaderImplNumber.INSTANCE;
        }
        if (type == OptionalInt.class) {
            return ObjectReaderImplOptionalInt.INSTANCE;
        }
        if (type == OptionalLong.class) {
            return ObjectReaderImplOptionalLong.INSTANCE;
        }
        if (type == OptionalDouble.class) {
            return ObjectReaderImplOptionalDouble.INSTANCE;
        }
        if (type == Optional.class) {
            return ObjectReaderImplOptional.INSTANCE;
        }
        if (type == UUID.class) {
            return ObjectReaderImplUUID.INSTANCE;
        }
        if (type == Duration.class) {
            return new ObjectReaderImplFromString(Duration.class, new C0627f(23));
        }
        int i9 = 0;
        if (type == Period.class) {
            return new ObjectReaderImplFromString(Period.class, new C0633l(i9));
        }
        int i10 = 1;
        if (type == AtomicBoolean.class) {
            return new ObjectReaderImplFromBoolean(AtomicBoolean.class, new C0633l(i10));
        }
        int i11 = 2;
        if (type == URI.class) {
            return new ObjectReaderImplFromString(URI.class, new C0633l(i11));
        }
        int i12 = 3;
        if (type == Charset.class) {
            return new ObjectReaderImplFromString(Charset.class, new C0633l(i12));
        }
        int i13 = 4;
        if (type == File.class) {
            return new ObjectReaderImplFromString(File.class, new C0633l(i13));
        }
        int i14 = 5;
        if (type == URL.class) {
            return new ObjectReaderImplFromString(URL.class, new C0633l(i14));
        }
        int i15 = 6;
        if (type == Pattern.class) {
            return new ObjectReaderImplFromString(Pattern.class, new C0633l(i15));
        }
        int i16 = 29;
        if (type == SimpleDateFormat.class) {
            return new ObjectReaderImplFromString(SimpleDateFormat.class, new C0627f(i16));
        }
        if (type == Class.class) {
            return ObjectReaderImplClass.INSTANCE;
        }
        if (type == Method.class) {
            return new ObjectReaderImplMethod();
        }
        if (type == Field.class) {
            return new ObjectReaderImplField();
        }
        if (type == Type.class) {
            return ObjectReaderImplClass.INSTANCE;
        }
        boolean z9 = type instanceof Class;
        String name = z9 ? ((Class) type).getName() : HttpUrl.FRAGMENT_ENCODE_SET;
        if (type == Map.class || type == AbstractMap.class) {
            return ObjectReaderImplMap.m1732of(null, (Class) type, 0L);
        }
        if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
            return typedMap((Class) type, ConcurrentHashMap.class, null, Object.class);
        }
        if (type == ConcurrentNavigableMap.class || type == ConcurrentSkipListMap.class) {
            return typedMap((Class) type, ConcurrentSkipListMap.class, null, Object.class);
        }
        if (type == SortedMap.class || type == NavigableMap.class || type == TreeMap.class) {
            return typedMap((Class) type, TreeMap.class, null, Object.class);
        }
        if (type == Calendar.class) {
            return ObjectReaderImplCalendar.INSTANCE;
        }
        if (type == Date.class) {
            return ObjectReaderImplDate.INSTANCE;
        }
        if (type == LocalDate.class) {
            return ObjectReaderImplLocalDate.INSTANCE;
        }
        if (type == LocalTime.class) {
            return ObjectReaderImplLocalTime.INSTANCE;
        }
        if (type == LocalDateTime.class) {
            return ObjectReaderImplLocalDateTime.INSTANCE;
        }
        if (type == ZonedDateTime.class) {
            return ObjectReaderImplZonedDateTime.INSTANCE;
        }
        if (type == OffsetDateTime.class) {
            return ObjectReaderImplOffsetDateTime.INSTANCE;
        }
        if (type == OffsetTime.class) {
            return ObjectReaderImplOffsetTime.INSTANCE;
        }
        if (type == ZoneOffset.class) {
            return new ObjectReaderImplFromString(ZoneOffset.class, new C0633l(7));
        }
        if (type == Instant.class) {
            return ObjectReaderImplInstant.INSTANCE;
        }
        if (type == Locale.class) {
            return ObjectReaderImplLocale.INSTANCE;
        }
        if (type == Currency.class) {
            return ObjectReaderImplCurrency.INSTANCE;
        }
        if (type == ZoneId.class) {
            return new ObjectReaderImplFromString(ZoneId.class, new C0627f(24));
        }
        if (type == TimeZone.class) {
            return new ObjectReaderImplFromString(TimeZone.class, new C0627f(25));
        }
        if (type == char[].class) {
            return ObjectReaderImplCharValueArray.INSTANCE;
        }
        if (type == float[].class) {
            return ObjectReaderImplFloatValueArray.INSTANCE;
        }
        if (type == double[].class) {
            return ObjectReaderImplDoubleValueArray.INSTANCE;
        }
        if (type == boolean[].class) {
            return ObjectReaderImplBoolValueArray.INSTANCE;
        }
        if (type == byte[].class) {
            return ObjectReaderImplInt8ValueArray.INSTANCE;
        }
        if (type == short[].class) {
            return ObjectReaderImplInt16ValueArray.INSTANCE;
        }
        if (type == int[].class) {
            return ObjectReaderImplInt32ValueArray.INSTANCE;
        }
        if (type == long[].class) {
            return ObjectReaderImplInt64ValueArray.INSTANCE;
        }
        if (type == Byte[].class) {
            return ObjectReaderImplInt8Array.INSTANCE;
        }
        if (type == Short[].class) {
            return ObjectReaderImplInt16Array.INSTANCE;
        }
        if (type == Integer[].class) {
            return ObjectReaderImplInt32Array.INSTANCE;
        }
        if (type == Long[].class) {
            return ObjectReaderImplInt64Array.INSTANCE;
        }
        if (type == Float[].class) {
            return ObjectReaderImplFloatArray.INSTANCE;
        }
        if (type == Double[].class) {
            return ObjectReaderImplDoubleArray.INSTANCE;
        }
        if (type == Number[].class) {
            return ObjectReaderImplNumberArray.INSTANCE;
        }
        if (type == String[].class) {
            return ObjectReaderImplStringArray.INSTANCE;
        }
        if (type == AtomicInteger.class) {
            return new ObjectReaderImplFromInt(AtomicInteger.class, new C0630i());
        }
        if (type == AtomicLong.class) {
            return new ObjectReaderImplFromLong(AtomicLong.class, new C0631j());
        }
        if (type == AtomicIntegerArray.class) {
            return new ObjectReaderImplInt32ValueArray(AtomicIntegerArray.class, new C0627f(26));
        }
        if (type == AtomicLongArray.class) {
            return new ObjectReaderImplInt64ValueArray(AtomicLongArray.class, new C0627f(27));
        }
        if (type == AtomicReference.class) {
            return ObjectReaderImplAtomicReference.INSTANCE;
        }
        String str = name;
        if (type instanceof MultiType) {
            return new ObjectArrayReaderMultiType((MultiType) type);
        }
        if (type instanceof MapMultiValueType) {
            return new ObjectReaderImplMapMultiValueType((MapMultiValueType) type);
        }
        if (type == StringBuffer.class || type == StringBuilder.class) {
            try {
                Class cls7 = (Class) type;
                return new ObjectReaderImplValue(cls7, String.class, String.class, 0L, null, null, cls7.getConstructor(String.class), null, null);
            } catch (NoSuchMethodException e6) {
                throw new RuntimeException(e6);
            }
        }
        if (type == Iterable.class || type == Collection.class || type == List.class || type == AbstractCollection.class || type == AbstractList.class || type == ArrayList.class) {
            return ObjectReaderImplList.m1726of(type, null, 0L);
        }
        if (type == Queue.class || type == Deque.class || type == AbstractSequentialList.class || type == LinkedList.class) {
            return ObjectReaderImplList.m1726of(type, null, 0L);
        }
        if (type == Set.class || type == AbstractSet.class || type == EnumSet.class) {
            return ObjectReaderImplList.m1726of(type, null, 0L);
        }
        if (type == NavigableSet.class || type == SortedSet.class) {
            return ObjectReaderImplList.m1726of(type, null, 0L);
        }
        if (type == ConcurrentLinkedQueue.class || type == ConcurrentSkipListSet.class || type == LinkedHashSet.class || type == HashSet.class || type == TreeSet.class || type == CopyOnWriteArrayList.class) {
            return ObjectReaderImplList.m1726of(type, null, 0L);
        }
        if (type == ObjectReaderImplList.CLASS_EMPTY_SET || type == ObjectReaderImplList.CLASS_EMPTY_LIST || type == ObjectReaderImplList.CLASS_SINGLETON || type == ObjectReaderImplList.CLASS_SINGLETON_LIST || type == ObjectReaderImplList.CLASS_ARRAYS_LIST || type == ObjectReaderImplList.CLASS_UNMODIFIABLE_COLLECTION || type == ObjectReaderImplList.CLASS_UNMODIFIABLE_LIST || type == ObjectReaderImplList.CLASS_UNMODIFIABLE_SET) {
            return ObjectReaderImplList.m1726of(type, null, 0L);
        }
        if (type == TypeUtils.CLASS_SINGLE_SET) {
            return ObjectReaderImplList.m1726of(type, null, 0L);
        }
        if (type == Object.class || type == Cloneable.class || type == Closeable.class || type == Serializable.class || type == Comparable.class) {
            return ObjectReaderImplObject.INSTANCE;
        }
        if (type == Map.Entry.class) {
            return new ObjectReaderImplMapEntry(null, null);
        }
        if (z9) {
            Class cls8 = (Class) type;
            if (Map.class.isAssignableFrom(cls8)) {
                return ObjectReaderImplMap.m1732of(null, cls8, 0L);
            }
            cls = ConcurrentSkipListMap.class;
            type2 = AbstractCollection.class;
            if (Collection.class.isAssignableFrom(cls8)) {
                return ObjectReaderImplList.m1726of(cls8, cls8, 0L);
            }
            if (cls8.isArray()) {
                return cls8.getComponentType() == Object.class ? ObjectArrayReader.INSTANCE : new ObjectArrayTypedReader(cls8);
            }
            ObjectReaderCreator objectReaderCreator = JSONFactory.defaultObjectReaderProvider.creator;
            if (cls8 == StackTraceElement.class) {
                try {
                    return objectReaderCreator.createObjectReaderNoneDefaultConstructor(cls8.getConstructor(String.class, String.class, String.class, cls6), "className", "methodName", "fileName", "lineNumber");
                } catch (Throwable unused) {
                }
            }
        } else {
            cls = ConcurrentSkipListMap.class;
            type2 = AbstractCollection.class;
        }
        if (!(type instanceof ParameterizedType)) {
            if (type instanceof GenericArrayType) {
                return new ObjectReaderImplGenericArray((GenericArrayType) type);
            }
            if (type instanceof WildcardType) {
                Type[] upperBounds = ((WildcardType) type).getUpperBounds();
                b10 = 1;
                if (upperBounds.length == 1) {
                    return getObjectReader(upperBounds[0]);
                }
            } else {
                b10 = 1;
            }
            if (type == ParameterizedType.class) {
                return ObjectReaders.ofReflect(ParameterizedTypeImpl.class);
            }
            switch (str.hashCode()) {
                case -1410806254:
                    b10 = !str.equals("java.util.JumboEnumSet") ? (byte) -1 : (byte) 0;
                    break;
                case -720123389:
                    if (!str.equals("java.net.InetAddress")) {
                        b10 = -1;
                    }
                    break;
                case 1087757882:
                    b10 = !str.equals("java.sql.Date") ? (byte) -1 : (byte) 2;
                    break;
                case 1088242009:
                    b10 = !str.equals("java.sql.Time") ? (byte) -1 : (byte) 3;
                    break;
                case 1252880906:
                    b10 = !str.equals("java.sql.Timestamp") ? (byte) -1 : (byte) 4;
                    break;
                case 1539653772:
                    b10 = !str.equals("java.text.SimpleDateFormat") ? (byte) -1 : (byte) 5;
                    break;
                case 1585284048:
                    b10 = !str.equals("java.net.InetSocketAddress") ? (byte) -1 : (byte) 6;
                    break;
                case 1829465637:
                    b10 = !str.equals("java.util.RegularEnumSet") ? (byte) -1 : (byte) 7;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                case 7:
                    return ObjectReaderImplList.m1726of(type, TypeUtils.getClass(type), 0L);
                case 1:
                    return ObjectReaderImplValue.m1737of((Class) type, String.class, new C0627f(28));
                case 2:
                    return new JdbcSupport.DateReader(null, null);
                case 3:
                    return new JdbcSupport.TimeReader(null, null);
                case 4:
                    return new JdbcSupport.TimestampReader(null, null);
                case 5:
                    return ObjectReaderImplValue.m1737of((Class) type, String.class, new C0627f(29));
                case 6:
                    return new ObjectReaderMisc((Class) type);
                default:
                    return null;
            }
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type rawType = parameterizedType.getRawType();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (actualTypeArguments.length == 2) {
            Type type3 = actualTypeArguments[0];
            Type type4 = actualTypeArguments[1];
            if (rawType == Map.class || rawType == AbstractMap.class || rawType == HashMap.class) {
                return typedMap((Class) rawType, HashMap.class, type3, type4);
            }
            if (rawType == ConcurrentMap.class || rawType == ConcurrentHashMap.class) {
                return typedMap((Class) rawType, ConcurrentHashMap.class, type3, type4);
            }
            Class cls9 = cls;
            if (rawType == ConcurrentNavigableMap.class || rawType == cls9) {
                return typedMap((Class) rawType, cls9, type3, type4);
            }
            if (rawType == LinkedHashMap.class || rawType == TreeMap.class || rawType == EnumMap.class) {
                Class cls10 = (Class) rawType;
                return typedMap(cls10, cls10, type3, type4);
            }
            if (rawType == Map.Entry.class) {
                return new ObjectReaderImplMapEntry(type3, type4);
            }
        }
        if (actualTypeArguments.length == 1) {
            Type type5 = actualTypeArguments[0];
            Class<?> mapping = TypeUtils.getMapping(type5);
            if (rawType == Iterable.class || rawType == Collection.class || rawType == List.class || rawType == type2 || rawType == AbstractList.class) {
                cls2 = Long.class;
                cls3 = ArrayList.class;
            } else {
                cls3 = ArrayList.class;
                if (rawType != cls3 && rawType != Stack.class) {
                    if (rawType == Queue.class || rawType == Deque.class || rawType == AbstractSequentialList.class) {
                        cls4 = Long.class;
                        cls5 = LinkedList.class;
                    } else {
                        cls5 = LinkedList.class;
                        if (rawType == cls5) {
                            cls4 = Long.class;
                        } else {
                            if (rawType == Set.class || rawType == AbstractSet.class || rawType == EnumSet.class) {
                                return mapping == String.class ? new ObjectReaderImplListStr((Class) rawType, HashSet.class) : mapping == Long.class ? new ObjectReaderImplListInt64((Class) rawType, HashSet.class) : ObjectReaderImplList.m1726of(type, null, 0L);
                            }
                            if (rawType == NavigableSet.class || rawType == SortedSet.class) {
                                return type5 == String.class ? new ObjectReaderImplListStr((Class) rawType, TreeSet.class) : mapping == Long.class ? new ObjectReaderImplListInt64((Class) rawType, TreeSet.class) : ObjectReaderImplList.m1726of(type, null, 0L);
                            }
                            if (rawType == ConcurrentLinkedQueue.class || rawType == ConcurrentSkipListSet.class || rawType == LinkedHashSet.class || rawType == HashSet.class || rawType == TreeSet.class || rawType == CopyOnWriteArrayList.class) {
                                if (type5 == String.class) {
                                    Class cls11 = (Class) rawType;
                                    return new ObjectReaderImplListStr(cls11, cls11);
                                }
                                if (mapping != Long.class) {
                                    return ObjectReaderImplList.m1726of(type, null, 0L);
                                }
                                Class cls12 = (Class) rawType;
                                return new ObjectReaderImplListInt64(cls12, cls12);
                            }
                            if (rawType == Optional.class) {
                                return ObjectReaderImplOptional.m1735of(type, null, null);
                            }
                            if (rawType == AtomicReference.class) {
                                return new ObjectReaderImplAtomicReference(type5);
                            }
                            if (type5 instanceof WildcardType) {
                                return getObjectReaderModule(rawType);
                            }
                        }
                    }
                    return mapping == String.class ? new ObjectReaderImplListStr((Class) rawType, cls5) : mapping == cls4 ? new ObjectReaderImplListInt64((Class) rawType, cls5) : ObjectReaderImplList.m1726of(type, null, 0L);
                }
                cls2 = Long.class;
            }
            return mapping == String.class ? new ObjectReaderImplListStr((Class) rawType, cls3) : mapping == cls2 ? new ObjectReaderImplListInt64((Class) rawType, cls3) : ObjectReaderImplList.m1726of(type, null, 0L);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public Function getTypeConvert(Type type, Type type2) {
        ConcurrentMap<Type, Map<Type, Function>> concurrentMapBuildInitTypeConverts = this.typeConverts;
        if (concurrentMapBuildInitTypeConverts == null) {
            concurrentMapBuildInitTypeConverts = buildInitTypeConverts();
            this.typeConverts = concurrentMapBuildInitTypeConverts;
        }
        Map<Type, Function> map = concurrentMapBuildInitTypeConverts.get(type);
        if (map == null) {
            return null;
        }
        return map.get(type2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void mixIn(Class cls, Class cls2) {
        ConcurrentMap<Class, Class> concurrentMap = this.mixInCache;
        if (cls2 == null) {
            concurrentMap.remove(cls);
        } else {
            concurrentMap.put(cls, cls2);
        }
        this.cache.remove(cls);
        this.cacheFieldBased.remove(cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader register(Type type, ObjectReader objectReader) {
        ConcurrentMap<Type, ObjectReader> concurrentMap = this.cache;
        return objectReader == null ? concurrentMap.remove(type) : concurrentMap.put(type, objectReader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader registerIfAbsent(Type type, ObjectReader objectReader) {
        boolean zContainsKey = this.cache.containsKey(type);
        ConcurrentMap<Type, ObjectReader> concurrentMap = this.cache;
        return zContainsKey ? concurrentMap.get(type) : concurrentMap.put(type, objectReader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void registerSeeAlsoSubType(Class cls, String str) {
        ObjectReaderSeeAlso objectReaderSeeAlso;
        ObjectReaderSeeAlso objectReaderSeeAlsoAddSubType;
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            C0086a.m464w("superclass is null");
            return;
        }
        ObjectReader objectReader = getObjectReader(superclass);
        if (!(objectReader instanceof ObjectReaderSeeAlso) || (objectReaderSeeAlsoAddSubType = (objectReaderSeeAlso = (ObjectReaderSeeAlso) objectReader).addSubType(cls, str)) == objectReaderSeeAlso) {
            return;
        }
        if (this.cache.containsKey(superclass)) {
            this.cache.put(superclass, objectReaderSeeAlsoAddSubType);
        } else {
            this.cacheFieldBased.put(cls, objectReaderSeeAlsoAddSubType);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAutoTypeBeforeHandler(JSONReader.AutoTypeBeforeHandler autoTypeBeforeHandler) {
        this.autoTypeBeforeHandler = autoTypeBeforeHandler;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public void setAutoTypeHandler(Consumer<Class> consumer) {
        this.autoTypeHandler = consumer;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ObjectReader unregisterObjectReader(Type type) {
        return this.cache.remove(type);
    }

    public boolean unregisterObjectReader(Type type, ObjectReader objectReader) {
        return this.cache.remove(type, objectReader);
    }

    public void registerIfAbsent(long j3, ObjectReader objectReader) {
        this.hashCache.put(Long.valueOf(j3), objectReader);
    }

    public void init() {
    }

    private void processSeeAlsoAnnotation(BeanInfo beanInfo, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            BeanUtils.annotationMethods(annotation.annotationType(), new C0628g(annotation, beanInfo, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$buildInitTypeConverts$0(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$buildInitTypeConverts$1(Object obj) {
        return obj;
    }

    public void registerSeeAlsoSubType(Class cls) {
        registerSeeAlsoSubType(cls, null);
    }

    public ObjectReaderProvider(ObjectReaderCreator objectReaderCreator) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.hashCache = concurrentHashMap;
        this.mixInCache = new ConcurrentHashMap();
        this.autoTypeList = new LRUAutoTypeCache(1024);
        this.denyHashCodes = new long[]{-9164606388214699518L, -8754006975464705441L, -8720046426850100497L, -8649961213709896794L, -8614556368991373401L, -8382625455832334425L, -8165637398350707645L, -8109300701639721088L, -7966123100503199569L, -7921218830998286408L, -7775351613326101303L, -7768608037458185275L, -7766605818834748097L, -6835437086156813536L, -6316154655839304624L, -6179589609550493385L, -6149130139291498841L, -6149093380703242441L, -6088208984980396913L, -6025144546313590215L, -5939269048541779808L, -5885964883385605994L, -5767141746063564198L, -5764804792063216819L, -5472097725414717105L, -5194641081268104286L, -5076846148177416215L, -4837536971810737970L, -4836620931940850535L, -4733542790109620528L, -4703320437989596122L, -4608341446948126581L, -4537258998789938600L, -4438775680185074100L, -4314457471973557243L, -4150995715611818742L, -4082057040235125754L, -3975378478825053783L, -3967588558552655563L, -3935185854875733362L, -3319207949486691020L, -3077205613010077203L, -3053747177772160511L, -2995060141064716555L, -2825378362173150292L, -2533039401923731906L, -2439930098895578154L, -2378990704010641148L, -2364987994247679115L, -2262244760619952081L, -2192804397019347313L, -2095516571388852610L, -1872417015366588117L, -1650485814983027158L, -1589194880214235129L, -965955008570215305L, -905177026366752536L, -831789045734283466L, -803541446955902575L, -731978084025273882L, -666475508176557463L, -582813228520337988L, -254670111376247151L, -219577392946377768L, -190281065685395680L, -26639035867733124L, -9822483067882491L, 4750336058574309L, 33238344207745342L, 156405680656087946L, 218512992947536312L, 313864100207897507L, 386461436234701831L, 744602970950881621L, 823641066473609950L, 1073634739308289776L, 1153291637701043748L, 1203232727967308606L, 1214780596910349029L, 1268707909007641340L, 1459860845934817624L, 1502845958873959152L, 1534439610567445754L, 1698504441317515818L, 1818089308493370394L, 2078113382421334967L, 2164696723069287854L, 2622551729063269307L, 2653453629929770569L, 2660670623866180977L, 2731823439467737506L, 2836431254737891113L, 2930861374593775110L, 3058452313624178956L, 3085473968517218653L, 3089451460101527857L, 3114862868117605599L, 3129395579983849527L, 3256258368248066264L, 3452379460455804429L, 3547627781654598988L, 3637939656440441093L, 3688179072722109200L, 3718352661124136681L, 3730752432285826863L, 3740226159580918099L, 3794316665763266033L, 3977090344859527316L, 4000049462512838776L, 4046190361520671643L, 4147696707147271408L, 4193204392725694463L, 4215053018660518963L, 4241163808635564644L, 4254584350247334433L, 4814658433570175913L, 4841947709850912914L, 4904007817188630457L, 5100336081510080343L, 5120543992130540564L, 5274044858141538265L, 5347909877633654828L, 5450448828334921485L, 5474268165959054640L, 5545425291794704408L, 5596129856135573697L, 5688200883751798389L, 5751393439502795295L, 5916409771425455946L, 5944107969236155580L, 6007332606592876737L, 6090377589998869205L, 6280357960959217660L, 6456855723474196908L, 6511035576063254270L, 6534946468240507089L, 6584624952928234050L, 6734240326434096246L, 6742705432718011780L, 6800727078373023163L, 6854854816081053523L, 7045245923763966215L, 7123326897294507060L, 7164889056054194741L, 7179336928365889465L, 7240293012336844478L, 7347653049056829645L, 7375862386996623731L, 7442624256860549330L, 7617522210483516279L, 7658177784286215602L, 8055461369741094911L, 8064026652676081192L, 8389032537095247355L, 8488266005336625107L, 8537233257283452655L, 8735538376409180149L, 8838294710098435315L, 8861402923078831179L, 9140390920032557669L, 9140416208800006522L, 9144212112462101475L};
        this.acceptHashCodes = new long[]{-6293031534589903644L};
        concurrentHashMap.put(Long.valueOf(ObjectArrayReader.TYPE_HASH_CODE), ObjectArrayReader.INSTANCE);
        concurrentHashMap.put(-4834614249632438472L, ObjectReaderImplString.INSTANCE);
        concurrentHashMap.put(77L, ObjectReaderImplMap.INSTANCE);
        this.creator = objectReaderCreator;
        init();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[PHI: r3
  0x002e: PHI (r3v2 boolean) = (r3v1 boolean), (r3v7 boolean) binds: [B:8:0x001f, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void getCreator(BeanInfo beanInfo, Class<?> cls, Constructor constructor) {
        Constructor<?> declaredConstructor;
        if (cls.isEnum()) {
            return;
        }
        boolean z9 = false;
        for (Annotation annotation : constructor.getDeclaredAnnotations()) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            JSONCreator jSONCreator = (JSONCreator) BeanUtils.findAnnotation(annotation, JSONCreator.class);
            int i9 = 1;
            if (jSONCreator != null) {
                String[] strArrParameterNames = jSONCreator.parameterNames();
                if (strArrParameterNames.length != 0) {
                    beanInfo.createParameterNames = strArrParameterNames;
                }
                z9 = true;
                if (jSONCreator != annotation) {
                    String name = clsAnnotationType.getName();
                    if (name.equals("com.alibaba.fastjson.annotation.JSONCreator") || name.equals("com.alibaba.fastjson2.annotation.JSONCreator")) {
                        BeanUtils.annotationMethods(clsAnnotationType, new C0628g(annotation, beanInfo, i9));
                        z9 = true;
                    }
                }
            }
        }
        if (z9) {
            try {
                declaredConstructor = cls.getDeclaredConstructor(constructor.getParameterTypes());
            } catch (NoSuchMethodException unused) {
                declaredConstructor = null;
            }
            if (declaredConstructor != null) {
                beanInfo.creatorConstructor = declaredConstructor;
            }
        }
    }

    public ObjectReaderCreator getCreator() {
        return this.creator;
    }

    public void cleanup(Class cls) {
        this.mixInCache.remove(cls);
        this.cache.remove(cls);
        this.cacheFieldBased.remove(cls);
        BeanUtils.cleanupCache(cls);
    }

    private void getBeanInfo(BeanInfo beanInfo, Annotation[] annotationArr) {
        for (Annotation annotation : annotationArr) {
            annotation.annotationType();
            if (((JSONType) BeanUtils.findAnnotation(annotation, JSONType.class)) != null) {
                getBeanInfo1x(beanInfo, annotation);
            }
        }
    }

    public ObjectReader getObjectReader(String str, Class<?> cls, long j3) {
        Class<?> clsCheckAutoType = checkAutoType(str, cls, j3);
        if (clsCheckAutoType == null) {
            return null;
        }
        ObjectReader objectReader = getObjectReader(clsCheckAutoType, (j3 & JSONReader.Feature.FieldBased.mask) != 0);
        if (clsCheckAutoType != cls) {
            registerIfAbsent(Fnv.hashCode64(str), objectReader);
        }
        return objectReader;
    }

    public ObjectReader getObjectReader(Type type) {
        return getObjectReader(type, false);
    }

    public ObjectReader getObjectReader(long j3) {
        ObjectReaderCachePair objectReaderCachePair = readerCache;
        if (objectReaderCachePair != null) {
            if (objectReaderCachePair.hashCode == j3) {
                return objectReaderCachePair.reader;
            }
            int i9 = objectReaderCachePair.missCount;
            objectReaderCachePair.missCount = i9 + 1;
            if (i9 > 16) {
                readerCache = null;
            }
        }
        ObjectReader objectReader = this.hashCache.get(new Long(j3));
        if (objectReader != null && readerCache == null) {
            readerCache = new ObjectReaderCachePair(j3, objectReader);
        }
        return objectReader;
    }

    public void getFieldInfo(FieldInfo fieldInfo, Class cls, Method method, int i9) {
        Class cls2;
        Method method2;
        if (cls != null && (cls2 = this.mixInCache.get(cls)) != null && cls2 != cls) {
            try {
                method2 = cls2.getMethod(method.getName(), method.getParameterTypes());
            } catch (NoSuchMethodException unused) {
                method2 = null;
            }
            if (method2 != null) {
                processAnnotation(fieldInfo, method2.getParameterAnnotations()[i9]);
            }
        }
        processAnnotation(fieldInfo, method.getParameterAnnotations()[i9]);
    }

    public void getFieldInfo(FieldInfo fieldInfo, Class cls, Field field) {
        Class cls2;
        Field declaredField;
        if (cls != null && (cls2 = this.mixInCache.get(cls)) != null && cls2 != cls) {
            try {
                declaredField = cls2.getDeclaredField(field.getName());
            } catch (Exception unused) {
                declaredField = null;
            }
            if (declaredField != null) {
                getFieldInfo(fieldInfo, cls2, declaredField);
            }
        }
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations.length > 0) {
            processAnnotation(fieldInfo, declaredAnnotations);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0076 A[PHI: r5
  0x0076: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v4 java.lang.String) binds: [B:32:0x006a, B:34:0x0073] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getFieldInfo(FieldInfo fieldInfo, Class cls, Method method) {
        String str;
        String str2;
        String str3;
        char cCharAt;
        char cCharAt2;
        Method declaredMethod;
        Method method2;
        Method method3;
        String name = method.getName();
        if (cls != null) {
            Class superclass = cls.getSuperclass();
            if (superclass != Object.class && superclass != null && (method3 = BeanUtils.getMethod(superclass, method)) != null) {
                getFieldInfo(fieldInfo, superclass, method3);
            }
            for (Class<?> cls2 : cls.getInterfaces()) {
                if (cls2 != Serializable.class && (method2 = BeanUtils.getMethod(cls2, method)) != null && superclass != null) {
                    getFieldInfo(fieldInfo, superclass, method2);
                }
            }
            Class cls3 = this.mixInCache.get(cls);
            if (cls3 != null && cls3 != cls) {
                try {
                    declaredMethod = cls3.getDeclaredMethod(name, method.getParameterTypes());
                } catch (Exception unused) {
                    declaredMethod = null;
                }
                if (declaredMethod != null) {
                    getFieldInfo(fieldInfo, cls3, declaredMethod);
                }
            }
        }
        String strName = null;
        for (Annotation annotation : method.getDeclaredAnnotations()) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            JSONField jSONField = (JSONField) BeanUtils.findAnnotation(annotation, JSONField.class);
            if (jSONField != null) {
                getFieldInfo(fieldInfo, jSONField);
                strName = jSONField.name();
                if (jSONField != annotation) {
                    if (clsAnnotationType.getName().equals("com.alibaba.fastjson.annotation.JSONField")) {
                        processJSONField1x(fieldInfo, annotation);
                    }
                }
            }
        }
        if (name.startsWith("set", 0)) {
            str = BeanUtils.setterName(name, (String) null);
        } else {
            str = BeanUtils.getterName(name, null);
        }
        String str4 = str;
        if (str4.length() <= 1 || (cCharAt = str4.charAt(0)) < 'A' || cCharAt > 'Z' || (cCharAt2 = str4.charAt(1)) < 'A' || cCharAt2 > 'Z' || !(strName == null || strName.isEmpty())) {
            str2 = null;
            str3 = null;
        } else {
            char[] charArray = str4.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            String str5 = new String(charArray);
            charArray[1] = (char) (charArray[1] + ' ');
            str3 = new String(charArray);
            str2 = str5;
        }
        BeanUtils.getFieldInfo(cls, fieldInfo, this, str4, str2, str3);
        String str6 = str2;
        String str7 = str3;
        if (str6 != null && fieldInfo.fieldName == null && fieldInfo.alternateNames == null) {
            fieldInfo.alternateNames = new String[]{str6, str7};
        }
    }

    public void getFieldInfo(FieldInfo fieldInfo, Class cls, Constructor constructor, int i9, Annotation[][] annotationArr) {
        Class cls2;
        Constructor declaredConstructor;
        Annotation[] annotationArr2 = null;
        if (cls != null && (cls2 = this.mixInCache.get(cls)) != null && cls2 != cls) {
            try {
                declaredConstructor = cls2.getDeclaredConstructor(constructor.getParameterTypes());
            } catch (NoSuchMethodException unused) {
                declaredConstructor = null;
            }
            if (declaredConstructor != null) {
                processAnnotation(fieldInfo, declaredConstructor.getParameterAnnotations()[i9]);
            }
        }
        if (annotationArr == null) {
            annotationArr = constructor.getParameterAnnotations();
        }
        if (annotationArr.length != constructor.getParameterCount()) {
            i9--;
        }
        if (i9 >= 0 && i9 < annotationArr.length) {
            annotationArr2 = annotationArr[i9];
        }
        if (annotationArr2 == null || annotationArr2.length <= 0) {
            return;
        }
        processAnnotation(fieldInfo, annotationArr2);
    }
}
