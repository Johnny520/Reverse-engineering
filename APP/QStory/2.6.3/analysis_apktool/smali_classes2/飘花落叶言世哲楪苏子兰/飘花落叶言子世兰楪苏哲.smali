.class public final synthetic L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪苏哲;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;

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
    iget v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-class v1, Landroid/widget/ImageView;

    .line 4
    .line 5
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    new-instance v0, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 15
    .line 16
    const/16 v1, 0x10f

    .line 17
    .line 18
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-direct {v0, v1}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 26
    .line 27
    :cond_0
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;

    .line 28
    .line 29
    const/16 v0, 0x113

    .line 30
    .line 31
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {p0, v0}, L飘花落叶言世哲子兰苏楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Long;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    new-instance v0, Ljava/util/Date;

    .line 44
    .line 45
    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 53
    .line 54
    .line 55
    move-result-wide v2

    .line 56
    cmp-long p0, v0, v2

    .line 57
    .line 58
    if-gez p0, :cond_1

    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    :cond_1
    return-void

    .line 65
    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-static {v1, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    check-cast p1, Landroid/widget/ImageView;

    .line 72
    .line 73
    invoke-virtual {p0, p1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏哲兰世(Landroid/widget/ImageView;)V

    .line 74
    .line 75
    .line 76
    return-void

    .line 77
    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 78
    .line 79
    const/16 v0, 0x117

    .line 80
    .line 81
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v1, v0, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    check-cast p1, Landroid/widget/ImageView;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪苏哲兰世(Landroid/widget/ImageView;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
