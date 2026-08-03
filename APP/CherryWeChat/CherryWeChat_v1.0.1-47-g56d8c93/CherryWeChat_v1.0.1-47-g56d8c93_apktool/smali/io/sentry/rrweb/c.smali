.class public final enum Lio/sentry/rrweb/c;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lio/sentry/C0;


# static fields
.field private static final synthetic $VALUES:[Lio/sentry/rrweb/c;

.field public static final enum Custom:Lio/sentry/rrweb/c;

.field public static final enum DomContentLoaded:Lio/sentry/rrweb/c;

.field public static final enum FullSnapshot:Lio/sentry/rrweb/c;

.field public static final enum IncrementalSnapshot:Lio/sentry/rrweb/c;

.field public static final enum Load:Lio/sentry/rrweb/c;

.field public static final enum Meta:Lio/sentry/rrweb/c;

.field public static final enum Plugin:Lio/sentry/rrweb/c;


# direct methods
.method private static synthetic $values()[Lio/sentry/rrweb/c;
    .locals 7

    sget-object v0, Lio/sentry/rrweb/c;->DomContentLoaded:Lio/sentry/rrweb/c;

    sget-object v1, Lio/sentry/rrweb/c;->Load:Lio/sentry/rrweb/c;

    sget-object v2, Lio/sentry/rrweb/c;->FullSnapshot:Lio/sentry/rrweb/c;

    sget-object v3, Lio/sentry/rrweb/c;->IncrementalSnapshot:Lio/sentry/rrweb/c;

    sget-object v4, Lio/sentry/rrweb/c;->Meta:Lio/sentry/rrweb/c;

    sget-object v5, Lio/sentry/rrweb/c;->Custom:Lio/sentry/rrweb/c;

    sget-object v6, Lio/sentry/rrweb/c;->Plugin:Lio/sentry/rrweb/c;

    filled-new-array/range {v0 .. v6}, [Lio/sentry/rrweb/c;

    move-result-object v0

    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/sentry/rrweb/c;

    const-string v1, "DomContentLoaded"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/c;->DomContentLoaded:Lio/sentry/rrweb/c;

    new-instance v0, Lio/sentry/rrweb/c;

    const-string v1, "Load"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/c;->Load:Lio/sentry/rrweb/c;

    new-instance v0, Lio/sentry/rrweb/c;

    const-string v1, "FullSnapshot"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/c;->FullSnapshot:Lio/sentry/rrweb/c;

    new-instance v0, Lio/sentry/rrweb/c;

    const-string v1, "IncrementalSnapshot"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/c;->IncrementalSnapshot:Lio/sentry/rrweb/c;

    new-instance v0, Lio/sentry/rrweb/c;

    const-string v1, "Meta"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/c;->Meta:Lio/sentry/rrweb/c;

    new-instance v0, Lio/sentry/rrweb/c;

    const-string v1, "Custom"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/c;->Custom:Lio/sentry/rrweb/c;

    new-instance v0, Lio/sentry/rrweb/c;

    const-string v1, "Plugin"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lio/sentry/rrweb/c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/sentry/rrweb/c;->Plugin:Lio/sentry/rrweb/c;

    invoke-static {}, Lio/sentry/rrweb/c;->$values()[Lio/sentry/rrweb/c;

    move-result-object v0

    sput-object v0, Lio/sentry/rrweb/c;->$VALUES:[Lio/sentry/rrweb/c;

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

.method public static valueOf(Ljava/lang/String;)Lio/sentry/rrweb/c;
    .locals 1

    const-class v0, Lio/sentry/rrweb/c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/sentry/rrweb/c;

    return-object p0
.end method

.method public static values()[Lio/sentry/rrweb/c;
    .locals 1

    sget-object v0, Lio/sentry/rrweb/c;->$VALUES:[Lio/sentry/rrweb/c;

    invoke-virtual {v0}, [Lio/sentry/rrweb/c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/rrweb/c;

    return-object v0
.end method


# virtual methods
.method public serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    int-to-long v0, p2

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, v0, v1}, Lio/sentry/internal/debugmeta/c;->v(J)Lio/sentry/internal/debugmeta/c;

    return-void
.end method
