.class public final LYue/ۥۢ۟ۦۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n77#1,4:97\n1#2:96\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n73#1:97,4\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSparseBooleanArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,95:1\n77#1,4:97\n1#2:96\n*S KotlinDebug\n*F\n+ 1 SparseBooleanArray.kt\nandroidx/core/util/SparseBooleanArrayKt\n*L\n73#1:97,4\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(Landroid/util/SparseBooleanArray;I)Z
    .locals 0
    .param p0    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/util/SparseBooleanArray;->indexOfKey(I)I

    move-result p0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟(Landroid/util/SparseBooleanArray;I)Z
    .locals 0
    .param p0    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/util/SparseBooleanArray;->indexOfKey(I)I

    move-result p0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟(Landroid/util/SparseBooleanArray;Z)Z
    .locals 0
    .param p0    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/util/SparseBooleanArray;->indexOfValue(Z)I

    move-result p0

    if-ltz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟(Landroid/util/SparseBooleanArray;LYue/ۥۣ۠ۢۢ;)V
    .locals 4
    .param p0    # Landroid/util/SparseBooleanArray;
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
            "Landroid/util/SparseBooleanArray;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Ljava/lang/Boolean;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Landroid/util/SparseBooleanArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p0, v1}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p0, v1}, Landroid/util/SparseBooleanArray;->valueAt(I)Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-interface {p1, v2, v3}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟۟(Landroid/util/SparseBooleanArray;IZ)Z
    .locals 0
    .param p0    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2}, Landroid/util/SparseBooleanArray;->get(IZ)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟۠(Landroid/util/SparseBooleanArray;ILYue/ۥۣ۠۠ۨ;)Z
    .locals 0
    .param p0    # Landroid/util/SparseBooleanArray;
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
            "Landroid/util/SparseBooleanArray;",
            "I",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "Ljava/lang/Boolean;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroid/util/SparseBooleanArray;->indexOfKey(I)I

    move-result p1

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Landroid/util/SparseBooleanArray;->valueAt(I)Z

    move-result p0

    goto :goto_0

    :cond_0
    invoke-interface {p2}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟ۡ(Landroid/util/SparseBooleanArray;)I
    .locals 0
    .param p0    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/util/SparseBooleanArray;->size()I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۢ(Landroid/util/SparseBooleanArray;)Z
    .locals 0
    .param p0    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/util/SparseBooleanArray;->size()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥۣ۟۟۟(Landroid/util/SparseBooleanArray;)Z
    .locals 0
    .param p0    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/util/SparseBooleanArray;->size()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟ۤ(Landroid/util/SparseBooleanArray;)LYue/ۥ۠ۥۣۥ;
    .locals 1
    .param p0    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۢ۟ۦۢ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۢ۟ۦۢ$ۥ;-><init>(Landroid/util/SparseBooleanArray;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۥ(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)Landroid/util/SparseBooleanArray;
    .locals 3
    .param p0    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/util/SparseBooleanArray;

    invoke-virtual {p0}, Landroid/util/SparseBooleanArray;->size()I

    move-result v1

    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->size()I

    move-result v2

    add-int/2addr v1, v2

    invoke-direct {v0, v1}, Landroid/util/SparseBooleanArray;-><init>(I)V

    invoke-static {v0, p0}, LYue/ۥۢ۟ۦۢ;->ۥ۟۟۟ۦ(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)V

    invoke-static {v0, p1}, LYue/ۥۢ۟ۦۢ;->ۥ۟۟۟ۦ(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۦ(Landroid/util/SparseBooleanArray;Landroid/util/SparseBooleanArray;)V
    .locals 4
    .param p0    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-virtual {p1, v1}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v2

    invoke-virtual {p1, v1}, Landroid/util/SparseBooleanArray;->valueAt(I)Z

    move-result v3

    invoke-virtual {p0, v2, v3}, Landroid/util/SparseBooleanArray;->put(IZ)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟ۧ(Landroid/util/SparseBooleanArray;IZ)Z
    .locals 1
    .param p0    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/util/SparseBooleanArray;->indexOfKey(I)I

    move-result v0

    if-ltz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/util/SparseBooleanArray;->valueAt(I)Z

    move-result v0

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final ۥ۟۟۟ۨ(Landroid/util/SparseBooleanArray;IZ)V
    .locals 0
    .param p0    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2}, Landroid/util/SparseBooleanArray;->put(IZ)V

    return-void
.end method

.method public static final ۥ۟۟۠(Landroid/util/SparseBooleanArray;)LYue/ۥۣ۟۠ۡ;
    .locals 1
    .param p0    # Landroid/util/SparseBooleanArray;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۢ۟ۦۢ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۢ۟ۦۢ$ۥ۟;-><init>(Landroid/util/SparseBooleanArray;)V

    return-object v0
.end method
