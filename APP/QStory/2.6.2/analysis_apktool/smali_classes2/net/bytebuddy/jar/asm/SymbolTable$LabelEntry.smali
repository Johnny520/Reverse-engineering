.class final Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/jar/asm/SymbolTable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "LabelEntry"
.end annotation


# instance fields
.field final index:I

.field final label:Lnet/bytebuddy/jar/asm/Label;

.field next:Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;


# direct methods
.method public constructor <init>(ILnet/bytebuddy/jar/asm/Label;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;->index:I

    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/jar/asm/SymbolTable$LabelEntry;->label:Lnet/bytebuddy/jar/asm/Label;

    .line 7
    .line 8
    return-void
.end method
