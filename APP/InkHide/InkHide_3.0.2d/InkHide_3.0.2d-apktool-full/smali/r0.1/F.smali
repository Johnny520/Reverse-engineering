.class public final synthetic Lr0/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/widget/ListView;

.field public final synthetic c:Lr0/d0;


# direct methods
.method public synthetic constructor <init>(Landroid/widget/ListView;Lr0/d0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lr0/F;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/F;->b:Landroid/widget/ListView;

    iput-object p2, p0, Lr0/F;->c:Lr0/d0;

    return-void
.end method

.method public synthetic constructor <init>(Lr0/d0;Landroid/widget/ListView;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lr0/F;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/F;->c:Lr0/d0;

    iput-object p2, p0, Lr0/F;->b:Landroid/widget/ListView;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lr0/F;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/F;->b:Landroid/widget/ListView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    iget-object v3, p0, Lr0/F;->c:Lr0/d0;

    .line 14
    .line 15
    if-ge v2, v1, :cond_0

    .line 16
    .line 17
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    const-string v5, "getChildAt(...)"

    .line 22
    .line 23
    invoke-static {v4, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v4}, Lr0/d0;->U0(Landroid/view/View;)V

    .line 27
    .line 28
    .line 29
    add-int/lit8 v2, v2, 0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    iget-object v1, v3, Lr0/d0;->a:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    const/4 v2, 0x0

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    move-object v1, v2

    .line 43
    :goto_1
    invoke-virtual {v3, v1, v0, v2}, Lr0/d0;->o(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/widget/AbsListView;->invalidateViews()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :pswitch_0
    const/4 v0, 0x0

    .line 54
    iget-object v1, p0, Lr0/F;->c:Lr0/d0;

    .line 55
    .line 56
    iput-boolean v0, v1, Lr0/d0;->m:Z

    .line 57
    .line 58
    iget-object v0, p0, Lr0/F;->b:Landroid/widget/ListView;

    .line 59
    .line 60
    :try_start_0
    invoke-virtual {v0}, Landroid/widget/AbsListView;->invalidateViews()V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    .line 66
    :catchall_0
    return-void

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
