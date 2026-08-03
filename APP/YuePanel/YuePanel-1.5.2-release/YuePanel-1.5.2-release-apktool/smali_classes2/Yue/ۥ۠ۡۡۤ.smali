.class public final LYue/ۥ۠ۡۡۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:LYue/ۥۢ۠ۦۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:I = 0x0

.field public static final ۥ۟۟:I = 0x1

.field public static final ۥ۟۟۟:I = 0x2

.field public static final ۥ۟۟۟۟:J = 0xf4240L

.field public static final ۥ۟۟۟۠:J = 0x8637bd05af6L

.field public static final ۥ۟۟۟ۡ:J = 0x3fffffffffffffffL

.field public static final ۥ۟۟۟ۢ:LYue/ۥۢ۠ۦۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "REMOVED_TASK"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۠ۡۡۤ;->ۥ:LYue/ۥۢ۠ۦۢ;

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "CLOSED_EMPTY"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۠ۡۡۤ;->ۥ۟۟۟ۢ:LYue/ۥۢ۠ۦۢ;

    return-void
.end method

.method public static final synthetic ۥ()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥ۠ۡۡۤ;->ۥ۟۟۟ۢ:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static final synthetic ۥ۟()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥ۠ۡۡۤ;->ۥ:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static final ۥ۟۟(J)J
    .locals 2

    const-wide/32 v0, 0xf4240

    div-long/2addr p0, v0

    return-wide p0
.end method

.method public static final ۥ۟۟۟(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    const-wide v0, 0x8637bd05af6L

    cmp-long v0, p0, v0

    if-ltz v0, :cond_1

    const-wide v0, 0x7fffffffffffffffL

    goto :goto_0

    :cond_1
    const-wide/32 v0, 0xf4240

    mul-long/2addr v0, p0

    :goto_0
    return-wide v0
.end method

.method public static synthetic ۥ۟۟۟۟()V
    .locals 0

    return-void
.end method

.method public static synthetic ۥ۟۟۟۠()V
    .locals 0

    return-void
.end method
