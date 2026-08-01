package p307;

import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.C3728;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONObject;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3699;
import com.alibaba.fastjson2.util.AbstractC3700;
import com.alibaba.fastjson2.util.DateUtils$DateTimeFormatPattern;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C9353 implements InterfaceC9352 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f24056;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC9323[] f24057;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f24058;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f24059;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f24060;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f24061;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final long[] f24062;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long f24063;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f24064;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f24065;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final short[] f24066;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f24067;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String f24068;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public byte[] f24069;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public byte[] f24070;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public char[] f24071;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long f24072;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final byte[] f24073;

    public C9353(Class cls, String str, String str2, long j, List list) {
        if (str2 == null && cls != null) {
            str2 = (!Enum.class.isAssignableFrom(cls) || cls.isEnum()) ? AbstractC3700.m6503(cls) : cls.getSuperclass().getName();
        }
        this.f24059 = cls;
        this.f24056 = (str == null || str.isEmpty()) ? "@type" : str;
        this.f24068 = str2;
        this.f24072 = str2 != null ? AbstractC3693.m6334(str2) : 0L;
        this.f24073 = InterfaceC3745.m6915(str2);
        this.f24063 = j;
        this.f24058 = list;
        this.f24064 = cls == null || Serializable.class.isAssignableFrom(cls);
        this.f24061 = "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(str2) || "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet".equals(str2);
        AbstractC9323[] abstractC9323Arr = new AbstractC9323[list.size()];
        this.f24057 = abstractC9323Arr;
        list.toArray(abstractC9323Arr);
        this.f24067 = abstractC9323Arr.length == 1 && (abstractC9323Arr[0].f23956 & 281474976710656L) != 0;
        int length = abstractC9323Arr.length;
        long[] jArr = new long[length];
        int i = 0;
        boolean z = false;
        while (true) {
            AbstractC9323[] abstractC9323Arr2 = this.f24057;
            if (i >= abstractC9323Arr2.length) {
                break;
            }
            AbstractC9323 abstractC9323 = abstractC9323Arr2[i];
            jArr[i] = AbstractC3693.m6334(abstractC9323.f23963);
            if (abstractC9323.f23948 != null && (abstractC9323.f23956 & 4503599627370496L) == 0) {
                z = true;
            }
            i++;
        }
        this.f24065 = z;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.f24062 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.f24066 = new short[jArrCopyOf.length];
        for (int i2 = 0; i2 < length; i2++) {
            this.f24066[Arrays.binarySearch(this.f24062, jArr[i2])] = (short) i2;
        }
    }

    @Override // p307.InterfaceC9352
    public final long getFeatures() {
        return this.f24063;
    }

    public final String toString() {
        return this.f24059.getName();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14658(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        C3728 c3728 = abstractC3730.f9523;
        if (obj == null) {
            abstractC3730.mo6527();
            return;
        }
        if (!abstractC3730.m6618(obj, type, j)) {
            abstractC3730.mo6557();
        } else if (abstractC3730.f9516) {
            abstractC3730.mo6603(this.f24072, this.f24073);
            abstractC3730.mo6557();
        } else {
            abstractC3730.mo6557();
            m14659(abstractC3730);
        }
        long j2 = c3728.f9498 | j;
        long j3 = JSONWriter$Feature.ReferenceDetection.mask;
        int i = 0;
        boolean z = (j2 & JSONWriter$Feature.IgnoreNonFieldGetter.mask) != 0;
        while (true) {
            List list = this.f24058;
            if (i >= list.size()) {
                abstractC3730.mo6554();
                return;
            }
            AbstractC9323 abstractC9323 = (AbstractC9323) list.get(i);
            Field field = abstractC9323.f23958;
            if (!z || abstractC9323.f23948 == null || (abstractC9323.f23956 & 4503599627370496L) != 0) {
                abstractC9323.mo14558(abstractC3730, obj);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14659(AbstractC3730 abstractC3730) {
        boolean z = abstractC3730.f9521;
        String str = this.f24068;
        String str2 = this.f24056;
        if (z) {
            if (this.f24070 == null) {
                int length = str2.length();
                int length2 = str.length();
                int i = length + length2;
                byte[] bArr = new byte[i + 5];
                bArr[0] = 34;
                str2.getBytes(0, length, bArr, 1);
                bArr[length + 1] = 34;
                bArr[length + 2] = 58;
                bArr[length + 3] = 34;
                str.getBytes(0, length2, bArr, length + 4);
                bArr[i + 4] = 34;
                this.f24070 = bArr;
            }
            abstractC3730.mo6534(this.f24070);
            return true;
        }
        if (!abstractC3730.f9522) {
            if (!abstractC3730.f9516) {
                abstractC3730.mo6577(str2);
                abstractC3730.mo6539();
                abstractC3730.mo6577(str);
                return true;
            }
            if (this.f24069 == null) {
                this.f24069 = InterfaceC3745.m6915(str2);
            }
            abstractC3730.mo6568(this.f24069);
            abstractC3730.mo6568(this.f24073);
            return true;
        }
        if (this.f24071 == null) {
            int length3 = str2.length();
            int length4 = str.length();
            int i2 = length3 + length4;
            char[] cArr = new char[i2 + 5];
            cArr[0] = '\"';
            str2.getChars(0, length3, cArr, 1);
            cArr[length3 + 1] = '\"';
            cArr[length3 + 2] = ':';
            cArr[length3 + 3] = '\"';
            str.getChars(0, length4, cArr, length3 + 4);
            cArr[i2 + 4] = '\"';
            this.f24071 = cArr;
        }
        abstractC3730.mo6526(this.f24071);
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:251:0x057b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public JSONObject mo14651(Object obj, long j) {
        List list;
        long j2;
        JSONObject jSONObject;
        int i;
        int i2;
        long j3;
        JSONObject jSONObject2;
        int i3;
        Object obj2;
        String str;
        int year;
        int monthValue;
        int dayOfMonth;
        long j4;
        String str2;
        long j5;
        String strM6418;
        Object obj3 = obj;
        long j6 = this.f24063;
        JSONObject jSONObject3 = new JSONObject();
        List list2 = this.f24058;
        int size = list2.size();
        int i4 = 0;
        while (i4 < size) {
            AbstractC9323 abstractC9323 = (AbstractC9323) list2.get(i4);
            Object objMo14554 = abstractC9323.mo14554(obj3);
            String str3 = abstractC9323.f23959;
            Class cls = abstractC9323.f23962;
            if (str3 != null) {
                j3 = 0;
                list = list2;
                j2 = j6;
                i = size;
                if (cls != Date.class) {
                    jSONObject = jSONObject3;
                    i2 = i4;
                    if (cls == LocalDate.class) {
                        LocalDate localDate = (LocalDate) objMo14554;
                        ZoneId zoneId = AbstractC3699.f9372;
                        if (localDate != null) {
                            year = localDate.getYear();
                            monthValue = localDate.getMonthValue();
                            dayOfMonth = localDate.getDayOfMonth();
                            switch (str3) {
                                case "yyyy-MM-dd":
                                    str = AbstractC3699.m6419(year, monthValue, dayOfMonth, DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DASH);
                                    break;
                                case "yyyy/MM/dd":
                                    str = AbstractC3699.m6419(year, monthValue, dayOfMonth, DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_SLASH);
                                    break;
                                case "yyyy-MM-dd HH:mm:ss":
                                    str = AbstractC3699.m6420(year, monthValue, dayOfMonth, 0, 0, 0, DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH);
                                    break;
                                case "yyyy-MM-dd'T'HH:mm:ss":
                                case "yyyy-MM-ddTHH:mm:ss":
                                    str = AbstractC3699.m6420(year, monthValue, dayOfMonth, 0, 0, 0, DateUtils$DateTimeFormatPattern.DATE_TIME_FORMAT_19_DASH_T);
                                    break;
                                case "dd.MM.yyyy":
                                    str = AbstractC3699.m6419(year, monthValue, dayOfMonth, DateUtils$DateTimeFormatPattern.DATE_FORMAT_10_DOT);
                                    break;
                                default:
                                    str = DateTimeFormatter.ofPattern(str3).format(localDate);
                                    break;
                            }
                            objMo14554 = str;
                        }
                        objMo14554 = null;
                    } else if (cls == LocalDateTime.class) {
                        LocalDateTime localDateTime = (LocalDateTime) objMo14554;
                        ZoneId zoneId2 = AbstractC3699.f9372;
                        if (localDateTime != null) {
                            int year2 = localDateTime.getYear();
                            int monthValue2 = localDateTime.getMonthValue();
                            int dayOfMonth2 = localDateTime.getDayOfMonth();
                            switch (str3.hashCode()) {
                                case -159776256:
                                    if (str3.equals("yyyy-MM-dd")) {
                                    }
                                    break;
                                case -102516032:
                                    if (str3.equals("yyyy/MM/dd")) {
                                    }
                                    break;
                                case 1333195168:
                                    if (str3.equals("yyyy-MM-dd HH:mm:ss")) {
                                    }
                                    break;
                                case 1798231098:
                                    if (str3.equals("yyyy-MM-dd'T'HH:mm:ss")) {
                                    }
                                    break;
                                case 1834843604:
                                    if (str3.equals("yyyy-MM-ddTHH:mm:ss")) {
                                    }
                                    break;
                                case 1900521056:
                                    if (str3.equals("dd.MM.yyyy")) {
                                    }
                                    break;
                            }
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Switch insn not found in header
                                	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:88)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:305)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:284)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:412)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                	at jadx.core.ProcessClass.process(ProcessClass.java:88)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
                                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                                */
                            /*
                                Method dump skipped, instruction units count: 1664
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: p307.C9353.mo14651(java.lang.Object, long):com.alibaba.fastjson2.JSONObject");
                        }

                        /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
                        public final void m14660() {
                            throw new JSONException("not support none serializable class ".concat(this.f24059.getName()));
                        }

                        @Override // p307.InterfaceC9352
                        /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
                        public AbstractC9323 mo14650(long j) {
                            int iBinarySearch = Arrays.binarySearch(this.f24062, j);
                            if (iBinarySearch < 0) {
                                return null;
                            }
                            return this.f24057[this.f24066[iBinarySearch]];
                        }

                        @Override // p307.InterfaceC9352
                        /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
                        public final boolean mo14656(AbstractC3730 abstractC3730) {
                            return (this.f24065 && (abstractC3730.f9523.f9498 & JSONWriter$Feature.IgnoreNonFieldGetter.mask) != 0) | this.f24060;
                        }

                        @Override // p307.InterfaceC9352
                        /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
                        public void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
                            long j2 = this.f24063 | j | abstractC3730.f9523.f9498;
                            if (!this.f24064) {
                                if ((JSONWriter$Feature.ErrorOnNoneSerializable.mask & j2) != 0) {
                                    m14660();
                                    throw null;
                                }
                                if ((JSONWriter$Feature.IgnoreNoneSerializable.mask & j2) != 0) {
                                    abstractC3730.mo6527();
                                    return;
                                }
                            }
                            if ((j2 & JSONWriter$Feature.IgnoreNoneSerializable.mask) != 0) {
                                m14658(abstractC3730, obj, obj2, type, j);
                                return;
                            }
                            int length = this.f24057.length;
                            if (abstractC3730.m6618(obj, type, j)) {
                                abstractC3730.mo6603(this.f24072, this.f24073);
                            }
                            abstractC3730.mo6557();
                            for (int i = 0; i < length; i++) {
                                ((AbstractC9323) this.f24058.get(i)).mo14558(abstractC3730, obj);
                            }
                            abstractC3730.mo6554();
                        }

                        @Override // p307.InterfaceC9352
                        /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
                        public final void mo14577(AbstractC3730 abstractC3730, Object obj, Type type, long j) {
                            if (abstractC3730.m6618(obj, type, j)) {
                                abstractC3730.mo6603(this.f24072, this.f24073);
                            }
                            List list = this.f24058;
                            int size = list.size();
                            abstractC3730.mo6600(size);
                            for (int i = 0; i < size; i++) {
                                ((AbstractC9323) list.get(i)).mo14557(abstractC3730, obj);
                            }
                        }

                        @Override // p307.InterfaceC9352
                        /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
                        public void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
                            if (this.f24067) {
                                this.f24057[0].mo14557(abstractC3730, obj);
                                return;
                            }
                            long j2 = j | this.f24063;
                            long j3 = abstractC3730.f9523.f9498 | j2;
                            boolean z = (JSONWriter$Feature.BeanToArray.mask & j3) != 0;
                            if (abstractC3730.f9516) {
                                if (z) {
                                    mo14577(abstractC3730, obj, type, j);
                                    return;
                                } else {
                                    mo6238(abstractC3730, obj, obj2, type, j);
                                    return;
                                }
                            }
                            if (this.f24061) {
                                C9300.f23846.mo6239(abstractC3730, (Collection) obj, obj2, type, j);
                                return;
                            }
                            if (z) {
                                mo14578(abstractC3730, obj, obj2, type, j);
                                return;
                            }
                            if (!this.f24064) {
                                if ((JSONWriter$Feature.ErrorOnNoneSerializable.mask & j3) != 0) {
                                    m14660();
                                    throw null;
                                }
                                if ((j3 & JSONWriter$Feature.IgnoreNoneSerializable.mask) != 0) {
                                    abstractC3730.mo6527();
                                    return;
                                }
                            }
                            if (mo14656(abstractC3730)) {
                                m14658(abstractC3730, obj, obj2, type, j);
                                return;
                            }
                            abstractC3730.mo6557();
                            if ((j2 & JSONWriter$Feature.WriteClassName.mask) != 0 || abstractC3730.m6620(obj, j)) {
                                m14659(abstractC3730);
                            }
                            List list = this.f24058;
                            int size = list.size();
                            for (int i = 0; i < size; i++) {
                                ((AbstractC9323) list.get(i)).mo14558(abstractC3730, obj);
                            }
                            abstractC3730.mo6554();
                        }

                        @Override // p307.InterfaceC9352
                        /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
                        public final List mo14657() {
                            return this.f24058;
                        }
                    }
