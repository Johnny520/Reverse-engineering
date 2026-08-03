.class public final synthetic Lwb/je;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Log/g;


# direct methods
.method public synthetic constructor <init>(Log/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/je;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/je;->h:Log/g;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lwb/je;->g:I

    .line 2
    .line 3
    check-cast p1, Lr/d;

    .line 4
    .line 5
    check-cast p2, Li0/h0;

    .line 6
    .line 7
    check-cast p3, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result p3

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    and-int/lit8 p1, p3, 0x11

    .line 17
    .line 18
    packed-switch v0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const/16 v0, 0x10

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    if-eq p1, v0, :cond_0

    .line 25
    .line 26
    move p1, v1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 p1, 0x0

    .line 29
    :goto_0
    and-int/2addr p3, v1

    .line 30
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    new-instance p1, Lb0/t;

    .line 37
    .line 38
    const/16 p3, 0x1d

    .line 39
    .line 40
    iget-object v0, p0, Lwb/je;->h:Log/g;

    .line 41
    .line 42
    invoke-direct {p1, v0, p3}, Lb0/t;-><init>(Ljava/lang/Object;I)V

    .line 43
    .line 44
    .line 45
    const p3, -0x7de443fd

    .line 46
    .line 47
    .line 48
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const/16 p3, 0x30

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 56
    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 60
    .line 61
    .line 62
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 63
    .line 64
    return-object p1

    .line 65
    :pswitch_0
    const/16 v0, 0x10

    .line 66
    .line 67
    const/4 v1, 0x1

    .line 68
    if-eq p1, v0, :cond_2

    .line 69
    .line 70
    move p1, v1

    .line 71
    goto :goto_2

    .line 72
    :cond_2
    const/4 p1, 0x0

    .line 73
    :goto_2
    and-int/2addr p3, v1

    .line 74
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    const/16 p1, 0xa

    .line 81
    .line 82
    int-to-float v2, p1

    .line 83
    const/4 v4, 0x0

    .line 84
    const/16 v5, 0xd

    .line 85
    .line 86
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    const/4 v3, 0x0

    .line 90
    invoke-static/range {v0 .. v5}, Lp/d;->p(Ly0/o;FFFFI)Ly0/o;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    iget-object p3, p0, Lwb/je;->h:Log/g;

    .line 95
    .line 96
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result p3

    .line 100
    const-string v0, "\u5f02\u5e38\u7ed3\u679c \u00b7 "

    .line 101
    .line 102
    invoke-static {p3, v0}, Leh/a;->l(ILjava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p3

    .line 106
    const/16 v0, 0x30

    .line 107
    .line 108
    const/16 v1, 0xc

    .line 109
    .line 110
    invoke-static {p3, p1, p2, v0, v1}, Lsh/s;->j(Ljava/lang/String;Ly0/o;Li0/h0;II)V

    .line 111
    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 115
    .line 116
    .line 117
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 118
    .line 119
    return-object p1

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
