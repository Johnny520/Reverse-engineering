.class public final synthetic Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;

    .line 5
    .line 6
    iput-object p2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    iget-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;

    .line 4
    .line 5
    iget-object v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const-wide v2, -0x36a5d115051405a7L    # -2.335625999683132E45

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0, v3, v2}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Ljava/lang/Boolean;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v0, v1

    .line 35
    :goto_0
    if-eqz v0, :cond_1

    .line 36
    .line 37
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 38
    .line 39
    .line 40
    move-result-wide v2

    .line 41
    iget-wide v4, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:J

    .line 42
    .line 43
    sub-long v4, v2, v4

    .line 44
    .line 45
    iget-wide v6, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世哲苏:J

    .line 46
    .line 47
    cmp-long v0, v4, v6

    .line 48
    .line 49
    if-lez v0, :cond_1

    .line 50
    .line 51
    iput-wide v2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:J

    .line 52
    .line 53
    return-void

    .line 54
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 55
    .line 56
    .line 57
    move-result-wide v2

    .line 58
    iput-wide v2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪兰世苏哲:J

    .line 59
    .line 60
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-wide v2, -0x36a50923051405a7L    # -2.4052967726159928E45

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    const/4 v3, 0x0

    .line 74
    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0, p1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    goto :goto_1

    .line 83
    :catch_0
    const-wide v2, -0x36a5b08d051405a7L    # -2.3469614858900024E45

    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    :try_start_1
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    const-class v2, Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v2, v0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :goto_1
    if-nez v0, :cond_2

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_2
    const-wide v2, -0x36a58db7051405a7L    # -2.359100038482806E45

    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 111
    .line 112
    invoke-static {v3, v2, v0}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    check-cast v0, Ljava/lang/Integer;

    .line 117
    .line 118
    if-eqz v0, :cond_3

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 121
    .line 122
    .line 123
    move-result v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 124
    :cond_3
    const/4 v0, 0x1

    .line 125
    if-ne v1, v0, :cond_4

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_4
    :try_start_2
    invoke-static {p0, p1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏兰哲世(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子世苏兰楪哲;Ljava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :catch_1
    :goto_2
    const-wide p0, -0x36a5dffb051405a7L    # -2.3304346518933863E45

    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    invoke-static {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 142
    .line 143
    .line 144
    goto :goto_3

    .line 145
    :catch_2
    move-exception p0

    .line 146
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 147
    .line 148
    .line 149
    :goto_3
    return-void
.end method
