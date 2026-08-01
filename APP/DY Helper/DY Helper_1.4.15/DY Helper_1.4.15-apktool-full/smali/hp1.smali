.class public interface abstract Lhp1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# direct methods
.method public static α(Lr01;)Lr01;
    .locals 5

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    float-to-double v1, v0

    .line 4
    const-wide/16 v3, 0x0

    .line 5
    .line 6
    cmpl-double v1, v1, v3

    .line 7
    .line 8
    if-lez v1, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const-string v1, "invalid weight; must be greater than zero"

    .line 12
    .line 13
    invoke-static {v1}, Lyl0;->α(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    :goto_0
    new-instance v1, Lmq0;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Lmq0;-><init>(F)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p0, v1}, Lr01;->β(Lr01;)Lr01;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
