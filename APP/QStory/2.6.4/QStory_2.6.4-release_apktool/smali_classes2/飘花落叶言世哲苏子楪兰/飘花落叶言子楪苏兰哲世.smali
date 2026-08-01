.class public final synthetic L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏兰哲世;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲苏兰世;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲苏兰世;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲苏兰世;

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
    iget v0, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰世苏:L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲苏兰世;

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
    const/16 v2, 0x6a

    .line 28
    .line 29
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, ""

    .line 34
    .line 35
    invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰世苏:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    .line 40
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 41
    .line 42
    invoke-virtual {p0, p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_0
    iget v0, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:I

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Ljava/util/List;

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_2

    .line 66
    .line 67
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Landroid/view/View;

    .line 72
    .line 73
    instance-of v1, v0, Landroid/widget/TextView;

    .line 74
    .line 75
    if-eqz v1, :cond_1

    .line 76
    .line 77
    check-cast v0, Landroid/widget/TextView;

    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    const-string v2, "\u545c\u55b5\u55b5\u545c\u55b5\u545c\u545c\u55b5~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u545c~\u545c\u545c\u55b5\u545c\u545c\u55b5\u545c\u55b5~\u545c\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c~\u545c\u545c\u545c\u545c\u545c\u545c\u55b5\u55b5~\u545c\u545c\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 88
    .line 89
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v2

    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_1

    .line 98
    .line 99
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    iput p1, p0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:I

    .line 104
    .line 105
    :cond_2
    :goto_0
    return-void

    .line 106
    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 107
    .line 108
    const-class v0, Landroid/widget/ImageView;

    .line 109
    .line 110
    invoke-static {v0, p1}, L飘花落叶言世哲楪子苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰苏哲(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Landroid/widget/ImageView;

    .line 115
    .line 116
    new-instance v0, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲世苏兰;

    .line 117
    .line 118
    invoke-direct {v0, p0}, L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲世苏兰;-><init>(L飘花落叶言世哲苏子楪兰/飘花落叶言子楪哲苏兰世;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 122
    .line 123
    .line 124
    return-void

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
