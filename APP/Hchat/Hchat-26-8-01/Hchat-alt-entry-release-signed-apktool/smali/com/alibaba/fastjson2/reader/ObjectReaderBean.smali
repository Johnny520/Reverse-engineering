.class public abstract Lcom/alibaba/fastjson2/reader/ObjectReaderBean;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lcom/alibaba/fastjson2/reader/ObjectReader;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lcom/alibaba/fastjson2/reader/ObjectReader<",
        "TT;>;"
    }
.end annotation


# instance fields
.field protected autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

.field protected final buildFunction:Ljava/util/function/Function;

.field protected final creator:Ljava/util/function/Supplier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Supplier<",
            "TT;>;"
        }
    .end annotation
.end field

.field protected final disableSmartMatch:Z

.field protected extraFieldReader:Lcom/alibaba/fastjson2/reader/FieldReader;

.field protected final features:J

.field protected hasDefaultValue:Z

.field protected final objectClass:Ljava/lang/Class;

.field protected final serializable:Z

.field protected typeName:Ljava/lang/String;

.field protected typeNameHash:J


# direct methods
.method public constructor <init>(Ljava/lang/Class;Ljava/util/function/Supplier;Ljava/lang/String;JLjava/util/function/Function;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class;",
            "Ljava/util/function/Supplier<",
            "TT;>;",
            "Ljava/lang/String;",
            "J",
            "Ljava/util/function/Function;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->creator:Ljava/util/function/Supplier;

    .line 7
    .line 8
    iput-object p6, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->buildFunction:Ljava/util/function/Function;

    .line 9
    .line 10
    iput-wide p4, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 11
    .line 12
    iput-object p3, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->typeName:Ljava/lang/String;

    .line 13
    .line 14
    const-wide/16 v0, 0x0

    .line 15
    .line 16
    if-eqz p3, :cond_0

    .line 17
    .line 18
    invoke-static {p3}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 19
    .line 20
    .line 21
    move-result-wide p2

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-wide p2, v0

    .line 24
    :goto_0
    iput-wide p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->typeNameHash:J

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    const/4 p3, 0x1

    .line 28
    if-eqz p1, :cond_1

    .line 29
    .line 30
    const-class p6, Ljava/io/Serializable;

    .line 31
    .line 32
    invoke-virtual {p6, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    move p1, p3

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move p1, p2

    .line 41
    :goto_1
    iput-boolean p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->serializable:Z

    .line 42
    .line 43
    const-wide/high16 v2, 0x200000000000000L

    .line 44
    .line 45
    and-long/2addr p4, v2

    .line 46
    cmp-long p1, p4, v0

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    move p2, p3

    .line 51
    :cond_2
    iput-boolean p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->disableSmartMatch:Z

    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public acceptExtra(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;J)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->extraFieldReader:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0, p1, p2, p3}, Lcom/alibaba/fastjson2/reader/FieldReader;->acceptExtra(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    :goto_0
    const-string v0, "is"

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    const/4 v0, 0x2

    .line 21
    invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64LCase(Ljava/lang/String;)J

    .line 26
    .line 27
    .line 28
    move-result-wide v0

    .line 29
    invoke-interface {p0, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 36
    .line 37
    const-class v2, Ljava/lang/Boolean;

    .line 38
    .line 39
    if-eq v1, v2, :cond_2

    .line 40
    .line 41
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    if-ne v1, v2, :cond_3

    .line 44
    .line 45
    :cond_2
    invoke-virtual {v0, p1, p3}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_3
    sget-object p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnUnknownProperties:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 50
    .line 51
    iget-wide v0, p1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 52
    .line 53
    and-long p3, p4, v0

    .line 54
    .line 55
    const-wide/16 v0, 0x0

    .line 56
    .line 57
    cmp-long p1, p3, v0

    .line 58
    .line 59
    if-nez p1, :cond_4

    .line 60
    .line 61
    return-void

    .line 62
    :cond_4
    const-string p1, "Unknown Property "

    .line 63
    .line 64
    invoke-virtual {p1, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public final checkAutoType(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfMatchTypedAny()Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v8, 0x0

    .line 10
    if-eqz v2, :cond_9

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 13
    .line 14
    .line 15
    move-result-wide v2

    .line 16
    iget-object v9, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 17
    .line 18
    iget-wide v4, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 19
    .line 20
    or-long v4, p3, v4

    .line 21
    .line 22
    invoke-virtual {v1, v4, v5}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 23
    .line 24
    .line 25
    move-result-wide v10

    .line 26
    move-wide v3, v2

    .line 27
    invoke-virtual {v9}, Lcom/alibaba/fastjson2/JSONReader$Context;->getContextAutoTypeBeforeHandler()Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    const-string v12, " -> "

    .line 32
    .line 33
    const-string v13, "type not match. "

    .line 34
    .line 35
    const-wide/16 v14, 0x0

    .line 36
    .line 37
    if-eqz v2, :cond_3

    .line 38
    .line 39
    move-object/from16 v5, p2

    .line 40
    .line 41
    move-wide/from16 v6, p3

    .line 42
    .line 43
    invoke-interface/range {v2 .. v7}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(JLjava/lang/Class;J)Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    move-object v4, v5

    .line 48
    move-wide v5, v6

    .line 49
    if-nez v3, :cond_1

    .line 50
    .line 51
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v2, v3, v4, v5, v6}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    invoke-virtual {v4, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 62
    .line 63
    .line 64
    move-result v7

    .line 65
    if-nez v7, :cond_2

    .line 66
    .line 67
    invoke-virtual {v1, v5, v6}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 68
    .line 69
    .line 70
    move-result-wide v1

    .line 71
    sget-object v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreAutoTypeNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 72
    .line 73
    iget-wide v5, v5, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 74
    .line 75
    and-long/2addr v1, v5

    .line 76
    cmp-long v1, v1, v14

    .line 77
    .line 78
    if-eqz v1, :cond_0

    .line 79
    .line 80
    move-object v2, v4

    .line 81
    goto :goto_1

    .line 82
    :cond_0
    invoke-static {v13, v3, v12}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-static {v1, v2}, Lah/a;->r(Ljava/lang/StringBuilder;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    :goto_0
    const/4 v1, 0x0

    .line 94
    return-object v1

    .line 95
    :cond_1
    move-object v2, v3

    .line 96
    :cond_2
    :goto_1
    invoke-virtual {v9, v2}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 97
    .line 98
    .line 99
    move-result-object v1

    .line 100
    return-object v1

    .line 101
    :cond_3
    move-wide/from16 v5, p3

    .line 102
    .line 103
    move-wide v2, v3

    .line 104
    move-object/from16 v4, p2

    .line 105
    .line 106
    invoke-virtual/range {v1 .. v6}, Lcom/alibaba/fastjson2/JSONReader;->getObjectReaderAutoType(JLjava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    if-eqz v5, :cond_8

    .line 111
    .line 112
    invoke-interface {v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getObjectClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    if-eqz v4, :cond_5

    .line 117
    .line 118
    if-eqz v1, :cond_5

    .line 119
    .line 120
    invoke-virtual {v4, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 121
    .line 122
    .line 123
    move-result v1

    .line 124
    if-nez v1, :cond_5

    .line 125
    .line 126
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->IgnoreAutoTypeNotMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 127
    .line 128
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 129
    .line 130
    and-long/2addr v1, v10

    .line 131
    cmp-long v1, v1, v14

    .line 132
    .line 133
    if-eqz v1, :cond_4

    .line 134
    .line 135
    invoke-virtual {v9, v4}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    return-object v1

    .line 140
    :cond_4
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->typeName:Ljava/lang/String;

    .line 141
    .line 142
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    invoke-static {v13, v1, v12, v2}, Lah/a;->m(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 147
    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_5
    invoke-virtual {v0}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->getTypeNameHash()J

    .line 151
    .line 152
    .line 153
    move-result-wide v6

    .line 154
    cmp-long v1, v2, v6

    .line 155
    .line 156
    if-nez v1, :cond_6

    .line 157
    .line 158
    return-object v0

    .line 159
    :cond_6
    sget-object v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 160
    .line 161
    iget-wide v1, v1, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 162
    .line 163
    and-long/2addr v1, v10

    .line 164
    cmp-long v1, v1, v14

    .line 165
    .line 166
    if-nez v1, :cond_7

    .line 167
    .line 168
    return-object v8

    .line 169
    :cond_7
    return-object v5

    .line 170
    :cond_8
    const-string v2, "auotype not support"

    .line 171
    .line 172
    invoke-virtual {v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-static {v1}, Lah/a;->w(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_9
    return-object v8
.end method

.method public getAutoTypeBeforeHandler()Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 2
    .line 3
    return-object v0
.end method

.method public getObjectClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTypeName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->typeName:Ljava/lang/String;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/TypeUtils;->getTypeName(Ljava/lang/Class;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    iput-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->typeName:Ljava/lang/String;

    .line 14
    .line 15
    :cond_0
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->typeName:Ljava/lang/String;

    .line 16
    .line 17
    return-object v0
.end method

.method public getTypeNameHash()J
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->typeNameHash:J

    .line 2
    .line 3
    const-wide/16 v2, 0x0

    .line 4
    .line 5
    cmp-long v0, v0, v2

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->getTypeName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64(Ljava/lang/String;)J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->typeNameHash:J

    .line 20
    .line 21
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->typeNameHash:J

    .line 22
    .line 23
    return-wide v0
.end method

.method public initDefaultValue(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method public initStringFieldAsEmpty(Ljava/lang/Object;)V
    .locals 0

    .line 1
    return-void
.end method

.method public processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V
    .locals 2

    const-wide/16 v0, 0x0

    .line 121
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    return-void
.end method

.method public processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->extraFieldReader:Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    iget-wide v0, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->features:J

    .line 12
    .line 13
    or-long/2addr v0, p3

    .line 14
    invoke-virtual {p1, v0, v1}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 15
    .line 16
    .line 17
    move-result-wide v0

    .line 18
    sget-object v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 19
    .line 20
    iget-wide v2, v2, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 21
    .line 22
    and-long/2addr v0, v2

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getFieldName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v1, "is"

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    const/4 v1, 0x2

    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lcom/alibaba/fastjson2/util/Fnv;->hashCode64LCase(Ljava/lang/String;)J

    .line 47
    .line 48
    .line 49
    move-result-wide v0

    .line 50
    invoke-interface {p0, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    if-eqz v0, :cond_2

    .line 55
    .line 56
    if-eqz p2, :cond_2

    .line 57
    .line 58
    iget-object v1, v0, Lcom/alibaba/fastjson2/reader/FieldReader;->fieldClass:Ljava/lang/Class;

    .line 59
    .line 60
    const-class v4, Ljava/lang/Boolean;

    .line 61
    .line 62
    if-eq v1, v4, :cond_1

    .line 63
    .line 64
    sget-object v4, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    if-ne v1, v4, :cond_2

    .line 67
    .line 68
    :cond_1
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_2
    iget-object v0, p1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 73
    .line 74
    iget-object v0, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->extraProcessor:Lcom/alibaba/fastjson2/filter/ExtraProcessor;

    .line 75
    .line 76
    if-eqz v0, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getFieldName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    invoke-interface {v0, p3}, Lcom/alibaba/fastjson2/filter/ExtraProcessor;->getType(Ljava/lang/String;)Ljava/lang/reflect/Type;

    .line 83
    .line 84
    .line 85
    move-result-object p4

    .line 86
    invoke-virtual {p1, p4}, Lcom/alibaba/fastjson2/JSONReader;->read(Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-interface {v0, p2, p3, p1}, Lcom/alibaba/fastjson2/filter/ExtraProcessor;->processExtra(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_3
    invoke-virtual {p1, p3, p4}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 95
    .line 96
    .line 97
    move-result-wide p2

    .line 98
    sget-object p4, Lcom/alibaba/fastjson2/JSONReader$Feature;->ErrorOnUnknownProperties:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 99
    .line 100
    iget-wide v0, p4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 101
    .line 102
    and-long/2addr p2, v0

    .line 103
    cmp-long p2, p2, v2

    .line 104
    .line 105
    if-nez p2, :cond_4

    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->skipValue()V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :cond_4
    const-string p2, "Unknown Property "

    .line 112
    .line 113
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getFieldName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {p1, p2}, Lah/a;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-void
.end method

.method public processObjectInputSingleItemArray(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "expect {, but [, class "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->typeName:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz p3, :cond_0

    .line 18
    .line 19
    new-instance v1, Ljava/lang/StringBuilder;

    .line 20
    .line 21
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v0, ", parent fieldName "

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :cond_0
    invoke-virtual {p1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p3

    .line 43
    invoke-virtual {p1, p4, p5}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 44
    .line 45
    .line 46
    move-result-wide p4

    .line 47
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportSmartMatch:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 48
    .line 49
    iget-wide v0, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 50
    .line 51
    and-long/2addr p4, v0

    .line 52
    const-wide/16 v0, 0x0

    .line 53
    .line 54
    cmp-long p4, p4, v0

    .line 55
    .line 56
    if-eqz p4, :cond_3

    .line 57
    .line 58
    if-nez p2, :cond_1

    .line 59
    .line 60
    iget-object p2, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 61
    .line 62
    :cond_1
    invoke-virtual {p1, p2}, Lcom/alibaba/fastjson2/JSONReader;->readArray(Ljava/lang/reflect/Type;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    if-nez p2, :cond_2

    .line 73
    .line 74
    const/4 p1, 0x0

    .line 75
    return-object p1

    .line 76
    :cond_2
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 77
    .line 78
    .line 79
    move-result p2

    .line 80
    const/4 p4, 0x1

    .line 81
    if-ne p2, p4, :cond_3

    .line 82
    .line 83
    const/4 p2, 0x0

    .line 84
    invoke-interface {p1, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    return-object p1

    .line 89
    :cond_3
    invoke-static {p3}, Lah/a;->w(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    const/4 p1, 0x0

    .line 93
    return-object p1
.end method

.method public readFieldValueWithLCase(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;JJ)Z
    .locals 0

    .line 1
    invoke-virtual {p1, p5, p6}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 2
    .line 3
    .line 4
    move-result p5

    .line 5
    if-eqz p5, :cond_0

    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 8
    .line 9
    .line 10
    move-result-wide p5

    .line 11
    cmp-long p3, p5, p3

    .line 12
    .line 13
    if-eqz p3, :cond_0

    .line 14
    .line 15
    invoke-interface {p0, p5, p6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 16
    .line 17
    .line 18
    move-result-object p3

    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p3, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :cond_0
    const/4 p1, 0x0

    .line 27
    return p1
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/alibaba/fastjson2/JSONReader;",
            "Ljava/lang/reflect/Type;",
            "Ljava/lang/Object;",
            "J)TT;"
        }
    .end annotation

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    move-wide/from16 v2, p4

    .line 4
    .line 5
    iget-boolean v0, v1, Lcom/alibaba/fastjson2/JSONReader;->jsonb:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-interface/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readJSONBObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    return-object v0

    .line 14
    :cond_0
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNullOrEmptyString()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 22
    .line 23
    .line 24
    return-object v4

    .line 25
    :cond_1
    invoke-interface/range {p0 .. p0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFeatures()J

    .line 26
    .line 27
    .line 28
    move-result-wide v5

    .line 29
    or-long/2addr v5, v2

    .line 30
    invoke-virtual {v1, v5, v6}, Lcom/alibaba/fastjson2/JSONReader;->features(J)J

    .line 31
    .line 32
    .line 33
    move-result-wide v5

    .line 34
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->isArray()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const-wide/16 v7, 0x0

    .line 39
    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportArrayToBean:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 43
    .line 44
    iget-wide v9, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 45
    .line 46
    and-long/2addr v9, v5

    .line 47
    cmp-long v0, v9, v7

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    invoke-interface/range {p0 .. p5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readArrayMappingObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    return-object v0

    .line 56
    :cond_2
    move-object/from16 v0, p0

    .line 57
    .line 58
    move-object/from16 v2, p2

    .line 59
    .line 60
    move-object/from16 v3, p3

    .line 61
    .line 62
    move-wide v4, v5

    .line 63
    invoke-virtual/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processObjectInputSingleItemArray(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    move-object v6, v0

    .line 68
    return-object v1

    .line 69
    :cond_3
    move-wide v9, v5

    .line 70
    move-object/from16 v6, p0

    .line 71
    .line 72
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    .line 73
    .line 74
    .line 75
    move-result v0

    .line 76
    if-nez v0, :cond_7

    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->current()C

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    const/16 v5, 0x74

    .line 83
    .line 84
    if-eq v0, v5, :cond_6

    .line 85
    .line 86
    const/16 v5, 0x66

    .line 87
    .line 88
    if-ne v0, v5, :cond_4

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    const/16 v5, 0x22

    .line 92
    .line 93
    if-eq v0, v5, :cond_7

    .line 94
    .line 95
    const/16 v5, 0x27

    .line 96
    .line 97
    if-eq v0, v5, :cond_7

    .line 98
    .line 99
    const/16 v5, 0x7d

    .line 100
    .line 101
    if-ne v0, v5, :cond_5

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_5
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :goto_0
    const/4 v0, 0x0

    .line 112
    return-object v0

    .line 113
    :cond_6
    :goto_1
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readBoolValue()Z

    .line 114
    .line 115
    .line 116
    return-object v4

    .line 117
    :cond_7
    :goto_2
    const/4 v0, 0x0

    .line 118
    move-object v5, v4

    .line 119
    :goto_3
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    .line 120
    .line 121
    .line 122
    move-result v11

    .line 123
    if-eqz v11, :cond_a

    .line 124
    .line 125
    if-nez v5, :cond_8

    .line 126
    .line 127
    iget-object v0, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 128
    .line 129
    iget-wide v4, v0, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 130
    .line 131
    or-long/2addr v2, v4

    .line 132
    invoke-interface {v6, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(J)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    if-eqz v5, :cond_8

    .line 137
    .line 138
    sget-object v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->InitStringFieldAsEmpty:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 139
    .line 140
    iget-wide v2, v0, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 141
    .line 142
    and-long/2addr v2, v9

    .line 143
    cmp-long v0, v2, v7

    .line 144
    .line 145
    if-eqz v0, :cond_8

    .line 146
    .line 147
    invoke-virtual {v6, v5}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->initStringFieldAsEmpty(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_8
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    .line 151
    .line 152
    .line 153
    invoke-interface {v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getBuildFunction()Ljava/util/function/Function;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    if-eqz v0, :cond_9

    .line 158
    .line 159
    invoke-interface {v0, v5}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    return-object v0

    .line 164
    :cond_9
    return-object v5

    .line 165
    :cond_a
    iget-object v11, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 166
    .line 167
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    .line 168
    .line 169
    .line 170
    move-result-wide v12

    .line 171
    iget-object v14, v6, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 172
    .line 173
    if-nez v14, :cond_b

    .line 174
    .line 175
    invoke-virtual {v11}, Lcom/alibaba/fastjson2/JSONReader$Context;->getContextAutoTypeBeforeHandler()Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    :cond_b
    move-object v15, v14

    .line 180
    if-nez v0, :cond_15

    .line 181
    .line 182
    invoke-interface {v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getTypeKeyHash()J

    .line 183
    .line 184
    .line 185
    move-result-wide v16

    .line 186
    cmp-long v14, v12, v16

    .line 187
    .line 188
    if-nez v14, :cond_15

    .line 189
    .line 190
    invoke-interface {v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFeatures()J

    .line 191
    .line 192
    .line 193
    move-result-wide v16

    .line 194
    or-long v16, v2, v16

    .line 195
    .line 196
    move-object/from16 p2, v5

    .line 197
    .line 198
    iget-wide v4, v11, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 199
    .line 200
    or-long v19, v16, v4

    .line 201
    .line 202
    sget-object v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->SupportAutoType:Lcom/alibaba/fastjson2/JSONReader$Feature;

    .line 203
    .line 204
    iget-wide v4, v4, Lcom/alibaba/fastjson2/JSONReader$Feature;->mask:J

    .line 205
    .line 206
    and-long v4, v19, v4

    .line 207
    .line 208
    cmp-long v4, v4, v7

    .line 209
    .line 210
    if-nez v4, :cond_c

    .line 211
    .line 212
    if-eqz v15, :cond_16

    .line 213
    .line 214
    :cond_c
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->readTypeHashCode()J

    .line 215
    .line 216
    .line 217
    move-result-wide v16

    .line 218
    if-eqz v15, :cond_d

    .line 219
    .line 220
    iget-object v4, v6, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 221
    .line 222
    move-object/from16 v18, v4

    .line 223
    .line 224
    invoke-interface/range {v15 .. v20}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(JLjava/lang/Class;J)Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    move-result-object v4

    .line 228
    move-wide/from16 v21, v16

    .line 229
    .line 230
    move-wide/from16 v7, v19

    .line 231
    .line 232
    if-nez v4, :cond_e

    .line 233
    .line 234
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    iget-object v5, v6, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 239
    .line 240
    invoke-interface {v15, v4, v5, v7, v8}, Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;->apply(Ljava/lang/String;Ljava/lang/Class;J)Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    if-eqz v4, :cond_e

    .line 245
    .line 246
    invoke-virtual {v11, v4}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReader(Ljava/lang/reflect/Type;)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 247
    .line 248
    .line 249
    move-result-object v4

    .line 250
    goto :goto_4

    .line 251
    :cond_d
    move-wide/from16 v21, v16

    .line 252
    .line 253
    move-wide/from16 v7, v19

    .line 254
    .line 255
    :cond_e
    const/4 v4, 0x0

    .line 256
    :goto_4
    if-nez v4, :cond_f

    .line 257
    .line 258
    move-wide/from16 v14, v21

    .line 259
    .line 260
    invoke-interface {v6, v11, v14, v15}, Lcom/alibaba/fastjson2/reader/ObjectReader;->autoType(Lcom/alibaba/fastjson2/JSONReader$Context;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 261
    .line 262
    .line 263
    move-result-object v4

    .line 264
    :cond_f
    if-nez v4, :cond_11

    .line 265
    .line 266
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v4

    .line 270
    iget-object v5, v6, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->objectClass:Ljava/lang/Class;

    .line 271
    .line 272
    invoke-virtual {v11, v4, v5, v7, v8}, Lcom/alibaba/fastjson2/JSONReader$Context;->getObjectReaderAutoType(Ljava/lang/String;Ljava/lang/Class;J)Lcom/alibaba/fastjson2/reader/ObjectReader;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    if-eqz v5, :cond_10

    .line 277
    .line 278
    move-object/from16 v23, v5

    .line 279
    .line 280
    move-object v5, v4

    .line 281
    move-object/from16 v4, v23

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_10
    new-instance v0, Ljava/lang/StringBuilder;

    .line 285
    .line 286
    const-string v2, "No suitable ObjectReader found for"

    .line 287
    .line 288
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 292
    .line 293
    .line 294
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    invoke-virtual {v1, v0}, Lcom/alibaba/fastjson2/JSONReader;->info(Ljava/lang/String;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-static {v0}, Lah/a;->w(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :cond_11
    const/4 v5, 0x0

    .line 308
    :goto_5
    if-ne v4, v6, :cond_12

    .line 309
    .line 310
    move-object/from16 v5, p2

    .line 311
    .line 312
    goto :goto_7

    .line 313
    :cond_12
    invoke-interface {v4, v12, v13}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 314
    .line 315
    .line 316
    move-result-object v7

    .line 317
    if-eqz v7, :cond_13

    .line 318
    .line 319
    if-nez v5, :cond_13

    .line 320
    .line 321
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getString()Ljava/lang/String;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    :cond_13
    move-object v8, v5

    .line 326
    invoke-interface {v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFeatures()J

    .line 327
    .line 328
    .line 329
    move-result-wide v9

    .line 330
    or-long/2addr v2, v9

    .line 331
    move-object v0, v4

    .line 332
    move-wide v4, v2

    .line 333
    const/4 v2, 0x0

    .line 334
    const/4 v3, 0x0

    .line 335
    invoke-interface/range {v0 .. v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/reflect/Type;Ljava/lang/Object;J)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    if-eqz v7, :cond_14

    .line 340
    .line 341
    invoke-virtual {v7, v0, v8}, Lcom/alibaba/fastjson2/reader/FieldReader;->accept(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    :cond_14
    return-object v0

    .line 345
    :cond_15
    move-object/from16 p2, v5

    .line 346
    .line 347
    :cond_16
    invoke-interface {v6, v12, v13}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 348
    .line 349
    .line 350
    move-result-object v4

    .line 351
    if-nez v4, :cond_17

    .line 352
    .line 353
    invoke-interface {v6}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFeatures()J

    .line 354
    .line 355
    .line 356
    move-result-wide v7

    .line 357
    or-long/2addr v7, v2

    .line 358
    invoke-virtual {v1, v7, v8}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    .line 359
    .line 360
    .line 361
    move-result v5

    .line 362
    if-eqz v5, :cond_17

    .line 363
    .line 364
    invoke-virtual {v1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    .line 365
    .line 366
    .line 367
    move-result-wide v4

    .line 368
    invoke-interface {v6, v4, v5}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    :cond_17
    if-nez p2, :cond_18

    .line 373
    .line 374
    iget-object v5, v1, Lcom/alibaba/fastjson2/JSONReader;->context:Lcom/alibaba/fastjson2/JSONReader$Context;

    .line 375
    .line 376
    iget-wide v7, v5, Lcom/alibaba/fastjson2/JSONReader$Context;->features:J

    .line 377
    .line 378
    or-long/2addr v7, v2

    .line 379
    invoke-interface {v6, v7, v8}, Lcom/alibaba/fastjson2/reader/ObjectReader;->createInstance(J)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v5

    .line 383
    goto :goto_6

    .line 384
    :cond_18
    move-object/from16 v5, p2

    .line 385
    .line 386
    :goto_6
    if-nez v4, :cond_19

    .line 387
    .line 388
    invoke-virtual {v6, v1, v5, v2, v3}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    .line 389
    .line 390
    .line 391
    goto :goto_7

    .line 392
    :cond_19
    invoke-virtual {v4, v1, v5}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    :goto_7
    add-int/lit8 v0, v0, 0x1

    .line 396
    .line 397
    const/4 v4, 0x0

    .line 398
    const-wide/16 v7, 0x0

    .line 399
    .line 400
    goto/16 :goto_3
.end method

.method public readObject(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V
    .locals 3

    .line 401
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfNull()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 402
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    return-void

    .line 403
    :cond_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectStart()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 404
    :goto_0
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfObjectEnd()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 405
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->nextIfComma()Z

    return-void

    .line 406
    :cond_1
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->readFieldNameHashCode()J

    move-result-wide v0

    .line 407
    invoke-interface {p0, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReader(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object v0

    if-nez v0, :cond_2

    .line 408
    invoke-interface {p0}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFeatures()J

    move-result-wide v1

    or-long/2addr v1, p3

    invoke-virtual {p1, v1, v2}, Lcom/alibaba/fastjson2/JSONReader;->isSupportSmartMatch(J)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 409
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->getNameHashCodeLCase()J

    move-result-wide v0

    .line 410
    invoke-interface {p0, v0, v1}, Lcom/alibaba/fastjson2/reader/ObjectReader;->getFieldReaderLCase(J)Lcom/alibaba/fastjson2/reader/FieldReader;

    move-result-object v0

    :cond_2
    if-nez v0, :cond_3

    .line 411
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->processExtra(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;J)V

    goto :goto_0

    .line 412
    :cond_3
    invoke-virtual {v0, p1, p2}, Lcom/alibaba/fastjson2/reader/FieldReader;->readFieldValue(Lcom/alibaba/fastjson2/JSONReader;Ljava/lang/Object;)V

    goto :goto_0

    .line 413
    :cond_4
    invoke-virtual {p1}, Lcom/alibaba/fastjson2/JSONReader;->info()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lah/a;->w(Ljava/lang/String;)V

    return-void
.end method

.method public setAutoTypeBeforeHandler(Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/alibaba/fastjson2/reader/ObjectReaderBean;->autoTypeBeforeHandler:Lcom/alibaba/fastjson2/JSONReader$AutoTypeBeforeHandler;

    .line 2
    .line 3
    return-void
.end method
