.class final Lcom/alibaba/fastjson2/reader/FieldReaderBoolValFunc;
.super Lcom/alibaba/fastjson2/reader/FieldReader;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/alibaba/fastjson2/reader/FieldReader<",
        "TT;>;"
    }
.end annotation


# instance fields
.field final function:Lcom/alibaba/fastjson2/function/ObjBoolConsumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/alibaba/fastjson2/function/ObjBoolConsumer<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/reflect/Method;Lcom/alibaba/fastjson2/function/ObjBoolConsumer;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/reflect/Method;",
            "Lcom/alibaba/fastjson2/function/ObjBoolConsumer<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    const/4 v9, 0x0

    .line 2
    const/4 v11, 0x0

    .line 3
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    const-wide/16 v5, 0x0

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    const/4 v8, 0x0

    .line 9
    move-object v3, v2

    .line 10
    move-object v0, p0

    .line 11
    move-object v1, p1

    .line 12
    move v4, p2

    .line 13
    move-object v10, p3

    .line 14
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/reader/FieldReader;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V

    .line 15
    .line 16
    .line 17
    move-object/from16 p1, p4

    .line 18
    .line 19
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReaderBoolValFunc;->function:Lcom/alibaba/fastjson2/function/ObjBoolConsumer;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBooleanValue(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderBoolValFunc;->function:Lcom/alibaba/fastjson2/function/ObjBoolConsumer;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/alibaba/fastjson2/function/ObjBoolConsumer;->accept(Ljava/lang/Object;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public accept(Ljava/lang/Object;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;Z)V"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderBoolValFunc;->function:Lcom/alibaba/fastjson2/function/ObjBoolConsumer;

    invoke-interface {v0, p1, p2}, Lcom/alibaba/fastjson2/function/ObjBoolConsumer;->accept(Ljava/lang/Object;Z)V

    return-void
.end method

.method public readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;
    .locals 0

    .line 11
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readBool()Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "TT;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderBoolValFunc;->function:Lcom/alibaba/fastjson2/function/ObjBoolConsumer;

    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readBoolValue()Z

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-interface {v0, p2, p1}, Lcom/alibaba/fastjson2/function/ObjBoolConsumer;->accept(Ljava/lang/Object;Z)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
