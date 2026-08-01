.class public final synthetic Lr0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/E;


# direct methods
.method public synthetic constructor <init>(Lr0/D;Lr0/E;)V
    .locals 0

    .line 1
    const/4 p1, 0x2

    iput p1, p0, Lr0/z;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lr0/z;->b:Lr0/E;

    return-void
.end method

.method public synthetic constructor <init>(Lr0/E;I)V
    .locals 0

    .line 2
    iput p2, p0, Lr0/z;->a:I

    iput-object p1, p0, Lr0/z;->b:Lr0/E;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget v0, p0, Lr0/z;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/z;->b:Lr0/E;

    .line 7
    .line 8
    :try_start_0
    iget-object v1, v0, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Landroid/widget/ListView;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-virtual {v1}, Landroid/widget/AbsListView;->invalidateViews()V

    .line 21
    .line 22
    .line 23
    :cond_0
    iget-object v0, v0, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    check-cast v0, Landroid/widget/ListView;

    .line 32
    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    :catchall_0
    :cond_1
    return-void

    .line 39
    :pswitch_0
    iget-object v0, p0, Lr0/z;->b:Lr0/E;

    .line 40
    .line 41
    :try_start_1
    iget-object v1, v0, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Landroid/widget/ListView;

    .line 50
    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    invoke-virtual {v1}, Landroid/widget/AbsListView;->invalidateViews()V

    .line 54
    .line 55
    .line 56
    :cond_2
    iget-object v0, v0, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 57
    .line 58
    if-eqz v0, :cond_3

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Landroid/widget/ListView;

    .line 65
    .line 66
    if-eqz v0, :cond_3

    .line 67
    .line 68
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 69
    .line 70
    .line 71
    :catchall_1
    :cond_3
    return-void

    .line 72
    :pswitch_1
    iget-object v0, p0, Lr0/z;->b:Lr0/E;

    .line 73
    .line 74
    :try_start_2
    iget-object v1, v0, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 75
    .line 76
    if-eqz v1, :cond_4

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    check-cast v1, Landroid/widget/ListView;

    .line 83
    .line 84
    if-eqz v1, :cond_4

    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/widget/AbsListView;->invalidateViews()V

    .line 87
    .line 88
    .line 89
    :cond_4
    iget-object v0, v0, Lr0/E;->a:Ljava/lang/ref/WeakReference;

    .line 90
    .line 91
    if-eqz v0, :cond_5

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    check-cast v0, Landroid/widget/ListView;

    .line 98
    .line 99
    if-eqz v0, :cond_5

    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 102
    .line 103
    .line 104
    :catchall_2
    :cond_5
    return-void

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
