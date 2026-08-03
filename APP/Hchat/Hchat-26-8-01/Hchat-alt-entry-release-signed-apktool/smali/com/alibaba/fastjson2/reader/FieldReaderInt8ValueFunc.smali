.class final Lcom/alibaba/fastjson2/reader/FieldReaderInt8ValueFunc;
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
.field final function:Lcom/alibaba/fastjson2/function/ObjByteConsumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/alibaba/fastjson2/function/ObjByteConsumer<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/reflect/Method;Lcom/alibaba/fastjson2/function/ObjByteConsumer;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/reflect/Method;",
            "Lcom/alibaba/fastjson2/function/ObjByteConsumer<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    const/4 v9, 0x0

    .line 2
    const/4 v11, 0x0

    .line 3
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

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
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReaderInt8ValueFunc;->function:Lcom/alibaba/fastjson2/function/ObjByteConsumer;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;B)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;B)V"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderInt8ValueFunc;->function:Lcom/alibaba/fastjson2/function/ObjByteConsumer;

    invoke-interface {v0, p1, p2}, Lcom/alibaba/fastjson2/function/ObjByteConsumer;->accept(Ljava/lang/Object;B)V

    return-void
.end method

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
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->toByteValue(Ljava/lang/Object;)B

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderInt8ValueFunc;->function:Lcom/alibaba/fastjson2/function/ObjByteConsumer;

    .line 6
    .line 7
    invoke-interface {v0, p1, p2}, Lcom/alibaba/fastjson2/function/ObjByteConsumer;->accept(Ljava/lang/Object;B)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;
    .locals 0

    .line 12
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt32Value()I

    move-result p1

    int-to-byte p1, p1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

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
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt32Value()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    int-to-byte p1, p1

    .line 6
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderInt8ValueFunc;->function:Lcom/alibaba/fastjson2/function/ObjByteConsumer;

    .line 7
    .line 8
    invoke-interface {v0, p2, p1}, Lcom/alibaba/fastjson2/function/ObjByteConsumer;->accept(Ljava/lang/Object;B)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
