.class public final Lug/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ltg/d;


# instance fields
.field public final g:Lwf/g;

.field public final h:I

.field public final i:Lsg/a;

.field public final j:Ltg/d;

.field public final k:Lyf/i;


# direct methods
.method public constructor <init>(Lfg/q;Ltg/d;Lwf/g;ILsg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lug/g;->g:Lwf/g;

    .line 5
    .line 6
    iput p4, p0, Lug/g;->h:I

    .line 7
    .line 8
    iput-object p5, p0, Lug/g;->i:Lsg/a;

    .line 9
    .line 10
    iput-object p2, p0, Lug/g;->j:Ltg/d;

    .line 11
    .line 12
    check-cast p1, Lyf/i;

    .line 13
    .line 14
    iput-object p1, p0, Lug/g;->k:Lyf/i;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ltg/e;Lyf/c;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lug/e;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, Lug/e;-><init>(Lug/g;Ltg/e;Lwf/c;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p2}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 12
    .line 13
    if-ne p1, p2, :cond_0

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 17
    .line 18
    return-object p1
.end method

.method public final b(Ltg/e;Lwf/c;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lug/g;->h:I

    .line 2
    .line 3
    const/4 v1, -0x3

    .line 4
    sget-object v2, Lxf/a;->g:Lxf/a;

    .line 5
    .line 6
    if-ne v0, v1, :cond_4

    .line 7
    .line 8
    invoke-interface {p2}, Lwf/c;->getContext()Lwf/g;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 13
    .line 14
    new-instance v3, Li2/y;

    .line 15
    .line 16
    const/16 v4, 0xd

    .line 17
    .line 18
    invoke-direct {v3, v4}, Li2/y;-><init>(I)V

    .line 19
    .line 20
    .line 21
    iget-object v4, p0, Lug/g;->g:Lwf/g;

    .line 22
    .line 23
    invoke-interface {v4, v3, v1}, Lwf/g;->k(Lfg/p;Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_0

    .line 34
    .line 35
    invoke-interface {v0, v4}, Lwf/g;->e(Lwf/g;)Lwf/g;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const/4 v1, 0x0

    .line 41
    invoke-static {v0, v4, v1}, Lqg/v;->h(Lwf/g;Lwf/g;Z)Lwf/g;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    :goto_0
    invoke-static {v1, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_1

    .line 50
    .line 51
    check-cast p2, Lyf/c;

    .line 52
    .line 53
    invoke-virtual {p0, p1, p2}, Lug/g;->a(Ltg/e;Lyf/c;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    if-ne p1, v2, :cond_6

    .line 58
    .line 59
    return-object p1

    .line 60
    :cond_1
    sget-object v3, Lwf/d;->g:Lwf/d;

    .line 61
    .line 62
    invoke-interface {v1, v3}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-interface {v0, v3}, Lwf/g;->s(Lwf/f;)Lwf/e;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-static {v4, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-eqz v0, :cond_4

    .line 75
    .line 76
    invoke-interface {p2}, Lwf/c;->getContext()Lwf/g;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    instance-of v3, p1, Lug/n;

    .line 81
    .line 82
    if-nez v3, :cond_3

    .line 83
    .line 84
    instance-of v3, p1, Lug/j;

    .line 85
    .line 86
    if-eqz v3, :cond_2

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_2
    new-instance v3, Lh/w;

    .line 90
    .line 91
    invoke-direct {v3, p1, v0}, Lh/w;-><init>(Ltg/e;Lwf/g;)V

    .line 92
    .line 93
    .line 94
    move-object p1, v3

    .line 95
    :cond_3
    :goto_1
    new-instance v0, Lci/j;

    .line 96
    .line 97
    const/4 v3, 0x0

    .line 98
    const/16 v4, 0x10

    .line 99
    .line 100
    invoke-direct {v0, p0, v3, v4}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 101
    .line 102
    .line 103
    invoke-static {v1}, Lvg/a;->k(Lwf/g;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-static {v1, p1, v3, v0, p2}, Lug/c;->a(Lwf/g;Ljava/lang/Object;Ljava/lang/Object;Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    if-ne p1, v2, :cond_6

    .line 112
    .line 113
    return-object p1

    .line 114
    :cond_4
    new-instance v0, Lc0/m;

    .line 115
    .line 116
    const/4 v1, 0x0

    .line 117
    const/16 v3, 0x11

    .line 118
    .line 119
    invoke-direct {v0, p1, p0, v1, v3}, Lc0/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lwf/c;I)V

    .line 120
    .line 121
    .line 122
    invoke-static {v0, p2}, Lqg/v;->e(Lfg/p;Lwf/c;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p1

    .line 126
    sget-object p2, Lxf/a;->g:Lxf/a;

    .line 127
    .line 128
    if-ne p1, p2, :cond_5

    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_5
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 132
    .line 133
    :goto_2
    if-ne p1, v2, :cond_6

    .line 134
    .line 135
    return-object p1

    .line 136
    :cond_6
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 137
    .line 138
    return-object p1
.end method

.method public final c()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sget-object v1, Lwf/h;->g:Lwf/h;

    .line 8
    .line 9
    iget-object v2, p0, Lug/g;->g:Lwf/g;

    .line 10
    .line 11
    if-eq v2, v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "context="

    .line 16
    .line 17
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    :cond_0
    const/4 v1, -0x3

    .line 31
    iget v2, p0, Lug/g;->h:I

    .line 32
    .line 33
    if-eq v2, v1, :cond_1

    .line 34
    .line 35
    new-instance v1, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v3, "capacity="

    .line 38
    .line 39
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    :cond_1
    sget-object v1, Lsg/a;->g:Lsg/a;

    .line 53
    .line 54
    iget-object v2, p0, Lug/g;->i:Lsg/a;

    .line 55
    .line 56
    if-eq v2, v1, :cond_2

    .line 57
    .line 58
    new-instance v1, Ljava/lang/StringBuilder;

    .line 59
    .line 60
    const-string v3, "onBufferOverflow="

    .line 61
    .line 62
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    :cond_2
    new-instance v6, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const/16 v1, 0x5b

    .line 92
    .line 93
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    const/4 v4, 0x0

    .line 97
    const/16 v5, 0x3e

    .line 98
    .line 99
    const-string v1, ", "

    .line 100
    .line 101
    const/4 v2, 0x0

    .line 102
    const/4 v3, 0x0

    .line 103
    invoke-static/range {v0 .. v5}, Ltf/m;->A1(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lfg/l;I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    const/16 v1, 0x5d

    .line 108
    .line 109
    invoke-static {v6, v0, v1}, Leh/a;->q(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lug/g;->j:Ltg/d;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const-string v1, " -> "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lug/g;->c()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method
