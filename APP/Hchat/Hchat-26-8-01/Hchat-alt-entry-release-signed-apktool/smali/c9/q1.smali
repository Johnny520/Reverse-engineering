.class public final synthetic Lc9/q1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic a:Lr8/g;


# direct methods
.method public synthetic constructor <init>(Lr8/g;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lc9/q1;->a:Lr8/g;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Lb/e;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lc9/q1;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    invoke-static {v1}, Lc9/o2;->i(Landroid/content/Context;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 10
    .line 11
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object v3, p1, Lb/e;->i:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, Ll8/b;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    iget-object v3, v3, Ll8/b;->a:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-nez v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    iget-object p1, p1, Lb/e;->h:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast p1, Ll8/a;

    .line 34
    .line 35
    iget-object v3, p1, Ll8/a;->d:Landroid/content/ContentValues;

    .line 36
    .line 37
    const-string v4, "username"

    .line 38
    .line 39
    invoke-static {v3, v4}, Lh8/b;->b(Landroid/content/ContentValues;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-nez v5, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    iget-object v3, p1, Ll8/a;->e:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    const/4 v6, 0x0

    .line 59
    if-nez v5, :cond_3

    .line 60
    .line 61
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 62
    .line 63
    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-eqz v3, :cond_3

    .line 72
    .line 73
    iget-object p1, p1, Ll8/a;->f:[Ljava/lang/String;

    .line 74
    .line 75
    if-eqz p1, :cond_3

    .line 76
    .line 77
    array-length v3, p1

    .line 78
    move v4, v6

    .line 79
    :goto_0
    if-ge v4, v3, :cond_3

    .line 80
    .line 81
    aget-object v5, p1, v4

    .line 82
    .line 83
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 84
    .line 85
    .line 86
    move-result v7

    .line 87
    if-nez v7, :cond_2

    .line 88
    .line 89
    invoke-virtual {v2, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    new-array p1, v6, [Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v2, p1}, Ljava/util/AbstractCollection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    check-cast p1, [Ljava/lang/String;

    .line 102
    .line 103
    if-eqz p1, :cond_4

    .line 104
    .line 105
    invoke-static {p1}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    goto :goto_1

    .line 110
    :cond_4
    const/4 p1, 0x0

    .line 111
    :goto_1
    if-nez p1, :cond_5

    .line 112
    .line 113
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 114
    .line 115
    :cond_5
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_6

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_6
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 127
    .line 128
    .line 129
    move-result v2

    .line 130
    if-eqz v2, :cond_8

    .line 131
    .line 132
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    check-cast v2, Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-static {v2}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    if-nez v3, :cond_7

    .line 146
    .line 147
    invoke-static {v2, v1}, Lc9/o2;->d(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    if-eqz v2, :cond_7

    .line 152
    .line 153
    iget-object p1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 154
    .line 155
    invoke-static {p1}, Lc9/d2;->y(Landroid/content/Context;)V

    .line 156
    .line 157
    .line 158
    :cond_8
    :goto_2
    return-void
.end method
