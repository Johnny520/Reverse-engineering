.class public final synthetic Lwb/g3;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ZI)V
    .locals 0

    .line 1
    iput p3, p0, Lwb/g3;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/g3;->i:Ljava/lang/Object;

    .line 4
    .line 5
    iput-boolean p2, p0, Lwb/g3;->h:Z

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget v0, p0, Lwb/g3;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/g3;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Landroid/content/SharedPreferences;

    .line 9
    .line 10
    check-cast p1, Lr/h;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    sget-object v1, Lwb/p0;->j4:Ls0/d;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    const/4 v3, 0x3

    .line 19
    invoke-static {p1, v2, v1, v3}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lwb/gm;

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    iget-boolean v5, p0, Lwb/g3;->h:Z

    .line 26
    .line 27
    invoke-direct {v1, v0, v5, v4}, Lwb/gm;-><init>(Landroid/content/SharedPreferences;ZI)V

    .line 28
    .line 29
    .line 30
    new-instance v4, Ls0/d;

    .line 31
    .line 32
    const v6, 0x35cecf7a

    .line 33
    .line 34
    .line 35
    const/4 v7, 0x1

    .line 36
    invoke-direct {v4, v6, v1, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 37
    .line 38
    .line 39
    invoke-static {p1, v2, v4, v3}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 40
    .line 41
    .line 42
    sget-object v1, Lwb/p0;->k4:Ls0/d;

    .line 43
    .line 44
    invoke-static {p1, v2, v1, v3}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 45
    .line 46
    .line 47
    new-instance v1, Lwb/gm;

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    invoke-direct {v1, v0, v5, v4}, Lwb/gm;-><init>(Landroid/content/SharedPreferences;ZI)V

    .line 51
    .line 52
    .line 53
    new-instance v0, Ls0/d;

    .line 54
    .line 55
    const v4, -0x6eace548

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v4, v1, v7}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 59
    .line 60
    .line 61
    invoke-static {p1, v2, v0, v3}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 62
    .line 63
    .line 64
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 65
    .line 66
    return-object p1

    .line 67
    :pswitch_0
    iget-object v0, p0, Lwb/g3;->i:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Lxb/i;

    .line 70
    .line 71
    move-object v1, p1

    .line 72
    check-cast v1, Lh1/d;

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lxb/i;->a()F

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    const v0, 0x3dcccccd    # 0.1f

    .line 82
    .line 83
    .line 84
    iget-boolean v2, p0, Lwb/g3;->h:Z

    .line 85
    .line 86
    if-nez v2, :cond_0

    .line 87
    .line 88
    sget-wide v2, Lf1/w;->b:J

    .line 89
    .line 90
    :goto_1
    invoke-static {v2, v3, v0}, Lf1/w;->b(JF)J

    .line 91
    .line 92
    .line 93
    move-result-wide v2

    .line 94
    goto :goto_2

    .line 95
    :cond_0
    sget-wide v2, Lf1/w;->c:J

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :goto_2
    const/high16 v0, 0x3f800000    # 1.0f

    .line 99
    .line 100
    sub-float v6, v0, p1

    .line 101
    .line 102
    const/4 v7, 0x0

    .line 103
    const/16 v8, 0x76

    .line 104
    .line 105
    const-wide/16 v4, 0x0

    .line 106
    .line 107
    invoke-static/range {v1 .. v8}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 108
    .line 109
    .line 110
    sget-wide v2, Lf1/w;->b:J

    .line 111
    .line 112
    const v0, 0x3cf5c28f    # 0.03f

    .line 113
    .line 114
    .line 115
    mul-float/2addr p1, v0

    .line 116
    invoke-static {v2, v3, p1}, Lf1/w;->b(JF)J

    .line 117
    .line 118
    .line 119
    move-result-wide v2

    .line 120
    const/16 v8, 0x7e

    .line 121
    .line 122
    const/4 v6, 0x0

    .line 123
    invoke-static/range {v1 .. v8}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
