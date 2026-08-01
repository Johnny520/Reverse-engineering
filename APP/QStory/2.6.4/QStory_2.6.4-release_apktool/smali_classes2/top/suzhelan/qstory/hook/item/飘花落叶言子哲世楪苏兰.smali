.class public final synthetic Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰苏哲;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;

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
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    const/16 v1, 0x8ae

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪苏兰;->飘花落叶言子楪哲兰世苏:Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object v0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 13
    .line 14
    aget-object v0, v0, v3

    .line 15
    .line 16
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 17
    .line 18
    if-eq v0, v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-static {p0, v0}, Lkotlin/jvm/internal/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_1

    .line 34
    .line 35
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 36
    .line 37
    sget-object p1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    .line 38
    .line 39
    aput-object p1, p0, v3

    .line 40
    .line 41
    :cond_1
    :goto_0
    return-void

    .line 42
    :pswitch_0
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 43
    .line 44
    const/4 v0, 0x1

    .line 45
    aget-object p1, p1, v0

    .line 46
    .line 47
    instance-of v0, p1, Ljava/lang/String;

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    move-object v2, p1

    .line 52
    check-cast v2, Ljava/lang/String;

    .line 53
    .line 54
    :cond_2
    if-nez v2, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-static {v2, p1, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世苏兰楪(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 68
    .line 69
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 70
    .line 71
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    :cond_4
    :goto_1
    return-void

    .line 75
    :pswitch_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 76
    .line 77
    aget-object p1, p1, v3

    .line 78
    .line 79
    instance-of v0, p1, Ljava/lang/String;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    move-object v2, p1

    .line 84
    check-cast v2, Ljava/lang/String;

    .line 85
    .line 86
    :cond_5
    if-nez v2, :cond_6

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_6
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-static {v2, p1, v3}, Lkotlin/text/飘花落叶言子楪哲苏世兰;->飘花落叶言子哲世苏兰楪(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_7

    .line 98
    .line 99
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 100
    .line 101
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    :cond_7
    :goto_2
    return-void

    .line 107
    :pswitch_2
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 108
    .line 109
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    return-void

    .line 115
    :pswitch_3
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲世楪兰苏;->飘花落叶言子楪哲兰世苏:Ljava/lang/ThreadLocal;

    .line 116
    .line 117
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    return-void

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
