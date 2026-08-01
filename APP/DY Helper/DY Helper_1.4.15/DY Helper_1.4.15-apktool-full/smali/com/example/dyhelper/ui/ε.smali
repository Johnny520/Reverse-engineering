.class public final synthetic Lcom/example/dyhelper/ui/ε;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

.field public final synthetic ζ:I


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/example/dyhelper/ui/ε;->ε:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 5
    .line 6
    iput p2, p0, Lcom/example/dyhelper/ui/ε;->ζ:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    sget-object v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Θ:Lym1;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const v1, 0x3f666666    # 0.9f

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const-wide/16 v1, 0x50

    .line 19
    .line 20
    invoke-virtual {v0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    new-instance v1, Lcom/example/dyhelper/ui/κ;

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    invoke-direct {v1, v2, p1}, Lcom/example/dyhelper/ui/κ;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/example/dyhelper/ui/ε;->ε:Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;

    .line 38
    .line 39
    iget-boolean v0, p1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ε:Z

    .line 40
    .line 41
    iget p0, p0, Lcom/example/dyhelper/ui/ε;->ζ:I

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/16 v0, 0xff

    .line 51
    .line 52
    :goto_0
    iput v0, p1, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->ι:I

    .line 53
    .line 54
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    const/4 v2, 0x1

    .line 67
    invoke-virtual {p1, v0, v1, p0, v2}, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->α(IIIZ)V

    .line 68
    .line 69
    .line 70
    return-void
.end method
