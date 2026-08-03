.class public final Lc0/v1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static volatile a:J

.field public static volatile b:Lc0/x1;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lc0/x1;

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    const v2, 0x3eb851ec    # 0.36f

    const-string v3, "default"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lc0/x1;-><init>(ZFLjava/lang/String;J)V

    sput-object v6, Lc0/v1;->b:Lc0/x1;

    new-instance v0, Lc0/g1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lc0/g1;-><init>(I)V

    invoke-static {v0}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor(Ljava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    return-void
.end method

.method public static a()Lc0/x1;
    .locals 7

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    sget-wide v0, Lc0/v1;->a:J

    sub-long v0, v4, v0

    const-wide/16 v2, 0x5dc

    cmp-long v0, v0, v2

    if-gez v0, :cond_0

    sget-object v0, Lc0/v1;->b:Lc0/x1;

    goto :goto_1

    :cond_0
    sput-wide v4, Lc0/v1;->a:J

    new-instance v6, Lc0/x1;

    sget-object v0, Lc0/h1;->a:Lc0/h1;

    const-string v0, "round_avatar_enabled"

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lc0/h1;->c(Ljava/lang/String;Z)Z

    move-result v1

    const-string v0, "round_avatar_radius"

    const-string v2, "0.36"

    invoke-static {v0, v2}, Lc0/h1;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, LW0/p;->z0(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_1
    const v0, 0x3eb851ec    # 0.36f

    :goto_0
    const v2, 0x3d4ccccd    # 0.05f

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static {v0, v2, v3}, LA0/p;->o(FFF)F

    move-result v2

    const-string v3, "public"

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lc0/x1;-><init>(ZFLjava/lang/String;J)V

    sput-object v6, Lc0/v1;->b:Lc0/x1;

    sget-object v0, Lc0/v1;->b:Lc0/x1;

    :goto_1
    return-object v0
.end method
