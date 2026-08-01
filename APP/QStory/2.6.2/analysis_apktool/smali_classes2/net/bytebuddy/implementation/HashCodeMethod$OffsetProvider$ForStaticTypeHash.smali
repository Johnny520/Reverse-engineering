.class public final enum Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ForStaticTypeHash"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;",
        ">;",
        "Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;

.field public static final enum INSTANCE:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;->INSTANCE:Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;->$VALUES:[Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;->$VALUES:[Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public resolve(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 3

    .line 1
    new-instance p0, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 2
    .line 3
    invoke-static {p1}, Lnet/bytebuddy/implementation/bytecode/constant/ClassConstant;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {}, Lnet/bytebuddy/implementation/HashCodeMethod;->access$000()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-class v1, Ljava/lang/Class;

    .line 16
    .line 17
    invoke-static {v1}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-interface {v0, v1}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;->virtual(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const/4 v1, 0x2

    .line 26
    new-array v1, v1, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    aput-object p1, v1, v2

    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    aput-object v0, v1, p1

    .line 33
    .line 34
    invoke-direct {p0, v1}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 35
    .line 36
    .line 37
    return-object p0
.end method
