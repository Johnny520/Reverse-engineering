.class public final Lac/g;
.super Lac/b;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public b:J


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lac/b;->a:I

    .line 5
    .line 6
    iput-wide p2, p0, Lac/g;->b:J

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()B
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    return v0
.end method

.method public final b()Z
    .locals 4

    .line 1
    iget-wide v0, p0, Lac/g;->b:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
.end method

.method public final c()F
    .locals 2

    .line 1
    iget-wide v0, p0, Lac/g;->b:J

    .line 2
    .line 3
    long-to-float v0, v0

    .line 4
    return v0
.end method

.method public final d()I
    .locals 2

    .line 1
    iget-wide v0, p0, Lac/g;->b:J

    .line 2
    .line 3
    long-to-int v0, v0

    .line 4
    return v0
.end method

.method public final e()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lac/g;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    .line 1
    iget-wide v0, p0, Lac/g;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method
