.class public final synthetic Lcom/alibaba/fastjson2/reader/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

.field public final synthetic c:Lcom/alibaba/fastjson2/codec/BeanInfo;

.field public final synthetic d:Ljava/lang/Class;


# direct methods
.method public synthetic constructor <init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;I)V
    .locals 0

    .line 1
    iput p4, p0, Lcom/alibaba/fastjson2/reader/m;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/m;->b:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/m;->c:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/m;->d:Ljava/lang/Class;

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
    iget v0, p0, Lcom/alibaba/fastjson2/reader/m;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/m;->d:Ljava/lang/Class;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/m;->b:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 11
    .line 12
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/m;->c:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 13
    .line 14
    invoke-static {v1, v2, v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->j(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/m;->d:Ljava/lang/Class;

    .line 19
    .line 20
    check-cast p1, Ljava/lang/reflect/Method;

    .line 21
    .line 22
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/m;->b:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 23
    .line 24
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/m;->c:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 25
    .line 26
    invoke-static {v1, v2, v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->c(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/m;->d:Ljava/lang/Class;

    .line 31
    .line 32
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/m;->b:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 35
    .line 36
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/m;->c:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 37
    .line 38
    invoke-static {v1, v2, v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->t(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Constructor;)V

    .line 39
    .line 40
    .line 41
    return-void

    .line 42
    :pswitch_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/m;->d:Ljava/lang/Class;

    .line 43
    .line 44
    check-cast p1, Ljava/lang/reflect/Method;

    .line 45
    .line 46
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/m;->b:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 47
    .line 48
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/m;->c:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 49
    .line 50
    invoke-static {v1, v2, v0, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->m(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/Class;Ljava/lang/reflect/Method;)V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
