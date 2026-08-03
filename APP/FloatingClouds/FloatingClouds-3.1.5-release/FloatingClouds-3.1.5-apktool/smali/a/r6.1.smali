.class public final La/r6;
.super La/X1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La/r6$a;
    }
.end annotation


# instance fields
.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:La/Me;

.field public final g:La/Me;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;IIIILjava/lang/String;I)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, La/X1;-><init>(Lorg/luckypray/dexkit/DexKitBridge;II)V

    iput p4, p0, La/r6;->b:I

    iput p5, p0, La/r6;->c:I

    iput-object p6, p0, La/r6;->d:Ljava/lang/String;

    iput p7, p0, La/r6;->e:I

    new-instance p4, La/r6$d;

    invoke-direct {p4, p0}, La/r6$d;-><init>(La/r6;)V

    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    iput-object p5, p0, La/r6;->f:La/Me;

    new-instance p4, La/r6$c;

    invoke-direct {p4, p1, p0, p3}, La/r6$c;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/r6;I)V

    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    new-instance p4, La/r6$f;

    invoke-direct {p4, p1, p0, p3}, La/r6$f;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/r6;I)V

    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    iput-object p5, p0, La/r6;->g:La/Me;

    new-instance p4, La/r6$b;

    invoke-direct {p4, p1, p0, p3, p2}, La/r6$b;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/r6;II)V

    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    new-instance p4, La/r6$e;

    invoke-direct {p4, p1, p0, p3, p2}, La/r6$e;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/r6;II)V

    new-instance p5, La/Me;

    invoke-direct {p5, p4}, La/Me;-><init>(La/s7;)V

    new-instance p4, La/r6$g;

    invoke-direct {p4, p1, p0, p3, p2}, La/r6$g;-><init>(Lorg/luckypray/dexkit/DexKitBridge;La/r6;II)V

    new-instance p1, La/Me;

    invoke-direct {p1, p4}, La/Me;-><init>(La/s7;)V

    return-void
.end method


# virtual methods
.method public final b()La/Y4;
    .locals 1

    iget-object v0, p0, La/r6;->f:La/Me;

    invoke-virtual {v0}, La/Me;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/Y4;

    return-object v0
.end method

.method public final c()La/b3;
    .locals 1

    iget-object v0, p0, La/r6;->g:La/Me;

    invoke-virtual {v0}, La/Me;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/b3;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, La/r6;

    if-eqz v1, :cond_1

    check-cast p1, La/r6;

    iget-object p1, p1, La/r6;->d:Ljava/lang/String;

    iget-object v1, p0, La/r6;->d:Ljava/lang/String;

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

    iget-object v0, p0, La/r6;->d:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, " "

    iget v2, p0, La/r6;->c:I

    if-lez v2, :cond_0

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
    invoke-virtual {p0}, La/r6;->b()La/Y4;

    move-result-object v2

    iget-object v2, v2, La/Y4;->c:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, La/r6;->b()La/Y4;

    move-result-object v1

    iget-object v1, v1, La/Y4;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, La/r6;->b()La/Y4;

    move-result-object v1

    iget-object v1, v1, La/Y4;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "StringBuilder().apply(builderAction).toString()"

    invoke-static {v0, v1}, La/i9;->d(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
