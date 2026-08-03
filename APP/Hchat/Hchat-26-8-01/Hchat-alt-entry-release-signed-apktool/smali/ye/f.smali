.class public abstract Lye/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final a:Lmh/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lye/f;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lye/f;->a:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public static a(Lud/e;Ldf/i;Z)V
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lud/e;->k:Lud/u;

    .line 7
    .line 8
    iget-object v1, v1, Lud/u;->d:Lj8/f;

    .line 9
    .line 10
    iget-object v1, v1, Lj8/f;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lod/b;

    .line 13
    .line 14
    iget-object v1, v1, Lod/b;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    new-instance v2, Lce/e;

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-direct {v2, v0, v3}, Lce/e;-><init>(Ljava/lang/Object;I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->forEach(Ljava/util/function/BiConsumer;)V

    .line 23
    .line 24
    .line 25
    new-instance v1, Ljava/util/TreeMap;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/util/TreeMap;-><init>()V

    .line 28
    .line 29
    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    iget-object v2, p0, Lud/e;->v:Ljava/util/List;

    .line 33
    .line 34
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    if-eqz v3, :cond_0

    .line 43
    .line 44
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Lud/e;

    .line 49
    .line 50
    new-instance v4, Lye/e;

    .line 51
    .line 52
    invoke-direct {v4, v3}, Lye/e;-><init>(Lud/e;)V

    .line 53
    .line 54
    .line 55
    iget-object v5, v3, Lud/e;->u:Ljava/util/List;

    .line 56
    .line 57
    new-instance v6, Lye/b;

    .line 58
    .line 59
    const/4 v7, 0x0

    .line 60
    invoke-direct {v6, v4, v7}, Lye/b;-><init>(Lye/e;I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v5, v6}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 64
    .line 65
    .line 66
    iget-object v3, v3, Lud/e;->m:Lod/a;

    .line 67
    .line 68
    invoke-virtual {v3}, Lod/a;->k()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    invoke-virtual {v1, v3, v4}, Ljava/util/TreeMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_0
    iget-object p1, p1, Ldf/i;->a:Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_2

    .line 87
    .line 88
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    check-cast v2, Lef/c;

    .line 93
    .line 94
    iget-object v3, v2, Lef/c;->c:Ljava/lang/String;

    .line 95
    .line 96
    iget-object v4, v2, Lef/c;->d:Ljava/lang/String;

    .line 97
    .line 98
    const/16 v5, 0x2e

    .line 99
    .line 100
    const/16 v6, 0x5f

    .line 101
    .line 102
    invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    new-instance v5, Lye/c;

    .line 107
    .line 108
    invoke-direct {v5, p0, p2}, Lye/c;-><init>(Lud/e;Z)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v1, v3, v5}, Ljava/util/Map;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Lye/e;

    .line 116
    .line 117
    iget-object v5, v3, Lye/e;->b:Ljava/util/HashMap;

    .line 118
    .line 119
    new-instance v6, Lye/d;

    .line 120
    .line 121
    invoke-direct {v6, v3, v4, v2, p2}, Lye/d;-><init>(Lye/e;Ljava/lang/String;Lef/c;Z)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v5, v4, v6}, Ljava/util/HashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    iget v2, v2, Lef/c;->a:I

    .line 128
    .line 129
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    check-cast v2, Lud/g;

    .line 138
    .line 139
    if-eqz v2, :cond_1

    .line 140
    .line 141
    iget-object v3, v2, Lud/g;->l:Lod/c;

    .line 142
    .line 143
    iget-object v5, v3, Lod/c;->h:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-nez v5, :cond_1

    .line 150
    .line 151
    invoke-static {v4}, Lkd/d;->c(Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_1

    .line 156
    .line 157
    iget-object v5, p0, Lud/e;->k:Lud/u;

    .line 158
    .line 159
    iget-object v5, v5, Lud/u;->a:Lbc/g;

    .line 160
    .line 161
    invoke-virtual {v5}, Lbc/g;->a()Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-eqz v5, :cond_1

    .line 166
    .line 167
    sget-object v5, Lmd/a;->x:Lmd/a;

    .line 168
    .line 169
    invoke-virtual {v2, v5}, Lmd/e;->w(Lmd/a;)V

    .line 170
    .line 171
    .line 172
    iput-object v4, v3, Lod/c;->j:Ljava/lang/String;

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_2
    return-void
.end method
