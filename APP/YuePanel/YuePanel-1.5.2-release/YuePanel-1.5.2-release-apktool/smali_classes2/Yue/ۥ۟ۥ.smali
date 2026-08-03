.class public final LYue/ۥ۟ۥ;
.super LYue/ۥۡۨ۠ۦ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۦۡۢ;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e1\u06e8\u06e0\u06e6;",
        "LYue/\u06e5\u06e1\u06e6\u06e1\u06e2<",
        "TE;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbstractChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractChannel.kt\nkotlinx/coroutines/channels/Closed\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1132:1\n1#2:1133\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۦ:Ljava/lang/Throwable;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Throwable;)V
    .locals 0
    .param p1    # Ljava/lang/Throwable;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    invoke-direct {p0}, LYue/ۥۡۨ۠ۦ;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Closed@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LYue/ۥۣ۟ۨۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۟ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Throwable;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠ۤ(Ljava/lang/Object;LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)LYue/ۥۢ۠ۦۢ;
    .locals 0
    .param p2    # LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5$\u06e5\u06df\u06df\u06df;",
            ")",
            "LYue/\u06e5\u06e2\u06e0\u06e6\u06e2;"
        }
    .end annotation

    sget-object p1, LYue/ۥۣ۟ۨۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟۟()V

    :cond_0
    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۠ۥ()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۥ;->ۥ۟۟ۧ()LYue/ۥ۟ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۡۧ(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    return-void
.end method

.method public ۥ۟۟ۦۤ()V
    .locals 0

    return-void
.end method

.method public bridge synthetic ۥ۟۟ۦۥ()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۥ;->ۥ۟۟ۧ۟()LYue/ۥ۟ۥ;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟ۦۦ(LYue/ۥ۟ۥ;)V
    .locals 0
    .param p1    # LYue/ۥ۟ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e5<",
            "*>;)V"
        }
    .end annotation

    return-void
.end method

.method public ۥ۟۟ۦۧ(LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)LYue/ۥۢ۠ۦۢ;
    .locals 1
    .param p1    # LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    sget-object v0, LYue/ۥۣ۟ۨۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟۟()V

    :cond_0
    return-object v0
.end method

.method public ۥ۟۟ۧ()LYue/ۥ۟ۥ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e5<",
            "TE;>;"
        }
    .end annotation

    return-object p0
.end method

.method public ۥ۟۟ۧ۟()LYue/ۥ۟ۥ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e5<",
            "TE;>;"
        }
    .end annotation

    return-object p0
.end method

.method public final ۥ۟۟ۧ۠()Ljava/lang/Throwable;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۥ۟ۢ;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, LYue/ۥ۟ۥ۟ۢ;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method

.method public final ۥ۟۟ۧۡ()Ljava/lang/Throwable;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    new-instance v0, LYue/ۥ۟ۥۣ۟;

    const-string v1, "Channel was closed"

    invoke-direct {v0, v1}, LYue/ۥ۟ۥۣ۟;-><init>(Ljava/lang/String;)V

    :cond_0
    return-object v0
.end method
