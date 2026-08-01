.class public final Lmc;
.super Loe0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lmk0;
.implements Lbc;
.implements Ltq;


# instance fields
.field public final r:Lnc;

.field public s:Z

.field public final t:Lo;


# direct methods
.method public constructor <init>(Lnc;Lo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Loe0;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lmc;->r:Lnc;

    .line 5
    .line 6
    iput-object p2, p0, Lmc;->t:Lo;

    .line 7
    .line 8
    iput-object p0, p1, Lnc;->d:Lbc;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final B(Ld60;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lmc;->s:Z

    .line 2
    .line 3
    iget-object v1, p0, Lmc;->r:Lnc;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, v1, Lnc;->e:Lx1;

    .line 9
    .line 10
    new-instance v0, Lm3;

    .line 11
    .line 12
    const/4 v2, 0x4

    .line 13
    invoke-direct {v0, v2, p0, v1}, Lm3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0}, Lr60;->v(Loe0;Lhw;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Lnc;->e:Lx1;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lmc;->s:Z

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "DrawResult not defined, did you forget to call onDraw?"

    .line 28
    .line 29
    invoke-static {p0}, Lt1;->g(Ljava/lang/String;)Lsg;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    throw p0

    .line 34
    :cond_1
    :goto_0
    iget-object p0, v1, Lnc;->e:Lx1;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Lx1;->e:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lsw;

    .line 42
    .line 43
    invoke-interface {p0, p1}, Lsw;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lmc;->w0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b()Lym;
    .locals 0

    .line 1
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lb60;->B:Lym;

    .line 6
    .line 7
    return-object p0
.end method

.method public final c()J
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {p0, v0}, Lpf1;->O(Lrm;I)Lqj0;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget-wide v0, p0, Lxq0;->f:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Lo30;->C(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final d0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lmc;->w0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final g0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lmc;->w0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final getLayoutDirection()Lk50;
    .locals 0

    .line 1
    invoke-static {p0}, Lpf1;->Q(Lrm;)Lb60;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lb60;->C:Lk50;

    .line 6
    .line 7
    return-object p0
.end method

.method public final p0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final q0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lmc;->w0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final w0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lmc;->s:Z

    .line 3
    .line 4
    iget-object v0, p0, Lmc;->r:Lnc;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lnc;->e:Lx1;

    .line 8
    .line 9
    invoke-static {p0}, Lkl;->r(Ltq;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final z()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lmc;->w0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
