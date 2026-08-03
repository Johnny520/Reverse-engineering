.class public Landroidx/constraintlayout/widget/ConstraintLayout;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/constraintlayout/widget/ConstraintLayout$a;,
        Landroidx/constraintlayout/widget/ConstraintLayout$b;
    }
.end annotation


# static fields
.field public static final synthetic p:I


# instance fields
.field public final a:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Landroidx/constraintlayout/widget/c;",
            ">;"
        }
    .end annotation
.end field

.field public final c:La/O3;

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Z

.field public i:I

.field public j:Landroidx/constraintlayout/widget/e;

.field public k:Landroidx/constraintlayout/widget/d;

.field public l:I

.field public m:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field public final n:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "La/N3;",
            ">;"
        }
    .end annotation
.end field

.field public final o:Landroidx/constraintlayout/widget/ConstraintLayout$b;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    .line 3
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    .line 4
    new-instance p1, La/O3;

    invoke-direct {p1}, La/O3;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:La/O3;

    const/4 p1, 0x0

    .line 5
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    .line 6
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    const v0, 0x7fffffff

    .line 7
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    .line 8
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    const/16 v0, 0x107

    .line 10
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/e;

    .line 12
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/d;

    const/4 v0, -0x1

    .line 13
    iput v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 14
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    .line 15
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Landroid/util/SparseArray;

    .line 16
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-direct {v0, p0}, Landroidx/constraintlayout/widget/ConstraintLayout$b;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroidx/constraintlayout/widget/ConstraintLayout$b;

    .line 17
    invoke-virtual {p0, p2, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 18
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 19
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    .line 20
    new-instance p1, Ljava/util/ArrayList;

    const/4 v0, 0x4

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    .line 21
    new-instance p1, La/O3;

    invoke-direct {p1}, La/O3;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:La/O3;

    const/4 p1, 0x0

    .line 22
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    .line 23
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    const p1, 0x7fffffff

    .line 24
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    .line 25
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    const/4 p1, 0x1

    .line 26
    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    const/16 p1, 0x107

    .line 27
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    const/4 p1, 0x0

    .line 28
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/e;

    .line 29
    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/d;

    const/4 p1, -0x1

    .line 30
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    .line 31
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    .line 32
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Landroid/util/SparseArray;

    .line 33
    new-instance p1, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    invoke-direct {p1, p0}, Landroidx/constraintlayout/widget/ConstraintLayout$b;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroidx/constraintlayout/widget/ConstraintLayout$b;

    .line 34
    invoke-virtual {p0, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;->c(Landroid/util/AttributeSet;I)V

    return-void
.end method

.method private getPaddingWidth()I
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingStart()I

    move-result v0

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingEnd()I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v1, v0

    if-lez v1, :cond_0

    return v1

    :cond_0
    return v2
.end method


# virtual methods
.method public final b(Landroid/view/View;)La/N3;
    .locals 0

    if-ne p1, p0, :cond_0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:La/O3;

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    const/4 p1, 0x0

    return-object p1

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:La/N3;

    return-object p1
.end method

.method public final c(Landroid/util/AttributeSet;I)V
    .locals 7

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:La/O3;

    iput-object p0, v0, La/N3;->W:Landroid/view/View;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iput-object v1, v0, La/O3;->h0:La/e2$b;

    iget-object v2, v0, La/O3;->g0:La/U4;

    iput-object v1, v2, La/U4;->f:La/e2$b;

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v2

    invoke-virtual {v1, v2, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v1, 0x0

    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/e;

    const/4 v2, 0x0

    if-eqz p1, :cond_8

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget-object v4, Landroidx/constraintlayout/widget/R$styleable;->ConstraintLayout_Layout:[I

    invoke-virtual {v3, p1, v4, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result p2

    move v3, v2

    :goto_0
    if-ge v3, p2, :cond_7

    invoke-virtual {p1, v3}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v4

    sget v5, Landroidx/constraintlayout/widget/R$styleable;->ConstraintLayout_Layout_android_minWidth:I

    if-ne v4, v5, :cond_0

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    goto :goto_2

    :cond_0
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->ConstraintLayout_Layout_android_minHeight:I

    if-ne v4, v5, :cond_1

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    goto :goto_2

    :cond_1
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->ConstraintLayout_Layout_android_maxWidth:I

    if-ne v4, v5, :cond_2

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    goto :goto_2

    :cond_2
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->ConstraintLayout_Layout_android_maxHeight:I

    if-ne v4, v5, :cond_3

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    goto :goto_2

    :cond_3
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->ConstraintLayout_Layout_layout_optimizationLevel:I

    if-ne v4, v5, :cond_4

    iget v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    invoke-virtual {p1, v4, v5}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v4

    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    goto :goto_2

    :cond_4
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->ConstraintLayout_Layout_layoutDescription:I

    if-ne v4, v5, :cond_5

    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    if-eqz v4, :cond_6

    :try_start_0
    invoke-virtual {p0, v4}, Landroidx/constraintlayout/widget/ConstraintLayout;->d(I)V
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/d;

    goto :goto_2

    :cond_5
    sget v5, Landroidx/constraintlayout/widget/R$styleable;->ConstraintLayout_Layout_constraintSet:I

    if-ne v4, v5, :cond_6

    invoke-virtual {p1, v4, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    :try_start_1
    new-instance v5, Landroidx/constraintlayout/widget/e;

    invoke-direct {v5}, Landroidx/constraintlayout/widget/e;-><init>()V

    iput-object v5, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/e;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v5, v6, v4}, Landroidx/constraintlayout/widget/e;->e(Landroid/content/Context;I)V
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    iput-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/e;

    :goto_1
    iput v4, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    :cond_6
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_7
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    :cond_8
    iget p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    iput p1, v0, La/O3;->q0:I

    const/16 p2, 0x100

    and-int/2addr p1, p2

    if-ne p1, p2, :cond_9

    const/4 v2, 0x1

    :cond_9
    sput-boolean v2, La/B9;->p:Z

    return-void
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 0

    instance-of p1, p1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    return p1
.end method

.method public final d(I)V
    .locals 9

    new-instance v0, Landroidx/constraintlayout/widget/d;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, v0, Landroidx/constraintlayout/widget/d;->a:Landroid/util/SparseArray;

    new-instance v2, Landroid/util/SparseArray;

    invoke-direct {v2}, Landroid/util/SparseArray;-><init>()V

    iput-object v2, v0, Landroidx/constraintlayout/widget/d;->b:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;

    move-result-object p1

    :try_start_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getEventType()I

    move-result v2

    const/4 v3, 0x0

    :goto_0
    const/4 v4, 0x1

    if-eq v2, v4, :cond_7

    if-eqz v2, :cond_5

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    goto/16 :goto_3

    :cond_0
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v6

    const/4 v7, 0x4

    const/4 v8, 0x3

    sparse-switch v6, :sswitch_data_0

    goto :goto_1

    :sswitch_0
    const-string v6, "Variant"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v8

    goto :goto_2

    :catch_0
    move-exception p1

    goto/16 :goto_4

    :catch_1
    move-exception p1

    goto/16 :goto_5

    :sswitch_1
    const-string v6, "layoutDescription"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x0

    goto :goto_2

    :sswitch_2
    const-string v6, "StateSet"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v4

    goto :goto_2

    :sswitch_3
    const-string v6, "State"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v5

    goto :goto_2

    :sswitch_4
    const-string v6, "ConstraintSet"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v7

    goto :goto_2

    :cond_1
    :goto_1
    const/4 v6, -0x1

    :goto_2
    if-eqz v6, :cond_6

    if-eq v6, v4, :cond_6

    if-eq v6, v5, :cond_4

    if-eq v6, v8, :cond_3

    if-eq v6, v7, :cond_2

    const-string v4, "ConstraintLayoutStates"

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "unknown tag "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    :cond_2
    invoke-virtual {v0, v1, p1}, Landroidx/constraintlayout/widget/d;->a(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    goto :goto_3

    :cond_3
    new-instance v2, Landroidx/constraintlayout/widget/d$b;

    invoke-direct {v2, v1, p1}, Landroidx/constraintlayout/widget/d$b;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    if-eqz v3, :cond_6

    iget-object v4, v3, Landroidx/constraintlayout/widget/d$a;->b:Ljava/util/ArrayList;

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    new-instance v3, Landroidx/constraintlayout/widget/d$a;

    invoke-direct {v3, v1, p1}, Landroidx/constraintlayout/widget/d$a;-><init>(Landroid/content/Context;Landroid/content/res/XmlResourceParser;)V

    iget-object v2, v0, Landroidx/constraintlayout/widget/d;->a:Landroid/util/SparseArray;

    iget v4, v3, Landroidx/constraintlayout/widget/d$a;->a:I

    invoke-virtual {v2, v4, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_3

    :cond_5
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->getName()Ljava/lang/String;

    :cond_6
    :goto_3
    invoke-interface {p1}, Lorg/xmlpull/v1/XmlPullParser;->next()I

    move-result v2
    :try_end_0
    .catch Lorg/xmlpull/v1/XmlPullParserException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_0

    :goto_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    goto :goto_6

    :goto_5
    invoke-virtual {p1}, Lorg/xmlpull/v1/XmlPullParserException;->printStackTrace()V

    :cond_7
    :goto_6
    iput-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/d;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x50764adb -> :sswitch_4
        0x4c7d471 -> :sswitch_3
        0x526c4e31 -> :sswitch_2
        0x62ce7272 -> :sswitch_1
        0x7155a865 -> :sswitch_0
    .end sparse-switch
.end method

.method public final dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 17

    move-object/from16 v0, p0

    const/4 v1, 0x0

    iget-object v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_0

    move v4, v1

    :goto_0
    if-ge v4, v3, :cond_0

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/constraintlayout/widget/c;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_0
    invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v3

    int-to-float v3, v3

    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    move-result v4

    int-to-float v4, v4

    move v5, v1

    :goto_1
    if-ge v5, v2, :cond_3

    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v7

    const/16 v8, 0x8

    if-ne v7, v8, :cond_1

    goto/16 :goto_2

    :cond_1
    invoke-virtual {v6}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_2

    instance-of v7, v6, Ljava/lang/String;

    if-eqz v7, :cond_2

    check-cast v6, Ljava/lang/String;

    const-string v7, ","

    invoke-virtual {v6, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x4

    if-ne v7, v8, :cond_2

    aget-object v7, v6, v1

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    const/4 v8, 0x1

    aget-object v8, v6, v8

    invoke-static {v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v8

    const/4 v9, 0x2

    aget-object v9, v6, v9

    invoke-static {v9}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v9

    const/4 v10, 0x3

    aget-object v6, v6, v10

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    int-to-float v7, v7

    const/high16 v10, 0x44870000    # 1080.0f

    div-float/2addr v7, v10

    mul-float/2addr v7, v3

    float-to-int v7, v7

    int-to-float v8, v8

    const/high16 v11, 0x44f00000    # 1920.0f

    div-float/2addr v8, v11

    mul-float/2addr v8, v4

    float-to-int v8, v8

    int-to-float v9, v9

    div-float/2addr v9, v10

    mul-float/2addr v9, v3

    float-to-int v9, v9

    int-to-float v6, v6

    div-float/2addr v6, v11

    mul-float/2addr v6, v4

    float-to-int v6, v6

    new-instance v15, Landroid/graphics/Paint;

    invoke-direct {v15}, Landroid/graphics/Paint;-><init>()V

    const/high16 v10, -0x10000

    invoke-virtual {v15, v10}, Landroid/graphics/Paint;->setColor(I)V

    int-to-float v11, v7

    int-to-float v12, v8

    add-int/2addr v7, v9

    int-to-float v13, v7

    move v14, v12

    move-object/from16 v10, p1

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v7, v11

    add-int/2addr v8, v6

    int-to-float v14, v8

    move v11, v13

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v6, v12

    move v12, v14

    move v13, v7

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move v7, v11

    move v11, v13

    move v14, v6

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v16, v14

    move v14, v12

    move/from16 v12, v16

    const v6, -0xff0100

    invoke-virtual {v15, v6}, Landroid/graphics/Paint;->setColor(I)V

    move v13, v7

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    move/from16 v16, v14

    move v14, v12

    move/from16 v12, v16

    invoke-virtual/range {v10 .. v15}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    :cond_2
    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto/16 :goto_1

    :cond_3
    return-void
.end method

.method public final e(La/O3;III)V
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    invoke-static/range {p4 .. p4}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v6

    invoke-virtual {v0}, Landroid/view/View;->getPaddingTop()I

    move-result v7

    const/4 v8, 0x0

    invoke-static {v8, v7}, Ljava/lang/Math;->max(II)I

    move-result v7

    invoke-virtual {v0}, Landroid/view/View;->getPaddingBottom()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    add-int v10, v7, v9

    invoke-direct {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->getPaddingWidth()I

    move-result v11

    iget-object v12, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iput v7, v12, Landroidx/constraintlayout/widget/ConstraintLayout$b;->b:I

    iput v9, v12, Landroidx/constraintlayout/widget/ConstraintLayout$b;->c:I

    iput v11, v12, Landroidx/constraintlayout/widget/ConstraintLayout$b;->d:I

    iput v10, v12, Landroidx/constraintlayout/widget/ConstraintLayout$b;->e:I

    move/from16 v9, p3

    iput v9, v12, Landroidx/constraintlayout/widget/ConstraintLayout$b;->f:I

    move/from16 v9, p4

    iput v9, v12, Landroidx/constraintlayout/widget/ConstraintLayout$b;->g:I

    invoke-virtual {v0}, Landroid/view/View;->getPaddingStart()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-virtual {v0}, Landroid/view/View;->getPaddingEnd()I

    move-result v13

    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    const/4 v14, 0x1

    if-gtz v9, :cond_1

    if-lez v13, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    move-result v9

    invoke-static {v8, v9}, Ljava/lang/Math;->max(II)I

    move-result v9

    goto :goto_1

    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-virtual {v15}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v15

    iget v15, v15, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v16, 0x400000

    and-int v15, v15, v16

    if-eqz v15, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v15

    if-ne v14, v15, :cond_2

    move v9, v13

    :cond_2
    :goto_1
    sub-int/2addr v4, v11

    sub-int/2addr v6, v10

    iget v10, v12, Landroidx/constraintlayout/widget/ConstraintLayout$b;->e:I

    iget v11, v12, Landroidx/constraintlayout/widget/ConstraintLayout$b;->d:I

    sget-object v12, La/N3$a;->a:La/N3$a;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v13

    sget-object v15, La/N3$a;->b:La/N3$a;

    const/high16 v14, 0x40000000    # 2.0f

    const/high16 v8, -0x80000000

    if-eq v3, v8, :cond_6

    if-eqz v3, :cond_4

    if-eq v3, v14, :cond_3

    move/from16 v17, v10

    move-object v10, v12

    const/4 v14, 0x0

    goto :goto_4

    :cond_3
    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    sub-int/2addr v14, v11

    invoke-static {v14, v4}, Ljava/lang/Math;->min(II)I

    move-result v14

    move/from16 v17, v10

    move-object v10, v12

    goto :goto_4

    :cond_4
    if-nez v13, :cond_5

    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    const/4 v8, 0x0

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v16

    move/from16 v17, v10

    move-object v10, v15

    move/from16 v14, v16

    :goto_2
    const/high16 v8, -0x80000000

    goto :goto_4

    :cond_5
    const/4 v8, 0x0

    move v14, v8

    :goto_3
    move/from16 v17, v10

    move-object v10, v15

    goto :goto_2

    :cond_6
    const/4 v8, 0x0

    if-nez v13, :cond_7

    iget v14, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-static {v8, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    goto :goto_3

    :cond_7
    move v14, v4

    goto :goto_3

    :goto_4
    if-eq v5, v8, :cond_b

    if-eqz v5, :cond_9

    const/high16 v8, 0x40000000    # 2.0f

    if-eq v5, v8, :cond_8

    move/from16 v18, v11

    move-object v8, v12

    const/4 v13, 0x0

    goto :goto_6

    :cond_8
    iget v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int v8, v8, v17

    invoke-static {v8, v6}, Ljava/lang/Math;->min(II)I

    move-result v8

    move v13, v8

    move/from16 v18, v11

    move-object v8, v12

    goto :goto_6

    :cond_9
    if-nez v13, :cond_a

    iget v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    const/4 v13, 0x0

    invoke-static {v13, v8}, Ljava/lang/Math;->max(II)I

    move-result v16

    move/from16 v18, v11

    move-object v8, v15

    move/from16 v13, v16

    goto :goto_6

    :cond_a
    const/4 v13, 0x0

    :goto_5
    move/from16 v18, v11

    move-object v8, v15

    goto :goto_6

    :cond_b
    const/4 v8, 0x0

    if-nez v13, :cond_c

    iget v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-static {v8, v13}, Ljava/lang/Math;->max(II)I

    move-result v13

    goto :goto_5

    :cond_c
    move v13, v6

    goto :goto_5

    :goto_6
    invoke-virtual {v1}, La/N3;->l()I

    move-result v11

    move-object/from16 v19, v12

    iget-object v12, v1, La/O3;->g0:La/U4;

    if-ne v14, v11, :cond_d

    invoke-virtual {v1}, La/N3;->i()I

    move-result v11

    if-eq v13, v11, :cond_e

    :cond_d
    const/4 v11, 0x1

    goto :goto_8

    :cond_e
    :goto_7
    const/4 v11, 0x0

    goto :goto_9

    :goto_8
    iput-boolean v11, v12, La/U4;->c:Z

    goto :goto_7

    :goto_9
    iput v11, v1, La/N3;->P:I

    iput v11, v1, La/N3;->Q:I

    move/from16 v16, v11

    iget v11, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    sub-int v11, v11, v18

    move/from16 v20, v11

    iget-object v11, v1, La/N3;->u:[I

    aput v20, v11, v16

    move-object/from16 v20, v11

    iget v11, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    sub-int v11, v11, v17

    const/16 v21, 0x1

    aput v11, v20, v21

    move/from16 v11, v16

    iput v11, v1, La/N3;->S:I

    iput v11, v1, La/N3;->T:I

    invoke-virtual {v1, v10}, La/N3;->w(La/N3$a;)V

    invoke-virtual {v1, v14}, La/N3;->y(I)V

    invoke-virtual {v1, v8}, La/N3;->x(La/N3$a;)V

    invoke-virtual {v1, v13}, La/N3;->v(I)V

    iget v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    sub-int v8, v8, v18

    if-gez v8, :cond_f

    iput v11, v1, La/N3;->S:I

    goto :goto_a

    :cond_f
    iput v8, v1, La/N3;->S:I

    :goto_a
    iget v8, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    sub-int v8, v8, v17

    if-gez v8, :cond_10

    iput v11, v1, La/N3;->T:I

    goto :goto_b

    :cond_10
    iput v8, v1, La/N3;->T:I

    :goto_b
    iput v9, v1, La/O3;->k0:I

    iput v7, v1, La/O3;->l0:I

    iget-object v7, v1, La/O3;->f0:La/e2;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v8, v1, La/O3;->h0:La/e2$b;

    iget-object v9, v1, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v9

    invoke-virtual {v1}, La/N3;->l()I

    move-result v10

    invoke-virtual {v1}, La/N3;->i()I

    move-result v11

    and-int/lit16 v13, v2, 0x80

    const/16 v14, 0x80

    if-ne v13, v14, :cond_11

    const/4 v13, 0x1

    goto :goto_c

    :cond_11
    const/4 v13, 0x0

    :goto_c
    if-nez v13, :cond_13

    const/16 v14, 0x40

    and-int/2addr v2, v14

    if-ne v2, v14, :cond_12

    goto :goto_d

    :cond_12
    const/4 v2, 0x0

    goto :goto_e

    :cond_13
    :goto_d
    const/4 v2, 0x1

    :goto_e
    sget-object v14, La/N3$a;->c:La/N3$a;

    if-eqz v2, :cond_1c

    const/4 v0, 0x0

    :goto_f
    if-ge v0, v9, :cond_1c

    move/from16 p2, v2

    iget-object v2, v1, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/N3;

    move/from16 v17, v0

    iget-object v0, v2, La/N3;->J:[La/N3$a;

    move-object/from16 v18, v0

    const/16 v16, 0x0

    aget-object v0, v18, v16

    if-ne v0, v14, :cond_14

    const/16 v22, 0x1

    :goto_10
    const/16 v21, 0x1

    goto :goto_11

    :cond_14
    const/16 v22, 0x0

    goto :goto_10

    :goto_11
    aget-object v0, v18, v21

    if-ne v0, v14, :cond_15

    const/4 v0, 0x1

    goto :goto_12

    :cond_15
    const/4 v0, 0x0

    :goto_12
    if-eqz v22, :cond_16

    if-eqz v0, :cond_16

    iget v0, v2, La/N3;->N:F

    const/16 v18, 0x0

    cmpl-float v0, v0, v18

    if-lez v0, :cond_16

    const/4 v0, 0x1

    goto :goto_13

    :cond_16
    const/4 v0, 0x0

    :goto_13
    invoke-virtual {v2}, La/N3;->q()Z

    move-result v18

    if-eqz v18, :cond_18

    if-eqz v0, :cond_18

    :cond_17
    :goto_14
    const/4 v0, 0x0

    :goto_15
    const/high16 v2, 0x40000000    # 2.0f

    goto :goto_16

    :cond_18
    invoke-virtual {v2}, La/N3;->r()Z

    move-result v18

    if-eqz v18, :cond_19

    if-eqz v0, :cond_19

    goto :goto_14

    :cond_19
    instance-of v0, v2, La/Yg;

    if-eqz v0, :cond_1a

    goto :goto_14

    :cond_1a
    invoke-virtual {v2}, La/N3;->q()Z

    move-result v0

    if-nez v0, :cond_17

    invoke-virtual {v2}, La/N3;->r()Z

    move-result v0

    if-eqz v0, :cond_1b

    goto :goto_14

    :cond_1b
    add-int/lit8 v0, v17, 0x1

    move/from16 v2, p2

    goto :goto_f

    :cond_1c
    move/from16 p2, v2

    move/from16 v0, p2

    goto :goto_15

    :goto_16
    if-ne v3, v2, :cond_1d

    if-eq v5, v2, :cond_1e

    :cond_1d
    if-eqz v13, :cond_1f

    :cond_1e
    const/4 v2, 0x1

    goto :goto_17

    :cond_1f
    const/4 v2, 0x0

    :goto_17
    and-int/2addr v0, v2

    if-eqz v0, :cond_3f

    const/16 v16, 0x0

    aget v0, v20, v16

    invoke-static {v0, v4}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v4, 0x1

    aget v2, v20, v4

    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/high16 v6, 0x40000000    # 2.0f

    if-ne v3, v6, :cond_21

    invoke-virtual {v1}, La/N3;->l()I

    move-result v6

    if-eq v6, v0, :cond_20

    invoke-virtual {v1, v0}, La/N3;->y(I)V

    iget-object v0, v1, La/O3;->g0:La/U4;

    iput-boolean v4, v0, La/U4;->b:Z

    :cond_20
    const/high16 v6, 0x40000000    # 2.0f

    :cond_21
    if-ne v5, v6, :cond_22

    invoke-virtual {v1}, La/N3;->i()I

    move-result v0

    if-eq v0, v2, :cond_22

    invoke-virtual {v1, v2}, La/N3;->v(I)V

    iget-object v0, v1, La/O3;->g0:La/U4;

    iput-boolean v4, v0, La/U4;->b:Z

    :cond_22
    if-ne v3, v6, :cond_38

    if-ne v5, v6, :cond_38

    iget-boolean v0, v12, La/U4;->b:Z

    iget-object v2, v12, La/U4;->a:La/O3;

    if-nez v0, :cond_24

    iget-boolean v0, v12, La/U4;->c:Z

    if-eqz v0, :cond_23

    goto :goto_18

    :cond_23
    const/4 v6, 0x0

    goto :goto_1a

    :cond_24
    :goto_18
    iget-object v0, v2, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_25

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/N3;

    const/4 v6, 0x0

    iput-boolean v6, v4, La/N3;->a:Z

    iget-object v6, v4, La/N3;->d:La/K8;

    invoke-virtual {v6}, La/K8;->n()V

    iget-object v4, v4, La/N3;->e:La/og;

    invoke-virtual {v4}, La/og;->m()V

    goto :goto_19

    :cond_25
    const/4 v6, 0x0

    iput-boolean v6, v2, La/N3;->a:Z

    iget-object v0, v2, La/N3;->d:La/K8;

    invoke-virtual {v0}, La/K8;->n()V

    iget-object v0, v2, La/N3;->e:La/og;

    invoke-virtual {v0}, La/og;->m()V

    iput-boolean v6, v12, La/U4;->c:Z

    :goto_1a
    iget-object v0, v12, La/U4;->d:La/O3;

    invoke-virtual {v12, v0}, La/U4;->b(La/O3;)V

    iput v6, v2, La/N3;->P:I

    iput v6, v2, La/N3;->Q:I

    invoke-virtual {v2, v6}, La/N3;->h(I)La/N3$a;

    move-result-object v0

    const/4 v4, 0x1

    invoke-virtual {v2, v4}, La/N3;->h(I)La/N3$a;

    move-result-object v6

    iget-boolean v4, v12, La/U4;->b:Z

    if-eqz v4, :cond_26

    invoke-virtual {v12}, La/U4;->c()V

    :cond_26
    invoke-virtual {v2}, La/N3;->m()I

    move-result v4

    move/from16 v17, v9

    invoke-virtual {v2}, La/N3;->n()I

    move-result v9

    move-object/from16 v18, v8

    iget-object v8, v2, La/N3;->d:La/K8;

    move/from16 v20, v10

    iget-object v10, v8, La/ih;->h:La/V4;

    invoke-virtual {v10, v4}, La/V4;->d(I)V

    iget-object v10, v2, La/N3;->e:La/og;

    move/from16 v21, v4

    iget-object v4, v10, La/ih;->h:La/V4;

    invoke-virtual {v4, v9}, La/V4;->d(I)V

    invoke-virtual {v12}, La/U4;->g()V

    iget-object v4, v12, La/U4;->e:Ljava/util/ArrayList;

    move-object/from16 v22, v4

    iget-object v4, v8, La/ih;->e:La/l5;

    move/from16 v23, v9

    iget-object v9, v10, La/ih;->e:La/l5;

    if-eq v0, v15, :cond_28

    if-ne v6, v15, :cond_27

    goto :goto_1b

    :cond_27
    move-object/from16 v25, v7

    move/from16 v24, v11

    move-object/from16 v11, v19

    goto :goto_1d

    :cond_28
    :goto_1b
    if-eqz v13, :cond_2a

    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v24

    :cond_29
    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->hasNext()Z

    move-result v25

    if-eqz v25, :cond_2a

    invoke-interface/range {v24 .. v24}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v25

    check-cast v25, La/ih;

    invoke-virtual/range {v25 .. v25}, La/ih;->k()Z

    move-result v25

    if-nez v25, :cond_29

    const/4 v13, 0x0

    :cond_2a
    if-eqz v13, :cond_2b

    if-ne v0, v15, :cond_2b

    move/from16 v24, v11

    move-object/from16 v11, v19

    invoke-virtual {v2, v11}, La/N3;->w(La/N3$a;)V

    move-object/from16 v25, v7

    move/from16 v19, v13

    const/4 v13, 0x0

    invoke-virtual {v12, v2, v13}, La/U4;->d(La/O3;I)I

    move-result v7

    invoke-virtual {v2, v7}, La/N3;->y(I)V

    invoke-virtual {v2}, La/N3;->l()I

    move-result v7

    invoke-virtual {v4, v7}, La/l5;->d(I)V

    goto :goto_1c

    :cond_2b
    move-object/from16 v25, v7

    move/from16 v24, v11

    move-object/from16 v11, v19

    move/from16 v19, v13

    :goto_1c
    if-eqz v19, :cond_2c

    if-ne v6, v15, :cond_2c

    invoke-virtual {v2, v11}, La/N3;->x(La/N3$a;)V

    const/4 v7, 0x1

    invoke-virtual {v12, v2, v7}, La/U4;->d(La/O3;I)I

    move-result v13

    invoke-virtual {v2, v13}, La/N3;->v(I)V

    invoke-virtual {v2}, La/N3;->i()I

    move-result v7

    invoke-virtual {v9, v7}, La/l5;->d(I)V

    :cond_2c
    :goto_1d
    iget-object v7, v2, La/N3;->J:[La/N3$a;

    const/16 v16, 0x0

    aget-object v13, v7, v16

    move-object/from16 v19, v7

    sget-object v7, La/N3$a;->d:La/N3$a;

    if-eq v13, v11, :cond_2e

    if-ne v13, v7, :cond_2d

    goto :goto_1e

    :cond_2d
    const/4 v4, 0x0

    goto :goto_1f

    :cond_2e
    :goto_1e
    invoke-virtual {v2}, La/N3;->l()I

    move-result v13

    add-int v13, v13, v21

    iget-object v8, v8, La/ih;->i:La/V4;

    invoke-virtual {v8, v13}, La/V4;->d(I)V

    sub-int v13, v13, v21

    invoke-virtual {v4, v13}, La/l5;->d(I)V

    invoke-virtual {v12}, La/U4;->g()V

    const/4 v4, 0x1

    aget-object v8, v19, v4

    if-eq v8, v11, :cond_2f

    if-ne v8, v7, :cond_30

    :cond_2f
    invoke-virtual {v2}, La/N3;->i()I

    move-result v4

    add-int v4, v4, v23

    iget-object v7, v10, La/ih;->i:La/V4;

    invoke-virtual {v7, v4}, La/V4;->d(I)V

    sub-int v4, v4, v23

    invoke-virtual {v9, v4}, La/l5;->d(I)V

    :cond_30
    invoke-virtual {v12}, La/U4;->g()V

    const/4 v4, 0x1

    :goto_1f
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_20
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_32

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La/ih;

    iget-object v9, v8, La/ih;->b:La/N3;

    if-ne v9, v2, :cond_31

    iget-boolean v9, v8, La/ih;->g:Z

    if-nez v9, :cond_31

    goto :goto_20

    :cond_31
    invoke-virtual {v8}, La/ih;->e()V

    goto :goto_20

    :cond_32
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_33
    :goto_21
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_37

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, La/ih;

    if-nez v4, :cond_34

    iget-object v9, v8, La/ih;->b:La/N3;

    if-ne v9, v2, :cond_34

    goto :goto_21

    :cond_34
    iget-object v9, v8, La/ih;->h:La/V4;

    iget-boolean v9, v9, La/V4;->j:Z

    if-nez v9, :cond_35

    :goto_22
    const/4 v4, 0x0

    goto :goto_23

    :cond_35
    iget-object v9, v8, La/ih;->i:La/V4;

    iget-boolean v9, v9, La/V4;->j:Z

    if-nez v9, :cond_36

    instance-of v9, v8, La/b8;

    if-nez v9, :cond_36

    goto :goto_22

    :cond_36
    iget-object v9, v8, La/ih;->e:La/l5;

    iget-boolean v9, v9, La/V4;->j:Z

    if-nez v9, :cond_33

    instance-of v9, v8, La/U2;

    if-nez v9, :cond_33

    instance-of v8, v8, La/b8;

    if-nez v8, :cond_33

    goto :goto_22

    :cond_37
    const/4 v4, 0x1

    :goto_23
    invoke-virtual {v2, v0}, La/N3;->w(La/N3$a;)V

    invoke-virtual {v2, v6}, La/N3;->x(La/N3$a;)V

    move v0, v4

    const/high16 v2, 0x40000000    # 2.0f

    const/4 v4, 0x2

    goto/16 :goto_27

    :cond_38
    move-object/from16 v25, v7

    move-object/from16 v18, v8

    move/from16 v17, v9

    move/from16 v20, v10

    move/from16 v24, v11

    move-object/from16 v11, v19

    iget-boolean v0, v12, La/U4;->b:Z

    iget-object v2, v12, La/U4;->a:La/O3;

    if-eqz v0, :cond_3a

    iget-object v0, v2, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_24
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_39

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/N3;

    const/4 v6, 0x0

    iput-boolean v6, v4, La/N3;->a:Z

    iget-object v7, v4, La/N3;->d:La/K8;

    iget-object v8, v7, La/ih;->e:La/l5;

    iput-boolean v6, v8, La/V4;->j:Z

    iput-boolean v6, v7, La/ih;->g:Z

    invoke-virtual {v7}, La/K8;->n()V

    iget-object v4, v4, La/N3;->e:La/og;

    iget-object v7, v4, La/ih;->e:La/l5;

    iput-boolean v6, v7, La/V4;->j:Z

    iput-boolean v6, v4, La/ih;->g:Z

    invoke-virtual {v4}, La/og;->m()V

    goto :goto_24

    :cond_39
    const/4 v6, 0x0

    iput-boolean v6, v2, La/N3;->a:Z

    iget-object v0, v2, La/N3;->d:La/K8;

    iget-object v4, v0, La/ih;->e:La/l5;

    iput-boolean v6, v4, La/V4;->j:Z

    iput-boolean v6, v0, La/ih;->g:Z

    invoke-virtual {v0}, La/K8;->n()V

    iget-object v0, v2, La/N3;->e:La/og;

    iget-object v4, v0, La/ih;->e:La/l5;

    iput-boolean v6, v4, La/V4;->j:Z

    iput-boolean v6, v0, La/ih;->g:Z

    invoke-virtual {v0}, La/og;->m()V

    invoke-virtual {v12}, La/U4;->c()V

    goto :goto_25

    :cond_3a
    const/4 v6, 0x0

    :goto_25
    iget-object v0, v12, La/U4;->d:La/O3;

    invoke-virtual {v12, v0}, La/U4;->b(La/O3;)V

    iput v6, v2, La/N3;->P:I

    iput v6, v2, La/N3;->Q:I

    iget-object v0, v2, La/N3;->d:La/K8;

    iget-object v0, v0, La/ih;->h:La/V4;

    invoke-virtual {v0, v6}, La/V4;->d(I)V

    iget-object v0, v2, La/N3;->e:La/og;

    iget-object v0, v0, La/ih;->h:La/V4;

    invoke-virtual {v0, v6}, La/V4;->d(I)V

    const/high16 v2, 0x40000000    # 2.0f

    if-ne v3, v2, :cond_3b

    invoke-virtual {v1, v6, v13}, La/O3;->E(IZ)Z

    move-result v0

    const/4 v4, 0x1

    goto :goto_26

    :cond_3b
    const/4 v0, 0x1

    const/4 v4, 0x0

    :goto_26
    if-ne v5, v2, :cond_3c

    const/4 v7, 0x1

    invoke-virtual {v1, v7, v13}, La/O3;->E(IZ)Z

    move-result v6

    and-int/2addr v0, v6

    add-int/lit8 v4, v4, 0x1

    :cond_3c
    :goto_27
    if-eqz v0, :cond_40

    if-ne v3, v2, :cond_3d

    const/4 v3, 0x1

    goto :goto_28

    :cond_3d
    const/4 v3, 0x0

    :goto_28
    if-ne v5, v2, :cond_3e

    const/4 v2, 0x1

    goto :goto_29

    :cond_3e
    const/4 v2, 0x0

    :goto_29
    invoke-virtual {v1, v3, v2}, La/O3;->z(ZZ)V

    goto :goto_2a

    :cond_3f
    move-object/from16 v25, v7

    move-object/from16 v18, v8

    move/from16 v17, v9

    move/from16 v20, v10

    move/from16 v24, v11

    move-object/from16 v11, v19

    const/4 v0, 0x0

    const/4 v4, 0x0

    :cond_40
    :goto_2a
    if-eqz v0, :cond_42

    const/4 v0, 0x2

    if-eq v4, v0, :cond_41

    goto :goto_2b

    :cond_41
    return-void

    :cond_42
    :goto_2b
    const/16 v0, 0x8

    if-lez v17, :cond_4c

    iget-object v2, v1, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget-object v3, v1, La/O3;->h0:La/e2$b;

    const/4 v4, 0x0

    :goto_2c
    if-ge v4, v2, :cond_46

    iget-object v5, v1, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/N3;

    instance-of v6, v5, La/a8;

    if-eqz v6, :cond_43

    :goto_2d
    move-object/from16 v7, v25

    goto :goto_2e

    :cond_43
    iget-object v6, v5, La/N3;->d:La/K8;

    iget-object v6, v6, La/ih;->e:La/l5;

    iget-boolean v6, v6, La/V4;->j:Z

    if-eqz v6, :cond_44

    iget-object v6, v5, La/N3;->e:La/og;

    iget-object v6, v6, La/ih;->e:La/l5;

    iget-boolean v6, v6, La/V4;->j:Z

    if-eqz v6, :cond_44

    goto :goto_2d

    :cond_44
    const/4 v6, 0x0

    invoke-virtual {v5, v6}, La/N3;->h(I)La/N3$a;

    move-result-object v7

    const/4 v6, 0x1

    invoke-virtual {v5, v6}, La/N3;->h(I)La/N3$a;

    move-result-object v8

    if-ne v7, v14, :cond_45

    iget v7, v5, La/N3;->j:I

    if-eq v7, v6, :cond_45

    if-ne v8, v14, :cond_45

    iget v7, v5, La/N3;->k:I

    if-eq v7, v6, :cond_45

    goto :goto_2d

    :cond_45
    move-object/from16 v7, v25

    const/4 v6, 0x0

    invoke-virtual {v7, v3, v5, v6}, La/e2;->a(La/e2$b;La/N3;Z)Z

    :goto_2e
    add-int/lit8 v4, v4, 0x1

    move-object/from16 v25, v7

    goto :goto_2c

    :cond_46
    move-object/from16 v7, v25

    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iget-object v2, v3, Landroidx/constraintlayout/widget/ConstraintLayout$b;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    const/4 v8, 0x0

    :goto_2f
    if-ge v8, v3, :cond_4b

    invoke-virtual {v2, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    instance-of v5, v4, Landroidx/constraintlayout/widget/h;

    if-eqz v5, :cond_4a

    check-cast v4, Landroidx/constraintlayout/widget/h;

    iget-object v5, v4, Landroidx/constraintlayout/widget/h;->b:Landroid/view/View;

    if-nez v5, :cond_47

    goto :goto_30

    :cond_47
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v4, v4, Landroidx/constraintlayout/widget/h;->b:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v6, v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:La/N3;

    const/4 v13, 0x0

    iput v13, v6, La/N3;->X:I

    iget-object v9, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:La/N3;

    iget-object v10, v9, La/N3;->J:[La/N3$a;

    aget-object v10, v10, v13

    if-eq v10, v11, :cond_48

    invoke-virtual {v6}, La/N3;->l()I

    move-result v6

    invoke-virtual {v9, v6}, La/N3;->y(I)V

    :cond_48
    iget-object v5, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:La/N3;

    iget-object v6, v5, La/N3;->J:[La/N3$a;

    const/16 v21, 0x1

    aget-object v6, v6, v21

    if-eq v6, v11, :cond_49

    iget-object v6, v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:La/N3;

    invoke-virtual {v6}, La/N3;->i()I

    move-result v6

    invoke-virtual {v5, v6}, La/N3;->v(I)V

    :cond_49
    iget-object v4, v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:La/N3;

    iput v0, v4, La/N3;->X:I

    :cond_4a
    :goto_30
    add-int/lit8 v8, v8, 0x1

    goto :goto_2f

    :cond_4b
    iget-object v2, v2, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-lez v3, :cond_4d

    const/4 v8, 0x0

    :goto_31
    if-ge v8, v3, :cond_4d

    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/constraintlayout/widget/c;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 v8, v8, 0x1

    goto :goto_31

    :cond_4c
    move-object/from16 v7, v25

    :cond_4d
    iget v2, v1, La/O3;->q0:I

    iget-object v3, v7, La/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v4

    move/from16 v5, v20

    move/from16 v6, v24

    if-lez v17, :cond_4e

    invoke-virtual {v7, v1, v5, v6}, La/e2;->b(La/O3;II)V

    :cond_4e
    if-lez v4, :cond_68

    iget-object v8, v1, La/N3;->J:[La/N3$a;

    const/16 v16, 0x0

    aget-object v9, v8, v16

    if-ne v9, v15, :cond_4f

    const/4 v9, 0x1

    :goto_32
    const/16 v21, 0x1

    goto :goto_33

    :cond_4f
    move/from16 v9, v16

    goto :goto_32

    :goto_33
    aget-object v8, v8, v21

    if-ne v8, v15, :cond_50

    const/4 v8, 0x1

    goto :goto_34

    :cond_50
    move/from16 v8, v16

    :goto_34
    invoke-virtual {v1}, La/N3;->l()I

    move-result v10

    iget-object v11, v7, La/e2;->c:La/O3;

    iget v12, v11, La/N3;->S:I

    invoke-static {v10, v12}, Ljava/lang/Math;->max(II)I

    move-result v10

    invoke-virtual {v1}, La/N3;->i()I

    move-result v12

    iget v11, v11, La/N3;->T:I

    invoke-static {v12, v11}, Ljava/lang/Math;->max(II)I

    move-result v11

    move v12, v10

    move v13, v11

    move/from16 v10, v16

    move v11, v10

    :goto_35
    sget-object v14, La/M3$a;->d:La/M3$a;

    sget-object v15, La/M3$a;->c:La/M3$a;

    if-ge v10, v4, :cond_56

    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v0, v17

    check-cast v0, La/N3;

    move/from16 v17, v8

    instance-of v8, v0, La/Yg;

    if-nez v8, :cond_51

    move/from16 v21, v2

    move/from16 v19, v9

    move/from16 v20, v10

    move v0, v11

    move-object/from16 v11, v18

    goto/16 :goto_36

    :cond_51
    invoke-virtual {v0}, La/N3;->l()I

    move-result v8

    move/from16 v19, v9

    invoke-virtual {v0}, La/N3;->i()I

    move-result v9

    move-object/from16 v20, v18

    move/from16 v18, v11

    move-object/from16 v11, v20

    move/from16 v20, v10

    const/4 v10, 0x1

    invoke-virtual {v7, v11, v0, v10}, La/e2;->a(La/e2$b;La/N3;Z)Z

    move-result v21

    or-int v10, v18, v21

    move/from16 v18, v10

    invoke-virtual {v0}, La/N3;->l()I

    move-result v10

    move/from16 v21, v2

    invoke-virtual {v0}, La/N3;->i()I

    move-result v2

    if-eq v10, v8, :cond_53

    invoke-virtual {v0, v10}, La/N3;->y(I)V

    if-eqz v19, :cond_52

    invoke-virtual {v0}, La/N3;->m()I

    move-result v8

    iget v10, v0, La/N3;->L:I

    add-int/2addr v8, v10

    if-le v8, v12, :cond_52

    invoke-virtual {v0}, La/N3;->m()I

    move-result v8

    iget v10, v0, La/N3;->L:I

    add-int/2addr v8, v10

    invoke-virtual {v0, v15}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v10

    invoke-virtual {v10}, La/M3;->c()I

    move-result v10

    add-int/2addr v10, v8

    invoke-static {v12, v10}, Ljava/lang/Math;->max(II)I

    move-result v12

    :cond_52
    const/16 v18, 0x1

    :cond_53
    if-eq v2, v9, :cond_55

    invoke-virtual {v0, v2}, La/N3;->v(I)V

    if-eqz v17, :cond_54

    invoke-virtual {v0}, La/N3;->n()I

    move-result v2

    iget v8, v0, La/N3;->M:I

    add-int/2addr v2, v8

    if-le v2, v13, :cond_54

    invoke-virtual {v0}, La/N3;->n()I

    move-result v2

    iget v8, v0, La/N3;->M:I

    add-int/2addr v2, v8

    invoke-virtual {v0, v14}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v8

    invoke-virtual {v8}, La/M3;->c()I

    move-result v8

    add-int/2addr v8, v2

    invoke-static {v13, v8}, Ljava/lang/Math;->max(II)I

    move-result v13

    :cond_54
    const/16 v18, 0x1

    :cond_55
    check-cast v0, La/Yg;

    iget-boolean v0, v0, La/Yg;->m0:Z

    or-int v0, v18, v0

    :goto_36
    add-int/lit8 v10, v20, 0x1

    move-object/from16 v18, v11

    move/from16 v8, v17

    move/from16 v9, v19

    move/from16 v2, v21

    move v11, v0

    const/16 v0, 0x8

    goto/16 :goto_35

    :cond_56
    move-object/from16 v17, v18

    move/from16 v18, v11

    move-object/from16 v11, v17

    move/from16 v21, v2

    move/from16 v17, v8

    move/from16 v19, v9

    move/from16 v8, v16

    :goto_37
    const/4 v0, 0x2

    if-ge v8, v0, :cond_64

    move/from16 v2, v16

    :goto_38
    if-ge v2, v4, :cond_62

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, La/N3;

    instance-of v10, v9, La/f8;

    if-eqz v10, :cond_58

    instance-of v10, v9, La/Yg;

    if-eqz v10, :cond_57

    goto :goto_3a

    :cond_57
    :goto_39
    const/16 v0, 0x8

    goto :goto_3b

    :cond_58
    :goto_3a
    instance-of v10, v9, La/a8;

    if-eqz v10, :cond_59

    goto :goto_39

    :cond_59
    iget v10, v9, La/N3;->X:I

    const/16 v0, 0x8

    if-ne v10, v0, :cond_5a

    goto :goto_3b

    :cond_5a
    iget-object v10, v9, La/N3;->d:La/K8;

    iget-object v10, v10, La/ih;->e:La/l5;

    iget-boolean v10, v10, La/V4;->j:Z

    if-eqz v10, :cond_5b

    iget-object v10, v9, La/N3;->e:La/og;

    iget-object v10, v10, La/ih;->e:La/l5;

    iget-boolean v10, v10, La/V4;->j:Z

    if-eqz v10, :cond_5b

    goto :goto_3b

    :cond_5b
    instance-of v10, v9, La/Yg;

    if-eqz v10, :cond_5c

    :goto_3b
    move/from16 v20, v2

    move-object/from16 v22, v3

    move/from16 v23, v4

    goto/16 :goto_3c

    :cond_5c
    invoke-virtual {v9}, La/N3;->l()I

    move-result v10

    invoke-virtual {v9}, La/N3;->i()I

    move-result v0

    move/from16 v20, v2

    iget v2, v9, La/N3;->R:I

    move-object/from16 v22, v3

    const/4 v3, 0x1

    invoke-virtual {v7, v11, v9, v3}, La/e2;->a(La/e2$b;La/N3;Z)Z

    move-result v23

    or-int v18, v18, v23

    invoke-virtual {v9}, La/N3;->l()I

    move-result v3

    move/from16 v23, v4

    invoke-virtual {v9}, La/N3;->i()I

    move-result v4

    if-eq v3, v10, :cond_5e

    invoke-virtual {v9, v3}, La/N3;->y(I)V

    if-eqz v19, :cond_5d

    invoke-virtual {v9}, La/N3;->m()I

    move-result v3

    iget v10, v9, La/N3;->L:I

    add-int/2addr v3, v10

    if-le v3, v12, :cond_5d

    invoke-virtual {v9}, La/N3;->m()I

    move-result v3

    iget v10, v9, La/N3;->L:I

    add-int/2addr v3, v10

    invoke-virtual {v9, v15}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v10

    invoke-virtual {v10}, La/M3;->c()I

    move-result v10

    add-int/2addr v10, v3

    invoke-static {v12, v10}, Ljava/lang/Math;->max(II)I

    move-result v12

    :cond_5d
    const/16 v18, 0x1

    :cond_5e
    if-eq v4, v0, :cond_60

    invoke-virtual {v9, v4}, La/N3;->v(I)V

    if-eqz v17, :cond_5f

    invoke-virtual {v9}, La/N3;->n()I

    move-result v0

    iget v3, v9, La/N3;->M:I

    add-int/2addr v0, v3

    if-le v0, v13, :cond_5f

    invoke-virtual {v9}, La/N3;->n()I

    move-result v0

    iget v3, v9, La/N3;->M:I

    add-int/2addr v0, v3

    invoke-virtual {v9, v14}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v3

    invoke-virtual {v3}, La/M3;->c()I

    move-result v3

    add-int/2addr v3, v0

    invoke-static {v13, v3}, Ljava/lang/Math;->max(II)I

    move-result v13

    :cond_5f
    const/16 v18, 0x1

    :cond_60
    iget-boolean v0, v9, La/N3;->w:Z

    if-eqz v0, :cond_61

    iget v0, v9, La/N3;->R:I

    if-eq v2, v0, :cond_61

    const/16 v18, 0x1

    :cond_61
    :goto_3c
    add-int/lit8 v2, v20, 0x1

    move-object/from16 v3, v22

    move/from16 v4, v23

    const/4 v0, 0x2

    goto/16 :goto_38

    :cond_62
    move-object/from16 v22, v3

    move/from16 v23, v4

    if-eqz v18, :cond_63

    invoke-virtual {v7, v1, v5, v6}, La/e2;->b(La/O3;II)V

    move/from16 v18, v16

    :cond_63
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v3, v22

    move/from16 v4, v23

    goto/16 :goto_37

    :cond_64
    if-eqz v18, :cond_67

    invoke-virtual {v7, v1, v5, v6}, La/e2;->b(La/O3;II)V

    invoke-virtual {v1}, La/N3;->l()I

    move-result v0

    if-ge v0, v12, :cond_65

    invoke-virtual {v1, v12}, La/N3;->y(I)V

    const/4 v8, 0x1

    goto :goto_3d

    :cond_65
    move/from16 v8, v16

    :goto_3d
    invoke-virtual {v1}, La/N3;->i()I

    move-result v0

    if-ge v0, v13, :cond_66

    invoke-virtual {v1, v13}, La/N3;->v(I)V

    const/4 v11, 0x1

    goto :goto_3e

    :cond_66
    move v11, v8

    :goto_3e
    if-eqz v11, :cond_67

    invoke-virtual {v7, v1, v5, v6}, La/e2;->b(La/O3;II)V

    :cond_67
    move/from16 v0, v21

    goto :goto_3f

    :cond_68
    const/16 v16, 0x0

    move v0, v2

    :goto_3f
    iput v0, v1, La/O3;->q0:I

    const/16 v1, 0x100

    and-int/2addr v0, v1

    if-ne v0, v1, :cond_69

    const/4 v8, 0x1

    goto :goto_40

    :cond_69
    move/from16 v8, v16

    :goto_40
    sput-boolean v8, La/B9;->p:Z

    return-void
.end method

.method public final forceLayout()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    invoke-super {p0}, Landroid/view/View;->forceLayout()V

    return-void
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-direct {v0}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>()V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-object v0
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .line 2
    new-instance v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    invoke-direct {v0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout$a;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    return-object v0
.end method

.method public getMaxHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    return v0
.end method

.method public getMaxWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    return v0
.end method

.method public getMinHeight()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    return v0
.end method

.method public getMinWidth()I
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    return v0
.end method

.method public getOptimizationLevel()I
    .locals 1

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:La/O3;

    iget v0, v0, La/O3;->q0:I

    return v0
.end method

.method public onLayout(ZIIII)V
    .locals 5

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p2

    const/4 p3, 0x0

    move p4, p3

    :goto_0
    if-ge p4, p1, :cond_3

    invoke-virtual {p0, p4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p5

    invoke-virtual {p5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:La/N3;

    invoke-virtual {p5}, Landroid/view/View;->getVisibility()I

    move-result v2

    const/16 v3, 0x8

    if-ne v2, v3, :cond_0

    iget-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-nez v2, :cond_0

    iget-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    if-nez v2, :cond_0

    if-nez p2, :cond_0

    goto :goto_1

    :cond_0
    iget-boolean v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a0:Z

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, La/N3;->m()I

    move-result v0

    invoke-virtual {v1}, La/N3;->n()I

    move-result v2

    invoke-virtual {v1}, La/N3;->l()I

    move-result v3

    add-int/2addr v3, v0

    invoke-virtual {v1}, La/N3;->i()I

    move-result v1

    add-int/2addr v1, v2

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    instance-of v4, p5, Landroidx/constraintlayout/widget/h;

    if-eqz v4, :cond_2

    check-cast p5, Landroidx/constraintlayout/widget/h;

    invoke-virtual {p5}, Landroidx/constraintlayout/widget/h;->getContent()Landroid/view/View;

    move-result-object p5

    if-eqz p5, :cond_2

    invoke-virtual {p5, p3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p5, v0, v2, v3, v1}, Landroid/view/View;->layout(IIII)V

    :cond_2
    :goto_1
    add-int/lit8 p4, p4, 0x1

    goto :goto_0

    :cond_3
    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p2

    if-lez p2, :cond_4

    :goto_2
    if-ge p3, p2, :cond_4

    invoke-virtual {p1, p3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Landroidx/constraintlayout/widget/c;

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    add-int/lit8 p3, p3, 0x1

    goto :goto_2

    :cond_4
    return-void
.end method

.method public onMeasure(II)V
    .locals 36

    move-object/from16 v0, p0

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v3

    iget v3, v3, Landroid/content/pm/ApplicationInfo;->flags:I

    const/high16 v4, 0x400000

    and-int/2addr v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    move-result v3

    if-ne v5, v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    iget-object v6, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:La/O3;

    iput-boolean v3, v6, La/O3;->i0:Z

    iget-boolean v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    if-eqz v3, :cond_54

    iput-boolean v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v3

    move v7, v4

    :goto_1
    if-ge v7, v3, :cond_2

    invoke-virtual {v0, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    invoke-virtual {v8}, Landroid/view/View;->isLayoutRequested()Z

    move-result v8

    if-eqz v8, :cond_1

    move v3, v5

    goto :goto_2

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_2
    move v3, v4

    :goto_2
    sget-object v7, La/N3$a;->c:La/N3$a;

    sget-object v8, La/N3$a;->d:La/N3$a;

    if-eqz v3, :cond_4f

    invoke-virtual {v0}, Landroid/view/View;->isInEditMode()Z

    move-result v9

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v10

    move v11, v4

    :goto_3
    if-ge v11, v10, :cond_4

    invoke-virtual {v0, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v12

    invoke-virtual {v0, v12}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroid/view/View;)La/N3;

    move-result-object v12

    if-nez v12, :cond_3

    goto :goto_4

    :cond_3
    invoke-virtual {v12}, La/N3;->s()V

    :goto_4
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_4
    iget-object v11, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    const/4 v13, -0x1

    if-eqz v9, :cond_d

    move v14, v4

    :goto_5
    if-ge v14, v10, :cond_d

    invoke-virtual {v0, v14}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v15

    move/from16 v16, v5

    :try_start_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v15}, Landroid/view/View;->getId()I

    move-result v12

    invoke-virtual {v5, v12}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15}, Landroid/view/View;->getId()I

    move-result v12

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    if-eqz v5, :cond_7

    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    if-nez v4, :cond_5

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    iput-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    :cond_5
    const-string v4, "/"

    invoke-virtual {v5, v4}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v4

    if-eq v4, v13, :cond_6

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v5, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    goto :goto_6

    :cond_6
    move-object v4, v5

    :goto_6
    iget-object v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->m:Ljava/util/HashMap;

    invoke-virtual {v13, v4, v12}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    const/16 v4, 0x2f

    invoke-virtual {v5, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v12, -0x1

    if-eq v4, v12, :cond_8

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v5, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    :cond_8
    invoke-virtual {v15}, Landroid/view/View;->getId()I

    move-result v4

    if-nez v4, :cond_9

    :goto_7
    move-object v4, v6

    goto :goto_8

    :cond_9
    invoke-virtual {v11, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/view/View;

    if-nez v12, :cond_a

    invoke-virtual {v0, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v12

    if-eqz v12, :cond_a

    if-eq v12, v0, :cond_a

    invoke-virtual {v12}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-ne v4, v0, :cond_a

    invoke-virtual {v0, v12}, Landroidx/constraintlayout/widget/ConstraintLayout;->onViewAdded(Landroid/view/View;)V

    :cond_a
    if-ne v12, v0, :cond_b

    goto :goto_7

    :cond_b
    if-nez v12, :cond_c

    const/4 v4, 0x0

    goto :goto_8

    :cond_c
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v4, v4, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:La/N3;

    :goto_8
    iput-object v5, v4, La/N3;->Y:Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    add-int/lit8 v14, v14, 0x1

    move/from16 v5, v16

    const/4 v4, 0x0

    const/4 v13, -0x1

    goto/16 :goto_5

    :cond_d
    move/from16 v16, v5

    iget v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    const/4 v12, -0x1

    if-eq v4, v12, :cond_f

    const/4 v4, 0x0

    :goto_9
    if-ge v4, v10, :cond_f

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v12

    iget v13, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->l:I

    if-ne v12, v13, :cond_e

    instance-of v12, v5, Landroidx/constraintlayout/widget/f;

    if-eqz v12, :cond_e

    check-cast v5, Landroidx/constraintlayout/widget/f;

    invoke-virtual {v5}, Landroidx/constraintlayout/widget/f;->getConstraintSet()Landroidx/constraintlayout/widget/e;

    move-result-object v5

    iput-object v5, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/e;

    :cond_e
    add-int/lit8 v4, v4, 0x1

    goto :goto_9

    :cond_f
    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/e;

    if-eqz v4, :cond_10

    invoke-virtual {v4, v0}, Landroidx/constraintlayout/widget/e;->a(Landroidx/constraintlayout/widget/ConstraintLayout;)V

    :cond_10
    iget-object v4, v6, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    iget-object v4, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-lez v5, :cond_19

    const/4 v13, 0x0

    :goto_a
    if-ge v13, v5, :cond_19

    invoke-virtual {v4, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Landroidx/constraintlayout/widget/c;

    invoke-virtual {v14}, Landroid/view/View;->isInEditMode()Z

    move-result v15

    if-eqz v15, :cond_11

    iget-object v15, v14, Landroidx/constraintlayout/widget/c;->e:Ljava/lang/String;

    invoke-virtual {v14, v15}, Landroidx/constraintlayout/widget/c;->setIds(Ljava/lang/String;)V

    :cond_11
    iget-object v15, v14, Landroidx/constraintlayout/widget/c;->d:La/f8;

    if-nez v15, :cond_12

    move/from16 v19, v3

    move-object/from16 v21, v4

    move/from16 v22, v5

    const/16 v18, 0x2

    goto/16 :goto_e

    :cond_12
    const/4 v12, 0x0

    const/16 v18, 0x2

    iput v12, v15, La/f8;->f0:I

    iget-object v12, v15, La/f8;->e0:[La/N3;

    const/4 v15, 0x0

    invoke-static {v12, v15}, Ljava/util/Arrays;->fill([Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v12, 0x0

    :goto_b
    iget v15, v14, Landroidx/constraintlayout/widget/c;->b:I

    if-ge v12, v15, :cond_18

    iget-object v15, v14, Landroidx/constraintlayout/widget/c;->a:[I

    aget v15, v15, v12

    move/from16 v19, v3

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v3, v15}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    if-nez v3, :cond_13

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    move-object/from16 v20, v3

    iget-object v3, v14, Landroidx/constraintlayout/widget/c;->f:Ljava/util/HashMap;

    invoke-virtual {v3, v15}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    move-object/from16 v21, v4

    invoke-virtual {v14, v0, v15}, Landroidx/constraintlayout/widget/c;->d(Landroidx/constraintlayout/widget/ConstraintLayout;Ljava/lang/String;)I

    move-result v4

    move/from16 v22, v5

    if-eqz v4, :cond_14

    iget-object v5, v14, Landroidx/constraintlayout/widget/c;->a:[I

    aput v4, v5, v12

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3, v5, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/View;

    goto :goto_c

    :cond_13
    move-object/from16 v20, v3

    move-object/from16 v21, v4

    move/from16 v22, v5

    :cond_14
    move-object/from16 v3, v20

    :goto_c
    if-eqz v3, :cond_17

    iget-object v4, v14, Landroidx/constraintlayout/widget/c;->d:La/f8;

    invoke-virtual {v0, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroid/view/View;)La/N3;

    move-result-object v3

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eq v3, v4, :cond_17

    if-nez v3, :cond_15

    goto :goto_d

    :cond_15
    iget v5, v4, La/f8;->f0:I

    add-int/lit8 v5, v5, 0x1

    iget-object v15, v4, La/f8;->e0:[La/N3;

    move-object/from16 v20, v3

    array-length v3, v15

    if-le v5, v3, :cond_16

    array-length v3, v15

    mul-int/lit8 v3, v3, 0x2

    invoke-static {v15, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [La/N3;

    iput-object v3, v4, La/f8;->e0:[La/N3;

    :cond_16
    iget-object v3, v4, La/f8;->e0:[La/N3;

    iget v5, v4, La/f8;->f0:I

    aput-object v20, v3, v5

    add-int/lit8 v5, v5, 0x1

    iput v5, v4, La/f8;->f0:I

    :cond_17
    :goto_d
    add-int/lit8 v12, v12, 0x1

    move/from16 v3, v19

    move-object/from16 v4, v21

    move/from16 v5, v22

    goto/16 :goto_b

    :cond_18
    move/from16 v19, v3

    move-object/from16 v21, v4

    move/from16 v22, v5

    iget-object v3, v14, Landroidx/constraintlayout/widget/c;->d:La/f8;

    invoke-virtual {v3}, La/f8;->B()V

    :goto_e
    add-int/lit8 v13, v13, 0x1

    move/from16 v3, v19

    move-object/from16 v4, v21

    move/from16 v5, v22

    goto/16 :goto_a

    :cond_19
    move/from16 v19, v3

    const/16 v18, 0x2

    const/4 v3, 0x0

    :goto_f
    if-ge v3, v10, :cond_1c

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    instance-of v5, v4, Landroidx/constraintlayout/widget/h;

    if-eqz v5, :cond_1b

    check-cast v4, Landroidx/constraintlayout/widget/h;

    iget v5, v4, Landroidx/constraintlayout/widget/h;->a:I

    const/4 v12, -0x1

    if-ne v5, v12, :cond_1a

    invoke-virtual {v4}, Landroid/view/View;->isInEditMode()Z

    move-result v5

    if-nez v5, :cond_1a

    iget v5, v4, Landroidx/constraintlayout/widget/h;->c:I

    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    :cond_1a
    iget v5, v4, Landroidx/constraintlayout/widget/h;->a:I

    invoke-virtual {v0, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    iput-object v5, v4, Landroidx/constraintlayout/widget/h;->b:Landroid/view/View;

    if-eqz v5, :cond_1b

    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    check-cast v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move/from16 v12, v16

    iput-boolean v12, v5, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a0:Z

    iget-object v5, v4, Landroidx/constraintlayout/widget/h;->b:Landroid/view/View;

    const/4 v12, 0x0

    invoke-virtual {v5, v12}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {v4, v12}, Landroid/view/View;->setVisibility(I)V

    goto :goto_10

    :cond_1b
    const/4 v12, 0x0

    :goto_10
    add-int/lit8 v3, v3, 0x1

    const/16 v16, 0x1

    goto :goto_f

    :cond_1c
    const/4 v12, 0x0

    iget-object v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->n:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->clear()V

    invoke-virtual {v3, v12, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v4

    invoke-virtual {v3, v4, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/4 v4, 0x0

    :goto_11
    if-ge v4, v10, :cond_1d

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroid/view/View;)La/N3;

    move-result-object v12

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v5

    invoke-virtual {v3, v5, v12}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_11

    :cond_1d
    const/4 v4, 0x0

    :goto_12
    if-ge v4, v10, :cond_50

    invoke-virtual {v0, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroid/view/View;)La/N3;

    move-result-object v12

    if-nez v12, :cond_1f

    :cond_1e
    :goto_13
    move-object/from16 v20, v3

    move/from16 v26, v4

    move/from16 v27, v9

    move/from16 v29, v10

    move-object/from16 v21, v11

    move/from16 v0, v18

    const/4 v9, -0x1

    goto/16 :goto_2a

    :cond_1f
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iget-object v14, v6, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget-object v14, v12, La/N3;->K:La/N3;

    if-eqz v14, :cond_20

    check-cast v14, La/hh;

    iget-object v14, v14, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v15, 0x0

    iput-object v15, v12, La/N3;->K:La/N3;

    goto :goto_14

    :cond_20
    const/4 v15, 0x0

    :goto_14
    iput-object v6, v12, La/N3;->K:La/N3;

    invoke-virtual {v13}, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a()V

    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v14

    iput v14, v12, La/N3;->X:I

    iget-boolean v14, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->a0:Z

    if-eqz v14, :cond_21

    const/4 v14, 0x1

    iput-boolean v14, v12, La/N3;->x:Z

    const/16 v14, 0x8

    iput v14, v12, La/N3;->X:I

    :cond_21
    iput-object v5, v12, La/N3;->W:Landroid/view/View;

    instance-of v14, v5, Landroidx/constraintlayout/widget/c;

    if-eqz v14, :cond_22

    check-cast v5, Landroidx/constraintlayout/widget/c;

    iget-boolean v14, v6, La/O3;->i0:Z

    invoke-virtual {v5, v12, v14}, Landroidx/constraintlayout/widget/c;->f(La/N3;Z)V

    :cond_22
    iget-boolean v5, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    if-eqz v5, :cond_26

    check-cast v12, La/a8;

    iget v5, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i0:I

    iget v14, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j0:I

    iget v13, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k0:F

    const/high16 v15, -0x40800000    # -1.0f

    cmpl-float v20, v13, v15

    if-eqz v20, :cond_23

    if-lez v20, :cond_1e

    iput v13, v12, La/a8;->e0:F

    const/4 v13, -0x1

    iput v13, v12, La/a8;->f0:I

    iput v13, v12, La/a8;->g0:I

    goto :goto_15

    :cond_23
    const/4 v13, -0x1

    if-eq v5, v13, :cond_25

    if-le v5, v13, :cond_24

    iput v15, v12, La/a8;->e0:F

    iput v5, v12, La/a8;->f0:I

    iput v13, v12, La/a8;->g0:I

    :cond_24
    :goto_15
    move-object/from16 v20, v3

    move/from16 v26, v4

    move/from16 v27, v9

    move/from16 v29, v10

    move-object/from16 v21, v11

    move v9, v13

    move/from16 v0, v18

    goto/16 :goto_2a

    :cond_25
    if-eq v14, v13, :cond_24

    if-le v14, v13, :cond_24

    iput v15, v12, La/a8;->e0:F

    iput v13, v12, La/a8;->f0:I

    iput v14, v12, La/a8;->g0:I

    goto/16 :goto_13

    :cond_26
    iget v5, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->b0:I

    iget v14, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->c0:I

    iget v15, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->d0:I

    move/from16 v26, v4

    iget v4, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->e0:I

    move/from16 v27, v9

    iget v9, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->f0:I

    move/from16 v25, v9

    iget v9, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->g0:I

    move/from16 v28, v9

    iget v9, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h0:F

    move/from16 v29, v10

    iget v10, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->m:I

    sget-object v30, La/M3$a;->c:La/M3$a;

    sget-object v31, La/M3$a;->a:La/M3$a;

    sget-object v32, La/M3$a;->d:La/M3$a;

    sget-object v33, La/M3$a;->b:La/M3$a;

    move-object/from16 v20, v12

    const/4 v12, -0x1

    const/16 v34, 0x0

    if-eq v10, v12, :cond_28

    invoke-virtual {v3, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v22, v4

    check-cast v22, La/N3;

    if-eqz v22, :cond_27

    iget v4, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->o:F

    iget v5, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->n:I

    sget-object v21, La/M3$a;->f:La/M3$a;

    const/16 v25, 0x0

    move-object/from16 v23, v21

    move/from16 v24, v5

    invoke-virtual/range {v20 .. v25}, La/N3;->o(La/M3$a;La/N3;La/M3$a;II)V

    move-object/from16 v10, v20

    iput v4, v10, La/N3;->v:F

    goto :goto_16

    :cond_27
    move-object/from16 v10, v20

    :goto_16
    move-object/from16 v20, v3

    move-object v12, v10

    move-object/from16 v21, v11

    move-object/from16 v4, v30

    move-object/from16 v5, v31

    move-object/from16 v14, v32

    move-object/from16 v10, v33

    goto/16 :goto_20

    :cond_28
    move-object/from16 v10, v20

    if-eq v5, v12, :cond_2b

    invoke-virtual {v3, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v22, v5

    check-cast v22, La/N3;

    if-eqz v22, :cond_29

    iget v5, v13, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move-object/from16 v23, v31

    move/from16 v24, v5

    move-object/from16 v20, v10

    move-object/from16 v21, v31

    invoke-virtual/range {v20 .. v25}, La/N3;->o(La/M3$a;La/N3;La/M3$a;II)V

    goto :goto_17

    :cond_29
    move-object/from16 v20, v10

    move-object/from16 v21, v31

    :cond_2a
    :goto_17
    move-object/from16 v23, v21

    move-object/from16 v21, v30

    goto :goto_18

    :cond_2b
    move-object/from16 v20, v10

    move-object/from16 v21, v31

    if-eq v14, v12, :cond_2a

    invoke-virtual {v3, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v22, v5

    check-cast v22, La/N3;

    if-eqz v22, :cond_2a

    iget v5, v13, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    move/from16 v24, v5

    move-object/from16 v23, v30

    invoke-virtual/range {v20 .. v25}, La/N3;->o(La/M3$a;La/N3;La/M3$a;II)V

    move-object/from16 v35, v23

    move-object/from16 v23, v21

    move-object/from16 v21, v35

    :goto_18
    if-eq v15, v12, :cond_2e

    invoke-virtual {v3, v15}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v22, v4

    check-cast v22, La/N3;

    if-eqz v22, :cond_2c

    iget v4, v13, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move/from16 v24, v4

    move/from16 v25, v28

    invoke-virtual/range {v20 .. v25}, La/N3;->o(La/M3$a;La/N3;La/M3$a;II)V

    :cond_2c
    move-object/from16 v5, v23

    :cond_2d
    :goto_19
    move-object/from16 v4, v21

    goto :goto_1a

    :cond_2e
    move-object/from16 v5, v23

    move/from16 v25, v28

    if-eq v4, v12, :cond_2d

    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v22, v4

    check-cast v22, La/N3;

    if-eqz v22, :cond_2d

    iget v4, v13, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move-object/from16 v23, v21

    move/from16 v24, v4

    invoke-virtual/range {v20 .. v25}, La/N3;->o(La/M3$a;La/N3;La/M3$a;II)V

    goto :goto_19

    :goto_1a
    iget v10, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->h:I

    if-eq v10, v12, :cond_30

    invoke-virtual {v3, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v22, v10

    check-cast v22, La/N3;

    if-eqz v22, :cond_2f

    iget v10, v13, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v12, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->u:I

    move-object/from16 v23, v33

    move/from16 v24, v10

    move/from16 v25, v12

    move-object/from16 v21, v33

    invoke-virtual/range {v20 .. v25}, La/N3;->o(La/M3$a;La/N3;La/M3$a;II)V

    goto :goto_1b

    :cond_2f
    move-object/from16 v21, v33

    :goto_1b
    move-object/from16 v23, v21

    move-object/from16 v21, v32

    const/4 v12, -0x1

    goto :goto_1c

    :cond_30
    move-object/from16 v21, v33

    iget v10, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->i:I

    const/4 v12, -0x1

    if-eq v10, v12, :cond_31

    invoke-virtual {v3, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v22, v10

    check-cast v22, La/N3;

    if-eqz v22, :cond_31

    iget v10, v13, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget v14, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->u:I

    move/from16 v24, v10

    move/from16 v25, v14

    move-object/from16 v23, v32

    invoke-virtual/range {v20 .. v25}, La/N3;->o(La/M3$a;La/N3;La/M3$a;II)V

    move-object/from16 v35, v23

    move-object/from16 v23, v21

    move-object/from16 v21, v35

    goto :goto_1c

    :cond_31
    move-object/from16 v23, v21

    move-object/from16 v21, v32

    :goto_1c
    iget v10, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->j:I

    if-eq v10, v12, :cond_34

    invoke-virtual {v3, v10}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v22, v10

    check-cast v22, La/N3;

    if-eqz v22, :cond_32

    iget v10, v13, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v14, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->w:I

    move/from16 v24, v10

    move/from16 v25, v14

    invoke-virtual/range {v20 .. v25}, La/N3;->o(La/M3$a;La/N3;La/M3$a;II)V

    :cond_32
    move-object/from16 v10, v23

    :cond_33
    :goto_1d
    move-object/from16 v12, v20

    move-object/from16 v14, v21

    goto :goto_1e

    :cond_34
    move-object/from16 v10, v23

    iget v14, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->k:I

    if-eq v14, v12, :cond_33

    invoke-virtual {v3, v14}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v22, v12

    check-cast v22, La/N3;

    if-eqz v22, :cond_33

    iget v12, v13, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iget v14, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->w:I

    move-object/from16 v23, v21

    move/from16 v24, v12

    move/from16 v25, v14

    invoke-virtual/range {v20 .. v25}, La/N3;->o(La/M3$a;La/N3;La/M3$a;II)V

    goto :goto_1d

    :goto_1e
    iget v15, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    const/4 v1, -0x1

    if-eq v15, v1, :cond_35

    invoke-virtual {v11, v15}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    iget v15, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l:I

    invoke-virtual {v3, v15}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, La/N3;

    if-eqz v15, :cond_35

    if-eqz v1, :cond_35

    move-object/from16 v20, v1

    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    instance-of v1, v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    if-eqz v1, :cond_35

    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    move-object/from16 v20, v3

    const/4 v3, 0x1

    iput-boolean v3, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    iput-boolean v3, v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->X:Z

    sget-object v3, La/M3$a;->e:La/M3$a;

    move-object/from16 v21, v11

    invoke-virtual {v12, v3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v11

    invoke-virtual {v15, v3}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v3

    const/4 v0, -0x1

    const/4 v2, 0x1

    const/4 v15, 0x0

    invoke-virtual {v11, v3, v15, v0, v2}, La/M3;->b(La/M3;IIZ)Z

    iput-boolean v2, v12, La/N3;->w:Z

    iget-object v0, v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:La/N3;

    iput-boolean v2, v0, La/N3;->w:Z

    invoke-virtual {v12, v10}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v0

    invoke-virtual {v0}, La/M3;->h()V

    invoke-virtual {v12, v14}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v0

    invoke-virtual {v0}, La/M3;->h()V

    goto :goto_1f

    :cond_35
    move-object/from16 v20, v3

    move-object/from16 v21, v11

    :goto_1f
    cmpl-float v0, v9, v34

    if-ltz v0, :cond_36

    iput v9, v12, La/N3;->U:F

    :cond_36
    iget v0, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->A:F

    cmpl-float v1, v0, v34

    if-ltz v1, :cond_37

    iput v0, v12, La/N3;->V:F

    :cond_37
    :goto_20
    if-eqz v27, :cond_39

    iget v0, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->P:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_38

    iget v2, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    if-eq v2, v1, :cond_39

    :cond_38
    iget v1, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Q:I

    iput v0, v12, La/N3;->P:I

    iput v1, v12, La/N3;->Q:I

    :cond_39
    iget-boolean v0, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->V:Z

    sget-object v1, La/N3$a;->b:La/N3$a;

    sget-object v2, La/N3$a;->a:La/N3$a;

    const/4 v3, -0x2

    if-nez v0, :cond_3c

    iget v0, v13, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    const/4 v9, -0x1

    if-ne v0, v9, :cond_3b

    iget-boolean v0, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->S:Z

    if-eqz v0, :cond_3a

    invoke-virtual {v12, v7}, La/N3;->w(La/N3$a;)V

    goto :goto_21

    :cond_3a
    invoke-virtual {v12, v8}, La/N3;->w(La/N3$a;)V

    :goto_21
    invoke-virtual {v12, v5}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v0

    iget v5, v13, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    iput v5, v0, La/M3;->e:I

    invoke-virtual {v12, v4}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v0

    iget v4, v13, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    iput v4, v0, La/M3;->e:I

    goto :goto_22

    :cond_3b
    invoke-virtual {v12, v7}, La/N3;->w(La/N3$a;)V

    const/4 v15, 0x0

    invoke-virtual {v12, v15}, La/N3;->y(I)V

    goto :goto_22

    :cond_3c
    invoke-virtual {v12, v2}, La/N3;->w(La/N3$a;)V

    iget v0, v13, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    invoke-virtual {v12, v0}, La/N3;->y(I)V

    iget v0, v13, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    if-ne v0, v3, :cond_3d

    invoke-virtual {v12, v1}, La/N3;->w(La/N3$a;)V

    :cond_3d
    :goto_22
    iget-boolean v0, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->W:Z

    if-nez v0, :cond_40

    iget v0, v13, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    const/4 v9, -0x1

    if-ne v0, v9, :cond_3f

    iget-boolean v0, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->T:Z

    if-eqz v0, :cond_3e

    invoke-virtual {v12, v7}, La/N3;->x(La/N3$a;)V

    goto :goto_23

    :cond_3e
    invoke-virtual {v12, v8}, La/N3;->x(La/N3$a;)V

    :goto_23
    invoke-virtual {v12, v10}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v0

    iget v1, v13, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iput v1, v0, La/M3;->e:I

    invoke-virtual {v12, v14}, La/N3;->g(La/M3$a;)La/M3;

    move-result-object v0

    iget v1, v13, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    iput v1, v0, La/M3;->e:I

    goto :goto_24

    :cond_3f
    invoke-virtual {v12, v7}, La/N3;->x(La/N3$a;)V

    const/4 v15, 0x0

    invoke-virtual {v12, v15}, La/N3;->v(I)V

    goto :goto_24

    :cond_40
    const/4 v9, -0x1

    invoke-virtual {v12, v2}, La/N3;->x(La/N3$a;)V

    iget v0, v13, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    invoke-virtual {v12, v0}, La/N3;->v(I)V

    iget v0, v13, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    if-ne v0, v3, :cond_41

    invoke-virtual {v12, v1}, La/N3;->x(La/N3$a;)V

    :cond_41
    :goto_24
    iget-object v0, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->B:Ljava/lang/String;

    if-eqz v0, :cond_42

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_43

    :cond_42
    move/from16 v0, v34

    goto/16 :goto_28

    :cond_43
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x2c

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(I)I

    move-result v2

    if-lez v2, :cond_46

    add-int/lit8 v3, v1, -0x1

    if-ge v2, v3, :cond_46

    const/4 v15, 0x0

    invoke-virtual {v0, v15, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    const-string v4, "W"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_44

    const/4 v3, 0x0

    goto :goto_25

    :cond_44
    const-string v4, "H"

    invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_45

    const/4 v3, 0x1

    goto :goto_25

    :cond_45
    move v3, v9

    :goto_25
    add-int/lit8 v2, v2, 0x1

    goto :goto_26

    :cond_46
    move v3, v9

    const/4 v2, 0x0

    :goto_26
    const/16 v4, 0x3a

    invoke-virtual {v0, v4}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    if-ltz v4, :cond_48

    add-int/lit8 v1, v1, -0x1

    if-ge v4, v1, :cond_48

    invoke-virtual {v0, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_49

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_49

    :try_start_1
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    cmpl-float v2, v1, v34

    if-lez v2, :cond_49

    cmpl-float v2, v0, v34

    if-lez v2, :cond_49

    const/4 v14, 0x1

    if-ne v3, v14, :cond_47

    div-float/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    move-result v0

    goto :goto_27

    :cond_47
    div-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_27

    :cond_48
    invoke-virtual {v0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_49

    :try_start_2
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_27

    :catch_1
    :cond_49
    move/from16 v0, v34

    :goto_27
    cmpl-float v1, v0, v34

    if-lez v1, :cond_4a

    iput v0, v12, La/N3;->N:F

    iput v3, v12, La/N3;->O:I

    goto :goto_29

    :goto_28
    iput v0, v12, La/N3;->N:F

    :cond_4a
    :goto_29
    iget v0, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->D:F

    iget-object v1, v12, La/N3;->b0:[F

    const/16 v17, 0x0

    aput v0, v1, v17

    iget v0, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->E:F

    const/16 v16, 0x1

    aput v0, v1, v16

    iget v0, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->F:I

    iput v0, v12, La/N3;->Z:I

    iget v0, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->G:I

    iput v0, v12, La/N3;->a0:I

    iget v0, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->H:I

    iget v1, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->J:I

    iget v2, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->L:I

    iget v3, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->N:F

    iput v0, v12, La/N3;->j:I

    iput v1, v12, La/N3;->m:I

    const v1, 0x7fffffff

    if-ne v2, v1, :cond_4b

    const/4 v2, 0x0

    :cond_4b
    iput v2, v12, La/N3;->n:I

    iput v3, v12, La/N3;->o:F

    const/16 v34, 0x0

    cmpl-float v2, v3, v34

    const/high16 v4, 0x3f800000    # 1.0f

    if-lez v2, :cond_4c

    cmpg-float v2, v3, v4

    if-gez v2, :cond_4c

    if-nez v0, :cond_4c

    move/from16 v0, v18

    iput v0, v12, La/N3;->j:I

    :cond_4c
    iget v0, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->I:I

    iget v2, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->K:I

    iget v3, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->M:I

    iget v5, v13, Landroidx/constraintlayout/widget/ConstraintLayout$a;->O:F

    iput v0, v12, La/N3;->k:I

    iput v2, v12, La/N3;->p:I

    if-ne v3, v1, :cond_4d

    const/4 v3, 0x0

    :cond_4d
    iput v3, v12, La/N3;->q:I

    iput v5, v12, La/N3;->r:F

    const/16 v34, 0x0

    cmpl-float v1, v5, v34

    if-lez v1, :cond_4e

    cmpg-float v1, v5, v4

    if-gez v1, :cond_4e

    if-nez v0, :cond_4e

    const/4 v0, 0x2

    iput v0, v12, La/N3;->k:I

    goto :goto_2a

    :cond_4e
    const/4 v0, 0x2

    :goto_2a
    add-int/lit8 v4, v26, 0x1

    move/from16 v18, v0

    move-object/from16 v3, v20

    move-object/from16 v11, v21

    move/from16 v9, v27

    move/from16 v10, v29

    move-object/from16 v0, p0

    goto/16 :goto_12

    :cond_4f
    move/from16 v19, v3

    :cond_50
    if-eqz v19, :cond_54

    iget-object v0, v6, La/O3;->f0:La/e2;

    iget-object v0, v0, La/e2;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v1, v6, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v12, 0x0

    :goto_2b
    if-ge v12, v1, :cond_53

    iget-object v2, v6, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/N3;

    iget-object v3, v2, La/N3;->J:[La/N3$a;

    const/16 v17, 0x0

    aget-object v4, v3, v17

    if-eq v4, v7, :cond_51

    if-eq v4, v8, :cond_51

    const/16 v16, 0x1

    aget-object v3, v3, v16

    if-eq v3, v7, :cond_51

    if-ne v3, v8, :cond_52

    :cond_51
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_52
    add-int/lit8 v12, v12, 0x1

    goto :goto_2b

    :cond_53
    iget-object v0, v6, La/O3;->g0:La/U4;

    const/4 v14, 0x1

    iput-boolean v14, v0, La/U4;->b:Z

    :cond_54
    move-object/from16 v0, p0

    iget v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    move/from16 v2, p1

    move/from16 v3, p2

    invoke-virtual {v0, v6, v1, v2, v3}, Landroidx/constraintlayout/widget/ConstraintLayout;->e(La/O3;III)V

    invoke-virtual {v6}, La/N3;->l()I

    move-result v1

    invoke-virtual {v6}, La/N3;->i()I

    move-result v4

    iget-boolean v5, v6, La/O3;->r0:Z

    iget-boolean v6, v6, La/O3;->s0:Z

    iget-object v7, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->o:Landroidx/constraintlayout/widget/ConstraintLayout$b;

    iget v8, v7, Landroidx/constraintlayout/widget/ConstraintLayout$b;->e:I

    iget v7, v7, Landroidx/constraintlayout/widget/ConstraintLayout$b;->d:I

    add-int/2addr v1, v7

    add-int/2addr v4, v8

    const/4 v15, 0x0

    invoke-static {v1, v2, v15}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v1

    invoke-static {v4, v3, v15}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v2

    const v3, 0xffffff

    and-int/2addr v1, v3

    and-int/2addr v2, v3

    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-static {v3, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    iget v3, v0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    const/high16 v3, 0x1000000

    if-eqz v5, :cond_55

    or-int/2addr v1, v3

    :cond_55
    if-eqz v6, :cond_56

    or-int/2addr v2, v3

    :cond_56
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setMeasuredDimension(II)V

    return-void
.end method

.method public final onViewAdded(Landroid/view/View;)V
    .locals 4

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewAdded(Landroid/view/View;)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroid/view/View;)La/N3;

    move-result-object v0

    instance-of v1, p1, Landroidx/constraintlayout/widget/g;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    instance-of v0, v0, La/a8;

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    new-instance v1, La/a8;

    invoke-direct {v1}, La/a8;-><init>()V

    iput-object v1, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->l0:La/N3;

    iput-boolean v2, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Y:Z

    iget v0, v0, Landroidx/constraintlayout/widget/ConstraintLayout$a;->R:I

    invoke-virtual {v1, v0}, La/a8;->B(I)V

    :cond_0
    instance-of v0, p1, Landroidx/constraintlayout/widget/c;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroidx/constraintlayout/widget/c;

    invoke-virtual {v0}, Landroidx/constraintlayout/widget/c;->g()V

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;

    iput-boolean v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$a;->Z:Z

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, v0, p1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iput-boolean v2, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    return-void
.end method

.method public onViewRemoved(Landroid/view/View;)V
    .locals 2

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onViewRemoved(Landroid/view/View;)V

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    invoke-virtual {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;->b(Landroid/view/View;)La/N3;

    move-result-object v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:La/O3;

    iget-object v1, v1, La/hh;->e0:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 v1, 0x0

    iput-object v1, v0, La/N3;->K:La/N3;

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    return-void
.end method

.method public final requestLayout()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->h:Z

    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    return-void
.end method

.method public setConstraintSet(Landroidx/constraintlayout/widget/e;)V
    .locals 0

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->j:Landroidx/constraintlayout/widget/e;

    return-void
.end method

.method public setId(I)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result v0

    iget-object v1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->a:Landroid/util/SparseArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->remove(I)V

    invoke-super {p0, p1}, Landroid/view/View;->setId(I)V

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p1

    invoke-virtual {v1, p1, p0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-void
.end method

.method public setMaxHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->g:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMaxWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->f:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinHeight(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->e:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setMinWidth(I)V
    .locals 1

    iget v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->d:I

    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    return-void
.end method

.method public setOnConstraintsChanged(La/P3;)V
    .locals 0

    iget-object p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->k:Landroidx/constraintlayout/widget/d;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void
.end method

.method public setOptimizationLevel(I)V
    .locals 1

    iput p1, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->i:I

    iget-object v0, p0, Landroidx/constraintlayout/widget/ConstraintLayout;->c:La/O3;

    iput p1, v0, La/O3;->q0:I

    const/16 v0, 0x100

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    sput-boolean p1, La/B9;->p:Z

    return-void
.end method

.method public final shouldDelayChildPressedState()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method
