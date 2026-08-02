.class public final Lsu2;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public volatile a:Z


# virtual methods
.method public final a()V
    .locals 0

    .line 1
    iget-boolean p0, p0, Lsu2;->a:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const-string p0, "Already released"

    .line 7
    .line 8
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
