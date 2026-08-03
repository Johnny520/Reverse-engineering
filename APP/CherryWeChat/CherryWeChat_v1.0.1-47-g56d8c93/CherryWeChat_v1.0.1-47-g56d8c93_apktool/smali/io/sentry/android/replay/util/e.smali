.class public final enum Lio/sentry/android/replay/util/e;
.super Ljava/lang/Enum;
.source ""


# static fields
.field private static final synthetic $ENTRIES:Lng;

.field private static final synthetic $VALUES:[Lio/sentry/android/replay/util/e;

.field public static final enum SOC_MANUFACTURER:Lio/sentry/android/replay/util/e;

.field public static final enum SOC_MODEL:Lio/sentry/android/replay/util/e;


# direct methods
.method private static final synthetic $values()[Lio/sentry/android/replay/util/e;
    .locals 2

    sget-object v0, Lio/sentry/android/replay/util/e;->SOC_MODEL:Lio/sentry/android/replay/util/e;

    sget-object v1, Lio/sentry/android/replay/util/e;->SOC_MANUFACTURER:Lio/sentry/android/replay/util/e;

    filled-new-array {v0, v1}, [Lio/sentry/android/replay/util/e;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/android/replay/util/e;

    const-string v1, "SOC_MODEL"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/android/replay/util/e;->SOC_MODEL:Lio/sentry/android/replay/util/e;

    new-instance v0, Lio/sentry/android/replay/util/e;

    const-string v1, "SOC_MANUFACTURER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/android/replay/util/e;->SOC_MANUFACTURER:Lio/sentry/android/replay/util/e;

    invoke-static {}, Lio/sentry/android/replay/util/e;->$values()[Lio/sentry/android/replay/util/e;

    move-result-object v0

    sput-object v0, Lio/sentry/android/replay/util/e;->$VALUES:[Lio/sentry/android/replay/util/e;

    new-instance v1, Log;

    invoke-direct {v1, v0}, Log;-><init>([Ljava/lang/Enum;)V

    sput-object v1, Lio/sentry/android/replay/util/e;->$ENTRIES:Lng;

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

.method public static getEntries()Lng;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lng;"
        }
    .end annotation

    sget-object v0, Lio/sentry/android/replay/util/e;->$ENTRIES:Lng;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/android/replay/util/e;
    .locals 1

    const-class v0, Lio/sentry/android/replay/util/e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/android/replay/util/e;

    return-object p0
.end method

.method public static values()[Lio/sentry/android/replay/util/e;
    .locals 1

    sget-object v0, Lio/sentry/android/replay/util/e;->$VALUES:[Lio/sentry/android/replay/util/e;

    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/android/replay/util/e;

    return-object v0
.end method
