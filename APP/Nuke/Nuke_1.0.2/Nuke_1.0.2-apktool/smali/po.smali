.class public final Lpo;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Los1;
.implements Lrn;
.implements Lmc0;


# instance fields
.field public final v:Lqo;

.field public w:Z

.field public x:Lin0;


# direct methods
.method public constructor <init>(Lqo;Lin0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lth1;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpo;->v:Lqo;

    .line 5
    .line 6
    iput-object p2, p0, Lpo;->x:Lin0;

    .line 7
    .line 8
    iput-object p0, p1, Lqo;->h:Lrn;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final F0()V
    .locals 0

    .line 1
    return-void
.end method

.method public final G0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lpo;->M0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final L()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lpo;->M0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final M0()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lpo;->w:Z

    .line 3
    .line 4
    iget-object v0, p0, Lpo;->v:Lqo;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    iput-object v1, v0, Lqo;->i:Ln4;

    .line 8
    .line 9
    invoke-static {p0}, Lci0;->M(Lmc0;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final P(Lt61;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lpo;->w:Z

    .line 2
    .line 3
    iget-object v1, p0, Lpo;->v:Lqo;

    .line 4
    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    iput-object v0, v1, Lqo;->i:Ln4;

    .line 9
    .line 10
    new-instance v0, Lt6;

    .line 11
    .line 12
    const/4 v2, 0x3

    .line 13
    invoke-direct {v0, v2, p0, v1}, Lt6;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-static {p0, v0}, Ls11;->S(Lth1;Lxm0;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, v1, Lqo;->i:Ln4;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    iput-boolean v0, p0, Lpo;->w:Z

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "DrawResult not defined, did you forget to call onDraw?"

    .line 28
    .line 29
    invoke-static {p0}, Lvi0;->e(Ljava/lang/String;)Lpv;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    throw p0

    .line 34
    :cond_1
    :goto_0
    iget-object p0, v1, Lqo;->i:Ln4;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Ln4;->i:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, Lin0;

    .line 42
    .line 43
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    return-void
.end method

.method public final a()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lpo;->M0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final b()Le70;
    .locals 0

    .line 1
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lr61;->F:Le70;

    .line 6
    .line 7
    return-object p0
.end method

.method public final d()J
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-static {p0, v0}, Lsp0;->Z(Lt60;I)Lzn1;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    iget-wide v0, p0, Lsz1;->j:J

    .line 7
    .line 8
    invoke-static {v0, v1}, Ls11;->q0(J)J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    return-wide v0
.end method

.method public final getLayoutDirection()Ld61;
    .locals 0

    .line 1
    invoke-static {p0}, Lsp0;->c0(Lt60;)Lr61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, Lr61;->G:Ld61;

    .line 6
    .line 7
    return-object p0
.end method

.method public final r0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lpo;->M0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final w0()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lpo;->M0()V

    .line 2
    .line 3
    .line 4
    return-void
.end method
