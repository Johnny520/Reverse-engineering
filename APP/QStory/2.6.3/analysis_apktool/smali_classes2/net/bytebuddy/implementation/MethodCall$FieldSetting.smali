.class public Lnet/bytebuddy/implementation/MethodCall$FieldSetting;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation$Composable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/MethodCall;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "FieldSetting"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/MethodCall$FieldSetting$Appender;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final methodCall:Lnet/bytebuddy/implementation/MethodCall;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/implementation/MethodCall;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public andThen(Lnet/bytebuddy/implementation/Implementation$Composable;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 1

    .line 18
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;

    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    invoke-direct {v0, p0, p1}, Lnet/bytebuddy/implementation/Implementation$Compound$Composable;-><init>(Lnet/bytebuddy/implementation/Implementation;Lnet/bytebuddy/implementation/Implementation$Composable;)V

    return-object v0
.end method

.method public andThen(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/implementation/Implementation;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Compound;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    new-array v1, v1, [Lnet/bytebuddy/implementation/Implementation;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aput-object p0, v1, v2

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    aput-object p1, v1, p0

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/Implementation$Compound;-><init>([Lnet/bytebuddy/implementation/Implementation;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Compound;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodCall;->appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 p1, 0x2

    .line 10
    new-array p1, p1, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    aput-object p0, p1, v1

    .line 14
    .line 15
    sget-object p0, Lnet/bytebuddy/implementation/MethodCall$FieldSetting$Appender;->INSTANCE:Lnet/bytebuddy/implementation/MethodCall$FieldSetting$Appender;

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    aput-object p0, p1, v1

    .line 19
    .line 20
    invoke-direct {v0, p1}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 21
    .line 22
    .line 23
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodCall;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 12
    .line 13
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/MethodCall;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/implementation/MethodCall;->prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;->methodCall:Lnet/bytebuddy/implementation/MethodCall;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lnet/bytebuddy/implementation/MethodCall;->withAssigner(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/Implementation$Composable;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lnet/bytebuddy/implementation/MethodCall;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lnet/bytebuddy/implementation/MethodCall$FieldSetting;-><init>(Lnet/bytebuddy/implementation/MethodCall;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method
