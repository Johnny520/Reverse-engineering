.class public final enum Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/security/PrivilegedAction;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/ClassFileVersion$VersionLocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Resolver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;",
        ">;",
        "Ljava/security/PrivilegedAction<",
        "Lnet/bytebuddy/ClassFileVersion$VersionLocator;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;

.field public static final enum INSTANCE:Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;->INSTANCE:Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;->$VALUES:[Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;->$VALUES:[Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public bridge synthetic run()Ljava/lang/Object;
    .locals 0

    .line 220
    invoke-virtual {p0}, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolver;->run()Lnet/bytebuddy/ClassFileVersion$VersionLocator;

    move-result-object p0

    return-object p0
.end method

.method public run()Lnet/bytebuddy/ClassFileVersion$VersionLocator;
    .locals 8

    .line 1
    const-class p0, Ljava/lang/Runtime;

    .line 2
    .line 3
    const-string v0, "$Version"

    .line 4
    .line 5
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    const/4 v1, 0x0

    .line 18
    :try_start_1
    const-string v2, "feature"

    .line 19
    .line 20
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 24
    goto :goto_0

    .line 25
    :catch_0
    :try_start_2
    const-string v2, "major"

    .line 26
    .line 27
    invoke-virtual {v0, v2, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    :goto_0
    new-instance v2, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolved;

    .line 32
    .line 33
    const-string v3, "version"

    .line 34
    .line 35
    invoke-virtual {p0, v3, v1}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0, v1, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    check-cast p0, Ljava/lang/Integer;

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result p0

    .line 53
    invoke-static {p0}, Lnet/bytebuddy/ClassFileVersion;->ofJavaVersion(I)Lnet/bytebuddy/ClassFileVersion;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-direct {v2, p0}, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolved;-><init>(Lnet/bytebuddy/ClassFileVersion;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :catchall_0
    :try_start_3
    const-string p0, "java.version"

    .line 62
    .line 63
    invoke-static {p0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    if-eqz p0, :cond_5

    .line 68
    .line 69
    const-string v0, "0"

    .line 70
    .line 71
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    new-instance p0, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolved;

    .line 78
    .line 79
    sget-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V6:Lnet/bytebuddy/ClassFileVersion;

    .line 80
    .line 81
    invoke-direct {p0, v0}, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolved;-><init>(Lnet/bytebuddy/ClassFileVersion;)V

    .line 82
    .line 83
    .line 84
    return-object p0

    .line 85
    :cond_0
    const-string v0, "-ea"

    .line 86
    .line 87
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    const/4 v1, 0x3

    .line 92
    const/4 v2, 0x0

    .line 93
    if-eqz v0, :cond_1

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    sub-int/2addr v0, v1

    .line 100
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    goto :goto_1

    .line 105
    :cond_1
    const-string v0, "-internal"

    .line 106
    .line 107
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_2

    .line 112
    .line 113
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    add-int/lit8 v0, v0, -0x9

    .line 118
    .line 119
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    :cond_2
    :goto_1
    new-array v0, v1, [I

    .line 124
    .line 125
    const/4 v3, -0x1

    .line 126
    aput v3, v0, v2

    .line 127
    .line 128
    const/4 v4, 0x1

    .line 129
    aput v2, v0, v4

    .line 130
    .line 131
    const/4 v5, 0x2

    .line 132
    aput v2, v0, v5

    .line 133
    .line 134
    move v2, v4

    .line 135
    :goto_2
    if-ge v2, v1, :cond_4

    .line 136
    .line 137
    add-int/lit8 v6, v2, -0x1

    .line 138
    .line 139
    aget v6, v0, v6

    .line 140
    .line 141
    add-int/2addr v6, v4

    .line 142
    const/16 v7, 0x2e

    .line 143
    .line 144
    invoke-virtual {p0, v7, v6}, Ljava/lang/String;->indexOf(II)I

    .line 145
    .line 146
    .line 147
    move-result v6

    .line 148
    aput v6, v0, v2

    .line 149
    .line 150
    if-eq v6, v3, :cond_3

    .line 151
    .line 152
    add-int/lit8 v2, v2, 0x1

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 156
    .line 157
    new-instance v1, Ljava/lang/StringBuilder;

    .line 158
    .line 159
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 160
    .line 161
    .line 162
    const-string v2, "This JVM\'s version string does not seem to be valid: "

    .line 163
    .line 164
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v0

    .line 178
    :cond_4
    new-instance v1, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolved;

    .line 179
    .line 180
    aget v2, v0, v4

    .line 181
    .line 182
    add-int/2addr v2, v4

    .line 183
    aget v0, v0, v5

    .line 184
    .line 185
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    invoke-static {p0}, Lnet/bytebuddy/ClassFileVersion;->ofJavaVersion(I)Lnet/bytebuddy/ClassFileVersion;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    invoke-direct {v1, p0}, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Resolved;-><init>(Lnet/bytebuddy/ClassFileVersion;)V

    .line 198
    .line 199
    .line 200
    return-object v1

    .line 201
    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 202
    .line 203
    const-string v0, "Java version property is not set"

    .line 204
    .line 205
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 209
    :catchall_1
    move-exception p0

    .line 210
    new-instance v0, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Unresolved;

    .line 211
    .line 212
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    invoke-direct {v0, p0}, Lnet/bytebuddy/ClassFileVersion$VersionLocator$Unresolved;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    return-object v0
.end method
