.class public final Lhv1;
.super Landroid/text/style/CharacterStyle;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final α:I

.field public final β:F

.field public final γ:F

.field public final δ:F


# direct methods
.method public constructor <init>(FFFI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p4, p0, Lhv1;->α:I

    .line 5
    .line 6
    iput p1, p0, Lhv1;->β:F

    .line 7
    .line 8
    iput p2, p0, Lhv1;->γ:F

    .line 9
    .line 10
    iput p3, p0, Lhv1;->δ:F

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 3

    .line 1
    iget v0, p0, Lhv1;->γ:F

    .line 2
    .line 3
    iget v1, p0, Lhv1;->α:I

    .line 4
    .line 5
    iget v2, p0, Lhv1;->δ:F

    .line 6
    .line 7
    iget p0, p0, Lhv1;->β:F

    .line 8
    .line 9
    invoke-virtual {p1, v2, p0, v0, v1}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
