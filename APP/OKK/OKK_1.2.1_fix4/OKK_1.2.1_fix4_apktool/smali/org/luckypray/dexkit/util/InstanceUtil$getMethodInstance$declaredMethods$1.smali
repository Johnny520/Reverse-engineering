.class final Lorg/luckypray/dexkit/util/InstanceUtil$getMethodInstance$declaredMethods$1;
.super LQ0/h;
.source "SourceFile"

# interfaces
.implements LP0/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/luckypray/dexkit/util/InstanceUtil;->getMethodInstance(Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/wrap/DexMethod;)Ljava/lang/reflect/Method;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LQ0/h;",
        "LP0/a;"
    }
.end annotation


# instance fields
.field final synthetic $clz:LQ0/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LQ0/m;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LQ0/m;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LQ0/m;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lorg/luckypray/dexkit/util/InstanceUtil$getMethodInstance$declaredMethods$1;->$clz:LQ0/m;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, LQ0/h;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lorg/luckypray/dexkit/util/InstanceUtil$getMethodInstance$declaredMethods$1;->invoke()[Ljava/lang/reflect/Method;

    move-result-object v0

    return-object v0
.end method

.method public final invoke()[Ljava/lang/reflect/Method;
    .locals 2

    .line 2
    iget-object v0, p0, Lorg/luckypray/dexkit/util/InstanceUtil$getMethodInstance$declaredMethods$1;->$clz:LQ0/m;

    iget-object v0, v0, LQ0/m;->a:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    move-result-object v0

    const-string v1, "clz.declaredMethods"

    invoke-static {v0, v1}, LQ0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
