.class public final LYue/ۥ۟ۢۤۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,127:1\n37#2:128\n36#2,3:129\n13536#3,2:132\n1849#4,2:134\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitKt\n*L\n42#1:128\n42#1:129,3\n54#1:132,2\n66#1:134,2\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(Ljava/util/Collection;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p0    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Collection<",
            "+",
            "LYue/\u06e5\u06df\u06e8\u06e7\u06e5<",
            "+TT;>;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟ۡ()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۢۤ;

    const/4 v1, 0x0

    new-array v1, v1, [LYue/ۥ۟ۨۧۥ;

    invoke-interface {p0, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_1

    check-cast p0, [LYue/ۥ۟ۨۧۥ;

    invoke-direct {v0, p0}, LYue/ۥۣ۟ۢۤ;-><init>([LYue/ۥ۟ۨۧۥ;)V

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۢۤ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final ۥ۟([LYue/ۥ۟ۨۧۥ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 1
    .param p0    # [LYue/ۥ۟ۨۧۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([",
            "LYue/\u06e5\u06df\u06e8\u06e7\u06e5<",
            "+TT;>;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "Ljava/util/List<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    array-length v0, p0

    if-nez v0, :cond_0

    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟ۡ()Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, LYue/ۥۣ۟ۢۤ;

    invoke-direct {v0, p0}, LYue/ۥۣ۟ۢۤ;-><init>([LYue/ۥ۟ۨۧۥ;)V

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۢۤ;->ۥ۟(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟(Ljava/util/Collection;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 4
    .param p0    # Ljava/util/Collection;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "LYue/\u06e5\u06e0\u06e6\u06df\u06e1;",
            ">;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۟ۢۤۤ$ۥ۟;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥ۟ۢۤۤ$ۥ۟;

    iget v1, v0, LYue/ۥ۟ۢۤۤ$ۥ۟;->ۥ۟۟۠ۥ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۟ۢۤۤ$ۥ۟;->ۥ۟۟۠ۥ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۟ۢۤۤ$ۥ۟;

    invoke-direct {v0, p1}, LYue/ۥ۟ۢۤۤ$ۥ۟;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥ۟ۢۤۤ$ۥ۟;->ۥ۟۟۠ۤ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۟ۢۤۤ$ۥ۟;->ۥ۟۟۠ۥ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, LYue/ۥ۟ۢۤۤ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast p0, Ljava/util/Iterator;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_3
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, LYue/ۥ۠ۦ۟ۡ;

    iput-object p0, v0, LYue/ۥ۟ۢۤۤ$ۥ۟;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v3, v0, LYue/ۥ۟ۢۤۤ$ۥ۟;->ۥ۟۟۠ۥ:I

    invoke-interface {p1, v0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟ۤۨ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_4
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0
.end method

.method public static final ۥ۟۟۟([LYue/ۥ۠ۦ۟ۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 6
    .param p0    # [LYue/ۥ۠ۦ۟ۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "LYue/\u06e5\u06e0\u06e6\u06df\u06e1;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, LYue/ۥ۟ۢۤۤ$ۥ;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, LYue/ۥ۟ۢۤۤ$ۥ;

    iget v1, v0, LYue/ۥ۟ۢۤۤ$ۥ;->ۥ۟۟۠ۧ:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, LYue/ۥ۟ۢۤۤ$ۥ;->ۥ۟۟۠ۧ:I

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥ۟ۢۤۤ$ۥ;

    invoke-direct {v0, p1}, LYue/ۥ۟ۢۤۤ$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;)V

    :goto_0
    iget-object p1, v0, LYue/ۥ۟ۢۤۤ$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object v1

    iget v2, v0, LYue/ۥ۟ۢۤۤ$ۥ;->ۥ۟۟۠ۧ:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget p0, v0, LYue/ۥ۟ۢۤۤ$ۥ;->ۥ۟۟۠ۥ:I

    iget v2, v0, LYue/ۥ۟ۢۤۤ$ۥ;->ۥ۟۟۠ۤ:I

    iget-object v4, v0, LYue/ۥ۟ۢۤۤ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    check-cast v4, [LYue/ۥ۠ۦ۟ۡ;

    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    move-object p1, v4

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, LYue/ۥۡۦۧۥ;->ۥ۟۟۟ۨ(Ljava/lang/Object;)V

    array-length p1, p0

    const/4 v2, 0x0

    move v5, p1

    move-object p1, p0

    move p0, v5

    :goto_1
    if-ge v2, p0, :cond_4

    aget-object v4, p1, v2

    iput-object p1, v0, LYue/ۥ۟ۢۤۤ$ۥ;->ۥۣ۟۟۠:Ljava/lang/Object;

    iput v2, v0, LYue/ۥ۟ۢۤۤ$ۥ;->ۥ۟۟۠ۤ:I

    iput p0, v0, LYue/ۥ۟ۢۤۤ$ۥ;->ۥ۟۟۠ۥ:I

    iput v3, v0, LYue/ۥ۟ۢۤۤ$ۥ;->ۥ۟۟۠ۧ:I

    invoke-interface {v4, v0}, LYue/ۥ۠ۦ۟ۡ;->ۥ۟۟ۤۨ(LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    add-int/2addr v2, v3

    goto :goto_1

    :cond_4
    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p0
.end method
