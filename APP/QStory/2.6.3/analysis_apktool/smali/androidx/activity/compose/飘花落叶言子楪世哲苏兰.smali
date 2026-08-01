.class public final synthetic Landroidx/activity/compose/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪苏兰哲世;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Z

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;IZ)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/compose/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/activity/compose/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p3, p0, Landroidx/activity/compose/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/activity/compose/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-boolean v1, p0, Landroidx/activity/compose/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Z

    .line 4
    .line 5
    iget-object p0, p0, Landroidx/activity/compose/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    check-cast p1, Ljava/lang/Byte;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Byte;->byteValue()B

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    sget-object v2, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/Set;

    .line 19
    .line 20
    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_2

    .line 25
    .line 26
    sget-object v2, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-eqz p1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    if-eqz v1, :cond_1

    .line 36
    .line 37
    const/16 p1, 0x20

    .line 38
    .line 39
    if-ne v0, p1, :cond_1

    .line 40
    .line 41
    const/16 p1, 0x2b

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    invoke-static {v0}, L飘花落叶言楪兰世哲子苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(B)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_2
    :goto_0
    int-to-char p1, v0

    .line 56
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    :goto_1
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_0
    check-cast p0, Landroidx/activity/compose/飘花落叶言子楪苏哲兰世;

    .line 63
    .line 64
    check-cast p1, Landroidx/lifecycle/compose/飘花落叶言子楪世哲苏兰;

    .line 65
    .line 66
    iget-object v0, p0, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 67
    .line 68
    check-cast v0, Landroidx/activity/飘花落叶言子世哲苏兰楪;

    .line 69
    .line 70
    invoke-virtual {v0, v1}, Landroidx/activity/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世兰哲苏(Z)V

    .line 71
    .line 72
    .line 73
    iget-object v0, p0, Landroidx/appcompat/app/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, L飘花落叶言子楪世哲苏兰/飘花落叶言子楪世苏哲兰;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪苏哲世兰(Z)V

    .line 78
    .line 79
    .line 80
    new-instance v0, Landroidx/activity/compose/飘花落叶言子楪世兰哲苏;

    .line 81
    .line 82
    invoke-direct {v0, p1, p0}, Landroidx/activity/compose/飘花落叶言子楪世兰哲苏;-><init>(Landroidx/lifecycle/compose/飘花落叶言子楪世哲苏兰;Landroidx/activity/compose/飘花落叶言子楪苏哲兰世;)V

    .line 83
    .line 84
    .line 85
    return-object v0

    .line 86
    nop

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
