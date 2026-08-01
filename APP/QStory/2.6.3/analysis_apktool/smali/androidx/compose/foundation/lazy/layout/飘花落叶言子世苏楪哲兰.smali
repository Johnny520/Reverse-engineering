.class public final Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroidx/compose/ui/layout/飘花落叶言子苏世哲兰楪;


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Z

.field public 飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

.field public 飘花落叶言子楪世哲兰苏:I

.field public 飘花落叶言子楪世哲苏兰:I

.field public final 飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲楪兰;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

.field public final 飘花落叶言子楪苏世哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;


# direct methods
.method public constructor <init>(Ljava/lang/Object;Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲楪兰;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲楪兰;

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲苏兰:I

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    invoke-static {p1}, Landroidx/compose/runtime/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/Object;)Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iget v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 7
    .line 8
    if-lez v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    const-string v0, "Release should only be called once"

    .line 12
    .line 13
    invoke-static {v0}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 17
    .line 18
    add-int/lit8 v0, v0, -0x1

    .line 19
    .line 20
    iput v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 21
    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲楪兰;

    .line 25
    .line 26
    iget-object v0, v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->remove(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲()V

    .line 36
    .line 37
    .line 38
    :cond_2
    const/4 v0, 0x0

    .line 39
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 40
    .line 41
    :cond_3
    :goto_1
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰()Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰哲苏:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Pin should not be called on an already disposed item "

    .line 6
    .line 7
    invoke-static {v0}, L飘花落叶言子楪兰世哲苏/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 11
    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏兰哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲楪兰;

    .line 15
    .line 16
    iget-object v0, v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    iget-object v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪苏世哲兰:Landroidx/compose/runtime/飘花落叶言子苏楪兰世哲;

    .line 22
    .line 23
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;

    .line 24
    .line 25
    invoke-virtual {v0}, Landroidx/compose/runtime/飘花落叶言子哲苏兰世楪;->getValue()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Landroidx/compose/ui/layout/飘花落叶言子苏世哲兰楪;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    check-cast v0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世苏哲兰()Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    :goto_0
    iput-object v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世兰苏哲:Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;

    .line 41
    .line 42
    :cond_2
    iget v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 43
    .line 44
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    iput v0, p0, Landroidx/compose/foundation/lazy/layout/飘花落叶言子世苏楪哲兰;->飘花落叶言子楪世哲兰苏:I

    .line 47
    .line 48
    return-object p0
.end method
