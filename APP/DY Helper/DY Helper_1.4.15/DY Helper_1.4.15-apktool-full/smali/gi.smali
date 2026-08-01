.class public final synthetic Lgi;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/content/DialogInterface$OnShowListener;


# instance fields
.field public final synthetic α:I

.field public final synthetic β:Ljava/lang/Object;

.field public final synthetic γ:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p3, p0, Lgi;->α:I

    .line 2
    .line 3
    iput-object p1, p0, Lgi;->β:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lgi;->γ:Landroid/content/Context;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onShow(Landroid/content/DialogInterface;)V
    .locals 2

    .line 1
    iget p1, p0, Lgi;->α:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, Lgi;->β:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p1, Landroid/app/AlertDialog;

    .line 9
    .line 10
    iget-object p0, p0, Lgi;->γ:Landroid/content/Context;

    .line 11
    .line 12
    check-cast p0, Landroid/app/Activity;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 27
    .line 28
    .line 29
    const v0, 0x3f0ccccd    # 0.55f

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/view/Window;->setDimAmount(F)V

    .line 33
    .line 34
    .line 35
    const/4 v0, 0x2

    .line 36
    invoke-virtual {p1, v0}, Landroid/view/Window;->addFlags(I)V

    .line 37
    .line 38
    .line 39
    const v0, 0x20008

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1, v0}, Landroid/view/Window;->clearFlags(I)V

    .line 43
    .line 44
    .line 45
    const/16 v0, 0x10

    .line 46
    .line 47
    invoke-virtual {p1, v0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    iget p0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 59
    .line 60
    int-to-float p0, p0

    .line 61
    const v0, 0x3f70a3d7    # 0.94f

    .line 62
    .line 63
    .line 64
    mul-float/2addr p0, v0

    .line 65
    float-to-int p0, p0

    .line 66
    const/4 v0, -0x2

    .line 67
    invoke-virtual {p1, p0, v0}, Landroid/view/Window;->setLayout(II)V

    .line 68
    .line 69
    .line 70
    :cond_0
    return-void

    .line 71
    :pswitch_0
    iget-object p1, p0, Lgi;->β:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast p1, Lum1;

    .line 74
    .line 75
    iget-object p1, p1, Lum1;->ε:Ljava/lang/Object;

    .line 76
    .line 77
    if-eqz p1, :cond_2

    .line 78
    .line 79
    check-cast p1, Landroid/app/AlertDialog;

    .line 80
    .line 81
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    if-eqz p1, :cond_1

    .line 86
    .line 87
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 88
    .line 89
    const/4 v1, 0x0

    .line 90
    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v0}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0, v1, v1, v1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 101
    .line 102
    .line 103
    iget-object p0, p0, Lgi;->γ:Landroid/content/Context;

    .line 104
    .line 105
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    iget p0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 114
    .line 115
    int-to-float p0, p0

    .line 116
    const v0, 0x3f6b851f    # 0.92f

    .line 117
    .line 118
    .line 119
    mul-float/2addr p0, v0

    .line 120
    invoke-static {p0}, Ljx0;->в(F)I

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    const/4 v0, -0x2

    .line 125
    invoke-virtual {p1, p0, v0}, Landroid/view/Window;->setLayout(II)V

    .line 126
    .line 127
    .line 128
    const/high16 p0, 0x3f000000    # 0.5f

    .line 129
    .line 130
    invoke-virtual {p1, p0}, Landroid/view/Window;->setDimAmount(F)V

    .line 131
    .line 132
    .line 133
    const/4 p0, 0x2

    .line 134
    invoke-virtual {p1, p0}, Landroid/view/Window;->addFlags(I)V

    .line 135
    .line 136
    .line 137
    const/16 p0, 0x10

    .line 138
    .line 139
    invoke-virtual {p1, p0}, Landroid/view/Window;->setSoftInputMode(I)V

    .line 140
    .line 141
    .line 142
    :cond_1
    return-void

    .line 143
    :cond_2
    const-string p0, "dialog"

    .line 144
    .line 145
    invoke-static {p0}, Lln0;->и(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const/4 p0, 0x0

    .line 149
    throw p0

    .line 150
    nop

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
