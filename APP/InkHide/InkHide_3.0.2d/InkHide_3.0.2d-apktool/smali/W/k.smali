.class public final LW/k;
.super LT/y;
.source "SourceFile"


# instance fields
.field public final a:LW/s;

.field public final b:LW/s;

.field public final c:LV/p;

.field public final synthetic d:LW/c;


# direct methods
.method public constructor <init>(LW/c;LT/l;Ljava/lang/reflect/Type;LT/y;Ljava/lang/reflect/Type;LT/y;LV/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LW/k;->d:LW/c;

    .line 5
    .line 6
    new-instance p1, LW/s;

    .line 7
    .line 8
    invoke-direct {p1, p2, p4, p3}, LW/s;-><init>(LT/l;LT/y;Ljava/lang/reflect/Type;)V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, LW/k;->a:LW/s;

    .line 12
    .line 13
    new-instance p1, LW/s;

    .line 14
    .line 15
    invoke-direct {p1, p2, p6, p5}, LW/s;-><init>(LT/l;LT/y;Ljava/lang/reflect/Type;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, LW/k;->b:LW/s;

    .line 19
    .line 20
    iput-object p7, p0, LW/k;->c:LV/p;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a(Lb0/b;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Lb0/b;->x()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/16 v1, 0x9

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p1}, Lb0/b;->t()V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    return-object p1

    .line 14
    :cond_0
    iget-object v1, p0, LW/k;->c:LV/p;

    .line 15
    .line 16
    invoke-interface {v1}, LV/p;->n()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    check-cast v1, Ljava/util/Map;

    .line 21
    .line 22
    iget-object v2, p0, LW/k;->b:LW/s;

    .line 23
    .line 24
    iget-object v3, p0, LW/k;->a:LW/s;

    .line 25
    .line 26
    const/4 v4, 0x1

    .line 27
    iget-object v2, v2, LW/s;->c:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v2, LT/y;

    .line 30
    .line 31
    iget-object v3, v3, LW/s;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, LT/y;

    .line 34
    .line 35
    const-string v5, "duplicate key: "

    .line 36
    .line 37
    if-ne v0, v4, :cond_3

    .line 38
    .line 39
    invoke-virtual {p1}, Lb0/b;->a()V

    .line 40
    .line 41
    .line 42
    :goto_0
    invoke-virtual {p1}, Lb0/b;->k()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p1}, Lb0/b;->a()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3, p1}, LT/y;->a(Lb0/b;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v2, p1}, LT/y;->a(Lb0/b;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-nez v4, :cond_1

    .line 64
    .line 65
    invoke-virtual {p1}, Lb0/b;->e()V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_1
    new-instance p1, LT/p;

    .line 70
    .line 71
    new-instance v1, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw p1

    .line 87
    :cond_2
    invoke-virtual {p1}, Lb0/b;->e()V

    .line 88
    .line 89
    .line 90
    return-object v1

    .line 91
    :cond_3
    invoke-virtual {p1}, Lb0/b;->b()V

    .line 92
    .line 93
    .line 94
    :goto_1
    invoke-virtual {p1}, Lb0/b;->k()Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-eqz v0, :cond_5

    .line 99
    .line 100
    sget-object v0, Lb0/a;->a:Lb0/a;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    invoke-static {p1}, Lb0/a;->a(Lb0/b;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, p1}, LT/y;->a(Lb0/b;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v2, p1}, LT/y;->a(Lb0/b;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-interface {v1, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    if-nez v4, :cond_4

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_4
    new-instance p1, LT/p;

    .line 124
    .line 125
    new-instance v1, Ljava/lang/StringBuilder;

    .line 126
    .line 127
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    invoke-direct {p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    throw p1

    .line 141
    :cond_5
    invoke-virtual {p1}, Lb0/b;->f()V

    .line 142
    .line 143
    .line 144
    return-object v1
.end method

.method public final b(Lb0/c;Ljava/lang/Object;)V
    .locals 3

    .line 1
    check-cast p2, Ljava/util/Map;

    .line 2
    .line 3
    if-nez p2, :cond_0

    .line 4
    .line 5
    invoke-virtual {p1}, Lb0/c;->i()Lb0/c;

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    iget-object v0, p0, LW/k;->d:LW/c;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, LW/k;->b:LW/s;

    .line 15
    .line 16
    invoke-virtual {p1}, Lb0/c;->c()V

    .line 17
    .line 18
    .line 19
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/util/Map$Entry;

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-virtual {p1, v2}, Lb0/c;->g(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    invoke-virtual {v0, p1, v1}, LW/s;->b(Lb0/c;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    invoke-virtual {p1}, Lb0/c;->f()V

    .line 59
    .line 60
    .line 61
    return-void
.end method
