.class public final synthetic Landroidx/compose/foundation/selection/飘花落叶言子楪世哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Z

.field public final synthetic 飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Landroidx/compose/foundation/selection/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/compose/foundation/selection/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Landroidx/compose/foundation/selection/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/Object;I)V
    .locals 0

    .line 11
    iput p3, p0, Landroidx/compose/foundation/selection/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    iput-boolean p1, p0, Landroidx/compose/foundation/selection/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Z

    iput-object p2, p0, Landroidx/compose/foundation/selection/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Landroidx/compose/foundation/selection/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sget-object v2, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    .line 5
    .line 6
    iget-object v3, p0, Landroidx/compose/foundation/selection/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:Ljava/lang/Object;

    .line 7
    .line 8
    iget-boolean p0, p0, Landroidx/compose/foundation/selection/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Z

    .line 9
    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v3, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;

    .line 14
    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    invoke-interface {v3}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪世苏哲兰;->invoke()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_0
    return-object v2

    .line 21
    :pswitch_0
    check-cast v3, Landroidx/room/coroutines/飘花落叶言子楪世兰苏哲;

    .line 22
    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    const-string p0, "reader"

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const-string p0, "writer"

    .line 29
    .line 30
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    .line 35
    new-instance v4, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v5, "Timed out attempting to acquire a "

    .line 38
    .line 39
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string p0, " connection."

    .line 46
    .line 47
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p0, "\n\nWriter pool:\n"

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    iget-object p0, v3, Landroidx/room/coroutines/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/StringBuilder;)V

    .line 65
    .line 66
    .line 67
    const-string p0, "Reader pool:"

    .line 68
    .line 69
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const/16 p0, 0xa

    .line 73
    .line 74
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    iget-object p0, v3, Landroidx/room/coroutines/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏兰世:Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;

    .line 78
    .line 79
    invoke-virtual {p0, v0}, Landroidx/room/coroutines/飘花落叶言子楪哲苏世兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/StringBuilder;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    const/4 v0, 0x5

    .line 87
    :try_start_0
    invoke-static {v0, p0}, L飘花落叶言世哲苏楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子苏世楪兰哲(ILjava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 p0, 0x0

    .line 91
    throw p0
    :try_end_0
    .catch Landroid/database/SQLException; {:try_start_0 .. :try_end_0} :catch_0

    .line 92
    :catch_0
    move-exception p0

    .line 93
    iget v0, v3, Landroidx/room/coroutines/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰苏哲世:I

    .line 94
    .line 95
    if-eq v0, v1, :cond_3

    .line 96
    .line 97
    const/4 v1, 0x2

    .line 98
    if-eq v0, v1, :cond_2

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 102
    .line 103
    .line 104
    :goto_1
    return-object v2

    .line 105
    :cond_3
    throw p0

    .line 106
    :pswitch_1
    check-cast v3, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世哲苏兰;

    .line 107
    .line 108
    if-eqz p0, :cond_4

    .line 109
    .line 110
    invoke-virtual {v3}, Landroidx/compose/foundation/text/input/internal/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏哲世兰()Lkotlinx/coroutines/flow/飘花落叶言子哲苏世兰楪;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-eqz p0, :cond_4

    .line 115
    .line 116
    check-cast p0, Lkotlinx/coroutines/flow/飘花落叶言子哲兰苏楪世;

    .line 117
    .line 118
    invoke-virtual {p0, v2}, Lkotlinx/coroutines/flow/飘花落叶言子哲兰苏楪世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    :cond_4
    return-object v2

    .line 122
    :pswitch_2
    check-cast v3, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;

    .line 123
    .line 124
    xor-int/2addr p0, v1

    .line 125
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    invoke-interface {v3, p0}, L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    return-object v2

    .line 133
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
