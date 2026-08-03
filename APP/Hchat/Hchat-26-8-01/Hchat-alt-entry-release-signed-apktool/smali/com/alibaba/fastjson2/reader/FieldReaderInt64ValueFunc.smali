.class final Lcom/alibaba/fastjson2/reader/FieldReaderInt64ValueFunc;
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
.field final function:Ljava/util/function/ObjLongConsumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/ObjLongConsumer<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/Long;Ljava/lang/reflect/Method;Ljava/util/function/ObjLongConsumer;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/Long;",
            "Ljava/lang/reflect/Method;",
            "Ljava/util/function/ObjLongConsumer<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    const/4 v8, 0x0

    .line 2
    const/4 v11, 0x0

    .line 3
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    const-wide/16 v5, 0x0

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    move-object v3, v2

    .line 9
    move-object v0, p0

    .line 10
    move-object v1, p1

    .line 11
    move v4, p2

    .line 12
    move-object v9, p3

    .line 13
    move-object/from16 v10, p4

    .line 14
    .line 15
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/reader/FieldReader;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V

    .line 16
    .line 17
    .line 18
    move-object/from16 p1, p5

    .line 19
    .line 20
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReaderInt64ValueFunc;->function:Ljava/util/function/ObjLongConsumer;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;I)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;I)V"
        }
    .end annotation

    .line 12
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderInt64ValueFunc;->function:Ljava/util/function/ObjLongConsumer;

    int-to-long v1, p2

    invoke-interface {v0, p1, v1, v2}, Ljava/util/function/ObjLongConsumer;->accept(Ljava/lang/Object;J)V

    return-void
.end method

.method public accept(Ljava/lang/Object;J)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;J)V"
        }
    .end annotation

    .line 11
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderInt64ValueFunc;->function:Ljava/util/function/ObjLongConsumer;

    invoke-interface {v0, p1, p2, p3}, Ljava/util/function/ObjLongConsumer;->accept(Ljava/lang/Object;J)V

    return-void
.end method

.method public accept(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lcom/alibaba/fastjson2/util/TypeUtils;->toLongValue(Ljava/lang/Object;)J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/FieldReaderInt64ValueFunc;->function:Ljava/util/function/ObjLongConsumer;

    .line 6
    .line 7
    invoke-interface {p2, p1, v0, v1}, Ljava/util/function/ObjLongConsumer;->accept(Ljava/lang/Object;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;
    .locals 2

    .line 11
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method public readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "TT;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReaderInt64ValueFunc;->function:Ljava/util/function/ObjLongConsumer;

    .line 6
    .line 7
    invoke-interface {p1, p2, v0, v1}, Ljava/util/function/ObjLongConsumer;->accept(Ljava/lang/Object;J)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
