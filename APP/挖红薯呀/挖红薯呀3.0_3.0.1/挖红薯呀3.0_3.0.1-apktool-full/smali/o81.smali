.class public final Lo81;
.super Lqe;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# instance fields
.field public P:Z

.field public Q:Lsw;

.field public final R:Lk6;


# direct methods
.method public constructor <init>(ZLxg0;ZLxv0;Lsw;)V
    .locals 7

    .line 1
    new-instance v6, Ln81;

    .line 2
    .line 3
    invoke-direct {v6, p5, p1}, Ln81;-><init>(Lsw;Z)V

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p2

    .line 10
    move v4, p3

    .line 11
    move-object v5, p4

    .line 12
    invoke-direct/range {v0 .. v6}, Ln;-><init>(Lxg0;Lf10;ZZLxv0;Lhw;)V

    .line 13
    .line 14
    .line 15
    iput-boolean p1, v0, Lo81;->P:Z

    .line 16
    .line 17
    iput-object p5, v0, Lo81;->Q:Lsw;

    .line 18
    .line 19
    new-instance p0, Lk6;

    .line 20
    .line 21
    const/16 p1, 0xf

    .line 22
    .line 23
    invoke-direct {p0, p1, v0}, Lk6;-><init>(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object p0, v0, Lo81;->R:Lk6;

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final z0(Lf01;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lo81;->P:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lp81;->d:Lp81;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lp81;->e:Lp81;

    .line 9
    .line 10
    :goto_0
    sget-object v1, Ld01;->a:[Lu40;

    .line 11
    .line 12
    sget-object v1, Lb01;->H:Le01;

    .line 13
    .line 14
    sget-object v2, Ld01;->a:[Lu40;

    .line 15
    .line 16
    const/16 v3, 0x19

    .line 17
    .line 18
    aget-object v3, v2, v3

    .line 19
    .line 20
    invoke-interface {p1, v1, v0}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    sget-object v0, Ln2;->v:Lw4;

    .line 24
    .line 25
    sget-object v1, Lb01;->r:Le01;

    .line 26
    .line 27
    const/16 v3, 0x9

    .line 28
    .line 29
    aget-object v3, v2, v3

    .line 30
    .line 31
    invoke-interface {p1, v1, v0}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    iget-boolean p0, p0, Lo81;->P:Z

    .line 35
    .line 36
    new-instance v0, Lm5;

    .line 37
    .line 38
    invoke-static {p0}, Landroid/view/autofill/AutofillValue;->forToggle(Z)Landroid/view/autofill/AutofillValue;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-direct {v0, p0}, Lm5;-><init>(Landroid/view/autofill/AutofillValue;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lb01;->s:Le01;

    .line 46
    .line 47
    const/16 v1, 0xa

    .line 48
    .line 49
    aget-object v1, v2, v1

    .line 50
    .line 51
    invoke-interface {p1, p0, v0}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    new-instance p0, Lo;

    .line 55
    .line 56
    const/16 v0, 0x18

    .line 57
    .line 58
    invoke-direct {p0, v0, p1}, Lo;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lrz0;->h:Le01;

    .line 62
    .line 63
    new-instance v1, Lo0;

    .line 64
    .line 65
    const/4 v2, 0x0

    .line 66
    invoke-direct {v1, v2, p0}, Lo0;-><init>(Ljava/lang/String;Lex;)V

    .line 67
    .line 68
    .line 69
    invoke-interface {p1, v0, v1}, Lf01;->a(Le01;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method
