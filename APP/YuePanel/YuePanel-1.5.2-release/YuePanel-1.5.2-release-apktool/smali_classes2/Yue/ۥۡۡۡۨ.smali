.class public final LYue/ۥۡۡۡۨ;
.super LYue/ۥ۠ۨۥۥ;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۨۨ;


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMainDispatchers.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainDispatchers.kt\nkotlinx/coroutines/internal/MissingMainCoroutineDispatcher\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,137:1\n1#2:138\n*E\n"
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/Throwable;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;Ljava/lang/String;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, LYue/ۥ۠ۨۥۥ;-><init>()V

    .line 3
    iput-object p1, p0, LYue/ۥۡۡۡۨ;->ۥۣ۟۟۠:Ljava/lang/Throwable;

    .line 4
    iput-object p2, p0, LYue/ۥۡۡۡۨ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Throwable;Ljava/lang/String;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    .line 1
    :cond_0
    invoke-direct {p0, p1, p2}, LYue/ۥۡۡۡۨ;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic dispatch(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥۡۡۡۨ;->ۥ۟۟ۧۡ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)Ljava/lang/Void;

    return-void
.end method

.method public isDispatchNeeded(LYue/ۥ۟ۧۦۥ;)Z
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥۡۡۡۨ;->ۥ۟۟ۧۢ()Ljava/lang/Void;

    new-instance p1, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p1}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p1
.end method

.method public limitedParallelism(I)LYue/ۥ۟ۧۦۨ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۡۡۨ;->ۥ۟۟ۧۢ()Ljava/lang/Void;

    new-instance p1, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p1}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Dispatchers.Main[missing"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۡۡۨ;->ۥۣ۟۟۠:Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", cause="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۡۡۡۨ;->ۥۣ۟۟۠:Ljava/lang/Throwable;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡ۠(JLYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p3    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۡۡۨ;->ۥ۟۟ۧۢ()Ljava/lang/Void;

    new-instance p1, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p1}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p1
.end method

.method public ۥۣ۟۟(JLjava/lang/Runnable;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣۣ۠۟;
    .locals 0
    .param p3    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۡۡۨ;->ۥ۟۟ۧۢ()Ljava/lang/Void;

    new-instance p1, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p1}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p1
.end method

.method public bridge synthetic ۥ۟۟ۤۥ(JLYue/ۥۣ۟ۨ۟;)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, LYue/ۥۡۡۡۨ;->ۥۣ۟۟ۧ(JLYue/ۥۣ۟ۨ۟;)Ljava/lang/Void;

    return-void
.end method

.method public ۥ۟۟ۧ۟()LYue/ۥ۠ۨۥۥ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    return-object p0
.end method

.method public ۥ۟۟ۧۡ(LYue/ۥ۟ۧۦۥ;Ljava/lang/Runnable;)Ljava/lang/Void;
    .locals 0
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Runnable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۡۡۨ;->ۥ۟۟ۧۢ()Ljava/lang/Void;

    new-instance p1, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p1}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p1
.end method

.method public final ۥ۟۟ۧۢ()Ljava/lang/Void;
    .locals 4

    iget-object v0, p0, LYue/ۥۡۡۡۨ;->ۥۣ۟۟۠:Ljava/lang/Throwable;

    if-eqz v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Module with the Main dispatcher had failed to initialize"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۡۡۡۨ;->ۥ۟۟۠ۤ:Ljava/lang/String;

    if-eqz v1, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ". "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    :cond_0
    const-string v1, ""

    :cond_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/IllegalStateException;

    iget-object v2, p0, LYue/ۥۡۡۡۨ;->ۥۣ۟۟۠:Ljava/lang/Throwable;

    invoke-direct {v1, v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_2
    invoke-static {}, LYue/ۥ۠ۨۦۣ;->ۥ۟۟۟۟()Ljava/lang/Void;

    new-instance v0, LYue/ۥ۠ۦۧۤ;

    invoke-direct {v0}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw v0
.end method

.method public ۥۣ۟۟ۧ(JLYue/ۥۣ۟ۨ۟;)Ljava/lang/Void;
    .locals 0
    .param p3    # LYue/ۥۣ۟ۨ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Void;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۡۡۡۨ;->ۥ۟۟ۧۢ()Ljava/lang/Void;

    new-instance p1, LYue/ۥ۠ۦۧۤ;

    invoke-direct {p1}, LYue/ۥ۠ۦۧۤ;-><init>()V

    throw p1
.end method
