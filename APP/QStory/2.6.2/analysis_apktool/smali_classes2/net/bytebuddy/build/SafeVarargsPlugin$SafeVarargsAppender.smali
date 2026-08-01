.class public final enum Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;
.implements Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/SafeVarargsPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "SafeVarargsAppender"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;",
        ">;",
        "Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;",
        "Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender$Factory;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;

.field public static final enum INSTANCE:Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;->INSTANCE:Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;->$VALUES:[Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;->$VALUES:[Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/build/SafeVarargsPlugin$SafeVarargsAppender;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public apply(Lnet/bytebuddy/jar/asm/MethodVisitor;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V
    .locals 0

    .line 1
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$ForMethodDescription;->isVarArgs()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_3

    .line 6
    .line 7
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_1

    .line 12
    .line 13
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    if-nez p0, :cond_1

    .line 18
    .line 19
    invoke-interface {p2}, Lnet/bytebuddy/description/ModifierReviewable;->isFinal()Z

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    if-eqz p0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p0, " is neither a constructor or final and cannot declare safe varargs"

    .line 27
    .line 28
    invoke-static {p2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :cond_1
    :goto_0
    const-string p0, "Ljava/lang/SafeVarargs;"

    .line 33
    .line 34
    const/4 p2, 0x1

    .line 35
    invoke-virtual {p1, p0, p2}, Lnet/bytebuddy/jar/asm/MethodVisitor;->visitAnnotation(Ljava/lang/String;Z)Lnet/bytebuddy/jar/asm/AnnotationVisitor;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    if-eqz p0, :cond_2

    .line 40
    .line 41
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/AnnotationVisitor;->visitEnd()V

    .line 42
    .line 43
    .line 44
    :cond_2
    return-void

    .line 45
    :cond_3
    const-string p0, " does not have variable arguments"

    .line 46
    .line 47
    invoke-static {p2, p0}, Llin/xposed/hook/javaplugin/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public make(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/attribute/MethodAttributeAppender;
    .locals 0

    .line 1
    return-object p0
.end method
