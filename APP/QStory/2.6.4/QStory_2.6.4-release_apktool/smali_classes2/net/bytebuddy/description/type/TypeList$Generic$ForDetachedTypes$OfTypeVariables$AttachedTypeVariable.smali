.class public Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$OfTypeVariables$AttachedTypeVariable;
.super Lnet/bytebuddy/description/type/TypeDescription$Generic$OfTypeVariable;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$OfTypeVariables;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "AttachedTypeVariable"
.end annotation


# instance fields
.field private final typeVariableSource:Lnet/bytebuddy/description/TypeVariableSource;

.field private final typeVariableToken:Lnet/bytebuddy/description/type/TypeVariableToken;

.field private final visitor:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/TypeVariableSource;Lnet/bytebuddy/description/type/TypeVariableToken;Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/TypeVariableSource;",
            "Lnet/bytebuddy/description/type/TypeVariableToken;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfTypeVariable;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$OfTypeVariables$AttachedTypeVariable;->typeVariableSource:Lnet/bytebuddy/description/TypeVariableSource;

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$OfTypeVariables$AttachedTypeVariable;->typeVariableToken:Lnet/bytebuddy/description/type/TypeVariableToken;

    .line 7
    .line 8
    iput-object p3, p0, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$OfTypeVariables$AttachedTypeVariable;->visitor:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$OfTypeVariables$AttachedTypeVariable;->typeVariableToken:Lnet/bytebuddy/description/type/TypeVariableToken;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeVariableToken;->getAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getSymbol()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$OfTypeVariables$AttachedTypeVariable;->typeVariableToken:Lnet/bytebuddy/description/type/TypeVariableToken;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/description/type/TypeVariableToken;->getSymbol()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getTypeVariableSource()Lnet/bytebuddy/description/TypeVariableSource;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$OfTypeVariables$AttachedTypeVariable;->typeVariableSource:Lnet/bytebuddy/description/TypeVariableSource;

    .line 2
    .line 3
    return-object p0
.end method

.method public getUpperBounds()Lnet/bytebuddy/description/type/TypeList$Generic;
    .locals 1

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$OfTypeVariables$AttachedTypeVariable;->typeVariableToken:Lnet/bytebuddy/description/type/TypeVariableToken;

    .line 2
    .line 3
    invoke-virtual {v0}, Lnet/bytebuddy/description/type/TypeVariableToken;->getBounds()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$ForDetachedTypes$OfTypeVariables$AttachedTypeVariable;->visitor:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;

    .line 8
    .line 9
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/type/TypeList$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method
