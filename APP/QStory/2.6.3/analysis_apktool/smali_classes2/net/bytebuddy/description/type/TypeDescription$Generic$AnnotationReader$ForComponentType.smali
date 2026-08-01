.class public Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$ForComponentType;
.super Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator$Chained;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForComponentType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$ForComponentType$AnnotatedParameterizedType;
    }
.end annotation


# static fields
.field private static final ANNOTATED_PARAMETERIZED_TYPE:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$ForComponentType$AnnotatedParameterizedType;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$ForComponentType$AnnotatedParameterizedType;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$ForComponentType$AnnotatedParameterizedType;

    .line 12
    .line 13
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$ForComponentType;->ANNOTATED_PARAMETERIZED_TYPE:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$ForComponentType$AnnotatedParameterizedType;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator$Chained;-><init>(Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic resolve()Ljava/lang/reflect/AnnotatedElement;
    .locals 0

    .line 20
    invoke-super {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$Delegator$Chained;->resolve()Ljava/lang/reflect/AnnotatedElement;

    move-result-object p0

    return-object p0
.end method

.method public resolve(Ljava/lang/reflect/AnnotatedElement;)Ljava/lang/reflect/AnnotatedElement;
    .locals 1

    .line 1
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$ForComponentType;->ANNOTATED_PARAMETERIZED_TYPE:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$ForComponentType$AnnotatedParameterizedType;

    .line 2
    .line 3
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$ForComponentType$AnnotatedParameterizedType;->isInstance(Ljava/lang/reflect/AnnotatedElement;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$NoOp;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$NoOp;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    :try_start_0
    invoke-interface {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$ForComponentType$AnnotatedParameterizedType;->getAnnotatedGenericComponentType(Ljava/lang/reflect/AnnotatedElement;)Ljava/lang/reflect/AnnotatedElement;

    .line 13
    .line 14
    .line 15
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    return-object p0

    .line 17
    :catch_0
    sget-object p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$NoOp;->INSTANCE:Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader$NoOp;

    .line 18
    .line 19
    return-object p0
.end method
