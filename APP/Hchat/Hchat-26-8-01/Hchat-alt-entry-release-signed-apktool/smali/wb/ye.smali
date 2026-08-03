.class public final synthetic Lwb/ye;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Lfg/l;

.field public final synthetic j:Z

.field public final synthetic k:I

.field public final synthetic l:I

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ly0/o;Ljava/lang/String;Lfg/l;ZLs0/d;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/ye;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/ye;->m:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/ye;->n:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/ye;->h:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/ye;->i:Lfg/l;

    .line 14
    .line 15
    iput-boolean p5, p0, Lwb/ye;->j:Z

    .line 16
    .line 17
    iput-object p6, p0, Lwb/ye;->o:Ljava/lang/Object;

    .line 18
    .line 19
    iput p7, p0, Lwb/ye;->k:I

    .line 20
    .line 21
    iput p8, p0, Lwb/ye;->l:I

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLfg/a;Lfg/l;II)V
    .locals 1

    .line 24
    const/4 v0, 0x0

    iput v0, p0, Lwb/ye;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/ye;->h:Ljava/lang/String;

    iput-object p2, p0, Lwb/ye;->m:Ljava/lang/Object;

    iput-object p3, p0, Lwb/ye;->n:Ljava/lang/Object;

    iput-boolean p4, p0, Lwb/ye;->j:Z

    iput-object p5, p0, Lwb/ye;->o:Ljava/lang/Object;

    iput-object p6, p0, Lwb/ye;->i:Lfg/l;

    iput p7, p0, Lwb/ye;->k:I

    iput p8, p0, Lwb/ye;->l:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZII)V
    .locals 1

    .line 25
    const/4 v0, 0x2

    iput v0, p0, Lwb/ye;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/ye;->h:Ljava/lang/String;

    iput-object p2, p0, Lwb/ye;->m:Ljava/lang/Object;

    iput-object p3, p0, Lwb/ye;->o:Ljava/lang/Object;

    iput-object p4, p0, Lwb/ye;->n:Ljava/lang/Object;

    iput-object p5, p0, Lwb/ye;->i:Lfg/l;

    iput-boolean p6, p0, Lwb/ye;->j:Z

    iput p7, p0, Lwb/ye;->k:I

    iput p8, p0, Lwb/ye;->l:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/ye;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/ye;->m:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v2, v0

    .line 9
    check-cast v2, Ljava/lang/String;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/ye;->o:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, Ljava/util/List;

    .line 15
    .line 16
    iget-object v0, p0, Lwb/ye;->n:Ljava/lang/Object;

    .line 17
    .line 18
    move-object v4, v0

    .line 19
    check-cast v4, Ljava/lang/String;

    .line 20
    .line 21
    move-object v7, p1

    .line 22
    check-cast v7, Li0/h0;

    .line 23
    .line 24
    check-cast p2, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    iget p1, p0, Lwb/ye;->k:I

    .line 30
    .line 31
    or-int/lit8 p1, p1, 0x1

    .line 32
    .line 33
    invoke-static {p1}, Li0/r;->C(I)I

    .line 34
    .line 35
    .line 36
    move-result v8

    .line 37
    iget-object v1, p0, Lwb/ye;->h:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v5, p0, Lwb/ye;->i:Lfg/l;

    .line 40
    .line 41
    iget-boolean v6, p0, Lwb/ye;->j:Z

    .line 42
    .line 43
    iget v9, p0, Lwb/ye;->l:I

    .line 44
    .line 45
    invoke-static/range {v1 .. v9}, Lwb/ho;->I2(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lfg/l;ZLi0/h0;II)V

    .line 46
    .line 47
    .line 48
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 49
    .line 50
    return-object p1

    .line 51
    :pswitch_0
    iget-object v0, p0, Lwb/ye;->n:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v2, v0

    .line 54
    check-cast v2, Ly0/o;

    .line 55
    .line 56
    iget-object v0, p0, Lwb/ye;->o:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v6, v0

    .line 59
    check-cast v6, Ls0/d;

    .line 60
    .line 61
    move-object v7, p1

    .line 62
    check-cast v7, Li0/h0;

    .line 63
    .line 64
    check-cast p2, Ljava/lang/Integer;

    .line 65
    .line 66
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget p1, p0, Lwb/ye;->k:I

    .line 70
    .line 71
    or-int/lit8 p1, p1, 0x1

    .line 72
    .line 73
    invoke-static {p1}, Li0/r;->C(I)I

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    iget-object v1, p0, Lwb/ye;->m:Ljava/lang/Object;

    .line 78
    .line 79
    iget-object v3, p0, Lwb/ye;->h:Ljava/lang/String;

    .line 80
    .line 81
    iget-object v4, p0, Lwb/ye;->i:Lfg/l;

    .line 82
    .line 83
    iget-boolean v5, p0, Lwb/ye;->j:Z

    .line 84
    .line 85
    iget v9, p0, Lwb/ye;->l:I

    .line 86
    .line 87
    invoke-static/range {v1 .. v9}, Lwb/ho;->E3(Ljava/lang/Object;Ly0/o;Ljava/lang/String;Lfg/l;ZLs0/d;Li0/h0;II)V

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :pswitch_1
    iget-object v0, p0, Lwb/ye;->m:Ljava/lang/Object;

    .line 92
    .line 93
    move-object v2, v0

    .line 94
    check-cast v2, Ljava/lang/String;

    .line 95
    .line 96
    iget-object v0, p0, Lwb/ye;->n:Ljava/lang/Object;

    .line 97
    .line 98
    move-object v3, v0

    .line 99
    check-cast v3, Ljava/lang/String;

    .line 100
    .line 101
    iget-object v0, p0, Lwb/ye;->o:Ljava/lang/Object;

    .line 102
    .line 103
    move-object v5, v0

    .line 104
    check-cast v5, Lfg/a;

    .line 105
    .line 106
    move-object v7, p1

    .line 107
    check-cast v7, Li0/h0;

    .line 108
    .line 109
    check-cast p2, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget p1, p0, Lwb/ye;->k:I

    .line 115
    .line 116
    or-int/lit8 p1, p1, 0x1

    .line 117
    .line 118
    invoke-static {p1}, Li0/r;->C(I)I

    .line 119
    .line 120
    .line 121
    move-result v8

    .line 122
    iget-object v1, p0, Lwb/ye;->h:Ljava/lang/String;

    .line 123
    .line 124
    iget-boolean v4, p0, Lwb/ye;->j:Z

    .line 125
    .line 126
    iget-object v6, p0, Lwb/ye;->i:Lfg/l;

    .line 127
    .line 128
    iget v9, p0, Lwb/ye;->l:I

    .line 129
    .line 130
    invoke-static/range {v1 .. v9}, Lwb/ho;->S(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLfg/a;Lfg/l;Li0/h0;II)V

    .line 131
    .line 132
    .line 133
    goto :goto_0

    .line 134
    nop

    .line 135
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
