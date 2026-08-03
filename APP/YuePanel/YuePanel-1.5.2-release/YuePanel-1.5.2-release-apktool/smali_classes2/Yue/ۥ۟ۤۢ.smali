.class public final LYue/ۥ۟ۤۢ;
.super LYue/ۥ۟ۤۡ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06df\u06e4\u06e1\u06e0<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,100:1\n1849#2,2:101\n*S KotlinDebug\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/internal/ChannelLimitedFlowMerge\n*L\n95#1:101,2\n*E\n"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۦ:Ljava/lang/Iterable;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Iterable<",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "TT;>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/Iterable;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V
    .locals 0
    .param p1    # Ljava/lang/Iterable;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p4    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
            "+TT;>;>;",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            ")V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p2, p3, p4}, LYue/ۥ۟ۤۡ۠;-><init>(LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    .line 5
    iput-object p1, p0, LYue/ۥ۟ۤۢ;->ۥ۟۟۠ۦ:Ljava/lang/Iterable;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Iterable;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;ILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 1
    sget-object p2, LYue/ۥ۠۠ۧۦ;->ۥۣ۟۟۠:LYue/ۥ۠۠ۧۦ;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    const/4 p3, -0x2

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 2
    sget-object p4, LYue/ۥۣۣ۟;->ۥۣ۟۟۠:LYue/ۥۣۣ۟;

    .line 3
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, LYue/ۥ۟ۤۢ;-><init>(Ljava/lang/Iterable;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۡ(LYue/ۥۡۥۡۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 8
    .param p1    # LYue/ۥۡۥۡۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e5\u06e1\u06e4<",
            "-TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p2, LYue/ۥۡۨۡۧ;

    invoke-direct {p2, p1}, LYue/ۥۡۨۡۧ;-><init>(LYue/ۥۡۨۡ۠;)V

    iget-object v0, p0, LYue/ۥ۟ۤۢ;->ۥ۟۟۠ۦ:Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۣ۠ۢۡ;

    new-instance v5, LYue/ۥ۟ۤۢ$ۥ;

    const/4 v2, 0x0

    invoke-direct {v5, v1, p2, v2}, LYue/ۥ۟ۤۢ$ۥ;-><init>(LYue/ۥۣ۠ۢۡ;LYue/ۥۡۨۡۧ;LYue/ۥ۟ۧۤۢ;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v2 .. v7}, LYue/ۥۣ۟ۤ۠;->ۥ۟۟۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;LYue/ۥ۟ۧۨ;LYue/ۥۣ۠ۢۢ;ILjava/lang/Object;)LYue/ۥ۠ۦ۟ۡ;

    goto :goto_0

    :cond_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public ۥ۟۟۟ۢ(LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)LYue/ۥ۟ۤۡ۠;
    .locals 2
    .param p1    # LYue/ۥ۟ۧۦۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣۣ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e6\u06e5;",
            "I",
            "LYue/\u06e5\u06df\u06e3\u06e3;",
            ")",
            "LYue/\u06e5\u06df\u06e4\u06e1\u06e0<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۤۢ;

    iget-object v1, p0, LYue/ۥ۟ۤۢ;->ۥ۟۟۠ۦ:Ljava/lang/Iterable;

    invoke-direct {v0, v1, p1, p2, p3}, LYue/ۥ۟ۤۢ;-><init>(Ljava/lang/Iterable;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣۣ۟;)V

    return-object v0
.end method

.method public ۥ۟۟۟ۧ(LYue/ۥ۟ۧۧۥ;)LYue/ۥۡۦۡۡ;
    .locals 3
    .param p1    # LYue/ۥ۟ۧۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06e7\u06e7\u06e5;",
            ")",
            "LYue/\u06e5\u06e1\u06e6\u06e1\u06e1<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۤۡ۠;->ۥۣ۟۟۠:LYue/ۥ۟ۧۦۥ;

    iget v1, p0, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۠ۤ:I

    invoke-virtual {p0}, LYue/ۥ۟ۤۡ۠;->ۥ۟۟۟ۤ()LYue/ۥۣ۠ۢۢ;

    move-result-object v2

    invoke-static {p1, v0, v1, v2}, LYue/ۥۡۥۡۢ;->ۥ۟۟۟۟(LYue/ۥ۟ۧۧۥ;LYue/ۥ۟ۧۦۥ;ILYue/ۥۣ۠ۢۢ;)LYue/ۥۡۦۡۡ;

    move-result-object p1

    return-object p1
.end method
