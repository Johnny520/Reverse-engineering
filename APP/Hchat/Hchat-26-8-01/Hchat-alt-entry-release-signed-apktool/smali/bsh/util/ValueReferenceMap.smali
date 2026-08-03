.class public Lbsh/util/ValueReferenceMap;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/util/ValueReferenceMap$Type;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z


# instance fields
.field private counter:I

.field private creator:Ljava/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Function<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private found:I

.field private map:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "TK;",
            "Ljava/lang/ref/Reference<",
            "TV;>;>;"
        }
    .end annotation
.end field

.field private missed:I

.field private queue:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "TV;>;"
        }
    .end annotation
.end field

.field private reverse:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/ref/Reference<",
            "TV;>;TK;>;"
        }
    .end annotation
.end field

.field private type:Lbsh/util/ValueReferenceMap$Type;


# direct methods
.method public constructor <init>(Ljava/util/function/Function;Lbsh/util/ValueReferenceMap$Type;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Function<",
            "TK;TV;>;",
            "Lbsh/util/ValueReferenceMap$Type;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbsh/util/ValueReferenceMap;->map:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lbsh/util/ValueReferenceMap;->reverse:Ljava/util/HashMap;

    .line 17
    .line 18
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lbsh/util/ValueReferenceMap;->queue:Ljava/lang/ref/ReferenceQueue;

    .line 24
    .line 25
    const-string v0, "creator must not be null"

    .line 26
    .line 27
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    const-string v0, "type must not be null"

    .line 31
    .line 32
    invoke-static {p2, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, Lbsh/util/ValueReferenceMap;->creator:Ljava/util/function/Function;

    .line 36
    .line 37
    iput-object p2, p0, Lbsh/util/ValueReferenceMap;->type:Lbsh/util/ValueReferenceMap$Type;

    .line 38
    .line 39
    return-void
.end method

.method private clean()V
    .locals 3

    .line 1
    :goto_0
    iget-object v0, p0, Lbsh/util/ValueReferenceMap;->queue:Ljava/lang/ref/ReferenceQueue;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v1, p0, Lbsh/util/ValueReferenceMap;->reverse:Ljava/util/HashMap;

    .line 10
    .line 11
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    iget-object v2, p0, Lbsh/util/ValueReferenceMap;->map:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object v1, p0, Lbsh/util/ValueReferenceMap;->reverse:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    return-void
.end method


# virtual methods
.method public declared-synchronized clear()V
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lbsh/util/ValueReferenceMap;->clean()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lbsh/util/ValueReferenceMap;->map:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Lbsh/util/ValueReferenceMap;->reverse:Ljava/util/HashMap;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 13
    .line 14
    .line 15
    const/4 v0, 0x0

    .line 16
    iput v0, p0, Lbsh/util/ValueReferenceMap;->missed:I

    .line 17
    .line 18
    iput v0, p0, Lbsh/util/ValueReferenceMap;->found:I

    .line 19
    .line 20
    iput v0, p0, Lbsh/util/ValueReferenceMap;->counter:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    monitor-exit p0

    .line 23
    return-void

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    throw v0
.end method

.method public declared-synchronized get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "key must not be null"

    .line 3
    .line 4
    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    iget v0, p0, Lbsh/util/ValueReferenceMap;->counter:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, 0x1

    .line 10
    .line 11
    iput v0, p0, Lbsh/util/ValueReferenceMap;->counter:I

    .line 12
    .line 13
    const/16 v1, 0x3e8

    .line 14
    .line 15
    if-ne v0, v1, :cond_0

    .line 16
    .line 17
    invoke-direct {p0}, Lbsh/util/ValueReferenceMap;->clean()V

    .line 18
    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    iput v0, p0, Lbsh/util/ValueReferenceMap;->missed:I

    .line 22
    .line 23
    iput v0, p0, Lbsh/util/ValueReferenceMap;->found:I

    .line 24
    .line 25
    iput v0, p0, Lbsh/util/ValueReferenceMap;->counter:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception p1

    .line 29
    goto :goto_2

    .line 30
    :cond_0
    :goto_0
    iget-object v0, p0, Lbsh/util/ValueReferenceMap;->map:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/lang/ref/Reference;

    .line 37
    .line 38
    if-eqz v0, :cond_1

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    iget p1, p0, Lbsh/util/ValueReferenceMap;->found:I

    .line 47
    .line 48
    add-int/lit8 p1, p1, 0x1

    .line 49
    .line 50
    iput p1, p0, Lbsh/util/ValueReferenceMap;->found:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    monitor-exit p0

    .line 53
    return-object v0

    .line 54
    :cond_1
    :try_start_1
    iget v0, p0, Lbsh/util/ValueReferenceMap;->missed:I

    .line 55
    .line 56
    add-int/lit8 v0, v0, 0x1

    .line 57
    .line 58
    iput v0, p0, Lbsh/util/ValueReferenceMap;->missed:I

    .line 59
    .line 60
    iget-object v0, p0, Lbsh/util/ValueReferenceMap;->creator:Ljava/util/function/Function;

    .line 61
    .line 62
    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    const-string v1, "ValueReference cache create value may not return null."

    .line 67
    .line 68
    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, Lbsh/util/ValueReferenceMap;->type:Lbsh/util/ValueReferenceMap$Type;

    .line 72
    .line 73
    sget-object v2, Lbsh/util/ValueReferenceMap$Type;->Weak:Lbsh/util/ValueReferenceMap$Type;

    .line 74
    .line 75
    if-ne v1, v2, :cond_2

    .line 76
    .line 77
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 78
    .line 79
    iget-object v2, p0, Lbsh/util/ValueReferenceMap;->queue:Ljava/lang/ref/ReferenceQueue;

    .line 80
    .line 81
    invoke-direct {v1, v0, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_2
    new-instance v1, Ljava/lang/ref/SoftReference;

    .line 86
    .line 87
    iget-object v2, p0, Lbsh/util/ValueReferenceMap;->queue:Ljava/lang/ref/ReferenceQueue;

    .line 88
    .line 89
    invoke-direct {v1, v0, v2}, Ljava/lang/ref/SoftReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 90
    .line 91
    .line 92
    :goto_1
    iget-object v2, p0, Lbsh/util/ValueReferenceMap;->map:Ljava/util/HashMap;

    .line 93
    .line 94
    invoke-virtual {v2, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    iget-object v2, p0, Lbsh/util/ValueReferenceMap;->reverse:Ljava/util/HashMap;

    .line 98
    .line 99
    invoke-virtual {v2, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 100
    .line 101
    .line 102
    monitor-exit p0

    .line 103
    return-object v0

    .line 104
    :goto_2
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 105
    throw p1
.end method

.method public declared-synchronized remove(Ljava/lang/Object;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lbsh/util/ValueReferenceMap;->map:Ljava/util/HashMap;

    .line 3
    .line 4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    check-cast p1, Ljava/lang/ref/Reference;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Lbsh/util/ValueReferenceMap;->reverse:Ljava/util/HashMap;

    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    .line 21
    .line 22
    goto :goto_1

    .line 23
    :catchall_0
    move-exception p1

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_1
    monitor-exit p0

    .line 26
    return v0

    .line 27
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p1
.end method

.method public declared-synchronized size()I
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-direct {p0}, Lbsh/util/ValueReferenceMap;->clean()V

    .line 3
    .line 4
    .line 5
    iget-object v0, p0, Lbsh/util/ValueReferenceMap;->map:Ljava/util/HashMap;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 8
    .line 9
    .line 10
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    monitor-exit p0

    .line 12
    return v0

    .line 13
    :catchall_0
    move-exception v0

    .line 14
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 15
    throw v0
.end method
