.class public final Lcom/alibaba/fastjson2/JSONReader$Context;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/alibaba/fastjson2/JSONReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Context"
.end annotation


# instance fields
.field arraySupplier:Ljava/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Supplier<",
            "Ljava/util/List;",
            ">;"
        }
    .end annotation
.end field

.field autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

.field bufferSize:I

.field dateFormat:Ljava/lang/String;

.field dateFormatter:Ljava/time/format/DateTimeFormatter;

.field public extraProcessor:Lcom/alibaba/fastjson2/filter/ExtraProcessor;

.field public features:J

.field formatComplex:Z

.field formatHasDay:Z

.field formatHasHour:Z

.field formatISO8601:Z

.field formatMillis:Z

.field formatUnixTime:Z

.field formatyyyyMMdd8:Z

.field formatyyyyMMddhhmmss19:Z

.field formatyyyyMMddhhmmssT19:Z

.field locale:Ljava/util/Locale;

.field maxLevel:I

.field objectSupplier:Ljava/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Supplier<",
            "Ljava/util/Map;",
            ">;"
        }
    .end annotation
.end field

.field public final provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

.field protected final symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

.field timeZone:Ljava/util/TimeZone;

.field useSimpleFormatter:Z

.field yyyyMMddhhmm16:Z

.field zoneId:Ljava/time/ZoneId;


# direct methods
.method public constructor <init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V
    .locals 2

    .line 86
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    .line 87
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    const/high16 v0, 0x80000

    .line 88
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 89
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 90
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 91
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectSupplier:Ljava/util/function/Supplier;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->objectSupplier:Ljava/util/function/Supplier;

    .line 92
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultArraySupplier:Ljava/util/function/Supplier;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    const/4 p1, 0x0

    .line 93
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 94
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderZoneId:Ljava/time/ZoneId;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 95
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFormat:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 96
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;J)V
    .locals 1

    .line 62
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    .line 63
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    const/high16 v0, 0x80000

    .line 64
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 65
    iput-wide p2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 66
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 67
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectSupplier:Ljava/util/function/Supplier;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->objectSupplier:Ljava/util/function/Supplier;

    .line 68
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultArraySupplier:Ljava/util/function/Supplier;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    const/4 p1, 0x0

    .line 69
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 70
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderZoneId:Ljava/time/ZoneId;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 71
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFormat:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 72
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;)V
    .locals 2

    .line 110
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    .line 111
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    const/high16 v0, 0x80000

    .line 112
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 113
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 114
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 115
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 116
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderZoneId:Ljava/time/ZoneId;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 117
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFormat:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 118
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public varargs constructor <init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    .locals 2

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    .line 131
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    const/high16 v0, 0x80000

    .line 132
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 133
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 134
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 135
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 136
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderZoneId:Ljava/time/ZoneId;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 137
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFormat:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 138
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    .line 139
    :cond_0
    invoke-virtual {p0, p3}, Lcom/alibaba/fastjson2/JSONReader$Context;->config(Lcom/alibaba/fastjson2/filter/Filter;)V

    const/4 p1, 0x0

    .line 140
    :goto_0
    array-length p2, p4

    if-ge p1, p2, :cond_1

    .line 141
    iget-wide p2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    aget-object v0, p4, p1

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    or-long/2addr p2, v0

    iput-wide p2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public varargs constructor <init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    .locals 4

    .line 119
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    .line 120
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    const/high16 v0, 0x80000

    .line 121
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 122
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 123
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 124
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 125
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderZoneId:Ljava/time/ZoneId;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 126
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFormat:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 127
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    .line 128
    :goto_0
    array-length p2, p3

    if-ge p1, p2, :cond_1

    .line 129
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    aget-object p2, p3, p1

    iget-wide v2, p2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public varargs constructor <init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/SymbolTable;[Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    .locals 2

    .line 142
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    .line 143
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    const/high16 v0, 0x80000

    .line 144
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 145
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 146
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 147
    iput-object p2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 148
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderZoneId:Ljava/time/ZoneId;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 149
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFormat:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 150
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    .line 151
    new-array p2, p1, [Lcom/alibaba/fastjson2/JSONReader$Feature;

    invoke-virtual {p0, p3, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;->config([Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 152
    :goto_0
    array-length p2, p4

    if-ge p1, p2, :cond_1

    .line 153
    iget-wide p2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    aget-object v0, p4, p1

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    or-long/2addr p2, v0

    iput-wide p2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public varargs constructor <init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    .locals 4

    .line 97
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    .line 98
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    const/high16 v0, 0x80000

    .line 99
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 100
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 101
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 102
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectSupplier:Ljava/util/function/Supplier;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->objectSupplier:Ljava/util/function/Supplier;

    .line 103
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultArraySupplier:Ljava/util/function/Supplier;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    const/4 p1, 0x0

    .line 104
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 105
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderZoneId:Ljava/time/ZoneId;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 106
    sget-object p1, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFormat:Ljava/lang/String;

    if-eqz p1, :cond_0

    .line 107
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    :cond_0
    const/4 p1, 0x0

    .line 108
    :goto_0
    array-length v0, p2

    if-ge p1, v0, :cond_1

    .line 109
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    aget-object v2, p2, p1

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public varargs constructor <init>(Ljava/lang/String;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x800

    .line 5
    .line 6
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    .line 7
    .line 8
    const/high16 v0, 0x80000

    .line 9
    .line 10
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 11
    .line 12
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 15
    .line 16
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 19
    .line 20
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectSupplier:Ljava/util/function/Supplier;

    .line 21
    .line 22
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->objectSupplier:Ljava/util/function/Supplier;

    .line 23
    .line 24
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultArraySupplier:Ljava/util/function/Supplier;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 30
    .line 31
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderZoneId:Ljava/time/ZoneId;

    .line 32
    .line 33
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 34
    .line 35
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFormat:Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_0
    const/4 v0, 0x0

    .line 43
    :goto_0
    array-length v1, p2

    .line 44
    if-ge v0, v1, :cond_1

    .line 45
    .line 46
    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 47
    .line 48
    aget-object v3, p2, v0

    .line 49
    .line 50
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 51
    .line 52
    or-long/2addr v1, v3

    .line 53
    iput-wide v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 54
    .line 55
    add-int/lit8 v0, v0, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public varargs constructor <init>([Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    .locals 5

    .line 73
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x800

    .line 74
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    const/high16 v0, 0x80000

    .line 75
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 76
    sget-wide v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFeatures:J

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 77
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 78
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectSupplier:Ljava/util/function/Supplier;

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->objectSupplier:Ljava/util/function/Supplier;

    .line 79
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultArraySupplier:Ljava/util/function/Supplier;

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    const/4 v0, 0x0

    .line 80
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->symbolTable:Lcom/alibaba/fastjson2/SymbolTable;

    .line 81
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderZoneId:Ljava/time/ZoneId;

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 82
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->defaultReaderFormat:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 83
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->setDateFormat(Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    .line 84
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_1

    .line 85
    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    aget-object v3, p1, v0

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    or-long/2addr v1, v3

    iput-wide v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method


# virtual methods
.method public config(Lcom/alibaba/fastjson2/JSONReader$Feature;Z)V
    .locals 2

    .line 56
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    if-eqz p2, :cond_0

    .line 57
    iget-wide p1, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    or-long/2addr p1, v0

    iput-wide p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    return-void

    .line 58
    :cond_0
    iget-wide p1, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    not-long p1, p1

    and-long/2addr p1, v0

    iput-wide p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    return-void
.end method

.method public config(Lcom/alibaba/fastjson2/filter/Filter;)V
    .locals 1

    .line 50
    instance-of v0, p1, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    if-eqz v0, :cond_0

    .line 51
    move-object v0, p1

    check-cast v0, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 52
    :cond_0
    instance-of v0, p1, Lcom/alibaba/fastjson2/filter/ExtraProcessor;

    if-eqz v0, :cond_1

    .line 53
    check-cast p1, Lcom/alibaba/fastjson2/filter/ExtraProcessor;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->extraProcessor:Lcom/alibaba/fastjson2/filter/ExtraProcessor;

    :cond_1
    return-void
.end method

.method public varargs config(Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    .locals 4

    .line 44
    instance-of v0, p1, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    if-eqz v0, :cond_0

    .line 45
    move-object v0, p1

    check-cast v0, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 46
    :cond_0
    instance-of v0, p1, Lcom/alibaba/fastjson2/filter/ExtraProcessor;

    if-eqz v0, :cond_1

    .line 47
    check-cast p1, Lcom/alibaba/fastjson2/filter/ExtraProcessor;

    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->extraProcessor:Lcom/alibaba/fastjson2/filter/ExtraProcessor;

    :cond_1
    const/4 p1, 0x0

    .line 48
    :goto_0
    array-length v0, p2

    if-ge p1, v0, :cond_2

    .line 49
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    aget-object v2, p2, p1

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    or-long/2addr v0, v2

    iput-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public varargs config([Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    .locals 5

    const/4 v0, 0x0

    .line 54
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_0

    .line 55
    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    aget-object v3, p1, v0

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    or-long/2addr v1, v3

    iput-wide v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public varargs config([Lcom/alibaba/fastjson2/filter/Filter;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p1

    .line 4
    if-ge v1, v2, :cond_2

    .line 5
    .line 6
    aget-object v2, p1, v1

    .line 7
    .line 8
    instance-of v3, v2, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 9
    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    move-object v3, v2

    .line 13
    check-cast v3, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 14
    .line 15
    iput-object v3, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 16
    .line 17
    :cond_0
    instance-of v3, v2, Lcom/alibaba/fastjson2/filter/ExtraProcessor;

    .line 18
    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    check-cast v2, Lcom/alibaba/fastjson2/filter/ExtraProcessor;

    .line 22
    .line 23
    iput-object v2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->extraProcessor:Lcom/alibaba/fastjson2/filter/ExtraProcessor;

    .line 24
    .line 25
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_2
    :goto_1
    array-length p1, p2

    .line 29
    if-ge v0, p1, :cond_3

    .line 30
    .line 31
    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 32
    .line 33
    aget-object p1, p2, v0

    .line 34
    .line 35
    iget-wide v3, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 36
    .line 37
    or-long/2addr v1, v3

    .line 38
    iput-wide v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_3
    return-void
.end method

.method public getArraySupplier()Ljava/util/function/Supplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/function/Supplier<",
            "Ljava/util/List;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBufferSize()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 2
    .line 3
    return v0
.end method

.method public getContextAutoTypeBeforeHandler()Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDateFormat()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormat:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getDateFormatter()Ljava/time/format/DateTimeFormatter;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormat:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatMillis:Z

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatISO8601:Z

    .line 14
    .line 15
    if-nez v1, :cond_1

    .line 16
    .line 17
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatUnixTime:Z

    .line 18
    .line 19
    if-nez v1, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->locale:Ljava/util/Locale;

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
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 35
    .line 36
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 37
    .line 38
    return-object v0
.end method

.method public getExtraProcessor()Lcom/alibaba/fastjson2/filter/ExtraProcessor;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->extraProcessor:Lcom/alibaba/fastjson2/filter/ExtraProcessor;

    .line 2
    .line 3
    return-object v0
.end method

.method public getFeatures()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public getLocale()Ljava/util/Locale;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->locale:Ljava/util/Locale;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxLevel()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    .line 2
    .line 3
    return v0
.end method

.method public getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 2
    .line 3
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 4
    .line 5
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

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
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 18
    .line 19
    invoke-virtual {v1, p1, v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1
.end method

.method public getObjectReaderAutoType(J)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1
.end method

.method public getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 6
    .line 7
    invoke-interface {v0, p1, p2, v1, v2}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-wide p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 14
    .line 15
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 16
    .line 17
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 18
    .line 19
    and-long/2addr p1, v1

    .line 20
    const-wide/16 v1, 0x0

    .line 21
    .line 22
    cmp-long p1, p1, v1

    .line 23
    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    const/4 p1, 0x1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 30
    .line 31
    invoke-virtual {p2, v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 37
    .line 38
    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 39
    .line 40
    invoke-virtual {v0, p1, p2, v1, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1
.end method

.method public getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 3

    .line 46
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    if-eqz v0, :cond_1

    .line 47
    invoke-interface {v0, p1, p2, p3, p4}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 48
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide p1, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr p1, p3

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 49
    :goto_0
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {p2, v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1

    .line 50
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    iget-wide v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    or-long/2addr p3, v1

    invoke-virtual {v0, p1, p2, p3, p4}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object p1

    return-object p1
.end method

.method public getObjectSupplier()Ljava/util/function/Supplier;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/function/Supplier<",
            "Ljava/util/Map;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->objectSupplier:Ljava/util/function/Supplier;

    .line 2
    .line 3
    return-object v0
.end method

.method public getProvider()Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTimeZone()Ljava/util/TimeZone;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->timeZone:Ljava/util/TimeZone;

    .line 2
    .line 3
    return-object v0
.end method

.method public getZoneId()Ljava/time/ZoneId;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lcom/alibaba/fastjson2/util/DateUtils;->DEFAULT_ZONE_ID:Ljava/time/ZoneId;

    .line 6
    .line 7
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 10
    .line 11
    return-object v0
.end method

.method public isEnabled(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 2
    .line 3
    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

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

.method public isFormatHasHour()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatHasHour:Z

    .line 2
    .line 3
    return v0
.end method

.method public isFormatISO8601()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatISO8601:Z

    .line 2
    .line 3
    return v0
.end method

.method public isFormatMillis()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatMillis:Z

    .line 2
    .line 3
    return v0
.end method

.method public isFormatUnixTime()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatUnixTime:Z

    .line 2
    .line 3
    return v0
.end method

.method public isFormatyyyyMMdd8()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMdd8:Z

    .line 2
    .line 3
    return v0
.end method

.method public isFormatyyyyMMddhhmmss19()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmss19:Z

    .line 2
    .line 3
    return v0
.end method

.method public isFormatyyyyMMddhhmmssT19()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmssT19:Z

    .line 2
    .line 3
    return v0
.end method

.method public setArraySupplier(Ljava/util/function/Supplier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Supplier<",
            "Ljava/util/List;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    .line 2
    .line 3
    return-void
.end method

.method public setBufferSize(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->bufferSize:I

    .line 2
    .line 3
    return-void
.end method

.method public setDateFormat(Ljava/lang/String;)V
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    move-object p1, v0

    .line 11
    :cond_0
    const/4 v1, 0x0

    .line 12
    if-eqz p1, :cond_e

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, -0x1

    .line 19
    const/4 v4, 0x1

    .line 20
    sparse-switch v2, :sswitch_data_0

    .line 21
    .line 22
    .line 23
    :goto_0
    move v2, v3

    .line 24
    goto/16 :goto_1

    .line 25
    .line 26
    :sswitch_0
    const-string v2, "iso8601"

    .line 27
    .line 28
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/16 v2, 0x9

    .line 36
    .line 37
    goto/16 :goto_1

    .line 38
    .line 39
    :sswitch_1
    const-string v2, "yyyy-MM-ddTHH:mm:ss"

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-nez v2, :cond_2

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/16 v2, 0x8

    .line 49
    .line 50
    goto/16 :goto_1

    .line 51
    .line 52
    :sswitch_2
    const-string v2, "yyyy-MM-dd\'T\'HH:mm:ss"

    .line 53
    .line 54
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    const/4 v2, 0x7

    .line 62
    goto :goto_1

    .line 63
    :sswitch_3
    const-string v2, "yyyy-MM-dd HH:mm:ss"

    .line 64
    .line 65
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-nez v2, :cond_4

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_4
    const/4 v2, 0x6

    .line 73
    goto :goto_1

    .line 74
    :sswitch_4
    const-string v2, "yyyy-MM-dd"

    .line 75
    .line 76
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v2

    .line 80
    if-nez v2, :cond_5

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_5
    const/4 v2, 0x5

    .line 84
    goto :goto_1

    .line 85
    :sswitch_5
    const-string v2, "yyyyMMdd"

    .line 86
    .line 87
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_6

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_6
    const/4 v2, 0x4

    .line 95
    goto :goto_1

    .line 96
    :sswitch_6
    const-string v2, "unixtime"

    .line 97
    .line 98
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_7

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_7
    const/4 v2, 0x3

    .line 106
    goto :goto_1

    .line 107
    :sswitch_7
    const-string v2, "yyyyMMddHHmmssSSSZ"

    .line 108
    .line 109
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-nez v2, :cond_8

    .line 114
    .line 115
    goto :goto_0

    .line 116
    :cond_8
    const/4 v2, 0x2

    .line 117
    goto :goto_1

    .line 118
    :sswitch_8
    const-string v2, "millis"

    .line 119
    .line 120
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-nez v2, :cond_9

    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_9
    move v2, v4

    .line 128
    goto :goto_1

    .line 129
    :sswitch_9
    const-string v2, "yyyy-MM-dd HH:mm"

    .line 130
    .line 131
    invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v2

    .line 135
    if-nez v2, :cond_a

    .line 136
    .line 137
    goto :goto_0

    .line 138
    :cond_a
    move v2, v1

    .line 139
    :goto_1
    packed-switch v2, :pswitch_data_0

    .line 140
    .line 141
    .line 142
    const/16 v2, 0x64

    .line 143
    .line 144
    invoke-virtual {p1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 145
    .line 146
    .line 147
    move-result v2

    .line 148
    if-eq v2, v3, :cond_b

    .line 149
    .line 150
    move v2, v4

    .line 151
    goto :goto_2

    .line 152
    :cond_b
    move v2, v1

    .line 153
    :goto_2
    const/16 v5, 0x48

    .line 154
    .line 155
    invoke-virtual {p1, v5}, Ljava/lang/String;->indexOf(I)I

    .line 156
    .line 157
    .line 158
    move-result v5

    .line 159
    if-ne v5, v3, :cond_d

    .line 160
    .line 161
    const/16 v5, 0x68

    .line 162
    .line 163
    invoke-virtual {p1, v5}, Ljava/lang/String;->indexOf(I)I

    .line 164
    .line 165
    .line 166
    move-result v5

    .line 167
    if-ne v5, v3, :cond_d

    .line 168
    .line 169
    const/16 v5, 0x4b

    .line 170
    .line 171
    invoke-virtual {p1, v5}, Ljava/lang/String;->indexOf(I)I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-ne v5, v3, :cond_d

    .line 176
    .line 177
    const/16 v5, 0x6b

    .line 178
    .line 179
    invoke-virtual {p1, v5}, Ljava/lang/String;->indexOf(I)I

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eq v5, v3, :cond_c

    .line 184
    .line 185
    goto :goto_3

    .line 186
    :cond_c
    move v3, v1

    .line 187
    goto :goto_4

    .line 188
    :cond_d
    :goto_3
    move v3, v4

    .line 189
    :goto_4
    move v7, v1

    .line 190
    move v5, v2

    .line 191
    move v6, v3

    .line 192
    move v2, v7

    .line 193
    move v3, v2

    .line 194
    goto/16 :goto_6

    .line 195
    .line 196
    :pswitch_0
    move v2, v1

    .line 197
    move v3, v2

    .line 198
    move v5, v3

    .line 199
    move v6, v5

    .line 200
    move v7, v6

    .line 201
    move v1, v4

    .line 202
    goto :goto_6

    .line 203
    :pswitch_1
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmssT19:Z

    .line 204
    .line 205
    :goto_5
    move v2, v1

    .line 206
    move v3, v2

    .line 207
    move v7, v3

    .line 208
    move v5, v4

    .line 209
    move v6, v5

    .line 210
    goto :goto_6

    .line 211
    :pswitch_2
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmss19:Z

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :pswitch_3
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMdd8:Z

    .line 215
    .line 216
    move v2, v1

    .line 217
    move v3, v2

    .line 218
    move v6, v3

    .line 219
    move v7, v6

    .line 220
    move v5, v4

    .line 221
    goto :goto_6

    .line 222
    :pswitch_4
    move v3, v1

    .line 223
    move v5, v3

    .line 224
    move v6, v5

    .line 225
    move v7, v6

    .line 226
    move v2, v4

    .line 227
    goto :goto_6

    .line 228
    :pswitch_5
    move v2, v1

    .line 229
    move v3, v2

    .line 230
    move v5, v3

    .line 231
    move v6, v5

    .line 232
    move v7, v4

    .line 233
    goto :goto_6

    .line 234
    :pswitch_6
    move v2, v1

    .line 235
    move v5, v2

    .line 236
    move v6, v5

    .line 237
    move v7, v6

    .line 238
    move v3, v4

    .line 239
    goto :goto_6

    .line 240
    :pswitch_7
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->yyyyMMddhhmm16:Z

    .line 241
    .line 242
    move v2, v1

    .line 243
    move v3, v2

    .line 244
    move v5, v3

    .line 245
    move v6, v5

    .line 246
    move v7, v6

    .line 247
    :goto_6
    iget-boolean v8, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmss19:Z

    .line 248
    .line 249
    iget-boolean v9, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmssT19:Z

    .line 250
    .line 251
    or-int/2addr v8, v9

    .line 252
    iget-boolean v9, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMdd8:Z

    .line 253
    .line 254
    or-int/2addr v8, v9

    .line 255
    or-int/2addr v8, v1

    .line 256
    xor-int/2addr v4, v8

    .line 257
    iput-boolean v4, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatComplex:Z

    .line 258
    .line 259
    move v10, v2

    .line 260
    move v2, v1

    .line 261
    move v1, v10

    .line 262
    goto :goto_7

    .line 263
    :cond_e
    move v2, v1

    .line 264
    move v3, v2

    .line 265
    move v5, v3

    .line 266
    move v6, v5

    .line 267
    move v7, v6

    .line 268
    :goto_7
    iget-object v4, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormat:Ljava/lang/String;

    .line 269
    .line 270
    if-eqz v4, :cond_f

    .line 271
    .line 272
    invoke-virtual {v4, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    if-nez v4, :cond_f

    .line 277
    .line 278
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 279
    .line 280
    :cond_f
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormat:Ljava/lang/String;

    .line 281
    .line 282
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatUnixTime:Z

    .line 283
    .line 284
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatMillis:Z

    .line 285
    .line 286
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatISO8601:Z

    .line 287
    .line 288
    iput-boolean v5, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatHasDay:Z

    .line 289
    .line 290
    iput-boolean v6, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatHasHour:Z

    .line 291
    .line 292
    iput-boolean v7, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->useSimpleFormatter:Z

    .line 293
    .line 294
    return-void

    .line 295
    :sswitch_data_0
    .sparse-switch
        -0x45dc2bc6 -> :sswitch_9
        -0x400565ba -> :sswitch_8
        -0x14bad9d9 -> :sswitch_7
        -0x112ad7ab -> :sswitch_6
        -0x10781ba0 -> :sswitch_5
        -0x985fe00 -> :sswitch_4
        0x4f76f1a0 -> :sswitch_3
        0x6b2ed43a -> :sswitch_2
        0x6d5d7dd4 -> :sswitch_1
        0x7ce21384 -> :sswitch_0
    .end sparse-switch

    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method

.method public setDateFormatter(Ljava/time/format/DateTimeFormatter;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormatter:Ljava/time/format/DateTimeFormatter;

    .line 2
    .line 3
    return-void
.end method

.method public setExtraProcessor(Lcom/alibaba/fastjson2/filter/ExtraProcessor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->extraProcessor:Lcom/alibaba/fastjson2/filter/ExtraProcessor;

    .line 2
    .line 3
    return-void
.end method

.method public setFeatures(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 2
    .line 3
    return-void
.end method

.method public setLocale(Ljava/util/Locale;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->locale:Ljava/util/Locale;

    .line 2
    .line 3
    return-void
.end method

.method public setMaxLevel(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    .line 2
    .line 3
    return-void
.end method

.method public setObjectSupplier(Ljava/util/function/Supplier;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Supplier<",
            "Ljava/util/Map;",
            ">;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->objectSupplier:Ljava/util/function/Supplier;

    .line 2
    .line 3
    return-void
.end method

.method public setTimeZone(Ljava/util/TimeZone;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->timeZone:Ljava/util/TimeZone;

    .line 2
    .line 3
    return-void
.end method

.method public setZoneId(Ljava/time/ZoneId;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 2
    .line 3
    return-void
.end method
