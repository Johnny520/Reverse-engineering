.class public final synthetic Lr0/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lr0/H0;

.field public final synthetic c:LM0/a;

.field public final synthetic d:Landroid/widget/ListView;

.field public final synthetic e:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(ZLr0/H0;LM0/a;Landroid/widget/ListView;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lr0/u0;->a:Z

    iput-object p2, p0, Lr0/u0;->b:Lr0/H0;

    iput-object p3, p0, Lr0/u0;->c:LM0/a;

    iput-object p4, p0, Lr0/u0;->d:Landroid/widget/ListView;

    iput-object p5, p0, Lr0/u0;->e:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    .line 1
    iget-object v0, p0, Lr0/u0;->d:Landroid/widget/ListView;

    .line 2
    .line 3
    iget-boolean v1, p0, Lr0/u0;->a:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    iget-object v2, p0, Lr0/u0;->b:Lr0/H0;

    .line 9
    .line 10
    iput-boolean v1, v2, Lr0/H0;->u:Z

    .line 11
    .line 12
    :cond_0
    iget-object v1, p0, Lr0/u0;->c:LM0/a;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    :try_start_0
    invoke-interface {v1}, LM0/a;->b()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v0

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/widget/AbsListView;->invalidateViews()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 29
    .line 30
    .line 31
    sget-object v0, LE0/i;->a:LE0/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    goto :goto_2

    .line 34
    :goto_1
    new-instance v1, LE0/d;

    .line 35
    .line 36
    invoke-direct {v1, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    move-object v0, v1

    .line 40
    :goto_2
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    iget-object v1, p0, Lr0/u0;->e:Ljava/lang/String;

    .line 47
    .line 48
    const-string v2, "refresh conversation list fail"

    .line 49
    .line 50
    filled-new-array {v2, v1, v0}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_2
    return-void
.end method
