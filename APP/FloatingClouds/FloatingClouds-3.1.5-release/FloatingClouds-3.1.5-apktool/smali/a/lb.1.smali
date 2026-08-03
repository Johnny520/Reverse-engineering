.class public final La/lb;
.super La/X1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/lb$a;
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Ljava/util/ArrayList;

.field public final g:La/Me;

.field public final h:La/Me;

.field public final i:La/Me;


# direct methods
.method public constructor <init>()V
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;ILjava/util/ArrayList;)V
    .locals 6

    .line 1
    invoke-direct {p0, p1, p2, p3}, La/X1;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    .line 2
    iput p4, p0, La/lb;->b:I

    .line 3
    iput p5, p0, La/lb;->c:I

    .line 4
    iput-object p6, p0, La/lb;->d:Ljava/lang/String;

    .line 5
    iput p7, p0, La/lb;->e:I

    .line 6
    iput-object p8, p0, La/lb;->f:Ljava/util/ArrayList;

    .line 7
    new-instance p4, La/y0;

    const/4 p5, 0x2

    invoke-direct {p4, p0, p5}, La/y0;-><init>(La/X1;I)V

    .line 8
    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    .line 9
    iput-object p5, p0, La/lb;->g:La/Me;

    .line 10
    new-instance p4, La/nb;

    const/4 p5, 0x0

    invoke-direct {p4, p1, p0, p3, p5}, La/nb;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/lb;II)V

    .line 11
    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    .line 12
    new-instance p4, La/nb;

    const/4 p5, 0x2

    invoke-direct {p4, p1, p0, p3, p5}, La/nb;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/lb;II)V

    .line 13
    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    .line 14
    new-instance p4, La/nb;

    const/4 p5, 0x1

    invoke-direct {p4, p1, p0, p3, p5}, La/nb;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/lb;II)V

    .line 15
    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    .line 16
    new-instance v0, La/mb;

    const/4 v5, 0x5

    move-object v2, p0

    move-object v1, p1

    move v4, p2

    move v3, p3

    invoke-direct/range {v0 .. v5}, La/mb;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/X1;III)V

    move-object p2, v1

    move p4, v3

    move p5, v4

    .line 17
    new-instance p1, La/Me;

    invoke-direct {p1, v0}, La/Me;-><init>(La/s7;)V

    .line 18
    new-instance p1, La/mb;

    const/4 p6, 0x0

    move-object p3, p0

    invoke-direct/range {p1 .. p6}, La/mb;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/X1;III)V

    .line 19
    new-instance p3, La/Me;

    invoke-direct {p3, p1}, La/Me;-><init>(La/s7;)V

    .line 20
    new-instance p1, La/mb;

    const/4 p6, 0x4

    move-object p3, p0

    invoke-direct/range {p1 .. p6}, La/mb;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/X1;III)V

    .line 21
    new-instance p3, La/Me;

    invoke-direct {p3, p1}, La/Me;-><init>(La/s7;)V

    .line 22
    new-instance p1, La/mb;

    const/4 p6, 0x3

    move-object p3, p0

    invoke-direct/range {p1 .. p6}, La/mb;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/X1;III)V

    .line 23
    new-instance p3, La/Me;

    invoke-direct {p3, p1}, La/Me;-><init>(La/s7;)V

    .line 24
    new-instance p1, La/mb;

    const/4 p6, 0x1

    move-object p3, p0

    invoke-direct/range {p1 .. p6}, La/mb;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/X1;III)V

    .line 25
    new-instance p3, La/Me;

    invoke-direct {p3, p1}, La/Me;-><init>(La/s7;)V

    .line 26
    new-instance p1, La/mb;

    const/4 p6, 0x2

    move-object p3, p0

    invoke-direct/range {p1 .. p6}, La/mb;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/X1;III)V

    .line 27
    new-instance p3, La/Me;

    invoke-direct {p3, p1}, La/Me;-><init>(La/s7;)V

    .line 28
    new-instance p1, La/mb;

    const/4 p6, 0x7

    move-object p3, p0

    invoke-direct/range {p1 .. p6}, La/mb;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/X1;III)V

    .line 29
    new-instance p6, La/Me;

    invoke-direct {p6, p1}, La/Me;-><init>(La/s7;)V

    .line 30
    iput-object p6, p3, La/lb;->h:La/Me;

    .line 31
    new-instance p1, La/mb;

    const/4 p6, 0x6

    invoke-direct/range {p1 .. p6}, La/mb;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/X1;III)V

    .line 32
    new-instance p2, La/Me;

    invoke-direct {p2, p1}, La/Me;-><init>(La/s7;)V

    .line 33
    iput-object p2, p3, La/lb;->i:La/Me;

    return-void
.end method


# virtual methods
.method public final b()La/f5;
    .locals 1

    iget-object v0, p0, La/lb;->g:La/Me;

    invoke-virtual {v0}, La/Me;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/f5;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La/lb;

    if-eqz v1, :cond_1

    check-cast p1, La/lb;

    iget-object p1, p1, La/lb;->d:Ljava/lang/String;

    iget-object v1, p0, La/lb;->d:Ljava/lang/String;

    invoke-static {p1, v1}, La/i9;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, La/lb;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " "

    iget v2, p0, La/lb;->c:I

    if-eqz v2, :cond_0

    invoke-static {v2}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0}, La/lb;->b()La/f5;

    move-result-object v2

    iget-object v2, v2, La/f5;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, La/lb;->b()La/f5;

    move-result-object v1

    iget-object v1, v1, La/f5;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, La/lb;->b()La/f5;

    move-result-object v1

    iget-object v1, v1, La/f5;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, La/lb;->b()La/f5;

    move-result-object v1

    iget-object v1, v1, La/f5;->c:Ljava/util/ArrayList;

    const-string v2, ", "

    const/4 v3, 0x0

    const/16 v4, 0x3e

    invoke-static {v1, v2, v3, v4}, La/t3;->p0(Ljava/util/Collection;Ljava/lang/String;La/D7;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
