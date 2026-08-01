.class public final synthetic L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏世哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏世哲;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏世哲;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏哲兰(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 5

    .line 1
    iget v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏世哲;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    aget-object v0, v0, v1

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 19
    .line 20
    const/4 v2, 0x1

    .line 21
    aget-object v1, v1, v2

    .line 22
    .line 23
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    const-wide v2, -0x36a50c82051405a7L    # -2.4041221178853817E45

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-wide v3, -0x36a507c2051405a7L    # -2.405777251318085E45

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v3, v4}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 49
    .line 50
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 51
    .line 52
    invoke-virtual {p0, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :pswitch_0
    iget v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:I

    .line 57
    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    check-cast p1, Ljava/util/List;

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_2

    .line 76
    .line 77
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    check-cast v0, Landroid/view/View;

    .line 82
    .line 83
    instance-of v1, v0, Landroid/widget/TextView;

    .line 84
    .line 85
    if-eqz v1, :cond_1

    .line 86
    .line 87
    check-cast v0, Landroid/widget/TextView;

    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    const-wide v2, -0x36a50c6f051405a7L    # -2.4041479793452677E45

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v1

    .line 110
    if-eqz v1, :cond_1

    .line 111
    .line 112
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 113
    .line 114
    .line 115
    move-result p1

    .line 116
    iput p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世:I

    .line 117
    .line 118
    :cond_2
    :goto_0
    return-void

    .line 119
    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 120
    .line 121
    const-class v0, Landroid/widget/ImageView;

    .line 122
    .line 123
    invoke-static {v0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    check-cast p1, Landroid/widget/ImageView;

    .line 128
    .line 129
    new-instance v0, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰苏世;

    .line 130
    .line 131
    invoke-direct {v0, p0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子楪哲兰苏世;-><init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子楪兰苏世哲;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    nop

    .line 139
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
