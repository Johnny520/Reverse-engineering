.class public final Li50;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmc0;


# instance fields
.field public final v:Lbk1;

.field public w:Z

.field public x:Z

.field public y:Z


# direct methods
.method public constructor <init>(Lbk1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lth1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li50;->v:Lbk1;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final E0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lth1;->A0()Lj20;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lh50;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v3, v2}, Lh50;-><init>(Ljava/lang/Object;Lt00;I)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x3

    .line 13
    invoke-static {v0, v3, v1, p0}, Lp7;->A(Lj20;La20;Lmn0;I)Lzt2;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final P(Lt61;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Lt61;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v2, p1, Lt61;->h:Lsp;

    .line 5
    .line 6
    iget-boolean v3, p0, Li50;->w:Z

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    sget-wide v3, Lju;->b:J

    .line 11
    .line 12
    const v0, 0x3e99999a    # 0.3f

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v3, v4}, Lju;->b(FJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-interface {v2}, Lnc0;->d()J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    const/16 v7, 0x7a

    .line 24
    .line 25
    move-wide v1, v3

    .line 26
    const-wide/16 v3, 0x0

    .line 27
    .line 28
    move-object v0, p1

    .line 29
    invoke-static/range {v0 .. v7}, Lnc0;->i0(Lnc0;JJJI)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_0
    iget-boolean v1, p0, Li50;->x:Z

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    iget-boolean v0, p0, Li50;->y:Z

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    return-void

    .line 43
    :cond_2
    :goto_0
    sget-wide v0, Lju;->b:J

    .line 44
    .line 45
    const v3, 0x3dcccccd    # 0.1f

    .line 46
    .line 47
    .line 48
    invoke-static {v3, v0, v1}, Lju;->b(FJ)J

    .line 49
    .line 50
    .line 51
    move-result-wide v0

    .line 52
    invoke-interface {v2}, Lnc0;->d()J

    .line 53
    .line 54
    .line 55
    move-result-wide v5

    .line 56
    const/16 v7, 0x7a

    .line 57
    .line 58
    const-wide/16 v3, 0x0

    .line 59
    .line 60
    move-wide v1, v0

    .line 61
    move-object v0, p1

    .line 62
    invoke-static/range {v0 .. v7}, Lnc0;->i0(Lnc0;JJJI)V

    .line 63
    .line 64
    .line 65
    return-void
.end method
