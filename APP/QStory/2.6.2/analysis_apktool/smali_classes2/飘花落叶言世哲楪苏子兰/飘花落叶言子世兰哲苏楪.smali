.class public final synthetic L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰哲苏楪;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;

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
    .locals 4

    .line 1
    iget v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-class v1, Landroid/widget/ImageView;

    .line 4
    .line 5
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    const-wide v1, -0x36a519c5051405a7L    # -2.3995010833425953E45

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-direct {v0, v1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 29
    .line 30
    :cond_0
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 31
    .line 32
    const-wide v0, -0x36a51994051405a7L    # -2.399567778686512E45

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0, v0}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    check-cast p0, Ljava/lang/Long;

    .line 46
    .line 47
    if-eqz p0, :cond_1

    .line 48
    .line 49
    new-instance v0, Ljava/util/Date;

    .line 50
    .line 51
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 55
    .line 56
    .line 57
    move-result-wide v0

    .line 58
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 59
    .line 60
    .line 61
    move-result-wide v2

    .line 62
    cmp-long p0, v0, v2

    .line 63
    .line 64
    if-gez p0, :cond_1

    .line 65
    .line 66
    const/4 p0, 0x0

    .line 67
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    :cond_1
    return-void

    .line 71
    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 72
    .line 73
    invoke-static {v1, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, Landroid/widget/ImageView;

    .line 78
    .line 79
    invoke-virtual {p0, p1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲兰世(Landroid/widget/ImageView;)V

    .line 80
    .line 81
    .line 82
    return-void

    .line 83
    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 84
    .line 85
    const-wide v2, -0x36a5196e051405a7L    # -2.3996195016062838E45

    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-static {v1, v0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    check-cast p1, Landroid/widget/ImageView;

    .line 99
    .line 100
    invoke-virtual {p0, p1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪苏哲兰世(Landroid/widget/ImageView;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
