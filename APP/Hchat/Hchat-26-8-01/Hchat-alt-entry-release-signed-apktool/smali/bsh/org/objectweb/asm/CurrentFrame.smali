.class final Lbsh/org/objectweb/asm/CurrentFrame;
.super Lbsh/org/objectweb/asm/Frame;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public constructor <init>(Lbsh/org/objectweb/asm/Label;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lbsh/org/objectweb/asm/Frame;-><init>(Lbsh/org/objectweb/asm/Label;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lbsh/org/objectweb/asm/Frame;->execute(IILbsh/org/objectweb/asm/Symbol;Lbsh/org/objectweb/asm/SymbolTable;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lbsh/org/objectweb/asm/Frame;

    .line 5
    .line 6
    const/4 p2, 0x0

    .line 7
    invoke-direct {p1, p2}, Lbsh/org/objectweb/asm/Frame;-><init>(Lbsh/org/objectweb/asm/Label;)V

    .line 8
    .line 9
    .line 10
    const/4 p2, 0x0

    .line 11
    invoke-virtual {p0, p4, p1, p2}, Lbsh/org/objectweb/asm/Frame;->merge(Lbsh/org/objectweb/asm/SymbolTable;Lbsh/org/objectweb/asm/Frame;I)Z

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, p1}, Lbsh/org/objectweb/asm/Frame;->copyFrom(Lbsh/org/objectweb/asm/Frame;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
