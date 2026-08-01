.class public final enum Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;",
        ">;",
        "Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$Factory;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;

.field public static final enum INSTANCE:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;->INSTANCE:Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;->$VALUES:[Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;->$VALUES:[Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Factory;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public make(Ljava/lang/ClassLoader;Ljava/util/Map;)Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator;
    .locals 9
    .param p1    # Ljava/lang/ClassLoader;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ClassLoader;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "[B>;)",
            "Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator;"
        }
    .end annotation

    .line 1
    const-string p0, "module-info"

    .line 2
    .line 3
    invoke-interface {p2, p0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance p0, Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$NoOp;

    .line 10
    .line 11
    invoke-direct {p0, p1}, Lnet/bytebuddy/dynamic/loading/ClassLoaderDecorator$NoOp;-><init>(Ljava/lang/ClassLoader;)V

    .line 12
    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :try_start_0
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$000()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, Ljava/io/ByteArrayInputStream;

    .line 21
    .line 22
    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    check-cast p0, [B

    .line 27
    .line 28
    invoke-direct {v2, p0}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 29
    .line 30
    .line 31
    invoke-interface {v1, v2}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;->read(Ljava/io/InputStream;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    new-instance v1, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;

    .line 36
    .line 37
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$700()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayerController;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$100()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$600()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Configuration;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$100()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;

    .line 50
    .line 51
    .line 52
    move-result-object v5

    .line 53
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$100()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-interface {v6}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;->boot()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    invoke-interface {v5, v6}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;->configuration(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$300()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$000()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    invoke-interface {v7, p0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;->name(Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$200()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    invoke-interface {v8, p0, v0, p2}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleReference;->newInstance(Ljava/lang/Object;Ljava/net/URI;Ljava/util/Map;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    invoke-interface {v6, v7, p2}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$SimpleModuleFinder;->newInstance(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$500()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleFinder;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$400()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Path;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    const/4 v7, 0x0

    .line 98
    invoke-interface {v6, v7}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Path;->of(I)[Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    invoke-interface {v0, v6}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleFinder;->of([Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$000()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    invoke-interface {v6, p0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;->name(Ljava/lang/Object;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    invoke-static {v6}, Ljava/util/Collections;->singleton(Ljava/lang/Object;)Ljava/util/Set;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-interface {v4, v5, p2, v0, v6}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$Configuration;->resolve(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Collection;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p2

    .line 122
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$100()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;->boot()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    invoke-interface {v3, p2, v0, p1}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayer;->defineModulesWithOneLoader(Ljava/lang/Object;Ljava/util/List;Ljava/lang/ClassLoader;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-interface {v2, p2}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleLayerController;->layer(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object p2

    .line 142
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$000()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    invoke-interface {v0, p0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;->name(Ljava/lang/Object;)Ljava/lang/String;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    invoke-static {}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;->access$000()Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-interface {v2, p0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator$ModuleDescriptor;->packages(Ljava/lang/Object;)Ljava/util/Set;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-direct {v1, p1, p2, v0, p0}, Lnet/bytebuddy/dynamic/loading/ModuleLayerFromSingleClassLoaderDecorator;-><init>(Ljava/lang/ClassLoader;Ljava/lang/Object;Ljava/lang/String;Ljava/util/Set;)V

    .line 159
    .line 160
    .line 161
    return-object v1

    .line 162
    :catch_0
    move-exception p0

    .line 163
    const-string p1, "Failed to create module layer"

    .line 164
    .line 165
    invoke-static {p1, p0}, L飘花落叶言苏世哲楪子兰/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    return-object v0
.end method
