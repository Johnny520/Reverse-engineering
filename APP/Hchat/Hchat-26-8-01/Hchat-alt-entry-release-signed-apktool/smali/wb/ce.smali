.class public final synthetic Lwb/ce;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/util/List;

.field public final synthetic i:Lfg/a;

.field public final synthetic j:Ljava/util/List;

.field public final synthetic k:Lfg/a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lfg/a;Ljava/util/List;Lfg/a;I)V
    .locals 0

    .line 1
    iput p5, p0, Lwb/ce;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/ce;->h:Ljava/util/List;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/ce;->i:Lfg/a;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/ce;->j:Ljava/util/List;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/ce;->k:Lfg/a;

    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/ce;->g:I

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
    new-instance v2, Lwb/pf;

    .line 37
    .line 38
    const/4 v7, 0x1

    .line 39
    iget-object v3, p0, Lwb/ce;->h:Ljava/util/List;

    .line 40
    .line 41
    iget-object v4, p0, Lwb/ce;->i:Lfg/a;

    .line 42
    .line 43
    iget-object v5, p0, Lwb/ce;->j:Ljava/util/List;

    .line 44
    .line 45
    iget-object v6, p0, Lwb/ce;->k:Lfg/a;

    .line 46
    .line 47
    invoke-direct/range {v2 .. v7}, Lwb/pf;-><init>(Ljava/util/List;Lfg/a;Ljava/util/List;Lfg/a;I)V

    .line 48
    .line 49
    .line 50
    const p1, -0x3588d4f6    # -4049602.5f

    .line 51
    .line 52
    .line 53
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/16 p3, 0x30

    .line 58
    .line 59
    const/4 v0, 0x0

    .line 60
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 65
    .line 66
    .line 67
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 68
    .line 69
    return-object p1

    .line 70
    :pswitch_0
    const/16 v0, 0x10

    .line 71
    .line 72
    const/4 v1, 0x1

    .line 73
    if-eq p1, v0, :cond_2

    .line 74
    .line 75
    move p1, v1

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    const/4 p1, 0x0

    .line 78
    :goto_2
    and-int/2addr p3, v1

    .line 79
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    new-instance v2, Lwb/pf;

    .line 86
    .line 87
    const/4 v7, 0x0

    .line 88
    iget-object v3, p0, Lwb/ce;->h:Ljava/util/List;

    .line 89
    .line 90
    iget-object v4, p0, Lwb/ce;->i:Lfg/a;

    .line 91
    .line 92
    iget-object v5, p0, Lwb/ce;->j:Ljava/util/List;

    .line 93
    .line 94
    iget-object v6, p0, Lwb/ce;->k:Lfg/a;

    .line 95
    .line 96
    invoke-direct/range {v2 .. v7}, Lwb/pf;-><init>(Ljava/util/List;Lfg/a;Ljava/util/List;Lfg/a;I)V

    .line 97
    .line 98
    .line 99
    const p1, 0x3f4c7226

    .line 100
    .line 101
    .line 102
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    const/16 p3, 0x30

    .line 107
    .line 108
    const/4 v0, 0x0

    .line 109
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 110
    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 114
    .line 115
    .line 116
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 117
    .line 118
    return-object p1

    .line 119
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
