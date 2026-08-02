.class public final Liv;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lcp;


# instance fields
.field public final synthetic h:I

.field public final i:Lkv;


# direct methods
.method public synthetic constructor <init>(Lkv;I)V
    .locals 0

    .line 1
    iput p2, p0, Liv;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Liv;->i:Lkv;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Lwo;Lq92;)V
    .locals 0

    .line 1
    iget p1, p0, Liv;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Liv;->i:Lkv;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p2}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    iget-object p1, p2, Lq92;->a:Lr92;

    .line 13
    .line 14
    iget-boolean p1, p1, Lr92;->w:Z

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    iget-object p1, p2, Lq92;->b:Ljava/lang/Object;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CompletableFuture;->complete(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance p1, Lpv;

    .line 25
    .line 26
    invoke-direct {p1, p2}, Lpv;-><init>(Lq92;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Lwo;Ljava/lang/Throwable;)V
    .locals 0

    .line 1
    iget p1, p0, Liv;->h:I

    .line 2
    .line 3
    iget-object p0, p0, Liv;->i:Lkv;

    .line 4
    .line 5
    packed-switch p1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :pswitch_0
    invoke-virtual {p0, p2}, Ljava/util/concurrent/CompletableFuture;->completeExceptionally(Ljava/lang/Throwable;)Z

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
