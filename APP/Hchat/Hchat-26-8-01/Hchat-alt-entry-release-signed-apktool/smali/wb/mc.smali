.class public final synthetic Lwb/mc;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:I

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;ILfg/a;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/mc;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/mc;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Lwb/mc;->i:I

    .line 10
    .line 11
    iput-object p3, p0, Lwb/mc;->m:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/mc;->h:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/mc;->j:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/mc;->k:Li0/a1;

    .line 18
    .line 19
    return-void
.end method

.method public synthetic constructor <init>(Lx8/s;Li0/a1;ILandroid/content/Context;Li0/a1;Li0/a1;)V
    .locals 1

    .line 20
    const/4 v0, 0x1

    iput v0, p0, Lwb/mc;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/mc;->l:Ljava/lang/Object;

    iput-object p2, p0, Lwb/mc;->h:Li0/a1;

    iput p3, p0, Lwb/mc;->i:I

    iput-object p4, p0, Lwb/mc;->m:Ljava/lang/Object;

    iput-object p5, p0, Lwb/mc;->j:Li0/a1;

    iput-object p6, p0, Lwb/mc;->k:Li0/a1;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/mc;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/mc;->l:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Lx8/s;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/mc;->m:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v5, v0

    .line 14
    check-cast v5, Landroid/content/Context;

    .line 15
    .line 16
    check-cast p1, Lr/d;

    .line 17
    .line 18
    check-cast p2, Li0/h0;

    .line 19
    .line 20
    check-cast p3, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result p3

    .line 26
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    and-int/lit8 p1, p3, 0x11

    .line 30
    .line 31
    const/16 v0, 0x10

    .line 32
    .line 33
    const/4 v8, 0x1

    .line 34
    if-eq p1, v0, :cond_0

    .line 35
    .line 36
    move p1, v8

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p1, 0x0

    .line 39
    :goto_0
    and-int/2addr p3, v8

    .line 40
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p1

    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    new-instance v1, Lc9/c0;

    .line 47
    .line 48
    iget-object v3, p0, Lwb/mc;->h:Li0/a1;

    .line 49
    .line 50
    iget v4, p0, Lwb/mc;->i:I

    .line 51
    .line 52
    iget-object v6, p0, Lwb/mc;->j:Li0/a1;

    .line 53
    .line 54
    iget-object v7, p0, Lwb/mc;->k:Li0/a1;

    .line 55
    .line 56
    invoke-direct/range {v1 .. v7}, Lc9/c0;-><init>(Lx8/s;Li0/a1;ILandroid/content/Context;Li0/a1;Li0/a1;)V

    .line 57
    .line 58
    .line 59
    const p1, 0x2a128906

    .line 60
    .line 61
    .line 62
    invoke-static {p1, v1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const/16 p3, 0x30

    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    invoke-static {v0, p1, p2, p3, v8}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 70
    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 74
    .line 75
    .line 76
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 77
    .line 78
    return-object p1

    .line 79
    :pswitch_0
    iget-object v0, p0, Lwb/mc;->l:Ljava/lang/Object;

    .line 80
    .line 81
    move-object v2, v0

    .line 82
    check-cast v2, Landroid/content/SharedPreferences;

    .line 83
    .line 84
    iget-object v0, p0, Lwb/mc;->m:Ljava/lang/Object;

    .line 85
    .line 86
    move-object v4, v0

    .line 87
    check-cast v4, Lfg/a;

    .line 88
    .line 89
    check-cast p1, Lr/d;

    .line 90
    .line 91
    check-cast p2, Li0/h0;

    .line 92
    .line 93
    check-cast p3, Ljava/lang/Integer;

    .line 94
    .line 95
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 96
    .line 97
    .line 98
    move-result p3

    .line 99
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    and-int/lit8 p1, p3, 0x11

    .line 103
    .line 104
    const/16 v0, 0x10

    .line 105
    .line 106
    const/4 v8, 0x1

    .line 107
    if-eq p1, v0, :cond_2

    .line 108
    .line 109
    move p1, v8

    .line 110
    goto :goto_2

    .line 111
    :cond_2
    const/4 p1, 0x0

    .line 112
    :goto_2
    and-int/2addr p3, v8

    .line 113
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    if-eqz p1, :cond_3

    .line 118
    .line 119
    new-instance v1, Lc9/c0;

    .line 120
    .line 121
    iget v3, p0, Lwb/mc;->i:I

    .line 122
    .line 123
    iget-object v5, p0, Lwb/mc;->h:Li0/a1;

    .line 124
    .line 125
    iget-object v6, p0, Lwb/mc;->j:Li0/a1;

    .line 126
    .line 127
    iget-object v7, p0, Lwb/mc;->k:Li0/a1;

    .line 128
    .line 129
    invoke-direct/range {v1 .. v7}, Lc9/c0;-><init>(Landroid/content/SharedPreferences;ILfg/a;Li0/a1;Li0/a1;Li0/a1;)V

    .line 130
    .line 131
    .line 132
    const p1, -0x39925572

    .line 133
    .line 134
    .line 135
    invoke-static {p1, v1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    const/16 p3, 0x30

    .line 140
    .line 141
    const/4 v0, 0x0

    .line 142
    invoke-static {v0, p1, p2, p3, v8}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 147
    .line 148
    .line 149
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 150
    .line 151
    return-object p1

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
