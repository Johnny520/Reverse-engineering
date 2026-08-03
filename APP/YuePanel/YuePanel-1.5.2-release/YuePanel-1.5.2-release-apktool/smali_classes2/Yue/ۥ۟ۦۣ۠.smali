.class public final LYue/ۥ۟ۦۣ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CompletedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,593:1\n1#2:594\n*E\n"
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/Object;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥۣ۟ۧۦ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟:LYue/ۥۣ۠ۡ۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۟:Ljava/lang/Object;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۟۟:Ljava/lang/Throwable;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Object;LYue/ۥۣ۟ۧۦ;LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۟ۧۦ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e3\u06e7\u06e6;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥ۟ۦۣ۠;->ۥ:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟:LYue/ۥۣ۟ۧۦ;

    .line 4
    iput-object p3, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟:LYue/ۥۣ۠ۡ۟;

    .line 5
    iput-object p4, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟:Ljava/lang/Object;

    .line 6
    iput-object p5, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟۟:Ljava/lang/Throwable;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;LYue/ۥۣ۟ۧۦ;LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;Ljava/lang/Throwable;ILYue/ۥ۟ۨۥۢ;)V
    .locals 7

    and-int/lit8 p7, p6, 0x2

    const/4 v0, 0x0

    if-eqz p7, :cond_0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, p2

    :goto_0
    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    move-object v4, v0

    goto :goto_1

    :cond_1
    move-object v4, p3

    :goto_1
    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    move-object v5, v0

    goto :goto_2

    :cond_2
    move-object v5, p4

    :goto_2
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    move-object v6, v0

    goto :goto_3

    :cond_3
    move-object v6, p5

    :goto_3
    move-object v1, p0

    move-object v2, p1

    .line 7
    invoke-direct/range {v1 .. v6}, LYue/ۥ۟ۦۣ۠;-><init>(Ljava/lang/Object;LYue/ۥۣ۟ۧۦ;LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-void
.end method

.method public static synthetic ۥ۟۟۟ۡ(LYue/ۥ۟ۦۣ۠;Ljava/lang/Object;LYue/ۥۣ۟ۧۦ;LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;Ljava/lang/Throwable;ILjava/lang/Object;)LYue/ۥ۟ۦۣ۠;
    .locals 3

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, LYue/ۥ۟ۦۣ۠;->ۥ:Ljava/lang/Object;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟:LYue/ۥۣ۟ۧۦ;

    :cond_1
    move-object p7, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_2

    iget-object p3, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟:LYue/ۥۣ۠ۡ۟;

    :cond_2
    move-object v0, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_3

    iget-object p4, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟:Ljava/lang/Object;

    :cond_3
    move-object v1, p4

    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_4

    iget-object p5, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟۟:Ljava/lang/Throwable;

    :cond_4
    move-object v2, p5

    move-object p2, p0

    move-object p3, p1

    move-object p4, p7

    move-object p5, v0

    move-object p6, v1

    move-object p7, v2

    invoke-virtual/range {p2 .. p7}, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥۣ۟ۧۦ;LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;Ljava/lang/Throwable;)LYue/ۥ۟ۦۣ۠;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥ۟ۦۣ۠;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥ۟ۦۣ۠;

    iget-object v1, p0, LYue/ۥ۟ۦۣ۠;->ۥ:Ljava/lang/Object;

    iget-object v3, p1, LYue/ۥ۟ۦۣ۠;->ۥ:Ljava/lang/Object;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟:LYue/ۥۣ۟ۧۦ;

    iget-object v3, p1, LYue/ۥ۟ۦۣ۠;->ۥ۟:LYue/ۥۣ۟ۧۦ;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟:LYue/ۥۣ۠ۡ۟;

    iget-object v3, p1, LYue/ۥ۟ۦۣ۠;->ۥ۟۟:LYue/ۥۣ۠ۡ۟;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟:Ljava/lang/Object;

    iget-object v3, p1, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟:Ljava/lang/Object;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟۟:Ljava/lang/Throwable;

    iget-object p1, p1, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟۟:Ljava/lang/Throwable;

    invoke-static {v1, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, LYue/ۥ۟ۦۣ۠;->ۥ:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟:LYue/ۥۣ۟ۧۦ;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟:LYue/ۥۣ۠ۡ۟;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟:Ljava/lang/Object;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟۟:Ljava/lang/Throwable;

    if-nez v2, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "CompletedContinuation(result="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۦۣ۠;->ۥ:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cancelHandler="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟:LYue/ۥۣ۟ۧۦ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", onCancellation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟:LYue/ۥۣ۠ۡ۟;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", idempotentResume="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cancelCause="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟۟:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۣ۠;->ۥ:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥ۟()LYue/ۥۣ۟ۧۦ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟:LYue/ۥۣ۟ۧۦ;

    return-object v0
.end method

.method public final ۥ۟۟()LYue/ۥۣ۠ۡ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟:LYue/ۥۣ۠ۡ۟;

    return-object v0
.end method

.method public final ۥ۟۟۟()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥ۟۟۟۟()Ljava/lang/Throwable;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟۟:Ljava/lang/Throwable;

    return-object v0
.end method

.method public final ۥ۟۟۟۠(Ljava/lang/Object;LYue/ۥۣ۟ۧۦ;LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;Ljava/lang/Throwable;)LYue/ۥ۟ۦۣ۠;
    .locals 7
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۟ۧۦ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p4    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p5    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e3\u06e7\u06e6;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;",
            "Ljava/lang/Object;",
            "Ljava/lang/Throwable;",
            ")",
            "LYue/\u06e5\u06df\u06e6\u06e3\u06e0;"
        }
    .end annotation

    new-instance v6, LYue/ۥ۟ۦۣ۠;

    move-object v0, v6

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-direct/range {v0 .. v5}, LYue/ۥ۟ۦۣ۠;-><init>(Ljava/lang/Object;LYue/ۥۣ۟ۧۦ;LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;Ljava/lang/Throwable;)V

    return-object v6
.end method

.method public final ۥ۟۟۟ۢ()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟۟۟:Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥۣ۟۟۟(LYue/ۥۣ۟ۨ۠;Ljava/lang/Throwable;)V
    .locals 1
    .param p1    # LYue/ۥۣ۟ۨ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06e0<",
            "*>;",
            "Ljava/lang/Throwable;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟:LYue/ۥۣ۟ۧۦ;

    if-eqz v0, :cond_0

    invoke-virtual {p1, v0, p2}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۟ۨ(LYue/ۥۣ۟ۧۦ;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۦۣ۠;->ۥ۟۟:LYue/ۥۣ۠ۡ۟;

    if-eqz v0, :cond_1

    invoke-virtual {p1, v0, p2}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۠ۡ(LYue/ۥۣ۠ۡ۟;Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method
