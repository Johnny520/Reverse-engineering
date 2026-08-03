.class public final synthetic Lwb/xh;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lx8/b;

.field public final synthetic i:Lfg/l;


# direct methods
.method public synthetic constructor <init>(ILfg/l;Lx8/b;)V
    .locals 0

    .line 1
    iput p1, p0, Lwb/xh;->g:I

    .line 2
    .line 3
    iput-object p3, p0, Lwb/xh;->h:Lx8/b;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/xh;->i:Lfg/l;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lwb/xh;->g:I

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
    new-instance p1, Lwb/ri;

    .line 37
    .line 38
    const/4 p3, 0x0

    .line 39
    iget-object v0, p0, Lwb/xh;->i:Lfg/l;

    .line 40
    .line 41
    iget-object v2, p0, Lwb/xh;->h:Lx8/b;

    .line 42
    .line 43
    invoke-direct {p1, p3, v0, v2}, Lwb/ri;-><init>(ILfg/l;Lx8/b;)V

    .line 44
    .line 45
    .line 46
    const p3, 0x3aad1317

    .line 47
    .line 48
    .line 49
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    const/16 p3, 0x30

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 61
    .line 62
    .line 63
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 64
    .line 65
    return-object p1

    .line 66
    :pswitch_0
    const/16 v0, 0x10

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    if-eq p1, v0, :cond_2

    .line 70
    .line 71
    move p1, v1

    .line 72
    goto :goto_2

    .line 73
    :cond_2
    const/4 p1, 0x0

    .line 74
    :goto_2
    and-int/2addr p3, v1

    .line 75
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-eqz p1, :cond_3

    .line 80
    .line 81
    new-instance p1, Lwb/ri;

    .line 82
    .line 83
    const/4 p3, 0x1

    .line 84
    iget-object v0, p0, Lwb/xh;->i:Lfg/l;

    .line 85
    .line 86
    iget-object v2, p0, Lwb/xh;->h:Lx8/b;

    .line 87
    .line 88
    invoke-direct {p1, p3, v0, v2}, Lwb/ri;-><init>(ILfg/l;Lx8/b;)V

    .line 89
    .line 90
    .line 91
    const p3, -0x4ef027ed

    .line 92
    .line 93
    .line 94
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    const/16 p3, 0x30

    .line 99
    .line 100
    const/4 v0, 0x0

    .line 101
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 102
    .line 103
    .line 104
    goto :goto_3

    .line 105
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 106
    .line 107
    .line 108
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 109
    .line 110
    return-object p1

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
