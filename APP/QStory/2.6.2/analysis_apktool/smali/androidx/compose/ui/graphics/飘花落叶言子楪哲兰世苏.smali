.class public final Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰世苏;
.super Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroidx/compose/ui/node/飘花落叶言子楪兰哲世苏;
.implements Landroidx/compose/ui/node/飘花落叶言子哲楪世苏兰;


# instance fields
.field public 飘花落叶言子世楪兰哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# direct methods
.method public constructor <init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroidx/compose/ui/飘花落叶言子楪哲苏世兰;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪兰哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "BlockGraphicsLayerModifier(block="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪兰哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final 飘花落叶言子哲世兰楪苏()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子哲楪世苏兰(Landroidx/compose/ui/semantics/飘花落叶言子楪兰哲世苏;)V
    .locals 4

    .line 1
    const/4 v0, 0x2

    .line 2
    invoke-static {p0, v0}, Landroidx/compose/ui/node/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪兰苏世哲(Landroidx/compose/ui/node/飘花落叶言子楪苏哲世兰;I)Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-boolean v1, v0, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子苏楪世哲兰:Z

    .line 7
    .line 8
    if-nez v1, :cond_2

    .line 9
    .line 10
    sget-object v1, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;

    .line 11
    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;

    .line 15
    .line 16
    invoke-direct {v1}, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;-><init>()V

    .line 17
    .line 18
    .line 19
    sput-object v1, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {v1}, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;->飘花落叶言子楪世苏哲兰()V

    .line 23
    .line 24
    .line 25
    :goto_0
    sget-object v1, Landroidx/compose/ui/graphics/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v2, v0, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子世苏楪哲兰:Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;

    .line 31
    .line 32
    iget-object v2, v2, Landroidx/compose/ui/node/飘花落叶言子世楪兰哲苏;->飘花落叶言子世哲兰楪苏:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 33
    .line 34
    iput-object v2, v1, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪兰哲:L飘花落叶言子苏哲世楪兰/飘花落叶言子楪世哲苏兰;

    .line 35
    .line 36
    iget-wide v2, v0, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰苏世:J

    .line 37
    .line 38
    invoke-static {v2, v3}, L飘花落叶言楪兰苏哲世子/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲楪苏兰(J)J

    .line 39
    .line 40
    .line 41
    move-result-wide v2

    .line 42
    iput-wide v2, v1, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;->飘花落叶言子世苏楪哲兰:J

    .line 43
    .line 44
    invoke-static {}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪世兰哲苏()Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    if-eqz v0, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世兰苏哲()L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    const/4 v2, 0x0

    .line 56
    :goto_1
    invoke-static {v0}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪苏哲兰世(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;)Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    :try_start_0
    iget-object p0, p0, Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰世苏;->飘花落叶言子世楪兰哲苏:L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;

    .line 61
    .line 62
    invoke-interface {p0, v1}, L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    invoke-static {v0, v3, v2}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲世苏兰(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, v1, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰苏哲:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;

    .line 69
    .line 70
    iget-boolean v0, v1, Landroidx/compose/ui/graphics/飘花落叶言子世哲兰楪苏;->飘花落叶言子世楪兰哲苏:Z

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    invoke-static {v0, v3, v2}, Landroidx/compose/runtime/snapshots/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲世苏兰(Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;Landroidx/compose/runtime/snapshots/飘花落叶言子楪苏世哲兰;L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)V

    .line 75
    .line 76
    .line 77
    throw p0

    .line 78
    :cond_2
    iget-object p0, v0, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子世兰哲楪苏:Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;

    .line 79
    .line 80
    iget-boolean v0, v0, Landroidx/compose/ui/node/飘花落叶言子苏世楪哲兰;->飘花落叶言子世兰哲苏楪:Z

    .line 81
    .line 82
    :goto_2
    if-nez v0, :cond_3

    .line 83
    .line 84
    return-void

    .line 85
    :cond_3
    invoke-static {p1, p0}, Landroidx/compose/ui/semantics/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世兰苏哲(Landroidx/compose/ui/semantics/飘花落叶言子楪兰哲世苏;Landroidx/compose/ui/graphics/飘花落叶言子世兰楪哲苏;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final 飘花落叶言子楪苏兰世哲(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;J)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;
    .locals 1

    .line 1
    invoke-interface {p2, p3, p4}, Landroidx/compose/ui/layout/飘花落叶言子世兰楪哲苏;->飘花落叶言子世楪苏哲兰(J)Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget p3, p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲苏兰世:I

    .line 6
    .line 7
    iget p4, p2, Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    new-instance v0, Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier$measure$1;

    .line 10
    .line 11
    invoke-direct {v0, p2, p0}, Landroidx/compose/ui/graphics/BlockGraphicsLayerModifier$measure$1;-><init>(Landroidx/compose/ui/layout/飘花落叶言子苏哲楪世兰;Landroidx/compose/ui/graphics/飘花落叶言子楪哲兰世苏;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p1, p3, p4, v0}, Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;->飘花落叶言子苏世兰哲楪(Landroidx/compose/ui/layout/飘花落叶言子世兰哲楪苏;IIL飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;)Landroidx/compose/ui/layout/飘花落叶言子世兰苏哲楪;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰哲世()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method
