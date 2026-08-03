.class public final LMq;
.super LNt;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "LNt;"
    }
.end annotation


# instance fields
.field public U:I

.field public V:LD6;

.field public W:Lgs;

.field public X:I

.field public Y:LP3;

.field public Z:Landroidx/recyclerview/widget/RecyclerView;

.field public a0:Landroidx/recyclerview/widget/RecyclerView;

.field public b0:Landroid/view/View;

.field public c0:Landroid/view/View;

.field public d0:Landroid/view/View;

.field public e0:Landroid/view/View;

.field public f0:Lcom/google/android/material/button/MaterialButton;

.field public g0:Landroid/view/accessibility/AccessibilityManager;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LNt;-><init>()V

    return-void
.end method


# virtual methods
.method public final C(Lgs;)V
    .locals 6

    iget-object v0, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/g;

    move-result-object v0

    check-cast v0, Lcom/google/android/material/datepicker/c;

    iget-object v1, v0, Lcom/google/android/material/datepicker/c;->a:LD6;

    iget-object v1, v1, LD6;->a:Lgs;

    invoke-virtual {v1, p1}, Lgs;->d(Lgs;)I

    move-result v1

    iget-object v2, p0, LMq;->g0:Landroid/view/accessibility/AccessibilityManager;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v2

    if-eqz v2, :cond_0

    iput-object p1, p0, LMq;->W:Lgs;

    iget-object p1, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    goto :goto_1

    :cond_0
    iget-object v2, p0, LMq;->W:Lgs;

    iget-object v0, v0, Lcom/google/android/material/datepicker/c;->a:LD6;

    iget-object v0, v0, LD6;->a:Lgs;

    invoke-virtual {v0, v2}, Lgs;->d(Lgs;)I

    move-result v0

    sub-int v0, v1, v0

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x3

    if-le v2, v5, :cond_1

    move v2, v4

    goto :goto_0

    :cond_1
    move v2, v3

    :goto_0
    if-lez v0, :cond_2

    move v3, v4

    :cond_2
    iput-object p1, p0, LMq;->W:Lgs;

    if-eqz v2, :cond_3

    if-eqz v3, :cond_3

    iget-object p1, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    add-int/lit8 v0, v1, -0x3

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    iget-object p1, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, LH6;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, p0}, LH6;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_3
    if-eqz v2, :cond_4

    iget-object p1, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    add-int/lit8 v0, v1, 0x3

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    iget-object p1, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, LH6;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, p0}, LH6;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    goto :goto_1

    :cond_4
    iget-object p1, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, LH6;

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2, p0}, LH6;-><init>(IILjava/lang/Object;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :goto_1
    invoke-virtual {p0, v1}, LMq;->E(I)V

    return-void
.end method

.method public final D(I)V
    .locals 4

    iput p1, p0, LMq;->X:I

    const/4 v0, 0x2

    const/16 v1, 0x8

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    iget-object p1, p0, LMq;->Z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/i;

    move-result-object p1

    iget-object v0, p0, LMq;->Z:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/g;

    move-result-object v0

    check-cast v0, LkG;

    iget-object v3, p0, LMq;->W:Lgs;

    iget v3, v3, Lgs;->c:I

    iget-object v0, v0, LkG;->a:LMq;

    iget-object v0, v0, LMq;->V:LD6;

    iget-object v0, v0, LD6;->a:Lgs;

    iget v0, v0, Lgs;->c:I

    sub-int/2addr v3, v0

    invoke-virtual {p1, v3}, Landroidx/recyclerview/widget/i;->scrollToPosition(I)V

    iget-object p1, p0, LMq;->d0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LMq;->e0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LMq;->b0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LMq;->c0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    iget-object p1, p0, LMq;->d0:Landroid/view/View;

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LMq;->e0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LMq;->b0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LMq;->c0:Landroid/view/View;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, LMq;->W:Lgs;

    invoke-virtual {p0, p1}, LMq;->C(Lgs;)V

    :cond_1
    return-void
.end method

.method public final E(I)V
    .locals 5

    iget-object v0, p0, LMq;->c0:Landroid/view/View;

    add-int/lit8 v1, p1, 0x1

    iget-object v2, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/g;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/recyclerview/widget/g;->getItemCount()I

    move-result v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ge v1, v2, :cond_0

    move v1, v4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    iget-object v0, p0, LMq;->b0:Landroid/view/View;

    sub-int/2addr p1, v4

    if-ltz p1, :cond_1

    move v3, v4

    :cond_1
    invoke-virtual {v0, v3}, Landroid/view/View;->setEnabled(Z)V

    return-void
.end method

.method public final n(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lhi;->n(Landroid/os/Bundle;)V

    if-nez p1, :cond_0

    iget-object p1, p0, Lhi;->f:Landroid/os/Bundle;

    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, LMq;->U:I

    const-string v0, "GRID_SELECTOR_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    if-nez v0, :cond_2

    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, LD6;

    iput-object v0, p0, LMq;->V:LD6;

    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    if-nez v0, :cond_1

    const-string v0, "CURRENT_MONTH_KEY"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Lgs;

    iput-object p1, p0, LMq;->W:Lgs;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    throw p1
.end method

.method public final o(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    new-instance v0, Landroid/view/ContextThemeWrapper;

    invoke-virtual {p0}, Lhi;->d()Landroid/content/Context;

    move-result-object v1

    iget v2, p0, LMq;->U:I

    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    new-instance v1, LP3;

    invoke-direct {v1, v0}, LP3;-><init>(Landroid/content/Context;)V

    iput-object v1, p0, LMq;->Y:LP3;

    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-virtual {p0}, Lhi;->y()Landroid/content/Context;

    move-result-object v1

    const-string v2, "accessibility"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/accessibility/AccessibilityManager;

    iput-object v1, p0, LMq;->g0:Landroid/view/accessibility/AccessibilityManager;

    iget-object v1, p0, LMq;->V:LD6;

    iget-object v1, v1, LD6;->a:Lgs;

    const v2, 0x101020d

    invoke-static {v0, v2}, LSq;->F(Landroid/content/Context;I)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_0

    const v3, 0x550d0060

    move v6, v5

    goto :goto_0

    :cond_0
    const v3, 0x550d005b

    move v6, v4

    :goto_0
    invoke-virtual {p1, v3, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0}, Lhi;->y()Landroid/content/Context;

    move-result-object p2

    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p2

    const v3, 0x55070394

    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    const v7, 0x55070395

    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v7

    add-int/2addr v7, v3

    const v3, 0x55070393

    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v3

    add-int/2addr v3, v7

    const v7, 0x55070384

    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    sget v8, Lhs;->d:I

    const v9, 0x5507037f

    invoke-virtual {p2, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v9

    mul-int/2addr v9, v8

    sub-int/2addr v8, v5

    const v10, 0x55070392

    invoke-virtual {p2, v10}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v10

    mul-int/2addr v10, v8

    add-int/2addr v10, v9

    const v8, 0x5507037c

    invoke-virtual {p2, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result p2

    add-int/2addr v3, v7

    add-int/2addr v3, v10

    add-int/2addr v3, p2

    invoke-virtual {p1, v3}, Landroid/view/View;->setMinimumHeight(I)V

    const p2, 0x550a0168

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroid/widget/GridView;

    new-instance v3, LIq;

    const/4 v7, 0x0

    invoke-direct {v3, v7}, LIq;-><init>(I)V

    invoke-static {p2, v3}, LlE;->l(Landroid/view/View;LP;)V

    iget-object v3, p0, LMq;->V:LD6;

    iget v3, v3, LD6;->e:I

    new-instance v7, LBc;

    if-lez v3, :cond_1

    invoke-direct {v7, v3}, LBc;-><init>(I)V

    goto :goto_1

    :cond_1
    invoke-direct {v7}, LBc;-><init>()V

    :goto_1
    invoke-virtual {p2, v7}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget v1, v1, Lgs;->d:I

    invoke-virtual {p2, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    invoke-virtual {p2, v4}, Landroid/view/View;->setEnabled(Z)V

    const p2, 0x550a016b

    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p2

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    iput-object p2, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance p2, LJq;

    invoke-direct {p2, p0, v6, v6}, LJq;-><init>(LMq;II)V

    iget-object v1, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/i;)V

    iget-object p2, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    const-string v1, "MONTHS_VIEW_GROUP_TAG"

    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    new-instance p2, Lcom/google/android/material/datepicker/c;

    iget-object v1, p0, LMq;->V:LD6;

    new-instance v3, LXm;

    const/4 v4, 0x4

    invoke-direct {v3, v4, p0}, LXm;-><init>(ILjava/lang/Object;)V

    invoke-direct {p2, v0, v1, v3}, Lcom/google/android/material/datepicker/c;-><init>(Landroid/view/ContextThemeWrapper;LD6;LXm;)V

    iget-object v1, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/g;)V

    invoke-virtual {v0}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v3, 0x550b0037

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v1

    const v3, 0x550a016e

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    iput-object v4, p0, LMq;->Z:Landroidx/recyclerview/widget/RecyclerView;

    if-eqz v4, :cond_2

    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    iget-object v4, p0, LMq;->Z:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v6, Landroidx/recyclerview/widget/GridLayoutManager;

    invoke-direct {v6, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/i;)V

    iget-object v1, p0, LMq;->Z:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v4, LkG;

    invoke-direct {v4, p0}, LkG;-><init>(LMq;)V

    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/g;)V

    iget-object v1, p0, LMq;->Z:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v4, LKq;

    invoke-direct {v4, p0}, LKq;-><init>(LMq;)V

    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Lmv;)V

    :cond_2
    const v1, 0x550a0162

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    iget-object v6, p2, Lcom/google/android/material/datepicker/c;->a:LD6;

    if-eqz v4, :cond_3

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    iput-object v1, p0, LMq;->f0:Lcom/google/android/material/button/MaterialButton;

    const-string v4, "SELECTOR_TOGGLE_TAG"

    invoke-virtual {v1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    iget-object v1, p0, LMq;->f0:Lcom/google/android/material/button/MaterialButton;

    new-instance v4, Lh8;

    const/4 v7, 0x2

    invoke-direct {v4, v7, p0}, Lh8;-><init>(ILjava/lang/Object;)V

    invoke-static {v1, v4}, LlE;->l(Landroid/view/View;LP;)V

    const v1, 0x550a0164

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, LMq;->b0:Landroid/view/View;

    const-string v4, "NAVIGATION_PREV_TAG"

    invoke-virtual {v1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    const v1, 0x550a0163

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, LMq;->c0:Landroid/view/View;

    const-string v4, "NAVIGATION_NEXT_TAG"

    invoke-virtual {v1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, LMq;->d0:Landroid/view/View;

    const v1, 0x550a0167

    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    iput-object v1, p0, LMq;->e0:Landroid/view/View;

    invoke-virtual {p0, v5}, LMq;->D(I)V

    iget-object v1, p0, LMq;->f0:Lcom/google/android/material/button/MaterialButton;

    iget-object v3, p0, LMq;->W:Lgs;

    invoke-virtual {v3}, Lgs;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v1, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v3, LLq;

    invoke-direct {v3, p0, p2}, LLq;-><init>(LMq;Lcom/google/android/material/datepicker/c;)V

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Luv;)V

    iget-object v1, p0, LMq;->f0:Lcom/google/android/material/button/MaterialButton;

    new-instance v3, Lp0;

    const/4 v4, 0x3

    invoke-direct {v3, v4, p0}, Lp0;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, LMq;->c0:Landroid/view/View;

    new-instance v3, LHq;

    const/4 v4, 0x1

    invoke-direct {v3, p0, p2, v4}, LHq;-><init>(LMq;Lcom/google/android/material/datepicker/c;I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v1, p0, LMq;->b0:Landroid/view/View;

    new-instance v3, LHq;

    const/4 v4, 0x0

    invoke-direct {v3, p0, p2, v4}, LHq;-><init>(LMq;Lcom/google/android/material/datepicker/c;I)V

    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p2, p0, LMq;->W:Lgs;

    iget-object v1, v6, LD6;->a:Lgs;

    invoke-virtual {v1, p2}, Lgs;->d(Lgs;)I

    move-result p2

    invoke-virtual {p0, p2}, LMq;->E(I)V

    :cond_3
    invoke-static {v0, v2}, LSq;->F(Landroid/content/Context;I)Z

    move-result p2

    if-nez p2, :cond_4

    new-instance p2, LCt;

    invoke-direct {p2}, LCy;-><init>()V

    iget-object v0, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2, v0}, LCy;->attachToRecyclerView(Landroidx/recyclerview/widget/RecyclerView;)V

    :cond_4
    iget-object p2, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v0, p0, LMq;->W:Lgs;

    iget-object v1, v6, LD6;->a:Lgs;

    invoke-virtual {v1, v0}, Lgs;->d(Lgs;)I

    move-result v0

    invoke-virtual {p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->scrollToPosition(I)V

    iget-object p2, p0, LMq;->a0:Landroidx/recyclerview/widget/RecyclerView;

    new-instance v0, LIq;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, LIq;-><init>(I)V

    invoke-static {p2, v0}, LlE;->l(Landroid/view/View;LP;)V

    return-object p1
.end method

.method public final t(Landroid/os/Bundle;)V
    .locals 3

    const-string v0, "THEME_RES_ID_KEY"

    iget v1, p0, LMq;->U:I

    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    const-string v0, "GRID_SELECTOR_KEY"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    iget-object v2, p0, LMq;->V:LD6;

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    const-string v0, "CURRENT_MONTH_KEY"

    iget-object v1, p0, LMq;->W:Lgs;

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    return-void
.end method
