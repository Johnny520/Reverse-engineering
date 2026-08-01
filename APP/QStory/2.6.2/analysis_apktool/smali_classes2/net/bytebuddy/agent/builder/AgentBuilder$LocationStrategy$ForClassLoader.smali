.class public abstract enum Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4409
    name = "ForClassLoader"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;",
        ">;",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;

.field public static final enum STRONG:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;

.field public static final enum WEAK:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader$1;

    .line 2
    .line 3
    const-string v1, "STRONG"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader$1;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;->STRONG:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;

    .line 10
    .line 11
    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader$2;

    .line 12
    .line 13
    const-string v3, "WEAK"

    .line 14
    .line 15
    const/4 v4, 0x1

    .line 16
    invoke-direct {v1, v3, v4}, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader$2;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;->WEAK:Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;

    .line 20
    .line 21
    const/4 v3, 0x2

    .line 22
    new-array v3, v3, [Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;

    .line 23
    .line 24
    aput-object v0, v3, v2

    .line 25
    .line 26
    aput-object v1, v3, v4

    .line 27
    .line 28
    sput-object v3, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;

    .line 29
    .line 30
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

.method public synthetic constructor <init>(Ljava/lang/String;ILnet/bytebuddy/agent/builder/AgentBuilder$1;)V
    .locals 0

    .line 5
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public withFallbackTo(Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "+",
            "Lnet/bytebuddy/dynamic/ClassFileLocator;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Lnet/bytebuddy/dynamic/ClassFileLocator;

    .line 25
    .line 26
    new-instance v2, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$Simple;

    .line 27
    .line 28
    invoke-direct {v2, v1}, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$Simple;-><init>(Lnet/bytebuddy/dynamic/ClassFileLocator;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    invoke-virtual {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;->withFallbackTo(Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0
.end method

.method public withFallbackTo(Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;",
            ">;)",
            "Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;"
        }
    .end annotation

    .line 42
    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 43
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 44
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 45
    new-instance p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$Compound;

    invoke-direct {p0, v0}, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$Compound;-><init>(Ljava/util/List;)V

    return-object p0
.end method

.method public varargs withFallbackTo([Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;)Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;
    .locals 0

    .line 41
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;->withFallbackTo(Ljava/util/List;)Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    move-result-object p0

    return-object p0
.end method

.method public varargs withFallbackTo([Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;
    .locals 0

    .line 40
    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy$ForClassLoader;->withFallbackTo(Ljava/util/Collection;)Lnet/bytebuddy/agent/builder/AgentBuilder$LocationStrategy;

    move-result-object p0

    return-object p0
.end method
