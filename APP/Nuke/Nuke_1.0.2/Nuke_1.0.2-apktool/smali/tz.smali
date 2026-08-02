.class public final Ltz;
.super Lqz;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public b:F


# direct methods
.method public constructor <init>(FI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lqz;->a:I

    .line 5
    .line 6
    iput p1, p0, Ltz;->b:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a()B
    .locals 0

    .line 1
    const/4 p0, 0x3

    .line 2
    return p0
.end method

.method public final b()Z
    .locals 1

    .line 1
    iget p0, p0, Ltz;->b:F

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    cmpl-float p0, p0, v0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const/4 p0, 0x1

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
.end method

.method public final c()F
    .locals 0

    .line 1
    iget p0, p0, Ltz;->b:F

    .line 2
    .line 3
    return p0
.end method

.method public final d()I
    .locals 0

    .line 1
    iget p0, p0, Ltz;->b:F

    .line 2
    .line 3
    float-to-int p0, p0

    .line 4
    return p0
.end method

.method public final e()J
    .locals 2

    .line 1
    iget p0, p0, Ltz;->b:F

    .line 2
    .line 3
    float-to-long v0, p0

    .line 4
    return-wide v0
.end method

.method public final f()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Ltz;->b:F

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/String;->valueOf(F)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
