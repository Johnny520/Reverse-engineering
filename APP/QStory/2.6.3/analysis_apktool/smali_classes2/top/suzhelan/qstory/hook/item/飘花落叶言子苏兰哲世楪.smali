.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰哲世楪;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪世苏兰;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪世苏兰;I)V
    .locals 0

    .line 1
    iput p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪世苏兰;

    .line 4
    .line 5
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 4

    .line 1
    iget v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏兰哲世楪;->飘花落叶言子楪世苏兰哲:Ltop/suzhelan/qstory/hook/item/飘花落叶言子哲楪世苏兰;

    .line 4
    .line 5
    const-string v1, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 25
    .line 26
    array-length p1, p0

    .line 27
    const/4 v0, 0x6

    .line 28
    if-le p1, v0, :cond_0

    .line 29
    .line 30
    const/4 p1, 0x0

    .line 31
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    aput-object p1, p0, v0

    .line 36
    .line 37
    :cond_0
    return-void

    .line 38
    :pswitch_0
    const-wide/16 v2, 0x0

    .line 39
    .line 40
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_1

    .line 57
    .line 58
    iget-object p0, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 59
    .line 60
    array-length p1, p0

    .line 61
    const/4 v1, 0x2

    .line 62
    if-le p1, v1, :cond_1

    .line 63
    .line 64
    const/4 p1, 0x1

    .line 65
    aput-object v0, p0, p1

    .line 66
    .line 67
    aput-object v0, p0, v1

    .line 68
    .line 69
    :cond_1
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
