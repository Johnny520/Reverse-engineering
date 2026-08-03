.class public final Lcom/alibaba/fastjson2/JSONWriter$Context;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/JSONWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Context"
.end annotation


# instance fields
.field afterFilter:Lcom/alibaba/fastjson2/filter/AfterFilter;

.field beforeFilter:Lcom/alibaba/fastjson2/filter/BeforeFilter;

.field contextNameFilter:Lcom/alibaba/fastjson2/filter/ContextNameFilter;

.field contextValueFilter:Lcom/alibaba/fastjson2/filter/ContextValueFilter;

.field dateFormat:Ljava/lang/String;

.field dateFormatISO8601:Z

.field dateFormatMillis:Z

.field dateFormatUnixTime:Z

.field dateFormatter:Ljava/time/format/DateTimeFormatter;

.field features:J

.field formatHasDay:Z

.field formatHasHour:Z

.field formatyyyyMMddhhmmss19:Z

.field hasFilter:Z

.field labelFilter:Lcom/alibaba/fastjson2/filter/LabelFilter;

.field locale:Ljava/util/Locale;

.field maxLevel:I

.field nameFilter:Lcom/alibaba/fastjson2/filter/NameFilter;

.field propertyFilter:Lcom/alibaba/fastjson2/filter/PropertyFilter;

.field propertyPreFilter:Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

.field public final provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

.field timeZone:Ljava/util/TimeZone;

.field valueFilter:Lcom/alibaba/fastjson2/filter/ValueFilter;

.field zoneId:Ljava/time/ZoneId;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;)V
    .locals 2

    .line 71
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    .line 72
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->maxLevel:I

    if-eqz p1, :cond_1

    .line 73
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 74
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 75
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterZoneId:Ljava/time/ZoneId;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->zoneId:Ljava/time/ZoneId;

    .line 76
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFormat:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 77
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->setDateFormat(Ljava/lang/String;)V

    :cond_0
    return-void

    .line 78
    :cond_1
    const-string p1, "objectWriterProvider must not null"

    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public varargs constructor <init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;Ljava/lang/String;Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x800

    .line 5
    .line 6
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->maxLevel:I

    .line 7
    .line 8
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    .line 9
    .line 10
    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 11
    .line 12
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 13
    .line 14
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterZoneId:Ljava/time/ZoneId;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->zoneId:Ljava/time/ZoneId;

    .line 17
    .line 18
    const/4 p1, 0x0

    .line 19
    move v0, p1

    .line 20
    :goto_0
    array-length v1, p4

    .line 21
    if-ge v0, v1, :cond_0

    .line 22
    .line 23
    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 24
    .line 25
    aget-object v3, p4, v0

    .line 26
    .line 27
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 28
    .line 29
    or-long/2addr v1, v3

    .line 30
    iput-wide v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 31
    .line 32
    add-int/lit8 v0, v0, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const/4 p4, 0x1

    .line 36
    new-array p4, p4, [Lcom/alibaba/fastjson2/filter/Filter;

    .line 37
    .line 38
    aput-object p3, p4, p1

    .line 39
    .line 40
    invoke-virtual {p0, p4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V

    .line 41
    .line 42
    .line 43
    if-nez p2, :cond_1

    .line 44
    .line 45
    sget-object p2, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFormat:Ljava/lang/String;

    .line 46
    .line 47
    :cond_1
    if-eqz p2, :cond_2

    .line 48
    .line 49
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->setDateFormat(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :cond_2
    return-void
.end method

.method public varargs constructor <init>(Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V
    .locals 4

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    .line 80
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->maxLevel:I

    if-eqz p1, :cond_2

    .line 81
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 82
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 83
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterZoneId:Ljava/time/ZoneId;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->zoneId:Ljava/time/ZoneId;

    const/4 p1, 0x0

    .line 84
    :goto_0
    array-length v0, p2

    if-ge p1, v0, :cond_0

    .line 85
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    aget-object v2, p2, p1

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    .line 86
    :cond_0
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFormat:Ljava/lang/String;

    if-eqz p1, :cond_1

    .line 87
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->setDateFormat(Ljava/lang/String;)V

    :cond_1
    return-void

    .line 88
    :cond_2
    const-string p1, "objectWriterProvider must not null"

    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public varargs constructor <init>(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONWriter$Feature;)V
    .locals 5

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    .line 63
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->maxLevel:I

    .line 64
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 65
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 66
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterZoneId:Ljava/time/ZoneId;

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->zoneId:Ljava/time/ZoneId;

    const/4 v0, 0x0

    .line 67
    :goto_0
    array-length v1, p2

    if-ge v0, v1, :cond_0

    .line 68
    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    aget-object v3, p2, v0

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    or-long/2addr v1, v3

    iput-wide v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    if-nez p1, :cond_1

    .line 69
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFormat:Ljava/lang/String;

    :cond_1
    if-eqz p1, :cond_2

    .line 70
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONWriter$Context;->setDateFormat(Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public varargs constructor <init>([Lcom/alibaba/fastjson2/JSONWriter$Feature;)V
    .locals 5

    .line 53
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    .line 54
    iput v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->maxLevel:I

    .line 55
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFeatures:J

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 56
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectWriterProvider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 57
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterZoneId:Ljava/time/ZoneId;

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->zoneId:Ljava/time/ZoneId;

    .line 58
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultWriterFormat:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 59
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;->setDateFormat(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    .line 60
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 61
    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    aget-object v3, p1, v0

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    or-long/2addr v1, v3

    iput-wide v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public config(Lcom/alibaba/fastjson2/JSONWriter$Feature;Z)V
    .locals 2

    .line 18
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    if-eqz p2, :cond_0

    .line 19
    iget-wide p1, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    return-void

    .line 20
    :cond_0
    iget-wide p1, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    not-long p1, p1

    and-long/2addr p1, v0

    iput-wide p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    return-void
.end method

.method public varargs config([Lcom/alibaba/fastjson2/JSONWriter$Feature;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p1

    .line 3
    if-ge v0, v1, :cond_0

    .line 4
    .line 5
    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 6
    .line 7
    aget-object v3, p1, v0

    .line 8
    .line 9
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 10
    .line 11
    or-long/2addr v1, v3

    .line 12
    iput-wide v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    return-void
.end method

.method public varargs configFilter([Lcom/alibaba/fastjson2/filter/Filter;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    move v1, v0

    .line 6
    :goto_0
    array-length v2, p1

    .line 7
    if-ge v1, v2, :cond_f

    .line 8
    .line 9
    aget-object v2, p1, v1

    .line 10
    .line 11
    instance-of v3, v2, Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 12
    .line 13
    if-eqz v3, :cond_2

    .line 14
    .line 15
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->nameFilter:Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    move-object v3, v2

    .line 20
    check-cast v3, Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 21
    .line 22
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->nameFilter:Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 23
    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object v4, v2

    .line 26
    check-cast v4, Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 27
    .line 28
    invoke-static {v3, v4}, Lcom/alibaba/fastjson2/filter/NameFilter;->compose(Lcom/alibaba/fastjson2/filter/NameFilter;Lcom/alibaba/fastjson2/filter/NameFilter;)Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->nameFilter:Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 33
    .line 34
    :cond_2
    :goto_1
    instance-of v3, v2, Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 35
    .line 36
    if-eqz v3, :cond_4

    .line 37
    .line 38
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->valueFilter:Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 39
    .line 40
    if-nez v3, :cond_3

    .line 41
    .line 42
    move-object v3, v2

    .line 43
    check-cast v3, Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 44
    .line 45
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->valueFilter:Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_3
    move-object v4, v2

    .line 49
    check-cast v4, Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 50
    .line 51
    invoke-static {v3, v4}, Lcom/alibaba/fastjson2/filter/ValueFilter;->compose(Lcom/alibaba/fastjson2/filter/ValueFilter;Lcom/alibaba/fastjson2/filter/ValueFilter;)Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->valueFilter:Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 56
    .line 57
    :cond_4
    :goto_2
    instance-of v3, v2, Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 58
    .line 59
    if-eqz v3, :cond_6

    .line 60
    .line 61
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->propertyFilter:Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 62
    .line 63
    if-nez v3, :cond_5

    .line 64
    .line 65
    move-object v3, v2

    .line 66
    check-cast v3, Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 67
    .line 68
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->propertyFilter:Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_5
    move-object v4, v2

    .line 72
    check-cast v4, Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 73
    .line 74
    invoke-static {v3, v4}, Lcom/alibaba/fastjson2/filter/PropertyFilter;->compose(Lcom/alibaba/fastjson2/filter/PropertyFilter;Lcom/alibaba/fastjson2/filter/PropertyFilter;)Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->propertyFilter:Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 79
    .line 80
    :cond_6
    :goto_3
    instance-of v3, v2, Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 81
    .line 82
    if-eqz v3, :cond_8

    .line 83
    .line 84
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->propertyPreFilter:Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 85
    .line 86
    if-nez v3, :cond_7

    .line 87
    .line 88
    move-object v3, v2

    .line 89
    check-cast v3, Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 90
    .line 91
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->propertyPreFilter:Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_7
    move-object v4, v2

    .line 95
    check-cast v4, Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 96
    .line 97
    invoke-static {v3, v4}, Lcom/alibaba/fastjson2/filter/PropertyPreFilter;->compose(Lcom/alibaba/fastjson2/filter/PropertyPreFilter;Lcom/alibaba/fastjson2/filter/PropertyPreFilter;)Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->propertyPreFilter:Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 102
    .line 103
    :cond_8
    :goto_4
    instance-of v3, v2, Lcom/alibaba/fastjson2/filter/BeforeFilter;

    .line 104
    .line 105
    if-eqz v3, :cond_9

    .line 106
    .line 107
    move-object v3, v2

    .line 108
    check-cast v3, Lcom/alibaba/fastjson2/filter/BeforeFilter;

    .line 109
    .line 110
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->beforeFilter:Lcom/alibaba/fastjson2/filter/BeforeFilter;

    .line 111
    .line 112
    :cond_9
    instance-of v3, v2, Lcom/alibaba/fastjson2/filter/AfterFilter;

    .line 113
    .line 114
    if-eqz v3, :cond_a

    .line 115
    .line 116
    move-object v3, v2

    .line 117
    check-cast v3, Lcom/alibaba/fastjson2/filter/AfterFilter;

    .line 118
    .line 119
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->afterFilter:Lcom/alibaba/fastjson2/filter/AfterFilter;

    .line 120
    .line 121
    :cond_a
    instance-of v3, v2, Lcom/alibaba/fastjson2/filter/LabelFilter;

    .line 122
    .line 123
    if-eqz v3, :cond_c

    .line 124
    .line 125
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->labelFilter:Lcom/alibaba/fastjson2/filter/LabelFilter;

    .line 126
    .line 127
    if-nez v3, :cond_b

    .line 128
    .line 129
    move-object v3, v2

    .line 130
    check-cast v3, Lcom/alibaba/fastjson2/filter/LabelFilter;

    .line 131
    .line 132
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->labelFilter:Lcom/alibaba/fastjson2/filter/LabelFilter;

    .line 133
    .line 134
    goto :goto_5

    .line 135
    :cond_b
    move-object v4, v2

    .line 136
    check-cast v4, Lcom/alibaba/fastjson2/filter/LabelFilter;

    .line 137
    .line 138
    invoke-static {v3, v4}, Lcom/alibaba/fastjson2/filter/LabelFilter;->compose(Lcom/alibaba/fastjson2/filter/LabelFilter;Lcom/alibaba/fastjson2/filter/LabelFilter;)Lcom/alibaba/fastjson2/filter/LabelFilter;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->labelFilter:Lcom/alibaba/fastjson2/filter/LabelFilter;

    .line 143
    .line 144
    :cond_c
    :goto_5
    instance-of v3, v2, Lcom/alibaba/fastjson2/filter/ContextValueFilter;

    .line 145
    .line 146
    if-eqz v3, :cond_d

    .line 147
    .line 148
    move-object v3, v2

    .line 149
    check-cast v3, Lcom/alibaba/fastjson2/filter/ContextValueFilter;

    .line 150
    .line 151
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->contextValueFilter:Lcom/alibaba/fastjson2/filter/ContextValueFilter;

    .line 152
    .line 153
    :cond_d
    instance-of v3, v2, Lcom/alibaba/fastjson2/filter/ContextNameFilter;

    .line 154
    .line 155
    if-eqz v3, :cond_e

    .line 156
    .line 157
    check-cast v2, Lcom/alibaba/fastjson2/filter/ContextNameFilter;

    .line 158
    .line 159
    iput-object v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->contextNameFilter:Lcom/alibaba/fastjson2/filter/ContextNameFilter;

    .line 160
    .line 161
    :cond_e
    add-int/lit8 v1, v1, 0x1

    .line 162
    .line 163
    goto/16 :goto_0

    .line 164
    .line 165
    :cond_f
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->propertyPreFilter:Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 166
    .line 167
    if-nez p1, :cond_10

    .line 168
    .line 169
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->propertyFilter:Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 170
    .line 171
    if-nez p1, :cond_10

    .line 172
    .line 173
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->nameFilter:Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 174
    .line 175
    if-nez p1, :cond_10

    .line 176
    .line 177
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->valueFilter:Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 178
    .line 179
    if-nez p1, :cond_10

    .line 180
    .line 181
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->beforeFilter:Lcom/alibaba/fastjson2/filter/BeforeFilter;

    .line 182
    .line 183
    if-nez p1, :cond_10

    .line 184
    .line 185
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->afterFilter:Lcom/alibaba/fastjson2/filter/AfterFilter;

    .line 186
    .line 187
    if-nez p1, :cond_10

    .line 188
    .line 189
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->labelFilter:Lcom/alibaba/fastjson2/filter/LabelFilter;

    .line 190
    .line 191
    if-nez p1, :cond_10

    .line 192
    .line 193
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->contextValueFilter:Lcom/alibaba/fastjson2/filter/ContextValueFilter;

    .line 194
    .line 195
    if-nez p1, :cond_10

    .line 196
    .line 197
    iget-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->contextNameFilter:Lcom/alibaba/fastjson2/filter/ContextNameFilter;

    .line 198
    .line 199
    if-eqz p1, :cond_11

    .line 200
    .line 201
    :cond_10
    const/4 v0, 0x1

    .line 202
    :cond_11
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->hasFilter:Z

    .line 203
    .line 204
    return-void
.end method

.method public getAfterFilter()Lcom/alibaba/fastjson2/filter/AfterFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->afterFilter:Lcom/alibaba/fastjson2/filter/AfterFilter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBeforeFilter()Lcom/alibaba/fastjson2/filter/BeforeFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->beforeFilter:Lcom/alibaba/fastjson2/filter/BeforeFilter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContextNameFilter()Lcom/alibaba/fastjson2/filter/ContextNameFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->contextNameFilter:Lcom/alibaba/fastjson2/filter/ContextNameFilter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getContextValueFilter()Lcom/alibaba/fastjson2/filter/ContextValueFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->contextValueFilter:Lcom/alibaba/fastjson2/filter/ContextValueFilter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDateFormat()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormat:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDateFormatter()Ljava/time/format/DateTimeFormatter;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormat:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormatMillis:Z

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormatISO8601:Z

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormatUnixTime:Z

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->locale:Ljava/util/Locale;

    .line 22
    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    invoke-static {v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;)Ljava/time/format/DateTimeFormatter;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {v0, v1}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :goto_0
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 37
    .line 38
    return-object v0
.end method

.method public getFeatures()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getLabelFilter()Lcom/alibaba/fastjson2/filter/LabelFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->labelFilter:Lcom/alibaba/fastjson2/filter/LabelFilter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getNameFilter()Lcom/alibaba/fastjson2/filter/NameFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->nameFilter:Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 2
    .line 3
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 4
    .line 5
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 18
    .line 19
    invoke-virtual {v1, p1, p1, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Lcom/alibaba/fastjson2/writer/ObjectWriter<",
            "TT;>;"
        }
    .end annotation

    .line 24
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 25
    :goto_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    invoke-virtual {v1, p1, p2, v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    move-result-object p1

    return-object p1
.end method

.method public getPropertyFilter()Lcom/alibaba/fastjson2/filter/PropertyFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->propertyFilter:Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPropertyPreFilter()Lcom/alibaba/fastjson2/filter/PropertyPreFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->propertyPreFilter:Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProvider()Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 2
    .line 3
    return-object v0
.end method

.method public getValueFilter()Lcom/alibaba/fastjson2/filter/ValueFilter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->valueFilter:Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getZoneId()Ljava/time/ZoneId;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->zoneId:Ljava/time/ZoneId;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->zoneId:Ljava/time/ZoneId;

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->zoneId:Ljava/time/ZoneId;

    .line 10
    .line 11
    return-object v0
.end method

.method public isDateFormatHasDay()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->formatHasDay:Z

    .line 2
    .line 3
    return v0
.end method

.method public isDateFormatHasHour()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->formatHasHour:Z

    .line 2
    .line 3
    return v0
.end method

.method public isDateFormatISO8601()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormatISO8601:Z

    .line 2
    .line 3
    return v0
.end method

.method public isDateFormatMillis()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormatMillis:Z

    .line 2
    .line 3
    return v0
.end method

.method public isDateFormatUnixTime()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormatUnixTime:Z

    .line 2
    .line 3
    return v0
.end method

.method public isEnabled(J)Z
    .locals 2

    .line 16
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    and-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public isEnabled(Lcom/alibaba/fastjson2/JSONWriter$Feature;)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 2
    .line 3
    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 4
    .line 5
    and-long/2addr v0, v2

    .line 6
    const-wide/16 v2, 0x0

    .line 7
    .line 8
    cmp-long p1, v0, v2

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p1, 0x0

    .line 15
    return p1
.end method

.method public isFormatyyyyMMddhhmmss19()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->formatyyyyMMddhhmmss19:Z

    .line 2
    .line 3
    return v0
.end method

.method public setAfterFilter(Lcom/alibaba/fastjson2/filter/AfterFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->afterFilter:Lcom/alibaba/fastjson2/filter/AfterFilter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->hasFilter:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setBeforeFilter(Lcom/alibaba/fastjson2/filter/BeforeFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->beforeFilter:Lcom/alibaba/fastjson2/filter/BeforeFilter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->hasFilter:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setContextNameFilter(Lcom/alibaba/fastjson2/filter/ContextNameFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->contextNameFilter:Lcom/alibaba/fastjson2/filter/ContextNameFilter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->hasFilter:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setContextValueFilter(Lcom/alibaba/fastjson2/filter/ContextValueFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->contextValueFilter:Lcom/alibaba/fastjson2/filter/ContextValueFilter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->hasFilter:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setDateFormat(Ljava/lang/String;)V
    .locals 6

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormat:Ljava/lang/String;

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 13
    .line 14
    :cond_1
    if-eqz p1, :cond_7

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_7

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x0

    .line 27
    const/4 v2, 0x1

    .line 28
    const/4 v3, -0x1

    .line 29
    sparse-switch v0, :sswitch_data_0

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :sswitch_0
    const-string v0, "iso8601"

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-nez v0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const/4 v3, 0x4

    .line 43
    goto :goto_0

    .line 44
    :sswitch_1
    const-string v0, "yyyy-MM-ddTHH:mm:ss"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_3

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    const/4 v3, 0x3

    .line 54
    goto :goto_0

    .line 55
    :sswitch_2
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    .line 56
    .line 57
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_4

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    const/4 v3, 0x2

    .line 65
    goto :goto_0

    .line 66
    :sswitch_3
    const-string v0, "unixtime"

    .line 67
    .line 68
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_5

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    move v3, v2

    .line 76
    goto :goto_0

    .line 77
    :sswitch_4
    const-string v0, "millis"

    .line 78
    .line 79
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_6

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_6
    move v3, v1

    .line 87
    :goto_0
    packed-switch v3, :pswitch_data_0

    .line 88
    .line 89
    .line 90
    const-string v0, "d"

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    const-string v2, "H"

    .line 97
    .line 98
    invoke-virtual {p1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    move v3, v0

    .line 103
    move v0, v1

    .line 104
    move v5, v0

    .line 105
    move v4, v2

    .line 106
    :goto_1
    move v2, v5

    .line 107
    goto :goto_2

    .line 108
    :pswitch_0
    move v0, v1

    .line 109
    move v3, v0

    .line 110
    move v4, v3

    .line 111
    move v5, v4

    .line 112
    goto :goto_2

    .line 113
    :pswitch_1
    const-string p1, "yyyy-MM-dd\'T\'HH:mm:ss"

    .line 114
    .line 115
    move v0, v1

    .line 116
    move v5, v0

    .line 117
    move v3, v2

    .line 118
    move v4, v3

    .line 119
    goto :goto_1

    .line 120
    :pswitch_2
    move v0, v1

    .line 121
    move v3, v2

    .line 122
    move v4, v3

    .line 123
    move v5, v4

    .line 124
    move v2, v0

    .line 125
    goto :goto_2

    .line 126
    :pswitch_3
    move v3, v1

    .line 127
    move v4, v3

    .line 128
    move v5, v4

    .line 129
    move v0, v2

    .line 130
    goto :goto_1

    .line 131
    :pswitch_4
    move v0, v1

    .line 132
    move v3, v0

    .line 133
    move v4, v3

    .line 134
    move v5, v4

    .line 135
    move v1, v2

    .line 136
    goto :goto_1

    .line 137
    :goto_2
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormatMillis:Z

    .line 138
    .line 139
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormatISO8601:Z

    .line 140
    .line 141
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormatUnixTime:Z

    .line 142
    .line 143
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->formatHasDay:Z

    .line 144
    .line 145
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->formatHasHour:Z

    .line 146
    .line 147
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->formatyyyyMMddhhmmss19:Z

    .line 148
    .line 149
    :cond_7
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->dateFormat:Ljava/lang/String;

    .line 150
    .line 151
    return-void

    .line 152
    nop

    .line 153
    :sswitch_data_0
    .sparse-switch
        -0x400565ba -> :sswitch_4
        -0x112ad7ab -> :sswitch_3
        0x4f76f1a0 -> :sswitch_2
        0x6d5d7dd4 -> :sswitch_1
        0x7ce21384 -> :sswitch_0
    .end sparse-switch

    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public setFeatures(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 2
    .line 3
    return-void
.end method

.method public setLabelFilter(Lcom/alibaba/fastjson2/filter/LabelFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->labelFilter:Lcom/alibaba/fastjson2/filter/LabelFilter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->hasFilter:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setNameFilter(Lcom/alibaba/fastjson2/filter/NameFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->nameFilter:Lcom/alibaba/fastjson2/filter/NameFilter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->hasFilter:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setPropertyFilter(Lcom/alibaba/fastjson2/filter/PropertyFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->propertyFilter:Lcom/alibaba/fastjson2/filter/PropertyFilter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->hasFilter:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setPropertyPreFilter(Lcom/alibaba/fastjson2/filter/PropertyPreFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->propertyPreFilter:Lcom/alibaba/fastjson2/filter/PropertyPreFilter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->hasFilter:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setTimeZone(Ljava/util/TimeZone;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->timeZone:Ljava/util/TimeZone;

    .line 2
    .line 3
    return-void
.end method

.method public setValueFilter(Lcom/alibaba/fastjson2/filter/ValueFilter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->valueFilter:Lcom/alibaba/fastjson2/filter/ValueFilter;

    .line 2
    .line 3
    if-eqz p1, :cond_0

    .line 4
    .line 5
    const/4 p1, 0x1

    .line 6
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->hasFilter:Z

    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public setZoneId(Ljava/time/ZoneId;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONWriter$Context;->zoneId:Ljava/time/ZoneId;

    .line 2
    .line 3
    return-void
.end method
