.class public final synthetic Lyyds/ᲈᲁᛲᲁ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic ᛲᲈᲁ:Lyyds/ᲇᲁᲁᛱ;

.field public final synthetic ᛵᛸᛸᛷ:Landroid/animation/ValueAnimator;

.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛷᲀᛶᛵ;


# direct methods
.method public synthetic constructor <init>(Lyyds/ᲇᲁᲁᛱ;Landroid/animation/ValueAnimator;Lyyds/ᛷᲀᛶᛵ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲈᲁᛲᲁ;->ᛲᲈᲁ:Lyyds/ᲇᲁᲁᛱ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲈᲁᛲᲁ;->ᛵᛸᛸᛷ:Landroid/animation/ValueAnimator;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲈᲁᛲᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲀᛶᛵ;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .locals 3

    .line 1
    const-wide v0, -0x39685e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lyyds/ᲈᲁᛲᲁ;->ᛲᲈᲁ:Lyyds/ᲇᲁᲁᛱ;

    .line 10
    .line 11
    iget-object v1, v0, Lyyds/ᲇᲁᲁᛱ;->ᛷᛵᲇᲀ:Landroid/animation/ValueAnimator;

    .line 12
    .line 13
    iget-object v2, p0, Lyyds/ᲈᲁᛲᲁ;->ᛵᛸᛸᛷ:Landroid/animation/ValueAnimator;

    .line 14
    .line 15
    if-eq v1, v2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-wide v1, -0x39688e68a836eL

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    check-cast p1, Ljava/lang/Float;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    iget-object p0, p0, Lyyds/ᲈᲁᛲᲁ;->ᲀᛲᛳᲀ:Lyyds/ᛷᲀᛶᛵ;

    .line 37
    .line 38
    iput p1, p0, Lyyds/ᛷᲀᛶᛵ;->ᲇᲈᛵᛷ:F

    .line 39
    .line 40
    iget-object p1, v0, Lyyds/ᲇᲁᲁᛱ;->ᲀᛲᛳᲀ:Ljava/lang/ref/WeakReference;

    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    check-cast p1, Landroid/view/View;

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    sget-object v0, Lyyds/ᛸᛵᲈᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛸᛵᲈᛷ;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p0}, Lyyds/ᛸᛵᲈᛷ;->ᛴᛸᲁᛵ(Landroid/view/View;Lyyds/ᛷᲀᛶᛵ;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    :goto_0
    return-void
.end method
