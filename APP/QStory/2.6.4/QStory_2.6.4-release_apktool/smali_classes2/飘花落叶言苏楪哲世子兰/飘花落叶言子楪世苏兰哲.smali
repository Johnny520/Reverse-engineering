.class public final L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏兰哲;
.super Ljava/lang/ClassLoader;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/ClassLoader;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;

    .line 5
    .line 6
    sget-object p1, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏哲兰;

    .line 7
    .line 8
    iput-object p1, p0, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final loadClass(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 1

    .line 1
    iget-object p2, p0, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏哲兰:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    :try_start_0
    const-string v0, "androidx.compose"

    .line 4
    .line 5
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const-string v0, "androidx.navigation"

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    const-string v0, "androidx.activity"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const-class v0, Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    return-object p0

    .line 39
    :cond_1
    :goto_0
    invoke-virtual {p2, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    return-object p0

    .line 44
    :catch_0
    :try_start_1
    const-string v0, "androidx.lifecycle.LifecycleOwner"

    .line 45
    .line 46
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_2

    .line 51
    .line 52
    const-string v0, "androidx.lifecycle.ReportFragment"

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    const-string v0, "androidx.lifecycle.ViewModelStoreOwner"

    .line 61
    .line 62
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_2

    .line 67
    .line 68
    const-string v0, "androidx.savedstate.SavedStateRegistryOwner"

    .line 69
    .line 70
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_3

    .line 75
    .line 76
    :cond_2
    iget-object p0, p0, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 77
    .line 78
    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 82
    return-object p0

    .line 83
    :catch_1
    :cond_3
    invoke-virtual {p2, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0
.end method
