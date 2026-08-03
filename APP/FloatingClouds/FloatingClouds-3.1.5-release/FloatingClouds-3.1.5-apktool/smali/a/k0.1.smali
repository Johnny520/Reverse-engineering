.class public final synthetic La/k0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/io/Serializable;I)V
    .locals 0

    .line 1
    iput p4, p0, La/k0;->a:I

    iput-object p1, p0, La/k0;->c:Ljava/lang/Object;

    iput p2, p0, La/k0;->b:I

    iput-object p3, p0, La/k0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ltop/mmjz/floatingclouds/plugin/IPlugin;Ljava/lang/Object;II)V
    .locals 0

    .line 2
    iput p4, p0, La/k0;->a:I

    iput-object p1, p0, La/k0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/k0;->d:Ljava/lang/Object;

    iput p3, p0, La/k0;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget v0, p0, La/k0;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, La/k0;->b:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, La/k0;->c:Ljava/lang/Object;

    check-cast v1, La/A8;

    iget-object v2, p0, La/k0;->d:Ljava/lang/Object;

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v1, v2, v0}, La/A8;->d(Landroid/app/Activity;I)V

    return-void

    :pswitch_0
    iget v0, p0, La/k0;->b:I

    add-int/lit8 v0, v0, 0x1

    iget-object v1, p0, La/k0;->c:Ljava/lang/Object;

    check-cast v1, La/z8;

    iget-object v2, p0, La/k0;->d:Ljava/lang/Object;

    check-cast v2, Landroid/app/Activity;

    invoke-virtual {v1, v2, v0}, La/z8;->b(Landroid/app/Activity;I)V

    return-void

    :pswitch_1
    iget-object v0, p0, La/k0;->c:Ljava/lang/Object;

    check-cast v0, Landroidx/profileinstaller/b;

    iget-object v0, v0, Landroidx/profileinstaller/b;->b:Landroidx/profileinstaller/c$c;

    iget v1, p0, La/k0;->b:I

    iget-object v2, p0, La/k0;->d:Ljava/lang/Object;

    check-cast v2, Ljava/io/Serializable;

    invoke-interface {v0, v1, v2}, Landroidx/profileinstaller/c$c;->a(ILjava/io/Serializable;)V

    return-void

    :pswitch_2
    const/4 v0, 0x3

    iget-object v1, p0, La/k0;->c:Ljava/lang/Object;

    check-cast v1, La/o2;

    iget-object v2, p0, La/k0;->d:Ljava/lang/Object;

    iget v3, p0, La/k0;->b:I

    invoke-virtual {v1, v2, v3, v0}, La/o2;->a(Ljava/lang/Object;II)V

    return-void

    :pswitch_3
    iget-object v0, p0, La/k0;->c:Ljava/lang/Object;

    check-cast v0, Landroid/app/ProgressDialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    iget v1, p0, La/k0;->b:I

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setProgress(I)V

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "\u6b63\u5728\u626b\u63cf\uff1a"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, La/k0;->d:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/ProgressDialog;->setMessage(Ljava/lang/CharSequence;)V

    :cond_0
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
