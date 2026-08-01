.class public abstract L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-class v1, L飘花落叶言子兰楪哲苏世/飘花落叶言子楪世兰哲苏;

    .line 3
    .line 4
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-string v2, "androidx.compose.ui.platform.AndroidCompositionLocals_androidKt"

    .line 12
    .line 13
    const-string v3, "getLocalSavedStateRegistryOwner"

    .line 14
    .line 15
    invoke-virtual {v1, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, v3, v0}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/reflect/AccessibleObject;->getAnnotations()[Ljava/lang/annotation/Annotation;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    array-length v3, v2

    .line 31
    const/4 v4, 0x0

    .line 32
    :goto_0
    if-ge v4, v3, :cond_2

    .line 33
    .line 34
    aget-object v5, v2, v4

    .line 35
    .line 36
    instance-of v5, v5, Lkotlin/飘花落叶言子楪世哲兰苏;

    .line 37
    .line 38
    if-eqz v5, :cond_1

    .line 39
    .line 40
    :cond_0
    move-object v1, v0

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v1, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    instance-of v2, v1, Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;

    .line 52
    .line 53
    if-eqz v2, :cond_0

    .line 54
    .line 55
    check-cast v1, Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;

    .line 56
    .line 57
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    goto :goto_3

    .line 62
    :goto_2
    invoke-static {v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :goto_3
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_3

    .line 71
    .line 72
    goto :goto_4

    .line 73
    :cond_3
    move-object v0, v1

    .line 74
    :goto_4
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;

    .line 75
    .line 76
    if-nez v0, :cond_4

    .line 77
    .line 78
    new-instance v0, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;

    .line 79
    .line 80
    const/16 v1, 0x8

    .line 81
    .line 82
    invoke-direct {v0, v1}, L飘花落叶言世苏兰哲楪子/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 83
    .line 84
    .line 85
    new-instance v1, Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 86
    .line 87
    invoke-direct {v1, v0}, Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 88
    .line 89
    .line 90
    move-object v0, v1

    .line 91
    :cond_4
    sput-object v0, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;

    .line 92
    .line 93
    return-void
.end method
