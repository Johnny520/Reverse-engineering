.class public final synthetic Lcom/alibaba/fastjson2/reader/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final synthetic a:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

.field public final synthetic b:Lcom/alibaba/fastjson2/codec/FieldInfo;

.field public final synthetic c:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

.field public final synthetic d:Ljava/lang/Class;

.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/Class;

.field public final synthetic g:Lcom/alibaba/fastjson2/codec/BeanInfo;

.field public final synthetic h:I

.field public final synthetic i:Ljava/util/LinkedHashMap;

.field public final synthetic j:Ljava/lang/reflect/Type;


# direct methods
.method public synthetic constructor <init>(Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;ILjava/util/LinkedHashMap;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/c;->a:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/c;->b:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/c;->c:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 9
    .line 10
    iput-object p4, p0, Lcom/alibaba/fastjson2/reader/c;->d:Ljava/lang/Class;

    .line 11
    .line 12
    iput-object p5, p0, Lcom/alibaba/fastjson2/reader/c;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p6, p0, Lcom/alibaba/fastjson2/reader/c;->f:Ljava/lang/Class;

    .line 15
    .line 16
    iput-object p7, p0, Lcom/alibaba/fastjson2/reader/c;->g:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 17
    .line 18
    iput p8, p0, Lcom/alibaba/fastjson2/reader/c;->h:I

    .line 19
    .line 20
    iput-object p9, p0, Lcom/alibaba/fastjson2/reader/c;->i:Ljava/util/LinkedHashMap;

    .line 21
    .line 22
    iput-object p10, p0, Lcom/alibaba/fastjson2/reader/c;->j:Ljava/lang/reflect/Type;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 11

    .line 1
    iget-object v9, p0, Lcom/alibaba/fastjson2/reader/c;->j:Ljava/lang/reflect/Type;

    .line 2
    .line 3
    move-object v10, p1

    .line 4
    check-cast v10, Ljava/lang/reflect/Method;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/c;->a:Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/c;->b:Lcom/alibaba/fastjson2/codec/FieldInfo;

    .line 9
    .line 10
    iget-object v2, p0, Lcom/alibaba/fastjson2/reader/c;->c:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 11
    .line 12
    iget-object v3, p0, Lcom/alibaba/fastjson2/reader/c;->d:Ljava/lang/Class;

    .line 13
    .line 14
    iget-object v4, p0, Lcom/alibaba/fastjson2/reader/c;->e:Ljava/lang/String;

    .line 15
    .line 16
    iget-object v5, p0, Lcom/alibaba/fastjson2/reader/c;->f:Ljava/lang/Class;

    .line 17
    .line 18
    iget-object v6, p0, Lcom/alibaba/fastjson2/reader/c;->g:Lcom/alibaba/fastjson2/codec/BeanInfo;

    .line 19
    .line 20
    iget v7, p0, Lcom/alibaba/fastjson2/reader/c;->h:I

    .line 21
    .line 22
    iget-object v8, p0, Lcom/alibaba/fastjson2/reader/c;->i:Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-static/range {v0 .. v10}, Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;->c(Lcom/alibaba/fastjson2/reader/ObjectReaderCreator;Lcom/alibaba/fastjson2/codec/FieldInfo;Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Class;Lcom/alibaba/fastjson2/codec/BeanInfo;ILjava/util/LinkedHashMap;Ljava/lang/reflect/Type;Ljava/lang/reflect/Method;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method
