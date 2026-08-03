.class final Lcom/alibaba/fastjson2/writer/FieldWriterCharValFunc;
.super Lcom/alibaba/fastjson2/writer/FieldWriter;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field final function:Lcom/alibaba/fastjson2/function/ToCharFunction;


# direct methods
.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/function/ToCharFunction;)V
    .locals 11

    .line 1
    sget-object v7, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v9, 0x0

    .line 4
    move-object v8, v7

    .line 5
    move-object v0, p0

    .line 6
    move-object v1, p1

    .line 7
    move v2, p2

    .line 8
    move-wide v3, p3

    .line 9
    move-object/from16 v5, p5

    .line 10
    .line 11
    move-object/from16 v6, p6

    .line 12
    .line 13
    move-object/from16 v10, p7

    .line 14
    .line 15
    invoke-direct/range {v0 .. v10}, Lcom/alibaba/fastjson2/writer/FieldWriter;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 16
    .line 17
    .line 18
    move-object/from16 p1, p8

    .line 19
    .line 20
    iput-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterCharValFunc;->function:Lcom/alibaba/fastjson2/function/ToCharFunction;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterCharValFunc;->function:Lcom/alibaba/fastjson2/function/ToCharFunction;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Lcom/alibaba/fastjson2/function/ToCharFunction;->applyAsChar(Ljava/lang/Object;)C

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    return-object p1
.end method

.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterCharValFunc;->function:Lcom/alibaba/fastjson2/function/ToCharFunction;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Lcom/alibaba/fastjson2/function/ToCharFunction;->applyAsChar(Ljava/lang/Object;)C

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeChar(C)V

    .line 11
    .line 12
    .line 13
    const/4 p1, 0x1

    .line 14
    return p1
.end method

.method public writeValue(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterCharValFunc;->function:Lcom/alibaba/fastjson2/function/ToCharFunction;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Lcom/alibaba/fastjson2/function/ToCharFunction;->applyAsChar(Ljava/lang/Object;)C

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeChar(C)V

    .line 8
    .line 9
    .line 10
    return-void
.end method
