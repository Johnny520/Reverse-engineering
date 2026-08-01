.class final synthetic Ltop/suzhelan/qstory/ui/activity/SettingActivityKt$SettingRoute$1$2$1$5$2$1;
.super Lkotlin/jvm/internal/FunctionReferenceImpl;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements L飘花落叶言世子哲兰苏楪/飘花落叶言子楪苏兰哲世;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/FunctionReferenceImpl;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u4e16\u5b50\u54f2\u5170\u82cf\u696a/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u82cf\u5170\u54f2\u4e16;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;)V
    .locals 8

    .line 1
    const/16 v0, 0xbb1

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v5

    .line 7
    const/16 v0, 0xbb2

    .line 8
    .line 9
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v2, 0x1

    .line 15
    const-class v4, L飘花落叶言苏哲世兰楪子/飘花落叶言子楪苏世兰哲;

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
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 54
    check-cast p1, Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;

    invoke-virtual {p0, p1}, Ltop/suzhelan/qstory/ui/activity/SettingActivityKt$SettingRoute$1$2$1$5$2$1;->invoke(Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;)V

    sget-object p0, Lkotlin/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏哲兰:Lkotlin/飘花落叶言子楪兰苏哲世;

    return-object p0
.end method

.method public final invoke(Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;)V
    .locals 11

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u545c\u55b5\u55b5\u55b5\u545c\u55b5\u545c"

    .line 2
    .line 3
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/String;)Ljava/lang/String;

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
    check-cast p0, L飘花落叶言苏哲世兰楪子/飘花落叶言子楪苏世兰哲;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/16 v0, 0xd24

    .line 17
    .line 18
    invoke-static {v0}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    iget-object p0, p0, L飘花落叶言苏哲世兰楪子/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏兰哲:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 22
    .line 23
    :goto_0
    invoke-virtual {p0}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    move-object v1, v0

    .line 28
    check-cast v1, L飘花落叶言苏哲世兰楪子/飘花落叶言子楪世兰哲苏;

    .line 29
    .line 30
    sget-object v6, Ltop/suzhelan/qstory/ui/viewmodel/SettingPageTransitionDirection;->Forward:Ltop/suzhelan/qstory/ui/viewmodel/SettingPageTransitionDirection;

    .line 31
    .line 32
    const/4 v9, 0x0

    .line 33
    const/16 v10, 0x1d9

    .line 34
    .line 35
    const/4 v3, -0x1

    .line 36
    const/4 v4, 0x0

    .line 37
    const/4 v5, 0x0

    .line 38
    const/4 v7, 0x0

    .line 39
    const/4 v8, 0x0

    .line 40
    move-object v2, p1

    .line 41
    invoke-static/range {v1 .. v10}, L飘花落叶言苏哲世兰楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(L飘花落叶言苏哲世兰楪子/飘花落叶言子楪世兰哲苏;Llin/xposed/hook/view/main/itemview/info/DirectoryUiInfo;IIZLtop/suzhelan/qstory/ui/viewmodel/SettingPageTransitionDirection;Ljava/lang/String;Ljava/util/List;Ljava/util/List;I)L飘花落叶言苏哲世兰楪子/飘花落叶言子楪世兰哲苏;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p0, v0, p1}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪苏兰世哲(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    return-void

    .line 52
    :cond_0
    move-object p1, v2

    .line 53
    goto :goto_0
.end method
