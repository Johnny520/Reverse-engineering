.class public final synthetic L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/widget/EditText;I)V
    .locals 0

    .line 10
    iput p3, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:I

    iput-object p2, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏哲兰世;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 5

    .line 1
    iget p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/16 v0, 0xf2

    .line 4
    .line 5
    const-string v1, ""

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch p1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast p0, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏哲兰世;

    .line 15
    .line 16
    iget-object p0, p0, L飘花落叶言苏世兰子哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪兰世苏哲:L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;

    .line 17
    .line 18
    invoke-virtual {p0}, L飘花落叶言苏世兰楪哲子/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世哲苏兰()V

    .line 19
    .line 20
    .line 21
    return v3

    .line 22
    :pswitch_0
    check-cast p0, Landroid/widget/EditText;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-nez v0, :cond_0

    .line 37
    .line 38
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    .line 39
    .line 40
    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    .line 42
    .line 43
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-static {v0, p1}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendCard(Ljava/lang/Object;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    move v2, v3

    .line 54
    :catch_0
    :cond_0
    return v2

    .line 55
    :pswitch_1
    check-cast p0, Landroid/widget/EditText;

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-nez v4, :cond_1

    .line 70
    .line 71
    :try_start_1
    new-instance v4, Lorg/json/JSONObject;

    .line 72
    .line 73
    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    .line 74
    .line 75
    .line 76
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0, p1}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendCard(Ljava/lang/Object;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 84
    .line 85
    .line 86
    move v2, v3

    .line 87
    goto :goto_0

    .line 88
    :catch_1
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :cond_1
    :goto_0
    return v2

    .line 96
    :pswitch_2
    check-cast p0, Landroid/widget/EditText;

    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-nez v4, :cond_2

    .line 111
    .line 112
    :try_start_2
    new-instance v4, Lorg/json/JSONObject;

    .line 113
    .line 114
    invoke-direct {v4, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_2

    .line 115
    .line 116
    .line 117
    invoke-static {}, Llin/xposed/hook/util/qq/QQSessionUtils;->getCurrentContact()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v0, p1}, Llin/xposed/hook/util/qq/QQNTSendMsgUtils;->sendCard(Ljava/lang/Object;Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 125
    .line 126
    .line 127
    move v2, v3

    .line 128
    goto :goto_1

    .line 129
    :catch_2
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    invoke-static {p0}, L飘花落叶言世兰子苏楪哲/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    :cond_2
    :goto_1
    return v2

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
