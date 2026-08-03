.class public final Lc0/i1;
.super Lde/robv/android/xposed/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final synthetic c:Lc0/k1;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc0/i1;->b:I

    packed-switch p1, :pswitch_data_0

    sget-object p1, Lc0/k1;->a:Lc0/k1;

    iput-object p1, p0, Lc0/i1;->c:Lc0/k1;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_0
    sget-object p1, Lc0/k1;->a:Lc0/k1;

    iput-object p1, p0, Lc0/i1;->c:Lc0/k1;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_1
    sget-object p1, Lc0/k1;->a:Lc0/k1;

    iput-object p1, p0, Lc0/i1;->c:Lc0/k1;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    :pswitch_2
    sget-object p1, Lc0/k1;->a:Lc0/k1;

    iput-object p1, p0, Lc0/i1;->c:Lc0/k1;

    invoke-direct {p0}, Lde/robv/android/xposed/c;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(Lde/robv/android/xposed/b;)V
    .locals 5

    iget v0, p0, Lc0/i1;->b:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Lc0/i1;->c:Lc0/k1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/k1;->g()Z

    move-result v0

    if-nez v0, :cond_0

    goto/16 :goto_3

    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    instance-of v1, v0, Landroid/view/View;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Landroid/view/View;

    goto :goto_0

    :cond_1
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_2

    goto :goto_3

    :cond_2
    instance-of v1, v0, Landroid/widget/EditText;

    if-eqz v1, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    const-string v3, "EditText"

    const/4 v4, 0x1

    invoke-static {v1, v3, v4}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v3

    if-nez v3, :cond_4

    const-string v3, "MMEdit"

    invoke-static {v1, v3, v4}, LW0/j;->J0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_8

    :cond_4
    :goto_1
    const/4 v1, 0x0

    move-object v3, v0

    :goto_2
    instance-of v4, v3, Landroid/view/View;

    if-eqz v4, :cond_8

    const/16 v4, 0x14

    if-ge v1, v4, :cond_8

    invoke-static {v3}, Lc0/k1;->e(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    iget-object v1, p1, Lde/robv/android/xposed/b;->e:Ljava/lang/Object;

    instance-of v3, v1, Landroid/view/inputmethod/InputConnection;

    if-eqz v3, :cond_5

    move-object v2, v1

    check-cast v2, Landroid/view/inputmethod/InputConnection;

    :cond_5
    if-nez v2, :cond_6

    goto :goto_3

    :cond_6
    new-instance v1, Ljava/lang/ref/WeakReference;

    invoke-static {v0}, Lc0/k1;->a(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v3

    invoke-direct {v1, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    new-instance v3, Lc0/j1;

    invoke-direct {v3, v2, v0, v1}, Lc0/j1;-><init>(Landroid/view/inputmethod/InputConnection;Landroid/view/View;Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p1, v3}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    check-cast v3, Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_8
    :goto_3
    return-void

    :pswitch_1
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lc0/k1;->g:Ljava/lang/ref/WeakReference;

    sget-object v0, Lc0/k1;->h:Ljava/lang/reflect/Method;

    if-nez v0, :cond_9

    iget-object v0, p0, Lc0/i1;->c:Lc0/k1;

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/k1;->j(Ljava/lang/Class;)V

    :cond_9
    return-void

    :pswitch_2
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lc0/k1;->g:Ljava/lang/ref/WeakReference;

    sget-object v0, Lc0/k1;->h:Ljava/lang/reflect/Method;

    if-nez v0, :cond_a

    iget-object v0, p0, Lc0/i1;->c:Lc0/k1;

    iget-object p1, p1, Lde/robv/android/xposed/b;->b:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1}, Lc0/k1;->j(Ljava/lang/Class;)V

    :cond_a
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public b(Lde/robv/android/xposed/b;)V
    .locals 4

    iget v0, p0, Lc0/i1;->b:I

    packed-switch v0, :pswitch_data_0

    return-void

    :pswitch_0
    iget-object v0, p0, Lc0/i1;->c:Lc0/k1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lc0/k1;->g()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    const-string v1, "args"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-static {v2, v0}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Landroid/view/KeyEvent;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    check-cast v0, Landroid/view/KeyEvent;

    goto :goto_0

    :cond_1
    move-object v0, v3

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getAction()I

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    const/16 v2, 0x43

    if-eq v0, v2, :cond_4

    goto :goto_1

    :cond_4
    iget-object v0, p1, Lde/robv/android/xposed/b;->c:[Ljava/lang/Object;

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {v1, v0}, LE0/j;->n0(I[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Landroid/view/View;

    if-eqz v1, :cond_5

    move-object v3, v0

    check-cast v3, Landroid/view/View;

    :cond_5
    invoke-static {v3}, Lc0/k1;->a(Landroid/view/View;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_6

    invoke-static {}, Lc0/k1;->c()Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_1

    :cond_6
    invoke-static {v3, v0}, Lc0/k1;->h(Landroid/view/View;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    goto :goto_1

    :cond_7
    const-string v1, "onKey"

    invoke-static {v0, v1}, Lc0/k1;->k(Ljava/lang/Object;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lde/robv/android/xposed/b;->c(Ljava/lang/Object;)V

    :cond_8
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method
