.class public final LJ0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LU/v;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LJ0/d;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LJ0/d;->b:Ljava/lang/Object;

    .line 3
    new-instance p1, LU/b;

    invoke-direct {p1}, LU/b;-><init>()V

    iput-object p1, p0, LJ0/d;->c:Ljava/lang/Object;

    .line 4
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LJ0/d;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LY/v;Lx0/e;Landroidx/emoji2/text/g;Ljava/util/Set;)V
    .locals 7

    const/4 v0, 0x3

    iput v0, p0, LJ0/d;->a:I

    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    iput-object p2, p0, LJ0/d;->b:Ljava/lang/Object;

    .line 25
    iput-object p1, p0, LJ0/d;->c:Ljava/lang/Object;

    .line 26
    iput-object p3, p0, LJ0/d;->d:Ljava/lang/Object;

    .line 27
    invoke-interface {p4}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_1

    .line 28
    :cond_0
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, [I

    .line 29
    new-instance v1, Ljava/lang/String;

    array-length p3, p2

    const/4 p4, 0x0

    invoke-direct {v1, p2, p4, p3}, Ljava/lang/String;-><init>([III)V

    .line 30
    new-instance v6, LD/d;

    const/16 p2, 0xd

    invoke-direct {v6, p2, v1}, LD/d;-><init>(ILjava/lang/Object;)V

    .line 31
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v2, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x1

    move-object v0, p0

    invoke-virtual/range {v0 .. v6}, LJ0/d;->t(Ljava/lang/CharSequence;IIIZLandroidx/emoji2/text/o;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LJ0/d;->a:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, LJ0/d;->b:Ljava/lang/Object;

    .line 11
    iput-object p2, p0, LJ0/d;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LJ0/d;->a:I

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, LJ0/d;->b:Ljava/lang/Object;

    .line 7
    iput-object p2, p0, LJ0/d;->c:Ljava/lang/Object;

    .line 8
    iput-object p3, p0, LJ0/d;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln/e;)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LJ0/d;->a:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, LJ0/d;->b:Ljava/lang/Object;

    .line 14
    new-instance v0, Lo/b;

    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    iput-object v0, p0, LJ0/d;->c:Ljava/lang/Object;

    .line 17
    iput-object p1, p0, LJ0/d;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lx0/e;)V
    .locals 1

    const/4 p1, 0x1

    iput p1, p0, LJ0/d;->a:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    new-instance p1, LC/b;

    const/16 v0, 0x1e

    invoke-direct {p1, v0}, LC/b;-><init>(I)V

    iput-object p1, p0, LJ0/d;->b:Ljava/lang/Object;

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LJ0/d;->c:Ljava/lang/Object;

    .line 21
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LJ0/d;->d:Ljava/lang/Object;

    .line 22
    new-instance p1, Lx0/e;

    const/16 v0, 0xc

    invoke-direct {p1, v0, p0}, Lx0/e;-><init>(ILjava/lang/Object;)V

    return-void
.end method

.method public static c(Landroid/text/Editable;Landroid/view/KeyEvent;Z)Z
    .locals 7

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result p1

    invoke-static {p1}, Landroid/view/KeyEvent;->metaStateHasNoModifiers(I)Z

    move-result p1

    const/4 v0, 0x1

    xor-int/2addr p1, v0

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    return v1

    :cond_0
    invoke-static {p0}, Landroid/text/Selection;->getSelectionStart(Ljava/lang/CharSequence;)I

    move-result p1

    invoke-static {p0}, Landroid/text/Selection;->getSelectionEnd(Ljava/lang/CharSequence;)I

    move-result v2

    const/4 v3, -0x1

    if-eq p1, v3, :cond_6

    if-eq v2, v3, :cond_6

    if-eq p1, v2, :cond_1

    goto :goto_1

    :cond_1
    const-class v3, Landroidx/emoji2/text/w;

    invoke-interface {p0, p1, v2, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroidx/emoji2/text/w;

    if-eqz v2, :cond_6

    array-length v3, v2

    if-lez v3, :cond_6

    array-length v3, v2

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_6

    aget-object v5, v2, v4

    invoke-interface {p0, v5}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v6

    invoke-interface {p0, v5}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v5

    if-eqz p2, :cond_2

    if-eq v6, p1, :cond_4

    :cond_2
    if-nez p2, :cond_3

    if-eq v5, p1, :cond_4

    :cond_3
    if-le p1, v6, :cond_5

    if-ge p1, v5, :cond_5

    :cond_4
    invoke-interface {p0, v6, v5}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    return v0

    :cond_5
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_6
    :goto_1
    return v1
.end method

.method public static s(Landroid/content/Context;Landroid/util/AttributeSet;[III)LJ0/d;
    .locals 1

    new-instance v0, LJ0/d;

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {v0, p0, p1}, LJ0/d;-><init>(Landroid/content/Context;Landroid/content/res/TypedArray;)V

    return-object v0
.end method


# virtual methods
.method public a(Landroid/view/View;IZ)V
    .locals 2

    iget-object v0, p0, LJ0/d;->b:Ljava/lang/Object;

    check-cast v0, LU/v;

    if-gez p2, :cond_0

    iget-object p2, v0, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, LJ0/d;->k(I)I

    move-result p2

    :goto_0
    iget-object v1, p0, LJ0/d;->c:Ljava/lang/Object;

    check-cast v1, LU/b;

    invoke-virtual {v1, p2, p3}, LU/b;->e(IZ)V

    if-eqz p3, :cond_1

    invoke-virtual {p0, p1}, LJ0/d;->p(Landroid/view/View;)V

    :cond_1
    iget-object p3, v0, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p3, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->u(Landroid/view/View;)LU/O;

    return-void
.end method

.method public b(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V
    .locals 2

    iget-object v0, p0, LJ0/d;->b:Ljava/lang/Object;

    check-cast v0, LU/v;

    if-gez p2, :cond_0

    iget-object p2, v0, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p2}, LJ0/d;->k(I)I

    move-result p2

    :goto_0
    iget-object v1, p0, LJ0/d;->c:Ljava/lang/Object;

    check-cast v1, LU/b;

    invoke-virtual {v1, p2, p4}, LU/b;->e(IZ)V

    if-eqz p4, :cond_1

    invoke-virtual {p0, p1}, LJ0/d;->p(Landroid/view/View;)V

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->u(Landroid/view/View;)LU/O;

    iget-object p4, v0, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-static {p4, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public d(I)V
    .locals 2

    invoke-virtual {p0, p1}, LJ0/d;->k(I)I

    move-result p1

    iget-object v0, p0, LJ0/d;->c:Ljava/lang/Object;

    check-cast v0, LU/b;

    invoke-virtual {v0, p1}, LU/b;->f(I)Z

    iget-object v0, p0, LJ0/d;->b:Ljava/lang/Object;

    check-cast v0, LU/v;

    iget-object v0, v0, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->u(Landroid/view/View;)LU/O;

    :cond_0
    invoke-static {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->b(Landroidx/recyclerview/widget/RecyclerView;I)V

    return-void
.end method

.method public e(II)I
    .locals 3

    iget-object v0, p0, LJ0/d;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    :goto_0
    if-ge p2, v1, :cond_0

    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LU/a;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    return p1
.end method

.method public f(I)Landroid/view/View;
    .locals 1

    invoke-virtual {p0, p1}, LJ0/d;->k(I)I

    move-result p1

    iget-object v0, p0, LJ0/d;->b:Ljava/lang/Object;

    check-cast v0, LU/v;

    iget-object v0, v0, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public g()I
    .locals 2

    iget-object v0, p0, LJ0/d;->b:Ljava/lang/Object;

    check-cast v0, LU/v;

    iget-object v0, v0, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    iget-object v1, p0, LJ0/d;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v0, v1

    return v0
.end method

.method public h(I)Landroid/content/res/ColorStateList;
    .locals 3

    iget-object v0, p0, LJ0/d;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object v2, p0, LJ0/d;->b:Ljava/lang/Object;

    check-cast v2, Landroid/content/Context;

    invoke-static {v2, v1}, Lf0/P;->p(Landroid/content/Context;I)Landroid/content/res/ColorStateList;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    return-object p1
.end method

.method public i(I)Landroid/graphics/drawable/Drawable;
    .locals 2

    iget-object v0, p0, LJ0/d;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, LJ0/d;->b:Ljava/lang/Object;

    check-cast p1, Landroid/content/Context;

    invoke-static {p1, v1}, LU/S;->w(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {v0, p1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    return-object p1
.end method

.method public j(IILg/B;)Landroid/graphics/Typeface;
    .locals 9

    iget-object v0, p0, LJ0/d;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    const/4 p1, 0x0

    if-nez v3, :cond_0

    return-object p1

    :cond_0
    iget-object v0, p0, LJ0/d;->d:Ljava/lang/Object;

    check-cast v0, Landroid/util/TypedValue;

    if-nez v0, :cond_1

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iput-object v0, p0, LJ0/d;->d:Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, LJ0/d;->d:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Landroid/util/TypedValue;

    sget-object v0, Lu/m;->a:Ljava/lang/ThreadLocal;

    iget-object v0, p0, LJ0/d;->b:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 v8, 0x0

    const/4 v7, 0x1

    move v5, p2

    move-object v6, p3

    invoke-static/range {v2 .. v8}, Lu/m;->b(Landroid/content/Context;ILandroid/util/TypedValue;ILu/b;ZZ)Landroid/graphics/Typeface;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public k(I)I
    .locals 5

    const/4 v0, -0x1

    if-gez p1, :cond_0

    return v0

    :cond_0
    iget-object v1, p0, LJ0/d;->b:Ljava/lang/Object;

    check-cast v1, LU/v;

    iget-object v1, v1, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    move v2, p1

    :goto_0
    if-ge v2, v1, :cond_3

    iget-object v3, p0, LJ0/d;->c:Ljava/lang/Object;

    check-cast v3, LU/b;

    invoke-virtual {v3, v2}, LU/b;->b(I)I

    move-result v4

    sub-int v4, v2, v4

    sub-int v4, p1, v4

    if-nez v4, :cond_2

    :goto_1
    invoke-virtual {v3, v2}, LU/b;->d(I)Z

    move-result p1

    if-eqz p1, :cond_1

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return v2

    :cond_2
    add-int/2addr v2, v4

    goto :goto_0

    :cond_3
    return v0
.end method

.method public l(I)Landroid/view/View;
    .locals 1

    iget-object v0, p0, LJ0/d;->b:Ljava/lang/Object;

    check-cast v0, LU/v;

    iget-object v0, v0, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public m()I
    .locals 1

    iget-object v0, p0, LJ0/d;->b:Ljava/lang/Object;

    check-cast v0, LU/v;

    iget-object v0, v0, LU/v;->a:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    return v0
.end method

.method public n(Ljava/lang/CharSequence;IILandroidx/emoji2/text/v;)Z
    .locals 7

    const/4 v0, 0x1

    iget v1, p4, Landroidx/emoji2/text/v;->c:I

    and-int/lit8 v1, v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-nez v1, :cond_4

    iget-object v1, p0, LJ0/d;->d:Ljava/lang/Object;

    check-cast v1, Landroidx/emoji2/text/g;

    invoke-virtual {p4}, Landroidx/emoji2/text/v;->c()LM/a;

    move-result-object v4

    const/16 v5, 0x8

    invoke-virtual {v4, v5}, LD/D;->a(I)I

    move-result v5

    if-eqz v5, :cond_0

    iget-object v6, v4, LD/D;->d:Ljava/lang/Object;

    check-cast v6, Ljava/nio/ByteBuffer;

    iget v4, v4, LD/D;->a:I

    add-int/2addr v5, v4

    invoke-virtual {v6, v5}, Ljava/nio/ByteBuffer;->getShort(I)S

    :cond_0
    check-cast v1, Landroidx/emoji2/text/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Landroidx/emoji2/text/d;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v5}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->setLength(I)V

    :goto_0
    if-ge p2, p3, :cond_2

    invoke-interface {p1, p2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/2addr p2, v0

    goto :goto_0

    :cond_2
    iget-object p1, v1, Landroidx/emoji2/text/d;->a:Landroid/text/TextPaint;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    sget p3, Lv/e;->a:I

    invoke-static {p1, p2}, Lv/d;->a(Landroid/graphics/Paint;Ljava/lang/String;)Z

    move-result p1

    iget p2, p4, Landroidx/emoji2/text/v;->c:I

    and-int/lit8 p2, p2, 0x4

    if-eqz p1, :cond_3

    or-int/lit8 p1, p2, 0x2

    goto :goto_1

    :cond_3
    or-int/lit8 p1, p2, 0x1

    :goto_1
    iput p1, p4, Landroidx/emoji2/text/v;->c:I

    :cond_4
    iget p1, p4, Landroidx/emoji2/text/v;->c:I

    and-int/lit8 p1, p1, 0x3

    if-ne p1, v2, :cond_5

    goto :goto_2

    :cond_5
    move v0, v3

    :goto_2
    return v0
.end method

.method public o()Z
    .locals 1

    iget-object v0, p0, LJ0/d;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LJ0/d;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v0, p0, LJ0/d;->b:Ljava/lang/Object;

    check-cast v0, LU/v;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->u(Landroid/view/View;)LU/O;

    return-void
.end method

.method public q(Landroid/view/View;)Z
    .locals 1

    iget-object v0, p0, LJ0/d;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public r(Lp/f;Ln/d;Z)Z
    .locals 6

    iget-object v0, p2, Ln/d;->c0:[I

    const/4 v1, 0x0

    aget v2, v0, v1

    iget-object v3, p0, LJ0/d;->c:Ljava/lang/Object;

    check-cast v3, Lo/b;

    iput v2, v3, Lo/b;->a:I

    const/4 v2, 0x1

    aget v0, v0, v2

    iput v0, v3, Lo/b;->b:I

    invoke-virtual {p2}, Ln/d;->l()I

    move-result v0

    iput v0, v3, Lo/b;->c:I

    invoke-virtual {p2}, Ln/d;->i()I

    move-result v0

    iput v0, v3, Lo/b;->d:I

    iput-boolean v1, v3, Lo/b;->i:Z

    iput-boolean p3, v3, Lo/b;->j:Z

    iget p3, v3, Lo/b;->a:I

    const/4 v0, 0x3

    if-ne p3, v0, :cond_0

    move p3, v2

    goto :goto_0

    :cond_0
    move p3, v1

    :goto_0
    iget v4, v3, Lo/b;->b:I

    if-ne v4, v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const/4 v4, 0x0

    if-eqz p3, :cond_2

    iget p3, p2, Ln/d;->L:F

    cmpl-float p3, p3, v4

    if-lez p3, :cond_2

    move p3, v2

    goto :goto_2

    :cond_2
    move p3, v1

    :goto_2
    if-eqz v0, :cond_3

    iget v0, p2, Ln/d;->L:F

    cmpl-float v0, v0, v4

    if-lez v0, :cond_3

    move v0, v2

    goto :goto_3

    :cond_3
    move v0, v1

    :goto_3
    iget-object v4, p2, Ln/d;->l:[I

    const/4 v5, 0x4

    if-eqz p3, :cond_4

    aget p3, v4, v1

    if-ne p3, v5, :cond_4

    iput v2, v3, Lo/b;->a:I

    :cond_4
    if-eqz v0, :cond_5

    aget p3, v4, v2

    if-ne p3, v5, :cond_5

    iput v2, v3, Lo/b;->b:I

    :cond_5
    invoke-virtual {p1, p2, v3}, Lp/f;->a(Ln/d;Lo/b;)V

    iget p1, v3, Lo/b;->e:I

    invoke-virtual {p2, p1}, Ln/d;->y(I)V

    iget p1, v3, Lo/b;->f:I

    invoke-virtual {p2, p1}, Ln/d;->v(I)V

    iget-boolean p1, v3, Lo/b;->h:Z

    iput-boolean p1, p2, Ln/d;->w:Z

    iget p1, v3, Lo/b;->g:I

    iput p1, p2, Ln/d;->P:I

    if-lez p1, :cond_6

    goto :goto_4

    :cond_6
    move v2, v1

    :goto_4
    iput-boolean v2, p2, Ln/d;->w:Z

    iput-boolean v1, v3, Lo/b;->j:Z

    iget-boolean p1, v3, Lo/b;->i:Z

    return p1
.end method

.method public t(Ljava/lang/CharSequence;IIIZLandroidx/emoji2/text/o;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p6

    new-instance v5, Landroidx/emoji2/text/p;

    iget-object v6, v0, LJ0/d;->c:Ljava/lang/Object;

    check-cast v6, LY/v;

    iget-object v6, v6, LY/v;->c:Ljava/lang/Object;

    check-cast v6, Landroidx/emoji2/text/s;

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct {v5, v6, v7, v8}, Landroidx/emoji2/text/p;-><init>(Landroidx/emoji2/text/s;Z[I)V

    invoke-static/range {p1 .. p2}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    const/4 v9, 0x1

    move v10, v6

    move v11, v7

    move v12, v9

    move/from16 v6, p2

    move v7, v6

    :goto_0
    const/4 v13, 0x2

    if-ge v6, v2, :cond_f

    if-ge v11, v3, :cond_f

    if-eqz v12, :cond_f

    iget-object v14, v5, Landroidx/emoji2/text/p;->c:Landroidx/emoji2/text/s;

    iget-object v14, v14, Landroidx/emoji2/text/s;->a:Landroid/util/SparseArray;

    if-nez v14, :cond_0

    move-object v14, v8

    goto :goto_1

    :cond_0
    invoke-virtual {v14, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/emoji2/text/s;

    :goto_1
    iget v15, v5, Landroidx/emoji2/text/p;->a:I

    const/4 v8, 0x3

    if-eq v15, v13, :cond_2

    if-nez v14, :cond_1

    invoke-virtual {v5}, Landroidx/emoji2/text/p;->a()V

    :goto_2
    move v14, v9

    goto :goto_5

    :cond_1
    iput v13, v5, Landroidx/emoji2/text/p;->a:I

    iput-object v14, v5, Landroidx/emoji2/text/p;->c:Landroidx/emoji2/text/s;

    iput v9, v5, Landroidx/emoji2/text/p;->f:I

    :goto_3
    move v14, v13

    goto :goto_5

    :cond_2
    if-eqz v14, :cond_3

    iput-object v14, v5, Landroidx/emoji2/text/p;->c:Landroidx/emoji2/text/s;

    iget v14, v5, Landroidx/emoji2/text/p;->f:I

    add-int/2addr v14, v9

    iput v14, v5, Landroidx/emoji2/text/p;->f:I

    goto :goto_3

    :cond_3
    const v14, 0xfe0e

    if-ne v10, v14, :cond_4

    invoke-virtual {v5}, Landroidx/emoji2/text/p;->a()V

    goto :goto_2

    :cond_4
    const v14, 0xfe0f

    if-ne v10, v14, :cond_5

    goto :goto_3

    :cond_5
    iget-object v14, v5, Landroidx/emoji2/text/p;->c:Landroidx/emoji2/text/s;

    iget-object v15, v14, Landroidx/emoji2/text/s;->b:Landroidx/emoji2/text/v;

    if-eqz v15, :cond_8

    iget v15, v5, Landroidx/emoji2/text/p;->f:I

    if-ne v15, v9, :cond_7

    invoke-virtual {v5}, Landroidx/emoji2/text/p;->b()Z

    move-result v14

    if-eqz v14, :cond_6

    iget-object v14, v5, Landroidx/emoji2/text/p;->c:Landroidx/emoji2/text/s;

    iput-object v14, v5, Landroidx/emoji2/text/p;->d:Landroidx/emoji2/text/s;

    invoke-virtual {v5}, Landroidx/emoji2/text/p;->a()V

    :goto_4
    move v14, v8

    goto :goto_5

    :cond_6
    invoke-virtual {v5}, Landroidx/emoji2/text/p;->a()V

    goto :goto_2

    :cond_7
    iput-object v14, v5, Landroidx/emoji2/text/p;->d:Landroidx/emoji2/text/s;

    invoke-virtual {v5}, Landroidx/emoji2/text/p;->a()V

    goto :goto_4

    :cond_8
    invoke-virtual {v5}, Landroidx/emoji2/text/p;->a()V

    goto :goto_2

    :goto_5
    iput v10, v5, Landroidx/emoji2/text/p;->e:I

    if-eq v14, v9, :cond_e

    if-eq v14, v13, :cond_c

    if-eq v14, v8, :cond_9

    goto :goto_7

    :cond_9
    if-nez p5, :cond_a

    iget-object v8, v5, Landroidx/emoji2/text/p;->d:Landroidx/emoji2/text/s;

    iget-object v8, v8, Landroidx/emoji2/text/s;->b:Landroidx/emoji2/text/v;

    invoke-virtual {v0, v1, v7, v6, v8}, LJ0/d;->n(Ljava/lang/CharSequence;IILandroidx/emoji2/text/v;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    iget-object v8, v5, Landroidx/emoji2/text/p;->d:Landroidx/emoji2/text/s;

    iget-object v8, v8, Landroidx/emoji2/text/s;->b:Landroidx/emoji2/text/v;

    invoke-interface {v4, v1, v7, v6, v8}, Landroidx/emoji2/text/o;->c(Ljava/lang/CharSequence;IILandroidx/emoji2/text/v;)Z

    move-result v12

    add-int/lit8 v11, v11, 0x1

    :cond_b
    :goto_6
    move v7, v6

    goto :goto_7

    :cond_c
    invoke-static {v10}, Ljava/lang/Character;->charCount(I)I

    move-result v8

    add-int/2addr v8, v6

    if-ge v8, v2, :cond_d

    invoke-static {v1, v8}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    move v10, v6

    :cond_d
    move v6, v8

    goto :goto_7

    :cond_e
    invoke-static {v1, v7}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Character;->charCount(I)I

    move-result v6

    add-int/2addr v6, v7

    if-ge v6, v2, :cond_b

    invoke-static {v1, v6}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v7

    move v10, v7

    goto :goto_6

    :goto_7
    const/4 v8, 0x0

    goto/16 :goto_0

    :cond_f
    iget v2, v5, Landroidx/emoji2/text/p;->a:I

    if-ne v2, v13, :cond_12

    iget-object v2, v5, Landroidx/emoji2/text/p;->c:Landroidx/emoji2/text/s;

    iget-object v2, v2, Landroidx/emoji2/text/s;->b:Landroidx/emoji2/text/v;

    if-eqz v2, :cond_12

    iget v2, v5, Landroidx/emoji2/text/p;->f:I

    if-gt v2, v9, :cond_10

    invoke-virtual {v5}, Landroidx/emoji2/text/p;->b()Z

    move-result v2

    if-eqz v2, :cond_12

    :cond_10
    if-ge v11, v3, :cond_12

    if-eqz v12, :cond_12

    if-nez p5, :cond_11

    iget-object v2, v5, Landroidx/emoji2/text/p;->c:Landroidx/emoji2/text/s;

    iget-object v2, v2, Landroidx/emoji2/text/s;->b:Landroidx/emoji2/text/v;

    invoke-virtual {v0, v1, v7, v6, v2}, LJ0/d;->n(Ljava/lang/CharSequence;IILandroidx/emoji2/text/v;)Z

    move-result v2

    if-nez v2, :cond_12

    :cond_11
    iget-object v2, v5, Landroidx/emoji2/text/p;->c:Landroidx/emoji2/text/s;

    iget-object v2, v2, Landroidx/emoji2/text/s;->b:Landroidx/emoji2/text/v;

    invoke-interface {v4, v1, v7, v6, v2}, Landroidx/emoji2/text/o;->c(Ljava/lang/CharSequence;IILandroidx/emoji2/text/v;)Z

    :cond_12
    invoke-interface/range {p6 .. p6}, Landroidx/emoji2/text/o;->g()Ljava/lang/Object;

    move-result-object v1

    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    iget v0, p0, LJ0/d;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, LJ0/d;->c:Ljava/lang/Object;

    check-cast v1, LU/b;

    invoke-virtual {v1}, LU/b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", hidden list:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LJ0/d;->d:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public u()V
    .locals 1

    iget-object v0, p0, LJ0/d;->c:Ljava/lang/Object;

    check-cast v0, Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method public v(Ljava/util/List;)V
    .locals 4

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LU/a;

    const/4 v3, 0x0

    iput-object v3, v2, LU/a;->a:Ljava/lang/Object;

    iget-object v3, p0, LJ0/d;->b:Ljava/lang/Object;

    check-cast v3, LC/b;

    invoke-virtual {v3, v2}, LC/b;->c(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->clear()V

    return-void
.end method

.method public w(Ln/e;II)V
    .locals 3

    iget v0, p1, Ln/d;->Q:I

    iget v1, p1, Ln/d;->R:I

    const/4 v2, 0x0

    iput v2, p1, Ln/d;->Q:I

    iput v2, p1, Ln/d;->R:I

    invoke-virtual {p1, p2}, Ln/d;->y(I)V

    invoke-virtual {p1, p3}, Ln/d;->v(I)V

    if-gez v0, :cond_0

    iput v2, p1, Ln/d;->Q:I

    goto :goto_0

    :cond_0
    iput v0, p1, Ln/d;->Q:I

    :goto_0
    if-gez v1, :cond_1

    iput v2, p1, Ln/d;->R:I

    goto :goto_1

    :cond_1
    iput v1, p1, Ln/d;->R:I

    :goto_1
    iget-object p1, p0, LJ0/d;->d:Ljava/lang/Object;

    check-cast p1, Ln/e;

    invoke-virtual {p1}, Ln/e;->E()V

    return-void
.end method

.method public x(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, LJ0/d;->d:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LJ0/d;->b:Ljava/lang/Object;

    check-cast v0, LU/v;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->u(Landroid/view/View;)LU/O;

    :cond_0
    return-void
.end method
