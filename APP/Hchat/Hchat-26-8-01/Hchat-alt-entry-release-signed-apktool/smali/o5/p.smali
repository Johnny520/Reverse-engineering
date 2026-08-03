.class public final Lo5/p;
.super Li5/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lv5/c;
.implements Ls5/a;


# instance fields
.field public final synthetic j:Ljava/util/Set;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lo5/p;->j:Ljava/util/Set;

    .line 5
    .line 6
    iput-object p1, p0, Lo5/p;->k:Ljava/lang/String;

    .line 7
    .line 8
    iput-object p2, p0, Lo5/p;->l:Ljava/lang/String;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final e()Ljava/lang/String;
    .locals 6

    .line 1
    iget-object v0, p0, Lo5/p;->j:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Lk5/b;

    .line 19
    .line 20
    invoke-virtual {v1}, Lk5/b;->getType()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "Ldalvik/annotation/Signature;"

    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_0

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    move-object v1, v2

    .line 34
    :goto_0
    if-nez v1, :cond_2

    .line 35
    .line 36
    goto :goto_3

    .line 37
    :cond_2
    invoke-virtual {v1}, Lk5/b;->a()Lk5/a;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Lk5/a;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :cond_3
    move-object v1, v0

    .line 46
    check-cast v1, Lo5/g;

    .line 47
    .line 48
    invoke-virtual {v1}, Lo5/g;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_5

    .line 53
    .line 54
    invoke-virtual {v1}, Lo5/g;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Lk5/c;

    .line 59
    .line 60
    invoke-virtual {v1}, Lk5/c;->a()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    const-string v4, "value"

    .line 65
    .line 66
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v3

    .line 70
    if-eqz v3, :cond_3

    .line 71
    .line 72
    invoke-virtual {v1}, Lk5/c;->b()Lw5/a;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-interface {v0}, Lw5/a;->h()I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/16 v3, 0x1c

    .line 81
    .line 82
    if-eq v1, v3, :cond_4

    .line 83
    .line 84
    goto :goto_3

    .line 85
    :cond_4
    check-cast v0, Lp5/b;

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_5
    move-object v0, v2

    .line 89
    :goto_1
    if-nez v0, :cond_6

    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lp5/b;->a()Ljava/util/List;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_8

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    check-cast v3, Lw5/a;

    .line 116
    .line 117
    invoke-interface {v3}, Lw5/a;->h()I

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    const/16 v5, 0x17

    .line 122
    .line 123
    if-eq v4, v5, :cond_7

    .line 124
    .line 125
    :goto_3
    return-object v2

    .line 126
    :cond_7
    check-cast v3, Lp5/h;

    .line 127
    .line 128
    invoke-virtual {v3}, Lp5/h;->a()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_8
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lo5/p;->k:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lo5/p;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
