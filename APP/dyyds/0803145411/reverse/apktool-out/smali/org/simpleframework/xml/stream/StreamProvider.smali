.class Lorg/simpleframework/xml/stream/StreamProvider;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lorg/simpleframework/xml/stream/Provider;


# instance fields
.field private final factory:Lyyds/ᛳᲁᲀ;


# direct methods
.method public constructor <init>()V
    .locals 8

    .line 1
    const-class v0, Lyyds/ᛶᲈᛷᲈ;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string p0, "javax.xml.stream.XMLInputFactory"

    .line 7
    .line 8
    sget-boolean v1, Lyyds/ᛶᲈᛷᲈ;->ᛲᲈᲁ:Z

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    :try_start_0
    new-instance v2, Ljava/lang/StringBuffer;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 14
    .line 15
    .line 16
    sget-object v3, Lyyds/ᛶᲈᛷᲈ;->ᛵᛸᛸᛷ:Ljava/lang/Class;

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    sput-object v0, Lyyds/ᛶᲈᛷᲈ;->ᛵᛸᛸᛷ:Ljava/lang/Class;

    .line 21
    .line 22
    move-object v3, v0

    .line 23
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 28
    .line 29
    .line 30
    const-string v3, "$ClassLoaderFinderConcrete"

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2
    :try_end_0
    .catch Ljava/lang/LinkageError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    if-nez v2, :cond_1

    .line 48
    .line 49
    :try_start_1
    throw v1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 50
    :cond_1
    :try_start_2
    new-instance v2, Ljava/lang/ClassCastException;

    .line 51
    .line 52
    invoke-direct {v2}, Ljava/lang/ClassCastException;-><init>()V

    .line 53
    .line 54
    .line 55
    throw v2
    :try_end_2
    .catch Ljava/lang/LinkageError; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 56
    :catch_0
    move-exception p0

    .line 57
    new-instance v0, Lyyds/ᲀᲇᛳᲈ;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-direct {v0, v1, p0}, Lyyds/ᲀᲇᛳᲈ;-><init>(Ljava/lang/String;Ljava/lang/Exception;)V

    .line 64
    .line 65
    .line 66
    throw v0

    .line 67
    :catch_1
    sget-object v2, Lyyds/ᛶᲈᛷᲈ;->ᛵᛸᛸᛷ:Ljava/lang/Class;

    .line 68
    .line 69
    if-nez v2, :cond_2

    .line 70
    .line 71
    sput-object v0, Lyyds/ᛶᲈᛷᲈ;->ᛵᛸᛸᛷ:Ljava/lang/Class;

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_2
    move-object v0, v2

    .line 75
    :goto_0
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    goto :goto_2

    .line 80
    :catch_2
    sget-object v2, Lyyds/ᛶᲈᛷᲈ;->ᛵᛸᛸᛷ:Ljava/lang/Class;

    .line 81
    .line 82
    if-nez v2, :cond_3

    .line 83
    .line 84
    sput-object v0, Lyyds/ᛶᲈᛷᲈ;->ᛵᛸᛸᛷ:Ljava/lang/Class;

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    move-object v0, v2

    .line 88
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :goto_2
    sget-boolean v2, Lyyds/ᛶᲈᛷᲈ;->ᛲᲈᲁ:Z

    .line 93
    .line 94
    const-string v3, "loaded from services: "

    .line 95
    .line 96
    const-string v4, "found java.home property "

    .line 97
    .line 98
    const-string v5, "found system property"

    .line 99
    .line 100
    :try_start_3
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    if-eqz v6, :cond_4

    .line 105
    .line 106
    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-static {v5}, Lyyds/ᛶᲈᛷᲈ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v6}, Lyyds/ᛶᲈᛷᲈ;->ᛵᛸᛸᛷ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0
    :try_end_3
    .catch Ljava/lang/SecurityException; {:try_start_3 .. :try_end_3} :catch_3

    .line 117
    goto/16 :goto_5

    .line 118
    .line 119
    :catch_3
    :cond_4
    :try_start_4
    const-string v5, "java.home"

    .line 120
    .line 121
    invoke-static {v5}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    new-instance v6, Ljava/lang/StringBuffer;

    .line 126
    .line 127
    invoke-direct {v6}, Ljava/lang/StringBuffer;-><init>()V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v6, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 131
    .line 132
    .line 133
    sget-object v5, Ljava/io/File;->separator:Ljava/lang/String;

    .line 134
    .line 135
    invoke-virtual {v6, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 136
    .line 137
    .line 138
    const-string v7, "lib"

    .line 139
    .line 140
    invoke-virtual {v6, v7}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v6, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 144
    .line 145
    .line 146
    const-string v5, "jaxp.properties"

    .line 147
    .line 148
    invoke-virtual {v6, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v6}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    new-instance v6, Ljava/io/File;

    .line 156
    .line 157
    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    if-eqz v5, :cond_5

    .line 165
    .line 166
    new-instance v5, Ljava/util/Properties;

    .line 167
    .line 168
    invoke-direct {v5}, Ljava/util/Properties;-><init>()V

    .line 169
    .line 170
    .line 171
    new-instance v7, Ljava/io/FileInputStream;

    .line 172
    .line 173
    invoke-direct {v7, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5, v7}, Ljava/util/Properties;->load(Ljava/io/InputStream;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v5, p0}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    if-eqz p0, :cond_5

    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-lez v5, :cond_5

    .line 190
    .line 191
    invoke-virtual {v4, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v4

    .line 195
    invoke-static {v4}, Lyyds/ᛶᲈᛷᲈ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-static {v0, p0}, Lyyds/ᛶᲈᛷᲈ;->ᛵᛸᛸᛷ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object p0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    .line 202
    goto :goto_5

    .line 203
    :catch_4
    move-exception p0

    .line 204
    if-eqz v2, :cond_5

    .line 205
    .line 206
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 207
    .line 208
    .line 209
    :cond_5
    const-string p0, "META-INF/services/javax.xml.stream.XMLInputFactory"

    .line 210
    .line 211
    if-nez v0, :cond_6

    .line 212
    .line 213
    :try_start_5
    invoke-static {p0}, Ljava/lang/ClassLoader;->getSystemResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    goto :goto_3

    .line 218
    :catch_5
    move-exception p0

    .line 219
    goto :goto_4

    .line 220
    :cond_6
    invoke-virtual {v0, p0}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    :goto_3
    if-eqz p0, :cond_7

    .line 225
    .line 226
    const-string v4, "found META-INF/services/javax.xml.stream.XMLInputFactory"

    .line 227
    .line 228
    invoke-static {v4}, Lyyds/ᛶᲈᛷᲈ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    new-instance v4, Ljava/io/BufferedReader;

    .line 232
    .line 233
    new-instance v5, Ljava/io/InputStreamReader;

    .line 234
    .line 235
    const-string v6, "UTF-8"

    .line 236
    .line 237
    invoke-direct {v5, p0, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-direct {v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v4}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object p0

    .line 247
    invoke-virtual {v4}, Ljava/io/BufferedReader;->close()V

    .line 248
    .line 249
    .line 250
    if-eqz p0, :cond_7

    .line 251
    .line 252
    const-string v4, ""

    .line 253
    .line 254
    invoke-virtual {v4, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    if-nez v4, :cond_7

    .line 259
    .line 260
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v3

    .line 264
    invoke-static {v3}, Lyyds/ᛶᲈᛷᲈ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v0, p0}, Lyyds/ᛶᲈᛷᲈ;->ᛵᛸᛸᛷ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object p0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    .line 271
    goto :goto_5

    .line 272
    :goto_4
    if-eqz v2, :cond_7

    .line 273
    .line 274
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 275
    .line 276
    .line 277
    :cond_7
    const-string p0, "loaded from fallback value: "

    .line 278
    .line 279
    const-string v2, "com.bea.xml.stream.MXParserFactory"

    .line 280
    .line 281
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p0

    .line 285
    invoke-static {p0}, Lyyds/ᛶᲈᛷᲈ;->ᛲᲈᲁ(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    invoke-static {v0, v2}, Lyyds/ᛶᲈᛷᲈ;->ᛵᛸᛸᛷ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    :goto_5
    if-nez p0, :cond_8

    .line 293
    .line 294
    return-void

    .line 295
    :cond_8
    invoke-static {}, Lyyds/ᛱᛸᛶᛲ;->ᛲᲈᲁ()V

    .line 296
    .line 297
    .line 298
    throw v1
.end method

.method private provide(Lyyds/ᛸᛴᛳᛶ;)Lorg/simpleframework/xml/stream/EventReader;
    .locals 0

    .line 1
    new-instance p0, Lorg/simpleframework/xml/stream/StreamReader;

    .line 2
    .line 3
    invoke-direct {p0, p1}, Lorg/simpleframework/xml/stream/StreamReader;-><init>(Lyyds/ᛸᛴᛳᛶ;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method


# virtual methods
.method public provide(Ljava/io/InputStream;)Lorg/simpleframework/xml/stream/EventReader;
    .locals 0

    const/4 p0, 0x0

    .line 8
    throw p0
.end method

.method public provide(Ljava/io/Reader;)Lorg/simpleframework/xml/stream/EventReader;
    .locals 0

    const/4 p0, 0x0

    .line 7
    throw p0
.end method
