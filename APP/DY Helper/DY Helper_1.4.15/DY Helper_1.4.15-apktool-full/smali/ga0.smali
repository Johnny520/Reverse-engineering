.class public final Lga0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic α:Lrm1;

.field public final synthetic β:Lfa0;

.field public final synthetic γ:Landroid/app/Activity;


# direct methods
.method public constructor <init>(Lrm1;Lfa0;Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lga0;->α:Lrm1;

    .line 5
    .line 6
    iput-object p2, p0, Lga0;->β:Lfa0;

    .line 7
    .line 8
    iput-object p3, p0, Lga0;->γ:Landroid/app/Activity;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 3

    .line 1
    sget-object v0, Lcom/example/dyhelper/ui/GestureAreaView;->σ:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Lyh;->Λ(Ljava/util/List;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-static {p2, v2, v1}, Lj81;->μ(III)I

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p2

    .line 16
    check-cast p2, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 19
    .line 20
    .line 21
    move-result p2

    .line 22
    iget-object v0, p0, Lga0;->α:Lrm1;

    .line 23
    .line 24
    iput p2, v0, Lrm1;->ε:F

    .line 25
    .line 26
    iget-object v0, p0, Lga0;->β:Lfa0;

    .line 27
    .line 28
    iget-object v0, v0, Lfa0;->β:Landroid/widget/TextView;

    .line 29
    .line 30
    sget-object v1, Lx01;->α:Lx01;

    .line 31
    .line 32
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    iget-object p0, p0, Lga0;->γ:Landroid/app/Activity;

    .line 41
    .line 42
    const v2, 0x7f0f0045

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p0, v2, p2}, Lx01;->η(Landroid/content/Context;I[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    if-eqz p3, :cond_0

    .line 53
    .line 54
    if-eqz p1, :cond_0

    .line 55
    .line 56
    const/4 p0, 0x4

    .line 57
    invoke-virtual {p1, p0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    sget-object p1, Lui1;->α:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, Lga0;->α:Lrm1;

    .line 4
    .line 5
    iget p0, p0, Lrm1;->ε:F

    .line 6
    .line 7
    const-string p1, "gesture_video_speed"

    .line 8
    .line 9
    invoke-static {p1, p0}, Lui1;->Ζ(Ljava/lang/String;F)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
