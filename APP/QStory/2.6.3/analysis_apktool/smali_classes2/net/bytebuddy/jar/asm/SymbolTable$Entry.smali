.class final Lnet/bytebuddy/jar/asm/SymbolTable$Entry;
.super Lnet/bytebuddy/jar/asm/Symbol;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/jar/asm/SymbolTable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Entry"
.end annotation


# instance fields
.field final hashCode:I

.field next:Lnet/bytebuddy/jar/asm/SymbolTable$Entry;


# direct methods
.method public constructor <init>(IIJI)V
    .locals 8

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-wide v6, p3

    .line 21
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/jar/asm/Symbol;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 22
    iput p5, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;I)V
    .locals 8

    .line 1
    const/4 v4, 0x0

    .line 2
    const-wide/16 v6, 0x0

    .line 3
    .line 4
    const/4 v3, 0x0

    .line 5
    move-object v0, p0

    .line 6
    move v1, p1

    .line 7
    move v2, p2

    .line 8
    move-object v5, p3

    .line 9
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/jar/asm/Symbol;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 10
    .line 11
    .line 12
    iput p4, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    .line 13
    .line 14
    return-void
.end method

.method public constructor <init>(IILjava/lang/String;JI)V
    .locals 8

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v5, p3

    move-wide v6, p4

    .line 17
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/jar/asm/Symbol;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 18
    iput p6, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;I)V
    .locals 8

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v4, p3

    move-object v5, p4

    .line 19
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/jar/asm/Symbol;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 20
    iput p5, v0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;JI)V
    .locals 0

    .line 15
    invoke-direct/range {p0 .. p7}, Lnet/bytebuddy/jar/asm/Symbol;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V

    .line 16
    iput p8, p0, Lnet/bytebuddy/jar/asm/SymbolTable$Entry;->hashCode:I

    return-void
.end method
