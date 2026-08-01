.class public final Landroidx/lifecycle/ProcessLifecycleInitializer;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements L飘花落叶言子兰世苏楪哲/飘花落叶言子楪世苏兰哲;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u5170\u4e16\u82cf\u696a\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Landroidx/lifecycle/ProcessLifecycleInitializer;",
        "L\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u5170\u4e16\u82cf\u696a\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u82cf\u5170\u54f2;",
        "Landroidx/lifecycle/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u82cf\u54f2\u696a\u5170;",
        "<init>",
        "()V",
        "lifecycle-process"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Landroid/content/Context;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, L飘花落叶言子兰世苏楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰(Landroid/content/Context;)L飘花落叶言子兰世苏楪哲/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-class v0, Landroidx/lifecycle/ProcessLifecycleInitializer;

    .line 12
    .line 13
    iget-object p0, p0, L飘花落叶言子兰世苏楪哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲:Ljava/util/HashSet;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    if-eqz p0, :cond_1

    .line 20
    .line 21
    sget-object p0, Landroidx/lifecycle/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast p0, Landroid/app/Application;

    .line 39
    .line 40
    new-instance v0, Landroidx/lifecycle/飘花落叶言子世楪哲苏兰;

    .line 41
    .line 42
    invoke-direct {v0}, Landroidx/lifecycle/飘花落叶言子世楪哲苏兰;-><init>()V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 46
    .line 47
    .line 48
    :goto_0
    sget-object p0, Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰哲苏世:Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    new-instance v0, Landroid/os/Handler;

    .line 54
    .line 55
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v0, p0, Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰世哲苏:Landroid/os/Handler;

    .line 59
    .line 60
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;->飘花落叶言子楪兰苏世哲:Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;

    .line 61
    .line 62
    sget-object v1, Landroidx/lifecycle/Lifecycle$Event;->ON_CREATE:Landroidx/lifecycle/Lifecycle$Event;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    check-cast p1, Landroid/app/Application;

    .line 75
    .line 76
    new-instance v0, Landroidx/lifecycle/飘花落叶言子世兰哲苏楪;

    .line 77
    .line 78
    invoke-direct {v0, p0}, Landroidx/lifecycle/飘花落叶言子世兰哲苏楪;-><init>(Landroidx/lifecycle/飘花落叶言子苏楪世哲兰;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1, v0}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_1
    const-string p0, "ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name=\'androidx.lifecycle.ProcessLifecycleInitializer\'\n                   android:value=\'androidx.startup\' />\n               under InitializationProvider in your AndroidManifest.xml"

    .line 86
    .line 87
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏兰世哲(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 p0, 0x0

    .line 91
    return-object p0
.end method

.method public final 飘花落叶言子楪世苏哲兰()Ljava/util/List;
    .locals 0

    .line 1
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 2
    .line 3
    return-object p0
.end method
