.class public Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;
.super Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForLoadedType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field private static final DISPATCHER:Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

.field private static final TYPE_CACHE:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private transient synthetic classFileVersion:Lnet/bytebuddy/ClassFileVersion;

.field private transient synthetic declaredAnnotations:Lnet/bytebuddy/description/annotation/AnnotationList;

.field private transient synthetic declaredFields:Lnet/bytebuddy/description/field/FieldList;

.field private transient synthetic declaredMethods:Lnet/bytebuddy/description/method/MethodList;

.field private final type:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "java.security.AccessController"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "net.bytebuddy.securitymanager"

    .line 9
    .line 10
    const-string v2, "true"

    .line 11
    .line 12
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sput-boolean v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/4 v0, 0x1

    .line 24
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    const-class v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

    .line 27
    .line 28
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

    .line 37
    .line 38
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->DISPATCHER:Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

    .line 39
    .line 40
    new-instance v0, Ljava/util/HashMap;

    .line 41
    .line 42
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 43
    .line 44
    .line 45
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->TYPE_CACHE:Ljava/util/Map;

    .line 46
    .line 47
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 48
    .line 49
    const-class v2, Lnet/bytebuddy/dynamic/TargetType;

    .line 50
    .line 51
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 58
    .line 59
    const-class v2, Ljava/lang/Class;

    .line 60
    .line 61
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 68
    .line 69
    const-class v2, Ljava/lang/Throwable;

    .line 70
    .line 71
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 72
    .line 73
    .line 74
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 78
    .line 79
    const-class v2, Ljava/lang/annotation/Annotation;

    .line 80
    .line 81
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 82
    .line 83
    .line 84
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 88
    .line 89
    const-class v2, Ljava/lang/Object;

    .line 90
    .line 91
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 98
    .line 99
    const-class v2, Ljava/lang/String;

    .line 100
    .line 101
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 108
    .line 109
    const-class v2, Ljava/lang/Boolean;

    .line 110
    .line 111
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 112
    .line 113
    .line 114
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 118
    .line 119
    const-class v2, Ljava/lang/Byte;

    .line 120
    .line 121
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 128
    .line 129
    const-class v2, Ljava/lang/Short;

    .line 130
    .line 131
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 138
    .line 139
    const-class v2, Ljava/lang/Character;

    .line 140
    .line 141
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 148
    .line 149
    const-class v2, Ljava/lang/Integer;

    .line 150
    .line 151
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 152
    .line 153
    .line 154
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 158
    .line 159
    const-class v2, Ljava/lang/Long;

    .line 160
    .line 161
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 168
    .line 169
    const-class v2, Ljava/lang/Float;

    .line 170
    .line 171
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 172
    .line 173
    .line 174
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 178
    .line 179
    const-class v2, Ljava/lang/Double;

    .line 180
    .line 181
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 182
    .line 183
    .line 184
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 188
    .line 189
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 190
    .line 191
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 192
    .line 193
    .line 194
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 198
    .line 199
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 200
    .line 201
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 208
    .line 209
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 210
    .line 211
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 212
    .line 213
    .line 214
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 218
    .line 219
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 220
    .line 221
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 222
    .line 223
    .line 224
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 228
    .line 229
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 230
    .line 231
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 232
    .line 233
    .line 234
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 238
    .line 239
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 240
    .line 241
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 242
    .line 243
    .line 244
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 248
    .line 249
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 250
    .line 251
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 252
    .line 253
    .line 254
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 258
    .line 259
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 260
    .line 261
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 262
    .line 263
    .line 264
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 268
    .line 269
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 270
    .line 271
    invoke-direct {v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 272
    .line 273
    .line 274
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 5
    .line 6
    return-void
.end method

.method public static synthetic access$300()Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->DISPATCHER:Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

    .line 2
    .line 3
    return-object v0
.end method

.method private static doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/security/PrivilegedAction<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->ACCESS_CONTROLLER:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static getName(Ljava/lang/Class;)Ljava/lang/String;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/16 v0, 0x2f

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(I)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, -0x1

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0
.end method

.method public static of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lnet/bytebuddy/description/type/TypeDescription;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->TYPE_CACHE:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;-><init>(Ljava/lang/Class;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    return-object v0
.end method


# virtual methods
.method public asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getCanonicalName()Ljava/lang/String;
    .locals 4
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/description/NamedElement;->NO_NAME:Ljava/lang/String;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/16 v1, 0x2f

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, -0x1

    .line 19
    if-ne v1, v2, :cond_1

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_1
    new-instance v2, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 33
    .line 34
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_2

    .line 39
    .line 40
    const-string v0, "[]"

    .line 41
    .line 42
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0
.end method

.method public getClassFileVersion()Lnet/bytebuddy/ClassFileVersion;
    .locals 2
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "classFileVersion"
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    :try_start_0
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-static {v0}, Lnet/bytebuddy/ClassFileVersion;->of(Ljava/lang/Class;)Lnet/bytebuddy/ClassFileVersion;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 13
    :catchall_0
    :goto_0
    if-nez v1, :cond_1

    .line 14
    .line 15
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    iput-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 19
    .line 20
    :goto_1
    return-object v1
.end method

.method public bridge synthetic getComponentType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 17
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getComponentType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    return-object p0
.end method

.method public getComponentType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 2
    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "declaredAnnotations"
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->declaredAnnotations:Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;

    .line 8
    .line 9
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;-><init>([Ljava/lang/annotation/Annotation;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    if-nez v0, :cond_1

    .line 19
    .line 20
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->declaredAnnotations:Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->declaredAnnotations:Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 24
    .line 25
    return-object v0
.end method

.method public getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/field/FieldList<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "declaredFields"
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->declaredFields:Lnet/bytebuddy/description/field/FieldList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Lnet/bytebuddy/description/field/FieldList$ForLoadedFields;

    .line 8
    .line 9
    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-object v2, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    sget-object v3, Lnet/bytebuddy/utility/FieldComparator;->INSTANCE:Lnet/bytebuddy/utility/FieldComparator;

    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Lnet/bytebuddy/utility/GraalImageCode;->sorted([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    check-cast v1, [Ljava/lang/reflect/Field;

    .line 26
    .line 27
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/field/FieldList$ForLoadedFields;-><init>([Ljava/lang/reflect/Field;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->declaredFields:Lnet/bytebuddy/description/field/FieldList;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->declaredFields:Lnet/bytebuddy/description/field/FieldList;

    .line 36
    .line 37
    return-object v0
.end method

.method public getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/MethodList<",
            "Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;",
            ">;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/CachedReturnPlugin$Enhance;
        value = "declaredMethods"
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->declaredMethods:Lnet/bytebuddy/description/method/MethodList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    new-instance v0, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;

    .line 8
    .line 9
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-direct {v0, v1}, Lnet/bytebuddy/description/method/MethodList$ForLoadedMethods;-><init>(Ljava/lang/Class;)V

    .line 12
    .line 13
    .line 14
    :goto_0
    if-nez v0, :cond_1

    .line 15
    .line 16
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->declaredMethods:Lnet/bytebuddy/description/method/MethodList;

    .line 17
    .line 18
    return-object p0

    .line 19
    :cond_1
    iput-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->declaredMethods:Lnet/bytebuddy/description/method/MethodList;

    .line 20
    .line 21
    return-object v0
.end method

.method public getDeclaredTypes()Lnet/bytebuddy/description/type/TypeList;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;

    .line 2
    .line 3
    invoke-static {}, Lnet/bytebuddy/utility/GraalImageCode;->getCurrent()Lnet/bytebuddy/utility/GraalImageCode;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    sget-object v2, Lnet/bytebuddy/utility/TypeComparator;->INSTANCE:Lnet/bytebuddy/utility/TypeComparator;

    .line 14
    .line 15
    invoke-virtual {v1, p0, v2}, Lnet/bytebuddy/utility/GraalImageCode;->sorted([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast p0, [Ljava/lang/Class;

    .line 20
    .line 21
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;-><init>([Ljava/lang/Class;)V

    .line 22
    .line 23
    .line 24
    return-object v0
.end method

.method public bridge synthetic getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 17
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    return-object p0
.end method

.method public getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaringClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getDescriptor()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x2f

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, -0x1

    .line 14
    if-ne v2, v3, :cond_0

    .line 15
    .line 16
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {p0}, Lnet/bytebuddy/jar/asm/Type;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v3, "L"

    .line 26
    .line 27
    invoke-direct {p0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    const/16 v2, 0x2e

    .line 36
    .line 37
    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    const-string v0, ";"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    return-object p0
.end method

.method public getEnclosingMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getEnclosingMethod()Ljava/lang/reflect/Method;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getEnclosingConstructor()Ljava/lang/reflect/Constructor;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance p0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 16
    .line 17
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 18
    .line 19
    .line 20
    return-object p0

    .line 21
    :cond_0
    if-eqz p0, :cond_1

    .line 22
    .line 23
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;

    .line 24
    .line 25
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedConstructor;-><init>(Ljava/lang/reflect/Constructor;)V

    .line 26
    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_1
    sget-object p0, Lnet/bytebuddy/description/method/MethodDescription;->UNDEFINED:Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 30
    .line 31
    return-object p0
.end method

.method public getEnclosingType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getEnclosingClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 1

    .line 1
    sget-boolean v0, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->RAW_TYPES:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->isArray()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription;->ARRAY_INTERFACES:Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;

    .line 15
    .line 16
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes;-><init>([Ljava/lang/reflect/Type;)V

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :cond_1
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->isArray()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription;->ARRAY_INTERFACES:Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 33
    .line 34
    return-object p0

    .line 35
    :cond_2
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$OfLoadedInterfaceTypes;

    .line 36
    .line 37
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 38
    .line 39
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Generic$OfLoadedInterfaceTypes;-><init>(Ljava/lang/Class;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public getModifiers()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getModifiers()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getName()Ljava/lang/String;
    .locals 0

    .line 21
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->getName(Ljava/lang/Class;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public getNestHost()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 2

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->DISPATCHER:Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;->getNestHost(Ljava/lang/Class;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method

.method public getNestMembers()Lnet/bytebuddy/description/type/TypeList;
    .locals 3

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->DISPATCHER:Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;->getNestMembers(Ljava/lang/Class;)[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;

    .line 10
    .line 11
    array-length v2, v0

    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    new-array v0, v0, [Ljava/lang/Class;

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 19
    .line 20
    aput-object p0, v0, v2

    .line 21
    .line 22
    :cond_0
    invoke-direct {v1, v0}, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;-><init>([Ljava/lang/Class;)V

    .line 23
    .line 24
    .line 25
    return-object v1
.end method

.method public getPackage()Lnet/bytebuddy/description/type/PackageDescription;
    .locals 3
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_3

    .line 8
    .line 9
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    const/16 v0, 0x2e

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    const/4 v1, -0x1

    .line 39
    if-ne v0, v1, :cond_1

    .line 40
    .line 41
    sget-object p0, Lnet/bytebuddy/description/type/PackageDescription;->DEFAULT:Lnet/bytebuddy/description/type/PackageDescription;

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_1
    new-instance v1, Lnet/bytebuddy/description/type/PackageDescription$Simple;

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-direct {v1, p0}, Lnet/bytebuddy/description/type/PackageDescription$Simple;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_2
    new-instance p0, Lnet/bytebuddy/description/type/PackageDescription$ForLoadedPackage;

    .line 56
    .line 57
    invoke-direct {p0, v0}, Lnet/bytebuddy/description/type/PackageDescription$ForLoadedPackage;-><init>(Ljava/lang/Package;)V

    .line 58
    .line 59
    .line 60
    return-object p0

    .line 61
    :cond_3
    :goto_0
    sget-object p0, Lnet/bytebuddy/description/type/PackageDescription;->UNDEFINED:Lnet/bytebuddy/description/type/PackageDescription;

    .line 62
    .line 63
    return-object p0
.end method

.method public getPermittedSubtypes()Lnet/bytebuddy/description/type/TypeList;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->DISPATCHER:Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;->getPermittedSubclasses(Ljava/lang/Class;)[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    new-instance p0, Lnet/bytebuddy/description/type/TypeList$Empty;

    .line 12
    .line 13
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeList$Empty;-><init>()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;-><init>([Ljava/lang/Class;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public getRecordComponents()Lnet/bytebuddy/description/type/RecordComponentList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/type/RecordComponentList<",
            "Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->DISPATCHER:Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;->getRecordComponents(Ljava/lang/Class;)[Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    new-instance p0, Lnet/bytebuddy/description/type/RecordComponentList$Empty;

    .line 12
    .line 13
    invoke-direct {p0}, Lnet/bytebuddy/description/type/RecordComponentList$Empty;-><init>()V

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    new-instance v0, Lnet/bytebuddy/description/type/RecordComponentList$ForLoadedRecordComponents;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/RecordComponentList$ForLoadedRecordComponents;-><init>([Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public getSimpleName()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const/16 v1, 0x2f

    .line 8
    .line 9
    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, -0x1

    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    invoke-virtual {v0, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 28
    .line 29
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_1

    .line 34
    .line 35
    const-string v0, "[]"

    .line 36
    .line 37
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    return-object p0
.end method

.method public getStackSize()Lnet/bytebuddy/implementation/bytecode/StackSize;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/lang/Class;)Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 2
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->RAW_TYPES:Z

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_1
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProjection$ForLoadedSuperClass;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method

.method public getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 1

    .line 1
    sget-boolean v0, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->RAW_TYPES:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance p0, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;

    .line 6
    .line 7
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeList$Generic$Empty;-><init>()V

    .line 8
    .line 9
    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 12
    .line 13
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeList$Generic$ForLoadedTypes$OfTypeVariables;->of(Ljava/lang/reflect/GenericDeclaration;)Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public isAnnotation()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isAnnotation()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isAnonymousType()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isAnonymousClass()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isArray()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isArray()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isAssignableFrom(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public isAssignableFrom(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 6
    .line 7
    move-object v1, p1

    .line 8
    check-cast v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 9
    .line 10
    iget-object v1, v1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    invoke-super {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableFrom(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    :cond_1
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_2
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public isAssignableTo(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 28
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public isAssignableTo(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 7
    .line 8
    iget-object v0, v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 9
    .line 10
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    :cond_0
    invoke-super {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isAssignableTo(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    if-eqz p0, :cond_2

    .line 23
    .line 24
    :cond_1
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_2
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method public isInHierarchyWith(Ljava/lang/Class;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    invoke-virtual {v0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-super {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isInHierarchyWith(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public isInHierarchyWith(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 7
    .line 8
    iget-object v1, v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 9
    .line 10
    iget-object v2, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 19
    .line 20
    iget-object v0, v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-nez v0, :cond_1

    .line 27
    .line 28
    :cond_0
    invoke-super {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isInHierarchyWith(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    :cond_1
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_2
    const/4 p0, 0x0

    .line 37
    return p0
.end method

.method public isLocalType()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isLocalClass()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isMemberType()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isMemberClass()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isNestHost()Z
    .locals 2

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->DISPATCHER:Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

    .line 2
    .line 3
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-interface {v0, v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;->getNestHost(Ljava/lang/Class;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 12
    .line 13
    if-ne v0, p0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0

    .line 18
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 19
    return p0
.end method

.method public isNestMateOf(Ljava/lang/Class;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 30
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->DISPATCHER:Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    invoke-interface {v0, v1, p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;->isNestmateOf(Ljava/lang/Class;Ljava/lang/Class;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p1

    invoke-super {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isNestMateOf(Lnet/bytebuddy/description/type/TypeDescription;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public isNestMateOf(Lnet/bytebuddy/description/type/TypeDescription;)Z
    .locals 3

    .line 1
    instance-of v0, p1, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->DISPATCHER:Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

    .line 6
    .line 7
    iget-object v1, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 8
    .line 9
    move-object v2, p1

    .line 10
    check-cast v2, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;

    .line 11
    .line 12
    iget-object v2, v2, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-interface {v0, v1, v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;->isNestmateOf(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    :cond_0
    invoke-super {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->isNestMateOf(Lnet/bytebuddy/description/type/TypeDescription;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    :cond_1
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_2
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public isPrimitive()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isPrimitive()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public isRecord()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->DISPATCHER:Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;->isRecord(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public isSealed()Z
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->DISPATCHER:Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType$Dispatcher;->isSealed(Ljava/lang/Class;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public represents(Ljava/lang/reflect/Type;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->type:Ljava/lang/Class;

    .line 2
    .line 3
    if-eq p1, v0, :cond_1

    .line 4
    .line 5
    invoke-super {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$AbstractBase;->represents(Ljava/lang/reflect/Type;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method public toModuleDescription()Lnet/bytebuddy/description/module/ModuleDescription;
    .locals 0
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object p0, Lnet/bytebuddy/description/module/ModuleDescription;->UNDEFINED:Lnet/bytebuddy/description/module/ModuleDescription;

    .line 2
    .line 3
    return-object p0
.end method
