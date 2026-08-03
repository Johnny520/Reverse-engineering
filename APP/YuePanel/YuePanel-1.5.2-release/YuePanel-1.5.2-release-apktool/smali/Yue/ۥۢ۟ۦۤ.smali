.class public final LYue/ۥۢ۟ۦۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n71#1:95,4\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSparseLongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n75#1,4:95\n1#2:94\n*S KotlinDebug\n*F\n+ 1 SparseLongArray.kt\nandroidx/core/util/SparseLongArrayKt\n*L\n71#1:95,4\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(Landroid/util/SparseLongArray;I)Z
    .locals 0
    .param p0    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    move-result p0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟(Landroid/util/SparseLongArray;I)Z
    .locals 0
    .param p0    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    move-result p0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟(Landroid/util/SparseLongArray;J)Z
    .locals 0
    .param p0    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2}, Landroid/util/SparseLongArray;->indexOfValue(J)I

    move-result p0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟(Landroid/util/SparseLongArray;LYue/ۥۣ۠ۢۢ;)V
    .locals 5
    .param p0    # Landroid/util/SparseLongArray;
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
            "Landroid/util/SparseLongArray;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Long;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/util/SparseLongArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p0, v1}, Landroid/util/SparseLongArray;->keyAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v1}, Landroid/util/SparseLongArray;->valueAt(I)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-interface {p1, v2, v3}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟۟(Landroid/util/SparseLongArray;IJ)J
    .locals 0
    .param p0    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2, p3}, Landroid/util/SparseLongArray;->get(IJ)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۟۠(Landroid/util/SparseLongArray;ILYue/ۥۣ۠۠ۨ;)J
    .locals 0
    .param p0    # Landroid/util/SparseLongArray;
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
            "Landroid/util/SparseLongArray;",
            "I",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "Ljava/lang/Long;",
            ">;)J"
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Landroid/util/SparseLongArray;->valueAt(I)J

    move-result-wide p0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide p0

    :goto_0
    return-wide p0
.end method

.method public static final ۥ۟۟۟ۡ(Landroid/util/SparseLongArray;)I
    .locals 0
    .param p0    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/util/SparseLongArray;->size()I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۢ(Landroid/util/SparseLongArray;)Z
    .locals 0
    .param p0    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/util/SparseLongArray;->size()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥۣ۟۟۟(Landroid/util/SparseLongArray;)Z
    .locals 0
    .param p0    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/util/SparseLongArray;->size()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟ۤ(Landroid/util/SparseLongArray;)LYue/ۥ۠ۥۣۥ;
    .locals 1
    .param p0    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۢ۟ۦۤ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۢ۟ۦۤ$ۥ;-><init>(Landroid/util/SparseLongArray;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۥ(Landroid/util/SparseLongArray;Landroid/util/SparseLongArray;)Landroid/util/SparseLongArray;
    .locals 3
    .param p0    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/util/SparseLongArray;

    invoke-virtual {p0}, Landroid/util/SparseLongArray;->size()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/SparseLongArray;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Landroid/util/SparseLongArray;-><init>(I)V

    invoke-static {v0, p0}, LYue/ۥۢ۟ۦۤ;->ۥ۟۟۟ۦ(Landroid/util/SparseLongArray;Landroid/util/SparseLongArray;)V

    invoke-static {v0, p1}, LYue/ۥۢ۟ۦۤ;->ۥ۟۟۟ۦ(Landroid/util/SparseLongArray;Landroid/util/SparseLongArray;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۦ(Landroid/util/SparseLongArray;Landroid/util/SparseLongArray;)V
    .locals 5
    .param p0    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/util/SparseLongArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/util/SparseLongArray;->keyAt(I)I

    move-result v2

    invoke-virtual {p1, v1}, Landroid/util/SparseLongArray;->valueAt(I)J

    move-result-wide v3

    invoke-virtual {p0, v2, v3, v4}, Landroid/util/SparseLongArray;->put(IJ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟ۧ(Landroid/util/SparseLongArray;IJ)Z
    .locals 2
    .param p0    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/util/SparseLongArray;->indexOfKey(I)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Landroid/util/SparseLongArray;->valueAt(I)J

    move-result-wide v0

    cmp-long p2, p2, v0

    if-nez p2, :cond_0

    invoke-virtual {p0, p1}, Landroid/util/SparseLongArray;->removeAt(I)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final ۥ۟۟۟ۨ(Landroid/util/SparseLongArray;IJ)V
    .locals 0
    .param p0    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2, p3}, Landroid/util/SparseLongArray;->put(IJ)V

    return-void
.end method

.method public static final ۥ۟۟۠(Landroid/util/SparseLongArray;)LYue/ۥ۠ۨۢۨ;
    .locals 1
    .param p0    # Landroid/util/SparseLongArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۢ۟ۦۤ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۢ۟ۦۤ$ۥ۟;-><init>(Landroid/util/SparseLongArray;)V

    return-object v0
.end method
