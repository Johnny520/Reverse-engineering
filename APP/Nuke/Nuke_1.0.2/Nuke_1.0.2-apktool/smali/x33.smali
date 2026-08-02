.class public final synthetic Lx33;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:Ly33;

.field public final synthetic i:F


# direct methods
.method public synthetic constructor <init>(Ly33;F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lx33;->h:Ly33;

    .line 5
    .line 6
    iput p2, p0, Lx33;->i:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
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
    iget-object p1, p0, Lx33;->h:Ly33;

    .line 8
    .line 9
    invoke-virtual {p1}, Ly33;->g()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    iget-object v3, p1, Ly33;->g:Llx1;

    .line 14
    .line 15
    if-nez v2, :cond_4

    .line 16
    .line 17
    invoke-virtual {v3}, Llx1;->g()J

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
    invoke-virtual {v3, v0, v1}, Llx1;->h(J)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p1, Ly33;->a:Lyk1;

    .line 31
    .line 32
    iget-object v2, v2, Lyk1;->a:Lnx1;

    .line 33
    .line 34
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 35
    .line 36
    invoke-virtual {v2, v4}, Lnx1;->setValue(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    invoke-virtual {v3}, Llx1;->g()J

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    sub-long/2addr v0, v2

    .line 44
    const/4 v2, 0x0

    .line 45
    iget p0, p0, Lx33;->i:F

    .line 46
    .line 47
    cmpg-float v2, p0, v2

    .line 48
    .line 49
    if-nez v2, :cond_1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    long-to-double v0, v0

    .line 53
    float-to-double v3, p0

    .line 54
    div-double/2addr v0, v3

    .line 55
    invoke-static {v0, v1}, Lgf1;->R(D)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    :goto_0
    iget-object p0, p1, Ly33;->b:Ly33;

    .line 60
    .line 61
    if-nez p0, :cond_2

    .line 62
    .line 63
    iget-object p0, p1, Ly33;->f:Llx1;

    .line 64
    .line 65
    invoke-virtual {p0, v0, v1}, Llx1;->h(J)V

    .line 66
    .line 67
    .line 68
    :cond_2
    if-nez v2, :cond_3

    .line 69
    .line 70
    const/4 p0, 0x1

    .line 71
    goto :goto_1

    .line 72
    :cond_3
    const/4 p0, 0x0

    .line 73
    :goto_1
    invoke-virtual {p1, v0, v1, p0}, Ly33;->h(JZ)V

    .line 74
    .line 75
    .line 76
    :cond_4
    sget-object p0, La83;->a:La83;

    .line 77
    .line 78
    return-object p0
.end method
