.class public final Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;
.super Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public 飘花落叶言子楪世兰哲苏:Z

.field public 飘花落叶言子楪世兰苏哲:I

.field public final 飘花落叶言子楪世哲兰苏:Ljava/lang/ref/WeakReference;

.field public 飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

.field public 飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪世苏哲兰:Z

.field public final 飘花落叶言子楪苏世兰哲:Ljava/util/ArrayList;

.field public 飘花落叶言子楪苏世哲兰:Z

.field public final 飘花落叶言子楪苏哲世兰:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;


# direct methods
.method public constructor <init>(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Z)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-instance v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iput-boolean p2, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Z

    .line 11
    .line 12
    new-instance p2, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 13
    .line 14
    invoke-direct {p2}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 18
    .line 19
    sget-object p2, Landroidx/lifecycle/Lifecycle$State;->INITIALIZED:Landroidx/lifecycle/Lifecycle$State;

    .line 20
    .line 21
    iput-object p2, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Ljava/util/ArrayList;

    .line 29
    .line 30
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 31
    .line 32
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object v0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/ref/WeakReference;

    .line 36
    .line 37
    invoke-static {p2}, Lkotlinx/coroutines/flow/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 42
    .line 43
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰哲苏(Landroidx/lifecycle/Lifecycle$State;)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_2

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/ref/WeakReference;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;

    .line 14
    .line 15
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    sget-object v2, Landroidx/lifecycle/Lifecycle$State;->INITIALIZED:Landroidx/lifecycle/Lifecycle$State;

    .line 24
    .line 25
    if-ne v1, v2, :cond_2

    .line 26
    .line 27
    sget-object v2, Landroidx/lifecycle/Lifecycle$State;->DESTROYED:Landroidx/lifecycle/Lifecycle$State;

    .line 28
    .line 29
    if-eq p1, v2, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 33
    .line 34
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->CREATED:Landroidx/lifecycle/Lifecycle$State;

    .line 35
    .line 36
    new-instance v2, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v3, "State must be at least \'"

    .line 39
    .line 40
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v1, "\' to be moved to \'"

    .line 47
    .line 48
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string p1, "\' in component "

    .line 55
    .line 56
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    throw p0

    .line 74
    :cond_2
    :goto_0
    sget-object v2, Landroidx/lifecycle/Lifecycle$State;->DESTROYED:Landroidx/lifecycle/Lifecycle$State;

    .line 75
    .line 76
    if-ne v1, v2, :cond_4

    .line 77
    .line 78
    if-ne v1, p1, :cond_3

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    new-instance v1, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v3, "State is \'"

    .line 86
    .line 87
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string v2, "\' and cannot be moved to `"

    .line 94
    .line 95
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p1, "` in component "

    .line 102
    .line 103
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    throw p0

    .line 121
    :cond_4
    :goto_1
    iput-object p1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 122
    .line 123
    iget-boolean p1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Z

    .line 124
    .line 125
    const/4 v0, 0x1

    .line 126
    if-nez p1, :cond_7

    .line 127
    .line 128
    iget p1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 129
    .line 130
    if-eqz p1, :cond_5

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_5
    iput-boolean v0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Z

    .line 134
    .line 135
    invoke-virtual {p0}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲()V

    .line 136
    .line 137
    .line 138
    const/4 p1, 0x0

    .line 139
    iput-boolean p1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Z

    .line 140
    .line 141
    iget-object p1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 142
    .line 143
    if-ne p1, v2, :cond_6

    .line 144
    .line 145
    new-instance p1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 146
    .line 147
    invoke-direct {p1}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;-><init>()V

    .line 148
    .line 149
    .line 150
    iput-object p1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 151
    .line 152
    :cond_6
    :goto_2
    return-void

    .line 153
    :cond_7
    :goto_3
    iput-boolean v0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Z

    .line 154
    .line 155
    return-void
.end method

.method public final 飘花落叶言子楪世兰苏哲(Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "handleLifecycleEvent"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroidx/lifecycle/Lifecycle$Event;->getTargetState()Landroidx/lifecycle/Lifecycle$State;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0, p1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroidx/lifecycle/Lifecycle$State;)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final 飘花落叶言子楪世哲兰苏(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-boolean p0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏哲兰:Z

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    invoke-static {}, L飘花落叶言子楪苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子世哲楪兰苏()L飘花落叶言子楪苏兰哲世/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    iget-object p0, p0, L飘花落叶言子楪苏兰哲世/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子楪苏兰哲世/飘花落叶言子楪世哲苏兰;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-ne p0, v0, :cond_0

    .line 27
    .line 28
    return-void

    .line 29
    :cond_0
    const-string p0, "Method "

    .line 30
    .line 31
    const-string v0, " must be called on the main thread"

    .line 32
    .line 33
    invoke-static {p0, p1, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)Landroidx/lifecycle/Lifecycle$State;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    iget-object v0, v0, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:Ljava/util/HashMap;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 17
    .line 18
    iget-object p1, p1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object p1, v2

    .line 22
    :goto_0
    if-eqz p1, :cond_1

    .line 23
    .line 24
    iget-object p1, p1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;

    .line 27
    .line 28
    iget-object p1, p1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object p1, v2

    .line 32
    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    const/4 v1, 0x1

    .line 41
    invoke-static {v1, v0}, Lnet/bytebuddy/matcher/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪苏世哲兰(ILjava/util/ArrayList;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    move-object v2, v0

    .line 46
    check-cast v2, Landroidx/lifecycle/Lifecycle$State;

    .line 47
    .line 48
    :cond_2
    iget-object p0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    if-eqz p1, :cond_3

    .line 54
    .line 55
    invoke-virtual {p1, p0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-gez v0, :cond_3

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_3
    move-object p1, p0

    .line 63
    :goto_2
    if-eqz v2, :cond_4

    .line 64
    .line 65
    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-gez p0, :cond_4

    .line 70
    .line 71
    return-object v2

    .line 72
    :cond_4
    return-object p1
.end method

.method public final 飘花落叶言子楪世苏兰哲(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "removeObserver"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object p0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "addObserver"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 10
    .line 11
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->DESTROYED:Landroidx/lifecycle/Lifecycle$State;

    .line 12
    .line 13
    if-ne v0, v1, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object v1, Landroidx/lifecycle/Lifecycle$State;->INITIALIZED:Landroidx/lifecycle/Lifecycle$State;

    .line 17
    .line 18
    :goto_0
    new-instance v0, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;

    .line 19
    .line 20
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    sget-object v2, Landroidx/lifecycle/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰:Ljava/util/HashMap;

    .line 27
    .line 28
    instance-of v2, p1, Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;

    .line 29
    .line 30
    instance-of v3, p1, Landroidx/lifecycle/飘花落叶言子楪苏世兰哲;

    .line 31
    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x0

    .line 34
    const/4 v6, 0x1

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    new-instance v2, Landroidx/activity/飘花落叶言子世哲楪兰苏;

    .line 40
    .line 41
    move-object v3, p1

    .line 42
    check-cast v3, Landroidx/lifecycle/飘花落叶言子楪苏世兰哲;

    .line 43
    .line 44
    move-object v7, p1

    .line 45
    check-cast v7, Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;

    .line 46
    .line 47
    invoke-direct {v2, v3, v7}, Landroidx/activity/飘花落叶言子世哲楪兰苏;-><init>(Landroidx/lifecycle/飘花落叶言子楪苏世兰哲;Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    if-eqz v3, :cond_2

    .line 52
    .line 53
    new-instance v2, Landroidx/activity/飘花落叶言子世哲楪兰苏;

    .line 54
    .line 55
    move-object v3, p1

    .line 56
    check-cast v3, Landroidx/lifecycle/飘花落叶言子楪苏世兰哲;

    .line 57
    .line 58
    invoke-direct {v2, v3, v4}, Landroidx/activity/飘花落叶言子世哲楪兰苏;-><init>(Landroidx/lifecycle/飘花落叶言子楪苏世兰哲;Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;)V

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    if-eqz v2, :cond_3

    .line 63
    .line 64
    move-object v2, p1

    .line 65
    check-cast v2, Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v2

    .line 72
    invoke-static {v2}, Landroidx/lifecycle/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;)I

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    const/4 v7, 0x2

    .line 77
    if-ne v3, v7, :cond_6

    .line 78
    .line 79
    sget-object v3, Landroidx/lifecycle/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏兰哲:Ljava/util/HashMap;

    .line 80
    .line 81
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    check-cast v2, Ljava/util/List;

    .line 89
    .line 90
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-eq v3, v6, :cond_5

    .line 95
    .line 96
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    new-array v7, v3, [Landroidx/lifecycle/飘花落叶言子楪哲苏兰世;

    .line 101
    .line 102
    if-gtz v3, :cond_4

    .line 103
    .line 104
    new-instance v2, Landroidx/lifecycle/飘花落叶言子楪世兰哲苏;

    .line 105
    .line 106
    invoke-direct {v2, v7, v5}, Landroidx/lifecycle/飘花落叶言子楪世兰哲苏;-><init>(Ljava/lang/Object;I)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_4
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 115
    .line 116
    invoke-static {p0, p1}, Landroidx/lifecycle/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/reflect/Constructor;Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 117
    .line 118
    .line 119
    throw v4

    .line 120
    :cond_5
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 125
    .line 126
    invoke-static {p0, p1}, Landroidx/lifecycle/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪世苏哲兰(Ljava/lang/reflect/Constructor;Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 127
    .line 128
    .line 129
    throw v4

    .line 130
    :cond_6
    new-instance v2, Landroidx/activity/飘花落叶言子世哲楪兰苏;

    .line 131
    .line 132
    invoke-direct {v2, p1}, Landroidx/activity/飘花落叶言子世哲楪兰苏;-><init>(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 133
    .line 134
    .line 135
    :goto_1
    iput-object v2, v0, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏兰哲:Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;

    .line 136
    .line 137
    iput-object v1, v0, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 138
    .line 139
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 140
    .line 141
    invoke-virtual {v1, p1}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    if-eqz v2, :cond_7

    .line 146
    .line 147
    iget-object v4, v2, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 148
    .line 149
    goto :goto_3

    .line 150
    :cond_7
    iget-object v2, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:Ljava/util/HashMap;

    .line 151
    .line 152
    new-instance v3, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 153
    .line 154
    invoke-direct {v3, p1, v0}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    iget v7, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:I

    .line 158
    .line 159
    add-int/2addr v7, v6

    .line 160
    iput v7, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:I

    .line 161
    .line 162
    iget-object v7, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 163
    .line 164
    if-nez v7, :cond_8

    .line 165
    .line 166
    iput-object v3, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 167
    .line 168
    iput-object v3, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_8
    iput-object v3, v7, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰苏世:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 172
    .line 173
    iput-object v7, v3, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪兰世苏哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 174
    .line 175
    iput-object v3, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 176
    .line 177
    :goto_2
    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    :goto_3
    check-cast v4, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;

    .line 181
    .line 182
    if-eqz v4, :cond_9

    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_9
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/ref/WeakReference;

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    check-cast v1, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;

    .line 192
    .line 193
    if-nez v1, :cond_a

    .line 194
    .line 195
    :goto_4
    return-void

    .line 196
    :cond_a
    iget v2, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 197
    .line 198
    if-nez v2, :cond_b

    .line 199
    .line 200
    iget-boolean v2, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏:Z

    .line 201
    .line 202
    if-eqz v2, :cond_c

    .line 203
    .line 204
    :cond_b
    move v5, v6

    .line 205
    :cond_c
    invoke-virtual {p0, p1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)Landroidx/lifecycle/Lifecycle$State;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    iget v3, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 210
    .line 211
    add-int/2addr v3, v6

    .line 212
    iput v3, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 213
    .line 214
    :goto_5
    iget-object v3, v0, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 215
    .line 216
    invoke-virtual {v3, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    if-gez v2, :cond_e

    .line 221
    .line 222
    iget-object v2, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 223
    .line 224
    iget-object v2, v2, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:Ljava/util/HashMap;

    .line 225
    .line 226
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-eqz v2, :cond_e

    .line 231
    .line 232
    iget-object v2, v0, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 233
    .line 234
    iget-object v3, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Ljava/util/ArrayList;

    .line 235
    .line 236
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    sget-object v2, Landroidx/lifecycle/Lifecycle$Event;->Companion:Landroidx/lifecycle/飘花落叶言子楪兰世哲苏;

    .line 240
    .line 241
    iget-object v4, v0, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 242
    .line 243
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-static {v4}, Landroidx/lifecycle/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$Event;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    if-eqz v2, :cond_d

    .line 251
    .line 252
    invoke-virtual {v0, v1, v2}, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$Event;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    sub-int/2addr v2, v6

    .line 260
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0, p1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)Landroidx/lifecycle/Lifecycle$State;

    .line 264
    .line 265
    .line 266
    move-result-object v2

    .line 267
    goto :goto_5

    .line 268
    :cond_d
    const-string p0, "no event up from "

    .line 269
    .line 270
    iget-object p1, v0, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 271
    .line 272
    invoke-static {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :cond_e
    if-nez v5, :cond_f

    .line 277
    .line 278
    invoke-virtual {p0}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲()V

    .line 279
    .line 280
    .line 281
    :cond_f
    iget p1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 282
    .line 283
    add-int/lit8 p1, p1, -0x1

    .line 284
    .line 285
    iput p1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰苏哲:I

    .line 286
    .line 287
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;

    .line 8
    .line 9
    if-eqz v0, :cond_8

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    iget v2, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪兰世苏哲:I

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    iget-object v1, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v1, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;

    .line 27
    .line 28
    iget-object v1, v1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 29
    .line 30
    iget-object v2, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 31
    .line 32
    iget-object v2, v2, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget-object v2, v2, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v2, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;

    .line 40
    .line 41
    iget-object v2, v2, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 42
    .line 43
    if-ne v1, v2, :cond_2

    .line 44
    .line 45
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 46
    .line 47
    if-ne v1, v2, :cond_2

    .line 48
    .line 49
    :goto_0
    iput-boolean v3, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Z

    .line 50
    .line 51
    iget-object v0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏哲世兰:Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;

    .line 52
    .line 53
    iget-object p0, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 54
    .line 55
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/flow/飘花落叶言子兰世苏楪哲;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    iput-boolean v3, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Z

    .line 60
    .line 61
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 62
    .line 63
    iget-object v2, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 64
    .line 65
    iget-object v2, v2, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 66
    .line 67
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget-object v2, v2, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v2, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;

    .line 73
    .line 74
    iget-object v2, v2, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/4 v2, 0x1

    .line 81
    iget-object v3, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世兰哲:Ljava/util/ArrayList;

    .line 82
    .line 83
    if-gez v1, :cond_5

    .line 84
    .line 85
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 86
    .line 87
    new-instance v4, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏兰哲;

    .line 88
    .line 89
    iget-object v5, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 90
    .line 91
    iget-object v6, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲苏兰世:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 92
    .line 93
    invoke-direct {v4, v5, v6, v2}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏兰哲;-><init>(L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;I)V

    .line 94
    .line 95
    .line 96
    iget-object v1, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/util/WeakHashMap;

    .line 97
    .line 98
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 99
    .line 100
    invoke-virtual {v1, v4, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    :cond_3
    invoke-virtual {v4}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏兰哲;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-eqz v1, :cond_5

    .line 108
    .line 109
    iget-boolean v1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Z

    .line 110
    .line 111
    if-nez v1, :cond_5

    .line 112
    .line 113
    invoke-virtual {v4}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏兰哲;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ljava/util/Map$Entry;

    .line 118
    .line 119
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v5

    .line 126
    check-cast v5, Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;

    .line 127
    .line 128
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    check-cast v1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;

    .line 133
    .line 134
    :goto_1
    iget-object v6, v1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 135
    .line 136
    iget-object v7, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 137
    .line 138
    invoke-virtual {v6, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-lez v6, :cond_3

    .line 143
    .line 144
    iget-boolean v6, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Z

    .line 145
    .line 146
    if-nez v6, :cond_3

    .line 147
    .line 148
    iget-object v6, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 149
    .line 150
    iget-object v6, v6, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:Ljava/util/HashMap;

    .line 151
    .line 152
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v6

    .line 156
    if-eqz v6, :cond_3

    .line 157
    .line 158
    sget-object v6, Landroidx/lifecycle/Lifecycle$Event;->Companion:Landroidx/lifecycle/飘花落叶言子楪兰世哲苏;

    .line 159
    .line 160
    iget-object v7, v1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 161
    .line 162
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-static {v7}, Landroidx/lifecycle/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏哲兰(Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$Event;

    .line 166
    .line 167
    .line 168
    move-result-object v6

    .line 169
    if-eqz v6, :cond_4

    .line 170
    .line 171
    invoke-virtual {v6}, Landroidx/lifecycle/Lifecycle$Event;->getTargetState()Landroidx/lifecycle/Lifecycle$State;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v0, v6}, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$Event;)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    sub-int/2addr v6, v2

    .line 186
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_4
    const-string p0, "no event down from "

    .line 191
    .line 192
    iget-object v0, v1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 193
    .line 194
    invoke-static {v0, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    return-void

    .line 198
    :cond_5
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 199
    .line 200
    iget-object v1, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰世苏:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;

    .line 201
    .line 202
    iget-boolean v4, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Z

    .line 203
    .line 204
    if-nez v4, :cond_0

    .line 205
    .line 206
    if-eqz v1, :cond_0

    .line 207
    .line 208
    iget-object v4, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 209
    .line 210
    iget-object v1, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪哲兰世苏:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast v1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;

    .line 213
    .line 214
    iget-object v1, v1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 215
    .line 216
    invoke-virtual {v4, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    if-lez v1, :cond_0

    .line 221
    .line 222
    iget-object v1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    new-instance v4, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲兰苏;

    .line 228
    .line 229
    invoke-direct {v4, v1}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲兰苏;-><init>(L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;)V

    .line 230
    .line 231
    .line 232
    iget-object v1, v1, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪哲兰苏世:Ljava/util/WeakHashMap;

    .line 233
    .line 234
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 235
    .line 236
    invoke-virtual {v1, v4, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    :cond_6
    invoke-virtual {v4}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲兰苏;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-eqz v1, :cond_0

    .line 244
    .line 245
    iget-boolean v1, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Z

    .line 246
    .line 247
    if-nez v1, :cond_0

    .line 248
    .line 249
    invoke-virtual {v4}, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世哲兰苏;->next()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    check-cast v1, Ljava/util/Map$Entry;

    .line 254
    .line 255
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v5

    .line 259
    check-cast v5, Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;

    .line 260
    .line 261
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    check-cast v1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;

    .line 266
    .line 267
    :goto_2
    iget-object v6, v1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 268
    .line 269
    iget-object v7, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲苏兰:Landroidx/lifecycle/Lifecycle$State;

    .line 270
    .line 271
    invoke-virtual {v6, v7}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 272
    .line 273
    .line 274
    move-result v6

    .line 275
    if-gez v6, :cond_6

    .line 276
    .line 277
    iget-boolean v6, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰:Z

    .line 278
    .line 279
    if-nez v6, :cond_6

    .line 280
    .line 281
    iget-object v6, p0, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;

    .line 282
    .line 283
    iget-object v6, v6, L飘花落叶言子楪哲世苏兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪兰世哲苏:Ljava/util/HashMap;

    .line 284
    .line 285
    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v6

    .line 289
    if-eqz v6, :cond_6

    .line 290
    .line 291
    iget-object v6, v1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 292
    .line 293
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    sget-object v6, Landroidx/lifecycle/Lifecycle$Event;->Companion:Landroidx/lifecycle/飘花落叶言子楪兰世哲苏;

    .line 297
    .line 298
    iget-object v7, v1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 299
    .line 300
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-static {v7}, Landroidx/lifecycle/飘花落叶言子楪兰世哲苏;->飘花落叶言子楪世苏兰哲(Landroidx/lifecycle/Lifecycle$State;)Landroidx/lifecycle/Lifecycle$Event;

    .line 304
    .line 305
    .line 306
    move-result-object v6

    .line 307
    if-eqz v6, :cond_7

    .line 308
    .line 309
    invoke-virtual {v1, v0, v6}, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$Event;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 313
    .line 314
    .line 315
    move-result v6

    .line 316
    sub-int/2addr v6, v2

    .line 317
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    goto :goto_2

    .line 321
    :cond_7
    const-string p0, "no event up from "

    .line 322
    .line 323
    iget-object v0, v1, Landroidx/lifecycle/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世苏哲兰:Landroidx/lifecycle/Lifecycle$State;

    .line 324
    .line 325
    invoke-static {v0, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子世楪苏哲兰(Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    return-void

    .line 329
    :cond_8
    const-string p0, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    .line 330
    .line 331
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 332
    .line 333
    .line 334
    return-void
.end method

.method public final 飘花落叶言子楪苏世哲兰(Landroidx/lifecycle/Lifecycle$State;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-string v0, "setCurrentState"

    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Landroidx/lifecycle/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世兰哲苏(Landroidx/lifecycle/Lifecycle$State;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
