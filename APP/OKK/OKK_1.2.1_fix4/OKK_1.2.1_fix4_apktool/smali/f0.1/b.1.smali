.class public final synthetic Lf0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD0/a;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lf0/e;


# direct methods
.method public synthetic constructor <init>(Lf0/e;I)V
    .locals 0

    iput p2, p0, Lf0/b;->a:I

    iput-object p1, p0, Lf0/b;->b:Lf0/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 8

    iget v0, p0, Lf0/b;->a:I

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v3

    packed-switch v0, :pswitch_data_0

    iget-object v1, p0, Lf0/b;->b:Lf0/e;

    const-string v0, "$progress"

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lf0/i;->b:Landroid/os/Handler;

    new-instance v7, Lf0/a;

    const/4 v5, 0x1

    move-object v0, v7

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lf0/a;-><init>(Lf0/e;IILjava/lang/String;I)V

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    :pswitch_0
    iget-object v1, p0, Lf0/b;->b:Lf0/e;

    const-string v0, "$progress"

    invoke-static {v1, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "title"

    invoke-static {p3, v0}, LQ0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v6, Lf0/i;->b:Landroid/os/Handler;

    new-instance v7, Lf0/a;

    const/4 v5, 0x0

    move-object v0, v7

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Lf0/a;-><init>(Lf0/e;IILjava/lang/String;I)V

    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
