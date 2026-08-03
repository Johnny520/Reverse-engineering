.class public final LYue/ۥ۟۟۠ۤ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۤۡۧ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟۠ۤ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06df\u06e4\u06e1\u06e7<",
        "TE;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAbstractChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractChannel.kt\nkotlinx/coroutines/channels/AbstractChannel$Itr\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1132:1\n332#2,5:1133\n*S KotlinDebug\n*F\n+ 1 AbstractChannel.kt\nkotlinx/coroutines/channels/AbstractChannel$Itr\n*L\n853#1:1133,5\n*E\n"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥ۟۟۠ۤ;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06df\u06e0\u06e4<",
            "TE;>;"
        }
    .end annotation
.end field

.field public ۥ۟:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟۟۠ۤ;)V
    .locals 0
    .param p1    # LYue/ۥ۟۟۠ۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06df\u06e0\u06e4<",
            "TE;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ:LYue/ۥ۟۟۠ۤ;

    sget-object p1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;

    iput-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic ۥ۟۟(LYue/ۥ۟۟۠ۤ$ۥ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟۟۟۠(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟:Ljava/lang/Object;

    instance-of v1, v0, LYue/ۥ۟ۥ;

    if-nez v1, :cond_1

    sget-object v1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;

    if-eq v0, v1, :cond_0

    iput-object v1, p0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟:Ljava/lang/Object;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "\'hasNext\' should be called prior to \'next\' invocation"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    check-cast v0, LYue/ۥ۟ۥ;

    invoke-virtual {v0}, LYue/ۥ۟ۥ;->ۥ۟۟ۧ۠()Ljava/lang/Throwable;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۠۟(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object v0

    throw v0
.end method

.method public synthetic ۥ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        level = .enum LYue/ۥ۠;->ۥ۟۟۠ۥ:LYue/ۥ۠;
        message = "Since 1.3.0, binary compatibility with versions <= 1.2.x"
    .end annotation

    .annotation build LYue/ۥ۠ۦۡ۠;
        name = "next"
    .end annotation

    invoke-static {p0, p1}, LYue/ۥ۟ۤۡۧ$ۥ;->ۥ(LYue/ۥ۟ۤۡۧ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟:Ljava/lang/Object;

    sget-object v1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;

    if-eq v0, v1, :cond_0

    invoke-virtual {p0, v0}, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟۟۟۟(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, LYue/ۥۣ۟ۢ۟;->ۥ(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ:LYue/ۥ۟۟۠ۤ;

    invoke-virtual {v0}, LYue/ۥ۟۟۠ۤ;->ۥ۟۟ۤۤ()Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟:Ljava/lang/Object;

    if-eq v0, v1, :cond_1

    invoke-virtual {p0, v0}, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟۟۟۟(Ljava/lang/Object;)Z

    move-result p1

    invoke-static {p1}, LYue/ۥۣ۟ۢ۟;->ۥ(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p0, p1}, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟۟۟۠(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟()Ljava/lang/Object;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟:Ljava/lang/Object;

    return-object v0
.end method

.method public final ۥ۟۟۟۟(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, LYue/ۥ۟ۥ;

    if-eqz v0, :cond_1

    check-cast p1, LYue/ۥ۟ۥ;

    iget-object v0, p1, LYue/ۥ۟ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p1}, LYue/ۥ۟ۥ;->ۥ۟۟ۧ۠()Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۢ۟ۧۦ;->ۥ۟۟۠۟(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p1

    throw p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final ۥ۟۟۟۠(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, LYue/ۥ۠ۥۧۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۣ۟ۨۢ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)LYue/ۥۣ۟ۨ۠;

    move-result-object v0

    new-instance v1, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;

    invoke-direct {v1, p0, v0}, LYue/ۥ۟۟۠ۤ$ۥ۟۟۟;-><init>(LYue/ۥ۟۟۠ۤ$ۥ;LYue/ۥۣ۟ۨ۟;)V

    :cond_0
    iget-object v2, p0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ:LYue/ۥ۟۟۠ۤ;

    invoke-static {v2, v1}, LYue/ۥ۟۟۠ۤ;->ۥۣ۟۟(LYue/ۥ۟۟۠ۤ;LYue/ۥۡۦۡ۠;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ:LYue/ۥ۟۟۠ۤ;

    invoke-static {v2, v0, v1}, LYue/ۥ۟۟۠ۤ;->ۥۣ۟۟ۡ(LYue/ۥ۟۟۠ۤ;LYue/ۥۣ۟ۨ۟;LYue/ۥۡۦۡ۠;)V

    goto :goto_1

    :cond_1
    iget-object v2, p0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ:LYue/ۥ۟۟۠ۤ;

    invoke-virtual {v2}, LYue/ۥ۟۟۠ۤ;->ۥ۟۟ۤۤ()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p0, v2}, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟۟۟ۡ(Ljava/lang/Object;)V

    instance-of v3, v2, LYue/ۥ۟ۥ;

    if-eqz v3, :cond_3

    check-cast v2, LYue/ۥ۟ۥ;

    iget-object v1, v2, LYue/ۥ۟ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Throwable;

    if-nez v1, :cond_2

    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    const/4 v1, 0x0

    invoke-static {v1}, LYue/ۥۣ۟ۢ۟;->ۥ(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    sget-object v1, LYue/ۥۡۦۧۤ;->ۥ۟۟۠ۤ:LYue/ۥۡۦۧۤ$ۥ;

    invoke-virtual {v2}, LYue/ۥ۟ۥ;->ۥ۟۟ۧ۠()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۡۦۧۥ;->ۥ(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۡۦۧۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, LYue/ۥ۟ۧۤۢ;->resumeWith(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    sget-object v3, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۠:LYue/ۥۢ۠ۦۢ;

    if-eq v2, v3, :cond_0

    const/4 v1, 0x1

    invoke-static {v1}, LYue/ۥۣ۟ۢ۟;->ۥ(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v3, p0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ:LYue/ۥ۟۟۠ۤ;

    iget-object v3, v3, LYue/ۥ۟۟ۢۢ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;

    if-eqz v3, :cond_4

    invoke-interface {v0}, LYue/ۥ۟ۧۤۢ;->getContext()LYue/ۥ۟ۧۦۥ;

    move-result-object v4

    invoke-static {v3, v2, v4}, LYue/ۥۣۡۢۥ;->ۥ(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥ۟ۧۦۥ;)LYue/ۥۣ۠ۡ۟;

    move-result-object v2

    goto :goto_0

    :cond_4
    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0, v1, v2}, LYue/ۥۣ۟ۨ۟;->ۥۣ۟۟۟(Ljava/lang/Object;LYue/ۥۣ۠ۡ۟;)V

    :goto_1
    invoke-virtual {v0}, LYue/ۥۣ۟ۨ۠;->ۥ۟۟۠ۨ()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_5

    invoke-static {p1}, LYue/ۥ۟ۨۤۢ;->ۥ۟۟(LYue/ۥ۟ۧۤۢ;)V

    :cond_5
    return-object v0
.end method

.method public final ۥ۟۟۟ۡ(Ljava/lang/Object;)V
    .locals 0
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥ;->ۥ۟:Ljava/lang/Object;

    return-void
.end method
