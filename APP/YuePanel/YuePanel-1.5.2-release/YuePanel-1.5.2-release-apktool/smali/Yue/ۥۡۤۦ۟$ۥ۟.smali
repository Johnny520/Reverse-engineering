.class public final LYue/ۥۡۤۦ۟$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۤۦ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۤۦ۟$ۥ۟$ۥ;
    }
.end annotation


# instance fields
.field public final ۥ:Landroid/text/TextPaint;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public final ۥ۟:Landroid/text/TextDirectionHeuristic;
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation
.end field

.field public final ۥ۟۟:I

.field public final ۥ۟۟۟:I

.field public final ۥ۟۟۟۟:Landroid/text/PrecomputedText$Params;


# direct methods
.method public constructor <init>(Landroid/text/PrecomputedText$Params;)V
    .locals 2
    .param p1    # Landroid/text/PrecomputedText$Params;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1c
    .end annotation

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    invoke-static {p1}, LYue/ۥۡۤۦ۠;->ۥ(Landroid/text/PrecomputedText$Params;)Landroid/text/TextPaint;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    .line 15
    invoke-static {p1}, LYue/ۥۡۤۦۡ;->ۥ(Landroid/text/PrecomputedText$Params;)Landroid/text/TextDirectionHeuristic;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟:Landroid/text/TextDirectionHeuristic;

    .line 16
    invoke-static {p1}, LYue/ۥۡۤۦۢ;->ۥ(Landroid/text/PrecomputedText$Params;)I

    move-result v0

    iput v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟:I

    .line 17
    invoke-static {p1}, LYue/ۥۡۤۦۣ;->ۥ(Landroid/text/PrecomputedText$Params;)I

    move-result v0

    iput v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟:I

    .line 18
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟۟:Landroid/text/PrecomputedText$Params;

    return-void
.end method

.method public constructor <init>(Landroid/text/TextPaint;Landroid/text/TextDirectionHeuristic;II)V
    .locals 2
    .param p1    # Landroid/text/TextPaint;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroid/text/TextDirectionHeuristic;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    .line 3
    invoke-static {p1}, LYue/ۥۡۤۦۨ;->ۥ(Landroid/text/TextPaint;)Landroid/text/PrecomputedText$Params$Builder;

    move-result-object v0

    .line 4
    invoke-static {v0, p3}, LYue/ۥۡۤۦۤ;->ۥ(Landroid/text/PrecomputedText$Params$Builder;I)Landroid/text/PrecomputedText$Params$Builder;

    move-result-object v0

    .line 5
    invoke-static {v0, p4}, LYue/ۥۡۤۦۥ;->ۥ(Landroid/text/PrecomputedText$Params$Builder;I)Landroid/text/PrecomputedText$Params$Builder;

    move-result-object v0

    .line 6
    invoke-static {v0, p2}, LYue/ۥۡۤۦۦ;->ۥ(Landroid/text/PrecomputedText$Params$Builder;Landroid/text/TextDirectionHeuristic;)Landroid/text/PrecomputedText$Params$Builder;

    move-result-object v0

    .line 7
    invoke-static {v0}, LYue/ۥۡۤۦۧ;->ۥ(Landroid/text/PrecomputedText$Params$Builder;)Landroid/text/PrecomputedText$Params;

    move-result-object v0

    iput-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟۟:Landroid/text/PrecomputedText$Params;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 8
    iput-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟۟:Landroid/text/PrecomputedText$Params;

    .line 9
    :goto_0
    iput-object p1, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    .line 10
    iput-object p2, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟:Landroid/text/TextDirectionHeuristic;

    .line 11
    iput p3, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟:I

    .line 12
    iput p4, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥۡۤۦ۟$ۥ۟;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥۡۤۦ۟$ۥ۟;

    invoke-virtual {p0, p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ(LYue/ۥۡۤۦ۟$ۥ۟;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟:Landroid/text/TextDirectionHeuristic;

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟()Landroid/text/TextDirectionHeuristic;

    move-result-object p1

    if-ne v1, p1, :cond_3

    goto :goto_0

    :cond_3
    move v0, v2

    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 12

    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getLetterSpacing()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFlags()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextLocales()Landroid/os/LocaleList;

    move-result-object v6

    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v7

    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->isElegantTextHeight()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    iget-object v9, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟:Landroid/text/TextDirectionHeuristic;

    iget v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    iget v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array/range {v1 .. v11}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۡۢۨ;->ۥ۟([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "textSize="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSize()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", textScaleX="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", textSkewX="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", letterSpacing="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getLetterSpacing()F

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", elegantTextHeight="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->isElegantTextHeight()Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", textLocale="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTextLocales()Landroid/os/LocaleList;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", typeface="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", variationSettings="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v2}, Landroid/graphics/Paint;->getFontVariationSettings()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", textDir="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟:Landroid/text/TextDirectionHeuristic;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", breakStrategy="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, ", hyphenationFrequency="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v2, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(LYue/ۥۡۤۦ۟$ۥ۟;)Z
    .locals 3
    .param p1    # LYue/ۥۡۤۦ۟$ۥ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iget v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟:I

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    iget v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟:I

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟()I

    move-result v1

    if-eq v0, v1, :cond_1

    return v2

    :cond_1
    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSize()F

    move-result v0

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟۟()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSize()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_2

    return v2

    :cond_2
    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v0

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟۟()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextScaleX()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_3

    return v2

    :cond_3
    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v0

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟۟()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextSkewX()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_4

    return v2

    :cond_4
    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getLetterSpacing()F

    move-result v0

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟۟()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getLetterSpacing()F

    move-result v1

    cmpl-float v0, v0, v1

    if-eqz v0, :cond_5

    return v2

    :cond_5
    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟۟()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFontFeatureSettings()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    return v2

    :cond_6
    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFlags()I

    move-result v0

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟۟()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getFlags()I

    move-result v1

    if-eq v0, v1, :cond_7

    return v2

    :cond_7
    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTextLocales()Landroid/os/LocaleList;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟۟()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/Paint;->getTextLocales()Landroid/os/LocaleList;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/LocaleList;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_8

    return v2

    :cond_8
    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    if-nez v0, :cond_9

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟۟()Landroid/text/TextPaint;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object p1

    if-eqz p1, :cond_a

    return v2

    :cond_9
    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟۟()Landroid/text/TextPaint;

    move-result-object p1

    invoke-virtual {p1}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/graphics/Typeface;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    const/4 p1, 0x1

    return p1
.end method

.method public ۥ۟()I
    .locals 1
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    iget v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟:I

    return v0
.end method

.method public ۥ۟۟()I
    .locals 1
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x17
    .end annotation

    iget v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟:I

    return v0
.end method

.method public ۥ۟۟۟()Landroid/text/TextDirectionHeuristic;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟:Landroid/text/TextDirectionHeuristic;

    return-object v0
.end method

.method public ۥ۟۟۟۟()Landroid/text/TextPaint;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ:Landroid/text/TextPaint;

    return-object v0
.end method
