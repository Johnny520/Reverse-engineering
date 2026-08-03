.class public final Lwb/rv;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/r;


# instance fields
.field public final synthetic g:Ljava/util/ArrayList;

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Z


# direct methods
.method public constructor <init>(Li0/a1;Ljava/util/ArrayList;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lwb/rv;->g:Ljava/util/ArrayList;

    .line 5
    .line 6
    iput-object p1, p0, Lwb/rv;->h:Li0/a1;

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/rv;->i:Z

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lr/d;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    move-object v4, p3

    .line 10
    check-cast v4, Li0/h0;

    .line 11
    .line 12
    check-cast p4, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p4}, Ljava/lang/Number;->intValue()I

    .line 15
    .line 16
    .line 17
    move-result p3

    .line 18
    and-int/lit8 p4, p3, 0x6

    .line 19
    .line 20
    if-nez p4, :cond_1

    .line 21
    .line 22
    invoke-virtual {v4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x4

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x2

    .line 31
    :goto_0
    or-int/2addr p1, p3

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move p1, p3

    .line 34
    :goto_1
    and-int/lit8 p3, p3, 0x30

    .line 35
    .line 36
    if-nez p3, :cond_3

    .line 37
    .line 38
    invoke-virtual {v4, p2}, Li0/h0;->d(I)Z

    .line 39
    .line 40
    .line 41
    move-result p3

    .line 42
    if-eqz p3, :cond_2

    .line 43
    .line 44
    const/16 p3, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 p3, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr p1, p3

    .line 50
    :cond_3
    and-int/lit16 p3, p1, 0x93

    .line 51
    .line 52
    const/16 p4, 0x92

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v0, 0x1

    .line 56
    if-eq p3, p4, :cond_4

    .line 57
    .line 58
    move p3, v0

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move p3, v6

    .line 61
    :goto_3
    and-int/2addr p1, v0

    .line 62
    invoke-virtual {v4, p1, p3}, Li0/h0;->S(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result p1

    .line 66
    if-eqz p1, :cond_7

    .line 67
    .line 68
    iget-object p1, p0, Lwb/rv;->g:Ljava/util/ArrayList;

    .line 69
    .line 70
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    move-object v1, p1

    .line 75
    check-cast v1, Lwb/jv;

    .line 76
    .line 77
    const p1, 0x765ca489

    .line 78
    .line 79
    .line 80
    invoke-virtual {v4, p1}, Li0/h0;->a0(I)V

    .line 81
    .line 82
    .line 83
    sget-object v0, Lwb/y2;->p:Lwb/y2;

    .line 84
    .line 85
    iget-object p1, p0, Lwb/rv;->h:Li0/a1;

    .line 86
    .line 87
    invoke-interface {p1}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    check-cast p2, Ljava/util/Set;

    .line 92
    .line 93
    iget-object p3, v1, Lwb/jv;->a:Ljava/lang/String;

    .line 94
    .line 95
    invoke-interface {p2, p3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v2

    .line 99
    invoke-virtual {v4, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    invoke-virtual {v4, v1}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    move-result p3

    .line 107
    or-int/2addr p2, p3

    .line 108
    iget-boolean p3, p0, Lwb/rv;->i:Z

    .line 109
    .line 110
    invoke-virtual {v4, p3}, Li0/h0;->g(Z)Z

    .line 111
    .line 112
    .line 113
    move-result p4

    .line 114
    or-int/2addr p2, p4

    .line 115
    invoke-virtual {v4}, Li0/h0;->P()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p4

    .line 119
    if-nez p2, :cond_5

    .line 120
    .line 121
    sget-object p2, Li0/l;->a:Li0/e;

    .line 122
    .line 123
    if-ne p4, p2, :cond_6

    .line 124
    .line 125
    :cond_5
    new-instance p4, Lwb/qv;

    .line 126
    .line 127
    invoke-direct {p4, v1, p3, p1}, Lwb/qv;-><init>(Lwb/jv;ZLi0/a1;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v4, p4}, Li0/h0;->k0(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    :cond_6
    move-object v3, p4

    .line 134
    check-cast v3, Lfg/a;

    .line 135
    .line 136
    const/16 v5, 0xc00

    .line 137
    .line 138
    invoke-virtual/range {v0 .. v5}, Lwb/y2;->h(Lwb/jv;ZLfg/a;Li0/h0;I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v4, v6}, Li0/h0;->p(Z)V

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_7
    invoke-virtual {v4}, Li0/h0;->V()V

    .line 146
    .line 147
    .line 148
    :goto_4
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 149
    .line 150
    return-object p1
.end method
