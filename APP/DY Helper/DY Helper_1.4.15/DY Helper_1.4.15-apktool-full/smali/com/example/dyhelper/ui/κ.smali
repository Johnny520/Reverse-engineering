.class public final synthetic Lcom/example/dyhelper/ui/κ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, Lcom/example/dyhelper/ui/κ;->ε:I

    .line 2
    .line 3
    iput-object p2, p0, Lcom/example/dyhelper/ui/κ;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lcom/example/dyhelper/ui/κ;->ε:I

    .line 2
    .line 3
    iget-object p0, p0, Lcom/example/dyhelper/ui/κ;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lcom/example/dyhelper/ui/β;

    .line 9
    .line 10
    sget v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeItemView;->Γ:I

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/example/dyhelper/ui/β;->invoke()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    check-cast p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;

    .line 17
    .line 18
    iget-object p0, p0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->μ:Landroid/widget/TextView;

    .line 19
    .line 20
    const/16 v0, 0x8

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    check-cast p0, Lp70;

    .line 27
    .line 28
    sget v0, Lcom/example/dyhelper/ui/TopDownloadNotificationManager$TopNoticeHostView;->σ:I

    .line 29
    .line 30
    invoke-interface {p0}, Lp70;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :pswitch_2
    check-cast p0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;

    .line 35
    .line 36
    sget v0, Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;->χ:I

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_3
    check-cast p0, Landroid/view/View;

    .line 43
    .line 44
    sget-object v0, Lcom/example/dyhelper/ui/ColorPickerDialog$ColorPickerView;->Θ:Lym1;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const/high16 v0, 0x3f800000    # 1.0f

    .line 51
    .line 52
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    const-wide/16 v0, 0x64

    .line 61
    .line 62
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
