package com.typesafe.config.impl;

import androidx.activity.AbstractC0900;
import bsh.C3466;
import com.alibaba.fastjson2.C3775;
import com.alibaba.fastjson2.reader.C3533;
import com.google.protobuf.DescriptorProtos$Edition;
import com.typesafe.config.C4697;
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
import p266.C8993;
import p266.InterfaceC8990;
import p266.InterfaceC8991;
import p266.InterfaceC8992;
import p266.InterfaceC8994;
import p266.InterfaceC8995;
import p266.InterfaceC8996;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
final class SimpleConfig implements InterfaceC8995, InterfaceC4689, Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final long serialVersionUID = 1;
    private final AbstractC4678 object;

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
                            C3466.m5899("broken MemoryUnit enum");
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

    public SimpleConfig(AbstractC4678 abstractC4678) {
        this.object = abstractC4678;
    }

    private static void addMissing(List<ConfigException.ValidationProblem> list, String str, C4690 c4690, InterfaceC8990 interfaceC8990) {
        addProblem(list, c4690, interfaceC8990, "No setting at '" + c4690.m8795() + "', expecting: " + str);
    }

    private static void addProblem(List<ConfigException.ValidationProblem> list, C4690 c4690, InterfaceC8990 interfaceC8990, String str) {
        list.add(new ConfigException.ValidationProblem(c4690.m8795(), interfaceC8990, str));
    }

    private static void addWrongType(List<ConfigException.ValidationProblem> list, String str, AbstractC4675 abstractC4675, C4690 c4690) {
        addProblem(list, c4690, abstractC4675.origin(), "Wrong value type at '" + c4690.m8795() + "', expecting: " + str + " but got: " + getDesc(abstractC4675));
    }

    private static void checkListCompatibility(C4690 c4690, SimpleConfigList simpleConfigList, SimpleConfigList simpleConfigList2, List<ConfigException.ValidationProblem> list) {
        if (simpleConfigList.isEmpty() || simpleConfigList2.isEmpty()) {
            return;
        }
        AbstractC4675 abstractC4675 = simpleConfigList.get(0);
        Iterator<InterfaceC8996> it = simpleConfigList2.iterator();
        while (it.hasNext()) {
            AbstractC4675 abstractC46752 = (AbstractC4675) it.next();
            if (!haveCompatibleTypes(abstractC4675, abstractC46752)) {
                addProblem(list, c4690, abstractC46752.origin(), "List at '" + c4690.m8795() + "' contains wrong value type, expecting list of " + getDesc(abstractC4675) + " but got element of type " + getDesc(abstractC46752));
                return;
            }
        }
    }

    private static void checkValidObject(C4690 c4690, AbstractC4678 abstractC4678, AbstractC4678 abstractC46782, List<ConfigException.ValidationProblem> list) {
        for (Map.Entry entry : abstractC4678.entrySet()) {
            String str = (String) entry.getKey();
            C4690 c46902 = null;
            if (c4690 != null) {
                Stack stack = new Stack();
                String str2 = c4690.f12431;
                C4690 c46903 = c4690.f12430;
                while (true) {
                    stack.push(str2);
                    if (c46903 == null) {
                        break;
                    }
                    str2 = c46903.f12431;
                    c46903 = c46903.f12430;
                }
                String str3 = str;
                C4690 c46904 = null;
                while (true) {
                    stack.push(str3);
                    if (c46904 == null) {
                        break;
                    }
                    str3 = c46904.f12431;
                    c46904 = c46904.f12430;
                }
                while (!stack.isEmpty()) {
                    c46902 = new C4690((String) stack.pop(), c46902);
                }
            } else {
                c46902 = new C4690(str, null);
            }
            AbstractC4675 abstractC4675 = abstractC46782.get((Object) str);
            if (abstractC4675 == null) {
                addMissing(list, (InterfaceC8996) entry.getValue(), c46902, abstractC46782.origin());
            } else {
                checkValid(c46902, (InterfaceC8996) entry.getValue(), abstractC4675, list);
            }
        }
    }

    private static boolean couldBeNull(AbstractC4675 abstractC4675) {
        ConfigValueType configValueType = ConfigValueType.NULL;
        return AbstractC4686.m8789(configValueType, abstractC4675).valueType() == configValueType;
    }

    private static AbstractC4675 findKey(AbstractC4678 abstractC4678, String str, ConfigValueType configValueType, C4690 c4690) {
        return throwIfNull(findKeyOrNull(abstractC4678, str, configValueType, c4690), configValueType, c4690);
    }

    private static AbstractC4675 findKeyOrNull(AbstractC4678 abstractC4678, String str, ConfigValueType configValueType, C4690 c4690) {
        AbstractC4675 abstractC4675PeekAssumingResolved = abstractC4678.peekAssumingResolved(str, c4690);
        if (abstractC4675PeekAssumingResolved == null) {
            throw new ConfigException.Missing(abstractC4678.origin(), c4690.m8795());
        }
        if (configValueType != null) {
            abstractC4675PeekAssumingResolved = AbstractC4686.m8789(configValueType, abstractC4675PeekAssumingResolved);
        }
        if (configValueType == null || abstractC4675PeekAssumingResolved.valueType() == configValueType || abstractC4675PeekAssumingResolved.valueType() == ConfigValueType.NULL) {
            return abstractC4675PeekAssumingResolved;
        }
        throw new ConfigException.WrongType(abstractC4675PeekAssumingResolved.origin(), c4690.m8795(), configValueType.name(), abstractC4675PeekAssumingResolved.valueType().name());
    }

    private static AbstractC4675 findOrNull(AbstractC4678 abstractC4678, C4690 c4690, ConfigValueType configValueType, C4690 c46902) {
        try {
            String str = c4690.f12431;
            C4690 c46903 = c4690.f12430;
            if (c46903 == null) {
                return findKeyOrNull(abstractC4678, str, configValueType, c46902);
            }
            ConfigValueType configValueType2 = ConfigValueType.OBJECT;
            int i = 1;
            int i2 = 1;
            for (C4690 c46904 = c46902.f12430; c46904 != null; c46904 = c46904.f12430) {
                i2++;
            }
            for (C4690 c46905 = c46903.f12430; c46905 != null; c46905 = c46905.f12430) {
                i++;
            }
            return findOrNull((AbstractC4678) findKey(abstractC4678, str, configValueType2, c46902.m8794(i2 - i)), c46903, configValueType, c46902);
        } catch (ConfigException.NotResolved e) {
            throw AbstractC4695.m8802(c4690, e);
        }
    }

    private static void findPaths(Set<Map.Entry<String, InterfaceC8996>> set, C4690 c4690, AbstractC4678 abstractC4678) {
        for (Map.Entry entry : abstractC4678.entrySet()) {
            String str = (String) entry.getKey();
            InterfaceC8996 interfaceC8996 = (InterfaceC8996) entry.getValue();
            C4690 c46902 = new C4690(str, null);
            if (c4690 != null) {
                Stack stack = new Stack();
                String str2 = c4690.f12431;
                C4690 c46903 = c4690.f12430;
                while (true) {
                    stack.push(str2);
                    if (c46903 == null) {
                        break;
                    }
                    str2 = c46903.f12431;
                    c46903 = c46903.f12430;
                }
                String str3 = c46902.f12431;
                C4690 c46904 = c46902.f12430;
                while (true) {
                    stack.push(str3);
                    if (c46904 == null) {
                        break;
                    }
                    str3 = c46904.f12431;
                    c46904 = c46904.f12430;
                }
                c46902 = null;
                while (!stack.isEmpty()) {
                    c46902 = new C4690((String) stack.pop(), c46902);
                }
            }
            if (interfaceC8996 instanceof AbstractC4678) {
                findPaths(set, c46902, (AbstractC4678) interfaceC8996);
            } else if (!(interfaceC8996 instanceof ConfigNull)) {
                set.add(new AbstractMap.SimpleImmutableEntry(c46902.m8795(), interfaceC8996));
            }
        }
    }

    private BigInteger getBytesBigInteger(String str) {
        BigInteger bytes;
        AbstractC4675 abstractC4675Find = find(str, ConfigValueType.STRING);
        try {
            bytes = BigInteger.valueOf(getLong(str));
        } catch (ConfigException.WrongType unused) {
            bytes = parseBytes((String) abstractC4675Find.unwrapped(), abstractC4675Find.origin(), str);
        }
        if (bytes.signum() >= 0) {
            return bytes;
        }
        throw new ConfigException.BadValue(abstractC4675Find.origin(), str, "Attempt to construct memory size with negative number: " + bytes);
    }

    private List<BigInteger> getBytesListBigInteger(String str) {
        BigInteger bytes;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC8996 interfaceC8996 : getList(str)) {
            if (interfaceC8996.valueType() == ConfigValueType.NUMBER) {
                bytes = BigInteger.valueOf(((Number) interfaceC8996.unwrapped()).longValue());
            } else {
                if (interfaceC8996.valueType() != ConfigValueType.STRING) {
                    throw new ConfigException.WrongType(interfaceC8996.origin(), str, "memory size string or number of bytes", interfaceC8996.valueType().name());
                }
                bytes = parseBytes((String) interfaceC8996.unwrapped(), interfaceC8996.origin(), str);
            }
            if (bytes.signum() < 0) {
                throw new ConfigException.BadValue(interfaceC8996.origin(), str, "Attempt to construct ConfigMemorySize with negative number: " + bytes);
            }
            arrayList.add(bytes);
        }
        return arrayList;
    }

    private ConfigNumber getConfigNumber(String str) {
        return (ConfigNumber) find(str, ConfigValueType.NUMBER);
    }

    private static String getDesc(InterfaceC8996 interfaceC8996) {
        if (!(interfaceC8996 instanceof AbstractC4678)) {
            return getDesc(interfaceC8996.valueType());
        }
        AbstractC4678 abstractC4678 = (AbstractC4678) interfaceC8996;
        if (abstractC4678.isEmpty()) {
            return getDesc(interfaceC8996.valueType());
        }
        return "object with keys " + abstractC4678.keySet();
    }

    private <T extends Enum<T>> T getEnumValue(String str, Class<T> cls, InterfaceC8996 interfaceC8996) {
        String str2 = (String) interfaceC8996.unwrapped();
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
            throw new ConfigException.BadValue(interfaceC8996.origin(), str, String.format("The enum class %s has no constant of the name '%s' (should be one of %s.)", cls.getSimpleName(), str2, arrayList));
        }
    }

    private <T> List<T> getHomogeneousUnwrappedList(String str, ConfigValueType configValueType) {
        ArrayList arrayList = new ArrayList();
        Iterator it = getList(str).iterator();
        while (it.hasNext()) {
            AbstractC4675 abstractC4675M8789 = (AbstractC4675) ((InterfaceC8996) it.next());
            if (configValueType != null) {
                abstractC4675M8789 = AbstractC4686.m8789(configValueType, abstractC4675M8789);
            }
            if (abstractC4675M8789.valueType() != configValueType) {
                throw new ConfigException.WrongType(abstractC4675M8789.origin(), str, "list of " + configValueType.name(), "list of " + abstractC4675M8789.valueType().name());
            }
            arrayList.add(abstractC4675M8789.unwrapped());
        }
        return arrayList;
    }

    private <T extends InterfaceC8996> List<T> getHomogeneousWrappedList(String str, ConfigValueType configValueType) {
        ArrayList arrayList = new ArrayList();
        Iterator it = getList(str).iterator();
        while (it.hasNext()) {
            AbstractC4675 abstractC4675M8789 = (AbstractC4675) ((InterfaceC8996) it.next());
            if (configValueType != null) {
                abstractC4675M8789 = AbstractC4686.m8789(configValueType, abstractC4675M8789);
            }
            if (abstractC4675M8789.valueType() != configValueType) {
                throw new ConfigException.WrongType(abstractC4675M8789.origin(), str, "list of " + configValueType.name(), "list of " + abstractC4675M8789.valueType().name());
            }
            arrayList.add(abstractC4675M8789);
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

    private InterfaceC8996 hasPathPeek(String str) {
        C4690 c4690M8793 = C4690.m8793(str);
        try {
            return this.object.peekPath(c4690M8793);
        } catch (ConfigException.NotResolved e) {
            throw AbstractC4695.m8802(c4690M8793, e);
        }
    }

    private static boolean haveCompatibleTypes(ConfigValueType configValueType, AbstractC4675 abstractC4675) {
        if (configValueType == ConfigValueType.NULL || couldBeNull(abstractC4675)) {
            return true;
        }
        return configValueType == ConfigValueType.OBJECT ? abstractC4675 instanceof AbstractC4678 : configValueType == ConfigValueType.LIST ? (abstractC4675 instanceof SimpleConfigList) || (abstractC4675 instanceof SimpleConfigObject) : configValueType == ConfigValueType.STRING || (abstractC4675 instanceof ConfigString) || configValueType == abstractC4675.valueType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Long lambda$getBytesList$0(InterfaceC8996 interfaceC8996, String str, BigInteger bigInteger) {
        return toLong(bigInteger, interfaceC8996.origin(), str);
    }

    public static BigInteger parseBytes(String str, InterfaceC8990 interfaceC8990, String str2) {
        String strM8804 = AbstractC4696.m8804(str);
        String units = getUnits(strM8804);
        String strM88042 = AbstractC4696.m8804(strM8804.substring(0, strM8804.length() - units.length()));
        if (strM88042.length() == 0) {
            throw new ConfigException.BadValue(interfaceC8990, str2, AbstractC0900.m718("No number in size-in-bytes value '", str, "'"));
        }
        MemoryUnit unit = MemoryUnit.parseUnit(units);
        if (unit == null) {
            throw new ConfigException.BadValue(interfaceC8990, str2, AbstractC0900.m718("Could not parse size-in-bytes unit '", units, "' (try k, K, kB, KiB, kilobytes, kibibytes)"));
        }
        try {
            return strM88042.matches("[0-9]+") ? unit.bytes.multiply(new BigInteger(strM88042)) : new BigDecimal(unit.bytes).multiply(new BigDecimal(strM88042)).toBigInteger();
        } catch (NumberFormatException unused) {
            throw new ConfigException.BadValue(interfaceC8990, str2, AbstractC0900.m718("Could not parse size-in-bytes number '", strM88042, "'"));
        }
    }

    public static long parseDuration(String str, InterfaceC8990 interfaceC8990, String str2) {
        TimeUnit timeUnit;
        String strM8804 = AbstractC4696.m8804(str);
        String units = getUnits(strM8804);
        String strM88042 = AbstractC4696.m8804(strM8804.substring(0, strM8804.length() - units.length()));
        if (strM88042.length() == 0) {
            throw new ConfigException.BadValue(interfaceC8990, str2, AbstractC0900.m718("No number in duration value '", str, "'"));
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
                throw new ConfigException.BadValue(interfaceC8990, str2, AbstractC0900.m718("Could not parse time unit '", units, "' (try ns, us, ms, s, m, h, d)"));
            }
            timeUnit = TimeUnit.MINUTES;
        }
        try {
            if (strM88042.matches("[+-]?[0-9]+")) {
                return timeUnit.toNanos(Long.parseLong(strM88042));
            }
            return (long) (Double.parseDouble(strM88042) * timeUnit.toNanos(serialVersionUID));
        } catch (NumberFormatException unused) {
            throw new ConfigException.BadValue(interfaceC8990, str2, AbstractC0900.m718("Could not parse duration number '", strM88042, "'"));
        }
    }

    public static Period parsePeriod(String str, InterfaceC8990 interfaceC8990, String str2) {
        ChronoUnit chronoUnit;
        String strM8804 = AbstractC4696.m8804(str);
        String units = getUnits(strM8804);
        String strM88042 = AbstractC4696.m8804(strM8804.substring(0, strM8804.length() - units.length()));
        if (strM88042.length() == 0) {
            throw new ConfigException.BadValue(interfaceC8990, str2, AbstractC0900.m718("No number in period value '", str, "'"));
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
                throw new ConfigException.BadValue(interfaceC8990, str2, AbstractC0900.m718("Could not parse time unit '", units, "' (try d, w, mo, y)"));
            }
            chronoUnit = ChronoUnit.YEARS;
        }
        try {
            return periodOf(Integer.parseInt(strM88042), chronoUnit);
        } catch (NumberFormatException unused) {
            throw new ConfigException.BadValue(interfaceC8990, str2, AbstractC0900.m718("Could not parse duration number '", strM88042, "'"));
        }
    }

    private AbstractC4675 peekPath(C4690 c4690) {
        return root().peekPath(c4690);
    }

    private static Period periodOf(int i, ChronoUnit chronoUnit) {
        if (chronoUnit.isTimeBased()) {
            throw new DateTimeException(chronoUnit + " cannot be converted to a java.time.Period");
        }
        int i2 = AbstractC4664.f12380[chronoUnit.ordinal()];
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

    private static AbstractC4675 throwIfNull(AbstractC4675 abstractC4675, ConfigValueType configValueType, C4690 c4690) {
        if (abstractC4675.valueType() == ConfigValueType.NULL) {
            throw new ConfigException.Null(abstractC4675.origin(), c4690.m8795(), configValueType != null ? configValueType.name() : null);
        }
        return abstractC4675;
    }

    private Long toLong(BigInteger bigInteger, InterfaceC8990 interfaceC8990, String str) {
        if (bigInteger.bitLength() < 64) {
            return Long.valueOf(bigInteger.longValue());
        }
        throw new ConfigException.BadValue(interfaceC8990, str, "size-in-bytes value is out of range for a 64-bit long: '" + bigInteger + "'");
    }

    private Object writeReplace() {
        return new SerializedConfigValue(this);
    }

    public SimpleConfig atKey(InterfaceC8990 interfaceC8990, String str) {
        return root().atKey(interfaceC8990, str);
    }

    public InterfaceC8995 atPath(String str) {
        return root().m8777atPath(str);
    }

    public void checkValid(InterfaceC8995 interfaceC8995, String... strArr) {
        SimpleConfig simpleConfig = (SimpleConfig) interfaceC8995;
        ResolveStatus resolveStatus = simpleConfig.root().resolveStatus();
        ResolveStatus resolveStatus2 = ResolveStatus.RESOLVED;
        if (resolveStatus != resolveStatus2) {
            C3775.m6968("do not call checkValid() with an unresolved reference config, call Config#resolve(), see Config#resolve() API docs");
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
                C4690 c4690M8793 = C4690.m8793(str);
                AbstractC4675 abstractC4675PeekPath = simpleConfig.peekPath(c4690M8793);
                if (abstractC4675PeekPath != null) {
                    AbstractC4675 abstractC4675PeekPath2 = peekPath(c4690M8793);
                    if (abstractC4675PeekPath2 != null) {
                        checkValid(c4690M8793, abstractC4675PeekPath, abstractC4675PeekPath2, arrayList);
                    } else {
                        addMissing(arrayList, abstractC4675PeekPath, c4690M8793, origin());
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            throw new ConfigException.ValidationFailed(arrayList);
        }
    }

    public Set<Map.Entry<String, InterfaceC8996>> entrySet() {
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

    public AbstractC4675 find(C4690 c4690, ConfigValueType configValueType, C4690 c46902) {
        return throwIfNull(findOrNull(this.object, c4690, configValueType, c46902), configValueType, c46902);
    }

    public Object getAnyRef(String str) {
        return find(str, null).unwrapped();
    }

    public List<? extends Object> getAnyRefList(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = getList(str).iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC8996) it.next()).unwrapped());
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
        final AbstractC4675 abstractC4675Find = find(str, ConfigValueType.LIST);
        return (List) getBytesListBigInteger(str).stream().map(new Function() { // from class: com.typesafe.config.impl.飘花落叶言子世楪苏兰哲
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.f12383.lambda$getBytesList$0(abstractC4675Find, str, (BigInteger) obj);
            }
        }).collect(Collectors.toList());
    }

    /* JADX INFO: renamed from: getConfig, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8736getConfig(String str) {
        return m8737getObject(str).toConfig();
    }

    public List<? extends InterfaceC8995> getConfigList(String str) {
        List<InterfaceC8991> objectList = getObjectList(str);
        ArrayList arrayList = new ArrayList();
        Iterator<InterfaceC8991> it = objectList.iterator();
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
        AbstractC4675 abstractC4675Find = find(str, ConfigValueType.STRING);
        return timeUnit.convert(parseDuration((String) abstractC4675Find.unwrapped(), abstractC4675Find.origin(), str), TimeUnit.NANOSECONDS);
    }

    public List<Long> getDurationList(String str, TimeUnit timeUnit) {
        ArrayList arrayList = new ArrayList();
        for (InterfaceC8996 interfaceC8996 : getList(str)) {
            if (interfaceC8996.valueType() == ConfigValueType.NUMBER) {
                arrayList.add(Long.valueOf(timeUnit.convert(((Number) interfaceC8996.unwrapped()).longValue(), TimeUnit.MILLISECONDS)));
            } else {
                if (interfaceC8996.valueType() != ConfigValueType.STRING) {
                    throw new ConfigException.WrongType(interfaceC8996.origin(), str, "duration string or number of milliseconds", interfaceC8996.valueType().name());
                }
                arrayList.add(Long.valueOf(timeUnit.convert(parseDuration((String) interfaceC8996.unwrapped(), interfaceC8996.origin(), str), TimeUnit.NANOSECONDS)));
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
            arrayList.add(Integer.valueOf(((ConfigNumber) ((AbstractC4675) it.next())).intValueRangeChecked(str)));
        }
        return arrayList;
    }

    public boolean getIsNull(String str) {
        return findOrNull(str, null).valueType() == ConfigValueType.NULL;
    }

    public InterfaceC8994 getList(String str) {
        return (InterfaceC8994) find(str, ConfigValueType.LIST);
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

    public C8993 getMemorySize(String str) {
        return C8993.m14175(getBytesBigInteger(str));
    }

    public List<C8993> getMemorySizeList(String str) {
        return (List) getBytesListBigInteger(str).stream().map(new C3533(10)).collect(Collectors.toList());
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
    public AbstractC4678 m8737getObject(String str) {
        return (AbstractC4678) find(str, ConfigValueType.OBJECT);
    }

    public List<InterfaceC8991> getObjectList(String str) {
        return getHomogeneousWrappedList(str, ConfigValueType.OBJECT);
    }

    public Period getPeriod(String str) {
        AbstractC4675 abstractC4675Find = find(str, ConfigValueType.STRING);
        return parsePeriod((String) abstractC4675Find.unwrapped(), abstractC4675Find.origin(), str);
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
    public AbstractC4675 m8738getValue(String str) {
        return find(str, null);
    }

    public boolean hasPath(String str) {
        InterfaceC8996 interfaceC8996HasPathPeek = hasPathPeek(str);
        return (interfaceC8996HasPathPeek == null || interfaceC8996HasPathPeek.valueType() == ConfigValueType.NULL) ? false : true;
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

    public InterfaceC8990 origin() {
        return this.object.origin();
    }

    /* JADX INFO: renamed from: resolve, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8739resolve() {
        return m8740resolve(new C4697());
    }

    /* JADX INFO: renamed from: resolveWith, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8742resolveWith(InterfaceC8995 interfaceC8995, C4697 c4697) {
        AbstractC4678 abstractC4678 = this.object;
        C4681 c4681 = new C4681(((SimpleConfig) interfaceC8995).object);
        C4679 c4679 = new C4679(new C4683(new C4674(0, C4674.f12410)), c4697, null, new ArrayList(), Collections.newSetFromMap(new IdentityHashMap()));
        if (AbstractC4695.m8799()) {
            AbstractC4695.m8801(c4679.m8785(), "ResolveContext restrict to child null");
        }
        try {
            AbstractC4675 abstractC4675 = c4679.m8783(abstractC4678, c4681).f12423;
            return abstractC4675 == this.object ? this : new SimpleConfig((AbstractC4678) abstractC4675);
        } catch (AbstractConfigValue$NotPossibleToResolve e) {
            throw new ConfigException.BugOrBroken("NotPossibleToResolve was thrown from an outermost resolve", e);
        }
    }

    public String toString() {
        return "Config(" + this.object.toString() + ")";
    }

    /* JADX INFO: renamed from: withFallback, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public SimpleConfig m8744withFallback(InterfaceC8992 interfaceC8992) {
        return this.object.mo8779withFallback(interfaceC8992).toConfig();
    }

    /* JADX INFO: renamed from: withOnlyPath, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8745withOnlyPath(String str) {
        return new SimpleConfig(root().withOnlyPath(C4690.m8793(str)));
    }

    /* JADX INFO: renamed from: withValue, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8746withValue(String str, InterfaceC8996 interfaceC8996) {
        return new SimpleConfig(root().withValue(C4690.m8793(str), interfaceC8996));
    }

    /* JADX INFO: renamed from: withoutPath, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8747withoutPath(String str) {
        return new SimpleConfig(root().withoutPath(C4690.m8793(str)));
    }

    @Override // p266.InterfaceC8995
    public AbstractC4678 root() {
        return this.object;
    }

    @Override // com.typesafe.config.impl.InterfaceC4689
    public AbstractC4678 toFallbackValue() {
        return this.object;
    }

    /* JADX INFO: renamed from: atKey, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8735atKey(String str) {
        return root().m8776atKey(str);
    }

    public AbstractC4675 find(String str, ConfigValueType configValueType) {
        C4690 c4690M8793 = C4690.m8793(str);
        return find(c4690M8793, configValueType, c4690M8793);
    }

    /* JADX INFO: renamed from: resolve, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8740resolve(C4697 c4697) {
        return m8742resolveWith((InterfaceC8995) this, c4697);
    }

    public Duration getDuration(String str) {
        AbstractC4675 abstractC4675Find = find(str, ConfigValueType.STRING);
        return Duration.ofNanos(parseDuration((String) abstractC4675Find.unwrapped(), abstractC4675Find.origin(), str));
    }

    private static void addMissing(List<ConfigException.ValidationProblem> list, InterfaceC8996 interfaceC8996, C4690 c4690, InterfaceC8990 interfaceC8990) {
        addMissing(list, getDesc(interfaceC8996), c4690, interfaceC8990);
    }

    public static void addMissing(List<ConfigException.ValidationProblem> list, ConfigValueType configValueType, C4690 c4690, InterfaceC8990 interfaceC8990) {
        addMissing(list, getDesc(configValueType), c4690, interfaceC8990);
    }

    private static void addWrongType(List<ConfigException.ValidationProblem> list, InterfaceC8996 interfaceC8996, AbstractC4675 abstractC4675, C4690 c4690) {
        addWrongType(list, getDesc(interfaceC8996), abstractC4675, c4690);
    }

    private static void addWrongType(List<ConfigException.ValidationProblem> list, ConfigValueType configValueType, AbstractC4675 abstractC4675, C4690 c4690) {
        addWrongType(list, getDesc(configValueType), abstractC4675, c4690);
    }

    private static String getDesc(ConfigValueType configValueType) {
        return configValueType.name().toLowerCase();
    }

    private AbstractC4675 findOrNull(C4690 c4690, ConfigValueType configValueType, C4690 c46902) {
        return findOrNull(this.object, c4690, configValueType, c46902);
    }

    private AbstractC4675 findOrNull(String str, ConfigValueType configValueType) {
        C4690 c4690M8793 = C4690.m8793(str);
        return findOrNull(c4690M8793, configValueType, c4690M8793);
    }

    private static boolean haveCompatibleTypes(InterfaceC8996 interfaceC8996, AbstractC4675 abstractC4675) {
        if (couldBeNull((AbstractC4675) interfaceC8996)) {
            return true;
        }
        return haveCompatibleTypes(interfaceC8996.valueType(), abstractC4675);
    }

    /* JADX INFO: renamed from: resolveWith, reason: merged with bridge method [inline-methods] */
    public SimpleConfig m8741resolveWith(InterfaceC8995 interfaceC8995) {
        return m8742resolveWith(interfaceC8995, new C4697());
    }

    private static void checkValid(C4690 c4690, InterfaceC8996 interfaceC8996, AbstractC4675 abstractC4675, List<ConfigException.ValidationProblem> list) {
        if (haveCompatibleTypes(interfaceC8996, abstractC4675)) {
            if ((interfaceC8996 instanceof AbstractC4678) && (abstractC4675 instanceof AbstractC4678)) {
                checkValidObject(c4690, (AbstractC4678) interfaceC8996, (AbstractC4678) abstractC4675, list);
                return;
            }
            boolean z = interfaceC8996 instanceof SimpleConfigList;
            if (z && (abstractC4675 instanceof SimpleConfigList)) {
                checkListCompatibility(c4690, (SimpleConfigList) interfaceC8996, (SimpleConfigList) abstractC4675, list);
                return;
            }
            if (z && (abstractC4675 instanceof SimpleConfigObject)) {
                SimpleConfigList simpleConfigList = (SimpleConfigList) interfaceC8996;
                AbstractC4675 abstractC4675M8789 = AbstractC4686.m8789(ConfigValueType.LIST, abstractC4675);
                if (abstractC4675M8789 instanceof SimpleConfigList) {
                    checkListCompatibility(c4690, simpleConfigList, (SimpleConfigList) abstractC4675M8789, list);
                    return;
                } else {
                    addWrongType(list, interfaceC8996, abstractC4675, c4690);
                    return;
                }
            }
            return;
        }
        addWrongType(list, interfaceC8996, abstractC4675, c4690);
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

    public static void checkValid(C4690 c4690, ConfigValueType configValueType, AbstractC4675 abstractC4675, List<ConfigException.ValidationProblem> list) {
        if (haveCompatibleTypes(configValueType, abstractC4675)) {
            ConfigValueType configValueType2 = ConfigValueType.LIST;
            if (configValueType == configValueType2 && (abstractC4675 instanceof SimpleConfigObject) && !(AbstractC4686.m8789(configValueType2, abstractC4675) instanceof SimpleConfigList)) {
                addWrongType(list, configValueType, abstractC4675, c4690);
                return;
            }
            return;
        }
        addWrongType(list, configValueType, abstractC4675, c4690);
    }
}
