.class public final synthetic Lcom/example/dyhelper/ui/ρ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:Landroid/app/AlertDialog;

.field public final synthetic ζ:Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;

.field public final synthetic η:Lum1;

.field public final synthetic θ:Landroid/app/Activity;

.field public final synthetic ι:I

.field public final synthetic κ:I

.field public final synthetic λ:Lm3;


# direct methods
.method public synthetic constructor <init>(IILm3;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p6, p0, Lcom/example/dyhelper/ui/ρ;->ε:Landroid/app/AlertDialog;

    .line 5
    .line 6
    iput-object p7, p0, Lcom/example/dyhelper/ui/ρ;->ζ:Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;

    .line 7
    .line 8
    iput-object p4, p0, Lcom/example/dyhelper/ui/ρ;->η:Lum1;

    .line 9
    .line 10
    iput-object p5, p0, Lcom/example/dyhelper/ui/ρ;->θ:Landroid/app/Activity;

    .line 11
    .line 12
    iput p1, p0, Lcom/example/dyhelper/ui/ρ;->ι:I

    .line 13
    .line 14
    iput p2, p0, Lcom/example/dyhelper/ui/ρ;->κ:I

    .line 15
    .line 16
    iput-object p3, p0, Lcom/example/dyhelper/ui/ρ;->λ:Lm3;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 8

    .line 1
    const/4 p1, -0x1

    .line 2
    iget-object v6, p0, Lcom/example/dyhelper/ui/ρ;->ε:Landroid/app/AlertDialog;

    .line 3
    .line 4
    invoke-virtual {v6, p1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 10
    .line 11
    .line 12
    const/4 p1, -0x2

    .line 13
    invoke-virtual {v6, p1}, Landroid/app/AlertDialog;->getButton(I)Landroid/widget/Button;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V

    .line 18
    .line 19
    .line 20
    new-instance p1, Ljava/lang/Thread;

    .line 21
    .line 22
    new-instance v0, Lcom/example/dyhelper/ui/σ;

    .line 23
    .line 24
    iget v1, p0, Lcom/example/dyhelper/ui/ρ;->ι:I

    .line 25
    .line 26
    iget v2, p0, Lcom/example/dyhelper/ui/ρ;->κ:I

    .line 27
    .line 28
    iget-object v3, p0, Lcom/example/dyhelper/ui/ρ;->λ:Lm3;

    .line 29
    .line 30
    iget-object v4, p0, Lcom/example/dyhelper/ui/ρ;->η:Lum1;

    .line 31
    .line 32
    iget-object v5, p0, Lcom/example/dyhelper/ui/ρ;->θ:Landroid/app/Activity;

    .line 33
    .line 34
    iget-object v7, p0, Lcom/example/dyhelper/ui/ρ;->ζ:Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;

    .line 35
    .line 36
    invoke-direct/range {v0 .. v7}, Lcom/example/dyhelper/ui/σ;-><init>(IILm3;Lum1;Landroid/app/Activity;Landroid/app/AlertDialog;Lcom/example/dyhelper/ui/ImageCropHelper$CropOverlayView;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    .line 43
    .line 44
    .line 45
    return-void
.end method
