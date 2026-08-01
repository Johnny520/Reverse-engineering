.class public final synthetic L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/16 v1, 0x49b

    .line 4
    .line 5
    const/16 v2, 0x4a0

    .line 6
    .line 7
    iget-object p0, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUinWait()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iget-object p0, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 17
    .line 18
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {p0, v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_0
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-virtual {p0, v3}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_1

    .line 62
    .line 63
    invoke-static {v4, v0}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-virtual {p0, v3, v0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :goto_1
    return-void

    .line 78
    :pswitch_0
    iget-object p0, p0, L飘花落叶言苏哲子兰世楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;

    .line 79
    .line 80
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    invoke-virtual {p0, v0}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_3
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    new-instance v3, Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0, v3, v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-eqz v3, :cond_4

    .line 116
    .line 117
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v3

    .line 121
    check-cast v3, Ljava/lang/String;

    .line 122
    .line 123
    invoke-static {}, Llin/xposed/hook/util/qq/QQEnvTool;->getCurrentUin()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-static {v3, v4}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/String;Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_4
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    new-instance v2, Ljava/util/ArrayList;

    .line 136
    .line 137
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v2, v1}, L飘花落叶言苏楪兰世哲子/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    :goto_3
    return-void

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
