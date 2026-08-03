.class public final synthetic Lwb/xf;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/p;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/String;

.field public final synthetic i:Ljava/lang/String;

.field public final synthetic j:I

.field public final synthetic k:Lfg/l;

.field public final synthetic l:I

.field public final synthetic m:I

.field public final synthetic n:Ljava/lang/Object;

.field public final synthetic o:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILfg/l;Lfg/l;II)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput v0, p0, Lwb/xf;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/xf;->n:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/xf;->h:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/xf;->i:Ljava/lang/String;

    .line 12
    .line 13
    iput p4, p0, Lwb/xf;->j:I

    .line 14
    .line 15
    iput-object p5, p0, Lwb/xf;->k:Lfg/l;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/xf;->o:Ljava/lang/Object;

    .line 18
    .line 19
    iput p7, p0, Lwb/xf;->l:I

    .line 20
    .line 21
    iput p8, p0, Lwb/xf;->m:I

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILfg/l;II)V
    .locals 1

    .line 24
    const/4 v0, 0x1

    iput v0, p0, Lwb/xf;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/xf;->n:Ljava/lang/Object;

    iput-object p2, p0, Lwb/xf;->h:Ljava/lang/String;

    iput-object p3, p0, Lwb/xf;->i:Ljava/lang/String;

    iput-object p4, p0, Lwb/xf;->o:Ljava/lang/Object;

    iput p5, p0, Lwb/xf;->j:I

    iput-object p6, p0, Lwb/xf;->k:Lfg/l;

    iput p7, p0, Lwb/xf;->l:I

    iput p8, p0, Lwb/xf;->m:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;II)V
    .locals 1

    .line 25
    const/4 v0, 0x0

    iput v0, p0, Lwb/xf;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/xf;->h:Ljava/lang/String;

    iput-object p2, p0, Lwb/xf;->i:Ljava/lang/String;

    iput-object p3, p0, Lwb/xf;->n:Ljava/lang/Object;

    iput-object p4, p0, Lwb/xf;->o:Ljava/lang/Object;

    iput p5, p0, Lwb/xf;->j:I

    iput-object p6, p0, Lwb/xf;->k:Lfg/l;

    iput p7, p0, Lwb/xf;->l:I

    iput p8, p0, Lwb/xf;->m:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/xf;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/xf;->n:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v1, v0

    .line 9
    check-cast v1, Landroid/content/Context;

    .line 10
    .line 11
    iget-object v0, p0, Lwb/xf;->o:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v6, v0

    .line 14
    check-cast v6, Lfg/l;

    .line 15
    .line 16
    move-object v7, p1

    .line 17
    check-cast v7, Li0/h0;

    .line 18
    .line 19
    check-cast p2, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget p1, p0, Lwb/xf;->l:I

    .line 25
    .line 26
    or-int/lit8 p1, p1, 0x1

    .line 27
    .line 28
    invoke-static {p1}, Li0/r;->C(I)I

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    iget-object v2, p0, Lwb/xf;->h:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v3, p0, Lwb/xf;->i:Ljava/lang/String;

    .line 35
    .line 36
    iget v4, p0, Lwb/xf;->j:I

    .line 37
    .line 38
    iget-object v5, p0, Lwb/xf;->k:Lfg/l;

    .line 39
    .line 40
    iget v9, p0, Lwb/xf;->m:I

    .line 41
    .line 42
    invoke-static/range {v1 .. v9}, Lwb/ho;->n1(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILfg/l;Lfg/l;Li0/h0;II)V

    .line 43
    .line 44
    .line 45
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_0
    iget-object v0, p0, Lwb/xf;->n:Ljava/lang/Object;

    .line 49
    .line 50
    move-object v1, v0

    .line 51
    check-cast v1, Landroid/content/SharedPreferences;

    .line 52
    .line 53
    iget-object v0, p0, Lwb/xf;->o:Ljava/lang/Object;

    .line 54
    .line 55
    move-object v4, v0

    .line 56
    check-cast v4, Ljava/util/ArrayList;

    .line 57
    .line 58
    move-object v7, p1

    .line 59
    check-cast v7, Li0/h0;

    .line 60
    .line 61
    check-cast p2, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    iget p1, p0, Lwb/xf;->l:I

    .line 67
    .line 68
    or-int/lit8 p1, p1, 0x1

    .line 69
    .line 70
    invoke-static {p1}, Li0/r;->C(I)I

    .line 71
    .line 72
    .line 73
    move-result v8

    .line 74
    iget-object v2, p0, Lwb/xf;->h:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v3, p0, Lwb/xf;->i:Ljava/lang/String;

    .line 77
    .line 78
    iget v5, p0, Lwb/xf;->j:I

    .line 79
    .line 80
    iget-object v6, p0, Lwb/xf;->k:Lfg/l;

    .line 81
    .line 82
    iget v9, p0, Lwb/xf;->m:I

    .line 83
    .line 84
    invoke-static/range {v1 .. v9}, Lwb/ho;->z2(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILfg/l;Li0/h0;II)V

    .line 85
    .line 86
    .line 87
    goto :goto_0

    .line 88
    :pswitch_1
    iget-object v0, p0, Lwb/xf;->n:Ljava/lang/Object;

    .line 89
    .line 90
    move-object v3, v0

    .line 91
    check-cast v3, Ljava/lang/String;

    .line 92
    .line 93
    iget-object v0, p0, Lwb/xf;->o:Ljava/lang/Object;

    .line 94
    .line 95
    move-object v4, v0

    .line 96
    check-cast v4, Ljava/util/List;

    .line 97
    .line 98
    move-object v7, p1

    .line 99
    check-cast v7, Li0/h0;

    .line 100
    .line 101
    check-cast p2, Ljava/lang/Integer;

    .line 102
    .line 103
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget p1, p0, Lwb/xf;->l:I

    .line 107
    .line 108
    or-int/lit8 p1, p1, 0x1

    .line 109
    .line 110
    invoke-static {p1}, Li0/r;->C(I)I

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    iget-object v1, p0, Lwb/xf;->h:Ljava/lang/String;

    .line 115
    .line 116
    iget-object v2, p0, Lwb/xf;->i:Ljava/lang/String;

    .line 117
    .line 118
    iget v5, p0, Lwb/xf;->j:I

    .line 119
    .line 120
    iget-object v6, p0, Lwb/xf;->k:Lfg/l;

    .line 121
    .line 122
    iget v9, p0, Lwb/xf;->m:I

    .line 123
    .line 124
    invoke-static/range {v1 .. v9}, Lwb/ho;->i4(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ILfg/l;Li0/h0;II)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    nop

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
