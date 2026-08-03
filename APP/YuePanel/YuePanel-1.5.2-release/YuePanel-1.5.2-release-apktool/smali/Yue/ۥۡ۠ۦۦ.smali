.class public final LYue/ۥۡ۠ۦۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nMenu.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Menu.kt\nandroidx/core/view/MenuKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"
.end annotation


# direct methods
.method public static final ۥ(Landroid/view/Menu;Landroid/view/MenuItem;)Z
    .locals 4
    .param p0    # Landroid/view/Menu;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/view/MenuItem;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-interface {p0}, Landroid/view/Menu;->size()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    invoke-interface {p0, v2}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v3

    invoke-static {v3, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static final ۥ۟(Landroid/view/Menu;LYue/ۥۣ۠ۡ۟;)V
    .locals 3
    .param p0    # Landroid/view/Menu;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Menu;",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/view/MenuItem;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Landroid/view/Menu;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-interface {p0, v1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    invoke-interface {p1, v2}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟(Landroid/view/Menu;LYue/ۥۣ۠ۢۢ;)V
    .locals 4
    .param p0    # Landroid/view/Menu;
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
            "Landroid/view/Menu;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/lang/Integer;",
            "-",
            "Landroid/view/MenuItem;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0}, Landroid/view/Menu;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {p0, v1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object v3

    invoke-interface {p1, v2, v3}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static final ۥ۟۟۟(Landroid/view/Menu;I)Landroid/view/MenuItem;
    .locals 0
    .param p0    # Landroid/view/Menu;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-interface {p0, p1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(Landroid/view/Menu;)LYue/ۥۡۨۢ;
    .locals 1
    .param p0    # Landroid/view/Menu;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Menu;",
            ")",
            "LYue/\u06e5\u06e1\u06e8\u06e2<",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡ۠ۦۦ$ۥ;

    invoke-direct {v0, p0}, LYue/ۥۡ۠ۦۦ$ۥ;-><init>(Landroid/view/Menu;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟۠(Landroid/view/Menu;)I
    .locals 0
    .param p0    # Landroid/view/Menu;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-interface {p0}, Landroid/view/Menu;->size()I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۡ(Landroid/view/Menu;)Z
    .locals 0
    .param p0    # Landroid/view/Menu;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-interface {p0}, Landroid/view/Menu;->size()I

    move-result p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟ۢ(Landroid/view/Menu;)Z
    .locals 0
    .param p0    # Landroid/view/Menu;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-interface {p0}, Landroid/view/Menu;->size()I

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static final ۥۣ۟۟۟(Landroid/view/Menu;)Ljava/util/Iterator;
    .locals 1
    .param p0    # Landroid/view/Menu;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/view/Menu;",
            ")",
            "Ljava/util/Iterator<",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation

    new-instance v0, LYue/ۥۡ۠ۦۦ$ۥ۟;

    invoke-direct {v0, p0}, LYue/ۥۡ۠ۦۦ$ۥ۟;-><init>(Landroid/view/Menu;)V

    return-object v0
.end method

.method public static final ۥ۟۟۟ۤ(Landroid/view/Menu;Landroid/view/MenuItem;)V
    .locals 0
    .param p0    # Landroid/view/Menu;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/view/MenuItem;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    invoke-interface {p0, p1}, Landroid/view/Menu;->removeItem(I)V

    return-void
.end method

.method public static final ۥ۟۟۟ۥ(Landroid/view/Menu;I)V
    .locals 0
    .param p0    # Landroid/view/Menu;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-interface {p0, p1}, Landroid/view/Menu;->getItem(I)Landroid/view/MenuItem;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    move-result p1

    invoke-interface {p0, p1}, Landroid/view/Menu;->removeItem(I)V

    sget-object p0, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    return-void

    :cond_1
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/IndexOutOfBoundsException;-><init>()V

    throw p0
.end method
