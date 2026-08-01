.class public final Lcom/google/android/material/datepicker/飘花落叶言子楪哲兰世苏;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/MaterialCalendar;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/MaterialCalendar;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪哲世:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 4
    .line 5
    sget-object v0, Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;->YEAR:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 6
    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    sget-object p1, Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;->DAY:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世苏兰楪哲(Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;)V

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    sget-object v1, Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;->DAY:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 16
    .line 17
    if-ne p1, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世苏兰楪哲(Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;)V

    .line 20
    .line 21
    .line 22
    :cond_1
    :goto_0
    iget-object p1, p0, Landroidx/fragment/app/飘花落叶言子楪兰苏哲世;->飘花落叶言子世兰苏哲楪:Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世苏兰哲楪(Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
