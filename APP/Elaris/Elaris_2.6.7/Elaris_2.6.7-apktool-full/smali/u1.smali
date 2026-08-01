.class public final synthetic Lu1;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, Lu1;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lu1;->b:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lu1;->c:Ljava/lang/Object;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 6

    .line 1
    iget p1, p0, Lu1;->a:I

    .line 2
    .line 3
    iget-object v0, p0, Lu1;->c:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object p0, p0, Lu1;->b:Ljava/lang/Object;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p0, Lz8;

    .line 11
    .line 12
    check-cast v0, Lb9;

    .line 13
    .line 14
    iget-object p0, p0, Lz8;->b:Lo8;

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    iget-object p1, p0, Lo8;->a:Landroid/app/Dialog;

    .line 19
    .line 20
    iget-object v1, p0, Lo8;->b:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    iget-object v2, p0, Lo8;->c:Landroid/app/Activity;

    .line 23
    .line 24
    iget-object v3, p0, Lo8;->d:Ljava/lang/ClassLoader;

    .line 25
    .line 26
    iget-object p0, p0, Lo8;->e:Lpd;

    .line 27
    .line 28
    invoke-virtual {p1}, Landroid/app/Dialog;->isShowing()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    invoke-virtual {v1, v4, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-nez v1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->dismiss()V

    .line 44
    .line 45
    .line 46
    const-string p1, ""

    .line 47
    .line 48
    invoke-static {v2, v3, p0, v0, p1}, Li5;->Q1(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Lb9;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    :goto_0
    return-void

    .line 52
    :pswitch_0
    check-cast p0, Lh0;

    .line 53
    .line 54
    check-cast v0, Landroid/app/Dialog;

    .line 55
    .line 56
    invoke-virtual {p0}, Lh0;->run()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 60
    .line 61
    .line 62
    return-void

    .line 63
    :pswitch_1
    check-cast p0, Ljava/lang/String;

    .line 64
    .line 65
    check-cast v0, Le2;

    .line 66
    .line 67
    iget-object p1, v0, Le2;->i:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-eqz p1, :cond_2

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_2
    iput-object p0, v0, Le2;->i:Ljava/lang/String;

    .line 77
    .line 78
    iget-object p0, v0, Le2;->h:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v0, p0}, Lg2;->j(Le2;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    :goto_1
    return-void

    .line 84
    nop

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
