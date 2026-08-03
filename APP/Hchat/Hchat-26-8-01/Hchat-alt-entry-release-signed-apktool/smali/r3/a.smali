.class public final Lr3/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Z

.field public final b:Lr3/d;

.field public final c:Ljava/util/LinkedHashSet;

.field public final d:Ljava/util/LinkedHashSet;

.field public final e:Ljava/util/LinkedHashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr3/d;

    .line 5
    .line 6
    invoke-direct {v0}, Lr3/d;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr3/a;->b:Lr3/d;

    .line 10
    .line 11
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lr3/a;->c:Ljava/util/LinkedHashSet;

    .line 17
    .line 18
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lr3/a;->d:Ljava/util/LinkedHashSet;

    .line 24
    .line 25
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lr3/a;->e:Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lr3/a;->a:Z

    .line 2
    .line 3
    if-nez v0, :cond_4

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lr3/a;->a:Z

    .line 7
    .line 8
    new-instance v1, Ltf/k;

    .line 9
    .line 10
    invoke-direct {v1}, Ltf/k;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, p0}, Ltf/k;->addLast(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    invoke-virtual {v1}, Ltf/k;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-nez v2, :cond_3

    .line 21
    .line 22
    invoke-virtual {v1}, Ltf/k;->removeFirst()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lr3/a;

    .line 27
    .line 28
    iput-boolean v0, v2, Lr3/a;->a:Z

    .line 29
    .line 30
    iget-object v3, v2, Lr3/a;->d:Ljava/util/LinkedHashSet;

    .line 31
    .line 32
    iget-object v4, v2, Lr3/a;->e:Ljava/util/LinkedHashSet;

    .line 33
    .line 34
    iget-object v2, v2, Lr3/a;->c:Ljava/util/LinkedHashSet;

    .line 35
    .line 36
    invoke-static {v1, v2}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 37
    .line 38
    .line 39
    invoke-static {v4}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 40
    .line 41
    .line 42
    move-result-object v5

    .line 43
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v6

    .line 51
    if-nez v6, :cond_1

    .line 52
    .line 53
    invoke-interface {v4}, Ljava/util/Set;->clear()V

    .line 54
    .line 55
    .line 56
    invoke-static {v3}, Ltf/m;->P1(Ljava/lang/Iterable;)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    if-eqz v5, :cond_0

    .line 69
    .line 70
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v5

    .line 74
    check-cast v5, Ls3/a;

    .line 75
    .line 76
    invoke-virtual {v5}, Ls3/a;->a()V

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_0
    invoke-interface {v3}, Ljava/util/Set;->clear()V

    .line 81
    .line 82
    .line 83
    invoke-interface {v2}, Ljava/util/Set;->clear()V

    .line 84
    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    if-eqz v0, :cond_2

    .line 92
    .line 93
    invoke-static {}, Lah/a;->d()V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_2
    iget-object v0, p0, Lr3/a;->b:Lr3/d;

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    const/4 v0, 0x0

    .line 103
    throw v0

    .line 104
    :cond_3
    return-void

    .line 105
    :cond_4
    const-string v0, "This NavigationEventDispatcher has already been disposed and cannot be used."

    .line 106
    .line 107
    invoke-static {v0}, Lj8/o;->A(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    return-void
.end method
