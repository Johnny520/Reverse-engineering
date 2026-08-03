.class public final Lj6/c;
.super Lh6/n;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public volatile a:Lh6/n;

.field public final synthetic b:Z

.field public final synthetic c:Lh6/f;

.field public final synthetic d:Ln6/a;

.field public final synthetic e:Lj6/d;


# direct methods
.method public constructor <init>(Lj6/d;ZLh6/f;Ln6/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lj6/c;->e:Lj6/d;

    .line 5
    .line 6
    iput-boolean p2, p0, Lj6/c;->b:Z

    .line 7
    .line 8
    iput-object p3, p0, Lj6/c;->c:Lh6/f;

    .line 9
    .line 10
    iput-object p4, p0, Lj6/c;->d:Ln6/a;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Lo6/a;Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-boolean v0, p0, Lj6/c;->b:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lo6/a;->l()Lo6/a;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, Lj6/c;->a:Lh6/n;

    .line 10
    .line 11
    if-nez v0, :cond_b

    .line 12
    .line 13
    iget-object v0, p0, Lj6/c;->c:Lh6/f;

    .line 14
    .line 15
    iget-object v1, p0, Lj6/c;->e:Lj6/d;

    .line 16
    .line 17
    iget-object v2, p0, Lj6/c;->d:Ln6/a;

    .line 18
    .line 19
    iget-object v3, v0, Lh6/f;->d:Lk6/l;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v4, v3, Lk6/l;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    sget-object v5, Lk6/l;->i:Lk6/k;

    .line 27
    .line 28
    const/4 v6, 0x1

    .line 29
    if-ne v1, v5, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    iget-object v5, v2, Ln6/a;->a:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v7

    .line 38
    check-cast v7, Lh6/o;

    .line 39
    .line 40
    if-eqz v7, :cond_2

    .line 41
    .line 42
    if-ne v7, v1, :cond_6

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_2
    const-class v7, Li6/a;

    .line 46
    .line 47
    invoke-virtual {v5, v7}, Ljava/lang/Class;->getAnnotation(Ljava/lang/Class;)Ljava/lang/annotation/Annotation;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    check-cast v7, Li6/a;

    .line 52
    .line 53
    if-nez v7, :cond_3

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-interface {v7}, Li6/a;->value()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    const-class v8, Lh6/o;

    .line 61
    .line 62
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 63
    .line 64
    .line 65
    move-result v8

    .line 66
    if-nez v8, :cond_4

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_4
    iget-object v8, v3, Lk6/l;->g:Lh0/q0;

    .line 70
    .line 71
    new-instance v9, Ln6/a;

    .line 72
    .line 73
    invoke-direct {v9, v7}, Ln6/a;-><init>(Ljava/lang/reflect/Type;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v8, v9, v6}, Lh0/q0;->c(Ln6/a;Z)Lj6/o;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    invoke-interface {v7}, Lj6/o;->d()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    check-cast v7, Lh6/o;

    .line 85
    .line 86
    invoke-virtual {v4, v5, v7}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    check-cast v4, Lh6/o;

    .line 91
    .line 92
    if-eqz v4, :cond_5

    .line 93
    .line 94
    move-object v7, v4

    .line 95
    :cond_5
    if-ne v7, v1, :cond_6

    .line 96
    .line 97
    :goto_0
    move-object v1, v3

    .line 98
    :cond_6
    :goto_1
    iget-object v3, v0, Lh6/f;->e:Ljava/util/List;

    .line 99
    .line 100
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    const/4 v4, 0x0

    .line 105
    :cond_7
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_9

    .line 110
    .line 111
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    check-cast v5, Lh6/o;

    .line 116
    .line 117
    if-nez v4, :cond_8

    .line 118
    .line 119
    if-ne v5, v1, :cond_7

    .line 120
    .line 121
    move v4, v6

    .line 122
    goto :goto_2

    .line 123
    :cond_8
    invoke-interface {v5, v0, v2}, Lh6/o;->a(Lh6/f;Ln6/a;)Lh6/n;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    if-eqz v5, :cond_7

    .line 128
    .line 129
    move-object v0, v5

    .line 130
    goto :goto_3

    .line 131
    :cond_9
    if-nez v4, :cond_a

    .line 132
    .line 133
    invoke-virtual {v0, v2}, Lh6/f;->b(Ln6/a;)Lh6/n;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    :goto_3
    iput-object v0, p0, Lj6/c;->a:Lh6/n;

    .line 138
    .line 139
    goto :goto_4

    .line 140
    :cond_a
    const-string p1, "GSON cannot serialize or deserialize "

    .line 141
    .line 142
    invoke-static {v2, p1}, Lg1/d;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_b
    :goto_4
    invoke-virtual {v0, p1, p2}, Lh6/n;->b(Lo6/a;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    return-void
.end method
