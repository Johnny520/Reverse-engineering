.class public final Lio/sentry/q1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/X;


# instance fields
.field public a:Lio/sentry/i0;

.field public final b:Ljava/lang/ref/WeakReference;

.field public c:Lio/sentry/protocol/E;

.field public d:Ljava/lang/String;

.field public e:Lio/sentry/protocol/n;

.field public final f:Ljava/util/ArrayList;

.field public volatile g:Ljava/lang/Object;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public final i:Ljava/util/concurrent/ConcurrentHashMap;

.field public final j:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public volatile k:Lio/sentry/v2;

.field public volatile l:Lio/sentry/F2;

.field public final m:Lio/sentry/util/a;

.field public final n:Lio/sentry/util/a;

.field public final o:Lio/sentry/util/a;

.field public final p:Lio/sentry/protocol/c;

.field public final q:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public r:Lio/sentry/l;

.field public s:Lio/sentry/protocol/t;

.field public t:Lio/sentry/b0;

.field public final u:Ljava/util/Map;


# direct methods
.method public constructor <init>(Lio/sentry/q1;)V
    .locals 6

    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/sentry/q1;->b:Ljava/lang/ref/WeakReference;

    .line 27
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/q1;->f:Ljava/util/ArrayList;

    .line 28
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/q1;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/q1;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/q1;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 31
    new-instance v0, Lio/sentry/util/a;

    .line 32
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 33
    iput-object v0, p0, Lio/sentry/q1;->m:Lio/sentry/util/a;

    .line 34
    new-instance v0, Lio/sentry/util/a;

    .line 35
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 36
    iput-object v0, p0, Lio/sentry/q1;->n:Lio/sentry/util/a;

    .line 37
    new-instance v0, Lio/sentry/util/a;

    .line 38
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 39
    iput-object v0, p0, Lio/sentry/q1;->o:Lio/sentry/util/a;

    .line 40
    new-instance v0, Lio/sentry/protocol/c;

    invoke-direct {v0}, Lio/sentry/protocol/c;-><init>()V

    iput-object v0, p0, Lio/sentry/q1;->p:Lio/sentry/protocol/c;

    .line 41
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/q1;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 42
    sget-object v0, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    iput-object v0, p0, Lio/sentry/q1;->s:Lio/sentry/protocol/t;

    .line 43
    sget-object v0, Lio/sentry/R0;->a:Lio/sentry/R0;

    iput-object v0, p0, Lio/sentry/q1;->t:Lio/sentry/b0;

    .line 44
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 45
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/q1;->u:Ljava/util/Map;

    .line 46
    iget-object v0, p1, Lio/sentry/q1;->a:Lio/sentry/i0;

    iput-object v0, p0, Lio/sentry/q1;->a:Lio/sentry/i0;

    .line 47
    iget-object v0, p1, Lio/sentry/q1;->l:Lio/sentry/F2;

    iput-object v0, p0, Lio/sentry/q1;->l:Lio/sentry/F2;

    .line 48
    iget-object v0, p1, Lio/sentry/q1;->k:Lio/sentry/v2;

    iput-object v0, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    .line 49
    iget-object v0, p1, Lio/sentry/q1;->t:Lio/sentry/b0;

    iput-object v0, p0, Lio/sentry/q1;->t:Lio/sentry/b0;

    .line 50
    iget-object v0, p1, Lio/sentry/q1;->c:Lio/sentry/protocol/E;

    if-eqz v0, :cond_0

    .line 51
    new-instance v2, Lio/sentry/protocol/E;

    .line 52
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 53
    iget-object v3, v0, Lio/sentry/protocol/E;->a:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/E;->a:Ljava/lang/String;

    .line 54
    iget-object v3, v0, Lio/sentry/protocol/E;->c:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/E;->c:Ljava/lang/String;

    .line 55
    iget-object v3, v0, Lio/sentry/protocol/E;->b:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/E;->b:Ljava/lang/String;

    .line 56
    iget-object v3, v0, Lio/sentry/protocol/E;->d:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/E;->d:Ljava/lang/String;

    .line 57
    iget-object v3, v0, Lio/sentry/protocol/E;->e:Ljava/lang/String;

    iput-object v3, v2, Lio/sentry/protocol/E;->e:Ljava/lang/String;

    .line 58
    iget-object v3, v0, Lio/sentry/protocol/E;->f:Lio/sentry/protocol/h;

    iput-object v3, v2, Lio/sentry/protocol/E;->f:Lio/sentry/protocol/h;

    .line 59
    iget-object v3, v0, Lio/sentry/protocol/E;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v3}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v3

    iput-object v3, v2, Lio/sentry/protocol/E;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 60
    iget-object v0, v0, Lio/sentry/protocol/E;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    iput-object v0, v2, Lio/sentry/protocol/E;->h:Ljava/util/concurrent/ConcurrentHashMap;

    goto :goto_0

    :cond_0
    move-object v2, v1

    .line 61
    :goto_0
    iput-object v2, p0, Lio/sentry/q1;->c:Lio/sentry/protocol/E;

    .line 62
    iget-object v0, p1, Lio/sentry/q1;->d:Ljava/lang/String;

    iput-object v0, p0, Lio/sentry/q1;->d:Ljava/lang/String;

    .line 63
    iget-object v0, p1, Lio/sentry/q1;->s:Lio/sentry/protocol/t;

    iput-object v0, p0, Lio/sentry/q1;->s:Lio/sentry/protocol/t;

    .line 64
    iget-object v0, p1, Lio/sentry/q1;->e:Lio/sentry/protocol/n;

    if-eqz v0, :cond_1

    .line 65
    new-instance v1, Lio/sentry/protocol/n;

    .line 66
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 67
    iget-object v2, v0, Lio/sentry/protocol/n;->a:Ljava/lang/String;

    iput-object v2, v1, Lio/sentry/protocol/n;->a:Ljava/lang/String;

    .line 68
    iget-object v2, v0, Lio/sentry/protocol/n;->e:Ljava/lang/String;

    iput-object v2, v1, Lio/sentry/protocol/n;->e:Ljava/lang/String;

    .line 69
    iget-object v2, v0, Lio/sentry/protocol/n;->b:Ljava/lang/String;

    iput-object v2, v1, Lio/sentry/protocol/n;->b:Ljava/lang/String;

    .line 70
    iget-object v2, v0, Lio/sentry/protocol/n;->c:Ljava/lang/String;

    iput-object v2, v1, Lio/sentry/protocol/n;->c:Ljava/lang/String;

    .line 71
    iget-object v2, v0, Lio/sentry/protocol/n;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/n;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 72
    iget-object v2, v0, Lio/sentry/protocol/n;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/n;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 73
    iget-object v2, v0, Lio/sentry/protocol/n;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/n;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 74
    iget-object v2, v0, Lio/sentry/protocol/n;->l:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    iput-object v2, v1, Lio/sentry/protocol/n;->l:Ljava/util/concurrent/ConcurrentHashMap;

    .line 75
    iget-object v2, v0, Lio/sentry/protocol/n;->d:Ljava/lang/Object;

    iput-object v2, v1, Lio/sentry/protocol/n;->d:Ljava/lang/Object;

    .line 76
    iget-object v2, v0, Lio/sentry/protocol/n;->j:Ljava/lang/String;

    iput-object v2, v1, Lio/sentry/protocol/n;->j:Ljava/lang/String;

    .line 77
    iget-object v2, v0, Lio/sentry/protocol/n;->h:Ljava/lang/Long;

    iput-object v2, v1, Lio/sentry/protocol/n;->h:Ljava/lang/Long;

    .line 78
    iget-object v0, v0, Lio/sentry/protocol/n;->k:Ljava/lang/String;

    iput-object v0, v1, Lio/sentry/protocol/n;->k:Ljava/lang/String;

    .line 79
    :cond_1
    iput-object v1, p0, Lio/sentry/q1;->e:Lio/sentry/protocol/n;

    .line 80
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p1, Lio/sentry/q1;->f:Ljava/util/ArrayList;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lio/sentry/q1;->f:Ljava/util/ArrayList;

    .line 81
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v1, p1, Lio/sentry/q1;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lio/sentry/q1;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 82
    iget-object v0, p1, Lio/sentry/q1;->g:Ljava/lang/Object;

    const/4 v1, 0x0

    new-array v2, v1, [Lio/sentry/f;

    invoke-interface {v0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/sentry/f;

    .line 83
    iget-object v2, p1, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {v2}, Lio/sentry/v2;->getMaxBreadcrumbs()I

    move-result v2

    invoke-static {v2}, Lio/sentry/q1;->b(I)Ljava/util/Queue;

    move-result-object v2

    .line 84
    array-length v3, v0

    :goto_1
    if-ge v1, v3, :cond_2

    aget-object v4, v0, v1

    .line 85
    new-instance v5, Lio/sentry/f;

    invoke-direct {v5, v4}, Lio/sentry/f;-><init>(Lio/sentry/f;)V

    .line 86
    invoke-interface {v2, v5}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 87
    :cond_2
    iput-object v2, p0, Lio/sentry/q1;->g:Ljava/lang/Object;

    .line 88
    iget-object v0, p1, Lio/sentry/q1;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 89
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 90
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-eqz v2, :cond_3

    .line 91
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 92
    :cond_4
    iput-object v1, p0, Lio/sentry/q1;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 93
    iget-object v0, p1, Lio/sentry/q1;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 94
    new-instance v1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 95
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    if-eqz v2, :cond_5

    .line 96
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    .line 97
    :cond_6
    iput-object v1, p0, Lio/sentry/q1;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 98
    new-instance v0, Lio/sentry/protocol/c;

    iget-object v1, p1, Lio/sentry/q1;->p:Lio/sentry/protocol/c;

    invoke-direct {v0, v1}, Lio/sentry/protocol/c;-><init>(Lio/sentry/protocol/c;)V

    iput-object v0, p0, Lio/sentry/q1;->p:Lio/sentry/protocol/c;

    .line 99
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v1, p1, Lio/sentry/q1;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lio/sentry/q1;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 100
    new-instance v0, Lio/sentry/l;

    iget-object p1, p1, Lio/sentry/q1;->r:Lio/sentry/l;

    invoke-direct {v0, p1}, Lio/sentry/l;-><init>(Lio/sentry/l;)V

    iput-object v0, p0, Lio/sentry/q1;->r:Lio/sentry/l;

    return-void
.end method

.method public constructor <init>(Lio/sentry/v2;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lio/sentry/q1;->b:Ljava/lang/ref/WeakReference;

    .line 3
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/q1;->f:Ljava/util/ArrayList;

    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/q1;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/q1;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/q1;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 7
    new-instance v0, Lio/sentry/util/a;

    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 9
    iput-object v0, p0, Lio/sentry/q1;->m:Lio/sentry/util/a;

    .line 10
    new-instance v0, Lio/sentry/util/a;

    .line 11
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 12
    iput-object v0, p0, Lio/sentry/q1;->n:Lio/sentry/util/a;

    .line 13
    new-instance v0, Lio/sentry/util/a;

    .line 14
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 15
    iput-object v0, p0, Lio/sentry/q1;->o:Lio/sentry/util/a;

    .line 16
    new-instance v0, Lio/sentry/protocol/c;

    invoke-direct {v0}, Lio/sentry/protocol/c;-><init>()V

    iput-object v0, p0, Lio/sentry/q1;->p:Lio/sentry/protocol/c;

    .line 17
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    iput-object v0, p0, Lio/sentry/q1;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    sget-object v0, Lio/sentry/protocol/t;->b:Lio/sentry/protocol/t;

    iput-object v0, p0, Lio/sentry/q1;->s:Lio/sentry/protocol/t;

    .line 19
    sget-object v0, Lio/sentry/R0;->a:Lio/sentry/R0;

    iput-object v0, p0, Lio/sentry/q1;->t:Lio/sentry/b0;

    .line 20
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 21
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lio/sentry/q1;->u:Ljava/util/Map;

    .line 22
    const-string v0, "SentryOptions is required."

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    .line 23
    iget-object p1, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {p1}, Lio/sentry/v2;->getMaxBreadcrumbs()I

    move-result p1

    invoke-static {p1}, Lio/sentry/q1;->b(I)Ljava/util/Queue;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/q1;->g:Ljava/lang/Object;

    .line 24
    new-instance p1, Lio/sentry/l;

    invoke-direct {p1}, Lio/sentry/l;-><init>()V

    iput-object p1, p0, Lio/sentry/q1;->r:Lio/sentry/l;

    return-void
.end method

.method public static b(I)Ljava/util/Queue;
    .locals 1

    if-lez p0, :cond_0

    new-instance v0, Lio/sentry/h;

    invoke-direct {v0, p0}, Lio/sentry/h;-><init>(I)V

    new-instance p0, Lio/sentry/M2;

    invoke-direct {p0, v0}, Lio/sentry/M2;-><init>(Lio/sentry/h;)V

    return-object p0

    :cond_0
    new-instance p0, Lio/sentry/y;

    invoke-direct {p0}, Lio/sentry/y;-><init>()V

    return-object p0
.end method


# virtual methods
.method public final A()Lio/sentry/protocol/E;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->c:Lio/sentry/protocol/E;

    return-object v0
.end method

.method public final B(Lio/sentry/l;)V
    .locals 4

    iput-object p1, p0, Lio/sentry/q1;->r:Lio/sentry/l;

    new-instance v0, Lio/sentry/H2;

    iget-object v1, p1, Lio/sentry/l;->b:Ljava/lang/Object;

    check-cast v1, Lio/sentry/protocol/t;

    iget-object p1, p1, Lio/sentry/l;->c:Ljava/lang/Object;

    check-cast p1, Lio/sentry/K2;

    const-string v2, "default"

    const/4 v3, 0x0

    invoke-direct {v0, v1, p1, v2, v3}, Lio/sentry/H2;-><init>(Lio/sentry/protocol/t;Lio/sentry/K2;Ljava/lang/String;Lio/sentry/K2;)V

    const-string p1, "auto"

    iput-object p1, v0, Lio/sentry/H2;->i:Ljava/lang/String;

    iget-object p1, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {p1}, Lio/sentry/v2;->getScopeObservers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/Y;

    invoke-interface {v1, v0, p0}, Lio/sentry/Y;->d(Lio/sentry/H2;Lio/sentry/q1;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final C()Lio/sentry/a2;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final D()Lio/sentry/protocol/t;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->s:Lio/sentry/protocol/t;

    return-object v0
.end method

.method public final E()Lio/sentry/l;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->r:Lio/sentry/l;

    return-object v0
.end method

.method public final F(Lio/sentry/o1;)Lio/sentry/F2;
    .locals 2

    iget-object v0, p0, Lio/sentry/q1;->m:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/q1;->l:Lio/sentry/F2;

    invoke-interface {p1, v1}, Lio/sentry/o1;->a(Lio/sentry/F2;)V

    iget-object p1, p0, Lio/sentry/q1;->l:Lio/sentry/F2;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/sentry/q1;->l:Lio/sentry/F2;

    invoke-virtual {p1}, Lio/sentry/F2;->a()Lio/sentry/F2;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-object p1

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final G()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-static {v0}, Lio/sentry/config/a;->J(Ljava/util/concurrent/CopyOnWriteArrayList;)Ljava/util/concurrent/CopyOnWriteArrayList;

    move-result-object v0

    return-object v0
.end method

.method public final H(Ljava/lang/String;)V
    .locals 4

    iput-object p1, p0, Lio/sentry/q1;->d:Ljava/lang/String;

    iget-object v0, p0, Lio/sentry/q1;->p:Lio/sentry/protocol/c;

    invoke-virtual {v0}, Lio/sentry/protocol/c;->d()Lio/sentry/protocol/a;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lio/sentry/protocol/a;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0, v1}, Lio/sentry/protocol/c;->l(Lio/sentry/protocol/a;)V

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, v1, Lio/sentry/protocol/a;->i:Ljava/util/List;

    goto :goto_0

    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iput-object v2, v1, Lio/sentry/protocol/a;->i:Ljava/util/List;

    :goto_0
    iget-object p1, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {p1}, Lio/sentry/v2;->getScopeObservers()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/Y;

    invoke-interface {v1, v0}, Lio/sentry/Y;->e(Lio/sentry/protocol/c;)V

    goto :goto_1

    :cond_2
    return-void
.end method

.method public final I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->a:Lio/sentry/i0;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lio/sentry/i0;->getName()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final J()Lio/sentry/b0;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->t:Lio/sentry/b0;

    return-object v0
.end method

.method public final K()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v0}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    return-object v0
.end method

.method public final a()Lio/sentry/protocol/n;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->e:Lio/sentry/protocol/n;

    return-object v0
.end method

.method public final clear()V
    .locals 3

    const/4 v0, 0x0

    iput-object v0, p0, Lio/sentry/q1;->c:Lio/sentry/protocol/E;

    iput-object v0, p0, Lio/sentry/q1;->e:Lio/sentry/protocol/n;

    iput-object v0, p0, Lio/sentry/q1;->d:Ljava/lang/String;

    iget-object v0, p0, Lio/sentry/q1;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lio/sentry/q1;->g:Ljava/lang/Object;

    invoke-interface {v0}, Ljava/util/Collection;->clear()V

    iget-object v0, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getScopeObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/Y;

    iget-object v2, p0, Lio/sentry/q1;->g:Ljava/lang/Object;

    invoke-interface {v1, v2}, Lio/sentry/Y;->a(Ljava/util/Collection;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/q1;->h:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lio/sentry/q1;->i:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lio/sentry/q1;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    invoke-virtual {p0}, Lio/sentry/q1;->o()V

    iget-object v0, p0, Lio/sentry/q1;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    return-void
.end method

.method public final clone()Lio/sentry/X;
    .locals 1

    .line 1
    new-instance v0, Lio/sentry/q1;

    invoke-direct {v0, p0}, Lio/sentry/q1;-><init>(Lio/sentry/q1;)V

    return-object v0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 2
    new-instance v0, Lio/sentry/q1;

    invoke-direct {v0, p0}, Lio/sentry/q1;-><init>(Lio/sentry/q1;)V

    return-object v0
.end method

.method public final d()Lio/sentry/i0;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->a:Lio/sentry/i0;

    return-object v0
.end method

.method public final f(Lio/sentry/f;Lio/sentry/H;)V
    .locals 2

    if-eqz p1, :cond_2

    iget-object v0, p0, Lio/sentry/q1;->g:Ljava/lang/Object;

    instance-of v0, v0, Lio/sentry/y;

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    if-nez p2, :cond_1

    new-instance p2, Lio/sentry/H;

    invoke-direct {p2}, Lio/sentry/H;-><init>()V

    :cond_1
    iget-object p2, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {p2}, Lio/sentry/v2;->getBeforeBreadcrumb()Lio/sentry/j2;

    iget-object p2, p0, Lio/sentry/q1;->g:Ljava/lang/Object;

    invoke-interface {p2, p1}, Ljava/util/Queue;->add(Ljava/lang/Object;)Z

    iget-object p2, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {p2}, Lio/sentry/v2;->getScopeObservers()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/Y;

    invoke-interface {v0, p1}, Lio/sentry/Y;->c(Lio/sentry/f;)V

    iget-object v1, p0, Lio/sentry/q1;->g:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lio/sentry/Y;->a(Ljava/util/Collection;)V

    goto :goto_0

    :cond_2
    :goto_1
    return-void
.end method

.method public final getExtras()Ljava/util/Map;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->i:Ljava/util/concurrent/ConcurrentHashMap;

    return-object v0
.end method

.method public final i()Lio/sentry/F2;
    .locals 4

    iget-object v0, p0, Lio/sentry/q1;->m:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/q1;->l:Lio/sentry/F2;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object v1, p0, Lio/sentry/q1;->l:Lio/sentry/F2;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v1, v3}, Lio/sentry/F2;->b(Ljava/util/Date;)V

    iget-object v1, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {v1}, Lio/sentry/v2;->getContinuousProfiler()Lio/sentry/P;

    move-result-object v1

    invoke-interface {v1}, Lio/sentry/P;->p()V

    iget-object v1, p0, Lio/sentry/q1;->l:Lio/sentry/F2;

    invoke-virtual {v1}, Lio/sentry/F2;->a()Lio/sentry/F2;

    move-result-object v1

    iput-object v2, p0, Lio/sentry/q1;->l:Lio/sentry/F2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v2, v1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-object v2

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw v1
.end method

.method public final j()Lio/sentry/internal/debugmeta/c;
    .locals 20

    move-object/from16 v1, p0

    iget-object v0, v1, Lio/sentry/q1;->m:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v2

    :try_start_0
    iget-object v0, v1, Lio/sentry/q1;->l:Lio/sentry/F2;

    if-eqz v0, :cond_0

    iget-object v0, v1, Lio/sentry/q1;->l:Lio/sentry/F2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object v3

    invoke-virtual {v0, v3}, Lio/sentry/F2;->b(Ljava/util/Date;)V

    iget-object v0, v1, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getContinuousProfiler()Lio/sentry/P;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/P;->p()V

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v3, v0

    goto :goto_3

    :cond_0
    :goto_0
    iget-object v0, v1, Lio/sentry/q1;->l:Lio/sentry/F2;

    iget-object v3, v1, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {v3}, Lio/sentry/v2;->getRelease()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    new-instance v5, Lio/sentry/F2;

    iget-object v3, v1, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {v3}, Lio/sentry/v2;->getDistinctId()Ljava/lang/String;

    move-result-object v10

    iget-object v3, v1, Lio/sentry/q1;->c:Lio/sentry/protocol/E;

    iget-object v6, v1, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {v6}, Lio/sentry/v2;->getEnvironment()Ljava/lang/String;

    move-result-object v17

    iget-object v6, v1, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {v6}, Lio/sentry/v2;->getRelease()Ljava/lang/String;

    move-result-object v18

    sget-object v6, Lio/sentry/E2;->Ok:Lio/sentry/E2;

    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object v7

    invoke-static {}, Lio/sentry/config/a;->m()Ljava/util/Date;

    move-result-object v8

    invoke-static {}, Lio/sentry/config/a;->k()Ljava/lang/String;

    move-result-object v11

    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-eqz v3, :cond_1

    iget-object v3, v3, Lio/sentry/protocol/E;->d:Ljava/lang/String;

    move-object v15, v3

    goto :goto_1

    :cond_1
    move-object v15, v4

    :goto_1
    const/16 v16, 0x0

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v5 .. v19}, Lio/sentry/F2;-><init>(Lio/sentry/E2;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v5, v1, Lio/sentry/q1;->l:Lio/sentry/F2;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lio/sentry/F2;->a()Lio/sentry/F2;

    move-result-object v4

    :cond_2
    new-instance v0, Lio/sentry/internal/debugmeta/c;

    iget-object v3, v1, Lio/sentry/q1;->l:Lio/sentry/F2;

    invoke-virtual {v3}, Lio/sentry/F2;->a()Lio/sentry/F2;

    move-result-object v3

    const/4 v5, 0x4

    invoke-direct {v0, v5, v3, v4}, Lio/sentry/internal/debugmeta/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    move-object v4, v0

    goto :goto_2

    :cond_3
    iget-object v0, v1, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getLogger()Lio/sentry/ILogger;

    move-result-object v0

    sget-object v3, Lio/sentry/a2;->WARNING:Lio/sentry/a2;

    const-string v5, "Release is not set on SentryOptions. Session could not be started"

    const/4 v6, 0x0

    new-array v6, v6, [Ljava/lang/Object;

    invoke-interface {v0, v3, v5, v6}, Lio/sentry/ILogger;->e(Lio/sentry/a2;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_2
    invoke-virtual {v2}, Lio/sentry/r;->close()V

    return-object v4

    :goto_3
    :try_start_1
    invoke-virtual {v2}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catchall_1
    move-exception v0

    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_4
    throw v3
.end method

.method public final k(Lio/sentry/protocol/t;)V
    .locals 2

    iput-object p1, p0, Lio/sentry/q1;->s:Lio/sentry/protocol/t;

    iget-object v0, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getScopeObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/Y;

    invoke-interface {v1, p1}, Lio/sentry/Y;->k(Lio/sentry/protocol/t;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final l()Lio/sentry/v2;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    return-object v0
.end method

.method public final m()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->j:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object v0
.end method

.method public final n()Ljava/util/List;
    .locals 2

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v1, p0, Lio/sentry/q1;->q:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    return-object v0
.end method

.method public final o()V
    .locals 3

    iget-object v0, p0, Lio/sentry/q1;->n:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    const/4 v1, 0x0

    :try_start_0
    iput-object v1, p0, Lio/sentry/q1;->a:Lio/sentry/i0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    iget-object v0, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->getScopeObservers()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/Y;

    invoke-interface {v2, v1}, Lio/sentry/Y;->b(Ljava/lang/String;)V

    invoke-interface {v2, v1, p0}, Lio/sentry/Y;->d(Lio/sentry/H2;Lio/sentry/q1;)V

    goto :goto_0

    :cond_0
    return-void

    :catchall_0
    move-exception v1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v1
.end method

.method public final p(Lio/sentry/R1;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {v0}, Lio/sentry/v2;->isTracingEnabled()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio/sentry/C1;->a()Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/sentry/q1;->u:Ljava/util/Map;

    invoke-virtual {p1}, Lio/sentry/C1;->a()Ljava/lang/Throwable;

    move-result-object p1

    const-string v1, "throwable cannot be null"

    invoke-static {v1, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    :goto_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eq v1, p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/util/e;

    :cond_1
    return-void
.end method

.method public final q()Lio/sentry/protocol/c;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->p:Lio/sentry/protocol/c;

    return-object v0
.end method

.method public final r(Lio/sentry/n1;)Lio/sentry/l;
    .locals 2

    iget-object v0, p0, Lio/sentry/q1;->o:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/q1;->r:Lio/sentry/l;

    invoke-interface {p1, v1}, Lio/sentry/n1;->e(Lio/sentry/l;)V

    new-instance p1, Lio/sentry/l;

    iget-object v1, p0, Lio/sentry/q1;->r:Lio/sentry/l;

    invoke-direct {p1, v1}, Lio/sentry/l;-><init>(Lio/sentry/l;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-object p1

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->d:Ljava/lang/String;

    return-object v0
.end method

.method public final t()Lio/sentry/g0;
    .locals 2

    iget-object v0, p0, Lio/sentry/q1;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/g0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/sentry/q1;->a:Lio/sentry/i0;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lio/sentry/i0;->a()Lio/sentry/g0;

    move-result-object v1

    if-eqz v1, :cond_1

    return-object v1

    :cond_1
    return-object v0
.end method

.method public final u(Lio/sentry/p1;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/q1;->n:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/q1;->a:Lio/sentry/i0;

    invoke-interface {p1, v1}, Lio/sentry/p1;->c(Lio/sentry/i0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public final v(Lio/sentry/protocol/t;)V
    .locals 0

    return-void
.end method

.method public final w(Lio/sentry/i0;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/q1;->n:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    iput-object p1, p0, Lio/sentry/q1;->a:Lio/sentry/i0;

    iget-object v1, p0, Lio/sentry/q1;->k:Lio/sentry/v2;

    invoke-virtual {v1}, Lio/sentry/v2;->getScopeObservers()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/Y;

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lio/sentry/i0;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lio/sentry/Y;->b(Ljava/lang/String;)V

    invoke-interface {p1}, Lio/sentry/g0;->m()Lio/sentry/H2;

    move-result-object v3

    invoke-interface {v2, v3, p0}, Lio/sentry/Y;->d(Lio/sentry/H2;Lio/sentry/q1;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 v3, 0x0

    invoke-interface {v2, v3}, Lio/sentry/Y;->b(Ljava/lang/String;)V

    invoke-interface {v2, v3, p0}, Lio/sentry/Y;->d(Lio/sentry/H2;Lio/sentry/q1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V

    return-void

    :goto_1
    :try_start_1
    invoke-virtual {v0}, Lio/sentry/r;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catchall_1
    move-exception v0

    invoke-virtual {p1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2
    throw p1
.end method

.method public final x()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final y()Lio/sentry/F2;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->l:Lio/sentry/F2;

    return-object v0
.end method

.method public final z()Ljava/util/Queue;
    .locals 1

    iget-object v0, p0, Lio/sentry/q1;->g:Ljava/lang/Object;

    return-object v0
.end method
