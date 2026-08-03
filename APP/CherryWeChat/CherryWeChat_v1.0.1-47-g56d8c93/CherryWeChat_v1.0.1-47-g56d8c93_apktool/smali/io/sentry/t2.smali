.class public final enum Lio/sentry/t2;
.super Ljava/lang/Enum;
.source ""


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/t2;

.field public static final enum ALWAYS:Lio/sentry/t2;

.field public static final enum MEDIUM:Lio/sentry/t2;

.field public static final enum NONE:Lio/sentry/t2;

.field public static final enum SMALL:Lio/sentry/t2;


# direct methods
.method private static synthetic $values()[Lio/sentry/t2;
    .locals 4

    sget-object v0, Lio/sentry/t2;->NONE:Lio/sentry/t2;

    sget-object v1, Lio/sentry/t2;->SMALL:Lio/sentry/t2;

    sget-object v2, Lio/sentry/t2;->MEDIUM:Lio/sentry/t2;

    sget-object v3, Lio/sentry/t2;->ALWAYS:Lio/sentry/t2;

    filled-new-array {v0, v1, v2, v3}, [Lio/sentry/t2;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/t2;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/t2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/t2;->NONE:Lio/sentry/t2;

    new-instance v0, Lio/sentry/t2;

    const-string v1, "SMALL"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/sentry/t2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/t2;->SMALL:Lio/sentry/t2;

    new-instance v0, Lio/sentry/t2;

    const-string v1, "MEDIUM"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/sentry/t2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/t2;->MEDIUM:Lio/sentry/t2;

    new-instance v0, Lio/sentry/t2;

    const-string v1, "ALWAYS"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lio/sentry/t2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/t2;->ALWAYS:Lio/sentry/t2;

    invoke-static {}, Lio/sentry/t2;->$values()[Lio/sentry/t2;

    move-result-object v0

    sput-object v0, Lio/sentry/t2;->$VALUES:[Lio/sentry/t2;

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

.method public static valueOf(Ljava/lang/String;)Lio/sentry/t2;
    .locals 1

    const-class v0, Lio/sentry/t2;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/t2;

    return-object p0
.end method

.method public static values()[Lio/sentry/t2;
    .locals 1

    sget-object v0, Lio/sentry/t2;->$VALUES:[Lio/sentry/t2;

    invoke-virtual {v0}, [Lio/sentry/t2;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/t2;

    return-object v0
.end method
