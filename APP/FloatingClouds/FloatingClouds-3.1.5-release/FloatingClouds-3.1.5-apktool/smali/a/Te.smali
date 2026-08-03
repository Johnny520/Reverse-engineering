.class public final synthetic La/Te;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/Ue;


# direct methods
.method public synthetic constructor <init>(La/Ue;I)V
    .locals 0

    iput p2, p0, La/Te;->a:I

    iput-object p1, p0, La/Te;->b:La/Ue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La/Te;->a:I

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    packed-switch v0, :pswitch_data_0

    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    iget-object p1, p0, La/Te;->b:La/Ue;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "TempUnhideTrigger: onConfigurationChanged \u2014 resetting cached state"

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, La/n9;->t([Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p1, La/Ue;->a:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    iput v1, p1, La/Ue;->f:I

    const-wide/16 v1, 0x0

    iput-wide v1, p1, La/Ue;->g:J

    iget-object v1, p1, La/Ue;->b:Landroid/view/View;

    iget-object v2, p1, La/Ue;->c:Ljava/lang/ref/WeakReference;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/app/Activity;

    goto :goto_0

    :cond_0
    move-object v2, v0

    :goto_0
    if-eqz v1, :cond_1

    if-eqz v2, :cond_1

    invoke-virtual {p1, v2, v1}, La/Ue;->d(Landroid/app/Activity;Landroid/view/View;)Z

    :cond_1
    return-object v0

    :pswitch_0
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Landroid/app/Activity;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Landroid/app/Activity;

    goto :goto_1

    :cond_2
    move-object p1, v1

    :goto_1
    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    iget-object v0, p0, La/Te;->b:La/Ue;

    invoke-virtual {v0, p1}, La/Ue;->c(Landroid/app/Activity;)V

    :goto_2
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
