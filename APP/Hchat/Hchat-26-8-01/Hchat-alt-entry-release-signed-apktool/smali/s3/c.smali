.class public final synthetic Ls3/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;IZILsh/t;Lfg/l;I)V
    .locals 0

    .line 1
    const/4 p7, 0x1

    .line 2
    iput p7, p0, Ls3/c;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ls3/c;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Ls3/c;->h:I

    .line 10
    .line 11
    iput-boolean p3, p0, Ls3/c;->i:Z

    .line 12
    .line 13
    iput p4, p0, Ls3/c;->j:I

    .line 14
    .line 15
    iput-object p5, p0, Ls3/c;->l:Ljava/lang/Object;

    .line 16
    .line 17
    iput-object p6, p0, Ls3/c;->m:Ljava/lang/Object;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Object;III)V
    .locals 0

    .line 20
    iput p7, p0, Ls3/c;->g:I

    iput-object p1, p0, Ls3/c;->k:Ljava/lang/Object;

    iput-object p2, p0, Ls3/c;->l:Ljava/lang/Object;

    iput-boolean p3, p0, Ls3/c;->i:Z

    iput-object p4, p0, Ls3/c;->m:Ljava/lang/Object;

    iput p5, p0, Ls3/c;->h:I

    iput p6, p0, Ls3/c;->j:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ls3/e;ZLfg/a;Lfg/a;II)V
    .locals 1

    .line 21
    const/4 v0, 0x0

    iput v0, p0, Ls3/c;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls3/c;->k:Ljava/lang/Object;

    iput-boolean p2, p0, Ls3/c;->i:Z

    iput-object p3, p0, Ls3/c;->l:Ljava/lang/Object;

    iput-object p4, p0, Ls3/c;->m:Ljava/lang/Object;

    iput p5, p0, Ls3/c;->h:I

    iput p6, p0, Ls3/c;->j:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Ls3/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ls3/c;->k:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v5, v0

    .line 9
    check-cast v5, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Ls3/c;->l:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v6, v0

    .line 14
    check-cast v6, Ljava/lang/String;

    .line 15
    .line 16
    iget-object v0, p0, Ls3/c;->m:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v3, v0

    .line 19
    check-cast v3, Lfg/l;

    .line 20
    .line 21
    move-object v4, p1

    .line 22
    check-cast v4, Li0/h0;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget p1, p0, Ls3/c;->h:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, Li0/r;->C(I)I

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    iget v2, p0, Ls3/c;->j:I

    .line 38
    .line 39
    iget-boolean v7, p0, Ls3/c;->i:Z

    .line 40
    .line 41
    invoke-static/range {v1 .. v7}, Lwb/ho;->X3(IILfg/l;Li0/h0;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 45
    .line 46
    return-object p1

    .line 47
    :pswitch_0
    iget-object v0, p0, Ls3/c;->k:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v1, v0

    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    iget-object v0, p0, Ls3/c;->l:Ljava/lang/Object;

    .line 53
    .line 54
    move-object v2, v0

    .line 55
    check-cast v2, Ljava/lang/String;

    .line 56
    .line 57
    iget-object v0, p0, Ls3/c;->m:Ljava/lang/Object;

    .line 58
    .line 59
    move-object v4, v0

    .line 60
    check-cast v4, Lk9/c;

    .line 61
    .line 62
    move-object v5, p1

    .line 63
    check-cast v5, Li0/h0;

    .line 64
    .line 65
    check-cast p2, Ljava/lang/Integer;

    .line 66
    .line 67
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    iget p1, p0, Ls3/c;->h:I

    .line 71
    .line 72
    or-int/lit8 p1, p1, 0x1

    .line 73
    .line 74
    invoke-static {p1}, Li0/r;->C(I)I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    iget-boolean v3, p0, Ls3/c;->i:Z

    .line 79
    .line 80
    iget v7, p0, Ls3/c;->j:I

    .line 81
    .line 82
    invoke-static/range {v1 .. v7}, Lwb/ho;->R0(Ljava/lang/String;Ljava/lang/String;ZLk9/c;Li0/h0;II)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :pswitch_1
    iget-object v0, p0, Ls3/c;->k:Ljava/lang/Object;

    .line 87
    .line 88
    move-object v1, v0

    .line 89
    check-cast v1, Ljava/lang/String;

    .line 90
    .line 91
    iget-object v0, p0, Ls3/c;->l:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v5, v0

    .line 94
    check-cast v5, Lsh/t;

    .line 95
    .line 96
    iget-object v0, p0, Ls3/c;->m:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v6, v0

    .line 99
    check-cast v6, Lfg/l;

    .line 100
    .line 101
    move-object v7, p1

    .line 102
    check-cast v7, Li0/h0;

    .line 103
    .line 104
    check-cast p2, Ljava/lang/Integer;

    .line 105
    .line 106
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    const p1, 0x30001

    .line 110
    .line 111
    .line 112
    invoke-static {p1}, Li0/r;->C(I)I

    .line 113
    .line 114
    .line 115
    move-result v8

    .line 116
    iget v2, p0, Ls3/c;->h:I

    .line 117
    .line 118
    iget-boolean v3, p0, Ls3/c;->i:Z

    .line 119
    .line 120
    iget v4, p0, Ls3/c;->j:I

    .line 121
    .line 122
    invoke-static/range {v1 .. v8}, Lsh/s;->f(Ljava/lang/String;IZILsh/t;Lfg/l;Li0/h0;I)V

    .line 123
    .line 124
    .line 125
    goto :goto_0

    .line 126
    :pswitch_2
    iget-object v0, p0, Ls3/c;->k:Ljava/lang/Object;

    .line 127
    .line 128
    move-object v1, v0

    .line 129
    check-cast v1, Ls3/e;

    .line 130
    .line 131
    iget-object v0, p0, Ls3/c;->l:Ljava/lang/Object;

    .line 132
    .line 133
    move-object v3, v0

    .line 134
    check-cast v3, Lfg/a;

    .line 135
    .line 136
    iget-object v0, p0, Ls3/c;->m:Ljava/lang/Object;

    .line 137
    .line 138
    move-object v4, v0

    .line 139
    check-cast v4, Lfg/a;

    .line 140
    .line 141
    move-object v5, p1

    .line 142
    check-cast v5, Li0/h0;

    .line 143
    .line 144
    check-cast p2, Ljava/lang/Integer;

    .line 145
    .line 146
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget p1, p0, Ls3/c;->h:I

    .line 150
    .line 151
    or-int/lit8 p1, p1, 0x1

    .line 152
    .line 153
    invoke-static {p1}, Li0/r;->C(I)I

    .line 154
    .line 155
    .line 156
    move-result v6

    .line 157
    iget-boolean v2, p0, Ls3/c;->i:Z

    .line 158
    .line 159
    iget v7, p0, Ls3/c;->j:I

    .line 160
    .line 161
    invoke-static/range {v1 .. v7}, Lx6/d;->d(Ls3/e;ZLfg/a;Lfg/a;Li0/h0;II)V

    .line 162
    .line 163
    .line 164
    goto :goto_0

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
