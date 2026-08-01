.class public final synthetic Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:I

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;II)V
    .locals 0

    .line 12
    iput p3, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:I

    iput-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    iput p2, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲苏世兰;ILokhttp3/internal/http2/ErrorCode;)V
    .locals 0

    .line 1
    const/4 p3, 0x1

    .line 2
    iput p3, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:I

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;

    .line 9
    .line 10
    iget p0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:I

    .line 11
    .line 12
    if-ltz p0, :cond_1

    .line 13
    .line 14
    iget-object v1, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-ge p0, v1, :cond_1

    .line 21
    .line 22
    iget-object v1, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 23
    .line 24
    instance-of v2, v1, Ljava/util/ArrayList;

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    check-cast v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    .line 32
    .line 33
    iget-object v2, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 36
    .line 37
    .line 38
    iput-object v1, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 39
    .line 40
    :goto_0
    invoke-interface {v1, p0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    iget-object v1, v0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;

    .line 44
    .line 45
    const/4 v2, 0x1

    .line 46
    invoke-virtual {v1, p0, v2}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世兰哲苏(II)V

    .line 47
    .line 48
    .line 49
    iget-object p0, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 50
    .line 51
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    iget-object v0, v0, L飘花落叶言楪世兰子哲苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/List;

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const-string v1, "position: "

    .line 64
    .line 65
    const-string v2, ". size:"

    .line 66
    .line 67
    invoke-static {p0, v0, v1, v2}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏哲兰世(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-static {p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    const/4 p0, 0x0

    .line 75
    :goto_1
    return-object p0

    .line 76
    :pswitch_0
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲苏世兰;

    .line 79
    .line 80
    iget p0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:I

    .line 81
    .line 82
    iget-object v1, v0, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲苏世兰;->飘花落叶言子世楪苏兰哲:L飘花落叶言世兰苏子哲楪/飘花落叶言子世楪苏兰哲;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    monitor-enter v0

    .line 88
    :try_start_0
    iget-object v1, v0, L飘花落叶言世兰苏子哲楪/飘花落叶言子楪哲苏世兰;->飘花落叶言子世哲苏兰楪:Ljava/util/LinkedHashSet;

    .line 89
    .line 90
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-interface {v1, p0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    monitor-exit v0

    .line 98
    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 99
    .line 100
    return-object p0

    .line 101
    :catchall_0
    move-exception p0

    .line 102
    monitor-exit v0

    .line 103
    throw p0

    .line 104
    :pswitch_1
    iget-object v0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;

    .line 107
    .line 108
    iget p0, p0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏:I

    .line 109
    .line 110
    iget-object v0, v0, Landroidx/compose/foundation/text/selection/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;

    .line 113
    .line 114
    iget-object v0, v0, Landroidx/compose/ui/text/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;

    .line 115
    .line 116
    invoke-virtual {v0, p0}, Landroidx/compose/ui/text/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世哲兰苏(I)I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
