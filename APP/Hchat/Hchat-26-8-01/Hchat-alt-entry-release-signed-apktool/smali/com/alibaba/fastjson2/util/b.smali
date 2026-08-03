.class public final synthetic Lcom/alibaba/fastjson2/util/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic d:Ljava/lang/reflect/Method;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/reflect/Method;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/alibaba/fastjson2/util/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/alibaba/fastjson2/util/b;->b:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/alibaba/fastjson2/util/b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/alibaba/fastjson2/util/b;->d:Ljava/lang/reflect/Method;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 3

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/util/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/util/b;->d:Ljava/lang/reflect/Method;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/reflect/Method;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/alibaba/fastjson2/util/b;->b:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/alibaba/fastjson2/util/b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 13
    .line 14
    invoke-static {v1, v2, v0, p1}, Lcom/alibaba/fastjson2/util/BeanUtils;->a(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/util/b;->d:Ljava/lang/reflect/Method;

    .line 19
    .line 20
    check-cast p1, Ljava/lang/reflect/Method;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/alibaba/fastjson2/util/b;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/alibaba/fastjson2/util/b;->c:Ljava/util/concurrent/atomic/AtomicReference;

    .line 25
    .line 26
    invoke-static {v1, v2, v0, p1}, Lcom/alibaba/fastjson2/util/BeanUtils;->d(Ljava/lang/String;Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
