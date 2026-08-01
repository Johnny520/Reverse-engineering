.class final synthetic Ltop/suzhelan/qstory/ui/activity/SettingActivityKt$SettingRoute$1$2$1$5$3$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言世子哲楪兰苏/飘花落叶言子楪哲苏兰世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u696a\u5170\u82cf/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u54f2\u82cf\u5170\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x32
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 8

    .line 1
    const/16 v0, 0xb41

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v5

    .line 7
    const/16 v0, 0xb42

    .line 8
    .line 9
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v2, 0x2

    .line 15
    const-class v4, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪苏世兰哲;

    .line 16
    .line 17
    move-object v1, p0

    .line 18
    move-object v3, p1

    .line 19
    invoke-direct/range {v1 .. v7}, Lkotlin/jvm/internal/FunctionReferenceImpl;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 20
    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 112
    check-cast p1, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p0, p1, p2}, Ltop/suzhelan/qstory/ui/activity/SettingActivityKt$SettingRoute$1$2$1$5$3$1;->invoke(Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;Z)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;Z)V
    .locals 10

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Lkotlin/jvm/internal/CallableReference;->receiver:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪苏世兰哲;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/16 v0, 0xcb2

    .line 17
    .line 18
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    iget-object p1, p1, Llin/xposed/hook/view/main/itemview/info/ItemUiInfo;->item:L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;

    .line 22
    .line 23
    instance-of v0, p1, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    check-cast p1, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object p1, v1

    .line 32
    :goto_0
    if-nez p1, :cond_1

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_1
    invoke-static {}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪兰哲苏世()L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    instance-of v2, p1, L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;

    .line 40
    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    move-object v1, p1

    .line 44
    check-cast v1, L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;

    .line 45
    .line 46
    :cond_2
    if-eqz v1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v1, v0}, L飘花落叶言苏世楪兰子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪苏哲兰世(L飘花落叶言苏世子兰楪哲/飘花落叶言子楪世苏兰哲;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iput-object v0, p1, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-static {p1}, Llin/xposed/hook/loader/config/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;)V

    .line 62
    .line 63
    .line 64
    if-eqz p2, :cond_4

    .line 65
    .line 66
    :try_start_0
    invoke-virtual {p1}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;->startLoadHook()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :catch_0
    move-exception v0

    .line 71
    move-object p2, v0

    .line 72
    invoke-virtual {p1}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世哲苏兰;->getExceptionCollectionToolInstance()L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-virtual {p1, p2}, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    :cond_4
    :goto_1
    iget-object p0, p0, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 80
    .line 81
    :cond_5
    invoke-virtual {p0}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    move-object v0, p1

    .line 86
    check-cast v0, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世兰哲苏;

    .line 87
    .line 88
    iget p2, v0, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世哲兰苏:I

    .line 89
    .line 90
    add-int/lit8 v3, p2, 0x1

    .line 91
    .line 92
    const/4 v8, 0x0

    .line 93
    const/16 v9, 0x1f7

    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    const/4 v2, 0x0

    .line 97
    const/4 v4, 0x0

    .line 98
    const/4 v5, 0x0

    .line 99
    const/4 v6, 0x0

    .line 100
    const/4 v7, 0x0

    .line 101
    invoke-static/range {v0 .. v9}, L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世兰哲苏;Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;IIZLtop/suzhelan/qstory/ui/viewmodel/SettingPageTransitionDirection;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)L飘花落叶言苏哲楪世兰子/飘花落叶言子楪世兰哲苏;

    .line 102
    .line 103
    .line 104
    move-result-object p2

    .line 105
    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    if-eqz p1, :cond_5

    .line 110
    .line 111
    :goto_2
    return-void
.end method
