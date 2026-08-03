.class public final synthetic Lcom/alibaba/fastjson2/reader/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

.field public final synthetic c:Lcom/alibaba/fastjson2/reader/ObjectReader;

.field public final synthetic d:Ljava/util/Map;

.field public final synthetic e:Ljava/util/function/BiConsumer;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lcom/alibaba/fastjson2/PropertyNamingStrategy;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/util/Map;Ljava/util/function/BiConsumer;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/a;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/a;->b:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/a;->c:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/a;->d:Ljava/util/Map;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/a;->e:Ljava/util/function/BiConsumer;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 6

    .line 1
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/a;->d:Ljava/util/Map;

    .line 2
    .line 3
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/a;->e:Ljava/util/function/BiConsumer;

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/a;->a:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/a;->b:Lcom/alibaba/fastjson2/PropertyNamingStrategy;

    .line 8
    .line 9
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/a;->c:Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-static/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/FieldReaderObject;->a(Ljava/lang/String;Lcom/alibaba/fastjson2/PropertyNamingStrategy;Lcom/alibaba/fastjson2/reader/ObjectReader;Ljava/util/Map;Ljava/util/function/BiConsumer;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method
