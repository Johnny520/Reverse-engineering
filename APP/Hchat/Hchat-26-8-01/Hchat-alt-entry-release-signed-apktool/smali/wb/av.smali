.class public final synthetic Lwb/av;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/q;


# instance fields
.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lwb/lv;

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Ljava/lang/String;

.field public final synthetic m:Z

.field public final synthetic n:Landroid/app/Activity;

.field public final synthetic o:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lwb/lv;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLandroid/app/Activity;Lfg/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwb/av;->g:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lwb/av;->h:Lwb/lv;

    .line 7
    .line 8
    iput p3, p0, Lwb/av;->i:I

    .line 9
    .line 10
    iput-object p4, p0, Lwb/av;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/av;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/av;->l:Ljava/lang/String;

    .line 15
    .line 16
    iput-boolean p7, p0, Lwb/av;->m:Z

    .line 17
    .line 18
    iput-object p8, p0, Lwb/av;->n:Landroid/app/Activity;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/av;->o:Lfg/l;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, Lfg/a;

    .line 3
    .line 4
    check-cast p2, Li0/h0;

    .line 5
    .line 6
    check-cast p3, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    and-int/lit8 p3, p1, 0x6

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    invoke-virtual {p2, v3}, Li0/h0;->h(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    if-eqz p3, :cond_0

    .line 24
    .line 25
    const/4 p3, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 p3, 0x2

    .line 28
    :goto_0
    or-int/2addr p1, p3

    .line 29
    :cond_1
    and-int/lit8 p3, p1, 0x13

    .line 30
    .line 31
    const/16 v0, 0x12

    .line 32
    .line 33
    if-eq p3, v0, :cond_2

    .line 34
    .line 35
    const/4 p3, 0x1

    .line 36
    goto :goto_1

    .line 37
    :cond_2
    const/4 p3, 0x0

    .line 38
    :goto_1
    and-int/lit8 v0, p1, 0x1

    .line 39
    .line 40
    invoke-virtual {p2, v0, p3}, Li0/h0;->S(IZ)Z

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    if-eqz p3, :cond_3

    .line 45
    .line 46
    sget-object p3, Lwb/y2;->p:Lwb/y2;

    .line 47
    .line 48
    new-instance v0, Lw/u;

    .line 49
    .line 50
    iget v1, p0, Lwb/av;->i:I

    .line 51
    .line 52
    iget-object v2, p0, Lwb/av;->j:Ljava/lang/String;

    .line 53
    .line 54
    move-object v5, v3

    .line 55
    iget-object v3, p0, Lwb/av;->k:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v4, p0, Lwb/av;->l:Ljava/lang/String;

    .line 58
    .line 59
    iget-boolean v6, p0, Lwb/av;->m:Z

    .line 60
    .line 61
    iget-object v7, p0, Lwb/av;->n:Landroid/app/Activity;

    .line 62
    .line 63
    iget-object v8, p0, Lwb/av;->o:Lfg/l;

    .line 64
    .line 65
    invoke-direct/range {v0 .. v8}, Lw/u;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfg/a;ZLandroid/app/Activity;Lfg/l;)V

    .line 66
    .line 67
    .line 68
    const v1, -0x4fc1ab0b

    .line 69
    .line 70
    .line 71
    invoke-static {v1, v0, p2}, Ls0/i;->e(ILsf/b;Li0/h0;)Ls0/d;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    shl-int/lit8 p1, p1, 0x9

    .line 76
    .line 77
    and-int/lit16 p1, p1, 0x1c00

    .line 78
    .line 79
    const v0, 0x36006

    .line 80
    .line 81
    .line 82
    or-int v6, p1, v0

    .line 83
    .line 84
    iget-object v1, p0, Lwb/av;->g:Ljava/lang/String;

    .line 85
    .line 86
    iget-object v2, p0, Lwb/av;->h:Lwb/lv;

    .line 87
    .line 88
    move-object v0, p3

    .line 89
    move-object v3, v5

    .line 90
    move-object v5, p2

    .line 91
    invoke-virtual/range {v0 .. v6}, Lwb/y2;->J(Ljava/lang/String;Lwb/lv;Lfg/a;Ls0/d;Li0/h0;I)V

    .line 92
    .line 93
    .line 94
    goto :goto_2

    .line 95
    :cond_3
    move-object v5, p2

    .line 96
    invoke-virtual {v5}, Li0/h0;->V()V

    .line 97
    .line 98
    .line 99
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 100
    .line 101
    return-object p1
.end method
