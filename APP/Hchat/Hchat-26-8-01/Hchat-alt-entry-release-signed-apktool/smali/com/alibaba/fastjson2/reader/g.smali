.class public final synthetic Lcom/alibaba/fastjson2/reader/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/annotation/Annotation;

.field public final synthetic c:Lcom/alibaba/fastjson2/codec/BeanInfo;


# direct methods
.method public synthetic constructor <init>(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;I)V
    .locals 0

    .line 1
    iput p3, p0, Lcom/alibaba/fastjson2/reader/g;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/g;->c:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 4
    .line 5
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/g;->b:Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/annotation/Annotation;Lcom/alibaba/fastjson2/codec/BeanInfo;I)V
    .locals 0

    .line 11
    iput p3, p0, Lcom/alibaba/fastjson2/reader/g;->a:I

    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/g;->b:Ljava/lang/annotation/Annotation;

    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/g;->c:Lcom/alibaba/fastjson2/codec/BeanInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/reader/g;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/g;->b:Ljava/lang/annotation/Annotation;

    .line 7
    .line 8
    check-cast p1, Ljava/lang/reflect/Method;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/g;->c:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 11
    .line 12
    invoke-static {v1, v0, p1}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->b(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :pswitch_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/g;->b:Ljava/lang/annotation/Annotation;

    .line 17
    .line 18
    check-cast p1, Ljava/lang/reflect/Method;

    .line 19
    .line 20
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/g;->c:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 21
    .line 22
    invoke-static {v1, v0, p1}, Lcom/alibaba/fastjson2/util/BeanUtils;->e(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :pswitch_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/g;->c:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 27
    .line 28
    check-cast p1, Ljava/lang/reflect/Method;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/g;->b:Ljava/lang/annotation/Annotation;

    .line 31
    .line 32
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->g(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/g;->c:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 37
    .line 38
    check-cast p1, Ljava/lang/reflect/Method;

    .line 39
    .line 40
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/g;->b:Ljava/lang/annotation/Annotation;

    .line 41
    .line 42
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->e(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :pswitch_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/g;->c:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 47
    .line 48
    check-cast p1, Ljava/lang/reflect/Method;

    .line 49
    .line 50
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/g;->b:Ljava/lang/annotation/Annotation;

    .line 51
    .line 52
    invoke-static {v0, v1, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->o(Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/annotation/Annotation;Ljava/lang/reflect/Method;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    nop

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
