.class public final LGb;
.super Landroid/widget/LinearLayout;
.source ""


# static fields
.field public static final g:Lm6;


# instance fields
.field public final a:Ljava/util/LinkedHashMap;

.field public b:Lfj;

.field public c:LfA;

.field public d:LHb;

.field public e:I

.field public f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide v0, -0x1c2f0fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1c293fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1c2b4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1c2bafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1c155fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    new-instance v0, Lm6;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lm6;-><init>(I)V

    sput-object v0, LGb;->g:Lm6;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 11

    const-wide v0, -0x1c229fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, LGb;->a:Ljava/util/LinkedHashMap;

    sget-object v0, LfA;->b:LfA;

    iput-object v0, p0, LGb;->c:LfA;

    sget-object v0, LHb;->b:LHb;

    iput-object v0, p0, LGb;->d:LHb;

    const v0, -0xf83ea0

    iput v0, p0, LGb;->e:I

    const v0, 0x550603f7

    invoke-virtual {p1, v0}, Landroid/content/Context;->getColor(I)I

    move-result v0

    iput v0, p0, LGb;->f:I

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    const/4 v1, -0x1

    const/4 v2, -0x2

    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v0, Landroid/widget/LinearLayout;

    invoke-direct {v0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v4, v1, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v1, 0x10

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setGravity(I)V

    const/16 v1, 0x8

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-virtual {v0, v4, v5, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    sget-object v4, LGb;->g:Lm6;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lm6;->k()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LHb;

    new-instance v6, LvC;

    invoke-direct {v6, p1}, LvC;-><init>(Landroid/content/Context;)V

    const-wide v7, -0x1c221fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Lm6;->j()Ljava/util/Map;

    move-result-object v7

    invoke-interface {v7, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-nez v7, :cond_0

    iget-object v7, v5, LHb;->a:Ljava/lang/String;

    :cond_0
    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/16 v7, 0x11

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setGravity(I)V

    const/high16 v7, 0x41600000    # 14.0f

    invoke-virtual {v6, v7}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v7, 0xc

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v9

    invoke-static {v7}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v1}, LGu;->i(Ljava/lang/Number;)I

    move-result v10

    invoke-virtual {v6, v8, v9, v7, v10}, Landroid/view/View;->setPadding(IIII)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v7, v2, v2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget v7, p0, LGb;->e:I

    iget-object v8, v6, LvC;->c:Landroid/graphics/Paint;

    invoke-virtual {v8, v7}, Landroid/graphics/Paint;->setColor(I)V

    const v8, 0xffffff

    and-int/2addr v7, v8

    const/high16 v8, 0x33000000

    or-int/2addr v7, v8

    iget-object v8, v6, LvC;->d:Landroid/graphics/Paint;

    invoke-virtual {v8, v7}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v6}, Landroid/view/View;->invalidate()V

    new-instance v7, Ll5;

    const/4 v8, 0x5

    invoke-direct {v7, v8, v5, p0}, Ll5;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v6, v7}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object v7, p0, LGb;->a:Ljava/util/LinkedHashMap;

    invoke-interface {v7, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v5, v3, v2, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v0, v6, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_0

    :cond_1
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object p1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v0, -0x1c3dbfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    const-wide v0, -0x1c3fefffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :try_start_0
    invoke-static {p1}, LHb;->valueOf(Ljava/lang/String;)LHb;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    sget-object p1, LHb;->b:LHb;

    :goto_1
    iput-object p1, p0, LGb;->d:LHb;

    invoke-virtual {p0, p1}, LGb;->a(LHb;)V

    return-void
.end method


# virtual methods
.method public final a(LHb;)V
    .locals 7

    const-wide v0, -0x1c237fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iput-object p1, p0, LGb;->d:LHb;

    iget-object v0, p0, LGb;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LHb;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v2, p1, :cond_0

    move v2, v4

    goto :goto_1

    :cond_0
    move v2, v3

    :goto_1
    if-eqz v2, :cond_1

    iget v5, p0, LGb;->e:I

    goto :goto_2

    :cond_1
    iget v5, p0, LGb;->f:I

    :goto_2
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setTextColor(I)V

    if-eqz v2, :cond_2

    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_3

    :cond_2
    const v5, 0x3f333333    # 0.7f

    :goto_3
    invoke-virtual {v1, v5}, Landroid/view/View;->setAlpha(F)V

    iget-object v5, p0, LGb;->c:LfA;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_5

    if-ne v5, v4, :cond_4

    instance-of v4, v1, LvC;

    if-eqz v4, :cond_3

    move-object v4, v1

    check-cast v4, LvC;

    iput-boolean v3, v4, LvC;->a:Z

    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    iput-boolean v2, v4, LvC;->b:Z

    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    :cond_3
    invoke-virtual {v1, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_4
    new-instance p1, LFa;

    invoke-direct {p1}, Ljava/lang/RuntimeException;-><init>()V

    throw p1

    :cond_5
    instance-of v3, v1, LvC;

    if-eqz v3, :cond_6

    move-object v3, v1

    check-cast v3, LvC;

    iput-boolean v2, v3, LvC;->a:Z

    invoke-virtual {v3}, Landroid/view/View;->invalidate()V

    :cond_6
    invoke-virtual {v1, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    :cond_7
    return-void
.end method

.method public final getCurrentSelectedType()LHb;
    .locals 1

    iget-object v0, p0, LGb;->d:LHb;

    return-object v0
.end method

.method public final setOnTabSelectedListener(Lfj;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfj;",
            ")V"
        }
    .end annotation

    const-wide v0, -0x1c2c4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iput-object p1, p0, LGb;->b:Lfj;

    return-void
.end method

.method public final setSelectedColor(I)V
    .locals 5

    if-nez p1, :cond_0

    return-void

    :cond_0
    iput p1, p0, LGb;->e:I

    iget-object v0, p0, LGb;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    instance-of v2, v1, LvC;

    if-eqz v2, :cond_1

    check-cast v1, LvC;

    iget-object v2, v1, LvC;->c:Landroid/graphics/Paint;

    invoke-virtual {v2, p1}, Landroid/graphics/Paint;->setColor(I)V

    iget-object v2, v1, LvC;->d:Landroid/graphics/Paint;

    const v3, 0xffffff

    and-int/2addr v3, p1

    const/high16 v4, 0x33000000

    or-int/2addr v3, v4

    invoke-virtual {v2, v3}, Landroid/graphics/Paint;->setColor(I)V

    invoke-virtual {v1}, Landroid/view/View;->invalidate()V

    goto :goto_0

    :cond_2
    iget-object p1, p0, LGb;->d:LHb;

    invoke-virtual {p0, p1}, LGb;->a(LHb;)V

    return-void
.end method

.method public final setTabStyle(LfA;)V
    .locals 2

    const-wide v0, -0x1c231fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iput-object p1, p0, LGb;->c:LfA;

    iget-object p1, p0, LGb;->d:LHb;

    invoke-virtual {p0, p1}, LGb;->a(LHb;)V

    return-void
.end method

.method public final setUnselectedColor(I)V
    .locals 0

    if-eqz p1, :cond_0

    iput p1, p0, LGb;->f:I

    iget-object p1, p0, LGb;->d:LHb;

    invoke-virtual {p0, p1}, LGb;->a(LHb;)V

    :cond_0
    return-void
.end method
