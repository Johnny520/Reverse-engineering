.class public final enum Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "UsingUnsafe"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;",
        ">;",
        "Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

.field public static final enum JDK_INTERNAL_MISC_UNSAFE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

.field public static final enum SUN_MISC_UNSAFE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;


# instance fields
.field private final type:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

    const/4 v1, 0x0

    const-string v2, "jdk/internal/misc/Unsafe"

    const-string v3, "JDK_INTERNAL_MISC_UNSAFE"

    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->JDK_INTERNAL_MISC_UNSAFE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

    new-instance v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

    const/4 v2, 0x1

    const-string v3, "sun/misc/Unsafe"

    const-string v4, "SUN_MISC_UNSAFE"

    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->SUN_MISC_UNSAFE:Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

    filled-new-array {v0, v1}, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

    move-result-object v0

    sput-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->type:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;
    .locals 1

    const-class v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;
    .locals 1

    sget-object v0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->$VALUES:[Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

    invoke-virtual {v0}, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;

    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 10

    iget-object v2, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->type:Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "()L"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/16 v1, 0xb8

    const-string v3, "getUnsafe"

    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v0, 0x3a

    const/16 v1, 0xb

    invoke-virtual {p1, v0, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/16 v2, 0x19

    invoke-virtual {p1, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v3, 0x0

    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const-string v8, "()Ljava/lang/Class;"

    const/4 v9, 0x0

    const/16 v5, 0xb6

    const-string v6, "java/lang/invoke/MethodHandles$Lookup"

    const-string v7, "lookupClass"

    move-object v4, p1

    invoke-virtual/range {v4 .. v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v3, 0x9

    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    const/4 v3, 0x1

    invoke-virtual {p1, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitInsn(I)V

    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->type:Ljava/lang/String;

    const-string v8, "(Ljava/lang/Class;[B[Ljava/lang/Object;)Ljava/lang/Class;"

    const-string v7, "defineAnonymousClass"

    invoke-virtual/range {v4 .. v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    const/16 v3, 0xa

    invoke-virtual {p1, v0, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {p1, v2, v1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    invoke-virtual {p1, v2, v3}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitVarInsn(II)V

    iget-object v6, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->type:Ljava/lang/String;

    const-string v8, "(Ljava/lang/Class;)V"

    const-string v7, "ensureClassInitialized"

    invoke-virtual/range {v4 .. v9}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    return-void
.end method

.method public getLocalVariableLength()I
    .locals 1

    const/16 v0, 0xd

    return v0
.end method

.method public getStackSize()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/agent/builder/AgentBuilder$LambdaInstrumentationStrategy$LambdaMetafactoryFactory$Loader$UsingUnsafe;->type:Ljava/lang/String;

    return-object v0
.end method
