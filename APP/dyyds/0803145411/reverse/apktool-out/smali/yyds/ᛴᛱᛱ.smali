.class public final Lyyds/ᛴᛱᛱ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/view/View$OnAttachStateChangeListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Ljava/lang/Object;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p2, p0, Lyyds/ᛴᛱᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᛴᛱᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p3, p0, Lyyds/ᛴᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private final ᛲᲈᲁ(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method

.method private final ᛵᛸᛸᛷ(Landroid/view/View;)V
    .locals 0

    .line 1
    return-void
.end method


# virtual methods
.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 5

    .line 1
    iget v0, p0, Lyyds/ᛴᛱᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᛴᛱᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Lyyds/ᲁᛲᛱᛳ;

    .line 12
    .line 13
    sget v1, Lcom/kongzue/dialogx/util/views/DialogXBaseRelativeLayout;->ᛶᛸᲀᲁ:I

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, -0x1

    .line 17
    :try_start_0
    invoke-static {}, Lyyds/ᛲᛶᛵᛲ;->ᛲᲈᲁ()Landroid/app/Application;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-virtual {v4, v3, v1}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    iget v2, v3, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :catch_0
    move-exception v3

    .line 40
    invoke-virtual {v3}, Ljava/lang/Throwable;->printStackTrace()V

    .line 41
    .line 42
    .line 43
    :goto_0
    const/16 v3, 0x1e

    .line 44
    .line 45
    if-ge v2, v3, :cond_2

    .line 46
    .line 47
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Landroid/view/View;

    .line 52
    .line 53
    iget-object v3, v0, Lyyds/ᲁᛲᛱᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛸᲇᲀ;

    .line 54
    .line 55
    if-eqz v3, :cond_1

    .line 56
    .line 57
    invoke-virtual {v2, v3}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 58
    .line 59
    .line 60
    :cond_1
    new-instance v3, Lyyds/ᛴᛸᲇᲀ;

    .line 61
    .line 62
    invoke-direct {v3, v1, p0}, Lyyds/ᛴᛸᲇᲀ;-><init>(ILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iput-object v3, v0, Lyyds/ᲁᛲᛱᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛸᲇᲀ;

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, Lyyds/ᛴᛱᛱ;

    .line 71
    .line 72
    invoke-direct {v0, p0, v1, v2}, Lyyds/ᛴᛱᛱ;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 76
    .line 77
    .line 78
    :cond_2
    sget-object p0, Lyyds/ᛷᲁᛵᲇ;->ᛲᲈᲁ:Ljava/util/WeakHashMap;

    .line 79
    .line 80
    invoke-virtual {p1}, Landroid/view/View;->requestApplyInsets()V

    .line 81
    .line 82
    .line 83
    :pswitch_0
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    .line 1
    iget p1, p0, Lyyds/ᛴᛱᛱ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :pswitch_0
    iget-object p1, p0, Lyyds/ᛴᛱᛱ;->ᲇᲈᛵᛷ:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p1, Landroid/view/View;

    .line 10
    .line 11
    iget-object p0, p0, Lyyds/ᛴᛱᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lyyds/ᛴᛱᛱ;

    .line 14
    .line 15
    iget-object p0, p0, Lyyds/ᛴᛱᛱ;->ᛲᛴᛳᛲ:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, Lyyds/ᲁᛲᛱᛳ;

    .line 18
    .line 19
    iget-object p0, p0, Lyyds/ᲁᛲᛱᛳ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛸᲇᲀ;

    .line 20
    .line 21
    invoke-virtual {p1, p0}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
