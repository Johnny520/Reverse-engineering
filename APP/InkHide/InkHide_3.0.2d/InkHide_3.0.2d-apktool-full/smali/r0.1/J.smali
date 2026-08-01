.class public final synthetic Lr0/J;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lr0/d0;


# direct methods
.method public synthetic constructor <init>(Lr0/d0;I)V
    .locals 0

    .line 1
    iput p2, p0, Lr0/J;->a:I

    iput-object p1, p0, Lr0/J;->b:Lr0/d0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    .line 1
    iget v0, p0, Lr0/J;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lr0/J;->b:Lr0/d0;

    .line 7
    .line 8
    iget-object v1, v0, Lr0/d0;->a:Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object v1, v2

    .line 19
    :goto_0
    iget-boolean v3, v0, Lr0/d0;->x:Z

    .line 20
    .line 21
    if-eqz v3, :cond_3

    .line 22
    .line 23
    if-eqz v1, :cond_3

    .line 24
    .line 25
    iget-object v3, v0, Lr0/d0;->b:Ljava/lang/ref/WeakReference;

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    check-cast v3, Landroid/widget/ListView;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v3, v2

    .line 37
    :goto_1
    iget-object v4, v0, Lr0/d0;->c:Ljava/lang/ref/WeakReference;

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Landroid/view/View;

    .line 46
    .line 47
    :cond_2
    invoke-static {v1, v3, v2}, Lr0/d0;->p0(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_3

    .line 52
    .line 53
    invoke-virtual {v0}, Lr0/d0;->Q0()V

    .line 54
    .line 55
    .line 56
    :cond_3
    return-void

    .line 57
    :pswitch_0
    iget-object v0, p0, Lr0/J;->b:Lr0/d0;

    .line 58
    .line 59
    iget-boolean v1, v0, Lr0/d0;->x:Z

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    invoke-virtual {v0}, Lr0/d0;->Q0()V

    .line 64
    .line 65
    .line 66
    :cond_4
    return-void

    .line 67
    :pswitch_1
    iget-object v0, p0, Lr0/J;->b:Lr0/d0;

    .line 68
    .line 69
    invoke-virtual {v0}, Lr0/d0;->Q0()V

    .line 70
    .line 71
    .line 72
    return-void

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
