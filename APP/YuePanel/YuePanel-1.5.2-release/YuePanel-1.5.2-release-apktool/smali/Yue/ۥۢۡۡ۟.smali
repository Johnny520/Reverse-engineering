.class public final LYue/ۥۢۡۡ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۡۡ۟$ۥ۟۟;,
        LYue/ۥۢۡۡ۟$ۥ۟۟۟ۡ;,
        LYue/ۥۢۡۡ۟$ۥ۟۟۟;,
        LYue/ۥۢۡۡ۟$ۥ۟۟۟۟;,
        LYue/ۥۢۡۡ۟$ۥ;,
        LYue/ۥۢۡۡ۟$ۥ۟;,
        LYue/ۥۢۡۡ۟$ۥ۟۟۟۠;
    }
.end annotation


# static fields
.field public static final ۥ:I = 0x0

.field public static final ۥ۟:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/widget/TextView;)I
    .locals 2
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥۢۡۡ۟$ۥ۟۟;->ۥ(Landroid/widget/TextView;)I

    move-result p0

    return p0

    :cond_0
    instance-of v0, p0, LYue/ۥ۟ۢۤ۟;

    if-eqz v0, :cond_1

    check-cast p0, LYue/ۥ۟ۢۤ۟;

    invoke-interface {p0}, LYue/ۥ۟ۢۤ۟;->getAutoSizeMaxTextSize()I

    move-result p0

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ۥ۟(Landroid/widget/TextView;)I
    .locals 2
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥۢۡۡ۟$ۥ۟۟;->ۥ۟(Landroid/widget/TextView;)I

    move-result p0

    return p0

    :cond_0
    instance-of v0, p0, LYue/ۥ۟ۢۤ۟;

    if-eqz v0, :cond_1

    check-cast p0, LYue/ۥ۟ۢۤ۟;

    invoke-interface {p0}, LYue/ۥ۟ۢۤ۟;->getAutoSizeMinTextSize()I

    move-result p0

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ۥ۟۟(Landroid/widget/TextView;)I
    .locals 2
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥۢۡۡ۟$ۥ۟۟;->ۥ۟۟(Landroid/widget/TextView;)I

    move-result p0

    return p0

    :cond_0
    instance-of v0, p0, LYue/ۥ۟ۢۤ۟;

    if-eqz v0, :cond_1

    check-cast p0, LYue/ۥ۟ۢۤ۟;

    invoke-interface {p0}, LYue/ۥ۟ۢۤ۟;->getAutoSizeStepGranularity()I

    move-result p0

    return p0

    :cond_1
    const/4 p0, -0x1

    return p0
.end method

.method public static ۥ۟۟۟(Landroid/widget/TextView;)[I
    .locals 2
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥۢۡۡ۟$ۥ۟۟;->ۥ۟۟۟(Landroid/widget/TextView;)[I

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, LYue/ۥ۟ۢۤ۟;

    if-eqz v0, :cond_1

    check-cast p0, LYue/ۥ۟ۢۤ۟;

    invoke-interface {p0}, LYue/ۥ۟ۢۤ۟;->getAutoSizeTextAvailableSizes()[I

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    new-array p0, p0, [I

    return-object p0
.end method

.method public static ۥ۟۟۟۟(Landroid/widget/TextView;)I
    .locals 2
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    invoke-static {p0}, LYue/ۥۢۡۡ۟$ۥ۟۟;->ۥ۟۟۟۟(Landroid/widget/TextView;)I

    move-result p0

    return p0

    :cond_0
    instance-of v0, p0, LYue/ۥ۟ۢۤ۟;

    if-eqz v0, :cond_1

    check-cast p0, LYue/ۥ۟ۢۤ۟;

    invoke-interface {p0}, LYue/ۥ۟ۢۤ۟;->getAutoSizeTextType()I

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static ۥ۟۟۟۠(Landroid/widget/TextView;)Landroid/content/res/ColorStateList;
    .locals 0
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, LYue/ۥۢۡۡ۟$ۥ;->ۥ۟(Landroid/widget/TextView;)Landroid/content/res/ColorStateList;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۡ(Landroid/widget/TextView;)Landroid/graphics/PorterDuff$Mode;
    .locals 0
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0}, LYue/ۥۢۡۡ۟$ۥ;->ۥ۟۟(Landroid/widget/TextView;)Landroid/graphics/PorterDuff$Mode;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۟ۢ(Landroid/widget/TextView;)[Landroid/graphics/drawable/Drawable;
    .locals 0
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-virtual {p0}, Landroid/widget/TextView;->getCompoundDrawablesRelative()[Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static ۥۣ۟۟۟(Landroid/widget/TextView;)I
    .locals 1
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p0

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p0

    iget p0, p0, Landroid/graphics/Paint$FontMetricsInt;->top:I

    sub-int/2addr v0, p0

    return v0
.end method

.method public static ۥ۟۟۟ۤ(Landroid/widget/TextView;)I
    .locals 1
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object p0

    invoke-virtual {p0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object p0

    iget p0, p0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    add-int/2addr v0, p0

    return v0
.end method

.method public static ۥ۟۟۟ۥ(Landroid/widget/TextView;)I
    .locals 0
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/widget/TextView;->getMaxLines()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۦ(Landroid/widget/TextView;)I
    .locals 0
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/widget/TextView;->getMinLines()I

    move-result p0

    return p0
.end method

.method public static ۥ۟۟۟ۧ(Landroid/text/TextDirectionHeuristic;)I
    .locals 4
    .param p0    # Landroid/text/TextDirectionHeuristic;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget-object v0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    const/4 v1, 0x1

    if-ne p0, v0, :cond_0

    return v1

    :cond_0
    sget-object v2, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne p0, v2, :cond_1

    return v1

    :cond_1
    sget-object v3, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    if-ne p0, v3, :cond_2

    const/4 p0, 0x2

    return p0

    :cond_2
    sget-object v3, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    if-ne p0, v3, :cond_3

    const/4 p0, 0x3

    return p0

    :cond_3
    sget-object v3, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    if-ne p0, v3, :cond_4

    const/4 p0, 0x4

    return p0

    :cond_4
    sget-object v3, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    if-ne p0, v3, :cond_5

    const/4 p0, 0x5

    return p0

    :cond_5
    if-ne p0, v2, :cond_6

    const/4 p0, 0x6

    return p0

    :cond_6
    if-ne p0, v0, :cond_7

    const/4 p0, 0x7

    return p0

    :cond_7
    return v1
.end method

.method public static ۥ۟۟۟ۨ(Landroid/widget/TextView;)Landroid/text/TextDirectionHeuristic;
    .locals 4
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p0}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    move-result-object v0

    instance-of v0, v0, Landroid/text/method/PasswordTransformationMethod;

    if-eqz v0, :cond_0

    sget-object p0, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    return-object p0

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-lt v0, v1, :cond_3

    invoke-virtual {p0}, Landroid/widget/TextView;->getInputType()I

    move-result v0

    and-int/lit8 v0, v0, 0xf

    const/4 v1, 0x3

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Landroid/widget/TextView;->getTextLocale()Ljava/util/Locale;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۢۡۡ۟$ۥ۟;->ۥ(Ljava/util/Locale;)Landroid/icu/text/DecimalFormatSymbols;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۢۡۡ۟$ۥ۟۟۟;->ۥ۟(Landroid/icu/text/DecimalFormatSymbols;)[Ljava/lang/String;

    move-result-object p0

    aget-object p0, p0, v3

    invoke-virtual {p0, v3}, Ljava/lang/String;->codePointAt(I)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Character;->getDirectionality(I)B

    move-result p0

    if-eq p0, v2, :cond_2

    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    goto :goto_0

    :cond_1
    sget-object p0, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    return-object p0

    :cond_2
    :goto_0
    sget-object p0, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    return-object p0

    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getLayoutDirection()I

    move-result v0

    if-ne v0, v2, :cond_4

    goto :goto_1

    :cond_4
    move v2, v3

    :goto_1
    invoke-virtual {p0}, Landroid/view/View;->getTextDirection()I

    move-result p0

    packed-switch p0, :pswitch_data_0

    if-eqz v2, :cond_5

    sget-object p0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    goto :goto_2

    :cond_5
    sget-object p0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    :goto_2
    return-object p0

    :pswitch_0
    sget-object p0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_RTL:Landroid/text/TextDirectionHeuristic;

    return-object p0

    :pswitch_1
    sget-object p0, Landroid/text/TextDirectionHeuristics;->FIRSTSTRONG_LTR:Landroid/text/TextDirectionHeuristic;

    return-object p0

    :pswitch_2
    sget-object p0, Landroid/text/TextDirectionHeuristics;->LOCALE:Landroid/text/TextDirectionHeuristic;

    return-object p0

    :pswitch_3
    sget-object p0, Landroid/text/TextDirectionHeuristics;->RTL:Landroid/text/TextDirectionHeuristic;

    return-object p0

    :pswitch_4
    sget-object p0, Landroid/text/TextDirectionHeuristics;->LTR:Landroid/text/TextDirectionHeuristic;

    return-object p0

    :pswitch_5
    sget-object p0, Landroid/text/TextDirectionHeuristics;->ANYRTL_LTR:Landroid/text/TextDirectionHeuristic;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static ۥ۟۟۠(Landroid/widget/TextView;)LYue/ۥۡۤۦ۟$ۥ۟;
    .locals 3
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    new-instance v0, LYue/ۥۡۤۦ۟$ۥ۟;

    invoke-static {p0}, LYue/ۥۢۡۡ۟$ۥ۟۟۟;->ۥ۟۟(Landroid/widget/TextView;)Landroid/text/PrecomputedText$Params;

    move-result-object p0

    invoke-direct {v0, p0}, LYue/ۥۡۤۦ۟$ۥ۟;-><init>(Landroid/text/PrecomputedText$Params;)V

    return-object v0

    :cond_0
    new-instance v0, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;

    new-instance v1, Landroid/text/TextPaint;

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/text/TextPaint;-><init>(Landroid/graphics/Paint;)V

    invoke-direct {v0, v1}, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;-><init>(Landroid/text/TextPaint;)V

    invoke-static {p0}, LYue/ۥۢۡۡ۟$ۥ;->ۥ(Landroid/widget/TextView;)I

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ۟(I)LYue/ۥۡۤۦ۟$ۥ۟$ۥ;

    invoke-static {p0}, LYue/ۥۢۡۡ۟$ۥ;->ۥ۟۟۟(Landroid/widget/TextView;)I

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ۟۟(I)LYue/ۥۡۤۦ۟$ۥ۟$ۥ;

    invoke-static {p0}, LYue/ۥۢۡۡ۟;->ۥ۟۟۟ۨ(Landroid/widget/TextView;)Landroid/text/TextDirectionHeuristic;

    move-result-object p0

    invoke-virtual {v0, p0}, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ۟۟۟(Landroid/text/TextDirectionHeuristic;)LYue/ۥۡۤۦ۟$ۥ۟$ۥ;

    invoke-virtual {v0}, LYue/ۥۡۤۦ۟$ۥ۟$ۥ;->ۥ()LYue/ۥۡۤۦ۟$ۥ۟;

    move-result-object p0

    return-object p0
.end method

.method public static ۥ۟۟۠۟(Landroid/widget/TextView;IIII)V
    .locals 2
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2, p3, p4}, LYue/ۥۢۡۡ۟$ۥ۟۟;->ۥ۟۟۟۠(Landroid/widget/TextView;IIII)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, LYue/ۥ۟ۢۤ۟;

    if-eqz v0, :cond_1

    check-cast p0, LYue/ۥ۟ۢۤ۟;

    invoke-interface {p0, p1, p2, p3, p4}, LYue/ۥ۟ۢۤ۟;->setAutoSizeTextTypeUniformWithConfiguration(IIII)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۥ۟۟۠۠(Landroid/widget/TextView;[II)V
    .locals 2
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # [I
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/IllegalArgumentException;
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2}, LYue/ۥۢۡۡ۟$ۥ۟۟;->ۥ۟۟۟ۡ(Landroid/widget/TextView;[II)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, LYue/ۥ۟ۢۤ۟;

    if-eqz v0, :cond_1

    check-cast p0, LYue/ۥ۟ۢۤ۟;

    invoke-interface {p0, p1, p2}, LYue/ۥ۟ۢۤ۟;->setAutoSizeTextTypeUniformWithPresetSizes([II)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۥ۟۟۠ۡ(Landroid/widget/TextView;I)V
    .locals 2
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LYue/ۥۢۡۡ۟$ۥ۟۟;->ۥ۟۟۟ۢ(Landroid/widget/TextView;I)V

    goto :goto_0

    :cond_0
    instance-of v0, p0, LYue/ۥ۟ۢۤ۟;

    if-eqz v0, :cond_1

    check-cast p0, LYue/ۥ۟ۢۤ۟;

    invoke-interface {p0, p1}, LYue/ۥ۟ۢۤ۟;->setAutoSizeTextTypeWithDefaults(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static ۥ۟۟۠ۢ(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V
    .locals 0
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/content/res/ColorStateList;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0, p1}, LYue/ۥۢۡۡ۟$ۥ;->ۥ۟۟۟۠(Landroid/widget/TextView;Landroid/content/res/ColorStateList;)V

    return-void
.end method

.method public static ۥۣ۟۟۠(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V
    .locals 0
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/PorterDuff$Mode;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-static {p0}, LYue/ۥۡۤۧ;->ۥ۟۟۟ۦ(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p0, p1}, LYue/ۥۢۡۡ۟$ۥ;->ۥ۟۟۟ۡ(Landroid/widget/TextView;Landroid/graphics/PorterDuff$Mode;)V

    return-void
.end method

.method public static ۥ۟۟۠ۤ(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelative(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static ۥ۟۟۠ۥ(Landroid/widget/TextView;IIII)V
    .locals 0
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param
    .param p3    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param
    .param p4    # I
        .annotation build LYue/ۥ۠۠۠ۨ;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(IIII)V

    return-void
.end method

.method public static ۥ۟۟۠ۦ(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/drawable/Drawable;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static ۥ۟۟۠ۧ(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)V
    .locals 0
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/view/ActionMode$Callback;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-static {p0, p1}, LYue/ۥۢۡۡ۟;->ۥ۟۟ۡۥ(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    return-void
.end method

.method public static ۥ۟۟۠ۨ(Landroid/widget/TextView;I)V
    .locals 3
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation

        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param

    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥۣ۟۟۟(I)I

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1c

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1}, LYue/ۥۢۡۡ۟$ۥ۟۟۟;->ۥ۟۟۟(Landroid/widget/TextView;I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result v1

    if-eqz v1, :cond_1

    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I

    goto :goto_0

    :cond_1
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->ascent:I

    :goto_0
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le p1, v1, :cond_2

    add-int/2addr p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p0, v0, p1, v1, v2}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_2
    return-void
.end method

.method public static ۥ۟۟ۡ(Landroid/widget/TextView;I)V
    .locals 3
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation

        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param

    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥۣ۟۟۟(I)I

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;

    move-result-object v0

    invoke-virtual {p0}, Landroid/widget/TextView;->getIncludeFontPadding()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I

    goto :goto_0

    :cond_0
    iget v0, v0, Landroid/graphics/Paint$FontMetricsInt;->descent:I

    :goto_0
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v1

    if-le p1, v1, :cond_1

    sub-int/2addr p1, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/widget/TextView;->setPadding(IIII)V

    :cond_1
    return-void
.end method

.method public static ۥ۟۟ۡ۟(Landroid/widget/TextView;I)V
    .locals 2
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation

        .annotation build LYue/ۥۡۥۤۤ;
        .end annotation
    .end param

    invoke-static {p1}, LYue/ۥۡۤۧ;->ۥۣ۟۟۟(I)I

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->getFontMetricsInt(Landroid/graphics/Paint$FontMetricsInt;)I

    move-result v0

    if-eq p1, v0, :cond_0

    sub-int/2addr p1, v0

    int-to-float p1, p1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setLineSpacing(FF)V

    :cond_0
    return-void
.end method

.method public static ۥ۟۟ۡ۠(Landroid/widget/TextView;IF)V
    .locals 2
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # F
        .annotation build LYue/ۥ۠ۢۢۧ;
            from = 0.0
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2}, LYue/ۥۢۡۡ۟$ۥ۟۟۟۟;->ۥ(Landroid/widget/TextView;IF)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    invoke-static {p1, p2, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    invoke-static {p0, p1}, LYue/ۥۢۡۡ۟;->ۥ۟۟ۡ۟(Landroid/widget/TextView;I)V

    :goto_0
    return-void
.end method

.method public static ۥ۟۟ۡۡ(Landroid/widget/TextView;LYue/ۥۡۤۦ۟;)V
    .locals 2
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۤۦ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-lt v0, v1, :cond_0

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟;->ۥ۟۟۟۠()Landroid/text/PrecomputedText;

    move-result-object p1

    invoke-static {p1}, LYue/ۥۢۡۡ۟$ۥ۟۟۟;->ۥ(Landroid/text/PrecomputedText;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    invoke-static {p0}, LYue/ۥۢۡۡ۟;->ۥ۟۟۠(Landroid/widget/TextView;)LYue/ۥۡۤۦ۟$ۥ۟;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟;->ۥ۟۟۟۟()LYue/ۥۡۤۦ۟$ۥ۟;

    move-result-object v1

    invoke-virtual {v0, v1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ(LYue/ۥۡۤۦ۟$ۥ۟;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    return-void

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Given text can not be applied to TextView."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟ۡۢ(Landroid/widget/TextView;I)V
    .locals 0
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # I
        .annotation build LYue/ۥۣۢ۠ۡ;
        .end annotation
    .end param

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextAppearance(I)V

    return-void
.end method

.method public static ۥۣ۟۟ۡ(Landroid/widget/TextView;LYue/ۥۡۤۦ۟$ۥ۟;)V
    .locals 2
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # LYue/ۥۡۤۦ۟$ۥ۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟()Landroid/text/TextDirectionHeuristic;

    move-result-object v0

    invoke-static {v0}, LYue/ۥۢۡۡ۟;->ۥ۟۟۟ۧ(Landroid/text/TextDirectionHeuristic;)I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/view/View;->setTextDirection(I)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟۟۟()Landroid/text/TextPaint;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->set(Landroid/text/TextPaint;)V

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟()I

    move-result v0

    invoke-static {p0, v0}, LYue/ۥۢۡۡ۟$ۥ;->ۥ۟۟۟۟(Landroid/widget/TextView;I)V

    invoke-virtual {p1}, LYue/ۥۡۤۦ۟$ۥ۟;->ۥ۟۟()I

    move-result p1

    invoke-static {p0, p1}, LYue/ۥۢۡۡ۟$ۥ;->ۥ۟۟۟ۢ(Landroid/widget/TextView;I)V

    return-void
.end method

.method public static ۥ۟۟ۡۤ(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;
    .locals 1
    .param p0    # Landroid/view/ActionMode$Callback;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    instance-of v0, p0, LYue/ۥۢۡۡ۟$ۥ۟۟۟ۡ;

    if-eqz v0, :cond_0

    check-cast p0, LYue/ۥۢۡۡ۟$ۥ۟۟۟ۡ;

    invoke-virtual {p0}, LYue/ۥۢۡۡ۟$ۥ۟۟۟ۡ;->ۥ۟۟۟()Landroid/view/ActionMode$Callback;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static ۥ۟۟ۡۥ(Landroid/widget/TextView;Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode$Callback;
    .locals 2
    .param p0    # Landroid/widget/TextView;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/view/ActionMode$Callback;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1b

    if-gt v0, v1, :cond_1

    instance-of v0, p1, LYue/ۥۢۡۡ۟$ۥ۟۟۟ۡ;

    if-nez v0, :cond_1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, LYue/ۥۢۡۡ۟$ۥ۟۟۟ۡ;

    invoke-direct {v0, p1, p0}, LYue/ۥۢۡۡ۟$ۥ۟۟۟ۡ;-><init>(Landroid/view/ActionMode$Callback;Landroid/widget/TextView;)V

    return-object v0

    :cond_1
    :goto_0
    return-object p1
.end method
