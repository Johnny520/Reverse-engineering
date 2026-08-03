.class public final La/b3;
.super La/X1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/b3$a;
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Integer;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;

.field public final g:Ljava/util/ArrayList;

.field public final h:La/Me;

.field public final i:La/Me;

.field public final j:La/Me;


# direct methods
.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIILjava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, La/X1;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    iput p4, p0, La/b3;->b:I

    .line 3
    iput-object p5, p0, La/b3;->c:Ljava/lang/String;

    .line 4
    iput-object p6, p0, La/b3;->d:Ljava/lang/Integer;

    .line 5
    iput-object p7, p0, La/b3;->e:Ljava/util/ArrayList;

    .line 6
    iput-object p8, p0, La/b3;->f:Ljava/util/ArrayList;

    .line 7
    iput-object p9, p0, La/b3;->g:Ljava/util/ArrayList;

    .line 8
    new-instance p4, La/y0;

    const/4 p5, 0x1

    invoke-direct {p4, p0, p5}, La/y0;-><init>(La/X1;I)V

    .line 9
    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    .line 10
    iput-object p5, p0, La/b3;->h:La/Me;

    .line 11
    new-instance p4, La/c3;

    invoke-direct {p4, p0, p1, p3}, La/c3;-><init>(La/b3;Lorg/luckypray/dexkit/DexKitBridge;I)V

    .line 12
    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    .line 13
    iput-object p5, p0, La/b3;->i:La/Me;

    .line 14
    new-instance p4, La/c3;

    const/4 p5, 0x1

    invoke-direct {p4, p1, p0, p3, p5}, La/c3;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/b3;II)V

    .line 15
    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    .line 16
    iput-object p5, p0, La/b3;->j:La/Me;

    .line 17
    new-instance p4, La/c3;

    const/4 p5, 0x2

    invoke-direct {p4, p1, p0, p3, p5}, La/c3;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/b3;II)V

    .line 18
    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    .line 19
    new-instance p4, La/c3;

    const/4 p5, 0x0

    invoke-direct {p4, p1, p0, p3, p5}, La/c3;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/b3;II)V

    .line 20
    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    .line 21
    new-instance v0, La/mb;

    const/16 v5, 0x8

    move-object v2, p0

    move-object v1, p1

    move v4, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, La/mb;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/X1;III)V

    .line 22
    new-instance p1, La/Me;

    invoke-direct {p1, v0}, La/Me;-><init>(La/s7;)V

    return-void
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, La/b3;->h:La/Me;

    invoke-virtual {v0}, La/Me;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/X4;

    iget-object v0, v0, La/X4;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La/b3;

    if-eqz v1, :cond_1

    check-cast p1, La/b3;

    iget-object p1, p1, La/b3;->c:Ljava/lang/String;

    iget-object v1, p0, La/b3;->c:Ljava/lang/String;

    invoke-static {v1, p1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, La/b3;->c:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, La/b3;->b:I

    if-lez v1, :cond_0

    invoke-static {v1}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, La/b3;->b()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "class "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/b3;->i:La/Me;

    invoke-virtual {v1}, La/Me;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/b3;

    if-eqz v1, :cond_1

    const-string v2, " extends "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, La/b3;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    iget-object v1, p0, La/b3;->e:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_2

    const-string v1, " implements "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La/b3;->j:La/Me;

    invoke-virtual {v1}, La/Me;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/d3;

    sget-object v2, La/b3$b;->b:La/b3$b;

    const/16 v3, 0x1e

    const-string v4, ", "

    invoke-static {v1, v4, v2, v3}, La/t3;->p0(Ljava/util/Collection;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
