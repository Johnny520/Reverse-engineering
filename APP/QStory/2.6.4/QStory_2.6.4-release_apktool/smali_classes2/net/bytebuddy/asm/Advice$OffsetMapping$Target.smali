.class public interface abstract Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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
