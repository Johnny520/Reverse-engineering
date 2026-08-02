.class public final Lnk0;
.super Lth1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lpk0;


# instance fields
.field public v:Lin0;

.field public w:Lkl0;


# virtual methods
.method public final Z(Lkl0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lnk0;->w:Lkl0;

    .line 2
    .line 3
    invoke-static {v0, p1}, Lt11;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object p1, p0, Lnk0;->w:Lkl0;

    .line 10
    .line 11
    iget-object p0, p0, Lnk0;->v:Lin0;

    .line 12
    .line 13
    invoke-interface {p0, p1}, Lin0;->j(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :cond_0
    return-void
.end method
