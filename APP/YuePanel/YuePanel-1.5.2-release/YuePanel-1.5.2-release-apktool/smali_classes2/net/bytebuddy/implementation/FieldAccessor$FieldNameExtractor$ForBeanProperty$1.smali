.class final enum Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty$1;
.super Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/implementation/FieldAccessor$FieldNameExtractor$ForBeanProperty;-><init>(Ljava/lang/String;ILnet/bytebuddy/implementation/FieldAccessor$1;)V

    return-void
.end method


# virtual methods
.method public resolve(C)C
    .locals 0

    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result p1

    return p1
.end method
