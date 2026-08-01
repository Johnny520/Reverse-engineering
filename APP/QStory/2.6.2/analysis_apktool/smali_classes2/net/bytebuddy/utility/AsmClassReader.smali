.class public interface abstract Lnet/bytebuddy/utility/AsmClassReader;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/AsmClassReader$ForClassFileApi;,
        Lnet/bytebuddy/utility/AsmClassReader$ForAsm;,
        Lnet/bytebuddy/utility/AsmClassReader$Factory;
    }
.end annotation


# static fields
.field public static final NO_ATTRIBUTES:[Lnet/bytebuddy/jar/asm/Attribute;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [Lnet/bytebuddy/jar/asm/Attribute;

    .line 3
    .line 4
    sput-object v0, Lnet/bytebuddy/utility/AsmClassReader;->NO_ATTRIBUTES:[Lnet/bytebuddy/jar/asm/Attribute;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public abstract accept(Lnet/bytebuddy/jar/asm/ClassVisitor;I)V
.end method

.method public abstract getInterfaceInternalNames()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getInternalName()Ljava/lang/String;
.end method

.method public abstract getModifiers()I
.end method

.method public abstract getSuperClassInternalName()Ljava/lang/String;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract unwrap(Ljava/lang/Class;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method
