.class public final synthetic Lvu;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/view/View;

.field public final synthetic η:Landroid/app/Activity;

.field public final synthetic θ:Landroid/widget/ScrollView;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;Landroid/widget/ScrollView;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lvu;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lvu;->η:Landroid/app/Activity;

    .line 8
    .line 9
    iput-object p2, p0, Lvu;->θ:Landroid/widget/ScrollView;

    .line 10
    .line 11
    iput-object p3, p0, Lvu;->ζ:Landroid/view/View;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Landroid/view/View;Landroid/app/Activity;Landroid/widget/ScrollView;)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Lvu;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvu;->ζ:Landroid/view/View;

    iput-object p2, p0, Lvu;->η:Landroid/app/Activity;

    iput-object p3, p0, Lvu;->θ:Landroid/widget/ScrollView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lvu;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lvu;->ζ:Landroid/view/View;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/high16 v1, 0x41800000    # 16.0f

    .line 13
    .line 14
    iget-object v2, p0, Lvu;->η:Landroid/app/Activity;

    .line 15
    .line 16
    invoke-static {v2, v1}, Lia0;->γ(Landroid/content/Context;F)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sub-int/2addr v0, v1

    .line 21
    const/4 v1, 0x0

    .line 22
    if-gez v0, :cond_0

    .line 23
    .line 24
    move v0, v1

    .line 25
    :cond_0
    iget-object p0, p0, Lvu;->θ:Landroid/widget/ScrollView;

    .line 26
    .line 27
    invoke-virtual {p0, v1, v0}, Landroid/widget/ScrollView;->smoothScrollTo(II)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_0
    iget-object v0, p0, Lvu;->η:Landroid/app/Activity;

    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 42
    .line 43
    int-to-float v0, v0

    .line 44
    const v1, 0x3f5c28f6    # 0.86f

    .line 45
    .line 46
    .line 47
    mul-float/2addr v0, v1

    .line 48
    float-to-int v0, v0

    .line 49
    iget-object v1, p0, Lvu;->θ:Landroid/widget/ScrollView;

    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-gt v3, v0, :cond_1

    .line 60
    .line 61
    iget-object p0, p0, Lvu;->ζ:Landroid/view/View;

    .line 62
    .line 63
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-le p0, v0, :cond_2

    .line 68
    .line 69
    :cond_1
    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 70
    .line 71
    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 72
    .line 73
    .line 74
    :cond_2
    return-void

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
