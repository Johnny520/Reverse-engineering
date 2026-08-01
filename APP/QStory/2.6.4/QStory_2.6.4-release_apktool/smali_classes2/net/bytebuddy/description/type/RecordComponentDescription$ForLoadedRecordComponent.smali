.class public Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;
.super Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/RecordComponentDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForLoadedRecordComponent"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field protected static final RECORD_COMPONENT:Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;


# instance fields
.field private final recordComponent:Ljava/lang/reflect/AnnotatedElement;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "java.security.AccessController"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "net.bytebuddy.securitymanager"

    .line 9
    .line 10
    const-string v2, "true"

    .line 11
    .line 12
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sput-boolean v1, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/4 v0, 0x1

    .line 24
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    const-class v0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;

    .line 27
    .line 28
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;

    .line 37
    .line 38
    sput-object v0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->RECORD_COMPONENT:Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;

    .line 39
    .line 40
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/AnnotatedElement;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->recordComponent:Ljava/lang/reflect/AnnotatedElement;

    .line 5
    .line 6
    return-void
.end method

.method private static doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/security/PrivilegedAction<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->ACCESS_CONTROLLER:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static of(Ljava/lang/Object;)Lnet/bytebuddy/description/type/RecordComponentDescription;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->RECORD_COMPONENT:Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;->isInstance(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;

    .line 10
    .line 11
    check-cast p0, Ljava/lang/reflect/AnnotatedElement;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;-><init>(Ljava/lang/reflect/AnnotatedElement;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    const-string v0, "Not a record component: "

    .line 18
    .line 19
    invoke-static {p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method


# virtual methods
.method public getAccessor()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->RECORD_COMPONENT:Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->recordComponent:Ljava/lang/reflect/AnnotatedElement;

    .line 6
    .line 7
    invoke-interface {v1, p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;->getAccessor(Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/method/MethodDescription$ForLoadedMethod;-><init>(Ljava/lang/reflect/Method;)V

    .line 12
    .line 13
    .line 14
    return-object v0
.end method

.method public bridge synthetic getAccessor()Lnet/bytebuddy/description/method/MethodDescription;
    .locals 0

    .line 15
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->getAccessor()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    move-result-object p0

    return-object p0
.end method

.method public getActualName()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->RECORD_COMPONENT:Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->recordComponent:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;->getName(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->recordComponent:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/lang/reflect/AnnotatedElement;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;-><init>([Ljava/lang/annotation/Annotation;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;
    .locals 0
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 14
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object p0

    return-object p0
.end method

.method public getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;
    .locals 1
    .annotation runtime Ljavax/annotation/Nonnull;
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->RECORD_COMPONENT:Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->recordComponent:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;->getDeclaringRecord(Ljava/lang/Object;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public getGenericSignature()Ljava/lang/String;
    .locals 1
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->RECORD_COMPONENT:Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->recordComponent:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent$RecordComponent;->getGenericSignature(Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProjection$OfRecordComponent;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/RecordComponentDescription$ForLoadedRecordComponent;->recordComponent:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProjection$OfRecordComponent;-><init>(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-object v0
.end method
