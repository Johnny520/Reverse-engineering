.class public final Lbsh/org/objectweb/asm/Handle;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private final descriptor:Ljava/lang/String;

.field private final isInterface:Z

.field private final name:Ljava/lang/String;

.field private final owner:Ljava/lang/String;

.field private final tag:I


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 7
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    :goto_0
    move-object v1, p0

    .line 7
    move v2, p1

    .line 8
    move-object v3, p2

    .line 9
    move-object v4, p3

    .line 10
    move-object v5, p4

    .line 11
    move v6, v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    goto :goto_0

    .line 15
    :goto_1
    invoke-direct/range {v1 .. v6}, Lbsh/org/objectweb/asm/Handle;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput p1, p0, Lbsh/org/objectweb/asm/Handle;->tag:I

    .line 21
    iput-object p2, p0, Lbsh/org/objectweb/asm/Handle;->owner:Ljava/lang/String;

    .line 22
    iput-object p3, p0, Lbsh/org/objectweb/asm/Handle;->name:Ljava/lang/String;

    .line 23
    iput-object p4, p0, Lbsh/org/objectweb/asm/Handle;->descriptor:Ljava/lang/String;

    .line 24
    iput-boolean p5, p0, Lbsh/org/objectweb/asm/Handle;->isInterface:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lbsh/org/objectweb/asm/Handle;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lbsh/org/objectweb/asm/Handle;

    .line 12
    .line 13
    iget v1, p0, Lbsh/org/objectweb/asm/Handle;->tag:I

    .line 14
    .line 15
    iget v3, p1, Lbsh/org/objectweb/asm/Handle;->tag:I

    .line 16
    .line 17
    if-ne v1, v3, :cond_2

    .line 18
    .line 19
    iget-boolean v1, p0, Lbsh/org/objectweb/asm/Handle;->isInterface:Z

    .line 20
    .line 21
    iget-boolean v3, p1, Lbsh/org/objectweb/asm/Handle;->isInterface:Z

    .line 22
    .line 23
    if-ne v1, v3, :cond_2

    .line 24
    .line 25
    iget-object v1, p0, Lbsh/org/objectweb/asm/Handle;->owner:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v3, p1, Lbsh/org/objectweb/asm/Handle;->owner:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    iget-object v1, p0, Lbsh/org/objectweb/asm/Handle;->name:Ljava/lang/String;

    .line 36
    .line 37
    iget-object v3, p1, Lbsh/org/objectweb/asm/Handle;->name:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    iget-object v1, p0, Lbsh/org/objectweb/asm/Handle;->descriptor:Ljava/lang/String;

    .line 46
    .line 47
    iget-object p1, p1, Lbsh/org/objectweb/asm/Handle;->descriptor:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    return v0

    .line 56
    :cond_2
    return v2
.end method

.method public getDesc()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Handle;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Handle;->name:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getOwner()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/org/objectweb/asm/Handle;->owner:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public getTag()I
    .locals 1

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/Handle;->tag:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    .line 1
    iget v0, p0, Lbsh/org/objectweb/asm/Handle;->tag:I

    .line 2
    .line 3
    iget-boolean v1, p0, Lbsh/org/objectweb/asm/Handle;->isInterface:Z

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    const/16 v1, 0x40

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v1, 0x0

    .line 11
    :goto_0
    add-int/2addr v0, v1

    .line 12
    iget-object v1, p0, Lbsh/org/objectweb/asm/Handle;->owner:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    iget-object v2, p0, Lbsh/org/objectweb/asm/Handle;->name:Ljava/lang/String;

    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    mul-int/2addr v2, v1

    .line 25
    iget-object v1, p0, Lbsh/org/objectweb/asm/Handle;->descriptor:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    mul-int/2addr v1, v2

    .line 32
    add-int/2addr v1, v0

    .line 33
    return v1
.end method

.method public isInterface()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/org/objectweb/asm/Handle;->isInterface:Z

    .line 2
    .line 3
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lbsh/org/objectweb/asm/Handle;->owner:Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    const/16 v1, 0x2e

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Lbsh/org/objectweb/asm/Handle;->name:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    iget-object v1, p0, Lbsh/org/objectweb/asm/Handle;->descriptor:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v1, " ("

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    iget v1, p0, Lbsh/org/objectweb/asm/Handle;->tag:I

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-boolean v1, p0, Lbsh/org/objectweb/asm/Handle;->isInterface:Z

    .line 37
    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    const-string v1, " itf"

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const-string v1, ""

    .line 44
    .line 45
    :goto_0
    const/16 v2, 0x29

    .line 46
    .line 47
    invoke-static {v0, v1, v2}, Leh/a;->q(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
.end method
