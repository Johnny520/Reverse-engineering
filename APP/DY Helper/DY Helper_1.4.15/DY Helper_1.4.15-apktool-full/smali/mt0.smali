.class public final synthetic Lmt0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:J

.field public final synthetic ζ:F


# direct methods
.method public synthetic constructor <init>(JF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lmt0;->ε:J

    .line 5
    .line 6
    iput p3, p0, Lmt0;->ζ:F

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lcw;

    .line 3
    .line 4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/high16 p1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    iget v7, p0, Lmt0;->ζ:F

    .line 10
    .line 11
    sub-float v5, p1, v7

    .line 12
    .line 13
    const/16 v6, 0x76

    .line 14
    .line 15
    iget-wide v1, p0, Lmt0;->ε:J

    .line 16
    .line 17
    const-wide/16 v3, 0x0

    .line 18
    .line 19
    invoke-static/range {v0 .. v6}, Lcw;->а(Lcw;JJFI)V

    .line 20
    .line 21
    .line 22
    sget-wide p0, Lci;->β:J

    .line 23
    .line 24
    const v1, 0x3cf5c28f    # 0.03f

    .line 25
    .line 26
    .line 27
    mul-float/2addr v7, v1

    .line 28
    invoke-static {p0, p1, v7}, Lci;->β(JF)J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    const/4 v5, 0x0

    .line 33
    const/16 v6, 0x7e

    .line 34
    .line 35
    invoke-static/range {v0 .. v6}, Lcw;->а(Lcw;JJFI)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Ls62;->α:Ls62;

    .line 39
    .line 40
    return-object p0
.end method
