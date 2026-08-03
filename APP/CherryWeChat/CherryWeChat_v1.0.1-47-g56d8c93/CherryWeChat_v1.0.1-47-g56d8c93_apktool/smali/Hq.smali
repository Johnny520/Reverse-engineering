.class public final LHq;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(LMq;Lcom/google/android/material/datepicker/c;I)V
    .locals 0

    .line 1
    iput p3, p0, LHq;->a:I

    iput-object p1, p0, LHq;->c:Ljava/lang/Object;

    iput-object p2, p0, LHq;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LwB;)V
    .locals 3

    const/4 v0, 0x2

    iput v0, p0, LHq;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LHq;->c:Ljava/lang/Object;

    .line 3
    new-instance v0, Lw0;

    iget-object v1, p1, LwB;->a:Landroidx/appcompat/widget/Toolbar;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    iget-object p1, p1, LwB;->h:Ljava/lang/CharSequence;

    .line 4
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/16 v2, 0x1000

    .line 5
    iput v2, v0, Lw0;->e:I

    .line 6
    iput v2, v0, Lw0;->g:I

    const/4 v2, 0x0

    .line 7
    iput-object v2, v0, Lw0;->l:Landroid/content/res/ColorStateList;

    .line 8
    iput-object v2, v0, Lw0;->m:Landroid/graphics/PorterDuff$Mode;

    const/4 v2, 0x0

    .line 9
    iput-boolean v2, v0, Lw0;->n:Z

    .line 10
    iput-boolean v2, v0, Lw0;->o:Z

    const/16 v2, 0x10

    .line 11
    iput v2, v0, Lw0;->p:I

    .line 12
    iput-object v1, v0, Lw0;->i:Landroid/content/Context;

    .line 13
    iput-object p1, v0, Lw0;->a:Ljava/lang/CharSequence;

    .line 14
    iput-object v0, p0, LHq;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    iget p1, p0, LHq;->a:I

    packed-switch p1, :pswitch_data_0

    iget-object p1, p0, LHq;->c:Ljava/lang/Object;

    check-cast p1, LwB;

    iget-object v0, p1, LwB;->k:Landroid/view/Window$Callback;

    if-eqz v0, :cond_0

    iget-boolean p1, p1, LwB;->l:Z

    if-eqz p1, :cond_0

    iget-object p1, p0, LHq;->b:Ljava/lang/Object;

    check-cast p1, Lw0;

    const/4 v1, 0x0

    invoke-interface {v0, v1, p1}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    :cond_0
    return-void

    :pswitch_0
    iget-object p1, p0, LHq;->c:Ljava/lang/Object;

    check-cast p1, LMq;

    iget-object v0, p1, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/i;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    move-result v0

    iget-object v1, p0, LHq;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/material/datepicker/c;

    add-int/lit8 v0, v0, 0x1

    iget-object v1, v1, Lcom/google/android/material/datepicker/c;->a:LD6;

    iget-object v1, v1, LD6;->a:Lgs;

    iget-object v1, v1, Lgs;->a:Ljava/util/Calendar;

    invoke-static {v1}, LqD;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    new-instance v0, Lgs;

    invoke-direct {v0, v1}, Lgs;-><init>(Ljava/util/Calendar;)V

    invoke-virtual {p1, v0}, LMq;->C(Lgs;)V

    return-void

    :pswitch_1
    iget-object p1, p0, LHq;->c:Ljava/lang/Object;

    check-cast p1, LMq;

    iget-object v0, p1, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/i;

    move-result-object v0

    check-cast v0, Landroidx/recyclerview/widget/LinearLayoutManager;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/LinearLayoutManager;->findLastVisibleItemPosition()I

    move-result v0

    iget-object v1, p0, LHq;->b:Ljava/lang/Object;

    check-cast v1, Lcom/google/android/material/datepicker/c;

    add-int/lit8 v0, v0, -0x1

    iget-object v1, v1, Lcom/google/android/material/datepicker/c;->a:LD6;

    iget-object v1, v1, LD6;->a:Lgs;

    iget-object v1, v1, Lgs;->a:Ljava/util/Calendar;

    invoke-static {v1}, LqD;->a(Ljava/util/Calendar;)Ljava/util/Calendar;

    move-result-object v1

    const/4 v2, 0x2

    invoke-virtual {v1, v2, v0}, Ljava/util/Calendar;->add(II)V

    new-instance v0, Lgs;

    invoke-direct {v0, v1}, Lgs;-><init>(Ljava/util/Calendar;)V

    invoke-virtual {p1, v0}, LMq;->C(Lgs;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
