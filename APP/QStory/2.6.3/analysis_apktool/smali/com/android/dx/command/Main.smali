.class public Lcom/android/dx/command/Main;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# static fields
.field private static final USAGE_MESSAGE:Ljava/lang/String; = "usage:\n  dx --dex [--debug] [--verbose] [--positions=<style>] [--no-locals]\n  [--no-optimize] [--statistics] [--[no-]optimize-list=<file>] [--no-strict]\n  [--keep-classes] [--output=<file>] [--dump-to=<file>] [--dump-width=<n>]\n  [--dump-method=<name>[*]] [--verbose-dump] [--no-files] [--core-library]\n  [--num-threads=<n>] [--incremental] [--force-jumbo] [--no-warning]\n  [--multi-dex [--main-dex-list=<file> [--minimal-main-dex]]\n  [--input-list=<file>] [--min-sdk-version=<n>]\n  [--allow-all-interface-method-invokes]\n  [<file>.class | <file>.{zip,jar,apk} | <directory>] ...\n    Convert a set of classfiles into a dex file, optionally embedded in a\n    jar/zip. Output name must end with one of: .dex .jar .zip .apk or be a\n    directory.\n    Positions options: none, important, lines.\n    --multi-dex: allows to generate several dex files if needed. This option is\n    exclusive with --incremental, causes --num-threads to be ignored and only\n    supports folder or archive output.\n    --main-dex-list=<file>: <file> is a list of class file names, classes\n    defined by those class files are put in classes.dex.\n    --minimal-main-dex: only classes selected by --main-dex-list are to be put\n    in the main dex.\n    --input-list: <file> is a list of inputs.\n    Each line in <file> must end with one of: .class .jar .zip .apk or be a\n    directory.\n    --min-sdk-version=<n>: Enable dex file features that require at least sdk\n    version <n>.\n  dx --annotool --annotation=<class> [--element=<element types>]\n  [--print=<print types>]\n  dx --dump [--debug] [--strict] [--bytes] [--optimize]\n  [--basic-blocks | --rop-blocks | --ssa-blocks | --dot] [--ssa-step=<step>]\n  [--width=<n>] [<file>.class | <file>.txt] ...\n    Dump classfiles, or transformations thereof, in a human-oriented format.\n  dx --find-usages <file.dex> <declaring type> <member>\n    Find references and declarations to a field or method.\n    <declaring type> is a class name in internal form, like Ljava/lang/Object;\n    <member> is a field or method name, like hashCode.\n  dx -J<option> ... <arguments, in one of the above forms>\n    Pass VM-specific options to the virtual machine that runs dx.\n  dx --version\n    Print the version of this tool (1.16).\n  dx --help\n    Print this message."


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static main([Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, "--"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    const/4 v3, 0x1

    .line 6
    :try_start_0
    array-length v4, p0

    .line 7
    if-ge v2, v4, :cond_7

    .line 8
    .line 9
    aget-object v4, p0, v2

    .line 10
    .line 11
    invoke-virtual {v4, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v5

    .line 15
    if-nez v5, :cond_a

    .line 16
    .line 17
    invoke-virtual {v4, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 18
    .line 19
    .line 20
    move-result v5
    :try_end_0
    .catch Lcom/android/dx/command/UsageException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    if-nez v5, :cond_0

    .line 22
    .line 23
    goto/16 :goto_5

    .line 24
    .line 25
    :cond_0
    :try_start_1
    const-string v5, "--dex"

    .line 26
    .line 27
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v5

    .line 31
    if-eqz v5, :cond_1

    .line 32
    .line 33
    invoke-static {p0, v2}, Lcom/android/dx/command/Main;->without([Ljava/lang/String;I)[Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {p0}, Lcom/android/dx/command/dexer/Main;->main([Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    move v0, v3

    .line 43
    goto/16 :goto_2

    .line 44
    .line 45
    :catch_0
    move-exception p0

    .line 46
    move v0, v3

    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :catch_1
    move v1, v3

    .line 50
    goto/16 :goto_5

    .line 51
    .line 52
    :cond_1
    const-string v5, "--dump"

    .line 53
    .line 54
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v5

    .line 58
    if-eqz v5, :cond_2

    .line 59
    .line 60
    invoke-static {p0, v2}, Lcom/android/dx/command/Main;->without([Ljava/lang/String;I)[Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, Lcom/android/dx/command/dump/Main;->main([Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const-string v5, "--annotool"

    .line 69
    .line 70
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_3

    .line 75
    .line 76
    invoke-static {p0, v2}, Lcom/android/dx/command/Main;->without([Ljava/lang/String;I)[Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, Lcom/android/dx/command/annotool/Main;->main([Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    const-string v5, "--find-usages"

    .line 85
    .line 86
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_4

    .line 91
    .line 92
    invoke-static {p0, v2}, Lcom/android/dx/command/Main;->without([Ljava/lang/String;I)[Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-static {p0}, Lcom/android/dx/command/findusages/Main;->main([Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    const-string v5, "--version"

    .line 101
    .line 102
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    if-eqz v5, :cond_5

    .line 107
    .line 108
    invoke-static {}, Lcom/android/dx/command/Main;->version()V

    .line 109
    .line 110
    .line 111
    :goto_1
    move p0, v1

    .line 112
    move v1, v3

    .line 113
    goto :goto_6

    .line 114
    :cond_5
    const-string v5, "--help"

    .line 115
    .line 116
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v4
    :try_end_1
    .catch Lcom/android/dx/command/UsageException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    if-eqz v4, :cond_6

    .line 121
    .line 122
    move p0, v3

    .line 123
    move v1, p0

    .line 124
    goto :goto_6

    .line 125
    :cond_6
    add-int/lit8 v2, v2, 0x1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :catchall_1
    move-exception p0

    .line 129
    move v0, v1

    .line 130
    goto :goto_2

    .line 131
    :catch_2
    move-exception p0

    .line 132
    move v0, v1

    .line 133
    goto :goto_4

    .line 134
    :cond_7
    move p0, v1

    .line 135
    goto :goto_6

    .line 136
    :goto_2
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 137
    .line 138
    const-string v4, "\nUNEXPECTED TOP-LEVEL ERROR:"

    .line 139
    .line 140
    invoke-virtual {v2, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 144
    .line 145
    .line 146
    instance-of v2, p0, Ljava/lang/NoClassDefFoundError;

    .line 147
    .line 148
    if-nez v2, :cond_8

    .line 149
    .line 150
    instance-of p0, p0, Ljava/lang/NoSuchMethodError;

    .line 151
    .line 152
    if-eqz p0, :cond_9

    .line 153
    .line 154
    :cond_8
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 155
    .line 156
    const-string v2, "Note: You may be using an incompatible virtual machine or class library.\n(This program is known to be incompatible with recent releases of GCJ.)"

    .line 157
    .line 158
    invoke-virtual {p0, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    :cond_9
    const/4 p0, 0x3

    .line 162
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 163
    .line 164
    .line 165
    :goto_3
    move p0, v1

    .line 166
    move v1, v0

    .line 167
    goto :goto_6

    .line 168
    :goto_4
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 169
    .line 170
    const-string v4, "\nUNEXPECTED TOP-LEVEL EXCEPTION:"

    .line 171
    .line 172
    invoke-virtual {v2, v4}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 176
    .line 177
    .line 178
    const/4 p0, 0x2

    .line 179
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 180
    .line 181
    .line 182
    goto :goto_3

    .line 183
    :catch_3
    :cond_a
    :goto_5
    move p0, v3

    .line 184
    :goto_6
    if-nez v1, :cond_b

    .line 185
    .line 186
    sget-object p0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 187
    .line 188
    const-string v0, "error: no command specified"

    .line 189
    .line 190
    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    move p0, v3

    .line 194
    :cond_b
    if-eqz p0, :cond_c

    .line 195
    .line 196
    invoke-static {}, Lcom/android/dx/command/Main;->usage()V

    .line 197
    .line 198
    .line 199
    invoke-static {v3}, Ljava/lang/System;->exit(I)V

    .line 200
    .line 201
    .line 202
    :cond_c
    return-void
.end method

.method private static usage()V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v1, "usage:\n  dx --dex [--debug] [--verbose] [--positions=<style>] [--no-locals]\n  [--no-optimize] [--statistics] [--[no-]optimize-list=<file>] [--no-strict]\n  [--keep-classes] [--output=<file>] [--dump-to=<file>] [--dump-width=<n>]\n  [--dump-method=<name>[*]] [--verbose-dump] [--no-files] [--core-library]\n  [--num-threads=<n>] [--incremental] [--force-jumbo] [--no-warning]\n  [--multi-dex [--main-dex-list=<file> [--minimal-main-dex]]\n  [--input-list=<file>] [--min-sdk-version=<n>]\n  [--allow-all-interface-method-invokes]\n  [<file>.class | <file>.{zip,jar,apk} | <directory>] ...\n    Convert a set of classfiles into a dex file, optionally embedded in a\n    jar/zip. Output name must end with one of: .dex .jar .zip .apk or be a\n    directory.\n    Positions options: none, important, lines.\n    --multi-dex: allows to generate several dex files if needed. This option is\n    exclusive with --incremental, causes --num-threads to be ignored and only\n    supports folder or archive output.\n    --main-dex-list=<file>: <file> is a list of class file names, classes\n    defined by those class files are put in classes.dex.\n    --minimal-main-dex: only classes selected by --main-dex-list are to be put\n    in the main dex.\n    --input-list: <file> is a list of inputs.\n    Each line in <file> must end with one of: .class .jar .zip .apk or be a\n    directory.\n    --min-sdk-version=<n>: Enable dex file features that require at least sdk\n    version <n>.\n  dx --annotool --annotation=<class> [--element=<element types>]\n  [--print=<print types>]\n  dx --dump [--debug] [--strict] [--bytes] [--optimize]\n  [--basic-blocks | --rop-blocks | --ssa-blocks | --dot] [--ssa-step=<step>]\n  [--width=<n>] [<file>.class | <file>.txt] ...\n    Dump classfiles, or transformations thereof, in a human-oriented format.\n  dx --find-usages <file.dex> <declaring type> <member>\n    Find references and declarations to a field or method.\n    <declaring type> is a class name in internal form, like Ljava/lang/Object;\n    <member> is a field or method name, like hashCode.\n  dx -J<option> ... <arguments, in one of the above forms>\n    Pass VM-specific options to the virtual machine that runs dx.\n  dx --version\n    Print the version of this tool (1.16).\n  dx --help\n    Print this message."

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private static version()V
    .locals 2

    .line 1
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 2
    .line 3
    const-string v1, "dx version 1.16"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0}, Ljava/lang/System;->exit(I)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method private static without([Ljava/lang/String;I)[Ljava/lang/String;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    new-array v1, v0, [Ljava/lang/String;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    invoke-static {p0, v2, v1, v2, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8
    .line 9
    .line 10
    add-int/lit8 v2, p1, 0x1

    .line 11
    .line 12
    sub-int/2addr v0, p1

    .line 13
    invoke-static {p0, v2, v1, p1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    .line 15
    .line 16
    return-object v1
.end method
