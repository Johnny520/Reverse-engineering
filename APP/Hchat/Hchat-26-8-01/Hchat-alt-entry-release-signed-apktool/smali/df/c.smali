.class public final Ldf/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final d:Lmh/b;


# instance fields
.field public final a:Lad/c;

.field public final b:Ljava/util/HashMap;

.field public final c:Ljava/util/HashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Ldf/c;

    .line 2
    .line 3
    invoke-static {v0}, Lmh/d;->b(Ljava/lang/Class;)Lmh/b;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ldf/c;->d:Lmh/b;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lad/c;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Ldf/c;->b:Ljava/util/HashMap;

    .line 10
    .line 11
    new-instance v1, Ljava/util/HashMap;

    .line 12
    .line 13
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Ldf/c;->c:Ljava/util/HashMap;

    .line 17
    .line 18
    iput-object p1, p0, Ldf/c;->a:Lad/c;

    .line 19
    .line 20
    const-string p1, "/android/attrs.xml"

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Ldf/c;->a(Ljava/lang/String;)Lorg/w3c/dom/Document;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-virtual {p0, p1}, Ldf/c;->b(Lorg/w3c/dom/Document;)V

    .line 27
    .line 28
    .line 29
    const-string p1, "/android/attrs_manifest.xml"

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Ldf/c;->a(Ljava/lang/String;)Lorg/w3c/dom/Document;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-virtual {p0, p1}, Ldf/c;->b(Lorg/w3c/dom/Document;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    sget-object v0, Ldf/c;->d:Lmh/b;

    .line 47
    .line 48
    const-string v1, "Loaded android attributes count: {}"

    .line 49
    .line 50
    invoke-interface {v0, p1, v1}, Lmh/b;->x(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Lorg/w3c/dom/Document;
    .locals 4

    .line 1
    const-string v0, " not found in classpath"

    .line 2
    .line 3
    :try_start_0
    const-class v1, Ldf/c;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 6
    .line 7
    .line 8
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    :try_start_1
    iget-object v0, p0, Ldf/c;->a:Lad/c;

    .line 12
    .line 13
    iget-object v0, v0, Lad/c;->a:Ljava/util/Set;

    .line 14
    .line 15
    sget-object v2, Lzc/a;->h:Lzc/a;

    .line 16
    .line 17
    invoke-interface {v0, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget-object v0, Lad/a;->a:Ljavax/xml/parsers/DocumentBuilderFactory;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    sget-object v0, Lad/b;->a:Ljavax/xml/parsers/DocumentBuilderFactory;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    .line 28
    :goto_0
    :try_start_2
    invoke-virtual {v0}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-virtual {v0, v1}, Ljavax/xml/parsers/DocumentBuilder;->parse(Ljava/io/InputStream;)Lorg/w3c/dom/Document;

    .line 33
    .line 34
    .line 35
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 36
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    .line 37
    .line 38
    .line 39
    return-object v0

    .line 40
    :catch_0
    move-exception v0

    .line 41
    goto :goto_3

    .line 42
    :catch_1
    move-exception v0

    .line 43
    :try_start_4
    new-instance v2, Ljava/lang/RuntimeException;

    .line 44
    .line 45
    const-string v3, "Failed to parse xml"

    .line 46
    .line 47
    invoke-direct {v2, v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v2

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    new-instance v2, Laf/g;

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-direct {v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 63
    :goto_1
    if-eqz v1, :cond_2

    .line 64
    .line 65
    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catchall_1
    move-exception v1

    .line 70
    :try_start_6
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_2
    throw v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 74
    :goto_3
    new-instance v1, Laf/g;

    .line 75
    .line 76
    const-string v2, "Xml load error, file: "

    .line 77
    .line 78
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-direct {v1, p1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    throw v1
.end method

.method public final b(Lorg/w3c/dom/Document;)V
    .locals 4

    .line 1
    invoke-interface {p1}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-ge v0, v1, :cond_1

    .line 11
    .line 12
    invoke-interface {p1, v0}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getNodeType()S

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x1

    .line 21
    if-ne v2, v3, :cond_0

    .line 22
    .line 23
    invoke-interface {v1}, Lorg/w3c/dom/Node;->hasChildNodes()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    invoke-interface {v1}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-virtual {p0, v1}, Ldf/c;->c(Lorg/w3c/dom/NodeList;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void
.end method

.method public final c(Lorg/w3c/dom/NodeList;)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    invoke-interface {p1}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 4
    .line 5
    .line 6
    move-result v2

    .line 7
    if-ge v1, v2, :cond_a

    .line 8
    .line 9
    invoke-interface {p1, v1}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNodeType()S

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x1

    .line 18
    if-ne v3, v4, :cond_9

    .line 19
    .line 20
    invoke-interface {v2}, Lorg/w3c/dom/Node;->hasAttributes()Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_9

    .line 25
    .line 26
    invoke-interface {v2}, Lorg/w3c/dom/Node;->hasChildNodes()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_9

    .line 31
    .line 32
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    move v5, v0

    .line 37
    :goto_1
    invoke-interface {v3}, Lorg/w3c/dom/NamedNodeMap;->getLength()I

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    const-string v7, "name"

    .line 42
    .line 43
    const/4 v8, 0x0

    .line 44
    if-ge v5, v6, :cond_1

    .line 45
    .line 46
    invoke-interface {v3, v5}, Lorg/w3c/dom/NamedNodeMap;->item(I)Lorg/w3c/dom/Node;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v9

    .line 54
    invoke-virtual {v9, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v9

    .line 58
    if-eqz v9, :cond_0

    .line 59
    .line 60
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    goto :goto_2

    .line 65
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move-object v3, v8

    .line 69
    :goto_2
    if-eqz v3, :cond_8

    .line 70
    .line 71
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    const-string v6, "attr"

    .line 76
    .line 77
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_8

    .line 82
    .line 83
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    move v5, v0

    .line 88
    :goto_3
    invoke-interface {v2}, Lorg/w3c/dom/NodeList;->getLength()I

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-ge v5, v6, :cond_9

    .line 93
    .line 94
    invoke-interface {v2, v5}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    .line 95
    .line 96
    .line 97
    move-result-object v6

    .line 98
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeType()S

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-ne v9, v4, :cond_7

    .line 103
    .line 104
    invoke-interface {v6}, Lorg/w3c/dom/Node;->hasAttributes()Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-eqz v9, :cond_7

    .line 109
    .line 110
    const/4 v9, 0x2

    .line 111
    if-nez v8, :cond_5

    .line 112
    .line 113
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v10

    .line 117
    const-string v11, "enum"

    .line 118
    .line 119
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v10

    .line 123
    if-eqz v10, :cond_2

    .line 124
    .line 125
    new-instance v8, La5/a;

    .line 126
    .line 127
    const/4 v10, 0x2

    .line 128
    invoke-direct {v8, v4, v10}, La5/a;-><init>(II)V

    .line 129
    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_2
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v10

    .line 136
    const-string v11, "flag"

    .line 137
    .line 138
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v10

    .line 142
    if-eqz v10, :cond_3

    .line 143
    .line 144
    new-instance v8, La5/a;

    .line 145
    .line 146
    const/4 v10, 0x2

    .line 147
    invoke-direct {v8, v9, v10}, La5/a;-><init>(II)V

    .line 148
    .line 149
    .line 150
    :cond_3
    :goto_4
    if-nez v8, :cond_4

    .line 151
    .line 152
    goto :goto_8

    .line 153
    :cond_4
    const-string v10, "android:"

    .line 154
    .line 155
    invoke-virtual {v10, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    iget-object v11, p0, Ldf/c;->b:Ljava/util/HashMap;

    .line 160
    .line 161
    invoke-virtual {v11, v10, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    :cond_5
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getAttributes()Lorg/w3c/dom/NamedNodeMap;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    invoke-interface {v6, v7}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    if-eqz v10, :cond_7

    .line 173
    .line 174
    const-string v11, "value"

    .line 175
    .line 176
    invoke-interface {v6, v11}, Lorg/w3c/dom/NamedNodeMap;->getNamedItem(Ljava/lang/String;)Lorg/w3c/dom/Node;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    if-eqz v6, :cond_7

    .line 181
    .line 182
    :try_start_0
    invoke-interface {v6}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v6

    .line 186
    const-string v11, "0x"

    .line 187
    .line 188
    invoke-virtual {v6, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 189
    .line 190
    .line 191
    move-result v11

    .line 192
    if-eqz v11, :cond_6

    .line 193
    .line 194
    invoke-virtual {v6, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    const/16 v9, 0x10

    .line 199
    .line 200
    invoke-static {v6, v9}, Ljava/lang/Long;->parseLong(Ljava/lang/String;I)J

    .line 201
    .line 202
    .line 203
    move-result-wide v11

    .line 204
    goto :goto_5

    .line 205
    :catch_0
    move-exception v6

    .line 206
    goto :goto_6

    .line 207
    :cond_6
    invoke-static {v6}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 208
    .line 209
    .line 210
    move-result-wide v11

    .line 211
    :goto_5
    invoke-interface {v10}, Lorg/w3c/dom/Node;->getNodeValue()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v6

    .line 215
    iget-object v9, v8, La5/a;->i:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast v9, Ljava/util/LinkedHashMap;

    .line 218
    .line 219
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 220
    .line 221
    .line 222
    move-result-object v10

    .line 223
    invoke-interface {v9, v10, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 224
    .line 225
    .line 226
    goto :goto_7

    .line 227
    :goto_6
    sget-object v9, Ldf/c;->d:Lmh/b;

    .line 228
    .line 229
    const-string v10, "Failed parse manifest number"

    .line 230
    .line 231
    invoke-interface {v9, v10, v6}, Lmh/b;->t(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 232
    .line 233
    .line 234
    :cond_7
    :goto_7
    add-int/lit8 v5, v5, 0x1

    .line 235
    .line 236
    goto/16 :goto_3

    .line 237
    .line 238
    :cond_8
    invoke-interface {v2}, Lorg/w3c/dom/Node;->getChildNodes()Lorg/w3c/dom/NodeList;

    .line 239
    .line 240
    .line 241
    move-result-object v2

    .line 242
    invoke-virtual {p0, v2}, Ldf/c;->c(Lorg/w3c/dom/NodeList;)V

    .line 243
    .line 244
    .line 245
    :cond_9
    :goto_8
    add-int/lit8 v1, v1, 0x1

    .line 246
    .line 247
    goto/16 :goto_0

    .line 248
    .line 249
    :cond_a
    return-void
.end method

.method public final d(Ldf/g;)V
    .locals 12

    .line 1
    iget-object v0, p0, Ldf/c;->c:Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, Ldf/g;->e:Ldf/i;

    .line 7
    .line 8
    new-instance v2, Lef/d;

    .line 9
    .line 10
    iget-object p1, p1, Ldf/g;->f:Ldf/a;

    .line 11
    .line 12
    invoke-virtual {v1}, Ldf/i;->a()Ljava/util/HashMap;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-direct {v2, p1, v3}, Lef/d;-><init>(Ldf/a;Ljava/util/HashMap;)V

    .line 17
    .line 18
    .line 19
    iget-object p1, v1, Ldf/i;->a:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_8

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Lef/c;

    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    iget-object v3, v1, Lef/c;->c:Ljava/lang/String;

    .line 41
    .line 42
    const-string v4, "attr"

    .line 43
    .line 44
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    iget-object v3, v1, Lef/c;->g:Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    const/4 v4, 0x1

    .line 57
    if-le v3, v4, :cond_0

    .line 58
    .line 59
    iget-object v3, v1, Lef/c;->g:Ljava/util/ArrayList;

    .line 60
    .line 61
    const/4 v5, 0x0

    .line 62
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lef/b;

    .line 67
    .line 68
    iget-object v3, v3, Lef/b;->b:Lb5/k;

    .line 69
    .line 70
    iget v3, v3, Lb5/k;->c:I

    .line 71
    .line 72
    const/high16 v5, 0xff0000

    .line 73
    .line 74
    and-int/2addr v3, v5

    .line 75
    const/high16 v6, 0x20000

    .line 76
    .line 77
    if-ne v3, v6, :cond_1

    .line 78
    .line 79
    const/4 v3, 0x2

    .line 80
    goto :goto_1

    .line 81
    :cond_1
    const/high16 v6, 0x10000

    .line 82
    .line 83
    if-ne v3, v6, :cond_0

    .line 84
    .line 85
    move v3, v4

    .line 86
    :goto_1
    new-instance v6, La5/a;

    .line 87
    .line 88
    const/4 v7, 0x2

    .line 89
    invoke-direct {v6, v3, v7}, La5/a;-><init>(II)V

    .line 90
    .line 91
    .line 92
    :goto_2
    iget-object v3, v1, Lef/c;->g:Ljava/util/ArrayList;

    .line 93
    .line 94
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-ge v4, v3, :cond_7

    .line 99
    .line 100
    iget-object v3, v1, Lef/c;->g:Ljava/util/ArrayList;

    .line 101
    .line 102
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    check-cast v3, Lef/b;

    .line 107
    .line 108
    iget v7, v3, Lef/b;->a:I

    .line 109
    .line 110
    const/high16 v8, -0x10000

    .line 111
    .line 112
    and-int/2addr v8, v7

    .line 113
    if-eqz v8, :cond_2

    .line 114
    .line 115
    and-int v8, v7, v5

    .line 116
    .line 117
    if-nez v8, :cond_2

    .line 118
    .line 119
    const v8, 0xffff

    .line 120
    .line 121
    .line 122
    and-int/2addr v8, v7

    .line 123
    if-nez v8, :cond_3

    .line 124
    .line 125
    const/4 v7, 0x0

    .line 126
    goto :goto_4

    .line 127
    :cond_2
    move v8, v7

    .line 128
    :cond_3
    iget-object v9, v2, Lef/d;->c:Ljava/util/HashMap;

    .line 129
    .line 130
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object v10

    .line 134
    invoke-virtual {v9, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v9

    .line 138
    check-cast v9, Ljava/lang/String;

    .line 139
    .line 140
    const/16 v10, 0x2e

    .line 141
    .line 142
    const/16 v11, 0x2f

    .line 143
    .line 144
    if-eqz v9, :cond_4

    .line 145
    .line 146
    invoke-virtual {v9, v11, v10}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v7

    .line 150
    goto :goto_4

    .line 151
    :cond_4
    sget-object v9, Lye/a;->a:Ljava/util/HashMap;

    .line 152
    .line 153
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    invoke-virtual {v9, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    check-cast v8, Ljava/lang/String;

    .line 162
    .line 163
    if-eqz v8, :cond_5

    .line 164
    .line 165
    invoke-virtual {v8, v11, v10}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    const-string v8, "android:"

    .line 170
    .line 171
    :goto_3
    invoke-static {v8, v7}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v7

    .line 175
    goto :goto_4

    .line 176
    :cond_5
    invoke-static {v7}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    const-string v8, "?0x"

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :goto_4
    iget-object v3, v3, Lef/b;->b:Lb5/k;

    .line 184
    .line 185
    iget v3, v3, Lb5/k;->c:I

    .line 186
    .line 187
    int-to-long v8, v3

    .line 188
    const-string v3, "id."

    .line 189
    .line 190
    invoke-virtual {v7, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    if-eqz v3, :cond_6

    .line 195
    .line 196
    const/4 v3, 0x3

    .line 197
    invoke-virtual {v7, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    :cond_6
    iget-object v3, v6, La5/a;->i:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 204
    .line 205
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 206
    .line 207
    .line 208
    move-result-object v8

    .line 209
    invoke-interface {v3, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    add-int/lit8 v4, v4, 0x1

    .line 213
    .line 214
    goto :goto_2

    .line 215
    :cond_7
    iget-object v1, v1, Lef/c;->d:Ljava/lang/String;

    .line 216
    .line 217
    invoke-virtual {v0, v1, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    goto/16 :goto_0

    .line 221
    .line 222
    :cond_8
    return-void
.end method
