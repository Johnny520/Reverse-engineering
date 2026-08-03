.class abstract Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;
.super Lcom/alibaba/fastjson2/reader/FieldReader;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/alibaba/fastjson2/reader/FieldReader<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final dateReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field final formatMillis:Z

.field final formatUnixTime:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;Lcom/alibaba/fastjson2/reader/ObjectReader;)V
    .locals 1

    .line 1
    invoke-direct/range {p0 .. p11}, Lcom/alibaba/fastjson2/reader/FieldReader;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    iput-object p12, p1, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->dateReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    if-eqz p7, :cond_1

    .line 9
    .line 10
    const-string p3, "millis"

    .line 11
    .line 12
    invoke-virtual {p7, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    const/4 p4, 0x1

    .line 17
    if-nez p3, :cond_2

    .line 18
    .line 19
    const-string p3, "unixtime"

    .line 20
    .line 21
    invoke-virtual {p7, p3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result p3

    .line 25
    if-nez p3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v0, p4

    .line 29
    move p4, p2

    .line 30
    move p2, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    move p4, p2

    .line 33
    :cond_2
    :goto_1
    iput-boolean p2, p1, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->formatUnixTime:Z

    .line 34
    .line 35
    iput-boolean p4, p1, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->formatMillis:Z

    .line 36
    .line 37
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->acceptNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    instance-of v0, p2, Ljava/lang/String;

    .line 8
    .line 9
    if-eqz v0, :cond_6

    .line 10
    .line 11
    check-cast p2, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p2}, Ljava/lang/String;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_5

    .line 18
    .line 19
    const-string v0, "null"

    .line 20
    .line 21
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->format:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->formatUnixTime:Z

    .line 33
    .line 34
    if-nez v0, :cond_2

    .line 35
    .line 36
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->formatMillis:Z

    .line 37
    .line 38
    if-eqz v0, :cond_4

    .line 39
    .line 40
    :cond_2
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    invoke-static {p2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    iget-boolean p2, p0, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->formatUnixTime:Z

    .line 51
    .line 52
    if-eqz p2, :cond_3

    .line 53
    .line 54
    const-wide/16 v2, 0x3e8

    .line 55
    .line 56
    mul-long/2addr v0, v2

    .line 57
    :cond_3
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;J)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->format:Ljava/lang/String;

    .line 62
    .line 63
    sget-object v1, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 64
    .line 65
    invoke-static {p2, v0, v1}, Lcom/alibaba/fastjson2/util/DateUtils;->parseDate(Ljava/lang/String;Ljava/lang/String;Ljava/time/ZoneId;)Ljava/util/Date;

    .line 66
    .line 67
    .line 68
    move-result-object p2

    .line 69
    goto :goto_1

    .line 70
    :cond_5
    :goto_0
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->acceptNull(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    return-void

    .line 74
    :cond_6
    :goto_1
    instance-of v0, p2, Ljava/util/Date;

    .line 75
    .line 76
    if-eqz v0, :cond_7

    .line 77
    .line 78
    check-cast p2, Ljava/util/Date;

    .line 79
    .line 80
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->accept(Ljava/lang/Object;Ljava/util/Date;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_7
    instance-of v0, p2, Ljava/time/Instant;

    .line 85
    .line 86
    if-eqz v0, :cond_8

    .line 87
    .line 88
    check-cast p2, Ljava/time/Instant;

    .line 89
    .line 90
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->accept(Ljava/lang/Object;Ljava/time/Instant;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_8
    instance-of v0, p2, Ljava/lang/Long;

    .line 95
    .line 96
    if-eqz v0, :cond_9

    .line 97
    .line 98
    check-cast p2, Ljava/lang/Long;

    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 101
    .line 102
    .line 103
    move-result-wide v0

    .line 104
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;J)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_9
    instance-of v0, p2, Ljava/time/LocalDateTime;

    .line 109
    .line 110
    if-eqz v0, :cond_a

    .line 111
    .line 112
    check-cast p2, Ljava/time/LocalDateTime;

    .line 113
    .line 114
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->accept(Ljava/lang/Object;Ljava/time/LocalDateTime;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :cond_a
    instance-of v0, p2, Ljava/time/ZonedDateTime;

    .line 119
    .line 120
    if-eqz v0, :cond_b

    .line 121
    .line 122
    check-cast p2, Ljava/time/ZonedDateTime;

    .line 123
    .line 124
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->accept(Ljava/lang/Object;Ljava/time/ZonedDateTime;)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :cond_b
    const-string p1, "not support value "

    .line 129
    .line 130
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-static {p2, p1}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return-void
.end method

.method public abstract accept(Ljava/lang/Object;Ljava/time/Instant;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/time/Instant;",
            ")V"
        }
    .end annotation
.end method

.method public abstract accept(Ljava/lang/Object;Ljava/time/LocalDateTime;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/time/LocalDateTime;",
            ")V"
        }
    .end annotation
.end method

.method public abstract accept(Ljava/lang/Object;Ljava/time/ZonedDateTime;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/time/ZonedDateTime;",
            ")V"
        }
    .end annotation
.end method

.method public abstract accept(Ljava/lang/Object;Ljava/util/Date;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/util/Date;",
            ")V"
        }
    .end annotation
.end method

.method public abstract acceptNull(Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public abstract apply(J)Ljava/lang/Object;
.end method

.method public abstract apply(Ljava/time/Instant;)Ljava/lang/Object;
.end method

.method public abstract apply(Ljava/time/LocalDateTime;)Ljava/lang/Object;
.end method

.method public abstract apply(Ljava/time/ZonedDateTime;)Ljava/lang/Object;
.end method

.method public abstract apply(Ljava/util/Date;)Ljava/lang/Object;
.end method

.method public final getObjectReader(Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 0

    .line 4
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->dateReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    return-object p1
.end method

.method public final getObjectReader(Lcom/alibaba/fastjson2/JSONReader;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->dateReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 2
    .line 3
    return-object p1
.end method

.method public final readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderDateTimeCodec;->dateReader:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 2
    .line 3
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldType:Ljava/lang/reflect/Type;

    .line 4
    .line 5
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    .line 6
    .line 7
    iget-wide v4, p0, Lcom/alibaba/fastjson2/reader/FieldReader;->features:J

    .line 8
    .line 9
    move-object v1, p1

    .line 10
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1
.end method

.method public supportAcceptType(Ljava/lang/Class;)Z
    .locals 1

    .line 1
    const-class v0, Ljava/util/Date;

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    const-class v0, Ljava/lang/String;

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    return p1

    .line 12
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 13
    return p1
.end method
