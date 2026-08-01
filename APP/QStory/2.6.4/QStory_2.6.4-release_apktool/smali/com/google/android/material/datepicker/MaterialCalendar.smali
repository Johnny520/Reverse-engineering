.class public final Lcom/google/android/material/datepicker/MaterialCalendar;
.super Lcom/google/android/material/datepicker/飘花落叶言子世楪兰哲苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/material/datepicker/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u4e16\u696a\u5170\u54f2\u82cf;"
    }
.end annotation


# instance fields
.field public 飘花落叶言子哲世楪苏兰:Z

.field public 飘花落叶言子哲楪世兰苏:Landroid/view/View;

.field public 飘花落叶言子哲楪世苏兰:Landroid/view/View;

.field public 飘花落叶言子哲楪兰世苏:Landroid/view/accessibility/AccessibilityManager;

.field public 飘花落叶言子哲楪兰苏世:Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;

.field public 飘花落叶言子哲楪苏世兰:Landroid/view/View;

.field public 飘花落叶言子哲楪苏兰世:Lcom/google/android/material/button/MaterialButton;

.field public 飘花落叶言子苏兰世哲楪:Landroidx/recyclerview/widget/RecyclerView;

.field public 飘花落叶言子苏兰世楪哲:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

.field public 飘花落叶言子苏兰哲世楪:Landroid/view/View;

.field public 飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

.field public 飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

.field public 飘花落叶言子苏兰楪哲世:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

.field public 飘花落叶言子苏哲世兰楪:Lcom/google/android/material/datepicker/DateSelector;

.field public 飘花落叶言子苏哲世楪兰:I

.field public 飘花落叶言子苏哲兰世楪:Lcom/google/android/material/datepicker/DayViewDecorator;

.field public 飘花落叶言子苏哲兰楪世:Lcom/google/android/material/datepicker/CalendarConstraints;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰哲苏;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static 飘花落叶言子世苏哲楪兰(Lcom/google/android/material/datepicker/MaterialCalendar;Z)Z
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲世楪苏兰:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x1

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return v1

    .line 16
    :cond_1
    iget-object v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;

    .line 23
    .line 24
    if-eqz v0, :cond_5

    .line 25
    .line 26
    iget-object v2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 27
    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏(Lcom/google/android/material/datepicker/Month;)I

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz p1, :cond_3

    .line 36
    .line 37
    move v3, v1

    .line 38
    goto :goto_0

    .line 39
    :cond_3
    const/4 v3, -0x1

    .line 40
    :goto_0
    add-int/2addr v2, v3

    .line 41
    if-ltz v2, :cond_5

    .line 42
    .line 43
    iget-object v3, v0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 44
    .line 45
    iget v3, v3, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪兰苏哲世:I

    .line 46
    .line 47
    if-ge v2, v3, :cond_5

    .line 48
    .line 49
    if-eqz p1, :cond_4

    .line 50
    .line 51
    const/4 p1, 0x2

    .line 52
    goto :goto_1

    .line 53
    :cond_4
    move p1, v1

    .line 54
    :goto_1
    iput p1, v0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏兰世哲:I

    .line 55
    .line 56
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世苏哲(I)Lcom/google/android/material/datepicker/Month;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世苏哲兰楪(Lcom/google/android/material/datepicker/Month;)V

    .line 61
    .line 62
    .line 63
    return v1

    .line 64
    :cond_5
    :goto_2
    const/4 p0, 0x0

    .line 65
    return p0
.end method


# virtual methods
.method public final 飘花落叶言子世哲楪兰苏(I)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪世苏兰:Landroid/view/View;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    add-int/lit8 v3, p1, 0x1

    .line 8
    .line 9
    iget-object v4, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    invoke-virtual {v4}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世哲苏兰()I

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-ge v3, v4, :cond_0

    .line 20
    .line 21
    move v3, v2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move v3, v1

    .line 24
    :goto_0
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    .line 25
    .line 26
    .line 27
    :cond_1
    iget-object p0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲世楪:Landroid/view/View;

    .line 28
    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    sub-int/2addr p1, v2

    .line 32
    if-ltz p1, :cond_2

    .line 33
    .line 34
    move v1, v2

    .line 35
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 36
    .line 37
    .line 38
    :cond_3
    return-void
.end method

.method public final 飘花落叶言子世哲楪苏兰()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    iget-boolean v1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲世楪苏兰:Z

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    iget-object p0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iget-object v1, v0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏哲兰世:Lcom/google/android/material/datepicker/Month;

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Lcom/google/android/material/datepicker/Month;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    iget-object v1, v0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏哲兰世:Lcom/google/android/material/datepicker/Month;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏(Lcom/google/android/material/datepicker/Month;)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iput-object p0, v0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏哲兰世:Lcom/google/android/material/datepicker/Month;

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏(Lcom/google/android/material/datepicker/Month;)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪苏世哲兰(I)V

    .line 43
    .line 44
    .line 45
    :cond_0
    return-void
.end method

.method public final 飘花落叶言子世苏兰哲楪(Landroid/view/View;)V
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪哲世:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 5
    .line 6
    sget-object v1, Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;->YEAR:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 7
    .line 8
    if-ne v0, v1, :cond_1

    .line 9
    .line 10
    const v0, 0x241200e7

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p1, p0}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰世苏(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    sget-object v1, Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;->DAY:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 22
    .line 23
    if-ne v0, v1, :cond_2

    .line 24
    .line 25
    const v0, 0x241200e6

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-static {p1, p0}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲兰世苏(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    :goto_0
    return-void
.end method

.method public final 飘花落叶言子世苏兰楪哲(Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;)V
    .locals 4

    .line 1
    iput-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪哲世:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 2
    .line 3
    sget-object v0, Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;->YEAR:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 4
    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-ne p1, v0, :cond_0

    .line 9
    .line 10
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰世哲楪:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰世哲楪:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 25
    .line 26
    iget v3, v3, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲兰苏世:I

    .line 27
    .line 28
    iget-object v0, v0, Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 29
    .line 30
    iget-object v0, v0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲兰楪世:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 31
    .line 32
    iget-object v0, v0, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/Month;

    .line 33
    .line 34
    iget v0, v0, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲兰苏世:I

    .line 35
    .line 36
    sub-int/2addr v3, v0

    .line 37
    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;->飘花落叶言子哲世兰苏楪(I)V

    .line 38
    .line 39
    .line 40
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪世兰苏:Landroid/view/View;

    .line 41
    .line 42
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪苏世兰:Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲世楪:Landroid/view/View;

    .line 51
    .line 52
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 53
    .line 54
    .line 55
    iget-object p0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪世苏兰:Landroid/view/View;

    .line 56
    .line 57
    invoke-virtual {p0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    sget-object v0, Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;->DAY:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 62
    .line 63
    if-ne p1, v0, :cond_1

    .line 64
    .line 65
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪世兰苏:Landroid/view/View;

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 68
    .line 69
    .line 70
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪苏世兰:Landroid/view/View;

    .line 71
    .line 72
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 73
    .line 74
    .line 75
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲世楪:Landroid/view/View;

    .line 76
    .line 77
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪世苏兰:Landroid/view/View;

    .line 81
    .line 82
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 83
    .line 84
    .line 85
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世苏哲兰楪(Lcom/google/android/material/datepicker/Month;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子世苏哲兰楪(Lcom/google/android/material/datepicker/Month;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏(Lcom/google/android/material/datepicker/Month;)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    iget-object v2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪兰世苏:Landroid/view/accessibility/AccessibilityManager;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    iput-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 24
    .line 25
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏哲世兰楪(I)V

    .line 28
    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_0
    iget-object v2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 32
    .line 33
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏(Lcom/google/android/material/datepicker/Month;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    sub-int v0, v1, v0

    .line 38
    .line 39
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    const/4 v3, 0x0

    .line 44
    const/4 v4, 0x1

    .line 45
    const/4 v5, 0x3

    .line 46
    if-le v2, v5, :cond_1

    .line 47
    .line 48
    move v2, v4

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    move v2, v3

    .line 51
    :goto_0
    if-lez v0, :cond_2

    .line 52
    .line 53
    move v3, v4

    .line 54
    :cond_2
    iput-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 55
    .line 56
    if-eqz v2, :cond_3

    .line 57
    .line 58
    if-eqz v3, :cond_3

    .line 59
    .line 60
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 61
    .line 62
    add-int/lit8 v0, v1, -0x3

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏哲世兰楪(I)V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 68
    .line 69
    new-instance v0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;

    .line 70
    .line 71
    invoke-direct {v0, p0, v1, v4}, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Object;II)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 75
    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_3
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 79
    .line 80
    if-eqz v2, :cond_4

    .line 81
    .line 82
    add-int/lit8 v0, v1, 0x3

    .line 83
    .line 84
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏哲世兰楪(I)V

    .line 85
    .line 86
    .line 87
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 88
    .line 89
    new-instance v0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;

    .line 90
    .line 91
    invoke-direct {v0, p0, v1, v4}, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Object;II)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    new-instance v0, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;

    .line 99
    .line 100
    invoke-direct {v0, p0, v1, v4}, Landroidx/viewpager2/widget/飘花落叶言子楪哲兰世苏;-><init>(Ljava/lang/Object;II)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 104
    .line 105
    .line 106
    :goto_1
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世哲楪苏兰()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v1}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世哲楪兰苏(I)V

    .line 110
    .line 111
    .line 112
    return-void
.end method

.method public final 飘花落叶言子世苏楪兰哲(Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏世哲;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲楪兰世:Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final 飘花落叶言子楪兰苏哲世(Landroid/os/Bundle;)V
    .locals 2

    .line 1
    const-string v0, "THEME_RES_ID_KEY"

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲世楪兰:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    const-string v0, "GRID_SELECTOR_KEY"

    .line 9
    .line 10
    iget-object v1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲世兰楪:Lcom/google/android/material/datepicker/DateSelector;

    .line 11
    .line 12
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 16
    .line 17
    iget-object v1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲兰楪世:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 18
    .line 19
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 20
    .line 21
    .line 22
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 23
    .line 24
    iget-object v1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲兰世楪:Lcom/google/android/material/datepicker/DayViewDecorator;

    .line 25
    .line 26
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 27
    .line 28
    .line 29
    const-string v0, "CURRENT_MONTH_KEY"

    .line 30
    .line 31
    iget-object p0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 32
    .line 33
    invoke-virtual {p1, v0, p0}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 34
    .line 35
    .line 36
    return-void
.end method

.method public final 飘花落叶言子楪哲兰世苏(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪哲兰世苏(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪兰苏世哲:Landroid/os/Bundle;

    .line 7
    .line 8
    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲世楪兰:I

    .line 15
    .line 16
    const-string v0, "GRID_SELECTOR_KEY"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lcom/google/android/material/datepicker/DateSelector;

    .line 23
    .line 24
    iput-object v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲世兰楪:Lcom/google/android/material/datepicker/DateSelector;

    .line 25
    .line 26
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    check-cast v0, Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲兰楪世:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 35
    .line 36
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 37
    .line 38
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Lcom/google/android/material/datepicker/DayViewDecorator;

    .line 43
    .line 44
    iput-object v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲兰世楪:Lcom/google/android/material/datepicker/DayViewDecorator;

    .line 45
    .line 46
    const-string v0, "CURRENT_MONTH_KEY"

    .line 47
    .line 48
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    check-cast p1, Lcom/google/android/material/datepicker/Month;

    .line 53
    .line 54
    iput-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 55
    .line 56
    return-void
.end method

.method public final 飘花落叶言子楪哲兰苏世(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 9

    .line 1
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世兰苏哲()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    iget v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲世楪兰:I

    .line 8
    .line 9
    invoke-direct {v1, p3, v0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    new-instance p3, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 13
    .line 14
    invoke-direct {p3, v1}, Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object p3, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰世楪哲:Landroidx/recyclerview/widget/飘花落叶言子楪世兰哲苏;

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p3

    .line 27
    const-string v0, "accessibility"

    .line 28
    .line 29
    invoke-virtual {p3, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    check-cast p3, Landroid/view/accessibility/AccessibilityManager;

    .line 34
    .line 35
    iput-object p3, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪兰世苏:Landroid/view/accessibility/AccessibilityManager;

    .line 36
    .line 37
    iget-object p3, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲兰楪世:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 38
    .line 39
    iget-object p3, p3, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/Month;

    .line 40
    .line 41
    const v0, 0x101020d

    .line 42
    .line 43
    .line 44
    invoke-static {v1, v0}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪(Landroid/content/Context;I)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iput-boolean v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲世楪苏兰:Z

    .line 49
    .line 50
    const/4 v7, 0x0

    .line 51
    const/4 v8, 0x1

    .line 52
    if-eqz v0, :cond_0

    .line 53
    .line 54
    const v0, 0x240c00c9

    .line 55
    .line 56
    .line 57
    move v2, v8

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const v0, 0x240c00c4

    .line 60
    .line 61
    .line 62
    move v2, v7

    .line 63
    :goto_0
    invoke-virtual {p1, v0, p2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p0}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世楪哲兰苏()Landroid/content/Context;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object p2

    .line 75
    const v0, 0x240703ce

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    const v3, 0x240703cf

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    add-int/2addr v3, v0

    .line 90
    const v0, 0x240703cd

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    add-int/2addr v0, v3

    .line 98
    const v3, 0x240703be

    .line 99
    .line 100
    .line 101
    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    sget v4, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏世哲兰:I

    .line 106
    .line 107
    const v5, 0x240703b9

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 111
    .line 112
    .line 113
    move-result v5

    .line 114
    mul-int/2addr v5, v4

    .line 115
    sub-int/2addr v4, v8

    .line 116
    const v6, 0x240703cc

    .line 117
    .line 118
    .line 119
    invoke-virtual {p2, v6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 120
    .line 121
    .line 122
    move-result v6

    .line 123
    mul-int/2addr v6, v4

    .line 124
    add-int/2addr v6, v5

    .line 125
    const v4, 0x240703b6

    .line 126
    .line 127
    .line 128
    invoke-virtual {p2, v4}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 129
    .line 130
    .line 131
    move-result p2

    .line 132
    add-int/2addr v0, v3

    .line 133
    add-int/2addr v0, v6

    .line 134
    add-int/2addr v0, p2

    .line 135
    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 136
    .line 137
    .line 138
    const p2, 0x24090218

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    check-cast p2, Landroid/widget/GridView;

    .line 146
    .line 147
    new-instance v0, Landroidx/core/widget/飘花落叶言子楪世哲兰苏;

    .line 148
    .line 149
    invoke-direct {v0, v8}, Landroidx/core/widget/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 150
    .line 151
    .line 152
    invoke-static {p2, v0}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世(Landroid/view/View;Landroidx/core/view/飘花落叶言子楪世苏兰哲;)V

    .line 153
    .line 154
    .line 155
    iget-object v0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲兰楪世:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 156
    .line 157
    iget v0, v0, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪兰世哲苏:I

    .line 158
    .line 159
    new-instance v3, Lcom/google/android/material/datepicker/飘花落叶言子楪苏哲兰世;

    .line 160
    .line 161
    if-lez v0, :cond_1

    .line 162
    .line 163
    invoke-direct {v3, v0}, Lcom/google/android/material/datepicker/飘花落叶言子楪苏哲兰世;-><init>(I)V

    .line 164
    .line 165
    .line 166
    goto :goto_1

    .line 167
    :cond_1
    invoke-direct {v3}, Lcom/google/android/material/datepicker/飘花落叶言子楪苏哲兰世;-><init>()V

    .line 168
    .line 169
    .line 170
    :goto_1
    invoke-virtual {p2, v3}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 171
    .line 172
    .line 173
    iget p3, p3, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪兰世苏哲:I

    .line 174
    .line 175
    invoke-virtual {p2, p3}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2, v7}, Landroid/view/View;->setEnabled(Z)V

    .line 179
    .line 180
    .line 181
    const p2, 0x2409021b

    .line 182
    .line 183
    .line 184
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 185
    .line 186
    .line 187
    move-result-object p2

    .line 188
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 189
    .line 190
    iput-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 191
    .line 192
    new-instance p2, Lcom/google/android/material/datepicker/飘花落叶言子楪苏兰哲世;

    .line 193
    .line 194
    invoke-direct {p2, p0, v2, v2}, Lcom/google/android/material/datepicker/飘花落叶言子楪苏兰哲世;-><init>(Lcom/google/android/material/datepicker/MaterialCalendar;II)V

    .line 195
    .line 196
    .line 197
    iget-object p3, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 198
    .line 199
    invoke-virtual {p3, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)V

    .line 200
    .line 201
    .line 202
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 203
    .line 204
    const-string p3, "MONTHS_VIEW_GROUP_TAG"

    .line 205
    .line 206
    invoke-virtual {p2, p3}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    new-instance v0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;

    .line 210
    .line 211
    iget-object v2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲世兰楪:Lcom/google/android/material/datepicker/DateSelector;

    .line 212
    .line 213
    iget-object v3, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲兰楪世:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 214
    .line 215
    iget-object v4, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲兰世楪:Lcom/google/android/material/datepicker/DayViewDecorator;

    .line 216
    .line 217
    new-instance v5, Lcom/google/android/material/datepicker/飘花落叶言子楪哲世苏兰;

    .line 218
    .line 219
    invoke-direct {v5, p0}, Lcom/google/android/material/datepicker/飘花落叶言子楪哲世苏兰;-><init>(Lcom/google/android/material/datepicker/MaterialCalendar;)V

    .line 220
    .line 221
    .line 222
    new-instance v6, Lcom/google/android/material/datepicker/飘花落叶言子楪哲世兰苏;

    .line 223
    .line 224
    invoke-direct {v6, p0}, Lcom/google/android/material/datepicker/飘花落叶言子楪哲世兰苏;-><init>(Lcom/google/android/material/datepicker/MaterialCalendar;)V

    .line 225
    .line 226
    .line 227
    invoke-direct/range {v0 .. v6}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;-><init>(Landroid/view/ContextThemeWrapper;Lcom/google/android/material/datepicker/DateSelector;Lcom/google/android/material/datepicker/CalendarConstraints;Lcom/google/android/material/datepicker/DayViewDecorator;Lcom/google/android/material/datepicker/飘花落叶言子楪哲世苏兰;Lcom/google/android/material/datepicker/飘花落叶言子楪哲世兰苏;)V

    .line 228
    .line 229
    .line 230
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 231
    .line 232
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    const p3, 0x240a0038

    .line 240
    .line 241
    .line 242
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getInteger(I)I

    .line 243
    .line 244
    .line 245
    move-result p2

    .line 246
    const p3, 0x2409021e

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 254
    .line 255
    iput-object v1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰世哲楪:Landroidx/recyclerview/widget/RecyclerView;

    .line 256
    .line 257
    if-eqz v1, :cond_2

    .line 258
    .line 259
    invoke-virtual {v1, v8}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 260
    .line 261
    .line 262
    iget-object v1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰世哲楪:Landroidx/recyclerview/widget/RecyclerView;

    .line 263
    .line 264
    new-instance v2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 265
    .line 266
    invoke-direct {v2, p2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 267
    .line 268
    .line 269
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)V

    .line 270
    .line 271
    .line 272
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰世哲楪:Landroidx/recyclerview/widget/RecyclerView;

    .line 273
    .line 274
    new-instance v1, Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;

    .line 275
    .line 276
    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;-><init>(Lcom/google/android/material/datepicker/MaterialCalendar;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;)V

    .line 280
    .line 281
    .line 282
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰世哲楪:Landroidx/recyclerview/widget/RecyclerView;

    .line 283
    .line 284
    new-instance v1, Lcom/google/android/material/datepicker/飘花落叶言子楪哲苏世兰;

    .line 285
    .line 286
    invoke-direct {v1, p0}, Lcom/google/android/material/datepicker/飘花落叶言子楪哲苏世兰;-><init>(Lcom/google/android/material/datepicker/MaterialCalendar;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {p2, v1}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子苏楪兰哲世;)V

    .line 290
    .line 291
    .line 292
    :cond_2
    iget-boolean p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲世楪苏兰:Z

    .line 293
    .line 294
    if-nez p2, :cond_3

    .line 295
    .line 296
    new-instance p2, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;

    .line 297
    .line 298
    invoke-direct {p2}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;-><init>()V

    .line 299
    .line 300
    .line 301
    iput-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪兰苏世:Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;

    .line 302
    .line 303
    iget-object v1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 304
    .line 305
    invoke-virtual {p2, v1}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 306
    .line 307
    .line 308
    :cond_3
    const p2, 0x24090212

    .line 309
    .line 310
    .line 311
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    if-eqz v1, :cond_4

    .line 316
    .line 317
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 318
    .line 319
    .line 320
    move-result-object p2

    .line 321
    check-cast p2, Lcom/google/android/material/button/MaterialButton;

    .line 322
    .line 323
    iput-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪苏兰世:Lcom/google/android/material/button/MaterialButton;

    .line 324
    .line 325
    const-string v1, "SELECTOR_TOGGLE_TAG"

    .line 326
    .line 327
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 328
    .line 329
    .line 330
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪苏兰世:Lcom/google/android/material/button/MaterialButton;

    .line 331
    .line 332
    new-instance v1, Lcom/google/android/material/button/飘花落叶言子楪苏哲世兰;

    .line 333
    .line 334
    invoke-direct {v1, p0, v8}, Lcom/google/android/material/button/飘花落叶言子楪苏哲世兰;-><init>(Ljava/lang/Object;I)V

    .line 335
    .line 336
    .line 337
    invoke-static {p2, v1}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世(Landroid/view/View;Landroidx/core/view/飘花落叶言子楪世苏兰哲;)V

    .line 338
    .line 339
    .line 340
    const p2, 0x24090214

    .line 341
    .line 342
    .line 343
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 344
    .line 345
    .line 346
    move-result-object p2

    .line 347
    iput-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲世楪:Landroid/view/View;

    .line 348
    .line 349
    const-string v1, "NAVIGATION_PREV_TAG"

    .line 350
    .line 351
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲世楪:Landroid/view/View;

    .line 355
    .line 356
    const v1, 0x241200e8

    .line 357
    .line 358
    .line 359
    invoke-virtual {p0, v1}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲(I)Ljava/lang/String;

    .line 360
    .line 361
    .line 362
    move-result-object v1

    .line 363
    invoke-static {p2, v1}, Landroidx/appcompat/widget/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世苏哲兰(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 364
    .line 365
    .line 366
    const p2, 0x24090213

    .line 367
    .line 368
    .line 369
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 370
    .line 371
    .line 372
    move-result-object p2

    .line 373
    iput-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪世苏兰:Landroid/view/View;

    .line 374
    .line 375
    const-string v1, "NAVIGATION_NEXT_TAG"

    .line 376
    .line 377
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 378
    .line 379
    .line 380
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪世苏兰:Landroid/view/View;

    .line 381
    .line 382
    const v1, 0x241200e4

    .line 383
    .line 384
    .line 385
    invoke-virtual {p0, v1}, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪苏世兰哲(I)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-static {p2, v1}, Landroidx/appcompat/widget/飘花落叶言子兰哲楪苏世;->飘花落叶言子楪世苏哲兰(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {p1, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 393
    .line 394
    .line 395
    move-result-object p2

    .line 396
    iput-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪世兰苏:Landroid/view/View;

    .line 397
    .line 398
    const p2, 0x24090217

    .line 399
    .line 400
    .line 401
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 402
    .line 403
    .line 404
    move-result-object p2

    .line 405
    iput-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪苏世兰:Landroid/view/View;

    .line 406
    .line 407
    sget-object p2, Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;->DAY:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 408
    .line 409
    invoke-virtual {p0, p2}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世苏兰楪哲(Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;)V

    .line 410
    .line 411
    .line 412
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪苏兰世:Lcom/google/android/material/button/MaterialButton;

    .line 413
    .line 414
    iget-object p3, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 415
    .line 416
    invoke-virtual {p3}, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪世兰苏哲()Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object p3

    .line 420
    invoke-virtual {p2, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 421
    .line 422
    .line 423
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 424
    .line 425
    new-instance p3, Lcom/google/android/material/datepicker/飘花落叶言子楪哲苏兰世;

    .line 426
    .line 427
    invoke-direct {p3, p0, v0}, Lcom/google/android/material/datepicker/飘花落叶言子楪哲苏兰世;-><init>(Lcom/google/android/material/datepicker/MaterialCalendar;Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;)V

    .line 428
    .line 429
    .line 430
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/飘花落叶言子苏哲楪兰世;)V

    .line 431
    .line 432
    .line 433
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪苏兰世:Lcom/google/android/material/button/MaterialButton;

    .line 434
    .line 435
    new-instance p3, Lcom/google/android/material/datepicker/飘花落叶言子楪哲兰世苏;

    .line 436
    .line 437
    invoke-direct {p3, p0}, Lcom/google/android/material/datepicker/飘花落叶言子楪哲兰世苏;-><init>(Lcom/google/android/material/datepicker/MaterialCalendar;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 441
    .line 442
    .line 443
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪世苏兰:Landroid/view/View;

    .line 444
    .line 445
    new-instance p3, Lcom/google/android/material/datepicker/飘花落叶言子楪苏兰世哲;

    .line 446
    .line 447
    invoke-direct {p3, p0, v0, v7}, Lcom/google/android/material/datepicker/飘花落叶言子楪苏兰世哲;-><init>(Lcom/google/android/material/datepicker/MaterialCalendar;Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;I)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 451
    .line 452
    .line 453
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲世楪:Landroid/view/View;

    .line 454
    .line 455
    new-instance p3, Lcom/google/android/material/datepicker/飘花落叶言子楪苏兰世哲;

    .line 456
    .line 457
    invoke-direct {p3, p0, v0, v8}, Lcom/google/android/material/datepicker/飘花落叶言子楪苏兰世哲;-><init>(Lcom/google/android/material/datepicker/MaterialCalendar;Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;I)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 461
    .line 462
    .line 463
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 464
    .line 465
    invoke-virtual {v0, p2}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏(Lcom/google/android/material/datepicker/Month;)I

    .line 466
    .line 467
    .line 468
    move-result p2

    .line 469
    invoke-virtual {p0, p2}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世哲楪兰苏(I)V

    .line 470
    .line 471
    .line 472
    :cond_4
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 473
    .line 474
    iget-object p3, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 475
    .line 476
    invoke-virtual {v0, p3}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世哲苏(Lcom/google/android/material/datepicker/Month;)I

    .line 477
    .line 478
    .line 479
    move-result p3

    .line 480
    invoke-virtual {p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子苏哲世兰楪(I)V

    .line 481
    .line 482
    .line 483
    iget-object p2, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 484
    .line 485
    new-instance p3, Landroidx/core/widget/飘花落叶言子楪世哲兰苏;

    .line 486
    .line 487
    const/4 v0, 0x2

    .line 488
    invoke-direct {p3, v0}, Landroidx/core/widget/飘花落叶言子楪世哲兰苏;-><init>(I)V

    .line 489
    .line 490
    .line 491
    invoke-static {p2, p3}, Landroidx/core/view/飘花落叶言子苏世楪兰哲;->飘花落叶言子楪哲苏兰世(Landroid/view/View;Landroidx/core/view/飘花落叶言子楪世苏兰哲;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世苏兰哲楪(Landroid/view/View;)V

    .line 495
    .line 496
    .line 497
    return-object p1
.end method
