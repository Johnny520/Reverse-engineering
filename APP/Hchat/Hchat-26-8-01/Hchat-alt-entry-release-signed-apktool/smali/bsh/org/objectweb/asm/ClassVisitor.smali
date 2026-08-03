.class public abstract Lbsh/org/objectweb/asm/ClassVisitor;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field protected final api:I

.field protected cv:Lbsh/org/objectweb/asm/ClassVisitor;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    const/4 v0, 0x0

    .line 27
    invoke-direct {p0, p1, v0}, Lbsh/org/objectweb/asm/ClassVisitor;-><init>(ILbsh/org/objectweb/asm/ClassVisitor;)V

    return-void
.end method

.method public constructor <init>(ILbsh/org/objectweb/asm/ClassVisitor;)V
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
    iput p1, p0, Lbsh/org/objectweb/asm/ClassVisitor;->api:I

    .line 23
    .line 24
    iput-object p2, p0, Lbsh/org/objectweb/asm/ClassVisitor;->cv:Lbsh/org/objectweb/asm/ClassVisitor;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassVisitor;->cv:Lbsh/org/objectweb/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move v1, p1

    .line 6
    move v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    move-object v6, p6

    .line 11
    invoke-virtual/range {v0 .. v6}, Lbsh/org/objectweb/asm/ClassVisitor;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public visitAttribute(Lbsh/org/objectweb/asm/Attribute;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassVisitor;->cv:Lbsh/org/objectweb/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lbsh/org/objectweb/asm/ClassVisitor;->visitAttribute(Lbsh/org/objectweb/asm/Attribute;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitEnd()V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassVisitor;->cv:Lbsh/org/objectweb/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Lbsh/org/objectweb/asm/ClassVisitor;->visitEnd()V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lbsh/org/objectweb/asm/FieldVisitor;
    .locals 6

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassVisitor;->cv:Lbsh/org/objectweb/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/ClassVisitor;->visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lbsh/org/objectweb/asm/FieldVisitor;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return-object p1
.end method

.method public visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassVisitor;->cv:Lbsh/org/objectweb/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3, p4}, Lbsh/org/objectweb/asm/ClassVisitor;->visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbsh/org/objectweb/asm/MethodVisitor;
    .locals 6

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassVisitor;->cv:Lbsh/org/objectweb/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move v1, p1

    .line 6
    move-object v2, p2

    .line 7
    move-object v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/ClassVisitor;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbsh/org/objectweb/asm/MethodVisitor;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :cond_0
    const/4 p1, 0x0

    .line 16
    return-object p1
.end method

.method public visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassVisitor;->cv:Lbsh/org/objectweb/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lbsh/org/objectweb/asm/ClassVisitor;->visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method

.method public visitSource(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/ClassVisitor;->cv:Lbsh/org/objectweb/asm/ClassVisitor;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1, p2}, Lbsh/org/objectweb/asm/ClassVisitor;->visitSource(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    :cond_0
    return-void
.end method
