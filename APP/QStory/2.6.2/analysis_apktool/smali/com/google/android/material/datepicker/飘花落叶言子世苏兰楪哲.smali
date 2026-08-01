.class public final Lcom/google/android/material/datepicker/飘花落叶言子世苏兰楪哲;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic 飘花落叶言子楪哲兰世苏:Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;

    .line 5
    .line 6
    iput p2, p0, Lcom/google/android/material/datepicker/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲苏兰世:I

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲兰世苏:Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/google/android/material/datepicker/飘花落叶言子世哲楪苏兰;->飘花落叶言子楪世哲兰苏:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 4
    .line 5
    iget-object v0, p1, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 6
    .line 7
    iget v0, v0, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲兰世苏:I

    .line 8
    .line 9
    iget p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪哲苏兰世:I

    .line 10
    .line 11
    invoke-static {p0, v0}, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪世哲苏兰(II)Lcom/google/android/material/datepicker/Month;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v0, p1, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏哲兰楪世:Lcom/google/android/material/datepicker/CalendarConstraints;

    .line 16
    .line 17
    iget-object v1, v0, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪哲兰世苏:Lcom/google/android/material/datepicker/Month;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/google/android/material/datepicker/CalendarConstraints;->飘花落叶言子楪哲苏兰世:Lcom/google/android/material/datepicker/Month;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲苏兰世:Ljava/util/Calendar;

    .line 22
    .line 23
    iget-object v3, v0, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲苏兰世:Ljava/util/Calendar;

    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-gez v3, :cond_0

    .line 30
    .line 31
    move-object p0, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    iget-object v0, v1, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪哲苏兰世:Ljava/util/Calendar;

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Ljava/util/Calendar;->compareTo(Ljava/util/Calendar;)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-lez v0, :cond_1

    .line 40
    .line 41
    move-object p0, v1

    .line 42
    :cond_1
    :goto_0
    invoke-virtual {p1, p0}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世苏哲兰楪(Lcom/google/android/material/datepicker/Month;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;->DAY:Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世苏兰楪哲(Lcom/google/android/material/datepicker/MaterialCalendar$CalendarSelector;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p1, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪苏兰世:Lcom/google/android/material/button/MaterialButton;

    .line 51
    .line 52
    if-eqz p0, :cond_2

    .line 53
    .line 54
    const/16 p1, 0x8

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 57
    .line 58
    .line 59
    :cond_2
    return-void
.end method
