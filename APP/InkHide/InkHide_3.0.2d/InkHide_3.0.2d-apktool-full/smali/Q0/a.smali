.class public final LQ0/a;
.super LP0/a;
.source "SourceFile"


# virtual methods
.method public final a()Ljava/util/Random;
    .locals 2

    .line 1
    invoke-static {}, Ljava/util/concurrent/ThreadLocalRandom;->current()Ljava/util/concurrent/ThreadLocalRandom;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "current(...)"

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public final c()I
    .locals 3

    .line 1
    const v0, 0xf423f

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/concurrent/ThreadLocalRandom;->current()Ljava/util/concurrent/ThreadLocalRandom;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const/16 v2, 0x3e8

    .line 9
    .line 10
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/ThreadLocalRandom;->nextInt(II)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method
