.class public final LLq;
.super Luv;
.source ""


# instance fields
.field public final synthetic a:Lcom/google/android/material/datepicker/c;

.field public final synthetic b:LMq;


# direct methods
.method public constructor <init>(LMq;Lcom/google/android/material/datepicker/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LLq;->b:LMq;

    iput-object p2, p0, LLq;->a:Lcom/google/android/material/datepicker/c;

    return-void
.end method


# virtual methods
.method public final onScrolled(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 5

    iget-object p1, p0, LLq;->a:Lcom/google/android/material/datepicker/c;

    iget-object p1, p1, Lcom/google/android/material/datepicker/c;->a:LD6;

    iget-object p3, p0, LLq;->b:LMq;

    if-gez p2, :cond_0

    iget-object p2, p3, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/i;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result p2

    goto :goto_0

    :cond_0
    iget-object p2, p3, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/i;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {p2}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result p2

    :goto_0
    iget-object v0, p1, LD6;->a:Lgs;

    iget-object v0, v0, Lgs;->a:Ljava/util/Calendar;

    invoke-static {v0}, LqD;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1, p2}, Ljava/util/Calendar;->add(II)V

    new-instance v2, Lgs;

    invoke-direct {v2, v0}, Lgs;-><init>(Ljava/util/Calendar;)V

    iput-object v2, p3, LMq;->W:Lgs;

    iget-object v0, p3, LMq;->f0:Lcom/google/android/material/button/MaterialButton;

    iget-object v3, p1, LD6;->a:Lgs;

    iget-object v3, v3, Lgs;->a:Ljava/util/Calendar;

    invoke-static {v3}, LqD;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3, v1, p2}, Ljava/util/Calendar;->add(II)V

    const/4 p2, 0x5

    const/4 v4, 0x1

    invoke-virtual {v3, p2, v4}, Ljava/util/Calendar;->set(II)V

    invoke-static {v3}, LqD;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->get(I)I

    invoke-virtual {v3, v4}, Ljava/util/Calendar;->get(I)I

    const/4 v1, 0x7

    invoke-virtual {v3, v1}, Ljava/util/Calendar;->getMaximum(I)I

    invoke-virtual {v3, p2}, Ljava/util/Calendar;->getActualMaximum(I)I

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    invoke-virtual {v3}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v3

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p2

    sget-object v1, LqD;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const-string v1, "yMMMM"

    invoke-static {v1, p2}, Landroid/icu/text/DateFormat;->getInstanceForSkeleton(Ljava/lang/String;Ljava/util/Locale;)Landroid/icu/text/DateFormat;

    move-result-object p2

    const-string v1, "UTC"

    invoke-static {v1}, Landroid/icu/util/TimeZone;->getTimeZone(Ljava/lang/String;)Landroid/icu/util/TimeZone;

    move-result-object v1

    invoke-virtual {p2, v1}, Landroid/icu/text/DateFormat;->setTimeZone(Landroid/icu/util/TimeZone;)V

    sget-object v1, Landroid/icu/text/DisplayContext;->CAPITALIZATION_FOR_STANDALONE:Landroid/icu/text/DisplayContext;

    invoke-virtual {p2, v1}, Landroid/icu/text/DateFormat;->setContext(Landroid/icu/text/DisplayContext;)V

    new-instance v1, Ljava/util/Date;

    invoke-direct {v1, v3, v4}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {p2, v1}, Landroid/icu/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p1, p1, LD6;->a:Lgs;

    invoke-virtual {p1, v2}, Lgs;->d(Lgs;)I

    move-result p1

    invoke-virtual {p3, p1}, LMq;->E(I)V

    return-void
.end method
