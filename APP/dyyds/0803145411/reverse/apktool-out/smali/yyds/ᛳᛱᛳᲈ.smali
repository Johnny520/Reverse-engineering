.class public final synthetic Lyyds/ᛳᛱᛳᲈ;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Ljava/util/concurrent/Executor;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛳᛱᛳᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final execute(Ljava/lang/Runnable;)V
    .locals 0

    .line 1
    iget p0, p0, Lyyds/ᛳᛱᛳᲈ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-static {}, Lyyds/ᛸᛶᛶᛲ;->ᛱᛳᲇ()Lyyds/ᛸᛶᛶᛲ;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    iget-object p0, p0, Lyyds/ᛸᛶᛶᛲ;->ᛷᲈᲈᲁ:Lyyds/ᛶᲇᛴᛸ;

    .line 15
    .line 16
    iget-object p0, p0, Lyyds/ᛶᲇᛴᛸ;->ᛷᛲᲈᛱ:Ljava/util/concurrent/ExecutorService;

    .line 17
    .line 18
    invoke-interface {p0, p1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
