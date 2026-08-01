.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏兰世哲;
.super Lde/robv/android/xposed/XC_MethodReplacement;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 3
    .line 4
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodReplacement;-><init>()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子世哲楪苏兰;)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 8
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodReplacement;-><init>()V

    return-void
.end method


# virtual methods
.method public final replaceHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 4
    .line 5
    invoke-static {v0}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 15
    .line 16
    return-object p0

    .line 17
    :pswitch_0
    const/4 p0, 0x0

    .line 18
    return-object p0

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
