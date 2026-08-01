.class public final Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;
.super Landroidx/core/view/飘花落叶言子苏哲世楪兰;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;
.implements Landroidx/core/view/飘花落叶言子世楪苏兰哲;
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public 飘花落叶言子楪兰世哲苏:Z

.field public 飘花落叶言子楪兰世苏哲:Z

.field public 飘花落叶言子楪兰苏世哲:Landroidx/core/view/飘花落叶言子哲兰世苏楪;

.field public final 飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;


# direct methods
.method public constructor <init>(Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    xor-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    invoke-direct {p0, v0}, Landroidx/core/view/飘花落叶言子苏哲世楪兰;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final run()V
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 7
    .line 8
    iput-boolean v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世哲苏:Z

    .line 9
    .line 10
    iget-object v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;

    .line 15
    .line 16
    iget-object v2, v1, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/layout/飘花落叶言子哲世苏楪兰;

    .line 17
    .line 18
    const/16 v3, 0x8

    .line 19
    .line 20
    iget-object v4, v0, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子哲苏兰世楪;

    .line 21
    .line 22
    invoke-virtual {v4, v3}, Landroidx/core/view/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-static {v3}, Landroidx/compose/foundation/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏(L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;)Landroidx/compose/foundation/layout/飘花落叶言子苏楪兰世哲;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    invoke-virtual {v2, v3}, Landroidx/compose/foundation/layout/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世兰哲苏(Landroidx/compose/foundation/layout/飘花落叶言子苏楪兰世哲;)V

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;Landroidx/core/view/飘花落叶言子哲兰世苏楪;)V

    .line 34
    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    iput-object v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 38
    .line 39
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子苏哲世兰楪(Landroidx/core/view/飘花落叶言子哲兰世苏楪;Ljava/util/List;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;
    .locals 0

    .line 1
    iget-object p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;

    .line 2
    .line 3
    invoke-static {p0, p1}, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;Landroidx/core/view/飘花落叶言子哲兰世苏楪;)V

    .line 4
    .line 5
    .line 6
    iget-boolean p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪兰世苏哲:Z

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    sget-object p0, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    return-object p1
.end method

.method public final 飘花落叶言子苏哲世楪兰(Landroidx/core/view/飘花落叶言子苏兰哲世楪;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 3
    .line 4
    iput-boolean p1, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世哲苏:Z

    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子苏哲兰楪世(Landroidx/core/view/飘花落叶言子苏兰哲世楪;Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;)Landroidx/appcompat/app/飘花落叶言子世楪苏兰哲;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 3
    .line 4
    return-object p2
.end method

.method public final 飘花落叶言子苏哲楪世兰(Landroidx/core/view/飘花落叶言子苏兰哲世楪;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 3
    .line 4
    iput-boolean v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世哲苏:Z

    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 7
    .line 8
    iget-object p1, p1, Landroidx/core/view/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子苏兰哲楪世;

    .line 9
    .line 10
    invoke-virtual {p1}, Landroidx/core/view/飘花落叶言子苏兰哲楪世;->飘花落叶言子楪世苏兰哲()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    const-wide/16 v3, 0x0

    .line 15
    .line 16
    cmp-long p1, v1, v3

    .line 17
    .line 18
    if-lez p1, :cond_0

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    iget-object p1, v0, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子哲苏兰世楪;

    .line 23
    .line 24
    iget-object v1, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;

    .line 25
    .line 26
    iget-object v2, v1, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/layout/飘花落叶言子哲世苏楪兰;

    .line 27
    .line 28
    const/16 v3, 0x8

    .line 29
    .line 30
    invoke-virtual {p1, v3}, Landroidx/core/view/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-static {v4}, Landroidx/compose/foundation/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏(L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;)Landroidx/compose/foundation/layout/飘花落叶言子苏楪兰世哲;

    .line 35
    .line 36
    .line 37
    move-result-object v4

    .line 38
    invoke-virtual {v2, v4}, Landroidx/compose/foundation/layout/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世兰哲苏(Landroidx/compose/foundation/layout/飘花落叶言子苏楪兰世哲;)V

    .line 39
    .line 40
    .line 41
    iget-object v2, v1, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/layout/飘花落叶言子哲世苏楪兰;

    .line 42
    .line 43
    invoke-virtual {p1, v3}, Landroidx/core/view/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-static {p1}, Landroidx/compose/foundation/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏(L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;)Landroidx/compose/foundation/layout/飘花落叶言子苏楪兰世哲;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {v2, p1}, Landroidx/compose/foundation/layout/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世兰哲苏(Landroidx/compose/foundation/layout/飘花落叶言子苏楪兰世哲;)V

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;Landroidx/core/view/飘花落叶言子哲兰世苏楪;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    const/4 p1, 0x0

    .line 58
    iput-object p1, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 59
    .line 60
    return-void
.end method

.method public final 飘花落叶言子苏哲楪兰世(Landroid/view/View;Landroidx/core/view/飘花落叶言子哲兰世苏楪;)Landroidx/core/view/飘花落叶言子哲兰世苏楪;
    .locals 5

    .line 1
    iput-object p2, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 2
    .line 3
    iget-object v0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪哲兰世苏:Landroidx/compose/foundation/layout/飘花落叶言子哲世苏楪兰;

    .line 6
    .line 7
    iget-object v2, p2, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏哲兰:Landroidx/core/view/飘花落叶言子哲苏兰世楪;

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Landroidx/core/view/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-static {v4}, Landroidx/compose/foundation/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏(L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;)Landroidx/compose/foundation/layout/飘花落叶言子苏楪兰世哲;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v1, v4}, Landroidx/compose/foundation/layout/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世兰哲苏(Landroidx/compose/foundation/layout/飘花落叶言子苏楪兰世哲;)V

    .line 20
    .line 21
    .line 22
    iget-boolean v1, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世苏哲:Z

    .line 23
    .line 24
    if-eqz v1, :cond_0

    .line 25
    .line 26
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 27
    .line 28
    const/16 v2, 0x1e

    .line 29
    .line 30
    if-ne v1, v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-boolean p0, p0, Landroidx/compose/foundation/layout/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世哲苏:Z

    .line 37
    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    iget-object p0, v0, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪哲兰苏世:Landroidx/compose/foundation/layout/飘花落叶言子哲世苏楪兰;

    .line 41
    .line 42
    invoke-virtual {v2, v3}, Landroidx/core/view/飘花落叶言子哲苏兰世楪;->飘花落叶言子楪苏哲世兰(I)L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-static {p1}, Landroidx/compose/foundation/layout/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰世哲苏(L飘花落叶言子哲楪苏世兰/飘花落叶言子楪世哲苏兰;)Landroidx/compose/foundation/layout/飘花落叶言子苏楪兰世哲;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {p0, p1}, Landroidx/compose/foundation/layout/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪世兰哲苏(Landroidx/compose/foundation/layout/飘花落叶言子苏楪兰世哲;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪世苏兰哲(Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;Landroidx/core/view/飘花落叶言子哲兰世苏楪;)V

    .line 54
    .line 55
    .line 56
    :cond_1
    :goto_0
    iget-boolean p0, v0, Landroidx/compose/foundation/layout/飘花落叶言子哲苏楪世兰;->飘花落叶言子楪兰世苏哲:Z

    .line 57
    .line 58
    if-eqz p0, :cond_2

    .line 59
    .line 60
    sget-object p0, Landroidx/core/view/飘花落叶言子哲兰世苏楪;->飘花落叶言子楪世苏兰哲:Landroidx/core/view/飘花落叶言子哲兰世苏楪;

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_2
    return-object p2
.end method
