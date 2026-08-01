.class public final Lha0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/widget/SeekBar$OnSeekBarChangeListener;


# instance fields
.field public final synthetic α:Lfa0;

.field public final synthetic β:I


# direct methods
.method public constructor <init>(Lfa0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lha0;->α:Lfa0;

    .line 5
    .line 6
    iput p2, p0, Lha0;->β:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onProgressChanged(Landroid/widget/SeekBar;IZ)V
    .locals 3

    .line 1
    sget-object v0, Lia0;->β:Ljava/util/List;

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
    iget-object p0, p0, Lha0;->α:Lfa0;

    .line 13
    .line 14
    iget-object p0, p0, Lfa0;->β:Landroid/widget/TextView;

    .line 15
    .line 16
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    check-cast p2, Ljava/lang/Number;

    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 23
    .line 24
    .line 25
    move-result p2

    .line 26
    float-to-int p2, p2

    .line 27
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p2, "x"

    .line 36
    .line 37
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p2

    .line 44
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    if-eqz p3, :cond_0

    .line 48
    .line 49
    if-eqz p1, :cond_0

    .line 50
    .line 51
    const/4 p0, 0x4

    .line 52
    invoke-virtual {p1, p0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 53
    .line 54
    .line 55
    :cond_0
    return-void
.end method

.method public final onStartTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final onStopTrackingTouch(Landroid/widget/SeekBar;)V
    .locals 2

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/widget/ProgressBar;->getProgress()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    iget p0, p0, Lha0;->β:I

    .line 9
    .line 10
    :goto_0
    sget-object p1, Lia0;->β:Ljava/util/List;

    .line 11
    .line 12
    invoke-static {p1}, Lyh;->Λ(Ljava/util/List;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {p0, v1, v0}, Lj81;->μ(III)I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    sget-object v0, Lui1;->α:Ljava/lang/Object;

    .line 22
    .line 23
    invoke-interface {p1, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/lang/Number;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    const-string p1, "global_video_speed"

    .line 34
    .line 35
    invoke-static {p1, p0}, Lui1;->Ζ(Ljava/lang/String;F)V

    .line 36
    .line 37
    .line 38
    return-void
.end method
