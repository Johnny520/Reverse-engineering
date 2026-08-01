.class public final synthetic Llw0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lcom/example/dyhelper/ui/MainActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/example/dyhelper/ui/MainActivity;I)V
    .locals 0

    .line 1
    iput p2, p0, Llw0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Llw0;->ζ:Lcom/example/dyhelper/ui/MainActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Llw0;->ε:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, Llw0;->ζ:Lcom/example/dyhelper/ui/MainActivity;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    sget v0, Lcom/example/dyhelper/ui/MainActivity;->η:I

    .line 16
    .line 17
    int-to-float p1, p1

    .line 18
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {v1, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    float-to-int p0, p0

    .line 31
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_0
    check-cast p1, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    sget v0, Lcom/example/dyhelper/ui/MainActivity;->η:I

    .line 43
    .line 44
    if-eqz p1, :cond_0

    .line 45
    .line 46
    const/4 v0, 0x2

    .line 47
    goto :goto_0

    .line 48
    :cond_0
    move v0, v1

    .line 49
    :goto_0
    const/4 v2, 0x0

    .line 50
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    iget-object v4, p0, Lcom/example/dyhelper/ui/MainActivity;->ζ:Lh22;

    .line 55
    .line 56
    invoke-virtual {v4}, Lh22;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Landroid/content/ComponentName;

    .line 61
    .line 62
    invoke-virtual {v3, v4, v0, v1}, Landroid/content/pm/PackageManager;->setComponentEnabledSetting(Landroid/content/ComponentName;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :catchall_0
    const-string v0, "\u9690\u85cf\u5931\u8d25\uff0c\u8bf7\u68c0\u67e5 Manifest \u662f\u5426\u914d\u7f6e\u4e86 activity-alias"

    .line 67
    .line 68
    invoke-static {p0, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 73
    .line 74
    .line 75
    :goto_1
    if-eqz p1, :cond_1

    .line 76
    .line 77
    const-string p1, "\u5df2\u9690\u85cf\u684c\u9762\u56fe\u6807\uff0c\u7a0d\u540e\u751f\u6548"

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_1
    const-string p1, "\u5df2\u6062\u590d\u684c\u9762\u56fe\u6807\uff0c\u7a0d\u540e\u751f\u6548"

    .line 81
    .line 82
    :goto_2
    invoke-static {p0, p1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 87
    .line 88
    .line 89
    sget-object p0, Ls62;->α:Ls62;

    .line 90
    .line 91
    return-object p0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
