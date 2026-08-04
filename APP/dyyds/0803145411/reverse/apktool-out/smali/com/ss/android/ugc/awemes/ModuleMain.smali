.class public final Lcom/ss/android/ugc/awemes/ModuleMain;
.super Lcom/ss/android/ugc/awemes/wrapper/ModuleMainWrapper;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"


# static fields
.field public static final synthetic ᛲᲈᲁ:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/github/libxposed/api/XposedModule;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public native e([B)[B
.end method

.method public final onModuleLoaded(Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;)V
    .locals 4

    .line 1
    const-wide v0, -0x40f5be68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    sget-object v0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 10
    .line 11
    new-instance v1, Lyyds/ᛶᛶᛴᲇ;

    .line 12
    .line 13
    invoke-direct {v1, p1}, Lyyds/ᛶᛶᛴᲇ;-><init>(Lio/github/libxposed/api/XposedModuleInterface$ModuleLoadedParam;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const-wide v2, -0x2a1a6e68a836eL

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    const-wide v2, -0x2a1ade68a836eL

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    const-wide v2, -0x2a0ede68a836eL

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    sput-object p0, Lyyds/ᲈᛷᛵᛷ;->ᛵᛸᛸᛷ:Lcom/ss/android/ugc/awemes/ModuleMain;

    .line 44
    .line 45
    invoke-virtual {p0}, Lio/github/libxposed/api/XposedModule;->getModuleApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    const-wide v2, -0x2a1bfe68a836eL

    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    const-wide v2, -0x2a10be68a836eL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {v2, v3}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    sput-object p0, Lyyds/ᲈᛷᛵᛷ;->ᲀᛲᛳᲀ:Landroid/content/pm/ApplicationInfo;

    .line 66
    .line 67
    const-wide p0, -0x2a141e68a836eL

    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    invoke-static {p0, p1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    sput-object v1, Lyyds/ᲈᛷᛵᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛶᛶᛴᲇ;

    .line 76
    .line 77
    return-void
.end method

.method public final ᛲᲈᲁ(Lyyds/ᛲᲇᲀᲁ;)V
    .locals 4

    .line 1
    const-wide v0, -0x40f61e68a836eL

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lyyds/ᛲᲇᲀᲁ;->getPackageName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-wide v1, -0x40f67e68a836eL

    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p1, Lyyds/ᛲᲇᲀᲁ;->ᛲᲈᲁ:Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;

    .line 30
    .line 31
    invoke-interface {v0}, Lio/github/libxposed/api/XposedModuleInterface$PackageLoadedParam;->isFirstPackage()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-static {}, Landroid/os/Process;->isIsolated()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    :goto_0
    return-void

    .line 45
    :cond_2
    const-wide v0, -0x40f7fe68a836eL

    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lyyds/ᛲᲇᲀᲁ;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->dataDir:Ljava/lang/String;

    .line 62
    .line 63
    const-wide v1, -0x40f86e68a836eL

    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    sget-object v1, Lyyds/ᛱᲀᲀᛸ;->ᛲᲈᲁ:Lyyds/ᛱᲀᲀᛸ;

    .line 72
    .line 73
    new-instance v2, Lyyds/ᲈᛷᲈᛶ;

    .line 74
    .line 75
    const/16 v3, 0x9

    .line 76
    .line 77
    invoke-direct {v2, v3, p0}, Lyyds/ᲈᛷᲈᛶ;-><init>(ILjava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v0, v2}, Lyyds/ᛱᲀᲀᛸ;->ᛵᛸᛸᛷ(Ljava/lang/String;Lyyds/ᛷᛴᲈᲀ;)V

    .line 81
    .line 82
    .line 83
    sget-object v0, Lyyds/ᲈᛷᛵᛷ;->ᛲᲈᲁ:Lyyds/ᲈᛷᛵᛷ;

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    sget-object v0, Lyyds/ᲈᛷᛵᛷ;->ᛲᛴᛳᛲ:Lyyds/ᛶᛶᛴᲇ;

    .line 89
    .line 90
    if-eqz v0, :cond_3

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_3
    const-wide v0, -0x2a12fe68a836eL

    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    const/4 v0, 0x0

    .line 102
    :goto_1
    invoke-virtual {v0}, Lyyds/ᛶᛶᛴᲇ;->getProcessName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    const-wide v1, -0x2a19ee68a836eL

    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    invoke-static {v1, v2}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    sput-object v0, Lyyds/ᲈᛷᛵᛷ;->ᛲᛳᛶᲁ:Ljava/lang/String;

    .line 115
    .line 116
    invoke-virtual {p0}, Lio/github/libxposed/api/XposedModule;->getFrameworkName()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    const-wide v0, -0x40f8ee68a836eL

    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    const-wide v0, -0x2a172e68a836eL

    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    sput-object p0, Lyyds/ᲈᛷᛵᛷ;->ᛶᛷᛲᲁ:Ljava/lang/String;

    .line 137
    .line 138
    const-wide v0, -0x2a15ce68a836eL

    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    sput-object p1, Lyyds/ᲈᛷᛵᛷ;->ᲇᲇᲇᛱ:Lyyds/ᛲᲇᲀᲁ;

    .line 147
    .line 148
    invoke-virtual {p1}, Lyyds/ᛲᲇᲀᲁ;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    const-wide v0, -0x2a127e68a836eL

    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    sput-object p0, Lyyds/ᲈᛷᛵᛷ;->ᲇᲈᛵᛷ:Landroid/content/pm/ApplicationInfo;

    .line 161
    .line 162
    invoke-virtual {p1}, Lyyds/ᛲᲇᲀᲁ;->getDefaultClassLoader()Ljava/lang/ClassLoader;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    const-wide v0, -0x2a18ae68a836eL

    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    invoke-static {v0, v1}, Lyyds/ᲁᲀᲈᛸ;->ᛶᛷᛲᲁ(J)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    sput-object p0, Lyyds/ᲈᛷᛵᛷ;->ᛱᲈᲁ:Ljava/lang/ClassLoader;

    .line 175
    .line 176
    sget-object p0, Lyyds/ᛵᛱᛲᲈ;->ᲇᲇᲇᛱ:Lyyds/ᛵᛱᛲᲈ;

    .line 177
    .line 178
    invoke-virtual {p0}, Lyyds/ᛱᛶᛶᲇ;->ᛷᛸᲇᛶ()V

    .line 179
    .line 180
    .line 181
    return-void
.end method
