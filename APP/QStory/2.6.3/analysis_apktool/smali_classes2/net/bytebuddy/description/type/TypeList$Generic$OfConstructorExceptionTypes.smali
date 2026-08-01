.class public Lnet/bytebuddy/description/type/TypeList$Generic$OfConstructorExceptionTypes;
.super Lnet/bytebuddy/description/type/TypeList$Generic$AbstractBase;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeList$Generic;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "OfConstructorExceptionTypes"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/TypeList$Generic$OfConstructorExceptionTypes$TypeProjection;
    }
.end annotation


# instance fields
.field private final constructor:Ljava/lang/reflect/Constructor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/reflect/Constructor<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/reflect/Constructor<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/type/TypeList$Generic$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfConstructorExceptionTypes;->constructor:Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public asErasures()Lnet/bytebuddy/description/type/TypeList;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfConstructorExceptionTypes;->constructor:Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getExceptionTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;-><init>([Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 14
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeList$Generic$OfConstructorExceptionTypes;->get(I)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    move-result-object p0

    return-object p0
.end method

.method public get(I)Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeList$Generic$OfConstructorExceptionTypes$TypeProjection;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfConstructorExceptionTypes;->constructor:Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getExceptionTypes()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v0, p0, p1, v1, v2}, Lnet/bytebuddy/description/type/TypeList$Generic$OfConstructorExceptionTypes$TypeProjection;-><init>(Ljava/lang/reflect/Constructor;I[Ljava/lang/Class;Lnet/bytebuddy/description/type/TypeList$1;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/description/type/TypeList$Generic$OfConstructorExceptionTypes;->constructor:Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/reflect/Constructor;->getExceptionTypes()[Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    array-length p0, p0

    .line 8
    return p0
.end method
