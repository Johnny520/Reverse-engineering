.class public abstract Lcom/alibaba/fastjson2/JSONReader;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/io/Closeable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/alibaba/fastjson2/JSONReader$BigIntegerCreator;,
        Lcom/alibaba/fastjson2/JSONReader$SavePoint;,
        Lcom/alibaba/fastjson2/JSONReader$ResolveTask;,
        Lcom/alibaba/fastjson2/JSONReader$Feature;,
        Lcom/alibaba/fastjson2/JSONReader$Context;,
        Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;
    }
.end annotation


# static fields
.field static final EOI:C = '\u001a'

.field static final INT_VALUE_END:[Z

.field static final JSON_TYPE_ARRAY:B = 0x7t

.field static final JSON_TYPE_BIG_DEC:B = 0x8t

.field static final JSON_TYPE_BOOL:B = 0x4t

.field static final JSON_TYPE_DEC:B = 0x2t

.field static final JSON_TYPE_DOUBLE:B = 0xdt

.field static final JSON_TYPE_FLOAT:B = 0xct

.field static final JSON_TYPE_INT:B = 0x1t

.field static final JSON_TYPE_INT16:B = 0xat

.field static final JSON_TYPE_INT64:B = 0xbt

.field static final JSON_TYPE_INT8:B = 0x9t

.field static final JSON_TYPE_NULL:B = 0x5t

.field static final JSON_TYPE_NaN:B = 0xet

.field static final JSON_TYPE_OBJECT:B = 0x6t

.field static final JSON_TYPE_STRING:B = 0x3t

.field protected static final MASK_DISABLE_REFERENCE_DETECT:J = 0x200000000L

.field static final MAX_EXP:I = 0x7ff

.field static final SPACE:J = 0x100003701L


# instance fields
.field protected boolValue:Z

.field protected ch:C

.field protected comma:Z

.field protected complex:Ljava/lang/Object;

.field public final context:Lcom/alibaba/fastjson2/JSONReader$Context;

.field protected doubleChars:[C

.field protected exponent:S

.field public final jsonb:Z

.field protected level:I

.field protected mag0:I

.field protected mag1:I

.field protected mag2:I

.field protected mag3:I

.field protected nameEscape:Z

.field protected negative:Z

.field protected offset:I

.field resolveTasks:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/alibaba/fastjson2/JSONReader$ResolveTask;",
            ">;"
        }
    .end annotation
.end field

.field protected scale:S

.field protected stringValue:Ljava/lang/String;

.field protected typeRedirect:Z

.field protected valueEscape:Z

.field protected valueType:B

.field protected wasNull:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const/16 v0, 0x100

    .line 2
    .line 3
    new-array v0, v0, [Z

    .line 4
    .line 5
    sput-object v0, Lcom/alibaba/fastjson2/JSONReader;->INT_VALUE_END:[Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([ZZ)V

    .line 9
    .line 10
    .line 11
    const/16 v0, 0x13

    .line 12
    .line 13
    new-array v1, v0, [C

    .line 14
    .line 15
    fill-array-data v1, :array_0

    .line 16
    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    move v3, v2

    .line 20
    :goto_0
    if-ge v3, v0, :cond_0

    .line 21
    .line 22
    aget-char v4, v1, v3

    .line 23
    .line 24
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader;->INT_VALUE_END:[Z

    .line 25
    .line 26
    aput-boolean v2, v5, v4

    .line 27
    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    return-void

    .line 32
    nop

    .line 33
    :array_0
    .array-data 2
        0x2es
        0x65s
        0x45s
        0x74s
        0x66s
        0x6es
        0x7bs
        0x5bs
        0x30s
        0x31s
        0x32s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
    .end array-data
.end method

.method public constructor <init>(Lcom/alibaba/fastjson2/JSONReader$Context;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 5
    .line 6
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 7
    .line 8
    return-void
.end method

.method private add(Ljava/util/List;ILjava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;I",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    instance-of v0, p3, Lcom/alibaba/fastjson2/JSONPath;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p3, Lcom/alibaba/fastjson2/JSONPath;

    .line 6
    .line 7
    invoke-virtual {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Collection;ILcom/alibaba/fastjson2/JSONPath;)V

    .line 8
    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    invoke-interface {p1, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static varargs autoTypeFilter(Z[Ljava/lang/Class;)Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;
    .locals 1

    .line 9
    new-instance v0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;

    invoke-direct {v0, p0, p1}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;-><init>(Z[Ljava/lang/Class;)V

    return-object v0
.end method

.method public static varargs autoTypeFilter(Z[Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;
    .locals 1

    .line 7
    new-instance v0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;

    invoke-direct {v0, p0, p1}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;-><init>(Z[Ljava/lang/String;)V

    return-object v0
.end method

.method public static varargs autoTypeFilter([Ljava/lang/Class;)Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;
    .locals 1

    .line 8
    new-instance v0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;

    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;-><init>([Ljava/lang/Class;)V

    return-object v0
.end method

.method public static varargs autoTypeFilter([Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/filter/ContextAutoTypeBeforeHandler;-><init>([Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method

.method public static char2(II)C
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->DIGITS2:[I

    .line 2
    .line 3
    aget p0, v0, p0

    .line 4
    .line 5
    shl-int/lit8 p0, p0, 0x4

    .line 6
    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    add-int/2addr p0, p1

    .line 10
    int-to-char p0, p0

    .line 11
    return p0
.end method

.method public static char4(IIII)C
    .locals 1

    .line 1
    sget-object v0, Lcom/alibaba/fastjson2/JSONFactory;->DIGITS2:[I

    .line 2
    .line 3
    aget p0, v0, p0

    .line 4
    .line 5
    shl-int/lit8 p0, p0, 0xc

    .line 6
    .line 7
    aget p1, v0, p1

    .line 8
    .line 9
    shl-int/lit8 p1, p1, 0x8

    .line 10
    .line 11
    add-int/2addr p0, p1

    .line 12
    aget p1, v0, p2

    .line 13
    .line 14
    shl-int/lit8 p1, p1, 0x4

    .line 15
    .line 16
    add-int/2addr p0, p1

    .line 17
    aget p1, v0, p3

    .line 18
    .line 19
    add-int/2addr p0, p1

    .line 20
    int-to-char p0, p0

    .line 21
    return p0
.end method

.method public static isFirstIdentifier(I)Z
    .locals 1

    .line 1
    const/16 v0, 0x41

    .line 2
    .line 3
    if-lt p0, v0, :cond_0

    .line 4
    .line 5
    const/16 v0, 0x5a

    .line 6
    .line 7
    if-le p0, v0, :cond_4

    .line 8
    .line 9
    :cond_0
    const/16 v0, 0x61

    .line 10
    .line 11
    if-lt p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x7a

    .line 14
    .line 15
    if-le p0, v0, :cond_4

    .line 16
    .line 17
    :cond_1
    const/16 v0, 0x5f

    .line 18
    .line 19
    if-eq p0, v0, :cond_4

    .line 20
    .line 21
    const/16 v0, 0x24

    .line 22
    .line 23
    if-eq p0, v0, :cond_4

    .line 24
    .line 25
    const/16 v0, 0x30

    .line 26
    .line 27
    if-lt p0, v0, :cond_2

    .line 28
    .line 29
    const/16 v0, 0x39

    .line 30
    .line 31
    if-le p0, v0, :cond_4

    .line 32
    .line 33
    :cond_2
    const/16 v0, 0x7f

    .line 34
    .line 35
    if-le p0, v0, :cond_3

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_3
    const/4 p0, 0x0

    .line 39
    return p0

    .line 40
    :cond_4
    :goto_0
    const/4 p0, 0x1

    .line 41
    return p0
.end method

.method public static numberError(II)Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 33
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    const-string v1, "illegal number, offset "

    const-string v2, ", char "

    .line 34
    invoke-static {p0, v1, v2}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    int-to-char p1, p1

    .line 35
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static of(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 99
    invoke-static {p1, p0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lcom/alibaba/fastjson2/JSONReader$Context;[B)Lcom/alibaba/fastjson2/JSONReader;
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 60
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v4, 0x0

    array-length v5, p1

    const/4 v2, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    return-object v0
.end method

.method public static of(Lcom/alibaba/fastjson2/JSONReader$Context;[C)Lcom/alibaba/fastjson2/JSONReader;
    .locals 6
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 64
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v4, 0x0

    array-length v5, p1

    const/4 v2, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    return-object v0
.end method

.method public static of(Ljava/io/InputStream;Ljava/nio/charset/Charset;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 2

    .line 84
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v1, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    invoke-static {p0, p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    return-object p0
.end method

.method public static of(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 1

    .line 85
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    if-eq p1, v0, :cond_3

    if-nez p1, :cond_0

    goto :goto_0

    .line 86
    :cond_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    if-ne p1, v0, :cond_1

    .line 87
    new-instance p1, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-direct {p1, p2, p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V

    return-object p1

    .line 88
    :cond_1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    if-ne p1, v0, :cond_2

    .line 89
    new-instance p1, Lcom/alibaba/fastjson2/JSONReaderASCII;

    invoke-direct {p1, p2, p0}, Lcom/alibaba/fastjson2/JSONReaderASCII;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V

    return-object p1

    .line 90
    :cond_2
    const-string p0, "not support charset "

    invoke-static {p1, p0}, Lah/a;->v(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    .line 91
    :cond_3
    :goto_0
    new-instance p1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    invoke-direct {p1, p2, p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V

    return-object p1
.end method

.method public static of(Ljava/io/Reader;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 2

    .line 92
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    .line 93
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/Reader;)V

    return-object v0
.end method

.method public static of(Ljava/io/Reader;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 1

    .line 94
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-direct {v0, p1, p0}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/Reader;)V

    return-object v0
.end method

.method public static of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 4

    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$Context;

    sget-object v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultObjectReaderProvider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-direct {v1, v2}, Lcom/alibaba/fastjson2/JSONReader$Context;-><init>(Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;)V

    const/4 v2, 0x0

    .line 102
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    invoke-direct {v0, v1, p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    return-object v0
.end method

.method public static of(Ljava/lang/String;II)Lcom/alibaba/fastjson2/JSONReader;
    .locals 6

    .line 105
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v1

    .line 107
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    .line 108
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    move-object v2, p0

    move v4, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    return-object v0
.end method

.method public static of(Ljava/lang/String;IILcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 6

    if-eqz p0, :cond_0

    if-eqz p3, :cond_0

    .line 109
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v3

    .line 110
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    move-object v2, p0

    move v4, p1

    move v5, p2

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    .line 111
    throw p0
.end method

.method public static of(Ljava/lang/String;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 3

    if-eqz p0, :cond_0

    if-eqz p1, :cond_0

    .line 103
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v1, 0x0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-direct {v0, p1, p0, v1, v2}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;II)V

    return-object v0

    :cond_0
    const/4 p0, 0x0

    .line 104
    throw p0
.end method

.method public static of(Ljava/net/URL;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 1

    .line 80
    invoke-virtual {p0}, Ljava/net/URL;->openStream()Ljava/io/InputStream;

    move-result-object p0

    .line 81
    :try_start_0
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-static {p0, v0, p1}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/io/InputStream;Ljava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_0

    .line 82
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V

    :cond_0
    return-object p1

    :catchall_0
    move-exception p1

    if-eqz p0, :cond_1

    .line 83
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p0

    invoke-virtual {p1, p0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    throw p1
.end method

.method public static of(Ljava/nio/ByteBuffer;Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/nio/charset/Charset;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 1

    .line 96
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    if-eq p2, v0, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 97
    :cond_0
    const-string p0, "not support charset "

    invoke-static {p2, p0}, Lah/a;->v(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0

    .line 98
    :cond_1
    :goto_0
    new-instance p2, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    invoke-direct {p2, p1, p0}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/nio/ByteBuffer;)V

    return-object p2
.end method

.method public static of(Ljava/nio/ByteBuffer;Ljava/nio/charset/Charset;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 1

    .line 95
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v0

    invoke-static {p0, v0, p1}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/nio/ByteBuffer;Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/nio/charset/Charset;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    return-object p0
.end method

.method public static of([B)Lcom/alibaba/fastjson2/JSONReader;
    .locals 6

    .line 74
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v1

    const/4 v4, 0x0

    array-length v5, p0

    const/4 v2, 0x0

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    return-object v0
.end method

.method public static of([BII)Lcom/alibaba/fastjson2/JSONReader;
    .locals 6

    .line 75
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v1

    const/4 v2, 0x0

    move-object v3, p0

    move v4, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    return-object v0
.end method

.method public static of([BIILcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 6

    .line 76
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v2, 0x0

    move-object v3, p0

    move v4, p1

    move v5, p2

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    return-object v0
.end method

.method public static of([BIILjava/nio/charset/Charset;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 6

    .line 66
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v1

    .line 67
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    if-ne p3, v0, :cond_0

    .line 68
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v2, 0x0

    move-object v3, p0

    move v4, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    return-object v0

    :cond_0
    move-object v3, p0

    move v4, p1

    move v5, p2

    .line 69
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    if-ne p3, p0, :cond_1

    .line 70
    new-instance p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    invoke-direct {p0, v1, v3, v4, v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    return-object p0

    .line 71
    :cond_1
    sget-object p0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    if-eq p3, p0, :cond_3

    sget-object p0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    if-ne p3, p0, :cond_2

    goto :goto_0

    .line 72
    :cond_2
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v3, v4, v5, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-static {p0, v1}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    move-result-object p0

    return-object p0

    .line 73
    :cond_3
    :goto_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderASCII;

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderASCII;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    return-object v0
.end method

.method public static of([BIILjava/nio/charset/Charset;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 8

    .line 1
    sget-object v0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    if-ne p3, v0, :cond_0

    .line 4
    .line 5
    new-instance v1, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v4, p0

    .line 9
    move v5, p1

    .line 10
    move v6, p2

    .line 11
    move-object v2, p4

    .line 12
    invoke-direct/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    .line 13
    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    move-object v4, p0

    .line 17
    move v5, p1

    .line 18
    move v6, p2

    .line 19
    move-object v2, p4

    .line 20
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_16:Ljava/nio/charset/Charset;

    .line 21
    .line 22
    if-ne p3, p0, :cond_1

    .line 23
    .line 24
    new-instance p0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    .line 25
    .line 26
    invoke-direct {p0, v2, v4, v5, v6}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 27
    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_1
    sget-object p0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    .line 31
    .line 32
    if-eq p3, p0, :cond_2

    .line 33
    .line 34
    sget-object p0, Ljava/nio/charset/StandardCharsets;->ISO_8859_1:Ljava/nio/charset/Charset;

    .line 35
    .line 36
    if-ne p3, p0, :cond_3

    .line 37
    .line 38
    :cond_2
    move-object v3, v2

    .line 39
    goto :goto_0

    .line 40
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 41
    .line 42
    invoke-direct {p0, v4, v5, v6, p3}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v2}, Lcom/alibaba/fastjson2/JSONReader;->of(Ljava/lang/String;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0

    .line 50
    :goto_0
    new-instance v2, Lcom/alibaba/fastjson2/JSONReaderASCII;

    .line 51
    .line 52
    move v7, v6

    .line 53
    move v6, v5

    .line 54
    move-object v5, v4

    .line 55
    const/4 v4, 0x0

    .line 56
    invoke-direct/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReaderASCII;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    .line 57
    .line 58
    .line 59
    return-object v2
.end method

.method public static of([BLcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 6

    .line 61
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF8;

    const/4 v4, 0x0

    array-length v5, p0

    const/4 v2, 0x0

    move-object v3, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderUTF8;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[BII)V

    return-object v0
.end method

.method public static of([C)Lcom/alibaba/fastjson2/JSONReader;
    .locals 6

    .line 62
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v1

    .line 63
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v4, 0x0

    array-length v5, p0

    const/4 v2, 0x0

    move-object v3, p0

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    return-object v0
.end method

.method public static of([CII)Lcom/alibaba/fastjson2/JSONReader;
    .locals 6

    .line 77
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v1

    .line 78
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v2, 0x0

    move-object v3, p0

    move v4, p1

    move v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    return-object v0
.end method

.method public static of([CIILcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 6

    .line 79
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v2, 0x0

    move-object v3, p0

    move v4, p1

    move v5, p2

    move-object v1, p3

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    return-object v0
.end method

.method public static of([CLcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 6

    .line 65
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderUTF16;

    const/4 v4, 0x0

    array-length v5, p0

    const/4 v2, 0x0

    move-object v3, p0

    move-object v1, p1

    invoke-direct/range {v0 .. v5}, Lcom/alibaba/fastjson2/JSONReaderUTF16;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/lang/String;[CII)V

    return-object v0
.end method

.method public static ofJSONB(Lcom/alibaba/fastjson2/JSONReader$Context;[B)Lcom/alibaba/fastjson2/JSONReader;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 17
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    const/4 v1, 0x0

    array-length v2, p1

    invoke-direct {v0, p0, p1, v1, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    return-object v0
.end method

.method public static ofJSONB(Ljava/io/InputStream;Lcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 1

    .line 16
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v0, p1, p0}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;Ljava/io/InputStream;)V

    return-object v0
.end method

.method public static ofJSONB([B)Lcom/alibaba/fastjson2/JSONReader;
    .locals 4

    .line 19
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    .line 20
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v1

    const/4 v2, 0x0

    array-length v3, p0

    invoke-direct {v0, v1, p0, v2, v3}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    return-object v0
.end method

.method public static ofJSONB([BII)Lcom/alibaba/fastjson2/JSONReader;
    .locals 2

    .line 21
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    .line 22
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object v1

    invoke-direct {v0, v1, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    return-object v0
.end method

.method public static ofJSONB([BIILcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 1

    .line 23
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    invoke-direct {v0, p3, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    return-object v0
.end method

.method public static ofJSONB([BIILcom/alibaba/fastjson2/SymbolTable;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 1

    .line 24
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    .line 25
    invoke-static {p3}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext(Lcom/alibaba/fastjson2/SymbolTable;)Lcom/alibaba/fastjson2/JSONReader$Context;

    move-result-object p3

    invoke-direct {v0, p3, p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    return-object v0
.end method

.method public static ofJSONB([BLcom/alibaba/fastjson2/JSONReader$Context;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 3

    .line 18
    new-instance v0, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    const/4 v1, 0x0

    array-length v2, p0

    invoke-direct {v0, p1, p0, v1, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    return-object v0
.end method

.method public static varargs ofJSONB([B[Lcom/alibaba/fastjson2/JSONReader$Feature;)Lcom/alibaba/fastjson2/JSONReader;
    .locals 3

    .line 1
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createReadContext()Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONReader$Context;->config([Lcom/alibaba/fastjson2/JSONReader$Feature;)V

    .line 6
    .line 7
    .line 8
    new-instance p1, Lcom/alibaba/fastjson2/JSONReaderJSONB;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    array-length v2, p0

    .line 12
    invoke-direct {p1, v0, p0, v1, v2}, Lcom/alibaba/fastjson2/JSONReaderJSONB;-><init>(Lcom/alibaba/fastjson2/JSONReader$Context;[BII)V

    .line 13
    .line 14
    .line 15
    return-object p1
.end method

.method public static syntaxError(I)Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "syntax error, expect \',\', but \'"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    int-to-char p0, p0

    .line 11
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    const-string p0, "\'"

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public static syntaxError(II)Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 27
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    const-string v1, "syntax error, offset "

    const-string v2, ", char "

    .line 28
    invoke-static {p0, v1, v2}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    int-to-char p1, p1

    .line 29
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final addResolveTask(Lcom/alibaba/fastjson2/reader/FieldReader;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V
    .locals 3

    .line 31
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-nez v0, :cond_0

    .line 32
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 33
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$ResolveTask;

    iget-object v2, p1, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldName:Ljava/lang/String;

    invoke-direct {v1, p1, p2, v2, p3}, Lcom/alibaba/fastjson2/JSONReader$ResolveTask;-><init>(Lcom/alibaba/fastjson2/reader/FieldReader;Ljava/lang/Object;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addResolveTask(Ljava/util/Collection;ILcom/alibaba/fastjson2/JSONPath;)V
    .locals 3

    .line 34
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-nez v0, :cond_0

    .line 35
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 36
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$ResolveTask;

    const/4 v2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {v1, v2, p1, p2, p3}, Lcom/alibaba/fastjson2/JSONReader$ResolveTask;-><init>(Lcom/alibaba/fastjson2/reader/FieldReader;Ljava/lang/Object;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final addResolveTask(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 11
    .line 12
    :cond_0
    instance-of v0, p1, Ljava/util/LinkedHashMap;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {p1, p2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 21
    .line 22
    new-instance v2, Lcom/alibaba/fastjson2/JSONReader$ResolveTask;

    .line 23
    .line 24
    invoke-direct {v2, v1, p1, p2, p3}, Lcom/alibaba/fastjson2/JSONReader$ResolveTask;-><init>(Lcom/alibaba/fastjson2/reader/FieldReader;Ljava/lang/Object;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public final addResolveTask([Ljava/lang/Object;ILcom/alibaba/fastjson2/JSONPath;)V
    .locals 3

    .line 37
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    if-nez v0, :cond_0

    .line 38
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 39
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    new-instance v1, Lcom/alibaba/fastjson2/JSONReader$ResolveTask;

    const/4 v2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-direct {v1, v2, p1, p2, p3}, Lcom/alibaba/fastjson2/JSONReader$ResolveTask;-><init>(Lcom/alibaba/fastjson2/reader/FieldReader;Ljava/lang/Object;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final bigInt([BII)V
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p2

    move/from16 v3, p3

    sub-int v4, v3, v2

    .line 321
    iget-short v5, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    if-lez v5, :cond_0

    add-int/lit8 v4, v4, -0x1

    :cond_0
    const/16 v5, 0x26

    if-gt v4, v5, :cond_13

    const/16 v5, 0x9

    .line 322
    rem-int/2addr v4, v5

    if-nez v4, :cond_1

    goto :goto_0

    :cond_1
    move v5, v4

    :goto_0
    add-int v4, v2, v5

    add-int/lit8 v5, v2, 0x1

    .line 323
    aget-byte v6, v1, v2

    int-to-char v6, v6

    const/16 v7, 0x2e

    const/4 v8, 0x2

    if-ne v6, v7, :cond_2

    add-int/2addr v2, v8

    .line 324
    aget-byte v5, v1, v5

    int-to-char v6, v5

    add-int/lit8 v5, v4, 0x1

    move/from16 v21, v5

    move v5, v2

    move/from16 v2, v21

    goto :goto_1

    :cond_2
    move v2, v4

    :goto_1
    add-int/lit8 v6, v6, -0x30

    :goto_2
    const/4 v9, 0x1

    if-ge v5, v4, :cond_4

    .line 325
    aget-byte v10, v1, v5

    int-to-char v10, v10

    if-ne v10, v7, :cond_3

    add-int/lit8 v5, v5, 0x1

    .line 326
    aget-byte v10, v1, v5

    int-to-char v10, v10

    add-int/lit8 v2, v2, 0x1

    if-ge v4, v3, :cond_3

    add-int/lit8 v4, v4, 0x1

    :cond_3
    add-int/lit8 v10, v10, -0x30

    mul-int/lit8 v6, v6, 0xa

    add-int/2addr v6, v10

    add-int/2addr v5, v9

    goto :goto_2

    .line 327
    :cond_4
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    :cond_5
    if-ge v2, v3, :cond_12

    add-int/lit8 v4, v2, 0x9

    add-int/lit8 v5, v2, 0x1

    .line 328
    aget-byte v6, v1, v2

    int-to-char v6, v6

    if-ne v6, v7, :cond_6

    add-int/lit8 v4, v2, 0x2

    .line 329
    aget-byte v5, v1, v5

    int-to-char v6, v5

    add-int/lit8 v2, v2, 0xa

    move v5, v4

    move v4, v2

    goto :goto_3

    :cond_6
    move v2, v4

    :goto_3
    add-int/lit8 v6, v6, -0x30

    :goto_4
    if-ge v5, v4, :cond_8

    .line 330
    aget-byte v10, v1, v5

    int-to-char v10, v10

    if-ne v10, v7, :cond_7

    add-int/lit8 v5, v5, 0x1

    .line 331
    aget-byte v10, v1, v5

    int-to-char v10, v10

    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v4, v4, 0x1

    :cond_7
    add-int/lit8 v10, v10, -0x30

    mul-int/lit8 v6, v6, 0xa

    add-int/2addr v6, v10

    add-int/2addr v5, v9

    goto :goto_4

    :cond_8
    int-to-long v4, v6

    const-wide v10, 0xffffffffL

    and-long/2addr v4, v10

    const/4 v6, 0x3

    const-wide/16 v12, 0x0

    move v14, v6

    .line 332
    :goto_5
    const-string v15, "BigInteger would overflow supported range"

    const/16 v16, 0x20

    if-ltz v14, :cond_d

    const-wide/32 v17, 0x3b9aca00

    if-eqz v14, :cond_c

    if-eq v14, v9, :cond_b

    if-eq v14, v8, :cond_a

    if-ne v14, v6, :cond_9

    .line 333
    iget v15, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    move-wide/from16 v19, v10

    int-to-long v10, v15

    and-long v10, v10, v19

    mul-long v17, v17, v10

    add-long v10, v17, v12

    long-to-int v12, v10

    .line 334
    iput v12, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    goto :goto_6

    .line 335
    :cond_9
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1, v15}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    move-wide/from16 v19, v10

    .line 336
    iget v10, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    int-to-long v10, v10

    and-long v10, v10, v19

    mul-long v17, v17, v10

    add-long v10, v17, v12

    long-to-int v12, v10

    .line 337
    iput v12, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    goto :goto_6

    :cond_b
    move-wide/from16 v19, v10

    .line 338
    iget v10, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    int-to-long v10, v10

    and-long v10, v10, v19

    mul-long v17, v17, v10

    add-long v10, v17, v12

    long-to-int v12, v10

    .line 339
    iput v12, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    goto :goto_6

    :cond_c
    move-wide/from16 v19, v10

    .line 340
    iget v10, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    int-to-long v10, v10

    and-long v10, v10, v19

    mul-long v17, v17, v10

    add-long v10, v17, v12

    long-to-int v12, v10

    .line 341
    iput v12, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    :goto_6
    ushr-long v12, v10, v16

    add-int/lit8 v14, v14, -0x1

    move-wide/from16 v10, v19

    goto :goto_5

    :cond_d
    move-wide/from16 v19, v10

    .line 342
    iget v10, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    int-to-long v10, v10

    and-long v10, v10, v19

    add-long/2addr v10, v4

    long-to-int v4, v10

    .line 343
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    ushr-long v4, v10, v16

    move v10, v8

    :goto_7
    if-ltz v10, :cond_5

    if-eqz v10, :cond_11

    if-eq v10, v9, :cond_10

    if-eq v10, v8, :cond_f

    if-ne v10, v6, :cond_e

    .line 344
    iget v11, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    int-to-long v11, v11

    and-long v11, v11, v19

    add-long/2addr v11, v4

    long-to-int v4, v11

    .line 345
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    goto :goto_8

    .line 346
    :cond_e
    new-instance v1, Ljava/lang/ArithmeticException;

    invoke-direct {v1, v15}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    throw v1

    .line 347
    :cond_f
    iget v11, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    int-to-long v11, v11

    and-long v11, v11, v19

    add-long/2addr v11, v4

    long-to-int v4, v11

    .line 348
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    goto :goto_8

    .line 349
    :cond_10
    iget v11, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    int-to-long v11, v11

    and-long v11, v11, v19

    add-long/2addr v11, v4

    long-to-int v4, v11

    .line 350
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    goto :goto_8

    .line 351
    :cond_11
    iget v11, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    int-to-long v11, v11

    and-long v11, v11, v19

    add-long/2addr v11, v4

    long-to-int v4, v11

    .line 352
    iput v4, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    :goto_8
    ushr-long v4, v11, v16

    add-int/lit8 v10, v10, -0x1

    goto :goto_7

    :cond_12
    return-void

    .line 353
    :cond_13
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v1, v2, v4}, Ljava/lang/String;-><init>([BII)V

    const-string v1, "number too large : "

    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    return-void
.end method

.method public final bigInt([CII)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    sub-int v4, v3, v2

    .line 10
    .line 11
    iget-short v5, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 12
    .line 13
    if-lez v5, :cond_0

    .line 14
    .line 15
    add-int/lit8 v4, v4, -0x1

    .line 16
    .line 17
    :cond_0
    const/16 v5, 0x26

    .line 18
    .line 19
    if-gt v4, v5, :cond_13

    .line 20
    .line 21
    const/16 v5, 0x9

    .line 22
    .line 23
    rem-int/2addr v4, v5

    .line 24
    if-nez v4, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move v5, v4

    .line 28
    :goto_0
    add-int v4, v2, v5

    .line 29
    .line 30
    add-int/lit8 v5, v2, 0x1

    .line 31
    .line 32
    aget-char v6, v1, v2

    .line 33
    .line 34
    const/16 v7, 0x2e

    .line 35
    .line 36
    const/4 v8, 0x2

    .line 37
    if-ne v6, v7, :cond_2

    .line 38
    .line 39
    add-int/2addr v2, v8

    .line 40
    aget-char v6, v1, v5

    .line 41
    .line 42
    add-int/lit8 v5, v4, 0x1

    .line 43
    .line 44
    move/from16 v19, v5

    .line 45
    .line 46
    move v5, v2

    .line 47
    move/from16 v2, v19

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    move v2, v4

    .line 51
    :goto_1
    add-int/lit8 v6, v6, -0x30

    .line 52
    .line 53
    :goto_2
    const/4 v9, 0x1

    .line 54
    if-ge v5, v4, :cond_4

    .line 55
    .line 56
    aget-char v10, v1, v5

    .line 57
    .line 58
    if-ne v10, v7, :cond_3

    .line 59
    .line 60
    add-int/lit8 v5, v5, 0x1

    .line 61
    .line 62
    aget-char v10, v1, v5

    .line 63
    .line 64
    add-int/lit8 v2, v2, 0x1

    .line 65
    .line 66
    if-ge v4, v3, :cond_3

    .line 67
    .line 68
    add-int/lit8 v4, v4, 0x1

    .line 69
    .line 70
    :cond_3
    add-int/lit8 v10, v10, -0x30

    .line 71
    .line 72
    mul-int/lit8 v6, v6, 0xa

    .line 73
    .line 74
    add-int/2addr v6, v10

    .line 75
    add-int/2addr v5, v9

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    iput v6, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 78
    .line 79
    :cond_5
    if-ge v2, v3, :cond_12

    .line 80
    .line 81
    add-int/lit8 v4, v2, 0x9

    .line 82
    .line 83
    add-int/lit8 v5, v2, 0x1

    .line 84
    .line 85
    aget-char v6, v1, v2

    .line 86
    .line 87
    if-ne v6, v7, :cond_6

    .line 88
    .line 89
    add-int/lit8 v4, v2, 0x2

    .line 90
    .line 91
    aget-char v6, v1, v5

    .line 92
    .line 93
    add-int/lit8 v2, v2, 0xa

    .line 94
    .line 95
    move v5, v4

    .line 96
    move v4, v2

    .line 97
    goto :goto_3

    .line 98
    :cond_6
    move v2, v4

    .line 99
    :goto_3
    add-int/lit8 v6, v6, -0x30

    .line 100
    .line 101
    :goto_4
    if-ge v5, v4, :cond_8

    .line 102
    .line 103
    aget-char v10, v1, v5

    .line 104
    .line 105
    if-ne v10, v7, :cond_7

    .line 106
    .line 107
    add-int/lit8 v5, v5, 0x1

    .line 108
    .line 109
    aget-char v10, v1, v5

    .line 110
    .line 111
    add-int/lit8 v2, v2, 0x1

    .line 112
    .line 113
    add-int/lit8 v4, v4, 0x1

    .line 114
    .line 115
    :cond_7
    add-int/lit8 v10, v10, -0x30

    .line 116
    .line 117
    mul-int/lit8 v6, v6, 0xa

    .line 118
    .line 119
    add-int/2addr v6, v10

    .line 120
    add-int/2addr v5, v9

    .line 121
    goto :goto_4

    .line 122
    :cond_8
    const/4 v4, 0x3

    .line 123
    const-wide/16 v10, 0x0

    .line 124
    .line 125
    move v5, v4

    .line 126
    :goto_5
    const-string v12, "BigInteger would overflow supported range"

    .line 127
    .line 128
    if-ltz v5, :cond_d

    .line 129
    .line 130
    const-wide/32 v15, 0x3b9aca00

    .line 131
    .line 132
    .line 133
    if-eqz v5, :cond_c

    .line 134
    .line 135
    if-eq v5, v9, :cond_b

    .line 136
    .line 137
    if-eq v5, v8, :cond_a

    .line 138
    .line 139
    if-ne v5, v4, :cond_9

    .line 140
    .line 141
    iget v12, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 142
    .line 143
    const/16 p2, 0x20

    .line 144
    .line 145
    const-wide v17, 0xffffffffL

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    int-to-long v13, v12

    .line 151
    and-long v12, v13, v17

    .line 152
    .line 153
    mul-long/2addr v15, v12

    .line 154
    add-long/2addr v10, v15

    .line 155
    long-to-int v12, v10

    .line 156
    iput v12, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_9
    new-instance v1, Ljava/lang/ArithmeticException;

    .line 160
    .line 161
    invoke-direct {v1, v12}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 162
    .line 163
    .line 164
    throw v1

    .line 165
    :cond_a
    const/16 p2, 0x20

    .line 166
    .line 167
    const-wide v17, 0xffffffffL

    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    iget v12, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 173
    .line 174
    int-to-long v12, v12

    .line 175
    and-long v12, v12, v17

    .line 176
    .line 177
    mul-long/2addr v15, v12

    .line 178
    add-long/2addr v10, v15

    .line 179
    long-to-int v12, v10

    .line 180
    iput v12, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_b
    const/16 p2, 0x20

    .line 184
    .line 185
    const-wide v17, 0xffffffffL

    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    iget v12, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 191
    .line 192
    int-to-long v12, v12

    .line 193
    and-long v12, v12, v17

    .line 194
    .line 195
    mul-long/2addr v15, v12

    .line 196
    add-long/2addr v10, v15

    .line 197
    long-to-int v12, v10

    .line 198
    iput v12, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 199
    .line 200
    goto :goto_6

    .line 201
    :cond_c
    const/16 p2, 0x20

    .line 202
    .line 203
    const-wide v17, 0xffffffffL

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    iget v12, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 209
    .line 210
    int-to-long v12, v12

    .line 211
    and-long v12, v12, v17

    .line 212
    .line 213
    mul-long/2addr v15, v12

    .line 214
    add-long/2addr v10, v15

    .line 215
    long-to-int v12, v10

    .line 216
    iput v12, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 217
    .line 218
    :goto_6
    ushr-long v10, v10, p2

    .line 219
    .line 220
    add-int/lit8 v5, v5, -0x1

    .line 221
    .line 222
    goto :goto_5

    .line 223
    :cond_d
    const/16 p2, 0x20

    .line 224
    .line 225
    const-wide v17, 0xffffffffL

    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    int-to-long v5, v6

    .line 231
    and-long v5, v5, v17

    .line 232
    .line 233
    iget v10, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 234
    .line 235
    int-to-long v10, v10

    .line 236
    and-long v10, v10, v17

    .line 237
    .line 238
    add-long/2addr v10, v5

    .line 239
    long-to-int v5, v10

    .line 240
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 241
    .line 242
    ushr-long v5, v10, p2

    .line 243
    .line 244
    move v10, v8

    .line 245
    :goto_7
    if-ltz v10, :cond_5

    .line 246
    .line 247
    if-eqz v10, :cond_11

    .line 248
    .line 249
    if-eq v10, v9, :cond_10

    .line 250
    .line 251
    if-eq v10, v8, :cond_f

    .line 252
    .line 253
    if-ne v10, v4, :cond_e

    .line 254
    .line 255
    iget v11, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 256
    .line 257
    int-to-long v13, v11

    .line 258
    and-long v13, v13, v17

    .line 259
    .line 260
    add-long/2addr v13, v5

    .line 261
    long-to-int v5, v13

    .line 262
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 263
    .line 264
    goto :goto_8

    .line 265
    :cond_e
    new-instance v1, Ljava/lang/ArithmeticException;

    .line 266
    .line 267
    invoke-direct {v1, v12}, Ljava/lang/ArithmeticException;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    throw v1

    .line 271
    :cond_f
    iget v11, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 272
    .line 273
    int-to-long v13, v11

    .line 274
    and-long v13, v13, v17

    .line 275
    .line 276
    add-long/2addr v13, v5

    .line 277
    long-to-int v5, v13

    .line 278
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 279
    .line 280
    goto :goto_8

    .line 281
    :cond_10
    iget v11, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 282
    .line 283
    int-to-long v13, v11

    .line 284
    and-long v13, v13, v17

    .line 285
    .line 286
    add-long/2addr v13, v5

    .line 287
    long-to-int v5, v13

    .line 288
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 289
    .line 290
    goto :goto_8

    .line 291
    :cond_11
    iget v11, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 292
    .line 293
    int-to-long v13, v11

    .line 294
    and-long v13, v13, v17

    .line 295
    .line 296
    add-long/2addr v13, v5

    .line 297
    long-to-int v5, v13

    .line 298
    iput v5, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 299
    .line 300
    :goto_8
    ushr-long v5, v13, p2

    .line 301
    .line 302
    add-int/lit8 v10, v10, -0x1

    .line 303
    .line 304
    goto :goto_7

    .line 305
    :cond_12
    return-void

    .line 306
    :cond_13
    new-instance v3, Ljava/lang/String;

    .line 307
    .line 308
    invoke-direct {v3, v1, v2, v4}, Ljava/lang/String;-><init>([CII)V

    .line 309
    .line 310
    .line 311
    const-string v1, "number too large : "

    .line 312
    .line 313
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 318
    .line 319
    .line 320
    return-void
.end method

.method public final char1(I)C
    .locals 2

    .line 1
    const/16 v0, 0x22

    .line 2
    .line 3
    if-eq p1, v0, :cond_6

    .line 4
    .line 5
    const/16 v0, 0x23

    .line 6
    .line 7
    if-eq p1, v0, :cond_6

    .line 8
    .line 9
    const/16 v0, 0x40

    .line 10
    .line 11
    if-eq p1, v0, :cond_6

    .line 12
    .line 13
    const/16 v0, 0x46

    .line 14
    .line 15
    if-eq p1, v0, :cond_5

    .line 16
    .line 17
    const/16 v0, 0x5f

    .line 18
    .line 19
    if-eq p1, v0, :cond_6

    .line 20
    .line 21
    const/16 v0, 0x62

    .line 22
    .line 23
    if-eq p1, v0, :cond_4

    .line 24
    .line 25
    const/16 v0, 0x66

    .line 26
    .line 27
    if-eq p1, v0, :cond_5

    .line 28
    .line 29
    const/16 v0, 0x6e

    .line 30
    .line 31
    if-eq p1, v0, :cond_3

    .line 32
    .line 33
    const/16 v0, 0x72

    .line 34
    .line 35
    if-eq p1, v0, :cond_2

    .line 36
    .line 37
    const/16 v0, 0x74

    .line 38
    .line 39
    if-eq p1, v0, :cond_1

    .line 40
    .line 41
    const/16 v0, 0x76

    .line 42
    .line 43
    if-eq p1, v0, :cond_0

    .line 44
    .line 45
    packed-switch p1, :pswitch_data_0

    .line 46
    .line 47
    .line 48
    packed-switch p1, :pswitch_data_1

    .line 49
    .line 50
    .line 51
    packed-switch p1, :pswitch_data_2

    .line 52
    .line 53
    .line 54
    new-instance v0, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v1, "unclosed.str \'\\"

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    int-to-char p1, p1

    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    const/4 p1, 0x0

    .line 77
    return p1

    .line 78
    :pswitch_0
    const/4 p1, 0x7

    .line 79
    return p1

    .line 80
    :pswitch_1
    const/4 p1, 0x6

    .line 81
    return p1

    .line 82
    :pswitch_2
    const/4 p1, 0x5

    .line 83
    return p1

    .line 84
    :pswitch_3
    const/4 p1, 0x4

    .line 85
    return p1

    .line 86
    :pswitch_4
    const/4 p1, 0x3

    .line 87
    return p1

    .line 88
    :pswitch_5
    const/4 p1, 0x2

    .line 89
    return p1

    .line 90
    :pswitch_6
    const/4 p1, 0x1

    .line 91
    return p1

    .line 92
    :pswitch_7
    const/4 p1, 0x0

    .line 93
    return p1

    .line 94
    :cond_0
    const/16 p1, 0xb

    .line 95
    .line 96
    return p1

    .line 97
    :cond_1
    const/16 p1, 0x9

    .line 98
    .line 99
    return p1

    .line 100
    :cond_2
    const/16 p1, 0xd

    .line 101
    .line 102
    return p1

    .line 103
    :cond_3
    const/16 p1, 0xa

    .line 104
    .line 105
    return p1

    .line 106
    :cond_4
    const/16 p1, 0x8

    .line 107
    .line 108
    return p1

    .line 109
    :cond_5
    const/16 p1, 0xc

    .line 110
    .line 111
    return p1

    .line 112
    :cond_6
    :pswitch_8
    int-to-char p1, p1

    .line 113
    return p1

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x26
        :pswitch_8
        :pswitch_8
        :pswitch_8
        :pswitch_8
    .end packed-switch

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    :pswitch_data_1
    .packed-switch 0x2e
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    :pswitch_data_2
    .packed-switch 0x5b
        :pswitch_8
        :pswitch_8
        :pswitch_8
    .end packed-switch
.end method

.method public checkAutoType(Ljava/lang/Class;JJ)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return-object p1
.end method

.method public abstract close()V
.end method

.method public final current()C
    .locals 1

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    return v0
.end method

.method public final decimal(Lcom/alibaba/fastjson2/JSONObject;)Ljava/math/BigDecimal;
    .locals 1

    .line 1
    const-string v0, "value"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-string v0, "$numberDecimal"

    .line 10
    .line 11
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONObject;->getBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_1
    const-string v0, "can not cast to decimal "

    .line 19
    .line 20
    invoke-static {p1, v0}, Lah/a;->v(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p1, 0x0

    .line 24
    return-object p1
.end method

.method public endArray()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public error()Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "illegal ch "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    return-object v0
.end method

.method public final error(II)Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 27
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    const-string v1, "error, offset "

    const-string v2, ", char "

    .line 28
    invoke-static {p1, v1, v2}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    int-to-char p2, p2

    .line 29
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final error(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONException;
    .locals 1

    .line 30
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public final error(Ljava/lang/String;Ljava/lang/Exception;)Lcom/alibaba/fastjson2/JSONException;
    .locals 1

    .line 31
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1, p2}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public final errorOnNoneSerializable(Ljava/lang/Class;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNoneSerializable:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    const-class v0, Ljava/io/Serializable;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    const-string v0, "not support none-Serializable, class "

    .line 30
    .line 31
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :cond_1
    :goto_0
    return-void
.end method

.method public final features(J)J
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 4
    .line 5
    or-long/2addr p1, v0

    .line 6
    return-wide p1
.end method

.method public final getBigDecimal()Ljava/math/BigDecimal;
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    iget-byte v0, v1, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 10
    .line 11
    const/16 v4, 0x20

    .line 12
    .line 13
    const-wide/32 v5, 0x7fffffff

    .line 14
    .line 15
    .line 16
    const/4 v7, 0x4

    .line 17
    const-wide v8, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const/4 v10, 0x3

    .line 23
    const/4 v11, 0x0

    .line 24
    const/4 v12, 0x2

    .line 25
    const/4 v13, 0x1

    .line 26
    if-eq v0, v13, :cond_13

    .line 27
    .line 28
    if-eq v0, v12, :cond_8

    .line 29
    .line 30
    if-eq v0, v10, :cond_7

    .line 31
    .line 32
    if-eq v0, v7, :cond_5

    .line 33
    .line 34
    const/4 v2, 0x6

    .line 35
    const-string v3, "TODO : "

    .line 36
    .line 37
    if-eq v0, v2, :cond_2

    .line 38
    .line 39
    const/16 v2, 0x8

    .line 40
    .line 41
    if-ne v0, v2, :cond_1

    .line 42
    .line 43
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :cond_1
    iget-byte v0, v1, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 51
    .line 52
    invoke-static {v0, v3}, Lah/a;->y(ILjava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    return-object v0

    .line 57
    :cond_2
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 60
    .line 61
    const-string v2, "value"

    .line 62
    .line 63
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONObject;->getBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    if-nez v2, :cond_3

    .line 68
    .line 69
    const-string v2, "$numberDecimal"

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Lcom/alibaba/fastjson2/JSONObject;->getBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    :cond_3
    if-eqz v2, :cond_4

    .line 76
    .line 77
    return-object v2

    .line 78
    :cond_4
    iget-byte v0, v1, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 79
    .line 80
    invoke-static {v0, v3}, Lah/a;->y(ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const/4 v0, 0x0

    .line 84
    return-object v0

    .line 85
    :cond_5
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/JSONReader;->boolValue:Z

    .line 86
    .line 87
    if-eqz v0, :cond_6

    .line 88
    .line 89
    sget-object v0, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 90
    .line 91
    return-object v0

    .line 92
    :cond_6
    sget-object v0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 93
    .line 94
    return-object v0

    .line 95
    :cond_7
    :try_start_0
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 98
    .line 99
    .line 100
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 101
    return-object v0

    .line 102
    :catch_0
    move-exception v0

    .line 103
    new-instance v2, Ljava/lang/StringBuilder;

    .line 104
    .line 105
    const-string v3, "read decimal error, value "

    .line 106
    .line 107
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v3, v1, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 111
    .line 112
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    invoke-static {v2, v0}, Lah/a;->x(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    const/4 v0, 0x0

    .line 127
    return-object v0

    .line 128
    :cond_8
    iget-short v0, v1, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 129
    .line 130
    if-nez v0, :cond_c

    .line 131
    .line 132
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 133
    .line 134
    if-nez v0, :cond_c

    .line 135
    .line 136
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 137
    .line 138
    if-nez v0, :cond_c

    .line 139
    .line 140
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 141
    .line 142
    if-nez v0, :cond_a

    .line 143
    .line 144
    iget v14, v1, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 145
    .line 146
    if-ltz v14, :cond_a

    .line 147
    .line 148
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 149
    .line 150
    if-eqz v0, :cond_9

    .line 151
    .line 152
    neg-int v14, v14

    .line 153
    :cond_9
    int-to-long v4, v14

    .line 154
    iget-short v0, v1, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 155
    .line 156
    invoke-static {v4, v5, v0}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    goto :goto_0

    .line 161
    :cond_a
    iget v14, v1, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 162
    .line 163
    int-to-long v14, v14

    .line 164
    and-long/2addr v14, v8

    .line 165
    int-to-long v2, v0

    .line 166
    and-long/2addr v2, v8

    .line 167
    cmp-long v0, v2, v5

    .line 168
    .line 169
    if-gtz v0, :cond_c

    .line 170
    .line 171
    shl-long/2addr v2, v4

    .line 172
    add-long/2addr v2, v14

    .line 173
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 174
    .line 175
    if-eqz v0, :cond_b

    .line 176
    .line 177
    neg-long v2, v2

    .line 178
    :cond_b
    iget-short v0, v1, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 179
    .line 180
    invoke-static {v2, v3, v0}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    goto :goto_0

    .line 185
    :cond_c
    const/4 v2, 0x0

    .line 186
    :goto_0
    if-nez v2, :cond_11

    .line 187
    .line 188
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 189
    .line 190
    if-nez v0, :cond_f

    .line 191
    .line 192
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 193
    .line 194
    if-nez v0, :cond_e

    .line 195
    .line 196
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 197
    .line 198
    if-nez v0, :cond_d

    .line 199
    .line 200
    new-array v0, v13, [I

    .line 201
    .line 202
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 203
    .line 204
    aput v2, v0, v11

    .line 205
    .line 206
    goto :goto_2

    .line 207
    :cond_d
    new-array v2, v12, [I

    .line 208
    .line 209
    aput v0, v2, v11

    .line 210
    .line 211
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 212
    .line 213
    aput v0, v2, v13

    .line 214
    .line 215
    :goto_1
    move-object v0, v2

    .line 216
    goto :goto_2

    .line 217
    :cond_e
    new-array v2, v10, [I

    .line 218
    .line 219
    aput v0, v2, v11

    .line 220
    .line 221
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 222
    .line 223
    aput v0, v2, v13

    .line 224
    .line 225
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 226
    .line 227
    aput v0, v2, v12

    .line 228
    .line 229
    goto :goto_1

    .line 230
    :cond_f
    new-array v2, v7, [I

    .line 231
    .line 232
    aput v0, v2, v11

    .line 233
    .line 234
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 235
    .line 236
    aput v0, v2, v13

    .line 237
    .line 238
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 239
    .line 240
    aput v0, v2, v12

    .line 241
    .line 242
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 243
    .line 244
    aput v0, v2, v10

    .line 245
    .line 246
    goto :goto_1

    .line 247
    :goto_2
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 248
    .line 249
    if-eqz v2, :cond_10

    .line 250
    .line 251
    const/4 v3, -0x1

    .line 252
    goto :goto_3

    .line 253
    :cond_10
    move v3, v13

    .line 254
    :goto_3
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$BigIntegerCreator;->BIG_INTEGER_CREATOR:Ljava/util/function/BiFunction;

    .line 255
    .line 256
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v3

    .line 260
    invoke-interface {v2, v3, v0}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    check-cast v0, Ljava/math/BigInteger;

    .line 265
    .line 266
    new-instance v2, Ljava/math/BigDecimal;

    .line 267
    .line 268
    iget-short v3, v1, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 269
    .line 270
    invoke-direct {v2, v0, v3}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 271
    .line 272
    .line 273
    :cond_11
    iget-short v0, v1, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 274
    .line 275
    if-eqz v0, :cond_12

    .line 276
    .line 277
    new-instance v0, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    const-string v2, "E"

    .line 290
    .line 291
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    iget-short v2, v1, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 295
    .line 296
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 297
    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 304
    .line 305
    .line 306
    move-result-wide v2

    .line 307
    invoke-static {v2, v3}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(D)Ljava/math/BigDecimal;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    return-object v0

    .line 312
    :cond_12
    return-object v2

    .line 313
    :cond_13
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 314
    .line 315
    if-nez v0, :cond_15

    .line 316
    .line 317
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 318
    .line 319
    if-nez v2, :cond_15

    .line 320
    .line 321
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 322
    .line 323
    if-ltz v2, :cond_15

    .line 324
    .line 325
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 326
    .line 327
    if-eqz v0, :cond_14

    .line 328
    .line 329
    neg-int v0, v2

    .line 330
    int-to-long v2, v0

    .line 331
    goto :goto_4

    .line 332
    :cond_14
    int-to-long v2, v2

    .line 333
    :goto_4
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    return-object v0

    .line 338
    :cond_15
    iget v2, v1, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 339
    .line 340
    if-nez v2, :cond_19

    .line 341
    .line 342
    if-nez v0, :cond_18

    .line 343
    .line 344
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 345
    .line 346
    int-to-long v2, v0

    .line 347
    and-long/2addr v2, v8

    .line 348
    iget v7, v1, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 349
    .line 350
    int-to-long v14, v7

    .line 351
    and-long/2addr v8, v14

    .line 352
    cmp-long v5, v8, v5

    .line 353
    .line 354
    if-gtz v5, :cond_17

    .line 355
    .line 356
    shl-long v4, v8, v4

    .line 357
    .line 358
    add-long/2addr v4, v2

    .line 359
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 360
    .line 361
    if-eqz v0, :cond_16

    .line 362
    .line 363
    neg-long v4, v4

    .line 364
    :cond_16
    invoke-static {v4, v5}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    return-object v0

    .line 369
    :cond_17
    new-array v2, v12, [I

    .line 370
    .line 371
    aput v7, v2, v11

    .line 372
    .line 373
    aput v0, v2, v13

    .line 374
    .line 375
    goto :goto_5

    .line 376
    :cond_18
    new-array v2, v10, [I

    .line 377
    .line 378
    aput v0, v2, v11

    .line 379
    .line 380
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 381
    .line 382
    aput v0, v2, v13

    .line 383
    .line 384
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 385
    .line 386
    aput v0, v2, v12

    .line 387
    .line 388
    goto :goto_5

    .line 389
    :cond_19
    new-array v3, v7, [I

    .line 390
    .line 391
    aput v2, v3, v11

    .line 392
    .line 393
    aput v0, v3, v13

    .line 394
    .line 395
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 396
    .line 397
    aput v0, v3, v12

    .line 398
    .line 399
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 400
    .line 401
    aput v0, v3, v10

    .line 402
    .line 403
    move-object v2, v3

    .line 404
    :goto_5
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 405
    .line 406
    if-eqz v0, :cond_1a

    .line 407
    .line 408
    const/4 v3, -0x1

    .line 409
    goto :goto_6

    .line 410
    :cond_1a
    move v3, v13

    .line 411
    :goto_6
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$BigIntegerCreator;->BIG_INTEGER_CREATOR:Ljava/util/function/BiFunction;

    .line 412
    .line 413
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    invoke-interface {v0, v3, v2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    check-cast v0, Ljava/math/BigInteger;

    .line 422
    .line 423
    new-instance v2, Ljava/math/BigDecimal;

    .line 424
    .line 425
    invoke-direct {v2, v0}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;)V

    .line 426
    .line 427
    .line 428
    return-object v2
.end method

.method public final getBigInteger()Ljava/math/BigInteger;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    instance-of v1, v0, Ljava/math/BigInteger;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    check-cast v0, Ljava/math/BigInteger;

    .line 14
    .line 15
    return-object v0

    .line 16
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 17
    .line 18
    .line 19
    move-result-wide v0

    .line 20
    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0
.end method

.method public final getContext()Lcom/alibaba/fastjson2/JSONReader$Context;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getDoubleValue()D
    .locals 10

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x1

    .line 6
    const-wide/16 v4, 0x0

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    const-string v0, "TODO : "

    .line 12
    .line 13
    iget-byte v1, p0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 14
    .line 15
    invoke-static {v1, v0}, Lah/a;->y(ILjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    return-wide v0

    .line 21
    :pswitch_0
    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    .line 22
    .line 23
    return-wide v0

    .line 24
    :pswitch_1
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getBigDecimal()Ljava/math/BigDecimal;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-virtual {v0}, Ljava/math/BigDecimal;->doubleValue()D

    .line 29
    .line 30
    .line 31
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 32
    return-wide v0

    .line 33
    :catch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->numberError()Lcom/alibaba/fastjson2/JSONException;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    throw v0

    .line 38
    :pswitch_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, Ljava/util/Collection;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toDoubleValue(Ljava/lang/Object;)D

    .line 54
    .line 55
    .line 56
    move-result-wide v0

    .line 57
    return-wide v0

    .line 58
    :cond_1
    :goto_0
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 59
    .line 60
    return-wide v4

    .line 61
    :pswitch_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v0, Ljava/util/Map;

    .line 64
    .line 65
    if-eqz v0, :cond_3

    .line 66
    .line 67
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toDoubleValue(Ljava/lang/Object;)D

    .line 75
    .line 76
    .line 77
    move-result-wide v0

    .line 78
    return-wide v0

    .line 79
    :cond_3
    :goto_1
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 80
    .line 81
    return-wide v4

    .line 82
    :pswitch_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 83
    .line 84
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 85
    .line 86
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 87
    .line 88
    iget-wide v8, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 89
    .line 90
    and-long/2addr v6, v8

    .line 91
    cmp-long v0, v6, v1

    .line 92
    .line 93
    if-nez v0, :cond_4

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    const-string v0, "long value not support input null"

    .line 97
    .line 98
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-wide/16 v0, 0x0

    .line 106
    .line 107
    return-wide v0

    .line 108
    :pswitch_5
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->boolValue:Z

    .line 109
    .line 110
    if-eqz v0, :cond_5

    .line 111
    .line 112
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 113
    .line 114
    return-wide v0

    .line 115
    :cond_5
    :goto_2
    return-wide v4

    .line 116
    :pswitch_6
    :try_start_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 117
    .line 118
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->toDoubleValue(Ljava/lang/Object;)D

    .line 119
    .line 120
    .line 121
    move-result-wide v0
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 122
    return-wide v0

    .line 123
    :catch_1
    move-exception v0

    .line 124
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    const-wide/16 v0, 0x0

    .line 136
    .line 137
    return-wide v0

    .line 138
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 143
    .line 144
    .line 145
    move-result-wide v0

    .line 146
    return-wide v0

    .line 147
    :pswitch_8
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 148
    .line 149
    if-nez v0, :cond_7

    .line 150
    .line 151
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 152
    .line 153
    if-nez v0, :cond_7

    .line 154
    .line 155
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 156
    .line 157
    const/high16 v3, -0x80000000

    .line 158
    .line 159
    if-eq v0, v3, :cond_7

    .line 160
    .line 161
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 162
    .line 163
    if-eqz v1, :cond_6

    .line 164
    .line 165
    neg-int v0, v0

    .line 166
    int-to-double v0, v0

    .line 167
    return-wide v0

    .line 168
    :cond_6
    int-to-double v0, v0

    .line 169
    return-wide v0

    .line 170
    :cond_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    instance-of v3, v0, Ljava/math/BigInteger;

    .line 175
    .line 176
    if-eqz v3, :cond_9

    .line 177
    .line 178
    check-cast v0, Ljava/math/BigInteger;

    .line 179
    .line 180
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 181
    .line 182
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 183
    .line 184
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonErrorOnNumberOverflow:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 185
    .line 186
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 187
    .line 188
    and-long/2addr v3, v5

    .line 189
    cmp-long v1, v3, v1

    .line 190
    .line 191
    if-eqz v1, :cond_8

    .line 192
    .line 193
    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    .line 194
    .line 195
    .line 196
    move-result-wide v0

    .line 197
    long-to-double v0, v0

    .line 198
    return-wide v0

    .line 199
    :cond_8
    :try_start_2
    invoke-static {v0}, La1/c;->d(Ljava/math/BigInteger;)J

    .line 200
    .line 201
    .line 202
    move-result-wide v0
    :try_end_2
    .catch Ljava/lang/ArithmeticException; {:try_start_2 .. :try_end_2} :catch_2

    .line 203
    long-to-double v0, v0

    .line 204
    return-wide v0

    .line 205
    :catch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->numberError()Lcom/alibaba/fastjson2/JSONException;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    throw v0

    .line 210
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    .line 211
    .line 212
    .line 213
    move-result-wide v0

    .line 214
    return-wide v0

    .line 215
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_8
        :pswitch_8
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_0
    .end packed-switch
.end method

.method public abstract getFieldName()Ljava/lang/String;
.end method

.method public final getFloatValue()F
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getDoubleValue()D

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    double-to-float v0, v0

    .line 6
    return v0
.end method

.method public final getInt32Value()I
    .locals 10

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 2
    .line 3
    const-string v1, "integer overflow "

    .line 4
    .line 5
    const-wide/32 v2, 0x7fffffff

    .line 6
    .line 7
    .line 8
    const-wide/32 v4, -0x80000000

    .line 9
    .line 10
    .line 11
    const-wide/16 v6, 0x0

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    const-string v0, "TODO : "

    .line 17
    .line 18
    iget-byte v1, p0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 19
    .line 20
    invoke-static {v1, v0}, Lah/a;->y(ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    return v0

    .line 25
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v8

    .line 33
    cmp-long v0, v8, v4

    .line 34
    .line 35
    if-ltz v0, :cond_0

    .line 36
    .line 37
    cmp-long v0, v8, v2

    .line 38
    .line 39
    if-lez v0, :cond_1

    .line 40
    .line 41
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 42
    .line 43
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 44
    .line 45
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonErrorOnNumberOverflow:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 46
    .line 47
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 48
    .line 49
    and-long/2addr v2, v4

    .line 50
    cmp-long v0, v2, v6

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    :cond_1
    long-to-int v0, v8

    .line 55
    return v0

    .line 56
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 v0, 0x0

    .line 76
    return v0

    .line 77
    :pswitch_1
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getBigDecimal()Ljava/math/BigDecimal;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/math/BigDecimal;->intValueExact()I

    .line 82
    .line 83
    .line 84
    move-result v0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 85
    return v0

    .line 86
    :catch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->numberError()Lcom/alibaba/fastjson2/JSONException;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    throw v0

    .line 91
    :pswitch_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Ljava/util/List;

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->toInt(Ljava/util/List;)I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    return v0

    .line 100
    :pswitch_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v0, Ljava/util/Map;

    .line 103
    .line 104
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->toNumber(Ljava/util/Map;)Ljava/lang/Number;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    if-eqz v0, :cond_3

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    return v0

    .line 115
    :pswitch_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 116
    .line 117
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 118
    .line 119
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 120
    .line 121
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 122
    .line 123
    and-long/2addr v0, v2

    .line 124
    cmp-long v0, v0, v6

    .line 125
    .line 126
    if-nez v0, :cond_4

    .line 127
    .line 128
    :cond_3
    const/4 v0, 0x0

    .line 129
    return v0

    .line 130
    :cond_4
    const-string v0, "int value not support input null"

    .line 131
    .line 132
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const/4 v0, 0x0

    .line 140
    return v0

    .line 141
    :pswitch_5
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->boolValue:Z

    .line 142
    .line 143
    return v0

    .line 144
    :pswitch_6
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->toInt32(Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    return v0

    .line 151
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    return v0

    .line 160
    :pswitch_8
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 161
    .line 162
    if-nez v0, :cond_6

    .line 163
    .line 164
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 165
    .line 166
    if-nez v0, :cond_6

    .line 167
    .line 168
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 169
    .line 170
    const/high16 v8, -0x80000000

    .line 171
    .line 172
    if-eq v0, v8, :cond_6

    .line 173
    .line 174
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 175
    .line 176
    if-eqz v1, :cond_5

    .line 177
    .line 178
    neg-int v0, v0

    .line 179
    :cond_5
    return v0

    .line 180
    :cond_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    instance-of v8, v0, Ljava/lang/Long;

    .line 185
    .line 186
    if-eqz v8, :cond_8

    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 189
    .line 190
    .line 191
    move-result-wide v6

    .line 192
    cmp-long v0, v6, v4

    .line 193
    .line 194
    if-ltz v0, :cond_7

    .line 195
    .line 196
    cmp-long v0, v6, v2

    .line 197
    .line 198
    if-gtz v0, :cond_7

    .line 199
    .line 200
    long-to-int v0, v6

    .line 201
    return v0

    .line 202
    :cond_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 203
    .line 204
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    const/4 v0, 0x0

    .line 222
    return v0

    .line 223
    :cond_8
    instance-of v1, v0, Ljava/math/BigInteger;

    .line 224
    .line 225
    if-eqz v1, :cond_a

    .line 226
    .line 227
    check-cast v0, Ljava/math/BigInteger;

    .line 228
    .line 229
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 230
    .line 231
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 232
    .line 233
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonErrorOnNumberOverflow:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 234
    .line 235
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 236
    .line 237
    and-long/2addr v1, v3

    .line 238
    cmp-long v1, v1, v6

    .line 239
    .line 240
    if-eqz v1, :cond_9

    .line 241
    .line 242
    invoke-virtual {v0}, Ljava/math/BigInteger;->intValue()I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    return v0

    .line 247
    :cond_9
    :try_start_1
    invoke-static {v0}, La1/c;->c(Ljava/math/BigInteger;)I

    .line 248
    .line 249
    .line 250
    move-result v0
    :try_end_1
    .catch Ljava/lang/ArithmeticException; {:try_start_1 .. :try_end_1} :catch_1

    .line 251
    return v0

    .line 252
    :catch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->numberError()Lcom/alibaba/fastjson2/JSONException;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    throw v0

    .line 257
    :cond_a
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 258
    .line 259
    .line 260
    move-result v0

    .line 261
    return v0

    .line 262
    nop

    .line 263
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_8
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final getInt64Value()J
    .locals 7

    .line 1
    iget-byte v0, p0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const-string v0, "TODO : "

    .line 9
    .line 10
    iget-byte v1, p0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 11
    .line 12
    invoke-static {v1, v0}, Lah/a;->y(ILjava/lang/String;)V

    .line 13
    .line 14
    .line 15
    const-wide/16 v0, 0x0

    .line 16
    .line 17
    return-wide v0

    .line 18
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    return-wide v0

    .line 27
    :pswitch_1
    :try_start_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getBigDecimal()Ljava/math/BigDecimal;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/math/BigDecimal;->longValueExact()J

    .line 32
    .line 33
    .line 34
    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    return-wide v0

    .line 36
    :catch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->numberError()Lcom/alibaba/fastjson2/JSONException;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    throw v0

    .line 41
    :pswitch_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ljava/util/List;

    .line 44
    .line 45
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->toInt(Ljava/util/List;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    int-to-long v0, v0

    .line 50
    return-wide v0

    .line 51
    :pswitch_3
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, Ljava/util/Map;

    .line 54
    .line 55
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->toLong(Ljava/util/Map;)J

    .line 56
    .line 57
    .line 58
    move-result-wide v0

    .line 59
    return-wide v0

    .line 60
    :pswitch_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 61
    .line 62
    iget-wide v3, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 63
    .line 64
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNullForPrimitives:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 65
    .line 66
    iget-wide v5, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 67
    .line 68
    and-long/2addr v3, v5

    .line 69
    cmp-long v0, v3, v1

    .line 70
    .line 71
    if-nez v0, :cond_0

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_0
    const-string v0, "long value not support input null"

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    const-wide/16 v0, 0x0

    .line 84
    .line 85
    return-wide v0

    .line 86
    :pswitch_5
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->boolValue:Z

    .line 87
    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    const-wide/16 v0, 0x1

    .line 91
    .line 92
    return-wide v0

    .line 93
    :cond_1
    :goto_0
    return-wide v1

    .line 94
    :pswitch_6
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->toInt64(Ljava/lang/String;)J

    .line 97
    .line 98
    .line 99
    move-result-wide v0

    .line 100
    return-wide v0

    .line 101
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 106
    .line 107
    .line 108
    move-result-wide v0

    .line 109
    return-wide v0

    .line 110
    :pswitch_8
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 111
    .line 112
    if-nez v0, :cond_3

    .line 113
    .line 114
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 115
    .line 116
    if-nez v0, :cond_3

    .line 117
    .line 118
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 119
    .line 120
    const/high16 v3, -0x80000000

    .line 121
    .line 122
    if-eq v0, v3, :cond_3

    .line 123
    .line 124
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 125
    .line 126
    if-eqz v1, :cond_2

    .line 127
    .line 128
    neg-int v0, v0

    .line 129
    int-to-long v0, v0

    .line 130
    return-wide v0

    .line 131
    :cond_2
    int-to-long v0, v0

    .line 132
    return-wide v0

    .line 133
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    instance-of v3, v0, Ljava/math/BigInteger;

    .line 138
    .line 139
    if-eqz v3, :cond_5

    .line 140
    .line 141
    check-cast v0, Ljava/math/BigInteger;

    .line 142
    .line 143
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 144
    .line 145
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 146
    .line 147
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonErrorOnNumberOverflow:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 148
    .line 149
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 150
    .line 151
    and-long/2addr v3, v5

    .line 152
    cmp-long v1, v3, v1

    .line 153
    .line 154
    if-eqz v1, :cond_4

    .line 155
    .line 156
    invoke-virtual {v0}, Ljava/math/BigInteger;->longValue()J

    .line 157
    .line 158
    .line 159
    move-result-wide v0

    .line 160
    return-wide v0

    .line 161
    :cond_4
    :try_start_1
    invoke-static {v0}, La1/c;->d(Ljava/math/BigInteger;)J

    .line 162
    .line 163
    .line 164
    move-result-wide v0
    :try_end_1
    .catch Ljava/lang/ArithmeticException; {:try_start_1 .. :try_end_1} :catch_1

    .line 165
    return-wide v0

    .line 166
    :catch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->numberError()Lcom/alibaba/fastjson2/JSONException;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    throw v0

    .line 171
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 172
    .line 173
    .line 174
    move-result-wide v0

    .line 175
    return-wide v0

    .line 176
    nop

    .line 177
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_8
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final getLocale()Ljava/util/Locale;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getLocale()Ljava/util/Locale;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public abstract getNameHashCodeLCase()J
.end method

.method public final getNumber()Ljava/lang/Number;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    return-object v2

    .line 9
    :cond_0
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 10
    .line 11
    const-string v6, "shortValue overflow"

    .line 12
    .line 13
    const/4 v7, -0x1

    .line 14
    const/4 v8, 0x4

    .line 15
    const-string v9, "E"

    .line 16
    .line 17
    const-wide v10, 0xffffffffL

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    const/4 v12, 0x3

    .line 23
    const-wide/16 v13, 0x0

    .line 24
    .line 25
    const/4 v15, 0x2

    .line 26
    const/16 v16, 0x0

    .line 27
    .line 28
    move-object/from16 v17, v2

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    packed-switch v1, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    const-string v1, "TODO : "

    .line 35
    .line 36
    iget-byte v2, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 37
    .line 38
    invoke-static {v2, v1}, Lah/a;->y(ILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    return-object v1

    .line 43
    :pswitch_0
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 44
    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 48
    .line 49
    if-nez v1, :cond_2

    .line 50
    .line 51
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 52
    .line 53
    if-nez v1, :cond_1

    .line 54
    .line 55
    new-array v1, v2, [I

    .line 56
    .line 57
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 58
    .line 59
    aput v3, v1, v16

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_1
    new-array v3, v15, [I

    .line 63
    .line 64
    aput v1, v3, v16

    .line 65
    .line 66
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 67
    .line 68
    aput v1, v3, v2

    .line 69
    .line 70
    :goto_0
    move-object v1, v3

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    new-array v3, v12, [I

    .line 73
    .line 74
    aput v1, v3, v16

    .line 75
    .line 76
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 77
    .line 78
    aput v1, v3, v2

    .line 79
    .line 80
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 81
    .line 82
    aput v1, v3, v15

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_3
    new-array v3, v8, [I

    .line 86
    .line 87
    aput v1, v3, v16

    .line 88
    .line 89
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 90
    .line 91
    aput v1, v3, v2

    .line 92
    .line 93
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 94
    .line 95
    aput v1, v3, v15

    .line 96
    .line 97
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 98
    .line 99
    aput v1, v3, v12

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :goto_1
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 103
    .line 104
    if-eqz v3, :cond_4

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_4
    move v7, v2

    .line 108
    :goto_2
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$BigIntegerCreator;->BIG_INTEGER_CREATOR:Ljava/util/function/BiFunction;

    .line 109
    .line 110
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    invoke-interface {v2, v3, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    check-cast v1, Ljava/math/BigInteger;

    .line 119
    .line 120
    new-instance v2, Ljava/math/BigDecimal;

    .line 121
    .line 122
    iget-short v3, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 123
    .line 124
    invoke-direct {v2, v1, v3}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 125
    .line 126
    .line 127
    iget-byte v1, v0, Lcom/alibaba/fastjson2/JSONReader;->valueType:B

    .line 128
    .line 129
    iget-short v3, v0, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 130
    .line 131
    const/16 v4, 0xc

    .line 132
    .line 133
    if-ne v1, v4, :cond_6

    .line 134
    .line 135
    if-eqz v3, :cond_5

    .line 136
    .line 137
    new-instance v1, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    iget-short v2, v0, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 149
    .line 150
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    return-object v1

    .line 166
    :cond_5
    invoke-virtual {v2}, Ljava/math/BigDecimal;->floatValue()F

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    return-object v1

    .line 175
    :cond_6
    if-eqz v3, :cond_7

    .line 176
    .line 177
    new-instance v1, Ljava/lang/StringBuilder;

    .line 178
    .line 179
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    iget-short v2, v0, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 189
    .line 190
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 198
    .line 199
    .line 200
    move-result-wide v1

    .line 201
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    return-object v1

    .line 206
    :cond_7
    invoke-virtual {v2}, Ljava/math/BigDecimal;->doubleValue()D

    .line 207
    .line 208
    .line 209
    move-result-wide v1

    .line 210
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    return-object v1

    .line 215
    :pswitch_1
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 216
    .line 217
    if-nez v1, :cond_9

    .line 218
    .line 219
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 220
    .line 221
    if-nez v1, :cond_9

    .line 222
    .line 223
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 224
    .line 225
    if-nez v1, :cond_9

    .line 226
    .line 227
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 228
    .line 229
    if-ltz v1, :cond_9

    .line 230
    .line 231
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 232
    .line 233
    if-eqz v2, :cond_8

    .line 234
    .line 235
    neg-int v1, v1

    .line 236
    :cond_8
    int-to-short v1, v1

    .line 237
    invoke-static {v1}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    return-object v1

    .line 242
    :cond_9
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    const/4 v1, 0x0

    .line 250
    return-object v1

    .line 251
    :pswitch_2
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 252
    .line 253
    if-nez v1, :cond_b

    .line 254
    .line 255
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 256
    .line 257
    if-nez v1, :cond_b

    .line 258
    .line 259
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 260
    .line 261
    if-nez v1, :cond_b

    .line 262
    .line 263
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 264
    .line 265
    if-ltz v1, :cond_b

    .line 266
    .line 267
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 268
    .line 269
    if-eqz v2, :cond_a

    .line 270
    .line 271
    neg-int v1, v1

    .line 272
    :cond_a
    int-to-byte v1, v1

    .line 273
    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 274
    .line 275
    .line 276
    move-result-object v1

    .line 277
    return-object v1

    .line 278
    :cond_b
    invoke-virtual {v0, v6}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    const/4 v1, 0x0

    .line 286
    return-object v1

    .line 287
    :pswitch_3
    iget-short v1, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 288
    .line 289
    if-lez v1, :cond_d

    .line 290
    .line 291
    sget v2, Lcom/alibaba/fastjson2/JSONFactory;->defaultDecimalMaxScale:I

    .line 292
    .line 293
    if-gt v1, v2, :cond_c

    .line 294
    .line 295
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 296
    .line 297
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    return-object v1

    .line 302
    :cond_c
    const-string v1, "scale overflow : "

    .line 303
    .line 304
    iget-short v2, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 305
    .line 306
    invoke-static {v2, v1}, Lah/a;->y(ILjava/lang/String;)V

    .line 307
    .line 308
    .line 309
    const/4 v1, 0x0

    .line 310
    return-object v1

    .line 311
    :cond_d
    new-instance v1, Ljava/math/BigInteger;

    .line 312
    .line 313
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 314
    .line 315
    invoke-direct {v1, v2}, Ljava/math/BigInteger;-><init>(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    return-object v1

    .line 319
    :pswitch_4
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 320
    .line 321
    check-cast v1, Ljava/util/List;

    .line 322
    .line 323
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->toNumber(Ljava/util/List;)Ljava/lang/Number;

    .line 324
    .line 325
    .line 326
    move-result-object v1

    .line 327
    return-object v1

    .line 328
    :pswitch_5
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->complex:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast v1, Ljava/util/Map;

    .line 331
    .line 332
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->toNumber(Ljava/util/Map;)Ljava/lang/Number;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    return-object v1

    .line 337
    :pswitch_6
    return-object v17

    .line 338
    :pswitch_7
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->boolValue:Z

    .line 339
    .line 340
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    return-object v1

    .line 345
    :pswitch_8
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->stringValue:Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->toInt64(Ljava/lang/String;)J

    .line 348
    .line 349
    .line 350
    move-result-wide v1

    .line 351
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    return-object v1

    .line 356
    :pswitch_9
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 357
    .line 358
    if-nez v1, :cond_11

    .line 359
    .line 360
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 361
    .line 362
    if-nez v1, :cond_11

    .line 363
    .line 364
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 365
    .line 366
    if-nez v1, :cond_f

    .line 367
    .line 368
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 369
    .line 370
    if-ltz v6, :cond_f

    .line 371
    .line 372
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 373
    .line 374
    if-eqz v1, :cond_e

    .line 375
    .line 376
    neg-int v6, v6

    .line 377
    :cond_e
    int-to-long v3, v6

    .line 378
    iget-short v1, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 379
    .line 380
    invoke-static {v3, v4, v1}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 381
    .line 382
    .line 383
    move-result-object v1

    .line 384
    move/from16 v18, v2

    .line 385
    .line 386
    move-object v2, v1

    .line 387
    goto :goto_3

    .line 388
    :cond_f
    iget v6, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 389
    .line 390
    move/from16 v18, v2

    .line 391
    .line 392
    const/16 v19, 0x20

    .line 393
    .line 394
    int-to-long v2, v6

    .line 395
    and-long/2addr v2, v10

    .line 396
    const-wide/32 v20, 0x7fffffff

    .line 397
    .line 398
    .line 399
    int-to-long v4, v1

    .line 400
    and-long/2addr v4, v10

    .line 401
    cmp-long v1, v4, v20

    .line 402
    .line 403
    if-gtz v1, :cond_12

    .line 404
    .line 405
    shl-long v4, v4, v19

    .line 406
    .line 407
    add-long/2addr v4, v2

    .line 408
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 409
    .line 410
    if-eqz v1, :cond_10

    .line 411
    .line 412
    neg-long v4, v4

    .line 413
    :cond_10
    iget-short v1, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 414
    .line 415
    invoke-static {v4, v5, v1}, Ljava/math/BigDecimal;->valueOf(JI)Ljava/math/BigDecimal;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    goto :goto_3

    .line 420
    :cond_11
    move/from16 v18, v2

    .line 421
    .line 422
    :cond_12
    move-object/from16 v2, v17

    .line 423
    .line 424
    :goto_3
    if-nez v2, :cond_17

    .line 425
    .line 426
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 427
    .line 428
    if-nez v1, :cond_14

    .line 429
    .line 430
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 431
    .line 432
    if-nez v1, :cond_13

    .line 433
    .line 434
    new-array v1, v15, [I

    .line 435
    .line 436
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 437
    .line 438
    aput v2, v1, v16

    .line 439
    .line 440
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 441
    .line 442
    aput v2, v1, v18

    .line 443
    .line 444
    goto :goto_5

    .line 445
    :cond_13
    new-array v2, v12, [I

    .line 446
    .line 447
    aput v1, v2, v16

    .line 448
    .line 449
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 450
    .line 451
    aput v1, v2, v18

    .line 452
    .line 453
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 454
    .line 455
    aput v1, v2, v15

    .line 456
    .line 457
    :goto_4
    move-object v1, v2

    .line 458
    goto :goto_5

    .line 459
    :cond_14
    new-array v2, v8, [I

    .line 460
    .line 461
    aput v1, v2, v16

    .line 462
    .line 463
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 464
    .line 465
    aput v1, v2, v18

    .line 466
    .line 467
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 468
    .line 469
    aput v1, v2, v15

    .line 470
    .line 471
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 472
    .line 473
    aput v1, v2, v12

    .line 474
    .line 475
    goto :goto_4

    .line 476
    :goto_5
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 477
    .line 478
    if-eqz v2, :cond_15

    .line 479
    .line 480
    goto :goto_6

    .line 481
    :cond_15
    move/from16 v7, v18

    .line 482
    .line 483
    :goto_6
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$BigIntegerCreator;->BIG_INTEGER_CREATOR:Ljava/util/function/BiFunction;

    .line 484
    .line 485
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    invoke-interface {v2, v3, v1}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    check-cast v1, Ljava/math/BigInteger;

    .line 494
    .line 495
    iget-short v2, v0, Lcom/alibaba/fastjson2/JSONReader;->scale:S

    .line 496
    .line 497
    iget-short v3, v0, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 498
    .line 499
    sub-int/2addr v2, v3

    .line 500
    new-instance v3, Ljava/math/BigDecimal;

    .line 501
    .line 502
    invoke-direct {v3, v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/math/BigInteger;I)V

    .line 503
    .line 504
    .line 505
    iget-short v1, v0, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 506
    .line 507
    if-eqz v1, :cond_16

    .line 508
    .line 509
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 510
    .line 511
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 512
    .line 513
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForDoubles:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 514
    .line 515
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 516
    .line 517
    sget-object v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForFloats:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 518
    .line 519
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 520
    .line 521
    or-long/2addr v4, v6

    .line 522
    and-long/2addr v1, v4

    .line 523
    cmp-long v1, v1, v13

    .line 524
    .line 525
    if-nez v1, :cond_16

    .line 526
    .line 527
    invoke-virtual {v3}, Ljava/math/BigDecimal;->doubleValue()D

    .line 528
    .line 529
    .line 530
    move-result-wide v1

    .line 531
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    return-object v1

    .line 536
    :cond_16
    move-object v2, v3

    .line 537
    :cond_17
    iget-short v1, v0, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 538
    .line 539
    if-eqz v1, :cond_1a

    .line 540
    .line 541
    invoke-virtual {v2}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 546
    .line 547
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 548
    .line 549
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForDoubles:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 550
    .line 551
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 552
    .line 553
    sget-object v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigDecimalForFloats:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 554
    .line 555
    iget-wide v7, v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 556
    .line 557
    or-long/2addr v5, v7

    .line 558
    and-long/2addr v3, v5

    .line 559
    cmp-long v3, v3, v13

    .line 560
    .line 561
    if-nez v3, :cond_18

    .line 562
    .line 563
    invoke-static {v1, v9}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 564
    .line 565
    .line 566
    move-result-object v1

    .line 567
    iget-short v2, v0, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 568
    .line 569
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    invoke-static {v1}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    .line 577
    .line 578
    .line 579
    move-result-wide v1

    .line 580
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    return-object v1

    .line 585
    :cond_18
    invoke-virtual {v2}, Ljava/math/BigDecimal;->signum()I

    .line 586
    .line 587
    .line 588
    move-result v2

    .line 589
    if-nez v2, :cond_19

    .line 590
    .line 591
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 592
    .line 593
    return-object v1

    .line 594
    :cond_19
    new-instance v2, Ljava/math/BigDecimal;

    .line 595
    .line 596
    invoke-static {v1, v9}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 597
    .line 598
    .line 599
    move-result-object v1

    .line 600
    iget-short v3, v0, Lcom/alibaba/fastjson2/JSONReader;->exponent:S

    .line 601
    .line 602
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 603
    .line 604
    .line 605
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v1

    .line 609
    invoke-direct {v2, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    return-object v2

    .line 613
    :cond_1a
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 614
    .line 615
    iget-wide v3, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 616
    .line 617
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseDoubleForDecimals:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 618
    .line 619
    iget-wide v5, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 620
    .line 621
    and-long/2addr v3, v5

    .line 622
    cmp-long v1, v3, v13

    .line 623
    .line 624
    if-eqz v1, :cond_1b

    .line 625
    .line 626
    invoke-virtual {v2}, Ljava/math/BigDecimal;->doubleValue()D

    .line 627
    .line 628
    .line 629
    move-result-wide v1

    .line 630
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    return-object v1

    .line 635
    :cond_1b
    return-object v2

    .line 636
    :pswitch_a
    move/from16 v18, v2

    .line 637
    .line 638
    const/16 v19, 0x20

    .line 639
    .line 640
    const-wide/32 v20, 0x7fffffff

    .line 641
    .line 642
    .line 643
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag0:I

    .line 644
    .line 645
    if-nez v2, :cond_24

    .line 646
    .line 647
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 648
    .line 649
    if-nez v3, :cond_24

    .line 650
    .line 651
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 652
    .line 653
    if-nez v3, :cond_24

    .line 654
    .line 655
    iget v3, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 656
    .line 657
    const/high16 v4, -0x80000000

    .line 658
    .line 659
    if-eq v3, v4, :cond_24

    .line 660
    .line 661
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 662
    .line 663
    if-eqz v2, :cond_1e

    .line 664
    .line 665
    if-gez v3, :cond_1d

    .line 666
    .line 667
    int-to-long v1, v3

    .line 668
    and-long/2addr v1, v10

    .line 669
    neg-long v1, v1

    .line 670
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 671
    .line 672
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 673
    .line 674
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigIntegerForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 675
    .line 676
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 677
    .line 678
    and-long/2addr v3, v5

    .line 679
    cmp-long v3, v3, v13

    .line 680
    .line 681
    if-eqz v3, :cond_1c

    .line 682
    .line 683
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 684
    .line 685
    .line 686
    move-result-object v1

    .line 687
    return-object v1

    .line 688
    :cond_1c
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    return-object v1

    .line 693
    :cond_1d
    neg-int v3, v3

    .line 694
    goto :goto_7

    .line 695
    :cond_1e
    if-gez v3, :cond_20

    .line 696
    .line 697
    int-to-long v1, v3

    .line 698
    and-long/2addr v1, v10

    .line 699
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 700
    .line 701
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 702
    .line 703
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigIntegerForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 704
    .line 705
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 706
    .line 707
    and-long/2addr v3, v5

    .line 708
    cmp-long v3, v3, v13

    .line 709
    .line 710
    if-eqz v3, :cond_1f

    .line 711
    .line 712
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    return-object v1

    .line 717
    :cond_1f
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    return-object v1

    .line 722
    :cond_20
    :goto_7
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 723
    .line 724
    iget-wide v4, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 725
    .line 726
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigIntegerForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 727
    .line 728
    iget-wide v6, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 729
    .line 730
    and-long/2addr v6, v4

    .line 731
    cmp-long v2, v6, v13

    .line 732
    .line 733
    if-eqz v2, :cond_21

    .line 734
    .line 735
    int-to-long v1, v3

    .line 736
    invoke-static {v1, v2}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 737
    .line 738
    .line 739
    move-result-object v1

    .line 740
    return-object v1

    .line 741
    :cond_21
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseLongForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 742
    .line 743
    iget-wide v6, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 744
    .line 745
    and-long/2addr v4, v6

    .line 746
    cmp-long v2, v4, v13

    .line 747
    .line 748
    if-eqz v2, :cond_22

    .line 749
    .line 750
    int-to-long v1, v3

    .line 751
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    return-object v1

    .line 756
    :cond_22
    const/16 v2, 0xb

    .line 757
    .line 758
    if-ne v1, v2, :cond_23

    .line 759
    .line 760
    int-to-long v1, v3

    .line 761
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 762
    .line 763
    .line 764
    move-result-object v1

    .line 765
    return-object v1

    .line 766
    :cond_23
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    return-object v1

    .line 771
    :cond_24
    if-nez v2, :cond_29

    .line 772
    .line 773
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 774
    .line 775
    if-nez v1, :cond_28

    .line 776
    .line 777
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 778
    .line 779
    int-to-long v2, v1

    .line 780
    and-long/2addr v2, v10

    .line 781
    iget v4, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 782
    .line 783
    int-to-long v5, v4

    .line 784
    and-long/2addr v5, v10

    .line 785
    cmp-long v8, v5, v20

    .line 786
    .line 787
    if-gtz v8, :cond_27

    .line 788
    .line 789
    shl-long v4, v5, v19

    .line 790
    .line 791
    add-long/2addr v4, v2

    .line 792
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 793
    .line 794
    if-eqz v1, :cond_25

    .line 795
    .line 796
    neg-long v4, v4

    .line 797
    :cond_25
    iget-object v1, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 798
    .line 799
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 800
    .line 801
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseBigIntegerForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 802
    .line 803
    iget-wide v6, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 804
    .line 805
    and-long/2addr v1, v6

    .line 806
    cmp-long v1, v1, v13

    .line 807
    .line 808
    if-eqz v1, :cond_26

    .line 809
    .line 810
    invoke-static {v4, v5}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    .line 811
    .line 812
    .line 813
    move-result-object v1

    .line 814
    return-object v1

    .line 815
    :cond_26
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 816
    .line 817
    .line 818
    move-result-object v1

    .line 819
    return-object v1

    .line 820
    :cond_27
    new-array v2, v15, [I

    .line 821
    .line 822
    aput v4, v2, v16

    .line 823
    .line 824
    aput v1, v2, v18

    .line 825
    .line 826
    goto :goto_8

    .line 827
    :cond_28
    new-array v2, v12, [I

    .line 828
    .line 829
    aput v1, v2, v16

    .line 830
    .line 831
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 832
    .line 833
    aput v1, v2, v18

    .line 834
    .line 835
    iget v1, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 836
    .line 837
    aput v1, v2, v15

    .line 838
    .line 839
    goto :goto_8

    .line 840
    :cond_29
    new-array v1, v8, [I

    .line 841
    .line 842
    aput v2, v1, v16

    .line 843
    .line 844
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag1:I

    .line 845
    .line 846
    aput v2, v1, v18

    .line 847
    .line 848
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag2:I

    .line 849
    .line 850
    aput v2, v1, v15

    .line 851
    .line 852
    iget v2, v0, Lcom/alibaba/fastjson2/JSONReader;->mag3:I

    .line 853
    .line 854
    aput v2, v1, v12

    .line 855
    .line 856
    move-object v2, v1

    .line 857
    :goto_8
    iget-boolean v1, v0, Lcom/alibaba/fastjson2/JSONReader;->negative:Z

    .line 858
    .line 859
    if-eqz v1, :cond_2a

    .line 860
    .line 861
    goto :goto_9

    .line 862
    :cond_2a
    move/from16 v7, v18

    .line 863
    .line 864
    :goto_9
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$BigIntegerCreator;->BIG_INTEGER_CREATOR:Ljava/util/function/BiFunction;

    .line 865
    .line 866
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 867
    .line 868
    .line 869
    move-result-object v3

    .line 870
    invoke-interface {v1, v3, v2}, Ljava/util/function/BiFunction;->apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 871
    .line 872
    .line 873
    move-result-object v1

    .line 874
    check-cast v1, Ljava/math/BigInteger;

    .line 875
    .line 876
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 877
    .line 878
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 879
    .line 880
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseLongForInts:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 881
    .line 882
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 883
    .line 884
    and-long/2addr v2, v4

    .line 885
    cmp-long v2, v2, v13

    .line 886
    .line 887
    if-eqz v2, :cond_2b

    .line 888
    .line 889
    invoke-virtual {v1}, Ljava/math/BigInteger;->longValue()J

    .line 890
    .line 891
    .line 892
    move-result-wide v1

    .line 893
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 894
    .line 895
    .line 896
    move-result-object v1

    .line 897
    :cond_2b
    return-object v1

    .line 898
    nop

    .line 899
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_a
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 4
    .line 5
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 6
    .line 7
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v1, v3

    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    cmp-long v1, v1, v3

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v1, 0x0

    .line 19
    :goto_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 20
    .line 21
    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1
.end method

.method public getObjectReaderAutoType(JLjava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    return-object p1

    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 15
    .line 16
    iget-object p2, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 17
    .line 18
    if-eqz p2, :cond_2

    .line 19
    .line 20
    invoke-interface {p2, p1, p3, p4, p5}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-eqz p2, :cond_2

    .line 25
    .line 26
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 27
    .line 28
    iget-wide v0, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 29
    .line 30
    and-long p3, p4, v0

    .line 31
    .line 32
    const-wide/16 v0, 0x0

    .line 33
    .line 34
    cmp-long p1, p3, v0

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    const/4 p1, 0x1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 p1, 0x0

    .line 41
    :goto_0
    iget-object p3, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 42
    .line 43
    iget-object p3, p3, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 44
    .line 45
    invoke-virtual {p3, p2, p1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :cond_2
    iget-object p2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 51
    .line 52
    iget-object v0, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    .line 53
    .line 54
    iget-wide v1, p2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 55
    .line 56
    or-long/2addr p4, v1

    .line 57
    invoke-virtual {v0, p1, p3, p4, p5}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    return-object p1
.end method

.method public final getOffset()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 2
    .line 3
    return v0
.end method

.method public abstract getRawInt()I
.end method

.method public abstract getRawLong()J
.end method

.method public abstract getString()Ljava/lang/String;
.end method

.method public abstract getStringLength()I
.end method

.method public getType()B
    .locals 1

    .line 1
    const/16 v0, -0x80

    .line 2
    .line 3
    return v0
.end method

.method public final getZoneId()Ljava/time/ZoneId;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public final handleResolveTasks(Ljava/lang/Object;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto/16 :goto_6

    .line 6
    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    const/4 v1, 0x0

    .line 9
    move v2, v0

    .line 10
    :goto_0
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v3

    .line 16
    if-ge v2, v3, :cond_f

    .line 17
    .line 18
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReader;->resolveTasks:Ljava/util/List;

    .line 19
    .line 20
    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lcom/alibaba/fastjson2/JSONReader$ResolveTask;

    .line 25
    .line 26
    iget-object v4, v3, Lcom/alibaba/fastjson2/JSONReader$ResolveTask;->reference:Lcom/alibaba/fastjson2/JSONPath;

    .line 27
    .line 28
    iget-object v5, v3, Lcom/alibaba/fastjson2/JSONReader$ResolveTask;->fieldReader:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 29
    .line 30
    iget-boolean v6, v4, Lcom/alibaba/fastjson2/JSONPath;->previous:Z

    .line 31
    .line 32
    if-eqz v6, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 36
    .line 37
    iput-object v1, v4, Lcom/alibaba/fastjson2/JSONPath;->readerContext:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 38
    .line 39
    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 40
    .line 41
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 42
    .line 43
    iget-wide v8, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 44
    .line 45
    and-long/2addr v6, v8

    .line 46
    const-wide/16 v8, 0x0

    .line 47
    .line 48
    cmp-long v1, v6, v8

    .line 49
    .line 50
    if-eqz v1, :cond_2

    .line 51
    .line 52
    invoke-static {}, Lcom/alibaba/fastjson2/JSONFactory;->createWriteContext()Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-wide v6, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 57
    .line 58
    sget-object v8, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 59
    .line 60
    iget-wide v8, v8, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 61
    .line 62
    or-long/2addr v6, v8

    .line 63
    iput-wide v6, v1, Lcom/alibaba/fastjson2/JSONWriter$Context;->features:J

    .line 64
    .line 65
    iput-object v1, v4, Lcom/alibaba/fastjson2/JSONPath;->writerContext:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 66
    .line 67
    :cond_2
    invoke-virtual {v4, p1}, Lcom/alibaba/fastjson2/JSONPath;->eval(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    :goto_1
    iget-object v4, v3, Lcom/alibaba/fastjson2/JSONReader$ResolveTask;->name:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v3, v3, Lcom/alibaba/fastjson2/JSONReader$ResolveTask;->object:Ljava/lang/Object;

    .line 74
    .line 75
    if-eqz v4, :cond_d

    .line 76
    .line 77
    instance-of v6, v3, Ljava/util/Map;

    .line 78
    .line 79
    if-eqz v6, :cond_8

    .line 80
    .line 81
    check-cast v3, Ljava/util/Map;

    .line 82
    .line 83
    instance-of v5, v4, Lcom/alibaba/fastjson2/util/ReferenceKey;

    .line 84
    .line 85
    if-eqz v5, :cond_7

    .line 86
    .line 87
    instance-of v5, v3, Ljava/util/LinkedHashMap;

    .line 88
    .line 89
    if-eqz v5, :cond_6

    .line 90
    .line 91
    invoke-interface {v3}, Ljava/util/Map;->size()I

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-nez v5, :cond_3

    .line 96
    .line 97
    goto/16 :goto_5

    .line 98
    .line 99
    :cond_3
    new-array v6, v5, [Ljava/lang/Object;

    .line 100
    .line 101
    new-array v7, v5, [Ljava/lang/Object;

    .line 102
    .line 103
    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v8

    .line 111
    move v9, v0

    .line 112
    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v10

    .line 116
    if-eqz v10, :cond_5

    .line 117
    .line 118
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    check-cast v10, Ljava/util/Map$Entry;

    .line 123
    .line 124
    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v11

    .line 128
    if-ne v4, v11, :cond_4

    .line 129
    .line 130
    aput-object v1, v6, v9

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_4
    aput-object v11, v6, v9

    .line 134
    .line 135
    :goto_3
    add-int/lit8 v11, v9, 0x1

    .line 136
    .line 137
    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v10

    .line 141
    aput-object v10, v7, v9

    .line 142
    .line 143
    move v9, v11

    .line 144
    goto :goto_2

    .line 145
    :cond_5
    invoke-interface {v3}, Ljava/util/Map;->clear()V

    .line 146
    .line 147
    .line 148
    move v4, v0

    .line 149
    :goto_4
    if-ge v4, v5, :cond_e

    .line 150
    .line 151
    aget-object v8, v6, v4

    .line 152
    .line 153
    aget-object v9, v7, v4

    .line 154
    .line 155
    invoke-interface {v3, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    add-int/lit8 v4, v4, 0x1

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_6
    invoke-interface {v3, v4}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    invoke-interface {v3, v1, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_7
    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    goto :goto_5

    .line 173
    :cond_8
    instance-of v6, v4, Ljava/lang/Integer;

    .line 174
    .line 175
    if-eqz v6, :cond_d

    .line 176
    .line 177
    instance-of v6, v3, Ljava/util/List;

    .line 178
    .line 179
    if-eqz v6, :cond_b

    .line 180
    .line 181
    check-cast v4, Ljava/lang/Integer;

    .line 182
    .line 183
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    check-cast v3, Ljava/util/List;

    .line 188
    .line 189
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-ne v4, v5, :cond_9

    .line 194
    .line 195
    invoke-interface {v3, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    goto :goto_5

    .line 199
    :cond_9
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 200
    .line 201
    .line 202
    move-result v5

    .line 203
    if-ge v4, v5, :cond_a

    .line 204
    .line 205
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v5

    .line 209
    if-nez v5, :cond_a

    .line 210
    .line 211
    invoke-interface {v3, v4, v1}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    goto :goto_5

    .line 215
    :cond_a
    invoke-interface {v3, v4, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    goto :goto_5

    .line 219
    :cond_b
    instance-of v6, v3, [Ljava/lang/Object;

    .line 220
    .line 221
    if-eqz v6, :cond_c

    .line 222
    .line 223
    check-cast v4, Ljava/lang/Integer;

    .line 224
    .line 225
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 226
    .line 227
    .line 228
    move-result v4

    .line 229
    check-cast v3, [Ljava/lang/Object;

    .line 230
    .line 231
    aput-object v1, v3, v4

    .line 232
    .line 233
    goto :goto_5

    .line 234
    :cond_c
    instance-of v4, v3, Ljava/util/Collection;

    .line 235
    .line 236
    if-eqz v4, :cond_d

    .line 237
    .line 238
    check-cast v3, Ljava/util/Collection;

    .line 239
    .line 240
    invoke-interface {v3, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_d
    invoke-virtual {v5, v3, v1}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_e
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 248
    .line 249
    goto/16 :goto_0

    .line 250
    .line 251
    :cond_f
    :goto_6
    return-void
.end method

.method public final hasComma()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 2
    .line 3
    return v0
.end method

.method public final info()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    .line 43
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public info(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    if-eqz p1, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const-string v0, ", offset "

    .line 11
    .line 12
    invoke-static {p1, v0}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    return-object p1

    .line 26
    :cond_1
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v0, "offset "

    .line 29
    .line 30
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 34
    .line 35
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method public abstract isArray()Z
.end method

.method public isBinary()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public isDate()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public final isEnabled(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 4
    .line 5
    iget-wide v2, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 6
    .line 7
    and-long/2addr v0, v2

    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    cmp-long p1, v0, v2

    .line 11
    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    return p1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
.end method

.method public isEnd()Z
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x1a

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final isInitStringFieldAsEmpty()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 4
    .line 5
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 6
    .line 7
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0
.end method

.method public isInt()Z
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x2d

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x2b

    .line 8
    .line 9
    if-eq v0, v1, :cond_1

    .line 10
    .line 11
    const/16 v1, 0x30

    .line 12
    .line 13
    if-lt v0, v1, :cond_0

    .line 14
    .line 15
    const/16 v1, 0x39

    .line 16
    .line 17
    if-gt v0, v1, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0

    .line 22
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 23
    return v0
.end method

.method public final isJSONB()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 2
    .line 3
    return v0
.end method

.method public abstract isNull()Z
.end method

.method public isNumber()Z
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x2b

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x2d

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    return v0

    .line 16
    :cond_0
    :pswitch_0
    const/4 v0, 0x1

    .line 17
    return v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public isObject()Z
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x7b

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public abstract isReference()Z
.end method

.method public isString()Z
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public final isSupportAutoType(J)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 4
    .line 5
    or-long/2addr p1, v0

    .line 6
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 7
    .line 8
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 9
    .line 10
    and-long/2addr p1, v0

    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    cmp-long p1, p1, v0

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final isSupportAutoTypeOrHandler(J)Z
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    iget-wide v1, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 4
    .line 5
    or-long/2addr p1, v1

    .line 6
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 7
    .line 8
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 9
    .line 10
    and-long/2addr p1, v1

    .line 11
    const-wide/16 v1, 0x0

    .line 12
    .line 13
    cmp-long p1, p1, v1

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iget-object p1, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 18
    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    return p1

    .line 24
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 25
    return p1
.end method

.method public final isSupportBeanArray()Z
    .locals 4

    .line 21
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isSupportBeanArray(J)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 4
    .line 5
    or-long/2addr p1, v0

    .line 6
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 7
    .line 8
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 9
    .line 10
    and-long/2addr p1, v0

    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    cmp-long p1, p1, v0

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final isSupportSmartMatch()Z
    .locals 4

    .line 21
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final isSupportSmartMatch(J)Z
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 2
    .line 3
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 4
    .line 5
    or-long/2addr p1, v0

    .line 6
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 7
    .line 8
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 9
    .line 10
    and-long/2addr p1, v0

    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    cmp-long p1, p1, v0

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    const/4 p1, 0x0

    .line 20
    return p1
.end method

.method public final isTypeRedirect()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->typeRedirect:Z

    .line 2
    .line 3
    return v0
.end method

.method public mark()Lcom/alibaba/fastjson2/JSONReader$SavePoint;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONReader$SavePoint;

    .line 2
    .line 3
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONReader$SavePoint;-><init>(II)V

    .line 8
    .line 9
    .line 10
    return-object v0
.end method

.method public abstract next()V
.end method

.method public abstract nextIfArrayEnd()Z
.end method

.method public abstract nextIfArrayStart()Z
.end method

.method public abstract nextIfComma()Z
.end method

.method public abstract nextIfInfinity()Z
.end method

.method public nextIfMatch(B)Z
    .locals 1

    .line 1
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v0, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public abstract nextIfMatch(C)Z
.end method

.method public abstract nextIfMatchIdent(CCC)Z
.end method

.method public abstract nextIfMatchIdent(CCCC)Z
.end method

.method public abstract nextIfMatchIdent(CCCCC)Z
.end method

.method public abstract nextIfMatchIdent(CCCCCC)Z
.end method

.method public nextIfMatchTypedAny()Z
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "UnsupportedOperation"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public abstract nextIfName4Match10(J)Z
.end method

.method public abstract nextIfName4Match11(J)Z
.end method

.method public abstract nextIfName4Match12(JB)Z
.end method

.method public abstract nextIfName4Match13(JI)Z
.end method

.method public nextIfName4Match14(JI)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public nextIfName4Match15(JI)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public abstract nextIfName4Match16(JIB)Z
.end method

.method public abstract nextIfName4Match17(JJ)Z
.end method

.method public abstract nextIfName4Match18(JJ)Z
.end method

.method public nextIfName4Match19(JJ)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public abstract nextIfName4Match2()Z
.end method

.method public abstract nextIfName4Match20(JJB)Z
.end method

.method public nextIfName4Match21(JJI)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public abstract nextIfName4Match22(JJI)Z
.end method

.method public abstract nextIfName4Match23(JJI)Z
.end method

.method public abstract nextIfName4Match24(JJIB)Z
.end method

.method public abstract nextIfName4Match25(JJJ)Z
.end method

.method public abstract nextIfName4Match26(JJJ)Z
.end method

.method public abstract nextIfName4Match27(JJJ)Z
.end method

.method public abstract nextIfName4Match28(JJJB)Z
.end method

.method public abstract nextIfName4Match29(JJJI)Z
.end method

.method public abstract nextIfName4Match3()Z
.end method

.method public abstract nextIfName4Match30(JJJI)Z
.end method

.method public abstract nextIfName4Match31(JJJI)Z
.end method

.method public abstract nextIfName4Match32(JJJIB)Z
.end method

.method public abstract nextIfName4Match33(JJJJ)Z
.end method

.method public abstract nextIfName4Match34(JJJJ)Z
.end method

.method public abstract nextIfName4Match35(JJJJ)Z
.end method

.method public abstract nextIfName4Match36(JJJJB)Z
.end method

.method public abstract nextIfName4Match37(JJJJI)Z
.end method

.method public abstract nextIfName4Match38(JJJJI)Z
.end method

.method public abstract nextIfName4Match39(JJJJI)Z
.end method

.method public abstract nextIfName4Match4(B)Z
.end method

.method public abstract nextIfName4Match40(JJJJIB)Z
.end method

.method public abstract nextIfName4Match41(JJJJJ)Z
.end method

.method public abstract nextIfName4Match42(JJJJJ)Z
.end method

.method public abstract nextIfName4Match43(JJJJJ)Z
.end method

.method public abstract nextIfName4Match5(I)Z
.end method

.method public abstract nextIfName4Match6(I)Z
.end method

.method public abstract nextIfName4Match7(I)Z
.end method

.method public abstract nextIfName4Match8(IB)Z
.end method

.method public abstract nextIfName4Match9(J)Z
.end method

.method public nextIfName8Match0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public nextIfName8Match1()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public nextIfName8Match2()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public abstract nextIfNull()Z
.end method

.method public abstract nextIfNullOrEmptyString()Z
.end method

.method public abstract nextIfObjectEnd()Z
.end method

.method public abstract nextIfObjectStart()Z
.end method

.method public abstract nextIfSet()Z
.end method

.method public nextIfValue4Match10(J)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public nextIfValue4Match11(J)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public nextIfValue4Match2()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public nextIfValue4Match3()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    return v0
.end method

.method public nextIfValue4Match4(B)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public nextIfValue4Match5(BB)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public nextIfValue4Match6(I)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public nextIfValue4Match7(I)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public nextIfValue4Match8(IB)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public nextIfValue4Match9(IBB)Z
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    return p1
.end method

.method public nextWithoutComment()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final notSupportName()Lcom/alibaba/fastjson2/JSONException;
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "not support unquoted name"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public numberError()Lcom/alibaba/fastjson2/JSONException;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "illegal number, offset "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, ", char "

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method

.method public read(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 454
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget-wide v1, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 455
    :goto_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p0

    .line 456
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public read(Ljava/lang/reflect/Type;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/reflect/Type;",
            ")TT;"
        }
    .end annotation

    .line 427
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget-wide v1, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    .line 428
    :goto_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v2

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v4, 0x0

    move-object v3, p0

    .line 429
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final read(Ljava/util/Collection;)V
    .locals 2

    .line 416
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 417
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 418
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    if-ge v0, v1, :cond_1

    .line 419
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 420
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 421
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    return-void

    .line 422
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readAny()Ljava/lang/Object;

    move-result-object v0

    .line 423
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 424
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    goto :goto_0

    .line 425
    :cond_1
    const-string p1, "level too large : "

    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    invoke-static {v0, p1}, Lah/a;->y(ILjava/lang/String;)V

    return-void

    .line 426
    :cond_2
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const-string v1, "illegal input, offset "

    invoke-static {p1, v0, v1}, Lah/a;->e(IILjava/lang/String;)V

    return-void
.end method

.method public final read(Ljava/util/List;)V
    .locals 6

    .line 405
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 406
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 407
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    if-ge v0, v1, :cond_1

    .line 408
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 409
    iget p1, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 410
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    return-void

    .line 411
    :cond_0
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    move-object v1, p0

    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    .line 412
    invoke-interface {p1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 413
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    goto :goto_0

    :cond_1
    move-object v1, p0

    .line 414
    const-string p1, "level too large : "

    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->level:I

    invoke-static {v0, p1}, Lah/a;->y(ILjava/lang/String;)V

    return-void

    :cond_2
    move-object v1, p0

    .line 415
    iget p1, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    iget-char v0, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const-string v2, "illegal input, offset "

    invoke-static {p1, v0, v2}, Lah/a;->e(IILjava/lang/String;)V

    return-void
.end method

.method public read(Ljava/util/Map;J)V
    .locals 15

    .line 1
    move-object/from16 v6, p1

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v7, 0x0

    .line 8
    if-nez v0, :cond_2

    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isTypeRedirect()Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/JSONReader;->setTypeRedirect(Z)V

    .line 17
    .line 18
    .line 19
    move v8, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    return-void

    .line 38
    :cond_1
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 39
    .line 40
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 41
    .line 42
    const-string v3, "illegal input\uff0c offset "

    .line 43
    .line 44
    invoke-static {v0, v2, v3}, Lah/a;->e(IILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :cond_2
    move v8, v7

    .line 49
    :goto_0
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 50
    .line 51
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 52
    .line 53
    or-long v9, p2, v2

    .line 54
    .line 55
    move v11, v7

    .line 56
    :goto_1
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 57
    .line 58
    const/16 v3, 0x2f

    .line 59
    .line 60
    if-ne v2, v3, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipComment()V

    .line 63
    .line 64
    .line 65
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_4

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_4
    if-eqz v11, :cond_6

    .line 76
    .line 77
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 78
    .line 79
    if-eqz v2, :cond_5

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_6
    :goto_2
    if-nez v0, :cond_8

    .line 91
    .line 92
    if-eqz v8, :cond_7

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getFieldName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const/4 v2, 0x1

    .line 100
    move v12, v2

    .line 101
    goto :goto_5

    .line 102
    :cond_8
    :goto_3
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 103
    .line 104
    const/16 v3, 0x30

    .line 105
    .line 106
    if-lt v2, v3, :cond_9

    .line 107
    .line 108
    const/16 v3, 0x39

    .line 109
    .line 110
    if-le v2, v3, :cond_a

    .line 111
    .line 112
    :cond_9
    const/16 v3, 0x2d

    .line 113
    .line 114
    if-ne v2, v3, :cond_b

    .line 115
    .line 116
    :cond_a
    const/4 v2, 0x0

    .line 117
    :goto_4
    move v12, v0

    .line 118
    move-object v0, v2

    .line 119
    goto :goto_5

    .line 120
    :cond_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readFieldName()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    goto :goto_4

    .line 125
    :goto_5
    const-wide/16 v13, 0x0

    .line 126
    .line 127
    if-nez v0, :cond_f

    .line 128
    .line 129
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isNumber()Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-eqz v0, :cond_e

    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNumber()Ljava/lang/Number;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->NonStringKeyAsString:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 140
    .line 141
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 142
    .line 143
    and-long/2addr v2, v9

    .line 144
    cmp-long v2, v2, v13

    .line 145
    .line 146
    if-eqz v2, :cond_c

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    :cond_c
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 153
    .line 154
    if-nez v2, :cond_d

    .line 155
    .line 156
    goto :goto_6

    .line 157
    :cond_d
    const-string v0, "syntax error, illegal key-value"

    .line 158
    .line 159
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    return-void

    .line 167
    :cond_e
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->AllowUnQuotedFieldNames:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 168
    .line 169
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 170
    .line 171
    and-long/2addr v2, v9

    .line 172
    cmp-long v0, v2, v13

    .line 173
    .line 174
    if-eqz v0, :cond_10

    .line 175
    .line 176
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameUnquote()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    :goto_6
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 181
    .line 182
    const/16 v3, 0x3a

    .line 183
    .line 184
    if-ne v2, v3, :cond_f

    .line 185
    .line 186
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 187
    .line 188
    .line 189
    :cond_f
    move-object v3, v0

    .line 190
    goto :goto_7

    .line 191
    :cond_10
    const-string v0, "not allow unquoted fieldName"

    .line 192
    .line 193
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    return-void

    .line 201
    :goto_7
    iput-boolean v7, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 202
    .line 203
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 204
    .line 205
    const-string v2, "FASTJSON2.0.60error, offset "

    .line 206
    .line 207
    sparse-switch v0, :sswitch_data_0

    .line 208
    .line 209
    .line 210
    packed-switch v0, :pswitch_data_0

    .line 211
    .line 212
    .line 213
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 214
    .line 215
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 216
    .line 217
    invoke-static {v0, v3, v2}, Lah/a;->e(IILjava/lang/String;)V

    .line 218
    .line 219
    .line 220
    return-void

    .line 221
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipComment()V

    .line 222
    .line 223
    .line 224
    goto/16 :goto_9

    .line 225
    .line 226
    :sswitch_0
    if-eqz v8, :cond_11

    .line 227
    .line 228
    sget-object v0, Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;

    .line 229
    .line 230
    const/4 v2, 0x0

    .line 231
    move-object v1, p0

    .line 232
    move-wide/from16 v4, p2

    .line 233
    .line 234
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    goto :goto_8

    .line 239
    :cond_11
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readObject()Ljava/util/Map;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    goto :goto_8

    .line 244
    :sswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readBinary()[B

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    goto :goto_8

    .line 249
    :sswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNullOrNewDate()Ljava/util/Date;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    goto :goto_8

    .line 254
    :sswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readBoolValue()Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    goto :goto_8

    .line 263
    :sswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readArray()Ljava/util/List;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    goto :goto_8

    .line 268
    :sswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfSet()Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_12

    .line 273
    .line 274
    const-class v0, Ljava/util/HashSet;

    .line 275
    .line 276
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/Class;)Ljava/lang/Object;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    goto :goto_8

    .line 281
    :cond_12
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 282
    .line 283
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 284
    .line 285
    invoke-static {v0, v3, v2}, Lah/a;->e(IILjava/lang/String;)V

    .line 286
    .line 287
    .line 288
    return-void

    .line 289
    :sswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfInfinity()Z

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    if-eqz v0, :cond_13

    .line 294
    .line 295
    const-wide/high16 v4, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 296
    .line 297
    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    goto :goto_8

    .line 302
    :cond_13
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 303
    .line 304
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 305
    .line 306
    invoke-static {v0, v3, v2}, Lah/a;->e(IILjava/lang/String;)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :pswitch_1
    :sswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNumber()Ljava/lang/Number;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    goto :goto_8

    .line 315
    :sswitch_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    :goto_8
    if-nez v0, :cond_14

    .line 320
    .line 321
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 322
    .line 323
    iget-wide v4, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 324
    .line 325
    and-long/2addr v4, v9

    .line 326
    cmp-long v2, v4, v13

    .line 327
    .line 328
    if-eqz v2, :cond_14

    .line 329
    .line 330
    goto :goto_9

    .line 331
    :cond_14
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 332
    .line 333
    iget-wide v4, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 334
    .line 335
    and-long/2addr v4, v9

    .line 336
    cmp-long v2, v4, v13

    .line 337
    .line 338
    if-eqz v2, :cond_15

    .line 339
    .line 340
    const-string v2, "@type"

    .line 341
    .line 342
    invoke-virtual {v3, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    move-result v2

    .line 346
    if-eqz v2, :cond_15

    .line 347
    .line 348
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v2

    .line 356
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 357
    .line 358
    .line 359
    move-result v2

    .line 360
    if-eqz v2, :cond_15

    .line 361
    .line 362
    goto :goto_9

    .line 363
    :cond_15
    invoke-interface {v6, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v2

    .line 367
    if-eqz v2, :cond_17

    .line 368
    .line 369
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 370
    .line 371
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 372
    .line 373
    and-long/2addr v4, v9

    .line 374
    cmp-long v4, v4, v13

    .line 375
    .line 376
    if-eqz v4, :cond_17

    .line 377
    .line 378
    instance-of v4, v2, Ljava/util/Collection;

    .line 379
    .line 380
    if-eqz v4, :cond_16

    .line 381
    .line 382
    move-object v4, v2

    .line 383
    check-cast v4, Ljava/util/Collection;

    .line 384
    .line 385
    invoke-interface {v4, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    invoke-interface {v6, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    goto :goto_9

    .line 392
    :cond_16
    invoke-static {v2, v0}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-interface {v6, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    :cond_17
    :goto_9
    add-int/lit8 v11, v11, 0x1

    .line 400
    .line 401
    move v0, v12

    .line 402
    goto/16 :goto_1

    .line 403
    .line 404
    nop

    .line 405
    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_8
        0x27 -> :sswitch_8
        0x2b -> :sswitch_7
        0x49 -> :sswitch_6
        0x53 -> :sswitch_5
        0x5b -> :sswitch_4
        0x66 -> :sswitch_3
        0x6e -> :sswitch_2
        0x74 -> :sswitch_3
        0x78 -> :sswitch_1
        0x7b -> :sswitch_0
    .end sparse-switch

    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    :pswitch_data_0
    .packed-switch 0x2d
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public read(Ljava/util/Map;Lcom/alibaba/fastjson2/reader/ObjectReader;J)V
    .locals 11

    .line 457
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 458
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    or-long/2addr v0, p3

    const/4 v2, 0x0

    .line 459
    :goto_0
    iget-char v3, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v4, 0x2f

    if-ne v3, v4, :cond_0

    .line 460
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipComment()V

    .line 461
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    move-result v3

    if-eqz v3, :cond_1

    .line 462
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    return-void

    :cond_1
    if-eqz v2, :cond_3

    .line 463
    iget-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    if-eqz v3, :cond_2

    goto :goto_1

    .line 464
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    return-void

    .line 465
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readFieldName()Ljava/lang/String;

    move-result-object v6

    .line 466
    invoke-interface {p2}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    move-result-object v5

    move-object v4, p0

    move-object v3, p2

    move-wide v7, p3

    invoke-interface/range {v3 .. v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p2

    const-wide/16 p3, 0x0

    if-nez p2, :cond_4

    .line 467
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v4, v0

    cmp-long v4, v4, p3

    if-eqz v4, :cond_4

    goto :goto_2

    .line 468
    :cond_4
    invoke-interface {p1, v6, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_6

    .line 469
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v9, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v9, v0

    cmp-long p3, v9, p3

    if-eqz p3, :cond_6

    .line 470
    instance-of p3, v4, Ljava/util/Collection;

    if-eqz p3, :cond_5

    .line 471
    move-object p3, v4

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 472
    invoke-interface {p1, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 473
    :cond_5
    invoke-static {v4, p2}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    move-result-object p2

    .line 474
    invoke-interface {p1, v6, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_6
    :goto_2
    add-int/lit8 v2, v2, 0x1

    move-object p2, v3

    move-wide p3, v7

    goto :goto_0
.end method

.method public final read(Ljava/util/Map;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;J)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    .line 430
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    move-result v0

    if-eqz v0, :cond_8

    .line 431
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    invoke-virtual {v0, v7}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v0

    .line 432
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    move-object/from16 v3, p3

    invoke-virtual {v2, v3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v8

    .line 433
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    or-long v9, p4, v2

    const/4 v2, 0x0

    move v11, v2

    .line 434
    :goto_0
    iget-char v2, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v3, 0x2f

    if-ne v2, v3, :cond_0

    .line 435
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->skipComment()V

    :cond_0
    const/16 v2, 0x7d

    .line 436
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    move-result v2

    if-eqz v2, :cond_1

    .line 437
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    return-void

    :cond_1
    if-eqz v11, :cond_3

    .line 438
    iget-boolean v2, v1, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    if-eqz v2, :cond_2

    goto :goto_1

    .line 439
    :cond_2
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    return-void

    .line 440
    :cond_3
    :goto_1
    const-class v2, Ljava/lang/String;

    if-ne v7, v2, :cond_4

    .line 441
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldName()Ljava/lang/String;

    move-result-object v2

    move-object v12, v0

    :goto_2
    move-object v13, v2

    goto :goto_3

    :cond_4
    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    .line 442
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v0

    const/16 v0, 0x3a

    .line 443
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    goto :goto_2

    :goto_3
    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    move-object v0, v8

    .line 444
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    const-wide/16 v3, 0x0

    if-nez v2, :cond_5

    .line 445
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v14, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v14, v9

    cmp-long v5, v14, v3

    if-eqz v5, :cond_5

    goto :goto_4

    .line 446
    :cond_5
    invoke-interface {v6, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_7

    .line 447
    sget-object v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->DuplicateKeyValueAsArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v14, v8, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v14, v9

    cmp-long v3, v14, v3

    if-eqz v3, :cond_7

    .line 448
    instance-of v3, v5, Ljava/util/Collection;

    if-eqz v3, :cond_6

    .line 449
    move-object v3, v5

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 450
    invoke-interface {v6, v13, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_4

    .line 451
    :cond_6
    invoke-static {v5, v2}, Lcom/alibaba/fastjson2/JSONArray;->of(Ljava/lang/Object;Ljava/lang/Object;)Lcom/alibaba/fastjson2/JSONArray;

    move-result-object v2

    .line 452
    invoke-interface {v6, v13, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_7
    :goto_4
    add-int/lit8 v11, v11, 0x1

    move-object v8, v0

    move-object v0, v12

    goto :goto_0

    .line 453
    :cond_8
    iget v0, v1, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    iget-char v2, v1, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const-string v3, "illegal input\uff0c offset "

    invoke-static {v0, v2, v3}, Lah/a;->e(IILjava/lang/String;)V

    return-void
.end method

.method public readAny()Ljava/lang/Object;
    .locals 1

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/Class;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public readArray()Ljava/util/List;
    .locals 15

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    add-int/2addr v0, v1

    .line 8
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 9
    .line 10
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 11
    .line 12
    iget v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    .line 13
    .line 14
    if-ge v0, v2, :cond_11

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    move-object v4, v0

    .line 19
    move-object v5, v4

    .line 20
    move-object v6, v5

    .line 21
    move v3, v2

    .line 22
    :goto_0
    iget-char v7, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 23
    .line 24
    const/4 v8, 0x2

    .line 25
    sparse-switch v7, :sswitch_data_0

    .line 26
    .line 27
    .line 28
    packed-switch v7, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    const-string v0, "TODO : "

    .line 32
    .line 33
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 34
    .line 35
    invoke-static {v1, v0}, Lah/a;->t(ILjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    :goto_1
    const/4 v0, 0x0

    .line 39
    return-object v0

    .line 40
    :pswitch_0
    :sswitch_0
    move-object v10, p0

    .line 41
    goto/16 :goto_7

    .line 42
    .line 43
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipComment()V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v3, v3, -0x1

    .line 47
    .line 48
    move-object v10, p0

    .line 49
    goto/16 :goto_a

    .line 50
    .line 51
    :sswitch_1
    iget-object v7, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 52
    .line 53
    iget-object v9, v7, Lcom/alibaba/fastjson2/JSONReader$Context;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 54
    .line 55
    if-nez v9, :cond_2

    .line 56
    .line 57
    iget-wide v9, v7, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 58
    .line 59
    sget-object v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 60
    .line 61
    iget-wide v11, v7, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 62
    .line 63
    and-long/2addr v9, v11

    .line 64
    const-wide/16 v11, 0x0

    .line 65
    .line 66
    cmp-long v7, v9, v11

    .line 67
    .line 68
    if-eqz v7, :cond_0

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-eqz v7, :cond_1

    .line 76
    .line 77
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v7

    .line 81
    invoke-static {v7}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    :goto_2
    move-object v10, p0

    .line 86
    goto/16 :goto_8

    .line 87
    .line 88
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readObject()Ljava/util/Map;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    goto :goto_2

    .line 93
    :cond_2
    :goto_3
    sget-object v9, Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;->INSTANCE:Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;

    .line 94
    .line 95
    const/4 v12, 0x0

    .line 96
    const-wide/16 v13, 0x0

    .line 97
    .line 98
    const/4 v11, 0x0

    .line 99
    move-object v10, p0

    .line 100
    invoke-virtual/range {v9 .. v14}, Lcom/alibaba/fastjson2/reader/ObjectReaderImplObject;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v7

    .line 104
    goto/16 :goto_8

    .line 105
    .line 106
    :sswitch_2
    move-object v10, p0

    .line 107
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNull()V

    .line 108
    .line 109
    .line 110
    move-object v7, v0

    .line 111
    goto/16 :goto_8

    .line 112
    .line 113
    :sswitch_3
    move-object v10, p0

    .line 114
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readBoolValue()Z

    .line 115
    .line 116
    .line 117
    move-result v7

    .line 118
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    goto/16 :goto_8

    .line 123
    .line 124
    :sswitch_4
    move-object v10, p0

    .line 125
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 126
    .line 127
    .line 128
    if-nez v4, :cond_9

    .line 129
    .line 130
    iget-object v0, v10, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 131
    .line 132
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    .line 133
    .line 134
    if-eqz v4, :cond_3

    .line 135
    .line 136
    invoke-interface {v4}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    check-cast v0, Ljava/util/List;

    .line 141
    .line 142
    :goto_4
    move-object v4, v0

    .line 143
    goto :goto_5

    .line 144
    :cond_3
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 145
    .line 146
    invoke-virtual {v0, v4}, Lcom/alibaba/fastjson2/JSONReader$Context;->isEnabled(Lcom/alibaba/fastjson2/JSONReader$Feature;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_5

    .line 151
    .line 152
    new-instance v0, Ljava/util/ArrayList;

    .line 153
    .line 154
    if-ne v3, v8, :cond_4

    .line 155
    .line 156
    invoke-direct {v0, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 157
    .line 158
    .line 159
    goto :goto_4

    .line 160
    :cond_4
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_5
    iget-object v0, v10, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 165
    .line 166
    iget-object v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    .line 167
    .line 168
    if-eqz v0, :cond_6

    .line 169
    .line 170
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, Ljava/util/List;

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_6
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 178
    .line 179
    if-ne v3, v8, :cond_7

    .line 180
    .line 181
    invoke-direct {v0, v8}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 182
    .line 183
    .line 184
    goto :goto_4

    .line 185
    :cond_7
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONArray;-><init>(I)V

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :goto_5
    if-ne v3, v1, :cond_8

    .line 190
    .line 191
    invoke-direct {p0, v4, v2, v5}, Lcom/alibaba/fastjson2/JSONReader;->add(Ljava/util/List;ILjava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto :goto_6

    .line 195
    :cond_8
    if-ne v3, v8, :cond_9

    .line 196
    .line 197
    invoke-direct {p0, v4, v2, v5}, Lcom/alibaba/fastjson2/JSONReader;->add(Ljava/util/List;ILjava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-direct {p0, v4, v1, v6}, Lcom/alibaba/fastjson2/JSONReader;->add(Ljava/util/List;ILjava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    :cond_9
    :goto_6
    iget-char v0, v10, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 204
    .line 205
    const/16 v3, 0x2c

    .line 206
    .line 207
    if-ne v0, v3, :cond_a

    .line 208
    .line 209
    move v2, v1

    .line 210
    :cond_a
    iput-boolean v2, v10, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 211
    .line 212
    if-eqz v2, :cond_b

    .line 213
    .line 214
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 215
    .line 216
    .line 217
    :cond_b
    iget v0, v10, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 218
    .line 219
    sub-int/2addr v0, v1

    .line 220
    iput v0, v10, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 221
    .line 222
    return-object v4

    .line 223
    :sswitch_5
    move-object v10, p0

    .line 224
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readArray()Ljava/util/List;

    .line 225
    .line 226
    .line 227
    move-result-object v7

    .line 228
    goto :goto_8

    .line 229
    :sswitch_6
    move-object v10, p0

    .line 230
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfSet()Z

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    if-eqz v7, :cond_c

    .line 235
    .line 236
    const-class v7, Ljava/util/Set;

    .line 237
    .line 238
    invoke-virtual {p0, v7}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/Class;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v7

    .line 242
    goto :goto_8

    .line 243
    :cond_c
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    goto/16 :goto_1

    .line 251
    .line 252
    :sswitch_7
    move-object v10, p0

    .line 253
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNaN()D

    .line 254
    .line 255
    .line 256
    move-result-wide v11

    .line 257
    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    goto :goto_8

    .line 262
    :goto_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNumber0()V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 266
    .line 267
    .line 268
    move-result-object v7

    .line 269
    goto :goto_8

    .line 270
    :sswitch_8
    move-object v10, p0

    .line 271
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    :goto_8
    if-nez v3, :cond_d

    .line 276
    .line 277
    move-object v5, v7

    .line 278
    goto :goto_a

    .line 279
    :cond_d
    if-ne v3, v1, :cond_e

    .line 280
    .line 281
    move-object v6, v7

    .line 282
    goto :goto_a

    .line 283
    :cond_e
    if-ne v3, v8, :cond_10

    .line 284
    .line 285
    iget-object v4, v10, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 286
    .line 287
    iget-object v4, v4, Lcom/alibaba/fastjson2/JSONReader$Context;->arraySupplier:Ljava/util/function/Supplier;

    .line 288
    .line 289
    if-eqz v4, :cond_f

    .line 290
    .line 291
    invoke-interface {v4}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v4

    .line 295
    check-cast v4, Ljava/util/List;

    .line 296
    .line 297
    goto :goto_9

    .line 298
    :cond_f
    new-instance v4, Lcom/alibaba/fastjson2/JSONArray;

    .line 299
    .line 300
    invoke-direct {v4}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 301
    .line 302
    .line 303
    :goto_9
    invoke-direct {p0, v4, v2, v5}, Lcom/alibaba/fastjson2/JSONReader;->add(Ljava/util/List;ILjava/lang/Object;)V

    .line 304
    .line 305
    .line 306
    invoke-direct {p0, v4, v1, v6}, Lcom/alibaba/fastjson2/JSONReader;->add(Ljava/util/List;ILjava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    invoke-direct {p0, v4, v3, v7}, Lcom/alibaba/fastjson2/JSONReader;->add(Ljava/util/List;ILjava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    goto :goto_a

    .line 313
    :cond_10
    invoke-direct {p0, v4, v3, v7}, Lcom/alibaba/fastjson2/JSONReader;->add(Ljava/util/List;ILjava/lang/Object;)V

    .line 314
    .line 315
    .line 316
    :goto_a
    add-int/2addr v3, v1

    .line 317
    goto/16 :goto_0

    .line 318
    .line 319
    :cond_11
    move-object v10, p0

    .line 320
    const-string v0, "level too large : "

    .line 321
    .line 322
    iget v1, v10, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 323
    .line 324
    invoke-static {v1, v0}, Lah/a;->y(ILjava/lang/String;)V

    .line 325
    .line 326
    .line 327
    goto/16 :goto_1

    .line 328
    .line 329
    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_8
        0x27 -> :sswitch_8
        0x2b -> :sswitch_0
        0x2d -> :sswitch_0
        0x4e -> :sswitch_7
        0x53 -> :sswitch_6
        0x5b -> :sswitch_5
        0x5d -> :sswitch_4
        0x66 -> :sswitch_3
        0x6e -> :sswitch_2
        0x74 -> :sswitch_3
        0x7b -> :sswitch_1
    .end sparse-switch

    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public readArray(Ljava/lang/reflect/Type;)Ljava/util/List;
    .locals 10

    .line 366
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 367
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    move-result v0

    if-eqz v0, :cond_6

    .line 368
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget-wide v1, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v1, v3

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    move v1, v3

    goto :goto_0

    :cond_1
    move v1, v2

    .line 369
    :goto_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v0, p1, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v4

    .line 370
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 371
    :goto_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    move-result v0

    if-nez v0, :cond_3

    .line 372
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v6, 0x0

    move-object v5, p0

    .line 373
    invoke-interface/range {v4 .. v9}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v1

    .line 374
    iget v6, v5, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    if-eq v0, v6, :cond_2

    iget-char v0, v5, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v6, 0x7d

    if-eq v0, v6, :cond_2

    const/16 v6, 0x1a

    if-eq v0, v6, :cond_2

    .line 375
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 376
    :cond_2
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    iget-char v0, v5, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getOffset()I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "illegal input : "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v0, ", offset "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    move-object v5, p0

    .line 377
    iget-char v0, v5, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v1, 0x2c

    if-ne v0, v1, :cond_4

    move v2, v3

    :cond_4
    iput-boolean v2, v5, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    if-eqz v2, :cond_5

    .line 378
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    :cond_5
    return-object p1

    :cond_6
    move-object v5, p0

    .line 379
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "syntax error : "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-char v0, v5, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public readArray(Ljava/util/Collection;Ljava/lang/reflect/Type;)V
    .locals 7

    .line 341
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/16 v3, 0x2c

    if-eqz v0, :cond_3

    .line 342
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 343
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    if-ne p1, v3, :cond_0

    move v1, v2

    :cond_0
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    if-eqz v1, :cond_a

    .line 344
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    return-void

    .line 345
    :cond_1
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    .line 346
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 347
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    const/16 v4, 0x7d

    if-eq v0, v4, :cond_2

    const/16 v4, 0x1a

    if-eq v0, v4, :cond_2

    goto :goto_0

    .line 348
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    return-void

    .line 349
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 350
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    move-result-object v0

    .line 351
    const-class v4, Ljava/lang/String;

    if-ne p2, v4, :cond_4

    .line 352
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 353
    :cond_4
    iget-object v5, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget-object v5, v5, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v5, v4, p2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getTypeConvert(Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)Ljava/util/function/Function;

    move-result-object p2

    if-eqz p2, :cond_6

    .line 354
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_5

    .line 355
    const-string v4, ","

    invoke-virtual {v0, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v0

    .line 356
    array-length v4, v0

    move v5, v1

    :goto_1
    if-ge v5, v4, :cond_8

    aget-object v6, v0, v5

    .line 357
    invoke-interface {p2, v6}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    .line 358
    invoke-interface {p1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 359
    :cond_5
    invoke-interface {p2, v0}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    .line 360
    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 361
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "not support input "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    return-void

    .line 362
    :cond_7
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p2

    .line 363
    invoke-interface {p1, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 364
    :cond_8
    :goto_2
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    if-ne p1, v3, :cond_9

    move v1, v2

    :cond_9
    iput-boolean v1, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    if-eqz v1, :cond_a

    .line 365
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    :cond_a
    return-void
.end method

.method public final readArray(Ljava/util/List;Ljava/lang/reflect/Type;)V
    .locals 0

    .line 340
    invoke-virtual {p0, p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->readArray(Ljava/util/Collection;Ljava/lang/reflect/Type;)V

    return-void
.end method

.method public final readArray([Ljava/lang/reflect/Type;)[Ljava/lang/Object;
    .locals 6

    .line 328
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 329
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    move-result v0

    const-string v1, "syntax error"

    if-eqz v0, :cond_6

    .line 330
    array-length v0, p1

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    move v3, v2

    .line 331
    :goto_0
    array-length v4, p1

    if-ge v2, v4, :cond_4

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    .line 332
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    move-result v5

    if-eqz v5, :cond_1

    move v3, v4

    goto :goto_1

    .line 333
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_1

    .line 334
    :cond_2
    aget-object v5, p1, v2

    .line 335
    invoke-virtual {p0, v5}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v5

    .line 336
    aput-object v5, v0, v2

    .line 337
    array-length v5, p1

    sub-int/2addr v5, v4

    if-ne v2, v5, :cond_3

    move v3, v4

    :cond_3
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    if-eqz v3, :cond_5

    return-object v0

    .line 338
    :cond_5
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    :goto_2
    const/4 p1, 0x0

    return-object p1

    .line 339
    :cond_6
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    goto :goto_2
.end method

.method public readBase64()[B
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const-string v2, "data:image/"

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    const/16 v2, 0x3b

    .line 17
    .line 18
    const/16 v3, 0xc

    .line 19
    .line 20
    invoke-virtual {v0, v2, v3}, Ljava/lang/String;->indexOf(II)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, -0x1

    .line 25
    if-eq v2, v3, :cond_0

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    const/16 v4, 0x2c

    .line 30
    .line 31
    invoke-virtual {v0, v4, v2}, Ljava/lang/String;->indexOf(II)I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-eq v4, v3, :cond_0

    .line 36
    .line 37
    const/4 v3, 0x6

    .line 38
    const-string v5, "base64"

    .line 39
    .line 40
    invoke-virtual {v0, v2, v5, v1, v3}, Ljava/lang/String;->regionMatches(ILjava/lang/String;II)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-eqz v2, :cond_0

    .line 45
    .line 46
    add-int/lit8 v4, v4, 0x1

    .line 47
    .line 48
    invoke-virtual {v0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_1

    .line 57
    .line 58
    new-array v0, v1, [B

    .line 59
    .line 60
    return-object v0

    .line 61
    :cond_1
    invoke-static {}, Ljava/util/Base64;->getDecoder()Ljava/util/Base64$Decoder;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1, v0}, Ljava/util/Base64$Decoder;->decode(Ljava/lang/String;)[B

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    return-object v0
.end method

.method public abstract readBigDecimal()Ljava/math/BigDecimal;
.end method

.method public readBigInteger()Ljava/math/BigInteger;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNumber0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getBigInteger()Ljava/math/BigInteger;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public readBinary()[B
    .locals 5

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x78

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readHex()[B

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    return-object v0

    .line 30
    :cond_1
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 31
    .line 32
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 33
    .line 34
    sget-object v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->Base64StringAsByteArray:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 35
    .line 36
    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 37
    .line 38
    and-long/2addr v1, v3

    .line 39
    const-wide/16 v3, 0x0

    .line 40
    .line 41
    cmp-long v1, v1, v3

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/IOUtils;->decodeBase64(Ljava/lang/String;)[B

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    return-object v0

    .line 50
    :cond_2
    const-string v1, "not support input "

    .line 51
    .line 52
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    const/4 v0, 0x0

    .line 64
    return-object v0

    .line 65
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_6

    .line 70
    .line 71
    const/16 v0, 0x40

    .line 72
    .line 73
    new-array v0, v0, [B

    .line 74
    .line 75
    const/4 v1, 0x0

    .line 76
    :goto_0
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 77
    .line 78
    const/16 v3, 0x5d

    .line 79
    .line 80
    if-ne v2, v3, :cond_4

    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0

    .line 93
    :cond_4
    array-length v2, v0

    .line 94
    if-ne v1, v2, :cond_5

    .line 95
    .line 96
    array-length v2, v0

    .line 97
    shr-int/lit8 v3, v2, 0x1

    .line 98
    .line 99
    add-int/2addr v2, v3

    .line 100
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    :cond_5
    add-int/lit8 v2, v1, 0x1

    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt32Value()I

    .line 107
    .line 108
    .line 109
    move-result v3

    .line 110
    int-to-byte v3, v3

    .line 111
    aput-byte v3, v0, v1

    .line 112
    .line 113
    move v1, v2

    .line 114
    goto :goto_0

    .line 115
    :cond_6
    const-string v0, "not support read binary"

    .line 116
    .line 117
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    const/4 v0, 0x0

    .line 125
    return-object v0
.end method

.method public readBool()Ljava/lang/Boolean;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readBoolValue()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    return-object v0
.end method

.method public abstract readBoolValue()Z
.end method

.method public readCalendar()Ljava/util/Calendar;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readDate()Ljava/util/Date;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getTimeZone()Ljava/util/TimeZone;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-static {v1}, Ljava/util/Calendar;->getInstance(Ljava/util/TimeZone;)Ljava/util/Calendar;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1, v0}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 20
    .line 21
    .line 22
    return-object v1
.end method

.method public readCharValue()C
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 22
    .line 23
    return v1
.end method

.method public readCharacter()Ljava/lang/Character;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-static {v0}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    return-object v0

    .line 24
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 25
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 26
    .line 27
    invoke-static {v1}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public readDate()Ljava/util/Date;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isInt()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    new-instance v2, Ljava/util/Date;

    .line 12
    .line 13
    invoke-direct {v2, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 14
    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readIfNull()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    return-object v1

    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    return-object v1

    .line 32
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    const/16 v2, 0x6e

    .line 37
    .line 38
    if-ne v0, v2, :cond_3

    .line 39
    .line 40
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNullOrNewDate()Ljava/util/Date;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    return-object v0

    .line 45
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isTypeRedirect()Z

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_4

    .line 50
    .line 51
    const/16 v6, 0x6c

    .line 52
    .line 53
    const/16 v7, 0x22

    .line 54
    .line 55
    const/16 v3, 0x22

    .line 56
    .line 57
    const/16 v4, 0x76

    .line 58
    .line 59
    const/16 v5, 0x61

    .line 60
    .line 61
    move-object v2, p0

    .line 62
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatchIdent(CCCCC)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    const/16 v0, 0x3a

    .line 69
    .line 70
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 74
    .line 75
    .line 76
    move-result-wide v3

    .line 77
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 78
    .line 79
    .line 80
    const/4 v0, 0x0

    .line 81
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->setTypeRedirect(Z)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_4
    move-object v2, p0

    .line 86
    :cond_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readMillisFromString()J

    .line 87
    .line 88
    .line 89
    move-result-wide v3

    .line 90
    :goto_0
    const-wide/16 v5, 0x0

    .line 91
    .line 92
    cmp-long v0, v3, v5

    .line 93
    .line 94
    if-nez v0, :cond_6

    .line 95
    .line 96
    iget-boolean v0, v2, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    return-object v1

    .line 101
    :cond_6
    new-instance v0, Ljava/util/Date;

    .line 102
    .line 103
    invoke-direct {v0, v3, v4}, Ljava/util/Date;-><init>(J)V

    .line 104
    .line 105
    .line 106
    return-object v0
.end method

.method public final readDouble()Ljava/lang/Double;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readDoubleValue()D

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_1
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public abstract readDoubleValue()D
.end method

.method public abstract readFieldName()Ljava/lang/String;
.end method

.method public abstract readFieldNameHashCode()J
.end method

.method public abstract readFieldNameHashCodeUnquote()J
.end method

.method public final readFieldNameUnquote()Ljava/lang/String;
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x2f

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipComment()V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCodeUnquote()J

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getFieldName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    const-string v1, ""

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_1

    .line 26
    .line 27
    return-object v0

    .line 28
    :cond_1
    const-string v0, "illegal input"

    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 v0, 0x0

    .line 38
    return-object v0
.end method

.method public final readFloat()Ljava/lang/Float;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readFloatValue()F

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 17
    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    return-object v1

    .line 21
    :cond_1
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0
.end method

.method public abstract readFloatValue()F
.end method

.method public abstract readHex()[B
.end method

.method public abstract readIfNull()Z
.end method

.method public readInstant()Ljava/time/Instant;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isNumber()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 20
    .line 21
    iget-boolean v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->formatUnixTime:Z

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    const-wide/16 v2, 0x3e8

    .line 26
    .line 27
    mul-long/2addr v0, v2

    .line 28
    :cond_1
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    return-object v0

    .line 33
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isObject()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    const-class v0, Ljava/time/Instant;

    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readObject()Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    const-wide/16 v2, 0x0

    .line 50
    .line 51
    invoke-interface {v0, v1, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(Ljava/util/Map;J)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    check-cast v0, Ljava/time/Instant;

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readZonedDateTime()Ljava/time/ZonedDateTime;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_4
    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 66
    .line 67
    .line 68
    move-result-wide v1

    .line 69
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    invoke-virtual {v0}, Ljava/time/LocalTime;->getNano()I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    int-to-long v3, v0

    .line 78
    invoke-static {v1, v2, v3, v4}, Ljava/time/Instant;->ofEpochSecond(JJ)Ljava/time/Instant;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    return-object v0
.end method

.method public readInt16()Ljava/lang/Short;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt32()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->shortValue()S

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public readInt16Value()S
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt32Value()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-short v0, v0

    .line 6
    return v0
.end method

.method public readInt32()Ljava/lang/Integer;
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x6e

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    return-object v0

    .line 23
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt32Value()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public abstract readInt32Value()I
.end method

.method public final readInt32ValueOverflow()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNumber0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getInt32Value()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    return v0
.end method

.method public readInt64()Ljava/lang/Long;
    .locals 2

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x22

    .line 4
    .line 5
    if-eq v0, v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x27

    .line 8
    .line 9
    if-eq v0, v1, :cond_0

    .line 10
    .line 11
    const/16 v1, 0x6e

    .line 12
    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    return-object v0

    .line 23
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    return-object v0
.end method

.method public abstract readInt64Value()J
.end method

.method public readInt64ValueArray()[J
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_5

    .line 14
    .line 15
    const/16 v0, 0x8

    .line 16
    .line 17
    new-array v0, v0, [J

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_2

    .line 25
    .line 26
    array-length v2, v0

    .line 27
    if-ne v1, v2, :cond_1

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_4

    .line 40
    .line 41
    array-length v2, v0

    .line 42
    if-ne v1, v2, :cond_3

    .line 43
    .line 44
    array-length v2, v0

    .line 45
    shl-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    :cond_3
    add-int/lit8 v2, v1, 0x1

    .line 52
    .line 53
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 54
    .line 55
    .line 56
    move-result-wide v3

    .line 57
    aput-wide v3, v0, v1

    .line 58
    .line 59
    move v1, v2

    .line 60
    goto :goto_0

    .line 61
    :cond_4
    const-string v0, "input end"

    .line 62
    .line 63
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    :goto_1
    const/4 v0, 0x0

    .line 71
    return-object v0

    .line 72
    :cond_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-eqz v0, :cond_7

    .line 77
    .line 78
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    if-eqz v2, :cond_6

    .line 87
    .line 88
    return-object v1

    .line 89
    :cond_6
    const-string v1, "not support input "

    .line 90
    .line 91
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->error(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONException;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    throw v0

    .line 100
    :cond_7
    const-string v0, "TODO"

    .line 101
    .line 102
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1
.end method

.method public final readInt64ValueOverflow()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNumber0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getInt64Value()J

    .line 5
    .line 6
    .line 7
    move-result-wide v0

    .line 8
    return-wide v0
.end method

.method public readInt8()Ljava/lang/Byte;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt32()Ljava/lang/Integer;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Integer;->byteValue()B

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public readInt8Value()B
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt32Value()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    int-to-byte v0, v0

    .line 6
    return v0
.end method

.method public final readJSONArray()Lcom/alibaba/fastjson2/JSONArray;
    .locals 1

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONArray;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONArray;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/List;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final readJSONObject()Lcom/alibaba/fastjson2/JSONObject;
    .locals 3

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, 0x0

    .line 7
    .line 8
    invoke-virtual {p0, v0, v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public readList([Ljava/lang/reflect/Type;)Ljava/util/List;
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return-object p1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_6

    .line 14
    .line 15
    array-length v0, p1

    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 24
    .line 25
    .line 26
    move-result v4

    .line 27
    if-nez v4, :cond_2

    .line 28
    .line 29
    if-ge v3, v0, :cond_2

    .line 30
    .line 31
    iget v4, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 32
    .line 33
    add-int/lit8 v5, v3, 0x1

    .line 34
    .line 35
    aget-object v3, p1, v3

    .line 36
    .line 37
    invoke-virtual {p0, v3}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    iget v6, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 42
    .line 43
    if-eq v4, v6, :cond_1

    .line 44
    .line 45
    iget-char v4, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 46
    .line 47
    const/16 v6, 0x7d

    .line 48
    .line 49
    if-eq v4, v6, :cond_1

    .line 50
    .line 51
    const/16 v6, 0x1a

    .line 52
    .line 53
    if-eq v4, v6, :cond_1

    .line 54
    .line 55
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move v3, v5

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    new-instance p1, Lcom/alibaba/fastjson2/JSONException;

    .line 61
    .line 62
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getOffset()I

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    new-instance v2, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v3, "illegal input : "

    .line 71
    .line 72
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v0, ", offset "

    .line 79
    .line 80
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-direct {p1, v0}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_2
    if-ne v3, v0, :cond_5

    .line 95
    .line 96
    iget-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 97
    .line 98
    const/16 v0, 0x2c

    .line 99
    .line 100
    if-ne p1, v0, :cond_3

    .line 101
    .line 102
    const/4 v2, 0x1

    .line 103
    :cond_3
    iput-boolean v2, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 104
    .line 105
    if-eqz v2, :cond_4

    .line 106
    .line 107
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 108
    .line 109
    .line 110
    :cond_4
    return-object v1

    .line 111
    :cond_5
    const-string p1, "element length mismatch"

    .line 112
    .line 113
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    :goto_1
    const/4 p1, 0x0

    .line 121
    return-object p1

    .line 122
    :cond_6
    const-string p1, "syntax error : "

    .line 123
    .line 124
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 125
    .line 126
    invoke-static {v0, p1}, Lah/a;->t(ILjava/lang/String;)V

    .line 127
    .line 128
    .line 129
    goto :goto_1
.end method

.method public readLocalDate()Ljava/time/LocalDate;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isInt()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 20
    .line 21
    iget-boolean v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->formatUnixTime:Z

    .line 22
    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    const-wide/16 v2, 0x3e8

    .line 26
    .line 27
    mul-long/2addr v0, v2

    .line 28
    :cond_1
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    invoke-virtual {v0, v1}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    return-object v0

    .line 47
    :cond_2
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 48
    .line 49
    iget-object v2, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormat:Ljava/lang/String;

    .line 50
    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmss19:Z

    .line 54
    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmssT19:Z

    .line 58
    .line 59
    if-nez v2, :cond_3

    .line 60
    .line 61
    iget-boolean v2, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMdd8:Z

    .line 62
    .line 63
    if-nez v2, :cond_3

    .line 64
    .line 65
    iget-boolean v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatISO8601:Z

    .line 66
    .line 67
    if-eqz v0, :cond_b

    .line 68
    .line 69
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getStringLength()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    const/16 v2, 0x13

    .line 74
    .line 75
    if-eq v0, v2, :cond_a

    .line 76
    .line 77
    const/16 v2, 0x14

    .line 78
    .line 79
    if-eq v0, v2, :cond_9

    .line 80
    .line 81
    packed-switch v0, :pswitch_data_0

    .line 82
    .line 83
    .line 84
    if-le v0, v2, :cond_4

    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTimeX(I)Ljava/time/LocalDateTime;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    goto :goto_1

    .line 91
    :cond_4
    :goto_0
    move-object v0, v1

    .line 92
    goto :goto_1

    .line 93
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate11()Ljava/time/LocalDate;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    if-nez v0, :cond_5

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_5
    sget-object v2, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 101
    .line 102
    invoke-static {v0, v2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    goto :goto_1

    .line 107
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate10()Ljava/time/LocalDate;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-nez v0, :cond_6

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_6
    sget-object v2, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 115
    .line 116
    invoke-static {v0, v2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    goto :goto_1

    .line 121
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate9()Ljava/time/LocalDate;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    if-nez v0, :cond_7

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_7
    sget-object v2, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 129
    .line 130
    invoke-static {v0, v2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    goto :goto_1

    .line 135
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate8()Ljava/time/LocalDate;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    if-nez v0, :cond_8

    .line 140
    .line 141
    goto :goto_0

    .line 142
    :cond_8
    sget-object v2, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 143
    .line 144
    invoke-static {v0, v2}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    goto :goto_1

    .line 149
    :cond_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime20()Ljava/time/LocalDateTime;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    goto :goto_1

    .line 154
    :cond_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime19()Ljava/time/LocalDateTime;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    :goto_1
    if-eqz v0, :cond_b

    .line 159
    .line 160
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    return-object v0

    .line 165
    :cond_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 170
    .line 171
    .line 172
    move-result v2

    .line 173
    if-nez v2, :cond_10

    .line 174
    .line 175
    const-string v2, "null"

    .line 176
    .line 177
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_c

    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_c
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 185
    .line 186
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    if-eqz v1, :cond_e

    .line 191
    .line 192
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 193
    .line 194
    iget-boolean v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->formatHasHour:Z

    .line 195
    .line 196
    if-eqz v2, :cond_d

    .line 197
    .line 198
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    return-object v0

    .line 207
    :cond_d
    invoke-static {v0, v1}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    return-object v0

    .line 212
    :cond_e
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    if-eqz v1, :cond_f

    .line 217
    .line 218
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 219
    .line 220
    .line 221
    move-result-wide v0

    .line 222
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 227
    .line 228
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-virtual {v0, v1}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalDate()Ljava/time/LocalDate;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    return-object v0

    .line 241
    :cond_f
    const-string v1, "not support input : "

    .line 242
    .line 243
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    const/4 v0, 0x0

    .line 251
    return-object v0

    .line 252
    :cond_10
    :goto_2
    return-object v1

    .line 253
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract readLocalDate10()Ljava/time/LocalDate;
.end method

.method public abstract readLocalDate11()Ljava/time/LocalDate;
.end method

.method public abstract readLocalDate8()Ljava/time/LocalDate;
.end method

.method public abstract readLocalDate9()Ljava/time/LocalDate;
.end method

.method public readLocalDateTime()Ljava/time/LocalDateTime;
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isInt()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v0, v1}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    return-object v0

    .line 30
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isTypeRedirect()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    const/16 v6, 0x6c

    .line 38
    .line 39
    const/16 v7, 0x22

    .line 40
    .line 41
    const/16 v3, 0x22

    .line 42
    .line 43
    const/16 v4, 0x76

    .line 44
    .line 45
    const/16 v5, 0x61

    .line 46
    .line 47
    move-object v2, p0

    .line 48
    invoke-virtual/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatchIdent(CCCCC)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    const/16 v0, 0x3a

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime()Ljava/time/LocalDateTime;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReader;->setTypeRedirect(Z)V

    .line 67
    .line 68
    .line 69
    return-object v0

    .line 70
    :cond_1
    move-object v2, p0

    .line 71
    :cond_2
    iget-object v0, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 72
    .line 73
    iget-object v3, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormat:Ljava/lang/String;

    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmss19:Z

    .line 79
    .line 80
    if-nez v3, :cond_3

    .line 81
    .line 82
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmssT19:Z

    .line 83
    .line 84
    if-nez v3, :cond_3

    .line 85
    .line 86
    iget-boolean v3, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMdd8:Z

    .line 87
    .line 88
    if-nez v3, :cond_3

    .line 89
    .line 90
    iget-boolean v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatISO8601:Z

    .line 91
    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getStringLength()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    packed-switch v0, :pswitch_data_0

    .line 99
    .line 100
    .line 101
    :pswitch_0
    goto :goto_0

    .line 102
    :pswitch_1
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTimeX(I)Ljava/time/LocalDateTime;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    if-eqz v3, :cond_4

    .line 107
    .line 108
    return-object v3

    .line 109
    :cond_4
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->readZonedDateTimeX(I)Ljava/time/ZonedDateTime;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    if-eqz v0, :cond_7

    .line 114
    .line 115
    iget-object v1, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 116
    .line 117
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->getZone()Ljava/time/ZoneId;

    .line 122
    .line 123
    .line 124
    move-result-object v3

    .line 125
    invoke-virtual {v3, v1}, Ljava/time/ZoneId;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-nez v3, :cond_5

    .line 130
    .line 131
    invoke-interface {v0}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-virtual {v0, v1}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    return-object v0

    .line 144
    :cond_5
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    return-object v0

    .line 149
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime20()Ljava/time/LocalDateTime;

    .line 150
    .line 151
    .line 152
    move-result-object v3

    .line 153
    if-eqz v3, :cond_6

    .line 154
    .line 155
    return-object v3

    .line 156
    :cond_6
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->readZonedDateTimeX(I)Ljava/time/ZonedDateTime;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    if-eqz v0, :cond_7

    .line 161
    .line 162
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    return-object v0

    .line 167
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime19()Ljava/time/LocalDateTime;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    if-eqz v0, :cond_7

    .line 172
    .line 173
    return-object v0

    .line 174
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime18()Ljava/time/LocalDateTime;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-eqz v0, :cond_7

    .line 179
    .line 180
    return-object v0

    .line 181
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime17()Ljava/time/LocalDateTime;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    if-eqz v0, :cond_7

    .line 186
    .line 187
    return-object v0

    .line 188
    :cond_7
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    const/4 v5, 0x1

    .line 197
    if-nez v3, :cond_11

    .line 198
    .line 199
    const-string v3, "null"

    .line 200
    .line 201
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    if-eqz v3, :cond_8

    .line 206
    .line 207
    goto/16 :goto_1

    .line 208
    .line 209
    :cond_8
    iget-object v3, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 210
    .line 211
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    if-eqz v3, :cond_a

    .line 216
    .line 217
    iget-object v1, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 218
    .line 219
    iget-boolean v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->formatHasHour:Z

    .line 220
    .line 221
    if-nez v1, :cond_9

    .line 222
    .line 223
    invoke-static {v0, v3}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 224
    .line 225
    .line 226
    move-result-object v0

    .line 227
    sget-object v1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 228
    .line 229
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    return-object v0

    .line 234
    :cond_9
    invoke-static {v0, v3}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    return-object v0

    .line 239
    :cond_a
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 240
    .line 241
    .line 242
    move-result v3

    .line 243
    if-eqz v3, :cond_c

    .line 244
    .line 245
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 246
    .line 247
    .line 248
    move-result-wide v0

    .line 249
    iget-object v3, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 250
    .line 251
    iget-boolean v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->formatUnixTime:Z

    .line 252
    .line 253
    if-eqz v3, :cond_b

    .line 254
    .line 255
    const-wide/16 v3, 0x3e8

    .line 256
    .line 257
    mul-long/2addr v0, v3

    .line 258
    :cond_b
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    iget-object v1, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 263
    .line 264
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    return-object v0

    .line 273
    :cond_c
    const-string v3, "/Date("

    .line 274
    .line 275
    invoke-virtual {v0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 276
    .line 277
    .line 278
    move-result v3

    .line 279
    if-eqz v3, :cond_f

    .line 280
    .line 281
    const-string v3, ")/"

    .line 282
    .line 283
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 284
    .line 285
    .line 286
    move-result v3

    .line 287
    if-eqz v3, :cond_f

    .line 288
    .line 289
    const/4 v3, 0x6

    .line 290
    const/4 v4, 0x2

    .line 291
    invoke-static {v4, v3, v0}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    const/16 v3, 0x2b

    .line 296
    .line 297
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    .line 298
    .line 299
    .line 300
    move-result v3

    .line 301
    const/4 v4, -0x1

    .line 302
    if-ne v3, v4, :cond_d

    .line 303
    .line 304
    const/16 v3, 0x2d

    .line 305
    .line 306
    invoke-virtual {v0, v3}, Ljava/lang/String;->indexOf(I)I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    :cond_d
    if-eq v3, v4, :cond_e

    .line 311
    .line 312
    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    :cond_e
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 317
    .line 318
    .line 319
    move-result-wide v0

    .line 320
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    iget-object v1, v2, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 325
    .line 326
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->ofInstant(Ljava/time/Instant;Ljava/time/ZoneId;)Ljava/time/LocalDateTime;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    return-object v0

    .line 335
    :cond_f
    const-string v1, "0000-00-00 00:00:00"

    .line 336
    .line 337
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    if-eqz v1, :cond_10

    .line 342
    .line 343
    iput-boolean v5, v2, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 344
    .line 345
    return-object v4

    .line 346
    :cond_10
    const-string v1, "read LocalDateTime error "

    .line 347
    .line 348
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 357
    .line 358
    .line 359
    const/4 v0, 0x0

    .line 360
    return-object v0

    .line 361
    :cond_11
    :goto_1
    iput-boolean v5, v2, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 362
    .line 363
    return-object v4

    .line 364
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime16()Ljava/time/LocalDateTime;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    return-object v0

    .line 369
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate11()Ljava/time/LocalDate;

    .line 370
    .line 371
    .line 372
    move-result-object v0

    .line 373
    if-nez v0, :cond_12

    .line 374
    .line 375
    return-object v4

    .line 376
    :cond_12
    sget-object v1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 377
    .line 378
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    return-object v0

    .line 383
    :pswitch_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate10()Ljava/time/LocalDate;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    if-nez v0, :cond_13

    .line 388
    .line 389
    return-object v4

    .line 390
    :cond_13
    sget-object v1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 391
    .line 392
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    return-object v0

    .line 397
    :pswitch_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate9()Ljava/time/LocalDate;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    if-nez v0, :cond_14

    .line 402
    .line 403
    return-object v4

    .line 404
    :cond_14
    sget-object v1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 405
    .line 406
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    return-object v0

    .line 411
    :pswitch_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate8()Ljava/time/LocalDate;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    if-nez v0, :cond_15

    .line 416
    .line 417
    return-object v4

    .line 418
    :cond_15
    sget-object v1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 419
    .line 420
    invoke-static {v0, v1}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    return-object v0

    .line 425
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public abstract readLocalDateTime12()Ljava/time/LocalDateTime;
.end method

.method public abstract readLocalDateTime14()Ljava/time/LocalDateTime;
.end method

.method public abstract readLocalDateTime16()Ljava/time/LocalDateTime;
.end method

.method public abstract readLocalDateTime17()Ljava/time/LocalDateTime;
.end method

.method public abstract readLocalDateTime18()Ljava/time/LocalDateTime;
.end method

.method public abstract readLocalDateTime19()Ljava/time/LocalDateTime;
.end method

.method public abstract readLocalDateTime20()Ljava/time/LocalDateTime;
.end method

.method public abstract readLocalDateTimeX(I)Ljava/time/LocalDateTime;
.end method

.method public readLocalTime()Ljava/time/LocalTime;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return-object v1

    .line 9
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isInt()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    return-object v0

    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getStringLength()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v2, 0x5

    .line 43
    if-eq v0, v2, :cond_6

    .line 44
    .line 45
    const/16 v2, 0xf

    .line 46
    .line 47
    if-eq v0, v2, :cond_5

    .line 48
    .line 49
    packed-switch v0, :pswitch_data_0

    .line 50
    .line 51
    .line 52
    packed-switch v0, :pswitch_data_1

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-nez v2, :cond_4

    .line 64
    .line 65
    const-string v2, "null"

    .line 66
    .line 67
    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v2

    .line 71
    if-eqz v2, :cond_2

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_3

    .line 79
    .line 80
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 81
    .line 82
    .line 83
    move-result-wide v0

    .line 84
    invoke-static {v0, v1}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 89
    .line 90
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {v0, v1}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    return-object v0

    .line 103
    :cond_3
    const-string v1, "not support len : "

    .line 104
    .line 105
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    const/4 v0, 0x0

    .line 113
    return-object v0

    .line 114
    :cond_4
    :goto_0
    return-object v1

    .line 115
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime20()Ljava/time/LocalDateTime;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    return-object v0

    .line 124
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime19()Ljava/time/LocalDateTime;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Ljava/time/LocalDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    return-object v0

    .line 133
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalTime18()Ljava/time/LocalTime;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    return-object v0

    .line 138
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalTime12()Ljava/time/LocalTime;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    return-object v0

    .line 143
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalTime11()Ljava/time/LocalTime;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    return-object v0

    .line 148
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalTime10()Ljava/time/LocalTime;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    return-object v0

    .line 153
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalTime9()Ljava/time/LocalTime;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    return-object v0

    .line 158
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalTime8()Ljava/time/LocalTime;

    .line 159
    .line 160
    .line 161
    move-result-object v0

    .line 162
    return-object v0

    .line 163
    :cond_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalTime15()Ljava/time/LocalTime;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    return-object v0

    .line 168
    :cond_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalTime5()Ljava/time/LocalTime;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    return-object v0

    .line 173
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    :pswitch_data_1
    .packed-switch 0x12
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public abstract readLocalTime10()Ljava/time/LocalTime;
.end method

.method public abstract readLocalTime11()Ljava/time/LocalTime;
.end method

.method public abstract readLocalTime12()Ljava/time/LocalTime;
.end method

.method public abstract readLocalTime15()Ljava/time/LocalTime;
.end method

.method public abstract readLocalTime18()Ljava/time/LocalTime;
.end method

.method public abstract readLocalTime5()Ljava/time/LocalTime;
.end method

.method public abstract readLocalTime8()Ljava/time/LocalTime;
.end method

.method public abstract readLocalTime9()Ljava/time/LocalTime;
.end method

.method public abstract readMillis19()J
.end method

.method public final readMillisFromString()J
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 3
    .line 4
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 5
    .line 6
    iget-object v2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormat:Ljava/lang/String;

    .line 7
    .line 8
    const/4 v3, 0x1

    .line 9
    const-wide/16 v4, 0x3e8

    .line 10
    .line 11
    const-wide/16 v6, 0x0

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    iget-boolean v9, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmss19:Z

    .line 17
    .line 18
    if-nez v9, :cond_0

    .line 19
    .line 20
    iget-boolean v9, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmssT19:Z

    .line 21
    .line 22
    if-nez v9, :cond_0

    .line 23
    .line 24
    iget-boolean v9, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMdd8:Z

    .line 25
    .line 26
    if-nez v9, :cond_0

    .line 27
    .line 28
    iget-boolean v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->formatISO8601:Z

    .line 29
    .line 30
    if-eqz v1, :cond_b

    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getStringLength()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    const-string v9, "TODO : "

    .line 37
    .line 38
    packed-switch v1, :pswitch_data_0

    .line 39
    .line 40
    .line 41
    :pswitch_0
    goto/16 :goto_2

    .line 42
    .line 43
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime20()Ljava/time/LocalDateTime;

    .line 44
    .line 45
    .line 46
    move-result-object v9

    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readMillis19()J

    .line 50
    .line 51
    .line 52
    move-result-wide v9

    .line 53
    cmp-long v11, v9, v6

    .line 54
    .line 55
    if-nez v11, :cond_2

    .line 56
    .line 57
    iget-boolean v11, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 58
    .line 59
    if-nez v11, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime19()Ljava/time/LocalDateTime;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    goto/16 :goto_3

    .line 67
    .line 68
    :cond_2
    :goto_0
    return-wide v9

    .line 69
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime18()Ljava/time/LocalDateTime;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    goto/16 :goto_3

    .line 74
    .line 75
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime17()Ljava/time/LocalDateTime;

    .line 76
    .line 77
    .line 78
    move-result-object v9

    .line 79
    goto/16 :goto_3

    .line 80
    .line 81
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime16()Ljava/time/LocalDateTime;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    goto :goto_3

    .line 86
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime14()Ljava/time/LocalDateTime;

    .line 87
    .line 88
    .line 89
    move-result-object v9

    .line 90
    goto :goto_3

    .line 91
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime12()Ljava/time/LocalDateTime;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    goto :goto_3

    .line 96
    :pswitch_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate11()Ljava/time/LocalDate;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    if-eqz v9, :cond_6

    .line 101
    .line 102
    sget-object v10, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 103
    .line 104
    invoke-static {v9, v10}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 105
    .line 106
    .line 107
    move-result-object v9

    .line 108
    goto :goto_3

    .line 109
    :pswitch_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate10()Ljava/time/LocalDate;

    .line 110
    .line 111
    .line 112
    move-result-object v10

    .line 113
    if-nez v10, :cond_5

    .line 114
    .line 115
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    const-string v1, "0000-00-00"

    .line 120
    .line 121
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_3

    .line 126
    .line 127
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 128
    .line 129
    return-wide v6

    .line 130
    :cond_3
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    if-eqz v1, :cond_4

    .line 135
    .line 136
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 137
    .line 138
    .line 139
    move-result-wide v0

    .line 140
    return-wide v0

    .line 141
    :cond_4
    invoke-static {v9, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    :goto_1
    const-wide/16 v0, 0x0

    .line 149
    .line 150
    return-wide v0

    .line 151
    :cond_5
    sget-object v9, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 152
    .line 153
    invoke-static {v10, v9}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    goto :goto_3

    .line 158
    :pswitch_a
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate9()Ljava/time/LocalDate;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    if-eqz v9, :cond_6

    .line 163
    .line 164
    sget-object v10, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 165
    .line 166
    invoke-static {v9, v10}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 167
    .line 168
    .line 169
    move-result-object v9

    .line 170
    goto :goto_3

    .line 171
    :cond_6
    :goto_2
    move-object v9, v8

    .line 172
    goto :goto_3

    .line 173
    :pswitch_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate8()Ljava/time/LocalDate;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    if-eqz v10, :cond_1b

    .line 178
    .line 179
    sget-object v9, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 180
    .line 181
    invoke-static {v10, v9}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    :goto_3
    if-eqz v9, :cond_7

    .line 186
    .line 187
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 188
    .line 189
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 190
    .line 191
    .line 192
    move-result-object v1

    .line 193
    invoke-static {v9, v1, v8}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 194
    .line 195
    .line 196
    move-result-object v1

    .line 197
    goto :goto_4

    .line 198
    :cond_7
    const/16 v9, 0x14

    .line 199
    .line 200
    if-lt v1, v9, :cond_9

    .line 201
    .line 202
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReader;->readZonedDateTimeX(I)Ljava/time/ZonedDateTime;

    .line 203
    .line 204
    .line 205
    move-result-object v9

    .line 206
    if-nez v9, :cond_8

    .line 207
    .line 208
    const/16 v10, 0x20

    .line 209
    .line 210
    if-lt v1, v10, :cond_8

    .line 211
    .line 212
    const/16 v10, 0x23

    .line 213
    .line 214
    if-gt v1, v10, :cond_8

    .line 215
    .line 216
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    invoke-static {v1, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->parseZonedDateTime(Ljava/lang/String;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    goto :goto_4

    .line 225
    :cond_8
    move-object v1, v9

    .line 226
    goto :goto_4

    .line 227
    :cond_9
    move-object v1, v8

    .line 228
    :goto_4
    if-eqz v1, :cond_b

    .line 229
    .line 230
    invoke-interface {v1}, Ljava/time/chrono/ChronoZonedDateTime;->toEpochSecond()J

    .line 231
    .line 232
    .line 233
    move-result-wide v2

    .line 234
    invoke-virtual {v1}, Ljava/time/ZonedDateTime;->toLocalTime()Ljava/time/LocalTime;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    invoke-virtual {v0}, Ljava/time/LocalTime;->getNano()I

    .line 239
    .line 240
    .line 241
    move-result v0

    .line 242
    cmp-long v1, v2, v6

    .line 243
    .line 244
    const v6, 0xf4240

    .line 245
    .line 246
    .line 247
    if-gez v1, :cond_a

    .line 248
    .line 249
    if-lez v0, :cond_a

    .line 250
    .line 251
    const-wide/16 v7, 0x1

    .line 252
    .line 253
    add-long/2addr v2, v7

    .line 254
    mul-long/2addr v2, v4

    .line 255
    div-int/2addr v0, v6

    .line 256
    add-int/lit16 v0, v0, -0x3e8

    .line 257
    .line 258
    :goto_5
    int-to-long v0, v0

    .line 259
    add-long/2addr v2, v0

    .line 260
    return-wide v2

    .line 261
    :cond_a
    mul-long/2addr v2, v4

    .line 262
    div-int/2addr v0, v6

    .line 263
    goto :goto_5

    .line 264
    :cond_b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 269
    .line 270
    .line 271
    move-result v9

    .line 272
    if-nez v9, :cond_1a

    .line 273
    .line 274
    const-string v9, "null"

    .line 275
    .line 276
    invoke-virtual {v9, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    if-eqz v9, :cond_c

    .line 281
    .line 282
    goto/16 :goto_8

    .line 283
    .line 284
    :cond_c
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 285
    .line 286
    iget-boolean v9, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->formatMillis:Z

    .line 287
    .line 288
    if-nez v9, :cond_18

    .line 289
    .line 290
    iget-boolean v3, v3, Lcom/alibaba/fastjson2/JSONReader$Context;->formatUnixTime:Z

    .line 291
    .line 292
    if-eqz v3, :cond_d

    .line 293
    .line 294
    goto/16 :goto_7

    .line 295
    .line 296
    :cond_d
    const/16 v3, 0x2d

    .line 297
    .line 298
    if-eqz v2, :cond_11

    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 301
    .line 302
    .line 303
    move-result v4

    .line 304
    if-nez v4, :cond_11

    .line 305
    .line 306
    const-string v0, "yyyy-MM-dd HH:mm:ss"

    .line 307
    .line 308
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eqz v0, :cond_10

    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    const/4 v2, 0x4

    .line 319
    if-lt v0, v2, :cond_e

    .line 320
    .line 321
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    if-eq v0, v3, :cond_f

    .line 326
    .line 327
    :cond_e
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    if-eqz v0, :cond_f

    .line 332
    .line 333
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 334
    .line 335
    .line 336
    move-result-wide v0

    .line 337
    return-wide v0

    .line 338
    :cond_f
    invoke-static {v1, v8}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis19(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 339
    .line 340
    .line 341
    move-result-wide v0

    .line 342
    return-wide v0

    .line 343
    :cond_10
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 344
    .line 345
    invoke-direct {v0, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    :try_start_0
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 353
    .line 354
    .line 355
    move-result-wide v0
    :try_end_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_0

    .line 356
    return-wide v0

    .line 357
    :catch_0
    const-string v2, "parse date error, "

    .line 358
    .line 359
    const-string v3, ", expect format "

    .line 360
    .line 361
    invoke-static {v2, v1, v3}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    invoke-virtual {v0}, Ljava/text/SimpleDateFormat;->toPattern()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    invoke-static {v1, v0}, Lah/a;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    goto/16 :goto_1

    .line 373
    .line 374
    :cond_11
    const-string v4, "0000-00-00T00:00:00"

    .line 375
    .line 376
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    if-nez v4, :cond_17

    .line 381
    .line 382
    const-string v4, "0001-01-01T00:00:00+08:00"

    .line 383
    .line 384
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    if-eqz v4, :cond_12

    .line 389
    .line 390
    goto :goto_6

    .line 391
    :cond_12
    const-string v4, "/Date("

    .line 392
    .line 393
    invoke-virtual {v1, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    if-eqz v4, :cond_15

    .line 398
    .line 399
    const-string v4, ")/"

    .line 400
    .line 401
    invoke-virtual {v1, v4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 402
    .line 403
    .line 404
    move-result v4

    .line 405
    if-eqz v4, :cond_15

    .line 406
    .line 407
    const/4 v2, 0x6

    .line 408
    const/4 v4, 0x2

    .line 409
    invoke-static {v4, v2, v1}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    const/16 v2, 0x2b

    .line 414
    .line 415
    invoke-virtual {v1, v2}, Ljava/lang/String;->indexOf(I)I

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    const/4 v4, -0x1

    .line 420
    if-ne v2, v4, :cond_13

    .line 421
    .line 422
    invoke-virtual {v1, v3}, Ljava/lang/String;->indexOf(I)I

    .line 423
    .line 424
    .line 425
    move-result v2

    .line 426
    :cond_13
    if-eq v2, v4, :cond_14

    .line 427
    .line 428
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    :cond_14
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 433
    .line 434
    .line 435
    move-result-wide v0

    .line 436
    return-wide v0

    .line 437
    :cond_15
    invoke-static {v1}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-eqz v0, :cond_16

    .line 442
    .line 443
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 444
    .line 445
    .line 446
    move-result-wide v0

    .line 447
    return-wide v0

    .line 448
    :cond_16
    new-instance v0, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    const-string v3, "format "

    .line 451
    .line 452
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    const-string v2, " not support, input "

    .line 459
    .line 460
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    goto/16 :goto_1

    .line 478
    .line 479
    :cond_17
    :goto_6
    return-wide v6

    .line 480
    :cond_18
    :goto_7
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 481
    .line 482
    .line 483
    move-result-wide v0

    .line 484
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 485
    .line 486
    iget-boolean v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->formatUnixTime:Z

    .line 487
    .line 488
    if-eqz v2, :cond_19

    .line 489
    .line 490
    mul-long/2addr v0, v4

    .line 491
    :cond_19
    return-wide v0

    .line 492
    :cond_1a
    :goto_8
    iput-boolean v3, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 493
    .line 494
    return-wide v6

    .line 495
    :cond_1b
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    invoke-static {v0, v9}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    goto/16 :goto_1

    .line 503
    .line 504
    nop

    .line 505
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_0
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public readNaN()D
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "not support"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public abstract readNull()V
.end method

.method public abstract readNullOrNewDate()Ljava/util/Date;
.end method

.method public readNumber()Ljava/lang/Number;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNumber0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    return-object v0
.end method

.method public abstract readNumber0()V
.end method

.method public readObject()Ljava/util/Map;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 2
    .line 3
    .line 4
    iget v0, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    add-int/2addr v0, v1

    .line 8
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 9
    .line 10
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 11
    .line 12
    iget v3, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->maxLevel:I

    .line 13
    .line 14
    if-ge v0, v3, :cond_13

    .line 15
    .line 16
    iget-object v0, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->objectSupplier:Ljava/util/function/Supplier;

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    const/4 v5, 0x0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    iget-wide v6, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 24
    .line 25
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->UseNativeObject:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 26
    .line 27
    iget-wide v8, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 28
    .line 29
    and-long/2addr v6, v8

    .line 30
    cmp-long v0, v6, v3

    .line 31
    .line 32
    if-eqz v0, :cond_0

    .line 33
    .line 34
    new-instance v0, Ljava/util/HashMap;

    .line 35
    .line 36
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    :goto_0
    move-object v2, v5

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    new-instance v0, Lcom/alibaba/fastjson2/JSONObject;

    .line 42
    .line 43
    invoke-direct {v0}, Lcom/alibaba/fastjson2/JSONObject;-><init>()V

    .line 44
    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    invoke-interface {v0}, Ljava/util/function/Supplier;->get()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, Ljava/util/Map;

    .line 52
    .line 53
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getInnerMap(Ljava/util/Map;)Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    :goto_1
    const/4 v6, 0x0

    .line 58
    move v7, v6

    .line 59
    :goto_2
    iget-char v8, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 60
    .line 61
    const/16 v9, 0x2f

    .line 62
    .line 63
    if-ne v8, v9, :cond_2

    .line 64
    .line 65
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipComment()V

    .line 66
    .line 67
    .line 68
    :cond_2
    iget-char v8, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 69
    .line 70
    const/16 v9, 0x7d

    .line 71
    .line 72
    if-ne v8, v9, :cond_5

    .line 73
    .line 74
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 75
    .line 76
    .line 77
    iget-char v2, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 78
    .line 79
    const/16 v3, 0x2c

    .line 80
    .line 81
    if-ne v2, v3, :cond_3

    .line 82
    .line 83
    move v6, v1

    .line 84
    :cond_3
    iput-boolean v6, p0, Lcom/alibaba/fastjson2/JSONReader;->comma:Z

    .line 85
    .line 86
    if-eqz v6, :cond_4

    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->next()V

    .line 89
    .line 90
    .line 91
    :cond_4
    iget v2, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 92
    .line 93
    sub-int/2addr v2, v1

    .line 94
    iput v2, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readFieldName()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    if-nez v8, :cond_b

    .line 102
    .line 103
    iget-char v8, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 104
    .line 105
    const/16 v9, 0x1a

    .line 106
    .line 107
    if-eq v8, v9, :cond_a

    .line 108
    .line 109
    const/16 v9, 0x2d

    .line 110
    .line 111
    if-eq v8, v9, :cond_9

    .line 112
    .line 113
    const/16 v9, 0x30

    .line 114
    .line 115
    if-lt v8, v9, :cond_6

    .line 116
    .line 117
    const/16 v9, 0x39

    .line 118
    .line 119
    if-gt v8, v9, :cond_6

    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_6
    const/16 v9, 0x7b

    .line 123
    .line 124
    if-ne v8, v9, :cond_7

    .line 125
    .line 126
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readObject()Ljava/util/Map;

    .line 127
    .line 128
    .line 129
    move-result-object v8

    .line 130
    goto :goto_4

    .line 131
    :cond_7
    const/16 v9, 0x5b

    .line 132
    .line 133
    if-ne v8, v9, :cond_8

    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readArray()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    goto :goto_4

    .line 140
    :cond_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameUnquote()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    goto :goto_4

    .line 145
    :cond_9
    :goto_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNumber0()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 149
    .line 150
    .line 151
    move-result-object v8

    .line 152
    :goto_4
    const/16 v9, 0x3a

    .line 153
    .line 154
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatch(C)Z

    .line 155
    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_a
    const-string v0, "input end"

    .line 159
    .line 160
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    const/4 v0, 0x0

    .line 164
    return-object v0

    .line 165
    :cond_b
    :goto_5
    if-nez v7, :cond_d

    .line 166
    .line 167
    iget-object v9, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 168
    .line 169
    iget-wide v9, v9, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 170
    .line 171
    sget-object v11, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnNotSupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 172
    .line 173
    iget-wide v11, v11, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 174
    .line 175
    and-long/2addr v9, v11

    .line 176
    cmp-long v9, v9, v3

    .line 177
    .line 178
    if-eqz v9, :cond_d

    .line 179
    .line 180
    const-string v9, "@type"

    .line 181
    .line 182
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v9

    .line 186
    if-nez v9, :cond_c

    .line 187
    .line 188
    goto :goto_6

    .line 189
    :cond_c
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-string v1, "autoType not support : "

    .line 194
    .line 195
    invoke-static {v1, v0}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    const/4 v0, 0x0

    .line 203
    return-object v0

    .line 204
    :cond_d
    :goto_6
    iget-char v9, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 205
    .line 206
    const-string v10, "illegal input "

    .line 207
    .line 208
    sparse-switch v9, :sswitch_data_0

    .line 209
    .line 210
    .line 211
    packed-switch v9, :pswitch_data_0

    .line 212
    .line 213
    .line 214
    new-instance v0, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 220
    .line 221
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    const/4 v0, 0x0

    .line 236
    return-object v0

    .line 237
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->skipComment()V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_9

    .line 241
    .line 242
    :sswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isReference()Z

    .line 243
    .line 244
    .line 245
    move-result v9

    .line 246
    if-eqz v9, :cond_e

    .line 247
    .line 248
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readReference()Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v9

    .line 252
    invoke-static {v9}, Lcom/alibaba/fastjson2/JSONPath;->of(Ljava/lang/String;)Lcom/alibaba/fastjson2/JSONPath;

    .line 253
    .line 254
    .line 255
    move-result-object v9

    .line 256
    invoke-virtual {p0, v0, v8, v9}, Lcom/alibaba/fastjson2/JSONReader;->addResolveTask(Ljava/util/Map;Ljava/lang/Object;Lcom/alibaba/fastjson2/JSONPath;)V

    .line 257
    .line 258
    .line 259
    :goto_7
    move-object v9, v5

    .line 260
    goto :goto_8

    .line 261
    :cond_e
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readObject()Ljava/util/Map;

    .line 262
    .line 263
    .line 264
    move-result-object v9

    .line 265
    goto :goto_8

    .line 266
    :sswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNull()V

    .line 267
    .line 268
    .line 269
    goto :goto_7

    .line 270
    :sswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readBoolValue()Z

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 275
    .line 276
    .line 277
    move-result-object v9

    .line 278
    goto :goto_8

    .line 279
    :sswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readArray()Ljava/util/List;

    .line 280
    .line 281
    .line 282
    move-result-object v9

    .line 283
    goto :goto_8

    .line 284
    :sswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfSet()Z

    .line 285
    .line 286
    .line 287
    move-result v9

    .line 288
    if-eqz v9, :cond_f

    .line 289
    .line 290
    const-class v9, Ljava/util/Set;

    .line 291
    .line 292
    invoke-virtual {p0, v9}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/Class;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v9

    .line 296
    goto :goto_8

    .line 297
    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    .line 298
    .line 299
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 303
    .line 304
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    const/4 v0, 0x0

    .line 319
    return-object v0

    .line 320
    :sswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfInfinity()Z

    .line 321
    .line 322
    .line 323
    move-result v9

    .line 324
    if-eqz v9, :cond_10

    .line 325
    .line 326
    const-wide/high16 v9, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    .line 327
    .line 328
    invoke-static {v9, v10}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 329
    .line 330
    .line 331
    move-result-object v9

    .line 332
    goto :goto_8

    .line 333
    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 334
    .line 335
    invoke-direct {v0, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 336
    .line 337
    .line 338
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 339
    .line 340
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 352
    .line 353
    .line 354
    const/4 v0, 0x0

    .line 355
    return-object v0

    .line 356
    :pswitch_1
    :sswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNumber0()V

    .line 357
    .line 358
    .line 359
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 360
    .line 361
    .line 362
    move-result-object v9

    .line 363
    goto :goto_8

    .line 364
    :sswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 365
    .line 366
    .line 367
    move-result-object v9

    .line 368
    :goto_8
    if-nez v9, :cond_11

    .line 369
    .line 370
    iget-object v10, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 371
    .line 372
    iget-wide v10, v10, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 373
    .line 374
    sget-object v12, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreNullPropertyValue:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 375
    .line 376
    iget-wide v12, v12, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 377
    .line 378
    and-long/2addr v10, v12

    .line 379
    cmp-long v10, v10, v3

    .line 380
    .line 381
    if-eqz v10, :cond_11

    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_11
    if-eqz v2, :cond_12

    .line 385
    .line 386
    invoke-interface {v2, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    goto :goto_9

    .line 390
    :cond_12
    invoke-interface {v0, v8, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    .line 392
    .line 393
    :goto_9
    add-int/lit8 v7, v7, 0x1

    .line 394
    .line 395
    goto/16 :goto_2

    .line 396
    .line 397
    :cond_13
    const-string v0, "level too large : "

    .line 398
    .line 399
    iget v1, p0, Lcom/alibaba/fastjson2/JSONReader;->level:I

    .line 400
    .line 401
    invoke-static {v1, v0}, Lah/a;->y(ILjava/lang/String;)V

    .line 402
    .line 403
    .line 404
    const/4 v0, 0x0

    .line 405
    return-object v0

    .line 406
    nop

    .line 407
    :sswitch_data_0
    .sparse-switch
        0x22 -> :sswitch_7
        0x27 -> :sswitch_7
        0x2b -> :sswitch_6
        0x2d -> :sswitch_6
        0x49 -> :sswitch_5
        0x53 -> :sswitch_4
        0x5b -> :sswitch_3
        0x66 -> :sswitch_2
        0x6e -> :sswitch_1
        0x74 -> :sswitch_2
        0x7b -> :sswitch_0
    .end sparse-switch

    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    :pswitch_data_0
    .packed-switch 0x2f
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch
.end method

.method public final readObject(Ljava/lang/Object;J)V
    .locals 6

    if-eqz p1, :cond_3

    .line 407
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 408
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    iget-wide v2, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    or-long/2addr v2, p2

    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONReader$Feature;

    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    and-long/2addr v2, v4

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    .line 409
    :goto_0
    iget-object v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->provider:Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;

    invoke-virtual {v1, v0, v2}, Lcom/alibaba/fastjson2/reader/ObjectReaderProvider;->getObjectReader(Ljava/lang/reflect/Type;Z)Lcom/alibaba/fastjson2/reader/ObjectReader;

    move-result-object v0

    .line 410
    instance-of v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;

    if-eqz v1, :cond_1

    .line 411
    check-cast v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;

    .line 412
    invoke-virtual {v0, p0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    return-void

    .line 413
    :cond_1
    instance-of v0, p1, Ljava/util/Map;

    if-eqz v0, :cond_2

    .line 414
    check-cast p1, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/util/Map;J)V

    return-void

    .line 415
    :cond_2
    const-string p1, "read object not support"

    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    return-void

    .line 416
    :cond_3
    const-string p1, "object is null"

    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    return-void
.end method

.method public final varargs readObject(Ljava/lang/Object;[Lcom/alibaba/fastjson2/JSONReader$Feature;)V
    .locals 5

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    .line 417
    :goto_0
    array-length v3, p2

    if-ge v2, v3, :cond_0

    .line 418
    aget-object v3, p2, v2

    iget-wide v3, v3, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    or-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 419
    :cond_0
    invoke-virtual {p0, p1, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->readObject(Ljava/lang/Object;J)V

    return-void
.end method

.method public abstract readOffsetDateTime()Ljava/time/OffsetDateTime;
.end method

.method public readOffsetTime()Ljava/time/OffsetTime;
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "TODO"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw v0
.end method

.method public abstract readPattern()Ljava/lang/String;
.end method

.method public abstract readReference()Ljava/lang/String;
.end method

.method public abstract readString()Ljava/lang/String;
.end method

.method public readStringArray()[Ljava/lang/String;
    .locals 5

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x6e

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    return-object v2

    .line 15
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_7

    .line 20
    .line 21
    const/4 v0, 0x0

    .line 22
    move v1, v0

    .line 23
    :goto_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayEnd()Z

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-eqz v3, :cond_3

    .line 28
    .line 29
    if-nez v2, :cond_1

    .line 30
    .line 31
    new-array v2, v0, [Ljava/lang/String;

    .line 32
    .line 33
    :cond_1
    array-length v0, v2

    .line 34
    if-ne v0, v1, :cond_2

    .line 35
    .line 36
    return-object v2

    .line 37
    :cond_2
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, [Ljava/lang/String;

    .line 42
    .line 43
    return-object v0

    .line 44
    :cond_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isEnd()Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-nez v3, :cond_6

    .line 49
    .line 50
    if-nez v2, :cond_4

    .line 51
    .line 52
    const/16 v2, 0x10

    .line 53
    .line 54
    new-array v2, v2, [Ljava/lang/String;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_4
    array-length v3, v2

    .line 58
    if-ne v1, v3, :cond_5

    .line 59
    .line 60
    array-length v3, v2

    .line 61
    shl-int/lit8 v3, v3, 0x1

    .line 62
    .line 63
    invoke-static {v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    check-cast v2, [Ljava/lang/String;

    .line 68
    .line 69
    :cond_5
    :goto_1
    add-int/lit8 v3, v1, 0x1

    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    aput-object v4, v2, v1

    .line 76
    .line 77
    move v1, v3

    .line 78
    goto :goto_0

    .line 79
    :cond_6
    const-string v0, "input end"

    .line 80
    .line 81
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const/4 v0, 0x0

    .line 89
    return-object v0

    .line 90
    :cond_7
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 91
    .line 92
    const/16 v1, 0x22

    .line 93
    .line 94
    if-eq v0, v1, :cond_9

    .line 95
    .line 96
    const/16 v1, 0x27

    .line 97
    .line 98
    if-ne v0, v1, :cond_8

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_8
    const-string v0, "not support input"

    .line 102
    .line 103
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const/4 v0, 0x0

    .line 111
    return-object v0

    .line 112
    :cond_9
    :goto_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    if-eqz v1, :cond_a

    .line 121
    .line 122
    return-object v2

    .line 123
    :cond_a
    const-string v1, "not support input "

    .line 124
    .line 125
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    const/4 v0, 0x0

    .line 137
    return-object v0
.end method

.method public final readStringNotMatch()Ljava/lang/String;
    .locals 6

    .line 1
    iget-char v0, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 2
    .line 3
    const/16 v1, 0x2b

    .line 4
    .line 5
    if-eq v0, v1, :cond_7

    .line 6
    .line 7
    const/16 v1, 0x2d

    .line 8
    .line 9
    if-eq v0, v1, :cond_7

    .line 10
    .line 11
    const/16 v1, 0x5b

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eq v0, v1, :cond_4

    .line 15
    .line 16
    const/16 v1, 0x66

    .line 17
    .line 18
    if-eq v0, v1, :cond_2

    .line 19
    .line 20
    const/16 v1, 0x6e

    .line 21
    .line 22
    if-eq v0, v1, :cond_1

    .line 23
    .line 24
    const/16 v1, 0x74

    .line 25
    .line 26
    if-eq v0, v1, :cond_2

    .line 27
    .line 28
    const/16 v1, 0x7b

    .line 29
    .line 30
    if-eq v0, v1, :cond_0

    .line 31
    .line 32
    packed-switch v0, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "illegal input : "

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    return-object v0

    .line 60
    :cond_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readObject()Ljava/util/Map;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->toString(Ljava/util/Map;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNull()V

    .line 70
    .line 71
    .line 72
    return-object v2

    .line 73
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readBoolValue()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iput-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->boolValue:Z

    .line 78
    .line 79
    if-eqz v0, :cond_3

    .line 80
    .line 81
    const-string v0, "true"

    .line 82
    .line 83
    return-object v0

    .line 84
    :cond_3
    const-string v0, "false"

    .line 85
    .line 86
    return-object v0

    .line 87
    :cond_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readArray()Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    const/4 v3, 0x1

    .line 96
    if-ne v1, v3, :cond_6

    .line 97
    .line 98
    const/4 v1, 0x0

    .line 99
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    if-nez v1, :cond_5

    .line 104
    .line 105
    return-object v2

    .line 106
    :cond_5
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 107
    .line 108
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 109
    .line 110
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->DisableStringArrayUnwrapping:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 111
    .line 112
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 113
    .line 114
    and-long/2addr v2, v4

    .line 115
    const-wide/16 v4, 0x0

    .line 116
    .line 117
    cmp-long v2, v2, v4

    .line 118
    .line 119
    if-nez v2, :cond_6

    .line 120
    .line 121
    instance-of v2, v1, Ljava/lang/String;

    .line 122
    .line 123
    if-eqz v2, :cond_6

    .line 124
    .line 125
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    return-object v0

    .line 130
    :cond_6
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->toString(Ljava/util/List;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    return-object v0

    .line 135
    :cond_7
    :pswitch_0
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readNumber0()V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getNumber()Ljava/lang/Number;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0

    .line 147
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public readTypeHashCode()J
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readValueHashCode()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public abstract readUUID()Ljava/util/UUID;
.end method

.method public abstract readValueHashCode()J
.end method

.method public readZonedDateTime()Ljava/time/ZonedDateTime;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isInt()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v1, 0x3e8

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readInt64Value()J

    .line 10
    .line 11
    .line 12
    move-result-wide v3

    .line 13
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 14
    .line 15
    iget-boolean v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatUnixTime:Z

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    mul-long/2addr v3, v1

    .line 20
    :cond_0
    invoke-static {v3, v4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    :cond_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->isString()Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz v0, :cond_e

    .line 41
    .line 42
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 43
    .line 44
    iget-object v4, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->dateFormat:Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v4, :cond_2

    .line 47
    .line 48
    iget-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmss19:Z

    .line 49
    .line 50
    if-nez v4, :cond_2

    .line 51
    .line 52
    iget-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMddhhmmssT19:Z

    .line 53
    .line 54
    if-nez v4, :cond_2

    .line 55
    .line 56
    iget-boolean v4, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatyyyyMMdd8:Z

    .line 57
    .line 58
    if-nez v4, :cond_2

    .line 59
    .line 60
    iget-boolean v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatISO8601:Z

    .line 61
    .line 62
    if-eqz v0, :cond_7

    .line 63
    .line 64
    :cond_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->getStringLength()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    packed-switch v0, :pswitch_data_0

    .line 69
    .line 70
    .line 71
    :pswitch_0
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->readZonedDateTimeX(I)Ljava/time/ZonedDateTime;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    if-eqz v0, :cond_3

    .line 76
    .line 77
    return-object v0

    .line 78
    :cond_3
    :goto_0
    move-object v0, v3

    .line 79
    goto :goto_1

    .line 80
    :pswitch_1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime20()Ljava/time/LocalDateTime;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    goto :goto_1

    .line 85
    :pswitch_2
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime19()Ljava/time/LocalDateTime;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    goto :goto_1

    .line 90
    :pswitch_3
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime18()Ljava/time/LocalDateTime;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    goto :goto_1

    .line 95
    :pswitch_4
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime17()Ljava/time/LocalDateTime;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    goto :goto_1

    .line 100
    :pswitch_5
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDateTime16()Ljava/time/LocalDateTime;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    goto :goto_1

    .line 105
    :pswitch_6
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate11()Ljava/time/LocalDate;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    sget-object v4, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 110
    .line 111
    invoke-static {v0, v4}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    goto :goto_1

    .line 116
    :pswitch_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate10()Ljava/time/LocalDate;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    if-nez v0, :cond_4

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    sget-object v4, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 124
    .line 125
    invoke-static {v0, v4}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    goto :goto_1

    .line 130
    :pswitch_8
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate9()Ljava/time/LocalDate;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-nez v0, :cond_5

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_5
    sget-object v4, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 138
    .line 139
    invoke-static {v0, v4}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    goto :goto_1

    .line 144
    :pswitch_9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readLocalDate8()Ljava/time/LocalDate;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    if-nez v0, :cond_6

    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_6
    sget-object v4, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 152
    .line 153
    invoke-static {v0, v4}, Ljava/time/LocalDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;)Ljava/time/LocalDateTime;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    :goto_1
    if-eqz v0, :cond_7

    .line 158
    .line 159
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 160
    .line 161
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-static {v0, v1, v3}, Ljava/time/ZonedDateTime;->ofLocal(Ljava/time/LocalDateTime;Ljava/time/ZoneId;Ljava/time/ZoneOffset;)Ljava/time/ZonedDateTime;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    return-object v0

    .line 170
    :cond_7
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->readString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-nez v4, :cond_d

    .line 179
    .line 180
    const-string v4, "null"

    .line 181
    .line 182
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v4

    .line 186
    if-eqz v4, :cond_8

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_8
    iget-object v3, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 190
    .line 191
    invoke-virtual {v3}, Lcom/alibaba/fastjson2/JSONReader$Context;->getDateFormatter()Ljava/time/format/DateTimeFormatter;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    if-eqz v3, :cond_a

    .line 196
    .line 197
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 198
    .line 199
    iget-boolean v1, v1, Lcom/alibaba/fastjson2/JSONReader$Context;->formatHasHour:Z

    .line 200
    .line 201
    if-nez v1, :cond_9

    .line 202
    .line 203
    invoke-static {v0, v3}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDate;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    sget-object v1, Ljava/time/LocalTime;->MIN:Ljava/time/LocalTime;

    .line 208
    .line 209
    iget-object v2, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 210
    .line 211
    invoke-virtual {v2}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    invoke-static {v0, v1, v2}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDate;Ljava/time/LocalTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    return-object v0

    .line 220
    :cond_9
    invoke-static {v0, v3}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 225
    .line 226
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-static {v0, v1}, Ljava/time/ZonedDateTime;->of(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    return-object v0

    .line 235
    :cond_a
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 236
    .line 237
    .line 238
    move-result v3

    .line 239
    if-eqz v3, :cond_c

    .line 240
    .line 241
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 242
    .line 243
    .line 244
    move-result-wide v3

    .line 245
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 246
    .line 247
    iget-boolean v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->formatUnixTime:Z

    .line 248
    .line 249
    if-eqz v0, :cond_b

    .line 250
    .line 251
    mul-long/2addr v3, v1

    .line 252
    :cond_b
    invoke-static {v3, v4}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    iget-object v1, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 257
    .line 258
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader$Context;->getZoneId()Ljava/time/ZoneId;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    invoke-virtual {v0, v1}, Ljava/time/Instant;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    return-object v0

    .line 267
    :cond_c
    invoke-static {v0}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;)Ljava/time/ZonedDateTime;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    return-object v0

    .line 272
    :cond_d
    :goto_2
    return-object v3

    .line 273
    :cond_e
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    if-eqz v0, :cond_f

    .line 278
    .line 279
    return-object v3

    .line 280
    :cond_f
    const-string v0, "TODO : "

    .line 281
    .line 282
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 283
    .line 284
    invoke-static {v1, v0}, Lah/a;->t(ILjava/lang/String;)V

    .line 285
    .line 286
    .line 287
    const/4 v0, 0x0

    .line 288
    return-object v0

    .line 289
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public abstract readZonedDateTimeX(I)Ljava/time/ZonedDateTime;
.end method

.method public reset(Lcom/alibaba/fastjson2/JSONReader$SavePoint;)V
    .locals 1

    .line 1
    iget v0, p1, Lcom/alibaba/fastjson2/JSONReader$SavePoint;->offset:I

    .line 2
    .line 3
    iput v0, p0, Lcom/alibaba/fastjson2/JSONReader;->offset:I

    .line 4
    .line 5
    iget p1, p1, Lcom/alibaba/fastjson2/JSONReader$SavePoint;->current:I

    .line 6
    .line 7
    int-to-char p1, p1

    .line 8
    iput-char p1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 9
    .line 10
    return-void
.end method

.method public final setTypeRedirect(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/JSONReader;->typeRedirect:Z

    .line 2
    .line 3
    return-void
.end method

.method public abstract skipComment()V
.end method

.method public abstract skipName()Z
.end method

.method public abstract skipValue()V
.end method

.method public startArray()I
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/JSONReader;->nextIfArrayStart()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const v0, 0x7fffffff

    .line 8
    .line 9
    .line 10
    return v0

    .line 11
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "illegal input, expect \'[\', but "

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-char v1, p0, Lcom/alibaba/fastjson2/JSONReader;->ch:C

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    return v0
.end method

.method public final toInt(Ljava/util/List;)I
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    instance-of v1, v0, Ljava/lang/Number;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    check-cast v0, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    instance-of v1, v0, Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    return p1

    .line 35
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 36
    .line 37
    const-string v1, "parseLong error, field : value "

    .line 38
    .line 39
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 p1, 0x0

    .line 57
    return p1
.end method

.method public final toInt32(Ljava/lang/String;)I
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/16 v0, 0x2c

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v1, v1, -0x4

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const-string v0, "parseInt error, value : "

    .line 23
    .line 24
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    return p1

    .line 37
    :cond_1
    :goto_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->toIntValue(Ljava/lang/Object;)I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1
.end method

.method public final toInt64(Ljava/lang/String;)J
    .locals 2

    .line 1
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/IOUtils;->isNumber(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_2

    .line 6
    .line 7
    const/16 v0, 0x2c

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    add-int/lit8 v1, v1, -0x4

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/16 v1, 0xa

    .line 27
    .line 28
    if-le v0, v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/16 v1, 0x28

    .line 35
    .line 36
    if-ge v0, v1, :cond_1

    .line 37
    .line 38
    :try_start_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 39
    .line 40
    iget-object v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->zoneId:Ljava/time/ZoneId;

    .line 41
    .line 42
    invoke-static {p1, v0}, Lcom/alibaba/fastjson2/util/DateUtils;->parseMillis(Ljava/lang/String;Ljava/time/ZoneId;)J

    .line 43
    .line 44
    .line 45
    move-result-wide v0
    :try_end_0
    .catch Ljava/time/DateTimeException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lcom/alibaba/fastjson2/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    return-wide v0

    .line 47
    :catch_0
    :cond_1
    const-string v0, "parseLong error, value : "

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const-wide/16 v0, 0x0

    .line 61
    .line 62
    return-wide v0

    .line 63
    :cond_2
    :goto_0
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->toLongValue(Ljava/lang/Object;)J

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    return-wide v0
.end method

.method public final toLong(Ljava/util/Map;)J
    .locals 2

    .line 1
    const-string v0, "val"

    .line 2
    .line 3
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Ljava/lang/Number;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Ljava/lang/Number;

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    int-to-long v0, p1

    .line 18
    return-wide v0

    .line 19
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    const-string v1, "parseLong error, value : "

    .line 22
    .line 23
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p0, p1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-wide/16 v0, 0x0

    .line 41
    .line 42
    return-wide v0
.end method

.method public final toNumber(Ljava/util/List;)Ljava/lang/Number;
    .locals 2

    .line 1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    instance-of v0, p1, Ljava/lang/Number;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    check-cast p1, Ljava/lang/Number;

    .line 18
    .line 19
    return-object p1

    .line 20
    :cond_0
    instance-of v0, p1, Ljava/lang/String;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    check-cast p1, Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {p1}, Lcom/alibaba/fastjson2/util/TypeUtils;->toBigDecimal(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    return-object p1

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    return-object p1
.end method

.method public final toNumber(Ljava/util/Map;)Ljava/lang/Number;
    .locals 1

    .line 33
    const-string v0, "val"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 34
    instance-of v0, p1, Ljava/lang/Number;

    if-eqz v0, :cond_0

    .line 35
    check-cast p1, Ljava/lang/Number;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final toString(Ljava/util/List;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {}, Lcom/alibaba/fastjson2/JSONWriter;->of()Lcom/alibaba/fastjson2/JSONWriter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONWriter;->setRootObject(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONWriter;->write(Ljava/util/List;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method

.method public final toString(Ljava/util/Map;)Ljava/lang/String;
    .locals 1

    .line 16
    invoke-static {}, Lcom/alibaba/fastjson2/JSONWriter;->of()Lcom/alibaba/fastjson2/JSONWriter;

    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONWriter;->setRootObject(Ljava/lang/Object;)V

    .line 18
    invoke-virtual {v0, p1}, Lcom/alibaba/fastjson2/JSONWriter;->write(Ljava/util/Map;)V

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final valueError()Lcom/alibaba/fastjson2/JSONException;
    .locals 2

    .line 1
    new-instance v0, Lcom/alibaba/fastjson2/JSONException;

    .line 2
    .line 3
    const-string v1, "illegal value"

    .line 4
    .line 5
    invoke-virtual {p0, v1}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-direct {v0, v1}, Lcom/alibaba/fastjson2/JSONException;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public wasNull()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/JSONReader;->wasNull:Z

    .line 2
    .line 3
    return v0
.end method
