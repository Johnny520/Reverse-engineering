.class public final synthetic Lob/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Landroid/speech/tts/TextToSpeech$OnInitListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic c:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(Ljava/io/Serializable;Ljava/util/concurrent/CountDownLatch;I)V
    .locals 0

    .line 1
    iput p3, p0, Lob/a;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lob/a;->c:Ljava/io/Serializable;

    .line 4
    .line 5
    iput-object p2, p0, Lob/a;->b:Ljava/util/concurrent/CountDownLatch;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final onInit(I)V
    .locals 1

    .line 1
    iget v0, p0, Lob/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lob/a;->c:Ljava/io/Serializable;

    .line 7
    .line 8
    check-cast v0, Lgg/s;

    .line 9
    .line 10
    iput p1, v0, Lgg/s;->g:I

    .line 11
    .line 12
    iget-object p1, p0, Lob/a;->b:Ljava/util/concurrent/CountDownLatch;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lob/a;->c:Ljava/io/Serializable;

    .line 19
    .line 20
    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 21
    .line 22
    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 23
    .line 24
    .line 25
    iget-object p1, p0, Lob/a;->b:Ljava/util/concurrent/CountDownLatch;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
