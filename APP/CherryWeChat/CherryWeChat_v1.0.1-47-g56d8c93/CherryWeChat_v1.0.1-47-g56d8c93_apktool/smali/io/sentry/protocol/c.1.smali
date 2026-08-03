.class public Lio/sentry/protocol/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/sentry/C0;


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentHashMap;

.field public final b:Lio/sentry/util/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    new-instance v0, Lio/sentry/util/a;

    .line 4
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 5
    iput-object v0, p0, Lio/sentry/protocol/c;->b:Lio/sentry/util/a;

    return-void
.end method

.method public constructor <init>(Lio/sentry/protocol/c;)V
    .locals 5

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    new-instance v0, Lio/sentry/util/a;

    .line 9
    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 10
    iput-object v0, p0, Lio/sentry/protocol/c;->b:Lio/sentry/util/a;

    .line 11
    invoke-virtual {p1}, Lio/sentry/protocol/c;->b()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    .line 12
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    .line 13
    const-string v2, "app"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    instance-of v2, v1, Lio/sentry/protocol/a;

    if-eqz v2, :cond_2

    .line 14
    new-instance v0, Lio/sentry/protocol/a;

    check-cast v1, Lio/sentry/protocol/a;

    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    iget-object v2, v1, Lio/sentry/protocol/a;->g:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->g:Ljava/lang/String;

    .line 17
    iget-object v2, v1, Lio/sentry/protocol/a;->a:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->a:Ljava/lang/String;

    .line 18
    iget-object v2, v1, Lio/sentry/protocol/a;->e:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->e:Ljava/lang/String;

    .line 19
    iget-object v2, v1, Lio/sentry/protocol/a;->b:Ljava/util/Date;

    iput-object v2, v0, Lio/sentry/protocol/a;->b:Ljava/util/Date;

    .line 20
    iget-object v2, v1, Lio/sentry/protocol/a;->f:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->f:Ljava/lang/String;

    .line 21
    iget-object v2, v1, Lio/sentry/protocol/a;->d:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->d:Ljava/lang/String;

    .line 22
    iget-object v2, v1, Lio/sentry/protocol/a;->c:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->c:Ljava/lang/String;

    .line 23
    iget-object v2, v1, Lio/sentry/protocol/a;->h:Ljava/util/AbstractMap;

    invoke-static {v2}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/a;->h:Ljava/util/AbstractMap;

    .line 24
    iget-object v2, v1, Lio/sentry/protocol/a;->k:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/a;->k:Ljava/lang/Boolean;

    .line 25
    iget-object v2, v1, Lio/sentry/protocol/a;->i:Ljava/util/List;

    if-eqz v2, :cond_1

    .line 26
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 27
    :cond_1
    iput-object v3, v0, Lio/sentry/protocol/a;->i:Ljava/util/List;

    .line 28
    iget-object v2, v1, Lio/sentry/protocol/a;->j:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/a;->j:Ljava/lang/String;

    .line 29
    iget-object v2, v1, Lio/sentry/protocol/a;->l:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/a;->l:Ljava/lang/Boolean;

    .line 30
    iget-object v2, v1, Lio/sentry/protocol/a;->m:Ljava/util/List;

    iput-object v2, v0, Lio/sentry/protocol/a;->m:Ljava/util/List;

    .line 31
    iget-object v1, v1, Lio/sentry/protocol/a;->n:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/a;->n:Ljava/util/concurrent/ConcurrentHashMap;

    .line 32
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->l(Lio/sentry/protocol/a;)V

    goto :goto_0

    .line 33
    :cond_2
    const-string v2, "browser"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    instance-of v2, v1, Lio/sentry/protocol/b;

    if-eqz v2, :cond_3

    .line 34
    new-instance v0, Lio/sentry/protocol/b;

    check-cast v1, Lio/sentry/protocol/b;

    .line 35
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 36
    iget-object v2, v1, Lio/sentry/protocol/b;->a:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/b;->a:Ljava/lang/String;

    .line 37
    iget-object v2, v1, Lio/sentry/protocol/b;->b:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/b;->b:Ljava/lang/String;

    .line 38
    iget-object v1, v1, Lio/sentry/protocol/b;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/b;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 39
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->m(Lio/sentry/protocol/b;)V

    goto/16 :goto_0

    .line 40
    :cond_3
    const-string v2, "device"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    instance-of v2, v1, Lio/sentry/protocol/f;

    if-eqz v2, :cond_6

    .line 41
    new-instance v0, Lio/sentry/protocol/f;

    check-cast v1, Lio/sentry/protocol/f;

    .line 42
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 43
    iget-object v2, v1, Lio/sentry/protocol/f;->a:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->a:Ljava/lang/String;

    .line 44
    iget-object v2, v1, Lio/sentry/protocol/f;->b:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->b:Ljava/lang/String;

    .line 45
    iget-object v2, v1, Lio/sentry/protocol/f;->c:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->c:Ljava/lang/String;

    .line 46
    iget-object v2, v1, Lio/sentry/protocol/f;->d:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->d:Ljava/lang/String;

    .line 47
    iget-object v2, v1, Lio/sentry/protocol/f;->e:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->e:Ljava/lang/String;

    .line 48
    iget-object v2, v1, Lio/sentry/protocol/f;->f:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->f:Ljava/lang/String;

    .line 49
    iget-object v2, v1, Lio/sentry/protocol/f;->i:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/f;->i:Ljava/lang/Boolean;

    .line 50
    iget-object v2, v1, Lio/sentry/protocol/f;->j:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/f;->j:Ljava/lang/Boolean;

    .line 51
    iget-object v2, v1, Lio/sentry/protocol/f;->k:Lio/sentry/protocol/e;

    iput-object v2, v0, Lio/sentry/protocol/f;->k:Lio/sentry/protocol/e;

    .line 52
    iget-object v2, v1, Lio/sentry/protocol/f;->l:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/f;->l:Ljava/lang/Boolean;

    .line 53
    iget-object v2, v1, Lio/sentry/protocol/f;->m:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->m:Ljava/lang/Long;

    .line 54
    iget-object v2, v1, Lio/sentry/protocol/f;->n:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->n:Ljava/lang/Long;

    .line 55
    iget-object v2, v1, Lio/sentry/protocol/f;->o:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->o:Ljava/lang/Long;

    .line 56
    iget-object v2, v1, Lio/sentry/protocol/f;->p:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/f;->p:Ljava/lang/Boolean;

    .line 57
    iget-object v2, v1, Lio/sentry/protocol/f;->q:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->q:Ljava/lang/Long;

    .line 58
    iget-object v2, v1, Lio/sentry/protocol/f;->r:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->r:Ljava/lang/Long;

    .line 59
    iget-object v2, v1, Lio/sentry/protocol/f;->s:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->s:Ljava/lang/Long;

    .line 60
    iget-object v2, v1, Lio/sentry/protocol/f;->t:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/f;->t:Ljava/lang/Long;

    .line 61
    iget-object v2, v1, Lio/sentry/protocol/f;->u:Ljava/lang/Integer;

    iput-object v2, v0, Lio/sentry/protocol/f;->u:Ljava/lang/Integer;

    .line 62
    iget-object v2, v1, Lio/sentry/protocol/f;->v:Ljava/lang/Integer;

    iput-object v2, v0, Lio/sentry/protocol/f;->v:Ljava/lang/Integer;

    .line 63
    iget-object v2, v1, Lio/sentry/protocol/f;->w:Ljava/lang/Float;

    iput-object v2, v0, Lio/sentry/protocol/f;->w:Ljava/lang/Float;

    .line 64
    iget-object v2, v1, Lio/sentry/protocol/f;->x:Ljava/lang/Integer;

    iput-object v2, v0, Lio/sentry/protocol/f;->x:Ljava/lang/Integer;

    .line 65
    iget-object v2, v1, Lio/sentry/protocol/f;->y:Ljava/util/Date;

    iput-object v2, v0, Lio/sentry/protocol/f;->y:Ljava/util/Date;

    .line 66
    iget-object v2, v1, Lio/sentry/protocol/f;->A:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->A:Ljava/lang/String;

    .line 67
    iget-object v2, v1, Lio/sentry/protocol/f;->C:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->C:Ljava/lang/String;

    .line 68
    iget-object v2, v1, Lio/sentry/protocol/f;->D:Ljava/lang/Float;

    iput-object v2, v0, Lio/sentry/protocol/f;->D:Ljava/lang/Float;

    .line 69
    iget-object v2, v1, Lio/sentry/protocol/f;->h:Ljava/lang/Float;

    iput-object v2, v0, Lio/sentry/protocol/f;->h:Ljava/lang/Float;

    .line 70
    iget-object v2, v1, Lio/sentry/protocol/f;->g:[Ljava/lang/String;

    if-eqz v2, :cond_4

    .line 71
    invoke-virtual {v2}, [Ljava/lang/String;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/String;

    goto :goto_1

    :cond_4
    move-object v2, v3

    :goto_1
    iput-object v2, v0, Lio/sentry/protocol/f;->g:[Ljava/lang/String;

    .line 72
    iget-object v2, v1, Lio/sentry/protocol/f;->B:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->B:Ljava/lang/String;

    .line 73
    iget-object v2, v1, Lio/sentry/protocol/f;->z:Ljava/util/TimeZone;

    if-eqz v2, :cond_5

    .line 74
    invoke-virtual {v2}, Ljava/util/TimeZone;->clone()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/TimeZone;

    :cond_5
    iput-object v3, v0, Lio/sentry/protocol/f;->z:Ljava/util/TimeZone;

    .line 75
    iget-object v2, v1, Lio/sentry/protocol/f;->E:Ljava/lang/Integer;

    iput-object v2, v0, Lio/sentry/protocol/f;->E:Ljava/lang/Integer;

    .line 76
    iget-object v2, v1, Lio/sentry/protocol/f;->F:Ljava/lang/Double;

    iput-object v2, v0, Lio/sentry/protocol/f;->F:Ljava/lang/Double;

    .line 77
    iget-object v2, v1, Lio/sentry/protocol/f;->G:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->G:Ljava/lang/String;

    .line 78
    iget-object v2, v1, Lio/sentry/protocol/f;->H:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/f;->H:Ljava/lang/String;

    .line 79
    iget-object v1, v1, Lio/sentry/protocol/f;->I:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/f;->I:Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->n(Lio/sentry/protocol/f;)V

    goto/16 :goto_0

    .line 81
    :cond_6
    const-string v2, "os"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    instance-of v2, v1, Lio/sentry/protocol/m;

    if-eqz v2, :cond_7

    .line 82
    new-instance v0, Lio/sentry/protocol/m;

    check-cast v1, Lio/sentry/protocol/m;

    .line 83
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 84
    iget-object v2, v1, Lio/sentry/protocol/m;->a:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/m;->a:Ljava/lang/String;

    .line 85
    iget-object v2, v1, Lio/sentry/protocol/m;->b:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/m;->b:Ljava/lang/String;

    .line 86
    iget-object v2, v1, Lio/sentry/protocol/m;->c:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/m;->c:Ljava/lang/String;

    .line 87
    iget-object v2, v1, Lio/sentry/protocol/m;->d:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/m;->d:Ljava/lang/String;

    .line 88
    iget-object v2, v1, Lio/sentry/protocol/m;->e:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/m;->e:Ljava/lang/String;

    .line 89
    iget-object v2, v1, Lio/sentry/protocol/m;->f:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/m;->f:Ljava/lang/Boolean;

    .line 90
    iget-object v1, v1, Lio/sentry/protocol/m;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/m;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 91
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->p(Lio/sentry/protocol/m;)V

    goto/16 :goto_0

    .line 92
    :cond_7
    const-string v2, "runtime"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    instance-of v2, v1, Lio/sentry/protocol/v;

    if-eqz v2, :cond_8

    .line 93
    new-instance v0, Lio/sentry/protocol/v;

    check-cast v1, Lio/sentry/protocol/v;

    .line 94
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 95
    iget-object v2, v1, Lio/sentry/protocol/v;->a:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/v;->a:Ljava/lang/String;

    .line 96
    iget-object v2, v1, Lio/sentry/protocol/v;->b:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/v;->b:Ljava/lang/String;

    .line 97
    iget-object v2, v1, Lio/sentry/protocol/v;->c:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/v;->c:Ljava/lang/String;

    .line 98
    iget-object v1, v1, Lio/sentry/protocol/v;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/v;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 99
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->r(Lio/sentry/protocol/v;)V

    goto/16 :goto_0

    .line 100
    :cond_8
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "feedback"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_9

    instance-of v2, v1, Lio/sentry/protocol/g;

    if-eqz v2, :cond_9

    .line 101
    new-instance v0, Lio/sentry/protocol/g;

    check-cast v1, Lio/sentry/protocol/g;

    .line 102
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 103
    iget-object v2, v1, Lio/sentry/protocol/g;->a:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/g;->a:Ljava/lang/String;

    .line 104
    iget-object v2, v1, Lio/sentry/protocol/g;->b:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/g;->b:Ljava/lang/String;

    .line 105
    iget-object v2, v1, Lio/sentry/protocol/g;->c:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/g;->c:Ljava/lang/String;

    .line 106
    iget-object v2, v1, Lio/sentry/protocol/g;->d:Lio/sentry/protocol/t;

    iput-object v2, v0, Lio/sentry/protocol/g;->d:Lio/sentry/protocol/t;

    .line 107
    iget-object v2, v1, Lio/sentry/protocol/g;->e:Lio/sentry/protocol/t;

    iput-object v2, v0, Lio/sentry/protocol/g;->e:Lio/sentry/protocol/t;

    .line 108
    iget-object v2, v1, Lio/sentry/protocol/g;->f:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/g;->f:Ljava/lang/String;

    .line 109
    iget-object v1, v1, Lio/sentry/protocol/g;->g:Ljava/util/AbstractMap;

    invoke-static {v1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/g;->g:Ljava/util/AbstractMap;

    .line 110
    invoke-virtual {p0, v3, v0}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 111
    :cond_9
    const-string v2, "gpu"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    instance-of v2, v1, Lio/sentry/protocol/i;

    if-eqz v2, :cond_a

    .line 112
    new-instance v0, Lio/sentry/protocol/i;

    check-cast v1, Lio/sentry/protocol/i;

    .line 113
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 114
    iget-object v2, v1, Lio/sentry/protocol/i;->a:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/i;->a:Ljava/lang/String;

    .line 115
    iget-object v2, v1, Lio/sentry/protocol/i;->b:Ljava/lang/Integer;

    iput-object v2, v0, Lio/sentry/protocol/i;->b:Ljava/lang/Integer;

    .line 116
    iget-object v2, v1, Lio/sentry/protocol/i;->c:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/i;->c:Ljava/lang/String;

    .line 117
    iget-object v2, v1, Lio/sentry/protocol/i;->d:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/i;->d:Ljava/lang/String;

    .line 118
    iget-object v2, v1, Lio/sentry/protocol/i;->e:Ljava/lang/Integer;

    iput-object v2, v0, Lio/sentry/protocol/i;->e:Ljava/lang/Integer;

    .line 119
    iget-object v2, v1, Lio/sentry/protocol/i;->f:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/i;->f:Ljava/lang/String;

    .line 120
    iget-object v2, v1, Lio/sentry/protocol/i;->g:Ljava/lang/Boolean;

    iput-object v2, v0, Lio/sentry/protocol/i;->g:Ljava/lang/Boolean;

    .line 121
    iget-object v2, v1, Lio/sentry/protocol/i;->h:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/i;->h:Ljava/lang/String;

    .line 122
    iget-object v2, v1, Lio/sentry/protocol/i;->i:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/i;->i:Ljava/lang/String;

    .line 123
    iget-object v1, v1, Lio/sentry/protocol/i;->j:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/i;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 124
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->o(Lio/sentry/protocol/i;)V

    goto/16 :goto_0

    .line 125
    :cond_a
    const-string v2, "trace"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    instance-of v2, v1, Lio/sentry/H2;

    if-eqz v2, :cond_b

    .line 126
    new-instance v0, Lio/sentry/H2;

    check-cast v1, Lio/sentry/H2;

    invoke-direct {v0, v1}, Lio/sentry/H2;-><init>(Lio/sentry/H2;)V

    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->t(Lio/sentry/H2;)V

    goto/16 :goto_0

    .line 127
    :cond_b
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    const-string v3, "profile"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    instance-of v2, v1, Lio/sentry/f1;

    if-eqz v2, :cond_d

    .line 128
    new-instance v0, Lio/sentry/f1;

    check-cast v1, Lio/sentry/f1;

    .line 129
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 130
    iget-object v2, v1, Lio/sentry/f1;->a:Lio/sentry/protocol/t;

    iput-object v2, v0, Lio/sentry/f1;->a:Lio/sentry/protocol/t;

    .line 131
    iget-object v1, v1, Lio/sentry/f1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 132
    invoke-static {v1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    if-eqz v1, :cond_c

    .line 133
    iput-object v1, v0, Lio/sentry/f1;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 134
    :cond_c
    invoke-virtual {p0, v3, v0}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    .line 135
    :cond_d
    const-string v2, "response"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_e

    instance-of v2, v1, Lio/sentry/protocol/p;

    if-eqz v2, :cond_e

    .line 136
    new-instance v0, Lio/sentry/protocol/p;

    check-cast v1, Lio/sentry/protocol/p;

    .line 137
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 138
    iget-object v2, v1, Lio/sentry/protocol/p;->a:Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/p;->a:Ljava/lang/String;

    .line 139
    iget-object v2, v1, Lio/sentry/protocol/p;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/p;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 140
    iget-object v2, v1, Lio/sentry/protocol/p;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v2}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/protocol/p;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 141
    iget-object v2, v1, Lio/sentry/protocol/p;->c:Ljava/lang/Integer;

    iput-object v2, v0, Lio/sentry/protocol/p;->c:Ljava/lang/Integer;

    .line 142
    iget-object v2, v1, Lio/sentry/protocol/p;->d:Ljava/lang/Long;

    iput-object v2, v0, Lio/sentry/protocol/p;->d:Ljava/lang/Long;

    .line 143
    iget-object v1, v1, Lio/sentry/protocol/p;->e:Ljava/lang/Object;

    iput-object v1, v0, Lio/sentry/protocol/p;->e:Ljava/lang/Object;

    .line 144
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->q(Lio/sentry/protocol/p;)V

    goto/16 :goto_0

    .line 145
    :cond_e
    const-string v2, "spring"

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_f

    instance-of v2, v1, Lio/sentry/protocol/B;

    if-eqz v2, :cond_f

    .line 146
    new-instance v0, Lio/sentry/protocol/B;

    check-cast v1, Lio/sentry/protocol/B;

    .line 147
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 148
    iget-object v2, v1, Lio/sentry/protocol/B;->a:[Ljava/lang/String;

    iput-object v2, v0, Lio/sentry/protocol/B;->a:[Ljava/lang/String;

    .line 149
    iget-object v1, v1, Lio/sentry/protocol/B;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {v1}, Lio/sentry/config/a;->A(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v1

    iput-object v1, v0, Lio/sentry/protocol/B;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 150
    invoke-virtual {p0, v0}, Lio/sentry/protocol/c;->s(Lio/sentry/protocol/B;)V

    goto/16 :goto_0

    .line 151
    :cond_f
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0, v1}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_10
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Object;)Z
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public d()Lio/sentry/protocol/a;
    .locals 2

    const-string v0, "app"

    const-class v1, Lio/sentry/protocol/a;

    invoke-virtual {p0, v1, v0}, Lio/sentry/protocol/c;->u(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/a;

    return-object v0
.end method

.method public e()Lio/sentry/protocol/f;
    .locals 2

    const-string v0, "device"

    const-class v1, Lio/sentry/protocol/f;

    invoke-virtual {p0, v1, v0}, Lio/sentry/protocol/c;->u(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/f;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-eqz p1, :cond_0

    instance-of v0, p1, Lio/sentry/protocol/c;

    if-eqz v0, :cond_0

    check-cast p1, Lio/sentry/protocol/c;

    iget-object v0, p0, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object p1, p1, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public f()Lio/sentry/protocol/m;
    .locals 2

    const-string v0, "os"

    const-class v1, Lio/sentry/protocol/m;

    invoke-virtual {p0, v1, v0}, Lio/sentry/protocol/c;->u(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/m;

    return-object v0
.end method

.method public g()Lio/sentry/protocol/v;
    .locals 2

    const-string v0, "runtime"

    const-class v1, Lio/sentry/protocol/v;

    invoke-virtual {p0, v1, v0}, Lio/sentry/protocol/c;->u(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/v;

    return-object v0
.end method

.method public h()Lio/sentry/H2;
    .locals 2

    const-string v0, "trace"

    const-class v1, Lio/sentry/H2;

    invoke-virtual {p0, v1, v0}, Lio/sentry/protocol/c;->u(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/H2;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Ljava/util/Enumeration;
    .locals 1

    iget-object v0, p0, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->keys()Ljava/util/Enumeration;

    move-result-object v0

    return-object v0
.end method

.method public j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    if-nez p2, :cond_1

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public k(Lio/sentry/protocol/c;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object p1, p1, Lio/sentry/protocol/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public l(Lio/sentry/protocol/a;)V
    .locals 1

    const-string v0, "app"

    invoke-virtual {p0, v0, p1}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public m(Lio/sentry/protocol/b;)V
    .locals 1

    const-string v0, "browser"

    invoke-virtual {p0, v0, p1}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public n(Lio/sentry/protocol/f;)V
    .locals 1

    const-string v0, "device"

    invoke-virtual {p0, v0, p1}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public o(Lio/sentry/protocol/i;)V
    .locals 1

    const-string v0, "gpu"

    invoke-virtual {p0, v0, p1}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public p(Lio/sentry/protocol/m;)V
    .locals 1

    const-string v0, "os"

    invoke-virtual {p0, v0, p1}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public q(Lio/sentry/protocol/p;)V
    .locals 2

    iget-object v0, p0, Lio/sentry/protocol/c;->b:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/r;

    move-result-object v0

    :try_start_0
    const-string v1, "response"

    invoke-virtual {p0, v1, p1}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
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

.method public r(Lio/sentry/protocol/v;)V
    .locals 1

    const-string v0, "runtime"

    invoke-virtual {p0, v0, p1}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public s(Lio/sentry/protocol/B;)V
    .locals 1

    const-string v0, "spring"

    invoke-virtual {p0, v0, p1}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public serialize(Lio/sentry/Z0;Lio/sentry/ILogger;)V
    .locals 3

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->h()Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p0}, Lio/sentry/protocol/c;->i()Ljava/util/Enumeration;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {p0, v1}, Lio/sentry/protocol/c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {p1, v1}, Lio/sentry/internal/debugmeta/c;->p(Ljava/lang/String;)Lio/sentry/internal/debugmeta/c;

    invoke-virtual {p1, p2, v2}, Lio/sentry/internal/debugmeta/c;->w(Lio/sentry/ILogger;Ljava/lang/Object;)Lio/sentry/internal/debugmeta/c;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lio/sentry/internal/debugmeta/c;->k()Lio/sentry/internal/debugmeta/c;

    return-void
.end method

.method public t(Lio/sentry/H2;)V
    .locals 1

    const-string v0, "traceContext is required"

    invoke-static {v0, p1}, Lio/sentry/config/a;->D(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "trace"

    invoke-virtual {p0, v0, p1}, Lio/sentry/protocol/c;->j(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final u(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0, p2}, Lio/sentry/protocol/c;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1, p2}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
