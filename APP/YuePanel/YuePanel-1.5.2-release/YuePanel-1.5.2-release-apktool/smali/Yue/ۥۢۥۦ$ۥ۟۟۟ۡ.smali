.class public LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;
.super LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x14
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۥۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e1"
.end annotation


# static fields
.field public static ۥ۟۟۟ۢ:Z

.field public static ۥۣ۟۟۟:Ljava/lang/reflect/Method;

.field public static ۥ۟۟۟ۤ:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field

.field public static ۥ۟۟۟ۥ:Ljava/lang/reflect/Field;

.field public static ۥ۟۟۟ۦ:Ljava/lang/reflect/Field;


# instance fields
.field public final ۥ۟۟:Landroid/view/WindowInsets;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public ۥ۟۟۟:[LYue/ۥ۠ۥۣۡ;

.field public ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

.field public ۥ۟۟۟۠:LYue/ۥۢۥۦ;

.field public ۥ۟۟۟ۡ:LYue/ۥ۠ۥۣۡ;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(LYue/ۥۢۥۦ;LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;)V
    .locals 1
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 4
    new-instance v0, Landroid/view/WindowInsets;

    iget-object p2, p2, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-direct {v0, p2}, Landroid/view/WindowInsets;-><init>(Landroid/view/WindowInsets;)V

    invoke-direct {p0, p1, v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;-><init>(LYue/ۥۢۥۦ;Landroid/view/WindowInsets;)V

    return-void
.end method

.method public constructor <init>(LYue/ۥۢۥۦ;Landroid/view/WindowInsets;)V
    .locals 0
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/WindowInsets;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;-><init>(LYue/ۥۢۥۦ;)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    .line 3
    iput-object p2, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    return-void
.end method

.method private ۥ۟۟۠ۥ(IZ)LYue/ۥ۠ۥۣۡ;
    .locals 3
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    sget-object v0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    const/4 v1, 0x1

    :goto_0
    const/16 v2, 0x100

    if-gt v1, v2, :cond_1

    and-int v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1, p2}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۦ(IZ)LYue/ۥ۠ۥۣۡ;

    move-result-object v2

    invoke-static {v0, v2}, LYue/ۥ۠ۥۣۡ;->ۥ۟(LYue/ۥ۠ۥۣۡ;LYue/ۥ۠ۥۣۡ;)LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    :goto_1
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private ۥ۟۟۠ۧ()LYue/ۥ۠ۥۣۡ;
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:LYue/ۥۢۥۦ;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, LYue/ۥۢۥۦ;->ۥ۟۟۟ۧ()LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    return-object v0

    :cond_0
    sget-object v0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    return-object v0
.end method

.method private ۥ۟۟۠ۨ(Landroid/view/View;)LYue/ۥ۠ۥۣۡ;
    .locals 4
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const-string v0, "WindowInsetsCompat"

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-ge v1, v2, :cond_5

    sget-boolean v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۢ:Z

    if-nez v1, :cond_0

    invoke-static {}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟ۡ۟()V

    :cond_0
    sget-object v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥۣ۟۟۟:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    sget-object v3, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:Ljava/lang/Class;

    if-eqz v3, :cond_4

    sget-object v3, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۥ:Ljava/lang/reflect/Field;

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    :try_start_0
    invoke-virtual {v1, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden"

    new-instance v1, Ljava/lang/NullPointerException;

    invoke-direct {v1}, Ljava/lang/NullPointerException;-><init>()V

    invoke-static {v0, p1, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-object v2

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_2
    sget-object v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ:Ljava/lang/reflect/Field;

    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۥ:Ljava/lang/reflect/Field;

    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Rect;

    if-eqz p1, :cond_3

    invoke-static {p1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟(Landroid/graphics/Rect;)LYue/ۥ۠ۥۣۡ;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    return-object v2

    :goto_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to get visible insets. (Reflection error). "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_4
    :goto_1
    return-object v2

    :cond_5
    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead."

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static ۥ۟۟ۡ۟()V
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

    sput-object v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥۣ۟۟۟:Ljava/lang/reflect/Method;

    const-string v1, "android.view.View$AttachInfo"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    sput-object v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۤ:Ljava/lang/Class;

    const-string v2, "mVisibleInsets"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۥ:Ljava/lang/reflect/Field;

    const-string v1, "android.view.ViewRootImpl"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-string v2, "mAttachInfo"

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v1

    sput-object v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ:Ljava/lang/reflect/Field;

    sget-object v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۥ:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    sget-object v1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ:Ljava/lang/reflect/Field;

    invoke-virtual {v1, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Failed to get visible insets. (Reflection error). "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const-string v3, "WindowInsetsCompat"

    invoke-static {v3, v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    sput-boolean v0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۢ:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    invoke-super {p0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥۣۡ;

    iget-object p1, p1, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥۣۡ;

    invoke-static {v0, p1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟(Landroid/view/View;)V
    .locals 0
    .param p1    # Landroid/view/View;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۨ(Landroid/view/View;)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    if-nez p1, :cond_0

    sget-object p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۢ(LYue/ۥ۠ۥۣۡ;)V

    return-void
.end method

.method public ۥ۟۟۟۟(LYue/ۥۢۥۦ;)V
    .locals 1
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:LYue/ۥۢۥۦ;

    invoke-virtual {p1, v0}, LYue/ۥۢۥۦ;->ۥ۟۟ۡۦ(LYue/ۥۢۥۦ;)V

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥۣۡ;

    invoke-virtual {p1, v0}, LYue/ۥۢۥۦ;->ۥ۟۟ۡۥ(LYue/ۥ۠ۥۣۡ;)V

    return-void
.end method

.method public ۥ۟۟۟ۡ(I)LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ(IZ)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۢ(I)LYue/ۥ۠ۥۣۡ;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۥ(IZ)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1
.end method

.method public final ۥ۟۟۟ۦ()LYue/ۥ۠ۥۣۡ;
    .locals 4
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    if-nez v0, :cond_0

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->getSystemWindowInsetLeft()I

    move-result v0

    iget-object v1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-virtual {v1}, Landroid/view/WindowInsets;->getSystemWindowInsetTop()I

    move-result v1

    iget-object v2, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-virtual {v2}, Landroid/view/WindowInsets;->getSystemWindowInsetRight()I

    move-result v2

    iget-object v3, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-virtual {v3}, Landroid/view/WindowInsets;->getSystemWindowInsetBottom()I

    move-result v3

    invoke-static {v0, v1, v2, v3}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟(IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    :cond_0
    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    return-object v0
.end method

.method public ۥ۟۟۟ۨ(IIII)LYue/ۥۢۥۦ;
    .locals 2
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۢۥۦ$ۥ۟;

    iget-object v1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-static {v1}, LYue/ۥۢۥۦ;->ۥ۟۟ۢ(Landroid/view/WindowInsets;)LYue/ۥۢۥۦ;

    move-result-object v1

    invoke-direct {v0, v1}, LYue/ۥۢۥۦ$ۥ۟;-><init>(LYue/ۥۢۥۦ;)V

    invoke-virtual {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ()LYue/ۥ۠ۥۣۡ;

    move-result-object v1

    invoke-static {v1, p1, p2, p3, p4}, LYue/ۥۢۥۦ;->ۥ۟۟ۡ(LYue/ۥ۠ۥۣۡ;IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۢۥۦ$ۥ۟;->ۥ۟۟۟ۢ(LYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ$ۥ۟;

    invoke-virtual {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۤ()LYue/ۥ۠ۥۣۡ;

    move-result-object v1

    invoke-static {v1, p1, p2, p3, p4}, LYue/ۥۢۥۦ;->ۥ۟۟ۡ(LYue/ۥ۠ۥۣۡ;IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۢۥۦ$ۥ۟;->ۥ۟۟۟۠(LYue/ۥ۠ۥۣۡ;)LYue/ۥۢۥۦ$ۥ۟;

    invoke-virtual {v0}, LYue/ۥۢۥۦ$ۥ۟;->ۥ()LYue/ۥۢۥۦ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠۟()Z
    .locals 1

    iget-object v0, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟:Landroid/view/WindowInsets;

    invoke-virtual {v0}, Landroid/view/WindowInsets;->isRound()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۠۠(I)Z
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "WrongConstant"
        }
    .end annotation

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    const/16 v2, 0x100

    if-gt v1, v2, :cond_2

    and-int v2, p1, v1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {p0, v1}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟ۡ(I)Z

    move-result v2

    if-nez v2, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_1
    shl-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return v0
.end method

.method public ۥ۟۟۠ۡ([LYue/ۥ۠ۥۣۡ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟:[LYue/ۥ۠ۥۣۡ;

    return-void
.end method

.method public ۥ۟۟۠ۢ(LYue/ۥ۠ۥۣۡ;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۥۣۡ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥۣۡ;

    return-void
.end method

.method public ۥۣ۟۟۠(LYue/ۥۢۥۦ;)V
    .locals 0
    .param p1    # LYue/ۥۢۥۦ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:LYue/ۥۢۥۦ;

    return-void
.end method

.method public ۥ۟۟۠ۦ(IZ)LYue/ۥ۠ۥۣۡ;
    .locals 4
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eq p1, v0, :cond_f

    const/4 v0, 0x2

    const/4 v2, 0x0

    if-eq p1, v0, :cond_b

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

    sget-object p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    return-object p1

    :cond_0
    iget-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:LYue/ۥۢۥۦ;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, LYue/ۥۢۥۦ;->ۥ۟۟۟۟()LYue/ۥۣ۠۟۠;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟۠()LYue/ۥۣ۠۟۠;

    move-result-object p1

    :goto_0
    if-eqz p1, :cond_2

    invoke-virtual {p1}, LYue/ۥۣ۠۟۠;->ۥ۟۟۟()I

    move-result p2

    invoke-virtual {p1}, LYue/ۥۣ۠۟۠;->ۥ۟۟۟۠()I

    move-result v0

    invoke-virtual {p1}, LYue/ۥۣ۠۟۠;->ۥ۟۟۟۟()I

    move-result v1

    invoke-virtual {p1}, LYue/ۥۣ۠۟۠;->ۥ۟۟()I

    move-result p1

    invoke-static {p2, v0, v1, p1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟(IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    return-object p1

    :cond_3
    invoke-virtual {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۧ()LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥۣ۟۟۟()LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-virtual {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۥ()LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1

    :cond_6
    iget-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟:[LYue/ۥ۠ۥۣۡ;

    if-eqz p1, :cond_7

    invoke-static {p2}, LYue/ۥۢۥۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟۟(I)I

    move-result p2

    aget-object v2, p1, p2

    :cond_7
    if-eqz v2, :cond_8

    return-object v2

    :cond_8
    invoke-virtual {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ()LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    invoke-direct {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۧ()LYue/ۥ۠ۥۣۡ;

    move-result-object p2

    iget p1, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    iget v0, p2, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    if-le p1, v0, :cond_9

    invoke-static {v1, v1, v1, p1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟(IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1

    :cond_9
    iget-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥۣۡ;

    if-eqz p1, :cond_a

    sget-object v0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    invoke-virtual {p1, v0}, LYue/ۥ۠ۥۣۡ;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    iget-object p1, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۡ:LYue/ۥ۠ۥۣۡ;

    iget p1, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    iget p2, p2, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    if-le p1, p2, :cond_a

    invoke-static {v1, v1, v1, p1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟(IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1

    :cond_a
    sget-object p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    return-object p1

    :cond_b
    if-eqz p2, :cond_c

    invoke-direct {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۧ()LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    invoke-virtual {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۦ;->ۥ۟۟۟ۤ()LYue/ۥ۠ۥۣۡ;

    move-result-object p2

    iget v0, p1, LYue/ۥ۠ۥۣۡ;->ۥ:I

    iget v2, p2, LYue/ۥ۠ۥۣۡ;->ۥ:I

    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v2, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    iget v3, p2, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget p1, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    iget p2, p2, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, v1, v2, p1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟(IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1

    :cond_c
    invoke-virtual {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ()LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    iget-object p2, p0, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟۠:LYue/ۥۢۥۦ;

    if-eqz p2, :cond_d

    invoke-virtual {p2}, LYue/ۥۢۥۦ;->ۥ۟۟۟ۧ()LYue/ۥ۠ۥۣۡ;

    move-result-object v2

    :cond_d
    iget p2, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    if-eqz v2, :cond_e

    iget v0, v2, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟:I

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result p2

    :cond_e
    iget v0, p1, LYue/ۥ۠ۥۣۡ;->ۥ:I

    iget p1, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟۟:I

    invoke-static {v0, v1, p1, p2}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟(IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1

    :cond_f
    if-eqz p2, :cond_10

    invoke-direct {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۧ()LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    iget p1, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    invoke-virtual {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ()LYue/ۥ۠ۥۣۡ;

    move-result-object p2

    iget p2, p2, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v1, p1, v1, v1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟(IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1

    :cond_10
    invoke-virtual {p0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۟ۦ()LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    iget p1, p1, LYue/ۥ۠ۥۣۡ;->ۥ۟:I

    invoke-static {v1, p1, v1, v1}, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟(IIII)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟ۡ(I)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p1, v1, :cond_1

    const/4 v2, 0x2

    if-eq p1, v2, :cond_1

    const/4 v2, 0x4

    if-eq p1, v2, :cond_0

    const/16 v2, 0x8

    if-eq p1, v2, :cond_1

    const/16 v2, 0x80

    if-eq p1, v2, :cond_1

    return v1

    :cond_0
    return v0

    :cond_1
    invoke-virtual {p0, p1, v0}, LYue/ۥۢۥۦ$ۥ۟۟۟ۡ;->ۥ۟۟۠ۦ(IZ)LYue/ۥ۠ۥۣۡ;

    move-result-object p1

    sget-object v0, LYue/ۥ۠ۥۣۡ;->ۥ۟۟۟۟:LYue/ۥ۠ۥۣۡ;

    invoke-virtual {p1, v0}, LYue/ۥ۠ۥۣۡ;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v1

    return p1
.end method
