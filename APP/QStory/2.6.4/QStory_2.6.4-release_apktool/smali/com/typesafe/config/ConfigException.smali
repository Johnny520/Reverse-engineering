.class public abstract Lcom/typesafe/config/ConfigException;
.super Ljava/lang/RuntimeException;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/typesafe/config/ConfigException$Generic;,
        Lcom/typesafe/config/ConfigException$BadBean;,
        Lcom/typesafe/config/ConfigException$ValidationFailed;,
        Lcom/typesafe/config/ConfigException$ValidationProblem;,
        Lcom/typesafe/config/ConfigException$NotResolved;,
        Lcom/typesafe/config/ConfigException$UnresolvedSubstitution;,
        Lcom/typesafe/config/ConfigException$Parse;,
        Lcom/typesafe/config/ConfigException$IO;,
        Lcom/typesafe/config/ConfigException$BugOrBroken;,
        Lcom/typesafe/config/ConfigException$BadPath;,
        Lcom/typesafe/config/ConfigException$BadValue;,
        Lcom/typesafe/config/ConfigException$Null;,
        Lcom/typesafe/config/ConfigException$Missing;,
        Lcom/typesafe/config/ConfigException$WrongType;
    }
.end annotation


# static fields
.field private static final serialVersionUID:J = 0x1L


# instance fields
.field private final transient origin:L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    .line 36
    invoke-direct {p0, p1, v0}, Lcom/typesafe/config/ConfigException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 34
    invoke-direct {p0, p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    .line 35
    iput-object p1, p0, Lcom/typesafe/config/ConfigException;->origin:L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;

    return-void
.end method

.method public constructor <init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;)V
    .locals 1

    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ": "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lcom/typesafe/config/ConfigException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public constructor <init>(L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    check-cast p1, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;->飘花落叶言子楪世苏哲兰()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ": "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-direct {p0, p2, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lcom/typesafe/config/ConfigException;->origin:L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;

    .line 31
    .line 32
    return-void
.end method

.method public static synthetic access$000(Ljava/lang/Object;Ljava/lang/Class;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/typesafe/config/ConfigException;->setOriginField(Ljava/lang/Object;Ljava/lang/Class;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private readObject(Ljava/io/ObjectInputStream;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectInputStream;->defaultReadObject()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世哲苏兰(Ljava/io/ObjectInputStream;)Lcom/typesafe/config/impl/飘花落叶言子世苏哲楪兰;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    const-class v0, Lcom/typesafe/config/ConfigException;

    .line 9
    .line 10
    invoke-static {p0, v0, p1}, Lcom/typesafe/config/ConfigException;->setOriginField(Ljava/lang/Object;Ljava/lang/Class;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)V

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method private static setOriginField(Ljava/lang/Object;Ljava/lang/Class;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;",
            "Ljava/lang/Class<",
            "TT;>;",
            "L\u98d8\u82b1\u843d\u53f6\u8a00\u696a\u5170\u4e16\u5b50\u82cf\u54f2/\u98d8\u82b1\u843d\u53f6\u8a00\u5b50\u696a\u4e16\u5170\u54f2\u82cf;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "unable to set origin field"

    .line 2
    .line 3
    :try_start_0
    const-string v1, "origin"

    .line 4
    .line 5
    invoke-virtual {p1, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_2

    .line 9
    const/4 v1, 0x1

    .line 10
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 11
    .line 12
    .line 13
    :try_start_1
    invoke-virtual {p1, p0, p2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p0

    .line 18
    new-instance p1, Ljava/io/IOException;

    .line 19
    .line 20
    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    throw p1

    .line 24
    :catch_1
    move-exception p0

    .line 25
    new-instance p1, Ljava/io/IOException;

    .line 26
    .line 27
    invoke-direct {p1, v0, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 28
    .line 29
    .line 30
    throw p1

    .line 31
    :catch_2
    move-exception p0

    .line 32
    goto :goto_0

    .line 33
    :catch_3
    move-exception p0

    .line 34
    goto :goto_1

    .line 35
    :goto_0
    new-instance p2, Ljava/io/IOException;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const-string v0, "unable to fill out origin field in "

    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {p2, p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw p2

    .line 51
    :goto_1
    new-instance p2, Ljava/io/IOException;

    .line 52
    .line 53
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const-string v0, " has no origin field?"

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-direct {p2, p1, p0}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    .line 65
    .line 66
    throw p2
.end method

.method private writeObject(Ljava/io/ObjectOutputStream;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/io/ObjectOutputStream;->defaultWriteObject()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/typesafe/config/ConfigException;->origin:L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;

    .line 5
    .line 6
    invoke-static {p1, p0}, Lcom/typesafe/config/impl/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪世兰哲苏(Ljava/io/ObjectOutputStream;L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public origin()L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/typesafe/config/ConfigException;->origin:L飘花落叶言楪兰世子苏哲/飘花落叶言子楪世兰哲苏;

    .line 2
    .line 3
    return-object p0
.end method
