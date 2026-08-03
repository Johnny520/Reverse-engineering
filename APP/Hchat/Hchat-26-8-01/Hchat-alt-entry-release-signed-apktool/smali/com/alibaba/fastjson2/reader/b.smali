.class public final synthetic Lcom/alibaba/fastjson2/reader/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Ljava/lang/Class;

.field public final synthetic b:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

.field public final synthetic c:Ljava/lang/Class;

.field public final synthetic d:Lcom/alibaba/fastjson2/codec/BeanInfo;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lcom/alibaba/fastjson2/codec/FieldInfo;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/String;Lcom/alibaba/fastjson2/codec/FieldInfo;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/b;->a:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/b;->b:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/b;->c:Ljava/lang/Class;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/b;->d:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/b;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/alibaba/fastjson2/reader/b;->f:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/b;->f:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 2
    .line 3
    move-object v6, p1

    .line 4
    check-cast v6, Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/b;->a:Ljava/lang/Class;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/b;->b:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/b;->c:Ljava/lang/Class;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/b;->d:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 13
    .line 14
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/b;->e:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static/range {v0 .. v6}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->b(Ljava/lang/Class;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;Ljava/lang/String;Lcom/alibaba/fastjson2/codec/FieldInfo;Ljava/lang/reflect/Method;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
