.class public abstract Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;
.super Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;
.implements Landroidx/compose/ui/node/飘花落叶言子苏兰世楪哲;
.implements Landroidx/compose/ui/node/飘花落叶言子楪苏世兰哲;


# instance fields
.field public 飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/node/飘花落叶言子楪哲世兰苏;

.field public 飘花落叶言子世苏楪兰哲:Z

.field public 飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏哲兰;Landroidx/compose/ui/node/飘花落叶言子楪哲世兰苏;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/node/飘花落叶言子楪哲世兰苏;

    .line 5
    .line 6
    iput-object p1, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子世苏楪兰哲()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子兰楪世哲苏()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子世苏楪哲兰(Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V
    .locals 1

    .line 1
    sget-object p3, Landroidx/compose/ui/input/pointer/PointerEventPass;->Main:Landroidx/compose/ui/input/pointer/PointerEventPass;

    .line 2
    .line 3
    if-ne p2, p3, :cond_2

    .line 4
    .line 5
    iget-object p2, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 8
    .line 9
    .line 10
    move-result p3

    .line 11
    const/4 p4, 0x0

    .line 12
    :goto_0
    if-ge p4, p3, :cond_2

    .line 13
    .line 14
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;

    .line 19
    .line 20
    iget v0, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏哲世兰:I

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子兰楪世苏哲(I)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iget p1, p1, Landroidx/compose/ui/input/pointer/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏:I

    .line 29
    .line 30
    const/4 p2, 0x4

    .line 31
    if-ne p1, p2, :cond_0

    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    iput-boolean p1, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲:Z

    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子哲兰苏世楪()V

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :cond_0
    const/4 p2, 0x5

    .line 41
    if-ne p1, p2, :cond_2

    .line 42
    .line 43
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子兰楪世哲苏()V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    add-int/lit8 p4, p4, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    return-void
.end method

.method public final 飘花落叶言子兰楪世哲苏()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪兰哲:Z

    .line 7
    .line 8
    iget-boolean v0, p0, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪兰苏哲:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 13
    .line 14
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 15
    .line 16
    .line 17
    new-instance v1, Landroidx/compose/ui/input/pointer/HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1;

    .line 18
    .line 19
    invoke-direct {v1, v0}, Landroidx/compose/ui/input/pointer/HoverIconModifierNode$displayIconFromAncestorNodeWithCursorInBoundsOrDefaultIcon$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p0, v1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪哲苏兰(Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 23
    .line 24
    .line 25
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    invoke-virtual {v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子哲兰世苏楪()V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_0
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p0, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子哲兰苏楪世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲世兰苏;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    return-void
.end method

.method public abstract 飘花落叶言子兰楪世苏哲(I)Z
.end method

.method public final 飘花落叶言子哲兰世苏楪()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/Ref$ObjectRef;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$ObjectRef;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Landroidx/compose/ui/input/pointer/HoverIconModifierNode$findOverridingAncestorNode$1;

    .line 7
    .line 8
    invoke-direct {v1, v0}, Landroidx/compose/ui/input/pointer/HoverIconModifierNode$findOverridingAncestorNode$1;-><init>(Lkotlin/jvm/internal/Ref$ObjectRef;)V

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪哲苏兰(Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, v0, Lkotlin/jvm/internal/Ref$ObjectRef;->element:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object v0, v0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏哲兰;

    .line 21
    .line 22
    if-nez v0, :cond_1

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏哲兰;

    .line 25
    .line 26
    :cond_1
    invoke-virtual {p0, v0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子哲兰苏楪世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲世兰苏;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final 飘花落叶言子哲兰苏世楪()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/jvm/internal/Ref$BooleanRef;

    .line 2
    .line 3
    invoke-direct {v0}, Lkotlin/jvm/internal/Ref$BooleanRef;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 8
    .line 9
    new-instance v1, Landroidx/compose/ui/input/pointer/HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1;

    .line 10
    .line 11
    invoke-direct {v1, v0}, Landroidx/compose/ui/input/pointer/HoverIconModifierNode$displayIconIfDescendantsDoNotHavePriority$1;-><init>(Lkotlin/jvm/internal/Ref$BooleanRef;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v1}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子世楪兰苏哲(Landroidx/compose/ui/node/飘花落叶言子哲楪苏兰世;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 15
    .line 16
    .line 17
    iget-boolean v0, v0, Lkotlin/jvm/internal/Ref$BooleanRef;->element:Z

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子哲兰世苏楪()V

    .line 22
    .line 23
    .line 24
    :cond_0
    return-void
.end method

.method public abstract 飘花落叶言子哲兰苏楪世(Landroidx/compose/ui/input/pointer/飘花落叶言子楪哲世兰苏;)V
.end method

.method public final 飘花落叶言子哲苏世楪兰()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子兰楪世哲苏()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final 飘花落叶言子楪哲兰世苏()J
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/ui/input/pointer/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰哲苏:Landroidx/compose/ui/node/飘花落叶言子楪哲世兰苏;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰哲世苏(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;)Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p0, p0, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲兰楪苏:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    sget v0, Landroidx/compose/ui/node/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪世苏兰哲:I

    .line 12
    .line 13
    const/high16 v0, 0x41200000    # 10.0f

    .line 14
    .line 15
    invoke-interface {p0, v0}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏哲兰楪世(F)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/high16 v2, 0x42200000    # 40.0f

    .line 20
    .line 21
    invoke-interface {p0, v2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏哲兰楪世(F)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    invoke-interface {p0, v0}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏哲兰楪世(F)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-interface {p0, v2}, L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子苏哲兰楪世(F)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    invoke-static {v1, v3, v0, p0}, Landroidx/compose/ui/node/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪苏世兰哲(IIII)J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    return-wide v0

    .line 38
    :cond_0
    sget-wide v0, Landroidx/compose/ui/node/飘花落叶言子哲楪苏世兰;->飘花落叶言子楪世苏哲兰:J

    .line 39
    .line 40
    return-wide v0
.end method
