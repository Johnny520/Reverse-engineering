.class public final Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪兰哲世;
.super Lde/robv/android/xposed/XC_MethodHook;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

.field public final synthetic 飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

.field public final synthetic 飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

.field public final synthetic 飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;


# direct methods
.method public constructor <init>(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;

    .line 2
    .line 3
    iput-object p2, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 4
    .line 5
    iput-object p3, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 6
    .line 7
    iput-object p4, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

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
    .locals 5

    .line 1
    const-string v0, "\u55b5\u55b5\u55b5\u55b5\u55b5\u55b5\u545c\u545c~\u55b5\u55b5\u55b5\u545c\u55b5\u545c\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u545c~\u55b5\u55b5\u55b5\u55b5\u545c\u55b5\u55b5\u55b5"

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
    iget-object v0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏哲兰:Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;

    .line 10
    .line 11
    iget-object v1, v0, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:Ljava/lang/Boolean;

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
    goto :goto_1

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
    const/16 v3, 0x670

    .line 26
    .line 27
    invoke-static {v3}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    check-cast v1, Landroid/view/View;

    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    iget-object v4, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世苏兰哲:Ljava/lang/Class;

    .line 42
    .line 43
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-nez v4, :cond_1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    iget-object p1, p1, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 51
    .line 52
    const/16 v4, 0x7d1

    .line 53
    .line 54
    invoke-static {v4}, L飘花落叶言楪世子苏哲兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世哲苏兰(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    iget-object v4, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲苏兰:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-static {v0, p1, v4}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;->飘花落叶言子楪苏哲兰世(Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏世楪哲兰;Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 66
    if-eqz p1, :cond_2

    .line 67
    .line 68
    iget-object p0, p0, Ltop/suzhelan/qstory/hook/item/飘花落叶言子苏楪兰哲世;->飘花落叶言子楪世哲兰苏:Ljava/lang/reflect/Method;

    .line 69
    .line 70
    if-eqz p0, :cond_2

    .line 71
    .line 72
    :goto_0
    const/16 v0, 0x14

    .line 73
    .line 74
    if-ge v2, v0, :cond_2

    .line 75
    .line 76
    :try_start_1
    filled-new-array {v3, v1}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {p0, p1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 81
    .line 82
    .line 83
    add-int/lit8 v2, v2, 0x1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :catch_0
    :cond_2
    :goto_1
    return-void
.end method
