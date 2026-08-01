.class public final synthetic L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏兰楪哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏兰楪哲;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏兰楪哲;

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
    iget v0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const-class v1, Landroid/widget/EditText;

    .line 4
    .line 5
    iget-object p0, p0, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏兰楪哲;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {v1, p1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroid/widget/EditText;

    .line 17
    .line 18
    const-class v1, Landroid/widget/Button;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-static {v2, v1}, L飘花落叶言世哲子苏楪兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Landroid/view/View;

    .line 33
    .line 34
    new-instance v1, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;

    .line 35
    .line 36
    const/4 v2, 0x1

    .line 37
    invoke-direct {v1, p0, v0, v2}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;-><init>(Ljava/lang/Object;Landroid/widget/EditText;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, v1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 41
    .line 42
    .line 43
    return-void

    .line 44
    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 45
    .line 46
    const/4 v0, 0x0

    .line 47
    aget-object p1, p1, v0

    .line 48
    .line 49
    invoke-static {p1}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    iput-object v1, v2, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 54
    .line 55
    new-array v1, v0, [Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {v2, p1, v1}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Landroid/widget/EditText;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-class v3, Landroid/view/View;

    .line 72
    .line 73
    iput-object v3, v2, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏哲世兰:Ljava/lang/Class;

    .line 74
    .line 75
    new-array v3, v0, [Ljava/lang/Object;

    .line 76
    .line 77
    invoke-virtual {v2, p1, v3}, L飘花落叶言苏楪哲世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Landroid/view/View;

    .line 82
    .line 83
    new-instance v2, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;

    .line 84
    .line 85
    invoke-direct {v2, p0, v1, v0}, L飘花落叶言世哲楪苏子兰/飘花落叶言子世苏哲兰楪;-><init>(Ljava/lang/Object;Landroid/widget/EditText;I)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1, v2}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
