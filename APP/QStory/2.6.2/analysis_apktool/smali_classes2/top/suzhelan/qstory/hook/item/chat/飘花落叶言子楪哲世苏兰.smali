.class public final Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世苏兰;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 7

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;

    .line 4
    .line 5
    const-wide v1, -0x36a582e4051405a7L    # -2.3628717282377578E45

    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    :try_start_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 29
    .line 30
    const-wide v0, -0x36a5b26b051405a7L    # -2.3463108660044496E45

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;)Landroid/widget/EditText;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏兰世哲()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 52
    .line 53
    .line 54
    :catch_0
    :cond_1
    :goto_0
    return-void

    .line 55
    :pswitch_0
    iget-object v0, p0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_2

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    :try_start_1
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    const-wide v1, -0x36a5b850051405a7L    # -2.3442569216377148E45

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    array-length v1, v0

    .line 86
    const/4 v2, 0x0

    .line 87
    :goto_1
    const/4 v3, 0x0

    .line 88
    if-ge v2, v1, :cond_4

    .line 89
    .line 90
    aget-object v4, v0, v2

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    const-class v6, Landroid/widget/EditText;

    .line 97
    .line 98
    invoke-static {v5, v6}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    if-eqz v5, :cond_3

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    move-object v4, v3

    .line 109
    :goto_2
    if-nez v4, :cond_5

    .line 110
    .line 111
    goto :goto_3

    .line 112
    :cond_5
    const/4 v0, 0x1

    .line 113
    invoke-virtual {v4, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 114
    .line 115
    .line 116
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 117
    .line 118
    invoke-virtual {v4, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    instance-of v0, p1, Landroid/widget/EditText;

    .line 123
    .line 124
    if-eqz v0, :cond_6

    .line 125
    .line 126
    move-object v3, p1

    .line 127
    check-cast v3, Landroid/widget/EditText;

    .line 128
    .line 129
    :cond_6
    if-eqz v3, :cond_7

    .line 130
    .line 131
    sget p1, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪哲兰苏世:I

    .line 132
    .line 133
    invoke-virtual {p0}, Ltop/suzhelan/qstory/hook/item/chat/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏兰世哲()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-virtual {v3, p0}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 138
    .line 139
    .line 140
    :catch_1
    :cond_7
    :goto_3
    return-void

    .line 141
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
