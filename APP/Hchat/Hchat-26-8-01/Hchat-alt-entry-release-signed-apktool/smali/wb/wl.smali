.class public final synthetic Lwb/wl;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Landroid/content/SharedPreferences;

.field public final synthetic j:Z

.field public final synthetic k:Li0/a1;


# direct methods
.method public synthetic constructor <init>(Landroid/content/SharedPreferences;ZLi0/a1;Li0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lwb/wl;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwb/wl;->i:Landroid/content/SharedPreferences;

    .line 8
    .line 9
    iput-boolean p2, p0, Lwb/wl;->j:Z

    .line 10
    .line 11
    iput-object p3, p0, Lwb/wl;->h:Li0/a1;

    .line 12
    .line 13
    iput-object p4, p0, Lwb/wl;->k:Li0/a1;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Landroid/content/SharedPreferences;ZLi0/a1;)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lwb/wl;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwb/wl;->h:Li0/a1;

    iput-object p2, p0, Lwb/wl;->i:Landroid/content/SharedPreferences;

    iput-boolean p3, p0, Lwb/wl;->j:Z

    iput-object p4, p0, Lwb/wl;->k:Li0/a1;

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lwb/wl;->g:I

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
    new-instance p1, Lwb/g9;

    .line 37
    .line 38
    iget-object p3, p0, Lwb/wl;->h:Li0/a1;

    .line 39
    .line 40
    iget-object v0, p0, Lwb/wl;->i:Landroid/content/SharedPreferences;

    .line 41
    .line 42
    iget-boolean v2, p0, Lwb/wl;->j:Z

    .line 43
    .line 44
    iget-object v3, p0, Lwb/wl;->k:Li0/a1;

    .line 45
    .line 46
    invoke-direct {p1, p3, v0, v2, v3}, Lwb/g9;-><init>(Li0/a1;Landroid/content/SharedPreferences;ZLi0/a1;)V

    .line 47
    .line 48
    .line 49
    const p3, 0x4fdc2868

    .line 50
    .line 51
    .line 52
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    const/16 p3, 0x30

    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 60
    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 64
    .line 65
    .line 66
    :goto_1
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 67
    .line 68
    return-object p1

    .line 69
    :pswitch_0
    const/16 v0, 0x10

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    if-eq p1, v0, :cond_2

    .line 73
    .line 74
    move p1, v1

    .line 75
    goto :goto_2

    .line 76
    :cond_2
    const/4 p1, 0x0

    .line 77
    :goto_2
    and-int/2addr p3, v1

    .line 78
    invoke-virtual {p2, p3, p1}, Li0/h0;->S(IZ)Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-eqz p1, :cond_3

    .line 83
    .line 84
    new-instance p1, Lwb/g9;

    .line 85
    .line 86
    iget-object p3, p0, Lwb/wl;->i:Landroid/content/SharedPreferences;

    .line 87
    .line 88
    iget-boolean v0, p0, Lwb/wl;->j:Z

    .line 89
    .line 90
    iget-object v2, p0, Lwb/wl;->h:Li0/a1;

    .line 91
    .line 92
    iget-object v3, p0, Lwb/wl;->k:Li0/a1;

    .line 93
    .line 94
    invoke-direct {p1, p3, v0, v2, v3}, Lwb/g9;-><init>(Landroid/content/SharedPreferences;ZLi0/a1;Li0/a1;)V

    .line 95
    .line 96
    .line 97
    const p3, -0x17024127

    .line 98
    .line 99
    .line 100
    invoke-static {p3, p1, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    const/16 p3, 0x30

    .line 105
    .line 106
    const/4 v0, 0x0

    .line 107
    invoke-static {v0, p1, p2, p3, v1}, Lwb/ho;->C3(Ly0/o;Lfg/p;Li0/h0;II)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :cond_3
    invoke-virtual {p2}, Li0/h0;->V()V

    .line 112
    .line 113
    .line 114
    :goto_3
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 115
    .line 116
    return-object p1

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
