.class public abstract Lrj1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Ljava/util/Set;

.field public static final β:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "from_profile_self"

    .line 2
    .line 3
    const-string v1, "from_profile_other"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lrj1;->α:Ljava/util/Set;

    .line 14
    .line 15
    const-string v0, "personal_homepage"

    .line 16
    .line 17
    const-string v1, "others_homepage"

    .line 18
    .line 19
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, Lg7;->о([Ljava/lang/Object;)Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lrj1;->β:Ljava/util/Set;

    .line 28
    .line 29
    return-void
.end method

.method public static α(FF)F
    .locals 4

    .line 1
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const v1, 0x7f7fffff    # Float.MAX_VALUE

    .line 6
    .line 7
    .line 8
    cmpg-float v0, v0, v1

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const/high16 v3, 0x3f800000    # 1.0f

    .line 12
    .line 13
    if-gtz v0, :cond_0

    .line 14
    .line 15
    invoke-static {p0, v2, v3}, Lj81;->λ(FFF)F

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move p0, v3

    .line 21
    :goto_0
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    cmpg-float v0, v0, v1

    .line 26
    .line 27
    if-gtz v0, :cond_1

    .line 28
    .line 29
    invoke-static {p1, v2, v3}, Lj81;->λ(FFF)F

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    :cond_1
    mul-float/2addr v3, p0

    .line 34
    return v3
.end method
