.class public final LYue/ۥۢۡ۟ۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final ۥ:Ljava/lang/String; = "DefaultDispatcher"
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟:J
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public static final ۥ۟۟:I
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public static final ۥ۟۟۟:I
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:J
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation
.end field

.field public static ۥ۟۟۟۠:LYue/ۥۡۧۤۨ; = null
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۡ:I = 0x0

.field public static final ۥ۟۟۟ۢ:I = 0x1

.field public static final ۥۣ۟۟۟:LYue/ۥۢ۠ۨۨ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public static final ۥ۟۟۟ۤ:LYue/ۥۢ۠ۨۨ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/16 v7, 0xc

    const/4 v8, 0x0

    const-string v0, "kotlinx.coroutines.scheduler.resolution.ns"

    const-wide/32 v1, 0x186a0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v0 .. v8}, LYue/ۥۢ۠ۧ۟;->ۥ۟۟۟ۡ(Ljava/lang/String;JJJILjava/lang/Object;)J

    move-result-wide v0

    sput-wide v0, LYue/ۥۢۡ۟ۤ;->ۥ۟:J

    invoke-static {}, LYue/ۥۢ۠ۧ۟;->ۥ()I

    move-result v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, LYue/ۥۡۦ۟;->ۥ۟۟۠ۤ(II)I

    move-result v3

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v2, "kotlinx.coroutines.scheduler.core.pool.size"

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v2 .. v7}, LYue/ۥۢ۠ۧ۟;->ۥ۟۟۟۠(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LYue/ۥۢۡ۟ۤ;->ۥ۟۟:I

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v1, "kotlinx.coroutines.scheduler.max.pool.size"

    const v2, 0x1ffffe

    const/4 v3, 0x0

    const v4, 0x1ffffe

    invoke-static/range {v1 .. v6}, LYue/ۥۢ۠ۧ۟;->ۥ۟۟۟۠(Ljava/lang/String;IIIILjava/lang/Object;)I

    move-result v0

    sput v0, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟:I

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const/16 v8, 0xc

    const/4 v9, 0x0

    const-string v1, "kotlinx.coroutines.scheduler.keep.alive.sec"

    const-wide/16 v2, 0x3c

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v1 .. v9}, LYue/ۥۢ۠ۧ۟;->ۥ۟۟۟ۡ(Ljava/lang/String;JJJILjava/lang/Object;)J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟۟:J

    sget-object v0, LYue/ۥۡۢ۠ۧ;->ۥ:LYue/ۥۡۢ۠ۧ;

    sput-object v0, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟۠:LYue/ۥۡۧۤۨ;

    new-instance v0, LYue/ۥۢۡ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۢۡ;-><init>(I)V

    sput-object v0, LYue/ۥۢۡ۟ۤ;->ۥۣ۟۟۟:LYue/ۥۢ۠ۨۨ;

    new-instance v0, LYue/ۥۢۡ;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LYue/ۥۢۡ;-><init>(I)V

    sput-object v0, LYue/ۥۢۡ۟ۤ;->ۥ۟۟۟ۤ:LYue/ۥۢ۠ۨۨ;

    return-void
.end method

.method public static final ۥ(LYue/ۥۢ۠ۨۧ;)Z
    .locals 1
    .param p0    # LYue/ۥۢ۠ۨۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iget-object p0, p0, LYue/ۥۢ۠ۨۧ;->ۥ۟۟۠ۤ:LYue/ۥۢ۠ۨۨ;

    invoke-interface {p0}, LYue/ۥۢ۠ۨۨ;->ۥۣ۟۟ۤ()I

    move-result p0

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
