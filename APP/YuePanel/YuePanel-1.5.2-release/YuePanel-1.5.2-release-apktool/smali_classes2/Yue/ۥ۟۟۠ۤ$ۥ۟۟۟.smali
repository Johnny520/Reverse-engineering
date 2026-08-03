.class public LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;
.super LYue/ۥۡۦۡ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e1\u06e6\u06e1\u06e0<",
        "TE;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbstractChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractChannel.kt\nkotlinx/coroutines/channels/AbstractChannel$ReceiveHasNext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1132:1\n1#2:1133\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۦ:LYue/ۥ۟۟۠ۤ$ۥ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06df\u06e0\u06e4$\u06e5<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟۟۠ۤ$ۥ;LYue/ۥۣ۟ۨ۟;)V
    .locals 0
    .param p1    # LYue/ۥ۟۟۠ۤ$ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۟ۨ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06df\u06e0\u06e4$\u06e5<",
            "TE;>;",
            "LYue/\u06e5\u06df\u06e3\u06e8\u06df<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, LYue/ۥۡۦۡ۠;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥ۟۟۠ۤ$ۥ;

    iput-object p2, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ReceiveHasNext@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, LYue/ۥۣ۟ۨۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠ۤ(Ljava/lang/Object;LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;)LYue/ۥۢ۠ۦۢ;
    .locals 4
    .param p2    # LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5$\u06e5\u06df\u06df\u06df;",
            ")",
            "LYue/\u06e5\u06e2\u06e0\u06e6\u06e2;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    const/4 v2, 0x0

    if-eqz p2, :cond_0

    iget-object v3, p2, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟:LYue/ۥ۠ۨ۠ۥ$ۥ;

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual {p0, p1}, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟ۦۥ(Ljava/lang/Object;)LYue/ۥۣ۠ۡ۟;

    move-result-object p1

    invoke-interface {v0, v1, v3, p1}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    return-object v2

    :cond_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟;->ۥ۟۟۟()V

    :cond_2
    sget-object p1, LYue/ۥۣ۟ۨۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    return-object p1
.end method

.method public ۥ۟۟ۡۧ(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥ۟۟۠ۤ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟۟۟ۡ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    sget-object v0, LYue/ۥۣ۟ۨۡ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    invoke-interface {p1, v0}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟ۧ(Ljava/lang/Object;)V

    return-void
.end method

.method public ۥ۟۟ۦۥ(Ljava/lang/Object;)LYue/ۥۣ۠ۡ۟;
    .locals 2
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "Ljava/lang/Throwable;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥ۟۟۠ۤ$ۥ;

    iget-object v0, v0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ:LYue/ۥ۟۟۠ۤ;

    iget-object v0, v0, LYue/ۥ۟۟ۢۢ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    invoke-interface {v1}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v1

    invoke-static {v0, p1, v1}, LYue/ۥۣۡۢۥ;->ۥ(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣ۠ۡ۟;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public ۥ۟۟ۦۦ(LYue/ۥ۟ۥ;)V
    .locals 4
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

    iget-object v0, p1, LYue/ۥ۟ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, LYue/ۥۣ۟ۨ۟$ۥ;->ۥ۟(LYue/ۥۣ۟ۨ۟;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    invoke-virtual {p1}, LYue/ۥ۟ۥ;->ۥ۟۟ۧ۠()Ljava/lang/Throwable;

    move-result-object v1

    invoke-interface {v0, v1}, LYue/ۥۣ۟ۨ۟;->ۥ۟۟ۡۢ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۠ۦ:LYue/ۥ۟۟۠ۤ$ۥ;

    invoke-virtual {v1, p1}, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟۟۟ۡ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;->ۥ۟۟۠ۧ:LYue/ۥۣ۟ۨ۟;

    invoke-interface {p1, v0}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟ۧ(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
