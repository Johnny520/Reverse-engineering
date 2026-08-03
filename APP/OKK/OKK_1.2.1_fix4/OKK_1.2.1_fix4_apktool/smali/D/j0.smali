.class public abstract LD/j0;
.super LD/o0;
.source "SourceFile"


# static fields
.field public static h:Z = false

.field public static i:Ljava/lang/reflect/Method;

.field public static j:Ljava/lang/Class;

.field public static k:Ljava/lang/reflect/Field;

.field public static l:Ljava/lang/reflect/Field;


# instance fields
.field public final c:Landroid/view/WindowInsets;

.field public d:[Lv/c;

.field public e:Lv/c;

.field public f:LD/q0;

.field public g:Lv/c;


# direct methods
.method public constructor <init>(LD/q0;Landroid/view/WindowInsets;)V
    .locals 0

    invoke-direct {p0, p1}, LD/o0;-><init>(LD/q0;)V

    const/4 p1, 0x0

    iput-object p1, p0, LD/j0;->e:Lv/c;

    iput-object p2, p0, LD/j0;->c:Landroid/view/WindowInsets;

    return-void
.end method

.method private r(IZ)Lv/c;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    sget-object v0, Lv/c;->e:Lv/c;

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0x100

    if-gt v1, v2, :cond_1

    and-int v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1, p2}, LD/j0;->s(IZ)Lv/c;

    move-result-object v2

    invoke-static {v0, v2}, Lv/c;->a(Lv/c;Lv/c;)Lv/c;

    move-result-object v0

    :goto_1
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private t()Lv/c;
    .locals 1

    iget-object v0, p0, LD/j0;->f:LD/q0;

    if-eqz v0, :cond_0

    iget-object v0, v0, LD/q0;->a:LD/o0;

    invoke-virtual {v0}, LD/o0;->h()Lv/c;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lv/c;->e:Lv/c;

    return-object v0
.end method

.method private u(Landroid/view/View;)Lv/c;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_5

    sget-boolean v0, LD/j0;->h:Z

    if-nez v0, :cond_0

    invoke-static {}, LD/j0;->v()V

    :cond_0
    sget-object v0, LD/j0;->i:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    sget-object v2, LD/j0;->j:Ljava/lang/Class;

    if-eqz v2, :cond_4

    sget-object v2, LD/j0;->k:Ljava/lang/reflect/Field;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v1

    :cond_2
    sget-object v0, LD/j0;->l:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LD/j0;->k:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Rect;

    if-eqz p1, :cond_3

    iget v0, p1, Landroid/graphics/Rect;->left:I

    iget v2, p1, Landroid/graphics/Rect;->top:I

    iget v3, p1, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    invoke-static {v0, v2, v3, p1}, Lv/c;->b(IIII)Lv/c;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    return-object v1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_4
    :goto_0
    return-object v1

    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static v()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "PrivateApi"
        }
    .end annotation

    const/4 v0, 0x1

    :try_start_0
    const-class v1, Landroid/view/View;

    const-string v2, "getViewRootImpl"

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, LD/j0;->i:Ljava/lang/reflect/Method;

    const-string v1, "android.view.View$AttachInfo"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, LD/j0;->j:Ljava/lang/Class;

    const-string v2, "mVisibleInsets"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, LD/j0;->k:Ljava/lang/reflect/Field;

    const-string v1, "android.view.ViewRootImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "mAttachInfo"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, LD/j0;->l:Ljava/lang/reflect/Field;

    sget-object v1, LD/j0;->k:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sget-object v1, LD/j0;->l:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :goto_0
    sput-boolean v0, LD/j0;->h:Z

    return-void
.end method


# virtual methods
.method public d(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, LD/j0;->u(Landroid/view/View;)Lv/c;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lv/c;->e:Lv/c;

    :cond_0
    invoke-virtual {p0, p1}, LD/j0;->w(Lv/c;)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    invoke-super {p0, p1}, LD/o0;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LD/j0;

    iget-object v0, p0, LD/j0;->g:Lv/c;

    iget-object p1, p1, LD/j0;->g:Lv/c;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public f(I)Lv/c;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LD/j0;->r(IZ)Lv/c;

    move-result-object p1

    return-object p1
.end method

.method public final j()Lv/c;
    .locals 4

    iget-object v0, p0, LD/j0;->e:Lv/c;

    if-nez v0, :cond_0

    iget-object v0, p0, LD/j0;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v0

    invoke-static {v1, v2, v3, v0}, Lv/c;->b(IIII)Lv/c;

    move-result-object v0

    iput-object v0, p0, LD/j0;->e:Lv/c;

    :cond_0
    iget-object v0, p0, LD/j0;->e:Lv/c;

    return-object v0
.end method

.method public l(IIII)LD/q0;
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, LD/j0;->c:Landroid/view/WindowInsets;

    invoke-static {v0, v1}, LD/q0;->d(Landroid/view/View;Landroid/view/WindowInsets;)LD/q0;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_0

    new-instance v1, LD/h0;

    invoke-direct {v1, v0}, LD/h0;-><init>(LD/q0;)V

    goto :goto_0

    :cond_0
    const/16 v2, 0x1d

    if-lt v1, v2, :cond_1

    new-instance v1, LD/g0;

    invoke-direct {v1, v0}, LD/g0;-><init>(LD/q0;)V

    goto :goto_0

    :cond_1
    new-instance v1, LD/f0;

    invoke-direct {v1, v0}, LD/f0;-><init>(LD/q0;)V

    :goto_0
    invoke-virtual {p0}, LD/j0;->j()Lv/c;

    move-result-object v0

    invoke-static {v0, p1, p2, p3, p4}, LD/q0;->b(Lv/c;IIII)Lv/c;

    move-result-object v0

    invoke-virtual {v1, v0}, LD/i0;->g(Lv/c;)V

    invoke-virtual {p0}, LD/o0;->h()Lv/c;

    move-result-object v0

    invoke-static {v0, p1, p2, p3, p4}, LD/q0;->b(Lv/c;IIII)Lv/c;

    move-result-object p1

    invoke-virtual {v1, p1}, LD/i0;->e(Lv/c;)V

    invoke-virtual {v1}, LD/i0;->b()LD/q0;

    move-result-object p1

    return-object p1
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, LD/j0;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isRound()Z

    move-result v0

    return v0
.end method

.method public o([Lv/c;)V
    .locals 0

    iput-object p1, p0, LD/j0;->d:[Lv/c;

    return-void
.end method

.method public p(LD/q0;)V
    .locals 0

    iput-object p1, p0, LD/j0;->f:LD/q0;

    return-void
.end method

.method public s(IZ)Lv/c;
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_13

    const/4 v0, 0x2

    const/4 v2, 0x0

    if-eq p1, v0, :cond_f

    const/16 p2, 0x8

    sget-object v0, Lv/c;->e:Lv/c;

    if-eq p1, p2, :cond_a

    const/16 p2, 0x10

    if-eq p1, p2, :cond_9

    const/16 p2, 0x20

    if-eq p1, p2, :cond_8

    const/16 p2, 0x40

    if-eq p1, p2, :cond_7

    const/16 p2, 0x80

    if-eq p1, p2, :cond_0

    return-object v0

    :cond_0
    iget-object p1, p0, LD/j0;->f:LD/q0;

    if-eqz p1, :cond_1

    iget-object p1, p1, LD/q0;->a:LD/o0;

    invoke-virtual {p1}, LD/o0;->e()LD/k;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LD/o0;->e()LD/k;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_6

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p2, v0, :cond_2

    iget-object v2, p1, LD/k;->a:Landroid/view/DisplayCutout;

    invoke-static {v2}, LD/j;->d(Landroid/view/DisplayCutout;)I

    move-result v2

    goto :goto_1

    :cond_2
    move v2, v1

    :goto_1
    if-lt p2, v0, :cond_3

    iget-object v3, p1, LD/k;->a:Landroid/view/DisplayCutout;

    invoke-static {v3}, LD/j;->f(Landroid/view/DisplayCutout;)I

    move-result v3

    goto :goto_2

    :cond_3
    move v3, v1

    :goto_2
    if-lt p2, v0, :cond_4

    iget-object v4, p1, LD/k;->a:Landroid/view/DisplayCutout;

    invoke-static {v4}, LD/j;->e(Landroid/view/DisplayCutout;)I

    move-result v4

    goto :goto_3

    :cond_4
    move v4, v1

    :goto_3
    if-lt p2, v0, :cond_5

    iget-object p1, p1, LD/k;->a:Landroid/view/DisplayCutout;

    invoke-static {p1}, LD/j;->c(Landroid/view/DisplayCutout;)I

    move-result v1

    :cond_5
    invoke-static {v2, v3, v4, v1}, Lv/c;->b(IIII)Lv/c;

    move-result-object p1

    return-object p1

    :cond_6
    return-object v0

    :cond_7
    invoke-virtual {p0}, LD/o0;->k()Lv/c;

    move-result-object p1

    return-object p1

    :cond_8
    invoke-virtual {p0}, LD/o0;->g()Lv/c;

    move-result-object p1

    return-object p1

    :cond_9
    invoke-virtual {p0}, LD/o0;->i()Lv/c;

    move-result-object p1

    return-object p1

    :cond_a
    iget-object p1, p0, LD/j0;->d:[Lv/c;

    if-eqz p1, :cond_b

    const/4 p2, 0x3

    aget-object v2, p1, p2

    :cond_b
    if-eqz v2, :cond_c

    return-object v2

    :cond_c
    invoke-virtual {p0}, LD/j0;->j()Lv/c;

    move-result-object p1

    invoke-direct {p0}, LD/j0;->t()Lv/c;

    move-result-object p2

    iget p1, p1, Lv/c;->d:I

    iget v2, p2, Lv/c;->d:I

    if-le p1, v2, :cond_d

    invoke-static {v1, v1, v1, p1}, Lv/c;->b(IIII)Lv/c;

    move-result-object p1

    return-object p1

    :cond_d
    iget-object p1, p0, LD/j0;->g:Lv/c;

    if-eqz p1, :cond_e

    invoke-virtual {p1, v0}, Lv/c;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    iget-object p1, p0, LD/j0;->g:Lv/c;

    iget p1, p1, Lv/c;->d:I

    iget p2, p2, Lv/c;->d:I

    if-le p1, p2, :cond_e

    invoke-static {v1, v1, v1, p1}, Lv/c;->b(IIII)Lv/c;

    move-result-object p1

    return-object p1

    :cond_e
    return-object v0

    :cond_f
    if-eqz p2, :cond_10

    invoke-direct {p0}, LD/j0;->t()Lv/c;

    move-result-object p1

    invoke-virtual {p0}, LD/o0;->h()Lv/c;

    move-result-object p2

    iget v0, p1, Lv/c;->a:I

    iget v2, p2, Lv/c;->a:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p1, Lv/c;->c:I

    iget v3, p2, Lv/c;->c:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget p1, p1, Lv/c;->d:I

    iget p2, p2, Lv/c;->d:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, v1, v2, p1}, Lv/c;->b(IIII)Lv/c;

    move-result-object p1

    return-object p1

    :cond_10
    invoke-virtual {p0}, LD/j0;->j()Lv/c;

    move-result-object p1

    iget-object p2, p0, LD/j0;->f:LD/q0;

    if-eqz p2, :cond_11

    iget-object p2, p2, LD/q0;->a:LD/o0;

    invoke-virtual {p2}, LD/o0;->h()Lv/c;

    move-result-object v2

    :cond_11
    iget p2, p1, Lv/c;->d:I

    if-eqz v2, :cond_12

    iget v0, v2, Lv/c;->d:I

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_12
    iget v0, p1, Lv/c;->a:I

    iget p1, p1, Lv/c;->c:I

    invoke-static {v0, v1, p1, p2}, Lv/c;->b(IIII)Lv/c;

    move-result-object p1

    return-object p1

    :cond_13
    if-eqz p2, :cond_14

    invoke-direct {p0}, LD/j0;->t()Lv/c;

    move-result-object p1

    iget p1, p1, Lv/c;->b:I

    invoke-virtual {p0}, LD/j0;->j()Lv/c;

    move-result-object p2

    iget p2, p2, Lv/c;->b:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v1, p1, v1, v1}, Lv/c;->b(IIII)Lv/c;

    move-result-object p1

    return-object p1

    :cond_14
    invoke-virtual {p0}, LD/j0;->j()Lv/c;

    move-result-object p1

    iget p1, p1, Lv/c;->b:I

    invoke-static {v1, p1, v1, v1}, Lv/c;->b(IIII)Lv/c;

    move-result-object p1

    return-object p1
.end method

.method public w(Lv/c;)V
    .locals 0

    iput-object p1, p0, LD/j0;->g:Lv/c;

    return-void
.end method
