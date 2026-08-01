.class public abstract Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue;
.super Lnet/bytebuddy/utility/JavaConstant$Simple;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/JavaConstant$Simple;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "OfTrivialValue"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForString;,
        Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForDouble;,
        Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForFloat;,
        Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForLong;,
        Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForInteger;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lnet/bytebuddy/utility/JavaConstant$Simple<",
        "TS;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDescription;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/utility/JavaConstant$Simple;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDescription;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public accept(Lnet/bytebuddy/utility/JavaConstant$Visitor;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lnet/bytebuddy/utility/JavaConstant$Visitor<",
            "TT;>;)TT;"
        }
    .end annotation

    .line 1
    invoke-interface {p1, p0}, Lnet/bytebuddy/utility/JavaConstant$Visitor;->onValue(Lnet/bytebuddy/utility/JavaConstant$Simple;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public toDescription()Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    .line 2
    .line 3
    return-object p0
.end method
