package com.alibaba.fastjson2.stream;

import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.reader.FieldReader;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.reader.ObjectReaderProvider;
import com.alibaba.fastjson2.support.csv.CSVReader;
import com.alibaba.fastjson2.util.DateUtils;
import com.alibaba.fastjson2.util.JDKUtils;
import com.alibaba.fastjson2.util.TypeUtils;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import p376zd.C9987e;

/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class StreamReader<T> {
    protected static final int SIZE_512K = 524288;
    protected List<ColumnStat> columnStats;
    protected Map<String, ColumnStat> columnStatsMap;
    protected List<String> columns;
    protected int end;
    protected int errorCount;
    protected long features;
    protected FieldReader[] fieldReaders;
    protected boolean inputEnd;
    protected int lineEnd;
    protected int lineNextStart;
    protected int lineSize;
    protected int lineStart;
    protected boolean lineTerminated = true;
    protected int[] mapping;
    protected Supplier objectCreator;
    protected int off;
    protected int rowCount;
    protected ObjectReader[] typeReaders;
    protected Type[] types;

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public enum Feature {
        IgnoreEmptyLine(1),
        ErrorAsNull(2);

        public final long mask;

        Feature(long j10) {
            this.mask = j10;
        }
    }

    public StreamReader(Type[] typeArr) {
        this.types = typeArr;
        if (typeArr.length == 0) {
            this.typeReaders = new ObjectReader[0];
            return;
        }
        ObjectReaderProvider defaultObjectReaderProvider = JSONFactory.getDefaultObjectReaderProvider();
        ObjectReader[] objectReaderArr = new ObjectReader[typeArr.length];
        for (int i10 = 0; i10 < typeArr.length; i10++) {
            Type type = typeArr[i10];
            if (type == String.class || type == Object.class) {
                objectReaderArr[i10] = null;
            } else {
                objectReaderArr[i10] = defaultObjectReaderProvider.getObjectReader(type);
            }
        }
        this.typeReaders = objectReaderArr;
    }

    public abstract <T> T readLineObject();

    public abstract boolean seekLine();

    public <T> Stream<T> stream() {
        return StreamSupport.stream(new StreamReaderSpliterator(this), false);
    }

    public <T> Stream<T> stream(Class<T> cls) {
        return StreamSupport.stream(new StreamReaderSpliterator(this, cls), false);
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class StreamReaderSpliterator<T> implements Spliterator<T> {
        private Class<T> clazz;
        private CSVReader csvReader;
        private final StreamReader<T> streamReader;

        public StreamReaderSpliterator(StreamReader<T> streamReader, Class<T> cls) {
            this.streamReader = streamReader;
            this.clazz = cls;
            if (streamReader instanceof CSVReader) {
                CSVReader cSVReader = (CSVReader) streamReader;
                if (cSVReader.isObjectSupport()) {
                    return;
                }
                this.csvReader = cSVReader;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        private T next() {
            CSVReader cSVReader = this.csvReader;
            if (cSVReader == null) {
                return this.streamReader.readLineObject();
            }
            T t10 = (T) cSVReader.readLineValues();
            if (!(!r1.isAssignableFrom(t10.getClass())) || !(this.clazz != null)) {
                return t10;
            }
            throw new ClassCastException(String.format("%s can not cast to %s", t10.getClass(), this.clazz));
        }

        @Override // java.util.Spliterator
        public int characteristics() {
            return 1296;
        }

        @Override // java.util.Spliterator
        public long estimateSize() {
            StreamReader<T> streamReader = this.streamReader;
            return (!streamReader.inputEnd || streamReader.off < streamReader.end) ? Long.MAX_VALUE : 0L;
        }

        @Override // java.util.Spliterator
        public boolean tryAdvance(Consumer<? super T> consumer) {
            if (consumer == null) {
                C9987e.m38645a("action must not be null");
                return false;
            }
            T next = next();
            StreamReader<T> streamReader = this.streamReader;
            if ((streamReader.inputEnd && streamReader.off >= streamReader.end) || next == null) {
                return false;
            }
            consumer.accept(next);
            return true;
        }

        @Override // java.util.Spliterator
        public Spliterator<T> trySplit() {
            throw new UnsupportedOperationException("parallel stream not supported");
        }

        public StreamReaderSpliterator(StreamReader<T> streamReader) {
            this.streamReader = streamReader;
            if (streamReader instanceof CSVReader) {
                CSVReader cSVReader = (CSVReader) streamReader;
                if (cSVReader.isObjectSupport()) {
                    return;
                }
                this.csvReader = cSVReader;
            }
        }
    }

    public StreamReader() {
    }

    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class ColumnStat {
        public int arrays;
        public int booleans;
        public int dates;
        public int doubles;
        public int errors;
        public int integers;
        public int maps;

        @JSONField(ordinal = -1)
        public final String name;
        public int nonAsciiStrings;
        public int nulls;
        public int numbers;
        public int precision;
        public int scale;
        public int values;

        public ColumnStat(String str) {
            this.name = str;
        }

        public String getInferSQLType() {
            int i10;
            int i11;
            if (this.nonAsciiStrings <= 0 && (i10 = this.nulls) != (i11 = this.values)) {
                if (i11 == this.dates + i10) {
                    return this.precision != 0 ? "TIMESTAMP" : "DATETIME";
                }
                if (i11 == this.integers + i10) {
                    int i12 = this.precision;
                    if (i12 < 10) {
                        return "INT";
                    }
                    if (i12 < 20) {
                        return "BIGINT";
                    }
                    return "DECIMAL(" + this.precision + ", 0)";
                }
                if (i11 == this.numbers + i10) {
                    if (this.doubles > 0 || this.scale > 5) {
                        return "DOUBLE";
                    }
                    int i13 = this.precision;
                    if (i13 < 19) {
                        i13 = 19;
                    }
                    return "DECIMAL(" + i13 + ", " + this.scale + ")";
                }
            }
            return "STRING";
        }

        public Type getInferType() {
            int i10;
            int i11;
            if (this.nonAsciiStrings <= 0 && (i10 = this.nulls) != (i11 = this.values)) {
                if (i11 == this.booleans + i10) {
                    return Boolean.class;
                }
                if (i11 == this.dates + i10) {
                    return this.precision != 0 ? Instant.class : Date.class;
                }
                if (this.doubles > 0) {
                    return Double.class;
                }
                if (i11 == this.integers + i10) {
                    int i12 = this.precision;
                    return i12 < 10 ? Integer.class : i12 < 20 ? Long.class : BigInteger.class;
                }
                if (i11 == this.numbers + i10) {
                    return BigDecimal.class;
                }
                if (this.arrays > 0) {
                    return Collection.class;
                }
                if (this.maps > 0) {
                    return Map.class;
                }
            }
            return String.class;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v16, types: [java.time.LocalDateTime] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v28 */
        /* JADX WARN: Type inference failed for: r2v29 */
        /* JADX WARN: Type inference failed for: r2v30 */
        public void stat(char[] cArr, int i10, int i11) {
            LocalDateTime localDateTime;
            ZonedDateTime zonedDateTime;
            this.values++;
            if (i11 == 0) {
                this.nulls++;
                return;
            }
            int i12 = i10 + i11;
            for (int i13 = i10; i13 < i12; i13++) {
                if (cArr[i13] > 127) {
                    if (this.precision < i11) {
                        this.precision = i11;
                    }
                    this.nonAsciiStrings++;
                    return;
                }
            }
            boolean z10 = false;
            if (TypeUtils.isNumber(cArr, i10, i11)) {
                char c10 = cArr[i10];
                int i14 = (c10 == '+' || c10 == '-') ? i11 - 1 : i11;
                this.numbers++;
                if (TypeUtils.isInteger(cArr, i10, i11)) {
                    this.integers++;
                } else {
                    int i15 = -1;
                    while (i10 < i12) {
                        char c11 = cArr[i10];
                        if (c11 == '.') {
                            i15 = i10;
                        } else if (c11 == 'e' || c11 == 'E') {
                            z10 = true;
                        }
                        i10++;
                    }
                    if (z10) {
                        this.doubles++;
                    } else if (i15 != -1) {
                        int i16 = (i12 - i15) - 1;
                        if (this.scale < i16) {
                            this.scale = i16;
                        }
                        i14--;
                    }
                }
                i11 = i14;
            } else {
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                for (int i21 = i10; i21 < i12; i21++) {
                    char c12 = cArr[i21];
                    if (c12 != ':') {
                        switch (c12) {
                            case '-':
                                i17++;
                                break;
                            case Opcodes.IALOAD /* 46 */:
                                break;
                            case '/':
                                i18++;
                                break;
                            default:
                                if (c12 >= '0' && c12 <= '9') {
                                    i20++;
                                }
                                break;
                        }
                    } else {
                        i19++;
                    }
                }
                boolean z11 = i17 == 2 || i18 == 2 || i19 == 2;
                if (z11 && (i20 < 2 || i11 > 36)) {
                    z11 = false;
                }
                if (z11) {
                    try {
                        switch (i11) {
                            case 8:
                                localDateTime = DateUtils.parseLocalDate8(cArr, i10).atStartOfDay();
                                break;
                            case 9:
                                localDateTime = DateUtils.parseLocalDate9(cArr, i10).atStartOfDay();
                                break;
                            case 10:
                                localDateTime = DateUtils.parseLocalDate10(cArr, i10).atStartOfDay();
                                break;
                            default:
                                localDateTime = 0;
                                break;
                        }
                        if (localDateTime == 0 && (zonedDateTime = DateUtils.parseZonedDateTime(new String(cArr, i10, i11))) != null) {
                            localDateTime = zonedDateTime.toLocalDateTime();
                        }
                        if (localDateTime != 0) {
                            try {
                                this.dates++;
                                i11 = 0;
                            } catch (Exception unused) {
                                i11 = 0;
                                this.errors++;
                            }
                        }
                        int nano = localDateTime.getNano();
                        if (nano != 0) {
                            if (nano % 100000000 == 0) {
                                i11 = 1;
                            } else if (nano % 10000000 == 0) {
                                i11 = 2;
                            } else {
                                i11 = nano % 1000000 == 0 ? 3 : nano % 100000 == 0 ? 4 : nano % 10000 == 0 ? 5 : nano % 1000 == 0 ? 6 : nano % 100 == 0 ? 7 : nano % 10 == 0 ? 8 : 9;
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            if (this.precision < i11) {
                this.precision = i11;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v14 */
        /* JADX WARN: Type inference failed for: r2v16, types: [java.time.LocalDateTime] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v30 */
        /* JADX WARN: Type inference failed for: r2v31 */
        /* JADX WARN: Type inference failed for: r2v32 */
        public void stat(byte[] bArr, int i10, int i11, Charset charset) {
            LocalDateTime localDateTime;
            int i12;
            ZonedDateTime zonedDateTime;
            this.values++;
            if (i11 == 0) {
                this.nulls++;
                return;
            }
            int i13 = i10 + i11;
            for (int i14 = i10; i14 < i13; i14++) {
                if (bArr[i14] < 0) {
                    if (this.precision < i11) {
                        this.precision = i11;
                    }
                    this.nonAsciiStrings++;
                    return;
                }
            }
            boolean z10 = false;
            if (TypeUtils.isNumber(bArr, i10, i11)) {
                char c10 = (char) bArr[i10];
                int i15 = (c10 == '+' || c10 == '-') ? i11 - 1 : i11;
                this.numbers++;
                if (TypeUtils.isInteger(bArr, i10, i11)) {
                    this.integers++;
                } else {
                    int i16 = -1;
                    while (i10 < i13) {
                        byte b10 = bArr[i10];
                        if (b10 == 46) {
                            i16 = i10;
                        } else if (b10 == 101 || b10 == 69) {
                            z10 = true;
                        }
                        i10++;
                    }
                    if (z10) {
                        this.doubles++;
                    } else if (i16 != -1) {
                        int i17 = (i13 - i16) - 1;
                        if (this.scale < i17) {
                            this.scale = i17;
                        }
                        i15--;
                    }
                }
                i11 = i15;
            } else {
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                for (int i22 = i10; i22 < i13; i22++) {
                    char c11 = (char) bArr[i22];
                    if (c11 != ':') {
                        switch (c11) {
                            case '-':
                                i18++;
                                break;
                            case Opcodes.IALOAD /* 46 */:
                                break;
                            case '/':
                                i19++;
                                break;
                            default:
                                if (c11 >= '0' && c11 <= '9') {
                                    i21++;
                                }
                                break;
                        }
                    } else {
                        i20++;
                    }
                }
                boolean z11 = i18 == 2 || i19 == 2 || i20 == 2;
                if (z11 && (i21 < 2 || i11 > 36)) {
                    z11 = false;
                }
                if (z11) {
                    try {
                        switch (i11) {
                            case 8:
                                localDateTime = DateUtils.parseLocalDate8(bArr, i10).atStartOfDay();
                                break;
                            case 9:
                                localDateTime = DateUtils.parseLocalDate9(bArr, i10).atStartOfDay();
                                break;
                            case 10:
                                localDateTime = DateUtils.parseLocalDate10(bArr, i10).atStartOfDay();
                                break;
                            default:
                                localDateTime = 0;
                                break;
                        }
                        if (localDateTime == 0 && (zonedDateTime = DateUtils.parseZonedDateTime(new String(bArr, i10, i11, charset))) != null) {
                            localDateTime = zonedDateTime.toLocalDateTime();
                        }
                        if (localDateTime != 0) {
                            try {
                                this.dates++;
                                i11 = 0;
                            } catch (Exception unused) {
                                i11 = 0;
                                this.errors++;
                            }
                        }
                        int nano = localDateTime.getNano();
                        if (nano != 0) {
                            if (nano % 100000000 == 0) {
                                i11 = 1;
                            } else if (nano % 10000000 == 0) {
                                i11 = 2;
                            } else {
                                if (nano % 1000000 == 0) {
                                    i12 = 3;
                                } else if (nano % 100000 == 0) {
                                    i12 = 4;
                                } else if (nano % 10000 == 0) {
                                    i12 = 5;
                                } else if (nano % 1000 == 0) {
                                    i12 = 6;
                                } else if (nano % 100 == 0) {
                                    i12 = 7;
                                } else {
                                    i12 = nano % 10 == 0 ? 8 : 9;
                                }
                                i11 = i12;
                            }
                        }
                    } catch (Exception unused2) {
                    }
                }
            }
            if (this.precision < i11) {
                this.precision = i11;
            }
        }

        public void stat(String str) {
            Function<String, byte[]> function;
            ToIntFunction<String> toIntFunction = JDKUtils.STRING_CODER;
            if (toIntFunction != null && toIntFunction.applyAsInt(str) == JDKUtils.LATIN1.byteValue() && (function = JDKUtils.STRING_VALUE) != null) {
                byte[] bArrApply = function.apply(str);
                stat(bArrApply, 0, bArrApply.length, StandardCharsets.ISO_8859_1);
            } else {
                char[] charArray = JDKUtils.getCharArray(str);
                stat(charArray, 0, charArray.length);
            }
        }
    }
}
