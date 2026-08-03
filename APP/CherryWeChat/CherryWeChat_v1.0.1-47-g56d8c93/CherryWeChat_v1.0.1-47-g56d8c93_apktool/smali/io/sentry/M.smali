.class public final enum Lio/sentry/M;
.super Ljava/lang/Enum;
.source ""


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/M;

.field public static final enum CONNECTED:Lio/sentry/M;

.field public static final enum DISCONNECTED:Lio/sentry/M;

.field public static final enum NO_PERMISSION:Lio/sentry/M;

.field public static final enum UNKNOWN:Lio/sentry/M;


# direct methods
.method private static synthetic $values()[Lio/sentry/M;
    .locals 4

    sget-object v0, Lio/sentry/M;->UNKNOWN:Lio/sentry/M;

    sget-object v1, Lio/sentry/M;->CONNECTED:Lio/sentry/M;

    sget-object v2, Lio/sentry/M;->DISCONNECTED:Lio/sentry/M;

    sget-object v3, Lio/sentry/M;->NO_PERMISSION:Lio/sentry/M;

    filled-new-array {v0, v1, v2, v3}, [Lio/sentry/M;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/M;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/M;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/M;->UNKNOWN:Lio/sentry/M;

    new-instance v0, Lio/sentry/M;

    const-string v1, "CONNECTED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/sentry/M;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/M;->CONNECTED:Lio/sentry/M;

    new-instance v0, Lio/sentry/M;

    const-string v1, "DISCONNECTED"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/sentry/M;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/M;->DISCONNECTED:Lio/sentry/M;

    new-instance v0, Lio/sentry/M;

    const-string v1, "NO_PERMISSION"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lio/sentry/M;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/M;->NO_PERMISSION:Lio/sentry/M;

    invoke-static {}, Lio/sentry/M;->$values()[Lio/sentry/M;

    move-result-object v0

    sput-object v0, Lio/sentry/M;->$VALUES:[Lio/sentry/M;

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

.method public static valueOf(Ljava/lang/String;)Lio/sentry/M;
    .locals 1

    const-class v0, Lio/sentry/M;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/M;

    return-object p0
.end method

.method public static values()[Lio/sentry/M;
    .locals 1

    sget-object v0, Lio/sentry/M;->$VALUES:[Lio/sentry/M;

    invoke-virtual {v0}, [Lio/sentry/M;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/M;

    return-object v0
.end method
