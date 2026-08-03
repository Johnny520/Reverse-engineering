.class public final synthetic Lwb/cb;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lfg/l;

.field public final synthetic i:Z

.field public final synthetic j:Ljava/lang/String;

.field public final synthetic k:Ljava/lang/String;

.field public final synthetic l:Lfg/a;

.field public final synthetic m:Lfg/a;

.field public final synthetic n:Ljava/lang/String;

.field public final synthetic o:Lfg/a;

.field public final synthetic p:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ILfg/l;ZLjava/lang/String;Ljava/lang/String;Lfg/a;Lfg/a;Ljava/lang/String;Lfg/a;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lwb/cb;->g:I

    .line 5
    .line 6
    iput-object p2, p0, Lwb/cb;->h:Lfg/l;

    .line 7
    .line 8
    iput-boolean p3, p0, Lwb/cb;->i:Z

    .line 9
    .line 10
    iput-object p4, p0, Lwb/cb;->j:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p5, p0, Lwb/cb;->k:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lwb/cb;->l:Lfg/a;

    .line 15
    .line 16
    iput-object p7, p0, Lwb/cb;->m:Lfg/a;

    .line 17
    .line 18
    iput-object p8, p0, Lwb/cb;->n:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, Lwb/cb;->o:Lfg/a;

    .line 21
    .line 22
    iput-object p10, p0, Lwb/cb;->p:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    check-cast p1, Lr/h;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    sget-object v0, Lwb/p0;->l4:Ls0/d;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x3

    .line 10
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 11
    .line 12
    .line 13
    new-instance v0, Lwb/fe;

    .line 14
    .line 15
    iget v9, p0, Lwb/cb;->g:I

    .line 16
    .line 17
    iget-object v3, p0, Lwb/cb;->h:Lfg/l;

    .line 18
    .line 19
    iget-boolean v6, p0, Lwb/cb;->i:Z

    .line 20
    .line 21
    invoke-direct {v0, v9, v3, v6}, Lwb/fe;-><init>(ILfg/l;Z)V

    .line 22
    .line 23
    .line 24
    new-instance v3, Ls0/d;

    .line 25
    .line 26
    const v4, 0x37daa466

    .line 27
    .line 28
    .line 29
    const/4 v10, 0x1

    .line 30
    invoke-direct {v3, v4, v0, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 31
    .line 32
    .line 33
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lwb/p0;->m4:Ls0/d;

    .line 37
    .line 38
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 39
    .line 40
    .line 41
    new-instance v3, Lwb/ge;

    .line 42
    .line 43
    iget-object v4, p0, Lwb/cb;->j:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v5, p0, Lwb/cb;->k:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v7, p0, Lwb/cb;->l:Lfg/a;

    .line 48
    .line 49
    iget-object v8, p0, Lwb/cb;->m:Lfg/a;

    .line 50
    .line 51
    invoke-direct/range {v3 .. v9}, Lwb/ge;-><init>(Ljava/lang/String;Ljava/lang/String;ZLfg/a;Lfg/a;I)V

    .line 52
    .line 53
    .line 54
    new-instance v0, Ls0/d;

    .line 55
    .line 56
    const v4, -0x6a67d718

    .line 57
    .line 58
    .line 59
    invoke-direct {v0, v4, v3, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 63
    .line 64
    .line 65
    if-ne v9, v10, :cond_0

    .line 66
    .line 67
    sget-object v0, Lwb/p0;->n4:Ls0/d;

    .line 68
    .line 69
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 70
    .line 71
    .line 72
    new-instance v0, Lwb/yd;

    .line 73
    .line 74
    iget-object v3, p0, Lwb/cb;->n:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v4, p0, Lwb/cb;->o:Lfg/a;

    .line 77
    .line 78
    invoke-direct {v0, v3, v6, v4}, Lwb/yd;-><init>(Ljava/lang/String;ZLfg/a;)V

    .line 79
    .line 80
    .line 81
    new-instance v3, Ls0/d;

    .line 82
    .line 83
    const v4, 0x1563adc1

    .line 84
    .line 85
    .line 86
    invoke-direct {v3, v4, v0, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 87
    .line 88
    .line 89
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 90
    .line 91
    .line 92
    :cond_0
    sget-object v0, Lwb/p0;->o4:Ls0/d;

    .line 93
    .line 94
    invoke-static {p1, v1, v0, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 95
    .line 96
    .line 97
    new-instance v0, Lh0/f;

    .line 98
    .line 99
    const/4 v3, 0x4

    .line 100
    iget-object v4, p0, Lwb/cb;->p:Ljava/lang/String;

    .line 101
    .line 102
    invoke-direct {v0, v6, v4, v3}, Lh0/f;-><init>(ZLjava/lang/Object;I)V

    .line 103
    .line 104
    .line 105
    new-instance v3, Ls0/d;

    .line 106
    .line 107
    const v4, -0xcaa5296

    .line 108
    .line 109
    .line 110
    invoke-direct {v3, v4, v0, v10}, Ls0/d;-><init>(ILsf/b;Z)V

    .line 111
    .line 112
    .line 113
    invoke-static {p1, v1, v3, v2}, Lr/h;->a(Lr/h;Ljava/lang/Object;Lfg/q;I)V

    .line 114
    .line 115
    .line 116
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 117
    .line 118
    return-object p1
.end method
