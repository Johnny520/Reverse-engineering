.class public abstract Lbsh/org/objectweb/asm/FieldVisitor;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field protected final api:I

.field protected fv:Lbsh/org/objectweb/asm/FieldVisitor;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, v0}, Lbsh/org/objectweb/asm/FieldVisitor;-><init>(ILbsh/org/objectweb/asm/FieldVisitor;)V

    return-void
.end method

.method public constructor <init>(ILbsh/org/objectweb/asm/FieldVisitor;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/high16 v0, 0x60000

    .line 5
    .line 6
    if-eq p1, v0, :cond_1

    .line 7
    .line 8
    const/high16 v0, 0x50000

    .line 9
    .line 10
    if-eq p1, v0, :cond_1

    .line 11
    .line 12
    const/high16 v0, 0x40000

    .line 13
    .line 14
    if-ne p1, v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-static {}, Lj8/o;->o()V

    .line 18
    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    throw p1

    .line 22
    :cond_1
    :goto_0
    iput p1, p0, Lbsh/org/objectweb/asm/FieldVisitor;->api:I

    .line 23
    .line 24
    iput-object p2, p0, Lbsh/org/objectweb/asm/FieldVisitor;->fv:Lbsh/org/objectweb/asm/FieldVisitor;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public visitAttribute(Lbsh/org/objectweb/asm/Attribute;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/FieldVisitor;->fv:Lbsh/org/objectweb/asm/FieldVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/FieldVisitor;->visitAttribute(Lbsh/org/objectweb/asm/Attribute;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitEnd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/FieldVisitor;->fv:Lbsh/org/objectweb/asm/FieldVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbsh/org/objectweb/asm/FieldVisitor;->visitEnd()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
