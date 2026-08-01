.class public final Lsf0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Liw1;


# instance fields
.field public final ε:Lj60;

.field public ζ:Z

.field public final synthetic η:Luf0;


# direct methods
.method public constructor <init>(Luf0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsf0;->η:Luf0;

    .line 5
    .line 6
    new-instance v0, Lj60;

    .line 7
    .line 8
    iget-object p1, p1, Luf0;->γ:Lm6;

    .line 9
    .line 10
    iget-object p1, p1, Lm6;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lqk1;

    .line 13
    .line 14
    iget-object p1, p1, Lqk1;->ε:Liw1;

    .line 15
    .line 16
    invoke-interface {p1}, Liw1;->α()Lm42;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    invoke-direct {v0, p1}, Lj60;-><init>(Lm42;)V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, Lsf0;->ε:Lj60;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lsf0;->ζ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lsf0;->ζ:Z

    .line 8
    .line 9
    iget-object v0, p0, Lsf0;->ε:Lj60;

    .line 10
    .line 11
    iget-object v1, v0, Lj60;->ε:Lm42;

    .line 12
    .line 13
    sget-object v2, Lm42;->δ:Ll42;

    .line 14
    .line 15
    iput-object v2, v0, Lj60;->ε:Lm42;

    .line 16
    .line 17
    invoke-virtual {v1}, Lm42;->α()Lm42;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lm42;->β()Lm42;

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x3

    .line 24
    iget-object p0, p0, Lsf0;->η:Luf0;

    .line 25
    .line 26
    iput v0, p0, Luf0;->δ:I

    .line 27
    .line 28
    return-void
.end method

.method public final flush()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lsf0;->ζ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object p0, p0, Lsf0;->η:Luf0;

    .line 7
    .line 8
    iget-object p0, p0, Luf0;->γ:Lm6;

    .line 9
    .line 10
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, Lqk1;

    .line 13
    .line 14
    invoke-virtual {p0}, Lqk1;->flush()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final α()Lm42;
    .locals 0

    .line 1
    iget-object p0, p0, Lsf0;->ε:Lj60;

    .line 2
    .line 3
    return-object p0
.end method

.method public final ζ(JLsc;)V
    .locals 7

    .line 1
    iget-boolean v0, p0, Lsf0;->ζ:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-wide v1, p3, Lsc;->ζ:J

    .line 6
    .line 7
    const-wide/16 v3, 0x0

    .line 8
    .line 9
    move-wide v5, p1

    .line 10
    invoke-static/range {v1 .. v6}, Lsd2;->α(JJJ)V

    .line 11
    .line 12
    .line 13
    iget-object p0, p0, Lsf0;->η:Luf0;

    .line 14
    .line 15
    iget-object p0, p0, Luf0;->γ:Lm6;

    .line 16
    .line 17
    iget-object p0, p0, Lm6;->θ:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, Lqk1;

    .line 20
    .line 21
    invoke-virtual {p0, v5, v6, p3}, Lqk1;->ζ(JLsc;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    const-string p0, "closed"

    .line 26
    .line 27
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
