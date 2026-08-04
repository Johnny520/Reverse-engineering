.class public final Lyyds/ᛸᛶᲈᛳ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final ᛲᛴᛳᛲ:Lyyds/ᲀᛲᛶᛸ;

.field public static final ᲇᲈᛵᛷ:Lyyds/ᲀᛲᛶᛸ;


# instance fields
.field public final ᛲᲈᲁ:Lcom/android/app/CustomRecyclerView;

.field public ᛵᛸᛸᛷ:Z

.field public ᲀᛲᛳᲀ:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lyyds/ᲀᛲᛶᛸ;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lyyds/ᲀᛲᛶᛸ;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lyyds/ᛸᛶᲈᛳ;->ᲇᲈᛵᛷ:Lyyds/ᲀᛲᛶᛸ;

    .line 8
    .line 9
    new-instance v0, Lyyds/ᲀᛲᛶᛸ;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lyyds/ᲀᛲᛶᛸ;-><init>(I)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lyyds/ᛸᛶᲈᛳ;->ᛲᛴᛳᛲ:Lyyds/ᲀᛲᛶᛸ;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lcom/android/app/CustomRecyclerView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lyyds/ᛸᛶᲈᛳ;->ᛵᛸᛸᛷ:Z

    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᛸᛶᲈᛳ;->ᛲᲈᲁ:Lcom/android/app/CustomRecyclerView;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final ᛲᲈᲁ(Landroid/view/View;Landroid/view/View;)V
    .locals 4

    .line 1
    iget-boolean v0, p0, Lyyds/ᛸᛶᲈᛳ;->ᛵᛸᛸᛷ:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    iput-boolean v0, p0, Lyyds/ᛸᛶᲈᛳ;->ᛵᛸᛸᛷ:Z

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    const/high16 p1, 0x3f800000    # 1.0f

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    const-wide/16 v1, 0x96

    .line 25
    .line 26
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object v3, Lyyds/ᛸᛶᲈᛳ;->ᲇᲈᛵᛷ:Lyyds/ᲀᛲᛶᛸ;

    .line 31
    .line 32
    invoke-virtual {p0, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 37
    .line 38
    .line 39
    invoke-virtual {p2}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {p0, p1}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {p0, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-virtual {p0, v3}, Landroid/view/ViewPropertyAnimator;->setInterpolator(Landroid/animation/TimeInterpolator;)Landroid/view/ViewPropertyAnimator;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 60
    .line 61
    .line 62
    return-void
.end method
