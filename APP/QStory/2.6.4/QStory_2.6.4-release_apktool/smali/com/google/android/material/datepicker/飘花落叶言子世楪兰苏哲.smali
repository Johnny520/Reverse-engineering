.class public final Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;
.super Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子楪世兰哲苏:Lcom/google/android/material/datepicker/DayViewDecorator;

.field public final 飘花落叶言子楪世兰苏哲:Lcom/google/android/material/datepicker/DateSelector;

.field public final 飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/CalendarConstraints;

.field public final 飘花落叶言子楪苏世兰哲:Lcom/google/android/material/datepicker/飘花落叶言子楪哲世兰苏;

.field public final 飘花落叶言子楪苏世哲兰:Lcom/google/android/material/datepicker/飘花落叶言子楪哲世苏兰;

.field public 飘花落叶言子楪苏兰世哲:I

.field public final 飘花落叶言子楪苏哲世兰:I

.field public 飘花落叶言子楪苏哲兰世:Lcom/google/android/material/datepicker/Month;


# direct methods
.method public constructor <init>(Landroid/view/ContextThemeWrapper;Lcom/google/android/material/datepicker/DateSelector;Lcom/google/android/material/datepicker/CalendarConstraints;Lcom/google/android/material/datepicker/DayViewDecorator;Lcom/google/android/material/datepicker/飘花落叶言子楪哲世苏兰;Lcom/google/android/material/datepicker/飘花落叶言子楪哲世兰苏;)V
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏兰世哲:I

    .line 6
    .line 7
    iget-object v1, p3, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/Month;

    .line 8
    .line 9
    iget-object v2, p3, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪哲兰世苏:Lcom/google/android/material/datepicker/Month;

    .line 10
    .line 11
    iget-object v3, p3, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪兰世苏哲:Lcom/google/android/material/datepicker/Month;

    .line 12
    .line 13
    iget-object v1, v1, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲苏兰世:Ljava/util/Calendar;

    .line 14
    .line 15
    iget-object v4, v3, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲苏兰世:Ljava/util/Calendar;

    .line 16
    .line 17
    invoke-virtual {v1, v4}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/4 v4, 0x0

    .line 22
    if-gtz v1, :cond_3

    .line 23
    .line 24
    iget-object v1, v3, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲苏兰世:Ljava/util/Calendar;

    .line 25
    .line 26
    iget-object v2, v2, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲苏兰世:Ljava/util/Calendar;

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-gtz v1, :cond_2

    .line 33
    .line 34
    sget v1, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏世哲兰:I

    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const v5, 0x240703b9

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    mul-int/2addr v2, v1

    .line 48
    const v1, 0x101020d

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v1}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪(Landroid/content/Context;I)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_0

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {p1, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    :cond_0
    add-int/2addr v2, v0

    .line 66
    iput v2, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏哲世兰:I

    .line 67
    .line 68
    iput-object p3, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 69
    .line 70
    iput-object p2, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰苏哲:Lcom/google/android/material/datepicker/DateSelector;

    .line 71
    .line 72
    iput-object p4, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰哲苏:Lcom/google/android/material/datepicker/DayViewDecorator;

    .line 73
    .line 74
    iput-object p5, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏世哲兰:Lcom/google/android/material/datepicker/飘花落叶言子楪哲世苏兰;

    .line 75
    .line 76
    iput-object p6, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏世兰哲:Lcom/google/android/material/datepicker/飘花落叶言子楪哲世兰苏;

    .line 77
    .line 78
    iput-object v3, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏哲兰世:Lcom/google/android/material/datepicker/Month;

    .line 79
    .line 80
    iget-object p1, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏哲兰:Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲苏楪;->飘花落叶言子楪世苏哲兰()Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-nez p1, :cond_1

    .line 87
    .line 88
    const/4 p1, 0x1

    .line 89
    iput-boolean p1, p0, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世苏兰哲:Z

    .line 90
    .line 91
    return-void

    .line 92
    :cond_1
    const-string p0, "Cannot change whether this adapter has stable IDs while the adapter has registered observers."

    .line 93
    .line 94
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    throw v4

    .line 98
    :cond_2
    const-string p0, "currentPage cannot be after lastPage"

    .line 99
    .line 100
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw v4

    .line 104
    :cond_3
    const-string p0, "firstPage cannot be after currentPage"

    .line 105
    .line 106
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    throw v4
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏(I)J
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/Month;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲苏兰世:Ljava/util/Calendar;

    .line 6
    .line 7
    invoke-static {p0}, Lcom/google/android/material/datepicker/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-virtual {p0, v0, p1}, Ljava/util/Calendar;->add(II)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Lcom/google/android/material/datepicker/Month;

    .line 16
    .line 17
    invoke-direct {p1, p0}, Lcom/google/android/material/datepicker/Month;-><init>(Ljava/util/Calendar;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p1, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲苏兰世:Ljava/util/Calendar;

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 23
    .line 24
    .line 25
    move-result-wide p0

    .line 26
    return-wide p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 2
    .line 3
    iget p0, p0, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪兰苏哲世:I

    .line 4
    .line 5
    return p0
.end method

.method public final 飘花落叶言子楪兰世哲苏(Lcom/google/android/material/datepicker/Month;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/Month;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪苏世哲兰(Lcom/google/android/material/datepicker/Month;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final 飘花落叶言子楪兰世苏哲(I)Lcom/google/android/material/datepicker/Month;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 2
    .line 3
    iget-object p0, p0, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/Month;

    .line 4
    .line 5
    iget-object p0, p0, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲苏兰世:Ljava/util/Calendar;

    .line 6
    .line 7
    invoke-static {p0}, Lcom/google/android/material/datepicker/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const/4 v0, 0x2

    .line 12
    invoke-virtual {p0, v0, p1}, Ljava/util/Calendar;->add(II)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Lcom/google/android/material/datepicker/Month;

    .line 16
    .line 17
    invoke-direct {p1, p0}, Lcom/google/android/material/datepicker/Month;-><init>(Ljava/util/Calendar;)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method

.method public final 飘花落叶言子楪哲世苏兰(ILandroid/view/ViewGroup;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;
    .locals 2

    .line 1
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const v0, 0x240c00c6

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    check-cast p1, Landroid/widget/LinearLayout;

    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    const v0, 0x101020d

    .line 24
    .line 25
    .line 26
    invoke-static {p2, v0}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪(Landroid/content/Context;I)Z

    .line 27
    .line 28
    .line 29
    move-result p2

    .line 30
    if-eqz p2, :cond_0

    .line 31
    .line 32
    new-instance p2, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;

    .line 33
    .line 34
    const/4 v0, -0x1

    .line 35
    iget p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏哲世兰:I

    .line 36
    .line 37
    invoke-direct {p2, v0, p0}, Landroidx/recyclerview/widget/飘花落叶言子苏世哲兰楪;-><init>(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 41
    .line 42
    .line 43
    new-instance p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲兰苏;

    .line 44
    .line 45
    const/4 p2, 0x1

    .line 46
    invoke-direct {p0, p1, p2}, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲兰苏;-><init>(Landroid/widget/LinearLayout;Z)V

    .line 47
    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_0
    new-instance p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲兰苏;

    .line 51
    .line 52
    invoke-direct {p0, p1, v1}, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲兰苏;-><init>(Landroid/widget/LinearLayout;Z)V

    .line 53
    .line 54
    .line 55
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲(Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;I)V
    .locals 6

    .line 1
    check-cast p1, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲兰苏;

    .line 2
    .line 3
    iget-object v0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 4
    .line 5
    iget-object v1, v0, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/Month;

    .line 6
    .line 7
    iget-object v1, v1, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲苏兰世:Ljava/util/Calendar;

    .line 8
    .line 9
    invoke-static {v1}, Lcom/google/android/material/datepicker/飘花落叶言子世苏哲兰楪;->飘花落叶言子楪世哲苏兰(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-virtual {v1, v2, p2}, Ljava/util/Calendar;->add(II)V

    .line 15
    .line 16
    .line 17
    new-instance p2, Lcom/google/android/material/datepicker/Month;

    .line 18
    .line 19
    invoke-direct {p2, v1}, Lcom/google/android/material/datepicker/Month;-><init>(Ljava/util/Calendar;)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p1, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏哲兰:Landroid/widget/TextView;

    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪世兰苏哲()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 29
    .line 30
    .line 31
    iget-object v1, p1, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲兰苏;->飘花落叶言子楪世苏兰哲:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 32
    .line 33
    const v2, 0x24090210

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    check-cast v1, Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 41
    .line 42
    invoke-virtual {v1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->飘花落叶言子楪世苏兰哲()Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->飘花落叶言子楪世苏兰哲()Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    iget-object v2, v2, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏哲兰:Lcom/google/android/material/datepicker/Month;

    .line 53
    .line 54
    invoke-virtual {p2, v2}, Lcom/google/android/material/datepicker/Month;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_2

    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->飘花落叶言子楪世苏兰哲()Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    iget-object v2, v0, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世苏兰哲:Lcom/google/android/material/datepicker/DateSelector;

    .line 68
    .line 69
    iget-object v3, v0, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/Collection;

    .line 70
    .line 71
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    if-eqz v4, :cond_0

    .line 80
    .line 81
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    check-cast v4, Ljava/lang/Long;

    .line 86
    .line 87
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 88
    .line 89
    .line 90
    move-result-wide v4

    .line 91
    invoke-virtual {v0, v1, v4, v5}, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏世兰哲(Lcom/google/android/material/datepicker/MaterialCalendarGridView;J)V

    .line 92
    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    if-eqz v2, :cond_3

    .line 96
    .line 97
    invoke-interface {v2}, Lcom/google/android/material/datepicker/DateSelector;->飘花落叶言子世苏楪哲兰()Ljava/util/ArrayList;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_1

    .line 110
    .line 111
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, Ljava/lang/Long;

    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 118
    .line 119
    .line 120
    move-result-wide v4

    .line 121
    invoke-virtual {v0, v1, v4, v5}, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪苏世兰哲(Lcom/google/android/material/datepicker/MaterialCalendarGridView;J)V

    .line 122
    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_1
    invoke-interface {v2}, Lcom/google/android/material/datepicker/DateSelector;->飘花落叶言子世苏楪哲兰()Ljava/util/ArrayList;

    .line 126
    .line 127
    .line 128
    move-result-object v2

    .line 129
    iput-object v2, v0, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/Collection;

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_2
    new-instance v2, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;

    .line 133
    .line 134
    iget-object v3, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰苏哲:Lcom/google/android/material/datepicker/DateSelector;

    .line 135
    .line 136
    iget-object v4, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪世兰哲苏:Lcom/google/android/material/datepicker/DayViewDecorator;

    .line 137
    .line 138
    invoke-direct {v2, p2, v3, v0, v4}, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;-><init>(Lcom/google/android/material/datepicker/Month;Lcom/google/android/material/datepicker/DateSelector;Lcom/google/android/material/datepicker/CalendarConstraints;Lcom/google/android/material/datepicker/DayViewDecorator;)V

    .line 139
    .line 140
    .line 141
    iget v0, p2, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪兰世苏哲:I

    .line 142
    .line 143
    invoke-virtual {v1, v0}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v2}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 147
    .line 148
    .line 149
    :cond_3
    :goto_2
    new-instance v0, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲苏兰;

    .line 150
    .line 151
    invoke-direct {v0, p0, v1}, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲苏兰;-><init>(Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;Lcom/google/android/material/datepicker/MaterialCalendarGridView;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1, v0}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 155
    .line 156
    .line 157
    iget-object v0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏世兰哲:Lcom/google/android/material/datepicker/飘花落叶言子楪哲世兰苏;

    .line 158
    .line 159
    invoke-virtual {v1, v0}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->setOnMonthNavigationListener(Lcom/google/android/material/datepicker/飘花落叶言子楪哲兰苏世;)V

    .line 160
    .line 161
    .line 162
    iget-object p1, p1, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->itemView:Landroid/view/View;

    .line 163
    .line 164
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    const v0, 0x101020d

    .line 169
    .line 170
    .line 171
    invoke-static {p1, v0}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏哲世;->飘花落叶言子世苏兰哲楪(Landroid/content/Context;I)Z

    .line 172
    .line 173
    .line 174
    move-result p1

    .line 175
    const/4 v0, 0x0

    .line 176
    if-nez p1, :cond_5

    .line 177
    .line 178
    iget-object v2, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏哲兰世:Lcom/google/android/material/datepicker/Month;

    .line 179
    .line 180
    invoke-virtual {p2, v2}, Lcom/google/android/material/datepicker/Month;->equals(Ljava/lang/Object;)Z

    .line 181
    .line 182
    .line 183
    move-result v2

    .line 184
    if-eqz v2, :cond_4

    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_4
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusable(Z)V

    .line 188
    .line 189
    .line 190
    const/high16 v2, 0x60000

    .line 191
    .line 192
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 193
    .line 194
    .line 195
    goto :goto_4

    .line 196
    :cond_5
    :goto_3
    const/4 v2, 0x1

    .line 197
    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 198
    .line 199
    .line 200
    const/high16 v2, 0x20000

    .line 201
    .line 202
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 203
    .line 204
    .line 205
    :goto_4
    if-nez p1, :cond_6

    .line 206
    .line 207
    iget-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏哲兰世:Lcom/google/android/material/datepicker/Month;

    .line 208
    .line 209
    invoke-virtual {p2, p1}, Lcom/google/android/material/datepicker/Month;->equals(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result p1

    .line 213
    if-eqz p1, :cond_6

    .line 214
    .line 215
    iget p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏兰世哲:I

    .line 216
    .line 217
    iput v0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏兰世哲:I

    .line 218
    .line 219
    new-instance p2, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏兰哲;

    .line 220
    .line 221
    invoke-direct {p2, p0, v1, p1}, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏兰哲;-><init>(Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;Lcom/google/android/material/datepicker/MaterialCalendarGridView;I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 225
    .line 226
    .line 227
    :cond_6
    return-void
.end method
