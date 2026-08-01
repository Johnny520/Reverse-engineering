.class public abstract Lnet/bytebuddy/android/AndroidClassLoadingStrategy;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Injecting;,
        Lnet/bytebuddy/android/AndroidClassLoadingStrategy$Wrapping;,
        Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;,
        Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lnet/bytebuddy/dynamic/loading/ClassLoadingStrategy<",
        "Ljava/lang/ClassLoader;",
        ">;"
    }
.end annotation


# static fields
.field private static final DEX_CLASS_FILE:Ljava/lang/String; = "classes.dex"

.field private static final EMPTY_LIBRARY_PATH:Ljava/lang/String; = null
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field

.field private static final FILE_PROCESSOR:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor;

.field private static final JAR_FILE_EXTENSION:Ljava/lang/String; = ".jar"


# instance fields
.field private final dexProcessor:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;

.field protected final privateDirectory:Ljava/io/File;

.field protected final randomString:Lnet/bytebuddy/utility/RandomString;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    :try_start_0
    new-instance v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;

    .line 2
    .line 3
    const-string v1, "java.nio.file.Files"

    .line 4
    .line 5
    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const-string v2, "setPosixFilePermissions"

    .line 10
    .line 11
    const-class v3, Ljava/nio/file/Path;

    .line 12
    .line 13
    const-class v4, Ljava/util/Set;

    .line 14
    .line 15
    filled-new-array {v3, v4}, [Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-class v2, Ljava/io/File;

    .line 24
    .line 25
    const-string v3, "toPath"

    .line 26
    .line 27
    const/4 v4, 0x0

    .line 28
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    const-string v3, "java.nio.file.attribute.PosixFilePermission"

    .line 33
    .line 34
    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v5, "valueOf"

    .line 39
    .line 40
    const-class v6, Ljava/lang/String;

    .line 41
    .line 42
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    invoke-virtual {v3, v5, v6}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    const-string v5, "OWNER_READ"

    .line 51
    .line 52
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    invoke-virtual {v3, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-static {v3}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-direct {v0, v1, v2, v3}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$ForReadOnlyClassFile;-><init>(Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;Ljava/util/Set;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :catchall_0
    sget-object v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$Disabled;->INSTANCE:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor$Disabled;

    .line 69
    .line 70
    :goto_0
    sput-object v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->FILE_PROCESSOR:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor;

    .line 71
    .line 72
    return-void
.end method

.method public constructor <init>(Ljava/io/File;Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iput-object p1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->privateDirectory:Ljava/io/File;

    .line 11
    .line 12
    iput-object p2, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->dexProcessor:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;

    .line 13
    .line 14
    new-instance p1, Lnet/bytebuddy/utility/RandomString;

    .line 15
    .line 16
    invoke-direct {p1}, Lnet/bytebuddy/utility/RandomString;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->randomString:Lnet/bytebuddy/utility/RandomString;

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    const-string p0, "Not a directory "

    .line 23
    .line 24
    invoke-static {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪兰哲世苏(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    throw p0
.end method

.method public static synthetic access$400()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->EMPTY_LIBRARY_PATH:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method


# virtual methods
.method public abstract doLoad(Ljava/lang/ClassLoader;Ljava/util/Set;Ljava/io/File;)Ljava/util/Map;
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Set<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;",
            "Ljava/io/File;",
            ")",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation
.end method

.method public load(Ljava/lang/ClassLoader;Ljava/util/Map;)Ljava/util/Map;
    .locals 8
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "[B>;)",
            "Ljava/util/Map<",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    .line 1
    const-string v0, "Could not delete "

    .line 2
    .line 3
    const-string v1, "net.bytebuddy"

    .line 4
    .line 5
    iget-object v2, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->dexProcessor:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;

    .line 6
    .line 7
    invoke-interface {v2}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor;->create()Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$Conversion;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    check-cast v4, Ljava/util/Map$Entry;

    .line 30
    .line 31
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    check-cast v5, Lnet/bytebuddy/description/type/TypeDescription;

    .line 36
    .line 37
    invoke-interface {v5}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, [B

    .line 46
    .line 47
    invoke-interface {v2, v5, v4}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$Conversion;->register(Ljava/lang/String;[B)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    new-instance v3, Ljava/io/File;

    .line 52
    .line 53
    iget-object v4, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->privateDirectory:Ljava/io/File;

    .line 54
    .line 55
    new-instance v5, Ljava/lang/StringBuilder;

    .line 56
    .line 57
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 58
    .line 59
    .line 60
    iget-object v6, p0, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->randomString:Lnet/bytebuddy/utility/RandomString;

    .line 61
    .line 62
    invoke-virtual {v6}, Lnet/bytebuddy/utility/RandomString;->nextString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v6, ".jar"

    .line 70
    .line 71
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-direct {v3, v4, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    :try_start_0
    invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    if-eqz v4, :cond_2

    .line 86
    .line 87
    new-instance v4, Ljava/io/FileOutputStream;

    .line 88
    .line 89
    invoke-direct {v4, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    :try_start_1
    new-instance v5, Ljava/util/jar/JarOutputStream;

    .line 93
    .line 94
    invoke-direct {v5, v4}, Ljava/util/jar/JarOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 95
    .line 96
    .line 97
    new-instance v6, Ljava/util/jar/JarEntry;

    .line 98
    .line 99
    const-string v7, "classes.dex"

    .line 100
    .line 101
    invoke-direct {v6, v7}, Ljava/util/jar/JarEntry;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v5, v6}, Ljava/util/jar/JarOutputStream;->putNextEntry(Ljava/util/zip/ZipEntry;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v2, v5}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$DexProcessor$Conversion;->drainTo(Ljava/io/OutputStream;)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {v5}, Ljava/util/zip/ZipOutputStream;->closeEntry()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 114
    .line 115
    .line 116
    :try_start_2
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 117
    .line 118
    .line 119
    sget-object v2, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->FILE_PROCESSOR:Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor;

    .line 120
    .line 121
    invoke-interface {v2, v3}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy$FileProcessor;->accept(Ljava/io/File;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {p2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    invoke-virtual {p0, p1, p2, v3}, Lnet/bytebuddy/android/AndroidClassLoadingStrategy;->doLoad(Ljava/lang/ClassLoader;Ljava/util/Set;Ljava/io/File;)Ljava/util/Map;

    .line 129
    .line 130
    .line 131
    move-result-object p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 132
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 133
    .line 134
    .line 135
    move-result p1

    .line 136
    if-nez p1, :cond_1

    .line 137
    .line 138
    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    new-instance p2, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p2

    .line 154
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    :cond_1
    return-object p0

    .line 158
    :catchall_0
    move-exception p0

    .line 159
    goto :goto_2

    .line 160
    :catch_0
    move-exception p0

    .line 161
    goto :goto_1

    .line 162
    :catchall_1
    move-exception p0

    .line 163
    :try_start_3
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V

    .line 164
    .line 165
    .line 166
    throw p0

    .line 167
    :cond_2
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 168
    .line 169
    new-instance p1, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 172
    .line 173
    .line 174
    const-string p2, "Cannot create "

    .line 175
    .line 176
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 187
    .line 188
    .line 189
    throw p0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 190
    :goto_1
    :try_start_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 191
    .line 192
    new-instance p2, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 195
    .line 196
    .line 197
    const-string v2, "Cannot write to zip file "

    .line 198
    .line 199
    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 210
    .line 211
    .line 212
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 213
    :goto_2
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 214
    .line 215
    .line 216
    move-result p1

    .line 217
    if-nez p1, :cond_3

    .line 218
    .line 219
    invoke-static {v1}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    new-instance p2, Ljava/lang/StringBuilder;

    .line 224
    .line 225
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p2

    .line 235
    invoke-virtual {p1, p2}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    :cond_3
    throw p0
.end method
