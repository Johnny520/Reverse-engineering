.class public final synthetic La/X7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    iput p2, p0, La/X7;->a:I

    iput-object p1, p0, La/X7;->b:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget v0, p0, La/X7;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, La/ra;

    iget-object v1, p0, La/X7;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, La/ra;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v0}, La/ra;->l()V

    return-void

    :pswitch_0
    iget-object v0, p0, La/X7;->b:Landroid/app/Activity;

    :try_start_0
    new-instance v1, La/ra;

    invoke-direct {v1, v0}, La/ra;-><init>(Landroid/app/Activity;)V

    invoke-virtual {v1}, La/ra;->l()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v1, "FC_DEBUG"

    const-string v2, "MaskUI show failed"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_0
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
