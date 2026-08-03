.class final Lcom/alibaba/fastjson2/reader/FieldReaderCharValueFunc;
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
.field final function:Lcom/alibaba/fastjson2/function/ObjCharConsumer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/alibaba/fastjson2/function/ObjCharConsumer<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Character;Ljava/lang/reflect/Method;Lcom/alibaba/fastjson2/function/ObjCharConsumer;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/Character;",
            "Ljava/lang/reflect/Method;",
            "Lcom/alibaba/fastjson2/function/ObjCharConsumer<",
            "TT;>;)V"
        }
    .end annotation

    .line 1
    const/4 v8, 0x0

    .line 2
    const/4 v11, 0x0

    .line 3
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 4
    .line 5
    const-wide/16 v5, 0x0

    .line 6
    .line 7
    move-object v3, v2

    .line 8
    move-object v0, p0

    .line 9
    move-object v1, p1

    .line 10
    move v4, p2

    .line 11
    move-object v7, p3

    .line 12
    move-object/from16 v9, p4

    .line 13
    .line 14
    move-object/from16 v10, p5

    .line 15
    .line 16
    invoke-direct/range {v0 .. v11}, Lcom/alibaba/fastjson2/reader/FieldReader;-><init>(Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;IJLjava/lang/String;Ljava/util/Locale;Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Field;)V

    .line 17
    .line 18
    .line 19
    move-object/from16 p1, p6

    .line 20
    .line 21
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReaderCharValueFunc;->function:Lcom/alibaba/fastjson2/function/ObjCharConsumer;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;C)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;C)V"
        }
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/FieldReaderCharValueFunc;->function:Lcom/alibaba/fastjson2/function/ObjCharConsumer;

    invoke-interface {v0, p1, p2}, Lcom/alibaba/fastjson2/function/ObjCharConsumer;->accept(Ljava/lang/Object;C)V

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
    instance-of v0, p2, Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p2, Ljava/lang/String;

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p2, v0}, Ljava/lang/String;->charAt(I)C

    .line 9
    .line 10
    .line 11
    move-result p2

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    instance-of v0, p2, Ljava/lang/Character;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p2, Ljava/lang/Character;

    .line 18
    .line 19
    invoke-virtual {p2}, Ljava/lang/Character;->charValue()C

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    :goto_0
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReaderCharValueFunc;->accept(Ljava/lang/Object;C)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    const-string p1, "cast to char error"

    .line 28
    .line 29
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public bridge synthetic readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/Object;
    .locals 0

    .line 20
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/reader/FieldReaderCharValueFunc;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public readFieldValue(Lcom/alibaba/fastjson2/JSONReader;)Ljava/lang/String;
    .locals 0

    .line 21
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

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
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readCharValue()C

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->wasNull()Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p1, p0, Lcom/alibaba/fastjson2/reader/FieldReaderCharValueFunc;->function:Lcom/alibaba/fastjson2/function/ObjCharConsumer;

    .line 15
    .line 16
    invoke-interface {p1, p2, v0}, Lcom/alibaba/fastjson2/function/ObjCharConsumer;->accept(Ljava/lang/Object;C)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
