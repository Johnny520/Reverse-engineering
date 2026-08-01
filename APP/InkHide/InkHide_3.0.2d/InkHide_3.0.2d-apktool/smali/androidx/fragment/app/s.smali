.class public final Landroidx/fragment/app/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final b:Landroidx/fragment/app/z;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/z;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 10

    .line 2
    const-class v0, Landroidx/fragment/app/q;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget-object v4, p0, Landroidx/fragment/app/s;->b:Landroidx/fragment/app/z;

    if-eqz v0, :cond_9

    .line 3
    new-instance p1, Landroidx/fragment/app/q;

    .line 4
    invoke-direct {p1, p3, p4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    iput-boolean v3, p1, Landroidx/fragment/app/q;->e:Z

    .line 6
    invoke-interface {p4}, Landroid/util/AttributeSet;->getClassAttribute()Ljava/lang/String;

    move-result-object p2

    .line 7
    sget-object v0, LI/a;->b:[I

    invoke-virtual {p3, p4, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p4

    if-nez p2, :cond_0

    .line 8
    invoke-virtual {p4, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    .line 9
    :cond_0
    invoke-virtual {p4, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 10
    invoke-virtual {p4}, Landroid/content/res/TypedArray;->recycle()V

    .line 11
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p4

    .line 12
    invoke-virtual {v4, p4}, Landroidx/fragment/app/z;->y(I)Landroidx/fragment/app/l;

    move-result-object v1

    if-eqz p2, :cond_6

    if-nez v1, :cond_6

    if-gtz p4, :cond_2

    if-eqz v0, :cond_1

    .line 13
    const-string p1, " with tag "

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    .line 14
    :cond_1
    const-string p1, ""

    .line 15
    :goto_0
    new-instance p3, Ljava/lang/IllegalStateException;

    const-string p4, "FragmentContainerView must have an android:id to add Fragment "

    .line 16
    invoke-static {p4, p2, p1}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 17
    invoke-direct {p3, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p3

    .line 18
    :cond_2
    invoke-virtual {v4}, Landroidx/fragment/app/z;->B()Landroidx/fragment/app/v;

    move-result-object p4

    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    invoke-virtual {p4, p2}, Landroidx/fragment/app/v;->a(Ljava/lang/String;)Landroidx/fragment/app/l;

    move-result-object p2

    .line 19
    iput-boolean v3, p2, Landroidx/fragment/app/l;->D:Z

    .line 20
    iget-object p3, p2, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    if-nez p3, :cond_3

    goto :goto_1

    :cond_3
    iget-object v2, p3, Landroidx/fragment/app/o;->d:Le/i;

    :goto_1
    if-eqz v2, :cond_4

    .line 21
    iput-boolean v3, p2, Landroidx/fragment/app/l;->D:Z

    .line 22
    :cond_4
    new-instance p3, Landroidx/fragment/app/a;

    invoke-direct {p3, v4}, Landroidx/fragment/app/a;-><init>(Landroidx/fragment/app/z;)V

    .line 23
    iput-boolean v3, p3, Landroidx/fragment/app/a;->o:Z

    .line 24
    iput-object p1, p2, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p4

    invoke-virtual {p3, p4, p2, v0}, Landroidx/fragment/app/a;->a(ILandroidx/fragment/app/l;Ljava/lang/String;)V

    .line 26
    iget-boolean p2, p3, Landroidx/fragment/app/a;->g:Z

    if-nez p2, :cond_5

    .line 27
    iget-object p2, p3, Landroidx/fragment/app/a;->p:Landroidx/fragment/app/z;

    invoke-virtual {p2, p3, v3}, Landroidx/fragment/app/z;->w(Landroidx/fragment/app/a;Z)V

    goto :goto_2

    .line 28
    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "This transaction is already being added to the back stack"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 29
    :cond_6
    :goto_2
    iget-object p2, v4, Landroidx/fragment/app/z;->c:LC/h;

    invoke-virtual {p2}, LC/h;->k()Ljava/util/ArrayList;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_7
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/fragment/app/F;

    .line 30
    iget-object p4, p3, Landroidx/fragment/app/F;->c:Landroidx/fragment/app/l;

    .line 31
    iget v0, p4, Landroidx/fragment/app/l;->x:I

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    if-ne v0, v1, :cond_7

    iget-object v0, p4, Landroidx/fragment/app/l;->F:Landroid/view/View;

    if-eqz v0, :cond_7

    .line 32
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_7

    .line 33
    iput-object p1, p4, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 34
    invoke-virtual {p3}, Landroidx/fragment/app/F;->b()V

    goto :goto_3

    :cond_8
    return-object p1

    .line 35
    :cond_9
    const-string v0, "fragment"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    goto/16 :goto_b

    .line 36
    :cond_a
    const-string p2, "class"

    invoke-interface {p4, v2, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 37
    sget-object v0, LI/a;->a:[I

    invoke-virtual {p3, p4, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    if-nez p2, :cond_b

    .line 38
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_b
    const/4 v5, -0x1

    .line 39
    invoke-virtual {v0, v3, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    const/4 v7, 0x2

    .line 40
    invoke-virtual {v0, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 41
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_1e

    .line 42
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 43
    :try_start_0
    invoke-static {v0, p2}, Landroidx/fragment/app/v;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    .line 44
    const-class v9, Landroidx/fragment/app/l;

    invoke-virtual {v9, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move v0, v1

    :goto_4
    if-nez v0, :cond_c

    goto/16 :goto_b

    :cond_c
    if-eqz p1, :cond_d

    .line 45
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v1

    :cond_d
    if-ne v1, v5, :cond_f

    if-ne v6, v5, :cond_f

    if-eqz v8, :cond_e

    goto :goto_5

    .line 46
    :cond_e
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_f
    :goto_5
    if-eq v6, v5, :cond_10

    .line 47
    invoke-virtual {v4, v6}, Landroidx/fragment/app/z;->y(I)Landroidx/fragment/app/l;

    move-result-object v0

    goto :goto_6

    :cond_10
    move-object v0, v2

    :goto_6
    if-nez v0, :cond_11

    if-eqz v8, :cond_11

    .line 48
    invoke-virtual {v4, v8}, Landroidx/fragment/app/z;->z(Ljava/lang/String;)Landroidx/fragment/app/l;

    move-result-object v0

    :cond_11
    if-nez v0, :cond_12

    if-eq v1, v5, :cond_12

    .line 49
    invoke-virtual {v4, v1}, Landroidx/fragment/app/z;->y(I)Landroidx/fragment/app/l;

    move-result-object v0

    .line 50
    :cond_12
    const-string v5, "Fragment "

    const-string v9, "FragmentManager"

    if-nez v0, :cond_16

    .line 51
    invoke-virtual {v4}, Landroidx/fragment/app/z;->B()Landroidx/fragment/app/v;

    move-result-object p4

    .line 52
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 53
    invoke-virtual {p4, p2}, Landroidx/fragment/app/v;->a(Ljava/lang/String;)Landroidx/fragment/app/l;

    move-result-object v0

    .line 54
    iput-boolean v3, v0, Landroidx/fragment/app/l;->n:Z

    if-eqz v6, :cond_13

    move p3, v6

    goto :goto_7

    :cond_13
    move p3, v1

    .line 55
    :goto_7
    iput p3, v0, Landroidx/fragment/app/l;->w:I

    .line 56
    iput v1, v0, Landroidx/fragment/app/l;->x:I

    .line 57
    iput-object v8, v0, Landroidx/fragment/app/l;->y:Ljava/lang/String;

    .line 58
    iput-boolean v3, v0, Landroidx/fragment/app/l;->o:Z

    .line 59
    iput-object v4, v0, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 60
    iget-object p3, v4, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 61
    iput-object p3, v0, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 62
    iget-object p4, p3, Landroidx/fragment/app/o;->e:Le/i;

    .line 63
    iput-boolean v3, v0, Landroidx/fragment/app/l;->D:Z

    if-nez p3, :cond_14

    goto :goto_8

    .line 64
    :cond_14
    iget-object v2, p3, Landroidx/fragment/app/o;->d:Le/i;

    :goto_8
    if-eqz v2, :cond_15

    .line 65
    iput-boolean v3, v0, Landroidx/fragment/app/l;->D:Z

    .line 66
    :cond_15
    invoke-virtual {v4, v0}, Landroidx/fragment/app/z;->a(Landroidx/fragment/app/l;)Landroidx/fragment/app/F;

    move-result-object p3

    .line 67
    invoke-static {v7}, Landroidx/fragment/app/z;->E(I)Z

    move-result p4

    if-eqz p4, :cond_19

    .line 68
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " has been inflated via the <fragment> tag: id=0x"

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 70
    invoke-static {v9, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_a

    .line 71
    :cond_16
    iget-boolean p3, v0, Landroidx/fragment/app/l;->o:Z

    if-nez p3, :cond_1d

    .line 72
    iput-boolean v3, v0, Landroidx/fragment/app/l;->o:Z

    .line 73
    iput-object v4, v0, Landroidx/fragment/app/l;->s:Landroidx/fragment/app/z;

    .line 74
    iget-object p3, v4, Landroidx/fragment/app/z;->n:Landroidx/fragment/app/o;

    .line 75
    iput-object p3, v0, Landroidx/fragment/app/l;->t:Landroidx/fragment/app/o;

    .line 76
    iget-object p4, p3, Landroidx/fragment/app/o;->e:Le/i;

    .line 77
    iput-boolean v3, v0, Landroidx/fragment/app/l;->D:Z

    if-nez p3, :cond_17

    goto :goto_9

    .line 78
    :cond_17
    iget-object v2, p3, Landroidx/fragment/app/o;->d:Le/i;

    :goto_9
    if-eqz v2, :cond_18

    .line 79
    iput-boolean v3, v0, Landroidx/fragment/app/l;->D:Z

    .line 80
    :cond_18
    invoke-virtual {v4, v0}, Landroidx/fragment/app/z;->f(Landroidx/fragment/app/l;)Landroidx/fragment/app/F;

    move-result-object p3

    .line 81
    invoke-static {v7}, Landroidx/fragment/app/z;->E(I)Z

    move-result p4

    if-eqz p4, :cond_19

    .line 82
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v1, "Retained Fragment "

    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " has been re-attached via the <fragment> tag: id=0x"

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 84
    invoke-static {v9, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    :cond_19
    :goto_a
    check-cast p1, Landroid/view/ViewGroup;

    iput-object p1, v0, Landroidx/fragment/app/l;->E:Landroid/view/ViewGroup;

    .line 86
    invoke-virtual {p3}, Landroidx/fragment/app/F;->k()V

    .line 87
    invoke-virtual {p3}, Landroidx/fragment/app/F;->j()V

    .line 88
    iget-object p1, v0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    if-eqz p1, :cond_1c

    if-eqz v6, :cond_1a

    .line 89
    invoke-virtual {p1, v6}, Landroid/view/View;->setId(I)V

    .line 90
    :cond_1a
    iget-object p1, v0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1b

    .line 91
    iget-object p1, v0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    invoke-virtual {p1, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 92
    :cond_1b
    iget-object p1, v0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    new-instance p2, Landroidx/fragment/app/r;

    invoke-direct {p2, p0, p3}, Landroidx/fragment/app/r;-><init>(Landroidx/fragment/app/s;Landroidx/fragment/app/F;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 93
    iget-object p1, v0, Landroidx/fragment/app/l;->F:Landroid/view/View;

    return-object p1

    .line 94
    :cond_1c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p3, " did not create a view."

    .line 95
    invoke-static {v5, p2, p3}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 96
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 97
    :cond_1d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Duplicate id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", tag "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", or parent id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " with another fragment for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1e
    :goto_b
    return-object v2
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Landroidx/fragment/app/s;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
