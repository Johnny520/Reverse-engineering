.class public abstract Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Default"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodExit;,
        Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default$ForMethodEnter;
    }
.end annotation


# instance fields
.field protected final exitType:Lnet/bytebuddy/description/type/TypeDefinition;

.field protected final instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

.field protected final namedTypes:Ljava/util/SortedMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/SortedMap<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;"
        }
    .end annotation
.end field

.field protected final typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/method/MethodDescription$TypeToken;Lnet/bytebuddy/description/type/TypeDefinition;Ljava/util/SortedMap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription$TypeToken;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            "Ljava/util/SortedMap<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/type/TypeDefinition;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->exitType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 9
    .line 10
    iput-object p4, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->namedTypes:Ljava/util/SortedMap;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public argument(I)I
    .locals 0

    .line 1
    return p1
.end method

.method public enter()I
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->exitType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 8
    .line 9
    invoke-static {v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Lnet/bytebuddy/description/type/TypeDefinition;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->namedTypes:Ljava/util/SortedMap;

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    add-int/2addr p0, v0

    .line 24
    return p0
.end method

.method public exit()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public named(Ljava/lang/String;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->instrumentedMethod:Lnet/bytebuddy/description/method/MethodDescription;

    .line 2
    .line 3
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->getStackSize()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->exitType:Lnet/bytebuddy/description/type/TypeDefinition;

    .line 8
    .line 9
    invoke-static {v1, v0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子楪世兰哲苏(Lnet/bytebuddy/description/type/TypeDefinition;I)I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$ArgumentHandler$ForAdvice$Default;->namedTypes:Ljava/util/SortedMap;

    .line 14
    .line 15
    invoke-interface {p0, p1}, Ljava/util/SortedMap;->headMap(Ljava/lang/Object;)Ljava/util/SortedMap;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Ljava/util/SortedMap;->values()Ljava/util/Collection;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    add-int/2addr p0, v0

    .line 28
    return p0
.end method
