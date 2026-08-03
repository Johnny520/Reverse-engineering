.class public final synthetic La/y8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/D7;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:La/z8;


# direct methods
.method public synthetic constructor <init>(La/z8;I)V
    .locals 0

    iput p2, p0, La/y8;->a:I

    iput-object p1, p0, La/y8;->b:La/z8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, La/y8;->a:I

    check-cast p1, Lio/github/libxposed/api/XposedInterface$Chain;

    packed-switch v0, :pswitch_data_0

    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, La/y8;->b:La/z8;

    invoke-static {}, La/z8;->c()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Landroid/app/Activity;

    if-eqz v2, :cond_1

    check-cast p1, Landroid/app/Activity;

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, La/z8;->b(Landroid/app/Activity;I)V

    :cond_2
    :goto_1
    return-object v0

    :pswitch_0
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, La/y8;->b:La/z8;

    invoke-static {}, La/z8;->c()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Landroid/app/Activity;

    if-eqz v2, :cond_4

    check-cast p1, Landroid/app/Activity;

    goto :goto_2

    :cond_4
    const/4 p1, 0x0

    :goto_2
    if-eqz p1, :cond_5

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, La/z8;->b(Landroid/app/Activity;I)V

    :cond_5
    :goto_3
    return-object v0

    :pswitch_1
    const-string v0, "chain"

    invoke-static {p1, v0}, La/i9;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed()Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, La/y8;->b:La/z8;

    invoke-static {}, La/z8;->c()Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_5

    :cond_6
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    move-result-object p1

    instance-of v2, p1, Landroid/app/Activity;

    if-eqz v2, :cond_7

    check-cast p1, Landroid/app/Activity;

    goto :goto_4

    :cond_7
    const/4 p1, 0x0

    :goto_4
    if-eqz p1, :cond_8

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, La/z8;->b(Landroid/app/Activity;I)V

    :cond_8
    :goto_5
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
