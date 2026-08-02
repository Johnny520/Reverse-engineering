.class public final Lqo;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Le70;


# instance fields
.field public h:Lrn;

.field public i:Ln4;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lgd3;->s:Lgd3;

    .line 5
    .line 6
    iput-object v0, p0, Lqo;->h:Lrn;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Lin0;)Ln4;
    .locals 2

    .line 1
    new-instance v0, Ln4;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ln4;-><init>(I)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Ln4;->i:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, Lqo;->i:Ln4;

    .line 11
    .line 12
    return-object v0
.end method

.method public final b()F
    .locals 0

    .line 1
    iget-object p0, p0, Lqo;->h:Lrn;

    .line 2
    .line 3
    invoke-interface {p0}, Lrn;->b()Le70;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Le70;->b()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public final m()F
    .locals 0

    .line 1
    iget-object p0, p0, Lqo;->h:Lrn;

    .line 2
    .line 3
    invoke-interface {p0}, Lrn;->b()Le70;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Le70;->m()F

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
