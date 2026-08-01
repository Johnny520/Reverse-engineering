.class public abstract Landroidx/lifecycle/compose/飘花落叶言子楪世哲兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-class v1, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;

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
    const-string v3, "getLocalLifecycleOwner"

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
    array-length v3, v2

    .line 28
    const/4 v4, 0x0

    .line 29
    :goto_0
    if-ge v4, v3, :cond_2

    .line 30
    .line 31
    aget-object v5, v2, v4

    .line 32
    .line 33
    instance-of v5, v5, Lkotlin/飘花落叶言子楪世哲兰苏;

    .line 34
    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    :cond_0
    move-object v1, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v1

    .line 43
    goto :goto_2

    .line 44
    :cond_2
    invoke-virtual {v1, v0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    instance-of v2, v1, Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    check-cast v1, Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;

    .line 53
    .line 54
    :goto_1
    invoke-static {v1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    goto :goto_3

    .line 59
    :goto_2
    invoke-static {v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪苏哲世兰(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    :goto_3
    invoke-static {v1}, Lkotlin/Result;->isFailure-impl(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_3

    .line 68
    .line 69
    goto :goto_4

    .line 70
    :cond_3
    move-object v0, v1

    .line 71
    :goto_4
    check-cast v0, Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;

    .line 72
    .line 73
    if-nez v0, :cond_4

    .line 74
    .line 75
    new-instance v0, Landroidx/activity/compose/飘花落叶言子楪苏哲世兰;

    .line 76
    .line 77
    const/16 v1, 0x1c

    .line 78
    .line 79
    invoke-direct {v0, v1}, Landroidx/activity/compose/飘花落叶言子楪苏哲世兰;-><init>(I)V

    .line 80
    .line 81
    .line 82
    new-instance v1, Landroidx/compose/runtime/飘花落叶言子哲兰世苏楪;

    .line 83
    .line 84
    invoke-direct {v1, v0}, Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;-><init>(L飘花落叶言世子哲楪兰苏/飘花落叶言子楪世苏哲兰;)V

    .line 85
    .line 86
    .line 87
    move-object v0, v1

    .line 88
    :cond_4
    sput-object v0, Landroidx/lifecycle/compose/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Landroidx/compose/runtime/飘花落叶言子苏哲兰楪世;

    .line 89
    .line 90
    return-void
.end method
