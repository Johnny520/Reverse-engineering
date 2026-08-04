.class public final synthetic Lyyds/ᲁᲈᛸᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛲᲇᲁᛴ;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Landroid/widget/TextView;

.field public final synthetic ᲀᛲᛳᲀ:Lcom/ss/android/ugc/awemes/MainActivity;

.field public final synthetic ᲇᲈᛵᛷ:Ljava/util/ArrayList;


# direct methods
.method public synthetic constructor <init>(Lcom/ss/android/ugc/awemes/MainActivity;Ljava/util/ArrayList;Landroid/widget/TextView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᲁᲈᛸᛲ;->ᲀᛲᛳᲀ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᲁᲈᛸᛲ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᲁᲈᛸᛲ;->ᛲᛴᛳᛲ:Landroid/widget/TextView;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final ᛶᛷᛲᲁ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Lyyds/ᛵᛱᛷᛳ;

    .line 2
    .line 3
    check-cast p2, Landroid/view/View;

    .line 4
    .line 5
    sget-object v0, Lcom/ss/android/ugc/awemes/MainActivity;->ᲈᛷᲈᛶ:Ljava/util/List;

    .line 6
    .line 7
    const-wide v0, -0xf8c4e68a836eL

    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    const-wide v0, -0xf8cde68a836eL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Lyyds/ᲁᲈᛸᛲ;->ᲀᛲᛳᲀ:Lcom/ss/android/ugc/awemes/MainActivity;

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛵᛸᛸᛷ(Lyyds/ᛵᛱᛷᛳ;)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lyyds/ᲁᲈᛸᛲ;->ᲇᲈᛵᛷ:Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Lyyds/ᛶᛵᛷᛷ;

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛸᛸᛷᛱ(Lyyds/ᛶᛵᛷᛷ;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛷᲈᲈᲁ()Landroid/graphics/drawable/GradientDrawable;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object p0, p0, Lyyds/ᲁᲈᛸᛲ;->ᛲᛴᛳᛲ:Landroid/widget/TextView;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Lcom/ss/android/ugc/awemes/MainActivity;->ᛳᛸᛴᛶ(Lcom/ss/android/ugc/awemes/MainActivity;)I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const p1, 0x3f75c28f    # 0.96f

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->scaleX(F)Landroid/view/ViewPropertyAnimator;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->scaleY(F)Landroid/view/ViewPropertyAnimator;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    const-wide/16 v0, 0x5a

    .line 82
    .line 83
    invoke-virtual {p0, v0, v1}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    new-instance p1, Lyyds/ᲀᛸᛴᛳ;

    .line 88
    .line 89
    const/4 v0, 0x1

    .line 90
    invoke-direct {p1, p2, v0}, Lyyds/ᲀᛸᛴᛳ;-><init>(Landroid/view/View;I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 98
    .line 99
    .line 100
    sget-object p0, Lyyds/ᲈᲀᛸᲀ;->ᛲᲈᲁ:Lyyds/ᲈᲀᛸᲀ;

    .line 101
    .line 102
    return-object p0
.end method
