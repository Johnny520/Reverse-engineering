.class public final LYue/ۥۢ۟ۦۣ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n71#1:95,4\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSparseIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseIntArray.kt\nandroidx/core/util/SparseIntArrayKt\n*L\n71#1:95,4\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(Landroid/util/SparseIntArray;I)Z
    .locals 0
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result p0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟(Landroid/util/SparseIntArray;I)Z
    .locals 0
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result p0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟(Landroid/util/SparseIntArray;I)Z
    .locals 0
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/util/SparseIntArray;->indexOfValue(I)I

    move-result p0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟(Landroid/util/SparseIntArray;LYue/ۥۣ۠ۢۢ;)V
    .locals 4
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseIntArray;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Integer;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p0, v1}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v1}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {p1, v2, v3}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟۟(Landroid/util/SparseIntArray;II)I
    .locals 0
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2}, Landroid/util/SparseIntArray;->get(II)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟۠(Landroid/util/SparseIntArray;ILYue/ۥۣ۠۠ۨ;)I
    .locals 0
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseIntArray;",
            "I",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "Ljava/lang/Integer;",
            ">;)I"
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟ۡ(Landroid/util/SparseIntArray;)I
    .locals 0
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/util/SparseIntArray;->size()I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۢ(Landroid/util/SparseIntArray;)Z
    .locals 0
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/util/SparseIntArray;->size()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥۣ۟۟۟(Landroid/util/SparseIntArray;)Z
    .locals 0
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/util/SparseIntArray;->size()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟ۤ(Landroid/util/SparseIntArray;)LYue/ۥ۠ۥۣۥ;
    .locals 1
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۢ۟ۦۣ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۢ۟ۦۣ$ۥ;-><init>(Landroid/util/SparseIntArray;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۥ(Landroid/util/SparseIntArray;Landroid/util/SparseIntArray;)Landroid/util/SparseIntArray;
    .locals 3
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/util/SparseIntArray;

    invoke-virtual {p0}, Landroid/util/SparseIntArray;->size()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Landroid/util/SparseIntArray;-><init>(I)V

    invoke-static {v0, p0}, LYue/ۥۢ۟ۦۣ;->ۥ۟۟۟ۦ(Landroid/util/SparseIntArray;Landroid/util/SparseIntArray;)V

    invoke-static {v0, p1}, LYue/ۥۢ۟ۦۣ;->ۥ۟۟۟ۦ(Landroid/util/SparseIntArray;Landroid/util/SparseIntArray;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۦ(Landroid/util/SparseIntArray;Landroid/util/SparseIntArray;)V
    .locals 4
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/util/SparseIntArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v2

    invoke-virtual {p1, v1}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v3

    invoke-virtual {p0, v2, v3}, Landroid/util/SparseIntArray;->put(II)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟ۧ(Landroid/util/SparseIntArray;II)Z
    .locals 1
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/util/SparseIntArray;->indexOfKey(I)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Landroid/util/SparseIntArray;->valueAt(I)I

    move-result v0

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/util/SparseIntArray;->removeAt(I)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final ۥ۟۟۟ۨ(Landroid/util/SparseIntArray;II)V
    .locals 0
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2}, Landroid/util/SparseIntArray;->put(II)V

    return-void
.end method

.method public static final ۥ۟۟۠(Landroid/util/SparseIntArray;)LYue/ۥ۠ۥۣۥ;
    .locals 1
    .param p0    # Landroid/util/SparseIntArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۢ۟ۦۣ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۢ۟ۦۣ$ۥ۟;-><init>(Landroid/util/SparseIntArray;)V

    return-object v0
.end method
