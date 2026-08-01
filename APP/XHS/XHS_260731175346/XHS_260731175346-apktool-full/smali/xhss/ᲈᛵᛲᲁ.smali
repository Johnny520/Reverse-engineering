.class public final Lxhss/ᲈᛵᛲᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Lxhss/ᛵᛲᲇᛴ;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛵᛲᲇᛴ;I)V
    .locals 0

    .line 1
    iput p2, p0, Lxhss/ᲈᛵᛲᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    iput-object p1, p0, Lxhss/ᲈᛵᛲᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛵᛲᲇᛴ;

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
    .locals 3

    .line 1
    iget v0, p0, Lxhss/ᲈᛵᛲᲁ;->ᛱᛱᛲᲇ:I

    .line 2
    .line 3
    const/high16 v1, 0x40000000    # 2.0f

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    iget-object p0, p0, Lxhss/ᲈᛵᛲᲁ;->ᛳᲁᲇᛸ:Lxhss/ᛵᛲᲇᛴ;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget v0, p0, Lxhss/ᛵᛲᲇᛴ;->ᛷᛵᛵᲈ:I

    .line 12
    .line 13
    iget-object v1, p0, Lxhss/ᛵᛲᲇᛴ;->ᛱᛳᲁᲈ:Landroid/view/animation/Interpolator;

    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Lxhss/ᛵᛲᲇᛴ;->ᛳᲁᲇᛸ(ILandroid/view/animation/Interpolator;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    new-instance v0, Landroid/view/animation/DecelerateInterpolator;

    .line 20
    .line 21
    invoke-direct {v0, v1}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v2, v0}, Lxhss/ᛵᛲᲇᛴ;->ᛳᲁᲇᛸ(ILandroid/view/animation/Interpolator;)V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :pswitch_1
    new-instance v0, Landroid/view/animation/AccelerateInterpolator;

    .line 29
    .line 30
    invoke-direct {v0, v1}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    .line 31
    .line 32
    .line 33
    const/4 v1, 0x2

    .line 34
    invoke-virtual {p0, v1, v0}, Lxhss/ᛵᛲᲇᛴ;->ᛳᲁᲇᛸ(ILandroid/view/animation/Interpolator;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :pswitch_2
    new-instance v0, Landroid/view/animation/AccelerateDecelerateInterpolator;

    .line 39
    .line 40
    invoke-direct {v0}, Landroid/view/animation/AccelerateDecelerateInterpolator;-><init>()V

    .line 41
    .line 42
    .line 43
    const/4 v1, 0x1

    .line 44
    invoke-virtual {p0, v1, v0}, Lxhss/ᛵᛲᲇᛴ;->ᛳᲁᲇᛸ(ILandroid/view/animation/Interpolator;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_3
    invoke-virtual {p0, v2}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :pswitch_4
    const/4 v0, 0x0

    .line 53
    invoke-virtual {p0, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    .line 54
    .line 55
    .line 56
    return-void

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
