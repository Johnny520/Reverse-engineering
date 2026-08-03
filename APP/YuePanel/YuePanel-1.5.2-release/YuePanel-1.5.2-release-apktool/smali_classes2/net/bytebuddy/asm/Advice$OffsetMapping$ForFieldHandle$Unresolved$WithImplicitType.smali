.class public Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved$WithImplicitType;
.super Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WithImplicitType"
.end annotation


# direct methods
.method public constructor <init>(Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Unresolved;-><init>(Lnet/bytebuddy/asm/Advice$OffsetMapping$ForFieldHandle$Access;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public fieldLocator(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/FieldLocator;
    .locals 1

    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy;

    invoke-direct {v0, p1}, Lnet/bytebuddy/dynamic/scaffold/FieldLocator$ForClassHierarchy;-><init>(Lnet/bytebuddy/description/type/TypeDescription;)V

    return-object v0
.end method
