package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import bsh.C2633;
import com.alibaba.fastjson2.C2942;
import com.alibaba.fastjson2.reader.C2700;
import com.google.protobuf.DescriptorProtos$Edition;
import com.typesafe.config.C3865;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAmount;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import p250.C8164;
import p250.InterfaceC8161;
import p250.InterfaceC8162;
import p250.InterfaceC8163;
import p250.InterfaceC8165;
import p250.InterfaceC8166;
import p250.InterfaceC8167;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class SimpleConfig implements InterfaceC8166, InterfaceC3857, Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = 1;
    private final AbstractC3846 object;

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public enum MemoryUnit {
        BYTES("", 1024, 0),
        KILOBYTES("kilo", DescriptorProtos$Edition.EDITION_2023_VALUE, 1),
        MEGABYTES("mega", DescriptorProtos$Edition.EDITION_2023_VALUE, 2),
        GIGABYTES("giga", DescriptorProtos$Edition.EDITION_2023_VALUE, 3),
        TERABYTES("tera", DescriptorProtos$Edition.EDITION_2023_VALUE, 4),
        PETABYTES("peta", DescriptorProtos$Edition.EDITION_2023_VALUE, 5),
        EXABYTES("exa", DescriptorProtos$Edition.EDITION_2023_VALUE, 6),
        ZETTABYTES("zetta", DescriptorProtos$Edition.EDITION_2023_VALUE, 7),
        YOTTABYTES("yotta", DescriptorProtos$Edition.EDITION_2023_VALUE, 8),
        KIBIBYTES("kibi", 1024, 1),
        MEBIBYTES("mebi", 1024, 2),
        GIBIBYTES("gibi", 1024, 3),
        TEBIBYTES("tebi", 1024, 4),
        PEBIBYTES("pebi", 1024, 5),
        EXBIBYTES("exbi", 1024, 6),
        ZEBIBYTES("zebi", 1024, 7),
        YOBIBYTES("yobi", 1024, 8);

        private static Map<String, MemoryUnit> unitsMap = makeUnitsMap();
        final BigInteger bytes;
        final int power;
        final int powerOf;
        final String prefix;

        MemoryUnit(String str, int i, int i2) {
            this.prefix = str;
            this.powerOf = i;
            this.power = i2;
            this.bytes = BigInteger.valueOf(i).pow(i2);
        }

        private static Map<String, MemoryUnit> makeUnitsMap() {
            HashMap map = new HashMap();
            for (MemoryUnit memoryUnit : values()) {
                map.put(memoryUnit.prefix + "byte", memoryUnit);
                map.put(memoryUnit.prefix + "bytes", memoryUnit);
                if (memoryUnit.prefix.length() == 0) {
                    map.put("b", memoryUnit);
                    map.put("B", memoryUnit);
                    map.put("", memoryUnit);
                } else {
                    String strSubstring = memoryUnit.prefix.substring(0, 1);
                    String upperCase = strSubstring.toUpperCase();
                    int i = memoryUnit.powerOf;
                    if (i == 1024) {
                        map.put(strSubstring, memoryUnit);
                        map.put(upperCase, memoryUnit);
                        map.put(upperCase + "i", memoryUnit);
                        map.put(upperCase + "iB", memoryUnit);
                    } else {
                        if (i != 1000) {
                            C2633.m5339("broken MemoryUnit enum");
                            return null;
                        }
                        if (memoryUnit.power == 1) {
                            map.put(strSubstring.concat("B"), memoryUnit);
                        } else {
                            map.put(upperCase + "B", memoryUnit);
                        }
                    }
                }
            }
            return map;
        }

        public static MemoryUnit parseUnit(String str) {
            return unitsMap.get(str);
        }
    }

    public SimpleConfig(AbstractC3846 abstractC3846) {
        this.object = abstractC3846;
    }

    private static void addMissing(List<ConfigException.ValidationProblem> list, String str, C3858 c3858, InterfaceC8161 interfaceC8161) {
        addProblem(list, c3858, interfaceC8161, "No setting at '" + c3858.m8236() + "', expecting: " + str);
    }

    private static void addProblem(List<ConfigException.ValidationProblem> list, C3858 c3858, InterfaceC8161 interfaceC8161, String str) {
        list.add(new ConfigException.ValidationProblem(c3858.m8236(), interfaceC8161, str));
    }

    private static void addWrongType(List<ConfigException.ValidationProblem> list, String str, AbstractC3843 abstractC3843, C3858 c3858) {
        addProblem(list, c3858, abstractC3843.origin(), "Wrong value type at '" + c3858.m8236() + "', expecting: " + str + " but got: " + getDesc(abstractC3843));
    }

    private static void checkListCompatibility(C3858 c3858, SimpleConfigList simpleConfigList, SimpleConfigList simpleConfigList2, List<ConfigException.ValidationProblem> list) {
        if (simpleConfigList.isEmpty() || simpleConfigList2.isEmpty()) {
            return;
        }
        AbstractC3843 abstractC3843 = simpleConfigList.get(0);
        Iterator<InterfaceC8167> it = simpleConfigList2.iterator();
        while (it.hasNext()) {
            AbstractC3843 abstractC38432 = (AbstractC3843) it.next();
            if (!haveCompatibleTypes(abstractC3843, abstractC38432)) {
                addProblem(list, c3858, abstractC38432.origin(), "List at '" + c3858.m8236() + "' contains wrong value type, expecting list of " + getDesc(abstractC3843) + " but got element of type " + getDesc(abstractC38432));
                return;
            }
        }
    }

    private static void checkValidObject(C3858 c3858, AbstractC3846 abstractC3846, AbstractC3846 abstractC38462, List<ConfigException.ValidationProblem> list) {
        for (Map.Entry entry : abstractC3846.entrySet()) {
            String str = (String) entry.getKey();
            C3858 c38582 = null;
            if (c3858 != null) {
                Stack stack = new Stack();
                String str2 = c3858.f12086;
                C3858 c38583 = c3858.f12085;
                while (true) {
                    stack.push(str2);
                    if (c38583 == null) {
                        break;
                    }
                    str2 = c38583.f12086;
                    c38583 = c38583.f12085;
                }
                String str3 = str;
                C3858 c38584 = null;
                while (true) {
                    stack.push(str3);
                    if (c38584 == null) {
                        break;
                    }
                    str3 = c38584.f12086;
                    c38584 = c38584.f12085;
                }
                while (!stack.isEmpty()) {
                    c38582 = new C3858((String) stack.pop(), c38582);
                }
            } else {
                c38582 = new C3858(str, null);
            }
            AbstractC3843 abstractC3843 = abstractC38462.get((Object) str);
            if (abstractC3843 == null) {
                addMissing(list, (InterfaceC8167) entry.getValue(), c38582, abstractC38462.origin());
            } else {
                checkValid(c38582, (InterfaceC8167) entry.getValue(), abstractC3843, list);
            }
        }
    }

    private static boolean couldBeNull(AbstractC3843 abstractC3843) {
        ConfigValueType configValueType = ConfigValueType.NULL;
        return AbstractC3854.m8230(configValueType, abstractC3843).valueType() == configValueType;
    }

    private static AbstractC3843 findKey(AbstractC3846 abstractC3846, String str, ConfigValueType configValueType, C3858 c3858) {
        return throwIfNull(findKeyOrNull(abstractC3846, str, configValueType, c3858), configValueType, c3858);
    }

    private static AbstractC3843 findKeyOrNull(AbstractC3846 abstractC3846, String str, ConfigValueType configValueType, C3858 c3858) {
        AbstractC3843 abstractC3843PeekAssumingResolved = abstractC3846.peekAssumingResolved(str, c3858);
        if (abstractC3843PeekAssumingResolved == null) {
            throw new ConfigException.Missing(abstractC3846.origin(), c3858.m8236());
        }
        if (configValueType != null) {
            abstractC3843PeekAssumingResolved = AbstractC3854.m8230(configValueType, abstractC3843PeekAssumingResolved);
        }
        if (configValueType == null || abstractC3843PeekAssumingResolved.valueType() == configValueType || abstractC3843PeekAssumingResolved.valueType() == ConfigValueType.NULL) {
            return abstractC3843PeekAssumingResolved;
        }
        throw new ConfigException.WrongType(abstractC3843PeekAssumingResolved.origin(), c3858.m8236(), configValueType.name(), abstractC3843PeekAssumingResolved.valueType().name());
    }

    private static AbstractC3843 findOrNull(AbstractC3846 abstractC3846, C3858 c3858, ConfigValueType configValueType, C3858 c38582) {
        try {
            String str = c3858.f12086;
            C3858 c38583 = c3858.f12085;
            if (c38583 == null) {
                return findKeyOrNull(abstractC3846, str, configValueType, c38582);
            }
            ConfigValueType configValueType2 = ConfigValueType.OBJECT;
            int i = 1;
            int i2 = 1;
            for (C3858 c38584 = c38582.f12085; c38584 != null; c38584 = c38584.f12085) {
                i2++;
            }
            for (C3858 c38585 = c38583.f12085; c38585 != null; c38585 = c38585.f12085) {
                i++;
            }
            return findOrNull((AbstractC3846) findKey(abstractC3846, str, configValueType2, c38582.m8235(i2 - i)), c38583, configValueType, c38582);
        } catch (ConfigException.NotResolved e) {
            throw AbstractC3863.m8243(c3858, e);
        }
    }

    private static void findPaths(Set<Map.Entry<String, InterfaceC8167>> set, C3858 c3858, AbstractC3846 abstractC3846) {
        for (Map.Entry entry : abstractC3846.entrySet()) {
            String str = (String) entry.getKey();
            InterfaceC8167 interfaceC8167 = (InterfaceC8167) entry.getValue();
            C3858 c38582 = new C3858(str, null);
            if (c3858 != null) {
                Stack stack = new Stack();
                String str2 = c3858.f12086;
                C3858 c38583 = c3858.f12085;
                while (true) {
                    stack.push(str2);
                    if (c38583 == null) {
                        break;
                    }
                    str2 = c38583.f12086;
                    c38583 = c38583.f12085;
                }
                String str3 = c38582.f12086;
                C3858 c38584 = c38582.f12085;
                while (true) {
                    stack.push(str3);
                    if (c38584 == null) {
                        break;
                    }
                    str3 = c38584.f12086;
                    c38584 = c38584.f12085;
                }
                c38582 = null;
                while (!stack.isEmpty()) {
                    c38582 = new C3858((String) stack.pop(), c38582);
                }
            }
            if (interfaceC8167 instanceof AbstractC3846) {
                findPaths(set, c38582, (AbstractC3846) interfaceC8167);
            } else if (!(interfaceC8167 instanceof ConfigNull)) {
                set.add(new AbstractMap.SimpleImmutableEntry(c38582.m8236(), interfaceC8167));
            }
        }
    }

    private BigInteger getBytesBigInteger(String str) {
        BigInteger bytes;
        AbstractC3843 abstractC3843Find = find(str, ConfigValueType.STRING);
        try {
            bytes = BigInteger.valueOf(getLong(str));
        } catch (ConfigException.WrongType unused) {
            bytes = parseBytes((String) abstractC3843Find.unwrapped(), abstractC3843Find.origin(), str);
        }
        if (bytes.signum() >= 0) {
            return bytes;
        }
        throw new ConfigException.BadValue(abstractC3843Find.origin(), str, "Attempt to construct memory size with negative number: " + bytes);
    }

    private List<BigInteger> getBytesListBigInteger(String str) {
        BigInteger bytes;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC8167 interfaceC8167 : getList(str)) {
            if (interfaceC8167.valueType() == ConfigValueType.NUMBER) {
                bytes = BigInteger.valueOf(((Number) interfaceC8167.unwrapped()).longValue());
            } else {
                if (interfaceC8167.valueType() != ConfigValueType.STRING) {
                    throw new ConfigException.WrongType(interfaceC8167.origin(), str, "memory size string or number of bytes", interfaceC8167.valueType().name());
                }
                bytes = parseBytes((String) interfaceC8167.unwrapped(), interfaceC8167.origin(), str);
            }
            if (bytes.signum() < 0) {
                throw new ConfigException.BadValue(interfaceC8167.origin(), str, "Attempt to construct ConfigMemorySize with negative number: " + bytes);
            }
            arrayList.add(bytes);
        }
        return arrayList;
    }

    private ConfigNumber getConfigNumber(String str) {
        return (ConfigNumber) find(str, ConfigValueType.NUMBER);
    }

    private static String getDesc(InterfaceC8167 interfaceC8167) {
        if (!(interfaceC8167 instanceof AbstractC3846)) {
            return getDesc(interfaceC8167.valueType());
        }
        AbstractC3846 abstractC3846 = (AbstractC3846) interfaceC8167;
        if (abstractC3846.isEmpty()) {
            return getDesc(interfaceC8167.valueType());
        }
        return "object with keys " + abstractC3846.keySet();
    }

    private <T extends Enum<T>> T getEnumValue(String str, Class<T> cls, InterfaceC8167 interfaceC8167) {
        String str2 = (String) interfaceC8167.unwrapped();
        try {
            return (T) Enum.valueOf(cls, str2);
        } catch (IllegalArgumentException unused) {
            ArrayList arrayList = new ArrayList();
            T[] enumConstants = cls.getEnumConstants();
            if (enumConstants != null) {
                for (T t : enumConstants) {
                    arrayList.add(t.name());
                }
            }
            throw new ConfigException.BadValue(interfaceC8167.origin(), str, String.format("The enum class %s has no constant of the name '%s' (should be one of %s.)", cls.getSimpleName(), str2, arrayList));
        }
    }

    private <T> List<T> getHomogeneousUnwrappedList(String str, ConfigValueType configValueType) {
        ArrayList arrayList = new ArrayList();
        Iterator it = getList(str).iterator();
        while (it.hasNext()) {
            AbstractC3843 abstractC3843M8230 = (AbstractC3843) ((InterfaceC8167) it.next());
            if (configValueType != null) {
                abstractC3843M8230 = AbstractC3854.m8230(configValueType, abstractC3843M8230);
            }
            if (abstractC3843M8230.valueType() != configValueType) {
                throw new ConfigException.WrongType(abstractC3843M8230.origin(), str, "list of " + configValueType.name(), "list of " + abstractC3843M8230.valueType().name());
            }
            arrayList.add(abstractC3843M8230.unwrapped());
        }
        return arrayList;
    }

    private <T extends InterfaceC8167> List<T> getHomogeneousWrappedList(String str, ConfigValueType configValueType) {
        ArrayList arrayList = new ArrayList();
        Iterator it = getList(str).iterator();
        while (it.hasNext()) {
            AbstractC3843 abstractC3843M8230 = (AbstractC3843) ((InterfaceC8167) it.next());
            if (configValueType != null) {
                abstractC3843M8230 = AbstractC3854.m8230(configValueType, abstractC3843M8230);
            }
            if (abstractC3843M8230.valueType() != configValueType) {
                throw new ConfigException.WrongType(abstractC3843M8230.origin(), str, "list of " + configValueType.name(), "list of " + abstractC3843M8230.valueType().name());
            }
            arrayList.add(abstractC3843M8230);
        }
        return arrayList;
    }

    private static String getUnits(String str) {
        int length = str.length() - 1;
        while (length >= 0 && Character.isLetter(str.charAt(length))) {
            length--;
        }
        return str.substring(length + 1);
    }

    private InterfaceC8167 hasPathPeek(String str) {
        C3858 c3858M8234 = C3858.m8234(str);
        try {
            return this.object.peekPath(c3858M8234);
        } catch (ConfigException.NotResolved e) {
            throw AbstractC3863.m8243(c3858M8234, e);
        }
    }

    private static boolean haveCompatibleTypes(ConfigValueType configValueType, AbstractC3843 abstractC3843) {
        if (configValueType == ConfigValueType.NULL || couldBeNull(abstractC3843)) {
            return true;
        }
        return configValueType == ConfigValueType.OBJECT ? abstractC3843 instanceof AbstractC3846 : configValueType == ConfigValueType.LIST ? (abstractC3843 instanceof SimpleConfigList) || (abstractC3843 instanceof SimpleConfigObject) : configValueType == ConfigValueType.STRING || (abstractC3843 instanceof ConfigString) || configValueType == abstractC3843.valueType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$getBytesList$0(InterfaceC8167 interfaceC8167, String str, BigInteger bigInteger) {
        return toLong(bigInteger, interfaceC8167.origin(), str);
    }

    public static BigInteger parseBytes(String str, InterfaceC8161 interfaceC8161, String str2) {
        String strM8245 = AbstractC3864.m8245(str);
        String units = getUnits(strM8245);
        String strM82452 = AbstractC3864.m8245(strM8245.substring(0, strM8245.length() - units.length()));
        if (strM82452.length() == 0) {
            throw new ConfigException.BadValue(interfaceC8161, str2, AbstractC0053.m158("No number in size-in-bytes value '", str, "'"));
        }
        MemoryUnit unit = MemoryUnit.parseUnit(units);
        if (unit == null) {
            throw new ConfigException.BadValue(interfaceC8161, str2, AbstractC0053.m158("Could not parse size-in-bytes unit '", units, "' (try k, K, kB, KiB, kilobytes, kibibytes)"));
        }
        try {
            return strM82452.matches("[0-9]+") ? unit.bytes.multiply(new BigInteger(strM82452)) : new BigDecimal(unit.bytes).multiply(new BigDecimal(strM82452)).toBigInteger();
        } catch (NumberFormatException unused) {
            throw new ConfigException.BadValue(interfaceC8161, str2, AbstractC0053.m158("Could not parse size-in-bytes number '", strM82452, "'"));
        }
    }

    public static long parseDuration(String str, InterfaceC8161 interfaceC8161, String str2) {
        TimeUnit timeUnit;
        String strM8245 = AbstractC3864.m8245(str);
        String units = getUnits(strM8245);
        String strM82452 = AbstractC3864.m8245(strM8245.substring(0, strM8245.length() - units.length()));
        if (strM82452.length() == 0) {
            throw new ConfigException.BadValue(interfaceC8161, str2, AbstractC0053.m158("No number in duration value '", str, "'"));
        }
        String strConcat = (units.length() <= 2 || units.endsWith("s")) ? units : units.concat("s");
        if (strConcat.equals("") || strConcat.equals("ms") || strConcat.equals("millis") || strConcat.equals("milliseconds")) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (strConcat.equals("us") || strConcat.equals("micros") || strConcat.equals("microseconds")) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else if (strConcat.equals("ns") || strConcat.equals("nanos") || strConcat.equals("nanoseconds")) {
            timeUnit = TimeUnit.NANOSECONDS;
        } else if (strConcat.equals("d") || strConcat.equals("days")) {
            timeUnit = TimeUnit.DAYS;
        } else if (strConcat.equals("h") || strConcat.equals("hours")) {
            timeUnit = TimeUnit.HOURS;
        } else if (strConcat.equals("s") || strConcat.equals("seconds")) {
            timeUnit = TimeUnit.SECONDS;
        } else {
            if (!strConcat.equals("m") && !strConcat.equals("minutes")) {
                throw new ConfigException.BadValue(interfaceC8161, str2, AbstractC0053.m158("Could not parse time unit '", units, "' (try ns, us, ms, s, m, h, d)"));
            }
            timeUnit = TimeUnit.MINUTES;
        }
        try {
            if (strM82452.matches("[+-]?[0-9]+")) {
                return timeUnit.toNanos(Long.parseLong(strM82452));
            }
            return (long) (Double.parseDouble(strM82452) * timeUnit.toNanos(serialVersionUID));
        } catch (NumberFormatException unused) {
            throw new ConfigException.BadValue(interfaceC8161, str2, AbstractC0053.m158("Could not parse duration number '", strM82452, "'"));
        }
    }

    public static Period parsePeriod(String str, InterfaceC8161 interfaceC8161, String str2) {
        ChronoUnit chronoUnit;
        String strM8245 = AbstractC3864.m8245(str);
        String units = getUnits(strM8245);
        String strM82452 = AbstractC3864.m8245(strM8245.substring(0, strM8245.length() - units.length()));
        if (strM82452.length() == 0) {
            throw new ConfigException.BadValue(interfaceC8161, str2, AbstractC0053.m158("No number in period value '", str, "'"));
        }
        String strConcat = (units.length() <= 2 || units.endsWith("s")) ? units : units.concat("s");
        if (strConcat.equals("") || strConcat.equals("d") || strConcat.equals("days")) {
            chronoUnit = ChronoUnit.DAYS;
        } else if (strConcat.equals("w") || strConcat.equals("weeks")) {
            chronoUnit = ChronoUnit.WEEKS;
        } else if (strConcat.equals("m") || strConcat.equals("mo") || strConcat.equals("months")) {
            chronoUnit = ChronoUnit.MONTHS;
        } else {
            if (!strConcat.equals("y") && !strConcat.equals("years")) {
                throw new ConfigException.BadValue(interfaceC8161, str2, AbstractC0053.m158("Could not parse time unit '", units, "' (try d, w, mo, y)"));
            }
            chronoUnit = ChronoUnit.YEARS;
        }
        try {
            return periodOf(Integer.parseInt(strM82452), chronoUnit);
        } catch (NumberFormatException unused) {
            throw new ConfigException.BadValue(interfaceC8161, str2, AbstractC0053.m158("Could not parse duration number '", strM82452, "'"));
        }
    }

    private AbstractC3843 peekPath(C3858 c3858) {
        return root().peekPath(c3858);
    }

    private static Period periodOf(int i, ChronoUnit chronoUnit) {
        if (chronoUnit.isTimeBased()) {
            throw new DateTimeException(chronoUnit + " cannot be converted to a java.time.Period");
        }
        int i2 = AbstractC3832.f12035[chronoUnit.ordinal()];
        if (i2 == 1) {
            return Period.ofDays(i);
        }
        if (i2 == 2) {
            return Period.ofWeeks(i);
        }
        if (i2 == 3) {
            return Period.ofMonths(i);
        }
        if (i2 == 4) {
            return Period.ofYears(i);
        }
        throw new DateTimeException(chronoUnit + " cannot be converted to a java.time.Period");
    }

    private static AbstractC3843 throwIfNull(AbstractC3843 abstractC3843, ConfigValueType configValueType, C3858 c3858) {
        if (abstractC3843.valueType() == ConfigValueType.NULL) {
            throw new ConfigException.Null(abstractC3843.origin(), c3858.m8236(), configValueType != null ? configValueType.name() : null);
        }
        return abstractC3843;
    }

    private Long toLong(BigInteger bigInteger, InterfaceC8161 interfaceC8161, String str) {
        if (bigInteger.bitLength() < 64) {
            return Long.valueOf(bigInteger.longValue());
        }
        throw new ConfigException.BadValue(interfaceC8161, str, "size-in-bytes value is out of range for a 64-bit long: '" + bigInteger + "'");
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    public SimpleConfig atKey(InterfaceC8161 interfaceC8161, String str) {
        return root().atKey(interfaceC8161, str);
    }

    public InterfaceC8166 atPath(String str) {
        return root().m8218atPath(str);
    }

    public void checkValid(InterfaceC8166 interfaceC8166, String... strArr) {
        SimpleConfig simpleConfig = (SimpleConfig) interfaceC8166;
        ResolveStatus resolveStatus = simpleConfig.root().resolveStatus();
        ResolveStatus resolveStatus2 = ResolveStatus.RESOLVED;
        if (resolveStatus != resolveStatus2) {
            C2942.m6408("do not call checkValid() with an unresolved reference config, call Config#resolve(), see Config#resolve() API docs");
            return;
        }
        if (root().resolveStatus() != resolveStatus2) {
            throw new ConfigException.NotResolved("need to Config#resolve() each config before using it, see the API docs for Config#resolve()");
        }
        ArrayList arrayList = new ArrayList();
        if (strArr.length == 0) {
            checkValidObject(null, simpleConfig.root(), root(), arrayList);
        } else {
            for (String str : strArr) {
                C3858 c3858M8234 = C3858.m8234(str);
                AbstractC3843 abstractC3843PeekPath = simpleConfig.peekPath(c3858M8234);
                if (abstractC3843PeekPath != null) {
                    AbstractC3843 abstractC3843PeekPath2 = peekPath(c3858M8234);
                    if (abstractC3843PeekPath2 != null) {
                        checkValid(c3858M8234, abstractC3843PeekPath, abstractC3843PeekPath2, arrayList);
                    } else {
                        addMissing(arrayList, abstractC3843PeekPath, c3858M8234, origin());
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            throw new ConfigException.ValidationFailed(arrayList);
        }
    }

    public Set<Map.Entry<String, InterfaceC8167>> entrySet() {
        HashSet hashSet = new HashSet();
        findPaths(hashSet, null, this.object);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SimpleConfig) {
            return this.object.equals(((SimpleConfig) obj).object);
        }
        return false;
    }

    public AbstractC3843 find(C3858 c3858, ConfigValueType configValueType, C3858 c38582) {
        return throwIfNull(findOrNull(this.object, c3858, configValueType, c38582), configValueType, c38582);
    }

    public Object getAnyRef(String str) {
        return find(str, null).unwrapped();
    }

    public List<? extends Object> getAnyRefList(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = getList(str).iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8167) it.next()).unwrapped());
        }
        return arrayList;
    }

    public boolean getBoolean(String str) {
        return ((Boolean) find(str, ConfigValueType.BOOLEAN).unwrapped()).booleanValue();
    }

    public List<Boolean> getBooleanList(String str) {
        return getHomogeneousUnwrappedList(str, ConfigValueType.BOOLEAN);
    }

    public Long getBytes(String str) {
        return toLong(getBytesBigInteger(str), find(str, ConfigValueType.STRING).origin(), str);
    }

    public List<Long> getBytesList(final String str) {
        final AbstractC3843 abstractC3843Find = find(str, ConfigValueType.LIST);
        return (List) getBytesListBigInteger(str).stream().map(new Function() { // from class: com.typesafe.config.impl.飘花落叶言子世楪苏兰哲
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f12038.lambda$getBytesList$0(abstractC3843Find, str, (BigInteger) obj);
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: renamed from: getConfig, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8177getConfig(String str) {
        return m8178getObject(str).toConfig();
    }

    public List<? extends InterfaceC8166> getConfigList(String str) {
        List<InterfaceC8162> objectList = getObjectList(str);
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC8162> it = objectList.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toConfig());
        }
        return arrayList;
    }

    public double getDouble(String str) {
        return getNumber(str).doubleValue();
    }

    public List<Double> getDoubleList(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<Number> it = getNumberList(str).iterator();
        while (it.hasNext()) {
            arrayList.add(Double.valueOf(it.next().doubleValue()));
        }
        return arrayList;
    }

    public long getDuration(String str, TimeUnit timeUnit) {
        AbstractC3843 abstractC3843Find = find(str, ConfigValueType.STRING);
        return timeUnit.convert(parseDuration((String) abstractC3843Find.unwrapped(), abstractC3843Find.origin(), str), TimeUnit.NANOSECONDS);
    }

    public List<Long> getDurationList(String str, TimeUnit timeUnit) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC8167 interfaceC8167 : getList(str)) {
            if (interfaceC8167.valueType() == ConfigValueType.NUMBER) {
                arrayList.add(Long.valueOf(timeUnit.convert(((Number) interfaceC8167.unwrapped()).longValue(), TimeUnit.MILLISECONDS)));
            } else {
                if (interfaceC8167.valueType() != ConfigValueType.STRING) {
                    throw new ConfigException.WrongType(interfaceC8167.origin(), str, "duration string or number of milliseconds", interfaceC8167.valueType().name());
                }
                arrayList.add(Long.valueOf(timeUnit.convert(parseDuration((String) interfaceC8167.unwrapped(), interfaceC8167.origin(), str), TimeUnit.NANOSECONDS)));
            }
        }
        return arrayList;
    }

    public <T extends Enum<T>> T getEnum(Class<T> cls, String str) {
        return (T) getEnumValue(str, cls, find(str, ConfigValueType.STRING));
    }

    public <T extends Enum<T>> List<T> getEnumList(Class<T> cls, String str) {
        List homogeneousWrappedList = getHomogeneousWrappedList(str, ConfigValueType.STRING);
        ArrayList arrayList = new ArrayList();
        Iterator it = homogeneousWrappedList.iterator();
        while (it.hasNext()) {
            arrayList.add(getEnumValue(str, cls, (ConfigString) it.next()));
        }
        return arrayList;
    }

    public int getInt(String str) {
        return getConfigNumber(str).intValueRangeChecked(str);
    }

    public List<Integer> getIntList(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = getHomogeneousWrappedList(str, ConfigValueType.NUMBER).iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((ConfigNumber) ((AbstractC3843) it.next())).intValueRangeChecked(str)));
        }
        return arrayList;
    }

    public boolean getIsNull(String str) {
        return findOrNull(str, null).valueType() == ConfigValueType.NULL;
    }

    public InterfaceC8165 getList(String str) {
        return (InterfaceC8165) find(str, ConfigValueType.LIST);
    }

    public long getLong(String str) {
        return getNumber(str).longValue();
    }

    public List<Long> getLongList(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<Number> it = getNumberList(str).iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(it.next().longValue()));
        }
        return arrayList;
    }

    public C8164 getMemorySize(String str) {
        return C8164.m13616(getBytesBigInteger(str));
    }

    public List<C8164> getMemorySizeList(String str) {
        return (List) getBytesListBigInteger(str).stream().map(new C2700(10)).collect(Collectors.toList());
    }

    @Deprecated
    public Long getMilliseconds(String str) {
        return Long.valueOf(getDuration(str, TimeUnit.MILLISECONDS));
    }

    @Deprecated
    public List<Long> getMillisecondsList(String str) {
        return getDurationList(str, TimeUnit.MILLISECONDS);
    }

    @Deprecated
    public Long getNanoseconds(String str) {
        return Long.valueOf(getDuration(str, TimeUnit.NANOSECONDS));
    }

    @Deprecated
    public List<Long> getNanosecondsList(String str) {
        return getDurationList(str, TimeUnit.NANOSECONDS);
    }

    public Number getNumber(String str) {
        return getConfigNumber(str).unwrapped();
    }

    public List<Number> getNumberList(String str) {
        return getHomogeneousUnwrappedList(str, ConfigValueType.NUMBER);
    }

    /* JADX INFO: renamed from: getObject, reason: merged with bridge method [inline-methods] */
    public AbstractC3846 m8178getObject(String str) {
        return (AbstractC3846) find(str, ConfigValueType.OBJECT);
    }

    public List<InterfaceC8162> getObjectList(String str) {
        return getHomogeneousWrappedList(str, ConfigValueType.OBJECT);
    }

    public Period getPeriod(String str) {
        AbstractC3843 abstractC3843Find = find(str, ConfigValueType.STRING);
        return parsePeriod((String) abstractC3843Find.unwrapped(), abstractC3843Find.origin(), str);
    }

    public String getString(String str) {
        return (String) find(str, ConfigValueType.STRING).unwrapped();
    }

    public List<String> getStringList(String str) {
        return getHomogeneousUnwrappedList(str, ConfigValueType.STRING);
    }

    public TemporalAmount getTemporal(String str) {
        try {
            return getDuration(str);
        } catch (ConfigException.BadValue unused) {
            return this.getPeriod(str);
        }
    }

    /* JADX INFO: renamed from: getValue, reason: merged with bridge method [inline-methods] */
    public AbstractC3843 m8179getValue(String str) {
        return find(str, null);
    }

    public boolean hasPath(String str) {
        InterfaceC8167 interfaceC8167HasPathPeek = hasPathPeek(str);
        return (interfaceC8167HasPathPeek == null || interfaceC8167HasPathPeek.valueType() == ConfigValueType.NULL) ? false : true;
    }

    public boolean hasPathOrNull(String str) {
        return hasPathPeek(str) != null;
    }

    public final int hashCode() {
        return this.object.hashCode() * 41;
    }

    public boolean isEmpty() {
        return this.object.isEmpty();
    }

    public boolean isResolved() {
        return root().resolveStatus() == ResolveStatus.RESOLVED;
    }

    public InterfaceC8161 origin() {
        return this.object.origin();
    }

    /* JADX INFO: renamed from: resolve, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8180resolve() {
        return m8181resolve(new C3865());
    }

    /* JADX INFO: renamed from: resolveWith, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8183resolveWith(InterfaceC8166 interfaceC8166, C3865 c3865) {
        AbstractC3846 abstractC3846 = this.object;
        C3849 c3849 = new C3849(((SimpleConfig) interfaceC8166).object);
        C3847 c3847 = new C3847(new C3851(new C3842(0, C3842.f12065)), c3865, null, new ArrayList(), Collections.newSetFromMap(new IdentityHashMap()));
        if (AbstractC3863.m8240()) {
            AbstractC3863.m8242(c3847.m8226(), "ResolveContext restrict to child null");
        }
        try {
            AbstractC3843 abstractC3843 = c3847.m8224(abstractC3846, c3849).f12078;
            return abstractC3843 == this.object ? this : new SimpleConfig((AbstractC3846) abstractC3843);
        } catch (AbstractConfigValue$NotPossibleToResolve e) {
            throw new ConfigException.BugOrBroken("NotPossibleToResolve was thrown from an outermost resolve", e);
        }
    }

    public String toString() {
        return "Config(" + this.object.toString() + ")";
    }

    /* JADX INFO: renamed from: withFallback, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleConfig m8185withFallback(InterfaceC8163 interfaceC8163) {
        return this.object.mo8220withFallback(interfaceC8163).toConfig();
    }

    /* JADX INFO: renamed from: withOnlyPath, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8186withOnlyPath(String str) {
        return new SimpleConfig(root().withOnlyPath(C3858.m8234(str)));
    }

    /* JADX INFO: renamed from: withValue, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8187withValue(String str, InterfaceC8167 interfaceC8167) {
        return new SimpleConfig(root().withValue(C3858.m8234(str), interfaceC8167));
    }

    /* JADX INFO: renamed from: withoutPath, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8188withoutPath(String str) {
        return new SimpleConfig(root().withoutPath(C3858.m8234(str)));
    }

    @Override // p250.InterfaceC8166
    public AbstractC3846 root() {
        return this.object;
    }

    @Override // com.typesafe.config.impl.InterfaceC3857
    public AbstractC3846 toFallbackValue() {
        return this.object;
    }

    /* JADX INFO: renamed from: atKey, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8176atKey(String str) {
        return root().m8217atKey(str);
    }

    public AbstractC3843 find(String str, ConfigValueType configValueType) {
        C3858 c3858M8234 = C3858.m8234(str);
        return find(c3858M8234, configValueType, c3858M8234);
    }

    /* JADX INFO: renamed from: resolve, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8181resolve(C3865 c3865) {
        return m8183resolveWith((InterfaceC8166) this, c3865);
    }

    public Duration getDuration(String str) {
        AbstractC3843 abstractC3843Find = find(str, ConfigValueType.STRING);
        return Duration.ofNanos(parseDuration((String) abstractC3843Find.unwrapped(), abstractC3843Find.origin(), str));
    }

    private static void addMissing(List<ConfigException.ValidationProblem> list, InterfaceC8167 interfaceC8167, C3858 c3858, InterfaceC8161 interfaceC8161) {
        addMissing(list, getDesc(interfaceC8167), c3858, interfaceC8161);
    }

    public static void addMissing(List<ConfigException.ValidationProblem> list, ConfigValueType configValueType, C3858 c3858, InterfaceC8161 interfaceC8161) {
        addMissing(list, getDesc(configValueType), c3858, interfaceC8161);
    }

    private static void addWrongType(List<ConfigException.ValidationProblem> list, InterfaceC8167 interfaceC8167, AbstractC3843 abstractC3843, C3858 c3858) {
        addWrongType(list, getDesc(interfaceC8167), abstractC3843, c3858);
    }

    private static void addWrongType(List<ConfigException.ValidationProblem> list, ConfigValueType configValueType, AbstractC3843 abstractC3843, C3858 c3858) {
        addWrongType(list, getDesc(configValueType), abstractC3843, c3858);
    }

    private static String getDesc(ConfigValueType configValueType) {
        return configValueType.name().toLowerCase();
    }

    private AbstractC3843 findOrNull(C3858 c3858, ConfigValueType configValueType, C3858 c38582) {
        return findOrNull(this.object, c3858, configValueType, c38582);
    }

    private AbstractC3843 findOrNull(String str, ConfigValueType configValueType) {
        C3858 c3858M8234 = C3858.m8234(str);
        return findOrNull(c3858M8234, configValueType, c3858M8234);
    }

    private static boolean haveCompatibleTypes(InterfaceC8167 interfaceC8167, AbstractC3843 abstractC3843) {
        if (couldBeNull((AbstractC3843) interfaceC8167)) {
            return true;
        }
        return haveCompatibleTypes(interfaceC8167.valueType(), abstractC3843);
    }

    /* JADX INFO: renamed from: resolveWith, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8182resolveWith(InterfaceC8166 interfaceC8166) {
        return m8183resolveWith(interfaceC8166, new C3865());
    }

    private static void checkValid(C3858 c3858, InterfaceC8167 interfaceC8167, AbstractC3843 abstractC3843, List<ConfigException.ValidationProblem> list) {
        if (haveCompatibleTypes(interfaceC8167, abstractC3843)) {
            if ((interfaceC8167 instanceof AbstractC3846) && (abstractC3843 instanceof AbstractC3846)) {
                checkValidObject(c3858, (AbstractC3846) interfaceC8167, (AbstractC3846) abstractC3843, list);
                return;
            }
            boolean z = interfaceC8167 instanceof SimpleConfigList;
            if (z && (abstractC3843 instanceof SimpleConfigList)) {
                checkListCompatibility(c3858, (SimpleConfigList) interfaceC8167, (SimpleConfigList) abstractC3843, list);
                return;
            }
            if (z && (abstractC3843 instanceof SimpleConfigObject)) {
                SimpleConfigList simpleConfigList = (SimpleConfigList) interfaceC8167;
                AbstractC3843 abstractC3843M8230 = AbstractC3854.m8230(ConfigValueType.LIST, abstractC3843);
                if (abstractC3843M8230 instanceof SimpleConfigList) {
                    checkListCompatibility(c3858, simpleConfigList, (SimpleConfigList) abstractC3843M8230, list);
                    return;
                } else {
                    addWrongType(list, interfaceC8167, abstractC3843, c3858);
                    return;
                }
            }
            return;
        }
        addWrongType(list, interfaceC8167, abstractC3843, c3858);
    }

    public List<Duration> getDurationList(String str) {
        List<Long> durationList = getDurationList(str, TimeUnit.NANOSECONDS);
        ArrayList arrayList = new ArrayList(durationList.size());
        Iterator<Long> it = durationList.iterator();
        while (it.hasNext()) {
            arrayList.add(Duration.ofNanos(it.next().longValue()));
        }
        return arrayList;
    }

    public static void checkValid(C3858 c3858, ConfigValueType configValueType, AbstractC3843 abstractC3843, List<ConfigException.ValidationProblem> list) {
        if (haveCompatibleTypes(configValueType, abstractC3843)) {
            ConfigValueType configValueType2 = ConfigValueType.LIST;
            if (configValueType == configValueType2 && (abstractC3843 instanceof SimpleConfigObject) && !(AbstractC3854.m8230(configValueType2, abstractC3843) instanceof SimpleConfigList)) {
                addWrongType(list, configValueType, abstractC3843, c3858);
                return;
            }
            return;
        }
        addWrongType(list, configValueType, abstractC3843, c3858);
    }
}
