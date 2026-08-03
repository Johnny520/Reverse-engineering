.class public final enum Lio/sentry/e2;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lio/sentry/C0;


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/e2;

.field public static final enum DEBUG:Lio/sentry/e2;

.field public static final enum ERROR:Lio/sentry/e2;

.field public static final enum FATAL:Lio/sentry/e2;

.field public static final enum INFO:Lio/sentry/e2;

.field public static final enum TRACE:Lio/sentry/e2;

.field public static final enum WARN:Lio/sentry/e2;


# instance fields
.field private final severityNumber:I


# direct methods
.method private static synthetic $values()[Lio/sentry/e2;
    .locals 6

    sget-object v0, Lio/sentry/e2;->TRACE:Lio/sentry/e2;

    sget-object v1, Lio/sentry/e2;->DEBUG:Lio/sentry/e2;

    sget-object v2, Lio/sentry/e2;->INFO:Lio/sentry/e2;

    sget-object v3, Lio/sentry/e2;->WARN:Lio/sentry/e2;

    sget-object v4, Lio/sentry/e2;->ERROR:Lio/sentry/e2;

    sget-object v5, Lio/sentry/e2;->FATAL:Lio/sentry/e2;

    filled-new-array/range {v0 .. v5}, [Lio/sentry/e2;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lio/sentry/e2;

    const-string v1, "TRACE"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lio/sentry/e2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/e2;->TRACE:Lio/sentry/e2;

    new-instance v0, Lio/sentry/e2;

    const-string v1, "DEBUG"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v3, v2}, Lio/sentry/e2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/e2;->DEBUG:Lio/sentry/e2;

    new-instance v0, Lio/sentry/e2;

    const/4 v1, 0x2

    const/16 v3, 0x9

    const-string v4, "INFO"

    invoke-direct {v0, v4, v1, v3}, Lio/sentry/e2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/e2;->INFO:Lio/sentry/e2;

    new-instance v0, Lio/sentry/e2;

    const/4 v1, 0x3

    const/16 v3, 0xd

    const-string v4, "WARN"

    invoke-direct {v0, v4, v1, v3}, Lio/sentry/e2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/e2;->WARN:Lio/sentry/e2;

    new-instance v0, Lio/sentry/e2;

    const/4 v1, 0x4

    const/16 v3, 0x11

    const-string v4, "ERROR"

    invoke-direct {v0, v4, v1, v3}, Lio/sentry/e2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/e2;->ERROR:Lio/sentry/e2;

    new-instance v0, Lio/sentry/e2;

    const-string v1, "FATAL"

    const/16 v3, 0x15

    invoke-direct {v0, v1, v2, v3}, Lio/sentry/e2;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/e2;->FATAL:Lio/sentry/e2;

    invoke-static {}, Lio/sentry/e2;->$values()[Lio/sentry/e2;

    move-result-object v0

    sput-object v0, Lio/sentry/e2;->$VALUES:[Lio/sentry/e2;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/sentry/e2;->severityNumber:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/e2;
    .locals 1

    const-class v0, Lio/sentry/e2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/e2;

    return-object p0
.end method

.method public static values()[Lio/sentry/e2;
    .locals 1

    sget-object v0, Lio/sentry/e2;->$VALUES:[Lio/sentry/e2;

    invoke-virtual {v0}, [Lio/sentry/e2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/e2;

    return-object v0
.end method


# virtual methods
.method public getSeverityNumber()I
    .locals 1

    iget v0, p0, Lio/sentry/e2;->severityNumber:I

    return v0
.end method

.method public serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p2}, Lio/sentry/internal/debugmeta/c;->z(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    return-void
.end method
