.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 3

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;

    .line 4
    .line 5
    const-string v2, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :pswitch_0
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-object p0, v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 30
    .line 31
    const/4 p1, 0x0

    .line 32
    aget-object p0, p0, p1

    .line 33
    .line 34
    :try_start_0
    invoke-static {p0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲(Ljava/lang/Object;)L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const/16 v1, 0x804

    .line 39
    .line 40
    invoke-static {v1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iput-object v1, v0, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:Ljava/lang/String;

    .line 45
    .line 46
    new-array p1, p1, [Ljava/lang/Object;

    .line 47
    .line 48
    invoke-virtual {v0, p0, p1}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 49
    .line 50
    .line 51
    :catch_0
    :goto_0
    return-void

    .line 52
    :pswitch_1
    invoke-static {v2}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object p0, v1, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-nez p0, :cond_1

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 68
    .line 69
    :try_start_1
    const-string p1, "\u55b5\u55b5\u545c\u545c\u545c\u55b5\u545c\u55b5"

    .line 70
    .line 71
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 76
    .line 77
    invoke-static {p0, p1, v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 78
    .line 79
    .line 80
    :catch_1
    :try_start_2
    const-string p1, "\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c\u55b5"

    .line 81
    .line 82
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 87
    .line 88
    invoke-static {p0, p1, v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 89
    .line 90
    .line 91
    :catch_2
    :try_start_3
    const-string p1, "\u55b5\u55b5\u545c\u545c\u55b5\u545c\u545c\u545c"

    .line 92
    .line 93
    invoke-static {p1}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 98
    .line 99
    invoke-static {p0, p1, v0}, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 100
    .line 101
    .line 102
    :catch_3
    :goto_1
    return-void

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 1

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lde/robv/android/xposed/XC_MethodHook;->beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 11
    .line 12
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪世兰哲;

    .line 19
    .line 20
    iget-object p0, p0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 p0, 0x0

    .line 30
    invoke-virtual {p1, p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method
