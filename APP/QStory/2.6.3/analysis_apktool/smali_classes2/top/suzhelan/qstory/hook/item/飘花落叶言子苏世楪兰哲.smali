.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# instance fields
.field public final synthetic 飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

.field public final synthetic 飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;


# direct methods
.method public constructor <init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;

    .line 2
    .line 3
    iput-object p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p3, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 6
    .line 7
    iput-object p4, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

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
    iget-object v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;

    .line 10
    .line 11
    iget-object v1, v0, L飘花落叶言世哲兰苏子楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    :try_start_0
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    aget-object v1, v1, v2

    .line 24
    .line 25
    const/16 v2, 0x607

    .line 26
    .line 27
    invoke-static {v2}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v7, v1

    .line 34
    check-cast v7, Landroid/view/View;

    .line 35
    .line 36
    invoke-virtual {v7}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    if-eqz v6, :cond_2

    .line 41
    .line 42
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {v1, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-nez v1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 52
    .line 53
    const/16 v1, 0x763

    .line 54
    .line 55
    invoke-static {v1}, L飘花落叶言楪子兰苏世哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-static {v0, p1, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲兰世(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世哲楪兰;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    iget-object v4, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

    .line 70
    .line 71
    if-eqz v4, :cond_2

    .line 72
    .line 73
    :try_start_1
    new-instance p0, Ljava/lang/Thread;

    .line 74
    .line 75
    new-instance v3, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;

    .line 76
    .line 77
    const/4 v8, 0x0

    .line 78
    invoke-direct/range {v3 .. v8}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 85
    .line 86
    .line 87
    :catch_0
    :cond_2
    :goto_0
    return-void
.end method
