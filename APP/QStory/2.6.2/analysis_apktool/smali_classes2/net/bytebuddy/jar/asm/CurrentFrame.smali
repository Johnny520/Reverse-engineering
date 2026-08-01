.class final Lnet/bytebuddy/jar/asm/CurrentFrame;
.super Lnet/bytebuddy/jar/asm/Frame;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/Label;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lnet/bytebuddy/jar/asm/Frame;-><init>(Lnet/bytebuddy/jar/asm/Label;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lnet/bytebuddy/jar/asm/Frame;->execute(IILnet/bytebuddy/jar/asm/Symbol;Lnet/bytebuddy/jar/asm/SymbolTable;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lnet/bytebuddy/jar/asm/Frame;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-direct {p1, p2}, Lnet/bytebuddy/jar/asm/Frame;-><init>(Lnet/bytebuddy/jar/asm/Label;)V

    .line 8
    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-virtual {p0, p4, p1, p2}, Lnet/bytebuddy/jar/asm/Frame;->merge(Lnet/bytebuddy/jar/asm/SymbolTable;Lnet/bytebuddy/jar/asm/Frame;I)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lnet/bytebuddy/jar/asm/Frame;->copyFrom(Lnet/bytebuddy/jar/asm/Frame;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
