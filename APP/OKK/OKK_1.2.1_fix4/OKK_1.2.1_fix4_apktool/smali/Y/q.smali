.class public abstract LY/q;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LY/a;

.field public static final b:Ljava/lang/ThreadLocal;

.field public static final c:Ljava/util/ArrayList;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, LY/a;

    invoke-direct {v0}, LY/m;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, LY/a;->A:Ljava/util/ArrayList;

    const/4 v1, 0x1

    iput-boolean v1, v0, LY/a;->B:Z

    const/4 v1, 0x0

    iput-boolean v1, v0, LY/a;->D:Z

    iput v1, v0, LY/a;->E:I

    const/4 v1, 0x0

    iput-boolean v1, v0, LY/a;->B:Z

    new-instance v1, LY/h;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, LY/h;-><init>(I)V

    invoke-virtual {v0, v1}, LY/a;->I(LY/m;)V

    new-instance v1, LY/f;

    invoke-direct {v1}, LY/m;-><init>()V

    invoke-virtual {v0, v1}, LY/a;->I(LY/m;)V

    new-instance v1, LY/h;

    const/4 v2, 0x1

    invoke-direct {v1, v2}, LY/h;-><init>(I)V

    invoke-virtual {v0, v1}, LY/a;->I(LY/m;)V

    sput-object v0, LY/q;->a:LY/a;

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, LY/q;->b:Ljava/lang/ThreadLocal;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sput-object v0, LY/q;->c:Ljava/util/ArrayList;

    return-void
.end method

.method public static a(Landroid/view/ViewGroup;LY/m;)V
    .locals 3

    sget-object v0, LY/q;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    invoke-virtual {p0}, Landroid/view/View;->isLaidOut()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-nez p1, :cond_0

    sget-object p1, LY/q;->a:LY/a;

    :cond_0
    invoke-virtual {p1}, LY/m;->j()LY/m;

    move-result-object p1

    invoke-static {}, LY/q;->b()Lj/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, p0, v1}, Lj/k;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_1

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LY/m;

    invoke-virtual {v2, p0}, LY/m;->w(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, LY/m;->h(Landroid/view/ViewGroup;Z)V

    const v0, 0x7f0901d0

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LS/d;->i(Ljava/lang/Object;)V

    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    new-instance v0, LY/p;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object p1, v0, LY/p;->a:LY/m;

    iput-object p0, v0, LY/p;->b:Landroid/view/ViewGroup;

    invoke-virtual {p0, v0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p0

    invoke-virtual {p0, v0}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    :cond_2
    return-void
.end method

.method public static b()Lj/b;
    .locals 3

    sget-object v0, LY/q;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/ref/WeakReference;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lj/b;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    new-instance v1, Lj/b;

    invoke-direct {v1}, Lj/k;-><init>()V

    new-instance v2, Ljava/lang/ref/WeakReference;

    invoke-direct {v2, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-object v1
.end method
