.class public final synthetic LTp;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lfj;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, LTp;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, LhG;

    const-wide v0, -0x2de6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object v0, p1, Lqs;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    const/4 v1, 0x0

    :goto_0
    array-length v2, v0

    if-ge v1, v2, :cond_2

    add-int/lit8 v2, v1, 0x1

    :try_start_0
    aget-object v1, v0, v1
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v3

    const-class v4, Landroid/view/View;

    invoke-static {v3, v4}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    :try_start_1
    iget-object v3, p1, Lqs;->b:Ljava/lang/Object;

    invoke-virtual {v1, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Landroid/view/View;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v1, Landroid/view/View;

    goto :goto_1

    :cond_0
    move-object v1, v4

    :goto_1
    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    instance-of v5, v3, Landroid/widget/RelativeLayout$LayoutParams;

    if-eqz v5, :cond_1

    move-object v5, v3

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    iget v5, v5, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    const/4 v6, -0x1

    if-ne v5, v6, :cond_1

    check-cast v3, Landroid/widget/RelativeLayout$LayoutParams;

    iget v3, v3, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    if-ne v3, v6, :cond_1

    invoke-virtual {v1, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-class v3, Ljava/lang/Object;

    const v4, 0x550a022b

    invoke-virtual {v1, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    const-wide v3, -0x2df2fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    new-instance v3, Lis;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_1
    move v1, v2

    goto :goto_0

    :catch_1
    move-exception p1

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method

.method private final e(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    check-cast p1, LhG;

    const-wide v0, -0x1af97fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x1afa4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x2f8effffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    array-length v4, v1

    if-ge v3, v4, :cond_1

    add-int/lit8 v4, v3, 0x1

    :try_start_0
    aget-object v3, v1, v3
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->toString()Ljava/lang/String;

    move-result-object v3

    const-wide v5, -0x2f8f4fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3, v0, v2}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v0, LXA;->a:Ljava/util/HashMap;

    const-wide v0, -0x1afbafffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    aput-object v0, p1, v2

    goto :goto_1

    :cond_0
    move v3, v4

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_1
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method

.method private final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    check-cast p1, LhG;

    const-wide v0, -0x1ae54fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    instance-of v1, p1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    check-cast p1, Landroid/view/ViewGroup;

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_8

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x2fa09fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-wide v2, -0x2fa26fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    const-wide v2, -0x2faccfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_1
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x3

    const-wide v3, -0x20dfbfffff835L

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-ne v1, v2, :cond_6

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    instance-of v1, v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_6

    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    instance-of v1, v1, Landroid/widget/LinearLayout;

    if-eqz v1, :cond_6

    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    instance-of v1, v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_6

    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const-wide v7, -0x1ae61fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    sget-object v2, LXA;->a:Ljava/util/HashMap;

    const-wide v7, -0x1ae1dfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    invoke-virtual {v7, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-wide v7, -0x1aec2fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v7

    const-wide v8, -0x1aef0fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    check-cast v7, Landroid/widget/ImageView;

    const-wide v8, -0x1aeaefffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v9, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7, v8, v9}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v7, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_2
    const-wide v7, -0x1ad43fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {p1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    const-wide v7, -0x1ad73fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/widget/ImageView;

    const-wide v7, -0x1ad31fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v8}, [Ljava/lang/Object;

    move-result-object v8

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v8, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v8

    invoke-static {p1, v7, v8}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_3
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    const/4 v2, 0x0

    invoke-virtual {p1, v2}, Landroid/view/View;->setAlpha(F)V

    const-wide v7, -0x1adc6fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lhw;->a(ILjava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    const-wide v7, -0x1ade6fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v1, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const-wide v7, -0x1ada2fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    move v7, v0

    :goto_1
    if-ge v7, v5, :cond_4

    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    const-wide v9, -0x1ac5efffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    check-cast v8, Landroid/view/ViewGroup;

    sget v9, LTB;->f:I

    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v9

    const-wide v10, -0x1ac1afffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    filled-new-array {v11}, [Ljava/lang/Object;

    move-result-object v11

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v11, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9, v10, v11}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    sget v9, LTB;->h:I

    invoke-virtual {v8, v9}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v8

    check-cast v8, Landroid/widget/TextView;

    invoke-virtual {v8, p1}, Landroid/widget/TextView;->setTextColor(I)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_1

    :cond_4
    new-instance v5, Lau;

    invoke-direct {v5, p1, v0}, Lau;-><init>(II)V

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v2

    :goto_2
    if-ge v0, v2, :cond_5

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    const-wide v7, -0x1ac27fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v5, Landroid/view/ViewGroup;

    sget v7, LTB;->f:I

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v7

    const-wide v8, -0x1ace3fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v9, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7, v8, v9}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    sget v7, LTB;->h:I

    invoke-virtual {v5, v7}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    check-cast v5, Landroid/widget/TextView;

    invoke-virtual {v5, p1}, Landroid/widget/TextView;->setTextColor(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    :cond_5
    new-instance v0, Lau;

    invoke-direct {v0, p1, v6}, Lau;-><init>(II)V

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setOnHierarchyChangeListener(Landroid/view/ViewGroup$OnHierarchyChangeListener;)V

    goto/16 :goto_3

    :cond_6
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    if-ne v1, v5, :cond_8

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    instance-of v1, v1, Landroid/widget/LinearLayout;

    if-eqz v1, :cond_8

    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    instance-of v1, v1, Landroid/widget/ImageView;

    if-eqz v1, :cond_8

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    const-wide v7, -0x1acf0fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Landroid/widget/LinearLayout;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v5, v2, Landroid/widget/TextView;

    if-eqz v5, :cond_8

    check-cast v2, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    const-wide v7, -0x1acb1fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    sget-object v5, LXA;->a:Ljava/util/HashMap;

    const-wide v7, -0x1acb9fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    if-eqz v5, :cond_8

    invoke-virtual {v1, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const-wide v7, -0x1ab5efffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_7

    invoke-virtual {p1, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object p1

    const-wide v7, -0x1ab0efffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/widget/ImageView;

    const-wide v7, -0x1abccfffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    filled-new-array {v7}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v7, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {p1, v5, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_7
    const-wide v3, -0x1abe1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lhw;->a(ILjava/lang/String;)I

    move-result p1

    if-eqz p1, :cond_8

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_8
    :goto_3
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method

.method private final h(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    move-object/from16 v0, p1

    check-cast v0, LhG;

    const/16 v1, 0x20

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-wide v2, -0x1dd3dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v2, v0, Lqs;->d:Ljava/lang/Object;

    check-cast v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Landroid/view/View;

    if-eqz v3, :cond_0

    check-cast v2, Landroid/view/View;

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    goto/16 :goto_5

    :cond_1
    instance-of v3, v2, Landroid/view/ViewGroup;

    if-eqz v3, :cond_8

    move-object v3, v2

    check-cast v3, Landroid/view/ViewGroup;

    invoke-static {v3}, Lgf;->q(Landroid/view/ViewGroup;)V

    const v5, 0x1020016

    invoke-virtual {v2, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    if-eqz v2, :cond_9

    sget-object v5, Ldu;->a:Ldu;

    invoke-static {v3}, Ldu;->c(Landroid/view/ViewGroup;)Landroid/widget/ImageView;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0x2fa6cfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    move-result v5

    if-nez v5, :cond_9

    sget-object v5, LXA;->a:Ljava/util/HashMap;

    const-wide v5, -0x2bce3fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v6, -0x2bce8fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v7, LEt;

    invoke-direct {v7, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2bc8ffffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v8, -0x2bc96fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v8, LEt;

    invoke-direct {v8, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2bcbdfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v9, -0x2bb40fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v9, LEt;

    invoke-direct {v9, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2bb63fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v10, -0x2bb66fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v10, LEt;

    invoke-direct {v10, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2bb09fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v11, -0x2bb0dfffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v11, LEt;

    invoke-direct {v11, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2bb3bfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v12, -0x2bb3ffffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v12, LEt;

    invoke-direct {v12, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2bbecfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v13, -0x2bbf4fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v13, LEt;

    invoke-direct {v13, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2bb9ffffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v14, -0x2bbb9fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v14, LEt;

    invoke-direct {v14, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2ba60fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v15, -0x2ba77fffff835L

    invoke-static/range {v15 .. v16}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v15, LEt;

    invoke-direct {v15, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2ba1cfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v16, -0x2ba38fffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    new-instance v4, LEt;

    invoke-direct {v4, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2badcfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v16, -0x2baf3fffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v36, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2ba97fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v16, -0x2baacfffff835L

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v17, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2b952fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v18, -0x2b967fffff835L

    invoke-static/range {v18 .. v19}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v18, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2b90bfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v19, -0x2b922fffff835L

    invoke-static/range {v19 .. v20}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v19, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2b9c8fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v20, -0x2b9e2fffff835L

    invoke-static/range {v20 .. v21}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v20, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2b986fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v21, -0x2b99bfffff835L

    invoke-static/range {v21 .. v22}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v21, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2b9bffffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v22, -0x2b857fffff835L

    invoke-static/range {v22 .. v23}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v22, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2b87bfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v23, -0x2b80efffff835L

    invoke-static/range {v23 .. v24}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v23, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2b832fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v24, -0x2b8cafffff835L

    invoke-static/range {v24 .. v25}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v24, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2b8eefffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v25, -0x2b881fffff835L

    invoke-static/range {v25 .. v26}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v25, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2b8a8fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v26, -0x2b8bbfffff835L

    invoke-static/range {v26 .. v27}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v26, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2a75bfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v27, -0x2a770fffff835L

    invoke-static/range {v27 .. v28}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v27, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2a70cfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v28, -0x2a71efffff835L

    invoke-static/range {v28 .. v29}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v28, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2a73efffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v29, -0x2a7d7fffff835L

    invoke-static/range {v29 .. v30}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v29, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2a7f7fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v30, -0x2a792fffff835L

    invoke-static/range {v30 .. v31}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v30, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2a7b2fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v31, -0x2a64afffff835L

    invoke-static/range {v31 .. v32}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v31, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2a667fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v32, -0x2a603fffff835L

    invoke-static/range {v32 .. v33}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v32, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2a620fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v33, -0x2a635fffff835L

    invoke-static/range {v33 .. v34}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v33, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v5, -0x2a6d1fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    const-wide v34, -0x2a6defffff835L

    invoke-static/range {v34 .. v35}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v34, v1

    new-instance v1, LEt;

    invoke-direct {v1, v5, v6}, LEt;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v35, v1

    move-object/from16 v16, v4

    filled-new-array/range {v7 .. v35}, [LEt;

    move-result-object v1

    invoke-static {v1}, Luq;->L([LEt;)Ljava/util/Map;

    move-result-object v1

    iget-object v0, v0, Lqs;->b:Ljava/lang/Object;

    sget-object v4, Ldu;->b:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    const/4 v5, 0x0

    if-lez v4, :cond_4

    new-instance v4, Lvx;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    instance-of v6, v0, Ljava/lang/Class;

    if-eqz v6, :cond_2

    check-cast v0, Ljava/lang/Class;

    iput-object v0, v4, Lvx;->b:Ljava/io/Serializable;

    goto :goto_2

    :cond_2
    iput-object v0, v4, Lvx;->c:Ljava/lang/Object;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    :goto_1
    iput-object v0, v4, Lvx;->b:Ljava/io/Serializable;

    :goto_2
    sget-object v0, Ldu;->b:Ljava/lang/String;

    invoke-virtual {v4, v0}, Lvx;->c(Ljava/lang/String;)V

    invoke-virtual {v4}, Lvx;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_4

    :cond_4
    sget v4, LgG;->a:I

    const-wide v6, -0x1dd71fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v4

    const-wide v6, -0x1dd1efffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    array-length v6, v4

    move v7, v5

    :goto_3
    if-ge v7, v6, :cond_6

    aget-object v8, v4, v7

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v9

    const-class v10, Ljava/lang/String;

    invoke-static {v9, v10}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    invoke-virtual {v8, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    if-eqz v9, :cond_5

    const-wide v10, -0x1dd2dfffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10, v5}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v0

    const-wide v6, -0x1dd2ffffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    sput-object v0, Ldu;->b:Ljava/lang/String;

    move-object v0, v9

    goto :goto_4

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_3

    :cond_6
    const-wide v6, -0x1dd3cfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    :goto_4
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lhw;->b(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_9

    sget-object v1, LXA;->a:Ljava/util/HashMap;

    const-wide v6, -0x1ddc9fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-static {v5, v1}, Lhw;->a(ILjava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    :cond_7
    const/4 v1, 0x0

    invoke-virtual {v3, v1}, Landroid/view/View;->setLayerPaint(Landroid/graphics/Paint;)V

    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    invoke-static/range {v36 .. v36}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    invoke-static/range {v36 .. v36}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v3, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_5

    :cond_8
    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    const v0, 0x550a022b

    const-class v1, Ljava/lang/Object;

    invoke-virtual {v2, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    :cond_9
    :goto_5
    sget-object v0, LTC;->a:LTC;

    return-object v0
.end method

.method private final i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, LhG;

    const-wide v0, -0x2c4fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LSv;->b:LSv;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, LhG;->a:Lqs;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lqs;->C(Ljava/lang/Object;)V

    :cond_0
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method

.method private final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, LhG;

    const-wide v0, -0x294fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    sget-object v0, LKw;->b:LKw;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v2, v0, v1

    const-wide v3, -0x2a1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Ljava/lang/String;

    const/4 v3, 0x3

    aget-object v3, v0, v3

    const-wide v4, -0x154fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Ljava/lang/String;

    const/4 v4, 0x1

    aget-object v0, v0, v4

    const-wide v5, -0x107fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-wide v7, -0x138fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-static {v0, v1, v3}, LfG;->E(Ljava/util/regex/Matcher;ILjava/lang/CharSequence;)Lzq;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-virtual {p1, v1}, Lqs;->C(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lzq;->a()Ljava/util/List;

    move-result-object p1

    check-cast p1, Lyq;

    invoke-virtual {p1, v4}, Lyq;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-wide v3, -0x1cafffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\""

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x22

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    sget-object p1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v7, -0x1cffffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    const-wide v7, -0x1defffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {p1, v4}, LNx;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-wide v3, -0x1e7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-wide v3, -0x1f0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    sget-object p1, Lms;->a:LPg;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0x1f7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v0}, LPg;->h(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method

.method private final k(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, LhG;

    const-wide v0, -0x185fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    sget-object v0, LKw;->b:LKw;

    invoke-virtual {v0}, LZk;->e()Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object v0, p1, Lqs;->b:Ljava/lang/Object;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object p1, p1, v1

    invoke-static {p1}, LfG;->J(Ljava/lang/Object;)Lvx;

    move-result-object v1

    const-wide v2, -0x192fffff835L

    invoke-static {v2, v3, v1}, LEy;->b(JLvx;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    :try_start_0
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-wide v3, -0x1a0fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    const-wide v5, -0x1a9fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const-wide v5, -0x1b0fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v5, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v6, -0x2166bfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, LbG;

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    iget-object v5, v5, LbG;->a:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    instance-of v7, v5, Ljava/lang/reflect/Method;

    if-eqz v7, :cond_1

    check-cast v5, Ljava/lang/reflect/Method;

    goto :goto_1

    :cond_1
    move-object v5, v6

    :goto_1
    if-eqz v5, :cond_2

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v5, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    :cond_2
    if-eqz v6, :cond_3

    invoke-static {v6}, LfG;->J(Ljava/lang/Object;)Lvx;

    move-result-object v0

    const-wide v3, -0x1b5fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lvx;->c(Ljava/lang/String;)V

    invoke-virtual {v0}, Lvx;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-static {p1}, LfG;->J(Ljava/lang/Object;)Lvx;

    move-result-object v3

    const-wide v4, -0x46fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lvx;->c(Ljava/lang/String;)V

    const-wide/16 v4, 0x1

    add-long/2addr v0, v4

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v3, v0}, Lvx;->d(Ljava/lang/Object;)V

    invoke-static {p1}, LfG;->J(Ljava/lang/Object;)Lvx;

    move-result-object p1

    const-wide v0, -0x57fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lvx;->c(Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Lvx;->d(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_3
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, LhG;

    const-wide v0, -0xbdfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object v0, p1, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x3

    aget-object v0, v0, v1

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p1, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    const/4 v1, 0x4

    aget-object v1, v0, v1

    if-nez v1, :cond_7

    const/4 v1, 0x0

    aget-object v0, v0, v1

    instance-of v2, v0, Landroid/graphics/Bitmap;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    check-cast v0, Landroid/graphics/Bitmap;

    goto :goto_0

    :cond_0
    move-object v0, v3

    :goto_0
    if-eqz v0, :cond_7

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-eqz v2, :cond_1

    goto/16 :goto_5

    :cond_1
    sget-object v2, LMw;->b:LMw;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v2}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;

    move-result-object v2

    const-wide v4, -0x93fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    array-length v4, v2

    :goto_1
    if-ge v1, v4, :cond_6

    aget-object v5, v2, v1

    invoke-virtual {v5}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v5

    sget-object v6, LcG;->a:Ljava/util/LinkedHashMap;

    const-wide v7, -0x214aefffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LbG;

    if-eqz v6, :cond_2

    iget-object v6, v6, LbG;->a:Ljava/lang/Object;

    goto :goto_2

    :cond_2
    move-object v6, v3

    :goto_2
    instance-of v7, v6, Ljava/lang/Class;

    if-eqz v7, :cond_3

    check-cast v6, Ljava/lang/Class;

    goto :goto_3

    :cond_3
    move-object v6, v3

    :goto_3
    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_4
    move-object v6, v3

    :goto_4
    invoke-static {v5, v6}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_5

    :cond_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_6
    sget-object v1, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v1, -0xf4afffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    const-wide v2, -0x2fbeefffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, LNx;->a:Landroid/content/SharedPreferences;

    const/16 v3, 0x64

    invoke-interface {v2, v1, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    invoke-static {v0, v1}, LDc;->m(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-virtual {p1, v0}, Lqs;->C(Ljava/lang/Object;)V

    :cond_7
    :goto_5
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method

.method private final m(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    check-cast p1, LhG;

    const-wide v0, -0xf62fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->b:Ljava/lang/Object;

    const-wide v0, -0xf6efffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-wide v3, -0x20dfbfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const-wide v0, -0xf7dfffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/view/View;

    sget-object v0, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v0, -0xf34fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x2fbeefffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    sget-object v1, LNx;->a:Landroid/content/SharedPreferences;

    const/16 v2, 0x64

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0, v2}, LTB;->f(II)I

    move-result v0

    int-to-float v0, v0

    const/high16 v1, 0x42c80000    # 100.0f

    div-float/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    int-to-float v1, v1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr v1, v2

    mul-float/2addr v1, v0

    new-instance v0, LLw;

    invoke-direct {v0, v1}, LLw;-><init>(F)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setClipToOutline(Z)V

    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method

.method private final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-gtz p1, :cond_0

    const-wide v0, -0xa6fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const/16 v0, 0x64

    if-lt p1, v0, :cond_1

    const-wide v0, -0xa9fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x25

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final o(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v1, -0x1d69cfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v1, v0, Lqs;->b:Ljava/lang/Object;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    const-wide v3, -0x295bbfffff835L

    :try_start_0
    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    new-array v4, v2, [Ljava/lang/Object;

    const-wide v5, -0x20dfbfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1, v3, v4}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljava/lang/String;

    if-eqz v4, :cond_1

    check-cast v3, Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v3, 0x0

    :goto_0
    if-eqz v3, :cond_2

    const-wide v4, -0x29443fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4, v2}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-eqz v3, :cond_2

    sput-object v1, LPj;->f:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_1
    aget-object v1, v0, v2

    const-wide v3, -0x1d6a9fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v1, Ljava/lang/String;

    const-wide v3, -0x1d55cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    new-instance v1, LXm;

    const/4 v3, 0x2

    aget-object v0, v0, v3

    const-wide v4, -0x1d564fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/content/ContentValues;

    invoke-direct {v1, v0}, LXm;-><init>(Landroid/content/ContentValues;)V

    iget-object v0, v1, LXm;->b:Ljava/lang/Object;

    check-cast v0, Landroid/content/ContentValues;

    sget-object v4, LTt;->a:LTt;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide v4, -0x29538fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    :try_start_1
    invoke-virtual {v1}, LXm;->h()Ljava/lang/String;

    move-result-object v4

    const-wide v5, -0x295c0fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v2, v5}, LBz;->J(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_3

    move v4, v5

    goto :goto_2

    :cond_3
    invoke-virtual {v1}, LXm;->h()Ljava/lang/String;

    move-result-object v4

    const-wide v6, -0x295cafffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    move v4, v3

    goto :goto_2

    :cond_4
    move v4, v2

    :goto_2
    const/4 v6, 0x6

    if-ne v4, v5, :cond_6

    invoke-virtual {v1}, LXm;->i()Z

    move-result v7

    if-nez v7, :cond_6

    invoke-virtual {v1}, LXm;->e()Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x295cefffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8, v2, v2, v6}, Ltz;->R(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v7

    if-lez v7, :cond_5

    invoke-virtual {v1}, LXm;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v7

    const-wide v8, -0x295d1fffff835L

    invoke-static {v8, v9}, LGu;->r(J)Ljava/lang/String;

    :goto_3
    move-object v8, v7

    goto :goto_4

    :cond_5
    invoke-virtual {v1}, LXm;->h()Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :cond_6
    invoke-virtual {v1}, LXm;->h()Ljava/lang/String;

    move-result-object v7

    goto :goto_3

    :goto_4
    if-ne v4, v5, :cond_8

    invoke-virtual {v1}, LXm;->i()Z

    move-result v5

    if-nez v5, :cond_8

    invoke-virtual {v1}, LXm;->e()Ljava/lang/String;

    move-result-object v5

    const-wide v9, -0x295e0fffff835L

    invoke-static {v9, v10}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v7, v2, v2, v6}, Ltz;->R(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v5

    if-lez v5, :cond_7

    invoke-virtual {v1}, LXm;->e()Ljava/lang/String;

    move-result-object v6

    add-int/2addr v5, v3

    invoke-virtual {v6, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v3

    const-wide v5, -0x295e3fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    :goto_5
    move-object/from16 v16, v3

    goto :goto_6

    :cond_7
    invoke-virtual {v1}, LXm;->e()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_8
    invoke-virtual {v1}, LXm;->e()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :goto_6
    new-instance v6, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;

    invoke-virtual {v1}, LXm;->h()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, LXm;->i()Z

    move-result v9

    const-wide v10, -0x297d0fffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    move v10, v3

    goto :goto_7

    :cond_9
    move v10, v2

    :goto_7
    const-wide v11, -0x29779fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v2

    :cond_a
    move v11, v2

    const-wide v2, -0x2976afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    const-wide/16 v12, 0x0

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    goto :goto_8

    :cond_b
    move-wide v2, v12

    :goto_8
    const-wide v14, -0x29718fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/content/ContentValues;->getAsLong(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    :cond_c
    move-wide v14, v12

    iget-object v0, v1, LXm;->b:Ljava/lang/Object;

    move-object/from16 v18, v0

    check-cast v18, Landroid/content/ContentValues;

    move-wide v12, v2

    move/from16 v17, v4

    invoke-direct/range {v6 .. v18}, Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;-><init>(Ljava/lang/String;Ljava/lang/String;IIIJJLjava/lang/String;ILandroid/content/ContentValues;)V

    sget-object v0, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->INSTANCE:Lio/github/cherrywechat/lua/api/CherryMessageAPI;

    invoke-virtual {v0, v6}, Lio/github/cherrywechat/lua/api/CherryMessageAPI;->dispatchMessage(Lio/github/cherrywechat/lua/api/CherryMessageAPI$MessageData;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_9

    :catch_1
    const-wide v0, -0x295f2fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    const-wide v0, -0x29580fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    :cond_d
    :goto_9
    sget-object v0, LTC;->a:LTC;

    return-object v0
.end method

.method private final p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, LhG;

    const-wide v0, -0x1d527fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object v0, p1, Lqs;->b:Ljava/lang/Object;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    const-wide v2, -0x295bbfffff835L

    :try_start_0
    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [Ljava/lang/Object;

    const-wide v4, -0x20dfbfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v0, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Ljava/lang/String;

    if-eqz v3, :cond_1

    check-cast v2, Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    if-eqz v2, :cond_2

    const-wide v3, -0x29443fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Ltz;->L(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v2

    if-eqz v2, :cond_2

    sput-object v0, LPj;->f:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :cond_2
    :goto_1
    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    aget-object v0, p1, v1

    const-wide v2, -0x1d534fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Ljava/lang/String;

    const/4 v2, 0x1

    aget-object p1, p1, v2

    const-wide v3, -0x1d5e7fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/content/ContentValues;

    const-wide v3, -0x1d5aafffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const-wide v3, -0x1d5b3fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-wide v3, -0x1d440fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Landroid/content/ContentValues;->getAsString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-wide v4, -0x1d44bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Landroid/content/ContentValues;->getAsInteger(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    const-wide v4, -0x1d457fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, LPj;->w(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-interface {v0}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v4

    if-eqz v4, :cond_b

    const-wide v4, -0x1d41bfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v4

    invoke-interface {v0, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v4

    const-wide v5, -0x1d427fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v5

    invoke-interface {v0, v5}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-eq v4, p1, :cond_b

    :goto_2
    sget-object p1, LMf;->a:LMf;

    const/16 v4, 0x3b

    if-eqz v5, :cond_6

    new-array v6, v2, [C

    aput-char v4, v6, v1

    invoke-static {v5, v6}, Ltz;->a0(Ljava/lang/String;[C)Ljava/util/List;

    move-result-object v5

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_4
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ltz;->T(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_4

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    invoke-static {v6}, Lra;->s0(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object v5

    goto :goto_4

    :cond_6
    move-object v5, p1

    :goto_4
    if-eqz v3, :cond_9

    new-array p1, v2, [C

    aput-char v4, p1, v1

    invoke-static {v3, p1}, Ltz;->a0(Ljava/lang/String;[C)Ljava/util/List;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ltz;->T(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_7

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    invoke-static {v1}, Lra;->s0(Ljava/util/Collection;)Ljava/util/Set;

    move-result-object p1

    :cond_9
    invoke-static {p1, v5}, LLx;->A(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v5, p1}, LLx;->A(Ljava/util/Set;Ljava/util/Set;)Ljava/util/Set;

    move-result-object p1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const-wide v3, -0x295a4fffff835L

    const-wide v5, -0x2959afffff835L

    if-eqz v2, :cond_a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    sget-object v2, LTt;->a:LTt;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    goto :goto_6

    :cond_a
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    sget-object v1, LTt;->a:LTt;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    goto :goto_7

    :cond_b
    invoke-interface {v0}, Landroid/database/Cursor;->close()V

    :cond_c
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method

.method private final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, LhG;

    const-wide v0, -0x1dae3fffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    iget-object p1, p1, LhG;->a:Lqs;

    iget-object p1, p1, Lqs;->c:Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    const-wide v0, -0x1daeffffff835L

    invoke-static {v0, v1}, LGu;->r(J)Ljava/lang/String;

    check-cast p1, Landroid/view/ViewGroup;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide v1, -0x1daabfffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    const-wide v1, -0x1db97fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    const-wide v1, -0x1da49fffff835L

    invoke-static {v1, v2}, LGu;->r(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Ly7;

    const/4 v1, 0x4

    invoke-direct {v0, p1, v1}, Ly7;-><init>(Landroid/view/ViewGroup;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    sget-object p1, LTC;->a:LTC;

    return-object p1
.end method


# virtual methods
.method public final g(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v1, p0

    iget v0, v1, LTp;->a:I

    const-wide v2, -0x20dfbfffff835L

    const/4 v4, 0x2

    const/4 v5, 0x3

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, 0x1

    sget-object v9, LTC;->a:LTC;

    const/4 v10, 0x0

    packed-switch v0, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x1d82efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v0, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v2, -0x1d83afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v2

    const-wide v3, -0x1d8f4fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/ViewGroup;

    new-instance v3, LD7;

    invoke-direct {v3, v2, v0, v5}, LD7;-><init>(Landroid/view/ViewGroup;Landroid/app/Activity;I)V

    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-object v9

    :pswitch_0
    invoke-direct/range {p0 .. p1}, LTp;->q(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    sget-object v0, LZu;->a:LYu;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, LZu;->b:LC;

    invoke-virtual {v0}, LC;->a()Ljava/util/Random;

    move-result-object v0

    const/high16 v2, 0x7fff0000

    invoke-virtual {v0, v2}, Ljava/util/Random;->nextInt(I)I

    move-result v0

    const/high16 v2, 0x10000

    add-int/2addr v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-direct/range {p0 .. p1}, LTp;->p(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-direct/range {p0 .. p1}, LTp;->o(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-direct/range {p0 .. p1}, LTp;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-direct/range {p0 .. p1}, LTp;->m(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-direct/range {p0 .. p1}, LTp;->l(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-direct/range {p0 .. p1}, LTp;->k(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-direct/range {p0 .. p1}, LTp;->j(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-direct/range {p0 .. p1}, LTp;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-direct/range {p0 .. p1}, LTp;->h(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-direct/range {p0 .. p1}, LTp;->f(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-direct/range {p0 .. p1}, LTp;->e(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_d
    move-object/from16 v0, p1

    check-cast v0, Ljava/util/Map$Entry;

    invoke-static {v0}, Lio/github/cherrywechat/lua/api/NetworkAPI;->j(Ljava/util/Map$Entry;)Ljava/lang/CharSequence;

    move-result-object v0

    return-object v0

    :pswitch_e
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x40cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    sget-object v2, Lrs;->b:Lrs;

    invoke-virtual {v2}, LZk;->e()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    aget-object v2, v2, v4

    const-wide v3, -0x419fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Ljava/lang/String;

    const-wide v3, -0x4ccfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    aget-object v0, v0, v5

    const-wide v2, -0x4f4fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/content/Intent;

    const/high16 v2, 0x80000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 v2, 0x8000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    :cond_0
    return-object v9

    :pswitch_f
    invoke-direct/range {p0 .. p1}, LTp;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_10
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x2d1efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v2, v0, Lqs;->b:Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getFields()[Ljava/lang/reflect/Field;

    move-result-object v2

    :goto_0
    array-length v3, v2

    if-ge v10, v3, :cond_3

    add-int/lit8 v3, v10, 0x1

    :try_start_0
    aget-object v4, v2, v10
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_1

    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v5

    const-class v8, Landroid/view/View;

    invoke-static {v5, v8}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    :try_start_1
    iget-object v5, v0, Lqs;->b:Ljava/lang/Object;

    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Landroid/view/View;

    if-eqz v5, :cond_1

    check-cast v4, Landroid/view/View;

    goto :goto_1

    :cond_1
    move-object v4, v6

    :goto_1
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v5

    instance-of v8, v4, Landroid/view/ViewGroup;

    if-nez v8, :cond_2

    instance-of v8, v5, Landroid/widget/RelativeLayout$LayoutParams;

    if-eqz v8, :cond_2

    move-object v8, v5

    check-cast v8, Landroid/widget/RelativeLayout$LayoutParams;

    iget v8, v8, Landroid/widget/RelativeLayout$LayoutParams;->width:I

    if-ne v8, v7, :cond_2

    check-cast v5, Landroid/widget/RelativeLayout$LayoutParams;

    iget v5, v5, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    if-ne v5, v7, :cond_2

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    const-wide v10, -0x2d2afffff835L

    invoke-static {v10, v11}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/view/ViewGroup;

    invoke-static {v4}, Lgf;->o(Landroid/view/ViewGroup;)V
    :try_end_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :cond_2
    move v10, v3

    goto :goto_0

    :catch_1
    move-exception v0

    new-instance v2, Ljava/util/NoSuchElementException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_3
    return-object v9

    :pswitch_11
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x2ca5fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v2, v0, LhG;->a:Lqs;

    iget-object v2, v2, Lqs;->c:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    aget-object v2, v2, v10

    const-wide v3, -0x2cb1fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/ViewGroup;

    new-instance v3, Ln3;

    const/16 v4, 0xe

    invoke-direct {v3, v4, v2, v0}, Ln3;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    return-object v9

    :pswitch_12
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x2daefffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    invoke-virtual {v0, v6}, Lqs;->C(Ljava/lang/Object;)V

    return-object v9

    :pswitch_13
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x537ffffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v2, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v3, -0x530cfffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v2}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    const-wide v3, -0x53c6fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v2

    if-eq v2, v7, :cond_4

    invoke-virtual {v0, v6}, Lqs;->C(Ljava/lang/Object;)V

    :cond_4
    return-object v9

    :pswitch_14
    move-object/from16 v0, p1

    check-cast v0, [Ljava/lang/Class;

    const-wide v2, -0x537cfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    array-length v0, v0

    if-nez v0, :cond_5

    goto :goto_2

    :cond_5
    move v8, v10

    :goto_2
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_15
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v11, -0x55d4fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v5, v0, Lqs;->b:Ljava/lang/Object;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, [Ljava/lang/Object;

    const-wide v12, -0x55e0fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v5, Landroid/app/Activity;

    const-wide v12, -0x559afffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    new-array v12, v10, [Ljava/lang/Object;

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v12, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5, v0, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-wide v2, -0x55a9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, LWk;

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-wide v2, -0x5465fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, LWk;

    aget-object v2, v11, v10

    const-wide v12, -0x543cfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    aget-object v3, v11, v8

    const-wide v12, -0x54ecfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    aget-object v12, v11, v4

    instance-of v13, v12, Landroid/content/Intent;

    if-eqz v13, :cond_6

    check-cast v12, Landroid/content/Intent;

    goto :goto_3

    :cond_6
    move-object v12, v6

    :goto_3
    invoke-interface {v0, v5, v2, v3, v12}, LWk;->c(Landroid/app/Activity;IILandroid/content/Intent;)V

    :cond_7
    sget-object v0, Lds;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_19

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le8;

    aget-object v3, v11, v10

    const-wide v12, -0x549cfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Ljava/lang/Integer;

    aget-object v12, v11, v8

    const-wide v13, -0x534cfffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    check-cast v12, Ljava/lang/Integer;

    aget-object v13, v11, v4

    instance-of v14, v13, Landroid/content/Intent;

    if-eqz v14, :cond_9

    check-cast v13, Landroid/content/Intent;

    goto :goto_5

    :cond_9
    move-object v13, v6

    :goto_5
    iget v0, v0, Le8;->a:I

    packed-switch v0, :pswitch_data_1

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-wide v14, -0x633fffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    sget-object v12, Lak;->b:Lak;

    invoke-virtual {v12}, LZk;->e()Z

    move-result v12

    if-nez v12, :cond_a

    goto :goto_4

    :cond_a
    const/16 v12, 0x4f4e

    if-ne v0, v12, :cond_8

    if-ne v3, v7, :cond_8

    if-eqz v13, :cond_8

    invoke-virtual {v13}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v15

    if-nez v15, :cond_b

    goto :goto_4

    :cond_b
    const-wide v12, -0x18d9fffff835L

    :try_start_2
    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v14

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-virtual/range {v14 .. v19}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    if-eqz v3, :cond_d

    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v12

    if-eqz v12, :cond_c

    const-wide v12, -0x18e9fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v3, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    if-ltz v12, :cond_c

    invoke-interface {v3, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-wide v12, -0x18f7fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception v0

    move-object v12, v0

    goto :goto_7

    :cond_c
    :goto_6
    :try_start_4
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_8

    :catch_2
    move-exception v0

    goto/16 :goto_b

    :goto_7
    :try_start_5
    throw v12
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_6
    invoke-static {v3, v12}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_d
    :goto_8
    const-wide v12, -0x1886fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v8, v3}, LBz;->J(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_e

    const-wide v12, -0x188bfffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v8, v3}, LBz;->J(Ljava/lang/String;ZLjava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_e

    const-wide v12, -0x1890fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_4

    :cond_e
    new-instance v3, Ljava/io/File;

    invoke-virtual {v5}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v12

    const-wide v13, -0x18ccfffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v3, v12, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v12

    if-nez v12, :cond_f

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    :cond_f
    new-instance v12, Ljava/io/File;

    invoke-direct {v12, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-virtual {v3, v15}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_2

    if-eqz v3, :cond_10

    :try_start_7
    new-instance v13, Ljava/io/FileOutputStream;

    invoke-direct {v13, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_2

    :try_start_8
    invoke-static {v3, v13}, Lcr;->p(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    :try_start_9
    invoke-virtual {v13}, Ljava/io/FileOutputStream;->close()V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    :try_start_a
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    goto :goto_a

    :catchall_2
    move-exception v0

    move-object v12, v0

    goto :goto_9

    :catchall_3
    move-exception v0

    move-object v12, v0

    :try_start_b
    throw v12
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_4

    :catchall_4
    move-exception v0

    :try_start_c
    invoke-static {v13, v12}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    :goto_9
    :try_start_d
    throw v12
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :catchall_5
    move-exception v0

    :try_start_e
    invoke-static {v3, v12}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_10
    :goto_a
    invoke-static {v12}, Landroid/graphics/Typeface;->createFromFile(Ljava/io/File;)Landroid/graphics/Typeface;

    move-result-object v3

    if-nez v3, :cond_11

    const-wide v13, -0x18a5fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-virtual {v12}, Ljava/io/File;->delete()Z

    goto/16 :goto_4

    :cond_11
    sget-object v3, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v13, -0x18acfffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    const-wide v13, -0x745fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3, v12}, LNx;->e(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v12, -0x75afffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v12, -0x762fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_2

    goto/16 :goto_4

    :goto_b
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v12, -0x76afffff835L

    invoke-static {v12, v13, v3, v0}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_4

    :pswitch_16
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-wide v14, -0xea2afffff835L

    invoke-static {v14, v15}, LGu;->r(J)Ljava/lang/String;

    const/16 v12, 0x4942

    if-ne v0, v12, :cond_8

    if-ne v3, v7, :cond_8

    sget-object v0, Lg8;->b:Lg8;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v13, :cond_8

    invoke-virtual {v13}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v15

    if-nez v15, :cond_12

    goto/16 :goto_4

    :cond_12
    const-wide v12, -0xed9afffff835L

    :try_start_f
    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v14

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-virtual/range {v14 .. v19}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v3
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3

    if-eqz v3, :cond_14

    :try_start_10
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v12

    if-eqz v12, :cond_13

    const-wide v12, -0xeda9fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v3, v12}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    if-ltz v12, :cond_13

    invoke-interface {v3, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    const-wide v12, -0xedb7fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    goto :goto_c

    :catchall_6
    move-exception v0

    move-object v12, v0

    goto :goto_d

    :cond_13
    :goto_c
    :try_start_11
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_3

    goto :goto_e

    :catch_3
    move-exception v0

    goto/16 :goto_12

    :goto_d
    :try_start_12
    throw v12
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_7

    :catchall_7
    move-exception v0

    :try_start_13
    invoke-static {v3, v12}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_14
    :goto_e
    new-instance v3, Ljava/io/File;

    invoke-virtual {v5}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v12

    const-wide v13, -0xec46fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v13

    invoke-direct {v3, v12, v13}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v12

    if-nez v12, :cond_15

    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    :cond_15
    new-instance v12, Ljava/io/File;

    invoke-direct {v12, v3, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v3

    invoke-virtual {v3, v15}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v3
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_3

    if-eqz v3, :cond_16

    :try_start_14
    new-instance v13, Ljava/io/FileOutputStream;

    invoke-direct {v13, v12}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_8

    :try_start_15
    invoke-static {v3, v13}, Lcr;->p(Ljava/io/InputStream;Ljava/io/OutputStream;)J
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_9

    :try_start_16
    invoke-virtual {v13}, Ljava/io/FileOutputStream;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_8

    :try_start_17
    invoke-interface {v3}, Ljava/io/Closeable;->close()V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_3

    goto :goto_10

    :catchall_8
    move-exception v0

    move-object v12, v0

    goto :goto_f

    :catchall_9
    move-exception v0

    move-object v12, v0

    :try_start_18
    throw v12
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_a

    :catchall_a
    move-exception v0

    :try_start_19
    invoke-static {v13, v12}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_8

    :goto_f
    :try_start_1a
    throw v12
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_b

    :catchall_b
    move-exception v0

    :try_start_1b
    invoke-static {v3, v12}, LNj;->f(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_16
    :goto_10
    new-instance v3, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v3}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-boolean v8, v3, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v3}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    iget v13, v3, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-lez v13, :cond_18

    iget v3, v3, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    if-gtz v3, :cond_17

    goto :goto_11

    :cond_17
    sget-object v3, LNx;->a:Landroid/content/SharedPreferences;

    const-wide v13, -0xec5afffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v12}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v12

    const-wide v13, -0xec71fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3, v12}, LNx;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {}, Lg8;->o()V

    invoke-static {}, Lg8;->n()V

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v12, -0xec06fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-wide v12, -0xec10fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_4

    :cond_18
    :goto_11
    const-wide v13, -0xec55fffff835L

    invoke-static {v13, v14}, LGu;->r(J)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    invoke-virtual {v12}, Ljava/io/File;->delete()Z
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_3

    goto/16 :goto_4

    :goto_12
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-wide v12, -0xec25fffff835L

    invoke-static {v12, v13, v3, v0}, LEy;->c(JLjava/lang/StringBuilder;Ljava/lang/Exception;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v10}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto/16 :goto_4

    :cond_19
    return-object v9

    :pswitch_17
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v4, -0x56ecfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v0, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v4, -0x56f8fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/app/Activity;

    const-wide v4, -0x56b2fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    new-array v5, v10, [Ljava/lang/Object;

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0, v4, v2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    const-wide v2, -0x5541fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, LWk;

    if-eqz v2, :cond_1a

    invoke-virtual {v0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    const-wide v2, -0x557dfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, LWk;

    invoke-interface {v0}, LWk;->b()V

    :cond_1a
    return-object v9

    :pswitch_18
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v11, -0x5642fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v11, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v12, -0x564efffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    check-cast v11, Landroid/app/Activity;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    aget-object v0, v0, v10

    invoke-virtual {v11}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-wide v12, -0x5608fffff835L

    invoke-static {v12, v13}, LGu;->r(J)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0, v12, v7}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    if-eq v0, v7, :cond_1d

    sget-object v12, Lds;->a:Lds;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v12, 0xc

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/16 v13, 0x18

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v14, 0x14

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    move-wide/from16 v16, v2

    const v3, 0x550603f9

    const/16 v5, 0x10

    const/4 v6, -0x2

    const v15, 0x55060040

    packed-switch v0, :pswitch_data_2

    packed-switch v0, :pswitch_data_3

    new-instance v0, Ljq;

    invoke-direct {v0, v11}, Ljq;-><init>(Landroid/content/Context;)V

    goto/16 :goto_13

    :pswitch_19
    new-instance v0, LQC;

    invoke-direct {v0}, LQC;-><init>()V

    goto/16 :goto_13

    :pswitch_1a
    new-instance v0, Lnp;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_13

    :pswitch_1b
    new-instance v0, LSA;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_13

    :pswitch_1c
    new-instance v0, LWA;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto/16 :goto_13

    :pswitch_1d
    new-instance v0, Lb8;

    invoke-direct {v0}, Lb8;-><init>()V

    goto/16 :goto_13

    :pswitch_1e
    new-instance v0, LTi;

    invoke-direct {v0}, LTi;-><init>()V

    goto/16 :goto_13

    :pswitch_1f
    new-instance v0, LRp;

    invoke-direct {v0}, LRp;-><init>()V

    goto/16 :goto_13

    :pswitch_20
    new-instance v0, Lha;

    invoke-direct {v0, v8}, Lha;-><init>(I)V

    goto/16 :goto_13

    :pswitch_21
    new-instance v0, Lha;

    invoke-direct {v0, v8}, Lha;-><init>(I)V

    goto/16 :goto_13

    :pswitch_22
    new-instance v0, LPi;

    const-wide v20, -0x47d4fffff835L

    invoke-static/range {v20 .. v21}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {v0, v11}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v15}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    new-instance v2, Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-direct {v2, v15}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v15, v7, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v2, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2, v10}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setOverScrollMode(I)V

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v15

    invoke-direct {v4, v15}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v15, v7, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v4, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-virtual {v4, v6, v15, v7, v8}, Landroid/view/View;->setPadding(IIII)V

    iput-object v4, v0, LPi;->a:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v4}, Landroid/widget/ScrollView;->addView(Landroid/view/View;)V

    iget-object v2, v0, LPi;->a:Landroid/widget/LinearLayout;

    if-nez v2, :cond_1b

    const-wide v6, -0x47eafffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    const/4 v2, 0x0

    :cond_1b
    new-instance v4, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v4, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v4, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v4, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-virtual {v4, v10, v10, v10, v5}, Landroid/view/View;->setPadding(IIII)V

    new-instance v5, Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v6, -0x47f8fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41c00000    # 24.0f

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-static {v12}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-virtual {v5, v10, v10, v6, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v5, Landroid/widget/TextView;

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v5, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v6, -0x47fbfffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v6, 0x41b00000    # 22.0f

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v3, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iget-object v2, v0, LPi;->a:Landroid/widget/LinearLayout;

    if-nez v2, :cond_1c

    const-wide v2, -0x4780fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    const/4 v2, 0x0

    :cond_1c
    new-instance v3, Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v4, -0x478efffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v4, 0x41600000    # 14.0f

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    const v5, 0x550603f7

    invoke-virtual {v4, v5}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-virtual {v3, v10, v10, v10, v4}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v2, Lhe;->a:Lhd;

    sget-object v2, LZp;->a:Lnk;

    invoke-static {v2}, LPj;->a(Lac;)LCb;

    move-result-object v2

    new-instance v3, Ll;

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-direct {v3, v0, v5, v4}, Ll;-><init>(LWk;LEb;I)V

    invoke-static {v2, v3, v4}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    goto/16 :goto_13

    :pswitch_23
    new-instance v0, Loy;

    const-wide v7, -0x1b279fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    invoke-direct {v0, v11}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setOrientation(I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setClickable(Z)V

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2, v15}, Landroid/content/Context;->getColor(I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v2

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v8

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v15

    invoke-virtual {v0, v2, v7, v8, v15}, Landroid/view/View;->setPadding(IIII)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v2, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v7, 0x1

    invoke-virtual {v2, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v7, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v7}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    const v15, 0x55060043

    invoke-virtual {v8, v15}, Landroid/content/Context;->getColor(I)I

    move-result v8

    invoke-virtual {v2, v8}, Landroid/view/View;->setBackgroundColor(I)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    int-to-float v5, v5

    invoke-virtual {v7, v5}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v2, v7}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-virtual {v2, v5, v7, v6, v4}, Landroid/view/View;->setPadding(IIII)V

    new-instance v4, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v5, 0x41800000    # 16.0f

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    const/16 v6, 0x11

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setGravity(I)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-virtual {v4, v10, v10, v10, v7}, Landroid/widget/TextView;->setPadding(IIII)V

    iput-object v4, v0, Loy;->b:Landroid/widget/TextView;

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v4, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const/high16 v7, 0x41600000    # 14.0f

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    const v3, 0x5506004b

    invoke-virtual {v7, v3}, Landroid/content/Context;->getColor(I)I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setGravity(I)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-virtual {v4, v10, v10, v10, v3}, Landroid/widget/TextView;->setPadding(IIII)V

    iput-object v4, v0, Loy;->c:Landroid/widget/TextView;

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v3, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setTextSize(F)V

    const/4 v4, -0x1

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v3, v6}, Landroid/widget/TextView;->setGravity(I)V

    const/16 v4, 0xa

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-virtual {v3, v10, v7, v10, v6}, Landroid/widget/TextView;->setPadding(IIII)V

    new-instance v6, Lh;

    invoke-direct {v6, v4, v0}, Lh;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v3, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v6, -0x16e19d

    invoke-virtual {v4, v6}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    const/16 v6, 0x2d

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v6}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    int-to-float v6, v6

    invoke-virtual {v4, v6}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iput-object v3, v0, Loy;->a:Landroid/widget/TextView;

    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {v2, v10}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-virtual {v4, v15}, Landroid/content/Context;->getColor(I)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    int-to-float v4, v4

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v6

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-virtual {v2, v3, v4, v6, v7}, Landroid/view/View;->setPadding(IIII)V

    new-instance v3, Lh;

    const/16 v4, 0xb

    invoke-direct {v3, v4, v2}, Lh;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance v3, Lue;

    const/4 v4, 0x2

    invoke-direct {v3, v4, v2}, Lue;-><init>(ILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v6, -0x2

    invoke-direct {v3, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    iput v4, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v2, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    new-instance v4, Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v4, v6}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    const v6, 0x5508010b

    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setImageResource(I)V

    sget-object v6, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const v7, 0x550603f9

    invoke-virtual {v6, v7}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setColorFilter(I)V

    new-instance v6, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v13}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-direct {v6, v7, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/16 v7, 0x10

    iput v7, v6, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v2, v4, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-direct {v4, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v6, -0x1b230fffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    const v7, 0x550603f9

    invoke-virtual {v6, v7}, Landroid/content/Context;->getColor(I)I

    move-result v6

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTextColor(I)V

    sget-object v6, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v13, -0x2

    invoke-direct {v7, v13, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v12}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-virtual {v7, v13}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    const/16 v13, 0x10

    iput v13, v7, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    invoke-virtual {v4, v7}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v2, v0, Loy;->d:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v2, Landroid/widget/LinearLayout;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v7, 0x1

    invoke-virtual {v2, v7}, Landroid/widget/LinearLayout;->setOrientation(I)V

    new-instance v4, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-virtual {v7, v15}, Landroid/content/Context;->getColor(I)I

    move-result v7

    invoke-virtual {v4, v7}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    int-to-float v7, v7

    invoke-virtual {v4, v7}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v4

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v13

    invoke-static {v14}, LGu;->i(Ljava/lang/Number;)I

    move-result v14

    invoke-virtual {v2, v4, v7, v13, v14}, Landroid/view/View;->setPadding(IIII)V

    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x1

    const/4 v13, -0x2

    invoke-direct {v4, v7, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v8}, LGu;->i(Ljava/lang/Number;)I

    move-result v7

    iput v7, v4, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    invoke-virtual {v2, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v7

    invoke-direct {v4, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v7, -0x1b2c7fffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v7, 0x550603f9

    invoke-virtual {v5, v7}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-virtual {v4, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    invoke-static {v12}, LGu;->i(Ljava/lang/Number;)I

    move-result v5

    invoke-virtual {v4, v10, v10, v10, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    new-instance v4, Landroid/widget/TextView;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-direct {v4, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    const-wide v5, -0x1b2ccfffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/high16 v7, 0x41600000    # 14.0f

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setTextSize(F)V

    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    const v6, 0x550603f7

    invoke-virtual {v5, v6}, Landroid/content/Context;->getColor(I)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, LGu;->i(Ljava/lang/Number;)I

    move-result v3

    invoke-virtual {v4, v3, v10, v10, v10}, Landroid/widget/TextView;->setPadding(IIII)V

    const/high16 v3, 0x40c00000    # 6.0f

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v4, v3, v5}, Landroid/widget/TextView;->setLineSpacing(FF)V

    invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    sget-object v2, Lhe;->a:Lhd;

    sget-object v2, LZp;->a:Lnk;

    invoke-static {v2}, LPj;->a(Lac;)LCb;

    move-result-object v2

    new-instance v3, Lny;

    const/4 v5, 0x0

    invoke-direct {v3, v0, v5, v10}, Lny;-><init>(Loy;LEb;I)V

    const/4 v4, 0x3

    invoke-static {v2, v3, v4}, LNj;->G(Lfc;Lkotlin/jvm/functions/Function2;I)V

    goto :goto_13

    :pswitch_24
    new-instance v0, LkD;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    goto :goto_13

    :pswitch_25
    new-instance v0, LXg;

    invoke-direct {v0, v11}, LXg;-><init>(Landroid/content/Context;)V

    goto :goto_13

    :pswitch_26
    new-instance v0, Lha;

    invoke-direct {v0, v10}, Lha;-><init>(I)V

    sget-object v2, LKf;->a:LKf;

    iput-object v2, v0, Lha;->i:Ljava/lang/Object;

    goto :goto_13

    :pswitch_27
    new-instance v0, Lm;

    invoke-direct {v0, v11}, Lm;-><init>(Landroid/content/Context;)V

    goto :goto_13

    :pswitch_28
    new-instance v0, Ljq;

    invoke-direct {v0, v11}, Ljq;-><init>(Landroid/content/Context;)V

    :goto_13
    invoke-interface {v0, v11}, LWk;->d(Landroid/app/Activity;)V

    const-wide v2, -0x5616fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0}, LWk;->getTitle()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    const/4 v7, 0x1

    invoke-static {v3, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    const-wide v2, -0x5621fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    new-array v3, v10, [Ljava/lang/Object;

    invoke-static/range {v16 .. v17}, LGu;->r(J)Ljava/lang/String;

    invoke-static {v3, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11, v2, v3}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-wide v3, -0x5630fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    invoke-interface {v0}, LWk;->getContentView()Landroid/view/View;

    move-result-object v0

    const/4 v4, -0x1

    invoke-virtual {v2, v0, v4, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;II)V

    :cond_1d
    return-object v9

    :pswitch_29
    move-object v5, v6

    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x5f1fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    sget-object v2, LWr;->b:LWr;

    invoke-virtual {v2}, LZk;->e()Z

    move-result v2

    if-nez v2, :cond_1e

    goto/16 :goto_19

    :cond_1e
    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v0, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v0, [Ljava/lang/Object;

    array-length v2, v0

    const/4 v3, 0x4

    if-ge v2, v3, :cond_1f

    goto/16 :goto_19

    :cond_1f
    array-length v2, v0

    const/16 v23, 0x2

    add-int/lit8 v2, v2, -0x2

    move v4, v2

    :goto_14
    const/4 v7, -0x1

    if-ge v7, v4, :cond_23

    aget-object v2, v0, v4

    add-int/lit8 v3, v4, 0x1

    aget-object v3, v0, v3

    instance-of v6, v2, Ljava/lang/Integer;

    if-eqz v6, :cond_22

    instance-of v6, v3, Ljava/lang/Integer;

    if-eqz v6, :cond_22

    sget-object v6, LVr;->g:Log;

    if-eqz v6, :cond_20

    invoke-virtual {v6}, LA;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_20

    goto :goto_16

    :cond_20
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v7, Lx;

    invoke-direct {v7, v10, v6}, Lx;-><init>(ILjava/lang/Object;)V

    :cond_21
    invoke-virtual {v7}, Lx;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_22

    invoke-virtual {v7}, Lx;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, LVr;

    iget v8, v6, LVr;->a:I

    move-object v11, v2

    check-cast v11, Ljava/lang/Number;

    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    move-result v11

    if-ne v8, v11, :cond_21

    iget v6, v6, LVr;->b:I

    move-object v8, v3

    check-cast v8, Ljava/lang/Number;

    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    move-result v8

    if-ne v6, v8, :cond_21

    :goto_15
    const/4 v7, -0x1

    goto :goto_17

    :cond_22
    :goto_16
    add-int/lit8 v4, v4, -0x1

    goto :goto_14

    :cond_23
    const/4 v4, -0x1

    goto :goto_15

    :goto_17
    if-ne v4, v7, :cond_24

    goto :goto_19

    :cond_24
    aget-object v2, v0, v4

    const-wide v6, -0x5fefffff835L

    invoke-static {v6, v7}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/lit8 v3, v4, 0x1

    aget-object v6, v0, v3

    const-wide v7, -0x5aefffff835L

    invoke-static {v7, v8}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    sget-object v7, LVr;->g:Log;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v8, Lx;

    invoke-direct {v8, v10, v7}, Lx;-><init>(ILjava/lang/Object;)V

    :cond_25
    invoke-virtual {v8}, Lx;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_26

    invoke-virtual {v8}, Lx;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, LVr;

    iget v11, v10, LVr;->a:I

    if-ne v11, v2, :cond_25

    iget v10, v10, LVr;->b:I

    if-ne v10, v6, :cond_25

    move-object v6, v7

    goto :goto_18

    :cond_26
    move-object v6, v5

    :goto_18
    check-cast v6, LVr;

    sget-object v2, LVr;->d:LVr;

    if-eq v6, v2, :cond_27

    sget-object v2, LVr;->e:LVr;

    if-ne v6, v2, :cond_28

    :cond_27
    sget-object v2, LVr;->c:LVr;

    iget v5, v2, LVr;->a:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v0, v4

    iget v2, v2, LVr;->b:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v0, v3

    :cond_28
    :goto_19
    return-object v9

    :pswitch_2a
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x2844fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v2, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    aget-object v2, v2, v10

    const-wide v3, -0x284ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v0, v0, Lqs;->d:Ljava/lang/Object;

    check-cast v0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {v0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v0

    const-wide v3, -0x287ffffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0, v2}, Ljp;->c(Landroid/view/ViewGroup;I)V

    return-object v9

    :pswitch_2b
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x294afffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v2, v0, Lqs;->c:Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    aget-object v3, v2, v10

    const-wide v4, -0x2955fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    check-cast v3, Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, v0, Lqs;->b:Ljava/lang/Object;

    const-wide v5, -0x2905fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v4, Landroid/widget/BaseAdapter;

    invoke-interface {v4}, Landroid/widget/Adapter;->getCount()I

    move-result v5

    const/16 v22, 0x1

    add-int/lit8 v5, v5, -0x1

    if-ne v3, v5, :cond_2a

    add-int/lit8 v5, v3, -0x1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    aput-object v5, v2, v10

    iget-object v5, v0, Lqs;->a:Ljava/lang/Object;

    check-cast v5, Ljava/lang/reflect/Member;

    invoke-static {v5, v4, v2}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const-wide v5, -0x29c5fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Landroid/view/ViewGroup;

    invoke-virtual {v0, v2}, Lqs;->C(Ljava/lang/Object;)V

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-wide v5, -0x2981fffff835L

    invoke-static {v5, v6}, LGu;->r(J)Ljava/lang/String;

    check-cast v0, Landroid/app/Activity;

    new-instance v5, LC7;

    const/4 v6, 0x3

    invoke-direct {v5, v0, v6}, LC7;-><init>(Landroid/app/Activity;I)V

    invoke-virtual {v2, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    sget v0, LTB;->h:I

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_2a

    invoke-interface {v4}, Landroid/widget/Adapter;->getCount()I

    move-result v4

    const/16 v22, 0x1

    add-int/lit8 v4, v4, -0x1

    if-ne v3, v4, :cond_29

    const-wide v4, -0x29bbfffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_29
    invoke-static {v2, v3}, Ljp;->c(Landroid/view/ViewGroup;I)V

    :cond_2a
    return-object v9

    :pswitch_2c
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x2a8efffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v2, v0, Lqs;->d:Ljava/lang/Object;

    check-cast v2, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {v2}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    move-result-object v2

    const-wide v3, -0x2a9afffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    const/16 v22, 0x1

    add-int/lit8 v2, v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Lqs;->C(Ljava/lang/Object;)V

    return-object v9

    :pswitch_2d
    move-object/from16 v0, p1

    check-cast v0, LhG;

    const-wide v2, -0x1a02bfffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    iget-object v0, v0, LhG;->a:Lqs;

    iget-object v0, v0, Lqs;->b:Ljava/lang/Object;

    sget-object v2, LXA;->a:Ljava/util/HashMap;

    const-wide v2, -0x1a0c9fffff835L

    invoke-static {v2, v3}, LGu;->r(J)Ljava/lang/String;

    move-result-object v2

    invoke-static {v10, v2}, Lhw;->a(ILjava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_2c

    sget v3, LgG;->a:I

    const-wide v3, -0x1a0e4fffff835L

    invoke-static {v3, v4}, LGu;->r(J)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, LfG;->r0(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v3

    const-wide v4, -0x1a089fffff835L

    invoke-static {v4, v5}, LGu;->r(J)Ljava/lang/String;

    array-length v4, v3

    :goto_1a
    if-ge v10, v4, :cond_2c

    aget-object v5, v3, v10

    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v6, v7}, LNj;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const/4 v7, 0x1

    if-eqz v6, :cond_2b

    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const-wide v11, -0x1a0a0fffff835L

    invoke-static {v11, v12}, LGu;->r(J)Ljava/lang/String;

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const v8, -0xf83ea0

    if-ne v6, v8, :cond_2b

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5, v0, v6}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2b
    add-int/lit8 v10, v10, 0x1

    goto :goto_1a

    :cond_2c
    return-object v9

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_18
        :pswitch_17
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_16
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x3ea
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
    .end packed-switch
.end method
