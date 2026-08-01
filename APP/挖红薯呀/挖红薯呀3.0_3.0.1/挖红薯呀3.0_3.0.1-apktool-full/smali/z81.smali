.class public final synthetic Lz81;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lsw;


# instance fields
.field public final synthetic d:Lb91;

.field public final synthetic e:F


# direct methods
.method public synthetic constructor <init>(Lb91;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lz81;->d:Lb91;

    .line 5
    .line 6
    iput p2, p0, Lz81;->e:F

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
    iget-object p1, p0, Lz81;->d:Lb91;

    .line 8
    .line 9
    invoke-virtual {p1}, Lb91;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p1, Lb91;->g:Lep0;

    .line 14
    .line 15
    if-nez v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {v3}, Lep0;->g()J

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
    invoke-virtual {v3, v0, v1}, Lep0;->h(J)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p1, Lb91;->a:Ld;

    .line 31
    .line 32
    iget-object v2, v2, Ld;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v2, Lgp0;

    .line 35
    .line 36
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v2, v4}, Lgp0;->setValue(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    invoke-virtual {v3}, Lep0;->g()J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    sub-long/2addr v0, v2

    .line 46
    const/4 v2, 0x0

    .line 47
    iget p0, p0, Lz81;->e:F

    .line 48
    .line 49
    cmpg-float v2, p0, v2

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
    float-to-double v3, p0

    .line 56
    div-double/2addr v0, v3

    .line 57
    invoke-static {v0, v1}, Lrd0;->R(D)J

    .line 58
    .line 59
    .line 60
    move-result-wide v0

    .line 61
    :goto_0
    iget-object p0, p1, Lb91;->b:Lb91;

    .line 62
    .line 63
    if-nez p0, :cond_2

    .line 64
    .line 65
    iget-object p0, p1, Lb91;->f:Lep0;

    .line 66
    .line 67
    invoke-virtual {p0, v0, v1}, Lep0;->h(J)V

    .line 68
    .line 69
    .line 70
    :cond_2
    if-nez v2, :cond_3

    .line 71
    .line 72
    const/4 p0, 0x1

    .line 73
    goto :goto_1

    .line 74
    :cond_3
    const/4 p0, 0x0

    .line 75
    :goto_1
    invoke-virtual {p1, v0, v1, p0}, Lb91;->h(JZ)V

    .line 76
    .line 77
    .line 78
    :cond_4
    sget-object p0, Lna1;->a:Lna1;

    .line 79
    .line 80
    return-object p0
.end method
