.class public final Landroidx/appcompat/widget/飘花落叶言子哲兰世苏楪;
.super Landroidx/appcompat/widget/飘花落叶言子哲苏兰楪世;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/appcompat/widget/飘花落叶言子哲苏兰世楪;


# static fields
.field public static final 飘花落叶言子世兰苏楪哲:Ljava/lang/reflect/Method;


# instance fields
.field public 飘花落叶言子世兰楪哲苏:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1c

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    .line 7
    const-class v0, Landroid/widget/PopupWindow;

    .line 8
    .line 9
    const-string v1, "setTouchModal"

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    new-array v2, v2, [Ljava/lang/Class;

    .line 13
    .line 14
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    aput-object v3, v2, v4

    .line 18
    .line 19
    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Landroidx/appcompat/widget/飘花落叶言子哲兰世苏楪;->飘花落叶言子世兰苏楪哲:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    .line 24
    .line 25
    :cond_0
    return-void

    .line 26
    :catch_0
    const-string v0, "MenuPopupWindow"

    .line 27
    .line 28
    const-string v1, "Could not find method setTouchModal() on PopupWindow. Oh well."

    .line 29
    .line 30
    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪兰苏哲世(L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子哲兰世苏楪;->飘花落叶言子世兰楪哲苏:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪兰苏哲世(L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏兰哲世;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子楪哲世兰苏(Landroid/content/Context;Z)Landroidx/appcompat/widget/飘花落叶言子哲楪苏世兰;
    .locals 1

    .line 1
    new-instance v0, Landroidx/appcompat/widget/飘花落叶言子哲兰世楪苏;

    .line 2
    .line 3
    invoke-direct {v0, p1, p2}, Landroidx/appcompat/widget/飘花落叶言子哲兰世楪苏;-><init>(Landroid/content/Context;Z)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Landroidx/appcompat/widget/飘花落叶言子哲兰世楪苏;->setHoverListener(Landroidx/appcompat/widget/飘花落叶言子哲苏兰世楪;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final 飘花落叶言子楪哲苏世兰(L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;Landroid/view/MenuItem;)V
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/appcompat/widget/飘花落叶言子哲兰世苏楪;->飘花落叶言子世兰楪哲苏:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪兰哲苏世;->飘花落叶言子楪哲苏世兰(L飘花落叶言子楪苏兰世哲/飘花落叶言子楪苏哲兰世;Landroid/view/MenuItem;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
