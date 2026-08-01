.class public Lnet/bytebuddy/asm/TypeConstantAdjustment$TypeConstantDissolvingClassVisitor$TypeConstantDissolvingMethodVisitor;
.super Lnet/bytebuddy/jar/asm/MethodVisitor;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/TypeConstantAdjustment$TypeConstantDissolvingClassVisitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "TypeConstantDissolvingMethodVisitor"
.end annotation


# static fields
.field private static final DESCRIPTOR:Ljava/lang/String; = "(Ljava/lang/String;)Ljava/lang/Class;"

.field private static final FOR_NAME:Ljava/lang/String; = "forName"

.field private static final JAVA_LANG_CLASS:Ljava/lang/String; = "java/lang/Class"


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 1

    .line 1
    sget v0, Lnet/bytebuddy/utility/OpenedClassReader;->ASM_API:I

    .line 2
    .line 3
    invoke-direct {p0, v0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;-><init>(ILnet/bytebuddy/jar/asm/MethodVisitor;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public visitLdcInsn(Ljava/lang/Object;)V
    .locals 6

    .line 1
    instance-of v0, p1, Lnet/bytebuddy/jar/asm/Type;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lnet/bytebuddy/jar/asm/Type;

    .line 7
    .line 8
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getSort()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    const/16 v2, 0x9

    .line 13
    .line 14
    if-eq v1, v2, :cond_1

    .line 15
    .line 16
    const/16 v2, 0xa

    .line 17
    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    :cond_0
    move-object v0, p0

    .line 21
    goto :goto_0

    .line 22
    :cond_1
    invoke-virtual {v0}, Lnet/bytebuddy/jar/asm/Type;->getInternalName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    const/16 v0, 0x2f

    .line 27
    .line 28
    const/16 v1, 0x2e

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-super {p0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    const-string v4, "(Ljava/lang/String;)Ljava/lang/Class;"

    .line 38
    .line 39
    const/4 v5, 0x0

    .line 40
    const/16 v1, 0xb8

    .line 41
    .line 42
    const-string v2, "java/lang/Class"

    .line 43
    .line 44
    const-string v3, "forName"

    .line 45
    .line 46
    move-object v0, p0

    .line 47
    invoke-super/range {v0 .. v5}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :goto_0
    invoke-super {v0, p1}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return-void
.end method
