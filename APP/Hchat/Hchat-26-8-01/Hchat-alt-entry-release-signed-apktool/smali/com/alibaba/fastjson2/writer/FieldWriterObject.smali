.class public Lcom/alibaba/fastjson2/writer/FieldWriterObject;
.super Lcom/alibaba/fastjson2/writer/FieldWriter;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/alibaba/fastjson2/writer/FieldWriter<",
        "TT;>;"
    }
.end annotation


# static fields
.field static final initValueClassUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater<",
            "Lcom/alibaba/fastjson2/writer/FieldWriterObject;",
            "Ljava/lang/Class;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final array:Z

.field volatile initValueClass:Ljava/lang/Class;

.field final number:Z

.field final unwrapped:Z

.field protected writeUsing:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-class v0, Ljava/lang/Class;

    .line 2
    .line 3
    const-string v1, "initValueClass"

    .line 4
    .line 5
    const-class v2, Lcom/alibaba/fastjson2/writer/FieldWriterObject;

    .line 6
    .line 7
    invoke-static {v2, v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->initValueClassUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p10}, Lcom/alibaba/fastjson2/writer/FieldWriter;-><init>(Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/reflect/Field;Ljava/lang/reflect/Method;)V

    .line 2
    .line 3
    .line 4
    move-object p1, p0

    .line 5
    const-wide/high16 p5, 0x2000000000000L

    .line 6
    .line 7
    and-long p2, p3, p5

    .line 8
    .line 9
    const-wide/16 p4, 0x0

    .line 10
    .line 11
    cmp-long p2, p2, p4

    .line 12
    .line 13
    const/4 p3, 0x0

    .line 14
    const/4 p4, 0x1

    .line 15
    if-eqz p2, :cond_0

    .line 16
    .line 17
    move p2, p4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move p2, p3

    .line 20
    :goto_0
    iput-boolean p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->unwrapped:Z

    .line 21
    .line 22
    const-class p2, Ljava/util/Currency;

    .line 23
    .line 24
    if-ne p8, p2, :cond_1

    .line 25
    .line 26
    iput-object p8, p1, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->initValueClass:Ljava/lang/Class;

    .line 27
    .line 28
    sget-object p2, Lcom/alibaba/fastjson2/writer/ObjectWriterImplCurrency;->INSTANCE_FOR_FIELD:Lcom/alibaba/fastjson2/writer/ObjectWriterImplCurrency;

    .line 29
    .line 30
    iput-object p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 31
    .line 32
    :cond_1
    invoke-virtual {p8}, Ljava/lang/Class;->isArray()Z

    .line 33
    .line 34
    .line 35
    move-result p2

    .line 36
    if-nez p2, :cond_2

    .line 37
    .line 38
    const-class p2, Ljava/util/Collection;

    .line 39
    .line 40
    invoke-virtual {p2, p8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    if-nez p2, :cond_2

    .line 45
    .line 46
    const-class p2, Ljava/util/concurrent/atomic/AtomicLongArray;

    .line 47
    .line 48
    if-eq p8, p2, :cond_2

    .line 49
    .line 50
    const-class p2, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    .line 51
    .line 52
    if-ne p8, p2, :cond_3

    .line 53
    .line 54
    :cond_2
    move p3, p4

    .line 55
    :cond_3
    iput-boolean p3, p1, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->array:Z

    .line 56
    .line 57
    const-class p2, Ljava/lang/Number;

    .line 58
    .line 59
    invoke-virtual {p2, p8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    iput-boolean p2, p1, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->number:Z

    .line 64
    .line 65
    return-void
.end method

.method private getObjectWriterTypeMatch(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1

    .line 1
    const-class v0, Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldType:Ljava/lang/reflect/Type;

    .line 18
    .line 19
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->of(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    :goto_0
    sget-object p2, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriterUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 34
    .line 35
    :cond_2
    const/4 v0, 0x0

    .line 36
    invoke-virtual {p2, p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_3
    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    return-object p1
.end method

.method private getObjectWriterTypeNotMatch(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 4

    .line 1
    const-class v0, Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldType:Ljava/lang/reflect/Type;

    .line 18
    .line 19
    invoke-static {p1, p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->of(Ljava/lang/reflect/Type;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    return-object p1

    .line 24
    :cond_0
    invoke-static {p2}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;->of(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriterImplMap;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget-object v2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldType:Ljava/lang/reflect/Type;

    .line 35
    .line 36
    iget-object v3, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 37
    .line 38
    invoke-static {v2, v3, v0, v1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_2
    if-nez v1, :cond_3

    .line 43
    .line 44
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    return-object p1

    .line 49
    :cond_3
    return-object v1
.end method

.method private getObjectWriterVoid(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 9
    .line 10
    iget-wide v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getFeatures()J

    .line 13
    .line 14
    .line 15
    move-result-wide v6

    .line 16
    or-long/2addr v4, v6

    .line 17
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->FieldBased:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 18
    .line 19
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 20
    .line 21
    and-long/2addr v4, v6

    .line 22
    const-wide/16 v6, 0x0

    .line 23
    .line 24
    cmp-long v4, v4, v6

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    move v4, v2

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v4, v1

    .line 31
    :goto_0
    iget-object v0, v0, Lcom/alibaba/fastjson2/JSONWriter$Context;->provider:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;

    .line 32
    .line 33
    invoke-virtual {v0, p2, p2, v4}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->getObjectWriterFromCache(Ljava/lang/reflect/Type;Ljava/lang/Class;Z)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    move-object v0, v3

    .line 39
    :goto_1
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->decimalFormat:Ljava/text/DecimalFormat;

    .line 40
    .line 41
    const-class v5, [Ljava/lang/Float;

    .line 42
    .line 43
    if-ne p2, v5, :cond_3

    .line 44
    .line 45
    if-eqz v4, :cond_2

    .line 46
    .line 47
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 48
    .line 49
    const-class v5, Ljava/lang/Float;

    .line 50
    .line 51
    invoke-direct {v0, v5, v4}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;->FLOAT_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    const-class v5, [Ljava/lang/Double;

    .line 59
    .line 60
    if-ne p2, v5, :cond_5

    .line 61
    .line 62
    if-eqz v4, :cond_4

    .line 63
    .line 64
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 65
    .line 66
    const-class v5, Ljava/lang/Double;

    .line 67
    .line 68
    invoke-direct {v0, v5, v4}, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;-><init>(Ljava/lang/Class;Ljava/text/DecimalFormat;)V

    .line 69
    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_4
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;->DOUBLE_ARRAY:Lcom/alibaba/fastjson2/writer/ObjectWriterArrayFinal;

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_5
    const-class v5, [F

    .line 76
    .line 77
    if-ne p2, v5, :cond_7

    .line 78
    .line 79
    if-eqz v4, :cond_6

    .line 80
    .line 81
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloatValueArray;

    .line 82
    .line 83
    invoke-direct {v0, v4}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloatValueArray;-><init>(Ljava/text/DecimalFormat;)V

    .line 84
    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_6
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloatValueArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplFloatValueArray;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_7
    const-class v5, [D

    .line 91
    .line 92
    if-ne p2, v5, :cond_9

    .line 93
    .line 94
    if-eqz v4, :cond_8

    .line 95
    .line 96
    new-instance v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDoubleValueArray;

    .line 97
    .line 98
    invoke-direct {v0, v4}, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDoubleValueArray;-><init>(Ljava/text/DecimalFormat;)V

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_8
    sget-object v0, Lcom/alibaba/fastjson2/writer/ObjectWriterImplDoubleValueArray;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterImplDoubleValueArray;

    .line 103
    .line 104
    :cond_9
    :goto_2
    if-nez v0, :cond_a

    .line 105
    .line 106
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldType:Ljava/lang/reflect/Type;

    .line 107
    .line 108
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 109
    .line 110
    iget-object v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->format:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v0, v4, v5, v3, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getObjectWriter(Ljava/lang/reflect/Type;Ljava/lang/Class;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    :cond_a
    if-nez v0, :cond_10

    .line 117
    .line 118
    sget-object v4, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->initValueClassUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 119
    .line 120
    :cond_b
    invoke-virtual {v4, p0, v3, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_c

    .line 125
    .line 126
    move v1, v2

    .line 127
    goto :goto_3

    .line 128
    :cond_c
    invoke-virtual {v4, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    if-eqz v0, :cond_b

    .line 133
    .line 134
    :goto_3
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    if-eqz v1, :cond_f

    .line 139
    .line 140
    sget-object p2, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriterUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 141
    .line 142
    :cond_d
    invoke-virtual {p2, p0, v3, p1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    if-eqz v0, :cond_e

    .line 147
    .line 148
    return-object p1

    .line 149
    :cond_e
    invoke-virtual {p2, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    if-eqz v0, :cond_d

    .line 154
    .line 155
    :cond_f
    return-object p1

    .line 156
    :cond_10
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 157
    .line 158
    if-nez p1, :cond_15

    .line 159
    .line 160
    sget-object p1, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->initValueClassUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 161
    .line 162
    :cond_11
    invoke-virtual {p1, p0, v3, p2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    if-eqz v1, :cond_14

    .line 167
    .line 168
    sget-object v1, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriterUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 169
    .line 170
    :cond_12
    invoke-virtual {v1, p0, v3, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    move-result p1

    .line 174
    if-eqz p1, :cond_13

    .line 175
    .line 176
    return-object v0

    .line 177
    :cond_13
    invoke-virtual {v1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    if-eqz p1, :cond_12

    .line 182
    .line 183
    return-object v0

    .line 184
    :cond_14
    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    if-eqz v1, :cond_11

    .line 189
    .line 190
    :cond_15
    return-object v0
.end method

.method public static typeMatch(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const-class v0, Ljava/lang/Integer;

    .line 6
    .line 7
    if-eq p1, v0, :cond_7

    .line 8
    .line 9
    :cond_0
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    if-ne p0, v0, :cond_1

    .line 12
    .line 13
    const-class v0, Ljava/lang/Long;

    .line 14
    .line 15
    if-eq p1, v0, :cond_7

    .line 16
    .line 17
    :cond_1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    if-ne p0, v0, :cond_2

    .line 20
    .line 21
    const-class v0, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-eq p1, v0, :cond_7

    .line 24
    .line 25
    :cond_2
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    if-ne p0, v0, :cond_3

    .line 28
    .line 29
    const-class v0, Ljava/lang/Short;

    .line 30
    .line 31
    if-eq p1, v0, :cond_7

    .line 32
    .line 33
    :cond_3
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 34
    .line 35
    if-ne p0, v0, :cond_4

    .line 36
    .line 37
    const-class v0, Ljava/lang/Byte;

    .line 38
    .line 39
    if-eq p1, v0, :cond_7

    .line 40
    .line 41
    :cond_4
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    if-ne p0, v0, :cond_5

    .line 44
    .line 45
    const-class v0, Ljava/lang/Float;

    .line 46
    .line 47
    if-eq p1, v0, :cond_7

    .line 48
    .line 49
    :cond_5
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    if-ne p0, v0, :cond_6

    .line 52
    .line 53
    const-class v0, Ljava/lang/Double;

    .line 54
    .line 55
    if-eq p1, v0, :cond_7

    .line 56
    .line 57
    :cond_6
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 58
    .line 59
    if-ne p0, v0, :cond_8

    .line 60
    .line 61
    const-class p0, Ljava/lang/Character;

    .line 62
    .line 63
    if-ne p1, p0, :cond_8

    .line 64
    .line 65
    :cond_7
    const/4 p0, 0x1

    .line 66
    return p0

    .line 67
    :cond_8
    const/4 p0, 0x0

    .line 68
    return p0
.end method

.method private writeInternal(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONWriter;",
            "TT;)Z"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p2

    .line 2
    .line 3
    iget-wide v2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->getFeatures()J

    .line 6
    .line 7
    .line 8
    move-result-wide v4

    .line 9
    or-long/2addr v4, v2

    .line 10
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClassSerializable:Z

    .line 11
    .line 12
    const-wide/16 v8, 0x0

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-nez v2, :cond_0

    .line 16
    .line 17
    sget-object v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 18
    .line 19
    iget-wide v6, v2, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 20
    .line 21
    and-long/2addr v6, v4

    .line 22
    cmp-long v2, v6, v8

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    return v3

    .line 27
    :cond_0
    iget-boolean v2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->backReference:Z

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual/range {p1 .. p2}, Lcom/alibaba/fastjson2/JSONWriter;->containsReference(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_1

    .line 36
    .line 37
    return v3

    .line 38
    :cond_1
    :try_start_0
    invoke-virtual {p0, v0}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    const/4 v10, 0x1

    .line 43
    if-nez v2, :cond_b

    .line 44
    .line 45
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 46
    .line 47
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 48
    .line 49
    and-long/2addr v6, v4

    .line 50
    cmp-long v0, v6, v8

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 55
    .line 56
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 57
    .line 58
    and-long/2addr v6, v4

    .line 59
    cmp-long v0, v6, v8

    .line 60
    .line 61
    if-eqz v0, :cond_7

    .line 62
    .line 63
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->number:Z

    .line 64
    .line 65
    if-nez v0, :cond_7

    .line 66
    .line 67
    :cond_2
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NotWriteDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 68
    .line 69
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 70
    .line 71
    and-long/2addr v6, v4

    .line 72
    cmp-long v0, v6, v8

    .line 73
    .line 74
    if-nez v0, :cond_7

    .line 75
    .line 76
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 77
    .line 78
    .line 79
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->array:Z

    .line 80
    .line 81
    if-eqz v0, :cond_3

    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeArrayNull()V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->number:Z

    .line 88
    .line 89
    if-eqz v0, :cond_4

    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNumberNull()V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_4
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 96
    .line 97
    const-class v2, Ljava/lang/Appendable;

    .line 98
    .line 99
    if-eq v0, v2, :cond_6

    .line 100
    .line 101
    const-class v2, Ljava/lang/StringBuffer;

    .line 102
    .line 103
    if-eq v0, v2, :cond_6

    .line 104
    .line 105
    const-class v2, Ljava/lang/StringBuilder;

    .line 106
    .line 107
    if-ne v0, v2, :cond_5

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_5
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeObjectNull(Ljava/lang/Class;)V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_6
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeStringNull()V

    .line 115
    .line 116
    .line 117
    :goto_1
    return v10

    .line 118
    :cond_7
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullNumberAsZero:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 119
    .line 120
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 121
    .line 122
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->NullAsDefaultValue:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 123
    .line 124
    iget-wide v11, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 125
    .line 126
    or-long/2addr v6, v11

    .line 127
    and-long/2addr v6, v4

    .line 128
    cmp-long v0, v6, v8

    .line 129
    .line 130
    if-eqz v0, :cond_8

    .line 131
    .line 132
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->number:Z

    .line 133
    .line 134
    if-eqz v0, :cond_8

    .line 135
    .line 136
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeInt32(I)V

    .line 140
    .line 141
    .line 142
    return v10

    .line 143
    :cond_8
    sget-object v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNullBooleanAsFalse:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 144
    .line 145
    iget-wide v6, v0, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 146
    .line 147
    or-long/2addr v6, v11

    .line 148
    and-long/2addr v4, v6

    .line 149
    cmp-long v0, v4, v8

    .line 150
    .line 151
    if-eqz v0, :cond_a

    .line 152
    .line 153
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 154
    .line 155
    const-class v2, Ljava/lang/Boolean;

    .line 156
    .line 157
    if-eq v0, v2, :cond_9

    .line 158
    .line 159
    const-class v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 160
    .line 161
    if-ne v0, v2, :cond_a

    .line 162
    .line 163
    :cond_9
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeBool(Z)V

    .line 167
    .line 168
    .line 169
    return v10

    .line 170
    :cond_a
    return v3

    .line 171
    :cond_b
    if-ne v2, v0, :cond_c

    .line 172
    .line 173
    iget-object v6, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 174
    .line 175
    const-class v7, Ljava/lang/Throwable;

    .line 176
    .line 177
    if-ne v6, v7, :cond_c

    .line 178
    .line 179
    iget-object v6, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->field:Ljava/lang/reflect/Field;

    .line 180
    .line 181
    if-eqz v6, :cond_c

    .line 182
    .line 183
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v6

    .line 187
    if-ne v6, v7, :cond_c

    .line 188
    .line 189
    return v3

    .line 190
    :cond_c
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreNoneSerializable:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 191
    .line 192
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 193
    .line 194
    and-long/2addr v6, v4

    .line 195
    cmp-long v6, v6, v8

    .line 196
    .line 197
    if-eqz v6, :cond_d

    .line 198
    .line 199
    instance-of v6, v2, Ljava/io/Serializable;

    .line 200
    .line 201
    if-nez v6, :cond_d

    .line 202
    .line 203
    return v3

    .line 204
    :cond_d
    sget-object v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->IgnoreEmpty:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 205
    .line 206
    iget-wide v6, v6, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 207
    .line 208
    and-long/2addr v6, v4

    .line 209
    cmp-long v6, v6, v8

    .line 210
    .line 211
    if-eqz v6, :cond_f

    .line 212
    .line 213
    instance-of v6, v2, Ljava/util/Collection;

    .line 214
    .line 215
    if-eqz v6, :cond_e

    .line 216
    .line 217
    move-object v6, v2

    .line 218
    check-cast v6, Ljava/util/Collection;

    .line 219
    .line 220
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    if-eqz v6, :cond_e

    .line 225
    .line 226
    return v3

    .line 227
    :cond_e
    instance-of v6, v2, Ljava/util/Map;

    .line 228
    .line 229
    if-eqz v6, :cond_f

    .line 230
    .line 231
    move-object v6, v2

    .line 232
    check-cast v6, Ljava/util/Map;

    .line 233
    .line 234
    invoke-interface {v6}, Ljava/util/Map;->isEmpty()Z

    .line 235
    .line 236
    .line 237
    move-result v6

    .line 238
    if-eqz v6, :cond_f

    .line 239
    .line 240
    return v3

    .line 241
    :cond_f
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect(Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v6

    .line 245
    if-eqz v6, :cond_11

    .line 246
    .line 247
    if-ne v2, v0, :cond_10

    .line 248
    .line 249
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 250
    .line 251
    .line 252
    const-string v0, ".."

    .line 253
    .line 254
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    return v10

    .line 258
    :cond_10
    invoke-virtual {p1, p0, v2}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(Lcom/alibaba/fastjson2/writer/FieldWriter;Ljava/lang/Object;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    if-eqz v0, :cond_11

    .line 263
    .line 264
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    return v10

    .line 274
    :cond_11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    move-result-object v0

    .line 278
    const-class v3, [B

    .line 279
    .line 280
    if-ne v0, v3, :cond_12

    .line 281
    .line 282
    check-cast v2, [B

    .line 283
    .line 284
    invoke-virtual {p0, p1, v2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeBinary(Lcom/alibaba/fastjson2/JSONWriter;[B)V

    .line 285
    .line 286
    .line 287
    return v10

    .line 288
    :cond_12
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 289
    .line 290
    .line 291
    move-result-object v7

    .line 292
    if-eqz v7, :cond_19

    .line 293
    .line 294
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->unwrapped:Z

    .line 295
    .line 296
    if-eqz v0, :cond_13

    .line 297
    .line 298
    move-object v1, p0

    .line 299
    move-object v3, v2

    .line 300
    move-object v2, p1

    .line 301
    invoke-virtual/range {v1 .. v7}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->writeWithUnwrapped(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;JZLcom/alibaba/fastjson2/writer/ObjectWriter;)Z

    .line 302
    .line 303
    .line 304
    move-result v0

    .line 305
    move-object v2, v3

    .line 306
    move v11, v6

    .line 307
    move v3, v0

    .line 308
    move-object v0, v7

    .line 309
    if-eqz v3, :cond_14

    .line 310
    .line 311
    return v10

    .line 312
    :cond_13
    move v11, v6

    .line 313
    move-object v0, v7

    .line 314
    :cond_14
    invoke-virtual/range {p0 .. p1}, Lcom/alibaba/fastjson2/writer/FieldWriter;->writeFieldName(Lcom/alibaba/fastjson2/JSONWriter;)V

    .line 315
    .line 316
    .line 317
    iget-boolean v3, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 318
    .line 319
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 320
    .line 321
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->BeanToArray:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 322
    .line 323
    iget-wide v12, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 324
    .line 325
    and-long/2addr v12, v5

    .line 326
    cmp-long v4, v12, v8

    .line 327
    .line 328
    if-eqz v4, :cond_16

    .line 329
    .line 330
    move v4, v3

    .line 331
    iget-object v3, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 332
    .line 333
    if-eqz v4, :cond_15

    .line 334
    .line 335
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldType:Ljava/lang/reflect/Type;

    .line 336
    .line 337
    move-object v1, p1

    .line 338
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 339
    .line 340
    .line 341
    goto :goto_2

    .line 342
    :cond_15
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldType:Ljava/lang/reflect/Type;

    .line 343
    .line 344
    move-object v1, p1

    .line 345
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMapping(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 346
    .line 347
    .line 348
    goto :goto_2

    .line 349
    :cond_16
    move v4, v3

    .line 350
    iget-object v3, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 351
    .line 352
    if-eqz v4, :cond_17

    .line 353
    .line 354
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldType:Ljava/lang/reflect/Type;

    .line 355
    .line 356
    move-object v1, p1

    .line 357
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 358
    .line 359
    .line 360
    goto :goto_2

    .line 361
    :cond_17
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldType:Ljava/lang/reflect/Type;

    .line 362
    .line 363
    move-object v1, p1

    .line 364
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 365
    .line 366
    .line 367
    :goto_2
    if-eqz v11, :cond_18

    .line 368
    .line 369
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 370
    .line 371
    .line 372
    :cond_18
    return v10

    .line 373
    :cond_19
    const-string v1, "get objectWriter error : "

    .line 374
    .line 375
    invoke-static {v0, v1}, Lp/a;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    const/4 v0, 0x0

    .line 383
    return v0

    .line 384
    :catch_0
    move-exception v0

    .line 385
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isIgnoreErrorGetter()Z

    .line 386
    .line 387
    .line 388
    move-result v1

    .line 389
    if-eqz v1, :cond_1a

    .line 390
    .line 391
    return v3

    .line 392
    :cond_1a
    throw v0
.end method


# virtual methods
.method public getInitWriter()Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 2
    .line 3
    return-object v0
.end method

.method public getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->initValueClass:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_8

    .line 4
    .line 5
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 6
    .line 7
    sget-object v2, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider$VoidObjectWriter;->INSTANCE:Lcom/alibaba/fastjson2/writer/ObjectWriterProvider$VoidObjectWriter;

    .line 8
    .line 9
    if-ne v1, v2, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    if-eq v0, p2, :cond_4

    .line 13
    .line 14
    iget-boolean v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->writeUsing:Z

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-nez v1, :cond_4

    .line 23
    .line 24
    :cond_1
    const-class v1, Ljava/util/Map;

    .line 25
    .line 26
    if-ne v0, v1, :cond_2

    .line 27
    .line 28
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_4

    .line 33
    .line 34
    :cond_2
    const-class v1, Ljava/util/List;

    .line 35
    .line 36
    if-ne v0, v1, :cond_3

    .line 37
    .line 38
    invoke-virtual {v0, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_3

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_3
    const/4 v1, 0x0

    .line 46
    goto :goto_1

    .line 47
    :cond_4
    :goto_0
    const/4 v1, 0x1

    .line 48
    :goto_1
    if-nez v1, :cond_5

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_5

    .line 55
    .line 56
    invoke-static {v0, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->typeMatch(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    :cond_5
    if-eqz v1, :cond_7

    .line 61
    .line 62
    iget-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 63
    .line 64
    if-nez v0, :cond_6

    .line 65
    .line 66
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->getObjectWriterTypeMatch(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1

    .line 71
    :cond_6
    iget-object p1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 72
    .line 73
    return-object p1

    .line 74
    :cond_7
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->getObjectWriterTypeNotMatch(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    return-object p1

    .line 79
    :cond_8
    :goto_2
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->getObjectWriterVoid(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    return-object p1
.end method

.method public unwrapped()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->unwrapped:Z

    .line 2
    .line 3
    return v0
.end method

.method public write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONWriter;",
            "TT;)Z"
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONWriter;->context:Lcom/alibaba/fastjson2/JSONWriter$Context;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/JSONWriter$Context;->getFeatures()J

    .line 4
    .line 5
    .line 6
    move-result-wide v1

    .line 7
    iget-wide v3, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 8
    .line 9
    or-long/2addr v3, v1

    .line 10
    invoke-virtual {v0, v3, v4}, Lcom/alibaba/fastjson2/JSONWriter$Context;->setFeatures(J)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->writeInternal(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    invoke-virtual {v0, v1, v2}, Lcom/alibaba/fastjson2/JSONWriter$Context;->setFeatures(J)V

    .line 18
    .line 19
    .line 20
    return p1
.end method

.method public writeValue(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONWriter;",
            "TT;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->getFieldValue(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v2

    .line 5
    if-nez v2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->initValueClass:Ljava/lang/Class;

    .line 16
    .line 17
    if-nez v1, :cond_3

    .line 18
    .line 19
    iput-object v0, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->initValueClass:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-virtual {p0, p1, v0}, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->getObjectWriter(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    sget-object v3, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriterUpdater:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 26
    .line 27
    :cond_1
    const/4 v4, 0x0

    .line 28
    invoke-virtual {v3, p0, v4, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-eqz v4, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    invoke-virtual {v3, p0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_3
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriterObject;->initValueClass:Ljava/lang/Class;

    .line 43
    .line 44
    if-ne v1, v0, :cond_4

    .line 45
    .line 46
    iget-object v1, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->initObjectWriter:Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_4
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :goto_0
    if-eqz v1, :cond_b

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isRefDetect()Z

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    if-eqz v3, :cond_5

    .line 60
    .line 61
    invoke-static {v0}, Lcom/alibaba/fastjson2/writer/ObjectWriterProvider;->isNotReferenceDetect(Ljava/lang/Class;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-nez v0, :cond_5

    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    :goto_1
    move v7, v0

    .line 69
    goto :goto_2

    .line 70
    :cond_5
    const/4 v0, 0x0

    .line 71
    goto :goto_1

    .line 72
    :goto_2
    if-eqz v7, :cond_7

    .line 73
    .line 74
    if-ne v2, p2, :cond_6

    .line 75
    .line 76
    const-string p2, ".."

    .line 77
    .line 78
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_6
    iget-object p2, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 83
    .line 84
    invoke-virtual {p1, p2, v2}, Lcom/alibaba/fastjson2/JSONWriter;->setPath(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    if-eqz p2, :cond_7

    .line 89
    .line 90
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->writeReference(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_7
    iget-boolean p2, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 98
    .line 99
    if-eqz p2, :cond_9

    .line 100
    .line 101
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->isBeanToArray()Z

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iget-object v3, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 106
    .line 107
    if-eqz p2, :cond_8

    .line 108
    .line 109
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 110
    .line 111
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 112
    .line 113
    move-object v0, v1

    .line 114
    move-object v1, p1

    .line 115
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeArrayMappingJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 116
    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_8
    move-object v0, v1

    .line 120
    move-object v1, p1

    .line 121
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 122
    .line 123
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 124
    .line 125
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->writeJSONB(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_9
    move-object v0, v1

    .line 130
    move-object v1, p1

    .line 131
    iget-object v3, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldName:Ljava/lang/String;

    .line 132
    .line 133
    iget-object v4, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->fieldClass:Ljava/lang/Class;

    .line 134
    .line 135
    iget-wide v5, p0, Lcom/alibaba/fastjson2/writer/FieldWriter;->features:J

    .line 136
    .line 137
    invoke-interface/range {v0 .. v6}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/reflect/Type;J)V

    .line 138
    .line 139
    .line 140
    :goto_3
    if-eqz v7, :cond_a

    .line 141
    .line 142
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    :cond_a
    return-void

    .line 146
    :cond_b
    const-string p1, "get value writer error, valueType : "

    .line 147
    .line 148
    invoke-static {v0, p1}, Lp/a;->k(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    return-void
.end method

.method public final writeWithUnwrapped(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;JZLcom/alibaba/fastjson2/writer/ObjectWriter;)Z
    .locals 8

    .line 1
    instance-of v0, p2, Ljava/util/Map;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    iget-boolean p6, p1, Lcom/alibaba/fastjson2/JSONWriter;->jsonb:Z

    .line 7
    .line 8
    move-object v0, p2

    .line 9
    check-cast v0, Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    if-nez v2, :cond_0

    .line 44
    .line 45
    sget-object v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->WriteNulls:Lcom/alibaba/fastjson2/JSONWriter$Feature;

    .line 46
    .line 47
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONWriter$Feature;->mask:J

    .line 48
    .line 49
    and-long/2addr v4, p3

    .line 50
    const-wide/16 v6, 0x0

    .line 51
    .line 52
    cmp-long v4, v4, v6

    .line 53
    .line 54
    if-nez v4, :cond_0

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->writeName(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    if-nez p6, :cond_1

    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeColon()V

    .line 63
    .line 64
    .line 65
    :cond_1
    if-nez v2, :cond_2

    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONWriter;->writeNull()V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {p1, v3}, Lcom/alibaba/fastjson2/JSONWriter;->getObjectWriter(Ljava/lang/Class;)Lcom/alibaba/fastjson2/writer/ObjectWriter;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-interface {v3, p1, v2}, Lcom/alibaba/fastjson2/writer/ObjectWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_3
    if-eqz p5, :cond_4

    .line 84
    .line 85
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONWriter;->popPath(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    return v1

    .line 89
    :cond_5
    instance-of p3, p6, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 90
    .line 91
    if-eqz p3, :cond_7

    .line 92
    .line 93
    check-cast p6, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;

    .line 94
    .line 95
    iget-object p3, p6, Lcom/alibaba/fastjson2/writer/ObjectWriterAdapter;->fieldWriters:Ljava/util/List;

    .line 96
    .line 97
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object p3

    .line 101
    :goto_1
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result p4

    .line 105
    if-eqz p4, :cond_6

    .line 106
    .line 107
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object p4

    .line 111
    check-cast p4, Lcom/alibaba/fastjson2/writer/FieldWriter;

    .line 112
    .line 113
    invoke-virtual {p4, p1, p2}, Lcom/alibaba/fastjson2/writer/FieldWriter;->write(Lcom/alibaba/fastjson2/JSONWriter;Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_6
    return v1

    .line 118
    :cond_7
    const/4 p1, 0x0

    .line 119
    return p1
.end method
