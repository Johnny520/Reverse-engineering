.class public final Landroidx/fragment/app/飘花落叶言子楪苏世兰哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/animation/Animation$AnimationListener;


# instance fields
.field public final synthetic 飘花落叶言子楪世哲兰苏:Landroidx/fragment/app/飘花落叶言子楪世哲兰苏;

.field public final synthetic 飘花落叶言子楪世哲苏兰:Landroid/view/View;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;

.field public final synthetic 飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;Landroid/view/View;Landroidx/fragment/app/飘花落叶言子楪世哲兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/fragment/app/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;

    .line 7
    .line 8
    iput-object p3, p0, Landroidx/fragment/app/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/view/View;

    .line 9
    .line 10
    iput-object p4, p0, Landroidx/fragment/app/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/fragment/app/飘花落叶言子楪世哲兰苏;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onAnimationEnd(Landroid/view/animation/Animation;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/fragment/app/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;

    .line 5
    .line 6
    iget-object v0, p1, Landroidx/fragment/app/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Landroid/view/ViewGroup;

    .line 7
    .line 8
    new-instance v1, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    iget-object v3, p0, Landroidx/fragment/app/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲苏兰:Landroid/view/View;

    .line 12
    .line 13
    iget-object v4, p0, Landroidx/fragment/app/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世哲兰苏:Landroidx/fragment/app/飘花落叶言子楪世哲兰苏;

    .line 14
    .line 15
    invoke-direct {v1, p1, v3, v4, v2}, Landroidx/fragment/app/飘花落叶言子楪苏世哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    const/4 p1, 0x2

    .line 22
    invoke-static {p1}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    new-instance p1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    const-string v0, "Animation from operation "

    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string p0, " has ended."

    .line 41
    .line 42
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-string p1, "FragmentManager"

    .line 50
    .line 51
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 52
    .line 53
    .line 54
    :cond_0
    return-void
.end method

.method public final onAnimationRepeat(Landroid/view/animation/Animation;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onAnimationStart(Landroid/view/animation/Animation;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x2

    .line 5
    invoke-static {p1}, Landroidx/fragment/app/飘花落叶言子世哲苏兰楪;->飘花落叶言子世苏哲兰楪(I)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance p1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v0, "Animation from operation "

    .line 14
    .line 15
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Landroidx/fragment/app/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Landroidx/fragment/app/飘花落叶言子苏楪兰世哲;

    .line 19
    .line 20
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p0, " has reached onAnimationStart."

    .line 24
    .line 25
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const-string p1, "FragmentManager"

    .line 33
    .line 34
    invoke-static {p1, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    :cond_0
    return-void
.end method
