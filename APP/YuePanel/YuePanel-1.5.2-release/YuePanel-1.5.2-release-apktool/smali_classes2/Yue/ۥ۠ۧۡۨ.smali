.class public LYue/ۥ۠ۧۡۨ;
.super LYue/ۥ۟۟۠ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06df\u06e0\u06e4<",
        "TE;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLinkedListChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LinkedListChannel.kt\nkotlinx/coroutines/channels/LinkedListChannel\n+ 2 InlineList.kt\nkotlinx/coroutines/internal/InlineList\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n37#2,11:78\n1#3:89\n*S KotlinDebug\n*F\n+ 1 LinkedListChannel.kt\nkotlinx/coroutines/channels/LinkedListChannel\n*L\n64#1:78,11\n*E\n"
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۡ۟;)V
    .locals 0
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-TE;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, LYue/ۥ۟۟۠ۤ;-><init>(LYue/ۥۣ۠ۡ۟;)V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟ۡۦ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final ۥ۟۟ۡۧ()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public ۥ۟۟ۢ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :cond_0
    invoke-super {p0, p1}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟ۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    if-ne v0, v1, :cond_1

    return-object v1

    :cond_1
    sget-object v2, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۟:LYue/ۥۢ۠ۦۢ;

    if-ne v0, v2, :cond_3

    invoke-virtual {p0, p1}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟ۢۥ(Ljava/lang/Object;)LYue/ۥۡۦۡۢ;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    instance-of v1, v0, LYue/ۥ۟ۥ;

    if-eqz v1, :cond_0

    return-object v0

    :cond_3
    instance-of p1, v0, LYue/ۥ۟ۥ;

    if-eqz p1, :cond_4

    return-object v0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid offerInternal result "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟ۢۢ(Ljava/lang/Object;LYue/ۥۡۨ;)Ljava/lang/Object;
    .locals 2
    .param p2    # LYue/ۥۡۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "LYue/\u06e5\u06e1\u06e8<",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۟۟۠ۤ;->ۥۣ۟۟ۧ()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0, p1, p2}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟ۢۢ(Ljava/lang/Object;LYue/ۥۡۨ;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1}, LYue/ۥ۟۟ۢۢ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)LYue/ۥ۠ۨ۠ۥ$ۥ۟;

    move-result-object v0

    invoke-interface {p2, v0}, LYue/ۥۡۨ;->ۥ۟۟۟ۦ(LYue/ۥ۟ۢ۟ۥ;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_2

    sget-object v0, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    :cond_2
    :goto_0
    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟()Ljava/lang/Object;

    move-result-object v1

    if-ne v0, v1, :cond_3

    invoke-static {}, LYue/ۥۡۨ۟۟;->ۥ۟۟۟()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object v1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟:LYue/ۥۢ۠ۦۢ;

    if-ne v0, v1, :cond_4

    return-object v1

    :cond_4
    sget-object v1, LYue/ۥ۟۟۠ۥ;->ۥ۟۟۟۟:LYue/ۥۢ۠ۦۢ;

    if-eq v0, v1, :cond_0

    sget-object v1, LYue/ۥ۟ۢ۟ۨ;->ۥ۟:Ljava/lang/Object;

    if-eq v0, v1, :cond_0

    instance-of p1, v0, LYue/ۥ۟ۥ;

    if-eqz p1, :cond_5

    return-object v0

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid result "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥۣ۟۟ۨ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final ۥ۟۟ۤ()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟ۤۡ(Ljava/lang/Object;LYue/ۥ۟ۥ;)V
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e5<",
            "*>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_5

    instance-of v1, p1, Ljava/util/ArrayList;

    if-nez v1, :cond_1

    check-cast p1, LYue/ۥۡۨ۠ۦ;

    instance-of v1, p1, LYue/ۥ۟۟ۢۢ$ۥ;

    if-eqz v1, :cond_0

    iget-object p2, p0, LYue/ۥ۟۟ۢۢ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;

    if-eqz p2, :cond_5

    check-cast p1, LYue/ۥ۟۟ۢۢ$ۥ;

    iget-object p1, p1, LYue/ۥ۟۟ۢۢ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {p2, p1, v0}, LYue/ۥۣۡۢۥ;->ۥ۟۟(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥۣۢ۟ۨ;)LYue/ۥۣۢ۟ۨ;

    move-result-object v0

    goto :goto_2

    :cond_0
    invoke-virtual {p1, p2}, LYue/ۥۡۨ۠ۦ;->ۥ۟۟ۦۦ(LYue/ۥ۟ۥ;)V

    goto :goto_2

    :cond_1
    check-cast p1, Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move-object v2, v0

    :goto_0
    const/4 v3, -0x1

    if-ge v3, v1, :cond_4

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥۡۨ۠ۦ;

    instance-of v4, v3, LYue/ۥ۟۟ۢۢ$ۥ;

    if-eqz v4, :cond_3

    iget-object v4, p0, LYue/ۥ۟۟ۢۢ;->ۥۣ۟۟۠:LYue/ۥۣ۠ۡ۟;

    if-eqz v4, :cond_2

    check-cast v3, LYue/ۥ۟۟ۢۢ$ۥ;

    iget-object v3, v3, LYue/ۥ۟۟ۢۢ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {v4, v3, v2}, LYue/ۥۣۡۢۥ;->ۥ۟۟(LYue/ۥۣ۠ۡ۟;Ljava/lang/Object;LYue/ۥۣۢ۟ۨ;)LYue/ۥۣۢ۟ۨ;

    move-result-object v2

    goto :goto_1

    :cond_2
    move-object v2, v0

    goto :goto_1

    :cond_3
    invoke-virtual {v3, p2}, LYue/ۥۡۨ۠ۦ;->ۥ۟۟ۦۦ(LYue/ۥ۟ۥ;)V

    :goto_1
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_4
    move-object v0, v2

    :cond_5
    :goto_2
    if-nez v0, :cond_6

    return-void

    :cond_6
    throw v0
.end method
