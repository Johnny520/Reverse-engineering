.class public final synthetic Lwb/he;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Li0/a1;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V
    .locals 0

    .line 1
    iput p6, p0, Lwb/he;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/he;->h:Li0/a1;

    .line 4
    .line 5
    iput-object p2, p0, Lwb/he;->i:Li0/a1;

    .line 6
    .line 7
    iput-object p3, p0, Lwb/he;->j:Li0/a1;

    .line 8
    .line 9
    iput-object p4, p0, Lwb/he;->k:Li0/a1;

    .line 10
    .line 11
    iput-object p5, p0, Lwb/he;->l:Li0/a1;

    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/he;->g:I

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
    new-instance v2, Lwb/t8;

    .line 37
    .line 38
    const/4 v8, 0x0

    .line 39
    iget-object v3, p0, Lwb/he;->h:Li0/a1;

    .line 40
    .line 41
    iget-object v4, p0, Lwb/he;->i:Li0/a1;

    .line 42
    .line 43
    iget-object v5, p0, Lwb/he;->j:Li0/a1;

    .line 44
    .line 45
    iget-object v6, p0, Lwb/he;->k:Li0/a1;

    .line 46
    .line 47
    iget-object v7, p0, Lwb/he;->l:Li0/a1;

    .line 48
    .line 49
    invoke-direct/range {v2 .. v8}, Lwb/t8;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 50
    .line 51
    .line 52
    const p1, 0xdb81550

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    const/16 p3, 0x30

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 67
    .line 68
    .line 69
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_0
    const/16 v0, 0x10

    .line 73
    .line 74
    const/4 v1, 0x1

    .line 75
    if-eq p1, v0, :cond_2

    .line 76
    .line 77
    move p1, v1

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    const/4 p1, 0x0

    .line 80
    :goto_2
    and-int/2addr p3, v1

    .line 81
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 82
    .line 83
    .line 84
    move-result p1

    .line 85
    if-eqz p1, :cond_3

    .line 86
    .line 87
    new-instance v2, Lwb/t8;

    .line 88
    .line 89
    const/4 v8, 0x1

    .line 90
    iget-object v3, p0, Lwb/he;->h:Li0/a1;

    .line 91
    .line 92
    iget-object v4, p0, Lwb/he;->i:Li0/a1;

    .line 93
    .line 94
    iget-object v5, p0, Lwb/he;->j:Li0/a1;

    .line 95
    .line 96
    iget-object v6, p0, Lwb/he;->k:Li0/a1;

    .line 97
    .line 98
    iget-object v7, p0, Lwb/he;->l:Li0/a1;

    .line 99
    .line 100
    invoke-direct/range {v2 .. v8}, Lwb/t8;-><init>(Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;I)V

    .line 101
    .line 102
    .line 103
    const p1, -0x1fb069ff

    .line 104
    .line 105
    .line 106
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    const/16 p3, 0x30

    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 118
    .line 119
    .line 120
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 121
    .line 122
    return-object p1

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
