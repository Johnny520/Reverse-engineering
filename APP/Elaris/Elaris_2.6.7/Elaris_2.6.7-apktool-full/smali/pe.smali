.class public final Lpe;
.super Lcom/mr/elaris/xposedcompat/XC_MethodHook;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# instance fields
.field public final synthetic a:Ljava/lang/ClassLoader;


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lpe;->a:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    const/16 p1, 0x46

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final afterHookedMethod(Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p1, :cond_1

    .line 4
    .line 5
    iget-object v2, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    .line 6
    .line 7
    if-eqz v2, :cond_1

    .line 8
    .line 9
    array-length v3, v2

    .line 10
    const/4 v4, 0x2

    .line 11
    if-ge v3, v4, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    aget-object v2, v2, v1

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_1
    :goto_0
    move-object v2, v0

    .line 18
    :goto_1
    invoke-static {v2}, Lcom/mr/elaris/w;->p0(Ljava/lang/Object;)Lv9;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    if-nez v2, :cond_2

    .line 23
    .line 24
    goto :goto_2

    .line 25
    :cond_2
    iget v3, v2, Lv9;->a:I

    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    instance-of v5, v4, Landroid/view/View;

    .line 32
    .line 33
    if-nez v5, :cond_3

    .line 34
    .line 35
    :goto_2
    return-void

    .line 36
    :cond_3
    if-ne v3, v1, :cond_4

    .line 37
    .line 38
    const-string v1, "\u4fdd\u5b58\u8bed\u97f3"

    .line 39
    .line 40
    goto :goto_3

    .line 41
    :cond_4
    const-string v1, "\u8f6c\u53d1\u8bed\u97f3"

    .line 42
    .line 43
    :goto_3
    check-cast v4, Landroid/view/View;

    .line 44
    .line 45
    invoke-static {v4, v1}, Lcom/mr/elaris/w;->g0(Landroid/view/View;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-static {v4}, Lcom/mr/elaris/w;->F(Landroid/view/View;)Landroid/widget/ImageView;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    if-nez v1, :cond_5

    .line 53
    .line 54
    goto :goto_5

    .line 55
    :cond_5
    :try_start_0
    invoke-static {v4}, Lcom/mr/elaris/w;->J(Landroid/view/View;)I

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    const/high16 v7, 0x3f800000    # 1.0f

    .line 64
    .line 65
    if-nez v6, :cond_6

    .line 66
    .line 67
    move v6, v7

    .line 68
    goto :goto_4

    .line 69
    :cond_6
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    invoke-virtual {v6}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    iget v6, v6, Landroid/util/DisplayMetrics;->density:F

    .line 78
    .line 79
    :goto_4
    new-instance v8, Lce;

    .line 80
    .line 81
    invoke-direct {v8, v3, v5, v6}, Lce;-><init>(IIF)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v8}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setColorFilter(Landroid/graphics/ColorFilter;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, v7}, Landroid/view/View;->setAlpha(F)V

    .line 91
    .line 92
    .line 93
    const/4 v0, 0x0

    .line 94
    invoke-virtual {v1, v0, v0, v0, v0}, Landroid/view/View;->setPadding(IIII)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 98
    .line 99
    .line 100
    sget-object v0, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    .line 101
    .line 102
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 103
    .line 104
    .line 105
    :catchall_0
    :goto_5
    iget-object p1, p1, Lcom/mr/elaris/xposedcompat/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

    .line 106
    .line 107
    new-instance v0, Loe;

    .line 108
    .line 109
    iget-object p0, p0, Lpe;->a:Ljava/lang/ClassLoader;

    .line 110
    .line 111
    invoke-direct {v0, p1, p0, v2}, Loe;-><init>(Ljava/lang/Object;Ljava/lang/ClassLoader;Lv9;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 115
    .line 116
    .line 117
    return-void
.end method
