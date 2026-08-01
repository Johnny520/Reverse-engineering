package com.typesafe.config.impl;

import androidx.activity.AbstractC0053;
import bsh.C2632;
import com.alibaba.fastjson2.C2941;
import com.alibaba.fastjson2.reader.C2699;
import com.google.protobuf.DescriptorProtos$Edition;
import com.typesafe.config.C3864;
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
import p250.C8163;
import p250.InterfaceC8160;
import p250.InterfaceC8161;
import p250.InterfaceC8162;
import p250.InterfaceC8164;
import p250.InterfaceC8165;
import p250.InterfaceC8166;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
final class SimpleConfig implements InterfaceC8165, InterfaceC3856, Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = 1;
    private final AbstractC3845 object;

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
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
                            C2632.m5294("broken MemoryUnit enum");
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

    public SimpleConfig(AbstractC3845 abstractC3845) {
        this.object = abstractC3845;
    }

    private static void addMissing(List<ConfigException.ValidationProblem> list, String str, C3857 c3857, InterfaceC8160 interfaceC8160) {
        addProblem(list, c3857, interfaceC8160, "No setting at '" + c3857.m8249() + "', expecting: " + str);
    }

    private static void addProblem(List<ConfigException.ValidationProblem> list, C3857 c3857, InterfaceC8160 interfaceC8160, String str) {
        list.add(new ConfigException.ValidationProblem(c3857.m8249(), interfaceC8160, str));
    }

    private static void addWrongType(List<ConfigException.ValidationProblem> list, String str, AbstractC3842 abstractC3842, C3857 c3857) {
        addProblem(list, c3857, abstractC3842.origin(), "Wrong value type at '" + c3857.m8249() + "', expecting: " + str + " but got: " + getDesc(abstractC3842));
    }

    private static void checkListCompatibility(C3857 c3857, SimpleConfigList simpleConfigList, SimpleConfigList simpleConfigList2, List<ConfigException.ValidationProblem> list) {
        if (simpleConfigList.isEmpty() || simpleConfigList2.isEmpty()) {
            return;
        }
        AbstractC3842 abstractC3842 = simpleConfigList.get(0);
        Iterator<InterfaceC8166> it = simpleConfigList2.iterator();
        while (it.hasNext()) {
            AbstractC3842 abstractC38422 = (AbstractC3842) it.next();
            if (!haveCompatibleTypes(abstractC3842, abstractC38422)) {
                addProblem(list, c3857, abstractC38422.origin(), "List at '" + c3857.m8249() + "' contains wrong value type, expecting list of " + getDesc(abstractC3842) + " but got element of type " + getDesc(abstractC38422));
                return;
            }
        }
    }

    private static void checkValidObject(C3857 c3857, AbstractC3845 abstractC3845, AbstractC3845 abstractC38452, List<ConfigException.ValidationProblem> list) {
        for (Map.Entry entry : abstractC3845.entrySet()) {
            String str = (String) entry.getKey();
            C3857 c38572 = null;
            if (c3857 != null) {
                Stack stack = new Stack();
                String str2 = c3857.f12081;
                C3857 c38573 = c3857.f12080;
                while (true) {
                    stack.push(str2);
                    if (c38573 == null) {
                        break;
                    }
                    str2 = c38573.f12081;
                    c38573 = c38573.f12080;
                }
                String str3 = str;
                C3857 c38574 = null;
                while (true) {
                    stack.push(str3);
                    if (c38574 == null) {
                        break;
                    }
                    str3 = c38574.f12081;
                    c38574 = c38574.f12080;
                }
                while (!stack.isEmpty()) {
                    c38572 = new C3857((String) stack.pop(), c38572);
                }
            } else {
                c38572 = new C3857(str, null);
            }
            AbstractC3842 abstractC3842 = abstractC38452.get((Object) str);
            if (abstractC3842 == null) {
                addMissing(list, (InterfaceC8166) entry.getValue(), c38572, abstractC38452.origin());
            } else {
                checkValid(c38572, (InterfaceC8166) entry.getValue(), abstractC3842, list);
            }
        }
    }

    private static boolean couldBeNull(AbstractC3842 abstractC3842) {
        ConfigValueType configValueType = ConfigValueType.NULL;
        return AbstractC3853.m8243(configValueType, abstractC3842).valueType() == configValueType;
    }

    private static AbstractC3842 findKey(AbstractC3845 abstractC3845, String str, ConfigValueType configValueType, C3857 c3857) {
        return throwIfNull(findKeyOrNull(abstractC3845, str, configValueType, c3857), configValueType, c3857);
    }

    private static AbstractC3842 findKeyOrNull(AbstractC3845 abstractC3845, String str, ConfigValueType configValueType, C3857 c3857) {
        AbstractC3842 abstractC3842PeekAssumingResolved = abstractC3845.peekAssumingResolved(str, c3857);
        if (abstractC3842PeekAssumingResolved == null) {
            throw new ConfigException.Missing(abstractC3845.origin(), c3857.m8249());
        }
        if (configValueType != null) {
            abstractC3842PeekAssumingResolved = AbstractC3853.m8243(configValueType, abstractC3842PeekAssumingResolved);
        }
        if (configValueType == null || abstractC3842PeekAssumingResolved.valueType() == configValueType || abstractC3842PeekAssumingResolved.valueType() == ConfigValueType.NULL) {
            return abstractC3842PeekAssumingResolved;
        }
        throw new ConfigException.WrongType(abstractC3842PeekAssumingResolved.origin(), c3857.m8249(), configValueType.name(), abstractC3842PeekAssumingResolved.valueType().name());
    }

    private static AbstractC3842 findOrNull(AbstractC3845 abstractC3845, C3857 c3857, ConfigValueType configValueType, C3857 c38572) {
        try {
            String str = c3857.f12081;
            C3857 c38573 = c3857.f12080;
            if (c38573 == null) {
                return findKeyOrNull(abstractC3845, str, configValueType, c38572);
            }
            ConfigValueType configValueType2 = ConfigValueType.OBJECT;
            int i = 1;
            int i2 = 1;
            for (C3857 c38574 = c38572.f12080; c38574 != null; c38574 = c38574.f12080) {
                i2++;
            }
            for (C3857 c38575 = c38573.f12080; c38575 != null; c38575 = c38575.f12080) {
                i++;
            }
            return findOrNull((AbstractC3845) findKey(abstractC3845, str, configValueType2, c38572.m8248(i2 - i)), c38573, configValueType, c38572);
        } catch (ConfigException.NotResolved e) {
            throw AbstractC3862.m8256(c3857, e);
        }
    }

    private static void findPaths(Set<Map.Entry<String, InterfaceC8166>> set, C3857 c3857, AbstractC3845 abstractC3845) {
        for (Map.Entry entry : abstractC3845.entrySet()) {
            String str = (String) entry.getKey();
            InterfaceC8166 interfaceC8166 = (InterfaceC8166) entry.getValue();
            C3857 c38572 = new C3857(str, null);
            if (c3857 != null) {
                Stack stack = new Stack();
                String str2 = c3857.f12081;
                C3857 c38573 = c3857.f12080;
                while (true) {
                    stack.push(str2);
                    if (c38573 == null) {
                        break;
                    }
                    str2 = c38573.f12081;
                    c38573 = c38573.f12080;
                }
                String str3 = c38572.f12081;
                C3857 c38574 = c38572.f12080;
                while (true) {
                    stack.push(str3);
                    if (c38574 == null) {
                        break;
                    }
                    str3 = c38574.f12081;
                    c38574 = c38574.f12080;
                }
                c38572 = null;
                while (!stack.isEmpty()) {
                    c38572 = new C3857((String) stack.pop(), c38572);
                }
            }
            if (interfaceC8166 instanceof AbstractC3845) {
                findPaths(set, c38572, (AbstractC3845) interfaceC8166);
            } else if (!(interfaceC8166 instanceof ConfigNull)) {
                set.add(new AbstractMap.SimpleImmutableEntry(c38572.m8249(), interfaceC8166));
            }
        }
    }

    private BigInteger getBytesBigInteger(String str) {
        BigInteger bytes;
        AbstractC3842 abstractC3842Find = find(str, ConfigValueType.STRING);
        try {
            bytes = BigInteger.valueOf(getLong(str));
        } catch (ConfigException.WrongType unused) {
            bytes = parseBytes((String) abstractC3842Find.unwrapped(), abstractC3842Find.origin(), str);
        }
        if (bytes.signum() >= 0) {
            return bytes;
        }
        throw new ConfigException.BadValue(abstractC3842Find.origin(), str, "Attempt to construct memory size with negative number: " + bytes);
    }

    private List<BigInteger> getBytesListBigInteger(String str) {
        BigInteger bytes;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC8166 interfaceC8166 : getList(str)) {
            if (interfaceC8166.valueType() == ConfigValueType.NUMBER) {
                bytes = BigInteger.valueOf(((Number) interfaceC8166.unwrapped()).longValue());
            } else {
                if (interfaceC8166.valueType() != ConfigValueType.STRING) {
                    throw new ConfigException.WrongType(interfaceC8166.origin(), str, "memory size string or number of bytes", interfaceC8166.valueType().name());
                }
                bytes = parseBytes((String) interfaceC8166.unwrapped(), interfaceC8166.origin(), str);
            }
            if (bytes.signum() < 0) {
                throw new ConfigException.BadValue(interfaceC8166.origin(), str, "Attempt to construct ConfigMemorySize with negative number: " + bytes);
            }
            arrayList.add(bytes);
        }
        return arrayList;
    }

    private ConfigNumber getConfigNumber(String str) {
        return (ConfigNumber) find(str, ConfigValueType.NUMBER);
    }

    private static String getDesc(InterfaceC8166 interfaceC8166) {
        if (!(interfaceC8166 instanceof AbstractC3845)) {
            return getDesc(interfaceC8166.valueType());
        }
        AbstractC3845 abstractC3845 = (AbstractC3845) interfaceC8166;
        if (abstractC3845.isEmpty()) {
            return getDesc(interfaceC8166.valueType());
        }
        return "object with keys " + abstractC3845.keySet();
    }

    private <T extends Enum<T>> T getEnumValue(String str, Class<T> cls, InterfaceC8166 interfaceC8166) {
        String str2 = (String) interfaceC8166.unwrapped();
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
            throw new ConfigException.BadValue(interfaceC8166.origin(), str, String.format("The enum class %s has no constant of the name '%s' (should be one of %s.)", cls.getSimpleName(), str2, arrayList));
        }
    }

    private <T> List<T> getHomogeneousUnwrappedList(String str, ConfigValueType configValueType) {
        ArrayList arrayList = new ArrayList();
        Iterator it = getList(str).iterator();
        while (it.hasNext()) {
            AbstractC3842 abstractC3842M8243 = (AbstractC3842) ((InterfaceC8166) it.next());
            if (configValueType != null) {
                abstractC3842M8243 = AbstractC3853.m8243(configValueType, abstractC3842M8243);
            }
            if (abstractC3842M8243.valueType() != configValueType) {
                throw new ConfigException.WrongType(abstractC3842M8243.origin(), str, "list of " + configValueType.name(), "list of " + abstractC3842M8243.valueType().name());
            }
            arrayList.add(abstractC3842M8243.unwrapped());
        }
        return arrayList;
    }

    private <T extends InterfaceC8166> List<T> getHomogeneousWrappedList(String str, ConfigValueType configValueType) {
        ArrayList arrayList = new ArrayList();
        Iterator it = getList(str).iterator();
        while (it.hasNext()) {
            AbstractC3842 abstractC3842M8243 = (AbstractC3842) ((InterfaceC8166) it.next());
            if (configValueType != null) {
                abstractC3842M8243 = AbstractC3853.m8243(configValueType, abstractC3842M8243);
            }
            if (abstractC3842M8243.valueType() != configValueType) {
                throw new ConfigException.WrongType(abstractC3842M8243.origin(), str, "list of " + configValueType.name(), "list of " + abstractC3842M8243.valueType().name());
            }
            arrayList.add(abstractC3842M8243);
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

    private InterfaceC8166 hasPathPeek(String str) {
        C3857 c3857M8247 = C3857.m8247(str);
        try {
            return this.object.peekPath(c3857M8247);
        } catch (ConfigException.NotResolved e) {
            throw AbstractC3862.m8256(c3857M8247, e);
        }
    }

    private static boolean haveCompatibleTypes(ConfigValueType configValueType, AbstractC3842 abstractC3842) {
        if (configValueType == ConfigValueType.NULL || couldBeNull(abstractC3842)) {
            return true;
        }
        return configValueType == ConfigValueType.OBJECT ? abstractC3842 instanceof AbstractC3845 : configValueType == ConfigValueType.LIST ? (abstractC3842 instanceof SimpleConfigList) || (abstractC3842 instanceof SimpleConfigObject) : configValueType == ConfigValueType.STRING || (abstractC3842 instanceof ConfigString) || configValueType == abstractC3842.valueType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$getBytesList$0(InterfaceC8166 interfaceC8166, String str, BigInteger bigInteger) {
        return toLong(bigInteger, interfaceC8166.origin(), str);
    }

    public static BigInteger parseBytes(String str, InterfaceC8160 interfaceC8160, String str2) {
        String strM8258 = AbstractC3863.m8258(str);
        String units = getUnits(strM8258);
        String strM82582 = AbstractC3863.m8258(strM8258.substring(0, strM8258.length() - units.length()));
        if (strM82582.length() == 0) {
            throw new ConfigException.BadValue(interfaceC8160, str2, AbstractC0053.m156("No number in size-in-bytes value '", str, "'"));
        }
        MemoryUnit unit = MemoryUnit.parseUnit(units);
        if (unit == null) {
            throw new ConfigException.BadValue(interfaceC8160, str2, AbstractC0053.m156("Could not parse size-in-bytes unit '", units, "' (try k, K, kB, KiB, kilobytes, kibibytes)"));
        }
        try {
            return strM82582.matches("[0-9]+") ? unit.bytes.multiply(new BigInteger(strM82582)) : new BigDecimal(unit.bytes).multiply(new BigDecimal(strM82582)).toBigInteger();
        } catch (NumberFormatException unused) {
            throw new ConfigException.BadValue(interfaceC8160, str2, AbstractC0053.m156("Could not parse size-in-bytes number '", strM82582, "'"));
        }
    }

    public static long parseDuration(String str, InterfaceC8160 interfaceC8160, String str2) {
        TimeUnit timeUnit;
        String strM8258 = AbstractC3863.m8258(str);
        String units = getUnits(strM8258);
        String strM82582 = AbstractC3863.m8258(strM8258.substring(0, strM8258.length() - units.length()));
        if (strM82582.length() == 0) {
            throw new ConfigException.BadValue(interfaceC8160, str2, AbstractC0053.m156("No number in duration value '", str, "'"));
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
                throw new ConfigException.BadValue(interfaceC8160, str2, AbstractC0053.m156("Could not parse time unit '", units, "' (try ns, us, ms, s, m, h, d)"));
            }
            timeUnit = TimeUnit.MINUTES;
        }
        try {
            if (strM82582.matches("[+-]?[0-9]+")) {
                return timeUnit.toNanos(Long.parseLong(strM82582));
            }
            return (long) (Double.parseDouble(strM82582) * timeUnit.toNanos(serialVersionUID));
        } catch (NumberFormatException unused) {
            throw new ConfigException.BadValue(interfaceC8160, str2, AbstractC0053.m156("Could not parse duration number '", strM82582, "'"));
        }
    }

    public static Period parsePeriod(String str, InterfaceC8160 interfaceC8160, String str2) {
        ChronoUnit chronoUnit;
        String strM8258 = AbstractC3863.m8258(str);
        String units = getUnits(strM8258);
        String strM82582 = AbstractC3863.m8258(strM8258.substring(0, strM8258.length() - units.length()));
        if (strM82582.length() == 0) {
            throw new ConfigException.BadValue(interfaceC8160, str2, AbstractC0053.m156("No number in period value '", str, "'"));
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
                throw new ConfigException.BadValue(interfaceC8160, str2, AbstractC0053.m156("Could not parse time unit '", units, "' (try d, w, mo, y)"));
            }
            chronoUnit = ChronoUnit.YEARS;
        }
        try {
            return periodOf(Integer.parseInt(strM82582), chronoUnit);
        } catch (NumberFormatException unused) {
            throw new ConfigException.BadValue(interfaceC8160, str2, AbstractC0053.m156("Could not parse duration number '", strM82582, "'"));
        }
    }

    private AbstractC3842 peekPath(C3857 c3857) {
        return root().peekPath(c3857);
    }

    private static Period periodOf(int i, ChronoUnit chronoUnit) {
        if (chronoUnit.isTimeBased()) {
            throw new DateTimeException(chronoUnit + " cannot be converted to a java.time.Period");
        }
        int i2 = AbstractC3831.f12030[chronoUnit.ordinal()];
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

    private static AbstractC3842 throwIfNull(AbstractC3842 abstractC3842, ConfigValueType configValueType, C3857 c3857) {
        if (abstractC3842.valueType() == ConfigValueType.NULL) {
            throw new ConfigException.Null(abstractC3842.origin(), c3857.m8249(), configValueType != null ? configValueType.name() : null);
        }
        return abstractC3842;
    }

    private Long toLong(BigInteger bigInteger, InterfaceC8160 interfaceC8160, String str) {
        if (bigInteger.bitLength() < 64) {
            return Long.valueOf(bigInteger.longValue());
        }
        throw new ConfigException.BadValue(interfaceC8160, str, "size-in-bytes value is out of range for a 64-bit long: '" + bigInteger + "'");
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    public SimpleConfig atKey(InterfaceC8160 interfaceC8160, String str) {
        return root().atKey(interfaceC8160, str);
    }

    public InterfaceC8165 atPath(String str) {
        return root().m8231atPath(str);
    }

    public void checkValid(InterfaceC8165 interfaceC8165, String... strArr) {
        SimpleConfig simpleConfig = (SimpleConfig) interfaceC8165;
        ResolveStatus resolveStatus = simpleConfig.root().resolveStatus();
        ResolveStatus resolveStatus2 = ResolveStatus.RESOLVED;
        if (resolveStatus != resolveStatus2) {
            C2941.m6350("do not call checkValid() with an unresolved reference config, call Config#resolve(), see Config#resolve() API docs");
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
                C3857 c3857M8247 = C3857.m8247(str);
                AbstractC3842 abstractC3842PeekPath = simpleConfig.peekPath(c3857M8247);
                if (abstractC3842PeekPath != null) {
                    AbstractC3842 abstractC3842PeekPath2 = peekPath(c3857M8247);
                    if (abstractC3842PeekPath2 != null) {
                        checkValid(c3857M8247, abstractC3842PeekPath, abstractC3842PeekPath2, arrayList);
                    } else {
                        addMissing(arrayList, abstractC3842PeekPath, c3857M8247, origin());
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            throw new ConfigException.ValidationFailed(arrayList);
        }
    }

    public Set<Map.Entry<String, InterfaceC8166>> entrySet() {
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

    public AbstractC3842 find(C3857 c3857, ConfigValueType configValueType, C3857 c38572) {
        return throwIfNull(findOrNull(this.object, c3857, configValueType, c38572), configValueType, c38572);
    }

    public Object getAnyRef(String str) {
        return find(str, null).unwrapped();
    }

    public List<? extends Object> getAnyRefList(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = getList(str).iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8166) it.next()).unwrapped());
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
        final AbstractC3842 abstractC3842Find = find(str, ConfigValueType.LIST);
        return (List) getBytesListBigInteger(str).stream().map(new Function() { // from class: com.typesafe.config.impl.飘花落叶言子世楪苏兰哲
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f12033.lambda$getBytesList$0(abstractC3842Find, str, (BigInteger) obj);
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: renamed from: getConfig, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8190getConfig(String str) {
        return m8191getObject(str).toConfig();
    }

    public List<? extends InterfaceC8165> getConfigList(String str) {
        List<InterfaceC8161> objectList = getObjectList(str);
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC8161> it = objectList.iterator();
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
        AbstractC3842 abstractC3842Find = find(str, ConfigValueType.STRING);
        return timeUnit.convert(parseDuration((String) abstractC3842Find.unwrapped(), abstractC3842Find.origin(), str), TimeUnit.NANOSECONDS);
    }

    public List<Long> getDurationList(String str, TimeUnit timeUnit) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC8166 interfaceC8166 : getList(str)) {
            if (interfaceC8166.valueType() == ConfigValueType.NUMBER) {
                arrayList.add(Long.valueOf(timeUnit.convert(((Number) interfaceC8166.unwrapped()).longValue(), TimeUnit.MILLISECONDS)));
            } else {
                if (interfaceC8166.valueType() != ConfigValueType.STRING) {
                    throw new ConfigException.WrongType(interfaceC8166.origin(), str, "duration string or number of milliseconds", interfaceC8166.valueType().name());
                }
                arrayList.add(Long.valueOf(timeUnit.convert(parseDuration((String) interfaceC8166.unwrapped(), interfaceC8166.origin(), str), TimeUnit.NANOSECONDS)));
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
            arrayList.add(Integer.valueOf(((ConfigNumber) ((AbstractC3842) it.next())).intValueRangeChecked(str)));
        }
        return arrayList;
    }

    public boolean getIsNull(String str) {
        return findOrNull(str, null).valueType() == ConfigValueType.NULL;
    }

    public InterfaceC8164 getList(String str) {
        return (InterfaceC8164) find(str, ConfigValueType.LIST);
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

    public C8163 getMemorySize(String str) {
        return C8163.m13587(getBytesBigInteger(str));
    }

    public List<C8163> getMemorySizeList(String str) {
        return (List) getBytesListBigInteger(str).stream().map(new C2699(10)).collect(Collectors.toList());
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
    public AbstractC3845 m8191getObject(String str) {
        return (AbstractC3845) find(str, ConfigValueType.OBJECT);
    }

    public List<InterfaceC8161> getObjectList(String str) {
        return getHomogeneousWrappedList(str, ConfigValueType.OBJECT);
    }

    public Period getPeriod(String str) {
        AbstractC3842 abstractC3842Find = find(str, ConfigValueType.STRING);
        return parsePeriod((String) abstractC3842Find.unwrapped(), abstractC3842Find.origin(), str);
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
    public AbstractC3842 m8192getValue(String str) {
        return find(str, null);
    }

    public boolean hasPath(String str) {
        InterfaceC8166 interfaceC8166HasPathPeek = hasPathPeek(str);
        return (interfaceC8166HasPathPeek == null || interfaceC8166HasPathPeek.valueType() == ConfigValueType.NULL) ? false : true;
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

    public InterfaceC8160 origin() {
        return this.object.origin();
    }

    /* JADX INFO: renamed from: resolve, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8193resolve() {
        return m8194resolve(new C3864());
    }

    /* JADX INFO: renamed from: resolveWith, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8196resolveWith(InterfaceC8165 interfaceC8165, C3864 c3864) {
        AbstractC3845 abstractC3845 = this.object;
        C3848 c3848 = new C3848(((SimpleConfig) interfaceC8165).object);
        C3846 c3846 = new C3846(new C3850(new C3841(0, C3841.f12060)), c3864, null, new ArrayList(), Collections.newSetFromMap(new IdentityHashMap()));
        if (AbstractC3862.m8253()) {
            AbstractC3862.m8255(c3846.m8239(), "ResolveContext restrict to child null");
        }
        try {
            AbstractC3842 abstractC3842 = c3846.m8237(abstractC3845, c3848).f12073;
            return abstractC3842 == this.object ? this : new SimpleConfig((AbstractC3845) abstractC3842);
        } catch (AbstractConfigValue$NotPossibleToResolve e) {
            throw new ConfigException.BugOrBroken("NotPossibleToResolve was thrown from an outermost resolve", e);
        }
    }

    public String toString() {
        return "Config(" + this.object.toString() + ")";
    }

    /* JADX INFO: renamed from: withFallback, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleConfig m8198withFallback(InterfaceC8162 interfaceC8162) {
        return this.object.mo8233withFallback(interfaceC8162).toConfig();
    }

    /* JADX INFO: renamed from: withOnlyPath, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8199withOnlyPath(String str) {
        return new SimpleConfig(root().withOnlyPath(C3857.m8247(str)));
    }

    /* JADX INFO: renamed from: withValue, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8200withValue(String str, InterfaceC8166 interfaceC8166) {
        return new SimpleConfig(root().withValue(C3857.m8247(str), interfaceC8166));
    }

    /* JADX INFO: renamed from: withoutPath, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8201withoutPath(String str) {
        return new SimpleConfig(root().withoutPath(C3857.m8247(str)));
    }

    @Override // p250.InterfaceC8165
    public AbstractC3845 root() {
        return this.object;
    }

    @Override // com.typesafe.config.impl.InterfaceC3856
    public AbstractC3845 toFallbackValue() {
        return this.object;
    }

    /* JADX INFO: renamed from: atKey, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8189atKey(String str) {
        return root().m8230atKey(str);
    }

    public AbstractC3842 find(String str, ConfigValueType configValueType) {
        C3857 c3857M8247 = C3857.m8247(str);
        return find(c3857M8247, configValueType, c3857M8247);
    }

    /* JADX INFO: renamed from: resolve, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8194resolve(C3864 c3864) {
        return m8196resolveWith((InterfaceC8165) this, c3864);
    }

    public Duration getDuration(String str) {
        AbstractC3842 abstractC3842Find = find(str, ConfigValueType.STRING);
        return Duration.ofNanos(parseDuration((String) abstractC3842Find.unwrapped(), abstractC3842Find.origin(), str));
    }

    private static void addMissing(List<ConfigException.ValidationProblem> list, InterfaceC8166 interfaceC8166, C3857 c3857, InterfaceC8160 interfaceC8160) {
        addMissing(list, getDesc(interfaceC8166), c3857, interfaceC8160);
    }

    public static void addMissing(List<ConfigException.ValidationProblem> list, ConfigValueType configValueType, C3857 c3857, InterfaceC8160 interfaceC8160) {
        addMissing(list, getDesc(configValueType), c3857, interfaceC8160);
    }

    private static void addWrongType(List<ConfigException.ValidationProblem> list, InterfaceC8166 interfaceC8166, AbstractC3842 abstractC3842, C3857 c3857) {
        addWrongType(list, getDesc(interfaceC8166), abstractC3842, c3857);
    }

    private static void addWrongType(List<ConfigException.ValidationProblem> list, ConfigValueType configValueType, AbstractC3842 abstractC3842, C3857 c3857) {
        addWrongType(list, getDesc(configValueType), abstractC3842, c3857);
    }

    private static String getDesc(ConfigValueType configValueType) {
        return configValueType.name().toLowerCase();
    }

    private AbstractC3842 findOrNull(C3857 c3857, ConfigValueType configValueType, C3857 c38572) {
        return findOrNull(this.object, c3857, configValueType, c38572);
    }

    private AbstractC3842 findOrNull(String str, ConfigValueType configValueType) {
        C3857 c3857M8247 = C3857.m8247(str);
        return findOrNull(c3857M8247, configValueType, c3857M8247);
    }

    private static boolean haveCompatibleTypes(InterfaceC8166 interfaceC8166, AbstractC3842 abstractC3842) {
        if (couldBeNull((AbstractC3842) interfaceC8166)) {
            return true;
        }
        return haveCompatibleTypes(interfaceC8166.valueType(), abstractC3842);
    }

    /* JADX INFO: renamed from: resolveWith, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8195resolveWith(InterfaceC8165 interfaceC8165) {
        return m8196resolveWith(interfaceC8165, new C3864());
    }

    private static void checkValid(C3857 c3857, InterfaceC8166 interfaceC8166, AbstractC3842 abstractC3842, List<ConfigException.ValidationProblem> list) {
        if (haveCompatibleTypes(interfaceC8166, abstractC3842)) {
            if ((interfaceC8166 instanceof AbstractC3845) && (abstractC3842 instanceof AbstractC3845)) {
                checkValidObject(c3857, (AbstractC3845) interfaceC8166, (AbstractC3845) abstractC3842, list);
                return;
            }
            boolean z = interfaceC8166 instanceof SimpleConfigList;
            if (z && (abstractC3842 instanceof SimpleConfigList)) {
                checkListCompatibility(c3857, (SimpleConfigList) interfaceC8166, (SimpleConfigList) abstractC3842, list);
                return;
            }
            if (z && (abstractC3842 instanceof SimpleConfigObject)) {
                SimpleConfigList simpleConfigList = (SimpleConfigList) interfaceC8166;
                AbstractC3842 abstractC3842M8243 = AbstractC3853.m8243(ConfigValueType.LIST, abstractC3842);
                if (abstractC3842M8243 instanceof SimpleConfigList) {
                    checkListCompatibility(c3857, simpleConfigList, (SimpleConfigList) abstractC3842M8243, list);
                    return;
                } else {
                    addWrongType(list, interfaceC8166, abstractC3842, c3857);
                    return;
                }
            }
            return;
        }
        addWrongType(list, interfaceC8166, abstractC3842, c3857);
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

    public static void checkValid(C3857 c3857, ConfigValueType configValueType, AbstractC3842 abstractC3842, List<ConfigException.ValidationProblem> list) {
        if (haveCompatibleTypes(configValueType, abstractC3842)) {
            ConfigValueType configValueType2 = ConfigValueType.LIST;
            if (configValueType == configValueType2 && (abstractC3842 instanceof SimpleConfigObject) && !(AbstractC3853.m8243(configValueType2, abstractC3842) instanceof SimpleConfigList)) {
                addWrongType(list, configValueType, abstractC3842, c3857);
                return;
            }
            return;
        }
        addWrongType(list, configValueType, abstractC3842, c3857);
    }
}
