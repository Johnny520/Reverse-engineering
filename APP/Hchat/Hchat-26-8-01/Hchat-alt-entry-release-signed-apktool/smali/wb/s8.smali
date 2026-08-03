.class public final synthetic Lwb/s8;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Z

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;

.field public final synthetic o:Li0/a1;

.field public final synthetic p:Lfg/a;


# direct methods
.method public synthetic constructor <init>(ZLi0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Lfg/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lwb/s8;->g:Z

    .line 5
    .line 6
    iput-object p2, p0, Lwb/s8;->h:Li0/a1;

    .line 7
    .line 8
    iput-object p3, p0, Lwb/s8;->i:Li0/a1;

    .line 9
    .line 10
    iput-object p4, p0, Lwb/s8;->j:Li0/a1;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/s8;->k:Li0/a1;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/s8;->l:Li0/a1;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/s8;->m:Li0/a1;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/s8;->n:Li0/a1;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/s8;->o:Li0/a1;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/s8;->p:Lfg/a;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lr/h;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lwb/p0;->x3:Ls0/d;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x3

    .line 10
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lwb/p7;

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    iget-object v4, p0, Lwb/s8;->h:Li0/a1;

    .line 17
    .line 18
    iget-object v5, p0, Lwb/s8;->i:Li0/a1;

    .line 19
    .line 20
    iget-object v6, p0, Lwb/s8;->j:Li0/a1;

    .line 21
    .line 22
    invoke-direct {v0, v4, v5, v6, v3}, Lwb/p7;-><init>(Li0/a1;Li0/a1;Li0/a1;I)V

    .line 23
    .line 24
    .line 25
    new-instance v3, Ls0/d;

    .line 26
    .line 27
    const v4, 0x553b87bd

    .line 28
    .line 29
    .line 30
    const/4 v5, 0x1

    .line 31
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Lwb/p0;->y3:Ls0/d;

    .line 38
    .line 39
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 40
    .line 41
    .line 42
    new-instance v0, Lwb/t1;

    .line 43
    .line 44
    const/4 v3, 0x7

    .line 45
    iget-object v4, p0, Lwb/s8;->k:Li0/a1;

    .line 46
    .line 47
    iget-object v6, p0, Lwb/s8;->l:Li0/a1;

    .line 48
    .line 49
    invoke-direct {v0, v3, v4, v6}, Lwb/t1;-><init>(ILi0/a1;Li0/a1;)V

    .line 50
    .line 51
    .line 52
    new-instance v3, Ls0/d;

    .line 53
    .line 54
    const v6, 0x621c0b3f

    .line 55
    .line 56
    .line 57
    invoke-direct {v3, v6, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 61
    .line 62
    .line 63
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    check-cast v0, Ljava/lang/String;

    .line 68
    .line 69
    const-string v3, "card"

    .line 70
    .line 71
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_0

    .line 76
    .line 77
    sget-object v0, Lwb/p0;->z3:Ls0/d;

    .line 78
    .line 79
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 80
    .line 81
    .line 82
    new-instance v0, Lwb/s1;

    .line 83
    .line 84
    const/16 v3, 0xb

    .line 85
    .line 86
    iget-object v6, p0, Lwb/s8;->m:Li0/a1;

    .line 87
    .line 88
    invoke-direct {v0, v6, v3}, Lwb/s1;-><init>(Li0/a1;I)V

    .line 89
    .line 90
    .line 91
    new-instance v3, Ls0/d;

    .line 92
    .line 93
    const v6, -0x1593c68

    .line 94
    .line 95
    .line 96
    invoke-direct {v3, v6, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 97
    .line 98
    .line 99
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 100
    .line 101
    .line 102
    :cond_0
    invoke-interface {v4}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Ljava/lang/String;

    .line 107
    .line 108
    const-string v3, "text"

    .line 109
    .line 110
    invoke-static {v0, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-nez v0, :cond_1

    .line 115
    .line 116
    sget-object v0, Lwb/p0;->A3:Ls0/d;

    .line 117
    .line 118
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 119
    .line 120
    .line 121
    new-instance v0, Lwb/t1;

    .line 122
    .line 123
    const/16 v3, 0x8

    .line 124
    .line 125
    iget-object v4, p0, Lwb/s8;->n:Li0/a1;

    .line 126
    .line 127
    iget-object v6, p0, Lwb/s8;->o:Li0/a1;

    .line 128
    .line 129
    invoke-direct {v0, v3, v4, v6}, Lwb/t1;-><init>(ILi0/a1;Li0/a1;)V

    .line 130
    .line 131
    .line 132
    new-instance v3, Ls0/d;

    .line 133
    .line 134
    const v4, 0x13c4328f

    .line 135
    .line 136
    .line 137
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 138
    .line 139
    .line 140
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 141
    .line 142
    .line 143
    :cond_1
    iget-boolean v0, p0, Lwb/s8;->g:Z

    .line 144
    .line 145
    if-eqz v0, :cond_2

    .line 146
    .line 147
    sget-object v0, Lwb/p0;->B3:Ls0/d;

    .line 148
    .line 149
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 150
    .line 151
    .line 152
    new-instance v0, Lwb/x6;

    .line 153
    .line 154
    const/16 v3, 0xb

    .line 155
    .line 156
    iget-object v4, p0, Lwb/s8;->p:Lfg/a;

    .line 157
    .line 158
    invoke-direct {v0, v4, v3}, Lwb/x6;-><init>(Lfg/a;I)V

    .line 159
    .line 160
    .line 161
    new-instance v3, Ls0/d;

    .line 162
    .line 163
    const v4, -0x65cb8bb0

    .line 164
    .line 165
    .line 166
    invoke-direct {v3, v4, v0, v5}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 167
    .line 168
    .line 169
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 170
    .line 171
    .line 172
    :cond_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 173
    .line 174
    return-object p1
.end method
