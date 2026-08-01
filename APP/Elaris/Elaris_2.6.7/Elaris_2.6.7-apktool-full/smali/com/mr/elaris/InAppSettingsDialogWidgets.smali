.class final Lcom/mr/elaris/InAppSettingsDialogWidgets;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static button(Lcom/mr/elaris/InAppSettings;Ljava/lang/String;Z)Landroid/widget/TextView;
    .locals 3

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    const/4 v0, -0x1

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    sget v0, Lcom/mr/elaris/InAppSettings;->TEXT:I

    .line 6
    .line 7
    :goto_0
    const/16 v1, 0xf

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {p0, p1, v1, v0, v2}, Lcom/mr/elaris/InAppSettings;->text(Ljava/lang/String;III)Landroid/widget/TextView;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const/16 v0, 0x11

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 17
    .line 18
    .line 19
    if-eqz p2, :cond_1

    .line 20
    .line 21
    sget v0, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    sget v0, Lcom/mr/elaris/InAppSettings;->CARD_SOFT:I

    .line 25
    .line 26
    :goto_1
    const/high16 v1, 0x41b00000    # 22.0f

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    sget p2, Lcom/mr/elaris/InAppSettings;->BLUE:I

    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_2
    sget p2, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 38
    .line 39
    :goto_2
    invoke-virtual {p0, v0, v1, p2, v2}, Lcom/mr/elaris/InAppSettings;->roundWithStroke(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 44
    .line 45
    .line 46
    return-object p1
.end method

.method public static panel(Lcom/mr/elaris/InAppSettings;)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    sget v1, Lcom/mr/elaris/InAppSettings;->CARD:I

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 9
    .line 10
    .line 11
    const/high16 v1, 0x41f00000    # 30.0f

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    int-to-float v1, v1

    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 19
    .line 20
    .line 21
    const/high16 v1, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Lcom/mr/elaris/InAppSettings;->dp(F)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    sget v1, Lcom/mr/elaris/InAppSettings;->STROKE:I

    .line 28
    .line 29
    invoke-virtual {v0, p0, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method
