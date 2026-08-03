.class public final Lxb/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lqg/t;

.field public final b:Lsh/j;

.field public final c:Li/r0;

.field public final d:Li/r0;

.field public final e:Li/c;

.field public final f:Li/c;

.field public g:J

.field public final h:Landroid/graphics/RuntimeShader;

.field public final i:Ly0/o;

.field public final j:Ly0/o;


# direct methods
.method public constructor <init>(Lqg/t;Lsh/j;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxb/o;->a:Lqg/t;

    .line 8
    .line 9
    iput-object p2, p0, Lxb/o;->b:Lsh/j;

    .line 10
    .line 11
    const p2, 0x3a83126f    # 0.001f

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    new-instance v1, Li/r0;

    .line 19
    .line 20
    const/high16 v2, 0x3f000000    # 0.5f

    .line 21
    .line 22
    const/high16 v3, 0x43960000    # 300.0f

    .line 23
    .line 24
    invoke-direct {v1, v2, v3, v0}, Li/r0;-><init>(FFLjava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iput-object v1, p0, Lxb/o;->c:Li/r0;

    .line 28
    .line 29
    const/high16 v0, 0x3f800000    # 1.0f

    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    int-to-long v4, v1

    .line 36
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    int-to-long v6, v1

    .line 41
    const/16 v1, 0x20

    .line 42
    .line 43
    shl-long/2addr v4, v1

    .line 44
    const-wide v8, 0xffffffffL

    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    and-long/2addr v6, v8

    .line 50
    or-long/2addr v4, v6

    .line 51
    new-instance v6, Le1/b;

    .line 52
    .line 53
    invoke-direct {v6, v4, v5}, Le1/b;-><init>(J)V

    .line 54
    .line 55
    .line 56
    new-instance v4, Li/r0;

    .line 57
    .line 58
    invoke-direct {v4, v2, v3, v6}, Li/r0;-><init>(FFLjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    iput-object v4, p0, Lxb/o;->d:Li/r0;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-static {v2, p2}, Li/d;->a(FF)Li/c;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    iput-object p2, p0, Lxb/o;->e:Li/c;

    .line 69
    .line 70
    new-instance p2, Li/c;

    .line 71
    .line 72
    new-instance v2, Le1/b;

    .line 73
    .line 74
    const-wide/16 v3, 0x0

    .line 75
    .line 76
    invoke-direct {v2, v3, v4}, Le1/b;-><init>(J)V

    .line 77
    .line 78
    .line 79
    sget-object v5, Li/d;->o:Li/m1;

    .line 80
    .line 81
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    int-to-long v6, v6

    .line 86
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    int-to-long v10, v0

    .line 91
    shl-long v0, v6, v1

    .line 92
    .line 93
    and-long v6, v10, v8

    .line 94
    .line 95
    or-long/2addr v0, v6

    .line 96
    new-instance v6, Le1/b;

    .line 97
    .line 98
    invoke-direct {v6, v0, v1}, Le1/b;-><init>(J)V

    .line 99
    .line 100
    .line 101
    const/16 v0, 0x8

    .line 102
    .line 103
    invoke-direct {p2, v2, v5, v6, v0}, Li/c;-><init>(Ljava/lang/Object;Li/m1;Ljava/lang/Object;I)V

    .line 104
    .line 105
    .line 106
    iput-object p2, p0, Lxb/o;->f:Li/c;

    .line 107
    .line 108
    iput-wide v3, p0, Lxb/o;->g:J

    .line 109
    .line 110
    invoke-static {}, Lxb/k;->b()V

    .line 111
    .line 112
    .line 113
    invoke-static {}, Lxb/k;->a()Landroid/graphics/RuntimeShader;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    iput-object p2, p0, Lxb/o;->h:Landroid/graphics/RuntimeShader;

    .line 118
    .line 119
    new-instance p2, Lxb/l;

    .line 120
    .line 121
    const/4 v0, 0x0

    .line 122
    invoke-direct {p2, p0, v0}, Lxb/l;-><init>(Lxb/o;I)V

    .line 123
    .line 124
    .line 125
    sget-object v0, Ly0/l;->a:Ly0/l;

    .line 126
    .line 127
    invoke-static {v0, p2}, Lc1/h;->f(Ly0/o;Lfg/l;)Ly0/o;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    iput-object p2, p0, Lxb/o;->i:Ly0/o;

    .line 132
    .line 133
    new-instance p2, Lc0/g;

    .line 134
    .line 135
    const/16 v1, 0x9

    .line 136
    .line 137
    invoke-direct {p2, p0, v1}, Lc0/g;-><init>(Ljava/lang/Object;I)V

    .line 138
    .line 139
    .line 140
    invoke-static {v0, p1, p2}, Ls1/h0;->a(Ly0/o;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)Ly0/o;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    iput-object p1, p0, Lxb/o;->j:Ly0/o;

    .line 145
    .line 146
    return-void
.end method
