.class public final Lxhss/ᛷᲀᲇᲀ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:I

.field public final synthetic ᛳᲁᲇᛸ:Ljava/lang/ref/WeakReference;

.field public final synthetic ᛷᛵᛵᲈ:I

.field public final synthetic ᲇᛴᲇᛵ:Lxhss/ᛸᲀᛳᲁ;


# direct methods
.method public constructor <init>(Lxhss/ᛸᲀᛳᲁ;IILjava/lang/ref/WeakReference;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛷᲀᲇᲀ;->ᲇᛴᲇᛵ:Lxhss/ᛸᲀᛳᲁ;

    .line 5
    .line 6
    iput p2, p0, Lxhss/ᛷᲀᲇᲀ;->ᛷᛵᛵᲈ:I

    .line 7
    .line 8
    iput p3, p0, Lxhss/ᛷᲀᲇᲀ;->ᛱᛱᛲᲇ:I

    .line 9
    .line 10
    iput-object p4, p0, Lxhss/ᛷᲀᲇᲀ;->ᛳᲁᲇᛸ:Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final ᛱᛱᛲᲇ(Landroid/graphics/Typeface;)V
    .locals 2

    .line 1
    const/4 v0, -0x1

    .line 2
    iget v1, p0, Lxhss/ᛷᲀᲇᲀ;->ᛷᛵᛵᲈ:I

    .line 3
    .line 4
    if-eq v1, v0, :cond_1

    .line 5
    .line 6
    iget v0, p0, Lxhss/ᛷᲀᲇᲀ;->ᛱᛱᛲᲇ:I

    .line 7
    .line 8
    and-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    invoke-static {p1, v1, v0}, Lxhss/ᛴᛲᛳᛱ;->ᛷᛵᛵᲈ(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :cond_1
    iget-object v0, p0, Lxhss/ᛷᲀᲇᲀ;->ᲇᛴᲇᛵ:Lxhss/ᛸᲀᛳᲁ;

    .line 20
    .line 21
    iget-boolean v1, v0, Lxhss/ᛸᲀᛳᲁ;->ᛸᛶᲈᛶ:Z

    .line 22
    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    iput-object p1, v0, Lxhss/ᛸᲀᛳᲁ;->ᛷᲁᲁ:Landroid/graphics/Typeface;

    .line 26
    .line 27
    iget-object p0, p0, Lxhss/ᛷᲀᲇᲀ;->ᛳᲁᲇᛸ:Ljava/lang/ref/WeakReference;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Landroid/widget/TextView;

    .line 34
    .line 35
    if-eqz p0, :cond_3

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->isAttachedToWindow()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget v0, v0, Lxhss/ᛸᲀᛳᲁ;->ᛸᛷᲈᲈ:I

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    new-instance v1, Lxhss/ᲈᲈᛶᛲ;

    .line 46
    .line 47
    invoke-direct {v1, p0, p1, v0}, Lxhss/ᲈᲈᛶᛲ;-><init>(Landroid/widget/TextView;Landroid/graphics/Typeface;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    invoke-virtual {p0, p1, v0}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;I)V

    .line 55
    .line 56
    .line 57
    :cond_3
    return-void
.end method

.method public final ᛷᛵᛵᲈ()V
    .locals 1

    .line 1
    new-instance p0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p0, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    new-instance v0, Lxhss/ᛲᛵᛴᲇ;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method
