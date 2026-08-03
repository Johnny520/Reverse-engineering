.class public abstract Lf1/p0;
.super Lf1/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public a:Landroidx/lifecycle/x;

.field public b:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v0, p0, Lf1/p0;->b:J

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(FJLf1/h;)V
    .locals 5

    .line 1
    iget-object v0, p4, Lf1/h;->i:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Landroid/graphics/Paint;

    .line 4
    .line 5
    iget-object v1, p0, Lf1/p0;->a:Landroidx/lifecycle/x;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-wide v3, p0, Lf1/p0;->b:J

    .line 11
    .line 12
    invoke-static {v3, v4, p2, p3}, Le1/e;->a(JJ)Z

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-nez v3, :cond_3

    .line 17
    .line 18
    :cond_0
    invoke-static {p2, p3}, Le1/e;->c(J)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iput-object v2, p0, Lf1/p0;->a:Landroidx/lifecycle/x;

    .line 25
    .line 26
    const-wide p2, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    iput-wide p2, p0, Lf1/p0;->b:J

    .line 32
    .line 33
    move-object v1, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v1, p0, Lf1/p0;->a:Landroidx/lifecycle/x;

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    new-instance v1, Landroidx/lifecycle/x;

    .line 40
    .line 41
    const/16 v3, 0xa

    .line 42
    .line 43
    const/4 v4, 0x0

    .line 44
    invoke-direct {v1, v3, v4}, Landroidx/lifecycle/x;-><init>(IZ)V

    .line 45
    .line 46
    .line 47
    iput-object v1, p0, Lf1/p0;->a:Landroidx/lifecycle/x;

    .line 48
    .line 49
    :cond_2
    invoke-virtual {p0, p2, p3}, Lf1/p0;->b(J)Landroid/graphics/Shader;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    iput-object v3, v1, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object v1, p0, Lf1/p0;->a:Landroidx/lifecycle/x;

    .line 56
    .line 57
    iput-wide p2, p0, Lf1/p0;->b:J

    .line 58
    .line 59
    :cond_3
    :goto_0
    invoke-virtual {v0}, Landroid/graphics/Paint;->getColor()I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    invoke-static {p2}, Lf1/c0;->c(I)J

    .line 64
    .line 65
    .line 66
    move-result-wide p2

    .line 67
    sget-wide v3, Lf1/w;->b:J

    .line 68
    .line 69
    invoke-static {p2, p3, v3, v4}, Lf1/w;->c(JJ)Z

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    if-nez p2, :cond_4

    .line 74
    .line 75
    invoke-virtual {p4, v3, v4}, Lf1/h;->w(J)V

    .line 76
    .line 77
    .line 78
    :cond_4
    iget-object p2, p4, Lf1/h;->j:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p2, Landroid/graphics/Shader;

    .line 81
    .line 82
    if-eqz v1, :cond_5

    .line 83
    .line 84
    iget-object p3, v1, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p3, Landroid/graphics/Shader;

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_5
    move-object p3, v2

    .line 90
    :goto_1
    invoke-static {p2, p3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result p2

    .line 94
    if-nez p2, :cond_7

    .line 95
    .line 96
    if-eqz v1, :cond_6

    .line 97
    .line 98
    iget-object p2, v1, Landroidx/lifecycle/x;->h:Ljava/lang/Object;

    .line 99
    .line 100
    move-object v2, p2

    .line 101
    check-cast v2, Landroid/graphics/Shader;

    .line 102
    .line 103
    :cond_6
    invoke-virtual {p4, v2}, Lf1/h;->z(Landroid/graphics/Shader;)V

    .line 104
    .line 105
    .line 106
    :cond_7
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 107
    .line 108
    .line 109
    move-result p2

    .line 110
    int-to-float p2, p2

    .line 111
    const/high16 p3, 0x437f0000    # 255.0f

    .line 112
    .line 113
    div-float/2addr p2, p3

    .line 114
    cmpg-float p2, p2, p1

    .line 115
    .line 116
    if-nez p2, :cond_8

    .line 117
    .line 118
    return-void

    .line 119
    :cond_8
    invoke-virtual {p4, p1}, Lf1/h;->u(F)V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public abstract b(J)Landroid/graphics/Shader;
.end method
