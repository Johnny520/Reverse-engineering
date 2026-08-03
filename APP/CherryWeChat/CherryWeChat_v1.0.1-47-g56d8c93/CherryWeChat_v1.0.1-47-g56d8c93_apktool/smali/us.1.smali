.class public Lus;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final j:Ljava/lang/Object;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:LXw;

.field public c:I

.field public d:Z

.field public volatile e:Ljava/lang/Object;

.field public volatile f:Ljava/lang/Object;

.field public g:I

.field public h:Z

.field public i:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lus;->j:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lus;->a:Ljava/lang/Object;

    new-instance v0, LXw;

    invoke-direct {v0}, LXw;-><init>()V

    iput-object v0, p0, Lus;->b:LXw;

    const/4 v0, 0x0

    iput v0, p0, Lus;->c:I

    sget-object v0, Lus;->j:Ljava/lang/Object;

    iput-object v0, p0, Lus;->f:Ljava/lang/Object;

    iput-object v0, p0, Lus;->e:Ljava/lang/Object;

    const/4 v0, -0x1

    iput v0, p0, Lus;->g:I

    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 3

    invoke-static {}, LA4;->X()LA4;

    move-result-object v0

    iget-object v0, v0, LA4;->f:Lpd;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot invoke "

    const-string v2, " on a background thread"

    invoke-static {v1, p0, v2}, Lph;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public final b(LMo;)V
    .locals 2

    iget-boolean v0, p1, LMo;->b:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p1, LMo;->c:I

    iget v1, p0, Lus;->g:I

    if-lt v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iput v1, p1, LMo;->c:I

    iget-object p1, p1, LMo;->a:LD2;

    iget-object v0, p0, Lus;->e:Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v0, LYn;

    iget-object p1, p1, LD2;->b:Ljava/lang/Object;

    check-cast p1, LKd;

    if-eqz v0, :cond_4

    iget-boolean v0, p1, LKd;->Y:Z

    if-eqz v0, :cond_4

    invoke-virtual {p1}, Lhi;->z()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_3

    iget-object v1, p1, LKd;->c0:Landroid/app/Dialog;

    if-eqz v1, :cond_4

    const/4 v1, 0x3

    invoke-static {v1}, Lzi;->G(I)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p1, LKd;->c0:Landroid/app/Dialog;

    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    :cond_2
    iget-object p1, p1, LKd;->c0:Landroid/app/Dialog;

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "DialogFragment can not be attached to a container view"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    return-void
.end method

.method public final c(LMo;)V
    .locals 4

    iget-boolean v0, p0, Lus;->h:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lus;->i:Z

    return-void

    :cond_0
    iput-boolean v1, p0, Lus;->h:Z

    :cond_1
    const/4 v0, 0x0

    iput-boolean v0, p0, Lus;->i:Z

    if-eqz p1, :cond_2

    invoke-virtual {p0, p1}, Lus;->b(LMo;)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lus;->b:LXw;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, LVw;

    invoke-direct {v2, v1}, LVw;-><init>(LXw;)V

    iget-object v1, v1, LXw;->c:Ljava/util/WeakHashMap;

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v2, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    invoke-virtual {v2}, LVw;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v2}, LVw;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LMo;

    invoke-virtual {p0, v1}, Lus;->b(LMo;)V

    iget-boolean v1, p0, Lus;->i:Z

    if-eqz v1, :cond_3

    :cond_4
    :goto_0
    iget-boolean v1, p0, Lus;->i:Z

    if-nez v1, :cond_1

    iput-boolean v0, p0, Lus;->h:Z

    return-void
.end method

.method public final d(Ljava/lang/Object;)V
    .locals 1

    const-string v0, "setValue"

    invoke-static {v0}, Lus;->a(Ljava/lang/String;)V

    iget v0, p0, Lus;->g:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lus;->g:I

    iput-object p1, p0, Lus;->e:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lus;->c(LMo;)V

    return-void
.end method
