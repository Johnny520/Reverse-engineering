.class public final Lu01;
.super Landroid/text/style/CharacterStyle;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Landroid/text/style/UpdateAppearance;


# instance fields
.field public final d:F

.field public final e:Lgp0;

.field public final f:Ldn;


# direct methods
.method public constructor <init>(Lqb;F)V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/text/style/CharacterStyle;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p2, p0, Lu01;->d:F

    .line 5
    .line 6
    new-instance p1, Lq11;

    .line 7
    .line 8
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    invoke-direct {p1, v0, v1}, Lq11;-><init>(J)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, Lu01;->e:Lgp0;

    .line 21
    .line 22
    new-instance p1, Lk6;

    .line 23
    .line 24
    const/16 p2, 0xc

    .line 25
    .line 26
    invoke-direct {p1, p2, p0}, Lk6;-><init>(ILjava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    invoke-static {p1}, Lr60;->m(Lhw;)Ldn;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lu01;->f:Ldn;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final updateDrawState(Landroid/text/TextPaint;)V
    .locals 1

    .line 1
    iget v0, p0, Lu01;->d:F

    .line 2
    .line 3
    invoke-static {p1, v0}, Lrd0;->S(Landroid/text/TextPaint;F)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lu01;->f:Ldn;

    .line 7
    .line 8
    invoke-virtual {p0}, Ldn;->getValue()Ljava/lang/Object;

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
