.class public final synthetic Lwb/yd;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;ZLfg/a;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/yd;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/yd;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lwb/yd;->h:Z

    .line 10
    .line 11
    iput-object p3, p0, Lwb/yd;->j:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(ZLfg/l;Ljava/util/List;)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lwb/yd;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwb/yd;->h:Z

    iput-object p2, p0, Lwb/yd;->i:Ljava/lang/Object;

    iput-object p3, p0, Lwb/yd;->j:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/yd;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/yd;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

    .line 9
    .line 10
    iget-object v1, p0, Lwb/yd;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lfg/a;

    .line 13
    .line 14
    check-cast p1, Lr/d;

    .line 15
    .line 16
    check-cast p2, Li0/h0;

    .line 17
    .line 18
    check-cast p3, Ljava/lang/Integer;

    .line 19
    .line 20
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    and-int/lit8 p1, p3, 0x11

    .line 28
    .line 29
    const/16 v2, 0x10

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eq p1, v2, :cond_0

    .line 33
    .line 34
    move p1, v3

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 p1, 0x0

    .line 37
    :goto_0
    and-int/2addr p3, v3

    .line 38
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-eqz p1, :cond_1

    .line 43
    .line 44
    new-instance p1, Lwb/zf;

    .line 45
    .line 46
    iget-boolean p3, p0, Lwb/yd;->h:Z

    .line 47
    .line 48
    invoke-direct {p1, v0, p3, v1}, Lwb/zf;-><init>(Ljava/lang/String;ZLfg/a;)V

    .line 49
    .line 50
    .line 51
    const p3, 0x2aa38122

    .line 52
    .line 53
    .line 54
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    const/16 p3, 0x30

    .line 59
    .line 60
    const/4 v0, 0x0

    .line 61
    invoke-static {v0, p1, p2, p3, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 66
    .line 67
    .line 68
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 69
    .line 70
    return-object p1

    .line 71
    :pswitch_0
    iget-object v0, p0, Lwb/yd;->i:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, Lfg/l;

    .line 74
    .line 75
    iget-object v1, p0, Lwb/yd;->j:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Ljava/util/List;

    .line 78
    .line 79
    check-cast p1, Lr/d;

    .line 80
    .line 81
    check-cast p2, Li0/h0;

    .line 82
    .line 83
    check-cast p3, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result p3

    .line 89
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    and-int/lit8 p1, p3, 0x11

    .line 93
    .line 94
    const/16 v2, 0x10

    .line 95
    .line 96
    const/4 v3, 0x1

    .line 97
    if-eq p1, v2, :cond_2

    .line 98
    .line 99
    move p1, v3

    .line 100
    goto :goto_2

    .line 101
    :cond_2
    const/4 p1, 0x0

    .line 102
    :goto_2
    and-int/2addr p3, v3

    .line 103
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    if-eqz p1, :cond_3

    .line 108
    .line 109
    new-instance p1, Lwb/zf;

    .line 110
    .line 111
    iget-boolean p3, p0, Lwb/yd;->h:Z

    .line 112
    .line 113
    invoke-direct {p1, p3, v0, v1}, Lwb/zf;-><init>(ZLfg/l;Ljava/util/List;)V

    .line 114
    .line 115
    .line 116
    const p3, 0x197aeb1b

    .line 117
    .line 118
    .line 119
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    const/16 p3, 0x30

    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    invoke-static {v0, p1, p2, p3, v3}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 127
    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 131
    .line 132
    .line 133
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 134
    .line 135
    return-object p1

    .line 136
    nop

    .line 137
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
