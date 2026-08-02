.class public abstract Li93;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public a:Lin0;


# virtual methods
.method public abstract a(Lnc0;)V
.end method

.method public b()Lin0;
    .locals 0

    .line 1
    iget-object p0, p0, Li93;->a:Lin0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()V
    .locals 1

    .line 1
    invoke-virtual {p0}, Li93;->b()Lin0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-interface {v0, p0}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    :cond_0
    return-void
.end method

.method public d(Lv5;)V
    .locals 0

    .line 1
    iput-object p1, p0, Li93;->a:Lin0;

    .line 2
    .line 3
    return-void
.end method
