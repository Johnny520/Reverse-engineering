.class public final synthetic Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/core/os/飘花落叶言子楪世兰苏哲;
.implements L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 2
    .line 3
    iput-object p2, p0, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p4, p0, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public onCancel()V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/view/View;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Landroidx/fragment/app/飘花落叶言子楪世哲兰苏;

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/view/View;->clearAnimation()V

    .line 18
    .line 19
    .line 20
    iget-object v1, v1, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲兰苏()V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x2

    .line 29
    invoke-static {v0}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "Animation from operation "

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, " has been cancelled."

    .line 46
    .line 47
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    const-string v0, "FragmentManager"

    .line 55
    .line 56
    invoke-static {v0, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    :cond_0
    return-void
.end method

.method public 飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲楪兰苏;

    .line 4
    .line 5
    iget-object v1, p0, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Ljava/lang/Class;

    .line 8
    .line 9
    iget-object v2, p0, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, Ljava/lang/reflect/Method;

    .line 12
    .line 13
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ljava/lang/reflect/Method;

    .line 16
    .line 17
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 18
    .line 19
    invoke-static {v1, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    new-instance v1, Landroid/os/Handler;

    .line 24
    .line 25
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-direct {v1, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 30
    .line 31
    .line 32
    new-instance v3, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;

    .line 33
    .line 34
    invoke-direct {v3, v0, v2, p1, p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲楪兰苏;Ljava/lang/reflect/Method;Ljava/lang/Object;Ljava/lang/reflect/Method;)V

    .line 35
    .line 36
    .line 37
    const-wide/16 p0, 0x4b0

    .line 38
    .line 39
    invoke-virtual {v1, v3, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 40
    .line 41
    .line 42
    return-void
.end method
