.class public final enum Lio/sentry/android/core/W;
.super Ljava/lang/Enum;
.source ""


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/android/core/W;

.field public static final enum SENTRY_HANDLER_STRATEGY_CHAIN_AT_START:Lio/sentry/android/core/W;

.field public static final enum SENTRY_HANDLER_STRATEGY_DEFAULT:Lio/sentry/android/core/W;


# instance fields
.field private final value:I


# direct methods
.method private static synthetic $values()[Lio/sentry/android/core/W;
    .locals 2

    sget-object v0, Lio/sentry/android/core/W;->SENTRY_HANDLER_STRATEGY_DEFAULT:Lio/sentry/android/core/W;

    sget-object v1, Lio/sentry/android/core/W;->SENTRY_HANDLER_STRATEGY_CHAIN_AT_START:Lio/sentry/android/core/W;

    filled-new-array {v0, v1}, [Lio/sentry/android/core/W;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/android/core/W;

    const-string v1, "SENTRY_HANDLER_STRATEGY_DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lio/sentry/android/core/W;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/android/core/W;->SENTRY_HANDLER_STRATEGY_DEFAULT:Lio/sentry/android/core/W;

    new-instance v0, Lio/sentry/android/core/W;

    const-string v1, "SENTRY_HANDLER_STRATEGY_CHAIN_AT_START"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lio/sentry/android/core/W;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/android/core/W;->SENTRY_HANDLER_STRATEGY_CHAIN_AT_START:Lio/sentry/android/core/W;

    invoke-static {}, Lio/sentry/android/core/W;->$values()[Lio/sentry/android/core/W;

    move-result-object v0

    sput-object v0, Lio/sentry/android/core/W;->$VALUES:[Lio/sentry/android/core/W;

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

    iput p3, p0, Lio/sentry/android/core/W;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/android/core/W;
    .locals 1

    const-class v0, Lio/sentry/android/core/W;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/android/core/W;

    return-object p0
.end method

.method public static values()[Lio/sentry/android/core/W;
    .locals 1

    sget-object v0, Lio/sentry/android/core/W;->$VALUES:[Lio/sentry/android/core/W;

    invoke-virtual {v0}, [Lio/sentry/android/core/W;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/android/core/W;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lio/sentry/android/core/W;->value:I

    return v0
.end method
