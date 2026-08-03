.class public final LYue/ۥ۟ۧۤ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final synthetic ۥ(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/content/Context;",
            ")TT;"
        }
    .end annotation

    const/4 v0, 0x4

    const-string v1, "T"

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠ۨ(ILjava/lang/String;)V

    const-class v0, Ljava/lang/Object;

    invoke-static {p0, v0}, LYue/ۥۣ۟ۧۨ;->ۥ۟۟۠ۢ(Landroid/content/Context;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟(Landroid/content/Context;I[ILYue/ۥۣ۠ۡ۟;)V
    .locals 0
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # I
        .annotation build LYue/ۥۣۢ۠ۡ;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I[I",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/content/res/TypedArray;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object p0

    invoke-interface {p3, p0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static final ۥ۟۟(Landroid/content/Context;Landroid/util/AttributeSet;[IIILYue/ۥۣ۠ۡ۟;)V
    .locals 0
    .param p0    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p2    # [I
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # I
        .annotation build LYue/ۥ۟ۢ۠۟;
        .end annotation
    .end param
    .param p4    # I
        .annotation build LYue/ۥۣۢ۠ۡ;
        .end annotation
    .end param
    .param p5    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/util/AttributeSet;",
            "[III",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/content/res/TypedArray;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    invoke-interface {p5, p0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public static synthetic ۥ۟۟۟(Landroid/content/Context;Landroid/util/AttributeSet;[IIILYue/ۥۣ۠ۡ۟;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p7, p6, 0x4

    const/4 v0, 0x0

    if-eqz p7, :cond_1

    move p3, v0

    :cond_1
    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_2

    move p4, v0

    :cond_2
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p0

    invoke-interface {p5, p0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
