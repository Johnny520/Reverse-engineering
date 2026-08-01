.class public final synthetic Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世苏楪兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世苏楪兰;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世苏楪兰;

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
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-wide v1, -0x36a5cb53051405a7L    # -2.337632304518498E45

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世苏楪兰;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 16
    .line 17
    aget-object v0, v0, v4

    .line 18
    .line 19
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 20
    .line 21
    if-eq v0, v1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-static {p0, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 39
    .line 40
    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 41
    .line 42
    aput-object p1, p0, v4

    .line 43
    .line 44
    :cond_1
    :goto_0
    return-void

    .line 45
    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 46
    .line 47
    const/4 v0, 0x1

    .line 48
    aget-object p1, p1, v0

    .line 49
    .line 50
    instance-of v0, p1, Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    move-object v3, p1

    .line 55
    check-cast v3, Ljava/lang/String;

    .line 56
    .line 57
    :cond_2
    if-nez v3, :cond_3

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {v3, p1, v4}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_4

    .line 69
    .line 70
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 71
    .line 72
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 73
    .line 74
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_4
    :goto_1
    return-void

    .line 78
    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 79
    .line 80
    aget-object p1, p1, v4

    .line 81
    .line 82
    instance-of v0, p1, Ljava/lang/String;

    .line 83
    .line 84
    if-eqz v0, :cond_5

    .line 85
    .line 86
    move-object v3, p1

    .line 87
    check-cast v3, Ljava/lang/String;

    .line 88
    .line 89
    :cond_5
    if-nez v3, :cond_6

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-static {v3, p1, v4}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子苏楪哲世兰(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    if-eqz p1, :cond_7

    .line 101
    .line 102
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 103
    .line 104
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 105
    .line 106
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    :cond_7
    :goto_2
    return-void

    .line 110
    :pswitch_2
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 111
    .line 112
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 113
    .line 114
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    return-void

    .line 118
    :pswitch_3
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世苏楪兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 119
    .line 120
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 121
    .line 122
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    nop

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
