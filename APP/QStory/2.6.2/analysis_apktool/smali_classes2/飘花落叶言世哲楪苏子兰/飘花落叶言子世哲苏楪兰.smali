.class public final synthetic L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲苏楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/widget/EditText;I)V
    .locals 0

    .line 10
    iput p3, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:I

    iput-object p2, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲兰世;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 7

    .line 1
    iget p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-wide v0, -0x36a51d10051405a7L    # -2.398353651201338E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const-wide v2, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/4 v4, 0x0

    .line 14
    const/4 v5, 0x1

    .line 15
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch p1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    check-cast p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲兰世;

    .line 21
    .line 22
    iget-object p0, p0, L飘花落叶言苏世兰楪子哲/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;

    .line 23
    .line 24
    invoke-virtual {p0}, L飘花落叶言苏世兰哲子楪/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰()V

    .line 25
    .line 26
    .line 27
    return v5

    .line 28
    :pswitch_0
    check-cast p0, Landroid/widget/EditText;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 45
    .line 46
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0, p1}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendCard(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 61
    .line 62
    .line 63
    move v4, v5

    .line 64
    :catch_0
    :cond_0
    return v4

    .line 65
    :pswitch_1
    check-cast p0, Landroid/widget/EditText;

    .line 66
    .line 67
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-nez v6, :cond_1

    .line 80
    .line 81
    :try_start_1
    new-instance v6, Lorg/json/JSONObject;

    .line 82
    .line 83
    invoke-direct {v6, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 84
    .line 85
    .line 86
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0, p1}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendCard(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    .line 100
    move v4, v5

    .line 101
    goto :goto_0

    .line 102
    :catch_1
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_1
    :goto_0
    return v4

    .line 110
    :pswitch_2
    check-cast p0, Landroid/widget/EditText;

    .line 111
    .line 112
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-nez v6, :cond_2

    .line 125
    .line 126
    :try_start_2
    new-instance v6, Lorg/json/JSONObject;

    .line 127
    .line 128
    invoke-direct {v6, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 129
    .line 130
    .line 131
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0, p1}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendCard(Ljava/lang/Object;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 143
    .line 144
    .line 145
    move v4, v5

    .line 146
    goto :goto_1

    .line 147
    :catch_2
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    invoke-static {p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    :cond_2
    :goto_1
    return v4

    .line 155
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
