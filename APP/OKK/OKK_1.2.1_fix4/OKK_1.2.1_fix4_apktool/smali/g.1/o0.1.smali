.class public abstract Lg/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf/r;


# static fields
.field public static final w:Ljava/lang/reflect/Method;

.field public static final x:Ljava/lang/reflect/Method;


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Landroid/widget/ListAdapter;

.field public c:Lg/s0;

.field public d:I

.field public e:I

.field public f:I

.field public g:Z

.field public h:Z

.field public i:Z

.field public j:I

.field public k:Lg/l0;

.field public l:Landroid/view/View;

.field public m:Landroid/widget/AdapterView$OnItemClickListener;

.field public final n:Lg/k0;

.field public final o:Lg/n0;

.field public final p:Lg/m0;

.field public final q:Lg/k0;

.field public final r:Landroid/os/Handler;

.field public final s:Landroid/graphics/Rect;

.field public t:Landroid/graphics/Rect;

.field public u:Z

.field public final v:Lg/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Landroid/widget/PopupWindow;

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-gt v1, v2, :cond_0

    :try_start_0
    const-string v1, "setClipToScreenEnabled"

    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    sput-object v1, Lg/o0;->w:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    const-string v1, "setEpicenterBounds"

    const-class v2, Landroid/graphics/Rect;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    sput-object v0, Lg/o0;->x:Ljava/lang/reflect/Method;
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_0
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;II)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x2

    iput v0, p0, Lg/o0;->d:I

    const/4 v0, 0x0

    iput v0, p0, Lg/o0;->j:I

    new-instance v1, Lg/k0;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lg/k0;-><init>(Lg/o0;I)V

    iput-object v1, p0, Lg/o0;->n:Lg/k0;

    new-instance v1, Lg/n0;

    invoke-direct {v1, p0}, Lg/n0;-><init>(Lg/o0;)V

    iput-object v1, p0, Lg/o0;->o:Lg/n0;

    new-instance v1, Lg/m0;

    invoke-direct {v1, p0}, Lg/m0;-><init>(Lg/o0;)V

    iput-object v1, p0, Lg/o0;->p:Lg/m0;

    new-instance v1, Lg/k0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lg/k0;-><init>(Lg/o0;I)V

    iput-object v1, p0, Lg/o0;->q:Lg/k0;

    new-instance v1, Landroid/graphics/Rect;

    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    iput-object v1, p0, Lg/o0;->s:Landroid/graphics/Rect;

    iput-object p1, p0, Lg/o0;->a:Landroid/content/Context;

    new-instance v1, Landroid/os/Handler;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, Lg/o0;->r:Landroid/os/Handler;

    sget-object v1, Lb/a;->l:[I

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v1, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    invoke-virtual {v1, v0, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v3

    iput v3, p0, Lg/o0;->e:I

    const/4 v3, 0x1

    invoke-virtual {v1, v3, v0}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Lg/o0;->f:I

    if-eqz v4, :cond_0

    iput-boolean v3, p0, Lg/o0;->g:Z

    :cond_0
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v1, Lg/y;

    invoke-direct {v1, p1, v2, p2, p3}, Landroid/widget/PopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    sget-object v4, Lb/a;->p:[I

    invoke-virtual {p1, v2, v4, p2, p3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p2

    const/4 p3, 0x2

    invoke-virtual {p2, p3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p2, p3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p3

    invoke-static {v1, p3}, LJ/m;->c(Landroid/widget/PopupWindow;Z)V

    :cond_1
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result p3

    if-eqz p3, :cond_2

    invoke-virtual {p2, v0, v0}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result p3

    if-eqz p3, :cond_2

    invoke-static {p1, p3}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    goto :goto_0

    :cond_2
    invoke-virtual {p2, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    :goto_0
    invoke-virtual {v1, p1}, Landroid/widget/PopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    invoke-virtual {p2}, Landroid/content/res/TypedArray;->recycle()V

    iput-object v1, p0, Lg/o0;->v:Lg/y;

    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/ListAdapter;)V
    .locals 2

    iget-object v0, p0, Lg/o0;->k:Lg/l0;

    if-nez v0, :cond_0

    new-instance v0, Lg/l0;

    invoke-direct {v0, p0}, Lg/l0;-><init>(Lg/o0;)V

    iput-object v0, p0, Lg/o0;->k:Lg/l0;

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lg/o0;->b:Landroid/widget/ListAdapter;

    if-eqz v1, :cond_1

    invoke-interface {v1, v0}, Landroid/widget/Adapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_1
    :goto_0
    iput-object p1, p0, Lg/o0;->b:Landroid/widget/ListAdapter;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lg/o0;->k:Lg/l0;

    invoke-interface {p1, v0}, Landroid/widget/Adapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    :cond_2
    iget-object p1, p0, Lg/o0;->c:Lg/s0;

    if-eqz p1, :cond_3

    iget-object v0, p0, Lg/o0;->b:Landroid/widget/ListAdapter;

    invoke-virtual {p1, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    :cond_3
    return-void
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lg/o0;->v:Lg/y;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    return v0
.end method

.method public final dismiss()V
    .locals 2

    iget-object v0, p0, Lg/o0;->v:Lg/y;

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    iput-object v1, p0, Lg/o0;->c:Lg/s0;

    iget-object v0, p0, Lg/o0;->r:Landroid/os/Handler;

    iget-object v1, p0, Lg/o0;->n:Lg/k0;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final e()Landroid/widget/ListView;
    .locals 1

    iget-object v0, p0, Lg/o0;->c:Lg/s0;

    return-object v0
.end method

.method public final f()V
    .locals 11

    iget-object v0, p0, Lg/o0;->c:Lg/s0;

    iget-object v1, p0, Lg/o0;->v:Lg/y;

    iget-object v2, p0, Lg/o0;->a:Landroid/content/Context;

    const/4 v3, 0x1

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lg/o0;->u:Z

    xor-int/2addr v0, v3

    move-object v4, p0

    check-cast v4, Lg/t0;

    new-instance v5, Lg/s0;

    invoke-direct {v5, v2, v0}, Lg/s0;-><init>(Landroid/content/Context;Z)V

    invoke-virtual {v5, v4}, Lg/s0;->setHoverListener(Lg/p0;)V

    iput-object v5, p0, Lg/o0;->c:Lg/s0;

    iget-object v0, p0, Lg/o0;->b:Landroid/widget/ListAdapter;

    invoke-virtual {v5, v0}, Landroid/widget/AbsListView;->setAdapter(Landroid/widget/ListAdapter;)V

    iget-object v0, p0, Lg/o0;->c:Lg/s0;

    iget-object v4, p0, Lg/o0;->m:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v4}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    iget-object v0, p0, Lg/o0;->c:Lg/s0;

    invoke-virtual {v0, v3}, Landroid/view/View;->setFocusable(Z)V

    iget-object v0, p0, Lg/o0;->c:Lg/s0;

    invoke-virtual {v0, v3}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    iget-object v0, p0, Lg/o0;->c:Lg/s0;

    new-instance v4, Lg/h0;

    invoke-direct {v4, p0}, Lg/h0;-><init>(Lg/o0;)V

    invoke-virtual {v0, v4}, Landroid/widget/AdapterView;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    iget-object v0, p0, Lg/o0;->c:Lg/s0;

    iget-object v4, p0, Lg/o0;->p:Lg/m0;

    invoke-virtual {v0, v4}, Landroid/widget/AbsListView;->setOnScrollListener(Landroid/widget/AbsListView$OnScrollListener;)V

    iget-object v0, p0, Lg/o0;->c:Lg/s0;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setContentView(Landroid/view/View;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    :goto_0
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v4, p0, Lg/o0;->s:Landroid/graphics/Rect;

    const/4 v5, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    iget v0, v4, Landroid/graphics/Rect;->top:I

    iget v6, v4, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v6, v0

    iget-boolean v7, p0, Lg/o0;->g:Z

    if-nez v7, :cond_2

    neg-int v0, v0

    iput v0, p0, Lg/o0;->f:I

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Landroid/graphics/Rect;->setEmpty()V

    move v6, v5

    :cond_2
    :goto_1
    invoke-virtual {v1}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    move-result v0

    const/4 v7, 0x2

    if-ne v0, v7, :cond_3

    move v0, v3

    goto :goto_2

    :cond_3
    move v0, v5

    :goto_2
    iget-object v7, p0, Lg/o0;->l:Landroid/view/View;

    iget v8, p0, Lg/o0;->f:I

    invoke-static {v1, v7, v8, v0}, Lg/i0;->a(Landroid/widget/PopupWindow;Landroid/view/View;IZ)I

    move-result v0

    iget v7, p0, Lg/o0;->d:I

    const/4 v8, -0x2

    const/4 v9, -0x1

    if-eq v7, v8, :cond_5

    const/high16 v10, 0x40000000    # 2.0f

    if-eq v7, v9, :cond_4

    invoke-static {v7, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v7, v4, Landroid/graphics/Rect;->left:I

    iget v4, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v7, v4

    sub-int/2addr v2, v7

    invoke-static {v2, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    goto :goto_3

    :cond_5
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    iget v7, v4, Landroid/graphics/Rect;->left:I

    iget v4, v4, Landroid/graphics/Rect;->right:I

    add-int/2addr v7, v4

    sub-int/2addr v2, v7

    const/high16 v4, -0x80000000

    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    :goto_3
    iget-object v4, p0, Lg/o0;->c:Lg/s0;

    invoke-virtual {v4, v2, v0}, Lg/c0;->a(II)I

    move-result v0

    if-lez v0, :cond_6

    iget-object v2, p0, Lg/o0;->c:Lg/s0;

    invoke-virtual {v2}, Landroid/view/View;->getPaddingTop()I

    move-result v2

    iget-object v4, p0, Lg/o0;->c:Lg/s0;

    invoke-virtual {v4}, Landroid/view/View;->getPaddingBottom()I

    move-result v4

    add-int/2addr v4, v2

    add-int v5, v4, v6

    :cond_6
    add-int/2addr v0, v5

    iget-object v2, p0, Lg/o0;->v:Lg/y;

    invoke-virtual {v2}, Landroid/widget/PopupWindow;->getInputMethodMode()I

    const/16 v2, 0x3ea

    invoke-static {v1, v2}, LJ/m;->d(Landroid/widget/PopupWindow;I)V

    invoke-virtual {v1}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v2

    if-eqz v2, :cond_c

    iget-object v2, p0, Lg/o0;->l:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->isAttachedToWindow()Z

    move-result v2

    if-nez v2, :cond_7

    return-void

    :cond_7
    iget v2, p0, Lg/o0;->d:I

    if-ne v2, v9, :cond_8

    move v2, v9

    goto :goto_4

    :cond_8
    if-ne v2, v8, :cond_9

    iget-object v2, p0, Lg/o0;->l:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    :cond_9
    :goto_4
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    iget-object v3, p0, Lg/o0;->l:Landroid/view/View;

    iget v4, p0, Lg/o0;->e:I

    iget v5, p0, Lg/o0;->f:I

    if-gez v2, :cond_a

    move v6, v9

    goto :goto_5

    :cond_a
    move v6, v2

    :goto_5
    if-gez v0, :cond_b

    move v0, v9

    :cond_b
    move-object v2, v3

    move v3, v4

    move v4, v5

    move v5, v6

    move v6, v0

    invoke-virtual/range {v1 .. v6}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    goto/16 :goto_9

    :cond_c
    iget v2, p0, Lg/o0;->d:I

    if-ne v2, v9, :cond_d

    move v2, v9

    goto :goto_6

    :cond_d
    if-ne v2, v8, :cond_e

    iget-object v2, p0, Lg/o0;->l:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    :cond_e
    :goto_6
    invoke-virtual {v1, v2}, Landroid/widget/PopupWindow;->setWidth(I)V

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setHeight(I)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1c

    if-gt v0, v2, :cond_f

    sget-object v0, Lg/o0;->w:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_10

    :try_start_0
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :cond_f
    invoke-static {v1, v3}, Lg/j0;->b(Landroid/widget/PopupWindow;Z)V

    :catch_0
    :cond_10
    :goto_7
    invoke-virtual {v1, v3}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    iget-object v0, p0, Lg/o0;->o:Lg/n0;

    invoke-virtual {v1, v0}, Landroid/widget/PopupWindow;->setTouchInterceptor(Landroid/view/View$OnTouchListener;)V

    iget-boolean v0, p0, Lg/o0;->i:Z

    if-eqz v0, :cond_11

    iget-boolean v0, p0, Lg/o0;->h:Z

    invoke-static {v1, v0}, LJ/m;->c(Landroid/widget/PopupWindow;Z)V

    :cond_11
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-gt v0, v2, :cond_12

    sget-object v0, Lg/o0;->x:Ljava/lang/reflect/Method;

    if-eqz v0, :cond_13

    :try_start_1
    iget-object v2, p0, Lg/o0;->t:Landroid/graphics/Rect;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_8

    :cond_12
    iget-object v0, p0, Lg/o0;->t:Landroid/graphics/Rect;

    invoke-static {v1, v0}, Lg/j0;->a(Landroid/widget/PopupWindow;Landroid/graphics/Rect;)V

    :catch_1
    :cond_13
    :goto_8
    iget-object v0, p0, Lg/o0;->l:Landroid/view/View;

    iget v2, p0, Lg/o0;->e:I

    iget v4, p0, Lg/o0;->f:I

    iget v5, p0, Lg/o0;->j:I

    invoke-virtual {v1, v0, v2, v4, v5}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;III)V

    iget-object v0, p0, Lg/o0;->c:Lg/s0;

    invoke-virtual {v0, v9}, Landroid/widget/AdapterView;->setSelection(I)V

    iget-boolean v0, p0, Lg/o0;->u:Z

    if-eqz v0, :cond_14

    iget-object v0, p0, Lg/o0;->c:Lg/s0;

    invoke-virtual {v0}, Lg/c0;->isInTouchMode()Z

    move-result v0

    if-eqz v0, :cond_15

    :cond_14
    iget-object v0, p0, Lg/o0;->c:Lg/s0;

    if-eqz v0, :cond_15

    invoke-virtual {v0, v3}, Lg/c0;->setListSelectionHidden(Z)V

    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    :cond_15
    iget-boolean v0, p0, Lg/o0;->u:Z

    if-nez v0, :cond_16

    iget-object v0, p0, Lg/o0;->r:Landroid/os/Handler;

    iget-object v1, p0, Lg/o0;->q:Lg/k0;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_16
    :goto_9
    return-void
.end method
