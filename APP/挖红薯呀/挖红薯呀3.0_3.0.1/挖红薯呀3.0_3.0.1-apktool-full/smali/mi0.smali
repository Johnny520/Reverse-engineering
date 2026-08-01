.class public final Lmi0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lei0;

.field public final synthetic e:Z

.field public final synthetic f:Z

.field public final synthetic g:Lo31;

.field public final synthetic h:Lww;


# direct methods
.method public constructor <init>(Lei0;ZZLo31;Lww;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmi0;->d:Lei0;

    .line 5
    .line 6
    iput-boolean p2, p0, Lmi0;->e:Z

    .line 7
    .line 8
    iput-boolean p3, p0, Lmi0;->f:Z

    .line 9
    .line 10
    iput-object p4, p0, Lmi0;->g:Lo31;

    .line 11
    .line 12
    iput-object p5, p0, Lmi0;->h:Lww;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    check-cast p1, Lji;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Number;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    and-int/lit8 v0, p2, 0x3

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    const/4 v2, 0x1

    .line 13
    if-eq v0, v1, :cond_0

    .line 14
    .line 15
    move v0, v2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    and-int/2addr p2, v2

    .line 19
    move-object v5, p1

    .line 20
    check-cast v5, Lpi;

    .line 21
    .line 22
    invoke-virtual {v5, p2, v0}, Lpi;->O(IZ)Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    if-eqz p1, :cond_3

    .line 27
    .line 28
    sget-object p1, Li4;->m:Lea1;

    .line 29
    .line 30
    invoke-static {p1, v5}, Lfa1;->a(Lea1;Lpi;)Ls71;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    iget-boolean p1, p0, Lmi0;->f:Z

    .line 35
    .line 36
    iget-object p2, p0, Lmi0;->d:Lei0;

    .line 37
    .line 38
    if-nez p1, :cond_1

    .line 39
    .line 40
    iget-wide p1, p2, Lei0;->g:J

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    iget-boolean p1, p0, Lmi0;->e:Z

    .line 44
    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    iget-wide p1, p2, Lei0;->b:J

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    iget-wide p1, p2, Lei0;->e:J

    .line 51
    .line 52
    :goto_1
    iget-object v0, p0, Lmi0;->g:Lo31;

    .line 53
    .line 54
    invoke-static {p1, p2, v0, v5}, Lp11;->a(JLo31;Lpi;)Lw31;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-interface {p1}, Lw31;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    check-cast p1, Lff;

    .line 63
    .line 64
    iget-wide v1, p1, Lff;->a:J

    .line 65
    .line 66
    iget-object v4, p0, Lmi0;->h:Lww;

    .line 67
    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-static/range {v1 .. v6}, Lr60;->c(JLs71;Lww;Lji;I)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_3
    invoke-virtual {v5}, Lpi;->R()V

    .line 74
    .line 75
    .line 76
    :goto_2
    sget-object p0, Lna1;->a:Lna1;

    .line 77
    .line 78
    return-object p0
.end method
