.class public abstract Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final 飘花落叶言子楪苏哲兰世:Ljava/lang/Object;


# instance fields
.field public volatile 飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

.field public volatile 飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

.field public 飘花落叶言子楪世哲兰苏:Z

.field public 飘花落叶言子楪世哲苏兰:I

.field public final 飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;

.field public final 飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

.field public 飘花落叶言子楪苏世兰哲:Z

.field public 飘花落叶言子楪苏世哲兰:I

.field public 飘花落叶言子楪苏哲世兰:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    invoke-direct {v0}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput v0, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世哲苏兰:I

    .line 20
    .line 21
    sget-object v0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲兰世:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object v0, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰哲苏:Ljava/lang/Object;

    .line 24
    .line 25
    iput-object v0, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 26
    .line 27
    const/4 v0, -0x1

    .line 28
    iput v0, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世哲兰:I

    .line 29
    .line 30
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, L飘花落叶言子楪苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲楪兰苏()L飘花落叶言子楪苏兰哲世/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, L飘花落叶言子楪苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子楪苏兰哲世/飘花落叶言子楪世哲苏兰;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string v0, "Cannot invoke "

    .line 26
    .line 27
    const-string v1, " on a background thread"

    .line 28
    .line 29
    invoke-static {v0, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲苏兰(Landroidx/lifecycle/飘花落叶言子世兰楪苏哲;)V
    .locals 3

    .line 1
    const-string v0, "observeForever"

    .line 2
    .line 3
    invoke-static {v0}, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;

    .line 7
    .line 8
    invoke-direct {v0, p0, p1}, Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;-><init>(Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;Landroidx/lifecycle/飘花落叶言子世兰楪苏哲;)V

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    iget-object p0, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 24
    .line 25
    invoke-direct {v1, p1, v0}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget p1, p0, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:I

    .line 29
    .line 30
    add-int/2addr p1, v2

    .line 31
    iput p1, p0, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:I

    .line 32
    .line 33
    iget-object p1, p0, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 34
    .line 35
    if-nez p1, :cond_1

    .line 36
    .line 37
    iput-object v1, p0, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 38
    .line 39
    iput-object v1, p0, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    iput-object v1, p1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 43
    .line 44
    iput-object p1, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 45
    .line 46
    iput-object v1, p0, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 47
    .line 48
    :goto_0
    const/4 p0, 0x0

    .line 49
    :goto_1
    check-cast p0, Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;

    .line 50
    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    invoke-virtual {v0, v2}, Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰(Z)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public final 飘花落叶言子楪世苏兰哲(Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;)V
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世兰哲:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iput-boolean v1, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲世兰:Z

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iput-boolean v1, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世兰哲:Z

    .line 10
    .line 11
    :cond_1
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲世兰:Z

    .line 13
    .line 14
    if-eqz p1, :cond_4

    .line 15
    .line 16
    iget-boolean v1, p1, Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:Z

    .line 17
    .line 18
    if-nez v1, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget v1, p1, Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 22
    .line 23
    iget v2, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世哲兰:I

    .line 24
    .line 25
    if-lt v1, v2, :cond_3

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_3
    iput v2, p1, Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 29
    .line 30
    iget-object p1, p1, Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/飘花落叶言子世兰楪苏哲;

    .line 31
    .line 32
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-interface {p1, v1}, Landroidx/lifecycle/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    const/4 p1, 0x0

    .line 38
    goto :goto_2

    .line 39
    :cond_4
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    new-instance v2, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲兰苏;

    .line 45
    .line 46
    invoke-direct {v2, v1}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/util/WeakHashMap;

    .line 50
    .line 51
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 52
    .line 53
    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    :cond_5
    invoke-virtual {v2}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲兰苏;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_8

    .line 61
    .line 62
    invoke-virtual {v2}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲兰苏;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ljava/util/Map$Entry;

    .line 67
    .line 68
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;

    .line 73
    .line 74
    iget-boolean v3, v1, Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏兰哲:Z

    .line 75
    .line 76
    if-nez v3, :cond_6

    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_6
    iget v3, v1, Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 80
    .line 81
    iget v4, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世哲兰:I

    .line 82
    .line 83
    if-lt v3, v4, :cond_7

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_7
    iput v4, v1, Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲苏兰:I

    .line 87
    .line 88
    iget-object v1, v1, Landroidx/lifecycle/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/飘花落叶言子世兰楪苏哲;

    .line 89
    .line 90
    iget-object v3, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世兰苏哲:Ljava/lang/Object;

    .line 91
    .line 92
    invoke-interface {v1, v3}, Landroidx/lifecycle/飘花落叶言子世兰楪苏哲;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    :goto_1
    iget-boolean v1, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲世兰:Z

    .line 96
    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    :cond_8
    :goto_2
    iget-boolean v1, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏哲世兰:Z

    .line 100
    .line 101
    if-nez v1, :cond_1

    .line 102
    .line 103
    iput-boolean v0, p0, Landroidx/lifecycle/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪苏世兰哲:Z

    .line 104
    .line 105
    return-void
.end method
