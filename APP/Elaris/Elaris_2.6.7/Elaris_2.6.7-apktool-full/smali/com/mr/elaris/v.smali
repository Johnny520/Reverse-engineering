.class public final Lcom/mr/elaris/v;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:Ljava/lang/Object;

.field public final synthetic b:Ljava/lang/ClassLoader;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Ljava/lang/ClassLoader;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/mr/elaris/v;->a:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/mr/elaris/v;->b:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/mr/elaris/v;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iput-boolean p4, p0, Lcom/mr/elaris/v;->d:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-static {}, Lfc;->f()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    const-string v0, "repeater long press menu view fallback clicked"

    .line 9
    .line 10
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    const-wide/16 v2, 0x28a

    .line 18
    .line 19
    add-long/2addr v0, v2

    .line 20
    sput-wide v0, Lfc;->o:J

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->cancelPendingInputEvents()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    :catchall_0
    const/4 v0, 0x0

    .line 26
    :try_start_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setEnabled(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 27
    .line 28
    .line 29
    :catchall_1
    :try_start_2
    invoke-virtual {p1, v0}, Landroid/view/View;->setClickable(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 30
    .line 31
    .line 32
    :catchall_2
    iget-object v0, p0, Lcom/mr/elaris/v;->a:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-static {p1, v0}, Lfc;->b(Landroid/view/View;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p0, Lcom/mr/elaris/v;->b:Ljava/lang/ClassLoader;

    .line 38
    .line 39
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v1, p0, Lcom/mr/elaris/v;->c:Ljava/lang/Object;

    .line 44
    .line 45
    iget-boolean p0, p0, Lcom/mr/elaris/v;->d:Z

    .line 46
    .line 47
    invoke-static {p1, v0, v1, p0}, Lcom/mr/elaris/MessageRepeater;->repeatFromLongPressMenu(Ljava/lang/ClassLoader;Landroid/content/Context;Ljava/lang/Object;Z)V

    .line 48
    .line 49
    .line 50
    return-void
.end method
