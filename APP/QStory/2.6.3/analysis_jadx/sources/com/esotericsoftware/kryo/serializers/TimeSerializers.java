package com.esotericsoftware.kryo.serializers;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import com.esotericsoftware.kryo.util.Util;
import com.google.protobuf.DescriptorProtos$Edition;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class TimeSerializers {

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class DurationSerializer extends ImmutableSerializer<Duration> {
        @Override // com.esotericsoftware.kryo.Serializer
        public Duration read(Kryo kryo, Input input, Class cls) {
            return Duration.ofSeconds(input.readLong(), input.readInt(true));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Duration duration) {
            output.writeLong(duration.getSeconds());
            output.writeInt(duration.getNano(), true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class InstantSerializer extends ImmutableSerializer<Instant> {
        @Override // com.esotericsoftware.kryo.Serializer
        public Instant read(Kryo kryo, Input input, Class cls) {
            return Instant.ofEpochSecond(input.readVarLong(true), input.readInt(true));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Instant instant) {
            output.writeVarLong(instant.getEpochSecond(), true);
            output.writeInt(instant.getNano(), true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class LocalDateTimeSerializer extends ImmutableSerializer<LocalDateTime> {
        @Override // com.esotericsoftware.kryo.Serializer
        public LocalDateTime read(Kryo kryo, Input input, Class cls) {
            return LocalDateTime.of(LocalDateSerializer.read(input), LocalTimeSerializer.read(input));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, LocalDateTime localDateTime) {
            LocalDateSerializer.write(output, localDateTime.toLocalDate());
            LocalTimeSerializer.write(output, localDateTime.toLocalTime());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class MonthDaySerializer extends ImmutableSerializer<MonthDay> {
        @Override // com.esotericsoftware.kryo.Serializer
        public MonthDay read(Kryo kryo, Input input, Class cls) {
            return MonthDay.of(input.readByte(), input.readByte());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, MonthDay monthDay) {
            output.writeByte(monthDay.getMonthValue());
            output.writeByte(monthDay.getDayOfMonth());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class OffsetDateTimeSerializer extends ImmutableSerializer<OffsetDateTime> {
        @Override // com.esotericsoftware.kryo.Serializer
        public OffsetDateTime read(Kryo kryo, Input input, Class cls) {
            return OffsetDateTime.of(LocalDateSerializer.read(input), LocalTimeSerializer.read(input), ZoneOffsetSerializer.read(input));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, OffsetDateTime offsetDateTime) {
            LocalDateSerializer.write(output, offsetDateTime.toLocalDate());
            LocalTimeSerializer.write(output, offsetDateTime.toLocalTime());
            ZoneOffsetSerializer.write(output, offsetDateTime.getOffset());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class OffsetTimeSerializer extends ImmutableSerializer<OffsetTime> {
        @Override // com.esotericsoftware.kryo.Serializer
        public OffsetTime read(Kryo kryo, Input input, Class cls) {
            return OffsetTime.of(LocalTimeSerializer.read(input), ZoneOffsetSerializer.read(input));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, OffsetTime offsetTime) {
            LocalTimeSerializer.write(output, offsetTime.toLocalTime());
            ZoneOffsetSerializer.write(output, offsetTime.getOffset());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class PeriodSerializer extends ImmutableSerializer<Period> {
        @Override // com.esotericsoftware.kryo.Serializer
        public Period read(Kryo kryo, Input input, Class cls) {
            return Period.of(input.readInt(true), input.readInt(true), input.readInt(true));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Period period) {
            output.writeVarInt(period.getYears(), true);
            output.writeVarInt(period.getMonths(), true);
            output.writeVarInt(period.getDays(), true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class YearMonthSerializer extends ImmutableSerializer<YearMonth> {
        @Override // com.esotericsoftware.kryo.Serializer
        public YearMonth read(Kryo kryo, Input input, Class cls) {
            return YearMonth.of(input.readInt(true), input.readByte());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, YearMonth yearMonth) {
            output.writeVarInt(yearMonth.getYear(), true);
            output.writeByte(yearMonth.getMonthValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class YearSerializer extends ImmutableSerializer<Year> {
        @Override // com.esotericsoftware.kryo.Serializer
        public Year read(Kryo kryo, Input input, Class cls) {
            return Year.of(input.readInt(true));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, Year year) {
            output.writeVarInt(year.getValue(), true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class ZonedDateTimeSerializer extends ImmutableSerializer<ZonedDateTime> {
        @Override // com.esotericsoftware.kryo.Serializer
        public ZonedDateTime read(Kryo kryo, Input input, Class cls) {
            return ZonedDateTime.of(LocalDateSerializer.read(input), LocalTimeSerializer.read(input), ZoneIdSerializer.read(input));
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, ZonedDateTime zonedDateTime) {
            LocalDateSerializer.write(output, zonedDateTime.toLocalDate());
            LocalTimeSerializer.write(output, zonedDateTime.toLocalTime());
            ZoneIdSerializer.write(output, zonedDateTime.getZone());
        }
    }

    public static void addDefaultSerializers(Kryo kryo) {
        if (Util.isClassAvailable("java.time.Duration")) {
            kryo.addDefaultSerializer(Duration.class, DurationSerializer.class);
        }
        if (Util.isClassAvailable("java.time.Instant")) {
            kryo.addDefaultSerializer(Instant.class, InstantSerializer.class);
        }
        if (Util.isClassAvailable("java.time.LocalDate")) {
            kryo.addDefaultSerializer(LocalDate.class, LocalDateSerializer.class);
        }
        if (Util.isClassAvailable("java.time.LocalTime")) {
            kryo.addDefaultSerializer(LocalTime.class, LocalTimeSerializer.class);
        }
        if (Util.isClassAvailable("java.time.LocalDateTime")) {
            kryo.addDefaultSerializer(LocalDateTime.class, LocalDateTimeSerializer.class);
        }
        if (Util.isClassAvailable("java.time.ZoneOffset")) {
            kryo.addDefaultSerializer(ZoneOffset.class, ZoneOffsetSerializer.class);
        }
        if (Util.isClassAvailable("java.time.ZoneId")) {
            kryo.addDefaultSerializer(ZoneId.class, ZoneIdSerializer.class);
        }
        if (Util.isClassAvailable("java.time.OffsetTime")) {
            kryo.addDefaultSerializer(OffsetTime.class, OffsetTimeSerializer.class);
        }
        if (Util.isClassAvailable("java.time.OffsetDateTime")) {
            kryo.addDefaultSerializer(OffsetDateTime.class, OffsetDateTimeSerializer.class);
        }
        if (Util.isClassAvailable("java.time.ZonedDateTime")) {
            kryo.addDefaultSerializer(ZonedDateTime.class, ZonedDateTimeSerializer.class);
        }
        if (Util.isClassAvailable("java.time.Year")) {
            kryo.addDefaultSerializer(Year.class, YearSerializer.class);
        }
        if (Util.isClassAvailable("java.time.YearMonth")) {
            kryo.addDefaultSerializer(YearMonth.class, YearMonthSerializer.class);
        }
        if (Util.isClassAvailable("java.time.MonthDay")) {
            kryo.addDefaultSerializer(MonthDay.class, MonthDaySerializer.class);
        }
        if (Util.isClassAvailable("java.time.Period")) {
            kryo.addDefaultSerializer(Period.class, PeriodSerializer.class);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class ZoneIdSerializer extends ImmutableSerializer<ZoneId> {
        public static ZoneId read(Input input) {
            return ZoneId.of(input.readString());
        }

        public static void write(Output output, ZoneId zoneId) {
            output.writeString(zoneId.getId());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, ZoneId zoneId) {
            write(output, zoneId);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public ZoneId read(Kryo kryo, Input input, Class cls) {
            return read(input);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class LocalDateSerializer extends ImmutableSerializer<LocalDate> {
        public static LocalDate read(Input input) {
            return LocalDate.of(input.readInt(true), input.readByte(), input.readByte());
        }

        public static void write(Output output, LocalDate localDate) {
            output.writeInt(localDate.getYear(), true);
            output.writeByte(localDate.getMonthValue());
            output.writeByte(localDate.getDayOfMonth());
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public LocalDate read(Kryo kryo, Input input, Class cls) {
            return read(input);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, LocalDate localDate) {
            write(output, localDate);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class ZoneOffsetSerializer extends ImmutableSerializer<ZoneOffset> {
        public static ZoneOffset read(Input input) {
            byte b = input.readByte();
            return b == 127 ? ZoneOffset.ofTotalSeconds(input.readInt()) : ZoneOffset.ofTotalSeconds(b * 900);
        }

        public static void write(Output output, ZoneOffset zoneOffset) {
            int totalSeconds = zoneOffset.getTotalSeconds();
            int i = totalSeconds % DescriptorProtos$Edition.EDITION_LEGACY_VALUE == 0 ? totalSeconds / DescriptorProtos$Edition.EDITION_LEGACY_VALUE : 127;
            output.writeByte(i);
            if (i == 127) {
                output.writeInt(totalSeconds);
            }
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, ZoneOffset zoneOffset) {
            write(output, zoneOffset);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public ZoneOffset read(Kryo kryo, Input input, Class cls) {
            return read(input);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    public static class LocalTimeSerializer extends ImmutableSerializer<LocalTime> {
        public static LocalTime read(Input input) {
            int i;
            int i2;
            int i3 = input.readByte();
            int i4 = 0;
            if (i3 < 0) {
                i3 = ~i3;
                i2 = 0;
                i = 0;
            } else {
                byte b = input.readByte();
                if (b < 0) {
                    int i5 = ~b;
                    i = 0;
                    i4 = i5;
                    i2 = 0;
                } else {
                    byte b2 = input.readByte();
                    if (b2 < 0) {
                        i2 = ~b2;
                        i = 0;
                        i4 = b;
                    } else {
                        i = input.readInt(true);
                        i4 = b;
                        i2 = b2;
                    }
                }
            }
            return LocalTime.of(i3, i4, i2, i);
        }

        public static void write(Output output, LocalTime localTime) {
            if (localTime.getNano() != 0) {
                output.writeByte(localTime.getHour());
                output.writeByte(localTime.getMinute());
                output.writeByte(localTime.getSecond());
                output.writeInt(localTime.getNano(), true);
                return;
            }
            if (localTime.getSecond() != 0) {
                output.writeByte(localTime.getHour());
                output.writeByte(localTime.getMinute());
                output.writeByte(~localTime.getSecond());
            } else if (localTime.getMinute() == 0) {
                output.writeByte(~localTime.getHour());
            } else {
                output.writeByte(localTime.getHour());
                output.writeByte(~localTime.getMinute());
            }
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public LocalTime read(Kryo kryo, Input input, Class cls) {
            return read(input);
        }

        @Override // com.esotericsoftware.kryo.Serializer
        public void write(Kryo kryo, Output output, LocalTime localTime) {
            write(output, localTime);
        }
    }
}
