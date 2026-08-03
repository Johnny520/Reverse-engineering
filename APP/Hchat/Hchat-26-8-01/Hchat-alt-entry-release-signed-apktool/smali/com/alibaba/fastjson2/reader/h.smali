.class public final synthetic Lcom/alibaba/fastjson2/reader/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public synthetic constructor <init>(JLjava/util/concurrent/atomic/AtomicReference;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/alibaba/fastjson2/reader/h;->a:I

    .line 2
    .line 3
    iput-wide p1, p0, Lcom/alibaba/fastjson2/reader/h;->b:J

    .line 4
    .line 5
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/h;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/h;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/h;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/reflect/Method;

    .line 9
    .line 10
    iget-wide v1, p0, Lcom/alibaba/fastjson2/reader/h;->b:J

    .line 11
    .line 12
    invoke-static {v1, v2, v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->b(JLjava/util/concurrent/atomic/AtomicReference;Ljava/lang/reflect/Method;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/h;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 17
    .line 18
    check-cast p1, Ljava/lang/reflect/Field;

    .line 19
    .line 20
    iget-wide v1, p0, Lcom/alibaba/fastjson2/reader/h;->b:J

    .line 21
    .line 22
    invoke-static {v1, v2, v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->l(JLjava/util/concurrent/atomic/AtomicReference;Ljava/lang/reflect/Field;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
