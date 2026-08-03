.class final Lorg/luckypray/dexkit/util/InstanceUtil$getClassInstance$1;
.super LYue/ۥ۠ۦۨ۟;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠۠ۨ;


# annotations
.annotation runtime LYue/ۥۡۡ۠ۤ;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0006\u0012\u0002\u0008\u00030\u0001H\n\u00a2\u0006\u0002\u0008\u0002"
    }
    d2 = {
        "<anonymous>",
        "Ljava/lang/Class;",
        "invoke"
    }
    k = 0x3
    mv = {
        0x1,
        0x5,
        0x1
    }
    xi = 0x30
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/util/InstanceUtil;->getClassInstance(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e6\u06e8\u06df;",
        "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
        "Ljava/lang/Class<",
        "*>;>;"
    }
.end annotation


# instance fields
.field final synthetic $classLoader:Ljava/lang/ClassLoader;

.field final synthetic $typeName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    .locals 0

    iput-object p1, p0, Lorg/luckypray/dexkit/util/InstanceUtil$getClassInstance$1;->$typeName:Ljava/lang/String;

    iput-object p2, p0, Lorg/luckypray/dexkit/util/InstanceUtil$getClassInstance$1;->$classLoader:Ljava/lang/ClassLoader;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LYue/ۥ۠ۦۨ۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Class;
    .locals 6
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lorg/luckypray/dexkit/util/InstanceUtil$getClassInstance$1;->$typeName:Ljava/lang/String;

    const/4 v1, 0x0

    move v2, v1

    .line 3
    :goto_0
    const-string v3, "[]"

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-static {v0, v3, v1, v5, v4}, LYue/ۥۢ۠ۢۤ;->ۥ۟۠ۡۡ(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    add-int/lit8 v2, v2, 0x1

    .line 4
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    sub-int/2addr v3, v5

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    const-string v3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)"

    invoke-static {v0, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    .line 5
    :cond_0
    invoke-static {}, Lorg/luckypray/dexkit/util/InstanceUtil;->access$getPrimitiveMap$p()Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    if-nez v3, :cond_1

    iget-object v3, p0, Lorg/luckypray/dexkit/util/InstanceUtil$getClassInstance$1;->$classLoader:Ljava/lang/ClassLoader;

    invoke-virtual {v3, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    .line 6
    :cond_1
    const-string v0, "baseClass"

    invoke-static {v3, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠(Ljava/lang/Object;Ljava/lang/String;)V

    move v0, v1

    :goto_1
    if-ge v0, v2, :cond_2

    .line 7
    invoke-static {v3, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return-object v3
.end method

.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/util/InstanceUtil$getClassInstance$1;->invoke()Ljava/lang/Class;

    move-result-object v0

    return-object v0
.end method
