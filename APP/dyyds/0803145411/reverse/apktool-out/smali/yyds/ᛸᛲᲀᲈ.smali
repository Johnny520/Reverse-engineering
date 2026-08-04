.class public final synthetic Lyyds/ᛸᛲᲀᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:Lyyds/ᛱᛷᛸᲈ;

.field public final synthetic ᛵᛸᛸᛷ:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᛱᛷᛸᲈ;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛸᛲᲀᲈ;->ᛲᲈᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛸᛲᲀᲈ;->ᛵᛸᛸᛷ:Landroid/app/Activity;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lyyds/ᛸᛲᲀᲈ;->ᛲᲈᲁ:Lyyds/ᛱᛷᛸᲈ;

    .line 2
    .line 3
    iget-object p1, p1, Lyyds/ᛱᛷᛸᲈ;->ᲀᛲᛳᲀ:Ljava/lang/Object;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    const-wide v0, -0x2fb66e68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    const/4 p1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast p1, Landroid/app/AlertDialog;

    .line 18
    .line 19
    :goto_0
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, p0, Lyyds/ᛸᛲᲀᲈ;->ᛵᛸᛸᛷ:Landroid/app/Activity;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    iget p0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 45
    .line 46
    int-to-float p0, p0

    .line 47
    const v0, 0x3f666666    # 0.9f

    .line 48
    .line 49
    .line 50
    mul-float/2addr p0, v0

    .line 51
    float-to-int p0, p0

    .line 52
    const/16 v0, 0x172

    .line 53
    .line 54
    invoke-static {v0}, Lyyds/ᛶᲁᛳᛴ;->ᛷᲈᲈᲁ(I)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    const/4 v0, -0x2

    .line 63
    invoke-virtual {p1, p0, v0}, Landroid/view/Window;->setLayout(II)V

    .line 64
    .line 65
    .line 66
    const p0, 0x3ee66666    # 0.45f

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p0}, Landroid/view/Window;->setDimAmount(F)V

    .line 70
    .line 71
    .line 72
    :cond_1
    return-void
.end method
