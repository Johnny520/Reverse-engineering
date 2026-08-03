.class public LYue/ۥۡ۠ۦۨ;
.super LYue/ۥ۠ۧۢۤ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡ۠ۦۤ;


# annotations
.annotation build LYue/ۥۡۦۧ۠;
    value = {
        .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡ۠ۦۨ$ۥ۟۟;,
        LYue/ۥۡ۠ۦۨ$ۥ;,
        LYue/ۥۡ۠ۦۨ$ۥ۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟ۤۥ:Ljava/lang/String; = "MenuPopupWindow"

.field public static ۥ۟۟ۤۦ:Ljava/lang/reflect/Method;


# instance fields
.field public ۥ۟۟ۤۤ:LYue/ۥۡ۠ۦۤ;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_0

    const-class v0, Landroid/widget/PopupWindow;

    const-string v1, "setTouchModal"

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, LYue/ۥۡ۠ۦۨ;->ۥ۟۟ۤۦ:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string v0, "MenuPopupWindow"

    const-string v1, "Could not find method setTouchModal() on PopupWindow. Oh well."

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    :goto_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 0
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-direct {p0, p1, p2, p3, p4}, LYue/ۥ۠ۧۢۤ;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/MenuItem;)V
    .locals 1
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/MenuItem;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡ۠ۦۨ;->ۥ۟۟ۤۤ:LYue/ۥۡ۠ۦۤ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, LYue/ۥۡ۠ۦۤ;->ۥ۟۟(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/MenuItem;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۟۠(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/MenuItem;)V
    .locals 1
    .param p1    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/view/MenuItem;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۡ۠ۦۨ;->ۥ۟۟ۤۤ:LYue/ۥۡ۠ۦۤ;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1, p2}, LYue/ۥۡ۠ۦۤ;->ۥ۟۟۟۠(Landroidx/appcompat/view/menu/ۥ۟۟۟۟;Landroid/view/MenuItem;)V

    :cond_0
    return-void
.end method

.method public ۥ۟۟۠ۢ(Landroid/content/Context;Z)LYue/ۥ۠۠ۢ۠;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۡ۠ۦۨ$ۥ۟۟;

    invoke-direct {v0, p1, p2}, LYue/ۥۡ۠ۦۨ$ۥ۟۟;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {v0, p0}, LYue/ۥۡ۠ۦۨ$ۥ۟۟;->setHoverListener(LYue/ۥۡ۠ۦۤ;)V

    return-object v0
.end method

.method public ۥ۟۟ۤۥ(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۢۤ;->ۥۣ۟۟ۡ:Landroid/widget/PopupWindow;

    check-cast p1, Landroid/transition/Transition;

    invoke-static {v0, p1}, LYue/ۥۡ۠ۦۨ$ۥ;->ۥ(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    return-void
.end method

.method public ۥ۟۟ۤۦ(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۧۢۤ;->ۥۣ۟۟ۡ:Landroid/widget/PopupWindow;

    check-cast p1, Landroid/transition/Transition;

    invoke-static {v0, p1}, LYue/ۥۡ۠ۦۨ$ۥ;->ۥ۟(Landroid/widget/PopupWindow;Landroid/transition/Transition;)V

    return-void
.end method

.method public ۥ۟۟ۤۧ(LYue/ۥۡ۠ۦۤ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡ۠ۦۨ;->ۥ۟۟ۤۤ:LYue/ۥۡ۠ۦۤ;

    return-void
.end method

.method public ۥ۟۟ۤۨ(Z)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-gt v0, v1, :cond_0

    sget-object v0, LYue/ۥۡ۠ۦۨ;->ۥ۟۟ۤۦ:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_1

    :try_start_0
    iget-object v1, p0, LYue/ۥ۠ۧۢۤ;->ۥۣ۟۟ۡ:Landroid/widget/PopupWindow;

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const-string p1, "MenuPopupWindow"

    const-string v0, "Could not invoke setTouchModal() on PopupWindow. Oh well."

    invoke-static {p1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۧۢۤ;->ۥۣ۟۟ۡ:Landroid/widget/PopupWindow;

    invoke-static {v0, p1}, LYue/ۥۡ۠ۦۨ$ۥ۟;->ۥ(Landroid/widget/PopupWindow;Z)V

    :cond_1
    :goto_0
    return-void
.end method
