.class public final synthetic Lwb/ej;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Z

.field public final synthetic j:Lfg/a;

.field public final synthetic k:Ljava/lang/Object;

.field public final synthetic l:Lsf/b;


# direct methods
.method public synthetic constructor <init>(Lj8/i;ZZLfg/l;Lfg/a;I)V
    .locals 0

    .line 1
    const/4 p6, 0x2

    .line 2
    iput p6, p0, Lwb/ej;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ej;->k:Ljava/lang/Object;

    .line 8
    .line 9
    iput-boolean p2, p0, Lwb/ej;->h:Z

    .line 10
    .line 11
    iput-boolean p3, p0, Lwb/ej;->i:Z

    .line 12
    .line 13
    iput-object p4, p0, Lwb/ej;->l:Lsf/b;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/ej;->j:Lfg/a;

    .line 16
    .line 17
    return-void
.end method

.method public synthetic constructor <init>(ZZLfg/a;Lfg/a;Lfg/a;)V
    .locals 1

    .line 18
    const/4 v0, 0x0

    iput v0, p0, Lwb/ej;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwb/ej;->h:Z

    iput-boolean p2, p0, Lwb/ej;->i:Z

    iput-object p3, p0, Lwb/ej;->j:Lfg/a;

    iput-object p4, p0, Lwb/ej;->k:Ljava/lang/Object;

    iput-object p5, p0, Lwb/ej;->l:Lsf/b;

    return-void
.end method

.method public synthetic constructor <init>(ZZLfg/a;Lfg/a;Lfg/a;I)V
    .locals 0

    .line 19
    const/4 p6, 0x1

    iput p6, p0, Lwb/ej;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lwb/ej;->h:Z

    iput-boolean p2, p0, Lwb/ej;->i:Z

    iput-object p3, p0, Lwb/ej;->j:Lfg/a;

    iput-object p4, p0, Lwb/ej;->k:Ljava/lang/Object;

    iput-object p5, p0, Lwb/ej;->l:Lsf/b;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, Lwb/ej;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/ej;->k:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Lj8/i;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/ej;->l:Lsf/b;

    .line 12
    .line 13
    move-object v4, v0

    .line 14
    check-cast v4, Lfg/l;

    .line 15
    .line 16
    move-object v6, p1

    .line 17
    check-cast v6, Li0/h0;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    const/16 p1, 0x9

    .line 25
    .line 26
    invoke-static {p1}, Li0/r;->C(I)I

    .line 27
    .line 28
    .line 29
    move-result v7

    .line 30
    iget-boolean v2, p0, Lwb/ej;->h:Z

    .line 31
    .line 32
    iget-boolean v3, p0, Lwb/ej;->i:Z

    .line 33
    .line 34
    iget-object v5, p0, Lwb/ej;->j:Lfg/a;

    .line 35
    .line 36
    invoke-static/range {v1 .. v7}, Lwb/ho;->A0(Lj8/i;ZZLfg/l;Lfg/a;Li0/h0;I)V

    .line 37
    .line 38
    .line 39
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 40
    .line 41
    return-object p1

    .line 42
    :pswitch_0
    iget-object v0, p0, Lwb/ej;->k:Ljava/lang/Object;

    .line 43
    .line 44
    move-object v4, v0

    .line 45
    check-cast v4, Lfg/a;

    .line 46
    .line 47
    iget-object v0, p0, Lwb/ej;->l:Lsf/b;

    .line 48
    .line 49
    move-object v5, v0

    .line 50
    check-cast v5, Lfg/a;

    .line 51
    .line 52
    move-object v6, p1

    .line 53
    check-cast v6, Li0/h0;

    .line 54
    .line 55
    check-cast p2, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    invoke-static {p1}, Li0/r;->C(I)I

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    iget-boolean v1, p0, Lwb/ej;->h:Z

    .line 66
    .line 67
    iget-boolean v2, p0, Lwb/ej;->i:Z

    .line 68
    .line 69
    iget-object v3, p0, Lwb/ej;->j:Lfg/a;

    .line 70
    .line 71
    invoke-static/range {v1 .. v7}, Lwb/ho;->a3(ZZLfg/a;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :pswitch_1
    iget-object v0, p0, Lwb/ej;->k:Ljava/lang/Object;

    .line 76
    .line 77
    move-object v4, v0

    .line 78
    check-cast v4, Lfg/a;

    .line 79
    .line 80
    iget-object v0, p0, Lwb/ej;->l:Lsf/b;

    .line 81
    .line 82
    move-object v5, v0

    .line 83
    check-cast v5, Lfg/a;

    .line 84
    .line 85
    move-object v6, p1

    .line 86
    check-cast v6, Li0/h0;

    .line 87
    .line 88
    check-cast p2, Ljava/lang/Integer;

    .line 89
    .line 90
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    and-int/lit8 p2, p1, 0x3

    .line 95
    .line 96
    const/4 v0, 0x2

    .line 97
    const/4 v1, 0x1

    .line 98
    if-eq p2, v0, :cond_0

    .line 99
    .line 100
    move p2, v1

    .line 101
    goto :goto_1

    .line 102
    :cond_0
    const/4 p2, 0x0

    .line 103
    :goto_1
    and-int/2addr p1, v1

    .line 104
    invoke-virtual {v6, p1, p2}, Li0/h0;->S(IZ)Z

    .line 105
    .line 106
    .line 107
    move-result p1

    .line 108
    if-eqz p1, :cond_1

    .line 109
    .line 110
    const/4 v7, 0x0

    .line 111
    iget-boolean v1, p0, Lwb/ej;->h:Z

    .line 112
    .line 113
    iget-boolean v2, p0, Lwb/ej;->i:Z

    .line 114
    .line 115
    iget-object v3, p0, Lwb/ej;->j:Lfg/a;

    .line 116
    .line 117
    invoke-static/range {v1 .. v7}, Lwb/ho;->a3(ZZLfg/a;Lfg/a;Lfg/a;Li0/h0;I)V

    .line 118
    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_1
    invoke-virtual {v6}, Li0/h0;->V()V

    .line 122
    .line 123
    .line 124
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 125
    .line 126
    return-object p1

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
