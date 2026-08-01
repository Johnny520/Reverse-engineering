.class public interface abstract Lnet/bytebuddy/asm/Advice$PostProcessor$Factory;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$PostProcessor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$PostProcessor$Factory$Compound;
    }
.end annotation


# virtual methods
.method public abstract make(Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription;Z)Lnet/bytebuddy/asm/Advice$PostProcessor;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/annotation/AnnotationDescription;",
            ">;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Z)",
            "Lnet/bytebuddy/asm/Advice$PostProcessor;"
        }
    .end annotation
.end method
