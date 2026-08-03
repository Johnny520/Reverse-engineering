.class public final L۟/e8;
.super L۟/e;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, L۟/e;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(II)I
    .locals 1

    invoke-static {}, Ljava/util/concurrent/ThreadLocalRandom;->current()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ThreadLocalRandom;->nextInt(II)I

    move-result p1

    return p1
.end method

.method public final ۥ۟۠()Ljava/util/Random;
    .locals 2

    invoke-static {}, Ljava/util/concurrent/ThreadLocalRandom;->current()Ljava/util/concurrent/ThreadLocalRandom;

    move-result-object v0

    const-string v1, "current(...)"

    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    return-object v0
.end method
