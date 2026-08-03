.class public final synthetic Lud/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Predicate;


# instance fields
.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lud/b;->g:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final test(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    iget v0, p0, Lud/b;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Lud/j;

    .line 9
    .line 10
    invoke-static {p1}, Ljava/util/Objects;->nonNull(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1

    .line 15
    :pswitch_0
    check-cast p1, Lud/j;

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-static {p1, p1}, Lf8/i;->L(Lud/j;Lud/j;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    :goto_0
    return v2

    .line 25
    :pswitch_1
    check-cast p1, Lqd/r;

    .line 26
    .line 27
    iget-object v0, p1, Lmd/e;->g:Lmd/f;

    .line 28
    .line 29
    sget-object v3, Lmd/a;->s:Lmd/a;

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    iget-object p1, p1, Lqd/l;->j:Lud/p;

    .line 38
    .line 39
    sget-object v0, Lxe/m;->a:Lmh/b;

    .line 40
    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    iget-object p1, p1, Lmd/e;->g:Lmd/f;

    .line 44
    .line 45
    invoke-virtual {p1, v3}, Lmd/f;->a(Lmd/a;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-eqz p1, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    move v1, v2

    .line 53
    :cond_2
    :goto_1
    return v1

    .line 54
    :pswitch_2
    check-cast p1, Lqd/r;

    .line 55
    .line 56
    iget-object p1, p1, Lqd/l;->j:Lud/p;

    .line 57
    .line 58
    sget-object v0, Lpd/k;->X:Lpd/k;

    .line 59
    .line 60
    invoke-static {p1, v0}, Lxe/m;->j(Lud/p;Lpd/k;)Z

    .line 61
    .line 62
    .line 63
    move-result p1

    .line 64
    return p1

    .line 65
    :pswitch_3
    check-cast p1, Lud/e;

    .line 66
    .line 67
    iget-object p1, p1, Lud/e;->m:Lod/a;

    .line 68
    .line 69
    invoke-virtual {p1}, Lod/a;->o()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    return p1

    .line 74
    :pswitch_4
    check-cast p1, Ljava/util/Map$Entry;

    .line 75
    .line 76
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    check-cast p1, Ljava/util/List;

    .line 81
    .line 82
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-le p1, v1, :cond_3

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_3
    move v1, v2

    .line 90
    :goto_2
    return v1

    .line 91
    :pswitch_5
    check-cast p1, Lae/f;

    .line 92
    .line 93
    iget-boolean p1, p1, Lae/f;->i:Z

    .line 94
    .line 95
    return p1

    .line 96
    :pswitch_6
    check-cast p1, Lhc/a;

    .line 97
    .line 98
    invoke-interface {p1}, Lhc/a;->j()I

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    const/4 v3, 0x6

    .line 103
    if-ne v0, v3, :cond_4

    .line 104
    .line 105
    check-cast p1, Lic/e;

    .line 106
    .line 107
    iget-object v0, p1, Lic/e;->g:Lic/d;

    .line 108
    .line 109
    iget v0, v0, Lic/d;->k:I

    .line 110
    .line 111
    if-nez v0, :cond_4

    .line 112
    .line 113
    sget-object v0, Lud/e;->F:Lmh/b;

    .line 114
    .line 115
    invoke-interface {v0}, Lmh/b;->d()Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_5

    .line 120
    .line 121
    const-string v2, "Var reference \'{}\' incorrect (ref pos is zero) and was removed from metadata"

    .line 122
    .line 123
    invoke-interface {v0, p1, v2}, Lmh/b;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_4
    move v1, v2

    .line 128
    :cond_5
    :goto_3
    return v1

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
