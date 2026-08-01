.class public Lcom/android/dx/command/dexer/Main$Arguments;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/command/dexer/Main;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Arguments"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;
    }
.end annotation


# static fields
.field private static final INCREMENTAL_OPTION:Ljava/lang/String; = "--incremental"

.field private static final INPUT_LIST_OPTION:Ljava/lang/String; = "--input-list"

.field private static final MAIN_DEX_LIST_OPTION:Ljava/lang/String; = "--main-dex-list"

.field private static final MINIMAL_MAIN_DEX_OPTION:Ljava/lang/String; = "--minimal-main-dex"

.field private static final MULTI_DEX_OPTION:Ljava/lang/String; = "--multi-dex"

.field private static final NUM_THREADS_OPTION:Ljava/lang/String; = "--num-threads"


# instance fields
.field public allowAllInterfaceMethodInvokes:Z

.field public cfOptions:Lcom/android/dx/dex/cf/CfOptions;

.field public final context:Lcom/android/dx/command/dexer/DxContext;

.field public coreLibrary:Z

.field public debug:Z

.field public dexOptions:Lcom/android/dx/dex/DexOptions;

.field public dontOptimizeListFile:Ljava/lang/String;

.field public dumpWidth:I

.field public emptyOk:Z

.field public fileNames:[Ljava/lang/String;

.field public forceJumbo:Z

.field public humanOutName:Ljava/lang/String;

.field public incremental:Z

.field private inputList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public jarOutput:Z

.field public keepClassesInJar:Z

.field public localInfo:Z

.field public mainDexListFile:Ljava/lang/String;

.field public maxNumberOfIdxPerDex:I

.field public methodToDump:Ljava/lang/String;

.field public minSdkVersion:I

.field public minimalMainDex:Z

.field public multiDex:Z

.field public numThreads:I

.field public optimize:Z

.field public optimizeListFile:Ljava/lang/String;

.field public outName:Ljava/lang/String;

.field private outputIsDirectDex:Z

.field private outputIsDirectory:Z

.field public positionInfo:I

.field public statistics:Z

.field public strictNameCheck:Z

.field public verbose:Z

.field public verboseDump:Z

.field public warnings:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 75
    new-instance v0, Lcom/android/dx/command/dexer/DxContext;

    invoke-direct {v0}, Lcom/android/dx/command/dexer/DxContext;-><init>()V

    invoke-direct {p0, v0}, Lcom/android/dx/command/dexer/Main$Arguments;-><init>(Lcom/android/dx/command/dexer/DxContext;)V

    return-void
.end method

.method public constructor <init>(Lcom/android/dx/command/dexer/DxContext;)V
    .locals 4

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->debug:Z

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->warnings:Z

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->verbose:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->verboseDump:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->coreLibrary:Z

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    iput-object v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->methodToDump:Ljava/lang/String;

    .line 18
    .line 19
    iput v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->dumpWidth:I

    .line 20
    .line 21
    iput-object v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 22
    .line 23
    iput-object v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->humanOutName:Ljava/lang/String;

    .line 24
    .line 25
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->strictNameCheck:Z

    .line 26
    .line 27
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->emptyOk:Z

    .line 28
    .line 29
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->jarOutput:Z

    .line 30
    .line 31
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->keepClassesInJar:Z

    .line 32
    .line 33
    const/16 v3, 0xd

    .line 34
    .line 35
    iput v3, p0, Lcom/android/dx/command/dexer/Main$Arguments;->minSdkVersion:I

    .line 36
    .line 37
    const/4 v3, 0x2

    .line 38
    iput v3, p0, Lcom/android/dx/command/dexer/Main$Arguments;->positionInfo:I

    .line 39
    .line 40
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->localInfo:Z

    .line 41
    .line 42
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->incremental:Z

    .line 43
    .line 44
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->forceJumbo:Z

    .line 45
    .line 46
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->allowAllInterfaceMethodInvokes:Z

    .line 47
    .line 48
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->optimize:Z

    .line 49
    .line 50
    iput-object v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->optimizeListFile:Ljava/lang/String;

    .line 51
    .line 52
    iput-object v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->dontOptimizeListFile:Ljava/lang/String;

    .line 53
    .line 54
    iput v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->numThreads:I

    .line 55
    .line 56
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->multiDex:Z

    .line 57
    .line 58
    iput-object v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->mainDexListFile:Ljava/lang/String;

    .line 59
    .line 60
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->minimalMainDex:Z

    .line 61
    .line 62
    const/high16 v1, 0x10000

    .line 63
    .line 64
    iput v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->maxNumberOfIdxPerDex:I

    .line 65
    .line 66
    iput-object v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->inputList:Ljava/util/List;

    .line 67
    .line 68
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outputIsDirectory:Z

    .line 69
    .line 70
    iput-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outputIsDirectDex:Z

    .line 71
    .line 72
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 73
    .line 74
    return-void
.end method

.method public static synthetic access$000(Lcom/android/dx/command/dexer/Main$Arguments;[Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/command/dexer/Main$Arguments;->parse([Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private parse([Ljava/lang/String;)V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;

    .line 2
    .line 3
    invoke-direct {v0, p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;-><init>([Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0}, Lcom/android/dx/command/dexer/Main$Arguments;->parseFlags(Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getRemaining()[Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->fileNames:[Ljava/lang/String;

    .line 14
    .line 15
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->inputList:Ljava/util/List;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_0

    .line 24
    .line 25
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->inputList:Ljava/util/List;

    .line 26
    .line 27
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->fileNames:[Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-interface {p1, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->inputList:Ljava/util/List;

    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    new-array v0, v0, [Ljava/lang/String;

    .line 43
    .line 44
    invoke-interface {p1, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, [Ljava/lang/String;

    .line 49
    .line 50
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->fileNames:[Ljava/lang/String;

    .line 51
    .line 52
    :cond_0
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->fileNames:[Ljava/lang/String;

    .line 53
    .line 54
    array-length p1, p1

    .line 55
    iget-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->emptyOk:Z

    .line 56
    .line 57
    if-nez p1, :cond_2

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 63
    .line 64
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 65
    .line 66
    const-string p1, "no input files specified"

    .line 67
    .line 68
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    new-instance p0, Lcom/android/dx/command/UsageException;

    .line 72
    .line 73
    invoke-direct {p0}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 74
    .line 75
    .line 76
    throw p0

    .line 77
    :cond_2
    if-eqz v0, :cond_3

    .line 78
    .line 79
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 80
    .line 81
    iget-object p1, p1, Lcom/android/dx/command/dexer/DxContext;->out:Ljava/io/PrintStream;

    .line 82
    .line 83
    const-string v0, "ignoring input files"

    .line 84
    .line 85
    invoke-virtual {p1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->humanOutName:Ljava/lang/String;

    .line 89
    .line 90
    if-nez p1, :cond_4

    .line 91
    .line 92
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->methodToDump:Ljava/lang/String;

    .line 93
    .line 94
    if-eqz p1, :cond_4

    .line 95
    .line 96
    const-string p1, "-"

    .line 97
    .line 98
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->humanOutName:Ljava/lang/String;

    .line 99
    .line 100
    :cond_4
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->mainDexListFile:Ljava/lang/String;

    .line 101
    .line 102
    if-eqz p1, :cond_6

    .line 103
    .line 104
    iget-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->multiDex:Z

    .line 105
    .line 106
    if-eqz v0, :cond_5

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 110
    .line 111
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 112
    .line 113
    const-string p1, "--main-dex-list is only supported in combination with --multi-dex"

    .line 114
    .line 115
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance p0, Lcom/android/dx/command/UsageException;

    .line 119
    .line 120
    invoke-direct {p0}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 121
    .line 122
    .line 123
    throw p0

    .line 124
    :cond_6
    :goto_1
    iget-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->minimalMainDex:Z

    .line 125
    .line 126
    if-eqz v0, :cond_8

    .line 127
    .line 128
    if-eqz p1, :cond_7

    .line 129
    .line 130
    iget-boolean p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->multiDex:Z

    .line 131
    .line 132
    if-eqz p1, :cond_7

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_7
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 136
    .line 137
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 138
    .line 139
    const-string p1, "--minimal-main-dex is only supported in combination with --multi-dex and --main-dex-list"

    .line 140
    .line 141
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    new-instance p0, Lcom/android/dx/command/UsageException;

    .line 145
    .line 146
    invoke-direct {p0}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 147
    .line 148
    .line 149
    throw p0

    .line 150
    :cond_8
    :goto_2
    iget-boolean p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->multiDex:Z

    .line 151
    .line 152
    if-eqz p1, :cond_a

    .line 153
    .line 154
    iget-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->incremental:Z

    .line 155
    .line 156
    if-nez v0, :cond_9

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_9
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 160
    .line 161
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 162
    .line 163
    const-string p1, "--incremental is not supported with --multi-dex"

    .line 164
    .line 165
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    new-instance p0, Lcom/android/dx/command/UsageException;

    .line 169
    .line 170
    invoke-direct {p0}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 171
    .line 172
    .line 173
    throw p0

    .line 174
    :cond_a
    :goto_3
    if-eqz p1, :cond_c

    .line 175
    .line 176
    iget-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outputIsDirectDex:Z

    .line 177
    .line 178
    if-nez v0, :cond_b

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_b
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 182
    .line 183
    iget-object p1, p1, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 184
    .line 185
    new-instance v0, Ljava/lang/StringBuilder;

    .line 186
    .line 187
    const-string v1, "Unsupported output \""

    .line 188
    .line 189
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string p0, "\". --multi-dex supports only archive or directory output"

    .line 198
    .line 199
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    new-instance p0, Lcom/android/dx/command/UsageException;

    .line 210
    .line 211
    invoke-direct {p0}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 212
    .line 213
    .line 214
    throw p0

    .line 215
    :cond_c
    :goto_4
    iget-boolean v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outputIsDirectory:Z

    .line 216
    .line 217
    if-eqz v0, :cond_d

    .line 218
    .line 219
    if-nez p1, :cond_d

    .line 220
    .line 221
    new-instance p1, Ljava/io/File;

    .line 222
    .line 223
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 224
    .line 225
    const-string v1, "classes.dex"

    .line 226
    .line 227
    invoke-direct {p1, v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    iput-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 235
    .line 236
    :cond_d
    invoke-virtual {p0}, Lcom/android/dx/command/dexer/Main$Arguments;->makeOptionsObjects()V

    .line 237
    .line 238
    .line 239
    return-void
.end method

.method private parseFlags(Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;)V
    .locals 4

    .line 1
    :goto_0
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getNext()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_27

    .line 6
    .line 7
    const-string v0, "--debug"

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x1

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->debug:Z

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const-string v0, "--no-warning"

    .line 20
    .line 21
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iput-boolean v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->warnings:Z

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const-string v0, "--verbose"

    .line 32
    .line 33
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->verbose:Z

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    const-string v0, "--verbose-dump"

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_3

    .line 49
    .line 50
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->verboseDump:Z

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    const-string v0, "--no-files"

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->emptyOk:Z

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_4
    const-string v0, "--no-optimize"

    .line 65
    .line 66
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    iput-boolean v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->optimize:Z

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    const-string v0, "--no-strict"

    .line 76
    .line 77
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_6

    .line 82
    .line 83
    iput-boolean v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->strictNameCheck:Z

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_6
    const-string v0, "--core-library"

    .line 87
    .line 88
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_7

    .line 93
    .line 94
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->coreLibrary:Z

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_7
    const-string v0, "--statistics"

    .line 98
    .line 99
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_8

    .line 104
    .line 105
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->statistics:Z

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_8
    const-string v0, "--optimize-list="

    .line 109
    .line 110
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    const-string v3, "--optimize-list and --no-optimize-list are incompatible."

    .line 115
    .line 116
    if-eqz v0, :cond_a

    .line 117
    .line 118
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->dontOptimizeListFile:Ljava/lang/String;

    .line 119
    .line 120
    if-nez v0, :cond_9

    .line 121
    .line 122
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->optimize:Z

    .line 123
    .line 124
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getLastValue()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->optimizeListFile:Ljava/lang/String;

    .line 129
    .line 130
    goto/16 :goto_0

    .line 131
    .line 132
    :cond_9
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 133
    .line 134
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 135
    .line 136
    invoke-virtual {p0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    new-instance p0, Lcom/android/dx/command/UsageException;

    .line 140
    .line 141
    invoke-direct {p0}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 142
    .line 143
    .line 144
    throw p0

    .line 145
    :cond_a
    const-string v0, "--no-optimize-list="

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    if-eqz v0, :cond_c

    .line 152
    .line 153
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->dontOptimizeListFile:Ljava/lang/String;

    .line 154
    .line 155
    if-nez v0, :cond_b

    .line 156
    .line 157
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->optimize:Z

    .line 158
    .line 159
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getLastValue()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->dontOptimizeListFile:Ljava/lang/String;

    .line 164
    .line 165
    goto/16 :goto_0

    .line 166
    .line 167
    :cond_b
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 168
    .line 169
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 170
    .line 171
    invoke-virtual {p0, v3}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    new-instance p0, Lcom/android/dx/command/UsageException;

    .line 175
    .line 176
    invoke-direct {p0}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 177
    .line 178
    .line 179
    throw p0

    .line 180
    :cond_c
    const-string v0, "--keep-classes"

    .line 181
    .line 182
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-eqz v0, :cond_d

    .line 187
    .line 188
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->keepClassesInJar:Z

    .line 189
    .line 190
    goto/16 :goto_0

    .line 191
    .line 192
    :cond_d
    const-string v0, "--output="

    .line 193
    .line 194
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 195
    .line 196
    .line 197
    move-result v0

    .line 198
    if-eqz v0, :cond_13

    .line 199
    .line 200
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getLastValue()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 205
    .line 206
    new-instance v0, Ljava/io/File;

    .line 207
    .line 208
    iget-object v3, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 209
    .line 210
    invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    if-eqz v0, :cond_e

    .line 218
    .line 219
    iput-boolean v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->jarOutput:Z

    .line 220
    .line 221
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outputIsDirectory:Z

    .line 222
    .line 223
    goto/16 :goto_0

    .line 224
    .line 225
    :cond_e
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 226
    .line 227
    const-string v3, ".zip"

    .line 228
    .line 229
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    if-nez v3, :cond_12

    .line 234
    .line 235
    const-string v3, ".jar"

    .line 236
    .line 237
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 238
    .line 239
    .line 240
    move-result v3

    .line 241
    if-nez v3, :cond_12

    .line 242
    .line 243
    const-string v3, ".apk"

    .line 244
    .line 245
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 246
    .line 247
    .line 248
    move-result v0

    .line 249
    if-eqz v0, :cond_f

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_f
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 253
    .line 254
    const-string v3, ".dex"

    .line 255
    .line 256
    invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-nez v0, :cond_11

    .line 261
    .line 262
    iget-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 263
    .line 264
    const-string v3, "-"

    .line 265
    .line 266
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-eqz v0, :cond_10

    .line 271
    .line 272
    goto :goto_1

    .line 273
    :cond_10
    iget-object p1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 274
    .line 275
    iget-object p1, p1, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 276
    .line 277
    new-instance v0, Ljava/lang/StringBuilder;

    .line 278
    .line 279
    const-string v1, "unknown output extension: "

    .line 280
    .line 281
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outName:Ljava/lang/String;

    .line 285
    .line 286
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 287
    .line 288
    .line 289
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    invoke-virtual {p1, p0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 294
    .line 295
    .line 296
    new-instance p0, Lcom/android/dx/command/UsageException;

    .line 297
    .line 298
    invoke-direct {p0}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 299
    .line 300
    .line 301
    throw p0

    .line 302
    :cond_11
    :goto_1
    iput-boolean v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->jarOutput:Z

    .line 303
    .line 304
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->outputIsDirectDex:Z

    .line 305
    .line 306
    goto/16 :goto_0

    .line 307
    .line 308
    :cond_12
    :goto_2
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->jarOutput:Z

    .line 309
    .line 310
    goto/16 :goto_0

    .line 311
    .line 312
    :cond_13
    const-string v0, "--dump-to="

    .line 313
    .line 314
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-eqz v0, :cond_14

    .line 319
    .line 320
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getLastValue()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->humanOutName:Ljava/lang/String;

    .line 325
    .line 326
    goto/16 :goto_0

    .line 327
    .line 328
    :cond_14
    const-string v0, "--dump-width="

    .line 329
    .line 330
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_15

    .line 335
    .line 336
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getLastValue()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 341
    .line 342
    .line 343
    move-result v0

    .line 344
    iput v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->dumpWidth:I

    .line 345
    .line 346
    goto/16 :goto_0

    .line 347
    .line 348
    :cond_15
    const-string v0, "--dump-method="

    .line 349
    .line 350
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 351
    .line 352
    .line 353
    move-result v0

    .line 354
    if-eqz v0, :cond_16

    .line 355
    .line 356
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getLastValue()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->methodToDump:Ljava/lang/String;

    .line 361
    .line 362
    iput-boolean v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->jarOutput:Z

    .line 363
    .line 364
    goto/16 :goto_0

    .line 365
    .line 366
    :cond_16
    const-string v0, "--positions="

    .line 367
    .line 368
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    if-eqz v0, :cond_1a

    .line 373
    .line 374
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getLastValue()Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-virtual {v0}, Ljava/lang/String;->intern()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    const-string v2, "none"

    .line 383
    .line 384
    if-ne v0, v2, :cond_17

    .line 385
    .line 386
    iput v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->positionInfo:I

    .line 387
    .line 388
    goto/16 :goto_0

    .line 389
    .line 390
    :cond_17
    const-string v1, "important"

    .line 391
    .line 392
    if-ne v0, v1, :cond_18

    .line 393
    .line 394
    const/4 v0, 0x3

    .line 395
    iput v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->positionInfo:I

    .line 396
    .line 397
    goto/16 :goto_0

    .line 398
    .line 399
    :cond_18
    const-string v1, "lines"

    .line 400
    .line 401
    if-ne v0, v1, :cond_19

    .line 402
    .line 403
    const/4 v0, 0x2

    .line 404
    iput v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->positionInfo:I

    .line 405
    .line 406
    goto/16 :goto_0

    .line 407
    .line 408
    :cond_19
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 409
    .line 410
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 411
    .line 412
    new-instance p1, Ljava/lang/StringBuilder;

    .line 413
    .line 414
    const-string v1, "unknown positions option: "

    .line 415
    .line 416
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 420
    .line 421
    .line 422
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object p1

    .line 426
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 427
    .line 428
    .line 429
    new-instance p0, Lcom/android/dx/command/UsageException;

    .line 430
    .line 431
    invoke-direct {p0}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 432
    .line 433
    .line 434
    throw p0

    .line 435
    :cond_1a
    const-string v0, "--no-locals"

    .line 436
    .line 437
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 438
    .line 439
    .line 440
    move-result v0

    .line 441
    if-eqz v0, :cond_1b

    .line 442
    .line 443
    iput-boolean v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->localInfo:Z

    .line 444
    .line 445
    goto/16 :goto_0

    .line 446
    .line 447
    :cond_1b
    const-string v0, "--num-threads="

    .line 448
    .line 449
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 450
    .line 451
    .line 452
    move-result v0

    .line 453
    if-eqz v0, :cond_1c

    .line 454
    .line 455
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getLastValue()Ljava/lang/String;

    .line 456
    .line 457
    .line 458
    move-result-object v0

    .line 459
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 460
    .line 461
    .line 462
    move-result v0

    .line 463
    iput v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->numThreads:I

    .line 464
    .line 465
    goto/16 :goto_0

    .line 466
    .line 467
    :cond_1c
    const-string v0, "--incremental"

    .line 468
    .line 469
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    if-eqz v0, :cond_1d

    .line 474
    .line 475
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->incremental:Z

    .line 476
    .line 477
    goto/16 :goto_0

    .line 478
    .line 479
    :cond_1d
    const-string v0, "--force-jumbo"

    .line 480
    .line 481
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 482
    .line 483
    .line 484
    move-result v0

    .line 485
    if-eqz v0, :cond_1e

    .line 486
    .line 487
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->forceJumbo:Z

    .line 488
    .line 489
    goto/16 :goto_0

    .line 490
    .line 491
    :cond_1e
    const-string v0, "--multi-dex"

    .line 492
    .line 493
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 494
    .line 495
    .line 496
    move-result v0

    .line 497
    if-eqz v0, :cond_1f

    .line 498
    .line 499
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->multiDex:Z

    .line 500
    .line 501
    goto/16 :goto_0

    .line 502
    .line 503
    :cond_1f
    const-string v0, "--main-dex-list="

    .line 504
    .line 505
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 506
    .line 507
    .line 508
    move-result v0

    .line 509
    if-eqz v0, :cond_20

    .line 510
    .line 511
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getLastValue()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->mainDexListFile:Ljava/lang/String;

    .line 516
    .line 517
    goto/16 :goto_0

    .line 518
    .line 519
    :cond_20
    const-string v0, "--minimal-main-dex"

    .line 520
    .line 521
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 522
    .line 523
    .line 524
    move-result v0

    .line 525
    if-eqz v0, :cond_21

    .line 526
    .line 527
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->minimalMainDex:Z

    .line 528
    .line 529
    goto/16 :goto_0

    .line 530
    .line 531
    :cond_21
    const-string v0, "--set-max-idx-number="

    .line 532
    .line 533
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 534
    .line 535
    .line 536
    move-result v0

    .line 537
    if-eqz v0, :cond_22

    .line 538
    .line 539
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getLastValue()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 544
    .line 545
    .line 546
    move-result v0

    .line 547
    iput v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->maxNumberOfIdxPerDex:I

    .line 548
    .line 549
    goto/16 :goto_0

    .line 550
    .line 551
    :cond_22
    const-string v0, "--input-list="

    .line 552
    .line 553
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 554
    .line 555
    .line 556
    move-result v0

    .line 557
    if-eqz v0, :cond_23

    .line 558
    .line 559
    new-instance v0, Ljava/io/File;

    .line 560
    .line 561
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getLastValue()Ljava/lang/String;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 569
    .line 570
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 571
    .line 572
    .line 573
    iput-object v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->inputList:Ljava/util/List;

    .line 574
    .line 575
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->inputList:Ljava/util/List;

    .line 580
    .line 581
    invoke-static {v1, v2}, Lcom/android/dx/command/dexer/Main;->access$1100(Ljava/lang/String;Ljava/util/Collection;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 582
    .line 583
    .line 584
    goto/16 :goto_0

    .line 585
    .line 586
    :catch_0
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 587
    .line 588
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 589
    .line 590
    new-instance p1, Ljava/lang/StringBuilder;

    .line 591
    .line 592
    const-string v1, "Unable to read input list file: "

    .line 593
    .line 594
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 595
    .line 596
    .line 597
    invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 602
    .line 603
    .line 604
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object p1

    .line 608
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 609
    .line 610
    .line 611
    new-instance p0, Lcom/android/dx/command/UsageException;

    .line 612
    .line 613
    invoke-direct {p0}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 614
    .line 615
    .line 616
    throw p0

    .line 617
    :cond_23
    const-string v0, "--min-sdk-version="

    .line 618
    .line 619
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 620
    .line 621
    .line 622
    move-result v0

    .line 623
    if-eqz v0, :cond_25

    .line 624
    .line 625
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getLastValue()Ljava/lang/String;

    .line 626
    .line 627
    .line 628
    move-result-object v0

    .line 629
    :try_start_1
    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 630
    .line 631
    .line 632
    move-result v2
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    .line 633
    goto :goto_3

    .line 634
    :catch_1
    const/4 v2, -0x1

    .line 635
    :goto_3
    if-lt v2, v1, :cond_24

    .line 636
    .line 637
    iput v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->minSdkVersion:I

    .line 638
    .line 639
    goto/16 :goto_0

    .line 640
    .line 641
    :cond_24
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 642
    .line 643
    new-instance p1, Ljava/lang/StringBuilder;

    .line 644
    .line 645
    const-string v1, "improper min-sdk-version option: "

    .line 646
    .line 647
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 651
    .line 652
    .line 653
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object p1

    .line 657
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 658
    .line 659
    .line 660
    new-instance p0, Lcom/android/dx/command/UsageException;

    .line 661
    .line 662
    invoke-direct {p0}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 663
    .line 664
    .line 665
    throw p0

    .line 666
    :cond_25
    const-string v0, "--allow-all-interface-method-invokes"

    .line 667
    .line 668
    invoke-virtual {p1, v0}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->isArg(Ljava/lang/String;)Z

    .line 669
    .line 670
    .line 671
    move-result v0

    .line 672
    if-eqz v0, :cond_26

    .line 673
    .line 674
    iput-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->allowAllInterfaceMethodInvokes:Z

    .line 675
    .line 676
    goto/16 :goto_0

    .line 677
    .line 678
    :cond_26
    iget-object p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 679
    .line 680
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 681
    .line 682
    new-instance v0, Ljava/lang/StringBuilder;

    .line 683
    .line 684
    const-string v1, "unknown option: "

    .line 685
    .line 686
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;->getCurrent()Ljava/lang/String;

    .line 690
    .line 691
    .line 692
    move-result-object p1

    .line 693
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 697
    .line 698
    .line 699
    move-result-object p1

    .line 700
    invoke-virtual {p0, p1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    new-instance p0, Lcom/android/dx/command/UsageException;

    .line 704
    .line 705
    invoke-direct {p0}, Lcom/android/dx/command/UsageException;-><init>()V

    .line 706
    .line 707
    .line 708
    throw p0

    .line 709
    :cond_27
    return-void
.end method


# virtual methods
.method public makeOptionsObjects()V
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dx/dex/cf/CfOptions;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/android/dx/dex/cf/CfOptions;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->cfOptions:Lcom/android/dx/dex/cf/CfOptions;

    .line 7
    .line 8
    iget v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->positionInfo:I

    .line 9
    .line 10
    iput v1, v0, Lcom/android/dx/dex/cf/CfOptions;->positionInfo:I

    .line 11
    .line 12
    iget-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->localInfo:Z

    .line 13
    .line 14
    iput-boolean v1, v0, Lcom/android/dx/dex/cf/CfOptions;->localInfo:Z

    .line 15
    .line 16
    iget-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->strictNameCheck:Z

    .line 17
    .line 18
    iput-boolean v1, v0, Lcom/android/dx/dex/cf/CfOptions;->strictNameCheck:Z

    .line 19
    .line 20
    iget-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->optimize:Z

    .line 21
    .line 22
    iput-boolean v1, v0, Lcom/android/dx/dex/cf/CfOptions;->optimize:Z

    .line 23
    .line 24
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->optimizeListFile:Ljava/lang/String;

    .line 25
    .line 26
    iput-object v1, v0, Lcom/android/dx/dex/cf/CfOptions;->optimizeListFile:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->dontOptimizeListFile:Ljava/lang/String;

    .line 29
    .line 30
    iput-object v1, v0, Lcom/android/dx/dex/cf/CfOptions;->dontOptimizeListFile:Ljava/lang/String;

    .line 31
    .line 32
    iget-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->statistics:Z

    .line 33
    .line 34
    iput-boolean v1, v0, Lcom/android/dx/dex/cf/CfOptions;->statistics:Z

    .line 35
    .line 36
    iget-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->warnings:Z

    .line 37
    .line 38
    iget-object v2, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 39
    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    iget-object v1, v2, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 43
    .line 44
    iput-object v1, v0, Lcom/android/dx/dex/cf/CfOptions;->warn:Ljava/io/PrintStream;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object v1, v2, Lcom/android/dx/command/dexer/DxContext;->noop:Ljava/io/PrintStream;

    .line 48
    .line 49
    iput-object v1, v0, Lcom/android/dx/dex/cf/CfOptions;->warn:Ljava/io/PrintStream;

    .line 50
    .line 51
    :goto_0
    new-instance v0, Lcom/android/dx/dex/DexOptions;

    .line 52
    .line 53
    iget-object v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->context:Lcom/android/dx/command/dexer/DxContext;

    .line 54
    .line 55
    iget-object v1, v1, Lcom/android/dx/command/dexer/DxContext;->err:Ljava/io/PrintStream;

    .line 56
    .line 57
    invoke-direct {v0, v1}, Lcom/android/dx/dex/DexOptions;-><init>(Ljava/io/PrintStream;)V

    .line 58
    .line 59
    .line 60
    iput-object v0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->dexOptions:Lcom/android/dx/dex/DexOptions;

    .line 61
    .line 62
    iget v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->minSdkVersion:I

    .line 63
    .line 64
    iput v1, v0, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    .line 65
    .line 66
    iget-boolean v1, p0, Lcom/android/dx/command/dexer/Main$Arguments;->forceJumbo:Z

    .line 67
    .line 68
    iput-boolean v1, v0, Lcom/android/dx/dex/DexOptions;->forceJumbo:Z

    .line 69
    .line 70
    iget-boolean p0, p0, Lcom/android/dx/command/dexer/Main$Arguments;->allowAllInterfaceMethodInvokes:Z

    .line 71
    .line 72
    iput-boolean p0, v0, Lcom/android/dx/dex/DexOptions;->allowAllInterfaceMethodInvokes:Z

    .line 73
    .line 74
    return-void
.end method

.method public parseFlags([Ljava/lang/String;)V
    .locals 1

    .line 710
    new-instance v0, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;

    invoke-direct {v0, p1}, Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;-><init>([Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/android/dx/command/dexer/Main$Arguments;->parseFlags(Lcom/android/dx/command/dexer/Main$Arguments$ArgumentsParser;)V

    return-void
.end method
