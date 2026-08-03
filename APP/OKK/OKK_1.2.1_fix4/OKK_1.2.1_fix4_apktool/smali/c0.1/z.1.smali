.class public final synthetic Lc0/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lc0/z;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget v0, p0, Lc0/z;->a:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lf0/i;->a:Lf0/i;

    const-string v0, "post-6s"

    invoke-static {v0}, Lf0/i;->f(Ljava/lang/String;)V

    return-void

    :pswitch_0
    sget-object v0, Lf0/i;->a:Lf0/i;

    const-string v0, "post-3s"

    invoke-static {v0}, Lf0/i;->f(Ljava/lang/String;)V

    return-void

    :pswitch_1
    sget-object v0, Lf0/i;->a:Lf0/i;

    const-string v0, "post-1.2s"

    invoke-static {v0}, Lf0/i;->f(Ljava/lang/String;)V

    return-void

    :pswitch_2
    :try_start_0
    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {}, Lc0/G1;->w()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    invoke-static {v0}, LA0/p;->u(Ljava/lang/Throwable;)LD0/f;

    :goto_0
    return-void

    :pswitch_3
    sget-object v0, Lc0/G1;->a:Ljava/lang/Object;

    invoke-static {}, Lc0/G1;->w()V

    return-void

    :pswitch_4
    sget-object v0, Lc0/G;->a:Lc0/G;

    sget v0, Lc0/G;->q:I

    invoke-static {v0}, Lc0/G;->d(I)V

    return-void

    :pswitch_5
    sget-object v0, Lc0/G;->a:Lc0/G;

    sget v0, Lc0/G;->q:I

    invoke-static {v0}, Lc0/G;->d(I)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
