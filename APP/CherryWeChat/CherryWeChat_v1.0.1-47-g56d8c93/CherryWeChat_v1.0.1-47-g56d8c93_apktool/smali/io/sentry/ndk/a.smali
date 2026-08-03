.class public final enum Lio/sentry/ndk/a;
.super Ljava/lang/Enum;
.source ""


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/ndk/a;

.field public static final enum SENTRY_HANDLER_STRATEGY_CHAIN_AT_START:Lio/sentry/ndk/a;

.field public static final enum SENTRY_HANDLER_STRATEGY_DEFAULT:Lio/sentry/ndk/a;


# instance fields
.field private final value:I


# direct methods
.method private static synthetic $values()[Lio/sentry/ndk/a;
    .locals 2

    sget-object v0, Lio/sentry/ndk/a;->SENTRY_HANDLER_STRATEGY_DEFAULT:Lio/sentry/ndk/a;

    sget-object v1, Lio/sentry/ndk/a;->SENTRY_HANDLER_STRATEGY_CHAIN_AT_START:Lio/sentry/ndk/a;

    filled-new-array {v0, v1}, [Lio/sentry/ndk/a;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/ndk/a;

    const-string v1, "SENTRY_HANDLER_STRATEGY_DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lio/sentry/ndk/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/ndk/a;->SENTRY_HANDLER_STRATEGY_DEFAULT:Lio/sentry/ndk/a;

    new-instance v0, Lio/sentry/ndk/a;

    const-string v1, "SENTRY_HANDLER_STRATEGY_CHAIN_AT_START"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Lio/sentry/ndk/a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/sentry/ndk/a;->SENTRY_HANDLER_STRATEGY_CHAIN_AT_START:Lio/sentry/ndk/a;

    invoke-static {}, Lio/sentry/ndk/a;->$values()[Lio/sentry/ndk/a;

    move-result-object v0

    sput-object v0, Lio/sentry/ndk/a;->$VALUES:[Lio/sentry/ndk/a;

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

    iput p3, p0, Lio/sentry/ndk/a;->value:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lio/sentry/ndk/a;
    .locals 1

    const-class v0, Lio/sentry/ndk/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/ndk/a;

    return-object p0
.end method

.method public static values()[Lio/sentry/ndk/a;
    .locals 1

    sget-object v0, Lio/sentry/ndk/a;->$VALUES:[Lio/sentry/ndk/a;

    invoke-virtual {v0}, [Lio/sentry/ndk/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/ndk/a;

    return-object v0
.end method


# virtual methods
.method public getValue()I
    .locals 1

    iget v0, p0, Lio/sentry/ndk/a;->value:I

    return v0
.end method
