.class public final synthetic Li/h1;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:Li/k1;

.field public final synthetic h:F


# direct methods
.method public synthetic constructor <init>(Li/k1;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li/h1;->g:Li/k1;

    .line 5
    .line 6
    iput p2, p0, Li/h1;->h:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    check-cast p1, Ljava/lang/Long;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    iget-object p1, p0, Li/h1;->g:Li/k1;

    .line 8
    .line 9
    invoke-virtual {p1}, Li/k1;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p1, Li/k1;->g:Li0/h1;

    .line 14
    .line 15
    if-nez v2, :cond_5

    .line 16
    .line 17
    invoke-virtual {v3}, Li0/h1;->g()J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    const-wide/high16 v6, -0x8000000000000000L

    .line 22
    .line 23
    cmp-long v2, v4, v6

    .line 24
    .line 25
    if-nez v2, :cond_0

    .line 26
    .line 27
    invoke-virtual {v3, v0, v1}, Li0/h1;->h(J)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p1, Li/k1;->a:Lb/e;

    .line 31
    .line 32
    iget-object v2, v2, Lb/e;->h:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Li0/j1;

    .line 35
    .line 36
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v2, v4}, Li0/j1;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {v3}, Li0/h1;->g()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    sub-long/2addr v0, v2

    .line 46
    const/4 v2, 0x0

    .line 47
    iget v3, p0, Li/h1;->h:F

    .line 48
    .line 49
    cmpg-float v2, v3, v2

    .line 50
    .line 51
    if-nez v2, :cond_1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_1
    long-to-double v0, v0

    .line 55
    float-to-double v3, v3

    .line 56
    div-double/2addr v0, v3

    .line 57
    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_4

    .line 62
    .line 63
    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    :goto_0
    iget-object v3, p1, Li/k1;->b:Li/k1;

    .line 68
    .line 69
    if-nez v3, :cond_2

    .line 70
    .line 71
    iget-object v3, p1, Li/k1;->f:Li0/h1;

    .line 72
    .line 73
    invoke-virtual {v3, v0, v1}, Li0/h1;->h(J)V

    .line 74
    .line 75
    .line 76
    :cond_2
    if-nez v2, :cond_3

    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    goto :goto_1

    .line 80
    :cond_3
    const/4 v2, 0x0

    .line 81
    :goto_1
    invoke-virtual {p1, v0, v1, v2}, Li/k1;->h(JZ)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_4
    const-string p1, "Cannot round NaN value."

    .line 86
    .line 87
    invoke-static {p1}, Lj8/o;->t(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    const/4 p1, 0x0

    .line 91
    return-object p1

    .line 92
    :cond_5
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 93
    .line 94
    return-object p1
.end method
