.class public final LYue/ۥۢ۟ۢ۟$ۥ;
.super LYue/ۥۡۦۧۢ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۢ;


# annotations
.annotation runtime LYue/ۥۣ۟ۨۨ;
    c = "kotlin.collections.SlidingWindowKt$windowedIterator$1"
    f = "SlidingWindow.kt"
    i = {
        0x0,
        0x0,
        0x0,
        0x2,
        0x2,
        0x3,
        0x3
    }
    l = {
        0x22,
        0x28,
        0x31,
        0x37,
        0x3a
    }
    m = "invokeSuspend"
    n = {
        "$this$iterator",
        "buffer",
        "gap",
        "$this$iterator",
        "buffer",
        "$this$iterator",
        "buffer"
    }
    s = {
        "L$0",
        "L$1",
        "I$0",
        "L$0",
        "L$1",
        "L$0",
        "L$1"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢ۟ۢ۟;->ۥ۟(Ljava/util/Iterator;IIZZ)Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e1\u06e6\u06e7\u06e2;",
        "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
        "LYue/\u06e5\u06e1\u06e8\u06e2\u06e0<",
        "-",
        "Ljava/util/List<",
        "+TT;>;>;",
        "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
        "-",
        "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
        ">;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥ۟۟۠ۤ:Ljava/lang/Object;

.field public ۥ۟۟۠ۥ:Ljava/lang/Object;

.field public ۥ۟۟۠ۦ:I

.field public ۥ۟۟۠ۧ:I

.field public synthetic ۥ۟۟۠ۨ:Ljava/lang/Object;

.field public final synthetic ۥ۟۟ۡ:I

.field public final synthetic ۥ۟۟ۡ۟:I

.field public final synthetic ۥ۟۟ۡ۠:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟ۡۡ:Z

.field public final synthetic ۥ۟۟ۡۢ:Z


# direct methods
.method public constructor <init>(IILjava/util/Iterator;ZZLYue/ۥ۟ۧۤۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Ljava/util/Iterator<",
            "+TT;>;ZZ",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06df\u06e2\u06df$\u06e5;",
            ">;)V"
        }
    .end annotation

    iput p1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ:I

    iput p2, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ۟:I

    iput-object p3, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ۠:Ljava/util/Iterator;

    iput-boolean p4, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡۡ:Z

    iput-boolean p5, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡۢ:Z

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, LYue/ۥۡۦۧۢ;-><init>(ILYue/ۥ۟ۧۤۢ;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;
    .locals 8
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "*>;)",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;"
        }
    .end annotation

    new-instance v7, LYue/ۥۢ۟ۢ۟$ۥ;

    iget v1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ:I

    iget v2, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ۟:I

    iget-object v3, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ۠:Ljava/util/Iterator;

    iget-boolean v4, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡۡ:Z

    iget-boolean v5, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡۢ:Z

    move-object v0, v7

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, LYue/ۥۢ۟ۢ۟$ۥ;-><init>(IILjava/util/Iterator;ZZLYue/ۥ۟ۧۤۢ;)V

    iput-object p1, v7, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    return-object v7
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥۡۨۢ۠;

    check-cast p2, LYue/ۥ۟ۧۤۢ;

    invoke-virtual {p0, p1, p2}, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۦ(LYue/ۥۡۨۢ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۧ:I

    const/4 v2, 0x5

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v1, :cond_6

    if-eq v1, v6, :cond_4

    if-eq v1, v5, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v1, LYue/ۥۡۧ۟ۧ;

    iget-object v4, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    check-cast v4, LYue/ۥۡۨۢ۠;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_2
    iget-object v1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v1, Ljava/util/Iterator;

    iget-object v5, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v5, LYue/ۥۡۧ۟ۧ;

    iget-object v8, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    check-cast v8, LYue/ۥۡۨۢ۠;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_3
    :goto_0
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_4
    iget v1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۦ:I

    iget-object v2, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    check-cast v2, Ljava/util/Iterator;

    iget-object v3, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    check-cast v3, Ljava/util/ArrayList;

    iget-object v4, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    check-cast v4, LYue/ۥۡۨۢ۠;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    :cond_5
    move p1, v1

    goto :goto_2

    :cond_6
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    iget-object p1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    check-cast p1, LYue/ۥۡۨۢ۠;

    iget v1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ:I

    const/16 v8, 0x400

    invoke-static {v1, v8}, LYue/ۥۡۦ۟;->ۥ۟۟ۡ۠(II)I

    move-result v1

    iget v8, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ۟:I

    iget v9, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ:I

    sub-int/2addr v8, v9

    if-ltz v8, :cond_c

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ۠:Ljava/util/Iterator;

    const/4 v3, 0x0

    move-object v4, p1

    move p1, v3

    move-object v3, v2

    move-object v2, v1

    move v1, v8

    :cond_7
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    if-lez p1, :cond_8

    add-int/lit8 p1, p1, -0x1

    goto :goto_1

    :cond_8
    invoke-virtual {v3, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v8

    iget v9, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ:I

    if-ne v8, v9, :cond_7

    iput-object v4, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    iput-object v3, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object v2, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۦ:I

    iput v6, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۧ:I

    invoke-virtual {v4, v3, p0}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :goto_2
    iget-boolean v1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡۡ:Z

    if-eqz v1, :cond_9

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    goto :goto_3

    :cond_9
    new-instance v1, Ljava/util/ArrayList;

    iget v3, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ:I

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    move-object v3, v1

    :goto_3
    move v1, p1

    goto :goto_1

    :cond_a
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v6

    if-eqz p1, :cond_15

    iget-boolean p1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡۢ:Z

    if-nez p1, :cond_b

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result p1

    iget v1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ:I

    if-ne p1, v1, :cond_15

    :cond_b
    iput-object v7, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    iput-object v7, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object v7, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v5, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۧ:I

    invoke-virtual {v4, v3, p0}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_15

    return-object v0

    :cond_c
    new-instance v5, LYue/ۥۡۧ۟ۧ;

    invoke-direct {v5, v1}, LYue/ۥۡۧ۟ۧ;-><init>(I)V

    iget-object v1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ۠:Ljava/util/Iterator;

    move-object v8, p1

    :cond_d
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v5, p1}, LYue/ۥۡۧ۟ۧ;->ۥ۟۟۟۟(Ljava/lang/Object;)V

    invoke-virtual {v5}, LYue/ۥۡۧ۟ۧ;->ۥۣ۟۟۟()Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-virtual {v5}, LYue/ۥ۟۟۠ۦ;->size()I

    move-result p1

    iget v9, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ:I

    if-ge p1, v9, :cond_e

    invoke-virtual {v5, v9}, LYue/ۥۡۧ۟ۧ;->ۥ۟۟۟۠(I)LYue/ۥۡۧ۟ۧ;

    move-result-object v5

    goto :goto_4

    :cond_e
    iget-boolean p1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡۡ:Z

    if-eqz p1, :cond_f

    move-object p1, v5

    goto :goto_5

    :cond_f
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_5
    iput-object v8, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    iput-object v5, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object v1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v4, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۧ:I

    invoke-virtual {v8, p1, p0}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_10

    return-object v0

    :cond_10
    :goto_6
    iget p1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ۟:I

    invoke-virtual {v5, p1}, LYue/ۥۡۧ۟ۧ;->ۥ۟۟۟ۤ(I)V

    goto :goto_4

    :cond_11
    iget-boolean p1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡۢ:Z

    if-eqz p1, :cond_15

    move-object v1, v5

    move-object v4, v8

    :goto_7
    invoke-virtual {v1}, LYue/ۥ۟۟۠ۦ;->size()I

    move-result p1

    iget v5, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ۟:I

    if-le p1, v5, :cond_14

    iget-boolean p1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡۡ:Z

    if-eqz p1, :cond_12

    move-object p1, v1

    goto :goto_8

    :cond_12
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    :goto_8
    iput-object v4, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    iput-object v1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object v7, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v3, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۧ:I

    invoke-virtual {v4, p1, p0}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_13

    return-object v0

    :cond_13
    :goto_9
    iget p1, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟ۡ۟:I

    invoke-virtual {v1, p1}, LYue/ۥۡۧ۟ۧ;->ۥ۟۟۟ۤ(I)V

    goto :goto_7

    :cond_14
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v6

    if-eqz p1, :cond_15

    iput-object v7, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۨ:Ljava/lang/Object;

    iput-object v7, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    iput-object v7, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۥ:Ljava/lang/Object;

    iput v2, p0, LYue/ۥۢ۟ۢ۟$ۥ;->ۥ۟۟۠ۧ:I

    invoke-virtual {v4, v1, p0}, LYue/ۥۡۨۢ۠;->ۥ(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_15

    return-object v0

    :cond_15
    :goto_a
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method

.method public final ۥ۟۟۠ۦ(LYue/ۥۡۨۢ۠;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 0
    .param p1    # LYue/ۥۡۨۢ۠;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e1\u06e8\u06e2\u06e0<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, LYue/ۥۢ۟ۢ۟$ۥ;->create(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)LYue/ۥ۟ۧۤۢ;

    move-result-object p1

    check-cast p1, LYue/ۥۢ۟ۢ۟$ۥ;

    sget-object p2, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    invoke-virtual {p1, p2}, LYue/ۥۢ۟ۢ۟$ۥ;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
