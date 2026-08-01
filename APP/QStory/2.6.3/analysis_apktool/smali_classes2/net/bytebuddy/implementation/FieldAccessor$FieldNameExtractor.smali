.class public interface abstract Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/FieldAccessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "FieldNameExtractor"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForFixedValue;,
        Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;
    }
.end annotation


# virtual methods
.method public abstract resolve(Lnet/bytebuddy/description/method/MethodDescription;)Ljava/lang/String;
.end method
