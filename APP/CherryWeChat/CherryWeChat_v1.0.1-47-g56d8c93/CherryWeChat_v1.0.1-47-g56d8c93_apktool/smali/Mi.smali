.class public final LMi;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/Window$OnFrameMetricsAvailableListener;


# instance fields
.field public final synthetic a:LNi;


# direct methods
.method public constructor <init>(LNi;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LMi;->a:LNi;

    return-void
.end method


# virtual methods
.method public final onFrameMetricsAvailable(Landroid/view/Window;Landroid/view/FrameMetrics;I)V
    .locals 9

    iget-object p1, p0, LMi;->a:LNi;

    iget p3, p1, LNi;->a:I

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x0

    const/16 v2, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p1, LNi;->b:Ljava/lang/Object;

    check-cast v0, [Landroid/util/SparseIntArray;

    aget-object v0, v0, v1

    invoke-virtual {p2, v2}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v3

    invoke-static {v0, v3, v4}, LNi;->a(Landroid/util/SparseIntArray;J)V

    :cond_0
    and-int/lit8 v0, p3, 0x2

    if-eqz v0, :cond_1

    iget-object v0, p1, LNi;->b:Ljava/lang/Object;

    check-cast v0, [Landroid/util/SparseIntArray;

    const/4 v3, 0x1

    aget-object v0, v0, v3

    invoke-virtual {p2, v3}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v3

    invoke-static {v0, v3, v4}, LNi;->a(Landroid/util/SparseIntArray;J)V

    :cond_1
    and-int/lit8 v0, p3, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    if-eqz v0, :cond_2

    iget-object v0, p1, LNi;->b:Ljava/lang/Object;

    check-cast v0, [Landroid/util/SparseIntArray;

    aget-object v0, v0, v4

    invoke-virtual {p2, v3}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v5

    invoke-static {v0, v5, v6}, LNi;->a(Landroid/util/SparseIntArray;J)V

    :cond_2
    and-int/lit8 v0, p3, 0x8

    const/4 v5, 0x4

    if-eqz v0, :cond_3

    iget-object v0, p1, LNi;->b:Ljava/lang/Object;

    check-cast v0, [Landroid/util/SparseIntArray;

    aget-object v0, v0, v3

    invoke-virtual {p2, v5}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v6

    invoke-static {v0, v6, v7}, LNi;->a(Landroid/util/SparseIntArray;J)V

    :cond_3
    and-int/lit8 v0, p3, 0x10

    const/4 v3, 0x5

    if-eqz v0, :cond_4

    iget-object v0, p1, LNi;->b:Ljava/lang/Object;

    check-cast v0, [Landroid/util/SparseIntArray;

    aget-object v0, v0, v5

    invoke-virtual {p2, v3}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v5

    invoke-static {v0, v5, v6}, LNi;->a(Landroid/util/SparseIntArray;J)V

    :cond_4
    and-int/lit8 v0, p3, 0x40

    const/4 v5, 0x7

    const/4 v6, 0x6

    if-eqz v0, :cond_5

    iget-object v0, p1, LNi;->b:Ljava/lang/Object;

    check-cast v0, [Landroid/util/SparseIntArray;

    aget-object v0, v0, v6

    invoke-virtual {p2, v5}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v7

    invoke-static {v0, v7, v8}, LNi;->a(Landroid/util/SparseIntArray;J)V

    :cond_5
    and-int/lit8 v0, p3, 0x20

    if-eqz v0, :cond_6

    iget-object v0, p1, LNi;->b:Ljava/lang/Object;

    check-cast v0, [Landroid/util/SparseIntArray;

    aget-object v0, v0, v3

    invoke-virtual {p2, v6}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v6

    invoke-static {v0, v6, v7}, LNi;->a(Landroid/util/SparseIntArray;J)V

    :cond_6
    and-int/lit16 v0, p3, 0x80

    if-eqz v0, :cond_7

    iget-object v0, p1, LNi;->b:Ljava/lang/Object;

    check-cast v0, [Landroid/util/SparseIntArray;

    aget-object v0, v0, v5

    invoke-virtual {p2, v1}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide v5

    invoke-static {v0, v5, v6}, LNi;->a(Landroid/util/SparseIntArray;J)V

    :cond_7
    and-int/lit16 p3, p3, 0x100

    if-eqz p3, :cond_8

    iget-object p1, p1, LNi;->b:Ljava/lang/Object;

    check-cast p1, [Landroid/util/SparseIntArray;

    aget-object p1, p1, v2

    invoke-virtual {p2, v4}, Landroid/view/FrameMetrics;->getMetric(I)J

    move-result-wide p2

    invoke-static {p1, p2, p3}, LNi;->a(Landroid/util/SparseIntArray;J)V

    :cond_8
    return-void
.end method
