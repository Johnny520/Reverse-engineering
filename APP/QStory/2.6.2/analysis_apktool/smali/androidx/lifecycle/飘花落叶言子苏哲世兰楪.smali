.class public final Landroidx/lifecycle/飘花落叶言子苏哲世兰楪;
.super Landroidx/lifecycle/飘花落叶言子苏哲兰世楪;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世哲兰苏:L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

.field public static 飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/飘花落叶言子苏哲世兰楪;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Landroid/app/Application;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    const/16 v1, 0x9

    .line 4
    .line 5
    invoke-direct {v0, v1}, L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;-><init>(I)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Landroidx/lifecycle/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Landroid/app/Application;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/lifecycle/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:Landroid/app/Application;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;
    .locals 2

    .line 1
    const-string p0, "Cannot create an instance of "

    .line 2
    .line 3
    const-class v0, Landroidx/lifecycle/飘花落叶言子楪世苏哲兰;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    :try_start_0
    const-class v1, Landroid/app/Application;

    .line 13
    .line 14
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    invoke-virtual {v1, p2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    check-cast p2, Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    return-object p2

    .line 36
    :catch_0
    move-exception p2

    .line 37
    goto :goto_0

    .line 38
    :catch_1
    move-exception p2

    .line 39
    goto :goto_1

    .line 40
    :catch_2
    move-exception p2

    .line 41
    goto :goto_2

    .line 42
    :catch_3
    move-exception p2

    .line 43
    goto :goto_3

    .line 44
    :goto_0
    invoke-static {p1, p0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-static {p0, p2}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    :goto_1
    invoke-static {p1, p0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-static {p0, p2}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    return-object v0

    .line 60
    :goto_2
    invoke-static {p1, p0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0, p2}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-object v0

    .line 68
    :goto_3
    invoke-static {p1, p0}, L飘花落叶言苏楪世子兰哲/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-static {p0, p2}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_0
    invoke-static {p1}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/Class;L飘花落叶言子哲兰苏世楪/飘花落叶言子楪世哲苏兰;)Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:Landroid/app/Application;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Landroidx/lifecycle/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    sget-object v0, Landroidx/lifecycle/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏:L飘花落叶言楪苏兰世子哲/飘花落叶言子楪世兰哲苏;

    .line 11
    .line 12
    iget-object p2, p2, L飘花落叶言子哲兰苏世楪/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    check-cast p2, Landroid/app/Application;

    .line 19
    .line 20
    if-eqz p2, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0, p1, p2}, Landroidx/lifecycle/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    const-class p0, Landroidx/lifecycle/飘花落叶言子楪世苏哲兰;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-nez p0, :cond_2

    .line 34
    .line 35
    invoke-static {p1}, L飘花落叶言楪兰子苏哲世/飘花落叶言子楪哲世兰苏;->飘花落叶言子楪苏世哲兰(Ljava/lang/Class;)Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_2
    const-string p0, "CreationExtras must have an application by `APPLICATION_KEY`"

    .line 41
    .line 42
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Ljava/lang/Class;)Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世苏兰哲:Landroid/app/Application;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, v0}, Landroidx/lifecycle/飘花落叶言子苏哲世兰楪;->飘花落叶言子楪世哲兰苏(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    const-string p0, "AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras)."

    .line 11
    .line 12
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method
