.class public final L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世哲苏兰;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/InjectHook;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/InjectHook;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/InjectHook;

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
    .locals 2

    .line 1
    iget v0, p0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object p0, p0, L飘花落叶言苏世子兰哲楪/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/InjectHook;

    .line 4
    .line 5
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 6
    .line 7
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    invoke-static {p0, p1}, Ltop/suzhelan/qstory/hook/InjectHook;->access$injectOnce(Ltop/suzhelan/qstory/hook/InjectHook;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 17
    .line 18
    .line 19
    return-void

    .line 20
    :pswitch_0
    invoke-static {p0, p1}, Ltop/suzhelan/qstory/hook/InjectHook;->access$injectOnce(Ltop/suzhelan/qstory/hook/InjectHook;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
