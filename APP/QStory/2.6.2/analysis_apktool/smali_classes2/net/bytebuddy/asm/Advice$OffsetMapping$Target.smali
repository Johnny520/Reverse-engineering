.class public interface abstract Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "Target"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;,
        Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForField;,
        Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForArray;,
        Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForVariable;,
        Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForDefaultValue;,
        Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$AbstractReadOnlyAdapter;
    }
.end annotation


# virtual methods
.method public abstract resolveIncrement(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method

.method public abstract resolveRead()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method

.method public abstract resolveWrite()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
.end method
