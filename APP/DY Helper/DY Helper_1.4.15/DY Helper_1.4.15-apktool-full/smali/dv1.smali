.class public final Ldv1;
.super Landroid/text/style/CharacterStyle;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field public final ε:F

.field public final ζ:Lx91;

.field public final η:Lfs;


# direct methods
.method public constructor <init>(Lpc;F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Ldv1;->ε:F

    .line 5
    .line 6
    new-instance p1, Ljw1;

    .line 7
    .line 8
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-direct {p1, v0, v1}, Ljw1;-><init>(J)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lj81;->Η(Ljava/lang/Object;)Lx91;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Ldv1;->ζ:Lx91;

    .line 21
    .line 22
    new-instance p1, Lη;

    .line 23
    .line 24
    const/16 p2, 0xf

    .line 25
    .line 26
    invoke-direct {p1, p2, p0}, Lη;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    sget-object p2, Lgx1;->α:Lm6;

    .line 30
    .line 31
    new-instance p2, Lfs;

    .line 32
    .line 33
    invoke-direct {p2, p1}, Lfs;-><init>(Lp70;)V

    .line 34
    .line 35
    .line 36
    iput-object p2, p0, Ldv1;->η:Lfs;

    .line 37
    .line 38
    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 1
    iget v0, p0, Ldv1;->ε:F

    .line 2
    .line 3
    invoke-static {p1, v0}, Lxb;->Ω(Landroid/text/TextPaint;F)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Ldv1;->η:Lfs;

    .line 7
    .line 8
    invoke-virtual {p0}, Lfs;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, Landroid/graphics/Shader;

    .line 13
    .line 14
    invoke-virtual {p1, p0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 15
    .line 16
    .line 17
    return-void
.end method
