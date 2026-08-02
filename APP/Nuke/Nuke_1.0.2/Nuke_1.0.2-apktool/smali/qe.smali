.class public final Lqe;
.super Landroid/text/SegmentFinder;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final synthetic a:Ldq1;


# direct methods
.method public constructor <init>(Ldq1;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqe;->a:Ldq1;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/text/SegmentFinder;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final nextEndBoundary(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lqe;->a:Ldq1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldq1;->c(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final nextStartBoundary(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lqe;->a:Ldq1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldq1;->k(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final previousEndBoundary(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lqe;->a:Ldq1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldq1;->l(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final previousStartBoundary(I)I
    .locals 0

    .line 1
    iget-object p0, p0, Lqe;->a:Ldq1;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ldq1;->b(I)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
