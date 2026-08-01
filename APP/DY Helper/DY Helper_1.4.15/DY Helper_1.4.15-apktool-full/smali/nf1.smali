.class public final synthetic Lnf1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic α:Landroid/app/AlertDialog;

.field public final synthetic β:Lum1;

.field public final synthetic γ:Landroid/app/Activity;

.field public final synthetic δ:Landroid/widget/TextView;

.field public final synthetic ε:Landroid/widget/TextView;

.field public final synthetic ζ:Lky1;

.field public final synthetic η:Ljava/util/LinkedHashMap;

.field public final synthetic θ:Lqm1;

.field public final synthetic ι:Landroid/widget/RadioGroup;

.field public final synthetic κ:Z

.field public final synthetic λ:Landroid/widget/TextView;

.field public final synthetic μ:Landroid/view/LayoutInflater;

.field public final synthetic ν:Lxx;

.field public final synthetic ξ:Lum1;


# direct methods
.method public synthetic constructor <init>(Lxx;Lqm1;Lum1;Lum1;Lky1;Landroid/app/Activity;Landroid/app/AlertDialog;Landroid/view/LayoutInflater;Landroid/widget/RadioGroup;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/util/LinkedHashMap;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p7, p0, Lnf1;->α:Landroid/app/AlertDialog;

    .line 5
    .line 6
    iput-object p3, p0, Lnf1;->β:Lum1;

    .line 7
    .line 8
    iput-object p6, p0, Lnf1;->γ:Landroid/app/Activity;

    .line 9
    .line 10
    iput-object p10, p0, Lnf1;->δ:Landroid/widget/TextView;

    .line 11
    .line 12
    iput-object p11, p0, Lnf1;->ε:Landroid/widget/TextView;

    .line 13
    .line 14
    iput-object p5, p0, Lnf1;->ζ:Lky1;

    .line 15
    .line 16
    iput-object p13, p0, Lnf1;->η:Ljava/util/LinkedHashMap;

    .line 17
    .line 18
    iput-object p2, p0, Lnf1;->θ:Lqm1;

    .line 19
    .line 20
    iput-object p9, p0, Lnf1;->ι:Landroid/widget/RadioGroup;

    .line 21
    .line 22
    iput-boolean p14, p0, Lnf1;->κ:Z

    .line 23
    .line 24
    iput-object p12, p0, Lnf1;->λ:Landroid/widget/TextView;

    .line 25
    .line 26
    iput-object p8, p0, Lnf1;->μ:Landroid/view/LayoutInflater;

    .line 27
    .line 28
    iput-object p1, p0, Lnf1;->ν:Lxx;

    .line 29
    .line 30
    iput-object p4, p0, Lnf1;->ξ:Lum1;

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v4, v0, Lnf1;->α:Landroid/app/AlertDialog;

    .line 4
    .line 5
    invoke-virtual {v4}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-object v2, v0, Lnf1;->γ:Landroid/app/Activity;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    new-instance v3, Landroid/graphics/drawable/ColorDrawable;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    invoke-direct {v3, v5}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v3}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 20
    .line 21
    .line 22
    const v3, 0x3ee66666    # 0.45f

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v3}, Landroid/view/Window;->setDimAmount(F)V

    .line 26
    .line 27
    .line 28
    const/4 v3, 0x2

    .line 29
    invoke-virtual {v1, v3}, Landroid/view/Window;->addFlags(I)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 41
    .line 42
    int-to-float v3, v3

    .line 43
    const v5, 0x3f6b851f    # 0.92f

    .line 44
    .line 45
    .line 46
    mul-float/2addr v3, v5

    .line 47
    float-to-int v3, v3

    .line 48
    const/4 v5, -0x2

    .line 49
    invoke-virtual {v1, v3, v5}, Landroid/view/Window;->setLayout(II)V

    .line 50
    .line 51
    .line 52
    :cond_0
    iget-object v5, v0, Lnf1;->β:Lum1;

    .line 53
    .line 54
    iget-object v1, v5, Lum1;->ε:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, Lef1;

    .line 57
    .line 58
    iget-object v1, v1, Lef1;->α:Ljava/util/List;

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_1

    .line 65
    .line 66
    const/4 v14, 0x0

    .line 67
    iget-object v1, v0, Lnf1;->δ:Landroid/widget/TextView;

    .line 68
    .line 69
    move-object v3, v1

    .line 70
    iget-object v1, v0, Lnf1;->ε:Landroid/widget/TextView;

    .line 71
    .line 72
    move-object v6, v3

    .line 73
    iget-object v3, v0, Lnf1;->ζ:Lky1;

    .line 74
    .line 75
    move-object v7, v6

    .line 76
    iget-object v6, v0, Lnf1;->η:Ljava/util/LinkedHashMap;

    .line 77
    .line 78
    move-object v8, v7

    .line 79
    iget-object v7, v0, Lnf1;->θ:Lqm1;

    .line 80
    .line 81
    move-object v9, v8

    .line 82
    iget-object v8, v0, Lnf1;->ι:Landroid/widget/RadioGroup;

    .line 83
    .line 84
    move-object v10, v9

    .line 85
    iget-boolean v9, v0, Lnf1;->κ:Z

    .line 86
    .line 87
    move-object v11, v10

    .line 88
    iget-object v10, v0, Lnf1;->λ:Landroid/widget/TextView;

    .line 89
    .line 90
    move-object v12, v11

    .line 91
    iget-object v11, v0, Lnf1;->μ:Landroid/view/LayoutInflater;

    .line 92
    .line 93
    move-object v13, v12

    .line 94
    iget-object v12, v0, Lnf1;->ν:Lxx;

    .line 95
    .line 96
    iget-object v0, v0, Lnf1;->ξ:Lum1;

    .line 97
    .line 98
    move-object v15, v13

    .line 99
    move-object v13, v0

    .line 100
    move-object v0, v15

    .line 101
    invoke-static/range {v0 .. v14}, Lpf1;->η(Landroid/widget/TextView;Landroid/widget/TextView;Landroid/app/Activity;Lky1;Landroid/app/AlertDialog;Lum1;Ljava/util/LinkedHashMap;Lqm1;Landroid/widget/RadioGroup;ZLandroid/widget/TextView;Landroid/view/LayoutInflater;Lxx;Lum1;Z)V

    .line 102
    .line 103
    .line 104
    :cond_1
    return-void
.end method
