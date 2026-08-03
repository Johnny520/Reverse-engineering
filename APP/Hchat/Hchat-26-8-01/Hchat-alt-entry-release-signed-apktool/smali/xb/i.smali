.class public final Lxb/i;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lqg/t;

.field public final b:Llg/a;

.field public final c:Lc9/u;

.field public final d:Lhb/w;

.field public final e:Lwb/k3;

.field public final f:Li/r0;

.field public final g:Li/r0;

.field public final h:Li/r0;

.field public final i:Li/r0;

.field public final j:Li/r0;

.field public final k:Li/c;

.field public final l:Li/c;

.field public final m:Li/c;

.field public final n:Li/c;

.field public final o:Li/c;

.field public final p:Lk/h1;

.field public final q:Lm/a;

.field public final r:Ly0/o;


# direct methods
.method public constructor <init>(Lqg/t;FLlg/a;Lc9/u;Lwb/m0;Lhb/w;Lwb/k3;)V
    .locals 2

    .line 1
    const p5, 0x3a83126f    # 0.001f

    .line 2
    .line 3
    .line 4
    invoke-static {p5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lxb/i;->a:Lqg/t;

    .line 15
    .line 16
    iput-object p3, p0, Lxb/i;->b:Llg/a;

    .line 17
    .line 18
    iput-object p4, p0, Lxb/i;->c:Lc9/u;

    .line 19
    .line 20
    iput-object p6, p0, Lxb/i;->d:Lhb/w;

    .line 21
    .line 22
    iput-object p7, p0, Lxb/i;->e:Lwb/k3;

    .line 23
    .line 24
    new-instance p1, Li/r0;

    .line 25
    .line 26
    const/high16 p3, 0x3f800000    # 1.0f

    .line 27
    .line 28
    const/high16 p4, 0x447a0000    # 1000.0f

    .line 29
    .line 30
    invoke-direct {p1, p3, p4, v0}, Li/r0;-><init>(FFLjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lxb/i;->f:Li/r0;

    .line 34
    .line 35
    const p1, 0x3c23d70b    # 0.010000001f

    .line 36
    .line 37
    .line 38
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance p6, Li/r0;

    .line 43
    .line 44
    const/high16 p7, 0x3f000000    # 0.5f

    .line 45
    .line 46
    const/high16 v1, 0x43960000    # 300.0f

    .line 47
    .line 48
    invoke-direct {p6, p7, v1, p1}, Li/r0;-><init>(FFLjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    iput-object p6, p0, Lxb/i;->g:Li/r0;

    .line 52
    .line 53
    new-instance p1, Li/r0;

    .line 54
    .line 55
    invoke-direct {p1, p3, p4, v0}, Li/r0;-><init>(FFLjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, Lxb/i;->h:Li/r0;

    .line 59
    .line 60
    new-instance p1, Li/r0;

    .line 61
    .line 62
    const p4, 0x3f19999a    # 0.6f

    .line 63
    .line 64
    .line 65
    const/high16 p6, 0x437a0000    # 250.0f

    .line 66
    .line 67
    invoke-direct {p1, p4, p6, v0}, Li/r0;-><init>(FFLjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iput-object p1, p0, Lxb/i;->i:Li/r0;

    .line 71
    .line 72
    new-instance p1, Li/r0;

    .line 73
    .line 74
    const p4, 0x3f333333    # 0.7f

    .line 75
    .line 76
    .line 77
    invoke-direct {p1, p4, p6, v0}, Li/r0;-><init>(FFLjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    iput-object p1, p0, Lxb/i;->j:Li/r0;

    .line 81
    .line 82
    invoke-static {p2, p5}, Li/d;->a(FF)Li/c;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    iput-object p1, p0, Lxb/i;->k:Li/c;

    .line 87
    .line 88
    const/high16 p1, 0x40a00000    # 5.0f

    .line 89
    .line 90
    const/4 p2, 0x0

    .line 91
    invoke-static {p2, p1}, Li/d;->a(FF)Li/c;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    iput-object p1, p0, Lxb/i;->l:Li/c;

    .line 96
    .line 97
    invoke-static {p2, p5}, Li/d;->a(FF)Li/c;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    iput-object p1, p0, Lxb/i;->m:Li/c;

    .line 102
    .line 103
    invoke-static {p3, p5}, Li/d;->a(FF)Li/c;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, p0, Lxb/i;->n:Li/c;

    .line 108
    .line 109
    invoke-static {p3, p5}, Li/d;->a(FF)Li/c;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iput-object p1, p0, Lxb/i;->o:Li/c;

    .line 114
    .line 115
    new-instance p1, Lk/h1;

    .line 116
    .line 117
    invoke-direct {p1}, Lk/h1;-><init>()V

    .line 118
    .line 119
    .line 120
    iput-object p1, p0, Lxb/i;->p:Lk/h1;

    .line 121
    .line 122
    new-instance p1, Lm/a;

    .line 123
    .line 124
    const/16 p2, 0x11

    .line 125
    .line 126
    invoke-direct {p1, p2}, Lm/a;-><init>(I)V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, Lxb/i;->q:Lm/a;

    .line 130
    .line 131
    new-instance p1, Lc0/g;

    .line 132
    .line 133
    const/16 p2, 0x8

    .line 134
    .line 135
    invoke-direct {p1, p0, p2}, Lc0/g;-><init>(Ljava/lang/Object;I)V

    .line 136
    .line 137
    .line 138
    sget-object p2, Ly0/l;->a:Ly0/l;

    .line 139
    .line 140
    sget-object p3, Lsf/n;->a:Lsf/n;

    .line 141
    .line 142
    invoke-static {p2, p3, p1}, Ls1/h0;->a(Ly0/o;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;

    .line 143
    .line 144
    .line 145
    move-result-object p1

    .line 146
    iput-object p1, p0, Lxb/i;->r:Ly0/o;

    .line 147
    .line 148
    return-void
.end method


# virtual methods
.method public final a()F
    .locals 1

    .line 1
    iget-object v0, p0, Lxb/i;->m:Li/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/c;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method

.method public final b()F
    .locals 1

    .line 1
    iget-object v0, p0, Lxb/i;->k:Li/c;

    .line 2
    .line 3
    iget-object v0, v0, Li/c;->e:Li0/j1;

    .line 4
    .line 5
    invoke-virtual {v0}, Li0/j1;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    return v0
.end method

.method public final c()F
    .locals 1

    .line 1
    iget-object v0, p0, Lxb/i;->k:Li/c;

    .line 2
    .line 3
    invoke-virtual {v0}, Li/c;->d()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Number;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
.end method
