.class public final enum Lio/sentry/w2;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lio/sentry/C0;


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/w2;

.field public static final enum BUFFER:Lio/sentry/w2;

.field public static final enum SESSION:Lio/sentry/w2;


# direct methods
.method private static synthetic $values()[Lio/sentry/w2;
    .locals 2

    sget-object v0, Lio/sentry/w2;->SESSION:Lio/sentry/w2;

    sget-object v1, Lio/sentry/w2;->BUFFER:Lio/sentry/w2;

    filled-new-array {v0, v1}, [Lio/sentry/w2;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/w2;

    const-string v1, "SESSION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/w2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/w2;->SESSION:Lio/sentry/w2;

    new-instance v0, Lio/sentry/w2;

    const-string v1, "BUFFER"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/sentry/w2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/w2;->BUFFER:Lio/sentry/w2;

    invoke-static {}, Lio/sentry/w2;->$values()[Lio/sentry/w2;

    move-result-object v0

    sput-object v0, Lio/sentry/w2;->$VALUES:[Lio/sentry/w2;

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

.method public static valueOf(Ljava/lang/String;)Lio/sentry/w2;
    .locals 1

    const-class v0, Lio/sentry/w2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/w2;

    return-object p0
.end method

.method public static values()[Lio/sentry/w2;
    .locals 1

    sget-object v0, Lio/sentry/w2;->$VALUES:[Lio/sentry/w2;

    invoke-virtual {v0}, [Lio/sentry/w2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/w2;

    return-object v0
.end method


# virtual methods
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
