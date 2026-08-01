.class public final Lcom/google/android/material/datepicker/飘花落叶言子楪哲苏兰世;
.super Landroidx/recyclerview/widget/飘花落叶言子苏哲楪兰世;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪世苏兰哲:Lcom/google/android/material/datepicker/MaterialCalendar;

.field public final synthetic 飘花落叶言子楪世苏哲兰:Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;


# direct methods
.method public constructor <init>(Lcom/google/android/material/datepicker/MaterialCalendar;Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 2
    .line 3
    iget-object p3, p1, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    .line 5
    if-gez p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 12
    .line 13
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世哲楪苏()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {p3}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 23
    .line 24
    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->飘花落叶言子兰世哲苏楪()I

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    :goto_0
    iget-object p3, p1, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪兰苏世:Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;

    .line 29
    .line 30
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;

    .line 31
    .line 32
    if-nez p3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, p2}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世苏哲(I)Lcom/google/android/material/datepicker/Month;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    iput-object p3, p1, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 39
    .line 40
    :cond_1
    iget-object p3, p1, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪苏兰世:Lcom/google/android/material/button/MaterialButton;

    .line 41
    .line 42
    invoke-virtual {p0, p2}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世苏哲(I)Lcom/google/android/material/datepicker/Month;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪世兰苏哲()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p3, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, p2}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世哲楪兰苏(I)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final 飘花落叶言子楪世苏哲兰(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 1

    .line 1
    if-nez p2, :cond_3

    .line 2
    .line 3
    iget-object p1, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏兰哲:Lcom/google/android/material/datepicker/MaterialCalendar;

    .line 4
    .line 5
    iget-object p2, p1, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪兰苏世:Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget-object v0, p1, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰哲楪世:Landroidx/recyclerview/widget/RecyclerView;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 17
    .line 18
    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/飘花落叶言子世兰楪哲苏;->飘花落叶言子楪世兰苏哲(Landroidx/recyclerview/widget/飘花落叶言子苏世哲楪兰;)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    if-eqz p2, :cond_2

    .line 23
    .line 24
    invoke-static {p2}, Landroidx/recyclerview/widget/RecyclerView;->飘花落叶言子世哲兰楪苏(Landroid/view/View;)Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    const/4 v0, -0x1

    .line 29
    if-eqz p2, :cond_1

    .line 30
    .line 31
    invoke-virtual {p2}, Landroidx/recyclerview/widget/飘花落叶言子哲楪苏世兰;->getAbsoluteAdapterPosition()I

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move p2, v0

    .line 37
    :goto_0
    if-eq p2, v0, :cond_2

    .line 38
    .line 39
    iget-object p0, p0, Lcom/google/android/material/datepicker/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰:Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;

    .line 40
    .line 41
    invoke-virtual {p0, p2}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世苏哲(I)Lcom/google/android/material/datepicker/Month;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    iput-object v0, p1, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子苏兰楪世哲:Lcom/google/android/material/datepicker/Month;

    .line 46
    .line 47
    iget-object v0, p1, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子哲楪苏兰世:Lcom/google/android/material/button/MaterialButton;

    .line 48
    .line 49
    invoke-virtual {p0, p2}, Lcom/google/android/material/datepicker/飘花落叶言子世楪兰苏哲;->飘花落叶言子楪兰世苏哲(I)Lcom/google/android/material/datepicker/Month;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-virtual {p0}, Lcom/google/android/material/datepicker/Month;->飘花落叶言子楪世兰苏哲()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p2}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世哲楪兰苏(I)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-virtual {p1}, Lcom/google/android/material/datepicker/MaterialCalendar;->飘花落叶言子世哲楪苏兰()V

    .line 64
    .line 65
    .line 66
    :cond_3
    :goto_1
    return-void
.end method
