.class public final synthetic LYue/ۥۣ۠ۢۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥۣ۠ۢۡ;J)LYue/ۥۣ۠ۢۡ;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۢۥۣ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;J)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_1

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥۣ۠ۢۤ$ۥ;

    invoke-direct {v0, p1, p2}, LYue/ۥۣ۠ۢۤ$ۥ;-><init>(J)V

    invoke-static {p0, v0}, LYue/ۥۣ۠ۢۤ;->ۥ۟۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Debounce timeout should not be negative"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۢۥۣ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۣۡۥ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;",
            "Ljava/lang/Long;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p0, p1}, LYue/ۥۣ۠ۢۤ;->ۥ۟۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟(LYue/ۥۣ۠ۢۡ;J)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۢۥۣ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;J)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1, p2}, LYue/ۥ۟ۨۨ۟;->ۥ۟۟۟۟(J)J

    move-result-wide p1

    invoke-static {p0, p1, p2}, LYue/ۥۣ۠ۢۧ;->ۥۣۣ۟۟(LYue/ۥۣ۠ۢۡ;J)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۢۡ;
    .locals 1
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۢۥۣ;
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "debounceDuration"
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۣۡۥ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;",
            "LYue/\u06e5\u06e0\u06e0\u06e2\u06e5;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۢۤ$ۥ۟;

    invoke-direct {v0, p1}, LYue/ۥۣ۠ۢۤ$ۥ۟;-><init>(LYue/ۥۣ۠ۡ۟;)V

    invoke-static {p0, v0}, LYue/ۥۣ۠ۢۤ;->ۥ۟۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۢۡ;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TT;",
            "Ljava/lang/Long;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۢۤ$ۥ۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, LYue/ۥۣ۠ۢۤ$ۥ۟۟;-><init>(LYue/ۥۣ۠ۡ۟;LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0}, LYue/ۥۣ۠ۢۥ;->ۥ۟(LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۠(LYue/ۥ۟ۧۧۥ;JJ)LYue/ۥۡۦۡۡ;
    .locals 10
    .param p0    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            "JJ)",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    const-string v3, " ms"

    if-ltz v2, :cond_1

    cmp-long v0, p3, v0

    if-ltz v0, :cond_0

    new-instance v0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;

    const/4 v9, 0x0

    move-object v4, v0

    move-wide v5, p3

    move-wide v7, p1

    invoke-direct/range {v4 .. v9}, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟;-><init>(JJLYue/ۥ۟ۧۤۢ;)V

    const/4 v8, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v4, p0

    move-object v7, v0

    invoke-static/range {v4 .. v9}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟ۢ(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Expected non-negative initial delay, but has "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Expected non-negative delay, but has "

    invoke-virtual {p0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public static synthetic ۥ۟۟۟ۡ(LYue/ۥ۟ۧۧۥ;JJILjava/lang/Object;)LYue/ۥۡۦۡۡ;
    .locals 0

    and-int/lit8 p5, p5, 0x2

    if-eqz p5, :cond_0

    move-wide p3, p1

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۣ۠ۢۧ;->ۥ۟۟ۥۤ(LYue/ۥ۟ۧۧۥ;JJ)LYue/ۥۡۦۡۡ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟ۢ(LYue/ۥۣ۠ۢۡ;J)LYue/ۥۣ۠ۢۡ;
    .locals 2
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۢۥۣ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;J)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    new-instance v0, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p2, p0, v1}, LYue/ۥۣ۠ۢۤ$ۥ۟۟۟۟;-><init>(JLYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)V

    invoke-static {v0}, LYue/ۥۣ۠ۢۥ;->ۥ۟(LYue/ۥۣ۠ۢۤ;)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Sample period should be positive"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥۣ۟۟۟(LYue/ۥۣ۠ۢۡ;J)LYue/ۥۣ۠ۢۡ;
    .locals 0
    .param p0    # LYue/ۥۣ۠ۢۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۠ۢۥۣ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;J)",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;"
        }
    .end annotation

    invoke-static {p1, p2}, LYue/ۥ۟ۨۨ۟;->ۥ۟۟۟۟(J)J

    move-result-wide p1

    invoke-static {p0, p1, p2}, LYue/ۥۣ۠ۢۧ;->ۥۣ۟۠۠(LYue/ۥۣ۠ۢۡ;J)LYue/ۥۣ۠ۢۡ;

    move-result-object p0

    return-object p0
.end method
