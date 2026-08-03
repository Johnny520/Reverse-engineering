.class public final Le/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:Ljava/lang/CharSequence;

.field public B:Landroid/content/res/ColorStateList;

.field public C:Landroid/graphics/PorterDuff$Mode;

.field public final synthetic D:Le/d;

.field public final a:Landroid/view/Menu;

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:Z

.field public g:Z

.field public h:Z

.field public i:I

.field public j:I

.field public k:Ljava/lang/CharSequence;

.field public l:Ljava/lang/CharSequence;

.field public m:I

.field public n:C

.field public o:I

.field public p:C

.field public q:I

.field public r:I

.field public s:Z

.field public t:Z

.field public u:Z

.field public v:I

.field public w:I

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Le/d;Landroid/view/Menu;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le/c;->D:Le/d;

    const/4 p1, 0x0

    iput-object p1, p0, Le/c;->B:Landroid/content/res/ColorStateList;

    iput-object p1, p0, Le/c;->C:Landroid/graphics/PorterDuff$Mode;

    iput-object p2, p0, Le/c;->a:Landroid/view/Menu;

    const/4 p1, 0x0

    iput p1, p0, Le/c;->b:I

    iput p1, p0, Le/c;->c:I

    iput p1, p0, Le/c;->d:I

    iput p1, p0, Le/c;->e:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Le/c;->f:Z

    iput-boolean p1, p0, Le/c;->g:Z

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    :try_start_0
    iget-object v0, p0, Le/c;->D:Le/d;

    iget-object v0, v0, Le/d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {p1, v1, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    invoke-virtual {p1, p3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(Landroid/view/MenuItem;)V
    .locals 7

    iget-boolean v0, p0, Le/c;->s:Z

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setChecked(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Le/c;->t:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setVisible(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-boolean v1, p0, Le/c;->u:Z

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setEnabled(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, Le/c;->r:I

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-lt v1, v3, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setCheckable(Z)Landroid/view/MenuItem;

    move-result-object v0

    iget-object v1, p0, Le/c;->l:Ljava/lang/CharSequence;

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    iget v1, p0, Le/c;->m:I

    invoke-interface {v0, v1}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    iget v0, p0, Le/c;->v:I

    if-ltz v0, :cond_1

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setShowAsAction(I)V

    :cond_1
    iget-object v0, p0, Le/c;->y:Ljava/lang/String;

    iget-object v1, p0, Le/c;->D:Le/d;

    if-eqz v0, :cond_4

    iget-object v0, v1, Le/d;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->isRestricted()Z

    move-result v0

    if-nez v0, :cond_3

    new-instance v0, Le/b;

    iget-object v4, v1, Le/d;->d:Ljava/lang/Object;

    if-nez v4, :cond_2

    iget-object v4, v1, Le/d;->c:Landroid/content/Context;

    invoke-static {v4}, Le/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    iput-object v4, v1, Le/d;->d:Ljava/lang/Object;

    :cond_2
    iget-object v4, v1, Le/d;->d:Ljava/lang/Object;

    iget-object v5, p0, Le/c;->y:Ljava/lang/String;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v4, v0, Le/b;->a:Ljava/lang/Object;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    :try_start_0
    sget-object v6, Le/b;->c:[Ljava/lang/Class;

    invoke-virtual {v4, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    iput-object v6, v0, Le/b;->b:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    goto :goto_1

    :catch_0
    move-exception p1

    new-instance v0, Landroid/view/InflateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Couldn\'t resolve menu item onClick handler "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " in class "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/view/InflateException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The android:onClick attribute cannot be used within a restricted context"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_1
    iget v0, p0, Le/c;->r:I

    const/4 v4, 0x2

    if-lt v0, v4, :cond_5

    instance-of v0, p1, Lf/k;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Lf/k;

    iget v4, v0, Lf/k;->x:I

    and-int/lit8 v4, v4, -0x5

    or-int/lit8 v4, v4, 0x4

    iput v4, v0, Lf/k;->x:I

    :cond_5
    iget-object v0, p0, Le/c;->x:Ljava/lang/String;

    if-eqz v0, :cond_6

    sget-object v2, Le/d;->e:[Ljava/lang/Class;

    iget-object v1, v1, Le/d;->a:[Ljava/lang/Object;

    invoke-virtual {p0, v0, v2, v1}, Le/c;->a(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(Landroid/view/View;)Landroid/view/MenuItem;

    move v2, v3

    :cond_6
    iget v0, p0, Le/c;->w:I

    if-lez v0, :cond_7

    if-nez v2, :cond_7

    invoke-interface {p1, v0}, Landroid/view/MenuItem;->setActionView(I)Landroid/view/MenuItem;

    :cond_7
    iget-object v0, p0, Le/c;->z:Ljava/lang/CharSequence;

    instance-of v1, p1, Lf/k;

    if-eqz v1, :cond_8

    move-object v2, p1

    check-cast v2, Lf/k;

    invoke-virtual {v2, v0}, Lf/k;->e(Ljava/lang/CharSequence;)Lf/k;

    goto :goto_2

    :cond_8
    invoke-static {p1, v0}, LD/l;->h(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    :goto_2
    iget-object v0, p0, Le/c;->A:Ljava/lang/CharSequence;

    if-eqz v1, :cond_9

    move-object v2, p1

    check-cast v2, Lf/k;

    invoke-virtual {v2, v0}, Lf/k;->g(Ljava/lang/CharSequence;)Lf/k;

    goto :goto_3

    :cond_9
    invoke-static {p1, v0}, LD/l;->m(Landroid/view/MenuItem;Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    :goto_3
    iget-char v0, p0, Le/c;->n:C

    iget v2, p0, Le/c;->o:I

    if-eqz v1, :cond_a

    move-object v3, p1

    check-cast v3, Lf/k;

    invoke-virtual {v3, v0, v2}, Lf/k;->setAlphabeticShortcut(CI)Landroid/view/MenuItem;

    goto :goto_4

    :cond_a
    invoke-static {p1, v0, v2}, LD/l;->g(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    :goto_4
    iget-char v0, p0, Le/c;->p:C

    iget v2, p0, Le/c;->q:I

    if-eqz v1, :cond_b

    move-object v3, p1

    check-cast v3, Lf/k;

    invoke-virtual {v3, v0, v2}, Lf/k;->setNumericShortcut(CI)Landroid/view/MenuItem;

    goto :goto_5

    :cond_b
    invoke-static {p1, v0, v2}, LD/l;->k(Landroid/view/MenuItem;CI)Landroid/view/MenuItem;

    :goto_5
    iget-object v0, p0, Le/c;->C:Landroid/graphics/PorterDuff$Mode;

    if-eqz v0, :cond_d

    if-eqz v1, :cond_c

    move-object v2, p1

    check-cast v2, Lf/k;

    invoke-virtual {v2, v0}, Lf/k;->setIconTintMode(Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    goto :goto_6

    :cond_c
    invoke-static {p1, v0}, LD/l;->j(Landroid/view/MenuItem;Landroid/graphics/PorterDuff$Mode;)Landroid/view/MenuItem;

    :cond_d
    :goto_6
    iget-object v0, p0, Le/c;->B:Landroid/content/res/ColorStateList;

    if-eqz v0, :cond_f

    if-eqz v1, :cond_e

    check-cast p1, Lf/k;

    invoke-virtual {p1, v0}, Lf/k;->setIconTintList(Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    goto :goto_7

    :cond_e
    invoke-static {p1, v0}, LD/l;->i(Landroid/view/MenuItem;Landroid/content/res/ColorStateList;)Landroid/view/MenuItem;

    :cond_f
    :goto_7
    return-void
.end method
