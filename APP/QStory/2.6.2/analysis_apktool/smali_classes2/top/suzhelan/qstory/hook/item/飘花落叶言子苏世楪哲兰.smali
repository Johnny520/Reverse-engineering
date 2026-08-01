.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public final synthetic 飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

.field public final synthetic 飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;


# direct methods
.method public constructor <init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;

    .line 2
    .line 3
    iput-object p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p3, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 6
    .line 7
    iput-object p4, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

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
    .locals 10

    .line 1
    const-wide v0, -0x36a582e4051405a7L    # -2.3628717282377578E45

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;

    .line 13
    .line 14
    iget-object v1, v0, L飘花落叶言世哲兰苏楪子/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    :try_start_0
    iget-object v1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    aget-object v1, v1, v2

    .line 27
    .line 28
    const-wide v2, -0x36a59389051405a7L    # -2.3570719555759574E45

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    invoke-static {v2, v3}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-object v8, v1

    .line 40
    check-cast v8, Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    if-eqz v7, :cond_2

    .line 47
    .line 48
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 49
    .line 50
    invoke-virtual {v1, v7}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 58
    .line 59
    const-wide v1, -0x36a5b26b051405a7L    # -2.3463108660044496E45

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    invoke-static {v1, v2}, Lcom/bumptech/glide/飘花落叶言子楪世哲兰苏;->飘花落叶言子世楪苏兰哲(J)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 71
    .line 72
    invoke-static {v0, p1, v1}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪苏哲兰世(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪兰哲;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    if-eqz v6, :cond_2

    .line 77
    .line 78
    iget-object v5, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

    .line 79
    .line 80
    if-eqz v5, :cond_2

    .line 81
    .line 82
    :try_start_1
    new-instance p0, Ljava/lang/Thread;

    .line 83
    .line 84
    new-instance v4, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪兰哲世;

    .line 85
    .line 86
    const/4 v9, 0x0

    .line 87
    invoke-direct/range {v4 .. v9}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪兰哲世;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 88
    .line 89
    .line 90
    invoke-direct {p0, v4}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 94
    .line 95
    .line 96
    :catch_0
    :cond_2
    :goto_0
    return-void
.end method
