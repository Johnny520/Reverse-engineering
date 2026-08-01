.class public interface abstract Lnet/bytebuddy/implementation/bytecode/assign/Assigner;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Refusing;,
        Lnet/bytebuddy/implementation/bytecode/assign/Assigner$EqualTypesOnly;,
        Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;
    }
.end annotation


# static fields
.field public static final DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

.field public static final GENERICS_AWARE:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/VoidAwareAssigner;

    .line 2
    .line 3
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveTypeAwareAssigner;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/assign/reference/ReferenceTypeAwareAssigner;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/assign/reference/ReferenceTypeAwareAssigner;

    .line 6
    .line 7
    invoke-direct {v1, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveTypeAwareAssigner;-><init>(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/VoidAwareAssigner;-><init>(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->DEFAULT:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 14
    .line 15
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/assign/primitive/VoidAwareAssigner;

    .line 16
    .line 17
    new-instance v1, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveTypeAwareAssigner;

    .line 18
    .line 19
    sget-object v2, Lnet/bytebuddy/implementation/bytecode/assign/reference/GenericTypeAwareAssigner;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/assign/reference/GenericTypeAwareAssigner;

    .line 20
    .line 21
    invoke-direct {v1, v2}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/PrimitiveTypeAwareAssigner;-><init>(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)V

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/bytecode/assign/primitive/VoidAwareAssigner;-><init>(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;)V

    .line 25
    .line 26
    .line 27
    sput-object v0, Lnet/bytebuddy/implementation/bytecode/assign/Assigner;->GENERICS_AWARE:Lnet/bytebuddy/implementation/bytecode/assign/Assigner;

    .line 28
    .line 29
    return-void
.end method


# virtual methods
.method public abstract assign(Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method
