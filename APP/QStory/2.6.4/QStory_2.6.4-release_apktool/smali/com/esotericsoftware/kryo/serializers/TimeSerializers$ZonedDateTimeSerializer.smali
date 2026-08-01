.class public Lcom/esotericsoftware/kryo/serializers/TimeSerializers$ZonedDateTimeSerializer;
.super Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/serializers/TimeSerializers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ZonedDateTimeSerializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer<",
        "Ljava/time/ZonedDateTime;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/serializers/ImmutableSerializer;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 18
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$ZonedDateTimeSerializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/time/ZonedDateTime;

    move-result-object p0

    return-object p0
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/time/ZonedDateTime;
    .locals 0

    .line 1
    invoke-static {p2}, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalDateSerializer;->read(Lcom/esotericsoftware/kryo/io/Input;)Ljava/time/LocalDate;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p2}, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalTimeSerializer;->read(Lcom/esotericsoftware/kryo/io/Input;)Ljava/time/LocalTime;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p2}, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$ZoneIdSerializer;->read(Lcom/esotericsoftware/kryo/io/Input;)Ljava/time/ZoneId;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p0, p1, p2}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public bridge synthetic write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 0

    .line 23
    check-cast p3, Ljava/time/ZonedDateTime;

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$ZonedDateTimeSerializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/time/ZonedDateTime;)V

    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/time/ZonedDateTime;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p2, p0}, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalDateSerializer;->write(Lcom/esotericsoftware/kryo/io/Output;Ljava/time/LocalDate;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p2, p0}, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$LocalTimeSerializer;->write(Lcom/esotericsoftware/kryo/io/Output;Ljava/time/LocalTime;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p3}, Ljava/time/ZonedDateTime;->getZone()Ljava/time/ZoneId;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p2, p0}, Lcom/esotericsoftware/kryo/serializers/TimeSerializers$ZoneIdSerializer;->write(Lcom/esotericsoftware/kryo/io/Output;Ljava/time/ZoneId;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method
