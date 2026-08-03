.class final Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/gson/internal/bind/TypeAdapters$FactorySupplier;


# annotations
.annotation build Lcom/google/gson/internal/bind/IgnoreJRERequirement;
.end annotation


# static fields
.field private static final DURATION:Lcom/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/time/Duration;",
            ">;"
        }
    .end annotation
.end field

.field private static final INSTANT:Lcom/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/time/Instant;",
            ">;"
        }
    .end annotation
.end field

.field static final JAVA_TIME_FACTORY:Lcom/google/gson/TypeAdapterFactory;

.field private static final LOCAL_DATE:Lcom/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/time/LocalDate;",
            ">;"
        }
    .end annotation
.end field

.field public static final LOCAL_TIME:Lcom/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/time/LocalTime;",
            ">;"
        }
    .end annotation
.end field

.field private static final MONTH_DAY:Lcom/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/time/MonthDay;",
            ">;"
        }
    .end annotation
.end field

.field private static final PERIOD:Lcom/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/time/Period;",
            ">;"
        }
    .end annotation
.end field

.field private static final YEAR:Lcom/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/time/Year;",
            ">;"
        }
    .end annotation
.end field

.field private static final YEAR_MONTH:Lcom/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/time/YearMonth;",
            ">;"
        }
    .end annotation
.end field

.field private static final ZONE_ID:Lcom/google/gson/TypeAdapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/time/ZoneId;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 8

    new-instance v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$1;

    const-string v1, "seconds"

    const-string v2, "nanos"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$1;-><init>([Ljava/lang/String;)V

    sput-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->DURATION:Lcom/google/gson/TypeAdapter;

    new-instance v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$2;

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$2;-><init>([Ljava/lang/String;)V

    sput-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->INSTANT:Lcom/google/gson/TypeAdapter;

    new-instance v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$3;

    const-string v1, "year"

    const-string v2, "month"

    const-string v3, "day"

    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$3;-><init>([Ljava/lang/String;)V

    sput-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->LOCAL_DATE:Lcom/google/gson/TypeAdapter;

    new-instance v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$4;

    const-string v4, "second"

    const-string v5, "nano"

    const-string v6, "hour"

    const-string v7, "minute"

    filled-new-array {v6, v7, v4, v5}, [Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$4;-><init>([Ljava/lang/String;)V

    sput-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->LOCAL_TIME:Lcom/google/gson/TypeAdapter;

    new-instance v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$6;

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$6;-><init>([Ljava/lang/String;)V

    sput-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->MONTH_DAY:Lcom/google/gson/TypeAdapter;

    new-instance v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$9;

    const-string v3, "months"

    const-string v4, "days"

    const-string v5, "years"

    filled-new-array {v5, v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$9;-><init>([Ljava/lang/String;)V

    sput-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->PERIOD:Lcom/google/gson/TypeAdapter;

    new-instance v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$10;

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$10;-><init>([Ljava/lang/String;)V

    sput-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->YEAR:Lcom/google/gson/TypeAdapter;

    new-instance v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$11;

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$11;-><init>([Ljava/lang/String;)V

    sput-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->YEAR_MONTH:Lcom/google/gson/TypeAdapter;

    new-instance v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$12;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$12;-><init>()V

    invoke-virtual {v0}, Lcom/google/gson/TypeAdapter;->nullSafe()Lcom/google/gson/TypeAdapter;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->ZONE_ID:Lcom/google/gson/TypeAdapter;

    new-instance v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$14;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$14;-><init>()V

    sput-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->JAVA_TIME_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic access$000(Ljava/lang/Object;Ljava/lang/String;Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->requireNonNullField(Ljava/lang/Object;Ljava/lang/String;Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$100()Lcom/google/gson/TypeAdapter;
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->DURATION:Lcom/google/gson/TypeAdapter;

    return-object v0
.end method

.method public static synthetic access$1000()Lcom/google/gson/TypeAdapter;
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->YEAR_MONTH:Lcom/google/gson/TypeAdapter;

    return-object v0
.end method

.method public static synthetic access$1100()Lcom/google/gson/TypeAdapter;
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->ZONE_ID:Lcom/google/gson/TypeAdapter;

    return-object v0
.end method

.method public static synthetic access$1200(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;
    .locals 0

    invoke-static {p0}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->zonedDateTime(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$200()Lcom/google/gson/TypeAdapter;
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->INSTANT:Lcom/google/gson/TypeAdapter;

    return-object v0
.end method

.method public static synthetic access$300()Lcom/google/gson/TypeAdapter;
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->LOCAL_DATE:Lcom/google/gson/TypeAdapter;

    return-object v0
.end method

.method public static synthetic access$400(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;
    .locals 0

    invoke-static {p0}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->localDateTime(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$500()Lcom/google/gson/TypeAdapter;
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->MONTH_DAY:Lcom/google/gson/TypeAdapter;

    return-object v0
.end method

.method public static synthetic access$600(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;
    .locals 0

    invoke-static {p0}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->offsetDateTime(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$700(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;
    .locals 0

    invoke-static {p0}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->offsetTime(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic access$800()Lcom/google/gson/TypeAdapter;
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->PERIOD:Lcom/google/gson/TypeAdapter;

    return-object v0
.end method

.method public static synthetic access$900()Lcom/google/gson/TypeAdapter;
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->YEAR:Lcom/google/gson/TypeAdapter;

    return-object v0
.end method

.method private static localDateTime(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/Gson;",
            ")",
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/time/LocalDateTime;",
            ">;"
        }
    .end annotation

    const-class v0, Ljava/time/LocalDate;

    invoke-virtual {p0, v0}, Lcom/google/gson/Gson;->getAdapter(Ljava/lang/Class;)Lcom/google/gson/TypeAdapter;

    move-result-object v0

    const-class v1, Ljava/time/LocalTime;

    invoke-virtual {p0, v1}, Lcom/google/gson/Gson;->getAdapter(Ljava/lang/Class;)Lcom/google/gson/TypeAdapter;

    move-result-object p0

    new-instance v1, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$5;

    invoke-direct {v1, v0, p0}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$5;-><init>(Lcom/google/gson/TypeAdapter;Lcom/google/gson/TypeAdapter;)V

    invoke-virtual {v1}, Lcom/google/gson/TypeAdapter;->nullSafe()Lcom/google/gson/TypeAdapter;

    move-result-object p0

    return-object p0
.end method

.method private static offsetDateTime(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/Gson;",
            ")",
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/time/OffsetDateTime;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->localDateTime(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;

    move-result-object v0

    const-class v1, Ljava/time/ZoneOffset;

    invoke-virtual {p0, v1}, Lcom/google/gson/Gson;->getAdapter(Ljava/lang/Class;)Lcom/google/gson/TypeAdapter;

    move-result-object p0

    new-instance v1, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$7;

    invoke-direct {v1, v0, p0}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$7;-><init>(Lcom/google/gson/TypeAdapter;Lcom/google/gson/TypeAdapter;)V

    invoke-virtual {v1}, Lcom/google/gson/TypeAdapter;->nullSafe()Lcom/google/gson/TypeAdapter;

    move-result-object p0

    return-object p0
.end method

.method private static offsetTime(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/Gson;",
            ")",
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/time/OffsetTime;",
            ">;"
        }
    .end annotation

    const-class v0, Ljava/time/LocalTime;

    invoke-virtual {p0, v0}, Lcom/google/gson/Gson;->getAdapter(Ljava/lang/Class;)Lcom/google/gson/TypeAdapter;

    move-result-object v0

    const-class v1, Ljava/time/ZoneOffset;

    invoke-virtual {p0, v1}, Lcom/google/gson/Gson;->getAdapter(Ljava/lang/Class;)Lcom/google/gson/TypeAdapter;

    move-result-object p0

    new-instance v1, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$8;

    invoke-direct {v1, v0, p0}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$8;-><init>(Lcom/google/gson/TypeAdapter;Lcom/google/gson/TypeAdapter;)V

    invoke-virtual {v1}, Lcom/google/gson/TypeAdapter;->nullSafe()Lcom/google/gson/TypeAdapter;

    move-result-object p0

    return-object p0
.end method

.method private static requireNonNullField(Ljava/lang/Object;Ljava/lang/String;Lcom/google/gson/stream/JsonReader;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/String;",
            "Lcom/google/gson/stream/JsonReader;",
            ")TT;"
        }
    .end annotation

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Lcom/google/gson/JsonSyntaxException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Missing "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " field; at path "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Lcom/google/gson/stream/JsonReader;->getPreviousPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/gson/JsonSyntaxException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static zonedDateTime(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/gson/Gson;",
            ")",
            "Lcom/google/gson/TypeAdapter<",
            "Ljava/time/ZonedDateTime;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->localDateTime(Lcom/google/gson/Gson;)Lcom/google/gson/TypeAdapter;

    move-result-object v0

    const-class v1, Ljava/time/ZoneOffset;

    invoke-virtual {p0, v1}, Lcom/google/gson/Gson;->getAdapter(Ljava/lang/Class;)Lcom/google/gson/TypeAdapter;

    move-result-object v1

    const-class v2, Ljava/time/ZoneId;

    invoke-virtual {p0, v2}, Lcom/google/gson/Gson;->getAdapter(Ljava/lang/Class;)Lcom/google/gson/TypeAdapter;

    move-result-object p0

    new-instance v2, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$13;

    invoke-direct {v2, v0, v1, p0}, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters$13;-><init>(Lcom/google/gson/TypeAdapter;Lcom/google/gson/TypeAdapter;Lcom/google/gson/TypeAdapter;)V

    invoke-virtual {v2}, Lcom/google/gson/TypeAdapter;->nullSafe()Lcom/google/gson/TypeAdapter;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public get()Lcom/google/gson/TypeAdapterFactory;
    .locals 1

    sget-object v0, Lcom/google/gson/internal/bind/JavaTimeTypeAdapters;->JAVA_TIME_FACTORY:Lcom/google/gson/TypeAdapterFactory;

    return-object v0
.end method
