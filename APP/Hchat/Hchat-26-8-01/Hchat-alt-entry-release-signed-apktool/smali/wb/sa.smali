.class public final synthetic Lwb/sa;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Landroid/content/SharedPreferences;

.field public final synthetic i:Ljava/util/List;

.field public final synthetic j:Li0/a1;

.field public final synthetic k:Li0/a1;

.field public final synthetic l:Li0/a1;

.field public final synthetic m:Li0/a1;

.field public final synthetic n:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lwb/sa;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/sa;->h:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    iput-object p2, p0, Lwb/sa;->i:Ljava/util/List;

    .line 10
    .line 11
    iput-object p3, p0, Lwb/sa;->j:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/sa;->k:Li0/a1;

    .line 14
    .line 15
    iput-object p5, p0, Lwb/sa;->l:Li0/a1;

    .line 16
    .line 17
    iput-object p6, p0, Lwb/sa;->m:Li0/a1;

    .line 18
    .line 19
    iput-object p7, p0, Lwb/sa;->n:Li0/a1;

    .line 20
    .line 21
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V
    .locals 1

    .line 22
    const/4 v0, 0x0

    iput v0, p0, Lwb/sa;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/sa;->i:Ljava/util/List;

    iput-object p2, p0, Lwb/sa;->h:Landroid/content/SharedPreferences;

    iput-object p3, p0, Lwb/sa;->j:Li0/a1;

    iput-object p4, p0, Lwb/sa;->k:Li0/a1;

    iput-object p5, p0, Lwb/sa;->l:Li0/a1;

    iput-object p6, p0, Lwb/sa;->m:Li0/a1;

    iput-object p7, p0, Lwb/sa;->n:Li0/a1;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lwb/sa;->g:I

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
    new-instance v2, Lwb/rc;

    .line 37
    .line 38
    iget-object v3, p0, Lwb/sa;->h:Landroid/content/SharedPreferences;

    .line 39
    .line 40
    iget-object v4, p0, Lwb/sa;->i:Ljava/util/List;

    .line 41
    .line 42
    iget-object v5, p0, Lwb/sa;->j:Li0/a1;

    .line 43
    .line 44
    iget-object v6, p0, Lwb/sa;->k:Li0/a1;

    .line 45
    .line 46
    iget-object v7, p0, Lwb/sa;->l:Li0/a1;

    .line 47
    .line 48
    iget-object v8, p0, Lwb/sa;->m:Li0/a1;

    .line 49
    .line 50
    iget-object v9, p0, Lwb/sa;->n:Li0/a1;

    .line 51
    .line 52
    invoke-direct/range {v2 .. v9}, Lwb/rc;-><init>(Landroid/content/SharedPreferences;Ljava/util/List;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 53
    .line 54
    .line 55
    const p1, 0x1cfa77d4

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    const/16 p3, 0x30

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 70
    .line 71
    .line 72
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 73
    .line 74
    return-object p1

    .line 75
    :pswitch_0
    const/16 v0, 0x10

    .line 76
    .line 77
    const/4 v1, 0x1

    .line 78
    if-eq p1, v0, :cond_2

    .line 79
    .line 80
    move p1, v1

    .line 81
    goto :goto_2

    .line 82
    :cond_2
    const/4 p1, 0x0

    .line 83
    :goto_2
    and-int/2addr p3, v1

    .line 84
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-eqz p1, :cond_3

    .line 89
    .line 90
    new-instance v2, Lwb/rc;

    .line 91
    .line 92
    iget-object v3, p0, Lwb/sa;->i:Ljava/util/List;

    .line 93
    .line 94
    iget-object v4, p0, Lwb/sa;->h:Landroid/content/SharedPreferences;

    .line 95
    .line 96
    iget-object v5, p0, Lwb/sa;->j:Li0/a1;

    .line 97
    .line 98
    iget-object v6, p0, Lwb/sa;->k:Li0/a1;

    .line 99
    .line 100
    iget-object v7, p0, Lwb/sa;->l:Li0/a1;

    .line 101
    .line 102
    iget-object v8, p0, Lwb/sa;->m:Li0/a1;

    .line 103
    .line 104
    iget-object v9, p0, Lwb/sa;->n:Li0/a1;

    .line 105
    .line 106
    invoke-direct/range {v2 .. v9}, Lwb/rc;-><init>(Ljava/util/List;Landroid/content/SharedPreferences;Li0/a1;Li0/a1;Li0/a1;Li0/a1;Li0/a1;)V

    .line 107
    .line 108
    .line 109
    const p1, 0x4099b82f

    .line 110
    .line 111
    .line 112
    invoke-static {p1, v2, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    const/16 p3, 0x30

    .line 117
    .line 118
    const/4 v0, 0x0

    .line 119
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 120
    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 124
    .line 125
    .line 126
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 127
    .line 128
    return-object p1

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
