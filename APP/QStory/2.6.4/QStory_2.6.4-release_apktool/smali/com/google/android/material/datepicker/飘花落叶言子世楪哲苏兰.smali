.class public final Lcom/google/android/material/datepicker/飘花落叶言子世楪哲苏兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;

.field public final synthetic 飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/MaterialCalendarGridView;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;Lcom/google/android/material/datepicker/MaterialCalendarGridView;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/MaterialCalendarGridView;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->飘花落叶言子楪世苏兰哲()Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-virtual {p2}, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲苏兰()I

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    if-lt p3, p4, :cond_1

    .line 12
    .line 13
    invoke-virtual {p2}, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世兰哲苏()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    if-gt p3, p2, :cond_1

    .line 18
    .line 19
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪哲苏兰;->飘花落叶言子楪哲兰世苏:Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;

    .line 20
    .line 21
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪苏世哲兰:Lcom/google/android/material/datepicker/飘花落叶言子楪哲世苏兰;

    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendarGridView;->飘花落叶言子楪世苏兰哲()Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1, p3}, Lcom/google/android/material/datepicker/飘花落叶言子世楪苏哲兰;->飘花落叶言子楪世哲兰苏(I)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪世苏哲兰:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 36
    .line 37
    iget-object p3, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲兰楪世:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 38
    .line 39
    iget-object p3, p3, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪哲兰苏世:Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;

    .line 40
    .line 41
    invoke-interface {p3, p1, p2}, Lcom/google/android/material/datepicker/CalendarConstraints$DateValidator;->飘花落叶言子世楪哲兰苏(J)Z

    .line 42
    .line 43
    .line 44
    move-result p3

    .line 45
    if-eqz p3, :cond_1

    .line 46
    .line 47
    iget-object p3, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲世兰楪:Lcom/google/android/material/datepicker/DateSelector;

    .line 48
    .line 49
    invoke-interface {p3, p1, p2}, Lcom/google/android/material/datepicker/DateSelector;->飘花落叶言子世哲兰苏楪(J)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰哲苏;->飘花落叶言子苏哲楪兰世:Ljava/util/LinkedHashSet;

    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 59
    .line 60
    .line 61
    move-result p2

    .line 62
    if-eqz p2, :cond_0

    .line 63
    .line 64
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    check-cast p2, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏世哲;

    .line 69
    .line 70
    iget-object p3, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲世兰楪:Lcom/google/android/material/datepicker/DateSelector;

    .line 71
    .line 72
    invoke-interface {p3}, Lcom/google/android/material/datepicker/DateSelector;->飘花落叶言子世苏哲兰楪()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    invoke-virtual {p2, p3}, Lcom/google/android/material/datepicker/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 81
    .line 82
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p1}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰哲苏()V

    .line 87
    .line 88
    .line 89
    iget-object p0, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰世哲楪:Landroidx/recyclerview/widget/RecyclerView;

    .line 90
    .line 91
    if-eqz p0, :cond_1

    .line 92
    .line 93
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Landroidx/recyclerview/widget/飘花落叶言子世兰哲楪苏;->飘花落叶言子楪世兰哲苏()V

    .line 98
    .line 99
    .line 100
    :cond_1
    return-void
.end method
