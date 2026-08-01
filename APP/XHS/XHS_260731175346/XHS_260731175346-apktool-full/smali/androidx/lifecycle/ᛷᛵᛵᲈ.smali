.class public final Landroidx/lifecycle/ᛷᛵᛵᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

.field public final ᛳᲁᲇᛸ:Ljava/lang/ref/WeakReference;

.field public ᛷᛴᛷᛱ:Z

.field public ᛷᛵᛵᲈ:Lxhss/ᛸᛴᲀᛵ;

.field public final ᲀᲇᛳᲁ:Ljava/util/ArrayList;

.field public ᲇᛴᲇᛵ:I

.field public ᲇᛶᛴᲀ:Z


# direct methods
.method public constructor <init>(Lxhss/ᛴᛷᲀᲁ;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lxhss/ᛸᛴᲀᛵ;

    .line 10
    .line 11
    invoke-direct {v0}, Lxhss/ᛸᛴᲀᛵ;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛴᲀᛵ;

    .line 15
    .line 16
    sget-object v0, Lxhss/ᛱᛷᛸᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᛸᲁ;

    .line 17
    .line 18
    iput-object v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 26
    .line 27
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Lxhss/ᛱᲀᛲᲁ;)Lxhss/ᛱᛷᛸᲁ;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛴᲀᛵ;

    .line 2
    .line 3
    iget-object v0, v0, Lxhss/ᛸᛴᲀᛵ;->ᲇᛶᛴᲀ:Ljava/util/HashMap;

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
    check-cast p1, Lxhss/ᛴᛴᲁᲈ;

    .line 17
    .line 18
    iget-object p1, p1, Lxhss/ᛴᛴᲁᲈ;->ᛷᛴᛷᛱ:Lxhss/ᛴᛴᲁᲈ;

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
    iget-object p1, p1, Lxhss/ᛴᛴᲁᲈ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Lxhss/ᛵᛸᛱᛵ;

    .line 27
    .line 28
    iget-object p1, p1, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move-object p1, v2

    .line 32
    :goto_1
    iget-object v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

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
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    add-int/lit8 v1, v1, -0x1

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    move-object v2, v0

    .line 51
    check-cast v2, Lxhss/ᛱᛷᛸᲁ;

    .line 52
    .line 53
    :cond_2
    iget-object p0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 54
    .line 55
    if-eqz p1, :cond_3

    .line 56
    .line 57
    invoke-virtual {p1, p0}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-gez v0, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move-object p1, p0

    .line 65
    :goto_2
    if-eqz v2, :cond_4

    .line 66
    .line 67
    invoke-virtual {v2, p1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-gez p0, :cond_4

    .line 72
    .line 73
    return-object v2

    .line 74
    :cond_4
    return-object p1
.end method

.method public final ᛳᲁᲇᛸ(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-static {}, Lxhss/ᛴᲇᲇᲈ;->ᛴᲈᛱᛴ()Lxhss/ᛴᲇᲇᲈ;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-ne p0, v0, :cond_0

    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    const-string p0, "Method "

    .line 24
    .line 25
    const-string v0, " must be called on the main thread"

    .line 26
    .line 27
    invoke-static {p0, p1, v0}, Lxhss/ᛴᛸᛲᛳ;->ᛸᛶᛴᲈ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p1
.end method

.method public final ᛷᛴᛷᛱ(Lxhss/ᛱᛷᛸᲁ;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 2
    .line 3
    if-ne v0, p1, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    sget-object v1, Lxhss/ᛱᛷᛸᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᛸᲁ;

    .line 7
    .line 8
    sget-object v2, Lxhss/ᛱᛷᛸᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 9
    .line 10
    if-ne v0, v1, :cond_2

    .line 11
    .line 12
    if-eq p1, v2, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v0, "no event down from "

    .line 18
    .line 19
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ:Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const-string v0, " in component "

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {p1, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw p1

    .line 55
    :cond_2
    :goto_0
    iput-object p1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 56
    .line 57
    iget-boolean p1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ:Z

    .line 58
    .line 59
    const/4 v0, 0x1

    .line 60
    if-nez p1, :cond_5

    .line 61
    .line 62
    iget p1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ:I

    .line 63
    .line 64
    if-eqz p1, :cond_3

    .line 65
    .line 66
    goto :goto_2

    .line 67
    :cond_3
    iput-boolean v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ:Z

    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲀᲇᛳᲁ()V

    .line 70
    .line 71
    .line 72
    const/4 p1, 0x0

    .line 73
    iput-boolean p1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ:Z

    .line 74
    .line 75
    iget-object p1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 76
    .line 77
    if-ne p1, v2, :cond_4

    .line 78
    .line 79
    new-instance p1, Lxhss/ᛸᛴᲀᛵ;

    .line 80
    .line 81
    invoke-direct {p1}, Lxhss/ᛸᛴᲀᛵ;-><init>()V

    .line 82
    .line 83
    .line 84
    iput-object p1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛴᲀᛵ;

    .line 85
    .line 86
    :cond_4
    :goto_1
    return-void

    .line 87
    :cond_5
    :goto_2
    iput-boolean v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ:Z

    .line 88
    .line 89
    return-void
.end method

.method public final ᛷᛵᛵᲈ(Lxhss/ᛱᲀᛲᲁ;)V
    .locals 9

    .line 1
    const-string v0, "addObserver"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 7
    .line 8
    sget-object v1, Lxhss/ᛱᛷᛸᲁ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    sget-object v1, Lxhss/ᛱᛷᛸᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛱᛷᛸᲁ;

    .line 14
    .line 15
    :goto_0
    new-instance v0, Lxhss/ᛵᛸᛱᛵ;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    .line 19
    .line 20
    sget-object v2, Lxhss/ᲈᛸᛲᲈ;->ᛷᛵᛵᲈ:Ljava/util/HashMap;

    .line 21
    .line 22
    instance-of v2, p1, Lxhss/ᛷᲁᲇᲀ;

    .line 23
    .line 24
    instance-of v3, p1, Lxhss/ᛶᲇᲈᲈ;

    .line 25
    .line 26
    const/4 v4, 0x2

    .line 27
    const/4 v5, 0x0

    .line 28
    const/4 v6, 0x0

    .line 29
    const/4 v7, 0x1

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    new-instance v2, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;

    .line 35
    .line 36
    move-object v3, p1

    .line 37
    check-cast v3, Lxhss/ᛶᲇᲈᲈ;

    .line 38
    .line 39
    move-object v8, p1

    .line 40
    check-cast v8, Lxhss/ᛷᲁᲇᲀ;

    .line 41
    .line 42
    invoke-direct {v2, v3, v8}, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;-><init>(Lxhss/ᛶᲇᲈᲈ;Lxhss/ᛷᲁᲇᲀ;)V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    if-eqz v3, :cond_2

    .line 47
    .line 48
    new-instance v2, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;

    .line 49
    .line 50
    move-object v3, p1

    .line 51
    check-cast v3, Lxhss/ᛶᲇᲈᲈ;

    .line 52
    .line 53
    invoke-direct {v2, v3, v5}, Landroidx/lifecycle/DefaultLifecycleObserverAdapter;-><init>(Lxhss/ᛶᲇᲈᲈ;Lxhss/ᛷᲁᲇᲀ;)V

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_2
    if-eqz v2, :cond_3

    .line 58
    .line 59
    move-object v2, p1

    .line 60
    check-cast v2, Lxhss/ᛷᲁᲇᲀ;

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {v2}, Lxhss/ᲈᛸᛲᲈ;->ᛱᛱᛲᲇ(Ljava/lang/Class;)I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-ne v3, v4, :cond_6

    .line 72
    .line 73
    sget-object v3, Lxhss/ᲈᛸᛲᲈ;->ᛱᛱᛲᲇ:Ljava/util/HashMap;

    .line 74
    .line 75
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result v3

    .line 85
    if-eq v3, v7, :cond_5

    .line 86
    .line 87
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 88
    .line 89
    .line 90
    move-result v3

    .line 91
    new-array v8, v3, [Lxhss/ᛲᛴᛷᛴ;

    .line 92
    .line 93
    if-gtz v3, :cond_4

    .line 94
    .line 95
    new-instance v2, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;

    .line 96
    .line 97
    invoke-direct {v2, v8}, Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;-><init>([Lxhss/ᛲᛴᛷᛴ;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_4
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 106
    .line 107
    invoke-static {p0, p1}, Lxhss/ᲈᛸᛲᲈ;->ᛷᛵᛵᲈ(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    throw v5

    .line 111
    :cond_5
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p0, Ljava/lang/reflect/Constructor;

    .line 116
    .line 117
    invoke-static {p0, p1}, Lxhss/ᲈᛸᛲᲈ;->ᛷᛵᛵᲈ(Ljava/lang/reflect/Constructor;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    throw v5

    .line 121
    :cond_6
    new-instance v2, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;

    .line 122
    .line 123
    invoke-direct {v2, p1}, Landroidx/lifecycle/ReflectiveGenericLifecycleObserver;-><init>(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :goto_1
    iput-object v2, v0, Lxhss/ᛵᛸᛱᛵ;->ᛱᛱᛲᲇ:Lxhss/ᛷᲁᲇᲀ;

    .line 127
    .line 128
    iput-object v1, v0, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 129
    .line 130
    iget-object v1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛴᲀᛵ;

    .line 131
    .line 132
    invoke-virtual {v1, p1}, Lxhss/ᛸᛴᲀᛵ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Lxhss/ᛴᛴᲁᲈ;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    if-eqz v2, :cond_7

    .line 137
    .line 138
    iget-object v1, v2, Lxhss/ᛴᛴᲁᲈ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 139
    .line 140
    goto :goto_3

    .line 141
    :cond_7
    iget-object v2, v1, Lxhss/ᛸᛴᲀᛵ;->ᲇᛶᛴᲀ:Ljava/util/HashMap;

    .line 142
    .line 143
    new-instance v3, Lxhss/ᛴᛴᲁᲈ;

    .line 144
    .line 145
    invoke-direct {v3, p1, v0}, Lxhss/ᛴᛴᲁᲈ;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    iget v8, v1, Lxhss/ᲈᲀᲀᛵ;->ᛷᛴᛷᛱ:I

    .line 149
    .line 150
    add-int/2addr v8, v7

    .line 151
    iput v8, v1, Lxhss/ᲈᲀᲀᛵ;->ᛷᛴᛷᛱ:I

    .line 152
    .line 153
    iget-object v8, v1, Lxhss/ᲈᲀᲀᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛴᲁᲈ;

    .line 154
    .line 155
    if-nez v8, :cond_8

    .line 156
    .line 157
    iput-object v3, v1, Lxhss/ᲈᲀᲀᛵ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛴᲁᲈ;

    .line 158
    .line 159
    iput-object v3, v1, Lxhss/ᲈᲀᲀᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛴᲁᲈ;

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_8
    iput-object v3, v8, Lxhss/ᛴᛴᲁᲈ;->ᲇᛴᲇᛵ:Lxhss/ᛴᛴᲁᲈ;

    .line 163
    .line 164
    iput-object v8, v3, Lxhss/ᛴᛴᲁᲈ;->ᛷᛴᛷᛱ:Lxhss/ᛴᛴᲁᲈ;

    .line 165
    .line 166
    iput-object v3, v1, Lxhss/ᲈᲀᲀᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛴᲁᲈ;

    .line 167
    .line 168
    :goto_2
    invoke-virtual {v2, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-object v1, v5

    .line 172
    :goto_3
    check-cast v1, Lxhss/ᛵᛸᛱᛵ;

    .line 173
    .line 174
    if-eqz v1, :cond_9

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_9
    iget-object v1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ:Ljava/lang/ref/WeakReference;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    check-cast v1, Lxhss/ᛴᛷᲀᲁ;

    .line 184
    .line 185
    if-nez v1, :cond_a

    .line 186
    .line 187
    :goto_4
    return-void

    .line 188
    :cond_a
    iget v2, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ:I

    .line 189
    .line 190
    if-nez v2, :cond_b

    .line 191
    .line 192
    iget-boolean v2, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ:Z

    .line 193
    .line 194
    if-eqz v2, :cond_c

    .line 195
    .line 196
    :cond_b
    move v6, v7

    .line 197
    :cond_c
    invoke-virtual {p0, p1}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ(Lxhss/ᛱᲀᛲᲁ;)Lxhss/ᛱᛷᛸᲁ;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    iget v3, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ:I

    .line 202
    .line 203
    add-int/2addr v3, v7

    .line 204
    iput v3, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ:I

    .line 205
    .line 206
    :goto_5
    iget-object v3, v0, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 207
    .line 208
    invoke-virtual {v3, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 209
    .line 210
    .line 211
    move-result v2

    .line 212
    if-gez v2, :cond_11

    .line 213
    .line 214
    iget-object v2, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛴᲀᛵ;

    .line 215
    .line 216
    iget-object v2, v2, Lxhss/ᛸᛴᲀᛵ;->ᲇᛶᛴᲀ:Ljava/util/HashMap;

    .line 217
    .line 218
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    if-eqz v2, :cond_11

    .line 223
    .line 224
    iget-object v2, v0, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 225
    .line 226
    iget-object v3, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 227
    .line 228
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    sget-object v2, Lxhss/ᲈᲀᛵᛸ;->Companion:Lxhss/ᲇᲈᲁᲈ;

    .line 232
    .line 233
    iget-object v8, v0, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 234
    .line 235
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    .line 239
    .line 240
    .line 241
    move-result v2

    .line 242
    if-eq v2, v7, :cond_f

    .line 243
    .line 244
    if-eq v2, v4, :cond_e

    .line 245
    .line 246
    const/4 v8, 0x3

    .line 247
    if-eq v2, v8, :cond_d

    .line 248
    .line 249
    move-object v2, v5

    .line 250
    goto :goto_6

    .line 251
    :cond_d
    sget-object v2, Lxhss/ᲈᲀᛵᛸ;->ON_RESUME:Lxhss/ᲈᲀᛵᛸ;

    .line 252
    .line 253
    goto :goto_6

    .line 254
    :cond_e
    sget-object v2, Lxhss/ᲈᲀᛵᛸ;->ON_START:Lxhss/ᲈᲀᛵᛸ;

    .line 255
    .line 256
    goto :goto_6

    .line 257
    :cond_f
    sget-object v2, Lxhss/ᲈᲀᛵᛸ;->ON_CREATE:Lxhss/ᲈᲀᛵᛸ;

    .line 258
    .line 259
    :goto_6
    if-eqz v2, :cond_10

    .line 260
    .line 261
    invoke-virtual {v0, v1, v2}, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    sub-int/2addr v2, v7

    .line 269
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    invoke-virtual {p0, p1}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ(Lxhss/ᛱᲀᛲᲁ;)Lxhss/ᛱᛷᛸᲁ;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    goto :goto_5

    .line 277
    :cond_10
    const-string p0, "no event up from "

    .line 278
    .line 279
    iget-object p1, v0, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 280
    .line 281
    invoke-static {p1, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛴᲈᛱᛴ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    return-void

    .line 285
    :cond_11
    if-nez v6, :cond_12

    .line 286
    .line 287
    invoke-virtual {p0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲀᲇᛳᲁ()V

    .line 288
    .line 289
    .line 290
    :cond_12
    iget p1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ:I

    .line 291
    .line 292
    add-int/lit8 p1, p1, -0x1

    .line 293
    .line 294
    iput p1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛴᲇᛵ:I

    .line 295
    .line 296
    return-void
.end method

.method public final ᲀᲇᛳᲁ()V
    .locals 11

    .line 1
    iget-object v0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lxhss/ᛴᛷᲀᲁ;

    .line 8
    .line 9
    if-eqz v0, :cond_e

    .line 10
    .line 11
    :cond_0
    iget-object v1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛴᲀᛵ;

    .line 12
    .line 13
    iget v2, v1, Lxhss/ᲈᲀᲀᛵ;->ᛷᛴᛷᛱ:I

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
    iget-object v2, v1, Lxhss/ᲈᲀᲀᛵ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛴᲁᲈ;

    .line 20
    .line 21
    iget-object v2, v2, Lxhss/ᛴᛴᲁᲈ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Lxhss/ᛵᛸᛱᛵ;

    .line 24
    .line 25
    iget-object v2, v2, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 26
    .line 27
    iget-object v1, v1, Lxhss/ᲈᲀᲀᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛴᲁᲈ;

    .line 28
    .line 29
    iget-object v1, v1, Lxhss/ᛴᛴᲁᲈ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v1, Lxhss/ᛵᛸᛱᛵ;

    .line 32
    .line 33
    iget-object v1, v1, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 34
    .line 35
    if-ne v2, v1, :cond_2

    .line 36
    .line 37
    iget-object v4, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 38
    .line 39
    if-ne v4, v1, :cond_2

    .line 40
    .line 41
    :goto_0
    iput-boolean v3, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ:Z

    .line 42
    .line 43
    return-void

    .line 44
    :cond_2
    iput-boolean v3, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ:Z

    .line 45
    .line 46
    iget-object v1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    const/4 v2, 0x0

    .line 53
    const/4 v3, 0x3

    .line 54
    const/4 v4, 0x2

    .line 55
    const/4 v5, 0x1

    .line 56
    iget-object v6, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲀᲇᛳᲁ:Ljava/util/ArrayList;

    .line 57
    .line 58
    if-gez v1, :cond_8

    .line 59
    .line 60
    iget-object v1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛴᲀᛵ;

    .line 61
    .line 62
    new-instance v7, Lxhss/ᛷᛷᲀ;

    .line 63
    .line 64
    iget-object v8, v1, Lxhss/ᲈᲀᲀᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛴᲁᲈ;

    .line 65
    .line 66
    iget-object v9, v1, Lxhss/ᲈᲀᲀᛵ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛴᲁᲈ;

    .line 67
    .line 68
    invoke-direct {v7, v8, v9, v5}, Lxhss/ᛷᛷᲀ;-><init>(Lxhss/ᛴᛴᲁᲈ;Lxhss/ᛴᛴᲁᲈ;I)V

    .line 69
    .line 70
    .line 71
    iget-object v1, v1, Lxhss/ᲈᲀᲀᛵ;->ᲇᛴᲇᛵ:Ljava/util/WeakHashMap;

    .line 72
    .line 73
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 74
    .line 75
    invoke-virtual {v1, v7, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    :cond_3
    invoke-virtual {v7}, Lxhss/ᛷᛷᲀ;->hasNext()Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-eqz v1, :cond_8

    .line 83
    .line 84
    iget-boolean v1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ:Z

    .line 85
    .line 86
    if-nez v1, :cond_8

    .line 87
    .line 88
    invoke-virtual {v7}, Lxhss/ᛷᛷᲀ;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Ljava/util/Map$Entry;

    .line 93
    .line 94
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v8

    .line 98
    check-cast v8, Lxhss/ᛱᲀᛲᲁ;

    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    check-cast v1, Lxhss/ᛵᛸᛱᛵ;

    .line 105
    .line 106
    :goto_1
    iget-object v9, v1, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 107
    .line 108
    iget-object v10, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 109
    .line 110
    invoke-virtual {v9, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    if-lez v9, :cond_3

    .line 115
    .line 116
    iget-boolean v9, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ:Z

    .line 117
    .line 118
    if-nez v9, :cond_3

    .line 119
    .line 120
    iget-object v9, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛴᲀᛵ;

    .line 121
    .line 122
    iget-object v9, v9, Lxhss/ᛸᛴᲀᛵ;->ᲇᛶᛴᲀ:Ljava/util/HashMap;

    .line 123
    .line 124
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result v9

    .line 128
    if-eqz v9, :cond_3

    .line 129
    .line 130
    sget-object v9, Lxhss/ᲈᲀᛵᛸ;->Companion:Lxhss/ᲇᲈᲁᲈ;

    .line 131
    .line 132
    iget-object v10, v1, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 133
    .line 134
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 138
    .line 139
    .line 140
    move-result v9

    .line 141
    if-eq v9, v4, :cond_6

    .line 142
    .line 143
    if-eq v9, v3, :cond_5

    .line 144
    .line 145
    const/4 v10, 0x4

    .line 146
    if-eq v9, v10, :cond_4

    .line 147
    .line 148
    move-object v9, v2

    .line 149
    goto :goto_2

    .line 150
    :cond_4
    sget-object v9, Lxhss/ᲈᲀᛵᛸ;->ON_PAUSE:Lxhss/ᲈᲀᛵᛸ;

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_5
    sget-object v9, Lxhss/ᲈᲀᛵᛸ;->ON_STOP:Lxhss/ᲈᲀᛵᛸ;

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_6
    sget-object v9, Lxhss/ᲈᲀᛵᛸ;->ON_DESTROY:Lxhss/ᲈᲀᛵᛸ;

    .line 157
    .line 158
    :goto_2
    if-eqz v9, :cond_7

    .line 159
    .line 160
    invoke-virtual {v9}, Lxhss/ᲈᲀᛵᛸ;->ᛷᛵᛵᲈ()Lxhss/ᛱᛷᛸᲁ;

    .line 161
    .line 162
    .line 163
    move-result-object v10

    .line 164
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v0, v9}, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 171
    .line 172
    .line 173
    move-result v9

    .line 174
    sub-int/2addr v9, v5

    .line 175
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_7
    const-string p0, "no event down from "

    .line 180
    .line 181
    iget-object v0, v1, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 182
    .line 183
    invoke-static {v0, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛴᲈᛱᛴ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    return-void

    .line 187
    :cond_8
    iget-object v1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛴᲀᛵ;

    .line 188
    .line 189
    iget-object v1, v1, Lxhss/ᲈᲀᲀᛵ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛴᲁᲈ;

    .line 190
    .line 191
    iget-boolean v7, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ:Z

    .line 192
    .line 193
    if-nez v7, :cond_0

    .line 194
    .line 195
    if-eqz v1, :cond_0

    .line 196
    .line 197
    iget-object v7, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 198
    .line 199
    iget-object v1, v1, Lxhss/ᛴᛴᲁᲈ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast v1, Lxhss/ᛵᛸᛱᛵ;

    .line 202
    .line 203
    iget-object v1, v1, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 204
    .line 205
    invoke-virtual {v7, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 206
    .line 207
    .line 208
    move-result v1

    .line 209
    if-lez v1, :cond_0

    .line 210
    .line 211
    iget-object v1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛴᲀᛵ;

    .line 212
    .line 213
    new-instance v7, Lxhss/ᛲᲁᛸᛶ;

    .line 214
    .line 215
    invoke-direct {v7, v1}, Lxhss/ᛲᲁᛸᛶ;-><init>(Lxhss/ᲈᲀᲀᛵ;)V

    .line 216
    .line 217
    .line 218
    iget-object v1, v1, Lxhss/ᲈᲀᲀᛵ;->ᲇᛴᲇᛵ:Ljava/util/WeakHashMap;

    .line 219
    .line 220
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 221
    .line 222
    invoke-virtual {v1, v7, v8}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    :cond_9
    invoke-virtual {v7}, Lxhss/ᛲᲁᛸᛶ;->hasNext()Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-eqz v1, :cond_0

    .line 230
    .line 231
    iget-boolean v1, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ:Z

    .line 232
    .line 233
    if-nez v1, :cond_0

    .line 234
    .line 235
    invoke-virtual {v7}, Lxhss/ᛲᲁᛸᛶ;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, Ljava/util/Map$Entry;

    .line 240
    .line 241
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    check-cast v8, Lxhss/ᛱᲀᛲᲁ;

    .line 246
    .line 247
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    check-cast v1, Lxhss/ᛵᛸᛱᛵ;

    .line 252
    .line 253
    :goto_3
    iget-object v9, v1, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 254
    .line 255
    iget-object v10, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛱᛱᛲᲇ:Lxhss/ᛱᛷᛸᲁ;

    .line 256
    .line 257
    invoke-virtual {v9, v10}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 258
    .line 259
    .line 260
    move-result v9

    .line 261
    if-gez v9, :cond_9

    .line 262
    .line 263
    iget-boolean v9, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᲇᛶᛴᲀ:Z

    .line 264
    .line 265
    if-nez v9, :cond_9

    .line 266
    .line 267
    iget-object v9, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛴᲀᛵ;

    .line 268
    .line 269
    iget-object v9, v9, Lxhss/ᛸᛴᲀᛵ;->ᲇᛶᛴᲀ:Ljava/util/HashMap;

    .line 270
    .line 271
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v9

    .line 275
    if-eqz v9, :cond_9

    .line 276
    .line 277
    iget-object v9, v1, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 278
    .line 279
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    sget-object v9, Lxhss/ᲈᲀᛵᛸ;->Companion:Lxhss/ᲇᲈᲁᲈ;

    .line 283
    .line 284
    iget-object v10, v1, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 285
    .line 286
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 290
    .line 291
    .line 292
    move-result v9

    .line 293
    if-eq v9, v5, :cond_c

    .line 294
    .line 295
    if-eq v9, v4, :cond_b

    .line 296
    .line 297
    if-eq v9, v3, :cond_a

    .line 298
    .line 299
    move-object v9, v2

    .line 300
    goto :goto_4

    .line 301
    :cond_a
    sget-object v9, Lxhss/ᲈᲀᛵᛸ;->ON_RESUME:Lxhss/ᲈᲀᛵᛸ;

    .line 302
    .line 303
    goto :goto_4

    .line 304
    :cond_b
    sget-object v9, Lxhss/ᲈᲀᛵᛸ;->ON_START:Lxhss/ᲈᲀᛵᛸ;

    .line 305
    .line 306
    goto :goto_4

    .line 307
    :cond_c
    sget-object v9, Lxhss/ᲈᲀᛵᛸ;->ON_CREATE:Lxhss/ᲈᲀᛵᛸ;

    .line 308
    .line 309
    :goto_4
    if-eqz v9, :cond_d

    .line 310
    .line 311
    invoke-virtual {v1, v0, v9}, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 315
    .line 316
    .line 317
    move-result v9

    .line 318
    sub-int/2addr v9, v5

    .line 319
    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    goto :goto_3

    .line 323
    :cond_d
    const-string p0, "no event up from "

    .line 324
    .line 325
    iget-object v0, v1, Lxhss/ᛵᛸᛱᛵ;->ᛷᛵᛵᲈ:Lxhss/ᛱᛷᛸᲁ;

    .line 326
    .line 327
    invoke-static {v0, p0}, Lxhss/ᛵᲈᲁᲈ;->ᛴᲈᛱᛴ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    return-void

    .line 331
    :cond_e
    const-string p0, "LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state."

    .line 332
    .line 333
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᛶᲇᲈᛸ(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    return-void
.end method

.method public final ᲇᛴᲇᛵ(Lxhss/ᲈᲀᛵᛸ;)V
    .locals 1

    .line 1
    const-string v0, "handleLifecycleEvent"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Lxhss/ᲈᲀᛵᛸ;->ᛷᛵᛵᲈ()Lxhss/ᛱᛷᛸᲁ;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    invoke-virtual {p0, p1}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛴᛷᛱ(Lxhss/ᛱᛷᛸᲁ;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public final ᲇᛶᛴᲀ(Lxhss/ᛱᲀᛲᲁ;)V
    .locals 1

    .line 1
    const-string v0, "removeObserver"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛳᲁᲇᛸ(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Landroidx/lifecycle/ᛷᛵᛵᲈ;->ᛷᛵᛵᲈ:Lxhss/ᛸᛴᲀᛵ;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lxhss/ᛸᛴᲀᛵ;->ᛱᛱᛲᲇ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-void
.end method
