.class public Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CalendarSerializer;
.super Lcom/esotericsoftware/kryo/Serializer;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/esotericsoftware/kryo/serializers/DefaultSerializers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "CalendarSerializer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/esotericsoftware/kryo/Serializer<",
        "Ljava/util/Calendar;",
        ">;"
    }
.end annotation


# static fields
.field private static final DEFAULT_GREGORIAN_CUTOVER:J = -0xb1d069b5400L


# instance fields
.field timeZoneSerializer:Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimeZoneSerializer;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/esotericsoftware/kryo/Serializer;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimeZoneSerializer;

    .line 5
    .line 6
    invoke-direct {v0}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimeZoneSerializer;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CalendarSerializer;->timeZoneSerializer:Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimeZoneSerializer;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public bridge synthetic copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p2, Ljava/util/Calendar;

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CalendarSerializer;->copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public copy(Lcom/esotericsoftware/kryo/Kryo;Ljava/util/Calendar;)Ljava/util/Calendar;
    .locals 0

    .line 8
    invoke-virtual {p2}, Ljava/util/Calendar;->clone()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Calendar;

    return-object p0
.end method

.method public bridge synthetic read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 0

    .line 72
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CalendarSerializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/util/Calendar;

    move-result-object p0

    return-object p0
.end method

.method public read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/util/Calendar;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/esotericsoftware/kryo/Kryo;",
            "Lcom/esotericsoftware/kryo/io/Input;",
            "Ljava/lang/Class<",
            "+",
            "Ljava/util/Calendar;",
            ">;)",
            "Ljava/util/Calendar;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CalendarSerializer;->timeZoneSerializer:Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimeZoneSerializer;

    .line 2
    .line 3
    const-class p3, Ljava/util/TimeZone;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimeZoneSerializer;->read(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Input;Ljava/lang/Class;)Ljava/util/TimeZone;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/4 p1, 0x1

    .line 14
    invoke-virtual {p2, p1}, Lcom/esotericsoftware/kryo/io/Input;->readVarLong(Z)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    invoke-virtual {p0, v0, v1}, Ljava/util/Calendar;->setTimeInMillis(J)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/esotericsoftware/kryo/io/Input;->readBoolean()Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    invoke-virtual {p0, p3}, Ljava/util/Calendar;->setLenient(Z)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2, p1}, Lcom/esotericsoftware/kryo/io/Input;->readInt(Z)I

    .line 29
    .line 30
    .line 31
    move-result p3

    .line 32
    invoke-virtual {p0, p3}, Ljava/util/Calendar;->setFirstDayOfWeek(I)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, p1}, Lcom/esotericsoftware/kryo/io/Input;->readInt(Z)I

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-virtual {p0, p1}, Ljava/util/Calendar;->setMinimalDaysInFirstWeek(I)V

    .line 40
    .line 41
    .line 42
    const/4 p1, 0x0

    .line 43
    invoke-virtual {p2, p1}, Lcom/esotericsoftware/kryo/io/Input;->readVarLong(Z)J

    .line 44
    .line 45
    .line 46
    move-result-wide p1

    .line 47
    const-wide v0, -0xb1d069b5400L

    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    cmp-long p3, p1, v0

    .line 53
    .line 54
    if-eqz p3, :cond_0

    .line 55
    .line 56
    instance-of p3, p0, Ljava/util/GregorianCalendar;

    .line 57
    .line 58
    if-eqz p3, :cond_0

    .line 59
    .line 60
    move-object p3, p0

    .line 61
    check-cast p3, Ljava/util/GregorianCalendar;

    .line 62
    .line 63
    new-instance v0, Ljava/util/Date;

    .line 64
    .line 65
    invoke-direct {v0, p1, p2}, Ljava/util/Date;-><init>(J)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p3, v0}, Ljava/util/GregorianCalendar;->setGregorianChange(Ljava/util/Date;)V

    .line 69
    .line 70
    .line 71
    :cond_0
    return-object p0
.end method

.method public bridge synthetic write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/lang/Object;)V
    .locals 0

    .line 67
    check-cast p3, Ljava/util/Calendar;

    invoke-virtual {p0, p1, p2, p3}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CalendarSerializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Calendar;)V

    return-void
.end method

.method public write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/Calendar;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$CalendarSerializer;->timeZoneSerializer:Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimeZoneSerializer;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {p0, p1, p2, v0}, Lcom/esotericsoftware/kryo/serializers/DefaultSerializers$TimeZoneSerializer;->write(Lcom/esotericsoftware/kryo/Kryo;Lcom/esotericsoftware/kryo/io/Output;Ljava/util/TimeZone;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p3}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide p0

    .line 14
    const/4 v0, 0x1

    .line 15
    invoke-virtual {p2, p0, p1, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeVarLong(JZ)I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3}, Ljava/util/Calendar;->isLenient()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    invoke-virtual {p2, p0}, Lcom/esotericsoftware/kryo/io/Output;->writeBoolean(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3}, Ljava/util/Calendar;->getFirstDayOfWeek()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    invoke-virtual {p2, p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeInt(IZ)I

    .line 30
    .line 31
    .line 32
    invoke-virtual {p3}, Ljava/util/Calendar;->getMinimalDaysInFirstWeek()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-virtual {p2, p0, v0}, Lcom/esotericsoftware/kryo/io/Output;->writeInt(IZ)I

    .line 37
    .line 38
    .line 39
    instance-of p0, p3, Ljava/util/GregorianCalendar;

    .line 40
    .line 41
    const/4 p1, 0x0

    .line 42
    if-eqz p0, :cond_0

    .line 43
    .line 44
    check-cast p3, Ljava/util/GregorianCalendar;

    .line 45
    .line 46
    invoke-virtual {p3}, Ljava/util/GregorianCalendar;->getGregorianChange()Ljava/util/Date;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 51
    .line 52
    .line 53
    move-result-wide v0

    .line 54
    invoke-virtual {p2, v0, v1, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeVarLong(JZ)I

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_0
    const-wide v0, -0xb1d069b5400L

    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    invoke-virtual {p2, v0, v1, p1}, Lcom/esotericsoftware/kryo/io/Output;->writeVarLong(JZ)I

    .line 64
    .line 65
    .line 66
    return-void
.end method
