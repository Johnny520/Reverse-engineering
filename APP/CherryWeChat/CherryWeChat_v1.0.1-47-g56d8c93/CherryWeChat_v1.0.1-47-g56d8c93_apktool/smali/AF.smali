.class public LAF;
.super LHF;
.source ""


# static fields
.field public static i:Z = false

.field public static j:Ljava/lang/reflect/Method;

.field public static k:Ljava/lang/Class;

.field public static l:Ljava/lang/reflect/Field;

.field public static m:Ljava/lang/reflect/Field;


# instance fields
.field public final c:Landroid/view/WindowInsets;

.field public d:[Lyl;

.field public e:Lyl;

.field public f:LLF;

.field public g:Lyl;

.field public h:I


# direct methods
.method public constructor <init>(LLF;LAF;)V
    .locals 1

    .line 4
    new-instance v0, Landroid/view/WindowInsets;

    iget-object p2, p2, LAF;->c:Landroid/view/WindowInsets;

    invoke-direct {v0, p2}, Landroid/view/WindowInsets;-><init>(Landroid/view/WindowInsets;)V

    invoke-direct {p0, p1, v0}, LAF;-><init>(LLF;Landroid/view/WindowInsets;)V

    return-void
.end method

.method public constructor <init>(LLF;Landroid/view/WindowInsets;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LHF;-><init>(LLF;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LAF;->e:Lyl;

    .line 3
    iput-object p2, p0, LAF;->c:Landroid/view/WindowInsets;

    return-void
.end method

.method private u(IZ)Lyl;
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    sget-object v0, Lyl;->e:Lyl;

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0x200

    if-gt v1, v2, :cond_1

    and-int v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1, p2}, LAF;->v(IZ)Lyl;

    move-result-object v2

    invoke-static {v0, v2}, Lyl;->a(Lyl;Lyl;)Lyl;

    move-result-object v0

    :goto_1
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private w()Lyl;
    .locals 1

    iget-object v0, p0, LAF;->f:LLF;

    if-eqz v0, :cond_0

    iget-object v0, v0, LLF;->a:LHF;

    invoke-virtual {v0}, LHF;->i()Lyl;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, Lyl;->e:Lyl;

    return-object v0
.end method

.method private x(Landroid/view/View;)Lyl;
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_4

    sget-boolean v0, LAF;->i:Z

    if-nez v0, :cond_0

    invoke-static {}, LAF;->y()V

    :cond_0
    sget-object v0, LAF;->j:Ljava/lang/reflect/Method;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    sget-object v2, LAF;->k:Ljava/lang/Class;

    if-eqz v2, :cond_3

    sget-object v2, LAF;->l:Ljava/lang/reflect/Field;

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    :try_start_0
    invoke-virtual {v0, p1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    sget-object v0, LAF;->m:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, LAF;->l:Ljava/lang/reflect/Field;

    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Rect;

    if-eqz p1, :cond_3

    iget v0, p1, Landroid/graphics/Rect;->left:I

    iget v2, p1, Landroid/graphics/Rect;->top:I

    iget v3, p1, Landroid/graphics/Rect;->right:I

    iget p1, p1, Landroid/graphics/Rect;->bottom:I

    invoke-static {v0, v2, v3, p1}, Lyl;->b(IIII)Lyl;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :cond_3
    :goto_0
    return-object v1

    :cond_4
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static y()V
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

    sput-object v1, LAF;->j:Ljava/lang/reflect/Method;

    const-string v1, "android.view.View$AttachInfo"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, LAF;->k:Ljava/lang/Class;

    const-string v2, "mVisibleInsets"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, LAF;->l:Ljava/lang/reflect/Field;

    const-string v1, "android.view.ViewRootImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "mAttachInfo"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, LAF;->m:Ljava/lang/reflect/Field;

    sget-object v1, LAF;->l:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sget-object v1, LAF;->m:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    :goto_0
    sput-boolean v0, LAF;->i:Z

    return-void
.end method

.method public static z(II)Z
    .locals 0

    and-int/lit8 p0, p0, 0x6

    and-int/lit8 p1, p1, 0x6

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public d(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, LAF;->x(Landroid/view/View;)Lyl;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, Lyl;->e:Lyl;

    :cond_0
    invoke-virtual {p0, p1}, LAF;->q(Lyl;)V

    return-void
.end method

.method public e(LLF;)V
    .locals 2

    iget-object v0, p0, LAF;->f:LLF;

    iget-object v1, p1, LLF;->a:LHF;

    invoke-virtual {v1, v0}, LHF;->r(LLF;)V

    iget-object v0, p0, LAF;->g:Lyl;

    iget-object p1, p1, LLF;->a:LHF;

    invoke-virtual {p1, v0}, LHF;->q(Lyl;)V

    iget v0, p0, LAF;->h:I

    invoke-virtual {p1, v0}, LHF;->t(I)V

    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    invoke-super {p0, p1}, LHF;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LAF;

    iget-object v0, p0, LAF;->g:Lyl;

    iget-object v2, p1, LAF;->g:Lyl;

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget v0, p0, LAF;->h:I

    iget p1, p1, LAF;->h:I

    invoke-static {v0, p1}, LAF;->z(II)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public g(I)Lyl;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LAF;->u(IZ)Lyl;

    move-result-object p1

    return-object p1
.end method

.method public final k()Lyl;
    .locals 4

    iget-object v0, p0, LAF;->e:Lyl;

    if-nez v0, :cond_0

    iget-object v0, p0, LAF;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v1

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v3

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v0

    invoke-static {v1, v2, v3, v0}, Lyl;->b(IIII)Lyl;

    move-result-object v0

    iput-object v0, p0, LAF;->e:Lyl;

    :cond_0
    iget-object v0, p0, LAF;->e:Lyl;

    return-object v0
.end method

.method public m(IIII)LLF;
    .locals 3

    iget-object v0, p0, LAF;->c:Landroid/view/WindowInsets;

    const/4 v1, 0x0

    invoke-static {v1, v0}, LLF;->h(Landroid/view/View;Landroid/view/WindowInsets;)LLF;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x22

    if-lt v1, v2, :cond_0

    new-instance v1, LyF;

    invoke-direct {v1, v0}, LyF;-><init>(LLF;)V

    goto :goto_0

    :cond_0
    const/16 v2, 0x1f

    if-lt v1, v2, :cond_1

    new-instance v1, LxF;

    invoke-direct {v1, v0}, LxF;-><init>(LLF;)V

    goto :goto_0

    :cond_1
    const/16 v2, 0x1e

    if-lt v1, v2, :cond_2

    new-instance v1, LwF;

    invoke-direct {v1, v0}, LwF;-><init>(LLF;)V

    goto :goto_0

    :cond_2
    const/16 v2, 0x1d

    if-lt v1, v2, :cond_3

    new-instance v1, LvF;

    invoke-direct {v1, v0}, LvF;-><init>(LLF;)V

    goto :goto_0

    :cond_3
    new-instance v1, LuF;

    invoke-direct {v1, v0}, LuF;-><init>(LLF;)V

    :goto_0
    invoke-virtual {p0}, LAF;->k()Lyl;

    move-result-object v0

    invoke-static {v0, p1, p2, p3, p4}, LLF;->e(Lyl;IIII)Lyl;

    move-result-object v0

    invoke-virtual {v1, v0}, LzF;->g(Lyl;)V

    invoke-virtual {p0}, LHF;->i()Lyl;

    move-result-object v0

    invoke-static {v0, p1, p2, p3, p4}, LLF;->e(Lyl;IIII)Lyl;

    move-result-object p1

    invoke-virtual {v1, p1}, LzF;->e(Lyl;)V

    invoke-virtual {v1}, LzF;->b()LLF;

    move-result-object p1

    return-object p1
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, LAF;->c:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isRound()Z

    move-result v0

    return v0
.end method

.method public p([Lyl;)V
    .locals 0

    iput-object p1, p0, LAF;->d:[Lyl;

    return-void
.end method

.method public q(Lyl;)V
    .locals 0

    iput-object p1, p0, LAF;->g:Lyl;

    return-void
.end method

.method public r(LLF;)V
    .locals 0

    iput-object p1, p0, LAF;->f:LLF;

    return-void
.end method

.method public t(I)V
    .locals 0

    iput p1, p0, LAF;->h:I

    return-void
.end method

.method public v(IZ)Lyl;
    .locals 4

    const/4 v0, 0x1

    sget-object v1, Lyl;->e:Lyl;

    const/4 v2, 0x0

    if-eq p1, v0, :cond_10

    const/4 v0, 0x0

    const/4 v3, 0x2

    if-eq p1, v3, :cond_b

    const/16 p2, 0x8

    if-eq p1, p2, :cond_6

    const/16 p2, 0x10

    if-eq p1, p2, :cond_5

    const/16 p2, 0x20

    if-eq p1, p2, :cond_4

    const/16 p2, 0x40

    if-eq p1, p2, :cond_3

    const/16 p2, 0x80

    if-eq p1, p2, :cond_0

    return-object v1

    :cond_0
    iget-object p1, p0, LAF;->f:LLF;

    if-eqz p1, :cond_1

    iget-object p1, p1, LLF;->a:LHF;

    invoke-virtual {p1}, LHF;->f()Lie;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LHF;->f()Lie;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    iget-object p1, p1, Lie;->a:Landroid/view/DisplayCutout;

    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetLeft()I

    move-result p2

    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetTop()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetRight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/DisplayCutout;->getSafeInsetBottom()I

    move-result p1

    invoke-static {p2, v0, v1, p1}, Lyl;->b(IIII)Lyl;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v1

    :cond_3
    invoke-virtual {p0}, LHF;->l()Lyl;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p0}, LHF;->h()Lyl;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-virtual {p0}, LHF;->j()Lyl;

    move-result-object p1

    return-object p1

    :cond_6
    iget-object p1, p0, LAF;->d:[Lyl;

    if-eqz p1, :cond_7

    invoke-static {p2}, LQj;->w(I)I

    move-result p2

    aget-object v0, p1, p2

    :cond_7
    if-eqz v0, :cond_8

    return-object v0

    :cond_8
    invoke-virtual {p0}, LAF;->k()Lyl;

    move-result-object p1

    invoke-direct {p0}, LAF;->w()Lyl;

    move-result-object p2

    iget p1, p1, Lyl;->d:I

    iget v0, p2, Lyl;->d:I

    if-le p1, v0, :cond_9

    invoke-static {v2, v2, v2, p1}, Lyl;->b(IIII)Lyl;

    move-result-object p1

    return-object p1

    :cond_9
    iget-object p1, p0, LAF;->g:Lyl;

    if-eqz p1, :cond_a

    invoke-virtual {p1, v1}, Lyl;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    iget-object p1, p0, LAF;->g:Lyl;

    iget p1, p1, Lyl;->d:I

    iget p2, p2, Lyl;->d:I

    if-le p1, p2, :cond_a

    invoke-static {v2, v2, v2, p1}, Lyl;->b(IIII)Lyl;

    move-result-object p1

    return-object p1

    :cond_a
    return-object v1

    :cond_b
    if-eqz p2, :cond_c

    invoke-direct {p0}, LAF;->w()Lyl;

    move-result-object p1

    invoke-virtual {p0}, LHF;->i()Lyl;

    move-result-object p2

    iget v0, p1, Lyl;->a:I

    iget v1, p2, Lyl;->a:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v1, p1, Lyl;->c:I

    iget v3, p2, Lyl;->c:I

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget p1, p1, Lyl;->d:I

    iget p2, p2, Lyl;->d:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, v2, v1, p1}, Lyl;->b(IIII)Lyl;

    move-result-object p1

    return-object p1

    :cond_c
    iget p1, p0, LAF;->h:I

    and-int/2addr p1, v3

    if-eqz p1, :cond_d

    return-object v1

    :cond_d
    invoke-virtual {p0}, LAF;->k()Lyl;

    move-result-object p1

    iget-object p2, p0, LAF;->f:LLF;

    if-eqz p2, :cond_e

    iget-object p2, p2, LLF;->a:LHF;

    invoke-virtual {p2}, LHF;->i()Lyl;

    move-result-object v0

    :cond_e
    iget p2, p1, Lyl;->d:I

    if-eqz v0, :cond_f

    iget v0, v0, Lyl;->d:I

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_f
    iget v0, p1, Lyl;->a:I

    iget p1, p1, Lyl;->c:I

    invoke-static {v0, v2, p1, p2}, Lyl;->b(IIII)Lyl;

    move-result-object p1

    return-object p1

    :cond_10
    if-eqz p2, :cond_11

    invoke-direct {p0}, LAF;->w()Lyl;

    move-result-object p1

    iget p1, p1, Lyl;->b:I

    invoke-virtual {p0}, LAF;->k()Lyl;

    move-result-object p2

    iget p2, p2, Lyl;->b:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v2, p1, v2, v2}, Lyl;->b(IIII)Lyl;

    move-result-object p1

    return-object p1

    :cond_11
    iget p1, p0, LAF;->h:I

    and-int/lit8 p1, p1, 0x4

    if-eqz p1, :cond_12

    return-object v1

    :cond_12
    invoke-virtual {p0}, LAF;->k()Lyl;

    move-result-object p1

    iget p1, p1, Lyl;->b:I

    invoke-static {v2, p1, v2, v2}, Lyl;->b(IIII)Lyl;

    move-result-object p1

    return-object p1
.end method
