.class public interface abstract Lnet/bytebuddy/description/type/TypeDescription$Generic;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/description/type/TypeDefinition;
.implements Lnet/bytebuddy/description/annotation/AnnotationSource;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Generic"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/TypeDescription$Generic$Builder;,
        Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProjection;,
        Lnet/bytebuddy/description/type/TypeDescription$Generic$OfTypeVariable;,
        Lnet/bytebuddy/description/type/TypeDescription$Generic$OfParameterizedType;,
        Lnet/bytebuddy/description/type/TypeDescription$Generic$OfWildcardType;,
        Lnet/bytebuddy/description/type/TypeDescription$Generic$OfGenericArray;,
        Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType;,
        Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProxy;,
        Lnet/bytebuddy/description/type/TypeDescription$Generic$AbstractBase;,
        Lnet/bytebuddy/description/type/TypeDescription$Generic$AnnotationReader;,
        Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;
    }
.end annotation


# static fields
.field public static final ANNOTATION:Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final CLASS:Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final OBJECT:Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Lnet/bytebuddy/utility/nullability/AlwaysNull;
    .end annotation
.end field

.field public static final VOID:Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-class v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProxy;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic;->OBJECT:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 8
    .line 9
    const-class v0, Ljava/lang/Class;

    .line 10
    .line 11
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProxy;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic;->CLASS:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 16
    .line 17
    sget-object v0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 18
    .line 19
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProxy;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic;->VOID:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 24
    .line 25
    const-class v0, Ljava/lang/annotation/Annotation;

    .line 26
    .line 27
    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$LazyProxy;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic;->ANNOTATION:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 32
    .line 33
    const/4 v0, 0x0

    .line 34
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public abstract accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "TT;>;)TT;"
        }
    .end annotation
.end method

.method public abstract asRawType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
.end method

.method public abstract findBindingOf(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getComponentType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/field/FieldList<",
            "Lnet/bytebuddy/description/field/FieldDescription$InGenericShape;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/method/MethodList<",
            "Lnet/bytebuddy/description/method/MethodDescription$InGenericShape;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getLowerBounds()Lnet/bytebuddy/description/type/TypeList$Generic;
.end method

.method public abstract getOwnerType()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract getRecordComponents()Lnet/bytebuddy/description/type/RecordComponentList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lnet/bytebuddy/description/type/RecordComponentList<",
            "Lnet/bytebuddy/description/type/RecordComponentDescription$InGenericShape;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getSymbol()Ljava/lang/String;
.end method

.method public abstract getTypeArguments()Lnet/bytebuddy/description/type/TypeList$Generic;
.end method

.method public abstract getTypeVariableSource()Lnet/bytebuddy/description/TypeVariableSource;
.end method

.method public abstract getUpperBounds()Lnet/bytebuddy/description/type/TypeList$Generic;
.end method
