.class public final enum Lio/sentry/android/core/performance/e;
.super Ljava/lang/Enum;
.source ""


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/android/core/performance/e;

.field public static final enum COLD:Lio/sentry/android/core/performance/e;

.field public static final enum UNKNOWN:Lio/sentry/android/core/performance/e;

.field public static final enum WARM:Lio/sentry/android/core/performance/e;


# direct methods
.method private static synthetic $values()[Lio/sentry/android/core/performance/e;
    .locals 3

    sget-object v0, Lio/sentry/android/core/performance/e;->UNKNOWN:Lio/sentry/android/core/performance/e;

    sget-object v1, Lio/sentry/android/core/performance/e;->COLD:Lio/sentry/android/core/performance/e;

    sget-object v2, Lio/sentry/android/core/performance/e;->WARM:Lio/sentry/android/core/performance/e;

    filled-new-array {v0, v1, v2}, [Lio/sentry/android/core/performance/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/android/core/performance/e;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/android/core/performance/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/android/core/performance/e;->UNKNOWN:Lio/sentry/android/core/performance/e;

    new-instance v0, Lio/sentry/android/core/performance/e;

    const-string v1, "COLD"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/sentry/android/core/performance/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/android/core/performance/e;->COLD:Lio/sentry/android/core/performance/e;

    new-instance v0, Lio/sentry/android/core/performance/e;

    const-string v1, "WARM"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/sentry/android/core/performance/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/android/core/performance/e;->WARM:Lio/sentry/android/core/performance/e;

    invoke-static {}, Lio/sentry/android/core/performance/e;->$values()[Lio/sentry/android/core/performance/e;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/performance/e;->$VALUES:[Lio/sentry/android/core/performance/e;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/android/core/performance/e;
    .locals 1

    const-class v0, Lio/sentry/android/core/performance/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/android/core/performance/e;

    return-object p0
.end method

.method public static values()[Lio/sentry/android/core/performance/e;
    .locals 1

    sget-object v0, Lio/sentry/android/core/performance/e;->$VALUES:[Lio/sentry/android/core/performance/e;

    invoke-virtual {v0}, [Lio/sentry/android/core/performance/e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/android/core/performance/e;

    return-object v0
.end method
