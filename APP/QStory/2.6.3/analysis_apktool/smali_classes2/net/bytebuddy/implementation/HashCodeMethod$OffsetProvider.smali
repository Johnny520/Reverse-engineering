.class public interface abstract Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/HashCodeMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "OffsetProvider"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForDynamicTypeHash;,
        Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForStaticTypeHash;,
        Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForSuperMethodCall;,
        Lnet/bytebuddy/implementation/HashCodeMethod$OffsetProvider$ForFixedValue;
    }
.end annotation


# virtual methods
.method public abstract resolve(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method
