.class public final Lmq0;
.super Lv01;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lv01;"
    }
.end annotation


# instance fields
.field public final α:F


# direct methods
.method public constructor <init>(F)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lmq0;->α:F

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lmq0;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    check-cast p1, Lmq0;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-nez p1, :cond_2

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_2
    iget p0, p0, Lmq0;->α:F

    .line 17
    .line 18
    iget p1, p1, Lmq0;->α:F

    .line 19
    .line 20
    cmpg-float p0, p0, p1

    .line 21
    .line 22
    if-nez p0, :cond_3

    .line 23
    .line 24
    return v0

    .line 25
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 26
    return p0
.end method

.method public final hashCode()I
    .locals 1

    .line 1
    iget p0, p0, Lmq0;->α:F

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    mul-int/lit8 p0, p0, 0x1f

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    add-int/2addr v0, p0

    .line 15
    return v0
.end method

.method public final δ()Lq01;
    .locals 1

    .line 1
    new-instance v0, Lnq0;

    .line 2
    .line 3
    invoke-direct {v0}, Lq01;-><init>()V

    .line 4
    .line 5
    .line 6
    iget p0, p0, Lmq0;->α:F

    .line 7
    .line 8
    iput p0, v0, Lnq0;->τ:F

    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    iput-boolean p0, v0, Lnq0;->υ:Z

    .line 12
    .line 13
    return-object v0
.end method

.method public final ε(Lq01;)V
    .locals 0

    .line 1
    check-cast p1, Lnq0;

    .line 2
    .line 3
    iget p0, p0, Lmq0;->α:F

    .line 4
    .line 5
    iput p0, p1, Lnq0;->τ:F

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    iput-boolean p0, p1, Lnq0;->υ:Z

    .line 9
    .line 10
    return-void
.end method
