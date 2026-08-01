.class public interface abstract Lnet/bytebuddy/asm/MemberSubstitution$Replacement;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Replacement"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForFirstBinding;,
        Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForDynamicInvocation;,
        Lnet/bytebuddy/asm/MemberSubstitution$Replacement$ForElementMatchers;,
        Lnet/bytebuddy/asm/MemberSubstitution$Replacement$NoOp;,
        Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;,
        Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Factory;,
        Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;
    }
.end annotation


# virtual methods
.method public abstract bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/field/FieldDescription;Z)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;
.end method

.method public abstract bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/MemberSubstitution$Replacement$InvocationType;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;
.end method

.method public abstract bind(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/utility/JavaConstant$MethodType;Ljava/lang/String;Ljava/util/List;)Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodType;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lnet/bytebuddy/utility/JavaConstant;",
            ">;)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Replacement$Binding;"
        }
    .end annotation
.end method
